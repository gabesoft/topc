package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class PolylineTest {
  double DELTA = 1.0e-09;
  Polyline polyline = new Polyline();

  @Test
  public void case1() {
    int a = 4;
    int b = 3;
    int x0 = 1;
    int y0 = 1;
    int x1 = 3;
    int y1 = 2;
    assertEquals(7.810249675906654, polyline.length(a, b, x0, y0, x1, y1), DELTA * 7.810249675906654);
  }

  @Test
  public void case2() {
    int a = 4;
    int b = 3;
    int x0 = 1;
    int y0 = 1;
    int x1 = 2;
    int y1 = 2;
    assertEquals(8.602325267042627, polyline.length(a, b, x0, y0, x1, y1), DELTA * 8.602325267042627);
  }

  @Test
  public void case3() {
    int a = 4;
    int b = 3;
    int x0 = 1;
    int y0 = 1;
    int x1 = 1;
    int y1 = 2;
    assertEquals(9.433981132056603, polyline.length(a, b, x0, y0, x1, y1), DELTA * 9.433981132056603);
  }

  @Test
  public void case4() {
    int a = 50;
    int b = 70;
    int x0 = 20;
    int y0 = 40;
    int x1 = 20;
    int y1 = 40;
    assertEquals(172.04650534085255, polyline.length(a, b, x0, y0, x1, y1), DELTA * 172.04650534085255);
  }

  @Test
  public void case5() {
    int a = 98;
    int b = 200;
    int x0 = 78;
    int y0 = 32;
    int x1 = 35;
    int y1 = 174;
    assertEquals(299.9549966244937, polyline.length(a, b, x0, y0, x1, y1), DELTA * 299.9549966244937);
  }

  @Test
  public void case6() {
    int a = 2;
    int b = 2;
    int x0 = 1;
    int y0 = 1;
    int x1 = 1;
    int y1 = 1;
    assertEquals(5.656854249492381, polyline.length(a, b, x0, y0, x1, y1), DELTA * 5.656854249492381);
  }

  @Test
  public void case7() {
    int a = 2;
    int b = 200;
    int x0 = 1;
    int y0 = 199;
    int x1 = 1;
    int y1 = 187;
    assertEquals(388.0206180088888, polyline.length(a, b, x0, y0, x1, y1), DELTA * 388.0206180088888);
  }

  @Test
  public void case8() {
    int a = 200;
    int b = 200;
    int x0 = 182;
    int y0 = 28;
    int x1 = 73;
    int y1 = 33;
    assertEquals(490.6179776567508, polyline.length(a, b, x0, y0, x1, y1), DELTA * 490.6179776567508);
  }

  @Test
  public void case9() {
    int a = 139;
    int b = 92;
    int x0 = 83;
    int y0 = 72;
    int x1 = 71;
    int y1 = 3;
    assertEquals(289.79475495598604, polyline.length(a, b, x0, y0, x1, y1), DELTA * 289.79475495598604);
  }

  @Test
  public void case10() {
    int a = 87;
    int b = 33;
    int x0 = 1;
    int y0 = 20;
    int x1 = 80;
    int y1 = 27;
    assertEquals(111.83022847155415, polyline.length(a, b, x0, y0, x1, y1), DELTA * 111.83022847155415);
  }

  @Test
  public void case11() {
    int a = 100;
    int b = 200;
    int x0 = 50;
    int y0 = 100;
    int x1 = 49;
    int y1 = 101;
    assertEquals(445.8721789930383, polyline.length(a, b, x0, y0, x1, y1), DELTA * 445.8721789930383);
  }

  @Test
  public void case12() {
    int a = 3;
    int b = 3;
    int x0 = 1;
    int y0 = 1;
    int x1 = 2;
    int y1 = 2;
    assertEquals(7.0710678118654755, polyline.length(a, b, x0, y0, x1, y1), DELTA * 7.0710678118654755);
  }

  @Test
  public void case13() {
    int a = 129;
    int b = 129;
    int x0 = 23;
    int y0 = 24;
    int x1 = 87;
    int y1 = 66;
    assertEquals(290.33084576048753, polyline.length(a, b, x0, y0, x1, y1), DELTA * 290.33084576048753);
  }

  @Test
  public void case14() {
    int a = 14;
    int b = 3;
    int x0 = 13;
    int y0 = 1;
    int x1 = 11;
    int y1 = 2;
    assertEquals(26.476404589747453, polyline.length(a, b, x0, y0, x1, y1), DELTA * 26.476404589747453);
  }

  @Test
  public void case15() {
    int a = 99;
    int b = 9;
    int x0 = 88;
    int y0 = 8;
    int x1 = 17;
    int y1 = 2;
    assertEquals(127.56566936288148, polyline.length(a, b, x0, y0, x1, y1), DELTA * 127.56566936288148);
  }

  @Test
  public void case16() {
    int a = 200;
    int b = 2;
    int x0 = 198;
    int y0 = 1;
    int x1 = 12;
    int y1 = 1;
    assertEquals(214.03737991294884, polyline.length(a, b, x0, y0, x1, y1), DELTA * 214.03737991294884);
  }

  @Test
  public void case17() {
    int a = 3;
    int b = 133;
    int x0 = 2;
    int y0 = 20;
    int x1 = 1;
    int y1 = 19;
    assertEquals(265.04716561397146, polyline.length(a, b, x0, y0, x1, y1), DELTA * 265.04716561397146);
  }

  @Test
  public void case18() {
    int a = 34;
    int b = 170;
    int x0 = 21;
    int y0 = 18;
    int x1 = 30;
    int y1 = 63;
    assertEquals(300.8421513019743, polyline.length(a, b, x0, y0, x1, y1), DELTA * 300.8421513019743);
  }

  @Test
  public void case19() {
    int a = 83;
    int b = 171;
    int x0 = 11;
    int y0 = 129;
    int x1 = 25;
    int y1 = 38;
    assertEquals(293.43653487594213, polyline.length(a, b, x0, y0, x1, y1), DELTA * 293.43653487594213);
  }

  @Test
  public void case20() {
    int a = 10;
    int b = 10;
    int x0 = 1;
    int y0 = 4;
    int x1 = 9;
    int y1 = 3;
    assertEquals(22.47220505424423, polyline.length(a, b, x0, y0, x1, y1), DELTA * 22.47220505424423);
  }

}
