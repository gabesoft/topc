package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PayBillTest {
  PayBill paybill = new PayBill();

  @Test
  public void case1() {
    int[] meals = { 1000, 1200, 1300 };
    int totalMoney = 2500;
    assertArrayEquals(new int[] { 1, 2 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case2() {
    int[] meals = { 100, 200, 350 };
    int totalMoney = 300;
    assertArrayEquals(new int[] { 0, 1 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case3() {
    int[] meals = { 150, 200, 350, 400 };
    int totalMoney = 900;
    assertArrayEquals(new int[] { 0, 2, 3 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case4() {
    int[] meals = { 6584, 6733, 6018, 5840, 2723, 4902, 4260, 5375, 6745, 1234, 3000, 8222, 2472, 4348, 1716, 9995, 415, 1234, 2345, 5679 };
    int totalMoney = 70630;
    assertArrayEquals(new int[] { 0, 1, 3, 4, 5, 6, 8, 9, 11, 13, 14, 15, 16, 17, 19 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case5() {
    int[] meals = { 3, 5, 6, 7 };
    int totalMoney = 10;
    assertArrayEquals(new int[] { 0, 3 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case6() {
    int[] meals = { 4149, 4209, 9324, 9970, 4436, 8704, 2278, 4295, 4403, 2478, 2433, 1899, 9885, 3650, 8559, 7095 };
    int totalMoney = 43891;
    assertArrayEquals(new int[] { 3, 5, 7, 9, 12, 14 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case7() {
    int[] meals = { 804, 5324, 6497, 5651, 9540, 5699, 8118, 5049, 1066, 4465, 4295, 1600, 8672, 2371, 903, 3304, 1482, 2677, 6285, 752, 851 };
    int totalMoney = 75923;
    assertArrayEquals(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 15, 16, 17, 18, 19 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case8() {
    int[] meals = { 2353, 8959, 748, 7432, 604, 3292, 2996, 7447, 2776, 2617, 9995, 4030, 2787, 5808, 3246, 8305, 384, 4251, 6717, 3988, 7548, 2623, 4507, 4410, 7407, 2169, 996, 2056, 5634, 6494, 3503, 590, 4360, 9832, 7445, 9391, 8573, 7837, 3989, 582, 5035, 859, 212, 8558, 3676, 9723 };
    int totalMoney = 212836;
    assertArrayEquals(new int[] { 0, 1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case9() {
    int[] meals = { 6468, 5676, 3410, 1007, 5192, 3588, 9921, 3234, 5729, 2820, 2199, 8981, 3245, 8496, 2993, 5625, 8737, 8253, 7524 };
    int totalMoney = 79965;
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 9, 11, 12, 13, 14, 15, 17, 18 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case10() {
    int[] meals = { 3016, 1139, 1075, 7723, 283, 9468, 8198, 2519, 9904, 1083, 4414, 3202, 2369, 2647, 5348, 6014, 9578, 6578, 9375, 8964, 8131, 1204, 7142, 3235, 5108, 3413, 3603, 7088, 6344, 3817, 2550, 2272 };
    int totalMoney = 8497;
    assertArrayEquals(new int[] { 0, 2, 11, 21 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case11() {
    int[] meals = { 3644, 2929, 5937, 8694, 1947, 6997, 9300, 4399, 9951, 124, 999, 8574, 2115, 2064, 2388, 5279, 1887, 5591, 5770, 5729, 1243, 7905, 179, 955, 2716, 4534, 9652, 6958, 3927, 5739, 4025 };
    int totalMoney = 135013;
    assertArrayEquals(new int[] { 0, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 17, 18, 19, 21, 22, 24, 25, 26, 27, 28, 29, 30 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case12() {
    int[] meals = { 5431, 2201, 8596, 6165, 2563, 7936, 2494, 3656, 5045, 8126, 1508, 368, 6152, 3578, 1336, 4830, 3422, 2299, 6086, 347, 69, 5271, 931, 7027, 8885, 4741, 7260, 6321, 8652, 4992, 346, 8045, 3043, 5634 };
    int totalMoney = 3577;
    assertArrayEquals(new int[] { 17, 19, 22 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case13() {
    int[] meals = { 2027, 7376, 679, 9589, 5781, 316, 1757, 9170, 1093, 4713, 62, 2268, 269, 4278, 2589, 3515, 2537, 1948, 8653, 599, 7957, 8171, 5036, 8796, 3824, 1685, 3647, 8004, 3577, 2801, 1680, 2268, 8202, 9181, 4267, 1814, 142, 4128, 9635, 7584, 9698, 7354, 6767, 8262, 3944, 8271, 5549, 9810, 8123, 1773 };
    int totalMoney = 2026;
    assertArrayEquals(new int[] { 6, 12 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case14() {
    int[] meals = { 9560, 6506, 597, 415, 4067, 5665, 7585, 8551, 4846, 263, 5486, 2275, 3902, 4915, 8570, 4393, 5940, 6126, 5457, 4672, 4781, 3064, 6767, 6877, 2261, 843, 5279, 8295, 9639, 6306, 8587, 1772, 1508, 6309, 4255, 240, 2193, 8495, 7474, 3749, 4663, 4582, 1219, 9004, 1938 };
    int totalMoney = 6642;
    assertArrayEquals(new int[] { 3, 9, 12, 25, 42 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case15() {
    int[] meals = { 1388, 990, 2874, 9531, 9497, 9152, 3405, 5372, 2174, 3030, 8551, 2092, 8033, 9897, 7111, 1425, 7499, 1612, 4141, 6325, 7331, 1014, 1738, 8625, 7660, 840, 2322, 9189, 1517, 5122, 4417, 573, 6862, 3101, 932, 2174, 1123, 5627, 9939, 7896, 8215, 4066, 7963, 6299, 8086, 1712, 5752, 3258, 8736 };
    int totalMoney = 4704;
    assertArrayEquals(new int[] { 1, 2, 25 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case16() {
    int[] meals = { 7117, 754, 3344, 6955, 6350, 4347, 1189, 46, 9711, 8875, 6268, 1311, 8896, 4878, 89, 6863, 3695, 8608, 7015, 4231, 9651, 9063, 3181, 5638, 8214, 7516, 7893, 3789, 9400, 9546, 7540, 145, 6946, 9569, 1994, 5711, 5963, 7873, 3522, 4314, 3098, 143, 8188, 8382, 9185, 9498, 9764 };
    int totalMoney = 6507;
    assertArrayEquals(new int[] { 6, 22, 34, 41 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case17() {
    int[] meals = { 1020, 6131, 7841, 5949, 8782, 8187, 8140, 8149, 5387, 1256, 2785, 5165, 3992, 8989, 1442, 6122, 2841, 9777, 9566, 2775, 2299, 5653, 1690, 9660, 4382, 3695, 7194, 6753, 4784, 9940, 8597, 4627, 7416, 5786, 2333, 2104, 1433, 6896, 2032, 6417, 760, 4610, 4304, 5864, 6134, 9845, 7018, 4960 };
    int totalMoney = 4494;
    assertArrayEquals(new int[] { 0, 14, 38 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case18() {
    int[] meals = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int totalMoney = 50;
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case19() {
    int[] meals = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90 };
    int totalMoney = 2250;
    assertArrayEquals(new int[] { 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case20() {
    int[] meals = { 6584, 6733, 6018, 5840, 2723, 4902, 4260, 5375, 6745, 1234, 3000, 8222, 2472, 4348, 1716, 9995, 415, 1234, 2345, 5679 };
    int totalMoney = 70630;
    assertArrayEquals(new int[] { 0, 1, 3, 4, 5, 6, 8, 9, 11, 13, 14, 15, 16, 17, 19 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case21() {
    int[] meals = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100 };
    int totalMoney = 100;
    assertArrayEquals(new int[] { 49 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case22() {
    int[] meals = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 9999 };
    int totalMoney = 9999;
    assertArrayEquals(new int[] { 49 }, paybill.whoPaid(meals, totalMoney));
  }

  @Test
  public void case23() {
    int[] meals = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int totalMoney = 50;
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 }, paybill.whoPaid(meals, totalMoney));
  }

}
