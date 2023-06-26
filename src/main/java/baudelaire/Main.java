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
        MainMenuScreen menuScreen = new MainMenuScreen();
        makeInterfaceCrossPlatform();
        createApplicationTitle(menuScreen);
        createMenuButtons(mainWindow, menuScreen);
        showWindow(mainWindow, menuScreen);
    }

    private static void showWindow(MainWindow mainWindow, MainMenuScreen menuScreen) {
        mainWindow.add(menuScreen);
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

    private static void createApplicationTitle(MainMenuScreen menuScreen) {
        menuScreen.add(Box.createRigidArea(new Dimension(0, 50)));
        menuScreen.add(new ApplicationTitleLabel());
    }

    private static void createMenuButtons(MainWindow mainWindow, MainMenuScreen menuScreen) {
        Dimension buttonDistance = new Dimension(0, 15);
        addNewWorldButton(mainWindow, menuScreen, buttonDistance);
        addOpenSavesButton(mainWindow, menuScreen, buttonDistance);
        addQuitButton(menuScreen, buttonDistance);
    }

    private static void addNewWorldButton(MainWindow mainWindow, MainMenuScreen menuScreen, Dimension buttonDistance) {
        NewWorldButton newWorldButton = new NewWorldButton(new StartWorldAction(mainWindow, menuScreen));
        menuScreen.add(Box.createRigidArea(buttonDistance));
        menuScreen.add(newWorldButton);
    }

    private static void addOpenSavesButton(MainWindow mainWindow, MainMenuScreen menuScreen, Dimension buttonDistance) {
        OpenSavesButton openSavesButton = new OpenSavesButton(new OpenSavesAction(mainWindow, menuScreen));
        menuScreen.add(Box.createRigidArea(buttonDistance));
        menuScreen.add(openSavesButton);
    }

    private static void addQuitButton(MainMenuScreen menuScreen, Dimension buttonDistance) {
        QuitApplicationButton quitApplicationButton = new QuitApplicationButton(new QuitApplicationAction());
        menuScreen.add(Box.createRigidArea(buttonDistance));
        menuScreen.add(quitApplicationButton);
    }
}