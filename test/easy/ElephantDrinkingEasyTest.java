package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ElephantDrinkingEasyTest {
  ElephantDrinkingEasy elephantdrinkingeasy = new ElephantDrinkingEasy();

  @Test
  public void case1() {
    String[] map = { "NNNNN", "NNYYN", "NYNNN", "NNYNN", "NNNNN" };
    assertEquals(4, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case2() {
    String[] map = { "YYY", "YYY", "YYY" };
    assertEquals(8, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case3() {
    String[] map = { "YNYN", "NNYY", "YYNN", "YYYY" };
    assertEquals(10, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case4() {
    String[] map = { "YNYN", "YNYY", "YYNN", "YYYY" };
    assertEquals(10, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case5() {
    String[] map = { "YYNYN", "NYNNY", "YNYNN", "YYNYY", "YYNNN" };
    assertEquals(12, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case6() {
    String[] map = { "YYNYN", "NYNYY", "YNYYN", "YYNYY", "YYNNN" };
    assertEquals(13, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case7() {
    String[] map = { "NN", "NN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case8() {
    String[] map = { "YYYY", "YYYY", "YYYY", "YYYY" };
    assertEquals(12, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case9() {
    String[] map = { "YYYN", "YYNY", "NNNN", "YNYY" };
    assertEquals(9, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case10() {
    String[] map = { "NNYY", "NNNN", "NNNY", "NNNN" };
    assertEquals(3, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case11() {
    String[] map = { "YYY", "NNN", "YNY" };
    assertEquals(5, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case12() {
    String[] map = { "YYYYY", "YNNNN", "YYYYY", "YNYYY", "YNYNY" };
    assertEquals(15, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case13() {
    String[] map = { "YYYY", "YNYY", "YYYY", "YNNY" };
    assertEquals(12, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case14() {
    String[] map = { "NNNNN", "YNNYN", "NNNNN", "NNNNY", "NNNNN" };
    assertEquals(3, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case15() {
    String[] map = { "NNNNN", "NNNNN", "NNNNN", "NNNNN", "NNNNN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case16() {
    String[] map = { "NNNNN", "NNNNN", "NNNNN", "NYNNN", "NNNNY" };
    assertEquals(2, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case17() {
    String[] map = { "YYY", "YNY", "YNY" };
    assertEquals(7, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case18() {
    String[] map = { "NNN", "NYN", "NNN" };
    assertEquals(1, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case19() {
    String[] map = { "YNN", "YNY", "YYY" };
    assertEquals(6, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case20() {
    String[] map = { "NNNN", "NNNN", "NNNN", "NNNN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case21() {
    String[] map = { "YYYYY", "YYYYY", "YNNNY", "YYYYY", "YNYYY" };
    assertEquals(16, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case22() {
    String[] map = { "YY", "YN" };
    assertEquals(3, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case23() {
    String[] map = { "YYY", "YYY", "YYY" };
    assertEquals(8, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case24() {
    String[] map = { "NNNYN", "NNNNN", "NNNNN", "NNNNY", "YYYNN" };
    assertEquals(5, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case25() {
    String[] map = { "NNYY", "NYNN", "NNYN", "NYYY" };
    assertEquals(7, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case26() {
    String[] map = { "YNY", "YYY", "YNN" };
    assertEquals(6, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case27() {
    String[] map = { "YYYY", "NYYY", "YYYY", "YYYY" };
    assertEquals(12, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case28() {
    String[] map = { "YYY", "YNN", "YYN" };
    assertEquals(6, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case29() {
    String[] map = { "YY", "YY" };
    assertEquals(4, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case30() {
    String[] map = { "YNYY", "NYYY", "YNYY", "YYYY" };
    assertEquals(11, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case31() {
    String[] map = { "NNN", "YNN", "NNN" };
    assertEquals(1, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case32() {
    String[] map = { "NYNYN", "NNNNN", "NNNNN", "NNNYN", "NNNNN" };
    assertEquals(3, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case33() {
    String[] map = { "YYYYN", "YYNYY", "YYYNY", "YYNYY", "YYYYY" };
    assertEquals(15, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case34() {
    String[] map = { "NNY", "YNN", "NNN" };
    assertEquals(2, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case35() {
    String[] map = { "NNNN", "NNNN", "NNNN", "NNNY" };
    assertEquals(1, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case36() {
    String[] map = { "NNN", "NNN", "NNN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case37() {
    String[] map = { "NNYY", "YYYN", "NNNN", "NYNY" };
    assertEquals(7, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case38() {
    String[] map = { "NN", "NN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case39() {
    String[] map = { "YY", "YY" };
    assertEquals(4, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case40() {
    String[] map = { "NNN", "NNN", "NNY" };
    assertEquals(1, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case41() {
    String[] map = { "NN", "NN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case42() {
    String[] map = { "YYYYN", "YNYYY", "YYYYY", "YYNYN", "YNYNY" };
    assertEquals(14, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case43() {
    String[] map = { "YNYYY", "YYNNY", "YYYYY", "NYYNY", "YYNYN" };
    assertEquals(15, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case44() {
    String[] map = { "NNYN", "YYNY", "YYNY", "YNNN" };
    assertEquals(8, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case45() {
    String[] map = { "YYYY", "YYYY", "YYYY", "YYYY" };
    assertEquals(12, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case46() {
    String[] map = { "YNNN", "NNNN", "NNYY", "NYYN" };
    assertEquals(5, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case47() {
    String[] map = { "NNNN", "NNNN", "NNYY", "NNNY" };
    assertEquals(3, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case48() {
    String[] map = { "YYYY", "YYYY", "YYYY", "NYYY" };
    assertEquals(11, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case49() {
    String[] map = { "YYYY", "YNYN", "YNYN", "NYYN" };
    assertEquals(10, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case50() {
    String[] map = { "NNNN", "NNNY", "NNNN", "NYNN" };
    assertEquals(2, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case51() {
    String[] map = { "YYY", "YNY", "NNN" };
    assertEquals(5, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case52() {
    String[] map = { "YNNY", "YYYN", "YYNY", "YYNY" };
    assertEquals(10, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case53() {
    String[] map = { "NY", "NN" };
    assertEquals(1, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case54() {
    String[] map = { "YYNYN", "NNNNN", "YYYYY", "YNYYN", "YNYNY" };
    assertEquals(12, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case55() {
    String[] map = { "YNY", "YYY", "YYY" };
    assertEquals(8, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case56() {
    String[] map = { "YY", "YY" };
    assertEquals(4, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case57() {
    String[] map = { "NNNNY", "NYNNN", "NNNNN", "NYNYN", "NNNYY" };
    assertEquals(6, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case58() {
    String[] map = { "YNN", "YNN", "NNN" };
    assertEquals(2, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case59() {
    String[] map = { "YNNYN", "YYYYY", "NNYYY", "YYNYN", "YNYYY" };
    assertEquals(15, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case60() {
    String[] map = { "NNY", "NYN", "NNN" };
    assertEquals(2, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case61() {
    String[] map = { "NYNN", "YYYN", "YNYY", "YYYN" };
    assertEquals(8, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case62() {
    String[] map = { "NNNN", "YNYN", "YNNN", "YYYN" };
    assertEquals(6, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case63() {
    String[] map = { "NYYYN", "YNYNY", "YYNNN", "NYNYY", "YNNNN" };
    assertEquals(11, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case64() {
    String[] map = { "YNYYY", "NYNNY", "NYYYY", "NYNNN", "YYNNY" };
    assertEquals(14, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case65() {
    String[] map = { "YNNYY", "YYNNN", "YNYNN", "YNNYN", "NNNNN" };
    assertEquals(9, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case66() {
    String[] map = { "YYNY", "YNNN", "YYYY", "NYYN" };
    assertEquals(9, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case67() {
    String[] map = { "YNYNN", "NNNYN", "NNYNN", "NNYNY", "YNNYN" };
    assertEquals(8, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case68() {
    String[] map = { "NN", "NN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case69() {
    String[] map = { "NNNY", "NNNY", "YNNN", "NNNN" };
    assertEquals(3, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case70() {
    String[] map = { "NNNNN", "NNNNN", "YNNNN", "NNNNN", "NNNNY" };
    assertEquals(2, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case71() {
    String[] map = { "YYNN", "NNNN", "NYYN", "YYNY" };
    assertEquals(7, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case72() {
    String[] map = { "YY", "NY" };
    assertEquals(3, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case73() {
    String[] map = { "NYNN", "YNNN", "NNYY", "NNYN" };
    assertEquals(5, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case74() {
    String[] map = { "YY", "YY" };
    assertEquals(4, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case75() {
    String[] map = { "YYYY", "YYYN", "NYYY", "YYYN" };
    assertEquals(11, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case76() {
    String[] map = { "YYY", "YNY", "YYN" };
    assertEquals(7, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case77() {
    String[] map = { "NNNNN", "NNNNN", "NNNNN", "NNNNN", "NNNNY" };
    assertEquals(1, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case78() {
    String[] map = { "NNN", "NNN", "NNN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case79() {
    String[] map = { "YYY", "NYY", "YNN" };
    assertEquals(6, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case80() {
    String[] map = { "NNNNN", "NYYNN", "NNNNN", "NNNNN", "NNNNN" };
    assertEquals(2, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case81() {
    String[] map = { "NY", "YY" };
    assertEquals(3, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case82() {
    String[] map = { "YNY", "YYN", "YYN" };
    assertEquals(6, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case83() {
    String[] map = { "NN", "NN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case84() {
    String[] map = { "NN", "YN" };
    assertEquals(1, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case85() {
    String[] map = { "YNYY", "YNYN", "YNNN", "NNNY" };
    assertEquals(7, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case86() {
    String[] map = { "YYYYY", "YYYNY", "YYNYN", "YYYYN", "NYYYN" };
    assertEquals(14, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case87() {
    String[] map = { "NNNNY", "NNNNN", "NYNNN", "YYNNY", "NNYNY" };
    assertEquals(7, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case88() {
    String[] map = { "YY", "YY" };
    assertEquals(4, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case89() {
    String[] map = { "NNNN", "NYNN", "NNNY", "NNNY" };
    assertEquals(3, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case90() {
    String[] map = { "YYNN", "YNYN", "YYYY", "YYNN" };
    assertEquals(9, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case91() {
    String[] map = { "YNN", "YYY", "NYN" };
    assertEquals(5, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case92() {
    String[] map = { "YYY", "NNN", "NYY" };
    assertEquals(5, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case93() {
    String[] map = { "NNNN", "NNNN", "NNNN", "NYNN" };
    assertEquals(1, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case94() {
    String[] map = { "YN", "NN" };
    assertEquals(1, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case95() {
    String[] map = { "NNNNN", "NNYNN", "NNNYN", "NNNNN", "NNNNN" };
    assertEquals(2, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case96() {
    String[] map = { "YNN", "NYN", "YNN" };
    assertEquals(3, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case97() {
    String[] map = { "YNNYN", "NNNNY", "YNNNN", "NYYNY", "YYNYY" };
    assertEquals(11, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case98() {
    String[] map = { "NYNY", "YYYN", "YYNY", "YYYY" };
    assertEquals(10, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case99() {
    String[] map = { "YYYYY", "YYNYN", "YNNNY", "YYYYN", "YYYYN" };
    assertEquals(15, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case100() {
    String[] map = { "YNNNN", "NNYYY", "YYYYY", "NNNNY", "YYYYY" };
    assertEquals(13, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case101() {
    String[] map = { "NNNNN", "NYNNN", "NNNNN", "NNNNN", "NNYYN" };
    assertEquals(3, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case102() {
    String[] map = { "NNNNN", "NNNNN", "NNNNN", "NNNNN", "NNNNN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case103() {
    String[] map = { "YNYY", "YNYY", "YYYY", "YNYY" };
    assertEquals(11, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case104() {
    String[] map = { "YYNYY", "YYYNY", "YNYNY", "NNYNY", "YNNYY" };
    assertEquals(15, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case105() {
    String[] map = { "NN", "NN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case106() {
    String[] map = { "NNN", "NYN", "NYN" };
    assertEquals(2, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case107() {
    String[] map = { "NNN", "NNN", "NNN" };
    assertEquals(0, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case108() {
    String[] map = { "YYYYY", "YYYYY", "YYYYY", "YYYYY", "YYYYY" };
    assertEquals(16, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case109() {
    String[] map = { "YNYN", "YNYY", "YYNN", "YYYY" };
    assertEquals(10, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case110() {
    String[] map = { "YNYN", "NNYY", "YYNN", "YYYY" };
    assertEquals(10, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case111() {
    String[] map = { "NYYN", "YNYY", "YYNN", "NYNN" };
    assertEquals(7, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case112() {
    String[] map = { "YYYY", "YYYY", "YYYY", "YYYY" };
    assertEquals(12, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case113() {
    String[] map = { "YYNNN", "YYNNN", "YYYYY", "YYYYY", "NNNNN" };
    assertEquals(12, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case114() {
    String[] map = { "YYNYN", "NYNYY", "YNYYN", "YYNYY", "YYNNN" };
    assertEquals(13, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case115() {
    String[] map = { "NNYYN", "NNYYN", "YYNNN", "NYNNN", "NNNNN" };
    assertEquals(7, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case116() {
    String[] map = { "NNNYN", "YNNNN", "NNNYY", "YYYNY", "YYYYY" };
    assertEquals(12, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case117() {
    String[] map = { "YYYY", "YYYY", "NNYY", "YNYY" };
    assertEquals(11, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case118() {
    String[] map = { "NNYY", "NNYY", "YYYN", "NYNN" };
    assertEquals(7, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case119() {
    String[] map = { "YNNNY", "NYYNY", "YYYYY", "NNNNN", "NNNNN" };
    assertEquals(10, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case120() {
    String[] map = { "NYYNN", "NYYNN", "YNNYY", "YNNYY", "NYYNN" };
    assertEquals(11, elephantdrinkingeasy.maxElephants(map));
  }

  @Test
  public void case121() {
    String[] map = { "YNYNN", "NYYNY", "NYYYN", "NYYYN", "YNNNN" };
    assertEquals(10, elephantdrinkingeasy.maxElephants(map));
  }

}
