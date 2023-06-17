package baudelaire.userinterface.actions;

import baudelaire.userinterface.MainWindow;
import baudelaire.userinterface.mainmenuscreen.MainMenuScreen;
import baudelaire.userinterface.savesscreen.SavesScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class OpenSavesAction implements Action {
    private final MainWindow mainWindow;
    private final MainMenuScreen menuScreen;

    public OpenSavesAction(MainWindow mainWindow, MainMenuScreen menuScreen) {
        this.mainWindow = mainWindow;
        this.menuScreen = menuScreen;
    }

    /**
     * Gets one of this object's properties
     * using the associated key.
     *
     * @param key a {@code String} containing the key
     * @return the {@code Object} value
     * @see #putValue
     */
    public Object getValue(String key) {
        return null;
    }

    /**
     * Sets one of this object's properties
     * using the associated key. If the value has
     * changed, a <code>PropertyChangeEvent</code> is sent
     * to listeners.
     *
     * @param key   a <code>String</code> containing the key
     * @param value an <code>Object</code> value
     */
    public void putValue(String key, Object value) {
    }

    /**
     * Returns the enabled state of the {@code Action}. When enabled,
     * any component associated with this object is active and
     * able to fire this object's {@code actionPerformed} method.
     *
     * @return true if this {@code Action} is enabled
     * @see #accept
     */
    public boolean isEnabled() {
        return true;
    }

    /**
     * Sets the enabled state of the {@code Action}.  When enabled,
     * any component associated with this object is active and
     * able to fire this object's {@code actionPerformed} method.
     * If the value has changed, a {@code PropertyChangeEvent} is sent
     * to listeners.
     *
     * @param b true to enable this {@code Action}, false to disable it
     * @see #accept
     */
    public void setEnabled(boolean b) {
    }

    /**
     * Adds a <code>PropertyChange</code> listener. Containers and attached
     * components use these methods to register interest in this
     * <code>Action</code> object. When its enabled state or other property
     * changes, the registered listeners are informed of the change.
     *
     * @param listener a <code>PropertyChangeListener</code> object
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
    }

    /**
     * Removes a <code>PropertyChange</code> listener.
     *
     * @param listener a <code>PropertyChangeListener</code> object
     * @see #addPropertyChangeListener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    public void actionPerformed(ActionEvent e) {
        SavesScreen savesScreen = new SavesScreen();
        mainWindow.remove(menuScreen);
        mainWindow.add(savesScreen);
        mainWindow.validate();
    }
}