package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class GearsDiv2Test {
    GearsDiv2 gearsdiv2 = new GearsDiv2();

    @Test
    public void case1() {
        String directions = "LRRR";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case2() {
        String directions = "RRR";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case3() {
        String directions = "LRLR";
        assertEquals(0, gearsdiv2.getmin(directions));
    }

    @Test
    public void case4() {
        String directions = "LRLLRRLLLRRRLLLL";
        assertEquals(6, gearsdiv2.getmin(directions));
    }

    @Test
    public void case5() {
        String directions = "LRLLRLRLRLLLRLRRLLLLLLLLLLRLRLRLRRRRRLRRLRLRL";
        assertEquals(12, gearsdiv2.getmin(directions));
    }

    @Test
    public void case6() {
        String directions = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertEquals(25, gearsdiv2.getmin(directions));
    }

    @Test
    public void case7() {
        String directions = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertEquals(25, gearsdiv2.getmin(directions));
    }

    @Test
    public void case8() {
        String directions = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        assertEquals(24, gearsdiv2.getmin(directions));
    }

    @Test
    public void case9() {
        String directions = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        assertEquals(24, gearsdiv2.getmin(directions));
    }

    @Test
    public void case10() {
        String directions = "LRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLR";
        assertEquals(0, gearsdiv2.getmin(directions));
    }

    @Test
    public void case11() {
        String directions = "RLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLR";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case12() {
        String directions = "RLL";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case13() {
        String directions = "LRRR";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case14() {
        String directions = "LLLRR";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case15() {
        String directions = "RRLLRR";
        assertEquals(3, gearsdiv2.getmin(directions));
    }

    @Test
    public void case16() {
        String directions = "LLRLRRR";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case17() {
        String directions = "LRRRLLRL";
        assertEquals(3, gearsdiv2.getmin(directions));
    }

    @Test
    public void case18() {
        String directions = "LRLRRRLRL";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case19() {
        String directions = "LRRLRLLLRL";
        assertEquals(3, gearsdiv2.getmin(directions));
    }

    @Test
    public void case20() {
        String directions = "RRRRLLLRLLR";
        assertEquals(4, gearsdiv2.getmin(directions));
    }

    @Test
    public void case21() {
        String directions = "RRLLRRRLRLLL";
        assertEquals(4, gearsdiv2.getmin(directions));
    }

    @Test
    public void case22() {
        String directions = "LRRRLRLLLRLRL";
        assertEquals(3, gearsdiv2.getmin(directions));
    }

    @Test
    public void case23() {
        String directions = "LLRLRLRRRLLRRL";
        assertEquals(4, gearsdiv2.getmin(directions));
    }

    @Test
    public void case24() {
        String directions = "RLLLLLRRRLLLRRR";
        assertEquals(6, gearsdiv2.getmin(directions));
    }

    @Test
    public void case25() {
        String directions = "LLLRLRRRRLRRRRLR";
        assertEquals(5, gearsdiv2.getmin(directions));
    }

    @Test
    public void case26() {
        String directions = "RRRRLLLRRLLLRLLRR";
        assertEquals(7, gearsdiv2.getmin(directions));
    }

    @Test
    public void case27() {
        String directions = "RLRLRRLLRRLRRRRLRR";
        assertEquals(6, gearsdiv2.getmin(directions));
    }

    @Test
    public void case28() {
        String directions = "LRRLLRLLRLRLRLRLRRR";
        assertEquals(4, gearsdiv2.getmin(directions));
    }

    @Test
    public void case29() {
        String directions = "RRLLLRRLRRLLLLRRLLRR";
        assertEquals(9, gearsdiv2.getmin(directions));
    }

    @Test
    public void case30() {
        String directions = "LRLLLRRRRLRLLLRRRLLLL";
        assertEquals(7, gearsdiv2.getmin(directions));
    }

    @Test
    public void case31() {
        String directions = "LLRLRLLRRLRRRLLRLRRRRR";
        assertEquals(7, gearsdiv2.getmin(directions));
    }

    @Test
    public void case32() {
        String directions = "RLRLRLLLLLLLRRLLRLLLLRR";
        assertEquals(8, gearsdiv2.getmin(directions));
    }

    @Test
    public void case33() {
        String directions = "LRLLRLRLRRLRRRLRRRLLRRRL";
        assertEquals(7, gearsdiv2.getmin(directions));
    }

    @Test
    public void case34() {
        String directions = "LLRLLRRLLLRRLLRLLLLLRLRLR";
        assertEquals(8, gearsdiv2.getmin(directions));
    }

    @Test
    public void case35() {
        String directions = "LLLLRRRRRRLRRLRRRRRLLLRRRL";
        assertEquals(10, gearsdiv2.getmin(directions));
    }

    @Test
    public void case36() {
        String directions = "LLRLLRRRRRLRRRRLRRLLRRLRRLR";
        assertEquals(10, gearsdiv2.getmin(directions));
    }

    @Test
    public void case37() {
        String directions = "LLLLRRRLLRLLRLLLRRLLRRRLRRLL";
        assertEquals(11, gearsdiv2.getmin(directions));
    }

    @Test
    public void case38() {
        String directions = "RLLLLLRLRLRLLLLRRRLLLRRRLRRRR";
        assertEquals(9, gearsdiv2.getmin(directions));
    }

    @Test
    public void case39() {
        String directions = "LLRRRLLLLRRRRRRRLLLLLRLRLLRLRL";
        assertEquals(10, gearsdiv2.getmin(directions));
    }

    @Test
    public void case40() {
        String directions = "RLRRRRLLRLLRRLRRLRRRRLRLRRLLRLL";
        assertEquals(11, gearsdiv2.getmin(directions));
    }

    @Test
    public void case41() {
        String directions = "RRRRLRLRRRLLLLLLRRRLLLRRLRLRLLLR";
        assertEquals(10, gearsdiv2.getmin(directions));
    }

    @Test
    public void case42() {
        String directions = "LLRRRLLLRLLLLRRLLRLLLRLRLLRRLLLLR";
        assertEquals(12, gearsdiv2.getmin(directions));
    }

    @Test
    public void case43() {
        String directions = "LRLLRLRRRLLLRRLRLLRLRRRRRRLLRRLLRL";
        assertEquals(12, gearsdiv2.getmin(directions));
    }

    @Test
    public void case44() {
        String directions = "RLRLRRLRLLRLLRLRRLLRLRRLLRRRLRRRLLR";
        assertEquals(11, gearsdiv2.getmin(directions));
    }

    @Test
    public void case45() {
        String directions = "RRLLLRLLLRRLRLRRRLRLRLRRRRRRLRLRLRLL";
        assertEquals(9, gearsdiv2.getmin(directions));
    }

    @Test
    public void case46() {
        String directions = "LRLRLLRLRRLRLLLRLLLRLRLRRLRLRLLRRLRRR";
        assertEquals(8, gearsdiv2.getmin(directions));
    }

    @Test
    public void case47() {
        String directions = "LLRLLLRRLRLRRLLLLLLRLLLRRLLRLLRRLLLLRL";
        assertEquals(14, gearsdiv2.getmin(directions));
    }

    @Test
    public void case48() {
        String directions = "RLLLRRLRRLRLRLLLRRRLRLLLRRLRLLRLRLLRRRR";
        assertEquals(11, gearsdiv2.getmin(directions));
    }

    @Test
    public void case49() {
        String directions = "LRRLLLRRRLLRLLRLRLLRRLLRLLLLRRRLRRLRRLRL";
        assertEquals(14, gearsdiv2.getmin(directions));
    }

    @Test
    public void case50() {
        String directions = "LRLRRRLRRRRRRRRLLRRLLLLRLRLRRRRRRLRRLLRLR";
        assertEquals(14, gearsdiv2.getmin(directions));
    }

    @Test
    public void case51() {
        String directions = "LRRRLLLLLLLRLRLRLLRLLRRLRRLRLRLRRRLRLLRLRL";
        assertEquals(11, gearsdiv2.getmin(directions));
    }

    @Test
    public void case52() {
        String directions = "LLRLLLLRRRRRLLLRLRLLLRLLRLLRRLLLRLRRRLRRLRL";
        assertEquals(13, gearsdiv2.getmin(directions));
    }

    @Test
    public void case53() {
        String directions = "RRRLLRRLRLRRRRLRRRRLLLRRLRRRRRLRLLRLRLLRLRRL";
        assertEquals(14, gearsdiv2.getmin(directions));
    }

    @Test
    public void case54() {
        String directions = "RRLLRRLRRLRRLRRLLLLLLRLRRRRLLLLRLLRLRLLRLLRRR";
        assertEquals(17, gearsdiv2.getmin(directions));
    }

    @Test
    public void case55() {
        String directions = "LRRRRRRLLRLRRRRLRRLLLLRRLLLRRLRRLLLRLLRLLRLLRR";
        assertEquals(18, gearsdiv2.getmin(directions));
    }

    @Test
    public void case56() {
        String directions = "RLRLLRLRRRLRLLLRRRRLLLLLRLRLRLRRLRRLLLRLRLRRLLL";
        assertEquals(12, gearsdiv2.getmin(directions));
    }

    @Test
    public void case57() {
        String directions = "LRLLRRRRLLRRRLLLLRRRRLRRLLRLLLLRLLRRLLLRLLRRRLLR";
        assertEquals(19, gearsdiv2.getmin(directions));
    }

    @Test
    public void case58() {
        String directions = "RRRRLLLRLLRLLRRLRRRLLLLRRLRLRLRLRLLLRLRLRRLLRLLLL";
        assertEquals(15, gearsdiv2.getmin(directions));
    }

    @Test
    public void case59() {
        String directions = "LLRLLRRLRRLRRLLLRRLRRLLRRRRLLLLLLLRRLLLRLRRLRRLRRR";
        assertEquals(19, gearsdiv2.getmin(directions));
    }

    @Test
    public void case60() {
        String directions = "RRRRRRRLRRRRRRRLRLRLLRLRLRLRRLRLRLLLRLRLLRLLRRLRRR";
        assertEquals(14, gearsdiv2.getmin(directions));
    }

    @Test
    public void case61() {
        String directions = "LRRLLLRRLRRLLRRLRLLRRLLLRLRRRRLRLLLLRLRLRLLRLLLLRR";
        assertEquals(17, gearsdiv2.getmin(directions));
    }

    @Test
    public void case62() {
        String directions = "LLRL";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case63() {
        String directions = "RRLLRRLRLRRLLLRLLLRLRLLLRLRLLRLRLLRLLRLLRLRLRLLR";
        assertEquals(12, gearsdiv2.getmin(directions));
    }

    @Test
    public void case64() {
        String directions = "LLRLRLRLLRRRLLRLRLRRLRLRLRLRRLRLLRLRRLRLRLRLLRLRRL";
        assertEquals(10, gearsdiv2.getmin(directions));
    }

    @Test
    public void case65() {
        String directions = "LLLLLLLLLLLLLLLRLRRRRLLLLLLLLLLLLLLLLLRLRLL";
        assertEquals(18, gearsdiv2.getmin(directions));
    }

    @Test
    public void case66() {
        String directions = "RRLRLR";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case67() {
        String directions = "RRLRLRLRLLRLRLRLRRLRLRLLLRLRLLRLLRRLRRRLLRRLLLR";
        assertEquals(11, gearsdiv2.getmin(directions));
    }

    @Test
    public void case68() {
        String directions = "RRLLLRLR";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case69() {
        String directions = "RRLR";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case70() {
        String directions = "RLRLLRLLLRRRLRLRLRRRLRLRLRLLRLRLLLLLRRLRLLLLRLLLLR";
        assertEquals(13, gearsdiv2.getmin(directions));
    }

    @Test
    public void case71() {
        String directions = "LLLLLLL";
        assertEquals(4, gearsdiv2.getmin(directions));
    }

    @Test
    public void case72() {
        String directions = "LLRLLRRLLLRRRLLL";
        assertEquals(6, gearsdiv2.getmin(directions));
    }

    @Test
    public void case73() {
        String directions = "LRLRLRRLLRLRLLLRLRL";
        assertEquals(4, gearsdiv2.getmin(directions));
    }

    @Test
    public void case74() {
        String directions = "LLRLRLRRRLLRLRLRRRLRLRLRLRRLRRRLRRRRLLLLRRLRLRLLL";
        assertEquals(12, gearsdiv2.getmin(directions));
    }

    @Test
    public void case75() {
        String directions = "LRLRL";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case76() {
        String directions = "LLRLLRL";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case77() {
        String directions = "RRRRRRRLRRRRRRRLRLRLLRLRLRLRRLRRRRRRRRRRRRRR";
        assertEquals(15, gearsdiv2.getmin(directions));
    }

    @Test
    public void case78() {
        String directions = "RRRRRRLRRLRRR";
        assertEquals(5, gearsdiv2.getmin(directions));
    }

    @Test
    public void case79() {
        String directions = "RLLRR";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case80() {
        String directions = "LRLRLRRLLRLRLLLRLRLLLLLLLLLLLLLLLLLLLLLLRRLRLLLRL";
        assertEquals(17, gearsdiv2.getmin(directions));
    }

    @Test
    public void case81() {
        String directions = "LLRLRL";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case82() {
        String directions = "RRLRRR";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case83() {
        String directions = "LLRRRL";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case84() {
        String directions = "LRLL";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case85() {
        String directions = "RRRRRRRRRRRRRRRRRRRRRR";
        assertEquals(11, gearsdiv2.getmin(directions));
    }

    @Test
    public void case86() {
        String directions = "LRLRLRLLRLRRRL";
        assertEquals(3, gearsdiv2.getmin(directions));
    }

    @Test
    public void case87() {
        String directions = "LLLLRRRRL";
        assertEquals(4, gearsdiv2.getmin(directions));
    }

    @Test
    public void case88() {
        String directions = "LRRL";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case89() {
        String directions = "RRRR";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case90() {
        String directions = "RRRRLR";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case91() {
        String directions = "LLRRL";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case92() {
        String directions = "RRRRLLR";
        assertEquals(3, gearsdiv2.getmin(directions));
    }

    @Test
    public void case93() {
        String directions = "LLLLRL";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case94() {
        String directions = "LLRRLRRLLLLRRRRL";
        assertEquals(7, gearsdiv2.getmin(directions));
    }

    @Test
    public void case95() {
        String directions = "LLR";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case96() {
        String directions = "LRR";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case97() {
        String directions = "LLRLRRLLLRL";
        assertEquals(3, gearsdiv2.getmin(directions));
    }

    @Test
    public void case98() {
        String directions = "RRRRRRRLRRRRRRRLRLRLLRLRLRLRRLRLRLLLRLRLLLLLLLLRRR";
        assertEquals(15, gearsdiv2.getmin(directions));
    }

    @Test
    public void case99() {
        String directions = "LLLLLLLLLLLLLLLRRRRRRRRRRRRRRRRRR";
        assertEquals(16, gearsdiv2.getmin(directions));
    }

    @Test
    public void case100() {
        String directions = "RRLLR";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case101() {
        String directions = "LRRRRRRL";
        assertEquals(4, gearsdiv2.getmin(directions));
    }

    @Test
    public void case102() {
        String directions = "RLR";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case103() {
        String directions = "LRL";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case104() {
        String directions = "RRRLRR";
        assertEquals(2, gearsdiv2.getmin(directions));
    }

    @Test
    public void case105() {
        String directions = "LRLRR";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case106() {
        String directions = "RLRRRL";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

    @Test
    public void case107() {
        String directions = "LLLLLLLLLLLLLLLLLLLRRRRRRRRRRRRLLLLLLLLLLRR";
        assertEquals(21, gearsdiv2.getmin(directions));
    }

    @Test
    public void case108() {
        String directions = "LRLRLRLRL";
        assertEquals(1, gearsdiv2.getmin(directions));
    }

}
