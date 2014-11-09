package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class InterestingNumberTest {
  InterestingNumber interestingnumber = new InterestingNumber();

  @Test
  public void case1() {
    String x = "2002";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case2() {
    String x = "1001";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case3() {
    String x = "41312432";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case4() {
    String x = "611";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case5() {
    String x = "64200246";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case6() {
    String x = "631413164";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case7() {
    String x = "2002";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case8() {
    String x = "131003";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case9() {
    String x = "231213";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case10() {
    String x = "300131";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case11() {
    String x = "312132";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case12() {
    String x = "420024";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case13() {
    String x = "12132003";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case14() {
    String x = "14130043";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case15() {
    String x = "15120025";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case16() {
    String x = "23121300";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case17() {
    String x = "23421314";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case18() {
    String x = "25121005";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case19() {
    String x = "25320035";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case20() {
    String x = "30023121";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case21() {
    String x = "31213200";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case22() {
    String x = "31413004";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case23() {
    String x = "34003141";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case24() {
    String x = "40031413";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case25() {
    String x = "41312432";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case26() {
    String x = "45001415";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case27() {
    String x = "45121425";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case28() {
    String x = "45300435";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case29() {
    String x = "50012152";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case30() {
    String x = "51410054";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case31() {
    String x = "52002151";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case32() {
    String x = "52412154";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case33() {
    String x = "53002352";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case34() {
    String x = "53400354";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case35() {
    String x = "61310036";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case36() {
    String x = "62312136";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case37() {
    String x = "63001316";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case38() {
    String x = "63121326";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case39() {
    String x = "64200246";
    assertEquals("Interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case40() {
    String x = "24754";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case41() {
    String x = "719";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case42() {
    String x = "5270508";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case43() {
    String x = "54";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case44() {
    String x = "502";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case45() {
    String x = "300549";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case46() {
    String x = "90001";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case47() {
    String x = "36";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case48() {
    String x = "547465";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case49() {
    String x = "6";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case50() {
    String x = "9604";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case51() {
    String x = "511584";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case52() {
    String x = "14";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case53() {
    String x = "776039105";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case54() {
    String x = "3";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case55() {
    String x = "3";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case56() {
    String x = "601005465";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case57() {
    String x = "7757071";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case58() {
    String x = "4";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case59() {
    String x = "949570";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case60() {
    String x = "5691";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case61() {
    String x = "6469";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case62() {
    String x = "9404240";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case63() {
    String x = "2658034";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case64() {
    String x = "9719170";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case65() {
    String x = "624";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case66() {
    String x = "116963953";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case67() {
    String x = "41";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case68() {
    String x = "18";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case69() {
    String x = "497050";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case70() {
    String x = "2";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case71() {
    String x = "485432143";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case72() {
    String x = "473049189";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case73() {
    String x = "3";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case74() {
    String x = "70721540";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case75() {
    String x = "87880";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case76() {
    String x = "3104643";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case77() {
    String x = "71718";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case78() {
    String x = "339767411";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case79() {
    String x = "241167520";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case80() {
    String x = "46";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case81() {
    String x = "14";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case82() {
    String x = "58687032";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case83() {
    String x = "8";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case84() {
    String x = "676883";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case85() {
    String x = "608";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case86() {
    String x = "54";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case87() {
    String x = "3";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case88() {
    String x = "8014";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case89() {
    String x = "798";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case90() {
    String x = "101";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case91() {
    String x = "20022002";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case92() {
    String x = "1111";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case93() {
    String x = "1";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case94() {
    String x = "200200";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case95() {
    String x = "100";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case96() {
    String x = "3456";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case97() {
    String x = "2002000";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case98() {
    String x = "20021";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case99() {
    String x = "121121";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case100() {
    String x = "999999999";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case101() {
    String x = "10100";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case102() {
    String x = "101101";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case103() {
    String x = "111";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case104() {
    String x = "1010";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case105() {
    String x = "401014";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case106() {
    String x = "32002";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case107() {
    String x = "400004";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case108() {
    String x = "10100000";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case109() {
    String x = "222222";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case110() {
    String x = "5315135";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case111() {
    String x = "20025";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case112() {
    String x = "121";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case113() {
    String x = "30003";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case114() {
    String x = "131";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case115() {
    String x = "111111";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case116() {
    String x = "1010101";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case117() {
    String x = "465465";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case118() {
    String x = "62002";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case119() {
    String x = "2222";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case120() {
    String x = "10";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case121() {
    String x = "33";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case122() {
    String x = "444444";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case123() {
    String x = "20020000";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case124() {
    String x = "11";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case125() {
    String x = "3210";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case126() {
    String x = "123456789";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

  @Test
  public void case127() {
    String x = "60000006";
    assertEquals("Not interesting", interestingnumber.isInteresting(x));
  }

}
