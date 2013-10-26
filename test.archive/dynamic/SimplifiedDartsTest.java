package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SimplifiedDartsTest {
  double DELTA = 1.0e-09;
  SimplifiedDarts simplifieddarts = new SimplifiedDarts();

  @Test
  public void case1() {
    int W = 5;
    int N = 2;
    int P1 = 50;
    int P2 = 25;
    assertEquals(12.5, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 12.5);
  }

  @Test
  public void case2() {
    int W = 6;
    int N = 3;
    int P1 = 90;
    int P2 = 20;
    assertEquals(73.30000000000001, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 73.30000000000001);
  }

  @Test
  public void case3() {
    int W = 30;
    int N = 384;
    int P1 = 3;
    int P2 = 1;
    assertEquals(18.344490479047746, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 18.344490479047746);
  }

  @Test
  public void case4() {
    int W = 999;
    int N = 333;
    int P1 = 0;
    int P2 = 100;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case5() {
    int W = 1000;
    int N = 333;
    int P1 = 0;
    int P2 = 100;
    assertEquals(0.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA);
  }

  @Test
  public void case6() {
    int W = 532;
    int N = 479;
    int P1 = 72;
    int P2 = 7;
    assertEquals(99.99999999999952, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 99.99999999999952);
  }

  @Test
  public void case7() {
    int W = 803;
    int N = 771;
    int P1 = 26;
    int P2 = 75;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case8() {
    int W = 341;
    int N = 332;
    int P1 = 1;
    int P2 = 62;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case9() {
    int W = 978;
    int N = 915;
    int P1 = 62;
    int P2 = 22;
    assertEquals(99.99999447808712, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 99.99999447808712);
  }

  @Test
  public void case10() {
    int W = 694;
    int N = 122;
    int P1 = 23;
    int P2 = 1;
    assertEquals(0.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA);
  }

  @Test
  public void case11() {
    int W = 246;
    int N = 3;
    int P1 = 19;
    int P2 = 51;
    assertEquals(0.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA);
  }

  @Test
  public void case12() {
    int W = 632;
    int N = 567;
    int P1 = 83;
    int P2 = 17;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case13() {
    int W = 826;
    int N = 80;
    int P1 = 62;
    int P2 = 24;
    assertEquals(0.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA);
  }

  @Test
  public void case14() {
    int W = 505;
    int N = 774;
    int P1 = 21;
    int P2 = 8;
    assertEquals(3.235029605705033e-12, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 3.235029605705033e-12);
  }

  @Test
  public void case15() {
    int W = 307;
    int N = 851;
    int P1 = 42;
    int P2 = 82;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case16() {
    int W = 29;
    int N = 979;
    int P1 = 63;
    int P2 = 60;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case17() {
    int W = 492;
    int N = 731;
    int P1 = 18;
    int P2 = 45;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case18() {
    int W = 294;
    int N = 17;
    int P1 = 12;
    int P2 = 86;
    assertEquals(0.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA);
  }

  @Test
  public void case19() {
    int W = 530;
    int N = 724;
    int P1 = 84;
    int P2 = 2;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case20() {
    int W = 291;
    int N = 254;
    int P1 = 71;
    int P2 = 55;
    assertEquals(99.9999980074316, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 99.9999980074316);
  }

  @Test
  public void case21() {
    int W = 208;
    int N = 456;
    int P1 = 1;
    int P2 = 60;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case22() {
    int W = 782;
    int N = 236;
    int P1 = 60;
    int P2 = 24;
    assertEquals(0.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA);
  }

  @Test
  public void case23() {
    int W = 818;
    int N = 547;
    int P1 = 6;
    int P2 = 25;
    assertEquals(5.963226361492138e-34, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 5.963226361492138e-34);
  }

  @Test
  public void case24() {
    int W = 738;
    int N = 288;
    int P1 = 63;
    int P2 = 51;
    assertEquals(8.23578546675441e-33, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 8.23578546675441e-33);
  }

  @Test
  public void case25() {
    int W = 197;
    int N = 275;
    int P1 = 77;
    int P2 = 23;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case26() {
    int W = 845;
    int N = 958;
    int P1 = 9;
    int P2 = 27;
    assertEquals(4.9180599012723905, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 4.9180599012723905);
  }

  @Test
  public void case27() {
    int W = 57;
    int N = 163;
    int P1 = 14;
    int P2 = 24;
    assertEquals(99.99772493742063, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 99.99772493742063);
  }

  @Test
  public void case28() {
    int W = 410;
    int N = 730;
    int P1 = 26;
    int P2 = 3;
    assertEquals(10.806578868329625, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 10.806578868329625);
  }

  @Test
  public void case29() {
    int W = 762;
    int N = 673;
    int P1 = 5;
    int P2 = 30;
    assertEquals(0.0010472478621256177, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 0.0010472478621256177);
  }

  @Test
  public void case30() {
    int W = 485;
    int N = 687;
    int P1 = 30;
    int P2 = 8;
    assertEquals(0.14399494904573085, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 0.14399494904573085);
  }

  @Test
  public void case31() {
    int W = 453;
    int N = 584;
    int P1 = 24;
    int P2 = 29;
    assertEquals(95.84876025867963, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 95.84876025867963);
  }

  @Test
  public void case32() {
    int W = 839;
    int N = 599;
    int P1 = 62;
    int P2 = 18;
    assertEquals(0.0021433240735887612, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 0.0021433240735887612);
  }

  @Test
  public void case33() {
    int W = 723;
    int N = 394;
    int P1 = 1;
    int P2 = 61;
    assertEquals(49.492091127129875, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 49.492091127129875);
  }

  @Test
  public void case34() {
    int W = 428;
    int N = 440;
    int P1 = 18;
    int P2 = 42;
    assertEquals(99.99826765735607, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 99.99826765735607);
  }

  @Test
  public void case35() {
    int W = 659;
    int N = 337;
    int P1 = 60;
    int P2 = 70;
    assertEquals(97.31657990578955, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 97.31657990578955);
  }

  @Test
  public void case36() {
    int W = 204;
    int N = 282;
    int P1 = 31;
    int P2 = 26;
    assertEquals(78.40843687510235, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 78.40843687510235);
  }

  @Test
  public void case37() {
    int W = 474;
    int N = 377;
    int P1 = 29;
    int P2 = 48;
    assertEquals(99.23335949272146, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 99.23335949272146);
  }

  @Test
  public void case38() {
    int W = 62;
    int N = 26;
    int P1 = 31;
    int P2 = 75;
    assertEquals(33.714411458790885, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 33.714411458790885);
  }

  @Test
  public void case39() {
    int W = 838;
    int N = 436;
    int P1 = 93;
    int P2 = 22;
    assertEquals(0.47220630429819865, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 0.47220630429819865);
  }

  @Test
  public void case40() {
    int W = 251;
    int N = 512;
    int P1 = 21;
    int P2 = 3;
    assertEquals(2.7434051431279816, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 2.7434051431279816);
  }

  @Test
  public void case41() {
    int W = 228;
    int N = 182;
    int P1 = 65;
    int P2 = 16;
    assertEquals(77.42320991618868, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 77.42320991618868);
  }

  @Test
  public void case42() {
    int W = 359;
    int N = 227;
    int P1 = 55;
    int P2 = 64;
    assertEquals(99.97734105092933, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 99.97734105092933);
  }

  @Test
  public void case43() {
    int W = 83;
    int N = 797;
    int P1 = 6;
    int P2 = 2;
    assertEquals(82.97157145157963, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 82.97157145157963);
  }

  @Test
  public void case44() {
    int W = 810;
    int N = 467;
    int P1 = 24;
    int P2 = 66;
    assertEquals(99.99021295368615, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 99.99021295368615);
  }

  @Test
  public void case45() {
    int W = 454;
    int N = 350;
    int P1 = 47;
    int P2 = 45;
    assertEquals(74.3116072263093, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 74.3116072263093);
  }

  @Test
  public void case46() {
    int W = 842;
    int N = 434;
    int P1 = 68;
    int P2 = 61;
    assertEquals(6.092580947939844, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 6.092580947939844);
  }

  @Test
  public void case47() {
    int W = 952;
    int N = 888;
    int P1 = 48;
    int P2 = 27;
    assertEquals(0.050900483523618464, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 0.050900483523618464);
  }

  @Test
  public void case48() {
    int W = 835;
    int N = 444;
    int P1 = 54;
    int P2 = 60;
    assertEquals(12.030085470170029, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 12.030085470170029);
  }

  @Test
  public void case49() {
    int W = 780;
    int N = 464;
    int P1 = 67;
    int P2 = 64;
    assertEquals(99.9826678126776, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 99.9826678126776);
  }

  @Test
  public void case50() {
    int W = 713;
    int N = 796;
    int P1 = 41;
    int P2 = 14;
    assertEquals(1.5709819597507901, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 1.5709819597507901);
  }

  @Test
  public void case51() {
    int W = 830;
    int N = 310;
    int P1 = 96;
    int P2 = 86;
    assertEquals(5.043058938335629, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 5.043058938335629);
  }

  @Test
  public void case52() {
    int W = 711;
    int N = 439;
    int P1 = 81;
    int P2 = 63;
    assertEquals(99.99570215526509, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 99.99570215526509);
  }

  @Test
  public void case53() {
    int W = 817;
    int N = 363;
    int P1 = 33;
    int P2 = 70;
    assertEquals(1.6303222276235743, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 1.6303222276235743);
  }

  @Test
  public void case54() {
    int W = 473;
    int N = 313;
    int P1 = 51;
    int P2 = 48;
    assertEquals(20.748064663188952, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 20.748064663188952);
  }

  @Test
  public void case55() {
    int W = 167;
    int N = 125;
    int P1 = 51;
    int P2 = 23;
    assertEquals(0.026493002744617068, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 0.026493002744617068);
  }

  @Test
  public void case56() {
    int W = 107;
    int N = 147;
    int P1 = 24;
    int P2 = 20;
    assertEquals(11.158850702419116, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 11.158850702419116);
  }

  @Test
  public void case57() {
    int W = 408;
    int N = 491;
    int P1 = 36;
    int P2 = 18;
    assertEquals(0.649990007686892, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 0.649990007686892);
  }

  @Test
  public void case58() {
    int W = 643;
    int N = 917;
    int P1 = 29;
    int P2 = 22;
    assertEquals(16.384821787152344, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 16.384821787152344);
  }

  @Test
  public void case59() {
    int W = 523;
    int N = 691;
    int P1 = 11;
    int P2 = 28;
    assertEquals(94.7236522554947, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 94.7236522554947);
  }

  @Test
  public void case60() {
    int W = 385;
    int N = 424;
    int P1 = 51;
    int P2 = 0;
    assertEquals(98.94685274798275, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 98.94685274798275);
  }

  @Test
  public void case61() {
    int W = 604;
    int N = 351;
    int P1 = 16;
    int P2 = 57;
    assertEquals(43.972050199458536, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 43.972050199458536);
  }

  @Test
  public void case62() {
    int W = 49;
    int N = 79;
    int P1 = 41;
    int P2 = 13;
    assertEquals(96.74635044609903, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 96.74635044609903);
  }

  @Test
  public void case63() {
    int W = 183;
    int N = 144;
    int P1 = 8;
    int P2 = 45;
    assertEquals(76.3843752871948, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 76.3843752871948);
  }

  @Test
  public void case64() {
    int W = 233;
    int N = 82;
    int P1 = 64;
    int P2 = 83;
    assertEquals(0.09248042950304801, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 0.09248042950304801);
  }

  @Test
  public void case65() {
    int W = 217;
    int N = 129;
    int P1 = 81;
    int P2 = 47;
    assertEquals(25.79414635080777, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 25.79414635080777);
  }

  @Test
  public void case66() {
    int W = 1000;
    int N = 653;
    int P1 = 53;
    int P2 = 89;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case67() {
    int W = 191;
    int N = 131;
    int P1 = 35;
    int P2 = 48;
    assertEquals(45.63977244862386, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 45.63977244862386);
  }

  @Test
  public void case68() {
    int W = 1000;
    int N = 407;
    int P1 = 31;
    int P2 = 99;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case69() {
    int W = 237;
    int N = 327;
    int P1 = 8;
    int P2 = 27;
    assertEquals(88.963246472822, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 88.963246472822);
  }

  @Test
  public void case70() {
    int W = 505;
    int N = 390;
    int P1 = 61;
    int P2 = 15;
    assertEquals(6.6497277648268085, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 6.6497277648268085);
  }

  @Test
  public void case71() {
    int W = 268;
    int N = 443;
    int P1 = 28;
    int P2 = 3;
    assertEquals(15.841662536644327, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 15.841662536644327);
  }

  @Test
  public void case72() {
    int W = 860;
    int N = 522;
    int P1 = 48;
    int P2 = 54;
    assertEquals(34.28525732079538, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 34.28525732079538);
  }

  @Test
  public void case73() {
    int W = 754;
    int N = 456;
    int P1 = 37;
    int P2 = 56;
    assertEquals(64.27179603173326, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 64.27179603173326);
  }

  @Test
  public void case74() {
    int W = 501;
    int N = 516;
    int P1 = 34;
    int P2 = 31;
    assertEquals(26.56090640028942, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 26.56090640028942);
  }

  @Test
  public void case75() {
    int W = 241;
    int N = 239;
    int P1 = 10;
    int P2 = 33;
    assertEquals(40.84383916005378, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 40.84383916005378);
  }

  @Test
  public void case76() {
    int W = 1000;
    int N = 570;
    int P1 = 31;
    int P2 = 63;
    assertEquals(98.63669433956981, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 98.63669433956981);
  }

  @Test
  public void case77() {
    int W = 296;
    int N = 102;
    int P1 = 10;
    int P2 = 87;
    assertEquals(0.047709075792224345, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 0.047709075792224345);
  }

  @Test
  public void case78() {
    int W = 810;
    int N = 510;
    int P1 = 31;
    int P2 = 52;
    assertEquals(35.176476623747675, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 35.176476623747675);
  }

  @Test
  public void case79() {
    int W = 1000;
    int N = 595;
    int P1 = 69;
    int P2 = 59;
    assertEquals(93.13187049539495, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 93.13187049539495);
  }

  @Test
  public void case80() {
    int W = 336;
    int N = 241;
    int P1 = 76;
    int P2 = 19;
    assertEquals(98.96621703634301, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 98.96621703634301);
  }

  @Test
  public void case81() {
    int W = 1;
    int N = 1;
    int P1 = 100;
    int P2 = 100;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case82() {
    int W = 1000;
    int N = 1000;
    int P1 = 50;
    int P2 = 25;
    assertEquals(51.47945169449058, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 51.47945169449058);
  }

  @Test
  public void case83() {
    int W = 1;
    int N = 5;
    int P1 = 50;
    int P2 = 50;
    assertEquals(96.875, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 96.875);
  }

  @Test
  public void case84() {
    int W = 30;
    int N = 384;
    int P1 = 3;
    int P2 = 1;
    assertEquals(18.344490479047746, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 18.344490479047746);
  }

  @Test
  public void case85() {
    int W = 1000;
    int N = 824;
    int P1 = 32;
    int P2 = 28;
    assertEquals(7.985531368406269e-13, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 7.985531368406269e-13);
  }

  @Test
  public void case86() {
    int W = 53;
    int N = 55;
    int P1 = 3;
    int P2 = 2;
    assertEquals(2.73920017493805e-15, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 2.73920017493805e-15);
  }

  @Test
  public void case87() {
    int W = 274;
    int N = 403;
    int P1 = 11;
    int P2 = 65;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case88() {
    int W = 564;
    int N = 876;
    int P1 = 42;
    int P2 = 91;
    assertEquals(100.0, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 100.0);
  }

  @Test
  public void case89() {
    int W = 1000;
    int N = 500;
    int P1 = 40;
    int P2 = 30;
    assertEquals(3.409646828907625e-62, simplifieddarts.tryToWin(W, N, P1, P2), DELTA * 3.409646828907625e-62);
  }

}
