package baudelaire.gamelogic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ToroidalWorldTest {
    protected boolean equals(boolean[][] array1, boolean[][] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (!Arrays.equals(array1[i], array2[i])) return false;
        }
        return true;
    }

//  TODO: Implement testing.
}
