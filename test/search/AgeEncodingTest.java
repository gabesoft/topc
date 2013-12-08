package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class AgeEncodingTest {
    double DELTA = 1.0e-09;
    AgeEncoding ageencoding = new AgeEncoding();

    @Test
    public void case1() {
        int age = 1;
        String candlesLine = "0000000001";
        assertEquals(-2.0, ageencoding.getRadix(age, candlesLine), DELTA * -2.0);
    }

    @Test
    public void case2() {
        int age = 10;
        String candlesLine = "00010";
        assertEquals(10.0, ageencoding.getRadix(age, candlesLine), DELTA * 10.0);
    }

    @Test
    public void case3() {
        int age = 21;
        String candlesLine = "10101";
        assertEquals(2.0, ageencoding.getRadix(age, candlesLine), DELTA * 2.0);
    }

    @Test
    public void case4() {
        int age = 6;
        String candlesLine = "10100";
        assertEquals(1.414213562373095, ageencoding.getRadix(age, candlesLine), DELTA * 1.414213562373095);
    }

    @Test
    public void case5() {
        int age = 21;
        String candlesLine = "10111111110111101111111100111111110111111111111100";
        assertEquals(0.9685012944510603, ageencoding.getRadix(age, candlesLine), DELTA * 0.9685012944510603);
    }

    @Test
    public void case6() {
        int age = 16;
        String candlesLine = "1";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case7() {
        int age = 100;
        String candlesLine = "00000000000000000000000000000000000000000000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case8() {
        int age = 2;
        String candlesLine = "00000000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case9() {
        int age = 67;
        String candlesLine = "000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case10() {
        int age = 45;
        String candlesLine = "0000000000000000000000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case11() {
        int age = 12;
        String candlesLine = "000000000000000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case12() {
        int age = 1;
        String candlesLine = "0";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case13() {
        int age = 89;
        String candlesLine = "0000000000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case14() {
        int age = 30;
        String candlesLine = "00000000000000000000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case15() {
        int age = 92;
        String candlesLine = "00000000000000000000000000000000000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case16() {
        int age = 1;
        String candlesLine = "11";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case17() {
        int age = 1;
        String candlesLine = "00000101010111100101";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case18() {
        int age = 1;
        String candlesLine = "1000000000000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case19() {
        int age = 1;
        String candlesLine = "00000000000000000000000011";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case20() {
        int age = 1;
        String candlesLine = "11111111111111111111111111111111111111111111111111";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case21() {
        int age = 2;
        String candlesLine = "11111111111111111111111111111111111111111111111111";
        assertEquals(0.5000000000000004, ageencoding.getRadix(age, candlesLine), DELTA * 0.5000000000000004);
    }

    @Test
    public void case22() {
        int age = 9;
        String candlesLine = "11010100000110110011010011110000001010001100";
        assertEquals(0.9644794251470961, ageencoding.getRadix(age, candlesLine), DELTA * 0.9644794251470961);
    }

    @Test
    public void case23() {
        int age = 5;
        String candlesLine = "0010111100011100100011100111110010100100000";
        assertEquals(0.9309717675171341, ageencoding.getRadix(age, candlesLine), DELTA * 0.9309717675171341);
    }

    @Test
    public void case24() {
        int age = 16;
        String candlesLine = "101100101001010001000100001100010100101010011";
        assertEquals(0.9944695714404173, ageencoding.getRadix(age, candlesLine), DELTA * 0.9944695714404173);
    }

    @Test
    public void case25() {
        int age = 18;
        String candlesLine = "1111111111111111111111001110111110101011010";
        assertEquals(0.9693534692411785, ageencoding.getRadix(age, candlesLine), DELTA * 0.9693534692411785);
    }

    @Test
    public void case26() {
        int age = 8;
        String candlesLine = "11011011000101100100001110110011011110";
        assertEquals(0.9311630570557434, ageencoding.getRadix(age, candlesLine), DELTA * 0.9311630570557434);
    }

    @Test
    public void case27() {
        int age = 9;
        String candlesLine = "10110100100000000000001111000010111101001100100";
        assertEquals(0.9627071967682421, ageencoding.getRadix(age, candlesLine), DELTA * 0.9627071967682421);
    }

    @Test
    public void case28() {
        int age = 22;
        String candlesLine = "1111110110111001110001111110000011011111";
        assertEquals(0.9895933446048641, ageencoding.getRadix(age, candlesLine), DELTA * 0.9895933446048641);
    }

    @Test
    public void case29() {
        int age = 23;
        String candlesLine = "0010111110011000110000110001001110111111011";
        assertEquals(0.9977234441488432, ageencoding.getRadix(age, candlesLine), DELTA * 0.9977234441488432);
    }

    @Test
    public void case30() {
        int age = 2;
        String candlesLine = "1110111101100011000001111100001011010111111111";
        assertEquals(0.5006397696081122, ageencoding.getRadix(age, candlesLine), DELTA * 0.5006397696081122);
    }

    @Test
    public void case31() {
        int age = 2;
        String candlesLine = "1110";
        assertEquals(0.8105357137661366, ageencoding.getRadix(age, candlesLine), DELTA * 0.8105357137661366);
    }

    @Test
    public void case32() {
        int age = 13;
        String candlesLine = "000100101100100001010000100010011000101011110101";
        assertEquals(0.9784654171063285, ageencoding.getRadix(age, candlesLine), DELTA * 0.9784654171063285);
    }

    @Test
    public void case33() {
        int age = 12;
        String candlesLine = "10101000100110100100001111101";
        assertEquals(0.9872784768442795, ageencoding.getRadix(age, candlesLine), DELTA * 0.9872784768442795);
    }

    @Test
    public void case34() {
        int age = 5;
        String candlesLine = "00101100000011010000111100101100011111111";
        assertEquals(0.8290109440147917, ageencoding.getRadix(age, candlesLine), DELTA * 0.8290109440147917);
    }

    @Test
    public void case35() {
        int age = 10;
        String candlesLine = "011100111001110010111110101110100100011011";
        assertEquals(0.9477260512129781, ageencoding.getRadix(age, candlesLine), DELTA * 0.9477260512129781);
    }

    @Test
    public void case36() {
        int age = 2;
        String candlesLine = "10000000000000000000000000000000000001";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case37() {
        int age = 50;
        String candlesLine = "11111111111111111111111111111111111111111111111111";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case38() {
        int age = 36;
        String candlesLine = "11011110111011101111011001110101011100001111111111";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case39() {
        int age = 10;
        String candlesLine = "00111111000111100";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case40() {
        int age = 3;
        String candlesLine = "10000000000000100000000000000010000000000";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case41() {
        int age = 18;
        String candlesLine = "111111111111111111";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case42() {
        int age = 4;
        String candlesLine = "10101010";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case43() {
        int age = 47;
        String candlesLine = "00011111111111111111111111111111111111111111111111";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case44() {
        int age = 25;
        String candlesLine = "01010101010101010101010101010101010101010101010101";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case45() {
        int age = 6;
        String candlesLine = "00001000000000000011000000010000001000000000010000";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case46() {
        int age = 100;
        String candlesLine = "10";
        assertEquals(100.0, ageencoding.getRadix(age, candlesLine), DELTA * 100.0);
    }

    @Test
    public void case47() {
        int age = 51;
        String candlesLine = "01000011101101111";
        assertEquals(1.2236414744554485, ageencoding.getRadix(age, candlesLine), DELTA * 1.2236414744554485);
    }

    @Test
    public void case48() {
        int age = 60;
        String candlesLine = "100100001000011000000011";
        assertEquals(1.1509288756564846, ageencoding.getRadix(age, candlesLine), DELTA * 1.1509288756564846);
    }

    @Test
    public void case49() {
        int age = 54;
        String candlesLine = "001111101110001111111100000101000010011011001000";
        assertEquals(1.028016867065817, ageencoding.getRadix(age, candlesLine), DELTA * 1.028016867065817);
    }

    @Test
    public void case50() {
        int age = 23;
        String candlesLine = "00100111001";
        assertEquals(1.3571025593119632, ageencoding.getRadix(age, candlesLine), DELTA * 1.3571025593119632);
    }

    @Test
    public void case51() {
        int age = 29;
        String candlesLine = "010";
        assertEquals(29.0, ageencoding.getRadix(age, candlesLine), DELTA * 29.0);
    }

    @Test
    public void case52() {
        int age = 100;
        String candlesLine = "111";
        assertEquals(9.462429422585636, ageencoding.getRadix(age, candlesLine), DELTA * 9.462429422585636);
    }

    @Test
    public void case53() {
        int age = 34;
        String candlesLine = "1110";
        assertEquals(2.846080416586016, ageencoding.getRadix(age, candlesLine), DELTA * 2.846080416586016);
    }

    @Test
    public void case54() {
        int age = 43;
        String candlesLine = "000001100";
        assertEquals(3.1997844694936415, ageencoding.getRadix(age, candlesLine), DELTA * 3.1997844694936415);
    }

    @Test
    public void case55() {
        int age = 28;
        String candlesLine = "0110";
        assertEquals(4.815072906367325, ageencoding.getRadix(age, candlesLine), DELTA * 4.815072906367325);
    }

    @Test
    public void case56() {
        int age = 46;
        String candlesLine = "00101001";
        assertEquals(2.05177896477014, ageencoding.getRadix(age, candlesLine), DELTA * 2.05177896477014);
    }

    @Test
    public void case57() {
        int age = 86;
        String candlesLine = "0111001";
        assertEquals(2.196489503489521, ageencoding.getRadix(age, candlesLine), DELTA * 2.196489503489521);
    }

    @Test
    public void case58() {
        int age = 97;
        String candlesLine = "100";
        assertEquals(9.848857801796104, ageencoding.getRadix(age, candlesLine), DELTA * 9.848857801796104);
    }

    @Test
    public void case59() {
        int age = 32;
        String candlesLine = "01100";
        assertEquals(2.8740406307399775, ageencoding.getRadix(age, candlesLine), DELTA * 2.8740406307399775);
    }

    @Test
    public void case60() {
        int age = 94;
        String candlesLine = "00000011100";
        assertEquals(2.823192803157676, ageencoding.getRadix(age, candlesLine), DELTA * 2.823192803157676);
    }

    @Test
    public void case61() {
        int age = 42;
        String candlesLine = "0101010";
        assertEquals(2.0, ageencoding.getRadix(age, candlesLine), DELTA * 2.0);
    }

    @Test
    public void case62() {
        int age = 40;
        String candlesLine = "00001111";
        assertEquals(3.0, ageencoding.getRadix(age, candlesLine), DELTA * 3.0);
    }

    @Test
    public void case63() {
        int age = 100;
        String candlesLine = "11";
        assertEquals(99.0, ageencoding.getRadix(age, candlesLine), DELTA * 99.0);
    }

    @Test
    public void case64() {
        int age = 31;
        String candlesLine = "000111";
        assertEquals(5.0, ageencoding.getRadix(age, candlesLine), DELTA * 5.0);
    }

    @Test
    public void case65() {
        int age = 82;
        String candlesLine = "10001";
        assertEquals(3.0, ageencoding.getRadix(age, candlesLine), DELTA * 3.0);
    }

    @Test
    public void case66() {
        int age = 1;
        String candlesLine = "1";
        assertEquals(-2.0, ageencoding.getRadix(age, candlesLine), DELTA * -2.0);
    }

    @Test
    public void case67() {
        int age = 1;
        String candlesLine = "001000";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case68() {
        int age = 1;
        String candlesLine = "0100101000100001100110000110000010011011000001100";
        assertEquals(0.7156223647008804, ageencoding.getRadix(age, candlesLine), DELTA * 0.7156223647008804);
    }

    @Test
    public void case69() {
        int age = 1;
        String candlesLine = "1001011101111110";
        assertEquals(0.5021889649688411, ageencoding.getRadix(age, candlesLine), DELTA * 0.5021889649688411);
    }

    @Test
    public void case70() {
        int age = 1;
        String candlesLine = "01";
        assertEquals(-2.0, ageencoding.getRadix(age, candlesLine), DELTA * -2.0);
    }

    @Test
    public void case71() {
        int age = 12;
        String candlesLine = "000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case72() {
        int age = 99;
        String candlesLine = "0001010";
        assertEquals(4.55401544737385, ageencoding.getRadix(age, candlesLine), DELTA * 4.55401544737385);
    }

    @Test
    public void case73() {
        int age = 1;
        String candlesLine = "1000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case74() {
        int age = 1;
        String candlesLine = "00001";
        assertEquals(-2.0, ageencoding.getRadix(age, candlesLine), DELTA * -2.0);
    }

    @Test
    public void case75() {
        int age = 1;
        String candlesLine = "111";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case76() {
        int age = 1;
        String candlesLine = "10000000000000000000000000000000000000";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case77() {
        int age = 1;
        String candlesLine = "001";
        assertEquals(-2.0, ageencoding.getRadix(age, candlesLine), DELTA * -2.0);
    }

    @Test
    public void case78() {
        int age = 40;
        String candlesLine = "0001010101";
        assertEquals(1.7320508075688772, ageencoding.getRadix(age, candlesLine), DELTA * 1.7320508075688772);
    }

    @Test
    public void case79() {
        int age = 1;
        String candlesLine = "001001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case80() {
        int age = 1;
        String candlesLine = "000000001";
        assertEquals(-2.0, ageencoding.getRadix(age, candlesLine), DELTA * -2.0);
    }

    @Test
    public void case81() {
        int age = 1;
        String candlesLine = "10001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case82() {
        int age = 1;
        String candlesLine = "00000000001";
        assertEquals(-2.0, ageencoding.getRadix(age, candlesLine), DELTA * -2.0);
    }

    @Test
    public void case83() {
        int age = 79;
        String candlesLine = "10011110000000000000000";
        assertEquals(1.158750849464906, ageencoding.getRadix(age, candlesLine), DELTA * 1.158750849464906);
    }

    @Test
    public void case84() {
        int age = 1;
        String candlesLine = "0001";
        assertEquals(-2.0, ageencoding.getRadix(age, candlesLine), DELTA * -2.0);
    }

    @Test
    public void case85() {
        int age = 1;
        String candlesLine = "000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case86() {
        int age = 17;
        String candlesLine = "000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case87() {
        int age = 1;
        String candlesLine = "0101";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case88() {
        int age = 1;
        String candlesLine = "101";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case89() {
        int age = 22;
        String candlesLine = "000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case90() {
        int age = 1;
        String candlesLine = "01000000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case91() {
        int age = 12;
        String candlesLine = "1001000";
        assertEquals(1.4422495703074083, ageencoding.getRadix(age, candlesLine), DELTA * 1.4422495703074083);
    }

    @Test
    public void case92() {
        int age = 1;
        String candlesLine = "1000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case93() {
        int age = 100;
        String candlesLine = "00000000000000000000000000000000000000000000000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case94() {
        int age = 1;
        String candlesLine = "10000000000000000000000000000000000000000000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case95() {
        int age = 1;
        String candlesLine = "00000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case96() {
        int age = 1;
        String candlesLine = "0000001";
        assertEquals(-2.0, ageencoding.getRadix(age, candlesLine), DELTA * -2.0);
    }

    @Test
    public void case97() {
        int age = 1;
        String candlesLine = "000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case98() {
        int age = 100;
        String candlesLine = "00";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case99() {
        int age = 2;
        String candlesLine = "0000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case100() {
        int age = 1;
        String candlesLine = "10000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case101() {
        int age = 1;
        String candlesLine = "00000000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case102() {
        int age = 1;
        String candlesLine = "1000000000000000000000000000000000000000000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case103() {
        int age = 2;
        String candlesLine = "0000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case104() {
        int age = 76;
        String candlesLine = "0000000000000101010000010101000000000010";
        assertEquals(1.1303025599812826, ageencoding.getRadix(age, candlesLine), DELTA * 1.1303025599812826);
    }

    @Test
    public void case105() {
        int age = 1;
        String candlesLine = "1111111111111";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case106() {
        int age = 12;
        String candlesLine = "0";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case107() {
        int age = 2;
        String candlesLine = "00000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case108() {
        int age = 1;
        String candlesLine = "00";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case109() {
        int age = 1;
        String candlesLine = "1111";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case110() {
        int age = 1;
        String candlesLine = "10111";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case111() {
        int age = 13;
        String candlesLine = "0000000000000000000000000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case112() {
        int age = 1;
        String candlesLine = "00000000000000000000000000000000000000000000000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case113() {
        int age = 1;
        String candlesLine = "1110";
        assertEquals(0.5436890126920764, ageencoding.getRadix(age, candlesLine), DELTA * 0.5436890126920764);
    }

    @Test
    public void case114() {
        int age = 1;
        String candlesLine = "0000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case115() {
        int age = 1;
        String candlesLine = "000001";
        assertEquals(-2.0, ageencoding.getRadix(age, candlesLine), DELTA * -2.0);
    }

    @Test
    public void case116() {
        int age = 2;
        String candlesLine = "0000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case117() {
        int age = 10;
        String candlesLine = "00000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case118() {
        int age = 1;
        String candlesLine = "00000000011";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case119() {
        int age = 15;
        String candlesLine = "0000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case120() {
        int age = 1;
        String candlesLine = "000000000001";
        assertEquals(-2.0, ageencoding.getRadix(age, candlesLine), DELTA * -2.0);
    }

    @Test
    public void case121() {
        int age = 1;
        String candlesLine = "1000000000000000000000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case122() {
        int age = 1;
        String candlesLine = "000010000000000000000000000000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case123() {
        int age = 1;
        String candlesLine = "01001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case124() {
        int age = 1;
        String candlesLine = "00101";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case125() {
        int age = 100;
        String candlesLine = "10010111100011111111111000011111111100001111111000";
        assertEquals(1.039931700589173, ageencoding.getRadix(age, candlesLine), DELTA * 1.039931700589173);
    }

    @Test
    public void case126() {
        int age = 97;
        String candlesLine = "10111111110111101111111100111111101111111111111001";
        assertEquals(1.0307240644576114, ageencoding.getRadix(age, candlesLine), DELTA * 1.0307240644576114);
    }

    @Test
    public void case127() {
        int age = 99;
        String candlesLine = "1011111111011110111111110011111111011111111111110";
        assertEquals(1.0324432710335931, ageencoding.getRadix(age, candlesLine), DELTA * 1.0324432710335931);
    }

    @Test
    public void case128() {
        int age = 1;
        String candlesLine = "110";
        assertEquals(0.6180339887498949, ageencoding.getRadix(age, candlesLine), DELTA * 0.6180339887498949);
    }

    @Test
    public void case129() {
        int age = 99;
        String candlesLine = "0000000000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case130() {
        int age = 37;
        String candlesLine = "11111111111111111111111111111111111111111111111111";
        assertEquals(0.9870777697927564, ageencoding.getRadix(age, candlesLine), DELTA * 0.9870777697927564);
    }

    @Test
    public void case131() {
        int age = 10;
        String candlesLine = "0";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case132() {
        int age = 1;
        String candlesLine = "101101101";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case133() {
        int age = 11;
        String candlesLine = "000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case134() {
        int age = 12;
        String candlesLine = "00000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case135() {
        int age = 4;
        String candlesLine = "00";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case136() {
        int age = 2;
        String candlesLine = "000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case137() {
        int age = 1;
        String candlesLine = "11111111";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case138() {
        int age = 10;
        String candlesLine = "000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case139() {
        int age = 1;
        String candlesLine = "1110111101111111100111111110111111111111101101011";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case140() {
        int age = 1;
        String candlesLine = "00100010";
        assertEquals(0.7548776662466927, ageencoding.getRadix(age, candlesLine), DELTA * 0.7548776662466927);
    }

    @Test
    public void case141() {
        int age = 1;
        String candlesLine = "10000000000000000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case142() {
        int age = 1;
        String candlesLine = "011";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case143() {
        int age = 42;
        String candlesLine = "00000000000000000000000000000000000000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case144() {
        int age = 1;
        String candlesLine = "10";
        assertEquals(1.0, ageencoding.getRadix(age, candlesLine), DELTA * 1.0);
    }

    @Test
    public void case145() {
        int age = 5;
        String candlesLine = "00000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case146() {
        int age = 26;
        String candlesLine = "111111111111111111111111111111111111111111111111";
        assertEquals(0.9708225675355608, ageencoding.getRadix(age, candlesLine), DELTA * 0.9708225675355608);
    }

    @Test
    public void case147() {
        int age = 12;
        String candlesLine = "000000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case148() {
        int age = 100;
        String candlesLine = "0";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case149() {
        int age = 20;
        String candlesLine = "0";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case150() {
        int age = 1;
        String candlesLine = "10000001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case151() {
        int age = 5;
        String candlesLine = "10000000000000000000000000000000000000000000000000";
        assertEquals(1.0333910454328783, ageencoding.getRadix(age, candlesLine), DELTA * 1.0333910454328783);
    }

    @Test
    public void case152() {
        int age = 1;
        String candlesLine = "1001";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case153() {
        int age = 2;
        String candlesLine = "00";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

    @Test
    public void case154() {
        int age = 10;
        String candlesLine = "0000";
        assertEquals(-1.0, ageencoding.getRadix(age, candlesLine), DELTA * -1.0);
    }

}
