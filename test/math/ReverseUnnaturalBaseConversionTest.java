package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ReverseUnnaturalBaseConversionTest {
  ReverseUnnaturalBaseConversion reverseunnaturalbaseconversion = new ReverseUnnaturalBaseConversion();

  @Test
  public void case1() {
    int x = 12345;
    int b = 10;
    assertEquals("12345", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case2() {
    int x = 8265;
    int b = -10;
    assertEquals("12345", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case3() {
    int x = 1001;
    int b = -2;
    assertEquals("10000111001", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case4() {
    int x = -52;
    int b = -2;
    assertEquals("11011100", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case5() {
    int x = -38;
    int b = 4;
    assertEquals("-212", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case6() {
    int x = -123456789;
    int b = -7;
    assertEquals("3031330536", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case7() {
    int x = 0;
    int b = 2;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case8() {
    int x = 0;
    int b = -2;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case9() {
    int x = 1000000000;
    int b = 2;
    assertEquals("111011100110101100101000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case10() {
    int x = -1000000000;
    int b = 2;
    assertEquals("-111011100110101100101000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case11() {
    int x = 1000000000;
    int b = -2;
    assertEquals("1001100111011111101111000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case12() {
    int x = -1000000000;
    int b = -2;
    assertEquals("11000101101001010100101000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case13() {
    int x = 0;
    int b = 3;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case14() {
    int x = 0;
    int b = -3;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case15() {
    int x = 1000000000;
    int b = 3;
    assertEquals("2120200200021010001", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case16() {
    int x = -1000000000;
    int b = 3;
    assertEquals("-2120200200021010001", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case17() {
    int x = 1000000000;
    int b = -3;
    assertEquals("120220201100111010001", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case18() {
    int x = -1000000000;
    int b = -3;
    assertEquals("11211100201202120012", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case19() {
    int x = 0;
    int b = 4;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case20() {
    int x = 0;
    int b = -4;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case21() {
    int x = 1000000000;
    int b = 4;
    assertEquals("323212230220000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case22() {
    int x = -1000000000;
    int b = 4;
    assertEquals("-323212230220000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case23() {
    int x = 1000000000;
    int b = -4;
    assertEquals("13010222311220000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case24() {
    int x = -1000000000;
    int b = -4;
    assertEquals("1131333230320000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case25() {
    int x = 0;
    int b = 5;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case26() {
    int x = 0;
    int b = -5;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case27() {
    int x = 1000000000;
    int b = 5;
    assertEquals("4022000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case28() {
    int x = -1000000000;
    int b = 5;
    assertEquals("-4022000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case29() {
    int x = 1000000000;
    int b = -5;
    assertEquals("4033000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case30() {
    int x = -1000000000;
    int b = -5;
    assertEquals("11132000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case31() {
    int x = 0;
    int b = 6;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case32() {
    int x = 0;
    int b = -6;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case33() {
    int x = 1000000000;
    int b = 6;
    assertEquals("243121245344", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case34() {
    int x = -1000000000;
    int b = 6;
    assertEquals("-243121245344", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case35() {
    int x = 1000000000;
    int b = -6;
    assertEquals("1453242451424", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case36() {
    int x = -1000000000;
    int b = -6;
    assertEquals("324535310352", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case37() {
    int x = 0;
    int b = 7;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case38() {
    int x = 0;
    int b = -7;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case39() {
    int x = 1000000000;
    int b = 7;
    assertEquals("33531600616", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case40() {
    int x = -1000000000;
    int b = 7;
    assertEquals("-33531600616", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case41() {
    int x = 1000000000;
    int b = -7;
    assertEquals("44642116066", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case42() {
    int x = -1000000000;
    int b = -7;
    assertEquals("144246601121", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case43() {
    int x = 0;
    int b = 8;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case44() {
    int x = 0;
    int b = -8;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case45() {
    int x = 1000000000;
    int b = 8;
    assertEquals("7346545000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case46() {
    int x = -1000000000;
    int b = 8;
    assertEquals("-7346545000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case47() {
    int x = 1000000000;
    int b = -8;
    assertEquals("11447353000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case48() {
    int x = -1000000000;
    int b = -8;
    assertEquals("170552645000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case49() {
    int x = 0;
    int b = 9;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case50() {
    int x = 0;
    int b = -9;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case51() {
    int x = 1000000000;
    int b = 9;
    assertEquals("2520607101", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case52() {
    int x = -1000000000;
    int b = 9;
    assertEquals("-2520607101", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case53() {
    int x = 1000000000;
    int b = -9;
    assertEquals("17671312101", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case54() {
    int x = -1000000000;
    int b = -9;
    assertEquals("3420608818", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case55() {
    int x = 0;
    int b = 10;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case56() {
    int x = 0;
    int b = -10;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case57() {
    int x = 1000000000;
    int b = 10;
    assertEquals("1000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case58() {
    int x = -1000000000;
    int b = 10;
    assertEquals("-1000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case59() {
    int x = 1000000000;
    int b = -10;
    assertEquals("19000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case60() {
    int x = -1000000000;
    int b = -10;
    assertEquals("1000000000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case61() {
    int x = 52721;
    int b = -2;
    assertEquals("11101001000110001", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case62() {
    int x = 0;
    int b = -6;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case63() {
    int x = 9443489;
    int b = -3;
    assertEquals("200110020012022", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case64() {
    int x = -1285;
    int b = -4;
    assertEquals("230023", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case65() {
    int x = 701;
    int b = -9;
    assertEquals("18048", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case66() {
    int x = 17;
    int b = -2;
    assertEquals("10001", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case67() {
    int x = -99;
    int b = -9;
    assertEquals("1820", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case68() {
    int x = -5305;
    int b = -8;
    assertEquals("173507", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case69() {
    int x = -19;
    int b = -2;
    assertEquals("111101", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case70() {
    int x = -3469;
    int b = -5;
    assertEquals("103241", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case71() {
    int x = 198;
    int b = -9;
    assertEquals("350", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case72() {
    int x = 0;
    int b = -5;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case73() {
    int x = -467853;
    int b = -10;
    assertEquals("548267", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case74() {
    int x = 436;
    int b = -8;
    assertEquals("724", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case75() {
    int x = -54296;
    int b = -6;
    assertEquals("15100424", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case76() {
    int x = -704538943;
    int b = -10;
    assertEquals("1316679157", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case77() {
    int x = 8;
    int b = -7;
    assertEquals("161", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case78() {
    int x = -79;
    int b = -9;
    assertEquals("1802", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case79() {
    int x = -3375;
    int b = -9;
    assertEquals("5460", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case80() {
    int x = -15135;
    int b = -5;
    assertEquals("14011020", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case81() {
    int x = -91;
    int b = -9;
    assertEquals("1828", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case82() {
    int x = -7583669;
    int b = -4;
    assertEquals("211131213123", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case83() {
    int x = 55226322;
    int b = -9;
    assertEquals("275136350", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case84() {
    int x = 1959534;
    int b = -2;
    assertEquals("11000100011101110110010", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case85() {
    int x = 7;
    int b = -10;
    assertEquals("7", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case86() {
    int x = -97780540;
    int b = -5;
    assertEquals("200022010430", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case87() {
    int x = -677;
    int b = -5;
    assertEquals("141313", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case88() {
    int x = 32239499;
    int b = -8;
    assertEquals("213171773", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case89() {
    int x = 188463;
    int b = -5;
    assertEquals("132023433", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case90() {
    int x = -101979;
    int b = -10;
    assertEquals("102181", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case91() {
    int x = 57150;
    int b = -7;
    assertEquals("1432552", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case92() {
    int x = 3;
    int b = -8;
    assertEquals("3", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case93() {
    int x = 7;
    int b = -10;
    assertEquals("7", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case94() {
    int x = -37619;
    int b = -6;
    assertEquals("511501", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case95() {
    int x = 91;
    int b = -8;
    assertEquals("253", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case96() {
    int x = -20602923;
    int b = -9;
    assertEquals("57712113", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case97() {
    int x = 55;
    int b = -6;
    assertEquals("231", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case98() {
    int x = -2976;
    int b = -3;
    assertEquals("22002020", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case99() {
    int x = 4580;
    int b = -10;
    assertEquals("16620", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case100() {
    int x = 44;
    int b = -5;
    assertEquals("224", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case101() {
    int x = 204;
    int b = -10;
    assertEquals("204", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case102() {
    int x = -3805892;
    int b = -4;
    assertEquals("113213123010", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case103() {
    int x = -4;
    int b = -5;
    assertEquals("11", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case104() {
    int x = -66;
    int b = -6;
    assertEquals("1550", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case105() {
    int x = -826;
    int b = -4;
    assertEquals("111132", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case106() {
    int x = 107984260;
    int b = -2;
    assertEquals("11011101100001100101010000100", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case107() {
    int x = 829598045;
    int b = -7;
    assertEquals("31413421253", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case108() {
    int x = 1710332;
    int b = -9;
    assertEquals("4703288", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case109() {
    int x = 20187887;
    int b = -8;
    assertEquals("275013437", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case110() {
    int x = 2;
    int b = -8;
    assertEquals("2", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case111() {
    int x = 79;
    int b = -3;
    assertEquals("10011", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case112() {
    int x = 6951;
    int b = -2;
    assertEquals("110111101111011", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case113() {
    int x = -249361;
    int b = -8;
    assertEquals("17047037", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case114() {
    int x = -7517926;
    int b = -2;
    assertEquals("100111010101100101101110", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case115() {
    int x = 6969761;
    int b = -8;
    assertEquals("153464741", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case116() {
    int x = -3963448;
    int b = -10;
    assertEquals("16044652", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case117() {
    int x = 389209887;
    int b = -6;
    assertEquals("1514422055423", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case118() {
    int x = -4;
    int b = -2;
    assertEquals("1100", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case119() {
    int x = -8477;
    int b = -8;
    assertEquals("161443", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case120() {
    int x = 47;
    int b = -4;
    assertEquals("313", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case121() {
    int x = 613328;
    int b = -8;
    assertEquals("3662060", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case122() {
    int x = 4585;
    int b = -3;
    assertEquals("111201021", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case123() {
    int x = -305241;
    int b = -9;
    assertEquals("685343", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case124() {
    int x = 63;
    int b = -7;
    assertEquals("250", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case125() {
    int x = 5;
    int b = -8;
    assertEquals("5", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case126() {
    int x = 45;
    int b = -2;
    assertEquals("1111101", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case127() {
    int x = 112394238;
    int b = -9;
    assertEquals("345543086", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case128() {
    int x = -64314729;
    int b = -8;
    assertEquals("1573337367", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case129() {
    int x = 46233;
    int b = -10;
    assertEquals("54373", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case130() {
    int x = 7;
    int b = -3;
    assertEquals("111", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case131() {
    int x = -4;
    int b = -10;
    assertEquals("16", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case132() {
    int x = 72250;
    int b = -2;
    assertEquals("10110111001001110", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case133() {
    int x = -6106156;
    int b = -8;
    assertEquals("31366064", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case134() {
    int x = 83214;
    int b = -3;
    assertEquals("22110022000", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case135() {
    int x = -37081;
    int b = -6;
    assertEquals("524215", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case136() {
    int x = 6935;
    int b = -8;
    assertEquals("23567", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case137() {
    int x = -427341;
    int b = -9;
    assertEquals("872886", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case138() {
    int x = -709419;
    int b = -6;
    assertEquals("33253413", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case139() {
    int x = 3372;
    int b = -8;
    assertEquals("12534", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case140() {
    int x = 761776;
    int b = -5;
    assertEquals("214241101", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case141() {
    int x = 0;
    int b = 2;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case142() {
    int x = 0;
    int b = -2;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case143() {
    int x = 0;
    int b = -7;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case144() {
    int x = 0;
    int b = 10;
    assertEquals("0", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case145() {
    int x = -123456789;
    int b = -8;
    assertEquals("1131047433", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case146() {
    int x = -52;
    int b = -2;
    assertEquals("11011100", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case147() {
    int x = -856428451;
    int b = -3;
    assertEquals("11110100222011000202", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case148() {
    int x = 1001;
    int b = -2;
    assertEquals("10000111001", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case149() {
    int x = -123456789;
    int b = -7;
    assertEquals("3031330536", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

  @Test
  public void case150() {
    int x = 98265;
    int b = -10;
    assertEquals("1902345", reverseunnaturalbaseconversion.convertToBase(x, b));
  }

}
