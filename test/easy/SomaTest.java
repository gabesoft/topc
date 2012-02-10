package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SomaTest {
  Soma soma = new Soma();

  @Test
  public void cube()	{
    String[] pattern = {"333", "333", "333"};
    assertEquals(11520, soma.letMeCountTheWays(pattern));
  }

  @Test
  public void crystal()	{
    String[] pattern = {"345", "234", "123"};
    assertEquals(2800, soma.letMeCountTheWays(pattern));
  }

  @Test
  public void wall()	{
    String[] pattern = {"3330000", "0033300", "0000333"};
    assertEquals(28, soma.letMeCountTheWays(pattern));
  }

  @Test
  public void lounge()	{
    String[] pattern = {"21111111", "21111111", "21111111"};
    assertEquals(0, soma.letMeCountTheWays(pattern));
  }

  @Test
  public void tower()	{
    String[] pattern = {"67", "77"};
    assertEquals(1520, soma.letMeCountTheWays(pattern));
  }

  @Test
  public void replication()	{
    String[] pattern = {
      "010000000000000000000000000",
      "110000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000000",
      "000000000000000000000000022",
      "000000000000000000000000022",
      "000000000000000000000002222",
      "000000000000000000000002222"};
    assertEquals(76, soma.letMeCountTheWays(pattern));
  }

  @Test
  public void disjoint()	{
    String[] pattern = {"11100110001", "01001100111", "00000000000", "20002012011", "11011001001"};
    assertEquals(1, soma.letMeCountTheWays(pattern));
  }

  @Test
  public void monument()	{
    String[] pattern = {"121", "222", "121", "121", "333"};
    assertEquals(78, soma.letMeCountTheWays(pattern));
  }

  @Test
  public void gallows()	{
    String[] pattern = {"020", "010", "010", "020", "343", "353"};
    assertEquals(42, soma.letMeCountTheWays(pattern));
  }
}
