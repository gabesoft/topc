package topc.easy;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class BreedingLikeRabbits {
    public static String answer(String str_S) {
        java.util.HashMap<java.math.BigInteger, java.math.BigInteger> map = new java.util.HashMap<java.math.BigInteger, java.math.BigInteger>();

        java.math.BigInteger val = new java.math.BigInteger(str_S);
        java.math.BigInteger res = search(map, val, false);

        if (res == null) {
            res = search(map, val, true);
        }

        return (res == null) ? "None" : res.toString(10);
    }

    private static java.math.BigInteger search(java.util.HashMap<java.math.BigInteger, java.math.BigInteger> map, java.math.BigInteger target, boolean even) {
        java.math.BigInteger two = java.math.BigInteger.valueOf(2);
        java.math.BigInteger one = java.math.BigInteger.ONE;
        java.math.BigInteger lo = even ? java.math.BigInteger.ZERO : java.math.BigInteger.ONE;
        java.math.BigInteger hi = target.multiply(java.math.BigInteger.TEN);

        if ((even && !isEven(hi)) || (!even && isEven(hi))) {
            hi = hi.add(one);
        }

        int count = 0;

        while (lo.compareTo(hi) < 0 && count++ < 100) {
            java.math.BigInteger mid = lo.add(hi.subtract(lo).divide(two));

            if ((even && !isEven(mid)) || (!even && isEven(mid))) {
                mid = mid.add(one);
            }

            java.math.BigInteger next = R(map, mid);

            if (next.compareTo(target) == 0) {
                return mid;
            } else if (next.compareTo(target) < 0) {
                lo = mid;
            } else {
                hi = mid.subtract(two);
            }
        }

        return null;
    }

    private static java.math.BigInteger R(java.util.HashMap<java.math.BigInteger, java.math.BigInteger> map,  java.math.BigInteger n) {
        final java.math.BigInteger two = java.math.BigInteger.valueOf(2);
        if (n.compareTo(two) < 0) {
            return java.math.BigInteger.ONE;
        } else if (n.compareTo(two) == 0) {
            return java.math.BigInteger.valueOf(2);
        } else if (map.containsKey(n)) {
            return map.get(n);
        }

        java.math.BigInteger k = n.divide(two);
        java.math.BigInteger result = java.math.BigInteger.ZERO;
        boolean even = isEven(n);

        if (even) {
            result = result.add(R(map, k));
            result = result.add(R(map, k.add(java.math.BigInteger.ONE)));
            result = result.add(k);
        } else {
            result = result.add(R(map, k.subtract(java.math.BigInteger.ONE)));
            result = result.add(R(map, k));
            result = result.add(java.math.BigInteger.ONE);
        }

        map.put(n, result);
        return result;
    }

    private static boolean isEven(java.math.BigInteger n) {
        return n.getLowestSetBit() != 0;
    }

    @SuppressWarnings("unused")
    private static void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
