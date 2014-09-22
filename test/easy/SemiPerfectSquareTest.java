package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SemiPerfectSquareTest {
  SemiPerfectSquare semiperfectsquare = new SemiPerfectSquare();

  @Test
  public void case1() {
    int N = 48;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case2() {
    int N = 1000;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case3() {
    int N = 25;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case4() {
    int N = 47;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case5() {
    int N = 847;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case6() {
    int N = 3;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case7() {
    int N = 4;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case8() {
    int N = 5;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case9() {
    int N = 6;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case10() {
    int N = 7;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case11() {
    int N = 8;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case12() {
    int N = 9;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case13() {
    int N = 10;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case14() {
    int N = 16;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case15() {
    int N = 18;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case16() {
    int N = 27;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case17() {
    int N = 49;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case18() {
    int N = 83;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case19() {
    int N = 100;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case20() {
    int N = 396;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case21() {
    int N = 507;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case22() {
    int N = 33;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case23() {
    int N = 58;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case24() {
    int N = 63;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case25() {
    int N = 67;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case26() {
    int N = 72;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case27() {
    int N = 78;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case28() {
    int N = 81;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case29() {
    int N = 84;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case30() {
    int N = 98;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case31() {
    int N = 108;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case32() {
    int N = 121;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case33() {
    int N = 141;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case34() {
    int N = 144;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case35() {
    int N = 155;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case36() {
    int N = 162;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case37() {
    int N = 216;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case38() {
    int N = 225;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case39() {
    int N = 238;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case40() {
    int N = 240;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case41() {
    int N = 243;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case42() {
    int N = 265;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case43() {
    int N = 288;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case44() {
    int N = 289;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case45() {
    int N = 300;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case46() {
    int N = 303;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case47() {
    int N = 317;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case48() {
    int N = 320;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case49() {
    int N = 351;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case50() {
    int N = 377;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case51() {
    int N = 394;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case52() {
    int N = 405;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case53() {
    int N = 419;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case54() {
    int N = 438;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case55() {
    int N = 439;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case56() {
    int N = 441;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case57() {
    int N = 447;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case58() {
    int N = 449;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case59() {
    int N = 458;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case60() {
    int N = 472;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case61() {
    int N = 486;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case62() {
    int N = 512;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case63() {
    int N = 515;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case64() {
    int N = 554;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case65() {
    int N = 589;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case66() {
    int N = 600;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case67() {
    int N = 625;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case68() {
    int N = 635;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case69() {
    int N = 643;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case70() {
    int N = 647;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case71() {
    int N = 648;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case72() {
    int N = 659;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case73() {
    int N = 717;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case74() {
    int N = 735;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case75() {
    int N = 759;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case76() {
    int N = 766;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case77() {
    int N = 781;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case78() {
    int N = 813;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case79() {
    int N = 826;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case80() {
    int N = 841;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case81() {
    int N = 845;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case82() {
    int N = 852;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case83() {
    int N = 855;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case84() {
    int N = 887;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case85() {
    int N = 900;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case86() {
    int N = 930;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case87() {
    int N = 946;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case88() {
    int N = 968;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case89() {
    int N = 169;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case90() {
    int N = 529;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case91() {
    int N = 24;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case92() {
    int N = 12;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case93() {
    int N = 75;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case94() {
    int N = 50;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case95() {
    int N = 901;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case96() {
    int N = 576;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case97() {
    int N = 90;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case98() {
    int N = 343;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case99() {
    int N = 64;
    assertEquals("Yes", semiperfectsquare.check(N));
  }

  @Test
  public void case100() {
    int N = 20;
    assertEquals("No", semiperfectsquare.check(N));
  }

  @Test
  public void case101() {
    int N = 999;
    assertEquals("No", semiperfectsquare.check(N));
  }

}
