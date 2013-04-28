package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class ZCurveTest {
  ZCurve zcurve = new ZCurve();

  @Test
  public void case1() {
    int N = 2;
    int r = 3;
    int c = 1;
    assertEquals(11, zcurve.zValue(N, r, c));
  }

  @Test
  public void case2() {
    int N = 1;
    int r = 0;
    int c = 0;
    assertEquals(0, zcurve.zValue(N, r, c));
  }

  @Test
  public void case3() {
    int N = 3;
    int r = 7;
    int c = 7;
    assertEquals(63, zcurve.zValue(N, r, c));
  }

  @Test
  public void case4() {
    int N = 4;
    int r = 7;
    int c = 7;
    assertEquals(63, zcurve.zValue(N, r, c));
  }

  @Test
  public void case5() {
    int N = 10;
    int r = 511;
    int c = 511;
    assertEquals(262143, zcurve.zValue(N, r, c));
  }

  @Test
  public void case6() {
    int N = 10;
    int r = 512;
    int c = 512;
    assertEquals(786432, zcurve.zValue(N, r, c));
  }

  @Test
  public void case7() {
    int N = 1;
    int r = 0;
    int c = 1;
    assertEquals(1, zcurve.zValue(N, r, c));
  }

  @Test
  public void case8() {
    int N = 15;
    int r = 32157;
    int c = 32212;
    assertEquals(1072944050, zcurve.zValue(N, r, c));
  }

  @Test
  public void case9() {
    int N = 15;
    int r = 24224;
    int c = 2;
    assertEquals(581470212, zcurve.zValue(N, r, c));
  }

  @Test
  public void case10() {
    int N = 14;
    int r = 4095;
    int c = 4094;
    assertEquals(16777214, zcurve.zValue(N, r, c));
  }

  @Test
  public void case11() {
    int N = 13;
    int r = 4094;
    int c = 4095;
    assertEquals(16777213, zcurve.zValue(N, r, c));
  }

  @Test
  public void case12() {
    int N = 1;
    int r = 1;
    int c = 1;
    assertEquals(3, zcurve.zValue(N, r, c));
  }

  @Test
  public void case13() {
    int N = 1;
    int r = 1;
    int c = 0;
    assertEquals(2, zcurve.zValue(N, r, c));
  }

  @Test
  public void case14() {
    int N = 15;
    int r = 27207;
    int c = 2764;
    assertEquals(684486778, zcurve.zValue(N, r, c));
  }

  @Test
  public void case15() {
    int N = 15;
    int r = 2937;
    int c = 5651;
    assertEquals(27143047, zcurve.zValue(N, r, c));
  }

  @Test
  public void case16() {
    int N = 15;
    int r = 21630;
    int c = 16852;
    assertEquals(841055160, zcurve.zValue(N, r, c));
  }

  @Test
  public void case17() {
    int N = 15;
    int r = 4753;
    int c = 8866;
    assertEquals(101500422, zcurve.zValue(N, r, c));
  }

  @Test
  public void case18() {
    int N = 15;
    int r = 2764;
    int c = 24778;
    assertEquals(344518884, zcurve.zValue(N, r, c));
  }

  @Test
  public void case19() {
    int N = 15;
    int r = 15244;
    int c = 25405;
    assertEquals(512722417, zcurve.zValue(N, r, c));
  }

  @Test
  public void case20() {
    int N = 15;
    int r = 7971;
    int c = 32445;
    assertEquals(402541915, zcurve.zValue(N, r, c));
  }

  @Test
  public void case21() {
    int N = 7;
    int r = 37;
    int c = 110;
    assertEquals(7286, zcurve.zValue(N, r, c));
  }

  @Test
  public void case22() {
    int N = 15;
    int r = 7613;
    int c = 16885;
    assertEquals(312729523, zcurve.zValue(N, r, c));
  }

  @Test
  public void case23() {
    int N = 14;
    int r = 6185;
    int c = 13535;
    assertEquals(126900695, zcurve.zValue(N, r, c));
  }

  @Test
  public void case24() {
    int N = 15;
    int r = 4990;
    int c = 19020;
    assertEquals(307116792, zcurve.zValue(N, r, c));
  }

  @Test
  public void case25() {
    int N = 11;
    int r = 1456;
    int c = 35;
    assertEquals(2264581, zcurve.zValue(N, r, c));
  }

  @Test
  public void case26() {
    int N = 3;
    int r = 6;
    int c = 0;
    assertEquals(40, zcurve.zValue(N, r, c));
  }

  @Test
  public void case27() {
    int N = 15;
    int r = 454;
    int c = 17476;
    assertEquals(269660216, zcurve.zValue(N, r, c));
  }

  @Test
  public void case28() {
    int N = 15;
    int r = 21909;
    int c = 26593;
    assertEquals(909628963, zcurve.zValue(N, r, c));
  }

  @Test
  public void case29() {
    int N = 15;
    int r = 32119;
    int c = 29;
    assertEquals(715271035, zcurve.zValue(N, r, c));
  }

  @Test
  public void case30() {
    int N = 15;
    int r = 15101;
    int c = 19012;
    assertEquals(449624754, zcurve.zValue(N, r, c));
  }

  @Test
  public void case31() {
    int N = 15;
    int r = 29819;
    int c = 3285;
    assertEquals(712014747, zcurve.zValue(N, r, c));
  }

  @Test
  public void case32() {
    int N = 10;
    int r = 619;
    int c = 226;
    assertEquals(556174, zcurve.zValue(N, r, c));
  }

  @Test
  public void case33() {
    int N = 11;
    int r = 1522;
    int c = 1836;
    assertEquals(3649112, zcurve.zValue(N, r, c));
  }

  @Test
  public void case34() {
    int N = 15;
    int r = 4266;
    int c = 7215;
    assertEquals(55610589, zcurve.zValue(N, r, c));
  }

  @Test
  public void case35() {
    int N = 15;
    int r = 23791;
    int c = 32081;
    assertEquals(938588587, zcurve.zValue(N, r, c));
  }

  @Test
  public void case36() {
    int N = 15;
    int r = 28445;
    int c = 12136;
    assertEquals(754915042, zcurve.zValue(N, r, c));
  }

  @Test
  public void case37() {
    int N = 15;
    int r = 24527;
    int c = 23664;
    assertEquals(872068522, zcurve.zValue(N, r, c));
  }

  @Test
  public void case38() {
    int N = 3;
    int r = 6;
    int c = 5;
    assertEquals(57, zcurve.zValue(N, r, c));
  }

  @Test
  public void case39() {
    int N = 15;
    int r = 11903;
    int c = 25932;
    assertEquals(481901306, zcurve.zValue(N, r, c));
  }

  @Test
  public void case40() {
    int N = 8;
    int r = 63;
    int c = 37;
    assertEquals(3771, zcurve.zValue(N, r, c));
  }

  @Test
  public void case41() {
    int N = 3;
    int r = 7;
    int c = 1;
    assertEquals(43, zcurve.zValue(N, r, c));
  }

  @Test
  public void case42() {
    int N = 2;
    int r = 2;
    int c = 1;
    assertEquals(9, zcurve.zValue(N, r, c));
  }

  @Test
  public void case43() {
    int N = 7;
    int r = 48;
    int c = 105;
    assertEquals(7745, zcurve.zValue(N, r, c));
  }

  @Test
  public void case44() {
    int N = 15;
    int r = 26488;
    int c = 29080;
    assertEquals(1026255808, zcurve.zValue(N, r, c));
  }

  @Test
  public void case45() {
    int N = 2;
    int r = 0;
    int c = 1;
    assertEquals(1, zcurve.zValue(N, r, c));
  }

  @Test
  public void case46() {
    int N = 15;
    int r = 19354;
    int c = 25111;
    assertEquals(881755037, zcurve.zValue(N, r, c));
  }

  @Test
  public void case47() {
    int N = 6;
    int r = 23;
    int c = 27;
    assertEquals(879, zcurve.zValue(N, r, c));
  }

  @Test
  public void case48() {
    int N = 15;
    int r = 1371;
    int c = 13940;
    assertEquals(87439258, zcurve.zValue(N, r, c));
  }

  @Test
  public void case49() {
    int N = 11;
    int r = 18;
    int c = 326;
    assertEquals(70172, zcurve.zValue(N, r, c));
  }

  @Test
  public void case50() {
    int N = 15;
    int r = 22834;
    int c = 26276;
    assertEquals(915820056, zcurve.zValue(N, r, c));
  }

  @Test
  public void case51() {
    int N = 7;
    int r = 6;
    int c = 25;
    assertEquals(361, zcurve.zValue(N, r, c));
  }

  @Test
  public void case52() {
    int N = 14;
    int r = 15752;
    int c = 4428;
    assertEquals(195268816, zcurve.zValue(N, r, c));
  }

  @Test
  public void case53() {
    int N = 11;
    int r = 1701;
    int c = 443;
    assertEquals(2739559, zcurve.zValue(N, r, c));
  }

  @Test
  public void case54() {
    int N = 14;
    int r = 480;
    int c = 16350;
    assertEquals(89651540, zcurve.zValue(N, r, c));
  }

  @Test
  public void case55() {
    int N = 8;
    int r = 57;
    int c = 224;
    assertEquals(24194, zcurve.zValue(N, r, c));
  }

  @Test
  public void case56() {
    int N = 15;
    int r = 32515;
    int c = 21379;
    assertEquals(1001340943, zcurve.zValue(N, r, c));
  }

  @Test
  public void case57() {
    int N = 15;
    int r = 18091;
    int c = 6438;
    assertEquals(560565406, zcurve.zValue(N, r, c));
  }

  @Test
  public void case58() {
    int N = 15;
    int r = 4252;
    int c = 14801;
    assertEquals(121754529, zcurve.zValue(N, r, c));
  }

  @Test
  public void case59() {
    int N = 15;
    int r = 29632;
    int c = 12398;
    assertEquals(789230676, zcurve.zValue(N, r, c));
  }

  @Test
  public void case60() {
    int N = 15;
    int r = 21204;
    int c = 22899;
    assertEquals(860469029, zcurve.zValue(N, r, c));
  }

  @Test
  public void case61() {
    int N = 15;
    int r = 21811;
    int c = 1926;
    assertEquals(574048798, zcurve.zValue(N, r, c));
  }

  @Test
  public void case62() {
    int N = 15;
    int r = 32452;
    int c = 1617;
    assertEquals(717009185, zcurve.zValue(N, r, c));
  }

  @Test
  public void case63() {
    int N = 3;
    int r = 7;
    int c = 4;
    assertEquals(58, zcurve.zValue(N, r, c));
  }

  @Test
  public void case64() {
    int N = 15;
    int r = 22239;
    int c = 2524;
    assertEquals(577369082, zcurve.zValue(N, r, c));
  }

  @Test
  public void case65() {
    int N = 15;
    int r = 1757;
    int c = 23342;
    assertEquals(292398838, zcurve.zValue(N, r, c));
  }

  @Test
  public void case66() {
    int N = 15;
    int r = 28827;
    int c = 14213;
    assertEquals(789955227, zcurve.zValue(N, r, c));
  }

  @Test
  public void case67() {
    int N = 15;
    int r = 32260;
    int c = 22139;
    assertEquals(1002181989, zcurve.zValue(N, r, c));
  }

  @Test
  public void case68() {
    int N = 15;
    int r = 6917;
    int c = 28302;
    assertEquals(383664246, zcurve.zValue(N, r, c));
  }

  @Test
  public void case69() {
    int N = 15;
    int r = 32228;
    int c = 24222;
    assertEquals(1006037364, zcurve.zValue(N, r, c));
  }

  @Test
  public void case70() {
    int N = 15;
    int r = 14853;
    int c = 25011;
    assertEquals(512312615, zcurve.zValue(N, r, c));
  }

  @Test
  public void case71() {
    int N = 11;
    int r = 856;
    int c = 1683;
    assertEquals(1991557, zcurve.zValue(N, r, c));
  }

  @Test
  public void case72() {
    int N = 14;
    int r = 15483;
    int c = 4698;
    assertEquals(195312590, zcurve.zValue(N, r, c));
  }

  @Test
  public void case73() {
    int N = 15;
    int r = 1896;
    int c = 2208;
    assertEquals(6974592, zcurve.zValue(N, r, c));
  }

  @Test
  public void case74() {
    int N = 15;
    int r = 26495;
    int c = 12365;
    assertEquals(757742331, zcurve.zValue(N, r, c));
  }

  @Test
  public void case75() {
    int N = 15;
    int r = 18377;
    int c = 13400;
    assertEquals(624603586, zcurve.zValue(N, r, c));
  }

  @Test
  public void case76() {
    int N = 3;
    int r = 1;
    int c = 5;
    assertEquals(19, zcurve.zValue(N, r, c));
  }

  @Test
  public void case77() {
    int N = 12;
    int r = 1024;
    int c = 679;
    assertEquals(2376725, zcurve.zValue(N, r, c));
  }

  @Test
  public void case78() {
    int N = 15;
    int r = 32767;
    int c = 32767;
    assertEquals(1073741823, zcurve.zValue(N, r, c));
  }

  @Test
  public void case79() {
    int N = 1;
    int r = 0;
    int c = 0;
    assertEquals(0, zcurve.zValue(N, r, c));
  }

  @Test
  public void case80() {
    int N = 3;
    int r = 7;
    int c = 7;
    assertEquals(63, zcurve.zValue(N, r, c));
  }

  @Test
  public void case81() {
    int N = 10;
    int r = 511;
    int c = 511;
    assertEquals(262143, zcurve.zValue(N, r, c));
  }

  @Test
  public void case82() {
    int N = 15;
    int r = 32766;
    int c = 32767;
    assertEquals(1073741821, zcurve.zValue(N, r, c));
  }

  @Test
  public void case83() {
    int N = 8;
    int r = 13;
    int c = 7;
    assertEquals(183, zcurve.zValue(N, r, c));
  }

  @Test
  public void case84() {
    int N = 10;
    int r = 512;
    int c = 512;
    assertEquals(786432, zcurve.zValue(N, r, c));
  }

  @Test
  public void case85() {
    int N = 15;
    int r = 32767;
    int c = 32767;
    assertEquals(1073741823, zcurve.zValue(N, r, c));
  }

  @Test
  public void case86() {
    int N = 15;
    int r = 15;
    int c = 32767;
    assertEquals(357914111, zcurve.zValue(N, r, c));
  }

  @Test
  public void case87() {
    int N = 13;
    int r = 213;
    int c = 17;
    assertEquals(41763, zcurve.zValue(N, r, c));
  }

  @Test
  public void case88() {
    int N = 15;
    int r = 32719;
    int c = 32719;
    assertEquals(1073737983, zcurve.zValue(N, r, c));
  }

  @Test
  public void case89() {
    int N = 15;
    int r = 16;
    int c = 7;
    assertEquals(533, zcurve.zValue(N, r, c));
  }

  @Test
  public void case90() {
    int N = 15;
    int r = 31581;
    int c = 31581;
    assertEquals(1070543859, zcurve.zValue(N, r, c));
  }

  @Test
  public void case91() {
    int N = 2;
    int r = 0;
    int c = 2;
    assertEquals(4, zcurve.zValue(N, r, c));
  }

  @Test
  public void case92() {
    int N = 6;
    int r = 8;
    int c = 9;
    assertEquals(193, zcurve.zValue(N, r, c));
  }

  @Test
  public void case93() {
    int N = 3;
    int r = 5;
    int c = 6;
    assertEquals(54, zcurve.zValue(N, r, c));
  }

  @Test
  public void case94() {
    int N = 15;
    int r = 32761;
    int c = 32651;
    assertEquals(1073736391, zcurve.zValue(N, r, c));
  }

  @Test
  public void case95() {
    int N = 1;
    int r = 1;
    int c = 0;
    assertEquals(2, zcurve.zValue(N, r, c));
  }

  @Test
  public void case96() {
    int N = 13;
    int r = 20;
    int c = 25;
    assertEquals(865, zcurve.zValue(N, r, c));
  }

  @Test
  public void case97() {
    int N = 15;
    int r = 32767;
    int c = 32765;
    assertEquals(1073741819, zcurve.zValue(N, r, c));
  }

  @Test
  public void case98() {
    int N = 1;
    int r = 1;
    int c = 1;
    assertEquals(3, zcurve.zValue(N, r, c));
  }

  @Test
  public void case99() {
    int N = 15;
    int r = 30000;
    int c = 30000;
    assertEquals(1060310784, zcurve.zValue(N, r, c));
  }

  @Test
  public void case100() {
    int N = 2;
    int r = 0;
    int c = 3;
    assertEquals(5, zcurve.zValue(N, r, c));
  }

  @Test
  public void case101() {
    int N = 2;
    int r = 1;
    int c = 0;
    assertEquals(2, zcurve.zValue(N, r, c));
  }

  @Test
  public void case102() {
    int N = 2;
    int r = 2;
    int c = 3;
    assertEquals(13, zcurve.zValue(N, r, c));
  }

}
