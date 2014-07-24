package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class ConundrumReloadedTest {
    ConundrumReloaded conundrumreloaded = new ConundrumReloaded();

    @Test
    public void case1() {
        String answers = "LLH";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case2() {
        String answers = "?????";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case3() {
        String answers = "LHLH?";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case4() {
        String answers = "??LLLLLL??";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case5() {
        String answers = "LLL";
        assertEquals(-1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case6() {
        String answers = "HHHHHHHHHH";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case7() {
        String answers = "?L?L?L?L?L";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case8() {
        String answers = "?HL";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case9() {
        String answers = "?????LLLLL";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case10() {
        String answers = "????LLLLL";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case11() {
        String answers = "?????L????";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case12() {
        String answers = "?HH??";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case13() {
        String answers = "??H?HHH";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case14() {
        String answers = "?H";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case15() {
        String answers = "HH";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case16() {
        String answers = "HH?";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case17() {
        String answers = "HH";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case18() {
        String answers = "??H?H?";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case19() {
        String answers = "?H?";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case20() {
        String answers = "?H";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case21() {
        String answers = "?H?H";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case22() {
        String answers = "H??H??H";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case23() {
        String answers = "?HHH";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case24() {
        String answers = "?H";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case25() {
        String answers = "?H???H";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case26() {
        String answers = "HH?";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case27() {
        String answers = "HH";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case28() {
        String answers = "H?";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case29() {
        String answers = "???H??H";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case30() {
        String answers = "?????";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case31() {
        String answers = "H???H??";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case32() {
        String answers = "?H??L?";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case33() {
        String answers = "LL?????";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case34() {
        String answers = "??HLLH?";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case35() {
        String answers = "L?";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case36() {
        String answers = "?HL";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case37() {
        String answers = "HL?";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case38() {
        String answers = "?L?";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case39() {
        String answers = "HH?H?H?L";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case40() {
        String answers = "HH??L";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case41() {
        String answers = "L?H??";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case42() {
        String answers = "?LLH??";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case43() {
        String answers = "??LH";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case44() {
        String answers = "?HH??L";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case45() {
        String answers = "HL??";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case46() {
        String answers = "?HH?LHH";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case47() {
        String answers = "HH?H?LH";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case48() {
        String answers = "????L";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case49() {
        String answers = "LHL";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case50() {
        String answers = "?HH?L";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case51() {
        String answers = "L?";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case52() {
        String answers = "LL?L??";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case53() {
        String answers = "L?LL?L";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case54() {
        String answers = "L?H??HL?L";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case55() {
        String answers = "L?LH";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case56() {
        String answers = "LLLL???";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case57() {
        String answers = "??HLLL";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case58() {
        String answers = "H?L??LL";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case59() {
        String answers = "HLHH?HHHL";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case60() {
        String answers = "L?LLHL";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case61() {
        String answers = "?L??L?HH?";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case62() {
        String answers = "?LHL";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case63() {
        String answers = "L????L?L";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case64() {
        String answers = "L??LLH";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case65() {
        String answers = "HLLHL?";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case66() {
        String answers = "?HL??L";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case67() {
        String answers = "LLH?LL";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case68() {
        String answers = "???LHLL";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case69() {
        String answers = "??L??HLL?";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case70() {
        String answers = "??LLHH?HLL";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case71() {
        String answers = "?LHLH?";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case72() {
        String answers = "LLL??LL";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case73() {
        String answers = "LHLHHLL";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case74() {
        String answers = "L?L?H?LL?";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case75() {
        String answers = "L?H??HLHL";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case76() {
        String answers = "HHLHL??L?H";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case77() {
        String answers = "?LLLLL";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case78() {
        String answers = "LLL??L?";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case79() {
        String answers = "???HL?LLL?";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case80() {
        String answers = "H?L??HL";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case81() {
        String answers = "???LL?LHLL";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case82() {
        String answers = "HLH??LH";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case83() {
        String answers = "?HLLL??L";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case84() {
        String answers = "?LHHL?HL?";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case85() {
        String answers = "L?H?LLHHLL";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case86() {
        String answers = "H?LHL?HL?";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case87() {
        String answers = "H?LHHLHH";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case88() {
        String answers = "LHHLHL?";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case89() {
        String answers = "HLHLL?";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case90() {
        String answers = "HL?HLL?L";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case91() {
        String answers = "?L??LHL?H?";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case92() {
        String answers = "HLLLL??HLH";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case93() {
        String answers = "??LLHLHLLH";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case94() {
        String answers = "LHLHLH?HH";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case95() {
        String answers = "LHL?HLL?LH";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case96() {
        String answers = "L?LHLHLLL";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case97() {
        String answers = "?LLL???LLL";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case98() {
        String answers = "LHLLL??LHL";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case99() {
        String answers = "LHL?L?LH";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case100() {
        String answers = "??HHLH?LHL";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case101() {
        String answers = "HLLLLLL?L?";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case102() {
        String answers = "?LHHLLHLLL";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case103() {
        String answers = "HHH?H?HHHL";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case104() {
        String answers = "LLLL?LHHLL";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case105() {
        String answers = "?LLL?HLH?";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case106() {
        String answers = "HLLLLLHH?L";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case107() {
        String answers = "LHHHL?LLL?";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case108() {
        String answers = "HL?LLL?HL";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case109() {
        String answers = "?HHLH??LLL";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case110() {
        String answers = "LHL?LHL??";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case111() {
        String answers = "LHHLL??L?H";
        assertEquals(4, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case112() {
        String answers = "LHLLL?LHLL";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case113() {
        String answers = "LHLHHLL?HL";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case114() {
        String answers = "?LLHLHLHLH";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case115() {
        String answers = "HHHLHL?HHL";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case116() {
        String answers = "?HLH?L?HLH";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case117() {
        String answers = "H?HLLLLLLL";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case118() {
        String answers = "HH?HLLLLHL";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case119() {
        String answers = "HLLL?HHLHH";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case120() {
        String answers = "LLLHL?LLLH";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case121() {
        String answers = "LLLHHLHLL?";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case122() {
        String answers = "?HLLLHHLHL";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case123() {
        String answers = "L?LLHLHLLL";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case124() {
        String answers = "HL?LHL?HLH";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case125() {
        String answers = "HLLHL?HLLL";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case126() {
        String answers = "HLH?HLHLL?";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case127() {
        String answers = "HLHLLLLL?L";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case128() {
        String answers = "HH?L?L?HHL";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case129() {
        String answers = "HHLHHLL?L?";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case130() {
        String answers = "LHHHLHHL?H";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case131() {
        String answers = "LHHLL?LLHH";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case132() {
        String answers = "LLL";
        assertEquals(-1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case133() {
        String answers = "HHLHLHHHLHLHLLLHHLHLHLHHHHLHLLHHLHLHLHHLHLLHH";
        assertEquals(-1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case134() {
        String answers = "HHHLLHHHHLHLLLHLLLLHHHHHHLHLHLLLHHHHHHHHHHHLHLH";
        assertEquals(-1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case135() {
        String answers = "HHLLLHLHHHLHLLLLHHHLHLLLHHHHHLLLHLLLHHHHLHLLHLHLLH";
        assertEquals(-1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case136() {
        String answers = "LHLHLHLLLHLLHLHHLHLHLHHHLHLLLLLLHHLLLLHLHHHHHLHLLH";
        assertEquals(-1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case137() {
        String answers = "HLLLHHHHHLHHLHLLHLLLLHLLLHHLLHLLHLLHLLLHHLL";
        assertEquals(-1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case138() {
        String answers = "HHHHHH?H?LLH?HH??H?HL??LHL?H??LLHH?L?LL?";
        assertEquals(7, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case139() {
        String answers = "HHHH?H?HLH????H?LL???LHLH?H??H?H?HHL?H??";
        assertEquals(6, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case140() {
        String answers = "HHHHH?HHL?HL??LL??H?H??HL?L?LHL?HLLH?HHL?";
        assertEquals(9, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case141() {
        String answers = "HHHH??HH?LHL?LHHL?L?LHLL???L??LLL?HHLL???H?";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case142() {
        String answers = "HHHHH?L??H?LLHLH??HHL???LLLH?LHHLH?LHL?HL?H?";
        assertEquals(13, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case143() {
        String answers = "HHH?LHL?H?HHH?HH?L?HLLLHL??L????LH?HH?L?L?LLH?L??";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case144() {
        String answers = "HHHHL???L?LH?L????LHLH???H??L?HLHH???HL?HHL??H";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case145() {
        String answers = "HHHHH??HLHL?HLL?L??HHHHL??LLHL?LL?H??H?LH";
        assertEquals(9, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case146() {
        String answers = "HHHH?H?H?H?L?H??L?LL?LLL???HH?LLL?H?L?L?HLL?H????H";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case147() {
        String answers = "HHHHH?HL?L??L?H?LLLHH?L???H??LHL?L?LHHLL??HH?H?L";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case148() {
        String answers = "HHHH??H?HL??LLLH?LLHLH????HLHHLH?LH?L??L?LH?HLH??";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case149() {
        String answers = "HH???HH???LHL??H?HLL??LL??LH??L?L?L?H?H?";
        assertEquals(8, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case150() {
        String answers = "HHHL??HHHL?L??H???LL?L??HLL??L?HL??H?H?HH?LHH?H";
        assertEquals(9, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case151() {
        String answers = "HHLL?LH??L?LHH???HL?L?HH?H?H??H?LH??LH??L???";
        assertEquals(9, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case152() {
        String answers = "HHHHH?HLHHH??HHHH?LHH???H??HL???L??L?LH?H?HL?H?LH";
        assertEquals(9, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case153() {
        String answers = "HHH?L?HLH??L?LLLLL??HH???H????LL????H?LLLHHL?";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case154() {
        String answers = "HHH?LL??L??L?????HH?L??LHL??HHHHHHH?LLL????L?LL";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case155() {
        String answers = "HHHLLHH?LLLH??HL?H??HH?L?LHLLL??HHH???H?LHL?";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case156() {
        String answers = "HHHHLHH?HH?L??LH?L?H??L?L?H?LHH??H?L?L?LHH?";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case157() {
        String answers = "HH?LHHHH??HH?H?HLHH?HHL?HH?H?L?L?L??LL???L?";
        assertEquals(9, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case158() {
        String answers = "HHHL?HHHHL?LLLLH????L??L?HL?LHL?HHLL??HH";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case159() {
        String answers = "HH??HH??HHLLL?HH??LH?LLH??HHH?HH?HHH??H?L??";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case160() {
        String answers = "HHH??H?H???H?H??HL?HHHHH?L??HHLHLLLL?HH?HLH?LHL?H?";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case161() {
        String answers = "HHHH?H?HL?LLH?HH?L?LHHLH?L?LH???LH?LHLHHHLLHH??L?";
        assertEquals(13, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case162() {
        String answers = "HHHL?L?LLHL?L?HLH?HLH?HL?H??LLL??LLHHL?LHL";
        assertEquals(16, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case163() {
        String answers = "HHLLHLL?L?LHH???LL?HH?L?HLL??LHLHL??L???HL??HH?H??";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case164() {
        String answers = "HHH?HL???HHLLHHLH?L?HLHL?LH??H?LLL??HLL?L";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case165() {
        String answers = "HHHL?H?LHHHLH?HHH?LH?H?LHHLHHL?H?LLLHL?L??LH?LH?";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case166() {
        String answers = "HHLLH?LL???L???LLHLHL?L??LHHLH????HL???????L";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case167() {
        String answers = "HHH??L?HL?HLHL?LHHHLL?H??L???L??HH?LLLLH";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case168() {
        String answers = "HH?L?L?HLH?L?HH?HLH?H??L?L?HH????L?LH?LH?LHHHLHHH";
        assertEquals(16, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case169() {
        String answers = "HH?L?H?HL?HHLLLL????L?H?HLHL????L??LHH?H???H";
        assertEquals(9, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case170() {
        String answers = "HHHHH?HLLHLL???L?HLLHHHHHH?LL??LHHHLL?HL?H";
        assertEquals(8, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case171() {
        String answers = "HHHHLLH?L?LLHHL??LHLLLLHH?HH?LHLH?H??LHHH";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case172() {
        String answers = "HHHLLH?LHHHHLL?L?L?LL?L?HHHH?L?L?HL?LHLLLLHH?";
        assertEquals(13, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case173() {
        String answers = "HH?LHLHH??LHL??HLHH??HL?HLHLLH??HHLH??HHH";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case174() {
        String answers = "HH??LHLHLL?L?LL?HLHL???L?L????L?L???LLLLH";
        assertEquals(13, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case175() {
        String answers = "H??H?L?HLLH?LH????HLHHH?HH??H?HLH??L???H?H?L?L??H";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case176() {
        String answers = "HH??HLL?LHHHHHLL??L?L?L???L?H?HLHH??LH??LLL?HL?LH";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case177() {
        String answers = "HHHHHLHLLLHHH?HL?LHL?L?HLL?HHLHLHLH?L?LL?HH";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case178() {
        String answers = "HH??HH?LHHHHHLLHHL??LL???LHL??LLH?LHH?HLLLHHL???LH";
        assertEquals(13, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case179() {
        String answers = "H?LHHL?L?HL?LHLHLL?LL??HL?L???L??L?LHHH?LLH";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case180() {
        String answers = "H??HHLH?HHHHLHH??L?L?H?H?LL?HH??L??LLHH???L";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case181() {
        String answers = "HH?LHLH?LLH?L?LHLLLLLH??LLH??LLHLL?L?L??L";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case182() {
        String answers = "H???H?H?LLLLHLL??L?LLH?LL?L???LLH?L?LHL?H?H?H?LH?";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case183() {
        String answers = "HHLL?H??LHHHHL??HHHL?H?L?LH?H?H??LHL?H?HHLLLH";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case184() {
        String answers = "?HHHLLHHHHH?HHHH???HLL?H?LHLH?H??LHH?HL?";
        assertEquals(6, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case185() {
        String answers = "HH?LH?????H???HHLL?HHLH??LLHH?HHLHLLHHLHLHHL";
        assertEquals(13, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case186() {
        String answers = "HHHHH?LLHHLLHHLHLLLHHLL?L?H???H?H?HL?L?LL";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case187() {
        String answers = "?LHHHL?HHLL???H??H??L????LLL?LH??LH???HH?";
        assertEquals(8, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case188() {
        String answers = "HHL?HLHHHHLH?HHH?LHLLL?LHLL??LHLLL??L?HLH?L???L";
        assertEquals(18, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case189() {
        String answers = "HLLLLLLLHH?L?LHLH?LL?LLL??L??L?H??H?H?L?H??H?L";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case190() {
        String answers = "HHLLHHH????L?LL??L?LHHHLLHHLL?HHH??LLL?HLHLHLL";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case191() {
        String answers = "H????LLH??H?HH???HLLL?HHL??HLHH?LLHLH?HH";
        assertEquals(9, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case192() {
        String answers = "HL?HL?L?HLH??LHLL?HLHLL?LLLH??L??LL?HHH?HLL?H?L";
        assertEquals(16, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case193() {
        String answers = "HHH?L?L?HLHLHHHLLL??L?LHL?L??L?HH?HLHHLLLLHHH";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case194() {
        String answers = "H?LL???LLL?HL?L?HH??LHLLLLH?HHHL??H?LHL??L?H";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case195() {
        String answers = "?HHH?????HLHHH?LH?LLHH??LH?HHH??H?L?LLH???LLH?";
        assertEquals(8, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case196() {
        String answers = "H?????L?H?H?L?HHL??L?HH?L??HLHHLL?L?LHHL??LHHHLH?L";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case197() {
        String answers = "L?HH??L?L?HH??HHL???LL???LLL??L?LL??HLH?LLH";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case198() {
        String answers = "L?HHHH?HLLLLHH??HH?HH?L?H??H??HHHHLLL??LLLLHH?HLL";
        assertEquals(9, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case199() {
        String answers = "HLL?HHL?L?H?HLLLLLHHH??HL?L?LL?LH??LLLL??L?H?H?";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case200() {
        String answers = "H???LHHH?HH?HLL???H?LHLHH???L?LHHHH??H??LLLH?LHLH";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case201() {
        String answers = "LLH??L???L?H???L???H???HL?LHH???LLHH?HL?H?";
        assertEquals(8, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case202() {
        String answers = "LLH?LHLL??LLL?LLHHH??LHH???HLL?L?HHLH???H";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case203() {
        String answers = "LHLLHH????HL?HHLH????H??HL?LLLLLHL?L?H??L";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case204() {
        String answers = "HH?HHHLLL????????L?HHHHLHHLHLHHLH????L?HL?HHH";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case205() {
        String answers = "LHHLLLLLH?????HH??????HLH?LH?L??L?LH??LHLH?";
        assertEquals(13, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case206() {
        String answers = "L?HLLL??L?LLHLL??LH?L??LL????H?LLL?LL?HH?L";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case207() {
        String answers = "L??HHHLH?LL?LLHL?LL????LL????LHL?HHHLLLH";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case208() {
        String answers = "?HL??H??L?LHHLHLHL?LL?L?????HH???HHHLHL?H";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case209() {
        String answers = "??H??LLHHH?LHLLHLLLHHLHL?L??HH?L?HHL?HHLH?L";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case210() {
        String answers = "LLHL?HHL?HH?HHL????HLHH?LHH?LL?LL?L?H?HHLLH???";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case211() {
        String answers = "LLHHH?HH?L?H?LLL?HH?LHLL?LLL?L?????LL?HLHLH";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case212() {
        String answers = "HH?HHLLLHH?HHHHHL?LH?HHLHLHL???H?LL?H?LHH";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case213() {
        String answers = "?LH?H??HL?HHHHH??H????HH??HH??LH?L?HHHLLL?HL";
        assertEquals(7, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case214() {
        String answers = "?L?L??LLL?LL?HLL??LL????LH???LH?L?L???LHLL?HH";
        assertEquals(13, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case215() {
        String answers = "H?HLHH?????HLL?LLL?LLHLLL??LHHHHLH??LHLL?LLHH";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case216() {
        String answers = "LL??H??L?HHLL?H?HLLH?H??????L?HLH??L?HH?L";
        assertEquals(9, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case217() {
        String answers = "?LHHLLH?HL??H?LHL??L?H?HHL?HLHLH?L????HHH?L?HH?HHL";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case218() {
        String answers = "?L?H?L???H?H??H?L?HHH?LH?LH??L??LL??LHLLL";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case219() {
        String answers = "LHH??H??LLLHH?HLHHLHHLLLHLL??HL???H?LHH??L?LHL?";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case220() {
        String answers = "?HLL?LH?LLL????L??LLL?L??LL??HHLL??LH?LLL?LH";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case221() {
        String answers = "?LH?HHHL?L?HH????H?LLL?LLH?HLHHH?LH?H??L??HHL??H";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case222() {
        String answers = "H?LLHH?L?HHHLL?LHHLH?H?LHL????LHLHLLH?H??HLLL";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case223() {
        String answers = "?LL?LLHLL???HLHH?LHLL???LH?HH??HH?HL?HLLHLLHH?LH";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case224() {
        String answers = "LHLLL??HLLHL????HHLLH?H?HHLHL?HLLHL????HLH";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case225() {
        String answers = "LL??LH?HH?L????L???L?L?L?H??HHLHH??L?LH?H?L?LL";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case226() {
        String answers = "LHL?HL?LHLHH?L?HHL?HHL??L?LL?HH????LL?HLH??L?H";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case227() {
        String answers = "LL?L??LLLHHL?LHL???HHLHLHHLLL??LL???H?L?H?L?";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case228() {
        String answers = "?L?HLH?LHHLLL??LLHH??H?H?????H??HH??HHLLH??L?LLH";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case229() {
        String answers = "?LH?HHH?HLLL?L?HLLLHHH?LLHHHHH?LH?HHHLLLLL?H?LH";
        assertEquals(13, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case230() {
        String answers = "???HL?LLLH?L?HHLLHLHLL?LLHHLHHH?LH?H?HLLHH";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case231() {
        String answers = "?H?LHLLHHLLHHHLHH??LLLHHHL?LHL?LLLH?HLL?L?HHHLHL";
        assertEquals(17, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case232() {
        String answers = "?HLHLHLLLL??HLHH?LHLHLH?HLL??HL?H???LL?LHHL?L?";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case233() {
        String answers = "?LLH?LHHH?H??LHL?HH????L??LL?HH?LLLLL?LHHHL??L?L";
        assertEquals(13, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case234() {
        String answers = "?HL?HLHHLH???HH?L?L?HH?HLL?L?H??HHH?LH?HHH??LLH";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case235() {
        String answers = "LH?HH?HHLL?L?HHH???LHLLLHLHHLHL?HHLHLH??LHLLH";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case236() {
        String answers = "??LLHLHLHLLHHLHL?LHLLL?L?HLL?LL?H??LLH?LLHH??HH?H?";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case237() {
        String answers = "?L?L?H?L?H?LH?LLHH?LLL?HH?H??HLL?LLLH?L??H?LL";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case238() {
        String answers = "LL?LH?H?HHHHHHHLL?LL?HLHH??L?L?L?LLHHLLL?HHLL?LL??";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case239() {
        String answers = "??HLH?H?L?L??H?HL??H?HLHHH?LL??LLHLL?LHLLH??HLHLLL";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case240() {
        String answers = "?LL??HLL?L?LHLLH??HLLHHH??H??HLLHL?H??LL?LHLH?LL?L";
        assertEquals(13, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case241() {
        String answers = "LH???HHL?H?HLHLH?LH??H?LHLL??LHL?LLH???HHH?H??HHL";
        assertEquals(10, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case242() {
        String answers = "LHLHLH?HLLH?LHHLHL?LHLLH?L?H?H??HLH?HL??HL?HL?H??";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case243() {
        String answers = "LLL??LLHH?LLLLLHL??H?HHHL?HL??H?LLHLLLHLL?LLLHLHH?";
        assertEquals(17, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case244() {
        String answers = "LLLL?HLL??LHLHLLHLHHLHHL??L?HHLL?LHHH?H?HLL?HL?H?";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case245() {
        String answers = "?H??HLHLLHL?LHHHL?H??HH??L?HLH?LLHLLLL?LH?L?HLL?HL";
        assertEquals(16, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case246() {
        String answers = "L?L?LLHLLHHHL?L?LH?LHLLL?H?HHLLHHH?LHLLHL?LHLHH???";
        assertEquals(16, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case247() {
        String answers = "LL?LLHLLL?HLL?LHH??LHL?LLH?HL??HLL?HHLLLH?LLL?HL";
        assertEquals(17, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case248() {
        String answers = "L??L?LLH?LLL?HLH?L??L?HLHH?HH?LHLLHHHHLHL?L?L?HH";
        assertEquals(17, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case249() {
        String answers = "??L??HLH?HHLHH?H?HLLHLHHHH?L?H??LLLLL?HLLL?HHL?L";
        assertEquals(18, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case250() {
        String answers = "?L?H?L?HLH?L??LL?HLH?HHH?L?L?LLLHLL??H?LL?LHHHLLH";
        assertEquals(16, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case251() {
        String answers = "?HLH?L?HH?HHH??H?L?LLLHLHL?HL?HHL?HHHLLHL?L?L?H";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case252() {
        String answers = "LLLLL??H?H?HLLLLHHLHLLLL?HLH?HLLLLLHHHL?H?LHLL";
        assertEquals(18, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case253() {
        String answers = "?HL?LH?HHHHL?LHL?HLLHH??LLL?HLLLL?HLHHLLH?LLL?HLH";
        assertEquals(17, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case254() {
        String answers = "LH?H?HHLHL?HLLHLHHLHLLL?HHLHLLLH?LL?H?HHH?H?LHL?L";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case255() {
        String answers = "LLLHLH?L??L?LHL?L?HHLHLLL?HLH?L?H?LL?HHH?LH?LLLH?H";
        assertEquals(18, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case256() {
        String answers = "?HLL?H?HHHLHL??LLH?LLL?LLLLLLH?LHH?HLHH??L?HLHLHLL";
        assertEquals(16, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case257() {
        String answers = "LL?LLLLL?LLHLLLHLHLL?HHLHHHLHH??L??LLH?H?LHH???H?L";
        assertEquals(17, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case258() {
        String answers = "LL?LLHLH?L?L??LHL?L?H?LHL??HHHLLLHLHLL?HHHHHLHLL?H";
        assertEquals(18, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case259() {
        String answers = "?HLHLHL?HHLLL?HLLLH?LLL?H?HHLHH?L?HLHLH??HLH?LHLLH";
        assertEquals(20, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case260() {
        String answers = "LHLHLLLLHLHLL?LLHHHHH?H?HLLHH?L?HHH?L?LHHLHL?HH?H?";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case261() {
        String answers = "?L?H?HLH?H?LLHHH?LHHH?HLHLLLL?LLHL?H?HLLLLHLHL?LLL";
        assertEquals(17, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case262() {
        String answers = "?LLHLLLHLHL?H??LLLLHLL?H?HHL?HLLHLLHHL?HHH?HHLHLHH";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case263() {
        String answers = "HL??HLLLLL??L?H??LHL?HL?????LHHL??H?LHHHHL?LHH?LHH";
        assertEquals(14, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case264() {
        String answers = "LHHHHHHHHHHHHHHHHHHH?H";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case265() {
        String answers = "HH?L??H?H???LLLLL?H??HLH?HL??LLHLL?L?LL???LLHH??HH";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case266() {
        String answers = "LHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH?H";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case267() {
        String answers = "LLLLLLHHHHHHHHHLHLHHLLLLLLLHHLL";
        assertEquals(-1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case268() {
        String answers = "L?LLH??LHHLHH??HHHLL??LLH??LHHH??HLHHLH??HL";
        assertEquals(11, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case269() {
        String answers = "?????????????????????????????????????????????????L";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case270() {
        String answers = "??LHLL???LHL?LLHH??????LH??H??????L???LL???LH?HH?";
        assertEquals(9, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case271() {
        String answers = "LHLH??????????????????????????????????????????";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case272() {
        String answers = "LLLLLL???????LLLLHHHHHHLL??HHHHLLLL";
        assertEquals(8, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case273() {
        String answers = "???????????????????????????????????????????????";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case274() {
        String answers = "HLH?LH?LLLLL??LHH?????HHH????H???????";
        assertEquals(7, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case275() {
        String answers = "??LLLHHLHL??HLLHHLHLHHHLL??HLHLLHLLH??HHLLH?LHL??";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case276() {
        String answers = "??????HLH?LH?LLLLL??LHH?????HHH????H???????";
        assertEquals(7, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case277() {
        String answers = "LL??LLL??";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case278() {
        String answers = "LLHH";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case279() {
        String answers = "?LLHL?L??HH?LL?LHL?HH?LH?";
        assertEquals(7, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case280() {
        String answers = "LLLL";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case281() {
        String answers = "HHLL";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case282() {
        String answers = "??????????????????????????????????????????????????";
        assertEquals(0, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case283() {
        String answers = "??HHLL?LLHHL";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case284() {
        String answers = "LLL?LLL?LLL";
        assertEquals(5, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case285() {
        String answers = "LL";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case286() {
        String answers = "H?LLLLLL??HHH?LH?HHHHH?LHLHHL";
        assertEquals(8, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case287() {
        String answers = "????????????HLH?LH?LLLLL??LHH?????HHH????H???????";
        assertEquals(7, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case288() {
        String answers = "HLH??LH???HLH??LH???HLH??LH???HLH??LH???HLH??LH???";
        assertEquals(15, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case289() {
        String answers = "L?L?";
        assertEquals(2, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case290() {
        String answers = "H?L";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case291() {
        String answers = "??LHLHLH??H?HHHLLLLHLLLLHHLHLLHLHLL?HLLLHHH??LHLH?";
        assertEquals(17, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case292() {
        String answers = "LHL?LLH?HH???L";
        assertEquals(3, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case293() {
        String answers = "HHHL";
        assertEquals(-1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case294() {
        String answers = "?LHH?";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case295() {
        String answers = "???L";
        assertEquals(1, conundrumreloaded.minimumLiars(answers));
    }

    @Test
    public void case296() {
        String answers = "HLLL??HLLHLLHH??LH?HHL??HLHHL?LHLHHLL???";
        assertEquals(12, conundrumreloaded.minimumLiars(answers));
    }

}
