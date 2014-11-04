package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TheBrickTowerHardDivTwoTest {
  TheBrickTowerHardDivTwo thebricktowerharddivtwo = new TheBrickTowerHardDivTwo();

  @Test
  public void case1() {
    int C = 2;
    int K = 0;
    int H = 2;
    assertEquals(4, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case2() {
    int C = 1;
    int K = 7;
    int H = 19;
    assertEquals(1, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case3() {
    int C = 2;
    int K = 3;
    int H = 1;
    assertEquals(14, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case4() {
    int C = 4;
    int K = 7;
    int H = 47;
    assertEquals(1008981254, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case5() {
    int C = 1;
    int K = 3;
    int H = 19;
    assertEquals(0, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case6() {
    int C = 3;
    int K = 6;
    int H = 26;
    assertEquals(63744861, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case7() {
    int C = 1;
    int K = 5;
    int H = 15;
    assertEquals(1, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case8() {
    int C = 4;
    int K = 2;
    int H = 42;
    assertEquals(546398371, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case9() {
    int C = 1;
    int K = 0;
    int H = 32;
    assertEquals(0, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case10() {
    int C = 4;
    int K = 2;
    int H = 19;
    assertEquals(948231878, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case11() {
    int C = 4;
    int K = 5;
    int H = 12;
    assertEquals(867619386, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case12() {
    int C = 1;
    int K = 3;
    int H = 43;
    assertEquals(0, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case13() {
    int C = 3;
    int K = 6;
    int H = 15;
    assertEquals(198242641, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case14() {
    int C = 1;
    int K = 5;
    int H = 33;
    assertEquals(1, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case15() {
    int C = 1;
    int K = 3;
    int H = 11;
    assertEquals(0, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case16() {
    int C = 2;
    int K = 6;
    int H = 24;
    assertEquals(16094, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case17() {
    int C = 1;
    int K = 4;
    int H = 15;
    assertEquals(1, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case18() {
    int C = 1;
    int K = 4;
    int H = 43;
    assertEquals(1, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case19() {
    int C = 3;
    int K = 1;
    int H = 10;
    assertEquals(1220741998, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case20() {
    int C = 2;
    int K = 4;
    int H = 39;
    assertEquals(8426, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case21() {
    int C = 4;
    int K = 6;
    int H = 45;
    assertEquals(675895602, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case22() {
    int C = 3;
    int K = 4;
    int H = 44;
    assertEquals(1175696211, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case23() {
    int C = 4;
    int K = 6;
    int H = 46;
    assertEquals(133331749, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case24() {
    int C = 4;
    int K = 5;
    int H = 44;
    assertEquals(485822408, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case25() {
    int C = 4;
    int K = 2;
    int H = 4;
    assertEquals(80001192, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case26() {
    int C = 4;
    int K = 0;
    int H = 8;
    assertEquals(978491432, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case27() {
    int C = 4;
    int K = 2;
    int H = 9;
    assertEquals(752462956, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case28() {
    int C = 4;
    int K = 5;
    int H = 1;
    assertEquals(256, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case29() {
    int C = 4;
    int K = 3;
    int H = 17;
    assertEquals(577534162, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case30() {
    int C = 4;
    int K = 6;
    int H = 6;
    assertEquals(941725416, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case31() {
    int C = 4;
    int K = 7;
    int H = 47;
    assertEquals(1008981254, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case32() {
    int C = 4;
    int K = 0;
    int H = 47;
    assertEquals(699527058, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case33() {
    int C = 4;
    int K = 0;
    int H = 10;
    assertEquals(864059624, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case34() {
    int C = 1;
    int K = 0;
    int H = 23;
    assertEquals(0, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case35() {
    int C = 4;
    int K = 0;
    int H = 12;
    assertEquals(294638799, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case36() {
    int C = 4;
    int K = 0;
    int H = 21;
    assertEquals(160339243, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case37() {
    int C = 1;
    int K = 0;
    int H = 19;
    assertEquals(0, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case38() {
    int C = 3;
    int K = 0;
    int H = 26;
    assertEquals(1122838812, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case39() {
    int C = 1;
    int K = 0;
    int H = 29;
    assertEquals(0, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case40() {
    int C = 1;
    int K = 0;
    int H = 34;
    assertEquals(0, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case41() {
    int C = 2;
    int K = 2;
    int H = 8;
    assertEquals(28, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case42() {
    int C = 1;
    int K = 0;
    int H = 23;
    assertEquals(0, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case43() {
    int C = 2;
    int K = 2;
    int H = 6;
    assertEquals(24, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case44() {
    int C = 2;
    int K = 5;
    int H = 21;
    assertEquals(3304, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case45() {
    int C = 1;
    int K = 3;
    int H = 7;
    assertEquals(0, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case46() {
    int C = 1;
    int K = 6;
    int H = 4;
    assertEquals(1, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case47() {
    int C = 1;
    int K = 5;
    int H = 7;
    assertEquals(1, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case48() {
    int C = 4;
    int K = 6;
    int H = 47;
    assertEquals(240414241, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case49() {
    int C = 4;
    int K = 5;
    int H = 47;
    assertEquals(734623669, thebricktowerharddivtwo.find(C, K, H));
  }

  @Test
  public void case50() {
    int C = 4;
    int K = 7;
    int H = 46;
    assertEquals(1064072547, thebricktowerharddivtwo.find(C, K, H));
  }

}
