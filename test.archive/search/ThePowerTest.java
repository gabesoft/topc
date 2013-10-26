package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class ThePowerTest {
  ThePower thepower = new ThePower();

  @Test
  public void case1() {
    long n = 8L;
    assertEquals(2, thepower.count(n));
  }

  @Test
  public void case2() {
    long n = 1L;
    assertEquals(0, thepower.count(n));
  }

  @Test
  public void case3() {
    long n = 80L;
    assertEquals(4, thepower.count(n));
  }

  @Test
  public void case4() {
    long n = 123456789L;
    assertEquals(2566, thepower.count(n));
  }

  @Test
  public void case5() {
    long n = 9L;
    assertEquals(3, thepower.count(n));
  }

  @Test
  public void case6() {
    long n = 6L;
    assertEquals(4, thepower.count(n));
  }

  @Test
  public void case7() {
    long n = 8L;
    assertEquals(2, thepower.count(n));
  }

  @Test
  public void case8() {
    long n = 757148L;
    assertEquals(284, thepower.count(n));
  }

  @Test
  public void case9() {
    long n = 167851001L;
    assertEquals(6990, thepower.count(n));
  }

  @Test
  public void case10() {
    long n = 301413357L;
    assertEquals(9107, thepower.count(n));
  }

  @Test
  public void case11() {
    long n = 336971125L;
    assertEquals(8467, thepower.count(n));
  }

  @Test
  public void case12() {
    long n = 659598369L;
    assertEquals(18220, thepower.count(n));
  }

  @Test
  public void case13() {
    long n = 160567226L;
    assertEquals(12471, thepower.count(n));
  }

  @Test
  public void case14() {
    long n = 391749388L;
    assertEquals(13561, thepower.count(n));
  }

  @Test
  public void case15() {
    long n = 4890852L;
    assertEquals(2103, thepower.count(n));
  }

  @Test
  public void case16() {
    long n = 35766291L;
    assertEquals(5951, thepower.count(n));
  }

  @Test
  public void case17() {
    long n = 26239573L;
    assertEquals(4763, thepower.count(n));
  }

  @Test
  public void case18() {
    long n = 473038165L;
    assertEquals(19316, thepower.count(n));
  }

  @Test
  public void case19() {
    long n = 597007L;
    assertEquals(539, thepower.count(n));
  }

  @Test
  public void case20() {
    long n = 3615545L;
    assertEquals(1790, thepower.count(n));
  }

  @Test
  public void case21() {
    long n = 127087881097001L;
    assertEquals(1997580, thepower.count(n));
  }

  @Test
  public void case22() {
    long n = 101567597359932145L;
    assertEquals(66648872, thepower.count(n));
  }

  @Test
  public void case23() {
    long n = 105909879564288801L;
    assertEquals(86936154, thepower.count(n));
  }

  @Test
  public void case24() {
    long n = 1915987881158338L;
    assertEquals(15298266, thepower.count(n));
  }

  @Test
  public void case25() {
    long n = 938492141627881L;
    assertEquals(6466598, thepower.count(n));
  }

  @Test
  public void case26() {
    long n = 282406622136985L;
    assertEquals(8758385, thepower.count(n));
  }

  @Test
  public void case27() {
    long n = 1178853313121185L;
    assertEquals(23694898, thepower.count(n));
  }

  @Test
  public void case28() {
    long n = 46424149512186421L;
    assertEquals(154518906, thepower.count(n));
  }

  @Test
  public void case29() {
    long n = 6342560488447345L;
    assertEquals(11912811, thepower.count(n));
  }

  @Test
  public void case30() {
    long n = 113770165438317571L;
    assertEquals(6273084, thepower.count(n));
  }

  @Test
  public void case31() {
    long n = 649336441051022059L;
    assertEquals(65951639, thepower.count(n));
  }

  @Test
  public void case32() {
    long n = 9623522848888873L;
    assertEquals(38517834, thepower.count(n));
  }

  @Test
  public void case33() {
    long n = 1000000000000000000L;
    assertEquals(5, thepower.count(n));
  }

  @Test
  public void case34() {
    long n = 987654321987654321L;
    assertEquals(987819571, thepower.count(n));
  }

  @Test
  public void case35() {
    long n = 123456789123456789L;
    assertEquals(28210180, thepower.count(n));
  }

  @Test
  public void case36() {
    long n = 576460752303423488L;
    assertEquals(2, thepower.count(n));
  }

  @Test
  public void case37() {
    long n = 450283905890997363L;
    assertEquals(3, thepower.count(n));
  }

  @Test
  public void case38() {
    long n = 2L;
    assertEquals(1, thepower.count(n));
  }

  @Test
  public void case39() {
    long n = 3L;
    assertEquals(2, thepower.count(n));
  }

  @Test
  public void case40() {
    long n = 6L;
    assertEquals(4, thepower.count(n));
  }

  @Test
  public void case41() {
    long n = 7L;
    assertEquals(3, thepower.count(n));
  }

  @Test
  public void case42() {
    long n = 9L;
    assertEquals(3, thepower.count(n));
  }

  @Test
  public void case43() {
    long n = 10L;
    assertEquals(4, thepower.count(n));
  }

  @Test
  public void case44() {
    long n = 205891132094649L;
    assertEquals(3, thepower.count(n));
  }

  @Test
  public void case45() {
    long n = 205891132094640L;
    assertEquals(12, thepower.count(n));
  }

  @Test
  public void case46() {
    long n = 205891132094648L;
    assertEquals(4, thepower.count(n));
  }

  @Test
  public void case47() {
    long n = 999927087881096999L;
    assertEquals(551996889, thepower.count(n));
  }

  @Test
  public void case48() {
    long n = 999967597359931129L;
    assertEquals(902557479, thepower.count(n));
  }

  @Test
  public void case49() {
    long n = 999909879564287741L;
    assertEquals(466210115, thepower.count(n));
  }

  @Test
  public void case50() {
    long n = 999915987881158318L;
    assertEquals(116577458, thepower.count(n));
  }

  @Test
  public void case51() {
    long n = 999938492141627871L;
    assertEquals(804199087, thepower.count(n));
  }

  @Test
  public void case52() {
    long n = 999982406622136982L;
    assertEquals(544758576, thepower.count(n));
  }

  @Test
  public void case53() {
    long n = 999978853313121173L;
    assertEquals(798677735, thepower.count(n));
  }

  @Test
  public void case54() {
    long n = 999924149512185956L;
    assertEquals(73815750, thepower.count(n));
  }

  @Test
  public void case55() {
    long n = 999942560488447281L;
    assertEquals(336411595, thepower.count(n));
  }

  @Test
  public void case56() {
    long n = 999970165438316433L;
    assertEquals(784215379, thepower.count(n));
  }

  @Test
  public void case57() {
    long n = 657456423656735435L;
    assertEquals(392044814, thepower.count(n));
  }

  @Test
  public void case58() {
    long n = 98765432198765431L;
    assertEquals(197088682, thepower.count(n));
  }

  @Test
  public void case59() {
    long n = 689989689989689983L;
    assertEquals(617503811, thepower.count(n));
  }

  @Test
  public void case60() {
    long n = 1234567890L;
    assertEquals(29577, thepower.count(n));
  }

  @Test
  public void case61() {
    long n = 162614549655681L;
    assertEquals(10037, thepower.count(n));
  }

  @Test
  public void case62() {
    long n = 293456789123789457L;
    assertEquals(563241, thepower.count(n));
  }

  @Test
  public void case63() {
    long n = 987987987987987987L;
    assertEquals(407307109, thepower.count(n));
  }

  @Test
  public void case64() {
    long n = 232313131L;
    assertEquals(5554, thepower.count(n));
  }

  @Test
  public void case65() {
    long n = 999999999999998699L;
    assertEquals(1306, thepower.count(n));
  }

  @Test
  public void case66() {
    long n = 74747474747474747L;
    assertEquals(48256904, thepower.count(n));
  }

  @Test
  public void case67() {
    long n = 12345678901234678L;
    assertEquals(86421292, thepower.count(n));
  }

  @Test
  public void case68() {
    long n = 48151622342481516L;
    assertEquals(107712566, thepower.count(n));
  }

  @Test
  public void case69() {
    long n = 79792266297611998L;
    assertEquals(7, thepower.count(n));
  }

  @Test
  public void case70() {
    long n = 123456789987654321L;
    assertEquals(189679344, thepower.count(n));
  }

  @Test
  public void case71() {
    long n = 99979999999997L;
    assertEquals(1000798, thepower.count(n));
  }

  @Test
  public void case72() {
    long n = 954312123476543412L;
    assertEquals(705804666, thepower.count(n));
  }

  @Test
  public void case73() {
    long n = 12345678987654321L;
    assertEquals(1649, thepower.count(n));
  }

  @Test
  public void case74() {
    long n = 844145128075355872L;
    assertEquals(274277846, thepower.count(n));
  }

  @Test
  public void case75() {
    long n = 9277654329653407L;
    assertEquals(5481853, thepower.count(n));
  }

  @Test
  public void case76() {
    long n = 98765432112345678L;
    assertEquals(283508435, thepower.count(n));
  }

  @Test
  public void case77() {
    long n = 123456789876543218L;
    assertEquals(78568241, thepower.count(n));
  }

  @Test
  public void case78() {
    long n = 534223122313218976L;
    assertEquals(486102883, thepower.count(n));
  }

}
