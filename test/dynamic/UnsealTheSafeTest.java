package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class UnsealTheSafeTest {
  UnsealTheSafe unsealthesafe = new UnsealTheSafe();

  @Test
  public void case1() {
    int N = 2;
    assertEquals(26L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case2() {
    int N = 3;
    assertEquals(74L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case3() {
    int N = 25;
    assertEquals(768478331222L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case4() {
    int N = 4;
    assertEquals(210L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case5() {
    int N = 5;
    assertEquals(600L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case6() {
    int N = 6;
    assertEquals(1710L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case7() {
    int N = 7;
    assertEquals(4882L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case8() {
    int N = 8;
    assertEquals(13926L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case9() {
    int N = 9;
    assertEquals(39746L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case10() {
    int N = 10;
    assertEquals(113406L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case11() {
    int N = 11;
    assertEquals(323638L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case12() {
    int N = 12;
    assertEquals(923502L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case13() {
    int N = 13;
    assertEquals(2635406L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case14() {
    int N = 14;
    assertEquals(7520334L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case15() {
    int N = 15;
    assertEquals(21460630L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case16() {
    int N = 16;
    assertEquals(61240062L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case17() {
    int N = 17;
    assertEquals(174759014L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case18() {
    int N = 18;
    assertEquals(498693678L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case19() {
    int N = 19;
    assertEquals(1423106470L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case20() {
    int N = 20;
    assertEquals(4060990974L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case21() {
    int N = 21;
    assertEquals(11588718614L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case22() {
    int N = 22;
    assertEquals(33069692814L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case23() {
    int N = 23;
    assertEquals(94369903558L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case24() {
    int N = 24;
    assertEquals(269294999646L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case25() {
    int N = 26;
    assertEquals(2192938314414L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case26() {
    int N = 27;
    assertEquals(6257916269734L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case27() {
    int N = 28;
    assertEquals(17857659623934L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case28() {
    int N = 29;
    assertEquals(50959818439094L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case29() {
    int N = 30;
    assertEquals(145419506315214L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case30() {
    int N = 30;
    assertEquals(145419506315214L, unsealthesafe.countPasswords(N));
  }

  @Test
  public void case31() {
    int N = 29;
    assertEquals(50959818439094L, unsealthesafe.countPasswords(N));
  }

}
