package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CarelessSecretaryTest {
  CarelessSecretary carelesssecretary = new CarelessSecretary();

  @Test
  public void case1() {
    int N = 2;
    int K = 1;
    assertEquals(1, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case2() {
    int N = 3;
    int K = 1;
    assertEquals(4, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case3() {
    int N = 9;
    int K = 9;
    assertEquals(133496, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case4() {
    int N = 5;
    int K = 1;
    assertEquals(96, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case5() {
    int N = 6;
    int K = 2;
    assertEquals(504, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case6() {
    int N = 3;
    int K = 3;
    assertEquals(2, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case7() {
    int N = 7;
    int K = 4;
    assertEquals(2790, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case8() {
    int N = 9;
    int K = 1;
    assertEquals(322560, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case9() {
    int N = 4;
    int K = 2;
    assertEquals(14, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case10() {
    int N = 3;
    int K = 2;
    assertEquals(3, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case11() {
    int N = 35;
    int K = 7;
    assertEquals(165264376, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case12() {
    int N = 12;
    int K = 7;
    assertEquals(264398280, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case13() {
    int N = 39;
    int K = 2;
    assertEquals(853640439, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case14() {
    int N = 82;
    int K = 8;
    assertEquals(816228267, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case15() {
    int N = 8;
    int K = 1;
    assertEquals(35280, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case16() {
    int N = 28;
    int K = 8;
    assertEquals(325247893, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case17() {
    int N = 28;
    int K = 10;
    assertEquals(545742228, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case18() {
    int N = 34;
    int K = 6;
    assertEquals(549243636, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case19() {
    int N = 22;
    int K = 8;
    assertEquals(233312314, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case20() {
    int N = 80;
    int K = 5;
    assertEquals(885821017, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case21() {
    int N = 57;
    int K = 9;
    assertEquals(499972457, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case22() {
    int N = 38;
    int K = 2;
    assertEquals(286941793, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case23() {
    int N = 44;
    int K = 9;
    assertEquals(48254687, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case24() {
    int N = 15;
    int K = 9;
    assertEquals(607719663, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case25() {
    int N = 52;
    int K = 2;
    assertEquals(769124764, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case26() {
    int N = 46;
    int K = 9;
    assertEquals(802141913, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case27() {
    int N = 3;
    int K = 2;
    assertEquals(3, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case28() {
    int N = 12;
    int K = 9;
    assertEquals(224406930, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case29() {
    int N = 36;
    int K = 4;
    assertEquals(382568184, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case30() {
    int N = 4;
    int K = 3;
    assertEquals(11, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case31() {
    int N = 16;
    int K = 5;
    assertEquals(285736828, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case32() {
    int N = 20;
    int K = 4;
    assertEquals(969845951, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case33() {
    int N = 56;
    int K = 1;
    assertEquals(805995337, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case34() {
    int N = 30;
    int K = 3;
    assertEquals(711564780, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case35() {
    int N = 88;
    int K = 2;
    assertEquals(813089172, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case36() {
    int N = 100;
    int K = 9;
    assertEquals(26120004, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case37() {
    int N = 4;
    int K = 1;
    assertEquals(18, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case38() {
    int N = 9;
    int K = 9;
    assertEquals(133496, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case39() {
    int N = 15;
    int K = 2;
    assertEquals(544798427, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case40() {
    int N = 50;
    int K = 2;
    assertEquals(492932547, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case41() {
    int N = 454;
    int K = 6;
    assertEquals(264783526, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case42() {
    int N = 435;
    int K = 5;
    assertEquals(707553019, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case43() {
    int N = 1;
    int K = 1;
    assertEquals(0, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case44() {
    int N = 551;
    int K = 2;
    assertEquals(14453556, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case45() {
    int N = 956;
    int K = 5;
    assertEquals(859696510, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case46() {
    int N = 554;
    int K = 3;
    assertEquals(253845022, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case47() {
    int N = 744;
    int K = 3;
    assertEquals(206947598, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case48() {
    int N = 552;
    int K = 8;
    assertEquals(56551377, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case49() {
    int N = 409;
    int K = 5;
    assertEquals(537704585, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case50() {
    int N = 127;
    int K = 4;
    assertEquals(618115958, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case51() {
    int N = 584;
    int K = 8;
    assertEquals(321140008, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case52() {
    int N = 335;
    int K = 10;
    assertEquals(521902250, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case53() {
    int N = 438;
    int K = 9;
    assertEquals(837019405, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case54() {
    int N = 300;
    int K = 3;
    assertEquals(327737405, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case55() {
    int N = 620;
    int K = 9;
    assertEquals(578650164, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case56() {
    int N = 198;
    int K = 4;
    assertEquals(516897588, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case57() {
    int N = 234;
    int K = 9;
    assertEquals(74500773, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case58() {
    int N = 48;
    int K = 4;
    assertEquals(809901475, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case59() {
    int N = 161;
    int K = 5;
    assertEquals(600697191, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case60() {
    int N = 129;
    int K = 10;
    assertEquals(866029002, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case61() {
    int N = 532;
    int K = 6;
    assertEquals(316241268, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case62() {
    int N = 208;
    int K = 10;
    assertEquals(869800440, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case63() {
    int N = 996;
    int K = 10;
    assertEquals(160364229, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case64() {
    int N = 369;
    int K = 4;
    assertEquals(262374292, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case65() {
    int N = 919;
    int K = 3;
    assertEquals(79877109, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case66() {
    int N = 674;
    int K = 10;
    assertEquals(90244251, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case67() {
    int N = 632;
    int K = 9;
    assertEquals(980800698, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case68() {
    int N = 701;
    int K = 3;
    assertEquals(513106734, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case69() {
    int N = 913;
    int K = 4;
    assertEquals(39212854, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case70() {
    int N = 808;
    int K = 3;
    assertEquals(120406126, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case71() {
    int N = 714;
    int K = 9;
    assertEquals(466134693, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case72() {
    int N = 290;
    int K = 4;
    assertEquals(952802197, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case73() {
    int N = 231;
    int K = 1;
    assertEquals(402927102, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case74() {
    int N = 742;
    int K = 1;
    assertEquals(316005800, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case75() {
    int N = 279;
    int K = 1;
    assertEquals(994114427, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case76() {
    int N = 613;
    int K = 4;
    assertEquals(473211301, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case77() {
    int N = 598;
    int K = 1;
    assertEquals(958575611, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case78() {
    int N = 546;
    int K = 3;
    assertEquals(520095478, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case79() {
    int N = 730;
    int K = 5;
    assertEquals(81533245, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case80() {
    int N = 390;
    int K = 8;
    assertEquals(121386928, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case81() {
    int N = 937;
    int K = 4;
    assertEquals(197578635, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case82() {
    int N = 528;
    int K = 4;
    assertEquals(917417043, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case83() {
    int N = 292;
    int K = 10;
    assertEquals(603021680, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case84() {
    int N = 174;
    int K = 3;
    assertEquals(550385207, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case85() {
    int N = 631;
    int K = 5;
    assertEquals(750126965, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case86() {
    int N = 564;
    int K = 1;
    assertEquals(144546026, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case87() {
    int N = 947;
    int K = 4;
    assertEquals(599997623, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case88() {
    int N = 918;
    int K = 8;
    assertEquals(702131681, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case89() {
    int N = 147;
    int K = 9;
    assertEquals(767319001, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case90() {
    int N = 456;
    int K = 2;
    assertEquals(867928804, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case91() {
    int N = 1;
    int K = 1;
    assertEquals(0, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case92() {
    int N = 10;
    int K = 10;
    assertEquals(1334961, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case93() {
    int N = 1000;
    int K = 10;
    assertEquals(487930807, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case94() {
    int N = 1000;
    int K = 9;
    assertEquals(325212876, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case95() {
    int N = 1000;
    int K = 8;
    assertEquals(389510806, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case96() {
    int N = 2;
    int K = 2;
    assertEquals(1, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case97() {
    int N = 271;
    int K = 11;
    assertEquals(575654024, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case98() {
    int N = 138;
    int K = 11;
    assertEquals(878192827, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case99() {
    int N = 918;
    int K = 12;
    assertEquals(265160497, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case100() {
    int N = 471;
    int K = 12;
    assertEquals(618229700, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case101() {
    int N = 110;
    int K = 12;
    assertEquals(105989846, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case102() {
    int N = 28;
    int K = 11;
    assertEquals(301237487, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case103() {
    int N = 861;
    int K = 11;
    assertEquals(377628194, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case104() {
    int N = 147;
    int K = 12;
    assertEquals(311361157, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case105() {
    int N = 613;
    int K = 11;
    assertEquals(210780205, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case106() {
    int N = 443;
    int K = 11;
    assertEquals(8952148, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case107() {
    int N = 938;
    int K = 11;
    assertEquals(189358954, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case108() {
    int N = 699;
    int K = 12;
    assertEquals(611843088, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case109() {
    int N = 330;
    int K = 12;
    assertEquals(57063700, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case110() {
    int N = 682;
    int K = 11;
    assertEquals(730990318, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case111() {
    int N = 994;
    int K = 11;
    assertEquals(825241079, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case112() {
    int N = 418;
    int K = 12;
    assertEquals(147766199, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case113() {
    int N = 51;
    int K = 11;
    assertEquals(708277193, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case114() {
    int N = 417;
    int K = 11;
    assertEquals(633487548, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case115() {
    int N = 367;
    int K = 12;
    assertEquals(152623713, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case116() {
    int N = 587;
    int K = 11;
    assertEquals(316002078, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case117() {
    int N = 1000;
    int K = 12;
    assertEquals(981713415, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case118() {
    int N = 999;
    int K = 12;
    assertEquals(244490877, carelesssecretary.howMany(N, K));
  }

  @Test
  public void case119() {
    int N = 265;
    int K = 7;
    assertEquals(334136939, carelesssecretary.howMany(N, K));
  }

}
