package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class FoxAndFlowerShopDivTwoTest {
    FoxAndFlowerShopDivTwo foxandflowershopdivtwo = new FoxAndFlowerShopDivTwo();

    @Test
    public void case1() {
        String[] flowers = { "F.F", ".F.", ".F." };
        int r = 1;
        int c = 1;
        assertEquals(2, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case2() {
        String[] flowers = { "F..", "...", "..." };
        int r = 0;
        int c = 0;
        assertEquals(0, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case3() {
        String[] flowers = { ".FF.F.F", "FF...F.", "..FF.FF" };
        int r = 1;
        int c = 2;
        assertEquals(6, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case4() {
        String[] flowers = { "F", ".", "F", "F", "F", ".", "F", "F" };
        int r = 4;
        int c = 0;
        assertEquals(3, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case5() {
        String[] flowers = { ".FFF..F...", "FFF...FF.F", "..F.F.F.FF", "FF..F.FFF.", "..FFFFF...", "F....FF...", ".FF.FF..FF", "..F.F.FFF.", ".FF..F.F.F", "F.FFF.FF.F" };
        int r = 4;
        int c = 3;
        assertEquals(32, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case6() {
        String[] flowers = { "F", "F" };
        int r = 0;
        int c = 0;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case7() {
        String[] flowers = { ".", "." };
        int r = 0;
        int c = 0;
        assertEquals(0, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case8() {
        String[] flowers = { "F", "." };
        int r = 0;
        int c = 0;
        assertEquals(0, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case9() {
        String[] flowers = { ".", "F" };
        int r = 0;
        int c = 0;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case10() {
        String[] flowers = { "F", "." };
        int r = 1;
        int c = 0;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case11() {
        String[] flowers = { "F.", ".F" };
        int r = 0;
        int c = 0;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case12() {
        String[] flowers = { "F.F..", "F...F", "F....", "F..F.", "F.F.." };
        int r = 2;
        int c = 1;
        assertEquals(5, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case13() {
        String[] flowers = { "FFF", "FFF", "FFF" };
        int r = 0;
        int c = 0;
        assertEquals(6, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case14() {
        String[] flowers = { "FFF", "FFF", "FFF" };
        int r = 1;
        int c = 0;
        assertEquals(6, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case15() {
        String[] flowers = { "FFF", "FFF", "FFF" };
        int r = 2;
        int c = 0;
        assertEquals(6, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case16() {
        String[] flowers = { "FFF", "FFF", "FFF" };
        int r = 0;
        int c = 2;
        assertEquals(6, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case17() {
        String[] flowers = { "FFF", "FFF", "FFF" };
        int r = 1;
        int c = 1;
        assertEquals(3, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case18() {
        String[] flowers = { "..", "..", "..", "..", "..", ".F", ".." };
        int r = 6;
        int c = 1;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case19() {
        String[] flowers = { "..F....", "FFFFF..", "F..F.FF", "...F.FF", "F.FFF..", "F.FFF.F", "FFF.F..", "..FF.F.", "FF.FFFF" };
        int r = 0;
        int c = 3;
        assertEquals(34, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case20() {
        String[] flowers = { "F.F.", ".FF.", "F...", "F.F.", "FF.F", "F..F", "F.F.", "F..F", "F.FF" };
        int r = 7;
        int c = 2;
        assertEquals(14, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case21() {
        String[] flowers = { "FFFFFF", "FFFFFF", "FFFFFF", "FFFFFF", "FFFFFF", "FFFFFF", "FFFFFF", "FFFFFF" };
        int r = 4;
        int c = 5;
        assertEquals(40, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case22() {
        String[] flowers = { ".F...", "FFF.F", "F...F", "..FFF", "..F.F", "F.F.F", "...F.", "..F..", ".FF.F" };
        int r = 3;
        int c = 3;
        assertEquals(12, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case23() {
        String[] flowers = { "..F..F.F", "F.F..F.." };
        int r = 0;
        int c = 2;
        assertEquals(3, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case24() {
        String[] flowers = { "..", "..", ".." };
        int r = 1;
        int c = 0;
        assertEquals(0, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case25() {
        String[] flowers = { "FF.....", "F......", ".......", ".......", ".......", "...F..F", ".......", "....F.." };
        int r = 7;
        int c = 5;
        assertEquals(5, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case26() {
        String[] flowers = { "..", "..", "..", "..", "..", "..", "..", ".." };
        int r = 7;
        int c = 1;
        assertEquals(0, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case27() {
        String[] flowers = { "......", "......", "......", "F.....", "F.....", "......", "......" };
        int r = 5;
        int c = 3;
        assertEquals(2, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case28() {
        String[] flowers = { "...", "...", "...", "..F", ".F.", "..F" };
        int r = 4;
        int c = 0;
        assertEquals(3, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case29() {
        String[] flowers = { "..F.F.F.", "...FF...", "...F....", "........", "..FF....", "........" };
        int r = 1;
        int c = 7;
        assertEquals(8, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case30() {
        String[] flowers = { "...", "..F" };
        int r = 0;
        int c = 1;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case31() {
        String[] flowers = { "...F", ".F..", "....", "....", "....", "....", "....", "....", ".F.F", "...." };
        int r = 0;
        int c = 1;
        assertEquals(3, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case32() {
        String[] flowers = { ".......", "...F...", ".......", ".......", ".F.....", ".......", "...F..F" };
        int r = 2;
        int c = 2;
        assertEquals(3, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case33() {
        String[] flowers = { "..FFF", "F.FF.", "FF...", "..F.F", ".F...", "F....", ".F..." };
        int r = 6;
        int c = 0;
        assertEquals(12, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case34() {
        String[] flowers = { "..F.FF...", "..FFFF..." };
        int r = 1;
        int c = 3;
        assertEquals(4, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case35() {
        String[] flowers = { "...F..", "......", "......", ".....F", "......", "......", "......", "......", "......", "......" };
        int r = 9;
        int c = 4;
        assertEquals(2, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case36() {
        String[] flowers = { ".....FF..F", "..........", "..........", "..........", ".....F....", "........F." };
        int r = 0;
        int c = 4;
        assertEquals(5, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case37() {
        String[] flowers = { "FF..FF..", "F..FF.F.", ".....FFF", ".F..F.F.", "F.F.FF..", "F.F..FF.", ".F.....F", "FF...FF.", ".....F..", ".F.F..F." };
        int r = 7;
        int c = 4;
        assertEquals(24, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case38() {
        String[] flowers = { "....F..", "F....F.", "FF.F..." };
        int r = 2;
        int c = 5;
        assertEquals(5, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case39() {
        String[] flowers = { ".........", ".........", ".........", ".........", ".........", ".........", ".........", ".........", "........." };
        int r = 2;
        int c = 8;
        assertEquals(0, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case40() {
        String[] flowers = { ".", ".", "F", ".", ".", ".", ".", "." };
        int r = 5;
        int c = 0;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case41() {
        String[] flowers = { "FFFFFFFFF", "F.F.FFFFF", "F.F.FFFFF", ".FFFFFFF." };
        int r = 0;
        int c = 4;
        assertEquals(21, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case42() {
        String[] flowers = { "FFFF.F", "F..FFF", "FF.FFF", "FFFFFF", "FFFFF.", "F.FFF." };
        int r = 2;
        int c = 0;
        assertEquals(23, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case43() {
        String[] flowers = { "F", "F", ".", ".", "F" };
        int r = 3;
        int c = 0;
        assertEquals(2, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case44() {
        String[] flowers = { "..", "..", "..", "..", ".." };
        int r = 0;
        int c = 1;
        assertEquals(0, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case45() {
        String[] flowers = { "......F..", "F........", "...F...F.", "..F.FF.FF", "..F......", "..F....FF", ".F..FF..F", ".F..FF..F", "F.F...F.F", "FF......." };
        int r = 8;
        int c = 7;
        assertEquals(21, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case46() {
        String[] flowers = { "F..", "...", "F..", ".FF" };
        int r = 3;
        int c = 1;
        assertEquals(2, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case47() {
        String[] flowers = { ".F.F.....", "..F...FF.", "...F...F.", "....F.F..", ".......F.", ".....F..F", "..FF.....", "FF.F....." };
        int r = 6;
        int c = 6;
        assertEquals(12, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case48() {
        String[] flowers = { "FFFFFFF", "FFFFFF.", "FFFFFFF", "FFFFFFF", "FFFFFFF", "FF.FFFF" };
        int r = 3;
        int c = 2;
        assertEquals(23, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case49() {
        String[] flowers = { ".FF.F...F", ".FFFF.F..", "FFF.F..F.", "...FF....", "FF.F.F.FF", "FFFF..FFF" };
        int r = 0;
        int c = 6;
        assertEquals(25, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case50() {
        String[] flowers = { ".....F...", "..F...F.." };
        int r = 0;
        int c = 7;
        assertEquals(3, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case51() {
        String[] flowers = { "F.F", "FFF", "FF." };
        int r = 1;
        int c = 1;
        assertEquals(3, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case52() {
        String[] flowers = { ".", ".", "F", "F" };
        int r = 1;
        int c = 0;
        assertEquals(2, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case53() {
        String[] flowers = { "F.", "FF", "F.", "FF", "F.", "FF", ".F", ".." };
        int r = 7;
        int c = 0;
        assertEquals(10, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case54() {
        String[] flowers = { "..", "..", "F.", "..", ".." };
        int r = 0;
        int c = 0;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case55() {
        String[] flowers = { "FFF.FFFFF.", ".FF.FFFFFF", "FF..FFFFFF", "FFFFFFF.FF", "F..FF.FFFF", "FF.FFF.FF.", "FFFFFFFFFF", "FFFFFFFFFF" };
        int r = 1;
        int c = 6;
        assertEquals(51, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case56() {
        String[] flowers = { "..", "..", "..", "..", "..", "..", ".F" };
        int r = 2;
        int c = 1;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case57() {
        String[] flowers = { ".F..F.F...", ".F..F.....", "..........", "F.........", "...F......", ".F........", "........FF", "..........", "....F.....", ".......F.." };
        int r = 1;
        int c = 6;
        assertEquals(8, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case58() {
        String[] flowers = { "........FF", "..F.......", "...F.F....", "..F.......", "....F...F.", "....F.....", ".F.......F", "..F...F...", "..........", "....F...F." };
        int r = 0;
        int c = 0;
        assertEquals(15, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case59() {
        String[] flowers = { ".FF......F", "...F......", "FF...F....", ".....F....", ".F.F.....F", "...F.F....", "F.F.FFF..F", "....F...F.", ".FF.......", "..F......F" };
        int r = 8;
        int c = 3;
        assertEquals(21, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case60() {
        String[] flowers = { "....FF...F", ".F.FF...F.", "......FF.F", "..F..F.F.F", ".FFF.FF.FF", "FF.F.F..FF", "F..F..F.FF", "F.F.F.F.FF", "FF.......F", "....F..F.." };
        int r = 9;
        int c = 2;
        assertEquals(41, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case61() {
        String[] flowers = { "F..F......", "F.FF.F.FFF", "FF....FF..", ".F..F...F.", "..F...FF..", "F.F..F.FF.", "...F.FF...", ".F..F.FF.F", "...FF..FFF", ".F..F..FFF" };
        int r = 4;
        int c = 1;
        assertEquals(34, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case62() {
        String[] flowers = { "..F.F....F", "FF....F..F", ".FFFFFFF.F", "..FFFFFF.F", "F.F.F.F.FF", "FFFF..F..F", "..FFF.FFFF", "...FF...FF", ".FFFF..FF.", ".F...F..F." };
        int r = 4;
        int c = 1;
        assertEquals(46, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case63() {
        String[] flowers = { "FF.FF.FF..", "FFF..FFFF.", "FFFFFFF.FF", "FFFFF.FFFF", "...F.F..FF", "...FF.FF.F", "FF.FFFF.FF", "...FF..FFF", "F.FFF.FFF.", "F..FF.FFFF" };
        int r = 9;
        int c = 4;
        assertEquals(60, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case64() {
        String[] flowers = { ".FFFF..F.F", "FFFFFFFFFF", "FFF.FFF.FF", "FFF.F..F.F", "..F.F.FFFF", "..F.FF.F..", "FFF.FFFFFF", "FF..FFFFFF", ".FFFFF.FFF", "FFFF.FFFFF" };
        int r = 2;
        int c = 7;
        assertEquals(50, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case65() {
        String[] flowers = { "F.FFFFFFFF", "FFFFF.FFF.", "FFFFFFFFFF", "FFFFFFFFFF", "FFFFFFFFFF", "FFFF..FFFF", "FFFFF.FF.F", "FFFFFFFFFF", "FF.F.FFFF.", "F.F.FFFFFF" };
        int r = 9;
        int c = 3;
        assertEquals(80, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case66() {
        String[] flowers = { "FFFFFFFFFF", "FFFFFFFFFF", "FFFFFFFFFF", "FFFFFFFFFF", "FFFFFFFFFF", "FFFFFFFFFF", "FFFFFFFFFF", "FFFFFFFFFF", "FFFFFFFFFF", "FFFFFFFFFF" };
        int r = 0;
        int c = 4;
        assertEquals(90, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case67() {
        String[] flowers = { "F", "F" };
        int r = 0;
        int c = 0;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case68() {
        String[] flowers = { "FF...", "FF...", "FF..." };
        int r = 1;
        int c = 2;
        assertEquals(6, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case69() {
        String[] flowers = { "F..", "F..", "F.." };
        int r = 1;
        int c = 1;
        assertEquals(3, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case70() {
        String[] flowers = { "..FF", "..FF", "..FF", "..FF" };
        int r = 1;
        int c = 1;
        assertEquals(8, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case71() {
        String[] flowers = { ".FFF..F...", "FFF...FF.F", "..F.F.F.FF", "FF..F.FFF.", "..FFFFF...", "F....FF...", ".FF.FF..FF", "..F.F.FFF.", ".FF..F.F.F", "F.FFF.FF.F" };
        int r = 4;
        int c = 3;
        assertEquals(32, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case72() {
        String[] flowers = { "..F", "..F", "..F" };
        int r = 1;
        int c = 1;
        assertEquals(3, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case73() {
        String[] flowers = { ".FF", "FFF", "FFF" };
        int r = 0;
        int c = 0;
        assertEquals(6, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case74() {
        String[] flowers = { "F.F", "...", "F.." };
        int r = 1;
        int c = 1;
        assertEquals(2, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case75() {
        String[] flowers = { ".FF.F.F", "FF...F.", "..FF.FF" };
        int r = 1;
        int c = 2;
        assertEquals(6, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case76() {
        String[] flowers = { ".", "F" };
        int r = 0;
        int c = 0;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case77() {
        String[] flowers = { ".FFF..F...", "FFF...FF.F", "..F.F.F.FF", "FF..F.FFF.", "..FFFFF...", "F....FF...", ".FF.FF..FF", "..F.F.FFF.", ".FF..F.F.F", "F.FFF.FF.F" };
        int r = 1;
        int c = 1;
        assertEquals(43, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case78() {
        String[] flowers = { "FF.", "FF.", "FF." };
        int r = 0;
        int c = 2;
        assertEquals(6, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case79() {
        String[] flowers = { "...", "FF.", "..." };
        int r = 1;
        int c = 1;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case80() {
        String[] flowers = { "F..", "...", "...", "..F" };
        int r = 0;
        int c = 0;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case81() {
        String[] flowers = { "FFF", "FFF", "FFF" };
        int r = 1;
        int c = 1;
        assertEquals(3, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case82() {
        String[] flowers = { "FF", "F." };
        int r = 1;
        int c = 1;
        assertEquals(2, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

    @Test
    public void case83() {
        String[] flowers = { "...", "F..", "..." };
        int r = 1;
        int c = 1;
        assertEquals(1, foxandflowershopdivtwo.theMaxFlowers(flowers, r, c));
    }

}
