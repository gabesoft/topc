package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class TreeAndVertexTest {
    TreeAndVertex treeandvertex = new TreeAndVertex();

    @Test
    public void case1() {
        int[] tree = { 0, 0, 0 };
        assertEquals(3, treeandvertex.get(tree));
    }

    @Test
    public void case2() {
        int[] tree = { 0, 1, 2, 3 };
        assertEquals(2, treeandvertex.get(tree));
    }

    @Test
    public void case3() {
        int[] tree = { 0, 0, 2, 2 };
        assertEquals(3, treeandvertex.get(tree));
    }

    @Test
    public void case4() {
        int[] tree = { 0, 0, 0, 1, 1, 1 };
        assertEquals(4, treeandvertex.get(tree));
    }

    @Test
    public void case5() {
        int[] tree = { 0, 0 };
        assertEquals(2, treeandvertex.get(tree));
    }

    @Test
    public void case6() {
        int[] tree = { 0, 1 };
        assertEquals(2, treeandvertex.get(tree));
    }

    @Test
    public void case7() {
        int[] tree = { 0 };
        assertEquals(1, treeandvertex.get(tree));
    }

    @Test
    public void case8() {
        int[] tree = { 0, 0, 1, 2, 0, 0, 3, 5, 5, 0, 2, 2, 5, 8, 5, 7, 5, 0, 13, 2, 19, 12, 2, 0, 10, 23, 14, 3, 28, 1, 2, 9, 8, 1, 18, 27, 36, 30, 16, 30, 2, 19, 21, 33, 30, 13, 38, 40, 33, 36, 20, 0, 25, 49, 41, 32, 27, 43, 34 };
        assertEquals(8, treeandvertex.get(tree));
    }

    @Test
    public void case9() {
        int[] tree = { 0, 1, 2, 0, 1, 5, 6, 1, 7, 4, 2, 5, 5, 8, 6, 2, 14, 12, 18, 10, 0, 6, 18, 2, 20, 11, 0, 11, 7, 12, 17, 3, 18, 31, 14, 34, 30, 11, 9 };
        assertEquals(5, treeandvertex.get(tree));
    }

    @Test
    public void case10() {
        int[] tree = { 0, 1, 0, 0, 1, 3, 1, 0, 4, 5, 10, 4, 6, 10, 6, 0, 3, 2, 16, 11, 2, 2, 13, 0, 17, 12, 2, 17, 22, 20, 12, 1, 20, 16, 30, 2, 35, 21, 26 };
        assertEquals(6, treeandvertex.get(tree));
    }

    @Test
    public void case11() {
        int[] tree = { 0, 0, 1, 0, 1, 2, 5, 3, 1, 0, 8, 6, 8, 4, 2, 9, 12, 11, 4, 17, 10, 16, 3, 20, 5, 25, 18, 12, 13, 1, 23, 8, 29, 1, 22, 28, 28, 19, 27 };
        assertEquals(6, treeandvertex.get(tree));
    }

    @Test
    public void case12() {
        int[] tree = { 0, 1, 2, 1, 2, 4, 0, 5, 3, 9, 5, 1, 4, 8, 3, 6, 10, 8, 12, 1, 16, 2, 6, 16, 6, 24, 0, 6, 8, 18, 7, 5, 20, 5, 21, 35, 34, 8, 34, 8, 30, 31, 25, 1, 16, 45, 36, 31, 21, 25, 14, 32, 8, 39, 40, 0, 50, 50, 38 };
        assertEquals(7, treeandvertex.get(tree));
    }

    @Test
    public void case13() {
        int[] tree = { 0, 1, 2, 0, 0, 2, 6, 7, 5, 6, 5, 5, 3, 12, 7, 10, 6, 5, 12, 1, 13, 12, 16, 8, 5, 17, 12, 11, 2, 29, 9, 7, 16, 32, 20, 3, 24, 3, 37, 24, 19, 6, 29, 36, 20, 15, 41, 28, 17, 28, 36, 36, 22, 15, 44, 29, 32, 36, 57, 59, 17, 21, 61, 6, 23, 15, 2, 54, 63, 16, 61, 68, 5, 60, 69, 18, 41, 47, 28, 76, 4, 59, 64, 76, 36, 74, 1, 41, 49, 29, 88, 8, 32, 36, 21, 53, 45, 54, 5 };
        assertEquals(8, treeandvertex.get(tree));
    }

    @Test
    public void case14() {
        int[] tree = { 0, 1, 2, 1, 1, 0, 2, 2, 8, 3, 4, 7, 7, 3, 4, 2, 3, 14, 17, 17, 8, 6, 16, 2, 20, 12, 13, 25, 25, 14, 3, 3, 27, 27, 33, 22, 9, 31, 8, 12, 13, 15, 2, 15, 13, 4, 25, 1, 0, 26, 41, 20, 35, 1, 2, 15, 46, 56, 56, 54, 27, 44, 18, 23, 38, 14, 36, 41, 27, 65, 3, 46, 19, 59, 28, 53, 28, 65, 55, 50, 71, 24, 49, 9, 63, 5, 36, 17, 60, 13, 16, 15, 58, 45, 70, 78, 2, 56, 66 };
        assertEquals(9, treeandvertex.get(tree));
    }

    @Test
    public void case15() {
        int[] tree = { 0, 1, 1, 1, 3, 0, 0, 1, 5, 1, 10, 3, 6, 2, 6, 4, 15, 4, 0, 5, 2, 10, 1, 3, 4, 7, 14, 13, 6, 21, 12, 3, 3, 9, 7, 29, 5, 8, 2, 22, 28, 13, 15, 15, 27, 21, 42, 9, 5, 43, 0, 18, 20, 42, 25, 22, 50, 14, 52, 3, 3, 35, 4, 14, 31, 36, 30, 16, 0, 69, 33, 53, 71, 47, 47, 16, 53, 4, 77, 37, 44, 40, 0, 44, 64, 0, 82, 37, 10, 48, 23, 78, 41, 56, 13, 93, 76, 95, 68 };
        assertEquals(8, treeandvertex.get(tree));
    }

    @Test
    public void case16() {
        int[] tree = { 0, 1, 2, 0, 1, 1, 5, 5, 6, 7, 4, 10, 8, 8, 2, 12, 0, 8, 0, 5, 6, 11, 5, 3, 4, 22, 19, 3, 8, 3, 28, 4, 23, 3, 16, 23, 8, 16, 26, 5, 39, 16, 33, 35, 7, 42, 34, 7, 21, 18, 40, 48, 42, 19, 28, 15, 0, 5, 53, 7, 39, 6, 59, 56, 49, 45, 23, 16, 49, 0, 53, 26, 30, 0, 53, 16, 10, 22, 68, 34, 53, 21, 49, 39, 8, 3, 15, 72, 50, 34, 72, 6, 81, 86, 69, 91, 24, 39, 39 };
        assertEquals(7, treeandvertex.get(tree));
    }

    @Test
    public void case17() {
        int[] tree = { 0, 0, 2, 1, 2, 2, 1, 6, 3, 7, 0, 6, 1, 13, 12, 4, 5, 1, 17, 7, 2, 14, 18, 6, 12, 18, 22, 26, 27, 13, 22, 23, 4, 13, 5, 28, 2, 34, 19, 1, 13, 2, 9, 41, 33, 6, 45, 3, 26, 46, 30, 39, 24, 21, 42, 11, 41, 42, 25, 27, 42, 43, 6, 11, 5, 27, 19, 17, 38, 46, 65, 53, 33, 36, 52, 23, 68, 67, 70, 11, 0, 74, 77, 18, 66, 76, 84, 76, 12, 58, 83, 31, 80, 70, 61, 3, 47, 37, 96 };
        assertEquals(7, treeandvertex.get(tree));
    }

    @Test
    public void case18() {
        int[] tree = { 0, 1, 2, 0, 1, 5, 6, 1, 7, 4, 2, 5, 5, 8, 6, 2, 14, 12, 18, 10, 0, 6, 18, 2, 20, 11, 0, 11, 7, 12, 17, 3, 18, 31, 14, 34, 30, 11, 9 };
        assertEquals(5, treeandvertex.get(tree));
    }

    @Test
    public void case19() {
        int[] tree = { 0, 0, 0 };
        assertEquals(3, treeandvertex.get(tree));
    }

    @Test
    public void case20() {
        int[] tree = { 0, 0, 0, 0, 0, 0, 0, 0, 5, 5 };
        assertEquals(8, treeandvertex.get(tree));
    }

    @Test
    public void case21() {
        int[] tree = { 0, 0, 2, 2 };
        assertEquals(3, treeandvertex.get(tree));
    }

    @Test
    public void case22() {
        int[] tree = { 0, 0, 0, 2, 2 };
        assertEquals(3, treeandvertex.get(tree));
    }

    @Test
    public void case23() {
        int[] tree = { 0, 0, 0, 1 };
        assertEquals(3, treeandvertex.get(tree));
    }

    @Test
    public void case24() {
        int[] tree = { 0 };
        assertEquals(1, treeandvertex.get(tree));
    }

    @Test
    public void case25() {
        int[] tree = { 0, 0, 0, 0 };
        assertEquals(4, treeandvertex.get(tree));
    }

    @Test
    public void case26() {
        int[] tree = { 0, 0, 0, 0, 0, 2 };
        assertEquals(5, treeandvertex.get(tree));
    }

    @Test
    public void case27() {
        int[] tree = { 0, 0, 0, 3 };
        assertEquals(3, treeandvertex.get(tree));
    }

    @Test
    public void case28() {
        int[] tree = { 0, 0, 2 };
        assertEquals(2, treeandvertex.get(tree));
    }

    @Test
    public void case29() {
        int[] tree = { 0, 0 };
        assertEquals(2, treeandvertex.get(tree));
    }

}
