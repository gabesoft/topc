package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class ConditionalTest {
  double DELTA = 1.0e-09;
  Conditional conditional = new Conditional();

  @Test
  public void case1() {
    int nDice = 2;
    int maxSide = 6;
    int v = 6;
    int theSum = 12;
    assertEquals(0.09090909090909091, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.09090909090909091);
  }

  @Test
  public void case2() {
    int nDice = 2;
    int maxSide = 6;
    int v = 6;
    int theSum = 6;
    assertEquals(1.0, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.0);
  }

  @Test
  public void case3() {
    int nDice = 1;
    int maxSide = 9;
    int v = 3;
    int theSum = 3;
    assertEquals(1.0, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.0);
  }

  @Test
  public void case4() {
    int nDice = 2;
    int maxSide = 3;
    int v = 2;
    int theSum = 4;
    assertEquals(0.6, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.6);
  }

  @Test
  public void case5() {
    int nDice = 50;
    int maxSide = 50;
    int v = 50;
    int theSum = 1;
    assertEquals(0.9999999999999967, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999967);
  }

  @Test
  public void case6() {
    int nDice = 50;
    int maxSide = 50;
    int v = 1;
    int theSum = 1234;
    assertEquals(0.6065038966315277, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.6065038966315277);
  }

  @Test
  public void case7() {
    int nDice = 3;
    int maxSide = 1;
    int v = 1;
    int theSum = 2;
    assertEquals(1.0, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.0);
  }

  @Test
  public void case8() {
    int nDice = 3;
    int maxSide = 1;
    int v = 1;
    int theSum = 3;
    assertEquals(1.0, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.0);
  }

  @Test
  public void case9() {
    int nDice = 3;
    int maxSide = 2;
    int v = 2;
    int theSum = 6;
    assertEquals(0.14285714285714285, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.14285714285714285);
  }

  @Test
  public void case10() {
    int nDice = 50;
    int maxSide = 2;
    int v = 2;
    int theSum = 76;
    assertEquals(0.44386241367039186, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.44386241367039186);
  }

  @Test
  public void case11() {
    int nDice = 50;
    int maxSide = 2;
    int v = 1;
    int theSum = 75;
    assertEquals(0.5561375863296081, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.5561375863296081);
  }

  @Test
  public void case12() {
    int nDice = 50;
    int maxSide = 30;
    int v = 1;
    int theSum = 1300;
    assertEquals(2.5399419266958173e-23, conditional.probability(nDice, maxSide, v, theSum), DELTA * 2.5399419266958173e-23);
  }

  @Test
  public void case13() {
    int nDice = 5;
    int maxSide = 30;
    int v = 1;
    int theSum = 75;
    assertEquals(0.27533413164043663, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.27533413164043663);
  }

  @Test
  public void case14() {
    int nDice = 1;
    int maxSide = 4;
    int v = 4;
    int theSum = 3;
    assertEquals(1.0, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.0);
  }

  @Test
  public void case15() {
    int nDice = 20;
    int maxSide = 4;
    int v = 4;
    int theSum = 27;
    assertEquals(0.9999999720718009, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999720718009);
  }

  @Test
  public void case16() {
    int nDice = 9;
    int maxSide = 6;
    int v = 5;
    int theSum = 31;
    assertEquals(0.6268537748023865, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.6268537748023865);
  }

  @Test
  public void case17() {
    int nDice = 31;
    int maxSide = 40;
    int v = 20;
    int theSum = 367;
    assertEquals(0.9999930562338223, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999930562338223);
  }

  @Test
  public void case18() {
    int nDice = 14;
    int maxSide = 13;
    int v = 11;
    int theSum = 151;
    assertEquals(5.453029923318587e-05, conditional.probability(nDice, maxSide, v, theSum), DELTA * 5.453029923318587e-05);
  }

  @Test
  public void case19() {
    int nDice = 29;
    int maxSide = 13;
    int v = 10;
    int theSum = 297;
    assertEquals(7.795014737059219e-07, conditional.probability(nDice, maxSide, v, theSum), DELTA * 7.795014737059219e-07);
  }

  @Test
  public void case20() {
    int nDice = 34;
    int maxSide = 26;
    int v = 22;
    int theSum = 563;
    assertEquals(0.010441662002489594, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.010441662002489594);
  }

  @Test
  public void case21() {
    int nDice = 19;
    int maxSide = 17;
    int v = 7;
    int theSum = 232;
    assertEquals(0.0013834917661672413, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.0013834917661672413);
  }

  @Test
  public void case22() {
    int nDice = 12;
    int maxSide = 38;
    int v = 14;
    int theSum = 388;
    assertEquals(5.775198675184631e-07, conditional.probability(nDice, maxSide, v, theSum), DELTA * 5.775198675184631e-07);
  }

  @Test
  public void case23() {
    int nDice = 39;
    int maxSide = 10;
    int v = 2;
    int theSum = 362;
    assertEquals(7.316645457324389e-23, conditional.probability(nDice, maxSide, v, theSum), DELTA * 7.316645457324389e-23);
  }

  @Test
  public void case24() {
    int nDice = 39;
    int maxSide = 5;
    int v = 5;
    int theSum = 108;
    assertEquals(0.8585970614298535, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.8585970614298535);
  }

  @Test
  public void case25() {
    int nDice = 24;
    int maxSide = 37;
    int v = 19;
    int theSum = 231;
    assertEquals(0.9999975047685218, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999975047685218);
  }

  @Test
  public void case26() {
    int nDice = 26;
    int maxSide = 41;
    int v = 9;
    int theSum = 830;
    assertEquals(8.861924833662333e-08, conditional.probability(nDice, maxSide, v, theSum), DELTA * 8.861924833662333e-08);
  }

  @Test
  public void case27() {
    int nDice = 3;
    int maxSide = 48;
    int v = 21;
    int theSum = 40;
    assertEquals(0.9321908701433004, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9321908701433004);
  }

  @Test
  public void case28() {
    int nDice = 48;
    int maxSide = 26;
    int v = 14;
    int theSum = 99;
    assertEquals(0.9999999999999993, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999993);
  }

  @Test
  public void case29() {
    int nDice = 21;
    int maxSide = 42;
    int v = 19;
    int theSum = 862;
    assertEquals(0.0, conditional.probability(nDice, maxSide, v, theSum), DELTA);
  }

  @Test
  public void case30() {
    int nDice = 49;
    int maxSide = 32;
    int v = 10;
    int theSum = 173;
    assertEquals(1.0000000000000002, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.0000000000000002);
  }

  @Test
  public void case31() {
    int nDice = 34;
    int maxSide = 30;
    int v = 7;
    int theSum = 614;
    assertEquals(0.03345959839326994, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.03345959839326994);
  }

  @Test
  public void case32() {
    int nDice = 46;
    int maxSide = 2;
    int v = 1;
    int theSum = 69;
    assertEquals(0.5585020439387954, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.5585020439387954);
  }

  @Test
  public void case33() {
    int nDice = 22;
    int maxSide = 11;
    int v = 1;
    int theSum = 75;
    assertEquals(0.9999642798272311, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999642798272311);
  }

  @Test
  public void case34() {
    int nDice = 37;
    int maxSide = 2;
    int v = 1;
    int theSum = 6;
    assertEquals(1.0, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.0);
  }

  @Test
  public void case35() {
    int nDice = 30;
    int maxSide = 29;
    int v = 11;
    int theSum = 835;
    assertEquals(1.082803357398144e-30, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.082803357398144e-30);
  }

  @Test
  public void case36() {
    int nDice = 23;
    int maxSide = 9;
    int v = 1;
    int theSum = 122;
    assertEquals(0.27422716822202015, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.27422716822202015);
  }

  @Test
  public void case37() {
    int nDice = 15;
    int maxSide = 49;
    int v = 25;
    int theSum = 353;
    assertEquals(0.6623121652697722, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.6623121652697722);
  }

  @Test
  public void case38() {
    int nDice = 7;
    int maxSide = 49;
    int v = 5;
    int theSum = 149;
    assertEquals(0.5868050160689797, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.5868050160689797);
  }

  @Test
  public void case39() {
    int nDice = 24;
    int maxSide = 8;
    int v = 8;
    int theSum = 7;
    assertEquals(1.0000000000000002, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.0000000000000002);
  }

  @Test
  public void case40() {
    int nDice = 22;
    int maxSide = 34;
    int v = 25;
    int theSum = 486;
    assertEquals(0.017276761759106717, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.017276761759106717);
  }

  @Test
  public void case41() {
    int nDice = 32;
    int maxSide = 44;
    int v = 35;
    int theSum = 877;
    assertEquals(0.018148482714944094, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.018148482714944094);
  }

  @Test
  public void case42() {
    int nDice = 38;
    int maxSide = 42;
    int v = 36;
    int theSum = 1401;
    assertEquals(2.1820394590906484e-18, conditional.probability(nDice, maxSide, v, theSum), DELTA * 2.1820394590906484e-18);
  }

  @Test
  public void case43() {
    int nDice = 34;
    int maxSide = 46;
    int v = 41;
    int theSum = 174;
    assertEquals(0.9999999999999998, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999998);
  }

  @Test
  public void case44() {
    int nDice = 1;
    int maxSide = 8;
    int v = 8;
    int theSum = 3;
    assertEquals(1.0, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.0);
  }

  @Test
  public void case45() {
    int nDice = 48;
    int maxSide = 50;
    int v = 27;
    int theSum = 235;
    assertEquals(0.9999999999999989, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999989);
  }

  @Test
  public void case46() {
    int nDice = 14;
    int maxSide = 19;
    int v = 11;
    int theSum = 211;
    assertEquals(0.000132940448169323, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.000132940448169323);
  }

  @Test
  public void case47() {
    int nDice = 12;
    int maxSide = 18;
    int v = 11;
    int theSum = 49;
    assertEquals(0.9999827581018343, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999827581018343);
  }

  @Test
  public void case48() {
    int nDice = 50;
    int maxSide = 4;
    int v = 4;
    int theSum = 114;
    assertEquals(0.9270471837179275, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9270471837179275);
  }

  @Test
  public void case49() {
    int nDice = 9;
    int maxSide = 38;
    int v = 7;
    int theSum = 310;
    assertEquals(2.2975880608148006e-12, conditional.probability(nDice, maxSide, v, theSum), DELTA * 2.2975880608148006e-12);
  }

  @Test
  public void case50() {
    int nDice = 41;
    int maxSide = 32;
    int v = 18;
    int theSum = 1226;
    assertEquals(4.284894444082593e-30, conditional.probability(nDice, maxSide, v, theSum), DELTA * 4.284894444082593e-30);
  }

  @Test
  public void case51() {
    int nDice = 44;
    int maxSide = 33;
    int v = 4;
    int theSum = 448;
    assertEquals(0.9999993000184015, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999993000184015);
  }

  @Test
  public void case52() {
    int nDice = 12;
    int maxSide = 38;
    int v = 7;
    int theSum = 375;
    assertEquals(2.020161856917486e-06, conditional.probability(nDice, maxSide, v, theSum), DELTA * 2.020161856917486e-06);
  }

  @Test
  public void case53() {
    int nDice = 26;
    int maxSide = 34;
    int v = 2;
    int theSum = 220;
    assertEquals(0.9999992301535131, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999992301535131);
  }

  @Test
  public void case54() {
    int nDice = 12;
    int maxSide = 37;
    int v = 21;
    int theSum = 180;
    assertEquals(0.9196250744358586, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9196250744358586);
  }

  @Test
  public void case55() {
    int nDice = 49;
    int maxSide = 38;
    int v = 38;
    int theSum = 998;
    assertEquals(0.33174712168162546, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.33174712168162546);
  }

  @Test
  public void case56() {
    int nDice = 50;
    int maxSide = 50;
    int v = 48;
    int theSum = 1666;
    assertEquals(7.534739841501312e-05, conditional.probability(nDice, maxSide, v, theSum), DELTA * 7.534739841501312e-05);
  }

  @Test
  public void case57() {
    int nDice = 50;
    int maxSide = 50;
    int v = 25;
    int theSum = 200;
    assertEquals(0.9999999999999997, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999997);
  }

  @Test
  public void case58() {
    int nDice = 50;
    int maxSide = 50;
    int v = 1;
    int theSum = 1;
    assertEquals(0.9999999999999992, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999992);
  }

  @Test
  public void case59() {
    int nDice = 50;
    int maxSide = 50;
    int v = 38;
    int theSum = 1200;
    assertEquals(0.792839402396853, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.792839402396853);
  }

  @Test
  public void case60() {
    int nDice = 50;
    int maxSide = 50;
    int v = 50;
    int theSum = 1200;
    assertEquals(0.813885451334627, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.813885451334627);
  }

  @Test
  public void case61() {
    int nDice = 50;
    int maxSide = 50;
    int v = 1;
    int theSum = 1250;
    assertEquals(0.5443439491287221, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.5443439491287221);
  }

  @Test
  public void case62() {
    int nDice = 50;
    int maxSide = 50;
    int v = 35;
    int theSum = 1250;
    assertEquals(0.6199599173066064, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.6199599173066064);
  }

  @Test
  public void case63() {
    int nDice = 50;
    int maxSide = 50;
    int v = 34;
    int theSum = 1978;
    assertEquals(1.9798976937437787e-13, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.9798976937437787e-13);
  }

  @Test
  public void case64() {
    int nDice = 50;
    int maxSide = 50;
    int v = 6;
    int theSum = 100;
    assertEquals(0.9999999999999988, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999988);
  }

  @Test
  public void case65() {
    int nDice = 50;
    int maxSide = 50;
    int v = 50;
    int theSum = 2500;
    assertEquals(1.770755296785606e-85, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.770755296785606e-85);
  }

  @Test
  public void case66() {
    int nDice = 50;
    int maxSide = 50;
    int v = 30;
    int theSum = 1000;
    assertEquals(0.9970818543000018, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9970818543000018);
  }

  @Test
  public void case67() {
    int nDice = 50;
    int maxSide = 50;
    int v = 50;
    int theSum = 2499;
    assertEquals(9.030852013606592e-84, conditional.probability(nDice, maxSide, v, theSum), DELTA * 9.030852013606592e-84);
  }

  @Test
  public void case68() {
    int nDice = 50;
    int maxSide = 50;
    int v = 32;
    int theSum = 1349;
    assertEquals(0.2463888390005133, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.2463888390005133);
  }

  @Test
  public void case69() {
    int nDice = 50;
    int maxSide = 50;
    int v = 30;
    int theSum = 1200;
    assertEquals(0.7788946791076431, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.7788946791076431);
  }

  @Test
  public void case70() {
    int nDice = 50;
    int maxSide = 50;
    int v = 21;
    int theSum = 200;
    assertEquals(0.9999999999999992, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999992);
  }

  @Test
  public void case71() {
    int nDice = 50;
    int maxSide = 50;
    int v = 23;
    int theSum = 1250;
    assertEquals(0.59342105224914, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.59342105224914);
  }

  @Test
  public void case72() {
    int nDice = 49;
    int maxSide = 47;
    int v = 23;
    int theSum = 1230;
    assertEquals(0.2839462500117616, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.2839462500117616);
  }

  @Test
  public void case73() {
    int nDice = 50;
    int maxSide = 50;
    int v = 50;
    int theSum = 2000;
    assertEquals(4.2082315493315665e-14, conditional.probability(nDice, maxSide, v, theSum), DELTA * 4.2082315493315665e-14);
  }

  @Test
  public void case74() {
    int nDice = 50;
    int maxSide = 50;
    int v = 50;
    int theSum = 1119;
    assertEquals(0.9555720210984059, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9555720210984059);
  }

  @Test
  public void case75() {
    int nDice = 50;
    int maxSide = 50;
    int v = 30;
    int theSum = 465;
    assertEquals(0.9999999999999996, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999996);
  }

  @Test
  public void case76() {
    int nDice = 50;
    int maxSide = 50;
    int v = 25;
    int theSum = 1500;
    assertEquals(0.01319355483009048, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.01319355483009048);
  }

  @Test
  public void case77() {
    int nDice = 33;
    int maxSide = 16;
    int v = 16;
    int theSum = 474;
    assertEquals(2.1789896914338626e-16, conditional.probability(nDice, maxSide, v, theSum), DELTA * 2.1789896914338626e-16);
  }

  @Test
  public void case78() {
    int nDice = 50;
    int maxSide = 50;
    int v = 25;
    int theSum = 300;
    assertEquals(0.9999999999999997, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999997);
  }

  @Test
  public void case79() {
    int nDice = 50;
    int maxSide = 50;
    int v = 17;
    int theSum = 997;
    assertEquals(0.9966371988641942, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9966371988641942);
  }

  @Test
  public void case80() {
    int nDice = 50;
    int maxSide = 50;
    int v = 35;
    int theSum = 1300;
    assertEquals(0.4259162818274663, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.4259162818274663);
  }

  @Test
  public void case81() {
    int nDice = 50;
    int maxSide = 50;
    int v = 1;
    int theSum = 1000;
    assertEquals(0.9954527270692969, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9954527270692969);
  }

  @Test
  public void case82() {
    int nDice = 50;
    int maxSide = 30;
    int v = 20;
    int theSum = 1500;
    assertEquals(0.0, conditional.probability(nDice, maxSide, v, theSum), DELTA);
  }

  @Test
  public void case83() {
    int nDice = 50;
    int maxSide = 50;
    int v = 48;
    int theSum = 1666;
    assertEquals(7.534739841501312e-05, conditional.probability(nDice, maxSide, v, theSum), DELTA * 7.534739841501312e-05);
  }

  @Test
  public void case84() {
    int nDice = 50;
    int maxSide = 50;
    int v = 25;
    int theSum = 200;
    assertEquals(0.9999999999999997, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999997);
  }

  @Test
  public void case85() {
    int nDice = 50;
    int maxSide = 50;
    int v = 1;
    int theSum = 1;
    assertEquals(0.9999999999999992, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999992);
  }

  @Test
  public void case86() {
    int nDice = 50;
    int maxSide = 50;
    int v = 38;
    int theSum = 1200;
    assertEquals(0.792839402396853, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.792839402396853);
  }

  @Test
  public void case87() {
    int nDice = 50;
    int maxSide = 50;
    int v = 50;
    int theSum = 1200;
    assertEquals(0.813885451334627, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.813885451334627);
  }

  @Test
  public void case88() {
    int nDice = 50;
    int maxSide = 50;
    int v = 1;
    int theSum = 1250;
    assertEquals(0.5443439491287221, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.5443439491287221);
  }

  @Test
  public void case89() {
    int nDice = 50;
    int maxSide = 50;
    int v = 35;
    int theSum = 1250;
    assertEquals(0.6199599173066064, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.6199599173066064);
  }

  @Test
  public void case90() {
    int nDice = 50;
    int maxSide = 50;
    int v = 34;
    int theSum = 1978;
    assertEquals(1.9798976937437787e-13, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.9798976937437787e-13);
  }

  @Test
  public void case91() {
    int nDice = 50;
    int maxSide = 50;
    int v = 6;
    int theSum = 100;
    assertEquals(0.9999999999999988, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999988);
  }

  @Test
  public void case92() {
    int nDice = 50;
    int maxSide = 50;
    int v = 50;
    int theSum = 2500;
    assertEquals(1.770755296785606e-85, conditional.probability(nDice, maxSide, v, theSum), DELTA * 1.770755296785606e-85);
  }

  @Test
  public void case93() {
    int nDice = 50;
    int maxSide = 50;
    int v = 30;
    int theSum = 1000;
    assertEquals(0.9970818543000018, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9970818543000018);
  }

  @Test
  public void case94() {
    int nDice = 50;
    int maxSide = 50;
    int v = 50;
    int theSum = 2499;
    assertEquals(9.030852013606592e-84, conditional.probability(nDice, maxSide, v, theSum), DELTA * 9.030852013606592e-84);
  }

  @Test
  public void case95() {
    int nDice = 50;
    int maxSide = 50;
    int v = 32;
    int theSum = 1349;
    assertEquals(0.2463888390005133, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.2463888390005133);
  }

  @Test
  public void case96() {
    int nDice = 50;
    int maxSide = 50;
    int v = 30;
    int theSum = 1200;
    assertEquals(0.7788946791076431, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.7788946791076431);
  }

  @Test
  public void case97() {
    int nDice = 50;
    int maxSide = 50;
    int v = 21;
    int theSum = 200;
    assertEquals(0.9999999999999992, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999992);
  }

  @Test
  public void case98() {
    int nDice = 50;
    int maxSide = 50;
    int v = 23;
    int theSum = 1250;
    assertEquals(0.59342105224914, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.59342105224914);
  }

  @Test
  public void case99() {
    int nDice = 49;
    int maxSide = 47;
    int v = 23;
    int theSum = 1230;
    assertEquals(0.2839462500117616, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.2839462500117616);
  }

  @Test
  public void case100() {
    int nDice = 50;
    int maxSide = 50;
    int v = 50;
    int theSum = 2000;
    assertEquals(4.2082315493315665e-14, conditional.probability(nDice, maxSide, v, theSum), DELTA * 4.2082315493315665e-14);
  }

  @Test
  public void case101() {
    int nDice = 50;
    int maxSide = 50;
    int v = 50;
    int theSum = 1119;
    assertEquals(0.9555720210984059, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9555720210984059);
  }

  @Test
  public void case102() {
    int nDice = 50;
    int maxSide = 50;
    int v = 30;
    int theSum = 465;
    assertEquals(0.9999999999999996, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999996);
  }

  @Test
  public void case103() {
    int nDice = 50;
    int maxSide = 50;
    int v = 25;
    int theSum = 1500;
    assertEquals(0.01319355483009048, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.01319355483009048);
  }

  @Test
  public void case104() {
    int nDice = 33;
    int maxSide = 16;
    int v = 16;
    int theSum = 474;
    assertEquals(2.1789896914338626e-16, conditional.probability(nDice, maxSide, v, theSum), DELTA * 2.1789896914338626e-16);
  }

  @Test
  public void case105() {
    int nDice = 50;
    int maxSide = 50;
    int v = 25;
    int theSum = 300;
    assertEquals(0.9999999999999997, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9999999999999997);
  }

  @Test
  public void case106() {
    int nDice = 50;
    int maxSide = 50;
    int v = 17;
    int theSum = 997;
    assertEquals(0.9966371988641942, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9966371988641942);
  }

  @Test
  public void case107() {
    int nDice = 50;
    int maxSide = 50;
    int v = 35;
    int theSum = 1300;
    assertEquals(0.4259162818274663, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.4259162818274663);
  }

  @Test
  public void case108() {
    int nDice = 50;
    int maxSide = 50;
    int v = 1;
    int theSum = 1000;
    assertEquals(0.9954527270692969, conditional.probability(nDice, maxSide, v, theSum), DELTA * 0.9954527270692969);
  }

  @Test
  public void case109() {
    int nDice = 50;
    int maxSide = 30;
    int v = 20;
    int theSum = 1500;
    assertEquals(0.0, conditional.probability(nDice, maxSide, v, theSum), DELTA);
  }

}
