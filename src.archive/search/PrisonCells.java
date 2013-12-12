package topc.search;

import java.util.*;
import java.io.*;

// SRM 273 Division II Level Three - 1000
// search, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4526&rd=8070
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm273
public class PrisonCells {
    public int scatter(int m, int n, int nr) {
        if (nr * 2 > m * n + 1) { return 1; }
        if (nr > 4) { return 2; }
        return (m + m + n + n - 4) / nr;
    }
}
