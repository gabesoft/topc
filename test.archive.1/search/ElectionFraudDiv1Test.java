package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class ElectionFraudDiv1Test {
    ElectionFraudDiv1 electionfrauddiv1 = new ElectionFraudDiv1();

    @Test
    public void case1() {
        int[] percentages = { 33, 33, 33 };
        assertEquals(3, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case2() {
        int[] percentages = { 29, 29, 43 };
        assertEquals(7, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case3() {
        int[] percentages = { 12, 12, 12, 12, 12, 12, 12, 12 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case4() {
        int[] percentages = { 13, 13, 13, 13, 13, 13, 13, 13 };
        assertEquals(8, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case5() {
        int[] percentages = { 0, 1, 100 };
        assertEquals(200, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case6() {
        int[] percentages = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8, 4 };
        assertEquals(97, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case7() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 34, 34, 34 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case8() {
        int[] percentages = { 100 };
        assertEquals(1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case9() {
        int[] percentages = { 50, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(2, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case10() {
        int[] percentages = { 0, 0, 0, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 33, 0, 0 };
        assertEquals(3, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case11() {
        int[] percentages = { 0, 0, 0, 75, 0, 0, 0, 25, 0, 0, 0, 0, 0 };
        assertEquals(4, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case12() {
        int[] percentages = { 0, 0, 20, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0 };
        assertEquals(5, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case13() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 17, 0, 0, 17, 17, 0, 0, 0, 0, 0, 17, 0, 0, 0, 0, 17, 0, 0, 17, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(6, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case14() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 14, 0, 0, 0, 0, 29, 0, 14, 0, 0, 0, 0, 0, 0, 14 };
        assertEquals(7, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case15() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 13, 0, 0, 25, 13, 0, 0, 13, 0, 13, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(8, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case16() {
        int[] percentages = { 11, 0, 11, 22, 0, 0, 11, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 11, 0, 0, 0, 11, 0, 0, 0, 0, 0 };
        assertEquals(9, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case17() {
        int[] percentages = { 10, 10, 0, 0, 10, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 10, 0, 0, 10, 0, 10, 0, 10, 0, 10, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(10, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case18() {
        int[] percentages = { 0, 9, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 27, 0, 0, 0, 0, 9, 0, 0, 9, 0, 18, 0, 0, 9, 9, 0, 0 };
        assertEquals(11, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case19() {
        int[] percentages = { 13, 6, 0, 6, 13, 6, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 6, 6, 0, 13, 0, 0, 6, 6, 0, 6 };
        assertEquals(16, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case20() {
        int[] percentages = { 6, 6, 6, 6, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 6, 0, 0, 0, 0, 6, 17, 0, 6, 0, 11, 6, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 11, 0, 0, 0, 0 };
        assertEquals(18, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case21() {
        int[] percentages = { 19, 5, 5, 24, 5, 5, 5, 19, 10, 5 };
        assertEquals(21, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case22() {
        int[] percentages = { 8, 4, 4, 4, 8, 4, 4, 4, 0, 0, 4, 8, 4, 16, 0, 12, 8, 4, 4 };
        assertEquals(25, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case23() {
        int[] percentages = { 11, 0, 0, 4, 0, 0, 0, 4, 0, 4, 4, 4, 0, 4, 0, 4, 0, 0, 4, 0, 4, 4, 0, 0, 0, 0, 4, 4, 0, 7, 7, 0, 4, 0, 4, 0, 7, 0, 4, 0, 0, 4, 7 };
        assertEquals(27, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case24() {
        int[] percentages = { 0, 3, 6, 13, 3, 6, 0, 3, 6, 3, 6, 3, 0, 6, 0, 3, 10, 3, 0, 0, 6, 0, 0, 3, 0, 0, 13, 0 };
        assertEquals(31, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case25() {
        int[] percentages = { 19, 22, 22, 22, 16 };
        assertEquals(32, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case26() {
        int[] percentages = { 5, 5, 0, 0, 3, 3, 3, 8, 0, 0, 0, 5, 0, 3, 3, 3, 3, 5, 3, 0, 3, 0, 3, 3, 0, 0, 0, 3, 0, 3, 0, 0, 3, 0, 3, 0, 5, 3, 0, 5, 3, 0, 5, 0, 3, 3, 3, 0 };
        assertEquals(37, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case27() {
        int[] percentages = { 3, 0, 3, 3, 3, 8, 3, 3, 3, 13, 5, 0, 3, 8, 0, 3, 0, 5, 5, 3, 5, 3, 0, 5, 3, 0, 3, 0, 3, 8, 0, 3 };
        assertEquals(39, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case28() {
        int[] percentages = { 0, 2, 7, 12, 14, 2, 5, 7, 5, 2, 2, 2, 2, 5, 5, 2, 7, 5, 5, 7 };
        assertEquals(42, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case29() {
        int[] percentages = { 15, 17, 11, 13, 13, 6, 13, 13 };
        assertEquals(47, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case30() {
        int[] percentages = { 8, 2, 16, 4, 12, 4, 8, 12, 8, 8, 4, 12 };
        assertEquals(49, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case31() {
        int[] percentages = { 0, 0, 6, 6, 0, 2, 0, 4, 4, 6, 0, 6, 2, 2, 2, 0, 6, 2, 4, 6, 6, 8, 2, 6, 6, 2, 4, 2, 10 };
        assertEquals(52, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case32() {
        int[] percentages = { 0, 4, 4, 0, 2, 9, 4, 6, 2, 0, 4, 2, 4, 9, 2, 4, 6, 4, 7, 9, 4, 4, 4, 0, 2, 4, 4 };
        assertEquals(54, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case33() {
        int[] percentages = { 3, 7, 5, 5, 3, 2, 3, 5, 3, 3, 3, 2, 2, 0, 0, 2, 2, 2, 3, 0, 0, 3, 0, 7, 3, 5, 3, 7, 3, 0, 0, 5, 3, 2 };
        assertEquals(58, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case34() {
        int[] percentages = { 0, 2, 0, 0, 5, 5, 2, 2, 7, 3, 0, 2, 2, 2, 2, 2, 5, 3, 3, 0, 3, 0, 0, 0, 5, 5, 3, 3, 3, 2, 3, 2, 2, 2, 2, 2, 3, 2, 2, 0, 0, 0, 3, 2, 5 };
        assertEquals(59, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case35() {
        int[] percentages = { 5, 9, 3, 11, 5, 3, 6, 11, 5, 6, 6, 8, 3, 3, 5, 9, 2 };
        assertEquals(64, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case36() {
        int[] percentages = { 3, 0, 5, 2, 5, 2, 3, 5, 0, 0, 0, 5, 5, 0, 5, 8, 3, 3, 2, 2, 2, 0, 2, 5, 2, 2, 2, 2, 3, 2, 0, 5, 3, 0, 3, 5, 2, 5, 2, 2, 2, 2 };
        assertEquals(65, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case37() {
        int[] percentages = { 1, 0, 0, 4, 4, 0, 4, 3, 4, 1, 4, 3, 3, 4, 1, 4, 0, 3, 1, 3, 1, 3, 1, 3, 4, 6, 7, 6, 0, 0, 3, 1, 1, 4, 3, 3 };
        assertEquals(68, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case38() {
        int[] percentages = { 3, 10, 4, 3, 3, 8, 7, 10, 7, 4, 6, 1, 3, 7, 4, 6, 3, 7, 4 };
        assertEquals(71, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case39() {
        int[] percentages = { 20, 24, 28, 27 };
        assertEquals(74, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case40() {
        int[] percentages = { 8, 4, 3, 1, 1, 1, 1, 5, 4, 1, 4, 5, 5, 0, 1, 6, 5, 0, 4, 1, 1, 3, 3, 4, 1, 1, 4, 5, 9, 6 };
        assertEquals(77, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case41() {
        int[] percentages = { 1, 7, 4, 2, 1, 6, 4, 9, 6, 2, 2, 6, 10, 6, 9, 10, 5, 5, 4 };
        assertEquals(81, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case42() {
        int[] percentages = { 7, 4, 5, 2, 2, 2, 8, 7, 2, 6, 7, 2, 7, 11, 5, 10, 12 };
        assertEquals(84, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case43() {
        int[] percentages = { 6, 8, 6, 8, 7, 7, 6, 4, 2, 8, 9, 4, 2, 6, 9, 9 };
        assertEquals(89, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case44() {
        int[] percentages = { 3, 1, 3, 3, 2, 3, 1, 3, 3, 1, 2, 3, 2, 3, 1, 2, 0, 1, 1, 1, 0, 2, 2, 2, 0, 3, 2, 1, 3, 5, 1, 3, 0, 1, 1, 0, 2, 3, 2, 3, 3, 1, 3, 1, 3, 2, 4, 2 };
        assertEquals(94, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case45() {
        int[] percentages = { 10, 4, 5, 5, 3, 2, 4, 4, 8, 4, 6, 5, 6, 3, 2, 4, 6, 4, 5, 4, 3 };
        assertEquals(97, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case46() {
        int[] percentages = { 4, 2, 3, 4, 2, 9, 6, 6, 3, 5, 2, 4, 5, 5, 9, 5, 5, 3, 5, 6, 5, 1, 3 };
        assertEquals(102, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case47() {
        int[] percentages = { 2, 4, 2, 3, 4, 2, 2, 0, 3, 1, 1, 3, 1, 1, 3, 0, 3, 3, 3, 2, 2, 2, 3, 2, 0, 5, 0, 2, 5, 2, 0, 1, 1, 6, 0, 7, 8, 4, 1, 2, 1, 4, 3, 1 };
        assertEquals(105, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case48() {
        int[] percentages = { 3, 1, 2, 5, 3, 2, 3, 5, 3, 2, 6, 2, 6, 6, 3, 5, 5, 2, 3, 4, 4, 3, 2, 1, 4, 5, 2, 2, 4, 5, 4, 1 };
        assertEquals(108, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case49() {
        int[] percentages = { 2, 2, 4, 2, 1, 2, 1, 3, 2, 2, 2, 4, 1, 0, 2, 3, 1, 3, 1, 5, 3, 1, 0, 2, 1, 2, 2, 3, 3, 1, 1, 2, 2, 1, 3, 3, 3, 3, 4, 3, 3, 2, 3, 2, 4, 4, 4, 4 };
        assertEquals(113, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case50() {
        int[] percentages = { 2, 3, 0, 3, 3, 2, 3, 1, 4, 3, 2, 6, 6, 4, 3, 3, 2, 1, 9, 1, 3, 2, 3, 4, 4, 3, 4, 3, 4, 2, 4, 5, 1, 3, 4 };
        assertEquals(114, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case51() {
        int[] percentages = { 2, 4, 3, 10, 3, 3, 4, 3, 3, 3, 3, 5, 1, 6, 4, 3, 3, 3, 3, 7, 4, 4, 4, 3, 0, 3 };
        assertEquals(115, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case52() {
        int[] percentages = { 11, 26, 21, 15, 16, 9 };
        assertEquals(117, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case53() {
        int[] percentages = { 8, 8, 8, 3, 8, 10, 14, 10, 14, 5, 8 };
        assertEquals(118, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case54() {
        int[] percentages = { 15, 20, 14, 20, 27, 6 };
        assertEquals(123, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case55() {
        int[] percentages = { 16, 20, 27, 20, 19 };
        assertEquals(128, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case56() {
        int[] percentages = { 22, 14, 20, 20, 26 };
        assertEquals(133, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case57() {
        int[] percentages = { 8, 15, 6, 6, 10, 4, 7, 1, 7, 6, 6, 6, 9, 5 };
        assertEquals(139, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case58() {
        int[] percentages = { 26, 16, 18, 21, 21 };
        assertEquals(141, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case59() {
        int[] percentages = { 23, 20, 15, 25, 15 };
        assertEquals(142, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case60() {
        int[] percentages = { 18, 10, 16, 8, 10, 12, 10, 10, 9 };
        assertEquals(146, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case61() {
        int[] percentages = { 11, 28, 16, 13, 19, 15 };
        assertEquals(151, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case62() {
        int[] percentages = { 19, 25, 23, 19, 12 };
        assertEquals(154, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case63() {
        int[] percentages = { 11, 22, 18, 22, 25 };
        assertEquals(157, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case64() {
        int[] percentages = { 18, 19, 16, 23, 26 };
        assertEquals(160, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case65() {
        int[] percentages = { 20, 17, 19, 27, 19 };
        assertEquals(162, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case66() {
        int[] percentages = { 5, 5, 8, 4, 7, 5, 4, 4, 10, 7, 3, 6, 9, 9, 2, 2, 5 };
        assertEquals(164, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case67() {
        int[] percentages = { 7, 8, 8, 13, 9, 7, 10, 15, 7, 7, 6, 7 };
        assertEquals(168, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case68() {
        int[] percentages = { 27, 17, 20, 24, 14 };
        assertEquals(169, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case69() {
        int[] percentages = { 20, 25, 21, 18, 14 };
        assertEquals(173, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case70() {
        int[] percentages = { 20, 18, 23, 27, 14 };
        assertEquals(177, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case71() {
        int[] percentages = { 20, 15, 25, 16, 26 };
        assertEquals(179, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case72() {
        int[] percentages = { 17, 22, 21, 26, 16 };
        assertEquals(180, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case73() {
        int[] percentages = { 15, 24, 25, 20, 14 };
        assertEquals(181, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case74() {
        int[] percentages = { 11, 26, 22, 23, 16 };
        assertEquals(183, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case75() {
        int[] percentages = { 17, 24, 19, 12, 26 };
        assertEquals(185, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case76() {
        int[] percentages = { 10, 9, 11, 12, 11, 18, 14, 18 };
        assertEquals(188, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case77() {
        int[] percentages = { 17, 16, 15, 24, 26 };
        assertEquals(189, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case78() {
        int[] percentages = { 11, 12, 9, 10, 9, 5, 12, 14, 12, 10 };
        assertEquals(198, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case79() {
        int[] percentages = { 22, 16, 20, 27, 17 };
        assertEquals(199, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case80() {
        int[] percentages = { 49, 52 };
        assertEquals(200, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case81() {
        int[] percentages = { 2, 1, 2, 2, 0, 1, 2, 2, 6, 1, 0, 3, 4, 1, 2, 2, 2, 1, 1, 0, 2, 3, 2, 3, 0, 2, 1, 2, 3, 1, 4, 1, 4, 2, 2, 1, 0, 1, 1, 3, 1, 3, 1, 0, 1, 2, 1, 1, 2 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case82() {
        int[] percentages = { 50, 49 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case83() {
        int[] percentages = { 38, 34, 30 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case84() {
        int[] percentages = { 51, 46, 0, 0, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case85() {
        int[] percentages = { 13, 8, 14, 11, 17, 9, 18, 15 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case86() {
        int[] percentages = { 16, 0, 14, 16, 15, 11, 15, 10, 8 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case87() {
        int[] percentages = { 10, 0, 10, 12, 10, 16, 10, 0, 12, 15 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case88() {
        int[] percentages = { 4, 11, 8, 6, 11, 5, 11, 8, 6, 15, 12, 10 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case89() {
        int[] percentages = { 0, 18, 0, 18, 0, 0, 0, 0, 21, 19, 14, 0, 0, 14, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case90() {
        int[] percentages = { 8, 10, 6, 8, 4, 6, 3, 7, 0, 4, 7, 7, 9, 4, 7, 2 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case91() {
        int[] percentages = { 0, 11, 6, 0, 0, 0, 0, 15, 6, 7, 0, 8, 15, 0, 0, 12, 0, 10, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case92() {
        int[] percentages = { 0, 4, 2, 3, 6, 5, 4, 6, 2, 4, 4, 6, 5, 8, 5, 3, 0, 6, 6, 5, 5 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case93() {
        int[] percentages = { 30, 0, 0, 0, 0, 27, 0, 0, 0, 0, 0, 0, 0, 31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case94() {
        int[] percentages = { 0, 0, 0, 7, 8, 8, 4, 5, 5, 7, 0, 0, 5, 4, 0, 5, 5, 0, 8, 0, 8, 6, 11, 9, 4, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case95() {
        int[] percentages = { 0, 6, 8, 0, 5, 0, 0, 7, 7, 0, 0, 0, 4, 4, 0, 10, 7, 8, 0, 6, 0, 0, 12, 7, 5, 0, 7, 6 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case96() {
        int[] percentages = { 0, 0, 9, 0, 0, 0, 0, 0, 11, 0, 0, 18, 12, 8, 12, 0, 0, 8, 7, 0, 0, 0, 0, 11, 0, 10, 0, 0, 0, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case97() {
        int[] percentages = { 0, 0, 13, 0, 0, 0, 0, 0, 0, 7, 10, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 9, 13, 0, 0, 0, 0, 11, 0, 12, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case98() {
        int[] percentages = { 2, 6, 0, 4, 5, 4, 3, 2, 1, 2, 4, 3, 4, 3, 4, 6, 4, 0, 5, 5, 6, 3, 4, 4, 2, 4, 7, 0, 4, 6, 2, 6 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case99() {
        int[] percentages = { 11, 0, 3, 0, 6, 6, 0, 3, 0, 0, 7, 0, 5, 0, 3, 0, 0, 0, 0, 5, 4, 5, 0, 0, 2, 5, 0, 4, 0, 0, 7, 6, 0, 0, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case100() {
        int[] percentages = { 0, 0, 0, 0, 0, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 33, 0, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case101() {
        int[] percentages = { 2, 2, 2, 2, 3, 3, 3, 4, 1, 2, 3, 3, 2, 4, 2, 3, 4, 3, 2, 2, 2, 2, 1, 0, 2, 2, 1, 2, 1, 3, 2, 2, 0, 1, 3, 2, 3 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case102() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 0, 12, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 15, 4, 0, 11, 0, 0, 0, 0, 12, 0, 0, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case103() {
        int[] percentages = { 0, 2, 0, 4, 0, 0, 0, 0, 5, 0, 2, 6, 3, 0, 0, 3, 4, 2, 5, 8, 8, 0, 4, 0, 0, 0, 9, 6, 5, 0, 6, 0, 5, 4, 0, 0, 0, 8, 4, 6, 3 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case104() {
        int[] percentages = { 2, 1, 3, 5, 0, 1, 2, 2, 3, 1, 2, 1, 3, 1, 1, 1, 1, 3, 2, 1, 0, 3, 2, 3, 1, 2, 0, 4, 2, 2, 2, 3, 2, 0, 0, 2, 2, 4, 2, 1, 2, 1, 2 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case105() {
        int[] percentages = { 2, 1, 3, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 4, 2, 1, 2, 2, 1, 1, 2, 2, 2, 1, 2, 2, 2, 1, 3, 1, 2, 2, 2, 1, 3, 1, 3, 2, 2, 1, 2, 1, 1, 1, 1 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case106() {
        int[] percentages = { 0, 4, 2, 0, 0, 2, 3, 0, 4, 5, 0, 0, 0, 0, 0, 2, 2, 0, 1, 3, 0, 0, 3, 4, 0, 0, 4, 0, 0, 4, 6, 3, 2, 3, 0, 0, 2, 0, 0, 1, 2, 5, 2, 0, 3, 2, 0, 2 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case107() {
        int[] percentages = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case108() {
        int[] percentages = { 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case109() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case110() {
        int[] percentages = { 1, 7, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1, 7, 1, 1, 5, 27 };
        assertEquals(92, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case111() {
        int[] percentages = { 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case112() {
        int[] percentages = { 0, 0, 0, 20, 11, 7, 28, 5, 6, 27 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case113() {
        int[] percentages = { 49, 51 };
        assertEquals(35, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case114() {
        int[] percentages = { 0, 1, 98 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case115() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 74 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case116() {
        int[] percentages = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        assertEquals(121, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case117() {
        int[] percentages = { 0, 0, 100 };
        assertEquals(1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case118() {
        int[] percentages = { 100 };
        assertEquals(1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case119() {
        int[] percentages = { 100, 2, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case120() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 76 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case121() {
        int[] percentages = { 76, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case122() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 93 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case123() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 98 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case124() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 100 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case125() {
        int[] percentages = { 0, 0, 99 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case126() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 10, 2, 17, 5, 1, 19, 9, 18, 10 };
        assertEquals(172, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case127() {
        int[] percentages = { 0, 0, 0, 2, 100 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case128() {
        int[] percentages = { 85, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case129() {
        int[] percentages = { 12, 12, 12, 12, 12, 12, 12, 12 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case130() {
        int[] percentages = { 0, 0, 0, 0, 51, 51 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case131() {
        int[] percentages = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case132() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 100 };
        assertEquals(1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case133() {
        int[] percentages = { 0, 0, 1, 3, 10, 7, 63, 0, 0, 20 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case134() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 99 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case135() {
        int[] percentages = { 0, 0, 51, 51 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case136() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case137() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 99 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case138() {
        int[] percentages = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case139() {
        int[] percentages = { 0, 26, 26, 50 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case140() {
        int[] percentages = { 0, 1, 100 };
        assertEquals(200, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case141() {
        int[] percentages = { 50, 50, 50 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case142() {
        int[] percentages = { 3, 0, 3, 1, 1, 3, 4, 2, 4, 2, 4, 3, 1, 1, 0, 0, 4, 0, 0, 4, 1, 2, 4, 0, 2, 3, 1, 1, 2, 1, 1, 0, 0, 1, 3, 3, 0, 1, 2, 0, 0, 1, 3, 1, 4, 2, 4, 3, 1, 0 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case143() {
        int[] percentages = { 0, 0, 0, 26, 6, 12, 7, 23, 20, 4 };
        assertEquals(137, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case144() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 100 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case145() {
        int[] percentages = { 0, 100 };
        assertEquals(1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case146() {
        int[] percentages = { 12, 13, 13, 13, 13, 13, 13, 13 };
        assertEquals(95, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case147() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 6, 6, 17, 18, 46 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case148() {
        int[] percentages = { 55, 44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case149() {
        int[] percentages = { 51, 8, 24, 6, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(85, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case150() {
        int[] percentages = { 22, 1, 6, 5, 28, 18, 17 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case151() {
        int[] percentages = { 0, 0, 2, 100 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case152() {
        int[] percentages = { 0, 0, 0, 0, 2, 100 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case153() {
        int[] percentages = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        assertEquals(200, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case154() {
        int[] percentages = { 0, 0, 51, 51, 0, 0, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case155() {
        int[] percentages = { 100, 2, 0, 0, 0, 0, 0, 0 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case156() {
        int[] percentages = { 13, 11, 8, 6, 14, 11, 10, 8, 5, 10 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case157() {
        int[] percentages = { 0, 0, 0, 54, 48 };
        assertEquals(-1, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case158() {
        int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 79, 0, 0, 0 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case159() {
        int[] percentages = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

    @Test
    public void case160() {
        int[] percentages = { 0, 0, 0, 0, 0, 98 };
        assertEquals(201, electionfrauddiv1.MinimumVoters(percentages));
    }

}
