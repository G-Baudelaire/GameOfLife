package baudelaire.gamelogic;

public class World {
    protected final int columns, rows;
    protected boolean[][] world;

    public World(int rows, int columns) {
        if (rows < 1) throw new IllegalArgumentException("Must have at least 1 row.");
        if (columns < 1) throw new IllegalArgumentException("Must have at least 1 column.");
        this.columns = columns;
        this.rows = rows;
        world = new boolean[rows][columns];
    }

    public World(boolean[][] world) {
        if (world.length < 1) throw new IllegalArgumentException("2D Boolean array must have at least 1 row.");
        if (world[0].length < 1) throw new IllegalArgumentException("2D Boolean array must have at least 1 column.");
        this.world = world.clone();
        this.rows = world.length;
        this.columns = world[0].length;
    }

    /**
     * @return String representation of the world using crosses and circles.
     */
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

    /**
     * Inner loop of toString() has been separated for clarity.
     *
     * @param array         A row of the world.
     * @param stringBuilder StringBuilder object to create the string output.
     */
    protected void toStringInnerLoop(boolean[] array, StringBuilder stringBuilder) {
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

    /**
     * Create a copy of the 2D array.
     *
     * @return 2D array of the world.
     */
    public boolean[][] getWorld() {
        return world.clone();
    }

    /**
     * Replace current 2D array of the world with a new 2D array.
     *
     * @param newWorld 2D boolean array of equal size to the current world.
     */
    protected void setWorld(boolean[][] newWorld) {
        if (newWorld.length == rows) {
            if (newWorld[0].length == columns) {
                world = newWorld;
            } else {
                throw new IllegalArgumentException("Incorrect number of columns.");
            }
        } else throw new IllegalArgumentException("Incorrect number of rows.");
    }

    public boolean getCell(int column, int row) {
        return world[row][column];
    }

    public void setCell(boolean alive, int column, int row) {
        world[row][column] = alive;
    }

    /**
     * Ticks the world once calculating which cells are living or dead and then updating the 2D array representing the
     * world.
     */
    public void tickWorld() {
        boolean[][] newWorld = new boolean[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                newWorld[r][c] = tickCell(world[r][c], c, r);
            }
        }
        world = newWorld;
    }


    /**
     * Tick an individual cell.
     *
     * @param alive  Whether the cell is alive or dead.
     * @param column Column of the cell.
     * @param row    Row of the cell.
     * @return Boolean of whether the cell is alive or dead after a tick.
     */
    protected boolean tickCell(boolean alive, int column, int row) {
        int livingNeighbours = getNumberOfLivingNeighbours(column, row);
        return livingNeighbours == 3 || (alive && livingNeighbours == 2);
    }

    /**
     * Find number of living neighbours a cell has.
     *
     * @param column Column of the cell.
     * @param row    Row of the cell.
     * @return Integer of how many adjacent cells (including diagonal ones) are alive.
     */
    protected int getNumberOfLivingNeighbours(int column, int row) {
        int livingNeighbours = 0;

        for (int c = column - 1; c < column + 2; c++) {
            if (c < 0 || columns <= c) continue;

            for (int r = row - 1; r < row + 2; r++) {
                if ((r < 0 || rows <= r) || (r == row && c == column)) continue;
                if (world[r][c]) livingNeighbours++;
            }
        }
        return livingNeighbours;
    }
}
