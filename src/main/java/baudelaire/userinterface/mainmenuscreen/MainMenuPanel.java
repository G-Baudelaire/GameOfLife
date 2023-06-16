package baudelaire.userinterface.mainmenuscreen;

import baudelaire.userinterface.formatting.ColorScheme;

import javax.swing.*;

public class MainMenuPanel extends JPanel {
    public MainMenuPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(ColorScheme.COLOR_ONE);
    }

}
