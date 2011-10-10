package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PointSystemTest {
  double DELTA = 1.0e-09;
  PointSystem pointsystem = new PointSystem();

  @Test
  public void case1() {
    int pointsToWin = 2;
    int pointsToWinBy = 1;
    int skill = 40;
    assertEquals(0.352, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.352);
  }

  @Test
  public void case2() {
    int pointsToWin = 4;
    int pointsToWinBy = 5;
    int skill = 50;
    assertEquals(0.4999999999999998, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.4999999999999998);
  }

  @Test
  public void case3() {
    int pointsToWin = 3;
    int pointsToWinBy = 3;
    int skill = 25;
    assertEquals(0.035714285714285705, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.035714285714285705);
  }

  @Test
  public void case4() {
    int pointsToWin = 10;
    int pointsToWinBy = 5;
    int skill = 48;
    assertEquals(0.3949566562885549, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.3949566562885549);
  }

  @Test
  public void case5() {
    int pointsToWin = 1;
    int pointsToWinBy = 4;
    int skill = 19;
    assertEquals(0.003018293842361875, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.003018293842361875);
  }

  @Test
  public void case6() {
    int pointsToWin = 9;
    int pointsToWinBy = 1;
    int skill = 24;
    assertEquals(0.00938185073388358, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.00938185073388358);
  }

  @Test
  public void case7() {
    int pointsToWin = 2;
    int pointsToWinBy = 4;
    int skill = 43;
    assertEquals(0.2446403891804691, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.2446403891804691);
  }

  @Test
  public void case8() {
    int pointsToWin = 2;
    int pointsToWinBy = 4;
    int skill = 3;
    assertEquals(9.149506804307481e-07, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 9.149506804307481e-07);
  }

  @Test
  public void case9() {
    int pointsToWin = 10;
    int pointsToWinBy = 1;
    int skill = 39;
    assertEquals(0.16261164304381354, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.16261164304381354);
  }

  @Test
  public void case10() {
    int pointsToWin = 3;
    int pointsToWinBy = 4;
    int skill = 42;
    assertEquals(0.21566777043166588, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.21566777043166588);
  }

  @Test
  public void case11() {
    int pointsToWin = 8;
    int pointsToWinBy = 3;
    int skill = 27;
    assertEquals(0.014182677355033809, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.014182677355033809);
  }

  @Test
  public void case12() {
    int pointsToWin = 10;
    int pointsToWinBy = 2;
    int skill = 35;
    assertEquals(0.07753434802621584, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.07753434802621584);
  }

  @Test
  public void case13() {
    int pointsToWin = 4;
    int pointsToWinBy = 5;
    int skill = 36;
    assertEquals(0.05331136440582318, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.05331136440582318);
  }

  @Test
  public void case14() {
    int pointsToWin = 3;
    int pointsToWinBy = 5;
    int skill = 40;
    assertEquals(0.11636363636363636, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.11636363636363636);
  }

  @Test
  public void case15() {
    int pointsToWin = 7;
    int pointsToWinBy = 4;
    int skill = 48;
    assertEquals(0.41541557608193425, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.41541557608193425);
  }

  @Test
  public void case16() {
    int pointsToWin = 3;
    int pointsToWinBy = 4;
    int skill = 19;
    assertEquals(0.003018293842361875, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.003018293842361875);
  }

  @Test
  public void case17() {
    int pointsToWin = 10;
    int pointsToWinBy = 3;
    int skill = 15;
    assertEquals(4.9649834934940344e-05, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 4.9649834934940344e-05);
  }

  @Test
  public void case18() {
    int pointsToWin = 6;
    int pointsToWinBy = 1;
    int skill = 33;
    assertEquals(0.11714026864751065, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.11714026864751065);
  }

  @Test
  public void case19() {
    int pointsToWin = 6;
    int pointsToWinBy = 4;
    int skill = 24;
    assertEquals(0.006268999307536835, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.006268999307536835);
  }

  @Test
  public void case20() {
    int pointsToWin = 2;
    int pointsToWinBy = 5;
    int skill = 44;
    assertEquals(0.23044321230549097, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.23044321230549097);
  }

  @Test
  public void case21() {
    int pointsToWin = 7;
    int pointsToWinBy = 5;
    int skill = 38;
    assertEquals(0.07496708917277026, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.07496708917277026);
  }

  @Test
  public void case22() {
    int pointsToWin = 10;
    int pointsToWinBy = 3;
    int skill = 27;
    assertEquals(0.008354424610246745, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.008354424610246745);
  }

  @Test
  public void case23() {
    int pointsToWin = 2;
    int pointsToWinBy = 3;
    int skill = 50;
    assertEquals(0.49999999999999983, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.49999999999999983);
  }

  @Test
  public void case24() {
    int pointsToWin = 1;
    int pointsToWinBy = 5;
    int skill = 6;
    assertEquals(1.0595379673221927e-06, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 1.0595379673221927e-06);
  }

  @Test
  public void case25() {
    int pointsToWin = 4;
    int pointsToWinBy = 3;
    int skill = 46;
    assertEquals(0.37719720065808476, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.37719720065808476);
  }

  @Test
  public void case26() {
    int pointsToWin = 8;
    int pointsToWinBy = 5;
    int skill = 15;
    assertEquals(3.9430677631904765e-05, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 3.9430677631904765e-05);
  }

  @Test
  public void case27() {
    int pointsToWin = 3;
    int pointsToWinBy = 4;
    int skill = 11;
    assertEquals(0.0002332971226964399, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.0002332971226964399);
  }

  @Test
  public void case28() {
    int pointsToWin = 5;
    int pointsToWinBy = 4;
    int skill = 22;
    assertEquals(0.004985284180102935, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.004985284180102935);
  }

  @Test
  public void case29() {
    int pointsToWin = 8;
    int pointsToWinBy = 3;
    int skill = 33;
    assertEquals(0.054031166460224746, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.054031166460224746);
  }

  @Test
  public void case30() {
    int pointsToWin = 1;
    int pointsToWinBy = 3;
    int skill = 13;
    assertEquals(0.0033252610867261986, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.0033252610867261986);
  }

  @Test
  public void case31() {
    int pointsToWin = 6;
    int pointsToWinBy = 5;
    int skill = 6;
    assertEquals(3.752506923513088e-07, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 3.752506923513088e-07);
  }

  @Test
  public void case32() {
    int pointsToWin = 2;
    int pointsToWinBy = 2;
    int skill = 16;
    assertEquals(0.035010940919037205, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.035010940919037205);
  }

  @Test
  public void case33() {
    int pointsToWin = 6;
    int pointsToWinBy = 5;
    int skill = 25;
    assertEquals(0.00361208055840164, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.00361208055840164);
  }

  @Test
  public void case34() {
    int pointsToWin = 4;
    int pointsToWinBy = 4;
    int skill = 2;
    assertEquals(1.7346649546680006e-07, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 1.7346649546680006e-07);
  }

  @Test
  public void case35() {
    int pointsToWin = 6;
    int pointsToWinBy = 2;
    int skill = 5;
    assertEquals(2.922912033839778e-06, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 2.922912033839778e-06);
  }

  @Test
  public void case36() {
    int pointsToWin = 1;
    int pointsToWinBy = 2;
    int skill = 34;
    assertEquals(0.20972423802612483, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.20972423802612483);
  }

  @Test
  public void case37() {
    int pointsToWin = 2;
    int pointsToWinBy = 2;
    int skill = 10;
    assertEquals(0.012195121951219511, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.012195121951219511);
  }

  @Test
  public void case38() {
    int pointsToWin = 6;
    int pointsToWinBy = 5;
    int skill = 2;
    assertEquals(4.681331729841816e-10, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 4.681331729841816e-10);
  }

  @Test
  public void case39() {
    int pointsToWin = 9;
    int pointsToWinBy = 5;
    int skill = 42;
    assertEquals(0.15345039304298383, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.15345039304298383);
  }

  @Test
  public void case40() {
    int pointsToWin = 8;
    int pointsToWinBy = 2;
    int skill = 40;
    assertEquals(0.1985732411392001, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.1985732411392001);
  }

  @Test
  public void case41() {
    int pointsToWin = 1;
    int pointsToWinBy = 2;
    int skill = 7;
    assertEquals(0.005633478960680618, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.005633478960680618);
  }

  @Test
  public void case42() {
    int pointsToWin = 5;
    int pointsToWinBy = 3;
    int skill = 17;
    assertEquals(0.003036053386891745, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.003036053386891745);
  }

  @Test
  public void case43() {
    int pointsToWin = 9;
    int pointsToWinBy = 5;
    int skill = 8;
    assertEquals(8.332180533119887e-08, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 8.332180533119887e-08);
  }

  @Test
  public void case44() {
    int pointsToWin = 9;
    int pointsToWinBy = 2;
    int skill = 31;
    assertEquals(0.04118848281606164, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.04118848281606164);
  }

  @Test
  public void case45() {
    int pointsToWin = 2;
    int pointsToWinBy = 1;
    int skill = 11;
    assertEquals(0.033638, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.033638);
  }

  @Test
  public void case46() {
    int pointsToWin = 7;
    int pointsToWinBy = 5;
    int skill = 10;
    assertEquals(3.895021845893313e-06, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 3.895021845893313e-06);
  }

  @Test
  public void case47() {
    int pointsToWin = 5;
    int pointsToWinBy = 5;
    int skill = 50;
    assertEquals(0.4999999999999998, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.4999999999999998);
  }

  @Test
  public void case48() {
    int pointsToWin = 1;
    int pointsToWinBy = 4;
    int skill = 17;
    assertEquals(0.0017567893141372188, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.0017567893141372188);
  }

  @Test
  public void case49() {
    int pointsToWin = 1;
    int pointsToWinBy = 5;
    int skill = 4;
    assertEquals(1.2558672548311644e-07, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 1.2558672548311644e-07);
  }

  @Test
  public void case50() {
    int pointsToWin = 9;
    int pointsToWinBy = 5;
    int skill = 31;
    assertEquals(0.0118228182263838, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.0118228182263838);
  }

  @Test
  public void case51() {
    int pointsToWin = 9;
    int pointsToWinBy = 2;
    int skill = 12;
    assertEquals(3.0240524779784205e-05, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 3.0240524779784205e-05);
  }

  @Test
  public void case52() {
    int pointsToWin = 7;
    int pointsToWinBy = 4;
    int skill = 9;
    assertEquals(5.333811408104796e-06, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 5.333811408104796e-06);
  }

  @Test
  public void case53() {
    int pointsToWin = 5;
    int pointsToWinBy = 3;
    int skill = 8;
    assertEquals(6.912134402628339e-05, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 6.912134402628339e-05);
  }

  @Test
  public void case54() {
    int pointsToWin = 1;
    int pointsToWinBy = 1;
    int skill = 1;
    assertEquals(0.01, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.01);
  }

  @Test
  public void case55() {
    int pointsToWin = 8;
    int pointsToWinBy = 2;
    int skill = 33;
    assertEquals(0.07177242867828629, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.07177242867828629);
  }

  @Test
  public void case56() {
    int pointsToWin = 10;
    int pointsToWinBy = 1;
    int skill = 3;
    assertEquals(4.254066587798827e-11, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 4.254066587798827e-11);
  }

  @Test
  public void case57() {
    int pointsToWin = 2;
    int pointsToWinBy = 5;
    int skill = 10;
    assertEquals(1.693480101608806e-05, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 1.693480101608806e-05);
  }

  @Test
  public void case58() {
    int pointsToWin = 4;
    int pointsToWinBy = 5;
    int skill = 29;
    assertEquals(0.011240584072091355, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.011240584072091355);
  }

  @Test
  public void case59() {
    int pointsToWin = 9;
    int pointsToWinBy = 5;
    int skill = 13;
    assertEquals(6.054000139275781e-06, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 6.054000139275781e-06);
  }

  @Test
  public void case60() {
    int pointsToWin = 8;
    int pointsToWinBy = 1;
    int skill = 30;
    assertEquals(0.05001254005377599, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.05001254005377599);
  }

  @Test
  public void case61() {
    int pointsToWin = 9;
    int pointsToWinBy = 1;
    int skill = 2;
    assertEquals(1.0764362527481045e-11, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 1.0764362527481045e-11);
  }

  @Test
  public void case62() {
    int pointsToWin = 8;
    int pointsToWinBy = 1;
    int skill = 4;
    assertEquals(3.274352606107888e-08, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 3.274352606107888e-08);
  }

  @Test
  public void case63() {
    int pointsToWin = 1;
    int pointsToWinBy = 5;
    int skill = 12;
    assertEquals(4.7148989837743444e-05, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 4.7148989837743444e-05);
  }

  @Test
  public void case64() {
    int pointsToWin = 7;
    int pointsToWinBy = 4;
    int skill = 34;
    assertEquals(0.050787140789304845, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.050787140789304845);
  }

  @Test
  public void case65() {
    int pointsToWin = 10;
    int pointsToWinBy = 2;
    int skill = 48;
    assertEquals(0.426213526838083, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.426213526838083);
  }

  @Test
  public void case66() {
    int pointsToWin = 9;
    int pointsToWinBy = 2;
    int skill = 38;
    assertEquals(0.14099043987057447, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.14099043987057447);
  }

  @Test
  public void case67() {
    int pointsToWin = 4;
    int pointsToWinBy = 4;
    int skill = 12;
    assertEquals(0.0003456560423663357, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.0003456560423663357);
  }

  @Test
  public void case68() {
    int pointsToWin = 2;
    int pointsToWinBy = 4;
    int skill = 27;
    assertEquals(0.018370094769793885, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.018370094769793885);
  }

  @Test
  public void case69() {
    int pointsToWin = 10;
    int pointsToWinBy = 5;
    int skill = 21;
    assertEquals(0.0002734850032311632, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.0002734850032311632);
  }

  @Test
  public void case70() {
    int pointsToWin = 5;
    int pointsToWinBy = 2;
    int skill = 49;
    assertEquals(0.47267592578044787, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.47267592578044787);
  }

  @Test
  public void case71() {
    int pointsToWin = 6;
    int pointsToWinBy = 2;
    int skill = 8;
    assertEquals(4.554672826806804e-05, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 4.554672826806804e-05);
  }

  @Test
  public void case72() {
    int pointsToWin = 6;
    int pointsToWinBy = 1;
    int skill = 1;
    assertEquals(4.425434338348e-10, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 4.425434338348e-10);
  }

  @Test
  public void case73() {
    int pointsToWin = 9;
    int pointsToWinBy = 1;
    int skill = 30;
    assertEquals(0.0402769360542546, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.0402769360542546);
  }

  @Test
  public void case74() {
    int pointsToWin = 8;
    int pointsToWinBy = 1;
    int skill = 20;
    assertEquals(0.004239749709824001, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.004239749709824001);
  }

  @Test
  public void case75() {
    int pointsToWin = 7;
    int pointsToWinBy = 1;
    int skill = 10;
    assertEquals(9.928548640000001e-05, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 9.928548640000001e-05);
  }

  @Test
  public void case76() {
    int pointsToWin = 4;
    int pointsToWinBy = 5;
    int skill = 15;
    assertEquals(0.00017111471023167378, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.00017111471023167378);
  }

  @Test
  public void case77() {
    int pointsToWin = 8;
    int pointsToWinBy = 5;
    int skill = 36;
    assertEquals(0.0460605973614878, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.0460605973614878);
  }

  @Test
  public void case78() {
    int pointsToWin = 6;
    int pointsToWinBy = 2;
    int skill = 30;
    assertEquals(0.06331923062068968, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.06331923062068968);
  }

  @Test
  public void case79() {
    int pointsToWin = 5;
    int pointsToWinBy = 5;
    int skill = 48;
    assertEquals(0.40126103608143454, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.40126103608143454);
  }

  @Test
  public void case80() {
    int pointsToWin = 9;
    int pointsToWinBy = 1;
    int skill = 30;
    assertEquals(0.0402769360542546, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.0402769360542546);
  }

  @Test
  public void case81() {
    int pointsToWin = 7;
    int pointsToWinBy = 4;
    int skill = 42;
    assertEquals(0.19956702395603976, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.19956702395603976);
  }

  @Test
  public void case82() {
    int pointsToWin = 2;
    int pointsToWinBy = 3;
    int skill = 19;
    assertEquals(0.012741965446776889, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.012741965446776889);
  }

  @Test
  public void case83() {
    int pointsToWin = 8;
    int pointsToWinBy = 3;
    int skill = 11;
    assertEquals(1.9364280273286726e-05, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 1.9364280273286726e-05);
  }

  @Test
  public void case84() {
    int pointsToWin = 9;
    int pointsToWinBy = 5;
    int skill = 32;
    assertEquals(0.015558722804942745, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.015558722804942745);
  }

  @Test
  public void case85() {
    int pointsToWin = 7;
    int pointsToWinBy = 3;
    int skill = 31;
    assertEquals(0.04316016924324729, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.04316016924324729);
  }

  @Test
  public void case86() {
    int pointsToWin = 10;
    int pointsToWinBy = 5;
    int skill = 50;
    assertEquals(0.4999999999999991, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.4999999999999991);
  }

  @Test
  public void case87() {
    int pointsToWin = 10;
    int pointsToWinBy = 5;
    int skill = 49;
    assertEquals(0.44694092401748997, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.44694092401748997);
  }

  @Test
  public void case88() {
    int pointsToWin = 1;
    int pointsToWinBy = 1;
    int skill = 50;
    assertEquals(0.5, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.5);
  }

  @Test
  public void case89() {
    int pointsToWin = 10;
    int pointsToWinBy = 5;
    int skill = 23;
    assertEquals(0.0006424438832898403, pointsystem.oddsOfWinning(pointsToWin, pointsToWinBy, skill), DELTA * 0.0006424438832898403);
  }

}
