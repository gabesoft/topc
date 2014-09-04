package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class FoxAndClassroomTest {
  FoxAndClassroom foxandclassroom = new FoxAndClassroom();

  @Test
  public void case1() {
    int n = 2;
    int m = 3;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case2() {
    int n = 2;
    int m = 2;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case3() {
    int n = 4;
    int m = 6;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case4() {
    int n = 5;
    int m = 7;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case5() {
    int n = 10;
    int m = 10;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case6() {
    int n = 2;
    int m = 2;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case7() {
    int n = 2;
    int m = 3;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case8() {
    int n = 2;
    int m = 4;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case9() {
    int n = 2;
    int m = 5;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case10() {
    int n = 2;
    int m = 6;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case11() {
    int n = 2;
    int m = 7;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case12() {
    int n = 2;
    int m = 8;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case13() {
    int n = 2;
    int m = 9;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case14() {
    int n = 2;
    int m = 10;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case15() {
    int n = 3;
    int m = 2;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case16() {
    int n = 3;
    int m = 3;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case17() {
    int n = 3;
    int m = 4;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case18() {
    int n = 3;
    int m = 5;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case19() {
    int n = 3;
    int m = 6;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case20() {
    int n = 3;
    int m = 7;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case21() {
    int n = 3;
    int m = 8;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case22() {
    int n = 3;
    int m = 9;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case23() {
    int n = 3;
    int m = 10;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case24() {
    int n = 4;
    int m = 2;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case25() {
    int n = 4;
    int m = 3;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case26() {
    int n = 4;
    int m = 4;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case27() {
    int n = 4;
    int m = 5;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case28() {
    int n = 4;
    int m = 6;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case29() {
    int n = 4;
    int m = 7;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case30() {
    int n = 4;
    int m = 8;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case31() {
    int n = 4;
    int m = 9;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case32() {
    int n = 4;
    int m = 10;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case33() {
    int n = 5;
    int m = 2;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case34() {
    int n = 5;
    int m = 3;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case35() {
    int n = 5;
    int m = 4;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case36() {
    int n = 5;
    int m = 5;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case37() {
    int n = 5;
    int m = 6;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case38() {
    int n = 5;
    int m = 7;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case39() {
    int n = 5;
    int m = 8;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case40() {
    int n = 5;
    int m = 9;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case41() {
    int n = 5;
    int m = 10;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case42() {
    int n = 6;
    int m = 2;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case43() {
    int n = 6;
    int m = 3;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case44() {
    int n = 6;
    int m = 4;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case45() {
    int n = 6;
    int m = 5;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case46() {
    int n = 6;
    int m = 6;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case47() {
    int n = 6;
    int m = 7;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case48() {
    int n = 6;
    int m = 8;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case49() {
    int n = 6;
    int m = 9;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case50() {
    int n = 6;
    int m = 10;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case51() {
    int n = 7;
    int m = 2;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case52() {
    int n = 7;
    int m = 3;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case53() {
    int n = 7;
    int m = 4;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case54() {
    int n = 7;
    int m = 5;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case55() {
    int n = 7;
    int m = 6;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case56() {
    int n = 7;
    int m = 7;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case57() {
    int n = 7;
    int m = 8;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case58() {
    int n = 7;
    int m = 9;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case59() {
    int n = 7;
    int m = 10;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case60() {
    int n = 8;
    int m = 2;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case61() {
    int n = 8;
    int m = 3;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case62() {
    int n = 8;
    int m = 4;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case63() {
    int n = 8;
    int m = 5;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case64() {
    int n = 8;
    int m = 6;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case65() {
    int n = 8;
    int m = 7;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case66() {
    int n = 8;
    int m = 8;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case67() {
    int n = 8;
    int m = 9;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case68() {
    int n = 8;
    int m = 10;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case69() {
    int n = 9;
    int m = 2;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case70() {
    int n = 9;
    int m = 3;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case71() {
    int n = 9;
    int m = 4;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case72() {
    int n = 9;
    int m = 5;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case73() {
    int n = 9;
    int m = 6;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case74() {
    int n = 9;
    int m = 7;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case75() {
    int n = 9;
    int m = 8;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case76() {
    int n = 9;
    int m = 9;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case77() {
    int n = 9;
    int m = 10;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case78() {
    int n = 10;
    int m = 2;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case79() {
    int n = 10;
    int m = 3;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case80() {
    int n = 10;
    int m = 4;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case81() {
    int n = 10;
    int m = 5;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case82() {
    int n = 10;
    int m = 6;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case83() {
    int n = 10;
    int m = 7;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case84() {
    int n = 10;
    int m = 8;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case85() {
    int n = 10;
    int m = 9;
    assertEquals("Possible", foxandclassroom.ableTo(n, m));
  }

  @Test
  public void case86() {
    int n = 10;
    int m = 10;
    assertEquals("Impossible", foxandclassroom.ableTo(n, m));
  }

}
