package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TVGameWinningsTest {
  TVGameWinnings tvgamewinnings = new TVGameWinnings();

  @Test
  public void case1() {
    String[] board = { "35", "44" };
    assertArrayEquals(new int[] { -12, 20 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case2() {
    String[] board = { "00200", "0B000", "00020", "10000", "00001" };
    assertArrayEquals(new int[] { -8, 0 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case3() {
    String[] board = { "12A", "A12", "2A1" };
    assertArrayEquals(new int[] { -1, 8 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case4() {
    String[] board = { "AAAA", "BBBB", "CCCC", "DDDD" };
    assertArrayEquals(new int[] { -24, 24 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case5() {
    String[] board = { "243214", "985321", "414584", "457241", "184934", "134567" };
    assertArrayEquals(new int[] { -68040, 127008 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case6() {
    String[] board = { "000000", "000000", "000000", "000000", "000000", "000000" };
    assertArrayEquals(new int[] { 0, 0 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case7() {
    String[] board = { "0" };
    assertArrayEquals(new int[] { 0, 0 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case8() {
    String[] board = { "24I324", "77H4C5", "7D57D9", "I6HEF6", "4GD30I", "DD3EEG" };
    assertArrayEquals(new int[] { -129654, 178605 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case9() {
    String[] board = { "HDC531", "BGAD8I", "HB0F34", "8A7270", "0I9I2F", "9F915H" };
    assertArrayEquals(new int[] { -244944, 163296 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case10() {
    String[] board = { "97C347", "4A3277", "5BFBD3", "GEE564", "6I7475", "C3DF27" };
    assertArrayEquals(new int[] { -122472, 119070 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case11() {
    String[] board = { "7GIF21", "G6GD38", "8DE48F", "5BA7FG", "G73EFG", "1E33B4" };
    assertArrayEquals(new int[] { -141120, 120960 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case12() {
    String[] board = { "H5E0B1", "0D530B", "8C3802", "719332", "95C8DC", "A6D4I2" };
    assertArrayEquals(new int[] { -62208, 51840 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case13() {
    String[] board = { "3BB2GA", "6D8EFG", "185733", "AGIFH1", "0DD199", "IAA29E" };
    assertArrayEquals(new int[] { -217728, 222264 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case14() {
    String[] board = { "DD0784", "254HB1", "3E9410", "C5H1GA", "I6GD59", "85GB03" };
    assertArrayEquals(new int[] { -207360, 184320 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case15() {
    String[] board = { "344242", "C3D484", "HI4I3D", "6IA31A", "8G8B61", "HEI34B" };
    assertArrayEquals(new int[] { -93312, 93312 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case16() {
    String[] board = { "664GDG", "18B144", "IIH2BF", "I2AF2H", "3CC9CC", "23BBDG" };
    assertArrayEquals(new int[] { -145152, 145152 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case17() {
    String[] board = { "1A1A28", "3BFB5A", "135211", "57HCB2", "G49G5E", "8GAFG1" };
    assertArrayEquals(new int[] { -78400, 35280 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case18() {
    String[] board = { "AH3DF9", "1I964E", "GEEAD9", "144CIE", "58CE00", "1EDD2H" };
    assertArrayEquals(new int[] { -181440, 108864 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case19() {
    String[] board = { "E12HI4", "FHI6I9", "5EBG3E", "I60DEF", "4F2B78", "20IE71" };
    assertArrayEquals(new int[] { -275562, 326592 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case20() {
    String[] board = { "324F52", "A41446", "IG754H", "ID9CBG", "85A7G9", "A879AF" };
    assertArrayEquals(new int[] { -163296, 136080 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case21() {
    String[] board = { "GB9DF6", "396F3I", "BAA801", "6443CF", "76E9C8", "B0ECA9" };
    assertArrayEquals(new int[] { -122472, 116640 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case22() {
    String[] board = { "9DD4G8", "I99C01", "HCE6EH", "D0HD48", "E90I01", "4F4C44" };
    assertArrayEquals(new int[] { -186624, 217728 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case23() {
    String[] board = { "4993HH", "FB35E7", "1H483E", "4AD303", "I41I50", "81A192" };
    assertArrayEquals(new int[] { -163296, 163296 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case24() {
    String[] board = { "BDG3D5", "7BAF44", "521GFA", "D174I5", "I6H397", "627E1A" };
    assertArrayEquals(new int[] { -63504, 92610 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case25() {
    String[] board = { "F82129", "198A65", "D7675G", "D7IG5E", "F6D467", "52HEG5" };
    assertArrayEquals(new int[] { -214326, 166698 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case26() {
    String[] board = { "2FDE8B", "H6I739", "D1CA1H", "B29GIA", "HEBHHA", "EGD9EC" };
    assertArrayEquals(new int[] { -279936, 258048 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case27() {
    String[] board = { "D915IG", "HDED10", "I80AF7", "GC3EE9", "EB1CG2", "B7C952" };
    assertArrayEquals(new int[] { -229635, 138915 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case28() {
    String[] board = { "DB9H6A", "95DHAA", "462BC1", "7FD009", "BG4023", "79CA02" };
    assertArrayEquals(new int[] { -95256, 62208 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case29() {
    String[] board = { "47D532", "00DE57", "ADF41B", "DHGE3D", "A59695", "606454" };
    assertArrayEquals(new int[] { -79380, 90720 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case30() {
    String[] board = { "74FF02", "1IIFEF", "A645DI", "DI123B", "E5B0HE", "HEIIG8" };
    assertArrayEquals(new int[] { -367416, 244944 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case31() {
    String[] board = { "D99G37", "EAGI66", "AIBED0", "30A144", "36G55C", "E035D6" };
    assertArrayEquals(new int[] { -79380, 72900 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case32() {
    String[] board = { "H89760", "H6F011", "I6D36B", "19FG6D", "4AFC63", "4IHE05" };
    assertArrayEquals(new int[] { -90720, 102060 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case33() {
    String[] board = { "F62IGI", "18I35F", "G69EI3", "49069A", "1D0GAC", "8BC4HF" };
    assertArrayEquals(new int[] { -367416, 204120 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case34() {
    String[] board = { "4HDC84", "463EG7", "E7B60G", "CGE60H", "EDDH59", "ED28G2" };
    assertArrayEquals(new int[] { -86400, 100800 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case35() {
    String[] board = { "27FE6B", "1HHB3E", "2CG800", "160377", "IE9F06", "2265GI" };
    assertArrayEquals(new int[] { -197568, 254016 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case36() {
    String[] board = { "BCH5GG", "ICIA4C", "56632E", "113EH5", "CD5A2D", "D97I49" };
    assertArrayEquals(new int[] { -97200, 136080 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case37() {
    String[] board = { "HEB148", "038H6I", "EG6I06", "610I98", "312673", "CH4459" };
    assertArrayEquals(new int[] { -258048, 217728 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case38() {
    String[] board = { "24I32", "477H4", "C57D5", "7D9I6", "HEF64" };
    assertArrayEquals(new int[] { -22680, 13230 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case39() {
    String[] board = { "GD30I", "DD3EE", "GHDC5", "31BGA", "D8IHB" };
    assertArrayEquals(new int[] { -17640, 18144 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case40() {
    String[] board = { "0F348", "A7270", "0I9I2", "F9F91", "5H97C" };
    assertArrayEquals(new int[] { -27216, 27216 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case41() {
    String[] board = { "3474A", "32775", "BFBD3", "GEE56", "46I74" };
    assertArrayEquals(new int[] { -8232, 10290 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case42() {
    String[] board = { "12A", "A12", "2A1" };
    assertArrayEquals(new int[] { -1, 8 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case43() {
    String[] board = { "12A444", "213456", "2A1321", "123456", "234567", "ABCDEF" };
    assertArrayEquals(new int[] { -2160, 2160 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case44() {
    String[] board = { "121", "112", "211" };
    assertArrayEquals(new int[] { -2, 8 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case45() {
    String[] board = { "23690A", "786GFD", "DD9E31", "225541", "HGFDA0", "0034BC" };
    assertArrayEquals(new int[] { -62208, 47628 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case46() {
    String[] board = { "211", "112", "121" };
    assertArrayEquals(new int[] { -8, 2 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case47() {
    String[] board = { "15ABC", "38534", "ABD32", "34567", "ABCDE" };
    assertArrayEquals(new int[] { -1800, 1680 }, tvgamewinnings.getMinMax(board));
  }

  @Test
  public void case48() {
    String[] board = { "AA", "1A" };
    assertArrayEquals(new int[] { -1, -1 }, tvgamewinnings.getMinMax(board));
  }

}
