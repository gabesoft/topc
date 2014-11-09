package topc.easy;

import java.util.*;

// SRM 208 Div 1 : 250
public class TallPeople  {
  public int[] getPeople(String[] people) {
    int[] tallestInCol = tokenize(people[0]);
    int tallest = arrayMin(tallestInCol);
    for (int i = 1; i < people.length; i++) {
      int[] row = tokenize(people[i]);
      int shortestInRow = Integer.MAX_VALUE;
      for (int j = 0; j < row.length; j++) {
        int val = row[j];
        shortestInRow = (shortestInRow > row[j]) ? row[j] : shortestInRow;
        tallestInCol[j] = (tallestInCol[j] < row[j]) ? row[j] : tallestInCol[j];
      }
      tallest = (tallest < shortestInRow) ? shortestInRow : tallest;
    }
    int shortest = arrayMin(tallestInCol);
    int[] result = { tallest, shortest };
    return result;
  }

  int arrayMin(int[] array) {
    int res = array[0];
    for (int i = 1; i < array.length; i++) {
      res = res > array[i] ? array[i] : res;
    }
    return res;
  }

  int arrayMax(int[] array) {
    int res = array[0];
    for (int i = 1; i < array.length; i++) {
      res = res < array[i] ? array[i] : res;
    }
    return res;
  }

  int[] tokenize(String row) {
    String[] values = row.split(" ");
    int[] result = new int[values.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = Integer.parseInt(values[i]);
    }
    return result;
  }
}
