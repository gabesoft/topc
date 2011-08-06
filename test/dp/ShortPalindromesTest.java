package topc.test.dp;

import java.util.*;
import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dp.*;

public class ShortPalindromesTest {
  ShortPalindromes _calc = new ShortPalindromes();

  @Test
  public void case1() {
    assertEquals("ECARACE", _calc.shortest("RACE"));
  }

  @Test
  public void case2() {
    assertEquals("REDTOCPCOTDER", _calc.shortest("TOPCODER"));
  }

  @Test
  public void case3() {
    assertEquals("Q", _calc.shortest("Q"));
  }

  @Test
  public void case4() {
    assertEquals("MADAMIMADAM", _calc.shortest("MADAMIMADAM"));
  }

  @Test
  public void case5() {
    String expected = "AFLRCAGIOEOUAEOCEGRURGECOEAUOEOIGACRLFA";
    String actual = _calc.shortest("ALRCAGOEUAOEURGCOEUOOIGFA");
    assertEquals(expected, actual);
  }

  @Test
  public void case6() {
    assertEquals("CLOOLC", _calc.shortest("COOL"));
  }

  @Test
  public void case7() {
    assertEquals("ABCDEFGFEDCBA", _calc.shortest("ABCDEFG"));
  }

  @Test
  public void case8() {
    assertEquals("ABCDEFGFEDCBA", _calc.shortest("GFEDCBA"));
  }

  @Test
  public void case9() {
    assertEquals("AAAAA", _calc.shortest("AAAAA"));
  }

  @Test
  public void case10() {
    assertEquals("BAAAAAB", _calc.shortest("AAAAAB"));
  }

  @Test
  public void case11() {
    assertEquals("ABBBBBA", _calc.shortest("ABBBBB"));
  }

  @Test
  public void case12() {
    assertEquals("FDBACEGECABDF", _calc.shortest("GECABDF"));
  }

  @Test
  public void case13() {
    assertEquals("ABCDEFGFEDCBA", _calc.shortest("ACEGFDB"));
  }

  @Test
  public void case14() {
    assertEquals("AABCDCBAA", _calc.shortest("ABCDAA"));
  }

  @Test
  public void case15() {
    assertEquals("ACA", _calc.shortest("CA"));
  }

  @Test
  public void case16() {
    assertEquals("EDDE", _calc.shortest("EDD"));
  }

  @Test
  public void case17() {
    assertEquals("ABDEDBA", _calc.shortest("BEDA"));
  }

  @Test
  public void case18() {
    assertEquals("BBAEABB", _calc.shortest("BEABB"));
  }

  @Test
  public void case19() {
    assertEquals("DEABCBAED", _calc.shortest("DEABCB"));
  }

  @Test
  public void case20() {
    assertEquals("ABAECEABA", _calc.shortest("AECEABA"));
  }

  @Test
  public void case21() {
    assertEquals("ADEEDBDEEDA", _calc.shortest("EEDBDEDA"));
  }

  @Test
  public void case22() {
    assertEquals("ACBCDAAADCBCA", _calc.shortest("ACBAAADCC"));
  }

  @Test
  public void case23() {
    assertEquals("ADBCCCCCCBDA", _calc.shortest("ACCCCCCBDA"));
  }

  @Test
  public void case230() {
    assertEquals("ADBCCCCBDA", _calc.shortest("ACCCCBDA"));
  }

  @Test
  public void case24() {
    assertEquals("ABDCCDBABDCCDBA", _calc.shortest("ACDBABDCCDB"));
  }

  @Test
  public void case25() {
    assertEquals("BADDAEABCBAEADDAB", _calc.shortest("BDDAABCAEAAB"));
  }

  @Test
  public void case26() {
    assertEquals("BBCADBCEBBECBDACBB", _calc.shortest("BBCADBCEBBECD"));
  }

  @Test
  public void case27() {
    assertEquals("BCCAADEBCEECBEDAACCB", _calc.shortest("BCCAADEBCEEBAA"));
  }

  @Test
  public void case28() {
    assertEquals("DBEDCABCCECECCBACDEBD", _calc.shortest("EDCCCECEBACDEBD"));
  }

  @Test
  public void case29() {
    assertEquals("BBCBECCDBDBBBDBDCCEBCBB", _calc.shortest("CECCDBBBBDBDBCBB"));
  }

  @Test
  public void case30() {
    assertEquals("BBCADDECDBAEDEDEABDCEDDACBB", _calc.shortest("BBEDBAEEDEACEDDAC"));
  }

  @Test
  public void case31() {
    assertEquals("ACDEABCEEDABBDBBADEECBAEDCA", _calc.shortest("AEABEDBDBBADEECEDC"));
  }

  @Test
  public void case32() {
    assertEquals("AABDEDACDCEBCBDBCBECDCADEDBAA", _calc.shortest("AABEDDEBBDBCECDCADD"));
  }

