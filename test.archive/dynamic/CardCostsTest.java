package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CardCostsTest {
  CardCosts cardcosts = new CardCosts();

  @Test
  public void case1() {
    int n = 6;
    int k = 2;
    assertEquals(21L, cardcosts.mincost(n, k));
  }

  @Test
  public void case2() {
    int n = 400;
    int k = 1000;
    assertEquals(160000L, cardcosts.mincost(n, k));
  }

  @Test
  public void case3() {
    int n = 1000000;
    int k = 1000;
    assertEquals(999000001000L, cardcosts.mincost(n, k));
  }

  @Test
  public void case4() {
    int n = 113772;
    int k = 188;
    assertEquals(12875219937L, cardcosts.mincost(n, k));
  }

  @Test
  public void case5() {
    int n = 350602;
    int k = 706;
    assertEquals(122747696757L, cardcosts.mincost(n, k));
  }

  @Test
  public void case6() {
    int n = 330669;
    int k = 942;
    assertEquals(109226036466L, cardcosts.mincost(n, k));
  }

  @Test
  public void case7() {
    int n = 367236;
    int k = 137;
    assertEquals(133877938922L, cardcosts.mincost(n, k));
  }

  @Test
  public void case8() {
    int n = 962674;
    int k = 294;
    assertEquals(923589086442L, cardcosts.mincost(n, k));
  }

  @Test
  public void case9() {
    int n = 587553;
    int k = 929;
    assertEquals(344847014337L, cardcosts.mincost(n, k));
  }

  @Test
  public void case10() {
    int n = 511197;
    int k = 63;
    assertEquals(257174415253L, cardcosts.mincost(n, k));
  }

  @Test
  public void case11() {
    int n = 66715;
    int k = 693;
    assertEquals(4444477849L, cardcosts.mincost(n, k));
  }

  @Test
  public void case12() {
    int n = 472060;
    int k = 181;
    assertEquals(221609520776L, cardcosts.mincost(n, k));
  }

  @Test
  public void case13() {
    int n = 913932;
    int k = 679;
    assertEquals(834041553704L, cardcosts.mincost(n, k));
  }

  @Test
  public void case14() {
    int n = 315555;
    int k = 234;
    assertEquals(99149435518L, cardcosts.mincost(n, k));
  }

  @Test
  public void case15() {
    int n = 600470;
    int k = 301;
    assertEquals(359366360418L, cardcosts.mincost(n, k));
  }

  @Test
  public void case16() {
    int n = 395774;
    int k = 518;
    assertEquals(156334731966L, cardcosts.mincost(n, k));
  }

  @Test
  public void case17() {
    int n = 819017;
    int k = 27;
    assertEquals(645944984593L, cardcosts.mincost(n, k));
  }

  @Test
  public void case18() {
    int n = 107857;
    int k = 793;
    assertEquals(11618481169L, cardcosts.mincost(n, k));
  }

  @Test
  public void case19() {
    int n = 490869;
    int k = 246;
    assertEquals(239972910474L, cardcosts.mincost(n, k));
  }

  @Test
  public void case20() {
    int n = 487757;
    int k = 337;
    assertEquals(237200951117L, cardcosts.mincost(n, k));
  }

  @Test
  public void case21() {
    int n = 159031;
    int k = 535;
    assertEquals(25243643329L, cardcosts.mincost(n, k));
  }

  @Test
  public void case22() {
    int n = 106365;
    int k = 477;
    assertEquals(11289844897L, cardcosts.mincost(n, k));
  }

  @Test
  public void case23() {
    int n = 928110;
    int k = 190;
    assertEquals(856854681615L, cardcosts.mincost(n, k));
  }

  @Test
  public void case24() {
    int n = 548299;
    int k = 267;
    assertEquals(299505855493L, cardcosts.mincost(n, k));
  }

  @Test
  public void case25() {
    int n = 316065;
    int k = 803;
    assertEquals(99772834131L, cardcosts.mincost(n, k));
  }

  @Test
  public void case26() {
    int n = 985423;
    int k = 575;
    assertEquals(969369696881L, cardcosts.mincost(n, k));
  }

  @Test
  public void case27() {
    int n = 868150;
    int k = 127;
    assertEquals(747750267134L, cardcosts.mincost(n, k));
  }

  @Test
  public void case28() {
    int n = 356076;
    int k = 439;
    assertEquals(126501308268L, cardcosts.mincost(n, k));
  }

  @Test
  public void case29() {
    int n = 150042;
    int k = 442;
    assertEquals(22461679250L, cardcosts.mincost(n, k));
  }

  @Test
  public void case30() {
    int n = 443282;
    int k = 178;
    assertEquals(195395039856L, cardcosts.mincost(n, k));
  }

  @Test
  public void case31() {
    int n = 784984;
    int k = 226;
    assertEquals(613473389885L, cardcosts.mincost(n, k));
  }

  @Test
  public void case32() {
    int n = 708657;
    int k = 433;
    assertEquals(501034956561L, cardcosts.mincost(n, k));
  }

  @Test
  public void case33() {
    int n = 528853;
    int k = 900;
    assertEquals(279374832325L, cardcosts.mincost(n, k));
  }

  @Test
  public void case34() {
    int n = 83447;
    int k = 979;
    assertEquals(6956296319L, cardcosts.mincost(n, k));
  }

  @Test
  public void case35() {
    int n = 987446;
    int k = 86;
    assertEquals(963711972368L, cardcosts.mincost(n, k));
  }

  @Test
  public void case36() {
    int n = 44131;
    int k = 895;
    assertEquals(1945371619L, cardcosts.mincost(n, k));
  }

  @Test
  public void case37() {
    int n = 471855;
    int k = 865;
    assertEquals(222389848331L, cardcosts.mincost(n, k));
  }

  @Test
  public void case38() {
    int n = 207236;
    int k = 433;
    assertEquals(42847578110L, cardcosts.mincost(n, k));
  }

  @Test
  public void case39() {
    int n = 660672;
    int k = 247;
    assertEquals(434720367410L, cardcosts.mincost(n, k));
  }

  @Test
  public void case40() {
    int n = 366493;
    int k = 716;
    assertEquals(134129567653L, cardcosts.mincost(n, k));
  }

  @Test
  public void case41() {
    int n = 191847;
    int k = 152;
    assertEquals(36563143313L, cardcosts.mincost(n, k));
  }

  @Test
  public void case42() {
    int n = 365176;
    int k = 228;
    assertEquals(132768638392L, cardcosts.mincost(n, k));
  }

  @Test
  public void case43() {
    int n = 42394;
    int k = 14;
    assertEquals(1668879608L, cardcosts.mincost(n, k));
  }

  @Test
  public void case44() {
    int n = 0;
    int k = 654;
    assertEquals(0L, cardcosts.mincost(n, k));
  }

  @Test
  public void case45() {
    int n = 123123;
    int k = 1;
    assertEquals(123123L, cardcosts.mincost(n, k));
  }

  @Test
  public void case46() {
    int n = 1000000;
    int k = 1;
    assertEquals(1000000L, cardcosts.mincost(n, k));
  }

  @Test
  public void case47() {
    int n = 1000000;
    int k = 2;
    assertEquals(500000500000L, cardcosts.mincost(n, k));
  }

  @Test
  public void case48() {
    int n = 986200;
    int k = 73;
    assertEquals(959267415380L, cardcosts.mincost(n, k));
  }

  @Test
  public void case49() {
    int n = 113772;
    int k = 188;
    assertEquals(12875219937L, cardcosts.mincost(n, k));
  }

  @Test
  public void case50() {
    int n = 1000000;
    int k = 2;
    assertEquals(500000500000L, cardcosts.mincost(n, k));
  }

  @Test
  public void case51() {
    int n = 3;
    int k = 3;
    assertEquals(7L, cardcosts.mincost(n, k));
  }

  @Test
  public void case52() {
    int n = 5986;
    int k = 654;
    assertEquals(35777503L, cardcosts.mincost(n, k));
  }

}
