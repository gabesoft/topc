package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class CircleOrderTest {
  CircleOrder circleorder = new CircleOrder();

  @Test
  public void case1() {
    String circle = "BACacb";
    assertEquals("abc", circleorder.firstOrder(circle));
  }

  @Test
  public void case2() {
    String circle = "ABCacb";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case3() {
    String circle = "XYxPyp";
    assertEquals("xyp", circleorder.firstOrder(circle));
  }

  @Test
  public void case4() {
    String circle = "BDAdCacb";
    assertEquals("bdac", circleorder.firstOrder(circle));
  }

  @Test
  public void case5() {
    String circle = "abBcCdDeEfghFGHA";
    assertEquals("abcdehgf", circleorder.firstOrder(circle));
  }

  @Test
  public void case6() {
    String circle = "BDdacAbC";
    assertEquals("bcad", circleorder.firstOrder(circle));
  }

  @Test
  public void case7() {
    String circle = "acAC";
    assertEquals("ac", circleorder.firstOrder(circle));
  }

  @Test
  public void case8() {
    String circle = "wXWBbx";
    assertEquals("bwx", circleorder.firstOrder(circle));
  }

  @Test
  public void case9() {
    String circle = "cCdDeEFGfgHhIiJjKklLmnMNoOpPQqRr";
    assertEquals("cdefghijklnmopqr", circleorder.firstOrder(circle));
  }

  @Test
  public void case10() {
    String circle = "CrcdDeEFGfgHhIiJjKklLmnMNoOpPQqR";
    assertEquals("defghijklnmopqrc", circleorder.firstOrder(circle));
  }

  @Test
  public void case11() {
    String circle = "mnMNoOpPQqRCrcdDeEFGfgHhIiJjKklL";
    assertEquals("defghijklnmopqrc", circleorder.firstOrder(circle));
  }

  @Test
  public void case12() {
    String circle = "aCbAcB";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case13() {
    String circle = "abCAcB";
    assertEquals("cab", circleorder.firstOrder(circle));
  }

  @Test
  public void case14() {
    String circle = "DOGNAPHERZYLBCFIJKMQdognapherzylbcfijkmq";
    assertEquals("dognapherzylbcfijkmq", circleorder.firstOrder(circle));
  }

  @Test
  public void case15() {
    String circle = "QOGNAPHERZYLBCFIJKMDqognapherzylbcfijkmd";
    assertEquals("dmkjifcblyzrehpangoq", circleorder.firstOrder(circle));
  }

  @Test
  public void case16() {
    String circle = "DadAVvLl";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case17() {
    String circle = "ogGRUXsHDfqbuxAhOrBElwSWvaedLFQV";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case18() {
    String circle = "iGEecqVYCSdQPsgUpmuTMbBXvJjxyWItwD";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case19() {
    String circle = "uaKkEQftFNZRUqzTWwrOeonA";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case20() {
    String circle = "JpxUCruFQaloSjmiwGOtEAzZTPRIqeMfYLNyncHXhgsW";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case21() {
    String circle = "uPRJqBYfMeLQtdDlEhwkcsCVKUSmjrTzpNHyFnvWbZ";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case22() {
    String circle = "xTqKrGRtXEQekg";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case23() {
    String circle = "TmNPUjpqvnlBfVOioItZuWbQLARaJDMkFKrzcwdC";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case24() {
    String circle = "hmVlSsvLkMHK";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case25() {
    String circle = "yNkDWVZrBaKzpmGvbqJdYFQRPgjSiMufnsTUtwXxAI";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case26() {
    String circle = "cCdDeEfFgGiIjJmMoOqQrRtTuUvVwWxXyYzZ";
    assertEquals("cdefgijmoqrtuvwxyz", circleorder.firstOrder(circle));
  }

  @Test
  public void case27() {
    String circle = "aAbBcCdDeEgGhHiIjJkKmMqQrRsStTuUwWyY";
    assertEquals("abcdeghijkmqrstuwy", circleorder.firstOrder(circle));
  }

  @Test
  public void case28() {
    String circle = "bBhHiIlLmMnNpPqQrRtTuUvVwWzZ";
    assertEquals("bhilmnpqrtuvwz", circleorder.firstOrder(circle));
  }

  @Test
  public void case29() {
    String circle = "KGhJjgIkiqHQ";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case30() {
    String circle = "uvVPpU";
    assertEquals("puv", circleorder.firstOrder(circle));
  }

  @Test
  public void case31() {
    String circle = "ucCFUf";
    assertEquals("cfu", circleorder.firstOrder(circle));
  }

  @Test
  public void case32() {
    String circle = "zoWmAFZMaOgwfG";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case33() {
    String circle = "UuPAsapRtTSgrG";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case34() {
    String circle = "LqQOFolf";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case35() {
    String circle = "iFkpzPZIKf";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case36() {
    String circle = "gQhZHzGq";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case37() {
    String circle = "zVAaZv";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case38() {
    String circle = "QprJZjiYIfPFqzRy";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case39() {
    String circle = "qILRgzZQOGojJril";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case40() {
    String circle = "EoOIeWiAaw";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case41() {
    String circle = "jYyboOJmBM";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case42() {
    String circle = "cNCGng";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case43() {
    String circle = "vAOElopLVIePai";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case44() {
    String circle = "uHULhl";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case45() {
    String circle = "XrSWRUmswzMZxu";
    assertEquals("NONE", circleorder.firstOrder(circle));
  }

  @Test
  public void case46() {
    String circle = "kKiI";
    assertEquals("ik", circleorder.firstOrder(circle));
  }

  @Test
  public void case47() {
    String circle = "kdSsJKjD";
    assertEquals("jkds", circleorder.firstOrder(circle));
  }

  @Test
  public void case48() {
    String circle = "JpjSPs";
    assertEquals("spj", circleorder.firstOrder(circle));
  }

  @Test
  public void case49() {
    String circle = "uHULlh";
    assertEquals("luh", circleorder.firstOrder(circle));
  }

  @Test
  public void case50() {
    String circle = "XYxPypAabcBCdDeE";
    assertEquals("acbdexyp", circleorder.firstOrder(circle));
  }

  @Test
  public void case51() {
    String circle = "BACacb";
    assertEquals("abc", circleorder.firstOrder(circle));
  }

  @Test
  public void case52() {
    String circle = "AaBbCcDdEeFfGgHhJjKkLlPpOoIiUuYyTtRrWwQqZzXxVvNnMm";
    assertEquals("abcdefghijklmnopqrtuvwxyz", circleorder.firstOrder(circle));
  }

}
