package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TaroFriendsTest {
  TaroFriends tarofriends = new TaroFriends();

  @Test
  public void case1() {
    int[] coordinates = { -3, 0, 1 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case2() {
    int[] coordinates = { 4, 7, -7 };
    int X = 5;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case3() {
    int[] coordinates = { -100000000, 100000000 };
    int X = 100000000;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case4() {
    int[] coordinates = { 3, 7, 4, 6, -10, 7, 10, 9, -5 };
    int X = 7;
    assertEquals(7, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case5() {
    int[] coordinates = { -4, 0, 4, 0 };
    int X = 4;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case6() {
    int[] coordinates = { 7 };
    int X = 0;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case7() {
    int[] coordinates = { 527, -168, 795, 113, 319, 24, 613, 661, -829, 763, 737, 541, -717, 981, -12, 512, 898, -87, 73, -968, -553, 880, 228, -586, -265, -211, -3, -252, -941, 491, -967, -766, -616, 253, -629, 293, 428, 744, -778, -203, -321, 222 };
    int X = 824;
    assertEquals(1416, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case8() {
    int[] coordinates = { 45, -168, 70, -384, 579, -715, -111, -12, -708, 371, 145, -676, 727, -926, -792 };
    int X = 53;
    assertEquals(1547, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case9() {
    int[] coordinates = { 106, 347, -103, -482, 807, -507, -485, -582 };
    int X = 832;
    assertEquals(1204, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case10() {
    int[] coordinates = { -412, -807, 19, -820, 481, -929, -801, -133, -783, 801, -8, 394, -861, -425, -394, 614, -510, -243, 343, 8, -392, -231, 514, 701, 798, 92, -51, -726, 848, -358, -606, 666, 121, -523, 126, -624, 982, 869, -627, -208, -276, -958, 521, -835, 547, 35, -441, 408, 666, -199 };
    int X = 34;
    assertEquals(1872, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case11() {
    int[] coordinates = { -288, -22, -42, 403, -278, 985 };
    int X = 634;
    assertEquals(691, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case12() {
    int[] coordinates = { 328, -467, -638, -858, -810, 334, -24, 972, 183, -418, -488, 556, -306, 294, -473, -314, 81 };
    int X = 471;
    assertEquals(891, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case13() {
    int[] coordinates = { 51, -330, -899, -730, -603, -260, -740, -851, -707, 453, 132, -964, 970, -340, -801, 354, -11, -866, -403, -762, 856, 383, -195, -31, -126, -905, -166, -987, -809, 558, -74, 147, -885, 371, -514, -81, -139, 50, 225, 728, 437 };
    int X = 321;
    assertEquals(1315, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case14() {
    int[] coordinates = { 523, 740, -995, -723, 249, 309, 395, -385, 779, -842, 177, -150, 389, 409, 33, -98, 740, -452, 765, -650, 449, -219, -356, 513, 133, -761, 607, 560, -923, 810, -956, -92, -485, 211, 923, -124 };
    int X = 818;
    assertEquals(1471, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case15() {
    int[] coordinates = { -232, 449, 719, 283, 76, 573, -168, -929, -24, -169, -323, -70, 151, -517, -18, 851, -86, -556, -337, -989, -693, 634, -890, 456, 845, 651, -65, 225, -58, -564, 55, 527, -989, 230, 418, -637, 854, 183, -352 };
    int X = 503;
    assertEquals(940, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case16() {
    int[] coordinates = { 435, 350, 744, 286, 873, 49, 407, -466, 522, -314, -804, 103, -336, -972, -450, 147, 209, -967, 463, -403, 73, 401, -20, 524, 703, -212, -109, -839, -520, 754, 531, -864, -979, -36, 691, -509, 977, 977, 610, -722, 964, 477 };
    int X = 231;
    assertEquals(1494, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case17() {
    int[] coordinates = { -98841457, 27770200, -45015732, 11403315, 5102510, 64895622 };
    int X = 13343521;
    assertEquals(137050037, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case18() {
    int[] coordinates = { 92415406, -13310589, -98439969, 25232833, 78813512, 65539535, -50350843, -12602216, -17738351, 19423014, -61387944, -44277566, 70986732, -53565468, -85332876, -46321058, -3734620, -65349534, -70915400, -23773339, -88802443, -76614816, 68719167, 71279471, 48816204, -94449945, -17431907, 42698774, 83219374, 35132809, -49443985, 12389851 };
    int X = 47860021;
    assertEquals(95135333, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case19() {
    int[] coordinates = { 66965138, -61603104, 58954574, -77526889, 80502960, 92673605, 71153266 };
    int X = 81877282;
    assertEquals(43196886, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case20() {
    int[] coordinates = { 16878979, -82697175, 44996155, -75079568, -70752304, 58009774, -59232231, 30437808, 27491936, -72005357, -43386445, -44242532 };
    int X = 86946628;
    assertEquals(113627832, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case21() {
    int[] coordinates = { -75679085, -25658828, 76733569, -59692956, 83726910, -56364676, 14750055, 69815606, 78640341, 43610568, 67894510, 67077462, 65640696, 12647082, 361798, -98974775, 12961149, -97482582, 19371320, 99391134, -49143949, -16725180, 74291844, 28467315, 42664614, -66758115, -90763445, 65629653, 63490565, 53326606, 5205610, 40266407, -68510021, -43508705, -63029937 };
    int X = 23720776;
    assertEquals(150924357, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case22() {
    int[] coordinates = { -74671946, 82577842, 50560724, -5066263 };
    int X = 30251183;
    assertEquals(96747422, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case23() {
    int[] coordinates = { -77921829, -90064253, -97849198, 69564744, 51498873, 77513379, 34024980, 61561050, -70817280, 91032322, 87562647, 70543738, 68268126, -43020510, -1382845, -38916221, 56689357, -57700259 };
    int X = 55489981;
    assertEquals(92415167, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case24() {
    int[] coordinates = { -55366852, 26896258, 61671252, -27004908, 1735695, 62367525, 67864558, -44228650, -93871519, 52310738, 96931191, 68089504, -67331731, -27733655, -9563329, -35514717, -65223709, -95699358, 96184534, -15217548, 52313200, 52887108, 22270847, -44460553, -19088809, 78659805, -76401884, 64092912, -99776679, 45469868, -75868243 };
    int X = 76152595;
    assertEquals(131770038, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case25() {
    int[] coordinates = { -62256529, -44349213, 33054512, 60189273, -26763029, 92229494, 63428337 };
    int X = 26492429;
    assertEquals(101501165, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case26() {
    int[] coordinates = { -52286155, 26890640, -35418844, -24325124, -6854191, 32229175, 98980180, 45508605, -29325635, 85489286, 85994299, 83130663, 83766052, 36879480, -72429201, -14005747, 28359789, 90191601, -47969075, -94209733, 5312642, -3527114, -59878402, 58262969, 95701207, 63285588, -94567718, -33835961, -43919260, 93873086, 6853986, -63896059, -75488411, 25688053 };
    int X = 59149176;
    assertEquals(101421704, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case27() {
    int[] coordinates = { -1173, 7086, -1199, -1439 };
    int X = 56061098;
    assertEquals(8525, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case28() {
    int[] coordinates = { 654, -7780, -4542, -6288, 1607, 4439, 1554, 7604, -8446, 5875, -2731, 7408, -6023, 3125, -7056, -5533, 7122, -1414, -2823, -5158, 531, 426, -8505, 4988, 7612 };
    int X = 50372243;
    assertEquals(16117, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case29() {
    int[] coordinates = { -8531, 9685, -5992, -2523, -1035, 6449, -215, 5642, 517, -8449, -601, -6085, -9095, 5139, -1741, -1270, -8513, 6481, -9799, 6228, 7376, -234, 6086, 3007, 1591, -8472, 3419, -1108, 5530, -598, 9074, 2711, -6858, 7235, -8357, 382, -1892, -6173, 8155, 9472, -1967, -7312, 3742 };
    int X = 63983510;
    assertEquals(19484, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case30() {
    int[] coordinates = { 9429, -475, 5441, -9060, 316, 430, 2850, -5561, -4370, 4285, -3910, 9269, -9569, -7818, 5158, -3358, 4169, -1282, -8545, -8717, 6034, 386, 2074, 1573, -3750, -1390, 942, 3645, 6754, -3989, -9589, 8273, 2966, -761, -4192, 2609, -7492, -3175, 3992, -6284, 4346, 4646, -1690, 8349, -7470, -9895 };
    int X = 41532329;
    assertEquals(19324, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case31() {
    int[] coordinates = { 3310, -6566, -3513, 1946, 5837, 828, -5140, -9484, 3320, -7792, -5062, -3491, 6747, -5961, 9094, -6307, -3169, -1435 };
    int X = 7126943;
    assertEquals(18578, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case32() {
    int[] coordinates = { -12953046, -89500818, 4743425, -24946388, 93206088, 12495529, -90067426, 36114129, 9895207, 92535824, 31787250, 30619517, 39083081, 42646548, 98214062, -6662711, 25130898, -66710283, 26315453, -73432140, 97031361, 33132149, -49221900, -25171316, -3424362, 37639105, -90548848, 75025015, -62455494, -96913062, -90570990, -93415534, -54813637, -11025010, -43118790, 21203470, -83118833, 28345906, -59851876, 94310546, -11744542, -79470564, 55121433, -94935506, 31620468, -68196398, -30054135, 78428041, 83721971, -12135601 };
    int X = 78651699;
    assertEquals(144238743, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case33() {
    int[] coordinates = { 96121008, 59812430, -4196539, 89408775, 38094935, 86147397, -44658478, -21776949, -14955023, -98813600, 48749983, 21531673, 22150262, 67453778, 3589317, 33573649, -9786522, -37910509, -55961991, -94750320, -85940377, -90687690, -79859040, 58074934, 14710643, 10453594, -8230125, 18531608, 75755024, -49541247, -22477017, 85157437, 22525040, -44335220, 43268815, -38911568, 71992041, 460039, -45448098, 9849208, -30250702, -641512, 6363676, 32481719, -71338179, -1830346, 25482793, 46419876, 35568682, 53394892 };
    int X = 85322679;
    assertEquals(155269170, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case34() {
    int[] coordinates = { -41329863, 51107692, 69323418, 68957638, -45409118, -54309779, -98479259, -76874962, 71881348, -85441012, 20501087, -25424298, -61041665, -46291677, -5770337, -51780419, 80821063, -49415808, -11516291, -54276827, 81837935, 9569389, 73686326, 70481813, -89519669, 28162788, -9973365, 39266591, 87442727, 98162274, -98468687, -75717370, -92201615, -64672686, 88440799, 11567320, -93136101, -22042718, -49633226, -24562385, 11000379, 88715231, 42197282, -60794186, 78951841, -75793044, -7496475, 50217021, 26608118, -8852803 };
    int X = 59475090;
    assertEquals(103610454, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case35() {
    int[] coordinates = { 40182976, -41742142, 70316177, 37791382, -22274188, 32109157, -17378746, 19997260, -10010984, -9524300, 87170277, 59605585, 36376279, 50850736, 51703725, 46067578, -69223821, -47868237, -97079040, -96981821, 36931648, 11036969, 95484268, -31606920, 66648600, -87849780, -3497032, 52290155, 39685966, -62138759, 52270355, -52709557, -36556135, 61738434, 85251630, -72461666, -16556889, -70455547, 98026525, 98630013, 88259714, -98176565, 56355701, 73134960, 98887509, -72523577, 11445956, 68000867, -38263856, -61139501 };
    int X = 43254518;
    assertEquals(110555038, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case36() {
    int[] coordinates = { -64282268, 29386066, 67331150, -34442491, 12381415, 66073720, -59919569, -34756526, -48828077, -66740751, -96290706, 30059112, -5188127, -1208720, -30623929, 34665402, -39578946, 20569852, -92370630, 75639063, 71110638, 48909565, 87083871, 75602427, 68645308, 88216326, 28862613, 72515717, -4641564, -50492177, -63521796, -69618047, -35740584, -63801033, -37893703, -33049838, -84286486, -77150058, -28763580, -72938607, 8660993, -7552609, 74556089, 77353464, 15154813, -65097579, -83860796, -73603399, 11838820, -60851596 };
    int X = 67970601;
    assertEquals(114730231, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case37() {
    int[] coordinates = { 86569462, -75266014, 86569462, 86569462, -75266014, -75266014, 7544532, 86569462, -75266014, 7544532, 86569462, -75266014, 86569462, 86569462, 7544532, -75266014, -75266014, 86569462, 86569462, 7544532, 86569462, 7544532, -75266014, 7544532, -75266014, 7544532, 86569462, 7544532, -75266014, 7544532, 7544532, -75266014, -75266014, -75266014, -75266014, 86569462, 86569462, -75266014, 86569462, 7544532, -75266014, 86569462, 7544532, -75266014, -75266014, 86569462, -75266014, 7544532, 86569462, -75266014 };
    int X = 44997815;
    assertEquals(79024930, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case38() {
    int[] coordinates = { 18575708, 3589909, -55975631, -6552265, -55985516, 12932292, 84109857, -55975631, 72155891, 18575708, 18575708, 46612981, 3589909, 38936810, 2024757, -78995222, 2024757, -88742781, -55975631, -66655731, -77912953, -30226714, 72893111, -87173220, 30145415, -77912953, 38936810, -13631860, 87493562, -91805500, -88742781, -6552265, 12932292, -97226215, 48363311, 53375050, -55975631, 48363311, 93849065, 2577442, -78995222, -98611311, 93849065, 58147512, 12932292, 2024757, 2577442, 38753249, 38753249, 12932292 };
    int X = 17525021;
    assertEquals(157410334, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case39() {
    int[] coordinates = { 83899654, -51568413, -29841658, 87384794, 97644152, -54415072, 91006383, 75531259, 67828244, 42300694, 97644152, 42300694, -38552424, 60633730, -51568413, 60633730, 35701770, -26533418, -33363532, -38552424, -26533418, 87384794, 75531259, 87384794, -29841658, 67828244, 87384794, 97644152, -54415072, 75531259, 67828244, 75531259, 91006383, 60633730, -54415072, -72101553, 87384794, 67828244, -72101553, 35701770, 42300694, 87016264, -72101553, 35701770, 42300694, -38552424, 87016264, 87016264, 75531259, -33363532 };
    int X = 77532651;
    assertEquals(92830114, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case40() {
    int[] coordinates = { 93831050, 50402355, 93221278, 47276220, 62296444, 98732837, -90511079, -29345309, 93221278, -94362905, -82501706, -24156368, 5010578, -90511079, 62296444, -12969430, -29345309, -1617395, 93450394, 76194463, -90511079, -76606434, 98926889, 26001980, 97515820, 74686686, 93221278, -1617395, -40955312, -42346311, 5050360, 93831050, -81849518, 36312577, 45707938, -1617395, -90511079, 76194463, -33666534, -72619811, -12164930, 98926889, -56912179, -33666534, 74686686, -42346311, -24156368, 93831050, 62296444, 44734631 };
    int X = 61958991;
    assertEquals(102966362, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case41() {
    int[] coordinates = { -20501664, 26799123, -79053433, -20501664, 26799123, 16111135, 71557645, 26799123, 16111135, -20501664, -79053433, -20501664, -79053433, 77926432, -44512289, -44512289, 16111135, 98447868, -20501664, 83893075, -87359090, -44512289, -87359090, 30038113, 30038113, -44512289, 16111135, 26799123, 30038113, 83893075, -44512289, -79053433, 71557645, 98447868, 16111135, -87359090, 26799123, -44512289, -79053433, -44512289, 16111135, -87359090, 77926432, -79053433, 26799123, 26799123, -44512289, 30038113, 83893075, -79053433 };
    int X = 23022863;
    assertEquals(139761232, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case42() {
    int[] coordinates = { -4470625, 24333292, -73828822, -38859137, -38859137, -45439684, 62551284, -12770717, -24843492, 15400489, 53684117, -83795502, 55602069, 50883458, -10319472, -83795502, 50883458, -83795502, -73828822, 96320489, 55602069, 24333292, -3309886, -3309886, -74880424, -62610765, 62551284, 50883458, -12770717, -38859137, 50883458, -73828822, 50883458, 36029308, 55602069, -4470625, -73828822, 15400489, 55602069, -45439684, -4470625, 4316718, -73828822, 96320489, -4470625, -24843492, 62551284, 15400489, -12770717, -73828822 };
    int X = 60236358;
    assertEquals(108776700, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case43() {
    int[] coordinates = { -13928290, -62640189, 20944938, 37706388, -10715488, 41858075, -62640189, -64961725, -43023845, 37706388, -62640189, -65271384, -65271384, 42470249, 81701189, -10715488, -43023845, -57925918, -65271384, -34997847, 31344800, -55362949, -10715488, 37706388, 81701189, -75690750, 37706388, 42470249, -65271384, -10715488, 37706388, 1362610, 73052974, -13928290, 81701189, -67092874, -62640189, -57925918, 89860723, 20944938, 37706388, -57925918, -55362949, -64961725, -78710290, -57925918, 28712067, -13928290, 1362610, 37706388 };
    int X = 74488301;
    assertEquals(121180539, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case44() {
    int[] coordinates = { 55185544, -15461753, 54152342, 48091286, -15461753, 66117221, -54656235, 42175318, -33832084, -85639515, -14302309, 78645590, 8460357, -83919744, -32358575, 42175318, 7111893, -22461297, -8175046, 79331261, 78645590, -91986118, -83919744, 68448535, -83919744, 78645590, 37261990, -54656235, -91986118, 37261990, 55403036, 48091286, 18956562, -54656235, 78645590, 42175318, -8175046, -22461297, -15461753, 18956562, -83919744, 54086752, -11775010, 54086752, 55403036, -47854261, 54152342, -51482825, 78645590, -47854261 };
    int X = 97707963;
    assertEquals(166152417, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case45() {
    int[] coordinates = { -59363342, -84234601, 5400087, -59363342, 84096149, 31586326, 14349484, 46721008, 14349484, 14349484, 61985513, 61985513, -96144570, 31586326, 14349484, 22841930, 34945042, -96144570, -59363342, 77255352, 10314484, 61985513, 39577050, -71914230, -42797694, 95552013, 31586326, 37002162, -34964956, -87424443, -58440713, 46721008, -58440713, -58440713, -8279164, -87424443, -34964956, 54469281, 14349484, -58440713, 95552013, -87424443, -42681452, -30054361, 77255352, 32873425, -24104173, -58440713, 31586326, 39577050 };
    int X = 87671240;
    assertEquals(159517471, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case46() {
    int[] coordinates = { -18309911, -34962368, 76960794, -91771239, 51250038, -76376798, -74864491, -76376798, 63021560, -18309911, -58571114, -34962368, -27175593, -34962368, 80665668, -74864491, -4629736, -91771239, -24998388, 57381117, 83848765, 57381117, -54122968, 76960794, -24998388, 93055896, -76376798, 51250038, -24998388, 51250038, -30225080, -74864491, -30225080, -74864491, -27175593, -62112448, 51250038, 64712243, -62112448, 83848765, 57381117, -74864491, 83848765, 93055896, 83848765, -76376798, -34962368, 64712243, -27175593, 93055896 };
    int X = 10750687;
    assertEquals(163325761, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case47() {
    int[] coordinates = { -100000000, 100000000, 100000000, -100000000, 100000000, -100000000, 100000000, -100000000, -100000000, -100000000, -100000000, -100000000, -100000000, -100000000, 100000000, -100000000 };
    int X = 100000000;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case48() {
    int[] coordinates = { -100000000, 100000000, 100000000, -100000000, -100000000, 100000000, 100000000, -100000000, 100000000, -100000000, 100000000, 100000000, -100000000, -100000000, 100000000, 100000000, -100000000, -100000000, -100000000, 100000000, -100000000, -100000000 };
    int X = 100000000;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case49() {
    int[] coordinates = { 100000000, 100000000, -100000000, -100000000, -100000000, -100000000, -100000000, 100000000, -100000000, 100000000, -100000000, 100000000, 100000000, 100000000, -100000000, 100000000, 100000000, 100000000, -100000000, -100000000, -100000000, -100000000, -100000000, -100000000, 100000000, 100000000, 100000000, 100000000, -100000000, -100000000, 100000000, -100000000, -100000000, -100000000, 100000000, -100000000, -100000000, 100000000, -100000000, 100000000, 100000000, -100000000, -100000000, 100000000, -100000000, 100000000, 100000000, 100000000, -100000000, -100000000 };
    int X = 100000000;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case50() {
    int[] coordinates = { 10, 20, 30 };
    int X = 1;
    assertEquals(18, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case51() {
    int[] coordinates = { 10, 20, 30 };
    int X = 10;
    assertEquals(10, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case52() {
    int[] coordinates = { -48, 97, -68, -48, -82, -69, 77, 4, -43, -11 };
    int X = 92;
    assertEquals(111, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case53() {
    int[] coordinates = { 3, 7, 4, 6, -10, 7, 10, 9, -5 };
    int X = 7;
    assertEquals(7, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case54() {
    int[] coordinates = { -3, 0, 1 };
    int X = 10;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case55() {
    int[] coordinates = { 1, 2 };
    int X = 10;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case56() {
    int[] coordinates = { -4, -1, 0 };
    int X = 5;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case57() {
    int[] coordinates = { 7 };
    int X = 0;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case58() {
    int[] coordinates = { 43, 33, 83, 39, 52, 49, 1, 13, 16, 23, 53, 33, 47, 62, 5, 21, 71, 26, 21, 34, 62, 84, 66, 93, 77, 22, 29, 35, 62, 42, 68, 66, 52, 45, 26, 80, 37, 16, 50, 96, 87, 37, 56, 38, 10, 38, 72, 70, 74, 96 };
    int X = 10;
    assertEquals(75, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case59() {
    int[] coordinates = { 3, 5 };
    int X = 1;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case60() {
    int[] coordinates = { 1, 1 };
    int X = 7;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case61() {
    int[] coordinates = { -1, 1 };
    int X = 100;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case62() {
    int[] coordinates = { 1, 10 };
    int X = 5;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case63() {
    int[] coordinates = { -3, 0, 1 };
    int X = 0;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case64() {
    int[] coordinates = { 3, 5, 5 };
    int X = 1;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case65() {
    int[] coordinates = { 1312, 13123, 13123, 0, -1023 };
    int X = 131111;
    assertEquals(14146, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case66() {
    int[] coordinates = { -5, 5 };
    int X = 100;
    assertEquals(10, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case67() {
    int[] coordinates = { 0, 3, 4 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case68() {
    int[] coordinates = { 0, 1, 2, 3, 4, 7 };
    int X = 6;
    assertEquals(7, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case69() {
    int[] coordinates = { -81898158, -80191210, -48946065, -46279837, -45776357, -31905963, -14351200, -10645783, 21439939, 55815596 };
    int X = 36611363;
    assertEquals(69517309, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case70() {
    int[] coordinates = { -1, 0 };
    int X = 5;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case71() {
    int[] coordinates = { 5, 10, 15 };
    int X = 8;
    assertEquals(10, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case72() {
    int[] coordinates = { 5, 15 };
    int X = 3;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case73() {
    int[] coordinates = { 2, 1, 4 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case74() {
    int[] coordinates = { -1, 1 };
    int X = 10;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case75() {
    int[] coordinates = { 0, 0, 10 };
    int X = 100;
    assertEquals(10, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case76() {
    int[] coordinates = { 1, 100, 1000 };
    int X = 10;
    assertEquals(979, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case77() {
    int[] coordinates = { 100000000 };
    int X = 1;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case78() {
    int[] coordinates = { 1, 3, 5 };
    int X = 1;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case79() {
    int[] coordinates = { 0, 2 };
    int X = 100;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case80() {
    int[] coordinates = { 128736, 954942, -900741, -777781, 621987, 688801, -850799, -190641, -483552, 420788, 325992, -782032, 689911, -911661, 665895, -293261, -297530, 32229, -500260, -230856, -783674, -862021, -86615, -27592, 291830, 393957, 612646, 559083, -313820, -253946, -905054, -675853, -692664, 773658, -648015, -370649, -992428, 475081, 995936, -633967, -752232, 517388, -317746, -195629, -894101, 663732, 366469, -836117, -671930, 866787 };
    int X = 1000000;
    assertEquals(1836906, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case81() {
    int[] coordinates = { -1000, 1000 };
    int X = 2;
    assertEquals(1996, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case82() {
    int[] coordinates = { 3, 1, 2 };
    int X = 3;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case83() {
    int[] coordinates = { -5, -3, -2, 1, 3, 5 };
    int X = 4;
    assertEquals(5, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case84() {
    int[] coordinates = { 4, 8 };
    int X = 5;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case85() {
    int[] coordinates = { 1, 3 };
    int X = 1;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case86() {
    int[] coordinates = { 3, 6 };
    int X = 1;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case87() {
    int[] coordinates = { -25, -35 };
    int X = 5;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case88() {
    int[] coordinates = { 1, 2, 3, 4 };
    int X = 1;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case89() {
    int[] coordinates = { 2, 5, 8 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case90() {
    int[] coordinates = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    int X = 1;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case91() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int X = 100;
    assertEquals(49, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case92() {
    int[] coordinates = { -5, 0, 5 };
    int X = 20;
    assertEquals(10, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case93() {
    int[] coordinates = { 0, 2 };
    int X = 10000;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case94() {
    int[] coordinates = { 5, 14, 15 };
    int X = 2;
    assertEquals(6, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case95() {
    int[] coordinates = { 1, 2, 3 };
    int X = 100000000;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case96() {
    int[] coordinates = { 0, 2, 4 };
    int X = 1000;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case97() {
    int[] coordinates = { 3, 5 };
    int X = 100;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case98() {
    int[] coordinates = { -1, 0, 1 };
    int X = 5;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case99() {
    int[] coordinates = { 2, 5, 6 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case100() {
    int[] coordinates = { 0, 2 };
    int X = 5;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case101() {
    int[] coordinates = { 1, 5 };
    int X = 10;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case102() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6 };
    int X = 4;
    assertEquals(5, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case103() {
    int[] coordinates = { 0, 3, 7 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case104() {
    int[] coordinates = { 1, 3 };
    int X = 10000000;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case105() {
    int[] coordinates = { 3, 6, 7 };
    int X = 4;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case106() {
    int[] coordinates = { -3, 0, 1 };
    int X = 100000;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case107() {
    int[] coordinates = { 1, 2, 3, 4 };
    int X = 5;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case108() {
    int[] coordinates = { -2, 1, 2, 3, 8 };
    int X = 3;
    assertEquals(5, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case109() {
    int[] coordinates = { -100, -25, 2, 81 };
    int X = 100000;
    assertEquals(181, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case110() {
    int[] coordinates = { 3434, 12323, 32323, 42424, 24242, 2424, 2323, 2323, 23232, 423453, 435345, 345345, 345345, 345345, 3453453, 34534534, 35345345, 34534345, 3453453, 345345, 3453453, 34534534, 4545545, 45454, 454545, 4554545, 4554545 };
    int X = 2343444;
    assertEquals(30656134, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case111() {
    int[] coordinates = { 1, 3, 5, 7 };
    int X = 1000000;
    assertEquals(6, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case112() {
    int[] coordinates = { 1, 2 };
    int X = 100;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case113() {
    int[] coordinates = { -5, 3 };
    int X = 50;
    assertEquals(8, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case114() {
    int[] coordinates = { -15, -2, -1 };
    int X = 7;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case115() {
    int[] coordinates = { -1, 1 };
    int X = 555;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case116() {
    int[] coordinates = { 1, 51, 52, 53, 3 };
    int X = 200;
    assertEquals(52, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case117() {
    int[] coordinates = { 10, 12 };
    int X = 1;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case118() {
    int[] coordinates = { 0, 1 };
    int X = 10;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case119() {
    int[] coordinates = { -1, -2, -5 };
    int X = 1;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case120() {
    int[] coordinates = { -1, 1 };
    int X = 1000;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case121() {
    int[] coordinates = { 100, 200 };
    int X = 1;
    assertEquals(98, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case122() {
    int[] coordinates = { 1, 10 };
    int X = 100;
    assertEquals(9, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case123() {
    int[] coordinates = { 7 };
    int X = 1000;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case124() {
    int[] coordinates = { -100, -50 };
    int X = 10;
    assertEquals(30, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case125() {
    int[] coordinates = { -8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8 };
    int X = 1;
    assertEquals(14, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case126() {
    int[] coordinates = { 0, 9, 1, 3, 6, 2, 7, 5, 4, 8, 0, 9, 1, 3, 6, 2, 7, 5, 4, 8, 0, 9, 1, 3, 6, 2, 7, 5, 4, 8, 0, 9, 1, 3, 6, 2, 7, 5, 4, 8, 0, 9, 1, 3, 6, 2, 7, 5, 4, 8 };
    int X = 22222222;
    assertEquals(9, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case127() {
    int[] coordinates = { -100000, 100000 };
    int X = 1;
    assertEquals(199998, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case128() {
    int[] coordinates = { 0, 1, 2, 3 };
    int X = 1000;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case129() {
    int[] coordinates = { -1, 1 };
    int X = 999;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case130() {
    int[] coordinates = { 0, 1, 5 };
    int X = 3;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case131() {
    int[] coordinates = { -5, -2, -1 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case132() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47 };
    int X = 5;
    assertEquals(36, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case133() {
    int[] coordinates = { 1, 1 };
    int X = 1000;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case134() {
    int[] coordinates = { -2, 0, 2 };
    int X = 100;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case135() {
    int[] coordinates = { 1, 2 };
    int X = 5;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case136() {
    int[] coordinates = { 16, 20, 24, 20 };
    int X = 4;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case137() {
    int[] coordinates = { 1, 5 };
    int X = 50;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case138() {
    int[] coordinates = { 50, 100, 100000, -10000, 303, 203, 203, 20, 30, 40, 50, 84, 8888, 100000, -19099, 939, 949, 949, 32423, 234234, 5464, 4353, 345, 345, 3453, 43534, 345345, 34534, 435345, 34534, 345345, 34534, 34534, 3534, 34534, 3453, 3453, 34534, 43534, 34534, 34534, 345, 34543, 34543, 3453, 34534, 34534, 45, 454, 34 };
    int X = 100000;
    assertEquals(254444, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case139() {
    int[] coordinates = { 4, 5 };
    int X = 7;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case140() {
    int[] coordinates = { -1137512, 74229472, 46301259, -55104373, -34184940, -98657805, -8647368, 42174760, -37650621, 3300726, -65828614, -97362165, -90241358, -62749004, -43072101, -25547235, -29310388, -10932241, -5439344, 42193277, 10959641, -74601389, -44506765, -18275125, 68723089, -12107779, -62391711, 34214763, -39186330, 24075145, 14947964, 77524110, 2454992, 18054043, -36834341, 91390281, 70349948, -7163375, -96417141, -29816491, 32827148, -5266465, 68078086, -21557401, -64465448, 28797398, -19306679, -66557235, 14187680 };
    int X = 67888688;
    assertEquals(128118461, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case141() {
    int[] coordinates = { 0, 2 };
    int X = 10;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case142() {
    int[] coordinates = { 6, 10 };
    int X = 5;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case143() {
    int[] coordinates = { 0, 1, 2, 3, 5 };
    int X = 1000;
    assertEquals(5, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case144() {
    int[] coordinates = { 0, 0, 0, 0, 0, 0, 0, 0, 5, 10 };
    int X = 9;
    assertEquals(10, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case145() {
    int[] coordinates = { 0 };
    int X = 10;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case146() {
    int[] coordinates = { 1, 3, 3 };
    int X = 3;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case147() {
    int[] coordinates = { -100000000, 100000000, 123123, 131234, 1231241, 764346, 97846, 47365, 64747, 87887, 983736 };
    int X = 100000000;
    assertEquals(99952635, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case148() {
    int[] coordinates = { 10, 20 };
    int X = 100;
    assertEquals(10, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case149() {
    int[] coordinates = { 3, 9, 1 };
    int X = 2;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case150() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int X = 5;
    assertEquals(39, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case151() {
    int[] coordinates = { -25, -35, 12, 12, 12, 12, 312, 5124, 153245, -87654, 98765, -98765, -7654, 45325, 8765, -9876, 54653, -7654, 235, -3485345, 252345, -23454, 2354, 54594, -23656, 93, -93, 254145, -5454545, -234523, 57654, 345, -786, 0, 2354078, 4499, 654, 45, -654, 54, 78, -89, -98, -34, -34, -85, -83, -23, 12, 12 };
    int X = 5;
    assertEquals(7808613, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case152() {
    int[] coordinates = { 1, 49, 50, 51, 52, 100 };
    int X = 80;
    assertEquals(99, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case153() {
    int[] coordinates = { 1, 2, 3, 4 };
    int X = 10000;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case154() {
    int[] coordinates = { 1, 2, 3, 6, 5, 6, 3, 6, 3, 6, 3, 6, 3, 3, 3, 3, 3, 3, 3505050, 6, 3, 6, 3, 6, 2, 5, 2, 5, 8, 8, 9, 6, 9, 6, 6, 9, 6, 9, 6, 9, 6, 6, 6, 6, 65555, 6, 1000000, 6, 6, 5 };
    int X = 1000000;
    assertEquals(1505049, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case155() {
    int[] coordinates = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int X = 100000000;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case156() {
    int[] coordinates = { 1, 10 };
    int X = 4;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case157() {
    int[] coordinates = { 0, 5 };
    int X = 10;
    assertEquals(5, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case158() {
    int[] coordinates = { 2 };
    int X = 3;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case159() {
    int[] coordinates = { 1 };
    int X = 3;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case160() {
    int[] coordinates = { 0, 1 };
    int X = 3;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case161() {
    int[] coordinates = { 9, -3, 2, 7 };
    int X = 10;
    assertEquals(12, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case162() {
    int[] coordinates = { 5, 8, 9 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case163() {
    int[] coordinates = { 2, 3, 5, 10 };
    int X = 5;
    assertEquals(5, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case164() {
    int[] coordinates = { 1, 1000 };
    int X = 5;
    assertEquals(989, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case165() {
    int[] coordinates = { 100000000, -100000000 };
    int X = 0;
    assertEquals(200000000, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case166() {
    int[] coordinates = { 2, 5 };
    int X = 2;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case167() {
    int[] coordinates = { 2, 2 };
    int X = 5;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case168() {
    int[] coordinates = { 8, 44, 68, 90 };
    int X = 24;
    assertEquals(36, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case169() {
    int[] coordinates = { 7, 17, 0, 13, 19, 8, 3, 1, 7, 4, 4, 0, 11, 8, 10, 20, 3, 20, 14, 15, 19, 18, 0, 1, 6, 9, 18, 8, 2, 2, 12, 0, 19, 8, 3, 10, 18, 8, 16, 18, 14, 14, 13, 6, 12, 14, 5, 20, 17, 19 };
    int X = 5;
    assertEquals(10, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case170() {
    int[] coordinates = { 100000000, 99999000, 99998000, 99997000, 99996000, 99995000, 99994000, 99993000, 99992000, 99991000, 99990000, 99989000, 99988000, 99987000, 99986000, 99985000, 99984000, 99983000, 99982000, 99981000, 99980000, 99979000, 99978000, 99977000, 99976000, 99975000, 99974000, 99973000, 99972000, 99971000, 99970000, 99969000, 99968000, 99967000, 99966000, 99965000, 99964000, 99963000, 99962000, 99961000, 99960000, 99959000, 99958000, 99957000, 99956000, 99955000, 99954000, 99953000, 99952000, 99951000 };
    int X = 1234567;
    assertEquals(49000, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case171() {
    int[] coordinates = { 6, 6 };
    int X = 100;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case172() {
    int[] coordinates = { 0, 5 };
    int X = 1;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case173() {
    int[] coordinates = { 0, 0, 0 };
    int X = 5;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case174() {
    int[] coordinates = { 97, 46, 1, 6, 79, 52, 86, 66, 24, 67, 52, 16, 5, 12, 58, 30, 11, 84, 96, 13, 51, 24, 74, 48, 14, 53, 69, 80, 83, 6, 61, 10, 66, 11, 4, 96, 79, 98, 54, 88, 62, 4, 16, 9, 38, 49, 70, 11, 28, 66 };
    int X = 100;
    assertEquals(97, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case175() {
    int[] coordinates = { -5, -1 };
    int X = 2;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case176() {
    int[] coordinates = { 0, 0, 0, 0, 0, 2 };
    int X = 5;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case177() {
    int[] coordinates = { 1, 2, 3, 4, 6 };
    int X = 10;
    assertEquals(5, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case178() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int X = 100;
    assertEquals(9, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case179() {
    int[] coordinates = { 1000, 1001, 1002 };
    int X = 100000;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case180() {
    int[] coordinates = { 0, 3, 9 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case181() {
    int[] coordinates = { -20, 5, 123, 11, -11, -12, -12, -141432, 343242, 123123, 6432, -13215, 24512412, -32413123, -43521, -121315, 6373634 };
    int X = 31;
    assertEquals(56925473, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case182() {
    int[] coordinates = { -3, 0, 1 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case183() {
    int[] coordinates = { -4, 0 };
    int X = 5;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case184() {
    int[] coordinates = { 1, 1000 };
    int X = 2;
    assertEquals(995, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case185() {
    int[] coordinates = { 1, 5, 6, 10 };
    int X = 6;
    assertEquals(8, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case186() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, -1, -8 };
    int X = 23;
    assertEquals(16, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case187() {
    int[] coordinates = { 1, 3 };
    int X = 10;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case188() {
    int[] coordinates = { 698241, 18364708, 11064485 };
    int X = 31614069;
    assertEquals(17666467, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case189() {
    int[] coordinates = { 7, 8 };
    int X = 8;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case190() {
    int[] coordinates = { 2, 3 };
    int X = 100;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case191() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
    int X = 37;
    assertEquals(39, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case192() {
    int[] coordinates = { 1, 2 };
    int X = 1000;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case193() {
    int[] coordinates = { 0, 10, 3, 5 };
    int X = 6;
    assertEquals(7, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case194() {
    int[] coordinates = { 0, 3, 6, 7 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case195() {
    int[] coordinates = { -1, 0, 0, 0 };
    int X = 3;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case196() {
    int[] coordinates = { 0, 7, 3 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case197() {
    int[] coordinates = { 4, 100, 101, 102, 103 };
    int X = 20;
    assertEquals(59, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case198() {
    int[] coordinates = { 0, 3, 9 };
    int X = 7;
    assertEquals(8, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case199() {
    int[] coordinates = { -1, 3, 5, 7 };
    int X = 500;
    assertEquals(8, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case200() {
    int[] coordinates = { 1, 3 };
    int X = 100;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case201() {
    int[] coordinates = { 3, 5 };
    int X = 8;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case202() {
    int[] coordinates = { 1, 10, 11, 11 };
    int X = 20;
    assertEquals(10, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case203() {
    int[] coordinates = { 3, 4, 5 };
    int X = 2;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case204() {
    int[] coordinates = { 0, 2 };
    int X = 1000000;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case205() {
    int[] coordinates = { -200, -100 };
    int X = 5;
    assertEquals(90, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case206() {
    int[] coordinates = { 0, 2 };
    int X = 1000;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case207() {
    int[] coordinates = { 4, 3, 2, 1, 5, 6, 7, 8 };
    int X = 2;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case208() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int X = 10000000;
    assertEquals(9, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case209() {
    int[] coordinates = { 0, 1 };
    int X = 100;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case210() {
    int[] coordinates = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int X = 0;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case211() {
    int[] coordinates = { 0, 10 };
    int X = 2;
    assertEquals(6, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case212() {
    int[] coordinates = { 1000, 1100 };
    int X = 10;
    assertEquals(80, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case213() {
    int[] coordinates = { 0, 100, 49, 51 };
    int X = 52;
    assertEquals(55, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case214() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int X = 10;
    assertEquals(29, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case215() {
    int[] coordinates = { 0, 10, 5, 8 };
    int X = 6;
    assertEquals(7, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case216() {
    int[] coordinates = { 1, 3, 5, 6 };
    int X = 3;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case217() {
    int[] coordinates = { -1000, 1000 };
    int X = 1;
    assertEquals(1998, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case218() {
    int[] coordinates = { 1, 5, 6, 9 };
    int X = 3;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case219() {
    int[] coordinates = { 0, 1, 2, 3, 6 };
    int X = 5;
    assertEquals(6, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case220() {
    int[] coordinates = { 1, 1 };
    int X = 5;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case221() {
    int[] coordinates = { 2, 21 };
    int X = 5;
    assertEquals(9, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case222() {
    int[] coordinates = { 0, 3, 11, 14 };
    int X = 10;
    assertEquals(12, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case223() {
    int[] coordinates = { 0, 2 };
    int X = 3;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case224() {
    int[] coordinates = { 1, 2, 3, 4 };
    int X = 6;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case225() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24 };
    int X = 13;
    assertEquals(25, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case226() {
    int[] coordinates = { -4, 3, 0, 1, 2 };
    int X = 3;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case227() {
    int[] coordinates = { 0, 2, 3, 4 };
    int X = 2;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case228() {
    int[] coordinates = { 1, 3, 7 };
    int X = 4;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case229() {
    int[] coordinates = { 1, 2 };
    int X = 10000000;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case230() {
    int[] coordinates = { 5, 4, 7, 9 };
    int X = 1;
    assertEquals(3, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case231() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int X = 50;
    assertEquals(9, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case232() {
    int[] coordinates = { 0, 99, 101 };
    int X = 100;
    assertEquals(101, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case233() {
    int[] coordinates = { -3, 0, 1, 4, -4, 5, -9, -7, 3, 3 };
    int X = 5;
    assertEquals(7, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case234() {
    int[] coordinates = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int X = 50;
    assertEquals(49, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case235() {
    int[] coordinates = { 1 };
    int X = 100;
    assertEquals(0, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case236() {
    int[] coordinates = { 0, 4, 7 };
    int X = 5;
    assertEquals(6, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case237() {
    int[] coordinates = { 2, 10 };
    int X = 2;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case238() {
    int[] coordinates = { -100000000, 100000000 };
    int X = 1;
    assertEquals(199999998, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case239() {
    int[] coordinates = { -100000000, 0 };
    int X = 1;
    assertEquals(99999998, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case240() {
    int[] coordinates = { 1000, 1001 };
    int X = 100;
    assertEquals(1, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case241() {
    int[] coordinates = { 3, 4, 5 };
    int X = 1000;
    assertEquals(2, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case242() {
    int[] coordinates = { 12312, 123, 123, 124, 234, 235, 123, 1234, 235, 123, 124, 435, 235, 23, 5, 123, 12, 412, 42, 35, 234, 234, 123, 123, 123, 134, 124, 14, 12, 324, 234, 23, 523, 42, 35, 2345, 234, 234, 235, 234, 123, 12, 4, 124, 234, 234, 234, 234, 234, 23 };
    int X = 13;
    assertEquals(12282, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case243() {
    int[] coordinates = { 1, 5, 10 };
    int X = 1;
    assertEquals(7, tarofriends.getNumber(coordinates, X));
  }

  @Test
  public void case244() {
    int[] coordinates = { -2, 0, 2 };
    int X = 0;
    assertEquals(4, tarofriends.getNumber(coordinates, X));
  }

}
