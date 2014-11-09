package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PrimeAnagramsTest {
  PrimeAnagrams primeanagrams = new PrimeAnagrams();

  @Test
  public void case1() {
    String anagram = "39151";
    assertArrayEquals(new int[] { 5, 13, 19 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case2() {
    String anagram = "921179";
    assertArrayEquals(new int[] { 2, 17, 199 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case3() {
    String anagram = "01123";
    assertArrayEquals(new int[] { 2, 3, 101 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case4() {
    String anagram = "0707070";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case5() {
    String anagram = "222";
    assertArrayEquals(new int[] { 2, 2, 2 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case6() {
    String anagram = "123";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case7() {
    String anagram = "1311140";
    assertArrayEquals(new int[] { 11, 41, 103 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case8() {
    String anagram = "7315";
    assertArrayEquals(new int[] { 3, 5, 17 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case9() {
    String anagram = "0000000";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case10() {
    String anagram = "000";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case11() {
    String anagram = "0030070";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case12() {
    String anagram = "8331759";
    assertArrayEquals(new int[] { 3, 157, 389 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case13() {
    String anagram = "8239772";
    assertArrayEquals(new int[] { 2, 2, 37879 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case14() {
    String anagram = "8139674";
    assertArrayEquals(new int[] { 3, 67, 1489 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case15() {
    String anagram = "850793";
    assertArrayEquals(new int[] { 5, 7, 3089 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case16() {
    String anagram = "9573000";
    assertArrayEquals(new int[] { 3, 5, 70009 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case17() {
    String anagram = "111111";
    assertArrayEquals(new int[] { 11, 11, 11 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case18() {
    String anagram = "3111111";
    assertArrayEquals(new int[] { 11, 11, 113 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case19() {
    String anagram = "234";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case20() {
    String anagram = "523";
    assertArrayEquals(new int[] { 2, 3, 5 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case21() {
    String anagram = "111";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case22() {
    String anagram = "2299998";
    assertArrayEquals(new int[] { 2, 2, 98999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case23() {
    String anagram = "82749847";
    assertArrayEquals(new int[] { 2, 487, 4789 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case24() {
    String anagram = "39186758";
    assertArrayEquals(new int[] { 5, 37, 16889 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case25() {
    String anagram = "99989999";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case26() {
    String anagram = "98769875";
    assertArrayEquals(new int[] { 5, 7, 678989 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case27() {
    String anagram = "98749874";
    assertArrayEquals(new int[] { 7, 47, 48989 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case28() {
    String anagram = "10401210";
    assertArrayEquals(new int[] { 2, 101, 4001 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case29() {
    String anagram = "09949993";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case30() {
    String anagram = "33388888";
    assertArrayEquals(new int[] { 3, 83, 88883 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case31() {
    String anagram = "573";
    assertArrayEquals(new int[] { 3, 5, 7 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case32() {
    String anagram = "19684774";
    assertArrayEquals(new int[] { 19, 467, 487 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case33() {
    String anagram = "99999888";
    assertArrayEquals(new int[] { 89, 89, 8999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case34() {
    String anagram = "99999887";
    assertArrayEquals(new int[] { 7, 89, 98999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case35() {
    String anagram = "99999885";
    assertArrayEquals(new int[] { 5, 89, 98999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case36() {
    String anagram = "99999884";
    assertArrayEquals(new int[] { 89, 89, 4999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case37() {
    String anagram = "99999883";
    assertArrayEquals(new int[] { 3, 89, 98999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case38() {
    String anagram = "99999882";
    assertArrayEquals(new int[] { 2, 89, 98999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case39() {
    String anagram = "99999881";
    assertArrayEquals(new int[] { 19, 89, 8999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case40() {
    String anagram = "99999878";
    assertArrayEquals(new int[] { 7, 89, 98999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case41() {
    String anagram = "99999877";
    assertArrayEquals(new int[] { 7, 7, 989999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case42() {
    String anagram = "99999875";
    assertArrayEquals(new int[] { 5, 7, 989999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case43() {
    String anagram = "99999874";
    assertArrayEquals(new int[] { 7, 89, 49999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case44() {
    String anagram = "99999873";
    assertArrayEquals(new int[] { 3, 7, 989999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case45() {
    String anagram = "99999872";
    assertArrayEquals(new int[] { 2, 7, 989999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case46() {
    String anagram = "99999871";
    assertArrayEquals(new int[] { 7, 199, 8999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case47() {
    String anagram = "99999858";
    assertArrayEquals(new int[] { 5, 89, 98999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case48() {
    String anagram = "99999857";
    assertArrayEquals(new int[] { 5, 7, 989999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case49() {
    String anagram = "99999855";
    assertArrayEquals(new int[] { 5, 5, 989999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case50() {
    String anagram = "99999854";
    assertArrayEquals(new int[] { 5, 89, 49999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case51() {
    String anagram = "99999853";
    assertArrayEquals(new int[] { 3, 5, 989999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case52() {
    String anagram = "99999852";
    assertArrayEquals(new int[] { 2, 5, 989999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case53() {
    String anagram = "000";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case54() {
    String anagram = "00000000";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case55() {
    String anagram = "01123";
    assertArrayEquals(new int[] { 2, 3, 101 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case56() {
    String anagram = "123";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case57() {
    String anagram = "87654321";
    assertArrayEquals(new int[] { 2, 3, 145687 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case58() {
    String anagram = "12345678";
    assertArrayEquals(new int[] { 2, 3, 145687 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case59() {
    String anagram = "222";
    assertArrayEquals(new int[] { 2, 2, 2 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case60() {
    String anagram = "98765432";
    assertArrayEquals(new int[] { 2, 47, 35869 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case61() {
    String anagram = "19191919";
    assertArrayEquals(new int[] { 11, 19, 1999 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case62() {
    String anagram = "999";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case63() {
    String anagram = "11797623";
    assertArrayEquals(new int[] { 2, 137, 1697 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case64() {
    String anagram = "99996123";
    assertArrayEquals(new int[] { 3, 199, 2699 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case65() {
    String anagram = "23458716";
    assertArrayEquals(new int[] { 2, 3, 145687 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case66() {
    String anagram = "444";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case67() {
    String anagram = "94111972";
    assertArrayEquals(new int[] { 19, 127, 149 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case68() {
    String anagram = "11223344";
    assertArrayEquals(new int[] { 2, 13, 14243 }, primeanagrams.primes(anagram));
  }

  @Test
  public void case69() {
    String anagram = "22999999";
    assertArrayEquals(new int[] {  }, primeanagrams.primes(anagram));
  }

  @Test
  public void case70() {
    String anagram = "31597267";
    assertArrayEquals(new int[] { 2, 3, 156797 }, primeanagrams.primes(anagram));
  }

}
