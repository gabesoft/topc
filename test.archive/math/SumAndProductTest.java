package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SumAndProductTest {
  SumAndProduct sumandproduct = new SumAndProduct();

  @Test
  public void case1() {
    int S = 10;
    int P = 10;
    assertEquals(1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case2() {
    int S = 10;
    int P = 20;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case3() {
    int S = 10;
    int P = 30;
    assertEquals(3, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case4() {
    int S = 10;
    int P = 34;
    assertEquals(3, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case5() {
    int S = 10;
    int P = 40;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case6() {
    int S = 2;
    int P = 3;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case7() {
    int S = 5;
    int P = 15;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case8() {
    int S = 5;
    int P = 7;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case9() {
    int S = 33;
    int P = 3333333;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case10() {
    int S = 8;
    int P = 256;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case11() {
    int S = 90;
    int P = 1000000000;
    assertEquals(9, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case12() {
    int S = 13;
    int P = 1333;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case13() {
    int S = 76;
    int P = 48828124;
    assertEquals(8, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case14() {
    int S = 60;
    int P = 60466175;
    assertEquals(10, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case15() {
    int S = 60;
    int P = 60476254;
    assertEquals(11, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case16() {
    int S = 50;
    int P = 69691719;
    assertEquals(15, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case17() {
    int S = 30;
    int P = 50805;
    assertEquals(9, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case18() {
    int S = 10;
    int P = 37;
    assertEquals(3, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case19() {
    int S = 54;
    int P = 387420489;
    assertEquals(18, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case20() {
    int S = 2;
    int P = 10;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case21() {
    int S = 68;
    int P = 552968336;
    assertEquals(12, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case22() {
    int S = 501574537;
    int P = 168;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case23() {
    int S = 260733505;
    int P = 123;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case24() {
    int S = 176;
    int P = 731260351;
    assertEquals(7, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case25() {
    int S = 159;
    int P = 349038653;
    assertEquals(7, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case26() {
    int S = 178;
    int P = 545;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case27() {
    int S = 22101078;
    int P = 56;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case28() {
    int S = 85;
    int P = 813890305;
    assertEquals(10, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case29() {
    int S = 142;
    int P = 753661427;
    assertEquals(7, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case30() {
    int S = 104;
    int P = 36813313;
    assertEquals(7, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case31() {
    int S = 108;
    int P = 935052470;
    assertEquals(8, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case32() {
    int S = 216358530;
    int P = 59;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case33() {
    int S = 44;
    int P = 987027754;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case34() {
    int S = 63;
    int P = 111127993;
    assertEquals(11, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case35() {
    int S = 294366393;
    int P = 73;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case36() {
    int S = 161;
    int P = 190595378;
    assertEquals(6, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case37() {
    int S = 53;
    int P = 92297437;
    assertEquals(14, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case38() {
    int S = 74;
    int P = 1925;
    assertEquals(3, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case39() {
    int S = 4;
    int P = 1727;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case40() {
    int S = 437028657;
    int P = 85;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case41() {
    int S = 94;
    int P = 632627638;
    assertEquals(9, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case42() {
    int S = 73;
    int P = 267515019;
    assertEquals(10, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case43() {
    int S = 46;
    int P = 742167708;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case44() {
    int S = 18;
    int P = 352700208;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case45() {
    int S = 62;
    int P = 11348479;
    assertEquals(8, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case46() {
    int S = 893;
    int P = 128;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case47() {
    int S = 15;
    int P = 754084469;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case48() {
    int S = 559055798;
    int P = 47;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case49() {
    int S = 179;
    int P = 125352733;
    assertEquals(6, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case50() {
    int S = 178;
    int P = 702476855;
    assertEquals(7, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case51() {
    int S = 827156827;
    int P = 247465052;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case52() {
    int S = 197;
    int P = 1033;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case53() {
    int S = 256947828;
    int P = 770;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case54() {
    int S = 32304905;
    int P = 757677834;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case55() {
    int S = 765;
    int P = 340992350;
    assertEquals(4, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case56() {
    int S = 425850548;
    int P = 785;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case57() {
    int S = 1443;
    int P = 93102370;
    assertEquals(3, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case58() {
    int S = 203110238;
    int P = 994773300;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case59() {
    int S = 1635;
    int P = 376530665;
    assertEquals(4, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case60() {
    int S = 561;
    int P = 772126853;
    assertEquals(5, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case61() {
    int S = 873727942;
    int P = 180782666;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case62() {
    int S = 831965745;
    int P = 947161312;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case63() {
    int S = 1468658;
    int P = 744;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case64() {
    int S = 1309;
    int P = 78610884;
    assertEquals(3, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case65() {
    int S = 1575;
    int P = 386164359;
    assertEquals(4, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case66() {
    int S = 503672315;
    int P = 345;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case67() {
    int S = 300;
    int P = 188016688;
    assertEquals(5, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case68() {
    int S = 325020298;
    int P = 851048036;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case69() {
    int S = 495913889;
    int P = 706869234;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case70() {
    int S = 273253323;
    int P = 312669917;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case71() {
    int S = 40053118;
    int P = 404;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case72() {
    int S = 918461504;
    int P = 908103053;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case73() {
    int S = 398368799;
    int P = 442;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case74() {
    int S = 29150901;
    int P = 819731125;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case75() {
    int S = 943;
    int P = 96751180;
    assertEquals(4, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case76() {
    int S = 93011343;
    int P = 990783761;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case77() {
    int S = 376;
    int P = 470347088;
    assertEquals(5, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case78() {
    int S = 286;
    int P = 85084726;
    assertEquals(5, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case79() {
    int S = 904815917;
    int P = 302202836;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case80() {
    int S = 459334573;
    int P = 642487918;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case81() {
    int S = 718088328;
    int P = 495208119;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case82() {
    int S = 981574249;
    int P = 626713388;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case83() {
    int S = 239752737;
    int P = 654835951;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case84() {
    int S = 420317754;
    int P = 771995929;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case85() {
    int S = 116512458;
    int P = 673157331;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case86() {
    int S = 253191786;
    int P = 301076386;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case87() {
    int S = 698092704;
    int P = 755690907;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case88() {
    int S = 657995489;
    int P = 676009395;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case89() {
    int S = 581705076;
    int P = 811828279;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case90() {
    int S = 288025440;
    int P = 459213433;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case91() {
    int S = 442665519;
    int P = 895037622;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case92() {
    int S = 160467794;
    int P = 716496406;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case93() {
    int S = 27242347;
    int P = 123054132;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case94() {
    int S = 928077250;
    int P = 247198559;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case95() {
    int S = 687733114;
    int P = 958261438;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case96() {
    int S = 900182235;
    int P = 140501888;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case97() {
    int S = 15844541;
    int P = 915940835;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case98() {
    int S = 975;
    int P = 953987377;
    assertEquals(4, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case99() {
    int S = 52906374;
    int P = 118081944;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case100() {
    int S = 520448041;
    int P = 669667622;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case101() {
    int S = 290;
    int P = 725648598;
    assertEquals(6, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case102() {
    int S = 57;
    int P = 1000000000;
    assertEquals(18, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case103() {
    int S = 56;
    int P = 1000000000;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case104() {
    int S = 5;
    int P = 6;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case105() {
    int S = 5;
    int P = 100;
    assertEquals(-1, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case106() {
    int S = 100;
    int P = 1000000000;
    assertEquals(9, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case107() {
    int S = 90;
    int P = 58077950;
    assertEquals(7, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case108() {
    int S = 90;
    int P = 58077951;
    assertEquals(8, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case109() {
    int S = 82;
    int P = 3;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case110() {
    int S = 1000000000;
    int P = 1;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case111() {
    int S = 5;
    int P = 1;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case112() {
    int S = 11;
    int P = 10;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case113() {
    int S = 28;
    int P = 1;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case114() {
    int S = 12345678;
    int P = 133;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case115() {
    int S = 100;
    int P = 10;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case116() {
    int S = 567;
    int P = 23472547;
    assertEquals(4, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case117() {
    int S = 1000000000;
    int P = 999999999;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case118() {
    int S = 2;
    int P = 1;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case119() {
    int S = 25;
    int P = 9;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case120() {
    int S = 597125597;
    int P = 868112354;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case121() {
    int S = 1000000000;
    int P = 999999937;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case122() {
    int S = 20;
    int P = 10;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case123() {
    int S = 1000000000;
    int P = 1000;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case124() {
    int S = 1000000000;
    int P = 2;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case125() {
    int S = 900000000;
    int P = 1000000000;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case126() {
    int S = 6;
    int P = 5;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case127() {
    int S = 10;
    int P = 1;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case128() {
    int S = 999999999;
    int P = 1000000000;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case129() {
    int S = 39;
    int P = 9621;
    assertEquals(5, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case130() {
    int S = 999999991;
    int P = 111123141;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case131() {
    int S = 1000000000;
    int P = 100;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case132() {
    int S = 999999999;
    int P = 1;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case133() {
    int S = 4;
    int P = 1;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case134() {
    int S = 103;
    int P = 216;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case135() {
    int S = 62;
    int P = 1000000000;
    assertEquals(14, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case136() {
    int S = 8;
    int P = 16;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

  @Test
  public void case137() {
    int S = 100;
    int P = 1;
    assertEquals(2, sumandproduct.smallestSet(S, P));
  }

}
