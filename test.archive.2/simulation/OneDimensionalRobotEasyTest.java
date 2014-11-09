package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class OneDimensionalRobotEasyTest {
    OneDimensionalRobotEasy onedimensionalroboteasy = new OneDimensionalRobotEasy();

    @Test
    public void case1() {
        String commands = "RRLRRLLR";
        int A = 10;
        int B = 10;
        assertEquals(2, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case2() {
        String commands = "RRRRR";
        int A = 3;
        int B = 4;
        assertEquals(4, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case3() {
        String commands = "LLLLLLLLLLR";
        int A = 2;
        int B = 6;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case4() {
        String commands = "RRLRRRRRRRRRRRRLR";
        int A = 8;
        int B = 17;
        assertEquals(13, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case5() {
        String commands = "LRRLRLRLLRLLLRRRRRLRLLRRRRLLLLRRLRRLRLLL";
        int A = 4;
        int B = 38;
        assertEquals(0, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case6() {
        String commands = "RRRRLRRLLLRRLRLRRRRLRRRLLRRRRLLRRRLRRLRRLRRRRL";
        int A = 41;
        int B = 32;
        assertEquals(16, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case7() {
        String commands = "LRLLLRRLLLLRLL";
        int A = 15;
        int B = 29;
        assertEquals(-6, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case8() {
        String commands = "LLLLLLLLLLLLLLLLRLLLLLLLLLLLRLLLLLLLLLL";
        int A = 8;
        int B = 20;
        assertEquals(-8, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case9() {
        String commands = "LRR";
        int A = 32;
        int B = 9;
        assertEquals(1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case10() {
        String commands = "LRLRRLR";
        int A = 4;
        int B = 49;
        assertEquals(1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case11() {
        String commands = "RLLRRLLRLLRLRRRLRRRLLRLRR";
        int A = 28;
        int B = 20;
        assertEquals(3, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case12() {
        String commands = "LLLLLLLLLLLLLLLLLLLLLLL";
        int A = 16;
        int B = 27;
        assertEquals(-16, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case13() {
        String commands = "LRRLRLRRRRRRRRLRRRRR";
        int A = 27;
        int B = 40;
        assertEquals(12, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case14() {
        String commands = "RLRRLRRLLRLRRRLRRLLRLR";
        int A = 44;
        int B = 42;
        assertEquals(4, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case15() {
        String commands = "LLLRRLLLRLLLRLRLRLLR";
        int A = 1;
        int B = 16;
        assertEquals(0, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case16() {
        String commands = "RRRRRRRRRRRLRRRRRRRRRRRRRRRRRRRRRRRR";
        int A = 33;
        int B = 19;
        assertEquals(19, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case17() {
        String commands = "RLLLLLLRRLRLRLRRLRLRRRRLRRRLRRLLLLRLLRRLRLLLRLLRLR";
        int A = 32;
        int B = 15;
        assertEquals(-2, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case18() {
        String commands = "RLRLRLLLLLLRLL";
        int A = 2;
        int B = 15;
        assertEquals(-2, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case19() {
        String commands = "RLRRRRLLRRLRRRRLLRRRRRRLRRRRRLRLRRRRLRRLRLRRLRLLRR";
        int A = 40;
        int B = 4;
        assertEquals(4, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case20() {
        String commands = "RRRRRRRRRRRRRRRRLRRRRRRRLRRRRRRRRRRRRRRRRRRRRLRLRL";
        int A = 21;
        int B = 21;
        assertEquals(20, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case21() {
        String commands = "RLLLLLLRLRLLLLRRLLLRRRLLLRRLLRLLLRLLLRRRRRRLRLLLLL";
        int A = 26;
        int B = 47;
        assertEquals(-12, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case22() {
        String commands = "LLLLLRLLLLLLLLLLLLLLLLLLLLLLLLLLRLLLRLLLLLLLLLLLLL";
        int A = 5;
        int B = 8;
        assertEquals(-5, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case23() {
        String commands = "RRRRRRRLRRLRRRRRRRRRRRRLRLRRRRRRRRLRRRRRLRRRRRRRRR";
        int A = 5;
        int B = 20;
        assertEquals(20, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case24() {
        String commands = "RRRRRRRRRRRLRRLRRRLLRRRRRRRRRRLRRRRRLLRLRRRRRRRLRR";
        int A = 13;
        int B = 24;
        assertEquals(24, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case25() {
        String commands = "LLRRRRRRRRRRLRRRRLRRRRRRRLRRRRRRRLLRRRRRRRRRRRRRLL";
        int A = 29;
        int B = 28;
        assertEquals(26, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case26() {
        String commands = "RLRRLLRLRLLLRLRRRLRLLRLLRRLRRRRRLRRLRRRRLRLLRLRLLR";
        int A = 37;
        int B = 33;
        assertEquals(6, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case27() {
        String commands = "LLLLLLLLLLRRLLLLLLLLLLLLLLLLRLLLLLLLLLLLLLLLLLRLLL";
        int A = 24;
        int B = 15;
        assertEquals(-24, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case28() {
        String commands = "RRLLLLLLLRLRRLRLRLLRRRRLLRRRLRRLRRRLRRRLRRLRRLRRLR";
        int A = 8;
        int B = 42;
        assertEquals(8, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case29() {
        String commands = "RLRLLLLLLLRLLLRLLLLLLLLRLLLLLRLLLRRLLLLLRLLLLLRLLL";
        int A = 34;
        int B = 15;
        assertEquals(-30, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case30() {
        String commands = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        int A = 1;
        int B = 22;
        assertEquals(22, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case31() {
        String commands = "RRRLRRRRRLRRRRRRRRRLLLRRLRLLRLLRRRRLLRRRRRRRLLRRRL";
        int A = 32;
        int B = 26;
        assertEquals(20, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case32() {
        String commands = "LLLLLRLLLLRLLLLLLLRLLLLLLRLLLLRLLLLLLLLLLLRRLLLRLL";
        int A = 28;
        int B = 33;
        assertEquals(-28, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case33() {
        String commands = "RRRRRRRLRRRRRLRRRRRLRRRRRRRLRRRRRRRLRRRRRRRRRRRRRR";
        int A = 17;
        int B = 11;
        assertEquals(11, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case34() {
        String commands = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        int A = 50;
        int B = 50;
        assertEquals(-50, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case35() {
        String commands = "L";
        int A = 50;
        int B = 50;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case36() {
        String commands = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        int A = 1;
        int B = 50;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case37() {
        String commands = "L";
        int A = 1;
        int B = 50;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case38() {
        String commands = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        int A = 50;
        int B = 1;
        assertEquals(-50, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case39() {
        String commands = "L";
        int A = 50;
        int B = 1;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case40() {
        String commands = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        int A = 1;
        int B = 1;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case41() {
        String commands = "L";
        int A = 1;
        int B = 1;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case42() {
        String commands = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        int A = 50;
        int B = 50;
        assertEquals(50, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case43() {
        String commands = "R";
        int A = 50;
        int B = 50;
        assertEquals(1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case44() {
        String commands = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        int A = 1;
        int B = 50;
        assertEquals(50, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case45() {
        String commands = "R";
        int A = 1;
        int B = 50;
        assertEquals(1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case46() {
        String commands = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        int A = 50;
        int B = 1;
        assertEquals(1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case47() {
        String commands = "R";
        int A = 50;
        int B = 1;
        assertEquals(1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case48() {
        String commands = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        int A = 1;
        int B = 1;
        assertEquals(1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case49() {
        String commands = "R";
        int A = 1;
        int B = 1;
        assertEquals(1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case50() {
        String commands = "RRL";
        int A = 1;
        int B = 10;
        assertEquals(1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case51() {
        String commands = "RRLL";
        int A = 1;
        int B = 1;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case52() {
        String commands = "LLLLLLLLLLL";
        int A = 5;
        int B = 1;
        assertEquals(-5, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case53() {
        String commands = "L";
        int A = 1;
        int B = 10;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case54() {
        String commands = "RRRRRRRRR";
        int A = 2;
        int B = 6;
        assertEquals(6, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case55() {
        String commands = "RR";
        int A = 1;
        int B = 1;
        assertEquals(1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case56() {
        String commands = "RRRLLL";
        int A = 3;
        int B = 5;
        assertEquals(0, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case57() {
        String commands = "RRRLLL";
        int A = 2;
        int B = 2;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case58() {
        String commands = "RRRRL";
        int A = 2;
        int B = 4;
        assertEquals(3, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case59() {
        String commands = "LLR";
        int A = 1;
        int B = 2;
        assertEquals(0, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case60() {
        String commands = "RRRRRRRRRLLL";
        int A = 3;
        int B = 2;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case61() {
        String commands = "LLLLLLL";
        int A = 2;
        int B = 5;
        assertEquals(-2, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case62() {
        String commands = "RR";
        int A = 10;
        int B = 1;
        assertEquals(1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case63() {
        String commands = "LLLLLLLLLLRRRLLLLRLRL";
        int A = 10;
        int B = 40;
        assertEquals(-10, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case64() {
        String commands = "LRRRRR";
        int A = 10;
        int B = 10;
        assertEquals(4, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case65() {
        String commands = "RRLL";
        int A = 1;
        int B = 3;
        assertEquals(0, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case66() {
        String commands = "RRR";
        int A = 2;
        int B = 2;
        assertEquals(2, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case67() {
        String commands = "RRRLL";
        int A = 2;
        int B = 2;
        assertEquals(0, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case68() {
        String commands = "L";
        int A = 1;
        int B = 2;
        assertEquals(-1, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

    @Test
    public void case69() {
        String commands = "RRLRRLRRL";
        int A = 2;
        int B = 20;
        assertEquals(3, onedimensionalroboteasy.finalPosition(commands, A, B));
    }

}
