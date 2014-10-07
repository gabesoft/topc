package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class PenguinPalsTest {
  PenguinPals penguinpals = new PenguinPals();

  @Test
  public void case1() {
    String colors = "RRRR";
    assertEquals(2, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case2() {
    String colors = "RRBRBRBB";
    assertEquals(3, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case3() {
    String colors = "BBBBB";
    assertEquals(2, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case4() {
    String colors = "RBRBRBRBR";
    assertEquals(4, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case5() {
    String colors = "RRRBRBRBRBRB";
    assertEquals(5, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case6() {
    String colors = "R";
    assertEquals(0, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case7() {
    String colors = "RBRRBBRB";
    assertEquals(3, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case8() {
    String colors = "RBRBBRBRB";
    assertEquals(4, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case9() {
    String colors = "B";
    assertEquals(0, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case10() {
    String colors = "BRBRBRBRBRB";
    assertEquals(5, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case11() {
    String colors = "RBRBRBRBRBR";
    assertEquals(5, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case12() {
    String colors = "RRRBBBRRRBBBRBRBRBRB";
    assertEquals(9, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case13() {
    String colors = "RR";
    assertEquals(1, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case14() {
    String colors = "BB";
    assertEquals(1, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case15() {
    String colors = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
    assertEquals(25, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case16() {
    String colors = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(25, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case17() {
    String colors = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case18() {
    String colors = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case19() {
    String colors = "RBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case20() {
    String colors = "BRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case21() {
    String colors = "RBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case22() {
    String colors = "BRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case23() {
    String colors = "RRRRRBBBBBRRRRRBBBBBRRRRRBBBBBRRRRRBBBBBRRRRRBBBBB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case24() {
    String colors = "RBRBRBRBRBRBRBRBRBRBRBRRBRBRBRBRBRBRBRB";
    assertEquals(19, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case25() {
    String colors = "RB";
    assertEquals(0, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case26() {
    String colors = "BR";
    assertEquals(0, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case27() {
    String colors = "RBR";
    assertEquals(1, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case28() {
    String colors = "BRB";
    assertEquals(1, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case29() {
    String colors = "BRRB";
    assertEquals(2, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case30() {
    String colors = "RBRRRRRRBRRBRRBRBBRRRR";
    assertEquals(11, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case31() {
    String colors = "BBBBBBBBBBBBBB";
    assertEquals(7, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case32() {
    String colors = "RBRBBRBRBBRBRBRBBRBRBRBBRBRBRBRBR";
    assertEquals(16, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case33() {
    String colors = "BBRBBRRBBBRR";
    assertEquals(5, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case34() {
    String colors = "BBRRBBBRBRBBRBBBRBBBBBRRBBBB";
    assertEquals(14, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case35() {
    String colors = "RRRRRRRRRRRRRRRRRRRRRRBB";
    assertEquals(12, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case36() {
    String colors = "RBBRBBRBBBBBBBBB";
    assertEquals(7, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case37() {
    String colors = "RBBBBBBBBBBBBBBBBBBBBBBBBBBRBR";
    assertEquals(14, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case38() {
    String colors = "BBBRBBBBRRBBBRRB";
    assertEquals(7, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case39() {
    String colors = "RRRRRRRRRRRRRRRRRRRRRRRRBRRRRRRRRRRRRRRRRRRRRRRRRR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case40() {
    String colors = "RRRRRRRBRRRRBRBRRRRRBRRRRRRRRBRBRRBRBRRRRBBRBRRB";
    assertEquals(23, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case41() {
    String colors = "BRBBBBBBBBRRRRBRBRRRRRB";
    assertEquals(11, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case42() {
    String colors = "BRRRBRBRBRRRRRRRBBRRRBRRRRBRRR";
    assertEquals(14, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case43() {
    String colors = "BBBBBBBBRBBBBBRRBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(19, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case44() {
    String colors = "BRRBRRRRRRBRRRRRRBRRBRBRRRBRRRBRRRRBRRBR";
    assertEquals(19, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case45() {
    String colors = "RRRRRRRRRRRRRRBRRRRRRRRRRRRRRRRRRBRRBRRRRRR";
    assertEquals(21, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case46() {
    String colors = "RRRRRRBRBRRRBRBRRRRBRB";
    assertEquals(10, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case47() {
    String colors = "BRBBBBBRBBBBBBBB";
    assertEquals(7, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case48() {
    String colors = "RBBBBBRRRBBRBRBRBRBBBRRRB";
    assertEquals(12, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case49() {
    String colors = "RRRBBRR";
    assertEquals(3, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case50() {
    String colors = "RRRBBBRRRBBBRRRBBBRRRBBBRRRBBBRRRBBBRRRBBBRBRBBBBB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case51() {
    String colors = "BRBBBBRRBBRBRBBRRRRRBRBBRRRBBBBRRRBBBRBRBBBBRBRRBR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case52() {
    String colors = "RRBRBRBBRRBRBRBBRRBRBRBBRRBRBRBBRRBRBRBBRRBRBRBB";
    assertEquals(23, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case53() {
    String colors = "RRRRBBRBBRBRBRR";
    assertEquals(7, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case54() {
    String colors = "RRBBRRBBBRBRRBRBRBRBRBRBRBRBBRRBRBRBRBBBBBBBBRRRRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case55() {
    String colors = "BRBRRBBRRRRBRBRBBBBRRBRRRBBRBRBBRRBBRBBRRBB";
    assertEquals(21, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case56() {
    String colors = "RRRRRRRRRRBBBBBBBBBBRRRRRRRRRRBBBBBBBBBBRRRRRRRRRR";
    assertEquals(25, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case57() {
    String colors = "RRRRBBBBBRRBRBRBRRRRBBR";
    assertEquals(11, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case58() {
    String colors = "RBRBRBRBRBBBBBRRRRRRBRBRBRBRBRBRBRBRBRBRBRBRBRBRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case59() {
    String colors = "RRRBBBRBRBBRBBRRRRRRRRBBBRRBRBRBRRRRBRBBBRRRBBRRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case60() {
    String colors = "RRRBRBRBRBRBBBBBRR";
    assertEquals(8, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case61() {
    String colors = "RBBRRBBRRRRBBRBRBRBRBRRBBRBBRRBRBBRBRBRBRBRBRRRRR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case62() {
    String colors = "RRBBRRBB";
    assertEquals(4, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case63() {
    String colors = "RBRRBRRRBRRRRBBRBRBRBRBRBRBRBRBRBRBRBBBBBRRRRRRRRR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case64() {
    String colors = "RRBB";
    assertEquals(2, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case65() {
    String colors = "RBRBBRRRRRRBBBB";
    assertEquals(7, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case66() {
    String colors = "RRRBBR";
    assertEquals(3, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case67() {
    String colors = "RBRBRBRBRBBRBRBRBBRBRBBBRBRBBRBRBRBBRBBBRBBBRBB";
    assertEquals(23, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case68() {
    String colors = "RRRRRRRBBRBRRBRRRRR";
    assertEquals(9, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case69() {
    String colors = "RRRRRRB";
    assertEquals(3, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case70() {
    String colors = "RBBR";
    assertEquals(2, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case71() {
    String colors = "BRRBBRBRBRRBBRBRBRRBBRBRBRBBRRBRBRBRBRBRRBRBRBRBRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case72() {
    String colors = "RBRBBBRBRBR";
    assertEquals(5, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case73() {
    String colors = "RBRBBRBRRRBRRRBRRBRBRRRBRRBBBR";
    assertEquals(15, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case74() {
    String colors = "RRRRRRRRRRRRRRBBBBBBBBRRRRRRRRBBBBBBBBBBBBBBBBBB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case75() {
    String colors = "RBBRRBRBBRRRBBBRRRRRBRBBRRBRRRBBBRBBBBBBRBBRRBRBRB";
    assertEquals(25, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case76() {
    String colors = "RBRRBBBRBRBRRBBBRRBRBBBRRRBBBRRBRBRBRRBBBBRRBRBBRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case77() {
    String colors = "BRRBRRB";
    assertEquals(3, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case78() {
    String colors = "RBBRBBRRRB";
    assertEquals(4, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case79() {
    String colors = "RBRBBBRBRB";
    assertEquals(4, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case80() {
    String colors = "RBRBRBRBRRBRRRBBBBBRRBRBBRBRBRBBBRRBBBRRRRBBRBBRRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case81() {
    String colors = "RBBRRRRRBB";
    assertEquals(5, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case82() {
    String colors = "RBBRRRRBRBBRBRRBBRBRBRRRBRBBBRBRBBRBRBRBRBRBBRBRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case83() {
    String colors = "RBRB";
    assertEquals(1, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case84() {
    String colors = "RBRRRRBBBBRRBRBRBBBBBRBRRRRRRBBBRRBBRRRRBBBRRRRRRR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case85() {
    String colors = "RBRRRBRRBRBRBRBRBRRRRBRBRBRBRBRBRBRBRBBRRBBRBBRRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case86() {
    String colors = "RRBRBRRRBRRBRRBBRRRBBBRRRRBBBBRRBRBRBRBRBBRBRBRRBB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case87() {
    String colors = "BRRBRBBR";
    assertEquals(4, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case88() {
    String colors = "RBB";
    assertEquals(1, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case89() {
    String colors = "RBRBRBRBBBBRRRRRBBBBBRRRRBBBRRRBBRBRBRBRRRBBBRBRRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case90() {
    String colors = "RRR";
    assertEquals(1, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case91() {
    String colors = "RRBRBRRRRBRRBRBR";
    assertEquals(7, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case92() {
    String colors = "RBBRRBBRRRRBBRBRBRBRBRRBBRBBRRBRBBRBRBRBRBRBRRRRRR";
    assertEquals(25, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case93() {
    String colors = "RRRBBBRRRBBB";
    assertEquals(5, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case94() {
    String colors = "RBRBRBBBBBBBBRRBBRBBBBRBRBBBRRBBBRRRRBRRBRRBBRRRRR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case95() {
    String colors = "RBRBBRRBRBRBRBBBBBBBRRRBRBRRRBBRBRBRBRBRBRBRBRBRBR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case96() {
    String colors = "RRRRBB";
    assertEquals(3, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case97() {
    String colors = "RBRRBR";
    assertEquals(3, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case98() {
    String colors = "RRRRRRRRBBBRRRBBBRRR";
    assertEquals(9, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case99() {
    String colors = "RRRBBRBB";
    assertEquals(4, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case100() {
    String colors = "RBRBBBRBBBBBRRRRRBRBRBBRBRBRRBRBRRRRRRBBBBBBBBRBR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case101() {
    String colors = "BRBRBBRBRB";
    assertEquals(5, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case102() {
    String colors = "RRBBBB";
    assertEquals(3, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case103() {
    String colors = "BRRRBBBRRRRBBBRRRBBRBRBRBRBBBBBRRRRBRBBRBRBRBRBRBR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case104() {
    String colors = "RBBBBRBBBRRBRRBRRRBBBBBBBBBBBBRRRRRRRBRBRBRRRBRBRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case105() {
    String colors = "RBBBRRRBRBRBBRRRRBBBBRRRBBBRRRRRRBBBRRBBBBBRRR";
    assertEquals(22, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case106() {
    String colors = "RRBRBRBRB";
    assertEquals(4, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case107() {
    String colors = "RBRBRB";
    assertEquals(2, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case108() {
    String colors = "BRRRBB";
    assertEquals(2, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case109() {
    String colors = "RRBRBRRRRBRRBRBRBBBBBBBBBBBBBBBBRRRBRRR";
    assertEquals(19, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case110() {
    String colors = "RBBRBRBBRRBBR";
    assertEquals(6, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case111() {
    String colors = "RBRBRBBRBRBRBRBBRBRBRBRBBRBRBRBRRBRBBRRBRBRRBRBRBB";
    assertEquals(25, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case112() {
    String colors = "BRBRBRBRBRBBRBRBRBRBBRBBBBBBBBRRRBRBRRBRBRRBBRBRBR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case113() {
    String colors = "RBRBBRBRBRRBRBBR";
    assertEquals(8, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case114() {
    String colors = "BRBBRRRBRBBRRR";
    assertEquals(7, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case115() {
    String colors = "RRBBBRRRBBRRRBRBRRBBRRRBBRBRRBRRBRRBBBRBRBBRBBRRBB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case116() {
    String colors = "BRBRBRBRBRBBRBRBRBRBBRBBBBBRRRRRRBRRBBRBRBR";
    assertEquals(21, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case117() {
    String colors = "RRBRBRBBRBBRBRBBRBRBRRBBBRRBRBBRBRBRRBBBRRBRBBBBRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case118() {
    String colors = "RBRBRBRRBBRBRRBBRBRBRBRBRRRRRBBRBBBRRBBBBRBRBBBRRR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case119() {
    String colors = "RRRRBBBBBRBRBRBRBBBBBRRRRBBBBRRRRRBRBBBRR";
    assertEquals(20, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case120() {
    String colors = "RRBBRBRBRBRBRRRBBRRBRRBRBRBRRRRBBRRRBBBRRRBBBBRBR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case121() {
    String colors = "RRBRBRBRRBBBBBBRRRBRBBBBBBRBRBRBBBBBBBBRBRRRRBRBRR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case122() {
    String colors = "RBRBRBRBRBRBRBRBRBRBRBRRBRRBRBRBRRRBBRBRRBRBRBRBRB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case123() {
    String colors = "RRBBBBRBRBRBBBRRBBBRRBBBRRR";
    assertEquals(13, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case124() {
    String colors = "RBRBRBRB";
    assertEquals(3, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case125() {
    String colors = "RBRBRBRBRRRRRRRBBBBBBBRRRRRBBBB";
    assertEquals(15, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case126() {
    String colors = "RRRRRBRRBBRBRBBBB";
    assertEquals(8, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case127() {
    String colors = "RBRBRRBB";
    assertEquals(3, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case128() {
    String colors = "RRRRRRRRRRRRRRRRRRRRRRRRRBBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

  @Test
  public void case129() {
    String colors = "RBRBRRBBBRRRRRBBBRRBRBRBBRBRBRBBBBBBRBRRBBRBBRBRBR";
    assertEquals(24, penguinpals.findMaximumMatching(colors));
  }

}
