package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LittleElephantAndBallsAgainTest {
  LittleElephantAndBallsAgain littleelephantandballsagain = new LittleElephantAndBallsAgain();

  @Test
  public void case1() {
    String S = "RRGGBB";
    assertEquals(4, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case2() {
    String S = "R";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case3() {
    String S = "RGBRGB";
    assertEquals(5, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case4() {
    String S = "RGGGBB";
    assertEquals(3, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case5() {
    String S = "RGBRBRGRGRBBBGRBRBRGBGBBBGRGBBBBRGBGRRGGRRRGRBBBBR";
    assertEquals(46, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case6() {
    String S = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case7() {
    String S = "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case8() {
    String S = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case9() {
    String S = "BGGBGRRGBBBGRGBGBRRRRBRGGRBBBBRBRRGBGGRBRB";
    assertEquals(38, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case10() {
    String S = "RBRGBGBBGRRGBRGGGBBRRGGBGGBRBRGBRR";
    assertEquals(31, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case11() {
    String S = "BRBRGRBGBBGRRBGBGBRRBRBGRRRRBBRBBBGRRBRRRGRB";
    assertEquals(40, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case12() {
    String S = "BBRGBGBGRGGGRBGRGBRRBBGBBRBGBGRBRBRBG";
    assertEquals(34, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case13() {
    String S = "RBBRGRBBGB";
    assertEquals(8, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case14() {
    String S = "GRRRRRGGRBGRBRBGBBGRGBRRB";
    assertEquals(20, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case15() {
    String S = "GBBBRBBGBGRBGR";
    assertEquals(11, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case16() {
    String S = "GBRGRRGRGBBRRRRBBBBBGGRRGGBBGBBBRGGRBRBRRBGBBBGRRR";
    assertEquals(45, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case17() {
    String S = "RBRGBBRGBBBBBRGBRRRRGGGBGGGRRGBBRBBBRGRBGBGGBGRGRB";
    assertEquals(45, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case18() {
    String S = "GGGGGGRGGBRGBGBGBRRGBGBBBGRGRBBBBRGGRGGGRBGGRBGBBB";
    assertEquals(44, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case19() {
    String S = "RRBRBBRGRGBBBGBRBBGBGBRRBRBGBBGRBGBBGBBRBBGBGBRGGG";
    assertEquals(47, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case20() {
    String S = "BRGRRBRBBGBBBGBBRBBGGBGBBBGGBBGRBGBGBGGBGRGBGRBGGR";
    assertEquals(47, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case21() {
    String S = "RGBGBRBGRRRGGRGRBRGGBGBBGRBBGGBGGGGBGGRRBRGRBBGBGB";
    assertEquals(46, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case22() {
    String S = "RGGGGBBRRGBGGBRBBGGBRRRRGRGRGGRGGGRBRRRGRRGRBBGBRR";
    assertEquals(46, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case23() {
    String S = "BRRGBGGRBBRBGRGGBBBRBBGBRGBRBRGGRRBBBRBGGRGGRGBBBR";
    assertEquals(47, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case24() {
    String S = "RGBRGGRBBRG";
    assertEquals(9, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case25() {
    String S = "GRGRGRRBRGGBRBGRBRBGGBGRRGRRGGGGRRGBRRBBGRBGGRRBRB";
    assertEquals(46, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case26() {
    String S = "GRRRRGGGGRRGRRGRGGGRRRGRGGGRGRGRRRGGRRRGRGGGGGRGGG";
    assertEquals(45, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case27() {
    String S = "GGRGGGGGGRRRRGRRRRRGGRRRGRGGRGRGGRRGGGRRGRRGGGGGRR";
    assertEquals(44, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case28() {
    String S = "RRGGRRRRRRGGRGRRGGGRRGRRRRRRRGGGRGGGGRRRRRGGRRRRGR";
    assertEquals(43, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case29() {
    String S = "RGRRRGGGRRRRRRGGRGRGGRGGRRGRRRGGGRGRGGGGGRRGGRGRRG";
    assertEquals(44, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case30() {
    String S = "GRRGGGGGGGRRGRGGGGRGRRRRGRRRRGGGGGRRGRGRRGGRGRGGRR";
    assertEquals(43, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case31() {
    String S = "RBBRBBBBBRBRBRRBBRRRBBRBRBBRRRRRBBRRRBRBRBBRBRBBRB";
    assertEquals(45, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case32() {
    String S = "RRRRBBBRRRRBRRRBRRRBRRBRBRBRRRBRBBRBRRBRRRRBRRRRBB";
    assertEquals(46, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case33() {
    String S = "RRBRRRRRBRRRRBBRBRBRBRBRRBBRBRRRBRBBRBRRRRRRBRBBBB";
    assertEquals(44, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case34() {
    String S = "BRRRBRBRBRBBRBRBBRBRBRBRRRBBBBBRBBRRRRBBRBRRRRRRBR";
    assertEquals(44, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case35() {
    String S = "BBBBBBBBBRRBBRRBRBRBBBBRRRBRRRRRBRRRBBRRRRBRRRBRBB";
    assertEquals(41, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case36() {
    String S = "BBGGBGBGGBGGGBGBGBBGGGBGBGGGBGBGGGBBBGBGBGBGGGGBGG";
    assertEquals(46, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case37() {
    String S = "BGGBBBGBGGBGBGBGBBGBBGBGBGBBBBGGBGBGGBBBBBBGGGGBGB";
    assertEquals(44, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case38() {
    String S = "GGGBGBBBBBBBGGGGGBGGBGBGBGGGGGGBGBBBGBBGGGGBBGBGBB";
    assertEquals(43, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case39() {
    String S = "BGGBGGGGGBGGBGBBGGGGBGGGGBGBGGBBBBBBGGGBBGBBGGGBBG";
    assertEquals(44, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case40() {
    String S = "BGGBBBBGGBGBGGGBBBGBBGGBGBBBBBGBGGGGGBGBBBGGGGBGBB";
    assertEquals(45, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case41() {
    String S = "GGGGGGGBGGGBGGGGGGGGGGGGBGGGGGGGBBGGGGGGRGGGGGGGGG";
    assertEquals(38, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case42() {
    String S = "GGGGRGGGGGRGBGGGGGGGGGGGGGGGGGGGGGGGBBGGRGGGGGGGBG";
    assertEquals(27, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case43() {
    String S = "RGGGGRGGRGGGGGGGBGGGRGGBGGRGRRGGRGGGGGGGGGGGGBGGGB";
    assertEquals(38, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case44() {
    String S = "RBRRRRRRRRRRRRRRRRBBRRBRBRRBRBRRRRRRRRRRRBRBBRRRRR";
    assertEquals(34, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case45() {
    String S = "RBBRRBRBRRRBRRRBRRRRRRRRRRBRBRRRRRRRRRRRBRRBBRRBRR";
    assertEquals(39, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case46() {
    String S = "BBRRRBRBBRBRRRBRRRRRRBBRRBRRRRRBRBRRRRRRRRRRRBBRRR";
    assertEquals(39, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case47() {
    String S = "RGGBBB";
    assertEquals(3, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case48() {
    String S = "GGGBRR";
    assertEquals(3, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case49() {
    String S = "RRRRRRRRRRBBBBBBBBBBGGGGGGGGGGG";
    assertEquals(20, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case50() {
    String S = "RGRRR";
    assertEquals(2, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case51() {
    String S = "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRG";
    assertEquals(49, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case52() {
    String S = "RRGGG";
    assertEquals(2, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case53() {
    String S = "GBB";
    assertEquals(1, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case54() {
    String S = "RGBBB";
    assertEquals(2, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case55() {
    String S = "RRRRRRRRR";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case56() {
    String S = "RRRR";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case57() {
    String S = "RR";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case58() {
    String S = "RGGG";
    assertEquals(1, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case59() {
    String S = "RRGGGBB";
    assertEquals(4, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case60() {
    String S = "RRRRRRR";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case61() {
    String S = "BBBBBBBBBBB";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case62() {
    String S = "GGBBBB";
    assertEquals(2, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case63() {
    String S = "RRRRRRRRRR";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case64() {
    String S = "RRRRRR";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case65() {
    String S = "RRR";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case66() {
    String S = "GGGR";
    assertEquals(1, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case67() {
    String S = "GGGGGGG";
    assertEquals(0, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case68() {
    String S = "BRGBBBBBB";
    assertEquals(3, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case69() {
    String S = "RRRGGR";
    assertEquals(3, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case70() {
    String S = "BBRRRRRRRRRRRR";
    assertEquals(2, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case71() {
    String S = "GRRGGG";
    assertEquals(3, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case72() {
    String S = "GGGBBBBBGGGG";
    assertEquals(7, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case73() {
    String S = "RGBBBBBBBBBBB";
    assertEquals(2, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case74() {
    String S = "RGG";
    assertEquals(1, littleelephantandballsagain.getNumber(S));
  }

  @Test
  public void case75() {
    String S = "RRGGBBRGB";
    assertEquals(7, littleelephantandballsagain.getNumber(S));
  }

}
