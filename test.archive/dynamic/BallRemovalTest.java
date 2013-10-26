package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class BallRemovalTest {
    BallRemoval ballremoval = new BallRemoval();

    @Test
    public void case1() {
        String label = "<<>";
        assertEquals("..o", ballremoval.canLeave(label));
    }

    @Test
    public void case2() {
        String label = ">>><<";
        assertEquals("o...o", ballremoval.canLeave(label));
    }

    @Test
    public void case3() {
        String label = "<<><<";
        assertEquals("....o", ballremoval.canLeave(label));
    }

    @Test
    public void case4() {
        String label = "<><<><>";
        assertEquals("o.....o", ballremoval.canLeave(label));
    }

    @Test
    public void case5() {
        String label = ">>><<<>>>>><<<>";
        assertEquals("o.....o.o.....o", ballremoval.canLeave(label));
    }

    @Test
    public void case6() {
        String label = "<>>><<>>>>><><><><>>>";
        assertEquals("o.....o.o.........o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case7() {
        String label = ">>>";
        assertEquals("o..", ballremoval.canLeave(label));
    }

    @Test
    public void case8() {
        String label = "<<<";
        assertEquals("..o", ballremoval.canLeave(label));
    }

    @Test
    public void case9() {
        String label = ">><";
        assertEquals("o..", ballremoval.canLeave(label));
    }

    @Test
    public void case10() {
        String label = "<><";
        assertEquals("o..", ballremoval.canLeave(label));
    }

    @Test
    public void case11() {
        String label = "<><><><><><><><><><><><><><><><><><><><><><><><>>";
        assertEquals("o................................................", ballremoval.canLeave(label));
    }

    @Test
    public void case12() {
        String label = "<><><><><><><><><><><><><><><><><><><><><><><><><";
        assertEquals("o................................................", ballremoval.canLeave(label));
    }

    @Test
    public void case13() {
        String label = "><><><><><><><><><><><><><><><><><><><><><><><><>";
        assertEquals("................................................o", ballremoval.canLeave(label));
    }

    @Test
    public void case14() {
        String label = "<>><><><><><><><><><><><><><><><><><><><><><><><>";
        assertEquals("o...............................................o", ballremoval.canLeave(label));
    }

    @Test
    public void case15() {
        String label = "<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        assertEquals("o.o.o.o.o.o.o.o..................................", ballremoval.canLeave(label));
    }

    @Test
    public void case16() {
        String label = "<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        assertEquals("................o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case17() {
        String label = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>";
        assertEquals("................................................o", ballremoval.canLeave(label));
    }

    @Test
    public void case18() {
        String label = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o..", ballremoval.canLeave(label));
    }

    @Test
    public void case19() {
        String label = "<<<>><<<<<>>>>><<<<<>>>>><<<<<>>>>><<<<<>>>>><<>>";
        assertEquals("o.o...o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case20() {
        String label = "<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>>";
        assertEquals("..o...o...o...o...o...o...o...o...o...o...o...o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case21() {
        String label = "><>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>>";
        assertEquals("..o...o...o...o...o...o...o...o...o...o...o...o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case22() {
        String label = ">>>>>>>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>>";
        assertEquals("o.........o...o...o...o...o...o...o...o...o...o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case23() {
        String label = ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        assertEquals("o................................................", ballremoval.canLeave(label));
    }

    @Test
    public void case24() {
        String label = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<";
        assertEquals("................................................o", ballremoval.canLeave(label));
    }

    @Test
    public void case25() {
        String label = "<<<>>><<<>>><<<>>><<<>>><<<>>><<<>>><<<>>><<<>>>>";
        assertEquals("o.o.....o.....o.....o.....o.....o.....o.....o....", ballremoval.canLeave(label));
    }

    @Test
    public void case26() {
        String label = "<<<<>>>><<<<>>>><<<<>>>><<<<>>>><<<<>>>><<<<>>>>>";
        assertEquals("....o.o.....o.o.....o.o.....o.o.....o.o.....o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case27() {
        String label = "<<<<<>>>>><<<<<>>>>><<<<<>>>>><<<<<>>>>><<<<<>>>>";
        assertEquals("o.o.o.......o.o.......o.o.......o.o.......o.o....", ballremoval.canLeave(label));
    }

    @Test
    public void case28() {
        String label = "<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>";
        assertEquals("........................o.o.o.o.o.o.o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case29() {
        String label = "<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.o.o........................", ballremoval.canLeave(label));
    }

    @Test
    public void case30() {
        String label = "<<<<<<<<<<<<>>>>>>>>>>>><<<<<<<<<<<<>>>>>>>>>>>>>";
        assertEquals("............o.o.o.o.o.o.............o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case31() {
        String label = "<<<<<<<<<<<<>>>>>>>>><<<<<<<<<<<<<<<<>>>>>>>>>>>>";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case32() {
        String label = "<<<<<<<<<<<<<<<>>>>>>>><<<<<<<<<<<<<<>>>>>>>>>>>>";
        assertEquals("o.o.o.o.o.o.o.o.........o.o.o.o.o.o.o............", ballremoval.canLeave(label));
    }

    @Test
    public void case33() {
        String label = ">>>>>>>>>>>>>><<>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<";
        assertEquals("o...............o.o.o.o.o.o.o.o.................o", ballremoval.canLeave(label));
    }

    @Test
    public void case34() {
        String label = "<<<";
        assertEquals("..o", ballremoval.canLeave(label));
    }

    @Test
    public void case35() {
        String label = "<>>><";
        assertEquals("o....", ballremoval.canLeave(label));
    }

    @Test
    public void case36() {
        String label = "<>>><<<";
        assertEquals("o.....o", ballremoval.canLeave(label));
    }

    @Test
    public void case37() {
        String label = "<<>";
        assertEquals("..o", ballremoval.canLeave(label));
    }

    @Test
    public void case38() {
        String label = "<<><>";
        assertEquals("....o", ballremoval.canLeave(label));
    }

    @Test
    public void case39() {
        String label = "<<<>><>";
        assertEquals("o.o...o", ballremoval.canLeave(label));
    }

    @Test
    public void case40() {
        String label = "<<<><>><<<>";
        assertEquals("o.o.......o", ballremoval.canLeave(label));
    }

    @Test
    public void case41() {
        String label = "<>><<>>><>><<<<<<>>><";
        assertEquals("o...o.......o.o.o....", ballremoval.canLeave(label));
    }

    @Test
    public void case42() {
        String label = "<>>>>><><>><<><>>>><<><>>>>><>>";
        assertEquals("o...........o.......o..........", ballremoval.canLeave(label));
    }

    @Test
    public void case43() {
        String label = "<<><<>>>>>><>>><><>><<>>>>><<>>><<<>><><<";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.....o", ballremoval.canLeave(label));
    }

    @Test
    public void case44() {
        String label = ">>>>>>>><>><>>>>>>>>>>>>>>>>>>>>>><><>>>>>>>>>>><";
        assertEquals("o...........o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case45() {
        String label = "><<>>>>>>><<>>>>><>>>>>>>>>>>><><>>>>>><>>>>>>><<";
        assertEquals("o.o.........o.o.o.o.o.o.o.o.o.o.o.o.o...o.o.o...o", ballremoval.canLeave(label));
    }

    @Test
    public void case46() {
        String label = ">><<>>><<>><><><<>>><<>>><<<>><>>>>>>>><>>>>><<><";
        assertEquals("o...o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case47() {
        String label = ">><<><<>>>><<<><<>><<<>>><><<>>>>><<<>>><<>><<<><";
        assertEquals("o...o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case48() {
        String label = "><<<><><>>><><><<<><<>>>>><>><<><><<>>>>><<<>><<<";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o...o.o.....o...o", ballremoval.canLeave(label));
    }

    @Test
    public void case49() {
        String label = "><<>><<>>><<<<<<>><<<<<<>>><<<><>><<<><>><<><<<><";
        assertEquals("o.o...o.....o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case50() {
        String label = "><<<><<<<><<><><<>>><<><<<<<<><<<><><<<<<<><<><><";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case51() {
        String label = "><<<<<<<><<<<<><<<<<<><<<<><<<<<<<<<<<<<<<>>><<<<";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.....................o.....o", ballremoval.canLeave(label));
    }

    @Test
    public void case52() {
        String label = "<<>><>>><><>>><><>>>><>>>>><<><><<<<><<>><<>>><<>";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o...o", ballremoval.canLeave(label));
    }

    @Test
    public void case53() {
        String label = "<><<>>>>><>><<><<<<<>><><<<<>>><><<>><<>><>><<<<>";
        assertEquals("o...o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o...o.....o", ballremoval.canLeave(label));
    }

    @Test
    public void case54() {
        String label = "<><<><<<<<>>><<><>>>><<>><><>><><<<<>><<<<>>><<><";
        assertEquals("o...o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case55() {
        String label = "<><>>><>><<>>>><<<<<<<><>>><><>><<<><<<<><<>><<<<";
        assertEquals("o.........o.....o.o.o.o.o.o.o.o.o.o.o.o.o.o.....o", ballremoval.canLeave(label));
    }

    @Test
    public void case56() {
        String label = "<>>>>>>>>>>>>>>>>>>>><>>><>>>>><>>>>>>><>>>>>>>>>";
        assertEquals("o.....................o...o.o...o.o.o...o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case57() {
        String label = "<>>>>>>>>>>>>>><>>>>>>>>>>>>>><<>>>>>>>>>>>>>>>";
        assertEquals("o...............o.o.o.o.o.o.o...o.o.o.o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case58() {
        String label = ">><>><>>>>>>><>>>>>>>>><>>>>>>>>>>>>>>>>>>><>";
        assertEquals("o.....o.o.o...o.o.o.o...o.o.o.o.o.o.o.o.o...o", ballremoval.canLeave(label));
    }

    @Test
    public void case59() {
        String label = "<>>><>>>>>><>>>>>>>>>>>>>>>>>>>>><>>>>>>>><";
        assertEquals("o...........o.o.o.o.o.o.o.o.o.o...o.o.o.o.o", ballremoval.canLeave(label));
    }

    @Test
    public void case60() {
        String label = "<<><<<><<<<<<<<<<<<<<<<<><<<<<<<<<<<<<<<><<><<>";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o...o", ballremoval.canLeave(label));
    }

    @Test
    public void case61() {
        String label = "<<><<<<<<<<<<<<<><<<<<<<<<<><<<>><<<<><<<<<<>";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.......o", ballremoval.canLeave(label));
    }

    @Test
    public void case62() {
        String label = "<<<<<<<<<<<<><<<<<<<<<<<><<><>><<<<<<<<<<<<";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.............o", ballremoval.canLeave(label));
    }

    @Test
    public void case63() {
        String label = "<<<<<<<<<<><<<<<><<<<<<<<<<><<<<<<<<<<><<";
        assertEquals("o.o.o.o.o.o.o.o.o.o.o.o.o.o.............o", ballremoval.canLeave(label));
    }

}
