package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class QuizShowTest {
  QuizShow quizshow = new QuizShow();

  @Test
  public void case1() {
    int[] scores = { 100, 100, 100 };
    int wager1 = 25;
    int wager2 = 75;
    assertEquals(76, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case2() {
    int[] scores = { 10, 50, 60 };
    int wager1 = 30;
    int wager2 = 41;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case3() {
    int[] scores = { 10, 50, 60 };
    int wager1 = 31;
    int wager2 = 41;
    assertEquals(10, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case4() {
    int[] scores = { 2, 2, 12 };
    int wager1 = 0;
    int wager2 = 9;
    assertEquals(2, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case5() {
    int[] scores = { 2, 2, 12 };
    int wager1 = 0;
    int wager2 = 10;
    assertEquals(1, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case6() {
    int[] scores = { 2, 2, 12 };
    int wager1 = 0;
    int wager2 = 11;
    assertEquals(1, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case7() {
    int[] scores = { 2, 2, 12 };
    int wager1 = 0;
    int wager2 = 12;
    assertEquals(1, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case8() {
    int[] scores = { 8243, 4248, 7923 };
    int wager1 = 4248;
    int wager2 = 3942;
    assertEquals(3623, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case9() {
    int[] scores = { 10000, 10000, 10000 };
    int wager1 = 9998;
    int wager2 = 9997;
    assertEquals(9999, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case10() {
    int[] scores = { 5824, 4952, 6230 };
    int wager1 = 364;
    int wager2 = 287;
    assertEquals(694, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case11() {
    int[] scores = { 2983, 2348, 3849 };
    int wager1 = 492;
    int wager2 = 952;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case12() {
    int[] scores = { 429, 23, 238 };
    int wager1 = 23;
    int wager2 = 214;
    assertEquals(24, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case13() {
    int[] scores = { 500, 1000, 1000 };
    int wager1 = 5;
    int wager2 = 10;
    assertEquals(496, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case14() {
    int[] scores = { 1000, 1000, 1000 };
    int wager1 = 1000;
    int wager2 = 1000;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case15() {
    int[] scores = { 1, 10000, 10000 };
    int wager1 = 9999;
    int wager2 = 9999;
    assertEquals(1, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case16() {
    int[] scores = { 10000, 2, 9998 };
    int wager1 = 0;
    int wager2 = 9998;
    assertEquals(9997, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case17() {
    int[] scores = { 10000, 3, 9998 };
    int wager1 = 0;
    int wager2 = 9998;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case18() {
    int[] scores = { 0, 0, 0 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case19() {
    int[] scores = { 1, 0, 0 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case20() {
    int[] scores = { 0, 1, 1 };
    int wager1 = 1;
    int wager2 = 1;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case21() {
    int[] scores = { 0, 1, 1 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case22() {
    int[] scores = { 1, 1, 1 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(1, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case23() {
    int[] scores = { 7904, 1734, 8495 };
    int wager1 = 267;
    int wager2 = 7710;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case24() {
    int[] scores = { 8122, 2393, 6614 };
    int wager1 = 2106;
    int wager2 = 3586;
    assertEquals(2079, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case25() {
    int[] scores = { 1485, 35, 6757 };
    int wager1 = 22;
    int wager2 = 3052;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case26() {
    int[] scores = { 7292, 7914, 4968 };
    int wager1 = 6764;
    int wager2 = 2358;
    assertEquals(35, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case27() {
    int[] scores = { 4603, 2136, 5438 };
    int wager1 = 1020;
    int wager2 = 5146;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case28() {
    int[] scores = { 785, 5615, 7865 };
    int wager1 = 1283;
    int wager2 = 3999;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case29() {
    int[] scores = { 3699, 9403, 3084 };
    int wager1 = 7144;
    int wager2 = 1396;
    assertEquals(782, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case30() {
    int[] scores = { 7808, 944, 3818 };
    int wager1 = 270;
    int wager2 = 581;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case31() {
    int[] scores = { 7442, 45, 1991 };
    int wager1 = 6;
    int wager2 = 1348;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case32() {
    int[] scores = { 2534, 3273, 5848 };
    int wager1 = 2916;
    int wager2 = 4935;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case33() {
    int[] scores = { 2207, 2284, 4150 };
    int wager1 = 2268;
    int wager2 = 3378;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case34() {
    int[] scores = { 1793, 6040, 7100 };
    int wager1 = 175;
    int wager2 = 5610;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case35() {
    int[] scores = { 7634, 6189, 2922 };
    int wager1 = 2773;
    int wager2 = 1256;
    assertEquals(1329, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case36() {
    int[] scores = { 7607, 5750, 767 };
    int wager1 = 4045;
    int wager2 = 383;
    assertEquals(2189, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case37() {
    int[] scores = { 3169, 226, 782 };
    int wager1 = 196;
    int wager2 = 575;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case38() {
    int[] scores = { 5964, 3745, 9524 };
    int wager1 = 1006;
    int wager2 = 2101;
    assertEquals(5662, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case39() {
    int[] scores = { 6075, 431, 6331 };
    int wager1 = 418;
    int wager2 = 2503;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case40() {
    int[] scores = { 1689, 6174, 4623 };
    int wager1 = 38;
    int wager2 = 3184;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case41() {
    int[] scores = { 6000, 3386, 7074 };
    int wager1 = 670;
    int wager2 = 4016;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case42() {
    int[] scores = { 5727, 7418, 7365 };
    int wager1 = 678;
    int wager2 = 6688;
    assertEquals(2370, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case43() {
    int[] scores = { 8555, 7234, 9747 };
    int wager1 = 1213;
    int wager2 = 7872;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case44() {
    int[] scores = { 3745, 9091, 7426 };
    int wager1 = 6674;
    int wager2 = 6073;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case45() {
    int[] scores = { 1892, 6505, 2211 };
    int wager1 = 6088;
    int wager2 = 325;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case46() {
    int[] scores = { 9823, 1537, 9521 };
    int wager1 = 911;
    int wager2 = 1025;
    assertEquals(724, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case47() {
    int[] scores = { 7391, 9445, 3162 };
    int wager1 = 2520;
    int wager2 = 2915;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case48() {
    int[] scores = { 1330, 3900, 9728 };
    int wager1 = 877;
    int wager2 = 5003;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case49() {
    int[] scores = { 3751, 3051, 6680 };
    int wager1 = 2306;
    int wager2 = 609;
    assertEquals(3539, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case50() {
    int[] scores = { 3603, 3028, 766 };
    int wager1 = 1726;
    int wager2 = 361;
    assertEquals(1152, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case51() {
    int[] scores = { 9100, 1779, 3337 };
    int wager1 = 1468;
    int wager2 = 2792;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case52() {
    int[] scores = { 6197, 4296, 8347 };
    int wager1 = 1554;
    int wager2 = 695;
    assertEquals(2846, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case53() {
    int[] scores = { 3698, 2693, 8175 };
    int wager1 = 2270;
    int wager2 = 3224;
    assertEquals(1266, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case54() {
    int[] scores = { 6520, 1786, 3556 };
    int wager1 = 354;
    int wager2 = 1183;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case55() {
    int[] scores = { 9422, 9142, 9571 };
    int wager1 = 3332;
    int wager2 = 6069;
    assertEquals(6219, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case56() {
    int[] scores = { 851, 2090, 6421 };
    int wager1 = 1139;
    int wager2 = 5420;
    assertEquals(151, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case57() {
    int[] scores = { 8373, 1439, 4336 };
    int wager1 = 1176;
    int wager2 = 3560;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case58() {
    int[] scores = { 3817, 5763, 9005 };
    int wager1 = 5362;
    int wager2 = 4673;
    assertEquals(516, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case59() {
    int[] scores = { 9332, 6790, 743 };
    int wager1 = 5355;
    int wager2 = 160;
    assertEquals(2814, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case60() {
    int[] scores = { 8770, 6431, 144 };
    int wager1 = 2557;
    int wager2 = 28;
    assertEquals(219, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case61() {
    int[] scores = { 9461, 7496, 609 };
    int wager1 = 3029;
    int wager2 = 245;
    assertEquals(1065, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case62() {
    int[] scores = { 1030, 3812, 3304 };
    int wager1 = 1922;
    int wager2 = 740;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case63() {
    int[] scores = { 3229, 425, 8323 };
    int wager1 = 262;
    int wager2 = 7591;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case64() {
    int[] scores = { 4372, 3233, 6893 };
    int wager1 = 3089;
    int wager2 = 4121;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case65() {
    int[] scores = { 5680, 5172, 8584 };
    int wager1 = 937;
    int wager2 = 880;
    assertEquals(3785, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case66() {
    int[] scores = { 1081, 8183, 4151 };
    int wager1 = 3120;
    int wager2 = 3740;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case67() {
    int[] scores = { 5085, 2567, 4171 };
    int wager1 = 815;
    int wager2 = 2501;
    assertEquals(1588, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case68() {
    int[] scores = { 3558, 6631, 6412 };
    int wager1 = 5746;
    int wager2 = 6184;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case69() {
    int[] scores = { 6554, 6330, 8481 };
    int wager1 = 6255;
    int wager2 = 6423;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case70() {
    int[] scores = { 6045, 4734, 7491 };
    int wager1 = 145;
    int wager2 = 5286;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case71() {
    int[] scores = { 9572, 8253, 9487 };
    int wager1 = 7335;
    int wager2 = 3553;
    assertEquals(6017, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case72() {
    int[] scores = { 6840, 4983, 2677 };
    int wager1 = 4233;
    int wager2 = 1996;
    assertEquals(2377, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case73() {
    int[] scores = { 1, 0, 0 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case74() {
    int[] scores = { 1000, 5, 5 };
    int wager1 = 2;
    int wager2 = 2;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case75() {
    int[] scores = { 1, 1, 2 };
    int wager1 = 1;
    int wager2 = 1;
    assertEquals(1, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case76() {
    int[] scores = { 100, 10, 10 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case77() {
    int[] scores = { 10, 1, 1 };
    int wager1 = 1;
    int wager2 = 1;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case78() {
    int[] scores = { 1000, 100, 100 };
    int wager1 = 25;
    int wager2 = 75;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case79() {
    int[] scores = { 10000, 0, 0 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case80() {
    int[] scores = { 5, 5, 0 };
    int wager1 = 4;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case81() {
    int[] scores = { 100, 50, 50 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case82() {
    int[] scores = { 888, 888, 444 };
    int wager1 = 98;
    int wager2 = 97;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case83() {
    int[] scores = { 10, 10, 20 };
    int wager1 = 5;
    int wager2 = 6;
    assertEquals(6, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case84() {
    int[] scores = { 9, 10, 2 };
    int wager1 = 3;
    int wager2 = 1;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case85() {
    int[] scores = { 1, 0, 0 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case86() {
    int[] scores = { 1000, 5, 5 };
    int wager1 = 2;
    int wager2 = 2;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case87() {
    int[] scores = { 1, 1, 2 };
    int wager1 = 1;
    int wager2 = 1;
    assertEquals(1, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case88() {
    int[] scores = { 100, 10, 10 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case89() {
    int[] scores = { 10, 1, 1 };
    int wager1 = 1;
    int wager2 = 1;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case90() {
    int[] scores = { 1000, 100, 100 };
    int wager1 = 25;
    int wager2 = 75;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case91() {
    int[] scores = { 10000, 0, 0 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case92() {
    int[] scores = { 5, 5, 0 };
    int wager1 = 4;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case93() {
    int[] scores = { 100, 50, 50 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case94() {
    int[] scores = { 888, 888, 444 };
    int wager1 = 98;
    int wager2 = 97;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case95() {
    int[] scores = { 10, 10, 20 };
    int wager1 = 5;
    int wager2 = 6;
    assertEquals(6, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case96() {
    int[] scores = { 9, 10, 2 };
    int wager1 = 3;
    int wager2 = 1;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case97() {
    int[] scores = { 1, 0, 0 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case98() {
    int[] scores = { 1000, 5, 5 };
    int wager1 = 2;
    int wager2 = 2;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case99() {
    int[] scores = { 1, 1, 2 };
    int wager1 = 1;
    int wager2 = 1;
    assertEquals(1, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case100() {
    int[] scores = { 100, 10, 10 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case101() {
    int[] scores = { 10, 1, 1 };
    int wager1 = 1;
    int wager2 = 1;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case102() {
    int[] scores = { 1000, 100, 100 };
    int wager1 = 25;
    int wager2 = 75;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case103() {
    int[] scores = { 10000, 0, 0 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case104() {
    int[] scores = { 5, 5, 0 };
    int wager1 = 4;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case105() {
    int[] scores = { 100, 50, 50 };
    int wager1 = 0;
    int wager2 = 0;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case106() {
    int[] scores = { 888, 888, 444 };
    int wager1 = 98;
    int wager2 = 97;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case107() {
    int[] scores = { 10, 10, 20 };
    int wager1 = 5;
    int wager2 = 6;
    assertEquals(6, quizshow.wager(scores, wager1, wager2));
  }

  @Test
  public void case108() {
    int[] scores = { 9, 10, 2 };
    int wager1 = 3;
    int wager2 = 1;
    assertEquals(0, quizshow.wager(scores, wager1, wager2));
  }

}
