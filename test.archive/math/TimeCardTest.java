package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TimeCardTest {
  TimeCard timecard = new TimeCard();

  @Test
  public void case1() {
    String[] time = { "03:00,pm" };
    assertEquals("BELOW 40", timecard.leave(time));
  }

  @Test
  public void case2() {
    String[] time = { "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "09:00,am" };
    assertEquals("05:00,pm", timecard.leave(time));
  }

  @Test
  public void case3() {
    String[] time = { "12:00,am", "08:00,pm", "12:00,am", "08:00,pm", "12:00,am" };
    assertEquals("12:00,am", timecard.leave(time));
  }

  @Test
  public void case4() {
    String[] time = { "12:00,pm", "08:00,pm", "12:00,am", "08:00,pm", "12:00,am" };
    assertEquals("12:00,pm", timecard.leave(time));
  }

  @Test
  public void case5() {
    String[] time = { "09:00,am", "04:31,pm", "09:00,am", "04:31,pm", "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "03:53,am" };
    assertEquals("12:51,pm", timecard.leave(time));
  }

  @Test
  public void case6() {
    String[] time = { "12:09,am", "12:11,am", "01:03,pm", "11:02,pm", "01:03,pm", "11:02,pm", "11:59,pm" };
    assertEquals("07:59,pm", timecard.leave(time));
  }

  @Test
  public void case7() {
    String[] time = { "12:09,am", "12:07,pm", "01:03,pm", "11:02,pm", "01:03,pm", "11:02,pm", "11:59,pm" };
    assertEquals("08:03,am", timecard.leave(time));
  }

  @Test
  public void case8() {
    String[] time = { "12:09,am", "12:11,pm", "01:03,pm", "11:02,pm", "01:03,pm", "11:02,pm", "11:59,pm" };
    assertEquals("07:59,am", timecard.leave(time));
  }

  @Test
  public void case9() {
    String[] time = { "12:09,pm", "12:11,am", "01:03,pm", "11:02,pm", "01:03,pm", "11:02,pm", "11:59,pm" };
    assertEquals("07:59,am", timecard.leave(time));
  }

  @Test
  public void case10() {
    String[] time = { "12:09,pm", "12:07,am", "01:03,pm", "11:02,pm", "01:03,pm", "11:02,pm", "11:59,pm" };
    assertEquals("08:03,am", timecard.leave(time));
  }

  @Test
  public void case11() {
    String[] time = { "01:11,pm" };
    assertEquals("BELOW 40", timecard.leave(time));
  }

  @Test
  public void case12() {
    String[] time = { "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "01:01,pm", "02:00,pm", "10:00,am", "12:00,pm" };
    assertEquals("08:00,am", timecard.leave(time));
  }

  @Test
  public void case13() {
    String[] time = { "12:23,am", "12:23,pm", "12:23,am", "12:23,pm", "12:23,am", "12:23,pm", "12:23,am", "12:23,pm", "03:03,am" };
    assertEquals("ABOVE 40", timecard.leave(time));
  }

  @Test
  public void case14() {
    String[] time = { "12:00,am", "08:00,pm", "12:00,am" };
    assertEquals("08:00,pm", timecard.leave(time));
  }

  @Test
  public void case15() {
    String[] time = { "11:11,am", "06:18,am", "06:30,pm", "01:01,am", "02:50,pm", "07:07,pm", "02:14,am", "02:26,am", "05:53,pm", "01:13,am", "03:39,am" };
    assertEquals("06:12,am", timecard.leave(time));
  }

  @Test
  public void case16() {
    String[] time = { "08:33,pm", "09:16,am", "05:53,am", "08:39,pm", "01:25,am" };
    assertEquals("01:56,pm", timecard.leave(time));
  }

  @Test
  public void case17() {
    String[] time = { "07:31,pm" };
    assertEquals("BELOW 40", timecard.leave(time));
  }

  @Test
  public void case18() {
    String[] time = { "05:31,pm", "08:42,pm", "02:37,am", "11:11,am", "01:37,am", "11:11,am", "03:39,am" };
    assertEquals("10:20,pm", timecard.leave(time));
  }

  @Test
  public void case19() {
    String[] time = { "08:08,pm", "12:24,pm", "01:49,am", "09:09,am", "12:24,am", "07:07,am", "10:10,pm" };
    assertEquals("07:51,am", timecard.leave(time));
  }

  @Test
  public void case20() {
    String[] time = { "09:33,pm", "10:58,am", "09:33,am" };
    assertEquals("BELOW 40", timecard.leave(time));
  }

  @Test
  public void case21() {
    String[] time = { "12:48,am", "12:34,pm", "11:55,am", "10:50,pm", "01:14,pm", "12:52,am", "01:13,pm" };
    assertEquals("06:54,pm", timecard.leave(time));
  }

  @Test
  public void case22() {
    String[] time = { "03:27,pm", "10:34,pm", "07:19,am", "12:00,pm", "07:07,am", "03:39,pm", "03:39,pm", "06:18,am", "04:04,am" };
    assertEquals("09:05,am", timecard.leave(time));
  }

  @Test
  public void case23() {
    String[] time = { "02:20,pm", "05:19,am", "10:34,am", "06:30,am", "10:22,pm" };
    assertEquals("03:27,am", timecard.leave(time));
  }

  @Test
  public void case24() {
    String[] time = { "08:47,pm", "03:50,pm", "12:24,am" };
    assertEquals("BELOW 40", timecard.leave(time));
  }

  @Test
  public void case25() {
    String[] time = { "08:09,am", "10:36,am", "08:37,pm", "08:01,am", "12:01,pm", "11:07,pm", "09:21,pm", "10:52,pm", "03:38,am", "01:10,pm", "04:52,am" };
    assertEquals("08:52,am", timecard.leave(time));
  }

  @Test
  public void case26() {
    String[] time = { "12:11,pm", "07:36,pm", "05:56,am", "12:41,am", "11:31,pm", "06:57,am", "03:39,pm" };
    assertEquals("10:03,pm", timecard.leave(time));
  }

  @Test
  public void case27() {
    String[] time = { "10:58,am", "03:30,am", "06:59,pm", "07:55,am", "11:59,pm" };
    assertEquals("10:31,am", timecard.leave(time));
  }

  @Test
  public void case28() {
    String[] time = { "09:51,pm", "04:48,am", "04:07,pm", "08:49,pm", "08:12,am", "10:31,pm", "11:51,am", "06:10,pm", "04:52,am" };
    assertEquals("12:35,pm", timecard.leave(time));
  }

  @Test
  public void case29() {
    String[] time = { "06:15,am", "09:54,pm", "01:09,am", "07:40,am", "11:05,am", "12:20,pm", "04:52,am" };
    assertEquals("09:27,pm", timecard.leave(time));
  }

  @Test
  public void case30() {
    String[] time = { "03:23,pm", "08:49,am", "05:17,pm", "07:07,pm", "06:25,pm", "03:34,am", "12:34,pm", "04:41,pm", "08:44,am" };
    assertEquals("04:12,pm", timecard.leave(time));
  }

  @Test
  public void case31() {
    String[] time = { "11:00,am", "12:00,am", "11:00,pm", "12:00,pm", "11:59,am", "12:01,pm", "11:59,pm", "12:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am", "09:01,am", "09:00,am" };
    assertEquals("10:36,pm", timecard.leave(time));
  }

  @Test
  public void case32() {
    String[] time = { "12:00,am", "08:00,pm", "12:00,am", "08:00,pm", "12:00,am" };
    assertEquals("12:00,am", timecard.leave(time));
  }

  @Test
  public void case33() {
    String[] time = { "12:00,am", "12:00,am", "12:00,am" };
    assertEquals("BELOW 40", timecard.leave(time));
  }

  @Test
  public void case34() {
    String[] time = { "12:00,pm", "08:00,pm", "12:00,am", "08:00,pm", "12:00,am" };
    assertEquals("12:00,pm", timecard.leave(time));
  }

  @Test
  public void case35() {
    String[] time = { "09:00,am", "04:31,pm", "09:00,am", "04:31,pm", "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "03:53,am" };
    assertEquals("12:51,pm", timecard.leave(time));
  }

  @Test
  public void case36() {
    String[] time = { "02:00,pm", "01:00,am", "02:00,pm", "01:00,am", "02:00,pm", "01:00,am", "02:00,pm" };
    assertEquals("09:00,pm", timecard.leave(time));
  }

  @Test
  public void case37() {
    String[] time = { "12:00,am", "07:59,pm", "12:00,am" };
    assertEquals("BELOW 40", timecard.leave(time));
  }

  @Test
  public void case38() {
    String[] time = { "04:00,am", "12:00,am", "04:00,am" };
    assertEquals("12:00,am", timecard.leave(time));
  }

  @Test
  public void case39() {
    String[] time = { "08:00,am", "08:00,pm", "08:00,am", "08:00,pm", "08:00,am", "08:00,pm", "08:00,pm" };
    assertEquals("12:00,am", timecard.leave(time));
  }

  @Test
  public void case40() {
    String[] time = { "11:59,pm", "12:01,am", "11:59,pm", "05:00,pm", "11:59,pm", "05:00,pm", "11:59,pm" };
    assertEquals("05:55,am", timecard.leave(time));
  }

  @Test
  public void case41() {
    String[] time = { "12:00,am", "08:00,pm", "07:15,am", "03:14,am", "11:59,pm" };
    assertEquals("12:00,am", timecard.leave(time));
  }

  @Test
  public void case42() {
    String[] time = { "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "12:50,am", "05:00,pm", "09:00,am" };
    assertEquals("ABOVE 40", timecard.leave(time));
  }

  @Test
  public void case43() {
    String[] time = { "09:00,pm", "05:00,pm", "09:00,pm", "04:59,pm", "11:59,pm" };
    assertEquals("12:00,am", timecard.leave(time));
  }

  @Test
  public void case44() {
    String[] time = { "09:00,am", "05:00,am", "09:00,am", "05:00,pm", "09:00,am" };
    assertEquals("09:00,pm", timecard.leave(time));
  }

  @Test
  public void case45() {
    String[] time = { "12:00,pm", "08:00,am", "12:00,pm", "08:00,am", "12:00,pm" };
    assertEquals("12:00,pm", timecard.leave(time));
  }

  @Test
  public void case46() {
    String[] time = { "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "09:00,am", "11:00,pm", "05:11,am" };
    assertEquals("ABOVE 40", timecard.leave(time));
  }

  @Test
  public void case47() {
    String[] time = { "09:14,pm", "05:14,pm", "09:00,am" };
    assertEquals("05:00,am", timecard.leave(time));
  }

  @Test
  public void case48() {
    String[] time = { "01:00,am", "01:00,pm", "01:00,am", "01:00,pm", "01:00,am", "01:00,pm", "01:00,am", "01:00,pm", "01:00,am" };
    assertEquals("ABOVE 40", timecard.leave(time));
  }

  @Test
  public void case49() {
    String[] time = { "11:00,pm", "07:00,am", "11:00,pm", "07:00,am", "11:00,pm", "07:00,am", "11:00,pm", "07:00,am", "11:00,pm" };
    assertEquals("07:00,am", timecard.leave(time));
  }

  @Test
  public void case50() {
    String[] time = { "03:00,pm", "03:01,pm", "12:00,am" };
    assertEquals("BELOW 40", timecard.leave(time));
  }

  @Test
  public void case51() {
    String[] time = { "08:00,am", "08:00,pm", "08:00,am", "08:00,pm", "08:00,am", "08:00,pm", "08:00,am", "08:00,pm", "08:00,am" };
    assertEquals("ABOVE 40", timecard.leave(time));
  }

  @Test
  public void case52() {
    String[] time = { "09:00,am", "04:31,pm", "09:00,am", "04:31,pm", "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "04:53,pm" };
    assertEquals("01:51,am", timecard.leave(time));
  }

  @Test
  public void case53() {
    String[] time = { "12:00,pm", "08:00,pm", "12:00,am", "08:00,pm", "10:00,pm" };
    assertEquals("10:00,am", timecard.leave(time));
  }

  @Test
  public void case54() {
    String[] time = { "12:00,am", "08:00,pm", "04:01,am" };
    assertEquals("12:01,am", timecard.leave(time));
  }

  @Test
  public void case55() {
    String[] time = { "12:00,am", "07:01,pm", "12:00,am", "08:00,pm", "12:00,am", "01:00,am", "12:00,am" };
    assertEquals("ABOVE 40", timecard.leave(time));
  }

  @Test
  public void case56() {
    String[] time = { "08:00,pm", "08:00,am", "08:00,pm", "09:00,am", "01:00,am" };
    assertEquals("04:00,pm", timecard.leave(time));
  }

  @Test
  public void case57() {
    String[] time = { "12:00,am", "08:00,pm", "11:00,pm" };
    assertEquals("07:00,pm", timecard.leave(time));
  }

  @Test
  public void case58() {
    String[] time = { "11:59,am", "11:59,pm", "11:59,am", "11:59,pm", "11:59,am", "11:59,pm", "11:59,am" };
    assertEquals("03:59,pm", timecard.leave(time));
  }

  @Test
  public void case59() {
    String[] time = { "10:00,am", "02:00,am", "10:00,am", "02:00,am", "10:00,am" };
    assertEquals("06:00,pm", timecard.leave(time));
  }

  @Test
  public void case60() {
    String[] time = { "11:00,pm", "09:00,am", "11:00,pm", "09:00,am", "11:00,pm", "09:00,am", "11:00,pm", "09:00,am", "11:00,pm", "09:00,am", "09:00,am" };
    assertEquals("ABOVE 40", timecard.leave(time));
  }

  @Test
  public void case61() {
    String[] time = { "12:00,am", "08:00,pm", "12:00,am", "08:00,am", "12:00,pm" };
    assertEquals("12:00,am", timecard.leave(time));
  }

  @Test
  public void case62() {
    String[] time = { "09:00,am", "05:00,pm", "01:00,pm", "01:00,am", "09:00,am", "05:00,pm", "09:00,am", "05:00,pm", "09:00,am" };
    assertEquals("01:00,pm", timecard.leave(time));
  }

  @Test
  public void case63() {
    String[] time = { "12:00,am", "12:00,pm", "12:00,am", "08:01,am", "12:00,pm" };
    assertEquals("07:59,am", timecard.leave(time));
  }

  @Test
  public void case64() {
    String[] time = { "02:00,am", "08:00,pm", "02:00,am", "08:00,pm", "12:20,am" };
    assertEquals("04:20,am", timecard.leave(time));
  }

  @Test
  public void case65() {
    String[] time = { "12:00,am", "08:00,pm", "12:00,am" };
    assertEquals("08:00,pm", timecard.leave(time));
  }

}
