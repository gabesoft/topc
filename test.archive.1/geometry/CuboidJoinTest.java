package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class CuboidJoinTest {
  CuboidJoin cuboidjoin = new CuboidJoin();

  @Test
  public void case1() {
    int[] cuboids = { 0, 0, 0, 1, 1, 1 };
    assertEquals(1L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case2() {
    int[] cuboids = { 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2 };
    assertEquals(2L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case3() {
    int[] cuboids = { 0, 0, 0, 4, 4, 4, 0, 0, 0, 1, 1, 1 };
    assertEquals(64L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case4() {
    int[] cuboids = { -5000, -5000, -5000, 5000, 5000, 5000 };
    assertEquals(1000000000000L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case5() {
    int[] cuboids = { -275, -1020, -2918, 921, 2673, 3863, 497, -3921, -1831, 3059, 618, 811, -3106, -1159, -2082, 996, 3280, 3052, 4387, 1735, 244, 4469, 4692, 3278, -369, -366, 2870, 968, -91, 3502 };
    assertEquals(129892376024L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case6() {
    int[] cuboids = { 1140, 2751, -1253, 1580, 4433, 4795, -4815, 9, 1222, -4309, 1585, 2128, -1496, -1921, 1236, 602, -1300, 4118, 458, 1438, -839, 2715, 2588, 2766, -4210, -1597, 1999, -1705, 2013, 4861 };
    assertEquals(44191502582L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case7() {
    int[] cuboids = { -3149, -3139, -3843, -2590, 2472, 4666, -988, -4182, -4745, 3101, 233, -2290, -2875, -4122, 1943, -2849, -2273, 3240, -1973, -965, 733, 3805, 3670, 3578, 1310, -1837, -4989, 3393, -578, 3941 };
    assertEquals(162823810512L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case8() {
    int[] cuboids = { -3209, -2934, -4688, -390, 4393, -2577, -1816, -4149, 1709, 3216, -3087, 2316, 1524, -3311, -4251, 2600, -106, 1701, -2551, -227, -3024, 4191, 2343, 4417, -783, -1519, -4952, 4777, 1232, -4142 };
    assertEquals(204837483171L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case9() {
    int[] cuboids = { 1051, 3609, -184, 1699, 3707, 3002, -1864, -971, -2605, -1682, 4838, 4526, 237, -1757, -3464, 1168, 3418, 3713, -4939, -3614, -4969, -1319, 1112, -38, -1798, -3032, 1504, 1635, 1387, 4041 };
    assertEquals(157034258652L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case10() {
    int[] cuboids = { -4007, 3046, -3249, -3882, 3136, -1863, -2235, -4619, 719, -983, -465, 4795, -4604, 1716, -2222, -481, 4009, 4864, -4528, -3039, -1258, 3956, 3269, 3905, -902, -1654, -3847, 3791, -531, 4370 };
    assertEquals(337888555093L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case11() {
    int[] cuboids = { -3654, -4797, -3059, 2630, -2833, -2183, -31, 2833, -4614, 3574, 3736, -2747, -738, -2735, -1061, 930, -2388, -533, -1940, 2772, -4131, 4112, 2816, -1434, 1703, 2688, -583, 4918, 4441, 4344 };
    assertEquals(45680906570L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case12() {
    int[] cuboids = { -3770, -4962, -3697, -1858, 1899, 1502, 2996, -3343, -1433, 4308, 883, 2898, -4693, -1637, -2455, -1226, -883, 1635, -4956, 1156, 326, -4914, 2180, 1333, -3469, -3008, -2343, 643, -1338, 558 };
    assertEquals(108813743682L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case13() {
    int[] cuboids = { -3455, -3695, -3168, -2513, 2084, -1226, 2377, -3969, 2228, 2991, -1299, 3672, -1282, -385, -4254, 4016, 1923, -583, -4034, 1854, 2090, -3546, 4497, 2329, -3423, 996, -1457, -2216, 1597, 3177 };
    assertEquals(61370812544L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case14() {
    int[] cuboids = { 548, 1638, -773, 658, 4076, 1596, -1075, -4477, -3619, 2927, 4021, 1956, -3555, -195, -4047, 3234, 1830, 1900, -1854, -3824, -4964, -1360, -2896, -2442, -3494, -2621, -1016, -1110, 767, -926 };
    assertEquals(228322641839L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case15() {
    int[] cuboids = { -3146, 3452, 1161, 678, 3830, 3285, -1494, -2099, 2146, 3603, 2090, 4040, -4539, 213, -3485, -3112, 3394, -3254, -2211, -285, -2471, 308, 1770, 214, -41, -912, -1529, 591, 1083, 4362 };
    assertEquals(62664619356L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case16() {
    int[] cuboids = { -4310, -3729, -382, 4745, 950, 3324, -526, -1309, -3543, 1536, 812, -550, -3839, 1583, 42, -2710, 1817, 2019, 1369, -1714, -4534, 3902, 3803, -1543, -3807, -3917, -4568, -443, -156, 2191 };
    assertEquals(266020880902L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case17() {
    int[] cuboids = { 3517, -3723, 988, 3525, 2747, 2609, -3660, 4490, -2768, -830, 4774, -562, -54, -1750, 596, 4444, 3646, 3494, 863, -4315, -4648, 2402, -177, 1727, -1268, 196, -4074, 4877, 1704, 4541 };
    assertEquals(170172198529L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case18() {
    int[] cuboids = { 437, -1775, -1847, 4588, -919, 2249, -1993, -3754, 2564, -349, -1525, 3332, -4675, 341, -2407, -1672, 4690, 4987, -2529, 783, -3405, 3394, 3661, -54, -3085, -3169, -4386, 4213, 1334, 1347 };
    assertEquals(328240104918L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case19() {
    int[] cuboids = { -1996, 523, -4338, 2684, 4967, -3434, -2932, -2169, 2559, 3272, -318, 3320, 3204, -2234, 683, 3864, -438, 1291, -2242, 130, -4871, -655, 1099, 978, 295, -4310, 848, 2917, -1165, 967 };
    assertEquals(37538683497L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case20() {
    int[] cuboids = { -3729, -4309, -4950, 4564, 296, -4184, -4161, 3403, -2314, 1225, 4282, -769, -3272, -3245, -4452, -2137, -341, 4370, -3145, -514, -2415, 892, 1719, 1027, -4026, -3529, -4994, -2663, 3715, -234 };
    assertEquals(129256462914L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case21() {
    int[] cuboids = { -1878, -1472, -299, -766, -992, 2850, -1724, -455, 2919, -60, 116, 3013, 2701, -1800, -1383, 4179, 3083, 4110, 656, -4336, 2045, 1210, -1937, 2371, -4148, 2693, 2062, 1084, 4568, 2472 };
    assertEquals(45868880254L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case22() {
    int[] cuboids = { 2575, 1370, 605, 2782, 4773, 1347, -4182, -331, -1945, -3188, -263, -902, -1598, -4951, -1270, -929, -268, -255, -3747, -4190, -4605, 3932, -1062, 217, -470, -2252, 1287, 2231, -1561, 2154 };
    assertEquals(119091254924L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case23() {
    int[] cuboids = { 2426, -4598, -2912, 4036, -738, -2171, 197, -1394, 3018, 1800, 1652, 4364, 2469, -412, -52, 3054, 2780, 2418, -960, -3588, -1691, 4038, 2795, 1169, -898, -2173, -1310, 860, -784, 4526 };
    assertEquals(112402823822L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case24() {
    int[] cuboids = { -4555, 476, -3556, -3362, 2877, -1146, -450, -4543, 498, 2018, -3076, 4408, -3990, -3654, -3922, 155, 661, -2169, -4875, -4412, -4191, -3239, 812, 3298, 599, 4522, -4776, 2703, 4812, -1033 };
    assertEquals(112054693016L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case25() {
    int[] cuboids = { -5000, -5000, -5000, 5000, 5000, 5000, -5000, -5000, -5000, 5000, 5000, 5000, -5000, -5000, -5000, 5000, 5000, 5000, -5000, -5000, -5000, 5000, 5000, 5000, -5000, -5000, -5000, 5000, 5000, 5000 };
    assertEquals(1000000000000L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case26() {
    int[] cuboids = { -5000, -5000, -5000, 5000, 5000, 5000, -5000, -5000, -5000, 0, 5000, 5000, 0, -5000, -5000, 5000, 5000, 5000, -5000, -5000, -5000, 5000, 0, 5000, -5000, 0, -5000, 5000, 5000, 5000 };
    assertEquals(1000000000000L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case27() {
    int[] cuboids = { 0, 0, 0, 5000, 5000, 5000, -5000, -5000, -5000, 0, 5000, 5000, 0, -5000, -5000, 5000, 5000, 5000, -5000, -5000, -5000, 5000, 0, 5000, -5000, 0, -5000, 5000, 5000, 5000 };
    assertEquals(1000000000000L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case28() {
    int[] cuboids = { 0, 0, 0, 4, 4, 4, 3, 3, 3, 8, 8, 8 };
    assertEquals(188L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case29() {
    int[] cuboids = { 0, 0, 0, 4, 4, 4, 3, 3, 3, 7, 7, 7, 6, 6, 6, 10, 10, 10 };
    assertEquals(190L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case30() {
    int[] cuboids = { 0, 0, 0, 4, 4, 4, 1, 1, 1, 3, 3, 3 };
    assertEquals(64L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case31() {
    int[] cuboids = { 0, 0, 0, 5, 5, 5, 1, 1, 1, 4, 4, 4, 2, 2, 2, 3, 3, 3 };
    assertEquals(125L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case32() {
    int[] cuboids = { 0, 0, 0, 4, 4, 4, 2, -2, -2, 7, 6, 6 };
    assertEquals(352L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case33() {
    int[] cuboids = { 0, 0, 0, 4, 4, 4, 2, -2, -2, 7, 6, 6, 5, 0, 0, 9, 4, 4 };
    assertEquals(384L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case34() {
    int[] cuboids = { 0, 0, 0, 9, 4, 4, 2, -2, -2, 7, 6, 6 };
    assertEquals(384L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case35() {
    int[] cuboids = { 0, 0, 0, 4, 4, 4, 3, 2, 0, 7, 6, 4, 3, -1, 0, 8, 3, 4 };
    assertEquals(176L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case36() {
    int[] cuboids = { 0, 0, 0, 9, 4, 4, 0, 2, 0, 9, 6, 4, 2, -2, -2, 7, 6, 6 };
    assertEquals(416L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case37() {
    int[] cuboids = { 0, 0, 0, 4, 4, 4, 2, 2, 2, 8, 3, 3, 6, 0, 0, 10, 4, 4 };
    assertEquals(130L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case38() {
    int[] cuboids = { -5, 3, -1, 2, 4, 0, 1, -5, 1, 2, -2, 1, -3, -4, -3, -1, 0, 4, -2, -5, -1, 0, -2, -1, 1, -3, -5, 2, 3, 0 };
    assertEquals(93L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case39() {
    int[] cuboids = { 1, -5, -5, 4, 3, 5, 0, -4, -3, 2, -2, 2, -1, 2, -5, 1, 2, 0, -1, 1, 0, 2, 4, 1, -4, -3, -2, 0, -1, 4 };
    assertEquals(305L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case40() {
    int[] cuboids = { -3, -1, 2, 3, -1, 5, -3, 0, -2, 2, 1, -1, -3, 2, -4, 3, 5, 5, 4, -5, 1, 5, -3, 2, -4, 0, -3, -3, 5, 1 };
    assertEquals(189L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case41() {
    int[] cuboids = { -1, -2, -3, -1, -2, 0, 4, -5, -1, 4, 1, 3, -5, 3, 0, -3, 4, 5, 0, 2, -2, 5, 4, 0, 1, -2, 1, 5, 2, 2 };
    assertEquals(46L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case42() {
    int[] cuboids = { -1, 5, 2, 2, 5, 5, 0, -5, -4, 5, -2, -3, -5, 1, -4, 5, 3, -1, -3, -3, -1, 4, 3, 5, -5, -4, 1, 0, 4, 1 };
    assertEquals(327L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case43() {
    int[] cuboids = { 0, 0, 0, 1, 2, 3, 5, 5, 5, 6, 6, 6 };
    assertEquals(7L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case44() {
    int[] cuboids = {  };
    assertEquals(0L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case45() {
    int[] cuboids = { 0, 0, 0, 1, 1, 0 };
    assertEquals(0L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case46() {
    int[] cuboids = { -1302, 2052, -965, -197, 4268, 3029, -860, -1763, -3318, -228, 441, 2418, 770, 1668, -3785, 1635, 2842, -2862, -1939, -870, -2904, -1419, -804, 2252, 881, -4270, -4068, 3590, -423, 3226 };
    assertEquals(94898721340L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case47() {
    int[] cuboids = { -2379, -4984, 1650, 471, -145, 1870, -2764, -3169, -3851, 67, 581, 4844, -3142, 2803, -2890, 2854, 3565, -1454, -1639, -2811, 2488, 3699, 3108, 4687, -3094, -3703, 7, 3025, -3670, 1075 };
    assertEquals(157245450108L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case48() {
    int[] cuboids = { 1430, -2074, -4886, 1603, 2210, -293, -771, -4027, -4386, 2688, -1097, 2217, -4731, -1105, -3863, 2774, 3908, 1286, -3494, -3104, -1166, 2423, 2895, 2156, -1155, -1433, -2990, 4130, 2500, -1061 };
    assertEquals(310389718846L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case49() {
    int[] cuboids = { -4767, -4746, -1274, 2425, 2455, 4012, -1570, 1703, -2748, 470, 4125, 2979, 307, -589, -1686, 624, 1413, 4834, -1048, 1127, -2736, 526, 3573, 3871, -1596, -4655, -1738, 1420, 4078, 491 };
    assertEquals(311557135452L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case50() {
    int[] cuboids = { -501, -4903, -1517, 1528, -3490, 356, -4423, -1956, -3435, 4976, -302, 327, 1378, -2608, 717, 4534, 4990, 2737, -4216, -2081, -1326, 4460, 273, 3786, -4795, -1441, -3305, 914, 3500, 4342 };
    assertEquals(336659119546L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case51() {
    int[] cuboids = { 1435, -4189, -4454, 4304, -2988, 632, -247, -3691, -2631, 2541, 1800, -1834, -309, -2919, 1557, 3426, 3626, 2909, -2634, -4242, -3114, 2527, 2690, 1119, 4257, 2661, 1929, 4665, 2829, 4062 };
    assertEquals(197301897874L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case52() {
    int[] cuboids = { -141, -829, -2171, 1975, 4434, 4439, 1293, -1676, -3323, 4597, 4272, 4686, -4934, -1744, 3234, -3370, 3638, 3719, -4117, -2076, 854, -409, 2773, 1498, -684, 874, -1979, 3267, 3340, 3997 };
    assertEquals(231338733304L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case53() {
    int[] cuboids = { -826, -3435, -4569, 942, 261, 458, -158, 233, -1792, 1892, 1517, -357, 2994, 1591, -223, 3126, 4848, 159, -1027, -1030, 391, 1551, -81, 3752, -4796, 4066, -4503, 284, 4332, 1365 };
    assertEquals(52785968962L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case54() {
    int[] cuboids = { -823, -919, -40, 369, 3496, 2703, -4788, 1900, -1199, 451, 3885, 2837, -4710, -661, -2860, -3469, 1407, -607, -1445, 205, -1592, 2284, 511, -1561, -2922, -2936, 1263, 1237, 1358, 2465 };
    assertEquals(75210408186L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case55() {
    int[] cuboids = { 913, -2119, -2268, 1475, 1910, -1470, -2603, -3081, -2918, -1563, 1373, 1687, -1414, -1354, -2013, 2547, 3680, 4567, 245, 2585, -779, 2125, 2992, 187, 1132, 3047, -4414, 2620, 3269, 4430 };
    assertEquals(154242551694L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case56() {
    int[] cuboids = { -3243, -917, 922, 354, 364, 1183, -4259, -4523, 2913, 301, 831, 3721, -3266, -3573, 1228, 1073, 1286, 1874, -2537, -3262, -1462, 1433, 4764, 4087, 603, -1988, -2396, 4736, 4907, -228 };
    assertEquals(245265661180L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case57() {
    int[] cuboids = { 0, 0, 0, 1, 2, 3, 5, 5, 5, 6, 6, 6 };
    assertEquals(7L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case58() {
    int[] cuboids = { 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1 };
    assertEquals(1L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case59() {
    int[] cuboids = { -123, 43, 345, 12, 344, 4999, 30, 45, 360, 800, 300, 700, -50, 20, 345, 12, 344, 4999, 50, 79, -4999, 4999, 90, 0, 245, 23, 21, 456, 1245, 4566 };
    assertEquals(1688249645L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case60() {
    int[] cuboids = { -5000, -5000, -5000, 5000, 5000, 5000 };
    assertEquals(1000000000000L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case61() {
    int[] cuboids = { 0, 0, 0, 4, 4, 4, 0, 0, 0, 1, 1, 1 };
    assertEquals(64L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case62() {
    int[] cuboids = { 0, 0, 0, 1, 1, 1, 0, 0, 0, 22, 22, 22, 5, 5, 5, 17, 17, 17, 9, 9, 9, 13, 13, 13 };
    assertEquals(10648L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case63() {
    int[] cuboids = { 0, 0, 0, 4, 4, 4, 2, 2, 2, 5, 5, 5, 3, 3, 3, 6, 6, 6 };
    assertEquals(102L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case64() {
    int[] cuboids = { 0, 0, 0, 10, 10, 10, 5, 5, 5, 20, 20, 20, 7, 7, 7, 30, 30, 30 };
    assertEquals(14220L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case65() {
    int[] cuboids = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6, 7, 3, 4, 5, 6, 7, 8, 100, 120, 130, 1000, 1000, 1000, 1, 1, 1, 10, 2, 3 };
    assertEquals(689040083L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case66() {
    int[] cuboids = { 0, 0, 0, 4, 4, 4, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 2, 2, 2, 4, 4, 4 };
    assertEquals(64L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case67() {
    int[] cuboids = { 100, 100, 100, 200, 200, 200, 150, 50, 120, 250, 80, 300, 0, 0, 0, 60, 60, 60, -2000, -2000, -2000, -1000, -1000, -1000, -2100, -2320, -2280, -2001, 0, -1 };
    assertEquals(1525196720L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case68() {
    int[] cuboids = { 0, 0, 0, 50, 50, 50, 25, 25, 25, 100, 100, 100 };
    assertEquals(531250L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case69() {
    int[] cuboids = { 0, 0, 0, 10, 10, 10, 0, 0, 0, 10, 10, 10, 5, 5, 5, 15, 15, 15, 5, 5, 5, 15, 15, 15, 5, 5, 5, 15, 15, 15 };
    assertEquals(1875L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case70() {
    int[] cuboids = { 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1 };
    assertEquals(1L, cuboidjoin.totalVolume(cuboids));
  }

  @Test
  public void case71() {
    int[] cuboids = { 0, 0, 0, 22, 22, 22, 5, 5, 5, 17, 17, 17, 10, 10, 10, 12, 12, 12 };
    assertEquals(10648L, cuboidjoin.totalVolume(cuboids));
  }

}
