package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class DrivingAroundTest {
  DrivingAround drivingaround = new DrivingAround();

  @Test
  public void case1() {
    String[] adj = { ".12", "2.1", "12." };
    int start = 0;
    int finish = 2;
    int time = 5;
    assertEquals(8, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case2() {
    String[] adj = { "....52....", "..5.......", "..........", ".......1..", "......42.2", "5...4.....", ".5...4...1", "......5...", ".3244.....", ".........." };
    int start = 2;
    int finish = 2;
    int time = 10;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case3() {
    String[] adj = { "...14....1", "......13..", ".2...4....", "....52.5..", "1.3..4....", ".3....35.5", "4......1.1", "..4.4.1.54", "....4.11.5", "31144.2.4." };
    int start = 7;
    int finish = 2;
    int time = 100;
    assertEquals(316984, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case4() {
    String[] adj = { "...43..4.4", "......1.3.", ".5......4.", "34.......2", "..........", "........1.", "35.......4", "....2.2..4", "5...5..5..", "1....2..4." };
    int start = 5;
    int finish = 5;
    int time = 10000;
    assertEquals(28404, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case5() {
    String[] adj = { ".....3.25.", "..3...3533", ".5.421.22.", "42....3121", "5421.1.114", "1.5.1.513.", "..513..5.1", "2.14142..4", "5.334333.1", "1....5.44." };
    int start = 6;
    int finish = 4;
    int time = 10000000;
    assertEquals(863687, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case6() {
    String[] adj = { ".231442123", "..41121512", "41.2..5511", "213.515224", "4135.1213.", "41354.4.22", "211231.4.1", "4445545.52", "5.4254.4.1", "321344441." };
    int start = 1;
    int finish = 3;
    int time = 100000000;
    assertEquals(851713, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case7() {
    String[] adj = { ".121515213", "3.23114121", "21.2222151", "433.5.4221", "1422..5453", "53152.1433", "55414..234", "4444315.43", ".333..35.2", "555152134." };
    int start = 8;
    int finish = 7;
    int time = 1000000000;
    assertEquals(883368, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case8() {
    String[] adj = { "..134.", "..453.", ".4..33", "3....3", "2444.4", "453..." };
    int start = 0;
    int finish = 4;
    int time = 10;
    assertEquals(7, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case9() {
    String[] adj = { ".224", "5.3.", "12.1", "153." };
    int start = 3;
    int finish = 1;
    int time = 10;
    assertEquals(14, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case10() {
    String[] adj = { ".121515213", "3.23114121", "21.2222151", "433.5.4221", "1422..5453", "53152.1433", "55414..234", "4444315.43", ".333..35.2", "555152134." };
    int start = 8;
    int finish = 7;
    int time = 536870911;
    assertEquals(935149, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case11() {
    String[] adj = { ".5", ".." };
    int start = 1;
    int finish = 0;
    int time = 10;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case12() {
    String[] adj = { "...", "...", "..." };
    int start = 2;
    int finish = 1;
    int time = 10;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case13() {
    String[] adj = { "....", "....", "...4", "..3." };
    int start = 2;
    int finish = 0;
    int time = 10;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case14() {
    String[] adj = { ".....", "1....", "2....", ".....", "....." };
    int start = 2;
    int finish = 1;
    int time = 10;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case15() {
    String[] adj = { ".241.1", "...5..", ".1.12.", "223.2.", "4.45..", "....3." };
    int start = 5;
    int finish = 1;
    int time = 10;
    assertEquals(3, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case16() {
    String[] adj = { "..1143.", "4.43544", ".2.152.", "442..25", "3.11.51", "2112..4", ".4114.." };
    int start = 6;
    int finish = 4;
    int time = 10;
    assertEquals(8, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case17() {
    String[] adj = { ".2..31..", "..33....", "...21...", "..3..3..", ".2.3.31.", "2..1....", "11...5.3", "2.5...1." };
    int start = 1;
    int finish = 0;
    int time = 10;
    assertEquals(3, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case18() {
    String[] adj = { ".3...35..", "......25.", "25.......", "..2...14.", ".....4..4", "..3.3.4.4", "........3", "..5..53..", "54.....2." };
    int start = 1;
    int finish = 8;
    int time = 10;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case19() {
    String[] adj = { ".......3..", "..........", ".5........", "..........", "..........", "..........", "..........", ".........3", "..........", ".........." };
    int start = 3;
    int finish = 5;
    int time = 100;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case20() {
    String[] adj = { ".112.44434", "4..44..433", "44.31.414.", "23..324441", "4444.341.2", "4.444.1442", "444243.143", "13..121.1.", "33421444.2", "4.242414.." };
    int start = 0;
    int finish = 6;
    int time = 1000;
    assertEquals(152773, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case21() {
    String[] adj = { "..........", ".....2.4..", ".4........", ".......2..", "2.5.......", "........4.", "..........", ".....21...", ".......1..", ".........." };
    int start = 8;
    int finish = 2;
    int time = 10000;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case22() {
    String[] adj = { ".23.514553", "4.14.55.31", ".3.1.45154", "1.5.214..4", ".544.45433", "54354.4142", "442.21.424", "1444244.14", "531341.4.2", "14..3.445." };
    int start = 9;
    int finish = 0;
    int time = 100000;
    assertEquals(856057, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case23() {
    String[] adj = { "..........", "...5.1..1.", "......2..2", "..........", "..........", "..........", "..........", "..........", "..........", "..2......." };
    int start = 8;
    int finish = 9;
    int time = 1000000;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case24() {
    String[] adj = { "..........", "..........", "..........", ".3.......5", "..........", ".......4.2", "..........", "..........", "..........", ".........." };
    int start = 0;
    int finish = 4;
    int time = 10000000;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case25() {
    String[] adj = { ".212242515", "..5.2514.3", "21.2..55.5", "155.5434.2", "1545.25...", "322.3.4345", "54441..514", "521.2.2.11", "...52545..", "12..55115." };
    int start = 2;
    int finish = 6;
    int time = 100000000;
    assertEquals(724103, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case26() {
    String[] adj = { ".2.2333113", "3.212344.4", "31.3513.24", "234..53.13", "5133.34.4.", "3...4.5213", "442133.311", "1131.14..3", "1223335..3", "4311..431." };
    int start = 7;
    int finish = 5;
    int time = 1000000000;
    assertEquals(17591, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case27() {
    String[] adj = { "..", ".." };
    int start = 0;
    int finish = 1;
    int time = 705418669;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case28() {
    String[] adj = { ".14343", "1..444", "...144", "314..5", "411...", "41.34." };
    int start = 4;
    int finish = 5;
    int time = 955465942;
    assertEquals(6501, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case29() {
    String[] adj = { "..4.", "..5.", "....", "451." };
    int start = 1;
    int finish = 2;
    int time = 509390050;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case30() {
    String[] adj = { ".115", "1.21", "55.1", "1.1." };
    int start = 1;
    int finish = 0;
    int time = 62469818;
    assertEquals(533438, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case31() {
    String[] adj = { "..", "1." };
    int start = 0;
    int finish = 1;
    int time = 469301324;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case32() {
    String[] adj = { ".4..45.4..", "2...5....5", "54....21..", "..........", "52...5.4..", "....5...5.", "2...12...4", ".........2", "45.5......", "..5..25.1." };
    int start = 4;
    int finish = 9;
    int time = 839100924;
    assertEquals(677037, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case33() {
    String[] adj = { "..1.2.5224", "....2.424.", "....5..1.4", "24......44", ".1.....422", "11215.2.24", "224.1...14", "...5.11.2.", ".1.4522...", ".14.41..1." };
    int start = 9;
    int finish = 6;
    int time = 857828350;
    assertEquals(615310, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case34() {
    String[] adj = { "..54..1.", "..4.....", "25..5..1", "4.5.1...", "43.5.5..", "...1...3", "233....4", "....15.." };
    int start = 6;
    int finish = 1;
    int time = 467040551;
    assertEquals(553460, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case35() {
    String[] adj = { "...3...", "...4.23", ".3.341.", "2.5.322", "41...2.", ".3..2.4", "5...5.." };
    int start = 0;
    int finish = 2;
    int time = 429694752;
    assertEquals(912487, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case36() {
    String[] adj = { ".124244412", "2.13112332", "24.4244242", "211.442341", "4131.41442", "22112.2131", "113444.314", "421.141.34", "24422143.2", "222324231." };
    int start = 8;
    int finish = 6;
    int time = 435788070;
    assertEquals(924990, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case37() {
    String[] adj = { ".141311442", "5.11114134", "53.3111.13", "135.113343", "1525.14111", "11134.4111", "431141.132", "134211..3.", "24543113..", "551314.3.." };
    int start = 4;
    int finish = 6;
    int time = 978736891;
    assertEquals(295205, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case38() {
    String[] adj = { ".32245", "3..355", "35.3..", "235.55", "5525.3", ".3344." };
    int start = 4;
    int finish = 2;
    int time = 770910860;
    assertEquals(902442, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case39() {
    String[] adj = { ".55..1", "5.25.1", ".4.5..", "112.35", "11.1.1", "4151.." };
    int start = 0;
    int finish = 3;
    int time = 373324323;
    assertEquals(324319, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case40() {
    String[] adj = { "....", "...3", "...3", "...." };
    int start = 1;
    int finish = 2;
    int time = 396953258;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case41() {
    String[] adj = { "..4.4", "1.441", "4....", ".3...", "..1.." };
    int start = 1;
    int finish = 2;
    int time = 749302373;
    assertEquals(6967, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case42() {
    String[] adj = { ".......4", "....3...", "...3.3..", ".45..34.", "......35", "....1...", ".34.....", ".313.4.." };
    int start = 3;
    int finish = 2;
    int time = 122914891;
    assertEquals(427558, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case43() {
    String[] adj = { "..", ".." };
    int start = 1;
    int finish = 0;
    int time = 590473032;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case44() {
    String[] adj = { ".23.5431", "4..4.3.3", "55.4343.", "522.4...", "4532..4.", "3425..32", "33.3.2..", "55.333.." };
    int start = 7;
    int finish = 3;
    int time = 30995198;
    assertEquals(332569, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case45() {
    String[] adj = { ".......", "5..5...", "4..55..", ".....4.", "......4", ".2.5..4", "...2..." };
    int start = 0;
    int finish = 1;
    int time = 353740246;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case46() {
    String[] adj = { ".1", ".." };
    int start = 0;
    int finish = 1;
    int time = 826336998;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case47() {
    String[] adj = { "..5..", ".....", ".....", ".....", "4...." };
    int start = 4;
    int finish = 0;
    int time = 1000000000;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case48() {
    String[] adj = { ".1532555", "5.133123", "55.11111", "51..1514", "551..154", "54.43.45", "132351.3", "5542215." };
    int start = 0;
    int finish = 6;
    int time = 1000000000;
    assertEquals(831163, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case49() {
    String[] adj = { "...", "...", ".1." };
    int start = 0;
    int finish = 1;
    int time = 1000000000;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case50() {
    String[] adj = { ".334", "..4.", ".3..", ".44." };
    int start = 1;
    int finish = 0;
    int time = 1000000000;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case51() {
    String[] adj = { ".3", "1." };
    int start = 1;
    int finish = 0;
    int time = 1000000000;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case52() {
    String[] adj = { ".1.1...243", "1.313..432", "4..3.23422", "34..322.44", "2.3..1.5.3", "33.43.4332", "334.31...1", "3.32232..4", "..33.441.1", "..3113343." };
    int start = 0;
    int finish = 6;
    int time = 1000000000;
    assertEquals(944294, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case53() {
    String[] adj = { ".5.", "..3", "3.." };
    int start = 0;
    int finish = 1;
    int time = 1000000000;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case54() {
    String[] adj = { ".1", ".." };
    int start = 1;
    int finish = 0;
    int time = 1000000000;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case55() {
    String[] adj = { "...", "...", "4.." };
    int start = 1;
    int finish = 0;
    int time = 1000000000;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case56() {
    String[] adj = { ".335", "1.33", "53.4", "455." };
    int start = 2;
    int finish = 3;
    int time = 1000000000;
    assertEquals(999224, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case57() {
    String[] adj = { "..5.4.544.", "5..54.5..5", "....245.5.", ".45.....1.", "425..5.5.5", ".453..445.", ".5445.....", "5....2..45", "4444...4.4", ".41..54.5." };
    int start = 2;
    int finish = 5;
    int time = 1000000000;
    assertEquals(949395, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case58() {
    String[] adj = { ".1.5411435", "1...14.451", "54.441.454", "5.3.35.3.5", "4311.4.55.", "514.3.1541", ".51121.14.", "4551144..3", "15555.31.4", "54.5.1121." };
    int start = 5;
    int finish = 1;
    int time = 1000000000;
    assertEquals(901401, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case59() {
    String[] adj = { ".5.2......", "4.5555.1..", ".1..43.1..", "24...1..2.", ".1.5...4.4", "2.1....222", "..........", "14.4.....4", "..221.23..", ".42...452." };
    int start = 2;
    int finish = 0;
    int time = 1000000000;
    assertEquals(595392, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case60() {
    String[] adj = { ".545.....5", ".....54..3", ".4...4..1.", ".....44..1", "..3...1.4.", "..4.4.432.", "3.23......", ".1.3.32..1", ".14.......", "4.2....13." };
    int start = 1;
    int finish = 0;
    int time = 1000000000;
    assertEquals(625312, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case61() {
    String[] adj = { ".4444.4443", "3.14135113", "44.2351442", "141.23.321", "4433.21325", "11331.1512", "243113.151", "4.11451..5", "1422.131.3", "155445.31." };
    int start = 7;
    int finish = 0;
    int time = 1000000000;
    assertEquals(212872, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case62() {
    String[] adj = { "..5.352.2.", "2.55244444", "5..42.11.5", "25..4444.2", "55...2.244", "5.211...25", "2252.4..4.", ".445.43.5.", "242.5242.2", ".244.2..2." };
    int start = 1;
    int finish = 4;
    int time = 536870912;
    assertEquals(581219, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case63() {
    String[] adj = { ".14434..52", "4.34414445", "4..35.5551", ".34.125312", "4.5..243.3", ".1.1..5444", "5515.2.254", "355.213.35", "44.24341.5", "1511151.1." };
    int start = 4;
    int finish = 2;
    int time = 536870912;
    assertEquals(898087, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case64() {
    String[] adj = { ".....5....", "...3.5...3", "..........", ".........3", ".3......3.", ".35......4", ".........5", "....35....", "..........", ".4........" };
    int start = 9;
    int finish = 1;
    int time = 536870912;
    assertEquals(582915, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case65() {
    String[] adj = { "..31111222", "4.4..12232", "24.2...2..", ".43.41.44.", "2424...52.", ".22.1..422", "23..1...11", "31.1....42", "..3.1113.1", "1.12.2444." };
    int start = 3;
    int finish = 0;
    int time = 536870912;
    assertEquals(894234, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case66() {
    String[] adj = { "..........", "..2.......", "1..3.....1", "1........3", ".....3....", ".5........", ".3........", "......5...", "..........", ".........." };
    int start = 4;
    int finish = 7;
    int time = 536870912;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case67() {
    String[] adj = { ".115525222", "2.5.2.2525", "55...3255.", ".22.2...44", "5422.42245", "41.2..4524", "224251.442", "225525..45", ".5354422.3", ".24...545." };
    int start = 3;
    int finish = 6;
    int time = 536870912;
    assertEquals(931746, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case68() {
    String[] adj = { "....", "....", ".1..", ".2.." };
    int start = 1;
    int finish = 0;
    int time = 2;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case69() {
    String[] adj = { ".41", "1.3", "12." };
    int start = 0;
    int finish = 1;
    int time = 8;
    assertEquals(4, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case70() {
    String[] adj = { ".1.223", "..3215", "43.152", "125.51", "2224.2", "11132." };
    int start = 2;
    int finish = 3;
    int time = 8;
    assertEquals(85, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case71() {
    String[] adj = { ".4.5..3452", "4..4444.4.", ".......31.", "55..213.4.", "23.3...225", ".53...5.14", ".54.35.4.5", ".1...4..41", "..1.24.5..", "5..144524." };
    int start = 8;
    int finish = 4;
    int time = 5;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case72() {
    String[] adj = { ".235..33", "3.2..4.5", "14.341.5", "35..444.", "45.....5", "35541..5", ".55.1...", "413.41.." };
    int start = 1;
    int finish = 6;
    int time = 8;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case73() {
    String[] adj = { "......", "......", "......", "......", "..1...", "......" };
    int start = 2;
    int finish = 1;
    int time = 7;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case74() {
    String[] adj = { "..451.4..3", "...1..4.21", ".3...1.22.", ".13..52.1.", "..52.4.15.", ".2.2..5.1.", "...22...5.", "..14......", "11.1..5..3", ".5..11..5." };
    int start = 4;
    int finish = 1;
    int time = 9;
    assertEquals(107, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case75() {
    String[] adj = { ".3222", "..424", "25.23", "325.3", "3345." };
    int start = 4;
    int finish = 2;
    int time = 2;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case76() {
    String[] adj = { "..", ".." };
    int start = 0;
    int finish = 1;
    int time = 2;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case77() {
    String[] adj = { "..21.235.1", "3.35155555", "23.4332.43", "55..54.342", "3425.32313", "12453.1434", "323354.323", ".55554..43", "32242334.1", "523324.13." };
    int start = 5;
    int finish = 6;
    int time = 7;
    assertEquals(23, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case78() {
    String[] adj = { ".424.42.", "......2.", "2...14.4", "4.2.4.1.", "4242.2.1", "...41..4", "1..1.2.2", "..4422.." };
    int start = 6;
    int finish = 7;
    int time = 3;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case79() {
    String[] adj = { ".3541141", "3.113.33", "33.53443", "1....1.3", "4551....", "31335.4.", "311315.1", "4131144." };
    int start = 5;
    int finish = 0;
    int time = 4;
    assertEquals(2, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case80() {
    String[] adj = { ".5.2", "5..5", "...3", ".35." };
    int start = 3;
    int finish = 0;
    int time = 6;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case81() {
    String[] adj = { ".233333", "3.33334", "21.3333", "2.3.323", "233..3.", "43333.3", ".32323." };
    int start = 5;
    int finish = 4;
    int time = 7;
    assertEquals(2, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case82() {
    String[] adj = { ".55.13", "3.5..3", "34....", "2....1", "4.33..", ".5.3.." };
    int start = 1;
    int finish = 5;
    int time = 3;
    assertEquals(1, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case83() {
    String[] adj = { ".55.....", "........", "5..1....", "....4.4.", "........", "........", "..4524.1", ".1...4.." };
    int start = 1;
    int finish = 5;
    int time = 8;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case84() {
    String[] adj = { ".2....2", "...5...", ".5..5..", "4.....5", ".4....4", ".4.....", ".4....." };
    int start = 4;
    int finish = 6;
    int time = 4;
    assertEquals(1, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case85() {
    String[] adj = { "...", "5..", "25." };
    int start = 0;
    int finish = 2;
    int time = 4;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case86() {
    String[] adj = { ".35235", "...1..", "....25", "53....", ".23...", "..2.1." };
    int start = 5;
    int finish = 4;
    int time = 7;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case87() {
    String[] adj = { ".3", "3." };
    int start = 0;
    int finish = 1;
    int time = 9;
    assertEquals(1, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case88() {
    String[] adj = { "......3..", "...5.....", "....33..3", "5...5..4.", "..35..55.", ".34.....3", "3...4....", "..3.....3", "........." };
    int start = 3;
    int finish = 7;
    int time = 4;
    assertEquals(1, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case89() {
    String[] adj = { ".5.", "1..", ".5." };
    int start = 1;
    int finish = 0;
    int time = 1;
    assertEquals(1, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case90() {
    String[] adj = { "..3....", "...4...", ".1....3", ".......", ".......", "...1...", "..414.." };
    int start = 2;
    int finish = 1;
    int time = 1;
    assertEquals(1, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case91() {
    String[] adj = { ".3.1..53.3", "1...3.51.5", ".5.33..21.", "544...44.2", "5.54.12.4.", "2..4..51..", ".44.51..15", ".2224.4...", "11.21.....", ".52.1.5..." };
    int start = 4;
    int finish = 5;
    int time = 2;
    assertEquals(0, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case92() {
    String[] adj = { "...14....1", "......13..", ".2...4....", "....52.5..", "1.3..4....", ".3....35.5", "4......1.1", "..4.4.1.54", "....4.11.5", "31144.2.4." };
    int start = 7;
    int finish = 2;
    int time = 1000000000;
    assertEquals(882571, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case93() {
    String[] adj = { ".111111111", "1.11111111", "11.1111111", "111.111111", "1111.11111", "11111.1111", "111111.111", "1111111.11", "11111111.1", "111111111." };
    int start = 1;
    int finish = 9;
    int time = 1000000000;
    assertEquals(604353, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case94() {
    String[] adj = { "...14....1", "......13..", ".2...4....", "....52.5..", "1.3..4....", ".3....35.5", "4......1.1", "..4.4.1.54", "....4.11.5", "31144.2.4." };
    int start = 7;
    int finish = 2;
    int time = 999999996;
    assertEquals(513279, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case95() {
    String[] adj = { ".555555555", "5.55555555", "55.5554555", "555.555555", "5555.55555", "55555.5555", "555555.555", "5555555.55", "55553555.5", "555555555." };
    int start = 0;
    int finish = 7;
    int time = 1000000000;
    assertEquals(255218, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case96() {
    String[] adj = { ".235155443", "5.11232213", "32.2534332", "241.322453", "3515.42344", "52244.3533", "354254.211", "3421354.21", "15112244.5", "455212224." };
    int start = 5;
    int finish = 7;
    int time = 1000000000;
    assertEquals(321940, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case97() {
    String[] adj = { ".111411111", "1..1111311", "12.1141111", "111.521511", "1131.41111", "13111.3525", "411111.111", "..4.4.1.54", "111.4111.5", "31144.214." };
    int start = 1;
    int finish = 6;
    int time = 1000000000;
    assertEquals(651894, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case98() {
    String[] adj = { ".555555555", "5.55555555", "55.5555555", "555.555555", "5555.55555", "55555.5555", "555555.555", "5555555.55", "55555555.5", "555555555." };
    int start = 0;
    int finish = 9;
    int time = 1000000000;
    assertEquals(918286, drivingaround.numberOfWays(adj, start, finish, time));
  }

  @Test
  public void case99() {
    String[] adj = { ".111121111", "1.11111111", "11.1111111", "111.111111", "1111.11111", "11211.1111", "111111.111", "1113111.11", "11111111.1", "111111111." };
    int start = 0;
    int finish = 9;
    int time = 1000000000;
    assertEquals(824117, drivingaround.numberOfWays(adj, start, finish, time));
  }

}
