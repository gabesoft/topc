package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class DonutsOnTheGridTest {
  DonutsOnTheGrid donutsonthegrid = new DonutsOnTheGrid();

  @Test
  public void case1() {
    int H = 350;
    int W = 350;
    int seed = 1;
    int threshold = 65536;
    assertEquals(3687647076L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case2() {
    int H = 257;
    int W = 210;
    int seed = 36894;
    int threshold = 19420;
    assertEquals(5L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case3() {
    int H = 36;
    int W = 48;
    int seed = 1809;
    int threshold = 31235;
    assertEquals(12L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case4() {
    int H = 37;
    int W = 327;
    int seed = 46242;
    int threshold = 20375;
    assertEquals(1L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case5() {
    int H = 344;
    int W = 43;
    int seed = 14547;
    int threshold = 58855;
    assertEquals(118610L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case6() {
    int H = 88;
    int W = 70;
    int seed = 9249;
    int threshold = 26807;
    assertEquals(2L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case7() {
    int H = 343;
    int W = 113;
    int seed = 31408;
    int threshold = 48903;
    assertEquals(19106L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case8() {
    int H = 28;
    int W = 298;
    int seed = 2230;
    int threshold = 44929;
    assertEquals(1441L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case9() {
    int H = 142;
    int W = 50;
    int seed = 16772;
    int threshold = 36823;
    assertEquals(132L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case10() {
    int H = 145;
    int W = 187;
    int seed = 31639;
    int threshold = 8116;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case11() {
    int H = 210;
    int W = 117;
    int seed = 47189;
    int threshold = 32284;
    assertEquals(167L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case12() {
    int H = 236;
    int W = 296;
    int seed = 18596;
    int threshold = 11592;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case13() {
    int H = 90;
    int W = 302;
    int seed = 8868;
    int threshold = 34097;
    assertEquals(251L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case14() {
    int H = 111;
    int W = 162;
    int seed = 20883;
    int threshold = 24601;
    assertEquals(15L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case15() {
    int H = 58;
    int W = 228;
    int seed = 26591;
    int threshold = 38876;
    assertEquals(507L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case16() {
    int H = 116;
    int W = 5;
    int seed = 13227;
    int threshold = 3500;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case17() {
    int H = 159;
    int W = 271;
    int seed = 9823;
    int threshold = 14191;
    assertEquals(1L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case18() {
    int H = 185;
    int W = 57;
    int seed = 7141;
    int threshold = 54393;
    assertEquals(22040L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case19() {
    int H = 350;
    int W = 6;
    int seed = 9177;
    int threshold = 24060;
    assertEquals(1L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case20() {
    int H = 232;
    int W = 78;
    int seed = 2604;
    int threshold = 15579;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case21() {
    int H = 58;
    int W = 339;
    int seed = 31350;
    int threshold = 30053;
    assertEquals(55L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case22() {
    int H = 87;
    int W = 128;
    int seed = 22200;
    int threshold = 6058;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case23() {
    int H = 332;
    int W = 92;
    int seed = 23376;
    int threshold = 36548;
    assertEquals(618L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case24() {
    int H = 342;
    int W = 43;
    int seed = 32274;
    int threshold = 34220;
    assertEquals(144L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case25() {
    int H = 170;
    int W = 131;
    int seed = 5360;
    int threshold = 14631;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case26() {
    int H = 252;
    int W = 14;
    int seed = 27833;
    int threshold = 50994;
    assertEquals(2623L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case27() {
    int H = 177;
    int W = 291;
    int seed = 25861;
    int threshold = 23037;
    assertEquals(15L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case28() {
    int H = 257;
    int W = 324;
    int seed = 11534;
    int threshold = 24451;
    assertEquals(68L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case29() {
    int H = 61;
    int W = 159;
    int seed = 16367;
    int threshold = 25481;
    assertEquals(9L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case30() {
    int H = 157;
    int W = 258;
    int seed = 29276;
    int threshold = 32454;
    assertEquals(258L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case31() {
    int H = 247;
    int W = 335;
    int seed = 25750;
    int threshold = 38020;
    assertEquals(2310L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case32() {
    int H = 148;
    int W = 297;
    int seed = 22764;
    int threshold = 49608;
    assertEquals(25364L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case33() {
    int H = 128;
    int W = 85;
    int seed = 29741;
    int threshold = 14905;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case34() {
    int H = 289;
    int W = 150;
    int seed = 38488;
    int threshold = 10128;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case35() {
    int H = 79;
    int W = 335;
    int seed = 2858;
    int threshold = 45733;
    assertEquals(5570L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case36() {
    int H = 198;
    int W = 175;
    int seed = 8375;
    int threshold = 57823;
    assertEquals(259018L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case37() {
    int H = 113;
    int W = 39;
    int seed = 20603;
    int threshold = 32353;
    assertEquals(19L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case38() {
    int H = 84;
    int W = 155;
    int seed = 31640;
    int threshold = 20327;
    assertEquals(2L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case39() {
    int H = 271;
    int W = 103;
    int seed = 31946;
    int threshold = 42843;
    assertEquals(2750L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case40() {
    int H = 1;
    int W = 317;
    int seed = 6663;
    int threshold = 40637;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case41() {
    int H = 164;
    int W = 178;
    int seed = 7093;
    int threshold = 44248;
    assertEquals(4266L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case42() {
    int H = 117;
    int W = 201;
    int seed = 21586;
    int threshold = 25785;
    assertEquals(11L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case43() {
    int H = 137;
    int W = 329;
    int seed = 21739;
    int threshold = 38377;
    assertEquals(1362L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case44() {
    int H = 74;
    int W = 271;
    int seed = 53821;
    int threshold = 18211;
    assertEquals(6L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case45() {
    int H = 337;
    int W = 146;
    int seed = 11266;
    int threshold = 32607;
    assertEquals(280L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case46() {
    int H = 275;
    int W = 161;
    int seed = 26701;
    int threshold = 5489;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case47() {
    int H = 34;
    int W = 138;
    int seed = 27276;
    int threshold = 32211;
    assertEquals(36L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case48() {
    int H = 207;
    int W = 189;
    int seed = 32002;
    int threshold = 20079;
    assertEquals(3L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case49() {
    int H = 77;
    int W = 92;
    int seed = 54161;
    int threshold = 8096;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case50() {
    int H = 131;
    int W = 277;
    int seed = 17232;
    int threshold = 1609;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case51() {
    int H = 251;
    int W = 159;
    int seed = 31420;
    int threshold = 12125;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case52() {
    int H = 26;
    int W = 85;
    int seed = 22149;
    int threshold = 30947;
    assertEquals(2L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case53() {
    int H = 144;
    int W = 344;
    int seed = 19882;
    int threshold = 24373;
    assertEquals(29L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case54() {
    int H = 26;
    int W = 57;
    int seed = 42540;
    int threshold = 31153;
    assertEquals(3L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case55() {
    int H = 141;
    int W = 210;
    int seed = 7024;
    int threshold = 9850;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case56() {
    int H = 177;
    int W = 29;
    int seed = 5314;
    int threshold = 17954;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case57() {
    int H = 34;
    int W = 212;
    int seed = 55601;
    int threshold = 12810;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case58() {
    int H = 15;
    int W = 322;
    int seed = 44752;
    int threshold = 25529;
    assertEquals(4L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case59() {
    int H = 147;
    int W = 61;
    int seed = 26266;
    int threshold = 21365;
    assertEquals(2L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case60() {
    int H = 299;
    int W = 315;
    int seed = 32741;
    int threshold = 40857;
    assertEquals(5813L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case61() {
    int H = 316;
    int W = 2;
    int seed = 29740;
    int threshold = 31558;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case62() {
    int H = 173;
    int W = 63;
    int seed = 29829;
    int threshold = 10822;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case63() {
    int H = 133;
    int W = 169;
    int seed = 29040;
    int threshold = 42661;
    assertEquals(2421L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case64() {
    int H = 256;
    int W = 346;
    int seed = 43261;
    int threshold = 30973;
    assertEquals(334L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case65() {
    int H = 202;
    int W = 307;
    int seed = 33208;
    int threshold = 14191;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case66() {
    int H = 167;
    int W = 202;
    int seed = 4347;
    int threshold = 6688;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case67() {
    int H = 179;
    int W = 204;
    int seed = 27759;
    int threshold = 39877;
    assertEquals(1623L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case68() {
    int H = 62;
    int W = 343;
    int seed = 45172;
    int threshold = 42965;
    assertEquals(2467L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case69() {
    int H = 33;
    int W = 223;
    int seed = 51755;
    int threshold = 46224;
    assertEquals(1520L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case70() {
    int H = 279;
    int W = 122;
    int seed = 7519;
    int threshold = 28479;
    assertEquals(73L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case71() {
    int H = 143;
    int W = 258;
    int seed = 23322;
    int threshold = 58335;
    assertEquals(333898L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case72() {
    int H = 283;
    int W = 40;
    int seed = 28914;
    int threshold = 33605;
    assertEquals(105L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case73() {
    int H = 267;
    int W = 278;
    int seed = 46046;
    int threshold = 4060;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case74() {
    int H = 307;
    int W = 145;
    int seed = 762;
    int threshold = 39524;
    assertEquals(2004L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case75() {
    int H = 341;
    int W = 86;
    int seed = 30629;
    int threshold = 28399;
    assertEquals(46L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case76() {
    int H = 278;
    int W = 77;
    int seed = 19466;
    int threshold = 56497;
    assertEquals(93822L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case77() {
    int H = 289;
    int W = 255;
    int seed = 6393;
    int threshold = 24667;
    assertEquals(40L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case78() {
    int H = 111;
    int W = 289;
    int seed = 22295;
    int threshold = 24038;
    assertEquals(11L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case79() {
    int H = 88;
    int W = 271;
    int seed = 34773;
    int threshold = 26050;
    assertEquals(14L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case80() {
    int H = 76;
    int W = 185;
    int seed = 20146;
    int threshold = 43512;
    assertEquals(1444L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case81() {
    int H = 142;
    int W = 350;
    int seed = 30442;
    int threshold = 28900;
    assertEquals(120L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case82() {
    int H = 224;
    int W = 208;
    int seed = 9140;
    int threshold = 26890;
    assertEquals(39L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case83() {
    int H = 253;
    int W = 320;
    int seed = 35102;
    int threshold = 41083;
    assertEquals(4241L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case84() {
    int H = 209;
    int W = 344;
    int seed = 32100;
    int threshold = 31801;
    assertEquals(394L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case85() {
    int H = 27;
    int W = 260;
    int seed = 16065;
    int threshold = 45582;
    assertEquals(1420L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case86() {
    int H = 108;
    int W = 142;
    int seed = 58731;
    int threshold = 30877;
    assertEquals(76L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case87() {
    int H = 146;
    int W = 222;
    int seed = 6728;
    int threshold = 8748;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case88() {
    int H = 164;
    int W = 201;
    int seed = 25496;
    int threshold = 31906;
    assertEquals(111L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case89() {
    int H = 343;
    int W = 41;
    int seed = 21235;
    int threshold = 3094;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case90() {
    int H = 37;
    int W = 25;
    int seed = 9527;
    int threshold = 57274;
    assertEquals(3068L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case91() {
    int H = 292;
    int W = 265;
    int seed = 47961;
    int threshold = 3378;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case92() {
    int H = 115;
    int W = 342;
    int seed = 7018;
    int threshold = 28648;
    assertEquals(84L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case93() {
    int H = 26;
    int W = 330;
    int seed = 27463;
    int threshold = 30105;
    assertEquals(32L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case94() {
    int H = 211;
    int W = 105;
    int seed = 29178;
    int threshold = 4226;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case95() {
    int H = 290;
    int W = 108;
    int seed = 16735;
    int threshold = 45368;
    assertEquals(5682L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case96() {
    int H = 269;
    int W = 77;
    int seed = 29375;
    int threshold = 24455;
    assertEquals(17L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case97() {
    int H = 95;
    int W = 287;
    int seed = 7659;
    int threshold = 5075;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case98() {
    int H = 69;
    int W = 118;
    int seed = 23578;
    int threshold = 38344;
    assertEquals(210L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case99() {
    int H = 172;
    int W = 106;
    int seed = 39212;
    int threshold = 19924;
    assertEquals(2L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case100() {
    int H = 131;
    int W = 152;
    int seed = 14115;
    int threshold = 7519;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case101() {
    int H = 127;
    int W = 176;
    int seed = 23449;
    int threshold = 17627;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case102() {
    int H = 5;
    int W = 5;
    int seed = 222;
    int threshold = 55555;
    assertEquals(4L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case103() {
    int H = 350;
    int W = 350;
    int seed = 1354;
    int threshold = 65500;
    assertEquals(2909504310L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case104() {
    int H = 349;
    int W = 317;
    int seed = 23566;
    int threshold = 65000;
    assertEquals(263790994L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case105() {
    int H = 350;
    int W = 347;
    int seed = 11;
    int threshold = 63500;
    assertEquals(23150152L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case106() {
    int H = 337;
    int W = 340;
    int seed = 244;
    int threshold = 62111;
    assertEquals(6654659L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case107() {
    int H = 5;
    int W = 6;
    int seed = 121;
    int threshold = 58000;
    assertEquals(3L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case108() {
    int H = 4;
    int W = 5;
    int seed = 6;
    int threshold = 50000;
    assertEquals(1L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case109() {
    int H = 4;
    int W = 4;
    int seed = 1;
    int threshold = 65536;
    assertEquals(9L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case110() {
    int H = 344;
    int W = 347;
    int seed = 1;
    int threshold = 65535;
    assertEquals(3468398770L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case111() {
    int H = 350;
    int W = 350;
    int seed = 0;
    int threshold = 65536;
    assertEquals(3687647076L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case112() {
    int H = 350;
    int W = 350;
    int seed = 1;
    int threshold = 0;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case113() {
    int H = 320;
    int W = 320;
    int seed = 4091;
    int threshold = 30872;
    assertEquals(294L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case114() {
    int H = 350;
    int W = 350;
    int seed = 2;
    int threshold = 65534;
    assertEquals(3634680381L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case115() {
    int H = 333;
    int W = 333;
    int seed = 33333;
    int threshold = 33333;
    assertEquals(903L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case116() {
    int H = 100;
    int W = 100;
    int seed = 1;
    int threshold = 65536;
    assertEquals(23532201L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case117() {
    int H = 350;
    int W = 350;
    int seed = 1218;
    int threshold = 31245;
    assertEquals(545L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case118() {
    int H = 350;
    int W = 350;
    int seed = 12312;
    int threshold = 0;
    assertEquals(0L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case119() {
    int H = 350;
    int W = 350;
    int seed = 1;
    int threshold = 65000;
    assertEquals(291635119L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case120() {
    int H = 350;
    int W = 350;
    int seed = 4325;
    int threshold = 65536;
    assertEquals(3687647076L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case121() {
    int H = 350;
    int W = 350;
    int seed = 65535;
    int threshold = 65536;
    assertEquals(3687647076L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case122() {
    int H = 350;
    int W = 350;
    int seed = 222;
    int threshold = 65536;
    assertEquals(3687647076L, donutsonthegrid.calc(H, W, seed, threshold));
  }

  @Test
  public void case123() {
    int H = 349;
    int W = 349;
    int seed = 24356;
    int threshold = 52576;
    assertEquals(163585L, donutsonthegrid.calc(H, W, seed, threshold));
  }

}
