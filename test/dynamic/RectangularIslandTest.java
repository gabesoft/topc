package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class RectangularIslandTest {
    double DELTA = 1.0e-09;
    RectangularIsland rectangularisland = new RectangularIsland();

    @Test 
    public void case1() {
        double expected = 0.9868611148475199;
        double actual = rectangularisland.theProbablity(1000, 1000, 123, 456, 5000);
        assertEquals(expected, actual, DELTA * expected);
    }
}
