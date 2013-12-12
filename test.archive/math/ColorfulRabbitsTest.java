package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ColorfulRabbitsTest {
    ColorfulRabbits colorfulrabbits = new ColorfulRabbits();

    @Test
    public void case1() {
        int[] replies = { 1, 1, 2, 2 };
        assertEquals(5, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case2() {
        int[] replies = { 0 };
        assertEquals(1, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case3() {
        int[] replies = { 2, 2, 44, 2, 2, 2, 444, 2, 2 };
        assertEquals(499, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case4() {
        int[] replies = { 999951, 999952, 999953, 999954, 999955, 999956, 999957, 999958, 999959, 999960, 999961, 999962, 999963, 999964, 999965, 999966, 999967, 999968, 999969, 999970, 999971, 999972, 999973, 999974, 999975, 999976, 999977, 999978, 999979, 999980, 999981, 999982, 999983, 999984, 999985, 999986, 999987, 999988, 999989, 999990, 999991, 999992, 999993, 999994, 999995, 999996, 999997, 999998, 999999, 1000000 };
        assertEquals(49998825, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case5() {
        int[] replies = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(50, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case6() {
        int[] replies = { 1000000 };
        assertEquals(1000001, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case7() {
        int[] replies = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
        assertEquals(1000001, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case8() {
        int[] replies = { 1 };
        assertEquals(2, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case9() {
        int[] replies = { 1, 1 };
        assertEquals(2, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case10() {
        int[] replies = { 1, 1, 1 };
        assertEquals(4, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case11() {
        int[] replies = { 1, 1, 1, 1 };
        assertEquals(4, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case12() {
        int[] replies = { 1, 1, 1, 1, 1 };
        assertEquals(6, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case13() {
        int[] replies = { 2 };
        assertEquals(3, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case14() {
        int[] replies = { 2, 2 };
        assertEquals(3, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case15() {
        int[] replies = { 2, 2, 2 };
        assertEquals(3, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case16() {
        int[] replies = { 2, 2, 2, 2 };
        assertEquals(6, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case17() {
        int[] replies = { 2, 2, 2, 2, 2 };
        assertEquals(6, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case18() {
        int[] replies = { 3 };
        assertEquals(4, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case19() {
        int[] replies = { 3, 3 };
        assertEquals(4, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case20() {
        int[] replies = { 3, 3, 3 };
        assertEquals(4, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case21() {
        int[] replies = { 3, 3, 3, 3 };
        assertEquals(4, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case22() {
        int[] replies = { 3, 3, 3, 3, 3 };
        assertEquals(8, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case23() {
        int[] replies = { 6, 2, 0, 2, 2, 2, 6, 0, 2, 2, 2, 2, 6, 2, 2, 6, 2, 3, 3, 3, 0, 0, 6, 6, 0 };
        assertEquals(28, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case24() {
        int[] replies = { 0, 0, 0, 0, 4, 4, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0 };
        assertEquals(25, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case25() {
        int[] replies = { 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 0, 21, 21, 21, 21, 21, 0, 21, 21, 21, 21, 21, 21 };
        assertEquals(46, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case26() {
        int[] replies = { 0, 8, 6, 32, 32, 32, 6, 32, 32, 32, 32, 0, 8, 32, 8, 8, 8, 32, 8, 32, 32, 32, 32, 32, 32, 32, 0, 0, 32, 32, 32, 6, 32, 6, 32, 32, 6, 8, 32, 32, 32, 32, 32, 32, 32, 32, 8, 32, 32, 6 };
        assertEquals(53, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case27() {
        int[] replies = { 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1 };
        assertEquals(50, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case28() {
        int[] replies = { 18, 18, 18, 5, 18, 1, 18, 1, 5, 1, 1, 4, 18, 18, 4, 5, 5, 4, 18, 4, 4, 1, 4, 5, 4, 18, 4, 4, 5, 1, 18, 18, 1, 1, 18, 5, 1, 4, 18, 18, 18, 18, 18, 18, 1, 1, 4, 1, 18, 18 };
        assertEquals(77, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case29() {
        int[] replies = { 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707, 9707 };
        assertEquals(9708, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case30() {
        int[] replies = { 1015, 1015, 1795, 1015, 1015, 1795, 1795, 1795, 1015, 1795, 1015, 1795, 1795, 1015, 1795, 1015, 1015, 1015, 1795, 1015, 1015, 1795, 1015, 1795, 1795, 1015, 1795, 1015, 1015, 1015, 1015, 1795, 1795, 1015 };
        assertEquals(2812, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case31() {
        int[] replies = { 76353, 359404, 60108, 236040, 266349, 402005, 41323, 98521, 239957, 236312, 197396, 32070, 45197, 48274, 119251, 429637, 42022, 133902, 236654, 27063, 224078, 367709, 108788, 293494, 353066, 46022, 176902, 405112, 157926, 26777, 254854, 404852, 280761, 187448, 213552, 295237, 273746, 323556, 182315, 350583, 247775, 468576, 53050, 263651, 273305, 33619 };
        assertEquals(9594638, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case32() {
        int[] replies = { 20762, 58420, 54736, 98660, 34578, 31136, 50482, 97674, 95866, 20762, 21553, 12324, 100841, 50482, 59466, 95310, 117057, 53676, 117057, 118736, 54806, 38140, 55732, 41651, 14710, 43490, 55732, 121601, 51185, 27789, 1613, 82088, 54548, 6503, 78206, 68198, 107881, 23480, 87840, 48202, 98660, 51185, 76534, 50482, 5787, 48630, 95866, 102045, 78206, 82088 };
        assertEquals(2361976, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case33() {
        int[] replies = { 400, 39931, 400, 39931, 39931, 13742, 39931, 400, 39931, 39931, 39931, 400, 400, 39931 };
        assertEquals(54076, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case34() {
        int[] replies = { 120788, 120788 };
        assertEquals(120789, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case35() {
        int[] replies = { 26844, 38072, 11455, 11455, 25521, 9711, 38072, 26844, 38943, 36913, 19904, 33061, 25521, 19904, 33061, 33061, 33061, 16464, 26844, 36913, 26844, 38072, 19904, 9711, 11455, 36913, 9711, 11455, 33749, 33749, 33061, 25521, 25521, 26844, 16464, 16464, 33061, 38072, 38943, 38943 };
        assertEquals(290648, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case36() {
        int[] replies = { 460594, 412437, 412437, 460594, 245352, 618221, 245352, 538444, 245352, 343729, 642569, 642569, 246473, 618221, 321138, 642569, 642569, 16281, 460594, 288537, 346279, 288537, 20330, 346279, 20330, 412437, 139090, 245352, 346279, 139090, 618221, 343729, 343729, 16281, 321138, 460594, 139090, 618221, 16281, 346279, 526777, 346279, 246473, 526777 };
        assertEquals(5166266, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case37() {
        int[] replies = { 8393, 13923, 13923, 8393, 19869, 13923 };
        assertEquals(42188, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case38() {
        int[] replies = { 20815, 1039, 23862, 14297, 9782, 21014, 46716, 2655, 49973, 22682, 1458, 13516, 15809, 2796, 23862, 2209, 30098, 13354, 41199, 12801, 15343, 27005, 10845, 2655, 36972, 13700, 30656, 50178, 34175, 36831, 15809, 34434, 1458, 2209, 20399, 3365, 43685, 7370, 15343, 1671, 36364, 36786, 5588, 22682, 26290, 18664, 3376, 50768, 15809 };
        assertEquals(890581, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case39() {
        int[] replies = { 4, 58, 1538, 1132, 4, 726, 1940, 1132, 436, 726, 4, 1132, 58, 1538, 726, 1132, 1538, 1940, 436, 1940, 436, 1925, 1925, 1304, 726, 726, 1538, 4, 1061, 436, 1304, 1061, 726, 58, 1940, 4, 1925 };
        assertEquals(10134, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case40() {
        int[] replies = { 220342, 224323, 201660, 223064, 201660, 102273, 270717, 136484, 102273, 9844, 136484, 20989, 190431, 177427, 15978, 15978, 224323, 136484, 144267, 35791, 9844, 223064, 223181, 190431, 240615, 187222, 223064, 223181, 20989, 270717, 224323, 20989, 220342, 223181, 145093, 220342, 145093, 75779, 75779, 144267, 15978, 224323, 166413, 270717, 177427, 75779, 201660, 240615, 166413, 223181 };
        assertEquals(3011913, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case41() {
        int[] replies = { 13688, 13688, 13369, 13369, 13369, 13369, 7339, 7339 };
        assertEquals(34399, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case42() {
        int[] replies = { 3994, 2964, 4012, 2925, 4012, 1509, 6, 3885, 1509, 1509, 2518, 4082, 4012, 2758, 3297, 3691, 2964, 4082, 870, 6, 4082, 3994, 679, 3297 };
        assertEquals(37204, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case43() {
        int[] replies = { 6963, 6963, 6963, 6963, 6963, 6963, 6963, 6963, 6963, 6963, 6963, 10907, 10907, 10907, 10907, 10907, 10907, 10907, 10907, 10907, 10907, 10907, 10907, 11811, 11811, 11811, 11811, 11811, 11811, 11811, 11811, 11811, 11811, 11811, 11811, 11811, 11811, 11811 };
        assertEquals(29684, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case44() {
        int[] replies = { 19393, 19393, 19393, 19393, 19393, 19393 };
        assertEquals(19394, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case45() {
        int[] replies = { 498, 498, 498, 498, 498, 498, 498, 498, 615, 615, 615, 615, 615, 615, 615, 615, 615, 1567, 1567, 1567, 1567, 1567, 1567, 1576, 1576, 1576, 1576, 1576, 1576, 2318, 2318, 2410, 2410, 2410, 2410, 2410 };
        assertEquals(8990, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case46() {
        int[] replies = { 43220, 43220, 43220, 246091, 246091, 246091, 246091, 265459, 265459, 265459, 275440, 275440, 275440, 313993, 313993, 313993, 314049, 314049, 314049 };
        assertEquals(1458258, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case47() {
        int[] replies = { 63, 63, 757, 757, 2863, 2863, 3858, 3990, 3990, 3990, 3990, 3990, 3990, 3990, 5037, 5252, 5252, 9596, 9596, 9596, 9596, 10096, 10096, 10151, 10151, 10437, 10437, 10437, 10437, 10481, 10481, 10481, 10481, 10481 };
        assertEquals(72593, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case48() {
        int[] replies = { 1831, 1831, 1831, 1831, 1831, 1831, 1389, 1831, 1389, 1831, 555, 555, 654, 1831, 555, 1389, 555, 555, 1389, 1389, 555, 654, 1831, 1389, 654, 654, 1831, 555, 1831, 555, 555, 654, 1389, 1389, 1831, 654, 654, 654, 555, 1389, 555, 1831 };
        assertEquals(4433, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case49() {
        int[] replies = { 70245, 70245, 278800, 128331, 201676, 211692, 78442, 278800, 94667, 12011, 22178, 12011, 256167, 201676, 128331, 105394, 1702, 201676, 55233 };
        assertEquals(1516551, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case50() {
        int[] replies = { 29208 };
        assertEquals(29209, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case51() {
        int[] replies = { 1212, 1212, 3522, 1212, 1212, 1212, 3522, 3522, 1212, 3522, 3522, 3522, 1212, 1212, 3522, 3522, 1212, 3522, 1212, 1212 };
        assertEquals(4736, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case52() {
        int[] replies = { 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322, 3322 };
        assertEquals(3323, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case53() {
        int[] replies = { 2, 2, 44, 2, 2, 2, 444, 2, 2 };
        assertEquals(499, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case54() {
        int[] replies = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(10, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case55() {
        int[] replies = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 44, 44 };
        assertEquals(62, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case56() {
        int[] replies = { 1000000, 1000000, 1000000 };
        assertEquals(1000001, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case57() {
        int[] replies = { 0, 1, 0, 1 };
        assertEquals(4, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case58() {
        int[] replies = { 2, 2, 44, 2, 2, 2, 444, 2, 2, 4, 4, 4, 2, 3, 3 };
        assertEquals(508, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case59() {
        int[] replies = { 0, 1 };
        assertEquals(3, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case60() {
        int[] replies = { 2, 2, 2, 2 };
        assertEquals(6, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case61() {
        int[] replies = { 1, 1, 1, 2, 3, 4, 5 };
        assertEquals(22, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case62() {
        int[] replies = { 0, 0, 0, 0 };
        assertEquals(4, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case63() {
        int[] replies = { 0, 2, 1, 3, 2 };
        assertEquals(10, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case64() {
        int[] replies = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
        assertEquals(15, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case65() {
        int[] replies = { 1, 1, 1, 1, 1 };
        assertEquals(6, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case66() {
        int[] replies = { 0, 0, 0, 0, 0 };
        assertEquals(5, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case67() {
        int[] replies = { 1, 1, 1, 1 };
        assertEquals(4, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case68() {
        int[] replies = { 1, 1, 2, 2 };
        assertEquals(5, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case69() {
        int[] replies = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(12, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case70() {
        int[] replies = { 2, 2, 2, 2, 2 };
        assertEquals(6, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case71() {
        int[] replies = { 1, 1, 2, 2, 1, 1, 1, 1, 1 };
        assertEquals(11, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case72() {
        int[] replies = { 1000000, 1000000 };
        assertEquals(1000001, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case73() {
        int[] replies = { 2, 2, 3, 2, 2, 3, 2, 2 };
        assertEquals(10, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case74() {
        int[] replies = { 1, 2, 1 };
        assertEquals(5, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case75() {
        int[] replies = { 99999, 99999, 1, 2, 999, 9876, 878678 };
        assertEquals(989561, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case76() {
        int[] replies = { 1000000, 100000, 1000000, 50, 158, 500, 10000, 10000, 75124 };
        assertEquals(1185839, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case77() {
        int[] replies = { 5 };
        assertEquals(6, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case78() {
        int[] replies = { 10 };
        assertEquals(11, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case79() {
        int[] replies = { 1000, 1000, 1000 };
        assertEquals(1001, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case80() {
        int[] replies = { 0 };
        assertEquals(1, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case81() {
        int[] replies = { 100, 100, 100, 100, 100, 100 };
        assertEquals(101, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case82() {
        int[] replies = { 5, 5, 5, 5, 5 };
        assertEquals(6, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case83() {
        int[] replies = { 5, 5, 5, 5, 5, 5 };
        assertEquals(6, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case84() {
        int[] replies = { 3, 3, 3, 3 };
        assertEquals(4, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case85() {
        int[] replies = { 4, 4, 4, 4 };
        assertEquals(5, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case86() {
        int[] replies = { 2, 2, 44, 44, 2, 44, 444, 2, 2, 44 };
        assertEquals(496, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case87() {
        int[] replies = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(10, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case88() {
        int[] replies = { 0, 0 };
        assertEquals(2, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case89() {
        int[] replies = { 999 };
        assertEquals(1000, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case90() {
        int[] replies = { 1000000, 999999, 999998, 999997, 999996, 999995, 999994, 999993, 999992, 999991, 999990, 999989, 999988, 999987, 999986, 999985, 999984, 999983, 999982, 999981, 999980, 999979, 999978, 999977, 999976, 999975, 999974, 999973, 999972, 999971, 999970, 999969, 999968, 999967, 999966, 999965, 999964, 999963, 999962, 999961, 999960, 999959, 999958, 999957, 999956, 999955, 999954, 999953, 999952, 999951 };
        assertEquals(49998825, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case91() {
        int[] replies = { 2, 100, 2, 44, 2, 2, 2, 444, 2, 2, 0, 4, 3, 50, 3, 3, 4, 4, 99, 100, 1, 2, 2, 2, 2, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        assertEquals(784, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case92() {
        int[] replies = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        assertEquals(16, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case93() {
        int[] replies = { 5, 6, 7, 8, 9, 10, 11, 12 };
        assertEquals(76, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case94() {
        int[] replies = { 333, 333, 333, 333, 333, 44, 1, 2, 3, 4, 11, 22, 33 };
        assertEquals(462, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case95() {
        int[] replies = { 1, 2, 2, 2, 2 };
        assertEquals(8, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case96() {
        int[] replies = { 1000000 };
        assertEquals(1000001, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case97() {
        int[] replies = { 2, 2, 2, 2, 2, 2 };
        assertEquals(6, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case98() {
        int[] replies = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(27, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case99() {
        int[] replies = { 2, 2, 3 };
        assertEquals(7, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case100() {
        int[] replies = { 1, 1, 1, 1, 1, 1 };
        assertEquals(6, colorfulrabbits.getMinimum(replies));
    }

    @Test
    public void case101() {
        int[] replies = { 20, 20, 20, 20, 20, 20, 20, 20 };
        assertEquals(21, colorfulrabbits.getMinimum(replies));
    }

}
