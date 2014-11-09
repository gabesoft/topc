package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class KnightsTourTest {
    KnightsTour knightstour = new KnightsTour();

    @Test
    public void case1() {
        String[] board = { "....*.**", "*....*.*", "...**...", ".....K.*", "*.*.....", "...*.*..", "........", "......*." };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case2() {
        String[] board = { ".**...K*", "*..*.***", "...*.**.", "*.*....*", "*..**...", "*.*.*...", ".......*", ".*....*." };
        assertEquals(7, knightstour.visitedPositions(board));
    }

    @Test
    public void case3() {
        String[] board = { ".....*..", ".......*", "........", ".*......", "..*.*...", "......K.", "........", "........" };
        assertEquals(49, knightstour.visitedPositions(board));
    }

    @Test
    public void case4() {
        String[] board = { "****....", "..*****.", "*.****K*", ".*.**.**", "****.***", "*.**.*..", "**.*..**", "********" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case5() {
        String[] board = { "........", "........", "........", "..*....K", "...*....", "........", "........", "........" };
        assertEquals(61, knightstour.visitedPositions(board));
    }

    @Test
    public void case6() {
        String[] board = { "..*.....", ".......*", "*......*", "..K*.*.*", ".......*", "*.*.***.", "*...*...", ".*...*.." };
        assertEquals(21, knightstour.visitedPositions(board));
    }

    @Test
    public void case7() {
        String[] board = { "*.******", "********", "***.**.*", "**.K**.*", ".....*..", "********", "*.**.***", "**..**.*" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case8() {
        String[] board = { "*.......", "*..*...*", ".*......", "...K...*", "........", "......**", ".*......", "...*...." };
        assertEquals(48, knightstour.visitedPositions(board));
    }

    @Test
    public void case9() {
        String[] board = { "*..*****", ".*******", "*.*.*.*.", "*...*.**", "*.*.****", ".**K.*..", "..*..***", "*..*****" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case10() {
        String[] board = { "*....**.", ".K.****.", ".....***", ".....*..", "......*.", "***.....", ".*****.*", ".....**." };
        assertEquals(28, knightstour.visitedPositions(board));
    }

    @Test
    public void case11() {
        String[] board = { "........", "........", "........", "........", "....K...", "........", "........", "........" };
        assertEquals(64, knightstour.visitedPositions(board));
    }

    @Test
    public void case12() {
        String[] board = { "*..**..*", "*...*..*", "***..**.", "..******", ".**...**", "....*.*.", ".***.***", "..*.K**." };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case13() {
        String[] board = { ".......*", "*...*...", "...*..*.", "*....*K.", "*...*.*.", "....*.**", "....**..", "*......*" };
        assertEquals(22, knightstour.visitedPositions(board));
    }

    @Test
    public void case14() {
        String[] board = { "***.****", "**.*.***", "*.*.*..*", "***..*.*", "***.****", "..**.*.*", "..**K*..", "*..*****" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case15() {
        String[] board = { "........", ".*......", "......*.", ".......*", "..*..*..", "....*.K.", "........", ".....*.." };
        assertEquals(17, knightstour.visitedPositions(board));
    }

    @Test
    public void case16() {
        String[] board = { "***.****", "*.*.**.*", "**..**.*", "*.****.*", "**.*****", ".**.**K*", "**.**.*.", "**.*****" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case17() {
        String[] board = { ".**.**..", ".***.*..", ".*.*.***", "*.******", "*.K**.**", "...****.", ".*****.*", "******.*" };
        assertEquals(8, knightstour.visitedPositions(board));
    }

    @Test
    public void case18() {
        String[] board = { ".******.", "****.***", ".*..*..*", ".**.**.*", "*K*.....", "*.**..**", ".*.**.*.", ".****..*" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case19() {
        String[] board = { "..**.*..", "..*.*K**", "***...**", "...*.***", ".***....", "*..*.***", "**....**", "****.***" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case20() {
        String[] board = { "*****.*.", ".**..**.", "****.**.", "..****.*", "******.*", "**.***K*", ".*****.*", "****..*." };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case21() {
        String[] board = { "*****.*.", "*K*****.", ".******.", "*...****", "**.*****", "****.***", "*.***..*", "*.*.****" };
        assertEquals(3, knightstour.visitedPositions(board));
    }

    @Test
    public void case22() {
        String[] board = { "*****.**", "..*.****", ".*****.*", "*.******", "***.....", ".*******", "***K..**", "******.*" };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case23() {
        String[] board = { "..*..*..", "...K....", "........", "........", "*.......", "........", "........", "........" };
        assertEquals(60, knightstour.visitedPositions(board));
    }

    @Test
    public void case24() {
        String[] board = { "..*.....", "..*..**.", "*****...", "*****...", ".**.**..", "..K**...", ".**.*.*.", "**.....*" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case25() {
        String[] board = { ".****.*.", "**.*K***", ".***.**.", ".**.****", "*.******", "***.**.*", ".*.*.*.*", "********" };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case26() {
        String[] board = { "*...*.**", "*K...**.", "*.***...", "*..****.", "*.****..", "*..*..**", ".....*.*", ".**.*..." };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case27() {
        String[] board = { "...**..*", ".**.....", "***.....", "*.....**", ".....K..", "..*.....", "..**....", "........" };
        assertEquals(14, knightstour.visitedPositions(board));
    }

    @Test
    public void case28() {
        String[] board = { "**....*.", "****..**", "...***.*", "..*.*.*.", "*.***..*", ".*K...*.", "...*.*.*", ".*..*..." };
        assertEquals(5, knightstour.visitedPositions(board));
    }

    @Test
    public void case29() {
        String[] board = { "*....*..", ".**.*...", "...*....", "..*..**.", ".**.....", "*...**..", "...**..*", ".....*K." };
        assertEquals(8, knightstour.visitedPositions(board));
    }

    @Test
    public void case30() {
        String[] board = { ".***.*.*", ".**.....", ".**...**", ".***.*.*", "*...*.**", ".*.*..*.", ".K.....*", "*......." };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case31() {
        String[] board = { "..*.....", "....*.*.", "........", ".....*..", "........", ".......*", "..*.K...", "........" };
        assertEquals(30, knightstour.visitedPositions(board));
    }

    @Test
    public void case32() {
        String[] board = { ".......*", "..**....", "........", ".*....*.", "K...*...", "..**.*..", "........", "**..*..." };
        assertEquals(23, knightstour.visitedPositions(board));
    }

    @Test
    public void case33() {
        String[] board = { "********", "********", "*..***.*", "****.**K", "*.*****.", ".*.*****", "*...****", "***.****" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case34() {
        String[] board = { ".*..****", "******.*", "*.****.*", ".**...**", "*.******", "K.****.*", "**...*.*", "******.." };
        assertEquals(6, knightstour.visitedPositions(board));
    }

    @Test
    public void case35() {
        String[] board = { ".*.K....", "........", "........", "........", ".*......", ".....*..", "........", "*....*.." };
        assertEquals(56, knightstour.visitedPositions(board));
    }

    @Test
    public void case36() {
        String[] board = { "........", "...K.*..", "........", "........", "........", "**....*.", "....*...", "....*..." };
        assertEquals(38, knightstour.visitedPositions(board));
    }

    @Test
    public void case37() {
        String[] board = { ".*.***..", "..****..", "..*...*.", ".**..*K.", ".**....*", "**.*****", "*..*...*", ".**.**.*" };
        assertEquals(7, knightstour.visitedPositions(board));
    }

    @Test
    public void case38() {
        String[] board = { "...*..*.", ".......*", "......K.", "........", "..*...*.", "........", "........", "........" };
        assertEquals(48, knightstour.visitedPositions(board));
    }

    @Test
    public void case39() {
        String[] board = { "********", ".*******", "********", "****K***", "***.****", "********", "********", "********" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case40() {
        String[] board = { ".*.....*", "......*.", "..*.**..", ".*..**.*", ".*K***..", "...**.*.", "...*....", ".....*.*" };
        assertEquals(12, knightstour.visitedPositions(board));
    }

    @Test
    public void case41() {
        String[] board = { ".****.**", ".*****.*", "********", "****.***", "**..**.*", "****.**.", "******K*", "**.***.*" };
        assertEquals(5, knightstour.visitedPositions(board));
    }

    @Test
    public void case42() {
        String[] board = { "*.**..**", ".****.*.", ".*.**...", ".***.*.*", "****.**.", ".*******", "***.**K.", "*******." };
        assertEquals(7, knightstour.visitedPositions(board));
    }

    @Test
    public void case43() {
        String[] board = { "********", "*.*****.", "*****..*", "..*****K", "********", ".*.**.*.", "*****.*.", "***..***" };
        assertEquals(3, knightstour.visitedPositions(board));
    }

    @Test
    public void case44() {
        String[] board = { ".*..*...", "........", "....*.K*", "......*.", "*..*..*.", "..*...*.", "........", "*......." };
        assertEquals(39, knightstour.visitedPositions(board));
    }

    @Test
    public void case45() {
        String[] board = { "**K*****", "*.**.***", "..***..*", "...**.**", "*.**..**", ".*****.*", "**.*..*.", "**...*.." };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case46() {
        String[] board = { ".**.****", "**.....*", "****.***", ".*.*****", "**.*****", ".*.**.**", "**..K***", "********" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case47() {
        String[] board = { "*.***.*.", "*.*.***.", "***..**.", ".****...", "*.****K*", "*.******", "***...*.", "..**.***" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case48() {
        String[] board = { "..*..**K", "*.*.*...", ".*......", ".*..*...", "**......", "....*..*", "*.....*.", ".**...*." };
        assertEquals(39, knightstour.visitedPositions(board));
    }

    @Test
    public void case49() {
        String[] board = { "........", ".*.*....", ".*......", "..K...*.", "*...*...", "...*....", "...*.*..", "........" };
        assertEquals(39, knightstour.visitedPositions(board));
    }

    @Test
    public void case50() {
        String[] board = { "K.......", "........", "........", "........", "........", "........", "........", "........" };
        assertEquals(64, knightstour.visitedPositions(board));
    }

    @Test
    public void case51() {
        String[] board = { "********", "*******.", "********", "**.***.*", "********", "***.*.**", "********", "****K***" };
        assertEquals(3, knightstour.visitedPositions(board));
    }

    @Test
    public void case52() {
        String[] board = { "*.*....*", ".......*", "**...*..", "..***...", ".**.*...", "..*.*..K", "..***.*.", "**...*.." };
        assertEquals(17, knightstour.visitedPositions(board));
    }

    @Test
    public void case53() {
        String[] board = { "..*...*.", "**.....*", "*..*....", "*..*....", ".....*..", "....*..K", "**.*...*", "..**...." };
        assertEquals(27, knightstour.visitedPositions(board));
    }

    @Test
    public void case54() {
        String[] board = { "****.**.", "*..*****", "..*.**.*", ".*.*..**", "*....*..", ".*.*.***", ".K.*..**", "***.****" };
        assertEquals(7, knightstour.visitedPositions(board));
    }

    @Test
    public void case55() {
        String[] board = { "*****.**", "********", "****K***", "**.*****", ".*.*****", "**.**.**", "**.*****", "*****.*." };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case56() {
        String[] board = { "*.**...*", "..*..***", "*..**...", "*.*.*..*", "*...*.**", ".**...*.", "*..*....", ".*...**K" };
        assertEquals(6, knightstour.visitedPositions(board));
    }

    @Test
    public void case57() {
        String[] board = { "...***.*", "..**...*", "*..*....", "***..*.*", "**...*.*", "*..*****", "....*...", "*..**K**" };
        assertEquals(12, knightstour.visitedPositions(board));
    }

    @Test
    public void case58() {
        String[] board = { "*......K", "........", "........", "........", "........", "........", "........", "........" };
        assertEquals(63, knightstour.visitedPositions(board));
    }

    @Test
    public void case59() {
        String[] board = { ".*......", "........", "...*....", "........", "........", "...*...*", "........", ".......K" };
        assertEquals(60, knightstour.visitedPositions(board));
    }

    @Test
    public void case60() {
        String[] board = { "*.*.*..*", "*.....*.", ".....***", ".*..*..*", ".*..*.*.", ".**..**.", "...*..*.", "..*..K*." };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case61() {
        String[] board = { "********", "***.****", "********", "********", "********", "********", "K*.*****", "*.******" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case62() {
        String[] board = { ".....*..", "...*....", ".....**.", ".*..*...", "........", "...*....", "..*...K.", "*......*" };
        assertEquals(24, knightstour.visitedPositions(board));
    }

    @Test
    public void case63() {
        String[] board = { "..**....", "..*.....", "..*..*..", "..**....", ".*...*.*", "K..*....", "*...**.*", "....*..*" };
        assertEquals(8, knightstour.visitedPositions(board));
    }

    @Test
    public void case64() {
        String[] board = { "*.......", "..*.....", "........", ".*....*.", "......**", "..*.....", "...*.K..", "........" };
        assertEquals(24, knightstour.visitedPositions(board));
    }

    @Test
    public void case65() {
        String[] board = { ".*......", ".*......", "**..*...", ".......K", "........", "........", "*.......", ".......*" };
        assertEquals(5, knightstour.visitedPositions(board));
    }

    @Test
    public void case66() {
        String[] board = { ".....*.*", "**..*.**", "....*...", "*.*.*.*.", "*...*.*.", ".**.**..", "..**K.*.", "*....*.*" };
        assertEquals(9, knightstour.visitedPositions(board));
    }

    @Test
    public void case67() {
        String[] board = { ".**..*..", "...***..", "..*..*.*", "....*...", ".*.**.**", ".**.K***", ".******.", "..*....." };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case68() {
        String[] board = { ".***.K..", "*....***", ".**.*..*", "**.....*", ".*.*....", ".*..*...", "...*..*.", "..*..*.." };
        assertEquals(8, knightstour.visitedPositions(board));
    }

    @Test
    public void case69() {
        String[] board = { "*...K..*", "........", "*.....*.", ".....*.*", ".*.*....", ".......*", "........", ".*.....*" };
        assertEquals(42, knightstour.visitedPositions(board));
    }

    @Test
    public void case70() {
        String[] board = { "**..*..*", "*.***K..", "..*..*..", "....**..", ".*.....*", "..*.*.*.", "****..*.", ".**.*.**" };
        assertEquals(19, knightstour.visitedPositions(board));
    }

    @Test
    public void case71() {
        String[] board = { ".**.K.*.", "..*.*.*.", ".*.....*", "....*.**", ".**.**.*", "...*....", "*....*..", "...*..**" };
        assertEquals(11, knightstour.visitedPositions(board));
    }

    @Test
    public void case72() {
        String[] board = { "***.****", "*.**.*.*", "*****..*", ".***..**", "****.***", "***..*..", "K...**.*", "*...*.*." };
        assertEquals(8, knightstour.visitedPositions(board));
    }

    @Test
    public void case73() {
        String[] board = { "***K****", "*****.**", "***.****", "*.******", "********", "********", "********", "*****.**" };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case74() {
        String[] board = { "..*...**", ".*..**.*", "**..*...", ".*******", "*.*.*.*.", ".*.K..**", "*.*.*.**", "*.****.*" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case75() {
        String[] board = { "*******.", ".*****.*", "*.**..**", "******.*", "*****.**", "**.*****", "***.****", "..K*****" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case76() {
        String[] board = { "***.....", ".**.**..", ".*...**.", "*****...", "...*..K*", ".**....*", "*.*...*.", "*..**.**" };
        assertEquals(3, knightstour.visitedPositions(board));
    }

    @Test
    public void case77() {
        String[] board = { ".*...*..", "....*.K*", "......**", "*.....*.", "*......*", "........", "........", "........" };
        assertEquals(13, knightstour.visitedPositions(board));
    }

    @Test
    public void case78() {
        String[] board = { "........", "........", "........", "...K....", "......*.", "........", "........", "...*...." };
        assertEquals(52, knightstour.visitedPositions(board));
    }

    @Test
    public void case79() {
        String[] board = { "*****K**", "******.*", "***.*.*.", "**.***.*", "********", "****.***", "*.*****.", "********" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case80() {
        String[] board = { "**.*.***", "********", "***.*...", "****.***", "******..", "*.***..*", "*******K", "*..*****" };
        assertEquals(7, knightstour.visitedPositions(board));
    }

    @Test
    public void case81() {
        String[] board = { ".......K", ".....*..", "........", "*.*.....", ".......*", "........", "..*.....", "........" };
        assertEquals(39, knightstour.visitedPositions(board));
    }

    @Test
    public void case82() {
        String[] board = { "*.*.....", "...*....", "........", "....**.*", ".*......", ".*....*.", ".K**.*.*", "........" };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case83() {
        String[] board = { "........", "........", "........", "........", "........", "........", "........", "K......." };
        assertEquals(64, knightstour.visitedPositions(board));
    }

    @Test
    public void case84() {
        String[] board = { "........", "........", "........", "..K.....", "........", "........", "........", "........" };
        assertEquals(64, knightstour.visitedPositions(board));
    }

    @Test
    public void case85() {
        String[] board = { ".**.*.*K", ".*.*..*.", "........", "....*...", ".*......", ".....***", "...*....", "..*....." };
        assertEquals(32, knightstour.visitedPositions(board));
    }

    @Test
    public void case86() {
        String[] board = { "*...*.**", "***.*..*", "..*..*.*", "**..K*.*", "*...*.*.", "*.**.*.*", ".*.**.**", "**..****" };
        assertEquals(5, knightstour.visitedPositions(board));
    }

    @Test
    public void case87() {
        String[] board = { ".***.***", "****....", "..*.*..*", "*...*K.*", ".....*..", "*..*.**.", "**..***.", "***.***." };
        assertEquals(7, knightstour.visitedPositions(board));
    }

    @Test
    public void case88() {
        String[] board = { "..**....", "K.......", "......*.", "........", "........", ".....*..", "........", ".......*" };
        assertEquals(47, knightstour.visitedPositions(board));
    }

    @Test
    public void case89() {
        String[] board = { "**...*.*", "*..*.**.", "**.***.*", "***..*.*", "..*.*.**", ".*K*..**", "***.**..", "**...***" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case90() {
        String[] board = { "*.**.***", "**..**.*", "*.**.***", ".**.*..*", "*.**..**", "**..****", "..*****K", "*..**..*" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case91() {
        String[] board = { "*..*..*.", "......*.", "*....K..", "......*.", "..*...**", "......**", "*..*.*..", ".*.**..*" };
        assertEquals(23, knightstour.visitedPositions(board));
    }

    @Test
    public void case92() {
        String[] board = { "********", "********", ".*...**.", "*.*.****", "********", "****.*K*", "****.***", "********" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case93() {
        String[] board = { "***...**", "*.******", "*...***.", "***K.*.*", "**..*.*.", "..***..*", "**....*.", "*...*.*." };
        assertEquals(5, knightstour.visitedPositions(board));
    }

    @Test
    public void case94() {
        String[] board = { ".**...*.", "*...K*.*", "....**.*", "**.***..", "*****.**", "....*..*", "**..*...", "*.*..**." };
        assertEquals(29, knightstour.visitedPositions(board));
    }

    @Test
    public void case95() {
        String[] board = { "......**", ".***....", ".....*..", "....*...", "........", "K...**.*", "*....*..", "*...*..*" };
        assertEquals(30, knightstour.visitedPositions(board));
    }

    @Test
    public void case96() {
        String[] board = { ".*.***..", ".....*..", "**.....*", "..**.*..", "..K.***.", "*..*.*..", "**..*..*", ".....***" };
        assertEquals(5, knightstour.visitedPositions(board));
    }

    @Test
    public void case97() {
        String[] board = { "........", "..*.....", ".......K", "........", "........", "........", "........", "........" };
        assertEquals(62, knightstour.visitedPositions(board));
    }

    @Test
    public void case98() {
        String[] board = { "K.*.**.*", "*..*****", "**.*****", "*...****", "****..**", "***.***.", "***.**.*", ".*****.*" };
        assertEquals(3, knightstour.visitedPositions(board));
    }

    @Test
    public void case99() {
        String[] board = { "********", "*******.", "*.*****.", "*.**..**", "***K****", "*****.**", "***.****", "..******" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case100() {
        String[] board = { "********", "********", "*******.", "***K****", "****.*.*", "********", ".*****.*", "********" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case101() {
        String[] board = { "...K....", "........", "**..*.*.", "*.......", "........", ".......*", "........", "........" };
        assertEquals(14, knightstour.visitedPositions(board));
    }

    @Test
    public void case102() {
        String[] board = { ".*.**.*.", "....*..*", "K.*.....", "..***...", ".**.*.*.", ".*.**.*.", ".*.*****", ".***.*.." };
        assertEquals(7, knightstour.visitedPositions(board));
    }

    @Test
    public void case103() {
        String[] board = { "********", "********", "********", "**..*..*", "*****K**", "*****..*", ".******.", ".*******" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case104() {
        String[] board = { "......**", ".**....*", "****.***", "*.*.**..", "...*...*", "*****.**", ".*.*.***", "K**..*.*" };
        assertEquals(10, knightstour.visitedPositions(board));
    }

    @Test
    public void case105() {
        String[] board = { ".*....*.", "***..**.", "*..K..**", ".**.***.", "*.*.....", "...*.*..", ".......*", ".*......" };
        assertEquals(8, knightstour.visitedPositions(board));
    }

    @Test
    public void case106() {
        String[] board = { "..*.*.**", ".*..*..*", "********", "..**.**.", "*K.**.**", "*.*.****", "*.****.*", "*.*..***" };
        assertEquals(7, knightstour.visitedPositions(board));
    }

    @Test
    public void case107() {
        String[] board = { "...***..", ".*..*.**", ".*..**..", "....*...", "*..*....", "...K....", ".*....*.", ".*...**." };
        assertEquals(7, knightstour.visitedPositions(board));
    }

    @Test
    public void case108() {
        String[] board = { "*.......", "..*.....", ".....*..", "..*....*", "..*.K*..", "...*....", "..*.....", "**......" };
        assertEquals(14, knightstour.visitedPositions(board));
    }

    @Test
    public void case109() {
        String[] board = { ".**.*.**", "..***...", "*.....*.", ".....*..", "K.......", ".*.**..*", "***.....", "*.*...*." };
        assertEquals(3, knightstour.visitedPositions(board));
    }

    @Test
    public void case110() {
        String[] board = { ".*......", "...*.*..", "...**...", "**..**..", ".*******", "....***.", "*..*.K.*", "....*..." };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case111() {
        String[] board = { "....K...", ".....*.*", "*.*.....", "....*...", "*...**..", ".....*..", "*...**..", ".**....." };
        assertEquals(5, knightstour.visitedPositions(board));
    }

    @Test
    public void case112() {
        String[] board = { ".**.*...", "...K.*..", "...*....", ".*..*...", ".**.*...", ".....*..", "*.*.*...", "..*.*..*" };
        assertEquals(6, knightstour.visitedPositions(board));
    }

    @Test
    public void case113() {
        String[] board = { "..*.....", ".K**..*.", "...*..*.", "**.*..*.", "*..*..*.", "..*.....", "*.**.*..", "***....." };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case114() {
        String[] board = { ".*....**", "**...*.*", "..*..**.", "*.*.*.*.", ".***.K.*", ".*.***..", "**.....*", ".**...**" };
        assertEquals(16, knightstour.visitedPositions(board));
    }

    @Test
    public void case115() {
        String[] board = { ".......*", "..*K....", "..*.....", ".**.....", "........", ".**....*", "......*.", ".*...*.." };
        assertEquals(16, knightstour.visitedPositions(board));
    }

    @Test
    public void case116() {
        String[] board = { "*.******", "*...***.", "..**.*.K", "....*.**", ".*....*.", "..*..***", "*.......", "........" };
        assertEquals(11, knightstour.visitedPositions(board));
    }

    @Test
    public void case117() {
        String[] board = { "...*..*.", ".......*", ".....*..", "........", "...*...*", "...*....", "*.......", "...K*..." };
        assertEquals(55, knightstour.visitedPositions(board));
    }

    @Test
    public void case118() {
        String[] board = { "*.******", ".******.", "**.*****", "*.***.**", "****.***", "******..", ".K*.**.*", "******.*" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case119() {
        String[] board = { "........", ".*......", ".......*", "*.......", "........", "...*....", "........", "..*.K..." };
        assertEquals(56, knightstour.visitedPositions(board));
    }

    @Test
    public void case120() {
        String[] board = { "...**...", "*..K*.**", "**.*****", "******.*", ".**.*..*", "*.*...*.", "..***.*.", "*****.**" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case121() {
        String[] board = { "*.*.***.", "***..*.*", "........", ".*..*...", "*....**.", "**.*.K..", "....*..*", ".....*.*" };
        assertEquals(16, knightstour.visitedPositions(board));
    }

    @Test
    public void case122() {
        String[] board = { "*.*****.", ".*.*****", ".***....", "*.******", "*.*.*..*", "**..****", "K.**..*.", "***.****" };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case123() {
        String[] board = { "*.*..**.", "..*.....", "........", ".....***", "........", "......*.", "*.*.***.", ".*K.**.*" };
        assertEquals(3, knightstour.visitedPositions(board));
    }

    @Test
    public void case124() {
        String[] board = { "**.*****", ".*..*.K*", "..*.**.*", "****..*.", "**..*..*", "*.*...**", "*.*..***", "***.**.." };
        assertEquals(9, knightstour.visitedPositions(board));
    }

    @Test
    public void case125() {
        String[] board = { "*...**.*", ".***...*", "*.*.*.*.", "..*....*", ".****...", "*..*..**", "..**.***", "..K.**.." };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case126() {
        String[] board = { "..K.****", "****.**.", "********", "*****...", "*****.**", ".**.****", "*****..*", "***.****" };
        assertEquals(3, knightstour.visitedPositions(board));
    }

    @Test
    public void case127() {
        String[] board = { "..*..*.*", "..*.....", "......*.", ".*...K..", ".*..*...", "*...*.*.", "..*...*.", "...**.*." };
        assertEquals(14, knightstour.visitedPositions(board));
    }

    @Test
    public void case128() {
        String[] board = { "..**....", ".*.*....", "..*.*.*.", "...**.**", "******.*", "*..**.*.", "..*.*.*.", "**K*...*" };
        assertEquals(5, knightstour.visitedPositions(board));
    }

    @Test
    public void case129() {
        String[] board = { "*.**.**.", ".******.", "*..***..", "..****.*", ".*....*.", ".***...K", "..*.***.", "...*..**" };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case130() {
        String[] board = { ".**.*..*", "..*****.", "*.*.K...", "*...*..*", ".....**.", "*.......", "*....*..", "...***.." };
        assertEquals(6, knightstour.visitedPositions(board));
    }

    @Test
    public void case131() {
        String[] board = { "*.**.*.*", "**..**.*", ".*...*.*", "**..*K..", "***.****", ".*******", "*.******", "*.*...**" };
        assertEquals(5, knightstour.visitedPositions(board));
    }

    @Test
    public void case132() {
        String[] board = { "........", "........", ".*.....*", "..*.....", "..*....K", "........", ".....*.*", "...*...." };
        assertEquals(26, knightstour.visitedPositions(board));
    }

    @Test
    public void case133() {
        String[] board = { "*.******", "********", "*****K**", "********", "******.*", "*******.", "********", "********" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case134() {
        String[] board = { "*....*..", "......*.", "..*...*.", "........", "K*......", "..*.....", ".*....*.", ".*.**..." };
        assertEquals(14, knightstour.visitedPositions(board));
    }

    @Test
    public void case135() {
        String[] board = { "****.***", "********", "..******", "***.***.", "***.*.**", "*..****.", "*******K", "***.****" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case136() {
        String[] board = { "********", "********", "********", "********", "********", "**K*****", "*******.", "*****.**" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case137() {
        String[] board = { "*.***.*.", "**..K*.*", ".*.**.**", "****.***", ".*..****", "******.*", "****...*", "********" };
        assertEquals(5, knightstour.visitedPositions(board));
    }

    @Test
    public void case138() {
        String[] board = { "*****.*.", "*.*****.", "****.**.", "*..*.K.*", "*.*****.", "**.*****", "**.*****", "**.*.***" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case139() {
        String[] board = { ".*....*.", "..*..*..", "........", ".**.....", "...K....", "........", "**......", "....*..*" };
        assertEquals(18, knightstour.visitedPositions(board));
    }

    @Test
    public void case140() {
        String[] board = { ".*....*.", "**.****.", "***.**.*", ".....**.", "*....*..", "*.******", "....**..", "*...**.K" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case141() {
        String[] board = { "****.***", "********", "******.*", "********", "K*.****.", "**.*****", "********", "******.*" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case142() {
        String[] board = { "..*.....", ".......*", "*..*....", "...***.*", "*....**.", "..*..*.K", "*.*...*.", "........" };
        assertEquals(6, knightstour.visitedPositions(board));
    }

    @Test
    public void case143() {
        String[] board = { "........", "........", "........", "*....K..", "........", "........", "......*.", "........" };
        assertEquals(62, knightstour.visitedPositions(board));
    }

    @Test
    public void case144() {
        String[] board = { "......*.", "........", "........", "......*.", "........", "....*...", "....K...", "........" };
        assertEquals(61, knightstour.visitedPositions(board));
    }

    @Test
    public void case145() {
        String[] board = { "*..**.**", "********", ".*.**.*.", "********", "*.*.*.**", "*..*.***", "...****.", "*K***.*." };
        assertEquals(9, knightstour.visitedPositions(board));
    }

    @Test
    public void case146() {
        String[] board = { ".**.**..", "*.***.**", "**.*****", "K*.**.**", "...***.*", "****..**", "*.****.*", "*.***..*" };
        assertEquals(8, knightstour.visitedPositions(board));
    }

    @Test
    public void case147() {
        String[] board = { "*.***.**", "********", ".**.***.", "**.**.**", "*.**K***", "*.******", "*.******", "***.***." };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case148() {
        String[] board = { "********", "*******.", "***.****", "**.*****", "****.***", "********", "********", "K***..**" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case149() {
        String[] board = { "..K...*.", ".*...*..", ".....*..", ".......*", "....*...", "....*...", "...****.", ".*..*..." };
        assertEquals(19, knightstour.visitedPositions(board));
    }

    @Test
    public void case150() {
        String[] board = { "........", ".....*..", "..*.....", "..*.....", "...*....", "........", "........", "....K..." };
        assertEquals(5, knightstour.visitedPositions(board));
    }

    @Test
    public void case151() {
        String[] board = { "*****.**", "*.***.**", "***.**..", "*****.*.", ".**.****", "****.***", "*.**.*K*", "********" };
        assertEquals(7, knightstour.visitedPositions(board));
    }

    @Test
    public void case152() {
        String[] board = { "*****.*.", "***.***.", ".*.*.*..", "****..**", ".****.**", "**...*.*", ".*.****.", "**...*K." };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case153() {
        String[] board = { "..*.***.", "..*.*...", ".*....*.", "K.*.....", "....*...", "......*.", ".*.**.*.", "...**.**" };
        assertEquals(18, knightstour.visitedPositions(board));
    }

    @Test
    public void case154() {
        String[] board = { "..*...*.", "**.....*", "*..*....", "*..*....", ".....*..", "....*..K", "**.*...*", "..**...." };
        assertEquals(27, knightstour.visitedPositions(board));
    }

    @Test
    public void case155() {
        String[] board = { "K.......", "........", "........", "........", "........", "........", "........", "........" };
        assertEquals(64, knightstour.visitedPositions(board));
    }

    @Test
    public void case156() {
        String[] board = { "*.*....*", ".......*", "**...*..", "........", ".**.*...", "..*.*..K", "..***.*.", "**...*.." };
        assertEquals(25, knightstour.visitedPositions(board));
    }

    @Test
    public void case157() {
        String[] board = { "........", ".*.*....", ".*......", "..K...*.", "*...*...", "...*....", "...*.*..", "........" };
        assertEquals(39, knightstour.visitedPositions(board));
    }

    @Test
    public void case158() {
        String[] board = { "K.......", "..*.....", ".*......", "........", "........", "........", "........", "........" };
        assertEquals(1, knightstour.visitedPositions(board));
    }

    @Test
    public void case159() {
        String[] board = { "********", "*******.", "********", "**.***.*", "********", "***.*.**", "********", "****K***" };
        assertEquals(3, knightstour.visitedPositions(board));
    }

    @Test
    public void case160() {
        String[] board = { "********", "*******.", "*****.**", "***K****", "*.******", "********", "**.*****", "****.***" };
        assertEquals(3, knightstour.visitedPositions(board));
    }

    @Test
    public void case161() {
        String[] board = { "......*.", "*......*", "*.......", "*.......", "........", ".......K", "**.....*", "..**...." };
        assertEquals(54, knightstour.visitedPositions(board));
    }

    @Test
    public void case162() {
        String[] board = { ".*******", "********", "********", "*******K", "********", "******.*", "***.****", "********" };
        assertEquals(2, knightstour.visitedPositions(board));
    }

    @Test
    public void case163() {
        String[] board = { "*.******", "*******.", ".*******", "**.***.*", "****K***", "********", "********", "********" };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case164() {
        String[] board = { "***.****", "*.******", "********", ".*******", "**K*****", "***.****", "*.******", "********" };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case165() {
        String[] board = { "*.***.*.", "***.*.**", "******K*", "********", "********", "********", "********", "********" };
        assertEquals(4, knightstour.visitedPositions(board));
    }

    @Test
    public void case166() {
        String[] board = { "*.*....*", ".......*", "**...*..", "..***...", ".**.*...", "..*.*..K", "..***.*.", ".....*.." };
        assertEquals(17, knightstour.visitedPositions(board));
    }

    @Test
    public void case167() {
        String[] board = { "..*...*.", "*..*....", "**.....*", "*..*....", ".....*..", "**.*...*", "..**....", "....*..K" };
        assertEquals(17, knightstour.visitedPositions(board));
    }

}
