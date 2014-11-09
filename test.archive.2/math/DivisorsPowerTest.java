package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class DivisorsPowerTest {
  DivisorsPower divisorspower = new DivisorsPower();

  @Test
  public void case1() {
    long n = 4L;
    assertEquals(2L, divisorspower.findArgument(n));
  }

  @Test
  public void case2() {
    long n = 10L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case3() {
    long n = 64L;
    assertEquals(4L, divisorspower.findArgument(n));
  }

  @Test
  public void case4() {
    long n = 10000L;
    assertEquals(10L, divisorspower.findArgument(n));
  }

  @Test
  public void case5() {
    long n = 2498388559757689L;
    assertEquals(49983883L, divisorspower.findArgument(n));
  }

  @Test
  public void case6() {
    long n = 25L;
    assertEquals(5L, divisorspower.findArgument(n));
  }

  @Test
  public void case7() {
    long n = 729L;
    assertEquals(9L, divisorspower.findArgument(n));
  }

  @Test
  public void case8() {
    long n = 27L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case9() {
    long n = 81L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case10() {
    long n = 50L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case11() {
    long n = 7921L;
    assertEquals(89L, divisorspower.findArgument(n));
  }

  @Test
  public void case12() {
    long n = 1048576L;
    assertEquals(16L, divisorspower.findArgument(n));
  }

  @Test
  public void case13() {
    long n = 110075314176L;
    assertEquals(24L, divisorspower.findArgument(n));
  }

  @Test
  public void case14() {
    long n = 456976L;
    assertEquals(26L, divisorspower.findArgument(n));
  }

  @Test
  public void case15() {
    long n = 456977L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case16() {
    long n = 656100000000L;
    assertEquals(30L, divisorspower.findArgument(n));
  }

  @Test
  public void case17() {
    long n = 531441L;
    assertEquals(27L, divisorspower.findArgument(n));
  }

  @Test
  public void case18() {
    long n = 101559956668416L;
    assertEquals(36L, divisorspower.findArgument(n));
  }

  @Test
  public void case19() {
    long n = 1062882L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case20() {
    long n = 9682651996416L;
    assertEquals(42L, divisorspower.findArgument(n));
  }

  @Test
  public void case21() {
    long n = 64925062108545024L;
    assertEquals(48L, divisorspower.findArgument(n));
  }

  @Test
  public void case22() {
    long n = 96717311574016L;
    assertEquals(56L, divisorspower.findArgument(n));
  }

  @Test
  public void case23() {
    long n = 66535302272909312L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case24() {
    long n = 8279638877935441L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case25() {
    long n = 360040606269696L;
    assertEquals(66L, divisorspower.findArgument(n));
  }

  @Test
  public void case26() {
    long n = 3486784401L;
    assertEquals(81L, divisorspower.findArgument(n));
  }

  @Test
  public void case27() {
    long n = 10460353203L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case28() {
    long n = 1000000000000000000L;
    assertEquals(100L, divisorspower.findArgument(n));
  }

  @Test
  public void case29() {
    long n = 28525864220672256L;
    assertEquals(114L, divisorspower.findArgument(n));
  }

  @Test
  public void case30() {
    long n = 1771561L;
    assertEquals(121L, divisorspower.findArgument(n));
  }

  @Test
  public void case31() {
    long n = 118721967032369152L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case32() {
    long n = 759807991618519296L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case33() {
    long n = 4890838206582784L;
    assertEquals(412L, divisorspower.findArgument(n));
  }

  @Test
  public void case34() {
    long n = 53974440976L;
    assertEquals(482L, divisorspower.findArgument(n));
  }

  @Test
  public void case35() {
    long n = 292681L;
    assertEquals(541L, divisorspower.findArgument(n));
  }

  @Test
  public void case36() {
    long n = 541L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case37() {
    long n = 29542602396307456L;
    assertEquals(556L, divisorspower.findArgument(n));
  }

  @Test
  public void case38() {
    long n = 347709076131545088L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case39() {
    long n = 594823321L;
    assertEquals(841L, divisorspower.findArgument(n));
  }

  @Test
  public void case40() {
    long n = 3533050288881L;
    assertEquals(1371L, divisorspower.findArgument(n));
  }

  @Test
  public void case41() {
    long n = 9109555799784049L;
    assertEquals(208849L, divisorspower.findArgument(n));
  }

  @Test
  public void case42() {
    long n = 9598548249896761L;
    assertEquals(212521L, divisorspower.findArgument(n));
  }

  @Test
  public void case43() {
    long n = 9598548249896762L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case44() {
    long n = 999922001521L;
    assertEquals(999961L, divisorspower.findArgument(n));
  }

  @Test
  public void case45() {
    long n = 35044572243972880L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case46() {
    long n = 982134461213542729L;
    assertEquals(994009L, divisorspower.findArgument(n));
  }

  @Test
  public void case47() {
    long n = 838137706742929321L;
    assertEquals(942841L, divisorspower.findArgument(n));
  }

  @Test
  public void case48() {
    long n = 889092468889L;
    assertEquals(942917L, divisorspower.findArgument(n));
  }

  @Test
  public void case49() {
    long n = 324584056305938521L;
    assertEquals(687241L, divisorspower.findArgument(n));
  }

  @Test
  public void case50() {
    long n = 6756327210616080L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case51() {
    long n = 329734774403186161L;
    assertEquals(23963L, divisorspower.findArgument(n));
  }

  @Test
  public void case52() {
    long n = 893623315422378256L;
    assertEquals(30746L, divisorspower.findArgument(n));
  }

  @Test
  public void case53() {
    long n = 95367431640625L;
    assertEquals(625L, divisorspower.findArgument(n));
  }

  @Test
  public void case54() {
    long n = 79792266297612001L;
    assertEquals(2401L, divisorspower.findArgument(n));
  }

  @Test
  public void case55() {
    long n = 61341990221615104L;
    assertEquals(628L, divisorspower.findArgument(n));
  }

  @Test
  public void case56() {
    long n = 965206487562694441L;
    assertEquals(982449229L, divisorspower.findArgument(n));
  }

  @Test
  public void case57() {
    long n = 926680334444501641L;
    assertEquals(962642371L, divisorspower.findArgument(n));
  }

  @Test
  public void case58() {
    long n = 926680334444501643L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case59() {
    long n = 926680338295071129L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case60() {
    long n = 98978104944563881L;
    assertEquals(314607859L, divisorspower.findArgument(n));
  }

  @Test
  public void case61() {
    long n = 999999874000003969L;
    assertEquals(999999937L, divisorspower.findArgument(n));
  }

  @Test
  public void case62() {
    long n = 999999999999999989L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case63() {
    long n = 2L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case64() {
    long n = 999999999999L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case65() {
    long n = 12345679432098769L;
    assertEquals(111111113L, divisorspower.findArgument(n));
  }

  @Test
  public void case66() {
    long n = 16L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case67() {
    long n = 999999999999999996L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case68() {
    long n = 68L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case69() {
    long n = 999999858000005041L;
    assertEquals(999999929L, divisorspower.findArgument(n));
  }

  @Test
  public void case70() {
    long n = 100000000000000003L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case71() {
    long n = 965211250482432409L;
    assertEquals(982451653L, divisorspower.findArgument(n));
  }

  @Test
  public void case72() {
    long n = 999998002000998001L;
    assertEquals(999999001L, divisorspower.findArgument(n));
  }

  @Test
  public void case73() {
    long n = 1014741853230169L;
    assertEquals(100489L, divisorspower.findArgument(n));
  }

  @Test
  public void case74() {
    long n = 999999992000000016L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case75() {
    long n = 8L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case76() {
    long n = 36902422678601089L;
    assertEquals(332929L, divisorspower.findArgument(n));
  }

  @Test
  public void case77() {
    long n = 1125899839733759L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case78() {
    long n = 36L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case79() {
    long n = 10000000002065383L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case80() {
    long n = 127021550911887241L;
    assertEquals(502681L, divisorspower.findArgument(n));
  }

  @Test
  public void case81() {
    long n = 999999999999999877L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case82() {
    long n = 485829216265306112L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case83() {
    long n = 1073741824L;
    assertEquals(32L, divisorspower.findArgument(n));
  }

  @Test
  public void case84() {
    long n = 1000000L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case85() {
    long n = 4294967297L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case86() {
    long n = 14774554437890625L;
    assertEquals(105L, divisorspower.findArgument(n));
  }

  @Test
  public void case87() {
    long n = 789730223053602816L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case88() {
    long n = 32894113444921L;
    assertEquals(32041L, divisorspower.findArgument(n));
  }

  @Test
  public void case89() {
    long n = 10028029413722401L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case90() {
    long n = 999999594000041209L;
    assertEquals(999999797L, divisorspower.findArgument(n));
  }

  @Test
  public void case91() {
    long n = 486820867825729536L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case92() {
    long n = 999999999999998989L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case93() {
    long n = 2498388559757699L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case94() {
    long n = 632070858021803281L;
    assertEquals(795028841L, divisorspower.findArgument(n));
  }

  @Test
  public void case95() {
    long n = 11L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case96() {
    long n = 999999866000004473L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case97() {
    long n = 999999999999999999L;
    assertEquals(-1L, divisorspower.findArgument(n));
  }

  @Test
  public void case98() {
    long n = 2985984L;
    assertEquals(12L, divisorspower.findArgument(n));
  }

}
