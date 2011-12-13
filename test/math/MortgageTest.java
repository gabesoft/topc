package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class MortgageTest {
  Mortgage mortgage = new Mortgage();

  @Test
  public void case1() {
    int loan = 1000;
    int interest = 50;
    int term = 1;
    assertEquals(86, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case2() {
    int loan = 2000000000;
    int interest = 6000;
    int term = 1;
    assertEquals(671844808, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case3() {
    int loan = 1000000;
    int interest = 1000000;
    int term = 1000;
    assertEquals(988143, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case4() {
    int loan = 1000000;
    int interest = 129;
    int term = 30;
    assertEquals(10868, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case5() {
    int loan = 100;
    int interest = 1;
    int term = 1000;
    assertEquals(2, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case6() {
    int loan = 618083873;
    int interest = 932377;
    int term = 462;
    assertEquals(610230012, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case7() {
    int loan = 37007334;
    int interest = 497647;
    int term = 389;
    assertEquals(36135971, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case8() {
    int loan = 910806859;
    int interest = 106489;
    int term = 245;
    assertEquals(818564691, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case9() {
    int loan = 620972289;
    int interest = 447604;
    int term = 815;
    assertEquals(604759055, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case10() {
    int loan = 1964106774;
    int interest = 57176;
    int term = 469;
    assertEquals(1623392057, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case11() {
    int loan = 396495408;
    int interest = 965433;
    int term = 303;
    assertEquals(391627612, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case12() {
    int loan = 1303970803;
    int interest = 751105;
    int term = 470;
    assertEquals(1283465566, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case13() {
    int loan = 560290889;
    int interest = 94158;
    int term = 606;
    assertEquals(496956137, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case14() {
    int loan = 1193263809;
    int interest = 406909;
    int term = 59;
    assertEquals(1159081766, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case15() {
    int loan = 790990757;
    int interest = 569741;
    int term = 255;
    assertEquals(774674409, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case16() {
    int loan = 1878848491;
    int interest = 765597;
    int term = 345;
    assertEquals(1849853804, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case17() {
    int loan = 1767005838;
    int interest = 159220;
    int term = 890;
    assertEquals(1643164757, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case18() {
    int loan = 160606687;
    int interest = 352973;
    int term = 961;
    assertEquals(155326077, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case19() {
    int loan = 468903894;
    int interest = 557830;
    int term = 713;
    assertEquals(459029289, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case20() {
    int loan = 622058302;
    int interest = 712197;
    int term = 633;
    assertEquals(611750749, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case21() {
    int loan = 804652054;
    int interest = 4523;
    int term = 437;
    assertEquals(220265161, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case22() {
    int loan = 317486105;
    int interest = 626173;
    int term = 530;
    assertEquals(311516199, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case23() {
    int loan = 1266328720;
    int interest = 680421;
    int term = 78;
    assertEquals(1244382615, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case24() {
    int loan = 133678780;
    int interest = 660664;
    int term = 497;
    assertEquals(131294016, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case25() {
    int loan = 180769391;
    int interest = 462677;
    int term = 325;
    assertEquals(176199478, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case26() {
    int loan = 645338021;
    int interest = 625478;
    int term = 616;
    assertEquals(633190063, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case27() {
    int loan = 534515614;
    int interest = 800188;
    int term = 584;
    assertEquals(526618197, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case28() {
    int loan = 705069909;
    int interest = 347802;
    int term = 229;
    assertEquals(681554646, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case29() {
    int loan = 614051902;
    int interest = 656351;
    int term = 585;
    assertEquals(603026823, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case30() {
    int loan = 721647343;
    int interest = 325968;
    int term = 970;
    assertEquals(696024302, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case31() {
    int loan = 1214770213;
    int interest = 843509;
    int term = 161;
    assertEquals(1197730951, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case32() {
    int loan = 925650314;
    int interest = 407094;
    int term = 289;
    assertEquals(899145989, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case33() {
    int loan = 1992772528;
    int interest = 53725;
    int term = 966;
    assertEquals(1628934258, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case34() {
    int loan = 327822429;
    int interest = 896518;
    int term = 882;
    assertEquals(323492445, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case35() {
    int loan = 1280563618;
    int interest = 750707;
    int term = 121;
    assertEquals(1260415956, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case36() {
    int loan = 1114588932;
    int interest = 332313;
    int term = 22;
    assertEquals(1075743268, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case37() {
    int loan = 61085060;
    int interest = 497791;
    int term = 148;
    assertEquals(59647176, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case38() {
    int loan = 239835955;
    int interest = 918655;
    int term = 492;
    assertEquals(236743476, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case39() {
    int loan = 252618379;
    int interest = 388703;
    int term = 450;
    assertEquals(245053124, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case40() {
    int loan = 1157290063;
    int interest = 733456;
    int term = 947;
    assertEquals(1138660553, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case41() {
    int loan = 259665595;
    int interest = 69925;
    int term = 161;
    assertEquals(221630965, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case42() {
    int loan = 929938417;
    int interest = 686154;
    int term = 508;
    assertEquals(913954464, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case43() {
    int loan = 175138409;
    int interest = 695122;
    int term = 926;
    assertEquals(172166276, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case44() {
    int loan = 1495989673;
    int interest = 426673;
    int term = 394;
    assertEquals(1455066535, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case45() {
    int loan = 1041972280;
    int interest = 681297;
    int term = 337;
    assertEquals(1023937200, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case46() {
    int loan = 1382590995;
    int interest = 11132;
    int term = 41;
    assertEquals(665355481, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case47() {
    int loan = 265538953;
    int interest = 562037;
    int term = 137;
    assertEquals(259987974, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case48() {
    int loan = 1981832936;
    int interest = 758911;
    int term = 487;
    assertEquals(1950983727, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case49() {
    int loan = 512042040;
    int interest = 323687;
    int term = 861;
    assertEquals(493737774, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case50() {
    int loan = 163543995;
    int interest = 973173;
    int term = 738;
    assertEquals(161551931, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case51() {
    int loan = 1511988723;
    int interest = 580548;
    int term = 752;
    assertEquals(1481368648, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case52() {
    int loan = 1490110002;
    int interest = 305117;
    int term = 39;
    assertEquals(1433722865, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case53() {
    int loan = 1463035902;
    int interest = 147540;
    int term = 281;
    assertEquals(1352991833, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case54() {
    int loan = 1378407427;
    int interest = 121376;
    int term = 802;
    assertEquals(1254390445, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case55() {
    int loan = 1939524178;
    int interest = 2486;
    int term = 309;
    assertEquals(332849450, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case56() {
    int loan = 182518;
    int interest = 88;
    int term = 197;
    assertEquals(1330, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case57() {
    int loan = 87128;
    int interest = 96;
    int term = 279;
    assertEquals(693, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case58() {
    int loan = 184597;
    int interest = 40;
    int term = 497;
    assertEquals(615, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case59() {
    int loan = 72135;
    int interest = 69;
    int term = 268;
    assertEquals(414, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case60() {
    int loan = 179135;
    int interest = 74;
    int term = 12;
    assertEquals(1870, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case61() {
    int loan = 48826;
    int interest = 32;
    int term = 424;
    assertEquals(131, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case62() {
    int loan = 41875;
    int interest = 84;
    int term = 677;
    assertEquals(293, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case63() {
    int loan = 177616;
    int interest = 57;
    int term = 625;
    assertEquals(841, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case64() {
    int loan = 77336;
    int interest = 83;
    int term = 661;
    assertEquals(533, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case65() {
    int loan = 13115;
    int interest = 25;
    int term = 82;
    assertEquals(32, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case66() {
    int loan = 187890;
    int interest = 49;
    int term = 103;
    assertEquals(770, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case67() {
    int loan = 164227;
    int interest = 44;
    int term = 706;
    assertEquals(601, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case68() {
    int loan = 138709;
    int interest = 23;
    int term = 280;
    assertEquals(267, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case69() {
    int loan = 9303;
    int interest = 82;
    int term = 1000;
    assertEquals(65, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case70() {
    int loan = 14512;
    int interest = 15;
    int term = 310;
    assertEquals(20, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case71() {
    int loan = 151273;
    int interest = 73;
    int term = 895;
    assertEquals(916, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case72() {
    int loan = 127121;
    int interest = 6;
    int term = 846;
    assertEquals(65, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case73() {
    int loan = 143038;
    int interest = 65;
    int term = 879;
    assertEquals(772, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case74() {
    int loan = 126061;
    int interest = 53;
    int term = 955;
    assertEquals(556, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case75() {
    int loan = 113753;
    int interest = 76;
    int term = 387;
    assertEquals(717, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case76() {
    int loan = 1999999999;
    int interest = 1000000;
    int term = 1;
    assertEquals(1976284585, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case77() {
    int loan = 2000000000;
    int interest = 6000;
    int term = 1;
    assertEquals(671844808, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case78() {
    int loan = 20000000;
    int interest = 46;
    int term = 999;
    assertEquals(76375, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case79() {
    int loan = 1000000;
    int interest = 1000000;
    int term = 1000;
    assertEquals(988143, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case80() {
    int loan = 1999999999;
    int interest = 1000000;
    int term = 1;
    assertEquals(1976284585, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case81() {
    int loan = 1999999997;
    int interest = 100000;
    int term = 1;
    assertEquals(1785714284, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case82() {
    int loan = 1000;
    int interest = 50;
    int term = 1;
    assertEquals(86, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case83() {
    int loan = 3948234;
    int interest = 984;
    int term = 73;
    assertEquals(299221, mortgage.monthlyPayment(loan, interest, term));
  }

  @Test
  public void case84() {
    int loan = 2000000000;
    int interest = 1;
    int term = 1000;
    assertEquals(263648, mortgage.monthlyPayment(loan, interest, term));
  }

}
