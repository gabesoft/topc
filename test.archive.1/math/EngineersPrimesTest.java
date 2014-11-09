package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class EngineersPrimesTest {
  EngineersPrimes engineersprimes = new EngineersPrimes();

  @Test
  public void case1() {
    int N = 3;
    assertEquals(49L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case2() {
    int N = 1;
    assertEquals(9L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case3() {
    int N = 265;
    assertEquals(2886601L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case4() {
    int N = 1835;
    assertEquals(247716121L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case5() {
    int N = 4000;
    assertEquals(1431184561L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case6() {
    int N = 3417;
    assertEquals(1010794849L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case7() {
    int N = 2;
    assertEquals(25L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case8() {
    int N = 4;
    assertEquals(121L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case9() {
    int N = 5;
    assertEquals(169L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case10() {
    int N = 50;
    assertEquals(54289L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case11() {
    int N = 300;
    assertEquals(3972049L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case12() {
    int N = 3000;
    assertEquals(753886849L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case13() {
    int N = 2000;
    assertEquals(302516449L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case14() {
    int N = 1000;
    assertEquals(62837329L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case15() {
    int N = 3999;
    assertEquals(1429822969L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case16() {
    int N = 3998;
    assertEquals(1429671721L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case17() {
    int N = 688;
    assertEquals(26739241L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case18() {
    int N = 2460;
    assertEquals(482285521L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case19() {
    int N = 3990;
    assertEquals(1420611481L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case20() {
    int N = 10000;
    assertEquals(10971096049L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case21() {
    int N = 100000;
    assertEquals(1689274677841L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case22() {
    int N = 15048;
    assertEquals(27019798129L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case23() {
    int N = 33912;
    assertEquals(160577319841L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case24() {
    int N = 95899;
    assertEquals(1543013636761L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case25() {
    int N = 99999;
    assertEquals(1689243484681L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case26() {
    int N = 46001;
    assertEquals(312591691801L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case27() {
    int N = 65536;
    assertEquals(675103792609L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case28() {
    int N = 153;
    assertEquals(786769L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case29() {
    int N = 10000;
    assertEquals(10971096049L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case30() {
    int N = 100000;
    assertEquals(1689274677841L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case31() {
    int N = 1;
    assertEquals(9L, engineersprimes.smallestNonPrime(N));
  }

  @Test
  public void case32() {
    int N = 98999;
    assertEquals(1652553957289L, engineersprimes.smallestNonPrime(N));
  }

}
