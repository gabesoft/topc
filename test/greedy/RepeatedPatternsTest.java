package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class RepeatedPatternsTest {
  RepeatedPatterns repeatedpatterns = new RepeatedPatterns();

  @Test
  public void case1() {
    String P1 = "111010100001010";
    String P2 = "010000001000";
    String zeroCount = "3";
    assertEquals(7L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case2() {
    String P1 = "1101010010";
    String P2 = "0001000";
    String zeroCount = "3";
    assertEquals(9999999L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case3() {
    String P1 = "1101010010";
    String P2 = "0001000";
    String zeroCount = "5";
    assertEquals(20000011L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case4() {
    String P1 = "10101010";
    String P2 = "101010101010";
    String zeroCount = "9876543219876";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case5() {
    String P1 = "11111111111111111111111111";
    String P2 = "0";
    String zeroCount = "9876543219876";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case6() {
    String P1 = "1111111111111";
    String P2 = "1111111";
    String zeroCount = "1";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case7() {
    String P1 = "1";
    String P2 = "1";
    String zeroCount = "1";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case8() {
    String P1 = "11111111111111111111111111111111111111111111111111";
    String P2 = "11111111111111111111111111111111111111111111111111";
    String zeroCount = "1";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case9() {
    String P1 = "11111111111111111111111111111111111111111111111111";
    String P2 = "11111111111111111111111111111111111111111111111111";
    String zeroCount = "10000000000000000";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case10() {
    String P1 = "0";
    String P2 = "0";
    String zeroCount = "1";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case11() {
    String P1 = "0";
    String P2 = "0";
    String zeroCount = "47";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case12() {
    String P1 = "0";
    String P2 = "0";
    String zeroCount = "10000000000000000";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case13() {
    String P1 = "0";
    String P2 = "1";
    String zeroCount = "1";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case14() {
    String P1 = "0";
    String P2 = "1";
    String zeroCount = "2";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case15() {
    String P1 = "1";
    String P2 = "0";
    String zeroCount = "1";
    assertEquals(1000000L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case16() {
    String P1 = "1";
    String P2 = "0";
    String zeroCount = "2";
    assertEquals(2000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case17() {
    String P1 = "1";
    String P2 = "0";
    String zeroCount = "87654321";
    assertEquals(3929294272158360L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case18() {
    String P1 = "00001010101011101101010100000";
    String P2 = "000000000010100000100000010000000";
    String zeroCount = "4";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case19() {
    String P1 = "00001010101011101101010100000";
    String P2 = "000000000010100000100000010000000";
    String zeroCount = "5";
    assertEquals(24L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case20() {
    String P1 = "0000101000000001111100000";
    String P2 = "1010010010101010";
    String zeroCount = "8";
    assertEquals(7L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case21() {
    String P1 = "0000101000000001111100000";
    String P2 = "0000101000000001111100000";
    String zeroCount = "9";
    assertEquals(20L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case22() {
    String P1 = "10000000000000000000000000000000000000000000000000";
    String P2 = "00000000000000000000000000000000000000000000000001";
    String zeroCount = "98";
    assertEquals(49999951L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case23() {
    String P1 = "10000000000000000000000000000000000000000000000000";
    String P2 = "00000000000000000000000000000000000000000000000001";
    String zeroCount = "99";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case24() {
    String P1 = "00000000000000000000000000000000000000000000000001";
    String P2 = "10000000000000000000000000000000000000000000000000";
    String zeroCount = "98";
    assertEquals(50000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case25() {
    String P1 = "00000000000000000000000000000000000000000000000001";
    String P2 = "10000000000000000000000000000000000000000000000000";
    String zeroCount = "99";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case26() {
    String P1 = "0010100101010101010101001111101011110";
    String P2 = "000000001111111111111101010111110000000";
    String zeroCount = "11";
    assertEquals(74000071L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case27() {
    String P1 = "00000";
    String P2 = "10";
    String zeroCount = "5000000";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case28() {
    String P1 = "00000";
    String P2 = "10";
    String zeroCount = "5000001";
    assertEquals(5000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case29() {
    String P1 = "00000000000000000000000000000000000000000000000000";
    String P2 = "10000000000000000000000000000000000000000000000000";
    String zeroCount = "49876543";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case30() {
    String P1 = "00000000000000000000000000000000000000000000000000";
    String P2 = "10000000000000000000000000000000000000000000000000";
    String zeroCount = "50000049";
    assertEquals(50000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case31() {
    String P1 = "00000000000000000000000000000000000000000000000000";
    String P2 = "10000000000000000000000000000000000000000000000000";
    String zeroCount = "50000050";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case32() {
    String P1 = "0000000000000000000000";
    String P2 = "0000000000000000000000000000";
    String zeroCount = "4632761373274275";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case33() {
    String P1 = "1";
    String P2 = "0";
    String zeroCount = "140424892";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case34() {
    String P1 = "1";
    String P2 = "0";
    String zeroCount = "140424891";
    assertEquals(9999999826968495L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case35() {
    String P1 = "000000000000000000000000000001";
    String P2 = "00";
    String zeroCount = "172237485";
    assertEquals(9999997066219256L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case36() {
    String P1 = "000000000000000000000000000001";
    String P2 = "00";
    String zeroCount = "172237511";
    assertEquals(9999999695306340L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case37() {
    String P1 = "000000000000000000000000000001";
    String P2 = "00";
    String zeroCount = "172237512";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case38() {
    String P1 = "001010111000";
    String P2 = "0";
    String zeroCount = "49283";
    assertEquals(592550136000L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case39() {
    String P1 = "01000";
    String P2 = "000";
    String zeroCount = "51";
    assertEquals(80000357L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case40() {
    String P1 = "1";
    String P2 = "0";
    String zeroCount = "2";
    assertEquals(2000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case41() {
    String P1 = "1";
    String P2 = "00";
    String zeroCount = "3";
    assertEquals(2000002L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case42() {
    String P1 = "0111111110";
    String P2 = "000";
    String zeroCount = "235153000";
    assertEquals(9999998702205833L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case43() {
    String P1 = "0";
    String P2 = "00000100000";
    String zeroCount = "1000008";
    assertEquals(1000006L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case44() {
    String P1 = "00110100110110001000";
    String P2 = "00";
    String zeroCount = "180989878";
    assertEquals(9999232272139029L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case45() {
    String P1 = "01100";
    String P2 = "00";
    String zeroCount = "195062491";
    assertEquals(9999999678656290L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case46() {
    String P1 = "00000000000000000000000000000000000000000000000000";
    String P2 = "00010000000000000000000000000000000000000000000100";
    String zeroCount = "50000005";
    assertEquals(50000048L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case47() {
    String P1 = "1";
    String P2 = "0";
    String zeroCount = "140424892";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case48() {
    String P1 = "00000";
    String P2 = "010";
    String zeroCount = "5000002";
    assertEquals(5000002L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case49() {
    String P1 = "0";
    String P2 = "01";
    String zeroCount = "1000001";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case50() {
    String P1 = "1";
    String P2 = "00";
    String zeroCount = "1000";
    assertEquals(500249500L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case51() {
    String P1 = "0";
    String P2 = "010";
    String zeroCount = "1000002";
    assertEquals(1000002L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case52() {
    String P1 = "111";
    String P2 = "0";
    String zeroCount = "1000";
    assertEquals(3000499500L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case53() {
    String P1 = "0";
    String P2 = "1";
    String zeroCount = "100";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case54() {
    String P1 = "0";
    String P2 = "00";
    String zeroCount = "3";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case55() {
    String P1 = "0";
    String P2 = "1";
    String zeroCount = "1000000000000";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case56() {
    String P1 = "000";
    String P2 = "000";
    String zeroCount = "1000000000";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case57() {
    String P1 = "101010";
    String P2 = "0";
    String zeroCount = "1000";
    assertEquals(5994498500L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case58() {
    String P1 = "001010";
    String P2 = "00";
    String zeroCount = "123456789";
    assertEquals(4180764798634055L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case59() {
    String P1 = "000000";
    String P2 = "000000";
    String zeroCount = "3";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case60() {
    String P1 = "00001111100000000000000000";
    String P2 = "00000";
    String zeroCount = "10000000";
    assertEquals(61999851000033L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case61() {
    String P1 = "000100";
    String P2 = "000";
    String zeroCount = "100";
    assertEquals(192001486L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case62() {
    String P1 = "00000000000000000000000000000000000000000000000000";
    String P2 = "00000000000000000000000000000000000000000000000000";
    String zeroCount = "10000000000000000";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case63() {
    String P1 = "11111111111111111111111111";
    String P2 = "0";
    String zeroCount = "9876543219876";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case64() {
    String P1 = "01000";
    String P2 = "00";
    String zeroCount = "192500123";
    assertEquals(9745324253753537L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case65() {
    String P1 = "00001000001";
    String P2 = "1111";
    String zeroCount = "3";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case66() {
    String P1 = "101";
    String P2 = "00";
    String zeroCount = "150";
    assertEquals(225005550L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case67() {
    String P1 = "1";
    String P2 = "101";
    String zeroCount = "1";
    assertEquals(1000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case68() {
    String P1 = "0000";
    String P2 = "0001";
    String zeroCount = "4000001";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case69() {
    String P1 = "00011";
    String P2 = "1100";
    String zeroCount = "5";
    assertEquals(5000002L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case70() {
    String P1 = "000";
    String P2 = "1";
    String zeroCount = "2";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case71() {
    String P1 = "010";
    String P2 = "0";
    String zeroCount = "1000";
    assertEquals(2994497502L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case72() {
    String P1 = "0";
    String P2 = "00100";
    String zeroCount = "1000004";
    assertEquals(1000003L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case73() {
    String P1 = "0001";
    String P2 = "10";
    String zeroCount = "4";
    assertEquals(4000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case74() {
    String P1 = "1111111111111111111100000";
    String P2 = "0";
    String zeroCount = "9876543213";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case75() {
    String P1 = "10101010";
    String P2 = "101010101010";
    String zeroCount = "9876578";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case76() {
    String P1 = "10001";
    String P2 = "10001";
    String zeroCount = "999000";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case77() {
    String P1 = "00100";
    String P2 = "0";
    String zeroCount = "4";
    assertEquals(3L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case78() {
    String P1 = "1";
    String P2 = "0";
    String zeroCount = "140424891";
    assertEquals(9999999826968495L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case79() {
    String P1 = "111010100001010";
    String P2 = "0";
    String zeroCount = "111111111";
    assertEquals(7839505977160494L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case80() {
    String P1 = "0010";
    String P2 = "0000";
    String zeroCount = "24000000";
    assertEquals(95999987999999L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case81() {
    String P1 = "0010";
    String P2 = "0000";
    String zeroCount = "21000000";
    assertEquals(76124989499999L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case82() {
    String P1 = "010110";
    String P2 = "1111100";
    String zeroCount = "3";
    assertEquals(6000005L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case83() {
    String P1 = "0011";
    String P2 = "1100";
    String zeroCount = "4";
    assertEquals(4000002L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case84() {
    String P1 = "0";
    String P2 = "010";
    String zeroCount = "1000001";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case85() {
    String P1 = "000000000";
    String P2 = "000000000";
    String zeroCount = "111111111";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case86() {
    String P1 = "0";
    String P2 = "00";
    String zeroCount = "1000002";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case87() {
    String P1 = "1";
    String P2 = "00000000";
    String zeroCount = "125";
    assertEquals(16000960L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case88() {
    String P1 = "10";
    String P2 = "00";
    String zeroCount = "4";
    assertEquals(4000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case89() {
    String P1 = "0000000000";
    String P2 = "000000000";
    String zeroCount = "100000000000";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case90() {
    String P1 = "00000000000000000000000000000000000000000000000000";
    String P2 = "0";
    String zeroCount = "999999999999";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case91() {
    String P1 = "0001000";
    String P2 = "0000000000";
    String zeroCount = "1011";
    assertEquals(707050497L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case92() {
    String P1 = "1001010010101010100010001010101";
    String P2 = "1010100101010100100000010101";
    String zeroCount = "6";
    assertEquals(31000017L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case93() {
    String P1 = "000";
    String P2 = "000";
    String zeroCount = "20";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case94() {
    String P1 = "00100";
    String P2 = "0000";
    String zeroCount = "4004";
    assertEquals(5001997998L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case95() {
    String P1 = "0110";
    String P2 = "0000000000";
    String zeroCount = "1000002";
    assertEquals(449999499999L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case96() {
    String P1 = "00100";
    String P2 = "0000";
    String zeroCount = "435432";
    assertEquals(567984475182L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case97() {
    String P1 = "111010100001010";
    String P2 = "010000001000";
    String zeroCount = "1000000000000000";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case98() {
    String P1 = "0";
    String P2 = "1";
    String zeroCount = "10000000";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case99() {
    String P1 = "0000010101000000";
    String P2 = "00000000";
    String zeroCount = "100000";
    assertEquals(200608850002L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case100() {
    String P1 = "00100";
    String P2 = "00";
    String zeroCount = "6";
    assertEquals(4999998L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case101() {
    String P1 = "010100";
    String P2 = "0";
    String zeroCount = "10";
    assertEquals(42000019L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case102() {
    String P1 = "10000000000000000000000000000000000000000000000000";
    String P2 = "00000000000000000000000000000000000000000000000001";
    String zeroCount = "60";
    assertEquals(49999951L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case103() {
    String P1 = "00001000";
    String P2 = "0000";
    String zeroCount = "111554487";
    assertEquals(1778659155231557L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case104() {
    String P1 = "101";
    String P2 = "0";
    String zeroCount = "1000";
    assertEquals(3000499500L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case105() {
    String P1 = "000";
    String P2 = "1110001110";
    String zeroCount = "3000001";
    assertEquals(3000009L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case106() {
    String P1 = "1";
    String P2 = "0";
    String zeroCount = "1000000000000000";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case107() {
    String P1 = "0010";
    String P2 = "000";
    String zeroCount = "11";
    assertEquals(12000008L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case108() {
    String P1 = "1111110000";
    String P2 = "0";
    String zeroCount = "20";
    assertEquals(160000116L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case109() {
    String P1 = "10";
    String P2 = "01";
    String zeroCount = "2";
    assertEquals(1999999L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case110() {
    String P1 = "001010";
    String P2 = "010101";
    String zeroCount = "3";
    assertEquals(5L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case111() {
    String P1 = "111";
    String P2 = "00000";
    String zeroCount = "117";
    assertEquals(72001380L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case112() {
    String P1 = "01";
    String P2 = "1000";
    String zeroCount = "4";
    assertEquals(2000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case113() {
    String P1 = "1";
    String P2 = "1001";
    String zeroCount = "2";
    assertEquals(1000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case114() {
    String P1 = "1111111111111111111111111111111011010101010101000";
    String P2 = "0";
    String zeroCount = "7";
    assertEquals(196000003L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case115() {
    String P1 = "1";
    String P2 = "0000000000";
    String zeroCount = "25000";
    assertEquals(2531237500L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case116() {
    String P1 = "11001";
    String P2 = "00";
    String zeroCount = "10";
    assertEquals(25000020L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case117() {
    String P1 = "011";
    String P2 = "110";
    String zeroCount = "2";
    assertEquals(3000002L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case118() {
    String P1 = "0";
    String P2 = "10000000000";
    String zeroCount = "1000001";
    assertEquals(1000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case119() {
    String P1 = "110";
    String P2 = "000";
    String zeroCount = "1234567";
    assertEquals(1488590917442L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case120() {
    String P1 = "1101010010";
    String P2 = "0001000";
    String zeroCount = "3";
    assertEquals(9999999L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case121() {
    String P1 = "010";
    String P2 = "0";
    String zeroCount = "3";
    assertEquals(2999999L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case122() {
    String P1 = "0";
    String P2 = "0100";
    String zeroCount = "1000003";
    assertEquals(1000002L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case123() {
    String P1 = "1";
    String P2 = "0";
    String zeroCount = "10000000000000000";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case124() {
    String P1 = "1";
    String P2 = "1";
    String zeroCount = "1919";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case125() {
    String P1 = "1";
    String P2 = "0100010";
    String zeroCount = "3";
    assertEquals(1000002L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case126() {
    String P1 = "100001110000000110000000000";
    String P2 = "000000000000000";
    String zeroCount = "6546212";
    assertEquals(13211603572355L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case127() {
    String P1 = "0";
    String P2 = "10";
    String zeroCount = "1000001";
    assertEquals(1000001L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case128() {
    String P1 = "0111111110";
    String P2 = "000";
    String zeroCount = "100000";
    assertEquals(334996583333L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case129() {
    String P1 = "1";
    String P2 = "0";
    String zeroCount = "9";
    assertEquals(9000036L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case130() {
    String P1 = "0";
    String P2 = "001";
    String zeroCount = "1000002";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case131() {
    String P1 = "0000000000";
    String P2 = "0000100000";
    String zeroCount = "10000009";
    assertEquals(10000005L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case132() {
    String P1 = "00";
    String P2 = "0000000000";
    String zeroCount = "5";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case133() {
    String P1 = "00100";
    String P2 = "0000";
    String zeroCount = "4";
    assertEquals(3L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case134() {
    String P1 = "1001010010100100101001";
    String P2 = "0001000111010010100000000";
    String zeroCount = "12462189";
    assertEquals(-1L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

  @Test
  public void case135() {
    String P1 = "0";
    String P2 = "0";
    String zeroCount = "1000000000000";
    assertEquals(0L, repeatedpatterns.findZeroSegment(P1, P2, zeroCount));
  }

}
