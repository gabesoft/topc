package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class UptimeTest {
  Uptime uptime = new Uptime();

  @Test
  public void case1() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "8 Jun 2004 at 07:16:28 PM";
    assertEquals("1d 2h 34m 56s", uptime.calcUptime(started, now));
  }

  @Test
  public void case2() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "7 Jun 2004 at 04:41:32 PM";
    assertEquals("", uptime.calcUptime(started, now));
  }

  @Test
  public void case3() {
    String started = "28 Feb 2004 at 01:23:45 PM";
    String now = "1 Mar 2004 at 12:34:56 AM";
    assertEquals("1d 11h 11m 11s", uptime.calcUptime(started, now));
  }

  @Test
  public void case4() {
    String started = "28 Feb 2005 at 01:23:45 PM";
    String now = "1 Jan 2015 at 12:34:56 AM";
    assertEquals("3593d 11h 11m 11s", uptime.calcUptime(started, now));
  }

  @Test
  public void case5() {
    String started = "1 Jan 1900 at 12:00:00 AM";
    String now = "31 Dec 2199 at 11:59:59 PM";
    assertEquals("109572d 23h 59m 59s", uptime.calcUptime(started, now));
  }

  @Test
  public void case6() {
    String started = "1 Jan 1900 at 12:00:00 AM";
    String now = "31 Dec 1900 at 11:59:59 PM";
    assertEquals("364d 23h 59m 59s", uptime.calcUptime(started, now));
  }

  @Test
  public void case7() {
    String started = "1 Jan 1900 at 12:00:00 AM";
    String now = "28 Feb 1900 at 11:59:59 PM";
    assertEquals("58d 23h 59m 59s", uptime.calcUptime(started, now));
  }

  @Test
  public void case8() {
    String started = "1 Jan 2000 at 12:00:00 AM";
    String now = "28 Feb 2000 at 11:59:59 PM";
    assertEquals("58d 23h 59m 59s", uptime.calcUptime(started, now));
  }

  @Test
  public void case9() {
    String started = "1 Jan 2000 at 12:00:00 AM";
    String now = "29 Feb 2000 at 11:59:59 PM";
    assertEquals("59d 23h 59m 59s", uptime.calcUptime(started, now));
  }

  @Test
  public void case10() {
    String started = "1 Mar 2000 at 12:00:00 AM";
    String now = "28 Feb 2004 at 11:59:59 PM";
    assertEquals("1459d 23h 59m 59s", uptime.calcUptime(started, now));
  }

  @Test
  public void case11() {
    String started = "1 Jan 2000 at 12:00:00 AM";
    String now = "1 Jan 2000 at 12:00:01 AM";
    assertEquals("1s", uptime.calcUptime(started, now));
  }

  @Test
  public void case12() {
    String started = "1 Jan 2000 at 12:00:00 AM";
    String now = "1 Jan 2000 at 12:01:00 AM";
    assertEquals("1m", uptime.calcUptime(started, now));
  }

  @Test
  public void case13() {
    String started = "1 Jan 2000 at 12:00:00 AM";
    String now = "1 Jan 2000 at 01:00:00 PM";
    assertEquals("13h", uptime.calcUptime(started, now));
  }

  @Test
  public void case14() {
    String started = "1 Apr 2000 at 12:00:00 AM";
    String now = "1 May 2000 at 12:00:01 AM";
    assertEquals("30d 1s", uptime.calcUptime(started, now));
  }

  @Test
  public void case15() {
    String started = "1 Jun 2000 at 12:00:00 AM";
    String now = "1 Jul 2000 at 12:01:01 AM";
    assertEquals("30d 1m 1s", uptime.calcUptime(started, now));
  }

  @Test
  public void case16() {
    String started = "1 Aug 2000 at 12:00:00 AM";
    String now = "1 Sep 2000 at 12:01:01 AM";
    assertEquals("31d 1m 1s", uptime.calcUptime(started, now));
  }

  @Test
  public void case17() {
    String started = "1 Oct 2000 at 01:00:00 AM";
    String now = "1 Nov 2000 at 12:00:01 AM";
    assertEquals("30d 23h 1s", uptime.calcUptime(started, now));
  }

  @Test
  public void case18() {
    String started = "1 Nov 2000 at 12:00:00 PM";
    String now = "1 Dec 2000 at 12:00:01 AM";
    assertEquals("29d 12h 1s", uptime.calcUptime(started, now));
  }

  @Test
  public void case19() {
    String started = "31 Dec 2000 at 12:00:00 AM";
    String now = "1 Jan 2001 at 12:00:01 AM";
    assertEquals("1d 1s", uptime.calcUptime(started, now));
  }

  @Test
  public void case20() {
    String started = "1 Jan 1900 at 02:21:47 AM";
    String now = "2 Feb 1963 at 05:52:38 AM";
    assertEquals("23042d 3h 30m 51s", uptime.calcUptime(started, now));
  }

  @Test
  public void case21() {
    String started = "3 Mar 2000 at 09:27:40 AM";
    String now = "4 Apr 2100 at 02:25:06 AM";
    assertEquals("36555d 16h 57m 26s", uptime.calcUptime(started, now));
  }

  @Test
  public void case22() {
    String started = "5 May 2101 at 01:27:14 AM";
    String now = "6 Jun 2199 at 05:10:57 PM";
    assertEquals("35826d 15h 43m 43s", uptime.calcUptime(started, now));
  }

  @Test
  public void case23() {
    String started = "7 Jul 1979 at 05:31:10 PM";
    String now = "8 Aug 2007 at 07:20:32 AM";
    assertEquals("10258d 13h 49m 22s", uptime.calcUptime(started, now));
  }

  @Test
  public void case24() {
    String started = "9 Sep 1922 at 06:21:56 PM";
    String now = "10 Oct 2032 at 04:33:20 AM";
    assertEquals("40208d 10h 11m 24s", uptime.calcUptime(started, now));
  }

  @Test
  public void case25() {
    String started = "11 Nov 2047 at 08:00:28 PM";
    String now = "12 Dec 2082 at 12:26:48 PM";
    assertEquals("12814d 16h 26m 20s", uptime.calcUptime(started, now));
  }

  @Test
  public void case26() {
    String started = "13 Jan 1923 at 02:54:06 PM";
    String now = "14 Feb 1937 at 08:19:44 AM";
    assertEquals("5145d 17h 25m 38s", uptime.calcUptime(started, now));
  }

  @Test
  public void case27() {
    String started = "15 Mar 2004 at 03:32:54 AM";
    String now = "16 Apr 2049 at 10:21:49 AM";
    assertEquals("16468d 6h 48m 55s", uptime.calcUptime(started, now));
  }

  @Test
  public void case28() {
    String started = "17 May 1966 at 03:10:24 PM";
    String now = "18 Jun 2138 at 05:13:35 PM";
    assertEquals("62854d 2h 3m 11s", uptime.calcUptime(started, now));
  }

  @Test
  public void case29() {
    String started = "19 Jul 2098 at 08:15:11 PM";
    String now = "20 Aug 2159 at 09:20:42 AM";
    assertEquals("22310d 13h 5m 31s", uptime.calcUptime(started, now));
  }

  @Test
  public void case30() {
    String started = "21 Sep 2056 at 01:30:24 PM";
    String now = "22 Oct 2084 at 05:35:28 PM";
    assertEquals("10258d 4h 5m 4s", uptime.calcUptime(started, now));
  }

  @Test
  public void case31() {
    String started = "23 Nov 1966 at 09:19:29 AM";
    String now = "24 Dec 1995 at 02:18:25 PM";
    assertEquals("10623d 4h 58m 56s", uptime.calcUptime(started, now));
  }

  @Test
  public void case32() {
    String started = "25 Jan 1922 at 05:58:52 AM";
    String now = "26 Feb 2190 at 11:53:14 AM";
    assertEquals("97918d 5h 54m 22s", uptime.calcUptime(started, now));
  }

  @Test
  public void case33() {
    String started = "27 Mar 2067 at 02:45:10 PM";
    String now = "28 Apr 2067 at 10:24:30 AM";
    assertEquals("31d 19h 39m 20s", uptime.calcUptime(started, now));
  }

  @Test
  public void case34() {
    String started = "29 May 1914 at 03:39:06 AM";
    String now = "30 Jun 2123 at 07:51:09 PM";
    assertEquals("76368d 16h 12m 3s", uptime.calcUptime(started, now));
  }

  @Test
  public void case35() {
    String started = "1 Jan 1900 at 12:00:00 AM";
    String now = "1 Jan 1901 at 12:00:00 AM";
    assertEquals("365d", uptime.calcUptime(started, now));
  }

  @Test
  public void case36() {
    String started = "1 Jan 1904 at 12:00:00 AM";
    String now = "1 Jan 1905 at 12:00:00 AM";
    assertEquals("366d", uptime.calcUptime(started, now));
  }

  @Test
  public void case37() {
    String started = "1 Jan 1900 at 12:00:00 AM";
    String now = "1 Jan 1900 at 12:00:00 AM";
    assertEquals("", uptime.calcUptime(started, now));
  }

  @Test
  public void case38() {
    String started = "1 Jun 2000 at 12:00:00 AM";
    String now = "1 Jul 2000 at 12:00:00 AM";
    assertEquals("30d", uptime.calcUptime(started, now));
  }

  @Test
  public void case39() {
    String started = "1 Jun 2000 at 12:00:00 AM";
    String now = "1 Aug 2000 at 12:00:00 AM";
    assertEquals("61d", uptime.calcUptime(started, now));
  }

  @Test
  public void case40() {
    String started = "1 Jun 2000 at 12:00:00 AM";
    String now = "1 Sep 2000 at 12:00:00 AM";
    assertEquals("92d", uptime.calcUptime(started, now));
  }

  @Test
  public void case41() {
    String started = "1 Jun 2000 at 12:00:00 AM";
    String now = "1 Oct 2000 at 12:00:00 AM";
    assertEquals("122d", uptime.calcUptime(started, now));
  }

  @Test
  public void case42() {
    String started = "1 Jun 2000 at 12:00:00 AM";
    String now = "1 Nov 2000 at 12:00:00 AM";
    assertEquals("153d", uptime.calcUptime(started, now));
  }

  @Test
  public void case43() {
    String started = "1 Jun 2000 at 12:00:00 AM";
    String now = "1 Dec 2000 at 12:00:00 AM";
    assertEquals("183d", uptime.calcUptime(started, now));
  }

  @Test
  public void case44() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "8 Jun 2004 at 07:16:28 PM";
    assertEquals("1d 2h 34m 56s", uptime.calcUptime(started, now));
  }

  @Test
  public void case45() {
    String started = "4 Apr 2004 at 01:59:00 AM";
    String now = "4 Apr 2004 at 03:59:00 AM";
    assertEquals("2h", uptime.calcUptime(started, now));
  }

  @Test
  public void case46() {
    String started = "7 Jun 1901 at 04:41:32 PM";
    String now = "7 Jun 2004 at 04:41:32 PM";
    assertEquals("37621d", uptime.calcUptime(started, now));
  }

  @Test
  public void case47() {
    String started = "7 Jun 2004 at 04:41:28 PM";
    String now = "8 Jun 2004 at 07:16:28 PM";
    assertEquals("1d 2h 35m", uptime.calcUptime(started, now));
  }

  @Test
  public void case48() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "9 Jun 2004 at 12:41:32 PM";
    assertEquals("1d 20h", uptime.calcUptime(started, now));
  }

  @Test
  public void case49() {
    String started = "1 Jan 2004 at 01:02:02 AM";
    String now = "2 Jan 2004 at 01:02:02 AM";
    assertEquals("1d", uptime.calcUptime(started, now));
  }

  @Test
  public void case50() {
    String started = "25 Jan 1922 at 05:58:52 AM";
    String now = "26 Feb 2190 at 11:53:14 AM";
    assertEquals("97918d 5h 54m 22s", uptime.calcUptime(started, now));
  }

  @Test
  public void case51() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "7 Jun 2004 at 04:41:32 PM";
    assertEquals("", uptime.calcUptime(started, now));
  }

  @Test
  public void case52() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "7 Jun 2004 at 06:41:32 PM";
    assertEquals("2h", uptime.calcUptime(started, now));
  }

  @Test
  public void case53() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "8 Jun 2004 at 04:41:33 PM";
    assertEquals("1d 1s", uptime.calcUptime(started, now));
  }

  @Test
  public void case54() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "8 Jun 2004 at 04:41:32 PM";
    assertEquals("1d", uptime.calcUptime(started, now));
  }

  @Test
  public void case55() {
    String started = "8 May 1900 at 07:16:28 PM";
    String now = "8 May 2004 at 07:16:28 PM";
    assertEquals("37986d", uptime.calcUptime(started, now));
  }

  @Test
  public void case56() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "7 Jun 2004 at 04:41:33 PM";
    assertEquals("1s", uptime.calcUptime(started, now));
  }

  @Test
  public void case57() {
    String started = "15 Jan 2004 at 01:00:00 PM";
    String now = "15 Jun 2004 at 01:00:00 AM";
    assertEquals("151d 12h", uptime.calcUptime(started, now));
  }

  @Test
  public void case58() {
    String started = "7 Jun 1900 at 04:41:32 PM";
    String now = "7 Jun 2199 at 04:41:32 PM";
    assertEquals("109208d", uptime.calcUptime(started, now));
  }

  @Test
  public void case59() {
    String started = "31 Jan 1900 at 12:58:52 AM";
    String now = "1 Mar 2199 at 12:58:51 AM";
    assertEquals("109236d 23h 59m 59s", uptime.calcUptime(started, now));
  }

  @Test
  public void case60() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "7 Jun 2004 at 06:43:32 PM";
    assertEquals("2h 2m", uptime.calcUptime(started, now));
  }

  @Test
  public void case61() {
    String started = "7 Jun 2004 at 12:41:32 PM";
    String now = "8 Jun 2004 at 07:16:28 PM";
    assertEquals("1d 6h 34m 56s", uptime.calcUptime(started, now));
  }

  @Test
  public void case62() {
    String started = "27 Feb 2004 at 01:23:45 PM";
    String now = "28 Feb 2004 at 01:23:45 PM";
    assertEquals("1d", uptime.calcUptime(started, now));
  }

  @Test
  public void case63() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "8 Jun 2004 at 04:43:32 PM";
    assertEquals("1d 2m", uptime.calcUptime(started, now));
  }

  @Test
  public void case64() {
    String started = "1 Jan 1999 at 12:00:00 AM";
    String now = "2 Jan 2004 at 01:00:00 AM";
    assertEquals("1827d 1h", uptime.calcUptime(started, now));
  }

  @Test
  public void case65() {
    String started = "1 Jan 1900 at 12:00:00 AM";
    String now = "31 Dec 2199 at 11:00:59 PM";
    assertEquals("109572d 23h 59s", uptime.calcUptime(started, now));
  }

  @Test
  public void case66() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "7 Jun 2004 at 05:41:32 PM";
    assertEquals("1h", uptime.calcUptime(started, now));
  }

  @Test
  public void case67() {
    String started = "7 Jun 2004 at 12:00:00 AM";
    String now = "8 Jun 2004 at 12:00:00 AM";
    assertEquals("1d", uptime.calcUptime(started, now));
  }

  @Test
  public void case68() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "7 Jun 2004 at 05:56:32 PM";
    assertEquals("1h 15m", uptime.calcUptime(started, now));
  }

  @Test
  public void case69() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "8 Jun 2004 at 05:16:28 PM";
    assertEquals("1d 34m 56s", uptime.calcUptime(started, now));
  }

  @Test
  public void case70() {
    String started = "7 Jun 2004 at 04:09:32 PM";
    String now = "8 Jun 2004 at 07:16:28 PM";
    assertEquals("1d 3h 6m 56s", uptime.calcUptime(started, now));
  }

  @Test
  public void case71() {
    String started = "27 Feb 2004 at 01:23:45 PM";
    String now = "28 Feb 2004 at 01:24:45 PM";
    assertEquals("1d 1m", uptime.calcUptime(started, now));
  }

  @Test
  public void case72() {
    String started = "1 Jan 2000 at 12:00:00 AM";
    String now = "31 Dec 2000 at 11:59:59 PM";
    assertEquals("365d 23h 59m 59s", uptime.calcUptime(started, now));
  }

  @Test
  public void case73() {
    String started = "27 Feb 2004 at 01:01:01 PM";
    String now = "1 Mar 2004 at 01:01:01 PM";
    assertEquals("3d", uptime.calcUptime(started, now));
  }

  @Test
  public void case74() {
    String started = "7 Jun 2004 at 12:41:32 PM";
    String now = "7 Jun 2004 at 04:41:32 PM";
    assertEquals("4h", uptime.calcUptime(started, now));
  }

  @Test
  public void case75() {
    String started = "12 Mar 2004 at 12:12:12 PM";
    String now = "13 Apr 2004 at 12:12:12 AM";
    assertEquals("31d 12h", uptime.calcUptime(started, now));
  }

  @Test
  public void case76() {
    String started = "7 Jun 2004 at 11:59:19 AM";
    String now = "7 Jun 2004 at 12:01:07 PM";
    assertEquals("1m 48s", uptime.calcUptime(started, now));
  }

  @Test
  public void case77() {
    String started = "1 Feb 2004 at 12:58:52 AM";
    String now = "1 Mar 2004 at 12:59:52 AM";
    assertEquals("29d 1m", uptime.calcUptime(started, now));
  }

  @Test
  public void case78() {
    String started = "7 Jun 2004 at 04:41:32 PM";
    String now = "8 Dec 2004 at 07:16:28 PM";
    assertEquals("184d 2h 34m 56s", uptime.calcUptime(started, now));
  }

  @Test
  public void case79() {
    String started = "2 Jan 1900 at 12:00:00 AM";
    String now = "2 Jan 1900 at 12:00:00 PM";
    assertEquals("12h", uptime.calcUptime(started, now));
  }

}
