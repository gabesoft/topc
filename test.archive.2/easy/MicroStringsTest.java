package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class MicroStringsTest {
    MicroStrings microstrings = new MicroStrings();

    @Test
    public void case1() {
        int A = 12;
        int D = 5;
        assertEquals("1272", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case2() {
        int A = 3;
        int D = 2;
        assertEquals("31", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case3() {
        int A = 31;
        int D = 40;
        assertEquals("31", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case4() {
        int A = 30;
        int D = 6;
        assertEquals("3024181260", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case5() {
        int A = 1;
        int D = 1;
        assertEquals("10", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case6() {
        int A = 1;
        int D = 2;
        assertEquals("1", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case7() {
        int A = 2;
        int D = 1;
        assertEquals("210", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case8() {
        int A = 2;
        int D = 2;
        assertEquals("20", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case9() {
        int A = 2;
        int D = 3;
        assertEquals("2", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case10() {
        int A = 3;
        int D = 1;
        assertEquals("3210", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case11() {
        int A = 3;
        int D = 3;
        assertEquals("30", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case12() {
        int A = 3;
        int D = 4;
        assertEquals("3", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case13() {
        int A = 4;
        int D = 1;
        assertEquals("43210", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case14() {
        int A = 4;
        int D = 2;
        assertEquals("420", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case15() {
        int A = 4;
        int D = 3;
        assertEquals("41", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case16() {
        int A = 4;
        int D = 4;
        assertEquals("40", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case17() {
        int A = 4;
        int D = 5;
        assertEquals("4", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case18() {
        int A = 5;
        int D = 1;
        assertEquals("543210", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case19() {
        int A = 10;
        int D = 1;
        assertEquals("109876543210", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case20() {
        int A = 10;
        int D = 2;
        assertEquals("1086420", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case21() {
        int A = 10;
        int D = 3;
        assertEquals("10741", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case22() {
        int A = 10;
        int D = 4;
        assertEquals("1062", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case23() {
        int A = 10;
        int D = 5;
        assertEquals("1050", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case24() {
        int A = 10;
        int D = 6;
        assertEquals("104", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case25() {
        int A = 10;
        int D = 7;
        assertEquals("103", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case26() {
        int A = 10;
        int D = 8;
        assertEquals("102", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case27() {
        int A = 10;
        int D = 9;
        assertEquals("101", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case28() {
        int A = 10;
        int D = 10;
        assertEquals("100", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case29() {
        int A = 10;
        int D = 11;
        assertEquals("10", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case30() {
        int A = 99;
        int D = 8;
        assertEquals("9991837567595143352719113", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case31() {
        int A = 99;
        int D = 9;
        assertEquals("9990817263544536271890", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case32() {
        int A = 99;
        int D = 10;
        assertEquals("9989796959493929199", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case33() {
        int A = 99;
        int D = 11;
        assertEquals("9988776655443322110", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case34() {
        int A = 99;
        int D = 12;
        assertEquals("99877563513927153", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case35() {
        int A = 99;
        int D = 1;
        assertEquals("9998979695949392919089888786858483828180797877767574737271706968676665646362616059585756555453525150494847464544434241403938373635343332313029282726252423222120191817161514131211109876543210", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case36() {
        int A = 100;
        int D = 9;
        assertEquals("100918273645546372819101", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case37() {
        int A = 100;
        int D = 10;
        assertEquals("1009080706050403020100", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case38() {
        int A = 100;
        int D = 11;
        assertEquals("10089786756453423121", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case39() {
        int A = 100;
        int D = 19;
        assertEquals("100816243245", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case40() {
        int A = 100;
        int D = 20;
        assertEquals("100806040200", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case41() {
        int A = 100;
        int D = 21;
        assertEquals("10079583716", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case42() {
        int A = 100;
        int D = 24;
        assertEquals("1007652284", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case43() {
        int A = 100;
        int D = 25;
        assertEquals("1007550250", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case44() {
        int A = 100;
        int D = 26;
        assertEquals("100744822", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case45() {
        int A = 100;
        int D = 49;
        assertEquals("100512", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case46() {
        int A = 100;
        int D = 50;
        assertEquals("100500", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case47() {
        int A = 100;
        int D = 51;
        assertEquals("10049", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case48() {
        int A = 100;
        int D = 100;
        assertEquals("1000", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case49() {
        int A = 200;
        int D = 1;
        assertEquals("2001991981971961951941931921911901891881871861851841831821811801791781771761751741731721711701691681671661651641631621611601591581571561551541531521511501491481471461451441431421411401391381371361351341331321311301291281271261251241231221211201191181171161151141131121111101091081071061051041031021011009998979695949392919089888786858483828180797877767574737271706968676665646362616059585756555453525150494847464544434241403938373635343332313029282726252423222120191817161514131211109876543210", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case50() {
        int A = 200;
        int D = 2;
        assertEquals("20019819619419219018818618418218017817617417217016816616416216015815615415215014814614414214013813613413213012812612412212011811611411211010810610410210098969492908886848280787674727068666462605856545250484644424038363432302826242220181614121086420", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case51() {
        int A = 200;
        int D = 3;
        assertEquals("200197194191188185182179176173170167164161158155152149146143140137134131128125122119116113110107104101989592898683807774716865625956535047444138353229262320171411852", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case52() {
        int A = 200;
        int D = 99;
        assertEquals("2001012", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case53() {
        int A = 200;
        int D = 100;
        assertEquals("2001000", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case54() {
        int A = 200;
        int D = 101;
        assertEquals("20099", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case55() {
        int A = 200;
        int D = 199;
        assertEquals("2001", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case56() {
        int A = 200;
        int D = 200;
        assertEquals("2000", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case57() {
        int A = 1;
        int D = 100;
        assertEquals("1", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case58() {
        int A = 20;
        int D = 10;
        assertEquals("20100", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case59() {
        int A = 12;
        int D = 30;
        assertEquals("12", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case60() {
        int A = 50;
        int D = 1;
        assertEquals("50494847464544434241403938373635343332313029282726252423222120191817161514131211109876543210", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case61() {
        int A = 5;
        int D = 5;
        assertEquals("50", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case62() {
        int A = 5;
        int D = 2;
        assertEquals("531", microstrings.makeMicroString(A, D));
    }

    @Test
    public void case63() {
        int A = 6;
        int D = 6;
        assertEquals("60", microstrings.makeMicroString(A, D));
    }

}
