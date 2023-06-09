package baudelaire.gamelogic;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTest {
    protected boolean equals(boolean[][] array1, boolean[][] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (!Arrays.equals(array1[i], array2[i])) return false;
        }
        return true;
    }

    @Test
    public void testBlinkerOscillator() {
        World world = new World(3, 3);
        world.setWorld(Phases.BLINKER_PHASE_0);
        world.tickWorld();
        assertTrue(equals(Phases.BLINKER_PHASE_1, world.getWorld()));
        world.tickWorld();
        assertTrue(equals(Phases.BLINKER_PHASE_0, world.getWorld()));
    }

    @Test
    public void testBlockStable() {
        World world = new World(2, 2);
        world.setWorld(Phases.BLOCK);
        world.tickWorld();
        assertTrue(equals(Phases.BLOCK, world.getWorld()));
    }

    @Test
    public void testBeeHiveStable() {
        World world = new World(4, 3);
        world.setWorld(Phases.BEE_HIVE);
        world.tickWorld();
        assertTrue(equals(Phases.BEE_HIVE, world.getWorld()));
    }

    @Test
    public void testToadOscillator() {
        World world = new World(4, 4);
        world.setWorld(Phases.TOAD_PHASE_0);
        world.tickWorld();
        assertTrue(equals(Phases.TOAD_PHASE_1, world.getWorld()));
        world.tickWorld();
        assertTrue(equals(Phases.TOAD_PHASE_0, world.getWorld()));
    }

    @Test
    public void testInstantiateWorldValid() {
        assertDoesNotThrow(() -> {
            new World(10, 10);
        });
    }

    @Test
    public void testInstantiateWorldBorderlineValidColumn() {
        assertDoesNotThrow(() -> {
            new World(1, 10);
        });
    }

    @Test
    public void testInstantiateWorldBorderlineValidRow() {
        assertDoesNotThrow(() -> new World(10, 1));
    }

    @Test
    public void testInstantiateWorldBorderlineInvalidColumn() {
        assertThrows(IllegalArgumentException.class, () -> new World(0, 10));
    }

    @Test
    public void testInstantiateWorldBorderlineInvalidRow() {
        assertThrows(IllegalArgumentException.class, () -> new World(10, 0));
    }

    @Test
    public void testInstantiateWorldInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new World(-10, -10));
    }
}

