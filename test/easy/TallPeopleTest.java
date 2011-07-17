package topc.test.easy;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;
import topc.easy.*;

public class TallPeopleTest {
  @Test
  public void testCase1() {
    String[] people = {
      "9 2 3",
      "4 8 7"};
    int[] expected = { 4, 7 };
    TallPeople peeps = new TallPeople();
    int[] actual = peeps.getPeople(people);
    assertArrayEquals(expected, actual);
  }
}
