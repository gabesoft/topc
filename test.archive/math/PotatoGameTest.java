package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PotatoGameTest {
    PotatoGame potatogame = new PotatoGame();

    @Test
    public void case1() {
        int n = 1;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case2() {
        int n = 2;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case3() {
        int n = 3;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case4() {
        int n = 4;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case5() {
        int n = 5;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case6() {
        int n = 6;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case7() {
        int n = 7;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case8() {
        int n = 8;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case9() {
        int n = 9;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case10() {
        int n = 1000000000;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case11() {
        int n = 999999999;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case12() {
        int n = 999999998;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case13() {
        int n = 999999997;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case14() {
        int n = 999999996;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case15() {
        int n = 999999995;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case16() {
        int n = 999999994;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case17() {
        int n = 999999993;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case18() {
        int n = 999999992;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case19() {
        int n = 536870909;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case20() {
        int n = 536870910;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case21() {
        int n = 536870911;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case22() {
        int n = 536870912;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case23() {
        int n = 536870913;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case24() {
        int n = 536870914;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case25() {
        int n = 536870915;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case26() {
        int n = 73;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case27() {
        int n = 12;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case28() {
        int n = 400;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case29() {
        int n = 756;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case30() {
        int n = 9119;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case31() {
        int n = 6351;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case32() {
        int n = 52843;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case33() {
        int n = 18705;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case34() {
        int n = 754108;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case35() {
        int n = 846393;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case36() {
        int n = 6118330;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case37() {
        int n = 9932169;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case38() {
        int n = 83226917;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case39() {
        int n = 95669847;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case40() {
        int n = 877206980;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case41() {
        int n = 501950427;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case42() {
        int n = 9999998;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case43() {
        int n = 9999;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case44() {
        int n = 13;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case45() {
        int n = 22;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case46() {
        int n = 102;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case47() {
        int n = 19999999;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case48() {
        int n = 535432525;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case49() {
        int n = 15;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case50() {
        int n = 991829257;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case51() {
        int n = 100000000;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case52() {
        int n = 41432437;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case53() {
        int n = 30;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case54() {
        int n = 999966512;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case55() {
        int n = 987345765;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case56() {
        int n = 7605203;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case57() {
        int n = 444444444;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case58() {
        int n = 173;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case59() {
        int n = 10;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case60() {
        int n = 987987987;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case61() {
        int n = 974782859;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case62() {
        int n = 19;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case63() {
        int n = 998997992;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case64() {
        int n = 67;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case65() {
        int n = 34;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case66() {
        int n = 1324322;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case67() {
        int n = 192;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case68() {
        int n = 256;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case69() {
        int n = 500000000;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case70() {
        int n = 7788;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case71() {
        int n = 1000;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case72() {
        int n = 99988789;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case73() {
        int n = 388148910;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case74() {
        int n = 200;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case75() {
        int n = 35;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case76() {
        int n = 17;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case77() {
        int n = 10000009;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case78() {
        int n = 10000000;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case79() {
        int n = 80;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case80() {
        int n = 11478;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case81() {
        int n = 16;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case82() {
        int n = 13214;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case83() {
        int n = 334424233;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case84() {
        int n = 265353484;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case85() {
        int n = 100;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case86() {
        int n = 999999;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case87() {
        int n = 14;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case88() {
        int n = 20;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case89() {
        int n = 987998764;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case90() {
        int n = 25;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case91() {
        int n = 998799634;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case92() {
        int n = 68;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case93() {
        int n = 18;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case94() {
        int n = 123456789;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case95() {
        int n = 334424238;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case96() {
        int n = 99;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case97() {
        int n = 987345998;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case98() {
        int n = 64;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case99() {
        int n = 174576865;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case100() {
        int n = 354339;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case101() {
        int n = 949199136;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case102() {
        int n = 28;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case103() {
        int n = 32;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case104() {
        int n = 18467;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case105() {
        int n = 259;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case106() {
        int n = 131074;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case107() {
        int n = 989998898;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case108() {
        int n = 19169;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case109() {
        int n = 98742;
        assertEquals("Hanako", potatogame.theWinner(n));
    }

    @Test
    public void case110() {
        int n = 999;
        assertEquals("Taro", potatogame.theWinner(n));
    }

    @Test
    public void case111() {
        int n = 76;
        assertEquals("Taro", potatogame.theWinner(n));
    }

}
