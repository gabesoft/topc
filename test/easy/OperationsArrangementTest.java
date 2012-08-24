package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class OperationsArrangementTest {
  OperationsArrangement operationsarrangement = new OperationsArrangement();

  @Test
  public void case1() {
    String sequence = "222";
    assertEquals("2*2+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case2() {
    String sequence = "322";
    assertEquals("3+2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case3() {
    String sequence = "307";
    assertEquals("3*0*7", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case4() {
    String sequence = "391118571";
    assertEquals("3+9*1*1*1+8+5+7*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case5() {
    String sequence = "111221911212";
    assertEquals("1*1*1*2*2*1+9*1*1+2*1*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case6() {
    String sequence = "00000000000000000000000000000000000000000000000000";
    assertEquals("0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case7() {
    String sequence = "99999999999999999999999999999999999999999999999999";
    assertEquals("9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case8() {
    String sequence = "99999999999999999999999999999999999999999999999990";
    assertEquals("9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*0", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case9() {
    String sequence = "09999999999999999999999999999999999999999999999999";
    assertEquals("0*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case10() {
    String sequence = "99999999999999999999999999999999999999999999999991";
    assertEquals("9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case11() {
    String sequence = "19999999999999999999999999999999999999999999999999";
    assertEquals("1*9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case12() {
    String sequence = "11111111111111111111111111111111111111111111111111";
    assertEquals("1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case13() {
    String sequence = "11111111111111111111111111111111111111111111111119";
    assertEquals("1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case14() {
    String sequence = "91111111111111111111111111111111111111111111111111";
    assertEquals("9*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case15() {
    String sequence = "11111111111111111111112221111111111111111111111111";
    assertEquals("1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*2*2+2*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case16() {
    String sequence = "11111211111111111111111211111111121111111111111111";
    assertEquals("1*1*1*1*1*2*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*2*1*1*1*1*1*1*1*1*1+2*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case17() {
    String sequence = "22222222222222222222222222222222222222222222222222";
    assertEquals("2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case18() {
    String sequence = "22222222222222222222222222222222222222222222222211";
    assertEquals("2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case19() {
    String sequence = "11222222222222222222222222222222222222222222222222";
    assertEquals("1*1*2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case20() {
    String sequence = "12121212121212121212121212121212121212121212121212";
    assertEquals("1*2*1*2*1+2*1*2*1+2*1*2*1+2*1*2*1+2*1*2*1+2*1*2*1+2*1*2*1+2*1*2*1+2*1*2*1+2*1*2*1+2*1*2*1+2*1*2*1+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case21() {
    String sequence = "80";
    assertEquals("8*0", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case22() {
    String sequence = "283";
    assertEquals("2+8+3", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case23() {
    String sequence = "248";
    assertEquals("2+4+8", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case24() {
    String sequence = "2184121342";
    assertEquals("2*1+8+4*1+2*1+3+4+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case25() {
    String sequence = "18132641";
    assertEquals("1*8*1+3+2+6+4*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case26() {
    String sequence = "2101221";
    assertEquals("2*1*0*1*2*2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case27() {
    String sequence = "4774";
    assertEquals("4+7+7+4", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case28() {
    String sequence = "7266071";
    assertEquals("7*2*6*6*0*7*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case29() {
    String sequence = "226";
    assertEquals("2*2+6", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case30() {
    String sequence = "6646";
    assertEquals("6+6+4+6", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case31() {
    String sequence = "9221212122116122218481225122271119121224211";
    assertEquals("9+2*2*1+2*1*2*1+2*2*1*1+6*1+2*2+2*1+8+4+8*1+2*2+5*1+2*2+2+7*1*1*1+9*1+2*1*2+2+4+2*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case32() {
    String sequence = "51931211210111";
    assertEquals("5*1*9*3*1*2*1*1*2*1*0*1*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case33() {
    String sequence = "121813";
    assertEquals("1*2*1+8*1+3", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case34() {
    String sequence = "122514122121412102221411212910221";
    assertEquals("1*2*2*5*1*4*1*2*2*1*2*1*4*1*2*1*0*2*2*2*1*4*1*1*2*1*2*9*1*0*2*2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case35() {
    String sequence = "11112110111281212013115141";
    assertEquals("1*1*1*1*2*1*1*0*1*1*1*2*8*1*2*1*2*0*1*3*1*1*5*1*4*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case36() {
    String sequence = "212161211222612122111221";
    assertEquals("2*1*2*1+6*1+2*1*1*2+2*2+6*1+2*1*2+2*1*1*1*2+2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case37() {
    String sequence = "234111711116121211111125011611811427425121";
    assertEquals("2*3*4*1*1*1*7*1*1*1*1*6*1*2*1*2*1*1*1*1*1*1*2*5*0*1*1*6*1*1*8*1*1*4*2*7*4*2*5*1*2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case38() {
    String sequence = "11269112213122161111210121221126211211128";
    assertEquals("1*1*2*6*9*1*1*2*2*1*3*1*2*2*1*6*1*1*1*1*2*1*0*1*2*1*2*2*1*1*2*6*2*1*1*2*1*1*1*2*8", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case39() {
    String sequence = "825";
    assertEquals("8+2+5", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case40() {
    String sequence = "642";
    assertEquals("6+4+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case41() {
    String sequence = "1292";
    assertEquals("1*2+9+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case42() {
    String sequence = "122";
    assertEquals("1*2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case43() {
    String sequence = "124113442129223221121811722";
    assertEquals("1*2+4*1*1+3+4+4+2*1*2+9+2*2+3+2*2*1*1+2*1+8*1*1+7+2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case44() {
    String sequence = "211111111121121241112381611111614811122967112811";
    assertEquals("2*1*1*1*1*1*1*1*1*1*2*1*1+2*1*2+4*1*1*1+2+3+8*1+6*1*1*1*1*1+6*1+4+8*1*1*1+2*2+9+6+7*1*1+2+8*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case45() {
    String sequence = "2625611134111172";
    assertEquals("2+6+2+5+6*1*1*1+3+4*1*1*1*1+7+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case46() {
    String sequence = "2122112211281112";
    assertEquals("2*1*2+2*1*1*2+2*1*1*2+8*1*1*1+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case47() {
    String sequence = "115221112119";
    assertEquals("1*1*5+2*2*1*1*1+2*1*1+9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case48() {
    String sequence = "11111111172222221";
    assertEquals("1*1*1*1*1*1*1*1*1*7+2*2+2*2+2*2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case49() {
    String sequence = "215111111112311221232127";
    assertEquals("2*1+5*1*1*1*1*1*1*1*1+2+3*1*1+2*2*1+2+3+2*1*2+7", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case50() {
    String sequence = "34891168";
    assertEquals("3+4+8+9*1*1+6+8", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case51() {
    String sequence = "223111172241252115422223142118112239221112";
    assertEquals("2*2+3*1*1*1*1+7+2*2+4*1+2+5+2*1*1+5+4+2*2+2*2+3*1+4+2*1*1+8*1*1+2*2+3+9+2*2*1*1*1+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case52() {
    String sequence = "2852222121421421882912142183121222122211121122";
    assertEquals("2+8+5+2*2+2*2*1+2*1+4+2*1+4+2*1+8+8+2+9*1+2*1+4+2*1+8+3*1+2*1*2+2*2*1+2*2+2*1*1*1*2*1*1+2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case53() {
    String sequence = "122122921267";
    assertEquals("1*2*2*1+2*2+9+2*1*2+6+7", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case54() {
    String sequence = "221111511";
    assertEquals("2*2*1*1*1*1+5*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case55() {
    String sequence = "1771221212221222221221121";
    assertEquals("1*7+7*1+2*2*1+2*1*2+2*2*1+2*2+2*2+2*1*2+2*1*1*2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case56() {
    String sequence = "71225318121612";
    assertEquals("7*1+2*2+5+3*1+8*1+2*1+6*1+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case57() {
    String sequence = "72215211157215242112172218";
    assertEquals("7+2*2*1+5+2*1*1*1+5+7+2*1+5+2+4+2*1*1*2*1+7+2*2*1+8", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case58() {
    String sequence = "11191212211121112121199281223221912";
    assertEquals("1*1*1*9*1+2*1*2+2*1*1*1*2*1*1*1+2*1*2*1*1+9+9+2+8*1+2*2+3+2*2*1+9*1+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case59() {
    String sequence = "111172112182117311219";
    assertEquals("1*1*1*1*7+2*1*1*2*1+8+2*1*1+7+3*1*1+2*1+9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case60() {
    String sequence = "123222211111126111112129825336222811212121";
    assertEquals("1*2+3+2*2+2*2*1*1*1*1*1*1+2+6*1*1*1*1*1+2*1*2+9+8+2+5+3+3+6+2*2+2+8*1*1+2*1*2*1+2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case61() {
    String sequence = "12211222";
    assertEquals("1*2*2*1*1+2*2+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case62() {
    String sequence = "212222122211122111222112822";
    assertEquals("2*1*2+2*2+2*1*2+2*2*1*1*1+2*2*1*1*1+2*2+2*1*1*2+8+2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case63() {
    String sequence = "619121121511121311211111115182222121112211";
    assertEquals("6*1+9*1+2*1*1*2*1+5*1*1*1+2*1+3*1*1+2*1*1*1*1*1*1*1+5*1+8+2*2+2*2*1+2*1*1*1*2+2*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case64() {
    String sequence = "221";
    assertEquals("2*2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case65() {
    String sequence = "21115121227152111111122851216222411";
    assertEquals("2*1*1*1+5*1+2*1*2+2+7*1+5+2*1*1*1*1*1*1*1*2+2+8+5*1+2*1+6+2*2+2+4*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case66() {
    String sequence = "111117222423221112121112111276221287";
    assertEquals("1*1*1*1*1*7+2*2+2+4+2+3+2*2*1*1*1+2*1*2*1*1*1+2*1*1*1*2+7+6+2*2*1+2+8+7", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case67() {
    String sequence = "212251422412111721182621111122121119211211612";
    assertEquals("2*1*2+2+5*1+4+2*2+4*1+2*1*1*1+7+2*1*1+8+2+6+2*1*1*1*1*1*2+2*1*2*1*1*1+9+2*1*1*2*1*1+6*1+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case68() {
    String sequence = "12122227191231131112211172211171128363212281422182";
    assertEquals("1*2*1*2+2*2+2+7*1+9*1+2+3*1*1+3*1*1*1+2*2*1*1*1+7+2*2*1*1*1+7*1*1+2+8+3+6+3+2*1*2+2+8*1+4+2*2*1+8+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case69() {
    String sequence = "1211291289522291121";
    assertEquals("1*2*1*1*2+9*1+2+8+9+5+2*2+2+9*1*1+2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case70() {
    String sequence = "21312214212421471221121116116111111121421121125";
    assertEquals("2*1+3*1+2*2*1+4+2*1*2+4+2*1+4+7*1+2*2*1*1+2*1*1*1+6*1*1+6*1*1*1*1*1*1*1+2*1+4+2*1*1*2*1*1+2+5", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case71() {
    String sequence = "2219121211112121211511111514121161211921111121";
    assertEquals("2*2*1+9*1+2*1*2*1*1*1*1+2*1*2*1+2*1*1+5*1*1*1*1*1+5*1+4*1+2*1*1+6*1+2*1*1+9+2*1*1*1*1*1*2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case72() {
    String sequence = "1112226926112816112631122221281171411119226";
    assertEquals("1*1*1*2*2+2+6+9+2+6*1*1+2+8*1+6*1*1+2+6+3*1*1+2*2+2*2*1+2+8*1*1+7*1+4*1*1*1*1+9+2*2+6", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case73() {
    String sequence = "121628221122293211111218291122121291521112111225";
    assertEquals("1*2*1+6+2+8+2*2*1*1+2*2+2+9+3+2*1*1*1*1*1*2*1+8+2+9*1*1+2*2*1+2*1*2+9*1+5+2*1*1*1*2*1*1*1+2*2+5", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case74() {
    String sequence = "122111824111821111152221111221233191271162";
    assertEquals("1*2*2*1*1*1+8+2+4*1*1*1+8+2*1*1*1*1*1+5+2*2+2*1*1*1*1*2+2*1*2+3+3*1+9*1+2+7*1*1+6+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case75() {
    String sequence = "11252121213212813111142222111122141297136121";
    assertEquals("1*1*2+5+2*1*2*1+2*1+3+2*1*2+8*1+3*1*1*1*1+4+2*2+2*2*1*1*1*1+2*2*1+4*1+2+9+7*1+3+6*1+2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case76() {
    String sequence = "2162211179241241222221242236512222666918";
    assertEquals("2*1+6+2*2*1*1*1+7+9+2+4*1+2+4*1+2*2+2*2+2*1*2+4+2*2+3+6+5*1+2*2+2*2+6+6+6+9*1+8", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case77() {
    String sequence = "3232121162121922852212182981121714162111181211422";
    assertEquals("3+2+3+2*1*2*1*1+6+2*1*2*1+9+2*2+8+5+2*2*1+2*1+8+2+9+8*1*1+2*1+7*1+4*1+6+2*1*1*1*1+8*1+2*1*1+4+2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case78() {
    String sequence = "818111116111222111511111281141121222111911192";
    assertEquals("8*1+8*1*1*1*1*1+6*1*1*1+2*2+2*1*1*1+5*1*1*1*1*1+2+8*1*1+4*1*1+2*1*2+2*2*1*1*1+9*1*1*1+9+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case79() {
    String sequence = "1211421221621412213828431221144282811121";
    assertEquals("1*2*1*1+4+2*1*2+2*1+6+2*1+4*1+2*2*1+3+8+2+8+4+3*1+2*2*1*1+4+4+2+8+2+8*1*1*1+2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case80() {
    String sequence = "47114212112221442122511121122323521217111";
    assertEquals("4+7*1*1+4+2*1*2*1*1+2*2+2*1+4+4+2*1*2+2+5*1*1*1+2*1*1*2+2+3+2+3+5+2*1*2*1+7*1*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case81() {
    String sequence = "11181125111111211222121112121121511219812222191";
    assertEquals("1*1*1*8*1*1+2+5*1*1*1*1*1*1+2*1*1*2+2*2*1+2*1*1*1*2*1+2*1*1*2*1+5*1*1+2*1+9+8*1+2*2+2*2*1+9*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case82() {
    String sequence = "4121141111712112111982111616812112411419";
    assertEquals("4*1+2*1*1+4*1*1*1*1+7*1+2*1*1*2*1*1*1+9+8+2*1*1*1+6*1+6+8*1+2*1*1*2+4*1*1+4*1+9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case83() {
    String sequence = "52111221121211212121111111171211125222221622118211";
    assertEquals("5+2*1*1*1*2+2*1*1*2*1+2*1*1*2*1+2*1*2*1*1*1*1*1*1*1*1+7*1+2*1*1*1*2+5+2*2+2*2+2*1+6+2*2*1*1+8+2*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case84() {
    String sequence = "1611112217321621221111213419111221112118181111122";
    assertEquals("1*6*1*1*1*1+2*2*1+7+3+2*1+6+2*1*2+2*1*1*1*1*2*1+3+4*1+9*1*1*1+2*2*1*1*1+2*1*1+8*1+8*1*1*1*1*1+2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case85() {
    String sequence = "2211111112212311228118121622115312121121";
    assertEquals("2*2*1*1*1*1*1*1*1+2*2*1+2+3*1*1+2*2+8*1*1+8*1+2*1+6+2*2*1*1+5+3*1+2*1*2*1*1+2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case86() {
    String sequence = "12412111121221151321815211221111121151222123411291";
    assertEquals("1*2+4*1+2*1*1*1*1*2*1+2*2*1*1+5*1+3+2*1+8*1+5+2*1*1*2+2*1*1*1*1*1*2*1*1+5*1+2*2+2*1*2+3+4*1*1+2+9*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case87() {
    String sequence = "716221211212142777132112147112128121111522121";
    assertEquals("7*1+6+2*2*1+2*1*1*2*1+2*1+4+2+7+7+7*1+3+2*1*1*2*1+4+7*1*1+2*1*2+8*1+2*1*1*1*1+5+2*2*1+2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case88() {
    String sequence = "62122224121222231112212167212211181111512";
    assertEquals("6+2*1*2+2*2+2+4*1+2*1*2+2*2+2+3*1*1*1+2*2*1+2*1+6+7+2*1*2+2*1*1*1+8*1*1*1*1+5*1+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case89() {
    String sequence = "661523112121526211112119911112117822112117121";
    assertEquals("6+6*1+5+2+3*1*1+2*1*2*1+5+2+6+2*1*1*1*1*2*1*1+9+9*1*1*1*1+2*1*1+7+8+2*2*1*1+2*1*1+7*1+2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case90() {
    String sequence = "8121211212211171811221449112218112722113112217212";
    assertEquals("8*1+2*1*2*1*1+2*1*2+2*1*1*1+7*1+8*1*1+2*2*1+4+4+9*1*1+2*2*1+8*1*1+2+7+2*2*1*1+3*1*1+2*2*1+7+2*1*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case91() {
    String sequence = "21123521181184211726622124112196113241221112";
    assertEquals("2*1*1*2+3+5+2*1*1+8*1*1+8+4+2*1*1+7+2+6+6+2*2*1+2+4*1*1+2*1+9+6*1*1+3+2+4*1+2*2*1*1*1+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case92() {
    String sequence = "61117211115626131121121782222161211121112211122112";
    assertEquals("6*1*1*1+7+2*1*1*1*1+5+6+2+6*1+3*1*1+2*1*1*2*1+7+8+2*2+2*2*1+6*1+2*1*1*1*2*1*1*1+2*2*1*1*1+2*2*1*1+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case93() {
    String sequence = "12111962112621111827712182113112142182157112";
    assertEquals("1*2*1*1*1+9+6+2*1*1*2+6+2*1*1*1*1+8+2+7+7*1+2*1+8+2*1*1+3*1*1+2*1+4+2*1+8+2*1+5+7*1*1+2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case94() {
    String sequence = "1261911282122211112229121812128117162112122";
    assertEquals("1*2+6*1+9*1*1+2+8+2*1*2+2*2*1*1*1*1+2*2+2+9*1+2*1+8*1+2*1*2+8*1*1+7*1+6+2*1*1*2*1+2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case95() {
    String sequence = "125111111212127922913212121211412111112811231";
    assertEquals("1*2+5*1*1*1*1*1*1+2*1*2*1+2+7+9+2*2+9*1+3+2*1*2*1+2*1*2*1*1+4*1+2*1*1*1*1*1*2+8*1*1+2+3*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case96() {
    String sequence = "11222111811413123123122228111121222412111171";
    assertEquals("1*1*2*2+2*1*1*1+8*1*1+4*1+3*1+2+3*1+2+3*1+2*2+2*2+8*1*1*1*1+2*1*2+2*2+4*1+2*1*1*1*1+7*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case97() {
    String sequence = "112111211111111327121111122121114122422283171121";
    assertEquals("1*1*2*1*1*1*2*1*1*1*1*1*1*1*1+3+2+7*1+2*1*1*1*1*1*2+2*1*2*1*1*1+4*1+2*2+4+2*2+2+8+3*1+7*1*1+2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case98() {
    String sequence = "2111151185112722121225221194113112211221812218";
    assertEquals("2*1*1*1*1+5*1*1+8+5*1*1+2+7+2*2*1+2*1*2+2+5+2*2*1*1+9+4*1*1+3*1*1+2*2*1*1+2*2*1+8*1+2*2*1+8", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case99() {
    String sequence = "2211711235132121122125221212191222211721111111";
    assertEquals("2*2*1*1+7*1*1+2+3+5*1+3+2*1*2*1*1+2*2*1+2+5+2*2*1+2*1*2*1+9*1+2*2+2*2*1*1+7+2*1*1*1*1*1*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case100() {
    String sequence = "12221812211121121111229211292112111112111";
    assertEquals("1*2*2+2*1+8*1+2*2*1*1*1+2*1*1*2*1*1*1*1+2*2+9+2*1*1*2+9+2*1*1*2*1*1*1*1*1+2*1*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case101() {
    String sequence = "111221911212";
    assertEquals("1*1*1*2*2*1+9*1*1+2*1*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case102() {
    String sequence = "1112222222222222221114222134324333321121";
    assertEquals("1*1*1*2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*1*1*1+4+2*2+2*1+3+4+3+2+4+3+3+3+3+2*1*1*2*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case103() {
    String sequence = "01234567899876543210123456789009876543219988776655";
    assertEquals("0*1*2*3*4*5*6*7*8*9*9*8*7*6*5*4*3*2*1*0*1*2*3*4*5*6*7*8*9*0*0*9*8*7*6*5*4*3*2*1*9*9*8*8*7*7*6*6*5*5", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case104() {
    String sequence = "99999900999";
    assertEquals("9*9*9*9*9*9*0*0*9*9*9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case105() {
    String sequence = "32454565756724136568765112645341152342222264235234";
    assertEquals("3+2+4+5+4+5+6+5+7+5+6+7+2+4*1+3+6+5+6+8+7+6+5*1*1+2+6+4+5+3+4*1*1+5+2+3+4+2*2+2*2+2+6+4+2+3+5+2+3+4", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case106() {
    String sequence = "12345678901234567890123456789012345678901234567890";
    assertEquals("1*2*3*4*5*6*7*8*9*0*1*2*3*4*5*6*7*8*9*0*1*2*3*4*5*6*7*8*9*0*1*2*3*4*5*6*7*8*9*0*1*2*3*4*5*6*7*8*9*0", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case107() {
    String sequence = "99999999999999999999999999999999999099999999999999";
    assertEquals("9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*0*9*9*9*9*9*9*9*9*9*9*9*9*9*9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case108() {
    String sequence = "99999999999999999999999999999999999999999999999990";
    assertEquals("9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*0", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case109() {
    String sequence = "99999999999999999999999999999999999999999999999999";
    assertEquals("9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case110() {
    String sequence = "22222333335555511111111111111111111111111111111111";
    assertEquals("2*2+2*2+2+3+3+3+3+3+5+5+5+5+5*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case111() {
    String sequence = "483274892340000392102";
    assertEquals("4*8*3*2*7*4*8*9*2*3*4*0*0*0*0*3*9*2*1*0*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case112() {
    String sequence = "22";
    assertEquals("2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case113() {
    String sequence = "112550";
    assertEquals("1*1*2*5*5*0", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case114() {
    String sequence = "1222112";
    assertEquals("1*2*2+2*1*1*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case115() {
    String sequence = "999999999999999999999999999999999999990";
    assertEquals("9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*0", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case116() {
    String sequence = "12345678911234567891123456789112345678911234567891";
    assertEquals("1*2+3+4+5+6+7+8+9*1*1+2+3+4+5+6+7+8+9*1*1+2+3+4+5+6+7+8+9*1*1+2+3+4+5+6+7+8+9*1*1+2+3+4+5+6+7+8+9*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case117() {
    String sequence = "113";
    assertEquals("1*1*3", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case118() {
    String sequence = "123121231231232344345645";
    assertEquals("1*2+3*1+2*1*2+3*1+2+3*1+2+3+2+3+4+4+3+4+5+6+4+5", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case119() {
    String sequence = "99990";
    assertEquals("9*9*9*9*0", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case120() {
    String sequence = "12121121222111212121122598";
    assertEquals("1*2*1*2*1*1+2*1*2+2*2*1*1*1+2*1*2*1+2*1*1*2+2+5+9+8", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case121() {
    String sequence = "12345678987654331231312312312312312434543645645674";
    assertEquals("1*2+3+4+5+6+7+8+9+8+7+6+5+4+3+3*1+2+3*1+3*1+2+3*1+2+3*1+2+3*1+2+3*1+2+4+3+4+5+4+3+6+4+5+6+4+5+6+7+4", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case122() {
    String sequence = "12";
    assertEquals("1*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case123() {
    String sequence = "392570";
    assertEquals("3*9*2*5*7*0", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case124() {
    String sequence = "3221123121321434242132234321421143912341324";
    assertEquals("3+2*2*1*1+2+3*1+2*1+3+2*1+4+3+4+2+4+2*1+3+2*2+3+4+3+2*1+4+2*1*1+4+3+9*1+2+3+4*1+3+2+4", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case125() {
    String sequence = "30";
    assertEquals("3*0", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case126() {
    String sequence = "999999999999999999999999999999999999";
    assertEquals("9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9+9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case127() {
    String sequence = "11111191111111";
    assertEquals("1*1*1*1*1*1*9*1*1*1*1*1*1*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case128() {
    String sequence = "19";
    assertEquals("1*9", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case129() {
    String sequence = "11122191121288238741268822211182112543311133451191";
    assertEquals("1*1*1*2*2*1+9*1*1+2*1*2+8+8+2+3+8+7+4*1+2+6+8+8+2*2+2*1*1*1+8+2*1*1*2+5+4+3+3*1*1*1+3+3+4+5*1*1+9*1", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case130() {
    String sequence = "2307";
    assertEquals("2*3*0*7", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case131() {
    String sequence = "5550";
    assertEquals("5*5*5*0", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case132() {
    String sequence = "14";
    assertEquals("1*4", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case133() {
    String sequence = "98654859874569523687946546456456";
    assertEquals("9+8+6+5+4+8+5+9+8+7+4+5+6+9+5+2+3+6+8+7+9+4+6+5+4+6+4+5+6+4+5+6", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case134() {
    String sequence = "222222";
    assertEquals("2*2+2*2+2*2", operationsarrangement.arrange(sequence));
  }

  @Test
  public void case135() {
    String sequence = "222222222222222222222";
    assertEquals("2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2*2+2", operationsarrangement.arrange(sequence));
  }

}
