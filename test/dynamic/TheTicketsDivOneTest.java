package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TheTicketsDivOneTest {
  double DELTA = 1.0e-09;
  TheTicketsDivOne theticketsdivone = new TheTicketsDivOne();

  @Test
  public void case1() {
    int n = 2;
    int m = 1;
    assertEquals(0.4444444444444444, theticketsdivone.find(n, m), DELTA * 0.4444444444444444);
  }

  @Test
  public void case2() {
    int n = 2;
    int m = 2;
    assertEquals(0.5555555555555556, theticketsdivone.find(n, m), DELTA * 0.5555555555555556);
  }

  @Test
  public void case3() {
    int n = 1;
    int m = 1;
    assertEquals(1.0, theticketsdivone.find(n, m), DELTA * 1.0);
  }

  @Test
  public void case4() {
    int n = 3;
    int m = 2;
    assertEquals(0.31746031746031744, theticketsdivone.find(n, m), DELTA * 0.31746031746031744);
  }

  @Test
  public void case5() {
    int n = 25;
    int m = 1;
    assertEquals(0.16776527430800667, theticketsdivone.find(n, m), DELTA * 0.16776527430800667);
  }

  @Test
  public void case6() {
    int n = 7;
    int m = 1;
    assertEquals(0.21272477008341567, theticketsdivone.find(n, m), DELTA * 0.21272477008341567);
  }

  @Test
  public void case7() {
    int n = 40;
    int m = 26;
    assertEquals(0.0017521393226481148, theticketsdivone.find(n, m), DELTA * 0.0017521393226481148);
  }

  @Test
  public void case8() {
    int n = 17;
    int m = 3;
    assertEquals(0.11993258942241557, theticketsdivone.find(n, m), DELTA * 0.11993258942241557);
  }

  @Test
  public void case9() {
    int n = 43;
    int m = 27;
    assertEquals(0.0014585205711715305, theticketsdivone.find(n, m), DELTA * 0.0014585205711715305);
  }

  @Test
  public void case10() {
    int n = 38;
    int m = 27;
    assertEquals(0.0014625153332662843, theticketsdivone.find(n, m), DELTA * 0.0014625153332662843);
  }

  @Test
  public void case11() {
    int n = 23;
    int m = 10;
    assertEquals(0.03294600045355396, theticketsdivone.find(n, m), DELTA * 0.03294600045355396);
  }

  @Test
  public void case12() {
    int n = 22;
    int m = 3;
    assertEquals(0.1173214640737295, theticketsdivone.find(n, m), DELTA * 0.1173214640737295);
  }

  @Test
  public void case13() {
    int n = 18;
    int m = 7;
    assertEquals(0.058145594919708644, theticketsdivone.find(n, m), DELTA * 0.058145594919708644);
  }

  @Test
  public void case14() {
    int n = 37;
    int m = 4;
    assertEquals(0.09653754521315697, theticketsdivone.find(n, m), DELTA * 0.09653754521315697);
  }

  @Test
  public void case15() {
    int n = 18;
    int m = 7;
    assertEquals(0.058145594919708644, theticketsdivone.find(n, m), DELTA * 0.058145594919708644);
  }

  @Test
  public void case16() {
    int n = 12;
    int m = 4;
    assertEquals(0.10736589253163475, theticketsdivone.find(n, m), DELTA * 0.10736589253163475);
  }

  @Test
  public void case17() {
    int n = 37;
    int m = 12;
    assertEquals(0.022469018416812463, theticketsdivone.find(n, m), DELTA * 0.022469018416812463);
  }

  @Test
  public void case18() {
    int n = 7;
    int m = 1;
    assertEquals(0.21272477008341567, theticketsdivone.find(n, m), DELTA * 0.21272477008341567);
  }

  @Test
  public void case19() {
    int n = 8;
    int m = 3;
    assertEquals(0.146740717545711, theticketsdivone.find(n, m), DELTA * 0.146740717545711);
  }

  @Test
  public void case20() {
    int n = 8;
    int m = 5;
    assertEquals(0.107905269308481, theticketsdivone.find(n, m), DELTA * 0.107905269308481);
  }

  @Test
  public void case21() {
    int n = 47;
    int m = 42;
    assertEquals(9.475790347815949e-05, theticketsdivone.find(n, m), DELTA * 9.475790347815949e-05);
  }

  @Test
  public void case22() {
    int n = 44;
    int m = 29;
    assertEquals(0.001012810488300904, theticketsdivone.find(n, m), DELTA * 0.001012810488300904);
  }

  @Test
  public void case23() {
    int n = 44;
    int m = 6;
    assertEquals(0.06699911122616958, theticketsdivone.find(n, m), DELTA * 0.06699911122616958);
  }

  @Test
  public void case24() {
    int n = 47;
    int m = 32;
    assertEquals(0.000585838661241397, theticketsdivone.find(n, m), DELTA * 0.000585838661241397);
  }

  @Test
  public void case25() {
    int n = 46;
    int m = 23;
    assertEquals(0.003021262465457692, theticketsdivone.find(n, m), DELTA * 0.003021262465457692);
  }

  @Test
  public void case26() {
    int n = 44;
    int m = 15;
    assertEquals(0.01298868651151011, theticketsdivone.find(n, m), DELTA * 0.01298868651151011);
  }

  @Test
  public void case27() {
    int n = 44;
    int m = 41;
    assertEquals(0.0001139030212404029, theticketsdivone.find(n, m), DELTA * 0.0001139030212404029);
  }

  @Test
  public void case28() {
    int n = 46;
    int m = 37;
    assertEquals(0.000235666564043745, theticketsdivone.find(n, m), DELTA * 0.000235666564043745);
  }

  @Test
  public void case29() {
    int n = 46;
    int m = 11;
    assertEquals(0.026925601755560444, theticketsdivone.find(n, m), DELTA * 0.026925601755560444);
  }

  @Test
  public void case30() {
    int n = 45;
    int m = 31;
    assertEquals(0.0007033061884509057, theticketsdivone.find(n, m), DELTA * 0.0007033061884509057);
  }

  @Test
  public void case31() {
    int n = 25;
    int m = 1;
    assertEquals(0.16776527430800667, theticketsdivone.find(n, m), DELTA * 0.16776527430800667);
  }

  @Test
  public void case32() {
    int n = 7;
    int m = 1;
    assertEquals(0.21272477008341567, theticketsdivone.find(n, m), DELTA * 0.21272477008341567);
  }

  @Test
  public void case33() {
    int n = 40;
    int m = 1;
    assertEquals(0.16673530169869788, theticketsdivone.find(n, m), DELTA * 0.16673530169869788);
  }

  @Test
  public void case34() {
    int n = 17;
    int m = 1;
    assertEquals(0.171763066351931, theticketsdivone.find(n, m), DELTA * 0.171763066351931);
  }

  @Test
  public void case35() {
    int n = 43;
    int m = 1;
    assertEquals(0.16670628940724788, theticketsdivone.find(n, m), DELTA * 0.16670628940724788);
  }

  @Test
  public void case36() {
    int n = 25;
    int m = 25;
    assertEquals(0.002197215282679989, theticketsdivone.find(n, m), DELTA * 0.002197215282679989);
  }

  @Test
  public void case37() {
    int n = 7;
    int m = 7;
    assertEquals(0.092116206833498, theticketsdivone.find(n, m), DELTA * 0.092116206833498);
  }

  @Test
  public void case38() {
    int n = 40;
    int m = 40;
    assertEquals(0.00013727006406245328, theticketsdivone.find(n, m), DELTA * 0.00013727006406245328);
  }

  @Test
  public void case39() {
    int n = 17;
    int m = 17;
    assertEquals(0.010192799370528687, theticketsdivone.find(n, m), DELTA * 0.010192799370528687);
  }

  @Test
  public void case40() {
    int n = 43;
    int m = 43;
    assertEquals(7.924548116240987e-05, theticketsdivone.find(n, m), DELTA * 7.924548116240987e-05);
  }

  @Test
  public void case41() {
    int n = 47;
    int m = 42;
    assertEquals(9.475790347815949e-05, theticketsdivone.find(n, m), DELTA * 9.475790347815949e-05);
  }

  @Test
  public void case42() {
    int n = 47;
    int m = 19;
    assertEquals(0.006263051514682197, theticketsdivone.find(n, m), DELTA * 0.006263051514682197);
  }

  @Test
  public void case43() {
    int n = 47;
    int m = 45;
    assertEquals(5.4877050657080916e-05, theticketsdivone.find(n, m), DELTA * 5.4877050657080916e-05);
  }

  @Test
  public void case44() {
    int n = 47;
    int m = 32;
    assertEquals(0.000585838661241397, theticketsdivone.find(n, m), DELTA * 0.000585838661241397);
  }

  @Test
  public void case45() {
    int n = 47;
    int m = 1;
    assertEquals(0.16668573258953942, theticketsdivone.find(n, m), DELTA * 0.16668573258953942);
  }

  @Test
  public void case46() {
    int n = 47;
    int m = 47;
    assertEquals(3.8131845745485545e-05, theticketsdivone.find(n, m), DELTA * 3.8131845745485545e-05);
  }

  @Test
  public void case47() {
    int n = 47;
    int m = 23;
    assertEquals(0.0030208806165636496, theticketsdivone.find(n, m), DELTA * 0.0030208806165636496);
  }

  @Test
  public void case48() {
    int n = 1000;
    int m = 1;
    assertEquals(0.16666666666666666, theticketsdivone.find(n, m), DELTA * 0.16666666666666666);
  }

  @Test
  public void case49() {
    int n = 1000;
    int m = 125;
    assertEquals(2.5314784793751827e-11, theticketsdivone.find(n, m), DELTA * 2.5314784793751827e-11);
  }

  @Test
  public void case50() {
    int n = 1000;
    int m = 226;
    assertEquals(2.5472313367414e-19, theticketsdivone.find(n, m), DELTA * 2.5472313367414e-19);
  }

  @Test
  public void case51() {
    int n = 1000;
    int m = 852;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case52() {
    int n = 1000;
    int m = 573;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case53() {
    int n = 1000;
    int m = 7;
    assertEquals(0.05581632944673068, theticketsdivone.find(n, m), DELTA * 0.05581632944673068);
  }

  @Test
  public void case54() {
    int n = 1000;
    int m = 437;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case55() {
    int n = 1000;
    int m = 523;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case56() {
    int n = 1000;
    int m = 529;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case57() {
    int n = 1000;
    int m = 291;
    assertEquals(1.81671747e-24, theticketsdivone.find(n, m), DELTA * 1.81671747e-24);
  }

  @Test
  public void case58() {
    int n = 1000;
    int m = 227;
    assertEquals(2.1226927806178e-19, theticketsdivone.find(n, m), DELTA * 2.1226927806178e-19);
  }

  @Test
  public void case59() {
    int n = 1000;
    int m = 252;
    assertEquals(2.22513308733e-21, theticketsdivone.find(n, m), DELTA * 2.22513308733e-21);
  }

  @Test
  public void case60() {
    int n = 1000;
    int m = 269;
    assertEquals(1.0029396683e-22, theticketsdivone.find(n, m), DELTA * 1.0029396683e-22);
  }

  @Test
  public void case61() {
    int n = 951;
    int m = 475;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case62() {
    int n = 966;
    int m = 483;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case63() {
    int n = 992;
    int m = 496;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case64() {
    int n = 981;
    int m = 490;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case65() {
    int n = 969;
    int m = 484;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case66() {
    int n = 996;
    int m = 3;
    assertEquals(0.11574074074074074, theticketsdivone.find(n, m), DELTA * 0.11574074074074074);
  }

  @Test
  public void case67() {
    int n = 992;
    int m = 1;
    assertEquals(0.16666666666666666, theticketsdivone.find(n, m), DELTA * 0.16666666666666666);
  }

  @Test
  public void case68() {
    int n = 990;
    int m = 1;
    assertEquals(0.16666666666666666, theticketsdivone.find(n, m), DELTA * 0.16666666666666666);
  }

  @Test
  public void case69() {
    int n = 997;
    int m = 1;
    assertEquals(0.16666666666666666, theticketsdivone.find(n, m), DELTA * 0.16666666666666666);
  }

  @Test
  public void case70() {
    int n = 1000;
    int m = 3;
    assertEquals(0.11574074074074074, theticketsdivone.find(n, m), DELTA * 0.11574074074074074);
  }

  @Test
  public void case71() {
    int n = 1000;
    int m = 1;
    assertEquals(0.16666666666666666, theticketsdivone.find(n, m), DELTA * 0.16666666666666666);
  }

  @Test
  public void case72() {
    int n = 1000;
    int m = 1000;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case73() {
    int n = 1000;
    int m = 500;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case74() {
    int n = 1000;
    int m = 4;
    assertEquals(0.09645061728395062, theticketsdivone.find(n, m), DELTA * 0.09645061728395062);
  }

  @Test
  public void case75() {
    int n = 110;
    int m = 110;
    assertEquals(3.900274442572262e-10, theticketsdivone.find(n, m), DELTA * 3.900274442572262e-10);
  }

  @Test
  public void case76() {
    int n = 128;
    int m = 122;
    assertEquals(4.374396941772629e-11, theticketsdivone.find(n, m), DELTA * 4.374396941772629e-11);
  }

  @Test
  public void case77() {
    int n = 52;
    int m = 50;
    assertEquals(2.2021905767741966e-05, theticketsdivone.find(n, m), DELTA * 2.2021905767741966e-05);
  }

  @Test
  public void case78() {
    int n = 163;
    int m = 145;
    assertEquals(6.603121991488001e-13, theticketsdivone.find(n, m), DELTA * 6.603121991488001e-13);
  }

  @Test
  public void case79() {
    int n = 173;
    int m = 68;
    assertEquals(8.254775460163392e-07, theticketsdivone.find(n, m), DELTA * 8.254775460163392e-07);
  }

  @Test
  public void case80() {
    int n = 136;
    int m = 104;
    assertEquals(1.16460974290397e-09, theticketsdivone.find(n, m), DELTA * 1.16460974290397e-09);
  }

  @Test
  public void case81() {
    int n = 83;
    int m = 61;
    assertEquals(2.9578835127451844e-06, theticketsdivone.find(n, m), DELTA * 2.9578835127451844e-06);
  }

  @Test
  public void case82() {
    int n = 94;
    int m = 89;
    assertEquals(1.794350668344125e-08, theticketsdivone.find(n, m), DELTA * 1.794350668344125e-08);
  }

  @Test
  public void case83() {
    int n = 103;
    int m = 92;
    assertEquals(1.0383825105978649e-08, theticketsdivone.find(n, m), DELTA * 1.0383825105978649e-08);
  }

  @Test
  public void case84() {
    int n = 101;
    int m = 93;
    assertEquals(8.653209789287519e-09, theticketsdivone.find(n, m), DELTA * 8.653209789287519e-09);
  }

  @Test
  public void case85() {
    int n = 98;
    int m = 91;
    assertEquals(1.2460665231186242e-08, theticketsdivone.find(n, m), DELTA * 1.2460665231186242e-08);
  }

  @Test
  public void case86() {
    int n = 105;
    int m = 93;
    assertEquals(8.653177594869053e-09, theticketsdivone.find(n, m), DELTA * 8.653177594869053e-09);
  }

  @Test
  public void case87() {
    int n = 92;
    int m = 87;
    assertEquals(2.583876453475784e-08, theticketsdivone.find(n, m), DELTA * 2.583876453475784e-08);
  }

  @Test
  public void case88() {
    int n = 102;
    int m = 83;
    assertEquals(5.3578157834141396e-08, theticketsdivone.find(n, m), DELTA * 5.3578157834141396e-08);
  }

  @Test
  public void case89() {
    int n = 97;
    int m = 87;
    assertEquals(2.5838402947961e-08, theticketsdivone.find(n, m), DELTA * 2.5838402947961e-08);
  }

  @Test
  public void case90() {
    int n = 90;
    int m = 85;
    assertEquals(3.720802529862536e-08, theticketsdivone.find(n, m), DELTA * 3.720802529862536e-08);
  }

  @Test
  public void case91() {
    int n = 91;
    int m = 88;
    assertEquals(2.15324530526375e-08, theticketsdivone.find(n, m), DELTA * 2.15324530526375e-08);
  }

  @Test
  public void case92() {
    int n = 101;
    int m = 100;
    assertEquals(2.414964438734903e-09, theticketsdivone.find(n, m), DELTA * 2.414964438734903e-09);
  }

  @Test
  public void case93() {
    int n = 101;
    int m = 98;
    assertEquals(3.4775426758278295e-09, theticketsdivone.find(n, m), DELTA * 3.4775426758278295e-09);
  }

  @Test
  public void case94() {
    int n = 102;
    int m = 98;
    assertEquals(3.477536551997076e-09, theticketsdivone.find(n, m), DELTA * 3.477536551997076e-09);
  }

  @Test
  public void case95() {
    int n = 98;
    int m = 98;
    assertEquals(3.4775694400722464e-09, theticketsdivone.find(n, m), DELTA * 3.4775694400722464e-09);
  }

  @Test
  public void case96() {
    int n = 102;
    int m = 102;
    assertEquals(1.6770580593590213e-09, theticketsdivone.find(n, m), DELTA * 1.6770580593590213e-09);
  }

  @Test
  public void case97() {
    int n = 100;
    int m = 100;
    assertEquals(2.4149703940927286e-09, theticketsdivone.find(n, m), DELTA * 2.4149703940927286e-09);
  }

  @Test
  public void case98() {
    int n = 1000;
    int m = 100;
    assertEquals(2.4149346944827333e-09, theticketsdivone.find(n, m), DELTA * 2.4149346944827333e-09);
  }

  @Test
  public void case99() {
    int n = 101;
    int m = 101;
    assertEquals(2.0124723507316943e-09, theticketsdivone.find(n, m), DELTA * 2.0124723507316943e-09);
  }

  @Test
  public void case100() {
    int n = 104;
    int m = 104;
    assertEquals(1.1646210012967942e-09, theticketsdivone.find(n, m), DELTA * 1.1646210012967942e-09);
  }

  @Test
  public void case101() {
    int n = 107;
    int m = 107;
    assertEquals(6.739687149675048e-10, theticketsdivone.find(n, m), DELTA * 6.739687149675048e-10);
  }

  @Test
  public void case102() {
    int n = 997;
    int m = 779;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case103() {
    int n = 1000;
    int m = 999;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case104() {
    int n = 1000;
    int m = 391;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case105() {
    int n = 51;
    int m = 51;
    assertEquals(1.836292277544459e-05, theticketsdivone.find(n, m), DELTA * 1.836292277544459e-05);
  }

  @Test
  public void case106() {
    int n = 10;
    int m = 5;
    assertEquals(0.09650729524561763, theticketsdivone.find(n, m), DELTA * 0.09650729524561763);
  }

  @Test
  public void case107() {
    int n = 999;
    int m = 42;
    assertEquals(9.44969217773099e-05, theticketsdivone.find(n, m), DELTA * 9.44969217773099e-05);
  }

  @Test
  public void case108() {
    int n = 990;
    int m = 500;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case109() {
    int n = 1000;
    int m = 10;
    assertEquals(0.03230111657796914, theticketsdivone.find(n, m), DELTA * 0.03230111657796914);
  }

  @Test
  public void case110() {
    int n = 997;
    int m = 995;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case111() {
    int n = 1000;
    int m = 389;
    assertEquals(3.0e-32, theticketsdivone.find(n, m), DELTA * 3.0e-32);
  }

  @Test
  public void case112() {
    int n = 50;
    int m = 47;
    assertEquals(3.806515119122412e-05, theticketsdivone.find(n, m), DELTA * 3.806515119122412e-05);
  }

  @Test
  public void case113() {
    int n = 1000;
    int m = 13;
    assertEquals(0.01869277579743585, theticketsdivone.find(n, m), DELTA * 0.01869277579743585);
  }

  @Test
  public void case114() {
    int n = 90;
    int m = 90;
    assertEquals(1.4953273949768097e-08, theticketsdivone.find(n, m), DELTA * 1.4953273949768097e-08);
  }

  @Test
  public void case115() {
    int n = 1000;
    int m = 103;
    assertEquals(1.39753165189973e-09, theticketsdivone.find(n, m), DELTA * 1.39753165189973e-09);
  }

}
