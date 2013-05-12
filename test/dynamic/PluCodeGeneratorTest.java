package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PluCodeGeneratorTest {
  PluCodeGenerator plucodegenerator = new PluCodeGenerator();

  @Test
  public void case1() {
    int N = 111;
    assertEquals(0, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case2() {
    int N = 556;
    assertEquals(5, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case3() {
    int N = 1113;
    assertEquals(13, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case4() {
    int N = 7346556;
    assertEquals(323647, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case5() {
    int N = 11;
    assertEquals(0, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case6() {
    int N = 19;
    assertEquals(0, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case7() {
    int N = 20;
    assertEquals(0, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case8() {
    int N = 111;
    assertEquals(0, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case9() {
    int N = 112;
    assertEquals(1, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case10() {
    int N = 222;
    assertEquals(1, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case11() {
    int N = 223;
    assertEquals(2, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case12() {
    int N = 998;
    assertEquals(8, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case13() {
    int N = 1001;
    assertEquals(10, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case14() {
    int N = 1002;
    assertEquals(10, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case15() {
    int N = 1000000000;
    assertEquals(62190729, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case16() {
    int N = 999999999;
    assertEquals(62190728, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case17() {
    int N = 100000000;
    assertEquals(5351400, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case18() {
    int N = 99999999;
    assertEquals(5351399, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case19() {
    int N = 10000000;
    assertEquals(447570, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case20() {
    int N = 9999999;
    assertEquals(447569, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case21() {
    int N = 1000000;
    assertEquals(35919, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case22() {
    int N = 999999;
    assertEquals(35918, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case23() {
    int N = 100000;
    assertEquals(2700, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case24() {
    int N = 99999;
    assertEquals(2699, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case25() {
    int N = 10000;
    assertEquals(180, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case26() {
    int N = 9999;
    assertEquals(179, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case27() {
    int N = 1000;
    assertEquals(9, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case28() {
    int N = 999;
    assertEquals(8, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case29() {
    int N = 100;
    assertEquals(0, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case30() {
    int N = 99;
    assertEquals(0, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case31() {
    int N = 10;
    assertEquals(0, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case32() {
    int N = 9;
    assertEquals(0, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case33() {
    int N = 1;
    assertEquals(0, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case34() {
    int N = 998998999;
    assertEquals(61189728, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case35() {
    int N = 777777777;
    assertEquals(48156326, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case36() {
    int N = 33333333;
    assertEquals(1718933, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case37() {
    int N = 123456789;
    assertEquals(7558723, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case38() {
    int N = 987654321;
    assertEquals(60578006, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case39() {
    int N = 192837465;
    assertEquals(11252914, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case40() {
    int N = 918273645;
    assertEquals(56883815, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case41() {
    int N = 100000001;
    assertEquals(5351401, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case42() {
    int N = 900000009;
    assertEquals(55875257, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case43() {
    int N = 900900900;
    assertEquals(56004884, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case44() {
    int N = 2812;
    assertEquals(45, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case45() {
    int N = 6078;
    assertEquals(105, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case46() {
    int N = 6826;
    assertEquals(121, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case47() {
    int N = 4806;
    assertEquals(83, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case48() {
    int N = 5555;
    assertEquals(95, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case49() {
    int N = 6303;
    assertEquals(107, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case50() {
    int N = 4284;
    assertEquals(69, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case51() {
    int N = 5032;
    assertEquals(86, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case52() {
    int N = 2418;
    assertEquals(41, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case53() {
    int N = 1147;
    assertEquals(20, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case54() {
    int N = 6519507;
    assertEquals(283615, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case55() {
    int N = 4630256;
    assertEquals(204963, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case56() {
    int N = 1478984;
    assertEquals(62623, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case57() {
    int N = 2398733;
    assertEquals(105130, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case58() {
    int N = 4757913;
    assertEquals(209443, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case59() {
    int N = 2923010;
    assertEquals(124414, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case60() {
    int N = 9718690;
    assertEquals(428197, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case61() {
    int N = 1749539;
    assertEquals(71971, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case62() {
    int N = 2830687;
    assertEquals(120871, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case63() {
    int N = 1740416;
    assertEquals(71718, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case64() {
    int N = 558049233;
    assertEquals(34660122, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case65() {
    int N = 773748451;
    assertEquals(47231626, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case66() {
    int N = 65493199;
    assertEquals(3418849, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case67() {
    int N = 492153196;
    assertEquals(30165973, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case68() {
    int N = 446438071;
    assertEquals(27721865, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case69() {
    int N = 8962471;
    assertEquals(399872, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case70() {
    int N = 297904289;
    assertEquals(17799882, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case71() {
    int N = 131594457;
    assertEquals(7929315, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case72() {
    int N = 234594457;
    assertEquals(14469493, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case73() {
    int N = 82646187;
    assertEquals(4385439, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case74() {
    int N = 116133419;
    assertEquals(7130547, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case75() {
    int N = 112343419;
    assertEquals(6963992, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case76() {
    int N = 651411671;
    assertEquals(39722892, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case77() {
    int N = 33951131;
    assertEquals(1805485, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case78() {
    int N = 33912431;
    assertEquals(1804476, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case79() {
    int N = 399658015;
    assertEquals(24188413, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case80() {
    int N = 49915345;
    assertEquals(2614999, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case81() {
    int N = 40358561;
    assertEquals(2104621, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case82() {
    int N = 64324829;
    assertEquals(3366692, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case83() {
    int N = 28215760;
    assertEquals(1453695, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case84() {
    int N = 949174849;
    assertEquals(58560494, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case85() {
    int N = 953087131;
    assertEquals(58740081, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case86() {
    int N = 933370331;
    assertEquals(57728479, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case87() {
    int N = 991564251;
    assertEquals(60854751, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case88() {
    int N = 971671565;
    assertEquals(59768937, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case89() {
    int N = 946708821;
    assertEquals(58451558, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case90() {
    int N = 943248479;
    assertEquals(58201585, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case91() {
    int N = 902763034;
    assertEquals(56090610, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case92() {
    int N = 941956165;
    assertEquals(58144121, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case93() {
    int N = 900077101;
    assertEquals(55952349, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case94() {
    int N = 900000007;
    assertEquals(55875255, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case95() {
    int N = 900030007;
    assertEquals(55905255, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case96() {
    int N = 900300007;
    assertEquals(55982637, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case97() {
    int N = 900900007;
    assertEquals(56004783, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case98() {
    int N = 100000001;
    assertEquals(5351401, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case99() {
    int N = 900000001;
    assertEquals(55875249, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case100() {
    int N = 999000001;
    assertEquals(61190730, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case101() {
    int N = 999999999;
    assertEquals(62190728, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case102() {
    int N = 193499343;
    assertEquals(11286407, plucodegenerator.countInvalidCodes(N));
  }

  @Test
  public void case103() {
    int N = 1000000000;
    assertEquals(62190729, plucodegenerator.countInvalidCodes(N));
  }

}
