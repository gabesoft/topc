package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class LargeSignTestTest {
  LargeSignTest largesigntest = new LargeSignTest();

  @Test
  public void case1() {
    int N = 5;
    int K = 4;
    assertEquals("37.5%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case2() {
    int N = 10;
    int K = 5;
    assertEquals("100.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case3() {
    int N = 1000000;
    int K = 400000;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case4() {
    int N = 20;
    int K = 5;
    assertEquals("4.1%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case5() {
    int N = 1000000;
    int K = 499000;
    assertEquals("4.6%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case6() {
    int N = 1000;
    int K = 499;
    assertEquals("97.5%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case7() {
    int N = 1000000;
    int K = 499900;
    assertEquals("84.2%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case8() {
    int N = 457751;
    int K = 229032;
    assertEquals("64.5%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case9() {
    int N = 954446;
    int K = 479806;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case10() {
    int N = 502911;
    int K = 249637;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case11() {
    int N = 162292;
    int K = 80431;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case12() {
    int N = 479035;
    int K = 238355;
    assertEquals("0.1%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case13() {
    int N = 292167;
    int K = 146597;
    assertEquals("5.8%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case14() {
    int N = 722324;
    int K = 364093;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case15() {
    int N = 300832;
    int K = 149379;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case16() {
    int N = 986163;
    int K = 495307;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case17() {
    int N = 212614;
    int K = 106655;
    assertEquals("13.2%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case18() {
    int N = 499735;
    int K = 250759;
    assertEquals("1.2%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case19() {
    int N = 465049;
    int K = 230910;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case20() {
    int N = 62707;
    int K = 31714;
    assertEquals("0.4%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case21() {
    int N = 426743;
    int K = 212838;
    assertEquals("10.3%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case22() {
    int N = 355025;
    int K = 177343;
    assertEquals("57.1%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case23() {
    int N = 512663;
    int K = 258013;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case24() {
    int N = 504064;
    int K = 252709;
    assertEquals("5.7%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case25() {
    int N = 732662;
    int K = 367636;
    assertEquals("0.2%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case26() {
    int N = 630450;
    int K = 316450;
    assertEquals("0.2%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case27() {
    int N = 513709;
    int K = 255519;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case28() {
    int N = 449366;
    int K = 226714;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case29() {
    int N = 627692;
    int K = 314911;
    assertEquals("0.7%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case30() {
    int N = 170104;
    int K = 84908;
    assertEquals("48.7%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case31() {
    int N = 570838;
    int K = 284285;
    assertEquals("0.3%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case32() {
    int N = 197878;
    int K = 98774;
    assertEquals("46.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case33() {
    int N = 506653;
    int K = 252639;
    assertEquals("5.4%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case34() {
    int N = 333151;
    int K = 165058;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case35() {
    int N = 79293;
    int K = 39398;
    assertEquals("7.8%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case36() {
    int N = 669425;
    int K = 335217;
    assertEquals("21.8%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case37() {
    int N = 605891;
    int K = 300970;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case38() {
    int N = 943172;
    int K = 469649;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case39() {
    int N = 865111;
    int K = 429194;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case40() {
    int N = 667554;
    int K = 334721;
    assertEquals("2.1%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case41() {
    int N = 882406;
    int K = 438049;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case42() {
    int N = 974458;
    int K = 491148;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case43() {
    int N = 129036;
    int K = 64181;
    assertEquals("6.1%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case44() {
    int N = 716422;
    int K = 359057;
    assertEquals("4.6%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case45() {
    int N = 560756;
    int K = 279169;
    assertEquals("0.1%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case46() {
    int N = 610338;
    int K = 307010;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case47() {
    int N = 972259;
    int K = 489086;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case48() {
    int N = 68449;
    int K = 34080;
    assertEquals("27.1%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case49() {
    int N = 750374;
    int K = 375915;
    assertEquals("9.3%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case50() {
    int N = 486053;
    int K = 241545;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case51() {
    int N = 684392;
    int K = 344465;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case52() {
    int N = 731670;
    int K = 368413;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case53() {
    int N = 768859;
    int K = 382409;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case54() {
    int N = 76081;
    int K = 37952;
    assertEquals("52.3%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case55() {
    int N = 892301;
    int K = 447204;
    assertEquals("2.6%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case56() {
    int N = 123559;
    int K = 61668;
    assertEquals("52.8%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case57() {
    int N = 815121;
    int K = 405574;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case58() {
    int N = 1000000;
    int K = 499999;
    assertEquals("99.9%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case59() {
    int N = 1000000;
    int K = 499996;
    assertEquals("99.4%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case60() {
    int N = 1000000;
    int K = 499000;
    assertEquals("4.6%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case61() {
    int N = 5;
    int K = 4;
    assertEquals("37.5%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case62() {
    int N = 1000000;
    int K = 499997;
    assertEquals("99.6%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case63() {
    int N = 1000000;
    int K = 499980;
    assertEquals("96.9%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case64() {
    int N = 1000000;
    int K = 499995;
    assertEquals("99.3%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case65() {
    int N = 2;
    int K = 0;
    assertEquals("50.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case66() {
    int N = 1000000;
    int K = 499900;
    assertEquals("84.2%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case67() {
    int N = 1000000;
    int K = 500001;
    assertEquals("99.9%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case68() {
    int N = 1000000;
    int K = 499599;
    assertEquals("42.3%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case69() {
    int N = 1;
    int K = 0;
    assertEquals("100.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case70() {
    int N = 1000;
    int K = 497;
    assertEquals("87.4%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case71() {
    int N = 1000000;
    int K = 200000;
    assertEquals("0.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case72() {
    int N = 1000000;
    int K = 499700;
    assertEquals("54.9%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case73() {
    int N = 1000;
    int K = 495;
    assertEquals("77.6%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case74() {
    int N = 202;
    int K = 100;
    assertEquals("94.4%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case75() {
    int N = 999999;
    int K = 499999;
    assertEquals("100.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case76() {
    int N = 1000000;
    int K = 498262;
    assertEquals("0.1%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case77() {
    int N = 81;
    int K = 40;
    assertEquals("100.0%", largesigntest.pvalue(N, K));
  }

  @Test
  public void case78() {
    int N = 1001;
    int K = 459;
    assertEquals("1.0%", largesigntest.pvalue(N, K));
  }

}
