package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class EqualTowersTest {
  EqualTowers equaltowers = new EqualTowers();

  @Test
  public void case1() {
    int[] bricks = { 2, 3, 5 };
    assertEquals(5, equaltowers.height(bricks));
  }

  @Test
  public void case2() {
    int[] bricks = { 10, 9, 2 };
    assertEquals(-1, equaltowers.height(bricks));
  }

  @Test
  public void case3() {
    int[] bricks = { 11, 11 };
    assertEquals(11, equaltowers.height(bricks));
  }

  //@Test
  public void case4() {
    int[] bricks = { 88242, 313, 1991, 4207, 2483, 1763, 224, 16, 582, 22943, 28632, 47682, 378, 90, 88, 43, 117, 19, 8 };
    assertEquals(99901, equaltowers.height(bricks));
  }

  //@Test
  public void case5() {
    int[] bricks = { 188242, 313, 1991, 4207, 2483, 1763, 224, 16, 582, 22943, 111653, 23787, 16820, 12415, 1270, 3032, 2293, 5221, 396, 42 };
    assertEquals(199661, equaltowers.height(bricks));
  }

  //@Test
  public void case6() {
    int[] bricks = { 162, 50, 7, 10966, 24, 8940, 3, 5788, 611, 178328, 6709, 39, 471, 1, 7537, 716, 67940, 22, 15502, 3, 29407, 3086, 6398, 27, 58706, 456, 1, 9, 19187, 77491, 1, 1346, 66 };
    assertEquals(250000, equaltowers.height(bricks));
  }

  //@Test
  public void case7() {
    int[] bricks = { 950, 17716, 178, 54, 5776, 34, 183, 5176, 13398, 249, 2608, 3681, 855, 88196, 1891, 58459, 2753, 27242, 1729, 231217 };
    assertEquals(115564, equaltowers.height(bricks));
  }

  //@Test
  public void case8() {
    int[] bricks = { 16, 19706, 7490, 58606, 363, 10253, 8709, 167609, 211, 48747, 38190, 10696, 3144, 187, 2425, 4411, 13443, 10008, 6, 302, 461, 10367, 2456, 6948, 1803, 782, 72642 };
    assertEquals(249897, equaltowers.height(bricks));
  }

  //@Test
  public void case9() {
    int[] bricks = { 2708, 21206, 6036, 26939, 22955, 8624, 57476, 12597, 1493, 21684, 33122, 9287, 16186, 5355, 5073, 2807, 233894, 12340 };
    assertEquals(239409, equaltowers.height(bricks));
  }

  //@Test
  public void case10() {
    int[] bricks = { 30722, 69, 2595, 282, 22602, 1999, 22609, 678, 22411, 66, 1, 52297, 2375, 3, 247, 4, 41, 11, 455, 792, 226, 14, 7656, 3732, 5080, 614, 902, 2, 206, 608, 995, 64482, 89, 255135 };
    assertEquals(122432, equaltowers.height(bricks));
  }

  //@Test
  public void case11() {
    int[] bricks = { 571, 39, 967, 2, 9471, 10, 40, 46730, 6476, 1, 382, 1, 1, 913, 6604, 1004, 28666, 2908, 2340, 402, 38, 16, 258541, 131, 6249, 3, 7, 3061, 4, 2876, 2, 5200, 18722, 59, 104, 29, 91401, 6000, 29 };
    assertEquals(120729, equaltowers.height(bricks));
  }

  //@Test
  public void case12() {
    int[] bricks = { 2077, 825, 3, 8560, 31476, 1, 6, 806, 10, 32313, 201, 10330, 10, 16, 1632, 2653, 1, 122, 17443, 154, 1799, 9557, 2054, 19372, 13, 92, 5, 259916, 98553 };
    assertEquals(120042, equaltowers.height(bricks));
  }

  //@Test
  public void case13() {
    int[] bricks = { 4, 20, 2893, 50089, 5068, 1, 1654, 460, 2, 2, 4481, 1907, 10, 20321, 1904, 2031, 288665, 2455, 31027, 190, 541, 811, 8903, 15, 1675, 51, 15505, 8, 5, 58594, 11, 383, 172, 142 };
    assertEquals(105667, equaltowers.height(bricks));
  }

  //@Test
  public void case14() {
    int[] bricks = { 347, 65, 2643, 35, 83, 149, 3016, 3190, 524, 2185, 92345, 914, 3, 51, 8721, 1, 9034, 2295, 1460, 7942, 2, 21, 14806, 496, 78456, 3, 2, 65, 8, 261, 658, 486, 609, 439, 21795, 86, 55, 14546, 3183, 359, 8604, 145, 66987, 75, 490, 5, 4, 862, 245, 151232 };
    assertEquals(249994, equaltowers.height(bricks));
  }

  //@Test
  public void case15() {
    int[] bricks = { 90000, 60000, 60001, 60000, 60001 };
    assertEquals(120001, equaltowers.height(bricks));
  }

  //@Test
  public void case16() {
    int[] bricks = { 285094, 56875, 5213, 8, 1299, 26306, 66, 3, 5896, 64198, 5, 6566, 3607, 35267, 7174, 52, 2, 2369 };
    assertEquals(107453, equaltowers.height(bricks));
  }

  //@Test
  public void case17() {
    int[] bricks = { 27, 260, 98825, 25182, 153, 2653, 70154, 13, 892, 1142, 51590, 2018, 144, 501, 246446 };
    assertEquals(249870, equaltowers.height(bricks));
  }

  //@Test
  public void case18() {
    int[] bricks = { 13681, 207, 4, 1, 4638, 54124, 11839, 234098, 88168, 17491, 4770, 2107, 23436, 35, 45399, 2 };
    assertEquals(115313, equaltowers.height(bricks));
  }

  //@Test
  public void case19() {
    int[] bricks = { 77524, 8, 2989, 22, 479, 16057, 2574, 16, 2911, 93155, 121978, 169575, 35, 6426, 1367, 899, 3985 };
    assertEquals(248488, equaltowers.height(bricks));
  }

  //@Test
  public void case20() {
    int[] bricks = { 63656, 3876, 25655, 12906, 62938, 7538, 23445, 215389 };
    assertEquals(100007, equaltowers.height(bricks));
  }

  //@Test
  public void case21() {
    int[] bricks = { 400, 421, 58236, 39488, 3772, 44124, 846, 61, 12041, 485, 114, 5622, 174381, 4682, 48880, 23787, 22, 8443, 1196, 25658, 41739, 7, 8, 5530, 10 };
    assertEquals(249973, equaltowers.height(bricks));
  }

  //@Test
  public void case22() {
    int[] bricks = { 3665, 45365, 2230, 45520, 60396, 3769, 27691, 5571, 210317, 1688, 25329, 32007, 27083, 5425 };
    assertEquals(123863, equaltowers.height(bricks));
  }

  //@Test
  public void case23() {
    int[] bricks = { 5681, 93979, 40521, 41089, 3865, 6028, 5520, 268799, 7925, 14984, 10256, 1087 };
    assertEquals(100007, equaltowers.height(bricks));
  }

  //@Test
  public void case24() {
    int[] bricks = { 36252, 17006, 2701, 282051, 8035, 15613, 1555, 2479, 109, 1973, 15569, 8988, 37678, 484, 39490, 26336, 1315 };
    assertEquals(107014, equaltowers.height(bricks));
  }

  //@Test
  public void case25() {
    int[] bricks = { 68751, 8237, 40379, 6696, 1171, 1953, 208572, 10019, 17627, 6144, 32181, 8013, 13994, 64478, 11516 };
    assertEquals(226604, equaltowers.height(bricks));
  }

  //@Test
  public void case26() {
    int[] bricks = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    assertEquals(250000, equaltowers.height(bricks));
  }

  //@Test
  public void case27() {
    int[] bricks = { 500000 };
    assertEquals(-1, equaltowers.height(bricks));
  }

  //@Test
  public void case28() {
    int[] bricks = { 14, 3, 20, 15, 15, 14, 24, 23, 15 };
    assertEquals(64, equaltowers.height(bricks));
  }

  //@Test
  public void case29() {
    int[] bricks = { 34, 77, 34, 87, 13, 8, 123, 56, 8, 65468, 345, 7684, 135, 498, 654, 687, 14, 9875, 6871, 451, 679, 5435, 984, 654, 984, 984, 287, 105, 430, 3455, 245, 779, 2456, 678, 5633, 161, 186, 343, 87, 23, 98, 34 };
    assertEquals(26187, equaltowers.height(bricks));
  }

  //@Test
  public void case30() {
    int[] bricks = { 2, 3, 5 };
    assertEquals(5, equaltowers.height(bricks));
  }

  //@Test
  public void case31() {
    int[] bricks = { 384, 387, 278, 416, 294, 336, 387, 493, 150, 422, 363, 28, 191, 60, 264, 427, 41, 427, 173, 237, 212, 369, 68, 430, 283, 31, 363, 124, 68, 136, 430, 303, 23, 59, 70, 168, 394, 457, 12, 43, 230, 374, 422, 420, 285, 38, 199, 325, 316, 371 };
    assertEquals(6379, equaltowers.height(bricks));
  }

  //@Test
  public void case32() {
    int[] bricks = { 592, 1, 7129, 1646, 2125, 8696, 2750, 4168, 3686, 9436, 331, 5798, 3723, 2095, 3083, 4842, 2, 6813, 5917, 2052, 3, 4114, 8137, 2187, 4065, 7106, 5639, 9820, 8208, 2426, 9788, 8482, 3498, 8278, 2551, 3847, 7984, 4005, 3963, 8170, 6949, 6138, 4285, 7938, 6149, 7076, 9697, 9170, 5766, 256 };
    assertEquals(125290, equaltowers.height(bricks));
  }

  //@Test
  public void case33() {
    int[] bricks = { 14, 3, 20, 15, 15, 14, 24, 23, 15, 243 };
    assertEquals(64, equaltowers.height(bricks));
  }

  //@Test
  public void case34() {
    int[] bricks = { 307, 128, 115, 736, 896, 216, 966, 446, 151, 421, 671, 2, 528, 823, 76, 619, 193, 709, 582, 332, 692, 38, 200, 724, 274, 61, 23, 621, 178, 167, 381, 582, 164, 123, 809, 412, 965, 577, 239, 193, 505, 108, 39, 868, 637, 231, 746, 649, 932, 690 };
    assertEquals(10861, equaltowers.height(bricks));
  }

  //@Test
  public void case35() {
    int[] bricks = { 14, 3, 20, 15, 15, 14, 24, 23, 15 };
    assertEquals(64, equaltowers.height(bricks));
  }

  //@Test
  public void case36() {
    int[] bricks = { 250000, 72500, 1000, 10000, 2340, 324, 356, 123, 547, 6574, 123, 234, 436, 5467, 2354, 213, 23, 34, 2, 5, 5, 667, 3, 2, 1, 1, 34, 45, 45, 675, 34, 34, 234, 234, 435, 234, 45, 45, 125000 };
    assertEquals(16464, equaltowers.height(bricks));
  }

  //@Test
  public void case37() {
    int[] bricks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 33, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals(638, equaltowers.height(bricks));
  }

  //@Test
  public void case38() {
    int[] bricks = { 1, 100, 100, 200, 201, 401 };
    assertEquals(501, equaltowers.height(bricks));
  }

  //@Test
  public void case39() {
    int[] bricks = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    assertEquals(250000, equaltowers.height(bricks));
  }

  //@Test
  public void case40() {
    int[] bricks = { 126, 890, 1432, 857, 3518, 242, 3556, 935, 1303, 643, 7504, 6321, 5814, 1919, 4493, 4853, 3527, 4047, 6785, 3835, 12602, 6022, 2473, 12606, 11850, 16334, 11609, 8705, 16540, 17635, 22378, 6207, 14040, 17799, 1387, 16818, 28793, 14682, 21062, 6553, 23399, 6784, 7866, 33971, 34677, 31638, 3543, 11847, 14532, 2977 };
    assertEquals(249643, equaltowers.height(bricks));
  }

  //@Test
  public void case41() {
    int[] bricks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertEquals(137, equaltowers.height(bricks));
  }

  //@Test
  public void case42() {
    int[] bricks = { 586, 208, 346, 502, 302, 140, 965, 573, 679, 942, 339, 911, 988, 578, 99, 627, 339, 973, 235, 3, 27, 856, 609, 330, 979, 384, 306, 252, 300, 47, 57, 920, 137, 221, 331, 322, 779, 301, 930, 454, 4, 581, 101, 406, 148, 898, 232, 988, 286, 594 };
    assertEquals(11556, equaltowers.height(bricks));
  }

  //@Test
  public void case43() {
    int[] bricks = { 14, 3, 20, 15, 15, 14, 24, 23, 15, 14 };
    assertEquals(77, equaltowers.height(bricks));
  }

  //@Test
  public void case44() {
    int[] bricks = { 1, 1, 3, 240, 300, 1, 11, 1, 11, 1, 23, 121, 2346, 3324, 43562, 554, 55, 55, 100, 9, 50000, 200000, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 4, 67, 8, 6, 4, 4, 3, 2, 7, 4, 235, 3256 };
    assertEquals(50994, equaltowers.height(bricks));
  }

  //@Test
  public void case45() {
    int[] bricks = { 14, 3, 20, 15, 15, 14, 24, 23, 15, 2, 2, 4, 4, 1, 3 };
    assertEquals(79, equaltowers.height(bricks));
  }

  //@Test
  public void case46() {
    int[] bricks = { 123, 43243, 34, 234, 234, 234, 435, 456, 234, 234, 234, 423, 454, 5435, 34523, 545, 345, 2344, 4324, 2344, 23423, 234, 234, 2345, 345, 4554, 3234, 234, 4545, 545, 345, 324, 234, 234, 2345, 234, 5235, 235, 234, 235, 3455, 35234, 23434, 234, 234, 2345, 545, 4344, 3434, 34324 };
    assertEquals(126620, equaltowers.height(bricks));
  }

  //@Test
  public void case47() {
    int[] bricks = { 10, 15, 14, 12, 11, 5, 2, 3, 20, 11, 14 };
    assertEquals(57, equaltowers.height(bricks));
  }

  //@Test
  public void case48() {
    int[] bricks = { 6813, 7007, 8614, 1501, 518, 10571, 23980, 2479, 4900, 21366, 11486, 65, 6963, 12091, 6137, 13551, 18288, 18164, 2499, 2546, 18813, 15560, 13972, 20951, 6918, 4036, 7446, 23855, 9381, 14125, 1097, 4233, 19459, 2069, 6858, 5789, 11585, 6445, 6996, 714, 918, 6362, 6791, 30659, 1337, 18827, 25064, 9861, 13953, 6217 };
    assertEquals(249915, equaltowers.height(bricks));
  }

  //@Test
  public void case49() {
    int[] bricks = { 4343, 432, 52, 7634, 7536, 423, 523, 63, 78, 1, 523, 6342, 63, 321, 2, 2, 32, 3253, 235, 325, 6, 6235, 325347, 72, 325, 3276, 32, 7, 3, 36, 6345, 6, 7, 2, 32, 327, 2, 563, 532 };
    assertEquals(24995, equaltowers.height(bricks));
  }

  //@Test
  public void case50() {
    int[] bricks = { 111, 2323, 2341, 1235, 3245, 3245, 2345, 234, 3245, 3246, 56, 456, 567, 567, 2345, 2345, 2345, 2345, 3245, 456, 426, 567, 678, 789, 5000, 7, 435, 34634, 333, 333, 333, 3, 3, 2, 1, 435, 567, 68, 78, 3456, 456, 567, 567, 43, 34, 4256, 4356, 45, 42, 2456 };
    assertEquals(48633, equaltowers.height(bricks));
  }

  //@Test
  public void case51() {
    int[] bricks = { 177, 2, 161, 3, 338, 289, 1234, 6, 1000, 23, 2234 };
    assertEquals(2572, equaltowers.height(bricks));
  }

  //@Test
  public void case52() {
    int[] bricks = { 11, 11, 2 };
    assertEquals(11, equaltowers.height(bricks));
  }

  //@Test
  public void case53() {
    int[] bricks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals(637, equaltowers.height(bricks));
  }

  //@Test
  public void case54() {
    int[] bricks = { 10000, 9999, 9998, 9997, 9996, 9995, 9994, 9993, 9992, 9991, 9990, 9989, 9988, 9987, 9986, 9985, 9984, 9983, 9982, 9981, 9980, 9979, 9978, 9977, 9976, 9975, 9974, 9973, 9972, 9971, 9970, 9969, 9968, 9967, 9966, 9965, 9964, 9963, 9962, 9961, 9960, 9959, 9958, 9957, 9956, 9955, 9954, 9953, 9952, 9951 };
    assertEquals(239436, equaltowers.height(bricks));
  }

  //@Test
  public void case55() {
    int[] bricks = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals(108, equaltowers.height(bricks));
  }

  //@Test
  public void case56() {
    int[] bricks = { 14, 3, 20, 15, 15, 14, 24, 23, 15, 2, 3, 13, 43, 14, 17, 33, 12, 13, 12, 1, 1, 4, 14, 21, 12, 11, 14, 33, 22, 21, 24, 21, 12, 22, 24, 31, 31, 2, 1, 3, 2, 5, 14, 16, 17, 14, 18, 13, 12, 11 };
    assertEquals(376, equaltowers.height(bricks));
  }

  //@Test
  public void case57() {
    int[] bricks = { 9999, 9998, 9997, 9996, 9995, 9994, 9993, 9992, 9991, 9990, 9989, 9988, 9987, 9986, 9985, 9984, 9983, 9982, 9981, 9980, 9979, 9978, 9977, 9976, 9975, 9974, 9973, 9972, 9971, 9970, 9999, 9998, 9997, 9996, 9995, 9994, 9993, 9992, 9991, 9990, 9989, 9988, 9987, 9986, 9985, 9984, 9983, 9982, 9981, 9980 };
    assertEquals(239692, equaltowers.height(bricks));
  }

  //@Test
  public void case58() {
    int[] bricks = { 100000, 100000 };
    assertEquals(100000, equaltowers.height(bricks));
  }

  //@Test
  public void case59() {
    int[] bricks = { 14, 3, 20, 15, 15, 14, 24, 23, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 3, 4, 5, 6, 7, 834, 54, 4, 3, 4, 5, 4, 5, 6, 7, 8, 3, 4, 566, 7, 76, 5, 4, 5, 565, 4, 4, 3, 3 };
    assertEquals(1209, equaltowers.height(bricks));
  }

  //@Test
  public void case60() {
    int[] bricks = { 1, 2, 5, 300, 52, 94, 21, 854, 23, 19, 43, 100, 1000, 54, 5000, 97, 81, 359, 1584, 34, 94, 22, 59, 78, 4, 6, 9, 194, 994, 26, 996, 654, 488, 124, 84, 161, 894, 210, 929, 44, 12 };
    assertEquals(7902, equaltowers.height(bricks));
  }

  //@Test
  public void case61() {
    int[] bricks = { 3243, 23412, 2421, 23, 2341, 23, 234, 123, 52312, 1, 23, 2, 3, 33, 31, 2341, 2341, 214, 2 };
    assertEquals(5078, equaltowers.height(bricks));
  }

  //@Test
  public void case62() {
    int[] bricks = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    assertEquals(160000, equaltowers.height(bricks));
  }

  //@Test
  public void case63() {
    int[] bricks = { 1, 1, 1, 1, 1, 2 };
    assertEquals(3, equaltowers.height(bricks));
  }

  //@Test
  public void case64() {
    int[] bricks = { 10, 3, 2, 2, 2, 2, 2 };
    assertEquals(10, equaltowers.height(bricks));
  }

  //@Test
  public void case65() {
    int[] bricks = { 1, 2, 6, 2, 876, 123, 345, 467, 23, 234, 12, 345, 567, 89, 23, 423, 435, 67, 783, 674, 234, 645, 234, 56, 657, 879, 9, 526, 324, 999, 998, 997, 996, 995, 994, 993, 992, 991, 990, 989, 988, 987 };
    assertEquals(10985, equaltowers.height(bricks));
  }

  //@Test
  public void case66() {
    int[] bricks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1000, 1000, 1000, 443, 32432, 2323, 32432, 232, 32432, 32423, 23432, 12, 2144, 343, 5454, 23, 5454, 213123, 5454, 3432, 5423, 12, 24324, 23432, 123, 2123, 123, 12321, 43, 121, 324, 12, 213, 123, 12312, 43, 123, 24, 123, 123 };
    assertEquals(238054, equaltowers.height(bricks));
  }

  //@Test
  public void case67() {
    int[] bricks = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    assertEquals(2500, equaltowers.height(bricks));
  }

  //@Test
  public void case68() {
    int[] bricks = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(25, equaltowers.height(bricks));
  }

  //@Test
  public void case69() {
    int[] bricks = { 150, 151, 151, 152, 150, 49, 12000, 20001, 18000, 1, 5, 19231, 23133, 1212, 1331, 9817, 150, 151, 151, 152, 150, 49, 12000, 20001, 18000, 1, 5, 19231, 23133, 1212, 1331, 9817, 19231, 23133, 9999, 18191, 18919, 19231, 23133, 1212, 1331, 9817, 19231, 23133, 9999, 18191, 18919 };
    assertEquals(222369, equaltowers.height(bricks));
  }

  //@Test
  public void case70() {
    int[] bricks = { 12, 254, 654, 31, 97, 89, 54, 65, 32, 25, 24, 26, 27, 29, 24, 32, 32, 31, 14, 14, 1, 21, 25, 14, 15, 17, 16, 18, 19, 32, 30, 17, 15, 65, 57, 58, 54, 53, 52, 51, 56, 45, 78, 87, 65, 41, 12, 32, 10 };
    assertEquals(1311, equaltowers.height(bricks));
  }

  //@Test
  public void case71() {
    int[] bricks = { 1, 6, 6 };
    assertEquals(6, equaltowers.height(bricks));
  }

  //@Test
  public void case72() {
    int[] bricks = { 3, 23, 43, 54, 65, 3434, 24, 666, 566, 100, 143, 765, 23, 887, 34, 8977, 455, 233, 55, 49, 353, 6442, 5575, 343, 233, 986, 40, 7, 2, 9, 6, 773, 545, 275, 9234, 3474, 23444, 234, 274, 23, 66, 247, 13, 86, 12, 7654, 23, 24, 4 };
    assertEquals(38500, equaltowers.height(bricks));
  }

  //@Test
  public void case73() {
    int[] bricks = { 1, 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019, 1020, 1021, 1022, 1023, 1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031, 1032, 1033, 1034, 1035, 1036, 1037, 1038, 1039, 104 };
    assertEquals(20442, equaltowers.height(bricks));
  }

  //@Test
  public void case74() {
    int[] bricks = { 10000, 10000, 10000 };
    assertEquals(10000, equaltowers.height(bricks));
  }

  //@Test
  public void case75() {
    int[] bricks = { 48899, 48901, 5, 5 };
    assertEquals(5, equaltowers.height(bricks));
  }

  //@Test
  public void case76() {
    int[] bricks = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 41, 2467, 2334, 2500, 3169, 3724, 3478, 1358, 2962, 464, 1705, 145, 3281, 827, 1961, 491, 2995, 3942, 827, 1436, 391, 2604, 3902, 153, 292, 382, 1421, 2716, 3718, 3895, 1447, 64990 };
    assertEquals(194080, equaltowers.height(bricks));
  }

  //@Test
  public void case77() {
    int[] bricks = { 14, 3, 20, 15, 15, 14, 24, 23, 15, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    assertEquals(106, equaltowers.height(bricks));
  }

  //@Test
  public void case78() {
    int[] bricks = { 5, 5, 1, 2 };
    assertEquals(5, equaltowers.height(bricks));
  }

  //@Test
  public void case79() {
    int[] bricks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 282, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47 };
    assertEquals(691, equaltowers.height(bricks));
  }

  //@Test
  public void case80() {
    int[] bricks = { 10000, 10000, 10000, 10000, 10000, 10001, 9999, 9999, 10001, 20001, 1, 200, 4000, 10, 13, 13, 26, 200, 2020, 222, 45, 234, 90, 89, 78, 67, 56, 45, 34, 34, 34, 34, 34, 34, 3434, 344, 434, 1123, 112, 112, 123, 111, 121, 111, 111, 200, 200, 19 };
    assertEquals(62084, equaltowers.height(bricks));
  }

  //@Test
  public void case81() {
    int[] bricks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 1, 1, 1 };
    assertEquals(107, equaltowers.height(bricks));
  }

  //@Test
  public void case82() {
    int[] bricks = { 213, 32, 43, 555, 34, 2342, 243234, 23, 55, 15, 15, 15, 15, 23, 43 };
    assertEquals(247, equaltowers.height(bricks));
  }

  //@Test
  public void case83() {
    int[] bricks = { 10, 9, 2, 3, 4, 2, 3, 4, 5, 6, 8, 9, 12, 10, 12, 2, 4, 6, 8, 2, 10, 13, 3, 6, 7, 4, 9, 7 };
    assertEquals(90, equaltowers.height(bricks));
  }

  //@Test
  public void case84() {
    int[] bricks = { 250000, 249999 };
    assertEquals(-1, equaltowers.height(bricks));
  }

  //@Test
  public void case85() {
    int[] bricks = { 2, 3, 5, 17, 105, 106, 2, 195, 11, 82, 103, 18, 107, 105, 8, 9, 11, 196, 19, 80, 105, 19, 1, 20, 20, 40, 15, 15, 31, 16, 15 };
    assertEquals(740, equaltowers.height(bricks));
  }

  //@Test
  public void case86() {
    int[] bricks = { 499999, 1 };
    assertEquals(-1, equaltowers.height(bricks));
  }

  //@Test
  public void case87() {
    int[] bricks = { 9876, 987, 6464, 405, 8765, 93234 };
    assertEquals(-1, equaltowers.height(bricks));
  }

  //@Test
  public void case88() {
    int[] bricks = { 10, 9, 2, 2, 3, 4, 5, 7, 8, 9, 12, 10, 13, 4, 5, 7, 6, 9, 10, 11, 2, 3, 6, 7 };
    assertEquals(82, equaltowers.height(bricks));
  }

  //@Test
  public void case89() {
    int[] bricks = { 12000, 64444, 1222, 56, 66, 301, 1005, 100000, 15444, 9688, 987, 9888, 1022, 989, 20111, 50154, 12445, 454, 877, 657, 7788, 789, 12, 699, 887, 977, 548, 1, 544, 44133, 654, 68, 879, 669, 451, 3357, 687, 1123, 12, 51, 13, 25, 687, 665, 48, 889, 11202, 21547, 10010 };
    assertEquals(205612, equaltowers.height(bricks));
  }

  //@Test
  public void case90() {
    int[] bricks = { 12, 3, 3 };
    assertEquals(3, equaltowers.height(bricks));
  }

  //@Test
  public void case91() {
    int[] bricks = { 1, 2, 2, 1, 1, 3, 2, 3, 2, 2, 1, 1, 2, 3, 3, 3, 2, 1, 2, 3, 4, 3, 2, 3, 3, 2, 2, 3, 3, 3, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2, 1, 2, 2, 3, 3, 3, 3, 3, 1, 1 };
    assertEquals(57, equaltowers.height(bricks));
  }

}
