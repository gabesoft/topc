package topc.easy;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class BreedingLikeRabbits {
    public static String answer(String str_S) {
        HashMap<BigInteger, BigInteger> map = new HashMap<BigInteger, BigInteger>();

        BigInteger val = new BigInteger(str_S);
        BigInteger res = search(map, val, false);

        if (res == null) {
            res = search(map, val, true);
        }

        return (res == null) ? "None" : res.toString(10);
    }

    private static BigInteger search(HashMap<BigInteger, BigInteger> map, BigInteger target, boolean even) {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger one = BigInteger.ONE;
        BigInteger lo = even ? BigInteger.ZERO : BigInteger.ONE;
        BigInteger hi = target.multiply(BigInteger.TEN);

        if ((even && !isEven(hi)) || (!even && isEven(hi))) {
            hi = hi.add(one);
        }

        int count = 0;

        while (lo.compareTo(hi) < 0 && count++ < 100) {
            BigInteger mid = lo.add(hi.subtract(lo).divide(two));

            if ((even && !isEven(mid)) || (!even && isEven(mid))) {
                mid = mid.add(one);
            }

            BigInteger next = R(map, mid);

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

    private static BigInteger R(HashMap<BigInteger, BigInteger> map,  BigInteger n) {
        final BigInteger two = BigInteger.valueOf(2);
        if (n.compareTo(two) < 0) {
            return BigInteger.ONE;
        } else if (n.compareTo(two) == 0) {
            return BigInteger.valueOf(2);
        } else if (map.containsKey(n)) {
            return map.get(n);
        }

        BigInteger k = n.divide(two);
        BigInteger result = BigInteger.ZERO;
        boolean even = isEven(n);

        if (even) {
            result = result.add(R(map, k));
            result = result.add(R(map, k.add(BigInteger.ONE)));
            result = result.add(k);
        } else {
            result = result.add(R(map, k.subtract(BigInteger.ONE)));
            result = result.add(R(map, k));
            result = result.add(BigInteger.ONE);
        }

        map.put(n, result);
        return result;
    }

    private static boolean isEven(BigInteger n) {
        return n.getLowestSetBit() != 0;
    }

    @SuppressWarnings("unused")
    private static void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
