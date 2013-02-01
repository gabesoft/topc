package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class PickGuitarsTest {
  PickGuitars pickguitars = new PickGuitars();

  @Test
  public void case1() {
    int[] guitarValues = { 1, 5, 3, 4, 5 };
    assertEquals(10, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case2() {
    int[] guitarValues = { 4, 8, 4 };
    assertEquals(12, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case3() {
    int[] guitarValues = { 2, 1, 4, 1, 2, 1, 8, 1 };
    assertEquals(12, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case4() {
    int[] guitarValues = { 6684, 4697, 8776, 5349, 4365, 6794, 2921, 282, 4526, 198, 4044, 7022, 1003, 4093, 2885, 4295, 6109, 3523, 8622, 4917, 1765, 429, 4561, 5981, 7356 };
    assertEquals(58386, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case5() {
    int[] guitarValues = { 1555, 9361, 97 };
    assertEquals(9458, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case6() {
    int[] guitarValues = { 7206, 5230, 3296, 5544, 9900, 4002, 2829, 5501, 8105, 7553, 2414, 5392, 6961, 8889, 3778, 7650, 6201, 506, 8739, 4279, 5693, 5640, 6359, 633, 7474, 3298, 9837, 7079, 6072, 7521 };
    assertEquals(90122, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case7() {
    int[] guitarValues = { 9177, 2111, 3687, 1373, 4543, 7705, 9805, 4658, 9875, 6018, 8763, 1401, 4741, 1488, 8252, 658, 9714, 1690, 8716, 61, 5152, 6586, 6072, 2774 };
    assertEquals(66037, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case8() {
    int[] guitarValues = { 5998, 5200, 2819, 2638, 1534, 2211, 5960, 8964, 4925, 8386, 7948, 1029, 739, 6321, 1840, 9690, 7786, 9308, 1385 };
    assertEquals(50072, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case9() {
    int[] guitarValues = { 181, 8260, 7986, 698, 5979, 6606, 4651, 9734, 8597, 2477, 1512, 1317, 3799, 9264, 3977, 9322, 2938, 131, 6407, 4621, 1359, 9451, 1316, 7405, 9385, 4294, 6516, 4148, 2154, 2051, 401, 8517, 3722, 6100, 8586, 1406, 310, 7, 3510, 9107, 7347, 2172, 2291 };
    assertEquals(102879, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case10() {
    int[] guitarValues = { 5053, 7061 };
    assertEquals(7061, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case11() {
    int[] guitarValues = { 722, 7707, 6204, 6647, 5888, 2442, 1999, 6981, 8608, 4462, 20, 4735, 1657, 6897, 1003, 6197, 7962, 5146, 1993, 1147, 3427, 7574, 7211, 1258, 2554, 6630, 3148, 9056, 1232, 7115, 9087, 4911, 2953, 1172, 3823, 6351 };
    assertEquals(86165, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case12() {
    int[] guitarValues = { 2814, 1697, 6105, 4072, 8333, 6214, 2717, 2103, 2739, 7505, 305, 4278, 6571, 688, 2107, 2042, 1857, 5775, 5833, 774, 775, 6189, 7491 };
    assertEquals(47855, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case13() {
    int[] guitarValues = { 5684, 2197, 4394, 8485, 4544, 7593, 7322, 7993, 1516, 2819, 6452, 2188, 8502, 5381, 5610, 1627, 9770, 8908, 4611, 4088, 8426, 5459, 40 };
    assertEquals(64949, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case14() {
    int[] guitarValues = { 477, 1829, 687, 1592, 9490, 9488, 5024, 3794, 2466 };
    assertEquals(18809, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case15() {
    int[] guitarValues = { 4610, 2489, 5401, 8577, 9125, 7044, 5280, 8801, 5837, 7270, 3722, 5687, 8751, 9900, 6358, 9759, 433, 815, 1179, 4593, 2539, 3519, 8528, 1880, 9486, 8175, 5224, 5771, 3340, 7059, 5346, 2969, 7022, 1666, 659, 2038, 7227, 3933, 4322, 5301, 8074, 9015, 2597, 9321, 1426, 9901, 569, 5477 };
    assertEquals(132442, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case16() {
    int[] guitarValues = { 4776, 9564 };
    assertEquals(9564, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case17() {
    int[] guitarValues = { 5601, 6489, 5921 };
    assertEquals(12090, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case18() {
    int[] guitarValues = { 3305, 9744, 3013, 1914, 3392, 5705, 1051, 8017, 8318, 5592, 2055, 7685, 3628, 4535, 632, 5751, 1422, 4470, 4689, 3374, 3130, 188, 4081, 8538, 962, 5765, 9316, 655, 5513, 9570, 6923, 245, 324, 4784, 2841, 1061 };
    assertEquals(79393, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case19() {
    int[] guitarValues = { 8966, 313, 1282, 5734, 553, 4125, 2416, 9996, 2404, 8764, 9419, 9534, 2490, 4113, 3199, 2325 };
    assertEquals(41661, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case20() {
    int[] guitarValues = { 8600, 7156, 2095, 8143, 6392, 2689, 3235, 7491, 2198, 4731, 8028, 6761, 4486, 7244, 6395, 9757, 5542, 385, 4872, 5883, 4680, 5562, 3304, 5422, 9129, 1961, 4902, 703, 5651, 8287, 7701, 4909, 4776, 6464, 3237, 8426, 8701, 9790, 1285, 8577, 3351, 6673, 7903, 2334, 4879, 2502, 7668, 3200, 983 };
    assertEquals(136260, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case21() {
    int[] guitarValues = { 27, 2800, 7787, 6633, 3964, 4951, 3786, 8478, 4805, 4976, 3348, 631, 1938, 9845, 3622, 2199, 6430, 5373, 338, 239, 3126, 5139, 9966, 9074, 2635, 2065, 7958, 6502, 4838, 7650, 5392, 8754, 7008 };
    assertEquals(83957, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case22() {
    int[] guitarValues = { 9247, 5559, 6459, 7482, 4729, 9078, 9758, 1372, 1618, 5599, 7961, 8119, 424, 6877, 81, 2571, 8304, 8803, 5048, 6384, 9148, 8656, 5803, 3636, 7014, 8655, 7834, 8220, 7193, 2727 };
    assertEquals(96394, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case23() {
    int[] guitarValues = { 6235, 4573, 5438, 2481, 8786, 4684, 6926, 4455, 617, 8848, 5300, 7703, 7826, 1163, 8482, 5525, 3527, 1744, 721, 553, 3810, 7566, 5167, 4082, 7558, 9555, 2737, 8408, 2806, 2151, 9312, 1678, 9164, 9469, 7776, 6567, 564, 397, 8803, 1224, 5063, 3501, 4458 };
    assertEquals(111394, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case24() {
    int[] guitarValues = { 8794, 1427, 1641, 6110, 9255, 3666, 8203, 7243, 9109, 5989, 3187, 1933, 5387, 4651, 4008, 2649, 611, 3533 };
    assertEquals(46832, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case25() {
    int[] guitarValues = { 8952, 1678, 2807, 235, 4227, 9597, 8423, 8165, 5964, 8147, 2720, 8775, 1175, 2360, 7830, 1310, 8760, 8362, 5176, 9423, 6200, 4565, 6333, 6436, 8810, 436, 2793, 8831, 5987, 3175, 4776, 132, 362, 4495, 2109, 6874, 2587, 9398, 3421 };
    assertEquals(103482, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case26() {
    int[] guitarValues = { 6601, 6359, 3430, 5803, 7644 };
    assertEquals(17433, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case27() {
    int[] guitarValues = { 1925, 8956, 8048, 9636, 2205, 12, 3874, 5956, 1196, 4577, 8847, 985, 8241, 6790, 709, 7895, 4655, 9468, 9118 };
    assertEquals(55284, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case28() {
    int[] guitarValues = { 1522, 895, 3519, 4362, 8942, 2368, 4032, 3702, 5943, 8314, 8335, 6331, 6622, 1235, 2775, 7137, 4737, 7054, 6469, 7956, 5906, 2528, 3063, 5999, 3885, 5312, 5964, 4053, 4944, 8984 };
    assertEquals(78907, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case29() {
    int[] guitarValues = { 7318, 2297, 9887, 9277, 6414, 723, 9993, 5570, 8653, 61, 169, 9113, 9932, 5105, 1177, 5033, 7780, 8536, 5578, 6822, 2030, 3056, 2264, 4055, 3337, 8591, 6784, 275, 1344, 589, 4870, 6562, 3678, 5771, 3569, 630, 4162, 2474, 4286, 895, 3633, 3681, 4685, 9910, 9576, 2244, 1865 };
    assertEquals(115031, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case30() {
    int[] guitarValues = { 1428, 9378, 7555, 3794, 6840, 9546, 7124, 3197, 468, 7060 };
    assertEquals(31469, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case31() {
    int[] guitarValues = { 6548, 895, 2366, 1149, 192, 3226, 8841, 4036, 7501, 4546, 4172, 5416, 500, 6960, 3895, 5506, 985, 8274, 8515, 2620, 8935, 3476, 9777, 3390, 4152, 1144, 6128, 8623, 337, 7679, 2179, 3139, 9583, 8795, 2054, 7109, 9197, 2128, 1943, 8500, 2096, 6990 };
    assertEquals(104510, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case32() {
    int[] guitarValues = { 1065, 6638, 7320, 597, 9973, 1679, 1700, 6416, 7679, 7896, 9941, 8213, 5915, 6953, 9194 };
    assertEquals(49430, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case33() {
    int[] guitarValues = { 5751, 5993, 3794, 9873, 6669, 6082, 2121, 97, 7231, 9744, 649, 9535, 4540, 4545, 52, 5897, 6986, 6767, 727, 2585, 4989, 1682, 5463, 9378, 7379, 4666, 5050, 864, 6886, 430, 8639, 6563, 6785, 6054, 4382, 6463, 2181, 7159, 7460, 5771, 3629, 5558, 1998, 3071, 7838, 1032, 570, 6828 };
    assertEquals(122723, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case34() {
    int[] guitarValues = { 9502, 9985 };
    assertEquals(9985, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case35() {
    int[] guitarValues = { 5395, 4788, 4885, 3189, 1838, 1404, 1325, 5830, 5977, 1377, 923, 2031, 3594, 8971, 2472, 8516, 1150, 3352, 1936, 9850, 970, 744, 3660, 6480, 2431, 4431, 5321, 3598, 3838, 3059, 6651, 6250 };
    assertEquals(66789, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case36() {
    int[] guitarValues = { 5154, 7275, 9902, 7135, 493, 2175, 9864, 2272, 7034, 4189, 7407, 8445, 5462, 1767, 5198, 5227, 2129, 6738, 9774, 3917, 5111, 1238, 4147, 3448, 7442 };
    assertEquals(69995, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case37() {
    int[] guitarValues = { 9380, 6630, 6203, 5499, 9975, 9112, 6062, 6705, 4257, 3995, 1123, 6981, 7603, 8259, 9469, 8675, 3301, 3310, 701, 2354, 3131, 858, 7902, 3140, 7310, 7052, 1993 };
    assertEquals(78145, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case38() {
    int[] guitarValues = { 1389, 2362, 8225, 1691, 5860, 2029, 1695, 1484, 2788, 2094, 1181, 1285, 2593, 8970, 8352, 8686, 3288, 6327, 2466, 4619, 3922, 1674, 9022, 8918, 3744 };
    assertEquals(55124, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case39() {
    int[] guitarValues = { 4533, 1030, 8724, 7314, 8570, 7661, 7434, 4726, 8534, 6383, 9027, 1984, 2241, 9202, 7061, 4043, 8319, 2937, 4267, 8115, 4688, 3881, 5005, 7759, 909, 2655, 4113, 2841, 1114, 1458, 3126, 1745, 347 };
    assertEquals(84379, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case40() {
    int[] guitarValues = { 7442, 8926, 8693, 7835, 902, 424, 4354, 2255, 7465, 2354, 8936, 4854, 3190, 2504, 5694, 9676, 5568, 3179, 4156, 5392, 1401, 4223, 2666, 6716, 8895, 8737, 3716, 8494, 4382, 436, 5638, 2549, 9221, 828, 8206, 1759, 7780, 6410, 9031, 8008, 3142, 963, 2214, 710, 3200, 5673, 681, 376, 6134, 279 };
    assertEquals(121017, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case41() {
    int[] guitarValues = { 7372, 923, 1772, 2974, 9434, 5507, 3223, 1819, 2784, 2483, 4286, 2682, 750, 9810, 6611, 2764, 685, 1902, 1956, 8914, 4680, 4704, 8158, 5294, 2071, 6850, 8261, 1084, 2055, 7868, 1085, 8113, 2885, 3537, 7331, 1324, 40, 7948, 3897, 3358, 9539, 1624, 500, 8248, 4135 };
    assertEquals(100124, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case42() {
    int[] guitarValues = { 6945, 8161, 9511, 7928, 6393, 1484, 4795, 3263, 9866, 128, 6730, 231, 9870, 8886, 9643, 6353, 6502, 9895, 3995, 4965, 7699, 845, 4764, 4018, 6402, 6412, 7128 };
    assertEquals(85134, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case43() {
    int[] guitarValues = { 1290, 8601, 1039, 3881, 4513, 3148, 8115, 6821, 9357, 5989, 4014, 690, 3148, 5849, 6941, 6877, 5855, 6516, 8263, 4770, 2848, 5037, 4357, 3409, 1038, 190 };
    assertEquals(63382, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case44() {
    int[] guitarValues = { 4856, 1234, 8904, 300, 7527, 5998, 7019, 2065, 2829, 1443, 4760, 5197, 3829, 3535, 6582, 5288, 405, 4259, 9714, 3873, 1363, 697, 5602, 8003, 312, 542, 3740, 4298, 8780, 865, 7921, 6390, 6986, 3047, 790, 5890, 9966, 5713, 3800, 6104, 4347, 9237, 6131, 4612, 8958, 9903, 7955, 5503, 670 };
    assertEquals(122292, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case45() {
    int[] guitarValues = { 559, 4581, 5411, 3873, 8238, 1190, 3099, 5280, 4657, 8411, 4425, 2555, 9392, 9354, 6854, 2458, 8767, 1035, 7005, 390, 8772, 8866, 6648, 1204, 6824, 4213, 9956, 5477, 3471, 4635, 376, 6791, 4736, 1463, 6493, 8222, 739, 2172, 7601, 1718, 6464, 5641, 1361, 2326, 6134, 6862, 7871 };
    assertEquals(119794, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case46() {
    int[] guitarValues = { 3462, 3887, 6748 };
    assertEquals(10210, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case47() {
    int[] guitarValues = { 6301, 3902, 6431, 7395, 5648, 7183, 7788, 3553, 5800, 7399, 7339, 4193, 4572, 4229, 8933, 817, 9900, 9585, 6542, 9655, 1934, 1872, 4997, 8736, 7741, 3648, 9953, 4714, 9132, 6826, 3142, 9000, 2803, 6130, 4056, 2028, 5982, 5879, 4616, 6452, 58, 7398, 9086 };
    assertEquals(129911, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case48() {
    int[] guitarValues = { 9305, 4355, 7514, 6332, 1760, 1135, 7329, 2714, 4509, 5018, 4367, 6682, 6257, 6347, 1564, 9881, 5862, 2170, 830, 6250, 6753, 7861, 1201, 3426, 3599, 8166 };
    assertEquals(69466, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case49() {
    int[] guitarValues = { 765, 9433, 3777, 6150, 9783, 8540, 2056, 3578, 2914, 2858, 869, 958, 9524, 7371, 2604, 3856, 3885, 3052, 1400, 4253, 8403, 4262 };
    assertEquals(54222, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case50() {
    int[] guitarValues = { 2504, 6833, 1196 };
    assertEquals(8029, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case51() {
    int[] guitarValues = { 1036, 6443, 6985, 6256, 5261, 5097, 3330, 368, 7860, 9138, 8193, 5742, 3630, 547, 3996, 8954, 3436, 7400, 5016, 1862, 7429, 9894, 8219, 5445, 9699, 5324, 2663, 833, 8760, 9325, 8754, 9690, 882, 7400, 163, 8046, 6192 };
    assertEquals(107215, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case52() {
    int[] guitarValues = { 7997, 7345, 629 };
    assertEquals(8626, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case53() {
    int[] guitarValues = { 8934, 3982, 446, 1927, 6495, 3949, 9693, 8526, 7325, 2314, 5362, 7570, 2449, 8228, 9251, 4991, 6816, 4907, 450, 6383, 9137, 601, 7385, 1517, 8016, 955, 3802, 2268, 9664, 5372, 8751, 9966, 7142, 9970, 6668, 5828, 958, 7583, 2, 8638, 6138, 862, 3466, 7091, 1420, 7996, 5968 };
    assertEquals(131379, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case54() {
    int[] guitarValues = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    assertEquals(250000, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case55() {
    int[] guitarValues = { 9913, 9841, 9101, 9166, 9431, 9520, 9136, 9558, 9233, 9047, 9961, 9860, 9869, 9155, 9068, 9535, 9940, 9978, 9917, 9251, 9486, 9488, 9398, 9831, 9273, 9415, 9320, 9550, 9890, 9132, 9900, 9429, 9296, 9060, 9141, 9774, 9519, 9618, 9445, 9935, 9516, 9807, 9209, 9895, 9848, 9130, 9267, 9061, 9686, 9641 };
    assertEquals(238153, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case56() {
    int[] guitarValues = { 9843, 9412, 9496, 9458, 9731, 9953, 9952, 9478, 9796, 9906, 9380, 9239, 9004, 9773, 9940, 9832, 9065, 9172, 9857, 9522, 9129, 9648, 9376, 9431, 9984, 9649, 9725, 9938, 9239, 9888, 9677, 9318, 9793, 9995, 9891, 9797, 9482, 9362, 9182, 9612, 9427, 9102, 9273, 9667, 9035, 9302, 9400, 9065, 9005, 9135 };
    assertEquals(238783, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case57() {
    int[] guitarValues = { 1, 5, 3, 4, 5 };
    assertEquals(10, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case58() {
    int[] guitarValues = { 2, 1, 4, 1, 2, 1, 8, 1 };
    assertEquals(12, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case59() {
    int[] guitarValues = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 10000, 9000, 10000 };
    assertEquals(19126, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case60() {
    int[] guitarValues = { 51, 477, 344, 10, 179, 234, 488, 368, 472, 474, 215, 155, 291, 337, 471, 501, 505, 452, 337, 446, 401, 114, 412, 163, 302, 392, 431, 226, 228, 405, 457, 236, 281, 48, 379, 422, 177, 309, 45, 404, 213, 321, 332, 343, 183 };
    assertEquals(7172, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case61() {
    int[] guitarValues = { 12, 5, 10, 5, 7 };
    assertEquals(22, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case62() {
    int[] guitarValues = { 9, 5, 6, 4 };
    assertEquals(15, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case63() {
    int[] guitarValues = { 3, 3, 3, 4, 3, 4, 3, 3 };
    assertEquals(14, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case64() {
    int[] guitarValues = { 2, 3, 2, 8, 2, 3, 2, 4 };
    assertEquals(16, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case65() {
    int[] guitarValues = { 1, 5, 3, 4, 5, 6465, 4654, 87, 94, 654, 1, 34, 654, 65, 6465, 13, 28, 749, 435, 16, 4, 65, 98, 1, 321 };
    assertEquals(13029, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case66() {
    int[] guitarValues = { 9, 2, 3, 2, 9 };
    assertEquals(14, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case67() {
    int[] guitarValues = { 1000, 10000, 10000, 10000, 10000, 10000 };
    assertEquals(30000, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case68() {
    int[] guitarValues = { 6, 3, 4, 3, 5, 3, 4, 3 };
    assertEquals(18, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case69() {
    int[] guitarValues = { 1, 432, 432, 234, 23, 3, 4, 5, 546, 67, 6, 897, 56, 34, 45, 4354, 3456, 4353, 2456, 9787, 6879, 6785, 757, 567, 4564, 6545, 6564, 564, 7865, 876, 454, 5643, 5647, 456, 456, 36, 3, 4785, 65, 645, 345, 586, 7565, 6457, 8567, 4567, 4568, 6457, 4657 };
    assertEquals(68419, pickguitars.maxValue(guitarValues));
  }

  @Test
  public void case70() {
    int[] guitarValues = { 6, 7, 5, 7, 4 };
    assertEquals(18, pickguitars.maxValue(guitarValues));
  }

}
