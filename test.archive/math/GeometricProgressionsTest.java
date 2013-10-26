package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class GeometricProgressionsTest {
  GeometricProgressions geometricprogressions = new GeometricProgressions();

  @Test
  public void case1() {
    int b1 = 3;
    int q1 = 2;
    int n1 = 5;
    int b2 = 6;
    int q2 = 2;
    int n2 = 5;
    assertEquals(6, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case2() {
    int b1 = 3;
    int q1 = 2;
    int n1 = 5;
    int b2 = 2;
    int q2 = 3;
    int n2 = 5;
    assertEquals(9, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case3() {
    int b1 = 1;
    int q1 = 1;
    int n1 = 1;
    int b2 = 0;
    int q2 = 0;
    int n2 = 1;
    assertEquals(2, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case4() {
    int b1 = 3;
    int q1 = 4;
    int n1 = 100500;
    int b2 = 48;
    int q2 = 1024;
    int n2 = 1000;
    assertEquals(100500, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case5() {
    int b1 = 15724;
    int q1 = 19169;
    int n1 = 26501;
    int b2 = 6334;
    int q2 = 18467;
    int n2 = 42;
    assertEquals(26543, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case6() {
    int b1 = 28145;
    int q1 = 5705;
    int n1 = 24465;
    int b2 = 26962;
    int q2 = 29358;
    int n2 = 11479;
    assertEquals(35944, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case7() {
    int b1 = 11942;
    int q1 = 2995;
    int n1 = 492;
    int b2 = 9961;
    int q2 = 16827;
    int n2 = 23282;
    assertEquals(23774, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case8() {
    int b1 = 153;
    int q1 = 3902;
    int n1 = 14605;
    int b2 = 32391;
    int q2 = 5436;
    int n2 = 4828;
    assertEquals(19433, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case9() {
    int b1 = 19895;
    int q1 = 19718;
    int n1 = 18717;
    int b2 = 17421;
    int q2 = 12382;
    int n2 = 293;
    assertEquals(19010, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case10() {
    int b1 = 19912;
    int q1 = 1869;
    int n1 = 11539;
    int b2 = 14771;
    int q2 = 21726;
    int n2 = 5448;
    assertEquals(16987, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case11() {
    int b1 = 23811;
    int q1 = 28703;
    int n1 = 9895;
    int b2 = 17035;
    int q2 = 26299;
    int n2 = 25668;
    assertEquals(35563, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case12() {
    int b1 = 7711;
    int q1 = 15141;
    int n1 = 4665;
    int b2 = 17673;
    int q2 = 30333;
    int n2 = 31323;
    assertEquals(35988, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case13() {
    int b1 = 32757;
    int q1 = 32662;
    int n1 = 27645;
    int b2 = 25547;
    int q2 = 6868;
    int n2 = 28254;
    assertEquals(55899, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case14() {
    int b1 = 778;
    int q1 = 27529;
    int n1 = 9742;
    int b2 = 8723;
    int q2 = 12859;
    int n2 = 20038;
    assertEquals(29780, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case15() {
    int b1 = 6;
    int q1 = 8;
    int n1 = 1843;
    int b2 = 0;
    int q2 = 5;
    int n2 = 12317;
    assertEquals(1844, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case16() {
    int b1 = 5;
    int q1 = 6;
    int n1 = 22649;
    int b2 = 4;
    int q2 = 2;
    int n2 = 9041;
    assertEquals(31690, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case17() {
    int b1 = 1;
    int q1 = 6;
    int n1 = 15351;
    int b2 = 0;
    int q2 = 9;
    int n2 = 15891;
    assertEquals(15352, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case18() {
    int b1 = 4;
    int q1 = 4;
    int n1 = 12624;
    int b2 = 9;
    int q2 = 8;
    int n2 = 24394;
    assertEquals(37018, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case19() {
    int b1 = 8;
    int q1 = 1;
    int n1 = 7377;
    int b2 = 6;
    int q2 = 0;
    int n2 = 18757;
    assertEquals(3, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case20() {
    int b1 = 8;
    int q1 = 7;
    int n1 = 11324;
    int b2 = 6;
    int q2 = 9;
    int n2 = 16945;
    assertEquals(28269, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case21() {
    int b1 = 5;
    int q1 = 3;
    int n1 = 16542;
    int b2 = 9;
    int q2 = 2;
    int n2 = 16119;
    assertEquals(32661, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case22() {
    int b1 = 6;
    int q1 = 7;
    int n1 = 9931;
    int b2 = 4;
    int q2 = 8;
    int n2 = 4640;
    assertEquals(14571, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case23() {
    int b1 = 2;
    int q1 = 4;
    int n1 = 28746;
    int b2 = 1;
    int q2 = 6;
    int n2 = 31674;
    assertEquals(60420, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case24() {
    int b1 = 2;
    int q1 = 7;
    int n1 = 15574;
    int b2 = 7;
    int q2 = 9;
    int n2 = 6271;
    assertEquals(21845, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case25() {
    int b1 = 7;
    int q1 = 5;
    int n1 = 18637;
    int b2 = 1;
    int q2 = 0;
    int n2 = 23987;
    assertEquals(18639, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case26() {
    int b1 = 0;
    int q1 = 0;
    int n1 = 12053;
    int b2 = 1;
    int q2 = 4;
    int n2 = 23656;
    assertEquals(23657, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case27() {
    int b1 = 1;
    int q1 = 7;
    int n1 = 3431;
    int b2 = 6;
    int q2 = 4;
    int n2 = 16942;
    assertEquals(20373, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case28() {
    int b1 = 3;
    int q1 = 3;
    int n1 = 12288;
    int b2 = 7;
    int q2 = 7;
    int n2 = 18008;
    assertEquals(30296, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case29() {
    int b1 = 8;
    int q1 = 1;
    int n1 = 9759;
    int b2 = 9;
    int q2 = 9;
    int n2 = 14946;
    assertEquals(14947, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case30() {
    int b1 = 8;
    int q1 = 3;
    int n1 = 13031;
    int b2 = 6;
    int q2 = 6;
    int n2 = 6423;
    assertEquals(19453, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case31() {
    int b1 = 9;
    int q1 = 0;
    int n1 = 1656;
    int b2 = 2;
    int q2 = 1;
    int n2 = 901;
    assertEquals(3, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case32() {
    int b1 = 1;
    int q1 = 5;
    int n1 = 6484;
    int b2 = 8;
    int q2 = 7;
    int n2 = 27625;
    assertEquals(34109, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case33() {
    int b1 = 0;
    int q1 = 4;
    int n1 = 30837;
    int b2 = 1;
    int q2 = 0;
    int n2 = 3603;
    assertEquals(2, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case34() {
    int b1 = 4;
    int q1 = 8;
    int n1 = 23200;
    int b2 = 8;
    int q2 = 1;
    int n2 = 4597;
    assertEquals(23201, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case35() {
    int b1 = 938;
    int q1 = 6418;
    int n1 = 2000;
    int b2 = 53;
    int q2 = 4734;
    int n2 = 8282;
    assertEquals(10282, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case36() {
    int b1 = 893;
    int q1 = 3728;
    int n1 = 468;
    int b2 = 127;
    int q2 = 3788;
    int n2 = 6901;
    assertEquals(7369, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case37() {
    int b1 = 617;
    int q1 = 4310;
    int n1 = 2422;
    int b2 = 807;
    int q2 = 2483;
    int n2 = 24649;
    assertEquals(27071, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case38() {
    int b1 = 451;
    int q1 = 8935;
    int n1 = 7617;
    int b2 = 309;
    int q2 = 9514;
    int n2 = 22814;
    assertEquals(30431, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case39() {
    int b1 = 303;
    int q1 = 2798;
    int n1 = 31557;
    int b2 = 519;
    int q2 = 5249;
    int n2 = 20601;
    assertEquals(52158, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case40() {
    int b1 = 702;
    int q1 = 4989;
    int n1 = 32610;
    int b2 = 844;
    int q2 = 1008;
    int n2 = 6225;
    assertEquals(38835, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case41() {
    int b1 = 587;
    int q1 = 523;
    int n1 = 14344;
    int b2 = 93;
    int q2 = 485;
    int n2 = 3196;
    assertEquals(17540, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case42() {
    int b1 = 618;
    int q1 = 3458;
    int n1 = 25201;
    int b2 = 448;
    int q2 = 9503;
    int n2 = 29315;
    assertEquals(54516, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case43() {
    int b1 = 798;
    int q1 = 9589;
    int n1 = 15282;
    int b2 = 798;
    int q2 = 9796;
    int n2 = 20581;
    assertEquals(35862, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case44() {
    int b1 = 292;
    int q1 = 8538;
    int n1 = 23623;
    int b2 = 472;
    int q2 = 7157;
    int n2 = 28010;
    assertEquals(51633, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case45() {
    int b1 = 191;
    int q1 = 7958;
    int n1 = 29658;
    int b2 = 190;
    int q2 = 4179;
    int n2 = 6039;
    assertEquals(35697, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case46() {
    int b1 = 634;
    int q1 = 6202;
    int n1 = 11512;
    int b2 = 156;
    int q2 = 2888;
    int n2 = 19816;
    assertEquals(31328, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case47() {
    int b1 = 886;
    int q1 = 6362;
    int n1 = 22647;
    int b2 = 328;
    int q2 = 55;
    int n2 = 24273;
    assertEquals(46920, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case48() {
    int b1 = 416;
    int q1 = 3844;
    int n1 = 20143;
    int b2 = 869;
    int q2 = 8433;
    int n2 = 18876;
    assertEquals(39019, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case49() {
    int b1 = 699;
    int q1 = 21;
    int n1 = 18652;
    int b2 = 322;
    int q2 = 1998;
    int n2 = 21882;
    assertEquals(40534, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case50() {
    int b1 = 712;
    int q1 = 5075;
    int n1 = 24390;
    int b2 = 892;
    int q2 = 8476;
    int n2 = 3558;
    assertEquals(27948, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case51() {
    int b1 = 688;
    int q1 = 7861;
    int n1 = 26870;
    int b2 = 3;
    int q2 = 2510;
    int n2 = 2601;
    assertEquals(29471, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case52() {
    int b1 = 585;
    int q1 = 5002;
    int n1 = 16424;
    int b2 = 255;
    int q2 = 9789;
    int n2 = 13402;
    assertEquals(29826, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case53() {
    int b1 = 757;
    int q1 = 8617;
    int n1 = 31427;
    int b2 = 88;
    int q2 = 285;
    int n2 = 24183;
    assertEquals(55610, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case54() {
    int b1 = 189;
    int q1 = 5721;
    int n1 = 2155;
    int b2 = 169;
    int q2 = 932;
    int n2 = 9833;
    assertEquals(11988, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case55() {
    int b1 = 555;
    int q1 = 1425;
    int n1 = 100408;
    int b2 = 368;
    int q2 = 1329;
    int n2 = 100424;
    assertEquals(200832, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case56() {
    int b1 = 60;
    int q1 = 145;
    int n1 = 100488;
    int b2 = 441;
    int q2 = 6549;
    int n2 = 100466;
    assertEquals(200954, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case57() {
    int b1 = 996;
    int q1 = 6279;
    int n1 = 100477;
    int b2 = 139;
    int q2 = 3753;
    int n2 = 100482;
    assertEquals(200959, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case58() {
    int b1 = 949;
    int q1 = 9866;
    int n1 = 100463;
    int b2 = 549;
    int q2 = 2529;
    int n2 = 100413;
    assertEquals(200876, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case59() {
    int b1 = 105;
    int q1 = 8286;
    int n1 = 100484;
    int b2 = 297;
    int q2 = 3195;
    int n2 = 100407;
    assertEquals(200891, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case60() {
    int b1 = 701;
    int q1 = 8114;
    int n1 = 100466;
    int b2 = 455;
    int q2 = 6282;
    int n2 = 100412;
    assertEquals(200878, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case61() {
    int b1 = 355;
    int q1 = 4313;
    int n1 = 100437;
    int b2 = 786;
    int q2 = 671;
    int n2 = 100484;
    assertEquals(200921, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case62() {
    int b1 = 945;
    int q1 = 1832;
    int n1 = 100492;
    int b2 = 912;
    int q2 = 53;
    int n2 = 100415;
    assertEquals(200907, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case63() {
    int b1 = 982;
    int q1 = 3646;
    int n1 = 100442;
    int b2 = 321;
    int q2 = 7756;
    int n2 = 100487;
    assertEquals(200929, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case64() {
    int b1 = 161;
    int q1 = 7129;
    int n1 = 100478;
    int b2 = 196;
    int q2 = 4144;
    int n2 = 100419;
    assertEquals(200897, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case65() {
    int b1 = 659;
    int q1 = 2044;
    int n1 = 100434;
    int b2 = 173;
    int q2 = 450;
    int n2 = 100465;
    assertEquals(200899, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case66() {
    int b1 = 510;
    int q1 = 6154;
    int n1 = 100476;
    int b2 = 253;
    int q2 = 6439;
    int n2 = 100408;
    assertEquals(200884, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case67() {
    int b1 = 22;
    int q1 = 4474;
    int n1 = 100487;
    int b2 = 186;
    int q2 = 649;
    int n2 = 100455;
    assertEquals(200942, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case68() {
    int b1 = 391;
    int q1 = 7958;
    int n1 = 100495;
    int b2 = 787;
    int q2 = 4018;
    int n2 = 100432;
    assertEquals(200927, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case69() {
    int b1 = 824;
    int q1 = 9314;
    int n1 = 100486;
    int b2 = 477;
    int q2 = 3625;
    int n2 = 100498;
    assertEquals(200984, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case70() {
    int b1 = 70;
    int q1 = 1833;
    int n1 = 100441;
    int b2 = 372;
    int q2 = 5874;
    int n2 = 100466;
    assertEquals(200907, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case71() {
    int b1 = 270;
    int q1 = 7773;
    int n1 = 100423;
    int b2 = 518;
    int q2 = 8297;
    int n2 = 100413;
    assertEquals(200836, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case72() {
    int b1 = 480;
    int q1 = 3102;
    int n1 = 100415;
    int b2 = 192;
    int q2 = 2668;
    int n2 = 100437;
    assertEquals(200852, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case73() {
    int b1 = 625;
    int q1 = 527;
    int n1 = 100401;
    int b2 = 802;
    int q2 = 7627;
    int n2 = 100487;
    assertEquals(200888, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case74() {
    int b1 = 181;
    int q1 = 3061;
    int n1 = 100428;
    int b2 = 23;
    int q2 = 1924;
    int n2 = 100457;
    assertEquals(200885, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case75() {
    int b1 = 64361782;
    int q1 = 278265998;
    int n1 = 13032;
    int b2 = 404190149;
    int q2 = 398909281;
    int n2 = 31004;
    assertEquals(44036, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case76() {
    int b1 = 7731313;
    int q1 = 467628530;
    int n1 = 30975;
    int b2 = 273962893;
    int q2 = 258886387;
    int n2 = 13065;
    assertEquals(44040, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case77() {
    int b1 = 88331384;
    int q1 = 4601214;
    int n1 = 12551;
    int b2 = 152935541;
    int q2 = 344122576;
    int n2 = 19712;
    assertEquals(32263, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case78() {
    int b1 = 153311297;
    int q1 = 69235394;
    int n1 = 26303;
    int b2 = 210891650;
    int q2 = 69658576;
    int n2 = 28020;
    assertEquals(54323, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case79() {
    int b1 = 17776006;
    int q1 = 91768487;
    int n1 = 23153;
    int b2 = 432729471;
    int q2 = 335060730;
    int n2 = 23852;
    assertEquals(47005, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case80() {
    int b1 = 234755061;
    int q1 = 394647782;
    int n1 = 30228;
    int b2 = 165691496;
    int q2 = 155909546;
    int n2 = 9011;
    assertEquals(39239, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case81() {
    int b1 = 184483000;
    int q1 = 86041627;
    int n1 = 14475;
    int b2 = 114291593;
    int q2 = 59903613;
    int n2 = 7883;
    assertEquals(22358, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case82() {
    int b1 = 334102285;
    int q1 = 122467277;
    int n1 = 24597;
    int b2 = 490274939;
    int q2 = 434550262;
    int n2 = 25424;
    assertEquals(50021, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case83() {
    int b1 = 210101195;
    int q1 = 450663219;
    int n1 = 20327;
    int b2 = 265950118;
    int q2 = 270669882;
    int n2 = 1265;
    assertEquals(21592, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case84() {
    int b1 = 111530245;
    int q1 = 161894771;
    int n1 = 21764;
    int b2 = 489059820;
    int q2 = 205197150;
    int n2 = 21154;
    assertEquals(42918, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case85() {
    int b1 = 353874983;
    int q1 = 376079536;
    int n1 = 13008;
    int b2 = 76004269;
    int q2 = 80438542;
    int n2 = 30901;
    assertEquals(43909, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case86() {
    int b1 = 148862018;
    int q1 = 191845671;
    int n1 = 5109;
    int b2 = 76159309;
    int q2 = 418139037;
    int n2 = 2304;
    assertEquals(7413, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case87() {
    int b1 = 420609636;
    int q1 = 19473952;
    int n1 = 6541;
    int b2 = 397338317;
    int q2 = 234933697;
    int n2 = 14461;
    assertEquals(21002, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case88() {
    int b1 = 279393325;
    int q1 = 53290125;
    int n1 = 23217;
    int b2 = 474665036;
    int q2 = 461759623;
    int n2 = 6073;
    assertEquals(29290, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case89() {
    int b1 = 416729352;
    int q1 = 470499968;
    int n1 = 13023;
    int b2 = 462114144;
    int q2 = 262567997;
    int n2 = 29338;
    assertEquals(42361, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case90() {
    int b1 = 230625183;
    int q1 = 214934244;
    int n1 = 4566;
    int b2 = 290683301;
    int q2 = 287799911;
    int n2 = 11586;
    assertEquals(16152, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case91() {
    int b1 = 238331539;
    int q1 = 203117345;
    int n1 = 16973;
    int b2 = 474330366;
    int q2 = 55814400;
    int n2 = 12054;
    assertEquals(29027, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case92() {
    int b1 = 72865406;
    int q1 = 153203338;
    int n1 = 22849;
    int b2 = 381265747;
    int q2 = 81363855;
    int n2 = 2608;
    assertEquals(25457, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case93() {
    int b1 = 53312702;
    int q1 = 105563598;
    int n1 = 17826;
    int b2 = 161115859;
    int q2 = 213375189;
    int n2 = 23755;
    assertEquals(41581, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case94() {
    int b1 = 53667750;
    int q1 = 399552958;
    int n1 = 22702;
    int b2 = 70119943;
    int q2 = 41489194;
    int n2 = 15206;
    assertEquals(37908, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case95() {
    int b1 = 1112;
    int q1 = 2;
    int n1 = 6963;
    int b2 = 1112;
    int q2 = 2;
    int n2 = 1994;
    assertEquals(6963, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case96() {
    int b1 = 2700;
    int q1 = 8;
    int n1 = 24856;
    int b2 = 2400;
    int q2 = 3;
    int n2 = 14414;
    assertEquals(39269, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case97() {
    int b1 = 611;
    int q1 = 8;
    int n1 = 1753;
    int b2 = 2444;
    int q2 = 4;
    int n2 = 30878;
    assertEquals(31755, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case98() {
    int b1 = 16152;
    int q1 = 8;
    int n1 = 20073;
    int b2 = 5384;
    int q2 = 24;
    int n2 = 10041;
    assertEquals(30113, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case99() {
    int b1 = 17;
    int q1 = 8;
    int n1 = 13170;
    int b2 = 136;
    int q2 = 216;
    int n2 = 14933;
    assertEquals(28102, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case100() {
    int b1 = 1464;
    int q1 = 9;
    int n1 = 2590;
    int b2 = 1464;
    int q2 = 9;
    int n2 = 28686;
    assertEquals(28686, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case101() {
    int b1 = 22592;
    int q1 = 27;
    int n1 = 22045;
    int b2 = 353;
    int q2 = 4;
    int n2 = 19315;
    assertEquals(41359, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case102() {
    int b1 = 3795;
    int q1 = 3;
    int n1 = 12182;
    int b2 = 759;
    int q2 = 5;
    int n2 = 11193;
    assertEquals(23374, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case103() {
    int b1 = 4650;
    int q1 = 3;
    int n1 = 17550;
    int b2 = 2325;
    int q2 = 6;
    int n2 = 20609;
    assertEquals(38158, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case104() {
    int b1 = 10032;
    int q1 = 4;
    int n1 = 31241;
    int b2 = 2508;
    int q2 = 4;
    int n2 = 6468;
    assertEquals(31242, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case105() {
    int b1 = 601;
    int q1 = 16;
    int n1 = 8214;
    int b2 = 38464;
    int q2 = 24;
    int n2 = 6078;
    assertEquals(14292, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case106() {
    int b1 = 601;
    int q1 = 16;
    int n1 = 26429;
    int b2 = 9616;
    int q2 = 6;
    int n2 = 23393;
    assertEquals(49821, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case107() {
    int b1 = 75;
    int q1 = 5;
    int n1 = 6288;
    int b2 = 1800;
    int q2 = 5;
    int n2 = 18787;
    assertEquals(25075, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case108() {
    int b1 = 108648;
    int q1 = 24;
    int n1 = 2364;
    int b2 = 12072;
    int q2 = 36;
    int n2 = 21222;
    assertEquals(23586, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case109() {
    int b1 = 105624;
    int q1 = 6;
    int n1 = 7620;
    int b2 = 17604;
    int q2 = 216;
    int n2 = 18241;
    assertEquals(23321, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case110() {
    int b1 = 5346;
    int q1 = 9999;
    int n1 = 75617;
    int b2 = 5346;
    int q2 = 1000;
    int n2 = 2252;
    assertEquals(77868, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case111() {
    int b1 = 495;
    int q1 = 100000;
    int n1 = 63296;
    int b2 = 5000;
    int q2 = 9999;
    int n2 = 34269;
    assertEquals(97565, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case112() {
    int b1 = 4653;
    int q1 = 100000;
    int n1 = 53594;
    int b2 = 469953;
    int q2 = 9999;
    int n2 = 8917;
    assertEquals(62511, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case113() {
    int b1 = 2277;
    int q1 = 10;
    int n1 = 52640;
    int b2 = 2300000;
    int q2 = 10;
    int n2 = 86141;
    assertEquals(138781, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case114() {
    int b1 = 5742;
    int q1 = 100000;
    int n1 = 41957;
    int b2 = 58000000;
    int q2 = 1000;
    int n2 = 25563;
    assertEquals(67520, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case115() {
    int b1 = 9000;
    int q1 = 100000;
    int n1 = 69738;
    int b2 = 9000;
    int q2 = 10;
    int n2 = 55623;
    assertEquals(114236, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case116() {
    int b1 = 28000;
    int q1 = 9999;
    int n1 = 84972;
    int b2 = 279972;
    int q2 = 10;
    int n2 = 28807;
    assertEquals(113778, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case117() {
    int b1 = 62000;
    int q1 = 1000;
    int n1 = 85713;
    int b2 = 6200000;
    int q2 = 1000;
    int n2 = 75266;
    assertEquals(160979, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case118() {
    int b1 = 13000;
    int q1 = 99;
    int n1 = 10584;
    int b2 = 13000000;
    int q2 = 9999;
    int n2 = 43275;
    assertEquals(53859, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case119() {
    int b1 = 499950;
    int q1 = 100000;
    int n1 = 88;
    int b2 = 499950;
    int q2 = 10;
    int n2 = 16699;
    assertEquals(16699, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case120() {
    int b1 = 529947;
    int q1 = 1000;
    int n1 = 37915;
    int b2 = 5300000;
    int q2 = 9999;
    int n2 = 8834;
    assertEquals(46749, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case121() {
    int b1 = 89991;
    int q1 = 9999;
    int n1 = 4768;
    int b2 = 9000000;
    int q2 = 100000;
    int n2 = 14049;
    assertEquals(18817, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case122() {
    int b1 = 200000;
    int q1 = 9999;
    int n1 = 5279;
    int b2 = 200000;
    int q2 = 10;
    int n2 = 63668;
    assertEquals(68946, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case123() {
    int b1 = 6400000;
    int q1 = 9999;
    int n1 = 23852;
    int b2 = 64000000;
    int q2 = 99;
    int n2 = 2076;
    assertEquals(25928, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case124() {
    int b1 = 33000000;
    int q1 = 10;
    int n1 = 81207;
    int b2 = 33000000;
    int q2 = 10;
    int n2 = 2250;
    assertEquals(81207, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case125() {
    int b1 = 10976;
    int q1 = 2744;
    int n1 = 45557;
    int b2 = 10976;
    int q2 = 2744;
    int n2 = 96680;
    assertEquals(96680, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case126() {
    int b1 = 7448;
    int q1 = 196;
    int n1 = 47246;
    int b2 = 104272;
    int q2 = 14;
    int n2 = 33675;
    assertEquals(64084, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case127() {
    int b1 = 117992;
    int q1 = 2744;
    int n1 = 14835;
    int b2 = 117992;
    int q2 = 196;
    int n2 = 74301;
    assertEquals(81718, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case128() {
    int b1 = 8820;
    int q1 = 2744;
    int n1 = 63077;
    int b2 = 8820;
    int q2 = 2744;
    int n2 = 76235;
    assertEquals(76235, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case129() {
    int b1 = 10780;
    int q1 = 2744;
    int n1 = 55754;
    int b2 = 150920;
    int q2 = 196;
    int n2 = 28491;
    assertEquals(74748, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case130() {
    int b1 = 178360;
    int q1 = 14;
    int n1 = 53742;
    int b2 = 178360;
    int q2 = 2744;
    int n2 = 24228;
    assertEquals(60056, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case131() {
    int b1 = 1008;
    int q1 = 24;
    int n1 = 61280;
    int b2 = 1008;
    int q2 = 624;
    int n2 = 75218;
    assertEquals(136497, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case132() {
    int b1 = 144;
    int q1 = 624;
    int n1 = 20117;
    int b2 = 744;
    int q2 = 3125;
    int n2 = 97215;
    assertEquals(117332, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case133() {
    int b1 = 624;
    int q1 = 124;
    int n1 = 49697;
    int b2 = 16224;
    int q2 = 5;
    int n2 = 90283;
    assertEquals(139980, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case134() {
    int b1 = 864;
    int q1 = 24;
    int n1 = 17984;
    int b2 = 112500;
    int q2 = 24;
    int n2 = 92447;
    assertEquals(110431, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case135() {
    int b1 = 1344;
    int q1 = 124;
    int n1 = 61448;
    int b2 = 874944;
    int q2 = 24;
    int n2 = 92520;
    assertEquals(153968, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case136() {
    int b1 = 6820;
    int q1 = 5;
    int n1 = 53526;
    int b2 = 6820;
    int q2 = 24;
    int n2 = 54693;
    assertEquals(108218, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case137() {
    int b1 = 3100;
    int q1 = 24;
    int n1 = 59073;
    int b2 = 15600;
    int q2 = 124;
    int n2 = 12562;
    assertEquals(71635, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case138() {
    int b1 = 6200;
    int q1 = 124;
    int n1 = 31062;
    int b2 = 156250;
    int q2 = 3125;
    int n2 = 32684;
    assertEquals(63746, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case139() {
    int b1 = 1984;
    int q1 = 124;
    int n1 = 66702;
    int b2 = 249984;
    int q2 = 624;
    int n2 = 21792;
    assertEquals(88494, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case140() {
    int b1 = 33696;
    int q1 = 624;
    int n1 = 42772;
    int b2 = 33696;
    int q2 = 3125;
    int n2 = 78913;
    assertEquals(121684, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case141() {
    int b1 = 29952;
    int q1 = 3125;
    int n1 = 81331;
    int b2 = 150000;
    int q2 = 124;
    int n2 = 12644;
    assertEquals(93975, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case142() {
    int b1 = 17472;
    int q1 = 5;
    int n1 = 50578;
    int b2 = 437472;
    int q2 = 5;
    int n2 = 63960;
    assertEquals(114538, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case143() {
    int b1 = 156250;
    int q1 = 5;
    int n1 = 35714;
    int b2 = 156250;
    int q2 = 24;
    int n2 = 45797;
    assertEquals(81510, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case144() {
    int b1 = 237500;
    int q1 = 624;
    int n1 = 10688;
    int b2 = 1187424;
    int q2 = 3125;
    int n2 = 44712;
    assertEquals(55400, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case145() {
    int b1 = 1390536;
    int q1 = 624;
    int n1 = 92028;
    int b2 = 1390536;
    int q2 = 124;
    int n2 = 40965;
    assertEquals(132992, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case146() {
    int b1 = 499999999;
    int q1 = 0;
    int n1 = 100500;
    int b2 = 500000000;
    int q2 = 500000000;
    int n2 = 100500;
    assertEquals(100502, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case147() {
    int b1 = 499999999;
    int q1 = 0;
    int n1 = 100500;
    int b2 = 500000000;
    int q2 = 0;
    int n2 = 100500;
    assertEquals(3, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case148() {
    int b1 = 499999999;
    int q1 = 1;
    int n1 = 100500;
    int b2 = 500000000;
    int q2 = 500000000;
    int n2 = 100500;
    assertEquals(100501, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case149() {
    int b1 = 499999999;
    int q1 = 1;
    int n1 = 100500;
    int b2 = 500000000;
    int q2 = 1;
    int n2 = 100500;
    assertEquals(2, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case150() {
    int b1 = 500000000;
    int q1 = 1;
    int n1 = 100500;
    int b2 = 500000000;
    int q2 = 500000000;
    int n2 = 100500;
    assertEquals(100500, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case151() {
    int b1 = 500000000;
    int q1 = 1;
    int n1 = 100500;
    int b2 = 500000000;
    int q2 = 1;
    int n2 = 100500;
    assertEquals(1, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case152() {
    int b1 = 499999999;
    int q1 = 499999999;
    int n1 = 100500;
    int b2 = 500000000;
    int q2 = 500000000;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case153() {
    int b1 = 499999998;
    int q1 = 500000000;
    int n1 = 100500;
    int b2 = 499999999;
    int q2 = 499999999;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case154() {
    int b1 = 446185740;
    int q1 = 410498683;
    int n1 = 100500;
    int b2 = 268953270;
    int q2 = 164601714;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case155() {
    int b1 = 1;
    int q1 = 274684395;
    int n1 = 100500;
    int b2 = 251020324;
    int q2 = 255002404;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case156() {
    int b1 = 1;
    int q1 = 493335308;
    int n1 = 100500;
    int b2 = 90742056;
    int q2 = 43867919;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case157() {
    int b1 = 1000007;
    int q1 = 1000007;
    int n1 = 100500;
    int b2 = 1000009;
    int q2 = 1000009;
    int n2 = 100000;
    assertEquals(200500, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case158() {
    int b1 = 33554430;
    int q1 = 33554432;
    int n1 = 100500;
    int b2 = 33554431;
    int q2 = 33554432;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case159() {
    int b1 = 4194304;
    int q1 = 4194304;
    int n1 = 100500;
    int b2 = 4194303;
    int q2 = 4194304;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case160() {
    int b1 = 4194304;
    int q1 = 4194304;
    int n1 = 100500;
    int b2 = 4194304;
    int q2 = 4194304;
    int n2 = 100500;
    assertEquals(100500, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case161() {
    int b1 = 11;
    int q1 = 0;
    int n1 = 100500;
    int b2 = 15;
    int q2 = 61;
    int n2 = 10516;
    assertEquals(10518, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case162() {
    int b1 = 11;
    int q1 = 1;
    int n1 = 11021;
    int b2 = 54;
    int q2 = 84;
    int n2 = 15468;
    assertEquals(15469, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case163() {
    int b1 = 65415;
    int q1 = 46845;
    int n1 = 46515;
    int b2 = 54684;
    int q2 = 0;
    int n2 = 46558;
    assertEquals(46517, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case164() {
    int b1 = 7;
    int q1 = 4;
    int n1 = 5;
    int b2 = 8;
    int q2 = 0;
    int n2 = 1;
    assertEquals(6, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case165() {
    int b1 = 12;
    int q1 = 0;
    int n1 = 1;
    int b2 = 42;
    int q2 = 31;
    int n2 = 1;
    assertEquals(2, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case166() {
    int b1 = 1;
    int q1 = 247256567;
    int n1 = 100500;
    int b2 = 33883938;
    int q2 = 19096233;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case167() {
    int b1 = 15;
    int q1 = 5;
    int n1 = 20;
    int b2 = 3;
    int q2 = 25;
    int n2 = 50;
    assertEquals(60, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case168() {
    int b1 = 3;
    int q1 = 4;
    int n1 = 100500;
    int b2 = 48;
    int q2 = 102499;
    int n2 = 100000;
    assertEquals(200499, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case169() {
    int b1 = 500000000;
    int q1 = 500000000;
    int n1 = 100500;
    int b2 = 500000000;
    int q2 = 500000000;
    int n2 = 100500;
    assertEquals(100500, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case170() {
    int b1 = 499999999;
    int q1 = 499999999;
    int n1 = 100500;
    int b2 = 499999997;
    int q2 = 499999997;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case171() {
    int b1 = 8;
    int q1 = 4;
    int n1 = 10500;
    int b2 = 16;
    int q2 = 64;
    int n2 = 10500;
    assertEquals(21000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case172() {
    int b1 = 500000000;
    int q1 = 500000000;
    int n1 = 100000;
    int b2 = 500000000;
    int q2 = 500000000;
    int n2 = 100000;
    assertEquals(100000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case173() {
    int b1 = 9;
    int q1 = 108;
    int n1 = 10300;
    int b2 = 36;
    int q2 = 4;
    int n2 = 1100;
    assertEquals(11400, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case174() {
    int b1 = 500000000;
    int q1 = 500000000;
    int n1 = 45;
    int b2 = 35;
    int q2 = 67;
    int n2 = 78;
    assertEquals(123, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case175() {
    int b1 = 100000000;
    int q1 = 200000000;
    int n1 = 10500;
    int b2 = 300000000;
    int q2 = 150000000;
    int n2 = 10400;
    assertEquals(20900, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case176() {
    int b1 = 500000000;
    int q1 = 500000000;
    int n1 = 13333;
    int b2 = 500000000;
    int q2 = 500000000;
    int n2 = 13333;
    assertEquals(13333, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case177() {
    int b1 = 499999999;
    int q1 = 99999999;
    int n1 = 99;
    int b2 = 499292939;
    int q2 = 391989849;
    int n2 = 30;
    assertEquals(129, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case178() {
    int b1 = 510510;
    int q1 = 510510;
    int n1 = 100500;
    int b2 = 485100;
    int q2 = 485100;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case179() {
    int b1 = 499999999;
    int q1 = 499999977;
    int n1 = 100500;
    int b2 = 499999799;
    int q2 = 499999997;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case180() {
    int b1 = 30;
    int q1 = 30;
    int n1 = 100000;
    int b2 = 6;
    int q2 = 150;
    int n2 = 100000;
    assertEquals(199999, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case181() {
    int b1 = 1000000;
    int q1 = 1000000;
    int n1 = 100500;
    int b2 = 1000000;
    int q2 = 1000000;
    int n2 = 100500;
    assertEquals(100500, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case182() {
    int b1 = 400000000;
    int q1 = 400000000;
    int n1 = 99;
    int b2 = 400000000;
    int q2 = 400000000;
    int n2 = 400;
    assertEquals(400, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case183() {
    int b1 = 400;
    int q1 = 210;
    int n1 = 100500;
    int b2 = 2;
    int q2 = 210;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case184() {
    int b1 = 499999999;
    int q1 = 499999999;
    int n1 = 100000;
    int b2 = 499999999;
    int q2 = 499999999;
    int n2 = 100000;
    assertEquals(100000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case185() {
    int b1 = 500000000;
    int q1 = 500000000;
    int n1 = 100500;
    int b2 = 499999999;
    int q2 = 500000000;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case186() {
    int b1 = 0;
    int q1 = 0;
    int n1 = 100300;
    int b2 = 0;
    int q2 = 0;
    int n2 = 100300;
    assertEquals(1, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case187() {
    int b1 = 30;
    int q1 = 77;
    int n1 = 10000;
    int b2 = 33;
    int q2 = 70;
    int n2 = 500;
    assertEquals(10499, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case188() {
    int b1 = 499999997;
    int q1 = 499999999;
    int n1 = 100489;
    int b2 = 499999999;
    int q2 = 499999997;
    int n2 = 100499;
    assertEquals(200987, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case189() {
    int b1 = 400000000;
    int q1 = 400000000;
    int n1 = 100000;
    int b2 = 400004235;
    int q2 = 213421323;
    int n2 = 100001;
    assertEquals(200001, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case190() {
    int b1 = 500000000;
    int q1 = 50000000;
    int n1 = 10050;
    int b2 = 3650;
    int q2 = 100000000;
    int n2 = 65;
    assertEquals(10115, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case191() {
    int b1 = 483229421;
    int q1 = 483228817;
    int n1 = 100500;
    int b2 = 483231491;
    int q2 = 483229387;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case192() {
    int b1 = 12;
    int q1 = 1581;
    int n1 = 100400;
    int b2 = 151;
    int q2 = 3;
    int n2 = 100100;
    assertEquals(200500, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case193() {
    int b1 = 500000000;
    int q1 = 499999999;
    int n1 = 100500;
    int b2 = 498765432;
    int q2 = 499999998;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case194() {
    int b1 = 477777777;
    int q1 = 50000000;
    int n1 = 100500;
    int b2 = 5000000;
    int q2 = 477777777;
    int n2 = 100000;
    assertEquals(200500, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case195() {
    int b1 = 499999999;
    int q1 = 498765432;
    int n1 = 100500;
    int b2 = 412345678;
    int q2 = 398765421;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case196() {
    int b1 = 12;
    int q1 = 53;
    int n1 = 1005;
    int b2 = 12;
    int q2 = 106;
    int n2 = 100500;
    assertEquals(101504, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case197() {
    int b1 = 500000000;
    int q1 = 500000000;
    int n1 = 100500;
    int b2 = 49999999;
    int q2 = 49999999;
    int n2 = 100499;
    assertEquals(200999, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case198() {
    int b1 = 200;
    int q1 = 20000;
    int n1 = 100500;
    int b2 = 197;
    int q2 = 15478;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case199() {
    int b1 = 478296791;
    int q1 = 18234627;
    int n1 = 100500;
    int b2 = 478296787;
    int q2 = 12415135;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case200() {
    int b1 = 3;
    int q1 = 4;
    int n1 = 100500;
    int b2 = 48;
    int q2 = 1024;
    int n2 = 100500;
    assertEquals(180900, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case201() {
    int b1 = 500000000;
    int q1 = 455454545;
    int n1 = 100000;
    int b2 = 445448488;
    int q2 = 465656644;
    int n2 = 100000;
    assertEquals(200000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case202() {
    int b1 = 1;
    int q1 = 0;
    int n1 = 1;
    int b2 = 2;
    int q2 = 0;
    int n2 = 1;
    assertEquals(2, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case203() {
    int b1 = 100;
    int q1 = 10000000;
    int n1 = 12356;
    int b2 = 957813;
    int q2 = 97626322;
    int n2 = 10953;
    assertEquals(23309, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case204() {
    int b1 = 1;
    int q1 = 1;
    int n1 = 1;
    int b2 = 1;
    int q2 = 0;
    int n2 = 1;
    assertEquals(1, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case205() {
    int b1 = 1;
    int q1 = 1000000;
    int n1 = 100500;
    int b2 = 1;
    int q2 = 1000;
    int n2 = 100500;
    assertEquals(150750, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case206() {
    int b1 = 17;
    int q1 = 2;
    int n1 = 100499;
    int b2 = 19;
    int q2 = 7;
    int n2 = 100245;
    assertEquals(200744, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case207() {
    int b1 = 500000000;
    int q1 = 500000000;
    int n1 = 100500;
    int b2 = 499999999;
    int q2 = 499999999;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case208() {
    int b1 = 6;
    int q1 = 6;
    int n1 = 100500;
    int b2 = 4;
    int q2 = 4;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case209() {
    int b1 = 0;
    int q1 = 1;
    int n1 = 100500;
    int b2 = 2;
    int q2 = 0;
    int n2 = 100500;
    assertEquals(2, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case210() {
    int b1 = 1;
    int q1 = 1;
    int n1 = 10000;
    int b2 = 1;
    int q2 = 1;
    int n2 = 99999;
    assertEquals(1, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case211() {
    int b1 = 8;
    int q1 = 1;
    int n1 = 100;
    int b2 = 8;
    int q2 = 1;
    int n2 = 200;
    assertEquals(1, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case212() {
    int b1 = 3;
    int q1 = 3;
    int n1 = 50000;
    int b2 = 2;
    int q2 = 2;
    int n2 = 50000;
    assertEquals(100000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case213() {
    int b1 = 498792878;
    int q1 = 298191928;
    int n1 = 100000;
    int b2 = 222828721;
    int q2 = 9878282;
    int n2 = 100098;
    assertEquals(200098, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case214() {
    int b1 = 499999999;
    int q1 = 499999999;
    int n1 = 100500;
    int b2 = 499999999;
    int q2 = 399999999;
    int n2 = 100500;
    assertEquals(200999, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case215() {
    int b1 = 1;
    int q1 = 1;
    int n1 = 10000;
    int b2 = 1;
    int q2 = 1;
    int n2 = 9000;
    assertEquals(1, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case216() {
    int b1 = 200;
    int q1 = 500000000;
    int n1 = 100500;
    int b2 = 197;
    int q2 = 490000000;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case217() {
    int b1 = 2;
    int q1 = 16;
    int n1 = 100500;
    int b2 = 64;
    int q2 = 2;
    int n2 = 100500;
    assertEquals(175875, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case218() {
    int b1 = 1;
    int q1 = 4;
    int n1 = 100500;
    int b2 = 1;
    int q2 = 4;
    int n2 = 100500;
    assertEquals(100500, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case219() {
    int b1 = 499000011;
    int q1 = 499000011;
    int n1 = 100000;
    int b2 = 499000013;
    int q2 = 499000013;
    int n2 = 100100;
    assertEquals(200100, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case220() {
    int b1 = 495104921;
    int q1 = 500000000;
    int n1 = 100500;
    int b2 = 495104551;
    int q2 = 376554347;
    int n2 = 100123;
    assertEquals(200623, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case221() {
    int b1 = 500000000;
    int q1 = 99999999;
    int n1 = 100500;
    int b2 = 500000000;
    int q2 = 99992399;
    int n2 = 100400;
    assertEquals(200899, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case222() {
    int b1 = 500000000;
    int q1 = 500000000;
    int n1 = 100000;
    int b2 = 499999999;
    int q2 = 500000000;
    int n2 = 99999;
    assertEquals(199999, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case223() {
    int b1 = 0;
    int q1 = 2;
    int n1 = 10;
    int b2 = 0;
    int q2 = 3;
    int n2 = 20;
    assertEquals(1, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case224() {
    int b1 = 1;
    int q1 = 0;
    int n1 = 1000;
    int b2 = 10;
    int q2 = 0;
    int n2 = 1200;
    assertEquals(3, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case225() {
    int b1 = 151581151;
    int q1 = 89;
    int n1 = 100500;
    int b2 = 141362197;
    int q2 = 83;
    int n2 = 100500;
    assertEquals(201000, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case226() {
    int b1 = 0;
    int q1 = 100500;
    int n1 = 100500;
    int b2 = 0;
    int q2 = 100500;
    int n2 = 100500;
    assertEquals(1, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case227() {
    int b1 = 3;
    int q1 = 1;
    int n1 = 100217;
    int b2 = 5;
    int q2 = 1;
    int n2 = 100207;
    assertEquals(2, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

  @Test
  public void case228() {
    int b1 = 1;
    int q1 = 0;
    int n1 = 100500;
    int b2 = 1;
    int q2 = 1;
    int n2 = 100499;
    assertEquals(2, geometricprogressions.count(b1, q1, n1, b2, q2, n2));
  }

}
