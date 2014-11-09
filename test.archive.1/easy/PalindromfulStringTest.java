package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PalindromfulStringTest {
  PalindromfulString palindromfulstring = new PalindromfulString();

  @Test
  public void case1() {
    int N = 2;
    int M = 2;
    int K = 1;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case2() {
    int N = 2;
    int M = 2;
    int K = 0;
    assertEquals(676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case3() {
    int N = 3;
    int M = 2;
    int K = 1;
    assertEquals(1326L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case4() {
    int N = 4;
    int M = 4;
    int K = 1;
    assertEquals(676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case5() {
    int N = 7;
    int M = 3;
    int K = 3;
    assertEquals(4310176L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case6() {
    int N = 11;
    int M = 2;
    int K = 0;
    assertEquals(3670344486987776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case7() {
    int N = 11;
    int M = 2;
    int K = 1;
    assertEquals(1190791264331526L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case8() {
    int N = 11;
    int M = 2;
    int K = 3;
    assertEquals(20442143237776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case9() {
    int N = 11;
    int M = 2;
    int K = 4;
    assertEquals(1399174487776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case10() {
    int N = 11;
    int M = 2;
    int K = 5;
    assertEquals(66166675276L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case11() {
    int N = 11;
    int M = 2;
    int K = 6;
    assertEquals(2182300276L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case12() {
    int N = 11;
    int M = 2;
    int K = 8;
    assertEquals(737776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case13() {
    int N = 11;
    int M = 2;
    int K = 10;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case14() {
    int N = 11;
    int M = 2;
    int K = 11;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case15() {
    int N = 11;
    int M = 3;
    int K = 1;
    assertEquals(1091609135425276L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case16() {
    int N = 11;
    int M = 3;
    int K = 2;
    assertEquals(163264408862776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case17() {
    int N = 11;
    int M = 3;
    int K = 4;
    assertEquals(865971362776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case18() {
    int N = 11;
    int M = 3;
    int K = 8;
    assertEquals(152776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case19() {
    int N = 11;
    int M = 4;
    int K = 1;
    assertEquals(43213517317776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case20() {
    int N = 11;
    int M = 4;
    int K = 2;
    assertEquals(220200491576L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case21() {
    int N = 11;
    int M = 4;
    int K = 4;
    assertEquals(63029226L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case22() {
    int N = 11;
    int M = 5;
    int K = 0;
    assertEquals(3670344486987776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case23() {
    int N = 11;
    int M = 5;
    int K = 1;
    assertEquals(37839705612176L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case24() {
    int N = 11;
    int M = 5;
    int K = 2;
    assertEquals(165023937676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case25() {
    int N = 11;
    int M = 5;
    int K = 6;
    assertEquals(34476L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case26() {
    int N = 11;
    int M = 6;
    int K = 0;
    assertEquals(3670344486987776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case27() {
    int N = 11;
    int M = 6;
    int K = 1;
    assertEquals(1252786085226L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case28() {
    int N = 11;
    int M = 6;
    int K = 2;
    assertEquals(174437926L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case29() {
    int N = 11;
    int M = 6;
    int K = 3;
    assertEquals(1811576L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case30() {
    int N = 11;
    int M = 6;
    int K = 5;
    assertEquals(1326L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case31() {
    int N = 11;
    int M = 6;
    int K = 6;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case32() {
    int N = 11;
    int M = 6;
    int K = 7;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case33() {
    int N = 11;
    int M = 7;
    int K = 1;
    assertEquals(1044017932776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case34() {
    int N = 11;
    int M = 7;
    int K = 3;
    assertEquals(1352676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case35() {
    int N = 11;
    int M = 8;
    int K = 0;
    assertEquals(3670344486987776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case36() {
    int N = 11;
    int M = 8;
    int K = 9;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case37() {
    int N = 11;
    int M = 9;
    int K = 4;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case38() {
    int N = 11;
    int M = 9;
    int K = 2;
    assertEquals(51376L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case39() {
    int N = 11;
    int M = 9;
    int K = 1;
    assertEquals(24095378476L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case40() {
    int N = 11;
    int M = 10;
    int K = 0;
    assertEquals(3670344486987776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case41() {
    int N = 11;
    int M = 10;
    int K = 1;
    assertEquals(617831526L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case42() {
    int N = 11;
    int M = 10;
    int K = 2;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case43() {
    int N = 11;
    int M = 11;
    int K = 0;
    assertEquals(3670344486987776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case44() {
    int N = 11;
    int M = 11;
    int K = 1;
    assertEquals(308915776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case45() {
    int N = 11;
    int M = 11;
    int K = 11;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case46() {
    int N = 10;
    int M = 2;
    int K = 1;
    assertEquals(41984966747126L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case47() {
    int N = 10;
    int M = 2;
    int K = 2;
    assertEquals(6279400340876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case48() {
    int N = 10;
    int M = 2;
    int K = 3;
    assertEquals(566509715876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case49() {
    int N = 10;
    int M = 2;
    int K = 6;
    assertEquals(34715876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case50() {
    int N = 10;
    int M = 2;
    int K = 9;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case51() {
    int N = 10;
    int M = 3;
    int K = 0;
    assertEquals(141167095653376L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case52() {
    int N = 10;
    int M = 3;
    int K = 1;
    assertEquals(38017681590876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case53() {
    int N = 10;
    int M = 3;
    int K = 4;
    assertEquals(19087840876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case54() {
    int N = 10;
    int M = 3;
    int K = 6;
    assertEquals(11965876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case55() {
    int N = 10;
    int M = 3;
    int K = 7;
    assertEquals(135876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case56() {
    int N = 10;
    int M = 4;
    int K = 0;
    assertEquals(141167095653376L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case57() {
    int N = 10;
    int M = 4;
    int K = 1;
    assertEquals(1455373292776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case58() {
    int N = 10;
    int M = 4;
    int K = 2;
    assertEquals(6347074526L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case59() {
    int N = 10;
    int M = 4;
    int K = 5;
    assertEquals(52676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case60() {
    int N = 10;
    int M = 4;
    int K = 10;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case61() {
    int N = 10;
    int M = 5;
    int K = 1;
    assertEquals(1248382010876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case62() {
    int N = 10;
    int M = 5;
    int K = 2;
    assertEquals(4528457076L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case63() {
    int N = 10;
    int M = 5;
    int K = 3;
    assertEquals(50514776L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case64() {
    int N = 10;
    int M = 6;
    int K = 0;
    assertEquals(141167095653376L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case65() {
    int N = 10;
    int M = 6;
    int K = 1;
    assertEquals(40154535876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case66() {
    int N = 10;
    int M = 6;
    int K = 2;
    assertEquals(4461626L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case67() {
    int N = 10;
    int M = 6;
    int K = 3;
    assertEquals(52026L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case68() {
    int N = 10;
    int M = 7;
    int K = 3;
    assertEquals(34476L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case69() {
    int N = 10;
    int M = 8;
    int K = 1;
    assertEquals(926745326L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case70() {
    int N = 10;
    int M = 8;
    int K = 2;
    assertEquals(1976L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case71() {
    int N = 10;
    int M = 9;
    int K = 1;
    assertEquals(617830876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case72() {
    int N = 10;
    int M = 10;
    int K = 0;
    assertEquals(141167095653376L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case73() {
    int N = 10;
    int M = 10;
    int K = 1;
    assertEquals(11881376L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case74() {
    int N = 9;
    int M = 2;
    int K = 4;
    assertEquals(734147726L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case75() {
    int N = 9;
    int M = 2;
    int K = 5;
    assertEquals(23210226L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case76() {
    int N = 9;
    int M = 2;
    int K = 7;
    assertEquals(5226L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case77() {
    int N = 9;
    int M = 3;
    int K = 6;
    assertEquals(118976L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case78() {
    int N = 9;
    int M = 4;
    int K = 1;
    assertEquals(48014692726L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case79() {
    int N = 9;
    int M = 5;
    int K = 2;
    assertEquals(115934676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case80() {
    int N = 9;
    int M = 6;
    int K = 1;
    assertEquals(1235559026L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case81() {
    int N = 9;
    int M = 6;
    int K = 3;
    assertEquals(1326L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case82() {
    int N = 9;
    int M = 9;
    int K = 1;
    assertEquals(11881376L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case83() {
    int N = 9;
    int M = 9;
    int K = 2;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case84() {
    int N = 8;
    int M = 2;
    int K = 0;
    assertEquals(208827064576L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case85() {
    int N = 8;
    int M = 2;
    int K = 3;
    assertEquals(370033326L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case86() {
    int N = 8;
    int M = 2;
    int K = 4;
    assertEquals(14564576L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case87() {
    int N = 8;
    int M = 2;
    int K = 7;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case88() {
    int N = 8;
    int M = 3;
    int K = 1;
    assertEquals(43788002076L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case89() {
    int N = 8;
    int M = 3;
    int K = 3;
    assertEquals(217689576L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case90() {
    int N = 8;
    int M = 5;
    int K = 2;
    assertEquals(2670876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case91() {
    int N = 8;
    int M = 7;
    int K = 2;
    assertEquals(676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case92() {
    int N = 8;
    int M = 8;
    int K = 1;
    assertEquals(456976L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case93() {
    int N = 6;
    int M = 2;
    int K = 1;
    assertEquals(55009526L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case94() {
    int N = 6;
    int M = 2;
    int K = 4;
    assertEquals(3276L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case95() {
    int N = 6;
    int M = 2;
    int K = 5;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case96() {
    int N = 6;
    int M = 3;
    int K = 4;
    assertEquals(676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case97() {
    int N = 6;
    int M = 4;
    int K = 2;
    assertEquals(1976L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case98() {
    int N = 6;
    int M = 4;
    int K = 3;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case99() {
    int N = 6;
    int M = 6;
    int K = 1;
    assertEquals(17576L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case100() {
    int N = 7;
    int M = 2;
    int K = 0;
    assertEquals(8031810176L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case101() {
    int N = 7;
    int M = 2;
    int K = 1;
    assertEquals(1684153926L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case102() {
    int N = 7;
    int M = 2;
    int K = 4;
    assertEquals(247676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case103() {
    int N = 7;
    int M = 3;
    int K = 1;
    assertEquals(1430247676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case104() {
    int N = 7;
    int M = 4;
    int K = 1;
    assertEquals(47421426L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case105() {
    int N = 7;
    int M = 5;
    int K = 3;
    assertEquals(676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case106() {
    int N = 7;
    int M = 7;
    int K = 1;
    assertEquals(456976L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case107() {
    int N = 7;
    int M = 7;
    int K = 7;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case108() {
    int N = 5;
    int M = 2;
    int K = 0;
    assertEquals(11881376L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case109() {
    int N = 5;
    int M = 2;
    int K = 1;
    assertEquals(1725126L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case110() {
    int N = 5;
    int M = 2;
    int K = 4;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case111() {
    int N = 5;
    int M = 3;
    int K = 1;
    assertEquals(1318876L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case112() {
    int N = 5;
    int M = 3;
    int K = 2;
    assertEquals(51376L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case113() {
    int N = 5;
    int M = 3;
    int K = 3;
    assertEquals(676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case114() {
    int N = 5;
    int M = 4;
    int K = 1;
    assertEquals(35126L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case115() {
    int N = 5;
    int M = 4;
    int K = 2;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case116() {
    int N = 5;
    int M = 5;
    int K = 1;
    assertEquals(17576L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case117() {
    int N = 4;
    int M = 2;
    int K = 0;
    assertEquals(456976L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case118() {
    int N = 4;
    int M = 2;
    int K = 1;
    assertEquals(50726L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case119() {
    int N = 4;
    int M = 2;
    int K = 2;
    assertEquals(1976L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case120() {
    int N = 4;
    int M = 2;
    int K = 3;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case121() {
    int N = 4;
    int M = 3;
    int K = 0;
    assertEquals(456976L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case122() {
    int N = 4;
    int M = 3;
    int K = 1;
    assertEquals(34476L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case123() {
    int N = 4;
    int M = 3;
    int K = 2;
    assertEquals(676L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case124() {
    int N = 4;
    int M = 3;
    int K = 11;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case125() {
    int N = 3;
    int M = 2;
    int K = 0;
    assertEquals(17576L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case126() {
    int N = 3;
    int M = 2;
    int K = 2;
    assertEquals(26L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case127() {
    int N = 2;
    int M = 2;
    int K = 11;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case128() {
    int N = 2;
    int M = 2;
    int K = 10;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case129() {
    int N = 11;
    int M = 5;
    int K = 5;
    assertEquals(1369576L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case130() {
    int N = 11;
    int M = 4;
    int K = 7;
    assertEquals(1326L, palindromfulstring.count(N, M, K));
  }

  @Test
  public void case131() {
    int N = 11;
    int M = 8;
    int K = 5;
    assertEquals(0L, palindromfulstring.count(N, M, K));
  }

}
