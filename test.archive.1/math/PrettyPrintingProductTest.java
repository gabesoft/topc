package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PrettyPrintingProductTest {
  PrettyPrintingProduct prettyprintingproduct = new PrettyPrintingProduct();

  @Test
  public void case1() {
    int A = 1;
    int B = 10;
    assertEquals("36288 * 10^2", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case2() {
    int A = 7;
    int B = 7;
    assertEquals("7 * 10^0", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case3() {
    int A = 211;
    int B = 214;
    assertEquals("2038974024 * 10^0", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case4() {
    int A = 411;
    int B = 414;
    assertEquals("28952...24024 * 10^0", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case5() {
    int A = 412;
    int B = 415;
    assertEquals("2923450236 * 10^1", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case6() {
    int A = 47;
    int B = 4700;
    assertEquals("14806...28928 * 10^1163", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case7() {
    int A = 311;
    int B = 314;
    assertEquals("9536499024 * 10^0", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case8() {
    int A = 312;
    int B = 315;
    assertEquals("965915496 * 10^1", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case9() {
    int A = 1;
    int B = 100000;
    assertEquals("28242...62496 * 10^24999", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case10() {
    int A = 1;
    int B = 1000000;
    assertEquals("82639...12544 * 10^249998", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case11() {
    int A = 1000000;
    int B = 1000000;
    assertEquals("1 * 10^6", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case12() {
    int A = 1;
    int B = 19;
    assertEquals("12164...08832 * 10^3", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case13() {
    int A = 8;
    int B = 25;
    assertEquals("30776...34496 * 10^5", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case14() {
    int A = 13;
    int B = 25;
    assertEquals("32382...26624 * 10^4", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case15() {
    int A = 427784;
    int B = 744439;
    assertEquals("11778...95584 * 10^79163", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case16() {
    int A = 448441;
    int B = 732252;
    assertEquals("17954...99328 * 10^70953", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case17() {
    int A = 485137;
    int B = 592122;
    assertEquals("15864...30656 * 10^26743", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case18() {
    int A = 453285;
    int B = 495368;
    assertEquals("11029...67648 * 10^10519", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case19() {
    int A = 826677;
    int B = 991147;
    assertEquals("22456...83328 * 10^41117", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case20() {
    int A = 82608;
    int B = 853848;
    assertEquals("16549...75872 * 10^192808", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case21() {
    int A = 398036;
    int B = 825775;
    assertEquals("74617...85408 * 10^106935", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case22() {
    int A = 551677;
    int B = 622039;
    assertEquals("92473...10944 * 10^17589", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case23() {
    int A = 440532;
    int B = 777613;
    assertEquals("90688...26912 * 10^84268", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case24() {
    int A = 124812;
    int B = 480191;
    assertEquals("15181...62336 * 10^88846", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case25() {
    int A = 65043;
    int B = 286828;
    assertEquals("63366...36224 * 10^55445", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case26() {
    int A = 803711;
    int B = 967485;
    assertEquals("11565...14528 * 10^40942", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case27() {
    int A = 465688;
    int B = 774960;
    assertEquals("48468...87488 * 10^77316", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case28() {
    int A = 44952;
    int B = 779461;
    assertEquals("43655...84352 * 10^183626", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case29() {
    int A = 76;
    int B = 89;
    assertEquals("66539...96032 * 10^2", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case30() {
    int A = 42;
    int B = 99;
    assertEquals("27898...16032 * 10^13", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case31() {
    int A = 78;
    int B = 83;
    assertEquals("27176...94656 * 10^1", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case32() {
    int A = 43;
    int B = 97;
    assertEquals("68464...65248 * 10^13", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case33() {
    int A = 2;
    int B = 16;
    assertEquals("20922...89888 * 10^3", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case34() {
    int A = 99;
    int B = 99;
    assertEquals("99 * 10^0", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case35() {
    int A = 69;
    int B = 70;
    assertEquals("483 * 10^1", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case36() {
    int A = 24;
    int B = 87;
    assertEquals("81531...66816 * 10^16", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case37() {
    int A = 54;
    int B = 81;
    assertEquals("13560...60384 * 10^7", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case38() {
    int A = 75;
    int B = 88;
    assertEquals("56072...40416 * 10^4", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case39() {
    int A = 74;
    int B = 81;
    assertEquals("12968...03136 * 10^3", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case40() {
    int A = 94;
    int B = 97;
    assertEquals("8315616 * 10^1", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case41() {
    int A = 27;
    int B = 88;
    assertEquals("45992...60768 * 10^14", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case42() {
    int A = 72;
    int B = 99;
    assertEquals("10973...98688 * 10^6", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case43() {
    int A = 23;
    int B = 69;
    assertEquals("15224...43968 * 10^11", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case44() {
    int A = 62;
    int B = 92;
    assertEquals("24505...32544 * 10^7", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case45() {
    int A = 77;
    int B = 78;
    assertEquals("6006 * 10^0", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case46() {
    int A = 1;
    int B = 97;
    assertEquals("96192...83232 * 10^22", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case47() {
    int A = 82;
    int B = 97;
    assertEquals("16593...05984 * 10^3", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case48() {
    int A = 936;
    int B = 917877;
    assertEquals("47132...03616 * 10^229233", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case49() {
    int A = 4896;
    int B = 915147;
    assertEquals("71131...58528 * 10^227561", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case50() {
    int A = 7392;
    int B = 916397;
    assertEquals("56253...80128 * 10^227250", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case51() {
    int A = 5805;
    int B = 945637;
    assertEquals("19689...37984 * 10^234958", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case52() {
    int A = 6925;
    int B = 984811;
    assertEquals("23442...49344 * 10^244471", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case53() {
    int A = 8542;
    int B = 935433;
    assertEquals("17118...46304 * 10^231721", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case54() {
    int A = 5028;
    int B = 999058;
    assertEquals("37894...01792 * 10^248504", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case55() {
    int A = 1442;
    int B = 974923;
    assertEquals("67157...09184 * 10^243367", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case56() {
    int A = 2359;
    int B = 916372;
    assertEquals("18587...28544 * 10^228502", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case57() {
    int A = 9714;
    int B = 909676;
    assertEquals("12844...57056 * 10^224991", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case58() {
    int A = 2;
    int B = 1000000;
    assertEquals("82639...12544 * 10^249998", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case59() {
    int A = 2;
    int B = 999999;
    assertEquals("82639...12544 * 10^249992", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case60() {
    int A = 1;
    int B = 999999;
    assertEquals("82639...12544 * 10^249992", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case61() {
    int A = 4;
    int B = 1000000;
    assertEquals("13773...35424 * 10^249998", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case62() {
    int A = 1;
    int B = 999935;
    assertEquals("82811...39936 * 10^249978", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case63() {
    int A = 2851;
    int B = 999998;
    assertEquals("16675...45312 * 10^249282", prettyprintingproduct.prettyPrint(A, B));
  }

  @Test
  public void case64() {
    int A = 3;
    int B = 999999;
    assertEquals("41319...06272 * 10^249992", prettyprintingproduct.prettyPrint(A, B));
  }

}
