package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class NewAlbumTest {
  NewAlbum newalbum = new NewAlbum();

  @Test
  public void case1() {
    int nSongs = 7;
    int length = 2;
    int cdCapacity = 6;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case2() {
    int nSongs = 20;
    int length = 1;
    int cdCapacity = 100;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case3() {
    int nSongs = 26;
    int length = 1;
    int cdCapacity = 100;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case4() {
    int nSongs = 26;
    int length = 3;
    int cdCapacity = 51;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case5() {
    int nSongs = 67;
    int length = 271;
    int cdCapacity = 1000;
    assertEquals(23, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case6() {
    int nSongs = 27;
    int length = 1;
    int cdCapacity = 27;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case7() {
    int nSongs = 63;
    int length = 1;
    int cdCapacity = 99;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case8() {
    int nSongs = 38;
    int length = 27;
    int cdCapacity = 705;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case9() {
    int nSongs = 61;
    int length = 12;
    int cdCapacity = 319;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case10() {
    int nSongs = 31;
    int length = 25;
    int cdCapacity = 483;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case11() {
    int nSongs = 75;
    int length = 5;
    int cdCapacity = 373;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case12() {
    int nSongs = 85;
    int length = 19;
    int cdCapacity = 923;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case13() {
    int nSongs = 90;
    int length = 19;
    int cdCapacity = 642;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case14() {
    int nSongs = 67;
    int length = 37;
    int cdCapacity = 712;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case15() {
    int nSongs = 63;
    int length = 30;
    int cdCapacity = 821;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case16() {
    int nSongs = 58;
    int length = 4;
    int cdCapacity = 163;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case17() {
    int nSongs = 48;
    int length = 20;
    int cdCapacity = 740;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case18() {
    int nSongs = 69;
    int length = 6;
    int cdCapacity = 304;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case19() {
    int nSongs = 74;
    int length = 9;
    int cdCapacity = 616;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case20() {
    int nSongs = 58;
    int length = 11;
    int cdCapacity = 390;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case21() {
    int nSongs = 97;
    int length = 20;
    int cdCapacity = 602;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case22() {
    int nSongs = 61;
    int length = 42;
    int cdCapacity = 701;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case23() {
    int nSongs = 54;
    int length = 13;
    int cdCapacity = 586;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case24() {
    int nSongs = 54;
    int length = 9;
    int cdCapacity = 279;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case25() {
    int nSongs = 77;
    int length = 50;
    int cdCapacity = 838;
    assertEquals(5, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case26() {
    int nSongs = 47;
    int length = 5;
    int cdCapacity = 102;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case27() {
    int nSongs = 28;
    int length = 59;
    int cdCapacity = 919;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case28() {
    int nSongs = 79;
    int length = 7;
    int cdCapacity = 175;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case29() {
    int nSongs = 29;
    int length = 50;
    int cdCapacity = 858;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case30() {
    int nSongs = 100;
    int length = 10000;
    int cdCapacity = 10000;
    assertEquals(100, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case31() {
    int nSongs = 100;
    int length = 1;
    int cdCapacity = 10000;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case32() {
    int nSongs = 79;
    int length = 89;
    int cdCapacity = 264;
    assertEquals(40, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case33() {
    int nSongs = 100;
    int length = 89;
    int cdCapacity = 582;
    assertEquals(17, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case34() {
    int nSongs = 100;
    int length = 657;
    int cdCapacity = 10000;
    assertEquals(7, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case35() {
    int nSongs = 100;
    int length = 687;
    int cdCapacity = 9572;
    assertEquals(9, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case36() {
    int nSongs = 100;
    int length = 10;
    int cdCapacity = 150;
    assertEquals(9, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case37() {
    int nSongs = 1;
    int length = 1;
    int cdCapacity = 1;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case38() {
    int nSongs = 1;
    int length = 1;
    int cdCapacity = 10000;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case39() {
    int nSongs = 1;
    int length = 10000;
    int cdCapacity = 10000;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case40() {
    int nSongs = 1;
    int length = 13;
    int cdCapacity = 13;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case41() {
    int nSongs = 1;
    int length = 12;
    int cdCapacity = 13;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case42() {
    int nSongs = 100;
    int length = 1;
    int cdCapacity = 27;
    assertEquals(8, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case43() {
    int nSongs = 88;
    int length = 1;
    int cdCapacity = 49;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case44() {
    int nSongs = 27;
    int length = 1;
    int cdCapacity = 27;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case45() {
    int nSongs = 67;
    int length = 271;
    int cdCapacity = 1000;
    assertEquals(23, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case46() {
    int nSongs = 43;
    int length = 2;
    int cdCapacity = 45;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case47() {
    int nSongs = 28;
    int length = 1;
    int cdCapacity = 29;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case48() {
    int nSongs = 40;
    int length = 1;
    int cdCapacity = 53;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case49() {
    int nSongs = 33;
    int length = 1;
    int cdCapacity = 40;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case50() {
    int nSongs = 67;
    int length = 1;
    int cdCapacity = 53;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case51() {
    int nSongs = 27;
    int length = 1;
    int cdCapacity = 28;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case52() {
    int nSongs = 58;
    int length = 1;
    int cdCapacity = 29;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case53() {
    int nSongs = 42;
    int length = 1;
    int cdCapacity = 27;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case54() {
    int nSongs = 88;
    int length = 11;
    int cdCapacity = 179;
    assertEquals(6, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case55() {
    int nSongs = 26;
    int length = 1;
    int cdCapacity = 100;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case56() {
    int nSongs = 43;
    int length = 2;
    int cdCapacity = 44;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case57() {
    int nSongs = 33;
    int length = 5;
    int cdCapacity = 120;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case58() {
    int nSongs = 2;
    int length = 2;
    int cdCapacity = 2;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case59() {
    int nSongs = 47;
    int length = 1;
    int cdCapacity = 33;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case60() {
    int nSongs = 76;
    int length = 1;
    int cdCapacity = 100;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case61() {
    int nSongs = 80;
    int length = 1;
    int cdCapacity = 81;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case62() {
    int nSongs = 28;
    int length = 1;
    int cdCapacity = 30;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case63() {
    int nSongs = 50;
    int length = 9;
    int cdCapacity = 99;
    assertEquals(5, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case64() {
    int nSongs = 13;
    int length = 1;
    int cdCapacity = 28;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case65() {
    int nSongs = 73;
    int length = 1;
    int cdCapacity = 60;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case66() {
    int nSongs = 43;
    int length = 1;
    int cdCapacity = 29;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case67() {
    int nSongs = 13;
    int length = 1;
    int cdCapacity = 1000;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case68() {
    int nSongs = 1;
    int length = 1;
    int cdCapacity = 1;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case69() {
    int nSongs = 27;
    int length = 1;
    int cdCapacity = 53;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case70() {
    int nSongs = 94;
    int length = 1;
    int cdCapacity = 53;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case71() {
    int nSongs = 53;
    int length = 1;
    int cdCapacity = 39;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case72() {
    int nSongs = 2;
    int length = 2;
    int cdCapacity = 5;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case73() {
    int nSongs = 30;
    int length = 1;
    int cdCapacity = 33;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case74() {
    int nSongs = 80;
    int length = 2;
    int cdCapacity = 80;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case75() {
    int nSongs = 100;
    int length = 3;
    int cdCapacity = 11;
    assertEquals(34, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case76() {
    int nSongs = 88;
    int length = 1;
    int cdCapacity = 29;
    assertEquals(6, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case77() {
    int nSongs = 13;
    int length = 1;
    int cdCapacity = 2000;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case78() {
    int nSongs = 28;
    int length = 4;
    int cdCapacity = 75;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case79() {
    int nSongs = 100;
    int length = 2;
    int cdCapacity = 2;
    assertEquals(100, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case80() {
    int nSongs = 97;
    int length = 9997;
    int cdCapacity = 9997;
    assertEquals(97, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case81() {
    int nSongs = 10;
    int length = 1;
    int cdCapacity = 19;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case82() {
    int nSongs = 53;
    int length = 1;
    int cdCapacity = 79;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case83() {
    int nSongs = 2;
    int length = 5;
    int cdCapacity = 11;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case84() {
    int nSongs = 54;
    int length = 1;
    int cdCapacity = 55;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case85() {
    int nSongs = 53;
    int length = 1;
    int cdCapacity = 40;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case86() {
    int nSongs = 55;
    int length = 1;
    int cdCapacity = 27;
    assertEquals(5, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case87() {
    int nSongs = 13;
    int length = 13;
    int cdCapacity = 13;
    assertEquals(13, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case88() {
    int nSongs = 2;
    int length = 10;
    int cdCapacity = 21;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case89() {
    int nSongs = 100;
    int length = 1;
    int cdCapacity = 5;
    assertEquals(34, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case90() {
    int nSongs = 3;
    int length = 5;
    int cdCapacity = 17;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case91() {
    int nSongs = 67;
    int length = 2;
    int cdCapacity = 80;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case92() {
    int nSongs = 2;
    int length = 1;
    int cdCapacity = 3;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case93() {
    int nSongs = 12;
    int length = 1;
    int cdCapacity = 23;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case94() {
    int nSongs = 80;
    int length = 1;
    int cdCapacity = 54;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case95() {
    int nSongs = 65;
    int length = 1288;
    int cdCapacity = 1687;
    assertEquals(65, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case96() {
    int nSongs = 58;
    int length = 562;
    int cdCapacity = 8666;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case97() {
    int nSongs = 1;
    int length = 5;
    int cdCapacity = 5;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case98() {
    int nSongs = 88;
    int length = 1;
    int cdCapacity = 51;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case99() {
    int nSongs = 29;
    int length = 4;
    int cdCapacity = 80;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case100() {
    int nSongs = 1;
    int length = 10;
    int cdCapacity = 10;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case101() {
    int nSongs = 4;
    int length = 1;
    int cdCapacity = 3;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case102() {
    int nSongs = 53;
    int length = 1;
    int cdCapacity = 53;
    assertEquals(3, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case103() {
    int nSongs = 1;
    int length = 13;
    int cdCapacity = 13;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case104() {
    int nSongs = 80;
    int length = 1;
    int cdCapacity = 52;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case105() {
    int nSongs = 28;
    int length = 20;
    int cdCapacity = 319;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case106() {
    int nSongs = 1;
    int length = 12;
    int cdCapacity = 12;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case107() {
    int nSongs = 3;
    int length = 1;
    int cdCapacity = 5;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case108() {
    int nSongs = 13;
    int length = 1;
    int cdCapacity = 100;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case109() {
    int nSongs = 80;
    int length = 10;
    int cdCapacity = 43;
    assertEquals(20, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case110() {
    int nSongs = 61;
    int length = 2;
    int cdCapacity = 48;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case111() {
    int nSongs = 88;
    int length = 1;
    int cdCapacity = 30;
    assertEquals(6, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case112() {
    int nSongs = 13;
    int length = 88;
    int cdCapacity = 6150;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case113() {
    int nSongs = 33;
    int length = 1;
    int cdCapacity = 39;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case114() {
    int nSongs = 41;
    int length = 1;
    int cdCapacity = 28;
    assertEquals(4, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case115() {
    int nSongs = 13;
    int length = 1;
    int cdCapacity = 5;
    assertEquals(5, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case116() {
    int nSongs = 40;
    int length = 1;
    int cdCapacity = 54;
    assertEquals(2, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

  @Test
  public void case117() {
    int nSongs = 5;
    int length = 1;
    int cdCapacity = 10;
    assertEquals(1, newalbum.leastAmountOfCDs(nSongs, length, cdCapacity));
  }

}
