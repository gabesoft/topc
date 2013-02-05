package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class SignificanceArithmeticTest {
  SignificanceArithmetic significancearithmetic = new SignificanceArithmetic();

  @Test
  public void case1() {
    String expression = "2+2";
    assertEquals("4", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case2() {
    String expression = "1.234+0.000";
    assertEquals("1.234", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case3() {
    String expression = "1.234+0.006";
    assertEquals("1.240", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case4() {
    String expression = "12.57+2.6";
    assertEquals("15.2", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case5() {
    String expression = "5.50005+0";
    assertEquals("6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case6() {
    String expression = "2.5+2";
    assertEquals("4", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case7() {
    String expression = "999999+0.900";
    assertEquals("1000000", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case8() {
    String expression = "1.0001+0.9999";
    assertEquals("2.0000", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case9() {
    String expression = "0.00+000";
    assertEquals("0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case10() {
    String expression = "1.5+0";
    assertEquals("2", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case11() {
    String expression = "1.51+0";
    assertEquals("2", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case12() {
    String expression = "2.5+0";
    assertEquals("2", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case13() {
    String expression = "0.25+0";
    assertEquals("0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case14() {
    String expression = "0.25+0.0";
    assertEquals("0.2", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case15() {
    String expression = "0.00001+0.00009";
    assertEquals("0.00010", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case16() {
    String expression = "0.0+0.0";
    assertEquals("0.0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case17() {
    String expression = "0+0.84994";
    assertEquals("1", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case18() {
    String expression = "0.99+1.01";
    assertEquals("2.00", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case19() {
    String expression = "0.2+1.48";
    assertEquals("1.7", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case20() {
    String expression = "4.44+0.2";
    assertEquals("4.6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case21() {
    String expression = "0.23+5.22501";
    assertEquals("5.46", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case22() {
    String expression = "1.3+0.25";
    assertEquals("1.6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case23() {
    String expression = "1.3+0.35";
    assertEquals("1.6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case24() {
    String expression = "0.99+0.01";
    assertEquals("1.00", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case25() {
    String expression = "0.2+0.48";
    assertEquals("0.7", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case26() {
    String expression = "0.2+0.44";
    assertEquals("0.6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case27() {
    String expression = "0.23+0.22005";
    assertEquals("0.45", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case28() {
    String expression = "0.25+0.3";
    assertEquals("0.6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case29() {
    String expression = "0.35+0.3";
    assertEquals("0.6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case30() {
    String expression = "0+0";
    assertEquals("0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case31() {
    String expression = "000+000";
    assertEquals("0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case32() {
    String expression = "0+1";
    assertEquals("1", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case33() {
    String expression = "0+0.1";
    assertEquals("0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case34() {
    String expression = "0+0.6";
    assertEquals("1", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case35() {
    String expression = "0+0.4";
    assertEquals("0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case36() {
    String expression = "0.5001+0";
    assertEquals("1", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case37() {
    String expression = "0+0.5";
    assertEquals("0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case38() {
    String expression = "01.98+0.02";
    assertEquals("2.00", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case39() {
    String expression = "05.2+2.6";
    assertEquals("7.8", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case40() {
    String expression = "0002.2+0.2";
    assertEquals("2.4", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case41() {
    String expression = "4.4505+00003.1";
    assertEquals("7.6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case42() {
    String expression = "004.15+0.2";
    assertEquals("4.4", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case43() {
    String expression = "004.25+0.2";
    assertEquals("4.4", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case44() {
    String expression = "999999+999999";
    assertEquals("1999998", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case45() {
    String expression = "1+999999";
    assertEquals("1000000", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case46() {
    String expression = "123+456";
    assertEquals("579", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case47() {
    String expression = "009+0";
    assertEquals("9", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case48() {
    String expression = "500+00500";
    assertEquals("1000", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case49() {
    String expression = "999999+0.5";
    assertEquals("1000000", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case50() {
    String expression = "0.00000+01.0001";
    assertEquals("1.0001", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case51() {
    String expression = "0.00009+0.00001";
    assertEquals("0.00010", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case52() {
    String expression = "0.00000+0.00001";
    assertEquals("0.00001", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case53() {
    String expression = "6408.19+81482.1";
    assertEquals("87890.3", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case54() {
    String expression = "14122.3+601327";
    assertEquals("615449", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case55() {
    String expression = "5.77167+2154.46";
    assertEquals("2160.23", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case56() {
    String expression = "577964+0.89146";
    assertEquals("577965", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case57() {
    String expression = "64066+4706.74";
    assertEquals("68773", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case58() {
    String expression = "4.27071+795.405";
    assertEquals("799.676", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case59() {
    String expression = "60.3820+60.6559";
    assertEquals("121.0379", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case60() {
    String expression = "509834+9.70502";
    assertEquals("509844", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case61() {
    String expression = "1.84565+396875";
    assertEquals("396877", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case62() {
    String expression = "3.36085+6169.95";
    assertEquals("6173.31", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case63() {
    String expression = "0.4146+643.418";
    assertEquals("643.833", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case64() {
    String expression = "26.2826+1401.41";
    assertEquals("1427.69", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case65() {
    String expression = "202.563+92.2725";
    assertEquals("294.836", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case66() {
    String expression = "12800.9+13.9656";
    assertEquals("12814.9", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case67() {
    String expression = "82498.4+68.238";
    assertEquals("82566.6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case68() {
    String expression = "85414+5.78276";
    assertEquals("85420", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case69() {
    String expression = "94311.4+36048";
    assertEquals("130359", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case70() {
    String expression = "39.3798+286609";
    assertEquals("286648", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case71() {
    String expression = "18.2227+4.94041";
    assertEquals("23.1631", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case72() {
    String expression = "136133+158.14";
    assertEquals("136291", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case73() {
    String expression = "258.812+8812.92";
    assertEquals("9071.73", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case74() {
    String expression = "91.3922+47.871";
    assertEquals("139.263", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case75() {
    String expression = "94.9966+71.6394";
    assertEquals("166.6360", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case76() {
    String expression = "423.712+67.1592";
    assertEquals("490.871", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case77() {
    String expression = "9.48534+438951";
    assertEquals("438960", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case78() {
    String expression = "12.7528+8605.39";
    assertEquals("8618.14", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case79() {
    String expression = "3950.67+12578.0";
    assertEquals("16528.7", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case80() {
    String expression = "1624.91+4.92270";
    assertEquals("1629.83", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case81() {
    String expression = "4.41672+8311.43";
    assertEquals("8315.85", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case82() {
    String expression = "951.320+454.213";
    assertEquals("1405.533", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case83() {
    String expression = "665.880+88061";
    assertEquals("88727", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case84() {
    String expression = "9.25400+27.3379";
    assertEquals("36.5919", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case85() {
    String expression = "12857.4+16976.4";
    assertEquals("29833.8", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case86() {
    String expression = "74760.5+96.72";
    assertEquals("74857.2", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case87() {
    String expression = "7465.61+949.587";
    assertEquals("8415.20", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case88() {
    String expression = "4.55918+4703.31";
    assertEquals("4707.87", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case89() {
    String expression = "78.8214+500.17";
    assertEquals("578.99", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case90() {
    String expression = "7.82339+869161";
    assertEquals("869169", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case91() {
    String expression = "3282.2+2.81021";
    assertEquals("3285.0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case92() {
    String expression = "776.94+0.49295";
    assertEquals("777.43", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case93() {
    String expression = "501.798+7.7792";
    assertEquals("509.577", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case94() {
    String expression = "358.50+8.12127";
    assertEquals("366.62", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case95() {
    String expression = "79265.7+6076.86";
    assertEquals("85342.6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case96() {
    String expression = "27488.1+96424.3";
    assertEquals("123912.4", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case97() {
    String expression = "163836+575.376";
    assertEquals("164411", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case98() {
    String expression = "47.4684+477153";
    assertEquals("477200", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case99() {
    String expression = "7497.55+1.20069";
    assertEquals("7498.75", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case100() {
    String expression = "716.702+9485.71";
    assertEquals("10202.41", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case101() {
    String expression = "77893.1+697.379";
    assertEquals("78590.5", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case102() {
    String expression = "1992.86+41402.6";
    assertEquals("43395.5", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case103() {
    String expression = "27432.6+794.199";
    assertEquals("28226.8", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case104() {
    String expression = "21761.7+93.3480";
    assertEquals("21855.0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case105() {
    String expression = "995389+5482.6";
    assertEquals("1000872", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case106() {
    String expression = "792.825+8884.66";
    assertEquals("9677.48", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case107() {
    String expression = "326885+58057.6";
    assertEquals("384943", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case108() {
    String expression = "329757+861.239";
    assertEquals("330618", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case109() {
    String expression = "0.36178+6412.73";
    assertEquals("6413.09", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case110() {
    String expression = "3559.4+84.3855";
    assertEquals("3643.8", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case111() {
    String expression = "51346.0+4621.38";
    assertEquals("55967.4", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case112() {
    String expression = "1.23301+494943";
    assertEquals("494944", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case113() {
    String expression = "99+0.6";
    assertEquals("100", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case114() {
    String expression = "0200+000.4";
    assertEquals("200", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case115() {
    String expression = "346+0.51";
    assertEquals("347", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case116() {
    String expression = "345+0.51";
    assertEquals("346", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case117() {
    String expression = "346+0.5001";
    assertEquals("347", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case118() {
    String expression = "345+0.5001";
    assertEquals("346", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case119() {
    String expression = "123+0.5";
    assertEquals("124", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case120() {
    String expression = "124+0.5";
    assertEquals("124", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case121() {
    String expression = "123+0.50";
    assertEquals("124", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case122() {
    String expression = "124+0.50";
    assertEquals("124", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case123() {
    String expression = "124+00.5000";
    assertEquals("124", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case124() {
    String expression = "123+00.5000";
    assertEquals("124", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case125() {
    String expression = "74508.2+724.399";
    assertEquals("75232.6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case126() {
    String expression = "22378.0+8695.94";
    assertEquals("31073.9", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case127() {
    String expression = "552.983+274.304";
    assertEquals("827.287", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case128() {
    String expression = "71.9902+3.64956";
    assertEquals("75.6398", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case129() {
    String expression = "513072+8.83621";
    assertEquals("513081", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case130() {
    String expression = "1241.61+85.984";
    assertEquals("1327.59", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case131() {
    String expression = "18.2368+89.482";
    assertEquals("107.719", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case132() {
    String expression = "9837.37+12063.7";
    assertEquals("21901.1", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case133() {
    String expression = "31409+49.5775";
    assertEquals("31459", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case134() {
    String expression = "5435.69+83.7178";
    assertEquals("5519.41", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case135() {
    String expression = "0.04+0.0";
    assertEquals("0.0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case136() {
    String expression = "0.04+0.02";
    assertEquals("0.06", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case137() {
    String expression = "983.17+76.8";
    assertEquals("1060.0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case138() {
    String expression = "0.52+0";
    assertEquals("1", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case139() {
    String expression = "0.0053+00.02";
    assertEquals("0.03", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case140() {
    String expression = "0.00053+00.002";
    assertEquals("0.003", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case141() {
    String expression = "7.4772+7.62";
    assertEquals("15.10", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case142() {
    String expression = "0.00050+00.003";
    assertEquals("0.004", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case143() {
    String expression = "0.00050+00.002";
    assertEquals("0.002", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case144() {
    String expression = "3.00050+02.002";
    assertEquals("5.002", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case145() {
    String expression = "0.1202+0.12647";
    assertEquals("0.2467", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case146() {
    String expression = "1.257+15.56";
    assertEquals("16.82", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case147() {
    String expression = "10.885+10.11";
    assertEquals("21.00", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case148() {
    String expression = "9999.18+0.8";
    assertEquals("10000.0", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case149() {
    String expression = "2.35+0.1";
    assertEquals("2.4", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case150() {
    String expression = "2.25+2.2";
    assertEquals("4.4", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case151() {
    String expression = "14.502+0";
    assertEquals("15", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case152() {
    String expression = "3.5+2";
    assertEquals("6", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case153() {
    String expression = "4.00001+5.55554";
    assertEquals("9.55555", significancearithmetic.evaluate(expression));
  }

  @Test
  public void case154() {
    String expression = "97.951+2.0";
    assertEquals("100.0", significancearithmetic.evaluate(expression));
  }

}
