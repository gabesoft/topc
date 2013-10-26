package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ComplexIntegersTest {
  ComplexIntegers complexintegers = new ComplexIntegers();

  @Test
  public void case1() {
    int[] realPart = { 0, 1, 0, 1, -1, 2, 0, 0, -3 };
    int[] imaginaryPart = { 0, 0, -1, 1, 1, 0, -3, 5, -2 };
    assertArrayEquals(new String[] { "zero", "unit", "unit", "prime", "prime", "composite", "prime", "composite", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case2() {
    int[] realPart = { 2, 3, 4, 5, 2, 3, 4, 5, 2, 3, 4, 5, 2, 3, 4, 5 };
    int[] imaginaryPart = { 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5 };
    assertArrayEquals(new String[] { "composite", "prime", "composite", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "prime", "composite", "prime", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case3() {
    int[] realPart = { 2, 3, 5, 7, 11, 13, 17, 19 };
    int[] imaginaryPart = { 0, 0, 0, 0, 0, 0, 0, 0 };
    assertArrayEquals(new String[] { "composite", "prime", "composite", "prime", "prime", "composite", "composite", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case4() {
    int[] realPart = { 0, 0, 0, 0, 0, 0, 0, 0, 0, -19, 23, 29, 31, 37, -41 };
    int[] imaginaryPart = { 15, 2, -3, 5, -7, 11, -13, 17, 0, 0, 0, 0, 0, 0, 0 };
    assertArrayEquals(new String[] { "composite", "composite", "prime", "composite", "prime", "prime", "composite", "composite", "zero", "prime", "prime", "composite", "prime", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case5() {
    int[] realPart = { 99, -39, 0, 0, 97, 1003, 9998, 1119 };
    int[] imaginaryPart = { 0, 0, 35, -129, -2, -232, 9997, 1120 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "prime", "prime", "prime", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case6() {
    int[] realPart = { 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997 };
    int[] imaginaryPart = { 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998 };
    assertArrayEquals(new String[] { "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case7() {
    int[] realPart = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int[] imaginaryPart = { 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 87, 89, 91, 97, 101, 9997, 9993, 9991, 9989, 9983, 9987, 9979, 9977, 9973, 9971, 9967, 9961, 9959 };
    assertArrayEquals(new String[] { "prime", "composite", "prime", "composite", "composite", "prime", "prime", "composite", "prime", "composite", "prime", "prime", "composite", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case8() {
    int[] realPart = { 9900, 9901, 9902, 9903, 9904, 9905, 9906, 9907, 9908, 9909, 9910, 9911, 9912, 9913, 9914, 9915, 9916, 9917, 9918, 9919, 9920, 9921, 9922, 9923, 9924, 9925, 9926, 9927, 9928, 9929, 9930, 9931, 9932, 9933, 9934, 9935, 9936, 9937, 9938, 9939, 9940, 9941, 9942, 9943, 9944, 9945, 9946, 9947, 9948, 9949 };
    int[] imaginaryPart = { 9951, 9952, 9953, 9954, 9955, 9956, 9957, 9958, 9959, 9960, 9961, 9962, 9963, 9964, 9965, 9966, 9967, 9968, 9969, 9970, 9971, 9972, 9973, 9974, 9975, 9976, 9977, 9978, 9979, 9980, 9981, 9982, 9983, 9984, 9985, 9986, 9987, 9988, 9989, 9990, 9991, 9992, 9993, 9994, 9995, 9996, 9997, 9998, 9999, 10000 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "prime", "composite", "prime", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case9() {
    int[] realPart = { 0, 0, 0, 1, -1, 1, 1, -1, -1, 2, -2, 0, 0, 1, 1, 2, 2, -1, -1, -2, -2, 3, -3, 0, 0, 1, 1, 3, 3, -1, -1, -3, -3, 2, 2, -2, -2, 0, 0, 4, -4, 1, 1, 4, 4, -1, -1, -4, -4 };
    int[] imaginaryPart = { 0, 1, -1, 0, 0, 1, -1, 1, -1, 0, 0, 2, -2, 2, -2, 1, -1, 2, -2, 1, -1, 0, 0, -3, 3, 3, -3, 1, -1, 3, -3, 1, -1, 2, -2, 2, -2, 4, -4, 0, 0, 4, -4, 1, -1, 4, -4, 1, -1 };
    assertArrayEquals(new String[] { "zero", "unit", "unit", "unit", "unit", "prime", "prime", "prime", "prime", "composite", "composite", "composite", "composite", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case10() {
    int[] realPart = { -4039, 9376, -1290, 6006, -8786, 7508, -1070, -4733, -6811, 1475, 4901, 503, -6733, -2782, -2643, -1461, 2188, 8613, -5039, -9289, -7410, -4236, -2812, 2927, 3921, 3052, -430, -2903, 1830, 2597, -8001, 8509, -6491, -8982, -9365, -8339, 6896, -7292, 1946, 700, -3309, -5795, -2660, -6728, -1651, 5986, 9169, 3111, 4847, 1056 };
    int[] imaginaryPart = { -647, -590, 3270, 2732, 4137, -8059, 7523, 1240, 2443, -2588, -974, 3980, 7276, 2656, 2869, -3563, -4910, -8686, -4869, 5686, 9544, -5107, -6507, 1569, -6773, -230, 2466, 6370, 9844, -1619, 8300, -1222, -43, 4669, 4168, -9440, -1007, -8745, 1766, 7603, 1459, 4175, 7006, -1834, -3116, 5999, 1156, -9039, -9859, 4435 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "prime", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case11() {
    int[] realPart = { 8109, -7084, 6383, 1996, 6034, -9208, 2212, -2183, -2680, -5945, -1239, -812, 4526, 9214, -3554, 394, 6623, 3415, -5554, -7228, 7961, -6914, -7556, -4157, 3612, 2728, 5558, -4853, 9855, -537, 1249, -5698, 9834, -3941, -4971, -6663, -5631, 1518, -9749, -1908, 3435, -692, -7409, -326, 3862, 8859, -9989, -1664, -1127, 3917 };
    int[] imaginaryPart = { -9969, -7880, 2851, -6178, 8220, 1955, -9368, -7546, -3492, -5758, -6172, 7567, -4253, 6918, -9867, 5552, 6673, -8822, -3092, -6151, 4851, 7484, 9434, 1046, -1465, 2898, 1805, -9397, 5452, 7098, -3200, 3213, 3762, -7848, 5186, -6508, -914, 9148, -4775, -4412, -2740, -8692, -5995, -3094, 3023, 7276, 3620, 9842, 8230, -2250 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case12() {
    int[] realPart = { -7468, -4486, -177, 544, -7509, 5130, -4235, -8597, 1642, 2128, 645, -9175, -3261, 4623, 5103, -6214, 3363, 4845, 2267, -850, 755, -3738, 2806, -4683, 2611, -3088, -7200, 6997, -5568, 2398, -7888, -1706, -7150, 7987, 6978, -6682, -9338, 8381, -9416, 5806, -8472, 7662, 7081, -1173, -1421, -5583, -262, 9058, -2229, -8009 };
    int[] imaginaryPart = { 6079, 1162, 616, -2407, 351, -941, 8694, -4562, -2403, 7180, -2407, -351, 629, 3181, 9877, 7067, 6730, -6709, 8499, -5769, -5018, -1167, 7772, -2104, -2765, 1272, 4855, -9325, 101, 8529, -7325, 9425, -8103, -7022, -7718, -560, -3507, -2015, 1958, -4629, -3315, 5399, -9774, -5068, -4844, 928, -1953, -700, 8500, 4795 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "prime", "composite", "composite", "prime", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case13() {
    int[] realPart = { -1239, -8856, 8804, -4304, 4945, 4931, 1016, -6599, 1207, 2669, -1359, -2610, -2679, 3268, -9487, -4331, -2498, 9220, 5913, 1744, 7824, -5558, -6317, -8657, -8166, 5761, -5508, 4796, 6892, 9018, 7452, 3057, -353, 952, -8830, -1232, -5966, -6227, -2253, -8564, -5170, -5485, -1474, -6279, -8592, 2652, -1030, 8987, 5372, -592 };
    int[] imaginaryPart = { 4581, 870, -4611, 9702, -974, 7509, -4478, 4716, 2406, 6642, 2703, -5951, 6396, -6961, 9778, -4689, -7695, 4867, 322, 7095, 1350, -924, -698, 9413, 5011, -8598, 2102, -8644, 7825, 8052, -8605, 9803, 8652, -1770, 4294, 9617, -4220, 6363, 7127, 4758, -7421, 9079, 9325, -7186, 8779, -8763, 9501, -5345, 4680, 2865 };
    assertArrayEquals(new String[] { "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case14() {
    int[] realPart = { -4693, -9909, -2823, 2489, -4183, 96, -9332, -9314, -6122, 2458, 5487, 2536, -7472, 9074, -3219, 5599, 3667, -3392, 711, 9743, -9213, 2211, 4457, 5428, 4831, -3694, 8850, -7947, -2627, -1916, -1916, -9200, -5659, -7704, -6507, 8197, -222, 8143, 7356, 5879, 4260, -985, 9713, -1902, 6015, -9598, 290, -3582, 4888, 3865 };
    int[] imaginaryPart = { 6714, -7216, -5327, 2924, 2450, 7206, 1858, 8063, 1722, 8986, -8403, -4989, -4167, 8511, 5370, -2961, 2679, 2872, -4702, 8153, -5693, 4478, 1397, 9748, 7115, -3291, -4893, 8601, 7348, 1447, 6658, -1628, 2987, 8872, -4482, 6827, -2412, -3426, -4953, -9558, -3937, 2182, 5332, 9503, -8504, -3153, 4398, -7959, -6060, 8260 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case15() {
    int[] realPart = { 5370, 2378, 7974, 9224, 1471, -4082, -6735, -8959, -5388, -6326, 4798, 36, 8340, 6038, -3334, -8023, 5835, 8020, 280, 3380, -1298, 4796, 5755, 2286, -669, -5401, -6214, -7510, -264, -8720, 9146, 7765, -7025, -7187, 9157, 7848, 3984, -4488, -382, 7910, 7661, -2015, 8306, 366, 9802, 1482, -7221, -241, -7072, -2558 };
    int[] imaginaryPart = { -3790, -9905, 5138, 7275, 5161, 924, -2943, 4688, 6317, 7892, -5142, -7536, 581, 7224, -3286, -5318, -2356, -7917, -8545, 6340, 8287, -4010, 3723, 4934, 7112, 9790, -3732, -941, 7525, -4033, -920, 3623, 271, 958, -9452, 2201, -4307, -4385, -9929, -7358, 5148, 4339, 7941, -2694, -2772, 5415, 3891, -2788, -7043, -4610 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case16() {
    int[] realPart = { 1658, -6829, -4721, -4500, 4497, 7485, -1296, 2264, 4681, -8247, -1808, 4390, -9095, -3878, 8224, 6409, 8707, -6848, 7972, 7979, 1256, -3018, -1704, -5887, 3912, 6076, -6795, -1887, -1175, 8440, 1758, -6916, 9849, 6294, -1683, -6952, -2422, -7069, -2435, -2145, -6501, -1925, 8982, -4503, 8185, -1733, -5227, 2005, -693, -7266 };
    int[] imaginaryPart = { 4452, -694, -9885, 8183, -5036, -783, -3985, -8752, -5881, 640, 5907, -9871, -3555, -9265, -9250, -9647, -2000, 3152, 5919, 9522, 1140, -9411, -9681, 1176, 6096, -9672, 6021, 9868, -7672, -2650, 80, 2274, 7048, 9057, 4559, 8662, -9104, -7414, -4921, -2794, -5256, 9044, 6499, -8359, -984, -846, -6500, -5324, -7051, 8382 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case17() {
    int[] realPart = { 8992, 7142, -9385, -9178, 2128, 7095, 6740, -6099, 8855, 4867, -7743, -6851, 5110, 3990, -385, -1966, -270, -345, -1674, 3102, -9255, -2549, 4359, -4661, 3006, 392, -7192, 8636, -1457, -3587, -7171, -3838, 6573, -911, 6236, 4918, -496, 1520, -2664, -4791, -4017, -9767, 2737, -7666, 9230, 6994, -9056, 1673, -4016, 1498 };
    int[] imaginaryPart = { -1878, 3349, 2381, -730, 6866, -7937, 5948, -7299, 5116, -9288, -9482, 1576, -4415, 3192, -8581, -1511, -5335, -6557, -2112, -8999, 5754, -6144, -9253, -5243, 7664, -7842, 8332, 6685, -5358, -4065, 8105, 387, -9766, 7795, -1196, -6844, 1011, 6170, 8610, 7375, -9089, 201, 2889, 6091, 1864, 8594, 5762, -6409, 2694, -763 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case18() {
    int[] realPart = { -1776, -8918, -5477, -3917, 9277, -5602, 1076, 6860, -3176, -5567, -8632, -5631, -295, 9903, -7323, 8446, -966, -619, -3769, 5526, -6079, -2495, 843, 6300, -3142, 3502, -4207, 8472, 688, -8512, -5123, -6693, -3392, -11, 7054, -7637, -342, -3375, 4259, 2147, 7184, -6115, 1038, 4883, -3450, 9789, -3214, 8722, 9166, 73 };
    int[] imaginaryPart = { 7451, -7995, 2724, 1797, -3417, 3881, -9047, 3003, 5030, -8630, -5108, 3265, 5582, -5035, 4787, 1434, 2083, 3801, 3761, -343, -6098, 1828, -6045, 4286, -9472, 9209, -4657, -5443, 6627, 8721, -8436, -3372, 9951, 7083, -3490, -9756, -4727, 3611, -6308, -7724, -1640, 5217, -4611, -5212, 5468, -4721, 5657, 129, -438, -9026 };
    assertArrayEquals(new String[] { "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case19() {
    int[] realPart = { 6025, -1134, -5719, -3926, -7194, 3362, -1412, -223, 4213, 9240, 7104, 3777, 6380, -9252, -6952, -387, 4017, -5132, -8369, -7302, -9376, 4507, -4825, 3202, 3091, 6774, 2511, 4082, 2505, 1849, 425, 8454, 9603, 1319, -1512, 7352, 819, -5334, -6709, 6354, -9886, -5547, -2926, 7989, 1268, 3148, 1471, -4023, -9095, 5141 };
    int[] imaginaryPart = { -40, -862, 7033, 15, -4807, 1066, -1695, 5029, -2628, 9708, -9791, -2648, -6821, 8264, 2633, -2139, -3574, 9276, 9214, -5877, -2260, 450, -3977, -3361, 6201, -7619, -162, 9056, 7727, -9499, -104, 2995, 5144, 8739, 8390, -700, 6298, -8325, 7447, 1172, 3140, 7602, 270, 1784, 8250, 1333, 9150, -5948, -2402, 8457 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "prime", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case20() {
    int[] realPart = { 7068, 1731, -9988, -1201, 4364, -7269, 7832, 9437, 7587, -9634, -611, -8456, 135, 5723, 159, 3778, 5442, 6374, -7465, 6611, 8868, 70, 9745, -7320, 6233, -5503, -9890, 1463, -491, 1235, -8065, -1740, 3330, -3195, -2243, -3824, -4395, 3463, 263, 1406, -559, 5347, -7192, -9014, 6810, -4075, 9199, -2638, -6507, -5661 };
    int[] imaginaryPart = { -6368, -5243, -3742, 1895, -9343, -7666, 9135, 7952, -5427, -4093, -5676, 32, -40, -5391, -6101, -7138, 917, 6817, 1494, -9416, 3358, 5706, -8141, 3179, 2442, 1788, -40, 2733, 4090, 6627, -5612, 3268, 8091, -4800, -7996, 1172, 1545, 422, -4223, -7607, -2437, -8729, -6375, 6116, 21, -4537, 4849, 3948, 8056, 5946 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "prime", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case21() {
    int[] realPart = { 1232, -4664, 7918, 6558, -5976, -4659, -567, 6439, 1208, 7982, 1933, 6255, 9073, -9736, -7791, -6367, -8918, 8987, -1995, -3565, -9871, 653, -139, 3841, 191, 8045, -3222, 4283, 1552, 5203, -6030, 7918, 7034, -6087, -4380, 4238, -7741, -8633, -2375, -4389, 7711, 3595, -1859, -2741, -916, 6853, -797, 7954, -3919, -8846 };
    int[] imaginaryPart = { -1408, -4208, 7505, 5585, 3832, 730, 5407, -9874, 1941, 7126, -9117, -2380, -3054, -4167, 1811, -6466, 7133, 1303, 396, 457, -8071, -1159, 6338, -5564, 9352, -9419, 3911, 8683, 5993, 4537, -3307, 3136, -6167, -3899, 9652, 5433, -8676, -2914, -5489, 9349, 6582, 249, 7031, -7392, -7223, 4363, 9588, 9508, -1548, -6682 };
    assertArrayEquals(new String[] { "composite", "composite", "prime", "prime", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case22() {
    int[] realPart = { -7688, -9133, 3708, 6171, -6333, -956, -8652, -2633, -7452, -1332, -3217, 5739, -5182, -7374, 3135, 8232, 1440, 4489, -549, -8947, 6461, 6178, 2537, 5637, 4885, 3063, 9544, 2673, 5469, -5344, -7750, 1230, 7222, -9459, -5455, -3584, -9482, -2904, 5425, 1198, 1291, -9039, -7648, -2241, 7384, -1121, -7397, -9070, 1186, 3788 };
    int[] imaginaryPart = { -6246, 5870, -7373, -7681, 3016, -8223, 192, -4508, -459, -8802, -6116, -554, -1869, 2518, -3825, 2014, -8397, 169, -8788, 7968, 1078, -9671, 5793, 6274, 3634, -8792, 1198, 6907, 5257, -4626, -2303, -8727, 643, 9566, -5286, -255, -9928, 1759, 2368, 3481, 4893, 4191, -4062, 5982, 9404, 871, 1446, -9090, -8696, -394 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case23() {
    int[] realPart = { 3029, 19, -7295, -1294, -7760, 7014, -2979, -8986, 6343, -9278, -7073, -5289, 7610, -1658, -7696, -1085, 3396, 1590, -367, -5673, -8089, 5884, -4931, -3573, 8042, 8120, 9359, -9050, -978, 8222, 811, 4574, -9143, 2363, -5528, 5733, 8898, 5911, -4180, -7864, 2959, -7897, -7041, 9882, -4902, -2885, -2670, -313, -2905, -14 };
    int[] imaginaryPart = { 7729, 1634, 4159, -6522, 5135, -8193, 7596, -8581, 9553, 9172, 631, 7545, -7394, -4947, 6826, -4103, 3, 3997, 9712, -6243, 2307, 286, -4729, 5275, 6588, -9474, 994, 2932, 5928, -8803, -1559, -7068, 673, 4531, -8288, -857, -7283, -2318, -9304, -578, -5582, 6177, -331, -3281, -6072, -7872, -9402, 5563, 3425, 7166 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case24() {
    int[] realPart = { 2064, -7476, -5654, -1736, -6266, -1434, 2375, -9034, -301, -2, -4851, -8279, 1499, -754, 8435, 9284, 7166, 7666, -437, 5616, 6459, 2888, 3545, -5051, 5684, -5934, -9288, -8238, -1540, 1443, 2678, 4920, -1327, 6639, -7973, -9676, 738, -1047, 8906, -2452, 5995, -7674, 1706, 4582, -9797, 6615, 1556, 7573, -1860, 200 };
    int[] imaginaryPart = { 7770, -3919, 2228, 6954, -4884, -1752, 7505, 9215, 4895, -8061, -9952, 8194, -4486, -7382, 5146, 4487, -9507, -3037, 3795, 9688, 9695, 7177, -2879, -5505, 9268, 2563, 4641, 9897, 5188, 6891, 8059, 2536, 8668, 8054, -2760, -8087, -4282, 7369, -6716, 1507, 8136, 7972, -1295, -1266, -7250, -406, -4657, -630, -909, 8124 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case25() {
    int[] realPart = { -6266, 3525, 8422, -9001, 7775, -233, 8434, -5245, 3165, -866, 9426, 4970, 8357, 4107, -9454, 8193, 4402, -3715, -9553, -7449, -624, -5253, -6431, -608, 4173, -4588, -611, 2639, -1147, 8936, 6822, -5355, -6494, -8330, 3461, -8582, -9084, -6049, -7063, 1355, 7600, -9044, 5625, 1154, 9491, -6669, -2567, 6244, 6971, 7716 };
    int[] imaginaryPart = { -799, 3626, 3540, 5247, -5524, 7164, 9014, 2214, 218, 4183, 7562, -7416, -6026, -1461, -5099, -7554, 3947, 1078, -4836, 1288, -9032, 7831, -3570, -8253, 1938, -5965, -4087, -6105, -136, -6453, -6600, -868, 9249, -936, -4426, -7746, 8491, -3616, -8488, 6586, -526, 3444, -5910, 9392, 8840, 7700, -4754, -5688, -9199, -4264 };
    assertArrayEquals(new String[] { "composite", "prime", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case26() {
    int[] realPart = { -9297, -7792, 5826, 9070, 3779, -7193, -5403, -6, -8245, 368, 3996, 8022, 8909, -6515, 339, 8746, -5863, -7153, 4256, 5253, -6907, -5221, 7110, 5020, 9960, -2400, 3752, 5357, 7697, -9906, 1494, 3881, -4049, 6989, -2068, -7613, 4745, -1235, 5374, 1942, -8165, 6029, 6371, -2907, -7926, 2558, -5257, 1331, 5032, -5617 };
    int[] imaginaryPart = { 483, 2911, 6433, 1066, -439, -5184, 1994, 9882, -411, 5663, 2484, -6711, -7087, -341, -3422, 8805, 8648, -2759, -807, 9139, 6322, -6704, -9359, -5758, 4935, 192, -7646, 6181, -5290, -7283, 2294, 9398, -4279, 7978, -4233, -9995, 6888, 2667, -5300, -2370, -1978, -7473, 4207, -1197, 9220, 8168, 3082, -2938, -4541, 7031 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case27() {
    int[] realPart = { -1808, 8164, -8308, 7633, -9124, 4163, -49, -4173, -811, -4536, 4891, -6724, -1364, 2437, 9093, -6586, -1624, 120, -5933, 6299, -8256, -1157, -4855, -1736, -8810, 6152, -7979, 5919, -2760, 7781, -8243, -1199, -360, -5641, -8789, -3167, -5015, -3012, -7121, 3708, -141, 9658, -4382, 9517, 8870, -5803, -9797, -9225, 4603, 7434 };
    int[] imaginaryPart = { -2634, -5695, 8425, -7503, -9640, 4754, -990, -1917, 3826, 5749, 4838, -9495, 4884, -9896, -4049, 7719, 2126, -2423, -4245, 1900, -6495, -8623, 5141, -8692, 4739, -3384, -4684, -5827, 6010, -8047, -9353, 5568, 7838, -7541, 7975, 6557, -7223, 7220, 469, -5712, 2186, -2265, -4715, -8621, 4449, 1698, 2092, 5807, 9207, 1281 };
    assertArrayEquals(new String[] { "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "prime", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case28() {
    int[] realPart = { -4626, 7056, 3487, 7335, -3249, -1121, -6336, -6821, -7392, 2441, -3817, 7585, -855, -4992, -4180, 5825, 8678, -2957, 4985, -7567, 9877, 3125, 7149, -1662, -1794, 1147, -6740, -3152, 2810, 5628, 2090, 3476, 6383, 1928, -3050, 9938, 7170, 2540, 1888, -8982, 4928, -2343, 1971, 842, -6725, -3328, 5852, 9721, 3435, 5155 };
    int[] imaginaryPart = { 1651, -9933, 1313, 583, 3768, -1577, 8960, 8588, 1317, -4261, -3245, 4374, -3282, -5467, -6860, 1364, 397, -8536, 391, -8086, 2730, -6135, 311, -9179, 4825, -5920, 6401, 1703, 5850, 4032, -2601, -9281, 4525, -166, -4773, 3055, 3554, 5999, 7690, 5920, 278, 6152, 3703, 4902, 4271, 1753, -9005, 8789, 1949, 6049 };
    assertArrayEquals(new String[] { "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case29() {
    int[] realPart = { 4843, -206, 369, 6831, 4701, 1497, 2417, 9249, -2605, -9587, 9341, 5006, 4483, 7808, 4980, -7314, -1396, -9396, -7205, 6824, 559, 7145, 8129, -5454, -2102, -1682, -3353, 6776, -5925, -7797, -4963, 465, -8638, 3980, 6866, 6803, -4677, -7149, 8591, -8404, -4581, -8326, -7943, -2101, 1054, -9556, 9151, 2803, -7347, 9690 };
    int[] imaginaryPart = { 2693, -9698, 4502, 9432, -9144, 7787, -1265, -990, -9893, -9262, 9885, 2282, -7156, -3829, -5476, 672, -2314, 1998, 7166, -4455, -7689, -8573, -2841, 1877, -8288, 5705, -2774, -7256, -6451, 1030, -881, 7573, 1195, 5980, -5493, -3830, 8713, -2054, -2293, -3407, -2845, 9711, 891, 2587, -4553, 3095, 406, -5120, -5541, -6824 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case30() {
    int[] realPart = { 5050, 7729, 2003, -1317, -3366, -8818, -8659, 3938, -7934, 655, 945, -3684, -9686, -8744, -4996, -6312, -7576, 1563, -828, 5727, 613, 4671, -1845, -3630, -1026, -7110, -2472, 3876, -5084, -1388, -3552, -2130, 7558, 194, -7092, 2652, 5384, -5451, -4924, 9268, 9677, -4091, -8062, 7670, 7077, 9160, 6160, 3401, -1298, -5924 };
    int[] imaginaryPart = { -3645, -8030, 7393, -9482, 7908, -4943, 1945, -6980, -6244, -6688, -1886, 1542, 3496, -9519, 5048, 4571, -2031, -7695, -8975, 639, 3381, 7153, 5068, 2470, -700, -4156, 8635, 6057, 5741, -8854, -2352, 7779, -2549, 3064, 6003, -4901, 2605, 767, -1914, -8843, -352, 5517, -5455, 2476, -9301, 5025, 4209, 3979, 7154, 5036 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case31() {
    int[] realPart = { 1122, -2099, 9478, -7942, -8211, 9200, -1028, -6192, -3201, -5033, -8160, 5716, 8803, 3907, 2278, -1974, -5106, -4606, 74, 1217, -839, 9261, 6425, -9909, -2020, 1864, -8350, -3577, -7053, 7368, 8995, 2085, -1514, -3215, -3280, 4843, -3547, 8122, 7491, -7981, 1388, -6046, 1671, -1710, 978, -1903, -4025, -8608, -3410, -7646 };
    int[] imaginaryPart = { -3370, 5813, 4224, -258, 1385, 8588, -4616, -3672, -4500, 3001, -7098, 8701, 5307, 2604, 8127, -3459, 1644, -7076, 5245, 5087, -9403, 1722, 8536, 3516, 6443, 6340, -1730, 418, 4359, 2652, 5760, 8918, -9509, -1796, -7071, -5889, -990, 9042, 3374, -657, 7870, -1758, 1368, -981, 4212, 5952, -1526, -4895, -8297, 5685 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "prime", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case32() {
    int[] realPart = { 5420, 5801, 5507, -1633, 4959, -2646, -5183, -3080, -4164, -4136, -2043, 912, 473, 4152, -1149, -155, -8772, 471, -8342, 1093, -9298, -7449, 3687, 4252, 5703, 3622, -3137, -8099, 1929, -2782, 1411, 1701, 2612, -455, -2327, -7905, 2626, -9437, 4142, 1, -2532, -4884, -6981, 1155, -1839, -468, -2667, 4207, 4547, -5004 };
    int[] imaginaryPart = { -2416, 9343, 7355, -5642, 3405, -8834, -4489, 7070, 3908, 7890, 4495, -3423, -7281, -5183, 2435, 4669, 7878, 2563, -9019, -4039, 9429, 2482, -9410, 1160, 5893, 1835, -5168, 2458, 2189, -9532, -6195, -4660, 5662, 4920, -7916, 8072, -6201, 3688, -9102, -3891, 9172, -5696, -18, 6851, -1552, -4489, 8571, -8381, 9833, 6104 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case33() {
    int[] realPart = { -3032, -6603, 4470, 9400, 4005, -6458, -998, -9276, 941, 5813, 8509, -2626, -9894, 1076, -798, 6928, -7589, 2420, -2891, 9811, -7736, 5654, -7048, -7843, -3352, -5865, -2372, -444, 1153, 4053, -5575, -4793, 9296, -9802, -5903, 6309, -3606, 6605, 2189, -4432, -3634, -2882, 2507, 935, -4719, 6801, -1582, 8655, -9840, -8792 };
    int[] imaginaryPart = { 2804, 6461, -7506, 1182, 6167, -8714, -5892, -1292, 2235, -6830, 668, -9725, 8561, 6623, 4344, -5520, 5936, -2449, -3368, 4551, 9134, 1388, 744, 3580, -7991, -2635, 502, -17, 4207, -8347, -7060, -3934, 2797, 7961, -9355, -6525, 8591, 9782, -4365, -2829, 6875, -7755, 7451, 3982, 4065, 114, -4291, 2359, 98, 1237 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case34() {
    int[] realPart = { -8983, 99, 8220, 1839, -3799, -1138, -9562, -5163, 7113, -2958, 7596, -5588, 2216, 5057, -5966, -557, 1425, 6266, -3777, -2894, -8762, 9000, 2475, 9407, 2126, -4376, -1412, 2486, 6032, 2690, -6671, 2605, -1788, 4277, -5703, 3751, 236, -9053, -8843, -6392, 2072, 5820, -6999, 1815, 6892, -3839, -659, -2558, -7274, -4704 };
    int[] imaginaryPart = { 3853, -8429, 448, 2932, -6572, -8057, 2498, 6805, 4253, 3438, -8915, -7143, -2991, -4386, -6270, 3883, -3868, 2284, -1554, 2900, -2417, -3839, -6597, -8557, -8385, 9085, -657, -8278, 1731, -3526, -7041, -2825, -5808, 9378, 6617, 7430, 4676, -1120, -8299, 9352, -2156, -8854, 2162, 9851, -2189, -3058, 3867, 7113, 6138, -9360 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "prime", "composite", "prime", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case35() {
    int[] realPart = { -7248, 7172, 9968, -1051, 9836, 7528, 6135, -8305, -561, 1490, 7810, 2828, -6224, 3197, 9092, 5144, 3447, -8293, 9384, -4055, -9830, 5729, 2888, 5725, 4908, -3782, 3138, -7864, -8320, -3806, 1380, 2895, -3990, -130, 2856, -9793, -4335, -6151, 4758, -802, 7782, -2838, 3127, -8416, -9610, -1177, 3672, -6035, -9488, 9391 };
    int[] imaginaryPart = { 1152, 9049, -7033, -9136, 2155, 4962, 6646, 6534, 705, 5069, -9199, 9196, -4022, 5271, 7570, 3639, -6906, -4300, -3119, 1692, 4973, 7380, -6440, -6207, 3022, -2495, -8787, 4872, -9537, -6171, -5195, -6484, 2764, 1553, 2020, 1168, -5063, -1650, -6876, 1145, -8061, -4622, 9718, 8786, -6139, 5238, 7308, 1679, -5003, -9488 };
    assertArrayEquals(new String[] { "composite", "composite", "prime", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "prime", "prime", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "prime", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case36() {
    int[] realPart = { -5868, -4996, -4006, 8291, -8489, -9746, -3139, -4153, 2112, 7237, 5690, 9662, 9021, 7450, -1098, -509, -8052, 4546, 3301, 2524, 2086, 7437, -5100, 3671, -4330, 6910, -7851, -844, 5008, -4395, 8936, 2430, 4953, -9830, -7908, -9538, -1767, -9130, -143, 1222, -8366, -7215, -4694, 4117, -2715, -2633, 7110, -5512, 2939, 3977 };
    int[] imaginaryPart = { 3767, -1692, -1500, 302, 5817, 5984, 6199, 8740, 468, 4522, -6166, 8835, -5545, 1178, -8755, -3587, -3807, 4646, -3022, 93, -4260, -9727, 201, 6283, 7180, -430, 3698, -1844, -7091, 6004, -7742, 5686, -6614, -8625, 1665, -3437, -6787, 890, 5843, 8934, 8478, 1878, -4499, 77, 8317, 6607, 407, 1814, 2491, -1732 };
    assertArrayEquals(new String[] { "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case37() {
    int[] realPart = { -9133, -7286, 9994, 5257, -3342, 5546, 2639, -9344, -5921, 6371, -7037, -875, 2689, 7114, 416, 6885, 2458, -8928, 4148, -5806, 1571, 8129, 3689, 1158, -4512, -2324, -7550, 917, -1823, 3568, -3747, -7496, -6222, 5886, -1315, 2604, -119, -7303, 1025, -7724, 9378, -970, 5783, 9666, 2282, 2226, 1708, -3160, -2456, -9505 };
    int[] imaginaryPart = { -4026, 3774, 2961, -196, 1787, 462, -7479, 8963, 5599, -8838, 9014, 4451, -8804, 3441, 6360, 8981, -3978, 3187, -2771, 6662, 4834, -9305, -8174, -5514, 1331, -5553, -7563, -8135, -4408, 7976, 8167, 5574, 3340, -1040, 7058, 965, -5232, 5978, 8751, -6554, 2526, -7736, 6322, -9543, -7076, -8359, 5623, 9436, 687, -2929 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case38() {
    int[] realPart = { -7660, -6959, 9661, -446, -2364, 5475, 6606, 4832, 7644, -9620, -1845, 5385, 8716, 7521, 8981, -3992, -3572, 4991, -8591, -2834, -2487, -7134, -1370, 1448, 4321, 2074, 9948, -2944, 7494, -6257, 2871, -8272, 8259, 8047, -2263, -4360, -5074, 4279, -8266, 1797, 6784, 1427, 1382, 3931, -4436, -5183, -9287, 2436, 1728, -524 };
    int[] imaginaryPart = { -5255, -4270, -1018, 6189, -6250, 164, 380, 5555, -4839, 1339, -1679, 3404, 9480, -927, 5113, 8954, -4355, -1820, 6857, 9939, -5707, 7228, 6518, 6893, -8762, 5077, -666, -3273, 478, -1026, -5658, -1043, -2571, 517, 9957, -4844, 6303, 4666, -9874, 1389, 3458, -5151, 9880, 328, -588, -8160, 3907, -8792, 8681, -5982 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case39() {
    int[] realPart = { 2395, 6049, -9657, -4395, -1088, -8001, -574, -8850, 2397, 7662, 288, -9648, -1787, 1342, 9268, -9446, -1796, -1133, 2540, -8310, -8482, -9659, 3765, -1105, -8453, 9155, -2539, -9556, -9669, 8242, 7475, -2729, 6885, -2450, -8933, 8180, -9093, -4497, 2921, 3184, 7864, -6988, -9139, -1342, 1784, -8741, -786, -177, -7347, -5523 };
    int[] imaginaryPart = { -5215, 416, -4662, 5196, 8055, -2870, 990, -2061, 3138, 9091, 3090, 7008, 6433, -7146, 1237, 2042, -5166, -2063, -1092, -2856, 4385, -8605, -628, 5307, 5495, -8355, 845, 4337, 9117, 5543, 5581, 8912, 312, 5921, 9681, -7724, -7259, 8735, -916, 4851, 3385, -4682, -3049, -2926, -5246, -8120, 3705, -9954, -277, -6040 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case40() {
    int[] realPart = { -2759, -8374, 3554, 9887, 1985, 7097, 8224, -4852, 6933, -3583, -4909, 8678, -1061, -8420, 1696, -7721, -5444, 3681, -6170, -331, -4322, 3176, 9554, -2002, 7631, 7621, -2431, 9241, -1324, -824, -1119, 3800, -5170, 2136, 3996, -4016, -9497, -6495, -2544, -2259, -3926, 3278, 4949, -6065, -4177, 903, 8030, -228, -2269, 2334 };
    int[] imaginaryPart = { 1222, 7349, 4348, -8889, 4267, -3755, 6070, -8062, -5027, 6469, -4156, -1019, 8972, -2038, -2263, -4770, 9523, 5685, 2538, 3620, 2281, -6825, 8760, -6900, -9644, -6045, -4045, 9543, -733, 3469, -6265, -4536, -5287, -1011, 5810, -7730, 9922, -6336, 7941, -8599, 1226, 1385, 1854, 7219, -2383, -8645, 5493, -6161, -2816, 8708 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case41() {
    int[] realPart = { -715, -4375, 3023, -9204, 3393, -890, 363, -8514, -4912, -8875, -3499, -7495, -1738, 1644, 3467, -843, -4917, -5960, 1473, 7201, -7519, 5940, -8873, 8822, 3203, 5738, -9050, 2455, 9714, -5800, 7475, -5511, -559, -8661, -3011, 1796, 8218, 6746, 6551, 3113, 8587, 6901, -5753, -274, -5369, -3628, 9896, -7291, -2, -1502 };
    int[] imaginaryPart = { 5704, -4981, -4644, -8712, -5274, -2346, -9783, 1370, 7542, -6287, -7870, -1298, 7027, 6681, -7503, -7245, -1655, 690, 678, -5512, -9816, -3843, -1065, -603, -5366, -2629, -1695, 1638, -5641, 4483, -7677, 3417, 8481, 6712, -6342, 9547, 7522, 9896, -9816, 2344, -9765, 9780, -9114, -5510, 4069, 8021, 6502, -4742, -6775, -3158 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case42() {
    int[] realPart = { -4162, -4191, 6418, 9992, -4228, 8800, 1442, -592, 462, 2221, 3886, 200, 1461, -7188, 3922, -1109, -6178, -1396, -896, 7874, -4191, 9025, 6338, 6196, -1585, -6023, -1368, 4273, 9753, 9959, -7978, -3912, 1462, -5580, -282, 6078, -7557, 3785, 9482, 1156, 3201, -9538, 5053, 9275, -913, -4021, -164, -247, -9583, 5934 };
    int[] imaginaryPart = { 8964, -3680, -7479, 8925, -5999, 9916, 5332, 6417, -3312, 2499, -9093, -2223, 8337, 2822, 7142, -6005, 7404, 1599, -5439, -5281, 3770, 8770, -5595, 2753, 5810, -515, 996, -7764, -9683, -7486, 5632, -9281, 6969, -2238, -4116, 7714, -2459, 7232, 228, -7919, 2422, -6045, 1302, 2275, -1114, -9668, 1297, -6616, -5305, -8832 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case43() {
    int[] realPart = { 3374, 9963, -5842, 1109, -8542, 8775, 1867, -2227, 780, -2231, 5649, -455, -8512, -5913, -3269, 8334, -7831, -8878, 7718, -1989, 1006, 9450, 1374, -8927, 192, -6233, 1601, 3886, 5645, 5317, 7637, 4403, 4385, 9458, -2044, 2143, -2972, -8349, -918, -9332, -7206, -6022, -8342, -936, -2041, 5663, 1940, 3609, -7560, -8100 };
    int[] imaginaryPart = { -4827, 8474, -8233, 9913, 5444, -7719, -8386, 9008, 4690, 9308, 4745, 6099, -9302, -2018, -8761, 5139, -5506, -6767, 8136, -5689, -7415, -573, 705, 1833, 6605, 3247, 9887, 7489, 2917, 4278, -9757, -1283, 2862, -5782, -204, -7568, 3452, -825, 9164, 5859, 9425, -3215, -1453, -584, 1313, -4472, 1567, -2758, -2865, 6890 };
    assertArrayEquals(new String[] { "composite", "composite", "prime", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case44() {
    int[] realPart = { 5492, -5616, -4624, 5559, -3086, -8726, -5566, -1156, -3701, -1682, -9505, 5203, 6051, -6650, -9202, 8972, 6321, -1818, 6202, 5403, 3158, 2393, 1356, -2427, -2777, 7544, -4682, 2542, 3590, -8097, 7979, -3171, 6551, -7381, 6292, 1667, 3999, -1820, -2901, 4602, 8508, 2586, -3775, -4078, -283, 9799, -9168, 5989, 5526, 3392 };
    int[] imaginaryPart = { 6051, -3283, -5181, -3848, -3281, 7366, 3553, 3202, -5836, -9598, -821, -9487, 4196, 1479, 9304, -4061, -2420, -9011, 4204, -3996, 7530, -8738, 2701, -5786, -5310, -9169, 2537, -6781, 7203, 6242, -3790, 288, 1306, -9173, 3596, 804, 6473, 5985, -835, -6079, 423, -3214, 3115, 1345, -77, 9663, -2929, 7069, -2813, 3843 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case45() {
    int[] realPart = { -4526, 1982, 5481, 8649, -96, -194, 3497, -4061, 8367, 1990, -36, 4046, 7821, -741, -8713, 4951, 1963, -4161, -6443, 6402, -2153, 2476, 5078, -7347, -7719, -6397, -5978, -4308, -1498, -2732, 7238, 4293, -791, 1488, 5985, -9012, -628, 4390, -9727, -7135, -9060, 1574, -5040, 6735, 630, 2519, -1430, -6428, -4590, -4289 };
    int[] imaginaryPart = { -1871, 5483, -2435, -4778, -1131, -3498, -9590, 9484, -1533, -7530, 2731, -8039, -527, -5146, 9527, 773, 7596, 9017, -1786, 1334, 3380, -3713, 7206, 6819, -2844, -4914, 9833, 6716, 608, -7164, -942, -2357, -8024, -4518, 2104, 3032, 5653, 5314, -7025, -1129, 7357, 3796, 2421, -9070, -216, 879, 702, 7355, -8096, 8463 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case46() {
    int[] realPart = { 1368, -6093, -549, 4089, -9204, -2528, -9022, 5682, -4967, 6402, -7703, -596, -4060, 6692, 3368, -4433, -428, -5287, 4400, 1180, -6969, 9286, -7960, 1719, -757, -6915, 7969, 189, -7123, -4120, 5331, -9564, 702, 4287, -2561, -5365, 19, -9190, -7120, -3121, -9632, -419, -8115, -5138, -8418, -7288, -7867, -3724, 9387, -789 };
    int[] imaginaryPart = { -8584, -7805, -4477, 5569, 1, 5752, 8197, 1713, 6407, 1572, -349, -7028, 3498, 5126, -343, -3277, 6511, 4945, 9638, 5469, -940, -8031, -5709, -4140, -8323, 4847, -8736, -7285, 855, 9405, 5081, 8116, 1220, 5813, -6079, -2004, 789, 5472, -4437, 7210, 1040, -9452, 5549, -2680, -274, 9202, -4235, -8959, -4382, -342 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case47() {
    int[] realPart = { -5460, 9959, -2004, 2614, -1868, -7667, -9174, -1363, -4408, 2770, -8689, -3900, 3371, 6232, -8876, 514, 5662, -1291, -7628, 7164, -960, 9035, -8194, 5767, -1118, -1649, -3694, 6101, -7900, -6330, -950, -4847, -2559, -1468, -1507, 4420, -7463, -5333, -5405, -8803, 3699, -1346, -9969, -1329, 9185, 5074, 1599, -8373, -3376, -8410 };
    int[] imaginaryPart = { 706, 752, -6464, -3083, 4218, -9998, 9539, -841, 5794, -315, 6149, -556, 5642, 7855, -1894, 1790, -2049, -4655, -3001, -9867, 1655, 9429, 3218, -2271, -6937, 9234, -5650, -7484, -1712, 4662, 8701, 3281, -388, -5270, -1624, 2589, -959, 1148, 8263, -4045, -5025, 5696, 1534, 9461, 8434, -6930, 4202, 4718, 677, 6170 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case48() {
    int[] realPart = { 1376, -3388, -8041, 8711, 2893, 3981, 7741, 7278, -2202, 8559, 3323, 1636, -5919, 9493, -407, 7220, -5574, -1275, 5871, 8637, -2926, 108, 3573, -9670, -4314, -6870, 7238, -6502, 5105, -5362, -3404, 9498, 5722, 6544, -7752, 1673, 5974, 471, 7218, 7422, -8410, 626, 479, 7345, -7970, 562, -257, 6249, 5604, -3085 };
    int[] imaginaryPart = { 597, 2142, 6659, -7107, -1348, -6164, 7384, 7935, -285, -2881, -4622, 6930, 4555, -6478, 6837, 5866, -1815, 8707, 180, -4649, 7684, -4436, -6617, 3167, 8115, -172, 9026, -7585, 1098, -66, 7881, -7991, 7512, 4755, 8725, -7198, 5443, -7799, 1272, 51, 1679, 7280, -1471, -6884, 4606, 5400, 8070, 9027, 9810, -7889 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case49() {
    int[] realPart = { 2176, -903, 6648, 5387, -6356, 2101, -12, 3070, -2551, 596, 8482, 9348, -3595, 6686, -2806, -9307, -4834, -195, 3060, 5009, 3128, -9869, 8838, -5002, -5620, 114, 9720, -1350, 6846, -7895, 5413, -2340, -1106, -1249, -3535, -8582, 4279, -8138, 3002, 6613, 3852, 3794, -8529, -4168, -9035, -119, 1492, 7850, -858, 2328 };
    int[] imaginaryPart = { 7297, 250, -5895, 8744, -172, 2185, -7750, 8103, -6438, 7060, 1732, 3123, -4892, -6963, 8575, -8907, 3098, 3095, -3371, 3215, 2781, -4773, -6226, -4104, 8651, 3855, 9851, 4964, -7398, -2650, 3448, 7332, -9608, 1907, -6970, 7823, 2693, -1385, -6370, 8410, 8511, -9936, 2622, -896, 9729, 7536, -1515, -6510, -7240, 7186 };
    assertArrayEquals(new String[] { "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case50() {
    int[] realPart = { -6679, 1491, 4226, 3819, 6758, 4149, 1282, -9616, 1513, -9355, 9064, 9346, -5170, -1191, 7192, -2550, -8590, -8325, -3144, -477, 3307, 946, -6621, -2688, 4699, 9967, 9375, 9805, 329, -8413, -710, 8527, 2093, 7261, -6903, -4430, -576, -9380, -2356, 5335, 4465, 8744, 9625, 3928, 523, -3391, 1461, -1650, -6904, 6823 };
    int[] imaginaryPart = { -9466, 2154, -1789, 8128, -8266, -4541, 3894, 2126, -9293, 4305, -5612, 728, 5511, 9837, 390, 2004, -6606, 7026, 7950, 9073, -2606, 3725, -8786, 7505, 174, -4152, -155, 7994, -2786, -9131, 8262, -9544, 2857, -6827, -9706, 5914, 8348, -9730, 8752, -2886, -5107, -5414, 2297, 4643, -2355, 4749, -3188, -3216, 8440, 4081 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case51() {
    int[] realPart = { 5535, -512, -1741, -3949, 3826, 7483, -8264, -7236, 253, -9980, 1793, 6882, 6396, 5720, 6508, 8129, -1209, 4266, -3648, 6515, 5025, 4832, -8758, -7006, 6756, -794, 4444, -9142, 342, -8367, 1022, 1309, 3080, -468, -2827, 2266, -4114, 4229, -3378, 8925, 4870, 4043, -1972, 5657, 9973, -9879, 1481, -9054, 962, 8012 };
    int[] imaginaryPart = { 73, 2053, -4541, -5664, -3389, -5185, -2901, -1156, 9603, 1288, -4052, -6324, -9779, 2856, 8876, -1239, 1846, -7667, -1555, -3528, 3511, -1828, 2622, -9418, -1848, 6566, -7153, -5491, -937, -6456, 2048, 8684, -5525, 8486, 3067, -9180, 1974, 2335, 4532, 5818, -8877, 9205, -5924, 5444, -2703, 3243, 2278, 5815, 696, 5664 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case52() {
    int[] realPart = { -893, -4361, 7865, -3655, -6824, -1608, 7439, 1124, -1099, -9136, 5302, 1135, 1982, 8208, -4120, -2295, 2289, -7850, 4145, 8241, 1502, 593, -7058, 2324, 2334, 2697, 3984, -8211, 4643, 9099, 5527, 5394, 1514, -258, -926, 2764, 2725, 7885, -4512, -3698, 6622, 5022, 20, 2475, 765, 457, 5360, -9254, -2470, 5024 };
    int[] imaginaryPart = { -4141, 3808, 566, -2025, -1108, -5822, 4889, -8234, -1097, 1777, 852, 8880, -7371, 9917, -4601, -6437, 1732, -4244, -4278, -9050, 312, 398, -8321, -925, 8149, 9817, 9385, -8477, -535, -9317, -3405, 5828, 1425, -3655, -3115, -5373, -5494, -4120, -9589, -9590, 4971, -9650, -5268, 2154, 9922, -8538, -4908, -842, -2115, -1662 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case53() {
    int[] realPart = { -6470, 8276, -2825, -4561, -5863, -8783, 5227, 8180, -9401, -1490, 5346, -509, 2065, -2903, -477, -4688, 2243, -5717, -7899, 7595, -8872, 3973, 7681, 7466, -2890, 2947, -8813, -2662, 2292, -7391, 1334, 3021, 2166, -2601, -2288, -1669, 9448, -5608, 9442, -2232, -9663, -3676, 2860, -3820, 2493, 9255, -4161, 6554, 247, -4475 };
    int[] imaginaryPart = { 73, 4390, 6687, 7535, 6323, 6395, -200, -1143, 2330, -5374, -3714, -4285, -5713, -5572, 2963, -6460, -2923, 6678, 7432, 6462, 7608, 3830, -9168, 5047, 9540, 4206, 4694, -5399, 3566, 66, -2321, 7013, 9384, 6958, 7886, -975, -3085, 4762, -2497, 4495, -4448, -4387, 5598, 3821, 879, 1164, 5376, -2296, -890, 3368 };
    assertArrayEquals(new String[] { "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case54() {
    int[] realPart = { 6206, 9375, 685, 9655, -5778, 1831, -867, -9884, -3676, 5248, -2247, -7583, 3545, 8886, 5964, 8655, -9702, 105, -6837, -2627, 6689, 2119, 5124, 2954, 3512, -8214, 2890, -9358, 252, -3622, -5568, -6993, -380, 7651, -6851, -5944, 6451, -9991, -28, -159, -4871, 7191, 7899, 4846, -1052, -9841, -2943, -5663, -9444, 6220 };
    int[] imaginaryPart = { -1537, 5215, 1230, -5118, -7220, 6810, 8197, -7082, -6312, -2156, -2699, 5727, -7620, 9442, 8385, 3964, -7754, -4328, 4068, -9877, 1461, -1311, -5109, -3371, 2138, 3172, 1003, 3171, -2623, 882, 9236, -4780, -4391, 8569, 4888, 9801, -388, -3001, -8109, 8666, -3935, 4345, 3195, 4609, -9851, -5326, 9826, -2625, -4389, -5089 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "prime", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case55() {
    int[] realPart = { -6218, -6630, -6641, 5120, -8542, -8653, -1817, -5859, -5971, -9778, -5040, -9698, 8809, -764, -3710, 7790, 3124, 6061, 4329, -4798, 1425, 6968, 1965, 2865, 9332, 7381, -259, -3717, 9091, -2767, 7967, -292, -1000, 7129, -5978, 1533, 1841, -5036, -4965, -7879, 2504, 144, 8160, -2088, -7748, -4237, -1621, 2251, 9010, 3489 };
    int[] imaginaryPart = { 3144, 6766, -1382, 9295, 929, 2204, -9450, 1063, -5342, 3296, -6555, -6985, -4147, 4994, -3500, 2771, 7228, -7034, 8049, -6797, 6019, 1740, 2763, -2879, 522, -2215, -6710, 1253, 5965, 3212, 5067, -292, -4503, 9456, -9423, -4189, -5139, 8013, -7646, 4188, -3211, -4751, -7587, 5334, -8826, 2687, 3706, -4485, -6651, -8208 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case56() {
    int[] realPart = { -3169, -6299, 5045, 2423, -962, 9082, 862, -8601, -7910, 3484, 7513, -4287, 9330, -4349, -6397, 8893, -9613, 7095, 8406, 3186, -6018, 9274, -5481, -6011, 9838, 8620, 4796, -3422, 6642, -9191, 1772, -9506, -8459, -1359, 9431, 885, 6395, 5195, 5616, -8714, 5582, -5104, 1616, 9163, 8608, -5408, 7480, -4767, -8458, -818 };
    int[] imaginaryPart = { 3155, 5393, -6101, -7777, 1083, -9118, 7901, 302, -5545, -2712, 9234, 4179, -5793, 1764, -3658, -94, 7916, -2893, 9839, 7203, 4429, -6795, 3262, 8632, -7320, 5728, -1655, -5604, -3786, -3227, 2844, -373, 7939, -8974, 4345, 9272, 4750, -9731, 2238, 5215, 634, -4225, 8152, -6194, 8974, 3677, 2965, -3875, -8648, 7864 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case57() {
    int[] realPart = { -7509, -147, 3832, 3830, -7404, -8596, 934, 6377, 6574, 697, -7688, 1128, 6148, -4688, 889, 5039, 6483, 3689, 6213, 5388, 934, -8900, -2088, 6150, 4358, -8794, -2874, -6016, -5791, 2317, 7341, -3556, -3591, -2020, -9052, -8126, -5053, 9593, 3790, 3345, -310, 6025, 7003, 4562, -6170, 9280, -3839, -1110, 3119, -8154 };
    int[] imaginaryPart = { -8505, -5269, 2962, 7431, 6031, 821, 1262, 1445, -6197, -580, 1719, 7395, -4375, 6453, 4470, -8094, -1365, -8317, 1514, -1330, -6169, 1935, 2616, 19, -152, -2778, 5931, 8886, -1825, 6784, 1649, -6953, -3969, -5604, 8681, -1295, -191, 4096, 2264, 1199, -7686, -1586, 5080, 2960, -3282, -302, 458, 1145, -1223, -6070 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case58() {
    int[] realPart = { 6059, -2645, 1180, -9337, -7515, 9909, -7460, -440, -5880, 6029, -5343, 6030, 4449, 2498, 8594, 8758, 9649, -9622, -3403, 8648, 382, 422, 1590, 6360, 8780, -2574, 1655, -5883, 9323, 4305, 548, 2209, 6201, -4711, -4221, 2695, 9846, 8199, 9661, 9953, -9816, 3305, -20, 4788, 8805, -6306, 4912, -5365, -4721, 4783 };
    int[] imaginaryPart = { -1201, 8307, -503, 4686, -1718, -4077, -5887, 8551, 1131, -2912, 5263, -7570, 79, 6446, -6237, 3869, 7779, 4223, 5376, -6896, 5231, 3685, -9977, 9800, 7359, 1688, -4658, -9481, 5950, 3044, 1232, 7420, 838, 4639, 3492, 6428, 6483, -5602, 8950, 2141, -2068, -6511, 981, 5671, 7864, 6767, 4186, -4095, -2165, -291 };
    assertArrayEquals(new String[] { "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "prime", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case59() {
    int[] realPart = { 4338, -6483, 3462, -7225, 7621, -8928, 9046, 3546, -9873, 1651, -4833, 4464, 7848, 8624, -8999, -7257, 2487, -7848, 5967, -6069, 5384, 9006, -7990, 6145, 7084, -9877, -5079, -206, 7993, 1354, 5084, 9016, 5995, -7415, 4333, -2896, 3703, -1384, 3028, 5064, -11, -4724, -7564, -785, -5505, 6237, 4377, 7485, -5031, 5233 };
    int[] imaginaryPart = { 6712, 7570, 9202, -9843, -4698, 3730, -5030, 6658, 1561, 5542, 6652, -1568, 5869, -5331, -2661, 875, 2499, -2220, 9637, 5274, -7009, -1889, 2601, 3517, -5073, 6570, 4545, 9432, 7659, 368, -783, 1778, 7559, 2784, -3126, 9917, 9714, -7311, -9420, 7904, 948, -5233, -6115, 2452, 8991, 9871, 8769, 1669, 9570, -679 };
    assertArrayEquals(new String[] { "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case60() {
    int[] realPart = { 0, 0, 0, 1, -1, 1, 1, -1, -1, 2, -2, 0, 0, 1, 1, 2, 2, -1, -1, -2, -2, 3, -3, 0, 0, 1, 1, 3, 3, -1, -1, -3, -3, 2, 2, -2, -2, 0, 0, 4, -4, 1, 1, 4, 4, -1, -1, -4, -4 };
    int[] imaginaryPart = { 0, 1, -1, 0, 0, 1, -1, 1, -1, 0, 0, 2, -2, 2, -2, 1, -1, 2, -2, 1, -1, 0, 0, -3, 3, 3, -3, 1, -1, 3, -3, 1, -1, 2, -2, 2, -2, 4, -4, 0, 0, 4, -4, 1, -1, 4, -4, 1, -1 };
    assertArrayEquals(new String[] { "zero", "unit", "unit", "unit", "unit", "prime", "prime", "prime", "prime", "composite", "composite", "composite", "composite", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "composite", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case61() {
    int[] realPart = { 0, 1, 0, 1, -1, 2, 0, 0, -3 };
    int[] imaginaryPart = { 0, 0, -1, 1, 1, 0, -3, 5, -2 };
    assertArrayEquals(new String[] { "zero", "unit", "unit", "prime", "prime", "composite", "prime", "composite", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case62() {
    int[] realPart = { 99, -39, 0, 0, 97, 1003, 9998, 1119 };
    int[] imaginaryPart = { 0, 0, 35, -129, -2, -232, 9997, 1120 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "prime", "prime", "prime", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case63() {
    int[] realPart = { 0, 1, 0, 1, -1, 2, 0, 0, -3 };
    int[] imaginaryPart = { 15, 0, -1, 1, 1, 0, -3, 5, -2 };
    assertArrayEquals(new String[] { "composite", "unit", "unit", "prime", "prime", "composite", "prime", "composite", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case64() {
    int[] realPart = { 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998 };
    int[] imaginaryPart = { 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997 };
    assertArrayEquals(new String[] { "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case65() {
    int[] realPart = { 99, -39, 0, 0, 97, 1003, 9998, 1119, 9998, 9997, 9998, 9997 };
    int[] imaginaryPart = { 0, 0, 35, -129, -2, -232, 9997, 1120, 9997, 9998, 9997, 9998 };
    assertArrayEquals(new String[] { "composite", "composite", "composite", "composite", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case66() {
    int[] realPart = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    int[] imaginaryPart = { 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991 };
    assertArrayEquals(new String[] { "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case67() {
    int[] realPart = { 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998, 9998 };
    int[] imaginaryPart = { 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 9997, 997 };
    assertArrayEquals(new String[] { "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "composite" }, complexintegers.classify(realPart, imaginaryPart));
  }

  @Test
  public void case68() {
    int[] realPart = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    int[] imaginaryPart = { 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991, 9991 };
    assertArrayEquals(new String[] { "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime", "prime" }, complexintegers.classify(realPart, imaginaryPart));
  }

}
