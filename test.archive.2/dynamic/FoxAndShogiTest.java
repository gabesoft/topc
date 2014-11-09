package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FoxAndShogiTest {
    FoxAndShogi foxandshogi = new FoxAndShogi();

    @Test
    public void case1() {
        String[] board = { ".D.", "...", "..." };
        assertEquals(3, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case2() {
        String[] board = { ".D.", "...", ".U." };
        assertEquals(3, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case3() {
        String[] board = { "DDDDD", ".....", ".....", ".....", "....." };
        assertEquals(3125, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case4() {
        String[] board = { "DDDDD", "U....", ".U...", "..U..", "...U." };
        assertEquals(900, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case5() {
        String[] board = { "....D..", "U....D.", "D.D.U.D", "U.U...D", "....U..", "D.U...D", "U.U...." };
        assertEquals(2268, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case6() {
        String[] board = { "DDDDDDDDDD", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", ".........." };
        assertEquals(999999937, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case7() {
        String[] board = { "..", ".." };
        assertEquals(1, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case8() {
        String[] board = { "UUUUUU.UDUUUUU", ".DU..D.U..DD.D", "........U.....", ".UD.D.UD.DDDDD", "........D..DD.", "UDDDUDDDD.DDDU", "DD.UD.UD.UUUD.", "U.U....DU.DDD.", "D.U.DDDDDDUDDD", "U...U.UUUU.U.U", "U.UU...U.UU.UU", ".DDDDUU.UUD.DD", ".D.DD...D..U.D", "...UUUUUUDUUUU" };
        assertEquals(809225782, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case9() {
        String[] board = { "..D....", "....D.D", "D...D..", "DDDDDDD", "D..D.DU", "UUDDDUD", "DUUDUDU" };
        assertEquals(224, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case10() {
        String[] board = { "....DD.......D..", "DDUDDDDDDDD.DDDD", "DDDDDDUDDDD.DDDD", ".U...UU.U...UU.U", ".U.UD......D.DD.", "UDUUD.UU.DDUDU.U", "DDDUUUD.DDUUUDUU", "................", "U..D.UU...DDUUDU", "UDDDUUUUUD..UUDD", "UDDUUUUUUUUUUUUU", "UUUUUUU....U...U", "UU.DUD.UUUDUUUDU", ".DDD..DDD.DDDDDD", "UUUUUUUDUUUUDUUU", "D.DDDU.DDUD.DU.D" };
        assertEquals(34395860, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case11() {
        String[] board = { ".D.......D.D....U.", "U..DUUDDU.UUUU...U", "D.UDDDDDDDDDDDDDDD", "UDUUU.UDDDDUUUDDUU", "U...U.........U..U", "DUUUDUUUUUUUUUUUUD", "UU.UD.UU.UDUUUUDDD", ".....U.DD..D.DD.D.", ".UDUDUDUUUDDU.UDUD", "UU..UUU.U.U.U.U..U", "..DUD.D..D..DD.D.D", ".DDD...D.U.UDDUUD.", "D...DDDDDD.D....U.", ".UDDU.UUUDUDDDUD.D", "DUUUDUUUDD.UDUDUDD", "DDUDUUUUDDUUUDDDUD", "DDDDDDDDDDDDUDDDDD", "DDDDDD.D..DDDDDDDD" };
        assertEquals(487551334, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case12() {
        String[] board = { "D.DDDDDU.DDD.D", "....DD.DDD.D.D", "......U.......", "DUU..UU...D..U", ".D.UDD.UDD..UD", "DUDDUDDDDDDDDD", "..............", "DDDD.DUDDUDDDU", "U.UUU....DUUUU", "U..DU..U...UD.", "U...U..U.UU...", "U..U..UDUD....", "UDDU.UD.UDDUU.", "UUDUUUUUDUDUUU" };
        assertEquals(531228123, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case13() {
        String[] board = { "DUDUD", ".D..D", "UUDDU", "D.D.U", "....D" };
        assertEquals(126, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case14() {
        String[] board = { "U.UDU.UU.U..U..", "D.DDUU.DDUDDDUD", ".U.UUDUUUDU.UUU", "D.D.DD..DDDDD.U", "DDUUUUUUUUDUUUU", "DUUDUUUUDUDUUUU", "UU.UU...UD.UUDU", "D.DD..DD.D...DD", "UUDD..UDDDD..UD", "UDU...U........", "UUUUU.UUUUUUUUU", ".UUUU..U.UUUU.U", "UUUUUU.UUUU..UU", ".UUUUUU.UUUUUU.", "DUDDDUUUDDDDDDD" };
        assertEquals(842227802, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case15() {
        String[] board = { "UUDDDUDUDD.DDD.D", "UDDDDDDDDDDDDDDD", "DD..D....U.U..DD", "UD.UUDUDDDDU.DDD", "DUUD.UDU.U.UUUUU", "UDDDDUDDUDDDUDUD", "UDD.DUDUDU.D.UDD", "DD.DD.DDU.U.DDDD", "D.D...D...D..D..", "DD...DUDD...D.DD", "UD...DDDU.U.....", "DDUDD..DDDDDD.DD", "UUDU.UDUDDDUUDDD", "U.UUUUUUUUUUDUU.", ".U..UD...UU....D", ".UD.UU.U........" };
        assertEquals(338815751, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case16() {
        String[] board = { "..DDDDDUDD..D.D", "U....U.......D.", "D...D......D.D.", "UUDDUUUUUUUDUUU", "DDDDUDDDDUUDUDU", "UD...U.........", "UUUDDU.DUDUUUU.", ".DU.UUUDUUUUUUD", ".U...U.DDU....U", "D....UU..U.UUUD", "..UD......U..U.", "UDDUD.DUUUDD.DD", "DDDU.DUDDDDDDUD", "DDUUDDUDUDD.UDD", "UUUUUUUUUUUUUUU" };
        assertEquals(932109316, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case17() {
        String[] board = { "U..UU.UU", ".....U..", "UU.UDUUU", "D.DDDDDD", "........", "DUDDDDDD", "U.....U.", ".DUUD.DU" };
        assertEquals(64012032, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case18() {
        String[] board = { ".U.", "UUD", "DUD" };
        assertEquals(2, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case19() {
        String[] board = { "DDD.D.D", ".....U.", "DDD.UU.", "UU..U.D", "DU..DUU", "U..DU.U", "UUDD.DU" };
        assertEquals(9408, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case20() {
        String[] board = { "D.UD.DUDDDDDU", "U.UDDUDDUU.UU", "..UUUDDUUUUUU", ".....UU....UU", "..D........DU", "U.UUU..U..D..", ".UUU.U..U.U..", "UUUUD...UUUUU", ".U.U..U.UU.UU", "......D.....U", "UDDD.DD.DDUDU", "UDUUDD.DDDD..", "DD..DUUDDUDUU" };
        assertEquals(212455961, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case21() {
        String[] board = { ".UUUUD.U", "...UDU.D", ".UDUU.DU", "U.UUUU..", "UUD.U.U.", ".DD....U", "DUDUDDUD", "UUU.UDUU" };
        assertEquals(10800, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case22() {
        String[] board = { "UUUU.UU.UUU..DUU", "UUUUUUUDUUDUUDUU", "U.UU.UU.U.U..UUU", "DDDDUUUUDDDDDUDU", "DDDUDDD.DDDUDDDD", "DUUUUDDUUUUUUDUD", ".UUUU..UU..UUUUU", "DDDDDDDD.D..DDDD", "UU.U.D.UUUUD..UD", "UD....U.U..U.UDU", "..D.........D...", "DD.D..D.U..D.D.D", "UUUUDU.U.UUUDUUU", "UUU...U.UU.U.D.U", "UUUUUUUUUUUDU.UU", "U.U..U...U.UU..U" };
        assertEquals(577225429, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case23() {
        String[] board = { "...", "D.D", ".U." };
        assertEquals(12, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case24() {
        String[] board = { "D..DDDUDD.UUDD.", "UUDDDUUDDUUDUUU", "UDDUDU.DDUUUUUD", "DDDDDDDDDDDDDUD", "U.....D....D...", "...DD.D.DD.DUDD", "UD..DD...DU.D..", "DUUUDUUUUDDDUUU", "DDDUDUDDDDDDDDD", "DUUUUDDUUUDUDUD", "...D....D...D.D", "DDU.DDDDDD.UDUU", "UUUUUUUUU.UDUUU", "..D..D....DD..D", "UUUUUUUU.UUUUUU" };
        assertEquals(725650872, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case25() {
        String[] board = { ".U", ".." };
        assertEquals(1, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case26() {
        String[] board = { "UDDU", "DDDD", "UUUD", "UUUU" };
        assertEquals(1, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case27() {
        String[] board = { ".UD.", "U.DD", "UUUU", "DD.U" };
        assertEquals(6, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case28() {
        String[] board = { "UDU.DDDUDDDU", "..........U.", "D..UDU.UDD..", "UUUU.UUU..U.", "D.DD.DDD.D.D", ".U..DD.UUU..", "..U.UD....DD", ".....D..DD..", "UU.DUDDUDUUU", "UUUUUUUUUUUU", "U.UDD.UUUUUU", ".UDDUDDDU.UU" };
        assertEquals(45701062, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case29() {
        String[] board = { "D.UUDUUDUUUUDUDDD", "UU....U..U.......", "UDUUDUUUUDUU.DUU.", "UUUUUUDUUUUUUUUUU", ".DD......DD.D....", "DUDUD.DUDUD.D.DDD", "U..D.D...D..D..DD", ".U.U.UUUUUUU..U..", ".DUUDDUD.UUUDUDDU", "UUD.UUD.U.DDUDDD.", "UUUUUUUUUUUUU.U..", ".UDD..DDUU.DU..D.", "DUDDUD.U.DUU.UUDD", "......U.........U", "UUUUUUDUDDUDUDUDD", "..U....U...UUUU..", ".U.D.U.D...UD...U" };
        assertEquals(686766027, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case30() {
        String[] board = { "..D...D...", "UDUDDUUUUU", "DDDUDDDDDD", ".......U.U", "UU..D.U...", ".D.DD.....", ".........D", "DDUDUUUDDD", ".DDUDDDDD.", ".........." };
        assertEquals(226542444, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case31() {
        String[] board = { "DDU..DDD..D.UU..D", "DDUUDDUDU.D.UUU..", "D..DD.DDDDU.DDUDD", ".U....U.UDDU...U.", "UDU.......DDU....", "....D......DD.DD.", "..UUUU..UUUUUUUUU", "DDD.DDUD..DDDDDDD", "DU.DU.UDD.DDU.DUU", ".U.............D.", "D.......D.D.D..D.", "UU.UD..U..U.UDUDU", "DDU.DUUUUDDUUUDDU", "UUDUUDUUDDDUDUDDD", ".D.DDD..DDD..D.DD", "UDUDDUUDU.UU.D..D", ".U.U...D..D....UU" };
        assertEquals(613144676, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case32() {
        String[] board = { "DDDDD.UDUDUUD..UD", ".D.DD..D.UD.DDDDD", "DD.UUD.DDDD.DDUD.", "D.DDDDDDDU.U.D..U", "DDDDDDDDU.D.DDDDD", "UDDDUUDDUDDUUUUDD", ".....D.D..DD...D.", "DDD.DDDDDDDDDDDDD", "D.DDDDDDDDDDDDDDD", "U.DUUUUUUUUUU.UDD", "DDDDD.DDD.D....DD", ".U.......D.U.DDDU", "DUUUUDDDDUUDUUUUU", "DUDUDUDDDDDDD.DUD", "DDDDDUUDUDD.DD.DD", "UDU...UD..U..UU..", ".DUU.U.UUU..UUUUU" };
        assertEquals(685582735, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case33() {
        String[] board = { "...U..U.U....", "UUUU.UUUUDUDU", ".DD.DDDDDDDUD", "DDDUDDDDU.DDU", "UUU..U.UUUUU.", "DDDUUDUDDDDDD", "UD.DDDDUDUUDU", ".D.U.UUUU..U.", "DDUD.DDDDUDD.", "UUU.UUUUUUUUU", ".U.U..UU....D", ".DD.D.DDDD.DD", "U.U.UUUUUU..U" };
        assertEquals(388787186, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case34() {
        String[] board = { ".U.", "U..", "U.U" };
        assertEquals(9, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case35() {
        String[] board = { "...D...D", "UUDUUUUU", "UDUD..DD", ".U.UD.DU", "DDUUDDDD", "D..D....", "DDDDDDD.", "U.UDUUUU" };
        assertEquals(69120, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case36() {
        String[] board = { "DDUUUUUUUDDDDUUU.U", ".DDD.DDDDDDD..DDD.", "DUDDDDDDDDDDDDDDDD", "....U....U.D.U.UUU", "............U.....", "UDDU..UD.DD.DD.D..", "DUUDUUUUUUUUUUUDDU", "UUU.UUUDD.DUUUU.U.", "..............U...", "U...U.UU.UUDU.....", "........D.........", "U.....UUU.D.....UU", "......U.D..DUDD.D.", "U...DD..D.D..D....", "DD.D.D.DD.DD..DD.D", "DUDDDUDUDUDDDDDDUD", "DD.DDDDDDUUDDDDDDD", "UD.UU.U....DU..U.." };
        assertEquals(443248011, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case37() {
        String[] board = { ".........D.UU....", "U.U...U.U.UUUUUUU", "..U..U.DU.D....UD", "D.DD..U.D.UD..DDU", "DUUUUUUUUU.UUUUUU", "U.DUUD.....UD...D", ".UU.UUU..UUUUU.UU", "..U.UUU..UUUUU.U.", "DD.DUDU..DDUDDD.D", "DUUDD.DDUDUU.UUDU", "..D.U.U...DD...D.", "UUU.UDDUUUUUUDUUU", ".D.UUUUU....D.UU.", "D...D..DD.DD..D..", "DDDDDD.DDUUDUUDUU", "DU......D...DD.DD", ".U..U..UUUU...UUD" };
        assertEquals(352210576, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case38() {
        String[] board = { "UU.UDDD", "..UUDUD", "UDUDDUU", "....U.D", "DDDD.D.", ".......", ".DD..DD" };
        assertEquals(9720, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case39() {
        String[] board = { "UU...U", "UUUUUD", "......", "D.DDDD", ".UD...", "..UUDU" };
        assertEquals(3024, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case40() {
        String[] board = { "D.U..UD.UUDDDU..", ".D.D.DDDUD...UDD", "...D.UD..UD.....", "UUUUUDUUU.U.UDD.", ".UU..U...UUUU.UU", "U....U.D.......D", "UUUUUUDU.UU.DUUU", ".U..D..DDUU....D", "DDDD.DDDDDUUDDDD", "..D...D.DU..DDDD", "DUDUUDUUD.DUDUUU", "DD..DD.DD.UD.UDU", "..D......D.DU.U.", "DUDUDUDDUUDUDDUU", "D.U..UDUUUUUUDUD", "DUUU.UUUUD.U.DUU" };
        assertEquals(924925661, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case41() {
        String[] board = { "U...U..............", "DDDDD....UD.DU...DD", "..U.DU.UD.D..U.UD.U", ".DD.DDD...DDD.D.D..", ".U.......UUDU..U.UD", "UUUUUDUUD.UUUU.UUUU", "D..DDU.UU....D..U.D", "UU.UU.UU..UUUU.U.U.", "UUUU.UUUUU..U.UUUUU", ".D.DDUU.D.UDU......", "..D....D.DD..DD.D..", "DUDUDDUDUDUDDUUUDUU", "DDDDD.DDDDDUDDUUDDU", "...U..UU..U..UU.U..", "UDDUUDD....DU...DDD", "D.DD.DDDDD.DDD..D.D", ".UUUUDUUUU.UDUUU.UU", "UU..UUU.UUUUUUUUUUU", "UUUUU.U.U.UUUDU.UUU" };
        assertEquals(267905289, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case42() {
        String[] board = { "..", ".D" };
        assertEquals(1, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case43() {
        String[] board = { ".DDUD.UU", "..D.D...", ".DDU....", "DDUUUUDU", "..DU....", "U..D.DDU", "UDUU.U.D", "...U..D." };
        assertEquals(3179520, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case44() {
        String[] board = { "..D...........", ".UUDU.DDUDD..D", "UUD.D.U.U.....", "DD.D..DD...DD.", "...U..DD.UD.DU", "......DU......", "UU.UUUUUUUU..U", "DD.D..DUD.DD.U", "..D..DDUUDUDDU", "DUDDU.D.DUUDDU", "U.DDDDDDDDDDDU", "...U.U.D.DDU..", "DDDDDDDD.DDUDD", ".UUUUUU.UUUDUU" };
        assertEquals(25284944, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case45() {
        String[] board = { "DDD.DDDDDDDDDUDDDDD", ".UUU..U.......D...U", "U....U....U...U....", "D.DUDUUD..D...DUUDU", "D....U....UUUU.....", "DDUD.UDUUDDD.DDDDD.", "DDUUDDDDDDDDDUDDDUD", ".DU....D..D.D.D.DD.", "UUUUUUDU.UUDDUDUUUU", "............U......", "UD.DUUDD.DU..U.UDDD", "U...DU........U....", ".DUUUUUUUUD.U...U.U", "DU.D.DU.U..D.DDDD.U", "D..DUDD.DDDUDD.DDDD", "UDDDDD..DDUDDDUDUDD", "UDUDUU.D....DDU..UU", "........U..U.......", "DDUUD..UD.D.UDD...." };
        assertEquals(535701514, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case46() {
        String[] board = { "............D..D", "UDDDUDDUDDDDDDDD", "DD.DDD.D.D.D.D..", "UUU..UU.UUU..UUU", "UDUUUUUDUDDDUDDU", "UUD.UUU.UDUUUUU.", "DD.....DD.U..D.D", "..D.DUUUD.U.UDUU", "DDDUDD.UDDDDUDDU", "UUU.UU.UUUUDUU.D", "DDDDDDDDDDD.D.DD", "U..UU.U.....U..U", ".U.............U", "UDUU..DUUUU.U..U", ".UDDDDDUDDDDDDDU", ".D.U.U.DDUU...U." };
        assertEquals(504658075, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case47() {
        String[] board = { "..U.D..DDD..UD....", "DD.UD.DDDDUDDUUDUD", "UDD.U.DUDUDDDDUDDD", "D..DD.D.DDDD...DD.", "DDDDDU.DUUD.D..U..", "..DDD.UU.UDD.DDU.U", ".DD.DDDDDDDD.DDDDU", "UDUDDDUUUDDDDD.DDD", "D.DUDUDUUDDDDDD.DU", "DDDDDDDDUDUUUDDDDD", ".UU.DUDDUUDD.D.D..", "UUUUD.UUUUUUUUU.UD", "D....D.D..U.U.D...", "DDUDDUUDUDUDDUDUDD", "...UD..DU.....U.U.", "UUUUUUUUUDUUUUUDUU", "DU.DUUDD.DUD.DDDDU", "UU.U.DU...UUUU.UUU" };
        assertEquals(526324014, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case48() {
        String[] board = { "UUUD..UDUD.D", ".UDU.DD.DUD.", "UDUUUUUD.DU.", "..U.DD.DDD..", "DDDDDUDD..D.", "...DUU.UUU.U", "U.UUUU.UU.UD", ".U.UU.DUUU.U", "DDD..U.D..D.", "..D.....UD..", "UD.DUD..UUUU", "UUUUUUUUUUDU" };
        assertEquals(231980109, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case49() {
        String[] board = { "UUDU.UDDDDDDUDD.DDD", "D.D...U.D..D....DDD", ".U.U.U..UU..U..U...", "D..DDDD.DDD.D.DDDDD", "...U..U...UU..D..DD", "DD..D......DD.D.D..", ".UD..U.U.UUD.UD.U..", "DU.DD..UU.UUUUUDD..", "DDD.UD..DDU...DD...", "U.U.UU..UUU.UUUUU.U", "DD.D.UDDDDD.DDDD.DD", "D...DDDDU..DD.DDD..", "U.UUU.UUUD.UUU..UUU", "UUUUUUUUUUUDUUUUUUD", "UUUUUUUUUUU.UUUUUDU", ".U.U.U.UUU...U.UUU.", "UU.UUU.UUUUUUUUUUUU", ".D.................", "..U...........UUU.." };
        assertEquals(117037071, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case50() {
        String[] board = { "UUU", "D.D", ".UU" };
        assertEquals(4, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case51() {
        String[] board = { "...U...U..UU", "UUDD.DU.UUUU", "...U....U.U.", "DDDDUDDDD.DD", ".D.D.D.D..D.", "UU.UDDUUUUDD", "UUUD.D..U.D.", "U.D.DDUDDD..", "DD.UDDD..UDU", "UUUDU.D.DUDD", "DD..D.D.DDD.", ".....U...UD." };
        assertEquals(119303759, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case52() {
        String[] board = { "DUDD.UUUUU..UUUUUD.", "...DD.U.UUUDU..UU.D", "U.DDUD.UUUUUU.DDDDU", "DUDU........U..DDU.", "D.....UUU.DD....DDU", "U..U..UUDUUU.......", "UUDUUDUUUDUDUUUDD.U", "DUDDDUUUUUDDDDDDDDU", "DUUUD.UU.UUUUUDU.UD", "UUUUUU.UUUD.UUUUU..", "......D........D..D", "D.DDD..DDD.DD...D..", "..D....D..D.......D", "DD..D.....D........", "DU....U..UUU......U", ".UUUU..U..D.UUU..U.", "UD.DDDDUUUDU..UDUUD", ".U.U..D....D.U.....", ".UU.U..U.U...U.U.UD" };
        assertEquals(843750673, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case53() {
        String[] board = { ".DD..D", ".D..D.", "DDUUDD", "DDDDDD", "UUUUUU", ".UUUDU" };
        assertEquals(18, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case54() {
        String[] board = { "..DUD..D......D.D", "UUU..UUUUUUUUU.UU", "UU.UUU.UU.UUD..U.", "D........U...DU..", ".U.UDU.UD..D.UDUD", ".DD.........D....", "DUUUUDUUDDUUDDUU.", "..UDU.UDUUUUUU..U", "UDDD.UUDDUDU.DDDU", ".................", "UDUDDUUDUDDDDUDUU", "UUUU..U..U.....UU", "D.UUU.UUUU.DUU.UU", "DUD.DDD.DDDDDD..D", ".D..........D.D..", "..U.UUDUUUUDUUDU.", "U....UU...D.UU.UU" };
        assertEquals(852213067, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case55() {
        String[] board = { "UUDUU.UUUU.UUU", "U..UUUUUUUU.UU", "..DUD..DDDD.U.", "UUU.U.UUUDU.U.", "DDDDUDDUDDUDDD", "UUUUUUUUU.UUUU", "U.UU..UUUU.U.U", ".......U.....U", "DU.D.D.UD..UDD", ".UUUUDUUUUUUUU", "DUUUUD.UUUUDDU", "U..DD........U", "DDDDDDDDDDDDDD", "UDDUU.UUUDUUUU" };
        assertEquals(740671867, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case56() {
        String[] board = { "..U.UD...UU.U...", "D.U.DD.U.D.DD.U.", "DDDDUDDDDUDUUDDD", ".DDD.D.DUD.D..DD", "UUUUDUUUUUUUUUUU", "..UU...D..DUDD.U", ".DDUUUDUDD.UDDD.", "D.DDDD.D...DDDDD", "UU.DDUUU.DDUUUDU", "U.UU.UUUDUUD.UUU", "...UU.U.U.UUU...", "UUDUDUDDDUDUUDUU", ".DUD.D..DU.DDDDD", ".UU.UUU.UUUU.U.U", "DUDU.DDUDDD.....", "....U......D.DD." };
        assertEquals(80361233, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case57() {
        String[] board = { "UDUUDUUUUDUD", "...UUU..D.UU", "UU...D....U.", "........U...", "UUUUUUU.UUUU", "UUU.UUUDUUUU", "..DU....DD.D", ".UUUUUDUUUDU", "DD.......DUD", "DUUDDUUUUUDD", "DDDDDDD..DUD", ".DU..U..U..." };
        assertEquals(875765289, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case58() {
        String[] board = { "..U.U.D..", "U.UUUUU..", "DDD..DDDD", "DUDD.UUUD", "UUUUUUU.U", "DUUU.UUUU", "U.DDU.DDD", "UU.UDUU..", "DDDDDDDDD" };
        assertEquals(4608, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case59() {
        String[] board = { "U.DUDUUUUUUUUUDUUD", "UUUUUUUUUU.UUUUUUU", "DDUD.UUUUUDUUU.DUU", "D..DD.D.DD......D.", "DD..U...D....DD...", "UU.....DD.U.U.UDUU", ".DUUDUUDUUU...U.UU", ".UU......UUU.UUU.U", ".D.D.UUUDUD.D..UUU", ".UU.UU.UUUU..UUUUU", "DDD..U......DD.DD.", "U..DUUDDU.DDDDDUDU", "D.D.U....DDDD.DDD.", ".UU....DUUUDUDU...", "DDDDDDDDD.DDDD.DDD", "UD.DU.U.D.UUDU.DUD", "DD..DD.D..U..D.U.U", "..U...DUUUU.UDUDU." };
        assertEquals(956408845, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case60() {
        String[] board = { "DDDD.DD.", "UUUU.DUU", "DDDDDDDD", "..D..U..", "DDUU.UDU", "..DDDDD.", "U.UDDDD.", "DU.UUUDD" };
        assertEquals(12096, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case61() {
        String[] board = { "UDD...UU..UDD...", "UUDUDUUUDU.UDUDU", "UDDDD...D.DUU.DD", "D.DDUU..DD.UDDDD", "UDUU.DUUUU.UUU..", ".U..UDU....U.DUU", "D....U...DD..DD.", "U...U....DUD.D..", "UDDDDDDDUUDDDDDU", "DUU.UDDDDDD.DUUD", "U...U..U.U.U.UU.", "UUUD.UU.DUDUUUUU", ".U...UU.D.U.D.U.", "UUDUUU.UUDUDU.UU", "D...UUUU..UUU...", "UUUUUDUUUU.UU.UU" };
        assertEquals(707639161, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case62() {
        String[] board = { "...D........U.", "UU.UU..UU.U.DU", "U.U..U...U.UU.", "UUDDDDUUUUDUDD", "UD.UD.DDUUDDDD", "DUUUUDDDUDD.U.", "U..U..D.......", ".D....UU.UU.UU", "UUUUUUUUUUUUUU", "UUDDU.UUDUDUD.", "D..UDDDDDD.DDD", "UUUUU..U.UU..D", "UUU.UUUDUUUUUU", "UUUUUUUUUUUUUU" };
        assertEquals(226732977, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case63() {
        String[] board = { "D.DUUUU", "DUDD..D", "UDUUUUD", "UUDDU.U", "UUUUUDD", "DDDDDDU", "UUU.U.." };
        assertEquals(96, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case64() {
        String[] board = { ".U...U.UU..U.UU.", "DUDDDDDDUUU.DDD.", "DU.U..D..D..DDD.", "UDDUU.DDUUUDUDDD", "DDDDDDDDDD.U.DDU", "UDU.DDUUUUUDUUUU", "DDUDDDDDDDDDDDDD", "UUUDDUU.UDD.D.UD", "..U.........U...", "DU....U.DD..DD..", "...DD..DDDD.DU..", "D...............", "D...DUUU.UUDDU.D", "DUUU.U..UUU.DUUD", "...DDD.DDU.UD...", "DU.UUUU.UUUUUUU." };
        assertEquals(235580224, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case65() {
        String[] board = { "DDDDD...DD..DDD", "DDUUUUDUDUUDDUD", "UDUUDDUDUUDDDDD", "U...DUD..D..D..", "UDUUUUDUDUUDDUD", ".D....UD.......", "D.D.U.DDUDD.UDD", "U....D..UD..UU.", "UDDDDDU.UDD.DD.", "DDDUD.D...D.DUD", ".D....D......U.", "DD.UDDDD.D.UD.U", "DUD...D.DD..DU.", ".DUUDDDUD.DUDU.", "DDUUD.DUUU.UU.." };
        assertEquals(280519706, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case66() {
        String[] board = { ".U.UU.UDUUU", "DD.UDDUDD.D", "......D....", "UDDDUUDDUUD", "D.UDDDDDDDD", "...D...D...", "D...UU.UD.U", ".DDDU.UUDDD", ".........D.", ".DU.D.DDUUU", ".UUD.U.DU.D" };
        assertEquals(422854488, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case67() {
        String[] board = { "UUDUD", ".....", "DDDDU", ".DDDD", "D.UDU" };
        assertEquals(36, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case68() {
        String[] board = { "....D......UUD..U.", ".UUUUU.U.UU.U.UU..", "D..DUD..UDUD.D..D.", "UUUUU.U.UUDUUDUU.U", "U.DUUUU.UDUUUUUD.U", ".DDD.DD.DD.DD...DD", "D..D.DDD..D....D.D", "UD.UDDUDUDUUUUDDUD", "...D...DD...D.DD..", "UUDD.D.D...D..D..D", ".UDDDDDD.D..UDUU.D", "DDDDDDDDDDDDUDDDUD", "D....D.DD..D.DDDDU", "UD.DUUDU.UU.UD..U.", ".UUUUUUU.UUU..U.DU", "DDDDDDD.UDDU.DDD.D", "UU.DDUDDDDDDDUUDUU", "..U.U...U........." };
        assertEquals(281957673, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case69() {
        String[] board = { "DDDDD.DU.UDDD...", ".UUDDD..D..D.UD.", ".UUUUU.UUUUUDUUD", "U.DUUDU...D.UDUD", ".UDDUUDUDUDDDUD.", "U.D.UDUU....DUDU", "U.DUUUUUUUUUUU.U", "...D..DD...D.D..", "..UUUU...UUUUUUU", "D...UDD.UD.D.UUU", "....U...U.U.....", ".U..U..U.UUUU.UU", ".UDDDDUUDUUDU...", "UUUUUDUUU.UUUD.U", ".U..U.....U..UUU", "UUDU.U...UUU...U" };
        assertEquals(598479344, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case70() {
        String[] board = { "...D..U...D..U", "DU.UU.DD..DDDD", ".UDD.DDD..D...", ".DDDDU.DDDDDDD", "U.DUUUDD.UUDDU", ".....D.....D.U", "DDDDDDU.D.DDDD", "..DD.DDDDD...D", "UUU....U..UUU.", "UUUUUUUUUUUUUU", "UUUDUDUUUUDDUU", "DUDUUUUUDU.UDU", "DD.DD...DDDD..", ".UU..U.U.U...." };
        assertEquals(164657261, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case71() {
        String[] board = { "..D", "U..", ".DD" };
        assertEquals(4, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case72() {
        String[] board = { ".UD..D.D.", "DU..DDUUU", "..D..DDUD", "UUUUUUUUD", "UU.U.UU.U", ".UUDU...D", "DDDDD.DD.", "UU.UUUDU.", "DUU.D...U" };
        assertEquals(2903040, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case73() {
        String[] board = { ".............D.", "UUDU..UUD...U.D", "UDU.DD..UDUDDUD", "D.D..DDD.U.D.D.", ".U.UUUU.D.UD.U.", "..........U...U", "..D..DD..D.....", "UD.UUU.UUU.UU.U", "DUDUUDUDUDDDUD.", "U.UDDU.DUDDUUU.", "...D....D......", "..U...UUUUU.UU.", ".DD..D.DD.DDUD.", "UUUU.UUD.UUUUUU", "U..U.U.UUDU.U.U" };
        assertEquals(888463299, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case74() {
        String[] board = { "..D.U.DUDDDUD..", "UD.D.U.U.UDUUDD", "UUUDUDUUUUUDUUD", ".....D.........", "U..UU..U.UUUUDU", "DUUUUDDDUUUUUDD", "UUUDDDU.UDUDUUU", "U......D......D", "DUUUUUUDU.U.UUU", "...U.U....DD...", "....UU...U.....", ".U..UU.UD.D.U..", "..UUUD.UDDDUUDU", ".U....DUU.U.U.U", "..D.UDD.DUUD..." };
        assertEquals(640456278, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case75() {
        String[] board = { ".D.UDD.U.DUDDDD", "DD.D...D...D...", "UUUUUUUUUUUUUUD", "DDDDDDDDDDDDDDD", "..UUU.UU.UDDD.U", ".UUUUUUU.DUDUUU", "D..DDD.D....D..", "UDUDDUUUUUDDD.D", "UUU.UU.UU.U.U..", ".UUDD...DDD.DDU", ".....D..UD.D...", "..........D....", "UUUUUU.UUUUDU..", ".UUUUU.U.UUUUU.", "UUUUUUUUU.UU..U" };
        assertEquals(483002916, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case76() {
        String[] board = { "DUDU.U", ".UDD.D", "DDUDDD", "..UUD.", "D..D..", "UUU.UU" };
        assertEquals(4800, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case77() {
        String[] board = { ".D.DD.DDDDD.DDDDD", "UUUUUU.UUU..D.UUD", "U.UUUUUDUUUU.UUUU", "...U.D.U..D.D.D..", "DD.DDDU.DD.D.DD..", "....D..D......U.U", "D...DU.UDUDD.U...", "DD.DDUDDD..DUU.D.", "DDU.DDU..DDD.UDDD", "UUUDUUDDDD.DUDUDU", "....U.DD.DDDDDD..", ".DDD.DD.DD.DDDDDD", "DUDDDDDDDDDDDDUDD", "UUUUDD.U.UD.U.DUD", "DDDD.DUDDDDDDD.D.", "U.DDDDDDDDDDDD.DD", "UDDUU.DDDDDDD.U.." };
        assertEquals(34905942, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case78() {
        String[] board = { "DDDDD", "U....", ".U...", "..U..", "...U." };
        assertEquals(900, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case79() {
        String[] board = { "....D..", "U....D.", "D.D.U.D", "U.U...D", "....U..", "D.U...D", "U.U...." };
        assertEquals(2268, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case80() {
        String[] board = { "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        assertEquals(100434153, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case81() {
        String[] board = { "........D.", "..........", "..D..U....", ".U........", "..........", "..........", "..........", "..........", "..........", ".U........" };
        assertEquals(7200, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case82() {
        String[] board = { "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", "..................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................................................", ".................................................." };
        assertEquals(173931725, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case83() {
        String[] board = { "D...............................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................", "................................................" };
        assertEquals(48, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case84() {
        String[] board = { "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        assertEquals(734859261, foxandshogi.differentOutcomes(board));
    }

    @Test
    public void case85() {
        String[] board = { "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ".................................................", ".................................................", ".................................................", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ".................................................", ".................................................", ".................................................", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ".................................................", ".................................................", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ".................................................", ".................................................", ".................................................", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ".................................................", ".................................................", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ".................................................", ".................................................", ".................................................", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ".................................................", ".................................................", ".................................................", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", ".................................................", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ".................................................", ".................................................", ".................................................", ".................................................", "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ".................................................", ".................................................", ".................................................", "................................................." };
        assertEquals(667839728, foxandshogi.differentOutcomes(board));
    }

}
