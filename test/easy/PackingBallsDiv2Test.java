package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PackingBallsDiv2Test {
  PackingBallsDiv2 packingballsdiv2 = new PackingBallsDiv2();

  @Test
  public void case1() {
    int R = 4;
    int G = 2;
    int B = 4;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case2() {
    int R = 1;
    int G = 7;
    int B = 1;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case3() {
    int R = 2;
    int G = 3;
    int B = 5;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case4() {
    int R = 78;
    int G = 53;
    int B = 64;
    assertEquals(66, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case5() {
    int R = 100;
    int G = 100;
    int B = 100;
    assertEquals(100, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case6() {
    int R = 1;
    int G = 1;
    int B = 1;
    assertEquals(1, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case7() {
    int R = 1;
    int G = 1;
    int B = 2;
    assertEquals(2, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case8() {
    int R = 1;
    int G = 1;
    int B = 3;
    assertEquals(2, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case9() {
    int R = 1;
    int G = 1;
    int B = 4;
    assertEquals(2, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case10() {
    int R = 1;
    int G = 1;
    int B = 5;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case11() {
    int R = 1;
    int G = 2;
    int B = 2;
    assertEquals(2, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case12() {
    int R = 1;
    int G = 2;
    int B = 3;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case13() {
    int R = 1;
    int G = 2;
    int B = 4;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case14() {
    int R = 1;
    int G = 2;
    int B = 5;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case15() {
    int R = 1;
    int G = 3;
    int B = 3;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case16() {
    int R = 1;
    int G = 3;
    int B = 4;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case17() {
    int R = 1;
    int G = 3;
    int B = 5;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case18() {
    int R = 1;
    int G = 4;
    int B = 4;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case19() {
    int R = 1;
    int G = 4;
    int B = 5;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case20() {
    int R = 1;
    int G = 5;
    int B = 5;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case21() {
    int R = 2;
    int G = 2;
    int B = 2;
    assertEquals(2, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case22() {
    int R = 2;
    int G = 2;
    int B = 3;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case23() {
    int R = 2;
    int G = 2;
    int B = 4;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case24() {
    int R = 2;
    int G = 2;
    int B = 5;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case25() {
    int R = 2;
    int G = 3;
    int B = 3;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case26() {
    int R = 2;
    int G = 3;
    int B = 4;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case27() {
    int R = 2;
    int G = 4;
    int B = 4;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case28() {
    int R = 2;
    int G = 4;
    int B = 5;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case29() {
    int R = 2;
    int G = 5;
    int B = 5;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case30() {
    int R = 3;
    int G = 3;
    int B = 3;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case31() {
    int R = 3;
    int G = 3;
    int B = 4;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case32() {
    int R = 3;
    int G = 3;
    int B = 5;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case33() {
    int R = 3;
    int G = 4;
    int B = 4;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case34() {
    int R = 3;
    int G = 4;
    int B = 5;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case35() {
    int R = 3;
    int G = 5;
    int B = 5;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case36() {
    int R = 4;
    int G = 4;
    int B = 4;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case37() {
    int R = 4;
    int G = 4;
    int B = 5;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case38() {
    int R = 4;
    int G = 5;
    int B = 5;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case39() {
    int R = 5;
    int G = 5;
    int B = 5;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case40() {
    int R = 5;
    int G = 8;
    int B = 6;
    assertEquals(7, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case41() {
    int R = 2;
    int G = 1;
    int B = 6;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case42() {
    int R = 9;
    int G = 10;
    int B = 8;
    assertEquals(10, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case43() {
    int R = 10;
    int G = 7;
    int B = 5;
    assertEquals(8, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case44() {
    int R = 2;
    int G = 5;
    int B = 4;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case45() {
    int R = 8;
    int G = 1;
    int B = 5;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case46() {
    int R = 8;
    int G = 2;
    int B = 1;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case47() {
    int R = 6;
    int G = 3;
    int B = 6;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case48() {
    int R = 10;
    int G = 3;
    int B = 9;
    assertEquals(8, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case49() {
    int R = 7;
    int G = 7;
    int B = 4;
    assertEquals(6, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case50() {
    int R = 28;
    int G = 88;
    int B = 56;
    assertEquals(58, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case51() {
    int R = 66;
    int G = 17;
    int B = 93;
    assertEquals(59, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case52() {
    int R = 5;
    int G = 4;
    int B = 82;
    assertEquals(31, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case53() {
    int R = 87;
    int G = 69;
    int B = 19;
    assertEquals(59, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case54() {
    int R = 30;
    int G = 91;
    int B = 98;
    assertEquals(74, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case55() {
    int R = 2;
    int G = 57;
    int B = 13;
    assertEquals(25, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case56() {
    int R = 46;
    int G = 30;
    int B = 52;
    assertEquals(43, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case57() {
    int R = 45;
    int G = 11;
    int B = 29;
    assertEquals(29, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case58() {
    int R = 94;
    int G = 43;
    int B = 65;
    assertEquals(68, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case59() {
    int R = 93;
    int G = 90;
    int B = 15;
    assertEquals(66, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case60() {
    int R = 64;
    int G = 70;
    int B = 20;
    assertEquals(52, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case61() {
    int R = 3;
    int G = 53;
    int B = 57;
    assertEquals(38, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case62() {
    int R = 69;
    int G = 95;
    int B = 40;
    assertEquals(69, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case63() {
    int R = 90;
    int G = 99;
    int B = 13;
    assertEquals(68, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case64() {
    int R = 41;
    int G = 42;
    int B = 51;
    assertEquals(45, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case65() {
    int R = 85;
    int G = 58;
    int B = 3;
    assertEquals(49, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case66() {
    int R = 15;
    int G = 41;
    int B = 46;
    assertEquals(35, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case67() {
    int R = 22;
    int G = 34;
    int B = 61;
    assertEquals(39, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case68() {
    int R = 14;
    int G = 93;
    int B = 17;
    assertEquals(42, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case69() {
    int R = 16;
    int G = 71;
    int B = 3;
    assertEquals(31, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case70() {
    int R = 79;
    int G = 72;
    int B = 97;
    assertEquals(83, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case71() {
    int R = 96;
    int G = 71;
    int B = 79;
    assertEquals(83, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case72() {
    int R = 100;
    int G = 76;
    int B = 84;
    assertEquals(87, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case73() {
    int R = 91;
    int G = 96;
    int B = 91;
    assertEquals(93, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case74() {
    int R = 72;
    int G = 99;
    int B = 100;
    assertEquals(91, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case75() {
    int R = 10;
    int G = 10;
    int B = 9;
    assertEquals(10, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case76() {
    int R = 3;
    int G = 3;
    int B = 2;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case77() {
    int R = 6;
    int G = 6;
    int B = 2;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case78() {
    int R = 75;
    int G = 50;
    int B = 61;
    assertEquals(63, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case79() {
    int R = 4;
    int G = 3;
    int B = 4;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case80() {
    int R = 65;
    int G = 65;
    int B = 65;
    assertEquals(65, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case81() {
    int R = 9;
    int G = 9;
    int B = 2;
    assertEquals(7, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case82() {
    int R = 2;
    int G = 3;
    int B = 30;
    assertEquals(12, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case83() {
    int R = 5;
    int G = 3;
    int B = 3;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case84() {
    int R = 62;
    int G = 62;
    int B = 62;
    assertEquals(62, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case85() {
    int R = 10;
    int G = 10;
    int B = 10;
    assertEquals(10, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case86() {
    int R = 3;
    int G = 2;
    int B = 3;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case87() {
    int R = 3;
    int G = 5;
    int B = 3;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case88() {
    int R = 7;
    int G = 7;
    int B = 6;
    assertEquals(7, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case89() {
    int R = 5;
    int G = 5;
    int B = 4;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case90() {
    int R = 2;
    int G = 1;
    int B = 1;
    assertEquals(2, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case91() {
    int R = 99;
    int G = 100;
    int B = 100;
    assertEquals(100, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case92() {
    int R = 9;
    int G = 10;
    int B = 10;
    assertEquals(10, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case93() {
    int R = 4;
    int G = 4;
    int B = 3;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case94() {
    int R = 12;
    int G = 13;
    int B = 13;
    assertEquals(13, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case95() {
    int R = 5;
    int G = 1;
    int B = 2;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case96() {
    int R = 5;
    int G = 6;
    int B = 6;
    assertEquals(6, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case97() {
    int R = 2;
    int G = 2;
    int B = 1;
    assertEquals(2, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case98() {
    int R = 1;
    int G = 3;
    int B = 1;
    assertEquals(2, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case99() {
    int R = 1;
    int G = 1;
    int B = 99;
    assertEquals(34, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case100() {
    int R = 78;
    int G = 53;
    int B = 63;
    assertEquals(65, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case101() {
    int R = 3;
    int G = 5;
    int B = 6;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case102() {
    int R = 60;
    int G = 61;
    int B = 61;
    assertEquals(61, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case103() {
    int R = 8;
    int G = 8;
    int B = 10;
    assertEquals(9, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case104() {
    int R = 11;
    int G = 11;
    int B = 1;
    assertEquals(8, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case105() {
    int R = 22;
    int G = 45;
    int B = 61;
    assertEquals(43, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case106() {
    int R = 8;
    int G = 8;
    int B = 1;
    assertEquals(6, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case107() {
    int R = 2;
    int G = 1;
    int B = 2;
    assertEquals(2, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case108() {
    int R = 6;
    int G = 4;
    int B = 4;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case109() {
    int R = 5;
    int G = 2;
    int B = 1;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case110() {
    int R = 92;
    int G = 90;
    int B = 90;
    assertEquals(91, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case111() {
    int R = 6;
    int G = 7;
    int B = 8;
    assertEquals(8, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case112() {
    int R = 100;
    int G = 89;
    int B = 20;
    assertEquals(70, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case113() {
    int R = 11;
    int G = 3;
    int B = 3;
    assertEquals(6, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case114() {
    int R = 9;
    int G = 9;
    int B = 11;
    assertEquals(10, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case115() {
    int R = 4;
    int G = 3;
    int B = 3;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case116() {
    int R = 3;
    int G = 4;
    int B = 3;
    assertEquals(4, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case117() {
    int R = 2;
    int G = 1;
    int B = 3;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case118() {
    int R = 17;
    int G = 19;
    int B = 20;
    assertEquals(19, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case119() {
    int R = 44;
    int G = 44;
    int B = 44;
    assertEquals(44, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case120() {
    int R = 20;
    int G = 20;
    int B = 1;
    assertEquals(14, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case121() {
    int R = 6;
    int G = 2;
    int B = 6;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case122() {
    int R = 12;
    int G = 11;
    int B = 99;
    assertEquals(41, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case123() {
    int R = 4;
    int G = 3;
    int B = 1;
    assertEquals(3, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case124() {
    int R = 3;
    int G = 6;
    int B = 5;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case125() {
    int R = 23;
    int G = 98;
    int B = 78;
    assertEquals(67, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case126() {
    int R = 8;
    int G = 6;
    int B = 6;
    assertEquals(7, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case127() {
    int R = 100;
    int G = 100;
    int B = 99;
    assertEquals(100, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case128() {
    int R = 99;
    int G = 3;
    int B = 3;
    assertEquals(35, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case129() {
    int R = 5;
    int G = 7;
    int B = 8;
    assertEquals(7, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case130() {
    int R = 12;
    int G = 12;
    int B = 14;
    assertEquals(13, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case131() {
    int R = 20;
    int G = 30;
    int B = 40;
    assertEquals(31, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case132() {
    int R = 99;
    int G = 96;
    int B = 1;
    assertEquals(66, packingballsdiv2.minPacks(R, G, B));
  }

  @Test
  public void case133() {
    int R = 4;
    int G = 3;
    int B = 7;
    assertEquals(5, packingballsdiv2.minPacks(R, G, B));
  }

}
