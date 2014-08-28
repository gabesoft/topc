package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PowerOfThreeTest {
  PowerOfThree powerofthree = new PowerOfThree();

  @Test
  public void case1() {
    int x = 1;
    int y = 3;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case2() {
    int x = 0;
    int y = 2;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case3() {
    int x = 1;
    int y = 1;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case4() {
    int x = -6890;
    int y = 18252;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case5() {
    int x = 1000000000;
    int y = -1000000000;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case6() {
    int x = 0;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case7() {
    int x = 3;
    int y = 0;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case8() {
    int x = 1;
    int y = 9;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case9() {
    int x = -33520;
    int y = 30281;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case10() {
    int x = 760;
    int y = -427;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case11() {
    int x = -2587;
    int y = 2543;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case12() {
    int x = 8183;
    int y = 31;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case13() {
    int x = 21466;
    int y = -6546;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case14() {
    int x = 1;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case15() {
    int x = 4939786;
    int y = -2071240;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case16() {
    int x = 730;
    int y = 11244;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case17() {
    int x = -390;
    int y = -674;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case18() {
    int x = 45006978;
    int y = 16259019;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case19() {
    int x = -834;
    int y = -2423;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case20() {
    int x = -4;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case21() {
    int x = -49655226;
    int y = -12849144;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case22() {
    int x = -6517694;
    int y = -2103845;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case23() {
    int x = 82;
    int y = 39;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case24() {
    int x = 9;
    int y = -31;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case25() {
    int x = -894;
    int y = 6;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case26() {
    int x = -1;
    int y = -933;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case27() {
    int x = -834;
    int y = 240;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case28() {
    int x = -1406;
    int y = -8038;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case29() {
    int x = 0;
    int y = -1;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case30() {
    int x = 4832;
    int y = 87;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case31() {
    int x = 4510;
    int y = 38643;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case32() {
    int x = 4251560;
    int y = -1328643;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case33() {
    int x = -62947067;
    int y = 4335075;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case34() {
    int x = 12876795;
    int y = 469243533;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case35() {
    int x = 164789;
    int y = -732549;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case36() {
    int x = -570240;
    int y = 1412834;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case37() {
    int x = -252;
    int y = 112;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case38() {
    int x = 51319;
    int y = 19761;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case39() {
    int x = -52826416;
    int y = -126980578;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case40() {
    int x = -3995580;
    int y = -1602089;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case41() {
    int x = -40;
    int y = -81;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case42() {
    int x = 1191;
    int y = -4911;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case43() {
    int x = 125349;
    int y = -22193;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case44() {
    int x = -583503;
    int y = 1439320;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case45() {
    int x = -101353;
    int y = -1356932;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case46() {
    int x = 13;
    int y = 108;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case47() {
    int x = 68;
    int y = 142;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case48() {
    int x = -26620323;
    int y = -124180206;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case49() {
    int x = -31184;
    int y = -354255;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case50() {
    int x = 26890;
    int y = -2493;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case51() {
    int x = 5;
    int y = 3;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case52() {
    int x = -14965663;
    int y = 16183026;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case53() {
    int x = -4;
    int y = 99;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case54() {
    int x = -3;
    int y = -1;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case55() {
    int x = -56095;
    int y = -44258;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case56() {
    int x = 18179884;
    int y = -43068358;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case57() {
    int x = 13;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case58() {
    int x = 37;
    int y = -208;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case59() {
    int x = -4428786;
    int y = -1630042;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case60() {
    int x = 3;
    int y = 1;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case61() {
    int x = -96146127;
    int y = -1769193;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case62() {
    int x = -1;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case63() {
    int x = -20328064;
    int y = 39278281;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case64() {
    int x = -80875;
    int y = -7044;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case65() {
    int x = 6453849;
    int y = -201246700;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case66() {
    int x = -4868873;
    int y = -887682;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case67() {
    int x = 17985;
    int y = 5957452;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case68() {
    int x = 0;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case69() {
    int x = -2713314;
    int y = 190426;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case70() {
    int x = 600;
    int y = 2555;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case71() {
    int x = 423;
    int y = 201;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case72() {
    int x = 26;
    int y = 93;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case73() {
    int x = -1370;
    int y = 2934;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case74() {
    int x = -7417542;
    int y = 86217941;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case75() {
    int x = -714;
    int y = -352;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case76() {
    int x = 1;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case77() {
    int x = 8157;
    int y = -8;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case78() {
    int x = -345246858;
    int y = -109951550;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case79() {
    int x = 27;
    int y = -68;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case80() {
    int x = 894539;
    int y = 419814;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case81() {
    int x = -171387;
    int y = -489722;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case82() {
    int x = -9081;
    int y = -38612;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case83() {
    int x = -228;
    int y = -773;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case84() {
    int x = -57134074;
    int y = -131729989;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case85() {
    int x = -109745;
    int y = 7952;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case86() {
    int x = 0;
    int y = 1;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case87() {
    int x = 192788;
    int y = 589629;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case88() {
    int x = -49826925;
    int y = -14348830;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case89() {
    int x = -21465;
    int y = -6595;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case90() {
    int x = -288049;
    int y = -1423705;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case91() {
    int x = 43268500;
    int y = -7440135;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case92() {
    int x = -9;
    int y = -2;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case93() {
    int x = 73;
    int y = 70932;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case94() {
    int x = 643132;
    int y = 551654013;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case95() {
    int x = -3372;
    int y = -1271;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case96() {
    int x = 2090;
    int y = -3233;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case97() {
    int x = 0;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case98() {
    int x = 27102038;
    int y = 4461291;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case99() {
    int x = 2617;
    int y = -668;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case100() {
    int x = -37;
    int y = 84;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case101() {
    int x = -598225;
    int y = -1401267;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case102() {
    int x = 700;
    int y = -557;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case103() {
    int x = -45814759;
    int y = 50118349;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case104() {
    int x = 0;
    int y = 1;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case105() {
    int x = 243714;
    int y = -20145890;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case106() {
    int x = -26060921;
    int y = 4152856;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case107() {
    int x = 387420285;
    int y = 4;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case108() {
    int x = 176795652;
    int y = 375112369;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case109() {
    int x = -774840978;
    int y = 193710244;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case110() {
    int x = 581130734;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case111() {
    int x = 2;
    int y = 2;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case112() {
    int x = -581130726;
    int y = 1;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case113() {
    int x = 774840978;
    int y = -193710244;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case114() {
    int x = 0;
    int y = 4;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case115() {
    int x = 186909767;
    int y = 781285137;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case116() {
    int x = -581130734;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case117() {
    int x = 5;
    int y = 8;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case118() {
    int x = 6;
    int y = 7;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case119() {
    int x = 193710244;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case120() {
    int x = 797161;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case121() {
    int x = 4;
    int y = -5;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case122() {
    int x = 3;
    int y = -3;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case123() {
    int x = -581130733;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case124() {
    int x = 21523360;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case125() {
    int x = -6890;
    int y = -18252;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case126() {
    int x = 1041;
    int y = 9467;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case127() {
    int x = 4;
    int y = 7;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case128() {
    int x = 4;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case129() {
    int x = 9565938;
    int y = -3456554;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case130() {
    int x = -1;
    int y = -3;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case131() {
    int x = 20076739;
    int y = 301299120;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case132() {
    int x = 0;
    int y = -581130733;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case133() {
    int x = 0;
    int y = 871696100;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case134() {
    int x = 8;
    int y = 3;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case135() {
    int x = 2;
    int y = 1;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case136() {
    int x = 19684;
    int y = 19686;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case137() {
    int x = 6;
    int y = 28;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case138() {
    int x = 535869684;
    int y = 45261049;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case139() {
    int x = -4;
    int y = -9;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case140() {
    int x = 4902;
    int y = 1153;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case141() {
    int x = 3;
    int y = 10;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case142() {
    int x = -797162;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case143() {
    int x = 26;
    int y = 6;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case144() {
    int x = 1000000000;
    int y = 162261467;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case145() {
    int x = 25;
    int y = 18;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case146() {
    int x = -21523361;
    int y = 0;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case147() {
    int x = 238;
    int y = 621;
    assertEquals("Possible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case148() {
    int x = 4;
    int y = -3;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case149() {
    int x = 9;
    int y = 0;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case150() {
    int x = 1;
    int y = 93;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

  @Test
  public void case151() {
    int x = 387420489;
    int y = 0;
    assertEquals("Impossible", powerofthree.ableToGet(x, y));
  }

}
