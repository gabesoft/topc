package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class YetAnotherRobotSimulationTest {
    double DELTA = 1.0e-09;
    YetAnotherRobotSimulation yars = new YetAnotherRobotSimulation();

    @Test
    public void test1() {
        int L = 3;
        int[] locationsX = new int[] { 1, 2, 2 };
        int[] locationsY = new int[] { 1, 1, 0 };
        assertEquals(0.5, yars.getMaximumProbability(L, locationsX, locationsY), DELTA * 0.5);
    }

    @Test
    public void test2() {
        int L = 5;
        int[] locationsX = new int[] { 0, 0, 0, 0 };
        int[] locationsY = new int[] { 0, 1, 2, 3 };
        assertEquals(0.9375, yars.getMaximumProbability(L, locationsX, locationsY), DELTA * 0.9375);
    }

    @Test
    public void test3() {
        int L = 1;
        int[] locationsX = new int[] { 0 };
        int[] locationsY = new int[] { 0 };
        assertEquals(0.5, yars.getMaximumProbability(L, locationsX, locationsY), DELTA * 0.5);
    }

    @Test
    public void test4() {
        int L = 8;
        int[] locationsX = new int[] { 2, 3, 3 };
        int[] locationsY = new int[] { 1, 1, 0 };
        assertEquals(0.41015625, yars.getMaximumProbability(L, locationsX, locationsY), DELTA * 0.41015625);
    }

    @Test
    public void test5() {
        int L = 36;
        int[] locationsX = new int[] {6,7,12,-21,5,5,2,4};
        int[] locationsY = new int[] {4,5,-2,4,5,12,5,7};
        assertEquals(0.1323284485260956, yars.getMaximumProbability(L, locationsX, locationsY), DELTA * 0.1323284485260956);
    }
}
