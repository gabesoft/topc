package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class SurveillanceSystemTest {
  SurveillanceSystem surveillancesystem = new SurveillanceSystem();

  @Test
  public void case1() {
    String containers = "-X--XX";
    int[] reports = { 1, 2 };
    int L = 3;
    assertEquals("??++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case2() {
    String containers = "-XXXXX-";
    int[] reports = { 2 };
    int L = 3;
    assertEquals("???-???", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case3() {
    String containers = "------X-XX-";
    int[] reports = { 3, 0, 2, 0 };
    int L = 5;
    assertEquals("++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case4() {
    String containers = "-XXXXX---X--";
    int[] reports = { 2, 1, 0, 1 };
    int L = 3;
    assertEquals("???-??++++??", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case5() {
    String containers = "-XX--X-XX-X-X--X---XX-X---XXXX-----X";
    int[] reports = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    int L = 7;
    assertEquals("???++++?++++++++++++++++++++??????--", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case6() {
    String containers = "X";
    int[] reports = { 1 };
    int L = 1;
    assertEquals("+", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case7() {
    String containers = "X-";
    int[] reports = { 1 };
    int L = 2;
    assertEquals("++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case8() {
    String containers = "XX";
    int[] reports = { 1, 1 };
    int L = 1;
    assertEquals("++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case9() {
    String containers = "--X-X--X----X--X-X-X----";
    int[] reports = { 7, 7, 7 };
    int L = 22;
    assertEquals("++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case10() {
    String containers = "---";
    int[] reports = { 0, 0 };
    int L = 2;
    assertEquals("+++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case11() {
    String containers = "-X-XXX-X-XXXX--XX-XX-X---XX----XX---X-XX--X-X-X-";
    int[] reports = { 11, 9 };
    int L = 18;
    assertEquals("?????????++++++++++++++++++++????---------------", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case12() {
    String containers = "-X--X---XX";
    int[] reports = { 3 };
    int L = 8;
    assertEquals("-?+++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case13() {
    String containers = "X--XX-X-----";
    int[] reports = { 3, 4, 2, 3, 3 };
    int L = 8;
    assertEquals("++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case14() {
    String containers = "---XXX----X---X-XX-X-XXXX-X-XX-XX-X-X--XX--X";
    int[] reports = { 19, 20, 21, 20, 20 };
    int L = 39;
    assertEquals("++++++++++++++++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case15() {
    String containers = "-X-X------X-XX-X-XX-----XXXX-X-X--X-X---XX";
    int[] reports = { 2, 3, 5, 5 };
    int L = 10;
    assertEquals("??++++++++??????????????????????????????--", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case16() {
    String containers = "XXXX--XXX-XXX-X--X-X---X-XXX----XXX-";
    int[] reports = { 9, 9, 11, 7, 7, 11, 8, 8, 7, 10 };
    int L = 17;
    assertEquals("+++++++++++++++++++++++++++++++++???", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case17() {
    String containers = "-XXXX-XXXX-XX-X-XXX-----XXX---X--X-X";
    int[] reports = { 3, 2, 1, 3, 4, 3, 1, 3, 2, 3 };
    int L = 4;
    assertEquals("????????????????????????????????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case18() {
    String containers = "-X--XX---XXXXXX-X--X-X";
    int[] reports = { 6 };
    int L = 11;
    assertEquals("-?++++++++++?---------", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case19() {
    String containers = "------X-XX-X-";
    int[] reports = { 1, 1, 0, 0, 1, 1 };
    int L = 2;
    assertEquals("?????????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case20() {
    String containers = "X-X-XX----XX-XXXXX-XX---XXX-X--X";
    int[] reports = { 14 };
    int L = 25;
    assertEquals("???????++++++++++++++++++???????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case21() {
    String containers = "X--X-XX--X--XX-X-X---X--XX--XX-X-XX--X--X-XX--X-X";
    int[] reports = { 5, 4, 4, 5, 3, 4, 4, 4, 5, 5, 3, 4, 4, 5, 4, 4, 5, 4, 5, 4, 5, 4, 4, 4, 4, 3, 4, 4, 5, 4, 3, 4, 4 };
    int L = 9;
    assertEquals("??????+++++++++++++++++++++++++++++++++++++??????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case22() {
    String containers = "-XX--X-X--";
    int[] reports = { 3, 2, 3, 2 };
    int L = 6;
    assertEquals("?+++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case23() {
    String containers = "---XX-X-XX---XX-X--X---XX--X-X--XXX----XX---X---X";
    int[] reports = { 11, 12, 13 };
    int L = 29;
    assertEquals("?????????????++++++++++++++++++++++++++??????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case24() {
    String containers = "-X-XX---";
    int[] reports = { 1, 2, 2, 1, 2 };
    int L = 3;
    assertEquals("+++++++-", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case25() {
    String containers = "X-XX-X---XXXXX-X----X------XXX";
    int[] reports = { 11, 10, 10, 10, 11 };
    int L = 25;
    assertEquals("++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case26() {
    String containers = "X--XX--XXX-XX-X-X-";
    int[] reports = { 7, 7, 8, 7, 7, 7, 7 };
    int L = 12;
    assertEquals("++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case27() {
    String containers = "-XX--";
    int[] reports = { 2, 1, 2 };
    int L = 3;
    assertEquals("+++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case28() {
    String containers = "--X------XX";
    int[] reports = { 2, 1, 1, 1, 0 };
    int L = 6;
    assertEquals("?++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case29() {
    String containers = "-X--XXX-XXX-X-X-X---X---X--X--X--X";
    int[] reports = { 14, 14 };
    int L = 32;
    assertEquals("?++++++++++++++++++++++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case30() {
    String containers = "-XX-XX-X-X---X-XX----XX-X-XXXX";
    int[] reports = { 4, 2, 1, 3, 1, 3, 2, 1, 2 };
    int L = 5;
    assertEquals("??????????+++????++++?????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case31() {
    String containers = "-X--XXX------XX-X-XXX-XX-XXXXXXX---X--XXX-";
    int[] reports = { 12, 15, 16, 16, 16, 16, 13, 15, 14, 16, 15, 14 };
    int L = 24;
    assertEquals("??++++++++++++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case32() {
    String containers = "-X---XX--X--X-XX--X--XX-XXXX-XX-XX--";
    int[] reports = { 3, 3, 4, 3, 4, 2, 2, 3, 3, 2, 1 };
    int L = 5;
    assertEquals("????????????????????????????????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case33() {
    String containers = "XXX--X";
    int[] reports = { 3 };
    int L = 5;
    assertEquals("?++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case34() {
    String containers = "XXX-----XXX-XXXX--XXXXXXX--XXX-XXX-X-X---X---";
    int[] reports = { 23, 22, 21 };
    int L = 35;
    assertEquals("????????+++++++++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case35() {
    String containers = "-X--XXXX----X-XXXX";
    int[] reports = { 3, 4 };
    int L = 6;
    assertEquals("?????????????????-", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case36() {
    String containers = "---X-XX-XX-X";
    int[] reports = { 2, 1, 1, 2, 0, 2, 2, 2 };
    int L = 3;
    assertEquals("++++++++++??", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case37() {
    String containers = "X-XX--XX--XXX-X-XXXX-XX--X-X-X---XXXX-------X--X--";
    int[] reports = { 19, 16, 19, 17, 20, 19, 16, 18 };
    int L = 36;
    assertEquals("---+++++++++++++++++++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case38() {
    String containers = "-XX--X-------XX--X-X-XX-X--X-X--XX-XX-X---X-XXX-X";
    int[] reports = { 18, 17, 19 };
    int L = 42;
    assertEquals("???++++++++++++++++++++++++++++++++++++++++++++??", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case39() {
    String containers = "--XXX--XX----X---XXX-XXXX----X-XXXX--XXXXX----X-XX";
    int[] reports = { 21, 23, 22, 23, 23, 22 };
    int L = 43;
    assertEquals("?+++++++++++++++++++++++++++++++++++++++++++++++??", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case40() {
    String containers = "X--------XX-X-X--XX-XXX--XX-XXXX-X-X-XX--";
    int[] reports = { 19, 19 };
    int L = 38;
    assertEquals("??+++++++++++++++++++++++++++++++++++++??", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case41() {
    String containers = "--X--X--X-X---X--XXX-";
    int[] reports = { 5, 6, 6, 5 };
    int L = 14;
    assertEquals("-?++++++++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case42() {
    String containers = "-X---X----X--XX-XXXXX-X-X----X-XX-X-X-X----X--XX-";
    int[] reports = { 2, 1, 2, 2, 1, 1, 3, 4, 2, 1, 2, 3, 1, 1, 2, 4, 1, 1, 2, 1, 1 };
    int L = 4;
    assertEquals("????????????????+++++????????????????????????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case43() {
    String containers = "-XX--XXXXXX-X-X-X-X-----X--X-XX--XX---XX--X-XXXX-";
    int[] reports = { 1, 0, 1, 2, 3, 2, 2, 1, 3, 1, 2, 1, 2, 2, 2, 2, 2, 4, 2, 3, 2, 2, 2, 2, 3, 2, 2, 2, 2, 4, 3, 2, 2, 4, 1, 2, 2, 1 };
    int L = 4;
    assertEquals("??+++?++++??++++++??++++++???++++++???++++???+???", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case44() {
    String containers = "-XX---X---XXX---XXX---X---XXXXXX-X-X-";
    int[] reports = { 6, 4, 4, 4, 4, 4 };
    int L = 10;
    assertEquals("-????????????????????????????????----", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case45() {
    String containers = "-X---X--XX-";
    int[] reports = { 4, 3, 3 };
    int L = 9;
    assertEquals("+++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case46() {
    String containers = "XXX----";
    int[] reports = { 2, 3, 1 };
    int L = 5;
    assertEquals("+++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case47() {
    String containers = "X------XX";
    int[] reports = { 3 };
    int L = 9;
    assertEquals("+++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case48() {
    String containers = "XXX--X-XX----X--X-X-X-XXX";
    int[] reports = { 5, 4, 6, 4, 4, 5, 7 };
    int L = 12;
    assertEquals("???????++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case49() {
    String containers = "-X-XXX---XX-X--";
    int[] reports = { 5, 5, 5, 5 };
    int L = 9;
    assertEquals("-++++++++++++--", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case50() {
    String containers = "X-X------X-XX";
    int[] reports = { 1, 1, 2, 1, 0, 1 };
    int L = 5;
    assertEquals("?++++++++++?-", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case51() {
    String containers = "-X------XXXXXX-X--XXX------XXX-";
    int[] reports = { 3, 3, 3, 3, 3, 6, 4, 7, 3, 7, 6, 2, 5, 5, 6, 6, 4, 6, 3, 3, 4, 3, 6 };
    int L = 9;
    assertEquals("+++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case52() {
    String containers = "XX--X-XXX-X--X-XXXXXX-XX--X-XX-X--X-XXX--X-X-";
    int[] reports = { 21 };
    int L = 34;
    assertEquals("----??++++++++++++++++++++++++++++++++??-----", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case53() {
    String containers = "X-X";
    int[] reports = { 1 };
    int L = 2;
    assertEquals("?+?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case54() {
    String containers = "X--X-X-XXX----X----";
    int[] reports = { 7, 6, 5 };
    int L = 15;
    assertEquals("+++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case55() {
    String containers = "-XX--X-X-XXXXX";
    int[] reports = { 4, 2, 3 };
    int L = 5;
    assertEquals("????+???++++?-", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case56() {
    String containers = "XXX-XX--XX--X--XX--X--X-X--XX---X--X--";
    int[] reports = { 6, 7, 6, 7, 6, 7, 7, 6, 6, 6, 7, 9, 8, 6, 7, 6, 7, 6, 9 };
    int L = 16;
    assertEquals("+++++++++++++++++++++++++++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case57() {
    String containers = "XX-XX---XXXXX--X---XX-----XX--XX---X--XXX-XX-XXX";
    int[] reports = { 6, 4, 7, 5, 6, 5, 4, 3, 6, 3, 8, 5, 4, 3, 4, 5, 6, 4, 4, 7, 4, 4, 6, 3, 3, 5, 6, 5, 6, 5, 6, 6, 6, 3, 2, 3 };
    int L = 10;
    assertEquals("++++++++++++++++++++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case58() {
    String containers = "X--XX-X---XX--XX-XXXX---X---X-X---X-----";
    int[] reports = { 14, 14, 12, 12, 14, 13 };
    int L = 31;
    assertEquals("-?+++++++++++++++++++++++++++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case59() {
    String containers = "XXXXXXXX-";
    int[] reports = { 6, 5 };
    int L = 6;
    assertEquals("??+++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case60() {
    String containers = "--X----X--X-X--XXX----XXXXXXX-X-XXXXX-";
    int[] reports = { 3, 2, 3, 2, 3, 4, 1, 4, 3, 2, 3, 4, 1, 1, 2, 1, 1, 1, 3, 4, 1, 0, 1, 2, 2, 2 };
    int L = 4;
    assertEquals("??+++++++?+?++??????????+++???????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case61() {
    String containers = "--X";
    int[] reports = { 0 };
    int L = 2;
    assertEquals("++-", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case62() {
    String containers = "---";
    int[] reports = { 0 };
    int L = 2;
    assertEquals("?+?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case63() {
    String containers = "-XXXX";
    int[] reports = { 1, 1 };
    int L = 1;
    assertEquals("-????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case64() {
    String containers = "-X-XX--------X-X-";
    int[] reports = { 1, 1 };
    int L = 7;
    assertEquals("----???+++++++?--", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case65() {
    String containers = "X---XXX-";
    int[] reports = { 0, 0, 1, 1, 0, 1, 0 };
    int L = 1;
    assertEquals("?+++???+", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case66() {
    String containers = "-XXXX-X-X---XXX-X---X-XXX";
    int[] reports = { 2, 3, 4, 5, 5 };
    int L = 7;
    assertEquals("?+++++++?????????????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case67() {
    String containers = "XX--XX---X-X--";
    int[] reports = { 2 };
    int L = 6;
    assertEquals("--????????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case68() {
    String containers = "X--X---X--XX---X----";
    int[] reports = { 5, 5, 6 };
    int L = 17;
    assertEquals("+++++++++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case69() {
    String containers = "XXXXX-X--XX-XXXX------X--X---XXX-XXXXXXX-XX-X-X-";
    int[] reports = { 19, 19, 19, 19 };
    int L = 35;
    assertEquals("??????++++++++++++++++++++++++++++++++??????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case70() {
    String containers = "XXX--XXXX-------XX-XX";
    int[] reports = { 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1 };
    int L = 1;
    assertEquals("?????????????????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case71() {
    String containers = "-X---X-XX------XX-XXX-X-XX-----XX---XX-X-";
    int[] reports = { 15, 15, 16, 14, 14 };
    int L = 35;
    assertEquals("?+++++++++++++++++++++++++++++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case72() {
    String containers = "-X-XXXXX-X--XX-X--XXX-XXX-X-X--XX";
    int[] reports = { 12, 14, 12, 13, 13, 15 };
    int L = 22;
    assertEquals("???++++++++++++++++++++++++++++??", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case73() {
    String containers = "---XXXX---";
    int[] reports = { 4, 4, 4 };
    int L = 7;
    assertEquals("?++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case74() {
    String containers = "--X----XX---X-XXX--XX--XX";
    int[] reports = { 7, 6, 8 };
    int L = 14;
    assertEquals("--???????++++++++++++????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case75() {
    String containers = "XX-X-XXXX-XXXXX---XXX-X-X-XXX";
    int[] reports = { 8, 6, 7, 9, 7, 7, 6, 6, 7, 7, 5, 7, 7, 8, 6 };
    int L = 10;
    assertEquals("?+++++++++++++++++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case76() {
    String containers = "X-XXX--XXX--XXXXXX----XX---XX-X-X---";
    int[] reports = { 9, 8, 6, 6, 10, 8, 9, 6, 9, 9, 6, 8, 8, 6, 11, 7, 9, 7, 10 };
    int L = 15;
    assertEquals("?+++++++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case77() {
    String containers = "---X-XXX-XXX-X-XX-";
    int[] reports = { 10 };
    int L = 17;
    assertEquals("?++++++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case78() {
    String containers = "X-X----X-XX--X--XX----XX--XXX-----XXX-";
    int[] reports = { 0, 1, 2, 0, 2, 1, 1, 1, 2, 1, 0, 0, 1, 2, 1, 1, 0, 1, 1 };
    int L = 2;
    assertEquals("??????????????????????????????????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case79() {
    String containers = "X---XX--X--X-XXX--XX---XXXXX--X---X-X-X-XXXXXX---";
    int[] reports = { 15, 16, 15, 14, 16, 15, 16, 15, 16, 17, 15, 14, 14, 14, 15, 16, 15, 15, 15, 17 };
    int L = 29;
    assertEquals("+++++++++++++++++++++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case80() {
    String containers = "XXXX-X--XX--X--XX-XX--X-X--X---X-XX";
    int[] reports = { 6, 5 };
    int L = 13;
    assertEquals("--???????????????????+++++++++?????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case81() {
    String containers = "--X--X---XXXXXX-----XX---XX-XX-";
    int[] reports = { 8, 7, 8, 8, 7, 7, 8, 7, 8, 8, 8, 8 };
    int L = 16;
    assertEquals("??+++++++++++++++++++++++++++?-", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case82() {
    String containers = "-X--XXX--XXXXX------X--X---XXXX--XX";
    int[] reports = { 16 };
    int L = 34;
    assertEquals("++++++++++++++++++++++++++++++++++-", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case83() {
    String containers = "-XX-------XX--";
    int[] reports = { 0, 2, 1, 0, 1, 2, 2, 0, 2 };
    int L = 4;
    assertEquals("?++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case84() {
    String containers = "XXX-------XX-X--X-X-XXX--XX";
    int[] reports = { 10, 10, 9 };
    int L = 22;
    assertEquals("?+++++++++++++++++++++++???", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case85() {
    String containers = "XX-X--XX--XXXX---XXX";
    int[] reports = { 2, 3, 1, 2, 2, 2, 3, 1, 1, 2 };
    int L = 4;
    assertEquals("??++++???????+++++??", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case86() {
    String containers = "XXX---X---X-X-";
    int[] reports = { 2, 1, 2, 2, 2, 3 };
    int L = 7;
    assertEquals("-?++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case87() {
    String containers = "XXXX----XXX";
    int[] reports = { 3, 4 };
    int L = 4;
    assertEquals("++++?--????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case88() {
    String containers = "--XXX-XXX---XX-XX--X-X---XXXX--XX--XXXX-X-X---";
    int[] reports = { 5, 6, 6, 4, 4, 4, 5, 5, 5, 4, 5, 6, 4, 5, 6, 5, 4, 5, 5, 5, 3, 5, 5, 6, 3, 5, 6, 5 };
    int L = 9;
    assertEquals("????????++++++++++++++++++++++??+??++++???????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case89() {
    String containers = "X--X---XXXX-XXX----XX--X-XXX-XXX--XX-XX-XX--X--XX-";
    int[] reports = { 20, 20 };
    int L = 37;
    assertEquals("???????????+++++++++++++++++++++++++++????????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case90() {
    String containers = "XXX-X-XXXX-XX-X-XXX---XX--X---XXXX---X-------XXX--";
    int[] reports = { 5, 2, 5, 6, 4, 7, 3, 5, 5, 9, 4, 5, 7, 6, 8, 5, 6, 2, 6, 6, 6, 4, 3, 7, 8, 9, 4, 5, 8, 4, 8, 6, 9, 9, 7 };
    int L = 12;
    assertEquals("+++++++++++++++++++++++++++++++++++++++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case91() {
    String containers = "XX-X-X-XX-X-XXX-X-X-X-XXXXX--X---XX---XXXXXXXXX--X";
    int[] reports = { 16, 18, 17, 18, 19, 17, 19, 19, 18, 17, 18 };
    int L = 30;
    assertEquals("???????++++++++++++++++++++++++++++++++++++++++???", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case92() {
    String containers = "--XXX--XX-X-XXX----X-X-X--X-XXX---XX---X-XX--XXX-X";
    int[] reports = { 6, 7, 5, 4, 7, 7, 6, 6, 6, 6, 6, 7, 6, 7, 5, 5, 8, 6, 6, 6, 6, 7, 7, 6, 7, 6, 9, 6, 8, 6, 5 };
    int L = 13;
    assertEquals("?+++++++++++++++++++++++++++++++++++++++++++++++??", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case93() {
    String containers = "--X--X--XXX--X---X-X-XX-X---X-XX-X-XXX---X--X-XX--";
    int[] reports = { 10, 12, 11, 10, 9, 10, 11, 10, 10, 10, 11, 11, 10, 10, 10, 11, 11, 9, 10, 11, 10, 12, 10, 10, 10, 10 };
    int L = 22;
    assertEquals("??+++++++++++++++++++++++++++++++++++++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case94() {
    String containers = "XXX-XXX-XXXX----XXX-X--XX-XX--XXX--X-X---X---X-X-X";
    int[] reports = { 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 0, 2, 2, 2, 1, 0, 0, 1, 1, 1, 1, 3, 2, 2, 1, 2, 2, 1, 2, 2, 3, 1, 1, 2, 1, 1, 2, 1, 1, 3, 3, 1, 3 };
    int L = 3;
    assertEquals("?????????++++++++??+++++???++++?+++++++++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case95() {
    String containers = "--X--XXX--XX-X--XX-XX------XX--XX-XX-XXXX----XXXX-";
    int[] reports = { 23 };
    int L = 46;
    assertEquals("-++++++++++++++++++++++++++++++++++++++++++++++---", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case96() {
    String containers = "--XXXX--XXXXX--X-X--X-XXXX-XXX-X-XXX-XX-X-X-XX-XX-";
    int[] reports = { 19, 17 };
    int L = 29;
    assertEquals("-????????????+++++++++++++++++++++++++++++????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case97() {
    String containers = "----XX---XXX--X-XX-XX--XX-X--XX-X-XX--XX-XXX-XX---";
    int[] reports = { 16, 20, 19, 20, 19, 19, 18, 18, 18 };
    int L = 34;
    assertEquals("++++++++++++++++++++++++++++++++++++++++++++++????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case98() {
    String containers = "-----X-XXXXX-----X--XX-X--X----X---X--XX--X--X--X-";
    int[] reports = { 15, 15, 15, 13, 15, 16, 15 };
    int L = 38;
    assertEquals("???++++++++++++++++++++++++++++++++++++++++++????-", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case99() {
    String containers = "XXXX----XXXX--XXXX";
    int[] reports = { 4, 4 };
    int L = 4;
    assertEquals("????----????--????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case100() {
    String containers = "-XX--X-XX-X-X--X---XX-X---XXXX-----X";
    int[] reports = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    int L = 7;
    assertEquals("???++++?++++++++++++++++++++??????--", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case101() {
    String containers = "------X-XX-";
    int[] reports = { 3, 0, 2, 0 };
    int L = 5;
    assertEquals("++++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case102() {
    String containers = "-XXXXX---X--";
    int[] reports = { 2, 1, 0, 1 };
    int L = 3;
    assertEquals("???-??++++??", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case103() {
    String containers = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    int[] reports = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    int L = 3;
    assertEquals("??????????????????????????????????????????????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case104() {
    String containers = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    int[] reports = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int L = 1;
    assertEquals("++++++++++++++++++++++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case105() {
    String containers = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    int[] reports = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    int L = 3;
    assertEquals("??++++++++++++++++++++++++++++++++++++++++++++++??", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case106() {
    String containers = "XXXX";
    int[] reports = { 4 };
    int L = 4;
    assertEquals("++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case107() {
    String containers = "-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X";
    int[] reports = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int L = 2;
    assertEquals("??????????????????????????????????????????????????", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case108() {
    String containers = "-XX--X-XX-X-X--X---XX-X---XXXX-----X-XX--X-XX-X-X-";
    int[] reports = { 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    int L = 7;
    assertEquals("?????????+++++++++++++++++???++++++++++++?????----", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case109() {
    String containers = "XXXXXX";
    int[] reports = { 6 };
    int L = 6;
    assertEquals("++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case110() {
    String containers = "XXXXXX---X";
    int[] reports = { 2, 5 };
    int L = 5;
    assertEquals("?++++++++?", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case111() {
    String containers = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    int[] reports = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int L = 1;
    assertEquals("++++++++++++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case112() {
    String containers = "XX--XX-XXX-XX--XX-XX-X---";
    int[] reports = { 5, 7, 6, 6, 6, 5, 6, 5, 6, 7, 6, 7, 7, 6 };
    int L = 10;
    assertEquals("+++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case113() {
    String containers = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    int[] reports = { 50 };
    int L = 50;
    assertEquals("++++++++++++++++++++++++++++++++++++++++++++++++++", surveillancesystem.getContainerInfo(containers, reports, L));
  }

  @Test
  public void case114() {
    String containers = "-XXXXX-";
    int[] reports = { 2 };
    int L = 3;
    assertEquals("???-???", surveillancesystem.getContainerInfo(containers, reports, L));
  }

}
