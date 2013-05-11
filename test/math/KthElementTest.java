package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class KthElementTest {
  KthElement kthelement = new KthElement();

  @Test
  public void case1() {
    int A = 0;
    int B = 12;
    int K = 5;
    assertEquals(12, kthelement.find(A, B, K));
  }

  @Test
  public void case2() {
    int A = 1;
    int B = 7;
    int K = 15;
    assertEquals(9, kthelement.find(A, B, K));
  }

  @Test
  public void case3() {
    int A = 15;
    int B = 21;
    int K = 500000001;
    assertEquals(51, kthelement.find(A, B, K));
  }

  @Test
  public void case4() {
    int A = 79;
    int B = 4;
    int K = 700000000;
    assertEquals(478, kthelement.find(A, B, K));
  }

  @Test
  public void case5() {
    int A = 293451;
    int B = 765339;
    int K = 900000000;
    assertEquals(3993300, kthelement.find(A, B, K));
  }

  @Test
  public void case6() {
    int A = 590;
    int B = 757;
    int K = 350;
    assertEquals(4887, kthelement.find(A, B, K));
  }

  @Test
  public void case7() {
    int A = 838;
    int B = 864;
    int K = 121;
    assertEquals(8406, kthelement.find(A, B, K));
  }

  @Test
  public void case8() {
    int A = 455;
    int B = 786;
    int K = 569;
    assertEquals(3061, kthelement.find(A, B, K));
  }

  @Test
  public void case9() {
    int A = 620;
    int B = 334;
    int K = 381;
    assertEquals(4674, kthelement.find(A, B, K));
  }

  @Test
  public void case10() {
    int A = 423;
    int B = 900;
    int K = 931;
    assertEquals(4284, kthelement.find(A, B, K));
  }

  @Test
  public void case11() {
    int A = 664;
    int B = 464;
    int K = 166;
    assertEquals(3120, kthelement.find(A, B, K));
  }

  @Test
  public void case12() {
    int A = 648;
    int B = 938;
    int K = 39;
    assertEquals(5474, kthelement.find(A, B, K));
  }

  @Test
  public void case13() {
    int A = 416;
    int B = 600;
    int K = 201;
    assertEquals(2680, kthelement.find(A, B, K));
  }

  @Test
  public void case14() {
    int A = 966;
    int B = 264;
    int K = 357;
    assertEquals(4128, kthelement.find(A, B, K));
  }

  @Test
  public void case15() {
    int A = 180;
    int B = 294;
    int K = 143;
    assertEquals(1734, kthelement.find(A, B, K));
  }

  @Test
  public void case16() {
    int A = 752920;
    int B = 410368;
    int K = 402885;
    assertEquals(3422048, kthelement.find(A, B, K));
  }

  @Test
  public void case17() {
    int A = 664744;
    int B = 449680;
    int K = 564517;
    assertEquals(7097120, kthelement.find(A, B, K));
  }

  @Test
  public void case18() {
    int A = 120442;
    int B = 477795;
    int K = 567387;
    assertEquals(2043541, kthelement.find(A, B, K));
  }

  @Test
  public void case19() {
    int A = 194696;
    int B = 596652;
    int K = 522681;
    assertEquals(3127700, kthelement.find(A, B, K));
  }

  @Test
  public void case20() {
    int A = 22373;
    int B = 802738;
    int K = 564087;
    assertEquals(1004095, kthelement.find(A, B, K));
  }

  @Test
  public void case21() {
    int A = 417314;
    int B = 163056;
    int K = 16981;
    assertEquals(3501568, kthelement.find(A, B, K));
  }

  @Test
  public void case22() {
    int A = 541320;
    int B = 287376;
    int K = 916876;
    assertEquals(7865856, kthelement.find(A, B, K));
  }

  @Test
  public void case23() {
    int A = 345247;
    int B = 707575;
    int K = 279441;
    assertEquals(4160045, kthelement.find(A, B, K));
  }

  @Test
  public void case24() {
    int A = 201228;
    int B = 864468;
    int K = 58057;
    assertEquals(2474292, kthelement.find(A, B, K));
  }

  @Test
  public void case25() {
    int A = 951206;
    int B = 54554;
    int K = 22575;
    assertEquals(12420232, kthelement.find(A, B, K));
  }

  @Test
  public void case26() {
    int A = 270400;
    int B = 149477;
    int K = 91376641;
    assertEquals(3664677, kthelement.find(A, B, K));
  }

  @Test
  public void case27() {
    int A = 591328;
    int B = 117779;
    int K = 57287701;
    assertEquals(7805043, kthelement.find(A, B, K));
  }

  @Test
  public void case28() {
    int A = 734196;
    int B = 377456;
    int K = 530212964;
    assertEquals(10656200, kthelement.find(A, B, K));
  }

  @Test
  public void case29() {
    int A = 907240;
    int B = 461884;
    int K = 379233541;
    assertEquals(11348764, kthelement.find(A, B, K));
  }

  @Test
  public void case30() {
    int A = 975264;
    int B = 418288;
    int K = 318889801;
    assertEquals(10170928, kthelement.find(A, B, K));
  }

  @Test
  public void case31() {
    int A = 776299;
    int B = 137570;
    int K = 48995416;
    assertEquals(7900560, kthelement.find(A, B, K));
  }

  @Test
  public void case32() {
    int A = 620880;
    int B = 377947;
    int K = 278619309;
    assertEquals(8449387, kthelement.find(A, B, K));
  }

  @Test
  public void case33() {
    int A = 378490;
    int B = 292702;
    int K = 114565761;
    assertEquals(4077602, kthelement.find(A, B, K));
  }

  @Test
  public void case34() {
    int A = 978350;
    int B = 137920;
    int K = 191680381;
    assertEquals(9921420, kthelement.find(A, B, K));
  }

  @Test
  public void case35() {
    int A = 558773;
    int B = 380172;
    int K = 81450739;
    assertEquals(5967902, kthelement.find(A, B, K));
  }

  @Test
  public void case36() {
    int A = 0;
    int B = 1;
    int K = 3;
    assertEquals(1, kthelement.find(A, B, K));
  }

  @Test
  public void case37() {
    int A = 5;
    int B = 0;
    int K = 6;
    assertEquals(0, kthelement.find(A, B, K));
  }

  @Test
  public void case38() {
    int A = 6;
    int B = 8;
    int K = 3;
    assertEquals(26, kthelement.find(A, B, K));
  }

  @Test
  public void case39() {
    int A = 4;
    int B = 2;
    int K = 10;
    assertEquals(10, kthelement.find(A, B, K));
  }

  @Test
  public void case40() {
    int A = 8;
    int B = 7;
    int K = 5;
    assertEquals(47, kthelement.find(A, B, K));
  }

  @Test
  public void case41() {
    int A = 6;
    int B = 8;
    int K = 3;
    assertEquals(26, kthelement.find(A, B, K));
  }

  @Test
  public void case42() {
    int A = 4;
    int B = 5;
    int K = 3;
    assertEquals(17, kthelement.find(A, B, K));
  }

  @Test
  public void case43() {
    int A = 0;
    int B = 2;
    int K = 7;
    assertEquals(2, kthelement.find(A, B, K));
  }

  @Test
  public void case44() {
    int A = 8;
    int B = 0;
    int K = 4;
    assertEquals(0, kthelement.find(A, B, K));
  }

  @Test
  public void case45() {
    int A = 2;
    int B = 6;
    int K = 7;
    assertEquals(10, kthelement.find(A, B, K));
  }

  @Test
  public void case46() {
    int A = 60;
    int B = 66;
    int K = 1;
    assertEquals(66, kthelement.find(A, B, K));
  }

  @Test
  public void case47() {
    int A = 34;
    int B = 86;
    int K = 1;
    assertEquals(86, kthelement.find(A, B, K));
  }

  @Test
  public void case48() {
    int A = 10;
    int B = 20;
    int K = 10;
    assertEquals(40, kthelement.find(A, B, K));
  }

  @Test
  public void case49() {
    int A = 16;
    int B = 54;
    int K = 9;
    assertEquals(134, kthelement.find(A, B, K));
  }

  @Test
  public void case50() {
    int A = 32;
    int B = 0;
    int K = 9;
    assertEquals(0, kthelement.find(A, B, K));
  }

  @Test
  public void case51() {
    int A = 80;
    int B = 41;
    int K = 5;
    assertEquals(521, kthelement.find(A, B, K));
  }

  @Test
  public void case52() {
    int A = 28;
    int B = 20;
    int K = 4;
    assertEquals(104, kthelement.find(A, B, K));
  }

  @Test
  public void case53() {
    int A = 72;
    int B = 50;
    int K = 7;
    assertEquals(266, kthelement.find(A, B, K));
  }

  @Test
  public void case54() {
    int A = 83;
    int B = 68;
    int K = 5;
    assertEquals(483, kthelement.find(A, B, K));
  }

  @Test
  public void case55() {
    int A = 42;
    int B = 48;
    int K = 1;
    assertEquals(48, kthelement.find(A, B, K));
  }

  @Test
  public void case56() {
    int A = 590001;
    int B = 718520;
    int K = 982346342;
    assertEquals(6028529, kthelement.find(A, B, K));
  }

  @Test
  public void case57() {
    int A = 277297;
    int B = 41473;
    int K = 993946237;
    assertEquals(3369037, kthelement.find(A, B, K));
  }

  @Test
  public void case58() {
    int A = 724218;
    int B = 589138;
    int K = 923846374;
    assertEquals(6382882, kthelement.find(A, B, K));
  }

  @Test
  public void case59() {
    int A = 969213;
    int B = 282151;
    int K = 993464664;
    assertEquals(10943494, kthelement.find(A, B, K));
  }

  @Test
  public void case60() {
    int A = 544831;
    int B = 662659;
    int K = 912236463;
    assertEquals(6110969, kthelement.find(A, B, K));
  }

  @Test
  public void case61() {
    int A = 792023;
    int B = 6928;
    int K = 963846465;
    assertEquals(5551089, kthelement.find(A, B, K));
  }

  @Test
  public void case62() {
    int A = 530945;
    int B = 809969;
    int K = 991273634;
    assertEquals(10897924, kthelement.find(A, B, K));
  }

  @Test
  public void case63() {
    int A = 657211;
    int B = 368091;
    int K = 971234644;
    assertEquals(5625779, kthelement.find(A, B, K));
  }

  @Test
  public void case64() {
    int A = 229414;
    int B = 589498;
    int K = 942636464;
    assertEquals(1507154, kthelement.find(A, B, K));
  }

  @Test
  public void case65() {
    int A = 732689;
    int B = 183023;
    int K = 934563456;
    assertEquals(8242602, kthelement.find(A, B, K));
  }

  @Test
  public void case66() {
    int A = 590001;
    int B = 718520;
    int K = 5;
    assertEquals(9568535, kthelement.find(A, B, K));
  }

  @Test
  public void case67() {
    int A = 277297;
    int B = 41473;
    int K = 3;
    assertEquals(2814443, kthelement.find(A, B, K));
  }

  @Test
  public void case68() {
    int A = 724218;
    int B = 589138;
    int K = 9;
    assertEquals(12900844, kthelement.find(A, B, K));
  }

  @Test
  public void case69() {
    int A = 969213;
    int B = 282151;
    int K = 11;
    assertEquals(7066642, kthelement.find(A, B, K));
  }

  @Test
  public void case70() {
    int A = 544831;
    int B = 662659;
    int K = 12;
    assertEquals(8835124, kthelement.find(A, B, K));
  }

  @Test
  public void case71() {
    int A = 792023;
    int B = 6928;
    int K = 10;
    assertEquals(5551089, kthelement.find(A, B, K));
  }

  @Test
  public void case72() {
    int A = 530945;
    int B = 809969;
    int K = 1;
    assertEquals(809969, kthelement.find(A, B, K));
  }

  @Test
  public void case73() {
    int A = 657211;
    int B = 368091;
    int K = 3;
    assertEquals(10883467, kthelement.find(A, B, K));
  }

  @Test
  public void case74() {
    int A = 229414;
    int B = 589498;
    int K = 2;
    assertEquals(3571880, kthelement.find(A, B, K));
  }

  @Test
  public void case75() {
    int A = 732689;
    int B = 183023;
    int K = 11;
    assertEquals(9707980, kthelement.find(A, B, K));
  }

  @Test
  public void case76() {
    int A = 0;
    int B = 0;
    int K = 1000000000;
    assertEquals(0, kthelement.find(A, B, K));
  }

  @Test
  public void case77() {
    int A = 0;
    int B = 0;
    int K = 1;
    assertEquals(0, kthelement.find(A, B, K));
  }

  @Test
  public void case78() {
    int A = 0;
    int B = 0;
    int K = 2;
    assertEquals(0, kthelement.find(A, B, K));
  }

  @Test
  public void case79() {
    int A = 0;
    int B = 1;
    int K = 1000000000;
    assertEquals(1, kthelement.find(A, B, K));
  }

  @Test
  public void case80() {
    int A = 0;
    int B = 1;
    int K = 1;
    assertEquals(1, kthelement.find(A, B, K));
  }

  @Test
  public void case81() {
    int A = 0;
    int B = 1;
    int K = 2;
    assertEquals(1, kthelement.find(A, B, K));
  }

  @Test
  public void case82() {
    int A = 1;
    int B = 0;
    int K = 1000000000;
    assertEquals(0, kthelement.find(A, B, K));
  }

  @Test
  public void case83() {
    int A = 1;
    int B = 0;
    int K = 1;
    assertEquals(0, kthelement.find(A, B, K));
  }

  @Test
  public void case84() {
    int A = 1;
    int B = 0;
    int K = 2;
    assertEquals(0, kthelement.find(A, B, K));
  }

  @Test
  public void case85() {
    int A = 1000000;
    int B = 1000000;
    int K = 1000000000;
    assertEquals(8000000, kthelement.find(A, B, K));
  }

  @Test
  public void case86() {
    int A = 1000000;
    int B = 1000000;
    int K = 999999999;
    assertEquals(8000000, kthelement.find(A, B, K));
  }

  @Test
  public void case87() {
    int A = 999999;
    int B = 1000000;
    int K = 1000000000;
    assertEquals(16999984, kthelement.find(A, B, K));
  }

  @Test
  public void case88() {
    int A = 1000000;
    int B = 999999;
    int K = 1000000000;
    assertEquals(16999999, kthelement.find(A, B, K));
  }

  @Test
  public void case89() {
    int A = 999999;
    int B = 999999;
    int K = 999999999;
    assertEquals(13999986, kthelement.find(A, B, K));
  }

  @Test
  public void case90() {
    int A = 999999;
    int B = 799993;
    int K = 999999999;
    assertEquals(12799981, kthelement.find(A, B, K));
  }

  @Test
  public void case91() {
    int A = 219469;
    int B = 524287;
    int K = 934754745;
    assertEquals(3157915, kthelement.find(A, B, K));
  }

  @Test
  public void case92() {
    int A = 542392;
    int B = 524287;
    int K = 934875475;
    assertEquals(8660167, kthelement.find(A, B, K));
  }

  @Test
  public void case93() {
    int A = 99999;
    int B = 48585;
    int K = 1000000000;
    assertEquals(1148574, kthelement.find(A, B, K));
  }

  @Test
  public void case94() {
    int A = 99998;
    int B = 48595;
    int K = 1000000000;
    assertEquals(2048555, kthelement.find(A, B, K));
  }

  @Test
  public void case95() {
    int A = 99997;
    int B = 48605;
    int K = 1000000000;
    assertEquals(1148572, kthelement.find(A, B, K));
  }

  @Test
  public void case96() {
    int A = 99996;
    int B = 48615;
    int K = 1000000000;
    assertEquals(1048575, kthelement.find(A, B, K));
  }

  @Test
  public void case97() {
    int A = 99994;
    int B = 48635;
    int K = 1000000000;
    assertEquals(948581, kthelement.find(A, B, K));
  }

  @Test
  public void case98() {
    int A = 99968;
    int B = 73343;
    int K = 1000000000;
    assertEquals(1572863, kthelement.find(A, B, K));
  }

  @Test
  public void case99() {
    int A = 99158;
    int B = 85493;
    int K = 1000000000;
    assertEquals(1572863, kthelement.find(A, B, K));
  }

  @Test
  public void case100() {
    int A = 699050;
    int B = 699050;
    int K = 1000000000;
    assertEquals(14680050, kthelement.find(A, B, K));
  }

  @Test
  public void case101() {
    int A = 293451;
    int B = 765339;
    int K = 999999999;
    assertEquals(4286751, kthelement.find(A, B, K));
  }

  @Test
  public void case102() {
    int A = 1000000;
    int B = 1000000;
    int K = 1000000000;
    assertEquals(8000000, kthelement.find(A, B, K));
  }

  @Test
  public void case103() {
    int A = 293451;
    int B = 765339;
    int K = 900000000;
    assertEquals(3993300, kthelement.find(A, B, K));
  }

  @Test
  public void case104() {
    int A = 5;
    int B = 12;
    int K = 500000000;
    assertEquals(32, kthelement.find(A, B, K));
  }

  @Test
  public void case105() {
    int A = 856785;
    int B = 789485;
    int K = 1000000000;
    assertEquals(11070905, kthelement.find(A, B, K));
  }

  @Test
  public void case106() {
    int A = 293451;
    int B = 765339;
    int K = 1000000000;
    assertEquals(3993300, kthelement.find(A, B, K));
  }

  @Test
  public void case107() {
    int A = 351431;
    int B = 751534;
    int K = 9787412;
    assertEquals(6374430, kthelement.find(A, B, K));
  }

  @Test
  public void case108() {
    int A = 79;
    int B = 4;
    int K = 700000000;
    assertEquals(478, kthelement.find(A, B, K));
  }

  @Test
  public void case109() {
    int A = 1;
    int B = 7;
    int K = 2;
    assertEquals(10, kthelement.find(A, B, K));
  }

  @Test
  public void case110() {
    int A = 15;
    int B = 21;
    int K = 1;
    assertEquals(21, kthelement.find(A, B, K));
  }

}
