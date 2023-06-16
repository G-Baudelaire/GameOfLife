package baudelaire.userinterface.mainmenuscreen;

import baudelaire.userinterface.formatting.ColorScheme;
import baudelaire.userinterface.formatting.Fonts;

import javax.swing.*;
import java.awt.*;

public class MainMenuButton extends JButton {
    public MainMenuButton(String text, Action action) {
        setAction(action);
        setText(text);
        setFont(Fonts.MAIN_MENU_BUTTON);
        setBackground(ColorScheme.COLOR_FOUR);
        setForeground(ColorScheme.COLOR_FIVE);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setMaximumSize(new Dimension(300, 100));
    }
}
