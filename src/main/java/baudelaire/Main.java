package baudelaire;

import baudelaire.userinterface.MainWindow;
import baudelaire.userinterface.formatting.ColorScheme;
import baudelaire.userinterface.mainmenu.ApplicationTitleLabel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MainWindow mainFrame = new MainWindow();
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(ColorScheme.COLOR_ONE);
        makeInterfaceCrossPlatform();

        // Create Carbon Royale Title
        mainPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        mainPanel.add(new ApplicationTitleLabel());
//        createMenuButtons(mainFrame, mainPanel);

        // Show the frame
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private static void makeInterfaceCrossPlatform() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    private static void createMenuButtons(JFrame mainWindow, JPanel mainPanel) {
//        // Create Actions for Buttons
//        StartGameAction startGameAction = new StartGameAction(mainWindow, mainPanel);
//
//        // Create MainMenuButtons
//        Dimension buttonDistance = new Dimension(0, 15);
//        mainPanel.add( Box.createRigidArea( buttonDistance ));
//        mainPanel.add( new MainMenuButton("Start", startGameAction) );
//        mainPanel.add( Box.createRigidArea( buttonDistance ));
//        mainPanel.add( new MainMenuButton("Inventory", inventoryAction) );
//        mainPanel.add( Box.createRigidArea( buttonDistance ));
//        mainPanel.add( new MainMenuButton("Quit", quitGameAction) );
//
//        // Show the frame and centre the window
//        mainWindow.add(mainPanel);
//        mainWindow.pack();
//        mainWindow.setLocationRelativeTo(null);
//        mainWindow.setResizable(false);
//        mainWindow.setVisible(true);
//    }
}