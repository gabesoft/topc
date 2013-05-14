package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TVWatchingTest {
  TVWatching tvwatching = new TVWatching();

  @Test
  public void case1() {
    String[] programs = { "09:00AM - 12:00PM", "02:00PM - 07:00PM", "09:00PM - 02:00AM" };
    assertEquals(780, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case2() {
    String[] programs = { "01:15PM - 11:20PM", "08:00AM - 04:13PM", "03:12PM - 12:06AM", "02:00PM - 02:01PM" };
    assertEquals(605, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case3() {
    String[] programs = { "12:34PM - 12:34PM" };
    assertEquals(1440, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case4() {
    String[] programs = { "11:00PM - 12:00AM", "11:55PM - 12:05AM", "12:00AM - 05:00AM", "06:00PM - 06:30PM", "06:15PM - 06:35PM" };
    assertEquals(390, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case5() {
    String[] programs = { "11:11AM - 12:12AM", "11:11AM - 12:12AM" };
    assertEquals(781, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case6() {
    String[] programs = { "12:00AM - 12:00PM", "12:00PM - 12:00AM" };
    assertEquals(1440, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case7() {
    String[] programs = { "10:46AM - 08:53PM", "10:12AM - 08:02PM", "12:19PM - 07:00PM", "12:16PM - 10:27PM", "03:50AM - 08:07AM", "07:42PM - 04:29AM", "08:16PM - 10:09AM", "09:59AM - 09:38AM", "06:30PM - 09:31PM", "03:33PM - 02:16AM", "09:45AM - 06:56PM", "02:09AM - 04:24PM", "03:45AM - 09:14AM", "08:50PM - 03:36PM", "04:24AM - 08:14PM", "09:00PM - 05:19PM", "07:06AM - 11:15PM", "12:58AM - 03:17AM", "05:12PM - 09:01PM", "10:01AM - 12:04PM", "04:09AM - 12:57AM", "10:35AM - 05:27AM", "07:33AM - 12:46AM", "05:44AM - 06:32AM", "07:59PM - 12:28PM", "01:09AM - 02:38PM", "02:51AM - 05:59PM", "02:08PM - 05:13PM", "01:04PM - 09:47AM", "12:51AM - 05:39PM", "06:11PM - 12:35PM", "03:01AM - 02:29AM", "03:13PM - 04:03PM", "09:09PM - 08:43AM" };
    assertEquals(1423, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case8() {
    String[] programs = { "05:26PM - 01:58PM", "10:09AM - 09:36AM", "12:30PM - 05:59AM", "07:04AM - 03:59PM", "03:09PM - 02:44AM", "05:15PM - 03:11PM", "04:59PM - 05:08PM", "11:11AM - 02:01PM", "06:58PM - 05:56PM", "06:42PM - 07:16PM", "10:44PM - 01:44PM", "12:32AM - 09:10AM", "12:33AM - 02:10PM", "04:40AM - 12:41PM", "10:39AM - 03:48AM", "03:26PM - 11:00PM", "07:36PM - 10:07PM", "07:19AM - 05:32PM", "10:39PM - 07:50AM", "10:06AM - 02:12AM", "08:59AM - 08:44AM", "12:20AM - 12:48PM", "11:24PM - 11:04AM", "02:56PM - 05:44PM", "03:32AM - 03:45AM", "03:40PM - 03:53PM", "03:24AM - 04:21PM", "08:12PM - 12:04AM", "09:33PM - 05:55PM", "05:59AM - 06:25AM", "02:44AM - 07:14AM", "11:04PM - 09:26AM", "01:42PM - 05:49PM", "07:18PM - 02:48PM", "02:03AM - 07:08PM", "07:07PM - 09:09PM", "06:48AM - 08:10AM", "06:03AM - 07:52AM", "05:32AM - 10:08AM" };
    assertEquals(1425, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case9() {
    String[] programs = { "03:00AM - 09:00PM", "03:07PM - 03:16PM", "08:57AM - 03:59PM", "09:03AM - 07:47AM", "12:11PM - 09:19AM", "01:27AM - 01:49AM", "12:49AM - 05:57PM", "06:11AM - 05:47PM", "12:35PM - 11:09PM", "10:20AM - 09:26AM", "01:42AM - 06:03AM", "07:09AM - 04:56AM", "07:54PM - 06:04PM", "10:08PM - 11:32PM", "07:06PM - 09:16PM", "07:49PM - 11:47AM", "12:00AM - 08:37PM", "07:46AM - 03:32PM", "03:39AM - 03:09AM", "09:41AM - 05:27PM", "11:46PM - 10:56PM", "02:40AM - 08:45AM", "06:18AM - 03:13AM", "10:17AM - 07:07AM", "04:34AM - 08:00PM", "06:58PM - 06:54AM", "10:01PM - 08:10AM", "06:19AM - 11:22AM", "04:07PM - 03:42PM", "06:31AM - 06:41PM", "08:11AM - 02:51AM", "07:20PM - 06:38AM", "05:16PM - 04:51PM", "03:04PM - 10:18PM", "05:42AM - 02:57PM", "01:24AM - 08:47AM", "04:04AM - 11:47PM" };
    assertEquals(1415, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case10() {
    String[] programs = { "06:18AM - 09:09AM", "03:05AM - 12:15PM", "05:49AM - 10:38PM", "11:02AM - 10:50PM", "02:46PM - 12:33PM", "10:14AM - 07:17AM", "04:08PM - 07:32AM", "12:26AM - 02:51AM", "09:13AM - 03:31PM", "01:37AM - 11:35PM", "01:30AM - 10:21AM" };
    assertEquals(1318, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case11() {
    String[] programs = { "01:33AM - 11:05PM", "10:23PM - 12:15AM", "08:20PM - 10:43PM", "02:21PM - 12:56PM", "04:18PM - 05:32AM", "03:21PM - 12:52PM", "04:40PM - 11:58AM", "07:47PM - 03:13AM", "04:42PM - 04:42PM", "11:04AM - 07:38PM", "08:58PM - 04:42AM", "08:28PM - 07:52PM", "10:15AM - 04:45AM", "10:56PM - 08:41AM", "12:53AM - 03:48AM", "01:00PM - 11:54AM", "07:36AM - 12:12AM", "03:59PM - 05:16AM", "01:39PM - 10:29AM", "07:34AM - 08:06AM", "08:43AM - 03:32AM", "07:15AM - 11:50PM", "10:51AM - 06:14AM", "09:03AM - 06:02AM", "05:35AM - 11:04PM", "10:51PM - 10:54PM", "02:55PM - 08:15PM", "04:37PM - 06:34AM", "01:27PM - 07:21AM", "07:40AM - 11:25AM", "07:10AM - 05:54PM", "01:40AM - 08:48AM", "09:30PM - 12:38AM", "07:28AM - 08:30PM", "12:05PM - 06:57PM", "04:02PM - 10:57AM", "06:06AM - 10:51PM", "04:48PM - 11:48AM", "07:57PM - 05:19AM", "10:47AM - 11:57PM" };
    assertEquals(1440, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case12() {
    String[] programs = { "08:41PM - 09:38AM", "06:36PM - 03:28PM", "06:08PM - 08:57PM", "02:54PM - 06:05AM", "08:52PM - 06:41PM", "11:19AM - 06:59AM", "06:14PM - 02:52PM", "11:12PM - 12:02AM", "06:54AM - 04:06PM", "08:50AM - 06:32AM", "05:59AM - 04:20PM", "06:10PM - 02:12AM", "02:29AM - 08:23PM", "03:20PM - 01:27AM", "03:52PM - 04:15AM", "03:32AM - 03:16PM", "01:04AM - 06:34PM", "03:06AM - 02:39AM" };
    assertEquals(1413, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case13() {
    String[] programs = { "02:01PM - 06:29AM", "09:13AM - 04:28AM", "06:53PM - 12:09AM" };
    assertEquals(1155, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case14() {
    String[] programs = { "09:28PM - 08:33PM", "11:51AM - 10:40AM", "03:41AM - 09:10PM", "05:15PM - 08:44AM", "05:29AM - 08:38PM", "12:43AM - 01:23PM", "04:01PM - 12:11PM", "06:32PM - 08:08PM", "12:14PM - 12:36AM", "05:07AM - 11:17AM", "10:53PM - 10:18AM", "03:26PM - 02:33PM", "03:25AM - 11:59PM", "05:02AM - 06:00PM", "05:10PM - 02:23PM", "08:08PM - 06:37AM", "09:30AM - 06:30AM", "11:18AM - 10:27AM", "04:00AM - 05:19PM", "07:54AM - 06:12PM", "07:53AM - 08:23AM", "06:14AM - 12:11PM", "11:42PM - 06:55AM", "10:06AM - 10:14AM", "04:02AM - 04:23PM", "01:34PM - 04:19AM", "06:58PM - 06:49PM", "04:33PM - 12:19AM", "10:07AM - 12:50PM", "07:37AM - 06:30PM", "08:44AM - 08:29PM", "06:12PM - 12:25AM", "01:21PM - 01:27AM", "08:02AM - 02:51PM", "03:13PM - 09:54PM", "09:07AM - 02:44PM", "07:00PM - 12:54AM", "09:53AM - 12:32AM", "06:29PM - 02:08AM", "03:35AM - 02:35AM", "09:41PM - 05:11AM", "09:23AM - 04:09PM", "01:18PM - 09:16AM", "07:13AM - 03:10PM" };
    assertEquals(1431, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case15() {
    String[] programs = { "11:41AM - 04:17PM", "12:50PM - 08:53PM", "05:17AM - 12:26PM", "12:45PM - 01:01PM", "07:14AM - 09:16AM", "07:12AM - 12:11AM", "06:01PM - 12:16PM", "05:04PM - 11:07AM", "08:57PM - 01:10PM", "08:56PM - 12:13AM", "12:58AM - 03:57PM", "09:00AM - 01:03PM", "09:29PM - 04:59AM", "06:44PM - 04:04AM", "04:29PM - 05:19AM", "03:26AM - 04:39AM" };
    assertEquals(1362, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case16() {
    String[] programs = { "08:44AM - 08:39AM", "04:08PM - 12:59AM", "09:43AM - 04:39PM", "07:08PM - 11:20PM", "05:38AM - 12:18PM", "08:25PM - 11:06AM", "11:12AM - 10:06PM", "09:07PM - 01:26AM" };
    assertEquals(1435, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case17() {
    String[] programs = { "10:20AM - 12:32AM", "08:11PM - 11:29AM", "07:46AM - 09:45PM", "08:57AM - 05:55AM", "06:54AM - 06:20PM", "06:29AM - 07:19PM", "06:14AM - 03:05PM", "01:46PM - 02:49PM", "11:29AM - 10:15PM", "04:36AM - 05:26PM", "10:46AM - 05:40AM", "12:56PM - 05:04PM", "07:46AM - 12:14PM", "05:26AM - 08:22PM", "01:42PM - 07:07PM", "05:49AM - 09:44PM", "10:42AM - 06:36AM", "04:57AM - 06:22PM", "12:28PM - 02:21PM", "08:48PM - 03:42PM", "08:16PM - 09:51AM", "07:47PM - 07:10AM", "08:13PM - 10:34AM", "03:54PM - 12:35PM", "12:51AM - 10:11PM", "06:01AM - 02:59AM", "01:54AM - 04:26PM", "05:31AM - 08:03AM" };
    assertEquals(1304, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case18() {
    String[] programs = { "12:53AM - 03:20AM", "07:11PM - 04:14PM", "10:07PM - 11:07AM", "03:53AM - 10:12AM", "03:43PM - 02:47AM", "07:55PM - 04:08AM", "07:39AM - 02:16PM", "09:52AM - 04:04AM", "10:20PM - 02:17AM", "09:18AM - 12:50PM", "08:20AM - 08:40PM", "12:07PM - 08:52AM", "12:33PM - 05:02AM", "05:58PM - 02:36AM", "08:23PM - 10:53AM", "10:03PM - 07:04PM", "02:52AM - 11:47PM", "12:54AM - 06:22AM", "04:18AM - 08:18PM", "12:44AM - 09:10AM", "12:23PM - 09:20PM", "01:52PM - 12:47PM", "07:05AM - 05:38PM", "03:40PM - 02:13AM", "10:28PM - 12:49PM", "11:52PM - 11:13PM", "03:07PM - 06:51PM", "03:01PM - 06:18PM", "10:21AM - 03:07PM", "07:12AM - 01:45PM", "05:37PM - 10:01AM", "10:29AM - 01:18AM", "03:58AM - 01:32PM", "02:14AM - 09:23PM", "02:01PM - 11:00PM", "12:14AM - 06:23PM", "11:22AM - 09:03PM" };
    assertEquals(1401, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case19() {
    String[] programs = { "11:18PM - 11:50PM", "05:05PM - 01:20PM", "06:22PM - 08:22AM", "08:37PM - 05:52PM", "07:06PM - 04:09PM" };
    assertEquals(1275, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case20() {
    String[] programs = { "03:09PM - 05:52PM", "01:57PM - 02:17PM", "11:39AM - 07:54PM", "06:23PM - 10:15PM", "08:13PM - 11:14PM", "01:30PM - 05:38AM", "02:21AM - 11:49PM" };
    assertEquals(1288, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case21() {
    String[] programs = { "04:42AM - 02:36AM", "07:59AM - 04:06AM", "11:11PM - 02:25PM", "02:56AM - 06:34PM", "11:47AM - 09:37PM", "07:59AM - 07:26PM", "10:27PM - 08:36AM", "07:37AM - 09:27PM", "09:14AM - 07:55PM", "07:51PM - 12:50AM", "11:22AM - 01:01PM", "08:29AM - 08:15AM", "01:00AM - 05:20AM", "11:16AM - 06:54PM", "01:16PM - 03:25AM", "06:22AM - 11:49AM", "05:15PM - 12:39AM", "01:42AM - 09:59AM", "05:33AM - 11:26PM", "08:14PM - 09:36AM", "11:09PM - 04:44PM", "08:55PM - 03:01PM", "09:22PM - 12:44PM", "01:33PM - 04:49AM", "10:25PM - 11:22PM", "12:05PM - 01:05AM", "08:07PM - 02:58PM", "12:20PM - 08:38PM", "10:56PM - 03:30AM", "04:07AM - 02:55AM", "11:27PM - 08:49PM", "04:51PM - 06:47AM", "02:02PM - 04:16PM", "04:30AM - 02:09AM", "10:30PM - 09:49PM", "01:42PM - 02:55PM", "05:27AM - 09:51PM", "03:24AM - 07:13PM", "02:01AM - 03:14PM", "09:49AM - 11:55PM", "09:03PM - 04:02AM" };
    assertEquals(1426, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case22() {
    String[] programs = { "03:35AM - 03:26AM", "05:43PM - 03:48PM", "04:41AM - 06:55AM", "07:44AM - 09:31AM", "05:27AM - 01:21PM", "12:09PM - 06:54PM", "05:21PM - 05:43AM", "10:51PM - 09:16PM", "09:59PM - 05:10PM", "08:37PM - 05:44PM", "02:45AM - 12:19AM", "01:20AM - 08:16PM", "03:03AM - 07:06PM", "06:34PM - 09:32PM", "10:38AM - 07:04AM", "08:07PM - 07:20AM", "03:47AM - 12:19PM", "03:35PM - 01:24PM", "11:26PM - 11:25PM", "01:43AM - 10:57AM", "05:10PM - 05:49AM", "05:30AM - 12:36PM", "11:48AM - 03:43AM", "06:43PM - 11:41PM", "10:47AM - 07:31PM", "10:44PM - 11:57PM", "09:20PM - 09:21AM", "02:02AM - 09:33PM", "08:44AM - 02:10AM", "05:23PM - 12:52AM", "09:42PM - 10:00PM", "06:50PM - 07:17AM", "09:14PM - 10:34PM", "07:24AM - 09:19PM", "08:20AM - 04:26PM", "10:19PM - 02:01AM", "05:29PM - 02:06AM", "08:19AM - 06:49AM", "10:27AM - 09:40AM", "05:19AM - 12:54PM", "07:04PM - 01:27AM", "06:58AM - 04:51PM", "03:26PM - 08:37AM", "11:58AM - 08:13AM", "03:17PM - 01:40AM", "05:06AM - 12:18AM", "11:52AM - 06:45PM", "12:16AM - 01:22PM", "04:45AM - 05:34PM" };
    assertEquals(1439, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case23() {
    String[] programs = { "07:21PM - 11:01AM", "07:08PM - 07:18PM", "05:02AM - 02:48AM", "01:56PM - 05:18AM", "08:55PM - 05:22PM", "06:22PM - 12:00PM", "08:31PM - 06:29PM", "01:39PM - 01:50AM", "09:06AM - 07:32PM", "02:57AM - 12:43AM", "02:45AM - 02:09PM", "01:55AM - 07:00PM", "02:46PM - 05:29PM", "11:04PM - 11:04PM", "01:12PM - 08:27AM", "06:39AM - 07:08PM", "03:48AM - 03:39AM", "05:51PM - 10:28PM", "07:08PM - 11:49AM", "11:47AM - 06:51PM", "01:23AM - 09:44PM", "09:46PM - 04:01PM", "08:42PM - 04:45PM", "12:43PM - 05:52PM", "05:27PM - 12:34AM", "11:32PM - 07:24PM", "06:02AM - 11:38PM", "06:56AM - 07:42PM", "02:18PM - 06:48PM", "01:08PM - 11:38PM", "12:22PM - 04:14AM", "06:14PM - 12:55PM", "08:04AM - 06:23AM", "05:22AM - 09:00PM", "10:06AM - 04:21AM", "02:27PM - 04:03AM", "11:30PM - 06:50AM", "10:57PM - 02:24PM", "12:58PM - 12:13PM" };
    assertEquals(1440, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case24() {
    String[] programs = { "08:57PM - 12:10PM", "01:37PM - 05:33PM", "07:03PM - 12:54PM", "02:43PM - 03:59PM", "02:49PM - 05:02AM", "06:04PM - 05:02AM", "06:24PM - 07:01PM", "11:07PM - 09:59AM", "08:25PM - 11:00PM", "01:52AM - 07:23AM" };
    assertEquals(1344, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case25() {
    String[] programs = { "08:10PM - 12:13PM", "09:37PM - 04:30PM", "06:37PM - 06:37AM", "05:54PM - 03:54PM", "03:39PM - 10:02AM", "12:42PM - 01:34AM", "07:06PM - 01:54AM", "07:42PM - 12:36AM", "06:52AM - 01:14AM", "04:40PM - 06:24AM", "04:22PM - 02:26AM" };
    assertEquals(1320, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case26() {
    String[] programs = { "02:36PM - 02:30AM", "12:05AM - 11:33PM", "05:25AM - 09:39PM", "04:12PM - 09:36AM", "04:50PM - 05:17AM", "09:51PM - 08:17AM", "01:18AM - 10:47AM", "12:17AM - 07:52AM", "07:58PM - 12:07PM", "02:46AM - 07:52PM", "02:17PM - 11:31AM", "09:19AM - 12:26AM", "05:43PM - 09:49PM", "12:46AM - 11:47PM", "09:11AM - 06:55PM", "03:43AM - 03:55PM", "10:03PM - 12:02PM", "11:35PM - 12:51AM", "11:38PM - 02:07PM", "05:39PM - 04:12AM", "03:56PM - 11:34PM", "06:22AM - 12:22PM", "04:14PM - 07:31PM", "09:40PM - 08:48AM", "03:02AM - 04:44AM", "04:56AM - 02:46AM", "04:30PM - 07:43PM", "09:35AM - 08:41AM", "12:51PM - 12:59AM", "06:36PM - 03:46AM", "03:31PM - 05:10PM", "11:48AM - 06:10AM", "09:20PM - 06:37AM", "10:01AM - 01:09PM", "06:52PM - 04:50PM" };
    assertEquals(1412, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case27() {
    String[] programs = { "09:10PM - 01:20PM", "11:00AM - 04:11AM", "04:23AM - 01:01PM", "02:54AM - 03:03PM", "08:47PM - 11:30PM", "01:29PM - 09:09PM", "02:55PM - 01:07AM", "04:38PM - 09:17PM", "03:35PM - 10:25PM", "02:45AM - 08:01AM", "01:59AM - 03:29AM", "10:07PM - 09:35PM", "11:34PM - 08:04PM", "08:46AM - 01:06PM", "10:28AM - 03:37PM", "02:12AM - 07:23AM", "06:23PM - 09:11AM", "11:52AM - 07:48AM", "05:44PM - 12:35PM", "08:24AM - 02:49AM", "02:14PM - 06:15PM", "05:46AM - 04:34AM", "12:03AM - 12:27AM", "01:02AM - 04:24PM", "04:58PM - 10:29AM", "12:42PM - 07:36AM", "09:40AM - 07:01AM", "03:58PM - 06:05PM" };
    assertEquals(1430, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case28() {
    String[] programs = { "03:23AM - 06:47PM" };
    assertEquals(924, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case29() {
    String[] programs = { "05:25PM - 02:58PM", "04:45PM - 04:39PM", "07:11AM - 06:17AM", "05:11PM - 07:32PM", "09:55AM - 06:34AM", "07:19AM - 05:17PM", "06:57PM - 01:05AM", "04:45AM - 10:26AM", "01:05AM - 10:33AM", "05:19AM - 04:57PM", "03:30AM - 09:08AM", "10:46AM - 04:00AM", "05:13AM - 08:49PM", "05:10PM - 03:23AM", "02:34PM - 11:05AM", "06:21AM - 02:56AM" };
    assertEquals(1434, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case30() {
    String[] programs = { "04:15AM - 11:16PM", "03:21AM - 02:02AM", "07:04PM - 09:27AM", "10:01AM - 09:58PM", "06:20PM - 11:16AM", "02:56PM - 10:05PM", "08:16AM - 02:55PM", "07:33PM - 02:05PM", "08:52PM - 06:56PM", "02:06AM - 11:34AM", "11:16PM - 05:36PM", "09:43AM - 08:20PM", "05:38PM - 10:03PM", "07:23AM - 07:41PM", "01:47PM - 04:02PM", "08:11PM - 08:06PM", "07:10PM - 07:37PM", "10:29PM - 01:44PM", "04:48PM - 10:35PM", "09:03PM - 04:17AM", "07:49PM - 01:12PM", "11:30PM - 12:01AM", "10:39PM - 06:49PM", "10:37AM - 09:47PM", "04:15AM - 10:52PM", "03:19PM - 07:54AM", "06:56AM - 07:24AM", "02:15PM - 07:07AM", "01:03PM - 04:27PM", "12:51AM - 04:12PM", "11:16AM - 09:23AM" };
    assertEquals(1435, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case31() {
    String[] programs = { "07:52AM - 05:09PM", "06:16PM - 05:16AM", "09:19AM - 12:38AM", "11:22AM - 02:34AM", "01:51PM - 01:06PM", "06:20PM - 03:35AM", "07:40PM - 11:26PM", "11:56PM - 05:25PM", "03:11PM - 06:00PM", "01:13PM - 07:54PM", "07:52AM - 06:52AM", "02:01PM - 05:20PM", "01:30PM - 06:29AM" };
    assertEquals(1395, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case32() {
    String[] programs = { "08:40AM - 01:40AM", "01:54AM - 11:40PM", "05:32AM - 03:16AM", "04:18AM - 08:30AM", "12:52PM - 06:21AM", "02:36PM - 11:16AM", "09:05AM - 01:37PM", "01:35PM - 05:20PM", "03:23PM - 09:38AM", "02:08AM - 03:22PM", "08:57AM - 12:15AM", "05:50AM - 06:06AM", "09:32AM - 10:42PM", "09:55PM - 04:59AM", "12:54PM - 02:01PM", "11:41AM - 02:35PM", "09:06AM - 03:18PM", "11:25AM - 05:09PM", "12:45PM - 03:15AM", "10:10PM - 03:30AM", "09:13AM - 08:10AM", "02:23AM - 12:56AM", "02:26AM - 11:29AM", "12:17AM - 03:58AM", "06:17PM - 04:16AM", "05:15AM - 04:13PM" };
    assertEquals(1414, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case33() {
    String[] programs = { "10:54AM - 02:50PM", "07:16AM - 09:46PM", "08:55AM - 02:53AM", "07:11AM - 03:27PM", "07:42AM - 10:47AM", "04:03AM - 10:18PM", "03:34PM - 05:25PM" };
    assertEquals(1095, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case34() {
    String[] programs = { "08:59AM - 01:45PM", "12:56PM - 02:15PM", "08:49PM - 10:37AM", "05:40PM - 03:51PM", "09:25PM - 01:43PM", "12:43AM - 09:12PM", "09:17AM - 04:43PM", "06:59AM - 11:31PM", "07:11AM - 10:27AM", "04:50AM - 03:28AM", "10:31PM - 02:32AM" };
    assertEquals(1358, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case35() {
    String[] programs = { "02:30AM - 10:05AM", "07:57AM - 05:28AM", "03:31PM - 05:59AM", "12:41PM - 02:01AM", "03:32PM - 04:57AM", "03:47PM - 12:39AM", "09:08AM - 06:27AM", "01:41PM - 04:21PM", "09:27AM - 11:49PM" };
    assertEquals(1291, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case36() {
    String[] programs = { "07:10AM - 02:07PM", "04:55PM - 08:26PM", "04:34AM - 01:02AM", "02:35AM - 09:56AM", "06:15PM - 04:05PM", "02:46PM - 10:07AM", "09:29AM - 11:57PM", "09:29AM - 03:35PM", "02:30AM - 03:45AM", "06:52PM - 03:58AM", "01:16AM - 12:12PM", "05:57PM - 07:58PM", "12:22PM - 03:30AM", "09:02PM - 10:55PM", "06:28PM - 04:19PM", "12:04AM - 12:55PM", "10:59AM - 12:11AM", "03:49PM - 01:36AM", "07:17AM - 02:35AM", "06:12PM - 05:30PM", "02:18AM - 01:31AM", "01:00PM - 04:13AM", "06:08AM - 06:14AM", "11:43AM - 02:21PM", "06:36PM - 04:28PM", "11:40AM - 10:36PM", "02:03PM - 03:15AM", "11:02PM - 06:32AM", "01:13AM - 02:01AM", "02:49PM - 07:59PM", "03:42PM - 07:01AM", "10:37AM - 01:37AM", "04:05PM - 04:49AM", "05:19AM - 06:50AM", "12:51PM - 03:42PM", "09:28AM - 03:28AM", "04:05AM - 06:20AM", "03:26PM - 04:22AM", "03:31PM - 10:20AM", "01:03PM - 11:32AM" };
    assertEquals(1398, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case37() {
    String[] programs = { "04:02AM - 10:22AM", "06:20PM - 11:40AM", "05:58PM - 12:20AM", "03:51AM - 04:04AM", "04:07AM - 03:31PM", "09:22PM - 12:09AM", "08:08PM - 04:20PM", "03:10PM - 11:04PM", "07:53PM - 03:27AM", "02:58PM - 10:57PM", "12:04AM - 09:38PM", "10:37AM - 06:46PM", "04:40PM - 08:39AM", "06:49AM - 09:29AM", "11:40PM - 08:38AM", "12:35PM - 06:40AM", "12:08PM - 10:11AM", "06:29AM - 09:02PM", "02:53AM - 11:02AM", "03:25AM - 10:01AM", "09:15PM - 01:19PM", "09:32AM - 08:54PM", "05:30AM - 11:53PM", "04:43AM - 06:55PM", "11:02PM - 05:48AM", "12:09AM - 07:09AM", "08:27AM - 06:24PM", "12:54AM - 09:22AM", "05:34AM - 12:03PM", "06:19AM - 06:02AM", "07:33PM - 05:37PM", "08:52AM - 01:20AM", "11:10PM - 09:53AM", "11:23AM - 03:24PM", "10:58AM - 12:31AM", "10:48AM - 03:04AM", "07:39AM - 03:48AM", "06:27AM - 11:14PM", "02:37PM - 02:20PM", "05:18PM - 12:33AM", "05:46PM - 09:06PM" };
    assertEquals(1423, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case38() {
    String[] programs = { "06:27PM - 12:16AM", "05:43AM - 04:49AM", "09:18AM - 03:38PM", "07:56PM - 10:22AM" };
    assertEquals(1386, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case39() {
    String[] programs = { "03:13PM - 01:10PM", "06:37PM - 06:45PM", "10:29AM - 05:10PM", "06:29AM - 08:07AM", "02:56AM - 11:18AM", "05:18AM - 07:25AM", "12:05AM - 10:21PM", "07:17AM - 05:34PM", "02:18AM - 02:38PM", "10:43AM - 08:19AM", "02:16AM - 03:43AM", "12:58AM - 10:59PM", "07:13PM - 10:45PM", "04:13PM - 10:34AM", "10:26PM - 05:59AM", "01:42PM - 12:34AM", "02:35PM - 02:32AM", "07:54PM - 04:10AM", "09:15PM - 07:53PM", "01:56AM - 12:12AM", "07:51AM - 09:19PM", "08:54AM - 09:41PM", "07:52AM - 10:46PM", "01:41AM - 06:56AM", "06:16PM - 10:01AM", "01:30AM - 12:51AM", "07:47AM - 12:08AM", "08:47AM - 11:04PM", "04:20PM - 12:57AM" };
    assertEquals(1401, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case40() {
    String[] programs = { "03:55AM - 12:48PM", "04:18PM - 04:09AM", "02:48PM - 05:57AM", "12:44AM - 10:40AM", "06:00PM - 09:58AM", "09:19PM - 09:16AM", "08:00AM - 09:26PM", "10:30AM - 11:14AM", "11:52PM - 03:21PM", "07:50AM - 09:36AM", "08:04AM - 04:02PM", "05:39AM - 11:56AM", "05:04PM - 08:53PM", "04:02PM - 05:11PM", "11:21AM - 12:24AM", "08:51AM - 10:39PM", "01:27PM - 02:34AM", "06:01AM - 04:30PM", "10:56AM - 09:57AM", "10:03PM - 02:08AM", "06:02PM - 01:55AM", "04:03AM - 02:28PM", "07:19PM - 01:14AM", "10:21PM - 07:22AM", "02:40PM - 03:48PM", "09:23AM - 08:29AM", "11:00PM - 07:35AM", "02:12AM - 05:46PM", "02:03AM - 12:05AM", "08:56PM - 08:49PM", "11:15PM - 04:50AM", "04:05PM - 04:43PM", "08:54PM - 06:55PM", "09:09AM - 02:24PM", "03:29PM - 04:44AM", "07:44PM - 01:41AM", "06:20AM - 05:38PM", "11:11AM - 10:01PM", "12:23PM - 04:46AM", "10:24AM - 06:50PM", "06:00PM - 11:00PM", "08:35AM - 02:22AM", "01:12AM - 06:09AM", "05:51PM - 03:29AM", "08:01PM - 10:22AM", "10:15AM - 10:53AM", "02:08PM - 12:55PM", "05:51PM - 02:56PM", "10:51PM - 03:45AM", "08:55PM - 11:49AM" };
    assertEquals(1433, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case41() {
    String[] programs = { "04:37PM - 05:30AM", "10:30PM - 02:26PM", "06:17PM - 11:05PM", "08:49AM - 03:34PM", "10:21PM - 08:11AM", "01:08PM - 12:26AM" };
    assertEquals(1178, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case42() {
    String[] programs = { "01:53AM - 06:11AM", "11:20PM - 10:26PM", "09:07AM - 11:41AM", "01:55AM - 12:58AM", "05:06AM - 04:32PM", "01:15AM - 01:15PM", "09:22AM - 03:54PM", "10:33PM - 08:36AM", "03:26AM - 01:09PM", "11:20PM - 11:30AM", "06:58PM - 09:39PM", "08:42PM - 06:39AM", "03:17PM - 08:39AM", "10:48AM - 11:45AM", "12:46AM - 10:50AM", "08:22AM - 04:58AM", "10:50PM - 05:26PM", "10:57PM - 05:30AM", "06:45PM - 07:31AM", "09:52PM - 12:48AM", "02:33PM - 12:24AM", "06:44PM - 08:38PM" };
    assertEquals(1386, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case43() {
    String[] programs = { "10:09AM - 03:39PM", "08:16AM - 06:47PM", "03:32PM - 02:12AM" };
    assertEquals(640, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case44() {
    String[] programs = { "12:30PM - 04:41PM", "08:26PM - 05:45AM", "06:46PM - 08:17PM", "07:26AM - 01:13AM", "07:37AM - 08:49PM", "02:27PM - 11:29AM", "01:15PM - 02:31PM", "05:42PM - 10:06AM", "04:41PM - 06:48PM", "11:58PM - 01:05AM", "08:16PM - 01:06PM", "08:15PM - 07:07AM", "02:08AM - 12:14AM", "05:11PM - 10:11AM", "08:07PM - 05:33PM", "09:54AM - 07:24AM", "10:52PM - 06:36PM", "06:14AM - 12:31AM", "11:30AM - 03:53PM", "10:28AM - 12:10PM", "06:24PM - 11:45AM", "03:34PM - 04:06AM", "10:37PM - 09:48AM", "04:55PM - 01:15PM", "05:43AM - 08:11PM", "12:43PM - 10:19PM", "08:22PM - 07:51AM", "08:44PM - 12:27AM", "12:48PM - 03:00PM", "02:22PM - 05:38AM", "04:36AM - 12:56PM", "10:54AM - 05:39AM", "02:22PM - 09:27PM", "01:08AM - 02:04AM", "04:52PM - 10:00AM", "11:40PM - 11:59AM", "06:51AM - 01:34AM", "03:24PM - 10:56PM", "06:44AM - 10:43PM", "02:00AM - 07:19AM", "03:42AM - 02:44AM", "09:54PM - 07:09PM", "07:20AM - 08:21PM", "08:29PM - 08:10AM", "08:40AM - 07:14AM", "01:13AM - 10:22PM" };
    assertEquals(1386, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case45() {
    String[] programs = { "11:31PM - 09:40PM", "04:00AM - 03:21PM", "02:43PM - 09:45AM", "09:26PM - 03:32AM", "04:45PM - 05:59PM", "12:12PM - 04:10AM", "08:01PM - 10:30PM", "09:36AM - 06:16PM", "12:32PM - 08:24PM", "05:48AM - 08:08AM", "01:35PM - 11:23AM", "04:08AM - 11:48PM", "11:10PM - 08:46AM", "04:34AM - 04:42PM", "04:20AM - 05:22PM", "04:47PM - 07:00AM", "04:31PM - 04:14PM", "07:22AM - 05:30PM", "03:32AM - 01:37PM", "01:33PM - 11:42PM", "11:11AM - 03:03AM", "10:22PM - 05:17PM", "07:01PM - 02:12PM", "02:06PM - 03:07PM" };
    assertEquals(1423, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case46() {
    String[] programs = { "05:15PM - 08:50PM", "10:01AM - 12:04PM", "01:27AM - 09:36AM", "04:29AM - 09:34AM", "02:32AM - 08:40AM", "03:20AM - 05:52PM", "06:44AM - 03:51PM", "10:23AM - 02:56AM", "11:29PM - 09:12PM", "06:25AM - 02:22PM", "02:23AM - 06:37AM" };
    assertEquals(1303, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case47() {
    String[] programs = {  };
    assertEquals(0, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case48() {
    String[] programs = { "05:00AM - 06:00AM", "11:27PM - 11:50PM", "11:50PM - 05:10AM", "11:59AM - 12:00PM" };
    assertEquals(344, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case49() {
    String[] programs = { "09:00AM - 10:00AM", "09:30AM - 10:30PM", "10:00AM - 11:00AM", "10:30AM - 11:30PM", "11:00AM - 12:00AM", "11:30AM - 12:30PM", "12:00PM - 01:00AM", "12:30AM - 01:30PM", "01:00AM - 02:00AM", "01:30AM - 02:30PM", "02:00AM - 03:00AM", "02:30AM - 03:30PM", "03:00AM - 04:00AM", "03:30AM - 04:30PM", "04:00AM - 05:00AM", "04:30AM - 05:30PM", "05:00AM - 06:00AM", "05:30AM - 06:30PM", "06:00AM - 07:00AM", "06:30AM - 07:30PM", "07:00AM - 08:00AM", "07:30AM - 08:30PM", "08:00AM - 09:00AM", "08:30AM - 09:30PM", "09:00AM - 10:00AM", "09:30AM - 10:30PM", "10:00AM - 11:00AM", "10:30AM - 11:30PM", "11:00AM - 12:00AM", "11:30AM - 12:30PM", "12:00AM - 01:00AM", "12:30AM - 01:30PM", "01:00AM - 02:00AM", "01:30AM - 02:30PM", "02:00AM - 03:00AM", "02:30AM - 03:30PM", "03:00AM - 04:00AM", "03:30AM - 04:30PM", "04:00AM - 05:00AM", "04:30AM - 05:30PM", "05:00AM - 06:00AM", "05:30AM - 06:30PM", "06:00AM - 07:00AM", "06:30AM - 07:30PM", "07:00AM - 08:00AM", "07:30AM - 08:30PM", "08:00AM - 09:00AM", "08:30AM - 09:32PM" };
    assertEquals(1440, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case50() {
    String[] programs = { "07:44AM - 05:31AM", "05:48AM - 02:34AM", "02:23AM - 03:55AM", "02:25AM - 09:18AM", "01:02AM - 10:23AM", "04:13AM - 09:23AM", "10:45AM - 11:05AM", "03:21AM - 10:08AM", "04:45AM - 05:49AM", "11:48AM - 07:24AM", "06:27AM - 02:49AM", "01:21AM - 06:18AM", "08:12AM - 04:34AM", "01:09AM - 10:36AM", "02:50AM - 08:48AM", "03:15AM - 08:27AM", "05:03AM - 01:48AM", "06:45AM - 02:46AM", "07:41AM - 06:32AM", "07:35AM - 09:00AM", "11:22AM - 05:15AM", "09:56AM - 08:49AM", "05:56AM - 02:23AM", "03:57AM - 09:05AM", "04:45AM - 02:06AM", "09:38AM - 07:07AM", "03:03AM - 05:20AM", "10:52AM - 09:04AM", "11:29AM - 01:36AM", "10:10AM - 05:06AM", "04:41AM - 10:54AM", "06:50AM - 10:51AM", "04:46AM - 03:53AM", "03:35AM - 02:11AM", "08:46AM - 01:38AM", "02:48AM - 01:03AM", "11:57AM - 08:16AM", "09:00AM - 10:39AM", "05:39AM - 01:10AM", "09:13AM - 03:13AM", "02:25AM - 10:44AM", "05:18AM - 11:14AM", "03:32AM - 06:21AM", "11:47AM - 03:36AM", "08:04AM - 05:14AM", "02:43AM - 10:32AM", "01:51AM - 07:27AM", "02:25AM - 04:48AM", "02:17AM - 04:15AM", "01:55AM - 03:11AM" };
    assertEquals(1429, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case51() {
    String[] programs = { "01:42PM - 01:14AM", "05:27PM - 10:01PM", "08:31AM - 04:07AM", "12:51PM - 04:49PM", "02:00PM - 01:48AM", "11:53PM - 04:49AM", "04:04PM - 11:57AM", "02:36PM - 08:54PM", "04:00PM - 01:04PM", "12:29PM - 02:37AM", "06:58PM - 12:50PM", "07:19PM - 08:12AM", "06:05AM - 03:41AM", "02:05PM - 02:14PM", "11:21AM - 01:18PM", "12:40PM - 01:18PM", "05:24PM - 08:18PM", "10:55AM - 11:45PM", "05:02PM - 01:36AM", "09:43PM - 02:24AM", "09:44AM - 06:36PM", "10:17PM - 03:27PM", "07:11PM - 04:45AM", "07:45AM - 02:15AM", "01:58AM - 07:10PM", "08:06AM - 06:05AM", "08:40PM - 09:41AM", "04:32PM - 06:40AM", "05:31AM - 05:01AM", "03:24PM - 12:09AM", "08:10PM - 02:31PM", "09:41PM - 09:01PM", "12:48PM - 04:20AM", "01:26AM - 09:10AM", "06:05AM - 12:40AM", "05:17AM - 04:33PM", "03:56AM - 10:52PM", "08:49PM - 04:49PM", "07:20AM - 04:02AM", "09:23PM - 08:00AM", "02:55PM - 10:22AM", "03:44PM - 05:46AM", "11:16PM - 03:54AM", "02:22PM - 09:13AM", "09:15AM - 06:08AM", "06:24AM - 10:18PM", "11:06AM - 06:27AM", "12:40AM - 10:47PM", "11:48PM - 02:18AM", "05:12AM - 09:33AM" };
    assertEquals(1414, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case52() {
    String[] programs = {  };
    assertEquals(0, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case53() {
    String[] programs = { "12:34PM - 01:34AM", "02:34AM - 11:34PM" };
    assertEquals(1260, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case54() {
    String[] programs = { "12:00AM - 02:00PM", "02:00PM - 01:00PM" };
    assertEquals(1380, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case55() {
    String[] programs = { "12:34PM - 12:34PM" };
    assertEquals(1440, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case56() {
    String[] programs = { "01:00AM - 01:10AM", "01:05AM - 01:25AM", "01:10AM - 01:20AM", "01:20AM - 01:30AM", "01:25AM - 01:45AM", "01:30AM - 01:40AM", "01:40AM - 01:50AM", "01:45AM - 02:05AM", "01:50AM - 02:00AM", "02:00AM - 02:10AM", "02:05AM - 02:25AM", "02:10AM - 02:20AM", "02:20AM - 02:30AM", "02:25AM - 02:45AM", "02:30AM - 02:40AM", "02:40AM - 02:50AM", "02:45AM - 03:05AM", "02:50AM - 03:00AM", "03:00AM - 03:10AM", "03:05AM - 03:25AM", "03:10AM - 03:20AM", "03:20AM - 03:30AM", "03:25AM - 03:45AM", "03:30AM - 03:40AM", "03:40AM - 03:50AM", "03:45AM - 04:05AM", "03:50AM - 04:00AM", "04:00AM - 04:10AM", "04:05AM - 04:25AM", "04:10AM - 04:20AM", "04:20AM - 04:30AM", "04:25AM - 04:45AM", "04:30AM - 04:40AM", "04:40AM - 04:50AM", "04:45AM - 05:05AM", "04:50AM - 05:00AM", "05:00AM - 05:10AM", "05:05AM - 05:25AM", "05:10AM - 05:20AM", "05:20AM - 05:30AM", "05:25AM - 05:45AM", "05:30AM - 05:40AM", "05:40AM - 05:50AM", "05:45AM - 06:05AM", "05:50AM - 06:00AM", "06:00AM - 06:10AM", "06:05AM - 06:25AM", "06:10AM - 06:20AM", "06:21AM - 06:22AM" };
    assertEquals(321, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case57() {
    String[] programs = { "01:01PM - 01:01PM", "01:02PM - 01:02PM", "01:03PM - 01:03PM", "01:04PM - 01:04PM", "01:05PM - 01:05PM", "01:06PM - 01:06PM", "01:07PM - 01:07PM", "01:08PM - 01:08PM", "01:09PM - 01:09PM", "01:10PM - 01:10PM", "01:11PM - 01:11PM", "01:12PM - 01:12PM", "01:13PM - 01:13PM", "01:14PM - 01:14PM", "01:15PM - 01:15PM", "01:16PM - 01:16PM", "01:17PM - 01:17PM", "01:18PM - 01:18PM", "01:19PM - 01:19PM", "01:20PM - 01:20PM", "01:21PM - 01:21PM", "01:22PM - 01:22PM", "01:23PM - 01:23PM", "01:24PM - 01:24PM", "01:25PM - 01:25PM", "01:26PM - 01:26PM", "01:27PM - 01:27PM", "01:28PM - 01:28PM", "01:29PM - 01:29PM", "01:30PM - 01:30PM", "01:31PM - 01:31PM", "01:32PM - 01:32PM", "01:33PM - 01:33PM", "01:34PM - 01:34PM", "01:35PM - 01:35PM", "01:36PM - 01:36PM", "01:37PM - 01:37PM", "01:38PM - 01:38PM", "01:39PM - 01:39PM", "01:40PM - 01:40PM", "01:41PM - 01:41PM", "01:42PM - 01:42PM", "01:43PM - 01:43PM", "01:44PM - 01:44PM", "01:45PM - 01:45PM", "01:46PM - 01:46PM", "01:47PM - 01:47PM", "01:48PM - 01:48PM", "01:49PM - 01:49PM", "01:50PM - 01:50PM" };
    assertEquals(1440, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case58() {
    String[] programs = { "01:00AM - 01:10AM", "01:05AM - 01:25AM", "01:10AM - 01:20AM", "01:20AM - 01:30AM", "01:25AM - 01:45AM", "01:30AM - 01:40AM", "01:40AM - 01:50AM", "01:45AM - 02:05AM", "01:50AM - 02:00AM", "02:00AM - 02:10AM", "02:05AM - 02:25AM", "02:10AM - 02:20AM", "02:20AM - 02:30AM", "02:25AM - 02:45AM", "02:30AM - 02:40AM", "02:40AM - 02:50AM", "02:45AM - 03:05AM", "02:50AM - 03:00AM", "03:00AM - 03:10AM", "03:05AM - 03:25AM", "03:10AM - 03:20AM", "03:20AM - 03:30AM", "03:25AM - 03:45AM", "03:30AM - 03:40AM", "03:40AM - 03:50AM", "03:45AM - 04:05AM", "03:50AM - 04:00AM", "04:00AM - 04:10AM", "04:05AM - 04:25AM", "04:10AM - 04:20AM", "04:20AM - 04:30AM", "04:25AM - 04:45AM", "04:30AM - 04:40AM", "04:40AM - 04:50AM", "04:45AM - 05:05AM", "04:50AM - 05:00AM", "05:00AM - 05:10AM", "05:05AM - 05:25AM", "05:10AM - 05:20AM", "05:20AM - 05:30AM", "05:25AM - 05:45AM", "05:30AM - 05:40AM", "05:40AM - 05:50AM", "05:45AM - 06:05AM", "05:50AM - 06:00AM", "06:00AM - 06:10AM", "06:05AM - 06:25AM", "06:10AM - 06:20AM", "01:00AM - 01:01AM" };
    assertEquals(321, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case59() {
    String[] programs = { "01:00AM - 02:00AM", "11:00PM - 03:00AM" };
    assertEquals(240, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case60() {
    String[] programs = { "07:18AM - 11:13AM", "03:49PM - 01:10PM", "05:49PM - 06:39AM", "04:49AM - 11:27AM", "08:48PM - 08:15AM", "05:41AM - 08:37PM", "10:48AM - 07:27AM", "10:14AM - 06:02PM", "03:40AM - 05:42AM", "09:58AM - 06:19AM", "01:23AM - 11:05PM", "09:22PM - 02:15PM", "07:32PM - 08:15PM", "05:46PM - 08:58AM", "02:55PM - 10:51AM", "06:40AM - 02:10PM", "12:06PM - 11:08AM", "12:28AM - 08:05AM", "01:01PM - 12:08PM", "04:08PM - 05:12PM", "07:44AM - 06:52PM", "02:54AM - 03:41PM", "02:09PM - 10:39PM", "08:56AM - 07:00PM", "06:29AM - 02:32PM", "07:04AM - 06:41PM", "10:58PM - 02:15AM", "09:12PM - 02:11AM", "09:27AM - 09:00AM", "07:06PM - 08:08PM", "09:01PM - 11:44PM", "04:33PM - 11:41PM", "11:46AM - 07:39AM", "06:31AM - 09:27AM", "11:54AM - 04:49PM", "01:15AM - 10:45AM", "01:17PM - 04:38PM", "08:26AM - 09:22AM", "07:27AM - 05:48AM", "08:52PM - 06:42AM", "06:15PM - 05:47AM", "05:28PM - 09:43PM", "09:17AM - 06:56AM", "02:30AM - 11:38AM", "01:28PM - 12:24PM", "01:19AM - 02:08PM", "11:18AM - 08:32AM", "02:16AM - 05:34PM", "06:53PM - 09:33PM", "01:41AM - 12:55AM" };
    assertEquals(1413, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case61() {
    String[] programs = { "01:00AM - 02:00AM", "03:00AM - 01:30AM" };
    assertEquals(1350, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case62() {
    String[] programs = { "11:59AM - 12:00PM", "11:59PM - 12:00AM", "07:12AM - 06:16PM", "05:13PM - 09:25PM", "10:33PM - 03:05AM", "12:27AM - 09:39PM", "11:16PM - 07:16AM", "08:10PM - 06:39AM", "08:53AM - 09:39AM", "11:50AM - 09:00AM", "12:19AM - 06:10AM", "07:03PM - 04:03PM", "07:24PM - 03:09PM", "07:14AM - 11:37PM", "10:03AM - 08:31PM", "04:52PM - 02:28PM", "11:25AM - 08:29PM", "07:26AM - 07:47AM", "04:52AM - 04:07AM", "05:08AM - 02:21PM", "07:39PM - 10:54PM", "05:55PM - 02:34PM", "03:32PM - 11:01PM", "11:42PM - 01:10AM", "07:02AM - 12:46PM", "06:30PM - 12:02PM", "05:48AM - 09:54PM", "06:28PM - 09:31AM", "06:50AM - 01:22AM", "12:05AM - 03:41PM", "08:39AM - 08:59AM", "03:46PM - 11:57PM", "06:43AM - 02:59PM", "11:43AM - 04:42PM", "07:32PM - 06:05AM", "04:52PM - 02:15PM", "09:31AM - 02:17PM", "03:14AM - 10:21AM", "03:56AM - 05:07PM", "09:58PM - 10:33AM", "09:06PM - 10:48PM", "05:02AM - 10:14PM", "07:04AM - 04:41AM", "03:00PM - 04:37PM", "03:37PM - 01:27PM", "05:14PM - 12:54AM", "09:48PM - 09:24AM", "02:29PM - 01:32PM", "01:24AM - 03:04AM", "08:03PM - 01:52PM" };
    assertEquals(1428, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case63() {
    String[] programs = { "01:00AM - 01:01AM", "01:10AM - 01:11AM", "01:20AM - 01:21AM", "01:30AM - 01:31AM", "01:40AM - 01:41AM", "01:50AM - 01:51AM", "02:00AM - 02:01AM", "02:10AM - 02:11AM", "02:20AM - 02:21AM", "02:30AM - 02:31AM", "02:40AM - 02:41AM", "02:50AM - 02:51AM", "03:00AM - 03:01AM", "03:10AM - 03:11AM", "03:20AM - 03:21AM", "03:30AM - 03:31AM", "03:40AM - 03:41AM", "03:50AM - 03:51AM", "04:00AM - 04:01AM", "04:10AM - 04:11AM", "04:20AM - 04:21AM", "04:30AM - 04:31AM", "04:40AM - 04:41AM", "04:50AM - 04:51AM", "05:00AM - 05:01AM", "05:10AM - 05:11AM", "05:20AM - 05:21AM", "05:30AM - 05:31AM", "05:40AM - 05:41AM", "05:50AM - 05:51AM", "06:00AM - 06:01AM", "06:10AM - 06:11AM", "06:20AM - 06:21AM", "06:30AM - 06:31AM", "06:40AM - 06:41AM", "06:50AM - 06:51AM", "07:00AM - 07:01AM", "07:10AM - 07:11AM", "07:20AM - 07:21AM", "07:30AM - 07:31AM", "07:40AM - 07:41AM", "07:50AM - 07:51AM", "08:00AM - 08:01AM", "08:10AM - 08:11AM", "08:20AM - 08:21AM", "08:30AM - 08:31AM", "08:40AM - 08:41AM", "08:50AM - 08:51AM", "09:00AM - 09:01AM", "09:10AM - 09:11AM" };
    assertEquals(50, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case64() {
    String[] programs = { "06:00PM - 01:00AM", "11:00PM - 06:01AM" };
    assertEquals(421, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case65() {
    String[] programs = { "10:00AM - 12:00PM", "10:00PM - 10:01PM", "10:01PM - 10:03PM", "10:04PM - 10:06PM", "10:08PM - 10:10PM", "10:12PM - 10:14PM", "10:16PM - 10:18PM", "10:20PM - 10:22PM", "10:24PM - 10:26PM", "10:28PM - 10:30PM", "10:32PM - 10:34PM", "10:36PM - 10:38PM", "10:40PM - 10:42PM", "10:44PM - 10:46PM", "10:48PM - 10:50PM", "10:52PM - 10:54PM", "10:56PM - 10:58PM", "11:00PM - 11:01PM", "11:00PM - 11:01PM", "11:01PM - 11:03PM", "11:04PM - 11:06PM", "11:08PM - 11:10PM", "11:12PM - 11:14PM", "11:16PM - 11:18PM", "11:20PM - 11:22PM", "11:24PM - 11:26PM", "11:28PM - 11:30PM", "11:32PM - 11:34PM", "11:40PM - 11:42PM", "11:44PM - 11:46PM", "11:48PM - 11:50PM", "11:52PM - 11:54PM", "11:56PM - 11:58PM", "09:00PM - 09:01PM", "09:01PM - 09:03PM", "09:04PM - 09:06PM", "09:08PM - 09:10PM", "09:12PM - 09:14PM", "09:20PM - 09:22PM", "09:24PM - 09:26PM", "09:28PM - 09:30PM" };
    assertEquals(195, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case66() {
    String[] programs = { "09:00AM - 12:00PM" };
    assertEquals(180, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case67() {
    String[] programs = { "09:00PM - 03:00AM", "01:00AM - 02:00AM" };
    assertEquals(360, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case68() {
    String[] programs = { "12:00AM - 12:01AM", "12:02AM - 12:03AM", "12:01AM - 12:02AM", "12:03AM - 12:04AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM", "12:00AM - 12:01AM" };
    assertEquals(4, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case69() {
    String[] programs = { "12:00PM - 12:34PM" };
    assertEquals(34, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case70() {
    String[] programs = { "02:00PM - 05:00PM", "06:00PM - 06:00PM" };
    assertEquals(1440, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case71() {
    String[] programs = { "12:00AM - 12:00PM", "06:00PM - 06:00AM" };
    assertEquals(720, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case72() {
    String[] programs = { "09:00AM - 10:00AM", "08:00AM - 08:00AM", "09:00AM - 09:00AM", "08:00AM - 09:00AM", "09:00AM - 10:00AM", "08:00AM - 08:00AM", "09:00AM - 09:00AM", "08:00AM - 09:00AM", "09:00AM - 10:00AM", "08:00AM - 08:00AM", "09:00AM - 09:00AM", "08:00AM - 09:00AM", "09:00AM - 10:00AM", "08:00AM - 08:00AM", "09:00AM - 09:00AM", "08:00AM - 09:00AM", "09:00AM - 10:00AM", "08:00AM - 08:00AM", "09:00AM - 09:00AM", "08:00AM - 09:00AM", "09:00AM - 10:00AM", "08:00AM - 08:00AM", "09:00AM - 09:00AM", "08:00AM - 09:00AM", "09:00AM - 10:00AM", "08:00AM - 08:00AM", "09:00AM - 09:00AM", "08:00AM - 09:00AM", "09:00AM - 10:00AM", "08:00AM - 08:00AM", "09:00AM - 09:00AM" };
    assertEquals(1440, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case73() {
    String[] programs = { "03:00AM - 03:01AM", "03:01AM - 03:02AM", "03:02AM - 03:03AM", "03:03AM - 03:04AM", "03:04AM - 03:05AM", "03:05AM - 03:06AM", "03:06AM - 03:07AM", "03:07AM - 03:08AM", "03:08AM - 03:09AM", "03:09AM - 03:10AM", "03:10AM - 03:11AM", "03:11AM - 03:12AM", "03:12AM - 03:13AM", "03:13AM - 03:14AM", "03:14AM - 03:15AM", "03:15AM - 03:16AM", "03:16AM - 03:17AM", "03:17AM - 03:18AM", "03:18AM - 03:19AM", "03:19AM - 03:20AM", "03:20AM - 03:21AM", "03:21AM - 03:22AM", "03:22AM - 03:23AM", "03:23AM - 03:24AM", "03:24AM - 03:25AM", "03:25AM - 03:26AM", "03:26AM - 03:27AM", "03:27AM - 03:28AM", "03:28AM - 03:29AM", "03:29AM - 03:30AM", "03:30AM - 03:31AM", "03:31AM - 03:32AM", "03:32AM - 03:33AM", "03:33AM - 03:34AM", "03:34AM - 03:35AM", "03:35AM - 03:36AM", "03:36AM - 03:37AM", "03:37AM - 03:38AM", "03:38AM - 03:39AM", "03:39AM - 03:40AM", "03:40AM - 03:41AM", "03:41AM - 03:42AM", "03:42AM - 03:43AM", "03:43AM - 03:44AM", "03:44AM - 03:45AM", "03:45AM - 03:46AM", "03:46AM - 03:47AM", "03:47AM - 03:48AM", "03:48AM - 03:49AM", "03:49AM - 03:50AM" };
    assertEquals(50, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case74() {
    String[] programs = { "09:00PM - 02:00AM", "01:00AM - 03:00AM" };
    assertEquals(300, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case75() {
    String[] programs = { "06:00AM - 06:00PM", "07:00PM - 07:00AM" };
    assertEquals(720, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case76() {
    String[] programs = { "01:00AM - 01:01AM", "01:02AM - 01:03AM", "01:04AM - 01:05AM", "01:06AM - 01:07AM", "01:08AM - 01:09AM", "01:10AM - 01:11AM", "01:12AM - 01:13AM", "01:14AM - 01:15AM", "01:16AM - 01:17AM", "01:18AM - 01:19AM", "01:20AM - 01:21AM", "01:22AM - 01:23AM", "01:24AM - 01:25AM", "01:26AM - 01:27AM", "01:28AM - 01:29AM", "01:30AM - 01:31AM", "01:32AM - 01:33AM", "01:34AM - 01:35AM", "01:36AM - 01:37AM", "01:38AM - 01:39AM", "01:40AM - 01:41AM", "01:42AM - 01:43AM", "01:44AM - 01:45AM", "01:46AM - 01:47AM", "01:48AM - 01:49AM", "02:00AM - 02:01AM", "02:02AM - 02:03AM", "02:04AM - 02:05AM", "02:06AM - 02:07AM", "02:08AM - 02:09AM", "02:10AM - 02:11AM", "02:12AM - 02:13AM", "02:14AM - 02:15AM", "02:16AM - 02:17AM", "02:18AM - 02:19AM", "02:20AM - 02:21AM", "02:22AM - 02:23AM", "02:24AM - 02:25AM", "02:26AM - 02:27AM", "02:28AM - 02:29AM", "02:30AM - 02:31AM", "02:32AM - 02:33AM", "02:34AM - 02:35AM", "02:36AM - 02:37AM", "02:38AM - 02:39AM", "02:40AM - 02:41AM", "02:42AM - 02:43AM", "02:44AM - 02:45AM", "02:46AM - 02:47AM", "02:48AM - 02:49AM" };
    assertEquals(50, tvwatching.mostMinutes(programs));
  }

  @Test
  public void case77() {
    String[] programs = { "09:00AM - 09:01AM", "09:01AM - 09:02AM", "09:02AM - 09:03AM", "09:03AM - 09:04AM", "09:04AM - 09:05AM", "09:05AM - 09:06AM", "09:06AM - 09:07AM", "09:07AM - 09:08AM", "09:08AM - 09:09AM", "09:09AM - 09:10AM", "09:10AM - 09:11AM", "09:11AM - 09:12AM", "09:12AM - 09:13AM", "09:13AM - 09:14AM", "09:14AM - 09:15AM", "09:15AM - 09:16AM", "09:16AM - 09:17AM", "09:17AM - 09:18AM", "09:18AM - 09:19AM", "09:19AM - 09:20AM", "09:20AM - 09:21AM", "09:21AM - 09:22AM", "09:22AM - 09:23AM", "09:23AM - 09:24AM", "09:24AM - 09:25AM", "09:25AM - 09:26AM", "09:26AM - 09:27AM", "09:27AM - 09:28AM", "09:28AM - 09:29AM", "09:29AM - 09:30AM", "09:30AM - 09:31AM", "09:31AM - 09:32AM", "09:32AM - 09:33AM", "09:33AM - 09:34AM", "09:34AM - 09:35AM", "09:35AM - 09:36AM", "09:36AM - 09:37AM", "09:37AM - 09:38AM", "09:38AM - 09:39AM", "09:39AM - 09:40AM", "09:40AM - 09:41AM", "09:41AM - 09:42AM", "09:42AM - 09:43AM", "09:43AM - 09:44AM", "09:44AM - 09:45AM", "09:45AM - 09:46AM", "09:46AM - 09:47AM", "09:47AM - 09:48AM", "09:48AM - 09:49AM", "09:49AM - 09:50AM" };
    assertEquals(50, tvwatching.mostMinutes(programs));
  }

}
