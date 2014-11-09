package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class AlienAndPasswordTest {
  AlienAndPassword alienandpassword = new AlienAndPassword();

  @Test
  public void case1() {
    String S = "A";
    assertEquals(1, alienandpassword.getNumber(S));
  }

  @Test
  public void case2() {
    String S = "ABA";
    assertEquals(3, alienandpassword.getNumber(S));
  }

  @Test
  public void case3() {
    String S = "AABACCCCABAA";
    assertEquals(7, alienandpassword.getNumber(S));
  }

  @Test
  public void case4() {
    String S = "AGAAGAHHHHFTQLLAPUURQQRRRUFJJSBSZVJZZZ";
    assertEquals(26, alienandpassword.getNumber(S));
  }

  @Test
  public void case5() {
    String S = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";
    assertEquals(1, alienandpassword.getNumber(S));
  }

  @Test
  public void case6() {
    String S = "HQ";
    assertEquals(2, alienandpassword.getNumber(S));
  }

  @Test
  public void case7() {
    String S = "H";
    assertEquals(1, alienandpassword.getNumber(S));
  }

  @Test
  public void case8() {
    String S = "MEAYL";
    assertEquals(5, alienandpassword.getNumber(S));
  }

  @Test
  public void case9() {
    String S = "LFDXFI";
    assertEquals(6, alienandpassword.getNumber(S));
  }

  @Test
  public void case10() {
    String S = "CVSCXGGB";
    assertEquals(7, alienandpassword.getNumber(S));
  }

  @Test
  public void case11() {
    String S = "KFNQDUXWFNFOZVSRT";
    assertEquals(17, alienandpassword.getNumber(S));
  }

  @Test
  public void case12() {
    String S = "JPREPGGXRPNRVYS";
    assertEquals(14, alienandpassword.getNumber(S));
  }

  @Test
  public void case13() {
    String S = "MWCYSYYCQPEVIKEFFMZNIMKKASVWSRENZKYC";
    assertEquals(33, alienandpassword.getNumber(S));
  }

  @Test
  public void case14() {
    String S = "FXTLSGYPSFADPOOEFXZBCOEJUVPVAB";
    assertEquals(29, alienandpassword.getNumber(S));
  }

  @Test
  public void case15() {
    String S = "YGP";
    assertEquals(3, alienandpassword.getNumber(S));
  }

  @Test
  public void case16() {
    String S = "EYLFPBNPLJVRVIPYAMYEHWQNQRQPMXUJJLOOVAOWUXWHMSNCBX";
    assertEquals(48, alienandpassword.getNumber(S));
  }

  @Test
  public void case17() {
    String S = "OKSFZKVATXDKNLYJYHFIXJSWNKKUFNUXXZRZBMNMGQOOKETLYH";
    assertEquals(47, alienandpassword.getNumber(S));
  }

  @Test
  public void case18() {
    String S = "KOAUGZQRCDDIUTEIOJWAYYZPVSCMPSAJLFVGUBFAAOVLZYLNTR";
    assertEquals(47, alienandpassword.getNumber(S));
  }

  @Test
  public void case19() {
    String S = "DCPWSRTESJWHDIZCOBZCNFWLQIJTVDWVXHRCBLDVGYLWGBUSBM";
    assertEquals(50, alienandpassword.getNumber(S));
  }

  @Test
  public void case20() {
    String S = "ORXTLHCSMPXOHGMGNKEUFDXOTOGBGXPEYANFETCUKEPZSHKLJU";
    assertEquals(50, alienandpassword.getNumber(S));
  }

  @Test
  public void case21() {
    String S = "EEECEDACCD";
    assertEquals(7, alienandpassword.getNumber(S));
  }

  @Test
  public void case22() {
    String S = "DADDCACADC";
    assertEquals(9, alienandpassword.getNumber(S));
  }

  @Test
  public void case23() {
    String S = "ECADEDCBBD";
    assertEquals(9, alienandpassword.getNumber(S));
  }

  @Test
  public void case24() {
    String S = "ADABCCCBEA";
    assertEquals(8, alienandpassword.getNumber(S));
  }

  @Test
  public void case25() {
    String S = "ADEAAADBAB";
    assertEquals(8, alienandpassword.getNumber(S));
  }

  @Test
  public void case26() {
    String S = "HHLHLLHILK";
    assertEquals(8, alienandpassword.getNumber(S));
  }

  @Test
  public void case27() {
    String S = "DFFDGFGGEC";
    assertEquals(8, alienandpassword.getNumber(S));
  }

  @Test
  public void case28() {
    String S = "IHJHHIJKKL";
    assertEquals(8, alienandpassword.getNumber(S));
  }

  @Test
  public void case29() {
    String S = "KJLLNJLNMM";
    assertEquals(8, alienandpassword.getNumber(S));
  }

  @Test
  public void case30() {
    String S = "CDBCBAAEAC";
    assertEquals(9, alienandpassword.getNumber(S));
  }

  @Test
  public void case31() {
    String S = "RRRRSTQQUTTQRSUQTTTQSSQTUTQSUS";
    assertEquals(22, alienandpassword.getNumber(S));
  }

  @Test
  public void case32() {
    String S = "KJIILLMIIJMIJKILIJJJKJKKJMJJKK";
    assertEquals(22, alienandpassword.getNumber(S));
  }

  @Test
  public void case33() {
    String S = "NMNPQQMQONMPOQQQOOQOPOPNMOPMPP";
    assertEquals(25, alienandpassword.getNumber(S));
  }

  @Test
  public void case34() {
    String S = "DDCGCDCDGCFCFGDFGEGDFDCEFDCFDC";
    assertEquals(29, alienandpassword.getNumber(S));
  }

  @Test
  public void case35() {
    String S = "RQRTSRSQSPSPRSPRRRPTQPSPPRTPPS";
    assertEquals(26, alienandpassword.getNumber(S));
  }

  @Test
  public void case36() {
    String S = "OSROSQOSPRSORQQSPPQQPSORSPQORRQSPQSORQSO";
    assertEquals(36, alienandpassword.getNumber(S));
  }

  @Test
  public void case37() {
    String S = "GIIKJHJHJGHKGKIKJHKJIGGGKJIJIKJHKJGGIHJK";
    assertEquals(36, alienandpassword.getNumber(S));
  }

  @Test
  public void case38() {
    String S = "CGGCCCFFCDFEEEECFDFFECGCCFFEFFEGFGDFEFCD";
    assertEquals(29, alienandpassword.getNumber(S));
  }

  @Test
  public void case39() {
    String S = "VTSWVSSVUTVSTSVVWWVVWUTWSVTTSSTWTWSWUSVU";
    assertEquals(34, alienandpassword.getNumber(S));
  }

  @Test
  public void case40() {
    String S = "SRRTUUQRSQTQRRRUURSRTSQQRQRQRSRQQSUTTRST";
    assertEquals(32, alienandpassword.getNumber(S));
  }

  @Test
  public void case41() {
    String S = "BABABAAABBBAAAAAABBABABBABBAABAAABBBABABBBBBAABBAB";
    assertEquals(27, alienandpassword.getNumber(S));
  }

  @Test
  public void case42() {
    String S = "ABABAABBBBBBBAABABBBBABAAAABAAAABBBBBAABABAABBABAB";
    assertEquals(26, alienandpassword.getNumber(S));
  }

  @Test
  public void case43() {
    String S = "AAAABBABBBBBABABAABBAAABBABABBAAAAABBAAABABABBABAB";
    assertEquals(28, alienandpassword.getNumber(S));
  }

  @Test
  public void case44() {
    String S = "ABBAAAABBBAAAABAAABAAABAABABABAAABABBABAABAAAABAAA";
    assertEquals(27, alienandpassword.getNumber(S));
  }

  @Test
  public void case45() {
    String S = "BBBAABAAAAABAAAABBABABABABAABBABAAABABBABAAAAAABAB";
    assertEquals(29, alienandpassword.getNumber(S));
  }

  @Test
  public void case46() {
    String S = "BBBAAABABABABBABABBABABABAAABBBBBABBAAAABBABAAAAAA";
    assertEquals(28, alienandpassword.getNumber(S));
  }

  @Test
  public void case47() {
    String S = "YZZZZZZZZZYYZZYYZYZYZZZZYYYZYYYYYZYYYZZYYYYZYYYZYZ";
    assertEquals(22, alienandpassword.getNumber(S));
  }

  @Test
  public void case48() {
    String S = "DDCCDCDCCDCCCDCDCDDCCCDCDCCCDCDCCCDDDCDCDCDCCCCDCC";
    assertEquals(32, alienandpassword.getNumber(S));
  }

  @Test
  public void case49() {
    String S = "PPQQQPQPPQPQPQPQQPQQPQPQPQQQQPPQPQPPQQQQQQPPPPQPQQ";
    assertEquals(30, alienandpassword.getNumber(S));
  }

  @Test
  public void case50() {
    String S = "UVUVVVVVVVUUUUUVUUVUVUVUUUUUUVUVVVUVVUUUUVVUVUVVVV";
    assertEquals(24, alienandpassword.getNumber(S));
  }

  @Test
  public void case51() {
    String S = "OLLTTNOLRQLUSNNTNUPPTNSNQTPSOUQMULNTOMPOMLPLSULTMP";
    assertEquals(46, alienandpassword.getNumber(S));
  }

  @Test
  public void case52() {
    String S = "TPNSMNMLKOKRPTKPLMKTSTLRNNKRQQKMSTSTTTOMKSRSRNKRQO";
    assertEquals(46, alienandpassword.getNumber(S));
  }

  @Test
  public void case53() {
    String S = "VNSMPPSOONQPOSMRQVSMUOTQMTSMNOVPURNRSSUUVUTMTVNRUS";
    assertEquals(46, alienandpassword.getNumber(S));
  }

  @Test
  public void case54() {
    String S = "HIGLFGMHLIEGFLEJHJKKMJHEMFJGEIMKDFJEKJFIGHDKIIGELL";
    assertEquals(47, alienandpassword.getNumber(S));
  }

  @Test
  public void case55() {
    String S = "EKIDIMDMGIHFKFJKFFDEEKIMELEKLJJMMFJJILHDGKLGEEFIKJ";
    assertEquals(44, alienandpassword.getNumber(S));
  }

  @Test
  public void case56() {
    String S = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    assertEquals(1, alienandpassword.getNumber(S));
  }

  @Test
  public void case57() {
    String S = "AAAAAAB";
    assertEquals(2, alienandpassword.getNumber(S));
  }

  @Test
  public void case58() {
    String S = "DJSADJSAIJDISAJDISJJIASJFI";
    assertEquals(25, alienandpassword.getNumber(S));
  }

  @Test
  public void case59() {
    String S = "AAAAAAA";
    assertEquals(1, alienandpassword.getNumber(S));
  }

  @Test
  public void case60() {
    String S = "AB";
    assertEquals(2, alienandpassword.getNumber(S));
  }

  @Test
  public void case61() {
    String S = "AABBCC";
    assertEquals(3, alienandpassword.getNumber(S));
  }

  @Test
  public void case62() {
    String S = "AA";
    assertEquals(1, alienandpassword.getNumber(S));
  }

  @Test
  public void case63() {
    String S = "AAAA";
    assertEquals(1, alienandpassword.getNumber(S));
  }

  @Test
  public void case64() {
    String S = "ABCDEF";
    assertEquals(6, alienandpassword.getNumber(S));
  }

}
