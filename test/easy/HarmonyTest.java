package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class HarmonyTest {
  Harmony harmony = new Harmony();

  @Test
  public void case1() {
    int[] frequencies = { 200, 250, 400, 320, 350 };
    assertArrayEquals(new int[] { 200, 250, 400 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case2() {
    int[] frequencies = { 440, 320, 750, 660, 500, 550 };
    assertArrayEquals(new int[] { 440, 550, 660 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case3() {
    int[] frequencies = { 1960, 1000, 3050, 2341, 7253, 7864, 2000, 2352, 2940, 1534, 7234 };
    assertArrayEquals(new int[] { 1960, 2352, 2940 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case4() {
    int[] frequencies = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
    assertArrayEquals(new int[] { 100, 200, 400 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case5() {
    int[] frequencies = { 114, 7516, 1052, 5628, 3011, 7420, 6213, 4087, 2750, 2768, 9085, 2061, 2226, 7544, 5090, 1184, 5138, 5567, 6967, 4979, 496, 312, 1368, 55, 7032, 3146, 9883 };
    assertArrayEquals(new int[] { 114, 312, 1368 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case6() {
    int[] frequencies = { 525, 8506, 8395, 2103, 4852, 9068, 2755, 1654, 6562, 7097, 3629, 5189, 2086, 4144, 6968, 1407, 4166, 3404, 5563, 4835, 1354, 921, 445, 4804, 7963, 9319, 1423, 1328, 458, 1946 };
    assertArrayEquals(new int[] { 445, 525, 2755 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case7() {
    int[] frequencies = { 8752, 3895, 8671, 8260, 6249, 7758, 5630, 3307, 8607, 3991, 1739, 2517, 1415, 5263, 7117, 2826, 3182, 3135, 5344, 8023, 1234, 7537, 9761, 9980, 9072, 1202, 1337, 3062, 2161, 4006, 730, 7645, 7476, 1694, 5515, 4140, 2089, 6522, 5203, 9172, 4435, 8318, 4583, 6816, 4587, 9654, 6307 };
    assertArrayEquals(new int[] { 3135, 4587, 7645 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case8() {
    int[] frequencies = { 8452, 3449, 6474, 2435, 8194, 4111, 4749, 8211, 9321, 2050, 2957, 4163, 4167, 4998, 7794, 2311, 1392, 9800, 7927, 4906, 5886, 2583, 5611, 5001, 8053, 966, 121, 2381, 5640, 6205, 4386, 2476, 5726 };
    assertArrayEquals(new int[] { 966, 4998, 8211 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case9() {
    int[] frequencies = { 9472, 1377, 4698, 5544, 3298, 4620, 3088, 3124, 1550, 8066, 4257, 8974, 902, 5614, 6158, 9900, 9268, 2414, 9599, 8527, 3712 };
    assertArrayEquals(new int[] { 4620, 5544, 9900 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case10() {
    int[] frequencies = { 4567, 8537, 5989, 9879, 3627, 4274, 8388, 1172, 2018, 3753, 2389, 1192, 1484, 8123, 1745, 8529, 5586, 5364, 160, 5642, 8177, 9576, 8579, 7364, 7686, 9345, 9490, 7714, 5512, 1462, 2627, 8646, 3497, 6704, 6271, 3871, 1530, 7500 };
    assertArrayEquals(new int[] { 5586, 7714, 9576 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case11() {
    int[] frequencies = { 8608, 5809, 5726, 2458, 6543, 6475, 1532, 7223, 3953, 7025, 9895, 4016, 8248, 1277, 6279, 9366, 8747, 1977, 8093, 5852, 9089, 9164, 2232, 6234, 9733, 1107, 5412, 9875, 5449, 9345, 7590, 7575, 1192, 6790, 696, 1736, 365, 7041 };
    assertArrayEquals(new int[] { 1736, 2232, 7223 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case12() {
    int[] frequencies = { 5036, 6980, 1093, 851, 2391, 196, 669, 532, 9990, 2282, 3903, 2971, 2187, 9572, 3681, 7262, 6188, 8530, 4191, 447, 4234, 3709, 1864, 6682, 6002, 2500, 3787, 5215, 5830, 1323, 5908, 9629, 3193, 7506, 5991 };
    assertArrayEquals(new int[] { 196, 532, 5908 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case13() {
    int[] frequencies = { 9830, 1592, 2389, 6043, 9834, 1776, 4720, 343, 8995, 1393, 510, 1314, 678, 1283, 1512, 4796, 3475, 6470, 2751, 880, 990 };
    assertArrayEquals(new int[] { 880, 990, 9834 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case14() {
    int[] frequencies = { 4881, 5630, 2236, 1333, 4146, 3357, 5244, 3080, 3989, 808, 4980, 1358, 915, 1188, 3541, 4023, 150, 610, 9010, 4834, 6697, 5433, 5000, 8864, 6370, 8677 };
    assertArrayEquals(new int[] { 150, 610, 915 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case15() {
    int[] frequencies = { 1692, 9841, 8704, 6516, 2230, 2421, 9818, 6265, 9325, 9344, 1463, 8930, 3547, 7044, 8968, 326, 2684, 5635, 6323, 6643, 5396, 1613, 2865, 9911, 1986, 3127, 3989, 686, 6979, 1051, 6477, 6366, 1127, 4194, 8682, 1012, 3059, 1250, 1248, 4732, 8651, 775, 7981 };
    assertArrayEquals(new int[] { 686, 1127, 5635 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case16() {
    int[] frequencies = { 7779, 3625, 1116, 1646, 5893, 9409, 7940, 7286, 6203, 8019, 1335, 4059, 7063, 3785, 1902, 6685, 4290, 7142, 6703, 6854, 3459, 8529, 3364, 1088, 9053, 1236, 5110, 7076, 1756, 676, 289, 2054, 4158, 5759, 5223, 7489, 8946, 295, 1201, 5172, 4306, 7952, 6602, 3609, 7215, 6378, 3866 };
    assertArrayEquals(new int[] { 4059, 4158, 8019 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case17() {
    int[] frequencies = { 7216, 8031, 178, 6850, 1338, 2700, 3100, 8532, 1518, 7568, 8480, 9967, 2598, 4886, 2342, 5228, 7150, 786, 9616, 6477, 754, 4237, 7731, 9669, 1211, 7520, 7609, 5143, 7000, 450, 4247, 8639, 2942, 2482, 3727, 6739, 6048, 8948, 3301 };
    assertArrayEquals(new int[] { 450, 2700, 6048 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case18() {
    int[] frequencies = { 7997, 3867, 4786, 7572, 5357, 2634, 7290, 552, 313, 4427, 7358, 8057, 6253, 411, 2385, 4354, 2030, 3580, 7883, 1883, 1578, 1369 };
    assertArrayEquals(new int[] { 411, 552, 7572 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case19() {
    int[] frequencies = { 8903, 1013, 1366, 380, 4257, 9245, 7871, 3366, 9620, 7666, 1294, 9442, 9485, 2760, 5401, 6212, 4145, 5336, 2705, 2521, 3790, 2122, 1914, 3572, 2370, 2771, 1595, 888, 8094, 2318, 1189, 7641, 4296, 2491, 5860, 3107, 4787 };
    assertArrayEquals(new int[] { 1189, 1595, 1914 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case20() {
    int[] frequencies = { 5063, 7944, 1248, 2293, 6847, 3963, 8480, 7585, 1353, 2045, 1696, 6499, 4715, 9738, 7347, 8483, 4065, 4947, 9823, 9266, 2869, 2793, 3991, 9562, 6960, 9918, 9755, 2105, 5746, 348, 5826, 1981, 8339, 2466, 5491, 4542, 600, 8098, 6678 };
    assertArrayEquals(new int[] { 600, 1248, 6960 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case21() {
    int[] frequencies = { 5348, 4668, 6317, 674, 8164, 4648, 2818, 9966, 8872, 6486, 6847, 9938, 6242, 5862, 4671, 8167, 6880, 7446, 408, 1639, 1114, 1102, 2517, 8015, 3899, 1453, 8118, 1365, 2927, 466, 3846, 5033, 1697, 8586, 3456, 93, 8289, 1756, 9168, 7413, 5031, 1718, 4843 };
    assertArrayEquals(new int[] { 93, 408, 7446 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case22() {
    int[] frequencies = { 6394, 7829, 1806, 3661, 5839, 9047, 8183, 3773, 2355, 5378, 4886, 2760, 2935, 1904, 6160, 6146, 46, 6848, 7402, 9784, 4168, 782, 4288, 2348, 3403, 9965, 4712, 638, 694, 9418, 938, 4314, 5542, 2529, 3020, 1619, 3717, 5403, 6271, 8243, 8469, 2046, 603, 8287, 560, 2675 };
    assertArrayEquals(new int[] { 603, 938, 4288 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case23() {
    int[] frequencies = { 1244, 198, 6871, 7909, 449, 7328, 8486, 7623, 4891, 884, 944, 1202, 702, 4683, 3525, 8896, 7277, 4799, 2512, 5523, 4312, 5210, 6360, 2913, 8760, 7149, 6684, 2878, 8572, 2335, 6332, 7325, 578, 636, 6664 };
    assertArrayEquals(new int[] { 578, 884, 6664 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case24() {
    int[] frequencies = { 6985, 8694, 9976, 520, 1473, 9642 };
    assertArrayEquals(new int[] { 520, 1473, 8694 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case25() {
    int[] frequencies = { 3392, 564, 2185, 9959, 42, 7667, 3364, 5345, 2411, 8636, 1007, 69, 6661, 563, 9324, 3765, 1308, 7774, 684, 9014, 8217, 8835, 5572, 5242, 2304, 4755, 929, 3418, 2049, 2019, 9932, 7622, 2210, 4670, 1099, 556, 4663, 2445, 2110, 6761, 5575, 4545, 8340, 611, 8190, 4550 };
    assertArrayEquals(new int[] { 42, 4550, 8190 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case26() {
    int[] frequencies = { 4082, 5265, 6023, 4848, 9522, 4629, 7553, 6279, 874, 4030, 2490, 3360, 1353, 280, 8718, 561, 3190, 8584, 796, 688, 6340, 3936, 3989, 7704, 7959, 213, 9568, 554, 3369, 2048, 3069, 612, 4155, 3430, 8896, 3394, 909, 5961, 170, 5463 };
    assertArrayEquals(new int[] { 170, 561, 612 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case27() {
    int[] frequencies = { 9306, 9150, 2725, 2585 };
    assertArrayEquals(new int[] { 2585, 2725, 9150 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case28() {
    int[] frequencies = { 414, 6282, 2390, 1358, 4888, 7533, 1556, 2300, 9491, 6461, 4912, 4184, 2705, 7413, 962, 383, 3609, 5812, 7169, 795, 2287, 3772, 7845 };
    assertArrayEquals(new int[] { 414, 2300, 3772 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case29() {
    int[] frequencies = { 9228, 6961, 7449, 9087, 8527, 1212, 6132, 8646, 1553, 8628, 6111, 5150, 7829, 2049, 2560, 9669, 4168, 3051, 5589, 7747, 8930, 2411, 792, 5986, 8738 };
    assertArrayEquals(new int[] { 792, 1212, 6132 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case30() {
    int[] frequencies = { 2564, 7825, 264 };
    assertArrayEquals(new int[] { 264, 2564, 7825 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case31() {
    int[] frequencies = { 114, 7516, 1052, 5628, 3011, 7420, 6213, 4087, 2750, 2768, 9085, 2061, 2226, 7544, 5090, 1184, 5138, 5567, 6967, 4979, 496, 312, 1368, 55, 7032, 3146, 9883, 5737, 525, 8506, 8395, 2103, 4852, 9068, 2755, 1654, 6562, 7097, 3629, 5189, 2086, 4144, 6968, 1407, 4166, 3404, 5563, 4835, 1354, 921 };
    assertArrayEquals(new int[] { 55, 525, 7420 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case32() {
    int[] frequencies = { 7963, 9319, 1423, 1328, 458, 1946, 4480, 9984, 8752, 3895, 8671, 8260, 6249, 7758, 5630, 3307, 8607, 3991, 1739, 2517, 1415, 5263, 7117, 2826, 3182, 3135, 5344, 8023, 1234, 7537, 9761, 9980, 9072, 1202, 1337, 3062, 2161, 4006, 730, 7645, 7476, 1694, 5515, 4140, 2089, 6522, 5203, 9172, 4435, 8318 };
    assertArrayEquals(new int[] { 730, 4480, 8260 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case33() {
    int[] frequencies = { 9654, 6307, 7175, 8452, 3449, 6474, 2435, 8194, 4111, 4749, 8211, 9321, 2050, 2957, 4163, 4167, 4998, 7794, 2311, 1392, 9800, 7927, 4906, 5886, 2583, 5611, 5001, 8053, 966, 121, 2381, 5640, 6205, 4386, 2476, 5726, 7266, 3215, 9472, 1377, 4698, 5544, 3298, 4620, 3088, 3124, 1550, 8066, 4257, 8974 };
    assertArrayEquals(new int[] { 121, 4620, 5544 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case34() {
    int[] frequencies = { 5614, 6158, 9900, 9268, 2414, 9599, 8527, 3712, 47, 4567, 8537, 5989, 9879, 3627, 4274, 8388, 1172, 2018, 3753, 2389, 1192, 1484, 8123, 1745, 8529, 5586, 5364, 160, 5642, 8177, 9576, 8579, 7364, 7686, 9345, 9490, 7714, 5512, 1462, 2627, 8646, 3497, 6704, 6271, 3871, 1530, 7500, 4501, 8608, 5809 };
    assertArrayEquals(new int[] { 160, 1530, 9900 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case35() {
    int[] frequencies = { 2458, 6543, 6475, 1532, 7223, 3953, 7025, 9895, 4016, 8248, 1277, 6279, 9366, 8747, 1977, 8093, 5852, 9089, 9164, 2232, 6234, 9733, 1107, 5412, 9875, 5449, 9345, 7590, 7575, 1192, 6790, 696, 1736, 365, 7041, 7893, 5036, 6980, 1093, 851, 2391, 196, 669, 532, 9990, 2282, 3903, 2971, 2187, 9572 };
    assertArrayEquals(new int[] { 196, 532, 5852 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case36() {
    int[] frequencies = { 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251 };
    assertArrayEquals(new int[] { 11, 13, 17 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case37() {
    int[] frequencies = { 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569 };
    assertArrayEquals(new int[] { 257, 263, 269 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case38() {
    int[] frequencies = { 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887 };
    assertArrayEquals(new int[] { 571, 577, 587 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case39() {
    int[] frequencies = { 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997, 1009, 1013, 1019, 1021, 1031, 1033, 1039, 1049, 1051, 1061, 1063, 1069, 1087, 1091, 1093, 1097, 1103, 1109, 1117, 1123, 1129, 1151, 1153, 1163, 1171, 1181, 1187, 1193, 1201, 1213, 1217, 1223, 1229, 1231, 1237, 1249 };
    assertArrayEquals(new int[] { 907, 911, 919 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case40() {
    int[] frequencies = { 1259, 1277, 1279, 1283, 1289, 1291, 1297, 1301, 1303, 1307, 1319, 1321, 1327, 1361, 1367, 1373, 1381, 1399, 1409, 1423, 1427, 1429, 1433, 1439, 1447, 1451, 1453, 1459, 1471, 1481, 1483, 1487, 1489, 1493, 1499, 1511, 1523, 1531, 1543, 1549, 1553, 1559, 1567, 1571, 1579, 1583, 1597, 1601, 1607, 1609 };
    assertArrayEquals(new int[] { 1259, 1277, 1279 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case41() {
    int[] frequencies = { 9337, 9341, 9343, 9349, 9371, 9377, 9391, 9397, 9403, 9413, 9419, 9421, 9431, 9433, 9437, 9439, 9461, 9463, 9467, 9473, 9479, 9491, 9497, 9511, 9521, 9533, 9539, 9547, 9551, 9587, 9601, 9613, 9619, 9623, 9629, 9631, 9643, 9649, 9661, 9677, 9679, 9689, 9697, 9719, 9721, 9733, 9739, 9743, 9749, 9767 };
    assertArrayEquals(new int[] { 9337, 9341, 9343 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case42() {
    int[] frequencies = { 200, 250, 320, 400 };
    assertArrayEquals(new int[] { 200, 250, 400 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case43() {
    int[] frequencies = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
    assertArrayEquals(new int[] { 100, 200, 400 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case44() {
    int[] frequencies = { 1960, 1000, 3050, 2341, 7253, 7864, 2000, 2352, 2940, 1534, 7234 };
    assertArrayEquals(new int[] { 1960, 2352, 2940 }, harmony.mostHarmonious(frequencies));
  }

  @Test
  public void case45() {
    int[] frequencies = { 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1, 9997, 9998, 9999, 9995, 9991, 8887 };
    assertArrayEquals(new int[] { 1, 2, 4 }, harmony.mostHarmonious(frequencies));
  }

}
