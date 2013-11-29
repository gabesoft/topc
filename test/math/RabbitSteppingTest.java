package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class RabbitSteppingTest {
    double DELTA = 1.0e-09;
    RabbitStepping rabbitstepping = new RabbitStepping();

    @Test
    public void case1() {
        String field = "WRBRW";
        int r = 4;
        assertEquals(0.8, rabbitstepping.getExpected(field, r), DELTA * 0.8);
    }

    @Test
    public void case2() {
        String field = "WWB";
        int r = 2;
        assertEquals(1.3333333333333333, rabbitstepping.getExpected(field, r), DELTA * 1.3333333333333333);
    }

    @Test
    public void case3() {
        String field = "WW";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case4() {
        String field = "BBBBBBBBBB";
        int r = 4;
        assertEquals(0.9523809523809523, rabbitstepping.getExpected(field, r), DELTA * 0.9523809523809523);
    }

    @Test
    public void case5() {
        String field = "RRBRRWRRBRRW";
        int r = 8;
        assertEquals(0.9696969696969697, rabbitstepping.getExpected(field, r), DELTA * 0.9696969696969697);
    }

    @Test
    public void case6() {
        String field = "WB";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case7() {
        String field = "BW";
        int r = 2;
        assertEquals(2.0, rabbitstepping.getExpected(field, r), DELTA * 2.0);
    }

    @Test
    public void case8() {
        String field = "RBR";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case9() {
        String field = "BBB";
        int r = 2;
        assertEquals(1.3333333333333333, rabbitstepping.getExpected(field, r), DELTA * 1.3333333333333333);
    }

    @Test
    public void case10() {
        String field = "BBB";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case11() {
        String field = "WWBR";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case12() {
        String field = "WWRR";
        int r = 2;
        assertEquals(1.3333333333333333, rabbitstepping.getExpected(field, r), DELTA * 1.3333333333333333);
    }

    @Test
    public void case13() {
        String field = "RBRR";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case14() {
        String field = "RBRW";
        int r = 4;
        assertEquals(0.0, rabbitstepping.getExpected(field, r), DELTA);
    }

    @Test
    public void case15() {
        String field = "RBBWB";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case16() {
        String field = "RWWWW";
        int r = 2;
        assertEquals(1.2, rabbitstepping.getExpected(field, r), DELTA * 1.2);
    }

    @Test
    public void case17() {
        String field = "RBRBW";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case18() {
        String field = "WWWWB";
        int r = 4;
        assertEquals(0.8, rabbitstepping.getExpected(field, r), DELTA * 0.8);
    }

    @Test
    public void case19() {
        String field = "RBWRW";
        int r = 5;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case20() {
        String field = "WBRBRR";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case21() {
        String field = "WBBWBW";
        int r = 2;
        assertEquals(1.2, rabbitstepping.getExpected(field, r), DELTA * 1.2);
    }

    @Test
    public void case22() {
        String field = "RBRRBB";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case23() {
        String field = "BBWWWB";
        int r = 4;
        assertEquals(0.8, rabbitstepping.getExpected(field, r), DELTA * 0.8);
    }

    @Test
    public void case24() {
        String field = "WRRWRW";
        int r = 5;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case25() {
        String field = "WRRRBW";
        int r = 6;
        assertEquals(2.0, rabbitstepping.getExpected(field, r), DELTA * 2.0);
    }

    @Test
    public void case26() {
        String field = "WWWWWWWWWWWRRRRR";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case27() {
        String field = "RRRRRRRRRRRRRRRR";
        int r = 2;
        assertEquals(1.0666666666666667, rabbitstepping.getExpected(field, r), DELTA * 1.0666666666666667);
    }

    @Test
    public void case28() {
        String field = "BBBBBBBBRRRRRRRR";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case29() {
        String field = "WWWWWWWWWWWWBBBB";
        int r = 4;
        assertEquals(0.9846153846153847, rabbitstepping.getExpected(field, r), DELTA * 0.9846153846153847);
    }

    @Test
    public void case30() {
        String field = "BBWWWWWWWWWWWWWW";
        int r = 5;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case31() {
        String field = "WWWWWWWWWWWWWWWW";
        int r = 6;
        assertEquals(1.006993006993007, rabbitstepping.getExpected(field, r), DELTA * 1.006993006993007);
    }

    @Test
    public void case32() {
        String field = "BBBBBBBBBBBBBBBB";
        int r = 7;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case33() {
        String field = "RRRRRRRRRRRRRRRR";
        int r = 8;
        assertEquals(0.9945609945609946, rabbitstepping.getExpected(field, r), DELTA * 0.9945609945609946);
    }

    @Test
    public void case34() {
        String field = "BBBBBBBBBBBBBRRR";
        int r = 9;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case35() {
        String field = "BBBBBBBBBBBBBBBB";
        int r = 10;
        assertEquals(1.006993006993007, rabbitstepping.getExpected(field, r), DELTA * 1.006993006993007);
    }

    @Test
    public void case36() {
        String field = "RRRRRRRRRRRRRRRR";
        int r = 11;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case37() {
        String field = "WWWWWWWWWWWWBBBB";
        int r = 12;
        assertEquals(0.9846153846153847, rabbitstepping.getExpected(field, r), DELTA * 0.9846153846153847);
    }

    @Test
    public void case38() {
        String field = "BBBBBBBBBRRRRRRR";
        int r = 13;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case39() {
        String field = "RRRRRRRRRRRRWWWW";
        int r = 14;
        assertEquals(1.0666666666666667, rabbitstepping.getExpected(field, r), DELTA * 1.0666666666666667);
    }

    @Test
    public void case40() {
        String field = "BBBBBBWWWWWWWWWW";
        int r = 15;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case41() {
        String field = "RRRRWWWWWWWWWWWW";
        int r = 16;
        assertEquals(0.0, rabbitstepping.getExpected(field, r), DELTA);
    }

    @Test
    public void case42() {
        String field = "BBBBBBBBBBBBBBBBB";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case43() {
        String field = "WWWWWWWWWWBBBBBBB";
        int r = 2;
        assertEquals(1.0588235294117647, rabbitstepping.getExpected(field, r), DELTA * 1.0588235294117647);
    }

    @Test
    public void case44() {
        String field = "BBBBBBBBBBBBBBBBB";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case45() {
        String field = "BBBBBBBBBBBBBBBBB";
        int r = 4;
        assertEquals(0.9882352941176471, rabbitstepping.getExpected(field, r), DELTA * 0.9882352941176471);
    }

    @Test
    public void case46() {
        String field = "BBBBBBBBBBBBRRRRR";
        int r = 5;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case47() {
        String field = "WWWWWWWWWWWWWWWWW";
        int r = 6;
        assertEquals(1.004524886877828, rabbitstepping.getExpected(field, r), DELTA * 1.004524886877828);
    }

    @Test
    public void case48() {
        String field = "RRRRRRRRRRRRRRRRR";
        int r = 7;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case49() {
        String field = "RRRRRRRBBBBBBBBBB";
        int r = 8;
        assertEquals(0.9971205265322912, rabbitstepping.getExpected(field, r), DELTA * 0.9971205265322912);
    }

    @Test
    public void case50() {
        String field = "BBBBBBBBBBBRRRRRR";
        int r = 9;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case51() {
        String field = "WWWWWWWWWWWWWWWWW";
        int r = 10;
        assertEquals(1.0028794734677087, rabbitstepping.getExpected(field, r), DELTA * 1.0028794734677087);
    }

    @Test
    public void case52() {
        String field = "RRRRRRBBBBBBBBBBB";
        int r = 11;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case53() {
        String field = "BBBBBBBBBBBBBBBBB";
        int r = 12;
        assertEquals(0.995475113122172, rabbitstepping.getExpected(field, r), DELTA * 0.995475113122172);
    }

    @Test
    public void case54() {
        String field = "RRBBBBBBBBBBBBBBB";
        int r = 13;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case55() {
        String field = "RRRRRRRRRRRWWWWWW";
        int r = 14;
        assertEquals(1.011764705882353, rabbitstepping.getExpected(field, r), DELTA * 1.011764705882353);
    }

    @Test
    public void case56() {
        String field = "RRRRRRRRRRRRRRRRR";
        int r = 15;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case57() {
        String field = "BBBBRRRRRRRRRRRRR";
        int r = 16;
        assertEquals(0.9411764705882353, rabbitstepping.getExpected(field, r), DELTA * 0.9411764705882353);
    }

    @Test
    public void case58() {
        String field = "WWWWWWWWWWWWWWWWW";
        int r = 17;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case59() {
        String field = "RWRR";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case60() {
        String field = "RRBWB";
        int r = 2;
        assertEquals(1.2, rabbitstepping.getExpected(field, r), DELTA * 1.2);
    }

    @Test
    public void case61() {
        String field = "BBBWRRBWWWB";
        int r = 8;
        assertEquals(0.9696969696969697, rabbitstepping.getExpected(field, r), DELTA * 0.9696969696969697);
    }

    @Test
    public void case62() {
        String field = "RBWRWWR";
        int r = 7;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case63() {
        String field = "BBB";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case64() {
        String field = "RBR";
        int r = 2;
        assertEquals(1.3333333333333333, rabbitstepping.getExpected(field, r), DELTA * 1.3333333333333333);
    }

    @Test
    public void case65() {
        String field = "RBWWW";
        int r = 5;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case66() {
        String field = "WBR";
        int r = 2;
        assertEquals(1.3333333333333333, rabbitstepping.getExpected(field, r), DELTA * 1.3333333333333333);
    }

    @Test
    public void case67() {
        String field = "WWBBR";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case68() {
        String field = "BWBRRWBRBW";
        int r = 9;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case69() {
        String field = "WWWBRRW";
        int r = 5;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case70() {
        String field = "RRRWW";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case71() {
        String field = "RWRRRWB";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case72() {
        String field = "BBRWBBWRR";
        int r = 4;
        assertEquals(0.9523809523809523, rabbitstepping.getExpected(field, r), DELTA * 0.9523809523809523);
    }

    @Test
    public void case73() {
        String field = "RW";
        int r = 2;
        assertEquals(2.0, rabbitstepping.getExpected(field, r), DELTA * 2.0);
    }

    @Test
    public void case74() {
        String field = "RRWR";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case75() {
        String field = "RWB";
        int r = 2;
        assertEquals(1.3333333333333333, rabbitstepping.getExpected(field, r), DELTA * 1.3333333333333333);
    }

    @Test
    public void case76() {
        String field = "RRRWBRWRRRW";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case77() {
        String field = "BBBWRWBWBRR";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case78() {
        String field = "RR";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case79() {
        String field = "RWWRWBR";
        int r = 2;
        assertEquals(1.1428571428571428, rabbitstepping.getExpected(field, r), DELTA * 1.1428571428571428);
    }

    @Test
    public void case80() {
        String field = "RRRWRBBB";
        int r = 8;
        assertEquals(0.0, rabbitstepping.getExpected(field, r), DELTA);
    }

    @Test
    public void case81() {
        String field = "BRWRWRBWBB";
        int r = 9;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case82() {
        String field = "RW";
        int r = 2;
        assertEquals(2.0, rabbitstepping.getExpected(field, r), DELTA * 2.0);
    }

    @Test
    public void case83() {
        String field = "WRRRRRRBRWWW";
        int r = 6;
        assertEquals(1.0216450216450217, rabbitstepping.getExpected(field, r), DELTA * 1.0216450216450217);
    }

    @Test
    public void case84() {
        String field = "BRBBWB";
        int r = 5;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case85() {
        String field = "BWBWWBR";
        int r = 4;
        assertEquals(0.9142857142857143, rabbitstepping.getExpected(field, r), DELTA * 0.9142857142857143);
    }

    @Test
    public void case86() {
        String field = "BRWWBWBWWR";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case87() {
        String field = "WBWWBB";
        int r = 4;
        assertEquals(0.8, rabbitstepping.getExpected(field, r), DELTA * 0.8);
    }

    @Test
    public void case88() {
        String field = "RBWBBRRRWRBW";
        int r = 10;
        assertEquals(1.0909090909090908, rabbitstepping.getExpected(field, r), DELTA * 1.0909090909090908);
    }

    @Test
    public void case89() {
        String field = "WRB";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case90() {
        String field = "WWBBRRB";
        int r = 5;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case91() {
        String field = "WRWB";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case92() {
        String field = "WBBWRWWBWW";
        int r = 6;
        assertEquals(1.0476190476190477, rabbitstepping.getExpected(field, r), DELTA * 1.0476190476190477);
    }

    @Test
    public void case93() {
        String field = "BBBBRWBBBWB";
        int r = 10;
        assertEquals(1.0909090909090908, rabbitstepping.getExpected(field, r), DELTA * 1.0909090909090908);
    }

    @Test
    public void case94() {
        String field = "WB";
        int r = 1;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case95() {
        String field = "WWBRRBWR";
        int r = 2;
        assertEquals(1.1428571428571428, rabbitstepping.getExpected(field, r), DELTA * 1.1428571428571428);
    }

    @Test
    public void case96() {
        String field = "WRWRWWR";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case97() {
        String field = "RRWRWBWWBRB";
        int r = 5;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case98() {
        String field = "BBRWWRWBW";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case99() {
        String field = "BBBRWRBBRR";
        int r = 4;
        assertEquals(0.9523809523809523, rabbitstepping.getExpected(field, r), DELTA * 0.9523809523809523);
    }

    @Test
    public void case100() {
        String field = "BWBRWBB";
        int r = 2;
        assertEquals(1.1428571428571428, rabbitstepping.getExpected(field, r), DELTA * 1.1428571428571428);
    }

    @Test
    public void case101() {
        String field = "RRBRRRBWRRBWBWWRR";
        int r = 5;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case102() {
        String field = "RRRRRRRRRRRRRRRRR";
        int r = 8;
        assertEquals(0.9971205265322912, rabbitstepping.getExpected(field, r), DELTA * 0.9971205265322912);
    }

    @Test
    public void case103() {
        String field = "WBRWBRWBRWBRWBRWB";
        int r = 16;
        assertEquals(0.9411764705882353, rabbitstepping.getExpected(field, r), DELTA * 0.9411764705882353);
    }

    @Test
    public void case104() {
        String field = "RRWBRRWRWRRBRBRBR";
        int r = 9;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case105() {
        String field = "RRBRRWRRBRRWRRRRR";
        int r = 8;
        assertEquals(0.9971205265322912, rabbitstepping.getExpected(field, r), DELTA * 0.9971205265322912);
    }

    @Test
    public void case106() {
        String field = "RRBRRRWRRBRRWWW";
        int r = 10;
        assertEquals(1.006993006993007, rabbitstepping.getExpected(field, r), DELTA * 1.006993006993007);
    }

    @Test
    public void case107() {
        String field = "RRRRRRRRRRR";
        int r = 4;
        assertEquals(0.9696969696969697, rabbitstepping.getExpected(field, r), DELTA * 0.9696969696969697);
    }

    @Test
    public void case108() {
        String field = "WWW";
        int r = 3;
        assertEquals(1.0, rabbitstepping.getExpected(field, r), DELTA * 1.0);
    }

    @Test
    public void case109() {
        String field = "BB";
        int r = 2;
        assertEquals(2.0, rabbitstepping.getExpected(field, r), DELTA * 2.0);
    }

}
