package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ColorTheCellsTest {
  ColorTheCells colorthecells = new ColorTheCells();

  @Test
  public void case1() {
    int[] dryingTime = { 2, 2, 3 };
    assertEquals(6, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case2() {
    int[] dryingTime = { 1, 2, 100, 1 };
    assertEquals(7, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case3() {
    int[] dryingTime = { 33, 58, 21, 44 };
    assertEquals(26, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case4() {
    int[] dryingTime = { 35198, 26281, 72533, 91031, 44326, 43178, 85530 };
    assertEquals(26287, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case5() {
    int[] dryingTime = { 4, 3 };
    assertEquals(6, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case6() {
    int[] dryingTime = { 5, 5 };
    assertEquals(8, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case7() {
    int[] dryingTime = { 5, 6 };
    assertEquals(9, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case8() {
    int[] dryingTime = { 5, 7 };
    assertEquals(9, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case9() {
    int[] dryingTime = { 5, 8 };
    assertEquals(9, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case10() {
    int[] dryingTime = { 5, 9 };
    assertEquals(9, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case11() {
    int[] dryingTime = { 6, 5 };
    assertEquals(8, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case12() {
    int[] dryingTime = { 6, 6 };
    assertEquals(9, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case13() {
    int[] dryingTime = { 6, 7 };
    assertEquals(10, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case14() {
    int[] dryingTime = { 6, 8 };
    assertEquals(10, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case15() {
    int[] dryingTime = { 6, 9 };
    assertEquals(10, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case16() {
    int[] dryingTime = { 7, 5 };
    assertEquals(8, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case17() {
    int[] dryingTime = { 7, 6 };
    assertEquals(9, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case18() {
    int[] dryingTime = { 7, 7 };
    assertEquals(10, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case19() {
    int[] dryingTime = { 7, 8 };
    assertEquals(11, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case20() {
    int[] dryingTime = { 7, 9 };
    assertEquals(11, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case21() {
    int[] dryingTime = { 8, 5 };
    assertEquals(8, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case22() {
    int[] dryingTime = { 8, 6 };
    assertEquals(9, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case23() {
    int[] dryingTime = { 8, 7 };
    assertEquals(10, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case24() {
    int[] dryingTime = { 8, 8 };
    assertEquals(11, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case25() {
    int[] dryingTime = { 8, 9 };
    assertEquals(12, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case26() {
    int[] dryingTime = { 9, 5 };
    assertEquals(8, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case27() {
    int[] dryingTime = { 9, 6 };
    assertEquals(9, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case28() {
    int[] dryingTime = { 9, 7 };
    assertEquals(10, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case29() {
    int[] dryingTime = { 9, 8 };
    assertEquals(11, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case30() {
    int[] dryingTime = { 9, 9 };
    assertEquals(12, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case31() {
    int[] dryingTime = { 10, 7, 4 };
    assertEquals(8, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case32() {
    int[] dryingTime = { 7, 5, 8 };
    assertEquals(9, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case33() {
    int[] dryingTime = { 7, 10, 7 };
    assertEquals(11, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case34() {
    int[] dryingTime = { 9, 4, 5 };
    assertEquals(8, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case35() {
    int[] dryingTime = { 4, 7, 10, 8 };
    assertEquals(8, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case36() {
    int[] dryingTime = { 8, 10, 8, 7 };
    assertEquals(12, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case37() {
    int[] dryingTime = { 4, 4, 6, 8 };
    assertEquals(8, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case38() {
    int[] dryingTime = { 7, 9, 4, 5 };
    assertEquals(9, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case39() {
    int[] dryingTime = { 5, 7, 5, 7, 6 };
    assertEquals(11, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case40() {
    int[] dryingTime = { 8, 4, 7, 10, 9 };
    assertEquals(10, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case41() {
    int[] dryingTime = { 4, 4, 5, 10, 4 };
    assertEquals(10, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case42() {
    int[] dryingTime = { 10, 8, 5, 6, 6 };
    assertEquals(12, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case43() {
    int[] dryingTime = { 10, 9, 7, 5, 5, 10 };
    assertEquals(13, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case44() {
    int[] dryingTime = { 4, 9, 8, 8, 4, 7 };
    assertEquals(12, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case45() {
    int[] dryingTime = { 5, 6, 6, 7, 7, 8 };
    assertEquals(13, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case46() {
    int[] dryingTime = { 10, 8, 5, 5, 6, 9 };
    assertEquals(13, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case47() {
    int[] dryingTime = { 9, 4, 8, 7, 5, 7, 5 };
    assertEquals(16, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case48() {
    int[] dryingTime = { 8, 9, 6, 10, 6, 9, 5 };
    assertEquals(15, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case49() {
    int[] dryingTime = { 8, 9, 5, 7, 4, 6, 4 };
    assertEquals(15, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case50() {
    int[] dryingTime = { 10, 4, 5, 4, 8, 7, 7 };
    assertEquals(14, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case51() {
    int[] dryingTime = { 48465, 33816, 35469, 39940, 25809, 98600, 75035 };
    assertEquals(25819, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case52() {
    int[] dryingTime = { 11081, 62918, 86539, 5338, 19997, 3473, 3177 };
    assertEquals(3185, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case53() {
    int[] dryingTime = { 96353, 23736, 13308, 92210, 15990, 27781, 36073 };
    assertEquals(13316, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case54() {
    int[] dryingTime = { 34527, 15439, 14021, 15858, 66113, 43959, 68727 };
    assertEquals(14029, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case55() {
    int[] dryingTime = { 47505, 66210, 44519, 82569, 47908, 92235, 90233 };
    assertEquals(44527, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case56() {
    int[] dryingTime = { 98999, 4191, 10501, 7485, 96772, 8659, 61558 };
    assertEquals(4197, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case57() {
    int[] dryingTime = { 75855, 34569, 61057, 97916, 26057, 83188, 77847 };
    assertEquals(26067, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case58() {
    int[] dryingTime = { 2056, 81673, 93540, 53008, 7253, 6426, 84186 };
    assertEquals(2060, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case59() {
    int[] dryingTime = { 52915, 75838, 4095, 27212, 22309, 72134, 86659 };
    assertEquals(4103, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case60() {
    int[] dryingTime = { 36044, 7979, 3543, 61328, 53591, 65769, 66468 };
    assertEquals(3551, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case61() {
    int[] dryingTime = { 79848, 34700, 68268, 14435, 4421, 32812, 88191 };
    assertEquals(4431, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case62() {
    int[] dryingTime = { 32667, 3039, 45934, 79407, 63102, 47154, 59863 };
    assertEquals(3045, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case63() {
    int[] dryingTime = { 1800, 30041, 95391, 38335, 96059, 4768, 40581 };
    assertEquals(1804, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case64() {
    int[] dryingTime = { 76361, 33954, 47506, 99134, 76312, 96553, 41557 };
    assertEquals(33960, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case65() {
    int[] dryingTime = { 34765, 15657, 38173, 53993, 10570, 57049, 23896 };
    assertEquals(10580, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case66() {
    int[] dryingTime = { 73302, 73302, 73304 };
    assertEquals(73306, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case67() {
    int[] dryingTime = { 90634, 90636, 90635 };
    assertEquals(90638, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case68() {
    int[] dryingTime = { 50467, 50473, 50467 };
    assertEquals(50471, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case69() {
    int[] dryingTime = { 69686, 69683, 69685 };
    assertEquals(69687, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case70() {
    int[] dryingTime = { 15193, 15194, 15196, 15198 };
    assertEquals(15197, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case71() {
    int[] dryingTime = { 44460, 44453, 44454, 44453 };
    assertEquals(44458, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case72() {
    int[] dryingTime = { 68324, 68317, 68316, 68316 };
    assertEquals(68321, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case73() {
    int[] dryingTime = { 26992, 26990, 26990, 26994 };
    assertEquals(26995, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case74() {
    int[] dryingTime = { 76938, 76943, 76945, 76939, 76936 };
    assertEquals(76942, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case75() {
    int[] dryingTime = { 54062, 54061, 54059, 54058, 54061 };
    assertEquals(54064, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case76() {
    int[] dryingTime = { 82783, 82790, 82786, 82790, 82788 };
    assertEquals(82787, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case77() {
    int[] dryingTime = { 66514, 66515, 66517, 66521, 66519 };
    assertEquals(66518, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case78() {
    int[] dryingTime = { 50756, 50751, 50753, 50754, 50751, 50756 };
    assertEquals(50757, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case79() {
    int[] dryingTime = { 60230, 60224, 60230, 60227, 60232, 60225 };
    assertEquals(60230, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case80() {
    int[] dryingTime = { 90220, 90214, 90222, 90216, 90218, 90214 };
    assertEquals(90220, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case81() {
    int[] dryingTime = { 92298, 92291, 92292, 92290, 92297, 92292 };
    assertEquals(92297, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case82() {
    int[] dryingTime = { 74572, 74568, 74573, 74568, 74574, 74570, 74570 };
    assertEquals(74574, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case83() {
    int[] dryingTime = { 13773, 13773, 13773, 13773, 13780, 13773, 13772 };
    assertEquals(13777, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case84() {
    int[] dryingTime = { 7136, 7142, 7135, 7141, 7139, 7141, 7136 };
    assertEquals(7140, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case85() {
    int[] dryingTime = { 90118, 90126, 90120, 90118, 90120, 90117, 90117 };
    assertEquals(90122, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case86() {
    int[] dryingTime = { 59938, 59938, 59950, 59943, 59949, 59937, 59936 };
    assertEquals(59942, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case87() {
    int[] dryingTime = { 13869, 13858, 13857, 13857, 13869, 13857, 13862 };
    assertEquals(13864, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case88() {
    int[] dryingTime = { 45123, 45118, 45122, 45128, 45119, 45129, 45129 };
    assertEquals(45124, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case89() {
    int[] dryingTime = { 96358, 96351, 96353, 96359, 96353, 96358, 96349 };
    assertEquals(96357, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case90() {
    int[] dryingTime = { 27258, 27253, 27264, 27261, 27268, 27258, 27257 };
    assertEquals(27259, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case91() {
    int[] dryingTime = { 25293, 25299, 25308, 25306, 25301, 25291, 25303 };
    assertEquals(25297, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case92() {
    int[] dryingTime = { 69437, 69441, 69439, 69447, 69436, 69442, 69445 };
    assertEquals(69441, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case93() {
    int[] dryingTime = { 30548, 30547, 30558, 30554, 30560, 30551, 30558 };
    assertEquals(30552, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case94() {
    int[] dryingTime = { 66311, 66308, 66314, 66315, 66313, 66304, 66308 };
    assertEquals(66312, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case95() {
    int[] dryingTime = { 28337, 28341, 28328, 28334, 28330, 28328, 28330 };
    assertEquals(28336, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case96() {
    int[] dryingTime = { 83903, 83892, 83899, 83896, 83904, 83903, 83891 };
    assertEquals(83898, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case97() {
    int[] dryingTime = { 11732, 11738, 11746, 11734, 11741, 11734, 11740 };
    assertEquals(11736, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case98() {
    int[] dryingTime = { 41914, 41905, 41906, 41905, 41905, 41913, 41905 };
    assertEquals(41911, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case99() {
    int[] dryingTime = { 53504, 53497, 53498, 53495, 53499, 53502, 53496 };
    assertEquals(53503, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case100() {
    int[] dryingTime = { 6063, 6057, 6061, 6058, 6056, 6068, 6063 };
    assertEquals(6063, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case101() {
    int[] dryingTime = { 74904, 74909, 74919, 74916, 74921, 74906, 74909 };
    assertEquals(74908, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case102() {
    int[] dryingTime = { 89388, 89383, 89387, 89399, 89391, 89395, 89391 };
    assertEquals(89389, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case103() {
    int[] dryingTime = { 95560, 95552, 95560, 95546, 95550, 95556, 95549 };
    assertEquals(95556, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case104() {
    int[] dryingTime = { 17562, 17557, 17562, 17566, 17563, 17559, 17559 };
    assertEquals(17563, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case105() {
    int[] dryingTime = { 38844, 38842, 38836, 38853, 38845, 38852, 38849 };
    assertEquals(38844, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case106() {
    int[] dryingTime = { 35198, 26281, 72533, 91031, 44326, 43178, 85530 };
    assertEquals(26287, colorthecells.minimalTime(dryingTime));
  }

  @Test
  public void case107() {
    int[] dryingTime = { 2, 2, 3 };
    assertEquals(6, colorthecells.minimalTime(dryingTime));
  }

}
