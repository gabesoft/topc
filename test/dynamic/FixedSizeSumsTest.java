package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FixedSizeSumsTest {
  FixedSizeSums fixedsizesums = new FixedSizeSums();

  @Test
  public void case1() {
    int sum = 8;
    int count = 3;
    int index = 2;
    assertEquals("8=4+3+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case2() {
    int sum = 13;
    int count = 1;
    int index = 0;
    assertEquals("13=13", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case3() {
    int sum = 13;
    int count = 13;
    int index = 0;
    assertEquals("13=1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case4() {
    int sum = 7;
    int count = 10;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case5() {
    int sum = 17;
    int count = 2;
    int index = 4;
    assertEquals("17=12+5", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case6() {
    int sum = 140;
    int count = 17;
    int index = 87654321;
    assertEquals("140=40+31+15+15+9+7+4+4+2+2+2+2+2+2+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case7() {
    int sum = 150;
    int count = 23;
    int index = 1901740433;
    assertEquals("150=7+7+7+7+7+7+7+7+7+7+7+7+6+6+6+6+6+6+6+6+6+6+6", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case8() {
    int sum = 150;
    int count = 23;
    int index = 1903000047;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case9() {
    int sum = 150;
    int count = 22;
    int index = 1901740430;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case10() {
    int sum = 150;
    int count = 24;
    int index = 1765432109;
    assertEquals("150=17+17+16+14+12+12+11+9+9+7+7+2+2+2+2+2+2+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case11() {
    int sum = 148;
    int count = 40;
    int index = 470000000;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case12() {
    int sum = 1;
    int count = 1;
    int index = 0;
    assertEquals("1=1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case13() {
    int sum = 1;
    int count = 1;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case14() {
    int sum = 1;
    int count = 1;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case15() {
    int sum = 1;
    int count = 1;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case16() {
    int sum = 1;
    int count = 2;
    int index = 0;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case17() {
    int sum = 1;
    int count = 2;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case18() {
    int sum = 1;
    int count = 2;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case19() {
    int sum = 1;
    int count = 2;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case20() {
    int sum = 1;
    int count = 3;
    int index = 0;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case21() {
    int sum = 1;
    int count = 3;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case22() {
    int sum = 1;
    int count = 3;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case23() {
    int sum = 1;
    int count = 3;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case24() {
    int sum = 1;
    int count = 4;
    int index = 0;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case25() {
    int sum = 1;
    int count = 4;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case26() {
    int sum = 1;
    int count = 4;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case27() {
    int sum = 1;
    int count = 4;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case28() {
    int sum = 2;
    int count = 1;
    int index = 0;
    assertEquals("2=2", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case29() {
    int sum = 2;
    int count = 1;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case30() {
    int sum = 2;
    int count = 1;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case31() {
    int sum = 2;
    int count = 1;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case32() {
    int sum = 2;
    int count = 2;
    int index = 0;
    assertEquals("2=1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case33() {
    int sum = 2;
    int count = 2;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case34() {
    int sum = 2;
    int count = 2;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case35() {
    int sum = 2;
    int count = 2;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case36() {
    int sum = 2;
    int count = 3;
    int index = 0;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case37() {
    int sum = 2;
    int count = 3;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case38() {
    int sum = 2;
    int count = 3;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case39() {
    int sum = 2;
    int count = 3;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case40() {
    int sum = 2;
    int count = 4;
    int index = 0;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case41() {
    int sum = 2;
    int count = 4;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case42() {
    int sum = 2;
    int count = 4;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case43() {
    int sum = 2;
    int count = 4;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case44() {
    int sum = 3;
    int count = 1;
    int index = 0;
    assertEquals("3=3", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case45() {
    int sum = 3;
    int count = 1;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case46() {
    int sum = 3;
    int count = 1;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case47() {
    int sum = 3;
    int count = 1;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case48() {
    int sum = 3;
    int count = 2;
    int index = 0;
    assertEquals("3=2+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case49() {
    int sum = 3;
    int count = 2;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case50() {
    int sum = 3;
    int count = 2;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case51() {
    int sum = 3;
    int count = 2;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case52() {
    int sum = 3;
    int count = 3;
    int index = 0;
    assertEquals("3=1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case53() {
    int sum = 3;
    int count = 3;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case54() {
    int sum = 3;
    int count = 3;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case55() {
    int sum = 3;
    int count = 3;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case56() {
    int sum = 3;
    int count = 4;
    int index = 0;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case57() {
    int sum = 3;
    int count = 4;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case58() {
    int sum = 3;
    int count = 4;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case59() {
    int sum = 3;
    int count = 4;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case60() {
    int sum = 4;
    int count = 1;
    int index = 0;
    assertEquals("4=4", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case61() {
    int sum = 4;
    int count = 1;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case62() {
    int sum = 4;
    int count = 1;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case63() {
    int sum = 4;
    int count = 1;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case64() {
    int sum = 4;
    int count = 2;
    int index = 0;
    assertEquals("4=3+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case65() {
    int sum = 4;
    int count = 2;
    int index = 1;
    assertEquals("4=2+2", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case66() {
    int sum = 4;
    int count = 2;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case67() {
    int sum = 4;
    int count = 2;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case68() {
    int sum = 4;
    int count = 3;
    int index = 0;
    assertEquals("4=2+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case69() {
    int sum = 4;
    int count = 3;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case70() {
    int sum = 4;
    int count = 3;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case71() {
    int sum = 4;
    int count = 3;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case72() {
    int sum = 4;
    int count = 4;
    int index = 0;
    assertEquals("4=1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case73() {
    int sum = 4;
    int count = 4;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case74() {
    int sum = 4;
    int count = 4;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case75() {
    int sum = 4;
    int count = 4;
    int index = 3;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case76() {
    int sum = 147;
    int count = 1;
    int index = 0;
    assertEquals("147=147", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case77() {
    int sum = 147;
    int count = 1;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case78() {
    int sum = 147;
    int count = 1;
    int index = 2000000000;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case79() {
    int sum = 143;
    int count = 143;
    int index = 0;
    assertEquals("143=1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case80() {
    int sum = 143;
    int count = 143;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case81() {
    int sum = 143;
    int count = 142;
    int index = 0;
    assertEquals("143=2+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case82() {
    int sum = 143;
    int count = 142;
    int index = 1;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case83() {
    int sum = 143;
    int count = 141;
    int index = 0;
    assertEquals("143=3+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case84() {
    int sum = 143;
    int count = 141;
    int index = 1;
    assertEquals("143=2+2+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case85() {
    int sum = 143;
    int count = 141;
    int index = 2;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case86() {
    int sum = 73;
    int count = 16;
    int index = 123456;
    assertEquals("73=20+7+6+6+6+5+5+4+3+3+3+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case87() {
    int sum = 150;
    int count = 23;
    int index = 12;
    assertEquals("150=123+6+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case88() {
    int sum = 150;
    int count = 23;
    int index = 123;
    assertEquals("150=118+5+3+2+2+2+2+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case89() {
    int sum = 150;
    int count = 12;
    int index = 1234;
    assertEquals("150=121+10+10+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case90() {
    int sum = 150;
    int count = 23;
    int index = 12345;
    assertEquals("150=101+13+5+5+5+2+2+2+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case91() {
    int sum = 150;
    int count = 24;
    int index = 123456;
    assertEquals("150=89+17+9+4+2+2+2+2+2+2+2+2+2+2+2+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case92() {
    int sum = 150;
    int count = 23;
    int index = 1234567;
    assertEquals("150=77+28+9+8+6+4+2+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case93() {
    int sum = 50;
    int count = 150;
    int index = 987654321;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case94() {
    int sum = 150;
    int count = 150;
    int index = 987654321;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case95() {
    int sum = 150;
    int count = 23;
    int index = 87654321;
    assertEquals("150=48+27+13+13+7+4+4+4+4+3+3+3+3+3+2+2+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case96() {
    int sum = 150;
    int count = 25;
    int index = 234567890;
    assertEquals("150=39+23+12+10+6+5+5+4+4+4+4+4+4+4+4+4+3+3+2+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case97() {
    int sum = 113;
    int count = 17;
    int index = 643523;
    assertEquals("113=49+24+5+4+4+4+4+4+3+3+3+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case98() {
    int sum = 113;
    int count = 65;
    int index = 3253265;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case99() {
    int sum = 147;
    int count = 2;
    int index = 35;
    assertEquals("147=111+36", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case100() {
    int sum = 140;
    int count = 17;
    int index = 87654321;
    assertEquals("140=40+31+15+15+9+7+4+4+2+2+2+2+2+2+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case101() {
    int sum = 150;
    int count = 25;
    int index = 2000000000;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case102() {
    int sum = 150;
    int count = 20;
    int index = 1003;
    assertEquals("150=114+9+4+3+3+2+2+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case103() {
    int sum = 147;
    int count = 37;
    int index = 123456789;
    assertEquals("147=30+20+15+15+11+6+6+4+4+4+3+2+2+2+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case104() {
    int sum = 141;
    int count = 13;
    int index = 87653321;
    assertEquals("141=37+21+17+16+15+10+7+5+4+4+2+2+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case105() {
    int sum = 150;
    int count = 77;
    int index = 1089;
    assertEquals("150=57+7+3+3+3+2+2+2+2+2+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case106() {
    int sum = 150;
    int count = 50;
    int index = 10000;
    assertEquals("150=75+11+9+7+2+2+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case107() {
    int sum = 150;
    int count = 50;
    int index = 1000000;
    assertEquals("150=52+14+10+8+5+4+3+2+2+2+2+2+2+2+2+2+2+2+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case108() {
    int sum = 141;
    int count = 13;
    int index = 87653021;
    assertEquals("141=37+21+17+16+15+12+5+3+3+3+3+3+3", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case109() {
    int sum = 150;
    int count = 17;
    int index = 90000000;
    assertEquals("150=50+27+14+13+5+5+5+5+5+5+4+2+2+2+2+2+2", fixedsizesums.kthElement(sum, count, index));
  }

  @Test
  public void case110() {
    int sum = 150;
    int count = 150;
    int index = 2000000000;
    assertEquals("", fixedsizesums.kthElement(sum, count, index));
  }

}
