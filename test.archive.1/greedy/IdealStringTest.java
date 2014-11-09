package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class IdealStringTest {
  IdealString idealstring = new IdealString();

  @Test
  public void case1() {
    int length = 1;
    assertEquals("A", idealstring.construct(length));
  }

  @Test
  public void case2() {
    int length = 3;
    assertEquals("ABB", idealstring.construct(length));
  }

  @Test
  public void case3() {
    int length = 2;
    assertEquals("", idealstring.construct(length));
  }

  @Test
  public void case4() {
    int length = 4;
    assertEquals("", idealstring.construct(length));
  }

  @Test
  public void case5() {
    int length = 6;
    assertEquals("ABCBCC", idealstring.construct(length));
  }

  @Test
  public void case6() {
    int length = 7;
    assertEquals("ABBCCCC", idealstring.construct(length));
  }

  @Test
  public void case7() {
    int length = 5;
    assertEquals("", idealstring.construct(length));
  }

  @Test
  public void case8() {
    int length = 8;
    assertEquals("", idealstring.construct(length));
  }

  @Test
  public void case9() {
    int length = 9;
    assertEquals("", idealstring.construct(length));
  }

  @Test
  public void case10() {
    int length = 10;
    assertEquals("ABCDBCCDDD", idealstring.construct(length));
  }

  @Test
  public void case11() {
    int length = 11;
    assertEquals("ABCBDCCDDDD", idealstring.construct(length));
  }

  @Test
  public void case12() {
    int length = 12;
    assertEquals("ABBCDCCCDDDD", idealstring.construct(length));
  }

  @Test
  public void case13() {
    int length = 13;
    assertEquals("ABBCCDCCDDDDD", idealstring.construct(length));
  }

  @Test
  public void case14() {
    int length = 14;
    assertEquals("ABBCCCDCDDDDDD", idealstring.construct(length));
  }

  @Test
  public void case15() {
    int length = 15;
    assertEquals("ABBCCCCDDDDDDDD", idealstring.construct(length));
  }

  @Test
  public void case16() {
    int length = 16;
    assertEquals("ABCDBECCDDDEEEEE", idealstring.construct(length));
  }

  @Test
  public void case17() {
    int length = 17;
    assertEquals("ABCBDECCDDDDEEEEE", idealstring.construct(length));
  }

  @Test
  public void case18() {
    int length = 18;
    assertEquals("ABBCDECCCDDDDEEEEE", idealstring.construct(length));
  }

  @Test
  public void case19() {
    int length = 19;
    assertEquals("ABBCDCECCDDDDEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case20() {
    int length = 20;
    assertEquals("ABBCCDECCDDDDDEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case21() {
    int length = 21;
    assertEquals("ABBCCDCECDDDDDEEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case22() {
    int length = 22;
    assertEquals("ABBCCCDECDDDDDDEEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case23() {
    int length = 23;
    assertEquals("ABBCCCDCEDDDDDDEEEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case24() {
    int length = 24;
    assertEquals("ABBCCCCDEDDDDDDDEEEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case25() {
    int length = 25;
    assertEquals("ABBCCCCDDEDDDDDDEEEEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case26() {
    int length = 26;
    assertEquals("ABBCCCCDDDEDDDDDEEEEEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case27() {
    int length = 27;
    assertEquals("ABBCCCCDDDDEDDDDEEEEEEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case28() {
    int length = 28;
    assertEquals("ABBCCCCDDDDDEDDDEEEEEEEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case29() {
    int length = 29;
    assertEquals("ABBCCCCDDDDDDEDDEEEEEEEEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case30() {
    int length = 30;
    assertEquals("ABBCCCCDDDDDDDEDEEEEEEEEEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case31() {
    int length = 31;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEE", idealstring.construct(length));
  }

  @Test
  public void case32() {
    int length = 32;
    assertEquals("ABBCCCDECFDDDDDDEEEEEEEFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case33() {
    int length = 33;
    assertEquals("ABBCCCDCEFDDDDDDEEEEEEEEFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case34() {
    int length = 34;
    assertEquals("ABBCCCCDEFDDDDDDDEEEEEEEEFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case35() {
    int length = 35;
    assertEquals("ABBCCCCDEDFDDDDDDEEEEEEEEFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case36() {
    int length = 36;
    assertEquals("ABBCCCCDDEFDDDDDDEEEEEEEEEFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case37() {
    int length = 37;
    assertEquals("ABBCCCCDDEDFDDDDDEEEEEEEEEFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case38() {
    int length = 38;
    assertEquals("ABBCCCCDDDEFDDDDDEEEEEEEEEEFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case39() {
    int length = 39;
    assertEquals("ABBCCCCDDDEDFDDDDEEEEEEEEEEFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case40() {
    int length = 40;
    assertEquals("ABBCCCCDDDDEFDDDDEEEEEEEEEEEFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case41() {
    int length = 41;
    assertEquals("ABBCCCCDDDDEDFDDDEEEEEEEEEEEFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case42() {
    int length = 42;
    assertEquals("ABBCCCCDDDDDEFDDDEEEEEEEEEEEEFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case43() {
    int length = 43;
    assertEquals("ABBCCCCDDDDDEDFDDEEEEEEEEEEEEFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case44() {
    int length = 44;
    assertEquals("ABBCCCCDDDDDDEFDDEEEEEEEEEEEEEFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case45() {
    int length = 45;
    assertEquals("ABBCCCCDDDDDDEDFDEEEEEEEEEEEEEFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case46() {
    int length = 46;
    assertEquals("ABBCCCCDDDDDDDEFDEEEEEEEEEEEEEEFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case47() {
    int length = 47;
    assertEquals("ABBCCCCDDDDDDDEDFEEEEEEEEEEEEEEFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case48() {
    int length = 48;
    assertEquals("ABBCCCCDDDDDDDDEFEEEEEEEEEEEEEEEFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case49() {
    int length = 49;
    assertEquals("ABBCCCCDDDDDDDDEEFEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case50() {
    int length = 50;
    assertEquals("ABBCCCCDDDDDDDDEEEFEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case51() {
    int length = 51;
    assertEquals("ABBCCCCDDDDDDDDEEEEFEEEEEEEEEEEEFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case52() {
    int length = 52;
    assertEquals("ABBCCCCDDDDDDDDEEEEEFEEEEEEEEEEEFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case53() {
    int length = 53;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEFEEEEEEEEEEFFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case54() {
    int length = 54;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEFEEEEEEEEEFFFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case55() {
    int length = 55;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEFEEEEEEEEFFFFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case56() {
    int length = 56;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEFEEEEEEEFFFFFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case57() {
    int length = 57;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEFEEEEEEFFFFFFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case58() {
    int length = 58;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEFEEEEEFFFFFFFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case59() {
    int length = 59;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEFEEEEFFFFFFFFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case60() {
    int length = 60;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEFEEEFFFFFFFFFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case61() {
    int length = 61;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEFEEFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case62() {
    int length = 62;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case63() {
    int length = 63;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", idealstring.construct(length));
  }

  @Test
  public void case64() {
    int length = 64;
    assertEquals("ABBCCCCDDDDDDDEFDGEEEEEEEEEEEEEEFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case65() {
    int length = 65;
    assertEquals("ABBCCCCDDDDDDDEDFGEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case66() {
    int length = 66;
    assertEquals("ABBCCCCDDDDDDDDEFGEEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case67() {
    int length = 67;
    assertEquals("ABBCCCCDDDDDDDDEFEGEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case68() {
    int length = 68;
    assertEquals("ABBCCCCDDDDDDDDEEFGEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case69() {
    int length = 69;
    assertEquals("ABBCCCCDDDDDDDDEEFEGEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case70() {
    int length = 70;
    assertEquals("ABBCCCCDDDDDDDDEEEFGEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case71() {
    int length = 71;
    assertEquals("ABBCCCCDDDDDDDDEEEFEGEEEEEEEEEEEEFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case72() {
    int length = 72;
    assertEquals("ABBCCCCDDDDDDDDEEEEFGEEEEEEEEEEEEFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case73() {
    int length = 73;
    assertEquals("ABBCCCCDDDDDDDDEEEEFEGEEEEEEEEEEEFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case74() {
    int length = 74;
    assertEquals("ABBCCCCDDDDDDDDEEEEEFGEEEEEEEEEEEFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case75() {
    int length = 75;
    assertEquals("ABBCCCCDDDDDDDDEEEEEFEGEEEEEEEEEEFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case76() {
    int length = 76;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEFGEEEEEEEEEEFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case77() {
    int length = 77;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEFEGEEEEEEEEEFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case78() {
    int length = 78;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEFGEEEEEEEEEFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case79() {
    int length = 79;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEFEGEEEEEEEEFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case80() {
    int length = 80;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEFGEEEEEEEEFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case81() {
    int length = 81;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEFEGEEEEEEEFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case82() {
    int length = 82;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEFGEEEEEEEFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case83() {
    int length = 83;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEFEGEEEEEEFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case84() {
    int length = 84;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEFGEEEEEEFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case85() {
    int length = 85;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEFEGEEEEEFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case86() {
    int length = 86;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEFGEEEEEFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case87() {
    int length = 87;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEFEGEEEEFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case88() {
    int length = 88;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEFGEEEEFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case89() {
    int length = 89;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEFEGEEEFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case90() {
    int length = 90;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEFGEEEFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case91() {
    int length = 91;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEFEGEEFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case92() {
    int length = 92;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEFGEEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case93() {
    int length = 93;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEFEGEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case94() {
    int length = 94;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEFGEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case95() {
    int length = 95;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEFEGFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case96() {
    int length = 96;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFGFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case97() {
    int length = 97;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFFGFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case98() {
    int length = 98;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFFFGFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case99() {
    int length = 99;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFFFFGFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

  @Test
  public void case100() {
    int length = 100;
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFFFFFGFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", idealstring.construct(length));
  }

}
