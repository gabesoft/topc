package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class DancingCouplesTest {
  DancingCouples dancingcouples = new DancingCouples();

  @Test
  public void case1() {
    String[] canDance = { "YYYY", "YYYY", "YYYY" };
    int K = 3;
    assertEquals(24, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case2() {
    String[] canDance = { "YYNN", "NYYN", "NNYY" };
    int K = 3;
    assertEquals(4, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case3() {
    String[] canDance = { "YY", "YY", "YY" };
    int K = 3;
    assertEquals(0, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case4() {
    String[] canDance = { "YYNNNN", "NYYNNN", "NNYYNN", "NNNYYN", "NNNNYY", "YNNNNY" };
    int K = 3;
    assertEquals(112, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case5() {
    String[] canDance = { "Y" };
    int K = 1;
    assertEquals(1, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case6() {
    String[] canDance = { "Y" };
    int K = 3;
    assertEquals(0, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case7() {
    String[] canDance = { "N" };
    int K = 1;
    assertEquals(0, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case8() {
    String[] canDance = { "N" };
    int K = 5;
    assertEquals(0, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case9() {
    String[] canDance = { "YY" };
    int K = 1;
    assertEquals(2, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case10() {
    String[] canDance = { "NY" };
    int K = 1;
    assertEquals(1, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case11() {
    String[] canDance = { "NY" };
    int K = 2;
    assertEquals(0, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case12() {
    String[] canDance = { "YYNNY" };
    int K = 1;
    assertEquals(3, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case13() {
    String[] canDance = { "YYYYYYYYYY" };
    int K = 1;
    assertEquals(10, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case14() {
    String[] canDance = { "YNYYYNNYYY" };
    int K = 1;
    assertEquals(7, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case15() {
    String[] canDance = { "N", "Y" };
    int K = 1;
    assertEquals(1, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case16() {
    String[] canDance = { "N", "Y", "Y" };
    int K = 1;
    assertEquals(2, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case17() {
    String[] canDance = { "N", "Y", "Y" };
    int K = 2;
    assertEquals(0, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case18() {
    String[] canDance = { "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y" };
    int K = 1;
    assertEquals(10, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case19() {
    String[] canDance = { "Y", "Y", "N", "N", "Y", "Y", "Y", "N", "Y", "Y" };
    int K = 1;
    assertEquals(7, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case20() {
    String[] canDance = { "YYNNNNNNNN", "NYYNNNNNNN", "NNYYNNNNNN", "NNNYYNNNNN", "NNNNYYNNNN", "NNNNNYYNNN", "NNNNNNYYNN", "NNNNNNNYYN", "NNNNNNNNYY", "YNNNNNNNNY" };
    int K = 1;
    assertEquals(20, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case21() {
    String[] canDance = { "YYNNNNNNNN", "NYYNNNNNNN", "NNYYNNNNNN", "NNNYYNNNNN", "NNNNYYNNNN", "NNNNNYYNNN", "NNNNNNYYNN", "NNNNNNNYYN", "NNNNNNNNYY", "YNNNNNNNNY" };
    int K = 3;
    assertEquals(800, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case22() {
    String[] canDance = { "YYNNNNNNNN", "NYYNNNNNNN", "NNYYNNNNNN", "NNNYYNNNNN", "NNNNYYNNNN", "NNNNNYYNNN", "NNNNNNYYNN", "NNNNNNNYYN", "NNNNNNNNYY", "YNNNNNNNNY" };
    int K = 6;
    assertEquals(4290, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case23() {
    String[] canDance = { "YYNNNNNNNN", "NYYNNNNNNN", "NNYYNNNNNN", "NNNYYNNNNN", "NNNNYYNNNN", "NNNNNYYNNN", "NNNNNNYYNN", "NNNNNNNYYN", "NNNNNNNNYY", "YNNNNNNNNY" };
    int K = 8;
    assertEquals(825, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case24() {
    String[] canDance = { "YYNNNNNNNN", "NYYNNNNNNN", "NNYYNNNNNN", "NNNYYNNNNN", "NNNNYYNNNN", "NNNNNYYNNN", "NNNNNNYYNN", "NNNNNNNYYN", "NNNNNNNNYY", "YNNNNNNNNY" };
    int K = 10;
    assertEquals(2, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case25() {
    String[] canDance = { "YYNYYNNNYN", "NYYYNNYNYN", "NNYYYNYNNY", "NYNYYNNYNY", "NNNYYYNYYN", "NYYNYYYNNN", "NNYNYNYYYN", "YNNYYNNYYN", "NYNNYNYNYY", "YYYNNNYNNY" };
    int K = 1;
    assertEquals(50, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case26() {
    String[] canDance = { "YYNNNYYNYN", "NYYNNYYYNN", "YNYYNYNNNY", "YYNYYNYNNN", "YNYNYYNNYN", "NNYYYYYNNN", "NYNYNYYYNN", "NNNYNYNYYY", "NNNNYYNYYY", "YYYNNYNNNY" };
    int K = 3;
    assertEquals(10900, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case27() {
    String[] canDance = { "YYNNNYYNNY", "YYYYNNYNNN", "NYYYNNNYNY", "NYNYYYNNYN", "NYNNYYYNYN", "YNYNYYYNNN", "YNYNNNYYYN", "NYNYNNYYYN", "NNYNNYYNYY", "YNYNNYNYNY" };
    int K = 5;
    assertEquals(251268, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case28() {
    String[] canDance = { "YYNYNNNNYY", "YYYYNNNYNN", "NNYYYYNYNN", "YNNYYNYNYN", "NYYNYYNNYN", "NNYNNYYYNY", "NNNNYYYYNY", "NNNYYNYYYN", "NYNYNNNYYY", "YNYNYYNNNY" };
    int K = 7;
    assertEquals(683782, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case29() {
    String[] canDance = { "YYNYYNNNYN", "NYYYNNNYYN", "NNYYYYNNNY", "YNYYYNNYNN", "YNNNYYYNNY", "YYNNNYYNYN", "YNNYNNYYYN", "NYNNYNYYYN", "YNYNNNNYYY", "YYNYYNNNNY" };
    int K = 10;
    assertEquals(4410, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case30() {
    String[] canDance = { "YYYYNYYYYN", "YYYYNYYYNY", "YYNYYNYYYY", "YYYNYYYYYN", "YYNYNYYYYY", "YYYYYYYYNN", "YYNYYNYYYY", "YYYYNYYYNY", "YYYYNNYYYY", "YNYYYYYYYN" };
    int K = 1;
    assertEquals(80, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case31() {
    String[] canDance = { "YYNYYYYNYY", "YYYYYYYNNY", "YYNYYYNYYY", "YYYYYNYYYN", "YYNYNYYYYY", "YYYYYYNYYN", "YYYYYNYNYY", "YNYYYYYYNY", "YYYYYNYYNY", "NNYYYYYYYY" };
    int K = 2;
    assertEquals(2595, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case32() {
    String[] canDance = { "YYYNYYYNYY", "YNYYYYYNYY", "YYYYYNYYYN", "NYYYNYYYYY", "YNYYNYYYYY", "YYYYYNYYYN", "YYNYNYYYYY", "YNYNYYYYYY", "YYYYYNNYYY", "NYYYYYNYYY" };
    int K = 3;
    assertEquals(44442, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case33() {
    String[] canDance = { "YYNYYYYNYY", "YYYNYYNYYY", "YNYYYYYYNY", "NYNYYYYYYY", "YYYNYYYYYN", "YYYNNYYYYY", "YNYYYYYYNY", "YYNYYNYYYY", "YYYYYYNYYN", "NYYYYYYYNY" };
    int K = 4;
    assertEquals(438439, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case34() {
    String[] canDance = { "YYYYYYNYNY", "YYYYYYYYNN", "YYYYNYYYYN", "YYYYNYNYYY", "YYYNYYYYYN", "YYYNYYYYNY", "YYNYYYYYYN", "YNYYYYYYNY", "NYYYYYYYYN", "YNYYYYNYYY" };
    int K = 5;
    assertEquals(2459880, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case35() {
    String[] canDance = { "YYYNYNYYYY", "YNNYYYYYYY", "YNNYYYYYYY", "YYYYYYNNYY", "YYYYNYYYYN", "YYNYYYNYYY", "YYYYYNNYYY", "NYNYYYYYYY", "YNNYYYYYYY", "YYYNYYNYYY" };
    int K = 6;
    assertEquals(8174829, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case36() {
    String[] canDance = { "YYYYNYYYYN", "YNYYYYYYNY", "YYYNYYYNYY", "NYYYYYYNYY", "YYYYNNYYYY", "NYYNYYYYYY", "YYYYYNNYYY", "YYYYNNYYYY", "YNYYNYYYYY", "YNYYYYYNYY" };
    int K = 7;
    assertEquals(15365766, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case37() {
    String[] canDance = { "NYNYYYYYYY", "YYYYNYYYNY", "YNYNYYYYYY", "YYYYYNYNYY", "YYYNYYYYYN", "NNYYYYYYYY", "YNYNYYYYYY", "YNYYYYNYYY", "YYYYYYNNYY", "NYYYNYYYYY" };
    int K = 8;
    assertEquals(14101790, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case38() {
    String[] canDance = { "NYNYYYYYYY", "YYYYNYYYYN", "NYYYYYYNYY", "YYNYNYYYYY", "YYYYYYNYNY", "NYNYYYYYYY", "YYNYYYNYYY", "NYYYYYYNYY", "YNYYYNYYYY", "YYYNYYYYYN" };
    int K = 9;
    assertEquals(4972428, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case39() {
    String[] canDance = { "YYYYYNNYYY", "YYYYNYYYNY", "YYYYYNYYNY", "YNYYYNYYYY", "YYYYNNYYYY", "YYYYYYYNNY", "YYYYNYYYYN", "YYYNYYYNYY", "NYYNYYYYYY", "YYYYYYYNNY" };
    int K = 10;
    assertEquals(385314, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case40() {
    String[] canDance = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
    int K = 1;
    assertEquals(100, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case41() {
    String[] canDance = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
    int K = 2;
    assertEquals(4050, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case42() {
    String[] canDance = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
    int K = 8;
    assertEquals(81648000, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case43() {
    String[] canDance = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
    int K = 9;
    assertEquals(36288000, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case44() {
    String[] canDance = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
    int K = 10;
    assertEquals(3628800, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case45() {
    String[] canDance = { "YNYNYYYNYY", "NNYYYNNYYY", "NYNNNYYYYY", "YYYYYNNYYN", "YYNNYYNNYY", "YNYYYYYYNY", "YYYYYYYYYY" };
    int K = 5;
    assertEquals(115958, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case46() {
    String[] canDance = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
    int K = 10;
    assertEquals(3628800, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case47() {
    String[] canDance = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
    int K = 5;
    assertEquals(7620480, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case48() {
    String[] canDance = { "YYNNNN", "NYYNNN", "NNYYNN", "NNNYYN", "NNNNYY", "YNNNNY" };
    int K = 3;
    assertEquals(112, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case49() {
    String[] canDance = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYNYYY", "YYYYYYYYNY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
    int K = 8;
    assertEquals(69148800, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case50() {
    String[] canDance = { "YYYY", "YYYY", "YYYY" };
    int K = 3;
    assertEquals(24, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case51() {
    String[] canDance = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
    int K = 8;
    assertEquals(81648000, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case52() {
    String[] canDance = { "YYYYYYYYYY", "NYYYYYYYYY", "YNYYYYYYYY", "YYNYYYYYYY", "YYYNYYYYYY", "YYYYNYYYYY", "YYYYYNYYYY", "YYYYYYNYYY", "YYYYYYYNYY", "YYYYYYYYNY" };
    int K = 9;
    assertEquals(16019531, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case53() {
    String[] canDance = { "YYY", "YYY", "YYY" };
    int K = 10;
    assertEquals(0, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case54() {
    String[] canDance = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
    int K = 4;
    assertEquals(1058400, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case55() {
    String[] canDance = { "Y" };
    int K = 3;
    assertEquals(0, dancingcouples.countPairs(canDance, K));
  }

  @Test
  public void case56() {
    String[] canDance = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
    int K = 9;
    assertEquals(36288000, dancingcouples.countPairs(canDance, K));
  }

}
