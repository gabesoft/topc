package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SumOfPowersTest {
  SumOfPowers sumofpowers = new SumOfPowers();

  @Test
  public void case1() {
    int n = 5;
    int k = 1;
    assertEquals(15, sumofpowers.value(n, k));
  }

  @Test
  public void case2() {
    int n = 4;
    int k = 2;
    assertEquals(30, sumofpowers.value(n, k));
  }

  @Test
  public void case3() {
    int n = 13;
    int k = 5;
    assertEquals(1002001, sumofpowers.value(n, k));
  }

  @Test
  public void case4() {
    int n = 1000000000;
    int k = 50;
    assertEquals(16605204, sumofpowers.value(n, k));
  }

  @Test
  public void case5() {
    int n = 1000000000;
    int k = 49;
    assertEquals(642472098, sumofpowers.value(n, k));
  }

  @Test
  public void case6() {
    int n = 1000000000;
    int k = 40;
    assertEquals(405332886, sumofpowers.value(n, k));
  }

  @Test
  public void case7() {
    int n = 1000000000;
    int k = 20;
    assertEquals(155104048, sumofpowers.value(n, k));
  }

  @Test
  public void case8() {
    int n = 1000000000;
    int k = 1;
    assertEquals(21, sumofpowers.value(n, k));
  }

  @Test
  public void case9() {
    int n = 1000000000;
    int k = 2;
    assertEquals(999999916, sumofpowers.value(n, k));
  }

  @Test
  public void case10() {
    int n = 1000000000;
    int k = 3;
    assertEquals(441, sumofpowers.value(n, k));
  }

  @Test
  public void case11() {
    int n = 1000000000;
    int k = 4;
    assertEquals(999997732, sumofpowers.value(n, k));
  }

  @Test
  public void case12() {
    int n = 12345678;
    int k = 5;
    assertEquals(706711176, sumofpowers.value(n, k));
  }

  @Test
  public void case13() {
    int n = 987654321;
    int k = 39;
    assertEquals(77272707, sumofpowers.value(n, k));
  }

  @Test
  public void case14() {
    int n = 850631174;
    int k = 25;
    assertEquals(535145455, sumofpowers.value(n, k));
  }

  @Test
  public void case15() {
    int n = 821724346;
    int k = 35;
    assertEquals(444575177, sumofpowers.value(n, k));
  }

  @Test
  public void case16() {
    int n = 896737453;
    int k = 20;
    assertEquals(941145240, sumofpowers.value(n, k));
  }

  @Test
  public void case17() {
    int n = 690526406;
    int k = 32;
    assertEquals(75646351, sumofpowers.value(n, k));
  }

  @Test
  public void case18() {
    int n = 850139567;
    int k = 20;
    assertEquals(88624246, sumofpowers.value(n, k));
  }

  @Test
  public void case19() {
    int n = 123456789;
    int k = 1;
    assertEquals(383478132, sumofpowers.value(n, k));
  }

  @Test
  public void case20() {
    int n = 545023771;
    int k = 42;
    assertEquals(504219406, sumofpowers.value(n, k));
  }

  @Test
  public void case21() {
    int n = 856849676;
    int k = 36;
    assertEquals(834404315, sumofpowers.value(n, k));
  }

  @Test
  public void case22() {
    int n = 548664177;
    int k = 6;
    assertEquals(783137008, sumofpowers.value(n, k));
  }

  @Test
  public void case23() {
    int n = 701407449;
    int k = 35;
    assertEquals(700164338, sumofpowers.value(n, k));
  }

  @Test
  public void case24() {
    int n = 581795643;
    int k = 11;
    assertEquals(318434886, sumofpowers.value(n, k));
  }

  @Test
  public void case25() {
    int n = 736038809;
    int k = 10;
    assertEquals(361657666, sumofpowers.value(n, k));
  }

  @Test
  public void case26() {
    int n = 901047034;
    int k = 34;
    assertEquals(333530840, sumofpowers.value(n, k));
  }

  @Test
  public void case27() {
    int n = 702128132;
    int k = 13;
    assertEquals(279021524, sumofpowers.value(n, k));
  }

  @Test
  public void case28() {
    int n = 915161033;
    int k = 42;
    assertEquals(184504886, sumofpowers.value(n, k));
  }

  @Test
  public void case29() {
    int n = 860078464;
    int k = 43;
    assertEquals(662131087, sumofpowers.value(n, k));
  }

  @Test
  public void case30() {
    int n = 863368673;
    int k = 11;
    assertEquals(238376463, sumofpowers.value(n, k));
  }

  @Test
  public void case31() {
    int n = 902707330;
    int k = 16;
    assertEquals(628896502, sumofpowers.value(n, k));
  }

  @Test
  public void case32() {
    int n = 612766544;
    int k = 35;
    assertEquals(525223086, sumofpowers.value(n, k));
  }

  @Test
  public void case33() {
    int n = 602123753;
    int k = 40;
    assertEquals(102814101, sumofpowers.value(n, k));
  }

  @Test
  public void case34() {
    int n = 545304038;
    int k = 20;
    assertEquals(573971886, sumofpowers.value(n, k));
  }

  @Test
  public void case35() {
    int n = 936381859;
    int k = 3;
    assertEquals(950945820, sumofpowers.value(n, k));
  }

  @Test
  public void case36() {
    int n = 704027238;
    int k = 21;
    assertEquals(951756408, sumofpowers.value(n, k));
  }

  @Test
  public void case37() {
    int n = 683308427;
    int k = 38;
    assertEquals(372992528, sumofpowers.value(n, k));
  }

  @Test
  public void case38() {
    int n = 969888422;
    int k = 19;
    assertEquals(552895307, sumofpowers.value(n, k));
  }

  @Test
  public void case39() {
    int n = 563882675;
    int k = 29;
    assertEquals(250724632, sumofpowers.value(n, k));
  }

  @Test
  public void case40() {
    int n = 647032339;
    int k = 23;
    assertEquals(162923389, sumofpowers.value(n, k));
  }

  @Test
  public void case41() {
    int n = 602071701;
    int k = 43;
    assertEquals(738791726, sumofpowers.value(n, k));
  }

  @Test
  public void case42() {
    int n = 725331253;
    int k = 27;
    assertEquals(554255975, sumofpowers.value(n, k));
  }

  @Test
  public void case43() {
    int n = 841611116;
    int k = 41;
    assertEquals(754756366, sumofpowers.value(n, k));
  }

  @Test
  public void case44() {
    int n = 673725181;
    int k = 43;
    assertEquals(244189145, sumofpowers.value(n, k));
  }

  @Test
  public void case45() {
    int n = 611317204;
    int k = 40;
    assertEquals(255781409, sumofpowers.value(n, k));
  }

  @Test
  public void case46() {
    int n = 588525101;
    int k = 11;
    assertEquals(267011050, sumofpowers.value(n, k));
  }

  @Test
  public void case47() {
    int n = 502232691;
    int k = 37;
    assertEquals(552280193, sumofpowers.value(n, k));
  }

  @Test
  public void case48() {
    int n = 959774626;
    int k = 4;
    assertEquals(757145452, sumofpowers.value(n, k));
  }

  @Test
  public void case49() {
    int n = 869230470;
    int k = 4;
    assertEquals(559524135, sumofpowers.value(n, k));
  }

  @Test
  public void case50() {
    int n = 802681805;
    int k = 23;
    assertEquals(555832486, sumofpowers.value(n, k));
  }

  @Test
  public void case51() {
    int n = 652955543;
    int k = 35;
    assertEquals(510981805, sumofpowers.value(n, k));
  }

  @Test
  public void case52() {
    int n = 951360219;
    int k = 48;
    assertEquals(6340981, sumofpowers.value(n, k));
  }

  @Test
  public void case53() {
    int n = 611916815;
    int k = 22;
    assertEquals(380122611, sumofpowers.value(n, k));
  }

  @Test
  public void case54() {
    int n = 573496201;
    int k = 49;
    assertEquals(598971277, sumofpowers.value(n, k));
  }

  @Test
  public void case55() {
    int n = 530481772;
    int k = 48;
    assertEquals(993856504, sumofpowers.value(n, k));
  }

  @Test
  public void case56() {
    int n = 680753686;
    int k = 42;
    assertEquals(32366462, sumofpowers.value(n, k));
  }

  @Test
  public void case57() {
    int n = 999999999;
    int k = 1;
    assertEquals(28, sumofpowers.value(n, k));
  }

  @Test
  public void case58() {
    int n = 641786019;
    int k = 47;
    assertEquals(980477989, sumofpowers.value(n, k));
  }

  @Test
  public void case59() {
    int n = 751609937;
    int k = 42;
    assertEquals(936764622, sumofpowers.value(n, k));
  }

  @Test
  public void case60() {
    int n = 869457677;
    int k = 4;
    assertEquals(25186837, sumofpowers.value(n, k));
  }

  @Test
  public void case61() {
    int n = 705121410;
    int k = 44;
    assertEquals(868713821, sumofpowers.value(n, k));
  }

  @Test
  public void case62() {
    int n = 729468031;
    int k = 37;
    assertEquals(553640748, sumofpowers.value(n, k));
  }

  @Test
  public void case63() {
    int n = 864307136;
    int k = 11;
    assertEquals(619970484, sumofpowers.value(n, k));
  }

  @Test
  public void case64() {
    int n = 621124268;
    int k = 29;
    assertEquals(614223061, sumofpowers.value(n, k));
  }

  @Test
  public void case65() {
    int n = 500000003;
    int k = 2;
    assertEquals(0, sumofpowers.value(n, k));
  }

  @Test
  public void case66() {
    int n = 536870911;
    int k = 50;
    assertEquals(356514781, sumofpowers.value(n, k));
  }

  @Test
  public void case67() {
    int n = 536870912;
    int k = 49;
    assertEquals(208977026, sumofpowers.value(n, k));
  }

  @Test
  public void case68() {
    int n = 536870913;
    int k = 48;
    assertEquals(311884985, sumofpowers.value(n, k));
  }

  @Test
  public void case69() {
    int n = 1;
    int k = 1;
    assertEquals(1, sumofpowers.value(n, k));
  }

  @Test
  public void case70() {
    int n = 1;
    int k = 50;
    assertEquals(1, sumofpowers.value(n, k));
  }

  @Test
  public void case71() {
    int n = 2;
    int k = 1;
    assertEquals(3, sumofpowers.value(n, k));
  }

  @Test
  public void case72() {
    int n = 2;
    int k = 2;
    assertEquals(5, sumofpowers.value(n, k));
  }

  @Test
  public void case73() {
    int n = 2;
    int k = 50;
    assertEquals(898961332, sumofpowers.value(n, k));
  }

  @Test
  public void case74() {
    int n = 3;
    int k = 1;
    assertEquals(6, sumofpowers.value(n, k));
  }

  @Test
  public void case75() {
    int n = 3;
    int k = 2;
    assertEquals(14, sumofpowers.value(n, k));
  }

  @Test
  public void case76() {
    int n = 3;
    int k = 3;
    assertEquals(36, sumofpowers.value(n, k));
  }

  @Test
  public void case77() {
    int n = 3;
    int k = 50;
    assertEquals(609065612, sumofpowers.value(n, k));
  }

  @Test
  public void case78() {
    int n = 999999999;
    int k = 47;
    assertEquals(361818878, sumofpowers.value(n, k));
  }

  @Test
  public void case79() {
    int n = 999999999;
    int k = 49;
    assertEquals(476716327, sumofpowers.value(n, k));
  }

  @Test
  public void case80() {
    int n = 987654321;
    int k = 50;
    assertEquals(463175553, sumofpowers.value(n, k));
  }

  @Test
  public void case81() {
    int n = 978653456;
    int k = 49;
    assertEquals(231751340, sumofpowers.value(n, k));
  }

  @Test
  public void case82() {
    int n = 999999999;
    int k = 50;
    assertEquals(176895594, sumofpowers.value(n, k));
  }

  @Test
  public void case83() {
    int n = 987654321;
    int k = 49;
    assertEquals(168309305, sumofpowers.value(n, k));
  }

  @Test
  public void case84() {
    int n = 100000000;
    int k = 50;
    assertEquals(291807007, sumofpowers.value(n, k));
  }

  @Test
  public void case85() {
    int n = 9999999;
    int k = 50;
    assertEquals(117128363, sumofpowers.value(n, k));
  }

  @Test
  public void case86() {
    int n = 5;
    int k = 50;
    assertEquals(461562836, sumofpowers.value(n, k));
  }

  @Test
  public void case87() {
    int n = 979597;
    int k = 49;
    assertEquals(913827245, sumofpowers.value(n, k));
  }

  @Test
  public void case88() {
    int n = 1000000000;
    int k = 47;
    assertEquals(773364917, sumofpowers.value(n, k));
  }

  @Test
  public void case89() {
    int n = 987946789;
    int k = 31;
    assertEquals(123351620, sumofpowers.value(n, k));
  }

}
