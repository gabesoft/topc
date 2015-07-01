package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PermutationCountsDiv2Test {
    PermutationCountsDiv2 permutationcountsdiv2 = new PermutationCountsDiv2();

    @Test
    public void case1() {
        int N = 5;
        int[] pos = { 3 };
        assertEquals(9, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case2() {
        int N = 13;
        int[] pos = { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals(1, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case3() {
        int N = 13;
        int[] pos = {  };
        assertEquals(1, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case4() {
        int N = 9;
        int[] pos = { 2, 4, 5 };
        assertEquals(1421, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case5() {
        int N = 80;
        int[] pos = { 31, 41, 59, 26, 53, 58, 9, 79, 32, 3, 8, 46 };
        assertEquals(82650786, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case6() {
        int N = 94;
        int[] pos = { 59, 1, 15, 48, 55, 13, 83, 68, 33, 79, 86, 70, 82, 51, 2, 85, 11, 17, 93, 71, 34, 90, 25, 32, 77, 39, 84 };
        assertEquals(942213076, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case7() {
        int N = 109;
        int[] pos = { 61, 62, 26, 64, 102, 3, 17, 45, 82, 89, 71, 40, 95, 75, 11, 19, 86, 9, 58, 88, 50, 83, 1, 15, 84, 51, 30, 53, 54, 55, 60, 7, 91, 79, 87, 66, 2, 46, 22, 80, 94, 37, 103, 34, 14, 76, 101, 56, 72, 105, 70, 78, 33, 47, 12, 41, 28, 32, 99, 38, 59, 49, 31, 44, 97, 67, 4, 69, 73, 85, 29, 10, 90, 68, 6, 106, 65, 13, 108, 35, 27, 52, 39, 93, 81, 36, 77 };
        assertEquals(172939393, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case8() {
        int N = 75;
        int[] pos = { 42, 51, 62, 16, 53, 43 };
        assertEquals(667952410, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case9() {
        int N = 132;
        int[] pos = { 13, 37, 124, 105, 70, 81, 125, 35, 131, 78, 24, 57, 110, 113, 67, 54, 9, 42, 47, 87, 27, 68, 82, 90, 118, 46, 20 };
        assertEquals(445660540, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case10() {
        int N = 37;
        int[] pos = { 25, 26, 36, 29, 14, 13, 6, 28, 4, 18, 31, 1, 23, 21, 27, 34, 32, 24, 11, 12 };
        assertEquals(295881565, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case11() {
        int N = 175;
        int[] pos = { 4, 104, 6, 3, 1, 14, 37, 84, 11, 24, 138, 12, 13, 38, 143, 16, 162, 53, 22, 75, 5 };
        assertEquals(200648129, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case12() {
        int N = 56;
        int[] pos = { 4, 5, 16, 30, 2 };
        assertEquals(886516745, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case13() {
        int N = 90;
        int[] pos = { 3, 40, 1, 11, 86, 63, 45, 10, 75, 44, 12, 8, 2, 9, 43, 14, 39, 61, 68, 4, 5, 6, 15, 59, 7, 16, 81, 26, 50, 13, 17, 73, 55, 77, 24, 34, 22, 36, 21, 66, 19, 20, 48, 18, 69, 33 };
        assertEquals(678483084, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case14() {
        int N = 88;
        int[] pos = { 10, 1, 9, 2, 86, 74, 4, 42, 29, 6, 5, 13, 7, 12, 33, 44, 3, 83, 38, 8, 40, 30, 45, 11 };
        assertEquals(365102087, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case15() {
        int N = 160;
        int[] pos = { 2, 1, 13, 25, 6, 11, 3, 9, 14, 4, 16 };
        assertEquals(671813705, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case16() {
        int N = 173;
        int[] pos = { 5, 22, 14, 1, 127, 4, 18, 58, 60, 11, 23, 77, 6, 163, 27, 24, 49, 52, 10, 8, 108, 146, 2, 95, 7, 162, 9, 32, 37, 3, 26, 74, 35, 15, 144, 12, 16, 101, 44, 21, 17, 13, 29, 118, 51, 34, 99, 19, 78, 25, 28, 30, 125, 64, 20, 33, 36, 105, 31, 55, 39, 46, 149, 38, 109, 59, 48, 50, 42, 61, 81, 89, 117, 43, 97, 40, 124, 130, 41, 54, 53, 165, 57, 66, 93, 47 };
        assertEquals(124684182, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case17() {
        int N = 153;
        int[] pos = { 5, 2, 10, 83, 72, 4, 45, 21, 87, 80, 107, 8, 11, 41, 13, 12, 68, 128, 71, 17, 23, 31, 18, 3, 1, 93, 109, 26, 15, 36, 9, 6, 14, 7, 121, 28, 24, 74, 16, 122, 22, 20, 102, 19, 27, 34, 37, 35, 42, 39, 148, 120, 63, 54, 33, 38, 47, 32, 29, 25, 49, 132, 75, 30, 52, 40, 89, 85, 43, 44, 56, 46, 106, 50, 76, 81 };
        assertEquals(663773564, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case18() {
        int N = 12;
        int[] pos = { 3, 4, 7, 1, 10, 8 };
        assertEquals(852225, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case19() {
        int N = 193;
        int[] pos = { 39, 21, 12, 161, 3, 96, 46, 22, 5, 9, 14, 70, 1, 2, 57, 6, 25, 8, 110, 50, 27, 29, 4, 59, 115, 71, 49, 7, 32, 15, 13, 170, 148, 116, 62, 17, 10, 67, 86, 118, 18, 188, 140, 103, 117, 24, 19, 26, 35, 20, 40, 11, 54, 181, 94, 99, 28, 47, 106, 142, 31, 64, 37, 88, 68, 144, 16, 55, 34, 23, 87, 135, 89, 129, 158, 81, 72, 42, 30, 80, 90, 43, 38, 73, 36, 52, 69, 147, 173, 84, 45, 33, 53, 104, 60, 75 };
        assertEquals(449529998, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case20() {
        int N = 79;
        int[] pos = { 8, 47, 74, 55, 1, 2, 70, 9, 30, 12, 5, 18, 16, 75, 3, 14, 62, 13, 6, 29, 43, 4, 59, 7, 19, 15, 11, 17, 25, 41, 10, 40, 26, 46, 20, 32, 21, 28, 31 };
        assertEquals(59440639, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case21() {
        int N = 115;
        int[] pos = { 51, 1, 29, 80, 78, 9, 44, 97, 57, 39, 13, 6, 28, 2, 107, 31, 48, 17, 8, 87, 19, 24, 59, 75, 4, 14, 32, 15, 3, 5, 37, 12, 68, 23, 109, 52, 106, 11, 61, 54, 7 };
        assertEquals(287056730, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case22() {
        int N = 58;
        int[] pos = { 20, 2, 9, 56, 1, 26, 3, 24, 4, 16, 30, 5, 7, 21, 55, 14, 18, 23, 54, 6, 25, 8, 13, 10, 15, 19, 31, 12, 17, 11, 32, 48, 35, 37, 53, 27, 52, 22, 46, 50, 38, 28, 29, 33, 51, 49, 47, 41, 34, 36, 39, 40, 42, 43, 44 };
        assertEquals(978482241, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case23() {
        int N = 147;
        int[] pos = { 49, 27, 71, 47, 21, 1, 6, 127 };
        assertEquals(380558202, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case24() {
        int N = 67;
        int[] pos = { 44, 45, 3, 2, 25, 16, 52, 54, 42, 5, 7, 8, 32, 1, 22, 57, 51, 55, 12, 38, 29, 21, 6, 13, 19, 37, 4, 9, 46, 26, 41, 30, 23, 34, 10, 24, 35, 58, 18, 50, 33, 11, 28, 17, 14, 39, 31, 15, 48, 36, 40, 53, 20, 27, 43, 47, 61, 49, 56, 59 };
        assertEquals(208952285, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case25() {
        int N = 197;
        int[] pos = { 130, 1, 125, 122, 72, 48, 38, 8, 13, 153, 11, 2, 9, 17, 40, 176, 85, 14, 131, 65, 15 };
        assertEquals(774605562, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case26() {
        int N = 200;
        int[] pos = {  };
        assertEquals(1, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case27() {
        int N = 200;
        int[] pos = { 7, 20, 21, 30, 2, 1, 125, 83, 198, 3, 25, 4, 143, 12, 5, 112, 14, 23, 9, 45, 6, 11, 17, 13, 8, 142, 15, 55, 50, 152, 72, 16, 57, 34, 49, 59, 47, 68, 92, 32, 18, 27, 31, 10, 70, 167, 22, 26, 42, 84, 66, 29, 19, 54, 41, 105, 24, 113, 35, 33, 38, 165, 28, 36, 69, 39, 37, 62, 96, 63, 51, 171, 46, 61, 60, 48, 73, 98, 56, 71, 90, 58, 40, 176, 78, 124, 43, 85, 117, 130, 44, 64, 74, 126, 76, 87, 162, 80, 52, 53 };
        assertEquals(318515403, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case28() {
        int N = 200;
        int[] pos = { 1, 41, 2, 110, 10, 12, 11, 40, 43, 15, 117, 69, 28, 3, 19, 147, 4, 48, 126, 90, 7, 166, 9, 66, 180, 80, 37, 170, 17, 18, 21, 23, 8, 6, 5, 34, 32, 22, 20, 27, 13, 56, 31, 167, 87, 168, 184, 26, 30, 14, 42, 38, 54, 35, 25, 177, 29, 33, 16, 62, 52, 86, 24, 36, 46, 50, 136, 53, 68, 47, 181, 96, 39, 164, 161, 44, 81, 98, 64, 59, 77, 49, 121, 185, 111, 178, 57, 89, 119, 74, 133, 137, 55, 58, 84, 60, 65, 103, 95, 51 };
        assertEquals(435262358, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case29() {
        int N = 200;
        int[] pos = { 28, 44, 34, 122, 1, 68, 2, 130, 3, 13, 47, 10, 4, 6, 21, 18, 22, 7, 5, 50, 8, 19, 53, 51, 12, 23, 78, 152, 76, 9, 11, 81, 15, 41, 99, 183, 17, 20, 39, 29, 14, 106, 24, 16, 194, 45, 27, 25, 169, 26, 64, 43, 170, 35, 31, 180, 32, 33, 48, 100, 155, 97, 121, 177, 88, 54, 38, 42, 79, 40, 30, 52, 89, 186, 91, 46, 103, 59, 36, 124, 60, 167, 92, 55, 145, 63, 58, 87, 49, 61, 37, 56, 138, 72, 93, 135, 62, 70, 105, 65 };
        assertEquals(999211191, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case30() {
        int N = 200;
        int[] pos = { 3, 1, 2, 5, 26, 4, 13, 77, 10, 40, 25, 39, 33, 36, 7, 146, 6, 34, 188, 53, 8, 138, 11, 173, 15, 63, 92, 97, 18, 9, 168, 27, 20, 23, 42, 60, 12, 17, 14, 46, 64, 16, 73, 19, 47, 41, 88, 99, 68, 32, 86, 29, 179, 115, 38, 21, 100, 28, 95, 107, 142, 35, 31, 72, 135, 30, 22, 119, 24, 50, 154, 37, 198, 71, 58, 89, 69, 76, 44, 43, 143, 45, 54, 126, 48, 117, 132, 150, 70, 51, 57, 75, 109, 49, 56, 65, 120, 55, 84, 52 };
        assertEquals(769860402, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case31() {
        int N = 200;
        int[] pos = { 1, 4, 14, 80, 20, 87, 2, 36, 57, 3, 7, 117, 16, 75, 69, 9, 5, 22, 44, 48, 97, 72, 38, 11, 6, 106, 8, 126, 13, 12, 113, 183, 27, 15, 66, 24, 17, 26, 18, 23, 19, 45, 29, 35, 31, 21, 25, 76, 196, 10, 83, 28, 33, 157, 91, 129, 47, 77, 58, 90, 30, 32, 42, 56, 119, 88, 120, 41, 181, 49, 51, 60, 166, 39, 43, 70, 121, 34, 62, 52, 55, 71, 37, 40, 115, 92, 54, 84, 63, 46, 81, 50, 53, 110, 59, 100, 112, 65, 68, 61 };
        assertEquals(380661644, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case32() {
        int N = 200;
        int[] pos = { 39, 118, 127, 158, 164, 97, 60, 56, 156, 133, 27, 2, 10, 13, 41, 109, 96, 174, 141, 12, 84, 112, 83, 147, 122, 114, 53, 38, 170, 102, 74, 146, 172, 79, 107, 123, 132, 30, 14, 131, 171, 130, 113, 29, 42, 190, 149, 166, 61, 6, 92, 160, 106, 50, 115, 191, 126, 124, 18, 176, 65, 33, 178, 193, 165, 129, 137, 180, 194, 62, 71, 28, 49, 152, 16, 111, 116, 40, 186, 110, 177, 168, 1, 32, 117, 119, 98, 163, 57, 82, 44, 8, 69, 185, 95, 78, 76, 103, 161, 188 };
        assertEquals(669603075, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case33() {
        int N = 200;
        int[] pos = { 137, 84, 62, 198, 63, 199, 192, 90, 72, 12, 196, 107, 96, 17, 172, 3, 58, 1, 2, 61, 143, 7, 94, 122, 81, 31, 34, 130, 47, 29, 85, 91, 68, 97, 11, 67, 185, 39, 112, 23, 108, 116, 127, 110, 134, 40, 59, 66, 38, 42, 76, 73, 174, 102, 78, 79, 87, 103, 98, 95, 123, 182, 35, 13, 8, 138, 153, 93, 142, 156, 36, 168, 124, 51, 80, 177, 115, 195, 189, 173, 175, 24, 154, 21, 132, 188, 126, 194, 105, 111, 119, 46, 170, 167, 4, 54, 6, 77, 133, 19 };
        assertEquals(701530759, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case34() {
        int N = 200;
        int[] pos = { 144, 124, 190, 135, 113, 92, 105, 164, 133, 175, 189, 60, 112, 14, 78, 127, 3, 174, 85, 6, 34, 50, 11, 145, 167, 108, 5, 93, 40, 141, 97, 41, 126, 151, 27, 150, 61, 82, 192, 28, 19, 10, 7, 72, 173, 2, 32, 94, 170, 44, 138, 31, 114, 66, 180, 102, 56, 148, 193, 52, 1, 90, 71, 136, 130, 62, 39, 83, 123, 159, 51, 18, 63, 24, 16, 38, 121, 42, 8, 119, 79, 22, 110, 134, 187, 132, 157, 64, 107, 171, 158, 4, 116, 37, 43, 95, 161, 137, 184, 17 };
        assertEquals(274455353, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case35() {
        int N = 200;
        int[] pos = { 28, 95, 61, 111, 169, 179, 160, 20, 43, 176, 99, 147, 63, 157, 189, 38, 110, 76, 125, 6, 15, 12, 93, 167, 5, 3, 29, 193, 171, 44, 175, 4, 70, 153, 196, 117, 30, 106, 173, 142, 64, 145, 121, 199, 68, 163, 60, 13, 159, 49, 136, 141, 86, 114, 67, 109, 58, 23, 8, 150, 27, 180, 33, 130, 107, 105, 1, 195, 53, 149, 190, 194, 52, 183, 103, 72, 71, 62, 16, 21, 88, 126, 78, 2, 34, 174, 35, 22, 154, 162, 172, 74, 133, 92, 26, 152, 104, 143, 54, 51 };
        assertEquals(600545629, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case36() {
        int N = 200;
        int[] pos = { 57, 106, 67, 123, 53, 155, 69, 150, 74, 112, 171, 89, 11, 103, 109, 55, 27, 108, 166, 196, 116, 138, 157, 34, 101, 56, 142, 63, 10, 54, 26, 158, 151, 161, 122, 193, 136, 133, 195, 83, 127, 13, 156, 58, 24, 50, 66, 6, 87, 22, 76, 62, 170, 43, 20, 73, 129, 102, 175, 37, 192, 9, 80, 51, 61, 115, 134, 180, 84, 29, 124, 65, 164, 125, 194, 176, 183, 174, 159, 79, 177, 92, 181, 147, 77, 49, 186, 167, 86, 15, 16, 96, 42, 32, 179, 95, 141, 44, 178, 187 };
        assertEquals(88238340, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case37() {
        int N = 167;
        int[] pos = { 40, 107, 4, 34, 122, 132, 8, 144, 129, 22, 76, 75, 31, 151, 36, 116, 92, 5, 10, 143, 120, 71, 1, 87, 121, 139, 43, 118, 83, 101, 161, 77, 57, 119, 90, 7, 64 };
        assertEquals(51714639, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case38() {
        int N = 157;
        int[] pos = { 25, 135, 123, 52, 51, 105, 92, 5, 58, 2, 18, 115, 95, 132, 90, 35, 143, 125, 97, 131, 21, 45, 48, 62, 85, 9, 86, 72, 6, 108, 78, 127, 8, 121, 84, 150, 113, 141, 15, 130, 68, 37, 133, 126, 140, 40, 3, 118, 76, 93, 22, 54, 59, 69, 73, 119, 117, 75, 24, 49, 55, 111, 50, 153, 82, 104, 122, 80, 61, 12, 77, 154, 4, 10, 47, 99, 89, 32, 13, 27, 31, 42, 106, 112, 70, 26, 94, 11, 28, 17, 96, 102, 151, 34, 156, 91, 29, 138, 57, 98, 20, 87, 14, 155 };
        assertEquals(89058912, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case39() {
        int N = 153;
        int[] pos = { 12, 11, 47, 107, 1, 99, 30, 116, 146, 123, 91, 63, 122, 53, 37, 14, 133, 13, 16, 130, 120, 132, 28, 19, 20, 57, 102, 38, 5, 93, 100, 40, 145, 62, 41, 46, 103, 98, 86, 108, 10, 52, 87, 150, 45, 22, 32, 92, 95, 127, 43, 89, 29, 72, 67, 25, 148, 131, 61, 138, 129, 26, 79, 55, 109, 136, 139, 23, 152, 2, 147, 74, 35, 81, 17, 60, 18, 110, 141, 97, 42, 3, 15, 82, 69, 101, 124, 71, 119, 115, 84, 33, 75, 36, 7, 106, 90, 44, 70, 73, 21, 117, 85, 80, 4, 111, 114, 48, 6, 9, 135, 83, 140, 64, 134, 66, 113, 56, 128, 118, 142, 143, 94 };
        assertEquals(286701861, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case40() {
        int N = 117;
        int[] pos = { 38, 83, 111, 52, 90, 1, 81, 49, 103, 25, 102 };
        assertEquals(472149429, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case41() {
        int N = 105;
        int[] pos = { 59, 100, 17, 81, 35, 49, 43, 60, 84, 28, 62, 8, 47, 88, 53, 72, 1, 9, 104, 40 };
        assertEquals(980565331, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case42() {
        int N = 1;
        int[] pos = {  };
        assertEquals(1, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case43() {
        int N = 13;
        int[] pos = { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals(1, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case44() {
        int N = 5;
        int[] pos = { 3 };
        assertEquals(9, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case45() {
        int N = 200;
        int[] pos = { 132, 171, 4, 136, 9, 11, 142, 17, 18, 20, 21, 153, 154, 156, 31, 37, 39, 169, 43, 46, 179, 183, 184, 185, 58, 159, 190, 191, 64, 196, 70, 71, 73, 74, 76, 28, 82, 57, 90, 93, 102, 148, 122, 123, 125 };
        assertEquals(182851725, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case46() {
        int N = 13;
        int[] pos = {  };
        assertEquals(1, permutationcountsdiv2.countPermutations(N, pos));
    }

    @Test
    public void case47() {
        int N = 199;
        int[] pos = { 12, 11, 9, 8, 7, 6, 10, 5, 4, 3, 2, 1, 88, 99, 89, 87, 150, 151, 152, 153 };
        assertEquals(275430369, permutationcountsdiv2.countPermutations(N, pos));
    }

}
