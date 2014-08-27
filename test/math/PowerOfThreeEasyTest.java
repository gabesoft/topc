package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PowerOfThreeEasyTest {
  PowerOfThreeEasy powerofthreeeasy = new PowerOfThreeEasy();

  @Test
  public void case1() {
    int x = 1;
    int y = 3;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case2() {
    int x = 1;
    int y = 1;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case3() {
    int x = 3;
    int y = 0;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case4() {
    int x = 1;
    int y = 9;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case5() {
    int x = 3;
    int y = 10;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case6() {
    int x = 1093;
    int y = 2187;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case7() {
    int x = 0;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case8() {
    int x = 52488;
    int y = 0;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case9() {
    int x = 9508;
    int y = 333;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case10() {
    int x = 17086670;
    int y = 505369367;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case11() {
    int x = 9448642;
    int y = 8581603;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case12() {
    int x = 88573;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case13() {
    int x = 665691;
    int y = 199775;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case14() {
    int x = 538002;
    int y = 64032079;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case15() {
    int x = 52398675;
    int y = 20141964;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case16() {
    int x = 42922;
    int y = 55201;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case17() {
    int x = 7108;
    int y = 953997;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case18() {
    int x = 176853;
    int y = 230858993;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case19() {
    int x = 2322064;
    int y = 2485279;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case20() {
    int x = 1459610;
    int y = 2150042;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case21() {
    int x = 3;
    int y = 1;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case22() {
    int x = 432061804;
    int y = 149068929;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case23() {
    int x = 0;
    int y = 1;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case24() {
    int x = 4035398;
    int y = 21270885;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case25() {
    int x = 9828;
    int y = 255892;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case26() {
    int x = 738;
    int y = 87835;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case27() {
    int x = 36;
    int y = 4;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case28() {
    int x = 4;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case29() {
    int x = 50030626;
    int y = 143685443;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case30() {
    int x = 206124;
    int y = 7686939;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case31() {
    int x = 1;
    int y = 3;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case32() {
    int x = 22410820;
    int y = 43109240;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case33() {
    int x = 355;
    int y = 738;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case34() {
    int x = 192352;
    int y = 34027896;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case35() {
    int x = 0;
    int y = 13;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case36() {
    int x = 7367001;
    int y = 188194845;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case37() {
    int x = 27;
    int y = 1066;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case38() {
    int x = 192189;
    int y = 712760;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case39() {
    int x = 15965208;
    int y = 48604873;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case40() {
    int x = 2423891;
    int y = 4872837;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case41() {
    int x = 5393879;
    int y = 15580300;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case42() {
    int x = 6583936;
    int y = 590517;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case43() {
    int x = 3280;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case44() {
    int x = 13;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case45() {
    int x = 117;
    int y = 4;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case46() {
    int x = 3280;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case47() {
    int x = 3159;
    int y = 6682;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case48() {
    int x = 846;
    int y = 2434;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case49() {
    int x = 20926039;
    int y = 597321;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case50() {
    int x = 265711;
    int y = 9;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case51() {
    int x = 193710001;
    int y = 243;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case52() {
    int x = 81976;
    int y = 6597;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case53() {
    int x = 9450997;
    int y = 589525692;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case54() {
    int x = 118;
    int y = 246;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case55() {
    int x = 124459666;
    int y = 450131189;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case56() {
    int x = 88573;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case57() {
    int x = 0;
    int y = 121;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case58() {
    int x = 252295;
    int y = 2704;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case59() {
    int x = 1;
    int y = 120;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case60() {
    int x = 364;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case61() {
    int x = 46994;
    int y = 2367035;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case62() {
    int x = 0;
    int y = 3280;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case63() {
    int x = 3;
    int y = 1;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case64() {
    int x = 1682083;
    int y = 709401;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case65() {
    int x = 4984436;
    int y = 67774353;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case66() {
    int x = 21267202;
    int y = 256158;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case67() {
    int x = 6994273;
    int y = 180180;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case68() {
    int x = 78744;
    int y = 9829;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case69() {
    int x = 8658027;
    int y = 96564;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case70() {
    int x = 43837312;
    int y = 149872932;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case71() {
    int x = 600331;
    int y = 196830;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case72() {
    int x = 10058;
    int y = 931;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case73() {
    int x = 0;
    int y = 40;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case74() {
    int x = 26253;
    int y = 3271;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case75() {
    int x = 3270;
    int y = 10;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case76() {
    int x = 49484483;
    int y = 14301016;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case77() {
    int x = 90;
    int y = 29434;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case78() {
    int x = 0;
    int y = 13;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case79() {
    int x = 21523360;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case80() {
    int x = 0;
    int y = 121;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case81() {
    int x = 0;
    int y = 121;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case82() {
    int x = 797161;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case83() {
    int x = 121;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case84() {
    int x = 1;
    int y = 29523;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case85() {
    int x = 31;
    int y = 9;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case86() {
    int x = 3253;
    int y = 27;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case87() {
    int x = 6991862;
    int y = 65909122;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case88() {
    int x = 60024;
    int y = 2331460;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case89() {
    int x = 531441;
    int y = 265720;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case90() {
    int x = 97918;
    int y = 9374934;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case91() {
    int x = 1;
    int y = 3;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case92() {
    int x = 9027;
    int y = 814;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case93() {
    int x = 16542721;
    int y = 5967553;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case94() {
    int x = 1;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case95() {
    int x = 0;
    int y = 121;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case96() {
    int x = 39;
    int y = 1;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case97() {
    int x = 88573;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case98() {
    int x = 647608;
    int y = 70169;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case99() {
    int x = 14245;
    int y = 198503;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case100() {
    int x = 0;
    int y = 1;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case101() {
    int x = 892732;
    int y = 318713;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case102() {
    int x = 75120;
    int y = 322819;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case103() {
    int x = 243;
    int y = 850;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case104() {
    int x = 28783;
    int y = 741;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case105() {
    int x = 29524;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case106() {
    int x = 19336998;
    int y = 44243038;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case107() {
    int x = 184519;
    int y = 64385562;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case108() {
    int x = 389034504;
    int y = 192096229;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case109() {
    int x = 1000000000;
    int y = 1000000000;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case110() {
    int x = 7174451;
    int y = 2;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case111() {
    int x = 1193;
    int y = 2087;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case112() {
    int x = 2;
    int y = 2;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case113() {
    int x = 6;
    int y = 7;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case114() {
    int x = 2;
    int y = 11;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case115() {
    int x = 7174453;
    int y = 0;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case116() {
    int x = 7;
    int y = 6;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case117() {
    int x = 581130732;
    int y = 1;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case118() {
    int x = 5;
    int y = 8;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case119() {
    int x = 999999999;
    int y = 999999999;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case120() {
    int x = 4;
    int y = 90;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case121() {
    int x = 193710244;
    int y = 387420489;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case122() {
    int x = 0;
    int y = 4;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case123() {
    int x = 41;
    int y = 80;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case124() {
    int x = 8;
    int y = 5;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case125() {
    int x = 24;
    int y = 16;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case126() {
    int x = 68070;
    int y = 820;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case127() {
    int x = 5;
    int y = 35;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case128() {
    int x = 20;
    int y = 20;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case129() {
    int x = 1000000000;
    int y = 333333333;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case130() {
    int x = 10;
    int y = 30;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case131() {
    int x = 3;
    int y = 13;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case132() {
    int x = 3;
    int y = 2;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case133() {
    int x = 6914;
    int y = 2927;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case134() {
    int x = 11;
    int y = 2;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case135() {
    int x = 38;
    int y = 2;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case136() {
    int x = 1;
    int y = 2;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case137() {
    int x = 1091;
    int y = 2189;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case138() {
    int x = 2;
    int y = 3;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case139() {
    int x = 5;
    int y = 7;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case140() {
    int x = 27;
    int y = 81;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case141() {
    int x = 3;
    int y = 3;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case142() {
    int x = 145282683;
    int y = 48427561;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case143() {
    int x = 0;
    int y = 2;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case144() {
    int x = 2;
    int y = 4;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case145() {
    int x = 1;
    int y = 39;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case146() {
    int x = 2;
    int y = 0;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case147() {
    int x = 2;
    int y = 38;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case148() {
    int x = 1000000000;
    int y = 100;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case149() {
    int x = 29;
    int y = 11;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case150() {
    int x = 145282684;
    int y = 435848049;
    assertEquals("Possible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case151() {
    int x = 12;
    int y = 19;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case152() {
    int x = 871696100;
    int y = 871696100;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case153() {
    int x = 11;
    int y = 29;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case154() {
    int x = 13;
    int y = 13;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

  @Test
  public void case155() {
    int x = 387420489;
    int y = 774840977;
    assertEquals("Impossible", powerofthreeeasy.ableToGet(x, y));
  }

}
