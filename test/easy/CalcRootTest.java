package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class CalcRootTest {
  CalcRoot calcroot = new CalcRoot();

  @Test
  public void case1() {
    int N = 4;
    int D = 10;
    assertEquals("2/1", calcroot.approximate(N, D));
  }

  @Test
  public void case2() {
    int N = 5;
    int D = 3;
    assertEquals("7/3", calcroot.approximate(N, D));
  }

  @Test
  public void case3() {
    int N = 12;
    int D = 10;
    assertEquals("31/9", calcroot.approximate(N, D));
  }

  @Test
  public void case4() {
    int N = 23743;
    int D = 763;
    assertEquals("98462/639", calcroot.approximate(N, D));
  }

  @Test
  public void case5() {
    int N = 991746;
    int D = 903;
    assertEquals("837522/841", calcroot.approximate(N, D));
  }

  @Test
  public void case6() {
    int N = 69;
    int D = 5;
    assertEquals("25/3", calcroot.approximate(N, D));
  }

  @Test
  public void case7() {
    int N = 29;
    int D = 32;
    assertEquals("70/13", calcroot.approximate(N, D));
  }

  @Test
  public void case8() {
    int N = 53;
    int D = 1;
    assertEquals("7/1", calcroot.approximate(N, D));
  }

  @Test
  public void case9() {
    int N = 73;
    int D = 61;
    assertEquals("487/57", calcroot.approximate(N, D));
  }

  @Test
  public void case10() {
    int N = 21;
    int D = 1;
    assertEquals("5/1", calcroot.approximate(N, D));
  }

  @Test
  public void case11() {
    int N = 41;
    int D = 81;
    assertEquals("397/62", calcroot.approximate(N, D));
  }

  @Test
  public void case12() {
    int N = 17;
    int D = 25;
    assertEquals("33/8", calcroot.approximate(N, D));
  }

  @Test
  public void case13() {
    int N = 65;
    int D = 7;
    assertEquals("8/1", calcroot.approximate(N, D));
  }

  @Test
  public void case14() {
    int N = 46;
    int D = 47;
    assertEquals("156/23", calcroot.approximate(N, D));
  }

  @Test
  public void case15() {
    int N = 622311;
    int D = 92;
    assertEquals("11833/15", calcroot.approximate(N, D));
  }

  @Test
  public void case16() {
    int N = 264041;
    int D = 50;
    assertEquals("16957/33", calcroot.approximate(N, D));
  }

  @Test
  public void case17() {
    int N = 756386;
    int D = 81;
    assertEquals("38267/44", calcroot.approximate(N, D));
  }

  @Test
  public void case18() {
    int N = 426901;
    int D = 1;
    assertEquals("653/1", calcroot.approximate(N, D));
  }

  @Test
  public void case19() {
    int N = 426901;
    int D = 13;
    assertEquals("5227/8", calcroot.approximate(N, D));
  }

  @Test
  public void case20() {
    int N = 267545;
    int D = 68;
    assertEquals("33621/65", calcroot.approximate(N, D));
  }

  @Test
  public void case21() {
    int N = 267545;
    int D = 68;
    assertEquals("33621/65", calcroot.approximate(N, D));
  }

  @Test
  public void case22() {
    int N = 407369;
    int D = 15;
    assertEquals("2553/4", calcroot.approximate(N, D));
  }

  @Test
  public void case23() {
    int N = 407369;
    int D = 19;
    assertEquals("2553/4", calcroot.approximate(N, D));
  }

  @Test
  public void case24() {
    int N = 330966;
    int D = 93;
    assertEquals("15533/27", calcroot.approximate(N, D));
  }

  @Test
  public void case25() {
    int N = 630297;
    int D = 511;
    assertEquals("299305/377", calcroot.approximate(N, D));
  }

  @Test
  public void case26() {
    int N = 845032;
    int D = 412;
    assertEquals("369541/402", calcroot.approximate(N, D));
  }

  @Test
  public void case27() {
    int N = 844899;
    int D = 763;
    assertEquals("649863/707", calcroot.approximate(N, D));
  }

  @Test
  public void case28() {
    int N = 987955;
    int D = 551;
    assertEquals("268369/270", calcroot.approximate(N, D));
  }

  @Test
  public void case29() {
    int N = 30230;
    int D = 123;
    assertEquals("21038/121", calcroot.approximate(N, D));
  }

  @Test
  public void case30() {
    int N = 30230;
    int D = 123;
    assertEquals("21038/121", calcroot.approximate(N, D));
  }

  @Test
  public void case31() {
    int N = 831401;
    int D = 705;
    assertEquals("504232/553", calcroot.approximate(N, D));
  }

  @Test
  public void case32() {
    int N = 822089;
    int D = 958;
    assertEquals("651911/719", calcroot.approximate(N, D));
  }

  @Test
  public void case33() {
    int N = 802089;
    int D = 958;
    assertEquals("836485/934", calcroot.approximate(N, D));
  }

  @Test
  public void case34() {
    int N = 306283;
    int D = 374;
    assertEquals("3874/7", calcroot.approximate(N, D));
  }

  @Test
  public void case35() {
    int N = 852501;
    int D = 187;
    assertEquals("169889/184", calcroot.approximate(N, D));
  }

  @Test
  public void case36() {
    int N = 852301;
    int D = 187;
    assertEquals("123709/134", calcroot.approximate(N, D));
  }

  @Test
  public void case37() {
    int N = 679471;
    int D = 361;
    assertEquals("266249/323", calcroot.approximate(N, D));
  }

  @Test
  public void case38() {
    int N = 409096;
    int D = 787;
    assertEquals("292300/457", calcroot.approximate(N, D));
  }

  @Test
  public void case39() {
    int N = 677285;
    int D = 297;
    assertEquals("153896/187", calcroot.approximate(N, D));
  }

  @Test
  public void case40() {
    int N = 673283;
    int D = 297;
    assertEquals("236315/288", calcroot.approximate(N, D));
  }

  @Test
  public void case41() {
    int N = 513729;
    int D = 826;
    assertEquals("493840/689", calcroot.approximate(N, D));
  }

  @Test
  public void case42() {
    int N = 864738;
    int D = 810;
    assertEquals("555158/597", calcroot.approximate(N, D));
  }

  @Test
  public void case43() {
    int N = 893057;
    int D = 725;
    assertEquals("670017/709", calcroot.approximate(N, D));
  }

  @Test
  public void case44() {
    int N = 405537;
    int D = 11;
    assertEquals("7005/11", calcroot.approximate(N, D));
  }

  @Test
  public void case45() {
    int N = 923273;
    int D = 1000;
    assertEquals("29787/31", calcroot.approximate(N, D));
  }

  @Test
  public void case46() {
    int N = 911323;
    int D = 1000;
    assertEquals("371352/389", calcroot.approximate(N, D));
  }

  @Test
  public void case47() {
    int N = 964997;
    int D = 1000;
    assertEquals("564847/575", calcroot.approximate(N, D));
  }

  @Test
  public void case48() {
    int N = 932436;
    int D = 1000;
    assertEquals("588067/609", calcroot.approximate(N, D));
  }

  @Test
  public void case49() {
    int N = 971073;
    int D = 1000;
    assertEquals("707539/718", calcroot.approximate(N, D));
  }

  @Test
  public void case50() {
    int N = 963341;
    int D = 1000;
    assertEquals("770477/785", calcroot.approximate(N, D));
  }

  @Test
  public void case51() {
    int N = 943089;
    int D = 1000;
    assertEquals("585590/603", calcroot.approximate(N, D));
  }

  @Test
  public void case52() {
    int N = 959967;
    int D = 1000;
    assertEquals("851428/869", calcroot.approximate(N, D));
  }

  @Test
  public void case53() {
    int N = 958146;
    int D = 1000;
    assertEquals("948505/969", calcroot.approximate(N, D));
  }

  @Test
  public void case54() {
    int N = 927561;
    int D = 1000;
    assertEquals("608679/632", calcroot.approximate(N, D));
  }

  @Test
  public void case55() {
    int N = 927561;
    int D = 1000;
    assertEquals("608679/632", calcroot.approximate(N, D));
  }

  @Test
  public void case56() {
    int N = 938401;
    int D = 1000;
    assertEquals("968711/1000", calcroot.approximate(N, D));
  }

  @Test
  public void case57() {
    int N = 942491;
    int D = 1000;
    assertEquals("560163/577", calcroot.approximate(N, D));
  }

  @Test
  public void case58() {
    int N = 917827;
    int D = 1000;
    assertEquals("844985/882", calcroot.approximate(N, D));
  }

  @Test
  public void case59() {
    int N = 950896;
    int D = 1000;
    assertEquals("357876/367", calcroot.approximate(N, D));
  }

  @Test
  public void case60() {
    int N = 923141;
    int D = 1000;
    assertEquals("592815/617", calcroot.approximate(N, D));
  }

  @Test
  public void case61() {
    int N = 938598;
    int D = 1000;
    assertEquals("687857/710", calcroot.approximate(N, D));
  }

  @Test
  public void case62() {
    int N = 945350;
    int D = 1000;
    assertEquals("798251/821", calcroot.approximate(N, D));
  }

  @Test
  public void case63() {
    int N = 915881;
    int D = 1000;
    assertEquals("915865/957", calcroot.approximate(N, D));
  }

  @Test
  public void case64() {
    int N = 990329;
    int D = 1000;
    assertEquals("560271/563", calcroot.approximate(N, D));
  }

  @Test
  public void case65() {
    int N = 1;
    int D = 1;
    assertEquals("1/1", calcroot.approximate(N, D));
  }

  @Test
  public void case66() {
    int N = 2;
    int D = 1;
    assertEquals("1/1", calcroot.approximate(N, D));
  }

  @Test
  public void case67() {
    int N = 1;
    int D = 2;
    assertEquals("1/1", calcroot.approximate(N, D));
  }

  @Test
  public void case68() {
    int N = 2;
    int D = 1000;
    assertEquals("1393/985", calcroot.approximate(N, D));
  }

  @Test
  public void case69() {
    int N = 999993;
    int D = 1000;
    assertEquals("856997/857", calcroot.approximate(N, D));
  }

  @Test
  public void case70() {
    int N = 998001;
    int D = 1000;
    assertEquals("999/1", calcroot.approximate(N, D));
  }

  @Test
  public void case71() {
    int N = 998000;
    int D = 1000;
    assertEquals("998999/1000", calcroot.approximate(N, D));
  }

  @Test
  public void case72() {
    int N = 998002;
    int D = 1000;
    assertEquals("999001/1000", calcroot.approximate(N, D));
  }

  @Test
  public void case73() {
    int N = 671348;
    int D = 1000;
    assertEquals("667777/815", calcroot.approximate(N, D));
  }

  @Test
  public void case74() {
    int N = 234728;
    int D = 1000;
    assertEquals("210752/435", calcroot.approximate(N, D));
  }

  @Test
  public void case75() {
    int N = 896649;
    int D = 1000;
    assertEquals("549211/580", calcroot.approximate(N, D));
  }

  @Test
  public void case76() {
    int N = 872865;
    int D = 1000;
    assertEquals("895033/958", calcroot.approximate(N, D));
  }

  @Test
  public void case77() {
    int N = 105462;
    int D = 1000;
    assertEquals("280908/865", calcroot.approximate(N, D));
  }

  @Test
  public void case78() {
    int N = 117609;
    int D = 1000;
    assertEquals("158782/463", calcroot.approximate(N, D));
  }

  @Test
  public void case79() {
    int N = 161840;
    int D = 1000;
    assertEquals("238560/593", calcroot.approximate(N, D));
  }

  @Test
  public void case80() {
    int N = 767095;
    int D = 1000;
    assertEquals("606081/692", calcroot.approximate(N, D));
  }

  @Test
  public void case81() {
    int N = 894579;
    int D = 1000;
    assertEquals("233618/247", calcroot.approximate(N, D));
  }

  @Test
  public void case82() {
    int N = 468639;
    int D = 1000;
    assertEquals("279990/409", calcroot.approximate(N, D));
  }

  @Test
  public void case83() {
    int N = 499455;
    int D = 1000;
    assertEquals("677039/958", calcroot.approximate(N, D));
  }

  @Test
  public void case84() {
    int N = 771858;
    int D = 1000;
    assertEquals("459484/523", calcroot.approximate(N, D));
  }

  @Test
  public void case85() {
    int N = 102134;
    int D = 776;
    assertEquals("172895/541", calcroot.approximate(N, D));
  }

  @Test
  public void case86() {
    int N = 382098;
    int D = 938;
    assertEquals("505021/817", calcroot.approximate(N, D));
  }

  @Test
  public void case87() {
    int N = 24806;
    int D = 789;
    assertEquals("99067/629", calcroot.approximate(N, D));
  }

  @Test
  public void case88() {
    int N = 931221;
    int D = 522;
    assertEquals("465129/482", calcroot.approximate(N, D));
  }

  @Test
  public void case89() {
    int N = 362520;
    int D = 956;
    assertEquals("443745/737", calcroot.approximate(N, D));
  }

  @Test
  public void case90() {
    int N = 470436;
    int D = 829;
    assertEquals("317564/463", calcroot.approximate(N, D));
  }

  @Test
  public void case91() {
    int N = 798602;
    int D = 554;
    assertEquals("488824/547", calcroot.approximate(N, D));
  }

  @Test
  public void case92() {
    int N = 718484;
    int D = 369;
    assertEquals("305996/361", calcroot.approximate(N, D));
  }

  @Test
  public void case93() {
    int N = 736680;
    int D = 564;
    assertEquals("402543/469", calcroot.approximate(N, D));
  }

  @Test
  public void case94() {
    int N = 131689;
    int D = 616;
    assertEquals("134995/372", calcroot.approximate(N, D));
  }

  @Test
  public void case95() {
    int N = 656496;
    int D = 948;
    assertEquals("470752/581", calcroot.approximate(N, D));
  }

  @Test
  public void case96() {
    int N = 138067;
    int D = 857;
    assertEquals("259730/699", calcroot.approximate(N, D));
  }

  @Test
  public void case97() {
    int N = 923780;
    int D = 659;
    assertEquals("592059/616", calcroot.approximate(N, D));
  }

  @Test
  public void case98() {
    int N = 983580;
    int D = 914;
    assertEquals("906465/914", calcroot.approximate(N, D));
  }

  @Test
  public void case99() {
    int N = 57840;
    int D = 963;
    assertEquals("231120/961", calcroot.approximate(N, D));
  }

  @Test
  public void case100() {
    int N = 953235;
    int D = 871;
    assertEquals("850390/871", calcroot.approximate(N, D));
  }

  @Test
  public void case101() {
    int N = 951698;
    int D = 998;
    assertEquals("973599/998", calcroot.approximate(N, D));
  }

  @Test
  public void case102() {
    int N = 949181;
    int D = 706;
    assertEquals("661522/679", calcroot.approximate(N, D));
  }

  @Test
  public void case103() {
    int N = 945035;
    int D = 883;
    assertEquals("858390/883", calcroot.approximate(N, D));
  }

  @Test
  public void case104() {
    int N = 206654;
    int D = 711;
    assertEquals("323215/711", calcroot.approximate(N, D));
  }

  @Test
  public void case105() {
    int N = 996183;
    int D = 959;
    assertEquals("367297/368", calcroot.approximate(N, D));
  }

  @Test
  public void case106() {
    int N = 991746;
    int D = 841;
    assertEquals("837522/841", calcroot.approximate(N, D));
  }

  @Test
  public void case107() {
    int N = 987222;
    int D = 608;
    assertEquals("499776/503", calcroot.approximate(N, D));
  }

  @Test
  public void case108() {
    int N = 11745;
    int D = 1000;
    assertEquals("62532/577", calcroot.approximate(N, D));
  }

  @Test
  public void case109() {
    int N = 15770;
    int D = 1000;
    assertEquals("91798/731", calcroot.approximate(N, D));
  }

  @Test
  public void case110() {
    int N = 40602;
    int D = 1000;
    assertEquals("162207/805", calcroot.approximate(N, D));
  }

  @Test
  public void case111() {
    int N = 150290;
    int D = 1000;
    assertEquals("264005/681", calcroot.approximate(N, D));
  }

  @Test
  public void case112() {
    int N = 193857;
    int D = 1000;
    assertEquals("131207/298", calcroot.approximate(N, D));
  }

  @Test
  public void case113() {
    int N = 218378;
    int D = 1000;
    assertEquals("376184/805", calcroot.approximate(N, D));
  }

  @Test
  public void case114() {
    int N = 87;
    int D = 83;
    assertEquals("513/55", calcroot.approximate(N, D));
  }

  @Test
  public void case115() {
    int N = 23743;
    int D = 763;
    assertEquals("98462/639", calcroot.approximate(N, D));
  }

  @Test
  public void case116() {
    int N = 991746;
    int D = 903;
    assertEquals("837522/841", calcroot.approximate(N, D));
  }

  @Test
  public void case117() {
    int N = 999999;
    int D = 1000;
    assertEquals("999999/1000", calcroot.approximate(N, D));
  }

  @Test
  public void case118() {
    int N = 536538;
    int D = 923;
    assertEquals("676086/923", calcroot.approximate(N, D));
  }

  @Test
  public void case119() {
    int N = 1;
    int D = 1;
    assertEquals("1/1", calcroot.approximate(N, D));
  }

  @Test
  public void case120() {
    int N = 990021;
    int D = 498;
    assertEquals("494514/497", calcroot.approximate(N, D));
  }

  @Test
  public void case121() {
    int N = 980002;
    int D = 999;
    assertEquals("980051/990", calcroot.approximate(N, D));
  }

  @Test
  public void case122() {
    int N = 999999;
    int D = 1;
    assertEquals("1000/1", calcroot.approximate(N, D));
  }

  @Test
  public void case123() {
    int N = 593021;
    int D = 982;
    assertEquals("686140/891", calcroot.approximate(N, D));
  }

  @Test
  public void case124() {
    int N = 998634;
    int D = 1000;
    assertEquals("864409/865", calcroot.approximate(N, D));
  }

}
