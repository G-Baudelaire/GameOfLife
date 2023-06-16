package baudelaire.userinterface.mainmenuscreen;

import baudelaire.userinterface.formatting.ColorScheme;

import javax.swing.*;

public class MainMenuScreen extends JPanel {
    public MainMenuScreen() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(ColorScheme.COLOR_ONE);
    }

}
