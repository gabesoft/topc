package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class BricksNTest {
  BricksN bricksn = new BricksN();

  @Test
  public void case1() {
    int w = 3;
    int h = 1;
    int k = 3;
    assertEquals(13, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case2() {
    int w = 3;
    int h = 2;
    int k = 3;
    assertEquals(83, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case3() {
    int w = 1;
    int h = 5;
    int k = 1;
    assertEquals(6, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case4() {
    int w = 10;
    int h = 10;
    int k = 3;
    assertEquals(288535435, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case5() {
    int w = 1;
    int h = 1;
    int k = 1;
    assertEquals(2, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case6() {
    int w = 50;
    int h = 50;
    int k = 50;
    assertEquals(92324271, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case7() {
    int w = 50;
    int h = 1;
    int k = 50;
    assertEquals(782204094, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case8() {
    int w = 50;
    int h = 50;
    int k = 1;
    assertEquals(370141234, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case9() {
    int w = 1;
    int h = 50;
    int k = 1;
    assertEquals(51, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case10() {
    int w = 24;
    int h = 11;
    int k = 13;
    assertEquals(226244183, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case11() {
    int w = 42;
    int h = 31;
    int k = 34;
    assertEquals(145616060, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case12() {
    int w = 33;
    int h = 7;
    int k = 17;
    assertEquals(903406539, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case13() {
    int w = 24;
    int h = 23;
    int k = 19;
    assertEquals(226815126, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case14() {
    int w = 20;
    int h = 22;
    int k = 6;
    assertEquals(671975329, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case15() {
    int w = 39;
    int h = 31;
    int k = 32;
    assertEquals(581268661, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case16() {
    int w = 33;
    int h = 16;
    int k = 15;
    assertEquals(447266089, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case17() {
    int w = 40;
    int h = 5;
    int k = 32;
    assertEquals(532852082, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case18() {
    int w = 18;
    int h = 4;
    int k = 5;
    assertEquals(892978442, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case19() {
    int w = 32;
    int h = 1;
    int k = 24;
    assertEquals(680051485, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case20() {
    int w = 44;
    int h = 24;
    int k = 18;
    assertEquals(652699350, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case21() {
    int w = 47;
    int h = 21;
    int k = 3;
    assertEquals(595660426, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case22() {
    int w = 47;
    int h = 18;
    int k = 38;
    assertEquals(577142937, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case23() {
    int w = 28;
    int h = 27;
    int k = 4;
    assertEquals(838449365, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case24() {
    int w = 36;
    int h = 12;
    int k = 20;
    assertEquals(293540022, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case25() {
    int w = 35;
    int h = 40;
    int k = 2;
    assertEquals(923407699, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case26() {
    int w = 32;
    int h = 6;
    int k = 30;
    assertEquals(455215822, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case27() {
    int w = 40;
    int h = 26;
    int k = 29;
    assertEquals(81640412, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case28() {
    int w = 29;
    int h = 11;
    int k = 25;
    assertEquals(946776653, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case29() {
    int w = 27;
    int h = 43;
    int k = 12;
    assertEquals(928823009, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case30() {
    int w = 26;
    int h = 33;
    int k = 21;
    assertEquals(936515743, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case31() {
    int w = 43;
    int h = 15;
    int k = 23;
    assertEquals(675733855, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case32() {
    int w = 24;
    int h = 24;
    int k = 2;
    assertEquals(671739533, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case33() {
    int w = 39;
    int h = 14;
    int k = 16;
    assertEquals(481294962, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case34() {
    int w = 21;
    int h = 25;
    int k = 19;
    assertEquals(218730215, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case35() {
    int w = 12;
    int h = 49;
    int k = 5;
    assertEquals(179229393, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case36() {
    int w = 45;
    int h = 6;
    int k = 38;
    assertEquals(164259191, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case37() {
    int w = 39;
    int h = 35;
    int k = 18;
    assertEquals(548296079, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case38() {
    int w = 46;
    int h = 15;
    int k = 27;
    assertEquals(91927671, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case39() {
    int w = 10;
    int h = 44;
    int k = 7;
    assertEquals(735940928, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case40() {
    int w = 15;
    int h = 10;
    int k = 14;
    assertEquals(482084640, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case41() {
    int w = 49;
    int h = 6;
    int k = 36;
    assertEquals(914876095, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case42() {
    int w = 44;
    int h = 22;
    int k = 34;
    assertEquals(701421808, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case43() {
    int w = 45;
    int h = 29;
    int k = 27;
    assertEquals(318744893, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case44() {
    int w = 40;
    int h = 40;
    int k = 33;
    assertEquals(312758978, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case45() {
    int w = 42;
    int h = 24;
    int k = 29;
    assertEquals(289635826, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case46() {
    int w = 47;
    int h = 26;
    int k = 35;
    assertEquals(447902488, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case47() {
    int w = 39;
    int h = 10;
    int k = 17;
    assertEquals(374614459, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case48() {
    int w = 41;
    int h = 12;
    int k = 22;
    assertEquals(834618603, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case49() {
    int w = 35;
    int h = 21;
    int k = 4;
    assertEquals(482134196, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case50() {
    int w = 33;
    int h = 39;
    int k = 7;
    assertEquals(864607600, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case51() {
    int w = 48;
    int h = 38;
    int k = 48;
    assertEquals(211888061, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case52() {
    int w = 18;
    int h = 5;
    int k = 1;
    assertEquals(955957503, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case53() {
    int w = 36;
    int h = 2;
    int k = 1;
    assertEquals(246336683, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case54() {
    int w = 20;
    int h = 27;
    int k = 14;
    assertEquals(928370940, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case55() {
    int w = 20;
    int h = 35;
    int k = 14;
    assertEquals(340463923, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case56() {
    int w = 35;
    int h = 43;
    int k = 11;
    assertEquals(86378826, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case57() {
    int w = 43;
    int h = 41;
    int k = 18;
    assertEquals(55222538, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case58() {
    int w = 27;
    int h = 6;
    int k = 26;
    assertEquals(147049069, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case59() {
    int w = 44;
    int h = 16;
    int k = 10;
    assertEquals(68964478, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case60() {
    int w = 48;
    int h = 40;
    int k = 44;
    assertEquals(939938014, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case61() {
    int w = 30;
    int h = 5;
    int k = 28;
    assertEquals(859768457, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case62() {
    int w = 40;
    int h = 11;
    int k = 1;
    assertEquals(216720791, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case63() {
    int w = 44;
    int h = 27;
    int k = 22;
    assertEquals(565058815, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case64() {
    int w = 48;
    int h = 38;
    int k = 25;
    assertEquals(952655565, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case65() {
    int w = 29;
    int h = 20;
    int k = 17;
    assertEquals(272635618, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case66() {
    int w = 33;
    int h = 21;
    int k = 32;
    assertEquals(48682013, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case67() {
    int w = 46;
    int h = 49;
    int k = 46;
    assertEquals(417794594, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case68() {
    int w = 27;
    int h = 44;
    int k = 6;
    assertEquals(956155233, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case69() {
    int w = 35;
    int h = 21;
    int k = 33;
    assertEquals(497283773, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case70() {
    int w = 47;
    int h = 24;
    int k = 46;
    assertEquals(919491080, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case71() {
    int w = 28;
    int h = 25;
    int k = 17;
    assertEquals(788105544, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case72() {
    int w = 29;
    int h = 29;
    int k = 7;
    assertEquals(345872887, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case73() {
    int w = 20;
    int h = 47;
    int k = 18;
    assertEquals(385728449, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case74() {
    int w = 15;
    int h = 34;
    int k = 3;
    assertEquals(886405943, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case75() {
    int w = 32;
    int h = 3;
    int k = 17;
    assertEquals(926357119, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case76() {
    int w = 29;
    int h = 17;
    int k = 9;
    assertEquals(679582522, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case77() {
    int w = 43;
    int h = 22;
    int k = 21;
    assertEquals(161481729, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case78() {
    int w = 9;
    int h = 7;
    int k = 3;
    assertEquals(952392526, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case79() {
    int w = 47;
    int h = 32;
    int k = 20;
    assertEquals(407959737, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case80() {
    int w = 49;
    int h = 4;
    int k = 44;
    assertEquals(295972292, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case81() {
    int w = 39;
    int h = 34;
    int k = 5;
    assertEquals(311372000, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case82() {
    int w = 33;
    int h = 44;
    int k = 14;
    assertEquals(915333816, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case83() {
    int w = 5;
    int h = 50;
    int k = 2;
    assertEquals(402339917, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case84() {
    int w = 23;
    int h = 11;
    int k = 20;
    assertEquals(326809311, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case85() {
    int w = 42;
    int h = 32;
    int k = 18;
    assertEquals(912682929, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case86() {
    int w = 24;
    int h = 5;
    int k = 24;
    assertEquals(674935388, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case87() {
    int w = 44;
    int h = 9;
    int k = 6;
    assertEquals(881367659, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case88() {
    int w = 21;
    int h = 19;
    int k = 13;
    assertEquals(550761840, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case89() {
    int w = 49;
    int h = 23;
    int k = 8;
    assertEquals(445590405, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case90() {
    int w = 19;
    int h = 7;
    int k = 1;
    assertEquals(67049563, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case91() {
    int w = 39;
    int h = 27;
    int k = 21;
    assertEquals(759152641, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case92() {
    int w = 35;
    int h = 3;
    int k = 31;
    assertEquals(254887395, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case93() {
    int w = 5;
    int h = 26;
    int k = 5;
    assertEquals(601868906, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case94() {
    int w = 47;
    int h = 10;
    int k = 25;
    assertEquals(344837176, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case95() {
    int w = 49;
    int h = 1;
    int k = 42;
    assertEquals(94206927, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case96() {
    int w = 46;
    int h = 7;
    int k = 11;
    assertEquals(998595812, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case97() {
    int w = 42;
    int h = 6;
    int k = 34;
    assertEquals(553996431, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case98() {
    int w = 26;
    int h = 40;
    int k = 1;
    assertEquals(761890566, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case99() {
    int w = 47;
    int h = 25;
    int k = 13;
    assertEquals(34799949, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case100() {
    int w = 27;
    int h = 46;
    int k = 16;
    assertEquals(305181494, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case101() {
    int w = 48;
    int h = 31;
    int k = 32;
    assertEquals(39006546, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case102() {
    int w = 44;
    int h = 21;
    int k = 14;
    assertEquals(435658969, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case103() {
    int w = 38;
    int h = 22;
    int k = 29;
    assertEquals(837893796, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case104() {
    int w = 32;
    int h = 29;
    int k = 16;
    assertEquals(859361536, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case105() {
    int w = 24;
    int h = 9;
    int k = 6;
    assertEquals(644523200, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case106() {
    int w = 30;
    int h = 22;
    int k = 30;
    assertEquals(89419870, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case107() {
    int w = 50;
    int h = 5;
    int k = 3;
    assertEquals(420042817, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case108() {
    int w = 39;
    int h = 29;
    int k = 20;
    assertEquals(31507160, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case109() {
    int w = 7;
    int h = 16;
    int k = 2;
    assertEquals(206268304, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case110() {
    int w = 46;
    int h = 18;
    int k = 27;
    assertEquals(206101859, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case111() {
    int w = 37;
    int h = 19;
    int k = 6;
    assertEquals(369521450, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case112() {
    int w = 19;
    int h = 13;
    int k = 14;
    assertEquals(114341966, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case113() {
    int w = 25;
    int h = 3;
    int k = 9;
    assertEquals(113819288, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case114() {
    int w = 31;
    int h = 46;
    int k = 15;
    assertEquals(144830604, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case115() {
    int w = 31;
    int h = 9;
    int k = 20;
    assertEquals(975887637, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case116() {
    int w = 8;
    int h = 21;
    int k = 1;
    assertEquals(875873158, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case117() {
    int w = 44;
    int h = 48;
    int k = 44;
    assertEquals(942955760, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case118() {
    int w = 34;
    int h = 14;
    int k = 8;
    assertEquals(472763486, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case119() {
    int w = 49;
    int h = 18;
    int k = 31;
    assertEquals(170587802, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case120() {
    int w = 46;
    int h = 48;
    int k = 15;
    assertEquals(871992056, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case121() {
    int w = 49;
    int h = 4;
    int k = 36;
    assertEquals(366419017, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case122() {
    int w = 43;
    int h = 34;
    int k = 5;
    assertEquals(904465261, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case123() {
    int w = 38;
    int h = 44;
    int k = 11;
    assertEquals(917275057, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case124() {
    int w = 33;
    int h = 47;
    int k = 11;
    assertEquals(816381674, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case125() {
    int w = 44;
    int h = 41;
    int k = 19;
    assertEquals(623651007, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case126() {
    int w = 38;
    int h = 7;
    int k = 14;
    assertEquals(911507767, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case127() {
    int w = 30;
    int h = 38;
    int k = 24;
    assertEquals(638196420, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case128() {
    int w = 49;
    int h = 3;
    int k = 44;
    assertEquals(823185529, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case129() {
    int w = 35;
    int h = 10;
    int k = 1;
    assertEquals(526144858, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case130() {
    int w = 43;
    int h = 44;
    int k = 1;
    assertEquals(168971720, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case131() {
    int w = 1;
    int h = 27;
    int k = 1;
    assertEquals(28, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case132() {
    int w = 42;
    int h = 38;
    int k = 8;
    assertEquals(891983609, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case133() {
    int w = 48;
    int h = 25;
    int k = 19;
    assertEquals(85042131, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case134() {
    int w = 40;
    int h = 16;
    int k = 8;
    assertEquals(572621259, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case135() {
    int w = 24;
    int h = 42;
    int k = 5;
    assertEquals(101904761, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case136() {
    int w = 22;
    int h = 33;
    int k = 12;
    assertEquals(577676589, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case137() {
    int w = 16;
    int h = 1;
    int k = 12;
    assertEquals(3524513, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case138() {
    int w = 43;
    int h = 33;
    int k = 40;
    assertEquals(329294845, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case139() {
    int w = 30;
    int h = 47;
    int k = 5;
    assertEquals(337637190, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case140() {
    int w = 39;
    int h = 36;
    int k = 36;
    assertEquals(49889383, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case141() {
    int w = 35;
    int h = 6;
    int k = 10;
    assertEquals(410250815, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case142() {
    int w = 26;
    int h = 14;
    int k = 4;
    assertEquals(670451582, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case143() {
    int w = 31;
    int h = 18;
    int k = 28;
    assertEquals(265222851, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case144() {
    int w = 37;
    int h = 49;
    int k = 32;
    assertEquals(362916534, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case145() {
    int w = 46;
    int h = 42;
    int k = 35;
    assertEquals(787110412, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case146() {
    int w = 35;
    int h = 37;
    int k = 29;
    assertEquals(16373381, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case147() {
    int w = 22;
    int h = 15;
    int k = 9;
    assertEquals(687480309, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case148() {
    int w = 42;
    int h = 3;
    int k = 25;
    assertEquals(715579780, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case149() {
    int w = 48;
    int h = 5;
    int k = 9;
    assertEquals(557998430, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case150() {
    int w = 45;
    int h = 8;
    int k = 35;
    assertEquals(520607305, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case151() {
    int w = 48;
    int h = 12;
    int k = 26;
    assertEquals(960540959, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case152() {
    int w = 30;
    int h = 13;
    int k = 7;
    assertEquals(176027878, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case153() {
    int w = 35;
    int h = 22;
    int k = 12;
    assertEquals(384377688, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case154() {
    int w = 47;
    int h = 10;
    int k = 10;
    assertEquals(895646169, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case155() {
    int w = 40;
    int h = 34;
    int k = 5;
    assertEquals(73943471, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case156() {
    int w = 33;
    int h = 36;
    int k = 6;
    assertEquals(78747156, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case157() {
    int w = 30;
    int h = 47;
    int k = 9;
    assertEquals(398957235, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case158() {
    int w = 49;
    int h = 34;
    int k = 44;
    assertEquals(742371065, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case159() {
    int w = 11;
    int h = 26;
    int k = 3;
    assertEquals(368382950, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case160() {
    int w = 48;
    int h = 50;
    int k = 40;
    assertEquals(40308775, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case161() {
    int w = 47;
    int h = 50;
    int k = 41;
    assertEquals(92850214, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case162() {
    int w = 45;
    int h = 47;
    int k = 24;
    assertEquals(860893795, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case163() {
    int w = 49;
    int h = 47;
    int k = 30;
    assertEquals(591335981, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case164() {
    int w = 46;
    int h = 46;
    int k = 33;
    assertEquals(840110311, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case165() {
    int w = 47;
    int h = 50;
    int k = 14;
    assertEquals(632295723, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case166() {
    int w = 48;
    int h = 45;
    int k = 8;
    assertEquals(784839805, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case167() {
    int w = 50;
    int h = 45;
    int k = 43;
    assertEquals(6088545, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case168() {
    int w = 48;
    int h = 48;
    int k = 17;
    assertEquals(793179184, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case169() {
    int w = 48;
    int h = 47;
    int k = 46;
    assertEquals(254760344, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case170() {
    int w = 45;
    int h = 46;
    int k = 40;
    assertEquals(222861600, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case171() {
    int w = 50;
    int h = 45;
    int k = 21;
    assertEquals(361656963, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case172() {
    int w = 48;
    int h = 45;
    int k = 48;
    assertEquals(840227117, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case173() {
    int w = 50;
    int h = 47;
    int k = 41;
    assertEquals(447089850, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case174() {
    int w = 47;
    int h = 49;
    int k = 39;
    assertEquals(238972955, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case175() {
    int w = 49;
    int h = 46;
    int k = 42;
    assertEquals(74798210, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case176() {
    int w = 46;
    int h = 45;
    int k = 17;
    assertEquals(578814225, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case177() {
    int w = 47;
    int h = 49;
    int k = 40;
    assertEquals(80475345, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case178() {
    int w = 45;
    int h = 49;
    int k = 21;
    assertEquals(92903800, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case179() {
    int w = 48;
    int h = 48;
    int k = 4;
    assertEquals(282743411, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case180() {
    int w = 48;
    int h = 47;
    int k = 2;
    assertEquals(242208060, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case181() {
    int w = 45;
    int h = 50;
    int k = 18;
    assertEquals(533936012, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case182() {
    int w = 47;
    int h = 46;
    int k = 5;
    assertEquals(87692265, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case183() {
    int w = 47;
    int h = 49;
    int k = 45;
    assertEquals(590164755, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case184() {
    int w = 49;
    int h = 48;
    int k = 43;
    assertEquals(852486670, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case185() {
    int w = 50;
    int h = 48;
    int k = 42;
    assertEquals(971818323, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case186() {
    int w = 46;
    int h = 45;
    int k = 16;
    assertEquals(133553480, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case187() {
    int w = 48;
    int h = 45;
    int k = 22;
    assertEquals(661433485, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case188() {
    int w = 49;
    int h = 45;
    int k = 38;
    assertEquals(979969099, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case189() {
    int w = 47;
    int h = 47;
    int k = 43;
    assertEquals(756499746, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case190() {
    int w = 45;
    int h = 49;
    int k = 27;
    assertEquals(254416013, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case191() {
    int w = 50;
    int h = 49;
    int k = 47;
    assertEquals(116403450, bricksn.countStructures(w, h, k));
  }

  @Test
  public void case192() {
    int w = 50;
    int h = 50;
    int k = 27;
    assertEquals(607410160, bricksn.countStructures(w, h, k));
  }

}
