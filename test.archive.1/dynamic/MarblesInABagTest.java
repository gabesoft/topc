package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class MarblesInABagTest {
  double DELTA = 1.0e-09;
  MarblesInABag marblesinabag = new MarblesInABag();

  @Test
  public void case1() {
    int redCount = 1;
    int blueCount = 2;
    assertEquals(0.3333333333333333, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.3333333333333333);
  }

  @Test
  public void case2() {
    int redCount = 2;
    int blueCount = 3;
    assertEquals(0.13333333333333333, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.13333333333333333);
  }

  @Test
  public void case3() {
    int redCount = 2;
    int blueCount = 5;
    assertEquals(0.22857142857142856, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.22857142857142856);
  }

  @Test
  public void case4() {
    int redCount = 11;
    int blueCount = 6;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case5() {
    int redCount = 319;
    int blueCount = 3000;
    assertEquals(1.0789966341876459e-09, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.0789966341876459e-09);
  }

  @Test
  public void case6() {
    int redCount = 318;
    int blueCount = 2969;
    assertEquals(1.0014681368677624e-09, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.0014681368677624e-09);
  }

  @Test
  public void case7() {
    int redCount = 0;
    int blueCount = 13;
    assertEquals(1.0, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.0);
  }

  @Test
  public void case8() {
    int redCount = 369;
    int blueCount = 4000;
    assertEquals(1.027386377638627e-09, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.027386377638627e-09);
  }

  @Test
  public void case9() {
    int redCount = 3999;
    int blueCount = 4000;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case10() {
    int redCount = 4;
    int blueCount = 11;
    assertEquals(0.12183372183372182, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.12183372183372182);
  }

  @Test
  public void case11() {
    int redCount = 41;
    int blueCount = 2468;
    assertEquals(0.2857738903477601, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.2857738903477601);
  }

  @Test
  public void case12() {
    int redCount = 233;
    int blueCount = 2500;
    assertEquals(7.400574775634656e-07, marblesinabag.getProbability(redCount, blueCount), DELTA * 7.400574775634656e-07);
  }

  @Test
  public void case13() {
    int redCount = 316;
    int blueCount = 3725;
    assertEquals(4.8158789702632905e-08, marblesinabag.getProbability(redCount, blueCount), DELTA * 4.8158789702632905e-08);
  }

  @Test
  public void case14() {
    int redCount = 135;
    int blueCount = 3478;
    assertEquals(0.009291698497459073, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.009291698497459073);
  }

  @Test
  public void case15() {
    int redCount = 46;
    int blueCount = 2963;
    assertEquals(0.27599774658315296, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.27599774658315296);
  }

  @Test
  public void case16() {
    int redCount = 145;
    int blueCount = 1706;
    assertEquals(0.00013398675593468236, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.00013398675593468236);
  }

  @Test
  public void case17() {
    int redCount = 82;
    int blueCount = 3281;
    assertEquals(0.08465914427175113, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.08465914427175113);
  }

  @Test
  public void case18() {
    int redCount = 49;
    int blueCount = 1962;
    assertEquals(0.16783155660153382, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.16783155660153382);
  }

  @Test
  public void case19() {
    int redCount = 299;
    int blueCount = 3942;
    assertEquals(4.4535674142703256e-07, marblesinabag.getProbability(redCount, blueCount), DELTA * 4.4535674142703256e-07);
  }

  @Test
  public void case20() {
    int redCount = 82;
    int blueCount = 1437;
    assertEquals(0.013213023238952888, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.013213023238952888);
  }

  @Test
  public void case21() {
    int redCount = 39;
    int blueCount = 2604;
    assertEquals(0.31841140007676555, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.31841140007676555);
  }

  @Test
  public void case22() {
    int redCount = 153;
    int blueCount = 3902;
    assertEquals(0.005755807316760704, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.005755807316760704);
  }

  @Test
  public void case23() {
    int redCount = 29;
    int blueCount = 382;
    assertEquals(0.07349514473114374, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.07349514473114374);
  }

  @Test
  public void case24() {
    int redCount = 142;
    int blueCount = 2717;
    assertEquals(0.0023890683868597953, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.0023890683868597953);
  }

  @Test
  public void case25() {
    int redCount = 371;
    int blueCount = 3896;
    assertEquals(5.19113853670316e-10, marblesinabag.getProbability(redCount, blueCount), DELTA * 5.19113853670316e-10);
  }

  @Test
  public void case26() {
    int redCount = 144;
    int blueCount = 1727;
    assertEquals(0.0001606658463836652, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.0001606658463836652);
  }

  @Test
  public void case27() {
    int redCount = 277;
    int blueCount = 3538;
    assertEquals(7.601962589424384e-07, marblesinabag.getProbability(redCount, blueCount), DELTA * 7.601962589424384e-07);
  }

  @Test
  public void case28() {
    int redCount = 186;
    int blueCount = 3913;
    assertEquals(0.0010261767307635475, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.0010261767307635475);
  }

  @Test
  public void case29() {
    int redCount = 166;
    int blueCount = 2299;
    assertEquals(0.00016370093111230552, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.00016370093111230552);
  }

  @Test
  public void case30() {
    int redCount = 103;
    int blueCount = 1894;
    assertEquals(0.007330283649328616, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.007330283649328616);
  }

  @Test
  public void case31() {
    int redCount = 70;
    int blueCount = 3811;
    assertEquals(0.15933479136057596, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.15933479136057596);
  }

  @Test
  public void case32() {
    int redCount = 233;
    int blueCount = 3322;
    assertEquals(1.423300148373267e-05, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.423300148373267e-05);
  }

  @Test
  public void case33() {
    int redCount = 66;
    int blueCount = 1673;
    assertEquals(0.05533271387815977, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.05533271387815977);
  }

  @Test
  public void case34() {
    int redCount = 314;
    int blueCount = 3711;
    assertEquals(5.471596399392672e-08, marblesinabag.getProbability(redCount, blueCount), DELTA * 5.471596399392672e-08);
  }

  @Test
  public void case35() {
    int redCount = 253;
    int blueCount = 2868;
    assertEquals(5.361268623796721e-07, marblesinabag.getProbability(redCount, blueCount), DELTA * 5.361268623796721e-07);
  }

  @Test
  public void case36() {
    int redCount = 154;
    int blueCount = 3645;
    assertEquals(0.004196501433766912, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.004196501433766912);
  }

  @Test
  public void case37() {
    int redCount = 66;
    int blueCount = 757;
    assertEquals(0.0065450699298992485, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.0065450699298992485);
  }

  @Test
  public void case38() {
    int redCount = 37;
    int blueCount = 860;
    assertEquals(0.12118554773860966, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.12118554773860966);
  }

  @Test
  public void case39() {
    int redCount = 72;
    int blueCount = 1741;
    assertEquals(0.04219075266984772, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.04219075266984772);
  }

  @Test
  public void case40() {
    int redCount = 77;
    int blueCount = 3530;
    assertEquals(0.11386716585379968, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.11386716585379968);
  }

  @Test
  public void case41() {
    int redCount = 31;
    int blueCount = 3036;
    assertEquals(0.44683943441800783, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.44683943441800783);
  }

  @Test
  public void case42() {
    int redCount = 184;
    int blueCount = 2191;
    assertEquals(2.310947760364422e-05, marblesinabag.getProbability(redCount, blueCount), DELTA * 2.310947760364422e-05);
  }

  @Test
  public void case43() {
    int redCount = 28;
    int blueCount = 2107;
    assertEquals(0.41327155268717336, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.41327155268717336);
  }

  @Test
  public void case44() {
    int redCount = 94;
    int blueCount = 1041;
    assertEquals(0.0012351966635389174, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.0012351966635389174);
  }

  @Test
  public void case45() {
    int redCount = 264;
    int blueCount = 3265;
    assertEquals(9.126378309582937e-07, marblesinabag.getProbability(redCount, blueCount), DELTA * 9.126378309582937e-07);
  }

  @Test
  public void case46() {
    int redCount = 344;
    int blueCount = 3805;
    assertEquals(4.875851478757178e-09, marblesinabag.getProbability(redCount, blueCount), DELTA * 4.875851478757178e-09);
  }

  @Test
  public void case47() {
    int redCount = 272;
    int blueCount = 3891;
    assertEquals(3.2747879340481335e-06, marblesinabag.getProbability(redCount, blueCount), DELTA * 3.2747879340481335e-06);
  }

  @Test
  public void case48() {
    int redCount = 37;
    int blueCount = 3350;
    assertEquals(0.394299209600666, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.394299209600666);
  }

  @Test
  public void case49() {
    int redCount = 300;
    int blueCount = 3101;
    assertEquals(1.4615031054310325e-08, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.4615031054310325e-08);
  }

  @Test
  public void case50() {
    int redCount = 39;
    int blueCount = 3548;
    assertEquals(0.38431787577451304, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.38431787577451304);
  }

  @Test
  public void case51() {
    int redCount = 623;
    int blueCount = 3630;
    assertEquals(3.904405782452034e-26, marblesinabag.getProbability(redCount, blueCount), DELTA * 3.904405782452034e-26);
  }

  @Test
  public void case52() {
    int redCount = 84;
    int blueCount = 3955;
    assertEquals(0.10462954858990839, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.10462954858990839);
  }

  @Test
  public void case53() {
    int redCount = 2756;
    int blueCount = 3841;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case54() {
    int redCount = 966;
    int blueCount = 3377;
    assertEquals(4.4613505531156827e-64, marblesinabag.getProbability(redCount, blueCount), DELTA * 4.4613505531156827e-64);
  }

  @Test
  public void case55() {
    int redCount = 1931;
    int blueCount = 2308;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case56() {
    int redCount = 944;
    int blueCount = 439;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case57() {
    int redCount = 626;
    int blueCount = 3323;
    assertEquals(1.3146792913491548e-28, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.3146792913491548e-28);
  }

  @Test
  public void case58() {
    int redCount = 1537;
    int blueCount = 1538;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case59() {
    int redCount = 118;
    int blueCount = 2083;
    assertEquals(0.0037330326851001167, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.0037330326851001167);
  }

  @Test
  public void case60() {
    int redCount = 2929;
    int blueCount = 542;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case61() {
    int redCount = 833;
    int blueCount = 3116;
    assertEquals(4.431535401569654e-52, marblesinabag.getProbability(redCount, blueCount), DELTA * 4.431535401569654e-52);
  }

  @Test
  public void case62() {
    int redCount = 4000;
    int blueCount = 3999;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case63() {
    int redCount = 1;
    int blueCount = 0;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case64() {
    int redCount = 3;
    int blueCount = 0;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case65() {
    int redCount = 3999;
    int blueCount = 0;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case66() {
    int redCount = 0;
    int blueCount = 1;
    assertEquals(1.0, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.0);
  }

  @Test
  public void case67() {
    int redCount = 0;
    int blueCount = 3;
    assertEquals(1.0, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.0);
  }

  @Test
  public void case68() {
    int redCount = 0;
    int blueCount = 3999;
    assertEquals(1.0, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.0);
  }

  @Test
  public void case69() {
    int redCount = 2999;
    int blueCount = 4000;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case70() {
    int redCount = 100;
    int blueCount = 3999;
    assertEquals(0.06012370032768307, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.06012370032768307);
  }

  @Test
  public void case71() {
    int redCount = 2001;
    int blueCount = 4000;
    assertEquals(2.67852391672556e-231, marblesinabag.getProbability(redCount, blueCount), DELTA * 2.67852391672556e-231);
  }

  @Test
  public void case72() {
    int redCount = 3998;
    int blueCount = 3999;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case73() {
    int redCount = 1999;
    int blueCount = 3998;
    assertEquals(6.037207771130375e-231, marblesinabag.getProbability(redCount, blueCount), DELTA * 6.037207771130375e-231);
  }

  @Test
  public void case74() {
    int redCount = 3169;
    int blueCount = 3998;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case75() {
    int redCount = 1999;
    int blueCount = 4000;
    assertEquals(8.052952917314544e-231, marblesinabag.getProbability(redCount, blueCount), DELTA * 8.052952917314544e-231);
  }

  @Test
  public void case76() {
    int redCount = 2000;
    int blueCount = 3999;
    assertEquals(4.021460617208094e-231, marblesinabag.getProbability(redCount, blueCount), DELTA * 4.021460617208094e-231);
  }

  @Test
  public void case77() {
    int redCount = 11;
    int blueCount = 2000;
    assertEquals(0.7198760401207562, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.7198760401207562);
  }

  @Test
  public void case78() {
    int redCount = 3001;
    int blueCount = 4000;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case79() {
    int redCount = 2567;
    int blueCount = 3984;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case80() {
    int redCount = 160;
    int blueCount = 1973;
    assertEquals(9.285636197148742e-05, marblesinabag.getProbability(redCount, blueCount), DELTA * 9.285636197148742e-05);
  }

  @Test
  public void case81() {
    int redCount = 3999;
    int blueCount = 3998;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case82() {
    int redCount = 3000;
    int blueCount = 3001;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case83() {
    int redCount = 201;
    int blueCount = 4000;
    assertEquals(0.0004904044392672374, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.0004904044392672374);
  }

  @Test
  public void case84() {
    int redCount = 101;
    int blueCount = 4000;
    assertEquals(0.05795115870026031, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.05795115870026031);
  }

  @Test
  public void case85() {
    int redCount = 201;
    int blueCount = 3998;
    assertEquals(0.0004889608126783985, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.0004889608126783985);
  }

  @Test
  public void case86() {
    int redCount = 123;
    int blueCount = 4000;
    assertEquals(0.02427047111705665, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.02427047111705665);
  }

  @Test
  public void case87() {
    int redCount = 3000;
    int blueCount = 3901;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case88() {
    int redCount = 3213;
    int blueCount = 4000;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case89() {
    int redCount = 50;
    int blueCount = 3999;
    assertEquals(0.3044221915596899, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.3044221915596899);
  }

  @Test
  public void case90() {
    int redCount = 1500;
    int blueCount = 3999;
    assertEquals(9.184597965197581e-129, marblesinabag.getProbability(redCount, blueCount), DELTA * 9.184597965197581e-129);
  }

  @Test
  public void case91() {
    int redCount = 3;
    int blueCount = 6;
    assertEquals(0.11428571428571427, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.11428571428571427);
  }

  @Test
  public void case92() {
    int redCount = 2893;
    int blueCount = 3678;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case93() {
    int redCount = 2000;
    int blueCount = 2871;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case94() {
    int redCount = 301;
    int blueCount = 2000;
    assertEquals(2.585211360800066e-12, marblesinabag.getProbability(redCount, blueCount), DELTA * 2.585211360800066e-12);
  }

  @Test
  public void case95() {
    int redCount = 2000;
    int blueCount = 1999;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case96() {
    int redCount = 500;
    int blueCount = 3999;
    assertEquals(3.5323439031614692e-16, marblesinabag.getProbability(redCount, blueCount), DELTA * 3.5323439031614692e-16);
  }

  @Test
  public void case97() {
    int redCount = 4;
    int blueCount = 501;
    assertEquals(0.7889006745979239, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.7889006745979239);
  }

  @Test
  public void case98() {
    int redCount = 1520;
    int blueCount = 3999;
    assertEquals(3.164747715787049e-132, marblesinabag.getProbability(redCount, blueCount), DELTA * 3.164747715787049e-132);
  }

  @Test
  public void case99() {
    int redCount = 1169;
    int blueCount = 3998;
    assertEquals(1.2245073481844732e-78, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.2245073481844732e-78);
  }

  @Test
  public void case100() {
    int redCount = 600;
    int blueCount = 1201;
    assertEquals(2.0923709784403826e-71, marblesinabag.getProbability(redCount, blueCount), DELTA * 2.0923709784403826e-71);
  }

  @Test
  public void case101() {
    int redCount = 3007;
    int blueCount = 3952;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case102() {
    int redCount = 1501;
    int blueCount = 4000;
    assertEquals(6.67130302438379e-129, marblesinabag.getProbability(redCount, blueCount), DELTA * 6.67130302438379e-129);
  }

  @Test
  public void case103() {
    int redCount = 3800;
    int blueCount = 3901;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case104() {
    int redCount = 49;
    int blueCount = 4000;
    assertEquals(0.3130582472631488, marblesinabag.getProbability(redCount, blueCount), DELTA * 0.3130582472631488);
  }

  @Test
  public void case105() {
    int redCount = 3981;
    int blueCount = 4000;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case106() {
    int redCount = 2100;
    int blueCount = 3301;
    assertEquals(1.0075407e-317, marblesinabag.getProbability(redCount, blueCount), DELTA * 1.0075407e-317);
  }

  @Test
  public void case107() {
    int redCount = 999;
    int blueCount = 4000;
    assertEquals(6.214680600113773e-58, marblesinabag.getProbability(redCount, blueCount), DELTA * 6.214680600113773e-58);
  }

  @Test
  public void case108() {
    int redCount = 3990;
    int blueCount = 3999;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

  @Test
  public void case109() {
    int redCount = 2673;
    int blueCount = 2890;
    assertEquals(0.0, marblesinabag.getProbability(redCount, blueCount), DELTA);
  }

}
