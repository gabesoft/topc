package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TheQuestionsAndAnswersDivOneTest {
    TheQuestionsAndAnswersDivOne thequestionsandanswersdivone = new TheQuestionsAndAnswersDivOne();

    @Test
    public void case1() {
        int questions = 2;
        String[] answers = { "No", "Yes" };
        assertEquals(2, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case2() {
        int questions = 2;
        String[] answers = { "No", "No", "No" };
        assertEquals(6, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case3() {
        int questions = 3;
        String[] answers = { "Yes", "No", "No", "Yes" };
        assertEquals(12, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case4() {
        int questions = 3;
        String[] answers = { "Yes", "Yes", "Yes", "No" };
        assertEquals(18, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case5() {
        int questions = 6;
        String[] answers = { "No", "Yes", "Yes", "Yes", "Yes", "No", "No", "Yes" };
        assertEquals(40320, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case6() {
        int questions = 6;
        String[] answers = { "Yes", "No", "No", "Yes", "No", "Yes" };
        assertEquals(720, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case7() {
        int questions = 4;
        String[] answers = { "Yes", "No", "Yes", "No", "Yes", "Yes", "Yes", "No" };
        assertEquals(1704, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case8() {
        int questions = 5;
        String[] answers = { "No", "Yes", "No", "No", "No", "No", "Yes" };
        assertEquals(4200, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case9() {
        int questions = 5;
        String[] answers = { "No", "No", "No", "Yes", "No", "No", "Yes" };
        assertEquals(4200, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case10() {
        int questions = 6;
        String[] answers = { "Yes", "Yes", "Yes", "No", "No", "Yes", "No", "No", "No" };
        assertEquals(169920, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case11() {
        int questions = 5;
        String[] answers = { "No", "Yes", "Yes", "Yes", "No", "No", "No", "No", "Yes" };
        assertEquals(33120, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case12() {
        int questions = 8;
        String[] answers = { "No", "No", "No", "No", "Yes", "No", "Yes", "No", "Yes" };
        assertEquals(725760, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case13() {
        int questions = 5;
        String[] answers = { "Yes", "No", "No", "No", "No", "No" };
        assertEquals(1200, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case14() {
        int questions = 5;
        String[] answers = { "No", "Yes", "Yes", "No", "No" };
        assertEquals(120, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case15() {
        int questions = 6;
        String[] answers = { "No", "No", "No", "No", "No", "Yes", "No" };
        assertEquals(10800, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case16() {
        int questions = 6;
        String[] answers = { "No", "Yes", "No", "Yes", "No", "No", "Yes", "No", "No" };
        assertEquals(216000, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case17() {
        int questions = 5;
        String[] answers = { "No", "No", "Yes", "No", "Yes", "No", "No" };
        assertEquals(4200, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case18() {
        int questions = 6;
        String[] answers = { "Yes", "No", "No", "No", "No", "No", "No", "No" };
        assertEquals(100800, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case19() {
        int questions = 5;
        String[] answers = { "No", "No", "Yes", "No", "No", "Yes", "No", "Yes", "No" };
        assertEquals(43920, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case20() {
        int questions = 9;
        String[] answers = { "No", "Yes", "Yes", "No", "Yes", "No", "Yes", "No", "Yes" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case21() {
        int questions = 3;
        String[] answers = { "Yes", "Yes", "No", "Yes", "Yes" };
        assertEquals(42, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case22() {
        int questions = 2;
        String[] answers = { "Yes", "Yes", "No", "No", "Yes" };
        assertEquals(2, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case23() {
        int questions = 3;
        String[] answers = { "Yes", "Yes", "No", "No", "Yes", "Yes", "Yes", "No", "Yes" };
        assertEquals(204, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case24() {
        int questions = 2;
        String[] answers = { "Yes", "Yes", "No", "Yes", "No", "Yes", "Yes" };
        assertEquals(2, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case25() {
        int questions = 2;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(126, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case26() {
        int questions = 5;
        String[] answers = { "Yes", "Yes", "No", "Yes", "Yes", "No", "Yes" };
        assertEquals(4200, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case27() {
        int questions = 4;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "No" };
        assertEquals(144, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case28() {
        int questions = 2;
        String[] answers = { "Yes", "No", "Yes", "Yes", "Yes" };
        assertEquals(2, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case29() {
        int questions = 2;
        String[] answers = { "Yes", "No", "Yes", "Yes", "Yes" };
        assertEquals(2, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case30() {
        int questions = 5;
        String[] answers = { "Yes", "Yes", "No", "Yes", "Yes", "Yes" };
        assertEquals(1200, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case31() {
        int questions = 8;
        String[] answers = { "No", "Yes", "No", "No", "No", "No", "Yes", "Yes", "No" };
        assertEquals(725760, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case32() {
        int questions = 9;
        String[] answers = { "Yes", "Yes", "Yes", "No", "Yes", "Yes", "No", "No", "No" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case33() {
        int questions = 8;
        String[] answers = { "No", "Yes", "No", "Yes", "No", "Yes", "No", "No", "Yes" };
        assertEquals(645120, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case34() {
        int questions = 7;
        String[] answers = { "Yes", "No", "No", "Yes", "Yes", "No", "No", "No", "Yes" };
        assertEquals(463680, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case35() {
        int questions = 7;
        String[] answers = { "Yes", "Yes", "Yes", "No", "Yes", "Yes", "No", "Yes", "No" };
        assertEquals(559440, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case36() {
        int questions = 9;
        String[] answers = { "No", "Yes", "Yes", "No", "Yes", "No", "No", "Yes", "Yes" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case37() {
        int questions = 7;
        String[] answers = { "No", "No", "No", "Yes", "No", "No", "Yes", "Yes", "Yes" };
        assertEquals(463680, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case38() {
        int questions = 9;
        String[] answers = { "Yes", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case39() {
        int questions = 7;
        String[] answers = { "No", "No", "Yes", "Yes", "Yes", "No", "No", "Yes", "No" };
        assertEquals(463680, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case40() {
        int questions = 7;
        String[] answers = { "No", "No", "Yes", "No", "No", "No", "No", "Yes", "No" };
        assertEquals(811440, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case41() {
        int questions = 8;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(40320, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case42() {
        int questions = 7;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(2328480, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case43() {
        int questions = 7;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(141120, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case44() {
        int questions = 9;
        String[] answers = { "No", "No", "No", "No", "No", "No", "No", "No", "No" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case45() {
        int questions = 9;
        String[] answers = { "No", "Yes", "No", "No", "No", "No", "Yes", "Yes", "No" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case46() {
        int questions = 2;
        String[] answers = { "No", "Yes", "No", "No", "No", "No", "Yes", "Yes", "No" };
        assertEquals(2, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case47() {
        int questions = 8;
        String[] answers = { "No", "Yes", "No", "No", "No", "No", "Yes", "Yes", "No" };
        assertEquals(725760, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case48() {
        int questions = 9;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case49() {
        int questions = 9;
        String[] answers = { "No", "No", "No", "No", "No", "No", "No", "No", "No" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case50() {
        int questions = 8;
        String[] answers = { "No", "No", "No", "No", "No", "No", "No", "No", "No" };
        assertEquals(1451520, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case51() {
        int questions = 7;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(2328480, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case52() {
        int questions = 9;
        String[] answers = { "No", "Yes", "Yes", "No", "Yes", "No", "Yes", "No", "No" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case53() {
        int questions = 6;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(1905120, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case54() {
        int questions = 7;
        String[] answers = { "No", "No", "No", "No", "No", "No", "No", "No", "No" };
        assertEquals(2328480, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case55() {
        int questions = 2;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "No" };
        assertEquals(2, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case56() {
        int questions = 8;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "No", "No", "No", "No", "No" };
        assertEquals(645120, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case57() {
        int questions = 7;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "No", "No", "Yes", "No", "No" };
        assertEquals(463680, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case58() {
        int questions = 2;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(510, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case59() {
        int questions = 8;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "No", "No", "No", "No" };
        assertEquals(645120, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case60() {
        int questions = 5;
        String[] answers = { "Yes", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes" };
        assertEquals(33120, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case61() {
        int questions = 7;
        String[] answers = { "Yes", "No", "No", "No", "Yes", "No", "No", "Yes", "Yes" };
        assertEquals(463680, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case62() {
        int questions = 9;
        String[] answers = { "Yes", "No", "Yes", "No", "Yes", "Yes", "Yes", "No", "No" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case63() {
        int questions = 6;
        String[] answers = { "Yes", "Yes", "No", "Yes", "No", "Yes", "No", "Yes", "Yes" };
        assertEquals(216000, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case64() {
        int questions = 9;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "No", "No", "No", "Yes" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case65() {
        int questions = 9;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case66() {
        int questions = 5;
        String[] answers = { "Yes", "Yes", "Yes", "No", "No", "No", "No", "Yes" };
        assertEquals(10320, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case67() {
        int questions = 7;
        String[] answers = { "Yes", "Yes", "Yes", "No", "No", "No", "No", "Yes", "No" };
        assertEquals(463680, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case68() {
        int questions = 9;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "No", "No", "No", "No", "No" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case69() {
        int questions = 5;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(834120, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case70() {
        int questions = 4;
        String[] answers = { "No", "Yes", "Yes", "No", "Yes", "Yes", "No", "No", "Yes" };
        assertEquals(3264, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case71() {
        int questions = 7;
        String[] answers = { "Yes", "Yes", "Yes", "No", "Yes", "No", "No", "Yes", "Yes" };
        assertEquals(559440, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case72() {
        int questions = 3;
        String[] answers = { "Yes", "No", "No", "Yes" };
        assertEquals(12, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case73() {
        int questions = 4;
        String[] answers = { "Yes", "No", "No", "No", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(1704, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case74() {
        int questions = 4;
        String[] answers = { "Yes", "Yes", "No", "No", "Yes", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(8736, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case75() {
        int questions = 4;
        String[] answers = { "Yes", "No", "Yes", "Yes", "Yes", "No", "No", "Yes", "No" };
        assertEquals(3264, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case76() {
        int questions = 9;
        String[] answers = { "No", "No", "No", "No", "No", "No", "No", "No", "Yes" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case77() {
        int questions = 9;
        String[] answers = { "No", "Yes", "Yes", "No", "No", "Yes", "No", "Yes", "Yes" };
        assertEquals(362880, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case78() {
        int questions = 6;
        String[] answers = { "No", "Yes", "No", "Yes", "No", "No", "No", "No" };
        assertEquals(57600, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case79() {
        int questions = 8;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes" };
        assertEquals(1451520, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case80() {
        int questions = 4;
        String[] answers = { "No", "No", "No", "No", "No", "No", "No", "No", "Yes" };
        assertEquals(23184, thequestionsandanswersdivone.find(questions, answers));
    }

    @Test
    public void case81() {
        int questions = 7;
        String[] answers = { "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "No", "No" };
        assertEquals(559440, thequestionsandanswersdivone.find(questions, answers));
    }

}
