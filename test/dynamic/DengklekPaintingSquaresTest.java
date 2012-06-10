package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class DengklekPaintingSquaresTest {
  DengklekPaintingSquares dengklekpaintingsquares = new DengklekPaintingSquares();

  @Test
  public void case1() {
    int N = 1;
    int M = 1;
    assertEquals(2, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case2() {
    int N = 2;
    int M = 2;
    assertEquals(8, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case3() {
    int N = 1;
    int M = 3;
    assertEquals(5, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case4() {
    int N = 47;
    int M = 7;
    assertEquals(944149920, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case5() {
    int N = 1;
    int M = 2;
    assertEquals(3, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case6() {
    int N = 1;
    int M = 4;
    assertEquals(8, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case7() {
    int N = 1;
    int M = 5;
    assertEquals(13, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case8() {
    int N = 1;
    int M = 6;
    assertEquals(21, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case9() {
    int N = 1;
    int M = 7;
    assertEquals(34, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case10() {
    int N = 1;
    int M = 8;
    assertEquals(55, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case11() {
    int N = 3;
    int M = 5;
    assertEquals(1067, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case12() {
    int N = 4;
    int M = 2;
    assertEquals(48, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case13() {
    int N = 6;
    int M = 7;
    assertEquals(142860055, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case14() {
    int N = 7;
    int M = 6;
    assertEquals(142860055, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case15() {
    int N = 10;
    int M = 6;
    assertEquals(852065842, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case16() {
    int N = 10;
    int M = 7;
    assertEquals(133047026, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case17() {
    int N = 12;
    int M = 4;
    assertEquals(217922751, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case18() {
    int N = 12;
    int M = 6;
    assertEquals(551648439, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case19() {
    int N = 12;
    int M = 7;
    assertEquals(509252402, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case20() {
    int N = 15;
    int M = 4;
    assertEquals(867152507, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case21() {
    int N = 16;
    int M = 8;
    assertEquals(559575281, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case22() {
    int N = 17;
    int M = 4;
    assertEquals(504929571, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case23() {
    int N = 20;
    int M = 3;
    assertEquals(133418092, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case24() {
    int N = 21;
    int M = 6;
    assertEquals(154558076, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case25() {
    int N = 23;
    int M = 8;
    assertEquals(238358301, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case26() {
    int N = 25;
    int M = 1;
    assertEquals(196418, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case27() {
    int N = 25;
    int M = 6;
    assertEquals(417472647, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case28() {
    int N = 31;
    int M = 1;
    assertEquals(3524578, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case29() {
    int N = 32;
    int M = 8;
    assertEquals(452099666, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case30() {
    int N = 33;
    int M = 2;
    assertEquals(434804009, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case31() {
    int N = 33;
    int M = 4;
    assertEquals(360549211, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case32() {
    int N = 34;
    int M = 7;
    assertEquals(892665396, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case33() {
    int N = 36;
    int M = 5;
    assertEquals(117112746, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case34() {
    int N = 36;
    int M = 7;
    assertEquals(665050769, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case35() {
    int N = 36;
    int M = 8;
    assertEquals(778391605, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case36() {
    int N = 37;
    int M = 3;
    assertEquals(22962921, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case37() {
    int N = 38;
    int M = 1;
    assertEquals(102334155, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case38() {
    int N = 40;
    int M = 2;
    assertEquals(696374975, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case39() {
    int N = 41;
    int M = 5;
    assertEquals(278606644, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case40() {
    int N = 44;
    int M = 2;
    assertEquals(746383206, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case41() {
    int N = 45;
    int M = 2;
    assertEquals(772345493, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case42() {
    int N = 45;
    int M = 3;
    assertEquals(814257636, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case43() {
    int N = 47;
    int M = 2;
    assertEquals(759037600, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case44() {
    int N = 47;
    int M = 6;
    assertEquals(388356121, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case45() {
    int N = 48;
    int M = 3;
    assertEquals(100797928, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case46() {
    int N = 49;
    int M = 3;
    assertEquals(796812565, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case47() {
    int N = 49;
    int M = 8;
    assertEquals(490790721, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case48() {
    int N = 51;
    int M = 3;
    assertEquals(806147414, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case49() {
    int N = 56;
    int M = 5;
    assertEquals(359935014, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case50() {
    int N = 57;
    int M = 2;
    assertEquals(422144489, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case51() {
    int N = 57;
    int M = 7;
    assertEquals(305868052, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case52() {
    int N = 58;
    int M = 3;
    assertEquals(919543957, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case53() {
    int N = 64;
    int M = 3;
    assertEquals(726998433, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case54() {
    int N = 71;
    int M = 1;
    assertEquals(527403788, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case55() {
    int N = 75;
    int M = 3;
    assertEquals(45508041, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case56() {
    int N = 75;
    int M = 5;
    assertEquals(697209289, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case57() {
    int N = 77;
    int M = 2;
    assertEquals(985695704, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case58() {
    int N = 77;
    int M = 3;
    assertEquals(458872362, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case59() {
    int N = 77;
    int M = 4;
    assertEquals(689857849, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case60() {
    int N = 81;
    int M = 1;
    assertEquals(400391533, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case61() {
    int N = 81;
    int M = 8;
    assertEquals(63610655, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case62() {
    int N = 86;
    int M = 1;
    assertEquals(665487541, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case63() {
    int N = 86;
    int M = 3;
    assertEquals(126082288, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case64() {
    int N = 87;
    int M = 7;
    assertEquals(589627493, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case65() {
    int N = 88;
    int M = 8;
    assertEquals(330398667, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case66() {
    int N = 89;
    int M = 6;
    assertEquals(643421135, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case67() {
    int N = 90;
    int M = 2;
    assertEquals(497304262, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case68() {
    int N = 91;
    int M = 4;
    assertEquals(726399354, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case69() {
    int N = 91;
    int M = 7;
    assertEquals(352147883, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case70() {
    int N = 93;
    int M = 5;
    assertEquals(368736803, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case71() {
    int N = 93;
    int M = 7;
    assertEquals(897180692, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case72() {
    int N = 95;
    int M = 4;
    assertEquals(662160581, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case73() {
    int N = 98;
    int M = 2;
    assertEquals(166674494, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case74() {
    int N = 98;
    int M = 8;
    assertEquals(536977998, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case75() {
    int N = 99;
    int M = 7;
    assertEquals(551738264, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case76() {
    int N = 100;
    int M = 1;
    assertEquals(470199269, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case77() {
    int N = 100;
    int M = 2;
    assertEquals(398139603, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case78() {
    int N = 100;
    int M = 3;
    assertEquals(76803773, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case79() {
    int N = 100;
    int M = 4;
    assertEquals(393669896, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case80() {
    int N = 100;
    int M = 5;
    assertEquals(804089593, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case81() {
    int N = 100;
    int M = 6;
    assertEquals(545306804, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case82() {
    int N = 100;
    int M = 7;
    assertEquals(124439073, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case83() {
    int N = 100;
    int M = 8;
    assertEquals(636302453, dengklekpaintingsquares.numSolutions(N, M));
  }

  @Test
  public void case84() {
    int N = 99;
    int M = 8;
    assertEquals(857844889, dengklekpaintingsquares.numSolutions(N, M));
  }

}
