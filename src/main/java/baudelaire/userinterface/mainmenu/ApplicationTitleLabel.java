package baudelaire.userinterface.mainmenu;

import baudelaire.userinterface.formatting.ColorScheme;
import baudelaire.userinterface.formatting.Fonts;

import javax.swing.*;
import java.awt.*;

public class ApplicationTitleLabel extends JLabel {
    public ApplicationTitleLabel(){
        setSize(300, 150);
        setText("Conway's Game of Life");
        setFont(Fonts.APPLICATION_TITLE);
        setForeground(ColorScheme.COLOR_FOUR);
        setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
