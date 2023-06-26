package baudelaire.userinterface.worldscreen;

import baudelaire.gamelogic.World;
import baudelaire.gamelogic.structures.Phases;

import javax.swing.*;
import java.awt.*;

public class WorldScreen extends JPanel {
    WorldGridPanel gridPanel;

    public WorldScreen() {
        setLayout(new BorderLayout(0, 0));
        World world = new World(Phases.BLINKER_PHASE_0);
        gridPanel = new WorldGridPanel(world);
        JToolBar toolBar = new JToolBar();
        toolBar.setPreferredSize(new Dimension(100, 10));
        toolBar.setFloatable(false);
        add(gridPanel, BorderLayout.LINE_START);
        add(toolBar, BorderLayout.LINE_END);
    }
}
