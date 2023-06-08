package baudelaire.userinterface;

import baudelaire.userinterface.formatting.Sizing;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Conway's Game of Life");
        setSize(Sizing.WINDOW_DIMENSION);
        setMinimumSize(Sizing.WINDOW_DIMENSION);
        setMaximumSize(Sizing.WINDOW_DIMENSION);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
