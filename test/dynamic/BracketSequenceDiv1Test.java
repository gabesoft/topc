package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class BracketSequenceDiv1Test {
    BracketSequenceDiv1 bracketsequencediv1 = new BracketSequenceDiv1();

    @Test
    public void case1() {
        String s = "()[]";
        assertEquals(3L, bracketsequencediv1.count(s));
    }

    @Test
    public void case2() {
        String s = "())";
        assertEquals(2L, bracketsequencediv1.count(s));
    }

    @Test
    public void case3() {
        String s = "()()";
        assertEquals(4L, bracketsequencediv1.count(s));
    }

    @Test
    public void case4() {
        String s = "([)]";
        assertEquals(2L, bracketsequencediv1.count(s));
    }

    @Test
    public void case5() {
        String s = "())[]][]([]()]]()]]]";
        assertEquals(3854L, bracketsequencediv1.count(s));
    }

    @Test
    public void case6() {
        String s = "(((((((((((((((((((())))))))))))))))))))";
        assertEquals(137846528819L, bracketsequencediv1.count(s));
    }

    @Test
    public void case7() {
        String s = "[][][][][][][][][][][][][][][][][][][][]";
        assertEquals(24466267019L, bracketsequencediv1.count(s));
    }

    @Test
    public void case8() {
        String s = "))))))))))))((((((((((((]]]]]]]]]]][[[[";
        assertEquals(0L, bracketsequencediv1.count(s));
    }

    @Test
    public void case9() {
        String s = "()[]()[][]()()[][][]()()()[][]()()()[]()";
        assertEquals(1058874671L, bracketsequencediv1.count(s));
    }

    @Test
    public void case10() {
        String s = "[]()()[][]()()()()()()[][][][][]()[][][]";
        assertEquals(1682926959L, bracketsequencediv1.count(s));
    }

    @Test
    public void case11() {
        String s = "[(]]]][()(][)[[](]][()([(";
        assertEquals(3057L, bracketsequencediv1.count(s));
    }

    @Test
    public void case12() {
        String s = ")]([])]))]]](()";
        assertEquals(47L, bracketsequencediv1.count(s));
    }

    @Test
    public void case13() {
        String s = ")([[[]]((([((](";
        assertEquals(29L, bracketsequencediv1.count(s));
    }

    @Test
    public void case14() {
        String s = "(]([[]([][()]()";
        assertEquals(355L, bracketsequencediv1.count(s));
    }

    @Test
    public void case15() {
        String s = ")((][)[][)[()]]";
        assertEquals(184L, bracketsequencediv1.count(s));
    }

    @Test
    public void case16() {
        String s = "()]([]][]()[)[([)[([))[[](())()[)([([))]";
        assertEquals(22416206L, bracketsequencediv1.count(s));
    }

    @Test
    public void case17() {
        String s = "]]([][]))(][(([][][[)][))](]][)][([([[(]";
        assertEquals(1256040L, bracketsequencediv1.count(s));
    }

    @Test
    public void case18() {
        String s = "(][(][)][][)][[()((]])](])[[)(][([])([[)";
        assertEquals(5724814L, bracketsequencediv1.count(s));
    }

    @Test
    public void case19() {
        String s = "][]((]))([))[]])[((][)(]]]((]][)]))))())";
        assertEquals(16479684L, bracketsequencediv1.count(s));
    }

    @Test
    public void case20() {
        String s = "(]((][(()][)[([[)([)])])]])](]([)]()(][(";
        assertEquals(4178817L, bracketsequencediv1.count(s));
    }

    @Test
    public void case21() {
        String s = "([([([([([([([([([([([([([([([([([([([([";
        assertEquals(0L, bracketsequencediv1.count(s));
    }

    @Test
    public void case22() {
        String s = "()()()()()()()()()()()()()()()()()()()()";
        assertEquals(24466267019L, bracketsequencediv1.count(s));
    }

    @Test
    public void case23() {
        String s = "[([([([([([([([([([([([([([([([([([([([(";
        assertEquals(0L, bracketsequencediv1.count(s));
    }

    @Test
    public void case24() {
        String s = "([([([(((([([([([[[[]]]]]])]]])))]))))))";
        assertEquals(873535479L, bracketsequencediv1.count(s));
    }

    @Test
    public void case25() {
        String s = "([([([([([([([([([([])])])])])])])])])])";
        assertEquals(506376221L, bracketsequencediv1.count(s));
    }

    @Test
    public void case26() {
        String s = "((((((((((((((((((((((((((((((((((((((((";
        assertEquals(0L, bracketsequencediv1.count(s));
    }

}
