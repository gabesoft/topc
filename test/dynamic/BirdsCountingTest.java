package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class BirdsCountingTest {
  double DELTA = 1.0e-09;
  BirdsCounting birdscounting = new BirdsCounting();

  @Test
  public void case1() {
    int birdsNumber = 3;
    int caughtPerDay = 1;
    int daysNumber = 2;
    int birdsMarked = 2;
    assertEquals(0.6666666666666666, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.6666666666666666);
  }

  @Test
  public void case2() {
    int birdsNumber = 9;
    int caughtPerDay = 3;
    int daysNumber = 4;
    int birdsMarked = 7;
    assertEquals(0.42061467444120504, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.42061467444120504);
  }

  @Test
  public void case3() {
    int birdsNumber = 3;
    int caughtPerDay = 1;
    int daysNumber = 5;
    int birdsMarked = 1;
    assertEquals(0.012345679012345678, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.012345679012345678);
  }

  @Test
  public void case4() {
    int birdsNumber = 13;
    int caughtPerDay = 1;
    int daysNumber = 2;
    int birdsMarked = 0;
    assertEquals(0.0, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA);
  }

  @Test
  public void case5() {
    int birdsNumber = 8;
    int caughtPerDay = 3;
    int daysNumber = 3;
    int birdsMarked = 7;
    assertEquals(0.2582908163265306, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.2582908163265306);
  }

  @Test
  public void case6() {
    int birdsNumber = 5;
    int caughtPerDay = 1;
    int daysNumber = 5;
    int birdsMarked = 1;
    assertEquals(0.0016000000000000005, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.0016000000000000005);
  }

  @Test
  public void case7() {
    int birdsNumber = 6;
    int caughtPerDay = 3;
    int daysNumber = 3;
    int birdsMarked = 3;
    assertEquals(0.0025000000000000005, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.0025000000000000005);
  }

  @Test
  public void case8() {
    int birdsNumber = 3;
    int caughtPerDay = 2;
    int daysNumber = 2;
    int birdsMarked = 2;
    assertEquals(0.3333333333333333, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.3333333333333333);
  }

  @Test
  public void case9() {
    int birdsNumber = 15;
    int caughtPerDay = 3;
    int daysNumber = 3;
    int birdsMarked = 6;
    assertEquals(0.1562130177514793, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.1562130177514793);
  }

  @Test
  public void case10() {
    int birdsNumber = 5;
    int caughtPerDay = 1;
    int daysNumber = 3;
    int birdsMarked = 1;
    assertEquals(0.04000000000000001, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.04000000000000001);
  }

  @Test
  public void case11() {
    int birdsNumber = 19;
    int caughtPerDay = 7;
    int daysNumber = 5;
    int birdsMarked = 15;
    assertEquals(0.06345877232851325, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.06345877232851325);
  }

  @Test
  public void case12() {
    int birdsNumber = 4;
    int caughtPerDay = 4;
    int daysNumber = 1;
    int birdsMarked = 3;
    assertEquals(0.0, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA);
  }

  @Test
  public void case13() {
    int birdsNumber = 4;
    int caughtPerDay = 2;
    int daysNumber = 2;
    int birdsMarked = 3;
    assertEquals(0.6666666666666666, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.6666666666666666);
  }

  @Test
  public void case14() {
    int birdsNumber = 4;
    int caughtPerDay = 2;
    int daysNumber = 3;
    int birdsMarked = 4;
    assertEquals(0.5277777777777778, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.5277777777777778);
  }

  @Test
  public void case15() {
    int birdsNumber = 5;
    int caughtPerDay = 1;
    int daysNumber = 2;
    int birdsMarked = 1;
    assertEquals(0.2, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.2);
  }

  @Test
  public void case16() {
    int birdsNumber = 20;
    int caughtPerDay = 18;
    int daysNumber = 1;
    int birdsMarked = 18;
    assertEquals(1.0, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 1.0);
  }

  @Test
  public void case17() {
    int birdsNumber = 11;
    int caughtPerDay = 3;
    int daysNumber = 3;
    int birdsMarked = 6;
    assertEquals(0.3023691460055096, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.3023691460055096);
  }

  @Test
  public void case18() {
    int birdsNumber = 1;
    int caughtPerDay = 1;
    int daysNumber = 1;
    int birdsMarked = 0;
    assertEquals(0.0, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA);
  }

  @Test
  public void case19() {
    int birdsNumber = 8;
    int caughtPerDay = 4;
    int daysNumber = 2;
    int birdsMarked = 8;
    assertEquals(0.014285714285714285, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.014285714285714285);
  }

  @Test
  public void case20() {
    int birdsNumber = 7;
    int caughtPerDay = 5;
    int daysNumber = 5;
    int birdsMarked = 7;
    assertEquals(0.9866773617988389, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.9866773617988389);
  }

  @Test
  public void case21() {
    int birdsNumber = 1;
    int caughtPerDay = 1;
    int daysNumber = 1;
    int birdsMarked = 1;
    assertEquals(1.0, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 1.0);
  }

  @Test
  public void case22() {
    int birdsNumber = 9;
    int caughtPerDay = 1;
    int daysNumber = 4;
    int birdsMarked = 2;
    assertEquals(0.07681755829903977, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.07681755829903977);
  }

  @Test
  public void case23() {
    int birdsNumber = 12;
    int caughtPerDay = 12;
    int daysNumber = 3;
    int birdsMarked = 12;
    assertEquals(1.0, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 1.0);
  }

  @Test
  public void case24() {
    int birdsNumber = 8;
    int caughtPerDay = 1;
    int daysNumber = 5;
    int birdsMarked = 5;
    assertEquals(0.205078125, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.205078125);
  }

  @Test
  public void case25() {
    int birdsNumber = 7;
    int caughtPerDay = 3;
    int daysNumber = 4;
    int birdsMarked = 4;
    assertEquals(0.005877551020408162, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.005877551020408162);
  }

  @Test
  public void case26() {
    int birdsNumber = 7;
    int caughtPerDay = 4;
    int daysNumber = 3;
    int birdsMarked = 5;
    assertEquals(0.05877551020408163, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.05877551020408163);
  }

  @Test
  public void case27() {
    int birdsNumber = 5;
    int caughtPerDay = 3;
    int daysNumber = 2;
    int birdsMarked = 4;
    assertEquals(0.6, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.6);
  }

  @Test
  public void case28() {
    int birdsNumber = 16;
    int caughtPerDay = 4;
    int daysNumber = 3;
    int birdsMarked = 10;
    assertEquals(0.2984784446322908, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.2984784446322908);
  }

  @Test
  public void case29() {
    int birdsNumber = 3;
    int caughtPerDay = 3;
    int daysNumber = 5;
    int birdsMarked = 3;
    assertEquals(1.0, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 1.0);
  }

  @Test
  public void case30() {
    int birdsNumber = 3;
    int caughtPerDay = 2;
    int daysNumber = 5;
    int birdsMarked = 2;
    assertEquals(0.012345679012345678, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.012345679012345678);
  }

  @Test
  public void case31() {
    int birdsNumber = 9;
    int caughtPerDay = 8;
    int daysNumber = 4;
    int birdsMarked = 8;
    assertEquals(0.0013717421124828531, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.0013717421124828531);
  }

  @Test
  public void case32() {
    int birdsNumber = 3;
    int caughtPerDay = 1;
    int daysNumber = 4;
    int birdsMarked = 3;
    assertEquals(0.4444444444444444, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.4444444444444444);
  }

  @Test
  public void case33() {
    int birdsNumber = 4;
    int caughtPerDay = 2;
    int daysNumber = 3;
    int birdsMarked = 2;
    assertEquals(0.027777777777777776, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.027777777777777776);
  }

  @Test
  public void case34() {
    int birdsNumber = 7;
    int caughtPerDay = 5;
    int daysNumber = 3;
    int birdsMarked = 5;
    assertEquals(0.0022675736961451243, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.0022675736961451243);
  }

  @Test
  public void case35() {
    int birdsNumber = 4;
    int caughtPerDay = 1;
    int daysNumber = 4;
    int birdsMarked = 1;
    assertEquals(0.015625, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.015625);
  }

  @Test
  public void case36() {
    int birdsNumber = 18;
    int caughtPerDay = 4;
    int daysNumber = 3;
    int birdsMarked = 6;
    assertEquals(0.0017104532444786194, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.0017104532444786194);
  }

  @Test
  public void case37() {
    int birdsNumber = 4;
    int caughtPerDay = 1;
    int daysNumber = 3;
    int birdsMarked = 3;
    assertEquals(0.375, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.375);
  }

  @Test
  public void case38() {
    int birdsNumber = 20;
    int caughtPerDay = 1;
    int daysNumber = 3;
    int birdsMarked = 14;
    assertEquals(0.0, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA);
  }

  @Test
  public void case39() {
    int birdsNumber = 10;
    int caughtPerDay = 1;
    int daysNumber = 5;
    int birdsMarked = 5;
    assertEquals(0.3024, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.3024);
  }

  @Test
  public void case40() {
    int birdsNumber = 9;
    int caughtPerDay = 5;
    int daysNumber = 4;
    int birdsMarked = 8;
    assertEquals(0.2969041820137814, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.2969041820137814);
  }

  @Test
  public void case41() {
    int birdsNumber = 20;
    int caughtPerDay = 8;
    int daysNumber = 5;
    int birdsMarked = 16;
    assertEquals(0.031148695128343194, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.031148695128343194);
  }

  @Test
  public void case42() {
    int birdsNumber = 19;
    int caughtPerDay = 9;
    int daysNumber = 3;
    int birdsMarked = 18;
    assertEquals(0.11357185172124559, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.11357185172124559);
  }

  @Test
  public void case43() {
    int birdsNumber = 17;
    int caughtPerDay = 9;
    int daysNumber = 5;
    int birdsMarked = 14;
    assertEquals(0.002369967909006005, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.002369967909006005);
  }

  @Test
  public void case44() {
    int birdsNumber = 4;
    int caughtPerDay = 3;
    int daysNumber = 4;
    int birdsMarked = 3;
    assertEquals(0.015625, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.015625);
  }

  @Test
  public void case45() {
    int birdsNumber = 12;
    int caughtPerDay = 9;
    int daysNumber = 3;
    int birdsMarked = 11;
    assertEquals(0.17516528925619834, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.17516528925619834);
  }

  @Test
  public void case46() {
    int birdsNumber = 16;
    int caughtPerDay = 3;
    int daysNumber = 4;
    int birdsMarked = 12;
    assertEquals(0.006839923469387754, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.006839923469387754);
  }

  @Test
  public void case47() {
    int birdsNumber = 9;
    int caughtPerDay = 4;
    int daysNumber = 3;
    int birdsMarked = 9;
    assertEquals(0.09448223733938019, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.09448223733938019);
  }

  @Test
  public void case48() {
    int birdsNumber = 10;
    int caughtPerDay = 8;
    int daysNumber = 3;
    int birdsMarked = 8;
    assertEquals(0.0004938271604938272, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.0004938271604938272);
  }

  @Test
  public void case49() {
    int birdsNumber = 7;
    int caughtPerDay = 3;
    int daysNumber = 5;
    int birdsMarked = 5;
    assertEquals(0.037940191586838805, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.037940191586838805);
  }

  @Test
  public void case50() {
    int birdsNumber = 14;
    int caughtPerDay = 8;
    int daysNumber = 3;
    int birdsMarked = 11;
    assertEquals(0.04744284464564186, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.04744284464564186);
  }

  @Test
  public void case51() {
    int birdsNumber = 12;
    int caughtPerDay = 9;
    int daysNumber = 5;
    int birdsMarked = 11;
    assertEquals(0.011693138276074039, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.011693138276074039);
  }

  @Test
  public void case52() {
    int birdsNumber = 18;
    int caughtPerDay = 8;
    int daysNumber = 5;
    int birdsMarked = 14;
    assertEquals(0.0037659812026760746, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.0037659812026760746);
  }

  @Test
  public void case53() {
    int birdsNumber = 11;
    int caughtPerDay = 5;
    int daysNumber = 3;
    int birdsMarked = 5;
    assertEquals(4.685069620134555e-06, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 4.685069620134555e-06);
  }

  @Test
  public void case54() {
    int birdsNumber = 3;
    int caughtPerDay = 2;
    int daysNumber = 4;
    int birdsMarked = 2;
    assertEquals(0.037037037037037035, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.037037037037037035);
  }

  @Test
  public void case55() {
    int birdsNumber = 2;
    int caughtPerDay = 2;
    int daysNumber = 3;
    int birdsMarked = 2;
    assertEquals(1.0, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 1.0);
  }

  @Test
  public void case56() {
    int birdsNumber = 1;
    int caughtPerDay = 1;
    int daysNumber = 4;
    int birdsMarked = 1;
    assertEquals(1.0, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 1.0);
  }

  @Test
  public void case57() {
    int birdsNumber = 7;
    int caughtPerDay = 1;
    int daysNumber = 5;
    int birdsMarked = 2;
    assertEquals(0.03748438150770512, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.03748438150770512);
  }

  @Test
  public void case58() {
    int birdsNumber = 15;
    int caughtPerDay = 5;
    int daysNumber = 3;
    int birdsMarked = 13;
    assertEquals(0.031087793325555564, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.031087793325555564);
  }

  @Test
  public void case59() {
    int birdsNumber = 10;
    int caughtPerDay = 2;
    int daysNumber = 4;
    int birdsMarked = 3;
    assertEquals(0.002282578875171468, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.002282578875171468);
  }

  @Test
  public void case60() {
    int birdsNumber = 8;
    int caughtPerDay = 6;
    int daysNumber = 4;
    int birdsMarked = 6;
    assertEquals(4.55539358600583e-05, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 4.55539358600583e-05);
  }

  @Test
  public void case61() {
    int birdsNumber = 19;
    int caughtPerDay = 7;
    int daysNumber = 5;
    int birdsMarked = 14;
    assertEquals(0.010553063029764668, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.010553063029764668);
  }

  @Test
  public void case62() {
    int birdsNumber = 19;
    int caughtPerDay = 7;
    int daysNumber = 5;
    int birdsMarked = 13;
    assertEquals(0.0009294088086285515, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.0009294088086285515);
  }

  @Test
  public void case63() {
    int birdsNumber = 19;
    int caughtPerDay = 7;
    int daysNumber = 5;
    int birdsMarked = 15;
    assertEquals(0.06345877232851325, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.06345877232851325);
  }

  @Test
  public void case64() {
    int birdsNumber = 19;
    int caughtPerDay = 7;
    int daysNumber = 5;
    int birdsMarked = 17;
    assertEquals(0.3482456585678702, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.3482456585678702);
  }

  @Test
  public void case65() {
    int birdsNumber = 19;
    int caughtPerDay = 7;
    int daysNumber = 5;
    int birdsMarked = 18;
    assertEquals(0.28512030286393125, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.28512030286393125);
  }

  @Test
  public void case66() {
    int birdsNumber = 19;
    int caughtPerDay = 7;
    int daysNumber = 5;
    int birdsMarked = 19;
    assertEquals(0.08655292058346278, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.08655292058346278);
  }

  @Test
  public void case67() {
    int birdsNumber = 10;
    int caughtPerDay = 2;
    int daysNumber = 4;
    int birdsMarked = 4;
    assertEquals(0.05008504801097394, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.05008504801097394);
  }

  @Test
  public void case68() {
    int birdsNumber = 10;
    int caughtPerDay = 2;
    int daysNumber = 4;
    int birdsMarked = 5;
    assertEquals(0.2654814814814815, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.2654814814814815);
  }

  @Test
  public void case69() {
    int birdsNumber = 10;
    int caughtPerDay = 2;
    int daysNumber = 4;
    int birdsMarked = 6;
    assertEquals(0.4332510288065844, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.4332510288065844);
  }

  @Test
  public void case70() {
    int birdsNumber = 10;
    int caughtPerDay = 2;
    int daysNumber = 4;
    int birdsMarked = 7;
    assertEquals(0.22123456790123455, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.22123456790123455);
  }

  @Test
  public void case71() {
    int birdsNumber = 10;
    int caughtPerDay = 2;
    int daysNumber = 4;
    int birdsMarked = 8;
    assertEquals(0.02765432098765432, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.02765432098765432);
  }

  @Test
  public void case72() {
    int birdsNumber = 17;
    int caughtPerDay = 9;
    int daysNumber = 5;
    int birdsMarked = 16;
    assertEquals(0.29923666251305214, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.29923666251305214);
  }

  @Test
  public void case73() {
    int birdsNumber = 17;
    int caughtPerDay = 9;
    int daysNumber = 5;
    int birdsMarked = 17;
    assertEquals(0.6554514923169341, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.6554514923169341);
  }

  @Test
  public void case74() {
    int birdsNumber = 20;
    int caughtPerDay = 6;
    int daysNumber = 5;
    int birdsMarked = 13;
    assertEquals(0.00678008576246766, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.00678008576246766);
  }

  @Test
  public void case75() {
    int birdsNumber = 20;
    int caughtPerDay = 6;
    int daysNumber = 5;
    int birdsMarked = 14;
    assertEquals(0.039847279126155724, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.039847279126155724);
  }

  @Test
  public void case76() {
    int birdsNumber = 20;
    int caughtPerDay = 6;
    int daysNumber = 5;
    int birdsMarked = 15;
    assertEquals(0.13483311440416074, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.13483311440416074);
  }

  @Test
  public void case77() {
    int birdsNumber = 20;
    int caughtPerDay = 6;
    int daysNumber = 5;
    int birdsMarked = 16;
    assertEquals(0.26541624621090926, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.26541624621090926);
  }

  @Test
  public void case78() {
    int birdsNumber = 20;
    int caughtPerDay = 6;
    int daysNumber = 5;
    int birdsMarked = 17;
    assertEquals(0.30035494805367574, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.30035494805367574);
  }

  @Test
  public void case79() {
    int birdsNumber = 20;
    int caughtPerDay = 6;
    int daysNumber = 5;
    int birdsMarked = 18;
    assertEquals(0.18722122247037307, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.18722122247037307);
  }

  @Test
  public void case80() {
    int birdsNumber = 20;
    int caughtPerDay = 6;
    int daysNumber = 5;
    int birdsMarked = 19;
    assertEquals(0.05807073960941394, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.05807073960941394);
  }

  @Test
  public void case81() {
    int birdsNumber = 20;
    int caughtPerDay = 6;
    int daysNumber = 5;
    int birdsMarked = 20;
    assertEquals(0.006799696517512649, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA * 0.006799696517512649);
  }

  @Test
  public void case82() {
    int birdsNumber = 20;
    int caughtPerDay = 2;
    int daysNumber = 5;
    int birdsMarked = 16;
    assertEquals(0.0, birdscounting.computeProbability(birdsNumber, caughtPerDay, daysNumber, birdsMarked), DELTA);
  }

}
