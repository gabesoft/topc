package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class HanoiTowerTest {
  HanoiTower hanoitower = new HanoiTower();

  @Test
  public void case1() {
    String pegA = "A";
    String pegB = "AA";
    String pegC = "AA";
    assertEquals(4, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case2() {
    String pegA = "B";
    String pegB = "C";
    String pegC = "A";
    assertEquals(5, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case3() {
    String pegA = "CBA";
    String pegB = "";
    String pegC = "";
    assertEquals(5, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case4() {
    String pegA = "BBBBBBBBBA";
    String pegB = "";
    String pegC = "";
    assertEquals(11, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case5() {
    String pegA = "CCCCBBBAAA";
    String pegB = "";
    String pegC = "";
    assertEquals(16, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case6() {
    String pegA = "A";
    String pegB = "";
    String pegC = "";
    assertEquals(0, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case7() {
    String pegA = "BBBB";
    String pegB = "CCC";
    String pegC = "AAA";
    assertEquals(16, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case8() {
    String pegA = "C";
    String pegB = "B";
    String pegC = "";
    assertEquals(1, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case9() {
    String pegA = "CB";
    String pegB = "AACA";
    String pegC = "AA";
    assertEquals(13, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case10() {
    String pegA = "B";
    String pegB = "C";
    String pegC = "B";
    assertEquals(4, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case11() {
    String pegA = "B";
    String pegB = "";
    String pegC = "B";
    assertEquals(2, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case12() {
    String pegA = "C";
    String pegB = "C";
    String pegC = "";
    assertEquals(2, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case13() {
    String pegA = "BBB";
    String pegB = "";
    String pegC = "AB";
    assertEquals(5, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case14() {
    String pegA = "";
    String pegB = "AAACC";
    String pegC = "AAAAA";
    assertEquals(10, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case15() {
    String pegA = "BB";
    String pegB = "A";
    String pegC = "AAABAB";
    assertEquals(10, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case16() {
    String pegA = "C";
    String pegB = "CCCABB";
    String pegC = "A";
    assertEquals(13, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case17() {
    String pegA = "CABA";
    String pegB = "";
    String pegC = "BCC";
    assertEquals(12, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case18() {
    String pegA = "B";
    String pegB = "C";
    String pegC = "";
    assertEquals(2, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case19() {
    String pegA = "";
    String pegB = "CBA";
    String pegC = "BABBC";
    assertEquals(13, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case20() {
    String pegA = "";
    String pegB = "C";
    String pegC = "";
    assertEquals(1, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case21() {
    String pegA = "BBBCC";
    String pegB = "C";
    String pegC = "A";
    assertEquals(10, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case22() {
    String pegA = "";
    String pegB = "AA";
    String pegC = "";
    assertEquals(2, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case23() {
    String pegA = "BC";
    String pegB = "CCBA";
    String pegC = "AAC";
    assertEquals(15, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case24() {
    String pegA = "BC";
    String pegB = "";
    String pegC = "B";
    assertEquals(3, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case25() {
    String pegA = "C";
    String pegB = "";
    String pegC = "B";
    assertEquals(2, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case26() {
    String pegA = "C";
    String pegB = "";
    String pegC = "A";
    assertEquals(3, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case27() {
    String pegA = "CCC";
    String pegB = "AAB";
    String pegC = "BBAB";
    assertEquals(17, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case28() {
    String pegA = "B";
    String pegB = "ABACA";
    String pegC = "AAA";
    assertEquals(14, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case29() {
    String pegA = "";
    String pegB = "";
    String pegC = "BBB";
    assertEquals(3, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case30() {
    String pegA = "CCC";
    String pegB = "AAC";
    String pegC = "AAC";
    assertEquals(12, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case31() {
    String pegA = "CA";
    String pegB = "AAC";
    String pegC = "BAB";
    assertEquals(15, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case32() {
    String pegA = "BBAA";
    String pegB = "";
    String pegC = "B";
    assertEquals(7, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case33() {
    String pegA = "";
    String pegB = "A";
    String pegC = "B";
    assertEquals(2, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case34() {
    String pegA = "";
    String pegB = "AA";
    String pegC = "BA";
    assertEquals(4, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case35() {
    String pegA = "CBCA";
    String pegB = "C";
    String pegC = "BBB";
    assertEquals(12, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case36() {
    String pegA = "BBCC";
    String pegB = "C";
    String pegC = "";
    assertEquals(5, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case37() {
    String pegA = "CAA";
    String pegB = "A";
    String pegC = "";
    assertEquals(6, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case38() {
    String pegA = "C";
    String pegB = "AABC";
    String pegC = "BB";
    assertEquals(12, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case39() {
    String pegA = "";
    String pegB = "";
    String pegC = "AC";
    assertEquals(3, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case40() {
    String pegA = "";
    String pegB = "A";
    String pegC = "ABC";
    assertEquals(6, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case41() {
    String pegA = "CBA";
    String pegB = "";
    String pegC = "";
    assertEquals(5, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case42() {
    String pegA = "CCB";
    String pegB = "A";
    String pegC = "BA";
    assertEquals(10, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case43() {
    String pegA = "";
    String pegB = "AABB";
    String pegC = "";
    assertEquals(6, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case44() {
    String pegA = "BCB";
    String pegB = "";
    String pegC = "AB";
    assertEquals(7, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case45() {
    String pegA = "";
    String pegB = "";
    String pegC = "BBB";
    assertEquals(3, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case46() {
    String pegA = "CCAC";
    String pegB = "AB";
    String pegC = "ABC";
    assertEquals(15, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case47() {
    String pegA = "";
    String pegB = "C";
    String pegC = "AB";
    assertEquals(5, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case48() {
    String pegA = "CCCC";
    String pegB = "ACBC";
    String pegC = "B";
    assertEquals(13, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case49() {
    String pegA = "CACB";
    String pegB = "CA";
    String pegC = "ABC";
    assertEquals(16, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case50() {
    String pegA = "BA";
    String pegB = "A";
    String pegC = "B";
    assertEquals(6, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case51() {
    String pegA = "CBB";
    String pegB = "AAB";
    String pegC = "A";
    assertEquals(11, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case52() {
    String pegA = "";
    String pegB = "ABABBC";
    String pegC = "AC";
    assertEquals(12, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case53() {
    String pegA = "BA";
    String pegB = "CAC";
    String pegC = "BB";
    assertEquals(12, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case54() {
    String pegA = "BB";
    String pegB = "A";
    String pegC = "";
    assertEquals(4, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case55() {
    String pegA = "CACC";
    String pegB = "CAAAB";
    String pegC = "B";
    assertEquals(15, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case56() {
    String pegA = "C";
    String pegB = "AB";
    String pegC = "ABBB";
    assertEquals(11, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case57() {
    String pegA = "";
    String pegB = "C";
    String pegC = "ABB";
    assertEquals(6, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case58() {
    String pegA = "C";
    String pegB = "ABACB";
    String pegC = "A";
    assertEquals(11, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case59() {
    String pegA = "BCAA";
    String pegB = "CAB";
    String pegC = "ABC";
    assertEquals(19, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case60() {
    String pegA = "CBACBACBAA";
    String pegB = "";
    String pegC = "";
    assertEquals(19, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case61() {
    String pegA = "ABC";
    String pegB = "ABC";
    String pegC = "ABCA";
    assertEquals(17, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case62() {
    String pegA = "BC";
    String pegB = "ABCCBA";
    String pegC = "BA";
    assertEquals(18, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case63() {
    String pegA = "ABCABC";
    String pegB = "";
    String pegC = "";
    assertEquals(7, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case64() {
    String pegA = "BBB";
    String pegB = "CCC";
    String pegC = "AAAA";
    assertEquals(16, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case65() {
    String pegA = "CCC";
    String pegB = "BBB";
    String pegC = "AAAA";
    assertEquals(10, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case66() {
    String pegA = "BBA";
    String pegB = "AA";
    String pegC = "CCC";
    assertEquals(8, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case67() {
    String pegA = "CBAB";
    String pegB = "ABBA";
    String pegC = "BA";
    assertEquals(17, hanoitower.moves(pegA, pegB, pegC));
  }

  @Test
  public void case68() {
    String pegA = "ABBC";
    String pegB = "BACCB";
    String pegC = "C";
    assertEquals(9, hanoitower.moves(pegA, pegB, pegC));
  }

}
