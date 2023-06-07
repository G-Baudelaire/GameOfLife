package baudelaire.gamelogic;

public class World {
    private final int columns, rows;
    private boolean[][] world;

    public World(int columns, int rows) {
        if (columns < 1 || rows < 1) throw new IllegalArgumentException();
        this.columns = columns;
        this.rows = rows;
        world = new boolean[rows][columns];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (boolean[] array : world) {
            stringBuilder.append("[");
            toStringInnerLoop(array, stringBuilder);
            stringBuilder.append("]\n");
        }
        return stringBuilder.toString();
    }

    private void toStringInnerLoop(boolean[] array, StringBuilder stringBuilder) {
        int endIndex = columns - 1;

        for (int i = 0; i < columns; i++) {
            stringBuilder.append(array[i] ? "●" : "✕");
            if (i != endIndex) stringBuilder.append(" ");
        }
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public boolean[][] getWorldCopy() {
        return world.clone();
    }

    public boolean getCell(int column, int row) {
        return world[row][column];
    }

    public void setCell(boolean alive, int column, int row) {
        world[row][column] = alive;
    }

    public void tickWorld() {
        boolean[][] newWorld = new boolean[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                newWorld[r][c] = tickCell(world[r][c], c, r);
            }
        }
        world = newWorld;
    }

    private int getNumberOfLivingNeighbours(int column, int row) {
        int livingNeighbours = 0;

        for (int c = column - 1; c < column + 2; c++) {
            if (c < 0 || columns <= c) continue;
            livingNeighbours += getNumberOfLivingNeighboursInnerLoop(column, c, row);
        }
        return livingNeighbours;
    }

    private int getNumberOfLivingNeighboursInnerLoop(int column, int c, int row) {
        int livingNeighboursInRow = 0;

        for (int r = row - 1; r < row + 2; r++) {
            if ((r < 0 || rows <= r) || (r == row && c == column)) continue;
            if (world[r][c]) livingNeighboursInRow++;
        }
        return livingNeighboursInRow;
    }

    private boolean tickCell(boolean cell, int column, int row) {
        int livingNeighbours;
        livingNeighbours = getNumberOfLivingNeighbours(column, row);
        return livingNeighbours == 3 || (cell && livingNeighbours == 2);
    }
}
