package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class RearrangeFurnitureTest {
  RearrangeFurniture rearrangefurniture = new RearrangeFurniture();

  @Test
  public void case1() {
    int[] weights = { 5, 4, 7, 3, 10 };
    int[] finalPositions = { 1, 2, 0, 4, 3 };
    assertEquals(33, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case2() {
    int[] weights = { 3, 6, 2, 4, 10, 3 };
    int[] finalPositions = { 0, 1, 2, 3, 4, 5 };
    assertEquals(0, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case3() {
    int[] weights = { 10, 3, 123, 498, 12, 13, 14, 45, 32, 67, 111, 234, 543, 2, 12, 1, 56, 67, 78, 89, 12, 90, 23, 77, 345, 543, 242, 560, 121, 232, 980, 10000, 12, 1, 6, 98, 67, 44, 21, 456, 3231, 456, 23, 14, 678, 65, 45, 23, 99, 23 };
    int[] finalPositions = { 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
    assertEquals(20597, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case4() {
    int[] weights = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    int[] finalPositions = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 0 };
    assertEquals(980000, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case5() {
    int[] weights = { 5246, 3023, 9853, 5854, 3541, 7131, 8763, 9467, 6738, 196, 4787, 9945, 9931, 5695, 9862, 7717, 6321, 7399, 443, 9038, 8137, 2459, 4276, 9866, 2494, 2930, 7318, 8967, 3970, 5458, 9625, 3325, 6464, 2817, 9363, 3660, 9181, 8988, 901, 1668, 5488, 1557, 6386, 3438, 8821, 1360, 154, 5445, 6805, 9495 };
    int[] finalPositions = { 22, 40, 16, 30, 27, 5, 42, 18, 14, 37, 41, 48, 39, 43, 34, 21, 35, 11, 29, 20, 7, 49, 9, 32, 2, 0, 44, 1, 45, 15, 12, 26, 33, 23, 28, 10, 25, 38, 31, 36, 24, 4, 6, 19, 46, 47, 17, 13, 8, 3 };
    assertEquals(295631, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case6() {
    int[] weights = { 5246, 3023, 9853, 5854, 3541, 7131, 8763, 9467, 6738, 196, 4787, 9945, 9931, 5695, 9862, 7717, 6321, 7399, 443, 9038, 8137, 2459, 4276, 9866, 2494, 2930, 7318, 8967, 3970, 5458, 9625, 3325, 6464, 2817, 9363, 3660, 9181, 8988, 901, 1668, 5488, 1557, 6386, 3438, 8821, 1360, 154, 5445, 6805, 9495 };
    int[] finalPositions = { 1, 2, 3, 0, 5, 6, 7, 4, 9, 10, 11, 8, 13, 14, 15, 12, 17, 18, 19, 16, 21, 22, 23, 20, 25, 26, 27, 24, 29, 30, 31, 28, 33, 34, 35, 32, 37, 38, 39, 36, 41, 42, 43, 40, 45, 46, 47, 48, 49, 44 };
    assertEquals(326402, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case7() {
    int[] weights = { 1, 10, 10, 100 };
    int[] finalPositions = { 3, 0, 2, 1 };
    assertEquals(112, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case8() {
    int[] weights = { 1, 10, 10, 10, 10 };
    int[] finalPositions = { 0, 2, 3, 4, 1 };
    assertEquals(55, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case9() {
    int[] weights = { 2333, 6705, 615, 2226, 1801, 4277, 9443, 7436, 9040, 8685, 6981, 8276, 4970, 1732, 9841, 735, 792, 7485, 7578, 7673, 8550, 2794, 7951, 2734, 8509, 4669, 993, 8125, 4576, 7794, 4972, 3249, 5545, 6424, 5837, 5486, 3005, 4968, 1907, 2698, 6452 };
    int[] finalPositions = { 2, 8, 38, 9, 35, 14, 16, 18, 1, 7, 20, 37, 24, 6, 29, 27, 0, 22, 36, 32, 12, 28, 3, 40, 31, 34, 39, 17, 15, 33, 4, 26, 13, 5, 23, 25, 30, 21, 19, 11, 10 };
    assertEquals(244859, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case10() {
    int[] weights = { 1193, 9112, 7081, 2340 };
    int[] finalPositions = { 2, 0, 3, 1 };
    assertEquals(22112, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case11() {
    int[] weights = { 1779, 6462, 9939, 6592, 932, 8590, 3514, 8374, 155, 4139, 2658, 3757, 815, 6279, 8933, 898, 7028, 987, 2147, 9725, 5945, 6940, 4602, 7307, 8269, 6599, 8394, 2491, 830, 7266, 1100, 2786, 480, 305, 9706, 4157, 2637, 5186, 8693, 6177 };
    int[] finalPositions = { 33, 10, 22, 3, 4, 29, 7, 11, 30, 31, 12, 19, 15, 24, 32, 37, 0, 2, 21, 16, 34, 5, 23, 26, 20, 14, 1, 17, 36, 28, 6, 8, 38, 13, 9, 35, 27, 18, 25, 39 };
    assertEquals(182295, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case12() {
    int[] weights = { 3087, 676, 763, 8123, 346, 1303, 1762, 413, 2856, 6114, 9595, 5778, 2167, 1445, 9983, 3203, 3492, 9009, 9053, 8198, 5784, 9713, 4647, 440, 78, 4089, 1487, 6610, 5205, 1622, 9116, 5226, 668, 6988, 541, 5579 };
    int[] finalPositions = { 15, 35, 25, 10, 0, 13, 18, 26, 29, 24, 17, 1, 11, 5, 2, 22, 4, 16, 32, 12, 33, 31, 9, 14, 6, 8, 21, 23, 7, 28, 34, 27, 3, 19, 20, 30 };
    assertEquals(158765, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case13() {
    int[] weights = { 4575, 9177, 6547, 8452, 4904, 5844, 7050, 7244, 4371, 3111, 4067, 9253, 9030, 5290 };
    int[] finalPositions = { 4, 1, 10, 2, 8, 11, 6, 0, 5, 12, 9, 7, 13, 3 };
    assertEquals(102616, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case14() {
    int[] weights = { 2556, 7198, 3068, 8041, 5408, 2225, 1707, 1725, 7539, 2709, 3404, 3740, 9793, 1897, 8964, 127, 4061, 5543, 3480, 323, 1330, 1554, 9909, 2995, 7455, 3962, 9402, 9195, 8237, 8905, 330, 2486, 5879, 9583, 4258, 2015, 3508, 3106, 2457, 2496, 3063 };
    int[] finalPositions = { 18, 4, 13, 2, 19, 24, 7, 40, 34, 1, 6, 28, 17, 32, 29, 21, 15, 14, 36, 3, 33, 39, 8, 31, 30, 11, 22, 25, 23, 35, 0, 26, 9, 5, 12, 10, 27, 20, 38, 16, 37 };
    assertEquals(188909, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case15() {
    int[] weights = { 1860, 7882, 2792, 5454, 6405, 8530, 3198 };
    int[] finalPositions = { 6, 2, 1, 4, 5, 0, 3 };
    assertEquals(41701, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case16() {
    int[] weights = { 790, 4238, 9657, 2025, 8807, 2905, 9388, 1702, 1855, 4145, 81, 5739, 6581, 7508, 1856, 5906, 7939, 5555, 7463, 9813, 9161, 2381, 5980, 4294, 6212, 3019, 2546, 1801, 1059, 7658, 7394, 9827, 1949, 8462, 9517, 6846, 1712, 2230, 6452, 8145, 7045, 9153, 1879, 1540 };
    int[] finalPositions = { 13, 3, 30, 26, 20, 16, 43, 17, 27, 8, 38, 31, 25, 6, 37, 9, 2, 34, 15, 24, 0, 12, 14, 35, 32, 40, 29, 33, 22, 18, 21, 10, 42, 7, 1, 28, 36, 5, 19, 41, 39, 4, 23, 11 };
    assertEquals(233607, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case17() {
    int[] weights = { 6571, 147, 3040, 8092, 7298, 491, 5794, 8413, 7930, 9993, 3966, 1180, 5591, 9787, 3607, 9825, 9462, 8371, 5619, 5082, 5034, 1824, 7946, 9158, 7358, 8547 };
    int[] finalPositions = { 13, 10, 8, 15, 2, 6, 25, 4, 9, 20, 3, 18, 12, 7, 19, 14, 22, 21, 23, 5, 1, 11, 0, 17, 16, 24 };
    assertEquals(159243, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case18() {
    int[] weights = { 7123, 8496, 247, 8561, 2961, 4759, 3902, 5401, 1453, 3279, 6451, 7380, 7386, 6530, 938, 9971, 771, 5981, 5137, 3489, 8548, 3996, 4955, 5072, 3173, 9613, 9099, 1491, 1321, 2197, 5510, 643, 231, 93, 118 };
    int[] finalPositions = { 34, 22, 9, 1, 8, 13, 17, 24, 33, 20, 10, 0, 23, 19, 28, 4, 31, 32, 26, 27, 3, 12, 18, 21, 25, 16, 29, 5, 11, 7, 2, 14, 30, 15, 6 };
    assertEquals(158313, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case19() {
    int[] weights = { 9680, 8207, 6635, 371, 2970, 8104, 5619, 8892, 2427, 2751, 6501, 4430, 2855, 9163, 8910, 8648, 362, 908, 4471, 9263, 3408, 4518, 21, 4118, 8189, 9231, 5618, 8029, 885, 1682, 1122, 336, 5994, 4592, 6395, 4302, 8205, 9904, 7906, 1685, 5108, 2385, 8898, 7158, 9389, 9248, 1171, 7573, 2110 };
    int[] finalPositions = { 14, 19, 2, 22, 42, 7, 8, 20, 9, 33, 38, 12, 47, 10, 37, 23, 45, 43, 1, 13, 27, 39, 41, 32, 46, 24, 35, 34, 6, 3, 44, 21, 36, 0, 28, 29, 40, 17, 16, 30, 48, 15, 26, 5, 18, 4, 31, 11, 25 };
    assertEquals(258376, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case20() {
    int[] weights = { 3841, 8495, 8136, 9065, 6043, 2587, 98, 536, 9763, 6804, 2829 };
    int[] finalPositions = { 0, 10, 3, 5, 7, 8, 2, 1, 9, 6, 4 };
    assertEquals(55774, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case21() {
    int[] weights = { 3562, 5831, 1529, 974, 4555, 122, 3308, 7298, 2343, 9831, 6548, 1632, 8972, 7901, 5874, 1196, 5042, 885, 931, 4444, 998, 5119, 9657, 4835, 1983, 8327, 8228, 6942 };
    int[] finalPositions = { 26, 4, 18, 7, 8, 14, 1, 27, 9, 20, 12, 25, 17, 3, 2, 10, 5, 19, 11, 13, 16, 24, 0, 23, 21, 15, 22, 6 };
    assertEquals(130034, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case22() {
    int[] weights = { 1816, 4995, 7769, 4199, 5005, 6872, 3523, 4966, 289, 9805, 6404, 250, 6099, 758, 5981, 3027, 8703, 7226, 5606, 9611, 333, 2239, 5196, 2020, 5783, 1813, 6215, 6523, 8196, 5263, 5038, 3957, 6683, 5807, 1059, 3973, 9402, 7461, 204 };
    int[] finalPositions = { 30, 22, 5, 10, 12, 16, 32, 29, 18, 34, 23, 26, 25, 36, 14, 21, 33, 31, 35, 28, 1, 3, 6, 24, 2, 9, 4, 37, 11, 13, 20, 7, 15, 17, 27, 38, 19, 0, 8 };
    assertEquals(191886, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case23() {
    int[] weights = { 3592, 4103 };
    int[] finalPositions = { 1, 0 };
    assertEquals(7695, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case24() {
    int[] weights = { 8752, 2260, 4094, 373, 6847, 3975, 2379, 6758, 9913, 3007, 5731 };
    int[] finalPositions = { 7, 3, 8, 5, 10, 9, 2, 6, 0, 4, 1 };
    assertEquals(60198, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case25() {
    int[] weights = { 7106, 3077, 5688, 8868, 6706, 5275, 2689, 9350, 1342, 1428, 2315, 9603, 2147, 901, 5251, 3430, 2042, 139, 6207, 2210, 6562, 5271, 7028, 9946, 2430, 5616, 1759, 1925, 2157, 1697, 1571, 4650, 109, 7965, 6660, 4558, 9207, 6115, 2972, 7046, 7703, 9616, 3938, 5284, 2319, 3881, 1248, 436, 7456, 9335 };
    int[] finalPositions = { 26, 30, 20, 39, 19, 46, 34, 1, 29, 3, 40, 8, 36, 12, 14, 16, 42, 31, 25, 6, 4, 48, 33, 28, 24, 23, 2, 15, 32, 11, 41, 47, 43, 45, 37, 27, 49, 44, 10, 17, 35, 9, 38, 21, 13, 18, 0, 22, 7, 5 };
    assertEquals(233626, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case26() {
    int[] weights = { 7498, 6208 };
    int[] finalPositions = { 1, 0 };
    assertEquals(13706, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case27() {
    int[] weights = { 3210, 9921, 7985, 2374, 2372, 3778, 5814, 2401, 72, 6088, 8211, 8239, 9484, 3765, 9513, 4625, 8753, 1457, 934, 9104, 9611, 492, 7388, 6875, 2846, 7808, 3528, 2072, 5284, 49, 4002, 8517, 2741, 3482, 7260, 4290, 4795, 28, 3160, 4804, 173, 3285, 2080 };
    int[] finalPositions = { 17, 25, 4, 2, 34, 6, 15, 12, 27, 22, 39, 37, 19, 9, 11, 16, 8, 36, 35, 21, 14, 18, 1, 41, 32, 20, 31, 30, 24, 42, 40, 38, 33, 26, 7, 5, 28, 3, 23, 0, 13, 29, 10 };
    assertEquals(203895, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case28() {
    int[] weights = { 6743, 8618, 5190, 9852, 7217, 2049, 8693, 5252, 6722, 7113, 7869, 4654, 9969, 5838, 6520, 3191, 7960, 5660, 7550, 6186, 3040, 7999, 9053, 9018, 125, 9477, 4831, 6141, 7543, 7295, 4334, 5786, 2541, 4468, 1905, 5594, 7188, 6370, 4158, 9740, 138, 7350, 7357, 9900, 8508, 5069, 3719, 888, 2001, 638 };
    int[] finalPositions = { 33, 11, 41, 49, 34, 21, 24, 7, 46, 0, 5, 36, 4, 28, 10, 27, 29, 43, 19, 30, 38, 6, 40, 31, 35, 9, 42, 25, 13, 39, 45, 48, 16, 26, 23, 32, 2, 18, 44, 22, 14, 8, 47, 20, 3, 17, 37, 1, 15, 12 };
    assertEquals(296156, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case29() {
    int[] weights = { 5065, 8302, 8622, 8704, 2844, 2845 };
    int[] finalPositions = { 5, 3, 4, 2, 1, 0 };
    assertEquals(42070, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case30() {
    int[] weights = { 36, 3675, 555, 7694, 2325, 189, 6288, 5833, 3791, 7774, 5535, 6658, 6202, 2070, 5333, 786, 8941, 9887, 4966, 4645, 2900, 1559, 8525, 8201, 6662, 595, 2010, 9419, 2551, 1967, 4528, 2846, 8827, 2835, 7552, 9197, 6962, 8575, 9711, 3878, 9720, 2525, 7088 };
    int[] finalPositions = { 4, 36, 3, 18, 25, 7, 17, 0, 8, 10, 30, 32, 28, 1, 20, 31, 41, 27, 33, 14, 15, 29, 23, 6, 5, 38, 13, 34, 42, 37, 39, 35, 22, 40, 19, 21, 16, 26, 2, 9, 24, 12, 11 };
    assertEquals(224201, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case31() {
    int[] weights = { 3184, 6999, 1805, 4612, 4113, 2024, 8292, 7113, 5094, 3986, 1329, 3134, 2886, 9202, 1453, 5486, 6684, 9616, 370, 7983, 6211, 650, 2793, 7877, 5059, 1353, 2043, 985, 4309, 3034, 1015, 9820, 3806, 589, 7007, 8828, 2317, 2781, 2294, 3699, 3250, 3906, 2293, 3639, 9611, 9476, 9724, 6487, 450, 2794 };
    int[] finalPositions = { 31, 32, 45, 7, 13, 18, 37, 17, 20, 15, 49, 14, 21, 47, 9, 23, 27, 24, 22, 1, 11, 40, 26, 35, 38, 43, 36, 48, 39, 6, 41, 33, 3, 34, 10, 46, 19, 8, 29, 0, 44, 25, 12, 30, 42, 5, 28, 2, 4, 16 };
    assertEquals(241875, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case32() {
    int[] weights = { 877, 5445, 452, 2056, 3784, 1309, 5130, 8489, 6041, 6665, 8519, 6430 };
    int[] finalPositions = { 11, 3, 10, 8, 9, 6, 0, 4, 2, 1, 7, 5 };
    assertEquals(59663, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case33() {
    int[] weights = { 9565, 1230, 8085, 2840, 1273, 207, 9882, 5640, 1708, 6890, 9192, 7538, 1421, 7830, 5192, 2451, 9778, 6097, 2229, 2932, 2476, 7147, 5419, 2110, 5115, 9288, 929, 2442, 8211, 867 };
    int[] finalPositions = { 8, 27, 28, 5, 26, 7, 0, 14, 16, 12, 13, 6, 17, 4, 22, 18, 2, 10, 25, 29, 21, 23, 9, 1, 11, 20, 24, 3, 15, 19 };
    assertEquals(151366, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case34() {
    int[] weights = { 1, 9, 9, 9, 9 };
    int[] finalPositions = { 0, 2, 3, 4, 1 };
    assertEquals(50, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case35() {
    int[] weights = { 1000, 1000, 1000, 1000, 1000, 1 };
    int[] finalPositions = { 1, 2, 3, 4, 0, 5 };
    assertEquals(6006, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case36() {
    int[] weights = { 10, 10, 10, 10, 1 };
    int[] finalPositions = { 1, 2, 3, 0, 4 };
    assertEquals(55, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case37() {
    int[] weights = { 1, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int[] finalPositions = { 0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 1, 49, 48 };
    assertEquals(50048, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case38() {
    int[] weights = { 1, 1000, 1000, 1000, 1000 };
    int[] finalPositions = { 0, 2, 3, 4, 1 };
    assertEquals(5005, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case39() {
    int[] weights = { 1, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int[] finalPositions = { 0, 2, 3, 4, 5, 6, 7, 8, 1 };
    assertEquals(9009, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case40() {
    int[] weights = { 1, 5, 7, 13 };
    int[] finalPositions = { 1, 2, 3, 0 };
    assertEquals(28, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case41() {
    int[] weights = { 1, 1, 1, 3, 2, 1 };
    int[] finalPositions = { 0, 1, 4, 5, 3, 2 };
    assertEquals(9, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case42() {
    int[] weights = { 1, 99, 100, 100, 100, 100 };
    int[] finalPositions = { 0, 2, 3, 4, 5, 1 };
    assertEquals(604, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case43() {
    int[] weights = { 100, 100, 100, 100, 1 };
    int[] finalPositions = { 1, 2, 3, 0, 4 };
    assertEquals(505, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case44() {
    int[] weights = { 1, 100, 100, 100, 100 };
    int[] finalPositions = { 0, 4, 1, 2, 3 };
    assertEquals(505, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

  @Test
  public void case45() {
    int[] weights = { 1, 10, 10, 10, 10 };
    int[] finalPositions = { 0, 2, 3, 4, 1 };
    assertEquals(55, rearrangefurniture.lowestEffort(weights, finalPositions));
  }

}
