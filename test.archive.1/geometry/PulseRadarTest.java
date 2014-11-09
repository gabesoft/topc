package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class PulseRadarTest {
    PulseRadar pulseradar = new PulseRadar();

    @Test
    public void test1() {
        int x1[] = {-8, -7, 9, -5};
        int y1[] = {2, -1, -2, -6};
        int x2[] = {-2, -3, 8, 1};
        int y2[] = {-3, 1, 4, -2};
        int x3[] = {4, 1, 7, 7};
        int y3[] = {-8, 3, 10, 2};
        assertArrayEquals(new int[] { 8,  4,  6,  7 }, pulseradar.deduceSpeeds(x1, y1, x2, y2, x3, y3));
    }

    @Test
    public void test2() {
        int x1[] = {-7, -2, 2, 0};
        int y1[] = {8, -2, -2, -6};
        int x2[] = {-5, -1, 3, -1};
        int y2[] = {9, 1, -4, -8};
        int x3[] = {-3, 1, 5, -2};
        int y3[] = {10, 5, -6, -10};
        assertArrayEquals(new int[0], pulseradar.deduceSpeeds(x1, y1, x2, y2, x3, y3));
    }

    @Test
    public void test3() {
        int x1[] = {-4, -4, -4, -4};
        int y1[] = {9, 3, -1, -7};
        int x2[] = {-1, -1, -1, -1};
        int y2[] = {6, -2, 4, -4};
        int x3[] = {2, 2, 2, 2};
        int y3[] = {3, -7, 9, -1};
        assertArrayEquals(new int[] { }, pulseradar.deduceSpeeds(x1, y1, x2, y2, x3, y3));
    }

    @Test
    public void test4() {
        int x1[] = {5, -4, 2, -1, 8, -4, -8, 3, -3, -4};
        int y1[] = {9, 9, -2, -8, 3, -8, -4, 2, -4, -2};
        int x2[] = {-2, 2, 1, 2, 1, -1, -3, 1, -4, -1};
        int y2[] = {-1, -5, 6, -2, 2, 2, 0, -1, -2, -5};
        int x3[] = {8, 5, -1, -3, 6, -5, 2, 0, -6, -8};
        int y3[] = {4, -2, 2, 3, -5, 2, -8, 0, -5, 2};
        assertArrayEquals(new int[] { 5,  9,  5,  4,  8,  8,  4,  4,  3,  4 }, pulseradar.deduceSpeeds(x1, y1, x2, y2, x3, y3));
    }

    @Test
    public void test5() {
        int x1[] = {-300, 466};
        int y1[] = {-600, 866};
        int x2[] = {466, 100};
        int y2[] = {866, -450};
        int x3[] = {500, 466};
        int y3[] = {-300, 866};
        assertArrayEquals(new int[] { 427,  0 }, pulseradar.deduceSpeeds(x1, y1, x2, y2, x3, y3));
    }

}
