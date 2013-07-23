package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class EigenVectorTest {
  EigenVector eigenvector = new EigenVector();

  @Test
  public void case1() {
    String[] A = { "1 0 0 0 0", "0 1 0 0 0", "0 0 1 0 0", "0 0 0 1 0", "0 0 0 0 1" };
    assertArrayEquals(new int[] { 0, 0, 0, 0, 1 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case2() {
    String[] A = { "100 0 0 0", "0 200 0 0", "0 0 333 0", "0 0 0 42" };
    assertArrayEquals(new int[] { 0, 0, 0, 1 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case3() {
    String[] A = { "10 -10 -10 10", "20 40 -10 -10", "10 -10 10 20", "10 10 20 5" };
    assertArrayEquals(new int[] { 1, -5, 2, 0 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case4() {
    String[] A = { "1 0 0", "0 0 -1", "0 1 0" };
    assertArrayEquals(new int[] { 1, 0, 0 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case5() {
    String[] A = { "0 1 2 2 1", "1 0 1 2 2", "2 1 0 1 2", "2 2 1 0 1", "1 2 2 1 0" };
    assertArrayEquals(new int[] { 1, 1, 1, 1, 1 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case6() {
    String[] A = { "1000 1000 999 999 1", "0 0 0 1 0", "0 0 1 0 0", "0 1 0 0 0", "1 0 0 0 0" };
    assertArrayEquals(new int[] { 1, -1, 1, -1, 1 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case7() {
    String[] A = { "30 20", "87 2" };
    assertArrayEquals(new int[] { 2, 3 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case8() {
    String[] A = { "7 7", "1 1" };
    assertArrayEquals(new int[] { 7, 1 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case9() {
    String[] A = { "6 6 6", "1 1 1", "1 1 1" };
    assertArrayEquals(new int[] { 6, 1, 1 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case10() {
    String[] A = { "1 1 1 1", "1 1 1 1", "2 2 2 2", "3 3 3 3" };
    assertArrayEquals(new int[] { 1, 1, 2, 3 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case11() {
    String[] A = { "4 4 4 4", "1 1 1 1", "1 1 1 1", "1 1 1 1" };
    assertArrayEquals(new int[] { 4, 1, 1, 1 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case12() {
    String[] A = { "7 7 7 7 7", "1 1 1 1 1", "0 0 0 0 0", "0 0 0 0 0", "0 0 0 0 0" };
    assertArrayEquals(new int[] { 7, 1, 0, 0, 0 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case13() {
    String[] A = { "333 333 333 333 333", "222 222 222 222 222", "-111 -111 -111 -111 -111", "111 111 111 111 111", "0 0 0 0 0" };
    assertArrayEquals(new int[] { 3, 2, -1, 1, 0 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case14() {
    String[] A = { "33 33 33 33 33", "0 0 0 0 0", "22 22 22 22 22", "0 0 0 0 0", "-33 -33 -33 -33 -33" };
    assertArrayEquals(new int[] { 3, 0, 2, 0, -3 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case15() {
    String[] A = { "7 7 7 7 7", "1 1 1 1 1", "-1 -1 -1 -1 -1", "0 0 0 0 0", "0 0 0 0 0" };
    assertArrayEquals(new int[] { 7, 1, -1, 0, 0 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case16() {
    String[] A = { "4 4 4 4", "2 2 2 2", "1 1 1 1", "0 0 0 0" };
    assertArrayEquals(new int[] { 4, 2, 1, 0 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case17() {
    String[] A = { "5 5 5 5", "-3 -3 -3 -3", "-1 -1 -1 -1", "0 0 0 0" };
    assertArrayEquals(new int[] { 5, -3, -1, 0 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case18() {
    String[] A = { "50 50 50 50 50", "30 30 30 30 30", "0 0 0 0 0", "-10 -10 -10 -10 -10", "0 0 0 0 0" };
    assertArrayEquals(new int[] { 5, 3, 0, -1, 0 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case19() {
    String[] A = { "800 800 800 800 800", "-100 -100 -100 -100 -100", "0 0 0 0 0", "0 0 0 0 0", "0 0 0 0 0" };
    assertArrayEquals(new int[] { 8, -1, 0, 0, 0 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case20() {
    String[] A = { "4 4 4 4 4", "-4 -4 -4 -4 -4", "1 1 1 1 1", "0 0 0 0 0", "0 0 0 0 0" };
    assertArrayEquals(new int[] { 4, -4, 1, 0, 0 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case21() {
    String[] A = { "10 -10 -10 10", "20 40 -10 -10", "10 -10 10 20", "10 10 20 5" };
    assertArrayEquals(new int[] { 1, -5, 2, 0 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case22() {
    String[] A = { "100 100 100", "100 100 100", "100 100 100" };
    assertArrayEquals(new int[] { 1, 1, 1 }, eigenvector.findEigenVector(A));
  }

  @Test
  public void case23() {
    String[] A = { "1 0 0 0", "0 0 0 0", "0 0 0 0", "0 0 0 0" };
    assertArrayEquals(new int[] { 1, 0, 0, 0 }, eigenvector.findEigenVector(A));
  }

}
