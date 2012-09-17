package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class FractionInDifferentBasesTest {
  FractionInDifferentBases fractionindifferentbases = new FractionInDifferentBases();

  @Test
  public void case1() {
    long P = 1L;
    long Q = 2L;
    long A = 10L;
    long B = 10L;
    assertEquals(0L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case2() {
    long P = 1L;
    long Q = 9L;
    long A = 9L;
    long B = 10L;
    assertEquals(1L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case3() {
    long P = 5L;
    long Q = 6L;
    long A = 2L;
    long B = 10L;
    assertEquals(8L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case4() {
    long P = 2662L;
    long Q = 540L;
    long A = 2L;
    long B = 662L;
    assertEquals(639L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case5() {
    long P = 650720L;
    long Q = 7032600L;
    long A = 2012L;
    long B = 2012540L;
    assertEquals(2010495L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case6() {
    long P = 1L;
    long Q = 25L;
    long A = 2L;
    long B = 25L;
    assertEquals(19L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case7() {
    long P = 362136128913L;
    long Q = 9478364712L;
    long A = 44728L;
    long B = 7428164817412L;
    assertEquals(7428164763281L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case8() {
    long P = 99999999999L;
    long Q = 99999999977L;
    long A = 2L;
    long B = 1000000000000000000L;
    assertEquals(999999999989999999L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case9() {
    long P = 99999999999L;
    long Q = 99999999977L;
    long A = 123456789L;
    long B = 999999999769999999L;
    assertEquals(999999999636543212L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case10() {
    long P = 99999999999L;
    long Q = 99999999977L;
    long A = 123456789L;
    long B = 999999999770000000L;
    assertEquals(999999999636543212L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case11() {
    long P = 99999999999L;
    long Q = 99999999977L;
    long A = 123456789L;
    long B = 999999999770000001L;
    assertEquals(999999999636543213L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case12() {
    long P = 99999999977L;
    long Q = 99999999977L;
    long A = 2L;
    long B = 1000000000000000000L;
    assertEquals(0L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case13() {
    long P = 11L;
    long Q = 958961203200L;
    long A = 2L;
    long B = 10000L;
    assertEquals(9999L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case14() {
    long P = 11L;
    long Q = 958961203200L;
    long A = 2L;
    long B = 999999999999999999L;
    assertEquals(999966699966699965L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case15() {
    long P = 3L;
    long Q = 68719476736L;
    long A = 111111111111111111L;
    long B = 888888888888888888L;
    assertEquals(388888888888888889L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case16() {
    long P = 847288609443L;
    long Q = 549755813888L;
    long A = 111111111111111111L;
    long B = 888888888888888888L;
    assertEquals(388888888888888889L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case17() {
    long P = 21L;
    long Q = 2L;
    long A = 111111111111111111L;
    long B = 888888888888888888L;
    assertEquals(388888888888888889L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case18() {
    long P = 99L;
    long Q = 4L;
    long A = 111111111111111111L;
    long B = 888888888888888887L;
    assertEquals(388888888888888889L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case19() {
    long P = 111L;
    long Q = 256L;
    long A = 111111111111111111L;
    long B = 888888888888888889L;
    assertEquals(388888888888888890L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case20() {
    long P = 49L;
    long Q = 14L;
    long A = 111111111111111110L;
    long B = 888888888888888888L;
    assertEquals(388888888888888889L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case21() {
    long P = 0L;
    long Q = 1L;
    long A = 2L;
    long B = 1000000000000000000L;
    assertEquals(0L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case22() {
    long P = 0L;
    long Q = 1L;
    long A = 2L;
    long B = 2L;
    assertEquals(0L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case23() {
    long P = 0L;
    long Q = 1L;
    long A = 327164781268912469L;
    long B = 839217712678612863L;
    assertEquals(0L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case24() {
    long P = 0L;
    long Q = 1000000000000L;
    long A = 3L;
    long B = 999999999999999997L;
    assertEquals(0L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case25() {
    long P = 0L;
    long Q = 1000000000000L;
    long A = 540L;
    long B = 540L;
    assertEquals(0L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case26() {
    long P = 0L;
    long Q = 999999999999L;
    long A = 129378689678269898L;
    long B = 919737816487154711L;
    assertEquals(0L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case27() {
    long P = 6L;
    long Q = 7L;
    long A = 2L;
    long B = 4L;
    assertEquals(3L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case28() {
    long P = 45L;
    long Q = 41L;
    long A = 28L;
    long B = 94L;
    assertEquals(65L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case29() {
    long P = 59L;
    long Q = 519L;
    long A = 928L;
    long B = 963L;
    assertEquals(36L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case30() {
    long P = 5813L;
    long Q = 2489L;
    long A = 1526L;
    long B = 6983L;
    assertEquals(5456L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case31() {
    long P = 39874L;
    long Q = 83293L;
    long A = 56962L;
    long B = 86419L;
    assertEquals(29457L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case32() {
    long P = 261806L;
    long Q = 53685L;
    long A = 315327L;
    long B = 624996L;
    assertEquals(309653L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case33() {
    long P = 1129440L;
    long Q = 2544683L;
    long A = 8372502L;
    long B = 31083654L;
    assertEquals(22711144L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case34() {
    long P = 35695472L;
    long Q = 21222021L;
    long A = 7618641798L;
    long B = 8774279486L;
    assertEquals(1155637634L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case35() {
    long P = 224373828L;
    long Q = 776430048L;
    long A = 228350397336L;
    long B = 810524008713L;
    assertEquals(582173575387L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case36() {
    long P = 3625075800L;
    long Q = 4082244305L;
    long A = 31025053940470L;
    long B = 72265575444757L;
    assertEquals(41240521453775L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case37() {
    long P = 5838070456L;
    long Q = 7388262910L;
    long A = 63262651904782L;
    long B = 77924970676996L;
    assertEquals(14662318768246L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case38() {
    long P = 7308395075L;
    long Q = 6181293934L;
    long A = 85013659966006L;
    long B = 90585807765077L;
    assertEquals(5572147798171L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case39() {
    long P = 97063184380L;
    long Q = 85711963742L;
    long A = 533241116222959L;
    long B = 5831724689282439L;
    assertEquals(5298483572935846L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case40() {
    long P = 22226482333L;
    long Q = 50837177762L;
    long A = 4238128539174614L;
    long B = 7324343505785954L;
    assertEquals(3086214966550633L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case41() {
    long P = 13676721976L;
    long Q = 91863265235L;
    long A = 7278347179606431L;
    long B = 7838151833685873L;
    assertEquals(559804654036786L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case42() {
    long P = 616413512692L;
    long Q = 344284905720L;
    long A = 315148875301650676L;
    long B = 332737260009667982L;
    assertEquals(17588384707812960L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case43() {
    long P = 229020880549L;
    long Q = 719157259627L;
    long A = 231971125802989573L;
    long B = 250649081162131185L;
    assertEquals(18677955359115641L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case44() {
    long P = 62668576016L;
    long Q = 841939978131L;
    long A = 713891923439452150L;
    long B = 943429244996903962L;
    assertEquals(229537321486295623L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case45() {
    long P = 717135519791L;
    long Q = 8432101591L;
    long A = 700042863490303157L;
    long B = 873687154201095602L;
    assertEquals(173644290690199206L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case46() {
    long P = 999958000441L;
    long Q = 999966000289L;
    long A = 100663296000000001L;
    long B = 908800000000000001L;
    assertEquals(808135895849557444L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case47() {
    long P = 999962000357L;
    long Q = 999966000289L;
    long A = 209203200000000001L;
    long B = 826200000000000001L;
    assertEquals(616996182992710877L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case48() {
    long P = 999966000289L;
    long Q = 999966000289L;
    long A = 180143985094819841L;
    long B = 809240558043136001L;
    assertEquals(0L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case49() {
    long P = 314159265358L;
    long Q = 979323846264L;
    long A = 338327950288419716L;
    long B = 939937510582097494L;
    assertEquals(601609560286306045L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case50() {
    long P = 111111111111L;
    long Q = 1000000000000L;
    long A = 99999999999999999L;
    long B = 899999999999999999L;
    assertEquals(720000000000000001L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case51() {
    long P = 333333333333L;
    long Q = 1000000000000L;
    long A = 99999999999999999L;
    long B = 900000000000000000L;
    assertEquals(720000000000000001L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case52() {
    long P = 555555555555L;
    long Q = 1000000000000L;
    long A = 99999999999999999L;
    long B = 900000000000000001L;
    assertEquals(720000000000000002L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case53() {
    long P = 777777777777L;
    long Q = 1000000000000L;
    long A = 100000000000000000L;
    long B = 899999999999999999L;
    assertEquals(720000000000000000L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case54() {
    long P = 999999999999L;
    long Q = 1000000000000L;
    long A = 100000000000000000L;
    long B = 900000000000000000L;
    assertEquals(720000000000000000L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case55() {
    long P = 777777777777L;
    long Q = 1000000000000L;
    long A = 100000000000000000L;
    long B = 900000000000000001L;
    assertEquals(720000000000000001L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case56() {
    long P = 555555555555L;
    long Q = 1000000000000L;
    long A = 100000000000000001L;
    long B = 899999999999999999L;
    assertEquals(720000000000000000L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case57() {
    long P = 333333333333L;
    long Q = 1000000000000L;
    long A = 100000000000000001L;
    long B = 900000000000000000L;
    assertEquals(720000000000000000L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case58() {
    long P = 111111111111L;
    long Q = 1000000000000L;
    long A = 100000000000000001L;
    long B = 900000000000000001L;
    assertEquals(720000000000000001L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case59() {
    long P = 973821738913L;
    long Q = 100L;
    long A = 9L;
    long B = 999999999999999989L;
    assertEquals(899999999999999983L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case60() {
    long P = 912749124767L;
    long Q = 1000L;
    long A = 9L;
    long B = 999999999999999990L;
    assertEquals(899999999999999983L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case61() {
    long P = 748129579201L;
    long Q = 10000L;
    long A = 9L;
    long B = 999999999999999991L;
    assertEquals(899999999999999984L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case62() {
    long P = 789032859239L;
    long Q = 100000L;
    long A = 10L;
    long B = 999999999999999989L;
    assertEquals(899999999999999982L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case63() {
    long P = 923805973283L;
    long Q = 1000000L;
    long A = 10L;
    long B = 999999999999999990L;
    assertEquals(899999999999999982L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case64() {
    long P = 589329848177L;
    long Q = 10000000L;
    long A = 10L;
    long B = 999999999999999991L;
    assertEquals(899999999999999983L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case65() {
    long P = 948489999389L;
    long Q = 100000000L;
    long A = 11L;
    long B = 999999999999999989L;
    assertEquals(899999999999999982L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case66() {
    long P = 567237748239L;
    long Q = 1000000000L;
    long A = 11L;
    long B = 999999999999999990L;
    assertEquals(899999999999999982L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case67() {
    long P = 772865832651L;
    long Q = 10000000000L;
    long A = 11L;
    long B = 999999999999999991L;
    assertEquals(899999999999999983L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case68() {
    long P = 549755813888L;
    long Q = 549755813888L;
    long A = 562949953421312L;
    long B = 576460752303423488L;
    assertEquals(0L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case69() {
    long P = 549755813888L;
    long Q = 549755813888L;
    long A = 9007199254740992L;
    long B = 576460752303423488L;
    assertEquals(0L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case70() {
    long P = 835884417024L;
    long Q = 626913312768L;
    long A = 839808L;
    long B = 701982420492091392L;
    assertEquals(467988280327501056L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case71() {
    long P = 940369969152L;
    long Q = 660451885056L;
    long A = 705277476864L;
    long B = 592297667290202112L;
    assertEquals(296148481006362624L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case72() {
    long P = 708588000000L;
    long Q = 933120000000L;
    long A = 6L;
    long B = 531441000000000000L;
    assertEquals(478296899999999995L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case73() {
    long P = 656100000000L;
    long Q = 956593800000L;
    long A = 7290000000L;
    long B = 816293376000000000L;
    assertEquals(544195579140000000L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case74() {
    long P = 723350250000L;
    long Q = 933897762000L;
    long A = 588000L;
    long B = 544876111954566000L;
    assertEquals(467036667389124000L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case75() {
    long P = 551353635000L;
    long Q = 945177660000L;
    long A = 555660L;
    long B = 851014335622500000L;
    assertEquals(709178613018286950L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case76() {
    long P = 738213861000L;
    long Q = 994328874000L;
    long A = 100L;
    long B = 649694486271600000L;
    assertEquals(639850630418999902L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case77() {
    long P = 724791790800L;
    long Q = 781258401000L;
    long A = 76865250L;
    long B = 799164488433465000L;
    assertEquals(784634224931934300L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case78() {
    long P = 644787643500L;
    long Q = 706611262500L;
    long A = 7362272736L;
    long B = 782562915027653760L;
    assertEquals(777820102164378715L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case79() {
    long P = 956553097500L;
    long Q = 955338426900L;
    long A = 79204079955000L;
    long B = 622493227862906400L;
    assertEquals(618061478162091600L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case80() {
    long P = 861997739460L;
    long Q = 631503422550L;
    long A = 501233692960L;
    long B = 557385854878125000L;
    assertEquals(552076921704961259L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case81() {
    long P = 888550637520L;
    long Q = 558955940400L;
    long A = 944743800L;
    long B = 730260693522360000L;
    assertEquals(730000350084718656L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case82() {
    long P = 572363011220L;
    long Q = 607585350372L;
    long A = 654182100L;
    long B = 799543631608984080L;
    assertEquals(787956042100384560L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case83() {
    long P = 946787353512L;
    long Q = 935757172350L;
    long A = 6428773300950L;
    long B = 653359152745230750L;
    assertEquals(651458947960416960L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case84() {
    long P = 907210530576L;
    long Q = 556933737360L;
    long A = 9604L;
    long B = 523096721843295600L;
    assertEquals(522992207013746878L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case85() {
    long P = 823861737006L;
    long Q = 608941283874L;
    long A = 62790L;
    long B = 931057383468712500L;
    assertEquals(876289302088140904L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case86() {
    long P = 816054253560L;
    long Q = 866469685000L;
    long A = 63881607625635800L;
    long B = 558089922311441520L;
    assertEquals(494007824497292209L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case87() {
    long P = 972497045520L;
    long Q = 594710156040L;
    long A = 72072L;
    long B = 602950411333144875L;
    assertEquals(582159017838828914L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case88() {
    long P = 84179L;
    long Q = 102101L;
    long A = 2L;
    long B = 1000000000000000000L;
    assertEquals(999990205776632941L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case89() {
    long P = 3L;
    long Q = 12312367L;
    long A = 2L;
    long B = 1000000000000000000L;
    assertEquals(999999918780848556L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case90() {
    long P = 1L;
    long Q = 3L;
    long A = 2L;
    long B = 1000000000000000000L;
    assertEquals(666666666666666666L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case91() {
    long P = 103006704005L;
    long Q = 103046704706L;
    long A = 10000350600040006L;
    long B = 100020007000500401L;
    assertEquals(90019656399586815L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case92() {
    long P = 900700074773L;
    long Q = 800700074773L;
    long A = 2L;
    long B = 999999999999L;
    assertEquals(999999999997L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case93() {
    long P = 1L;
    long Q = 12L;
    long A = 99999999999999L;
    long B = 99999999999999999L;
    assertEquals(83250000000000001L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case94() {
    long P = 1234567890L;
    long Q = 81480755400L;
    long A = 2L;
    long B = 100000000000000000L;
    assertEquals(99999999926362980L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case95() {
    long P = 1L;
    long Q = 25L;
    long A = 5L;
    long B = 25L;
    assertEquals(16L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

  @Test
  public void case96() {
    long P = 1000000000000L;
    long Q = 99999999999L;
    long A = 2L;
    long B = 1000000000000000000L;
    assertEquals(999999999969999999L, fractionindifferentbases.getNumberOfGoodBases(P, Q, A, B));
  }

}
