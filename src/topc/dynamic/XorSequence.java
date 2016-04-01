package topc.dynamic;

import java.util.*;

// SRM 649 Division I Level Two - 550
// dynamic programming, math, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13249&rd=16313
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+649
public class XorSequence {
    public long getmax(int N, int sz, int A0, int A1, int P, int Q, int R) {
        int a[] = new int[sz];
        a[0] = A0;
        a[1] = A1;

        for (int i = 2; i < sz; i++) {
            a[i] = (int)(((long) a[i - 2] * P + (long) a[i - 1] * Q + R) % N);
        }

        Number[] xs = new Number[sz];
        for (int i = 0; i < sz; i++) {
            xs[i] = new Number(a[i], i);
        }
        Arrays.sort(xs);

        int bits = Integer.bitCount(N - 1);
        long r = 0;

        BinaryIndexedTree tree = new BinaryIndexedTree(sz);
        for (int same = 0; same < bits; same++) {
            int mask  = ((1 << same) - 1) << (bits - same);
            int first = 0;
            long c0   = 0;
            long c1   = 0;

            while (first < sz) {
                long sum  = 0;
                int zeros = 0;
                int ones  = 0;
                int last  = first;

                tree.reset();

                while (last < sz && (xs[first].value & mask) == (xs[last].value & mask)) {
                    if ((xs[last].value & 1 << (bits - same - 1)) != 0) {
                        sum += tree.get(xs[last].id);
                        ones++;
                    } else {
                        tree.update(xs[last].id, 1);
                        zeros++;
                    }
                    last++;
                }
                first = last;
                c0 += sum;
                c1 += (long) zeros * ones - sum;
            }
            r += Math.max(c0, c1);
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class BinaryIndexedTree {
        public int size;
        public int data[];
        public ArrayList<Integer> used;

        public BinaryIndexedTree (int size) {
            this.size = size;
            this.data = new int[size + 1];
            this.used = new ArrayList<Integer>();
        }

        public void reset() {
            for (int idx : this.used) {
                this.data[idx] = 0;
            }
            this.used.clear();
        }

        public void update(int idx, int val) {
            idx += 1;
            while (idx <= this.size) {
                this.data[idx] += val;
                this.used.add(idx);
                idx += (idx & -idx);
            }
        }

        private int get(int idx) {
            idx += 1;
            int sum = 0;
            while (idx > 0) {
                sum += this.data[idx];
                idx -= (idx & -idx);
            }
            return sum;
        }
    }

    public class Number implements Comparable<Number>  {
        public int value;
        public int id;

        public Number (int value, int id) {
            this.value = value;
            this.id = id;
        }

        @Override
		public int compareTo(Number o) {
            return this.value - o.value;
        }
    }
}
