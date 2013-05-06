package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class SlowDigitalClockTest {
  SlowDigitalClock slowdigitalclock = new SlowDigitalClock();

  @Test
  public void case1() {
    String currentTime = "01:11";
    String clockTime = "21:09";
    int secsPerMinute = 61;
    assertEquals("01:12", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case2() {
    String currentTime = "01:10";
    String clockTime = "21:09";
    int secsPerMinute = 61;
    assertEquals("01:12", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case3() {
    String currentTime = "12:50";
    String clockTime = "05:21";
    int secsPerMinute = 125;
    assertEquals("12:50", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case4() {
    String currentTime = "05:46";
    String clockTime = "23:50";
    int secsPerMinute = 240;
    assertEquals("11:10", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case5() {
    String currentTime = "12:34";
    String clockTime = "23:45";
    int secsPerMinute = 197;
    assertEquals("02:11", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case6() {
    String currentTime = "12:34";
    String clockTime = "23:45";
    int secsPerMinute = 300;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case7() {
    String currentTime = "00:00";
    String clockTime = "00:01";
    int secsPerMinute = 86;
    assertEquals("01:22", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case8() {
    String currentTime = "00:00";
    String clockTime = "01:21";
    int secsPerMinute = 77;
    assertEquals("15:02", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case9() {
    String currentTime = "21:28";
    String clockTime = "05:35";
    int secsPerMinute = 71;
    assertEquals("20:50", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case10() {
    String currentTime = "23:04";
    String clockTime = "20:17";
    int secsPerMinute = 77;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case11() {
    String currentTime = "15:19";
    String clockTime = "12:34";
    int secsPerMinute = 73;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case12() {
    String currentTime = "06:49";
    String clockTime = "01:40";
    int secsPerMinute = 180;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case13() {
    String currentTime = "22:15";
    String clockTime = "07:51";
    int secsPerMinute = 720;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case14() {
    String currentTime = "22:08";
    String clockTime = "22:12";
    int secsPerMinute = 288;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case15() {
    String currentTime = "04:18";
    String clockTime = "21:29";
    int secsPerMinute = 170;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case16() {
    String currentTime = "07:43";
    String clockTime = "20:52";
    int secsPerMinute = 354;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case17() {
    String currentTime = "01:32";
    String clockTime = "11:09";
    int secsPerMinute = 900;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case18() {
    String currentTime = "11:07";
    String clockTime = "05:20";
    int secsPerMinute = 114;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case19() {
    String currentTime = "05:00";
    String clockTime = "22:59";
    int secsPerMinute = 228;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case20() {
    String currentTime = "20:46";
    String clockTime = "23:39";
    int secsPerMinute = 84;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case21() {
    String currentTime = "02:32";
    String clockTime = "18:07";
    int secsPerMinute = 120;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case22() {
    String currentTime = "01:51";
    String clockTime = "15:10";
    int secsPerMinute = 61;
    assertEquals("01:51", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case23() {
    String currentTime = "21:10";
    String clockTime = "01:12";
    int secsPerMinute = 1000;
    assertEquals("21:10", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case24() {
    String currentTime = "00:00";
    String clockTime = "00:00";
    int secsPerMinute = 123;
    assertEquals("00:00", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case25() {
    String currentTime = "21:46";
    String clockTime = "18:02";
    int secsPerMinute = 437;
    assertEquals("15:12", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case26() {
    String currentTime = "02:11";
    String clockTime = "09:25";
    int secsPerMinute = 516;
    assertEquals("15:00", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case27() {
    String currentTime = "11:54";
    String clockTime = "10:22";
    int secsPerMinute = 78;
    assertEquals("12:10", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case28() {
    String currentTime = "18:50";
    String clockTime = "01:12";
    int secsPerMinute = 236;
    assertEquals("02:01", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case29() {
    String currentTime = "17:25";
    String clockTime = "04:54";
    int secsPerMinute = 322;
    assertEquals("00:00", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case30() {
    String currentTime = "19:41";
    String clockTime = "18:05";
    int secsPerMinute = 239;
    assertEquals("11:01", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case31() {
    String currentTime = "04:24";
    String clockTime = "14:03";
    int secsPerMinute = 842;
    assertEquals("22:02", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case32() {
    String currentTime = "19:08";
    String clockTime = "00:45";
    int secsPerMinute = 681;
    assertEquals("11:12", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case33() {
    String currentTime = "03:03";
    String clockTime = "11:04";
    int secsPerMinute = 311;
    assertEquals("12:02", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case34() {
    String currentTime = "04:17";
    String clockTime = "17:59";
    int secsPerMinute = 624;
    assertEquals("21:00", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case35() {
    String currentTime = "22:15";
    String clockTime = "11:02";
    int secsPerMinute = 793;
    assertEquals("10:12", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case36() {
    String currentTime = "10:11";
    String clockTime = "02:03";
    int secsPerMinute = 470;
    assertEquals("11:20", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case37() {
    String currentTime = "05:54";
    String clockTime = "02:28";
    int secsPerMinute = 874;
    assertEquals("21:50", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case38() {
    String currentTime = "20:50";
    String clockTime = "19:04";
    int secsPerMinute = 574;
    assertEquals("21:50", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case39() {
    String currentTime = "16:24";
    String clockTime = "17:20";
    int secsPerMinute = 569;
    assertEquals("00:22", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case40() {
    String currentTime = "03:05";
    String clockTime = "15:27";
    int secsPerMinute = 224;
    assertEquals("01:01", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case41() {
    String currentTime = "15:17";
    String clockTime = "11:30";
    int secsPerMinute = 122;
    assertEquals("22:20", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case42() {
    String currentTime = "17:25";
    String clockTime = "00:25";
    int secsPerMinute = 461;
    assertEquals("01:22", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case43() {
    String currentTime = "09:41";
    String clockTime = "22:07";
    int secsPerMinute = 476;
    assertEquals("10:20", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case44() {
    String currentTime = "13:34";
    String clockTime = "16:22";
    int secsPerMinute = 956;
    assertEquals("01:11", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case45() {
    String currentTime = "09:44";
    String clockTime = "02:05";
    int secsPerMinute = 669;
    assertEquals("00:21", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case46() {
    String currentTime = "06:22";
    String clockTime = "18:31";
    int secsPerMinute = 687;
    assertEquals("12:00", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case47() {
    String currentTime = "19:43";
    String clockTime = "13:28";
    int secsPerMinute = 64;
    assertEquals("21:01", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case48() {
    String currentTime = "11:23";
    String clockTime = "23:28";
    int secsPerMinute = 266;
    assertEquals("05:22", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case49() {
    String currentTime = "19:58";
    String clockTime = "18:40";
    int secsPerMinute = 250;
    assertEquals("05:02", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case50() {
    String currentTime = "15:08";
    String clockTime = "13:39";
    int secsPerMinute = 617;
    assertEquals("12:02", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case51() {
    String currentTime = "07:53";
    String clockTime = "19:27";
    int secsPerMinute = 669;
    assertEquals("22:00", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case52() {
    String currentTime = "22:18";
    String clockTime = "12:22";
    int secsPerMinute = 999;
    assertEquals("22:21", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case53() {
    String currentTime = "04:30";
    String clockTime = "20:20";
    int secsPerMinute = 121;
    assertEquals("02:51", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case54() {
    String currentTime = "03:57";
    String clockTime = "21:03";
    int secsPerMinute = 903;
    assertEquals("21:22", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case55() {
    String currentTime = "21:27";
    String clockTime = "14:33";
    int secsPerMinute = 912;
    assertEquals("15:00", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case56() {
    String currentTime = "03:21";
    String clockTime = "21:36";
    int secsPerMinute = 248;
    assertEquals("12:11", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case57() {
    String currentTime = "08:07";
    String clockTime = "14:20";
    int secsPerMinute = 854;
    assertEquals("22:51", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case58() {
    String currentTime = "20:20";
    String clockTime = "06:35";
    int secsPerMinute = 690;
    assertEquals("01:11", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case59() {
    String currentTime = "06:07";
    String clockTime = "13:53";
    int secsPerMinute = 382;
    assertEquals("20:20", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case60() {
    String currentTime = "14:45";
    String clockTime = "00:14";
    int secsPerMinute = 747;
    assertEquals("12:02", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case61() {
    String currentTime = "22:31";
    String clockTime = "06:02";
    int secsPerMinute = 505;
    assertEquals("00:10", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case62() {
    String currentTime = "18:38";
    String clockTime = "06:26";
    int secsPerMinute = 539;
    assertEquals("20:02", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case63() {
    String currentTime = "00:50";
    String clockTime = "22:22";
    int secsPerMinute = 191;
    assertEquals("20:21", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case64() {
    String currentTime = "14:36";
    String clockTime = "07:04";
    int secsPerMinute = 773;
    assertEquals("22:11", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case65() {
    String currentTime = "00:00";
    String clockTime = "00:01";
    int secsPerMinute = 86;
    assertEquals("01:22", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case66() {
    String currentTime = "12:50";
    String clockTime = "05:21";
    int secsPerMinute = 125;
    assertEquals("12:50", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case67() {
    String currentTime = "23:18";
    String clockTime = "03:02";
    int secsPerMinute = 997;
    assertEquals("10:12", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case68() {
    String currentTime = "01:07";
    String clockTime = "02:36";
    int secsPerMinute = 77;
    assertEquals("00:20", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case69() {
    String currentTime = "12:34";
    String clockTime = "23:45";
    int secsPerMinute = 300;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case70() {
    String currentTime = "12:34";
    String clockTime = "23:45";
    int secsPerMinute = 197;
    assertEquals("02:11", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case71() {
    String currentTime = "19:00";
    String clockTime = "17:00";
    int secsPerMinute = 807;
    assertEquals("05:51", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case72() {
    String currentTime = "08:29";
    String clockTime = "22:14";
    int secsPerMinute = 532;
    assertEquals("12:10", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case73() {
    String currentTime = "21:24";
    String clockTime = "11:35";
    int secsPerMinute = 441;
    assertEquals("05:51", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case74() {
    String currentTime = "00:01";
    String clockTime = "00:00";
    int secsPerMinute = 73;
    assertEquals("", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case75() {
    String currentTime = "10:05";
    String clockTime = "00:25";
    int secsPerMinute = 737;
    assertEquals("00:10", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case76() {
    String currentTime = "00:01";
    String clockTime = "00:00";
    int secsPerMinute = 71;
    assertEquals("01:00", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case77() {
    String currentTime = "12:34";
    String clockTime = "23:23";
    int secsPerMinute = 61;
    assertEquals("05:01", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case78() {
    String currentTime = "18:44";
    String clockTime = "09:19";
    int secsPerMinute = 922;
    assertEquals("22:00", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case79() {
    String currentTime = "10:19";
    String clockTime = "02:01";
    int secsPerMinute = 999;
    assertEquals("10:20", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case80() {
    String currentTime = "12:34";
    String clockTime = "23:45";
    int secsPerMinute = 358;
    assertEquals("20:21", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case81() {
    String currentTime = "13:22";
    String clockTime = "11:00";
    int secsPerMinute = 61;
    assertEquals("12:50", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case82() {
    String currentTime = "23:59";
    String clockTime = "00:00";
    int secsPerMinute = 120;
    assertEquals("00:00", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case83() {
    String currentTime = "16:07";
    String clockTime = "01:41";
    int secsPerMinute = 321;
    assertEquals("02:21", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case84() {
    String currentTime = "08:10";
    String clockTime = "13:06";
    int secsPerMinute = 922;
    assertEquals("00:02", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case85() {
    String currentTime = "07:53";
    String clockTime = "18:53";
    int secsPerMinute = 362;
    assertEquals("15:02", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

  @Test
  public void case86() {
    String currentTime = "22:10";
    String clockTime = "11:54";
    int secsPerMinute = 358;
    assertEquals("10:12", slowdigitalclock.firstCorrectTime(currentTime, clockTime, secsPerMinute));
  }

}
