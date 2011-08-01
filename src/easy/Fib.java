package topc.easy;

public class Fib {
  public long calc(int n) {
    if (n < 3) { return 1; }

    long[] data = new long[n];

    data[0] = 1;
    data[1] = 1;

    for (int i = 2; i < data.length; i++) {
      data[i] = data[i-1] + data[i-2];
    }

    return data[n-1];
  }
}
