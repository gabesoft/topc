package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class InfiniteSequenceTest {
  InfiniteSequence infinitesequence = new InfiniteSequence();

  @Test
  public void case1() {
    long n = 0L;
    int p = 2;
    int q = 3;
    assertEquals(1L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case2() {
    long n = 7L;
    int p = 2;
    int q = 3;
    assertEquals(7L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case3() {
    long n = 10000000L;
    int p = 3;
    int q = 3;
    assertEquals(32768L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case4() {
    long n = 256L;
    int p = 2;
    int q = 4;
    assertEquals(89L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case5() {
    long n = 1L;
    int p = 1000000;
    int q = 1000000;
    assertEquals(2L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case6() {
    long n = 1000000000000L;
    int p = 2;
    int q = 2;
    assertEquals(1099511627776L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case7() {
    long n = 1000000000000L;
    int p = 2;
    int q = 3;
    assertEquals(4266563557L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case8() {
    long n = 1000000000000L;
    int p = 3;
    int q = 3;
    assertEquals(67108864L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case9() {
    long n = 1000000000000L;
    int p = 2;
    int q = 1000000000;
    assertEquals(96L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case10() {
    long n = 1000000000000L;
    int p = 1000000000;
    int q = 1000000000;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case11() {
    long n = 987654321234L;
    int p = 2;
    int q = 3;
    assertEquals(4135435417L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case12() {
    long n = 1000000000000L;
    int p = 2;
    int q = 4;
    assertEquals(267914296L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case13() {
    long n = 692777636915L;
    int p = 846930888;
    int q = 4289385;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case14() {
    long n = 885386760492L;
    int p = 424238337;
    int q = 157747795;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case15() {
    long n = 202362490027L;
    int p = 289641423;
    int q = 596516651;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case16() {
    long n = 897763513926L;
    int p = 202520061;
    int q = 783368692;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case17() {
    long n = 89172455736L;
    int p = 640383428;
    int q = 465180542;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case18() {
    long n = 702567956429L;
    int p = 521595370;
    int q = 35005213;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case19() {
    long n = 722862665123L;
    int p = 861021532;
    int q = 336465784;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case20() {
    long n = 513929979802L;
    int p = 468703137;
    int q = 345174069;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case21() {
    long n = 133069898167L;
    int p = 635723060;
    int q = 415634024;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case22() {
    long n = 175011478042L;
    int p = 289018458;
    int q = 159961395;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case23() {
    long n = 484421544919L;
    int p = 753377375;
    int q = 231176231;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case24() {
    long n = 575198594324L;
    int p = 756898539;
    int q = 608413786;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case25() {
    long n = 566413803526L;
    int p = 238664372;
    int q = 149798317;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case26() {
    long n = 759956241873L;
    int p = 524268982;
    int q = 412776093;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case27() {
    long n = 906996497281L;
    int p = 42999172;
    int q = 137806864;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case28() {
    long n = 477084336327L;
    int p = 284420927;
    int q = 511702307;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case29() {
    long n = 750846621729L;
    int p = 259126507;
    int q = 572660338;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case30() {
    long n = 616124353895L;
    int p = 533925859;
    int q = 200661315;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case31() {
    long n = 898814233367L;
    int p = 201100547;
    int q = 39819584;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case32() {
    long n = 344043313750L;
    int p = 685990366;
    int q = 610515436;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case33() {
    long n = 117276947178L;
    int p = 356426810;
    int q = 577171089;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case34() {
    long n = 705403502651L;
    int p = 709393586;
    int q = 880695790;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case35() {
    long n = 999932095060L;
    int p = 574612401;
    int q = 752392756;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case36() {
    long n = 947739210012L;
    int p = 43993370;
    int q = 511549678;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case37() {
    long n = 348094297539L;
    int p = 849698588;
    int q = 855636228;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case38() {
    long n = 651434960378L;
    int p = 463480572;
    int q = 136140797;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case39() {
    long n = 710097612902L;
    int p = 92066603;
    int q = 317097469;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case40() {
    long n = 926652260756L;
    int p = 603570494;
    int q = 430573319;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case41() {
    long n = 724286209441L;
    int p = 485560282;
    int q = 59997303;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case42() {
    long n = 228444346619L;
    int p = 894429691;
    int q = 294953867;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case43() {
    long n = 958031108117L;
    int p = 270744731;
    int q = 221558442;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case44() {
    long n = 834481890675L;
    int p = 207905773;
    int q = 314738099;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case45() {
    long n = 704567777856L;
    int p = 791698929;
    int q = 710120711;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case46() {
    long n = 254586276965L;
    int p = 524872355;
    int q = 355179499;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case47() {
    long n = 406219028624L;
    int p = 803964685;
    int q = 269455308;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case48() {
    long n = 805732048829L;
    int p = 240332873;
    int q = 160051530;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case49() {
    long n = 258270363368L;
    int p = 515530021;
    int q = 378409505;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case50() {
    long n = 226340518149L;
    int p = 277486717;
    int q = 509959710;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case51() {
    long n = 142618002245L;
    int p = 289700725;
    int q = 200747798;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case52() {
    long n = 892921243555L;
    int p = 439493453;
    int q = 150122848;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case53() {
    long n = 537764888228L;
    int p = 722597490;
    int q = 331192381;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case54() {
    long n = 165193441500L;
    int p = 438792352;
    int q = 347469843;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case55() {
    long n = 470124324914L;
    int p = 116087766;
    int q = 342757036;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case56() {
    long n = 373743346491L;
    int p = 182275858;
    int q = 8936989;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case57() {
    long n = 709859281936L;
    int p = 841148367;
    int q = 350322229;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case58() {
    long n = 316437899228L;
    int p = 286452553;
    int q = 771151434;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case59() {
    long n = 901474276121L;
    int p = 213975409;
    int q = 576153277;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case60() {
    long n = 36029661237L;
    int p = 330794397;
    int q = 653468860;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case61() {
    long n = 65818894428L;
    int p = 450573795;
    int q = 705908237;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case62() {
    long n = 335928639529L;
    int p = 187231013;
    int q = 889366145;
    assertEquals(4L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case63() {
    long n = 11111111110L;
    int p = 2;
    int q = 2;
    assertEquals(17179869184L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case64() {
    long n = 999999999999L;
    int p = 2;
    int q = 2;
    assertEquals(1099511627776L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case65() {
    long n = 999999999999L;
    int p = 2;
    int q = 3;
    assertEquals(4266563557L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case66() {
    long n = 1000000000000L;
    int p = 13;
    int q = 3;
    assertEquals(102737L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case67() {
    long n = 100000000000L;
    int p = 2;
    int q = 3;
    assertEquals(673272766L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case68() {
    long n = 1000000000000L;
    int p = 4325435;
    int q = 2;
    assertEquals(212L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case69() {
    long n = 10000001111L;
    int p = 3;
    int q = 2;
    assertEquals(110809534L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case70() {
    long n = 99999999999L;
    int p = 2;
    int q = 3;
    assertEquals(673272766L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case71() {
    long n = 100000000000L;
    int p = 2;
    int q = 2;
    assertEquals(137438953472L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case72() {
    long n = 999999998127L;
    int p = 2;
    int q = 3;
    assertEquals(4266563557L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case73() {
    long n = 1000000000000L;
    int p = 2;
    int q = 1000000;
    assertEquals(252L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case74() {
    long n = 99999989999L;
    int p = 2;
    int q = 3;
    assertEquals(673272766L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case75() {
    long n = 1000000000000L;
    int p = 3;
    int q = 7;
    assertEquals(585167L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case76() {
    long n = 99999999999L;
    int p = 2;
    int q = 2;
    assertEquals(137438953472L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case77() {
    long n = 1000000000L;
    int p = 2;
    int q = 2;
    assertEquals(1073741824L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case78() {
    long n = 1000000000000L;
    int p = 103;
    int q = 1007;
    assertEquals(37L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case79() {
    long n = 1000000000000L;
    int p = 500;
    int q = 600000;
    assertEquals(13L, infinitesequence.calc(n, p, q));
  }

  @Test
  public void case80() {
    long n = 90000001111L;
    int p = 3;
    int q = 2;
    assertEquals(615975622L, infinitesequence.calc(n, p, q));
  }

}
