package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class AutoLoanTest {
  double DELTA = 1.0e-05;
  AutoLoan autoloan = new AutoLoan();

  @Test
  public void case1() {
    double price = 6800.0;
    double monthlyPayment = 100.0;
    int loanTerm = 68;
    assertEquals(1.3322616182218813e-13, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 1.3322616182218813e-13);
  }

  @Test
  public void case2() {
    double price = 2000.0;
    double monthlyPayment = 510.0;
    int loanTerm = 4;
    assertEquals(9.56205462458368, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 9.56205462458368);
  }

  @Test
  public void case3() {
    double price = 15000.0;
    double monthlyPayment = 364.0;
    int loanTerm = 48;
    assertEquals(7.687856394581649, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 7.687856394581649);
  }

  @Test
  public void case4() {
    double price = 10000.0;
    double monthlyPayment = 385.0;
    int loanTerm = 30;
    assertEquals(11.473054204549669, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 11.473054204549669);
  }

  @Test
  public void case5() {
    double price = 200.0;
    double monthlyPayment = 15.0;
    int loanTerm = 600;
    assertEquals(89.99999999999982, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 89.99999999999982);
  }

  @Test
  public void case6() {
    double price = 1000000.0;
    double monthlyPayment = 1667.0;
    int loanTerm = 600;
    assertEquals(0.0007986158248041164, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 0.0007986158248041164);
  }

  @Test
  public void case7() {
    double price = 724556.0;
    double monthlyPayment = 50505.0;
    int loanTerm = 575;
    assertEquals(83.64570854426711, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 83.64570854426711);
  }

  @Test
  public void case8() {
    double price = 332696.0;
    double monthlyPayment = 10951.0;
    int loanTerm = 136;
    assertEquals(38.98851536883803, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 38.98851536883803);
  }

  @Test
  public void case9() {
    double price = 23002.0;
    double monthlyPayment = 4709.0;
    int loanTerm = 6;
    assertEquals(74.54805516148613, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 74.54805516148613);
  }

  @Test
  public void case10() {
    double price = 492214.0;
    double monthlyPayment = 2049.0;
    int loanTerm = 471;
    assertEquals(3.9204806010895594, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 3.9204806010895594);
  }

  @Test
  public void case11() {
    double price = 740192.0;
    double monthlyPayment = 7185.0;
    int loanTerm = 588;
    assertEquals(11.607783057395558, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 11.607783057395558);
  }

  @Test
  public void case12() {
    double price = 570542.0;
    double monthlyPayment = 24374.0;
    int loanTerm = 65;
    assertEquals(47.05796362542851, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 47.05796362542851);
  }

  @Test
  public void case13() {
    double price = 407050.0;
    double monthlyPayment = 35078.0;
    int loanTerm = 17;
    assertEquals(55.397079816319696, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 55.397079816319696);
  }

  @Test
  public void case14() {
    double price = 140192.0;
    double monthlyPayment = 1491.0;
    int loanTerm = 454;
    assertEquals(12.653412761497272, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 12.653412761497272);
  }

  @Test
  public void case15() {
    double price = 219252.0;
    double monthlyPayment = 8934.0;
    int loanTerm = 337;
    assertEquals(48.897089628821746, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 48.897089628821746);
  }

  @Test
  public void case16() {
    double price = 506973.0;
    double monthlyPayment = 11900.0;
    int loanTerm = 50;
    assertEquals(7.7628540286105885, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 7.7628540286105885);
  }

  @Test
  public void case17() {
    double price = 281335.0;
    double monthlyPayment = 16982.0;
    int loanTerm = 54;
    assertEquals(68.87780115037442, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 68.87780115037442);
  }

  @Test
  public void case18() {
    double price = 286417.0;
    double monthlyPayment = 9239.0;
    int loanTerm = 145;
    assertEquals(38.30192971448798, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 38.30192971448798);
  }

  @Test
  public void case19() {
    double price = 140642.0;
    double monthlyPayment = 1293.0;
    int loanTerm = 561;
    assertEquals(10.965203755132924, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 10.965203755132924);
  }

  @Test
  public void case20() {
    double price = 389951.0;
    double monthlyPayment = 12413.0;
    int loanTerm = 163;
    assertEquals(37.9601927752288, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 37.9601927752288);
  }

  @Test
  public void case21() {
    double price = 973110.0;
    double monthlyPayment = 337873.0;
    int loanTerm = 3;
    assertEquals(24.80783488352443, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 24.80783488352443);
  }

  @Test
  public void case22() {
    double price = 230977.0;
    double monthlyPayment = 67123.0;
    int loanTerm = 4;
    assertEquals(75.65099005216278, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 75.65099005216278);
  }

  @Test
  public void case23() {
    double price = 61703.0;
    double monthlyPayment = 16197.0;
    int loanTerm = 4;
    assertEquals(23.76581938256987, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 23.76581938256987);
  }

  @Test
  public void case24() {
    double price = 44755.0;
    double monthlyPayment = 8959.0;
    int loanTerm = 5;
    assertEquals(0.3574309895975514, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 0.3574309895975514);
  }

  @Test
  public void case25() {
    double price = 297007.0;
    double monthlyPayment = 56775.0;
    int loanTerm = 6;
    assertEquals(48.76330124289328, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 48.76330124289328);
  }

  @Test
  public void case26() {
    double price = 584755.0;
    double monthlyPayment = 1613.0;
    int loanTerm = 475;
    assertEquals(1.4303822503235695, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 1.4303822503235695);
  }

  @Test
  public void case27() {
    double price = 5628.0;
    double monthlyPayment = 2197.0;
    int loanTerm = 3;
    assertEquals(100.00000000000003, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 100.00000000000003);
  }

  @Test
  public void case28() {
    double price = 6800.0;
    double monthlyPayment = 100.0;
    int loanTerm = 68;
    assertEquals(1.3322616182218813e-13, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 1.3322616182218813e-13);
  }

  @Test
  public void case29() {
    double price = 15000.0;
    double monthlyPayment = 364.0;
    int loanTerm = 48;
    assertEquals(7.687856394581649, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 7.687856394581649);
  }

  @Test
  public void case30() {
    double price = 2000.0;
    double monthlyPayment = 510.0;
    int loanTerm = 4;
    assertEquals(9.56205462458368, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 9.56205462458368);
  }

  @Test
  public void case31() {
    double price = 60000.0;
    double monthlyPayment = 4999.0;
    int loanTerm = 600;
    assertEquals(99.9799999999999, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 99.9799999999999);
  }

  @Test
  public void case32() {
    double price = 100001.0;
    double monthlyPayment = 989.0;
    int loanTerm = 599;
    assertEquals(11.834664337677792, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 11.834664337677792);
  }

  @Test
  public void case33() {
    double price = 1000.0;
    double monthlyPayment = 500.0;
    int loanTerm = 2;
    assertEquals(1.3322616182218813e-13, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 1.3322616182218813e-13);
  }

  @Test
  public void case34() {
    double price = 12.0;
    double monthlyPayment = 1.0;
    int loanTerm = 500;
    assertEquals(99.99999999999977, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 99.99999999999977);
  }

  @Test
  public void case35() {
    double price = 1000000.0;
    double monthlyPayment = 2500.0;
    int loanTerm = 600;
    assertEquals(1.7463073077668143, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 1.7463073077668143);
  }

  @Test
  public void case36() {
    double price = 1.0;
    double monthlyPayment = 0.142857142857143;
    int loanTerm = 7;
    assertEquals(3.9968010105369827e-13, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 3.9968010105369827e-13);
  }

  @Test
  public void case37() {
    double price = 1000000.0;
    double monthlyPayment = 79865.0;
    int loanTerm = 599;
    assertEquals(95.83799999999995, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 95.83799999999995);
  }

  @Test
  public void case38() {
    double price = 999999.0;
    double monthlyPayment = 3000.0;
    int loanTerm = 599;
    assertEquals(2.6299652255705737, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 2.6299652255705737);
  }

  @Test
  public void case39() {
    double price = 15000.0;
    double monthlyPayment = 364.0;
    int loanTerm = 600;
    assertEquals(29.11998354222205, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 29.11998354222205);
  }

  @Test
  public void case40() {
    double price = 9.999999991;
    double monthlyPayment = 2.5;
    int loanTerm = 4;
    assertEquals(4.320001689699897e-07, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 4.320001689699897e-07);
  }

  @Test
  public void case41() {
    double price = 200.0;
    double monthlyPayment = 100.0;
    int loanTerm = 2;
    assertEquals(1.3322616182218813e-13, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 1.3322616182218813e-13);
  }

  @Test
  public void case42() {
    double price = 1000.0;
    double monthlyPayment = 40.0;
    int loanTerm = 34;
    assertEquals(22.418392731637795, autoloan.interestRate(price, monthlyPayment, loanTerm), DELTA * 22.418392731637795);
  }

}
