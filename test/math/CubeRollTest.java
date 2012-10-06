package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class CubeRollTest {
  CubeRoll cuberoll = new CubeRoll();

  @Test
  public void case1() {
    int initPos = 5;
    int goalPos = 1;
    int[] holePos = { 3 };
    assertEquals(-1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case2() {
    int initPos = 36;
    int goalPos = 72;
    int[] holePos = { 300, 100, 200, 400 };
    assertEquals(1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case3() {
    int initPos = 10;
    int goalPos = 21;
    int[] holePos = { 38, 45 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case4() {
    int initPos = 98765;
    int goalPos = 4963;
    int[] holePos = { 10, 20, 40, 30 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case5() {
    int initPos = 68332;
    int goalPos = 825;
    int[] holePos = { 99726, 371, 67, 89210 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case6() {
    int initPos = 2;
    int goalPos = 17;
    int[] holePos = { 1, 18 };
    assertEquals(4, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case7() {
    int initPos = 2;
    int goalPos = 305;
    int[] holePos = { 1, 306 };
    assertEquals(4, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case8() {
    int initPos = 2;
    int goalPos = 99998;
    int[] holePos = { 1 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case9() {
    int initPos = 5;
    int goalPos = 12;
    int[] holePos = { 4, 13 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case10() {
    int initPos = 100000;
    int goalPos = 1;
    int[] holePos = { 83170 };
    assertEquals(-1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case11() {
    int initPos = 100000;
    int goalPos = 1;
    int[] holePos = { 84007, 87055, 80458, 19984, 27981, 61345, 93084, 70385, 49743, 83726, 79834, 37359, 68678, 82270, 68978, 61167, 83727, 14014, 88719, 36106, 15660, 65961, 19485, 34840, 96215, 4081, 64836, 63087, 15644, 60820, 53701, 3625, 10375, 14117, 54507, 31153, 64698, 42249, 27051, 66307, 46344, 13120, 42878, 87056, 46230, 53213, 50614, 94973, 29643, 50780 };
    assertEquals(-1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case12() {
    int initPos = 100;
    int goalPos = 99900;
    int[] holePos = { 99997, 88, 30, 62, 36, 99985, 56, 35, 99993, 79, 39, 50, 45, 57, 2, 99903, 94, 92, 99972, 99960, 53, 26, 99978, 99955, 99959, 99963, 99974, 84, 99904, 80, 99956, 14, 99951, 22, 75563, 99915, 65, 23, 99923, 91, 19, 99970, 78, 76, 99999, 99980, 67, 72, 99919, 99968 };
    assertEquals(-1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case13() {
    int initPos = 500;
    int goalPos = 5;
    int[] holePos = { 402, 35031, 11782, 11, 23957, 94, 67486, 42900, 102, 92126, 491, 348, 117, 33, 96527, 283, 318, 205, 57, 80, 5970, 17804, 20, 137, 489, 66473, 287, 97946, 161, 12486, 56, 440, 42293, 79091, 415, 411, 3014, 26756, 298, 59631, 19422, 16147, 31268, 56326 };
    assertEquals(-1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case14() {
    int initPos = 4000;
    int goalPos = 20;
    int[] holePos = { 3930, 18020, 16946, 3497, 37758, 12214, 2479, 2830, 97198, 41982, 3772, 38106, 2247, 2864, 142, 49514, 89682, 869, 73794, 72308, 95252, 70637, 308, 2745, 2361, 7290, 1830, 70414, 1547, 98729, 8198, 1538, 497, 374, 20388, 2196, 52457, 3180, 96118, 753, 126, 5993, 28111, 1865, 2906 };
    assertEquals(-1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case15() {
    int initPos = 13500;
    int goalPos = 45;
    int[] holePos = { 598, 18463, 1942, 90899, 70, 57338, 91863, 9136, 9276, 10310, 29093, 3826, 5884, 9820, 37556, 5793, 64756, 19179, 82214, 3367, 90708, 42222, 31603, 49761, 22555, 1024, 23218, 8310, 61892, 90873, 6929, 9345, 1678, 6309, 10487, 182, 10167, 12378, 99079, 65771, 7555, 68399, 2320, 58408, 4906, 29232, 75580, 92364, 8720 };
    assertEquals(-1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case16() {
    int initPos = 80;
    int goalPos = 32000;
    int[] holePos = { 31132, 62727, 64617, 18409, 85238, 61012, 22532, 9737, 4074, 76986, 22867, 48724, 48246, 16595, 13065, 25898, 71904, 29758, 87428, 40010, 53473, 13364, 8420, 3676, 11202, 29497, 8851, 8936, 94896, 6288, 56298, 92944, 83590, 50204, 26374, 41771, 33599, 57193, 52002, 5035, 7946, 97215, 85907, 21210, 91532, 86571, 13646, 43247, 5417 };
    assertEquals(-1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case17() {
    int initPos = 125;
    int goalPos = 62500;
    int[] holePos = { 86735, 23446, 5613, 99969, 80858, 51974, 78982, 78892, 51570, 52484, 24473, 70032, 77616, 51006, 64916, 16505, 85550, 37993, 46191, 60057, 58373, 86305, 10123, 19582, 99937, 75384, 97491, 64553, 87825, 26959, 95094, 74754, 3015, 53212, 69008, 74596, 21846, 81977, 50089, 12671, 83023, 67478, 22967, 79903, 89445, 71889 };
    assertEquals(-1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case18() {
    int initPos = 42807;
    int goalPos = 44571;
    int[] holePos = { 39017, 20306, 29032, 25977, 18312, 42424, 27909, 22813, 42264, 33996, 14393, 12311, 33005, 16254, 20880, 126, 19777, 31443, 9321, 5760, 1160, 20301, 34356, 32737, 20907, 32171, 36059, 25373, 11937, 16767, 30015, 33421, 3569, 1574, 29407, 22544, 35042, 19455, 40334, 14547, 7328, 27007, 10953, 32956, 39191, 29707, 5139, 41106, 35028, 5366 };
    assertEquals(1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case19() {
    int initPos = 54627;
    int goalPos = 42306;
    int[] holePos = { 20880, 21947, 35698, 2069, 11757, 9378, 23155, 5266, 7547, 41617, 40141, 36453, 28348, 9017, 31643, 11742, 14480, 16940, 30819, 36171, 16280, 23169, 17051, 32112, 5875, 804, 9070, 28071, 17921, 19884, 18080, 842, 34787, 31438, 6665, 25647, 42212, 3686, 757, 20587, 5328, 6685, 21035, 20809, 31072, 16034, 40403, 14770 };
    assertEquals(1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case20() {
    int initPos = 71392;
    int goalPos = 37536;
    int[] holePos = { 30734, 35499, 29902, 28174, 16650, 10515, 36171, 37517, 10103, 22950, 32581, 1497, 6314, 25959, 5568, 4697, 19370, 34984, 13439, 11214, 26501, 1759, 31413, 1001, 31339, 583, 8739, 16190, 18726, 26133, 24686, 6789, 16937, 33828, 5047, 34121, 13556, 33036, 16647, 1301, 17829, 28842, 20613, 12600, 20092, 29041, 21754 };
    assertEquals(1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case21() {
    int initPos = 87094;
    int goalPos = 15270;
    int[] holePos = { 13564, 13878, 13511, 13539, 11622, 8103, 10072, 7418, 1288, 6236, 15162, 9296, 8581, 7012, 10220, 1358, 8874, 6462, 13984, 11529, 10283, 7925, 9851, 8921, 5526, 13293, 8032, 3027, 10488, 3902, 10905, 4835, 6415, 4799, 142, 1099, 6023, 4523, 9215, 7917, 12353, 11323, 6725, 10247, 4376, 7660, 5317, 7817, 13548 };
    assertEquals(1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case22() {
    int initPos = 99953;
    int goalPos = 97;
    int[] holePos = { 31, 21, 57, 19, 50, 69, 11, 33, 88, 29, 84, 9, 59, 73, 87, 48, 16, 40, 83, 77, 71, 72, 3, 38, 81, 96, 15, 37, 78, 42, 93, 52, 92, 5, 64, 76, 82, 13, 66, 28, 30, 23, 63, 2, 56, 26, 8, 90, 89, 54 };
    assertEquals(1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case23() {
    int initPos = 99979;
    int goalPos = 99980;
    int[] holePos = { 60, 43, 17, 6, 42, 10, 7, 77, 72, 74, 65, 59, 64, 30, 15, 50, 36, 12, 2, 71, 78, 54, 79, 69, 38, 32, 48, 73, 22, 26, 11, 51, 76, 31, 46, 49, 5, 24, 61, 1, 35, 47, 67, 62, 75, 45, 55, 34, 18, 3 };
    assertEquals(1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case24() {
    int initPos = 3778;
    int goalPos = 69614;
    int[] holePos = { 88990, 84320, 71593, 82597, 97011, 92362, 93937, 84916, 72944, 69615, 86984, 86829, 72635, 97499, 80615, 99263, 74480, 96760, 79837, 84024, 95648, 80509, 91922, 87689, 87279, 95983, 82550, 87758, 95270, 74859, 92796, 86473, 73883, 89786, 96784, 71668, 89975, 74179, 72382, 81843, 91164, 88014, 95891, 96041, 95509, 92120, 80479, 73891, 70299, 81089 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case25() {
    int initPos = 81247;
    int goalPos = 62954;
    int[] holePos = { 30171, 9572, 20677, 29005, 29157, 18097, 3863, 7601, 38755, 20001, 7099, 49274, 48284, 7155, 1814, 9093, 25130, 27403, 25182, 615, 38597, 6692, 35207, 36018, 30998, 33632, 58506, 16757, 48164, 33934, 29840, 46312, 19493, 41646, 22701, 33757, 55569, 62953, 36871, 28113, 43610, 10937, 1547, 52665, 17212, 24107, 43945, 27055, 43030, 5682 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case26() {
    int initPos = 83950;
    int goalPos = 50827;
    int[] holePos = { 88946, 92493, 89432, 83951, 86065, 91467, 94887, 99990, 99066, 94607, 85737, 89212, 96093, 99442, 84047, 84252, 99181, 90552, 99579, 91027, 96593, 85360, 92937, 99375, 86961, 87904, 92827, 95631, 84175, 93106, 99730, 95289, 83962, 90797, 89074, 93043, 97415, 91381, 86464, 90288, 90260, 96733, 97846, 99414, 86511, 89375, 90302, 87165, 99671 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case27() {
    int initPos = 96821;
    int goalPos = 36037;
    int[] holePos = { 9995, 31737, 33051, 13768, 7713, 22843, 15518, 35954, 10237, 18520, 14892, 11946, 22758, 1655, 327, 682, 28234, 13909, 549, 26734, 36029, 8496, 7854, 35264, 19391, 23896, 35894, 33442, 3689, 32081, 6315, 447, 19693, 26983, 4290, 28640, 22615, 27860, 17950, 29405, 22648, 32105, 20205, 36019, 18882, 15976, 20313, 7504, 29070, 32993 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case28() {
    int initPos = 23139;
    int goalPos = 96720;
    int[] holePos = { 1615, 19499, 7359, 22435, 1088, 6823, 16263, 1805, 7563, 22660, 1173, 18857, 11870, 15129, 18898, 12677, 7493, 16299, 19359, 5731, 9607, 23133, 11554, 15507, 9241, 11010, 2576, 14373, 3943, 4852, 18745, 6109, 14985, 11194, 19070, 14008, 3462, 13764, 4362, 9184, 17273, 5615, 2069, 1152, 7503, 15875, 22515, 13486, 734, 3243 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case29() {
    int initPos = 24209;
    int goalPos = 13398;
    int[] holePos = { 76194, 73785, 54434, 42335, 62515, 26412, 53307, 82529, 31587, 96886, 36612, 58234, 62452, 30980, 44621, 53267, 64057, 64260, 31925, 48972, 46617, 79378, 39370, 60075, 38812, 60766, 35534, 53704, 24213, 69371, 32436, 79679, 86559, 89294, 94666, 43805, 87713, 75816, 66060, 35288, 43319, 48465, 88120, 73530, 30417, 39540, 99707, 92973, 40976 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case30() {
    int initPos = 16888;
    int goalPos = 99724;
    int[] holePos = { 99890, 99990, 99958, 99764, 99907, 99767, 99920, 99956, 99966, 99903, 99827, 99755, 99821, 99999, 99744, 99915, 99782, 99991, 99950, 99997, 99904, 99928, 99760, 99860, 99730, 99942, 99973, 99982, 99925, 99861, 99742, 99759, 99802, 99800, 99993, 99816, 99826, 99960, 99839, 99855, 99912, 99763, 99980, 99868, 99992, 99835, 99738, 99769, 99938 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case31() {
    int initPos = 4940;
    int goalPos = 94369;
    int[] holePos = { 99539, 95492, 95910, 94583, 96155, 96577, 96346, 99377, 94821, 97789, 95190, 97815, 98345, 94626, 97027, 94904, 95793, 98724, 98354, 98262, 95070, 98535, 98707, 99514, 98460, 99427, 96106, 95855, 94533, 94832, 99858, 96632, 97522, 95263, 97484, 95609, 99017, 94781, 97897, 94919, 97755, 97780, 99759, 97664, 97735, 94374, 95508, 99093, 94889 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case32() {
    int initPos = 32857;
    int goalPos = 46060;
    int[] holePos = { 24815, 11617, 20476, 1030, 25503, 32856, 29459, 20485, 15672, 20457, 24748, 1133, 16389, 16200, 17104, 22382, 2498, 2508, 31534, 24198, 3887, 21655, 13068, 1310, 29579, 31355, 25782, 13309, 25270, 18846, 10230, 23739, 23547, 6503, 3884, 11254, 4419, 5097, 5890, 24065, 29158, 1897, 9058, 22489, 17673, 29913, 2461, 29954, 27667, 7697 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case33() {
    int initPos = 98427;
    int goalPos = 13771;
    int[] holePos = { 13499, 11439, 5918, 1301, 2088, 9970, 2925, 5176, 7975, 10719, 142, 7744, 411, 4796, 1949, 11003, 9022, 9420, 11591, 12212, 12015, 13046, 12397, 5953, 6362, 718, 11930, 11069, 10105, 4963, 6347, 8291, 13184, 2586, 11284, 8672, 9196, 1770, 8174, 9582, 8433, 3928, 6302, 8443, 2075, 13743, 9988, 5795, 9974, 6815 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case34() {
    int initPos = 56829;
    int goalPos = 47240;
    int[] holePos = { 94986, 83865, 96025, 65622, 76762, 87976, 93018, 76355, 96610, 97720, 69731, 88342, 82702, 77303, 91410, 97628, 93054, 70806, 96352, 79604, 72965, 69861, 99105, 88903, 57895, 59342, 92178, 85591, 99086, 81443, 88643, 79569, 60087, 60185, 90761, 98371, 88948, 72259, 94053, 68011, 69605, 59412, 91658, 87246, 56841, 62986, 68843, 97099, 72083, 91007 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case35() {
    int initPos = 55429;
    int goalPos = 26214;
    int[] holePos = { 10647, 5101, 17836, 13560, 7641, 10355, 7938, 26205, 10786, 9795, 22543, 5445, 735, 21561, 2673, 6071, 5327, 4293, 21359, 22334, 23379, 18990, 9359, 3282, 12103, 25026, 15271, 8463, 21298, 22409, 17472, 3017, 467, 22252, 16389, 4340, 19565, 9699, 5416, 23332, 15719, 12544, 6008, 9358, 19678, 12036, 18126, 16609, 24033, 18299 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case36() {
    int initPos = 11430;
    int goalPos = 53464;
    int[] holePos = { 5602, 3010, 7913, 3761, 456, 1359, 2408, 11425 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case37() {
    int initPos = 51237;
    int goalPos = 39388;
    int[] holePos = { 9524, 39378, 16664, 26247, 16533, 32351, 32797, 13462, 8308, 12864, 20262, 23517, 38050, 5834, 8195, 26751 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case38() {
    int initPos = 97777;
    int goalPos = 25129;
    int[] holePos = { 98804, 98846, 99012, 99597, 97869, 98745, 98987, 99579, 99667, 97792, 99843, 99116, 98692, 99984, 99559, 99107, 98601, 98296, 97912, 98175, 98959, 98316, 99466, 99401 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case39() {
    int initPos = 65170;
    int goalPos = 33650;
    int[] holePos = { 7170, 12454, 8857, 29113, 19492, 1072, 25260, 8296, 7381, 11848, 32997, 17744, 15100, 13279, 25021, 5884, 24112, 16217, 1667, 9410, 14171, 18239, 16561, 85, 33630, 25887, 3799, 13311, 29397, 29520, 14365, 9912 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case40() {
    int initPos = 98383;
    int goalPos = 28650;
    int[] holePos = { 99201, 99470, 99332, 99043, 98456, 99105, 99490, 99509, 99882, 98947, 99792, 99044, 99647, 98573, 98805, 99988, 98817, 98779, 98709, 99337, 99984, 98482, 98826, 99431, 99079, 99225, 99147, 98408, 99644, 98742, 99525, 99057, 99129, 98872, 99008, 98528, 99610, 98996, 99657, 99596 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case41() {
    int initPos = 96559;
    int goalPos = 19483;
    int[] holePos = { 98611, 99912, 99693, 99746, 99350, 99839, 98005, 97642, 98104, 98907, 97998, 97983, 96754, 97242, 99591, 99923, 99046, 98958, 99661, 98337, 98105, 98283, 99568, 98007, 97494, 99293, 99078, 99870, 97487, 98549, 96792, 99073, 97215, 98301, 96862, 98700, 98264, 97269, 97192, 99781, 96589, 97459, 97481, 99789, 97561, 97565, 98265, 96804 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case42() {
    int initPos = 92740;
    int goalPos = 2846;
    int[] holePos = { 2000, 453, 2053, 2528, 2797, 681, 588, 1670, 2714, 264, 442, 2007, 2376, 1691, 1327, 1988, 172, 2115, 1053, 1222, 511, 1833, 2497, 1814, 871, 528, 1471, 1545, 390, 2787, 228, 734, 2039, 2258, 2552, 217, 1091, 2009, 1330, 2555, 1657, 2248, 2104, 473, 2724, 998, 2751, 1774, 22, 2826 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case43() {
    int initPos = 22865;
    int goalPos = 88559;
    int[] holePos = { 96933, 95904, 93422, 88599, 95502, 95207, 88685, 99930, 89070, 96641, 94328, 94270, 98253, 92628, 96175, 88632, 94340, 92844, 99938, 96966, 89320, 98872, 96621, 99342, 93138, 97605, 94647, 92830, 91327, 96317, 99189, 89973, 92117, 91448, 99084, 88858, 92687, 90301, 98081, 95511, 95498, 99484, 92136, 96100, 97239, 89094, 90504, 96465, 94312, 94283 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case44() {
    int initPos = 52332;
    int goalPos = 23534;
    int[] holePos = { 52392, 85000, 58968, 53374, 72978, 76423, 81169, 86728, 81006, 99868, 82724, 75433, 70731, 56627, 82543, 58133, 71999, 96268, 95129, 92219, 84261, 89037, 93142, 98517, 64503, 99334, 66751, 91819, 98593, 95558, 79918, 75921, 56655, 65731, 74231, 78487, 60863, 62664, 66586, 52583, 77393, 72498, 54755, 95765, 79180, 86312, 93936, 99422, 87933, 60284 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case45() {
    int initPos = 92950;
    int goalPos = 68572;
    int[] holePos = { 66624, 15429, 65266, 1818, 19907, 37381, 24638, 28768, 16047, 13655, 55011, 63696, 23764, 29273, 2446, 15967, 9060, 33142, 9367, 68492, 46404, 29182, 59564, 41474, 32906, 62415, 63771, 44384, 22890, 48107, 20852, 17642, 62968, 26945, 64189, 17623, 2829, 58226, 46740, 33951, 8818, 61991, 60491, 3164, 16473, 7852, 38088, 20242, 55762, 13132 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case46() {
    int initPos = 92652;
    int goalPos = 15958;
    int[] holePos = { 95476, 94738, 96730, 93409, 96196, 95452, 96577, 95573, 95946, 99213, 93271, 98160, 94719, 98975, 97041, 96261, 98797, 94176, 93850, 98119, 93322, 92848, 99394, 96172, 97220, 99964, 96228, 96795, 94331, 98924, 99041, 95424, 96930, 98128, 98482, 96956, 93642, 93959, 98690, 95552, 96944, 97268, 92752, 93821, 94646, 98223, 94926, 98277, 95330, 97753 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case47() {
    int initPos = 94579;
    int goalPos = 39485;
    int[] holePos = { 98580, 96884, 99732, 96682, 99793, 97063, 97265, 96779, 94699, 98692, 96380, 95545, 98704, 98286, 96251, 99871, 95587, 96842, 97523, 99729, 95340, 99326, 95132, 95294, 98673, 96868, 99640, 96646, 95022, 95082, 99341, 96121, 98060, 98625, 95682, 95112, 96709, 98895, 97166, 97550, 97836, 95819, 98993, 96335, 95893, 94955, 99868, 97100, 97952, 97238 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case48() {
    int initPos = 36610;
    int goalPos = 55588;
    int[] holePos = { 96967, 95938, 93454, 1483, 3574, 95031, 99488, 95422, 4129, 96139, 4222, 92326, 2187, 3031, 95867, 93540, 1593, 3577, 849, 93478, 95294, 2729, 2622, 93858, 92275, 96714, 99152, 97137, 1289, 99290, 4088, 97905, 1786, 93235, 93039, 2516, 91873, 98467, 99469, 99204, 93070, 95265, 630, 3691, 94561, 93583, 4, 97980, 99196 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case49() {
    int initPos = 42220;
    int goalPos = 23755;
    int[] holePos = { 70846, 85977, 80478, 65128, 70031, 4734, 78120, 9547, 78267, 75279, 68651, 74527, 94894, 64953, 84240, 93050, 70889, 75275, 13320, 82335, 73729, 10159, 67076, 63326, 62206, 98759, 99423, 86925, 79887, 72665, 98680, 70701, 3531, 64420, 63940, 82774, 70566, 96178, 87023, 82029, 71588, 3300, 77119, 91363, 1292, 62069, 73336, 1526 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case50() {
    int initPos = 36190;
    int goalPos = 50892;
    int[] holePos = { 93344, 88334, 88425, 185, 86493, 94263, 488, 95212, 93197, 87706, 1325, 91118, 91787, 89861, 1437, 86685, 1626, 97741, 4917, 98347, 4322, 97612, 95561, 97165, 91919, 92300, 94010, 91296, 4838, 97586, 94259, 89098, 4524, 457, 99083, 89610, 86001, 89407, 85889, 95328, 88864, 1756, 95247, 94718, 97739, 1563, 4568, 94731 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case51() {
    int initPos = 53067;
    int goalPos = 65887;
    int[] holePos = { 85436, 84000, 29552, 98009, 29091, 41829, 4143, 89735, 15688, 2044, 90557, 2413, 48984, 98303, 26469, 80867, 91090, 43766, 18331, 71476, 7815, 77645, 92648, 24370, 43444, 75583, 51161, 20151, 50928, 97511, 2569, 76541, 84339, 91408, 20711, 12900, 37660, 72456, 27652, 73965, 3485, 72849, 33568, 75692, 48606, 34423 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case52() {
    int initPos = 85294;
    int goalPos = 63724;
    int[] holePos = { 13772, 29419, 7617, 19938, 11453, 6808, 3726, 21158, 20759, 17892, 18482, 8416, 10480, 7460, 9849, 16742, 30234, 6573, 20598, 2779, 7943, 19761, 19396, 10908, 21221, 51, 28696, 21623, 27319, 29575, 7272, 19634, 8746, 1632, 12249, 23688, 1375, 28738, 16164, 26732, 28782, 23791, 14863, 11244, 97011, 26146, 22905 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case53() {
    int initPos = 41026;
    int goalPos = 52827;
    int[] holePos = { 77958, 93916, 23422, 19348, 23242, 97626, 80613, 18821, 12350, 99858, 8025, 89917, 99976, 20754, 14774, 72324, 72832, 80562, 16421, 32881, 30432, 94480, 78945, 89927, 83658, 77480, 72916, 81105, 90127, 79761, 23492, 96787, 84081, 32239, 12515, 98120, 24043, 4660, 75783, 10826, 13790, 74232, 7867, 15978, 90075, 25485, 94907, 29938 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case54() {
    int initPos = 54819;
    int goalPos = 68491;
    int[] holePos = { 31672, 36967, 38718, 33009, 36374, 98701, 32228, 21113, 14408, 18938, 26014, 532, 22764, 29390, 1300, 36880, 26583, 38979, 565, 44935, 35330, 29902, 19261, 45939, 20017, 38686, 99205, 13775, 2315, 7710, 18440, 20084, 97814, 45082, 26965, 39987, 42774, 41342, 3187, 38398, 34380, 33197, 21031, 30809, 38742, 29987, 98742, 48711, 45010, 37165 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case55() {
    int initPos = 10586;
    int goalPos = 41821;
    int[] holePos = { 66568, 82745, 60274, 52703, 58214, 71167, 1562, 93192, 7434, 6364, 51838, 75163, 81334, 59093, 57607, 65190, 10585, 3260, 88183, 7292, 83568, 2657, 9459, 77904, 4499, 54074, 879, 1143, 87473, 81080, 8158, 88911, 77623, 96472, 93259, 92785, 81420, 89913, 76399, 98707, 92704, 75817, 99740, 50946, 10069, 48109 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case56() {
    int initPos = 54076;
    int goalPos = 77206;
    int[] holePos = { 77207, 90966, 10078, 7573, 88774, 13309, 97296, 91708, 24216, 10365, 20243, 4670, 93575, 19173, 96705, 22387, 22797, 96829, 10948, 78998, 14811, 15458, 82639, 81132, 976, 25496, 18054, 6646, 638, 17010, 27174, 77599, 87450, 25262, 80136, 77490, 78312, 99571, 82183, 78010, 8658, 93421, 19374, 23612, 82074, 85919, 82903, 79920, 18931, 86128 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case57() {
    int initPos = 79157;
    int goalPos = 37797;
    int[] holePos = { 37796, 5505, 26197, 19259, 8027, 26077, 27702, 4428, 2026, 31773, 36003, 97481, 11061, 26477, 33532, 37540, 5548, 33665, 1523, 32686, 29478, 624, 5179, 26881, 23082, 12681, 29759, 27660, 6593, 20386, 4034, 12763, 23672, 18861, 5104, 30709, 27964, 21420, 18852, 23723, 2303, 13396, 13492, 15570, 8358, 18015, 97493 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case58() {
    int initPos = 72196;
    int goalPos = 52458;
    int[] holePos = { 8273, 80120, 48870, 43980, 9069, 94143, 4022, 83856, 97490, 98535, 19715, 37851, 7659, 24975, 17623, 42259, 30640, 3265, 8206, 2861, 96944, 11805, 84275, 15736, 92939, 32070, 7244, 88080, 81370, 89618, 36422, 2900, 23540, 94997, 41694, 83943, 36820, 22005, 37294, 36232, 14225, 84847, 90480, 30368, 11258, 52457, 98004 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case59() {
    int initPos = 14955;
    int goalPos = 4869;
    int[] holePos = { 50410, 4868, 62267, 90270, 77751, 92960, 83511, 83325, 2295, 59218, 90297, 80458, 67694, 65186, 99637, 60548, 72578, 77735, 91894, 83233, 64804, 82592, 74676, 63096, 78095, 71884, 51572, 63079, 97068, 76755, 75353, 62732, 63803, 80246, 2552, 84531, 92631, 85811, 74861, 87562, 77927, 67743, 73697, 95943, 64129, 87067, 55415, 92822 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case60() {
    int initPos = 78004;
    int goalPos = 55832;
    int[] holePos = { 5350, 18537, 11117, 90093, 30874, 90225, 1330, 27871, 42725, 18044, 16764, 39740, 12463, 7636, 94429, 38101, 98764, 99979, 96465, 78490, 34075, 82859, 79915, 27713, 87191, 25622, 8106, 636, 98613, 27957, 36251, 79216, 38504, 10869, 6869, 97675, 46808, 78005, 33779, 34099, 91995, 89661, 25556, 28226, 26061, 45907, 11361, 21001 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case61() {
    int initPos = 87628;
    int goalPos = 44451;
    int[] holePos = { 99746, 87718, 3370, 96058, 9984, 88892, 28559, 20930, 20092, 87629, 12026, 93370, 5004, 95054, 28773, 25324, 19796, 94713, 91111, 11196, 1660, 18866, 9123, 88812, 94305, 90100, 14919, 12053, 93039, 97505, 11688, 28437, 90537, 8988, 28328, 21355, 10817, 30109, 15833, 93989, 95189, 23364, 89544, 94159, 19321, 4463, 87669, 7331 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case62() {
    int initPos = 55113;
    int goalPos = 15683;
    int[] holePos = { 70160, 11723, 89502, 5448, 92660, 70475, 62204, 92404, 14513, 98279, 78437, 59563, 68467, 79059, 75462, 95004, 87574, 85000, 9843, 64588, 93952, 68006, 4033, 91990, 6746, 15682, 56689, 70554, 93947, 76989, 81154, 2305, 55114, 97092, 72949, 85028, 76942, 88535, 94217, 92579, 64778, 10176, 82913, 70017, 96984, 88261, 79976, 97842 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case63() {
    int initPos = 36775;
    int goalPos = 25327;
    int[] holePos = { 46021, 70633, 53007, 25326, 48532, 66671, 65302, 81851, 76114, 20692, 77975, 93449, 10983, 45346, 59675, 37441, 44759, 85437, 95608, 77104, 70971, 2466, 48425, 70406, 63367, 8891, 83416, 59738, 46467, 7331, 39269, 84212, 7725, 3147, 919, 73652, 57973, 36776, 47084, 38051, 70259, 15516, 11679, 66803, 98946, 53785, 60918 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case64() {
    int initPos = 86535;
    int goalPos = 81783;
    int[] holePos = { 89994, 62570, 89205, 99466, 46566, 41618, 22829, 26042, 10782, 63678, 46222, 78785, 4656, 48198, 86646, 18265, 68209, 98576, 74483, 51509, 34712, 12642, 33535, 73764, 45225, 61734, 72936, 29636, 18152, 12036, 22381, 88128, 72460, 37546, 98903, 93113, 51175, 10289, 95071, 86536, 20985, 60379, 13768, 20551, 11801, 44151, 81782 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case65() {
    int initPos = 51856;
    int goalPos = 30384;
    int[] holePos = { 59454, 54078, 1931, 8704, 14736, 62784, 72558, 29140, 79665, 14705, 18875, 80198, 78821, 87117, 24999, 23769, 29278, 28044, 487, 27198, 87470, 87919, 4030, 72554, 54165, 59184, 69150, 79494, 587, 205, 52485, 64871, 54285, 70602, 82325, 51857, 52491, 30383, 96061, 80835, 25449, 29930, 16835, 87088, 86142, 21015, 92836, 86171 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case66() {
    int initPos = 82681;
    int goalPos = 99343;
    int[] holePos = { 70337, 10864, 67520, 25849, 71317, 17051, 21861, 41902, 17058, 29860, 51371, 54751, 21257, 69779, 60142, 9167, 29988, 71837, 806, 65478, 77494, 78327, 74380, 71582, 55522, 49368, 1067, 6012, 46306, 26663, 71998, 77420, 20502, 6273, 63834, 8194, 40175, 64850, 99344, 63085, 82680, 20859, 218, 59839, 60454, 74317, 68344 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case67() {
    int initPos = 20613;
    int goalPos = 32180;
    int[] holePos = { 82139, 40650, 58202, 41231, 55126, 89649, 20612, 6174, 41295, 85853, 15118, 2135, 52776, 11638, 45032, 40631, 98621, 57422, 79579, 64929, 12474, 64719, 59082, 91922, 36598, 71899, 32181, 80362, 47056, 39153, 44399, 17062, 33205, 59524, 6628, 4048, 40335, 53398, 57646, 80237, 91091, 92997, 116, 3654, 11055, 1914, 75731 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case68() {
    int initPos = 17356;
    int goalPos = 51584;
    int[] holePos = { 80656, 81056, 65468, 3569, 55742, 11731, 75040, 65900, 53458, 5789, 88500, 70373, 88230, 78592, 61626, 58465, 1926, 3530, 17355, 63242, 57538, 99216, 90640, 351, 6749, 91264, 68282, 83990, 80951, 81516, 70844, 54671, 62371, 14058, 14267, 60315, 86981, 73915, 99948, 80623, 77374, 2934, 51585, 71006, 73203, 62782, 82769 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case69() {
    int initPos = 2;
    int goalPos = 56443;
    int[] holePos = { 1, 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case70() {
    int initPos = 2;
    int goalPos = 83802;
    int[] holePos = { 1, 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case71() {
    int initPos = 42608;
    int goalPos = 2;
    int[] holePos = { 100000, 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case72() {
    int initPos = 1808;
    int goalPos = 2;
    int[] holePos = { 100000, 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case73() {
    int initPos = 71368;
    int goalPos = 2;
    int[] holePos = { 1, 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case74() {
    int initPos = 99999;
    int goalPos = 974;
    int[] holePos = { 100000, 1 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case75() {
    int initPos = 95554;
    int goalPos = 99999;
    int[] holePos = { 100000, 1 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case76() {
    int initPos = 2;
    int goalPos = 22803;
    int[] holePos = { 100000, 1 };
    assertEquals(1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case77() {
    int initPos = 56748;
    int goalPos = 50000;
    int[] holePos = { 100000, 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case78() {
    int initPos = 50000;
    int goalPos = 91279;
    int[] holePos = { 1, 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case79() {
    int initPos = 96846;
    int goalPos = 50000;
    int[] holePos = { 1, 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case80() {
    int initPos = 1142;
    int goalPos = 50001;
    int[] holePos = { 100000, 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case81() {
    int initPos = 22867;
    int goalPos = 50001;
    int[] holePos = { 1, 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case82() {
    int initPos = 50001;
    int goalPos = 47428;
    int[] holePos = { 1, 100000 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case83() {
    int initPos = 36442;
    int goalPos = 50001;
    int[] holePos = { 100000, 1 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case84() {
    int initPos = 41720;
    int goalPos = 50001;
    int[] holePos = { 100000, 1 };
    assertEquals(1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case85() {
    int initPos = 2;
    int goalPos = 98033;
    int[] holePos = { 1, 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case86() {
    int initPos = 50212;
    int goalPos = 79659;
    int[] holePos = { 1, 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case87() {
    int initPos = 50212;
    int goalPos = 20765;
    int[] holePos = { 1, 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case88() {
    int initPos = 50212;
    int goalPos = 349;
    int[] holePos = { 1, 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case89() {
    int initPos = 10000;
    int goalPos = 15727;
    int[] holePos = { 9977, 15775 };
    assertEquals(4, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case90() {
    int initPos = 10000;
    int goalPos = 15447;
    int[] holePos = { 9975, 15465 };
    assertEquals(4, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case91() {
    int initPos = 36;
    int goalPos = 72;
    int[] holePos = { 300, 100, 200, 400 };
    assertEquals(1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case92() {
    int initPos = 68332;
    int goalPos = 825;
    int[] holePos = { 99726, 371, 67, 89210 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case93() {
    int initPos = 2;
    int goalPos = 5;
    int[] holePos = { 1, 6 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case94() {
    int initPos = 100000;
    int goalPos = 2;
    int[] holePos = { 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case95() {
    int initPos = 1;
    int goalPos = 99999;
    int[] holePos = { 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case96() {
    int initPos = 2;
    int goalPos = 80003;
    int[] holePos = { 1, 80004 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case97() {
    int initPos = 2;
    int goalPos = 9;
    int[] holePos = { 1, 10 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case98() {
    int initPos = 11;
    int goalPos = 14;
    int[] holePos = { 10, 15 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case99() {
    int initPos = 10;
    int goalPos = 21;
    int[] holePos = { 9, 22 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case100() {
    int initPos = 1;
    int goalPos = 7;
    int[] holePos = { 8 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case101() {
    int initPos = 1;
    int goalPos = 2002;
    int[] holePos = { 100000 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case102() {
    int initPos = 1;
    int goalPos = 2;
    int[] holePos = { 20 };
    assertEquals(1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case103() {
    int initPos = 3443;
    int goalPos = 99994;
    int[] holePos = { 20, 30, 3000, 99999 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case104() {
    int initPos = 2;
    int goalPos = 33976;
    int[] holePos = { 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case105() {
    int initPos = 99999;
    int goalPos = 1;
    int[] holePos = { 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case106() {
    int initPos = 1;
    int goalPos = 15;
    int[] holePos = { 100000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case107() {
    int initPos = 6;
    int goalPos = 9;
    int[] holePos = { 5, 10 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case108() {
    int initPos = 1;
    int goalPos = 4;
    int[] holePos = { 90012 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case109() {
    int initPos = 3;
    int goalPos = 100000;
    int[] holePos = { 1 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case110() {
    int initPos = 2;
    int goalPos = 100000;
    int[] holePos = { 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case111() {
    int initPos = 76453;
    int goalPos = 9117;
    int[] holePos = { 1, 1000 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case112() {
    int initPos = 6;
    int goalPos = 12;
    int[] holePos = { 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case113() {
    int initPos = 1;
    int goalPos = 4;
    int[] holePos = { 555 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case114() {
    int initPos = 1;
    int goalPos = 31;
    int[] holePos = { 32 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case115() {
    int initPos = 1;
    int goalPos = 7;
    int[] holePos = { 99726, 371, 67, 89210 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case116() {
    int initPos = 1001;
    int goalPos = 1015;
    int[] holePos = { 1000, 1016 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case117() {
    int initPos = 1;
    int goalPos = 20;
    int[] holePos = { 21 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case118() {
    int initPos = 99997;
    int goalPos = 100000;
    int[] holePos = { 99996 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case119() {
    int initPos = 2000;
    int goalPos = 1;
    int[] holePos = { 2001 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case120() {
    int initPos = 10;
    int goalPos = 25;
    int[] holePos = { 9, 26 };
    assertEquals(4, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case121() {
    int initPos = 1;
    int goalPos = 7;
    int[] holePos = { 10000 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case122() {
    int initPos = 2;
    int goalPos = 60001;
    int[] holePos = { 1 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case123() {
    int initPos = 1;
    int goalPos = 15;
    int[] holePos = { 20 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case124() {
    int initPos = 10;
    int goalPos = 21;
    int[] holePos = { 45, 9 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case125() {
    int initPos = 2;
    int goalPos = 100;
    int[] holePos = { 1, 101 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case126() {
    int initPos = 5;
    int goalPos = 1;
    int[] holePos = { 3 };
    assertEquals(-1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case127() {
    int initPos = 2;
    int goalPos = 8;
    int[] holePos = { 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case128() {
    int initPos = 100;
    int goalPos = 121;
    int[] holePos = { 99, 122 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case129() {
    int initPos = 100;
    int goalPos = 107;
    int[] holePos = { 90000 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case130() {
    int initPos = 1;
    int goalPos = 7;
    int[] holePos = { 10 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case131() {
    int initPos = 2;
    int goalPos = 14;
    int[] holePos = { 15, 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case132() {
    int initPos = 2;
    int goalPos = 20016;
    int[] holePos = { 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case133() {
    int initPos = 10;
    int goalPos = 13;
    int[] holePos = { 9, 14 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case134() {
    int initPos = 2;
    int goalPos = 2005;
    int[] holePos = { 1 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case135() {
    int initPos = 1;
    int goalPos = 15;
    int[] holePos = { 100 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case136() {
    int initPos = 1;
    int goalPos = 99998;
    int[] holePos = { 100000 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case137() {
    int initPos = 50;
    int goalPos = 10;
    int[] holePos = { 20 };
    assertEquals(-1, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case138() {
    int initPos = 1;
    int goalPos = 33;
    int[] holePos = { 50000 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case139() {
    int initPos = 100;
    int goalPos = 123;
    int[] holePos = { 99, 124 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case140() {
    int initPos = 2;
    int goalPos = 13;
    int[] holePos = { 1, 14 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case141() {
    int initPos = 1;
    int goalPos = 55;
    int[] holePos = { 100 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case142() {
    int initPos = 2;
    int goalPos = 4005;
    int[] holePos = { 1 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case143() {
    int initPos = 99860;
    int goalPos = 1;
    int[] holePos = { 99999 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case144() {
    int initPos = 2;
    int goalPos = 17;
    int[] holePos = { 1, 18 };
    assertEquals(4, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case145() {
    int initPos = 50;
    int goalPos = 61;
    int[] holePos = { 35, 62 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case146() {
    int initPos = 4;
    int goalPos = 7;
    int[] holePos = { 3, 8 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case147() {
    int initPos = 2;
    int goalPos = 5;
    int[] holePos = { 6, 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case148() {
    int initPos = 2;
    int goalPos = 5;
    int[] holePos = { 7, 6, 1 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case149() {
    int initPos = 1;
    int goalPos = 7;
    int[] holePos = { 33 };
    assertEquals(3, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

  @Test
  public void case150() {
    int initPos = 98765;
    int goalPos = 4963;
    int[] holePos = { 10, 20, 40, 30 };
    assertEquals(2, cuberoll.getMinimumSteps(initPos, goalPos, holePos));
  }

}