  @Test
  public void case33() {
    assertEquals("ABCBCADCCEBBDCDCDBBECCDACBCBA", _calc.shortest("ACCADCCDCDDBBEDACBCB"));
  }

  @Test
  public void case34() {
    assertEquals("DBEACCEDAADABDDDDBADAADECCAEBD", _calc.shortest("BEAEDAADADDDDBDDCCABD"));
  }

  @Test
  public void case35() {
    assertEquals("ACEADEECABCCBBEAEBBCCBACEEDAECA", _calc.shortest("AEEECABCBEAEBBCCACDAEC"));
  }

  @Test
  public void case36() {
    assertEquals("ACBCCCDEABDABCCEBABECCBADBAEDCCCBCA", _calc.shortest("AEADACEBABCCBDBAEDCCCBC"));
  }

  @Test
  public void case37() {
    assertEquals("ACCCADECCDECCBECDCDCEBCCEDCCEDACCCA", _calc.shortest("AADEDEBECDCDEBCCECCEACCC"));
  }

  @Test
  public void case38() {
    assertEquals("CBDDEACBEDCEACCBEAEEAEBCCAECDEBCAEDDBC", _calc.shortest("CBDDECBEDCEBEEEAEBCCAEEAE"));
  }

  @Test
  public void case39() {
    assertEquals("OLHFMDCDRKEJWKBDEMWHWMEDBKWJEKRDCDMFHLO", _calc.shortest("HMDCDJKWHWMEDBKWJEKRFHLO"));
  }

  @Test
  public void case40() {
    assertEquals("FMSCEIWRQIGJQTGNXKHBPBHKXNGTQJGIQRWIECSMF", _calc.shortest("MWRQIGJTGNKPBHKXQGIIECSF"));
  }

  @Test
  public void case41() {
    assertEquals("LNGPTLBVSQKXVNUXFXOVOXFXUNVXKQSVBLTPGNL", _calc.shortest("PXVXFOVOXFXUNVKQSVBLTGNL"));
  }

  @Test
  public void case42() {
    assertEquals("MMMDQTIQDDSEJHKMARVPVPVRAMKHJESDDQITQDMMM", _calc.shortest("QTQDDSEJHKMAVPVVRSITDMMM"));
  }

  @Test
  public void case43() {
    assertEquals("AUZHHOUZENQJSBATBNRLWLRNBTABSJQNEZUOHHZUA", _calc.shortest("UZOUZENQJTNWLRNBTABSNHHZA"));
  }

  @Test
  public void case44() {
    assertEquals("EOFYITMBCFGPSKYNAIBHGVGHBIANYKSPGFCBMTIYFOE", _calc.shortest("EOFYITMBCPSKYNAIBHGVIGFBT"));
  }

  @Test
  public void case45() {
    assertEquals("LVJYMTWWFPUAJGFSTIAENQNEAITSFGJAUPFWWTMYJVL", _calc.shortest("LVJYMTWWFPUAJGFAENQAITSUW"));
  }

  @Test
  public void case46() {
    assertEquals("QFDZOBFNOSRDGIEHSCMQXQMCSHEIGDRSONFBOZDFQ", _calc.shortest("ZNRDGCMXQCSHEIRSONFBOZDFQ"));
  }

  @Test
  public void case47() {
    assertEquals("AFLRCAGIOEOUAEOCEGRGECOEAUOEOIGACRLFA", _calc.shortest("ALRCAGOEUAOERGCOEUOOIGFA"));
  }

  @Test
  public void case48() {
    assertEquals("AFLRCAGIOEOUAEOCEGRURGECOEAUOEOIGACRLFA", _calc.shortest("ALRCAGOEUAOEURGCOEUOOIGFA"));
  }

  @Test
  public void case49() {
    assertEquals("AFLRCAGIOEOUAEOCEGXXGECOEAUOEOIGACRLFA", _calc.shortest("ALRCAGOEUAOEXXGCOEUOOIGFA"));
  }

  @Test
  public void case50() {
    assertEquals("AFLRCAGIOEOUAEOCEXXXECOEAUOEOIGACRLFA", _calc.shortest("ALRCAGOEUAOEXXXCOEUOOIGFA"));
  }

  @Test
  public void case51() {
    assertEquals("ABACKADJAHAFAGAFAHAJDAKCABA", _calc.shortest("ABACADAFAGAFAHAJAKABA"));
  }

  @Test
  public void case52() {
    assertEquals("ABLACKADJAEIAFHAGAHFAIEAJDAKCALBA", _calc.shortest("ABACADAEAFAGAHAIAJAKAL"));
  }

  @Test
  public void case53() {
    assertEquals("GRESDGPOJORENBIGLULGIBNEROJOPGDSERG", _calc.shortest("SDGBIULGIBNEROJOPGERG"));
  }

  @Test
  public void case54() {
    assertEquals("REDTOCPCOTDER", _calc.shortest("TOPCODER"));
  }

  @Test
  public void case55() {
    assertEquals("ELGOOGLE", _calc.shortest("GOOGLE"));
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
