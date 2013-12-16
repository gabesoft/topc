package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class TheBlackJackDivOneTest {
    double DELTA = 1.0e-09;
    TheBlackJackDivOne theblackjackdivone = new TheBlackJackDivOne();

    @Test
    public void case1() {
        String[] cards = { "JS" };
        assertEquals(2.105854341736695, theblackjackdivone.expected(cards), DELTA * 2.105854341736695);
    }

    @Test
    public void case2() {
        String[] cards = { "KD", "8S" };
        assertEquals(1.08, theblackjackdivone.expected(cards), DELTA * 1.08);
    }

    @Test
    public void case3() {
        String[] cards = { "KD", "2S", "2C", "2D", "2H" };
        assertEquals(1.0, theblackjackdivone.expected(cards), DELTA * 1.0);
    }

    @Test
    public void case4() {
        String[] cards = { "AS", "KS", "9S", "JC", "2D" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case5() {
        String[] cards = { "QD", "9C", "KC", "4S", "8S" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case6() {
        String[] cards = { "5H", "8D", "4S", "JS", "2H" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case7() {
        String[] cards = { "5S", "2S", "AD", "TS", "7S" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case8() {
        String[] cards = { "7S", "JS" };
        assertEquals(1.16, theblackjackdivone.expected(cards), DELTA * 1.16);
    }

    @Test
    public void case9() {
        String[] cards = { "QS", "4C", "8S" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case10() {
        String[] cards = { "2D", "7S" };
        assertEquals(2.2131458966565347, theblackjackdivone.expected(cards), DELTA * 2.2131458966565347);
    }

    @Test
    public void case11() {
        String[] cards = { "7D" };
        assertEquals(2.4521936434148124, theblackjackdivone.expected(cards), DELTA * 2.4521936434148124);
    }

    @Test
    public void case12() {
        String[] cards = { "7S" };
        assertEquals(2.4521936434148124, theblackjackdivone.expected(cards), DELTA * 2.4521936434148124);
    }

    @Test
    public void case13() {
        String[] cards = { "2D", "TH" };
        assertEquals(1.6197448979591837, theblackjackdivone.expected(cards), DELTA * 1.6197448979591837);
    }

    @Test
    public void case14() {
        String[] cards = { "7S", "6S" };
        assertEquals(1.5034693877551022, theblackjackdivone.expected(cards), DELTA * 1.5034693877551022);
    }

    @Test
    public void case15() {
        String[] cards = { "4D" };
        assertEquals(2.785899673467907, theblackjackdivone.expected(cards), DELTA * 2.785899673467907);
    }

    @Test
    public void case16() {
        String[] cards = { "2S" };
        assertEquals(3.0307141148164476, theblackjackdivone.expected(cards), DELTA * 3.0307141148164476);
    }

    @Test
    public void case17() {
        String[] cards = { "2S" };
        assertEquals(3.0307141148164476, theblackjackdivone.expected(cards), DELTA * 3.0307141148164476);
    }

    @Test
    public void case18() {
        String[] cards = { "2D" };
        assertEquals(3.0307141148164476, theblackjackdivone.expected(cards), DELTA * 3.0307141148164476);
    }

    @Test
    public void case19() {
        String[] cards = { "KH" };
        assertEquals(2.105854341736695, theblackjackdivone.expected(cards), DELTA * 2.105854341736695);
    }

    @Test
    public void case20() {
        String[] cards = { "3D" };
        assertEquals(2.9085951580755647, theblackjackdivone.expected(cards), DELTA * 2.9085951580755647);
    }

    @Test
    public void case21() {
        String[] cards = { "8S" };
        assertEquals(2.3413101410777077, theblackjackdivone.expected(cards), DELTA * 2.3413101410777077);
    }

    @Test
    public void case22() {
        String[] cards = { "5S" };
        assertEquals(2.6697214871147352, theblackjackdivone.expected(cards), DELTA * 2.6697214871147352);
    }

    @Test
    public void case23() {
        String[] cards = { "KC" };
        assertEquals(2.105854341736695, theblackjackdivone.expected(cards), DELTA * 2.105854341736695);
    }

    @Test
    public void case24() {
        String[] cards = { "3S" };
        assertEquals(2.9085951580755647, theblackjackdivone.expected(cards), DELTA * 2.9085951580755647);
    }

    @Test
    public void case25() {
        String[] cards = { "7C" };
        assertEquals(2.4521936434148124, theblackjackdivone.expected(cards), DELTA * 2.4521936434148124);
    }

    @Test
    public void case26() {
        String[] cards = { "2H" };
        assertEquals(3.0307141148164476, theblackjackdivone.expected(cards), DELTA * 3.0307141148164476);
    }

    @Test
    public void case27() {
        String[] cards = { "AS", "2S" };
        assertEquals(1.5104591836734693, theblackjackdivone.expected(cards), DELTA * 1.5104591836734693);
    }

    @Test
    public void case28() {
        String[] cards = { "2D" };
        assertEquals(3.0307141148164476, theblackjackdivone.expected(cards), DELTA * 3.0307141148164476);
    }

    @Test
    public void case29() {
        String[] cards = { "7C" };
        assertEquals(2.4521936434148124, theblackjackdivone.expected(cards), DELTA * 2.4521936434148124);
    }

    @Test
    public void case30() {
        String[] cards = { "TS" };
        assertEquals(2.105854341736695, theblackjackdivone.expected(cards), DELTA * 2.105854341736695);
    }

    @Test
    public void case31() {
        String[] cards = { "AD", "9H", "5S", "6D", "AC", "9C", "TS", "2H", "5D", "4S", "TC", "JD", "JC", "6S", "9S", "6H", "QS", "TH", "2S", "KD", "2C", "JH", "4C", "7D", "2D", "7C", "QD", "8C", "3D", "AS", "AH", "4D", "8S", "3H", "8D", "9D", "KC", "TD", "KH", "JS", "KS", "7S", "QH", "8H", "4H", "3S" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case32() {
        String[] cards = { "JC", "TH", "8H", "3H", "9S", "7H", "2S", "3C", "2H", "TC", "JH", "JD", "9C", "2D", "TD", "9D", "AD", "8D", "8S", "6S", "6C", "4H", "3S", "7C", "AH", "QH", "KC", "4S", "7S", "4D", "5S", "TS", "KD", "2C", "3D", "5D", "AS", "JS", "KS", "5C", "QD", "4C", "QS", "6D" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case33() {
        String[] cards = { "2S", "5H", "JD", "3D", "7H", "5C", "QS", "5D", "3H", "8C", "9S", "QC", "AC", "AH", "6H", "7C", "TD", "9D", "5S", "6D", "TH", "TS", "7D", "JC", "2H", "4H", "4S", "AS", "JH", "9H", "8D", "JS", "6S", "KD", "KS", "3S", "2C", "KH", "AD", "7S", "KC", "4D", "2D", "8S", "QD" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case34() {
        String[] cards = { "JH", "QD", "AC", "3C", "KH", "AS", "KC", "4S", "QH", "8S", "AH", "6D", "2D", "7H", "9H", "4D", "TS", "KS", "3H", "5S", "QS", "6H", "2C", "6S", "JS", "JC", "2S", "3S", "9D", "AD", "4C", "QC", "TC", "KD", "3D", "8C", "TH", "7S", "7C", "4H", "9S", "6C", "7D", "JD", "8H", "2H", "8D", "TD", "5D", "9C" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case35() {
        String[] cards = { "KD", "9D", "TC", "2D", "QD", "7D", "AD", "3C", "JC", "JS", "5C", "3H", "9C", "AS", "TH", "AH", "5S", "4D", "2C", "QC", "8D", "6S", "2H", "JH", "QS", "3D", "4C", "QH", "7C", "4H", "6D", "9S", "5D", "KC", "6H", "TS", "2S", "KS", "8S", "5H", "AC", "6C", "8H", "JD", "4S", "8C", "7S", "9H", "TD", "3S" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case36() {
        String[] cards = { "8C", "4D", "KD", "TD", "9C", "TS", "AC", "5S", "4H", "AD", "TC", "AS", "9S", "3C", "4C", "QS", "8H", "QH", "KH", "5C", "JD", "3S", "3D", "6C", "7C", "KS", "6D", "9H", "6H", "9D", "JS", "AH", "TH", "4S", "QC", "3H", "JC", "7S", "6S", "KC", "QD", "5H", "5D", "8D", "8S", "7D", "2C", "JH", "2H", "7H" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case37() {
        String[] cards = { "2C", "4D", "JC", "KS", "8S", "TS", "2D", "5S", "3S", "AD", "4H", "TC", "9S", "3C", "8C", "QS", "JH", "9H", "9D", "5C", "JD", "KC", "3D", "6C", "7C", "AS", "6D", "8H", "4C", "2S", "JS", "7D", "TH", "9C", "QC", "6H", "TD", "7S", "6S", "4S", "KH", "5H", "QH", "8D", "QD", "5D", "KD", "3H", "2H", "7H" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case38() {
        String[] cards = { "2D", "2H", "2S", "2C" };
        assertEquals(2.2012077294685994, theblackjackdivone.expected(cards), DELTA * 2.2012077294685994);
    }

    @Test
    public void case39() {
        String[] cards = { "2S", "3H", "4S", "5D" };
        assertEquals(1.3546677459142769, theblackjackdivone.expected(cards), DELTA * 1.3546677459142769);
    }

    @Test
    public void case40() {
        String[] cards = { "2C", "5S", "4D", "3S" };
        assertEquals(1.3546677459142769, theblackjackdivone.expected(cards), DELTA * 1.3546677459142769);
    }

    @Test
    public void case41() {
        String[] cards = { "2D", "4S", "2S", "5D" };
        assertEquals(1.451472402096824, theblackjackdivone.expected(cards), DELTA * 1.451472402096824);
    }

    @Test
    public void case42() {
        String[] cards = { "2S", "5S", "4C", "2D" };
        assertEquals(1.451472402096824, theblackjackdivone.expected(cards), DELTA * 1.451472402096824);
    }

    @Test
    public void case43() {
        String[] cards = { "4C", "3S", "4D", "2S" };
        assertEquals(1.4518193031144002, theblackjackdivone.expected(cards), DELTA * 1.4518193031144002);
    }

    @Test
    public void case44() {
        String[] cards = { "2S", "2D", "3C", "2C", "3H", "2H", "3D", "3S" };
        assertEquals(1.0, theblackjackdivone.expected(cards), DELTA * 1.0);
    }

    @Test
    public void case45() {
        String[] cards = { "2C", "3D", "2S", "3H", "3S", "2H", "2D" };
        assertEquals(1.0222222222222221, theblackjackdivone.expected(cards), DELTA * 1.0222222222222221);
    }

    @Test
    public void case46() {
        String[] cards = { "3D", "2C", "2S", "3H", "3S", "3C", "2D" };
        assertEquals(1.0222222222222221, theblackjackdivone.expected(cards), DELTA * 1.0222222222222221);
    }

    @Test
    public void case47() {
        String[] cards = { "4D", "4H", "4S", "4C" };
        assertEquals(1.1719858156028369, theblackjackdivone.expected(cards), DELTA * 1.1719858156028369);
    }

    @Test
    public void case48() {
        String[] cards = { "JS" };
        assertEquals(2.105854341736695, theblackjackdivone.expected(cards), DELTA * 2.105854341736695);
    }

    @Test
    public void case49() {
        String[] cards = { "2H" };
        assertEquals(3.0307141148164476, theblackjackdivone.expected(cards), DELTA * 3.0307141148164476);
    }

    @Test
    public void case50() {
        String[] cards = { "JS", "JC", "JD" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case51() {
        String[] cards = { "3S", "3C", "2D", "6H" };
        assertEquals(1.3528946962688868, theblackjackdivone.expected(cards), DELTA * 1.3528946962688868);
    }

    @Test
    public void case52() {
        String[] cards = { "KS", "TD", "8S", "9H", "9D" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case53() {
        String[] cards = { "AS" };
        assertEquals(1.7626450580232094, theblackjackdivone.expected(cards), DELTA * 1.7626450580232094);
    }

    @Test
    public void case54() {
        String[] cards = { "2S", "2C", "2D", "3H", "3D" };
        assertEquals(1.5236509404872032, theblackjackdivone.expected(cards), DELTA * 1.5236509404872032);
    }

    @Test
    public void case55() {
        String[] cards = { "2S" };
        assertEquals(3.0307141148164476, theblackjackdivone.expected(cards), DELTA * 3.0307141148164476);
    }

    @Test
    public void case56() {
        String[] cards = { "2S", "3D" };
        assertEquals(2.6204427747047014, theblackjackdivone.expected(cards), DELTA * 2.6204427747047014);
    }

    @Test
    public void case57() {
        String[] cards = { "2D" };
        assertEquals(3.0307141148164476, theblackjackdivone.expected(cards), DELTA * 3.0307141148164476);
    }

    @Test
    public void case58() {
        String[] cards = { "AS", "2S" };
        assertEquals(1.5104591836734693, theblackjackdivone.expected(cards), DELTA * 1.5104591836734693);
    }

    @Test
    public void case59() {
        String[] cards = { "TS" };
        assertEquals(2.105854341736695, theblackjackdivone.expected(cards), DELTA * 2.105854341736695);
    }

    @Test
    public void case60() {
        String[] cards = { "QH" };
        assertEquals(2.105854341736695, theblackjackdivone.expected(cards), DELTA * 2.105854341736695);
    }

    @Test
    public void case61() {
        String[] cards = { "AS", "KS", "9S", "JC", "2D" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case62() {
        String[] cards = { "9S" };
        assertEquals(2.2414622870424763, theblackjackdivone.expected(cards), DELTA * 2.2414622870424763);
    }

    @Test
    public void case63() {
        String[] cards = { "AS", "AD" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case64() {
        String[] cards = { "AS", "9H" };
        assertEquals(1.0, theblackjackdivone.expected(cards), DELTA * 1.0);
    }

    @Test
    public void case65() {
        String[] cards = { "TD", "AD", "2S" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case66() {
        String[] cards = { "AS", "TS" };
        assertEquals(0.0, theblackjackdivone.expected(cards), DELTA);
    }

    @Test
    public void case67() {
        String[] cards = { "2S", "2C", "3D" };
        assertEquals(2.3517408505184374, theblackjackdivone.expected(cards), DELTA * 2.3517408505184374);
    }

}
