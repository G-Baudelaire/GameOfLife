package baudelaire.userinterface.worldscreen;

import baudelaire.gamelogic.World;
import baudelaire.userinterface.actions.ToggleGridButtonAction;
import baudelaire.userinterface.formatting.Sizing;

import javax.swing.*;
import java.awt.*;

public class WorldGridPanel extends JPanel {
    private final World world;

    public WorldGridPanel(World world) {
        this.world = world;
        setup();
        createButtonsOnGrid();
    }

    private void setup() {
        GridLayout layout = new GridLayout(world.getRows(), world.getColumns());
        setLayout(layout);
        setPreferredSize(Sizing.WORLD_GRID_SIZE);
        setMinimumSize(Sizing.WORLD_GRID_SIZE);
        setSize(Sizing.WORLD_GRID_SIZE);
        setMaximumSize(Sizing.WORLD_GRID_SIZE);
    }

    private void createButtonsOnGrid() {
        ToggleGridButtonAction.setWorld(world);
        for (int row = 0; row < world.getRows(); row++) {
            for (int column = 0; column < world.getColumns(); column++) {
                GridButton button = new GridButton(world.getCell(column, row), row, column);
                ToggleGridButtonAction action = new ToggleGridButtonAction(button);
                button.setAction(action);
                this.add(button);
            }
        }
    }
}
