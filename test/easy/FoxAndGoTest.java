package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class FoxAndGoTest {
    FoxAndGo foxandgo = new FoxAndGo();

    @Test
    public void case1() {
        String[] board = { ".....", "..x..", ".xox.", ".....", "....." };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case2() {
        String[] board = { "ooooo", "xxxxo", "xxxx.", "xxxx.", "ooooo" };
        assertEquals(6, foxandgo.maxKill(board));
    }

    @Test
    public void case3() {
        String[] board = {
            ".xoxo",
            "ooxox",
            "oooxx",
            "xoxox",
            "oxoox" };
        assertEquals(13, foxandgo.maxKill(board));
    }

    @Test
    public void case4() {
        String[] board = { ".......", ".......", ".......", "xxxx...", "ooox...", "ooox...", "ooox..." };
        assertEquals(9, foxandgo.maxKill(board));
    }

    @Test
    public void case5() {
        String[] board = { ".......", ".xxxxx.", ".xooox.", ".xo.ox.", ".xooox.", ".xxxxx.", "......." };
        assertEquals(8, foxandgo.maxKill(board));
    }

    @Test
    public void case6() {
        String[] board = { "o.xox.o", "..xox..", "xxxoxxx", "ooo.ooo", "xxxoxxx", "..xox..", "o.xox.o" };
        assertEquals(12, foxandgo.maxKill(board));
    }

    @Test
    public void case7() {
        String[] board = { ".......", "..xx...", ".xooox.", ".oxxox.", ".oxxxo.", "...oo..", "......." };
        assertEquals(4, foxandgo.maxKill(board));
    }

    @Test
    public void case8() {
        String[] board = { "...................", "...................", "...o..........o....", "................x..", "...............x...", "...................", "...................", "...................", "...................", "...................", "...................", "...................", "...................", "...................", "................o..", "..x................", "...............x...", "...................", "..................." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case9() {
        String[] board = { ".ox....", "xxox...", "..xoox.", "..xoox.", "...xx..", ".......", "......." };
        assertEquals(5, foxandgo.maxKill(board));
    }

    @Test
    public void case10() {
        String[] board = { "o.x.xxxxo.x...", "......x...xoo.", "o.x.xo.xxo.xx.", "x......xx.xxxo", ".xx.oxo.xx..x.", "x.x.x...x..xxo", ".x.o.xx..xxx..", "...xx.xx.xox.o", "x...xx..xx.x..", "x..xx.x..xxo.x", "o...xxxx..x.x.", ".xxxxxxox.o.xx", "..oxoxo.....xo", "x.xx.oo..x.ox." };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case11() {
        String[] board = { "xx.xxxx", "xoo..xo", "o.x..o.", "..x.x..", ".o.x.xx", "x....o.", ".xxooox" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case12() {
        String[] board = { "xox.", "xxx.", "xxxx", "xxox" };
        assertEquals(2, foxandgo.maxKill(board));
    }

    @Test
    public void case13() {
        String[] board = { "xxxxxxxx.xox.", "xoxoxxo.xoxx.", ".xx.oxxx.xxx.", "ox.xx.xoxx.xx", "x.xx.xx.oxx.o", "xxxxooxxxxxxx", "xoxxoxxxxx.x.", "xxoooxxxoxx.x", "xoxxxxxoxxoxx", "xxoxx.x.xxxxx", "xxxxxxxxx.xx.", "xxxx.x...xxxx", "xxxx.oxxxxxxx" };
        assertEquals(14, foxandgo.maxKill(board));
    }

    @Test
    public void case14() {
        String[] board = { ".xxx", "xx.x", "xoox", "xxxo" };
        assertEquals(3, foxandgo.maxKill(board));
    }

    @Test
    public void case15() {
        String[] board = { "..", ".." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case16() {
        String[] board = { ".....xx", "..xxx..", "xx.x.x.", "..x..o.", "xxx.xx.", "..x.x..", "......x" };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case17() {
        String[] board = { "x.oxxo.x", "xoxxoxoo", "xx...x.x", "xx.xxxx.", ".oxxx.xo", "x..o.oxx", "oox.oxox", "ox.xxo.." };
        assertEquals(3, foxandgo.maxKill(board));
    }

    @Test
    public void case18() {
        String[] board = { "oo.ooo", "oooooo", ".oo.oo", "oo.ooo", ".oo.oo", "ooooo." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case19() {
        String[] board = { "..x.o..o.x..xxx..x", "o..oxx.o.ox..x.o..", "xox.o.x.x..x.x.ox.", "o.xx..xxoxxxxxxxxx", "xxxxx.x.xxxxxx....", ".x.xxxooxoxxoxxxox", "xxoxx..xxxxxo.xx.o", "x....x.o..x.x..xxx", "oxxox.x..xxox....o", "oxox..xxxo...xx.xx", ".x.xoxoox.o..x.oxo", "xxxoxo.x.xx.oxxxo.", ".oxxx.xx.xx..x.xxx", ".x.oxxxx..x..x..xx", ".xxx.xxxxxxoox..x.", "oo.x.o.xxxxooooxx.", "xox..ox..x.ox.xx.o", "..xxx.x.xxxxxxxxox" };
        assertEquals(5, foxandgo.maxKill(board));
    }

    @Test
    public void case20() {
        String[] board = { ".oo.xxxx.xx.oxxo.", "xox.....xxx.ox.xx", "...xxxxo.x.xx...o", ".oox.x.oxox...o.x", ".o.x.xooxoxxxxoxx", ".xx.xxo.o..x.xxxx", "..xxx..oxx.xxx.o.", "o.xo.o.oox..xxxxx", ".o.x..xoxo..xoxxx", ".xxx.o.xxxxox.x.x", "xx.x.xo.x..x.xx..", "xx.xx.ox.x.oxxo..", ".xoo...x.x..x.xoo", "xxxx.xxxx..x..x.x", "x.x.o.xoxxxx.xx.x", "x.xx.xxo..xxxxxxx", "xxx.xxxxo..oo.xoo" };
        assertEquals(4, foxandgo.maxKill(board));
    }

    @Test
    public void case21() {
        String[] board = { ".oooo...ooo.o.oo", "o.ooo.o...oo..o.", "oooooo.o.o.oo.oo", "oooo.oooo.ooo...", "o....oo.oo..oo..", "xo.o.x..oo....x.", "ooooo.oo..oox.oo", "oox.ooooo.o.ooo.", ".oo.ox.o.o.o.o..", ".x.o.o.oo....oo.", "ooooo.o...oo.oox", "xo..oxooo.....oo", "o.ooxoo.ooooo...", ".ox.oxo.oooo..oo", "o.oo...o..o.oooo", ".o..ooo..oo..o.o" };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case22() {
        String[] board = { "x...x..xo.", "x...x.xxoo", "xxo.xx....", "x..o..x..o", ".x........", ".x..x.ox..", ".x...x.xxo", "....x.x..x", ".x..x..xx.", "x.o.x.x.x." };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case23() {
        String[] board = { "oo", ".." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case24() {
        String[] board = { "xxxxxxxxxxxx", "xxxxxxxx.xxx", "xxxxxxxxxxxx", "xxxxxxxxxxxx", "xxxxxxxxxxxx", "xxxoxxxxxxxx", "xxx.ooxx.xxx", "xxxxxxxxxxxx", "xxxxxxxxxxxx", "xxxxxxxxxx.x", "xxxx.xxxxxxx", "xxxxxx.xxxxx" };
        assertEquals(3, foxandgo.maxKill(board));
    }

    @Test
    public void case25() {
        String[] board = { "oooooooxox", "oooooooxoo", "ooooo.ox.o", "oooooooooo", ".oooooooxo", "oooooooooo", "oxoooxoooo", "oox.xooooo", "ooooooooxo", "ooooooxoxo" };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case26() {
        String[] board = { "x.oo..xxoo.ox", "...o..o......", "..oxoo.ox....", ".oo.o....o...", ".x.o..o.o..ox", "..o..x.x.x.x.", "x..x.oxo.xo..", "o.x.xx......x", "o.x.o.o.xo...", "o.oo...x...ox", "....o.....xx.", ".............", ".x...x.x..oxo" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case27() {
        String[] board = { "xxooxxx.x", "xxooo..oo", ".ooxxxoxx", "oxxxx.oo.", "oxxxx.xxx", "oxxxxxxxx", "xxx.xxo.o", "xxxxxxxxx", "x.xxxxxxx" };
        assertEquals(3, foxandgo.maxKill(board));
    }

    @Test
    public void case28() {
        String[] board = { "ooo.xx", "xx.xoo", "xxoooo", "xxooxx", "oxoooo", "ooxoxo" };
        assertEquals(17, foxandgo.maxKill(board));
    }

    @Test
    public void case29() {
        String[] board = { "....xx.oo.....", ".....ooooo.o.o", "o...o.o.....oo", "........x..o..", "o.oo.oo.o..o..", "o.o...o.o.x.oo", ".o.........o.o", "oo..o.o..ox...", ".oooxoo..xoo..", "xoo.xo.o.ooo..", "o.oo...xx.ooo.", "o...oo.o.o.o..", "xoo..o.o..x.o.", "o..oooox.xo..o" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case30() {
        String[] board = { "xx.....o", "oxxxxx.x", "xxxx..xx", "ooxxxxxo", ".xx.xx.x", "xxxxxxoo", "..xxxxxo", "..xox.xx" };
        assertEquals(6, foxandgo.maxKill(board));
    }

    @Test
    public void case31() {
        String[] board = { "xxx", "xxx", "xx." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case32() {
        String[] board = { ".o..o.", "o...o.", "o.o...", ".oo...", "..o...", "...oo." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case33() {
        String[] board = { ".oo.o.oo.ooo.o", "o.oooooo..xoo.", "xo.ooo.oo.....", ".o.ooo.oo.oo.o", "ooooo.ooooooo.", "o..ooo...ooooo", "ooo.oo.o.o..x.", "oooooooo.ooooo", ".oooo..ooo.ooo", "ooo.oo.oooo.o.", ".o...o...ooooo", "oooooo.x..o.oo", "..oo.o..oo..oo", "o..o.o..oxooo." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case34() {
        String[] board = { ".oox", "xxx.", "x.oo", "xox." };
        assertEquals(2, foxandgo.maxKill(board));
    }

    @Test
    public void case35() {
        String[] board = { "xxx.xxxxxxxxoxo", "xx.oxxxxxxo.oxx", "xx.xx.x.ooxx.xx", "xxxxxo.xxxxoxox", ".x.xxxx.ooxoxxx", ".xo.ooooooxx.xo", "x.xoxxxxox.xxxx", "xox.xxxxoxoo.xo", "xoxoxxox.x.xx.x", "xxxoxxxxxxxxx.x", "x.x.xoxxxxxx.xo", "xxx.xxxoxoxo.x.", "xxooox.xxxxxxxo", "x..xooxxxx.xx.x", "ox..ooxxxxxx.xo" };
        assertEquals(14, foxandgo.maxKill(board));
    }

    @Test
    public void case36() {
        String[] board = { "ooooooxoxooxoooxo", "oxooooooxooox.ooo", "ooooooooooo.ooxoo", "xoooooooooooooooo", "oooooooxooooooooo", "ooooooxoooooooo.o", "ooooooooxxoxooooo", "ooxooooxoooo.xoxo", "xoooooooooooooo.o", "o.oxooooooxoooooo", "xo.xooooxoooooooo", "oooooooooooo.oxoo", "oooo.ooooox.ooooo", ".ooooox.ooxoooooo", "xooooooooxooxoooo", ".ooooooooooxooooo", "oooooxxoooooooooo" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case37() {
        String[] board = { "xooo.oxooooooo.o", "xxo..xoxxooxoooo", "xooooxoooooxxooo", ".ooooooxoooooxoo", "oo.oooooooo.oo.o", "oox.ooooo.ooxo.o", "ooooxox.ooo.oxxo", "ooo.oo..oxxooxoo", "oooooo.ooo.ooooo", "o.ooooo.ooo.x..x", "ooo.oooxooxoo.o.", "xoxxoxoooxoxooxo", "ox.xo.ooooooooxo", "ooo.xxo.xox.oooo", "oooxoooooxoo.x.o", "oooooxo.xoo.xooo" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case38() {
        String[] board = { "oxxxxxxxxxxx.xxxxxx", ".xxxoxxxxoxxxxxxxxx", "xxxxxxxxxxxxxxxxoxx", "xxxxxxxxoxoxxoxxxox", "xox.xxxxxxxxxxxxxxo", "xxxxxoxxxxxxxxx.xxx", "oxxxxxx.xx.oxoo.xxx", "oxx.xxxxxxxx.xxx.xx", "x.xxx.oxxxxxox.o.xo", "xx.oxxxxxxxxxxxxxxx", "xxx.xoxo.xxxxxxxxox", "xxo.xxxoxxoxoxxxxxx", "xoxxooxxoxxoxxooxxx", "xxx.xxxoxxoxxxxoxxo", "xxoxxxxx.xoxxxoxxxx", "xxxx.xxxxxxoxxxxxox", "xxxoxxxxxxxxxxxo.ox", ".oxxxxxxxooxo.xxxxx", "oxxxxxoxxxxxxxx.xxx" };
        assertEquals(39, foxandgo.maxKill(board));
    }

    @Test
    public void case39() {
        String[] board = { "x.xx.xxx.xxxxo.", "x.x...x.x.x.x.x", "xxx...x.xx....x", "xxxxxxxxxx.x.xx", "xxxx.xx.ox.xx.x", "..x..x...x..x..", "xxx.xx.x.x.x.x.", ".xxxxxoxx.xxxxx", "x.x.xxxx.x.x...", "..xxo.xxx.xxxxx", "..xx...xx.xxxxx", "..xx.x.x..x.x.x", "xxxxxx.xxx.xx..", "..xxxxxx...xx.x", "xxxxxx.xxxx..xx" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case40() {
        String[] board = { "..o..x.x.x....x", "x.oo...x..oox.x", "oxo..o...xxxxo.", "x......o.x.oo..", "....oxo..o...o.", "..oxx..ooo...xo", "xxxoooo.o.xoo.x", ".oo.o.o..ox...x", "xx.o..x.....ooo", "oo.xoo...o.xxxx", "o.oo.xx..oo.xox", "..ooo......xx..", "x......x..oo.x.", "ox....x...x..o.", ".....xx.ooooo.o" };
        assertEquals(2, foxandgo.maxKill(board));
    }

    @Test
    public void case41() {
        String[] board = { "o..ooo.xoooo..", "oo..ooo..oo...", "..o..ooo...ooo", "oooo..o.xo.o..", "o....o.o.ox.o.", "o..xo....o..o.", "..oooo..o..o.o", "x.ooxo.oo..oo.", ".o...xo.ooo.o.", "oo.o.o..oox.xo", "..oo...o...ooo", "..oo.ooooo.ooo", ".o......oooo..", ".o.o..oo.oo..o" };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case42() {
        String[] board = { "...xx.", "xxx.xx", ".x...x", ".xx...", "xx.xx.", ".xxxxx" };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case43() {
        String[] board = { "o.xx.......x", ".xo.xx.xoo.x", "..x.o.o.x.xo", ".xxxx.xo..xx", "...o.xox..xo", "o.x...x..xxo", "o..oxx......", ".o.x...o....", ".x.x.x......", "xox...xx...x", "o..x.xx.o.xx", "ox.x..x....." };
        assertEquals(5, foxandgo.maxKill(board));
    }

    @Test
    public void case44() {
        String[] board = { ".o.o..o...", "o...o..o..", "....o.....", "o.........", "..o..oox..", "..........", "..........", "x..oo.....", "ox........", "......oo.." };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case45() {
        String[] board = { ".oo.oo.xo.", "o....x.oox", ".oooo.o.o.", "o.ooo.oooo", ".o.o.ooooo", "oo.ooooo.o", "ooo....oo.", "oo.oooo..o", "o..oo..o.o", "oo.oo.o.oo" };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case46() {
        String[] board = { "oxxx.xooxx.x", "xooxxoxoooox", ".xxxox.xo.xo", "xoo.o.xx.x.x", "xxo.oo.oo.ox", "ooo.xxxooxoo", "o.oox.ooooo.", ".xx.o..xooox", "ox.xoox.ooxo", "ooxx.xoxooox", "xxxoxoxx.oo.", "o.oooooo..xo" };
        assertEquals(10, foxandgo.maxKill(board));
    }

    @Test
    public void case47() {
        String[] board = { "ooo..oo.xooo", "...oo..o.oo.", ".o..oooo..xx", "..o..o.o...o", "ox..o..oo..x", ".ooo.ooo.o.o", "oxoo...xo...", "oxx...ox....", "....o...o.oo", "ooo.oooo..o.", "o...o.o.xo..", "o.ooo...x.oo" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case48() {
        String[] board = { "..x", "oox", "..x" };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case49() {
        String[] board = { ".x.xoxx.x.x", "ox.....ox.x", "oxo..x..o..", "xxx..x..xo.", "xooo....x.x", "oo.oxx...o.", "..xoo.o..oo", "oo..xo.o.oo", "oxx.xo..x.x", "oooxooxoo.o", ".x..oxx.x.o" };
        assertEquals(2, foxandgo.maxKill(board));
    }

    @Test
    public void case50() {
        String[] board = { ".x.x.xx.", "x..xoo..", "xoo.x..x", "oxxxxoxx", "..oooxxx", "...xxoox", "xxx.xox.", "oxoxxxox" };
        assertEquals(7, foxandgo.maxKill(board));
    }

    @Test
    public void case51() {
        String[] board = { "oo..xoxox.x..", "..xox....xo..", ".oxx.x.o..xxo", ".xx......xx..", ".xxo..xxoo...", "...o..xx.o.x.", "xo.xxoo.xxox.", "....xx..xo..x", ".xxx.oo...ox.", "xo...o.x..oxx", ".x..x.xxo.x.x", ".x.xxxox.o...", "o..oox.xx.oxx" };
        assertEquals(2, foxandgo.maxKill(board));
    }

    @Test
    public void case52() {
        String[] board = { "o..o....oxoo.", "oo.o...xooo.o", "o....ox.oo.oo", "o.ooo.o..ox.o", ".....oo.x.x.o", ".oo.o...oo...", "ooo.o.o..oo.o", ".o.ooo...oooo", "..xoo...xo..x", "..oo.......o.", "..xx.xoooo.oo", "..oo.o....oo.", "ooxo....o..o." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case53() {
        String[] board = { "xxxx.xo", ".xxxxxx", "oxxxoxx", "xxxxx.x", "xxx..xx", "x.xxxox", "xxx.xxo" };
        assertEquals(5, foxandgo.maxKill(board));
    }

    @Test
    public void case54() {
        String[] board = { "xoox.xx.oxxoooox", "xoooox.xxooxox..", "ooxxoxxxooox.x.o", "xooxoxxox.ooxxox", "oo.o.x.xooxooooo", "x...oooo.xoxxxoo", "o..oox.ox.xoooxx", "xxox.oo..xoxooox", "oxoo...xxooox.oo", "..xoxxo.xooooxx.", "o.oxoox.ooooxooo", "o..oo.xo..x.xx.o", "oxxxo..o.xxxooxx", ".ox.xxo.xxo.o.xo", "xxo..x.xoxoox.o.", ".xoxx..xx.oooooo" };
        assertEquals(5, foxandgo.maxKill(board));
    }

    @Test
    public void case55() {
        String[] board = { "....xoxx", "o.ox.o.o", "xxx..o..", "....xxxo", "..xx....", "...xx.oo", "x..x..xx", "x.o.xx.o" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case56() {
        String[] board = { "o..x.", "x....", ".x.x.", "xx...", "..x.." };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case57() {
        String[] board = { "xxxxx", "oxxxx", "o.x.o", "xxooo", "xxxxx" };
        assertEquals(4, foxandgo.maxKill(board));
    }

    @Test
    public void case58() {
        String[] board = { "..x...o.oo", "..........", "....x.o..o", "...o..oox.", "oooo......", ".o..o..xo.", ".o..o.o..o", ".x...o..o.", "......o...", ".o.oo.o..." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case59() {
        String[] board = { "xx.x", ".oox", "xxxx", "xxox" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case60() {
        String[] board = { "oooxo.oxo.xooooxo.", "oxxooooxxxooxooo.o", "xo.x.xxo.ooxo.oxox", "xoxoo.xxxooxooxxoo", "xxoo.xoxooooxxooox", "oxxoo.oooo.x.oooox", "xo.oo.ox.xx..oxxxx", "xxxoooooo.ooxx.o.o", "xxoxooo.oxoox.oox.", "oo.xx.ooo..xoox.x.", "oxxxo.xooxxxx.o.xo", "oxooooxooox.oxx..x", "xoooooooox.ooxxoo.", "xxxxo.oo.xoox.ox.o", "x..oooxooooooooooo", "ooxoxoooooooo..oxo", "x....xoxoxxooxoxox", "ooooxoxx.ooooxoo.o" };
        assertEquals(11, foxandgo.maxKill(board));
    }

    @Test
    public void case61() {
        String[] board = { "xo", ".x" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case62() {
        String[] board = { "..", ".." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case63() {
        String[] board = { ".oxxoxooox.xxx", "xxoxxx..xoxxx.", ".xxx.oooxxooxx", "oxxxx.xox..xxo", "x.oxox.ooxoxxo", ".xo.xox.xoxox.", "ox.xoxoooxxxxx", "o.xx.oxoxoxoxx", "xxxx.x.xx.xxxx", "x.x.xx.ox.xxxx", "xx.xoooxoxxoxx", "xxo.xxxox.x.xo", "xx.o.oo.x.xxx.", "x.oxx.xxxx.xox" };
        assertEquals(14, foxandgo.maxKill(board));
    }

    @Test
    public void case64() {
        String[] board = { "oox.x.oo.", ".x....xoo", "...oxxox.", "x..xx.o.x", ".oox.xxox", "x.xxxxx..", "o.o.xoo..", "oo.xxo...", "oooxox.x." };
        assertEquals(3, foxandgo.maxKill(board));
    }

    @Test
    public void case65() {
        String[] board = { "xoxo", "x.ox", "xoxo", "xxox" };
        assertEquals(6, foxandgo.maxKill(board));
    }

    @Test
    public void case66() {
        String[] board = { "ox", "o." };
        assertEquals(2, foxandgo.maxKill(board));
    }

    @Test
    public void case67() {
        String[] board = { "...x.xx.xx.x.xx", "x.oxxx....x.x.x", "..x..x....xx...", "x...x..x.xx...x", "xxxx.xo.xxxxx.x", "...xxxx.xxx...o", "xo...xx.xxx...x", "x.xx.xxxxxo...x", "x.x..oo.......o", "..x.x.xx...xx.x", "x.xxx.xo..xxx..", ".xxxxxxx.xx..xx", "x.x.x..xxx..xx.", "x..x..xx.xxx...", "xxx.x..oxx.x..x" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case68() {
        String[] board = { "xo.xo.x.o..xox..", "xx..xoxoxxoox.xo", "oxoo..ox.oxx..ox", "oo.xoo.xx..oxxoo", "oxo....o.o.xo...", ".xxxxx.o..ox....", "xox...o..xo....o", "o.oooo.oox.ooxxo", ".ox.x.....oxooo.", "xoxx..ooo.oox..x", "o.o.ooooo....o.o", "x.oooxo.oo...ox.", "o...ox...xx..oxx", "xo...o...x.xoo.o", "xoxoo.o.ox..ooxo", "..x.oo..x.oo.xo." };
        assertEquals(3, foxandgo.maxKill(board));
    }

    @Test
    public void case69() {
        String[] board = { "xxxox", "xxxxx", "xooxx", "..oxx", "xo..x" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case70() {
        String[] board = { "oxx..x.ox..o.ooo..", "oo.ox.o.ox.....ox.", "oo.oooox..xx..xxx.", "x..oo.ooo.x.oxo..x", "ox.o.xoo.xox.oox..", ".o.ooxoxxx.....x..", "oxo.o.xoo.o..o.oxx", "ooox.o.ox......o.o", ".xo.xxxxxo.oo.o.xo", "o.xo.xo..o.oox.oox", "..oo.o....ooxxx.xo", "..o.x.oxx.xoo.ooo.", "oxx..xooxxxx.o..oo", "...o..oxoxooooooxo", "oxo.xooxoooxo..xo.", "ooo.oxooox.o.oooo.", "oo.oxoo.o..xox....", "o..o...o.x.o.ox.x." };
        assertEquals(2, foxandgo.maxKill(board));
    }

    @Test
    public void case71() {
        String[] board = { "x.xoxxxo", "x.o.x..x", ".o.ox..o", "x.x...xx", "oxxx.ooo", ".xxoxx.x", "xx.ooxxx", "..xxxxx." };
        assertEquals(4, foxandgo.maxKill(board));
    }

    @Test
    public void case72() {
        String[] board = { "...x..xx.x.x..x", ".x.x.x......ox.", ".x......xx.x..x", ".xxx.......x...", ".......x.x.x..x", "xxox..o...x...x", "..x...x.x.....x", ".x.....x..x...x", "..x...x..x...xx", "x....xx.x...xx.", "..xx.xxxx.x...x", "x.ox..x...xx.xx", ".x...x.........", "xxx..xxxx...x.x", ".xx.x...x...x.x" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case73() {
        String[] board = { "oooo.ooxo.oxoxo", "ooooo.ooooxoooo", "ooooxo.xooooxoo", "oo.xoooooooooox", "ooxxooo.oo.oooo", "oooxooooooooooo", "xo.oxoxxo.ooooo", "oooooooooox.o.x", "oooooooxooooooo", "xooooxoooxoooxo", "ooooooooo.oo.o.", "oo.ooooo.ooooxo", "oooooooxoooooox", "xooxooxoooooooo", "ooooxoxx.oooo.x" };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case74() {
        String[] board = { "...x.x......xx", "..x...x...xx.x", "ox.x.xxxo.o.x.", ".....xo..x....", "x.......xx.xx.", "....x........x", ".............x", "..o.x...o.x...", ".o....x.x..x.x", "o....o..ox.x..", ".....oxo......", "......o..o....", "...x.x.o..o.x.", "x....x.xx....." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case75() {
        String[] board = { "ooxox.ooo.xooooxxo", "ooxoxxxoxxoxxoxoox", "oooooxxooxo.oxoooo", "oooxoxoooxooooxooo", "oox.o.ox.oxxoxoooo", "o.ooxxxoooxxoooo.o", "oo.oooxxooxoooo.xo", "oxooo.x.oooxooo.ox", "xxoxxxoxxxxoxxxoox", "o.xx.xoooo.oooxxox", "xxooooooxx.ooooox.", "oxoooo.oxxo.o..ooo", "oxxooooxooo.xooxoo", "oooxooooo.ooxo.xox", "xooxxxxooo..o.xooo", "ooooxooo.x.ooxxxox", "oooooooxoxoooo.oox", "x.oooooxxooo..ooxo" };
        assertEquals(11, foxandgo.maxKill(board));
    }

    @Test
    public void case76() {
        String[] board = { "xxxooxxxxxxxx", "xxx.xxxx..oxx", "oxx.oooxxooxo", "xx.xx.oxox.oo", "xoxoxxooox.oo", "xxxxxooxxoo.o", "oxoxxooxxxx.x", "xoo.o.xoxxxxx", "xxxxxxxxxo.o.", "..oxxxxxxooxx", "oxxxxxo.oox.x", "xoxxoxx.oxoox", "xxx.xxxoxxxxx" };
        assertEquals(10, foxandgo.maxKill(board));
    }

    @Test
    public void case77() {
        String[] board = { ".xo", "xxx", ".oo" };
        assertEquals(3, foxandgo.maxKill(board));
    }

    @Test
    public void case78() {
        String[] board = { "x.....", ".ooo.o", ".o....", "o....o", "..x...", ".ox..." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case79() {
        String[] board = { "..o............", "x.....x...x.x..", "..x.....xoxx..x", "x.o..........xo", "......ox....o.x", "xx.x...........", "x..oo.....xox..", "...............", "x....x.x.....x.", "...ox..x.x.....", "...o..oo.......", "..x...ox..x....", "...x.xxx...oo..", ".o....o.o......", ".xo.x....xxx..." };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case80() {
        String[] board = { ".....", "..x..", ".xox.", ".....", "....." };
        assertEquals(1, foxandgo.maxKill(board));
    }

    @Test
    public void case81() {
        String[] board = { ".......", ".xxxxx.", ".xooox.", ".xo.ox.", ".xooox.", ".xxxxx.", "......." };
        assertEquals(8, foxandgo.maxKill(board));
    }

    @Test
    public void case82() {
        String[] board = { "ooooo", "xxxxo", "xxxx.", "xxxx.", "ooooo" };
        assertEquals(6, foxandgo.maxKill(board));
    }

    @Test
    public void case83() {
        String[] board = { "xoo.ooox", "xooxxxxx", "xxxxooo.", "xxxxxxxx", "........", "........", "........", "........" };
        assertEquals(7, foxandgo.maxKill(board));
    }

    @Test
    public void case84() {
        String[] board = { "...................", "...................", "...o..........o....", "................x..", "...............x...", "...................", "...................", "...................", "...................", "...................", "...................", "...................", "...................", "...................", "................o..", "..x................", "...............x...", "...................", "..................." };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case85() {
        String[] board = { "xxxxxx", "xxxxxx", "ooooo.", "ooooox", "ooooo.", "xxxxxx" };
        assertEquals(0, foxandgo.maxKill(board));
    }

    @Test
    public void case86() {
        String[] board = { "o.xox.o", "..xox..", "xxxoxxx", "ooo..oo", "xxxoxxx", "..xox..", "o.xox.o" };
        assertEquals(9, foxandgo.maxKill(board));
    }

    @Test
    public void case87() {
        String[] board = { ".xoxo", "ooxox", "oooxx", "xoxox", "oxoox" };
        assertEquals(13, foxandgo.maxKill(board));
    }

    @Test
    public void case88() {
        String[] board = {
            "xxxxxx",
            "xo.oox",
            "xxxxxx",
            "xoo.ox",
            "xxxxox",
            "xxxxox" };
        assertEquals(5, foxandgo.maxKill(board));
    }

    @Test
    public void case89() {
        String[] board = { "o.xox.o", "..xox..", "xxxoxxx", "ooo.ooo", "xxxoxxx", "..xox..", "o.xox.o" };
        assertEquals(12, foxandgo.maxKill(board));
    }

    @Test
    public void case90() {
        String[] board = { "........", "..x...x.", "..ox.xox", ".xox..x.", "..x.....", "........", "........", "........" };
        assertEquals(3, foxandgo.maxKill(board));
    }

}
