package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class EllysJuiceTest {
    EllysJuice ellysjuice = new EllysJuice();

    @Test
    public void case1() {
        String[] players = { "elly", "kriss", "stancho", "elly", "stancho" };
        assertArrayEquals(new String[] { "elly", "stancho" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case2() {
        String[] players = { "torb", "elly", "stancho", "kriss" };
        assertArrayEquals(new String[] {  }, ellysjuice.getWinners(players));
    }

    @Test
    public void case3() {
        String[] players = { "elly", "elly", "elly", "elly", "elly" };
        assertArrayEquals(new String[] { "elly" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case4() {
        String[] players = { "ariadne", "elly", "ariadne", "stancho", "stancho", "kriss", "stancho", "elly" };
        assertArrayEquals(new String[] { "ariadne", "elly", "stancho" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case5() {
        String[] players = { "elly" };
        assertArrayEquals(new String[] { "elly" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case6() {
        String[] players = { "this", "test", "is", "really", "really", "evil" };
        assertArrayEquals(new String[] { "really" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case7() {
        String[] players = { "kriss", "elly", "kriss", "kriss", "elly", "kriss", "kriss", "kriss" };
        assertArrayEquals(new String[] { "elly", "kriss" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case8() {
        String[] players = { "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaab", "aaaaaaaaaaaaaaaaaaac", "aaaaaaaaaaaaaaaaaaad", "aaaaaaaaaaaaaaaaaaae", "aaaaaaaaaaaaaaaaaaaf", "aaaaaaaaaaaaaaaaaaag", "aaaaaaaaaaaaaaaaaaah" };
        assertArrayEquals(new String[] {  }, ellysjuice.getWinners(players));
    }

    @Test
    public void case9() {
        String[] players = { "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaab", "aaaaaaaaaaaaaaaaaaac", "aaaaaaaaaaaaaaaaaaad", "aaaaaaaaaaaaaaaaaaae", "aaaaaaaaaaaaaaaaaaaf", "aaaaaaaaaaaaaaaaaaag", "aaaaaaaaaaaaaaaaaaaa" };
        assertArrayEquals(new String[] { "aaaaaaaaaaaaaaaaaaaa" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case10() {
        String[] players = { "a", "aa", "aaa", "aaaa", "aaaa", "aaa", "aa", "a" };
        assertArrayEquals(new String[] { "a", "aa", "aaa", "aaaa" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case11() {
        String[] players = { "elly", "elly", "ariadne", "ariadne", "stancho", "stancho", "esprit", "esprit" };
        assertArrayEquals(new String[] { "ariadne", "elly", "esprit", "stancho" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case12() {
        String[] players = { "elly", "ariadne" };
        assertArrayEquals(new String[] {  }, ellysjuice.getWinners(players));
    }

    @Test
    public void case13() {
        String[] players = { "elly", "elly" };
        assertArrayEquals(new String[] { "elly" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case14() {
        String[] players = { "elly", "ariadne", "elly", "ariadne", "elly", "ariadne", "elly", "ariadne" };
        assertArrayEquals(new String[] { "ariadne", "elly" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case15() {
        String[] players = { "a", "b", "c", "a", "b", "c", "d", "nooooooooooooooooooo" };
        assertArrayEquals(new String[] { "a", "b", "c" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case16() {
        String[] players = { "ellie", "ellie", "ellie" };
        assertArrayEquals(new String[] { "ellie" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case17() {
        String[] players = { "torb", "torb", "torb", "torb", "elly", "torb" };
        assertArrayEquals(new String[] { "torb" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case18() {
        String[] players = { "ellie", "topcoder", "topcoder" };
        assertArrayEquals(new String[] { "topcoder" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case19() {
        String[] players = { "torb", "kriss", "esprit" };
        assertArrayEquals(new String[] {  }, ellysjuice.getWinners(players));
    }

    @Test
    public void case20() {
        String[] players = { "elly", "torb", "kriss", "ellie", "topcoder", "elly", "topcoder" };
        assertArrayEquals(new String[] { "elly", "topcoder" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case21() {
        String[] players = { "ellie", "topcoder", "kriss", "kriss", "ellie" };
        assertArrayEquals(new String[] { "ellie", "kriss" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case22() {
        String[] players = { "ellie", "ellie", "topcoder", "elly" };
        assertArrayEquals(new String[] { "ellie" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case23() {
        String[] players = { "topcoder", "torb", "elly" };
        assertArrayEquals(new String[] {  }, ellysjuice.getWinners(players));
    }

    @Test
    public void case24() {
        String[] players = { "esprit", "kriss", "ariadne", "ellie", "ellie", "ellie" };
        assertArrayEquals(new String[] { "ellie" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case25() {
        String[] players = { "torb", "esprit", "ariadne", "stancho", "topcoder", "stancho", "elly" };
        assertArrayEquals(new String[] { "stancho" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case26() {
        String[] players = { "stancho", "ariadne", "torb", "torb", "torb", "torb", "stancho", "ariadne" };
        assertArrayEquals(new String[] { "ariadne", "stancho", "torb" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case27() {
        String[] players = { "topcoder", "torb", "topcoder" };
        assertArrayEquals(new String[] { "topcoder" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case28() {
        String[] players = { "stancho", "torb", "stancho" };
        assertArrayEquals(new String[] { "stancho" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case29() {
        String[] players = { "elly", "kriss", "elly", "elly", "ariadne" };
        assertArrayEquals(new String[] { "elly" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case30() {
        String[] players = { "esprit", "stancho", "ellie" };
        assertArrayEquals(new String[] {  }, ellysjuice.getWinners(players));
    }

    @Test
    public void case31() {
        String[] players = { "ariadne", "ariadne", "esprit", "esprit" };
        assertArrayEquals(new String[] { "ariadne", "esprit" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case32() {
        String[] players = { "esprit", "esprit", "esprit", "ariadne", "esprit" };
        assertArrayEquals(new String[] { "esprit" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case33() {
        String[] players = { "elly", "elly", "torb", "esprit", "topcoder", "kriss", "topcoder", "ellie" };
        assertArrayEquals(new String[] { "elly", "topcoder" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case34() {
        String[] players = { "topcoder", "ellie", "topcoder" };
        assertArrayEquals(new String[] { "topcoder" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case35() {
        String[] players = { "elly", "torb", "elly", "esprit" };
        assertArrayEquals(new String[] { "elly" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case36() {
        String[] players = { "esprit", "topcoder", "topcoder", "esprit", "torb", "esprit", "kriss" };
        assertArrayEquals(new String[] { "esprit", "topcoder" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case37() {
        String[] players = { "ellie", "torb", "esprit", "esprit", "ellie", "torb" };
        assertArrayEquals(new String[] { "ellie", "esprit", "torb" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case38() {
        String[] players = { "elly", "ellie", "elly", "kriss", "ariadne", "elly", "ariadne", "ariadne" };
        assertArrayEquals(new String[] { "ariadne", "elly" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case39() {
        String[] players = { "esprit", "elly", "ellie", "ellie", "esprit", "ellie" };
        assertArrayEquals(new String[] { "ellie", "esprit" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case40() {
        String[] players = { "kriss", "esprit", "esprit", "kriss" };
        assertArrayEquals(new String[] { "esprit", "kriss" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case41() {
        String[] players = { "ariadne", "esprit", "stancho", "stancho", "ariadne", "stancho", "esprit", "elly" };
        assertArrayEquals(new String[] { "ariadne", "esprit", "stancho" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case42() {
        String[] players = { "topcoder", "topcoder", "elly", "topcoder", "stancho", "ariadne", "elly", "esprit" };
        assertArrayEquals(new String[] { "elly", "topcoder" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case43() {
        String[] players = { "elly", "esprit", "esprit" };
        assertArrayEquals(new String[] { "esprit" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case44() {
        String[] players = { "topcoder", "elly", "topcoder", "elly", "ariadne", "ariadne", "elly", "elly" };
        assertArrayEquals(new String[] { "ariadne", "elly", "topcoder" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case45() {
        String[] players = { "torb", "torb", "ariadne", "torb", "esprit", "esprit", "esprit", "ariadne" };
        assertArrayEquals(new String[] { "ariadne", "esprit", "torb" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case46() {
        String[] players = { "elly", "torb", "torb", "torb" };
        assertArrayEquals(new String[] { "torb" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case47() {
        String[] players = { "ellie", "stancho", "ariadne", "topcoder", "ariadne", "ellie" };
        assertArrayEquals(new String[] { "ariadne", "ellie" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case48() {
        String[] players = { "kriss", "esprit", "esprit" };
        assertArrayEquals(new String[] { "esprit" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case49() {
        String[] players = { "topcoder", "elly", "elly", "kriss", "esprit" };
        assertArrayEquals(new String[] { "elly" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case50() {
        String[] players = { "topcoder", "elly", "torb", "ellie", "ellie", "torb" };
        assertArrayEquals(new String[] { "ellie", "torb" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case51() {
        String[] players = { "esprit", "topcoder", "elly", "esprit", "ellie", "elly" };
        assertArrayEquals(new String[] { "elly", "esprit" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case52() {
        String[] players = { "elly", "topcoder", "ariadne", "elly" };
        assertArrayEquals(new String[] { "elly" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case53() {
        String[] players = { "stancho", "elly", "elly", "stancho", "elly" };
        assertArrayEquals(new String[] { "elly", "stancho" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case54() {
        String[] players = { "stancho", "ellie", "ellie" };
        assertArrayEquals(new String[] { "ellie" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case55() {
        String[] players = { "topcoder", "ariadne", "ariadne", "topcoder" };
        assertArrayEquals(new String[] { "ariadne", "topcoder" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case56() {
        String[] players = { "topcoder", "topcoder", "topcoder", "elly", "topcoder" };
        assertArrayEquals(new String[] { "topcoder" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case57() {
        String[] players = { "elly", "elly", "kriss", "elly", "stancho", "torb", "stancho" };
        assertArrayEquals(new String[] { "elly", "stancho" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case58() {
        String[] players = { "torb", "esprit", "kriss", "esprit", "elly", "torb", "esprit", "ellie" };
        assertArrayEquals(new String[] { "esprit", "torb" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case59() {
        String[] players = { "kriss", "ellie", "esprit", "ariadne", "ariadne" };
        assertArrayEquals(new String[] { "ariadne" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case60() {
        String[] players = { "ellie", "ellie", "ellie", "stancho" };
        assertArrayEquals(new String[] { "ellie" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case61() {
        String[] players = { "a" };
        assertArrayEquals(new String[] { "a" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case62() {
        String[] players = { "ariadne", "elly", "ariadne", "stancho", "stancho", "kriss", "stancho", "elly" };
        assertArrayEquals(new String[] { "ariadne", "elly", "stancho" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case63() {
        String[] players = { "e", "c", "d", "d", "d", "a", "e", "a" };
        assertArrayEquals(new String[] { "a", "d", "e" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case64() {
        String[] players = { "y" };
        assertArrayEquals(new String[] { "y" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case65() {
        String[] players = { "assd" };
        assertArrayEquals(new String[] { "assd" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case66() {
        String[] players = { "qwe" };
        assertArrayEquals(new String[] { "qwe" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case67() {
        String[] players = { "x" };
        assertArrayEquals(new String[] { "x" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case68() {
        String[] players = { "b", "b", "b", "b", "a", "a", "a", "a" };
        assertArrayEquals(new String[] { "a", "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case69() {
        String[] players = { "abc" };
        assertArrayEquals(new String[] { "abc" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case70() {
        String[] players = { "ivan" };
        assertArrayEquals(new String[] { "ivan" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case71() {
        String[] players = { "aa" };
        assertArrayEquals(new String[] { "aa" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case72() {
        String[] players = { "elly" };
        assertArrayEquals(new String[] { "elly" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case73() {
        String[] players = { "b", "b", "a", "a" };
        assertArrayEquals(new String[] { "a", "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case74() {
        String[] players = { "f" };
        assertArrayEquals(new String[] { "f" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case75() {
        String[] players = { "bb", "aa" };
        assertArrayEquals(new String[] {  }, ellysjuice.getWinners(players));
    }

    @Test
    public void case76() {
        String[] players = { "dz", "az", "az", "dz", "dz" };
        assertArrayEquals(new String[] { "az", "dz" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case77() {
        String[] players = { "aaa" };
        assertArrayEquals(new String[] { "aaa" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case78() {
        String[] players = { "b", "b", "c", "a", "a" };
        assertArrayEquals(new String[] { "a", "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case79() {
        String[] players = { "sara" };
        assertArrayEquals(new String[] { "sara" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case80() {
        String[] players = { "name" };
        assertArrayEquals(new String[] { "name" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case81() {
        String[] players = { "e" };
        assertArrayEquals(new String[] { "e" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case82() {
        String[] players = { "ariadne", "elly", "ariadne", "stancho", "stancho", "kriss", "stancho", "stancho" };
        assertArrayEquals(new String[] { "ariadne", "stancho" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case83() {
        String[] players = { "bb", "bb", "bb", "aa", "aa", "aa" };
        assertArrayEquals(new String[] { "aa", "bb" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case84() {
        String[] players = { "seraph" };
        assertArrayEquals(new String[] { "seraph" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case85() {
        String[] players = { "test" };
        assertArrayEquals(new String[] { "test" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case86() {
        String[] players = { "ff", "ee", "dd", "cc", "aa", "aa", "aa", "aa" };
        assertArrayEquals(new String[] { "aa" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case87() {
        String[] players = { "z", "z", "a", "a" };
        assertArrayEquals(new String[] { "a", "z" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case88() {
        String[] players = { "a", "a", "b", "b", "c", "c", "d", "d" };
        assertArrayEquals(new String[] { "a", "b", "c", "d" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case89() {
        String[] players = { "somename" };
        assertArrayEquals(new String[] { "somename" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case90() {
        String[] players = { "all", "all", "bee" };
        assertArrayEquals(new String[] { "all" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case91() {
        String[] players = { "aaaaaa" };
        assertArrayEquals(new String[] { "aaaaaa" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case92() {
        String[] players = { "zzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzz", "a" };
        assertArrayEquals(new String[] { "zzzzzzzzzzzzzzzzzzzz" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case93() {
        String[] players = { "a", "b" };
        assertArrayEquals(new String[] {  }, ellysjuice.getWinners(players));
    }

    @Test
    public void case94() {
        String[] players = { "ann" };
        assertArrayEquals(new String[] { "ann" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case95() {
        String[] players = { "quang" };
        assertArrayEquals(new String[] { "quang" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case96() {
        String[] players = { "c", "b", "a", "a" };
        assertArrayEquals(new String[] { "a" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case97() {
        String[] players = { "a", "a", "c", "a", "b", "a", "b", "c" };
        assertArrayEquals(new String[] { "a", "b", "c" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case98() {
        String[] players = { "a", "a", "b" };
        assertArrayEquals(new String[] { "a" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case99() {
        String[] players = { "afda" };
        assertArrayEquals(new String[] { "afda" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case100() {
        String[] players = { "g", "f", "e", "d", "c", "b", "a", "a" };
        assertArrayEquals(new String[] { "a" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case101() {
        String[] players = { "a", "a", "b", "b" };
        assertArrayEquals(new String[] { "a", "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case102() {
        String[] players = { "a", "a", "b", "b", "b", "b", "b", "b" };
        assertArrayEquals(new String[] { "a", "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case103() {
        String[] players = { "c", "c", "a", "a", "a", "b", "b" };
        assertArrayEquals(new String[] { "a", "b", "c" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case104() {
        String[] players = { "kriss" };
        assertArrayEquals(new String[] { "kriss" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case105() {
        String[] players = { "aa", "bb" };
        assertArrayEquals(new String[] {  }, ellysjuice.getWinners(players));
    }

    @Test
    public void case106() {
        String[] players = { "z" };
        assertArrayEquals(new String[] { "z" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case107() {
        String[] players = { "b", "b", "b", "a", "a", "a" };
        assertArrayEquals(new String[] { "a", "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case108() {
        String[] players = { "a", "a", "a", "b", "b" };
        assertArrayEquals(new String[] { "a", "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case109() {
        String[] players = { "c", "c", "b", "b" };
        assertArrayEquals(new String[] { "b", "c" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case110() {
        String[] players = { "a", "a", "b", "c", "d" };
        assertArrayEquals(new String[] { "a" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case111() {
        String[] players = { "stancho", "stancho", "kriss", "elly", "elly" };
        assertArrayEquals(new String[] { "elly", "stancho" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case112() {
        String[] players = { "e", "a", "v" };
        assertArrayEquals(new String[] {  }, ellysjuice.getWinners(players));
    }

    @Test
    public void case113() {
        String[] players = { "z", "y", "x", "a", "a" };
        assertArrayEquals(new String[] { "a" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case114() {
        String[] players = { "b" };
        assertArrayEquals(new String[] { "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case115() {
        String[] players = { "a", "b", "a", "b" };
        assertArrayEquals(new String[] { "a", "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case116() {
        String[] players = { "a", "a", "a", "a", "b", "b" };
        assertArrayEquals(new String[] { "a", "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case117() {
        String[] players = { "abc", "abc", "cde", "cde", "cde", "cde", "cde" };
        assertArrayEquals(new String[] { "abc", "cde" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case118() {
        String[] players = { "ariadne" };
        assertArrayEquals(new String[] { "ariadne" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case119() {
        String[] players = { "e", "a" };
        assertArrayEquals(new String[] {  }, ellysjuice.getWinners(players));
    }

    @Test
    public void case120() {
        String[] players = { "aaaaa", "aaaa", "aaa", "aa", "aa", "aaaaaa", "aaaa", "aaaa" };
        assertArrayEquals(new String[] { "aa", "aaaa" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case121() {
        String[] players = { "z", "z", "y", "x", "x", "x" };
        assertArrayEquals(new String[] { "x", "z" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case122() {
        String[] players = { "b", "b", "b", "a", "a" };
        assertArrayEquals(new String[] { "a", "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case123() {
        String[] players = { "a", "d", "b", "c", "b", "c", "d", "a" };
        assertArrayEquals(new String[] { "a", "b", "c", "d" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case124() {
        String[] players = { "z", "z", "y", "y", "a", "a" };
        assertArrayEquals(new String[] { "a", "y", "z" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case125() {
        String[] players = { "b", "b", "b", "b", "b", "a", "a" };
        assertArrayEquals(new String[] { "a", "b" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case126() {
        String[] players = { "banana" };
        assertArrayEquals(new String[] { "banana" }, ellysjuice.getWinners(players));
    }

    @Test
    public void case127() {
        String[] players = { "one", "one", "three", "four", "five", "six", "seven", "eight" };
        assertArrayEquals(new String[] { "one" }, ellysjuice.getWinners(players));
    }

}
