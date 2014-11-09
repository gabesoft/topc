package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class PermutationSignatureTest {
    PermutationSignature permutationsignature = new PermutationSignature();

    @Test
    public void case1() {
        String signature = "IIIII";
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case2() {
        String signature = "DI";
        assertArrayEquals(new int[] { 2, 1, 3 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case3() {
        String signature = "IIIID";
        assertArrayEquals(new int[] { 1, 2, 3, 4, 6, 5 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case4() {
        String signature = "DIIDID";
        assertArrayEquals(new int[] { 2, 1, 3, 5, 4, 7, 6 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case5() {
        String signature = "D";
        assertArrayEquals(new int[] { 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case6() {
        String signature = "I";
        assertArrayEquals(new int[] { 1, 2 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case7() {
        String signature = "DD";
        assertArrayEquals(new int[] { 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case8() {
        String signature = "DI";
        assertArrayEquals(new int[] { 2, 1, 3 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case9() {
        String signature = "ID";
        assertArrayEquals(new int[] { 1, 3, 2 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case10() {
        String signature = "II";
        assertArrayEquals(new int[] { 1, 2, 3 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case11() {
        String signature = "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII";
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case12() {
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case13() {
        String signature = "DIDIIIDIDIDIDIDIDIIDIDIDIDIDDDDD";
        assertArrayEquals(new int[] { 2, 1, 4, 3, 5, 6, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15, 18, 17, 19, 21, 20, 23, 22, 25, 24, 27, 26, 33, 32, 31, 30, 29, 28 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case14() {
        String signature = "IIIDIDIDIDIIDDIDDDIDDIDIIIIIII";
        assertArrayEquals(new int[] { 1, 2, 3, 5, 4, 7, 6, 9, 8, 11, 10, 12, 15, 14, 13, 19, 18, 17, 16, 22, 21, 20, 24, 23, 25, 26, 27, 28, 29, 30, 31 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case15() {
        String signature = "IDIIDIDIDIDIDIDDDDDDDDDDDIIIIIIIIDIDDDDDI";
        assertArrayEquals(new int[] { 1, 3, 2, 4, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 27, 28, 29, 30, 31, 32, 33, 35, 34, 41, 40, 39, 38, 37, 36, 42 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case16() {
        String signature = "IDIIDIDIDIDIDIDDDDDDDDDDDIIIIIIIIDIDDDDDIDDDDD";
        assertArrayEquals(new int[] { 1, 3, 2, 4, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 27, 28, 29, 30, 31, 32, 33, 35, 34, 41, 40, 39, 38, 37, 36, 47, 46, 45, 44, 43, 42 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case17() {
        String signature = "IDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDID";
        assertArrayEquals(new int[] { 1, 3, 2, 5, 4, 7, 6, 9, 8, 11, 10, 13, 12, 15, 14, 17, 16, 19, 18, 21, 20, 23, 22, 25, 24, 27, 26, 29, 28, 31, 30, 33, 32, 35, 34, 37, 36, 39, 38, 41, 40, 43, 42, 45, 44, 47, 46, 49, 48, 51, 50 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case18() {
        String signature = "DIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDIDI";
        assertArrayEquals(new int[] { 2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15, 18, 17, 20, 19, 22, 21, 24, 23, 26, 25, 28, 27, 30, 29, 32, 31, 34, 33, 36, 35, 38, 37, 40, 39, 42, 41, 44, 43, 46, 45, 48, 47, 50, 49, 51 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case19() {
        String signature = "IDIDIDIDIDIDIDIDIDIDIIIDIDIDIDIDIDIDIDIDIDIDIDIDID";
        assertArrayEquals(new int[] { 1, 3, 2, 5, 4, 7, 6, 9, 8, 11, 10, 13, 12, 15, 14, 17, 16, 19, 18, 21, 20, 22, 23, 25, 24, 27, 26, 29, 28, 31, 30, 33, 32, 35, 34, 37, 36, 39, 38, 41, 40, 43, 42, 45, 44, 47, 46, 49, 48, 51, 50 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case20() {
        String signature = "IDIDIDIDIDIDIDIDIDIDIIIDIDIDIDIDIDIDDDIDIDIDIDIDID";
        assertArrayEquals(new int[] { 1, 3, 2, 5, 4, 7, 6, 9, 8, 11, 10, 13, 12, 15, 14, 17, 16, 19, 18, 21, 20, 22, 23, 25, 24, 27, 26, 29, 28, 31, 30, 33, 32, 35, 34, 39, 38, 37, 36, 41, 40, 43, 42, 45, 44, 47, 46, 49, 48, 51, 50 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case21() {
        String signature = "IIIIIIIIIIIIIIDIDIDIIIIIIIIIIDIIIIIIIIIIIIIIIIII";
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 15, 18, 17, 20, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31, 30, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case22() {
        String signature = "IIIIIIIIIIIIIIDIDIDIIIIIIIIIIDIIIIIIIIIIIIIIIIIID";
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 15, 18, 17, 20, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31, 30, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 49 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case23() {
        String signature = "DIIIIIIIIIIIIIIDIDIDIIIIIIIIIIDIIIIIIIIIIIIIIIIII";
        assertArrayEquals(new int[] { 2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 16, 19, 18, 21, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 31, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case24() {
        String signature = "DDDDDDDDDDDDDDDIIDDDDDDIDDDDDDDDDDDDDDDDDDDID";
        assertArrayEquals(new int[] { 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 17, 24, 23, 22, 21, 20, 19, 18, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 46, 45 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case25() {
        String signature = "DIIDIDIDIIDIID";
        assertArrayEquals(new int[] { 2, 1, 3, 5, 4, 7, 6, 9, 8, 10, 12, 11, 13, 15, 14 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case26() {
        String signature = "IIIIDIDIDIIDIDIID";
        assertArrayEquals(new int[] { 1, 2, 3, 4, 6, 5, 8, 7, 10, 9, 11, 13, 12, 15, 14, 16, 18, 17 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case27() {
        String signature = "DIIDIDIIDIDDIDID";
        assertArrayEquals(new int[] { 2, 1, 3, 5, 4, 7, 6, 8, 10, 9, 13, 12, 11, 15, 14, 17, 16 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case28() {
        String signature = "IIIIIIIIDIDIDIDIDII";
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 10, 9, 12, 11, 14, 13, 16, 15, 18, 17, 19, 20 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case29() {
        String signature = "IDDDIDI";
        assertArrayEquals(new int[] { 1, 5, 4, 3, 2, 7, 6, 8 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case30() {
        String signature = "IIIIIIIIIDIDIDIIIIDIDIDIDDID";
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 10, 13, 12, 15, 14, 16, 17, 18, 20, 19, 22, 21, 24, 23, 27, 26, 25, 29, 28 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case31() {
        String signature = "DIIIIIIIDIIIIIIIDIDIDIIIIIIIIDDDDDDD";
        assertArrayEquals(new int[] { 2, 1, 3, 4, 5, 6, 7, 8, 10, 9, 11, 12, 13, 14, 15, 16, 18, 17, 20, 19, 22, 21, 23, 24, 25, 26, 27, 28, 29, 37, 36, 35, 34, 33, 32, 31, 30 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case32() {
        String signature = "DIIDDIIIDIDIDDDDIIIIIIIIIIIDDDIDDDIIIIIIIDIDIDIDI";
        assertArrayEquals(new int[] { 2, 1, 3, 6, 5, 4, 7, 8, 10, 9, 12, 11, 17, 16, 15, 14, 13, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 31, 30, 29, 28, 35, 34, 33, 32, 36, 37, 38, 39, 40, 41, 43, 42, 45, 44, 47, 46, 49, 48, 50 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case33() {
        String signature = "IDDDIIDDDIDDDIDDDIDDDDIIDIDIDDDDDDIIDDDDDIDIDDIDDI";
        assertArrayEquals(new int[] { 1, 5, 4, 3, 2, 6, 10, 9, 8, 7, 14, 13, 12, 11, 18, 17, 16, 15, 23, 22, 21, 20, 19, 24, 26, 25, 28, 27, 35, 34, 33, 32, 31, 30, 29, 36, 42, 41, 40, 39, 38, 37, 44, 43, 47, 46, 45, 50, 49, 48, 51 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case34() {
        String signature = "DDDDDDDDDDDIIDDDDDDDDDDIIIDDDDDDDDDIDDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 13, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 25, 26, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case35() {
        String signature = "DDDDDDDDDIDDDDDDDDIDDDDDDDDDDDDDIIIIIIIDDDDDDDID";
        assertArrayEquals(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 19, 18, 17, 16, 15, 14, 13, 12, 11, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 34, 35, 36, 37, 38, 39, 47, 46, 45, 44, 43, 42, 41, 40, 49, 48 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case36() {
        String signature = "DDDDDIDIDDDDDDDDDDDDIDDDDDDDIIIIDDDDDDIIDDDDDDDDID";
        assertArrayEquals(new int[] { 6, 5, 4, 3, 2, 1, 8, 7, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 29, 28, 27, 26, 25, 24, 23, 22, 30, 31, 32, 39, 38, 37, 36, 35, 34, 33, 40, 49, 48, 47, 46, 45, 44, 43, 42, 41, 51, 50 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case37() {
        String signature = "DDD";
        assertArrayEquals(new int[] { 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case38() {
        String signature = "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII";
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case39() {
        String signature = "IDDDDDDDDDDDDDDDDII";
        assertArrayEquals(new int[] { 1, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 19, 20 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case40() {
        String signature = "DDI";
        assertArrayEquals(new int[] { 3, 2, 1, 4 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case41() {
        String signature = "DDDIIIIDDD";
        assertArrayEquals(new int[] { 4, 3, 2, 1, 5, 6, 7, 11, 10, 9, 8 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case42() {
        String signature = "DDDDI";
        assertArrayEquals(new int[] { 5, 4, 3, 2, 1, 6 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case43() {
        String signature = "DDIIIIDIIDDIIDDDDIDIDDD";
        assertArrayEquals(new int[] { 3, 2, 1, 4, 5, 6, 8, 7, 9, 12, 11, 10, 13, 18, 17, 16, 15, 14, 20, 19, 24, 23, 22, 21 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case44() {
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDIIIIIIIIIIDDDDDDDDDDD";
        assertArrayEquals(new int[] { 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 31, 32, 33, 34, 35, 36, 37, 38, 39, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case45() {
        String signature = "DIDDID";
        assertArrayEquals(new int[] { 2, 1, 5, 4, 3, 7, 6 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case46() {
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case47() {
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case48() {
        String signature = "DDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case49() {
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case50() {
        String signature = "DDDDDDDDD";
        assertArrayEquals(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case51() {
        String signature = "DDDIDDD";
        assertArrayEquals(new int[] { 4, 3, 2, 1, 8, 7, 6, 5 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case52() {
        String signature = "DDDDDIIIIIDDDDDIIIIIDDDDDIIIIIDDDDDIIIIIDDDDDIIIII";
        assertArrayEquals(new int[] { 6, 5, 4, 3, 2, 1, 7, 8, 9, 10, 16, 15, 14, 13, 12, 11, 17, 18, 19, 20, 26, 25, 24, 23, 22, 21, 27, 28, 29, 30, 36, 35, 34, 33, 32, 31, 37, 38, 39, 40, 46, 45, 44, 43, 42, 41, 47, 48, 49, 50, 51 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case53() {
        String signature = "DDDIIIIDDDIIIIIDDDDDDDIIIIIIIIIIIIIDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 4, 3, 2, 1, 5, 6, 7, 11, 10, 9, 8, 12, 13, 14, 15, 23, 22, 21, 20, 19, 18, 17, 16, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case54() {
        String signature = "IDDDDDDDDDDDDDDDDIIDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 1, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 19, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case55() {
        String signature = "IDDDDDIIDDDDIIDDDDIIDDDIIDDDDDDIIDDDDDDDIIDDDDIIDD";
        assertArrayEquals(new int[] { 1, 7, 6, 5, 4, 3, 2, 8, 13, 12, 11, 10, 9, 14, 19, 18, 17, 16, 15, 20, 24, 23, 22, 21, 25, 32, 31, 30, 29, 28, 27, 26, 33, 41, 40, 39, 38, 37, 36, 35, 34, 42, 47, 46, 45, 44, 43, 48, 51, 50, 49 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case56() {
        String signature = "DDIDIIDIIDDDDDDIIIIIIDDDDIIIDDIDIIDIDD";
        assertArrayEquals(new int[] { 3, 2, 1, 5, 4, 6, 8, 7, 9, 16, 15, 14, 13, 12, 11, 10, 17, 18, 19, 20, 21, 26, 25, 24, 23, 22, 27, 28, 31, 30, 29, 33, 32, 34, 36, 35, 39, 38, 37 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case57() {
        String signature = "DDDDDD";
        assertArrayEquals(new int[] { 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case58() {
        String signature = "DDDDDDIIIIIIIDDDDDDIIIIIIIIIDDDDDDDIIIIIIDIDIDIDDD";
        assertArrayEquals(new int[] { 7, 6, 5, 4, 3, 2, 1, 8, 9, 10, 11, 12, 13, 20, 19, 18, 17, 16, 15, 14, 21, 22, 23, 24, 25, 26, 27, 28, 36, 35, 34, 33, 32, 31, 30, 29, 37, 38, 39, 40, 41, 43, 42, 45, 44, 47, 46, 51, 50, 49, 48 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case59() {
        String signature = "DDDDDDDDDDDDDDIIIIIIIIIIIIIIIIIIIIIIDDDDDIIIIIIIII";
        assertArrayEquals(new int[] { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 42, 41, 40, 39, 38, 37, 43, 44, 45, 46, 47, 48, 49, 50, 51 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case60() {
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case61() {
        String signature = "IDDDDD";
        assertArrayEquals(new int[] { 1, 7, 6, 5, 4, 3, 2 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case62() {
        String signature = "DDIDIDIDIDDDIDIDIDDDIDDIDIIIDIIDIDIDIDIDIIDIIIDIID";
        assertArrayEquals(new int[] { 3, 2, 1, 5, 4, 7, 6, 9, 8, 13, 12, 11, 10, 15, 14, 17, 16, 21, 20, 19, 18, 24, 23, 22, 26, 25, 27, 28, 30, 29, 31, 33, 32, 35, 34, 37, 36, 39, 38, 41, 40, 42, 44, 43, 45, 46, 48, 47, 49, 51, 50 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case63() {
        String signature = "DDDDIIIIDDIIDDDDIDIDIDDDDD";
        assertArrayEquals(new int[] { 5, 4, 3, 2, 1, 6, 7, 8, 11, 10, 9, 12, 17, 16, 15, 14, 13, 19, 18, 21, 20, 27, 26, 25, 24, 23, 22 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case64() {
        String signature = "DIDDDIIDIIDDDDDIIIDDDDDDIIDDIDDDIDIDDDIDIIDIDDD";
        assertArrayEquals(new int[] { 2, 1, 6, 5, 4, 3, 7, 9, 8, 10, 16, 15, 14, 13, 12, 11, 17, 18, 25, 24, 23, 22, 21, 20, 19, 26, 29, 28, 27, 33, 32, 31, 30, 35, 34, 39, 38, 37, 36, 41, 40, 42, 44, 43, 48, 47, 46, 45 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case65() {
        String signature = "DDDDDDDDDDIIIIIIIIIIDDDDDDDDDDIIIIIIIIIIDDDDDIIIII";
        assertArrayEquals(new int[] { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 12, 13, 14, 15, 16, 17, 18, 19, 20, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 32, 33, 34, 35, 36, 37, 38, 39, 40, 46, 45, 44, 43, 42, 41, 47, 48, 49, 50, 51 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case66() {
        String signature = "DDDDDDDDDIDDDDDDDDIDDDDDDDDDIDDDIIDDIIIDIDIIDI";
        assertArrayEquals(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 19, 18, 17, 16, 15, 14, 13, 12, 11, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 33, 32, 31, 30, 34, 37, 36, 35, 38, 39, 41, 40, 43, 42, 44, 46, 45, 47 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case67() {
        String signature = "DDDDIIIIDDDD";
        assertArrayEquals(new int[] { 5, 4, 3, 2, 1, 6, 7, 8, 13, 12, 11, 10, 9 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case68() {
        String signature = "DDDDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case69() {
        String signature = "DIIIDDDDDDDIDIDIDDDID";
        assertArrayEquals(new int[] { 2, 1, 3, 4, 12, 11, 10, 9, 8, 7, 6, 5, 14, 13, 16, 15, 20, 19, 18, 17, 22, 21 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case70() {
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDIDDDDDDDDDDDDDDDDIDDDDDDDD";
        assertArrayEquals(new int[] { 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 51, 50, 49, 48, 47, 46, 45, 44, 43 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case71() {
        String signature = "IIDDDI";
        assertArrayEquals(new int[] { 1, 2, 6, 5, 4, 3, 7 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case72() {
        String signature = "DIDIDI";
        assertArrayEquals(new int[] { 2, 1, 4, 3, 6, 5, 7 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case73() {
        String signature = "DDDIIIIDDDIDIDIDDDD";
        assertArrayEquals(new int[] { 4, 3, 2, 1, 5, 6, 7, 11, 10, 9, 8, 13, 12, 15, 14, 20, 19, 18, 17, 16 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case74() {
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDI";
        assertArrayEquals(new int[] { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 51 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case75() {
        String signature = "IIDDI";
        assertArrayEquals(new int[] { 1, 2, 5, 4, 3, 6 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case76() {
        String signature = "DIIDDD";
        assertArrayEquals(new int[] { 2, 1, 3, 7, 6, 5, 4 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case77() {
        String signature = "DIIDIDDIIDIDDIIDIDDIIDIDDIIDIDDIIDIDDIIDIDDIID";
        assertArrayEquals(new int[] { 2, 1, 3, 5, 4, 8, 7, 6, 9, 11, 10, 14, 13, 12, 15, 17, 16, 20, 19, 18, 21, 23, 22, 26, 25, 24, 27, 29, 28, 32, 31, 30, 33, 35, 34, 38, 37, 36, 39, 41, 40, 44, 43, 42, 45, 47, 46 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case78() {
        String signature = "DDDDDDDDIIIIIIIIIIIIIIIIIIIDDDDDDDIIIIIIIIIIIIIIII";
        assertArrayEquals(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 35, 34, 33, 32, 31, 30, 29, 28, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case79() {
        String signature = "IDDIIDDDIIIDDDDIIIIDDDDDIIIIIDDDDDDDDDDDDDDDDDDDDI";
        assertArrayEquals(new int[] { 1, 4, 3, 2, 5, 9, 8, 7, 6, 10, 11, 16, 15, 14, 13, 12, 17, 18, 19, 25, 24, 23, 22, 21, 20, 26, 27, 28, 29, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 51 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case80() {
        String signature = "DDDDDDDDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case81() {
        String signature = "IDD";
        assertArrayEquals(new int[] { 1, 4, 3, 2 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case82() {
        String signature = "DDDIIDDDDIIDDDI";
        assertArrayEquals(new int[] { 4, 3, 2, 1, 5, 10, 9, 8, 7, 6, 11, 15, 14, 13, 12, 16 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case83() {
        String signature = "DDDDDDDIIDDDIDDIDDDD";
        assertArrayEquals(new int[] { 8, 7, 6, 5, 4, 3, 2, 1, 9, 13, 12, 11, 10, 16, 15, 14, 21, 20, 19, 18, 17 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case84() {
        String signature = "DDDIIIDDDIIIDDDIIIDDDIIIDDD";
        assertArrayEquals(new int[] { 4, 3, 2, 1, 5, 6, 10, 9, 8, 7, 11, 12, 16, 15, 14, 13, 17, 18, 22, 21, 20, 19, 23, 24, 28, 27, 26, 25 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case85() {
        String signature = "IDDDDDDDDDDDDIIIIIIIIIIIIIDIID";
        assertArrayEquals(new int[] { 1, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 28, 27, 29, 31, 30 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case86() {
        String signature = "DDDDD";
        assertArrayEquals(new int[] { 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case87() {
        String signature = "IDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 1, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case88() {
        String signature = "IIDIDIDDDIDIDIDDDIDIDIDIDIDDDIDIIIDDDIIIIDDDIDIDID";
        assertArrayEquals(new int[] { 1, 2, 4, 3, 6, 5, 10, 9, 8, 7, 12, 11, 14, 13, 18, 17, 16, 15, 20, 19, 22, 21, 24, 23, 26, 25, 30, 29, 28, 27, 32, 31, 33, 34, 38, 37, 36, 35, 39, 40, 41, 45, 44, 43, 42, 47, 46, 49, 48, 51, 50 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case89() {
        String signature = "IDDI";
        assertArrayEquals(new int[] { 1, 4, 3, 2, 5 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case90() {
        String signature = "DIIDIDDIIDIDDIIDIDDIIDIDDDIIIDDDDDDDDDDIIIIIII";
        assertArrayEquals(new int[] { 2, 1, 3, 5, 4, 8, 7, 6, 9, 11, 10, 14, 13, 12, 15, 17, 16, 20, 19, 18, 21, 23, 22, 27, 26, 25, 24, 28, 29, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 41, 42, 43, 44, 45, 46, 47 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case91() {
        String signature = "IIIDIDIDDIDIDIDIIIDIDIDIIDDDDDIDIDIDDDDDDDIIIIIIID";
        assertArrayEquals(new int[] { 1, 2, 3, 5, 4, 7, 6, 10, 9, 8, 12, 11, 14, 13, 16, 15, 17, 18, 20, 19, 22, 21, 24, 23, 25, 31, 30, 29, 28, 27, 26, 33, 32, 35, 34, 43, 42, 41, 40, 39, 38, 37, 36, 44, 45, 46, 47, 48, 49, 51, 50 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case92() {
        String signature = "IDDIDDIDDDIIDIIDIIDIDIDD";
        assertArrayEquals(new int[] { 1, 4, 3, 2, 7, 6, 5, 11, 10, 9, 8, 12, 14, 13, 15, 17, 16, 18, 20, 19, 22, 21, 25, 24, 23 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case93() {
        String signature = "DDDDDDDDDDDDDI";
        assertArrayEquals(new int[] { 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 15 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case94() {
        String signature = "DDIIDDIIDDII";
        assertArrayEquals(new int[] { 3, 2, 1, 4, 7, 6, 5, 8, 11, 10, 9, 12, 13 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case95() {
        String signature = "IDDD";
        assertArrayEquals(new int[] { 1, 5, 4, 3, 2 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case96() {
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDIII";
        assertArrayEquals(new int[] { 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 32, 33, 34 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case97() {
        String signature = "DIDIDIDIDIDIDDIIDIDIDIDIDIDIDIDIDIDIIDDIDIDIDIDDI";
        assertArrayEquals(new int[] { 2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 15, 14, 13, 16, 18, 17, 20, 19, 22, 21, 24, 23, 26, 25, 28, 27, 30, 29, 32, 31, 34, 33, 36, 35, 37, 40, 39, 38, 42, 41, 44, 43, 46, 45, 49, 48, 47, 50 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case98() {
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";
        assertArrayEquals(new int[] { 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case99() {
        String signature = "DDIDDI";
        assertArrayEquals(new int[] { 3, 2, 1, 6, 5, 4, 7 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case100() {
        String signature = "DDDIDI";
        assertArrayEquals(new int[] { 4, 3, 2, 1, 6, 5, 7 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case101() {
        String signature = "DIDIDIIDIIDIDDIDIIIIIDDIIIIDDIDIDDIIIDIIDDDDIDIIDI";
        assertArrayEquals(new int[] { 2, 1, 4, 3, 6, 5, 7, 9, 8, 10, 12, 11, 15, 14, 13, 17, 16, 18, 19, 20, 21, 24, 23, 22, 25, 26, 27, 30, 29, 28, 32, 31, 35, 34, 33, 36, 37, 39, 38, 40, 45, 44, 43, 42, 41, 47, 46, 48, 50, 49, 51 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case102() {
        String signature = "DDDDDDDDDD";
        assertArrayEquals(new int[] { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case103() {
        String signature = "DIIDIDD";
        assertArrayEquals(new int[] { 2, 1, 3, 5, 4, 8, 7, 6 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case104() {
        String signature = "IIDDDIIDDDIIDDIDDDDDDDDDIIIIDIIDDDIDDIDDDDIIII";
        assertArrayEquals(new int[] { 1, 2, 6, 5, 4, 3, 7, 11, 10, 9, 8, 12, 15, 14, 13, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 26, 27, 28, 30, 29, 31, 35, 34, 33, 32, 38, 37, 36, 43, 42, 41, 40, 39, 44, 45, 46, 47 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case105() {
        String signature = "DDDDDDDDDDDDDDDDDDDIDDDDIIDIIIDIIDDDIDIIDDIDIIDDDI";
        assertArrayEquals(new int[] { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 25, 24, 23, 22, 21, 26, 28, 27, 29, 30, 32, 31, 33, 37, 36, 35, 34, 39, 38, 40, 43, 42, 41, 45, 44, 46, 50, 49, 48, 47, 51 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case106() {
        String signature = "DDDIDDDI";
        assertArrayEquals(new int[] { 4, 3, 2, 1, 8, 7, 6, 5, 9 }, permutationsignature.reconstruct(signature));
    }

    @Test
    public void case107() {
        String signature = "DIDIIDIDDIIDDIIIDIDDDIIIIDDDDIDIDIDIDIDIDIDIDIDIDI";
        assertArrayEquals(new int[] { 2, 1, 4, 3, 5, 7, 6, 10, 9, 8, 11, 14, 13, 12, 15, 16, 18, 17, 22, 21, 20, 19, 23, 24, 25, 30, 29, 28, 27, 26, 32, 31, 34, 33, 36, 35, 38, 37, 40, 39, 42, 41, 44, 43, 46, 45, 48, 47, 50, 49, 51 }, permutationsignature.reconstruct(signature));
    }

}
