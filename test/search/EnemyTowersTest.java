package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class EnemyTowersTest {
  EnemyTowers enemytowers = new EnemyTowers();

  @Test
  public void case1() {
    int myUnits = 7;
    int hpT = 2;
    int attackT = 1;
    int numWodT = 2;
    int numStoT = 3;
    assertEquals(2, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case2() {
    int myUnits = 120;
    int hpT = 10;
    int attackT = 40000;
    int numWodT = 6;
    int numStoT = 6;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case3() {
    int myUnits = 119;
    int hpT = 10;
    int attackT = 40000;
    int numWodT = 6;
    int numStoT = 6;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case4() {
    int myUnits = 200;
    int hpT = 50;
    int attackT = 3;
    int numWodT = 10;
    int numStoT = 5;
    assertEquals(6, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case5() {
    int myUnits = 1000000000;
    int hpT = 40000;
    int attackT = 5681;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(15, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case6() {
    int myUnits = 1000000000;
    int hpT = 40000;
    int attackT = 5682;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case7() {
    int myUnits = 1000000000;
    int hpT = 40000;
    int attackT = 40000;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case8() {
    int myUnits = 1000000000;
    int hpT = 16405;
    int attackT = 40000;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(5, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case9() {
    int myUnits = 1000000000;
    int hpT = 16406;
    int attackT = 40000;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case10() {
    int myUnits = 1000000000;
    int hpT = 40000;
    int attackT = 40000;
    int numWodT = 40000;
    int numStoT = 450;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case11() {
    int myUnits = 1000000000;
    int hpT = 40000;
    int attackT = 40000;
    int numWodT = 449;
    int numStoT = 40000;
    assertEquals(7, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case12() {
    int myUnits = 1000000000;
    int hpT = 40000;
    int attackT = 40000;
    int numWodT = 20226;
    int numStoT = 20224;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case13() {
    int myUnits = 1000000000;
    int hpT = 40000;
    int attackT = 40000;
    int numWodT = 20223;
    int numStoT = 20226;
    assertEquals(6, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case14() {
    int myUnits = 15960245;
    int hpT = 40000;
    int attackT = 1;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case15() {
    int myUnits = 15960246;
    int hpT = 40000;
    int attackT = 1;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(1648, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case16() {
    int myUnits = 2000000;
    int hpT = 10000;
    int attackT = 3;
    int numWodT = 10000;
    int numStoT = 10000;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case17() {
    int myUnits = 79999;
    int hpT = 1;
    int attackT = 40000;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case18() {
    int myUnits = 80000;
    int hpT = 1;
    int attackT = 40000;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case19() {
    int myUnits = 1;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case20() {
    int myUnits = 2;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case21() {
    int myUnits = 566;
    int hpT = 40000;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(265, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case22() {
    int myUnits = 565;
    int hpT = 40000;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case23() {
    int myUnits = 251082761;
    int hpT = 6321;
    int attackT = 39957;
    int numWodT = 7307;
    int numStoT = 37932;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case24() {
    int myUnits = 251082762;
    int hpT = 6321;
    int attackT = 39957;
    int numWodT = 7307;
    int numStoT = 37932;
    assertEquals(4, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case25() {
    int myUnits = 723344864;
    int hpT = 31765;
    int attackT = 21532;
    int numWodT = 38298;
    int numStoT = 2997;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case26() {
    int myUnits = 723344865;
    int hpT = 31765;
    int attackT = 21532;
    int numWodT = 38298;
    int numStoT = 2997;
    assertEquals(10, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case27() {
    int myUnits = 671716922;
    int hpT = 23944;
    int attackT = 26905;
    int numWodT = 39218;
    int numStoT = 4760;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case28() {
    int myUnits = 671716923;
    int hpT = 23944;
    int attackT = 26905;
    int numWodT = 39218;
    int numStoT = 4760;
    assertEquals(8, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case29() {
    int myUnits = 115935662;
    int hpT = 3363;
    int attackT = 19624;
    int numWodT = 29267;
    int numStoT = 10347;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case30() {
    int myUnits = 115935663;
    int hpT = 3363;
    int attackT = 19624;
    int numWodT = 29267;
    int numStoT = 10347;
    assertEquals(4, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case31() {
    int myUnits = 633551945;
    int hpT = 38483;
    int attackT = 21394;
    int numWodT = 3744;
    int numStoT = 28051;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case32() {
    int myUnits = 633551946;
    int hpT = 38483;
    int attackT = 21394;
    int numWodT = 3744;
    int numStoT = 28051;
    assertEquals(12, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case33() {
    int myUnits = 196215157;
    int hpT = 17449;
    int attackT = 13330;
    int numWodT = 5428;
    int numStoT = 14234;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case34() {
    int myUnits = 196215158;
    int hpT = 17449;
    int attackT = 13330;
    int numWodT = 5428;
    int numStoT = 14234;
    assertEquals(9, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case35() {
    int myUnits = 802412978;
    int hpT = 33056;
    int attackT = 20327;
    int numWodT = 22310;
    int numStoT = 23076;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case36() {
    int myUnits = 802412979;
    int hpT = 33056;
    int attackT = 20327;
    int numWodT = 22310;
    int numStoT = 23076;
    assertEquals(9, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case37() {
    int myUnits = 801950219;
    int hpT = 29442;
    int attackT = 18748;
    int numWodT = 14607;
    int numStoT = 35762;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case38() {
    int myUnits = 801950220;
    int hpT = 29442;
    int attackT = 18748;
    int numWodT = 14607;
    int numStoT = 35762;
    assertEquals(9, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case39() {
    int myUnits = 423357568;
    int hpT = 18704;
    int attackT = 18265;
    int numWodT = 30045;
    int numStoT = 6820;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case40() {
    int myUnits = 423357569;
    int hpT = 18704;
    int attackT = 18265;
    int numWodT = 30045;
    int numStoT = 6820;
    assertEquals(8, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case41() {
    int myUnits = 716286293;
    int hpT = 39797;
    int attackT = 24694;
    int numWodT = 9816;
    int numStoT = 23740;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case42() {
    int myUnits = 716286294;
    int hpT = 39797;
    int attackT = 24694;
    int numWodT = 9816;
    int numStoT = 23740;
    assertEquals(10, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case43() {
    int myUnits = 9918873;
    int hpT = 12094;
    int attackT = 4;
    int numWodT = 8494;
    int numStoT = 37014;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case44() {
    int myUnits = 9918874;
    int hpT = 12094;
    int attackT = 4;
    int numWodT = 8494;
    int numStoT = 37014;
    assertEquals(534, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case45() {
    int myUnits = 8851541;
    int hpT = 18779;
    int attackT = 10;
    int numWodT = 16183;
    int numStoT = 4479;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case46() {
    int myUnits = 8851542;
    int hpT = 18779;
    int attackT = 10;
    int numWodT = 16183;
    int numStoT = 4479;
    assertEquals(372, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case47() {
    int myUnits = 10331734;
    int hpT = 20454;
    int attackT = 6;
    int numWodT = 10006;
    int numStoT = 19739;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case48() {
    int myUnits = 10331735;
    int hpT = 20454;
    int attackT = 6;
    int numWodT = 10006;
    int numStoT = 19739;
    assertEquals(526, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case49() {
    int myUnits = 33998805;
    int hpT = 33147;
    int attackT = 8;
    int numWodT = 27098;
    int numStoT = 39439;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case50() {
    int myUnits = 33998806;
    int hpT = 33147;
    int attackT = 8;
    int numWodT = 27098;
    int numStoT = 39439;
    assertEquals(592, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case51() {
    int myUnits = 19536493;
    int hpT = 38655;
    int attackT = 4;
    int numWodT = 19391;
    int numStoT = 30545;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case52() {
    int myUnits = 19536494;
    int hpT = 38655;
    int attackT = 4;
    int numWodT = 19391;
    int numStoT = 30545;
    assertEquals(834, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case53() {
    int myUnits = 23066289;
    int hpT = 36448;
    int attackT = 5;
    int numWodT = 31608;
    int numStoT = 22741;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case54() {
    int myUnits = 23066290;
    int hpT = 36448;
    int attackT = 5;
    int numWodT = 31608;
    int numStoT = 22741;
    assertEquals(732, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case55() {
    int myUnits = 18936461;
    int hpT = 29745;
    int attackT = 7;
    int numWodT = 17533;
    int numStoT = 24285;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case56() {
    int myUnits = 18936462;
    int hpT = 29745;
    int attackT = 7;
    int numWodT = 17533;
    int numStoT = 24285;
    assertEquals(645, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case57() {
    int myUnits = 4134259;
    int hpT = 11755;
    int attackT = 1;
    int numWodT = 18106;
    int numStoT = 20201;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case58() {
    int myUnits = 4134260;
    int hpT = 11755;
    int attackT = 1;
    int numWodT = 18106;
    int numStoT = 20201;
    assertEquals(894, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case59() {
    int myUnits = 10703057;
    int hpT = 28847;
    int attackT = 9;
    int numWodT = 17214;
    int numStoT = 3977;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case60() {
    int myUnits = 10703058;
    int hpT = 28847;
    int attackT = 9;
    int numWodT = 17214;
    int numStoT = 3977;
    assertEquals(425, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case61() {
    int myUnits = 3678282;
    int hpT = 1901;
    int attackT = 8;
    int numWodT = 8455;
    int numStoT = 22354;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case62() {
    int myUnits = 3678283;
    int hpT = 1901;
    int attackT = 8;
    int numWodT = 8455;
    int numStoT = 22354;
    assertEquals(113, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case63() {
    int myUnits = 13053345;
    int hpT = 34937;
    int attackT = 1;
    int numWodT = 35774;
    int numStoT = 34248;
    assertEquals(2036, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case64() {
    int myUnits = 14911911;
    int hpT = 38094;
    int attackT = 1;
    int numWodT = 37999;
    int numStoT = 38598;
    assertEquals(2150, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case65() {
    int myUnits = 14970055;
    int hpT = 38854;
    int attackT = 1;
    int numWodT = 39791;
    int numStoT = 36347;
    assertEquals(2064, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case66() {
    int myUnits = 13243161;
    int hpT = 39967;
    int attackT = 1;
    int numWodT = 31153;
    int numStoT = 35255;
    assertEquals(2223, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case67() {
    int myUnits = 15357711;
    int hpT = 39918;
    int attackT = 1;
    int numWodT = 38674;
    int numStoT = 38385;
    assertEquals(2230, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case68() {
    int myUnits = 402;
    int hpT = 55;
    int attackT = 1;
    int numWodT = 4;
    int numStoT = 53;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case69() {
    int myUnits = 403;
    int hpT = 55;
    int attackT = 1;
    int numWodT = 4;
    int numStoT = 53;
    assertEquals(36, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case70() {
    int myUnits = 693;
    int hpT = 55;
    int attackT = 1;
    int numWodT = 4;
    int numStoT = 53;
    assertEquals(6, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case71() {
    int myUnits = 352;
    int hpT = 66;
    int attackT = 1;
    int numWodT = 37;
    int numStoT = 8;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case72() {
    int myUnits = 353;
    int hpT = 66;
    int attackT = 1;
    int numWodT = 37;
    int numStoT = 8;
    assertEquals(26, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case73() {
    int myUnits = 495;
    int hpT = 66;
    int attackT = 1;
    int numWodT = 37;
    int numStoT = 8;
    assertEquals(8, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case74() {
    int myUnits = 781;
    int hpT = 79;
    int attackT = 1;
    int numWodT = 28;
    int numStoT = 64;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case75() {
    int myUnits = 782;
    int hpT = 79;
    int attackT = 1;
    int numWodT = 28;
    int numStoT = 64;
    assertEquals(33, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case76() {
    int myUnits = 1307;
    int hpT = 79;
    int attackT = 1;
    int numWodT = 28;
    int numStoT = 64;
    assertEquals(7, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case77() {
    int myUnits = 1089;
    int hpT = 39;
    int attackT = 1;
    int numWodT = 97;
    int numStoT = 91;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case78() {
    int myUnits = 1090;
    int hpT = 39;
    int attackT = 1;
    int numWodT = 97;
    int numStoT = 91;
    assertEquals(26, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case79() {
    int myUnits = 1952;
    int hpT = 39;
    int attackT = 1;
    int numWodT = 97;
    int numStoT = 91;
    assertEquals(5, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case80() {
    int myUnits = 490;
    int hpT = 64;
    int attackT = 1;
    int numWodT = 7;
    int numStoT = 57;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case81() {
    int myUnits = 491;
    int hpT = 64;
    int attackT = 1;
    int numWodT = 7;
    int numStoT = 57;
    assertEquals(30, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case82() {
    int myUnits = 836;
    int hpT = 64;
    int attackT = 1;
    int numWodT = 7;
    int numStoT = 57;
    assertEquals(6, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case83() {
    int myUnits = 404;
    int hpT = 64;
    int attackT = 1;
    int numWodT = 52;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case84() {
    int myUnits = 405;
    int hpT = 64;
    int attackT = 1;
    int numWodT = 52;
    int numStoT = 1;
    assertEquals(36, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case85() {
    int myUnits = 468;
    int hpT = 64;
    int attackT = 1;
    int numWodT = 52;
    int numStoT = 1;
    assertEquals(11, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case86() {
    int myUnits = 703;
    int hpT = 26;
    int attackT = 1;
    int numWodT = 89;
    int numStoT = 62;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case87() {
    int myUnits = 704;
    int hpT = 26;
    int attackT = 1;
    int numWodT = 89;
    int numStoT = 62;
    assertEquals(17, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case88() {
    int myUnits = 1234;
    int hpT = 26;
    int attackT = 1;
    int numWodT = 89;
    int numStoT = 62;
    assertEquals(4, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case89() {
    int myUnits = 438;
    int hpT = 27;
    int attackT = 1;
    int numWodT = 85;
    int numStoT = 7;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case90() {
    int myUnits = 439;
    int hpT = 27;
    int attackT = 1;
    int numWodT = 85;
    int numStoT = 7;
    assertEquals(22, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case91() {
    int myUnits = 464;
    int hpT = 27;
    int attackT = 1;
    int numWodT = 85;
    int numStoT = 7;
    assertEquals(10, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case92() {
    int myUnits = 808;
    int hpT = 88;
    int attackT = 1;
    int numWodT = 11;
    int numStoT = 79;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case93() {
    int myUnits = 809;
    int hpT = 88;
    int attackT = 1;
    int numWodT = 11;
    int numStoT = 79;
    assertEquals(40, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case94() {
    int myUnits = 1580;
    int hpT = 88;
    int attackT = 1;
    int numWodT = 11;
    int numStoT = 79;
    assertEquals(6, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case95() {
    int myUnits = 739;
    int hpT = 47;
    int attackT = 1;
    int numWodT = 38;
    int numStoT = 77;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case96() {
    int myUnits = 740;
    int hpT = 47;
    int attackT = 1;
    int numWodT = 38;
    int numStoT = 77;
    assertEquals(25, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case97() {
    int myUnits = 1057;
    int hpT = 47;
    int attackT = 1;
    int numWodT = 38;
    int numStoT = 77;
    assertEquals(7, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case98() {
    int myUnits = 2;
    int hpT = 2;
    int attackT = 2;
    int numWodT = 2;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case99() {
    int myUnits = 1;
    int hpT = 2;
    int attackT = 2;
    int numWodT = 2;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case100() {
    int myUnits = 2;
    int hpT = 1;
    int attackT = 2;
    int numWodT = 2;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case101() {
    int myUnits = 1;
    int hpT = 1;
    int attackT = 2;
    int numWodT = 2;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case102() {
    int myUnits = 2;
    int hpT = 2;
    int attackT = 1;
    int numWodT = 2;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case103() {
    int myUnits = 1;
    int hpT = 2;
    int attackT = 1;
    int numWodT = 2;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case104() {
    int myUnits = 2;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 2;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case105() {
    int myUnits = 1;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 2;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case106() {
    int myUnits = 2;
    int hpT = 2;
    int attackT = 2;
    int numWodT = 1;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case107() {
    int myUnits = 1;
    int hpT = 2;
    int attackT = 2;
    int numWodT = 1;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case108() {
    int myUnits = 2;
    int hpT = 1;
    int attackT = 2;
    int numWodT = 1;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case109() {
    int myUnits = 1;
    int hpT = 1;
    int attackT = 2;
    int numWodT = 1;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case110() {
    int myUnits = 2;
    int hpT = 2;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case111() {
    int myUnits = 1;
    int hpT = 2;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case112() {
    int myUnits = 2;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case113() {
    int myUnits = 1;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 2;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case114() {
    int myUnits = 2;
    int hpT = 2;
    int attackT = 2;
    int numWodT = 2;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case115() {
    int myUnits = 1;
    int hpT = 2;
    int attackT = 2;
    int numWodT = 2;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case116() {
    int myUnits = 2;
    int hpT = 1;
    int attackT = 2;
    int numWodT = 2;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case117() {
    int myUnits = 1;
    int hpT = 1;
    int attackT = 2;
    int numWodT = 2;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case118() {
    int myUnits = 2;
    int hpT = 2;
    int attackT = 1;
    int numWodT = 2;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case119() {
    int myUnits = 1;
    int hpT = 2;
    int attackT = 1;
    int numWodT = 2;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case120() {
    int myUnits = 2;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 2;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case121() {
    int myUnits = 1;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 2;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case122() {
    int myUnits = 2;
    int hpT = 2;
    int attackT = 2;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case123() {
    int myUnits = 1;
    int hpT = 2;
    int attackT = 2;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case124() {
    int myUnits = 2;
    int hpT = 1;
    int attackT = 2;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case125() {
    int myUnits = 1;
    int hpT = 1;
    int attackT = 2;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case126() {
    int myUnits = 2;
    int hpT = 2;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case127() {
    int myUnits = 1;
    int hpT = 2;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case128() {
    int myUnits = 2;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case129() {
    int myUnits = 1;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case130() {
    int myUnits = 14877;
    int hpT = 551;
    int attackT = 86;
    int numWodT = 18;
    int numStoT = 9;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case131() {
    int myUnits = 43;
    int hpT = 8;
    int attackT = 3;
    int numWodT = 3;
    int numStoT = 6;
    assertEquals(3, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case132() {
    int myUnits = 13;
    int hpT = 3;
    int attackT = 13;
    int numWodT = 2;
    int numStoT = 3;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case133() {
    int myUnits = 4553;
    int hpT = 55;
    int attackT = 9;
    int numWodT = 92;
    int numStoT = 157;
    assertEquals(9, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case134() {
    int myUnits = 7850;
    int hpT = 206;
    int attackT = 3857;
    int numWodT = 30;
    int numStoT = 9;
    assertEquals(2, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case135() {
    int myUnits = 531144140;
    int hpT = 60;
    int attackT = 49;
    int numWodT = 85;
    int numStoT = 597;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case136() {
    int myUnits = 722639;
    int hpT = 898;
    int attackT = 26980;
    int numWodT = 196;
    int numStoT = 658;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case137() {
    int myUnits = 1000000000;
    int hpT = 40000;
    int attackT = 100;
    int numWodT = 1;
    int numStoT = 40000;
    assertEquals(2, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case138() {
    int myUnits = 97030319;
    int hpT = 39222;
    int attackT = 37805;
    int numWodT = 4;
    int numStoT = 3738;
    assertEquals(3, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case139() {
    int myUnits = 1000000000;
    int hpT = 40000;
    int attackT = 1;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(4, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case140() {
    int myUnits = 999999999;
    int hpT = 39999;
    int attackT = 39999;
    int numWodT = 39999;
    int numStoT = 39999;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case141() {
    int myUnits = 1000000000;
    int hpT = 400;
    int attackT = 2;
    int numWodT = 456;
    int numStoT = 65;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case142() {
    int myUnits = 500000000;
    int hpT = 10000;
    int attackT = 10000;
    int numWodT = 10000;
    int numStoT = 10000;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case143() {
    int myUnits = 100000;
    int hpT = 10;
    int attackT = 10;
    int numWodT = 10;
    int numStoT = 10;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case144() {
    int myUnits = 1000000000;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case145() {
    int myUnits = 1000000000;
    int hpT = 111;
    int attackT = 111;
    int numWodT = 222;
    int numStoT = 222;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case146() {
    int myUnits = 345243216;
    int hpT = 35000;
    int attackT = 7;
    int numWodT = 12555;
    int numStoT = 36987;
    assertEquals(6, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case147() {
    int myUnits = 1000000000;
    int hpT = 9997;
    int attackT = 39999;
    int numWodT = 39999;
    int numStoT = 39999;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case148() {
    int myUnits = 1000000000;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case149() {
    int myUnits = 1000000000;
    int hpT = 43;
    int attackT = 4;
    int numWodT = 664;
    int numStoT = 345;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case150() {
    int myUnits = 1000;
    int hpT = 4000;
    int attackT = 1;
    int numWodT = 3;
    int numStoT = 7;
    assertEquals(49, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case151() {
    int myUnits = 200;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case152() {
    int myUnits = 1000000000;
    int hpT = 40000;
    int attackT = 1000;
    int numWodT = 9999;
    int numStoT = 9192;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case153() {
    int myUnits = 1000000000;
    int hpT = 1000;
    int attackT = 500;
    int numWodT = 5000;
    int numStoT = 5000;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case154() {
    int myUnits = 5;
    int hpT = 3;
    int attackT = 2;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case155() {
    int myUnits = 1000000000;
    int hpT = 10;
    int attackT = 1;
    int numWodT = 100;
    int numStoT = 100;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case156() {
    int myUnits = 12;
    int hpT = 3;
    int attackT = 2;
    int numWodT = 1;
    int numStoT = 5;
    assertEquals(3, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case157() {
    int myUnits = 70000;
    int hpT = 1;
    int attackT = 1;
    int numWodT = 40000;
    int numStoT = 40000;
    assertEquals(2, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case158() {
    int myUnits = 1000000000;
    int hpT = 40000;
    int attackT = 40000;
    int numWodT = 40000;
    int numStoT = 39999;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case159() {
    int myUnits = 599990990;
    int hpT = 100;
    int attackT = 40000;
    int numWodT = 40000;
    int numStoT = 4000;
    assertEquals(1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case160() {
    int myUnits = 7;
    int hpT = 3;
    int attackT = 2;
    int numWodT = 1;
    int numStoT = 2;
    assertEquals(2, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case161() {
    int myUnits = 12;
    int hpT = 3;
    int attackT = 2;
    int numWodT = 3;
    int numStoT = 3;
    assertEquals(2, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

  @Test
  public void case162() {
    int myUnits = 4;
    int hpT = 4;
    int attackT = 1;
    int numWodT = 1;
    int numStoT = 1;
    assertEquals(-1, enemytowers.attack(myUnits, hpT, attackT, numWodT, numStoT));
  }

}
