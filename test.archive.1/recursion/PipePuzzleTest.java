package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class PipePuzzleTest {
  PipePuzzle pipepuzzle = new PipePuzzle();

  @Test
  public void case1() {
    String[] pipes = { "LL-L-", "L+L+L", "--NL-", "L+--L", "LL+L-" };
    assertEquals(19, pipepuzzle.longest(pipes));
  }

  @Test
  public void case2() {
    String[] pipes = { "ELLL", "LLLL", "LLLL", "LLLL" };
    assertEquals(13, pipepuzzle.longest(pipes));
  }

  @Test
  public void case3() {
    String[] pipes = { "ELLLLL+", "++++++L", "L+++++L", "L+++++L", "L+++++L", "L+++++L", "+LLLLLL" };
    assertEquals(71, pipepuzzle.longest(pipes));
  }

  @Test
  public void case4() {
    String[] pipes = { "LLLLL", "LLELL", "LLLLL", "LLLLL" };
    assertEquals(11, pipepuzzle.longest(pipes));
  }

  @Test
  public void case5() {
    String[] pipes = { "-+-+-+-+-+-+-+-+-+-W" };
    assertEquals(19, pipepuzzle.longest(pipes));
  }

  @Test
  public void case6() {
    String[] pipes = { "N" };
    assertEquals(0, pipepuzzle.longest(pipes));
  }

  @Test
  public void case7() {
    String[] pipes = { "S" };
    assertEquals(0, pipepuzzle.longest(pipes));
  }

  @Test
  public void case8() {
    String[] pipes = { "E" };
    assertEquals(0, pipepuzzle.longest(pipes));
  }

  @Test
  public void case9() {
    String[] pipes = { "W" };
    assertEquals(0, pipepuzzle.longest(pipes));
  }

  @Test
  public void case10() {
    String[] pipes = { "LL", "LN" };
    assertEquals(3, pipepuzzle.longest(pipes));
  }

  @Test
  public void case11() {
    String[] pipes = { "L++L++L", "--+N-+L", "+++L+++", "-++++LL", "+L+L-+L", "+++LL+L", "+L+++++", "++L+LL-", "LL--L++" };
    assertEquals(20, pipepuzzle.longest(pipes));
  }

  @Test
  public void case12() {
    String[] pipes = { "++-LL+-", "++L++L+", "+LL++-L", "+-+L++-", "-L+L+++", "--LN+L+", "+LLL+LL", "L+++L++" };
    assertEquals(15, pipepuzzle.longest(pipes));
  }

  @Test
  public void case13() {
    String[] pipes = { "LEL+L+-L-L-+", "-+++--+++--+", "++++L+--+++-", "-L+--+-+-+-L", "-L+L++++-+LL", "+-LL+--LLL-+" };
    assertEquals(24, pipepuzzle.longest(pipes));
  }

  @Test
  public void case14() {
    String[] pipes = { "-++++++++++", "++L-L++-+LL", "+++++++++--", "++-------L+", "LL+++L-++++", "-++L+-+-+++", "++N+L-L-+L+", "+L++++++L-L" };
    assertEquals(20, pipepuzzle.longest(pipes));
  }

  @Test
  public void case15() {
    String[] pipes = { "++LLLL-LL+++-+++", "--+-+L+-++-LL-+-", "--++----++L-++L-", "L++-L++++---+-+L", "L++--+--+++--+++", "+L+L+-+W+L++L-+L" };
    assertEquals(36, pipepuzzle.longest(pipes));
  }

  @Test
  public void case16() {
    String[] pipes = { "++++++", "+L++++", "++-+LL", "L+L+++", "++L+LS", "++++LL", "L+++++" };
    assertEquals(16, pipepuzzle.longest(pipes));
  }

  @Test
  public void case17() {
    String[] pipes = { "+++++-+-++++", "-+-++---+-++", "SLL++-++++-+", "-++-+-L-L-++", "-+L++++L++++", "--++--+++LL+", "++++++--+++-", "LL--L++L++++", "-L++++-+++++", "---+L+L-++++", "-++--+++-+++", "++L+++L+++++", "++++++++++++", "+++++++-++++", "+-++++++L++-", "++-+++++++++" };
    assertEquals(56, pipepuzzle.longest(pipes));
  }

  @Test
  public void case18() {
    String[] pipes = { "+LL", "L+L", "-LL", "LLL", "S++", "L+L", "+++", "+LL", "LL+", "++L", "+LL", "+L+" };
    assertEquals(21, pipepuzzle.longest(pipes));
  }

  @Test
  public void case19() {
    String[] pipes = { "+++++++", "+++L+L+", "-+-+++L", "++++L++", "++++L+S", "++L+L++", "++L++L+", "++L+L++", "+++++++", "+++++LL", "+++++++", "+LL+L++", "+LLL+++" };
    assertEquals(40, pipepuzzle.longest(pipes));
  }

  @Test
  public void case20() {
    String[] pipes = { "++LL", "LL-L", "-L+W", "+-L+", "LLLL", "L-+L", "+-LL", "+LL-" };
    assertEquals(16, pipepuzzle.longest(pipes));
  }

  @Test
  public void case21() {
    String[] pipes = { "LL+L", "LL+L", "LLLL", "SLL+", "L+LL" };
    assertEquals(14, pipepuzzle.longest(pipes));
  }

  @Test
  public void case22() {
    String[] pipes = { "+++++-+-+++--+-+++-L", "+++++--+L+++++++++++", "++++++++++++++++-+++", "+---+-+++++-++++++++", "+++-++++-+++++++++++", "++++-+++++-++++-+-++", "-+++++--+++-L+++++++", "+++++++-+++++++++--+", "--+++-+-+-+++-++++LL", "++++++++++++L++++++-", "+-++++--+++++-+-+-++", "L+++++-+++++++++--++", "++++-++++-++++++++++", "++L+--+-+-+-+-----++", "++++--+-++L+++++++++", "++-+++++L+++++++++++", "+++++++++++-+-++++-+", "+-+++++++++-+-++++-+", "++++L+++-+++++-+-+LN", "++++-++-+++++--+-+++" };
    assertEquals(53, pipepuzzle.longest(pipes));
  }

  @Test
  public void case23() {
    String[] pipes = { "+LL", "LL+", "+++", "L+L", "LLL", "LNL" };
    assertEquals(12, pipepuzzle.longest(pipes));
  }

  @Test
  public void case24() {
    String[] pipes = { "-+-+++L", "LL+LLLL", "-L-+---", "+L+--++", "+LL-+-L", "+--L+NL", "+LL+LL-" };
    assertEquals(18, pipepuzzle.longest(pipes));
  }

  @Test
  public void case25() {
    String[] pipes = { "LL+WLLLL", "LLLL++L+", "LLLLL+-L" };
    assertEquals(22, pipepuzzle.longest(pipes));
  }

  @Test
  public void case26() {
    String[] pipes = { "L++-+-+L+", "LL+LE-+LL", "+++-++-L+", "+++---+++", "+++-++-++", "L------++", "+-+--+-++", "++++L--+-", "-+L-L++++", "--+++++++" };
    assertEquals(21, pipepuzzle.longest(pipes));
  }

  @Test
  public void case27() {
    String[] pipes = { "-+++L+++++L+L++++", "-++++-++++-+++++L", "++++++L++L+++L++L", "+++++L+++++-+--+L", "+--+++--+++++++L+", "+-++++++++++L++++", "-+-E+-++++++L+++-", "L++-++++++++L+-L+" };
    assertEquals(31, pipepuzzle.longest(pipes));
  }

  @Test
  public void case28() {
    String[] pipes = { "L++LL+", "++L+++", "+++LL-", "L++++L", "++++++", "++++++", "-++L+L", "L-++L+", "+--+++", "LL+--+", "-+L+++", "L+S--+", "++++++", "+LL+++" };
    assertEquals(45, pipepuzzle.longest(pipes));
  }

  @Test
  public void case29() {
    String[] pipes = { "--+L+L+++++", "-+S++-++--+", "-+-L-+---+-", "+-++-+-L---", "-+L+++++-+L", "+---L+--+L+", "+++L-+-+++-", "--+++++-+++", "++-+-----L+", "-L+---+++LL", "---+-+++-+-", "--++--+-L++", "++---+++++L", "-+++-++++L-" };
    assertEquals(30, pipepuzzle.longest(pipes));
  }

  @Test
  public void case30() {
    String[] pipes = { "+L++LL+L++LL", "+L+L-+++-++L", "+LLL++--L+LN", "L+-+L-+-+L+L" };
    assertEquals(16, pipepuzzle.longest(pipes));
  }

  @Test
  public void case31() {
    String[] pipes = { "+-+L+L", "--L-++", "++LLL+", "L++++-", "L+L+W+", "++L--L", "--++++", "+-+-LL", "+++L+-" };
    assertEquals(20, pipepuzzle.longest(pipes));
  }

  @Test
  public void case32() {
    String[] pipes = { "+++++L++++++++L+", "++++++++++++++++", "+LL++L+W++++++++", "++L++L++++++++++", "++++++++++++++++", "++-+++++++L-++++", "+++++++-++L+++++", "++++++++++++L+L+", "+++++++LL+++++++", "L+L-++++++++++++", "L+++-++L++++++++", "++++--++++-+++++", "++++-+++++++++++", "++++++++++++++++", "++++++++++++++++", "++++++++++++++++", "-+++++++++++++++", "+++++L++++++++++", "+++++++L+++++-++" };
    assertEquals(38, pipepuzzle.longest(pipes));
  }

  @Test
  public void case33() {
    String[] pipes = { "L++L", "LL-L", "+-+L", "-LL+", "LLN+", "LL--", "L++L", "L+-L", "L-+-" };
    assertEquals(23, pipepuzzle.longest(pipes));
  }

  @Test
  public void case34() {
    String[] pipes = { "++LL++L++", "+++LLL+++", "-+L++++++", "+++-++L++", "L+L+-+WL+", "-+++++L++", "L+L+++L++", "++L++++L+" };
    assertEquals(17, pipepuzzle.longest(pipes));
  }

  @Test
  public void case35() {
    String[] pipes = { "--L-+L+---L", "L+++-LLL--+", "+++L-L+++LL", "+-+LLL++LL+", "L+++-WL+++-" };
    assertEquals(26, pipepuzzle.longest(pipes));
  }

  @Test
  public void case36() {
    String[] pipes = { "+L++", "LL+L", "LE+L", "LLLL" };
    assertEquals(8, pipepuzzle.longest(pipes));
  }

  @Test
  public void case37() {
    String[] pipes = { "L+L+++", "++L+LL", "LLLL-L", "L++L-+", "+L-LL+", "LLNLL+" };
    assertEquals(13, pipepuzzle.longest(pipes));
  }

  @Test
  public void case38() {
    String[] pipes = { "L-+L+L-+--++", "L-++L--+++-+", "+++++--++L++", "+-+++++++--+", "--++LL-+-+-+", "+E-L++-+++-+", "+++++---++++", "++-+--++-+++", "+++-L-++L+++", "++++--+LL+L+", "-+---++L+L-+" };
    assertEquals(38, pipepuzzle.longest(pipes));
  }

  @Test
  public void case39() {
    String[] pipes = { "+LWL", "++L+", "LL++", "+-+-", "+L++", "+LL+", "+L+L", "L++L", "+L+L", "+LL+" };
    assertEquals(31, pipepuzzle.longest(pipes));
  }

  @Test
  public void case40() {
    String[] pipes = { "+--+L++-L--++-+-+LL", "+-++-+-++-LL+E+L+-+", "--+L+-LL+++-++L+++L", "--++L+++++++---L++-", "-++---+-+-++L--L---" };
    assertEquals(26, pipepuzzle.longest(pipes));
  }

  @Test
  public void case41() {
    String[] pipes = { "-++++++", "L+-+--+", "++++++-", "-++-+++", "-+++-++", "-+-+++S", "+++L+++", "+++LLLL", "++-++-L", "++-+++L", "+++-+++", "++L+L+-", "+L-+-L+", "++L++++" };
    assertEquals(24, pipepuzzle.longest(pipes));
  }

  @Test
  public void case42() {
    String[] pipes = { "+++++L+", "++L++L+", "+++++++", "++NL+++", "L++++-L", "++++-++", "+-+++++", "+--+++L", "++++++L", "+++L+++", "++-+++L", "++L+++L", "+++L++-", "++-++++", "+++++L-" };
    assertEquals(23, pipepuzzle.longest(pipes));
  }

  @Test
  public void case43() {
    String[] pipes = { "+LL++L-++-+++L+", "+++++++-++-++++", "+L++-+-+++L++++", "++++++-+++-L++-", "+-+++-++++-++++", "++++++++++++++-", "++++++++++++--+", "+-+++++++++++++", "+LL+++++++++-++", "++++++-+++L-++L", "++++++L+L-E+++L", "+-+++++++++L+LL", "-++++L++++++++-", "+-++++-+-+++++L" };
    assertEquals(64, pipepuzzle.longest(pipes));
  }

  @Test
  public void case44() {
    String[] pipes = { "L+LL+", "L+++L", "L++L+", "LLN+L", "LL++L" };
    assertEquals(17, pipepuzzle.longest(pipes));
  }

  @Test
  public void case45() {
    String[] pipes = { "++-+L+++++-+LL--++", "-++++---++-+-++-++", "+++S++--+++--+-++-", "-+L++-+-++--L---L-", "L+LL-++-+-+L+++L++", "-++++-++++++-+-+--", "+-+--+-++++-+++-++", "+++++++--+++++-+++", "+-+-++--++L++-L-++", "++L++L+L-+++---+++", "+-+--+--+---+-+-+-" };
    assertEquals(35, pipepuzzle.longest(pipes));
  }

  @Test
  public void case46() {
    String[] pipes = { "-L-L+", "+L+LW", "+-++L", "-+LL+", "L-LL-", "L+-LL" };
    assertEquals(15, pipepuzzle.longest(pipes));
  }

  @Test
  public void case47() {
    String[] pipes = { "+++++++++++++++++", "++L++++++++++++++", "+++++++++++++++S+", "++++++++++++++-++", "+++++++++++++++++", "++++++++++++++++L", "+++++-L++++++++++", "+-++L+L++++++++++", "L++++++++++++L+++", "+L+++++-++++++-++", "+++++++++++++++++", "+++++L++++L++++++", "++++++++++++L++++", "+++++++++-+++++LL", "++LL+++++L++++++L" };
    assertEquals(36, pipepuzzle.longest(pipes));
  }

  @Test
  public void case48() {
    String[] pipes = { "+++++++LL+-", "+++-+L+LL-L", "LL--++++L++", "+L-L++L+++-", "LL+++-+--++", "+++++++E++L", "+-+L+L+++L+" };
    assertEquals(40, pipepuzzle.longest(pipes));
  }

  @Test
  public void case49() {
    String[] pipes = { "+++++++++L+++++", "+++++L++L+L++L+", "+++L+++L-++++L+", "+++LL+L++++++++", "+++L+++++LL+++L", "+-+++LL+++E+++L" };
    assertEquals(25, pipepuzzle.longest(pipes));
  }

  @Test
  public void case50() {
    String[] pipes = { "LLL+EL", "LL+LLL", "L+LLLL", "LLLLL+" };
    assertEquals(17, pipepuzzle.longest(pipes));
  }

  @Test
  public void case51() {
    String[] pipes = { "EL", "LL" };
    assertEquals(3, pipepuzzle.longest(pipes));
  }

  @Test
  public void case52() {
    String[] pipes = { "L------------L------", "N++++++++++++L++++++" };
    assertEquals(27, pipepuzzle.longest(pipes));
  }

  @Test
  public void case53() {
    String[] pipes = { "L------------L------", "E++++++++++++L++++++" };
    assertEquals(27, pipepuzzle.longest(pipes));
  }

  @Test
  public void case54() {
    String[] pipes = { "L------------L------", "N++++++++L+++L++++++" };
    assertEquals(21, pipepuzzle.longest(pipes));
  }

  @Test
  public void case55() {
    String[] pipes = { "L------------L------", "E++++++++L+++L++++++" };
    assertEquals(10, pipepuzzle.longest(pipes));
  }

  @Test
  public void case56() {
    String[] pipes = { "+--+-+-+-++-++-+-+-+", "+--+-+-+-++-++-+-+-+", "+--+N+-+-++-++-+-+-+", "-------+-+++++++++++", "++++++-+-++-++------", "+-+-++-++-+-+-++--+-" };
    assertEquals(2, pipepuzzle.longest(pipes));
  }

  @Test
  public void case57() {
    String[] pipes = { "+--+-+-+-+++-+-+-+-+", "+--+-+-+-+++-+-+-+-+", "+--+-+-+-+++-+-+-+-+", "-E-----+++++++++++++", "++++++-+-+++-+------", "+-+-++-++-+-+-++--+-" };
    assertEquals(18, pipepuzzle.longest(pipes));
  }

  @Test
  public void case58() {
    String[] pipes = { "+--+-+-++-++-+-+-+-+", "+--+-+-++-++-+-+-+-+", "+--+++-++-++-+-+-+-+", "-------+++++++++++++", "+++W++-++-++-++-----", "+-+-++--+-+-+-++--+-" };
    assertEquals(3, pipepuzzle.longest(pipes));
  }

  @Test
  public void case59() {
    String[] pipes = { "+--+-+-++-++-S-+-+-+", "+--+-+-++-++-+-+-+-+", "+--+++-++-++-+-+-+-+", "-------+++++++++++++", "++++++-++-++-+------", "+-+-++--+-+-+-++--+-" };
    assertEquals(5, pipepuzzle.longest(pipes));
  }

  @Test
  public void case60() {
    String[] pipes = { "ELLLLL+", "++++++L", "L+++++L", "L+++++L", "L+++++L", "L+++++L", "+LLLLLL" };
    assertEquals(71, pipepuzzle.longest(pipes));
  }

}
