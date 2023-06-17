package baudelaire.userinterface.worldscreen;

import baudelaire.userinterface.formatting.ColorScheme;

import javax.swing.*;

public class GridButton extends JButton {
    private final int row, column;
    private boolean alive;

    public GridButton(boolean alive, int row, int column) {
        this.alive = alive;
        this.row = row;
        this.column = column;

        setStyle();
    }

    public boolean isAlive() {
        return alive;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void toggleAliveState() {
        alive = !alive;
        setStyle();
    }

    private void setStyle() {
        if (alive) {
            setAliveStyle();
        } else {
            setDeadStyle();
        }
    }

    private void setAliveStyle() {
        setBackground(ColorScheme.ALIVE_CELL);
    }

    private void setDeadStyle() {
        setBackground(ColorScheme.DEAD_CELL);
    }
}
