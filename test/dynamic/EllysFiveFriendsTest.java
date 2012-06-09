package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class EllysFiveFriendsTest {
  EllysFiveFriends ellysfivefriends = new EllysFiveFriends();

  @Test
  public void Case1() {
      int[] data = new int[] { 5, 1, 1, 2, 3 };
      int actual = ellysfivefriends.getZero(data);
      assertEquals(10, actual);
  }

  @Test
  public void Case2() {
      int[] data = new int[] { 2, 1, 1, 1, 2 };
      int actual = ellysfivefriends.getZero(data);
      assertEquals(0, actual);
  }

  @Test
  public void Case3() {
      int[] data = new int[] { 3, 4, 1, 4, 5 };
      int actual = ellysfivefriends.getZero(data);
      assertEquals(520, actual);
  }

  @Test
  public void Case4() {
      int[] data = new int[] { 42, 666, 1337, 666, 42 };
      int actual = ellysfivefriends.getZero(data);
      assertEquals(549119981, actual);
  }
}
