package topc.stringm;

import java.util.Arrays;

// SRM 541 Division II Level One - 250
// string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11889&rd=14733
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+541
public class AkariDaisukiDiv2 {
    public int countTuples(String S) {
        int n = S.length();
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        String s2 = S.substring(i, j);
                        String s4 = S.substring(k, l);
                        if (s2.equals(s4)) {
                            cnt++;
                        }
                    }
                }
            }
        }

        return cnt;
    }

    @SuppressWarnings("unused")
	private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
