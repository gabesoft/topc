package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class MarblePositioningTest {
  double DELTA = 1.0e-09;
  MarblePositioning marblepositioning = new MarblePositioning();

  @Test
  public void case1() {
    int[] radius = { 1, 2 };
    assertEquals(2.8284271247461903, marblepositioning.totalWidth(radius), DELTA * 2.8284271247461903);
  }

  @Test
  public void case2() {
    int[] radius = { 1, 1000000000 };
    assertEquals(63245.553203367585, marblepositioning.totalWidth(radius), DELTA * 63245.553203367585);
  }

  @Test
  public void case3() {
    int[] radius = { 7, 7, 7 };
    assertEquals(28.0, marblepositioning.totalWidth(radius), DELTA * 28.0);
  }

  @Test
  public void case4() {
    int[] radius = { 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals(50.58155219373389, marblepositioning.totalWidth(radius), DELTA * 50.58155219373389);
  }

  @Test
  public void case5() {
    int[] radius = { 1000000000, 200000000, 300000000, 400000000, 500000000, 600000000, 700000000, 800000000 };
    assertEquals(6531731380.56799, marblepositioning.totalWidth(radius), DELTA * 6531731380.56799);
  }

  @Test
  public void case6() {
    int[] radius = { 10, 20, 30 };
    assertEquals(62.92528739883945, marblepositioning.totalWidth(radius), DELTA * 62.92528739883945);
  }

  @Test
  public void case7() {
    int[] radius = { 100, 100, 11, 11, 25 };
    assertEquals(200.0, marblepositioning.totalWidth(radius), DELTA * 200.0);
  }

  @Test
  public void case8() {
    int[] radius = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    assertEquals(14000000000.0, marblepositioning.totalWidth(radius), DELTA * 14000000000.0);
  }

  @Test
  public void case9() {
    int[] radius = { 1000000000, 1000000000, 250000000, 1000000000, 250000000, 1000000000, 250000000, 99000000 };
    assertEquals(6000000000.0, marblepositioning.totalWidth(radius), DELTA * 6000000000.0);
  }

  @Test
  public void case10() {
    int[] radius = { 1, 999950884, 1 };
    assertEquals(63246.0, marblepositioning.totalWidth(radius), DELTA * 63246.0);
  }

  @Test
  public void case11() {
    int[] radius = { 1, 100000000 };
    assertEquals(20000.0, marblepositioning.totalWidth(radius), DELTA * 20000.0);
  }

  @Test
  public void case12() {
    int[] radius = { 1, 94908557 };
    assertEquals(19484.20457704137, marblepositioning.totalWidth(radius), DELTA * 19484.20457704137);
  }

  @Test
  public void case13() {
    int[] radius = { 660005, 344393, 598163, 715234, 52464, 87578 };
    assertEquals(3157014.540288346, marblepositioning.totalWidth(radius), DELTA * 3157014.540288346);
  }

  @Test
  public void case14() {
    int[] radius = { 911673, 825708, 535941, 710852, 549483, 809046, 604659 };
    assertEquals(8022165.982667927, marblepositioning.totalWidth(radius), DELTA * 8022165.982667927);
  }

  @Test
  public void case15() {
    int[] radius = { 732606, 852428, 207585 };
    assertEquals(1621255.145187647, marblepositioning.totalWidth(radius), DELTA * 1621255.145187647);
  }

  @Test
  public void case16() {
    int[] radius = { 381165, 519721 };
    assertEquals(890167.2988039944, marblepositioning.totalWidth(radius), DELTA * 890167.2988039944);
  }

  @Test
  public void case17() {
    int[] radius = { 19611, 674161, 702765 };
    assertEquals(1376628.8608989716, marblepositioning.totalWidth(radius), DELTA * 1376628.8608989716);
  }

  @Test
  public void case18() {
    int[] radius = { 147195, 982716, 939258, 68116, 52334 };
    assertEquals(1921482.6199869725, marblepositioning.totalWidth(radius), DELTA * 1921482.6199869725);
  }

  @Test
  public void case19() {
    int[] radius = { 376180, 475087, 782672, 278462, 936408, 291909, 462114 };
    assertEquals(5118635.312564134, marblepositioning.totalWidth(radius), DELTA * 5118635.312564134);
  }

  @Test
  public void case20() {
    int[] radius = { 218307, 818795, 786032, 98052 };
    assertEquals(1687785.9403042246, marblepositioning.totalWidth(radius), DELTA * 1687785.9403042246);
  }

  @Test
  public void case21() {
    int[] radius = { 903214, 252429, 550970, 58607, 889016, 695517 };
    assertEquals(4430821.778043712, marblepositioning.totalWidth(radius), DELTA * 4430821.778043712);
  }

  @Test
  public void case22() {
    int[] radius = { 668666, 845064, 224027, 874690, 394297, 141381, 530656, 141738 };
    assertEquals(4926023.100913776, marblepositioning.totalWidth(radius), DELTA * 4926023.100913776);
  }

  @Test
  public void case23() {
    int[] radius = { 672956, 37121, 548896, 138004, 551719, 185703, 682747, 298898 };
    assertEquals(4161722.740292447, marblepositioning.totalWidth(radius), DELTA * 4161722.740292447);
  }

  @Test
  public void case24() {
    int[] radius = { 699999, 958267, 190583, 513298, 447484, 137280, 291316, 232286 };
    assertEquals(4532569.191109305, marblepositioning.totalWidth(radius), DELTA * 4532569.191109305);
  }

  @Test
  public void case25() {
    int[] radius = { 651330, 514779, 913115, 336660, 900413, 655728, 916170, 671158 };
    assertEquals(8924151.169512404, marblepositioning.totalWidth(radius), DELTA * 8924151.169512404);
  }

  @Test
  public void case26() {
    int[] radius = { 162071, 784129, 457990, 137767, 35139, 201263, 585064, 558197 };
    assertEquals(3670933.065883142, marblepositioning.totalWidth(radius), DELTA * 3670933.065883142);
  }

  @Test
  public void case27() {
    int[] radius = { 516745, 53297, 801112, 959401, 220075, 571141, 327418, 494234 };
    assertEquals(5548350.130831172, marblepositioning.totalWidth(radius), DELTA * 5548350.130831172);
  }

  @Test
  public void case28() {
    int[] radius = { 514413, 192326, 689044, 13515, 460874, 589670, 136175, 259540 };
    assertEquals(3847414.8676088667, marblepositioning.totalWidth(radius), DELTA * 3847414.8676088667);
  }

  @Test
  public void case29() {
    int[] radius = { 894110, 554627, 619503, 100922, 367125, 59370, 940926, 873953 };
    assertEquals(6360707.354945734, marblepositioning.totalWidth(radius), DELTA * 6360707.354945734);
  }

  @Test
  public void case30() {
    int[] radius = { 322163, 459196, 628399, 411734, 379755, 611674, 586285, 728148 };
    assertEquals(6688266.533853211, marblepositioning.totalWidth(radius), DELTA * 6688266.533853211);
  }

  @Test
  public void case31() {
    int[] radius = { 307289, 477567, 10092, 651049, 280399, 335056, 944680, 591716 };
    assertEquals(5195277.807116896, marblepositioning.totalWidth(radius), DELTA * 5195277.807116896);
  }

  @Test
  public void case32() {
    int[] radius = { 401622118, 479481651, 432779539, 422969728, 753730372, 831790183, 956345956, 446596892 };
    assertEquals(7373901090.641952, marblepositioning.totalWidth(radius), DELTA * 7373901090.641952);
  }

  @Test
  public void case33() {
    int[] radius = { 257940314, 193804283, 28080954, 323111452, 746668911, 801115143, 325331971, 301950763 };
    assertEquals(3996909228.9770412, marblepositioning.totalWidth(radius), DELTA * 3996909228.9770412);
  }

  @Test
  public void case34() {
    int[] radius = { 185063802, 304201708, 432762862, 737163305, 141388679, 521789659, 767578225, 423938433 };
    assertEquals(4885495980.795207, marblepositioning.totalWidth(radius), DELTA * 4885495980.795207);
  }

  @Test
  public void case35() {
    int[] radius = { 879958222, 205740888, 279137910, 725660632, 835761614, 656087721, 291115281, 135266853 };
    assertEquals(5319102386.494895, marblepositioning.totalWidth(radius), DELTA * 5319102386.494895);
  }

  @Test
  public void case36() {
    int[] radius = { 24069029, 627843741, 389400354, 941605915, 28695821, 754440438, 501214494, 294651927 };
    assertEquals(5003215702.425909, marblepositioning.totalWidth(radius), DELTA * 5003215702.425909);
  }

  @Test
  public void case37() {
    int[] radius = { 808573108, 302775648, 528765193, 999782916, 798312987, 354151201, 352702188, 632735577 };
    assertEquals(7182278628.50116, marblepositioning.totalWidth(radius), DELTA * 7182278628.50116);
  }

  @Test
  public void case38() {
    int[] radius = { 906227351, 124657065, 994679128, 857731976, 396270710, 998555420, 618803501, 360806911 };
    assertEquals(7720539089.780999, marblepositioning.totalWidth(radius), DELTA * 7720539089.780999);
  }

  @Test
  public void case39() {
    int[] radius = { 409972987, 149093171, 727064056, 174544906, 911281675, 975101241, 305698222, 89406733 };
    assertEquals(4510526391.646409, marblepositioning.totalWidth(radius), DELTA * 4510526391.646409);
  }

  @Test
  public void case40() {
    int[] radius = { 435474466, 156588523, 973875344, 395805100, 21037622, 854786896, 386449832, 924828031 };
    assertEquals(5642087141.976454, marblepositioning.totalWidth(radius), DELTA * 5642087141.976454);
  }

  @Test
  public void case41() {
    int[] radius = { 420367537, 840457507, 705696354, 594891945, 643497097, 97025820, 364107167, 868772171 };
    assertEquals(6900940200.833332, marblepositioning.totalWidth(radius), DELTA * 6900940200.833332);
  }

  @Test
  public void case42() {
    int[] radius = { 83005151, 957472525, 717457809, 55146061, 205268979, 926530186, 866058779, 316724802 };
    assertEquals(5365080352.452948, marblepositioning.totalWidth(radius), DELTA * 5365080352.452948);
  }

  @Test
  public void case43() {
    int[] radius = { 882692678, 536432200, 778376668, 456602640, 575121377, 385565867, 413574698, 205272217 };
    assertEquals(6378090442.3917885, marblepositioning.totalWidth(radius), DELTA * 6378090442.3917885);
  }

  @Test
  public void case44() {
    int[] radius = { 165690463, 96189913, 453777666, 215483195, 813968097, 434956971, 514404814, 499427366 };
    assertEquals(4421774435.098757, marblepositioning.totalWidth(radius), DELTA * 4421774435.098757);
  }

  @Test
  public void case45() {
    int[] radius = { 62823017, 323670170, 647962839, 530045917, 31806911, 764215698, 632370896, 446676061 };
    assertEquals(5106558894.464074, marblepositioning.totalWidth(radius), DELTA * 5106558894.464074);
  }

  @Test
  public void case46() {
    int[] radius = { 103431124, 277249621, 646082589, 980605889, 36533708, 825863061, 878239723, 602692320 };
    assertEquals(6163862591.556757, marblepositioning.totalWidth(radius), DELTA * 6163862591.556757);
  }

  @Test
  public void case47() {
    int[] radius = { 505693082, 447551533, 523944842, 577504008, 382636724, 793646419, 497392982, 343190688 };
    assertEquals(6626965022.831949, marblepositioning.totalWidth(radius), DELTA * 6626965022.831949);
  }

  @Test
  public void case48() {
    int[] radius = { 150365767, 531068349, 569778789, 58490271, 223883778, 146535393, 564709446, 986074595 };
    assertEquals(3930541025.528035, marblepositioning.totalWidth(radius), DELTA * 3930541025.528035);
  }

  @Test
  public void case49() {
    int[] radius = { 513907719, 172908168, 129723465, 297959468, 135403233, 897473306, 557456238, 82638968 };
    assertEquals(3228472428.521619, marblepositioning.totalWidth(radius), DELTA * 3228472428.521619);
  }

  @Test
  public void case50() {
    int[] radius = { 946935409, 296003813, 421660197, 449961088, 585164918, 417598792, 687880488, 946411327 };
    assertEquals(7181879597.017124, marblepositioning.totalWidth(radius), DELTA * 7181879597.017124);
  }

  @Test
  public void case51() {
    int[] radius = { 902204985, 414705410, 698910380, 699865314, 966011557, 98384542, 780725147, 60999703 };
    assertEquals(6869205885.3995285, marblepositioning.totalWidth(radius), DELTA * 6869205885.3995285);
  }

  @Test
  public void case52() {
    int[] radius = { 2395, 26850, 6630, 5447, 8653, 26000, 3635, 24269 };
    assertEquals(119329.2316821737, marblepositioning.totalWidth(radius), DELTA * 119329.2316821737);
  }

  @Test
  public void case53() {
    int[] radius = { 19996, 5152, 10227, 13747, 1, 3189, 11531, 17553 };
    assertEquals(110827.33309213359, marblepositioning.totalWidth(radius), DELTA * 110827.33309213359);
  }

  @Test
  public void case54() {
    int[] radius = { 29885, 28869, 840, 8650, 1437, 524, 7979 };
    assertEquals(79104.12923590222, marblepositioning.totalWidth(radius), DELTA * 79104.12923590222);
  }

  @Test
  public void case55() {
    int[] radius = { 6327, 23712, 27299, 2549, 23843, 2345, 1, 17185 };
    assertEquals(131741.69436835495, marblepositioning.totalWidth(radius), DELTA * 131741.69436835495);
  }

  @Test
  public void case56() {
    int[] radius = { 10206, 873, 19128, 11383, 4614, 12913 };
    assertEquals(77800.1569488481, marblepositioning.totalWidth(radius), DELTA * 77800.1569488481);
  }

  @Test
  public void case57() {
    int[] radius = { 21907, 9513, 13400, 25714, 1950, 26915, 8451, 26283 };
    assertEquals(191535.06961700282, marblepositioning.totalWidth(radius), DELTA * 191535.06961700282);
  }

  @Test
  public void case58() {
    int[] radius = { 8718, 1022, 22221, 22735, 12551, 28409 };
    assertEquals(126496.68586144518, marblepositioning.totalWidth(radius), DELTA * 126496.68586144518);
  }

  @Test
  public void case59() {
    int[] radius = { 12099, 8161, 25733, 23568, 8356, 4573, 2859 };
    assertEquals(100935.16374007435, marblepositioning.totalWidth(radius), DELTA * 100935.16374007435);
  }

  @Test
  public void case60() {
    int[] radius = { 8713, 19697, 1, 3517, 21513, 29693 };
    assertEquals(99539.97485694889, marblepositioning.totalWidth(radius), DELTA * 99539.97485694889);
  }

  @Test
  public void case61() {
    int[] radius = { 9206, 1, 1, 18880, 3893 };
    assertEquals(29119.539119220797, marblepositioning.totalWidth(radius), DELTA * 29119.539119220797);
  }

  @Test
  public void case62() {
    int[] radius = { 207589464, 9344249, 520021416, 553942296, 148327041, 55456809, 980628225 };
    assertEquals(2688233119.4535584, marblepositioning.totalWidth(radius), DELTA * 2688233119.4535584);
  }

  @Test
  public void case63() {
    int[] radius = { 82336476, 811736081, 22694696, 565011900, 16063064, 282776856 };
    assertEquals(1757637546.517231, marblepositioning.totalWidth(radius), DELTA * 1757637546.517231);
  }

  @Test
  public void case64() {
    int[] radius = { 65495649, 260983025, 174344616, 118503996, 476591561, 967395609, 435681129, 65819769 };
    assertEquals(2831023135.375623, marblepositioning.totalWidth(radius), DELTA * 2831023135.375623);
  }

  @Test
  public void case65() {
    int[] radius = { 2603996, 468158769, 337639625, 853573656, 47264625 };
    assertEquals(1868843504.3133705, marblepositioning.totalWidth(radius), DELTA * 1868843504.3133705);
  }

  @Test
  public void case66() {
    int[] radius = { 173158281, 159465384, 285744216, 432763809, 332915516, 800889000, 853807400 };
    assertEquals(3808533335.0698752, marblepositioning.totalWidth(radius), DELTA * 3808533335.0698752);
  }

  @Test
  public void case67() {
    int[] radius = { 270930600, 285710409, 498270684, 176241, 79976249 };
    assertEquals(1291282905.7691617, marblepositioning.totalWidth(radius), DELTA * 1291282905.7691617);
  }

  @Test
  public void case68() {
    int[] radius = { 418242401, 663473564, 190494204, 50750376, 319356 };
    assertEquals(1275548677.290183, marblepositioning.totalWidth(radius), DELTA * 1275548677.290183);
  }

  @Test
  public void case69() {
    int[] radius = { 282239000, 587237289, 710381409, 860834600, 871356, 815044401, 947407400 };
    assertEquals(6229033415.764902, marblepositioning.totalWidth(radius), DELTA * 6229033415.764902);
  }

  @Test
  public void case70() {
    int[] radius = { 621005400, 668686881, 186212316, 2213144, 639684264, 76176984 };
    assertEquals(2646406951.3139515, marblepositioning.totalWidth(radius), DELTA * 2646406951.3139515);
  }

  @Test
  public void case71() {
    int[] radius = { 24729729, 348717276, 248723441, 580423464, 47540025, 95941025, 6225 };
    assertEquals(1369924352.005999, marblepositioning.totalWidth(radius), DELTA * 1369924352.005999);
  }

  @Test
  public void case72() {
    int[] radius = { 20952, 220347864, 733869808, 776150559, 219255227, 45656, 746141643 };
    assertEquals(3242511528.7319627, marblepositioning.totalWidth(radius), DELTA * 3242511528.7319627);
  }

  @Test
  public void case73() {
    int[] radius = { 8261, 315820241, 215999000, 420875, 122762473, 1294029, 385827352, 531440000 };
    assertEquals(2004387026.1396475, marblepositioning.totalWidth(radius), DELTA * 2004387026.1396475);
  }

  @Test
  public void case74() {
    int[] radius = { 136589875, 523605616, 264608288, 111979168, 291433247 };
    assertEquals(1607813880.684546, marblepositioning.totalWidth(radius), DELTA * 1607813880.684546);
  }

  @Test
  public void case75() {
    int[] radius = { 3175523, 217080801, 96070912, 825292672, 5450776 };
    assertEquals(851983845.6625227, marblepositioning.totalWidth(radius), DELTA * 851983845.6625227);
  }

  @Test
  public void case76() {
    int[] radius = { 656233909, 304820217, 846589536, 3651264, 901427696, 88715536 };
    assertEquals(3433597379.975623, marblepositioning.totalWidth(radius), DELTA * 3433597379.975623);
  }

  @Test
  public void case77() {
    int[] radius = { 70443997, 496792088, 557440767, 2862288, 681471000, 206424071, 145530576, 313432 };
    assertEquals(2486513308.192616, marblepositioning.totalWidth(radius), DELTA * 2486513308.192616);
  }

  @Test
  public void case78() {
    int[] radius = { 224754712, 13143256, 379502424, 7999000, 476378541, 976190488, 89914392 };
    assertEquals(2371297016.1967654, marblepositioning.totalWidth(radius), DELTA * 2371297016.1967654);
  }

  @Test
  public void case79() {
    int[] radius = { 70443997, 911673, 3913, 11088567, 633838779 };
    assertEquals(422611580.7516858, marblepositioning.totalWidth(radius), DELTA * 422611580.7516858);
  }

  @Test
  public void case80() {
    int[] radius = { 1770561, 50242409, 788888024, 3111136, 442449728 };
    assertEquals(1181597717.7385838, marblepositioning.totalWidth(radius), DELTA * 1181597717.7385838);
  }

  @Test
  public void case81() {
    int[] radius = { 54438939, 403582419, 176557481, 530441, 198154287, 197136368, 22424768, 177503328 };
    assertEquals(1656215761.5584803, marblepositioning.totalWidth(radius), DELTA * 1656215761.5584803);
  }

  @Test
  public void case82() {
    int[] radius = { 1678868, 13845076, 207359378, 9440, 116986051, 59969089, 157352699 };
    assertEquals(661896449.6410105, marblepositioning.totalWidth(radius), DELTA * 661896449.6410105);
  }

  @Test
  public void case83() {
    int[] radius = { 442050892, 2313563, 168895064, 96060335, 88528910, 31640290, 130561, 104498 };
    assertEquals(834831123.9589365, marblepositioning.totalWidth(radius), DELTA * 834831123.9589365);
  }

  @Test
  public void case84() {
    int[] radius = { 37777, 45211416, 200533708, 607573452, 57290189 };
    assertEquals(698108751.4475664, marblepositioning.totalWidth(radius), DELTA * 698108751.4475664);
  }

  @Test
  public void case85() {
    int[] radius = { 22666667, 454372826, 671898153, 6868, 533794057, 332151179, 25411270, 15753598 };
    assertEquals(2706760932.4709935, marblepositioning.totalWidth(radius), DELTA * 2706760932.4709935);
  }

  @Test
  public void case86() {
    int[] radius = { 45212140, 146410029, 126248151, 9150226, 68575938, 533794727, 352276096, 116986227 };
    assertEquals(1504034557.0018988, marblepositioning.totalWidth(radius), DELTA * 1504034557.0018988);
  }

  @Test
  public void case87() {
    int[] radius = { 4878920, 15753185, 65609798, 260144743, 260143714, 352274519, 35154002 };
    assertEquals(1125737056.700802, marblepositioning.totalWidth(radius), DELTA * 1125737056.700802);
  }

  @Test
  public void case88() {
    int[] radius = { 12116514, 50787, 38142, 9834696, 200533215 };
    assertEquals(110650829.69869405, marblepositioning.totalWidth(radius), DELTA * 110650829.69869405);
  }

  @Test
  public void case89() {
    int[] radius = { 25412309, 519885626, 312901479, 228887026, 84935426, 442051055, 607573148, 454371633 };
    assertEquals(3837626452.0758686, marblepositioning.totalWidth(radius), DELTA * 3837626452.0758686);
  }

  @Test
  public void case90() {
    int[] radius = { 15752388, 68574856, 74804426, 246, 221533598, 614208, 62741342, 7312270 };
    assertEquals(510221162.3031318, marblepositioning.totalWidth(radius), DELTA * 510221162.3031318);
  }

  @Test
  public void case91() {
    int[] radius = { 924117, 112550252, 285610292, 22667903, 207359077 };
    assertEquals(664121047.5394449, marblepositioning.totalWidth(radius), DELTA * 664121047.5394449);
  }

  @Test
  public void case92() {
    int[] radius = { 6435791, 184527459, 6436783, 992437313, 599 };
    assertEquals(855878345.525058, marblepositioning.totalWidth(radius), DELTA * 855878345.525058);
  }

  @Test
  public void case93() {
    int[] radius = { 5154399, 1, 17210645, 758776, 1420281, 656356796 };
    assertEquals(212568330.74842942, marblepositioning.totalWidth(radius), DELTA * 212568330.74842942);
  }

  @Test
  public void case94() {
    int[] radius = { 4083256, 508, 459165056, 28629558, 714923923 };
    assertEquals(1145893682.9218228, marblepositioning.totalWidth(radius), DELTA * 1145893682.9218228);
  }

  @Test
  public void case95() {
    int[] radius = { 380203681, 20511753, 992436098, 184528518, 248969 };
    assertEquals(1385628979.4545138, marblepositioning.totalWidth(radius), DELTA * 1385628979.4545138);
  }

  @Test
  public void case96() {
    int[] radius = { 149, 459164649, 69344267, 39134741, 184527344, 20511708 };
    assertEquals(598524918.1413195, marblepositioning.totalWidth(radius), DELTA * 598524918.1413195);
  }

  @Test
  public void case97() {
    int[] radius = { 1048840, 5153715, 20511449, 4084205, 503285186, 371888, 100132, 312500824 };
    assertEquals(793163376.1892774, marblepositioning.totalWidth(radius), DELTA * 793163376.1892774);
  }

  @Test
  public void case98() {
    int[] radius = { 1049566, 24299220, 39134888, 380204298, 229345911 };
    assertEquals(590587169.1492306, marblepositioning.totalWidth(radius), DELTA * 590587169.1492306);
  }

  @Test
  public void case99() {
    int[] radius = { 874, 777600943, 254804958, 52521073, 229344719, 24300527, 1, 17474 };
    assertEquals(1328083035.1604218, marblepositioning.totalWidth(radius), DELTA * 1328083035.1604218);
  }

  @Test
  public void case100() {
    int[] radius = { 916133487, 52522607, 161318, 503283574, 147009296, 312499632, 550732580 };
    assertEquals(2976376310.8968954, marblepositioning.totalWidth(radius), DELTA * 2976376310.8968954);
  }

  @Test
  public void case101() {
    int[] radius = { 39135296, 205963424, 164917207, 7962452, 14349228 };
    assertEquals(368602293.1574722, marblepositioning.totalWidth(radius), DELTA * 368602293.1574722);
  }

  @Test
  public void case102() {
    int[] radius = { 538278, 161906, 4084279, 4085014, 162004 };
    assertEquals(8169292.966935633, marblepositioning.totalWidth(radius), DELTA * 8169292.966935633);
  }

  @Test
  public void case103() {
    int[] radius = { 161413, 538762, 16460, 2873, 3200663, 24299580, 4083694, 24300198 };
    assertEquals(48599777.99607072, marblepositioning.totalWidth(radius), DELTA * 48599777.99607072);
  }

  @Test
  public void case104() {
    int[] radius = { 32081, 248439, 408, 17209667, 161820, 249431, 536994, 2475592 };
    assertEquals(13054365.392138219, marblepositioning.totalWidth(radius), DELTA * 13054365.392138219);
  }

  @Test
  public void case105() {
    int[] radius = { 11881896, 1231, 1048505, 1888988, 4093 };
    assertEquals(9873928.159339808, marblepositioning.totalWidth(radius), DELTA * 9873928.159339808);
  }

  @Test
  public void case106() {
    int[] radius = { 28629424, 4084542, 2837, 20511708, 5152835 };
    assertEquals(51364442.05525604, marblepositioning.totalWidth(radius), DELTA * 51364442.05525604);
  }

  @Test
  public void case107() {
    int[] radius = { 3199346, 1013, 536904, 371270, 32467, 20511984, 20511570, 32100 };
    assertEquals(41023553.997911006, marblepositioning.totalWidth(radius), DELTA * 41023553.997911006);
  }

  @Test
  public void case108() {
    int[] radius = { 5153015, 370952, 1419147, 28630047, 1419604, 20510626, 349 };
    assertEquals(48465252.97073861, marblepositioning.totalWidth(radius), DELTA * 48465252.97073861);
  }

  @Test
  public void case109() {
    int[] radius = { 111, 758570, 1, 24299232, 4084772, 594, 7963148, 17231 };
    assertEquals(31332145.9513885, marblepositioning.totalWidth(radius), DELTA * 31332145.9513885);
  }

  @Test
  public void case110() {
    int[] radius = { 5153729, 1888638, 14348327, 1822, 1420597, 249821, 3200693 };
    assertEquals(24710553.599868882, marblepositioning.totalWidth(radius), DELTA * 24710553.599868882);
  }

  @Test
  public void case111() {
    int[] radius = { 3639, 7961723, 7961843, 9765897, 538259 };
    assertEquals(33559139.90691258, marblepositioning.totalWidth(radius), DELTA * 33559139.90691258);
  }

  @Test
  public void case112() {
    int[] radius = { 893871496, 268436295, 893872698, 173, 2096574 };
    assertEquals(1959378325.5820036, marblepositioning.totalWidth(radius), DELTA * 1959378325.5820036);
  }

  @Test
  public void case113() {
    int[] radius = { 77514, 893872603, 278999, 10000091, 62748784, 823393, 823728 };
    assertEquals(473664095.70143586, marblepositioning.totalWidth(radius), DELTA * 473664095.70143586);
  }

  @Test
  public void case114() {
    int[] radius = { 612220702, 118, 9999271, 824247, 1, 1544, 1, 1 };
    assertEquals(156483362.83590332, marblepositioning.totalWidth(radius), DELTA * 156483362.83590332);
  }

  @Test
  public void case115() {
    int[] radius = { 1, 105414354, 1, 78347, 612219260 };
    assertEquals(508081480.8640757, marblepositioning.totalWidth(radius), DELTA * 508081480.8640757);
  }

  @Test
  public void case116() {
    int[] radius = { 2097394, 823133, 268436161, 62748814, 268436324 };
    assertEquals(536872484.9999752, marblepositioning.totalWidth(radius), DELTA * 536872484.9999752);
  }

  @Test
  public void case117() {
    int[] radius = { 170859560, 824133, 4783605, 9999182, 77799, 739, 2097288, 2096849 };
    assertEquals(82666942.2896461, marblepositioning.totalWidth(radius), DELTA * 82666942.2896461);
  }

  @Test
  public void case118() {
    int[] radius = { 823935, 823289, 9999135, 612219347, 10000781 };
    assertEquals(176482041.43246377, marblepositioning.totalWidth(radius), DELTA * 176482041.43246377);
  }

  @Test
  public void case119() {
    int[] radius = { 280373, 16153, 62748377, 410339643, 170859189, 62749313, 410338688, 268436372 };
    assertEquals(1621665014.45396, marblepositioning.totalWidth(radius), DELTA * 1621665014.45396);
  }

  @Test
  public void case120() {
    int[] radius = { 268435154, 893871171, 62749451, 170858818, 612219818, 410338019 };
    assertEquals(2785723432.2210617, marblepositioning.totalWidth(radius), DELTA * 2785723432.2210617);
  }

  @Test
  public void case121() {
    int[] radius = { 4783692, 823220, 612220447, 16228, 105413741, 4782715 };
    assertEquals(508080496.12226695, marblepositioning.totalWidth(radius), DELTA * 508080496.12226695);
  }

  @Test
  public void case122() {
    int[] radius = { 1, 1952613, 305, 719, 261171, 1 };
    assertEquals(1428237.9211083846, marblepositioning.totalWidth(radius), DELTA * 1428237.9211083846);
  }

  @Test
  public void case123() {
    int[] radius = { 10078380, 1264, 19197, 1, 134218114, 1954087 };
    assertEquals(73558171.69493325, marblepositioning.totalWidth(radius), DELTA * 73558171.69493325);
  }

  @Test
  public void case124() {
    int[] radius = { 1509, 1, 40352631, 20643, 261517, 1952425, 19691 };
    assertEquals(17752237.670803644, marblepositioning.totalWidth(radius), DELTA * 17752237.670803644);
  }

  @Test
  public void case125() {
    int[] radius = { 40352921, 850, 1097, 1952528, 387421248 };
    assertEquals(250068622.69597447, marblepositioning.totalWidth(radius), DELTA * 250068622.69597447);
  }

  @Test
  public void case126() {
    int[] radius = { 1952709, 1, 1952278, 262328, 904, 134218135 };
    assertEquals(36279737.147391826, marblepositioning.totalWidth(radius), DELTA * 36279737.147391826);
  }

  @Test
  public void case127() {
    int[] radius = { 1953150, 387420694, 1953335, 262126, 262798 };
    assertEquals(58922509.151717834, marblepositioning.totalWidth(radius), DELTA * 58922509.151717834);
  }

  @Test
  public void case128() {
    int[] radius = { 40353517, 1953122, 40353458, 10077780, 261486, 387420320, 262946 };
    assertEquals(330776962.09532386, marblepositioning.totalWidth(radius), DELTA * 330776962.09532386);
  }

  @Test
  public void case129() {
    int[] radius = { 387420238, 20279, 134217538, 262575, 1953033, 10078561 };
    assertEquals(456063989.00037724, marblepositioning.totalWidth(radius), DELTA * 456063989.00037724);
  }

  @Test
  public void case130() {
    int[] radius = { 1953896, 1131, 10078479, 10077001, 1952535 };
    assertEquals(21653091.112507835, marblepositioning.totalWidth(radius), DELTA * 21653091.112507835);
  }

  @Test
  public void case131() {
    int[] radius = { 1180, 40354146, 40354225, 1, 10077278, 19253, 261832 };
    assertEquals(80708370.99996133, marblepositioning.totalWidth(radius), DELTA * 80708370.99996133);
  }

  @Test
  public void case132() {
    int[] radius = { 1047946, 1048289, 1048436, 543, 1049538, 1048630, 1049381, 575 };
    assertEquals(10485519.98589413, marblepositioning.totalWidth(radius), DELTA * 10485519.98589413);
  }

  @Test
  public void case133() {
    int[] radius = { 1049019, 1047577, 1049560, 208, 1, 97, 1048110 };
    assertEquals(6289951.797679972, marblepositioning.totalWidth(radius), DELTA * 6289951.797679972);
  }

  @Test
  public void case134() {
    int[] radius = { 1, 1, 1, 1048410, 992 };
    assertEquals(64498.76649983316, marblepositioning.totalWidth(radius), DELTA * 64498.76649983316);
  }

  @Test
  public void case135() {
    int[] radius = { 1, 1048846, 1048637, 1048165, 1048995 };
    assertEquals(6291444.772216631, marblepositioning.totalWidth(radius), DELTA * 6291444.772216631);
  }

  @Test
  public void case136() {
    int[] radius = { 457, 1047646, 797, 1049095, 1, 1, 447, 1049360 };
    assertEquals(4193745.798843899, marblepositioning.totalWidth(radius), DELTA * 4193745.798843899);
  }

  @Test
  public void case137() {
    int[] radius = { 836, 1, 1, 1048111, 1049456, 309, 626, 1049115 };
    assertEquals(4194792.328458842, marblepositioning.totalWidth(radius), DELTA * 4194792.328458842);
  }

  @Test
  public void case138() {
    int[] radius = { 1, 1048003, 1048741, 1048460, 1 };
    assertEquals(4193206.8203116325, marblepositioning.totalWidth(radius), DELTA * 4193206.8203116325);
  }

  @Test
  public void case139() {
    int[] radius = { 1049413, 1048202, 630, 1047712, 674, 1048051, 15 };
    assertEquals(6289140.277294476, marblepositioning.totalWidth(radius), DELTA * 6289140.277294476);
  }

  @Test
  public void case140() {
    int[] radius = { 1, 598, 904, 1047712, 1047790, 1, 1 };
    assertEquals(2095501.998548319, marblepositioning.totalWidth(radius), DELTA * 2095501.998548319);
  }

  @Test
  public void case141() {
    int[] radius = { 1, 1048068, 1, 1, 1048154, 1 };
    assertEquals(2096221.9982358739, marblepositioning.totalWidth(radius), DELTA * 2096221.9982358739);
  }

  @Test
  public void case142() {
    int[] radius = { 1, 999950884, 1 };
    assertEquals(63246.0, marblepositioning.totalWidth(radius), DELTA * 63246.0);
  }

  @Test
  public void case143() {
    int[] radius = { 9123344, 24324455, 9898983, 40000077, 8989898, 92344323, 100000000, 90909898 };
    assertEquals(434847439.11406803, marblepositioning.totalWidth(radius), DELTA * 434847439.11406803);
  }

  @Test
  public void case144() {
    int[] radius = { 1000000000, 1, 1000000000, 2, 3, 4, 5, 6 };
    assertEquals(2000000000.0, marblepositioning.totalWidth(radius), DELTA * 2000000000.0);
  }

  @Test
  public void case145() {
    int[] radius = { 99999999, 1, 2 };
    assertEquals(28284.271106040545, marblepositioning.totalWidth(radius), DELTA * 28284.271106040545);
  }

  @Test
  public void case146() {
    int[] radius = { 100, 100, 11, 11, 25 };
    assertEquals(200.0, marblepositioning.totalWidth(radius), DELTA * 200.0);
  }

  @Test
  public void case147() {
    int[] radius = { 998, 10074, 1, 1, 345473, 77973, 4273423, 51123423 };
    assertEquals(29561597.499927435, marblepositioning.totalWidth(radius), DELTA * 29561597.499927435);
  }

  @Test
  public void case148() {
    int[] radius = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 10000000, 1 };
    assertEquals(10000000000.0, marblepositioning.totalWidth(radius), DELTA * 10000000000.0);
  }

  @Test
  public void case149() {
    int[] radius = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    assertEquals(14000000000.0, marblepositioning.totalWidth(radius), DELTA * 14000000000.0);
  }

  @Test
  public void case150() {
    int[] radius = { 1000000000, 1000000000, 1000000000, 1000000000, 999999999, 999999998, 1000000000, 1000000000 };
    assertEquals(13999999994.0, marblepositioning.totalWidth(radius), DELTA * 13999999994.0);
  }

  @Test
  public void case151() {
    int[] radius = { 50000, 50000, 2 };
    assertEquals(100000.0, marblepositioning.totalWidth(radius), DELTA * 100000.0);
  }

  @Test
  public void case152() {
    int[] radius = { 1000000000, 1, 1000000000 };
    assertEquals(2000000000.0, marblepositioning.totalWidth(radius), DELTA * 2000000000.0);
  }

  @Test
  public void case153() {
    int[] radius = { 1, 2, 1000, 1, 1, 1, 1000 };
    assertEquals(2000.0, marblepositioning.totalWidth(radius), DELTA * 2000.0);
  }

  @Test
  public void case154() {
    int[] radius = { 2435345, 3456544, 645647, 456768, 7895678, 3423454, 456, 644563 };
    assertEquals(21424900.44057381, marblepositioning.totalWidth(radius), DELTA * 21424900.44057381);
  }

}
