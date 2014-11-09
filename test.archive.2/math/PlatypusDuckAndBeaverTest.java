package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PlatypusDuckAndBeaverTest {
  PlatypusDuckAndBeaver platypusduckandbeaver = new PlatypusDuckAndBeaver();

  @Test
  public void case1() {
    int webbedFeet = 4;
    int duckBills = 1;
    int beaverTails = 1;
    assertEquals(1, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case2() {
    int webbedFeet = 0;
    int duckBills = 0;
    int beaverTails = 0;
    assertEquals(0, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case3() {
    int webbedFeet = 10;
    int duckBills = 2;
    int beaverTails = 2;
    assertEquals(3, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case4() {
    int webbedFeet = 60;
    int duckBills = 10;
    int beaverTails = 10;
    assertEquals(20, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case5() {
    int webbedFeet = 2;
    int duckBills = 1;
    int beaverTails = 0;
    assertEquals(1, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case6() {
    int webbedFeet = 4;
    int duckBills = 0;
    int beaverTails = 1;
    assertEquals(1, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case7() {
    int webbedFeet = 824;
    int duckBills = 309;
    int beaverTails = 81;
    assertEquals(331, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case8() {
    int webbedFeet = 866;
    int duckBills = 135;
    int beaverTails = 207;
    assertEquals(226, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case9() {
    int webbedFeet = 870;
    int duckBills = 198;
    int beaverTails = 205;
    assertEquals(230, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case10() {
    int webbedFeet = 636;
    int duckBills = 180;
    int beaverTails = 118;
    assertEquals(200, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case11() {
    int webbedFeet = 404;
    int duckBills = 92;
    int beaverTails = 88;
    assertEquals(114, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case12() {
    int webbedFeet = 798;
    int duckBills = 199;
    int beaverTails = 146;
    assertEquals(253, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case13() {
    int webbedFeet = 540;
    int duckBills = 186;
    int beaverTails = 60;
    assertEquals(210, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case14() {
    int webbedFeet = 792;
    int duckBills = 69;
    int beaverTails = 170;
    assertEquals(226, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case15() {
    int webbedFeet = 504;
    int duckBills = 120;
    int beaverTails = 112;
    assertEquals(140, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case16() {
    int webbedFeet = 754;
    int duckBills = 228;
    int beaverTails = 120;
    assertEquals(257, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case17() {
    int webbedFeet = 884;
    int duckBills = 234;
    int beaverTails = 122;
    assertEquals(320, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case18() {
    int webbedFeet = 622;
    int duckBills = 194;
    int beaverTails = 63;
    assertEquals(248, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case19() {
    int webbedFeet = 820;
    int duckBills = 254;
    int beaverTails = 104;
    assertEquals(306, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case20() {
    int webbedFeet = 510;
    int duckBills = 128;
    int beaverTails = 102;
    assertEquals(153, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case21() {
    int webbedFeet = 792;
    int duckBills = 328;
    int beaverTails = 45;
    assertEquals(351, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case22() {
    int webbedFeet = 622;
    int duckBills = 199;
    int beaverTails = 83;
    assertEquals(228, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case23() {
    int webbedFeet = 742;
    int duckBills = 147;
    int beaverTails = 176;
    assertEquals(195, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case24() {
    int webbedFeet = 450;
    int duckBills = 123;
    int beaverTails = 65;
    assertEquals(160, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case25() {
    int webbedFeet = 836;
    int duckBills = 277;
    int beaverTails = 95;
    assertEquals(323, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case26() {
    int webbedFeet = 466;
    int duckBills = 61;
    int beaverTails = 109;
    assertEquals(124, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case27() {
    int webbedFeet = 972;
    int duckBills = 384;
    int beaverTails = 68;
    assertEquals(418, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case28() {
    int webbedFeet = 976;
    int duckBills = 466;
    int beaverTails = 11;
    assertEquals(477, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case29() {
    int webbedFeet = 968;
    int duckBills = 94;
    int beaverTails = 229;
    assertEquals(255, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case30() {
    int webbedFeet = 438;
    int duckBills = 149;
    int beaverTails = 35;
    assertEquals(184, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case31() {
    int webbedFeet = 752;
    int duckBills = 166;
    int beaverTails = 185;
    assertEquals(191, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case32() {
    int webbedFeet = 994;
    int duckBills = 285;
    int beaverTails = 129;
    assertEquals(368, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case33() {
    int webbedFeet = 866;
    int duckBills = 299;
    int beaverTails = 122;
    assertEquals(311, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case34() {
    int webbedFeet = 724;
    int duckBills = 280;
    int beaverTails = 68;
    assertEquals(294, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case35() {
    int webbedFeet = 776;
    int duckBills = 89;
    int beaverTails = 159;
    assertEquals(229, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case36() {
    int webbedFeet = 648;
    int duckBills = 75;
    int beaverTails = 161;
    assertEquals(163, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case37() {
    int webbedFeet = 906;
    int duckBills = 272;
    int beaverTails = 138;
    assertEquals(315, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case38() {
    int webbedFeet = 956;
    int duckBills = 315;
    int beaverTails = 89;
    assertEquals(389, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case39() {
    int webbedFeet = 930;
    int duckBills = 310;
    int beaverTails = 133;
    assertEquals(332, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case40() {
    int webbedFeet = 958;
    int duckBills = 162;
    int beaverTails = 198;
    assertEquals(281, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case41() {
    int webbedFeet = 854;
    int duckBills = 253;
    int beaverTails = 118;
    assertEquals(309, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case42() {
    int webbedFeet = 856;
    int duckBills = 359;
    int beaverTails = 45;
    assertEquals(383, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case43() {
    int webbedFeet = 730;
    int duckBills = 164;
    int beaverTails = 136;
    assertEquals(229, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case44() {
    int webbedFeet = 930;
    int duckBills = 30;
    int beaverTails = 228;
    assertEquals(237, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case45() {
    int webbedFeet = 932;
    int duckBills = 111;
    int beaverTails = 212;
    assertEquals(254, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case46() {
    int webbedFeet = 672;
    int duckBills = 125;
    int beaverTails = 118;
    assertEquals(218, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case47() {
    int webbedFeet = 632;
    int duckBills = 223;
    int beaverTails = 74;
    assertEquals(242, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case48() {
    int webbedFeet = 918;
    int duckBills = 131;
    int beaverTails = 220;
    assertEquals(239, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case49() {
    int webbedFeet = 294;
    int duckBills = 81;
    int beaverTails = 54;
    assertEquals(93, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case50() {
    int webbedFeet = 990;
    int duckBills = 309;
    int beaverTails = 134;
    assertEquals(361, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case51() {
    int webbedFeet = 534;
    int duckBills = 47;
    int beaverTails = 118;
    assertEquals(149, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case52() {
    int webbedFeet = 982;
    int duckBills = 279;
    int beaverTails = 140;
    assertEquals(351, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case53() {
    int webbedFeet = 682;
    int duckBills = 74;
    int beaverTails = 146;
    assertEquals(195, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case54() {
    int webbedFeet = 496;
    int duckBills = 127;
    int beaverTails = 77;
    assertEquals(171, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case55() {
    int webbedFeet = 798;
    int duckBills = 211;
    int beaverTails = 176;
    assertEquals(223, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case56() {
    int webbedFeet = 892;
    int duckBills = 401;
    int beaverTails = 45;
    assertEquals(401, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case57() {
    int webbedFeet = 990;
    int duckBills = 251;
    int beaverTails = 162;
    assertEquals(333, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case58() {
    int webbedFeet = 996;
    int duckBills = 248;
    int beaverTails = 169;
    assertEquals(329, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case59() {
    int webbedFeet = 976;
    int duckBills = 242;
    int beaverTails = 164;
    assertEquals(324, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case60() {
    int webbedFeet = 1000;
    int duckBills = 246;
    int beaverTails = 169;
    assertEquals(331, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case61() {
    int webbedFeet = 968;
    int duckBills = 240;
    int beaverTails = 162;
    assertEquals(322, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case62() {
    int webbedFeet = 980;
    int duckBills = 244;
    int beaverTails = 163;
    assertEquals(327, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case63() {
    int webbedFeet = 996;
    int duckBills = 250;
    int beaverTails = 168;
    assertEquals(330, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case64() {
    int webbedFeet = 976;
    int duckBills = 243;
    int beaverTails = 164;
    assertEquals(324, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case65() {
    int webbedFeet = 1000;
    int duckBills = 249;
    int beaverTails = 170;
    assertEquals(330, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case66() {
    int webbedFeet = 978;
    int duckBills = 241;
    int beaverTails = 164;
    assertEquals(325, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case67() {
    int webbedFeet = 1000;
    int duckBills = 375;
    int beaverTails = 125;
    assertEquals(375, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case68() {
    int webbedFeet = 960;
    int duckBills = 349;
    int beaverTails = 131;
    assertEquals(349, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case69() {
    int webbedFeet = 926;
    int duckBills = 356;
    int beaverTails = 107;
    assertEquals(356, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case70() {
    int webbedFeet = 886;
    int duckBills = 343;
    int beaverTails = 100;
    assertEquals(343, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case71() {
    int webbedFeet = 818;
    int duckBills = 305;
    int beaverTails = 104;
    assertEquals(305, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case72() {
    int webbedFeet = 848;
    int duckBills = 321;
    int beaverTails = 103;
    assertEquals(321, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case73() {
    int webbedFeet = 986;
    int duckBills = 368;
    int beaverTails = 125;
    assertEquals(368, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case74() {
    int webbedFeet = 964;
    int duckBills = 366;
    int beaverTails = 116;
    assertEquals(366, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case75() {
    int webbedFeet = 986;
    int duckBills = 376;
    int beaverTails = 117;
    assertEquals(376, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case76() {
    int webbedFeet = 890;
    int duckBills = 327;
    int beaverTails = 118;
    assertEquals(327, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case77() {
    int webbedFeet = 970;
    int duckBills = 373;
    int beaverTails = 112;
    assertEquals(373, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case78() {
    int webbedFeet = 364;
    int duckBills = 54;
    int beaverTails = 91;
    assertEquals(91, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case79() {
    int webbedFeet = 456;
    int duckBills = 26;
    int beaverTails = 114;
    assertEquals(114, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case80() {
    int webbedFeet = 792;
    int duckBills = 58;
    int beaverTails = 198;
    assertEquals(198, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case81() {
    int webbedFeet = 980;
    int duckBills = 74;
    int beaverTails = 245;
    assertEquals(245, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case82() {
    int webbedFeet = 316;
    int duckBills = 54;
    int beaverTails = 79;
    assertEquals(79, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case83() {
    int webbedFeet = 56;
    int duckBills = 13;
    int beaverTails = 14;
    assertEquals(14, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case84() {
    int webbedFeet = 756;
    int duckBills = 83;
    int beaverTails = 189;
    assertEquals(189, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case85() {
    int webbedFeet = 828;
    int duckBills = 12;
    int beaverTails = 207;
    assertEquals(207, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case86() {
    int webbedFeet = 492;
    int duckBills = 107;
    int beaverTails = 123;
    assertEquals(123, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case87() {
    int webbedFeet = 600;
    int duckBills = 116;
    int beaverTails = 150;
    assertEquals(150, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case88() {
    int webbedFeet = 364;
    int duckBills = 178;
    int beaverTails = 2;
    assertEquals(180, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case89() {
    int webbedFeet = 666;
    int duckBills = 103;
    int beaverTails = 115;
    assertEquals(218, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case90() {
    int webbedFeet = 570;
    int duckBills = 95;
    int beaverTails = 95;
    assertEquals(190, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case91() {
    int webbedFeet = 654;
    int duckBills = 235;
    int beaverTails = 46;
    assertEquals(281, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case92() {
    int webbedFeet = 852;
    int duckBills = 200;
    int beaverTails = 113;
    assertEquals(313, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case93() {
    int webbedFeet = 930;
    int duckBills = 175;
    int beaverTails = 145;
    assertEquals(320, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case94() {
    int webbedFeet = 768;
    int duckBills = 348;
    int beaverTails = 18;
    assertEquals(366, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case95() {
    int webbedFeet = 774;
    int duckBills = 115;
    int beaverTails = 136;
    assertEquals(251, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case96() {
    int webbedFeet = 892;
    int duckBills = 84;
    int beaverTails = 181;
    assertEquals(265, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case97() {
    int webbedFeet = 452;
    int duckBills = 54;
    int beaverTails = 86;
    assertEquals(140, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case98() {
    int webbedFeet = 844;
    int duckBills = 422;
    int beaverTails = 0;
    assertEquals(422, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case99() {
    int webbedFeet = 868;
    int duckBills = 434;
    int beaverTails = 0;
    assertEquals(434, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case100() {
    int webbedFeet = 800;
    int duckBills = 400;
    int beaverTails = 0;
    assertEquals(400, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case101() {
    int webbedFeet = 886;
    int duckBills = 443;
    int beaverTails = 0;
    assertEquals(443, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case102() {
    int webbedFeet = 918;
    int duckBills = 459;
    int beaverTails = 0;
    assertEquals(459, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case103() {
    int webbedFeet = 998;
    int duckBills = 499;
    int beaverTails = 0;
    assertEquals(499, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case104() {
    int webbedFeet = 992;
    int duckBills = 496;
    int beaverTails = 0;
    assertEquals(496, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case105() {
    int webbedFeet = 874;
    int duckBills = 437;
    int beaverTails = 0;
    assertEquals(437, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case106() {
    int webbedFeet = 864;
    int duckBills = 432;
    int beaverTails = 0;
    assertEquals(432, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case107() {
    int webbedFeet = 810;
    int duckBills = 405;
    int beaverTails = 0;
    assertEquals(405, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case108() {
    int webbedFeet = 960;
    int duckBills = 240;
    int beaverTails = 240;
    assertEquals(240, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case109() {
    int webbedFeet = 924;
    int duckBills = 231;
    int beaverTails = 231;
    assertEquals(231, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case110() {
    int webbedFeet = 892;
    int duckBills = 223;
    int beaverTails = 223;
    assertEquals(223, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case111() {
    int webbedFeet = 896;
    int duckBills = 224;
    int beaverTails = 224;
    assertEquals(224, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case112() {
    int webbedFeet = 880;
    int duckBills = 220;
    int beaverTails = 220;
    assertEquals(220, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case113() {
    int webbedFeet = 896;
    int duckBills = 224;
    int beaverTails = 224;
    assertEquals(224, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case114() {
    int webbedFeet = 940;
    int duckBills = 235;
    int beaverTails = 235;
    assertEquals(235, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case115() {
    int webbedFeet = 920;
    int duckBills = 230;
    int beaverTails = 230;
    assertEquals(230, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case116() {
    int webbedFeet = 932;
    int duckBills = 233;
    int beaverTails = 233;
    assertEquals(233, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case117() {
    int webbedFeet = 908;
    int duckBills = 227;
    int beaverTails = 227;
    assertEquals(227, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case118() {
    int webbedFeet = 952;
    int duckBills = 0;
    int beaverTails = 238;
    assertEquals(238, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case119() {
    int webbedFeet = 956;
    int duckBills = 0;
    int beaverTails = 239;
    assertEquals(239, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case120() {
    int webbedFeet = 892;
    int duckBills = 0;
    int beaverTails = 223;
    assertEquals(223, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case121() {
    int webbedFeet = 888;
    int duckBills = 0;
    int beaverTails = 222;
    assertEquals(222, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case122() {
    int webbedFeet = 884;
    int duckBills = 0;
    int beaverTails = 221;
    assertEquals(221, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case123() {
    int webbedFeet = 932;
    int duckBills = 0;
    int beaverTails = 233;
    assertEquals(233, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case124() {
    int webbedFeet = 892;
    int duckBills = 0;
    int beaverTails = 223;
    assertEquals(223, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case125() {
    int webbedFeet = 880;
    int duckBills = 0;
    int beaverTails = 220;
    assertEquals(220, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case126() {
    int webbedFeet = 900;
    int duckBills = 0;
    int beaverTails = 225;
    assertEquals(225, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case127() {
    int webbedFeet = 952;
    int duckBills = 0;
    int beaverTails = 238;
    assertEquals(238, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case128() {
    int webbedFeet = 1000;
    int duckBills = 500;
    int beaverTails = 0;
    assertEquals(500, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case129() {
    int webbedFeet = 1000;
    int duckBills = 0;
    int beaverTails = 250;
    assertEquals(250, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case130() {
    int webbedFeet = 1000;
    int duckBills = 250;
    int beaverTails = 250;
    assertEquals(250, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case131() {
    int webbedFeet = 1000;
    int duckBills = 200;
    int beaverTails = 200;
    assertEquals(300, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case132() {
    int webbedFeet = 64;
    int duckBills = 11;
    int beaverTails = 11;
    assertEquals(21, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case133() {
    int webbedFeet = 10;
    int duckBills = 5;
    int beaverTails = 0;
    assertEquals(5, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case134() {
    int webbedFeet = 16;
    int duckBills = 2;
    int beaverTails = 3;
    assertEquals(5, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case135() {
    int webbedFeet = 6;
    int duckBills = 2;
    int beaverTails = 1;
    assertEquals(2, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case136() {
    int webbedFeet = 4;
    int duckBills = 2;
    int beaverTails = 0;
    assertEquals(2, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case137() {
    int webbedFeet = 1000;
    int duckBills = 400;
    int beaverTails = 50;
    assertEquals(450, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

  @Test
  public void case138() {
    int webbedFeet = 502;
    int duckBills = 101;
    int beaverTails = 100;
    assertEquals(151, platypusduckandbeaver.minimumAnimals(webbedFeet, duckBills, beaverTails));
  }

}
