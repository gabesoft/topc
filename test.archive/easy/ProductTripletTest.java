package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ProductTripletTest {
  ProductTriplet producttriplet = new ProductTriplet();

  @Test
  public void case1() {
    int minx = 2;
    int maxx = 2;
    int miny = 3;
    int maxy = 3;
    int minz = 6;
    int maxz = 6;
    assertEquals(1L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case2() {
    int minx = 2;
    int maxx = 2;
    int miny = 3;
    int maxy = 3;
    int minz = 7;
    int maxz = 7;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case3() {
    int minx = 6;
    int maxx = 8;
    int miny = 4;
    int maxy = 5;
    int minz = 27;
    int maxz = 35;
    assertEquals(4L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case4() {
    int minx = 1;
    int maxx = 458;
    int miny = 1;
    int maxy = 458;
    int minz = 1;
    int maxz = 458;
    assertEquals(2877L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case5() {
    int minx = 8176;
    int maxx = 184561;
    int miny = 1348;
    int maxy = 43168;
    int minz = 45814517;
    int maxz = 957843164;
    assertEquals(2365846085L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case6() {
    int minx = 374483;
    int maxx = 1918190;
    int miny = 4;
    int maxy = 11;
    int minz = 7;
    int maxz = 67;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case7() {
    int minx = 3;
    int maxx = 3;
    int miny = 6171537;
    int maxy = 9011084;
    int minz = 6;
    int maxz = 182546394;
    assertEquals(2839548L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case8() {
    int minx = 1698590;
    int maxx = 2961279;
    int miny = 5;
    int maxy = 16;
    int minz = 8884401;
    int maxz = 1000000000;
    assertEquals(15073989L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case9() {
    int minx = 80;
    int maxx = 499;
    int miny = 42;
    int maxy = 883488165;
    int minz = 1;
    int maxz = 1;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case10() {
    int minx = 5;
    int maxx = 14;
    int miny = 1313;
    int maxy = 400427945;
    int minz = 672896;
    int maxz = 659998485;
    assertEquals(770243270L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case11() {
    int minx = 1;
    int maxx = 4;
    int miny = 1826;
    int maxy = 142750432;
    int minz = 8;
    int maxz = 1000000000;
    assertEquals(570994428L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case12() {
    int minx = 3444;
    int maxx = 3901;
    int miny = 45;
    int maxy = 1000000000;
    int minz = 24643;
    int maxz = 28237;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case13() {
    int minx = 110781;
    int maxx = 253423;
    int miny = 270308722;
    int maxy = 1000000000;
    int minz = 1;
    int maxz = 15934105;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case14() {
    int minx = 15;
    int maxx = 162;
    int miny = 311316;
    int maxy = 1000000000;
    int minz = 4444;
    int maxz = 1000000000;
    assertEquals(2370258227L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case15() {
    int minx = 1;
    int maxx = 248402491;
    int miny = 394871;
    int maxy = 1644299;
    int minz = 11;
    int maxz = 49;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case16() {
    int minx = 20;
    int maxx = 669566825;
    int miny = 39;
    int maxy = 41;
    int minz = 2;
    int maxz = 35222246;
    assertEquals(2642712L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case17() {
    int minx = 6;
    int maxx = 807426510;
    int miny = 3344;
    int maxy = 4765;
    int minz = 1;
    int maxz = 1000000000;
    assertEquals(354376489L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case18() {
    int minx = 7;
    int maxx = 86979691;
    int miny = 164;
    int maxy = 339228196;
    int minz = 2;
    int maxz = 3;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case19() {
    int minx = 604;
    int maxx = 287487107;
    int miny = 16558;
    int maxy = 589759002;
    int minz = 1;
    int maxz = 808284659;
    assertEquals(2752570292L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case20() {
    int minx = 6498;
    int maxx = 14983332;
    int miny = 1;
    int maxy = 761170565;
    int minz = 512;
    int maxz = 1000000000;
    assertEquals(7735785276L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case21() {
    int minx = 3269;
    int maxx = 5748439;
    int miny = 83150301;
    int maxy = 1000000000;
    int minz = 9493;
    int maxz = 28203;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case22() {
    int minx = 1905;
    int maxx = 145324180;
    int miny = 314092452;
    int maxy = 1000000000;
    int minz = 609;
    int maxz = 6364914;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case23() {
    int minx = 2;
    int maxx = 653962274;
    int miny = 865834128;
    int maxy = 1000000000;
    int minz = 319390;
    int maxz = 1000000000;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case24() {
    int minx = 1596982;
    int maxx = 1000000000;
    int miny = 208;
    int maxy = 241;
    int minz = 71;
    int maxz = 79;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case25() {
    int minx = 3883818;
    int maxx = 1000000000;
    int miny = 7909;
    int maxy = 15165;
    int minz = 5056;
    int maxz = 212677189;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case26() {
    int minx = 1138;
    int maxx = 1000000000;
    int miny = 674290;
    int maxy = 1151090;
    int minz = 16;
    int maxz = 1000000000;
    assertEquals(32267110L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case27() {
    int minx = 736;
    int maxx = 1000000000;
    int miny = 31;
    int maxy = 2583104;
    int minz = 1;
    int maxz = 1;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case28() {
    int minx = 3;
    int maxx = 1000000000;
    int miny = 10;
    int maxy = 9984371;
    int minz = 149;
    int maxz = 442727411;
    assertEquals(6113349956L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case29() {
    int minx = 1;
    int maxx = 1000000000;
    int miny = 11429;
    int maxy = 117157997;
    int minz = 7713;
    int maxz = 1000000000;
    assertEquals(9176028858L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case30() {
    int minx = 21;
    int maxx = 1000000000;
    int miny = 49312;
    int maxy = 1000000000;
    int minz = 96;
    int maxz = 147;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case31() {
    int minx = 1282;
    int maxx = 1000000000;
    int miny = 19;
    int maxy = 1000000000;
    int minz = 2263;
    int maxz = 68043416;
    assertEquals(473740459L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case32() {
    int minx = 88570;
    int maxx = 1000000000;
    int miny = 18108208;
    int maxy = 1000000000;
    int minz = 138149;
    int maxz = 1000000000;
    assertEquals(0L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case33() {
    int minx = 1;
    int maxx = 1000000000;
    int miny = 1;
    int maxy = 1000000000;
    int minz = 1;
    int maxz = 1000000000;
    assertEquals(20877697634L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case34() {
    int minx = 23;
    int maxx = 992994009;
    int miny = 343;
    int maxy = 992994009;
    int minz = 54;
    int maxz = 992994009;
    assertEquals(10690944075L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case35() {
    int minx = 1;
    int maxx = 999999999;
    int miny = 1;
    int maxy = 999999999;
    int minz = 1;
    int maxz = 999999999;
    assertEquals(20877697534L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case36() {
    int minx = 3;
    int maxx = 999999999;
    int miny = 3;
    int maxy = 999999999;
    int minz = 3;
    int maxz = 999999999;
    assertEquals(17877697542L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case37() {
    int minx = 1;
    int maxx = 999999;
    int miny = 2;
    int maxy = 999999;
    int minz = 3;
    int maxz = 999999;
    assertEquals(12969985L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case38() {
    int minx = 1;
    int maxx = 100000000;
    int miny = 1;
    int maxy = 100000000;
    int minz = 1;
    int maxz = 100000000;
    assertEquals(1857511568L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case39() {
    int minx = 3;
    int maxx = 1000000000;
    int miny = 10;
    int maxy = 1000000000;
    int minz = 31;
    int maxz = 999999999;
    assertEquals(16548729306L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case40() {
    int minx = 2;
    int maxx = 1000000000;
    int miny = 1;
    int maxy = 1000000000;
    int minz = 1;
    int maxz = 1000000000;
    assertEquals(19877697634L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case41() {
    int minx = 1;
    int maxx = 999999999;
    int miny = 1;
    int maxy = 1000000000;
    int minz = 1;
    int maxz = 1000000000;
    assertEquals(20877697633L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case42() {
    int minx = 123;
    int maxx = 963915924;
    int miny = 3;
    int maxy = 129475357;
    int minz = 6;
    int maxz = 986429571;
    assertEquals(13789007380L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case43() {
    int minx = 1000000000;
    int maxx = 1000000000;
    int miny = 1;
    int maxy = 1000000000;
    int minz = 1;
    int maxz = 1000000000;
    assertEquals(1L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

  @Test
  public void case44() {
    int minx = 1;
    int maxx = 1000000000;
    int miny = 1;
    int maxy = 1;
    int minz = 1;
    int maxz = 890000000;
    assertEquals(890000000L, producttriplet.countTriplets(minx, maxx, miny, maxy, minz, maxz));
  }

}
