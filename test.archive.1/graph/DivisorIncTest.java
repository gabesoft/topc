package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class DivisorIncTest {
  DivisorInc divisorinc = new DivisorInc();

  @Test
  public void case1() {
    int N = 4;
    int M = 24;
    assertEquals(5, divisorinc.countOperations(N, M));
  }

  @Test
  public void case2() {
    int N = 4;
    int M = 576;
    assertEquals(14, divisorinc.countOperations(N, M));
  }

  @Test
  public void case3() {
    int N = 486;
    int M = 7128;
    assertEquals(9, divisorinc.countOperations(N, M));
  }

  @Test
  public void case4() {
    int N = 8748;
    int M = 83462;
    assertEquals(10, divisorinc.countOperations(N, M));
  }

  @Test
  public void case5() {
    int N = 235;
    int M = 98234;
    assertEquals(21, divisorinc.countOperations(N, M));
  }

  @Test
  public void case6() {
    int N = 4;
    int M = 99991;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case7() {
    int N = 82736;
    int M = 82736;
    assertEquals(0, divisorinc.countOperations(N, M));
  }

  @Test
  public void case8() {
    int N = 4;
    int M = 85678;
    assertEquals(33, divisorinc.countOperations(N, M));
  }

  @Test
  public void case9() {
    int N = 6;
    int M = 85678;
    assertEquals(32, divisorinc.countOperations(N, M));
  }

  @Test
  public void case10() {
    int N = 8;
    int M = 85678;
    assertEquals(31, divisorinc.countOperations(N, M));
  }

  @Test
  public void case11() {
    int N = 9;
    int M = 85678;
    assertEquals(31, divisorinc.countOperations(N, M));
  }

  @Test
  public void case12() {
    int N = 10;
    int M = 80998;
    assertEquals(30, divisorinc.countOperations(N, M));
  }

  @Test
  public void case13() {
    int N = 12;
    int M = 85678;
    assertEquals(30, divisorinc.countOperations(N, M));
  }

  @Test
  public void case14() {
    int N = 14;
    int M = 95014;
    assertEquals(30, divisorinc.countOperations(N, M));
  }

  @Test
  public void case15() {
    int N = 100000;
    int M = 100000;
    assertEquals(0, divisorinc.countOperations(N, M));
  }

  @Test
  public void case16() {
    int N = 99991;
    int M = 99991;
    assertEquals(0, divisorinc.countOperations(N, M));
  }

  @Test
  public void case17() {
    int N = 99990;
    int M = 99991;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case18() {
    int N = 4;
    int M = 99991;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case19() {
    int N = 99991;
    int M = 100000;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case20() {
    int N = 89989;
    int M = 89989;
    assertEquals(0, divisorinc.countOperations(N, M));
  }

  @Test
  public void case21() {
    int N = 5;
    int M = 5;
    assertEquals(0, divisorinc.countOperations(N, M));
  }

  @Test
  public void case22() {
    int N = 5;
    int M = 100000;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case23() {
    int N = 4;
    int M = 4;
    assertEquals(0, divisorinc.countOperations(N, M));
  }

  @Test
  public void case24() {
    int N = 4;
    int M = 5;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case25() {
    int N = 4;
    int M = 6;
    assertEquals(1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case26() {
    int N = 5;
    int M = 5;
    assertEquals(0, divisorinc.countOperations(N, M));
  }

  @Test
  public void case27() {
    int N = 5;
    int M = 6;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case28() {
    int N = 8;
    int M = 9;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case29() {
    int N = 15;
    int M = 16;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case30() {
    int N = 25;
    int M = 27;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case31() {
    int N = 78961;
    int M = 79523;
    assertEquals(2, divisorinc.countOperations(N, M));
  }

  @Test
  public void case32() {
    int N = 152;
    int M = 72414;
    assertEquals(19, divisorinc.countOperations(N, M));
  }

  @Test
  public void case33() {
    int N = 815;
    int M = 79512;
    assertEquals(16, divisorinc.countOperations(N, M));
  }

  @Test
  public void case34() {
    int N = 648;
    int M = 70736;
    assertEquals(16, divisorinc.countOperations(N, M));
  }

  @Test
  public void case35() {
    int N = 67;
    int M = 89772;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case36() {
    int N = 619;
    int M = 64841;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case37() {
    int N = 944;
    int M = 60436;
    assertEquals(14, divisorinc.countOperations(N, M));
  }

  @Test
  public void case38() {
    int N = 671;
    int M = 54007;
    assertEquals(17, divisorinc.countOperations(N, M));
  }

  @Test
  public void case39() {
    int N = 978;
    int M = 90057;
    assertEquals(16, divisorinc.countOperations(N, M));
  }

  @Test
  public void case40() {
    int N = 676;
    int M = 12948;
    assertEquals(10, divisorinc.countOperations(N, M));
  }

  @Test
  public void case41() {
    int N = 659;
    int M = 78938;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case42() {
    int N = 244;
    int M = 38771;
    assertEquals(18, divisorinc.countOperations(N, M));
  }

  @Test
  public void case43() {
    int N = 588;
    int M = 77323;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case44() {
    int N = 407;
    int M = 23013;
    assertEquals(14, divisorinc.countOperations(N, M));
  }

  @Test
  public void case45() {
    int N = 587;
    int M = 40920;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case46() {
    int N = 62;
    int M = 78505;
    assertEquals(23, divisorinc.countOperations(N, M));
  }

  @Test
  public void case47() {
    int N = 928;
    int M = 18081;
    assertEquals(10, divisorinc.countOperations(N, M));
  }

  @Test
  public void case48() {
    int N = 163;
    int M = 6435;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case49() {
    int N = 582;
    int M = 39983;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case50() {
    int N = 321;
    int M = 54237;
    assertEquals(17, divisorinc.countOperations(N, M));
  }

  @Test
  public void case51() {
    int N = 583;
    int M = 74629;
    assertEquals(18, divisorinc.countOperations(N, M));
  }

  @Test
  public void case52() {
    int N = 551;
    int M = 75833;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case53() {
    int N = 484;
    int M = 61330;
    assertEquals(16, divisorinc.countOperations(N, M));
  }

  @Test
  public void case54() {
    int N = 344;
    int M = 67443;
    assertEquals(18, divisorinc.countOperations(N, M));
  }

  @Test
  public void case55() {
    int N = 408;
    int M = 84496;
    assertEquals(18, divisorinc.countOperations(N, M));
  }

  @Test
  public void case56() {
    int N = 553;
    int M = 34526;
    assertEquals(15, divisorinc.countOperations(N, M));
  }

  @Test
  public void case57() {
    int N = 63;
    int M = 39365;
    assertEquals(21, divisorinc.countOperations(N, M));
  }

  @Test
  public void case58() {
    int N = 493;
    int M = 27322;
    assertEquals(15, divisorinc.countOperations(N, M));
  }

  @Test
  public void case59() {
    int N = 234;
    int M = 20540;
    assertEquals(14, divisorinc.countOperations(N, M));
  }

  @Test
  public void case60() {
    int N = 59;
    int M = 99723;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case61() {
    int N = 985;
    int M = 53537;
    assertEquals(14, divisorinc.countOperations(N, M));
  }

  @Test
  public void case62() {
    int N = 958;
    int M = 41354;
    assertEquals(14, divisorinc.countOperations(N, M));
  }

  @Test
  public void case63() {
    int N = 484;
    int M = 12287;
    assertEquals(11, divisorinc.countOperations(N, M));
  }

  @Test
  public void case64() {
    int N = 955;
    int M = 6858;
    assertEquals(8, divisorinc.countOperations(N, M));
  }

  @Test
  public void case65() {
    int N = 937;
    int M = 18296;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case66() {
    int N = 390;
    int M = 5398;
    assertEquals(11, divisorinc.countOperations(N, M));
  }

  @Test
  public void case67() {
    int N = 621;
    int M = 29408;
    assertEquals(14, divisorinc.countOperations(N, M));
  }

  @Test
  public void case68() {
    int N = 447;
    int M = 1105;
    assertEquals(5, divisorinc.countOperations(N, M));
  }

  @Test
  public void case69() {
    int N = 782;
    int M = 77551;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case70() {
    int N = 497;
    int M = 47853;
    assertEquals(15, divisorinc.countOperations(N, M));
  }

  @Test
  public void case71() {
    int N = 634;
    int M = 71427;
    assertEquals(16, divisorinc.countOperations(N, M));
  }

  @Test
  public void case72() {
    int N = 2697;
    int M = 96219;
    assertEquals(14, divisorinc.countOperations(N, M));
  }

  @Test
  public void case73() {
    int N = 4834;
    int M = 55889;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case74() {
    int N = 9086;
    int M = 76594;
    assertEquals(9, divisorinc.countOperations(N, M));
  }

  @Test
  public void case75() {
    int N = 6113;
    int M = 57516;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case76() {
    int N = 2309;
    int M = 38189;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case77() {
    int N = 388;
    int M = 78967;
    assertEquals(17, divisorinc.countOperations(N, M));
  }

  @Test
  public void case78() {
    int N = 9897;
    int M = 28646;
    assertEquals(7, divisorinc.countOperations(N, M));
  }

  @Test
  public void case79() {
    int N = 6000;
    int M = 67194;
    assertEquals(10, divisorinc.countOperations(N, M));
  }

  @Test
  public void case80() {
    int N = 6297;
    int M = 66816;
    assertEquals(10, divisorinc.countOperations(N, M));
  }

  @Test
  public void case81() {
    int N = 2915;
    int M = 40460;
    assertEquals(10, divisorinc.countOperations(N, M));
  }

  @Test
  public void case82() {
    int N = 1262;
    int M = 85473;
    assertEquals(15, divisorinc.countOperations(N, M));
  }

  @Test
  public void case83() {
    int N = 967;
    int M = 16670;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case84() {
    int N = 5326;
    int M = 60485;
    assertEquals(10, divisorinc.countOperations(N, M));
  }

  @Test
  public void case85() {
    int N = 9705;
    int M = 74714;
    assertEquals(10, divisorinc.countOperations(N, M));
  }

  @Test
  public void case86() {
    int N = 4766;
    int M = 83721;
    assertEquals(11, divisorinc.countOperations(N, M));
  }

  @Test
  public void case87() {
    int N = 1981;
    int M = 11997;
    assertEquals(8, divisorinc.countOperations(N, M));
  }

  @Test
  public void case88() {
    int N = 2609;
    int M = 28706;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case89() {
    int N = 2523;
    int M = 85084;
    assertEquals(14, divisorinc.countOperations(N, M));
  }

  @Test
  public void case90() {
    int N = 6733;
    int M = 75639;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case91() {
    int N = 4246;
    int M = 10673;
    assertEquals(6, divisorinc.countOperations(N, M));
  }

  @Test
  public void case92() {
    int N = 4063;
    int M = 73030;
    assertEquals(11, divisorinc.countOperations(N, M));
  }

  @Test
  public void case93() {
    int N = 3555;
    int M = 17535;
    assertEquals(7, divisorinc.countOperations(N, M));
  }

  @Test
  public void case94() {
    int N = 7534;
    int M = 84590;
    assertEquals(11, divisorinc.countOperations(N, M));
  }

  @Test
  public void case95() {
    int N = 7742;
    int M = 61206;
    assertEquals(9, divisorinc.countOperations(N, M));
  }

  @Test
  public void case96() {
    int N = 4328;
    int M = 21101;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case97() {
    int N = 3103;
    int M = 20826;
    assertEquals(9, divisorinc.countOperations(N, M));
  }

  @Test
  public void case98() {
    int N = 719;
    int M = 49584;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case99() {
    int N = 7686;
    int M = 24779;
    assertEquals(6, divisorinc.countOperations(N, M));
  }

  @Test
  public void case100() {
    int N = 7898;
    int M = 12485;
    assertEquals(4, divisorinc.countOperations(N, M));
  }

  @Test
  public void case101() {
    int N = 465;
    int M = 82543;
    assertEquals(18, divisorinc.countOperations(N, M));
  }

  @Test
  public void case102() {
    int N = 6757;
    int M = 80471;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case103() {
    int N = 5879;
    int M = 90191;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case104() {
    int N = 9213;
    int M = 25637;
    assertEquals(7, divisorinc.countOperations(N, M));
  }

  @Test
  public void case105() {
    int N = 7340;
    int M = 32633;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case106() {
    int N = 7220;
    int M = 45460;
    assertEquals(8, divisorinc.countOperations(N, M));
  }

  @Test
  public void case107() {
    int N = 828;
    int M = 13374;
    assertEquals(10, divisorinc.countOperations(N, M));
  }

  @Test
  public void case108() {
    int N = 951;
    int M = 16013;
    assertEquals(12, divisorinc.countOperations(N, M));
  }

  @Test
  public void case109() {
    int N = 3863;
    int M = 61573;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case110() {
    int N = 769;
    int M = 87386;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case111() {
    int N = 8835;
    int M = 61347;
    assertEquals(8, divisorinc.countOperations(N, M));
  }

  @Test
  public void case112() {
    int N = 90447;
    int M = 99886;
    assertEquals(6, divisorinc.countOperations(N, M));
  }

  @Test
  public void case113() {
    int N = 43397;
    int M = 61548;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case114() {
    int N = 84573;
    int M = 89908;
    assertEquals(4, divisorinc.countOperations(N, M));
  }

  @Test
  public void case115() {
    int N = 97173;
    int M = 99242;
    assertEquals(4, divisorinc.countOperations(N, M));
  }

  @Test
  public void case116() {
    int N = 31068;
    int M = 69281;
    assertEquals(7, divisorinc.countOperations(N, M));
  }

  @Test
  public void case117() {
    int N = 12017;
    int M = 74874;
    assertEquals(9, divisorinc.countOperations(N, M));
  }

  @Test
  public void case118() {
    int N = 51492;
    int M = 52076;
    assertEquals(3, divisorinc.countOperations(N, M));
  }

  @Test
  public void case119() {
    int N = 38083;
    int M = 55729;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case120() {
    int N = 72501;
    int M = 79087;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case121() {
    int N = 97816;
    int M = 98562;
    assertEquals(4, divisorinc.countOperations(N, M));
  }

  @Test
  public void case122() {
    int N = 25406;
    int M = 70697;
    assertEquals(7, divisorinc.countOperations(N, M));
  }

  @Test
  public void case123() {
    int N = 84901;
    int M = 93979;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case124() {
    int N = 78617;
    int M = 91788;
    assertEquals(4, divisorinc.countOperations(N, M));
  }

  @Test
  public void case125() {
    int N = 56971;
    int M = 59329;
    assertEquals(5, divisorinc.countOperations(N, M));
  }

  @Test
  public void case126() {
    int N = 12248;
    int M = 73917;
    assertEquals(8, divisorinc.countOperations(N, M));
  }

  @Test
  public void case127() {
    int N = 18875;
    int M = 35155;
    assertEquals(5, divisorinc.countOperations(N, M));
  }

  @Test
  public void case128() {
    int N = 35294;
    int M = 79769;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case129() {
    int N = 44861;
    int M = 52808;
    assertEquals(3, divisorinc.countOperations(N, M));
  }

  @Test
  public void case130() {
    int N = 52704;
    int M = 90705;
    assertEquals(6, divisorinc.countOperations(N, M));
  }

  @Test
  public void case131() {
    int N = 5347;
    int M = 22614;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case132() {
    int N = 125;
    int M = 89989;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case133() {
    int N = 4;
    int M = 576;
    assertEquals(14, divisorinc.countOperations(N, M));
  }

  @Test
  public void case134() {
    int N = 235;
    int M = 98266;
    assertEquals(20, divisorinc.countOperations(N, M));
  }

  @Test
  public void case135() {
    int N = 4;
    int M = 10000;
    assertEquals(23, divisorinc.countOperations(N, M));
  }

  @Test
  public void case136() {
    int N = 8;
    int M = 83462;
    assertEquals(29, divisorinc.countOperations(N, M));
  }

  @Test
  public void case137() {
    int N = 235;
    int M = 98234;
    assertEquals(21, divisorinc.countOperations(N, M));
  }

  @Test
  public void case138() {
    int N = 8748;
    int M = 83462;
    assertEquals(10, divisorinc.countOperations(N, M));
  }

  @Test
  public void case139() {
    int N = 27;
    int M = 97234;
    assertEquals(26, divisorinc.countOperations(N, M));
  }

  @Test
  public void case140() {
    int N = 655;
    int M = 99991;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case141() {
    int N = 6;
    int M = 99899;
    assertEquals(31, divisorinc.countOperations(N, M));
  }

  @Test
  public void case142() {
    int N = 4;
    int M = 65536;
    assertEquals(28, divisorinc.countOperations(N, M));
  }

  @Test
  public void case143() {
    int N = 4;
    int M = 24;
    assertEquals(5, divisorinc.countOperations(N, M));
  }

  @Test
  public void case144() {
    int N = 4;
    int M = 100000;
    assertEquals(30, divisorinc.countOperations(N, M));
  }

  @Test
  public void case145() {
    int N = 1245;
    int M = 99991;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case146() {
    int N = 4;
    int M = 99982;
    assertEquals(31, divisorinc.countOperations(N, M));
  }

  @Test
  public void case147() {
    int N = 120;
    int M = 98444;
    assertEquals(20, divisorinc.countOperations(N, M));
  }

  @Test
  public void case148() {
    int N = 4;
    int M = 99999;
    assertEquals(30, divisorinc.countOperations(N, M));
  }

  @Test
  public void case149() {
    int N = 128;
    int M = 243;
    assertEquals(3, divisorinc.countOperations(N, M));
  }

  @Test
  public void case150() {
    int N = 17;
    int M = 17;
    assertEquals(0, divisorinc.countOperations(N, M));
  }

  @Test
  public void case151() {
    int N = 98;
    int M = 100;
    assertEquals(1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case152() {
    int N = 4;
    int M = 5;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case153() {
    int N = 800;
    int M = 801;
    assertEquals(-1, divisorinc.countOperations(N, M));
  }

  @Test
  public void case154() {
    int N = 9;
    int M = 100000;
    assertEquals(28, divisorinc.countOperations(N, M));
  }

}
