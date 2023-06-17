package baudelaire.gamelogic.structures;

public class Phases {
    public final static boolean[][] BLOCK = {
            {true, true},
            {true, true},
    };
    public final static boolean[][] BEE_HIVE = {
            {false, true, true, false},
            {true, false, false, true},
            {false, true, true, false}
    };
    public final static boolean[][] BLINKER_PHASE_0 = {
            {false, true, false},
            {false, true, false},
            {false, true, false}
    };
    public final static boolean[][] BLINKER_PHASE_1 = {
            {false, false, false},
            {true, true, true},
            {false, false, false}
    };

    public final static boolean[][] TOAD_PHASE_0 = {
            {false, false, false, false},
            {false, true, true, true},
            {true, true, true, false},
            {false, false, false, false},
    };
    public final static boolean[][] TOAD_PHASE_1 = {
            {false, false, true, false},
            {true, false, false, true},
            {true, false, false, true},
            {false, true, false, false},
    };
}
