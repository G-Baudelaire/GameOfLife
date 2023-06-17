package baudelaire.userinterface.worldscreen;

import javax.swing.*;
import java.awt.*;

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

    public boolean toggleAliveState() {
        alive = !alive;
        setStyle();
        return alive;
    }

    private void setStyle() {
        if (alive) {
            setAliveStyle();
        } else {
            setDeadStyle();
        }
    }

    private void setAliveStyle() {
        setBackground(Color.WHITE);
    }

    private void setDeadStyle() {
        setBackground(Color.BLACK);
    }
}
