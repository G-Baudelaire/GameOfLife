package baudelaire;

import baudelaire.userinterface.MainWindow;
import baudelaire.userinterface.actions.OpenSavesAction;
import baudelaire.userinterface.actions.QuitApplicationAction;
import baudelaire.userinterface.actions.StartWorldAction;
import baudelaire.userinterface.mainmenuscreen.*;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        MainMenuPanel mainPanel = new MainMenuPanel();
        makeInterfaceCrossPlatform();

        createApplicationTitle(mainPanel);
        createMenuButtons(mainWindow, mainPanel);
        showWindow(mainWindow, mainPanel);
    }

    private static void showWindow(MainWindow mainWindow, MainMenuPanel mainPanel) {
        mainWindow.add(mainPanel);
        mainWindow.pack();
        mainWindow.setVisible(true);
    }

    private static void makeInterfaceCrossPlatform() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createApplicationTitle(JPanel mainPanel) {
        mainPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        mainPanel.add(new ApplicationTitleLabel());
    }

    private static void createMenuButtons(MainWindow mainWindow, JPanel mainMenuPanel) {
        NewWorldButton newWorldButton = new NewWorldButton(new StartWorldAction(mainWindow, null));
        OpenSavesButton openSavesButton = new OpenSavesButton(new OpenSavesAction(mainWindow, null));
        QuitApplicationButton quitApplicationButton = new QuitApplicationButton(new QuitApplicationAction());
        Dimension buttonDistance = new Dimension(0, 15);

        mainMenuPanel.add(Box.createRigidArea(buttonDistance));
        mainMenuPanel.add(newWorldButton);
        mainMenuPanel.add(Box.createRigidArea(buttonDistance));
        mainMenuPanel.add(openSavesButton);
        mainMenuPanel.add(Box.createRigidArea(buttonDistance));
        mainMenuPanel.add(quitApplicationButton);
    }
}