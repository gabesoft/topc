package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class ColorfulCardsTest {
    ColorfulCards colorfulcards = new ColorfulCards();

    @Test
    public void case1() {
        int N = 5;
        String colors = "RRR";
        assertArrayEquals(new int[] { 2, 3, 5 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case2() {
        int N = 7;
        String colors = "BBB";
        assertArrayEquals(new int[] { 1, 4, 6 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case3() {
        int N = 6;
        String colors = "RBR";
        assertArrayEquals(new int[] { -1, 4, 5 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case4() {
        int N = 58;
        String colors = "RBRRBRBBRBRRBBRRBBBRRBBBRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 17, 18, 19, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, 53 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case5() {
        int N = 495;
        String colors = "RBRRBRBBRBRRBBRRBBBRRBBBRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case6() {
        int N = 2;
        String colors = "R";
        assertArrayEquals(new int[] { 2 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case7() {
        int N = 5;
        String colors = "RB";
        assertArrayEquals(new int[] { -1, 4 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case8() {
        int N = 4;
        String colors = "RRB";
        assertArrayEquals(new int[] { 2, 3, 4 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case9() {
        int N = 7;
        String colors = "BRRB";
        assertArrayEquals(new int[] { 1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case10() {
        int N = 7;
        String colors = "RRBRB";
        assertArrayEquals(new int[] { 2, 3, 4, 5, 6 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case11() {
        int N = 9;
        String colors = "RRRBBB";
        assertArrayEquals(new int[] { 2, 3, 5, 6, 8, 9 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case12() {
        int N = 12;
        String colors = "RBBBBRB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, 11, 12 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case13() {
        int N = 11;
        String colors = "RRRRBBBR";
        assertArrayEquals(new int[] { 2, 3, 5, 7, 8, 9, 10, 11 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case14() {
        int N = 15;
        String colors = "RBRRBBBBR";
        assertArrayEquals(new int[] { -1, 4, 5, 7, 8, 9, 10, 12, 13 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case15() {
        int N = 25;
        String colors = "RRRRRRRRBR";
        assertArrayEquals(new int[] { 2, 3, 5, 7, 11, 13, 17, 19, -1, 23 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case16() {
        int N = 69;
        String colors = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertArrayEquals(new int[] { 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28, 30, 32, 33, 34, 35, 36, 38, 39, 40, 42, 44, 45, 46, 48, 49, 50, 51, 52, 54, 55, 56, 57, 58, 60, 62, 63, 64, 65, 66, 68, 69 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case17() {
        int N = 69;
        String colors = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertArrayEquals(new int[] { 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28, 30, 32, 33, 34, 35, 36, 38, 39, 40, 42, 44, 45, 46, 48, 49, 50, 51, 52, 54, 55, 56, 57, 58, 60, 62, 63, 64, 65, 66, 68, 69 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case18() {
        int N = 69;
        String colors = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertArrayEquals(new int[] { 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28, 30, 32, 33, 34, 35, 36, 38, 39, 40, 42, 44, 45, 46, 48, 49, 50, 51, 52, 54, 55, 56, 57, 58, 60, 62, 63, 64, 65, 66, 68, 69 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case19() {
        int N = 622;
        String colors = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case20() {
        int N = 1000;
        String colors = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case21() {
        int N = 232;
        String colors = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertArrayEquals(new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case22() {
        int N = 231;
        String colors = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertArrayEquals(new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case23() {
        int N = 229;
        String colors = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertArrayEquals(new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case24() {
        int N = 286;
        String colors = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case25() {
        int N = 1000;
        String colors = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case26() {
        int N = 107;
        String colors = "BBBRBBBBRBRRRBRRBRBBRBBBBBBRRRRBBRBRBRBBBRRRRBRBBB";
        assertArrayEquals(new int[] { 1, 4, 6, 7, 8, 9, 10, 12, 13, -1, 17, 19, 23, -1, 29, 31, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, 59, 61, 67, -1, -1, 71, 72, 73, -1, 79, 80, 81, 82, 83, 89, 97, 101, 102, 103, 104, 105, 106 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case27() {
        int N = 109;
        String colors = "RBRBRRRBBBRRBRBBBRBBRBRRBRBBBRRRRBRBBRBRRBRBRRBBBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, -1, 83, 89, -1, 97, -1, 101, 103, 104, 105, 106, 108 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case28() {
        int N = 90;
        String colors = "BRBRRBBRRRBBBBBBRBRRBBBBBBBBBRBBBBBBRBBRBRRBBRBRRB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, 54, 55, 56, 57, 58, 60, 61, -1, -1, 67, -1, 71, 73, -1, -1, 79, -1, 83, 89, 90 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case29() {
        int N = 128;
        String colors = "BRBBRBRBBBRBBBBRRBBRRRRRBRBRRRRRBBBRBBRRBRRRBBRBRB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 113, -1, 127, 128 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case30() {
        int N = 155;
        String colors = "RRBBBBBBRRBRRBRBRRBBRBRRBRRRRRRRRRBRRRRRRBRBBBRBRR";
        assertArrayEquals(new int[] { 2, 3, 4, 6, 8, 9, 10, 12, 13, 17, 18, 19, 23, -1, 29, 30, 31, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case31() {
        int N = 120;
        String colors = "RBRBBRBBBBRBBRBBRRRBBBBRBBRRRRBBRBRBRRBRBBBRRRBBRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case32() {
        int N = 138;
        String colors = "BRBRBRBRRRRRBRBBRRRRBBRBRRBRRRRBBRRRBRRBRRBRBBRBRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, 41, 43, 47, -1, -1, 53, -1, 59, 61, -1, 67, 71, 73, 79, -1, -1, 83, 89, 97, -1, 101, 103, -1, 107, 109, -1, 113, -1, -1, 127, -1, 131, 137 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case33() {
        int N = 98;
        String colors = "RRBRBRBRBRRRRBBBBBBBBRBRBRBRBBBRRBRBBBRRBBRRRBBBRB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, 83, 89, -1, -1, -1, 97, 98 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case34() {
        int N = 110;
        String colors = "RRBBBRBBBRRRBBBRRRRBRBBRBBRBBRBBBRRBBBRRBBRRBBRRBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, 17, 19, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, 83, -1, -1, 89, 97, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case35() {
        int N = 98;
        String colors = "BBRBRRBBRRBBBBBBBBRRBBRBRBRBBRBBRBBBRBRBBRBBRRRRRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 17, 19, 20, 21, 22, 24, 25, 26, 27, 28, 29, 31, -1, -1, 37, -1, 41, 42, 43, -1, -1, 47, -1, -1, 53, -1, -1, -1, 59, 60, 61, -1, -1, 67, -1, -1, 71, 73, 79, 83, 89, 97 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case36() {
        int N = 135;
        String colors = "BRRRBBRBBRRBRRRBRRRBRBRRBRBBBRBRBRRBBRRBBRBBRRBRBR";
        assertArrayEquals(new int[] { 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case37() {
        int N = 141;
        String colors = "BRRBRRBRRRBRBRBRRRRBRRRBRBRRRBRRRRRRRBBBBBBRBRRRBR";
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 7, -1, 11, 13, 17, 18, 19, -1, 23, -1, 29, 31, 37, 41, 42, 43, 47, 53, -1, 59, 60, 61, 67, 71, 72, 73, 79, 83, 89, 97, 101, 103, -1, -1, -1, -1, -1, -1, 113, -1, 127, 131, 137, 138, 139 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case38() {
        int N = 127;
        String colors = "RBBRBRBRRRRRBBRBRRRRBBRBBRBBBRBRBBBRRRRBBBBBRBBRBR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, 41, 43, 47, 53, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 113, -1, 127 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case39() {
        int N = 102;
        String colors = "BBBBRBBBRRBBRBBBBRBRBRBRBBBBBBBRRRBBBBBRBRBRBBRRRB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 17, 19, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, 59, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case40() {
        int N = 114;
        String colors = "BBRBRRBRRRRBRRBRBRBRRBRBBBRBRRRBBRBBRRRBBRBRBRBRBB";
        assertArrayEquals(new int[] { 1, 4, 5, 6, 7, 11, 12, 13, 17, 19, 23, -1, 29, 31, -1, 37, -1, 41, 42, 43, 47, -1, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, -1, -1, 83, 89, 97, -1, -1, 101, 102, 103, -1, 107, 108, 109, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case41() {
        int N = 138;
        String colors = "RBRBRRRBBRBRRRRRRRBBRBRRRRRBRRRBRBRBRBBRBBRRBBBRBR";
        assertArrayEquals(new int[] { -1, 4, 5, 6, 7, 11, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 113, 127, 128, 129, 130, 131, -1, 137 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case42() {
        int N = 155;
        String colors = "RBBBBRRRBBRBRRBBRRRBRRBRBBRBBRRRRRRRRRRRRBBRRBBRBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case43() {
        int N = 98;
        String colors = "BRBRBBBBBRRBBBBBRBRRBBBBBRBRRBRRBRRBBBRRBBRBBBBBRB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 29, 30, 31, 37, -1, -1, -1, -1, -1, 47, -1, 53, 59, 60, 61, 67, -1, 71, 73, -1, -1, -1, 79, 83, -1, -1, 89, -1, -1, -1, -1, -1, 97, 98 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case44() {
        int N = 158;
        String colors = "BBBRRRRRBRRRBRBRRRBRRRRRBRBBRRBRRBRRBBRBRRRRBRBBRR";
        assertArrayEquals(new int[] { 1, 4, 6, 7, 11, 13, 17, 19, -1, 23, 29, 31, -1, 37, -1, 41, 43, 47, -1, 53, 59, 61, 67, 71, 72, 73, -1, -1, 79, 83, -1, 89, 97, -1, 101, 103, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case45() {
        int N = 129;
        String colors = "RBRRBRRRRBRBBBRBBRRRBRRRBRBBRRRRRBBRBRRBRBBRBBBBBR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case46() {
        int N = 105;
        String colors = "RBRBBRBRBRBRRBRBRRRBRBRRBBBRBRBBBBRBRBBBBBRRBRBRRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, 11, 12, 13, -1, 17, 18, 19, 23, -1, 29, 30, 31, 37, 41, 42, 43, -1, 47, 53, -1, -1, -1, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, 83, -1, 89, -1, 97, 101, 103 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case47() {
        int N = 101;
        String colors = "BRRBRBBBBRBBBRBBRBBBRBRRBBRBBBBBBRRBRRRBRRRBRBBBRR";
        assertArrayEquals(new int[] { 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, 29, 30, 31, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, 59, 60, 61, 67, 71, 72, 73, 79, 83, -1, 89, -1, -1, -1, 97, 101 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case48() {
        int N = 119;
        String colors = "RRRBRRRBBRRRBRRRRRRBBBBBBRBRBRBBBRBBRBRBBRRRRBRRBR";
        assertArrayEquals(new int[] { 2, 3, 5, 6, 7, 11, 13, -1, -1, 17, 19, 23, -1, 29, 31, 37, 41, 43, 47, -1, -1, -1, -1, -1, -1, 59, 60, 61, -1, 67, -1, -1, -1, -1, -1, -1, 79, -1, 83, -1, -1, 89, 97, 101, 103, -1, 107, 109, -1, 113 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case49() {
        int N = 132;
        String colors = "RRBRBBRRBRRRBRBBBRRRBBBBBRRRRRRBBBRBRBBRRBRBRRRRRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, 59, 61, 67, 71, 73, -1, -1, -1, 79, -1, 83, -1, -1, 89, 97, -1, 101, 102, 103, 107, 109, 113, 127, 131 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case50() {
        int N = 104;
        String colors = "BBRRRBBRRBRRRBBBRRBRBBRBBRBBBRRRBBRBBBRBBBBRRBBRBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 89, 97, -1, -1, 101, 102, 104 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case51() {
        int N = 134;
        String colors = "BBRBRBRRRBBBRBRBBRBBBRBRBBRRBBRRBBRRBBRBRRBRRRRRRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, 38, 39, 40, 41, 42, 43, -1, -1, 47, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case52() {
        int N = 109;
        String colors = "RRBBRRBBBRRBBBBRBRRRBRBRBBBBRRBRRRBRBRBBBRBRRRRBRB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 29, 30, 31, 37, 41, 42, 43, -1, 47, -1, -1, -1, -1, 53, 59, 60, 61, 67, 71, 72, 73, -1, 79, 80, 81, 82, 83, -1, 89, 97, 101, 103, -1, 107, 108 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case53() {
        int N = 108;
        String colors = "RBBBRBRRRBRRBBBRBBRBRBRBBBRBRRBBBBRBRBRRBRBBRRRBBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, 41, 42, 43, -1, 47, -1, -1, -1, 53, -1, 59, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case54() {
        int N = 105;
        String colors = "BRRRBBBRRBBRRBBBRRRBBBBRRRBRBRRRRRRBBRRBBRBRBBRBBB";
        assertArrayEquals(new int[] { 1, -1, -1, -1, -1, -1, -1, 11, 13, -1, -1, 17, 19, 20, 21, 22, 23, 29, 31, -1, -1, -1, -1, 37, 41, 43, -1, 47, -1, 53, 59, 61, 67, 71, 73, -1, -1, 79, 83, -1, -1, 89, -1, 97, -1, -1, 101, 102, 104, 105 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case55() {
        int N = 106;
        String colors = "RRBBRBRRBRBBRBBBBBRBRRBBRRRBBBBBBRRRBBBBRRRRRRBBBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, 24, 25, 26, 27, 28, 29, 30, 31, 37, -1, -1, 41, 43, 47, -1, -1, -1, -1, -1, -1, 59, 61, 67, 68, 69, 70, 72, 73, 79, 83, 89, 97, 101, 102, 104, 105, 106 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case56() {
        int N = 482;
        String colors = "BBRBBBRRRRRBRBBRRRBRRBRRBBRRRBBRRBBBBRRBRBBRRRRRBR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case57() {
        int N = 403;
        String colors = "BBBBRRRBBRBRRRBBRRRBBBRRBBRBRBRBBBBBBBRRBBBRRBRRBR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case58() {
        int N = 899;
        String colors = "BRBRRRBBRRRRBBRRBBBRRRBRBRBRRBBRRRBBBBBBRBRBRBRBBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case59() {
        int N = 1000;
        String colors = "RBBBRRRBRBRBRBBRRRBRRBBRBBBBBRBRBRRRRBRRRRBRBRRRRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case60() {
        int N = 1000;
        String colors = "BBRBBBBRRBRRBRRBRBBRBBBRBBRRBBRBBRBRRRRRBBBRBRRRBR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case61() {
        int N = 1000;
        String colors = "BBRRBBRRBRRRRBBRBRRRBRBBBBBRBRRBBRRRBRRRBRBBBBBBBR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case62() {
        int N = 1;
        String colors = "B";
        assertArrayEquals(new int[] { 1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case63() {
        int N = 2;
        String colors = "B";
        assertArrayEquals(new int[] { 1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case64() {
        int N = 2;
        String colors = "BR";
        assertArrayEquals(new int[] { 1, 2 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case65() {
        int N = 80;
        String colors = "RBRRBRBBRBRRBBRRBBBRRBBBRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case66() {
        int N = 999;
        String colors = "RRRRRRRRRRRBBBBBRRRRRRRRRRRRRRRRBBBBBRRRRRRRRRRRRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case67() {
        int N = 695;
        String colors = "RBRRBRBBRBRRBBRRBBBRRBBBRR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case68() {
        int N = 7;
        String colors = "BRRR";
        assertArrayEquals(new int[] { 1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case69() {
        int N = 1000;
        String colors = "RRRRRRRRRBRRRRRRRRRBRRRRRRRRRBRRRRRRRRRBRRRRRRRRBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case70() {
        int N = 1000;
        String colors = "BBBBBRRRRRRBBBBBBRRRRRBBBR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case71() {
        int N = 1000;
        String colors = "RRRRRBBBBBRRRRRBBBBBRRRRRBBBBBRRRRRBBBBBRRRRRBBBBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case72() {
        int N = 126;
        String colors = "RBRRBRBBRBRRBBRRBBBRRBBBRRRBRRBRBBRBRRBBRRBBRRBBR";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 107, 109, -1, -1, 113 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case73() {
        int N = 3;
        String colors = "R";
        assertArrayEquals(new int[] { -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case74() {
        int N = 50;
        String colors = "R";
        assertArrayEquals(new int[] { -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case75() {
        int N = 50;
        String colors = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case76() {
        int N = 10;
        String colors = "RRRBBB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case77() {
        int N = 1000;
        String colors = "RRRRBBBRBRBRBRBRBRBRBRBBBRRRBRBRBRBRBRBBBRRBRBRBRB";
        assertArrayEquals(new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, colorfulcards.theCards(N, colors));
    }

    @Test
    public void case78() {
        int N = 100;
        String colors = "BRRRRRRBBBRRBRBBBBBRRBRRRRBBRBBBBRRBRBRBBRBRRBBRBB";
        assertArrayEquals(new int[] { 1, 2, 3, 5, 7, 11, 13, 14, 15, 16, 17, 19, -1, 23, 24, 25, 26, 27, 28, 29, 31, -1, 37, 41, 43, 47, -1, -1, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, -1, 83, 89, -1, -1, 97, -1, -1 }, colorfulcards.theCards(N, colors));
    }

}
