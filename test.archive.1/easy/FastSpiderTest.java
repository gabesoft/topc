package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class FastSpiderTest {
  FastSpider fastspider = new FastSpider();

  @Test
  public void case1() {
    double spiderSpeed = 0.25;
    double manSpeed = 1.0;
    assertEquals(54, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case2() {
    double spiderSpeed = 0.5;
    double manSpeed = 1.0;
    assertEquals(6, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case3() {
    double spiderSpeed = 0.5;
    double manSpeed = 4.8877377;
    assertEquals(3600, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case4() {
    double spiderSpeed = 0.2;
    double manSpeed = 1.0;
    assertEquals(147, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case5() {
    double spiderSpeed = 0.47;
    double manSpeed = 2.78;
    assertEquals(133, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case6() {
    double spiderSpeed = 0.23237120490148247;
    double manSpeed = 1.3861233623877531;
    assertEquals(280, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case7() {
    double spiderSpeed = 0.4860346899195756;
    double manSpeed = 2.1453090856549557;
    assertEquals(38, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case8() {
    double spiderSpeed = 0.3893122084936773;
    double manSpeed = 1.3775108049378084;
    assertEquals(24, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case9() {
    double spiderSpeed = 0.22192978592904428;
    double manSpeed = 1.2179259257344017;
    assertEquals(198, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case10() {
    double spiderSpeed = 0.4337737603217932;
    double manSpeed = 1.091448852734342;
    assertEquals(10, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case11() {
    double spiderSpeed = 0.4614311459654846;
    double manSpeed = 3.7619849110399772;
    assertEquals(923, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case12() {
    double spiderSpeed = 0.37935574071561684;
    double manSpeed = 1.7729609003439992;
    assertEquals(60, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case13() {
    double spiderSpeed = 0.2865618752931029;
    double manSpeed = 1.777203892905189;
    assertEquals(277, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case14() {
    double spiderSpeed = 0.29099121644108056;
    double manSpeed = 1.6774062722861003;
    assertEquals(189, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case15() {
    double spiderSpeed = 0.45570150300173223;
    double manSpeed = 2.80458595082542;
    assertEquals(168, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case16() {
    double spiderSpeed = 0.3049742992182573;
    double manSpeed = 1.5922319450854472;
    assertEquals(116, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case17() {
    double spiderSpeed = 0.4216300548816815;
    double manSpeed = 3.223493194659371;
    assertEquals(648, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case18() {
    double spiderSpeed = 0.46503486836221286;
    double manSpeed = 3.8548576573670252;
    assertEquals(1033, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case19() {
    double spiderSpeed = 0.3617935378639448;
    double manSpeed = 2.3538538806281015;
    assertEquals(284, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case20() {
    double spiderSpeed = 0.4719693229540898;
    double manSpeed = 3.5402887877668636;
    assertEquals(511, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case21() {
    double spiderSpeed = 0.406814213831339;
    double manSpeed = 1.4749308802703385;
    assertEquals(25, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case22() {
    double spiderSpeed = 0.24517434438026817;
    double manSpeed = 2.181079373387396;
    assertEquals(3348, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case23() {
    double spiderSpeed = 0.3418729955154742;
    double manSpeed = 2.2681865966398957;
    assertEquals(335, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case24() {
    double spiderSpeed = 0.495274020717714;
    double manSpeed = 3.4950643511536716;
    assertEquals(332, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case25() {
    double spiderSpeed = 0.4884484221062418;
    double manSpeed = 2.794435616043163;
    assertEquals(109, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case26() {
    double spiderSpeed = 0.47;
    double manSpeed = 2.78;
    assertEquals(133, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case27() {
    double spiderSpeed = 0.25;
    double manSpeed = 1.0;
    assertEquals(54, fastspider.findTime(spiderSpeed, manSpeed));
  }

  @Test
  public void case28() {
    double spiderSpeed = 0.5;
    double manSpeed = 4.8877377;
    assertEquals(3600, fastspider.findTime(spiderSpeed, manSpeed));
  }

}
