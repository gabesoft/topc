package topc.encryption;

import java.util.*;
import java.io.*;
import java.text.*;

// SRM 359 Division II Level Three - 1000
// encryption/compression, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7862&rd=10770
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm359
public class UTF8Decode {
    int LIM = 1114112;

    public int[] decodeString(int[] bytes) {
        Enc map[] = new Enc[LIM];

        for (int i = 0; i < map.length; i++) {
            map[i] = encode(i);
        }

        int n   = bytes.length;
        int k   = 0;
        int a[] = new int[4];
        int s[] = new int[] { 0, 0, 128, 2048, 65536 };

        ArrayList<Integer> decoded = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            a[k++] = bytes[i];

            boolean partial = false;
            for (int j = s[k]; j < LIM; j++) {
                partial = map[j].valid(a, k);
                if (partial) {
                    if (map[j].len == k) {
                        decoded.add(j);
                        k = 0;
                    }
                    break;
                }
            }

            if (!partial) {
                k--;
            }
        }

        return toArray(decoded);
    }

    int[] toArray(ArrayList<Integer> list) {
        int res[] = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    Enc encode(int c) {
        Enc e = null;

        if (c <= 0x7F) {
            e = new Enc(1);
            e.bytes[0] = c;
        } else if (c <= 0x7FF) {
            e = new Enc(2);
            e.bytes[0] = 0xC0 + bits(c, 6, 5);
            e.bytes[1] = 0x80 + bits(c, 0, 6);
        } else if (c <= 0xFFFF) {
            e = new Enc(3);
            e.bytes[0] = 0xE0 + bits(c, 12, 4);
            e.bytes[1] = 0x80 + bits(c, 6, 6);
            e.bytes[2] = 0x80 + bits(c, 0, 6);
        } else if (c <= 0x10FFFF) {
            e = new Enc(4);
            e.bytes[0] = 0xF0 + bits(c, 18, 3);
            e.bytes[1] = 0x80 + bits(c, 12, 6);
            e.bytes[2] = 0x80 + bits(c, 6, 6);
            e.bytes[3] = 0x80 + bits(c, 0, 6);
        } else {
            assert false : "invalid unicode character " + c;
        }

        return e;
    }

    int bits(int value, int fst, int num) {
        return (value >> fst) % (1 << num);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Enc {
        public final int len;
        public final int[] bytes;

        public Enc(int len) {
            this.len   = len;
            this.bytes = new int[4];
        }

        public boolean valid(int[] a, int k) {
            for (int i = 0; i < k; i++) {
                if (bytes[i] != a[i]) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            StringBuffer b = new StringBuffer();
            for (int i = 0; i < len; i++) {
                b.append(bytes[i]);
                if (i < len - 1) { b.append(','); }
            }
            return b.toString();
        }
    }
}
