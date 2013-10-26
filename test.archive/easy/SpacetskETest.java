package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SpacetskETest {
  SpacetskE spacetske = new SpacetskE();

  @Test
  public void case1() {
    int L = 1;
    int H = 1;
    int K = 2;
    assertEquals(4, spacetske.countsets(L, H, K));
  }

  @Test
  public void case2() {
    int L = 1;
    int H = 1;
    int K = 1;
    assertEquals(4, spacetske.countsets(L, H, K));
  }

  @Test
  public void case3() {
    int L = 2;
    int H = 2;
    int K = 1;
    assertEquals(9, spacetske.countsets(L, H, K));
  }

  @Test
  public void case4() {
    int L = 2;
    int H = 2;
    int K = 2;
    assertEquals(23, spacetske.countsets(L, H, K));
  }

  @Test
  public void case5() {
    int L = 5;
    int H = 5;
    int K = 3;
    assertEquals(202, spacetske.countsets(L, H, K));
  }

  @Test
  public void case6() {
    int L = 10;
    int H = 8;
    int K = 6;
    assertEquals(1502, spacetske.countsets(L, H, K));
  }

  @Test
  public void case7() {
    int L = 200;
    int H = 200;
    int K = 100;
    assertEquals(517966361, spacetske.countsets(L, H, K));
  }

  @Test
  public void case8() {
    int L = 200;
    int H = 200;
    int K = 200;
    assertEquals(40805, spacetske.countsets(L, H, K));
  }

  @Test
  public void case9() {
    int L = 1;
    int H = 200;
    int K = 200;
    assertEquals(402, spacetske.countsets(L, H, K));
  }

  @Test
  public void case10() {
    int L = 200;
    int H = 1;
    int K = 200;
    assertEquals(0, spacetske.countsets(L, H, K));
  }

  @Test
  public void case11() {
    int L = 1;
    int H = 1;
    int K = 200;
    assertEquals(0, spacetske.countsets(L, H, K));
  }

  @Test
  public void case12() {
    int L = 200;
    int H = 200;
    int K = 1;
    assertEquals(40401, spacetske.countsets(L, H, K));
  }

  @Test
  public void case13() {
    int L = 1;
    int H = 200;
    int K = 1;
    assertEquals(402, spacetske.countsets(L, H, K));
  }

  @Test
  public void case14() {
    int L = 200;
    int H = 1;
    int K = 1;
    assertEquals(402, spacetske.countsets(L, H, K));
  }

  @Test
  public void case15() {
    int L = 1;
    int H = 1;
    int K = 1;
    assertEquals(4, spacetske.countsets(L, H, K));
  }

  @Test
  public void case16() {
    int L = 200;
    int H = 200;
    int K = 114;
    assertEquals(203920813, spacetske.countsets(L, H, K));
  }

  @Test
  public void case17() {
    int L = 200;
    int H = 200;
    int K = 173;
    assertEquals(138294213, spacetske.countsets(L, H, K));
  }

  @Test
  public void case18() {
    int L = 200;
    int H = 200;
    int K = 174;
    assertEquals(343589215, spacetske.countsets(L, H, K));
  }

  @Test
  public void case19() {
    int L = 200;
    int H = 200;
    int K = 148;
    assertEquals(824534898, spacetske.countsets(L, H, K));
  }

  @Test
  public void case20() {
    int L = 200;
    int H = 200;
    int K = 2;
    assertEquals(30011900, spacetske.countsets(L, H, K));
  }

  @Test
  public void case21() {
    int L = 200;
    int H = 200;
    int K = 130;
    assertEquals(130039306, spacetske.countsets(L, H, K));
  }

  @Test
  public void case22() {
    int L = 200;
    int H = 200;
    int K = 139;
    assertEquals(337785121, spacetske.countsets(L, H, K));
  }

  @Test
  public void case23() {
    int L = 200;
    int H = 200;
    int K = 184;
    assertEquals(267368674, spacetske.countsets(L, H, K));
  }

  @Test
  public void case24() {
    int L = 200;
    int H = 200;
    int K = 102;
    assertEquals(564238831, spacetske.countsets(L, H, K));
  }

  @Test
  public void case25() {
    int L = 200;
    int H = 200;
    int K = 160;
    assertEquals(569965212, spacetske.countsets(L, H, K));
  }

  @Test
  public void case26() {
    int L = 67;
    int H = 90;
    int K = 177;
    assertEquals(0, spacetske.countsets(L, H, K));
  }

  @Test
  public void case27() {
    int L = 162;
    int H = 124;
    int K = 119;
    assertEquals(909800140, spacetske.countsets(L, H, K));
  }

  @Test
  public void case28() {
    int L = 193;
    int H = 66;
    int K = 82;
    assertEquals(0, spacetske.countsets(L, H, K));
  }

  @Test
  public void case29() {
    int L = 30;
    int H = 28;
    int K = 131;
    assertEquals(0, spacetske.countsets(L, H, K));
  }

  @Test
  public void case30() {
    int L = 70;
    int H = 52;
    int K = 18;
    assertEquals(296314116, spacetske.countsets(L, H, K));
  }

  @Test
  public void case31() {
    int L = 178;
    int H = 94;
    int K = 71;
    assertEquals(810454039, spacetske.countsets(L, H, K));
  }

  @Test
  public void case32() {
    int L = 12;
    int H = 76;
    int K = 190;
    assertEquals(0, spacetske.countsets(L, H, K));
  }

  @Test
  public void case33() {
    int L = 13;
    int H = 100;
    int K = 190;
    assertEquals(0, spacetske.countsets(L, H, K));
  }

  @Test
  public void case34() {
    int L = 10;
    int H = 119;
    int K = 73;
    assertEquals(562046293, spacetske.countsets(L, H, K));
  }

  @Test
  public void case35() {
    int L = 151;
    int H = 129;
    int K = 77;
    assertEquals(588420568, spacetske.countsets(L, H, K));
  }

  @Test
  public void case36() {
    int L = 143;
    int H = 158;
    int K = 38;
    assertEquals(348751250, spacetske.countsets(L, H, K));
  }

  @Test
  public void case37() {
    int L = 141;
    int H = 98;
    int K = 4;
    assertEquals(180668731, spacetske.countsets(L, H, K));
  }

  @Test
  public void case38() {
    int L = 138;
    int H = 99;
    int K = 19;
    assertEquals(866933792, spacetske.countsets(L, H, K));
  }

  @Test
  public void case39() {
    int L = 121;
    int H = 129;
    int K = 44;
    assertEquals(277897384, spacetske.countsets(L, H, K));
  }

  @Test
  public void case40() {
    int L = 89;
    int H = 54;
    int K = 2;
    assertEquals(1272918, spacetske.countsets(L, H, K));
  }

  @Test
  public void case41() {
    int L = 161;
    int H = 194;
    int K = 20;
    assertEquals(663266971, spacetske.countsets(L, H, K));
  }

  @Test
  public void case42() {
    int L = 4;
    int H = 157;
    int K = 33;
    assertEquals(479801757, spacetske.countsets(L, H, K));
  }

  @Test
  public void case43() {
    int L = 149;
    int H = 9;
    int K = 36;
    assertEquals(0, spacetske.countsets(L, H, K));
  }

  @Test
  public void case44() {
    int L = 95;
    int H = 71;
    int K = 15;
    assertEquals(533591205, spacetske.countsets(L, H, K));
  }

  @Test
  public void case45() {
    int L = 89;
    int H = 185;
    int K = 43;
    assertEquals(788690037, spacetske.countsets(L, H, K));
  }

  @Test
  public void case46() {
    int L = 1;
    int H = 1;
    int K = 2;
    assertEquals(4, spacetske.countsets(L, H, K));
  }

  @Test
  public void case47() {
    int L = 1;
    int H = 1;
    int K = 1;
    assertEquals(4, spacetske.countsets(L, H, K));
  }

  @Test
  public void case48() {
    int L = 1;
    int H = 2;
    int K = 2;
    assertEquals(10, spacetske.countsets(L, H, K));
  }

  @Test
  public void case49() {
    int L = 1;
    int H = 3;
    int K = 1;
    assertEquals(8, spacetske.countsets(L, H, K));
  }

  @Test
  public void case50() {
    int L = 1;
    int H = 4;
    int K = 4;
    assertEquals(10, spacetske.countsets(L, H, K));
  }

  @Test
  public void case51() {
    int L = 1;
    int H = 5;
    int K = 4;
    assertEquals(30, spacetske.countsets(L, H, K));
  }

  @Test
  public void case52() {
    int L = 2;
    int H = 1;
    int K = 1;
    assertEquals(6, spacetske.countsets(L, H, K));
  }

  @Test
  public void case53() {
    int L = 2;
    int H = 2;
    int K = 1;
    assertEquals(9, spacetske.countsets(L, H, K));
  }

  @Test
  public void case54() {
    int L = 2;
    int H = 3;
    int K = 3;
    assertEquals(14, spacetske.countsets(L, H, K));
  }

  @Test
  public void case55() {
    int L = 2;
    int H = 4;
    int K = 4;
    assertEquals(15, spacetske.countsets(L, H, K));
  }

  @Test
  public void case56() {
    int L = 2;
    int H = 5;
    int K = 4;
    assertEquals(45, spacetske.countsets(L, H, K));
  }

  @Test
  public void case57() {
    int L = 3;
    int H = 1;
    int K = 1;
    assertEquals(8, spacetske.countsets(L, H, K));
  }

  @Test
  public void case58() {
    int L = 3;
    int H = 2;
    int K = 1;
    assertEquals(12, spacetske.countsets(L, H, K));
  }

  @Test
  public void case59() {
    int L = 3;
    int H = 3;
    int K = 1;
    assertEquals(16, spacetske.countsets(L, H, K));
  }

  @Test
  public void case60() {
    int L = 3;
    int H = 4;
    int K = 2;
    assertEquals(100, spacetske.countsets(L, H, K));
  }

  @Test
  public void case61() {
    int L = 3;
    int H = 5;
    int K = 5;
    assertEquals(24, spacetske.countsets(L, H, K));
  }

  @Test
  public void case62() {
    int L = 4;
    int H = 1;
    int K = 1;
    assertEquals(10, spacetske.countsets(L, H, K));
  }

  @Test
  public void case63() {
    int L = 4;
    int H = 2;
    int K = 1;
    assertEquals(15, spacetske.countsets(L, H, K));
  }

  @Test
  public void case64() {
    int L = 4;
    int H = 3;
    int K = 2;
    assertEquals(106, spacetske.countsets(L, H, K));
  }

  @Test
  public void case65() {
    int L = 4;
    int H = 4;
    int K = 3;
    assertEquals(88, spacetske.countsets(L, H, K));
  }

  @Test
  public void case66() {
    int L = 4;
    int H = 5;
    int K = 4;
    assertEquals(87, spacetske.countsets(L, H, K));
  }

  @Test
  public void case67() {
    int L = 5;
    int H = 1;
    int K = 1;
    assertEquals(12, spacetske.countsets(L, H, K));
  }

  @Test
  public void case68() {
    int L = 5;
    int H = 2;
    int K = 2;
    assertEquals(90, spacetske.countsets(L, H, K));
  }

  @Test
  public void case69() {
    int L = 5;
    int H = 3;
    int K = 1;
    assertEquals(24, spacetske.countsets(L, H, K));
  }

  @Test
  public void case70() {
    int L = 5;
    int H = 4;
    int K = 1;
    assertEquals(30, spacetske.countsets(L, H, K));
  }

  @Test
  public void case71() {
    int L = 5;
    int H = 5;
    int K = 1;
    assertEquals(36, spacetske.countsets(L, H, K));
  }

  @Test
  public void case72() {
    int L = 190;
    int H = 199;
    int K = 2;
    assertEquals(26855972, spacetske.countsets(L, H, K));
  }

  @Test
  public void case73() {
    int L = 200;
    int H = 190;
    int K = 3;
    assertEquals(511074661, spacetske.countsets(L, H, K));
  }

  @Test
  public void case74() {
    int L = 195;
    int H = 191;
    int K = 4;
    assertEquals(284265981, spacetske.countsets(L, H, K));
  }

  @Test
  public void case75() {
    int L = 191;
    int H = 196;
    int K = 5;
    assertEquals(710048046, spacetske.countsets(L, H, K));
  }

  @Test
  public void case76() {
    int L = 197;
    int H = 198;
    int K = 6;
    assertEquals(786327441, spacetske.countsets(L, H, K));
  }

  @Test
  public void case77() {
    int L = 193;
    int H = 200;
    int K = 7;
    assertEquals(99090937, spacetske.countsets(L, H, K));
  }

  @Test
  public void case78() {
    int L = 199;
    int H = 193;
    int K = 8;
    assertEquals(898059212, spacetske.countsets(L, H, K));
  }

  @Test
  public void case79() {
    int L = 197;
    int H = 193;
    int K = 9;
    assertEquals(657211695, spacetske.countsets(L, H, K));
  }

  @Test
  public void case80() {
    int L = 192;
    int H = 192;
    int K = 10;
    assertEquals(467235665, spacetske.countsets(L, H, K));
  }

  @Test
  public void case81() {
    int L = 194;
    int H = 193;
    int K = 11;
    assertEquals(999735483, spacetske.countsets(L, H, K));
  }

  @Test
  public void case82() {
    int L = 191;
    int H = 198;
    int K = 12;
    assertEquals(566307093, spacetske.countsets(L, H, K));
  }

  @Test
  public void case83() {
    int L = 197;
    int H = 193;
    int K = 13;
    assertEquals(48717751, spacetske.countsets(L, H, K));
  }

  @Test
  public void case84() {
    int L = 200;
    int H = 190;
    int K = 14;
    assertEquals(765435022, spacetske.countsets(L, H, K));
  }

  @Test
  public void case85() {
    int L = 190;
    int H = 194;
    int K = 15;
    assertEquals(425124561, spacetske.countsets(L, H, K));
  }

  @Test
  public void case86() {
    int L = 193;
    int H = 195;
    int K = 16;
    assertEquals(296845581, spacetske.countsets(L, H, K));
  }

  @Test
  public void case87() {
    int L = 191;
    int H = 199;
    int K = 17;
    assertEquals(791684200, spacetske.countsets(L, H, K));
  }

  @Test
  public void case88() {
    int L = 193;
    int H = 191;
    int K = 18;
    assertEquals(330491041, spacetske.countsets(L, H, K));
  }

  @Test
  public void case89() {
    int L = 199;
    int H = 199;
    int K = 19;
    assertEquals(513667931, spacetske.countsets(L, H, K));
  }

  @Test
  public void case90() {
    int L = 200;
    int H = 194;
    int K = 20;
    assertEquals(692800612, spacetske.countsets(L, H, K));
  }

  @Test
  public void case91() {
    int L = 200;
    int H = 200;
    int K = 3;
    assertEquals(565193480, spacetske.countsets(L, H, K));
  }

  @Test
  public void case92() {
    int L = 199;
    int H = 199;
    int K = 51;
    assertEquals(742317626, spacetske.countsets(L, H, K));
  }

}
