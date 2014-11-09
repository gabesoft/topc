package topc.test.encryption;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.encryption.*;

public class RSABreakerTest {
  RSABreaker rsabreaker = new RSABreaker();

  @Test
  public void case1() {
    int e = 3;
    int n = 10;
    int b = 3;
    assertEquals(7, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case2() {
    int e = 17;
    int n = 33;
    int b = 4;
    assertEquals(31, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case3() {
    int e = 1;
    int n = 42;
    int b = 17;
    assertEquals(17, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case4() {
    int e = 5;
    int n = 997;
    int b = 7;
    assertEquals(523, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case5() {
    int e = 47;
    int n = 843;
    int b = 822;
    assertEquals(831, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case6() {
    int e = 999;
    int n = 786;
    int b = 56;
    assertEquals(614, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case7() {
    int e = 67;
    int n = 238;
    int b = 93;
    assertEquals(121, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case8() {
    int e = 589;
    int n = 563;
    int b = 469;
    assertEquals(364, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case9() {
    int e = 233;
    int n = 511;
    int b = 209;
    assertEquals(209, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case10() {
    int e = 287;
    int n = 287;
    int b = 98;
    assertEquals(119, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case11() {
    int e = 599;
    int n = 151;
    int b = 71;
    assertEquals(134, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case12() {
    int e = 865;
    int n = 454;
    int b = 51;
    assertEquals(143, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case13() {
    int e = 755;
    int n = 193;
    int b = 53;
    assertEquals(176, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case14() {
    int e = 289;
    int n = 674;
    int b = 73;
    assertEquals(641, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case15() {
    int e = 681;
    int n = 902;
    int b = 12;
    assertEquals(12, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case16() {
    int e = 481;
    int n = 802;
    int b = 632;
    assertEquals(476, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case17() {
    int e = 627;
    int n = 467;
    int b = 417;
    assertEquals(410, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case18() {
    int e = 775;
    int n = 29;
    int b = 6;
    assertEquals(13, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case19() {
    int e = 839;
    int n = 615;
    int b = 607;
    assertEquals(538, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case20() {
    int e = 165;
    int n = 30;
    int b = 27;
    assertEquals(27, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case21() {
    int e = 647;
    int n = 935;
    int b = 513;
    assertEquals(827, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case22() {
    int e = 549;
    int n = 538;
    int b = 48;
    assertEquals(262, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case23() {
    int e = 859;
    int n = 865;
    int b = 779;
    assertEquals(694, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case24() {
    int e = 691;
    int n = 922;
    int b = 24;
    assertEquals(24, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case25() {
    int e = 553;
    int n = 206;
    int b = 152;
    assertEquals(144, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case26() {
    int e = 151;
    int n = 766;
    int b = 699;
    assertEquals(505, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case27() {
    int e = 119;
    int n = 805;
    int b = 340;
    assertEquals(555, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case28() {
    int e = 971;
    int n = 535;
    int b = 118;
    assertEquals(297, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case29() {
    int e = 491;
    int n = 914;
    int b = 176;
    assertEquals(22, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case30() {
    int e = 151;
    int n = 102;
    int b = 66;
    assertEquals(42, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case31() {
    int e = 523;
    int n = 471;
    int b = 309;
    assertEquals(69, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case32() {
    int e = 587;
    int n = 111;
    int b = 84;
    assertEquals(63, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case33() {
    int e = 577;
    int n = 263;
    int b = 91;
    assertEquals(161, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case34() {
    int e = 309;
    int n = 510;
    int b = 504;
    assertEquals(24, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case35() {
    int e = 769;
    int n = 777;
    int b = 654;
    assertEquals(213, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case36() {
    int e = 359;
    int n = 454;
    int b = 216;
    assertEquals(354, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case37() {
    int e = 185;
    int n = 415;
    int b = 161;
    assertEquals(191, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case38() {
    int e = 629;
    int n = 469;
    int b = 297;
    assertEquals(439, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case39() {
    int e = 277;
    int n = 395;
    int b = 379;
    assertEquals(314, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case40() {
    int e = 39;
    int n = 391;
    int b = 129;
    assertEquals(379, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case41() {
    int e = 751;
    int n = 611;
    int b = 405;
    assertEquals(505, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case42() {
    int e = 107;
    int n = 969;
    int b = 311;
    assertEquals(125, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case43() {
    int e = 991;
    int n = 886;
    int b = 493;
    assertEquals(127, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case44() {
    int e = 895;
    int n = 499;
    int b = 455;
    assertEquals(441, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case45() {
    int e = 127;
    int n = 498;
    int b = 129;
    assertEquals(447, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case46() {
    int e = 617;
    int n = 319;
    int b = 94;
    assertEquals(7, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case47() {
    int e = 403;
    int n = 607;
    int b = 9;
    assertEquals(428, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case48() {
    int e = 439;
    int n = 598;
    int b = 122;
    assertEquals(424, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case49() {
    int e = 511;
    int n = 470;
    int b = 176;
    assertEquals(116, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case50() {
    int e = 979;
    int n = 122;
    int b = 67;
    assertEquals(79, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case51() {
    int e = 639;
    int n = 934;
    int b = 772;
    assertEquals(832, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case52() {
    int e = 769;
    int n = 815;
    int b = 105;
    assertEquals(105, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case53() {
    int e = 809;
    int n = 341;
    int b = 108;
    assertEquals(60, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case54() {
    int e = 89;
    int n = 866;
    int b = 31;
    assertEquals(321, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case55() {
    int e = 451;
    int n = 766;
    int b = 166;
    assertEquals(246, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case56() {
    int e = 403;
    int n = 519;
    int b = 82;
    assertEquals(103, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case57() {
    int e = 453;
    int n = 177;
    int b = 83;
    assertEquals(101, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case58() {
    int e = 55;
    int n = 563;
    int b = 169;
    assertEquals(555, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case59() {
    int e = 441;
    int n = 46;
    int b = 19;
    assertEquals(19, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case60() {
    int e = 581;
    int n = 941;
    int b = 775;
    assertEquals(545, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case61() {
    int e = 311;
    int n = 695;
    int b = 149;
    assertEquals(39, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case62() {
    int e = 641;
    int n = 307;
    int b = 147;
    assertEquals(189, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case63() {
    int e = 929;
    int n = 658;
    int b = 12;
    assertEquals(178, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case64() {
    int e = 317;
    int n = 703;
    int b = 663;
    assertEquals(386, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case65() {
    int e = 349;
    int n = 319;
    int b = 132;
    assertEquals(165, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case66() {
    int e = 859;
    int n = 91;
    int b = 10;
    assertEquals(10, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case67() {
    int e = 269;
    int n = 523;
    int b = 467;
    assertEquals(518, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case68() {
    int e = 257;
    int n = 377;
    int b = 72;
    assertEquals(11, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case69() {
    int e = 989;
    int n = 93;
    int b = 15;
    assertEquals(60, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case70() {
    int e = 821;
    int n = 133;
    int b = 15;
    assertEquals(78, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case71() {
    int e = 491;
    int n = 958;
    int b = 124;
    assertEquals(136, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case72() {
    int e = 997;
    int n = 74;
    int b = 23;
    assertEquals(23, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case73() {
    int e = 577;
    int n = 151;
    int b = 139;
    assertEquals(62, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case74() {
    int e = 517;
    int n = 19;
    int b = 13;
    assertEquals(10, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case75() {
    int e = 815;
    int n = 767;
    int b = 450;
    assertEquals(148, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case76() {
    int e = 149;
    int n = 919;
    int b = 0;
    assertEquals(0, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case77() {
    int e = 835;
    int n = 254;
    int b = 190;
    assertEquals(246, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case78() {
    int e = 613;
    int n = 733;
    int b = 552;
    assertEquals(237, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case79() {
    int e = 89;
    int n = 886;
    int b = 392;
    assertEquals(288, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case80() {
    int e = 503;
    int n = 906;
    int b = 120;
    assertEquals(708, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case81() {
    int e = 169;
    int n = 417;
    int b = 24;
    assertEquals(144, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case82() {
    int e = 507;
    int n = 958;
    int b = 929;
    assertEquals(579, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case83() {
    int e = 59;
    int n = 246;
    int b = 80;
    assertEquals(20, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case84() {
    int e = 667;
    int n = 898;
    int b = 860;
    assertEquals(682, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case85() {
    int e = 23;
    int n = 597;
    int b = 126;
    assertEquals(45, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case86() {
    int e = 629;
    int n = 742;
    int b = 98;
    assertEquals(602, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case87() {
    int e = 407;
    int n = 553;
    int b = 300;
    assertEquals(48, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case88() {
    int e = 501;
    int n = 697;
    int b = 581;
    assertEquals(403, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case89() {
    int e = 173;
    int n = 899;
    int b = 381;
    assertEquals(267, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case90() {
    int e = 79;
    int n = 902;
    int b = 130;
    assertEquals(170, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case91() {
    int e = 67;
    int n = 187;
    int b = 0;
    assertEquals(0, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case92() {
    int e = 447;
    int n = 557;
    int b = 278;
    assertEquals(357, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case93() {
    int e = 625;
    int n = 398;
    int b = 247;
    assertEquals(41, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case94() {
    int e = 103;
    int n = 745;
    int b = 425;
    assertEquals(155, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case95() {
    int e = 787;
    int n = 713;
    int b = 526;
    assertEquals(681, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case96() {
    int e = 7;
    int n = 878;
    int b = 643;
    assertEquals(121, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case97() {
    int e = 843;
    int n = 743;
    int b = 67;
    assertEquals(555, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case98() {
    int e = 179;
    int n = 634;
    int b = 538;
    assertEquals(148, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case99() {
    int e = 739;
    int n = 133;
    int b = 33;
    assertEquals(33, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case100() {
    int e = 335;
    int n = 258;
    int b = 244;
    assertEquals(46, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case101() {
    int e = 5;
    int n = 997;
    int b = 7;
    assertEquals(523, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case102() {
    int e = 5;
    int n = 997;
    int b = 9;
    assertEquals(250, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case103() {
    int e = 5;
    int n = 997;
    int b = 996;
    assertEquals(996, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case104() {
    int e = 3;
    int n = 10;
    int b = 3;
    assertEquals(7, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case105() {
    int e = 715;
    int n = 910;
    int b = 531;
    assertEquals(41, rsabreaker.decrypt(e, n, b));
  }

  @Test
  public void case106() {
    int e = 17;
    int n = 33;
    int b = 4;
    assertEquals(31, rsabreaker.decrypt(e, n, b));
  }

}
