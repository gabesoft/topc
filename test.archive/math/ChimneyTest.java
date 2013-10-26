package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ChimneyTest {
  Chimney chimney = new Chimney();

  @Test
  public void case1() {
    long n = 1L;
    assertEquals(24, chimney.countWays(n));
  }

  @Test
  public void case2() {
    long n = 2L;
    assertEquals(1088, chimney.countWays(n));
  }

  @Test
  public void case3() {
    long n = 5L;
    assertEquals(110198784, chimney.countWays(n));
  }

  @Test
  public void case4() {
    long n = 6L;
    assertEquals(138284509, chimney.countWays(n));
  }

  @Test
  public void case5() {
    long n = 100000L;
    assertEquals(19900327, chimney.countWays(n));
  }

  @Test
  public void case6() {
    long n = 1000000000000000000L;
    assertEquals(364019862, chimney.countWays(n));
  }

  @Test
  public void case7() {
    long n = 3L;
    assertEquals(50688, chimney.countWays(n));
  }

  @Test
  public void case8() {
    long n = 4L;
    assertEquals(2363392, chimney.countWays(n));
  }

  @Test
  public void case9() {
    long n = 7L;
    assertEquals(584934263, chimney.countWays(n));
  }

  @Test
  public void case10() {
    long n = 8L;
    assertEquals(226635915, chimney.countWays(n));
  }

  @Test
  public void case11() {
    long n = 9L;
    assertEquals(442731277, chimney.countWays(n));
  }

  @Test
  public void case12() {
    long n = 10L;
    assertEquals(746402694, chimney.countWays(n));
  }

  @Test
  public void case13() {
    long n = 11L;
    assertEquals(492527535, chimney.countWays(n));
  }

  @Test
  public void case14() {
    long n = 12L;
    assertEquals(871549439, chimney.countWays(n));
  }

  @Test
  public void case15() {
    long n = 13L;
    assertEquals(312610762, chimney.countWays(n));
  }

  @Test
  public void case16() {
    long n = 14L;
    assertEquals(226152767, chimney.countWays(n));
  }

  @Test
  public void case17() {
    long n = 15L;
    assertEquals(848244118, chimney.countWays(n));
  }

  @Test
  public void case18() {
    long n = 16L;
    assertEquals(241940394, chimney.countWays(n));
  }

  @Test
  public void case19() {
    long n = 17L;
    assertEquals(325515661, chimney.countWays(n));
  }

  @Test
  public void case20() {
    long n = 18L;
    assertEquals(140566512, chimney.countWays(n));
  }

  @Test
  public void case21() {
    long n = 19L;
    assertEquals(914190377, chimney.countWays(n));
  }

  @Test
  public void case22() {
    long n = 20L;
    assertEquals(884881090, chimney.countWays(n));
  }

  @Test
  public void case23() {
    long n = 1000000000000000000L;
    assertEquals(364019862, chimney.countWays(n));
  }

  @Test
  public void case24() {
    long n = 999999999999999999L;
    assertEquals(764053755, chimney.countWays(n));
  }

  @Test
  public void case25() {
    long n = 999999999999999998L;
    assertEquals(723602507, chimney.countWays(n));
  }

  @Test
  public void case26() {
    long n = 999999999999999997L;
    assertEquals(483888540, chimney.countWays(n));
  }

  @Test
  public void case27() {
    long n = 999999999999999996L;
    assertEquals(804735119, chimney.countWays(n));
  }

  @Test
  public void case28() {
    long n = 999999999999999995L;
    assertEquals(908490583, chimney.countWays(n));
  }

  @Test
  public void case29() {
    long n = 999999999999999994L;
    assertEquals(809418952, chimney.countWays(n));
  }

  @Test
  public void case30() {
    long n = 999999999999999993L;
    assertEquals(358494047, chimney.countWays(n));
  }

  @Test
  public void case31() {
    long n = 999999999999999992L;
    assertEquals(381223365, chimney.countWays(n));
  }

  @Test
  public void case32() {
    long n = 999999999999999991L;
    assertEquals(670941057, chimney.countWays(n));
  }

  @Test
  public void case33() {
    long n = 200L;
    assertEquals(787171472, chimney.countWays(n));
  }

  @Test
  public void case34() {
    long n = 108L;
    assertEquals(572366251, chimney.countWays(n));
  }

  @Test
  public void case35() {
    long n = 193L;
    assertEquals(944617417, chimney.countWays(n));
  }

  @Test
  public void case36() {
    long n = 184L;
    assertEquals(17073931, chimney.countWays(n));
  }

  @Test
  public void case37() {
    long n = 135L;
    assertEquals(539481840, chimney.countWays(n));
  }

  @Test
  public void case38() {
    long n = 1274L;
    assertEquals(49395495, chimney.countWays(n));
  }

  @Test
  public void case39() {
    long n = 1904L;
    assertEquals(522479802, chimney.countWays(n));
  }

  @Test
  public void case40() {
    long n = 1412L;
    assertEquals(651819626, chimney.countWays(n));
  }

  @Test
  public void case41() {
    long n = 1546L;
    assertEquals(21767390, chimney.countWays(n));
  }

  @Test
  public void case42() {
    long n = 1768L;
    assertEquals(405449637, chimney.countWays(n));
  }

  @Test
  public void case43() {
    long n = 8054473L;
    assertEquals(212209620, chimney.countWays(n));
  }

  @Test
  public void case44() {
    long n = 2101872L;
    assertEquals(648015706, chimney.countWays(n));
  }

  @Test
  public void case45() {
    long n = 2806429L;
    assertEquals(625206793, chimney.countWays(n));
  }

  @Test
  public void case46() {
    long n = 10133628L;
    assertEquals(687213396, chimney.countWays(n));
  }

  @Test
  public void case47() {
    long n = 15294943L;
    assertEquals(326487321, chimney.countWays(n));
  }

  @Test
  public void case48() {
    long n = 1000002803L;
    assertEquals(303972920, chimney.countWays(n));
  }

  @Test
  public void case49() {
    long n = 1000000276L;
    assertEquals(24167289, chimney.countWays(n));
  }

  @Test
  public void case50() {
    long n = 1000004460L;
    assertEquals(362967943, chimney.countWays(n));
  }

  @Test
  public void case51() {
    long n = 1000008951L;
    assertEquals(392371903, chimney.countWays(n));
  }

  @Test
  public void case52() {
    long n = 1000005498L;
    assertEquals(16978199, chimney.countWays(n));
  }

  @Test
  public void case53() {
    long n = 1000007365L;
    assertEquals(635815387, chimney.countWays(n));
  }

  @Test
  public void case54() {
    long n = 1000002325L;
    assertEquals(368755323, chimney.countWays(n));
  }

  @Test
  public void case55() {
    long n = 1000006901L;
    assertEquals(721209271, chimney.countWays(n));
  }

  @Test
  public void case56() {
    long n = 1000001069L;
    assertEquals(448591518, chimney.countWays(n));
  }

  @Test
  public void case57() {
    long n = 1000009153L;
    assertEquals(285293220, chimney.countWays(n));
  }

  @Test
  public void case58() {
    long n = 361L;
    assertEquals(897412922, chimney.countWays(n));
  }

  @Test
  public void case59() {
    long n = 6859L;
    assertEquals(990317770, chimney.countWays(n));
  }

  @Test
  public void case60() {
    long n = 130321L;
    assertEquals(908867540, chimney.countWays(n));
  }

  @Test
  public void case61() {
    long n = 2476099L;
    assertEquals(991604202, chimney.countWays(n));
  }

  @Test
  public void case62() {
    long n = 47045881L;
    assertEquals(965339545, chimney.countWays(n));
  }

  @Test
  public void case63() {
    long n = 893871739L;
    assertEquals(391942709, chimney.countWays(n));
  }

  @Test
  public void case64() {
    long n = 16983563041L;
    assertEquals(417250699, chimney.countWays(n));
  }

  @Test
  public void case65() {
    long n = 322687697779L;
    assertEquals(878866403, chimney.countWays(n));
  }

  @Test
  public void case66() {
    long n = 6131066257801L;
    assertEquals(532681067, chimney.countWays(n));
  }

  @Test
  public void case67() {
    long n = 116490258898219L;
    assertEquals(283174963, chimney.countWays(n));
  }

  @Test
  public void case68() {
    long n = 2213314919066161L;
    assertEquals(578195950, chimney.countWays(n));
  }

  @Test
  public void case69() {
    long n = 42052983462257059L;
    assertEquals(786673968, chimney.countWays(n));
  }

  @Test
  public void case70() {
    long n = 799006685782884121L;
    assertEquals(987474155, chimney.countWays(n));
  }

  @Test
  public void case71() {
    long n = 576460752303423487L;
    assertEquals(946324257, chimney.countWays(n));
  }

  @Test
  public void case72() {
    long n = 288230376151711743L;
    assertEquals(910557164, chimney.countWays(n));
  }

  @Test
  public void case73() {
    long n = 144115188075855871L;
    assertEquals(558974186, chimney.countWays(n));
  }

  @Test
  public void case74() {
    long n = 450283905890997362L;
    assertEquals(625809992, chimney.countWays(n));
  }

  @Test
  public void case75() {
    long n = 150094635296999120L;
    assertEquals(899843099, chimney.countWays(n));
  }

  @Test
  public void case76() {
    long n = 50031545098999706L;
    assertEquals(24613994, chimney.countWays(n));
  }

  @Test
  public void case77() {
    long n = 298023223876953124L;
    assertEquals(824133018, chimney.countWays(n));
  }

  @Test
  public void case78() {
    long n = 59604644775390624L;
    assertEquals(838840981, chimney.countWays(n));
  }

  @Test
  public void case79() {
    long n = 11920928955078124L;
    assertEquals(93771289, chimney.countWays(n));
  }

  @Test
  public void case80() {
    long n = 558545864083284006L;
    assertEquals(628140868, chimney.countWays(n));
  }

  @Test
  public void case81() {
    long n = 79792266297612000L;
    assertEquals(321969494, chimney.countWays(n));
  }

  @Test
  public void case82() {
    long n = 11398895185373142L;
    assertEquals(583306028, chimney.countWays(n));
  }

  @Test
  public void case83() {
    long n = 505447028499293770L;
    assertEquals(93328307, chimney.countWays(n));
  }

  @Test
  public void case84() {
    long n = 45949729863572160L;
    assertEquals(846195883, chimney.countWays(n));
  }

  @Test
  public void case85() {
    long n = 4177248169415650L;
    assertEquals(52608353, chimney.countWays(n));
  }

  @Test
  public void case86() {
    long n = 665416609183179840L;
    assertEquals(287865304, chimney.countWays(n));
  }

  @Test
  public void case87() {
    long n = 51185893014090756L;
    assertEquals(825266957, chimney.countWays(n));
  }

  @Test
  public void case88() {
    long n = 3937376385699288L;
    assertEquals(412854001, chimney.countWays(n));
  }

  @Test
  public void case89() {
    long n = 999999999999999987L;
    assertEquals(727912045, chimney.countWays(n));
  }

  @Test
  public void case90() {
    long n = 590345035376309527L;
    assertEquals(86035942, chimney.countWays(n));
  }

}
