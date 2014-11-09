package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class ArcadeManaoTest {
    ArcadeManao arcademanao = new ArcadeManao();

    @Test
    public void case1() {
        String[] level = {
            "XXXX....",
            "...X.XXX",
            "XXX..X..",
            "......X.",
            "XXXXXXXX" };
        int coinRow = 2;
        int coinColumn = 4;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case2() {
        String[] level = { "XXXX", "...X", "XXXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case3() {
        String[] level = { "..X..", ".X.X.", "X...X", ".X.X.", "..X..", "XXXXX" };
        int coinRow = 1;
        int coinColumn = 3;
        assertEquals(4, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case4() {
        String[] level = { "X" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case5() {
        String[] level = { "XXXXXXXXXX", "...X......", "XXX.......", "X.....XXXX", "..XXXXX..X", ".........X", ".........X", "XXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case6() {
        String[] level = { "XX.........XXXXXX", ".X.X..X.XXXXX..XX", "X..X.X..X.X.X..XX", ".X.XXXXX.........", ".X.XX.X.X.X.XX.XX", "X.X.XXXX.X.XX....", "XXX..XXX.XXX.X.X.", "XXX.XXXX..XX.X...", "....X.X...XX.XXXX", "X..X.X..XX...X...", "XXXXX.X....XX.XXX", "XXXXXX.XXX..XXXX.", "..X.X..X..X.X..X.", "...XXXXX..XX...X.", ".XXXXX..X.XXXXX..", "X..X..X..XX.XX..X", "XX.X.X...XXX..X..", "..XX....X.X..X.XX", "XXXX.....X.X.XX..", ".X.XXX...XX.XXXX.", "..XX.XXX....X.XXX", "XXXXXXXXXXXXXXXXX" };
        int coinRow = 17;
        int coinColumn = 4;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case7() {
        String[] level = { "XXX..XXXX.XX.X.X", "XX....XX.XXX...X", ".X.....XXXX..XXX", ".......X..X.X.XX", "..X...X..X..X...", "XXXX.XXX....X.X.", ".XXXXXXXX..X.XX.", "......XXX.....X.", "..XX.XXXX..XXXXX", "..XX...XX..X.X.X", "XX.X.X...XXXX.X.", "...XXX...X.X.X.X", "..X.X.X.X.X.....", "XXXX.XX..X...XXX", "XX.X.X..XXX..XXX", ".XX..X.XX.X..XXX", ".XXX.....XXX.X.X", "X.XX..X...X.XX.X", "XXX.....XXXX.XXX", "XXXXXX.X....X..X", ".X.X...X.XX...X.", "..XX.XXX..XXX...", ".XXX.XXX..X....X", "...X.XXX.X.X....", "XXXX..XX.XX..X..", ".X.XX...X.XX..XX", "XXX...XX..X.XXXX", ".X.XX...X.XX..X.", "..XXX.XXX.XXX..X", "..XXX..X.....XXX", ".......XXXXX..XX", "XX..X.X..X..XXX.", "..X.XXXXXXX.XXXX", "..XX.XX..XXXXXX.", "XX.XXX.X.XX.X...", ".XX.X..X.X...XXX", ".X...XXXXXX.....", "XXX..X...XXXX.X.", "X.X.XX.X.XXXX...", "..XXX.XXXX.X..XX", ".X.X...XXXXX.XX.", "XX.XXXX..X.X....", "..XX..XX.XX.X..X", ".XX.X..XX.XX.XX.", ".....X.X.X...XXX", "XX........XX...X", ".XXX..XXXX...XX.", "..XX..........X.", "XXXXXXXXXXXXXXXX" };
        int coinRow = 44;
        int coinColumn = 11;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case8() {
        String[] level = { "X.XXX.XX.X..XX..XXXXXXXX.X.X", "XX........XXXX..X..XXX...XX.", "X.XX.XXXX.XX.X.X....XXXX....", "..X.X..XX...XX......X.X....X", "..XXX.XXXX.XX.X.X.X.X..XX..X", "..XXXX..XX....XXX.XX.XX...XX", "..XX..XXXX..XXXX...XX...X...", "....X......X...X.X..XXXXXXXX", ".....X.XXX........X......X..", ".XX..X..X.XXXXXXXXX.X..X..XX", "XXX..X..X.XXX..XXXX...XXX...", ".XXX...XXX..XXX....XX.X..X.X", "...XXX.....XX..XXX.X..XX...X", ".XXX...XX..X...X..X..XX..XX.", ".X..X....X..XXXX.XX..XX.X..X", "XX..XXXX.X.XX.X..XXX........", "....X.X..XX...X.XXXX..XXX.XX", "XXX....XX.XXXX..X..X...XX.XX", "..X...X..XXXXXXX.XXXXX.X.XXX", ".X.X..XX.X......X.XX.X.X.X.X", "XXX...X......X...X...X.X..X.", ".X..XX.X.X.XXXXXX..X.X.X....", "XX.X..X...X..X..XX.......XXX", ".XXXX..X..X.XXX.X..XX..X.XXX", "X......XXXXX.XXX.XX.X.X.X...", "XX..X....X..XXX...X..X.XXX.X", ".X.XX..X.XX....X.X...XXX..X.", "XXX.XX....X...X.XXXXXXX....X", "XX....XX.XX..X..X.X.....XX..", "XXX..XX..XX.X.XX...X.XXXX.X.", "XX.XXXXX.X.XX..X...X.X..XXX.", "...XX...XX..XX..X......XXXXX", "XXX.X...X.XX.X..XXXXXX...XXX", "..X..X....XX......XX.X.X.XX.", "..XX.X.XXX....X...X.X....XXX", "XXXXX.X.X..X.X.XX.XXX.X...X.", "XXX.XXX.XX...XX..X...XX...X.", ".XXXX..X...XX..X.X..XX.X.X..", ".XX......X..X.XX..X..X..XX..", ".X.XXX.XX....XX.....X.X.X...", "X...XX.X...X.....X.XX.X.X.X.", "..X.XX......XXXX...X..XX..X.", "..X...X.X.XX..XX..X...X.XXX.", ".X.X..XX..XXXX.XX.....XXX.X.", ".XX.X.XXX....XXXX.....XX....", "..XX..X.XX..X.......X...XXXX", "X.XXX....X..X..X.XXX.XX..X..", ".X..X.XX...XX..XXX.X...XXXX.", "XXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 41;
        int coinColumn = 12;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case9() {
        String[] level = { ".XXXX.X....XX.X.XX..XXXXX..X..X.XX.X........", "..X.XX..XX...X..XXX.X.XX..X..XXX.....X..XX.X", "..XX...X.XXXXX...X.......X..X...XX..XXX.X.X.", "XXXXXXX.....X.X...XX.XXXXX..X.XX.XXXX.X.....", "...X.XX..X..XXX.X..XXXXX.XXXXXX...X...X..XXX", ".X.XXX.XXXX....X....XX...XX..X.XXXXX.X.X.X..", "....X.XXXX...X..XXXXX..X.X.XXXXXXXXX.X..XX..", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 2;
        int coinColumn = 31;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case10() {
        String[] level = { ".X.X.....", "X.X.XX.XX", "...X...X.", "XX..XXXXX", ".XXX..XXX", "XX.XXX...", "..XXXXX..", "....XXX..", "X.X......", ".X.X...X.", "..XX.XXXX", "X.XXX.X.X", ".XXXXXX..", ".XX.....X", "X.XXX...X", "..X...XXX", ".XXXX.XX.", "XXXXX.X.X", "...XXXXX.", "XX..XXXXX", "X.X.X.XX.", "XXXX....X", "..XXX.X.X", "X..X..XXX", "XXXXXXXX.", "X.XXXX.XX", ".XXX..XXX", "XX....X..", "...X....X", "......XX.", "..X.XX.X.", "XX......X", "XX.XXXX..", "X.X.XX.X.", "..XXXX.X.", "X.X..XX..", "X..X.X.X.", "XXXX...X.", ".XX..X.X.", ".X.X...XX", ".....X.X.", "XXXXX.XX.", "..X.XX.X.", ".XX.XXX.X", "X.X.X.X.X", "XX.XXXX..", "XX..XXX.X", ".X.X.XX..", "XXXXXXXXX" };
        int coinRow = 46;
        int coinColumn = 7;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case11() {
        String[] level = { "X.XXXX.X.XXXX..XX..X....XXXX.X", "..XX.....X..X..X.XX.XX...XXXX.", "X.X.XXX...XX.XX.XX.XXXXXX.XXXX", ".XX...X..X.X.XXX..X.XX..X..X..", "..X.XXXXX.XX.X...X....XXX.XXXX", "X.XX..XX..X...X.X.....X...XX..", ".XXXX.XXXX.XX.XXX....XXXXXXX..", "XXX..X.X.X.XXX..XXX...X.X.X.X.", "..X.XX.........XX..XX.X.....X.", "X.X.X..X.X.X..X..X.XXXX.X...XX", "....X.XX.XX..XX..X.XXXXX..XX.X", "XXXX...X.XXXXX...X...XXXX..X..", ".XXX...X.X..X.X.XXXX.XXXXX..XX", "XXXXX..X.XXX..X..XX.X...X.X..X", "XX...X..X.XX....XX.XX...X..XX.", "XX....X.X.XX..XX.X.XXXXX..X.XX", ".X....X...XXXX....XX..XXXXX..X", ".X.XXXX.X.XXX....XX...XX.....X", ".X..XX.X..XXXX.X..X.XX....X..X", "X...XXX.XX..XXXX.......XX...X.", "..X.X...X.X...X...XX.X.XXXXX..", "..XX......XX..X..X.X.X.......X", "..X..X.....XXXX...X.XXXX.XXXXX", ".XX.X.X....XXXX.X.X..X..X.X...", ".XX.X..XXX.XX..XXXXXXX..XX...X", "X.X...X.X..XX.X.X..XX.........", ".XX.XX.XX..XX.X...XX.X..XX....", "..XXX.X....XXX.XX..XXXX..X.XXX", ".XX...XX..XX....X.X.X...XX.XX.", "XX.X....X.X.X.XX.XX....XXX.XXX", "XXXXXX..XX.X.XX.X..X.X.X..XXX.", "X..X...X.X.XXX..X..X.X..XXXX.X", ".XXX..XXX...XXX.X..XX.....XX..", "XXX.X.X.X.X.X.XX.....X.X.XX.X.", ".....XXX..XX..X...X..XX.XXX.X.", "X...XX.XXXXX..X.X.X..X.....X..", "X....XXX.X...X.X.XXX...X.X.XX.", "X.XXX..X..X....XXX.XX..XX..XXX", "X.XXXX.......X.X.X.XXX...XXX..", "....X.XXX..XXX..X..XX..XX.X..X", ".XX.XXXXX....XXXX.X.X..XX.X...", "XXXX.X.XXX.XXX.X.XX....XX.XX.X", "XXXXXXX....X.XXXX..X.X.....X.X", "..X..X.XXX.X..XXXX.X..X.X..XX.", "XXX.......XX..X.XX.XX.XXXX.XX.", ".XXXX..XX..XXXX.XXXXX.XX.XXX.X", "...XXX..XXXX.X.XX..X.X.X.XX.X.", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 29;
        int coinColumn = 25;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case12() {
        String[] level = { "..X.XXX.X", "X....X..X", "..X.XXXXX", ".X...XX.X", "X...X....", "..X.X..XX", "X.X..X..X", "XXXXXXXXX" };
        int coinRow = 8;
        int coinColumn = 4;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case13() {
        String[] level = { "X...X.XXX.XXX.X.X.X..XX..", "...X..X...XX...X...XXXXX.", ".X.XXXXXXXXXX.X..XXX.XXX.", "..X.XX..X..X....X..X..X..", ".XX.....X..XX..X.XXX.X...", "..XXX...X..XXX.XXXX.X....", "..X.....XX..X.XX.X..XXXX.", ".XX..XX.X..X.XX..X.X..X.X", "X..XXX.XX..XX.X.....XXX..", "XX.X...X.X.X.XXX.XX.X..XX", "XX.X.X.....XX.XXXXX.X..XX", "..XX...X.X.X...XXXXX....X", "XX.XX...X....XX..X..XX..X", "..X..XX.X..X.X.....XXXXX.", "XXXX.X.XX.XX.X.X.XX.X.XX.", ".XX.X....XXX.XXXX.XXXXX..", "XXXX..XX.X..XX....X...X..", "XXXXXXXXXXXXX....XX.X..XX", "....X.X.X..XXX.XXXXXX...X", ".X.X.X.XXX.XXX.X..X....XX", "X..X..XXX.XXXX.X.XXXXXX..", "....X...XXXX.XX..X..X.XX.", ".....XXX..XXXXX.XX.XXXXXX", "X..X.XX..X.X.X...X....XXX", "XX..X...X..X.XX.....XXX..", "X..X...XXX...X..X.XX.XX.X", "..X..X..X..X.X.X..X..XXX.", "..X.XX.X..XX.X.X...X....X", ".XXXXXXXX.XX....XX...X...", ".XX.XXX..XX...XXX.X.XXXXX", ".XX..X.X.X......X.X..X..X", ".......XXXXX....XXX..X..X", "X.XX...X...XX..XXX.....XX", "XX....XX.X.XX.XXX...XX...", "X.XXX..XXX...X.XXX.X.X.XX", ".XX..XXX..XXXXXX.XXXXXX.X", ".XX.X....XX..X....X..XXX.", "X...X.X..X.X..XX.X.X.X.XX", "..XX..XX...XXX.XXXX..X..X", ".X..XX..XX.X.XX..X.XX.XXX", "XX...XXXX.X.XX..XXX.XXX.X", "..X.X.X.XX..XX.X...XX.X..", "XX.XXXX.XXXX..XXX...XXX.X", "XX.XX.XX..XXX.XX...XXXX.X", "...X...X..X.XXXXX.X.XXXX.", "X...X.X.XX.....X..X...X..", "XXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 45;
        int coinColumn = 8;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case14() {
        String[] level = { ".X....X.XX.X", "X.......XXXX", ".X..XX.X..XX", "XXXXXXXXXXXX" };
        int coinRow = 4;
        int coinColumn = 12;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case15() {
        String[] level = { "XX...X.....X.X.XX.XX..XXX.XX.X.XX..", "...X...XX.X..XXXXXX..XXXXXX..X.XX.X", "XXXX..XX.X.XXX.X...XX.....X.X..XXX.", ".......X.X..X..X..X.XXXXXXXXX.XX...", "X.XXXX....XX..X...X.XXXXX..XXXX....", ".X.X.X...X.XXX......XXXXX.X.X.X..X.", "X.XX.XXXXX.XX.XX...XXX..X..XXX.X.XX", "X.XXXX.XX..X..X.X..XXX...X.XX..XX.X", "X...XX.X.X.XX...X.X.XXXX..XXXX.X.X.", "..X.X..XXX...XXXX.....X.....X.XX...", ".......X..XX.X...XXX.X.X..XXX.X...X", "....XX.X...X.X.X.XXXXXX..XX.XXXXXXX", ".X.XXX......X....XX....XXXXX.X.XXX.", "XX......X.X.X...X..XX...XXXX.X..X..", "X..XXX....XX.X.X.XX..X...XXXX.X...X", "X.X.XXXX..XXX..X....X..X.XXX..XX..X", ".X.XXX.XX...XXX.X...XX.XXXX..X...XX", ".X.X.X....XX..XXX..X....XXX.X.X.X..", ".XXX...XXX.X..XX.XXXX.....XXX.XX..X", "X.XXXX..X..X.X......XX.X.X.XXX..X.X", "X...XXXXXXX.XXXX.XXX....X...X.X.XX.", "XXXX.....X...XXX...XX.X...X.X....XX", "...XX.XXXX.X.XXXX..X....XX.X.X.XXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 9;
        int coinColumn = 6;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case16() {
        String[] level = { ".X.X.XX.XX.XX", "XX..XX.X.X...", "XX.X.XX...XXX", "..X.X...X.XX.", "X....X..XXXX.", ".XX....X....X", "X.XX....X..XX", "XXX.XX.X.XX.X", "XX.X..X..X..X", "X...XX.X.X...", "XX..XXXXXX..X", "XXXX.XX.X.X.X", "..XXXXXXXX..X", ".X.XXXX.XXXXX", "....XX.X..X.X", "X...XX.XXX..X", ".X..XX.....X.", "XXX..XXX.X..X", "XXX.XX.XXX..X", "X..X.X....XXX", "XX.X.X.XXXXXX", ".X..XXX.XXX..", "X.....XXX.XX.", "..X.XXXXXXXXX", "X..XX...X.XX.", ".X..XX.XX....", "XXXXXXXXXXXXX" };
        int coinRow = 22;
        int coinColumn = 2;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case17() {
        String[] level = { "XX.XXX..", "..X..X..", "..XX..X.", ".X.X....", "...XX..X", ".X..X..X", "..X.X...", ".X.....X", "X.X.....", "X.XXX...", "X..XXXX.", "XX.X...X", ".X.XX...", ".X..XX..", "XXX..X..", "..X..XXX", "XXX.XXXX", "X.X.XXXX", "...X..X.", "..X.XXX.", "X..XX.XX", "XX..XX.X", ".XX.XX.X", "XX...X.X", "...X....", "X.XXXXXX", "XXXXXXXX" };
        int coinRow = 24;
        int coinColumn = 2;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case18() {
        String[] level = { "XXX.X.XX..XX.X.X.XX", "XXXX..XX..XX.X.X.XX", ".X..X.X...XX..XXXXX", "XXX.X...X.X.X.XXXXX", ".X.X.X....X.X...XXX", "..X.....X.XX..X.X.X", "X.X.XXX..X.....XX..", "XXX.XXX...XX..X..X.", "..X...XXXXXXXX..X.X", ".XX...XXX.X....XX..", "....X.X..X...XXX...", ".X.XXX.X..XX..XX.XX", "XX.X....XX..XX...X.", ".XX.X....XXXX.XX..X", "XXXXX......X.......", "...X.X..XX....XX.XX", "XX..X.XXXX.X..XXXX.", ".X...X.X.X.....XX.X", ".XX.X.X.XXX..XX...X", "XXX.X.X.X.XXX.X.X..", "X.XXXX...XX.X.X..X.", "XXXXXXXXXXXXXXXXXXX" };
        int coinRow = 3;
        int coinColumn = 7;
        assertEquals(4, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case19() {
        String[] level = { "...XX..X.X......X...XX...XX...XXXXXX", "XX..X..X...X...X.XX.X...X.XXX.XXX...", "..X...X......XXX.XX..X.XXXX.X.X..X.X", "X.XX..X.X....XX...X....XXX..X.XXX...", "X....XX...XXXX.XXXXXX..X..X..X.XX.XX", "X.XX..XX.XX....XX..XX..XX...X.XX..XX", "XXX.XXXX.X...X.X.XX...XXX..XXX.XXXXX", "XXX....X.X.....X.XX..X.XXXX..X.XXX.X", "..X...XX..XXX......X.......X.XXX.XXX", "...XXX.XX..XXX...XX..XX.....X......X", ".XX.XX....X.....XX....X.XXX.X....X.X", "XXX....XXX.X.X.............XX.X..XXX", "X.X.XX..X.X..XXX.X.XXX.XX..XX.......", ".X..X....X.XXX..XX......XX.X.X..X.XX", ".X.XX.XX...XXX....XXX.X.X...XX.X.XX.", "..X.X.XXXX.....X...XXX....X.X..X.XX.", "X...XX....X..X.....XXXXXX..XX.X.....", "...XX.XXXX..X.XX.X.XXXXX...X..XXX..X", ".X...X..X...X..XXXXXX.XX..XX.XXXX.XX", "X.....XX.X....XXX...XXXX..X...X..X.X", "XXX....X..X.XXXXX..XX.XX.XX.X..XXX..", "X.XX...X...X..XX.XXX.XXXX..X........", "..X....XX..X...XX.X.X...X....X..X...", "XX..XX...XXXXX.....XX......XX...X.X.", "...XXX..XXX.X..XX..XX..X..X...X.X.X.", ".XXX..XXXX.X.....X...XXXXXX..XXXX...", ".X.XX..X.X..XX.XX..XXX....XXXX..XX.X", "XX.X.XXXX.X.....XX.X.XXXX.X.XXX...XX", ".XXXXXXX...XXX...XX..XXXXXX.XXXX.XX.", "X...X....XXXX.X....XX...XXXX......XX", "X.X.X..XX..X...X.X.X...XXXX.X.XXX...", "XXXX.X.....XXX.XXX...X.X.X..XXX.XX..", "X..XX.X.X....X.X..XXX..XXXX..XXX.X..", "XX..X....X...XX.XXXX....XX.XX.X..X.X", "..XXXX.X.XXXX.XX.XX.XX..XXXX...X..XX", "XXX...X.XX......X.X.XXX..X..XX..X...", ".XX.XXXXX.X.X.XX...X..X.X.X.X.X.XX.X", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 37;
        int coinColumn = 27;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case20() {
        String[] level = { "X.X..X..X.X.XXX..X..X.", ".XX..X..XX....XX...XXX", "X..X.....XXX..XX...XXX", "XXX.X.X.X..X..X.X.X..X", ".XX.....XX....X.X..XX.", "X...XXX.X..X...XX..XXX", "...XXXX.X.X..XXXX..X.X", "X...X..X.X....XXXXX.XX", "..XXXXXX.XX...X.X..X.X", "...XXX..X...XX..X....X", "X.XX...XXX.XXX......X.", ".XX.X...XXXX..X.XXXXXX", "XXX...X.X..XX.X..XXXX.", "..XX..X..XXXX..XX.X.X.", ".XX..XX.X....X.X.XXXX.", "XXX..X...X.XXX.X.XXX..", "X..XX..XX.XXXX...X..X.", "XXXX..XX.XX.XX.X.X..X.", "X.XXXXX..XX.X.XX.XXXX.", "X.X.XX.XXX..XXX.X.XX..", ".X.XXXX.XXXX.XX.XXX.XX", "..X.X.X.X.XX.X....X.XX", "XXXX......X..XXX..X...", "....X.X..X...X..XX.X..", "XX...X.XXXX..X..XX.X..", "..XXXX.X.XXXXX.X..XXXX", ".X..XXX..XXXX.X....X..", "........XXX.XX..XX..X.", "XX.XXXX........XX.X...", "..XX.XX..XX.X..X...XX.", "..X.X....XXX..X....X..", "....X.XXXX.X.X..XX..X.", ".XXXX...XX..XX.X.X..X.", "..X.X.XXX.X...XX...X..", "...XXX...X..XX..XX.X..", "XXXXX.XXXXXXXX.X.X.X..", "...X.XXXX...X....XX...", "X.XX..XXX..X...X.XXX..", "XXX..X.XX.XX.XXX.XXXXX", "XX..X...X...XX.X.XXXXX", "X..XX.XXXX..XX...X.XX.", "X.X...XXXXX.XX.X.X.X..", "X.XX...X..X.XX.X...X..", "XX.XX.XX.X.X...XX..XX.", "X.XX.............XXXX.", "XXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 36;
        int coinColumn = 13;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case21() {
        String[] level = { "XXXXX.XXXXXXX.X..X.XX.XX.XX.XX.XX.X..X.", "..XX..XX.X...XXX.XX...XX.XX..XX..XX.XXX", "X.X....X.XXXXX...X.XXXX...X.X..XX...XXX", ".....X.X..X.X.XXX.XXXXX.X.X...XX.X.....", ".X.X.XX..X.X..XX..XXX..X....X.X.XX...X.", ".......X.XXX.....X..X.X.XXX..X...XXXX.X", ".X.....XXXX.XX.XXX...XXX..XX..XX.XXXX.X", "X....X.XXX..XX..XX.X.X...XX......X...XX", ".X..X.XXXX..X..X.....X....X...XX.X..X.X", "X.....X.X..XXXXX.XX..X....X..X.X.X...X.", "XXX.XX.XXXXX...XXX.XX.XXX..XXXX..XX.XXX", "X..XX.XX.XXXX..XX..XX.XX..X..X.XXXX.X.X", "X.X..XXX..X.X..XX..X..XX..X..X..X.XX..X", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 8;
        int coinColumn = 22;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case22() {
        String[] level = { "XX.XXX", "X.XXXX", ".XX.X.", "X.XXX.", ".XX.XX", "XX.XXX", "X.XX.X", "X...XX", "XX.X..", "....XX", "XXX..X", "....XX", ".XX..X", ".XX.X.", "XX.XXX", "XXXXXX" };
        int coinRow = 2;
        int coinColumn = 5;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case23() {
        String[] level = { "XXXXX.XXX.XXX.XXX.", ".XXXX..X.XXXXX.X.X", "X.XXX.X.....XX..XX", "..X.XX..XX.XXXXX..", ".XXX...XXXXX.XXXX.", "XX..X..XXXXX..X..X", "XX.X..XXXX.....X..", "X.XX..XX.XX.X....X", "XXXXX.X.XXXX.X.XXX", "XXXXX..XXX...X.X..", "X.X.XXXXX.....X.X.", ".XXXX.X..X.XX....X", "XX.X..XXXXX.X..XX.", "XX.XXXXXXX..X.X.X.", "XX..X.X...X.X.....", "X.XXXXXXX.XX.X...X", "XX..XX.....X..X.XX", "....X.X..X.XX.....", "..XXX.X.X...X....X", ".XXXX.XX.X.XXXXXX.", ".X.X.X.XXXX..X....", ".X..XXXXX.X.....X.", "..X.X.....XX.XXX..", ".XX.XX.X..X..XX...", "XX.X.X..X.X....XXX", "...XX...XXXX..X..X", "XXXXXXXXXXXXXXXXXX" };
        int coinRow = 5;
        int coinColumn = 12;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case24() {
        String[] level = { "XX.X..XX..XXX.X.XX......XXX..XX.XXXXX.", ".X...X....XXX.X..XX.X.XXXXXXXX.X...X.X", "XXX.XX.XX....X.XXX.....X..X.X.XX.XX.XX", "X.XXX.X..XX.X..X..XXXX..XX.XXX.X..X...", "..XX.X..XX.XX..XXXX...XXX...X..XXXX...", ".X...X.X..XX...X.XX.X.XXX.X....XXX.XX.", "XX.X.XX......X.X.X...X.X.XXX..XXXX...X", "...XX.XX.X.....XX....X....X.X.XXX.XX.X", ".X.XX..X...XXX.XX.XX...X.XX..XX.X.XXX.", "..XXX....X.....XX.X...XXX.......X.....", "...XXXX.XXXXXX..XXX..XX.....X.X.X.XX..", "X.XX.X.XXXXXXX.XXX.XXX.XXX.....X..XXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 5;
        int coinColumn = 12;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case25() {
        String[] level = { ".X.X...X.X....", ".XXX.X....X..X", ".....X.X..X.X.", "X.X..XX...XX..", ".XXXXX...XXX.X", ".XXX.XXXX.XX.X", "XX.X..X.XX..XX", "XXX..X..X.XX..", "X.XX....X...X.", "..X..X..XXXX.X", "XXXXXX..XXX.X.", "..XX.XXXX.X...", "XXXXX...X.X..X", "...X..XXXXXX.X", "XXX..XXX.X...X", "X...X.X.XXXX..", "....XXX.X....X", "....X.X.....XX", "X.X.XXX.XX..X.", ".XX.XX.XX.XXX.", "..X.XXXXX.....", "XX.X.X..XXXX.X", "..X.....X.XXX.", "....X..X.X.X.X", "X.X.X..X.XX.X.", "..X.XXX..X...X", "XXX.XXXX...X.X", ".XXXXXX...XXXX", "...X.XXXXXX...", ".XXXX...X..XX.", "X....XXXXX.X.X", "X.X..XX..X....", ".X.X.XXXX.XXXX", "......XXXXXX..", "X..X.XX.XX.X..", "X.XXXXXX.X.XXX", "...X.XX.XX.X..", "..X....X....X.", "X.X.XXX..XXX..", "XXX.X..X.X.XX.", ".XX.X.XXX..XXX", ".......XX..X.X", "X..XX...XX..XX", "XX.X.X...X..XX", "XXXXXXXXXXXXXX" };
        int coinRow = 40;
        int coinColumn = 2;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case26() {
        String[] level = { ".....XXX...XX....X.X...X", "X...X...X..X...XX....X..", "...X.......X.XXX.....X..", "XX......X.X.X..X...X....", ".........X.XX......X.X..", "...........X...........X", "X.X..X.XX.XX...X.X......", "XX...X.......X..........", ".......X.X.X...X......X.", "...X.X.....XX..X...X..X.", ".X.....X..X.X......X...X", "X..X......X.X........X..", ".X.X.XX...X.XXX........X", ".X......X...X..X.X......", "X...X.XX...X....XXX....X", ".XX.XX.X.......XXX......", ".....X.XX..XX.X.X..X.X..", "...X.......X..X..XX..X..", ".......X..XX.X.....X....", ".............X......X...", "........X.....X....X..X.", "......X.XX..X........X..", ".X.X..X...X...X....X..XX", "......X...X.....X.....X.", ".X......................", "...X..X.....X...XXXX...X", "...X........X..X...X..X.", "XXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 6;
        int coinColumn = 12;
        assertEquals(4, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case27() {
        String[] level = { "....XX....X.X..................", "X......X..X.XX...X......XXX....", ".......X..X.....XX..X......X...", "...............X...............", "..XX....X.X..X..X.........X....", ".X..XX.....X..X.X......X.X...X.", "....XX.XX.X..X..X.X.....XX..XXX", "......X.XXX....XXX....X........", ".X.X...XX.X.........X.XX.X.X...", ".........X....X...X.........X.X", "..X......XXX......X.........X..", "......X.X.X.XX..X.....X.XX.....", ".....XX.X.......X...X.X...X..X.", "..XXX....X..X..X......X...X...X", "X...X..X.....X.....X.X.X.....XX", ".....X...............X......XX.", "X........X.....X.XX...X...X..X.", "X.X..........XX....X....X......", ".X...X...................X...X.", ".X.....X....X...X......X.X.X..X", "..........X......XX.X..........", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 7;
        int coinColumn = 17;
        assertEquals(6, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case28() {
        String[] level = { ".X.XX.......X.....XX.......X....XX....X", ".XX.......X.........X....X......X...XX.", "......XXXX......X...X..XX..X...XXX.X...", "..............X.X...........X..XX......", ".......XX..X........X...XX.X......XX..X", "X.X...XX.X.XX.XXX..XX.X.......XX.....X.", "......X.......X.X....X..X...X.X........", "X.X..X..XX...X...X.....X..X..X....X....", ".X...X.....XX.............X....X.......", "X...........XX...X.X...X...........XXX.", "...X......X.....X..X....X.X.....X......", "......X.X..X.X.........X.X..X..X.......", ".....X..X......X...X.X.......X..XX.X...", ".X......X...X..........X......X.XX.X.X.", ".XXX...XX...X..X........XXX.......X....", ".X.XX..X..X..X........X....X...X....X..", "X...XX...X........X.XX..XX.....X.X.X...", "..XX.......X...XX...X.X..X....X......X.", "......X.XX......X.X...X..X.X.....X..X..", "X........XX.X.XX.......X.X...X......X..", "X..XX.X.....X..X......X.X.........X....", "X.X..XXX..X.....X.......X..X..X......X.", "...X...XXX..XX........X.X.X.X...XX.....", "X....X...X....XX...XX...X...X......X...", "..X............X.X..X..X...X..X....X...", "....X............X....X.........X.X...X", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 5;
        int coinColumn = 12;
        assertEquals(5, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case29() {
        String[] level = { "X...X.X.X.XX..X..X.......", "X..X...............X.....", "XXX....X.XXX...XXX...XX..", "..X....X........X.......X", ".......X.................", "..X.....X..XX..X..X...X..", ".X...X.....X...X..X.X..X.", "..X....X.X.X......X....X.", "..X..........X.....X.XX..", "X.X...X....XXX.....XXX...", ".X.......XX..X.XX..X.....", "......X.XX....X..........", ".X..X..........X.X.......", ".......X.X.X.X....X......", "......X.X.X...X..........", ".XX......X..X.....X....XX", "X..........X..X..........", "......X....X..........X..", ".XX......X....X..X...X...", "XXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 10;
        int coinColumn = 20;
        assertEquals(9, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case30() {
        String[] level = { "..........X", "XXXXXXXXXXX" };
        int coinRow = 2;
        int coinColumn = 4;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case31() {
        String[] level = { "...X.X......X.X....X...X...........XX", "...............X..X..X...X..X....XX..", ".X..X.........X.X.....XX....XX.....XX", "X.....X....XX.X.X.X.XXXX.X....X..X...", "....X.X.XX..XXXX..X.........X.X......", "..XX......X..X...X..X.....X.X.XXX...X", "........X..X.......XX..X..XX...X..X..", "....X.X.XX....X............X.....X...", ".XX..XX...X..XX..........X.X...XX..X.", "XX.....X...XX....X....X...........X..", "........X...X.X.....X..X.X..XX.....X.", "....X..X.X......X.....X.....XXX..X..X", "X...X.X..XX...X......X..X...X.....X..", "....XX.X.......X.X...........X.X...X.", ".XX...X..X......XXXX.X.X....X....X.X.", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 11;
        int coinColumn = 21;
        assertEquals(4, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case32() {
        String[] level = { "X.X.....X.X.X...X....X.X....", "X.X..X.....XX.....XX....XX..", "....X..XX..X................", "..X......XX..........X..X...", ".X.....X.X...XX..X..X...XXX.", "...X..X.XXX.X..X....X..X....", "XXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 22;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case33() {
        String[] level = { "........X..X.......XX.......X..........X.", "....XX.....X.....X.X.XX..XX.........X....", "X.X....X..X.....X...X.XXXX....XX.X..X....", "X...............X.....X..XX.....XXX......", ".XX.....X.X....XX..X........X.....X......", "....X........XX..X......X......X.....XX.X", "X.............XX....X.X......XX..........", "...........X.....X.......X..X.X.XX..XXX..", "............X.........XX......XX.X...X...", "X...XX..X................X......XXXX..X..", "....X.........X...X.....X..X.X..X.X.X....", ".........X...XX............X.XX......XX..", "X...X..X..X..........X.........X...XX....", "..XX..............X.X....X.X.X..XX....X..", ".X...X..X..X.......X..X...X...X....XX...X", "........XXX......X..X..X..X....X....XXX..", "X.........X...X...X..X.........X........X", "...X...X..X..XX.XX...X.XXX....X.XX...XX.X", "........XX.X.....XX.......XX...XX..X..X..", "X...X..........XXX.....X...X......X..XX.X", "....X.X...X.....XX.......XXX...X.......X.", "X.......XX....X.X...................X....", "..X.XXX......X.X.......X..X..X...X.X..XX.", "..X.....X......XX......XX..X...........X.", ".......X.................XXX.X..........X", ".X.......X.XX........X....X......X.......", "............X..............X...X.XX......", "X.....X...........................XX.X...", ".........X.X...................X.........", ".X....X...........X..X......XX.......X...", "X.......................X.X....XX..X...XX", "......................X..............XX..", "....X....X..X....XXX...XX....X...........", "...X.....X....X.......X.............XX.XX", ".X.XX..X....XX.........X.X.XX........X...", "...........X.....X....XX.........X...X...", "...X.....X............X......X.X.X.X.....", "..X...........X.X....X...X.X.......X.....", "...XXXX.X.XXX...XX.X...XX......X.XX...X.X", ".X....X...XX......X.X.XX......X......X..X", ".X.XX.X....XXX...............XX......X...", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 18;
        int coinColumn = 41;
        assertEquals(6, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case34() {
        String[] level = { "...XXX.X..X..X....X.....", "XXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 2;
        int coinColumn = 10;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case35() {
        String[] level = { "..", ".X", "..", "..", "..", "..", "..", ".X", ".X", "XX", ".X", "..", "X.", ".X", ".X", ".X", "..", "..", "..", "X.", ".X", "X.", "..", "X.", "..", ".X", "..", "..", ".X", "..", "..", "..", ".X", "X.", "..", "..", "..", "X.", "..", "..", "..", ".X", "XX" };
        int coinRow = 22;
        int coinColumn = 1;
        assertEquals(9, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case36() {
        String[] level = { "..X.X...........XXX.X.X....", "...................X.X.X...", ".XX.....X.....X..X.....X...", "..X...X.....X....X...X.....", ".......X.X...XXX.X..X.XX..X", "XX......X..X....X.X...X....", "...XX.X.XX.XXX..X........X.", ".X....X...X.............XX.", "..X.XX....X............X...", "...X.X.X...............X...", "XXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 11;
        int coinColumn = 21;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case37() {
        String[] level = { "..X......XXX..XX.......X..X.......X..", "X.....X..X...............XX..........", "..X......X....X.......X.......X....X.", "X.........X....X.X...X..XX.........X.", "X.XX.X..X..X..X....X.........X....XX.", "X....XXXX.......X.X..X....XXX.....X..", "X..XX.XX..XXX.......X................", "X...X.....X.......X...X..X..X........", "..........XX...XX..XX.....X..........", "X.....XX.....X.....X.XX..............", ".....X..XX.X.....X....X.......XXX....", "..X...XX.X.XX..XX..X...........X.X...", "..X...XX....X.X.......X..X.X...X...XX", "...XX..........X.X....X..X.X....X..XX", ".X...........XXX....XX....XX....X.XX.", "..XX.XXXX.......X.XX.....XX...X.X..X.", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 17;
        int coinColumn = 12;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case38() {
        String[] level = { "........X..XX...X.X..X.XX.X.....", "..X.........XX......X.X..X.....X", "......X..X...X...X..X...X...XX.X", "........X....X...X..............", ".......XXX.X..X..X..X....XX...XX", "X.X......XX..X...X........X....X", "..XXXX..........X..........X.X.X", "......X..........XX.X.X.........", ".....XX.X...X..........X..X.X..X", ".X.X..X.....XXXXXX........XX....", "...XX.X..X...X..........X..X.XXX", ".XXX.....X....X...............XX", ".X..XXX.X....XX..XX...X.XX.XX...", ".X....X......X..X.X.X........XX.", ".......X......XXX..........X...X", "..X................X....XX....X.", "..XX....XX..XX.....X..XX...X....", "..X...XX.X.........X.X.....X....", "..X.X.......X.X........XX.......", "...X...X................X.X...X.", "...X.X...X...X..X.XXXX....XX.X..", "XXXX...XX......X.X.....XX..XX..X", ".............X.X.X..XX..X.XX....", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 18;
        int coinColumn = 20;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case39() {
        String[] level = { "X..X.X.X.X..X.........X....X.", "X..............X......X.X..X.", "........X..X....XX..X.X.....X", "..X........X..X..X...........", "X..XX..X..X..XX.X.XX....X....", ".XX.X..X..X.....X.XX.XX.X...X", "XXX..X.X.XX...X..XX..........", "...X.XX..XXX.X..X..X.X.......", ".X.X..........X.......X...X.X", "........X....X.X....X.....X.X", ".X.X......XX..X......XX.X...X", "...XX..X.X.......X.......X...", "......XX.X.X....X...........X", "..XX.....XX....X.X.X...XX....", "..X........X.....XXXX...XX.X.", "...XX..........X.....X.......", "X...X.X..........X.....XXX...", "....X..X...X....X............", ".........X..XXX...........X..", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 7;
        int coinColumn = 1;
        assertEquals(7, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case40() {
        String[] level = { ".........XX..X..X....XXX......", ".X........XX.......X......X...", "X........XXX..X...X...X.....X.", "....X.X.X.XXX.X.X...X.X...X.X.", "XXX.X.X....X...........X.XX...", "..X.....XXX..X..X..X.....X..X.", "X........XX..XX...XX...X......", "....XXX.X..X.X.X....X...X.X.X.", "...X.......X..X......X......XX", ".X...X........X.......X.......", ".....X.X..........XX..X..XXX..", ".......X........X.X...XXX.....", "..X.X.......X.......XX.X...XX.", "..X.XX....X.......XX.....XX...", "......X....X.XXX....X...XX.XX.", ".X....X.X.............XX....XX", "..XX.XX.......XX.X.....X..XX.X", "...XX..X.XX.XX..X.X.X.XX.....X", "....X.....X.XX..XXX.X..X.....X", ".......X......X...X...X..X..X.", ".....X....X..X......X...X.X...", ".XXX....X...X............X..X.", "XX.X.........X...........XX.X.", ".........X..X.X...XX..X...XXXX", "...XX..X..X...............XXXX", "X.........X.XXXXX...........X.", "......X...X.XX............X...", "X..X...X...X.....X.....X...XX.", "...X.........XX....X..X.X.XXXX", ".X..X........X..XX.....X...X..", "X.X.X.......XX..........X....X", "..X...XXX.XX.......X.....X.XX.", "X....X.X..X.X....X....X...X...", "........X....X......X.X...XX..", "X..X.........X...X...XX.......", "X.X............X...X...XXX.XX.", ".X..X.X.........XXX.X..X..X...", ".......X...X.X....X...........", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 13;
        int coinColumn = 29;
        assertEquals(4, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case41() {
        String[] level = { "X.XX..X.XX...X.......X........X.........", "....XXX..............X..XX......X.....XX", ".....X.X...X....X...X............X..X.XX", "X....X............X......X.....XXXX.X...", "..X.....X.......X.X...X.....X.X.........", ".X....X.....XXX...X...X....XXX.......X.X", ".....XX.X....X.X.....XX..X.X........X.X.", "..X.XX.............X...........XX.......", "...XX.X............X.X....X..X.....X....", "..X..X....X.X.X....X.........X..X.......", ".....XX.....X.X.XX.X...X.XX.XX......X...", "X.X....X....X..X....X..X....XX.X.......X", "....X.........XX.X....XX.......X.X...X.X", "..X.XX..X.....X.X.......XX..XX......X.X.", "X...........X......X...X.....X.XX.......", "....X.XXX.........X....X..X..X.X........", ".XX...X.XXX.X...X..X.XX...XX............", "X..X..X....X.........X...X.X.XX.X.X.....", "XX...........X..XX.......X.......X.....X", "XX..X....X...X.X..XX..X.X............X..", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 17;
        int coinColumn = 27;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case42() {
        String[] level = { "...X...X.......XX.X...X.XX.X..X.XX...", ".X.X..X..XX...X..........X........X..", ".XX.X...XX....XX.....X.......X.......", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 23;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case43() {
        String[] level = { ".......XX...X...X.X..X....X.................", "X....X.....X.......X..XX..X..X..X.XX...X....", "..X......X.X.....XX.....X...XX.........XX..X", "..X......X..XXXX..XX...XXX..X.......X.......", "X..XX..................XX.....XX....X...X...", "...X.X..XX.X.XX..X.X...X..X..............X.X", "..X...X..X.....X.....X..X..X..XX.....X...X..", "X...........X....X..X.X.X.X.....X.XX..XX.XX.", "X.....X..X......X..X.......X.....X.X.....X..", "........X...XX...XX..X..........X...X.......", "...X.......XXX....X........X......X......XX.", "X......X.X....X.....X..X.......X..........X.", ".XX.XX.X..X...XX.......X.XX.....X....X.X..X.", "......XX.......XX...........X.X.X...X....X..", "...X.......X.X...........X.X......X.....X..X", ".XX...X.X.....XX....XX..........X.....X..X..", "......X...XXX..X..X............XX.X..X......", ".......X..XX.......X.XX.....X....X.....X..X.", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 19;
        int coinColumn = 15;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case44() {
        String[] level = { "XX.X...X..X......", ".X..X..X..X......", ".......X....X...X", ".XX...X..........", "....X.......XX.X.", "X.X.X...X.XX.....", "X..XX...X..X.X..X", ".....X...........", ".X..X...X.XXX....", "......XXXXX.X..XX", "......X......X.X.", "XXXXXXXXXXXXXXXXX" };
        int coinRow = 2;
        int coinColumn = 8;
        assertEquals(7, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case45() {
        String[] level = { "...X..X..X....X.XX....X.X.X..XX", "X.....X........X.....X...XX.X.X", "XX.XX.X...X.X.X.XXX.X.X..X...X.", "X...X........X.X..X.....X......", "X..X.......XX...XX..X..X.....XX", "X...XX.......X.....X..........X", ".X..X....XXXX......X.X.X...XX.X", "...........X.....XX..X...X..X.X", "......X.X.XX..X.....X..X.X..XX.", ".X..XXX.X.............X........", ".X.X.XXX...X...XX..X..X.X..XX..", ".X.X......X.X..X.......X......X", "X.X..XXX.XX..X..X...........X..", "...X......X......XX..XX.X.XX.X.", "..X.........XX......X.X..X.X...", "..X...X....X..X.X......X.X.....", "..XX.......X........X..X.....X.", "X...X.....X......X.X..X..X.....", ".....X.......X.....X.X...XXXX..", ".X.....X...X.......X.X.........", "....X..X.X.X..XXX...XX...XX..X.", "XX....X.......X...XX.......X...", "..X....X....X.......X.X..X.X..X", "..........X...X..XX.....X.XXX.X", "..XX.X....X.....XX.............", ".......XX....X..X.X...X.X.X.X..", "...X.X.......X..XX..X.....X....", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 21;
        int coinColumn = 17;
        assertEquals(4, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case46() {
        String[] level = { "...X.....X.", "...........", "X......X...", "X.X........", "....X......", "......X....", "........X.X", "...........", "...........", "..........X", ".....X.X..X", ".X.X.......", "...........", "X.X........", "........X..", "......X....", "..X........", "...X.X....X", "...X.....X.", "....X....X.", "....X..X..X", "....X.X....", ".....X.X...", "XX.....X...", "......X....", "...........", ".....X....X", "...X.......", "...........", ".X....X....", "XXXXXXXXXXX" };
        int coinRow = 3;
        int coinColumn = 1;
        assertEquals(10, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case47() {
        String[] level = { "....................X...XX...X......", ".X..X....X..........X.X............X", "...........X....X..X.........X.X...X", "......XX...X.........X..............", "....................XXXX.X..........", ".........XX.X...X.....X.X.X...X...X.", ".............X........X.....X.......", "......X..X.X...X.X..............X...", "..........X....X.X........X.......X.", ".....X....X....X.XXX........X.......", "..........X...X.X...................", ".....X............XXX......X........", "..X...X..........................X..", "........X....X......XX.XX.X.........", "X......X.........XX.......X..X..X..X", "......X.X...X.....X...............X.", "....X.X...X.....X..X..........X.....", "X.....X....X..XX...........X...X....", "XX..........X....X.....X...X..X..XX.", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 10;
        int coinColumn = 16;
        assertEquals(8, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case48() {
        String[] level = { "...X.............X.X.X.", ".......X.....X........X", "............X.X..X.....", "...X....X.........X....", ".........X.....X...X...", "...X.X...X.............", "..X....X...............", "............X..X.X.....", "XXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 3;
        int coinColumn = 13;
        assertEquals(5, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case49() {
        String[] level = { "X....X.....", "........X..", "X..X.......", "X.X....X..X", "XXX........", ".........X.", "X.X..X.X...", "...X.......", "........X..", "...........", ".....XX....", ".X.........", "...........", "..X........", "...........", "..........X", ".X.........", "...X.......", "X...X.X....", "...........", "..XX..X....", "........X.X", "...X.......", ".....X.X...", "...X.X..X..", "....X......", "X..........", ".XX.X..X.X.", "....X.....X", "...........", "...........", "......XX...", "......X.X..", "........X..", "....X..X...", "X.X........", "XXXXXXXXXXX" };
        int coinRow = 29;
        int coinColumn = 11;
        assertEquals(8, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case50() {
        String[] level = { "...", "...", "...", ".X.", "X..", "X.X", "X..", "..X", "..X", "...", "...", "...", "...", "...", "...", "X..", "...", ".X.", "...", "XXX" };
        int coinRow = 5;
        int coinColumn = 1;
        assertEquals(9, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case51() {
        String[] level = { ".XX......X..X.XX..X.......X...X....X...X..", "................................X.........", "..X..................X...................X", "..X...........X.....X............X..X.X...", "...............X....X..........X...X......", ".......X............XX......XX.X..X..XX...", ".....X...X.......XX.....X..X.....X.......X", "..............X..X.X.X....X.........X..XX.", ".X....X.X...........XX............X.......", "........X...X.X...X.X..X.X............X...", "....X....X..X......X.....................X", "......X......X.....X...X......XX.X.......X", "...XX..........X........X..X..X........X..", "..........XX......X.......XX......X.......", ".X..........X...X........X..X....X.....X.X", "...XX.....................XX......XX.XX...", "..X........X.......X....X............X....", ".....XX.......X......X.........X..X...X...", ".......X....XX..X....X........X....X......", "...X........X...X.X.X...X................X", "...................X...............XX....X", ".....XX........................X..........", "..........X.X.......X.....................", "........X......XX.......................X.", "....X.XX.XX..X....X....XX...............X.", "..X...........X....XXX...X................", "..X....X..X.....X..............X....X.X..X", "XX.................X..X.....XX...X........", "..X..XX...X......X....XX..................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 30;
        int coinColumn = 4;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case52() {
        String[] level = { "....X..X.....XX...........X...XX......X.X....", "....X.....XX......X.......X.................X", "....................................X........", "X.X.......X.........XX..X.X.......X..X.......", ".........X...X.X....X..........X.X...........", "........X..................X.................", "..X........X.....X.....................XX...X", "...XX....X..........X............X........X..", "....X...XX...X.......X.......X...X....XX.X.X.", ".X...X......X.X.X.X.......X...X.X..X...XX....", ".X......X..X.........XX....X........X.....X..", "........X....................................", "X..X................X.X.....X..X..X........X.", ".............X........................XXX....", "........X.......X....X.X..X....XX............", "....X................XX......X...XX..X..X....", "..................X...X...X.X........X....XX.", "...........XX...........X....X...XX.........X", ".....X............................X.X..X...X.", "....XX..X.........X..............X...........", "................X........X....X..X....X......", "..X....XXX...XX...X....X...XX....X..X........", "X..........X...X.......X.X......X......X.X...", ".X..XX..........X....X......XX......X.X......", "........X.....................X..............", "...X.......X........X...........X.....XX....X", "..........X......X..X...X....................", "..........XX..XX..X.X.X........XX............", "...X....X...X..X..X...X....X........X.....X..", "......................X..........X....X.XX...", "....X......X..X.X....X.X.......X......X......", "X.....X......XX.........X.X....X.............", ".X....X...X...........X...X.X.............X..", ".........XX...XX....X.......................X", "......X........X.....X...X.X............X....", ".X..........X...X......X.......X.X....X..X...", "...........................X..............X..", ".X........................XX.....X..........X", "...X......X........X.............X.....X...X.", "XX...................X.....X..........X.X....", "X.......XX.....X..X..................X.X...X.", ".....X......X......X..X.......X..X........X.X", "....X...........X....X..X....X.X.........X..X", "..X......X...........................X......X", ".........X...X....X..X.X....X.....X....X.X.XX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 43;
        int coinColumn = 45;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case53() {
        String[] level = { "..X.................X....X...........", ".X.................X........X........", "....X................X.X.XX.XX.......", "......X.............................X", ".X.....X......X.........X........X...", "X.....X.......X......................", "...XXX..........XX.X.X..X...X........", "X.....X..........X...................", ".........X....X.......XX.X......X....", "..X..............................X...", ".X.......X............XX...X.........", "..........X.....................X....", "....X.X.....XX.............X..X..X.X.", "XXX............XXX.......X..X.X...X..", ".X.................X.....X.......X...", "...X......................X.X......X.", ".................X..........X..X.....", "..X.......X.X.X............X..X.....X", ".X..X...X..X.....X........X..X....X..", ".......X...................X.X.....X.", "...X.......................X.X......X", "...X.....X.....X......X...........X..", "......X.......X...X.....X..X...XX....", "X.....................XX..X..........", "...X...........X.........X.......X.X.", ".....X....XX.........................", "....X....X.............XX............", "....X...................X.....XX.....", "..X..X.....X..X.....X.X...X..........", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 22;
        int coinColumn = 4;
        assertEquals(5, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case54() {
        String[] level = { "..X..X.....XX......X...X..........", ".X.X..XXXX.............X.......X..", ".........X...X...X.X.........X...X", "X..X............X.X...X.....X...X.", ".X................X.X.....XX......", "...X...........X...........X......", ".X.........X...........X.X.X......", "..X..X.....X.......X.X............", ".XX..........X........XX..........", ".X...X.XX.....X.X...............X.", "........X...X..X.XX.X.X.X..XX...X.", "X...............X...............X.", "..........X.......X..............X", "XX..XX..........X.X..XX...X.......", ".X....XX.X...XX..........X........", "............XXX..X................", "........X..XX..X..XX.........X.X..", "...X..X.X.................X......X", "......X..........X..X........X....", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 16;
        int coinColumn = 18;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case55() {
        String[] level = { "....X....X.XX.X...X.", ".....X.X...X.....X..", ".........X........X.", ".X..........X.......", ".........X..........", "X....X...........X..", "..X...X...........XX", "...X......X......X..", "....X...X...........", "...........X.X..XX..", "....X..X............", "...X......X.........", "................X...", ".....X.............X", ".........XX.....X...", "....X....X.....XXX..", ".......XXX.......X..", ".............XX.....", "..X.X....X...X...X..", "..........X.XX..X...", "XX....X..X..X.....X.", "X......X.X...X......", "..XX.X..XX....X..XX.", ".....X.........XX...", "....XX.X.....X..X...", "...X...X....X.......", "............X......X", "......X....X........", "X.X....X.X.X......X.", ".X.............X....", ".X...X.X..X..X.X....", ".X...............X..", ".X.X....X.......X...", ".X.........X........", ".............X.....X", "....X.........X.....", ".........X.......X..", ".XX....XX........X..", "..X............X...X", ".......X...........X", "X.............X.....", "X..X................", ".............X..X...", "...XX....X.....X....", "......X.....X.......", "......X.............", "XXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 16;
        int coinColumn = 17;
        assertEquals(8, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case56() {
        String[] level = { "..........XX.....X...........X........X...X......", "...............X...X.X.......X..X.........X......", ".............XX..X....X.....X..X...X...X.........", "...............................X.....X.....X..X.X", "...X.X....X...........X...XX..............X......", ".....X........X.........X..........X....X.X......", "X...............X....X...XX..X.X..X.............X", "X.X...X....................XXX....X......X.X.....", "..................X..X.......X.......XX..X..X...X", "......X....X.................X....X...........X..", "......X.X...XXX.........X......X..X..........X.X.", "......................XX...X.X......X.X..X.X.....", "....X......X......XX..........X...X.....X........", "............XX.......X....XX..X...X.............X", ".............X.....X.......X.X...................", "............X....XX.....................XX.......", "....X................X.X.X.X.X.........X....XX...", "........................X...X...........X........", "...X.X...X.X.XX.X....X...X......X...X......XX.X.X", "X............XX..........X...X......XXX....X.....", "...X....X....X.......X.....X............X.X.....X", "..X.............X.XX......X.....................X", "...X.X.X..X.X...X..X....XX.....X..XX....X..X..X..", ".....X....X..........XX...................X......", "...XXX.X..X.....X.X....X.X..............X...XX...", ".X.......X..X..X...X...X.............X......X...X", "..............X.X...X...........X......X.........", ".X.........X..X........X...X.............X...X...", "X...X...XX.........X..X.........X......X.........", "X.XX..............................X....X.........", ".......X.X....X.......X.....X............X...XX..", "........X.X.....X..........X.................XX..", "..X.......XX.....X..X.XX.......X........X.......X", ".................X.........X..X.X..X.............", "....X........X..X..X...X..X....X........X....X...", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 5;
        int coinColumn = 43;
        assertEquals(15, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case57() {
        String[] level = { ".XX.........X...............", ".......X...X......X.........", "....X.....X........X........", "....X........X.X...X..X.....", "..X...X....XX...X......X....", "..X........XX.....X.......XX", ".....X.........X........X...", "................X.X.......X.", "X.....X....X................", ".....XX....X.......X..X...X.", "......X..........X.X.......X", "..X...X.X.......X.X..X......", "....X...XX...X..............", "..XX..XX.....X.....X...X....", "....X...X...........X.......", "...X...X.....X.X............", ".....................X......", "X.....................X....X", "..X..X...X......X.....X.....", "XX..............X..X.XX.X...", ".....X.........X....X..X....", "........X......X....X.......", ".................X..........", ".....X..........X......X....", "....X....X..XX..X...........", ".....X............X.........", "...........X......X.XX.....X", "......X.X...........X.......", ".X.....X.XX.......X......X.X", "...X..XX..............X....X", "......X..........X..........", "......X..............X......", "..X..X....XX..X...X........X", ".X.............X......X.....", "X.....X......X.............X", "...........X......X.X.......", "XXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 16;
        int coinColumn = 4;
        assertEquals(14, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case58() {
        String[] level = { "......X..........X......XX.....X..X...............", ".X....X....................X...........X..XXXX....", "..........XX...X.........X..X.....X...............", "...X.X.X.X.....X....X........X...X................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 5;
        int coinColumn = 45;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case59() {
        String[] level = { "....X..X", "XXXXXXXX" };
        int coinRow = 2;
        int coinColumn = 5;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case60() {
        String[] level = { "....XX..X....X.X.XX........X.......X...", ".....X.XX..........X...............XX..", ".....XX..XX........X......X.........X..", "X....X...XX.........X...X....X.X.......", "....X.X.X...X..X......X.X.X........X.X.", "...X..X.............X.................X", ".X...X........X........X...........XX..", "X...............X...XX......X..XX....XX", ".X...X.........X.X..........X..........", "...XX.X..X..........X................X.", ".X.......X.X............X...XX.........", "...X.X..XX...X......X.....X...XX..XX...", "..XX.X..X.........................XX...", "..X...X.X......X.X..X......X....X....X.", ".....X....X.........X..........XX...X..", "X........XX..............X......X...XX.", ".....X...............X.................", ".X.......X....X.....X.XX........X...X..", "X..............X......X................", "..XX..X......X..........X...X..X......X", "............X...X.........X....X.......", "......X........XX.....X.....X...X......", ".........X.....X.......X..X......X.....", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 8;
        int coinColumn = 32;
        assertEquals(4, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case61() {
        String[] level = { "..........X....X.X..X........X.", "......X...X....X.......X.......", "X.....X.X.............X.X.....X", ".........X..X.........X..X.....", ".......X.......X.X.....X.......", "...X.X........X..............X.", "X..X........XX........XX.......", ".X........X..X......X....XXXX..", ".X............X..X.....X.......", "XX....X.XX.....X.....X....X.X..", "..X.....X................X.....", "X..X........X..........X.X..X..", "X.........X.....X....X..X....X.", "X...X......XX..................", ".X............X....X.X.........", ".....X.X....X...XX.....X...XX..", "......X.XX....X................", "..X............................", ".......X.................X.....", "..............X.....X..........", ".....X..............X..........", "...XX....X........XX...........", "............XX.......XXX....X..", ".........................X...X.", ".......X......................X", "XXXXXX.......X.................", "...X..........X....XXXXX.X.....", "XX.X..X.X.X..X.................", "...X.............X........X.X..", "XX.....X.............XX........", ".X..........XX....X..X......XX.", ".X................X....X.X.....", ".X.X...XXX.......X...X.........", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 10;
        int coinColumn = 27;
        assertEquals(7, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case62() {
        String[] level = { "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case63() {
        String[] level = { "...", "...", "...", "...", "...", "...", ".XX", "XXX" };
        int coinRow = 8;
        int coinColumn = 2;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case64() {
        String[] level = { ".........X....XX", "...X.X....X.....", ".X.X..XX..X.....", "....X.....X.X...", ".........X...X.X", "....X...X.......", "..X.......X.....", "................", "...X.X........X.", "X......X..X.....", ".X...........X..", "................", ".XX...X.........", "............X...", "...X......X.....", ".X..............", "X..............X", "..X.X....X....XX", "..X....X.X..X...", "...............X", "..X....X.XX.....", "..........X.XX..", ".X....X.........", ".X....X..X......", ".......X......X.", "X..X............", "....XXX.......X.", "........X.......", ".X....X.........", ".........X......", ".........XXXX.X.", "...X............", ".....X..XXX.....", "..X.............", "..........X.....", "...X.X..........", "...X....X.......", "................", "...........X....", ".X..............", "..........X.....", ".....XX.........", ".......X...X....", "......XX...X....", "....X.X.........", "..........X.....", "...X............", "..............X.", ".........X......", "XXXXXXXXXXXXXXXX" };
        int coinRow = 18;
        int coinColumn = 15;
        assertEquals(17, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case65() {
        String[] level = { "X.....X.....", "......X.....", "X...........", "..X.X..X....", ".X..........", ".X..........", "...X.X......", "..........X.", "X....X......", "XXXXXXXXXXXX" };
        int coinRow = 10;
        int coinColumn = 10;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case66() {
        String[] level = { ".X.....X.XXX..X....X.X.X.........X.X...XX....X....", "....XXX.X.....X.X.......X.X.....XX.X.XX.....X...X.", ".X......X...XX...X....XX..XXX.....X.X......XXX....", "........X..X..X......X...X.......X.XXX.X.XX....X..", "X..X........X...........XX.......X........X..X...X", "XXXXXXX.XX...XXX.........X.X...X.X.......X...X....", ".............XX...X....XX.XX........X.X.........X.", "X.......XX......X........X..X...X....XXX........XX", "..X...X.....XXX..X...X....X..XXX..X............X.X", ".......XX.X....XX.X..X..X....XX.......X..X........", ".X....X..X.......X....X.X.XX..X.XX..XXXX.X..XX...X", "..X...X......X.X..X.XX.....XXX.....X.......XX...XX", "....X.X.X.......X.X.X.........X........X...XXX....", ".....X......XX...X.XX.X.X..XX..XX.....X.X..X......", "...XXX..XX.X.X.X.X.X........X........X....XX.X..X.", "...X.X.........X.X.XXXX..X....XX......X...........", ".X...XXXX.X....X....X..X......X...X..X..X....XX...", "..X.X.............X...X..X..........XXX..X.X.X....", "....XX.........X..X...XX....X.XX...X..XXX...XX..X.", ".X...X.X....X..XX....X.X.X...X...X.X.X.X..X......X", ".......XXX.XX..X..X....X...X...........X.....XX...", "X......XXXX...X........XXX.........X..X..X..X...X.", "XX....XX.X...X......X..XX......X....X.....X.X.X...", "....X..........XX.......X........X.X..X.X...X.....", "..X......X..........XX.X.X.XX.X.XX..X.XX..XXXX.XX.", "XXX...X............XXX.X........X...X....X...XX...", ".X..X...X......X..XX..........X..X....X..X..XX.XX.", "....X....XX..XX...X......X.XX........XX....X....XX", "..X...XXX..X..XXXX..X...X...XX...X...X..X..X......", "............X..........X...XX.....X..XX.......X...", "....X......X.XX.X...X....X......XX..X..X.....X...X", "X....X..X...X.X.......X...X.......X..X....X..X....", "X.X...X...X..........XX..X....X....X.X...........X", "......X.X.......X.X.....X........X..X.X.........XX", "X..X.....X.X.X....X.X....X...X.X.....X..X.......X.", "..XX....X.....X.XX..X......X....X..X.XX.X......X.X", "..X........XXX...XX...XX......X.X..X.X..XXX.X.X...", "....X.....X......XX.....XX.....X.....X.........X..", "X......XX.........X...XX...X..X.........X..X...X..", "..X...X...X.X...X......X.X...XX....XX.......XX.X..", "..X...X.X.X...X.....X...X..X...XX...............X.", "X.X........X.XX..X.......X..X.....X....X.....XX..X", ".X..X...X.XX.X....X.XXX.......X.X..X.....X..X.X...", "...XX.....XX...XX....X..X......XXXX.......X.X.....", "......XX.XX............X....X.....X.X.XX...X.X....", "X..X.......XX....X...X.X.....XX......XX....X..X...", "X..X........X....X..X..X.XX.X...X......X.X........", "..X...XX..XX...X..........X......X.XX....X..X.....", ".X.XXXX.....X.......X....X.....XXXX.......XX.XXX.X", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 4;
        int coinColumn = 34;
        assertEquals(6, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case67() {
        String[] level = { ".X...XX.XX....X...........X............X.......X..", ".......X....X....X....X...XX..X...X...XX....X.....", "...X...XX.....XXXX..........X...........X..X.X....", ".....X...X.......X...X.X........XX....XX......X...", "X..............X..X..X.X....X....XX....X.X.X.....X", "X.X..........X..X...XX.X.X.XX...X..........X...X..", ".X.....XX.X...XX.X...X..X....X.XX........X..XX....", "........X.X...X....X....X....X..XX.X.X.XXX........", "XX.XX...........XX.....X....X.X.X.........X.......", "............X..X.XX....X..XX.X.....X...........X..", ".X................X.......X....X.X.X.......X.X.X..", ".......X...XX..X..XX.X.......X.......X..X...X.XX..", "....XX.X..XXXXX..........XX........XX...X....X....", "XX...X....XX.X..X..X.X.X.....X....X.XX...X.......X", "X....X.....X..XX..X.....X...............X......X..", "....XXXXX..X.XX....X.XXXX..X.X..X..X.XX..........X", "..X.......XX...........X.......XX.....XXX.X.......", ".XX..X.........X......XX.......X..................", "X.X...X....X...........X...X..X.X....XX...X....XXX", ".......XX............X...X..X....XX....X..X..XXX.X", "......X.X......X...X.......XXX.XX.......X....X....", "X...X..X....X...X..X....X......XX....X.....X...X..", "..X.X......XX..X.....XXX....X.....X......X.XX.....", ".X.......XX....X...XX..X.....X....X...X.XXXX......", "......X..X.X..XXX.....X..XX........XX..XX....X....", "XXX.X...X.X..X...X..X.X...X.XX.X.........X.....XXX", "...X.X.....X.XXX.X..X.........X.......X.....X.....", "..X..X........X......X.X..XX...X..........X...XX.X", "X......XX...........X.....X.....X..X.......XXX....", ".....X..X...............XX.X.......XX...X...X....X", "...XX.X..X.XX...X...XX...X..XX.......XXX......X.X.", "...X....XX..X....XX.......X....X..............X.X.", "......XX.X...X.....X.............X.X.........XX.XX", "..XX............XX..X........X.X..XX...XX...X.X.XX", ".X..X......X..XX...........X.X....X.....X..X....X.", ".......XX.X..X.......X..XX.X...XX...X....XX.....X.", "X.X....XX.X..XX.....XX......XX.X.X....XX.....XXX..", ".X...X.X......X............X..X.X......X.XX..X..XX", ".X..............X...X....X........X....X....X.X...", "........X........X....XX...XX.XX.X.......X...XX..X", ".XX.XX.X.XX....X.XX.X.XXX.........X.X...XXX.X.....", "...X..XX...XXX..X.X........X.X..X.XX..X...X...X..X", "............X.XX.X.....X.X......X.X....X..........", ".X.XX.....X.....XXX.........XX..XX.......X...XX...", "X....X...X.....X.X...............X.X.X.....X....X.", ".......XXX..X.........X..X..X.X....X....XX.X......", "X.XX...X.XX.......X.....XX.X...X.....X....X..X.X..", "X........XX....X...X............X......X.XXX...X..", "XX....X.........X.......X..XX.XX..X.X..XX.X.XX..XX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 46;
        int coinColumn = 9;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case68() {
        String[] level = { ".X..X..XX...X.X........X.........XXX.....XX.X....X", ".X.X....X..X.X...X.........X..XXXX...XXX.....X....", "..X...XX........X..X.XX..X...XX.X.X.X.XX.X.......X", "...X...XX................XX.X......X........XX.X..", "XXX.X...........X........X.XX...........XX..XX..X.", "....X......XX....X...XX.........X..XXXX......XXX..", "X.X.X..X.........X..X..X......X..X....X....XX.....", ".X....X....X...XX.....XXX.....X.X......XX.X...X...", "XX......XX..XX...X...X........X.....X..X.....X.X..", ".....X...XXX.X....X........X...X.X.X.X.X.X......X.", "...X..X.....XXX.X..X.XX........X.X....X...X...XX.X", ".XXX..X..XXX......X.XX...X...............X....X..X", "...X.X...X.....X..XXX....X.X...X..XX..X...........", ".........X.XX......X.X.....XXX.X........X....X...X", "X......X..X.............X..X..X....X.......X..X...", "XX....X..............X.X........X...X.X..X.XX..X..", "XX.XX...X...XXX......X.......X..X.................", "XX....XX.X..X...X.XX......XXX...........X.........", "X.XX..X.X...X..X....X....X...XX....X..X....X...X.X", "............X....X.......X.X..........X..XX.X...X.", ".....X..X...X.X.X..X..XX.....X..X...X..........X..", "...XX..........X...X.......XXX...X.....XX.X...X...", ".....XX............XX.X....XX.....X.....XXXX.....X", "...X..X.X.X...X...X..X..........X..XX.X......XX.X.", "......X.XX..XXXX..........XX...X....X........X...X", "....X.......X...X....X....XX....X.X....XX.....X...", ".X.....X.XXX.X..................XX..X.X......X....", "X...XXX.........X......XX.....X..X..XX....XX...XXX", "..X..X..XX.....X.XX....X....XX....X...X...XX......", "............X.XX.X.X........X....XXX.....X....X...", "....XX.X....XXX.X............X..X....X.X......X...", "X.X......X.........X.X.......X...XXX..X...X.X.X.X.", "X.X....XX.X..X.....X..XXX..X..X.X.......X....XX...", "XXX.X.X..X...X.X......X...X........X..X.X...X.X...", ".X...XX.XX.......................XX...X...X.......", ".....X.X....X..X.XX.XX..X......X.......X.........X", ".X.X......X......X.....X......XX.X..........X..X..", "..XX...X............XX.X....X.X....X...X.X.XX.....", ".....X.X..XX.X..............X.....XXX.....X.X.....", ".XX..X...............X....X.XX.X.....X....XX...X..", "...X...X....XXXX...XX.X...X.X........X........XX..", "...X....X...X....X...X.X..X.X.X.XX...XXX..X.XX..X.", ".X..........XX.X...X..X..XX...........X.X..X..X...", "...X........X.....X.XX...XXXX......X.....X..X..XX.", "....XXX...........X.....X........X.X.....X.X......", "X.X.........X...X...X..X...XX......X.........X....", ".X.....X....X.X.....................XX.X..XX...X..", ".X.XX......X..X............X......X...XXX.X......X", "..X........X.......X........XX......X............X", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 31;
        int coinColumn = 13;
        assertEquals(5, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case69() {
        String[] level = { "..XX.X....X......X....XXXX...XX.XXXX.X......X.....", "......XX.........X.....X..X...X....X........XX....", "...XX...X...XX..............X..XXX....X.X.......XX", "X...............X.....X....X....X....X.........X.X", "..X.X.XX.X..X...XX.X.X..X....X..X............X.XX.", "X..X..............XXX.....X..............X...X.X..", "....X.XX....X...XXX.X..X..X..XXX..X...X.....X...X.", "XX.........X.X.....................X...X....XXX...", "X.X............................X....X.............", "..XX.X..XX.....X.XX....XX.................X.....X.", ".....X...XXXX.X....X..........X.X..XX..X........XX", "...XX...........X...........X....X.XX....XX..X...X", "X................X..X..........X.XX..XX...X.X.X.X.", "..XX..X..........XX.....X..X.........X.X.......XXX", "X........XX....X...X..X..X....X..............X....", ".X............X.......X.X..X...X.X..X.X....X...X..", "....X..X.....X.X..X...X....X..X.XX...XX..........X", "....X...X...X....X....X.......XXX..X.X.X........X.", ".X....XXX.X...X.X.....X.X..XX.XX..X..XXX.X.XXX....", "X..XX.X.X.....X..XX..X.X.X.X.........X.X.X..X...X.", "....X.........X....X....X.X......X..XX........X.X.", ".X.X.XX.............X.........X.........X.X.......", ".XXX.X....X.X..XX..XXX....X.....X.........X.....XX", "...X....XX..X..X.X..X....XX...XX........X.........", "X.......XX....X..X.....X.X.......X...X...XXX.X....", ".X.XX.XX............X.X.....X.....X.XXX..X...X.X..", ".X....X..X..X..X....XXX....X....XX.......X.XXXXX..", ".X........X...X.X..............XX..XX.......X.....", ".X........X.X.....X.....X........X.X......X.....X.", ".X....XX......X.X...X.....X.........X.X...X.......", "X..XX...X.X...X............X....X..X....XX........", "..X....X.X.X..X............X.X.X.X.XX.X.XX...X....", ".........XX.....X....X....X.X....X.....X....X.....", "..XX..XXX...X.X...X..XXX.X...X.........X.X..X.....", ".XXX.XX.X....X....X..X....X.........X...X....X....", "XXX...X.....X...XX.X.........X.X......X.....X...X.", "X.X...X..X.........X....X..X....XX.X....XX.......X", "X...........X...............X...X..XXX...X.X..X...", ".............X.X.X....X............X.......X.X...X", "...XXX...X....XX.X.X..X............X.X.X.XX...X..X", "XXXXX..XX....X....XXX......X.X.XX.XXX.............", "XX.......X.X.......X.X.X...XX...X..X.X........X...", "X.X.X..X...X.X...X.X....XX..X....X.....X.XX.X..X.X", "X................XXX.XX....X...XX.......X...X.....", "..XX........XX...X.X.X....X...X...X.X....X.X...X..", "...XX........X.XX....X....X....X.X.....XX..X.....X", ".XX..XX....XX.XX..X....X.......X.X.XXX...X........", "......X....X....XXXX...X...XX....XX.X.X.....X.X.X.", ".X...X.XX.....X......X...X....X........X.XXX......", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 37;
        int coinColumn = 25;
        assertEquals(6, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case70() {
        String[] level = { "..X.....X..X...X..XX....XX....X.........X.....X...", "..X.X.X...X.....X..........X..........X......X...X", "..X............X.X........X.....X...X......X.XX...", "X.XX..X.....XX.X.X..X.X...XX.....X.....X..X.......", ".X..............XXXX....XX......X....X........XX..", "...XX...XX...............X....XX...X...X..X.......", ".X........X....X....X...X.XX.....X.X.....X....XX..", "....X...X.......X....X..X...X.X.......X........X..", ".X..X...X......XX....X.....X...X....XX...X...X....", "...X....X.X.X..X.X..X....X.X...............X.XXX..", "....X.X.X.......X...........X.X......X......X.....", "XXXX.......X...X..X.XX.X...........X..XX..........", ".X..X......XX...X......X....X....X...X...X......X.", "X.XX.X....XX.X....X...X......XX....X...X.X.....X.X", "X.X..XX....X........X...X............X...XX.......", ".......X.X....X.X..........X.XX....X.X..X...X.....", "......XXX........X.X..X....X.XXX....X....X.X......", "X.X.X..X.X.......X.....XXX......XX...............X", ".X.X..XX.....XX..X.....X......X.X....XX....X.X..XX", "X...X..X.X.X...X......X..X....XX..X.X.X....X.....X", ".X.....XX.X.......X..X.X...X..XX...X.....X......X.", "XX.....X..X...X.X...XX...X.....XXX....XX...XX.....", "..X..............X....X...X.................X..X..", "....X.X.....X.....XX.X.X.XXX..X..........X.X.XX...", "X...X...X...XX.......XX.XX.....X..........XX...XXX", "...............X....X...X.............X....XX...XX", ".X...X..........XXX...X.X...X..X...........X....X.", ".X.....XX.X...X.X.X....X.XX...X......X........X...", "X....XX......XX.X.......X..........XX....X.X......", "...XX......X.X............X......X.X.X..XX.....X..", "..X..X...X...........X...X..X........XXXXX..XX..X.", "..X....XX.X......XX............X.X..X.....X....X..", ".....X.XX.X..............XX.......XXXX.X..........", ".............X....X.......XX...XX..X..XX.X.......X", "...X.......X.......X..........XXX....X.X..X...XXX.", ".....XX.....X....X..XX....X...X.XX..X........X....", "XX......X.XX..X...XX..........X....X..X.XX....XXX.", "....X.....X....X...X...X.........XXX....XX.XX.....", ".X.X......X..XXXX.........X.X.XX.XX.........X..X.X", ".X...............XX........X.X......X.X........X..", "....XX........XX...X.XXX.X.X..X.XX..............XX", "X...X...X...X....X..X.X..X.....X.X......X..X....X.", ".XX..X..X..X..........X.XXXXXX.X.X.........X.....X", "X.XX......X.X.......X.......X.X......XXX....X.....", "..X...X....X...X.X...X...XX..XX.......X.X.....X..X", "X...X....X..X.X..X...XXX.......X.X..X.X...XX.....X", "..X....X..X.............X..X.....X....X.....XX....", ".X..X......X...X........X..XXXX.......X..X......X.", "...XX...X...........XXX.......X..X.....X...X....X.", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 35;
        int coinColumn = 4;
        assertEquals(5, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case71() {
        String[] level = { "....X.....X.X.X...........XX.X..X.....X....XX.X.XX", "X......XX.X....X........X...X...X.....XX..X.......", "........XX...X.X....XX......X...X..X....X......X..", ".X....X....XX.X..X.XX......XX......XX..X..........", ".....XX.X.X...X..X....X............XX.......XX..XX", "X.....XX.X.X.......X..XX.X.X..X..XX...........XX..", "......XX........X.....X.X..X.XXX..X..X.X......X...", "..........X..X...X.....X......X........X.X........", "............XXXX...X....X..X..X.................XX", "......X...X..X.....X..X..X..X....X...X..X..X..X...", "X....X...X....XXXX............XX.......XX......X..", ".....X..X..X.XXX....XX.........XX............XX..X", "......X.XX.........XX..X.X..X..X.X.X.X....XX.XX...", ".X.....X.X...X.X...X.X..X....X....X..X.....XXXX..X", ".....X.X.X......X..X.X......X....XX........X.X....", "....X.....XX.XX.....X.X..XX...X.X.............XX..", "..X...........XX..X...........X.....X.X..X.......X", "X..X............X.X..XX.........X..XX.X.....X...X.", "X.X..X....X..X.....X..XX..XX....X..XX..XX.....X...", "............XX...X.X......X..X..X.....X.X...XX....", "X...XX....X.......XX.X.X...X..X.XX.....X...X....XX", "................XX..X..........X...........X......", ".X..X.X..X..X..X.........XXX....X.X.X..X.......X..", "....X.X....X..X......X.X....X.XX.....XXX.X..XX....", ".X.XX...XX........X..X.X...X.X..X....X.........X.X", ".XX..X........X...X...X......X....X.....XXX..X.XX.", ".XXX...X....X...........X.....X.X..XXXX.....X..X.X", ".X...X.XXX.....XX....X.XX....XX..........X........", "......X..X....X......................XXX.XX.......", ".....XXX.X..X..XX.X.....XX...X...XX...X.X.X..XX.X.", "X..........XX..X.X.X.....XX....X.XX............X..", "..X.X........XX.X...X..........X..X..X.X..........", ".X....XX....X....X.XX...........X.XX.X.X..X......X", "XX..XX..X...........X..X.XX.X.XX.X...X.X.X...X....", "..X...X...XX.X..XX.......X.........XX...XX.X..X...", "......X.........X.........X....X..........X....X..", ".X......X.......X.X.X......X.X........X........XX.", "....XX.X.............X......................X..X..", "X.....XX........X......XX..X..X.X...X....XX..X....", "X........X.X.........XX.XX.XX...X.XX..............", "....XX.X..XX....X.X..................X....XX.....X", "X...X..X..X..........X...X.XX...XX.....X.X.X.X...X", "XXX......X...X..X....XX......................XX...", "...........XX....X.XX...X.....X.......X..X.......X", ".X......XX........X.......................X.......", "X........X..X...X.....X.XX.XXXXX....X.X..........X", "X....XX...........X.......XX....X.....XX..X......X", ".X.........XX..X...........XX...X..X...X..X...XX..", "XX...........X..X..X..XX.........X...X..XX....X...", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 50;
        int coinColumn = 21;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case72() {
        String[] level = { "...........X....X.X...XXXX...XXX....X...X.XX......", "......XX.......X....X...XX........XX..X..........X", "...X..X....X......X.X.......X......X.X.X.X......X.", "X..X.....XX.X...X...........X....X.....XX...X.X...", "..XX......X....X.........X........X....X..X.....X.", ".....X..X.............XX......X...X.....X.........", "..............X..X......X..X.X.........X.....X..X.", "....X..X.......X.....XX......X..X.X......X...X..X.", "......X..X.X.X......XXXXX.XX....X....XX....X.....X", "...XX....X.........XX.....X..XXX.X...XX........XXX", "X.X..X..X....X.X...........X..XX.......X...XX....X", "...X..........X.....XX.....XX.........XXX.X....X..", "...X.XX..X.XX...XX................X.XX.X........X.", "..XX..........X.........XX..X.X....X..XXX.X.X..X..", "X...X........X.X...XXX......X.........X.X...X.....", "X.....XXX...XXX.X.......XX..X.....XXXX......X.....", "................X..X....X.....X..X.............X..", ".....X..XX.....XX.X.X.X...XX......X..XX......X..X.", ".X.X.XX....X.X...XX.........X...X.X...XX...X..XXXX", "XX..X........X...XX......X.X..X...........XX.X....", "......X.XX........XX.....X....XX.X.X...........XX.", ".X...X...X.......X.......X...X.X.........X....X.XX", ".X..........XX.....X.X.X..X.X......X.XX...XX...X..", "X..........X.XX.X..........XX..X....XX.X.......X.X", "..........X....X.XX...XX...X...X....X..X......X...", "X...X.X....X.XX.X...X...X...XXX......X............", "...X...X....XXX....X....X.X..X.................XX.", "..X........XX..X....X.....X......X......X...X.....", "....X.X...X....X.....X...XX.....XX...X....XX......", "X......X....X.X.X......X......X......X...X..X...X.", "....X....X.....X....X..X.......XX...X...X.........", "..X...X.......XX.X...XX...X.........X.......X.X..X", ".....X...X....X.X.....X..X.X.....X...X.........X..", ".....X.............X.XX.XX.....XX...X.......X.....", "X...X...............XX.....X...X..X......X........", "X..X..X..XX.X.....X.X..X.......XX.X.X..XX.X..X.X..", ".........X.X..X.X.......X........X.X........XXXX..", "..X.XX.X.....X.........X......X...X...X...XX.X..X.", ".XX.X....X......X..X....XX.X...X.......X.XX.X.X.X.", "...X....X.X..X...X...XX....X.....X..XX..X........X", "......XX..XXX....X.......X........X.....XX......XX", "...X..X..X.X.X...X.........X..X..........X.X..X.X.", "...X..X...X.X.....X.X.X.X......X.....X.XX.......X.", "....X..X.XX.X.......X...X..X..............X..X....", "......X...........X....X..X......X.X.X....X.......", "............X.X.X....X............X..........X....", "....X...X....X...X....XX.X.X..XXX............XXX..", ".....X...X.....X.X...X.....X..X....XXX.......X.X..", ".XX.............XX...X......X..XX...X...XX...X.X..", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 22;
        int coinColumn = 10;
        assertEquals(5, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case73() {
        String[] level = { "...XX..X....X..X...X.......X.....XXX....XX..X..X..", ".X.X..X.XX............X...X.XX....X............X..", "...X..X..XX.......XX...X..X...X.X.....X.....X.....", "XX............X...XX...X...XX................X....", ".........X...X..X...X..X............X.X.X.X...X...", "...X...X..X.........XX..X...X.......X.X...X......X", "...X...X..X..........X.X.....XX.X..X.X.......X.XXX", "...X.......X.....X......X.....X.....XXX...X.......", "..XX...X...X...X..X.X......X....XX.X..X.X...X.X..X", "XXXX....XX...XX.......XX.......XX........X..XX....", "..X....X.X..X..................XX..........X..XX..", "..X..XX.X.X..X....X........X...X...X.....XXX......", "...XX.X.X.......X....X.X........XX..X..X..........", "..X.XXXX..X.X..X.X...........XX....XX....X..X...XX", "....X..........X......X....XX.......X...X..X...X..", ".XX....X...X....X.....X..X.....XX...........X.....", ".XX......X.X..X.......XXX........X................", "....X.....X..XX...X.X....XX.X.X......X.....X.X.X.X", "........X....XX..X....X.XX.......X.X.X.XX......XX.", "......X...X.XX..X..X.............X.....X..X.X.....", "...XX.X...X..X.....X......X.XX...X.XX....X.X....X.", "........XX.XXX.X.X......X.XX..XX.X..X..XX..XX.X...", "......X.....XX.X..X.XX..X....X...XX...X.X.X...X..X", "XX......X........X.....X..X.X..X.....X.X..X...X...", ".X...X.............X...........X...X............X.", "..............X..............X.X.X................", "....X..XX.X..........X........X......X.X.......X..", "....X.X...................X...X....X............X.", "...X.....X...X.X..X..XX......X.....XXX..X..X...X..", "...X...XX..X.......X........X........X.XX..X......", ".X.X...................XXXX..X............X.......", ".X..X.....X....X.....X.X.....XXX.....X..X...X....X", "X........X....XX........X..X.....XXX.........X..X.", "..........XX......X...............XXX.....XX......", "X.......X.X.X.X.....XX..X.X.........X..X........X.", "X...X...X.X..........X......X.........X...X...X.X.", "..........X..........X...XX.....X..........X.XX...", "XX..X..X.XX.....XX......X...X..X..X..X.XX.X..X.X..", ".X......X..XX.......X...XX....X.X.X..X.....X...X..", ".X............X...X...XX.............XX.X.....XX..", "X.......X..XX..X..X..X......X...........XX...X....", "...X.XX.X...XX........XX.......X........X..X..XXXX", "...X...X........X.X...X.........X.................", "XX.X.XX...X....X...X.X.....X....XXX.............XX", ".....X..X.XX.X.XX.X..X..X..XX..X......X..X.....X..", "....X.X.........................X..X...XX.......XX", "..........X..X...XX..X.X....X...X..X.....X........", "......X.X....XX.X..XX....X..X......X......XXX.X...", "XX....X.....X..X....X..X....X..X.....X.......X...X", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 48;
        int coinColumn = 45;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case74() {
        String[] level = { "...X.X...XX...X.......X...X..X....X.........X..XX.", "...X.X....XX..........X.X...XX..X...X.X.....X.....", ".X...X......X.......X.X..X.X.....X.X.X....XX....XX", "...X...X..X.X...X.....X.X....X......X.......X....X", ".X.XX..X....XX..X.X..X.....X......X....X..X.....X.", "........X..X...X..XXX..X..X.X.XX.X..X...X..X.X...X", "...XX.X...X...XX.....X..X.......X.....X.....X.XX..", "..XX..........X....X...X.......X.XXX.X..X.....X.X.", ".......XX.XX.X......XX..X.X.X.X........X.X...X..X.", "XX..X..X..X...X.X..XX.X.X.X........X....X.X.X.....", "......XX.......X.X......X.XX....X...XX...XXX..XXX.", "..X..X.XX.........X.......X..XX....X..X....X..X..X", ".X.......X.X.....XX....X.X...X.X.............X..XX", "....X...X......X....XX.....X.XXX.........XX.X...X.", ".X.XX.......XXX..X..............X......X..XX..XX..", "...X.X.......XX..X...X.......X.X..X........X..X.XX", "X..X.............X.................X..X.X....X....", "XXXXX.......X.............X..X....X.......X..XXX..", "........X.X..X.....XX...X.X...XXX..X.....XXX......", "X.X.X.X.....X....X.X..X.XX.......XX...X...X...X.X.", "...X....XX..X..X......XX....X...X.......X...X...X.", "..X.X........X.X.....X..X..X..X.......XX..XXX.X...", "...X..X..X.X.........XX..X..X.........X....X.X..X.", "X..XX.....X...XX.X.X.X............X.............X.", "..X...X.X..X..XXXXXX..X....X......X....X.XXXX...X.", "XX.X.....X...X.X..........XX.X.X.......XX...X....X", ".X..X.........X..........X...X..XX...X.XX...XX...X", "...X......XX......X.........X...............XXX...", "....X........X....X.......X............XXX....X...", ".X........X...XX..X.X.....X.....X....XX....XX...X.", "..XX.........X...X.X......X.......X....XX.....X..X", "....XX..XXX.......X.....XX...X......X.XX....XXX...", "...X.X......XXXX...XX.......X...........X....X...X", "...........X...X...X.X.....X..XX.XX......X..XX....", ".......XX...XX..X...XXX..X...XX.X........X.....X..", ".............X.XXX..X.X....X.....X.XX........X....", "...XXX..X.......X...X..X.......X.XXX......X..X.XX.", "....X.....X..XX.X........X..........XXX...XX...X..", ".X.X.XX.X.XXX...........X....X.X..........X..X....", ".....XX............X......X..........X...X.XX..X..", ".....X...X....X.....X......X.X......XXX....X......", "X............XX..X.X..X..XX..X.X..X.X........XX...", "...XX.......XX.....X.....X.X......X......X....X...", ".X.XX........XXX.X..........XXX.X....X......X.X..X", "........X.X...X....X.........X.............X.....X", "X.....................XX..X.......XX..X......X....", "...X.XX........X....XX......X.....X.X...X.....X...", "....X..X.XXX..XX.X...XX.X..X.X...X..X..X.X..X...X.", ".X....X...X..........X...X...XX...X.X.....X....X..", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 12;
        int coinColumn = 36;
        assertEquals(8, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case75() {
        String[] level = { "X.....X...X...XX......XXX..X.XX.....XX........X...", ".X...X...XX....X...X....X.....X...X...X....X.X...X", ".X.X.X.....X..X........X...X.......X...X.....XX...", ".X....XX.X...X....X..X.....X..X..X.....X...XX.....", ".X.X..XX.X..X........X..X.X.X.............X.......", "...XXX....XX.X.X....XXX.......X............X......", "...XX...........X...XX......XX....X......X..X...X.", ".....XXX.X...X.X.X..X.X.......XX.......XX.X..X....", "X.X.X...X..X..XXX....X...X.XX......X.X.....X.X....", ".XX..XX...X.X.......X...X..X......X..X.......XX...", "......X..X.X.X...........XX....X...........XX....X", "...X.X..........................X..X...X.X..X.....", "....X..............X.XX....X.X..X...X.......XX..XX", ".X..X.......X.X....X.......X............X......X..", "X.X...X.....X............XX.X.X..X.......X.XXXXX..", "..X.......X.X.X........X.X..........XX............", "XX........XX...XX.XX...X..XX......X.X.X...........", "X.X.X..X.X..X................X.X...X.....X...X..X.", "........X.........X..XX..XX...X....X.X........X..X", "..X........X....XXXX.....X.XX....X..............X.", ".XXX.X..............X..X.......X......X.X.....X...", "......XX.X..X...X.XXX.X...X.X..XXX......XX........", "X..........X..X...XX..XX...X.XX.X.XX.....X.XXXX...", ".X.....XX......X.X........X.X...X.XXX..X..X.....XX", "XX....X.X.X....XX...X..X.X.X.X..........XX.X....X.", ".........X.X....X.X.XX..X......X..XXX.....X.....X.", "X....X....X...XX..X..........XXX..X..X.X..X......X", "X..X...XXX.........X...X..X...X..X...X...X.X......", "XXXX.....X..XXX.....X..X...............XXXXX......", "...XX..X.........XXX....XXX.X...XX..XX..X.X..XX...", "X.X..XX.....X.XXX......X.X...........X......XX..X.", "X...............X....XX..X.X....X..X..X.X.X.......", ".XXX..X..XXX..X.X.X...X....X.X.X........X....X....", "..X.XX.X..X..XXXX...XXX...........X..........X..X.", ".............X..........XX..X.X.X..X.XXXX.X.XX...X", ".XX..X............X.......................X.XX....", "....X..XX..XX.XXX.....X......X..X..X.......X...X..", "......X..X.......X.....X.X.X.X.......X.X......X...", "XX...X.....X.X.X..X....XX.................XX..X...", ".X...X..X....X...XX.......X.....X.X..........X.XX.", "...X.X..XX...X.X......X.......X...X..X............", "XX..............XX.........X.X....XX......X.....X.", "X.X....X..X.....X...X....XX....X..X..X..X....X...X", ".X....X.X............X......X..............X..X...", "......X.X.XX..X..........X..X.....X.X..X...X...X..", "......XX.................X.......X.XXX.X.X...X....", "......XX.X....X.....X..X.........X..........X..X..", "X......XX.XX..X...X..X.X....X.X....X..X........X..", ".X...X...X.......X.X.X.X.XXXXX.XXX...............X", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 43;
        int coinColumn = 26;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case76() {
        String[] level = { "X.................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(49, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case77() {
        String[] level = { "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "..................................................", "X..........................X..................X...", "..................................................", "...............X..................................", "..........XXXXXXXXXXXXXXXXXX......................", ".................................................X", "....XXX........................................X..", ".............................XXXXXXXXXXXXXX.......", "........X.........................................", "X.................................................", "..................................................", "..................................................", "..................................................", "X.....................................XXXX.......X", "..................................................", "..................................................", "...............X..XXXXXXXXX................X......", "..................................................", "..................................................", "X.................................................", "....X......................................X.....X", "..................................................", "..................................................", ".................................X................", ".........X........................................", "..................................................", "..................................................", ".........XXXXXXX.................................X", "..................................................", "X.................................................", "..................................................", ".................................................X", ".....................................X............", ".......................X..........................", "..XXX........................................X....", "..................................................", "...X.............................................X", "..................................................", "..................................................", "...........X......................................", "......XXXX......................X.................", "X.................................................", "XXX..X............................................", "X.................................................", ".............................................X...X", ".......X..................................XXXXXXXX", "..................................................", "..................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 31;
        int coinColumn = 1;
        assertEquals(10, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case78() {
        String[] level = { "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "..................................................", "X..........................X..................X...", "..................................................", "...............X..................................", "..........XXXXXXXXXXXXXXXXXX......................", ".................................................X", "....XXX........................................X..", ".............................XXXXXXXXXXXXXX.......", "........X.........................................", "X.................................................", "..................................................", "..................................................", "..................................................", "X.....................................XXXX.......X", "..................................................", "..................................................", "...............X..XXXXXXXXX................X......", "..................................................", "..................................................", "X...XXXXXX........................................", "....X......................................X.....X", "..................................................", "..................................................", ".................................XXXXX............", "....X....X................XXXXXXXX...X............", "........................X............X............", ".....................................X............", ".........XXXXXXX.....................X...........X", "....X................................XXXXXXX......", "X.................................................", ".........................................X........", "..........................X......................X", ".....................................X............", ".......................XXXX.......................", "..XXX....................................XXXXX....", "..................................................", "...X.............................................X", "..................................................", "..................................................", ".........XXXXXXXXXXXXXXX.............XXXXXXX......", "......XXXX......................X.................", "X..XXXX...........................................", "XXX..X.................................XXX........", "X.................................................", ".......................................X.....X...X", ".......X..................................XXXXXXXX", "..................................................", "..................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 29;
        int coinColumn = 12;
        assertEquals(6, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case79() {
        String[] level = { "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 2;
        int coinColumn = 32;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case80() {
        String[] level = { "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "..................................................", ".X................................................", "X.................................................", "..................................................", ".X..............................................XX", "..................................................", ".................................................X", "..................................................", "........................XXXXXXXXXX.......XXXXXX...", "XXXXXX...................................X.......X", "............................................X.....", ".....X............................................", ".................................XXXXXXXXX.......X", "........................X........................X", "..................................................", "..................................................", ".....X......................................XXXXX.", ".................................................X", "......................XXXXXX.....................X", ".....X............................................", "..................................................", "..................XXXXXX...............XXXXXXXXXX.", ".......................................X..........", ".....X...........................................X", "XXXXXX............................................", ".......................................X..........", ".......................................XXXX.XXXX.X", "X.................................................", "..................................................", "..X.......................................X......X", "..................................................", "..................................................", "..X.......................................X......X", "X.................................................", "..................................................", "...............XXXXXXXXXX........................X", "........................X.................X.......", "..........................................X.......", "XXXXXXXXXXXX...X...........XXXXXXXXXXXXXXXXXXXXX.X", ".........XXXXXXX........XXXX......................", "..................................................", ".................................................X", "..................................................", "..................................................", ".................................................X", "..................................................", "..................................................", "..................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 23;
        int coinColumn = 23;
        assertEquals(6, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case81() {
        String[] level = { "XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XX", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.", "X.................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 50;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case82() {
        String[] level = { "X.X.XXX.XXX.XXX.X.X.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XX", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "..X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X...X...X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X...X...X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX..XX.XXX.XXX.XXX.", "X.................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 50;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case83() {
        String[] level = { "XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XX", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X...X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X...X.X.X.X.X.X.X.X.X.X.....X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X...X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X...X.X.X.X.X.X.X.X.X...X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X...X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X...", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X...X.X.X...X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X...X.X.X...X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X...X.", "X.X.X.X...X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X...X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X...X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X...X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "X.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.XXX.", "X.................................................", "X.................................................", "X.................................................", "X.................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 50;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case84() {
        String[] level = { "XXXX", "...X", "XXXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case85() {
        String[] level = { "XXX.XX.............XXXXXX.......XXXXXXXXXXXXXXX...", "X.X.....XXXXXXXX...X............X..........X......", "X.X.....X....X.....X....X.......X..........X......", "X.X.....X....X.....X....XXXXXX..X..XXXX....X......", "X.X.....X....X.....X............XXXX..X....X......", "X.XXX...X....X.....X..................X....XXXXXXX", "X.X.....X....X.....X..................X....X......", "X.X.....X....X.....XXXXXXXXXXXXXXXXXXXX....X......", "..................................................", "X.X.....X....X.............................X......", "X.X.....X....X.............................X......", "X.XXXXXXX....XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX....", "X.................................................", "..................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 4;
        int coinColumn = 28;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case86() {
        String[] level = { "XXXXXXXXXX", "...X......", "XXX.......", "X.....XXXX", "..XXXXX..X", ".........X", ".........X", "XXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case87() {
        String[] level = { "X" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case88() {
        String[] level = { "....", "XXXX", "...X", "XXXX" };
        int coinRow = 2;
        int coinColumn = 1;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case89() {
        String[] level = { "..X..", ".X.X.", "X...X", ".X.X.", "..X..", "XXXXX" };
        int coinRow = 1;
        int coinColumn = 3;
        assertEquals(4, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case90() {
        String[] level = { "X.XX", "...X", "XXXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case91() {
        String[] level = { "XXXXXXXXXX", "...X......", "XXX.......", "X.....XXXX", "..XXXXX..X", ".........X", ".........X", "XXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 3;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case92() {
        String[] level = { "..", "XX" };
        int coinRow = 2;
        int coinColumn = 2;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case93() {
        String[] level = { "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case94() {
        String[] level = { ".", "X" };
        int coinRow = 2;
        int coinColumn = 1;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case95() {
        String[] level = { "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 50;
        int coinColumn = 50;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case96() {
        String[] level = { "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 13;
        int coinColumn = 36;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case97() {
        String[] level = { "XXX", "XXX", "XXX" };
        int coinRow = 3;
        int coinColumn = 3;
        assertEquals(0, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case98() {
        String[] level = { "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case99() {
        String[] level = { "X.........X.........X.........X.........X.........", ".........X.........X.........X.........X.........X", "........X.........X.........X.........X.........X.", ".......X.........X.........X.........X.........X..", "......X.........X.........X.........X.........X...", ".....X.........X.........X.........X.........X....", "....X.........X.........X.........X.........X.....", "...X.........X.........X.........X.........X......", "..X.........X.........X.........X.........X.......", ".X.........X.........X.........X.........X........", "X.........X.........X.........X.........X.........", ".........X.........X.........X.........X.........X", "........X.........X.........X.........X.........X.", ".......X.........X.........X.........X.........X..", "......X.........X.........X.........X.........X...", ".....X.........X.........X.........X.........X....", "....X.........X.........X.........X.........X.....", "...X.........X.........X.........X.........X......", "..X.........X.........X.........X.........X.......", ".X.........X.........X.........X.........X........", "X.........X.........X.........X.........X.........", ".........X.........X.........X.........X.........X", "........X.........X.........X.........X.........X.", ".......X.........X.........X.........X.........X..", "......X.........X.........X.........X.........X...", ".....X.........X.........X.........X.........X....", "....X.........X.........X.........X.........X.....", "...X.........X.........X.........X.........X......", "..X.........X.........X.........X.........X.......", ".X.........X.........X.........X.........X........", "X.........X.........X.........X.........X.........", ".........X.........X.........X.........X.........X", "........X.........X.........X.........X.........X.", ".......X.........X.........X.........X.........X..", "......X.........X.........X.........X.........X...", ".....X.........X.........X.........X.........X....", "....X.........X.........X.........X.........X.....", "...X.........X.........X.........X.........X......", "..X.........X.........X.........X.........X.......", ".X.........X.........X.........X.........X........", "X.........X.........X.........X.........X.........", ".........X.........X.........X.........X.........X", "........X.........X.........X.........X.........X.", ".......X.........X.........X.........X.........X..", "......X.........X.........X.........X.........X...", ".....X.........X.........X.........X.........X....", "....X.........X.........X.........X.........X.....", "...X.........X.........X.........X.........X......", "..X.........X.........X.........X.........X.......", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(10, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case100() {
        String[] level = { "....X", ".....", "XXXXX", ".....", "XXXXX" };
        int coinRow = 1;
        int coinColumn = 5;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case101() {
        String[] level = { "XX", "..", "XX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case102() {
        String[] level = { "X.X", "..X", "XXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case103() {
        String[] level = { "XXXX....", "...X.XXX", "XXX..X..", "......X.", "XXXXXXXX" };
        int coinRow = 2;
        int coinColumn = 4;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case104() {
        String[] level = { ".XXXXXXXXXXXX", "XX.........XX", ".............", ".............", "XX.........XX", ".............", "XX...........", ".............", "XXXXXXXXXXXXX" };
        int coinRow = 5;
        int coinColumn = 13;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case105() {
        String[] level = { "XXXXXX.XXX.X.X.XXXXX.X.XX...XXXXXXX.XX..XXX.XXXX.X", "XXXXXX.X.XXX.XXX...XXXXX.XX.XX.X.XXX.X...XXX.XX.X.", "..XXXXX...XXX..XXXXX.X.XX.XXX.XXXXX..X.XX.X.XXXXXX", "XX...XXXX..XXX.X.XXXX.X.XXX.X.XXX.X.XXXXXXX..XXX..", ".XXX..XXXX.XXXX..XX.XXX..XX..XXXXXX.X.XXXX...XXX..", ".X.X...X.XXXX.XXXX....XXX...X.XXX.XXX.XX.X.XX.XX..", "XXXX..X.XX..XXX.XXX...XXXXXX.X...X..XXX.XX..XX.XX.", "XXXX.X...XX.XXX..X.....XXX.XX..X.X..XXXX.XXXXXXXXX", "XXXX.XXX.XXX.X.X.XX..X...XX.XX..X.XXX.XXX.XXX...XX", "..XX.XXXXXX.XXX.X.XXX.XX.XXXXXXXXXXXXXXX.X..XX.XX.", ".XXXX.X..XX.XXXXXXXXXXXXXX.XXXX..X.XXXX.X..XX..XXX", "X.XX.X.XX..X.XXXXXX.XX..XX.X.XXX..X.X..XX.X..XX.XX", "...X.XX.XXXX..XXXXXXXXXXXXX...XX.X..XXX..XXX.XXXX.", "XXXXXXXX.XXX.XXXXXXXX.X..XXX.XXX.XX.XXXX.XX.XXXXXX", "XXXXXXXXXX..X.XX.XX.XXXXXXXXXXX.X..X.X.XXX.X.XXXX.", ".X.XXXXXXXX.XX..XXX..XX.XXXXXX.XX..XX..X.X.X..XXXX", "..XX..XX.X..X.XX..XXXXXX....XX.XX.XXX.X...X.XXXXX.", ".XX.XX.X...XX..X..X.X.X.XXXXXXX...XX.XXXX.XX..XXXX", "XX.XXX.XXXXXX.XX..X.X....XXXX....XXXXXXXXX.XXXXX..", ".XXXXXXXXX..XXXX.XXX.XXXXXXXXXXX.XXXXX..X.XXXXXX.X", "....X..X.X.X.XX.XX.XXX.XX.XXX.XXXX.XX.X.XXX..XXX.X", "X.....XX..XX.X.XX...XXXXX.XX..X.XXX...X.XX...XXXXX", ".XX..XXXXX.XX.X...XX.XXXX.X.X.....XXX..XXXXXXXXX.X", "XX.XXX..X.X.XXX..XXXXXX.X.XXXXX.XXXXXXXXXXXXX..XXX", "X.X.XXX.XX..XXX.XX.X.XXX.XX.XXX.X.XXXXXX.XX...X.XX", "XX.XXXXX..XX..XXX.X.XX.XXXX.XXXXXXX.XXXX.XXXXXXX..", "XXXX..XXXXXXX.X.X...X..XXXXXXX.X..XXXXX.XXX.XX..XX", "X.XXX.XXXXXXXX.XX.XX.X..X.XXXXX.XX.XXX.XXXXX.XXX.X", "XXXXX.XXXXX.X.XX.XXXXXXXXXXXXX.X.XXXX.XXXXXX.X.XX.", "XX.X.XXXXXXXX..X.X.XXXX.XXXXX.X.X.XXXXXXX...X.XXXX", "X.XXXXXXX..XX.X.XXXXXXX..X..XX.X.XXXXXX...X..XX.XX", "X.XXXXXXXX.X...XXX...XXXX..XXXX.X.XX.XXX..X.XXXXX.", "XXXXX..XX..XXXXXXXXXXXXXXXXXXXXXXX.X.XXXXXXXXX.X.X", ".XX.XXX....XXXXXX.X.X.X.XXXXXXX.XXX..XXXXXX.XXXXX.", "XXXX..XXX..XXXX.X..XXXXX.X..XXX.X.XXX.XXXX..XX..XX", "X.XXX..XX.XX.XX.XX.XXX.XXXX..X.XX.XXX.XXXX.XXXXXXX", "XXX.XXX..XX.XXXXXXX..X.XX.XXXXX..XX.XXXXXXXX.XXXXX", "XXXXXXXX.XXXX.XXX.X.XX.X.X.X.XXX.X.XXXX.XXXXX.XXXX", "..XX........X..XXXXXXX.XXX.XXX..X.X.XX...XXXXXXXX.", ".XX....X..XXXX..X.X..X.XXXXX.X..XXXX.XXXXXX.X.X..X", "X.XXX.X.XX.XXX.X.X..X.X.XXX.XXX.XXXXXXX.XX...XXX..", "...XXXX.XXXXXX.XXXX..XXXXXXX.X.X.X.XX..XXXXX.XX.X.", "...XXX.X...XX.XX.X.X.XXXX....XX.XX.XX.XXX.X.XXX.XX", "X..XX..XXXXXXX..XXXXXXX.XX.X.XXXXXXX...XXXXX.X...X", "XXX.X..XX.X.X...XX.XXX.X.X.XXXXX.XXXXXXXXXX.XXXX.X", "XXXXXXX.XX.XX.XXX..X.XXXXX..XX.X.XXXXX..X.X..XX.X.", "XXX.X.X.XX.XX.X.XXXXXXXXXXXXXXXX.X..X.XX.XX.XXX..X", "XXXX.X....XXXXXXXXX.X.X..XX.X..XXXX......XX.X...X.", "X..X.X...XXX.X.X..XX.....X.X...XXX.X.....X.XX..X..", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 15;
        int coinColumn = 9;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case106() {
        String[] level = { "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X................................................X", "X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X", "X.X............................................X.X", "X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X", "X.X.X........................................X.X.X", "X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X", "X.X.X.X....................................X.X.X.X", "X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X", "X.X.X.X.X................................X.X.X.X.X", "X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X", "X.X.X.X.X.X............................X.X.X.X.X.X", "X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X", "X.X.X.X.X.X.X........................X.X.X.X.X.X.X", "X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X....................X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X................X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.XXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X............X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.XXXXXXXXXX.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X........X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.XXXXXX.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X....X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.X.XX.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X.XXXX.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.X......X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X.XXXXXXXX.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.X..........X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X.XXXXXXXXXXXX.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.X..............X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.XXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X..................X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X......................X.X.X.X.X.X.X.X", "X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X", "X.X.X.X.X.X..........................X.X.X.X.X.X.X", "X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X", "X.X.X.X.X..............................X.X.X.X.X.X", "X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X", "X.X.X.X..................................X.X.X.X.X", "X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X", "X.X.X......................................X.X.X.X", "X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X", "X.X..........................................X.X.X", "X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X", "X..............................................X.X", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X", ".................................................X", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 25;
        int coinColumn = 25;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case107() {
        String[] level = { "X.X", "X..", "XXX" };
        int coinRow = 1;
        int coinColumn = 3;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case108() {
        String[] level = { "X..X", "X...", "X...", "XXXX" };
        int coinRow = 1;
        int coinColumn = 4;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case109() {
        String[] level = { "X", ".", ".", "X" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case110() {
        String[] level = { "....", "XX..", "X.XX", "X...", "XXXX" };
        int coinRow = 3;
        int coinColumn = 3;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case111() {
        String[] level = { "XXXX", "X..X", "X...", "XXXX" };
        int coinRow = 2;
        int coinColumn = 4;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case112() {
        String[] level = { "XXXX", "X..X", "X...", "X...", "X...", "X...", "X...", "X...", "X...", "X...", "X...", "X...", "X...", "X...", "X...", "X...", "X...", "X...", "X...", "XXXX" };
        int coinRow = 2;
        int coinColumn = 4;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case113() {
        String[] level = { "XXXX....", "...X.XXX", "XXX..X..", "......X.", "........", "XXXXXXXX" };
        int coinRow = 2;
        int coinColumn = 4;
        assertEquals(3, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case114() {
        String[] level = { "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 3;
        int coinColumn = 25;
        assertEquals(1, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case115() {
        String[] level = { "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
        int coinRow = 1;
        int coinColumn = 1;
        assertEquals(49, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

    @Test
    public void case116() {
        String[] level = { "..........", "..........", "..........", "..........", "..........", "..........", "..........", "XXXXX.XXXX", "..X.......", "XXXXXXXXXX" };
        int coinRow = 8;
        int coinColumn = 8;
        assertEquals(2, arcademanao.shortestLadder(level, coinRow, coinColumn));
    }

}
