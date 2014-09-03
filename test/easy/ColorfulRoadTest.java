package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ColorfulRoadTest {
  ColorfulRoad colorfulroad = new ColorfulRoad();

  @Test
  public void case1() {
    String road = "RGGGB";
    assertEquals(8, colorfulroad.getMin(road));
  }

  @Test
  public void case2() {
    String road = "RGBRGBRGB";
    assertEquals(8, colorfulroad.getMin(road));
  }

  @Test
  public void case3() {
    String road = "RBBGGGRR";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case4() {
    String road = "RBRRBGGGBBBBR";
    assertEquals(50, colorfulroad.getMin(road));
  }

  @Test
  public void case5() {
    String road = "RG";
    assertEquals(1, colorfulroad.getMin(road));
  }

  @Test
  public void case6() {
    String road = "RBRGBGBGGBGRGGG";
    assertEquals(52, colorfulroad.getMin(road));
  }

  @Test
  public void case7() {
    String road = "RB";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case8() {
    String road = "RR";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case9() {
    String road = "RBRBRBRBRBRBRBG";
    assertEquals(196, colorfulroad.getMin(road));
  }

  @Test
  public void case10() {
    String road = "RGRGRGRGRGRGRGR";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case11() {
    String road = "RBRBRBRBRGRGRGR";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case12() {
    String road = "RRRRRRRRRRRRRRR";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case13() {
    String road = "RGGGGGGGGGGGGGR";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case14() {
    String road = "RBBBBBBBBBBBBBR";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case15() {
    String road = "RGGGBBRRRRGGBBR";
    assertEquals(34, colorfulroad.getMin(road));
  }

  @Test
  public void case16() {
    String road = "RGGBBRRGGBBRRG";
    assertEquals(25, colorfulroad.getMin(road));
  }

  @Test
  public void case17() {
    String road = "RGGGBBBRRRGGGB";
    assertEquals(35, colorfulroad.getMin(road));
  }

  @Test
  public void case18() {
    String road = "RGGGGBBBBRRRRG";
    assertEquals(43, colorfulroad.getMin(road));
  }

  @Test
  public void case19() {
    String road = "RGGGGGBBBBBRRRG";
    assertEquals(50, colorfulroad.getMin(road));
  }

  @Test
  public void case20() {
    String road = "RG";
    assertEquals(1, colorfulroad.getMin(road));
  }

  @Test
  public void case21() {
    String road = "RRB";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case22() {
    String road = "RGBR";
    assertEquals(3, colorfulroad.getMin(road));
  }

  @Test
  public void case23() {
    String road = "RGRBG";
    assertEquals(16, colorfulroad.getMin(road));
  }

  @Test
  public void case24() {
    String road = "RGBRRG";
    assertEquals(7, colorfulroad.getMin(road));
  }

  @Test
  public void case25() {
    String road = "RRBRBGG";
    assertEquals(36, colorfulroad.getMin(road));
  }

  @Test
  public void case26() {
    String road = "RRGBGRRR";
    assertEquals(21, colorfulroad.getMin(road));
  }

  @Test
  public void case27() {
    String road = "RGBGBRRRB";
    assertEquals(34, colorfulroad.getMin(road));
  }

  @Test
  public void case28() {
    String road = "RRGGGBBGGR";
    assertEquals(27, colorfulroad.getMin(road));
  }

  @Test
  public void case29() {
    String road = "RBGGGRGRRGB";
    assertEquals(52, colorfulroad.getMin(road));
  }

  @Test
  public void case30() {
    String road = "RBRGBRBGBGBG";
    assertEquals(47, colorfulroad.getMin(road));
  }

  @Test
  public void case31() {
    String road = "RGBGBBRGBBBBG";
    assertEquals(50, colorfulroad.getMin(road));
  }

  @Test
  public void case32() {
    String road = "RRGRGRGGRRRRBR";
    assertEquals(73, colorfulroad.getMin(road));
  }

  @Test
  public void case33() {
    String road = "RGGBGBGBRBRGBGG";
    assertEquals(50, colorfulroad.getMin(road));
  }

  @Test
  public void case34() {
    String road = "RRBRB";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case35() {
    String road = "RRRBR";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case36() {
    String road = "RGBGG";
    assertEquals(16, colorfulroad.getMin(road));
  }

  @Test
  public void case37() {
    String road = "RBBBB";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case38() {
    String road = "RRRRB";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case39() {
    String road = "RBBGBBGGGGRGRGG";
    assertEquals(54, colorfulroad.getMin(road));
  }

  @Test
  public void case40() {
    String road = "RRRRRGBGRBRBRRG";
    assertEquals(54, colorfulroad.getMin(road));
  }

  @Test
  public void case41() {
    String road = "RBRRBRRGRRGGBGR";
    assertEquals(78, colorfulroad.getMin(road));
  }

  @Test
  public void case42() {
    String road = "RRGBRGRGRRBBBBR";
    assertEquals(40, colorfulroad.getMin(road));
  }

  @Test
  public void case43() {
    String road = "RGBGRGRGRGRGRBR";
    assertEquals(44, colorfulroad.getMin(road));
  }

  @Test
  public void case44() {
    String road = "RGGBR";
    assertEquals(6, colorfulroad.getMin(road));
  }

  @Test
  public void case45() {
    String road = "RGBBBR";
    assertEquals(9, colorfulroad.getMin(road));
  }

  @Test
  public void case46() {
    String road = "RRRGBBR";
    assertEquals(14, colorfulroad.getMin(road));
  }

  @Test
  public void case47() {
    String road = "RRRGGBBR";
    assertEquals(17, colorfulroad.getMin(road));
  }

  @Test
  public void case48() {
    String road = "RRRRRRRRRRRRRG";
    assertEquals(169, colorfulroad.getMin(road));
  }

  @Test
  public void case49() {
    String road = "RRRRRRRRGGGGGB";
    assertEquals(89, colorfulroad.getMin(road));
  }

  @Test
  public void case50() {
    String road = "RRGGGGGGGGBBR";
    assertEquals(54, colorfulroad.getMin(road));
  }

  @Test
  public void case51() {
    String road = "RGGGGGGGGGBRG";
    assertEquals(52, colorfulroad.getMin(road));
  }

  @Test
  public void case52() {
    String road = "RRRRRRRRRRRRRRG";
    assertEquals(196, colorfulroad.getMin(road));
  }

  @Test
  public void case53() {
    String road = "RGGGGGGGGGGGGGB";
    assertEquals(98, colorfulroad.getMin(road));
  }

  @Test
  public void case54() {
    String road = "RGGGGGGGBBBBBBR";
    assertEquals(66, colorfulroad.getMin(road));
  }

  @Test
  public void case55() {
    String road = "RRRGGGGBRRRRRRG";
    assertEquals(50, colorfulroad.getMin(road));
  }

  @Test
  public void case56() {
    String road = "RRRRGGGBBBBBRGB";
    assertEquals(50, colorfulroad.getMin(road));
  }

  @Test
  public void case57() {
    String road = "RRRRGBBBBBRRGBR";
    assertEquals(40, colorfulroad.getMin(road));
  }

  @Test
  public void case58() {
    String road = "RRRRRGBBBBRGBRG";
    assertEquals(42, colorfulroad.getMin(road));
  }

  @Test
  public void case59() {
    String road = "RGBRRRRGGGGBRGB";
    assertEquals(32, colorfulroad.getMin(road));
  }

  @Test
  public void case60() {
    String road = "RGBBRGBBBRGGGBR";
    assertEquals(24, colorfulroad.getMin(road));
  }

  @Test
  public void case61() {
    String road = "RGBRGGGBBRRGBRG";
    assertEquals(22, colorfulroad.getMin(road));
  }

  @Test
  public void case62() {
    String road = "RGBBRGBBRGGBRGB";
    assertEquals(20, colorfulroad.getMin(road));
  }

  @Test
  public void case63() {
    String road = "RGBRGBRGBBRGBBR";
    assertEquals(18, colorfulroad.getMin(road));
  }

  @Test
  public void case64() {
    String road = "RRGBRGBRGBRGBRG";
    assertEquals(16, colorfulroad.getMin(road));
  }

  @Test
  public void case65() {
    String road = "RGBRGBRGBRGBRGB";
    assertEquals(14, colorfulroad.getMin(road));
  }

  @Test
  public void case66() {
    String road = "RRRRRRGGGGGBRRG";
    assertEquals(66, colorfulroad.getMin(road));
  }

  @Test
  public void case67() {
    String road = "RRRRGGBBBBBBRRG";
    assertEquals(52, colorfulroad.getMin(road));
  }

  @Test
  public void case68() {
    String road = "RGGGGGGGGBRRRRG";
    assertEquals(54, colorfulroad.getMin(road));
  }

  @Test
  public void case69() {
    String road = "RRRRRRRRRRGBRRG";
    assertEquals(106, colorfulroad.getMin(road));
  }

  @Test
  public void case70() {
    String road = "RGGGGBBBBRGGGGB";
    assertEquals(40, colorfulroad.getMin(road));
  }

  @Test
  public void case71() {
    String road = "RRRRGBBBBBRGGGB";
    assertEquals(42, colorfulroad.getMin(road));
  }

  @Test
  public void case72() {
    String road = "RRRGGGGBBRRRRGB";
    assertEquals(44, colorfulroad.getMin(road));
  }

  @Test
  public void case73() {
    String road = "RGGGBBBRRRRRRGB";
    assertEquals(44, colorfulroad.getMin(road));
  }

  @Test
  public void case74() {
    String road = "RGGBBBBBRGGGBBR";
    assertEquals(34, colorfulroad.getMin(road));
  }

  @Test
  public void case75() {
    String road = "RRRRGBBRRRRGBBR";
    assertEquals(38, colorfulroad.getMin(road));
  }

  @Test
  public void case76() {
    String road = "RGBBRRRRRRRRGBR";
    assertEquals(48, colorfulroad.getMin(road));
  }

  @Test
  public void case77() {
    String road = "RGGGBBRRRRRGGBR";
    assertEquals(36, colorfulroad.getMin(road));
  }

  @Test
  public void case78() {
    String road = "RRRRRRRRRRRRRRR";
    assertEquals(-1, colorfulroad.getMin(road));
  }

  @Test
  public void case79() {
    String road = "RGBRGBRGBRGB";
    assertEquals(11, colorfulroad.getMin(road));
  }

  @Test
  public void case80() {
    String road = "RGGRB";
    assertEquals(8, colorfulroad.getMin(road));
  }

  @Test
  public void case81() {
    String road = "RGBGRR";
    assertEquals(11, colorfulroad.getMin(road));
  }

}
