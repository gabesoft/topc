package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class MazeMakerTest {
    MazeMaker mazemaker = new MazeMaker();

    @Test
    public void case1() {
        String[] maze = { "...", "...", "..." };
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(3, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case2() {
        String[] maze = { "...", "...", "..." };
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = { 1, 0, -1, 0, 1, 1, -1, -1 };
        int[] moveCol = { 0, 1, 0, -1, 1, -1, 1, -1 };
        assertEquals(2, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case3() {
        String[] maze = { "X.X", "...", "XXX", "X.X" };
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case4() {
        String[] maze = { "X.X", "...", "XXX", "X.X" };
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = { 1, 0, -1, 0, 2 };
        int[] moveCol = { 0, 1, 0, -1, 0 };
        assertEquals(2, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case5() {
        String[] maze = { ".......", "X.X.X..", "XXX...X", "....X..", "X....X.", "......." };
        int startRow = 5;
        int startCol = 0;
        int[] moveRow = { 1, 0, -1, 0, -2, 1 };
        int[] moveCol = { 0, -1, 0, 1, 3, 0 };
        assertEquals(7, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case6() {
        String[] maze = { ".XXXXXXXX.", "X.XXXXXX.X", "XX.XXXX.XX", "XXX.XX.XXX", "XXXX..XXXX", "XXXX..XXXX", "XXXX.X.XXX", "XXX.XXX.XX", "XX.XXXXX.X", "X.XXXXXXX." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 9, 0, -8, 0, 7, 0, -6, 0, 5, 0, -4, 0, 3, 0, -2, 0, 1 };
        int[] moveCol = { 9, 0, -8, 0, 7, 0, -6, 0, 5, 0, -4, 0, 3, 0, -2, 0, 1, 0 };
        assertEquals(18, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case7() {
        String[] maze = { ".....", "XXXX.", "...X.", ".XXX.", "X...." };
        int startRow = 2;
        int startCol = 2;
        int[] moveRow = { 1, 0, -1, 0, 1, 0, -1 };
        int[] moveCol = { 0, 1, 0, -1, 1, 0, -1 };
        assertEquals(14, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case8() {
        String[] maze = { "......." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 1, 0, 1, 0, 1, 0 };
        int[] moveCol = { 0, 1, 0, 1, 0, 1 };
        assertEquals(6, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case9() {
        String[] maze = { "X..X.XXX...XX...XX.XXX", "..X..X.X.XX.X..XXXXX..", ".XXX.X.X..XX.XX..XXXXX", "...X.X..XXX.X.X...X..X", "X.X..XX.XX..X..XXX.XXX" };
        int startRow = 1;
        int startCol = 4;
        int[] moveRow = { -3, 50, -9, -32, -3, 12, 47, -37, -44, 48, 10, 8, 23, 24, 10, 47, 20, -40, -30, -39, 3, -31, -3, -43, -42, -31, -23, -29, 12, 26, -30 };
        int[] moveCol = { 16, 31, -30, 2, -40, -2, 7, 48, 46, -40, 34, -3, -32, 43, 18, -5, 48, -38, 47, 39, 39, -42, -22, 4, -18, 7, 26, 41, 48, -28, -41 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case10() {
        String[] maze = { "..XXXX.X", "XX...X..", ".XXXXX..", "........", "XX.XXX.X", "X..XX.XX", "..XX.X..", "X...X..X", "..XX.XXX", "..XX.XX.", ".XXXXX..", "...X..XX", "X...XX..", "X.XX.X.X", "..XX.X..", "...XX..X", "X.XXX..X", "...XXXX.", "X.X.XXX.", "X......X", "..X.X..X", ".XX...X.", ".XXXX..X", "XXXXXX.X", "XX...X.X", ".X.X..X.", ".X.X.X.." };
        int startRow = 15;
        int startCol = 6;
        int[] moveRow = { 47, -7, 5, -38, 20, 43, -9, 12, -43, 23, -43, 7, 26, 20, 23, -17, -16, 28, 42, 41 };
        int[] moveCol = { 20, 31, -26, -15, -41, 12, -44, 12, -22, -25, -14, 46, 19, -24, 4, -7, -15, -16, 5, 16 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case11() {
        String[] maze = { "XX.X.X..X.XXXX.X...X.X.X.X....XXX...XX....XX", "XXX.X.XX...X.X.X.X.XXXX...XX.XX.X.XXX.......", "..X...X..XX.XX...X...X.XXX.X...XXX.XX.XX.X..", ".....X.X....XXX..XX..XX.XX.....XX.X...XXX..X", "X.XX.X..X.X..X.XXXX.X..X.X...XXXXX...X....XX", ".X.XXX.X.XXXXXX..X..XX...X.XX.XX.XXXX.XXX.X.", "X...X..X..XX.X...X....XX.XX.X.XX.X.XX...X.X.", ".....XX..XX..X.X.XX.XXXXX.....XX...XX..X.X.X", "....X..X.X.X.XX.XX.X...X..X..X.X.XXX.X....X.", ".XX...X..XX.XX.XX..X...XXXXX.X..X.XX.X.XXXX.", ".X.XX.X.XXX.X..X..XX...XXX.X.....X.XX..X.XXX", "X...X.XX.X.X.X.X..XX.XXXXX.XX...XX....XX.X.X", "...X.X..X..XX.XXXX..XXX..X...XXXXXXXX...XX..", "XX..X.....XX.XXX.XX.X.X..XX..X.X..X..X....X.", "....XXX.XXXXXXXXXX..X.XXX..X.XX.XX....XX.XX.", "......X...XXX.XXXXXXXX...X.XXXX..XXX.X.X.X.X", "..X..XX..XXX.X.X....XXX...XXXXXX..X.X......X", ".XX..X.X..X.X...X....XXX......X..X...XXXXXX.", ".XX...X.XXX.........XX.X.X..XXXXXXXX..X..X.X" };
        int startRow = 6;
        int startCol = 8;
        int[] moveRow = { 49, 16 };
        int[] moveCol = { -36, -47 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case12() {
        String[] maze = { ".X...XX..X..XXXXX.XXXXX.", "..X..XX.X.XX..X.X.XX.X..", "X..X...XXX...X..X.X.X..X", "...XXX.X.XXXXX..XXX....X", ".XXXX.X...XX..X.XX.XX...", "X..XX.X..X.X.X....X.XXXX", ".X.XX.X..XX.X.X..X..XXXX", "X..XXX.X.....XXXXXX...X.", "..XX..XXX..X....X..X....", ".XX..X..XXXX.XX.X..X..X.", "XX.X.X..X.XX.X..X.XXX...", "XX....XX.XX.XXXXXXX.XX.X", ".X.X..X...X.XXX...XX..X.", "XX.....X.XX.XXX.X..X.XX.", ".X..XX...XXXX.X..XX.....", "XX...X.XXXX.XXX..XX...X.", "XX.XX.XXX..XXXX.XX.X.X..", "XX.X.XXXX......XXXX..X..", "..X..X.X.XXX.XX.XX.X.X.X", ".XXXXXXX.....XXX.X.....X", "X.XX.XX.X.XXXX....XX....", "X.X....X.XXX.X.X.XX.X.X.", "XXX.XX.XXX.X.X....XX.X..", "XXXX..XX.X.X.X.X...X.XXX", ".X.XXXXXXX.X...XXX......", ".X..XXX.X.XX..X.......XX", "..X..X...XX.X.XX.X...X.X" };
        int startRow = 23;
        int startCol = 18;
        int[] moveRow = { 11, -13, -40, 22, 27, -33, -21, -48, 6, 32, -32, -17, -2, 7, -1, -44, -12 };
        int[] moveCol = { 22, -13, -19, -45, -2, -17, -44, -1, -17, 50, -27, -36, 30, -8, -17, 19, -22 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case13() {
        String[] maze = { "XX.XXX.X....X.XX..XXXX.X.", ".XX.XXXX.XXX...XX......XX" };
        int startRow = 1;
        int startCol = 3;
        int[] moveRow = { 36, -37, 12, 44, 34, 39, 7 };
        int[] moveCol = { 7, 10, 17, 19, 49, -34, 22 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case14() {
        String[] maze = { ".XXXX.X..X.XXX.XX.", "XX.XXX..X.X..X....", "XX...X.XX..X.XX.X.", "XX...X....XXXX.XXX", ".X.XXX...X.XXX.XXX" };
        int startRow = 0;
        int startCol = 7;
        int[] moveRow = { -8, -35, 1, -8, 7, -15, 22, -37, -20, -14, 27, -49, 41, -50, 24, 13, -20, -27, -35, -4, 19, -2, 35, -40, -4, 47, -38, 35, -20, 3, -17, 19, 17, 50, -48, -29, 12, 13, 48, 4, -10, 9, 26, 20, -20, 40, 47 };
        int[] moveCol = { 44, -22, -8, -25, 36, 32, -45, -38, 44, 36, -22, -10, 49, -2, -14, 5, 40, 18, -4, -25, 13, 36, 13, 39, -9, 20, -31, 19, 11, 49, 7, -45, -8, 6, 16, -45, -49, -8, -22, -26, -4, 1, 46, -19, -24, -4, 30 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case15() {
        String[] maze = { ".X.XXX.XX..X.........XX..X.", "X.XXX.XXXX..X.X.X.X.X..XXX.", "X...XXXX...XX.XX.X.X.X.....", ".X..XXXX..X..X....X.X.XXXX.", "X...XXX...X...X.....X.XX.X.", "XXXX.XX..XX..X.XXX.XX...XX.", "X.X.X.....XXX..XX..XX.XXX.X", "...X....XX.X.XX.X..XXXX.X.X", "X..X.......XX.XX.X..X...XX.", "XX.XX....XXX......X.XXXXX..", "....XXXX.X.XX.X.XXX.X..XXXX", "....XXX..X.XX.X.X.X...X..X." };
        int startRow = 5;
        int startCol = 21;
        int[] moveRow = { -6, -35, 33, 17, -40, 28, 24, 11, 41, 38, 10, -34, -13, -41, -31, -11, -49, -18, 17, 1, -1 };
        int[] moveCol = { -36, 31, 9, 39, -10, 23, 36, 34, 43, -1, -37, 47, -47, 50, 21, -33, 27, 39, 10, -15, 6 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case16() {
        String[] maze = { ".X.XXX.XXX...", "..X.XX..XX.X.", "XXX.XX.....XX", "X.XXXXX..XX.X", "XXX.X.XX...X.", ".X.XX.X.....X", ".XXX.XX.XXX.X", "X.XXXXX..X.XX", "..XXX..XXXXXX", "..X..X.X..XX.", "...X..X.XXX..", "XXX......XXXX", "XX.X....X.X.X", "XXXX.XX.X.X.X", ".XXXX.X.XXXXX", "X..XXXXX.XXXX", ".X.X.XX.XX.X.", ".X..X...X.X.X", "XX.X..XX....X", ".......X.X...", "XX.X....X.XX.", "X.XX...XX..X.", ".XX.X.X.X.X.X", ".X....X..X.X.", ".XX.XX.X.....", ".XX.XXXX..X.X", "XX..XX...X..X" };
        int startRow = 20;
        int startCol = 12;
        int[] moveRow = { 45, 0, -14, 39, -30, -1, 34, -14, -9, -17, 14, 27, 19, -28, 12, 43, -10, -9, -30 };
        int[] moveCol = { 31, 19, -19, -37, 18, 33, 18, 17, -13, 12, 21, 2, -45, -20, -48, -27, -50, 48, -42 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case17() {
        String[] maze = { "X.....XX.......XXXX.", ".XX..XX.X..XXX..XXXX", ".X.X...X.X..XX.XXX..", "XX.X...XXX.....X.X.X", "X..X.XXX.......X..XX", "XXXX...X.XX.X...X...", ".X.XXXX..XX..XXXXX..", "XX...X.X.XXXXXXXXXXX", ".XX.XXXXXXX.XXXX.X..", "X.XX.X.X....XXX.X.XX", ".X....XXX..X.X.....X", "XXXX.X.XXX.XX.XX....", ".XX....XX..X..XXXXXX", ".XXX....XXXXX..X...X", ".XXX.X.XX....X..X.X.", "XXX.X.X.X...X..X.X.X", ".X..XX..XXXX.XX.XXX.", "..XXXX.X.X..X.....XX", "X...X.X.XX....XX..XX", "XXX.X.X.X..X.X...XXX", ".XXX..X....X..X.XX.." };
        int startRow = 19;
        int startCol = 9;
        int[] moveRow = { 42, -20, -32, -49, 31, 9, 5, -19, 12, -31, -49, 2, 27, -27, -39, -22, -13, -24, -10, 34, -37, -31, -43, -31, -25, 44 };
        int[] moveCol = { -28, -40, 29, 41, -17, -20, -44, -39, 2, 43, 9, -22, 16, 25, 35, -10, 28, -37, 32, 35, 6, -31, -9, 44, -33, 50 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case18() {
        String[] maze = { "...XXXX.XXX......XX..", ".XX..X..X...XXX.X...X", ".XX..XX....X.XX.....X", "XXX..XXXX..........X." };
        int startRow = 0;
        int startCol = 2;
        int[] moveRow = { -37, -47, 14, 32, 15, 6 };
        int[] moveCol = { -19, 46, -39, 16, -32, -6 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case19() {
        String[] maze = { "..XXXX...XXXXXXX..XXX.X...X.X.XX.X.X..X.", ".XXX..X.X...XX.XX.X.XX....XXXXX....X.X..", ".X.XXX....XXXX.....XXX.XXX.X...X..X...X.", "..XXXXXXXX.....X..X..X..XX..XXX..X..X.X.", "X.....XXX.X.XXXX..X...X...X..XXX..X.XXX.", ".X...XX.X.XXX..X.....XX.X.X.XX.X....XX..", "XXX.X.XXXX..X.X.X.X.XX..X...X..XXX.XX..X" };
        int startRow = 5;
        int startCol = 3;
        int[] moveRow = { 4 };
        int[] moveCol = { 4 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case20() {
        String[] maze = { "XXXXX.X...XXX.XX..XX..XXX", "X.XXX...X.X.X.X.XX..X.X..", ".X.X.....X.X.XX.XX.X....X", "..X..XXXX.XXXXX.X...X....", ".XXXXX.XX...X.XX....X.X.X", ".X..XXX..XXX.XX.X...XX.XX", ".X..XX.XXXXXXXXX..X.XX...", "XX.XX.X....X..X.XXX.X...X" };
        int startRow = 1;
        int startCol = 13;
        int[] moveRow = { -3, -4, -5, 5, -1, 3, 2, 4, 2, -5, 4, -1, -4, -2, 0, -2, -4, -1, 4, -5, -4, 5, -1, -2, -2, 3, -5, -5, -5, 5, 1 };
        int[] moveCol = { 9, 0, 10, -9, -3, -5, -7, 2, 0, -1, -8, 10, -3, -2, -8, 0, 5, -2, -8, 0, -10, 7, -9, -9, -1, -5, 6, -5, -9, 8, -3 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case21() {
        String[] maze = { "X.XX.X.XX...XXX.XX.XX.XX.X", "..X..XX.XXXX....XX....X...", "XX..XX.X.XX.X...XX...X..X.", "X.X...XX.X..X..XXXXXXX.XX.", "XX.X.......XXXXX......X..X", "XX.XX.X.XX..XX..X.X..X...X", "XXX..XXXX.XXXX..X.XXX.XX.X", ".XXX.X.X..X.XX..XX.XXX...X", "XXX.X..XX..XXX....X...X..X", "X...X.X.X...XXX...X.....XX", "XX.XXXX....XX.X..X...X....", "XXXXXXX...XX....XXX.XX.XXX", ".XX.XXXX.X.X.X...XX.X..X..", "..X.X..X.XXX.....X...X....", "X..X..XXXX.X.XXX...XXX.XXX", "X.X.X..XXX..XXX.XXXXXXX.X.", "XX.XX.XXXX....XX...X..XXX.", "X.....X.....XXXX.XX....XX.", ".XXXXX.XXX.XXXX.X..XXXXX.." };
        int startRow = 13;
        int startCol = 3;
        int[] moveRow = { 0, -1, 1, 4, -4, 4, -1, 3, 5, 4, 1, 4, 3, 2, -1 };
        int[] moveCol = { 8, 9, 0, 3, -7, 2, -3, -3, 10, 10, -3, -6, -8, 6, 1 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case22() {
        String[] maze = { "...X.XX...XX.X..XX...XXXXX.X..XXX.XXXX", "XXXX...X.XXX.X...X.X..X...X.X.XXXXXX.X", "XX...XX..XX.X.XXX.X......XX..XX...X...", ".X.XX..X.X.XXXX.X.X...XX.X.....XXX.X.X" };
        int startRow = 3;
        int startCol = 27;
        int[] moveRow = { -4, 4, 0, -2, 1, 2, -1, 5, -5, -4, 4, -3, -3, 5, -5, 2, 1, -2, -4, -3, 1, 4, 4, 3, -1, 5, 0, 4, 1, 5, -3, -4, -2, -3, -5, 0, -4, 3, 2, -5, 3, -3, 4, 2, -2 };
        int[] moveCol = { 0, 8, -1, 6, 9, -10, 4, 4, -5, 2, -7, 10, 6, -2, 4, -7, -10, 5, -3, -9, 5, -4, -2, -6, 6, 10, 4, -8, 3, 8, -9, -6, -2, 9, -5, -8, 7, 6, -2, 5, -6, 7, 0, -6, -1 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case23() {
        String[] maze = { "..XXXX.X...X.", ".XXX.XXX.XX.X", "...X.XXXX.XX.", "X.X.X..X.XXXX", ".XXXXXX..XXXX", "XXXX......X.X", "X...X.XXX...X", ".X....X...XXX", "XX...X..X.XXX", "....XXX.X.X.X", "XXXXX.....X.X", ".XXX.X..XXX.X", ".X.XX.XX.....", ".XXXX..XX..XX", "..X..XXXX.X..", "..XX.X......X", "X..X.X..X..X.", "X....XX...X.X", "XXX.XXXX..XXX", "....XX...X.XX", ".X.........XX", "X.X..X....XXX", "X.XX.X...XX..", "X..X.X...XX.X", "X..XXXXXX.XX.", "XXXXXX..XXXX.", "...X..XXXXX.X", "...X.XXXXX..X", "...XX...XX...", "X.XXXXXX.XX..", "XXXX.X.XX....", "...X.....X...", ".X..XX.X..XX.", "X.XX.X..X.XX.", "XX..XXXXX.XXX", "XXX.X....X.X.", "X..X.X..X...X", "XXXX.X...X..X", "...XX.XXX..XX", "XXX..X.XX..X.", ".X.X..X....XX", ".XX.XX.X.XXX.", "X..X..X.XXXXX" };
        int startRow = 4;
        int startCol = 8;
        int[] moveRow = { 4, 2, 4, -4, 0 };
        int[] moveCol = { -9, -8, 7, -1, -5 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case24() {
        String[] maze = { "XXX.X", "X....", "X..X.", ".X...", ".X...", "..X..", "..XX.", "XXX.X", "XX...", "..XXX", "...XX", "X.XXX", "X..X.", "XXX.X", "...X.", "XXXX.", "X..XX", "..XX.", "...X.", "..XX.", "XXXXX", "XXXXX", "XX...", "....X", "..XXX", ".X.X.", ".....", ".X..X", "..X..", "....X", "X...X", ".....", "..X.X", "XX...", "...X.", "XXXXX", ".X..X", "..X.X", "..XX.", "X.X.X", ".....", "XXX.X", "X.X.X", "XXX..", "XX.XX", "XXX.X", "X...X", "X.X.X", "X...X" };
        int startRow = 17;
        int startCol = 0;
        int[] moveRow = { 4, -3, -2, -5, -4, -3, 3, -3, 4, -4, 1, -5, 0, 2, 0, 5, -5 };
        int[] moveCol = { -7, 8, -3, 10, -4, -3, -10, 6, -8, -8, -5, -7, -1, 10, 6, 3, 7 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case25() {
        String[] maze = { ".X.XXXXXXXXXXXX.XX.X", "X.XX.X.X.XX.XXX..X.X", "XXXXX...XXXXXX.X..XX", "X.XX.XX..X.XX..X.XXX", "X.XXXX..XXXX..X.XX..", "X.X..XX.....X..X...X", ".X..X.XXXXXX...XX...", ".XXX......X.XXX.XXX." };
        int startRow = 6;
        int startCol = 19;
        int[] moveRow = { -4, 1, -1, -4, -4, 0, -1, -2, 0, -1, -4, -1, -2, 0, 2, 1, 5, 1, 2, -4, -5, 4, -2, 3, -1, -5, -2, 1, 5, 3, 2, -4, 5, 1, -3, -3, 1, -5, 2, -3 };
        int[] moveCol = { 4, 4, -7, 2, 7, -3, 9, -3, 2, 9, -7, -8, -6, -8, 4, 4, 7, -10, 9, 2, -7, 2, 0, -4, 8, 9, -7, 0, -4, -10, 0, 4, -3, 8, -2, -10, -8, 5, -10, 0 };
        assertEquals(3, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case26() {
        String[] maze = { ".XX.XXX.XXXXX...XXX.XXXXX.....X..XX.X...XXXXX", "XX..X..XX...XXX.X.XX......XX.X.X.X....X......", "..XXXX..X.X....X.XX..X..X.X..X.X...X.XX...X..", "XX.X.XX..XX.X..X...XX.X.X..X...XX.X.XX.XXX..X", "..XXXXXXXXXX.X......XX.XXXXXX.X.X...XX.X.XX.X", "XXXX....XX.XXX..XX..XX...X....X.XX....XXXX.XX", "X.XX..XXX..X..........XX..X...XXX.X.XXXX.XX.X", "X.X.XX.X..X....XX...X..X..X.X.XX.XXXX.X.X...X", ".X.X.X...XX....X...X.X...X.X...X.XX.XX.XX..X.", "X.X..XX.X....XXX.......XXXX.X.....XXXXX.XXX..", ".XXX.XX.....X.X..XX...XXX.XXXXX..XX..XX.X..X.", "XX.X..XXXXX.XX..XXX.X..X.X.XX.X..XXXXX...XXXX", "XXXX.X.XX.XX.XX..X.....X..X...X.X.XX...XXXXXX", ".XX.X.XX......XXX.X..X...XXX.X...X.XX..XX....", "..XXXXX...XX.X.XX...X.XXXXXXX.X....X..XX..X.X", ".XXXXX.XX.XXXXXX.X.X.XX.X..X.XX.X..X...XXXX..", "X.XXX.XXXXXXX.XX.XXXX.X....XX.XX.XX.X.X..X...", ".XXXXX..X.XX.X.XX.X.XX.XXXXX.XXX.X..X.XX.X...", "XXX..XX..X.X.X...X......X.XX....X..X...XXX.XX", "XXX..XXXXXXX....X.X.XXX...X..X...XXX.X..XX..X", "..XXX...X...X.XXXXXX.XX..X.X...XX...XX.XXXXXX", ".X.XX.X.XX...X.XXXX....XX......XXX...X.X..XXX", "X..XX.XXX.XXXX..XXXXX.X......X.XX.XXX...X.X.X", "X...X.X..X.XXX..XXXX.XXX.XXX.X.....X.X..X.XXX", "X..XX..XXXX....X..XXX...X..X.X.X.XXXXXX...X..", "XXX.XX....XXX.XX.XX.XX.X.XXXX..XXXX......XX..", "XX.X.XX...X...XXXXX.X.XXX.XXXX...X....X.XXX.X", "..X...XXX........X.....XXXX..XXX...X...XX.X..", "X...XXXXX.X.XX...XXX.X.X....XX....X.XXX....X.", "..XXX.XX...XX....X.X.....X.X...X..XXXXX...XX.", "...XXX..XXXXX...X.X...XX.XX.X...XX..XXXX.XXX.", "XX...X...XX.X..XXXX.X..XXXXXX.XX......X..XXXX", "......XXX.X..X..XXX.X.XX...XXX..XXX.X....X...", "X.X..XXXXXX..X..X...X.XXXX.XXXX......XXXX.X.." };
        int startRow = 16;
        int startCol = 39;
        int[] moveRow = { 0, -1, 4, -5, 2, 1, -2, 1, 3, -2, 0, 1, 5, 1, 1, 5, 0, -2, -5, -1, -4, -3, 4, 4, 0, 2, 4, 2, -5, 1, -4, 2, -3, 1 };
        int[] moveCol = { 4, 0, -5, 6, -9, -8, 7, -1, 1, 0, 9, 3, 1, -5, 4, -8, 0, -10, -8, 9, -7, 7, 5, -3, -6, 8, 3, 1, 3, -6, 1, 5, 0, 6 };
        assertEquals(6, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case27() {
        String[] maze = { ".X...X.XX...X.X.XX.X.XXXX..X.", "..XX.X.XXXX.X.XXXXX.XX...XX.X", ".XXXXX..X..XX.X.......XXX.XXX", "X..X.XX...XX.X.X..X.X.X....XX", "...X..X..X.X...XXXXX.XXX.....", ".XX..XXX.X...XX.XXXX.X.....X.", "XXXX..XXXX..XXXX...X...X..X.X", ".XX.X......X....XXX.X.X....X.", "X....X....X.XX.X.XXX.XX.XX..X", "..X..XX..X...XXXX..XX.X....XX", "X.XX.X.X.X.XXXXXXX.X..XX.XX.X", "XXXX...XXXXX..XXX......XXXXX.", "X..X....XX..X...X.X....XX.X..", "X.X.XX.XXXXXX.X.X.X...XXXXX..", "..XXXX.X.X...XX...XXXXXXXXXX.", "X.XXXX....X..XXX.XXX.X.X.XXXX", "X...XX.XX.XX.X.XX.......XXXX.", ".X..XX..X..X.XX..XXXX.XX.XXX.", "..X...XX.XXX.....XXX.XXXXXX.X", ".X....XX.X....XX...X.X.X.X.XX", "XXXX.XXXX.XXXXX.X..XXXX.X...X", "X.X..XXX.X.X.XX.XXXXXX.XXXX..", "XXXX...XXXX.XX...XX.....XXX..", "XX.X.....X.XXXXX...XX.XX..X.X", ".XX.XX.XX....XXX...XX..XXXX..", ".XX....X....XX...X.XX...X.XX.", "XXXXXX..XX.X..X....XXXXX.XXXX", ".....XX.XXXXX.........XX.X...", "X.X..XXXX....XX...XX.XXXXXX..", "XXX..X.....XXXXXXXXX.XXXX..XX", ".X...XXX.XXX.X.X.XX.X.X..XX..", "XX..XX.XXXXXX...X.X.XXX.XXXX.", "XXXX.XX.X.XXX..X..X..XXX.X.XX", "X.....XXX..XXXX.....XX..XX.XX", "XX..X.X.XX.....XX.X.X..XXX.X.", "X.X.XXX.XX......XXXX..XXX..XX", "..XXX.XXXXXXX.X..XXXX.X.XX..X", ".X.XX.XXX...X.X......X.X....X", ".XXX.X.X.X.X..XXXX.X.XXXX...X", ".XX.X.XXX.X.XXXXXX.XXX.XX.XX.", "X...XXXX....XXX...X...X.X.X.X", "X.XXX..XX.XXXXXXXX...XXXX.XX.", "......XXX.XX.XX..X...X.XXXXXX", "XX.X.X..X..X.XXXX...X.XXXXX.X", "X...X.X...XX.XX.X.XX...XXXXXX", ".X....XXXX..X.X...X..X.XXXXXX", "X.X..X.XXXX.X.XXX.....X.X.X.X" };
        int startRow = 37;
        int startCol = 19;
        int[] moveRow = { 4, -4, 4, 4, 3, -2, 0, 1, 2, 5, -2, 4, -2, 5, 5, 0, 2, 5, -3, 2, 2, -4, -2, -5, 1, -3, 0, -1, -1, 0, 0, 5, 3, 3, 1, 2, 2, -5 };
        int[] moveCol = { 8, 3, 4, 7, 1, 3, 2, 10, -3, -2, -3, -2, 0, -6, 1, -5, -4, -9, 5, 10, 1, -1, -5, -9, -1, -1, -2, -6, 8, 9, -8, -6, 2, 3, -1, 0, 10, -7 };
        assertEquals(10, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case28() {
        String[] maze = { "X.XX..X.XX...X.X..X.X.X..XXX.....XX....XX.XX", "..XXXX...X..XX....XXX.XXXXXX...XX.X...XX.X.X" };
        int startRow = 0;
        int startCol = 10;
        int[] moveRow = { 1, 0, -3, -2, 5, 2, -2, 1, 1, -2, -3, 0, -1, 0, 1, -3, 5, 4, -5, 1, -3, -4, 1, 1, 0, 3, -4, -3, 5, 1, 0, -3, -3, -3 };
        int[] moveCol = { 4, -3, 1, -1, 6, 2, -6, 4, 5, 5, 7, -10, 4, -1, -2, -10, -7, -9, -2, -2, 9, 6, 7, 9, -2, -1, -7, -3, -8, -9, -4, 10, 6, -2 };
        assertEquals(8, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case29() {
        String[] maze = { "..X...XXX..XXX..XX.X....XX....X.X..XXX", "XXXXX..XXXXX....X....XXXXXX.XX..XXXXX.", "XXX..XXXX.X...XXX.XX.XXXX..XX....X..XX", ".XXX..X.XXXXXXX.X.X..XX.X.XXXX......XX", ".X....XXX..XXXXXXX.XXXX..XXXX.XX..XXX.", ".X.XXX.X.X..XX.XXXXX...X.XXX...X....X.", "X.XX.X.....X.X..X....X...XX...XX..X...", "X..X..X.X.X..X.....X..XXXXX....X...X..", "....X..X......X..XX..X...XX.X..XX.X.XX", "..X..X........XXXXX..X.X.XX...X...XXXX", ".XXX.X...XXX.XXXX.XX.XXXX.XXX..XXX...X", "XXX.XXX.....X.X.X.....X..XX.X..XXX....", "X..X.XXXX.X..XXX..X.XXX.XXXXXXXXXXXX..", "XXXX.X.XX.XX.X.X...XXXXXXX.XXXX.X.X..X", "XX.X..X.XX.X..XX..XX..XX.XX.XXXX..XXX.", "X......XX.XX..X..X.X.XX.....X.XXXXXXXX", "X...XX.X.X..X..XX..X.XXXX.XXX...X.X.XX", "..XX.....X..X..XXX...X.XXXX....XXXXXX.", "XX.XXXXX..X...XX..X..X.X.XX.X.X.XXXXX.", "X.XX..XXXXX..XXX.X.XXX.X......XX.X....", ".X..X.XXXXX.X.XX.X...X...XX..X....XX..", "...X.X..X..XX.......XX.X....XX.X.XX...", "..XXXX.XXX.XXXXX..XXX.X.X..XXX..XX.X..", "..X.X...XXXX.XXXX.......XX....X...XXXX", "X.XXX....X..X..X.X...XX.XX.X.X.XXX....", "XXX.X.X.XX...XX..XXXXXXXX..XXXX.X.X.X.", "X.X..XXX...X.X..XXXXX.X.X...XXX...X..X", "XXXX.XX...XXXXX....XXX..XX.XXX.XX.X.X.", "XXX.......X.XXX.XXXX...XXXXXX..X.XXX..", "...XXX.XXXX.XXX.X...X....XX..X.XXXXX.X", "..X.....X..X.X..XX.XX.X....X.XXXXXXXX.", "XX.X..X.X...X.XX..X...X.XX.XX.X...X.XX", "..X.XXXXXXX...XXXXX.XXX..X..XXXX...X.X", "XX...X.X.X.X.X.X.X........XXXX..X.X...", ".X..XXX..XX.X.XX.X.X.X.XX.X..XXX.X.XXX", "XXXX.XX.XXXXX...XX.....XXX....XX..XXXX", ".X.X...XX..X.X.X.X...XX..XXX.......X..", "X..X.XXX.XX.......XXX.XXX...X...X....X" };
        int startRow = 36;
        int startCol = 28;
        int[] moveRow = { -2, -2, 4, -5, -4, 0, -5, -2, -3, 4, -5, 1, 5, -2, -5, -5, 4, -5, 4, 4, -3, -5, -5, 3 };
        int[] moveCol = { 1, -3, -9, -1, 6, -10, 6, 0, 2, 2, -10, 6, 0, -4, 3, 6, -1, -8, -2, 6, 2, -6, 0, -7 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case30() {
        String[] maze = { "..X.", ".XX.", "...X", ".X..", "...X", "X...", "X.XX", "....", "X.XX", "X..X", "X...", "X.X.", "XXXX", "X...", "X.X.", "XX.X", ".XXX", "XX..", "X.XX", "...X", "...X", ".XXX", ".XXX", "..X.", "XX.X", ".XX.", "X.XX", ".X..", "..X.", "....", "X..X", "XX..", "X.XX", ".XXX", ".XX." };
        int startRow = 17;
        int startCol = 2;
        int[] moveRow = { 3, -5, 2, -4, 5, 2, -2, 4, -3, 4, -2, 1 };
        int[] moveCol = { -10, 2, 10, -6, -7, 6, 8, -5, 5, -6, -8, -5 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case31() {
        String[] maze = { "XXXX.X.XXXX...XXXX..XX.....XXXX...XX..X.XXXXXXXX", "XXXXXXXX.XX...XXX..X.XX...X..XX.XX...X..X.X.X..X", "X.X..X.X..X..XX.XX...XX...X.XX..XX.....X..X...XX", "X.X.X.XX.XXX..XX.X..XX..XX..X..X..X.XX....XXX..X", ".X...X..X.....XXX.X......X.XXX..X....X...XX.XXX.", "..XX.X...X...X..XX..XXXX.X.XXXXXX..X.X.XX.XXX..X", "X..XXXX.X..X.XX.XX.XXXXX..XX.X...X..XX.XXX...X.X", "XX.X..XXXX.XXX.XX.X.XX..XXXXX.XX...XX.X......XX.", "XXX.XX.X.XX.X....XXX..XXX.XXXX..X......X.X.X..X.", "XXXX.X.XXXX....X..XXX.X.....XXXX.X.X..XX...XX...", "XX..XX.XX.XX.XXXXXXX.XX..X.X.X.XXX.XXXXX.XX..X..", "X.X.X..XX...X.X.XXX.X...XX....X.X..X...X...XXX.X", "X.X.XX..XXX.X.XX..XX....XXXX.X..XX..XXX.X.X.X...", "XX.....XX..X.XX...XXXX..X....XX.XX..XXX...XXXX.X", "XX.X...XXX...XXXXXX.....X.X..X....X.X...XX.XX.X.", "..XXX..X..XXX.XX..XXXXX...X...X.XX..X.XX.X.XXXX.", "XX.X.X..XXX..X.XX.XXX...XXXXX.X...X.X.X.XX.X..X.", ".XX.XX..X.XXX.XX...X.XX....X..XX.XXX.XXX.X.X.X.X", "..X...XX....X..X....XXXX...X..XX.X.X.X...XXXX.XX", "X....X...XXX.XX.XX.....XXXX..X.XX...XX...X.X....", ".XX....X..XXXXXX.X..XX..XX.X.X.XXXX..XXX.X.X..XX", "X.....XXXX..X...X..X..X.X....XXXXXXXX.X.X...X.XX", "XXXX.XX.X.XXXX..X.X.X.XXX.......XXXXX..X..XX....", ".XXX..X.XX.X..X....XXX.X.X.X.XXX..XXX.XXX.X.XX..", "XX..X..XXXXX..XX...X.X.....X.X.XX.XX.....XXX.XXX", "...X..XXXX...XXXX...X...X..X...X...X.....XX..XXX", "X.X.XXXX...XXX....XXX..XX.X...X..X.XXX..X..X....", "X..XX.....X..XXX..X.X.X...XXXXXX...XX..XX.XX..XX", ".X...X....X.X...XX......XXX............X..X...X.", "X.X..XX..XXXX.XX..X......X.XX..X.X..XXX.XXXXXX.." };
        int startRow = 28;
        int startCol = 14;
        int[] moveRow = { 0, 0, 4, 5, -1, 5, -3, -2, 3, 4, -5, 4, -2, 5, -5, -4, 0, 3, -4, -2, -1, -2, 2, 1, 4, -1, -2, 5, -3, 3 };
        int[] moveCol = { -7, 8, 8, -10, 0, 2, -9, -6, -7, 1, -2, 6, -2, -1, -2, -8, 6, 9, -9, 6, 0, 4, -2, -5, -9, -6, 4, -10, -9, -4 };
        assertEquals(11, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case32() {
        String[] maze = { "X.XX.....XXX.X...XXX..XX..XXXXXX.XX.XXXX....X.", "..XXX.XX.XX.X...X.X.X..X..XXX.XX.XX.X...X.....", ".X..X.X.X......XXX.XX.X..XX............X.XXXXX", "XXX.X...XXX.X....XXXXX...X...X...XX.XXXX..XXX.", ".X.X..X.X.XX.X.X.XXXXXX..X..XXXX.X.X....X..XXX", "X.X...XX...X.XX...XX.XX..X...X..X.X.X.XXXXX.X.", ".X.XX.XX..XX.XX.XXXXX.X.X.X.X.XX.XXXX.XXXXX...", "XX.X..X..X....XXXXX...X..X....X.X..X...X.XXX.X", "....XXX...X.X....XXXX.X..XXX..XX...XXX..XXX..X", "X.XX.XX..X.X.XX..X..XXX..XXXX.XX.X...XXX.X...X", "..X...X....X.X....X...XX..XX...X.XXXXX...X.X.X", "X.X.XX.......X.X..X.XXXXX.X..XX.XXX.X.XX...XXX" };
        int startRow = 8;
        int startCol = 28;
        int[] moveRow = { 1, 0, 4, 3, 4, -3, 2, 0, 4, 4, -1, 0, 4, 3, 5, 0, 4, -2, 0, -4, -5, -4, 2, -2, 2, 2, -1, 2, -5, 1, 4, 2, 0, 1, 4, -5, -5, -3, 2, -2, 3 };
        int[] moveCol = { -3, 7, -3, 5, 7, -5, -9, -4, -4, -1, -2, -6, 5, -4, 7, 7, 8, 6, -5, 4, 4, 5, -7, 2, -5, -9, 9, 6, -6, -4, -7, -3, 5, -6, -5, 1, 5, -5, -10, 0, -10 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case33() {
        String[] maze = { "....XXXXXXXXX.XXX.XX.X.XX.X.", "XXXXXXX..XX.X.X.....X.....XX", "....XXXXX..XXX.XXXX..XXX.X.X", ".X.XX.XX....XXX..XX...XXXXX.", ".....XXXX..XXX..XXXXXXX.XX.X", ".X...X..XXXX.XXX..X.....X.XX", "..XXX.XXXX.X.....X.XXXX.X.XX", "X..XXX.X...X..X.X..XXXX..XX.", ".X.....XXX.X...X.....X..X.X.", "XX.XX.XX.X.X.X.X.X..X.X.X..X", ".XX..X.XXX......X..X..XXX.XX", "XX.X.X.XX...XX..XX....X.X.XX", ".X...XX...X.X.....X.XXXX...X", "X..XX......X.XXXX......XXXX.", "XXXX...X...XXXX..X...XX.X...", "XXX.XX.XX.X.XXXX..XXX...X.X.", "X.X.X.....XXX...X..X.X.....X", ".XX...X..XX.XX.X..XXXX.XXXX.", "X.X.X...XX.X.X.XX..X...XX...", "XXX.X..XXX..X..X.XX...X...XX", "X.XXX..XXX.X....X...X.XX..X.", ".XX....X.XXXXX..XXX.X..XX...", "X..X.X...XX.XX.X.XX.XX...XXX", ".XX..X..X..XXX.XX.XXX.XX.XXX" };
        int startRow = 20;
        int startCol = 1;
        int[] moveRow = { -2, -1, -5, 2, -1, -3, -2, -1, -4, 3, 1, -2, 5, 1, -4, 2, 1 };
        int[] moveCol = { 2, -10, 3, 10, -7, 6, 2, 4, 6, -7, -2, -1, 6, -1, 4, -9, 1 };
        assertEquals(7, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case34() {
        String[] maze = { "X.XX...X.XXX.XXXXX...XXXX..XXXXXXXX.", ".....X.XXX.XXXX.XX...X.X...X.X.X..X.", "XXX..XXX.X.XX.XXX..XX.X...X...XXXX..", ".....XXX...X.XX....X...X.X.X...XXXX.", ".XXX..XXXX...X..X..X.X.XXX.XX.X.....", "X.X.X.XX.X.X..XX..X...XXXX.X.XX..XXX", "...XX.X.X...XX..........XX.XXX..XXXX", "XXXXXXX...X..X..XXX..XXX.X.X..X.XXX.", "X.XX..X..X.XXX...XX..XX.X.XXXXX....X", "X.XXX....X.XX....X...X..XX....X.X.XX", ".XXXXXXXXX..X.....X....XX.XXXX.XX..." };
        int startRow = 10;
        int startCol = 16;
        int[] moveRow = { 4, 2, -3, 5, 3, 0, -3, -3, 5, -5, -3, -2, -3, 5, 2, -3, 2, -5, 1, 3, 2, 2, 1, -5, -2, 5, 3, 2, -5, -3, -1, 2, 5, -2, -3, -4, 3, -3, -1, 0, -3, -5, 4 };
        int[] moveCol = { 10, 1, 5, -10, -8, 5, 3, 7, 8, 7, -10, 8, 10, -10, -8, 7, 7, 5, 8, 6, -5, 10, 8, -5, 2, -3, 10, -2, 1, -2, 6, 1, 2, -1, 3, 10, -5, 2, 2, -8, -8, 5, 3 };
        assertEquals(4, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case35() {
        String[] maze = { "X.X..XXX..XXXX....X.X..", ".XX..XX...XX.X.X..X.X..", ".X......X.XXX..X.XX.X..", "...XX.X.X.....XX.X....X", "..X.X.X.....X.X.X.X.XX.", "XX.....X.XX..X.X.X.XXXX", "XX.X.X..X......X..XXX..", "XXX.X...X..XXX.XXXXX.X.", ".XXX.XX.....X..X..X.X..", "XXX...X.XXXXX.XX.X.XXX.", "..XXXXXX..X..X.X.XX.XX.", "XXX...XXX.X..X.XX.X...X", ".X.......X..X.X....X..X", "X..X.X..X.XX..X..X.X.XX", "X...X.X..X...XX....X..X", ".X..X.X.X.....XXXXX...X", "..XXXXX.X.X..X.X.X...X.", "...X..X..XXXXXXXX..XX.X", "XX..XX..X.X...X.X.XXXXX", ".XXXXXX.X.XX.XXX....X.X", ".XXXX.XX....XX...XX.XXX", ".XX...X.XX...XXX.X....X", "X..X.XXXX....X..X..X...", "...X......XXX.X...XXXXX", "XXXX...XXX..X..XXX...X.", "...X.X.X.XX.XXX.X...X..", "XX.XX.X...XXX.....X..X.", ".XX..X.X.X..XXXXX.XXXXX", "..X.XX.XX.XXX..XXX.XX.X", ".X..X...X.....X...XXX..", "X....X.XX..X...X.XXXXXX", ".XX.XX.XXX.......X.XXXX", "XXXX.X.XXX..X.XXXXX.X.X", ".X.X.X....X.X.XXX..XX.X", "XXXXX..X..X.X.XXX.X..X.", ".XXXX.X..X.X..X.XXX...X", "...XX..X.X..XXX.XX..XXX", ".XX.XXXX..XX.X.X.XX.XX.", ".XXXXX..XXX.X.......XX.", ".X..X.X..X...X....X...X", "X.XXX.XX..X..XX..XXXXX.", "XX.X..XX..X.XXX.X...X..", "X.X.X.XX..XX..XXX..XXX.", "X..X..X...XXX.XX.XX....", ".X..X.XX.XXXX.XXXXX...X", "X....XX.X..XX.XXXX..X..", "..XX....XXXX.X.XX.XX..X", "..X..XX.XXX..XX...XX..X", "XX..XX.X..X..X.X.X.X..X" };
        int startRow = 14;
        int startCol = 17;
        int[] moveRow = { -4, -4, 1, 2, -2, 3, -3, -2, -4, 3, -4, 0, 2, -3, 0, 1, 4, 0, 3, -2, 0, -2, 2, 3, -3, 4, 0, -5, -2, 5, -4, 4, -1, 5, 2, -5, -5, -5, -1, 5, -2, 5, -2, 1, 3, -5, -2, -5, 1 };
        int[] moveCol = { 8, -4, 9, -2, 0, 6, 8, 1, -5, 9, 10, 3, -4, 0, 5, -1, 6, 5, -3, 1, -4, 8, -4, 2, 2, 3, -4, -1, -8, 7, -1, -1, -9, 3, -6, 2, 8, -1, 4, 2, 2, -10, 7, -9, 6, -2, 2, -5, 7 };
        assertEquals(8, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case36() {
        String[] maze = { "X...X.XXX..X.X.X.X..XXXXXXXXXX.", ".X....X.X...X..XX....X...X.XX..", "..X..XXX.X.X......XXX........X.", "..XXXX..X...XX..XX.XX..XX..X...", "XX.X.X..X...X.....XXXX...X.XXXX", ".X...X..XXXXXXXXXXX.X..X.X....." };
        int startRow = 5;
        int startCol = 26;
        int[] moveRow = { 0, -4, -4, 4, 1, -2, -2, 3, 2, -4, 0, 3, 1, -3, 2, -3, 5, -2, 2, 5, -3 };
        int[] moveCol = { -5, -5, -10, -8, 6, -3, -9, -8, 4, -3, 4, -4, -2, -9, 8, -5, 6, -10, -9, -6, 4 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case37() {
        String[] maze = { ".XXX...", "X...X..", "XXXX..X", "XXX.XX.", "X.X..X.", "..XX.X.", ".X.X.X.", "..X.XX.", ".X.....", ".XX..XX", "X....X.", "..XXXX.", "X.X..XX", "...X.X." };
        int startRow = 1;
        int startCol = 3;
        int[] moveRow = { -1, 4, -3, -4, -5, 2, -2, -2, -5, 5, 0, -4, 2, 4, 3, -4, 5, -1, 4, -3, -1, 5, 2, 2, -1, 5, 5, 0, 4, -5, 0, -4, -1, -1, 5, 2, 2, -1, 4, 1, -1, -1, 2, -2, -4, -3, 2 };
        int[] moveCol = { 1, -4, 9, -4, -9, -3, -4, 1, 1, -7, -7, -4, -6, 0, 8, -2, -8, -5, -9, 4, -4, -1, -8, 7, 3, -8, 10, 5, 7, 8, -8, 3, -3, -3, 7, 1, 10, 6, -6, -7, -8, 6, -2, 3, 2, 2, 9 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case38() {
        String[] maze = { ".XX..", "XXX..", "..XXX", "X..XX", "....X", ".X...", "....X", "X.XXX", "X.X.X", ".X.XX", "....X", ".X...", "..X.X", "X...X", "X..XX", "X....", "....X", ".X.X.", "..X..", "..XX.", ".X.XX", "XX.XX", "X.X..", "XXXXX", "..XXX", "X.X.X", "XXX..", "X.X.X", "..XXX" };
        int startRow = 20;
        int startCol = 2;
        int[] moveRow = { -3, 0, 1, 3, -2, -2, 2, 4, 1, 2, -2, 3, 0 };
        int[] moveCol = { -6, -7, -3, -10, 9, -1, -10, 6, 2, 5, -1, 7, -6 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case39() {
        String[] maze = { "X.X...XXXXX.", ".XXXX..XXXX.", "..XX.XX...XX", ".X.X...XX...", "........XX..", "..XXXX.XX.X.", "X.XX..X..XX.", "X..XX.X...XX", "..XX..XXXX.X", ".XXXXXXXXXXX", ".X.XXX.X.X..", "X..XX..XX...", "X.XX.X.XXXX.", "..X.XX.....X", "X.X.XXXX..X.", "..XXX....X..", ".XX...X..XX.", ".X.X.X.....X", "..........X.", "X.X.XX......", "...XXX.XX.XX", "X..X..XX.X.X", ".XX..XXXXXXX", "X.X.........", "X..X...XXX..", ".XX....XX..X", "....X.XXXX.X", ".XXXX..XXXX.", ".........X..", ".....X....XX", "......X.X.X.", "...X.X.X.XXX", "X.XX.XXX.XX.", ".X..X.X..X.X", "XXXX....X.X.", "X.X..XX.XXX.", "XXX.XX..X.XX", "XXX..X..X.X.", "..XXXX..X..X" };
        int startRow = 24;
        int startCol = 10;
        int[] moveRow = { 4, -1, 3, 0, 5, -2, 5, 0, -2, 1, 4, -1, 2, -3, 0, 0, 3, 2 };
        int[] moveCol = { -9, 6, -6, -5, -8, -7, 0, 7, -4, -4, 1, -5, 4, -4, -1, -3, -4, -9 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case40() {
        String[] maze = { "X.X...X..X.XX...X.X.X.X.X..X...X", ".X.XXX.......XXX.X....XX.XXXX.XX", "XXX..X.XXXX...X.X.....XXX..XXXX.", "..X...X..X...XXX.XX.XX...XXX....", "X.XX..XX.X.XX...XX.X..XXXXXXXXXX", "X..XX..XX..X.XXX....XX.XXXXXX.XX", ".X.X......XX.X..XX.X.X..XXXX..X.", "XXXX.X.X.XXXX..XXX..X..X.XX..X..", ".XXX.X.XX.XX..XXXXXXX...XX....X.", "XX..X....X.XX..XXX.XXXX.....XXX.", "X.X.XX...XX.X..X.X...X..X..XXXX.", ".XX.XX.XXX.XX.X.XX.X.XXXXXX..XXX", "X.XXX..XXX.XX.XXXX.X.XX.X.XX..XX", "XXXXX.XXXX...XX.XXXX..XXX..X....", "X.X...X..X.XXXX.....X....XXX...X", "XX.XXX.XX...XX....X......X......", "X.XXX.X..XXXX.XX.XXXX.X..X.XX.XX", "..X..XX.XX.XX...X...X..XX.XXXXX.", ".XX.XXXX.X.X..XX..X.X..XX...X.X.", "..X.XXX......XXXXX...X.XXX.XX.XX", ".X.XX...XXX.XXXXX.X...X.X....X..", "XX..XX..X.X...X.X...XX..XX.X.XXX", "X..X..XX...XX.XX..X..XXX.X.X.XXX", "XXXX.X.X.XX.X.X.X.XXXXXX.X.XX..X", "XX.XX.X...XXXXX..X..XX.X..XX.X.X", "..XXX.X.X.....X.X..XXXX.......X.", ".X.XXXX..XXXXX.XXX..X.XXX...XXXX", ".XXXX.X.X.XXX.X..X.X.X.X.XXX..XX", "X.X.XXXX.XX...X..X......X.XX....", ".....X..X.X.X.XXXX.XX.X.XXX..X..", "X.XX.X.XXX.X.XX.X..X.XX.X...X..X", ".XXXXXX.XX.XXXX..X..XX..X.X.XXXX", "X.X.XX..XXX..X..X..XXX.XXX..XXXX", "..XX.X.X.X.X...XX.XX.X..X.XX..X.", "XX.X.X.X...XXXX..XXXXXXX.....X.X", "XXXXX.XX.X.X.X...........X.X.X.X", "XX.X....X.XXX.XXXXXX...X.XXXX..X", "XX.X...XX...X....XXX.XX.XXX.XX..", "XXXXXXXX.XXXXX.X.XX..X...X..XX.X", "XX..X.XX.XXXXX.X..XX.....X..X...", "XXXXXX.X..X..XXX..X....XXXX..X.X", "..XXXX..X.XX..X..XXXXX..X.XX....", "XXX.XXXX.....XXX.....X.X.XXX.XXX", ".......XX.XXXXX.X...XX.X..X..X.X" };
        int startRow = 38;
        int startCol = 26;
        int[] moveRow = { 5, 5, -4, -5, 0 };
        int[] moveCol = { -1, -10, 9, 0, -3 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case41() {
        String[] maze = { "X.X..XX.X.X..X.XXXX.X", ".X....X.XXX.X.....XX.", "X.X......X...XX.X.X..", ".XXXX.X.XX.XXXX..XX.X", "XX..XX.....XX......XX", ".X.XX...X..XXXX...XX.", ".X.X.XXX.X....X.XXX.X", ".X...X.......XX....XX", ".XX..X..XXX....XXX.X.", "..X....XXXXX.X..XXXXX", "..X.XXX....X..XXX...X", "..XX.X..X.X..X....XX.", "..X..X..XXX...X.XX...", "X..X.X....X.X..XXX...", "....XX.X.XXXX..XX.X.X", "X...X.X.XXX..X.X....X", "...X....XXX..XX..XXX.", ".XX..XX.X.XXX.XX.XXXX", "...XXX..XX..........X", "XXX...X..X.X...X....X", ".X.XX.XXX.XX.X..X.XX.", ".XX..XX..XXXX..X..X..", "X...X..XX.X.XX....XX.", "X.X..X.X..X.XX..XXXX.", "X..X....X.X.X.XX.....", "XX....XX.X..XX...XXXX", "XXXX..X..XX..XX....X.", "XXXX.XXXXX..XX...XXXX", "X.X...XXXXXXXXX.X.X..", "XX.XX.XX..XX.XX...X..", "XXXX.....XX.XXX..XXXX", "XX.XXXX.X..XXXXXX.XX.", ".X.XX.X.X.XX.X...XXXX", "....XXX.X.XXXXXX..X..", ".X............X.X.X..", "XXX.....X.XXXX..X..X.", ".X..XX...XX.X.X.X.X.X", "..XX....XXX..........", "....XX..X...X..X...X.", ".XXXX.X.XX...XXXXX..X", "XX.X.X.XXXXX...X..X..", ".X...X..X..X...X...X.", "X.X.X...XXXX.XX....XX", "..X.XX.XXX..XXXX..X..", "XXX.XX.XX.XX.X.XX...X", "XXX.X.X.X..XXX.XX.X.." };
        int startRow = 22;
        int startCol = 15;
        int[] moveRow = { 5, -3, -1, 1, 1, 5, 0, -5, 4, -1, -2, 0, 2, 0, -5, -3, -1, 3, 3, -2, 1, 2, -5, -4, -1, 4, -1, 4, 5, -5, -3 };
        int[] moveCol = { 10, 9, -9, 5, -1, -10, -5, -1, -4, -6, -6, 0, 10, 0, 3, 4, -6, 4, 6, -1, -2, -9, 0, 9, -6, -4, -6, 8, 2, 0, 6 };
        assertEquals(7, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case42() {
        String[] maze = { ".X.X....XX", ".XXX...XX.", "...XXX....", "X.XXX.XX..", "XXX..X....", "..X.XXXX..", ".X.X..X.X.", "XX.X....X.", ".XXXX.XXXX", "..XXXXX.XX" };
        int startRow = 6;
        int startCol = 2;
        int[] moveRow = { 0 };
        int[] moveCol = { 2 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case43() {
        String[] maze = { ".X...XX.X..X", "..XX.......X", "..X..XXXX...", "X..XX.X.....", "XXX.XXX.....", "XX...X.X.XXX", "..XXX..XXX..", "X.XXX.XXXX.X", ".XXXX..X..XX", "..XXXXXXX.X.", "XX.XXX.XXXXX", "...X.X...XX.", "X.XX.XXXXXX.", ".XX.XXXXXXX.", "X.X...X...XX", "..XX.XXX...X", "X.....X.XX..", "XXX.X.X..XXX", ".X.X.X..XXXX", "..X...XX...X" };
        int startRow = 15;
        int startCol = 8;
        int[] moveRow = { 3, 0, -4, 0, -5, -3, 1, -4, -3, 0, 5, 2, -5, 1, 0, -4, -3, -4, 3, 0, -1, 2, 4, 0, -5, 2, -2, 1, -1, 1, 1, 4, -2, -5, -1, -2 };
        int[] moveCol = { 7, 6, 2, 6, -7, -6, 4, 4, 2, 4, 3, -5, 6, 8, -1, -7, -2, 7, -9, 8, -4, 9, -4, -10, 0, -10, 6, 9, -5, -4, -10, 9, 5, 6, -7, -9 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case44() {
        String[] maze = { "X..X.XXX.", "..X.X.X..", ".X.X.X.XX", ".X....X.X", "XX...X...", "......X.X", ".XXX.XX.X", ".XXXXX..X", "..XXXX.XX", "X..X.XXXX", "X.XX.X..X", ".XX.XX.X.", ".X.X.X...", "XXXX.X.X.", "....XXXX.", ".X.X.XXXX", "..XX..X.X", "XX.X..XXX", ".XX..X...", "..X..X..X", ".XXX.X.X.", "XX.XXXXXX" };
        int startRow = 13;
        int startCol = 8;
        int[] moveRow = { 1, 5, -4, 4, 4, 0, 0, 1, -1 };
        int[] moveCol = { 3, -7, 9, -6, -5, -3, -1, -5, 5 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case45() {
        String[] maze = { "....X...X.X.XX.XX...XXX..XXX.XX...XXX.X", "X.XXX....X.XX..X...X...XX......X.X.X.X.", "XXXXX.X.X.XX..X.XX.X......X.X.XXX......", "XX.XXX..XXX..X..X..XX.XX.X..........XXX", "..X....X.X.XXXXX.X..XX.X.XXXX..X....X.X", "X..X.XXX..XX.X.X.X.XXX.X..XX....X.XX..X", "X.XXX.X.X.XX..XXXX......X.X..X...X....X", "X..XXX.X..X..X..X.XXXX.X.X..XXX..X..X..", "XXXXXX.XXXX.XX........XX.X.XXXX.XX.XX..", "XXXX..X.XXX....XX.X.XX........XX..XXXXX", "..X....XXX.XXXX..XXXX...XXXX..X.XXXXXX.", ".....X.X....XX.XX....X.XXXX..XXX.X.X...", "..XX....XX.XXX.X..XX.XX.....XXX......XX", "XXXXXX.X...XXXX...XX.X.X.X...XXX..XXX..", "X..XXXX.XX.XX.XXX.X.X..XXXXX...X.XX..XX", ".X...X..X....X.X.XX.....XXX.XX..XXX.X.X", "XXXXXXXXX.XXX.XXX..XXXXX.XXXX.XX.XX.X..", "X..X...X...XX.XXXXXXX..X.XXXXX.XX.XXX..", "X....XXX.XX..X..X.XX.XX.XXX.X..XX.....X", ".X..X....XXXXX.XXX.XXX..X...XX.XX.XXX..", "XXX..X.XXX...X.XX.X.X..X..XXXX....XX.XX", "...XXXX..X.XXXX.X...XX....XXXX.X.XXXXXX", ".XXX...XXX...X.XXX.X.XXX.XXX.XX.X..XX..", "X.XXX.XXX..X....X..X..X...X..X.X.X....X", "X.XX.XX...X...XX.XX.X.X..X.XXXX.XXX..XX", "X.X.X...XXX...XX..X..X.X.X..XXXXXX.XXXX", "X.X...XX.XXX.X...XXX.X.XX..X..X......X.", ".XXX...XX..X.X.X.XX..XXXXX..X.XXX...X.." };
        int startRow = 14;
        int startCol = 13;
        int[] moveRow = { 5, 0 };
        int[] moveCol = { -2, -9 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case46() {
        String[] maze = { "X.XX......X.XX.XX...XXX..X.X.X..XXXXX.XX...X.XX.", "..X.X..X.X....X...XX.....XXXX..X.XXXX.X..XX.X...", ".XXX....XX.XXXX..XXX.XX...X.X.X..XXXX.X..XX.....", "....X.X....XXXXX...X....XX.XXX..X.X......XXX..XX", "X..X.X..XX.X.XXX.XXXXX...XX.X.X..XX.XXXXX....X.X", ".....XXX.XX.XX..X..X...XX..XX...XX.XXX.X...X.X..", "..XX.X...XXXX..XX.XX.XXXX....X...X.X.X.X.X.X..XX", "XXX.X..XX.XX.XXX....X.X.X..XX.XX.X.XXX.....XX...", "X.X...X.XXX...X.X.XX.X.XX...XX.X..XX.XXX..XXXXXX", "..X.X.....XX..X.X..X.XX....XXX....X.X..XX...X.XX", "XXXX.XX.X..XX..XX...X.X..XXX.X..X...XX....XXX.XX", ".XXX.....X.X..X.XXXXXX.X..X...X.X.XX..X.X...XX..", "XX...X..X...XX..X.X..XX.XX..XX.XXX.XXXX..X..X.XX", ".XXXX..XX...X...XX.X.XXXX.X...X.......XX.......X", "X...XXX.XX...XX.X..XX.X..X...X..XXXXXX.X.XX.X..X", "..XX..XXXXXX..X..X..XXXXX.X.XXX.XX.X..XXX.......", "X...XXX.X.X...XXXX...XXX...X..XX...X.X.XX..X.XXX", "X.XXX....X.XX.X..XX.X..XXX..X.X....X...X..X.XXX.", ".XX...XXX.XXX.XXX...XXXXX.X.X..X.XXXXXX.X.X.X.X.", "X..X...XX.XX.XX....XXX.....X.XXXXX.X.XX.X..XX.X.", "..XXX..XX.XXX..X..XX..X....X...XXX......X.XX.X..", "XXXXXX.X...X........XXX.X.X.XX...X..XXX.X..XX.XX", ".X...X.X.XXX...X.XX.X.....X...X..XXX.XX..X.X..X.", "XXXX..XXXXXXX...X.XX..X...X.X.XXX...XXX....X..XX", "XXX.X..XX..XXXXXX..XX.XXX..XXX.XXXXX....X.X.X..X", ".X....XX.....X...XXXXXXX..XX.XXXXXX.XX.X.X....X.", ".XXX..X....XXX.XXX....X....X.XXXX.X..X.X.X....X.", "XX.XXXXXXXXX....X...X.XXX.X.XX..XXX..X..XX..X.XX", "X....XXXXX.XXX......X....X....XX.X.X.XXXXX.XX..X", "X.X..XXX..X...X.X..XX.....X..XXX..XX..X.XXX.X.X." };
        int startRow = 13;
        int startCol = 44;
        int[] moveRow = { 4, 1, 1, 2, 5, -4, -2, 4, -3, 5, -3, -5, 3, -2, -1, 0, 3, -3, 4, -4, -1, 2, 3, -1, 4, -2, -4, -5, 1, -4, -5, 4, -2, 5 };
        int[] moveCol = { -1, 8, 8, 9, 8, -4, -5, -1, -7, 1, 10, -6, -1, 2, -1, 0, 7, 6, -7, -8, 2, 10, -6, -6, 9, 5, 7, 4, -7, 4, 8, 4, 0, 1 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case47() {
        String[] maze = { "X..XX..XXX..X.XXXX.", "X.XX.XX.X.X..X.XXX.", "X.XXXXX..XXXX..XX.X", ".XX.XX...X..XX.XX.X", "XX.X..XX.XX.X.X.XX.", ".X..XX..XXX..X.....", "X....X..XXXXX..XX..", "XXX.XX.XXX..XX..XXX" };
        int startRow = 4;
        int startCol = 15;
        int[] moveRow = { 2, -5, 2, 5, 5, -3, -4, 4, -3, 5, -5, 0, -4, 2, -3, -5, -5, -4, -2, -3, 4, 0, -5, -1, 2, 3, -5, -3, -3, 1, -1, 1, 4, 4 };
        int[] moveCol = { 10, 5, 7, 9, 0, -10, 0, -8, 0, 2, -10, -7, -10, 3, 1, 5, -3, -1, 3, -3, -7, -9, 5, -3, -9, 10, 3, -2, -8, 7, 1, 9, -6, -8 };
        assertEquals(4, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case48() {
        String[] maze = { "XX.X..XX.X.XXXX....X.X.X.XXXXX..XX", "X.X..X....X......XXXXXX.XXX..X....", "XX..XX.XXX......X.XXX.XX.XXXXX..X.", "..XX.X.....XX..X.X..X....X.X.XX..X", "..XXX.X.XX.X..X.X.XX..X...XX.X.XXX", ".XX.XXXXXX.....X...X.XXX.XX.XX.XX.", "XX.X..X....XXXX....XX..XX...XX....", ".XXXXXX...X.XXX.X..X.....XX....X.X", "X..X.XXXX.X..XX..........X.XX...X.", "X..X.XX....X......X.XXXXX.X.XX..XX", "..XX.X.X.X..X.X..XX.X..X.XXXX.....", "X...X.X...X.X...XX..XX.X...X.XX.X.", ".X.XXXX..X...XXXXXXX..XX..X..XXXX.", "...X..XX.XX..X...X.X..X.X.X..X.XX.", ".XX.X..X.XXX.X..XXXX..XXX......XXX", "XX.XXXXX.XXXXXX.XXX..X.X.X..X.XXX.", ".XX....XX.XXX...XXXX.XXXXX....X..X", ".XXX.X.X...XXX...XXX.XX..XX..XXXXX", "...X.X.XX.XX.X.XX.XX.X.X...X.X.XX.", ".X......XXXXXXXXX...XXX..X.XX...X.", "X.X...XX.XX..XXX...X.XXX.X.XX....X", ".XX.XX..X.X.XX..XX..XX.XX..XX.XXXX", "XX.X...XX.XXXXXXXX...X.XXXX..X.X..", "X..XXX..X.XX.X.X..XXX..X.XXX.XX.X.", "X..X.XX.XX.X...XXXX.X.XX..X..XXXX.", ".....X...XXXX...X...X.XX..X.X.X...", "X....XX.XXXX..X.XX..X.X.XX.XXXX..X", "...XX...XX.XXXXX..X..XXXX..XX.X.XX", "X.XX.XX..XXXXXX.XXX.XX.XX....XXX.X", "XX..X..XXX.XX..X.XXX...XXXXX.XXX..", "..X...XX....XXX.....X..XX...XX....", "..X.XXXX..X..XX...X.XXX..XXX..X.XX" };
        int startRow = 23;
        int startCol = 6;
        int[] moveRow = { 3, -1, -4, -1, -2, 4, 2, 0, -1, -3, 0, -2, 3, 3, 4, -3, 3, 3, 2, -4, 4, 1, 0, -4, 2, 3, 4, 4, -5 };
        int[] moveCol = { -6, -4, 0, 8, -1, 9, 3, -4, 2, 8, -8, -6, -9, -7, -10, 3, 4, -8, -8, 3, -10, 10, -2, -7, 9, -3, 6, 0, 10 };
        assertEquals(7, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case49() {
        String[] maze = { "..XX..XX....XX....X.X.X..X..X..XX." };
        int startRow = 0;
        int startCol = 11;
        int[] moveRow = { 0, 0, 0, 0 };
        int[] moveCol = { 6, -10, 22, 7 };
        assertEquals(6, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case50() {
        String[] maze = { ".XXXXXXXXXXXX....X.XXXXXXXXXXXXXXXXXXXXXXXXX", "..XXXXXXXXX.XXX.XXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X.X.XXXXXXX..XXXX.XXXXXXXXXXXXXXXXXXXXXXXXXX", "XX...X..XXXXXX.XXX..X..XXXXXXXXXX.XX.XX.X.XX", "..XX..X.XXXX.X.XX...X.X.X....XXXXXXX.X.X...X", ".X...XXXXX..XXX..X.X..X.X...X..XX.XXXX.XXXXX", "X.XX.X..X.X.X.X...X.XXX.XXXXXX.XXXX.XXXX...X", "X.XXXX.XXXX....XXX.....XXX....X.XXXXXX...X.X", "X.....XXX.X......XX...X.XX..X.X.X...X..XX..X", "XXX..X.XX.X.XXX.XXX..X.X.X....X...X..X......", "XXX....X..XX.XX.XX.X.XXX.X...XXXX.X.XX.XXX.X", "XXX.XX.XXX...XX..XXX.XXXXX..X.X..XXX..X.XXX.", "XX.XXXX.XX.X.XXXX..XXXXXX.XX..X....X....XX.X", "X.X.....XXXXXX.X..XXX.XX.X.X.XX...XX.....XX.", "XX.XXX.X.XX...X..X...X.XX...X.XXX..X...X.X.X", "....XX.........X.XXX..X...XXXXXXXXX........X", "X.XX.XX........X...XX..X..XXX.XXXX...XX.XXXX", ".XX..X...X...XXXX....XXX..X...XXXX...XXX..XX", "..X.XXXX...X..XXX.X.XXX...XX...XX.XX..X.X...", ".X.XX.....XXXXXXXXX....X.X.X.XX.XX.X.XXX....", "XX..XX.X.X..XX.XX..X......X............XX.X.", "....XX..XXXXX.X.X.X.XX..X.X....XX.X.XX....X.", ".....XX.X.X..XXXX.XX.XXXXXXXXXX...X.X.XXX...", "X...XX.XXX.XXXX.X.X.X...XX.X......XXX.X.X.XX", ".XXXX..X.XXXX..XX...XXX...X....XX.X.X.XXXX..", "XX.X..XX...XXX...XXXX.XXXX..XXXXX.X...X.X...", "XX...X..XX.XX.............XXXX..X.XXXXX.X.X.", "..XX.XX...X...X.XX.XXX.XX.X.X.XX..XXXXXX..XX", "X..XX.....XX.X.X.XXX.X.XX.X...XXXX..XXXX....", "X..X.XX..XX.XX.X.X.X....X....XX.X..X.X..XXXX", ".XXX..X...XXX...X...XXX.XXX.XX.X.X..X.XXXXX.", "..XXX..XX.XXXX..XX.....XXXXX.X.XXXXX.X..XXXX", "X...XX.XXXX....X..XXX.XX...XXXXXXX..X.XXXXX.", "..X.XX.XXX...XXXXXX.X.X..X.XX..........XX..X" };
        int startRow = 23;
        int startCol = 29;
        int[] moveRow = { -15, 13, 5, 9, 5, 20, 7, 10, 8, 27, 25, 24, 30, 27, 13, 10, 12, 6, 21, 11, 8, 26, 29, 26, 3, 5, 33, 6, 24, 18, 33, 14, 10, 28, 24, 23, 29, 4, 8, 9, 8, 19, 10, 18, 16, 11, 7, 12, 8, 6 };
        int[] moveCol = { -24, 17, -1, 4, -21, 13, 17, -5, 5, -5, 11, -7, -19, 31, -16, 32, 5, 33, -19, 36, 2, 6, -11, 14, -1, -30, -35, -21, 21, 15, 1, -1, 14, -7, 20, 2, -3, -12, -11, 34, -26, 24, 33, 35, -37, -19, 21, 15, 31, -11 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case51() {
        String[] maze = { ".XX.XXX...XXX....X.X.X.XX..XXXXX.X.XXX.....X", "..XXXX.XXXX.X.X..XX.XX.X..X.XXXXXXXXX...X...", "X.X.XXX.X.X...XXX.X.XXXX..XX...XX.XX...X..XX", "XX...X.XXXX.XX.XXX..X..XXXXXX..X..XX.XX.X.X.", "..XX..X.X.XX.X.XX...X.X.X...XXXXXXX..X......", ".X...XXXXX..XXX..X.X..X.X...X..XX..XXX.XXXX.", "X.XX.X..X.X.X.X...X.XXX.XXXXXX.XXXX.XXXX...X", "X.XXXX.XXXX....XXX.....XXX....X.XXXXXX...X.X", "X.....XXX.X......XX...X.XX..X.X.X...X..XX..X", "XXX..X.XX.X.XXX.XXX..X...X....X...X..X......", "XXX....X..XX.XX.XX.X.XXX.X...XXXX.X.XX.XXX.X", "XXX.XX.XXX...XX..XXX.XXXXX..X.X..XXX..X.XXX.", "XX.XXXX.XX.X.XXXX..XXXXXX.XX..X....X....XX.X", "X.X.....XXXXXX.X..XXX.XX.X.X.XX...XX.....XX.", "XX.XXX.X.XX...X..X...X.XX...X.XXX..X...X.X.X", "....XX.........X.XXX..X...XXXXXXXXX........X", "X.XX.XX........X...XX..X..XXX.XXXX...XX.XXXX", ".XX..X...X...XXXX....XXX..X...XXXX...XXX..XX", "..X.XXXX...X..XXX.X.XXX...XX...XX.XX..X.X...", ".X.XX.....XXXXXXXXX....X.X.X.XX.XX.X.XXX....", "XX..XX.X.X..XX.XX..X......X............XX.X.", "....XX..XXXXX.X.X.X.XX..X.X....XX.X.XX....X.", ".....XX.X.X..XXXX.XX.XXXXXXXXXX...X.X.XXX...", "X...XX.XXX.XXXX.X.X.X...XX.X......XXX.X.X.XX", ".XXXX..X.XXXX..XX...XXX...X....XX.X.X.XXXX..", "XX.X..XX...XXX...XXXX.XXXX..XXXXX.X...X.X...", "XX...X..XX.XX.............XXXX..X.XXXXX.X.X.", "..XX.XX...X...X.XX.XXX.XX.X.X.XX..XXXXXX..XX", "X..XX.....XX.X.X.XXX.X.XX.X...XXXX..XXXX....", "X..X.XX..XX.XX.X.X.X....X....XX.X..X.X..XXXX", ".XXX..X...XXX...X...XXX.XXX.XX.X.X..X.XXXXX.", "..XXX..XX.XXXX..XX.....XXXXX.X.XXXXX.X..XXXX", "X...XX.XXXX....X..XXX.XX...XXXXXXX..X.XXXXX.", "..X.XX.XXX...XXXXXX.X.X..X.XX..........XX..X" };
        int startRow = 23;
        int startCol = 29;
        int[] moveRow = { -15, 5, -5, 11, 12, -17, 21, 21, 7, 1, 23, 16, 30, 25, -2, 8, 25, 0, 16, 23, 11, 5, 5, 9, 24, 19, 26, 26, 11, 7, 19, 30, 25, 33, 12, 10, 15, 18, 13, 4, 31, 4, 8, 10, 33, 31, 14, 3, 8, 30 };
        int[] moveCol = { -24, 12, -18, 1, 15, 14, -23, 21, -9, 5, -18, -8, 20, 10, 2, 18, 3, 32, -13, 33, 28, 13, -10, 9, -27, -15, 14, 19, 4, -4, -8, -31, -23, 24, 7, -5, 8, 17, 9, 22, 9, -9, -15, 39, 27, -30, 15, 5, 14, -13 };
        assertEquals(8, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case52() {
        String[] maze = { "XX.XXXX", "X.....X", "XXXX...", ".X...X.", "XX...X.", "XXXXX.X", "XX.XX.X", "...X..X", ".X.XX.X", ".X.XX.X", ".X..XXX", "......X", "..XX.XX", "XXX....", "..XXX.X", "XX...X.", "X.X.XXX", "X......", "XX..XXX", "X.....X", ".....XX", "XXX..X.", "XX...X.", ".XX.X.X", "XXXX.XX", ".X..X..", "XXX.X.X", "XX.XX.X", "...X.XX", "XXX.X.X", "XXXX...", ".XX..XX", ".X.XX.X", ".....X.", ".XX..X.", "XXX.XXX", "X.XX.XX", "X...XXX", "XX.X.XX" };
        int startRow = 31;
        int startCol = 4;
        int[] moveRow = { 6, -29, -30, -10, 24, -12, 14, 18, 11, 15, 4, -4, 2, 4, 19, 13, 30, 31, 11, 18, 34, 10, 17, 6, 21, 37, 38, 24, 25, 8, 15, 4, 0, 5, 31, 31, 11, 19, 0, 24, 0, 12, 29, 15, 17, 0, 29, 10, 21, 23 };
        int[] moveCol = { -1, -1, 1, 5, -4, -3, 4, 2, 2, 2, 2, 2, 0, 2, 0, 0, 4, -2, -1, 3, 0, 3, 0, 2, 1, -1, 2, 3, -1, 0, 4, 1, 0, 3, 4, 4, 2, 1, 0, -1, 0, 1, -1, 4, -2, 2, 4, 3, -1, 0 };
        assertEquals(6, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case53() {
        String[] maze = { "XXXXX..X.X.XXXX.XXXXXXXX.X...X.XXX..XXXXX.....XX.", "XXX.XX.X.X.XX.XXXXX.X.X.XX..XX..X.XX..XXX.X..X.XX", "X.XX.XXX.X.....XXX.X..XXX.XXX..X.X..X.XX..X.XX..X", "XXX..X.X.X..XX.XXXX.XXXX.XX....X...X...XX...X.X..", "X.XXXX..XX...X....XXX..XX.X.XX....X...XX.XX...XX.", "..XXXXXXXXXXX..XXXX.XX..XX..XXX.XX.XXX.X..XXX.X.X", "X.X......X.X..X....X..X.X.XXX.XXX..X.X...XX.X..X.", "X.XXX.....X.X...XXXXXX..XX.....X..XXX.XXXXXXX..XX", "XXXX..X.X.XXXX..XX..X.X..X.XX.XXX.XXXXXX...X..XX.", "XX.XX...XXXX.XX.XX...XX.XX..X..XX.X..X..XXX..XX.X", ".XX..XX.XX.X.XX..X.X.XXX...XX.X.XX.XX...XXXXXX..X", "XXX.XX.......X..XXXXXXXX..X..XXX.X..X.XXXX.....XX", "X..XX.XXXXXX.X.XX...X.XX.....X.....XXXXXX.X.XX.XX", "..XX.X.XXX..XXXX.XX.X...X.X.X.X..XX.....X.X.XX...", ".X...XX.X.XXXX.XXXXX.X..X.XX.XX....XX.XXX...XXX.X", "..XXXX.XXXXXXX....XXX..XX.XXXXX.X.X.....X.X..XXXX", ".XX.X....XXX..XXX..XXXX..X.X.X...X......X.X.X.X.X", "XXXX.XX...X.XXX.XX.XXX.XXX.X.....X...X.X...X..XXX", "X.X.X......X.XXX...X....X.X...X..X.X...X.XXXXX..X", "X.X....X..XX.X.XX...X..XXX..XXX.XXXX...X....XX.X.", "X.X..XX.X.....XXXX.......XX.XX.XXXX.X.X.XXXX..X..", "X....X.X..X.X....X..XXXX.XXX.XXX.X.XXX.X....XX.X.", "X.X.XX.X.XX...X..XXXXX.X..X.....X..XXX...XX.XX..X" };
        int startRow = 15;
        int startCol = 6;
        int[] moveRow = { -8, 3, -12, 5, 1, 5, 5, 4, 10, 2, 10, 13, 17, 4, 2, 13, 19, 15, 12, 10, 22, 0, 13, 19, 2, 3, 6, 6, 10, 12, 3, 11, 20, 4, 13, 14, 16, 4, 18, 12, 15, 13, 22, 20, 15, 16, 16, 13, 2, 7 };
        int[] moveCol = { 1, -3, 29, 3, 2, 15, 30, -6, -27, 6, -3, 30, 9, -17, 22, -4, 11, 7, 1, -10, 22, 20, 26, 3, 9, -9, -8, -1, 22, 39, 2, -17, 5, 15, 11, -14, 9, 13, 19, -11, -2, -11, -18, 11, 33, 27, -24, -4, 12, 18 };
        assertEquals(9, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case54() {
        String[] maze = { "X...X.XXX", ".XXX.X..X", ".XX...XX.", ".X.X.X.X." };
        int startRow = 1;
        int startCol = 7;
        int[] moveRow = { 2, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, -1, 2, 0, 1, 2, 1, 1 };
        int[] moveCol = { -7, 6, 1, 0, -6, 0, -2, -2, -2, 8, 2, -5, 1, 0, 4, 2, 3, 0 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case55() {
        String[] maze = { "XXXXXXXX...X..." };
        int startRow = 0;
        int startCol = 10;
        int[] moveRow = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] moveCol = { -1, 4, 6, -1, 2, 1, 5, 0, 3, 0, 4, 4, 6, 2, 2, 1, -1, 4, 0, 2, 4, 6, 3, 4, 5, 6, 4, -2, 2, 4, -1, 2, 5, 3, 4, 4, -2, 4, 0, 4, 4, 2, 0, 1, 5, 4, -1, 0, 1, 5 };
        assertEquals(1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case56() {
        String[] maze = { "X.X.XX.", "XXX.XXX", "XXXX.XX", "XX...X.", "X..X.XX", "X..XX..", "XX.X..X", "X.XXXXX", "XX..X.X", "XXXX..X", ".X..X.X", "..X.XXX", ".X..XX.", "..XXX..", ".X....X", "X.XX...", "...X.X.", ".X..X..", ".XXXXX.", "..XX.X.", ".X.X..X", "XX..X..", "XXXX.XX", ".XXXX.X", "X.X..XX", "XXXX..X", "..XX.XX", "X.X...X", "..X.XXX", "XXXXXXX", "......X", "..XXXXX", ".....X.", "..XX...", "X.XXXX.", "X.XXX.X", "X..X.X.", "X.X...X", "XXXX..X" };
        int startRow = 10;
        int startCol = 2;
        int[] moveRow = { 20, 18, -24, 33, 7, 17, 3, -6, 3, 14, 0, 2, 3, 36, 23, 18, 26, -2, 7, 5, 20, 34, 22, 7, 24, 28, 21, 18, 26, 32, 34, 32, 6, 16, 24, 6, 3, 36, 4, 11, 6, 26, 9, 20, 1, 0, 28, 25, 12, 19 };
        int[] moveCol = { 3, -1, 3, -1, -6, -1, -1, -4, 0, 1, 0, 0, 0, 3, -2, -4, 2, -1, 4, 4, -2, -1, 2, -2, 5, 0, 3, 4, 2, 0, 4, 0, 2, 3, 2, 5, 3, 2, 4, 0, 4, 5, 4, -2, 0, 0, -1, -1, 0, 5 };
        assertEquals(6, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case57() {
        String[] maze = { "XX.XX..", "...X.XX", ".XX.X..", ".XXXX.X", ".XXX..X", ".XXX..X", ".X..XXX", "..XXX.X", ".XX...." };
        int startRow = 0;
        int startCol = 2;
        int[] moveRow = { 1, 3, 2, 6, 1, 1, 5, 1, 6, 1, 6, 3, 7, 6, 4, 0, 5, 7, 0, 3, 8, 1, 0, 0, 4, 6, 1, 6, 4, 2, 6, 6, 4, 6, 6, 6, 0, 7, 7, 7, 0, 8, 7, 3, 0, 0, 0, 5, 6, 5 };
        int[] moveCol = { -2, 3, 4, -6, 0, -3, 3, 2, 6, 2, 0, 2, 3, 5, -2, -1, 1, 2, -1, 5, 4, 0, 0, 4, 1, 3, 5, 6, 2, 4, 6, 1, 2, 0, 0, 6, 1, 4, 5, 4, 3, 1, 4, 6, 2, 2, 6, 1, 0, 6 };
        assertEquals(3, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case58() {
        String[] maze = { "XXXX...XXX.X..XXXX...XXXXX...XXXX..X..", ".X.X.X.XXXX..X.X..XXX.X.X.XXXX..XXXX..", "XXXXX..XXX...X.XXXX.XXXXX..XXXXXXXXXXX", "X.XXX..XXXX..X....X.XX.XXXX.X.X..X.X.X", "XXXXXX.XX..X.XX.....X..X.....XX.X....X", ".XX.X.XX.XXX.X....X.XXX..X..XXXXXX..X.", "XXXX...X.XX.XXXXX.X...XXXX.X.X...X.X..", ".X......X..X..XXX........X..XX.....X..", "XXXX..X..X..XX.X.XX.XXX......XX.XX....", "X.XXXXX.X.X.XXX.XXXXX.XX.XXX.XXXXXXX..", ".XXX..XXXXX..X.XXXXXX...XX.XXX.X...XXX", "..X..X...XX.XX.XXX.X..XXX.XX....X.XXX.", "X.XX.X.XXX.XXX...XX.X...XX...XXX.X...X", ".XXX.XXXXXXXX..X.X.X....X.X..XX.......", ".X.X..X..X.X...X.X..XX.X.XX..X...XX.X.", "X...X..X.XX..XX..XXX.X....XX.X.XX.X..X", ".X.XX..X.X.X.X..X..XX...X.XXXXX...X.XX", "X..XXX.XX..X.XX.X.X..X.XX.XX...XXXXXXX", "X.XX..XXX....XX..X.XX...XXXX.X..X..X.X", "X..XX.....XXX.X.XXX.XX...X.X.X....XXX.", ".XXX..X...XXXX.XXXXXX..XXXX...X.XXXX..", ".XX.XXX..XXX.X.XXXXX..X.XX.XX.....X..X", "XX.....X.....XX.X.XX....XXX.X.X..XXXX." };
        int startRow = 6;
        int startCol = 26;
        int[] moveRow = { 1, 5, 5, -4, 5, -8, 0, 17, -5, 16, 14, 7, 3, 13, 0, 10, 5, 15, 12, 9, 10, 12, 10, 9, 7, 10, -1, 10, 12, 13, 4, 5, 9, 7, 5, 5, 18, 21, 5, 2, 18, 14, 14, 6, 0, 8, 10, 9, 2, 10 };
        int[] moveCol = { 5, -18, 6, 17, 6, 1, 0, 27, 1, 8, 4, 12, 16, -4, 5, 11, 19, 10, -17, 7, 7, -2, 19, -7, -19, 19, 15, 11, -23, -20, 3, 15, 20, 6, 12, 14, 4, -2, 8, 8, 12, 9, 1, 15, -2, 14, 8, 13, 23, -5 };
        assertEquals(9, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case59() {
        String[] maze = { "XX....XXXX....XX..X...", "X..XX...XXXX.XXXXX.X.X", "....X...X.XX..XXX.X...", "XX.XX.X...XXXX..X.XXX.", ".X.XX.XX.X.XXX...XXX..", "X.XXXXX.X.X.XX..XX.XXX", "XXXX..X..X.X.XXXXXX.X.", ".XXXX......X..X...XX..", ".XX.X.X...X.XX....XXX.", "XXXXX.......X.XXX...X.", "..XX.XXX.XXXXXXXX...XX", ".XX.XX.X.X...XXXXXXXX.", "..XX..XX.X.XXXXXXXX.XX", "..X..XX.XXX.X.XX..XXX." };
        int startRow = 3;
        int startCol = 21;
        int[] moveRow = { 0, 0, -1, 12, -2, 11, 7, -4, 4, 10, 9, -1, 10, 4, 11, 13, 2, 5, 2, 1, 4, 7, 1, 6, 9, 5, 13, 2, 3, 11, 12, 10, 2 };
        int[] moveCol = { -16, 4, -4, 16, -7, -2, -6, 5, -6, -3, -10, -7, -16, 11, 10, -16, -18, 2, 10, 2, 0, 13, 8, 11, 7, 16, 11, 7, 0, 4, 20, 19, 9 };
        assertEquals(6, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case60() {
        String[] maze = { ".XXX..X.X..XX..X....X...X.X.XX.X..XXX..X.XXXX.XXX", "X.X..X.....XX.XXX...X..XX..XX...XX.X.X.X.X.XXX.XX", ".X.X..XX...X..XXX....XX.XX.X.......XX..XXXXX.XXXX", "X..XX.XXX.X.XX.X...X.X.XX..XXX..XXXXX.X.....XXXXX", "XXX..X...X.XX.X...XXX.XXXXXX.X..XX.XX.XXXXX.XX.X.", "...X..XXXXXXX.X.XXX.....XX.X....XXXX.X.X.X..XXX.X", "X.X.X.XXX.XX.XXXX...X..XXXXXX......XXXX..XX...XXX", "XXX...X.X.XXX..XXX.X..X..X...X.XXXX..X.XXXXX....X", "XXXXX.X.X.X.X.XX.XX.X........X........XXXXXX..X..", "X.XX..XX.X.X.X.....XXX...XX..XXX.X..XXXXXXXX.XX.X", "XX..XX.X..X.XXXXXXX..XX.XX.XX.....X...XXX.X...X..", ".XXXXXXXXX.....X...X.X.XX....X....X......XXXXX.XX", "X.X.X.XX..XXXXXX.XXXX......XX......X..X...X..XX.X", "XX..X..XXX.X.X..X..X.X....X...X.XXX....XX.XX.X..X", "..XXXXX...XX....X...X..XXX...X..XXXX........XX...", "XX...XX..X.X.X.XX...X.XXX.X...XXXX.X....X..X.XXXX", ".XXX.X.XXX.XX...XX..X..XX...XXXX.XX..XXXXX..XX.X.", "XX.XXX....XXXX..XX.XXX..XXX.X.XXX.XXX..X.X.XX.XXX", "X...X.X.X..X..XX.X.XXX.X..X....XXXXXXX....XXX.XXX", "X..XX..XX.X..XXXX.XX.X....X.X.XX..XX..X..X..XX.XX", ".X.XX.XXX.X..X.X.X........XX..X..XX...X..XXX..X..", "X..XXXX..X.X..XX..X.X.X..XXX....X.XX.X...X.X.X...", "X.XX.X...XX....XXXX.XXXX.X.XX......X.X..XX..X.XXX", "X.XXX...X..X..XXXXXX.XX..XXXX.X.XXXXX...X..X..X..", "XX..X...X.XXX.....X.XX.XXXX.X...X.XXXXX.X...XX.XX", "X...X.X...XX..XX.X.XXX.XX.X..XX.....XXXX...X..X.X", "X.X..X.XXXX.X..X.X....X..X.XXXX..X..X.XX.XX...XXX", ".X.XXX.X.XXX..X.XXX..XXX.XX.X...XX..X...XX.XXXXXX", "XX..X..X..X..X...XX..XX.XX.XX..XXXXX..XX.X...XXXX", "XX.......X.X.X..X..X..XX...X.X.X.XX...XX.XX..X...", "X.X...X.XXX.X.X.XXX.XXXXXXXX..X.X......XXXXXXXXX.", "XXX...XXXX..X.XXXX...XX..XXX.X.....XX..X.X.X.....", "XXXX.XX.X......X...XXXX..X....X.....X.XX..X...X.X", "X.X.X.X.XX..X.X..XXX...XXX..XXX.XX.XXXXXXX.XX....", "XXXX..XXXX..X.XXXX.X.X..X.XXXXXXX.XXX.XXX.X..X.XX", "XX.....X....XXXXX.X...X.XXXX...X..X..XX...X..X.X.", "XX....XXX.X.X.XXXXX.X.XXXXXXX.XX.XX..XX.XXXXX....", ".X..X...X...X..XX..X.X...XXXX.X.XX.X.X...X..X....", ".XXXX.X.XXX...XX.X.XX....XXX.X..X.X...XX.X.X..XXX", ".X.......XX..X.X...XXX...X.XX..X...X.X...X.X.X.XX", ".X.X..X.XX.....XX..X..X..X..XX.XX.XX...XX...XXXX." };
        int startRow = 17;
        int startCol = 40;
        int[] moveRow = { 16, -33, -2, -7, -3, 34, -6, 27, 26, 1, 5, 12, 5, 5, 14, 39, 6, 15, 39, 22, 10, 14, 22, 20, 19, 30, 40, 39, 37, 8, 21, 16, 19, 5, 8, 29, 2, 28, 17, 37, 12, 11, 26, 24, 35, 18, 18, 10, 20, 30 };
        int[] moveCol = { 8, -15, -10, 10, -18, -29, -18, -7, 0, -33, -16, 17, -21, 19, -22, -4, 27, -3, -28, 8, 12, 3, 6, -12, 13, 1, -14, 29, 6, 20, -8, 20, 12, 8, -12, 2, -15, -3, 25, -13, 5, 20, 21, -5, 19, 23, -2, 17, 25, 27 };
        assertEquals(8, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case61() {
        String[] maze = { "...X.X.X..X.X.XX...XX.XX...XXX.XXXX.XX.X..XX", "XX.XXXX..X.XXXXXXX.XXX.XXX.XXXXXXXXXXXX..XX.", "X..XXXXXX.XXX.XXXX.X..XXXXXX...X..XXXXXX..XX", ".XXX..XXX.XXX.X..XXX..X.X.....X..XXXX.XXXXXX", ".XXXXX..X..X....XX.X.XXX...XXXX..X.XX.XXX.XX", "XXXX.X.XX....X.X..X..X.X...XXXXX.X.XX....XX.", ".......XXXX.X..X.XXXX.XXX.XX.X..X...XXXX.XXX", "XXXXXXXX..X.....XXX...XXX.XXX..XXXXX.X..X...", ".XX.X..XXXX.X.X.X.........XXX.X.XXXX.X..X.X.", "..X.X.XXX.X.XX..XX.X..XXX...XXX.XXXXXX...XXX", "..X..XXX.XXXXX.X.XX..XX...XX..X...XX.XX.X.X.", "XXX.XX.XX...X.XX.X.X..X.XX.XX.X.XX.X.XX...X.", "...X.XX..XX..X..XXXXX..XXXXX.XXX...X.X.XXX.X", "..XX..X.X.X..X.X.X.XXXXX..........X.XX.X..XX", "X.X.X..XXXXXX.X..X.X..X..XXXXXX.XXX.X.XX.XX.", "X..XXXX.X.X.XX.X.X.X.XXX...X.X......XXXX.XX.", ".XXX...XX...XX.XXX..X..XXX.X.X....X.........", "..XXXXXX.X..X.X..X....XX....X..X...XXX.XXXX.", ".XX.XXXXX.X..X.X.X..X...X..XX...X...X.XXX..X", "...X...XXX.XX.XXX..XXX...XX..X...X.XX..X..X.", "X..XXXX.X..XX.XXXXX.XXX.XX.X...X.......X.XXX", "XX..X..XXXXX.X.XXXXX..X.X..XX...X.X...X.XX.X", "X.X..XXXX..X.XX....X.X.X.X.X.........XXXX.X.", ".XX...X.XXX.X.....X.....XX.....X.XXXX.X...XX", "XX..X..X..X..XXX.X...X...XX.XXX...XXX.X.X.X.", "....XX..XXXXXXX.X.XX.X.X.XX.XX.XXX....X.XX..", ".X.XX.X....X.X.....XXX.....X.XXXXXX.X.XX..XX", "X.X.XX....XXX.X.....XX..X.X.XXXXXX.XXX...XXX", "..X.X.XXX.X.X.XXXX.XX..XXXX.X..X.XX.X..XXXXX", "XX...XX.X.XX.XXXXXXXXXXX.X.XX.XXX.XX........", ".X..X.X..X.X.X..XXXXX.XX....X.XX..X..XX....X", ".XX......X.......XXX.XX.XXX.X...XX.XX.X.XXX.", "X.X..X.XXX.XXX......XX...XX.XX...XX.XX..XXX.", "XX.XX..XX..XXXXXX....XXX....X...X.XXX.X.XX..", "XXXX.XX...XXXX...X.X.....XX.XXX....XXX.XX...", "XXX...X..XXXX...X.XX...X.XXXXXX.X....XX.X...", "..XXXXXX..X....X..XX.XX..X...XXX.X.....X..XX", "..X.X.X.XXX..XXX.XX..XX..X.X.X.X.X.X.XXXX.X.", "...X.XX.....X.XXX.X.XXX.XX.X..X..XXXX.XXX...", "X...X.X.X....XX.XXX.X..X..XXX.XX..X.XXXXXX.X", "XX.X..XXXX...XX..X.XX.X.XX.....X.XX...XXXXX.", "X....XXXXX.X..X..X.XXXX..X..X.X...X.X..XXX..", ".XXX.X.X.X.X.X.X.XX...X....XXXX....X..X..X.X", ".X..XXX...X.....X.XX.X....XX.XX.XXXXX.XXXXX." };
        int startRow = 37;
        int startCol = 16;
        int[] moveRow = { 5, -9, -13, -5, -16, 19, 8, 13, 2, 36, 20, 20, 31, 43, 25, 14, 29, 27, 19, 14, 27, 26, 21, 38, 14, 30, 24, 6, 37, 12, 25, 11, 38, 4, 23, 34, 31, 32, 20, 13, 28, 39, 11, 34, 28, 13, 38, 20, 24, 23 };
        int[] moveCol = { 7, 20, -14, -13, -28, -24, 3, 38, 19, 13, -17, -10, -5, -28, -22, -15, 7, 20, -10, 14, -18, -15, -1, 10, -4, 29, -2, 11, -5, -7, 20, -39, 17, 0, -25, -28, 31, -20, -9, 7, -24, 8, 19, -29, 21, 6, 3, -29, 1, -12 };
        assertEquals(11, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case62() {
        String[] maze = { "X.X..X..X.X.X.X.XXX....XXXXX..X..XXX.....XXXX.X.X", "XX...X.X.XXX..XXXXX.XX..XX...XXX.XXXX....X.X.X...", "X.X.XX.XXXXXX.XX.X.....X.XX..XX.X.XXX.X..XXXXXX.X", "XXXX...X.XX..XX.XXX...X...XXX..X..X...XX.X..XXXXX", "XXXX..XX....XXX..XX.X.XX......X.X.XX..X...XXX...X", "X.X...XXXXXX.X..XX.X.X..X....XXX.X..X.XXX.X......" };
        int startRow = 2;
        int startCol = 24;
        int[] moveRow = { 1, 2, 3, -3, 0, 0, -4, 2, 5, 4, 3, 5, 2, 0, 4, 4, 1, 1, 5, 3, 5, 3, 2, 1, 0, 1, 1, 2, 2, 5, 1, 3, 5, 0, 2, 0, 4, 5, 3, 2, 1, 5, 3, 0, 2, 1, 3, 5, 2, 0 };
        int[] moveCol = { -20, 9, 3, 7, -26, 25, -10, 5, 2, -40, 6, -12, 2, 40, 24, 36, 3, 0, 25, 28, 41, 7, 7, 38, 3, 21, 21, 25, 38, 15, 40, 25, 19, 19, 5, 20, 9, 28, 30, 36, 12, 16, 9, 43, 18, 1, 1, 9, 12, 28 };
        assertEquals(6, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case63() {
        String[] maze = { "....X..X.X.XXXX.XX....XX.XX..X", "XX.X....XX..X.X..XX.XX.XXXX.XX", ".X.X...XX..X.X..XX....X.X.XX..", "XX...XX....XXX..X.X.X..X..XX..", "..X...XXX..XXXXXX.X.X...X..XX.", "..XX.X.XXX....X.XXXXXX.X..XXX.", "XXX.X..XX..X.XXX.X.X...X.XX.X.", ".X.XXXX......XX.XXX..X..XX....", "XXXXX...X....XXX.XX.X.XXXXX.XX", "XX.XXXXXXX.XXXXX.X.XX..XX.....", ".X.XXXX..X.X.XXX.XX....X......", "XX.XXXXX.XXXX...X.XX..XX..XXXX", "XX.XXXXX.....X.X.XXX..X..XX.XX", "...XXXX.X...X..XX.X.XX.X..XX..", ".XX.X.XXXX.XX.X.XXX.XX.......X", "..X.XX......X...XX......XXX.XX", ".XXX.X.X..XXXXX.X.X...XXX.XX.X", "XXXXX.X.XXX..XXXXXX.XXX.X...X.", "..XXXXXXXXX..XX.X....X.X....X.", "X..X..X..XXX...X..X..XXXX.XXXX" };
        int startRow = 10;
        int startCol = 2;
        int[] moveRow = { 1, -9, 14, -1, -8, -5, 0, -6, 17, -5, 19, -4, 16, 1, 2, 17, 0, 5, 8, 8, 13, 1, 7, 11, 11, 16, 4 };
        int[] moveCol = { 22, 0, 21, 3, -14, -10, -25, -7, -13, -5, -19, 1, 13, -4, 12, 5, 16, -12, 8, 8, -8, -6, -1, 11, 18, -4, 19 };
        assertEquals(7, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case64() {
        String[] maze = { "XXXXXX.X...XXXX..XXXX...XXX..XX..X.XX..XX.XX", "...XXX..XXXXXXX.XXX.XX.XX..X.X.....X.X.XXXX.", "X.XXXXX.X.X.X.XX.XXXX.X.XX..X.XXX.X..XX.XX.X", "X...X.X....XXX.X..X....X..XX...XXXXX..X.....", ".X.XXXX..XXX..XX.....X.....X......XX..XX...X", "X..X.X.XXXXX...XXX..X.X.XXXXX.XX.XXX...XXX.X", "...XX.XX.X...X..XXX.X....X..XX.X......XX..X.", "......X.X.XXX..X.......X.XXX..X..XX..X..XXX.", "XX.X..XX.XX....XX..X..X.X....X...XXX....X...", "....XXX...XXX.X..XXX...XXXX..XXX..XXX.XXXX..", "...XX.X.X.XXX......X..XXX.X.X..XX...X.XXXXX.", ".X.X...XX......X...XXXX.X..X........X.XXXXX.", "X...XXXXX.XX..XXXXXX...XX.X.XXXXXX.X.XX..XXX", "X...X...X.X...X.XXXX..X...X.....XX..XX.XXX..", "X.X.XXX..XXXX.XX..X.XX.X....X..X..XXX.X..X..", "XXXX.XXX.XXXX.X.XXX...XX.XXXX....X.XXXXXX.XX", "XX..XXXXX.X.XX.XXXXXX...X.X.X.X.XX.X....X...", "....XX.XX.XX.XXX.XX...XX.X..XXXX..XX..X..X..", "X.X..XX.X.X....X..X.XX.X.X.XXX....X.X.X....X", "..X...X.XXX.XX...XX.XXX...X.XX..XXX..X.X.X..", "...X..XX..X.XXX.X.X.XXX.X.X.X..XXX...XX..XX.", "...XX.XX.XX.X......XX.....XX.XX.XXX.X.XX....", "..XX.X...XX....X.XXX.XXX.XXXX.X.XXX.XXXXX.XX", ".X..X.X.XX...X..XX..XX..XX..XX...XX.XXX.XXX.", "XX..X.XXXXXXX.....X.....XXX.XX.X.X.XX.XX.XXX", "..XXX.X..X.XXX.X.X..XX.X.X.....XXXX.X.....XX", "XX...XXX..XXXXX...X...X.X.XX..XXX.X.X...X...", "XXXX..XX.X....XX.....XXXX.X..X...X..X.XXX.XX", ".XX.X.X....XXX.X.XX..X.XXX..X.XXXXX..X..X..." };
        int startRow = 25;
        int startCol = 14;
        int[] moveRow = { 1, -16, -2, 9, -3, 18, 5, 19, 7, 10, 8, 24, 25, 28, 23, 21, 9, 21, 21, 12, 12, 17, 27, 14, 5, 15, 5, 7, 25, 13, 20, 24, 8, 14, 23, 8, 2, 13, 22, 7, 2, 20, 10, 14, 13, 12, 7, 18, 7, 26 };
        int[] moveCol = { 1, 18, -1, -12, 7, -12, -5, 15, -32, -27, 5, -16, -36, 32, -7, -2, -1, -35, 19, 36, 6, -21, 13, 30, 0, 30, -2, 2, -2, -5, 30, 6, 1, 32, 33, 2, 10, 23, 23, 33, 27, 12, 1, 36, 29, 3, 1, 2, 38, 3 };
        assertEquals(18, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case65() {
        String[] maze = { "XXXX..XX.X....XX..X.XX...", "X....XX...X....X.XXXX.XXX", ".X...X..XXXX....XX..X.XX.", "XXX.X..XX.X......X.X.XXXX", "XX..X.XXXXXXX.X.XXX.X.X.X", "XXX...X.X.XXXXXXX...XX...", ".XX...XXX.XXXX.XXX...X..X", "XX..X.X.XX..X.X..XX.X.XX.", "...XX.X...XX.XXX..X..X.XX", "..X.X..XXXX.X.....XX.X...", ".X....XXXXX..XX...X.X...X", "X...XX..X....X...X.X.X...", "XX.X.XXXXX.XX..XXX..XXX..", ".XXX.....X.X.XX.X..XX.X..", "XXX..XXXXX.X.X.X.XXX.XX.X", ".X.X....XXXX..XX.XX..XXX.", ".X.XX..X.X.X.XXXXX..XX.X.", "XX.XX.XX.....XX....XXX..X", ".XX.X...X..XXX...XX.XXXXX", "...X.XX.X.X.....X.X.XXX..", "X.XXXX..XX....X..XXX.X...", "..XXXX..XXX.XXX.X.X....XX", ".X.X.XX....XXXXXXX.XX.X..", "XXXXXXX.XX.XXXX.XXX.XX...", "XX...X.X.XX..XXXXX....XX.", ".X....X.X.X.X....X..X...X", ".XXX.XX.XX.......XX..X.XX", "X.X.XX.XX....XX...XXX.X.X", ".X.X.X.XX.....X.XXX...XXX", "XX.X.XXX.X.X.X..XX..XX.XX", "...X.X..X.XX.XXX..X.X...X", ".XX.XXXX....X...X...XXX..", "..X..X.XXXXX.X.X.XX..X.XX", "X.X.XX.....X.X.XX.XX.X..X", "X.XXXX..XX....XX.X..X...X", ".X.XX......XXXX...X..X...", "..X....X.X.XX..XXX.XX....", "X..X..X..X...XXX.....X.X.", "X....X..XX..XXX...X....X.", ".XX..X.X..XX.XXXXX.X....X", "XXXXXXX...X.X.XX....X.XXX" };
        int startRow = 32;
        int startCol = 4;
        int[] moveRow = { -16, -13, -19, 0, 6, 29, 21, 25, 3, 25, 26, -1, 27, 38, 10, 22, 6, 14, 37, 18, 10, 28, 8, 15, 28, 29, 15, 20, 2, 15, 40, 31, 29, 14, 2, 40, 40, 4, 18, 38, 2, 12, 32, 20, 3, 18, 35, 40, 15, 6 };
        int[] moveCol = { -4, 19, 8, -6, 3, -12, -8, 10, 5, 12, 4, 3, 3, 8, 11, -3, 9, 7, 4, 1, 18, -4, 2, -12, 7, 19, 8, -1, -8, 19, 12, 21, 1, 18, -7, 1, 0, 12, 15, 19, 6, 8, 14, 6, 3, 9, 10, 9, 10, 7 };
        assertEquals(7, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case66() {
        String[] maze = { "XX.XXX.XXX..X.XX.X....X.X.X.XX", "XX..XXX.XXXXXXX.X......X.XXX.X", "..XXXXXX.X.X.XXXXXX.X.XX.X.X..", "X....X.X.XXX..X.X.X.X..X.XX.X.", ".X...X..X.XX..X.XX.X...XX.XXXX", "XX....X.XXXXX.X.X...X.XX.X.X..", "..XX..XX.XX.X.....XXX..X.XX..X", ".XXXXXXX....X.XX....X......XX.", ".X..XXXXXXXX.X...XX.XXX.X.....", "X..XXXXX.XX..XX..X...X..XXXXX.", "X.X.X.X.XX...XX.X.X....X..XX.X", "..X...XX.XX.X.XX....XXX.X.X.XX" };
        int startRow = 10;
        int startCol = 25;
        int[] moveRow = { -3, 3, -10, -6, 6, 1, 2, 7, -1, 7, 10, 6, 5, 10, 6, 11, 7, 7, 4, 3, 2, 5, 8, 9, 8, 3, 3, 11, 11, 7, 6, 5, 5, 8, 7, 6, 6, 4, 4, 9, 11, 2, 8, 9, 2, 5, 1, 6, 3, 2 };
        int[] moveCol = { -16, 3, -2, 9, -12, 5, -5, 18, -1, 23, -17, 1, -16, 1, -9, -22, -4, 9, 1, -8, 0, 10, -2, 4, -11, -1, -9, -4, 4, -4, 8, 23, 1, 16, 15, -4, -1, 12, -12, -8, 2, 5, 4, 8, 9, 4, 26, -1, 13, 14 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case67() {
        String[] maze = { "XXXXX.X..XX...X.....X.X.", "XXXX..XX....XXX..XXXXXX.", ".X.X.X..XXXXXX..XXX....X", ".....XX.XX..X.XXX..X.XX.", "...XX.XXXXX..XXXXX...X..", "..X..XX...XX.X......X...", ".XXX.XX..XX....XXXX.....", ".XXXXX..XXXXXXXX...XX..X", "XXX..X.X..X.........XXX.", "X.XXXXX.XXXXXX...X.X..X.", "..X.X.XXXXXX.XX.X.X...XX", "X.XX..XX.X.X.XX.XX..XXX.", "XXXX.XX.X.XXX......XXX..", "XX....X..XXXX..XXXXXX.X.", "X...X..X....XX...XX..XXX", "XXX.X....X....XXX..X.XX.", ".....X.XX...X.X....X....", "XXXXXXX.....XXX...XX.XXX", "X.....XXX.XX...XX..XXX..", "....XXXX.XX..X..X.X.X...", "XXX...XXX.X.X..X.XX...X.", "XX....X.X.XXXXX....X.X..", "XXXXX.XXX.....X..XXXX.XX", "...XX...XXX.X.....XXXX.X" };
        int startRow = 9;
        int startCol = 14;
        int[] moveRow = { -6, -6, -3, 13, 18, 12, 0, 17, 18, 13, 20, 15, 20, 7, 5, 5, 11, 17, 23, 0, 9, 5, 15, 6, 15, 8, 23, 9, 12, 22, 9, 3, 18, 17, 0, 22, 14, 15, 8, 16, 9, 9, 2, 0, 21, 18, 6, 5, 21, 9 };
        int[] moveCol = { -4, 9, 3, -11, 13, 15, 1, 11, -3, -10, -10, 2, -17, 0, -15, -18, -2, 2, -18, -1, 16, 0, 4, 3, -2, -8, 14, -1, 6, 2, 4, -5, -8, 8, 10, 12, 3, -2, 13, -1, 0, 1, 20, 10, -3, 9, 5, 21, 16, 6 };
        assertEquals(8, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case68() {
        String[] maze = { "XXXXXXXXXXX", "..XX.XX.XXX", "XXXXXX.X.X.", "X..XX.XXXXX", "..XX......X", "XXX..X..X..", "..X.XX..X..", "XXX.....XXX", "XXXXXX....X", ".X.XXX..X.X", "X..XX..X...", ".X..X....XX", ".X.X.XX..XX", ".XX.XXX..X.", "X..XXX.XXX.", ".XXX..XX.X.", ".X.X.XX..X.", "X.XX.XX.X.X", "X.XXXX.XX.X" };
        int startRow = 11;
        int startCol = 7;
        int[] moveRow = { 0, -8, 3, 1, 7, 2, -2, 3, 14, 1, 6, 7, 3, 6, 7, 14, 9, 10, 1, 10, 4, 3, 1, 4, 8, 16, 6, 3, 2, 12, 14, 3, 12, 1, 6, 6, 2, 1, 7, 14, 3, 15, 3, 7, 1, 12, 8, 7, 4, 9 };
        int[] moveCol = { -2, -2, -1, 2, 1, 5, -1, -1, -5, 2, 4, -5, 9, 1, -1, -1, 3, 0, -6, -2, 6, -1, -1, -4, 3, -5, 4, -2, 7, -5, -3, 5, 1, 3, 1, 0, 4, -3, 3, -5, -3, -1, -9, -3, 9, 3, -7, 1, 4, 2 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case69() {
        String[] maze = { "XXX..XX........XX.X.....X...", "XX...X...X...XXXX..XX.X.X.XX", ".XXX....X....XX.X.X...XXXX.X", ".X.XXXXX.XX.X..X.XXX.XX.XX..", "..XXX.X.X.X....XXXX..X.X.XXX", "X...XX..XX.XX..X.XX...X..X..", "X.X...X..XXXXX.XXXXX.X.X...X", "XXX..XX......XX.XXX.X.X.X.X.", "XXX.X.XX.XXX..X..XX.....XX..", "....XX..XXX...X.XX..X..X.X..", "..X..X...XXXX.X....XXX.XX.XX", "XX.X.X.......XX...XXX.....X.", "XXXX..X.X..XXX..X.X.XXX.....", "X..X.X.X..XXX....X.XX.....X.", "....X.XXXX..X.X.X..XX.X...X.", "..X.XXXX.....X.X.XX.XXXX.XXX", "..X..XX.XXXX.X..X.X.X.X.X..X", "X..X..XXXXXXX....XXX...XX...", ".XX..XXX.XX.......X.X.XX...X" };
        int startRow = 11;
        int startCol = 8;
        int[] moveRow = { 3, -6, -10, 0, -8, 2, 16, 16, 15, 15, 0, 9, 17, 3, 10, 14, 0, 0, 0, 1, 17, 17, 13, 17, 9, 12, 4, 18, 16, 18, 0, 4, 10, 18, 6, 11, 13, 6, 4, 10, 7, 8, 10, 3, 18, 10, 7, 14, 14, 18 };
        int[] moveCol = { -7, -1, 2, 4, -8, 9, -4, 6, 18, 1, 18, -2, 16, 5, 7, 5, 5, 23, 8, 9, 17, -1, 24, 7, 2, 22, 9, 17, 20, 6, 10, 13, -2, 5, 11, 17, 15, -3, 1, 6, 1, 22, 4, 15, 7, 5, 1, 7, 15, 6 };
        assertEquals(7, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case70() {
        String[] maze = { "X..X", "XXX.", "X.X.", "XX..", "X...", "XXXX", ".X..", ".X.X", "..X.", ".X.X", ".X..", "XXX.", ".X.X", ".X.X", "X.XX", "X.X.", ".XX.", ".X.." };
        int startRow = 17;
        int startCol = 0;
        int[] moveRow = { -11, 9, -4, 0, -2, -6, 4, 13, 12, 7, 4, 13, 7, 0, 10, 9 };
        int[] moveCol = { 2, 1, 0, 0, 0, -1, -1, 0, 0, 2, 2, 0, 1, 1, 3, 0 };
        assertEquals(6, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case71() {
        String[] maze = { ".X....X..XXXXX", "..X..XX...XX..", "XX.XXX.XX...X.", "X.XX..X.X.X..X", "XX..X....XXXXX", "..X.XXXXXX.XX.", ".X...........X", "X...X.X.XXX.X.", "XXX.X.XX.XX...", "..XXXX..XX...X", "X.X.X.XX.XXXXX", "..XX..XX.XXXXX", ".XXXXX.X.X...X", "X.....X.X.X.XX", "..XX.......X.X", "...X..XXXXXX.X", "X..X.XXX.X.XX.", ".X.X.XXXXXXXX.", "XX.X....X.X...", "...XX.X.X...X.", "X.XXX...XXX...", ".XXX.X.XXX.XXX", "...XXXXXX...XX", "...X.XX....X.." };
        int startRow = 1;
        int startCol = 4;
        int[] moveRow = { 18, 8, -2, 1, -13, 10, 15, -9, 12, 0, 16, 9, 5, 9, 8, 9, 11, 10, 8, 19, 15, 21, 17, 18, 0, 22, 15, 16, 0, 6, 22, 4, 23, 21, 5, 1, 20, 3, 10, 7, 0, 14, 9, 15, 5, 5, 4, 4, 0, 13 };
        int[] moveCol = { -2, 7, 2, -8, 5, 6, -3, -8, -10, -7, -9, -1, 9, -9, 10, 1, -1, -3, 6, 6, 5, -3, 9, 4, -9, -11, 0, -1, 0, 3, 10, -3, -3, 6, 1, 6, 1, 8, 10, 11, 0, 4, 0, 0, 2, 0, 11, 10, -2, 12 };
        assertEquals(6, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case72() {
        String[] maze = { "XXX.XXX.XX", "X...XX.XXX", "X..X.X...X", "..XX..X.X.", "XXXXXXXXXX", "XXXXX..X..", ".XX..XXXX.", "XXX.XX.XX.", "XX...XXX.X", "..X....X.X", ".XX..XXXX.", "XX...XX.XX", ".XX.XX..XX", "XX.....XXX", "..X...X...", "XXXXXXXX..", "X.X.X.X.X.", "..X.X..XXX", ".XX..XX..X", "XXXX.X..XX", "XX.XX.XX..", "XXXX.XXXXX", ".X....X.X.", "X..X..X.XX", "XX....XXX.", "XXX......X", "XX....X.XX", "X.XX....X.", ".X.X.XX...", "XX.X....XX", ".X..X..X.X", "X.X....X..", "..XX..X...", "X.XXX...XX", ".X...XX..X", "....X..XXX", "XXX.XXX..." };
        int startRow = 7;
        int startCol = 3;
        int[] moveRow = { 7, 5, 7, 7, 17, -11, 5, 13, 8, 0, 9, 29, 20, 20, 1, 18, 1, 5, 6, 27, 5, 33, 3, 8, 3, 26, 12, 0, 4, 0, -1, 30, 6, 33, 23, 18, 28, 5, 25, 10, 34, 23, 12, 30, 2, 2, 23, 4, 36, 21 };
        int[] moveCol = { 2, 0, 4, 0, -1, 1, -2, -4, -8, -7, 3, -5, 4, 3, -6, -1, -4, -2, -3, 2, 3, -2, 1, 4, -1, -4, 2, 4, 0, -6, -2, -6, 5, 4, 1, -5, -5, -3, 2, 6, 2, 6, 0, 5, 5, 5, 3, -1, 0, 0 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case73() {
        String[] maze = { ".X", "XX", ".X", ".X", "..", "..", "X.", "X.", "X.", ".X", ".X", "..", "..", "XX", ".." };
        int startRow = 8;
        int startCol = 1;
        int[] moveRow = { 3, 0, -5, 6, 0, 0, 6, 4, 3, 6, 1, 1, 8, 2, 6, 5, 1, 5, 9, 5, 7, 10, 9, 0, 4, 10, 0, 2, 8, 2, 3, 8, 8, -2, 10, 0, 5, 2, 10, 10, 10, 9, 1, 2, 7, 3, 10, 6, 6, -2 };
        int[] moveCol = { -1, 0, 1, 0, 0, 0, -1, 0, -1, -1, 1, 0, -1, 1, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, -1, 0, 1, 0, 1, -1, 0, 0, -1, -1, 1, 0, -1, 0, 0 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case74() {
        String[] maze = { "X.X.X....XXXXXX.X..XXXXX..XX.XXXXXXX.", "XX.XXX.XXX.X..XXXX.XXX.XX.X.X..X.XX.X", "XX..X.XX..XXX..XXX...X.X.XX.X.XX.X.X.", "..XX.XX....XXX.XX.X.XXXXX.XXXX.XX....", "XXXX.XXX.XXX..XX.X...X.X.X.X...X...XX", ".XXXXXXX...X...XXX.XXXXX..X..X.XXXX.X", ".XXX...XXX.X.X.XX.XXX..X......XX...X.", ".XXX.X.X.XX.XXX...X......X....X..XX.X", "...X....X.X..X..XX.X.XXXXX...XX.XXXXX", "..XX.X.X....XXX.X..XX..XX..X..X..XXX.", "XXXXX..XX...X..XXX....XX.XX....XXXXXX", ".X.X.X.XX..X.X..XXXXX.XXX.X.XXX.X..XX", "..X.XX...X.XXXXXXXX.X...X...X....X...", ".........X.....X...X.X..XX.XXXXXX....", "X..X.X.X......X..X.X...X.XX.X.X.XX..X", "X.XX...XX..X.X.X.XXXX.XXX.X..X.X.X..X", "X.X....X.XX...XX.....XX..XX.X.X.XXXX.", "...XXX..XX.X..X.....XXXXX.XXXX.X..X.X", "XXX..XX.X...XX...X..XXX..XXXX...X..X.", "XXXXX..X.XX..X.XXXX.X...X..XX.XXX.XX.", "X...XX...X.XXX.X.XX..X...XXXXX..XXXXX", "...X.XXX.XX..X..XX..XXXX..X..X.X.XX.X", ".X...X.X.XX.X..XX.X.XX..XXXX.X....XX.", "..XX...X....XX.XX...X.......X.X.....X", "X.XXXX.XXX.X.X.X...XX.XX.XXX.X..XXXXX", "X....XXXX..X.XX.XX.XXX..XXXX...X.XXX.", "X...X....XX.....X..XXX..X.XXXXXX.XXXX", "XXXXXXX.X.XX.X..X.X..XX..XX...XXXXX.X", "X.XXX.XX.X.XXXX.XXX.....XX.X.XXX...X.", "...X..XXX..X.X....XX.XXXX.X.X..XXXX..", "XX.X...X..XXX.XX.X...X.X...XXXX.X...X", ".X..XXXX..XX.XX......X...X.X.X.X.XX.X", "XX..X..X.X..X.X..X.XX.XXX.X.X..XX.X..", "X..X...XX.X..X.XXX....X.XX.X.XXX....X", ".XX..XXX.........X.XX.X.X..XXX.XXX.XX", "X..XX..XX..XXXXX..X...X.XXX.X.X.XX.X.", ".XX.X.XX.....X...X.X..X.XX.XX.X.....X", "XXX..X.......XX.X.XXX....X.XX.XXXXX..", "XXXX.XX.X..XX..X.XX....XX....XX.X.XXX", ".XX...XXX.XXXX.XX.XXXX.XX...X.X.X.X..", "X..XX.XXXX.X..XXXX.X.XXXX.XXXX...X...", "XX..X...X....XX.XX....X.X...XX..XX...", "X.....XX.X...XX.XX.X.X..X...XX...X..X", "...X.X.XX....X..XX.X.XX...X....X....X", "X..XX...XXX.XXX.XX...X..X...X.X.XXXX.", "X...XX.XX.......XX.XX...XX....X.X...X", ".X.X...X..X.XXXXX.XXXX.X.X.X.X.....XX", "..X.XXX.X...X...XXX..X.XXXX.X.....X..", "X..XXX.XX..XX.X.XX......XX..XX..X.XXX", "...X.X...XX.XXXXX.XX......XXXX.XX.X.X" };
        int startRow = 26;
        int startCol = 1;
        int[] moveRow = { -22, 21, -35, -23, -6, 6, 21, 17, 28, 17, 16, 41, 9, 42, 38, 18, 38, 6, 23, 48, 35, 44, 35, 1, 23, 46, 17, 23, 31, 25, 36, 17, 42, 10, 39, 34, 11, 39, 26, 7, 5, 2, 6, 43, 16, 47, 10, 39, 1, 7 };
        int[] moveCol = { 31, 10, -3, 9, -9, 0, -9, 5, -12, 4, 24, -19, 0, 3, -23, 5, 32, -18, 21, -5, 9, -24, 30, -21, 5, -1, 12, 9, 24, 14, -12, -16, -17, -20, -5, 9, -20, -4, 2, -2, 11, 30, 26, -6, -13, -19, -25, 19, 4, 5 };
        assertEquals(8, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case75() {
        String[] maze = { ".XX.X.X....XXX.XXXX.X.XX..X.X.XX.X.X..X..XXXX.X...", "XX.XXX..XXXX...X....XXX..X..X..XXX.X.XX.X.....X.X.", "X.X...X.X..XX.X.XXX.XXX.X.X.XX..XXXX..X.X....X...X", ".XX..XX..XXX.X...XXX.X...X..X..XX.XXXX.X.XX...XX..", ".....XXX..XXX.......X.X.X..XXX.X.X.X.XX.X...XXXXXX", "XXX..X..X.XX.XXXXX.X.XX..XXX.X.X..XXX.XXXXXXXXXXX.", ".XXX.X..XX.....XXX....XX.X....XX......X..XXX....X.", ".XX.XXX..X..X..X.XXXXX.....XXX..XX.XX..X.XXX.XX.X.", ".XXXX.XXX.....XX.XXX.X.XX....XXX.X.X..XXXX.X.X.XXX", "...X.X..X...X.XX...X.XXX..XX.XXX.X...X..XX.X...XXX", ".X.X.XXX.X.XXX...XX...XX..XX...X.XXX..X...XXX.X...", ".XX.XX..X.XXXX.......X....X.XXXX..XXX.XX...X....XX", ".XX.XXXX.X.XXXX..XXX.XX.X....XX...XX......XX.XX.X.", ".X...XXXX..X.XXXXXX....XX.X...XX...XXX.XXXXX..XXXX", "X.XXX..X..X..XXXX.XXX.X........XXXX.X.....X..XX.X.", "XX.XXX..XXXXX..X..X.X...X.X.X..XXX...X..X.XX..XXX.", ".XXXXX.XXX.XX..XXX..X.X..X.XX..X.XXX.XXXX.X.X.XXX." };
        int startRow = 16;
        int startCol = 18;
        int[] moveRow = { -9, -7, 4, 7, -2, 2, 2, 5, 0, 2, 1, 0, 4, 11, 2, 12, 0, 13, 5, 9, 3, 5, 10, 9, 14, 15, 4, 0, 12, 0, 9, 8, 13, 11, 16, 6, 1, 5, 2, 2, 16, 14, 10, 14, 10, 12, 6, 16, 13, 7 };
        int[] moveCol = { -11, 20, -4, -15, 15, -15, -34, 33, -11, -3, 24, 11, 5, 34, -23, 0, 3, -8, 5, 5, 32, -10, 29, 7, 20, 7, 40, 26, 30, 20, 13, 25, 17, 11, 22, 4, 22, 4, 4, 30, 9, 22, 6, 31, 36, 39, 43, 11, 41, 41 };
        assertEquals(7, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case76() {
        String[] maze = { ".X.X.X.X.X.X.XXX.XXXXX...XXX.XXXXXX", "XX....X..X.X...X.XXXXX.X.XXXX...X.X", "X...XX...X.X.XXX.XXXX.XX..X....X.XX", ".XX.....X...XX.XX.XXXXX...X.X..XXX.", ".X.....X...XX.XX.X.X.X...X...X.XXXX", "...X......XXXXXX..XX.X.XX.XXXXX...X", "..X.XXXX.X.XX...X.XXXX..X..X....X.X", "X......XX.....X....XXX..X..X.......", ".X....XX.XXXXX.X...XX.X..XX.X.XX...", "..XX...X..X..X.XX...XX...XX.X.XX...", "...X..X.X.XXX..XX.XXX.XXXXX.....XXX", "X...XXX.XXX.XXXX..X.X.X.X...XXXXX.X", "XXX.XX..XXXXX..X.XX.X.X..XX..XXX..X", "...X...XX..XXX.X.X....XXX...XXXXX..", ".X.XXXX.XXX.XXXX.XX..X.X....X.X..XX", "X.XXX..X.X.XXX...XXXX.XXXXXXX......", "X.XX....XX.X.XXX.XX.XXX.X..XXXX.XX.", "XXXXX.X.XXX.X.X...X......X.XXXXX..X", ".X....XXX..X.XX....X.X.X...XX.X....", "..XX.X.X.XX.X...XX..XX.XXX......XXX", "X.....XXX.XX.XX.X...XX...XXX....X.X", "X.......X...XX..X...X..X.XX.X..XX.." };
        int startRow = 10;
        int startCol = 13;
        int[] moveRow = { 5, 5, 11, -15, -17, -4, 19, -13, 17, 8, 6, 5, -2, 2, 16, -1, 6, 8, 11, 5, 13, 19, 10, 2, 5, 10, 15, 5, 4, 20, 16, 16, 6, 8, 18, 2, 1, 13, 17, 8, 17, 0, 10, 7, 8, 0, 18, 10, 18, 15 };
        int[] moveCol = { 20, -9, -8, -27, -17, -17, 7, -3, -3, -27, -14, -2, -17, -13, 34, 0, -6, -2, -26, -12, 2, -9, 33, -7, 4, -1, 32, 1, -5, -12, -4, 6, -3, -14, 18, -16, 20, 10, 5, -4, 14, 25, 23, 22, 11, 28, 20, 11, 24, 10 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case77() {
        String[] maze = { ".....", ".....", ".....", "....." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 1, 0, -1, 0 };
        int[] moveCol = { 0, 0, 1, 0, -1 };
        assertEquals(7, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case78() {
        String[] maze = { ".." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0 };
        int[] moveCol = { 0 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case79() {
        String[] maze = { ".XX.X.XX.X.XX.X.XX.XX." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 1, 0, 2, 0, 0 };
        int[] moveCol = { 2, -3, 3, 4, -3, -2 };
        assertEquals(8, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case80() {
        String[] maze = { "..X.X.X.X.X.X." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 2, 0, -2, 0 };
        int[] moveCol = { 0, 2, 0, -2 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case81() {
        String[] maze = { "...........................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".........................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.....................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.............................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.........................X.X.X.X.X.", ".X.X.X.X...........................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X...............................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X...................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.......................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "..........................................." };
        int startRow = 17;
        int startCol = 40;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(273, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case82() {
        String[] maze = { "..................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "................................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X............................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X........................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X....................................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X................................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X............................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X........................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X....................X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X................X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X............X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.XXXXXXXXXX.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X........X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X......X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.XXXXXXXX.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X..........X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.XXXXXXXXXXXX.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X..............X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X..................X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X......................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X..........................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X..............................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X..................................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X......................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X..........................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X..............................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".................................................." };
        int startRow = 18;
        int startCol = 24;
        int[] moveRow = { 0, 1, 0, -1, 1, -1, -1, 1 };
        int[] moveCol = { 1, 0, -1, 0, 1, -1, 1, -1 };
        assertEquals(1086, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case83() {
        String[] maze = { "...............", "XXXXXXXXXXXXXX.", ".............X.", ".XXXXXXXXXXX.X.", ".X.........X.X.", ".X.XXXXXXX.X.X.", ".X.X.....X.X.X.", ".X.X.XXX.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X...X.X.X.", ".X.X.XXXXX.X.X.", ".X.X.......X.X.", ".X.XXXXXXXXX.X.", ".X...........X.", ".XXXXXXXXXXXXX.", "..............." };
        int startRow = 28;
        int startCol = 12;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(184, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case84() {
        String[] maze = { ".............................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "...........................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.......................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X...................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X...............X.X.X.X.", ".X.X.X.................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.....................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.........................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXX.", "............................." };
        int startRow = 0;
        int startCol = 17;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(229, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case85() {
        String[] maze = { "..............", "XXXXXXXXXXXXX.", "............X.", ".XXXXXXXXXX.X.", ".X........X.X.", ".X.XXXXXX.X.X.", ".X.X....X.X.X.", ".X.X.XX.X.X.X.", ".X.X.X..X.X.X.", ".X.X.X..X.X.X.", ".X.X.X..X.X.X.", ".X.X.X..X.X.X.", ".X.X.XXXX.X.X.", ".X.X......X.X.", ".X.XXXXXXXX.X.", ".X..........X.", ".XXXXXXXXXXXX.", ".............." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(139, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case86() {
        String[] maze = { "...........", "XXXXXXXXXX.", ".........X.", ".XXXXXXX.X.", ".X.....X.X.", ".X.XXX.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X.X.X.X.", ".X.X...X.X.", ".X.XXXXX.X.", ".X.......X.", ".XXXXXXXXX.", "..........." };
        int startRow = 20;
        int startCol = 4;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(266, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case87() {
        String[] maze = { ".......................", "XXXXXXXXXXXXXXXXXXXXXX.", ".....................X.", ".XXXXXXXXXXXXXXXXXXX.X.", ".X.................X.X.", ".X.XXXXXXXXXXXXXXX.X.X.", ".X.X.............X.X.X.", ".X.X.XXXXXXXXXXX.X.X.X.", ".X.X.X.........X.X.X.X.", ".X.X.X.XXXXXXX.X.X.X.X.", ".X.X.X.X.....X.X.X.X.X.", ".X.X.X.X.XXX.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X...X.X.X.X.X.", ".X.X.X.X.XXXXX.X.X.X.X.", ".X.X.X.X.......X.X.X.X.", ".X.X.X.XXXXXXXXX.X.X.X.", ".X.X.X...........X.X.X.", ".X.X.XXXXXXXXXXXXX.X.X.", ".X.X...............X.X.", ".X.XXXXXXXXXXXXXXXXX.X.", ".X...................X.", ".XXXXXXXXXXXXXXXXXXXXX.", "......................." };
        int startRow = 16;
        int startCol = 2;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(212, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case88() {
        String[] maze = { ".............................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "...........................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.......................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X...................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X...............................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X...........................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X.......................X.X.X.X.X.X.", ".X.X.X.X.X.........................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.............................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.....................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.........................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "............................................." };
        int startRow = 19;
        int startCol = 11;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(332, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case89() {
        String[] maze = { "................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "..............................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X..........................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X......................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X..................................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X..............................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X..........................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X......................X.X.X.X.X.X.X.", ".X.X.X.X.X.X........................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X............................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X................................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X....................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X........................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X............................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "................................................" };
        int startRow = 14;
        int startCol = 26;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(684, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case90() {
        String[] maze = { ".......................", "XXXXXXXXXXXXXXXXXXXXXX.", ".....................X.", ".XXXXXXXXXXXXXXXXXXX.X.", ".X.................X.X.", ".X.XXXXXXXXXXXXXXX.X.X.", ".X.X.............X.X.X.", ".X.X.XXXXXXXXXXX.X.X.X.", ".X.X.X.........X.X.X.X.", ".X.X.X.XXXXXXX.X.X.X.X.", ".X.X.X.X.....X.X.X.X.X.", ".X.X.X.X.XXX.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X...X.X.X.X.X.", ".X.X.X.X.XXXXX.X.X.X.X.", ".X.X.X.X.......X.X.X.X.", ".X.X.X.XXXXXXXXX.X.X.X.", ".X.X.X...........X.X.X.", ".X.X.XXXXXXXXXXXXX.X.X.", ".X.X...............X.X.", ".X.XXXXXXXXXXXXXXXXX.X.", ".X...................X.", ".XXXXXXXXXXXXXXXXXXXXX.", "......................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(298, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case91() {
        String[] maze = { "...............", "XXXXXXXXXXXXXX.", ".............X.", ".XXXXXXXXXXX.X.", ".X.........X.X.", ".X.XXXXXXX.X.X.", ".X.X.....X.X.X.", ".X.X.X...X.X.X.", ".X.X.XXXXX.X.X.", ".X.X.......X.X.", ".X.XXXXXXXXX.X.", ".X...........X.", ".XXXXXXXXXXXXX.", "..............." };
        int startRow = 12;
        int startCol = 0;
        int[] moveRow = { 0, 1, 0, -1, 1, -1, -1, 1 };
        int[] moveCol = { 1, 0, -1, 0, 1, -1, 1, -1 };
        assertEquals(65, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case92() {
        String[] maze = { ".........................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".......................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X...................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X...............................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X...........................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.......................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X...................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X...............X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X...........X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.........X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.............X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X.................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X.....................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.........................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.............................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.....................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "........................................." };
        int startRow = 27;
        int startCol = 13;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(460, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case93() {
        String[] maze = { ".............", "XXXXXXXXXXXX.", "...........X.", ".XXXXXXXXX.X.", ".X.......X.X.", ".X.XXXXX.X.X.", ".X.X...X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.XXX.X.X.", ".X.X.....X.X.", ".X.XXXXXXX.X.", ".X.........X.", ".XXXXXXXXXXX.", "............." };
        int startRow = 16;
        int startCol = 9;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(83, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case94() {
        String[] maze = { ".....................", "XXXXXXXXXXXXXXXXXXXX.", "...................X.", ".XXXXXXXXXXXXXXXXX.X.", ".X...............X.X.", ".X.XXXXXXXXXXXXX.X.X.", ".X.X...........X.X.X.", ".X.X.XXXXXXXXX.X.X.X.", ".X.X.X.......X.X.X.X.", ".X.X.X.XXXXX.X.X.X.X.", ".X.X.X.X...X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.XXX.X.X.X.X.", ".X.X.X.X.....X.X.X.X.", ".X.X.X.XXXXXXX.X.X.X.", ".X.X.X.........X.X.X.", ".X.X.XXXXXXXXXXX.X.X.", ".X.X.............X.X.", ".X.XXXXXXXXXXXXXXX.X.", ".X.................X.", ".XXXXXXXXXXXXXXXXXXX.", "....................." };
        int startRow = 31;
        int startCol = 20;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(409, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case95() {
        String[] maze = { "......................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "....................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X............................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X........................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X....................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X............X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X........X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X....X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XX.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X..X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X......X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X..........X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X..............X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X..................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X......................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X..........................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X..............................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X..................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "......................................" };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(778, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case96() {
        String[] maze = { "....................", "XXXXXXXXXXXXXXXXXXX.", "..................X.", ".XXXXXXXXXXXXXXXX.X.", ".X..............X.X.", ".X.XXXXXXXXXXXX.X.X.", ".X.X..........X.X.X.", ".X.X.XXXXXXXX.X.X.X.", ".X.X.X......X.X.X.X.", ".X.X.X.XXXX.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X.XX.X.X.X.X.", ".X.X.X.X....X.X.X.X.", ".X.X.X.XXXXXX.X.X.X.", ".X.X.X........X.X.X.", ".X.X.XXXXXXXXXX.X.X.", ".X.X............X.X.", ".X.XXXXXXXXXXXXXX.X.", ".X................X.", ".XXXXXXXXXXXXXXXXXX.", "...................." };
        int startRow = 17;
        int startCol = 15;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(212, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case97() {
        String[] maze = { "...............", "XXXXXXXXXXXXXX.", ".............X.", ".XXXXXXXXXXX.X.", ".X.........X.X.", ".X.XXXXXXX.X.X.", ".X.X.....X.X.X.", ".X.X.XXX.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X...X.X.X.", ".X.X.XXXXX.X.X.", ".X.X.......X.X.", ".X.XXXXXXXXX.X.", ".X...........X.", ".XXXXXXXXXXXXX.", "..............." };
        int startRow = 27;
        int startCol = 1;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(176, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case98() {
        String[] maze = { "...................", "XXXXXXXXXXXXXXXXXX.", ".................X.", ".XXXXXXXXXXXXXXX.X.", ".X.............X.X.", ".X.XXXXXXXXXXX.X.X.", ".X.X.........X.X.X.", ".X.X.XXXXXXX.X.X.X.", ".X.X.X.....X.X.X.X.", ".X.X.X.XXX.X.X.X.X.", ".X.X.X.X...X.X.X.X.", ".X.X.X.XXXXX.X.X.X.", ".X.X.X.......X.X.X.", ".X.X.XXXXXXXXX.X.X.", ".X.X...........X.X.", ".X.XXXXXXXXXXXXX.X.", ".X...............X.", ".XXXXXXXXXXXXXXXXX.", "..................." };
        int startRow = 12;
        int startCol = 11;
        int[] moveRow = { 0, 1, 0, -1, 1, -1, -1, 1 };
        int[] moveCol = { 1, 0, -1, 0, 1, -1, 1, -1 };
        assertEquals(167, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case99() {
        String[] maze = { "...................", "XXXXXXXXXXXXXXXXXX.", ".................X.", ".XXXXXXXXXXXXXXX.X.", ".X.............X.X.", ".X.XXXXXXXXXXX.X.X.", ".X.X.........X.X.X.", ".X.X.XXXXXXX.X.X.X.", ".X.X.X.....X.X.X.X.", ".X.X.X.XXX.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.", ".X.X.X.X...X.X.X.X.", ".X.X.X.XXXXX.X.X.X.", ".X.X.X.......X.X.X.", ".X.X.XXXXXXXXX.X.X.", ".X.X...........X.X.", ".X.XXXXXXXXXXXXX.X.", ".X...............X.", ".XXXXXXXXXXXXXXXXX.", "..................." };
        int startRow = 6;
        int startCol = 7;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(307, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case100() {
        String[] maze = { ".....................", "XXXXXXXXXXXXXXXXXXXX.", "...................X.", ".XXXXXXXXXXXXXXXXX.X.", ".X...............X.X.", ".X.XXXXXXXXXXXXX.X.X.", ".X.X...........X.X.X.", ".X.X.XXXXXXXXX.X.X.X.", ".X.X.X.......X.X.X.X.", ".X.X.X.XXXXX.X.X.X.X.", ".X.X.X.X...X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.XXX.X.X.X.X.", ".X.X.X.X.....X.X.X.X.", ".X.X.X.XXXXXXX.X.X.X.", ".X.X.X.........X.X.X.", ".X.X.XXXXXXXXXXX.X.X.", ".X.X.............X.X.", ".X.XXXXXXXXXXXXXXX.X.", ".X.................X.", ".XXXXXXXXXXXXXXXXXXX.", "....................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(438, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case101() {
        String[] maze = { "....................", "XXXXXXXXXXXXXXXXXXX.", "..................X.", ".XXXXXXXXXXXXXXXX.X.", ".X..............X.X.", ".X.XXXXXXXXXXXX.X.X.", ".X.X..........X.X.X.", ".X.X.XXXXXXXX.X.X.X.", ".X.X.X......X.X.X.X.", ".X.X.X.XXXX.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X..X.X.X.X.X.", ".X.X.X.X.XX.X.X.X.X.", ".X.X.X.X....X.X.X.X.", ".X.X.X.XXXXXX.X.X.X.", ".X.X.X........X.X.X.", ".X.X.XXXXXXXXXX.X.X.", ".X.X............X.X.", ".X.XXXXXXXXXXXXXX.X.", ".X................X.", ".XXXXXXXXXXXXXXXXXX.", "...................." };
        int startRow = 13;
        int startCol = 13;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(260, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case102() {
        String[] maze = { ".............................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "...........................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.......................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X...................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X...............................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X...........................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X.......................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X...................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X...............X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X...........X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.........X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.............X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X.....................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X.........................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.............................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.....................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.........................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "............................................." };
        int startRow = 4;
        int startCol = 35;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(552, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case103() {
        String[] maze = { "...............................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".............................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.........................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.....................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.............X.X.X.X.X.", ".X.X.X.X...............X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X...................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.......................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X...........................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "..............................." };
        int startRow = 12;
        int startCol = 2;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(170, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case104() {
        String[] maze = { "..................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "................................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X............................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X........................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X....................................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X................................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X............................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X........................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X....................X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X................X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X............X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.XXXXXXXXXX.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X........X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.XXXXXX.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X....X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X..X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.XXXX.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X......X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.XXXXXXXX.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X..........X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.XXXXXXXXXXXX.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X..............X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X..................X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X......................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X..........................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X..............................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X..................................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X......................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X..........................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X..............................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".................................................." };
        int startRow = 37;
        int startCol = 14;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(1009, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case105() {
        String[] maze = { "..................................................", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "................................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X............................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X........................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X....................................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X................................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X............................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X........................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X....................X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X................X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X............X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.XXXXXXXXXX.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X........X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.XXXXXX.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X....X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X..X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.XXXX.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X......X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.XXXXXXXX.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X..........X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.XXXXXXXXXXXX.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X..............X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X..................X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X......................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X..........................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X..............................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X..................................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X......................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X..........................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X..............................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".................................................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 1, 0, -1, 1, -1, -1, 1 };
        int[] moveCol = { 1, 0, -1, 0, 1, -1, 1, -1 };
        assertEquals(1249, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case106() {
        String[] maze = { ".X...........", ".X.XXXXXXXXX.", ".X.X.......X.", ".X.X.XXXXX.X.", ".X.X.X...X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.X.X.X.X.", ".X.X.XXX.X.X.", ".X.X.....X.X.", ".X.XXXXXXX.X.", ".X.........X.", ".XXXXXXXXXXX.", "............." };
        int startRow = 23;
        int startCol = 6;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(317, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case107() {
        String[] maze = { ".X...................................", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".X.X...............................X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.X.X...........................X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.X.X.......................X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.X.X...................X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.X.X...............X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X.X.X...........X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.......X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.....X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.........X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X.............X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X.................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.....................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.........................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.............................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "....................................." };
        int startRow = 10;
        int startCol = 17;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(557, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case108() {
        String[] maze = { ".X.............", ".X.XXXXXXXXXXX.", ".X.X.........X.", ".X.X.XXXXXXX.X.", ".X.X.X.....X.X.", ".X.X.X.XXX.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X...X.X.X.", ".X.X.XXXXX.X.X.", ".X.X.......X.X.", ".X.XXXXXXXXX.X.", ".X...........X.", ".XXXXXXXXXXXXX.", "..............." };
        int startRow = 12;
        int startCol = 0;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(266, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case109() {
        String[] maze = { ".X........................", ".X.XXXXXXXXXXXXXXXXXXXXXX.", ".X.X....................X.", ".X.X.XXXXXXXXXXXXXXXXXX.X.", ".X.X.X................X.X.", ".X.X.X.XXXXXXXXXXXXXX.X.X.", ".X.X.X.X............X.X.X.", ".X.X.X.X.XXXXXXXXXX.X.X.X.", ".X.X.X.X.X........X.X.X.X.", ".X.X.X.X.X.XXXXXX.X.X.X.X.", ".X.X.X.X.X.X....X.X.X.X.X.", ".X.X.X.X.X.X.XX.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.X..X.X.X.X.X.X.", ".X.X.X.X.X.XXXX.X.X.X.X.X.", ".X.X.X.X.X......X.X.X.X.X.", ".X.X.X.X.XXXXXXXX.X.X.X.X.", ".X.X.X.X..........X.X.X.X.", ".X.X.X.XXXXXXXXXXXX.X.X.X.", ".X.X.X..............X.X.X.", ".X.X.XXXXXXXXXXXXXXXX.X.X.", ".X.X..................X.X.", ".X.XXXXXXXXXXXXXXXXXXXX.X.", ".X......................X.", ".XXXXXXXXXXXXXXXXXXXXXXXX.", ".........................." };
        int startRow = 4;
        int startCol = 4;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(313, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case110() {
        String[] maze = { ".X................", ".X.XXXXXXXXXXXXXX.", ".X.X............X.", ".X.X.XXXXXXXXXX.X.", ".X.X.X........X.X.", ".X.X.X......X.X.X.", ".X.X.XXXXXXXX.X.X.", ".X.X..........X.X.", ".X.XXXXXXXXXXXX.X.", ".X..............X.", ".XXXXXXXXXXXXXXXX.", ".................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(119, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case111() {
        String[] maze = { ".X.............", ".X.XXXXXXXXXXX.", ".X.X.........X.", ".X.X.XXXXXXX.X.", ".X.X.X.....X.X.", ".X.X.X.XXX.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X...X.X.X.", ".X.X.XXXXX.X.X.", ".X.X.......X.X.", ".X.XXXXXXXXX.X.", ".X...........X.", ".XXXXXXXXXXXXX.", "..............." };
        int startRow = 24;
        int startCol = 10;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(208, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case112() {
        String[] maze = { ".X.......................", ".X.XXXXXXXXXXXXXXXXXXXXX.", ".X.X...................X.", ".X.X.XXXXXXXXXXXXXXXXX.X.", ".X.X.X...............X.X.", ".X.X.X.XXXXXXXXXXXXX.X.X.", ".X.X.X.X...........X.X.X.", ".X.X.X.X.XXXXXXXXX.X.X.X.", ".X.X.X.X.X.......X.X.X.X.", ".X.X.X.X.X.XXXXX.X.X.X.X.", ".X.X.X.X.X.X...X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.XXX.X.X.X.X.X.", ".X.X.X.X.X.....X.X.X.X.X.", ".X.X.X.X.XXXXXXX.X.X.X.X.", ".X.X.X.X.........X.X.X.X.", ".X.X.X.XXXXXXXXXXX.X.X.X.", ".X.X.X.............X.X.X.", ".X.X.XXXXXXXXXXXXXXX.X.X.", ".X.X.................X.X.", ".X.XXXXXXXXXXXXXXXXXXX.X.", ".X.....................X.", ".XXXXXXXXXXXXXXXXXXXXXXX.", "........................." };
        int startRow = 18;
        int startCol = 24;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(370, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case113() {
        String[] maze = { ".X.................................", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".X.X.............................X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.X.X.........................X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.X.X.....................X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.X.X.................X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.X.X.............X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X.X.X.........X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.....X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X...X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.......X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X...........X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X...............X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X...................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.......................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X...........................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X...............................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "..................................." };
        int startRow = 15;
        int startCol = 2;
        int[] moveRow = { 0, 1, 0, -1, 1, -1, -1, 1 };
        int[] moveCol = { 1, 0, -1, 0, 1, -1, 1, -1 };
        assertEquals(643, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case114() {
        String[] maze = { ".X.............", ".X.XXXXXXXXXXX.", ".X.X.........X.", ".X.X.XXXXXXX.X.", ".X.X.X.....X.X.", ".X.X.X.XXX.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.", ".X.X.X...X.X.X.", ".X.X.XXXXX.X.X.", ".X.X.......X.X.", ".X.XXXXXXXXX.X.", ".X...........X.", ".XXXXXXXXXXXXX.", "..............." };
        int startRow = 35;
        int startCol = 8;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(361, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case115() {
        String[] maze = { ".X..................................", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".X.X..............................X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.X.X..........................X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.X.X......................X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.X.X..................X.X.X.X.", ".X.X.X.X.X................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X....................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X........................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X............................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "...................................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(379, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case116() {
        String[] maze = { ".X..........................................", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".X.X......................................X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.X.X..................................X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.X.X..............................X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.X.X..........................X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.X.X......................X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X.X.X..................X.X.X.X.X.X.", ".X.X.X.X.X.X.X................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X....................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X........................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X............................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X....................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X........................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", "............................................" };
        int startRow = 27;
        int startCol = 36;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(580, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case117() {
        String[] maze = { ".X........................................", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".X.X....................................X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.X.X................................X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.X.X............................X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.X.X........................X.X.X.X.", ".X.X.X.X..........................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X..............................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X..................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X......................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".........................................." };
        int startRow = 13;
        int startCol = 4;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(225, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case118() {
        String[] maze = { ".X............................................", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".X.X........................................X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.X.X....................................X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.X.X................................X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.X.X............................X.X.X.X.", ".X.X.X.X..............................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X..................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X......................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X..........................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".............................................." };
        int startRow = 9;
        int startCol = 9;
        int[] moveRow = { 0, 1, 0, -1, 1, -1, -1, 1 };
        int[] moveCol = { 1, 0, -1, 0, 1, -1, 1, -1 };
        assertEquals(385, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case119() {
        String[] maze = { ".X................................................", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".X.X............................................X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.X.X........................................X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.X.X....................................X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.X.X................................X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.X.X............................X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X.X.X........................X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X....................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X................X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.XXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X............X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.XXXXXXXXXX.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X........X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.XXXXXX.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X....X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.XX.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X..X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X..X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.XXXX.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X......X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.XXXXXXXX.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X..........X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.XXXXXXXXXXXX.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X..............X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X..................X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X......................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X..........................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X..............................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X..................................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X......................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X..........................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X..............................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".................................................." };
        int startRow = 49;
        int startCol = 7;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(1242, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case120() {
        String[] maze = { ".X................................................", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".X.X............................................X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X.X.X........................................X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X.X.X....................................X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X.X.X................................X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X.X.X............................X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X.X.X........................X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X....................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X................X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.XXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X............X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.XXXXXXXXXX.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X........X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.XXXXXX.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X....X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.XX.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X..X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X..X.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.XXXX.X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X......X.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.XXXXXXXX.X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X..........X.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.XXXXXXXXXXXX.X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X..............X.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.XXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X..................X.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.", ".X.X.X.X.X.X.X......................X.X.X.X.X.X.X.", ".X.X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.", ".X.X.X.X.X.X..........................X.X.X.X.X.X.", ".X.X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.X.", ".X.X.X.X.X..............................X.X.X.X.X.", ".X.X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.X.", ".X.X.X.X..................................X.X.X.X.", ".X.X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.X.", ".X.X.X......................................X.X.X.", ".X.X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.X.", ".X.X..........................................X.X.", ".X.XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.X.", ".X..............................................X.", ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.", ".................................................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(1298, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case121() {
        String[] maze = { ".......", "X.X.X..", "XXX...X", "....X..", "X....X.", "......." };
        int startRow = 5;
        int startCol = 0;
        int[] moveRow = { 1, 0, -1, 0, -2, 1 };
        int[] moveCol = { 0, -1, 0, 1, 3, 0 };
        assertEquals(7, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case122() {
        String[] maze = { "...", "...", "..." };
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(3, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case123() {
        String[] maze = { "..X.X.X.X.X.X." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 2, 0, -2, 0 };
        int[] moveCol = { 0, 2, 0, -2 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case124() {
        String[] maze = { ".......", "..X.X..", ".XX...X", "....X..", "X....X.", "......." };
        int startRow = 5;
        int startCol = 0;
        int[] moveRow = { 1, 0, -1, 0, -2, 1 };
        int[] moveCol = { 0, -1, 0, 1, 3, 0 };
        assertEquals(7, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case125() {
        String[] maze = { "...", "...", "..." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 1, 0, -1 };
        int[] moveCol = { 1, 0, -1, 0 };
        assertEquals(4, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case126() {
        String[] maze = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int startRow = 49;
        int startCol = 49;
        int[] moveRow = { 0, 0, -1, 1 };
        int[] moveCol = { 1, -1, 0, 0 };
        assertEquals(98, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case127() {
        String[] maze = { "...", "...", "..." };
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = { 50, 0, -50, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case128() {
        String[] maze = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int startRow = 2;
        int startCol = 0;
        int[] moveRow = { 1, 0, -1, 0, 0, -1 };
        int[] moveCol = { 0, -1, 0, 1, 3, 0 };
        assertEquals(64, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case129() {
        String[] maze = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 1 };
        int[] moveCol = { 1, -49 };
        assertEquals(2449, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case130() {
        String[] maze = { "...X..............X........................X......", "......X......X.X.....X.........XX.......X...X....X", "....X..XX..X.X....X....XX......X............X..X.X", "......X.X.X....X.X..............X..............X..", "...X................................XX............", "............X................XX........XX........X", "XX.X...X..............X............X..............", "............X.............X....X...X.........X....", "...........X.....XX.............X....X............", ".......X....................X....X................", "...X.............XX....................X..........", ".......................X.......X.......X.....X....", "...X................X...X...........X.X.X......X..", "...X.............X.X....X...X...XX..X.........X..X", "....X......X.....XX....X.........X........X.......", "............X.X............X............X.........", "...............X......X.....X....X................", "................X................X..X..X..........", "...........X...........X..X......XX..X............", "X.X.X......X............................X.........", "....X.............X......X........................", "...X..X.....X.....X...................X......X....", "..........X.......X.X.........X...X.X......X..X...", "...........X..X.........................X..X......", "..........X..X.........X..........................", "..........X.....X....................X.....X......", "..........X....X....X.......X......X..............", "...X..X....X...............X....................X.", ".......X......X...X...............................", ".X.....X.......X.X................................", "................X.X.......X..X......XX......XX..X.", "..X.................X.............................", "..................X........................X......", ".......X....X.....................X...X.......XX..", ".....X..........X...........X....................X", "........XX.....X...............X...X..........X...", "...XX............X......X.........X...............", "...X.....X......X....XXX......X......X..XX.....X..", "X.....X...X..............................X......X.", "......X.X...........X.X......X....................", "....X.............................X.........X.....", "X.....X.........X...............X.................", ".X.......X..........X....X........................", ".........................X...X.......X..X......X..", "......X..........X.......X...........X............", "..........X..........X....X...........X..X....X...", ".X..X.X......X.X....X.....................X..X....", "..X.X.............X.XX..X....X.X.....X............", "....X............X..............................X.", "..X...............X.....XX.......X................" };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 1, -12, 43, 41, -16, 37, -15, 23, -49, 46, 5, 21, 38, 36, 46, -7, -6, 1, 37, 37, -26, 24, 8, 25, -23, 5, -16, 8, -23, -21, 25, -47, -45, 30, 20, 25, -39, 0, -9, 12, 9, 16, 5, 22, 6, -5, -21, 33, 11, 41 };
        int[] moveCol = { -12, -37, -8, 13, 32, 3, -5, -6, 9, 41, 41, 7, -40, 42, 20, 0, -27, 34, -33, -23, 13, 16, 42, 33, 4, 17, 16, -39, 10, 8, -1, -46, 5, 19, 13, 45, 22, -41, 38, -34, 47, 2, -33, 37, -10, 17, -30, -42, -12, 36 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case131() {
        String[] maze = { "XXX", "X.X", "X.X", "XXX" };
        int startRow = 1;
        int startCol = 1;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case132() {
        String[] maze = { "XXX", "..X", "XXX" };
        int startRow = 1;
        int startCol = 0;
        int[] moveRow = { 0 };
        int[] moveCol = { 1 };
        assertEquals(1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case133() {
        String[] maze = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 };
        int[] moveCol = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        assertEquals(11, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case134() {
        String[] maze = { ".X.", "XX.", "..." };
        int startRow = 0;
        int startCol = 2;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case135() {
        String[] maze = { ".", ".", ".", "X", "." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 1 };
        int[] moveCol = { 0 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case136() {
        String[] maze = { "...", "...", ".X." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { -1, 1, 0, 0 };
        int[] moveCol = { 0, 0, -1, 1 };
        assertEquals(4, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case137() {
        String[] maze = { ".", "." };
        int startRow = 1;
        int startCol = 0;
        int[] moveRow = { 1 };
        int[] moveCol = { 1 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case138() {
        String[] maze = { ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", "X....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X", ".....................X" };
        int startRow = 9;
        int startCol = 3;
        int[] moveRow = { 1, 2, 4, -1, 34, 0, 0, 0, 1, 0, -1, 0 };
        int[] moveCol = { 0, 0, 0, 0, 1, -1, 1, 0, 1, 0, -1, 6 };
        assertEquals(12, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case139() {
        String[] maze = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int startRow = 25;
        int startCol = 25;
        int[] moveRow = { 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 1 };
        int[] moveCol = { 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 1, 1 };
        assertEquals(50, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case140() {
        String[] maze = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(98, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case141() {
        String[] maze = { "X.X", "...", "XXX", "X.X" };
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case142() {
        String[] maze = { "..X.X....", ".X.X..X.X", "X.X..X.X." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 1, 1, 1, 0, -1, -1, -1, 0, 2, 2, -2, -2 };
        int[] moveCol = { -1, 0, 1, 1, 1, 0, -1, -1, 1, -1, 1, -1 };
        assertEquals(8, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case143() {
        String[] maze = { ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", "................................................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 1, 0, -1, 0 };
        int[] moveCol = { 0, 1, 0, -1 };
        assertEquals(97, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case144() {
        String[] maze = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1 };
        int[] moveCol = { 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1 };
        assertEquals(49, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case145() {
        String[] maze = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { -50, -40, -30, -20, -10, -25, -45, -49, -44, -1 };
        int[] moveCol = { -50, -40, -30, -20, -10, -1, -1, -49, -49, -49 };
        assertEquals(-1, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case146() {
        String[] maze = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 1, 0 };
        int[] moveCol = { 0, 1 };
        assertEquals(98, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case147() {
        String[] maze = { "...", "...", "..." };
        int startRow = 0;
        int startCol = 0;
        int[] moveRow = { 0, 0, 1, 0, -1 };
        int[] moveCol = { 0, 1, 0, -1, 0 };
        assertEquals(4, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

    @Test
    public void case148() {
        String[] maze = { "X.....X......X....XXX.................X......X....", ".X.....X........X............X..........X........X", "..........X.......X..X....X..X...X.........X......", "..X....X....X............X...X.............X......", "........X...X...XX...........X....................", "........XX.....X.....X...........................X", "......X...................X..X....X.........X.....", "............X...X........X.X..X..X...........X...X", "............................X.X................X..", "..........X......X......X............X.......X...X", "...................X...........X..X.......X.......", "..X...........X.....X.............................", "X.................X.......X.X.................X...", "..........X.......X....X.............X.....X......", "......X.......X..............X........X.X.........", "......X.X...............X................X....X...", ".........X......X....................X............", "...X.................X............................", "....X.....XX..........X.........X.................", "....X...................X...............X...X.....", "............X..X.XX........XX..X.X..XX......X..X..", "...............X...X..X...........X.........X.....", ".............X.........XX....X....................", "...X.....................X.......................X", "........X.X....................X..X.X.............", ".......................X....X.....X..X.....X......", "...............X.......X.................X...X....", "............X..X.X...X......X.....................", "..................................................", ".....X......XX.........X.X............X..........X", ".......X.............X...........X.....X...X...X..", ".........X......X...X................XXX..........", ".XX......XX......X..XX...........................X", "................XX..........X.......X.....X.......", "........................................X.....X...", "......X.....................XX................X.X.", "...X.................X...............X...........X", "..X..........X...............X..X.XX..............", "XX...X............................................", "....................X...............X.X..X........", ".X................................XX.......X......", ".............X....X.....X....X.X..................", ".......................X..........................", ".....X......X.X.X..X...............X......X.......", "............XX......................X..X.........X", ".......X...........X...X.......X..................", "..X...X..X.X.........X........X...................", "...........X......X...............................", ".......X..X......X..X...........X..........X......", ".X.X............X........X...........XX..X........" };
        int startRow = 2;
        int startCol = 0;
        int[] moveRow = { 1, -12, 43, 41, -16, 37, -15, 23, -49, 46, 5, 21, 38, 36, 46, -7, -6, 1, 37, 37, -26, 24, 8, 25, -23, 5, -16, 8, -23, -21, 25, -47, -45, 30, 20, 25, -39, 0, -9, 12, 9, 16, 5, 22, 6, -5, -21, 33, 11, 41 };
        int[] moveCol = { -12, -37, -8, 13, 32, 3, -5, -6, 9, 41, 41, 7, -40, 42, 20, 0, -27, 34, -33, -23, 13, 16, 42, 33, 4, 17, 16, -39, 10, 8, -1, -46, 5, 19, 13, 45, 22, -41, 38, -34, 47, 2, -33, 37, -10, 17, -30, -42, -12, 36 };
        assertEquals(5, mazemaker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }

}
