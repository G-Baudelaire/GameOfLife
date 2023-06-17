package baudelaire.gamelogic;

import static java.lang.Math.floorMod;

public class ToroidalWorld extends World {

    public ToroidalWorld(int columns, int rows) {
        super(rows, columns);
    }

    @Override
    protected int getNumberOfLivingNeighbours(int column, int row) {
        int livingNeighbours = 0;
        int columnModulus, rowModulus;

        for (int c = column - 1; c < column + 2; c++) {
            columnModulus = floorMod(c, columns);

            for (int r = row - 1; r < row + 2; r++) {
                rowModulus = floorMod(r, rows);
                if (rowModulus == row && columnModulus == column) continue;
                if (world[rowModulus][columnModulus]) livingNeighbours++;
            }
        }
        return livingNeighbours;
    }
}
