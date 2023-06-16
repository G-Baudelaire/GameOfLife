package baudelaire.userinterface.mainmenuscreen;

import javax.swing.*;

public class MainMenuButton extends JButton {
    public MainMenuButton(String text, Action action) {
        setText(text);
        setAction(action);
    }
}
