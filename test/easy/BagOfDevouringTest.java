package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class BagOfDevouringTest {
  double DELTA = 1.0e-09;
  BagOfDevouring bagofdevouring = new BagOfDevouring();

  //@Test
  public void case1() {
    int[] values = { 100, 100 };
    int[] weights = { 100, 100 };
    assertEquals(150.0, bagofdevouring.expectedYield(values, weights), DELTA * 150.0);
  }

  //@Test
  public void case2() {
    int[] values = { 100, 200, 300 };
    int[] weights = { 100, 200, 300 };
    assertEquals(462.5, bagofdevouring.expectedYield(values, weights), DELTA * 462.5);
  }

  //@Test
  public void case3() {
    int[] values = { 100, 200, 300 };
    int[] weights = { 300, 200, 100 };
    assertEquals(470.8333333333333, bagofdevouring.expectedYield(values, weights), DELTA * 470.8333333333333);
  }

  //@Test
  public void case4() {
    int[] values = {  };
    int[] weights = {  };
    assertEquals(0.0, bagofdevouring.expectedYield(values, weights), DELTA);
  }

  //@Test
  public void case5() {
    int[] values = { 10, 100, 150, 250, 500, 750, 1000, 2500, 5000, 7500, 10000 };
    int[] weights = { 100, 200, 300, 400, 500, 1000, 2000, 1500, 3000, 6000, 4000 };
    assertEquals(20622.364509064962, bagofdevouring.expectedYield(values, weights), DELTA * 20622.364509064962);
  }

  //@Test
  public void case6() {
    int[] values = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150 };
    int[] weights = { 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160 };
    assertEquals(817.1404067662378, bagofdevouring.expectedYield(values, weights), DELTA * 817.1404067662378);
  }

  //@Test
  public void case7() {
    int[] values = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150 };
    int[] weights = { 150, 140, 130, 120, 110, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
    assertEquals(900.8865923397088, bagofdevouring.expectedYield(values, weights), DELTA * 900.8865923397088);
  }

  //@Test
  public void case8() {
    int[] values = { 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] weights = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
    assertEquals(84.26482716444859, bagofdevouring.expectedYield(values, weights), DELTA * 84.26482716444859);
  }

  //@Test
  public void case9() {
    int[] values = { 1 };
    int[] weights = { 10000 };
    assertEquals(1.0, bagofdevouring.expectedYield(values, weights), DELTA * 1.0);
  }

  //@Test
  public void case10() {
    int[] values = { 7810, 4740, 8990, 9520, 1850 };
    int[] weights = { 8600, 4700, 800, 2100, 6600 };
    assertEquals(24670.9859615711, bagofdevouring.expectedYield(values, weights), DELTA * 24670.9859615711);
  }

  //@Test
  public void case11() {
    int[] values = { 2880, 3210, 3660, 5190, 520, 290, 7220, 1150, 720, 5210, 3980, 6150 };
    int[] weights = { 6400, 100, 600, 1500, 5200, 8100, 2200, 1500, 4000, 8500, 2200, 7900 };
    assertEquals(30299.674342961192, bagofdevouring.expectedYield(values, weights), DELTA * 30299.674342961192);
  }

  //@Test
  public void case12() {
    int[] values = { 5660, 7590, 5240, 2130, 8340, 6510, 5920, 650, 540, 2470, 2120 };
    int[] weights = { 5700, 4600, 2700, 2800, 6500, 6200, 8300, 8000, 4500, 5400, 5500 };
    assertEquals(33370.80090359164, bagofdevouring.expectedYield(values, weights), DELTA * 33370.80090359164);
  }

  //@Test
  public void case13() {
    int[] values = { 8620, 1590, 6760, 4610, 7140, 4030, 960, 7610, 5180, 4790, 440, 2930, 1300, 2510 };
    int[] weights = { 8800, 6900, 1800, 4300, 9600, 2100, 6200, 4700, 5200, 8500, 200, 5500, 2400, 5300 };
    assertEquals(40090.867155965025, bagofdevouring.expectedYield(values, weights), DELTA * 40090.867155965025);
  }

  //@Test
  public void case14() {
    int[] values = { 4250, 8380, 6390 };
    int[] weights = { 1600, 500, 5800 };
    assertEquals(13842.727272727274, bagofdevouring.expectedYield(values, weights), DELTA * 13842.727272727274);
  }

  //@Test
  public void case15() {
    int[] values = { 1820, 7910, 3960, 690, 6900, 4670, 9120, 4650, 9980, 3750 };
    int[] weights = { 8000, 7700, 2200, 1900, 1, 4900, 4600, 7500, 6000, 1700 };
    assertEquals(38831.84517398913, bagofdevouring.expectedYield(values, weights), DELTA * 38831.84517398913);
  }

  //@Test
  public void case16() {
    int[] values = { 9360, 5530, 5500, 6150, 4920, 7810, 6500, 270 };
    int[] weights = { 9200, 9700, 1800, 5100, 2000, 900, 4200, 6300 };
    assertEquals(29378.128133491537, bagofdevouring.expectedYield(values, weights), DELTA * 29378.128133491537);
  }

  @Test
  public void case17() {
    int[] values = { 9430, 3480, 1410, 1220 };
    int[] weights = { 4300, 400, 2100, 3400 };
    assertEquals(12845.164865491652, bagofdevouring.expectedYield(values, weights), DELTA * 12845.164865491652);
  }

  //@Test
  public void case18() {
    int[] values = { 8980, 9710, 4800, 1210, 7100, 7190, 7400, 50, 820, 2190, 2080, 570, 9500, 950 };
    int[] weights = { 6000, 4500, 600, 5500, 800, 4500, 4200, 6300, 8800, 3700, 9800, 6300, 2400, 9300 };
    assertEquals(50314.93824698791, bagofdevouring.expectedYield(values, weights), DELTA * 50314.93824698791);
  }

  //@Test
  public void case19() {
    int[] values = { 6680, 130, 2420, 9070, 880, 2490, 1500, 4550, 3000, 4610, 9860 };
    int[] weights = { 9100, 9600, 6500, 7000, 7500, 6400, 6500, 9000, 5500, 400, 2500 };
    assertEquals(34868.998754852844, bagofdevouring.expectedYield(values, weights), DELTA * 34868.998754852844);
  }

  //@Test
  public void case20() {
    int[] values = { 9270, 8440, 2530, 1780, 3710, 1040, 3450, 7420, 4950, 360, 4770 };
    int[] weights = { 1000, 3900, 400, 4900, 2200, 300, 1600, 8900, 3800, 1100, 3600 };
    assertEquals(33019.94275135963, bagofdevouring.expectedYield(values, weights), DELTA * 33019.94275135963);
  }

  //@Test
  public void case21() {
    int[] values = { 7190, 4840, 8210, 6020, 1230, 9840, 1850, 7420, 1510, 120, 370 };
    int[] weights = { 8200, 1100, 1200, 4500, 3400, 9500, 3600, 5700, 3000, 7500, 4800 };
    assertEquals(37502.07809967664, bagofdevouring.expectedYield(values, weights), DELTA * 37502.07809967664);
  }

  //@Test
  public void case22() {
    int[] values = { 3900, 150, 3400, 3970, 6020, 9950, 1920, 7530, 9340, 4790, 6760, 7250, 5380, 9710 };
    int[] weights = { 8400, 8900, 3000, 2300, 9600, 9700, 7400, 7100, 400, 9300, 600, 2700, 5200, 9300 };
    assertEquals(54258.87996225185, bagofdevouring.expectedYield(values, weights), DELTA * 54258.87996225185);
  }

  //@Test
  public void case23() {
    int[] values = { 2730, 6380, 3190, 9240, 2930 };
    int[] weights = { 3800, 700, 400, 4100, 4600 };
    assertEquals(18519.54091051541, bagofdevouring.expectedYield(values, weights), DELTA * 18519.54091051541);
  }

  //@Test
  public void case24() {
    int[] values = { 7010, 4340, 1550, 1200, 2330, 3260, 2070, 3000, 8050, 6100 };
    int[] weights = { 9100, 5600, 2900, 9000, 7900, 2400, 4500, 8200, 4700, 6400 };
    assertEquals(26567.346220650146, bagofdevouring.expectedYield(values, weights), DELTA * 26567.346220650146);
  }

  //@Test
  public void case25() {
    int[] values = { 1590, 3800, 3090, 4980, 8110, 3920, 9850 };
    int[] weights = { 3800, 7500, 3200, 8100, 7000, 3100, 4400 };
    assertEquals(24356.841328941027, bagofdevouring.expectedYield(values, weights), DELTA * 24356.841328941027);
  }

  //@Test
  public void case26() {
    int[] values = { 8390, 360, 4370, 8340, 6590, 8320, 250, 780, 3590, 2440, 6210, 4260, 9470 };
    int[] weights = { 2800, 7300, 4200, 1100, 6800, 2500, 2600, 6700, 5600, 5300, 9000, 8300, 8400 };
    assertEquals(45831.328118810256, bagofdevouring.expectedYield(values, weights), DELTA * 45831.328118810256);
  }

  //@Test
  public void case27() {
    int[] values = { 2200, 5500, 7600, 7300, 5400, 2700, 7200, 4100, 3800, 5900, 2000, 4500, 8200, 5500 };
    int[] weights = { 600, 5010, 4420, 8750, 5600, 9050, 9500, 8710, 6600, 7410, 9060, 9870, 7280, 8010 };
    assertEquals(44424.50213799366, bagofdevouring.expectedYield(values, weights), DELTA * 44424.50213799366);
  }

  //@Test
  public void case28() {
    int[] values = { 8400, 5300, 200, 7900, 7600, 4100, 200, 300 };
    int[] weights = { 8280, 2130, 7540, 4270, 1920, 4330, 3820, 2230 };
    assertEquals(26519.03812311085, bagofdevouring.expectedYield(values, weights), DELTA * 26519.03812311085);
  }

  //@Test
  public void case29() {
    int[] values = { 6900, 1800, 8700, 2800, 6100, 4600, 700, 2800, 6500, 1800, 2700, 6400, 6500, 1800 };
    int[] weights = { 2390, 6120, 1650, 9700, 9070, 2800, 7530, 9020, 3750, 5800, 8210, 3060, 6430, 4960 };
    assertEquals(41991.078864479205, bagofdevouring.expectedYield(values, weights), DELTA * 41991.078864479205);
  }

  //@Test
  public void case30() {
    int[] values = { 9100, 5600, 7300, 3000, 3100, 3600, 100, 4600, 6300, 4800, 6500, 7800, 4300, 800, 2100 };
    int[] weights = { 860, 7510, 3560, 9810, 5220, 350, 1520, 3850, 1260, 4230, 7560, 8370, 4580, 6910, 5600 };
    assertEquals(47790.259652051594, bagofdevouring.expectedYield(values, weights), DELTA * 47790.259652051594);
  }

  //@Test
  public void case31() {
    int[] values = { 2200, 1500, 400, 7300, 9800, 1100, 1200, 2100, 8600, 5500, 5600 };
    int[] weights = { 9730, 6020, 6430, 6240, 1290, 7980, 3990, 4040, 850, 4500, 1150 };
    assertEquals(36389.20217641977, bagofdevouring.expectedYield(values, weights), DELTA * 36389.20217641977);
  }

  //@Test
  public void case32() {
    int[] values = { 5300, 7400, 4700, 4400, 9700, 7000, 4700, 9600, 5300, 600, 7500, 9200, 3700, 8600 };
    int[] weights = { 190, 2160, 4010, 4220, 8710, 8360, 2770, 1940, 1310, 160, 1370, 2700, 4710, 6520 };
    assertEquals(55018.24909824502, bagofdevouring.expectedYield(values, weights), DELTA * 55018.24909824502);
  }

  //@Test
  public void case33() {
    int[] values = { 1200, 500, 5800, 7500, 8000, 4900, 4200, 4300, 4000, 4100, 7400 };
    int[] weights = { 1670, 7880, 450, 2500, 1070, 2400, 9610, 3740, 3270, 7320, 6290 };
    assertEquals(36092.7227363707, bagofdevouring.expectedYield(values, weights), DELTA * 36092.7227363707);
  }

  //@Test
  public void case34() {
    int[] values = { 2900, 3000, 8300, 9600, 7700, 6600, 1500, 8000, 7700, 5400, 5900 };
    int[] weights = { 4120, 1970, 6660, 510, 3120, 5690, 5420, 6710, 5240, 1890, 4340 };
    assertEquals(43867.58180147144, bagofdevouring.expectedYield(values, weights), DELTA * 43867.58180147144);
  }

  //@Test
  public void case35() {
    int[] values = { 5200, 5300, 3000, 5900, 4000, 9300, 5400, 1900, 1200, 2100, 7800 };
    int[] weights = { 5670, 4440, 7970, 3460, 6750, 9760, 4890, 4620, 7190, 3880, 2130 };
    assertEquals(34969.76692888281, bagofdevouring.expectedYield(values, weights), DELTA * 34969.76692888281);
  }

  //@Test
  public void case36() {
    int[] values = { 6000, 9300, 4200, 3100, 2800, 2100, 7800, 8700 };
    int[] weights = { 8000, 8170, 460, 9750, 2600, 4930, 8420, 8190 };
    assertEquals(28432.877576890463, bagofdevouring.expectedYield(values, weights), DELTA * 28432.877576890463);
  }

  //@Test
  public void case37() {
    int[] values = { 8700, 400, 2100, 4200, 6300, 6400, 100, 9400, 5500, 6000, 2100, 5400, 5500 };
    int[] weights = { 1600, 6650, 6220, 8710, 8360, 8530, 5140, 670, 4160, 7290, 2940, 1110, 9000 };
    assertEquals(44225.946070729726, bagofdevouring.expectedYield(values, weights), DELTA * 44225.946070729726);
  }

  //@Test
  public void case38() {
    int[] values = { 700, 8000, 6500, 2200, 2300, 8800, 4500, 5400, 7100 };
    int[] weights = { 1360, 9050, 9820, 5830, 8360, 3170, 7620, 1470, 5200 };
    assertEquals(30645.359136286446, bagofdevouring.expectedYield(values, weights), DELTA * 30645.359136286446);
  }

  //@Test
  public void case39() {
    int[] values = { 8300, 4000, 900, 6600, 4300, 5600, 4900, 1400, 2300, 7200, 4900 };
    int[] weights = { 7540, 7230, 5600, 6330, 5980, 2310, 3640, 9730, 6260, 3390, 1680 };
    assertEquals(35029.97221585395, bagofdevouring.expectedYield(values, weights), DELTA * 35029.97221585395);
  }

  //@Test
  public void case40() {
    int[] values = { 5100, 3200, 9700, 1800, 4300, 2800, 2100 };
    int[] weights = { 5580, 870, 4360, 3250, 6980, 30, 80 };
    assertEquals(20926.476878358302, bagofdevouring.expectedYield(values, weights), DELTA * 20926.476878358302);
  }

  //@Test
  public void case41() {
    int[] values = { 6200, 9100, 3600, 500, 5000, 6700, 2800, 3700, 3000, 9500, 5600, 6900, 9800, 300 };
    int[] weights = { 9120, 4410, 2380, 8230, 9640, 3250, 9700, 2590, 2000, 9290, 7500, 7750, 1720, 1490 };
    assertEquals(49004.96888375229, bagofdevouring.expectedYield(values, weights), DELTA * 49004.96888375229);
  }

  //@Test
  public void case42() {
    int[] values = { 3700, 6200, 1900, 6800, 100, 7400, 2700, 4400 };
    int[] weights = { 8250, 3020, 630, 920, 1090, 1460, 2510, 6000 };
    assertEquals(22595.56685641356, bagofdevouring.expectedYield(values, weights), DELTA * 22595.56685641356);
  }

  //@Test
  public void case43() {
    int[] values = { 400, 7300, 6600, 6300, 8400, 3300, 4200 };
    int[] weights = { 9110, 2040, 9330, 9780, 9710, 1040, 2090 };
    assertEquals(25341.691630278263, bagofdevouring.expectedYield(values, weights), DELTA * 25341.691630278263);
  }

  //@Test
  public void case44() {
    int[] values = { 1940, 1965, 9618, 7795, 7792, 7881, 7614, 4367, 6252, 8533, 7594 };
    int[] weights = { 3115, 9496, 7665, 5270, 1319, 1028, 1677, 3794, 3123, 6352, 2313 };
    assertEquals(47000.37813399441, bagofdevouring.expectedYield(values, weights), DELTA * 47000.37813399441);
  }

  //@Test
  public void case45() {
    int[] values = { 6092, 197, 170, 9499, 2520, 4945, 3254, 9687, 6180 };
    int[] weights = { 5885, 8418, 6963, 8288, 2377, 4238, 6303, 4524, 8837 };
    assertEquals(31660.84370843751, bagofdevouring.expectedYield(values, weights), DELTA * 31660.84370843751);
  }

  //@Test
  public void case46() {
    int[] values = { 6840, 9937, 2006, 9095, 9972, 829, 8386, 8099, 7264, 3529, 6238, 3055 };
    int[] weights = { 7900, 2421, 3226, 7051, 1352, 833, 6678, 5303, 9124, 3661, 3746, 467 };
    assertEquals(47197.37576340851, bagofdevouring.expectedYield(values, weights), DELTA * 47197.37576340851);
  }

  //@Test
  public void case47() {
    int[] values = { 7406, 8399, 9900, 2981, 6778, 7227, 5256, 5617, 8294, 7127, 868, 637, 3362 };
    int[] weights = { 6755, 2704, 9481, 2014, 8063, 5196, 3045, 8874, 1803, 3480, 7553, 2822, 1927 };
    assertEquals(48705.534120604, bagofdevouring.expectedYield(values, weights), DELTA * 48705.534120604);
  }

  //@Test
  public void case48() {
    int[] values = { 243, 4736, 2793, 2526, 7647, 4876, 2885, 618, 4235, 344, 6897, 4838, 6503, 4660, 365 };
    int[] weights = { 9586, 2051, 3088, 3305, 3134, 4463, 3756, 7765, 5082, 1739, 9576, 9217, 6598, 2583, 9284 };
    assertEquals(39104.667477161674, bagofdevouring.expectedYield(values, weights), DELTA * 39104.667477161674);
  }

  //@Test
  public void case49() {
    int[] values = { 8962, 2979, 1520, 1337, 8014, 3023, 9452, 9781, 1914, 3483, 9736, 9809 };
    int[] weights = { 4406, 3127, 7092, 1293, 866, 1699, 1808, 9273, 9454, 8639, 7804, 6997 };
    assertEquals(49572.84751516502, bagofdevouring.expectedYield(values, weights), DELTA * 49572.84751516502);
  }

  //@Test
  public void case50() {
    int[] values = { 7425, 4982, 1463, 4340, 749, 3762, 2003, 112, 2457, 2462, 1967, 3836, 1509 };
    int[] weights = { 346, 5147, 392, 7873, 4534, 2183, 7764, 4957, 1250, 51, 6992, 89, 9246 };
    assertEquals(28356.31372661328, bagofdevouring.expectedYield(values, weights), DELTA * 28356.31372661328);
  }

  //@Test
  public void case51() {
    int[] values = { 4476, 1413, 9418, 6763, 6776, 2209, 9718, 9335, 6484, 5725, 3970, 803, 128 };
    int[] weights = { 8009, 3822, 4847, 6684, 1573, 8538, 7803, 4952, 337, 4822, 23, 6484, 4909 };
    assertEquals(50058.565050500954, bagofdevouring.expectedYield(values, weights), DELTA * 50058.565050500954);
  }

  //@Test
  public void case52() {
    int[] values = { 8649, 2846, 5215, 2060, 4645, 2794, 9003, 5864 };
    int[] weights = { 7441, 7318, 3543, 7924, 3421, 3522, 6803, 512 };
    assertEquals(27553.532112261473, bagofdevouring.expectedYield(values, weights), DELTA * 27553.532112261473);
  }

  //@Test
  public void case53() {
    int[] values = { 5916, 85, 8410 };
    int[] weights = { 5723, 4440, 6641 };
    assertEquals(11074.45310578482, bagofdevouring.expectedYield(values, weights), DELTA * 11074.45310578482);
  }

  //@Test
  public void case54() {
    int[] values = { 2279, 7860, 1309, 7538, 4851, 4144, 6281, 1710, 2447, 9996, 9637, 7226, 1675, 3128, 8129 };
    int[] weights = { 2710, 2599, 5668, 5005, 2946, 1235, 9536, 7529, 4686, 1359, 1548, 5525, 3066, 1579, 152 };
    assertEquals(56073.89883787567, bagofdevouring.expectedYield(values, weights), DELTA * 56073.89883787567);
  }

  //@Test
  public void case55() {
    int[] values = { 9399, 6708, 925, 7202, 8355, 9008, 5449, 8414, 767, 4284 };
    int[] weights = { 4997, 2698, 6651, 4936, 7713, 1942, 7943, 5988, 4605, 8418 };
    assertEquals(40347.94228624079, bagofdevouring.expectedYield(values, weights), DELTA * 40347.94228624079);
  }

  //@Test
  public void case56() {
    int[] values = { 6638, 1439, 156, 7573, 7610, 6443, 1768, 4209 };
    int[] weights = { 5798, 4759, 2644, 8893, 786, 3731, 8832, 9753 };
    assertEquals(26408.81454164018, bagofdevouring.expectedYield(values, weights), DELTA * 26408.81454164018);
  }

  //@Test
  public void case57() {
    int[] values = { 9372, 3237, 378, 1499, 4280, 9825, 6774, 2183, 7252, 6605, 946, 2451, 3104 };
    int[] weights = { 2313, 1342, 111, 9468, 629, 4682, 7083, 1000, 977, 4310, 5607, 8196, 605 };
    assertEquals(41654.55901081119, bagofdevouring.expectedYield(values, weights), DELTA * 41654.55901081119);
  }

  //@Test
  public void case58() {
    int[] values = { 6633, 3262, 2799, 2620, 5237, 7082, 2187, 2536, 3825, 6438 };
    int[] weights = { 3559, 4388, 3757, 6242, 9235, 2592, 969, 6942, 6159, 1068 };
    assertEquals(27453.04794280261, bagofdevouring.expectedYield(values, weights), DELTA * 27453.04794280261);
  }

  //@Test
  public void case59() {
    int[] values = { 8922, 8667, 6184, 8001, 5206, 9415, 4340, 765, 8802, 3091 };
    int[] weights = { 9872, 9257, 8638, 7727, 9836, 8485, 3514, 9435, 4056, 5617 };
    assertEquals(40327.031677324594, bagofdevouring.expectedYield(values, weights), DELTA * 40327.031677324594);
  }

  //@Test
  public void case60() {
    int[] values = { 5127, 9828, 9069, 8498, 1747, 9664, 5657, 3646, 8591, 396, 7701, 9802, 2059 };
    int[] weights = { 4040, 4049, 342, 7527, 2260, 7037, 9730, 5923, 9424, 3689, 9966, 7935, 3388 };
    assertEquals(54848.20896675611, bagofdevouring.expectedYield(values, weights), DELTA * 54848.20896675611);
  }

  //@Test
  public void case61() {
    int[] values = { 10, 100, 150, 250, 500, 750, 1000, 2500, 5000, 7500, 10000, 111, 122, 1344, 111 };
    int[] weights = { 10, 100, 150, 250, 500, 750, 1000, 2500, 5000, 7500, 10000, 111, 122, 1344, 111 };
    assertEquals(21293.241001363935, bagofdevouring.expectedYield(values, weights), DELTA * 21293.241001363935);
  }

  //@Test
  public void case62() {
    int[] values = { 99, 100, 101 };
    int[] weights = { 1, 100, 9000 };
    assertEquals(249.2685581991035, bagofdevouring.expectedYield(values, weights), DELTA * 249.2685581991035);
  }

  //@Test
  public void case63() {
    int[] values = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] weights = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(14.110689301407396, bagofdevouring.expectedYield(values, weights), DELTA * 14.110689301407396);
  }

  //@Test
  public void case64() {
    int[] values = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int[] weights = { 10, 50, 100, 200, 350, 500, 400, 1000, 2000, 3000, 4000, 5000, 6000, 7000, 1 };
    assertEquals(919.730649295849, bagofdevouring.expectedYield(values, weights), DELTA * 919.730649295849);
  }

  //@Test
  public void case65() {
    int[] values = { 123, 234, 123, 42, 23, 42, 234, 234, 21, 23, 41, 12, 32, 34, 54 };
    int[] weights = { 12, 12, 34, 23, 52, 62, 76, 45, 23, 65, 76, 12, 32, 53, 35 };
    assertEquals(1055.830901576136, bagofdevouring.expectedYield(values, weights), DELTA * 1055.830901576136);
  }

  //@Test
  public void case66() {
    int[] values = { 10, 100, 150, 250, 500, 750, 1000, 2500, 5000, 7500, 10000, 100, 200, 300, 400 };
    int[] weights = { 100, 200, 300, 400, 500, 1000, 2000, 1500, 3000, 6000, 4000, 100, 200, 300, 400 };
    assertEquals(21670.5054641836, bagofdevouring.expectedYield(values, weights), DELTA * 21670.5054641836);
  }

  //@Test
  public void case67() {
    int[] values = { 1000, 999 };
    int[] weights = { 1, 9999 };
    assertEquals(1989.09900990099, bagofdevouring.expectedYield(values, weights), DELTA * 1989.09900990099);
  }

  //@Test
  public void case68() {
    int[] values = { 10, 100, 150, 250, 500, 750, 1000, 2500, 5000, 7500, 10000 };
    int[] weights = { 100, 200, 300, 400, 500, 1000, 2000, 1500, 3000, 6000, 4000 };
    assertEquals(20622.364509064962, bagofdevouring.expectedYield(values, weights), DELTA * 20622.364509064962);
  }

  //@Test
  public void case69() {
    int[] values = { 10, 100, 150, 250, 500, 750, 1000, 2500, 5000, 7500, 10000, 1000, 100, 1000, 100 };
    int[] weights = { 100, 200, 300, 400, 500, 1000, 2000, 1500, 3000, 6000, 4000, 1000, 100, 1000, 100 };
    assertEquals(22535.043985055374, bagofdevouring.expectedYield(values, weights), DELTA * 22535.043985055374);
  }

  //@Test
  public void case70() {
    int[] values = { 10, 100, 150, 250, 500, 750, 1000, 2500, 5000, 7500, 10000, 88, 56, 956, 57 };
    int[] weights = { 100, 200, 300, 400, 500, 1000, 2000, 1500, 3000, 6000, 4000, 88, 56, 72, 856 };
    assertEquals(22091.1749048458, bagofdevouring.expectedYield(values, weights), DELTA * 22091.1749048458);
  }

}
