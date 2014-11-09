package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class YahtzeeBestScoreTest {
  YahtzeeBestScore yahtzeebestscore = new YahtzeeBestScore();

  @Test
  public void case1() {
    String[] hands = { "66666", "66666", "66655", "12345", "12345", "66666", "66666" };
    assertEquals(235, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case2() {
    String[] hands = { "12345", "12345", "12345", "12345", "12345", "12345", "12345" };
    assertEquals(85, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case3() {
    String[] hands = { "12121", "12344", "42365", "22222", "66666", "66666", "66666" };
    assertEquals(235, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case4() {
    String[] hands = { "11111", "22222", "33333", "44444", "55555", "66666", "12345" };
    assertEquals(190, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case5() {
    String[] hands = { "13144", "32342", "66554", "12321", "65456", "45654", "33445" };
    assertEquals(26, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case6() {
    String[] hands = { "66666", "55666", "54321", "65431", "11223", "22334", "33445" };
    assertEquals(167, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case7() {
    String[] hands = { "11122", "22233", "33344", "44455", "55566", "66611", "66666" };
    assertEquals(124, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case8() {
    String[] hands = { "52141", "32142", "41114", "53444", "25222", "52433", "42441" };
    assertEquals(105, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case9() {
    String[] hands = { "11223", "11223", "11223", "11223", "11223", "11223", "11223" };
    assertEquals(9, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case10() {
    String[] hands = { "11111", "11111", "11111", "11111", "11111", "11111", "11111" };
    assertEquals(90, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case11() {
    String[] hands = { "22222", "22222", "22222", "22222", "22222", "22222", "22222" };
    assertEquals(105, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case12() {
    String[] hands = { "12344", "32234", "22333", "56565", "12345", "22222", "11111" };
    assertEquals(196, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case13() {
    String[] hands = { "11115", "12345", "12345", "33365", "12345", "55555", "66666" };
    assertEquals(189, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case14() {
    String[] hands = { "55222", "46322", "11334", "36332", "32343", "12122", "33224" };
    assertEquals(59, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case15() {
    String[] hands = { "11112", "22223", "33334", "44445", "55556", "66661", "11111" };
    assertEquals(122, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case16() {
    String[] hands = { "11111", "12345", "12345", "33333", "11112", "11223", "22334" };
    assertEquals(165, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case17() {
    String[] hands = { "62334", "43221", "54321", "33222", "33344", "11111", "11111" };
    assertEquals(185, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case18() {
    String[] hands = { "11122", "22233", "33344", "44455", "55566", "66611", "11122" };
    assertEquals(74, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case19() {
    String[] hands = { "13344", "22343", "22322", "13222", "11111", "12122", "65432" };
    assertEquals(151, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case20() {
    String[] hands = { "32533", "44421", "64366", "32111", "22234", "56455", "66615" };
    assertEquals(50, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case21() {
    String[] hands = { "11111", "11111", "11111", "11111", "11111", "11111", "11111" };
    assertEquals(90, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case22() {
    String[] hands = { "11111", "11111", "11111", "11111", "12345", "12345", "22222" };
    assertEquals(165, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case23() {
    String[] hands = { "32114", "32211", "23422", "44322", "11456", "65533", "54554" };
    assertEquals(90, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case24() {
    String[] hands = { "45666", "23444", "24212", "12344", "43533", "22234", "32246" };
    assertEquals(75, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case25() {
    String[] hands = { "53535", "12121", "64646", "25252", "53535", "21212", "34343" };
    assertEquals(72, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case26() {
    String[] hands = { "66266", "44544", "11112", "33363", "22221", "55515", "64666" };
    assertEquals(75, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case27() {
    String[] hands = { "66661", "66662", "66663", "66664", "66665", "66666", "66666" };
    assertEquals(159, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case28() {
    String[] hands = { "66611", "66622", "66633", "66644", "66655", "66666", "66666" };
    assertEquals(159, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case29() {
    String[] hands = { "23456", "12345", "23456", "12345", "12345", "12345", "12345" };
    assertEquals(90, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case30() {
    String[] hands = { "54422", "23344", "66554", "33445", "11223", "33661", "23234" };
    assertEquals(26, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case31() {
    String[] hands = { "55544", "33361", "12354", "66666", "12344", "55555", "44444" };
    assertEquals(216, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case32() {
    String[] hands = { "41456", "16246", "45241", "26215", "34141", "45316", "32431" };
    assertEquals(50, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case33() {
    String[] hands = { "62623", "53646", "56316", "24325", "15533", "51435", "46615" };
    assertEquals(54, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case34() {
    String[] hands = { "42121", "43562", "61222", "12141", "61133", "54152", "14663" };
    assertEquals(73, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case35() {
    String[] hands = { "15641", "54665", "55511", "62466", "44215", "26651", "32444" };
    assertEquals(75, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case36() {
    String[] hands = { "55512", "33133", "24224", "64215", "36465", "33224", "62231" };
    assertEquals(104, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case37() {
    String[] hands = { "36635", "65145", "21622", "21232", "44314", "23432", "14142" };
    assertEquals(39, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case38() {
    String[] hands = { "42553", "13521", "52522", "36653", "16221", "24363", "52446" };
    assertEquals(78, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case39() {
    String[] hands = { "55221", "13112", "26646", "26336", "41141", "31564", "21534" };
    assertEquals(139, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case40() {
    String[] hands = { "31426", "46432", "11541", "46126", "46635", "43643", "31156" };
    assertEquals(66, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case41() {
    String[] hands = { "43653", "53256", "35123", "54341", "33332", "32216", "15244" };
    assertEquals(65, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case42() {
    String[] hands = { "35643", "14215", "44346", "15544", "26223", "12661", "15311" };
    assertEquals(70, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case43() {
    String[] hands = { "26466", "24512", "43614", "51246", "43163", "63426", "51332" };
    assertEquals(45, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case44() {
    String[] hands = { "41235", "51622", "46542", "23511", "53131", "12344", "63614" };
    assertEquals(91, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case45() {
    String[] hands = { "41145", "23563", "45115", "63355", "46444", "31141", "51151" };
    assertEquals(79, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case46() {
    String[] hands = { "16461", "56411", "32332", "43624", "61442", "21455", "31312" };
    assertEquals(44, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case47() {
    String[] hands = { "31526", "12644", "15535", "51421", "52514", "45343", "22414" };
    assertEquals(38, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case48() {
    String[] hands = { "44532", "64452", "43442", "53221", "65623", "61215", "54153" };
    assertEquals(69, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case49() {
    String[] hands = { "36315", "42515", "24555", "45664", "23214", "66243", "31643" };
    assertEquals(76, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case50() {
    String[] hands = { "54431", "64523", "53611", "21323", "56115", "32132", "63316" };
    assertEquals(59, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case51() {
    String[] hands = { "11223", "11223", "11223", "11223", "11223", "11111", "11111" };
    assertEquals(84, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case52() {
    String[] hands = { "11111", "11111", "11111", "11111", "11111", "11111", "11111" };
    assertEquals(90, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case53() {
    String[] hands = { "66666", "66666", "66655", "54321", "54321", "66666", "66666" };
    assertEquals(235, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case54() {
    String[] hands = { "66666", "11111", "66655", "12345", "12345", "11111", "11111" };
    assertEquals(208, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case55() {
    String[] hands = { "66666", "66666", "66666", "66666", "66666", "66666", "66666" };
    assertEquals(165, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case56() {
    String[] hands = { "11123", "11123", "11123", "11123", "11123", "11123", "11123" };
    assertEquals(16, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case57() {
    String[] hands = { "11112", "11112", "11112", "11112", "11112", "11112", "11112" };
    assertEquals(18, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case58() {
    String[] hands = { "12234", "12234", "12234", "12234", "12234", "12234", "12234" };
    assertEquals(42, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case59() {
    String[] hands = { "66666", "66666", "66655", "12345", "12345", "66666", "66666" };
    assertEquals(235, yahtzeebestscore.bestLowerScore(hands));
  }

  @Test
  public void case60() {
    String[] hands = { "66644", "12346", "12346", "12346", "12346", "12346", "12346" };
    assertEquals(72, yahtzeebestscore.bestLowerScore(hands));
  }

}
