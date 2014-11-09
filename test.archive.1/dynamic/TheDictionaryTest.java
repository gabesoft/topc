package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TheDictionaryTest {
  TheDictionary thedictionary = new TheDictionary();

  @Test
  public void case1() {
    int n = 2;
    int m = 2;
    int k = 2;
    assertEquals("azaz", thedictionary.find(n, m, k));
  }

  @Test
  public void case2() {
    int n = 2;
    int m = 2;
    int k = 6;
    assertEquals("zzaa", thedictionary.find(n, m, k));
  }

  @Test
  public void case3() {
    int n = 10;
    int m = 10;
    int k = 1000000000;
    assertEquals("", thedictionary.find(n, m, k));
  }

  @Test
  public void case4() {
    int n = 7;
    int m = 4;
    int k = 47;
    assertEquals("aaazazaazaz", thedictionary.find(n, m, k));
  }

  @Test
  public void case5() {
    int n = 100;
    int m = 100;
    int k = 1000000000;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzazzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzazzzzzazzzzzzzzzzzzazzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case6() {
    int n = 1;
    int m = 100;
    int k = 100;
    assertEquals("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaz", thedictionary.find(n, m, k));
  }

  @Test
  public void case7() {
    int n = 1;
    int m = 100;
    int k = 101;
    assertEquals("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzza", thedictionary.find(n, m, k));
  }

  @Test
  public void case8() {
    int n = 100;
    int m = 1;
    int k = 102;
    assertEquals("", thedictionary.find(n, m, k));
  }

  @Test
  public void case9() {
    int n = 100;
    int m = 1;
    int k = 1000000000;
    assertEquals("", thedictionary.find(n, m, k));
  }

  @Test
  public void case10() {
    int n = 10;
    int m = 10;
    int k = 184756;
    assertEquals("zzzzzzzzzzaaaaaaaaaa", thedictionary.find(n, m, k));
  }

  @Test
  public void case11() {
    int n = 48;
    int m = 1;
    int k = 301413357;
    assertEquals("", thedictionary.find(n, m, k));
  }

  @Test
  public void case12() {
    int n = 25;
    int m = 69;
    int k = 160567226;
    assertEquals("aaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzazazzzzzazzzzzzzzazzazzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case13() {
    int n = 88;
    int m = 52;
    int k = 35766291;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzzazzzzzzzzazzzzzzzazzzzzzzaazzazzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case14() {
    int n = 73;
    int m = 65;
    int k = 597007;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzzzazzazzzzzzzzzzzzzzzzzzzzzzzazazzzzzzzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case15() {
    int n = 45;
    int m = 37;
    int k = 392289611;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazazzzzzzzzzzzzzzzzzzzzazzzzzzzzaazaazaazzzzzza", thedictionary.find(n, m, k));
  }

  @Test
  public void case16() {
    int n = 23;
    int m = 99;
    int k = 37215529;
    assertEquals("aaaaaaaaaaaaaaaaaazzzzzzzzzzazazzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case17() {
    int n = 34;
    int m = 91;
    int k = 683447134;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzazzazzzzzzzzzzzzazzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case18() {
    int n = 27;
    int m = 73;
    int k = 116752252;
    assertEquals("aaaaaaaaaaaaaaaaaaaaazzzzzzazzzzzzzzzzzzzazazzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazazzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case19() {
    int n = 5;
    int m = 69;
    int k = 69909135;
    assertEquals("", thedictionary.find(n, m, k));
  }

  @Test
  public void case20() {
    int n = 84;
    int m = 44;
    int k = 21417563;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazazzzazzzzzzzzzzazzazzzzzzazzzzzzazzzzazzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case21() {
    int n = 96;
    int m = 99;
    int k = 901413353;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzazzazazzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzazz", thedictionary.find(n, m, k));
  }

  @Test
  public void case22() {
    int n = 96;
    int m = 90;
    int k = 960567224;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazaazzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzazzzzzzzzzzazzzzzzzzzzzzzzzzazzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case23() {
    int n = 97;
    int m = 99;
    int k = 935766290;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzaazzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzaazzzzzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case24() {
    int n = 97;
    int m = 95;
    int k = 900597006;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzzzzazzzzzzzazzzzzzzzzzzzzzazzzzzzzzzzzazazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case25() {
    int n = 99;
    int m = 97;
    int k = 992289607;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazaazzzzzzaazzzzzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case26() {
    int n = 7;
    int m = 91;
    int k = 413056;
    assertEquals("aaazzzazzzzzzazzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case27() {
    int n = 7;
    int m = 99;
    int k = 567066;
    assertEquals("aaazzzazzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case28() {
    int n = 8;
    int m = 92;
    int k = 766256;
    assertEquals("aaaazzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzazzzzzzazzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case29() {
    int n = 17;
    int m = 25;
    int k = 999999999;
    assertEquals("aaaaazazzzzzzzazaazazazazzzzzaazzazzzazzza", thedictionary.find(n, m, k));
  }

  @Test
  public void case30() {
    int n = 14;
    int m = 1;
    int k = 1000000000;
    assertEquals("", thedictionary.find(n, m, k));
  }

  @Test
  public void case31() {
    int n = 17;
    int m = 4;
    int k = 999999999;
    assertEquals("", thedictionary.find(n, m, k));
  }

  @Test
  public void case32() {
    int n = 100;
    int m = 100;
    int k = 1;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case33() {
    int n = 85;
    int m = 77;
    int k = 1000000000;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzazzzzzzzzzzzzzzzzzzzzazzzzzzzzzzazazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzazzzaz", thedictionary.find(n, m, k));
  }

  @Test
  public void case34() {
    int n = 99;
    int m = 99;
    int k = 999998758;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzazzzzzzazzzzzzzzzzzazzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzazzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case35() {
    int n = 99;
    int m = 99;
    int k = 9765877;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzazzzzzzzazzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case36() {
    int n = 100;
    int m = 100;
    int k = 999996565;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzazzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzazzzazzzzzzzzzzzzzzzzzzzazzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case37() {
    int n = 100;
    int m = 100;
    int k = 10000;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzazzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case38() {
    int n = 100;
    int m = 50;
    int k = 1000000000;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzazzzzzzzzzzazzazzzzzzaazzzzzzzzzzzzzaazzzzzzazzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case39() {
    int n = 100;
    int m = 100;
    int k = 999999999;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzazzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzazzzzzazzzzzzzzzzzazzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case40() {
    int n = 79;
    int m = 98;
    int k = 12345678;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzaazzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzazzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case41() {
    int n = 100;
    int m = 100;
    int k = 9987678;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzazzzzzzazzzzzzzzzzazzzzzzzzzzzzzazzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case42() {
    int n = 100;
    int m = 100;
    int k = 100100100;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzazzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case43() {
    int n = 97;
    int m = 98;
    int k = 575111539;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzazzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzazzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzazz", thedictionary.find(n, m, k));
  }

  @Test
  public void case44() {
    int n = 100;
    int m = 100;
    int k = 10000000;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzazzzzzzazzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzazzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case45() {
    int n = 100;
    int m = 100;
    int k = 1000000;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzazzzazzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case46() {
    int n = 99;
    int m = 99;
    int k = 100000001;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazazazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzaazzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case47() {
    int n = 100;
    int m = 100;
    int k = 100000000;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzza", thedictionary.find(n, m, k));
  }

  @Test
  public void case48() {
    int n = 50;
    int m = 50;
    int k = 100000000;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzazzzzzzazzzazzzzzzzzzzzzazzzzzzzazazazzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case49() {
    int n = 100;
    int m = 100;
    int k = 10000001;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzazzzzzzazzzzzzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzazzzzzzzzzazzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case50() {
    int n = 99;
    int m = 99;
    int k = 999999999;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzazzzzzzazzzzzzzzzzzazzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzazzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

  @Test
  public void case51() {
    int n = 99;
    int m = 99;
    int k = 1000000000;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzazzzzzzazzzzzzzzzzzazzzzzzzzzazzzzzzzzzzzzzzzzzzzzzzzazzzzazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", thedictionary.find(n, m, k));
  }

}
