package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class NumberChangerTest {
  NumberChanger numberchanger = new NumberChanger();

  @Test
  public void case1() {
    String start = "01234567";
    String finish = "01234567";
    assertEquals(0, numberchanger.transform(start, finish));
  }

  @Test
  public void case2() {
    String start = "11119999";
    String finish = "99991111";
    assertEquals(4, numberchanger.transform(start, finish));
  }

  @Test
  public void case3() {
    String start = "55555555";
    String finish = "12345678";
    assertEquals(16, numberchanger.transform(start, finish));
  }

  @Test
  public void case4() {
    String start = "77771111";
    String finish = "00446688";
    assertEquals(16, numberchanger.transform(start, finish));
  }

  @Test
  public void case5() {
    String start = "00000000";
    String finish = "99999999";
    assertEquals(72, numberchanger.transform(start, finish));
  }

  @Test
  public void case6() {
    String start = "99999999";
    String finish = "00000000";
    assertEquals(72, numberchanger.transform(start, finish));
  }

  @Test
  public void case7() {
    String start = "87654321";
    String finish = "12346578";
    assertEquals(5, numberchanger.transform(start, finish));
  }

  @Test
  public void case8() {
    String start = "12";
    String finish = "30";
    assertEquals(3, numberchanger.transform(start, finish));
  }

  @Test
  public void case9() {
    String start = "059";
    String finish = "905";
    assertEquals(2, numberchanger.transform(start, finish));
  }

  @Test
  public void case10() {
    String start = "02468";
    String finish = "24680";
    assertEquals(4, numberchanger.transform(start, finish));
  }

  @Test
  public void case11() {
    String start = "0123";
    String finish = "3012";
    assertEquals(3, numberchanger.transform(start, finish));
  }

  @Test
  public void case12() {
    String start = "01234567";
    String finish = "73620415";
    assertEquals(6, numberchanger.transform(start, finish));
  }

  @Test
  public void case13() {
    String start = "456";
    String finish = "321";
    assertEquals(9, numberchanger.transform(start, finish));
  }

  @Test
  public void case14() {
    String start = "89947230";
    String finish = "87096236";
    assertEquals(7, numberchanger.transform(start, finish));
  }

  @Test
  public void case15() {
    String start = "38367511";
    String finish = "43302266";
    assertEquals(13, numberchanger.transform(start, finish));
  }

  @Test
  public void case16() {
    String start = "72436509";
    String finish = "84935180";
    assertEquals(9, numberchanger.transform(start, finish));
  }

  @Test
  public void case17() {
    String start = "56082355";
    String finish = "53492531";
    assertEquals(8, numberchanger.transform(start, finish));
  }

  @Test
  public void case18() {
    String start = "63862421";
    String finish = "53745891";
    assertEquals(13, numberchanger.transform(start, finish));
  }

  @Test
  public void case19() {
    String start = "19104918";
    String finish = "92147889";
    assertEquals(17, numberchanger.transform(start, finish));
  }

  @Test
  public void case20() {
    String start = "68200189";
    String finish = "55827715";
    assertEquals(17, numberchanger.transform(start, finish));
  }

  @Test
  public void case21() {
    String start = "72565307";
    String finish = "61920113";
    assertEquals(18, numberchanger.transform(start, finish));
  }

  @Test
  public void case22() {
    String start = "55380499";
    String finish = "88567672";
    assertEquals(15, numberchanger.transform(start, finish));
  }

  @Test
  public void case23() {
    String start = "04811197";
    String finish = "54818197";
    assertEquals(12, numberchanger.transform(start, finish));
  }

  @Test
  public void case24() {
    String start = "94345748";
    String finish = "58802170";
    assertEquals(17, numberchanger.transform(start, finish));
  }

  @Test
  public void case25() {
    String start = "79058423";
    String finish = "79184149";
    assertEquals(9, numberchanger.transform(start, finish));
  }

  @Test
  public void case26() {
    String start = "16615570";
    String finish = "99467717";
    assertEquals(21, numberchanger.transform(start, finish));
  }

  @Test
  public void case27() {
    String start = "19905744";
    String finish = "83480384";
    assertEquals(11, numberchanger.transform(start, finish));
  }

  @Test
  public void case28() {
    String start = "75164993";
    String finish = "42885974";
    assertEquals(9, numberchanger.transform(start, finish));
  }

  @Test
  public void case29() {
    String start = "04806600";
    String finish = "99819265";
    assertEquals(26, numberchanger.transform(start, finish));
  }

  @Test
  public void case30() {
    String start = "36117291";
    String finish = "33665567";
    assertEquals(19, numberchanger.transform(start, finish));
  }

  @Test
  public void case31() {
    String start = "80038643";
    String finish = "56000957";
    assertEquals(11, numberchanger.transform(start, finish));
  }

  @Test
  public void case32() {
    String start = "60433723";
    String finish = "82823237";
    assertEquals(11, numberchanger.transform(start, finish));
  }

  @Test
  public void case33() {
    String start = "90071967";
    String finish = "51488914";
    assertEquals(13, numberchanger.transform(start, finish));
  }

  @Test
  public void case34() {
    String start = "04707073";
    String finish = "48079239";
    assertEquals(16, numberchanger.transform(start, finish));
  }

  @Test
  public void case35() {
    String start = "64644364";
    String finish = "74998750";
    assertEquals(20, numberchanger.transform(start, finish));
  }

  @Test
  public void case36() {
    String start = "07977642";
    String finish = "64316104";
    assertEquals(20, numberchanger.transform(start, finish));
  }

  @Test
  public void case37() {
    String start = "61858881";
    String finish = "21793066";
    assertEquals(15, numberchanger.transform(start, finish));
  }

  @Test
  public void case38() {
    String start = "01922912";
    String finish = "57435313";
    assertEquals(19, numberchanger.transform(start, finish));
  }

  @Test
  public void case39() {
    String start = "40075941";
    String finish = "11456311";
    assertEquals(14, numberchanger.transform(start, finish));
  }

  @Test
  public void case40() {
    String start = "92672676";
    String finish = "06243660";
    assertEquals(20, numberchanger.transform(start, finish));
  }

  @Test
  public void case41() {
    String start = "93698429";
    String finish = "02397095";
    assertEquals(16, numberchanger.transform(start, finish));
  }

  @Test
  public void case42() {
    String start = "99637368";
    String finish = "56395540";
    assertEquals(17, numberchanger.transform(start, finish));
  }

  @Test
  public void case43() {
    String start = "53138606";
    String finish = "69919709";
    assertEquals(19, numberchanger.transform(start, finish));
  }

  @Test
  public void case44() {
    String start = "25193673";
    String finish = "77562755";
    assertEquals(15, numberchanger.transform(start, finish));
  }

  @Test
  public void case45() {
    String start = "72300580";
    String finish = "88900386";
    assertEquals(18, numberchanger.transform(start, finish));
  }

  @Test
  public void case46() {
    String start = "46462363";
    String finish = "30951919";
    assertEquals(20, numberchanger.transform(start, finish));
  }

  @Test
  public void case47() {
    String start = "73505416";
    String finish = "69417260";
    assertEquals(11, numberchanger.transform(start, finish));
  }

  @Test
  public void case48() {
    String start = "95443496";
    String finish = "84260951";
    assertEquals(12, numberchanger.transform(start, finish));
  }

  @Test
  public void case49() {
    String start = "02550759";
    String finish = "65828885";
    assertEquals(21, numberchanger.transform(start, finish));
  }

  @Test
  public void case50() {
    String start = "65653794";
    String finish = "38976439";
    assertEquals(11, numberchanger.transform(start, finish));
  }

  @Test
  public void case51() {
    String start = "18471993";
    String finish = "68943633";
    assertEquals(11, numberchanger.transform(start, finish));
  }

  @Test
  public void case52() {
    String start = "79579169";
    String finish = "98312082";
    assertEquals(22, numberchanger.transform(start, finish));
  }

  @Test
  public void case53() {
    String start = "78947846";
    String finish = "48344568";
    assertEquals(13, numberchanger.transform(start, finish));
  }

  @Test
  public void case54() {
    String start = "28379253";
    String finish = "42400673";
    assertEquals(17, numberchanger.transform(start, finish));
  }

  @Test
  public void case55() {
    String start = "84494505";
    String finish = "39927509";
    assertEquals(13, numberchanger.transform(start, finish));
  }

  @Test
  public void case56() {
    String start = "26949759";
    String finish = "67937675";
    assertEquals(10, numberchanger.transform(start, finish));
  }

  @Test
  public void case57() {
    String start = "68368517";
    String finish = "92976017";
    assertEquals(11, numberchanger.transform(start, finish));
  }

  @Test
  public void case58() {
    String start = "53532720";
    String finish = "84967987";
    assertEquals(31, numberchanger.transform(start, finish));
  }

  @Test
  public void case59() {
    String start = "39382638";
    String finish = "33686363";
    assertEquals(9, numberchanger.transform(start, finish));
  }

  @Test
  public void case60() {
    String start = "76891254";
    String finish = "81603790";
    assertEquals(13, numberchanger.transform(start, finish));
  }

  @Test
  public void case61() {
    String start = "54031328";
    String finish = "64266736";
    assertEquals(17, numberchanger.transform(start, finish));
  }

  @Test
  public void case62() {
    String start = "22207354";
    String finish = "38101073";
    assertEquals(10, numberchanger.transform(start, finish));
  }

  @Test
  public void case63() {
    String start = "73435097";
    String finish = "39711228";
    assertEquals(12, numberchanger.transform(start, finish));
  }

  @Test
  public void case64() {
    String start = "77771111";
    String finish = "00446688";
    assertEquals(16, numberchanger.transform(start, finish));
  }

  @Test
  public void case65() {
    String start = "12";
    String finish = "30";
    assertEquals(3, numberchanger.transform(start, finish));
  }

  @Test
  public void case66() {
    String start = "059";
    String finish = "905";
    assertEquals(2, numberchanger.transform(start, finish));
  }

  @Test
  public void case67() {
    String start = "09532547";
    String finish = "18815089";
    assertEquals(14, numberchanger.transform(start, finish));
  }

  @Test
  public void case68() {
    String start = "90617283";
    String finish = "06172839";
    assertEquals(7, numberchanger.transform(start, finish));
  }

  @Test
  public void case69() {
    String start = "01236789";
    String finish = "12307890";
    assertEquals(12, numberchanger.transform(start, finish));
  }

  @Test
  public void case70() {
    String start = "1234";
    String finish = "8756";
    assertEquals(16, numberchanger.transform(start, finish));
  }

  @Test
  public void case71() {
    String start = "174";
    String finish = "611";
    assertEquals(5, numberchanger.transform(start, finish));
  }

  @Test
  public void case72() {
    String start = "12345";
    String finish = "51234";
    assertEquals(4, numberchanger.transform(start, finish));
  }

  @Test
  public void case73() {
    String start = "12344321";
    String finish = "09873456";
    assertEquals(25, numberchanger.transform(start, finish));
  }

  @Test
  public void case74() {
    String start = "059";
    String finish = "590";
    assertEquals(2, numberchanger.transform(start, finish));
  }

  @Test
  public void case75() {
    String start = "951";
    String finish = "519";
    assertEquals(2, numberchanger.transform(start, finish));
  }

  @Test
  public void case76() {
    String start = "45";
    String finish = "65";
    assertEquals(2, numberchanger.transform(start, finish));
  }

  @Test
  public void case77() {
    String start = "123456";
    String finish = "234561";
    assertEquals(5, numberchanger.transform(start, finish));
  }

  @Test
  public void case78() {
    String start = "12345678";
    String finish = "87345621";
    assertEquals(2, numberchanger.transform(start, finish));
  }

  @Test
  public void case79() {
    String start = "495768";
    String finish = "759486";
    assertEquals(3, numberchanger.transform(start, finish));
  }

  @Test
  public void case80() {
    String start = "900";
    String finish = "009";
    assertEquals(1, numberchanger.transform(start, finish));
  }

  @Test
  public void case81() {
    String start = "15913579";
    String finish = "91691352";
    assertEquals(9, numberchanger.transform(start, finish));
  }

  @Test
  public void case82() {
    String start = "77771111";
    String finish = "00446688";
    assertEquals(16, numberchanger.transform(start, finish));
  }

  @Test
  public void case83() {
    String start = "12";
    String finish = "30";
    assertEquals(3, numberchanger.transform(start, finish));
  }

  @Test
  public void case84() {
    String start = "059";
    String finish = "905";
    assertEquals(2, numberchanger.transform(start, finish));
  }

  @Test
  public void case85() {
    String start = "09532547";
    String finish = "18815089";
    assertEquals(14, numberchanger.transform(start, finish));
  }

  @Test
  public void case86() {
    String start = "90617283";
    String finish = "06172839";
    assertEquals(7, numberchanger.transform(start, finish));
  }

  @Test
  public void case87() {
    String start = "01236789";
    String finish = "12307890";
    assertEquals(12, numberchanger.transform(start, finish));
  }

  @Test
  public void case88() {
    String start = "1234";
    String finish = "8756";
    assertEquals(16, numberchanger.transform(start, finish));
  }

  @Test
  public void case89() {
    String start = "174";
    String finish = "611";
    assertEquals(5, numberchanger.transform(start, finish));
  }

  @Test
  public void case90() {
    String start = "12345";
    String finish = "51234";
    assertEquals(4, numberchanger.transform(start, finish));
  }

  @Test
  public void case91() {
    String start = "12344321";
    String finish = "09873456";
    assertEquals(25, numberchanger.transform(start, finish));
  }

  @Test
  public void case92() {
    String start = "059";
    String finish = "590";
    assertEquals(2, numberchanger.transform(start, finish));
  }

  @Test
  public void case93() {
    String start = "951";
    String finish = "519";
    assertEquals(2, numberchanger.transform(start, finish));
  }

  @Test
  public void case94() {
    String start = "45";
    String finish = "65";
    assertEquals(2, numberchanger.transform(start, finish));
  }

  @Test
  public void case95() {
    String start = "123456";
    String finish = "234561";
    assertEquals(5, numberchanger.transform(start, finish));
  }

  @Test
  public void case96() {
    String start = "12345678";
    String finish = "87345621";
    assertEquals(2, numberchanger.transform(start, finish));
  }

  @Test
  public void case97() {
    String start = "495768";
    String finish = "759486";
    assertEquals(3, numberchanger.transform(start, finish));
  }

  @Test
  public void case98() {
    String start = "900";
    String finish = "009";
    assertEquals(1, numberchanger.transform(start, finish));
  }

  @Test
  public void case99() {
    String start = "15913579";
    String finish = "91691352";
    assertEquals(9, numberchanger.transform(start, finish));
  }

}
