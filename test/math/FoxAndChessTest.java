package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class FoxAndChessTest {
    FoxAndChess foxandchess = new FoxAndChess();

    @Test
    public void case1() {
        String begin = "R...";
        String target = "..R.";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case2() {
        String begin = "..R.";
        String target = "R...";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case3() {
        String begin = ".L.R.R.";
        String target = "L...R.R";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case4() {
        String begin = ".L.R.";
        String target = ".R.L.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case5() {
        String begin = "LRLLRLRLLRLLRLRLRL";
        String target = "LRLLRLRLLRLLRLRLRL";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case6() {
        String begin = "L";
        String target = ".";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case7() {
        String begin = "L.LLRRLLRLRRLRLRLRRRLR";
        String target = "LLL.RRLLRLRRLRLRLRRRLR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case8() {
        String begin = "RRLRLLLLRRRLLLRRRRRLRRRRRRLRRRLRRRRLLLRRLL";
        String target = "RRLRLLLLRRRLLLRRRRRLRRRRRRLRRRLRRRRLLLRRLL";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case9() {
        String begin = "......R....LR.L.LR..L.L...";
        String target = "..RL..........L.RR....LL.L";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case10() {
        String begin = "RRR..R...L.LLLR...LLL.LLRRRR.L.LRLRRRRRR.R..RR.";
        String target = "..R.RRR.L..LLLRL.LL.L.L.R.RRRLL.RLR.RRR.RR.RR.R";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case11() {
        String begin = "LLRRRRLRRRL.RLR.R";
        String target = "...LR.LLR.RLL....";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case12() {
        String begin = "..............R";
        String target = "LLR.R.RRLRRL..L";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case13() {
        String begin = "...LLRLLRLLLLLLRLLLR.LL.L.RLLLLLLRL";
        String target = "LRLLRRRL.RRLLLL..RLLLRLLLRRR..RRRR.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case14() {
        String begin = "R..";
        String target = "RRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case15() {
        String begin = "..L.L...L........R.....L";
        String target = ".L......L..RRL..L.L..RLL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case16() {
        String begin = ".RRL.LR.LL.R.LL..LR.L.LR.R.L.R..LRRLL.RR.RL";
        String target = "LLLRRR.RLR.L.RRRL.RLRL.LR.....LL..L.RRL..R.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case17() {
        String begin = "...........R";
        String target = "R..RR....L..";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case18() {
        String begin = "LR.L.";
        String target = "L..R.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case19() {
        String begin = "RLRR.RR..R.RRRRLRRLRRRRRLRRRRL";
        String target = "RLLL.LL.LLRLRLR.RLRRLR.LLL.L..";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case20() {
        String begin = ".L..R.LLR.";
        String target = "RR.R.....L";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case21() {
        String begin = "R.R..RL...R.RR...R..L..............R..L...";
        String target = "....L.....L...R...L.....R..RLR....RR..L...";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case22() {
        String begin = "L.L.LR..L.RLL..LR..LR.RLR.R...R..LLL..LL";
        String target = "L..LR..L...L....R.LRL.R.RLR.L.RRL.RRRRL.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case23() {
        String begin = "RL.R.RRR...RRLL.RL.L.R...R.RL.L.RRR.R....L..R.R";
        String target = ".LL..LL..R.RR..R...L.L..RRR.RLL..L.LRR....RLRLL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case24() {
        String begin = ".RR.RRRRR.RRR.RRR.R.R.R.RR.R...";
        String target = ".....RRRRRR.R.RRR.RR..R.RRRR.RR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case25() {
        String begin = "........................LR......";
        String target = "..L.........................R...";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case26() {
        String begin = "...L.L.LL.L.LL.R.";
        String target = "LLL...LLL..L....R";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case27() {
        String begin = "......RL.LL..L...L...R.LL......L.L....RL";
        String target = "...L.R.....LL....R..R.R...LR.R..LL.R....";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case28() {
        String begin = "RRRRRRRRLLRRRRRRLLRLLL.LLRLRLRL";
        String target = "RLRRRRRL.RLL..LRR..L.LLL.RL.LLL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case29() {
        String begin = "LLR....R..RRRL.......L.R....R.LR.R..RL.RLR";
        String target = "..R.RRR....L..RRL.LL.LL...L.RL...LL..L...R";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case30() {
        String begin = "L.L...RRRL..RL..";
        String target = "R.R.L.L....LRRR.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case31() {
        String begin = "..LLLLLLRLLLRLLRL.RR.LLRLLRRL.RL.L.RRL";
        String target = "RLRLR.RR.LLR.L.LRLRR..R.LLRRRLRLRRLRRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case32() {
        String begin = "R..LL.RL.RLLRR..R....RL.R.....R.R.";
        String target = "L.RRL.L.R.R.RR...R.R.RL.RL..LRR.LR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case33() {
        String begin = "RR..L...RLLLLR...L....LR...LRL";
        String target = "..R..R.RL...L.L.LR.L.L.LR..LLR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case34() {
        String begin = "LLLLLLRR..RRR..R.L.";
        String target = "LLLLLL..R.RR.RRR.L.";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case35() {
        String begin = "R.....R.....R....";
        String target = ".........L...R..R";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case36() {
        String begin = "RRR.L.LLLLLLRR.RRRRR..RRR.R";
        String target = "R.RRLLLLLLL..RRR.RR..RRRRRR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case37() {
        String begin = "LLLLLRRRRLLL.RLL.R.LLRLLLLLRLLR.R";
        String target = "L.LLLL.LR.RLRLLLRLL.LLLLRLLLLRLLR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case38() {
        String begin = "RRRR.RRR.RRRRR.RR.RR.RR..RRRRR.R..RRR.";
        String target = "RR..RR..R.RRRRRRRRRRR..RR.RR.RRR.RRR.R";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case39() {
        String begin = ".RRR.LL.LLL.R.R.RRLLL.LRRRLR.LL.....LRL...LR.";
        String target = "...LRL.L.RRR.L.LR.R..RLL..L.LRLR.L.L.RRLRRLL.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case40() {
        String begin = ".RLRRL.LL..RLR.....LRR.R..R..RRLRLLR.R.LLL.LLRL..";
        String target = "LLRRLLRL.LL....R.RL..LRL.R..LRRLRLLR....L.L.LLL..";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case41() {
        String begin = "RL.RLR..L.R.R..L.R..R";
        String target = "..LRL.........RR....L";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case42() {
        String begin = ".RLLL";
        String target = "LL.RL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case43() {
        String begin = "..L........L..............L.L......";
        String target = ".LL.L................L.............";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case44() {
        String begin = "LLLRLRRLLLL.RLR";
        String target = "RLLLRRR.LRRRL..";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case45() {
        String begin = "R.LRR";
        String target = "LLLL.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case46() {
        String begin = "...L....RRR.LL..R..RL.R.R..R...R.L.......RR.LR";
        String target = ".LLL..RLLL.R.RRR.L.LLLLLL..LRRL...LRL...L.....";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case47() {
        String begin = "LL..LLRRLR..L.";
        String target = "LLLLRRLLRRLLRL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case48() {
        String begin = ".RLL.LR..R..RR.RR.R.R..LLLLLR.RL.L.LL.LL.L.L";
        String target = ".RLLL......R.RRRRRR..RLLLLL..RRLLLLLL.L.L...";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case49() {
        String begin = "LLL";
        String target = "LLL";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case50() {
        String begin = "...LR......R...R...";
        String target = "R....LR...........R";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case51() {
        String begin = "LLLRLL.RR..RRRRL.R...L..RRLL....L.L.L";
        String target = "...L..........RR...R..L.R.L.LLL..R...";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case52() {
        String begin = "LRLLR.R...RLL..L";
        String target = "RRLLLLL.RRLRLRRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case53() {
        String begin = "RL.R.RR.RRLLL.RL.RL";
        String target = "LL.RR.LLL.LRR.LLRR.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case54() {
        String begin = "LRR.R.LL.LLR.L.LLL.RRR.LRR.RL..LLR...L.LLLLR.RRRR.";
        String target = "L.RR.RLLL.LRL.LLL..RRRL..RRRLL..L..RLL.LLL..R.RRRR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case55() {
        String begin = "RLRRRRRR..RRR.RR.L..R.RR..RR.RR.RR..LR..R...";
        String target = "RL...R.RRRRRRRRRRL....R.R..RRRR..RRRL...R.R.";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case56() {
        String begin = "RLLLRLLRLLLRLRLLR.RLR.R.LRLRLRRLLR.";
        String target = "LRLLRRR.L.LLLLLLLRRLLLLRRR.RRLL.RLL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case57() {
        String begin = "L.L.R..";
        String target = "LRRLRRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case58() {
        String begin = "L...L..RL.R.LL.R..L.R...L..R.";
        String target = ".......LRR..RLL..LR.L...LRL..";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case59() {
        String begin = "R";
        String target = "R";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case60() {
        String begin = "RRRRLR.R.R.RLRR...LR...L.RRL";
        String target = "LRLR.L.L..L.LLLL..LLR..RRLR.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case61() {
        String begin = "RLL.RL.RLRLRLRLLRR.L.L";
        String target = "..LR.LR.RRLRRRRRLRRLLL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case62() {
        String begin = "LLRRRRRR.RRRRRRRRRRRRRRRRRRRRRRRRRRRRRR.LL";
        String target = "LL.RR.RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRLL";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case63() {
        String begin = "RRRLRLRR.RR.R.L.R";
        String target = "RLRLR...RL.LLLLRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case64() {
        String begin = "RLR.RRRR.LL..R.LRR";
        String target = "LR.RLL..RLRLRLRLLR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case65() {
        String begin = "RRL";
        String target = ".RL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case66() {
        String begin = "R..RRLLRRR.LRR...L";
        String target = ".RLRLLL.LR....LRLR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case67() {
        String begin = "L.RRL";
        String target = ".RLRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case68() {
        String begin = "..LLL";
        String target = "LLL..";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case69() {
        String begin = "RRLLRLLLLRRL.R.RLLLLRRLRRLLLLLLRRRRRLLRRLRL";
        String target = "LRRRLRR.LLLLRRLLRRR.LRRRLLLLRLRLRLLRLLLRLRL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case70() {
        String begin = ".L";
        String target = "LL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case71() {
        String begin = ".R.......";
        String target = "........R";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case72() {
        String begin = "LR.LRLR.L.LLRLRLRRR.RRRLRRLLR.LRRLRL..LRRRRRRLLRL";
        String target = "...............R.R........R...........R.....R....";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case73() {
        String begin = "RL.";
        String target = "RL.";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case74() {
        String begin = "....R.....................R.............";
        String target = ".L.L..RRLLLLLRL.RL.R.LL.L..RLRR..RR...R.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case75() {
        String begin = "LRL..LL.LLLRRLLL.L";
        String target = "R.L..LLLLLRRRRRR.L";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case76() {
        String begin = "........LLL..R...L";
        String target = ".L.LL........R.L..";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case77() {
        String begin = ".....LL.LLR.........R..R.....";
        String target = "..LL.LL.............R..R...R.";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case78() {
        String begin = "L..R....LLR...R.R.....LL.....L.L.R...L..";
        String target = "......................L.....LRR...R.L...";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case79() {
        String begin = "..R.";
        String target = "L.LR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case80() {
        String begin = "RLLRRRRL.LRLR.L.";
        String target = "L..RLR.R....R.L.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case81() {
        String begin = "RRLRRRRLLRLRLLRLLLLRLRLR";
        String target = "LLRRRR.LRLLRRLLRLRRLR.RR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case82() {
        String begin = "LL";
        String target = "LR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case83() {
        String begin = "LLRRLRLRLLL";
        String target = "LLRRLRLRLLL";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case84() {
        String begin = "LLLRL.LLLLRRRLLRLL.R..RR";
        String target = ".RRRR..L.LRL.LLLR.RLR.RR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case85() {
        String begin = ".L";
        String target = "L.";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case86() {
        String begin = "R...R.RLRRL.RL.";
        String target = ".LR.R.R..R.LRLR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case87() {
        String begin = "L.L..LL.R.LLL.";
        String target = "...L....L.....";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case88() {
        String begin = ".....L....L.";
        String target = "LR...L.RR.LR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case89() {
        String begin = ".LR.L.LL.";
        String target = "L..RLLL..";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case90() {
        String begin = "LRRRRRRRRRRRRRR.RRR";
        String target = "LR.RRRRRRRRRRRRRRRR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case91() {
        String begin = ".L.R.R....LR.";
        String target = "....LLR..R.L.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case92() {
        String begin = "L.LLL";
        String target = "LL.LL";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case93() {
        String begin = "..RR.RRR.RRRRRRR.R.R...R..RR....RR.L.RRR.";
        String target = "..R..R...R..RR.RRRR.R..RR.R.RRRR.RRL..RRR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case94() {
        String begin = "R.RRRRR.RR.R.R.RRR.R.R..R.R...R.RRRRRRR.R..";
        String target = "...RR..R....RR.R.RR.R.RRRR..RRRR.RRRRRRRR.R";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case95() {
        String begin = "........R..R..R..............L...L..........";
        String target = "L......L..R............R..R.R..L..R...R.L...";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case96() {
        String begin = "..................L.....R..............R..R.";
        String target = "L..L..L...L.................................";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case97() {
        String begin = "...L....";
        String target = ".L......";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case98() {
        String begin = "LR.RRLRRRLR.RRRLR.LRRLL.LRRR";
        String target = "RR.RLR.LR.RL.LRRLLLRLL.RR..R";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case99() {
        String begin = ".RRLL.L.R.LR.RRLLRLLLRRLLRRRRRRLL.LR";
        String target = "L.L.R...L..R.L..........RL....L...RL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case100() {
        String begin = "RR...RRRR.LLL..L";
        String target = ".LR.RLLL.R.L.R.R";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case101() {
        String begin = "R.R.R.RR.LR.LL....LL....L.LLLL.LLLL.LLL...L..LLL";
        String target = "R...RRR.RLRLL.LLLL.LLLL.....LLL....LLL..L.LL...L";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case102() {
        String begin = "LR";
        String target = "LR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case103() {
        String begin = "..R...LL";
        String target = ".L.RL...";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case104() {
        String begin = ".......R....L..";
        String target = ".........R.L...";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case105() {
        String begin = ".......................L....................";
        String target = "..L.........................................";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case106() {
        String begin = "...........L...R........L...R....";
        String target = ".....R...............R.L.......R.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case107() {
        String begin = ".";
        String target = "L";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case108() {
        String begin = "LR..";
        String target = "LRRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case109() {
        String begin = "R";
        String target = ".";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case110() {
        String begin = "L.";
        String target = "LR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case111() {
        String begin = "RL";
        String target = "LR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case112() {
        String begin = "..R.L..";
        String target = ".L...R.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case113() {
        String begin = ".LR..";
        String target = ".L..R";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case114() {
        String begin = ".R.";
        String target = ".RL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case115() {
        String begin = "RR..";
        String target = "..RR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case116() {
        String begin = ".";
        String target = "R";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case117() {
        String begin = "L.";
        String target = "LL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case118() {
        String begin = "...";
        String target = "..L";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case119() {
        String begin = "..............................LLLLLLLLLLLLLLLLLLLL";
        String target = "LLLLLLLLLLLLLLLLLLLL..............................";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case120() {
        String begin = "..";
        String target = ".L";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case121() {
        String begin = "R.R";
        String target = "RR.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case122() {
        String begin = "LRRR...L.R.LLLL.R.....LL.LRR..........";
        String target = "L..RRLR...RLLLL....RLLL...R......R....";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case123() {
        String begin = "R..L";
        String target = ".LR.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case124() {
        String begin = "RRRRRRRRRRRRRRRRRRRR..............................";
        String target = "RRRRRRRRRRRRRRRRRRRR..............................";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case125() {
        String begin = ".....";
        String target = "LLRRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case126() {
        String begin = "..";
        String target = "..";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case127() {
        String begin = ".LR";
        String target = "LR.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case128() {
        String begin = ".LL";
        String target = "LL.";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case129() {
        String begin = ".RL.";
        String target = ".LR.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case130() {
        String begin = "L.R.RR";
        String target = "L.RR.R";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case131() {
        String begin = "L.L";
        String target = ".LL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case132() {
        String begin = "RRRRRRRRRRRRRRRRRRRRRRRRR.........................";
        String target = "..................................................";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case133() {
        String begin = "R.";
        String target = "LR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case134() {
        String begin = "L.L.L";
        String target = "L..LL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case135() {
        String begin = "..";
        String target = "LR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case136() {
        String begin = "RR.";
        String target = ".RR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case137() {
        String begin = "...";
        String target = ".LR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case138() {
        String begin = "R..L";
        String target = "L..R";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case139() {
        String begin = "RRRRR........................................LLLLL";
        String target = "...................RRRRRLLLLL.....................";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case140() {
        String begin = "RR.";
        String target = "RRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case141() {
        String begin = "RR...";
        String target = "...RR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case142() {
        String begin = "L.";
        String target = ".L";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case143() {
        String begin = "...L..";
        String target = "...LL.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case144() {
        String begin = "R...R....R.....R...R....L......L.....L.....L.....L";
        String target = "..................................................";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case145() {
        String begin = "R";
        String target = "L";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case146() {
        String begin = "R.....R.....R.....R.....R.....R.....R.....R.......";
        String target = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case147() {
        String begin = "R...";
        String target = "..RR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case148() {
        String begin = "RL.";
        String target = "L.R";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case149() {
        String begin = "R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R";
        String target = "........................RRRRRRRRRRRRRRRRRRRRRRRRR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case150() {
        String begin = ".R.R.R...R...L..L.L.R.R.L.R..R...R..R.L.R.L.R.R.R.";
        String target = "..................................................";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case151() {
        String begin = "RRRRR.....";
        String target = ".....RRRRR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case152() {
        String begin = "L.L";
        String target = "LRL";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case153() {
        String begin = "RL.";
        String target = ".LR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case154() {
        String begin = ".R.L";
        String target = "L.R.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case155() {
        String begin = ".RL.";
        String target = "L..R";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case156() {
        String begin = "....";
        String target = "..RR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case157() {
        String begin = "RRR..LLL";
        String target = ".RRRLLL.";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case158() {
        String begin = ".L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L";
        String target = "RL.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L.L";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case159() {
        String begin = "RLR.LR";
        String target = "RL.RLR";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case160() {
        String begin = "R....L";
        String target = ".L..R.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case161() {
        String begin = "RRL.";
        String target = ".RLR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case162() {
        String begin = "..";
        String target = "RR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case163() {
        String begin = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR..RL";
        String target = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR..LR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case164() {
        String begin = ".LR";
        String target = "L.R";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case165() {
        String begin = "L...L...L";
        String target = "LLL......";
        assertEquals("Possible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case166() {
        String begin = "LR.";
        String target = "LRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case167() {
        String begin = "RRLR";
        String target = "RLRR";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case168() {
        String begin = ".....";
        String target = "...R.";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

    @Test
    public void case169() {
        String begin = "R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.";
        String target = "..................................................";
        assertEquals("Impossible", foxandchess.ableToMove(begin, target));
    }

}
