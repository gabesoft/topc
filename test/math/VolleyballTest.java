package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class VolleyballTest {
  double DELTA = 1.0e-09;
  Volleyball volleyball = new Volleyball();

  @Test
  public void case1() {
    int sScore = 13;
    int rScore = 13;
    double probWinServe = 0.5;
    assertEquals(0.5, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.5);
  }

  @Test
  public void case2() {
    int sScore = 1;
    int rScore = 14;
    double probWinServe = 0.01;
    assertEquals(3.355704697986578e-27, volleyball.win(sScore, rScore, probWinServe), DELTA * 3.355704697986578e-27);
  }

  @Test
  public void case3() {
    int sScore = 8;
    int rScore = 12;
    double probWinServe = 0.4;
    assertEquals(0.046377890909090946, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.046377890909090946);
  }

  @Test
  public void case4() {
    int sScore = 9;
    int rScore = 6;
    double probWinServe = 0.4;
    assertEquals(0.8207606501003635, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.8207606501003635);
  }

  @Test
  public void case5() {
    int sScore = 13;
    int rScore = 11;
    double probWinServe = 0.45;
    assertEquals(0.8226249999999999, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.8226249999999999);
  }

  @Test
  public void case6() {
    int sScore = 14;
    int rScore = 14;
    double probWinServe = 0.4;
    assertEquals(0.45454545454545453, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.45454545454545453);
  }

  @Test
  public void case7() {
    int sScore = 13;
    int rScore = 14;
    double probWinServe = 0.4;
    assertEquals(0.18181818181818182, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.18181818181818182);
  }

  @Test
  public void case8() {
    int sScore = 19;
    int rScore = 18;
    double probWinServe = 0.2;
    assertEquals(0.6923076923076923, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.6923076923076923);
  }

  @Test
  public void case9() {
    int sScore = 4;
    int rScore = 3;
    double probWinServe = 0.99;
    assertEquals(0.9058476778308387, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.9058476778308387);
  }

  @Test
  public void case10() {
    int sScore = 4;
    int rScore = 3;
    double probWinServe = 0.01;
    assertEquals(0.6662085066547871, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.6662085066547871);
  }

  @Test
  public void case11() {
    int sScore = 0;
    int rScore = 0;
    double probWinServe = 0.561111;
    assertEquals(0.5092217353167382, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.5092217353167382);
  }

  @Test
  public void case12() {
    int sScore = 85;
    int rScore = 84;
    double probWinServe = 0.111;
    assertEquals(0.6799856011519078, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.6799856011519078);
  }

  @Test
  public void case13() {
    int sScore = 85;
    int rScore = 85;
    double probWinServe = 0.111;
    assertEquals(0.3599712023038157, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.3599712023038157);
  }

  @Test
  public void case14() {
    int sScore = 14;
    int rScore = 0;
    double probWinServe = 0.1;
    assertEquals(0.9999999999999678, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.9999999999999678);
  }

  @Test
  public void case15() {
    int sScore = 1;
    int rScore = 14;
    double probWinServe = 0.99;
    assertEquals(0.8603147284303606, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.8603147284303606);
  }

  @Test
  public void case16() {
    int sScore = 7;
    int rScore = 2;
    double probWinServe = 0.34;
    assertEquals(0.9286294531682486, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.9286294531682486);
  }

  @Test
  public void case17() {
    int sScore = 100;
    int rScore = 100;
    double probWinServe = 0.01;
    assertEquals(0.33557046979865773, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.33557046979865773);
  }

  @Test
  public void case18() {
    int sScore = 15;
    int rScore = 15;
    double probWinServe = 0.9;
    assertEquals(0.8333333333333334, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.8333333333333334);
  }

  @Test
  public void case19() {
    int sScore = 100;
    int rScore = 99;
    double probWinServe = 0.23;
    assertEquals(0.6968503937007875, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.6968503937007875);
  }

  @Test
  public void case20() {
    int sScore = 100;
    int rScore = 99;
    double probWinServe = 0.01;
    assertEquals(0.667785234899329, volleyball.win(sScore, rScore, probWinServe), DELTA * 0.667785234899329);
  }

}
