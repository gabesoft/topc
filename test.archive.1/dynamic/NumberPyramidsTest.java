package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class NumberPyramidsTest {
  NumberPyramids numberpyramids = new NumberPyramids();

  @Test
  public void case1() {
    int baseLength = 3;
    int top = 5;
    assertEquals(2, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case2() {
    int baseLength = 5;
    int top = 16;
    assertEquals(1, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case3() {
    int baseLength = 4;
    int top = 15;
    assertEquals(24, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case4() {
    int baseLength = 15;
    int top = 31556;
    assertEquals(74280915, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case5() {
    int baseLength = 150;
    int top = 500;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case6() {
    int baseLength = 2;
    int top = 1;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case7() {
    int baseLength = 2;
    int top = 2;
    assertEquals(1, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case8() {
    int baseLength = 2;
    int top = 31;
    assertEquals(30, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case9() {
    int baseLength = 2;
    int top = 99921;
    assertEquals(99920, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case10() {
    int baseLength = 2;
    int top = 1000000;
    assertEquals(999999, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case11() {
    int baseLength = 3;
    int top = 3;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case12() {
    int baseLength = 3;
    int top = 4;
    assertEquals(1, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case13() {
    int baseLength = 3;
    int top = 11;
    assertEquals(20, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case14() {
    int baseLength = 3;
    int top = 6114;
    assertEquals(9339136, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case15() {
    int baseLength = 4;
    int top = 1;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case16() {
    int baseLength = 4;
    int top = 6;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case17() {
    int baseLength = 4;
    int top = 8;
    assertEquals(1, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case18() {
    int baseLength = 4;
    int top = 600000;
    assertEquals(964500728, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case19() {
    int baseLength = 4;
    int top = 600001;
    assertEquals(964200549, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case20() {
    int baseLength = 4;
    int top = 878909;
    assertEquals(919, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case21() {
    int baseLength = 5;
    int top = 1;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case22() {
    int baseLength = 5;
    int top = 17;
    assertEquals(2, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case23() {
    int baseLength = 5;
    int top = 26;
    assertEquals(41, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case24() {
    int baseLength = 5;
    int top = 663;
    assertEquals(79881120, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case25() {
    int baseLength = 5;
    int top = 20912;
    assertEquals(201215843, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case26() {
    int baseLength = 5;
    int top = 230319;
    assertEquals(155695707, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case27() {
    int baseLength = 5;
    int top = 233336;
    assertEquals(28102304, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case28() {
    int baseLength = 5;
    int top = 892319;
    assertEquals(305826445, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case29() {
    int baseLength = 5;
    int top = 1000000;
    assertEquals(541033786, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case30() {
    int baseLength = 6;
    int top = 38;
    assertEquals(11, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case31() {
    int baseLength = 6;
    int top = 46990;
    assertEquals(1489, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case32() {
    int baseLength = 6;
    int top = 96177;
    assertEquals(999999968, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case33() {
    int baseLength = 7;
    int top = 221232;
    assertEquals(995, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case34() {
    int baseLength = 7;
    int top = 221233;
    assertEquals(63045094, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case35() {
    int baseLength = 7;
    int top = 221234;
    assertEquals(480190354, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case36() {
    int baseLength = 8;
    int top = 128;
    assertEquals(1, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case37() {
    int baseLength = 8;
    int top = 129;
    assertEquals(2, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case38() {
    int baseLength = 8;
    int top = 745;
    assertEquals(502606384, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case39() {
    int baseLength = 8;
    int top = 8456;
    assertEquals(588866907, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case40() {
    int baseLength = 8;
    int top = 909201;
    assertEquals(606368952, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case41() {
    int baseLength = 8;
    int top = 997231;
    assertEquals(518871768, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case42() {
    int baseLength = 8;
    int top = 1000000;
    assertEquals(957757377, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case43() {
    int baseLength = 9;
    int top = 261348;
    assertEquals(176, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case44() {
    int baseLength = 9;
    int top = 800455;
    assertEquals(46210630, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case45() {
    int baseLength = 9;
    int top = 821882;
    assertEquals(591474169, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case46() {
    int baseLength = 10;
    int top = 900;
    assertEquals(3065245, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case47() {
    int baseLength = 10;
    int top = 9000;
    assertEquals(237517869, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case48() {
    int baseLength = 10;
    int top = 900000;
    assertEquals(160724396, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case49() {
    int baseLength = 10;
    int top = 982217;
    assertEquals(54835737, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case50() {
    int baseLength = 10;
    int top = 1000000;
    assertEquals(249398805, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case51() {
    int baseLength = 11;
    int top = 2100;
    assertEquals(650490618, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case52() {
    int baseLength = 11;
    int top = 62149;
    assertEquals(112922875, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case53() {
    int baseLength = 12;
    int top = 234700;
    assertEquals(649632950, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case54() {
    int baseLength = 12;
    int top = 995458;
    assertEquals(215, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case55() {
    int baseLength = 13;
    int top = 7271;
    assertEquals(857222592, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case56() {
    int baseLength = 13;
    int top = 12859;
    assertEquals(995324611, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case57() {
    int baseLength = 13;
    int top = 99218;
    assertEquals(133737713, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case58() {
    int baseLength = 13;
    int top = 100000;
    assertEquals(102817532, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case59() {
    int baseLength = 13;
    int top = 881233;
    assertEquals(698094460, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case60() {
    int baseLength = 13;
    int top = 1000000;
    assertEquals(988435748, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case61() {
    int baseLength = 14;
    int top = 218;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case62() {
    int baseLength = 14;
    int top = 3157;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case63() {
    int baseLength = 14;
    int top = 777459;
    assertEquals(97961327, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case64() {
    int baseLength = 14;
    int top = 909909;
    assertEquals(12791298, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case65() {
    int baseLength = 14;
    int top = 999998;
    assertEquals(178936545, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case66() {
    int baseLength = 15;
    int top = 66218;
    assertEquals(729885187, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case67() {
    int baseLength = 15;
    int top = 126694;
    assertEquals(30567351, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case68() {
    int baseLength = 15;
    int top = 606216;
    assertEquals(561886284, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case69() {
    int baseLength = 16;
    int top = 49612;
    assertEquals(228423174, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case70() {
    int baseLength = 16;
    int top = 77777;
    assertEquals(712432757, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case71() {
    int baseLength = 16;
    int top = 612899;
    assertEquals(971102494, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case72() {
    int baseLength = 17;
    int top = 65534;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case73() {
    int baseLength = 17;
    int top = 65535;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case74() {
    int baseLength = 17;
    int top = 65536;
    assertEquals(1, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case75() {
    int baseLength = 17;
    int top = 666666;
    assertEquals(112553535, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case76() {
    int baseLength = 17;
    int top = 862196;
    assertEquals(583103723, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case77() {
    int baseLength = 17;
    int top = 1000000;
    assertEquals(676430199, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case78() {
    int baseLength = 18;
    int top = 90521;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case79() {
    int baseLength = 18;
    int top = 877049;
    assertEquals(999999843, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case80() {
    int baseLength = 18;
    int top = 956903;
    assertEquals(752034524, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case81() {
    int baseLength = 19;
    int top = 671238;
    assertEquals(258044316, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case82() {
    int baseLength = 19;
    int top = 739033;
    assertEquals(453899991, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case83() {
    int baseLength = 19;
    int top = 991000;
    assertEquals(90063078, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case84() {
    int baseLength = 19;
    int top = 1000000;
    assertEquals(497295279, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case85() {
    int baseLength = 20;
    int top = 3313;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case86() {
    int baseLength = 20;
    int top = 524287;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case87() {
    int baseLength = 20;
    int top = 524288;
    assertEquals(1, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case88() {
    int baseLength = 20;
    int top = 531000;
    assertEquals(606695, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case89() {
    int baseLength = 20;
    int top = 700000;
    assertEquals(20981017, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case90() {
    int baseLength = 20;
    int top = 832966;
    assertEquals(252176906, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case91() {
    int baseLength = 20;
    int top = 928156;
    assertEquals(133045640, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case92() {
    int baseLength = 20;
    int top = 959712;
    assertEquals(900986492, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case93() {
    int baseLength = 20;
    int top = 991727;
    assertEquals(817719810, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case94() {
    int baseLength = 20;
    int top = 999999;
    assertEquals(293463623, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case95() {
    int baseLength = 20;
    int top = 1000000;
    assertEquals(503596690, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case96() {
    int baseLength = 21;
    int top = 1000000;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case97() {
    int baseLength = 22;
    int top = 251;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case98() {
    int baseLength = 22;
    int top = 885655;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case99() {
    int baseLength = 23;
    int top = 251875;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case100() {
    int baseLength = 25;
    int top = 997592;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case101() {
    int baseLength = 26;
    int top = 1000000;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case102() {
    int baseLength = 27;
    int top = 1000000;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case103() {
    int baseLength = 28;
    int top = 905285;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case104() {
    int baseLength = 28;
    int top = 1000000;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case105() {
    int baseLength = 29;
    int top = 1000000;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case106() {
    int baseLength = 30;
    int top = 882568;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case107() {
    int baseLength = 30;
    int top = 1000000;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case108() {
    int baseLength = 31;
    int top = 1000000;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case109() {
    int baseLength = 32;
    int top = 1000000;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case110() {
    int baseLength = 33;
    int top = 1000000;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case111() {
    int baseLength = 71;
    int top = 1;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case112() {
    int baseLength = 89;
    int top = 7;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case113() {
    int baseLength = 217;
    int top = 61;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case114() {
    int baseLength = 217;
    int top = 969257;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case115() {
    int baseLength = 1002;
    int top = 92925;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case116() {
    int baseLength = 15852;
    int top = 1000000;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case117() {
    int baseLength = 34744;
    int top = 963081;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case118() {
    int baseLength = 70066;
    int top = 618081;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case119() {
    int baseLength = 418145;
    int top = 598281;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case120() {
    int baseLength = 572551;
    int top = 946971;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case121() {
    int baseLength = 597232;
    int top = 662821;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case122() {
    int baseLength = 645043;
    int top = 380891;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case123() {
    int baseLength = 696406;
    int top = 864131;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case124() {
    int baseLength = 717129;
    int top = 618561;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case125() {
    int baseLength = 999999;
    int top = 15215;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case126() {
    int baseLength = 1000000;
    int top = 768276;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case127() {
    int baseLength = 1000000;
    int top = 1000000;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case128() {
    int baseLength = 3;
    int top = 1000000;
    assertEquals(998997760, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case129() {
    int baseLength = 4;
    int top = 1000000;
    assertEquals(130353854, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case130() {
    int baseLength = 6;
    int top = 1000000;
    assertEquals(866729335, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case131() {
    int baseLength = 7;
    int top = 1000000;
    assertEquals(943949925, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case132() {
    int baseLength = 9;
    int top = 1000000;
    assertEquals(267893633, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case133() {
    int baseLength = 11;
    int top = 1000000;
    assertEquals(608237055, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case134() {
    int baseLength = 12;
    int top = 1000000;
    assertEquals(989024786, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case135() {
    int baseLength = 14;
    int top = 1000000;
    assertEquals(661570834, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case136() {
    int baseLength = 15;
    int top = 1000000;
    assertEquals(388830591, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case137() {
    int baseLength = 16;
    int top = 1000000;
    assertEquals(926227824, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case138() {
    int baseLength = 18;
    int top = 1000000;
    assertEquals(378681417, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case139() {
    int baseLength = 20;
    int top = 924288;
    assertEquals(453121764, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case140() {
    int baseLength = 19;
    int top = 524288;
    assertEquals(922026758, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case141() {
    int baseLength = 19;
    int top = 999999;
    assertEquals(781161529, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case142() {
    int baseLength = 1000000;
    int top = 15;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case143() {
    int baseLength = 999900;
    int top = 999941;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case144() {
    int baseLength = 17;
    int top = 100000;
    assertEquals(502869195, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case145() {
    int baseLength = 20;
    int top = 999997;
    assertEquals(873197498, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case146() {
    int baseLength = 22;
    int top = 999999;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case147() {
    int baseLength = 33;
    int top = 59279;
    assertEquals(0, numberpyramids.count(baseLength, top));
  }

  @Test
  public void case148() {
    int baseLength = 9;
    int top = 999998;
    assertEquals(674956729, numberpyramids.count(baseLength, top));
  }

}
