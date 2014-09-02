package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class FoxAndFencingEasyTest {
  FoxAndFencingEasy foxandfencingeasy = new FoxAndFencingEasy();

  @Test
  public void case1() {
    int mov1 = 1;
    int mov2 = 58;
    int d = 1;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case2() {
    int mov1 = 100;
    int mov2 = 100;
    int d = 100000000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case3() {
    int mov1 = 100;
    int mov2 = 150;
    int d = 100000000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case4() {
    int mov1 = 100;
    int mov2 = 250;
    int d = 100000000;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case5() {
    int mov1 = 1;
    int mov2 = 1;
    int d = 1;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case6() {
    int mov1 = 6912;
    int mov2 = 382;
    int d = 7102;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case7() {
    int mov1 = 673;
    int mov2 = 714;
    int d = 763;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case8() {
    int mov1 = 665;
    int mov2 = 302;
    int d = 521;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case9() {
    int mov1 = 31001290;
    int mov2 = 66651023;
    int d = 62417087;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case10() {
    int mov1 = 7906327;
    int mov2 = 9600795;
    int d = 7865772;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case11() {
    int mov1 = 2799;
    int mov2 = 5788;
    int d = 9246;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case12() {
    int mov1 = 6;
    int mov2 = 75;
    int d = 52;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case13() {
    int mov1 = 619588;
    int mov2 = 4666648;
    int d = 3918070;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case14() {
    int mov1 = 787853;
    int mov2 = 284237;
    int d = 257571;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case15() {
    int mov1 = 9891802;
    int mov2 = 9906576;
    int d = 8582171;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case16() {
    int mov1 = 66934763;
    int mov2 = 24311234;
    int d = 71026769;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case17() {
    int mov1 = 8271072;
    int mov2 = 8044771;
    int d = 8471474;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case18() {
    int mov1 = 30389414;
    int mov2 = 7490779;
    int d = 86885905;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case19() {
    int mov1 = 6783236;
    int mov2 = 7659495;
    int d = 6339277;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case20() {
    int mov1 = 547;
    int mov2 = 165;
    int d = 866;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case21() {
    int mov1 = 9417;
    int mov2 = 8247;
    int d = 9690;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case22() {
    int mov1 = 31;
    int mov2 = 61;
    int d = 85;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case23() {
    int mov1 = 28056;
    int mov2 = 78061;
    int d = 32834;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case24() {
    int mov1 = 6316533;
    int mov2 = 1432886;
    int d = 8813942;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case25() {
    int mov1 = 4123;
    int mov2 = 5237;
    int d = 7864;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case26() {
    int mov1 = 6402021;
    int mov2 = 2913452;
    int d = 9546584;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case27() {
    int mov1 = 796;
    int mov2 = 776;
    int d = 922;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case28() {
    int mov1 = 3063;
    int mov2 = 6911;
    int d = 5139;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case29() {
    int mov1 = 20120;
    int mov2 = 49893;
    int d = 27599;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case30() {
    int mov1 = 7250;
    int mov2 = 60992;
    int d = 23639;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case31() {
    int mov1 = 467520;
    int mov2 = 99814;
    int d = 704175;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case32() {
    int mov1 = 159;
    int mov2 = 460;
    int d = 974;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case33() {
    int mov1 = 8789;
    int mov2 = 93496;
    int d = 72077;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case34() {
    int mov1 = 7452951;
    int mov2 = 2384959;
    int d = 8114205;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case35() {
    int mov1 = 973;
    int mov2 = 916;
    int d = 890;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case36() {
    int mov1 = 98672108;
    int mov2 = 59569739;
    int d = 61685070;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case37() {
    int mov1 = 38531609;
    int mov2 = 94456707;
    int d = 16482006;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case38() {
    int mov1 = 47;
    int mov2 = 76;
    int d = 63;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case39() {
    int mov1 = 94802017;
    int mov2 = 47371459;
    int d = 21676522;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case40() {
    int mov1 = 2680;
    int mov2 = 6063;
    int d = 5694;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case41() {
    int mov1 = 34343;
    int mov2 = 81453;
    int d = 96896;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case42() {
    int mov1 = 859;
    int mov2 = 707;
    int d = 337;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case43() {
    int mov1 = 912532;
    int mov2 = 990816;
    int d = 901505;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case44() {
    int mov1 = 17175355;
    int mov2 = 39259007;
    int d = 37230651;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case45() {
    int mov1 = 70518022;
    int mov2 = 38057763;
    int d = 26372038;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case46() {
    int mov1 = 16176025;
    int mov2 = 6136064;
    int d = 23310842;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case47() {
    int mov1 = 773475;
    int mov2 = 685425;
    int d = 980229;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case48() {
    int mov1 = 18352;
    int mov2 = 55678;
    int d = 64958;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case49() {
    int mov1 = 2685;
    int mov2 = 1800;
    int d = 7007;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case50() {
    int mov1 = 86040;
    int mov2 = 74513;
    int d = 92481;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case51() {
    int mov1 = 86;
    int mov2 = 58;
    int d = 66;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case52() {
    int mov1 = 220183;
    int mov2 = 768567;
    int d = 764267;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case53() {
    int mov1 = 96;
    int mov2 = 92;
    int d = 82;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case54() {
    int mov1 = 2585126;
    int mov2 = 814257;
    int d = 8574705;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case55() {
    int mov1 = 52910596;
    int mov2 = 61282048;
    int d = 92011282;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case56() {
    int mov1 = 4192;
    int mov2 = 6687;
    int d = 4776;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case57() {
    int mov1 = 69;
    int mov2 = 72;
    int d = 91;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case58() {
    int mov1 = 386;
    int mov2 = 859;
    int d = 248;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case59() {
    int mov1 = 2359;
    int mov2 = 5816;
    int d = 2734;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case60() {
    int mov1 = 317171;
    int mov2 = 108363;
    int d = 431360;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case61() {
    int mov1 = 9767;
    int mov2 = 9730;
    int d = 9081;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case62() {
    int mov1 = 762677;
    int mov2 = 294704;
    int d = 653054;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case63() {
    int mov1 = 838102;
    int mov2 = 273226;
    int d = 529509;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case64() {
    int mov1 = 891475;
    int mov2 = 887790;
    int d = 566391;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case65() {
    int mov1 = 97;
    int mov2 = 71;
    int d = 75;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case66() {
    int mov1 = 984;
    int mov2 = 1000;
    int d = 996;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case67() {
    int mov1 = 7138211;
    int mov2 = 508633;
    int d = 9600264;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case68() {
    int mov1 = 81866;
    int mov2 = 28731;
    int d = 40893;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case69() {
    int mov1 = 2617;
    int mov2 = 2957;
    int d = 4903;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case70() {
    int mov1 = 5294;
    int mov2 = 6149;
    int d = 9043;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case71() {
    int mov1 = 96;
    int mov2 = 96;
    int d = 99;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case72() {
    int mov1 = 9639;
    int mov2 = 7405;
    int d = 8308;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case73() {
    int mov1 = 19993688;
    int mov2 = 71366405;
    int d = 93453209;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case74() {
    int mov1 = 9101;
    int mov2 = 4922;
    int d = 8500;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case75() {
    int mov1 = 750401;
    int mov2 = 992496;
    int d = 737049;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case76() {
    int mov1 = 29522714;
    int mov2 = 94686507;
    int d = 18019107;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case77() {
    int mov1 = 3938376;
    int mov2 = 9581935;
    int d = 2967720;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case78() {
    int mov1 = 2825992;
    int mov2 = 342060;
    int d = 3336256;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case79() {
    int mov1 = 9852;
    int mov2 = 6868;
    int d = 9817;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case80() {
    int mov1 = 1361826;
    int mov2 = 7464581;
    int d = 9751369;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case81() {
    int mov1 = 823;
    int mov2 = 540;
    int d = 812;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case82() {
    int mov1 = 96136887;
    int mov2 = 16339523;
    int d = 72531107;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case83() {
    int mov1 = 54530;
    int mov2 = 57531;
    int d = 91528;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case84() {
    int mov1 = 3595041;
    int mov2 = 7922604;
    int d = 3311169;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case85() {
    int mov1 = 980;
    int mov2 = 928;
    int d = 809;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case86() {
    int mov1 = 6983;
    int mov2 = 6917;
    int d = 5108;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case87() {
    int mov1 = 253;
    int mov2 = 223;
    int d = 87;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case88() {
    int mov1 = 79187;
    int mov2 = 10856;
    int d = 47228;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case89() {
    int mov1 = 3973049;
    int mov2 = 5677681;
    int d = 5229895;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case90() {
    int mov1 = 30384231;
    int mov2 = 15880950;
    int d = 69390113;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case91() {
    int mov1 = 1983027;
    int mov2 = 8743062;
    int d = 5430567;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case92() {
    int mov1 = 9038426;
    int mov2 = 3459103;
    int d = 7702428;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case93() {
    int mov1 = 74;
    int mov2 = 26;
    int d = 95;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case94() {
    int mov1 = 93453;
    int mov2 = 89485;
    int d = 93231;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case95() {
    int mov1 = 965;
    int mov2 = 946;
    int d = 843;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case96() {
    int mov1 = 15673206;
    int mov2 = 85905623;
    int d = 4109589;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case97() {
    int mov1 = 47766;
    int mov2 = 47791;
    int d = 99985;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case98() {
    int mov1 = 100;
    int mov2 = 51;
    int d = 90;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case99() {
    int mov1 = 792577;
    int mov2 = 978338;
    int d = 925288;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case100() {
    int mov1 = 9092915;
    int mov2 = 4494463;
    int d = 3701702;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case101() {
    int mov1 = 420;
    int mov2 = 474;
    int d = 979;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case102() {
    int mov1 = 18585;
    int mov2 = 94227;
    int d = 35867;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case103() {
    int mov1 = 39054;
    int mov2 = 84932;
    int d = 76345;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case104() {
    int mov1 = 998;
    int mov2 = 987;
    int d = 994;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case105() {
    int mov1 = 1486;
    int mov2 = 13246;
    int d = 74846;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case106() {
    int mov1 = 99;
    int mov2 = 100;
    int d = 100;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case107() {
    int mov1 = 37340;
    int mov2 = 74681;
    int d = 25967;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case108() {
    int mov1 = 44;
    int mov2 = 21;
    int d = 51;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case109() {
    int mov1 = 13;
    int mov2 = 25;
    int d = 34;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case110() {
    int mov1 = 37;
    int mov2 = 75;
    int d = 32;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case111() {
    int mov1 = 69;
    int mov2 = 34;
    int d = 73;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case112() {
    int mov1 = 97;
    int mov2 = 48;
    int d = 94;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case113() {
    int mov1 = 33;
    int mov2 = 67;
    int d = 82;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case114() {
    int mov1 = 26;
    int mov2 = 53;
    int d = 57;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case115() {
    int mov1 = 974;
    int mov2 = 971;
    int d = 975;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case116() {
    int mov1 = 93;
    int mov2 = 97;
    int d = 94;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case117() {
    int mov1 = 63;
    int mov2 = 29;
    int d = 64;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case118() {
    int mov1 = 31;
    int mov2 = 66;
    int d = 31;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case119() {
    int mov1 = 99;
    int mov2 = 35;
    int d = 100;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case120() {
    int mov1 = 46;
    int mov2 = 22;
    int d = 73;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case121() {
    int mov1 = 100;
    int mov2 = 99;
    int d = 100;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case122() {
    int mov1 = 100;
    int mov2 = 96;
    int d = 100;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case123() {
    int mov1 = 77;
    int mov2 = 78;
    int d = 78;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case124() {
    int mov1 = 441;
    int mov2 = 883;
    int d = 817;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case125() {
    int mov1 = 31;
    int mov2 = 81;
    int d = 31;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case126() {
    int mov1 = 37;
    int mov2 = 76;
    int d = 55;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case127() {
    int mov1 = 134;
    int mov2 = 270;
    int d = 707;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case128() {
    int mov1 = 72;
    int mov2 = 35;
    int d = 74;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case129() {
    int mov1 = 999;
    int mov2 = 998;
    int d = 999;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case130() {
    int mov1 = 87;
    int mov2 = 24;
    int d = 88;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case131() {
    int mov1 = 94;
    int mov2 = 100;
    int d = 95;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case132() {
    int mov1 = 38;
    int mov2 = 18;
    int d = 61;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case133() {
    int mov1 = 82;
    int mov2 = 27;
    int d = 82;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case134() {
    int mov1 = 32;
    int mov2 = 66;
    int d = 22;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case135() {
    int mov1 = 61;
    int mov2 = 25;
    int d = 62;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case136() {
    int mov1 = 48;
    int mov2 = 23;
    int d = 42;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case137() {
    int mov1 = 17;
    int mov2 = 39;
    int d = 18;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case138() {
    int mov1 = 9972;
    int mov2 = 9997;
    int d = 9972;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case139() {
    int mov1 = 100;
    int mov2 = 100;
    int d = 100;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case140() {
    int mov1 = 100;
    int mov2 = 100;
    int d = 100;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case141() {
    int mov1 = 977;
    int mov2 = 488;
    int d = 958;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case142() {
    int mov1 = 96;
    int mov2 = 95;
    int d = 97;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case143() {
    int mov1 = 688;
    int mov2 = 341;
    int d = 688;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case144() {
    int mov1 = 69;
    int mov2 = 51;
    int d = 69;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case145() {
    int mov1 = 98;
    int mov2 = 99;
    int d = 98;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case146() {
    int mov1 = 99;
    int mov2 = 100;
    int d = 99;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case147() {
    int mov1 = 79;
    int mov2 = 67;
    int d = 79;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case148() {
    int mov1 = 92;
    int mov2 = 29;
    int d = 92;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case149() {
    int mov1 = 35;
    int mov2 = 72;
    int d = 9;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case150() {
    int mov1 = 35;
    int mov2 = 71;
    int d = 35;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case151() {
    int mov1 = 99;
    int mov2 = 94;
    int d = 100;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case152() {
    int mov1 = 98;
    int mov2 = 48;
    int d = 89;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case153() {
    int mov1 = 41;
    int mov2 = 84;
    int d = 51;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case154() {
    int mov1 = 104;
    int mov2 = 423;
    int d = 104;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case155() {
    int mov1 = 96;
    int mov2 = 98;
    int d = 97;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case156() {
    int mov1 = 4;
    int mov2 = 2;
    int d = 100000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case157() {
    int mov1 = 150;
    int mov2 = 100;
    int d = 100000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case158() {
    int mov1 = 200;
    int mov2 = 100;
    int d = 1000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case159() {
    int mov1 = 50;
    int mov2 = 100;
    int d = 100000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case160() {
    int mov1 = 101;
    int mov2 = 101;
    int d = 50;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case161() {
    int mov1 = 6;
    int mov2 = 3;
    int d = 8;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case162() {
    int mov1 = 10;
    int mov2 = 10;
    int d = 5;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case163() {
    int mov1 = 100;
    int mov2 = 300;
    int d = 400;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case164() {
    int mov1 = 10;
    int mov2 = 20;
    int d = 100;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case165() {
    int mov1 = 250;
    int mov2 = 500;
    int d = 100000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case166() {
    int mov1 = 1;
    int mov2 = 2;
    int d = 4;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case167() {
    int mov1 = 2;
    int mov2 = 4;
    int d = 100;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case168() {
    int mov1 = 5;
    int mov2 = 4;
    int d = 9;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case169() {
    int mov1 = 50;
    int mov2 = 100;
    int d = 70;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case170() {
    int mov1 = 1;
    int mov2 = 2;
    int d = 100;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case171() {
    int mov1 = 100;
    int mov2 = 150;
    int d = 150;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case172() {
    int mov1 = 100;
    int mov2 = 200;
    int d = 300;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case173() {
    int mov1 = 11;
    int mov2 = 1;
    int d = 13;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case174() {
    int mov1 = 3;
    int mov2 = 3;
    int d = 2;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case175() {
    int mov1 = 1;
    int mov2 = 2;
    int d = 3;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case176() {
    int mov1 = 5;
    int mov2 = 5;
    int d = 2;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case177() {
    int mov1 = 150;
    int mov2 = 100;
    int d = 300;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case178() {
    int mov1 = 100;
    int mov2 = 200;
    int d = 100000000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case179() {
    int mov1 = 150;
    int mov2 = 100;
    int d = 100000000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case180() {
    int mov1 = 10;
    int mov2 = 15;
    int d = 11;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case181() {
    int mov1 = 3;
    int mov2 = 5;
    int d = 4;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case182() {
    int mov1 = 100;
    int mov2 = 200;
    int d = 10000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case183() {
    int mov1 = 10;
    int mov2 = 20;
    int d = 100000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case184() {
    int mov1 = 4;
    int mov2 = 6;
    int d = 5;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case185() {
    int mov1 = 200;
    int mov2 = 50;
    int d = 201;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case186() {
    int mov1 = 3;
    int mov2 = 6;
    int d = 17;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case187() {
    int mov1 = 7;
    int mov2 = 10;
    int d = 10;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case188() {
    int mov1 = 100;
    int mov2 = 201;
    int d = 101;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case189() {
    int mov1 = 2;
    int mov2 = 4;
    int d = 3;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case190() {
    int mov1 = 6;
    int mov2 = 10;
    int d = 10;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case191() {
    int mov1 = 8;
    int mov2 = 4;
    int d = 9;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case192() {
    int mov1 = 10000;
    int mov2 = 200000;
    int d = 1000005;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case193() {
    int mov1 = 2;
    int mov2 = 2;
    int d = 1;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case194() {
    int mov1 = 20;
    int mov2 = 10;
    int d = 1001;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case195() {
    int mov1 = 1;
    int mov2 = 2;
    int d = 5;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case196() {
    int mov1 = 5;
    int mov2 = 3;
    int d = 17;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case197() {
    int mov1 = 5;
    int mov2 = 2;
    int d = 100000;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case198() {
    int mov1 = 1;
    int mov2 = 1;
    int d = 100000000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case199() {
    int mov1 = 50;
    int mov2 = 100;
    int d = 51;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case200() {
    int mov1 = 1;
    int mov2 = 3;
    int d = 100;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case201() {
    int mov1 = 4;
    int mov2 = 2;
    int d = 5;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case202() {
    int mov1 = 4;
    int mov2 = 2;
    int d = 8;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case203() {
    int mov1 = 99;
    int mov2 = 101;
    int d = 100;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case204() {
    int mov1 = 99;
    int mov2 = 120;
    int d = 100;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case205() {
    int mov1 = 10;
    int mov2 = 15;
    int d = 14;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case206() {
    int mov1 = 100;
    int mov2 = 100;
    int d = 500;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case207() {
    int mov1 = 5;
    int mov2 = 10;
    int d = 10;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case208() {
    int mov1 = 100;
    int mov2 = 98;
    int d = 99;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case209() {
    int mov1 = 30;
    int mov2 = 29;
    int d = 1000000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case210() {
    int mov1 = 100;
    int mov2 = 100;
    int d = 2000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case211() {
    int mov1 = 100;
    int mov2 = 200;
    int d = 200;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case212() {
    int mov1 = 1;
    int mov2 = 3;
    int d = 4;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case213() {
    int mov1 = 10;
    int mov2 = 5;
    int d = 11;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case214() {
    int mov1 = 100;
    int mov2 = 150;
    int d = 900;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case215() {
    int mov1 = 9;
    int mov2 = 10;
    int d = 10;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case216() {
    int mov1 = 5;
    int mov2 = 6;
    int d = 1;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case217() {
    int mov1 = 200;
    int mov2 = 150;
    int d = 100000000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case218() {
    int mov1 = 100;
    int mov2 = 200;
    int d = 1000000;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case219() {
    int mov1 = 10;
    int mov2 = 10;
    int d = 1;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case220() {
    int mov1 = 201;
    int mov2 = 100;
    int d = 300;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case221() {
    int mov1 = 50;
    int mov2 = 100;
    int d = 90;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case222() {
    int mov1 = 3;
    int mov2 = 6;
    int d = 4;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case223() {
    int mov1 = 100;
    int mov2 = 100;
    int d = 50;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case224() {
    int mov1 = 10;
    int mov2 = 21;
    int d = 10000;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case225() {
    int mov1 = 201;
    int mov2 = 100;
    int d = 1000000;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case226() {
    int mov1 = 50;
    int mov2 = 25;
    int d = 100;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case227() {
    int mov1 = 101;
    int mov2 = 60;
    int d = 130;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case228() {
    int mov1 = 5;
    int mov2 = 10;
    int d = 100;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case229() {
    int mov1 = 7;
    int mov2 = 3;
    int d = 8;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case230() {
    int mov1 = 100;
    int mov2 = 106;
    int d = 105;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case231() {
    int mov1 = 5;
    int mov2 = 10;
    int d = 1501;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case232() {
    int mov1 = 7;
    int mov2 = 10;
    int d = 33;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case233() {
    int mov1 = 5;
    int mov2 = 5;
    int d = 21;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case234() {
    int mov1 = 80;
    int mov2 = 160;
    int d = 100;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case235() {
    int mov1 = 7;
    int mov2 = 14;
    int d = 33;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case236() {
    int mov1 = 110;
    int mov2 = 200;
    int d = 150;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case237() {
    int mov1 = 10;
    int mov2 = 20;
    int d = 20;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case238() {
    int mov1 = 21;
    int mov2 = 10;
    int d = 33;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case239() {
    int mov1 = 10;
    int mov2 = 7;
    int d = 6;
    assertEquals("Ciel", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case240() {
    int mov1 = 10;
    int mov2 = 21;
    int d = 100;
    assertEquals("Liss", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

  @Test
  public void case241() {
    int mov1 = 10;
    int mov2 = 20;
    int d = 40;
    assertEquals("Draw", foxandfencingeasy.WhoCanWin(mov1, mov2, d));
  }

}
