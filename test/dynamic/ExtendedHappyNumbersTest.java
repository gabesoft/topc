package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class ExtendedHappyNumbersTest {
  ExtendedHappyNumbers extendedhappynumbers = new ExtendedHappyNumbers();

  @Test
  public void case1() {
    int A = 13;
    int B = 13;
    int K = 2;
    assertEquals(1L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case2() {
    int A = 1;
    int B = 5;
    int K = 2;
    assertEquals(14L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case3() {
    int A = 10;
    int B = 99;
    int K = 1;
    assertEquals(450L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case4() {
    int A = 535;
    int B = 538;
    int K = 3;
    assertEquals(820L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case5() {
    int A = 72637;
    int B = 74236;
    int K = 5;
    assertEquals(11789917L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case6() {
    int A = 100000;
    int B = 400000;
    int K = 6;
    assertEquals(5169721292L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case7() {
    int A = 1;
    int B = 1000000;
    int K = 1;
    assertEquals(4999996L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case8() {
    int A = 1;
    int B = 1000000;
    int K = 2;
    assertEquals(3449108L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case9() {
    int A = 1;
    int B = 1000000;
    int K = 3;
    assertEquals(160104496L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case10() {
    int A = 1;
    int B = 1000000;
    int K = 4;
    assertEquals(662296074L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case11() {
    int A = 1;
    int B = 1000000;
    int K = 5;
    assertEquals(6399861874L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case12() {
    int A = 1;
    int B = 1000000;
    int K = 6;
    assertEquals(17031865483L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case13() {
    int A = 1;
    int B = 1;
    int K = 6;
    assertEquals(1L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case14() {
    int A = 2;
    int B = 2;
    int K = 6;
    assertEquals(2L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case15() {
    int A = 999999;
    int B = 999999;
    int K = 6;
    assertEquals(5619L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case16() {
    int A = 999999;
    int B = 999999;
    int K = 5;
    assertEquals(309L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case17() {
    int A = 568625;
    int B = 621730;
    int K = 6;
    assertEquals(978533935L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case18() {
    int A = 670270;
    int B = 810950;
    int K = 4;
    assertEquals(95153223L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case19() {
    int A = 854744;
    int B = 971170;
    int K = 6;
    assertEquals(2194469088L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case20() {
    int A = 476423;
    int B = 491337;
    int K = 3;
    assertEquals(2515259L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case21() {
    int A = 242739;
    int B = 840550;
    int K = 5;
    assertEquals(3872455375L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case22() {
    int A = 222558;
    int B = 543391;
    int K = 5;
    assertEquals(1970098456L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case23() {
    int A = 112843;
    int B = 445295;
    int K = 5;
    assertEquals(2009503692L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case24() {
    int A = 822402;
    int B = 909381;
    int K = 3;
    assertEquals(14099100L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case25() {
    int A = 943019;
    int B = 986251;
    int K = 4;
    assertEquals(28690265L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case26() {
    int A = 772328;
    int B = 982900;
    int K = 3;
    assertEquals(33823866L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case27() {
    int A = 664486;
    int B = 775299;
    int K = 6;
    assertEquals(1955466546L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case28() {
    int A = 984799;
    int B = 994910;
    int K = 5;
    assertEquals(62963877L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case29() {
    int A = 176725;
    int B = 731853;
    int K = 2;
    assertEquals(1913156L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case30() {
    int A = 343782;
    int B = 559543;
    int K = 6;
    assertEquals(3801037388L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case31() {
    int A = 95563;
    int B = 615898;
    int K = 3;
    assertEquals(82927342L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case32() {
    int A = 853244;
    int B = 963813;
    int K = 3;
    assertEquals(17628851L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case33() {
    int A = 786558;
    int B = 978964;
    int K = 6;
    assertEquals(3672572090L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case34() {
    int A = 233616;
    int B = 869623;
    int K = 6;
    assertEquals(11428330857L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case35() {
    int A = 190015;
    int B = 738105;
    int K = 5;
    assertEquals(3479382561L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case36() {
    int A = 984572;
    int B = 986912;
    int K = 4;
    assertEquals(1518223L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case37() {
    int A = 95506;
    int B = 769624;
    int K = 3;
    assertEquals(107923684L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case38() {
    int A = 854990;
    int B = 874785;
    int K = 3;
    assertEquals(3197612L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case39() {
    int A = 713111;
    int B = 916052;
    int K = 3;
    assertEquals(33160169L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case40() {
    int A = 103454;
    int B = 105991;
    int K = 6;
    assertEquals(37842086L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case41() {
    int A = 940911;
    int B = 962628;
    int K = 6;
    assertEquals(393226747L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case42() {
    int A = 720841;
    int B = 726017;
    int K = 1;
    assertEquals(25884L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case43() {
    int A = 408088;
    int B = 628656;
    int K = 5;
    assertEquals(1402436454L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case44() {
    int A = 367107;
    int B = 695991;
    int K = 1;
    assertEquals(1644426L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case45() {
    int A = 239072;
    int B = 742764;
    int K = 3;
    assertEquals(80655956L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case46() {
    int A = 232040;
    int B = 396659;
    int K = 3;
    assertEquals(25972811L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case47() {
    int A = 441925;
    int B = 709354;
    int K = 2;
    assertEquals(923870L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case48() {
    int A = 288411;
    int B = 590095;
    int K = 5;
    assertEquals(1894517320L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case49() {
    int A = 835746;
    int B = 837884;
    int K = 4;
    assertEquals(1331533L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case50() {
    int A = 190918;
    int B = 261935;
    int K = 3;
    assertEquals(10742235L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case51() {
    int A = 436115;
    int B = 500637;
    int K = 1;
    assertEquals(322610L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case52() {
    int A = 314423;
    int B = 520705;
    int K = 3;
    assertEquals(33337440L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case53() {
    int A = 110706;
    int B = 532823;
    int K = 3;
    assertEquals(67225380L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case54() {
    int A = 50425;
    int B = 647687;
    int K = 3;
    assertEquals(95469633L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case55() {
    int A = 381832;
    int B = 496887;
    int K = 6;
    assertEquals(2029335895L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case56() {
    int A = 818648;
    int B = 983398;
    int K = 1;
    assertEquals(823752L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case57() {
    int A = 811629;
    int B = 876592;
    int K = 5;
    assertEquals(449437168L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case58() {
    int A = 402757;
    int B = 950032;
    int K = 4;
    assertEquals(367974407L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case59() {
    int A = 577260;
    int B = 665132;
    int K = 6;
    assertEquals(1609236767L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case60() {
    int A = 753721;
    int B = 836741;
    int K = 6;
    assertEquals(1553958826L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case61() {
    int A = 125945;
    int B = 817759;
    int K = 5;
    assertEquals(4422341415L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case62() {
    int A = 588950;
    int B = 787112;
    int K = 4;
    assertEquals(134018239L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case63() {
    int A = 740923;
    int B = 940171;
    int K = 6;
    assertEquals(3728420695L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case64() {
    int A = 518554;
    int B = 753707;
    int K = 6;
    assertEquals(4143643049L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case65() {
    int A = 896686;
    int B = 958314;
    int K = 4;
    assertEquals(40923299L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case66() {
    int A = 905439;
    int B = 909645;
    int K = 4;
    assertEquals(2756821L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case67() {
    int A = 106031;
    int B = 133842;
    int K = 4;
    assertEquals(17282141L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case68() {
    int A = 197709;
    int B = 270506;
    int K = 3;
    assertEquals(10926867L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case69() {
    int A = 757551;
    int B = 982135;
    int K = 3;
    assertEquals(36135598L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case70() {
    int A = 6033;
    int B = 895106;
    int K = 4;
    assertEquals(590240188L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case71() {
    int A = 743729;
    int B = 761411;
    int K = 4;
    assertEquals(12385279L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case72() {
    int A = 640808;
    int B = 932547;
    int K = 5;
    assertEquals(2005740356L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case73() {
    int A = 338590;
    int B = 959556;
    int K = 5;
    assertEquals(4123964502L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case74() {
    int A = 438681;
    int B = 488244;
    int K = 6;
    assertEquals(833657679L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case75() {
    int A = 624270;
    int B = 902896;
    int K = 4;
    assertEquals(186194394L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case76() {
    int A = 50932;
    int B = 291683;
    int K = 6;
    assertEquals(3774424464L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case77() {
    int A = 57390;
    int B = 86673;
    int K = 6;
    assertEquals(413438186L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case78() {
    int A = 764470;
    int B = 968857;
    int K = 5;
    assertEquals(1408164454L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case79() {
    int A = 133902;
    int B = 648198;
    int K = 6;
    assertEquals(8967071180L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case80() {
    int A = 668710;
    int B = 768987;
    int K = 4;
    assertEquals(67997327L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case81() {
    int A = 233089;
    int B = 880967;
    int K = 3;
    assertEquals(104160405L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case82() {
    int A = 376023;
    int B = 799495;
    int K = 3;
    assertEquals(68335942L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case83() {
    int A = 914477;
    int B = 921696;
    int K = 5;
    assertEquals(53547104L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case84() {
    int A = 507348;
    int B = 831313;
    int K = 6;
    assertEquals(5761884357L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case85() {
    int A = 425434;
    int B = 817104;
    int K = 5;
    assertEquals(2595407649L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case86() {
    int A = 656264;
    int B = 978002;
    int K = 4;
    assertEquals(214593087L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case87() {
    int A = 809028;
    int B = 970012;
    int K = 5;
    assertEquals(1103920660L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case88() {
    int A = 570006;
    int B = 653284;
    int K = 6;
    assertEquals(1530539059L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case89() {
    int A = 93836;
    int B = 389691;
    int K = 4;
    assertEquals(191564227L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case90() {
    int A = 137067;
    int B = 282771;
    int K = 3;
    assertEquals(23019783L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case91() {
    int A = 408112;
    int B = 998188;
    int K = 5;
    assertEquals(3928835167L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case92() {
    int A = 671649;
    int B = 713051;
    int K = 6;
    assertEquals(786593034L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case93() {
    int A = 142632;
    int B = 998611;
    int K = 5;
    assertEquals(5561378008L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case94() {
    int A = 831133;
    int B = 987534;
    int K = 6;
    assertEquals(2976784946L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case95() {
    int A = 222714;
    int B = 240056;
    int K = 5;
    assertEquals(90342843L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case96() {
    int A = 590077;
    int B = 923592;
    int K = 3;
    assertEquals(54316662L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case97() {
    int A = 25678;
    int B = 25678;
    int K = 6;
    assertEquals(5619L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case98() {
    int A = 117888;
    int B = 117888;
    int K = 5;
    assertEquals(309L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case99() {
    int A = 234556;
    int B = 234556;
    int K = 4;
    assertEquals(99L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case100() {
    int A = 3;
    int B = 3;
    int K = 6;
    assertEquals(3L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case101() {
    int A = 7;
    int B = 7;
    int K = 5;
    assertEquals(7L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case102() {
    int A = 100000;
    int B = 400000;
    int K = 6;
    assertEquals(5169721292L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case103() {
    int A = 1;
    int B = 1000000;
    int K = 6;
    assertEquals(17031865483L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case104() {
    int A = 1234;
    int B = 926134;
    int K = 6;
    assertEquals(15675272554L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case105() {
    int A = 1;
    int B = 999999;
    int K = 6;
    assertEquals(17031865482L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case106() {
    int A = 999999;
    int B = 999999;
    int K = 6;
    assertEquals(5619L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case107() {
    int A = 1000000;
    int B = 1000000;
    int K = 6;
    assertEquals(1L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case108() {
    int A = 10;
    int B = 99;
    int K = 1;
    assertEquals(450L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case109() {
    int A = 1;
    int B = 998765;
    int K = 6;
    assertEquals(17014040712L, extendedhappynumbers.calcTheSum(A, B, K));
  }

  @Test
  public void case110() {
    int A = 1;
    int B = 100000;
    int K = 6;
    assertEquals(1120996038L, extendedhappynumbers.calcTheSum(A, B, K));
  }

}
