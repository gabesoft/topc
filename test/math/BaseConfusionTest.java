package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BaseConfusionTest {
  BaseConfusion baseconfusion = new BaseConfusion();

  @Test
  public void case1() {
    int M = 14;
    int N = 18;
    int B = 3;
    assertEquals(129L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case2() {
    int M = 1;
    int N = 10;
    int B = 16;
    assertEquals(55L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case3() {
    int M = 100;
    int N = 100;
    int B = 10;
    assertEquals(121L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case4() {
    int M = 209881;
    int N = 210565;
    int B = 3;
    assertEquals(3141592653L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case5() {
    int M = 1;
    int N = 350000000;
    int B = 3;
    assertEquals(7206282108986150421L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case6() {
    int M = 1;
    int N = 350000000;
    int B = 16;
    assertEquals(89827255572899906L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case7() {
    int M = 1167;
    int N = 5237493;
    int B = 3;
    assertEquals(552135969583654L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case8() {
    int M = 1983;
    int N = 1201464;
    int B = 3;
    assertEquals(19658318322265L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case9() {
    int M = 24;
    int N = 1734;
    int B = 3;
    assertEquals(7363614L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case10() {
    int M = 1529;
    int N = 4637;
    int B = 4;
    assertEquals(29735203L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case11() {
    int M = 2;
    int N = 135093;
    int B = 4;
    assertEquals(47965273958L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case12() {
    int M = 428;
    int N = 36012284;
    int B = 4;
    assertEquals(8393497735422769L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case13() {
    int M = 20;
    int N = 4586;
    int B = 5;
    assertEquals(23128709L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case14() {
    int M = 1;
    int N = 5710;
    int B = 5;
    assertEquals(36433310L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case15() {
    int M = 1901;
    int N = 5840;
    int B = 5;
    assertEquals(34646408L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case16() {
    int M = 334;
    int N = 4294005;
    int B = 6;
    assertEquals(29753971547148L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case17() {
    int M = 226;
    int N = 6073;
    int B = 6;
    assertEquals(32971166L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case18() {
    int M = 103;
    int N = 9066929;
    int B = 6;
    assertEquals(136893788009663L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case19() {
    int M = 1723661;
    int N = 7062232;
    int B = 7;
    assertEquals(61658763129315L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case20() {
    int M = 7595;
    int N = 53449938;
    int B = 7;
    assertEquals(4314064544592466L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case21() {
    int M = 5;
    int N = 3533;
    int B = 7;
    assertEquals(9773021L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case22() {
    int M = 139;
    int N = 63850;
    int B = 8;
    assertEquals(3443322041L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case23() {
    int M = 49;
    int N = 1337472;
    int B = 8;
    assertEquals(1769540471211L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case24() {
    int M = 5687;
    int N = 237509809;
    int B = 8;
    assertEquals(76181910936062528L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case25() {
    int M = 229;
    int N = 656;
    int B = 9;
    assertEquals(231492L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case26() {
    int M = 524690;
    int N = 14844808;
    int B = 9;
    assertEquals(222114366802583L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case27() {
    int M = 27101;
    int N = 1597142;
    int B = 9;
    assertEquals(2310830562586L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case28() {
    int M = 1;
    int N = 242056;
    int B = 10;
    assertEquals(45411371427L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case29() {
    int M = 44;
    int N = 179506;
    int B = 10;
    assertEquals(24621572853L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case30() {
    int M = 10243;
    int N = 5898221;
    int B = 10;
    assertEquals(30300288194285L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case31() {
    int M = 184;
    int N = 2303;
    int B = 11;
    assertEquals(3263701L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case32() {
    int M = 44;
    int N = 11886;
    int B = 11;
    assertEquals(90789629L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case33() {
    int M = 1906;
    int N = 1007710;
    int B = 11;
    assertEquals(773405576064L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case34() {
    int M = 3740;
    int N = 36665697;
    int B = 12;
    assertEquals(1083345418865487L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case35() {
    int M = 6105;
    int N = 4128167;
    int B = 12;
    assertEquals(13075438231203L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case36() {
    int M = 153;
    int N = 48794;
    int B = 12;
    assertEquals(1586844588L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case37() {
    int M = 552;
    int N = 81313;
    int B = 13;
    assertEquals(4331441245L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case38() {
    int M = 2;
    int N = 142;
    int B = 13;
    assertEquals(10867L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case39() {
    int M = 29961;
    int N = 95831;
    int B = 13;
    assertEquals(5482413782L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case40() {
    int M = 6957;
    int N = 5617022;
    int B = 14;
    assertEquals(22125019300104L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case41() {
    int M = 245;
    int N = 6464;
    int B = 14;
    assertEquals(24959653L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case42() {
    int M = 21211;
    int N = 187826;
    int B = 14;
    assertEquals(22638099384L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case43() {
    int M = 234;
    int N = 4849;
    int B = 15;
    assertEquals(13686970L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case44() {
    int M = 2;
    int N = 2;
    int B = 15;
    assertEquals(2L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case45() {
    int M = 1304;
    int N = 1162792;
    int B = 15;
    assertEquals(899064536802L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case46() {
    int M = 48;
    int N = 8109897;
    int B = 16;
    assertEquals(44177991983349L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case47() {
    int M = 5;
    int N = 69153;
    int B = 16;
    assertEquals(2875267897L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case48() {
    int M = 2231;
    int N = 110353;
    int B = 16;
    assertEquals(7503972845L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case49() {
    int M = 350000000;
    int N = 350000000;
    int B = 7;
    assertEquals(1285245000L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case50() {
    int M = 350000000;
    int N = 350000000;
    int B = 3;
    assertEquals(43241330794L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case51() {
    int M = 350000000;
    int N = 350000000;
    int B = 16;
    assertEquals(526394562L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case52() {
    int M = 175000000;
    int N = 350000000;
    int B = 3;
    assertEquals(5605031007176540786L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case53() {
    int M = 1;
    int N = 349999999;
    int B = 16;
    assertEquals(89827255046505344L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case54() {
    int M = 1;
    int N = 350000000;
    int B = 13;
    assertEquals(101535017249312478L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case55() {
    int M = 1;
    int N = 350000000;
    int B = 15;
    assertEquals(93164804607389436L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case56() {
    int M = 1;
    int N = 350000000;
    int B = 10;
    assertEquals(127787124415512498L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case57() {
    int M = 1;
    int N = 35000000;
    int B = 3;
    assertEquals(40080340469042181L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case58() {
    int M = 978;
    int N = 349000000;
    int B = 13;
    assertEquals(100952409108362049L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case59() {
    int M = 1;
    int N = 350000000;
    int B = 4;
    assertEquals(1161729926164166125L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case60() {
    int M = 1;
    int N = 350000000;
    int B = 7;
    assertEquals(209503247552285152L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case61() {
    int M = 1;
    int N = 350000000;
    int B = 12;
    assertEquals(106361178626317725L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case62() {
    int M = 2211212;
    int N = 222222222;
    int B = 13;
    assertEquals(40634142653680584L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case63() {
    int M = 2;
    int N = 349999992;
    int B = 3;
    assertEquals(7206281763055504103L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case64() {
    int M = 1;
    int N = 35000000;
    int B = 16;
    assertEquals(855758329910067L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case65() {
    int M = 1;
    int N = 350000000;
    int B = 11;
    assertEquals(116914094803211776L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case66() {
    int M = 1;
    int N = 35000000;
    int B = 10;
    assertEquals(1161701177319318L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case67() {
    int M = 1;
    int N = 100000000;
    int B = 3;
    assertEquals(432417925054835484L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case68() {
    int M = 1;
    int N = 350000000;
    int B = 8;
    assertEquals(169017298599526732L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case69() {
    int M = 200;
    int N = 350000000;
    int B = 13;
    assertEquals(101535017249290704L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case70() {
    int M = 17;
    int N = 349999999;
    int B = 12;
    assertEquals(106361178017203135L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case71() {
    int M = 2211212;
    int N = 350000000;
    int B = 3;
    assertEquals(7206200588297572818L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case72() {
    int M = 1;
    int N = 350000000;
    int B = 5;
    assertEquals(481013419244366848L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case73() {
    int M = 1;
    int N = 350000000;
    int B = 9;
    assertEquals(140367624804501534L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case74() {
    int M = 1;
    int N = 3500000;
    int B = 7;
    assertEquals(15093633981040L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case75() {
    int M = 349999999;
    int N = 350000000;
    int B = 3;
    assertEquals(86482661587L, baseconfusion.sum(M, N, B));
  }

  @Test
  public void case76() {
    int M = 2;
    int N = 34798322;
    int B = 15;
    assertEquals(872635906694978L, baseconfusion.sum(M, N, B));
  }

}
