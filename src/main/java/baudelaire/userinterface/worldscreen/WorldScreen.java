package baudelaire.userinterface.worldscreen;

import baudelaire.gamelogic.World;
import baudelaire.gamelogic.structures.Phases;

import javax.swing.*;

public class WorldScreen extends JPanel {
    WorldGridPanel gridPanel;

    public WorldScreen() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        World world = new World(Phases.BLINKER_PHASE_0);
        gridPanel = new WorldGridPanel(world);
        add(gridPanel);
    }
}
