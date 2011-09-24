package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class MLBRecordTest {
  MLBRecord mlbrecord = new MLBRecord();

  @Test
  public void case1() {
    int[] wins = { 10, 5, 7, 2 };
    int gamesLeft = 4;
    int N = 2;
    assertEquals("C..E", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case2() {
    int[] wins = { 1, 1, 1, 3, 4, 5 };
    int gamesLeft = 3;
    int N = 3;
    assertEquals(".....C", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case3() {
    int[] wins = { 1, 1, 2, 6, 5, 6 };
    int gamesLeft = 3;
    int N = 3;
    assertEquals("EE.C.C", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case4() {
    int[] wins = { 56, 12, 93, 1, 74, 55, 59, 99, 1 };
    int gamesLeft = 38;
    int N = 4;
    assertEquals(".E.E...CE", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case5() {
    int[] wins = { 26, 12, 93, 31, 74, 35, 59, 99, 21 };
    int gamesLeft = 40;
    int N = 4;
    assertEquals(".EC....C.", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case6() {
    int[] wins = { 56, 12, 93, 1, 74, 55, 59, 99, 1 };
    int gamesLeft = 36;
    int N = 4;
    assertEquals(".ECE...CE", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case7() {
    int[] wins = { 26, 12, 93, 31, 74, 35, 59, 99, 21 };
    int gamesLeft = 22;
    int N = 4;
    assertEquals("EECECECCE", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case8() {
    int[] wins = { 10, 10, 10, 10, 10, 10 };
    int gamesLeft = 100;
    int N = 5;
    assertEquals("......", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case9() {
    int[] wins = { 10, 10, 10 };
    int gamesLeft = 0;
    int N = 2;
    assertEquals("...", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case10() {
    int[] wins = { 92, 100, 96, 73, 100, 100, 86, 96, 99, 99, 89, 96, 72, 95, 98, 99, 84, 100, 100, 100, 100, 94, 80, 84, 100, 85, 90, 89, 98, 79, 89, 85, 85, 100, 91, 100, 79, 97, 100, 100, 93, 100, 100, 100 };
    int gamesLeft = 11;
    int N = 10;
    assertEquals("...E..E.....E...E.....EE.E...E.EE...E.......", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case11() {
    int[] wins = { 50, 58, 53, 50, 34, 55, 40, 45, 52, 49, 60, 51, 48, 60, 49, 38, 47, 50, 45, 32, 57, 39, 41, 52, 58, 56, 54 };
    int gamesLeft = 10;
    int N = 25;
    assertEquals("CCCC.C.CCCCCCCC.CCC.C..CCCC", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case12() {
    int[] wins = { 68, 71, 57, 54, 57, 72, 78, 58, 55, 42, 64, 54, 62, 63, 61, 64, 79, 65, 56, 50, 61, 80, 77, 61, 55, 61, 63, 63, 69, 67, 73, 59, 66, 72, 58, 53 };
    int gamesLeft = 10;
    int N = 22;
    assertEquals(".....CC..E......C..E.CC.......C..C..", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case13() {
    int[] wins = { 46, 28, 42, 36, 37, 27, 30, 23, 42, 34, 32, 36, 45, 34, 32, 40, 37, 27, 30, 40, 36, 31, 35, 41, 37, 31, 36 };
    int gamesLeft = 0;
    int N = 2;
    assertEquals("CEEEEEEEEEEECEEEEEEEEEEEEEE", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case14() {
    int[] wins = { 33, 28, 42, 41, 40, 43, 36, 44, 47, 33, 39, 45, 28, 29, 42 };
    int gamesLeft = 2;
    int N = 3;
    assertEquals("EE.EE.E.CEE.EE.", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case15() {
    int[] wins = { 62, 52, 64, 70, 59, 68, 51, 63, 60, 49, 47, 46, 59, 54, 67, 51, 48, 55, 52, 68, 57, 46, 50, 51, 65, 59, 67, 56 };
    int gamesLeft = 15;
    int N = 9;
    assertEquals("...........E.........E......", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case16() {
    int[] wins = { 48, 56, 60, 56, 84, 56, 57, 58, 64, 44, 51, 46, 61, 54, 58, 50, 51, 54, 53, 53, 48, 50, 58, 65, 56, 53, 57, 48, 63, 48, 46, 66, 54, 57, 49, 49, 41, 68 };
    int gamesLeft = 40;
    int N = 33;
    assertEquals("....C.................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case17() {
    int[] wins = { 39, 33, 24, 35, 24, 32, 18, 25, 25, 24, 31, 18, 24, 21, 28, 27, 25, 24 };
    int gamesLeft = 8;
    int N = 2;
    assertEquals("..E.E.EEEE.EEE..EE", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case18() {
    int[] wins = { 54, 60, 64, 53, 51, 68, 63, 68, 57, 67, 65, 53, 57, 46, 57, 41, 63, 76, 63, 54, 62, 66, 54, 68, 55, 61, 63, 57 };
    int gamesLeft = 14;
    int N = 23;
    assertEquals(".....C.C.........C.....C....", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case19() {
    int[] wins = { 48, 56, 49, 42, 40, 57, 52, 54, 48, 55, 51, 61, 60, 53, 52, 66, 44, 54, 49, 47, 51, 43, 39, 50, 45, 61, 51, 50 };
    int gamesLeft = 2;
    int N = 7;
    assertEquals("E.EEECE.E.ECC.ECE.EEEEEEECEE", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case20() {
    int[] wins = { 18, 5, 16, 19, 21, 17, 15, 17, 11, 23, 15, 16, 11, 13, 14, 10, 23, 13, 13, 15, 11, 15, 15, 17, 17, 8, 13, 13, 12, 25, 16, 22, 18, 16, 9, 11, 9, 14, 23, 14, 13, 14, 15 };
    int gamesLeft = 10;
    int N = 32;
    assertEquals(".............................C.............", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case21() {
    int[] wins = { 51, 59, 51, 57, 62, 54, 50, 54, 64, 55, 69, 50, 41, 58, 49, 62, 53, 47, 59, 55, 50, 53, 52, 72, 48 };
    int gamesLeft = 26;
    int N = 2;
    assertEquals("............E............", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case22() {
    int[] wins = { 51, 81, 79, 84, 67, 80, 69, 76, 71, 78, 78, 76, 83, 68, 76, 87, 54, 71, 82, 72, 64, 61, 64, 82, 84, 63, 78, 78, 89 };
    int gamesLeft = 20;
    int N = 24;
    assertEquals("...............C............C", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case23() {
    int[] wins = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 90, 100, 98, 100, 74, 86, 94, 100, 93, 99, 100, 100, 100, 100, 100 };
    int gamesLeft = 18;
    int N = 32;
    assertEquals("CCCCCCCCCCCCCCCCCC.CCC..CCCCCCCCC", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case24() {
    int[] wins = { 51, 36, 52, 46, 53, 43, 38, 46, 39, 31, 48, 45 };
    int gamesLeft = 5;
    int N = 8;
    assertEquals("CECCC..C.ECC", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case25() {
    int[] wins = { 100, 92, 91, 97, 100, 98, 100, 90, 100, 100, 100, 94, 100, 99, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 93, 100, 100, 97, 75 };
    int gamesLeft = 28;
    int N = 15;
    assertEquals(".....................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case26() {
    int[] wins = { 72, 64, 64, 60, 61, 45, 63, 66, 65, 53, 59, 57, 51, 64, 65, 53, 74, 49, 55, 43, 58, 61, 49, 52, 54, 59, 68, 51, 47, 55, 46, 47, 59, 54, 52 };
    int gamesLeft = 20;
    int N = 32;
    assertEquals("C...............C.........C........", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case27() {
    int[] wins = { 61, 74, 64, 75, 66, 69, 56, 55, 73, 55, 60, 63, 55, 72, 74, 69, 64, 56, 73, 63, 78, 76, 74, 62, 65, 85, 63, 83, 65, 62, 64, 70 };
    int gamesLeft = 16;
    int N = 29;
    assertEquals(".C.C....C....CC...C.CCC..C.C....", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case28() {
    int[] wins = { 95, 87, 90, 87, 87, 83, 77, 91, 89, 94, 84, 86, 100, 83, 82, 83, 89, 84, 80, 86, 92, 89, 70, 100, 87, 97, 97, 76, 86, 95, 100, 95, 82, 95, 99, 93, 83, 99, 100, 84, 98, 82, 91, 92, 81, 91, 92 };
    int gamesLeft = 26;
    int N = 3;
    assertEquals("......................E........................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case29() {
    int[] wins = { 44, 49, 63, 50, 40, 53, 45, 44 };
    int gamesLeft = 14;
    int N = 4;
    assertEquals("..C.....", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case30() {
    int[] wins = { 84, 63, 73, 93, 78, 83, 84, 100, 87, 85, 75, 88, 86, 74, 90, 95, 78, 92, 79, 68, 83, 86, 79, 86, 78, 74, 91, 74, 83, 81, 78, 77, 84, 96, 75, 82, 77, 79, 92, 99, 86, 70, 92, 72, 85, 81 };
    int gamesLeft = 7;
    int N = 7;
    assertEquals("EEE.EEEC..E..E..E.EEE.E.EE.EEEEEE.EEEE...E.E.E", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case31() {
    int[] wins = { 76, 67, 74, 63, 82, 60, 66, 56 };
    int gamesLeft = 23;
    int N = 7;
    assertEquals("....C...", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case32() {
    int[] wins = { 79, 55, 62, 69, 70, 66, 74, 68, 67, 76, 63, 68, 59, 74, 66, 56, 74, 61, 64, 65, 61, 81, 60, 83, 68, 62, 63, 63, 69, 64 };
    int gamesLeft = 9;
    int N = 28;
    assertEquals("C..CCCCCCC.C.CC.C....C.CC...C.", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case33() {
    int[] wins = { 45, 56, 42, 44, 45, 44, 41, 47, 50, 45, 36, 45, 37, 55, 36, 46, 44, 44, 35, 46, 35, 50, 53, 47, 45, 33, 43, 43, 34, 45, 51, 40, 49, 59, 43, 49, 40, 40, 45, 30, 35, 37, 37, 26 };
    int gamesLeft = 13;
    int N = 2;
    assertEquals("..E...E...E.E.E...E.E....E..E..E....EE.EEEEE", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case34() {
    int[] wins = { 48, 44, 71, 64, 52, 67, 58, 58, 63, 51, 72, 56, 50, 53, 52, 58, 61, 59, 60, 63, 50, 62, 65, 65, 55, 66, 46, 67, 65, 63, 66, 66, 53, 66, 68, 54, 60, 64 };
    int gamesLeft = 30;
    int N = 2;
    assertEquals("......................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case35() {
    int[] wins = { 80, 96, 84, 64, 97, 76, 84, 78, 78, 86, 84, 95, 75, 73, 85, 84, 74, 93, 87, 74, 72, 79, 84, 74, 86, 83, 78, 95, 81, 74, 83, 86, 73, 72, 75, 78, 69, 78, 58, 75, 67, 94, 81, 69, 86, 92, 75, 76, 77, 83 };
    int gamesLeft = 1;
    int N = 49;
    assertEquals("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCECCCCCCCCCCC", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case36() {
    int[] wins = { 62, 59, 63, 70, 61, 58, 73, 67, 72, 69, 46, 66, 71, 49, 80, 61, 76, 78, 73, 54, 54, 65, 74, 73, 60, 69, 64, 67, 78, 58, 69, 60, 63, 63, 65, 66, 60, 74, 71, 66, 68, 67, 76, 66, 75, 60, 73, 56 };
    int gamesLeft = 21;
    int N = 8;
    assertEquals("..........E..E..................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case37() {
    int[] wins = { 84, 83, 89, 93, 88, 82, 87, 67, 72, 65 };
    int gamesLeft = 11;
    int N = 9;
    assertEquals("CCCCCCC...", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case38() {
    int[] wins = { 13, 24, 21, 23, 14, 25, 25, 17, 20, 13, 24, 17, 16, 17, 15, 19, 20, 18, 20, 20, 25, 25, 13, 21, 21, 11, 13, 20, 23, 17 };
    int gamesLeft = 3;
    int N = 18;
    assertEquals("ECCCECC..EC.........CCECCEE.C.", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case39() {
    int[] wins = { 70, 68, 68, 67, 76, 64, 68, 64, 87, 76, 85, 74, 75, 82, 79, 76, 89, 63, 61, 76, 87, 65, 77, 62, 83, 61, 83, 77, 66, 68, 71, 70, 79, 73, 75, 67, 67, 79, 69, 58, 63, 68, 65, 55, 81, 67, 71, 81 };
    int gamesLeft = 21;
    int N = 35;
    assertEquals("................C...............................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case40() {
    int[] wins = { 7, 6, 16, 10, 4, 12, 11, 6 };
    int gamesLeft = 4;
    int N = 6;
    assertEquals("..C..CC.", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case41() {
    int[] wins = { 56, 73, 68, 77, 75, 83, 78, 93, 71, 86, 74, 78, 82, 78, 73, 76, 84, 78, 85, 76, 82, 68, 77 };
    int gamesLeft = 6;
    int N = 18;
    assertEquals("E....C.C.C..C...C.C.C..", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case42() {
    int[] wins = { 52, 58, 67, 69, 61, 60, 50, 58, 60, 65, 50, 48, 62, 49, 59, 57, 48, 48, 46, 63 };
    int gamesLeft = 2;
    int N = 5;
    assertEquals("EECC..EE.CEE.EEEEEE.", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case43() {
    int[] wins = { 61, 80, 83, 100, 85, 84, 84, 68, 71, 77, 76, 85, 87, 80, 82, 72, 73, 79, 73, 84, 83, 63, 88, 75, 81, 75, 92, 85, 80, 97, 63, 81, 93, 77, 77, 94, 81, 80, 86, 74, 71, 84, 81, 77, 76, 77, 86, 82, 77 };
    int gamesLeft = 2;
    int N = 46;
    assertEquals("ECCCCCCCCCCCCCCCCCCCCECCCCCCCCECCCCCCCCCCCCCCCCCC", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case44() {
    int[] wins = { 47, 56, 53, 54, 51, 68, 57, 60, 70, 59, 52, 63, 61, 65, 75, 63, 75, 64, 61, 69, 62, 73, 57, 68, 64, 60, 73, 59, 69, 69, 65, 69, 56, 64, 64, 75, 77, 53, 58, 69, 68, 61, 50, 77, 56, 68, 61, 54, 65 };
    int gamesLeft = 2;
    int N = 37;
    assertEquals("E.EEEC.CC.ECCCCCCCCCCC.CCCC.CCCC.CCCCE.CCCEC.CCEC", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case45() {
    int[] wins = { 27, 21, 31, 24, 24, 19, 23, 31, 22, 25, 22, 33, 32, 36, 29, 28, 34, 21, 24, 25, 33, 24, 34, 28, 21, 16, 32, 31, 27, 26, 32, 31, 28, 27, 26, 38, 27, 26, 21, 23, 23, 22, 34 };
    int gamesLeft = 8;
    int N = 40;
    assertEquals("..C....C...CCC..C...C.C...CC..CC...C......C", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case46() {
    int[] wins = { 50, 58, 52, 40, 54, 59, 54, 48, 51, 40, 75, 67, 56, 49, 59, 37, 50, 53, 49, 54, 57, 67, 50, 54, 56, 54, 54, 45, 57, 40, 59, 47, 53, 56, 51 };
    int gamesLeft = 30;
    int N = 29;
    assertEquals("..........C........................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case47() {
    int[] wins = { 63, 71, 59, 79, 73, 65, 71, 76, 80, 83, 67, 65 };
    int gamesLeft = 0;
    int N = 9;
    assertEquals("ECECC.CCCCC.", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case48() {
    int[] wins = { 56, 56, 67, 65, 65, 48, 51, 61, 50, 56, 62, 58, 53, 68, 48, 56, 58, 52, 49, 58, 63, 59, 54, 57, 65, 75, 66, 53, 56, 53, 49, 51, 53, 49, 55, 64, 53, 65, 51, 59, 49, 43, 62, 66, 53, 62, 57 };
    int gamesLeft = 10;
    int N = 7;
    assertEquals(".....EE.E...E.E..EE...E....E.EEEEE..E.E.EE..E..", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case49() {
    int[] wins = { 64, 68, 58, 54, 59, 48, 59, 54, 63, 52, 49, 54, 54, 57, 60, 63, 56, 53, 60, 66, 67, 48, 64, 60, 54, 50, 56, 55, 54, 56, 54, 71 };
    int gamesLeft = 13;
    int N = 14;
    assertEquals("...............................C", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case50() {
    int[] wins = { 74, 81, 76, 90, 62, 72, 75, 78, 65, 89, 76, 85, 84, 79, 84 };
    int gamesLeft = 6;
    int N = 9;
    assertEquals("...CE...EC.CC.C", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case51() {
    int[] wins = { 100, 98, 95, 88, 100, 100, 100, 84, 89, 100, 82, 84, 99, 88, 100, 100, 100, 100, 84, 79, 81, 100, 92, 100, 96, 90, 100, 100, 74, 87, 92, 87, 100 };
    int gamesLeft = 8;
    int N = 7;
    assertEquals("...E...EE.EE.E....EEE....E..EE.E.", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case52() {
    int[] wins = { 14, 22, 20, 21, 17, 14, 23, 21, 21, 23, 21, 17, 16, 28, 21, 20, 17, 12, 17, 21, 14, 24, 17, 16, 16, 22, 21, 15, 20 };
    int gamesLeft = 8;
    int N = 4;
    assertEquals("E....E...........E..E........", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case53() {
    int[] wins = { 82, 64, 77, 76, 75, 85, 78, 68, 80, 68, 74, 64, 71 };
    int gamesLeft = 4;
    int N = 4;
    assertEquals("CE...C.E.E.EE", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case54() {
    int[] wins = { 19, 23, 24, 9, 13, 19, 15, 22 };
    int gamesLeft = 8;
    int N = 3;
    assertEquals("...EE...", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case55() {
    int[] wins = { 51, 50, 58, 66, 66, 60, 59, 58 };
    int gamesLeft = 7;
    int N = 4;
    assertEquals("EE.CC...", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case56() {
    int[] wins = { 98, 86, 88, 92, 88, 96, 71, 71, 77, 79, 80, 79, 86, 94, 71, 78, 95, 72, 75, 86, 84, 84, 85, 93, 76, 95, 100, 82, 90, 78, 74, 85 };
    int gamesLeft = 1;
    int N = 12;
    assertEquals("C.CCCCEEEEEE.CEECEE.EE.CECCECEE.", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case57() {
    int[] wins = { 47, 49, 58, 54 };
    int gamesLeft = 37;
    int N = 2;
    assertEquals("....", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case58() {
    int[] wins = { 22, 9, 24, 21, 9, 22, 23, 17, 23, 23, 14, 24, 10, 15, 14, 20, 11, 16, 28, 24, 27, 21, 14, 11, 21, 22, 21, 26, 17, 19, 21, 18, 17, 29, 12, 16, 22, 16, 21, 29, 21, 14, 14, 18, 23, 17, 19, 17 };
    int gamesLeft = 73;
    int N = 32;
    assertEquals("................................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case59() {
    int[] wins = { 83, 88, 90, 91, 89, 91, 94, 94, 86, 93, 92, 85, 95, 100, 82, 95, 93, 93, 73, 89, 66, 99, 70, 100, 87, 75, 76, 88, 93, 100, 78 };
    int gamesLeft = 84;
    int N = 17;
    assertEquals("...............................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case60() {
    int[] wins = { 89, 70, 88, 95, 90, 77, 63, 98, 81, 97, 85, 100, 80, 91, 90, 76, 89, 100, 77, 92, 83, 78, 87, 99, 85, 91, 87, 56, 87, 86, 78, 96, 90, 86, 100, 88, 90, 92 };
    int gamesLeft = 45;
    int N = 25;
    assertEquals("......................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case61() {
    int[] wins = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int gamesLeft = 7;
    int N = 19;
    assertEquals("..........................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case62() {
    int[] wins = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 99, 93 };
    int gamesLeft = 68;
    int N = 7;
    assertEquals("................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case63() {
    int[] wins = { 45, 32, 49, 34, 39, 38, 27, 33, 39, 38, 42, 38, 42, 38, 46, 44, 30, 41, 43, 43, 41, 35, 39, 52, 39, 33, 36, 34, 35, 52, 31, 46, 44, 37, 43, 53, 46, 29, 33, 43, 43, 36, 37, 42, 46, 50, 45, 39 };
    int gamesLeft = 95;
    int N = 40;
    assertEquals("................................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case64() {
    int[] wins = { 18, 14, 19, 14, 15, 9, 14, 9, 9, 11, 8, 15, 14, 11, 11, 17, 13, 14, 14, 17, 17, 21, 11, 15, 20 };
    int gamesLeft = 62;
    int N = 7;
    assertEquals(".........................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case65() {
    int[] wins = { 57, 71, 68, 81, 64, 82, 71, 59, 80, 82, 50, 76, 76, 66, 69, 44, 74, 56, 61, 57, 62, 79, 78, 84, 60, 65, 76, 61, 73, 70, 66, 58 };
    int gamesLeft = 38;
    int N = 26;
    assertEquals("................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case66() {
    int[] wins = { 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 1, 1, 2, 2, 2, 1, 0, 1, 0, 2, 1, 1, 0, 2, 0, 0, 1, 0, 0, 1, 1, 2, 2, 1, 0, 0, 1, 2, 1, 1, 0, 0, 1 };
    int gamesLeft = 86;
    int N = 30;
    assertEquals("...........................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case67() {
    int[] wins = { 92, 79, 91, 82, 92, 98, 86, 97, 88, 97, 86, 91, 87, 81, 94, 96, 64, 86, 94, 90, 80, 85, 99, 77, 81, 70, 90, 100, 92, 77, 92, 97, 73, 97, 82, 64, 86, 79, 74, 91, 77, 81, 86, 83 };
    int gamesLeft = 37;
    int N = 38;
    assertEquals("............................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case68() {
    int[] wins = { 56, 53, 65, 61, 74, 64, 63, 72 };
    int gamesLeft = 27;
    int N = 4;
    assertEquals("........", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case69() {
    int[] wins = { 79, 64, 58, 54, 75, 69, 63, 62, 44, 78, 68, 62, 52, 56, 62, 55, 53 };
    int gamesLeft = 34;
    int N = 3;
    assertEquals(".................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case70() {
    int[] wins = { 83, 96, 92, 99, 98, 100, 83, 89, 100, 100, 95, 100, 77, 98, 82, 100, 100, 83, 84, 96, 86, 93, 100, 100, 91 };
    int gamesLeft = 46;
    int N = 7;
    assertEquals(".........................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case71() {
    int[] wins = { 52, 56, 59, 48, 44, 62, 56, 72, 48, 67, 55, 59 };
    int gamesLeft = 65;
    int N = 11;
    assertEquals("............", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case72() {
    int[] wins = { 80, 78, 75, 78, 59, 72, 61, 77, 80, 74, 69, 63, 71, 63, 51, 63, 67, 73, 79, 70, 63, 69, 82, 56, 63, 79, 76, 61, 65, 78, 75 };
    int gamesLeft = 40;
    int N = 8;
    assertEquals("...............................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case73() {
    int[] wins = { 22, 23, 22, 31, 17, 19, 17, 16, 20, 22, 22, 17, 20, 23, 24, 22, 20 };
    int gamesLeft = 72;
    int N = 6;
    assertEquals(".................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case74() {
    int[] wins = { 97, 100, 65, 79, 93, 89, 92, 72, 100, 100, 88, 98, 85, 80, 88, 82 };
    int gamesLeft = 86;
    int N = 15;
    assertEquals("................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case75() {
    int[] wins = { 82, 88, 79, 82, 86, 78, 76, 83, 76, 76, 91, 76, 86, 76, 75, 84, 91, 73, 73, 79 };
    int gamesLeft = 95;
    int N = 7;
    assertEquals("....................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case76() {
    int[] wins = { 10, 9, 7, 12, 14, 12, 12, 11, 14, 9, 14, 11, 5, 7, 9, 15, 10, 12, 7, 6, 7, 13, 7, 5, 5, 14, 9, 8, 7, 11, 11, 8, 9, 9, 14, 15, 13, 12, 12, 11, 6, 14, 11, 5, 8 };
    int gamesLeft = 18;
    int N = 7;
    assertEquals(".............................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case77() {
    int[] wins = { 49, 43, 55, 62, 42, 46, 46, 57, 47, 48, 49, 49, 52, 49, 54, 46, 58, 67, 51, 65, 56, 54, 52, 54, 54, 59, 43, 48, 53, 37 };
    int gamesLeft = 49;
    int N = 15;
    assertEquals("..............................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case78() {
    int[] wins = { 62, 90, 83, 63, 69, 51, 73, 76, 64, 72, 69, 46, 57, 67, 86, 51, 63, 80, 81, 76, 73, 73, 74, 68, 72, 75, 72, 69, 68, 85, 62 };
    int gamesLeft = 98;
    int N = 21;
    assertEquals("...............................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case79() {
    int[] wins = { 87, 66, 77, 85, 59, 62, 74, 71, 87, 69, 61, 70, 74, 73, 75, 63, 66, 76, 73, 79, 61, 74, 73, 57, 62, 60, 76, 69, 75, 69, 64, 76, 60, 69, 72, 76, 66, 58, 82, 83, 67, 60, 74, 84, 70, 74, 45, 68, 68, 86 };
    int gamesLeft = 64;
    int N = 28;
    assertEquals("..................................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case80() {
    int[] wins = { 16, 14, 18, 23, 16, 12, 22, 16, 17, 14, 15, 19, 9, 13, 10, 13, 14, 17, 17, 19, 18, 12, 7, 13, 19, 8, 14, 15, 15 };
    int gamesLeft = 62;
    int N = 13;
    assertEquals(".............................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case81() {
    int[] wins = { 51, 55, 49, 52, 40, 52, 43, 54, 39, 50, 48, 53, 62, 49, 55, 43, 38 };
    int gamesLeft = 26;
    int N = 10;
    assertEquals(".................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case82() {
    int[] wins = { 38, 30, 27, 26, 31, 25, 34, 39, 34, 35, 39, 34, 24, 25 };
    int gamesLeft = 41;
    int N = 11;
    assertEquals("..............", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case83() {
    int[] wins = { 31, 32, 41, 31, 30, 26, 32, 34, 27, 36, 22, 21, 22, 36, 29, 26, 24, 31, 19, 27, 34, 28, 26, 26, 18, 29, 28, 28, 25, 28, 27, 27, 19, 28, 32 };
    int gamesLeft = 64;
    int N = 5;
    assertEquals("...................................", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case84() {
    int[] wins = { 27, 40, 33, 20, 40 };
    int gamesLeft = 20;
    int N = 2;
    assertEquals(".....", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case85() {
    int[] wins = { 10, 6, 5, 4, 3, 2 };
    int gamesLeft = 8;
    int N = 5;
    assertEquals("C.....", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case86() {
    int[] wins = { 44, 45, 45, 42, 48, 50, 48, 50, 46, 52, 57, 55, 50, 53, 52, 56, 43, 43, 54, 44, 53, 55, 45, 55, 49, 46, 48, 50, 46, 52, 48, 45, 57, 43, 43, 44, 49, 60, 52, 55, 51, 52, 52, 56, 50, 59, 49, 55, 47, 57 };
    int gamesLeft = 6;
    int N = 30;
    assertEquals("...E......CC...C.....C.C........C....C.C...C.C.C.C", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case87() {
    int[] wins = { 8, 2, 2 };
    int gamesLeft = 6;
    int N = 2;
    assertEquals("C..", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case88() {
    int[] wins = { 2, 1, 1, 1, 1, 0 };
    int gamesLeft = 1;
    int N = 2;
    assertEquals(".....E", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case89() {
    int[] wins = { 100, 98, 98, 98 };
    int gamesLeft = 2;
    int N = 3;
    assertEquals("C...", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case90() {
    int[] wins = { 6, 4, 4, 4 };
    int gamesLeft = 2;
    int N = 3;
    assertEquals("C...", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

  @Test
  public void case91() {
    int[] wins = { 50, 60, 60, 60, 100 };
    int gamesLeft = 10;
    int N = 2;
    assertEquals("E...C", mlbrecord.teamStatus(wins, gamesLeft, N));
  }

}
