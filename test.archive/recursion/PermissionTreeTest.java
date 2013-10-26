package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class PermissionTreeTest {
  PermissionTree permissiontree = new PermissionTree();

  @Test
  public void case1() {
    String[] folders = { "0 Admin", "0 Joe,Phil", "0 Joe" };
    String[] users = { "Admin", "Joe", "Phil" };
    assertArrayEquals(new int[] { 0, 0, 1 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case2() {
    String[] folders = { "0 Admin" };
    String[] users = { "Peter", "Paul", "Mary" };
    assertArrayEquals(new int[] { -1, -1, -1 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case3() {
    String[] folders = { "0 Admin", "2 John", "0 Peter,John", "0 Tim", "1 John" };
    String[] users = { "John" };
    assertArrayEquals(new int[] { 2 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case4() {
    String[] folders = { "0 Administrator", "0 Admin" };
    String[] users = { "Admin" };
    assertArrayEquals(new int[] { 1 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case5() {
    String[] folders = { "0 Admin", "0 Jeff", "1 Mark,Tim", "1 Tim,Jeff", "0 Dan", "4 Ed", "4 Tom", "4 Kyle,Ed", "0 Ben", "8 Rich", "8 Sam", "8 Tim" };
    String[] users = { "Jeff", "Ed", "Tim", "Steve" };
    assertArrayEquals(new int[] { 1, 4, 0, -1 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case6() {
    String[] folders = { "0 Admin", "0 Bob,Joe,Bob", "0 Joe" };
    String[] users = { "Joe", "Bob" };
    assertArrayEquals(new int[] { 0, 1 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case7() {
    String[] folders = { "0 Root", "00 Test", "001 A", "000 B", "00002 A,B,C" };
    String[] users = { "A", "B", "C" };
    assertArrayEquals(new int[] { 2, 0, 4 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case8() {
    String[] folders = { "0 Admin", "0 Bob,Joe,Bob", "0 Joe" };
    String[] users = { "Joe", "Bob" };
    assertArrayEquals(new int[] { 0, 1 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case9() {
    String[] folders = { "0 Admin" };
    String[] users = { "Peter", "Paul", "Mary" };
    assertArrayEquals(new int[] { -1, -1, -1 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case10() {
    String[] folders = { "0 Admin", "0 Jeff", "1 Mark,Tim", "1 Tim,Jeff", "0 Dan", "4 Ed", "4 Tom", "4 Kyle,Ed", "0 Ben", "8 Rich", "8 Sam", "8 Tim" };
    String[] users = { "Jeff", "Ed", "Tim", "Steve" };
    assertArrayEquals(new int[] { 1, 4, 0, -1 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case11() {
    String[] folders = { "0 Admin", "0 A", "0 AB", "0 B" };
    String[] users = { "A", "B" };
    assertArrayEquals(new int[] { 1, 3 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case12() {
    String[] folders = { "0 Admin", "0 Joe,Phil", "0 Joe" };
    String[] users = { "Admin", "Joe", "Phil" };
    assertArrayEquals(new int[] { 0, 0, 1 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case13() {
    String[] folders = { "0 Admin", "8 b", "10 c", "10 e", "10 e", "9 e", "8 e", "8 e", "0 a", "0 a", "0 a", "4 c,d", "1 b,d", "4 d", "1 d", "4 d", "1 d", "3 d", "3 c,d", "3 c,d", "6 d", "6 d", "6 b,d" };
    String[] users = { "Admin", "a", "b", "c", "d" };
    assertArrayEquals(new int[] { 0, 0, 8, 10, 0 }, permissiontree.findHome(folders, users));
  }

  @Test
  public void case14() {
    String[] folders = { "0 Adam", "0 Joe,Phil", "0 Joe", "0 Joe,Phil,Adam,Admin" };
    String[] users = { "Admin", "Joe", "Phil", "Adam" };
    assertArrayEquals(new int[] { 3, 0, 0, 0 }, permissiontree.findHome(folders, users));
  }

}
