package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class EllysTSPTest {
    EllysTSP ellystsp = new EllysTSP();

    @Test
    public void case1() {
        String places = "CVVVC";
        assertEquals(5, ellystsp.getMax(places));
    }

    @Test
    public void case2() {
        String places = "VVV";
        assertEquals(1, ellystsp.getMax(places));
    }

    @Test
    public void case3() {
        String places = "VVVVCVV";
        assertEquals(3, ellystsp.getMax(places));
    }

    @Test
    public void case4() {
        String places = "CVCVCVC";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case5() {
        String places = "C";
        assertEquals(1, ellystsp.getMax(places));
    }

    @Test
    public void case6() {
        String places = "V";
        assertEquals(1, ellystsp.getMax(places));
    }

    @Test
    public void case7() {
        String places = "CV";
        assertEquals(2, ellystsp.getMax(places));
    }

    @Test
    public void case8() {
        String places = "VC";
        assertEquals(2, ellystsp.getMax(places));
    }

    @Test
    public void case9() {
        String places = "CCCCCC";
        assertEquals(1, ellystsp.getMax(places));
    }

    @Test
    public void case10() {
        String places = "VVVCCC";
        assertEquals(6, ellystsp.getMax(places));
    }

    @Test
    public void case11() {
        String places = "VCVCCVVCCCVCCVCVVCVCVVCVVVCCCVCVCVCC";
        assertEquals(35, ellystsp.getMax(places));
    }

    @Test
    public void case12() {
        String places = "CCC";
        assertEquals(1, ellystsp.getMax(places));
    }

    @Test
    public void case13() {
        String places = "CVVCCCCVVCCVCVCVCCVCVCVVCCCCVVCCCC";
        assertEquals(27, ellystsp.getMax(places));
    }

    @Test
    public void case14() {
        String places = "CVCVCCVVVCVVCVCVCCVCVVVVVCCVVCVCCCCVVVVCCVCVCVCVVC";
        assertEquals(47, ellystsp.getMax(places));
    }

    @Test
    public void case15() {
        String places = "VCCCVVCVCVVVVVCVCCCVCCCCCCCVCCVVCCCVVVCVCVVCCVCVCC";
        assertEquals(45, ellystsp.getMax(places));
    }

    @Test
    public void case16() {
        String places = "CVVVCVVCVVCCVCCVVCVCCCVCCCCCCCCVVCVV";
        assertEquals(33, ellystsp.getMax(places));
    }

    @Test
    public void case17() {
        String places = "CCVCCVVVCVCVVCVV";
        assertEquals(15, ellystsp.getMax(places));
    }

    @Test
    public void case18() {
        String places = "VCCCCVCCCCVCCVCCCCVVVCCCVCCVCVC";
        assertEquals(21, ellystsp.getMax(places));
    }

    @Test
    public void case19() {
        String places = "VCCVCVCVVCVCCVVCVVCVCVCVVVCCCCVVCCCCVCCCVV";
        assertEquals(41, ellystsp.getMax(places));
    }

    @Test
    public void case20() {
        String places = "CVVCVVCCCCCVVCVCVVCVV";
        assertEquals(21, ellystsp.getMax(places));
    }

    @Test
    public void case21() {
        String places = "CVCVVCCVVVCVCVCVCVVVCCVCCV";
        assertEquals(25, ellystsp.getMax(places));
    }

    @Test
    public void case22() {
        String places = "VCCVVVVCCCVCCV";
        assertEquals(14, ellystsp.getMax(places));
    }

    @Test
    public void case23() {
        String places = "CCVCVCVVVCCCVCCVCVCCCCVCVCCCVCCCCCCCVCVVVC";
        assertEquals(31, ellystsp.getMax(places));
    }

    @Test
    public void case24() {
        String places = "VCVCCVVVVVCCVVCVVCVCVVVCVVCCVCCVVVVCVCCCCVVCVVCCCV";
        assertEquals(45, ellystsp.getMax(places));
    }

    @Test
    public void case25() {
        String places = "CCVVVVCVCVVCVCVCCCCVVCVCVCCCVCVCCCVVVCCVVCVVCCVVVV";
        assertEquals(49, ellystsp.getMax(places));
    }

    @Test
    public void case26() {
        String places = "CCVVCCCVVCVCCCVVCCVVVVCCV";
        assertEquals(25, ellystsp.getMax(places));
    }

    @Test
    public void case27() {
        String places = "CCVVVCCVVCVCVVCVVCVCCVCCVVVVVVCVVV";
        assertEquals(27, ellystsp.getMax(places));
    }

    @Test
    public void case28() {
        String places = "CVVCCCCVVVVVCCCVCCCCVCCCVCVCV";
        assertEquals(25, ellystsp.getMax(places));
    }

    @Test
    public void case29() {
        String places = "CCCCVCVVVVCVCCCVVCCCVVVCV";
        assertEquals(25, ellystsp.getMax(places));
    }

    @Test
    public void case30() {
        String places = "VCVCCCCCCCCVCVCCVCCCCVVVCCCVVVCCVVCCVCCVCVVCCCCVCC";
        assertEquals(37, ellystsp.getMax(places));
    }

    @Test
    public void case31() {
        String places = "VCCCVCVVVVCC";
        assertEquals(12, ellystsp.getMax(places));
    }

    @Test
    public void case32() {
        String places = "VVVCCCVCCV";
        assertEquals(10, ellystsp.getMax(places));
    }

    @Test
    public void case33() {
        String places = "V";
        assertEquals(1, ellystsp.getMax(places));
    }

    @Test
    public void case34() {
        String places = "CVVVVVVVCVVVVVVCVVCVCVVVVCCVC";
        assertEquals(17, ellystsp.getMax(places));
    }

    @Test
    public void case35() {
        String places = "CVVVCCCCCVVCVVC";
        assertEquals(15, ellystsp.getMax(places));
    }

    @Test
    public void case36() {
        String places = "CVCVCV";
        assertEquals(6, ellystsp.getMax(places));
    }

    @Test
    public void case37() {
        String places = "CCCVCVVVCCCCVCCVCVCCCV";
        assertEquals(17, ellystsp.getMax(places));
    }

    @Test
    public void case38() {
        String places = "VVVCCVVVVVVVCCCCCVCCVVCVCCVCCCVCCVCVCCCVVCVCCCCCVV";
        assertEquals(47, ellystsp.getMax(places));
    }

    @Test
    public void case39() {
        String places = "VCCVCCVCVVVVV";
        assertEquals(11, ellystsp.getMax(places));
    }

    @Test
    public void case40() {
        String places = "VCVCCVCCCVVCVVVCCCVCVCCVCVCVCVVVCCVCVVCCVVVVVCC";
        assertEquals(47, ellystsp.getMax(places));
    }

    @Test
    public void case41() {
        String places = "VVCCVVVVCVVCCVCCVCVVCCVVVCVCCCCVVCVC";
        assertEquals(35, ellystsp.getMax(places));
    }

    @Test
    public void case42() {
        String places = "CCVVCVVCVVCVCCVVVVCCCVCVVVVVCCCCVCCCVVCCVCCCVCCVVC";
        assertEquals(49, ellystsp.getMax(places));
    }

    @Test
    public void case43() {
        String places = "VCCCVCCVCC";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case44() {
        String places = "VVCCCCCVVVCVCVCVCVCVVCVCVVCVCVCCVCVVVCCVVCVCVVCVCC";
        assertEquals(49, ellystsp.getMax(places));
    }

    @Test
    public void case45() {
        String places = "VVVVVCCVCCVVVCCVVVVCVCCVVVVCCVVCCVCVVCCVVVCCCCVVVC";
        assertEquals(43, ellystsp.getMax(places));
    }

    @Test
    public void case46() {
        String places = "CVVCCCCCCCVVCV";
        assertEquals(11, ellystsp.getMax(places));
    }

    @Test
    public void case47() {
        String places = "CVCVVVCCVVV";
        assertEquals(9, ellystsp.getMax(places));
    }

    @Test
    public void case48() {
        String places = "CCVVCVVCVCVVVCVCVCCVVC";
        assertEquals(21, ellystsp.getMax(places));
    }

    @Test
    public void case49() {
        String places = "VVCVVVVVCVCVVVVVVCCCCVVCCVCVCVVCCVCCCVCCCCV";
        assertEquals(41, ellystsp.getMax(places));
    }

    @Test
    public void case50() {
        String places = "CCVCVCVVVVCVCCVCCCVCVCCCVCVVCVCVCCCCCCVVVCVCV";
        assertEquals(41, ellystsp.getMax(places));
    }

    @Test
    public void case51() {
        String places = "CVVVCCVVVVVVVCCVCVCCC";
        assertEquals(19, ellystsp.getMax(places));
    }

    @Test
    public void case52() {
        String places = "VCVCVCVVCVVCCCCCCVCVVVCCV";
        assertEquals(25, ellystsp.getMax(places));
    }

    @Test
    public void case53() {
        String places = "CVCVCVCVCCVCVCCVCVVCVCCCVCVVVVCVVVCCVC";
        assertEquals(38, ellystsp.getMax(places));
    }

    @Test
    public void case54() {
        String places = "CCVVVVVCCVVVVVCVCCCVCVCCVVCVCVC";
        assertEquals(29, ellystsp.getMax(places));
    }

    @Test
    public void case55() {
        String places = "CCVVCCCVVVCCCCCCCVVVCCV";
        assertEquals(19, ellystsp.getMax(places));
    }

    @Test
    public void case56() {
        String places = "CCCVCVVCCVCVCVCCCCVCCCVVCCVCCCVVCVVCVCCCVVCCCCCCCC";
        assertEquals(35, ellystsp.getMax(places));
    }

    @Test
    public void case57() {
        String places = "CCVVCVVVVVVCVCV";
        assertEquals(11, ellystsp.getMax(places));
    }

    @Test
    public void case58() {
        String places = "VVCVCCVCVVCCVVCCCVVCCCVCCCCVVVCCVVCVVVC";
        assertEquals(39, ellystsp.getMax(places));
    }

    @Test
    public void case59() {
        String places = "CVCVVCVCCCVVCCVCVCVCVVVCCCCVCVCCVVCVCVVCVCCCCCCCCC";
        assertEquals(41, ellystsp.getMax(places));
    }

    @Test
    public void case60() {
        String places = "VCCVVCVVVCVVCCCCCVVCVVVCCCCCCVVCCCVCCVVCVCCCCCVV";
        assertEquals(43, ellystsp.getMax(places));
    }

    @Test
    public void case61() {
        String places = "VVVVCCCCVVVCVVCVCC";
        assertEquals(17, ellystsp.getMax(places));
    }

    @Test
    public void case62() {
        String places = "VVVVCV";
        assertEquals(3, ellystsp.getMax(places));
    }

    @Test
    public void case63() {
        String places = "CCCVCVCVCVVCVCVVCCVVCVCCCCVCVVCVCCCVCCCCVVVCVVCVCV";
        assertEquals(47, ellystsp.getMax(places));
    }

    @Test
    public void case64() {
        String places = "VCVCCVCCCVCCVVCCCVVVCCVCVVVCVCVVCVVVVCVCCVCVCVCCCV";
        assertEquals(50, ellystsp.getMax(places));
    }

    @Test
    public void case65() {
        String places = "CCCVCCVVCCCVCCVCVCCVVVVVVVC";
        assertEquals(27, ellystsp.getMax(places));
    }

    @Test
    public void case66() {
        String places = "VCCVCCCVVCCVVVCCCVCCCVVCCCCVCCVVVCCVVVCVVVVVVVCCVV";
        assertEquals(49, ellystsp.getMax(places));
    }

    @Test
    public void case67() {
        String places = "VVVVVVCVCVCVVCVVVVCCVCCCVCVCVCVCVVCVCC";
        assertEquals(33, ellystsp.getMax(places));
    }

    @Test
    public void case68() {
        String places = "VCCCCCVVVVCC";
        assertEquals(11, ellystsp.getMax(places));
    }

    @Test
    public void case69() {
        String places = "CCVCVCVCVVVCCCCCVCVVVVVVVVVCVCCVCVVCVCCCCVCVCCCC";
        assertEquals(47, ellystsp.getMax(places));
    }

    @Test
    public void case70() {
        String places = "VCVVVCVVCCCCCCVVVCCVCVCCCVCCVCCCVCVCVCCCCCCVVVCVCV";
        assertEquals(43, ellystsp.getMax(places));
    }

    @Test
    public void case71() {
        String places = "CCVCVCCCCVC";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case72() {
        String places = "CVVCVVCCVCCVCVCVCVVCCVCCCCVVVVCVVCCVCVCCCCCCCCCVCV";
        assertEquals(43, ellystsp.getMax(places));
    }

    @Test
    public void case73() {
        String places = "VVCCCVCVVC";
        assertEquals(10, ellystsp.getMax(places));
    }

    @Test
    public void case74() {
        String places = "VVVCCCVCVCCCVVVVCCVCVCVVVCCCVCVCVCVVCCCCCCVCVVVCVC";
        assertEquals(49, ellystsp.getMax(places));
    }

    @Test
    public void case75() {
        String places = "CCCCCVVVVVCCVVCCVVCVVCCCVVCCVCCCCCCCVVCCVVVVVVCCCC";
        assertEquals(45, ellystsp.getMax(places));
    }

    @Test
    public void case76() {
        String places = "CC";
        assertEquals(1, ellystsp.getMax(places));
    }

    @Test
    public void case77() {
        String places = "VCVCCCVCCVCVVVCVVVCCVCVCVCVCVVVVVVCVVCCCCCCCVVVCCC";
        assertEquals(50, ellystsp.getMax(places));
    }

    @Test
    public void case78() {
        String places = "CCCCVVCVVCVCCVCCVCCCCCVVCCVCVVVCCCVCVCCCCVCCCCVVC";
        assertEquals(37, ellystsp.getMax(places));
    }

    @Test
    public void case79() {
        String places = "VCVVCVVCVVV";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case80() {
        String places = "VCVCVVVVCCCCCVCVVCVCCVVCVCCCCCVCCVCVVVVVCCCCCCCCCC";
        assertEquals(41, ellystsp.getMax(places));
    }

    @Test
    public void case81() {
        String places = "CVVCVCVVCVVCCVVCCVVCVVCVCCVVVVCVCCCVCCCVCCCVCVVV";
        assertEquals(47, ellystsp.getMax(places));
    }

    @Test
    public void case82() {
        String places = "VVCVVCCVCCCCVCVCVCVVVCCCVVVVC";
        assertEquals(29, ellystsp.getMax(places));
    }

    @Test
    public void case83() {
        String places = "CCVVCVVVCCCCCVVCVVCCCVCVVVVVCVCCVCCCCVCVC";
        assertEquals(39, ellystsp.getMax(places));
    }

    @Test
    public void case84() {
        String places = "VVCCCVCCCCCCCVVVVVVVCCVCCCVCCCVCVVCVC";
        assertEquals(33, ellystsp.getMax(places));
    }

    @Test
    public void case85() {
        String places = "VVCCCCVVVCVCCVC";
        assertEquals(15, ellystsp.getMax(places));
    }

    @Test
    public void case86() {
        String places = "CVVCCCCVVCVVV";
        assertEquals(13, ellystsp.getMax(places));
    }

    @Test
    public void case87() {
        String places = "CCCCCVCCVVCCCCVCVCVVCVVVVVVCVVVVCVVCVVVCCVVCCVVVVV";
        assertEquals(43, ellystsp.getMax(places));
    }

    @Test
    public void case88() {
        String places = "CVCVVCCCCCVVVVCCCVVCVCCVVVCVCVCCCCV";
        assertEquals(33, ellystsp.getMax(places));
    }

    @Test
    public void case89() {
        String places = "VCCVVVCVVVCC";
        assertEquals(11, ellystsp.getMax(places));
    }

    @Test
    public void case90() {
        String places = "CVCCCCCCVVVCV";
        assertEquals(11, ellystsp.getMax(places));
    }

    @Test
    public void case91() {
        String places = "VVVCVVVVVCCVCCVVVCCVCVCVVVCCCCVCCVCVCVCVVVVCVCVVVV";
        assertEquals(41, ellystsp.getMax(places));
    }

    @Test
    public void case92() {
        String places = "CVVVCVCCCCVVVCVCCCV";
        assertEquals(19, ellystsp.getMax(places));
    }

    @Test
    public void case93() {
        String places = "VCVVVVVCVCCCCCVVCVCCCCVVVVCCVCCCCCVCCVCCVVCVC";
        assertEquals(41, ellystsp.getMax(places));
    }

    @Test
    public void case94() {
        String places = "CVVCCCCCCCCCVCCVVVCCVVVVCCCCCVCVCVV";
        assertEquals(29, ellystsp.getMax(places));
    }

    @Test
    public void case95() {
        String places = "CVCVVCCCCVCCVCVCVCCCVCCCCVCVVVCVVCCCVCVCCVCCCVCCCC";
        assertEquals(37, ellystsp.getMax(places));
    }

    @Test
    public void case96() {
        String places = "CCVVVVVVCCCCCCV";
        assertEquals(15, ellystsp.getMax(places));
    }

    @Test
    public void case97() {
        String places = "VCVCVVCCCCCVVVVVCCVCCCVVVC";
        assertEquals(26, ellystsp.getMax(places));
    }

    @Test
    public void case98() {
        String places = "VVVCVVVVVCCCCCCVCCVVVCVCVCVVCVCC";
        assertEquals(31, ellystsp.getMax(places));
    }

    @Test
    public void case99() {
        String places = "CVVCCVCCCCVVVVVCVVVCVCCCCVVVVCCCCVC";
        assertEquals(35, ellystsp.getMax(places));
    }

    @Test
    public void case100() {
        String places = "VCVVVVVVCVCVCVVCCCVCVVC";
        assertEquals(19, ellystsp.getMax(places));
    }

    @Test
    public void case101() {
        String places = "CCVV";
        assertEquals(4, ellystsp.getMax(places));
    }

    @Test
    public void case102() {
        String places = "CCCVVV";
        assertEquals(6, ellystsp.getMax(places));
    }

    @Test
    public void case103() {
        String places = "VVCC";
        assertEquals(4, ellystsp.getMax(places));
    }

    @Test
    public void case104() {
        String places = "CVCV";
        assertEquals(4, ellystsp.getMax(places));
    }

    @Test
    public void case105() {
        String places = "VCVC";
        assertEquals(4, ellystsp.getMax(places));
    }

    @Test
    public void case106() {
        String places = "CCVVVVV";
        assertEquals(5, ellystsp.getMax(places));
    }

    @Test
    public void case107() {
        String places = "VCVCVC";
        assertEquals(6, ellystsp.getMax(places));
    }

    @Test
    public void case108() {
        String places = "CCVVV";
        assertEquals(5, ellystsp.getMax(places));
    }

    @Test
    public void case109() {
        String places = "CCCVVVVV";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case110() {
        String places = "VVVCCCCC";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case111() {
        String places = "VVVVVCC";
        assertEquals(5, ellystsp.getMax(places));
    }

    @Test
    public void case112() {
        String places = "CVVC";
        assertEquals(4, ellystsp.getMax(places));
    }

    @Test
    public void case113() {
        String places = "VVCCCCCC";
        assertEquals(5, ellystsp.getMax(places));
    }

    @Test
    public void case114() {
        String places = "CVCVCVCV";
        assertEquals(8, ellystsp.getMax(places));
    }

    @Test
    public void case115() {
        String places = "VVVVCCCCCCCCC";
        assertEquals(9, ellystsp.getMax(places));
    }

    @Test
    public void case116() {
        String places = "CCCCCCVVVV";
        assertEquals(9, ellystsp.getMax(places));
    }

    @Test
    public void case117() {
        String places = "VVVCCCVVVV";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case118() {
        String places = "VVVVVVCCCCCCCCCCC";
        assertEquals(13, ellystsp.getMax(places));
    }

    @Test
    public void case119() {
        String places = "CVVVVVVVVVVVC";
        assertEquals(5, ellystsp.getMax(places));
    }

    @Test
    public void case120() {
        String places = "CCCCCVCVVVVVCCCCCVCVVVVVV";
        assertEquals(25, ellystsp.getMax(places));
    }

    @Test
    public void case121() {
        String places = "VVVVVVVVVCC";
        assertEquals(5, ellystsp.getMax(places));
    }

    @Test
    public void case122() {
        String places = "VVVVVVVCCC";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case123() {
        String places = "VVVC";
        assertEquals(3, ellystsp.getMax(places));
    }

    @Test
    public void case124() {
        String places = "CVCVCVCVCVCVCV";
        assertEquals(14, ellystsp.getMax(places));
    }

    @Test
    public void case125() {
        String places = "CCCCCVVVVV";
        assertEquals(10, ellystsp.getMax(places));
    }

    @Test
    public void case126() {
        String places = "CCCVVVVVVV";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case127() {
        String places = "VVVVVCCC";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case128() {
        String places = "VVVVVVVVVVVVVCC";
        assertEquals(5, ellystsp.getMax(places));
    }

    @Test
    public void case129() {
        String places = "CCCVVVVVVVVVV";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case130() {
        String places = "VCVCVCVCCVCVCVCVVCVVCC";
        assertEquals(22, ellystsp.getMax(places));
    }

    @Test
    public void case131() {
        String places = "CCCCCCVVVVVV";
        assertEquals(12, ellystsp.getMax(places));
    }

    @Test
    public void case132() {
        String places = "VVCCCC";
        assertEquals(5, ellystsp.getMax(places));
    }

    @Test
    public void case133() {
        String places = "CVCVCVCCC";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case134() {
        String places = "CCCCCVVV";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case135() {
        String places = "CCCCCCVVV";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case136() {
        String places = "CCCCVVVVVVVV";
        assertEquals(9, ellystsp.getMax(places));
    }

    @Test
    public void case137() {
        String places = "VVVCC";
        assertEquals(5, ellystsp.getMax(places));
    }

    @Test
    public void case138() {
        String places = "VVVCCCCCCCC";
        assertEquals(7, ellystsp.getMax(places));
    }

    @Test
    public void case139() {
        String places = "CCCCVVVVVV";
        assertEquals(9, ellystsp.getMax(places));
    }

}
