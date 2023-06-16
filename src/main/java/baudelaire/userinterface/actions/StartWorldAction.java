package baudelaire.userinterface.actions;

import baudelaire.userinterface.MainWindow;
import baudelaire.userinterface.worldscreen.WorldPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class StartWorldAction implements Action {
    private final MainWindow mainWindow;
    private final WorldPanel gamePanel;

    public StartWorldAction(MainWindow mainWindow, WorldPanel worldPanel) {
        this.mainWindow = mainWindow;
        this.gamePanel = worldPanel;
    }

    /**
     * Gets one of this object's properties
     * using the associated key.
     *
     * @param key a {@code String} containing the key
     * @return the {@code Object} value
     * @see #putValue
     */
    @Override
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
    @Override
    public void putValue(String key, Object value) {
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
    @Override
    public void setEnabled(boolean b) {
    }

    /**
     * Returns the enabled state of the {@code Action}. When enabled,
     * any component associated with this object is active and
     * able to fire this object's {@code actionPerformed} method.
     *
     * @return true if this {@code Action} is enabled
     * @see #accept
     */
    @Override
    public boolean isEnabled() {
        return true;
    }

    /**
     * Adds a <code>PropertyChange</code> listener. Containers and attached
     * components use these methods to register interest in this
     * <code>Action</code> object. When its enabled state or other property
     * changes, the registered listeners are informed of the change.
     *
     * @param listener a <code>PropertyChangeListener</code> object
     */
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
    }

    /**
     * Removes a <code>PropertyChange</code> listener.
     *
     * @param listener a <code>PropertyChangeListener</code> object
     * @see #addPropertyChangeListener
     */
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
