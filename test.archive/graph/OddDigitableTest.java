package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class OddDigitableTest {
  OddDigitable odddigitable = new OddDigitable();

  @Test
  public void case1() {
    int N = 10;
    int M = 7;
    assertEquals("7", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case2() {
    int N = 22;
    int M = 12;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case3() {
    int N = 29;
    int M = 0;
    assertEquals("319", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case4() {
    int N = 5934;
    int M = 2735;
    assertEquals("791957", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case5() {
    int N = 2;
    int M = 0;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case6() {
    int N = 2;
    int M = 1;
    assertEquals("1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case7() {
    int N = 3;
    int M = 0;
    assertEquals("3", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case8() {
    int N = 3;
    int M = 1;
    assertEquals("1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case9() {
    int N = 3;
    int M = 2;
    assertEquals("5", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case10() {
    int N = 4;
    int M = 0;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case11() {
    int N = 4;
    int M = 1;
    assertEquals("1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case12() {
    int N = 4;
    int M = 2;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case13() {
    int N = 4;
    int M = 3;
    assertEquals("3", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case14() {
    int N = 5;
    int M = 0;
    assertEquals("5", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case15() {
    int N = 5;
    int M = 1;
    assertEquals("1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case16() {
    int N = 5;
    int M = 2;
    assertEquals("7", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case17() {
    int N = 5;
    int M = 3;
    assertEquals("3", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case18() {
    int N = 5;
    int M = 4;
    assertEquals("9", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case19() {
    int N = 7;
    int M = 0;
    assertEquals("7", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case20() {
    int N = 7;
    int M = 1;
    assertEquals("1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case21() {
    int N = 7;
    int M = 2;
    assertEquals("9", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case22() {
    int N = 7;
    int M = 3;
    assertEquals("3", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case23() {
    int N = 7;
    int M = 5;
    assertEquals("5", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case24() {
    int N = 7;
    int M = 6;
    assertEquals("13", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case25() {
    int N = 87412;
    int M = 21742;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case26() {
    int N = 33541;
    int M = 15899;
    assertEquals("1357539", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case27() {
    int N = 31886;
    int M = 23932;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case28() {
    int N = 91589;
    int M = 14136;
    assertEquals("9997337", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case29() {
    int N = 71505;
    int M = 37965;
    assertEquals("11335755", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case30() {
    int N = 7111;
    int M = 3800;
    assertEquals("39355", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case31() {
    int N = 14199;
    int M = 1040;
    assertEquals("1151159", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case32() {
    int N = 11961;
    int M = 8831;
    assertEquals("511193", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case33() {
    int N = 88472;
    int M = 2076;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case34() {
    int N = 14413;
    int M = 6566;
    assertEquals("193935", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case35() {
    int N = 3126;
    int M = 2304;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case36() {
    int N = 91915;
    int M = 40145;
    assertEquals("7577175", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case37() {
    int N = 64065;
    int M = 17098;
    assertEquals("33779353", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case38() {
    int N = 2061;
    int M = 1746;
    assertEquals("57393", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case39() {
    int N = 51071;
    int M = 25711;
    assertEquals("1353557", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case40() {
    int N = 55733;
    int M = 49889;
    assertEquals("3951199", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case41() {
    int N = 71425;
    int M = 60765;
    assertEquals("3917715", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case42() {
    int N = 39228;
    int M = 4488;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case43() {
    int N = 71741;
    int M = 14593;
    assertEquals("3171197", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case44() {
    int N = 61177;
    int M = 54349;
    assertEquals("1155535", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case45() {
    int N = 81855;
    int M = 16802;
    assertEquals("1735757", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case46() {
    int N = 36096;
    int M = 17664;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case47() {
    int N = 56375;
    int M = 30913;
    assertEquals("59111913", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case48() {
    int N = 54507;
    int M = 29485;
    assertEquals("1991737", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case49() {
    int N = 21846;
    int M = 678;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case50() {
    int N = 5813;
    int M = 4708;
    assertEquals("33773", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case51() {
    int N = 91957;
    int M = 50531;
    assertEquals("5935779", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case52() {
    int N = 51551;
    int M = 37119;
    assertEquals("37119", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case53() {
    int N = 75737;
    int M = 297;
    assertEquals("151771", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case54() {
    int N = 66311;
    int M = 16143;
    assertEquals("7177731", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case55() {
    int N = 85799;
    int M = 38857;
    assertEquals("9133551", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case56() {
    int N = 80391;
    int M = 273;
    assertEquals("11737359", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case57() {
    int N = 85561;
    int M = 17450;
    assertEquals("59995711", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case58() {
    int N = 69730;
    int M = 24386;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case59() {
    int N = 9813;
    int M = 6183;
    assertEquals("555711", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case60() {
    int N = 45073;
    int M = 18540;
    assertEquals("153759", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case61() {
    int N = 60165;
    int M = 46235;
    assertEquals("1971515", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case62() {
    int N = 79747;
    int M = 26351;
    assertEquals("9595991", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case63() {
    int N = 79681;
    int M = 51280;
    assertEquals("9373957", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case64() {
    int N = 5518;
    int M = 3348;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case65() {
    int N = 99999;
    int M = 21333;
    assertEquals("313339199997999", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case66() {
    int N = 99990;
    int M = 21339;
    assertEquals("3133919997999", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case67() {
    int N = 90009;
    int M = 51015;
    assertEquals("315119399799", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case68() {
    int N = 89991;
    int M = 2119;
    assertEquals("315397939171", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case69() {
    int N = 83325;
    int M = 64874;
    assertEquals("155199959999", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case70() {
    int N = 80008;
    int M = 51013;
    assertEquals("313113199197", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case71() {
    int N = 79992;
    int M = 22153;
    assertEquals("317791999777", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case72() {
    int N = 76923;
    int M = 44968;
    assertEquals("111111395395", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case73() {
    int N = 70007;
    int M = 1010;
    assertEquals("313115199399", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case74() {
    int N = 69993;
    int M = 32132;
    assertEquals("313597999199", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case75() {
    int N = 66666;
    int M = 14881;
    assertEquals("3115191195991", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case76() {
    int N = 60006;
    int M = 51015;
    assertEquals("313113159195", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case77() {
    int N = 59994;
    int M = 2133;
    assertEquals("313395999399", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case78() {
    int N = 50005;
    int M = 10109;
    assertEquals("3131131191919", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case79() {
    int N = 49995;
    int M = 21339;
    assertEquals("3133919997999", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case80() {
    int N = 40004;
    int M = 11009;
    assertEquals("313113159193", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case81() {
    int N = 39996;
    int M = 22133;
    assertEquals("313791999797", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case82() {
    int N = 33333;
    int M = 14881;
    assertEquals("3115191195991", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case83() {
    int N = 30003;
    int M = 21012;
    assertEquals("313113159195", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case84() {
    int N = 29997;
    int M = 2133;
    assertEquals("313395999399", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case85() {
    int N = 20002;
    int M = 11011;
    assertEquals("313113119191", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case86() {
    int N = 19998;
    int M = 2133;
    assertEquals("313391999799", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case87() {
    int N = 10001;
    int M = 1010;
    assertEquals("313113119191", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case88() {
    int N = 9999;
    int M = 2133;
    assertEquals("313391999799", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case89() {
    int N = 99990;
    int M = 99988;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case90() {
    int N = 99990;
    int M = 0;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case91() {
    int N = 100000;
    int M = 99999;
    assertEquals("99999", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case92() {
    int N = 100000;
    int M = 59009;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case93() {
    int N = 100000;
    int M = 0;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case94() {
    int N = 19998;
    int M = 4674;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case95() {
    int N = 99001;
    int M = 2506;
    assertEquals("17393191193", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case96() {
    int N = 99001;
    int M = 0;
    assertEquals("1199199113", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case97() {
    int N = 99999;
    int M = 0;
    assertEquals("99999", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case98() {
    int N = 99899;
    int M = 0;
    assertEquals("375919937", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case99() {
    int N = 99999;
    int M = 2000;
    assertEquals("31111911179777", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case100() {
    int N = 99999;
    int M = 2;
    assertEquals("31999979999", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case101() {
    int N = 99999;
    int M = 1234;
    assertEquals("13111993179991", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case102() {
    int N = 99997;
    int M = 99989;
    assertEquals("3333199993", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case103() {
    int N = 99999;
    int M = 21111;
    assertEquals("311119199997999", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case104() {
    int N = 99999;
    int M = 21333;
    assertEquals("313339199997999", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case105() {
    int N = 99999;
    int M = 1000;
    assertEquals("11111991179977", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case106() {
    int N = 99999;
    int M = 14;
    assertEquals("151999979999", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case107() {
    int N = 10100;
    int M = 3023;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case108() {
    int N = 29;
    int M = 0;
    assertEquals("319", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case109() {
    int N = 200;
    int M = 21;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case110() {
    int N = 99999;
    int M = 10001;
    assertEquals("111119911199777", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case111() {
    int N = 99999;
    int M = 100;
    assertEquals("1111999179997", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case112() {
    int N = 2;
    int M = 1;
    assertEquals("1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case113() {
    int N = 9999;
    int M = 8911;
    assertEquals("91119799", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case114() {
    int N = 100000;
    int M = 2735;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case115() {
    int N = 95642;
    int M = 12225;
    assertEquals("13115179", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case116() {
    int N = 9999;
    int M = 9240;
    assertEquals("193199919", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case117() {
    int N = 100;
    int M = 21;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case118() {
    int N = 40;
    int M = 21;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case119() {
    int N = 99999;
    int M = 6;
    assertEquals("71999979999", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case120() {
    int N = 99999;
    int M = 21353;
    assertEquals("311139111999119", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case121() {
    int N = 3;
    int M = 2;
    assertEquals("5", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case122() {
    int N = 4995;
    int M = 2217;
    assertEquals("3119119977", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case123() {
    int N = 82;
    int M = 27;
    assertEquals("191", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case124() {
    int N = 99999;
    int M = 97680;
    assertEquals("19771999959", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case125() {
    int N = 90000;
    int M = 10001;
    assertEquals("-1", odddigitable.findMultiple(N, M));
  }

  @Test
  public void case126() {
    int N = 3;
    int M = 0;
    assertEquals("3", odddigitable.findMultiple(N, M));
  }

}
