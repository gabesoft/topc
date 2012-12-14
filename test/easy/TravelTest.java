package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TravelTest {
  Travel travel = new Travel();

  @Test
  public void case1() {
    String[] cities = { "26 -126", "-52 53", "-20 -89", "-61 -92", "0 -78", "-22 -1", "-83 87" };
    int radius = 351;
    assertEquals(2142, travel.shortest(cities, radius));
  }

  @Test
  public void case2() {
    String[] cities = { "90 0", "0 0", "-90 0", "0 180", "0 90", "0 -90" };
    int radius = 1000;
    assertEquals(9425, travel.shortest(cities, radius));
  }

  @Test
  public void case3() {
    String[] cities = { "0 0", "0 1" };
    int radius = 1000;
    assertEquals(35, travel.shortest(cities, radius));
  }

  @Test
  public void case4() {
    String[] cities = { "0 0", "0 1", "0 -1", "-1 0", "1 0", "-1 -1", "1 1", "1 -1", "-1 1" };
    int radius = 1;
    assertEquals(0, travel.shortest(cities, radius));
  }

  @Test
  public void case5() {
    String[] cities = { "0 0", "0 1", "0 -1", "-1 0", "1 0", "-1 -1", "1 1", "1 -1", "-1 1" };
    int radius = 10;
    assertEquals(2, travel.shortest(cities, radius));
  }

  @Test
  public void case6() {
    String[] cities = { "40 -82", "-27 -59", "-40 48", "26 -12", "-31 -37", "-30 42", "-36 -23", "-26 71", "-19 83", "8 63" };
    int radius = 698;
    assertEquals(4505, travel.shortest(cities, radius));
  }

  @Test
  public void case7() {
    String[] cities = { "-32 28", "-19 115", "-81 -63", "-6 -179", "-56 68", "50 -59", "-60 7", "89 83" };
    int radius = 849;
    assertEquals(6893, travel.shortest(cities, radius));
  }

  @Test
  public void case8() {
    String[] cities = { "-71 -74", "18 52", "-87 176" };
    int radius = 528;
    assertEquals(2287, travel.shortest(cities, radius));
  }

  @Test
  public void case9() {
    String[] cities = { "-35 108", "-12 -6", "-13 137", "-31 132" };
    int radius = 453;
    assertEquals(2180, travel.shortest(cities, radius));
  }

  @Test
  public void case10() {
    String[] cities = { "64 -113", "-5 122", "84 -133", "-31 38" };
    int radius = 490;
    assertEquals(2898, travel.shortest(cities, radius));
  }

  @Test
  public void case11() {
    String[] cities = { "2 -2", "-44 -18", "-63 -160", "-40 -12", "67 168", "-7 174", "42 -124", "84 -132", "4 -2" };
    int radius = 130;
    assertEquals(925, travel.shortest(cities, radius));
  }

  @Test
  public void case12() {
    String[] cities = { "-45 -86", "-45 79", "13 48", "-60 -127", "-66 -121", "74 117", "15 -3", "76 3" };
    int radius = 15;
    assertEquals(110, travel.shortest(cities, radius));
  }

  @Test
  public void case13() {
    String[] cities = { "14 -108", "-27 49", "63 0", "34 -113", "90 -171", "20 102" };
    int radius = 931;
    assertEquals(6492, travel.shortest(cities, radius));
  }

  @Test
  public void case14() {
    String[] cities = { "-25 169", "74 172", "52 -84", "54 125", "63 -165", "65 -98", "56 157", "-7 129" };
    int radius = 442;
    assertEquals(2444, travel.shortest(cities, radius));
  }

  @Test
  public void case15() {
    String[] cities = { "26 88", "-2 -148", "63 124", "-4 72", "-63 34", "-64 -40", "55 -59" };
    int radius = 957;
    assertEquals(7066, travel.shortest(cities, radius));
  }

  @Test
  public void case16() {
    String[] cities = { "52 -150", "-16 -166", "-88 -166", "58 -157", "58 147", "-32 41" };
    int radius = 125;
    assertEquals(790, travel.shortest(cities, radius));
  }

  @Test
  public void case17() {
    String[] cities = { "1 -69", "-44 83", "-59 -79", "-64 10" };
    int radius = 998;
    assertEquals(4647, travel.shortest(cities, radius));
  }

  @Test
  public void case18() {
    String[] cities = { "-73 97", "61 -53", "16 -62" };
    int radius = 647;
    assertEquals(3735, travel.shortest(cities, radius));
  }

  @Test
  public void case19() {
    String[] cities = { "-63 -54", "-9 -36", "-45 84", "-49 -22", "28 12", "7 -50", "-20 -7", "-72 -39", "-3 -90" };
    int radius = 253;
    assertEquals(1780, travel.shortest(cities, radius));
  }

  @Test
  public void case20() {
    String[] cities = { "54 96", "10 -165", "8 0", "-67 -90" };
    int radius = 48;
    assertEquals(306, travel.shortest(cities, radius));
  }

  @Test
  public void case21() {
    String[] cities = { "9 67", "65 50", "-12 130", "39 156", "-5 37", "-45 107", "-38 120" };
    int radius = 636;
    assertEquals(3551, travel.shortest(cities, radius));
  }

  @Test
  public void case22() {
    String[] cities = { "28 -91", "22 122", "77 -77" };
    int radius = 346;
    assertEquals(1513, travel.shortest(cities, radius));
  }

  @Test
  public void case23() {
    String[] cities = { "62 -172", "0 24", "51 25", "-49 83", "27 -79", "80 176", "-24 -104", "-73 51" };
    int radius = 853;
    assertEquals(6269, travel.shortest(cities, radius));
  }

  @Test
  public void case24() {
    String[] cities = { "-33 122", "-79 5", "-47 -12", "-70 22" };
    int radius = 376;
    assertEquals(1220, travel.shortest(cities, radius));
  }

  @Test
  public void case25() {
    String[] cities = { "-30 10", "-73 109", "-46 178", "35 55", "74 -54", "-71 -21", "-21 132" };
    int radius = 370;
    assertEquals(2763, travel.shortest(cities, radius));
  }

  @Test
  public void case26() {
    String[] cities = { "90 159", "-5 -132", "-2 -152", "9 158", "19 165" };
    int radius = 761;
    assertEquals(3311, travel.shortest(cities, radius));
  }

  @Test
  public void case27() {
    String[] cities = { "-70 19", "-46 -43", "-9 -89", "36 -75", "-24 143", "-25 40" };
    int radius = 99;
    assertEquals(728, travel.shortest(cities, radius));
  }

  @Test
  public void case28() {
    String[] cities = { "-2 -53", "-5 132" };
    int radius = 89;
    assertEquals(532, travel.shortest(cities, radius));
  }

  @Test
  public void case29() {
    String[] cities = { "-32 161", "6 -6", "-15 24", "84 -26" };
    int radius = 718;
    assertEquals(4514, travel.shortest(cities, radius));
  }

  @Test
  public void case30() {
    String[] cities = { "5 -96", "-2 -46", "-55 -148", "-53 28" };
    int radius = 15;
    assertEquals(72, travel.shortest(cities, radius));
  }

  @Test
  public void case31() {
    String[] cities = { "53 169", "-57 -163", "68 59", "-66 -23", "-84 -152", "-28 -134", "-36 -13" };
    int radius = 59;
    assertEquals(393, travel.shortest(cities, radius));
  }

  @Test
  public void case32() {
    String[] cities = { "-84 58", "0 134", "-32 -167", "-29 -15" };
    int radius = 962;
    assertEquals(5447, travel.shortest(cities, radius));
  }

  @Test
  public void case33() {
    String[] cities = { "21 -136", "65 -122", "-63 88", "-62 -103", "12 -146", "-22 -123", "-63 -70", "72 153" };
    int radius = 180;
    assertEquals(1195, travel.shortest(cities, radius));
  }

  @Test
  public void case34() {
    String[] cities = { "69 -84", "12 137", "44 -19", "66 0", "44 168", "2 -135", "-65 171", "-7 138", "20 -179" };
    int radius = 777;
    assertEquals(5940, travel.shortest(cities, radius));
  }

  @Test
  public void case35() {
    String[] cities = { "-24 -133", "-75 -4", "-40 -170", "24 65", "-49 -168", "-36 -48", "-45 -142" };
    int radius = 301;
    assertEquals(2129, travel.shortest(cities, radius));
  }

  @Test
  public void case36() {
    String[] cities = { "67 28", "33 133", "-33 4" };
    int radius = 137;
    assertEquals(729, travel.shortest(cities, radius));
  }

  @Test
  public void case37() {
    String[] cities = { "31 161", "25 -31", "-1 9" };
    int radius = 751;
    assertEquals(4056, travel.shortest(cities, radius));
  }

  @Test
  public void case38() {
    String[] cities = { "-60 68", "-52 128", "90 -99", "8 -140", "-33 175", "-83 5", "-37 -32", "-15 122" };
    int radius = 778;
    assertEquals(6312, travel.shortest(cities, radius));
  }

  @Test
  public void case39() {
    String[] cities = { "53 115", "-62 -112", "16 -159", "53 65", "45 -133", "-8 142", "72 165", "74 18", "-30 -81" };
    int radius = 127;
    assertEquals(991, travel.shortest(cities, radius));
  }

  @Test
  public void case40() {
    String[] cities = { "64 146", "41 -44", "37 83", "-20 -104" };
    int radius = 415;
    assertEquals(2411, travel.shortest(cities, radius));
  }

  @Test
  public void case41() {
    String[] cities = { "-34 -91", "74 40", "-49 -44", "-39 -177" };
    int radius = 977;
    assertEquals(6480, travel.shortest(cities, radius));
  }

  @Test
  public void case42() {
    String[] cities = { "83 117", "49 24", "-72 -27", "16 14", "79 -158", "-73 54", "79 -47", "18 -148", "-70 -1" };
    int radius = 371;
    assertEquals(2583, travel.shortest(cities, radius));
  }

  @Test
  public void case43() {
    String[] cities = { "72 -42", "-13 40", "-9 -41", "30 -70" };
    int radius = 696;
    assertEquals(3301, travel.shortest(cities, radius));
  }

  @Test
  public void case44() {
    String[] cities = { "77 -150", "-60 141", "31 -134" };
    int radius = 615;
    assertEquals(3265, travel.shortest(cities, radius));
  }

  @Test
  public void case45() {
    String[] cities = { "-70 -47", "-64 121", "-68 -30", "-55 -94" };
    int radius = 259;
    assertEquals(615, travel.shortest(cities, radius));
  }

  @Test
  public void case46() {
    String[] cities = { "-26 -93", "54 152", "-8 -71", "-73 -23", "24 116", "-29 -61", "24 45", "51 -46" };
    int radius = 425;
    assertEquals(3354, travel.shortest(cities, radius));
  }

  @Test
  public void case47() {
    String[] cities = { "-59 -56", "33 32", "56 40", "-21 118", "-18 -148", "81 -34", "-82 156", "68 -16" };
    int radius = 436;
    assertEquals(3432, travel.shortest(cities, radius));
  }

  @Test
  public void case48() {
    String[] cities = { "71 -100", "-3 -97", "66 -154", "20 -27", "42 22", "19 -98", "26 160", "-52 0", "-34 -156" };
    int radius = 258;
    assertEquals(2316, travel.shortest(cities, radius));
  }

  @Test
  public void case49() {
    String[] cities = { "-14 -33", "5 103", "16 130", "-18 -47", "47 -163", "-88 -48", "35 -164", "-33 -27", "-31 158" };
    int radius = 483;
    assertEquals(3677, travel.shortest(cities, radius));
  }

  @Test
  public void case50() {
    String[] cities = { "-48 -162", "-75 175", "-6 -33", "-82 156", "-26 163", "-42 21", "12 147", "-55 32", "82 153" };
    int radius = 221;
    assertEquals(1548, travel.shortest(cities, radius));
  }

  @Test
  public void case51() {
    String[] cities = { "-42 170", "-53 -130" };
    int radius = 694;
    assertEquals(986, travel.shortest(cities, radius));
  }

  @Test
  public void case52() {
    String[] cities = { "9 -12", "59 -73", "59 36", "83 99", "-4 98" };
    int radius = 449;
    assertEquals(2538, travel.shortest(cities, radius));
  }

  @Test
  public void case53() {
    String[] cities = { "64 141", "68 -30", "-59 177", "-60 60", "-70 -109" };
    int radius = 957;
    assertEquals(6654, travel.shortest(cities, radius));
  }

  @Test
  public void case54() {
    String[] cities = { "-5 -56", "18 -150", "72 101", "-80 178", "-35 -123", "76 96", "86 101" };
    int radius = 644;
    assertEquals(4402, travel.shortest(cities, radius));
  }

  @Test
  public void case55() {
    String[] cities = { "64 60", "0 99", "18 25" };
    int radius = 685;
    assertEquals(2351, travel.shortest(cities, radius));
  }

  @Test
  public void case56() {
    String[] cities = { "-23 176", "-33 -60", "-54 97", "0 63", "82 147" };
    int radius = 28;
    assertEquals(219, travel.shortest(cities, radius));
  }

  @Test
  public void case57() {
    String[] cities = { "33 -176", "-10 180", "81 -79" };
    int radius = 256;
    assertEquals(908, travel.shortest(cities, radius));
  }

  @Test
  public void case58() {
    String[] cities = { "10 175", "-19 43", "14 -132", "4 4", "-56 -21", "-58 -81", "-73 107" };
    int radius = 865;
    assertEquals(6531, travel.shortest(cities, radius));
  }

  @Test
  public void case59() {
    String[] cities = { "-85 -145", "13 157", "-2 62", "-73 78", "18 70" };
    int radius = 495;
    assertEquals(2571, travel.shortest(cities, radius));
  }

  @Test
  public void case60() {
    String[] cities = { "11 -32", "-55 -133", "0 42", "-9 -70", "87 53", "-25 174", "50 113", "-17 -103", "-12 41" };
    int radius = 640;
    assertEquals(5307, travel.shortest(cities, radius));
  }

  @Test
  public void case61() {
    String[] cities = { "-3 162", "34 -142" };
    int radius = 172;
    assertEquals(386, travel.shortest(cities, radius));
  }

  @Test
  public void case62() {
    String[] cities = { "-53 87", "-69 -163", "3 67" };
    int radius = 576;
    assertEquals(2136, travel.shortest(cities, radius));
  }

  @Test
  public void case63() {
    String[] cities = { "24 44", "-21 174" };
    int radius = 221;
    assertEquals(1033, travel.shortest(cities, radius));
  }

  @Test
  public void case64() {
    String[] cities = { "-26 52", "77 -160", "-4 59", "-17 130", "20 -66", "76 -115", "41 83", "-2 158" };
    int radius = 33;
    assertEquals(252, travel.shortest(cities, radius));
  }

  @Test
  public void case65() {
    String[] cities = { "-16 -27", "-16 -156", "-12 63", "28 151", "-60 12", "88 14", "10 -138", "-64 56", "30 35" };
    int radius = 147;
    assertEquals(1305, travel.shortest(cities, radius));
  }

  @Test
  public void case66() {
    String[] cities = { "49 76", "7 -27", "-58 57", "-24 -60", "22 -177", "60 70", "-8 125" };
    int radius = 838;
    assertEquals(6528, travel.shortest(cities, radius));
  }

  @Test
  public void case67() {
    String[] cities = { "83 -4", "68 58", "-19 -125" };
    int radius = 103;
    assertEquals(473, travel.shortest(cities, radius));
  }

  @Test
  public void case68() {
    String[] cities = { "-49 -46", "-8 82", "-52 -92", "14 52", "0 -48" };
    int radius = 557;
    assertEquals(3251, travel.shortest(cities, radius));
  }

  @Test
  public void case69() {
    String[] cities = { "-82 167", "67 -76", "76 54", "-59 94" };
    int radius = 73;
    assertEquals(459, travel.shortest(cities, radius));
  }

  @Test
  public void case70() {
    String[] cities = { "36 -16", "-68 33", "-69 27", "8 115", "16 -135" };
    int radius = 699;
    assertEquals(5071, travel.shortest(cities, radius));
  }

  @Test
  public void case71() {
    String[] cities = { "41 -151", "-40 -54" };
    int radius = 828;
    assertEquals(3453, travel.shortest(cities, radius));
  }

  @Test
  public void case72() {
    String[] cities = { "-84 151", "-1 116", "11 154", "-33 -129", "48 -112", "59 137", "5 11", "-50 -94", "66 -44" };
    int radius = 702;
    assertEquals(6494, travel.shortest(cities, radius));
  }

  @Test
  public void case73() {
    String[] cities = { "-29 -45", "31 51", "-60 106", "40 -171", "65 -85", "64 -117", "17 41", "74 66" };
    int radius = 657;
    assertEquals(5192, travel.shortest(cities, radius));
  }

  @Test
  public void case74() {
    String[] cities = { "-46 -155", "37 -45", "-26 5", "-17 -54", "56 -122", "-73 -34", "-28 15", "-74 113" };
    int radius = 524;
    assertEquals(3732, travel.shortest(cities, radius));
  }

  @Test
  public void case75() {
    String[] cities = { "49 145", "42 -138", "26 106", "-18 115", "50 80", "31 106" };
    int radius = 863;
    assertEquals(4268, travel.shortest(cities, radius));
  }

  @Test
  public void case76() {
    String[] cities = { "71 101", "-20 -139", "72 60", "26 180", "10 15", "54 163" };
    int radius = 240;
    assertEquals(1492, travel.shortest(cities, radius));
  }

}
