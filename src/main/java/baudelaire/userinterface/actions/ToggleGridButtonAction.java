package baudelaire.userinterface.actions;

import baudelaire.gamelogic.World;
import baudelaire.userinterface.worldscreen.GridButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class ToggleGridButtonAction implements Action {
    private static World world = null;
    private final GridButton gridButton;


    public ToggleGridButtonAction(GridButton gridButton) {
        this.gridButton = gridButton;
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
        gridButton.toggleAliveState();
        world.setCell(gridButton.isAlive(), gridButton.getColumn(), gridButton.getRow());
        gridButton.invalidate();
        gridButton.validate();
    }

    public static void setWorld(World world) {
        ToggleGridButtonAction.world = world;
    }
}
