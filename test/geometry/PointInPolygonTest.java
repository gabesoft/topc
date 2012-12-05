package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class PointInPolygonTest {
  PointInPolygon pointinpolygon = new PointInPolygon();

  @Test
  public void case1() {
    String[] vertices = { "0 0", "0 10", "10 10", "10 0" };
    int testPointX = 5;
    int testPointY = 5;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case2() {
    String[] vertices = { "0 0", "0 10", "10 10", "10 0" };
    int testPointX = 10;
    int testPointY = 15;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case3() {
    String[] vertices = { "0 0", "0 10", "10 10", "10 0" };
    int testPointX = 5;
    int testPointY = 10;
    assertEquals("BOUNDARY", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case4() {
    String[] vertices = { "-100 -90", "-100 100", "100 100", "100 -100", "-120 -100", "-120 100", "-130 100", "-130 -110", "110 -110", "110 110", "-110 110", "-110 -90" };
    int testPointX = 0;
    int testPointY = 0;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case5() {
    String[] vertices = { "0 0", "0 1000", "1000 1000", "1000 800", "200 800", "200 600", "600 600", "600 400", "200 400", "200 200", "1000 200", "1000 0" };
    int testPointX = 100;
    int testPointY = 500;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case6() {
    String[] vertices = { "0 0", "0 1000", "1000 1000", "1000 800", "200 800", "200 600", "600 600", "600 400", "200 400", "200 200", "1000 200", "1000 0" };
    int testPointX = 300;
    int testPointY = 300;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case7() {
    String[] vertices = { "0 0", "0 1000", "1000 1000", "1000 800", "200 800", "200 600", "600 600", "600 400", "200 400", "200 200", "1000 200", "1000 0" };
    int testPointX = 0;
    int testPointY = 500;
    assertEquals("BOUNDARY", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case8() {
    String[] vertices = { "0 1000", "1000 1000", "1000 800", "200 800", "200 600", "600 600", "600 400", "200 400", "200 200", "1000 200", "1000 0", "0 0" };
    int testPointX = 0;
    int testPointY = 500;
    assertEquals("BOUNDARY", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case9() {
    String[] vertices = { "0 1000", "1000 1000", "1000 800", "200 800", "200 600", "600 600", "600 400", "200 400", "200 200", "1000 200", "1000 0", "0 0" };
    int testPointX = 322;
    int testPointY = 333;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case10() {
    String[] vertices = { "0 1000", "1000 1000", "1000 800", "200 800", "200 600", "600 600", "600 400", "200 400", "200 200", "1000 200", "1000 0", "0 0" };
    int testPointX = 555;
    int testPointY = 999;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case11() {
    String[] vertices = { "500 0", "500 100", "400 100", "400 200", "300 200", "300 300", "200 300", "200 400", "100 400", "100 500", "0 500", "0 400", "-100 400", "-100 300", "-200 300", "-200 200", "-300 200", "-300 100", "-400 100", "-400 0", "-500 0", "-500 -100", "-400 -100", "-400 -200", "-300 -200", "-300 -300", "-200 -300", "-200 -400", "-100 -400", "-100 -500", "0 -500", "0 -400", "100 -400", "100 -300", "200 -300", "200 -200", "300 -200", "300 -100", "400 -100", "400 0" };
    int testPointX = 200;
    int testPointY = 200;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case12() {
    String[] vertices = { "500 0", "500 100", "400 100", "400 200", "300 200", "300 300", "200 300", "200 400", "100 400", "100 500", "0 500", "0 400", "-100 400", "-100 300", "-200 300", "-200 200", "-300 200", "-300 100", "-400 100", "-400 0", "-500 0", "-500 -100", "-400 -100", "-400 -200", "-300 -200", "-300 -300", "-200 -300", "-200 -400", "-100 -400", "-100 -500", "0 -500", "0 -400", "100 -400", "100 -300", "200 -300", "200 -200", "300 -200", "300 -100", "400 -100", "400 0" };
    int testPointX = 400;
    int testPointY = 200;
    assertEquals("BOUNDARY", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case13() {
    String[] vertices = { "500 0", "500 100", "400 100", "400 200", "300 200", "300 300", "200 300", "200 400", "100 400", "100 500", "0 500", "0 400", "-100 400", "-100 300", "-200 300", "-200 200", "-300 200", "-300 100", "-400 100", "-400 0", "-500 0", "-500 -100", "-400 -100", "-400 -200", "-300 -200", "-300 -300", "-200 -300", "-200 -400", "-100 -400", "-100 -500", "0 -500", "0 -400", "100 -400", "100 -300", "200 -300", "200 -200", "300 -200", "300 -100", "400 -100", "400 0" };
    int testPointX = 400;
    int testPointY = 400;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case14() {
    String[] vertices = { "500 0", "500 100", "400 100", "400 200", "300 200", "300 300", "200 300", "200 400", "100 400", "100 500", "0 500", "0 400", "-100 400", "-100 300", "-200 300", "-200 200", "-300 200", "-300 100", "-400 100", "-400 0", "-500 0", "-500 -100", "-400 -100", "-400 -200", "-300 -200", "-300 -300", "-200 -300", "-200 -400", "-100 -400", "-100 -500", "0 -500", "0 -400", "100 -400", "100 -300", "200 -300", "200 -200", "300 -200", "300 -100", "400 -100", "400 0" };
    int testPointX = 400;
    int testPointY = -400;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case15() {
    String[] vertices = { "500 0", "500 100", "400 100", "400 200", "300 200", "300 300", "200 300", "200 400", "100 400", "100 500", "0 500", "0 400", "-100 400", "-100 300", "-200 300", "-200 200", "-300 200", "-300 100", "-400 100", "-400 0", "-500 0", "-500 -100", "-400 -100", "-400 -200", "-300 -200", "-300 -300", "-200 -300", "-200 -400", "-100 -400", "-100 -500", "0 -500", "0 -400", "100 -400", "100 -300", "200 -300", "200 -200", "300 -200", "300 -100", "400 -100", "400 0" };
    int testPointX = -400;
    int testPointY = -400;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case16() {
    String[] vertices = { "500 0", "500 100", "400 100", "400 200", "300 200", "300 300", "200 300", "200 400", "100 400", "100 500", "0 500", "0 400", "-100 400", "-100 300", "-200 300", "-200 200", "-300 200", "-300 100", "-400 100", "-400 0", "-500 0", "-500 -100", "-400 -100", "-400 -200", "-300 -200", "-300 -300", "-200 -300", "-200 -400", "-100 -400", "-100 -500", "0 -500", "0 -400", "100 -400", "100 -300", "200 -300", "200 -200", "300 -200", "300 -100", "400 -100", "400 0" };
    int testPointX = -400;
    int testPointY = 400;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case17() {
    String[] vertices = { "500 0", "500 100", "400 100", "400 200", "300 200", "300 300", "200 300", "200 400", "100 400", "100 500", "0 500", "0 400", "-100 400", "-100 300", "-200 300", "-200 200", "-300 200", "-300 100", "-400 100", "-400 0", "-500 0", "-500 -100", "-400 -100", "-400 -200", "-300 -200", "-300 -300", "-200 -300", "-200 -400", "-100 -400", "-100 -500", "0 -500", "0 -400", "100 -400", "100 -300", "200 -300", "200 -200", "300 -200", "300 -100", "400 -100", "400 0" };
    int testPointX = 42;
    int testPointY = 42;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case18() {
    String[] vertices = { "500 0", "500 100", "400 100", "400 200", "300 200", "300 300", "200 300", "200 400", "100 400", "100 500", "0 500", "0 400", "-100 400", "-100 300", "-200 300", "-200 200", "-300 200", "-300 100", "-400 100", "-400 0", "-500 0", "-500 -100", "-400 -100", "-400 -200", "-300 -200", "-300 -300", "-200 -300", "-200 -400", "-100 -400", "-100 -500", "0 -500", "0 -400", "100 -400", "100 -300", "200 -300", "200 -200", "300 -200", "300 -100", "400 -100", "400 0" };
    int testPointX = 499;
    int testPointY = 1;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case19() {
    String[] vertices = { "500 100", "400 100", "400 200", "300 200", "300 300", "200 300", "200 400", "100 400", "100 500", "0 500", "0 400", "-100 400", "-100 300", "-200 300", "-200 200", "-300 200", "-300 100", "-400 100", "-400 0", "-500 0", "-500 -100", "-400 -100", "-400 -200", "-300 -200", "-300 -300", "-200 -300", "-200 -400", "-100 -400", "-100 -500", "0 -500", "0 -400", "100 -400", "100 -300", "200 -300", "200 -200", "300 -200", "300 -100", "400 -100", "400 0", "500 0" };
    int testPointX = 200;
    int testPointY = 200;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case20() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = 1;
    int testPointY = -1;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case21() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = 1;
    int testPointY = 1;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case22() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = -1;
    int testPointY = 1;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case23() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = -1;
    int testPointY = -1;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case24() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = 5;
    int testPointY = -10;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case25() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = 10;
    int testPointY = -15;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case26() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = 15;
    int testPointY = 0;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case27() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = 15;
    int testPointY = -5;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case28() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = 10;
    int testPointY = 5;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case29() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = -5;
    int testPointY = 5;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case30() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = -15;
    int testPointY = 15;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case31() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = 0;
    int testPointY = -1;
    assertEquals("BOUNDARY", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case32() {
    String[] vertices = { "0 0", "10 0", "10 -10", "20 -10", "20 10", "-10 10", "-10 -30", "40 -30", "40 30", "-30 30", "-30 -50", "60 -50", "60 50", "-50 50", "-50 -70", "80 -70", "80 70", "-70 70", "-70 -90", "100 -90", "100 90", "-90 90", "-90 -110", "120 -110", "120 110", "-120 110", "-120 120", "130 120", "130 -120", "-100 -120", "-100 100", "110 100", "110 -100", "-80 -100", "-80 80", "90 80", "90 -80", "-60 -80", "-60 60", "70 60", "70 -60", "-40 -60", "-40 40", "50 40", "50 -40", "-20 -40", "-20 20", "30 20", "30 -20", "0 -20" };
    int testPointX = 1;
    int testPointY = -20;
    assertEquals("BOUNDARY", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case33() {
    String[] vertices = { "1 0", "2 0", "2 1", "3 1", "3 0", "4 0", "4 -1", "5 -1", "5 0", "6 0", "6 2", "0 2", "0 3", "-1 3", "-1 4", "0 4", "0 6", "1 6", "1 7", "0 7", "0 8", "-2 8", "-2 2", "-8 2", "-8 0", "-7 0", "-7 -1", "-6 -1", "-6 0", "-4 0", "-4 1", "-3 1", "-3 0", "-2 0", "-2 -6", "0 -6", "0 -5", "1 -5", "1 -4", "0 -4", "0 -3", "-1 -3", "-1 -2", "0 -2", "0 -1", "1 -1" };
    int testPointX = 0;
    int testPointY = 0;
    assertEquals("INTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case34() {
    String[] vertices = { "0 0", "0 10", "10 10", "10 0" };
    int testPointX = 5;
    int testPointY = 10;
    assertEquals("BOUNDARY", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case35() {
    String[] vertices = { "0 1000", "1000 1000", "1000 800", "200 800", "200 600", "600 600", "600 400", "200 400", "200 200", "1000 200", "1000 0", "0 0" };
    int testPointX = 322;
    int testPointY = 333;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case36() {
    String[] vertices = { "0 0", "0 10", "10 10", "10 0" };
    int testPointX = 10;
    int testPointY = 15;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case37() {
    String[] vertices = { "0 0", "3 0", "3 4", "-2 4", "-2 0", "-1 0", "-1 3", "2 3", "2 1", "0 1" };
    int testPointX = 1;
    int testPointY = 2;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case38() {
    String[] vertices = { "0 0", "0 10", "10 10", "10 0" };
    int testPointX = 10;
    int testPointY = 10;
    assertEquals("BOUNDARY", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

  @Test
  public void case39() {
    String[] vertices = { "0 0", "0 1", "1 1", "1 0" };
    int testPointX = 0;
    int testPointY = 10;
    assertEquals("EXTERIOR", pointinpolygon.testPoint(vertices, testPointX, testPointY));
  }

}
