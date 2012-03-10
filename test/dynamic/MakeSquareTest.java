package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class MakeSquareTest {
  MakeSquare makesquare = new MakeSquare();

  @Test
  public void case1() {
    String S = "abcdabgcd";
    assertEquals(1, makesquare.minChanges(S));
  }

  @Test
  public void case2() {
    String S = "abcdeabce";
    assertEquals(1, makesquare.minChanges(S));
  }

  @Test
  public void case3() {
    String S = "abcdeabxde";
    assertEquals(1, makesquare.minChanges(S));
  }

  @Test
  public void case4() {
    String S = "aabcaabc";
    assertEquals(0, makesquare.minChanges(S));
  }

  @Test
  public void case5() {
    String S = "aaaaabaaaaabaaaaa";
    assertEquals(2, makesquare.minChanges(S));
  }

  @Test
  public void case6() {
    String S = "qwertyuiop";
    assertEquals(5, makesquare.minChanges(S));
  }

  @Test
  public void case7() {
    String S = "asdfghjkl";
    assertEquals(5, makesquare.minChanges(S));
  }

  @Test
  public void case8() {
    String S = "a";
    assertEquals(1, makesquare.minChanges(S));
  }

  @Test
  public void case9() {
    String S = "aa";
    assertEquals(0, makesquare.minChanges(S));
  }

  @Test
  public void case10() {
    String S = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb";
    assertEquals(2, makesquare.minChanges(S));
  }

  @Test
  public void case11() {
    String S = "qqwweerrttyyuuiiooppaassddffgghhjjkkllzzxxccvvbbnn";
    assertEquals(25, makesquare.minChanges(S));
  }

  @Test
  public void case12() {
    String S = "qetuoadgjlzcbmqwertyuiopasdfghjklzxcvbnm";
    assertEquals(12, makesquare.minChanges(S));
  }

  @Test
  public void case13() {
    String S = "qetuoxdgjlzcbmqwertyuiopasdfghjklzxcvbnm";
    assertEquals(13, makesquare.minChanges(S));
  }

  @Test
  public void case14() {
    String S = "aaaaaabacaaaaabaac";
    assertEquals(2, makesquare.minChanges(S));
  }

  @Test
  public void case15() {
    String S = "aaaaaaaaaabacaaaaaabac";
    assertEquals(3, makesquare.minChanges(S));
  }

  @Test
  public void case16() {
    String S = "xxxxxxxxxxxxxxxxxxxxxxxxxbacbac";
    assertEquals(6, makesquare.minChanges(S));
  }

  @Test
  public void case17() {
    String S = "zxxz";
    assertEquals(2, makesquare.minChanges(S));
  }

  @Test
  public void case18() {
    String S = "xyz";
    assertEquals(2, makesquare.minChanges(S));
  }

  @Test
  public void case19() {
    String S = "xyzxyzxyz";
    assertEquals(3, makesquare.minChanges(S));
  }

  @Test
  public void case20() {
    String S = "qqqqqwwwwwxxxxxyyyyqqqqqwwwww";
    assertEquals(9, makesquare.minChanges(S));
  }

  @Test
  public void case21() {
    String S = "abbababaaaaaababababbababababbabbabababaab";
    assertEquals(6, makesquare.minChanges(S));
  }

  @Test
  public void case22() {
    String S = "fgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfg";
    assertEquals(0, makesquare.minChanges(S));
  }

  @Test
  public void case23() {
    String S = "fgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfg";
    assertEquals(2, makesquare.minChanges(S));
  }

  @Test
  public void case24() {
    String S = "qweqweqweqwewqewqeqwewqeqweqeqewqewqeqweqweq";
    assertEquals(6, makesquare.minChanges(S));
  }

  @Test
  public void case25() {
    String S = "qqqqqqqqqqqqqqqqqqqqqqqqwwwwwwweeeeeewwwwwwweeeeee";
    assertEquals(24, makesquare.minChanges(S));
  }

  @Test
  public void case26() {
    String S = "qqqqqqqqqqqqqqqqqqqqqqqqqwwwwwweeeeeewwwwwwweeeeee";
    assertEquals(25, makesquare.minChanges(S));
  }

  @Test
  public void case27() {
    String S = "aaaaabbbbbccaaaaabbbbbcccdddddeeeeeffdddddeeeeefff";
    assertEquals(25, makesquare.minChanges(S));
  }

  @Test
  public void case28() {
    String S = "abcdefakkbeyyycabcdefkkydzzbaaaaaacdabc";
    assertEquals(15, makesquare.minChanges(S));
  }

  @Test
  public void case29() {
    String S = "sfagdfsdafdggsfadsfdggfasdgfadfsgafdfgsgfagdfadfas";
    assertEquals(11, makesquare.minChanges(S));
  }

  @Test
  public void case30() {
    String S = "abcdefghijklmnopqrstuwxyzyxwutsrqponmlkjihgfedcba";
    assertEquals(24, makesquare.minChanges(S));
  }

  @Test
  public void case31() {
    String S = "ccbbcbaabcccbabcbcaaaacabbaccccacaabcbbacacaacabcb";
    assertEquals(12, makesquare.minChanges(S));
  }

  @Test
  public void case32() {
    String S = "abcdefghijklmnopqrstuvwxyzabcgklimnaowprqhtkashlas";
    assertEquals(19, makesquare.minChanges(S));
  }

  @Test
  public void case33() {
    String S = "ababdabdbadbdabdbabdabdabdbabdabdababdbabdababab";
    assertEquals(6, makesquare.minChanges(S));
  }

  @Test
  public void case34() {
    String S = "abcdefghijklmnopqrstuvwxyzacegikmoqsuwy";
    assertEquals(13, makesquare.minChanges(S));
  }

  @Test
  public void case35() {
    String S = "tlskaqwmetdpwmsjdrkfltxskacqwmerfpuwmbjkiikal";
    assertEquals(10, makesquare.minChanges(S));
  }

  @Test
  public void case36() {
    String S = "abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcb";
    assertEquals(25, makesquare.minChanges(S));
  }

  @Test
  public void case37() {
    String S = "abcdabc";
    assertEquals(1, makesquare.minChanges(S));
  }

  @Test
  public void case38() {
    String S = "abba";
    assertEquals(2, makesquare.minChanges(S));
  }

  @Test
  public void case39() {
    String S = "abcatcxx";
    assertEquals(3, makesquare.minChanges(S));
  }

  @Test
  public void case40() {
    String S = "asdhdhdknfjifkdjdjdhdjdjdhdjdhdhdhdnbnmdkdjdjdjd";
    assertEquals(13, makesquare.minChanges(S));
  }

  @Test
  public void case41() {
    String S = "ababcd";
    assertEquals(2, makesquare.minChanges(S));
  }

  @Test
  public void case42() {
    String S = "abcddabc";
    assertEquals(2, makesquare.minChanges(S));
  }

  @Test
  public void case43() {
    String S = "sqgysjhnbhjhgkuasjyasujyaszjgasjjkhg";
    assertEquals(15, makesquare.minChanges(S));
  }

  @Test
  public void case44() {
    String S = "oremipsumdolorsitametconsecteturadipisicingelitsed";
    assertEquals(21, makesquare.minChanges(S));
  }

  @Test
  public void case45() {
    String S = "tabcdefghijklmnopqrsabcdefghijklmnopqrshdkljafhja";
    assertEquals(11, makesquare.minChanges(S));
  }

  @Test
  public void case46() {
    String S = "abcdefzhijklzmnopqrstuvyzdefyhijklynopqrstuvwx";
    assertEquals(8, makesquare.minChanges(S));
  }

  @Test
  public void case47() {
    String S = "abcdefghijklmnopqrstuwxyz";
    assertEquals(13, makesquare.minChanges(S));
  }

  @Test
  public void case48() {
    String S = "abcdefghijklmnopqrstua";
    assertEquals(11, makesquare.minChanges(S));
  }

}
