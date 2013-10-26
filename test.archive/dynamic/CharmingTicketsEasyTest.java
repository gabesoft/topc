package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CharmingTicketsEasyTest {
  CharmingTicketsEasy charmingticketseasy = new CharmingTicketsEasy();

  @Test
  public void case1() {
    int K = 1;
    String good = "0123456789";
    assertEquals(10, charmingticketseasy.count(K, good));
  }

  @Test
  public void case2() {
    int K = 2;
    String good = "21";
    assertEquals(8, charmingticketseasy.count(K, good));
  }

  @Test
  public void case3() {
    int K = 2;
    String good = "0123456789";
    assertEquals(1240, charmingticketseasy.count(K, good));
  }

  @Test
  public void case4() {
    int K = 10;
    String good = "731";
    assertEquals(207444, charmingticketseasy.count(K, good));
  }

  @Test
  public void case5() {
    int K = 50;
    String good = "0123456789";
    assertEquals(367584, charmingticketseasy.count(K, good));
  }

  @Test
  public void case6() {
    int K = 46;
    String good = "28759604";
    assertEquals(537052, charmingticketseasy.count(K, good));
  }

  @Test
  public void case7() {
    int K = 42;
    String good = "54";
    assertEquals(116022, charmingticketseasy.count(K, good));
  }

  @Test
  public void case8() {
    int K = 46;
    String good = "274638";
    assertEquals(29046, charmingticketseasy.count(K, good));
  }

  @Test
  public void case9() {
    int K = 32;
    String good = "34297";
    assertEquals(486282, charmingticketseasy.count(K, good));
  }

  @Test
  public void case10() {
    int K = 6;
    String good = "439875";
    assertEquals(580456, charmingticketseasy.count(K, good));
  }

  @Test
  public void case11() {
    int K = 4;
    String good = "028";
    assertEquals(1069, charmingticketseasy.count(K, good));
  }

  @Test
  public void case12() {
    int K = 32;
    String good = "861207";
    assertEquals(227373, charmingticketseasy.count(K, good));
  }

  @Test
  public void case13() {
    int K = 39;
    String good = "285";
    assertEquals(710103, charmingticketseasy.count(K, good));
  }

  @Test
  public void case14() {
    int K = 42;
    String good = "176";
    assertEquals(899874, charmingticketseasy.count(K, good));
  }

  @Test
  public void case15() {
    int K = 49;
    String good = "8726531049";
    assertEquals(876299, charmingticketseasy.count(K, good));
  }

  @Test
  public void case16() {
    int K = 47;
    String good = "402593";
    assertEquals(234511, charmingticketseasy.count(K, good));
  }

  @Test
  public void case17() {
    int K = 4;
    String good = "6028";
    assertEquals(10296, charmingticketseasy.count(K, good));
  }

  @Test
  public void case18() {
    int K = 48;
    String good = "1";
    assertEquals(1, charmingticketseasy.count(K, good));
  }

  @Test
  public void case19() {
    int K = 35;
    String good = "73125869";
    assertEquals(977384, charmingticketseasy.count(K, good));
  }

  @Test
  public void case20() {
    int K = 31;
    String good = "23810654";
    assertEquals(986367, charmingticketseasy.count(K, good));
  }

  @Test
  public void case21() {
    int K = 6;
    String good = "4831";
    assertEquals(422969, charmingticketseasy.count(K, good));
  }

  @Test
  public void case22() {
    int K = 20;
    String good = "384167";
    assertEquals(914891, charmingticketseasy.count(K, good));
  }

  @Test
  public void case23() {
    int K = 42;
    String good = "2148397";
    assertEquals(544617, charmingticketseasy.count(K, good));
  }

  @Test
  public void case24() {
    int K = 6;
    String good = "60712";
    assertEquals(337996, charmingticketseasy.count(K, good));
  }

  @Test
  public void case25() {
    int K = 23;
    String good = "50762";
    assertEquals(19513, charmingticketseasy.count(K, good));
  }

  @Test
  public void case26() {
    int K = 8;
    String good = "49321";
    assertEquals(389517, charmingticketseasy.count(K, good));
  }

  @Test
  public void case27() {
    int K = 11;
    String good = "371";
    assertEquals(493152, charmingticketseasy.count(K, good));
  }

  @Test
  public void case28() {
    int K = 40;
    String good = "125836";
    assertEquals(805706, charmingticketseasy.count(K, good));
  }

  @Test
  public void case29() {
    int K = 28;
    String good = "3904716";
    assertEquals(182674, charmingticketseasy.count(K, good));
  }

  @Test
  public void case30() {
    int K = 7;
    String good = "4670592";
    assertEquals(578619, charmingticketseasy.count(K, good));
  }

  @Test
  public void case31() {
    int K = 4;
    String good = "32658";
    assertEquals(46977, charmingticketseasy.count(K, good));
  }

  @Test
  public void case32() {
    int K = 34;
    String good = "7";
    assertEquals(1, charmingticketseasy.count(K, good));
  }

  @Test
  public void case33() {
    int K = 11;
    String good = "743861";
    assertEquals(299634, charmingticketseasy.count(K, good));
  }

  @Test
  public void case34() {
    int K = 22;
    String good = "0718239";
    assertEquals(34748, charmingticketseasy.count(K, good));
  }

  @Test
  public void case35() {
    int K = 49;
    String good = "89315";
    assertEquals(193554, charmingticketseasy.count(K, good));
  }

  @Test
  public void case36() {
    int K = 25;
    String good = "592041";
    assertEquals(894605, charmingticketseasy.count(K, good));
  }

  @Test
  public void case37() {
    int K = 34;
    String good = "6702";
    assertEquals(456512, charmingticketseasy.count(K, good));
  }

  @Test
  public void case38() {
    int K = 14;
    String good = "3692";
    assertEquals(676028, charmingticketseasy.count(K, good));
  }

  @Test
  public void case39() {
    int K = 31;
    String good = "375";
    assertEquals(61430, charmingticketseasy.count(K, good));
  }

  @Test
  public void case40() {
    int K = 4;
    String good = "0952";
    assertEquals(5720, charmingticketseasy.count(K, good));
  }

  @Test
  public void case41() {
    int K = 12;
    String good = "2";
    assertEquals(1, charmingticketseasy.count(K, good));
  }

  @Test
  public void case42() {
    int K = 9;
    String good = "6314087";
    assertEquals(472064, charmingticketseasy.count(K, good));
  }

  @Test
  public void case43() {
    int K = 27;
    String good = "3104972";
    assertEquals(753243, charmingticketseasy.count(K, good));
  }

  @Test
  public void case44() {
    int K = 25;
    String good = "789465";
    assertEquals(237740, charmingticketseasy.count(K, good));
  }

  @Test
  public void case45() {
    int K = 46;
    String good = "936042";
    assertEquals(458106, charmingticketseasy.count(K, good));
  }

  @Test
  public void case46() {
    int K = 50;
    String good = "0836";
    assertEquals(214321, charmingticketseasy.count(K, good));
  }

  @Test
  public void case47() {
    int K = 38;
    String good = "30";
    assertEquals(470649, charmingticketseasy.count(K, good));
  }

  @Test
  public void case48() {
    int K = 9;
    String good = "6784";
    assertEquals(38341, charmingticketseasy.count(K, good));
  }

  @Test
  public void case49() {
    int K = 49;
    String good = "806741";
    assertEquals(512499, charmingticketseasy.count(K, good));
  }

  @Test
  public void case50() {
    int K = 24;
    String good = "0";
    assertEquals(1, charmingticketseasy.count(K, good));
  }

  @Test
  public void case51() {
    int K = 38;
    String good = "23109";
    assertEquals(837253, charmingticketseasy.count(K, good));
  }

  @Test
  public void case52() {
    int K = 42;
    String good = "289";
    assertEquals(125260, charmingticketseasy.count(K, good));
  }

  @Test
  public void case53() {
    int K = 31;
    String good = "90671238";
    assertEquals(861199, charmingticketseasy.count(K, good));
  }

  @Test
  public void case54() {
    int K = 19;
    String good = "06783519";
    assertEquals(607781, charmingticketseasy.count(K, good));
  }

  @Test
  public void case55() {
    int K = 29;
    String good = "01694";
    assertEquals(664591, charmingticketseasy.count(K, good));
  }

  @Test
  public void case56() {
    int K = 42;
    String good = "53689012";
    assertEquals(986309, charmingticketseasy.count(K, good));
  }

  @Test
  public void case57() {
    int K = 12;
    String good = "9876543120";
    assertEquals(831746, charmingticketseasy.count(K, good));
  }

  @Test
  public void case58() {
    int K = 50;
    String good = "0145678932";
    assertEquals(367584, charmingticketseasy.count(K, good));
  }

  @Test
  public void case59() {
    int K = 47;
    String good = "125893";
    assertEquals(473425, charmingticketseasy.count(K, good));
  }

}
