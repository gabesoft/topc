package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class ValueHistogramTest {
    ValueHistogram valuehistogram = new ValueHistogram();

    @Test
    public void case1() {
        int[] values = { 2, 3, 5, 5, 5, 2, 0, 8 };
        assertArrayEquals(new String[] { "..........", ".....X....", "..X..X....", "X.XX.X..X." }, valuehistogram.build(values));
    }

    @Test
    public void case2() {
        int[] values = { 9, 9, 9, 9 };
        assertArrayEquals(new String[] { "..........", ".........X", ".........X", ".........X", ".........X" }, valuehistogram.build(values));
    }

    @Test
    public void case3() {
        int[] values = { 6, 4, 0, 0, 3, 9, 8, 8 };
        assertArrayEquals(new String[] { "..........", "X.......X.", "X..XX.X.XX" }, valuehistogram.build(values));
    }

    @Test
    public void case4() {
        int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertArrayEquals(new String[] { "..........", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case5() {
        int[] values = { 6, 2, 3, 3, 3, 7, 8, 1, 0, 9, 2, 2, 4, 3 };
        assertArrayEquals(new String[] { "..........", "...X......", "..XX......", "..XX......", "XXXXX.XXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case6() {
        int[] values = { 7 };
        assertArrayEquals(new String[] { "..........", ".......X.." }, valuehistogram.build(values));
    }

    @Test
    public void case7() {
        int[] values = { 6 };
        assertArrayEquals(new String[] { "..........", "......X..." }, valuehistogram.build(values));
    }

    @Test
    public void case8() {
        int[] values = { 0, 4, 0, 6, 8 };
        assertArrayEquals(new String[] { "..........", "X.........", "X...X.X.X." }, valuehistogram.build(values));
    }

    @Test
    public void case9() {
        int[] values = { 2, 7, 7, 3, 1, 2, 7, 0 };
        assertArrayEquals(new String[] { "..........", ".......X..", "..X....X..", "XXXX...X.." }, valuehistogram.build(values));
    }

    @Test
    public void case10() {
        int[] values = { 7, 5, 6, 4, 2, 3, 9, 4, 5, 6 };
        assertArrayEquals(new String[] { "..........", "....XXX...", "..XXXXXX.X" }, valuehistogram.build(values));
    }

    @Test
    public void case11() {
        int[] values = { 4, 4, 3, 6, 0, 1, 5, 5, 6, 5, 2 };
        assertArrayEquals(new String[] { "..........", ".....X....", "....XXX...", "XXXXXXX..." }, valuehistogram.build(values));
    }

    @Test
    public void case12() {
        int[] values = { 7, 6, 6 };
        assertArrayEquals(new String[] { "..........", "......X...", "......XX.." }, valuehistogram.build(values));
    }

    @Test
    public void case13() {
        int[] values = { 4, 4 };
        assertArrayEquals(new String[] { "..........", "....X.....", "....X....." }, valuehistogram.build(values));
    }

    @Test
    public void case14() {
        int[] values = { 8, 4, 7, 5, 5, 8, 3 };
        assertArrayEquals(new String[] { "..........", ".....X..X.", "...XXX.XX." }, valuehistogram.build(values));
    }

    @Test
    public void case15() {
        int[] values = { 8, 8 };
        assertArrayEquals(new String[] { "..........", "........X.", "........X." }, valuehistogram.build(values));
    }

    @Test
    public void case16() {
        int[] values = { 3, 8, 8, 6 };
        assertArrayEquals(new String[] { "..........", "........X.", "...X..X.X." }, valuehistogram.build(values));
    }

    @Test
    public void case17() {
        int[] values = { 7, 0, 1, 7, 5, 3, 8, 7, 8, 7, 3 };
        assertArrayEquals(new String[] { "..........", ".......X..", ".......X..", "...X...XX.", "XX.X.X.XX." }, valuehistogram.build(values));
    }

    @Test
    public void case18() {
        int[] values = { 6, 4, 1, 6, 5, 7, 4, 0, 4, 6, 3, 9, 4, 2, 4, 4, 1, 3, 2, 4, 1, 4 };
        assertArrayEquals(new String[] { "..........", "....X.....", "....X.....", "....X.....", "....X.....", "....X.....", ".X..X.X...", ".XXXX.X...", "XXXXXXXX.X" }, valuehistogram.build(values));
    }

    @Test
    public void case19() {
        int[] values = { 6, 2, 2, 4, 2, 2, 2, 9, 2, 2, 2 };
        assertArrayEquals(new String[] { "..........", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "..X.X.X..X" }, valuehistogram.build(values));
    }

    @Test
    public void case20() {
        int[] values = { 0, 6, 9, 4, 5, 5, 5, 7, 0, 4, 2, 3, 0, 6, 2, 1, 9, 6, 1, 2, 8, 7, 6, 8 };
        assertArrayEquals(new String[] { "..........", "......X...", "X.X..XX...", "XXX.XXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case21() {
        int[] values = { 1, 1, 2, 9, 2, 4, 5, 2, 7, 2, 6, 1 };
        assertArrayEquals(new String[] { "..........", "..X.......", ".XX.......", ".XX.......", ".XX.XXXX.X" }, valuehistogram.build(values));
    }

    @Test
    public void case22() {
        int[] values = { 0, 5, 4, 8, 9, 2, 3, 6, 7, 2, 2, 1, 6, 8, 3, 6, 9, 3, 1, 8, 1 };
        assertArrayEquals(new String[] { "..........", ".XXX..X.X.", ".XXX..X.XX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case23() {
        int[] values = { 2, 6, 7, 9, 9, 3, 5, 7, 9, 2 };
        assertArrayEquals(new String[] { "..........", ".........X", "..X....X.X", "..XX.XXX.X" }, valuehistogram.build(values));
    }

    @Test
    public void case24() {
        int[] values = { 2, 2, 6, 2, 1, 2, 2, 7, 7, 2, 2, 6, 2, 2, 5, 2 };
        assertArrayEquals(new String[] { "..........", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "..X...XX..", ".XX..XXX.." }, valuehistogram.build(values));
    }

    @Test
    public void case25() {
        int[] values = { 2, 4, 7, 7, 3, 0, 8, 0, 7, 6, 1, 1, 2, 4, 2, 6, 2 };
        assertArrayEquals(new String[] { "..........", "..X.......", "..X....X..", "XXX.X.XX..", "XXXXX.XXX." }, valuehistogram.build(values));
    }

    @Test
    public void case26() {
        int[] values = { 9, 0, 4, 9, 1, 9, 8, 5, 4, 3, 3, 1, 6, 4, 3, 1, 1, 3, 4, 5, 9, 4, 2, 1, 3, 6, 6, 6 };
        assertArrayEquals(new String[] { "..........", ".X.XX.....", ".X.XX.X..X", ".X.XX.X..X", ".X.XXXX..X", "XXXXXXX.XX" }, valuehistogram.build(values));
    }

    @Test
    public void case27() {
        int[] values = { 8, 9, 9, 0, 4, 1, 3, 7, 3, 9, 1, 4, 4, 4, 4, 4, 6, 9, 9, 0, 4, 7 };
        assertArrayEquals(new String[] { "..........", "....X.....", "....X.....", "....X....X", "....X....X", "....X....X", "XX.XX..X.X", "XX.XX.XXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case28() {
        int[] values = { 7, 9, 8, 0, 8, 8, 5, 1, 8, 8, 3, 8, 1, 7 };
        assertArrayEquals(new String[] { "..........", "........X.", "........X.", "........X.", "........X.", ".X.....XX.", "XX.X.X.XXX" }, valuehistogram.build(values));
    }

    @Test
    public void case29() {
        int[] values = { 2, 4, 4, 1, 4, 2, 4, 9, 5, 3, 2, 5, 7, 4, 4, 4, 5, 2, 0, 4, 3, 8, 1 };
        assertArrayEquals(new String[] { "..........", "....X.....", "....X.....", "....X.....", "....X.....", "..X.X.....", "..X.XX....", ".XXXXX....", "XXXXXX.XXX" }, valuehistogram.build(values));
    }

    @Test
    public void case30() {
        int[] values = { 2, 3, 6, 3, 6, 6, 8, 1, 9, 7, 4, 3, 6, 4 };
        assertArrayEquals(new String[] { "..........", "......X...", "...X..X...", "...XX.X...", ".XXXX.XXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case31() {
        int[] values = { 2, 9, 6, 5, 6, 9, 6, 6, 6, 6 };
        assertArrayEquals(new String[] { "..........", "......X...", "......X...", "......X...", "......X...", "......X..X", "..X..XX..X" }, valuehistogram.build(values));
    }

    @Test
    public void case32() {
        int[] values = { 8, 2, 1, 9, 8, 3, 8, 6, 1, 3, 5, 0, 3, 1, 1, 2, 8, 6, 6, 0 };
        assertArrayEquals(new String[] { "..........", ".X......X.", ".X.X..X.X.", "XXXX..X.X.", "XXXX.XX.XX" }, valuehistogram.build(values));
    }

    @Test
    public void case33() {
        int[] values = { 1, 9, 2, 1, 3, 1, 1, 7, 9, 2, 6, 8, 4, 2, 8, 2, 2, 1, 3, 9, 8, 0, 3, 8, 8 };
        assertArrayEquals(new String[] { "..........", ".XX.....X.", ".XX.....X.", ".XXX....XX", ".XXX....XX", "XXXXX.XXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case34() {
        int[] values = { 1, 0, 6, 4, 1, 5, 1, 3, 7, 1, 4, 1, 7 };
        assertArrayEquals(new String[] { "..........", ".X........", ".X........", ".X........", ".X..X..X..", "XX.XXXXX.." }, valuehistogram.build(values));
    }

    @Test
    public void case35() {
        int[] values = { 1, 9, 2, 3, 2, 2, 0, 2, 2, 2, 2, 3, 7, 4, 2 };
        assertArrayEquals(new String[] { "..........", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "..XX......", "XXXXX..X.X" }, valuehistogram.build(values));
    }

    @Test
    public void case36() {
        int[] values = { 2, 6, 0, 4, 6, 7, 1, 8, 2, 6, 9, 4, 8, 8, 9, 2, 6, 1, 6, 1 };
        assertArrayEquals(new String[] { "..........", "......X...", "......X...", ".XX...X.X.", ".XX.X.X.XX", "XXX.X.XXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case37() {
        int[] values = { 9, 8, 1, 7, 9, 1, 6, 8, 7, 6, 7, 3, 3, 7, 9, 3, 8, 6, 7, 3, 8, 5, 2, 0, 8, 7, 7 };
        assertArrayEquals(new String[] { "..........", ".......X..", ".......X..", ".......XX.", "...X...XX.", "...X..XXXX", ".X.X..XXXX", "XXXX.XXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case38() {
        int[] values = { 2, 3, 4, 5, 3, 8, 8, 3, 3, 1, 6, 5, 2, 5, 9, 5, 2, 2, 5, 3, 6, 3, 7, 3, 8, 3, 3, 0, 5, 7, 0, 4, 3, 5, 2, 1, 9, 5, 3, 3, 7, 5, 6, 2, 7, 5, 0, 0 };
        assertArrayEquals(new String[] { "..........", "...X......", "...X......", "...X.X....", "...X.X....", "...X.X....", "...X.X....", "..XX.X....", "..XX.X....", "X.XX.X.X..", "X.XX.XXXX.", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case39() {
        int[] values = { 0, 3, 8, 8, 3, 5, 1, 1, 8, 5, 0, 8, 6, 7, 9, 8, 2, 0, 2, 3, 5, 0, 6, 0, 5, 2, 8, 1, 5, 3, 4, 7, 9, 5, 5, 1, 5, 7, 7, 6, 9, 1, 5, 3 };
        assertArrayEquals(new String[] { "..........", ".....X....", ".....X....", ".....X....", ".....X..X.", "XX.X.X..X.", "XX.X.X.XX.", "XXXX.XXXXX", "XXXX.XXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case40() {
        int[] values = { 4, 3, 6, 6, 6, 3, 0, 0, 3, 6, 9, 9, 0, 1, 9, 2, 3, 7, 6, 2, 4, 8, 8, 4, 7, 4, 8, 2, 3, 4, 3, 6, 0, 5, 7, 8, 6, 1, 9, 2, 1, 1, 0, 9, 8, 4, 9, 2, 1 };
        assertArrayEquals(new String[] { "..........", "......X...", "...XX.X..X", "XXXXX.X.XX", "XXXXX.X.XX", "XXXXX.XXXX", "XXXXX.XXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case41() {
        int[] values = { 0, 2, 0, 7, 2, 0, 7, 6, 6, 6, 2, 5, 6, 2, 5, 7, 4, 3, 9, 1, 8, 9, 2, 4, 0, 2, 5, 5, 1, 9, 3, 0, 4, 4, 0, 0, 3, 7, 3, 8 };
        assertArrayEquals(new String[] { "..........", "X.........", "X.X.......", "X.X.......", "X.XXXXXX..", "X.XXXXXX.X", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case42() {
        int[] values = { 0, 6, 1, 7, 5, 7, 4, 1, 8, 0, 9, 4, 7, 0, 5, 7, 3, 3, 2, 0, 8, 7, 0, 3, 9, 8, 6, 8, 3, 5, 8, 6, 7, 0, 2, 4, 2, 3, 0, 9, 2, 3, 8, 0, 0, 7, 7 };
        assertArrayEquals(new String[] { "..........", "X.........", "X......X..", "X......X..", "X..X...XX.", "X..X...XX.", "X.XX...XX.", "X.XXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case43() {
        int[] values = { 0, 2, 4, 2, 8, 0, 0, 0, 2, 2, 5, 0, 0, 6, 2, 9, 0, 8, 6, 8, 5, 6, 0, 2, 9, 2, 5, 2, 0, 0, 9, 8, 5, 2, 1, 0, 6, 0, 6, 8, 6 };
        assertArrayEquals(new String[] { "..........", "X.........", "X.........", "X.........", "X.X.......", "X.X.......", "X.X.......", "X.X...X...", "X.X...X.X.", "X.X..XX.X.", "X.X..XX.XX", "X.X..XX.XX", "XXX.XXX.XX" }, valuehistogram.build(values));
    }

    @Test
    public void case44() {
        int[] values = { 3, 7, 1, 8, 3, 7, 1, 8, 0, 2, 3, 1, 3, 8, 8, 3, 7, 4, 3, 5, 1, 3, 1, 1, 3, 8, 1, 9, 0, 9, 3, 1, 9, 1, 3, 7, 5, 2, 4, 2 };
        assertArrayEquals(new String[] { "..........", "...X......", ".X.X......", ".X.X......", ".X.X......", ".X.X......", ".X.X....X.", ".X.X...XX.", ".XXX...XXX", "XXXXXX.XXX", "XXXXXX.XXX" }, valuehistogram.build(values));
    }

    @Test
    public void case45() {
        int[] values = { 5, 8, 7, 3, 1, 2, 8, 5, 5, 2, 7, 0, 5, 1, 2, 8, 2, 0, 9, 0, 8, 6, 3, 4, 1, 2, 9, 7, 1, 1, 4, 4, 9, 5, 3, 3, 0, 0, 2, 6, 8, 6, 3, 6, 8 };
        assertArrayEquals(new String[] { "..........", "..X.....X.", "XXXX.X..X.", "XXXX.XX.X.", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case46() {
        int[] values = { 6, 5, 4, 2, 2, 8, 4, 4, 0, 8, 3, 6, 9, 7, 0, 6, 3, 4, 9, 7, 9, 3, 2, 6, 8, 7, 0, 1, 1, 6, 7, 6, 5, 7, 3, 9, 1, 3, 0, 8, 6, 3 };
        assertArrayEquals(new String[] { "..........", "......X...", "...X..X...", "...X..XX..", "X..XX.XXXX", "XXXXX.XXXX", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case47() {
        int[] values = { 9, 4, 5, 0, 5, 4, 6, 4, 3, 6, 2, 3, 4, 4, 4, 7, 5, 1, 4, 4, 4, 2, 1, 0, 3, 7, 0, 5, 7, 7, 7, 5, 6, 8, 8, 1, 3, 4, 4, 4, 4, 5, 5, 4, 8, 6, 2 };
        assertArrayEquals(new String[] { "..........", "....X.....", "....X.....", "....X.....", "....X.....", "....X.....", "....X.....", "....X.....", "....XX....", "....XX....", "....XX.X..", "...XXXXX..", "XXXXXXXXX.", "XXXXXXXXX.", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case48() {
        int[] values = { 8, 4, 9, 8, 1, 6, 7, 3, 4, 8, 6, 8, 6, 9, 8, 8, 8, 6, 0, 2, 8, 8, 4, 2, 8, 4, 0, 7, 5, 6, 0, 8, 8, 3, 2, 8, 7, 9, 8, 4 };
        assertArrayEquals(new String[] { "..........", "........X.", "........X.", "........X.", "........X.", "........X.", "........X.", "........X.", "........X.", "........X.", "....X.X.X.", "....X.X.X.", "X.X.X.XXXX", "X.XXX.XXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case49() {
        int[] values = { 4, 2, 2, 5, 3, 0, 8, 7, 6, 0, 0, 6, 5, 8, 0, 5, 8, 6, 4, 8, 9, 2, 9, 6, 8, 9, 8, 0, 2, 1, 7, 9, 4, 2, 6, 5, 4, 5, 6, 6, 6, 3, 8, 2 };
        assertArrayEquals(new String[] { "..........", "......X...", "......X.X.", "..X...X.X.", "X.X..XX.X.", "X.X.XXX.XX", "X.X.XXX.XX", "X.XXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case50() {
        int[] values = { 9, 5, 9, 7, 8, 1, 5, 7, 6, 6, 5, 8, 5, 1, 0, 3, 6, 8, 6, 4, 3, 8, 5, 3, 2, 1, 8, 0, 6, 2, 4, 7, 2, 6, 3, 0, 8, 3, 0, 6, 7, 1, 5, 4 };
        assertArrayEquals(new String[] { "..........", "......X...", ".....XX.X.", "...X.XX.X.", "XX.X.XXXX.", "XXXXXXXXX.", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case51() {
        int[] values = { 6, 1, 5, 0, 1, 0, 3, 3, 5, 5, 6, 5, 9, 8, 6, 3, 1, 9, 6, 6, 8, 4, 1, 6, 4, 6, 8, 7, 6, 0, 6, 8, 3, 6, 0, 3, 8, 3, 5, 6, 0, 9, 7 };
        assertArrayEquals(new String[] { "..........", "......X...", "......X...", "......X...", "......X...", "......X...", "...X..X...", "X..X.XX.X.", "XX.X.XX.X.", "XX.X.XX.XX", "XX.XXXXXXX", "XX.XXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case52() {
        int[] values = { 6, 5, 0, 8, 2, 2, 6, 3, 4, 3, 0, 8, 3, 2, 9, 2, 8, 5, 4, 1, 1, 5, 1, 0, 0, 4, 6, 7, 1, 0, 7, 9, 5, 0, 0, 9, 5, 4, 1, 3, 4, 3, 4, 3, 8, 6 };
        assertArrayEquals(new String[] { "..........", "X.........", "X..XX.....", "XX.XXX....", "XXXXXXX.X.", "XXXXXXX.XX", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case53() {
        int[] values = { 7, 6, 8, 4, 1, 8, 1, 4, 6, 8, 0, 2, 0, 1, 5, 9, 2, 8, 8, 6, 8, 1, 6, 3, 8, 8, 9, 8, 0, 3, 4, 8, 6, 5, 7, 8, 5, 9, 6, 0, 8, 8, 8 };
        assertArrayEquals(new String[] { "..........", "........X.", "........X.", "........X.", "........X.", "........X.", "........X.", "........X.", "........X.", "......X.X.", "......X.X.", "XX....X.X.", "XX..XXX.XX", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case54() {
        int[] values = { 4, 4, 8, 0, 7, 1, 0, 0, 7, 2, 8, 8, 0, 8, 1, 0, 3, 6, 0, 9, 6, 6, 4, 0, 3, 4, 4, 7, 1, 6, 0, 5, 4, 5, 7, 0, 4, 2, 9, 2 };
        assertArrayEquals(new String[] { "..........", "X.........", "X.........", "X...X.....", "X...X.....", "X...X.....", "X...X.XXX.", "XXX.X.XXX.", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case55() {
        int[] values = { 6, 6, 3, 3, 5, 8, 1, 1, 1, 4, 4, 1, 3, 1, 7, 9, 5, 4, 8, 2, 8, 0, 8, 0, 8, 7, 0, 0, 7, 4, 6, 1, 0, 5, 1, 6, 1, 4, 6, 6, 1, 6, 5, 9, 6, 1, 5, 9 };
        assertArrayEquals(new String[] { "..........", ".X........", ".X........", ".X....X...", ".X....X...", ".X....X...", "XX..XXX.X.", "XX..XXX.X.", "XX.XXXXXXX", "XX.XXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case56() {
        int[] values = { 3, 4, 2, 3, 8, 8, 1, 1, 0, 5, 9, 0, 4, 8, 1, 4, 1, 1, 5, 9, 6, 9, 3, 9, 6, 0, 0, 9, 0, 0, 1, 2, 9, 0, 9, 6, 7, 0, 7, 0, 6, 1, 0, 3, 4, 1 };
        assertArrayEquals(new String[] { "..........", "X.........", "X.........", "XX........", "XX.......X", "XX.......X", "XX.......X", "XX.XX.X..X", "XX.XX.X.XX", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case57() {
        int[] values = { 9, 5, 9, 9, 5, 5, 4, 5, 4, 3, 1, 0, 0, 9, 2, 0, 9, 0, 9, 4, 8, 6, 9, 3, 5, 9, 4, 4, 6, 9, 5, 8, 5, 3, 2, 1, 3, 5, 6, 3, 8, 9, 2, 9, 8, 6, 3, 9, 7 };
        assertArrayEquals(new String[] { "..........", ".........X", ".........X", ".........X", ".........X", ".....X...X", ".....X...X", "...X.X...X", "...XXX...X", "X..XXXX.XX", "X.XXXXX.XX", "XXXXXXX.XX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case58() {
        int[] values = { 2, 6, 3, 7, 2, 0, 1, 3, 3, 0, 0, 9, 0, 6, 3, 2, 1, 4, 0, 2, 0, 9, 8, 2, 8, 8, 7, 0, 1, 2, 9, 2, 8, 1, 2, 8, 0, 1, 9, 2, 2, 4, 7, 2, 8, 8, 8, 7, 2, 2 };
        assertArrayEquals(new String[] { "..........", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "X.X.....X.", "X.X.....X.", "X.X.....X.", "XXX.....X.", "XXXX...XXX", "XXXX...XXX", "XXXXX.XXXX", "XXXXX.XXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case59() {
        int[] values = { 9, 6, 5, 3, 0, 5, 3, 5, 0, 3, 2, 5, 6, 3, 4, 5, 5, 5, 1, 3, 9, 5, 6, 3, 5, 2, 7, 5, 2, 1, 4, 2, 5, 5, 8, 1, 3, 1, 6, 7, 5, 6, 3, 7, 6, 3, 9, 6, 8, 2 };
        assertArrayEquals(new String[] { "..........", ".....X....", ".....X....", ".....X....", ".....X....", "...X.X....", "...X.X....", "...X.XX...", "...X.XX...", "..XX.XX...", ".XXX.XX...", ".XXX.XXX.X", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case60() {
        int[] values = { 1, 0, 7, 8, 5, 4, 9, 9, 2, 2, 5, 5, 2, 4, 4, 8, 6, 2, 6, 2, 7, 8, 7, 1, 9, 7, 2, 7, 8, 6, 2, 2, 4, 6, 8, 2, 2, 8, 2, 5, 3, 3, 7, 0, 1, 5, 5, 6, 9, 6 };
        assertArrayEquals(new String[] { "..........", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "..X..XXXX.", "..X..XXXX.", "..X.XXXXXX", ".XX.XXXXXX", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case61() {
        int[] values = { 7, 8, 5, 0, 9, 7, 6, 0, 2, 7, 7, 7, 7, 1, 2, 7, 3, 7, 1, 2, 3, 2, 5, 0, 7, 0, 7, 5, 8, 2, 8, 3, 3, 3, 7, 3, 7, 7, 2, 0, 8, 6, 0, 5, 3, 8, 6, 6, 2, 7 };
        assertArrayEquals(new String[] { "..........", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", "..XX...X..", "X.XX...X..", "X.XX...XX.", "X.XX.XXXX.", "X.XX.XXXX.", "XXXX.XXXX.", "XXXX.XXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case62() {
        int[] values = { 3, 7, 2, 3, 2, 5, 4, 3, 9, 2, 6, 5, 8, 8, 9, 6, 2, 6, 7, 0, 5, 4, 2, 4, 6, 2, 5, 2, 8, 0, 6, 4, 2, 6, 2, 6, 2, 5, 2, 8, 0, 2, 4, 1, 6, 4, 1, 6, 2, 2 };
        assertArrayEquals(new String[] { "..........", "..X.......", "..X.......", "..X.......", "..X.......", "..X.......", "..X...X...", "..X...X...", "..X...X...", "..X.X.X...", "..X.XXX...", "..X.XXX.X.", "X.XXXXX.X.", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case63() {
        int[] values = { 6, 1, 4, 2, 9, 5, 6, 8, 9, 3, 2, 6, 4, 7, 0, 7, 5, 7, 6, 4, 8, 0, 6, 8, 8, 8, 8, 8, 9, 4, 4, 0, 9, 1, 6, 2, 6, 9, 3, 5, 6, 4, 6, 8, 4, 2, 1, 9, 9, 6 };
        assertArrayEquals(new String[] { "..........", "......X...", "......X...", "......X.X.", "....X.X.XX", "....X.X.XX", "....X.X.XX", "..X.X.X.XX", "XXX.XXXXXX", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case64() {
        int[] values = { 0, 1, 6, 6, 4, 4, 3, 8, 6, 4, 8, 1, 5, 0, 6, 2, 1, 6, 6, 6, 2, 0, 6, 9, 6, 0, 7, 4, 0, 4, 8, 1, 5, 7, 6, 6, 9, 1, 7, 1, 6, 7, 3, 6, 6, 4, 6, 5, 4, 9 };
        assertArrayEquals(new String[] { "..........", "......X...", "......X...", "......X...", "......X...", "......X...", "......X...", "......X...", "......X...", "....X.X...", ".X..X.X...", "XX..X.X...", "XX..X.XX..", "XX..XXXXXX", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case65() {
        int[] values = { 1, 7, 9, 3, 5, 5, 0, 3, 7, 5, 5, 6, 7, 8, 7, 1, 5, 6, 1, 3, 2, 4, 7, 1, 7, 6, 5, 6, 4, 7, 7, 9, 7, 7, 7, 7, 0, 6, 2, 9, 8, 2, 4, 7, 7, 2, 4, 7, 5, 7 };
        assertArrayEquals(new String[] { "..........", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".....X.X..", ".....X.X..", ".....XXX..", ".XX.XXXX..", ".XXXXXXX.X", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case66() {
        int[] values = { 5, 0, 4, 6, 1, 3, 2, 6, 4, 5, 9, 5, 2, 8, 5, 4, 4, 9, 2, 4, 8, 4, 8, 0, 9, 9, 8, 0, 6, 9, 7, 6, 5, 6, 8, 4, 0, 6, 4, 7, 2, 3, 4, 6, 4, 5, 8, 4, 4, 2 };
        assertArrayEquals(new String[] { "..........", "....X.....", "....X.....", "....X.....", "....X.....", "....X.....", "....X.X...", "....XXX.X.", "..X.XXX.XX", "X.X.XXX.XX", "X.X.XXX.XX", "X.XXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case67() {
        int[] values = { 8, 1, 5, 8, 4, 4, 5, 6, 5, 3, 7, 7, 2, 4, 8, 8, 6, 5, 6, 3, 7, 6, 8, 2, 2, 6, 6, 4, 3, 2, 6, 7, 2, 3, 6, 8, 1, 2, 6, 9, 4, 1, 3, 7, 8, 8, 3, 9, 6, 9 };
        assertArrayEquals(new String[] { "..........", "......X...", "......X...", "......X.X.", "......X.X.", "..XX..X.X.", "..XXX.XXX.", "..XXXXXXX.", ".XXXXXXXXX", ".XXXXXXXXX", ".XXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case68() {
        int[] values = { 6, 0, 3, 8, 9, 9, 9, 9, 0, 9, 3, 9, 0, 9, 9, 9, 9, 9, 0, 9, 8, 2, 9, 9, 5, 5, 9, 7, 9, 3, 1, 3, 0, 9, 6, 9, 2, 9, 9, 9, 9, 9, 9, 9, 9, 1, 2, 9, 9, 2 };
        assertArrayEquals(new String[] { "..........", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", "X........X", "X.XX.....X", "X.XX.....X", "XXXX.XX.XX", "XXXX.XXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case69() {
        int[] values = { 3, 9, 9, 9, 9, 9, 2, 9, 5, 9, 9, 9, 9, 9, 9, 3, 0, 9, 9, 0, 9, 8, 6, 9, 4, 1, 2, 5, 4, 9, 9, 9, 9, 9, 9, 0, 0, 2, 6, 9, 0, 9, 2, 3, 0, 5, 4, 8, 6, 9 };
        assertArrayEquals(new String[] { "..........", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", "X........X", "X........X", "X.X......X", "X.XXXXX..X", "X.XXXXX.XX", "XXXXXXX.XX" }, valuehistogram.build(values));
    }

    @Test
    public void case70() {
        int[] values = { 4, 4, 1, 1, 3, 1, 1, 1, 1, 1, 2, 1, 1, 5, 6, 8, 1, 3, 3, 0, 1, 1, 1, 1, 2, 1, 0, 1, 5, 3, 1, 1, 8, 1, 0, 2, 1, 0, 2, 1, 9, 2, 1, 6, 1, 1, 2, 1, 8, 1 };
        assertArrayEquals(new String[] { "..........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".XX.......", ".XX.......", "XXXX......", "XXXX....X.", "XXXXXXX.X.", "XXXXXXX.XX" }, valuehistogram.build(values));
    }

    @Test
    public void case71() {
        int[] values = { 1, 7, 7, 7, 5, 7, 7, 7, 9, 3, 7, 7, 7, 9, 7, 7, 7, 1, 7, 7, 4, 7, 5, 7, 9, 5, 0, 7, 0, 7, 7, 7, 4, 7, 4, 7, 7, 0, 6, 4, 7, 0, 0, 7, 7, 7, 7, 7, 7, 7 };
        assertArrayEquals(new String[] { "..........", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", ".......X..", "X......X..", "X...X..X..", "X...XX.X.X", "XX..XX.X.X", "XX.XXXXX.X" }, valuehistogram.build(values));
    }

    @Test
    public void case72() {
        int[] values = { 8, 1, 1, 1, 7, 2, 8, 2, 1, 7, 1, 1, 1, 1, 1, 7, 1, 1, 1, 3, 6, 1, 1, 1, 1, 5, 3, 7, 1, 1, 7, 0, 7, 1, 1, 1, 1, 4, 4, 4, 1, 6, 0, 1, 1, 1, 1, 1, 5, 1 };
        assertArrayEquals(new String[] { "..........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X.....X..", ".X.....X..", ".X.....X..", ".X..X..X..", "XXXXXXXXX.", "XXXXXXXXX." }, valuehistogram.build(values));
    }

    @Test
    public void case73() {
        int[] values = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        assertArrayEquals(new String[] { "..........", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X....", ".....X...." }, valuehistogram.build(values));
    }

    @Test
    public void case74() {
        int[] values = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 7, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 7, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        assertArrayEquals(new String[] { "..........", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X......", "...X...X..", "...X...X.." }, valuehistogram.build(values));
    }

    @Test
    public void case75() {
        int[] values = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9 };
        assertArrayEquals(new String[] { "..........", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case76() {
        int[] values = { 6, 2, 3, 3, 3, 7, 8, 1, 0, 9, 2, 2, 4, 3 };
        assertArrayEquals(new String[] { "..........", "...X......", "..XX......", "..XX......", "XXXXX.XXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case77() {
        int[] values = { 6, 4, 0, 0, 3, 9, 8, 8 };
        assertArrayEquals(new String[] { "..........", "X.......X.", "X..XX.X.XX" }, valuehistogram.build(values));
    }

    @Test
    public void case78() {
        int[] values = { 2, 3, 5, 5, 5, 2, 0, 8 };
        assertArrayEquals(new String[] { "..........", ".....X....", "..X..X....", "X.XX.X..X." }, valuehistogram.build(values));
    }

    @Test
    public void case79() {
        int[] values = { 2, 3, 0, 0, 5 };
        assertArrayEquals(new String[] { "..........", "X.........", "X.XX.X...." }, valuehistogram.build(values));
    }

    @Test
    public void case80() {
        int[] values = { 5, 1, 4, 2, 5, 4, 2, 5, 1, 1, 4, 2 };
        assertArrayEquals(new String[] { "..........", ".XX.XX....", ".XX.XX....", ".XX.XX...." }, valuehistogram.build(values));
    }

    @Test
    public void case81() {
        int[] values = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertArrayEquals(new String[] { "..........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........" }, valuehistogram.build(values));
    }

    @Test
    public void case82() {
        int[] values = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        assertArrayEquals(new String[] { "..........", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X" }, valuehistogram.build(values));
    }

    @Test
    public void case83() {
        int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertArrayEquals(new String[] { "..........", "XXXXXXXXXX" }, valuehistogram.build(values));
    }

    @Test
    public void case84() {
        int[] values = { 9, 0, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        assertArrayEquals(new String[] { "..........", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", ".........X", "X........X" }, valuehistogram.build(values));
    }

    @Test
    public void case85() {
        int[] values = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2 };
        assertArrayEquals(new String[] { "..........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".X........", ".XX.......", ".XX.......", ".XX......." }, valuehistogram.build(values));
    }

    @Test
    public void case86() {
        int[] values = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(new String[] { "..........", "X.........", "X.........", "X.........", "X.........", "X.........", "X.........", "X.........", "X.........", "X.........", "X.........", "X........." }, valuehistogram.build(values));
    }

}
