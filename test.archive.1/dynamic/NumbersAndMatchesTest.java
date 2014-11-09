package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class NumbersAndMatchesTest {
  NumbersAndMatches numbersandmatches = new NumbersAndMatches();

  @Test
  public void case1() {
    long N = 10L;
    int K = 1;
    assertEquals(4L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case2() {
    long N = 23L;
    int K = 1;
    assertEquals(4L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case3() {
    long N = 66L;
    int K = 2;
    assertEquals(15L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case4() {
    long N = 888888888L;
    int K = 100;
    assertEquals(1L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case5() {
    long N = 444444444444444444L;
    int K = 2;
    assertEquals(1L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case6() {
    long N = 444444444444444444L;
    int K = 3;
    assertEquals(1225L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case7() {
    long N = 1L;
    int K = 10;
    assertEquals(2L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case8() {
    long N = 4L;
    int K = 10;
    assertEquals(1L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case9() {
    long N = 6L;
    int K = 10;
    assertEquals(3L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case10() {
    long N = 9L;
    int K = 10;
    assertEquals(3L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case11() {
    long N = 8L;
    int K = 10;
    assertEquals(1L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case12() {
    long N = 584780L;
    int K = 7;
    assertEquals(64583L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case13() {
    long N = 1457L;
    int K = 2;
    assertEquals(12L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case14() {
    long N = 179789L;
    int K = 2;
    assertEquals(168L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case15() {
    long N = 2933596L;
    int K = 7;
    assertEquals(505644L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case16() {
    long N = 447460L;
    int K = 6;
    assertEquals(9420L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case17() {
    long N = 78689L;
    int K = 4;
    assertEquals(2555L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case18() {
    long N = 7244L;
    int K = 8;
    assertEquals(465L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case19() {
    long N = 66212L;
    int K = 1;
    assertEquals(10L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case20() {
    long N = 25311L;
    int K = 8;
    assertEquals(4728L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case21() {
    long N = 538L;
    int K = 1;
    assertEquals(13L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case22() {
    long N = 71032L;
    int K = 9;
    assertEquals(7783L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case23() {
    long N = 96L;
    int K = 2;
    assertEquals(15L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case24() {
    long N = 396L;
    int K = 4;
    assertEquals(132L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case25() {
    long N = 59481L;
    int K = 1;
    assertEquals(18L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case26() {
    long N = 3318876L;
    int K = 12;
    assertEquals(1138862L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case27() {
    long N = 94492L;
    int K = 5;
    assertEquals(3620L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case28() {
    long N = 39857L;
    int K = 5;
    assertEquals(6524L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case29() {
    long N = 5649257L;
    int K = 10;
    assertEquals(831739L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case30() {
    long N = 5806545L;
    int K = 9;
    assertEquals(765790L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case31() {
    long N = 299351L;
    int K = 1;
    assertEquals(26L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case32() {
    long N = 5671702L;
    int K = 10;
    assertEquals(351549L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case33() {
    long N = 5041963L;
    int K = 14;
    assertEquals(1167792L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case34() {
    long N = 2770L;
    int K = 7;
    assertEquals(734L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case35() {
    long N = 4378253L;
    int K = 5;
    assertEquals(32015L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case36() {
    long N = 3352L;
    int K = 3;
    assertEquals(237L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case37() {
    long N = 569L;
    int K = 3;
    assertEquals(112L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case38() {
    long N = 912L;
    int K = 5;
    assertEquals(147L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case39() {
    long N = 79418L;
    int K = 10;
    assertEquals(10521L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case40() {
    long N = 239L;
    int K = 2;
    assertEquals(35L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case41() {
    long N = 4243L;
    int K = 9;
    assertEquals(1098L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case42() {
    long N = 5891911393L;
    int K = 9;
    assertEquals(141044049L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case43() {
    long N = 810L;
    int K = 1;
    assertEquals(7L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case44() {
    long N = 58866962718526L;
    int K = 18;
    assertEquals(2796495743545L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case45() {
    long N = 77457252L;
    int K = 5;
    assertEquals(6409L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case46() {
    long N = 369048204097567L;
    int K = 16;
    assertEquals(15329445832838L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case47() {
    long N = 72222962555318370L;
    int K = 9;
    assertEquals(21840703301L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case48() {
    long N = 9948674L;
    int K = 5;
    assertEquals(44617L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case49() {
    long N = 968204L;
    int K = 8;
    assertEquals(60198L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case50() {
    long N = 89337183138636L;
    int K = 8;
    assertEquals(4757717426L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case51() {
    long N = 815178010L;
    int K = 5;
    assertEquals(133717L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case52() {
    long N = 29791019054717928L;
    int K = 3;
    assertEquals(71771L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case53() {
    long N = 84424056394501305L;
    int K = 16;
    assertEquals(228739684270103L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case54() {
    long N = 95480254595884168L;
    int K = 9;
    assertEquals(175540553740L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case55() {
    long N = 5L;
    int K = 36;
    assertEquals(3L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case56() {
    long N = 73386163865874L;
    int K = 1;
    assertEquals(110L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case57() {
    long N = 49045826563L;
    int K = 11;
    assertEquals(1688392108L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case58() {
    long N = 618L;
    int K = 1;
    assertEquals(7L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case59() {
    long N = 21208323598517225L;
    int K = 5;
    assertEquals(12447266L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case60() {
    long N = 6795227713992567L;
    int K = 34;
    assertEquals(474380414263848L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case61() {
    long N = 8L;
    int K = 60;
    assertEquals(1L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case62() {
    long N = 571625929L;
    int K = 1;
    assertEquals(43L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case63() {
    long N = 40384360072744351L;
    int K = 27;
    assertEquals(5480331841122702L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case64() {
    long N = 437L;
    int K = 2;
    assertEquals(12L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case65() {
    long N = 70L;
    int K = 1;
    assertEquals(4L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case66() {
    long N = 73593195L;
    int K = 9;
    assertEquals(4903784L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case67() {
    long N = 95218853389L;
    int K = 7;
    assertEquals(88236832L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case68() {
    long N = 87L;
    int K = 4;
    assertEquals(19L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case69() {
    long N = 9606773610310312L;
    int K = 11;
    assertEquals(240195937548L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case70() {
    long N = 46953996133488729L;
    int K = 1;
    assertEquals(189L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case71() {
    long N = 2597152058426292L;
    int K = 1;
    assertEquals(94L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case72() {
    long N = 44888823L;
    int K = 3;
    assertEquals(3397L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case73() {
    long N = 3944694855090580L;
    int K = 12;
    assertEquals(4972523101620L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case74() {
    long N = 3679831L;
    int K = 9;
    assertEquals(913451L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case75() {
    long N = 23528L;
    int K = 1;
    assertEquals(15L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case76() {
    long N = 555144151L;
    int K = 14;
    assertEquals(10529252L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case77() {
    long N = 52L;
    int K = 2;
    assertEquals(6L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case78() {
    long N = 144776303177556463L;
    int K = 36;
    assertEquals(9462320934663752L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case79() {
    long N = 566L;
    int K = 1;
    assertEquals(12L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case80() {
    long N = 625024L;
    int K = 3;
    assertEquals(461L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case81() {
    long N = 753L;
    int K = 1;
    assertEquals(5L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case82() {
    long N = 84647859393083902L;
    int K = 4;
    assertEquals(5752005L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case83() {
    long N = 18802230967797L;
    int K = 4;
    assertEquals(511339L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case84() {
    long N = 83573501233396242L;
    int K = 6;
    assertEquals(188980848L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case85() {
    long N = 3061307575233837L;
    int K = 6;
    assertEquals(96062950L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case86() {
    long N = 9391332969073671L;
    int K = 27;
    assertEquals(761305760293876L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case87() {
    long N = 8590430783287900L;
    int K = 10;
    assertEquals(289574049548L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case88() {
    long N = 7327210417031947L;
    int K = 17;
    assertEquals(4029386929968L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case89() {
    long N = 811406970855869192L;
    int K = 17;
    assertEquals(3664510893077393L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case90() {
    long N = 337972959334662208L;
    int K = 23;
    assertEquals(53459276914630388L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case91() {
    long N = 328352453435175L;
    int K = 13;
    assertEquals(726369733414L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case92() {
    long N = 2795465984945472L;
    int K = 15;
    assertEquals(15734819733474L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case93() {
    long N = 966264404849669735L;
    int K = 11;
    assertEquals(4463132890261L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case94() {
    long N = 17032331246316251L;
    int K = 6;
    assertEquals(26349378L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case95() {
    long N = 535167791648838L;
    int K = 8;
    assertEquals(4799186304L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case96() {
    long N = 751452600138841876L;
    int K = 4;
    assertEquals(1600248L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case97() {
    long N = 90020061282502153L;
    int K = 8;
    assertEquals(6675645800L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case98() {
    long N = 712916399035092062L;
    int K = 13;
    assertEquals(66913890482787L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case99() {
    long N = 877552597773714842L;
    int K = 34;
    assertEquals(9462224772921064L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case100() {
    long N = 8745998130609693L;
    int K = 20;
    assertEquals(302264148195226L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case101() {
    long N = 4607457303101098L;
    int K = 24;
    assertEquals(685330255502119L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case102() {
    long N = 55269389046032838L;
    int K = 16;
    assertEquals(354019876642158L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case103() {
    long N = 7269326896563393L;
    int K = 17;
    assertEquals(187543404025831L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case104() {
    long N = 571152816476731599L;
    int K = 37;
    assertEquals(18415520351694236L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case105() {
    long N = 669291984052404L;
    int K = 12;
    assertEquals(528272692048L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case106() {
    long N = 1303625962603750L;
    int K = 9;
    assertEquals(34965179849L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case107() {
    long N = 341518108736536963L;
    int K = 2;
    assertEquals(8582L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case108() {
    long N = 9076500865561527L;
    int K = 12;
    assertEquals(1964443222396L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case109() {
    long N = 1016578928468547L;
    int K = 20;
    assertEquals(368592135484824L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case110() {
    long N = 45867338383585985L;
    int K = 20;
    assertEquals(1690850760269308L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case111() {
    long N = 7945346246416888L;
    int K = 7;
    assertEquals(792834613L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case112() {
    long N = 20870941125871905L;
    int K = 23;
    assertEquals(4948770722157148L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case113() {
    long N = 6136393239367948L;
    int K = 18;
    assertEquals(370196604937287L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case114() {
    long N = 70454790698050302L;
    int K = 125;
    assertEquals(5834803841784360L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case115() {
    long N = 168227367326959853L;
    int K = 125;
    assertEquals(64527700155023418L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case116() {
    long N = 13278173218807769L;
    int K = 125;
    assertEquals(4735794663165804L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case117() {
    long N = 17887262576459834L;
    int K = 126;
    assertEquals(7400894886230503L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case118() {
    long N = 9020404399103103L;
    int K = 125;
    assertEquals(735117180482704L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case119() {
    long N = 7639400097564080L;
    int K = 125;
    assertEquals(499226907048416L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case120() {
    long N = 4508862073077470L;
    int K = 125;
    assertEquals(761316888721584L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case121() {
    long N = 6836400496017025L;
    int K = 126;
    assertEquals(591462657520232L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case122() {
    long N = 999999999999999999L;
    int K = 126;
    assertEquals(147519902109597L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case123() {
    long N = 666666666666666666L;
    int K = 126;
    assertEquals(147519902109597L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case124() {
    long N = 811189876543210111L;
    int K = 35;
    assertEquals(24462028021923946L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case125() {
    long N = 888811111111188888L;
    int K = 126;
    assertEquals(73756864709370409L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case126() {
    long N = 123456543216789987L;
    int K = 25;
    assertEquals(55714945330330022L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case127() {
    long N = 103456859212945679L;
    int K = 126;
    assertEquals(73756864709370409L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case128() {
    long N = 123456789123456789L;
    int K = 8;
    assertEquals(16726023513L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case129() {
    long N = 12345678901234567L;
    int K = 99;
    assertEquals(5575389364259316L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case130() {
    long N = 888888811012345679L;
    int K = 126;
    assertEquals(25164471596521500L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case131() {
    long N = 88123344556677990L;
    int K = 122;
    assertEquals(7504216310916973L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case132() {
    long N = 666666666666666666L;
    int K = 100;
    assertEquals(147519902109597L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case133() {
    long N = 404404012211439L;
    int K = 27;
    assertEquals(29248248238223L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case134() {
    long N = 1234567890123234L;
    int K = 126;
    assertEquals(646475143167696L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case135() {
    long N = 66666666666666666L;
    int K = 126;
    assertEquals(21817331427269L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case136() {
    long N = 123456789111299765L;
    int K = 126;
    assertEquals(39166520188298994L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case137() {
    long N = 716385113497812334L;
    int K = 123;
    assertEquals(24462048267074250L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case138() {
    long N = 48209834123L;
    int K = 13;
    assertEquals(4429759478L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case139() {
    long N = 123456789012345677L;
    int K = 126;
    assertEquals(39166520188298994L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case140() {
    long N = 23885619856348745L;
    int K = 100;
    assertEquals(4975000553975848L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case141() {
    long N = 98765432109876123L;
    int K = 126;
    assertEquals(7585959247501861L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case142() {
    long N = 123456789012345678L;
    int K = 126;
    assertEquals(68090790265439823L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case143() {
    long N = 122252525252521337L;
    int K = 125;
    assertEquals(39166520188298994L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case144() {
    long N = 444444444444444444L;
    int K = 126;
    assertEquals(314403345046093L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case145() {
    long N = 111111111888888888L;
    int K = 126;
    assertEquals(73756864709370409L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case146() {
    long N = 1234567891234567L;
    int K = 126;
    assertEquals(474380414264208L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case147() {
    long N = 123456789123456L;
    int K = 126;
    assertEquals(65924729666145L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case148() {
    long N = 12345678998765432L;
    int K = 125;
    assertEquals(7585959247501861L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case149() {
    long N = 111111111999999999L;
    int K = 126;
    assertEquals(18415520400090492L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case150() {
    long N = 12345678912345678L;
    int K = 126;
    assertEquals(6342769928297556L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case151() {
    long N = 2L;
    int K = 1;
    assertEquals(2L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case152() {
    long N = 11L;
    int K = 1;
    assertEquals(3L, numbersandmatches.differentNumbers(N, K));
  }

  @Test
  public void case153() {
    long N = 111111111111111111L;
    int K = 126;
    assertEquals(262144L, numbersandmatches.differentNumbers(N, K));
  }

}
