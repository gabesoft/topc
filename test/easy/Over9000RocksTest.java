package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class Over9000RocksTest {
  Over9000Rocks over9000rocks = new Over9000Rocks();

  @Test
  public void case1() {
    int[] lowerBound = { 9000 };
    int[] upperBound = { 9001 };
    assertEquals(1, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case2() {
    int[] lowerBound = { 9000, 1, 10 };
    int[] upperBound = { 9000, 2, 20 };
    assertEquals(15, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case3() {
    int[] lowerBound = { 1001, 2001, 3001, 3001 };
    int[] upperBound = { 1003, 2003, 3003, 3003 };
    assertEquals(9, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case4() {
    int[] lowerBound = { 9000, 90000, 1, 10 };
    int[] upperBound = { 9000, 90000, 3, 15 };
    assertEquals(38, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case5() {
    int[] lowerBound = { 1, 1, 1, 1, 1, 1 };
    int[] upperBound = { 3, 4, 5, 6, 7, 8 };
    assertEquals(0, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case6() {
    int[] lowerBound = { 9001, 9002, 9003 };
    int[] upperBound = { 9001, 9002, 9003 };
    assertEquals(7, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case7() {
    int[] lowerBound = { 9001 };
    int[] upperBound = { 9001 };
    assertEquals(1, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case8() {
    int[] lowerBound = { 9000, 3, 11, 50, 100, 900007, 90007, 102, 7, 11, 307, 9007, 1, 997, 56 };
    int[] upperBound = { 9000, 5, 13, 54, 100, 1000000, 100007, 104, 9, 11, 309, 9013, 1000000, 1009, 57 };
    assertEquals(2110691, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case9() {
    int[] lowerBound = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case10() {
    int[] lowerBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(15, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case11() {
    int[] lowerBound = { 177258, 439976, 996972, 281567, 782547, 998375, 491481, 707710, 146177, 889410 };
    int[] upperBound = { 293261, 559909, 997946, 410135, 784021, 998581, 925665, 743314, 626775, 943659 };
    assertEquals(7137090, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case12() {
    int[] lowerBound = { 315272, 887545, 64836, 497408, 974365, 395811, 835917, 822205, 763313, 796755, 541406, 250512, 772146 };
    int[] upperBound = { 661956, 905285, 360731, 694427, 999269, 834462, 889010, 984734, 976200, 992732, 952893, 904500, 853930 };
    assertEquals(10945294, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case13() {
    int[] lowerBound = { 712946 };
    int[] upperBound = { 871563 };
    assertEquals(158618, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case14() {
    int[] lowerBound = { 177389, 865455, 133264, 739109, 390897, 157563, 399400, 426007, 864298, 612059, 287649 };
    int[] upperBound = { 373901, 975109, 898401, 993324, 565760, 949001, 700614, 750652, 959908, 874621, 820179 };
    assertEquals(8728207, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case15() {
    int[] lowerBound = { 16859, 287723 };
    int[] upperBound = { 287608, 630151 };
    assertEquals(900787, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case16() {
    int[] lowerBound = { 77505, 104830, 58303, 574406, 229438 };
    int[] upperBound = { 658755, 961848, 273053, 966870, 779624 };
    assertEquals(3581848, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case17() {
    int[] lowerBound = { 647998, 431340, 617093, 930533, 861479, 198561 };
    int[] upperBound = { 830560, 870972, 893128, 997538, 943907, 264651 };
    assertEquals(4435508, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case18() {
    int[] lowerBound = { 729521, 788949, 148221, 3423, 231974, 569820, 332636 };
    int[] upperBound = { 951408, 974213, 708093, 720084, 459786, 620622, 497059 };
    assertEquals(4922265, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case19() {
    int[] lowerBound = { 650057, 270366, 180570, 698312, 338872, 62431, 15948, 547413, 828153, 205852, 755374, 289622 };
    int[] upperBound = { 963292, 607214, 849697, 707788, 505320, 833352, 906522, 861732, 832867, 882648, 836582, 514521 };
    assertEquals(9285588, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case20() {
    int[] lowerBound = { 7814, 60843, 695305, 390426, 879303, 209688, 58403, 407967, 120378, 886777 };
    int[] upperBound = { 577125, 986686, 971243, 392645, 896113, 953189, 828267, 946013, 314552, 929027 };
    assertEquals(7785860, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case21() {
    int[] lowerBound = { 80969, 466757, 904767, 106216, 562016, 870595, 886461, 425044, 224701, 417318 };
    int[] upperBound = { 162285, 598837, 928929, 442628, 617607, 928392, 891079, 587088, 467202, 759924 };
    assertEquals(6303003, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case22() {
    int[] lowerBound = { 633261, 151066, 677628, 28480, 666116, 190295, 443690, 304836, 47375, 729836, 264290, 549776 };
    int[] upperBound = { 674277, 707113, 790488, 489728, 799813, 473682, 970799, 765743, 560994, 965435, 957783, 590809 };
    assertEquals(8718185, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case23() {
    int[] lowerBound = { 82160, 853398, 875890, 77842, 932128, 336944, 194062, 149117, 933699 };
    int[] upperBound = { 580520, 989107, 966779, 242532, 940316, 876494, 953510, 677091, 991468 };
    assertEquals(7139976, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case24() {
    int[] lowerBound = { 409251, 99538, 871775, 363786, 43957 };
    int[] upperBound = { 983987, 338409, 938943, 892886, 576468 };
    assertEquals(3686737, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case25() {
    int[] lowerBound = { 784275, 330854, 628295, 405112, 317668, 784207, 74353, 102753 };
    int[] upperBound = { 863846, 339275, 979607, 645592, 739902, 805014, 95161, 211513 };
    assertEquals(4586974, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case26() {
    int[] lowerBound = { 274874, 221460, 292130, 246617, 186677, 353497, 485281 };
    int[] upperBound = { 583911, 672584, 730676, 380829, 855188, 746775, 507997 };
    assertEquals(4291284, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case27() {
    int[] lowerBound = { 425785, 201968, 869280, 653990, 495155, 491951, 711748, 246375, 818210, 738463, 679178, 229828 };
    int[] upperBound = { 629164, 617611, 907753, 705915, 899563, 649561, 956880, 273803, 973764, 965920, 681190, 589929 };
    assertEquals(8649086, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case28() {
    int[] lowerBound = { 976450, 95080, 795474, 771972, 285458, 819403 };
    int[] upperBound = { 997914, 307461, 904666, 890524, 292447, 858785 };
    assertEquals(3911579, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case29() {
    int[] lowerBound = { 467261, 313018, 599921, 681293 };
    int[] upperBound = { 542669, 408021, 642233, 855205 };
    assertEquals(1958177, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case30() {
    int[] lowerBound = { 926794, 111826 };
    int[] upperBound = { 965194, 529658 };
    assertEquals(912467, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case31() {
    int[] lowerBound = { 737698, 711627 };
    int[] upperBound = { 932146, 972130 };
    assertEquals(715456, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case32() {
    int[] lowerBound = { 83236, 489004 };
    int[] upperBound = { 412666, 891679 };
    assertEquals(1144773, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case33() {
    int[] lowerBound = { 483961, 404107, 39322, 489707, 50082, 946144, 750029, 935461, 921277, 46459, 904585, 665132 };
    int[] upperBound = { 783504, 490638, 239283, 931380, 514006, 957780, 812575, 986086, 935428, 120468, 911693, 903225 };
    assertEquals(8546745, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case34() {
    int[] lowerBound = { 94983, 298655, 833138, 236480, 237270, 143125, 68677, 934715, 321856, 546225, 915637, 465282, 66162 };
    int[] upperBound = { 132302, 895307, 912018, 400106, 901768, 624079, 287815, 953342, 378623, 864415, 952164, 806394, 348192 };
    assertEquals(8390364, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case35() {
    int[] lowerBound = { 974969, 805241, 739803, 866190, 638362 };
    int[] upperBound = { 992129, 995480, 953933, 888003, 865695 };
    assertEquals(3175327, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case36() {
    int[] lowerBound = { 230278, 209436, 439387 };
    int[] upperBound = { 631123, 796195, 583394 };
    assertEquals(1801277, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case37() {
    int[] lowerBound = { 660899, 97798, 199286, 669088 };
    int[] upperBound = { 672354, 310972, 511562, 903894 };
    assertEquals(2300985, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case38() {
    int[] lowerBound = { 789006, 400519, 904491, 931026, 622039 };
    int[] upperBound = { 822647, 743268, 927521, 959138, 949966 };
    assertEquals(3938603, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case39() {
    int[] lowerBound = { 704001, 75987 };
    int[] upperBound = { 706999, 182667 };
    assertEquals(219359, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case40() {
    int[] lowerBound = { 379148, 378238 };
    int[] upperBound = { 608520, 602356 };
    assertEquals(683774, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case41() {
    int[] lowerBound = { 772791, 627669, 413070 };
    int[] upperBound = { 772798, 627669, 413080 };
    assertEquals(75, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case42() {
    int[] lowerBound = { 508657, 660261, 959192, 321186, 533351, 372883, 768502, 188585, 447067, 424727, 399176 };
    int[] upperBound = { 508659, 660264, 959193, 321196, 533361, 372888, 768510, 188586, 447069, 424736, 399178 };
    assertEquals(55783, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case43() {
    int[] lowerBound = { 25545, 164282, 230067 };
    int[] upperBound = { 25555, 164283, 230069 };
    assertEquals(59, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case44() {
    int[] lowerBound = { 427728, 715349, 550924, 176187 };
    int[] upperBound = { 427728, 715358, 550925, 176192 };
    assertEquals(135, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case45() {
    int[] lowerBound = { 268748, 131052, 669187, 620952 };
    int[] upperBound = { 268756, 131061, 669190, 620960 };
    assertEquals(239, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case46() {
    int[] lowerBound = { 31443 };
    int[] upperBound = { 31445 };
    assertEquals(3, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case47() {
    int[] lowerBound = { 404765, 884161, 186908, 888425, 914964, 238311, 494838, 228860, 633161, 528474, 270319, 305496, 421562, 214922 };
    int[] upperBound = { 404773, 884169, 186912, 888434, 914970, 238312, 494846, 228860, 633163, 528481, 270320, 305505, 421565, 214929 };
    assertEquals(573477, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case48() {
    int[] lowerBound = { 747339, 274438, 848042, 44720, 394591, 354897, 496062, 107528, 769842, 101271, 938414, 645403, 264660 };
    int[] upperBound = { 747339, 274442, 848046, 44720, 394592, 354902, 496065, 107537, 769844, 101281, 938415, 645409, 264668 };
    assertEquals(212711, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case49() {
    int[] lowerBound = { 388348, 602772, 593196, 488573, 318390 };
    int[] upperBound = { 388351, 602776, 593200, 488577, 318396 };
    assertEquals(367, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case50() {
    int[] lowerBound = { 918531, 249906, 48102, 344093, 658377, 535257 };
    int[] upperBound = { 918533, 249911, 48103, 344095, 658386, 535261 };
    assertEquals(799, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case51() {
    int[] lowerBound = { 417442, 583965, 620401, 796053, 963096, 345467, 261271, 752631, 849165, 198969, 558585, 930284, 916362, 902104, 370229 };
    int[] upperBound = { 417446, 583966, 620402, 796063, 963096, 345471, 261274, 752634, 849167, 198972, 558589, 930288, 916369, 902107, 370239 };
    assertEquals(870962, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case52() {
    int[] lowerBound = { 341350, 309044, 676894, 94612, 118726, 117772, 2479, 493144, 445031, 680505, 211883, 350980 };
    int[] upperBound = { 341358, 309048, 676895, 94614, 118728, 117777, 2489, 493153, 445039, 680514, 211891, 350982 };
    assertEquals(141986, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case53() {
    int[] lowerBound = { 806210, 870589, 111298, 726329, 947364, 77661, 988113, 648605, 494064 };
    int[] upperBound = { 806217, 870596, 111305, 726339, 947374, 77665, 988122, 648613, 494066 };
    assertEquals(16895, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case54() {
    int[] lowerBound = { 335704, 53128, 963116, 590539, 205027, 878578, 5086, 630550, 422438, 6316 };
    int[] upperBound = { 335711, 53138, 963119, 590547, 205035, 878584, 5095, 630559, 422439, 6321 };
    assertEquals(34799, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case55() {
    int[] lowerBound = { 216017, 506975, 101724 };
    int[] upperBound = { 216019, 506980, 101728 };
    assertEquals(51, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case56() {
    int[] lowerBound = { 328033, 534976, 979340, 960007, 93448, 665819, 691076, 952522, 790719, 186616, 920446, 746017, 158026, 533315 };
    int[] upperBound = { 328113, 535018, 979417, 960049, 93500, 665898, 691088, 952595, 790762, 186678, 920544, 746058, 158047, 533401 };
    assertEquals(3770844, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case57() {
    int[] lowerBound = { 629096, 972742, 306995, 121574, 421451, 503168, 958158, 542102, 673008, 92046, 315040, 626250, 988856 };
    int[] upperBound = { 629132, 972760, 307051, 121601, 421533, 503240, 958207, 542169, 673030, 92075, 315138, 626291, 988944 };
    assertEquals(2075200, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case58() {
    int[] lowerBound = { 107194, 81106, 735120, 604912, 125702, 966051, 735850, 850155, 237366, 190388, 477449, 277165, 222903, 384202 };
    int[] upperBound = { 107245, 81189, 735206, 604982, 125730, 966065, 735870, 850166, 237438, 190459, 477537, 277190, 222915, 384249 };
    assertEquals(2748209, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case59() {
    int[] lowerBound = { 750007, 790786, 74424, 216462, 754449, 255224, 920106, 901841, 390459, 486313, 496152, 917692, 492513, 970754, 925193 };
    int[] upperBound = { 750082, 790877, 74470, 216555, 754472, 255305, 920152, 901940, 390548, 486357, 496204, 917729, 492584, 970804, 925240 };
    assertEquals(5227218, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case60() {
    int[] lowerBound = { 784819, 665863, 509769, 377749, 708171, 595337, 108611, 661431, 88909, 117450, 497745, 904717, 218610, 668930 };
    int[] upperBound = { 784849, 665928, 509821, 377826, 708220, 595415, 108630, 661444, 88940, 117534, 497833, 904730, 218691, 668950 };
    assertEquals(3029784, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case61() {
    int[] lowerBound = { 201987, 89468, 221660, 707736, 865128, 27204, 454373, 141368, 175264, 241700, 887798, 501005, 744634, 728267, 231239 };
    int[] upperBound = { 202060, 89500, 221739, 707761, 865189, 27292, 454461, 141393, 175294, 241751, 887808, 501042, 744718, 728277, 231281 };
    assertEquals(3865414, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case62() {
    int[] lowerBound = { 769490, 612904, 609247, 103825, 891314, 900240, 436228, 240810, 353121, 497063, 735053, 789000, 692330 };
    int[] upperBound = { 769524, 612986, 609299, 103874, 891408, 900317, 436239, 240846, 353155, 497119, 735145, 789032, 692355 };
    assertEquals(1872511, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case63() {
    int[] lowerBound = { 931027, 168521, 89715, 3878, 961708, 542837, 147691, 13631, 932041, 1496, 46369, 747033, 512340, 409559, 906490 };
    int[] upperBound = { 931083, 168599, 89805, 3965, 961758, 542915, 147755, 13682, 932137, 1582, 46441, 747124, 512399, 409631, 906585 };
    assertEquals(4750129, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case64() {
    int[] lowerBound = { 424868, 429296, 310382, 804682, 714618, 19875, 986172, 314287, 662473, 154680, 443408, 931086, 582493, 86918, 232398 };
    int[] upperBound = { 424926, 429331, 310429, 804713, 714695, 19955, 986186, 314326, 662569, 154768, 443458, 931114, 582514, 86938, 232421 };
    assertEquals(4171242, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case65() {
    int[] lowerBound = { 480547, 799834, 966873, 817221, 819882, 422752, 30367, 444246, 440690, 90628, 882833, 171915, 405481 };
    int[] upperBound = { 480610, 799898, 966887, 817319, 819968, 422846, 30394, 444323, 440771, 90655, 882867, 171951, 405570 };
    assertEquals(2294581, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case66() {
    int[] lowerBound = { 179155, 499161, 762544, 805764, 978254, 506623, 194452, 369561, 678260, 615220, 745440, 206496, 921692, 721468, 533158 };
    int[] upperBound = { 179321, 499310, 763214, 806171, 979173, 507551, 194953, 370539, 678566, 615710, 746101, 207206, 921858, 721573, 533486 };
    assertEquals(6737147, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case67() {
    int[] lowerBound = { 783623, 997157, 916082, 400237, 823559, 284217, 398651, 675823, 514964, 502726, 929379, 621560, 923712, 23517, 193249 };
    int[] upperBound = { 784582, 997435, 916647, 400381, 823992, 284511, 399223, 676219, 515442, 503289, 930348, 622190, 924276, 23624, 193615 };
    assertEquals(6891835, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case68() {
    int[] lowerBound = { 343117, 407953, 959207, 198844, 171581, 66611, 42199, 917613, 559836, 244540, 692942, 112221, 13442, 66544 };
    int[] upperBound = { 343297, 408240, 959853, 199606, 172535, 67002, 43056, 918132, 560226, 245194, 693521, 112676, 13729, 67370 };
    assertEquals(4369791, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case69() {
    int[] lowerBound = { 640356, 496592, 685025, 63590, 596841, 909812, 451671, 227604, 642752, 203960, 924815, 786768, 416312, 778863 };
    int[] upperBound = { 640646, 497500, 685446, 64324, 597457, 909972, 452590, 227900, 643663, 204230, 925147, 787650, 416829, 779405 };
    assertEquals(5733242, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case70() {
    int[] lowerBound = { 267328, 609467, 164970, 73962, 714741, 250338, 519122, 392805, 456605, 524380, 770443, 761558, 83892, 954807 };
    int[] upperBound = { 267543, 609772, 165940, 74091, 715670, 250886, 519233, 393052, 457082, 524674, 771077, 762488, 84637, 955507 };
    assertEquals(5163651, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case71() {
    int[] lowerBound = { 227669, 493216, 459411, 720235, 782007, 373684, 632256, 961409, 285364, 162022, 521907, 648492, 812599, 250586, 760939 };
    int[] upperBound = { 228373, 493729, 459781, 721046, 782727, 373897, 633058, 961825, 285509, 162274, 522238, 649060, 813573, 251147, 761321 };
    assertEquals(6337844, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case72() {
    int[] lowerBound = { 555799, 663109, 796694, 91621, 438209, 965729, 104113, 618851, 217010, 723355, 661471, 68576, 546056, 851502 };
    int[] upperBound = { 556336, 663591, 797572, 92582, 438951, 966422, 104418, 619072, 217645, 724173, 662378, 68820, 546608, 851929 };
    assertEquals(5744993, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case73() {
    int[] lowerBound = { 485387, 14041, 213524, 974412, 447224, 854563, 197466, 47590, 589957, 550077, 428419, 349404, 424378, 209020 };
    int[] upperBound = { 485648, 14537, 213908, 975000, 448093, 855235, 198112, 47810, 590707, 550902, 429005, 350383, 425317, 209725 };
    assertEquals(4779948, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case74() {
    int[] lowerBound = { 950878, 682337, 423320, 370242, 374986, 584714, 360686, 829069, 26174, 594787, 915882, 366681, 141636, 226549 };
    int[] upperBound = { 951326, 682480, 423653, 370404, 375233, 585699, 361428, 830027, 26870, 595483, 916811, 367308, 141924, 226716 };
    assertEquals(5279424, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case75() {
    int[] lowerBound = { 783833, 108829, 607906, 741108, 416803, 690782, 520143, 377060, 991664, 87830, 127999, 331355, 290128, 677158, 650237 };
    int[] upperBound = { 784456, 109014, 608632, 741318, 417785, 690895, 521118, 377806, 992420, 88427, 128176, 332007, 290298, 677871, 650576 };
    assertEquals(5962317, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case76() {
    int[] lowerBound = { 17422, 29202, 869368, 938444, 977076, 418229, 664521, 130243, 2787, 32501, 454656, 824176, 839522 };
    int[] upperBound = { 767176, 707900, 932463, 953888, 988458, 650543, 711959, 621343, 762857, 824514, 593492, 997584, 883706 };
    assertEquals(10386883, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case77() {
    int[] lowerBound = { 444561, 610971, 777845, 657713, 340863, 21870, 142267, 965948, 808909, 908493, 125533, 842096, 172979, 354612 };
    int[] upperBound = { 905491, 707168, 832600, 823539, 699188, 831481, 508572, 998744, 933759, 931567, 733133, 964699, 202017, 890427 };
    assertEquals(10940516, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case78() {
    int[] lowerBound = { 853707, 869383, 496552, 752551, 306931, 819053, 402968, 239874, 783257, 217419, 560262, 890596, 719666 };
    int[] upperBound = { 932399, 883787, 999024, 994264, 723086, 900250, 896250, 956311, 856296, 672766, 843452, 918643, 945296 };
    assertEquals(11304406, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case79() {
    int[] lowerBound = { 233469, 536227, 862195, 446673, 60772, 795171, 589289, 27831, 775819, 259558, 196931, 946562, 592829 };
    int[] upperBound = { 282061, 927005, 987936, 816197, 629271, 932391, 981509, 462044, 992665, 982909, 503236, 971139, 854840 };
    assertEquals(10295373, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case80() {
    int[] lowerBound = { 822059, 198353, 562576, 123314, 787664, 758718, 224042, 390821, 111373, 904750, 912907, 502586, 72090, 572312, 711249 };
    int[] upperBound = { 941980, 839561, 827082, 590563, 938497, 964706, 272662, 667575, 752787, 998760, 978156, 704565, 291270, 937412, 826905 };
    assertEquals(11460392, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case81() {
    int[] lowerBound = { 877065, 927423, 92023, 918732, 295910, 212325, 76621, 333871, 85651, 315239, 375235, 169249, 758977, 177780 };
    int[] upperBound = { 998659, 989799, 446518, 997296, 415419, 662550, 736078, 466576, 512546, 906836, 846075, 664160, 776125, 244282 };
    assertEquals(9586299, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case82() {
    int[] lowerBound = { 153777, 629792, 870364, 963356, 393480, 926417, 123336, 102332, 372103, 475383, 23309, 933334, 284249, 675446 };
    int[] upperBound = { 292647, 672419, 922726, 975874, 465837, 975055, 715788, 438615, 826998, 819290, 887746, 991758, 354629, 779638 };
    assertEquals(10095712, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case83() {
    int[] lowerBound = { 515995, 518377, 35315, 472611, 187648, 610846, 196258, 744577, 99018, 427298, 843432, 190704, 831209 };
    int[] upperBound = { 859515, 717231, 324465, 698217, 460207, 685435, 985142, 851098, 655086, 619476, 987107, 815325, 917284 };
    assertEquals(9540274, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case84() {
    int[] lowerBound = { 644764, 614460, 718449, 545135, 695991, 901889, 548404, 890164, 218201, 620163, 542056, 736496, 651017, 983008, 817021 };
    int[] upperBound = { 958996, 777539, 764408, 832415, 983391, 999365, 931834, 916779, 897808, 902143, 622779, 935789, 927826, 997153, 914116 };
    assertEquals(13144141, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case85() {
    int[] lowerBound = { 358630, 165126, 804877, 46841, 802425, 262451, 710675, 235561, 752869, 761221, 748508, 929276, 842134, 338841, 84023 };
    int[] upperBound = { 563457, 733582, 952703, 652768, 923335, 525813, 769424, 776394, 993198, 854433, 838822, 987837, 878780, 545066, 183106 };
    assertEquals(11131878, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case86() {
    int[] lowerBound = { 9000, 1, 10 };
    int[] upperBound = { 9000, 2, 20 };
    assertEquals(15, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case87() {
    int[] lowerBound = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case88() {
    int[] lowerBound = { 1, 2 };
    int[] upperBound = { 60, 60 };
    assertEquals(0, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case89() {
    int[] lowerBound = { 195989, 839442, 500900, 27466, 572588, 531327, 843043, 657612, 842158, 109927, 314065, 286080, 140263, 834620, 600238 };
    int[] upperBound = { 195996, 839445, 500908, 27475, 572588, 531328, 843049, 657613, 842159, 109934, 314074, 286083, 140270, 834627, 600245 };
    assertEquals(1097366, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case90() {
    int[] lowerBound = { 9008, 9010 };
    int[] upperBound = { 9030, 9015 };
    assertEquals(51, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case91() {
    int[] lowerBound = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 133, 14, 15 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case92() {
    int[] lowerBound = { 9000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14865014, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case93() {
    int[] lowerBound = { 173, 2, 1, 2, 1, 37, 11, 1, 1, 56, 1, 5, 1, 7, 124 };
    int[] upperBound = { 999003, 987050, 1000000, 876666, 936111, 778222, 781333, 947439, 931678, 835000, 791000, 835147, 888789, 777456, 666123 };
    assertEquals(13022017, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case94() {
    int[] lowerBound = { 20102, 21414, 1232, 1359, 32351, 19435, 30736, 17371, 11999, 15510, 28074, 21651, 10296, 3178, 18297 };
    int[] upperBound = { 43097, 34781, 27555, 25041, 41590, 25754, 35243, 49803, 27354, 15552, 37077, 31583, 41376, 30538, 38375 };
    assertEquals(495719, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case95() {
    int[] lowerBound = { 9005, 9030, 95000, 905300, 90040, 1000000, 22000, 94200, 94200, 90040, 90001, 90001, 9000, 9000, 900034 };
    int[] upperBound = { 900900, 900000, 1000000, 1000000, 105000, 1000000, 1000000, 800000, 600000, 1000000, 1000000, 1000000, 1000000, 800000, 1000000 };
    assertEquals(13096900, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case96() {
    int[] lowerBound = { 8986, 1, 9255, 9435, 4979, 11570, 5318, 5563, 10593, 13597, 10377, 9311, 12675, 2, 7438 };
    int[] upperBound = { 723319, 9368, 545971, 387793, 938001, 839382, 525629, 518949, 202239, 437546, 306317, 400360, 604182, 973540, 730282 };
    assertEquals(8133878, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case97() {
    int[] lowerBound = { 9000, 1000000, 888888, 111111, 222222, 333333, 444444, 555555, 123434, 1, 3546, 99999, 3, 14, 19 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 900000, 1000000, 1000000, 1000000, 1000000, 1000000, 20 };
    assertEquals(13891020, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case98() {
    int[] lowerBound = { 1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000, 11000, 12000, 13000, 14000, 15000 };
    int[] upperBound = { 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000, 11000, 12000, 13000, 14000, 15000, 16000 };
    assertEquals(126000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case99() {
    int[] lowerBound = { 100, 101, 200, 301, 508, 88, 118, 182, 990, 9000, 9001, 9323, 23433, 23421, 123423 };
    int[] upperBound = { 1000000, 1000000, 1000000, 9000, 1000000, 1000000, 999999, 1000000, 923422, 900122, 912345, 998733, 928332, 234444, 1000000 };
    assertEquals(12897397, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case100() {
    int[] lowerBound = { 1, 1, 1, 1, 1, 1, 11, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 999999, 978965, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14969964, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case101() {
    int[] lowerBound = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    int[] upperBound = { 999950, 999951, 999952, 999953, 999954, 999955, 999956, 999957, 999958, 999959, 999960, 999961, 999962, 999963, 999964 };
    assertEquals(14990355, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case102() {
    int[] lowerBound = { 9001, 9001, 9001, 9001, 9001, 9001, 9001, 9001, 9001, 9001, 9001, 9001, 9001, 9001, 9001 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case103() {
    int[] lowerBound = { 9000, 100000, 800000 };
    int[] upperBound = { 90000, 200000, 900000 };
    assertEquals(661002, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case104() {
    int[] lowerBound = { 9000, 1, 2, 3, 4, 5, 10 };
    int[] upperBound = { 9000, 1, 2, 3, 4, 5, 20 };
    assertEquals(35, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case105() {
    int[] lowerBound = { 9000, 9010, 9020, 9030, 9040, 9050, 9060, 9070, 9080, 9090, 9100, 9110, 9120, 9130, 9140 };
    int[] upperBound = { 10000, 10010, 10020, 10030, 10040, 10050, 10060, 10070, 10080, 10090, 10100, 10110, 10120, 10130, 10140 };
    assertEquals(109058, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case106() {
    int[] lowerBound = { 1 };
    int[] upperBound = { 1000000 };
    assertEquals(991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case107() {
    int[] lowerBound = { 14595, 41226, 93016, 116912, 122421, 176209, 249228, 252239, 357100, 536211, 540525, 628605, 868812, 987944, 994686 };
    int[] upperBound = { 14865, 44665, 93241, 126111, 176208, 187652, 251378, 263717, 360304, 554034, 548001, 642144, 876927, 1000000, 997140 };
    assertEquals(6027619, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case108() {
    int[] lowerBound = { 9000, 1, 10, 18, 1, 10, 18, 1, 10, 18, 1, 10, 18, 1, 10 };
    int[] upperBound = { 9000, 5, 15, 23, 5, 15, 23, 5, 15, 23, 5, 15, 23, 5, 15 };
    assertEquals(192, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case109() {
    int[] lowerBound = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 999999 };
    assertEquals(14990999, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case110() {
    int[] lowerBound = { 1, 12, 13, 14, 15, 16, 997, 98, 99, 98, 99, 99, 33, 334, 555 };
    int[] upperBound = { 900000, 900000, 900000, 900000, 900000, 900000, 900000, 900000, 900000, 900000, 900000, 900000, 900000, 900000, 900000 };
    assertEquals(13491000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case111() {
    int[] lowerBound = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case112() {
    int[] lowerBound = { 1, 10000 };
    int[] upperBound = { 1000000, 10005 };
    assertEquals(1001005, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case113() {
    int[] lowerBound = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] upperBound = { 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999 };
    assertEquals(1490985, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case114() {
    int[] lowerBound = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] upperBound = { 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 1000000 };
    assertEquals(2391000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case115() {
    int[] lowerBound = { 3 };
    int[] upperBound = { 9003 };
    assertEquals(3, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case116() {
    int[] lowerBound = { 9000, 6666, 3333, 7876, 7657, 9000 };
    int[] upperBound = { 9001, 9000, 9000, 9000, 9000, 9000 };
    assertEquals(44004, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case117() {
    int[] lowerBound = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 12, 14, 15 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case118() {
    int[] lowerBound = { 9002, 9001 };
    int[] upperBound = { 9002, 9001 };
    assertEquals(3, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case119() {
    int[] lowerBound = { 1, 1, 1 };
    int[] upperBound = { 1000000, 1000000, 1000000 };
    assertEquals(2991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case120() {
    int[] lowerBound = { 9000, 101, 105 };
    int[] upperBound = { 9000, 110, 106 };
    assertEquals(21, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case121() {
    int[] lowerBound = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    int[] upperBound = { 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000 };
    assertEquals(1490001, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case122() {
    int[] lowerBound = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] upperBound = { 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000 };
    assertEquals(1491000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case123() {
    int[] lowerBound = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] upperBound = { 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999 };
    assertEquals(13990986, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case124() {
    int[] lowerBound = { 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14900002, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case125() {
    int[] lowerBound = { 999967, 999667, 999790, 999224, 999862, 999758, 999668, 999800, 999465, 999862, 999173, 999868, 999266, 999125, 999148 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(69425, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case126() {
    int[] lowerBound = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] upperBound = { 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999 };
    assertEquals(9990990, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case127() {
    int[] lowerBound = { 1, 1251, 2501, 5001, 7501, 10001, 125001, 250001, 500001, 625001, 750001, 875001, 900001 };
    int[] upperBound = { 1250, 2500, 5000, 7500, 10000, 125000, 250000, 500000, 625000, 750000, 875000, 900000, 1000000 };
    assertEquals(5042250, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case128() {
    int[] lowerBound = { 1066, 1055, 1062, 1073, 1080, 1064, 1064, 1089, 1019, 1092, 1054, 1061, 1034, 1027, 1032 };
    int[] upperBound = { 880543, 979681, 661162, 111481, 30367, 970173, 435905, 162684, 374059, 588060, 390438, 913584, 264589, 394196, 633246 };
    assertEquals(7781168, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case129() {
    int[] lowerBound = { 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case130() {
    int[] lowerBound = { 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000 };
    int[] upperBound = { 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000 };
    assertEquals(14, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case131() {
    int[] lowerBound = { 10000, 9000 };
    int[] upperBound = { 10000, 11000 };
    assertEquals(4001, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case132() {
    int[] lowerBound = { 90001 };
    int[] upperBound = { 90001 };
    assertEquals(1, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case133() {
    int[] lowerBound = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    int[] upperBound = { 1000000, 999999, 999998, 999997, 999996, 999995, 999994, 999993, 999992, 999991, 999990, 999989, 999988, 999987, 999988 };
    assertEquals(14990897, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case134() {
    int[] lowerBound = { 9500, 9501, 9503 };
    int[] upperBound = { 9505, 9502, 9507 };
    assertEquals(31, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case135() {
    int[] lowerBound = { 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000, 9000 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(11991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case136() {
    int[] lowerBound = { 8900, 1, 1, 50, 50, 100, 100 };
    int[] upperBound = { 9000, 100, 100, 150, 150, 200, 200 };
    assertEquals(900, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case137() {
    int[] lowerBound = { 10, 9010, 1000000, 1000000, 1000000, 1000000 };
    int[] upperBound = { 20, 9020, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(203, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case138() {
    int[] lowerBound = { 60, 120, 240, 480, 960, 1920, 3840, 7680, 15360, 30720, 61440, 122880, 245760, 491520, 983040 };
    int[] upperBound = { 60, 120, 240, 480, 960, 1920, 3840, 7680, 15360, 30720, 61440, 122880, 245760, 491520, 983040 };
    assertEquals(32617, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case139() {
    int[] lowerBound = { 9001, 9002, 10000 };
    int[] upperBound = { 15000, 9003, 15000 };
    assertEquals(27001, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case140() {
    int[] lowerBound = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case141() {
    int[] lowerBound = { 9001, 9002, 9050 };
    int[] upperBound = { 9010, 9005, 9100 };
    assertEquals(197, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case142() {
    int[] lowerBound = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384 };
    int[] upperBound = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384 };
    assertEquals(23767, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case143() {
    int[] lowerBound = { 80000, 90000, 110000 };
    int[] upperBound = { 130000, 100000, 120000 };
    assertEquals(200003, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case144() {
    int[] lowerBound = { 9000, 1, 1, 1, 1, 1, 300 };
    int[] upperBound = { 9001, 1, 1, 1, 1, 1, 500 };
    assertEquals(213, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case145() {
    int[] lowerBound = { 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(14991000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case146() {
    int[] lowerBound = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 900000, 999000 };
    int[] upperBound = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 900000, 999000 };
    assertEquals(14890000, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case147() {
    int[] lowerBound = { 10000, 11000 };
    int[] upperBound = { 15000, 12000 };
    assertEquals(11002, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case148() {
    int[] lowerBound = { 9001, 9005 };
    int[] upperBound = { 9010, 9006 };
    assertEquals(21, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case149() {
    int[] lowerBound = { 9001, 19001, 29001, 39001, 49001, 59001, 69001, 79001, 89001, 99001, 10001, 20001, 30001, 40001, 50001 };
    int[] upperBound = { 9500, 19500, 29500, 39500, 49500, 59500, 69500, 79500, 89500, 99500, 10500, 20500, 30500, 40500, 50500 };
    assertEquals(539045, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case150() {
    int[] lowerBound = { 8995, 8991, 8991, 9005, 8997, 9001, 8992, 9002, 8991, 9008, 8997, 9001, 8999, 8997, 9005 };
    int[] upperBound = { 9000, 8998, 8992, 9007, 9003, 9005, 8995, 9004, 8997, 9013, 9003, 9009, 9001, 9006, 9009 };
    assertEquals(1260, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case151() {
    int[] lowerBound = { 661397, 450280, 69413, 622139 };
    int[] upperBound = { 772690, 843467, 300873, 836437 };
    assertEquals(2534649, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case152() {
    int[] lowerBound = { 10000, 20000 };
    int[] upperBound = { 10000, 20000 };
    assertEquals(3, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case153() {
    int[] lowerBound = { 10000, 15000 };
    int[] upperBound = { 20000, 17000 };
    assertEquals(22002, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case154() {
    int[] lowerBound = { 20, 95, 9000 };
    int[] upperBound = { 100, 96, 9000 };
    assertEquals(163, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case155() {
    int[] lowerBound = { 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288 };
    int[] upperBound = { 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288 };
    assertEquals(32486, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

  @Test
  public void case156() {
    int[] lowerBound = { 9000, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384 };
    int[] upperBound = { 9000, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384 };
    assertEquals(16383, over9000rocks.countPossibilities(lowerBound, upperBound));
  }

}
