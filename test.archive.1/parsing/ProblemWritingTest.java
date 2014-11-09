package topc.test.parsing;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.parsing.*;

public class ProblemWritingTest {
  ProblemWriting problemwriting = new ProblemWriting();

  @Test
  public void case1() {
    String dotForm = "3+5";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case2() {
    String dotForm = "9..+.5...*....3";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case3() {
    String dotForm = "5.3+4";
    assertEquals("dotForm is not in dot notation, check character 2.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case4() {
    String dotForm = "9*9*9*9*9*9*9*9*9*9*9*9*9*9";
    assertEquals("dotForm must contain between 1 and 25 characters, inclusive.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case5() {
    String dotForm = "3.........../...........4";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case6() {
    String dotForm = "1+2*5../3";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case7() {
    String dotForm = "9.....*8..+.3./.";
    assertEquals("dotForm is not in dot notation, check character 16.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case8() {
    String dotForm = "12";
    assertEquals("dotForm is not in dot notation, check character 1.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case9() {
    String dotForm = "1-.0-.1-.2-.3-.4";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case10() {
    String dotForm = ".3+4";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case11() {
    String dotForm = "1.+..................";
    assertEquals("dotForm is not in dot notation, check character 21.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case12() {
    String dotForm = "1+.2*3-.5";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case13() {
    String dotForm = "1*2*2*2+.3.-..4";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case14() {
    String dotForm = "2589860";
    assertEquals("dotForm is not in dot notation, check character 1.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case15() {
    String dotForm = "2+..20";
    assertEquals("dotForm is not in dot notation, check character 5.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case16() {
    String dotForm = "20+..2";
    assertEquals("dotForm is not in dot notation, check character 1.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case17() {
    String dotForm = "9.20+2";
    assertEquals("dotForm is not in dot notation, check character 2.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case18() {
    String dotForm = "1+..4...3*.....9+.............";
    assertEquals("dotForm must contain between 1 and 25 characters, inclusive.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case19() {
    String dotForm = "3+5%8";
    assertEquals("dotForm is not in dot notation, check character 3.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case20() {
    String dotForm = "(9*9).+..5*9";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case21() {
    String dotForm = "1+1+.....11";
    assertEquals("dotForm is not in dot notation, check character 10.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case22() {
    String dotForm = "*9";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case23() {
    String dotForm = "3*4*9...W.8";
    assertEquals("dotForm is not in dot notation, check character 8.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case24() {
    String dotForm = "7*6*5*4+3-9/....5";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case25() {
    String dotForm = "4+4=8";
    assertEquals("dotForm is not in dot notation, check character 3.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case26() {
    String dotForm = "3.../...2..*..4-4.+3";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case27() {
    String dotForm = "slkdfsla";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case28() {
    String dotForm = "55";
    assertEquals("dotForm is not in dot notation, check character 1.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case29() {
    String dotForm = "5+.++";
    assertEquals("dotForm is not in dot notation, check character 3.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case30() {
    String dotForm = "5..*..45..*..4";
    assertEquals("dotForm is not in dot notation, check character 7.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case31() {
    String dotForm = "5.3+4";
    assertEquals("dotForm is not in dot notation, check character 2.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case32() {
    String dotForm = "1.+...";
    assertEquals("dotForm is not in dot notation, check character 6.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case33() {
    String dotForm = "";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case34() {
    String dotForm = "1...";
    assertEquals("dotForm is not in dot notation, check character 4.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case35() {
    String dotForm = "5+";
    assertEquals("dotForm is not in dot notation, check character 2.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case36() {
    String dotForm = "5.++.++";
    assertEquals("dotForm is not in dot notation, check character 3.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case37() {
    String dotForm = "3..*..6../..";
    assertEquals("dotForm is not in dot notation, check character 12.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case38() {
    String dotForm = "1.-.";
    assertEquals("dotForm is not in dot notation, check character 4.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case39() {
    String dotForm = ".5+3";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case40() {
    String dotForm = "9+6.";
    assertEquals("dotForm is not in dot notation, check character 4.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case41() {
    String dotForm = "...+...3";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case42() {
    String dotForm = ".1";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case43() {
    String dotForm = "22";
    assertEquals("dotForm is not in dot notation, check character 1.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case44() {
    String dotForm = "+";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case45() {
    String dotForm = "3+";
    assertEquals("dotForm is not in dot notation, check character 2.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case46() {
    String dotForm = ".";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case47() {
    String dotForm = "5+3.";
    assertEquals("dotForm is not in dot notation, check character 4.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case48() {
    String dotForm = "5......";
    assertEquals("dotForm is not in dot notation, check character 7.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case49() {
    String dotForm = "9+";
    assertEquals("dotForm is not in dot notation, check character 2.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case50() {
    String dotForm = "5...+...";
    assertEquals("dotForm is not in dot notation, check character 8.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case51() {
    String dotForm = "33...";
    assertEquals("dotForm is not in dot notation, check character 1.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case52() {
    String dotForm = ".5";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case53() {
    String dotForm = "5+3..";
    assertEquals("dotForm is not in dot notation, check character 5.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case54() {
    String dotForm = "3/5";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case55() {
    String dotForm = "3..*..8..UH/9";
    assertEquals("dotForm is not in dot notation, check character 9.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case56() {
    String dotForm = "1_";
    assertEquals("dotForm is not in dot notation, check character 1.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case57() {
    String dotForm = "5.";
    assertEquals("dotForm is not in dot notation, check character 2.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case58() {
    String dotForm = "1+";
    assertEquals("dotForm is not in dot notation, check character 2.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case59() {
    String dotForm = "..+5";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case60() {
    String dotForm = "5..........+..5++";
    assertEquals("dotForm is not in dot notation, check character 16.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case61() {
    String dotForm = "1.";
    assertEquals("dotForm is not in dot notation, check character 2.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case62() {
    String dotForm = "99";
    assertEquals("dotForm is not in dot notation, check character 1.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case63() {
    String dotForm = "+6";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case64() {
    String dotForm = "11";
    assertEquals("dotForm is not in dot notation, check character 1.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case65() {
    String dotForm = "5....";
    assertEquals("dotForm is not in dot notation, check character 5.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case66() {
    String dotForm = "..+..3";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case67() {
    String dotForm = "1.+2";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case68() {
    String dotForm = "43543";
    assertEquals("dotForm is not in dot notation, check character 1.", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case69() {
    String dotForm = "9..+..0";
    assertEquals("", problemwriting.myCheckData(dotForm));
  }

  @Test
  public void case70() {
    String dotForm = "FOO";
    assertEquals("dotForm is not in dot notation, check character 0.", problemwriting.myCheckData(dotForm));
  }

}
