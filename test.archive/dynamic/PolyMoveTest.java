package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PolyMoveTest {
  double DELTA = 1.0e-09;
  PolyMove polymove = new PolyMove();

  @Test
  public void case1() {
    int[] x = { 0, 1, 2 };
    int[] y = { 0, 1, 0 };
    assertEquals(1.0, polymove.addedArea(x, y), DELTA * 1.0);
  }

  @Test
  public void case2() {
    int[] x = { 0, 1, 1, 0 };
    int[] y = { 1, 1, 0, 0 };
    assertEquals(1.4142135623730951, polymove.addedArea(x, y), DELTA * 1.4142135623730951);
  }

  @Test
  public void case3() {
    int[] x = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] y = { 0, 9, 17, 24, 30, 35, 39, 42, 44, 0 };
    assertEquals(44.798129010506386, polymove.addedArea(x, y), DELTA * 44.798129010506386);
  }

  @Test
  public void case4() {
    int[] x = { 0, 50, 100, 150, 200, 200, 0 };
    int[] y = { 200, 202, 203, 203, 202, 0, 0 };
    assertEquals(296.1807877329639, polymove.addedArea(x, y), DELTA * 296.1807877329639);
  }

  @Test
  public void case5() {
    int[] x = { 0, 2, 19, 30, 29 };
    int[] y = { 0, 300, 300, 1, 0 };
    assertEquals(300.7603622931292, polymove.addedArea(x, y), DELTA * 300.7603622931292);
  }

  @Test
  public void case6() {
    int[] x = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    int[] y = { 0, 25, 49, 72, 94, 115, 135, 154, 172, 189, 205, 220, 234, 247, 259, 270, 280, 289, 297, 304, 310, 315, 319, 322, 324, 325, 325, 324, 322, 319, 315, 310, 304, 297, 289, 280, 270, 259, 247, 234, 220, 205, 189, 172, 154, 135, 115, 94, 72, 49 };
    assertEquals(334.4101403819167, polymove.addedArea(x, y), DELTA * 334.4101403819167);
  }

  @Test
  public void case7() {
    int[] x = { 0, 25, 50, 50, 0 };
    int[] y = { 50, 1000, 50, 0, 0 };
    assertEquals(1000.3124511871279, polymove.addedArea(x, y), DELTA * 1000.3124511871279);
  }

  @Test
  public void case8() {
    int[] x = { 25, 50, 50, 0, 0 };
    int[] y = { 1000, 50, 0, 0, 50 };
    assertEquals(1000.3124511871279, polymove.addedArea(x, y), DELTA * 1000.3124511871279);
  }

  @Test
  public void case9() {
    int[] x = { 0, 0, 20, 40, 60, 40 };
    int[] y = { -1, 10, 20, 29, 0, -20 };
    assertEquals(71.64158982548453, polymove.addedArea(x, y), DELTA * 71.64158982548453);
  }

  @Test
  public void case10() {
    int[] x = { 0, 0, 20, 40, 60, 40, 1 };
    int[] y = { -1, 10, 20, 29, 0, -20, -3 };
    assertEquals(68.78317965096906, polymove.addedArea(x, y), DELTA * 68.78317965096906);
  }

  @Test
  public void case11() {
    int[] x = { 1, 0, 0, 20, 40, 60, 40 };
    int[] y = { -3, -1, 10, 20, 29, 0, -20 };
    assertEquals(68.78317965096906, polymove.addedArea(x, y), DELTA * 68.78317965096906);
  }

  @Test
  public void case12() {
    int[] x = { -691, -690, -672, -662, -644, -638, -620, -598, -571, -558, -540, -526, -507, -493, -473, -453, -435, -423, -406, -400, -390, -383, -373, -368, -361, -354, -352, -350, -900, -900, -899, -898, -893, -891, -885, -882, -881, -863, -844, -837, -824, -798, -777, -755, -733, -723, -714 };
    int[] y = { -733, -733, -734, -735, -737, -738, -742, -748, -758, -763, -771, -778, -788, -797, -810, -826, -842, -854, -873, -881, -895, -906, -926, -937, -957, -980, -988, -999, -900, -880, -868, -862, -839, -834, -821, -815, -814, -797, -783, -778, -770, -758, -749, -742, -737, -735, -734 };
    assertEquals(654.2379198484771, polymove.addedArea(x, y), DELTA * 654.2379198484771);
  }

  @Test
  public void case13() {
    int[] x = { -900, -899, -898, -891, -886, -870, -867, -865, -845, -824, -811, -801, -799, -779, -754, -735, -721, -717, -692, -671, -655, -639, -611, -592, -570, -543, -515, -494, -477, -469, -446, -429, -406, -399, -383, -371, -357, -340, -327, -318, -305, -291, -280, -271, -267, -262, -900 };
    int[] y = { -880, -871, -867, -850, -842, -818, -814, -812, -794, -777, -767, -760, -759, -751, -742, -736, -732, -731, -727, -725, -724, -724, -725, -726, -729, -734, -742, -750, -757, -761, -774, -784, -799, -804, -816, -827, -841, -860, -877, -889, -909, -932, -952, -973, -983, -996, -900 };
    assertEquals(734.8912341349624, polymove.addedArea(x, y), DELTA * 734.8912341349624);
  }

  @Test
  public void case14() {
    int[] x = { -861, -850, -840, -829, -822, -812, -808, -783, -771, -746, -723, -704, -682, -665, -659, -648, -640, -620, -598, -570, -544, -521, -500, -475, -446, -423, -409, -383, -356, -331, -311, -295, -284, -274, -250, -228, -208, -201, -192, -186, -171, -158, -147, -900, -900, -898, -892, -890, -880, -876 };
    int[] y = { -796, -782, -771, -760, -754, -746, -743, -727, -721, -709, -698, -690, -681, -675, -673, -670, -668, -664, -661, -658, -656, -656, -658, -661, -666, -671, -675, -684, -696, -709, -720, -729, -736, -743, -760, -778, -798, -806, -818, -827, -850, -873, -893, -900, -880, -869, -849, -844, -824, -818 };
    assertEquals(845.4355935541583, polymove.addedArea(x, y), DELTA * 845.4355935541583);
  }

  @Test
  public void case15() {
    int[] x = { -821, -810, -792, -777, -764, -747, -738, -712, -697, -671, -644, -638, -630, -617, -595, -587, -562, -554, -533, -514, -505, -498, -489, -473, -469, -462, -900, -900, -899, -898, -890, -868, -862, -841, -831 };
    int[] y = { -824, -821, -818, -816, -815, -815, -816, -820, -823, -829, -836, -838, -841, -846, -856, -860, -875, -881, -901, -920, -930, -938, -950, -973, -979, -991, -900, -880, -873, -872, -865, -848, -844, -833, -828 };
    assertEquals(485.0184100942037, polymove.addedArea(x, y), DELTA * 485.0184100942037);
  }

  @Test
  public void case16() {
    int[] x = { 0, 1, 2 };
    int[] y = { 0, 1, 0 };
    assertEquals(1.0, polymove.addedArea(x, y), DELTA * 1.0);
  }

  @Test
  public void case17() {
    int[] x = { 0, 1, 1, 0 };
    int[] y = { 1, 1, 0, 0 };
    assertEquals(1.4142135623730951, polymove.addedArea(x, y), DELTA * 1.4142135623730951);
  }

  @Test
  public void case18() {
    int[] x = { 0, 0, 1, 2, 1000, 1000, 800, 1 };
    int[] y = { 0, 999, 1000, 1000, 999, 800, 200, -100 };
    assertEquals(1823.6365719780913, polymove.addedArea(x, y), DELTA * 1823.6365719780913);
  }

  @Test
  public void case19() {
    int[] x = { 2, 4, 0 };
    int[] y = { 1, -1, 0 };
    assertEquals(2.0615528128088303, polymove.addedArea(x, y), DELTA * 2.0615528128088303);
  }

  @Test
  public void case20() {
    int[] x = { -6, -7, -6, -4, -2, 1, 3, 4, 3, -1, -3 };
    int[] y = { -1, 2, 4, 6, 7, 7, 6, 4, -2, -5, -4 };
    assertEquals(15.924196446313525, polymove.addedArea(x, y), DELTA * 15.924196446313525);
  }

  @Test
  public void case21() {
    int[] x = { -10, -6, -2, 0, -2, -3, -6, -10, -11 };
    int[] y = { 5, 6, 5, 1, -2, -3, -3, -2, 1 };
    assertEquals(14.535533905932738, polymove.addedArea(x, y), DELTA * 14.535533905932738);
  }

  @Test
  public void case22() {
    int[] x = { 0, 0, 1, 3 };
    int[] y = { 0, 1, 2, 0 };
    assertEquals(3.1622776601683795, polymove.addedArea(x, y), DELTA * 3.1622776601683795);
  }

  @Test
  public void case23() {
    int[] x = { 998, 982, 951, 904, 844, 770, 684, 587, 481, 368, 248, 125, 0, -125, -248, -368, -481, -587, -684, -770, -844, -904, -951, -982, -998, -998, -982, -951, -904, -844, -770, -684, -587, -481, -368, -248, -125, 0, 125, 248, 368, 481, 587, 684, 770, 844, 904, 951, 982, 998 };
    int[] y = { -62, -187, -309, -425, -535, -637, -728, -809, -876, -929, -968, -992, -1000, -992, -968, -929, -876, -809, -728, -637, -535, -425, -309, -187, -62, 62, 187, 309, 425, 535, 637, 728, 809, 876, 929, 968, 992, 1000, 992, 968, 929, 876, 809, 728, 637, 535, 425, 309, 187, 62 };
    assertEquals(3131.630342333775, polymove.addedArea(x, y), DELTA * 3131.630342333775);
  }

  @Test
  public void case24() {
    int[] x = { -500, -480, -460, -440, -420, -400, -380, -360, -340, -320, -300, -280, -260, -240, -220, -200, -180, -160, -140, -120, -100, -80, -60, -40, -20, 0, 20, 40, 60, 80, 100, 120, 140, 160, 180, 200, 220, 240, 260, 280, 300, 320, 340, 360, 380, 400, 420, 440, 460, 480 };
    int[] y = { -950, -901, -853, -806, -760, -715, -671, -628, -586, -545, -505, -466, -428, -391, -355, -320, -286, -253, -221, -190, -160, -131, -103, -76, -50, -25, -1, 22, 44, 65, 85, 104, 122, 139, 155, 170, 184, 197, 209, 220, 230, 239, 247, 254, 260, 265, 269, 272, 274, 275 };
    assertEquals(1587.1601877383662, polymove.addedArea(x, y), DELTA * 1587.1601877383662);
  }

  @Test
  public void case25() {
    int[] x = { 0, 50, 100, 100, 50, 0 };
    int[] y = { 1, 2, 1, 0, -1, 0 };
    assertEquals(100.03998401278722, polymove.addedArea(x, y), DELTA * 100.03998401278722);
  }

  @Test
  public void case26() {
    int[] x = { 0, 0, 2, 4, 4, 2 };
    int[] y = { 0, 1, 2, 1, 0, -1 };
    assertEquals(4.82842712474619, polymove.addedArea(x, y), DELTA * 4.82842712474619);
  }

  @Test
  public void case27() {
    int[] x = { 0, 1, 2, 2, 1 };
    int[] y = { 0, 1, 1, -1, -1 };
    assertEquals(2.23606797749979, polymove.addedArea(x, y), DELTA * 2.23606797749979);
  }

  @Test
  public void case28() {
    int[] x = { 984, 976, 953, 914, 862, 796, 717, 627, 527, 418, 304, 184, 61, -61, -184, -304, -418, -527, -627, -717, -796, -862, -914, -953, -976, -983, -976, -953, -914, -862, -796, -717, -627, -527, -419, -304, -184, -61, 61, 184, 303, 418, 527, 627, 717, 796, 862, 914, 953, 976 };
    int[] y = { 0, -71, -142, -210, -276, -336, -392, -441, -483, -518, -544, -562, -571, -571, -562, -544, -518, -483, -441, -392, -336, -276, -210, -142, -71, 0, 71, 142, 210, 276, 336, 392, 441, 483, 518, 544, 562, 571, 571, 562, 544, 518, 483, 441, 392, 336, 276, 210, 142, 71 };
    assertEquals(2480.165866400116, polymove.addedArea(x, y), DELTA * 2480.165866400116);
  }

  @Test
  public void case29() {
    int[] x = { 1, 2, 0 };
    int[] y = { 1, 0, 0 };
    assertEquals(1.0, polymove.addedArea(x, y), DELTA * 1.0);
  }

  @Test
  public void case30() {
    int[] x = { 0, 1, 2, 7 };
    int[] y = { 0, 5, 8, 3 };
    assertEquals(8.246211251235321, polymove.addedArea(x, y), DELTA * 8.246211251235321);
  }

  @Test
  public void case31() {
    int[] x = { 0, -50, -51, -51, -50, 0, 50, 51, 51, 50 };
    int[] y = { -500, 0, 20, 21, 41, 541, 41, 21, 20, 0 };
    assertEquals(1044.9899521048037, polymove.addedArea(x, y), DELTA * 1044.9899521048037);
  }

  @Test
  public void case32() {
    int[] x = { 0, 10, 0 };
    int[] y = { 10, 0, 0 };
    assertEquals(7.0710678118654755, polymove.addedArea(x, y), DELTA * 7.0710678118654755);
  }

  @Test
  public void case33() {
    int[] x = { 0, 7, 500 };
    int[] y = { 0, 124, -3 };
    assertEquals(254.5476379776485, polymove.addedArea(x, y), DELTA * 254.5476379776485);
  }

  @Test
  public void case34() {
    int[] x = { 0, 10, 20, 20, 10 };
    int[] y = { 0, 5, 5, -5, -5 };
    assertEquals(20.615528128088304, polymove.addedArea(x, y), DELTA * 20.615528128088304);
  }

  @Test
  public void case35() {
    int[] x = { 0, 1, 432, 0 };
    int[] y = { 1, 1, 0, 0 };
    assertEquals(432.001157405857, polymove.addedArea(x, y), DELTA * 432.001157405857);
  }

  @Test
  public void case36() {
    int[] x = { 1, 2, 3, 12, 10 };
    int[] y = { 1, 2, 2, 1, 0 };
    assertEquals(10.524937810560445, polymove.addedArea(x, y), DELTA * 10.524937810560445);
  }

  @Test
  public void case37() {
    int[] x = { 0, 2, 4, 1 };
    int[] y = { 1, 5, 3, 0 };
    assertEquals(5.0990195135927845, polymove.addedArea(x, y), DELTA * 5.0990195135927845);
  }

  @Test
  public void case38() {
    int[] x = { 0, 3, 4, 3, 0, -3, -4, -3 };
    int[] y = { 4, 3, 0, -3, -4, -3, 0, 3 };
    assertEquals(12.0, polymove.addedArea(x, y), DELTA * 12.0);
  }

  @Test
  public void case39() {
    int[] x = { 0, -20, -19, -18, 0, 18, 19, 20 };
    int[] y = { -1, 0, 5, 6, 23, 6, 5, 0 };
    assertEquals(46.1725046566048, polymove.addedArea(x, y), DELTA * 46.1725046566048);
  }

  @Test
  public void case40() {
    int[] x = { -5, -4, -2, 0, 3, 4, 3, -4 };
    int[] y = { 0, 1, 2, 2, 1, 0, -1, -1 };
    assertEquals(9.383414268677662, polymove.addedArea(x, y), DELTA * 9.383414268677662);
  }

  @Test
  public void case41() {
    int[] x = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44 };
    int[] y = { 0, -1, -3, -6, -10, -15, -21, -28, -36, -45, -55, -66, -78, -91, -105, -120, -136, -153, -171, -190, -210, -231, -253, -276, -300, -325, -351, -378, -406, -435, -465, -496, -528, -561, -595, -630, -666, -703, -741, -780, -820, -861, -903, -946, -990 };
    assertEquals(989.1766644870596, polymove.addedArea(x, y), DELTA * 989.1766644870596);
  }

  @Test
  public void case42() {
    int[] x = { 0, 100, 0, -100 };
    int[] y = { 1, 0, -1, 0 };
    assertEquals(200.0, polymove.addedArea(x, y), DELTA * 200.0);
  }

  @Test
  public void case43() {
    int[] x = { 3, 1, 7, 11, 10, 8 };
    int[] y = { 1, 8, 13, 11, 5, 1 };
    assertEquals(15.390053977216382, polymove.addedArea(x, y), DELTA * 15.390053977216382);
  }

  @Test
  public void case44() {
    int[] x = { 0, 1, 26 };
    int[] y = { 0, 1, 0 };
    assertEquals(13.0, polymove.addedArea(x, y), DELTA * 13.0);
  }

  @Test
  public void case45() {
    int[] x = { 0, 0, 98, 100, 101, 102, 101, 100, 3, 2 };
    int[] y = { 2, 800, 802, 801, 800, 5, 3, 2, 1, 1 };
    assertEquals(898.3103343711609, polymove.addedArea(x, y), DELTA * 898.3103343711609);
  }

  @Test
  public void case46() {
    int[] x = { 0, 2, 2, 0, -1 };
    int[] y = { 2, 2, 0, 0, 1 };
    assertEquals(3.1622776601683795, polymove.addedArea(x, y), DELTA * 3.1622776601683795);
  }

  @Test
  public void case47() {
    int[] x = { -1000, 0, 1000, 1000, 0, -1000 };
    int[] y = { 1, 2, 1, 0, -1, 0 };
    assertEquals(2000.001999998, polymove.addedArea(x, y), DELTA * 2000.001999998);
  }

  @Test
  public void case48() {
    int[] x = { 0, 1, 2, 3, 3, 2, 0 };
    int[] y = { 1, 2, 2, 1, 0, -3, 0 };
    assertEquals(5.4156547790585154, polymove.addedArea(x, y), DELTA * 5.4156547790585154);
  }

  @Test
  public void case49() {
    int[] x = { 2, 0, 1 };
    int[] y = { 0, 0, 1 };
    assertEquals(1.0, polymove.addedArea(x, y), DELTA * 1.0);
  }

  @Test
  public void case50() {
    int[] x = { 0, 0, 3, 6, 6, 1 };
    int[] y = { 0, 7, 8, 7, 0, -1 };
    assertEquals(11.748119440177575, polymove.addedArea(x, y), DELTA * 11.748119440177575);
  }

  @Test
  public void case51() {
    int[] x = { 0, 1000, 500, -500, -1000 };
    int[] y = { 1, 0, -1, -1, 0 };
    assertEquals(1750.000166666648, polymove.addedArea(x, y), DELTA * 1750.000166666648);
  }

  @Test
  public void case52() {
    int[] x = { 0, 0, 1, 2, 2 };
    int[] y = { 0, 50, 100, 100, 50 };
    assertEquals(100.01249893770307, polymove.addedArea(x, y), DELTA * 100.01249893770307);
  }

  @Test
  public void case53() {
    int[] x = { 2, 4, 3, 2, 1 };
    int[] y = { 7, 2, 1, 1, 2 };
    assertEquals(6.041381265149109, polymove.addedArea(x, y), DELTA * 6.041381265149109);
  }

  @Test
  public void case54() {
    int[] x = { -1000, -1000, 999, 800 };
    int[] y = { -1000, 1000, 997, 0 };
    assertEquals(2825.5990515287194, polymove.addedArea(x, y), DELTA * 2825.5990515287194);
  }

  @Test
  public void case55() {
    int[] x = { 0, 0, 2, 3, 4, 3, 2 };
    int[] y = { 0, 4, 3, 2, 0, -1, -1 };
    assertEquals(5.995358041299246, polymove.addedArea(x, y), DELTA * 5.995358041299246);
  }

  @Test
  public void case56() {
    int[] x = { 0, 0, 1 };
    int[] y = { 0, 1, 0 };
    assertEquals(0.7071067811865476, polymove.addedArea(x, y), DELTA * 0.7071067811865476);
  }

  @Test
  public void case57() {
    int[] x = { 0, 3, 6, 6, 3, 0 };
    int[] y = { 1, 2, 1, -1, -2, -1 };
    assertEquals(7.242640687119284, polymove.addedArea(x, y), DELTA * 7.242640687119284);
  }

  @Test
  public void case58() {
    int[] x = { 1, 3, 6, 4, 0 };
    int[] y = { 3, 7, 3, 1, 0 };
    assertEquals(7.161988519181639, polymove.addedArea(x, y), DELTA * 7.161988519181639);
  }

  @Test
  public void case59() {
    int[] x = { 0, 100, 50 };
    int[] y = { 0, 100, 49 };
    assertEquals(70.71067811865476, polymove.addedArea(x, y), DELTA * 70.71067811865476);
  }

  @Test
  public void case60() {
    int[] x = { 0, 2, 0 };
    int[] y = { 1, 0, 0 };
    assertEquals(1.118033988749895, polymove.addedArea(x, y), DELTA * 1.118033988749895);
  }

  @Test
  public void case61() {
    int[] x = { 10, 0, 1, 2, 10, 18, 19, 20 };
    int[] y = { -1, 0, 2, 3, 10, 3, 2, 0 };
    assertEquals(22.041594578792296, polymove.addedArea(x, y), DELTA * 22.041594578792296);
  }

  @Test
  public void case62() {
    int[] x = { 0, 50, 100, 100, 51 };
    int[] y = { 0, 1, 0, -1, -1 };
    assertEquals(100.00249993750313, polymove.addedArea(x, y), DELTA * 100.00249993750313);
  }

  @Test
  public void case63() {
    int[] x = { -99, -83, -31, 38, 90, 91, 26 };
    int[] y = { -86, 44, 93, 71, -23, -87, -89 };
    assertEquals(274.55264938745006, polymove.addedArea(x, y), DELTA * 274.55264938745006);
  }

  @Test
  public void case64() {
    int[] x = { 0, 1, 2, 1, 0, -1 };
    int[] y = { 1000, 1000, 500, 0, 0, 500 };
    assertEquals(1000.0039999840001, polymove.addedArea(x, y), DELTA * 1000.0039999840001);
  }

  @Test
  public void case65() {
    int[] x = { 0, 3, 6, 6, 1 };
    int[] y = { 0, 1, 0, -1, -1 };
    assertEquals(6.041381265149109, polymove.addedArea(x, y), DELTA * 6.041381265149109);
  }

  @Test
  public void case66() {
    int[] x = { 2, 0, 1, 3, 4 };
    int[] y = { -1000, 999, 1000, 1000, 999 };
    assertEquals(2000.0002499999844, polymove.addedArea(x, y), DELTA * 2000.0002499999844);
  }

  @Test
  public void case67() {
    int[] x = { 0, 10, 12, 13, 10 };
    int[] y = { 0, 10, 11, 10, -10 };
    assertEquals(20.547511554864492, polymove.addedArea(x, y), DELTA * 20.547511554864492);
  }

  @Test
  public void case68() {
    int[] x = { 10, 0, 0, 5, 10 };
    int[] y = { 0, 0, 5, 10, 5 };
    assertEquals(11.180339887498949, polymove.addedArea(x, y), DELTA * 11.180339887498949);
  }

  @Test
  public void case69() {
    int[] x = { 0, 100, 200, 200, 100 };
    int[] y = { 0, 1, 0, -1, -1 };
    assertEquals(200.00124999218758, polymove.addedArea(x, y), DELTA * 200.00124999218758);
  }

  @Test
  public void case70() {
    int[] x = { -100, 0, 100, 100, 0, -100, -101 };
    int[] y = { 3, 4, 3, 1, 0, 1, 2 };
    assertEquals(201.0, polymove.addedArea(x, y), DELTA * 201.0);
  }

  @Test
  public void case71() {
    int[] x = { 0, 0, 2 };
    int[] y = { 0, 1, 0 };
    assertEquals(1.118033988749895, polymove.addedArea(x, y), DELTA * 1.118033988749895);
  }

  @Test
  public void case72() {
    int[] x = { 0, 1, 102, 101, 100 };
    int[] y = { 1, 6, 5, 3, 2 };
    assertEquals(101.54910064039849, polymove.addedArea(x, y), DELTA * 101.54910064039849);
  }

  @Test
  public void case73() {
    int[] x = { 0, 1, 2 };
    int[] y = { 0, 1, 0 };
    assertEquals(1.0, polymove.addedArea(x, y), DELTA * 1.0);
  }

  @Test
  public void case74() {
    int[] x = { 0, 1, 1, 0 };
    int[] y = { 1, 1, 0, 0 };
    assertEquals(1.4142135623730951, polymove.addedArea(x, y), DELTA * 1.4142135623730951);
  }

  @Test
  public void case75() {
    int[] x = { 0, 0, 1, 2, 1000, 1000, 800, 1 };
    int[] y = { 0, 999, 1000, 1000, 999, 800, 200, -100 };
    assertEquals(1823.6365719780913, polymove.addedArea(x, y), DELTA * 1823.6365719780913);
  }

  @Test
  public void case76() {
    int[] x = { 2, 4, 0 };
    int[] y = { 1, -1, 0 };
    assertEquals(2.0615528128088303, polymove.addedArea(x, y), DELTA * 2.0615528128088303);
  }

  @Test
  public void case77() {
    int[] x = { -6, -7, -6, -4, -2, 1, 3, 4, 3, -1, -3 };
    int[] y = { -1, 2, 4, 6, 7, 7, 6, 4, -2, -5, -4 };
    assertEquals(15.924196446313525, polymove.addedArea(x, y), DELTA * 15.924196446313525);
  }

  @Test
  public void case78() {
    int[] x = { -10, -6, -2, 0, -2, -3, -6, -10, -11 };
    int[] y = { 5, 6, 5, 1, -2, -3, -3, -2, 1 };
    assertEquals(14.535533905932738, polymove.addedArea(x, y), DELTA * 14.535533905932738);
  }

  @Test
  public void case79() {
    int[] x = { 0, 0, 1, 3 };
    int[] y = { 0, 1, 2, 0 };
    assertEquals(3.1622776601683795, polymove.addedArea(x, y), DELTA * 3.1622776601683795);
  }

  @Test
  public void case80() {
    int[] x = { 998, 982, 951, 904, 844, 770, 684, 587, 481, 368, 248, 125, 0, -125, -248, -368, -481, -587, -684, -770, -844, -904, -951, -982, -998, -998, -982, -951, -904, -844, -770, -684, -587, -481, -368, -248, -125, 0, 125, 248, 368, 481, 587, 684, 770, 844, 904, 951, 982, 998 };
    int[] y = { -62, -187, -309, -425, -535, -637, -728, -809, -876, -929, -968, -992, -1000, -992, -968, -929, -876, -809, -728, -637, -535, -425, -309, -187, -62, 62, 187, 309, 425, 535, 637, 728, 809, 876, 929, 968, 992, 1000, 992, 968, 929, 876, 809, 728, 637, 535, 425, 309, 187, 62 };
    assertEquals(3131.630342333775, polymove.addedArea(x, y), DELTA * 3131.630342333775);
  }

  @Test
  public void case81() {
    int[] x = { -500, -480, -460, -440, -420, -400, -380, -360, -340, -320, -300, -280, -260, -240, -220, -200, -180, -160, -140, -120, -100, -80, -60, -40, -20, 0, 20, 40, 60, 80, 100, 120, 140, 160, 180, 200, 220, 240, 260, 280, 300, 320, 340, 360, 380, 400, 420, 440, 460, 480 };
    int[] y = { -950, -901, -853, -806, -760, -715, -671, -628, -586, -545, -505, -466, -428, -391, -355, -320, -286, -253, -221, -190, -160, -131, -103, -76, -50, -25, -1, 22, 44, 65, 85, 104, 122, 139, 155, 170, 184, 197, 209, 220, 230, 239, 247, 254, 260, 265, 269, 272, 274, 275 };
    assertEquals(1587.1601877383662, polymove.addedArea(x, y), DELTA * 1587.1601877383662);
  }

  @Test
  public void case82() {
    int[] x = { 0, 50, 100, 100, 50, 0 };
    int[] y = { 1, 2, 1, 0, -1, 0 };
    assertEquals(100.03998401278722, polymove.addedArea(x, y), DELTA * 100.03998401278722);
  }

  @Test
  public void case83() {
    int[] x = { 0, 0, 2, 4, 4, 2 };
    int[] y = { 0, 1, 2, 1, 0, -1 };
    assertEquals(4.82842712474619, polymove.addedArea(x, y), DELTA * 4.82842712474619);
  }

  @Test
  public void case84() {
    int[] x = { 0, 1, 2, 2, 1 };
    int[] y = { 0, 1, 1, -1, -1 };
    assertEquals(2.23606797749979, polymove.addedArea(x, y), DELTA * 2.23606797749979);
  }

  @Test
  public void case85() {
    int[] x = { 984, 976, 953, 914, 862, 796, 717, 627, 527, 418, 304, 184, 61, -61, -184, -304, -418, -527, -627, -717, -796, -862, -914, -953, -976, -983, -976, -953, -914, -862, -796, -717, -627, -527, -419, -304, -184, -61, 61, 184, 303, 418, 527, 627, 717, 796, 862, 914, 953, 976 };
    int[] y = { 0, -71, -142, -210, -276, -336, -392, -441, -483, -518, -544, -562, -571, -571, -562, -544, -518, -483, -441, -392, -336, -276, -210, -142, -71, 0, 71, 142, 210, 276, 336, 392, 441, 483, 518, 544, 562, 571, 571, 562, 544, 518, 483, 441, 392, 336, 276, 210, 142, 71 };
    assertEquals(2480.165866400116, polymove.addedArea(x, y), DELTA * 2480.165866400116);
  }

  @Test
  public void case86() {
    int[] x = { 1, 2, 0 };
    int[] y = { 1, 0, 0 };
    assertEquals(1.0, polymove.addedArea(x, y), DELTA * 1.0);
  }

  @Test
  public void case87() {
    int[] x = { 0, 1, 2, 7 };
    int[] y = { 0, 5, 8, 3 };
    assertEquals(8.246211251235321, polymove.addedArea(x, y), DELTA * 8.246211251235321);
  }

  @Test
  public void case88() {
    int[] x = { 0, -50, -51, -51, -50, 0, 50, 51, 51, 50 };
    int[] y = { -500, 0, 20, 21, 41, 541, 41, 21, 20, 0 };
    assertEquals(1044.9899521048037, polymove.addedArea(x, y), DELTA * 1044.9899521048037);
  }

  @Test
  public void case89() {
    int[] x = { 0, 10, 0 };
    int[] y = { 10, 0, 0 };
    assertEquals(7.0710678118654755, polymove.addedArea(x, y), DELTA * 7.0710678118654755);
  }

  @Test
  public void case90() {
    int[] x = { 0, 7, 500 };
    int[] y = { 0, 124, -3 };
    assertEquals(254.5476379776485, polymove.addedArea(x, y), DELTA * 254.5476379776485);
  }

  @Test
  public void case91() {
    int[] x = { 0, 10, 20, 20, 10 };
    int[] y = { 0, 5, 5, -5, -5 };
    assertEquals(20.615528128088304, polymove.addedArea(x, y), DELTA * 20.615528128088304);
  }

  @Test
  public void case92() {
    int[] x = { 0, 1, 432, 0 };
    int[] y = { 1, 1, 0, 0 };
    assertEquals(432.001157405857, polymove.addedArea(x, y), DELTA * 432.001157405857);
  }

  @Test
  public void case93() {
    int[] x = { 1, 2, 3, 12, 10 };
    int[] y = { 1, 2, 2, 1, 0 };
    assertEquals(10.524937810560445, polymove.addedArea(x, y), DELTA * 10.524937810560445);
  }

  @Test
  public void case94() {
    int[] x = { 0, 2, 4, 1 };
    int[] y = { 1, 5, 3, 0 };
    assertEquals(5.0990195135927845, polymove.addedArea(x, y), DELTA * 5.0990195135927845);
  }

  @Test
  public void case95() {
    int[] x = { 0, 3, 4, 3, 0, -3, -4, -3 };
    int[] y = { 4, 3, 0, -3, -4, -3, 0, 3 };
    assertEquals(12.0, polymove.addedArea(x, y), DELTA * 12.0);
  }

  @Test
  public void case96() {
    int[] x = { 0, -20, -19, -18, 0, 18, 19, 20 };
    int[] y = { -1, 0, 5, 6, 23, 6, 5, 0 };
    assertEquals(46.1725046566048, polymove.addedArea(x, y), DELTA * 46.1725046566048);
  }

  @Test
  public void case97() {
    int[] x = { -5, -4, -2, 0, 3, 4, 3, -4 };
    int[] y = { 0, 1, 2, 2, 1, 0, -1, -1 };
    assertEquals(9.383414268677662, polymove.addedArea(x, y), DELTA * 9.383414268677662);
  }

  @Test
  public void case98() {
    int[] x = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44 };
    int[] y = { 0, -1, -3, -6, -10, -15, -21, -28, -36, -45, -55, -66, -78, -91, -105, -120, -136, -153, -171, -190, -210, -231, -253, -276, -300, -325, -351, -378, -406, -435, -465, -496, -528, -561, -595, -630, -666, -703, -741, -780, -820, -861, -903, -946, -990 };
    assertEquals(989.1766644870596, polymove.addedArea(x, y), DELTA * 989.1766644870596);
  }

  @Test
  public void case99() {
    int[] x = { 0, 100, 0, -100 };
    int[] y = { 1, 0, -1, 0 };
    assertEquals(200.0, polymove.addedArea(x, y), DELTA * 200.0);
  }

  @Test
  public void case100() {
    int[] x = { 3, 1, 7, 11, 10, 8 };
    int[] y = { 1, 8, 13, 11, 5, 1 };
    assertEquals(15.390053977216382, polymove.addedArea(x, y), DELTA * 15.390053977216382);
  }

  @Test
  public void case101() {
    int[] x = { 0, 1, 26 };
    int[] y = { 0, 1, 0 };
    assertEquals(13.0, polymove.addedArea(x, y), DELTA * 13.0);
  }

  @Test
  public void case102() {
    int[] x = { 0, 0, 98, 100, 101, 102, 101, 100, 3, 2 };
    int[] y = { 2, 800, 802, 801, 800, 5, 3, 2, 1, 1 };
    assertEquals(898.3103343711609, polymove.addedArea(x, y), DELTA * 898.3103343711609);
  }

  @Test
  public void case103() {
    int[] x = { 0, 2, 2, 0, -1 };
    int[] y = { 2, 2, 0, 0, 1 };
    assertEquals(3.1622776601683795, polymove.addedArea(x, y), DELTA * 3.1622776601683795);
  }

  @Test
  public void case104() {
    int[] x = { -1000, 0, 1000, 1000, 0, -1000 };
    int[] y = { 1, 2, 1, 0, -1, 0 };
    assertEquals(2000.001999998, polymove.addedArea(x, y), DELTA * 2000.001999998);
  }

  @Test
  public void case105() {
    int[] x = { 0, 1, 2, 3, 3, 2, 0 };
    int[] y = { 1, 2, 2, 1, 0, -3, 0 };
    assertEquals(5.4156547790585154, polymove.addedArea(x, y), DELTA * 5.4156547790585154);
  }

  @Test
  public void case106() {
    int[] x = { 2, 0, 1 };
    int[] y = { 0, 0, 1 };
    assertEquals(1.0, polymove.addedArea(x, y), DELTA * 1.0);
  }

  @Test
  public void case107() {
    int[] x = { 0, 0, 3, 6, 6, 1 };
    int[] y = { 0, 7, 8, 7, 0, -1 };
    assertEquals(11.748119440177575, polymove.addedArea(x, y), DELTA * 11.748119440177575);
  }

  @Test
  public void case108() {
    int[] x = { 0, 1000, 500, -500, -1000 };
    int[] y = { 1, 0, -1, -1, 0 };
    assertEquals(1750.000166666648, polymove.addedArea(x, y), DELTA * 1750.000166666648);
  }

  @Test
  public void case109() {
    int[] x = { 0, 0, 1, 2, 2 };
    int[] y = { 0, 50, 100, 100, 50 };
    assertEquals(100.01249893770307, polymove.addedArea(x, y), DELTA * 100.01249893770307);
  }

  @Test
  public void case110() {
    int[] x = { 2, 4, 3, 2, 1 };
    int[] y = { 7, 2, 1, 1, 2 };
    assertEquals(6.041381265149109, polymove.addedArea(x, y), DELTA * 6.041381265149109);
  }

  @Test
  public void case111() {
    int[] x = { -1000, -1000, 999, 800 };
    int[] y = { -1000, 1000, 997, 0 };
    assertEquals(2825.5990515287194, polymove.addedArea(x, y), DELTA * 2825.5990515287194);
  }

  @Test
  public void case112() {
    int[] x = { 0, 0, 2, 3, 4, 3, 2 };
    int[] y = { 0, 4, 3, 2, 0, -1, -1 };
    assertEquals(5.995358041299246, polymove.addedArea(x, y), DELTA * 5.995358041299246);
  }

  @Test
  public void case113() {
    int[] x = { 0, 0, 1 };
    int[] y = { 0, 1, 0 };
    assertEquals(0.7071067811865476, polymove.addedArea(x, y), DELTA * 0.7071067811865476);
  }

  @Test
  public void case114() {
    int[] x = { 0, 3, 6, 6, 3, 0 };
    int[] y = { 1, 2, 1, -1, -2, -1 };
    assertEquals(7.242640687119284, polymove.addedArea(x, y), DELTA * 7.242640687119284);
  }

  @Test
  public void case115() {
    int[] x = { 1, 3, 6, 4, 0 };
    int[] y = { 3, 7, 3, 1, 0 };
    assertEquals(7.161988519181639, polymove.addedArea(x, y), DELTA * 7.161988519181639);
  }

  @Test
  public void case116() {
    int[] x = { 0, 100, 50 };
    int[] y = { 0, 100, 49 };
    assertEquals(70.71067811865476, polymove.addedArea(x, y), DELTA * 70.71067811865476);
  }

  @Test
  public void case117() {
    int[] x = { 0, 2, 0 };
    int[] y = { 1, 0, 0 };
    assertEquals(1.118033988749895, polymove.addedArea(x, y), DELTA * 1.118033988749895);
  }

  @Test
  public void case118() {
    int[] x = { 10, 0, 1, 2, 10, 18, 19, 20 };
    int[] y = { -1, 0, 2, 3, 10, 3, 2, 0 };
    assertEquals(22.041594578792296, polymove.addedArea(x, y), DELTA * 22.041594578792296);
  }

  @Test
  public void case119() {
    int[] x = { 0, 50, 100, 100, 51 };
    int[] y = { 0, 1, 0, -1, -1 };
    assertEquals(100.00249993750313, polymove.addedArea(x, y), DELTA * 100.00249993750313);
  }

  @Test
  public void case120() {
    int[] x = { -99, -83, -31, 38, 90, 91, 26 };
    int[] y = { -86, 44, 93, 71, -23, -87, -89 };
    assertEquals(274.55264938745006, polymove.addedArea(x, y), DELTA * 274.55264938745006);
  }

  @Test
  public void case121() {
    int[] x = { 0, 1, 2, 1, 0, -1 };
    int[] y = { 1000, 1000, 500, 0, 0, 500 };
    assertEquals(1000.0039999840001, polymove.addedArea(x, y), DELTA * 1000.0039999840001);
  }

  @Test
  public void case122() {
    int[] x = { 0, 3, 6, 6, 1 };
    int[] y = { 0, 1, 0, -1, -1 };
    assertEquals(6.041381265149109, polymove.addedArea(x, y), DELTA * 6.041381265149109);
  }

  @Test
  public void case123() {
    int[] x = { 2, 0, 1, 3, 4 };
    int[] y = { -1000, 999, 1000, 1000, 999 };
    assertEquals(2000.0002499999844, polymove.addedArea(x, y), DELTA * 2000.0002499999844);
  }

  @Test
  public void case124() {
    int[] x = { 0, 10, 12, 13, 10 };
    int[] y = { 0, 10, 11, 10, -10 };
    assertEquals(20.547511554864492, polymove.addedArea(x, y), DELTA * 20.547511554864492);
  }

  @Test
  public void case125() {
    int[] x = { 10, 0, 0, 5, 10 };
    int[] y = { 0, 0, 5, 10, 5 };
    assertEquals(11.180339887498949, polymove.addedArea(x, y), DELTA * 11.180339887498949);
  }

  @Test
  public void case126() {
    int[] x = { 0, 100, 200, 200, 100 };
    int[] y = { 0, 1, 0, -1, -1 };
    assertEquals(200.00124999218758, polymove.addedArea(x, y), DELTA * 200.00124999218758);
  }

  @Test
  public void case127() {
    int[] x = { -100, 0, 100, 100, 0, -100, -101 };
    int[] y = { 3, 4, 3, 1, 0, 1, 2 };
    assertEquals(201.0, polymove.addedArea(x, y), DELTA * 201.0);
  }

  @Test
  public void case128() {
    int[] x = { 0, 0, 2 };
    int[] y = { 0, 1, 0 };
    assertEquals(1.118033988749895, polymove.addedArea(x, y), DELTA * 1.118033988749895);
  }

  @Test
  public void case129() {
    int[] x = { 0, 1, 102, 101, 100 };
    int[] y = { 1, 6, 5, 3, 2 };
    assertEquals(101.54910064039849, polymove.addedArea(x, y), DELTA * 101.54910064039849);
  }

}
