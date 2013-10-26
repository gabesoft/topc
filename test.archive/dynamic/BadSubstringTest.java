package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class BadSubstringTest {
  BadSubstring badsubstring = new BadSubstring();

  @Test
  public void case1() {
    int length = 0;
    assertEquals(1L, badsubstring.howMany(length));
  }

  @Test
  public void case2() {
    int length = 3;
    assertEquals(21L, badsubstring.howMany(length));
  }

  @Test
  public void case3() {
    int length = 29;
    assertEquals(1548008755920L, badsubstring.howMany(length));
  }

  @Test
  public void case4() {
    int length = 0;
    assertEquals(1L, badsubstring.howMany(length));
  }

  @Test
  public void case5() {
    int length = 1;
    assertEquals(3L, badsubstring.howMany(length));
  }

  @Test
  public void case6() {
    int length = 2;
    assertEquals(8L, badsubstring.howMany(length));
  }

  @Test
  public void case7() {
    int length = 3;
    assertEquals(21L, badsubstring.howMany(length));
  }

  @Test
  public void case8() {
    int length = 4;
    assertEquals(55L, badsubstring.howMany(length));
  }

  @Test
  public void case9() {
    int length = 5;
    assertEquals(144L, badsubstring.howMany(length));
  }

  @Test
  public void case10() {
    int length = 6;
    assertEquals(377L, badsubstring.howMany(length));
  }

  @Test
  public void case11() {
    int length = 7;
    assertEquals(987L, badsubstring.howMany(length));
  }

  @Test
  public void case12() {
    int length = 8;
    assertEquals(2584L, badsubstring.howMany(length));
  }

  @Test
  public void case13() {
    int length = 9;
    assertEquals(6765L, badsubstring.howMany(length));
  }

  @Test
  public void case14() {
    int length = 10;
    assertEquals(17711L, badsubstring.howMany(length));
  }

  @Test
  public void case15() {
    int length = 11;
    assertEquals(46368L, badsubstring.howMany(length));
  }

  @Test
  public void case16() {
    int length = 12;
    assertEquals(121393L, badsubstring.howMany(length));
  }

  @Test
  public void case17() {
    int length = 13;
    assertEquals(317811L, badsubstring.howMany(length));
  }

  @Test
  public void case18() {
    int length = 14;
    assertEquals(832040L, badsubstring.howMany(length));
  }

  @Test
  public void case19() {
    int length = 15;
    assertEquals(2178309L, badsubstring.howMany(length));
  }

  @Test
  public void case20() {
    int length = 16;
    assertEquals(5702887L, badsubstring.howMany(length));
  }

  @Test
  public void case21() {
    int length = 17;
    assertEquals(14930352L, badsubstring.howMany(length));
  }

  @Test
  public void case22() {
    int length = 18;
    assertEquals(39088169L, badsubstring.howMany(length));
  }

  @Test
  public void case23() {
    int length = 19;
    assertEquals(102334155L, badsubstring.howMany(length));
  }

  @Test
  public void case24() {
    int length = 20;
    assertEquals(267914296L, badsubstring.howMany(length));
  }

  @Test
  public void case25() {
    int length = 21;
    assertEquals(701408733L, badsubstring.howMany(length));
  }

  @Test
  public void case26() {
    int length = 22;
    assertEquals(1836311903L, badsubstring.howMany(length));
  }

  @Test
  public void case27() {
    int length = 23;
    assertEquals(4807526976L, badsubstring.howMany(length));
  }

  @Test
  public void case28() {
    int length = 24;
    assertEquals(12586269025L, badsubstring.howMany(length));
  }

  @Test
  public void case29() {
    int length = 25;
    assertEquals(32951280099L, badsubstring.howMany(length));
  }

  @Test
  public void case30() {
    int length = 26;
    assertEquals(86267571272L, badsubstring.howMany(length));
  }

  @Test
  public void case31() {
    int length = 27;
    assertEquals(225851433717L, badsubstring.howMany(length));
  }

  @Test
  public void case32() {
    int length = 28;
    assertEquals(591286729879L, badsubstring.howMany(length));
  }

  @Test
  public void case33() {
    int length = 29;
    assertEquals(1548008755920L, badsubstring.howMany(length));
  }

  @Test
  public void case34() {
    int length = 30;
    assertEquals(4052739537881L, badsubstring.howMany(length));
  }

  @Test
  public void case35() {
    int length = 31;
    assertEquals(10610209857723L, badsubstring.howMany(length));
  }

  @Test
  public void case36() {
    int length = 32;
    assertEquals(27777890035288L, badsubstring.howMany(length));
  }

  @Test
  public void case37() {
    int length = 33;
    assertEquals(72723460248141L, badsubstring.howMany(length));
  }

  @Test
  public void case38() {
    int length = 34;
    assertEquals(190392490709135L, badsubstring.howMany(length));
  }

  @Test
  public void case39() {
    int length = 35;
    assertEquals(498454011879264L, badsubstring.howMany(length));
  }

  @Test
  public void case40() {
    int length = 36;
    assertEquals(1304969544928657L, badsubstring.howMany(length));
  }

  @Test
  public void case41() {
    int length = 37;
    assertEquals(3416454622906707L, badsubstring.howMany(length));
  }

  @Test
  public void case42() {
    int length = 38;
    assertEquals(8944394323791464L, badsubstring.howMany(length));
  }

  @Test
  public void case43() {
    int length = 39;
    assertEquals(23416728348467685L, badsubstring.howMany(length));
  }

  @Test
  public void case44() {
    int length = 40;
    assertEquals(61305790721611591L, badsubstring.howMany(length));
  }

  @Test
  public void case45() {
    int length = 41;
    assertEquals(160500643816367088L, badsubstring.howMany(length));
  }

  @Test
  public void case46() {
    int length = 42;
    assertEquals(420196140727489673L, badsubstring.howMany(length));
  }

  @Test
  public void case47() {
    int length = 43;
    assertEquals(1100087778366101931L, badsubstring.howMany(length));
  }

  @Test
  public void case48() {
    int length = 44;
    assertEquals(2880067194370816120L, badsubstring.howMany(length));
  }

  @Test
  public void case49() {
    int length = 9;
    assertEquals(6765L, badsubstring.howMany(length));
  }

  @Test
  public void case50() {
    int length = 29;
    assertEquals(1548008755920L, badsubstring.howMany(length));
  }

  @Test
  public void case51() {
    int length = 0;
    assertEquals(1L, badsubstring.howMany(length));
  }

  @Test
  public void case52() {
    int length = 44;
    assertEquals(2880067194370816120L, badsubstring.howMany(length));
  }

  @Test
  public void case53() {
    int length = 2;
    assertEquals(8L, badsubstring.howMany(length));
  }

  @Test
  public void case54() {
    int length = 38;
    assertEquals(8944394323791464L, badsubstring.howMany(length));
  }

  @Test
  public void case55() {
    int length = 37;
    assertEquals(3416454622906707L, badsubstring.howMany(length));
  }

  @Test
  public void case56() {
    int length = 43;
    assertEquals(1100087778366101931L, badsubstring.howMany(length));
  }

}
