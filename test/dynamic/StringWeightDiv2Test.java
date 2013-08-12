package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class StringWeightDiv2Test {
  StringWeightDiv2 stringweightdiv2 = new StringWeightDiv2();

  @Test
  public void case1() {
    int L = 1;
    assertEquals(26, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case2() {
    int L = 2;
    assertEquals(650, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case3() {
    int L = 50;
    assertEquals(488801539, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case4() {
    int L = 3;
    assertEquals(15600, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case5() {
    int L = 4;
    assertEquals(358800, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case6() {
    int L = 13;
    assertEquals(949597241, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case7() {
    int L = 20;
    assertEquals(608487724, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case8() {
    int L = 26;
    assertEquals(111157338, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case9() {
    int L = 27;
    assertEquals(890090770, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case10() {
    int L = 35;
    assertEquals(939243459, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case11() {
    int L = 49;
    assertEquals(116964018, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case12() {
    int L = 81;
    assertEquals(903534367, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case13() {
    int L = 100;
    assertEquals(997628957, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case14() {
    int L = 256;
    assertEquals(905751828, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case15() {
    int L = 512;
    assertEquals(958139959, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case16() {
    int L = 666;
    assertEquals(995360682, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case17() {
    int L = 782;
    assertEquals(222116359, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case18() {
    int L = 981;
    assertEquals(725153921, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case19() {
    int L = 998;
    assertEquals(293776719, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case20() {
    int L = 999;
    assertEquals(849115283, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case21() {
    int L = 1000;
    assertEquals(227172651, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case22() {
    int L = 117;
    assertEquals(941935388, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case23() {
    int L = 550;
    assertEquals(511641044, stringweightdiv2.countMinimums(L));
  }

  @Test
  public void case24() {
    int L = 260;
    assertEquals(56914315, stringweightdiv2.countMinimums(L));
  }

}
