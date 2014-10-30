package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class SpecialStringsTest {
    SpecialStrings specialstrings = new SpecialStrings();

    @Test
    public void case1() {
        String current = "00101";
        assertEquals("00111", specialstrings.findNext(current));
    }

    @Test
    public void case2() {
        String current = "0010111";
        assertEquals("0011011", specialstrings.findNext(current));
    }

    @Test
    public void case3() {
        String current = "000010001001011";
        assertEquals("000010001001101", specialstrings.findNext(current));
    }

    @Test
    public void case4() {
        String current = "0";
        assertEquals("1", specialstrings.findNext(current));
    }

    @Test
    public void case5() {
        String current = "001111111111111111111111";
        assertEquals("010101010101010101010111", specialstrings.findNext(current));
    }

    @Test
    public void case6() {
        String current = "0111111111111111111111111111";
        assertEquals("", specialstrings.findNext(current));
    }

    @Test
    public void case7() {
        String current = "0001111111111111111111111111111111111111111";
        assertEquals("0010010010010010010010010010010010010010011", specialstrings.findNext(current));
    }

    @Test
    public void case8() {
        String current = "010101010101010101010101010101011111";
        assertEquals("010101010101010101010101010101101011", specialstrings.findNext(current));
    }

    @Test
    public void case9() {
        String current = "01";
        assertEquals("", specialstrings.findNext(current));
    }

    @Test
    public void case10() {
        String current = "01101111011110111";
        assertEquals("01101111011111111", specialstrings.findNext(current));
    }

    @Test
    public void case11() {
        String current = "000000001010110110100110010000011";
        assertEquals("000000001010110110100110010000101", specialstrings.findNext(current));
    }

    @Test
    public void case12() {
        String current = "000010100011111001001";
        assertEquals("000010100011111001011", specialstrings.findNext(current));
    }

    @Test
    public void case13() {
        String current = "00000010000011110011111010001001011011";
        assertEquals("00000010000011110011111010001001011101", specialstrings.findNext(current));
    }

    @Test
    public void case14() {
        String current = "00000111110111001101000110101";
        assertEquals("00000111110111001101000110111", specialstrings.findNext(current));
    }

    @Test
    public void case15() {
        String current = "00001110110101111011001010000111111101110011";
        assertEquals("00001110110101111011001010000111111101110101", specialstrings.findNext(current));
    }

    @Test
    public void case16() {
        String current = "00011011011111111010111011011";
        assertEquals("00011011011111111010111011101", specialstrings.findNext(current));
    }

    @Test
    public void case17() {
        String current = "0000001001111000101100001000001110000101";
        assertEquals("0000001001111000101100001000001110000111", specialstrings.findNext(current));
    }

    @Test
    public void case18() {
        String current = "000001100001101010010101";
        assertEquals("000001100001101010010111", specialstrings.findNext(current));
    }

    @Test
    public void case19() {
        String current = "0001110100100101010101011";
        assertEquals("0001110100100101010101101", specialstrings.findNext(current));
    }

    @Test
    public void case20() {
        String current = "000001001011101011010111011";
        assertEquals("000001001011101011010111101", specialstrings.findNext(current));
    }

    @Test
    public void case21() {
        String current = "00100111101001010101011010011";
        assertEquals("00100111101001010101011010101", specialstrings.findNext(current));
    }

    @Test
    public void case22() {
        String current = "00001010100010101011001001";
        assertEquals("00001010100010101011001011", specialstrings.findNext(current));
    }

    @Test
    public void case23() {
        String current = "0000011010010110001100111101101000010100011110111";
        assertEquals("0000011010010110001100111101101000010100011111001", specialstrings.findNext(current));
    }

    @Test
    public void case24() {
        String current = "00011110101110011110100011111011001110111";
        assertEquals("00011110101110011110100011111011001111001", specialstrings.findNext(current));
    }

    @Test
    public void case25() {
        String current = "000001100101100001101101010001110011111111101011";
        assertEquals("000001100101100001101101010001110011111111101101", specialstrings.findNext(current));
    }

    @Test
    public void case26() {
        String current = "0000110100011010111101101011100101101101111";
        assertEquals("0000110100011010111101101011100101101110001", specialstrings.findNext(current));
    }

    @Test
    public void case27() {
        String current = "00000001001111110100001111000001000101100011011";
        assertEquals("00000001001111110100001111000001000101100011101", specialstrings.findNext(current));
    }

    @Test
    public void case28() {
        String current = "0001001011111111111010111101111101001";
        assertEquals("0001001011111111111010111101111101011", specialstrings.findNext(current));
    }

    @Test
    public void case29() {
        String current = "000000110100100000111001010011101000010101011101";
        assertEquals("000000110100100000111001010011101000010101011111", specialstrings.findNext(current));
    }

    @Test
    public void case30() {
        String current = "00000011010111001100010001101001101001111111";
        assertEquals("00000011010111001100010001101001101010000011", specialstrings.findNext(current));
    }

    @Test
    public void case31() {
        String current = "00001010001100101011110010111110011101111";
        assertEquals("00001010001100101011110010111110011110001", specialstrings.findNext(current));
    }

    @Test
    public void case32() {
        String current = "000000001111001000010111101001111011";
        assertEquals("000000001111001000010111101001111101", specialstrings.findNext(current));
    }

    @Test
    public void case33() {
        String current = "001011011101110111111111";
        assertEquals("001011011101111001011101", specialstrings.findNext(current));
    }

    @Test
    public void case34() {
        String current = "00000100110110110101010111101010001111010010101";
        assertEquals("00000100110110110101010111101010001111010010111", specialstrings.findNext(current));
    }

    @Test
    public void case35() {
        String current = "00001111011110111111011";
        assertEquals("00001111011110111111101", specialstrings.findNext(current));
    }

    @Test
    public void case36() {
        String current = "0101010110101111111011110101111110101010111011111";
        assertEquals("0101010110101111111011110101111110101010111101011", specialstrings.findNext(current));
    }

    @Test
    public void case37() {
        String current = "0101110101110111011010111111111101011111";
        assertEquals("0101110101110111011010111111111101101111", specialstrings.findNext(current));
    }

    @Test
    public void case38() {
        String current = "010111011011110111011010111111110110111111";
        assertEquals("010111011011110111011010111111110111011011", specialstrings.findNext(current));
    }

    @Test
    public void case39() {
        String current = "01010111011111110111110110101101101111111";
        assertEquals("01010111011111110111110110101101110101111", specialstrings.findNext(current));
    }

    @Test
    public void case40() {
        String current = "010111111101111111110111111111111101111011011111";
        assertEquals("010111111101111111110111111111111101111011101111", specialstrings.findNext(current));
    }

    @Test
    public void case41() {
        String current = "0101011101011101110101110101101011011011101111";
        assertEquals("0101011101011101110101110101101011011011110111", specialstrings.findNext(current));
    }

    @Test
    public void case42() {
        String current = "0101010101010111011011010111011110111111011";
        assertEquals("0101010101010111011011010111011110111111111", specialstrings.findNext(current));
    }

    @Test
    public void case43() {
        String current = "010101011011101101111111010111110101011110111111";
        assertEquals("010101011011101101111111010111110101011111010111", specialstrings.findNext(current));
    }

    @Test
    public void case44() {
        String current = "0101101011111111011011110110110101110111";
        assertEquals("0101101011111111011011110110110101111011", specialstrings.findNext(current));
    }

    @Test
    public void case45() {
        String current = "01011101111110110101111111111011111011111";
        assertEquals("01011101111110110101111111111011111101111", specialstrings.findNext(current));
    }

    @Test
    public void case46() {
        String current = "000111110010110011011011101001111001001010101011";
        assertEquals("000111110010110011011011101001111001001010101101", specialstrings.findNext(current));
    }

    @Test
    public void case47() {
        String current = "0001101010001111010110010100111010101010001111101";
        assertEquals("0001101010001111010110010100111010101010001111111", specialstrings.findNext(current));
    }

    @Test
    public void case48() {
        String current = "000110001111110011101100011001111101001010111";
        assertEquals("000110001111110011101100011001111101001011001", specialstrings.findNext(current));
    }

    @Test
    public void case49() {
        String current = "000111001010110010100111101001001001011100110011";
        assertEquals("000111001010110010100111101001001001011100110101", specialstrings.findNext(current));
    }

    @Test
    public void case50() {
        String current = "000110111001010001101111101111101001111110101111";
        assertEquals("000110111001010001101111101111101001111110110011", specialstrings.findNext(current));
    }

    @Test
    public void case51() {
        String current = "00011011000111111001010111010111011111011";
        assertEquals("00011011000111111001010111010111011111101", specialstrings.findNext(current));
    }

    @Test
    public void case52() {
        String current = "00011001011111100100011001100110110110101";
        assertEquals("00011001011111100100011001100110110110111", specialstrings.findNext(current));
    }

    @Test
    public void case53() {
        String current = "0001101010111101110100110110101100111101";
        assertEquals("0001101010111101110100110110101100111111", specialstrings.findNext(current));
    }

    @Test
    public void case54() {
        String current = "00011010111010011011010111101101100110011";
        assertEquals("00011010111010011011010111101101100110101", specialstrings.findNext(current));
    }

    @Test
    public void case55() {
        String current = "00011010111101101010111010111101010010101";
        assertEquals("00011010111101101010111010111101010010111", specialstrings.findNext(current));
    }

    @Test
    public void case56() {
        String current = "0001101011011110110011001101110110111011011010101";
        assertEquals("0001101011011110110011001101110110111011011010111", specialstrings.findNext(current));
    }

    @Test
    public void case57() {
        String current = "000110001111010111000110101100111000111101";
        assertEquals("000110001111010111000110101100111000111111", specialstrings.findNext(current));
    }

    @Test
    public void case58() {
        String current = "000110010010110110101010111110100101100101001";
        assertEquals("000110010010110110101010111110100101100101011", specialstrings.findNext(current));
    }

    @Test
    public void case59() {
        String current = "0001110010110110101111001000111001101111101110011";
        assertEquals("0001110010110110101111001000111001101111101110101", specialstrings.findNext(current));
    }

    @Test
    public void case60() {
        String current = "0001101100011011101111010111101110011110111111";
        assertEquals("0001101100011011101111010111101110011111000111", specialstrings.findNext(current));
    }

    @Test
    public void case61() {
        String current = "0001100101111110100100110100101010010010111";
        assertEquals("0001100101111110100100110100101010010011001", specialstrings.findNext(current));
    }

    @Test
    public void case62() {
        String current = "000110011110101011101001110001110101101000111";
        assertEquals("000110011110101011101001110001110101101001001", specialstrings.findNext(current));
    }

    @Test
    public void case63() {
        String current = "0001100101101100111000111101110101011101100101001";
        assertEquals("0001100101101100111000111101110101011101100101011", specialstrings.findNext(current));
    }

    @Test
    public void case64() {
        String current = "0001101110010101001011110001111111001101";
        assertEquals("0001101110010101001011110001111111001111", specialstrings.findNext(current));
    }

    @Test
    public void case65() {
        String current = "000111100111011101101010110011011101001010111";
        assertEquals("000111100111011101101010110011011101001011001", specialstrings.findNext(current));
    }

    @Test
    public void case66() {
        String current = "000110100100100111100011111101010111110111";
        assertEquals("000110100100100111100011111101010111111001", specialstrings.findNext(current));
    }

    @Test
    public void case67() {
        String current = "000110111111001001101010111110011100111001";
        assertEquals("000110111111001001101010111110011100111011", specialstrings.findNext(current));
    }

    @Test
    public void case68() {
        String current = "00011111010111010101001010111110011001101001";
        assertEquals("00011111010111010101001010111110011001101011", specialstrings.findNext(current));
    }

    @Test
    public void case69() {
        String current = "000110101111110101010010011110110111111111101101";
        assertEquals("000110101111110101010010011110110111111111101111", specialstrings.findNext(current));
    }

    @Test
    public void case70() {
        String current = "000111101010100101001101111000111110110101101";
        assertEquals("000111101010100101001101111000111110110101111", specialstrings.findNext(current));
    }

    @Test
    public void case71() {
        String current = "01111111111111111111111111111111111111111111111111";
        assertEquals("", specialstrings.findNext(current));
    }

    @Test
    public void case72() {
        String current = "011111111111111111111111111111111111111111";
        assertEquals("", specialstrings.findNext(current));
    }

    @Test
    public void case73() {
        String current = "01111111111111111111111101111111111111111111111111";
        assertEquals("01111111111111111111111111111111111111111111111111", specialstrings.findNext(current));
    }

    @Test
    public void case74() {
        String current = "1";
        assertEquals("", specialstrings.findNext(current));
    }

    @Test
    public void case75() {
        String current = "00111111111111111111111111111111111111111111111111";
        assertEquals("01010101010101010101010101010101010101010101010111", specialstrings.findNext(current));
    }

    @Test
    public void case76() {
        String current = "0011111111111111111111111111111111111111111111";
        assertEquals("0101010101010101010101010101010101010101010111", specialstrings.findNext(current));
    }

    @Test
    public void case77() {
        String current = "00000000000000001000000000000000100100011101110001";
        assertEquals("00000000000000001000000000000000100100011101110011", specialstrings.findNext(current));
    }

    @Test
    public void case78() {
        String current = "010101010101010101010111111111111111111111111";
        assertEquals("010101010101010101011010101010101010101011011", specialstrings.findNext(current));
    }

    @Test
    public void case79() {
        String current = "00111111111111111111111111111111111111111111111";
        assertEquals("01010101010101010101010101010101010101010101011", specialstrings.findNext(current));
    }

    @Test
    public void case80() {
        String current = "011011110111101111111111111111111111111111111111";
        assertEquals("011011110111110110111101111101101111011111011111", specialstrings.findNext(current));
    }

    @Test
    public void case81() {
        String current = "0110111101111011111111111111111111111111111111111";
        assertEquals("0110111101111101101111011111011011110111110111111", specialstrings.findNext(current));
    }

    @Test
    public void case82() {
        String current = "01111111111111111111111111111111111111111";
        assertEquals("", specialstrings.findNext(current));
    }

    @Test
    public void case83() {
        String current = "01101111";
        assertEquals("01111111", specialstrings.findNext(current));
    }

    @Test
    public void case84() {
        String current = "0011111111111111111111111111111111111111111111111";
        assertEquals("0101010101010101010101010101010101010101010101011", specialstrings.findNext(current));
    }

    @Test
    public void case85() {
        String current = "00010011011111";
        assertEquals("00010011100011", specialstrings.findNext(current));
    }

    @Test
    public void case86() {
        String current = "0011011111";
        assertEquals("0011101011", specialstrings.findNext(current));
    }

    @Test
    public void case87() {
        String current = "0000000000000000001100111";
        assertEquals("0000000000000000001101001", specialstrings.findNext(current));
    }

    @Test
    public void case88() {
        String current = "0000001000000100000010000001000000100000010000011";
        assertEquals("0000001000000100000010000001000000100000010000101", specialstrings.findNext(current));
    }

    @Test
    public void case89() {
        String current = "00000000000000000000000000000000000000000000000001";
        assertEquals("00000000000000000000000000000000000000000000000011", specialstrings.findNext(current));
    }

    @Test
    public void case90() {
        String current = "010111111111111111111111111111111111111111111111";
        assertEquals("011011011011011011011011011011011011011011011111", specialstrings.findNext(current));
    }

    @Test
    public void case91() {
        String current = "00000000000000000000000000000000001";
        assertEquals("00000000000000000000000000000000011", specialstrings.findNext(current));
    }

    @Test
    public void case92() {
        String current = "01011111111111111111111111111111111111111111111111";
        assertEquals("01101101101101101101101101101101101101101101101111", specialstrings.findNext(current));
    }

    @Test
    public void case93() {
        String current = "001100111111";
        assertEquals("001101001111", specialstrings.findNext(current));
    }

    @Test
    public void case94() {
        String current = "0001111111111111111111111111111111111111111111111";
        assertEquals("0010010010010010010010010010010010010010010010011", specialstrings.findNext(current));
    }

    @Test
    public void case95() {
        String current = "00000001111";
        assertEquals("00000010001", specialstrings.findNext(current));
    }

    @Test
    public void case96() {
        String current = "0000011111111";
        assertEquals("0000100001001", specialstrings.findNext(current));
    }

    @Test
    public void case97() {
        String current = "000110111";
        assertEquals("000111001", specialstrings.findNext(current));
    }

    @Test
    public void case98() {
        String current = "0000000010000000011111111111111111111111111111111";
        assertEquals("0000000010000000100000000100000001000000001000001", specialstrings.findNext(current));
    }

}
