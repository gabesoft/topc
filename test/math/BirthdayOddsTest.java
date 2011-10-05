package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BirthdayOddsTest {
  BirthdayOdds birthdayodds = new BirthdayOdds();

  @Test
  public void case1() {
    int minOdds = 75;
    int daysInYear = 5;
    assertEquals(4, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case2() {
    int minOdds = 50;
    int daysInYear = 365;
    assertEquals(23, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case3() {
    int minOdds = 1;
    int daysInYear = 365;
    assertEquals(4, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case4() {
    int minOdds = 84;
    int daysInYear = 9227;
    assertEquals(184, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case5() {
    int minOdds = 99;
    int daysInYear = 3349;
    assertEquals(175, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case6() {
    int minOdds = 14;
    int daysInYear = 3100;
    assertEquals(32, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case7() {
    int minOdds = 40;
    int daysInYear = 4093;
    assertEquals(65, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case8() {
    int minOdds = 84;
    int daysInYear = 9557;
    assertEquals(188, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case9() {
    int minOdds = 24;
    int daysInYear = 5986;
    assertEquals(58, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case10() {
    int minOdds = 25;
    int daysInYear = 8819;
    assertEquals(72, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case11() {
    int minOdds = 62;
    int daysInYear = 6528;
    assertEquals(113, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case12() {
    int minOdds = 28;
    int daysInYear = 4955;
    assertEquals(58, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case13() {
    int minOdds = 75;
    int daysInYear = 5346;
    assertEquals(122, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case14() {
    int minOdds = 76;
    int daysInYear = 1084;
    assertEquals(56, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case15() {
    int minOdds = 68;
    int daysInYear = 5435;
    assertEquals(112, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case16() {
    int minOdds = 13;
    int daysInYear = 1184;
    assertEquals(19, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case17() {
    int minOdds = 98;
    int daysInYear = 6729;
    assertEquals(229, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case18() {
    int minOdds = 83;
    int daysInYear = 1699;
    assertEquals(78, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case19() {
    int minOdds = 23;
    int daysInYear = 8446;
    assertEquals(67, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case20() {
    int minOdds = 99;
    int daysInYear = 1;
    assertEquals(2, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case21() {
    int minOdds = 1;
    int daysInYear = 1;
    assertEquals(2, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case22() {
    int minOdds = 99;
    int daysInYear = 2;
    assertEquals(3, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case23() {
    int minOdds = 50;
    int daysInYear = 1;
    assertEquals(2, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case24() {
    int minOdds = 75;
    int daysInYear = 2;
    assertEquals(3, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case25() {
    int minOdds = 75;
    int daysInYear = 5;
    assertEquals(4, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case26() {
    int minOdds = 99;
    int daysInYear = 6;
    assertEquals(7, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case27() {
    int minOdds = 99;
    int daysInYear = 5;
    assertEquals(6, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case28() {
    int minOdds = 5;
    int daysInYear = 1;
    assertEquals(2, birthdayodds.minPeople(minOdds, daysInYear));
  }

  @Test
  public void case29() {
    int minOdds = 95;
    int daysInYear = 2;
    assertEquals(3, birthdayodds.minPeople(minOdds, daysInYear));
  }

}
