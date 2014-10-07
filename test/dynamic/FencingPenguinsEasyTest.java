package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FencingPenguinsEasyTest {
    double DELTA = 1.0e-09;
    FencingPenguinsEasy fencingpenguinseasy = new FencingPenguinsEasy();

    @Test
    public void case1() {
        int numPosts = 30;
        int radius = 800;
        int x[] = new int[] {8,2,100,120,52,67,19,-36};
        int y[] = new int[] {-19,12,88,-22,53,66,-140,99};
        assertEquals(384778.74757953023, fencingpenguinseasy.calculateMinArea(numPosts, radius, x, y), DELTA);
    }
}
