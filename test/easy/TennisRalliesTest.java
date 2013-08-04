package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TennisRalliesTest {
  TennisRallies tennisrallies = new TennisRallies();

  @Test
  public void case1() {
    int numLength = 3;
    String[] forbidden = { "cc", "dd" };
    int allowed = 1;
    assertEquals(2, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case2() {
    int numLength = 10;
    String[] forbidden = { "c" };
    int allowed = 1;
    assertEquals(1, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case3() {
    int numLength = 10;
    String[] forbidden = { "c" };
    int allowed = 2;
    assertEquals(11, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case4() {
    int numLength = 18;
    String[] forbidden = { "c", "d" };
    int allowed = 1;
    assertEquals(0, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case5() {
    int numLength = 18;
    String[] forbidden = { "c", "cc", "ccc", "cccc", "ccccc", "cccccc", "ccccccc", "cccccccc", "ccccccccc", "cccccccccc" };
    int allowed = 20;
    assertEquals(185406, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case6() {
    int numLength = 18;
    String[] forbidden = { "ccccccccccc", "cccccccccccc", "ccccccccccccc", "cccccccccccccc", "ccccccccccccccc", "cccccccccccccccc", "ccccccccccccccccc", "cccccccccccccccccc" };
    int allowed = 100;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case7() {
    int numLength = 18;
    String[] forbidden = {  };
    int allowed = 1;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case8() {
    int numLength = 18;
    String[] forbidden = { "c", "cc", "ccc", "cccc", "ccccc", "cccccc", "ccccccc", "cccccccc", "ccccccccc", "cccccccccc" };
    int allowed = 100;
    assertEquals(262122, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case9() {
    int numLength = 18;
    String[] forbidden = { "dcccc", "cdcdc", "dcdcc", "dccdc", "ddcdd", "cccdd", "dcccd", "dcdcd", "cddcd", "dccdd" };
    int allowed = 100;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case10() {
    int numLength = 18;
    String[] forbidden = { "c", "d", "cc", "cd", "dd", "dc", "ccc", "ccd", "cdc", "cdd" };
    int allowed = 40;
    assertEquals(10068, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case11() {
    int numLength = 17;
    String[] forbidden = { "cdccdddccddcdcd", "ccdcddcd", "cddcddddccdcc", "cddddcdcddcdccddd", "dddddc", "d", "ddddccdcdc", "dcdccccdddc", "dddccddccc", "dc" };
    int allowed = 25;
    assertEquals(131072, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case12() {
    int numLength = 15;
    String[] forbidden = { "ddcdddddccc", "d", "cdccc", "dddddcdcdddcddcd", "ddccdcd", "dcddddcccccddcdd", "ccdcdc", "dccd", "cccccddd", "dddddc" };
    int allowed = 24;
    assertEquals(32768, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case13() {
    int numLength = 14;
    String[] forbidden = { "dccccdddddcd", "dddddcccdccd", "cdddcdcccdcdcddd", "dd", "dcccccdddcd", "cccddcc", "dddcccdcddcdccccdd" };
    int allowed = 9;
    assertEquals(16209, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case14() {
    int numLength = 17;
    String[] forbidden = { "cddcdddcdc", "ccdcc" };
    int allowed = 20;
    assertEquals(131072, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case15() {
    int numLength = 18;
    String[] forbidden = { "ddcdcdcdcdddccd", "ccdccdcdcddcdd", "cdcdccccdcd", "cdcdddcddcdcd", "dddddcdccdcdd", "ccdcccccddc", "cdc", "cccccdcdccddcddcc", "dcc" };
    int allowed = 27;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case16() {
    int numLength = 17;
    String[] forbidden = { "ddddccccddccdccd", "dcdcdcdddddcddd" };
    int allowed = 26;
    assertEquals(131072, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case17() {
    int numLength = 17;
    String[] forbidden = { "cddddcd", "ddccddddcdd", "cddcdcddddc", "ddccdccccddcddccc", "d", "dddddccdcdcdcddddd", "ccd", "dcddccdccdcdddccd", "dcddccdcccdddcc", "dcccdcccdd" };
    int allowed = 3;
    assertEquals(22, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case18() {
    int numLength = 18;
    String[] forbidden = { "dcddc", "dccdccdcc", "ccccd", "cccdcdcc", "dddccccdddd", "cdc", "dccdcdcddc" };
    int allowed = 29;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case19() {
    int numLength = 16;
    String[] forbidden = { "cdcdcdcddddcddddcd", "dddd", "dcdccccddc", "cdccccd", "dcd", "c", "dcccddcccdcddc", "ccd", "dcdcddcccddccdcd", "cddddcdd" };
    int allowed = 16;
    assertEquals(63679, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case20() {
    int numLength = 18;
    String[] forbidden = { "ddcccdc", "ccddccdcdcc", "dccccdddcdcccccdc" };
    int allowed = 2;
    assertEquals(261898, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case21() {
    int numLength = 15;
    String[] forbidden = { "dcdcccc", "dccccccc", "ccddcdcccdcddd", "dcc", "ccccdd" };
    int allowed = 9;
    assertEquals(32768, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case22() {
    int numLength = 17;
    String[] forbidden = { "dcdccd", "ccdcd", "ccd", "dcdccddddd" };
    int allowed = 9;
    assertEquals(131072, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case23() {
    int numLength = 18;
    String[] forbidden = { "dcc", "ddcddcdcdcccdddccd", "ccccddd", "cccddccdcdccc", "dddccdccdcdc", "dddddddcddccdddd", "dcdcdcdc", "ccccdd" };
    int allowed = 3;
    assertEquals(149897, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case24() {
    int numLength = 14;
    String[] forbidden = { "dccccddcccdc", "cd", "cddcddd", "dccdcdccccc", "ddccd", "cccdccccdc", "dddddccd", "ddcccdd" };
    int allowed = 5;
    assertEquals(12273, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case25() {
    int numLength = 14;
    String[] forbidden = {  };
    int allowed = 22;
    assertEquals(16384, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case26() {
    int numLength = 15;
    String[] forbidden = {  };
    int allowed = 24;
    assertEquals(32768, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case27() {
    int numLength = 18;
    String[] forbidden = { "dccccccc", "dcdcccddcdcdddcc", "cdddccccd", "dddccddd", "cdddccdcccdddddddc", "dddccddcc" };
    int allowed = 2;
    assertEquals(261212, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case28() {
    int numLength = 17;
    String[] forbidden = { "dd", "c", "ddcddcccccddcdd", "ddddccdcc", "dddccccd", "ccddcddccddccccdc", "cdddddcccdcccdcccc", "ddcccdddccc" };
    int allowed = 22;
    assertEquals(131072, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case29() {
    int numLength = 14;
    String[] forbidden = { "dddddccc", "ccd", "ccccddcdccdccd", "dcdcddccccdcccdc", "dddccc", "cdddddcd", "c", "dcdccdcccdcddc", "ccdddcdddcdccd", "d" };
    int allowed = 13;
    assertEquals(0, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case30() {
    int numLength = 14;
    String[] forbidden = { "ddddcddddccdddd", "ddcddd" };
    int allowed = 18;
    assertEquals(16384, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case31() {
    int numLength = 17;
    String[] forbidden = { "cddccdddcddcccdddc", "cdddcd", "cdccc" };
    int allowed = 23;
    assertEquals(131072, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case32() {
    int numLength = 18;
    String[] forbidden = { "d", "cdcdccdcdcdddcdddc", "dddcc", "dcdddccc", "cdddddddcccd", "ddd", "ddcddccdcdc", "ddcc", "dcd" };
    int allowed = 4;
    assertEquals(563, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case33() {
    int numLength = 14;
    String[] forbidden = { "ccddddccc", "cdc", "dccdcdcc", "d", "dccccccddcdcd", "dcddddc" };
    int allowed = 29;
    assertEquals(16384, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case34() {
    int numLength = 17;
    String[] forbidden = { "cdddccccddddc", "cccccccccddccddd", "dcdccdccccdcccd", "ccddcddcdccccc", "cccdccdcccddddd", "ddcddccccddddcddd", "d", "dccdcdcdddcdcd", "dddddddccd", "ccdcdddcccddddcd" };
    int allowed = 3;
    assertEquals(154, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case35() {
    int numLength = 14;
    String[] forbidden = { "c", "dddcc", "cc", "dddcdddcddddcccccd", "dcddddcdccdddccdcd", "cddcddddccccdcddcc", "ccccdcd", "dd" };
    int allowed = 17;
    assertEquals(13551, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case36() {
    int numLength = 18;
    String[] forbidden = {  };
    int allowed = 25;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case37() {
    int numLength = 15;
    String[] forbidden = {  };
    int allowed = 3;
    assertEquals(32768, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case38() {
    int numLength = 17;
    String[] forbidden = { "cccc", "d", "cdcdcdddcddd", "dccdccccccccc" };
    int allowed = 9;
    assertEquals(39828, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case39() {
    int numLength = 16;
    String[] forbidden = { "dcdddd", "cdcdddcdcddcdccdc", "ddddcccc", "cdddcccddc", "ddcddddcdcccdddcd", "cdcd", "ddcddcdddddcddddc", "cddcdd", "cddcc", "ddccd" };
    int allowed = 27;
    assertEquals(65536, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case40() {
    int numLength = 14;
    String[] forbidden = { "dd", "ccccdccdcdcccccccd", "dcddddcdcd", "dddddcddcdccdcd", "ccccdccddcdcd", "ddcdd", "dccdcdccccdcddcc", "dcccd", "dccdcddccdcddcddc" };
    int allowed = 3;
    assertEquals(4936, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case41() {
    int numLength = 15;
    String[] forbidden = {  };
    int allowed = 18;
    assertEquals(32768, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case42() {
    int numLength = 18;
    String[] forbidden = { "ccc", "dcdd", "dccccd", "ccccdddccdddcdd", "ddccddcccddcdcccdc", "ddddccddddd", "cdd", "dcddccdddccccd" };
    int allowed = 22;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case43() {
    int numLength = 15;
    String[] forbidden = { "ddcdcddcc", "dccdcdcdccccdccccd", "dc", "ccccddcdddcdcddd", "d", "cdcddcdccdcc", "cccccddcdddd", "ddcdcc", "dddcd", "cccdc" };
    int allowed = 7;
    assertEquals(569, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case44() {
    int numLength = 18;
    String[] forbidden = { "ddc" };
    int allowed = 7;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case45() {
    int numLength = 16;
    String[] forbidden = {  };
    int allowed = 13;
    assertEquals(65536, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case46() {
    int numLength = 17;
    String[] forbidden = { "cdddc", "ddcdddcdcddcdcddcc", "dcd", "dddcdcccdcccddc" };
    int allowed = 8;
    assertEquals(131051, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case47() {
    int numLength = 17;
    String[] forbidden = { "ccddd", "ddccdddcdd", "d" };
    int allowed = 30;
    assertEquals(131072, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case48() {
    int numLength = 16;
    String[] forbidden = { "dddddcccddd", "d", "cddcddccdc" };
    int allowed = 15;
    assertEquals(65519, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case49() {
    int numLength = 15;
    String[] forbidden = { "dccdcdccdccccdc", "cdcdccdd", "dddcc", "cdcdddcdddcddc", "dcddc", "cccccdcddcc", "ddcddd", "ddcdddcdcdddccdd", "ddccccdddc" };
    int allowed = 15;
    assertEquals(32768, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case50() {
    int numLength = 16;
    String[] forbidden = { "ddd", "cddddcdc", "dcddcdcddcdddd", "dcdccdcdccdc", "dddccddcdddddddcdd", "cdddddccdcdcdccccd", "ccdddcdd", "dccdcddc" };
    int allowed = 5;
    assertEquals(59703, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case51() {
    int numLength = 17;
    String[] forbidden = { "dccdddcdd", "c", "ddccdddcdcdcccc", "ddcdcdcdddddd" };
    int allowed = 11;
    assertEquals(109219, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case52() {
    int numLength = 18;
    String[] forbidden = { "ddccddddcdd", "dccd", "dd", "ddddddcdddcccdcd", "cddcddcccdcddcdcd", "dcdddcdc", "cccddcddcccd", "dddcd", "ddd", "ccccddcdd" };
    int allowed = 27;
    assertEquals(262075, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case53() {
    int numLength = 16;
    String[] forbidden = { "ddcddddcccddcdccd", "cdc", "cccc", "ddcddcdddddccdddc", "ccdcdddccdc" };
    int allowed = 17;
    assertEquals(65536, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case54() {
    int numLength = 16;
    String[] forbidden = { "ccccddcccddccc", "cdccdddcccdddc", "dcdddd", "dcccdddcdcd", "ccccdcddd", "ddddddccccccc" };
    int allowed = 9;
    assertEquals(65536, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case55() {
    int numLength = 18;
    String[] forbidden = { "ddddc", "cddccddcdddcc", "cddcccccddddcddccd", "dcdcddd" };
    int allowed = 5;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case56() {
    int numLength = 18;
    String[] forbidden = { "ccdccc", "dddccdddcdcdcc", "dccccdccc", "ddddc", "dddcccccdcd", "cdddddcdccdc", "dccccdcdccddddcdd", "cccdc", "dcddcdc", "dcdc" };
    int allowed = 6;
    assertEquals(259998, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case57() {
    int numLength = 16;
    String[] forbidden = { "ddcdccdccdcdc", "d", "cdcdccccccdcddc", "dcdcdcdcc", "dddccdc" };
    int allowed = 11;
    assertEquals(57746, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case58() {
    int numLength = 14;
    String[] forbidden = { "cccddc", "cddddccc", "ddcccddccdc", "cdcdddddddddc", "d", "cccdcdddcddc", "dccdddcdcc", "dc", "ccdccddcddcccd", "ccccdcdccdddccc" };
    int allowed = 15;
    assertEquals(16383, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case59() {
    int numLength = 14;
    String[] forbidden = { "cccdcdccddddcdd", "dccddcccdcddddcdd", "cdcddddccccc", "cc" };
    int allowed = 26;
    assertEquals(16384, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case60() {
    int numLength = 16;
    String[] forbidden = { "dcdc", "d", "ddcccdccd", "dcddccdcc", "cdcdddcddc", "dddddddccddccdcc" };
    int allowed = 19;
    assertEquals(65536, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case61() {
    int numLength = 16;
    String[] forbidden = { "ddcdc", "dccdcdddccc", "ddcddcddccdcdcc", "dcdcdcdcccddddcdcc", "ccc", "cc", "dc", "cddcccdcddccdcccdc" };
    int allowed = 8;
    assertEquals(18617, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case62() {
    int numLength = 15;
    String[] forbidden = { "dccddcc", "dccccdcccdc", "dddcdcc", "cddcdcccdccccdcdc", "ccdcdddcddcdcdddcd", "c", "cdcdcc" };
    int allowed = 7;
    assertEquals(8866, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case63() {
    int numLength = 16;
    String[] forbidden = { "cddcdddddccccdd", "dddccdcdddcddc", "ccc", "cc", "dcdddcdcdcdccddc", "dccccc", "d", "dcccccddc" };
    int allowed = 22;
    assertEquals(64797, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case64() {
    int numLength = 16;
    String[] forbidden = { "dccccc", "cdcd", "dddc", "ddccc", "dddccddcdd" };
    int allowed = 29;
    assertEquals(65536, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case65() {
    int numLength = 18;
    String[] forbidden = { "ccdccdcddcddcccc", "ccdcdcdc", "cccccccdccddcccc", "cdcddcccd" };
    int allowed = 5;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case66() {
    int numLength = 15;
    String[] forbidden = { "ccdccdccd", "cdd", "ccccccdcd", "dd" };
    int allowed = 11;
    assertEquals(32209, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case67() {
    int numLength = 15;
    String[] forbidden = { "cc" };
    int allowed = 28;
    assertEquals(32768, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case68() {
    int numLength = 16;
    String[] forbidden = { "cdccdccdddccddddcd", "dddcdcdccc", "d", "ccdd", "ddddcdddcdc", "dcccdcdddcdcdddc", "dccdccddccdccdccdd", "dddccdd", "cdddddddcdcdc" };
    int allowed = 2;
    assertEquals(17, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case69() {
    int numLength = 14;
    String[] forbidden = { "ddccddccdccdcd", "cdccdccdddddcdc", "dccddcccdccdcd", "dcdccdcdd", "cdccddddcdcc", "dcdddc" };
    int allowed = 22;
    assertEquals(16384, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case70() {
    int numLength = 17;
    String[] forbidden = { "cdc", "ddcccccdd" };
    int allowed = 4;
    assertEquals(116941, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case71() {
    int numLength = 16;
    String[] forbidden = {  };
    int allowed = 17;
    assertEquals(65536, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case72() {
    int numLength = 18;
    String[] forbidden = { "dcdddcdc", "ddddccccdddcccdddc", "cddddcccdcddcdd", "cdccccdcccdcdccdd", "cccddccdddcccc", "ccccdddcdddcccddcd", "ccddc" };
    int allowed = 9;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case73() {
    int numLength = 14;
    String[] forbidden = { "dddddd", "dddccdddddc" };
    int allowed = 29;
    assertEquals(16384, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case74() {
    int numLength = 16;
    String[] forbidden = { "cdddcd", "d", "ddddcddcddccdcddd", "ccdcc", "ddddddcdcddddcc", "dddddddd" };
    int allowed = 4;
    assertEquals(232, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case75() {
    int numLength = 17;
    String[] forbidden = { "cddcdccddccddddcdd", "ccdcddcd", "dddddddcccccdcdcd", "ddcc" };
    int allowed = 11;
    assertEquals(131072, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case76() {
    int numLength = 15;
    String[] forbidden = { "ccdc", "dcc", "ddccddcdcdcdcccdd", "d", "ddccdccdcccc", "dc", "ccdccddddcccddd", "cdcddcddcc" };
    int allowed = 29;
    assertEquals(32768, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case77() {
    int numLength = 14;
    String[] forbidden = { "cdccdcdccdddcdccc", "dcdddddccccdcdccc", "ccdcdcddccdddddc", "cdc", "dccddcdcdcccd", "dddccdddcc" };
    int allowed = 28;
    assertEquals(16384, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case78() {
    int numLength = 14;
    String[] forbidden = {  };
    int allowed = 21;
    assertEquals(16384, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case79() {
    int numLength = 14;
    String[] forbidden = { "dd", "cdddc", "dcdccccccddc", "ccdcddcc", "dddd", "cddccccddc", "dccccdcdcdcddccd", "dcccdcdddcdcddcdd" };
    int allowed = 5;
    assertEquals(9899, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case80() {
    int numLength = 14;
    String[] forbidden = { "ddcdccddd", "cddcd", "cddddccddcdddddc", "ccccdccd" };
    int allowed = 11;
    assertEquals(16384, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case81() {
    int numLength = 15;
    String[] forbidden = { "ccdddcdd", "ddddcccdcd", "cccdcddcdcccc", "cdddddcddddccdcccd", "c", "cddccddddddddc", "dcc", "cdddccdccccc" };
    int allowed = 16;
    assertEquals(32768, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case82() {
    int numLength = 14;
    String[] forbidden = { "dddcdd", "dcccddddddddcccc", "ddcdcdccdcdddcddc", "dccddcdccd" };
    int allowed = 4;
    assertEquals(16384, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case83() {
    int numLength = 15;
    String[] forbidden = { "cccdccdddcd", "dcdccd" };
    int allowed = 1;
    assertEquals(27732, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case84() {
    int numLength = 14;
    String[] forbidden = { "dcddddddcddcddd", "dcdddcdcdd" };
    int allowed = 30;
    assertEquals(16384, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case85() {
    int numLength = 14;
    String[] forbidden = { "cdcc", "cd", "cdddcddcdccdddccc" };
    int allowed = 6;
    assertEquals(14295, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case86() {
    int numLength = 5;
    String[] forbidden = { "ccddccccdddddcccdd", "ddcddd", "cddccccdcdddcd", "ccccc" };
    int allowed = 4;
    assertEquals(32, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case87() {
    int numLength = 2;
    String[] forbidden = { "cdccdd" };
    int allowed = 26;
    assertEquals(4, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case88() {
    int numLength = 4;
    String[] forbidden = { "dcccc", "dc", "cccc", "dcccddddcdd", "c", "cddcdcccdcdcddcd", "ddcdc" };
    int allowed = 19;
    assertEquals(16, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case89() {
    int numLength = 7;
    String[] forbidden = { "cddcdcddcddcdccc", "dcdcdc", "dcddccdddcd", "cdcccdccddcc", "dcdcddddcccc", "c", "dddccdccddcddd", "dc" };
    int allowed = 7;
    assertEquals(105, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case90() {
    int numLength = 6;
    String[] forbidden = { "cccddddcddcdddd", "cccccdcd", "cdcdcc", "cddcdcdcdcccd", "dd", "cddcdcddddcdd", "cddcd", "cdccdccddc", "ccddcc" };
    int allowed = 7;
    assertEquals(64, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case91() {
    int numLength = 4;
    String[] forbidden = { "ccc", "dcddccccdddccdcd", "dddccddcccccdc", "cdcccdcdcccdccc", "dccdcdcdcccc", "dddcddcdddc", "cdccccccccddcccccc", "dd", "cccdcdc" };
    int allowed = 20;
    assertEquals(16, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case92() {
    int numLength = 6;
    String[] forbidden = { "cd", "dddd", "dc", "ddcdcdcccdcdccddd" };
    int allowed = 24;
    assertEquals(64, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case93() {
    int numLength = 2;
    String[] forbidden = { "cc", "cddc", "cccc", "dddd", "dcd" };
    int allowed = 1;
    assertEquals(3, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case94() {
    int numLength = 2;
    String[] forbidden = { "ccccdccccccdddc", "c", "cccd", "dddddddcc", "dc", "ccdcddddccdcdddcd" };
    int allowed = 20;
    assertEquals(4, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case95() {
    int numLength = 6;
    String[] forbidden = { "ccdcdddcddddcddddc", "d", "dddcddd" };
    int allowed = 26;
    assertEquals(64, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case96() {
    int numLength = 1;
    String[] forbidden = { "dddcddcdddc", "ddccccdcdccccddc", "ccddcdc", "dddcddcdcccdcccdd" };
    int allowed = 2;
    assertEquals(2, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case97() {
    int numLength = 5;
    String[] forbidden = { "ddddccdddccc", "ccdcdddccdcddcdcdc", "cdcccc", "cddddcdccdccdccdc", "ddcdcdcdc" };
    int allowed = 25;
    assertEquals(32, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case98() {
    int numLength = 5;
    String[] forbidden = { "dcccddddddcdccdc", "c", "dddccdddc", "cdddcccdcdcccccccd", "cdc", "dcdccddddcddddc" };
    int allowed = 29;
    assertEquals(32, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case99() {
    int numLength = 7;
    String[] forbidden = { "cddc", "ddddccdcccdccdccc", "cdddddddcccd", "c", "dcdccdcccccc", "cddcccc", "cddccdccdcc", "ccdcdccccc" };
    int allowed = 9;
    assertEquals(128, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case100() {
    int numLength = 7;
    String[] forbidden = { "ccddc", "cccccc", "cccdcdcdccdcdc", "ccddcccdcdc", "ccccccdc", "cdddcddcdddcccccdd", "ddcccddd", "dd" };
    int allowed = 11;
    assertEquals(128, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case101() {
    int numLength = 7;
    String[] forbidden = { "cdddddccdcdcddc", "ddddcddccdcc", "dddcccdcc", "dddcdc", "c", "cdccdc" };
    int allowed = 30;
    assertEquals(128, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case102() {
    int numLength = 1;
    String[] forbidden = { "ddddcccdcdcd", "d", "dddccdddcdddcccdcd", "cdcdc", "ccddcdcdd", "cddddcddcddcd", "ccdccdcddcc", "cdcccccdddddcccd" };
    int allowed = 3;
    assertEquals(2, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case103() {
    int numLength = 5;
    String[] forbidden = {  };
    int allowed = 6;
    assertEquals(32, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case104() {
    int numLength = 1;
    String[] forbidden = { "cdcccccdddddccdcc" };
    int allowed = 7;
    assertEquals(2, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case105() {
    int numLength = 7;
    String[] forbidden = { "cddddccdd", "cdddcdd", "ccc", "ccccdccccdcdddc" };
    int allowed = 5;
    assertEquals(127, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case106() {
    int numLength = 18;
    String[] forbidden = { "c", "d", "cd", "dc", "cc", "dd", "cdd", "ccc", "ddc", "dcc" };
    int allowed = 100;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case107() {
    int numLength = 18;
    String[] forbidden = { "ccccc", "ccccd", "cccdc", "cccdd", "ccdcc", "ccdcd", "ccddc", "ccddd", "cdccc", "cdccd" };
    int allowed = 100;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case108() {
    int numLength = 18;
    String[] forbidden = { "c", "cc", "ccc", "cccc", "ccccc", "cccccc", "ccccccc", "cccccccc", "ccccccccc", "cccccccccc" };
    int allowed = 100;
    assertEquals(262122, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case109() {
    int numLength = 18;
    String[] forbidden = { "cdcd", "ddddc", "ccdcdc", "cdc" };
    int allowed = 4;
    assertEquals(146712, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case110() {
    int numLength = 18;
    String[] forbidden = { "cccccccccccccccccc", "cccccccccccccccccd", "ccccccccccccccccdc", "cccccccccccccccdcc", "ccccccccccccccdccc", "cccccccccccccdcccc", "ccccccccccccdccccc", "dddddddddddddddddc", "ddddddddddddddddcd", "dddddddcdddddddddd" };
    int allowed = 100;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

  @Test
  public void case111() {
    int numLength = 18;
    String[] forbidden = { "cccccccccccccccccc", "dddddddddddddddddd", "ccddccddccddccddcc", "ddccddcccccccccccc", "ddddddcccddddddddd", "cccccccccccccccccd", "dddddddddddddddddc", "cccddccdddddddcccc", "cccdddddddddcccccc", "cccccccccccdddddcc" };
    int allowed = 100;
    assertEquals(262144, tennisrallies.howMany(numLength, forbidden, allowed));
  }

}
