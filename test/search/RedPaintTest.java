package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class RedPaintTest {
    double DELTA = 1.0e-09;
    RedPaint redpaint = new RedPaint();

    @Test
    public void case1() {
        int N = 0;
        assertEquals(1.0, redpaint.expectedCells(N), DELTA * 1.0);
    }

    @Test
    public void case2() {
        int N = 1;
        assertEquals(2.0, redpaint.expectedCells(N), DELTA * 2.0);
    }

    @Test
    public void case3() {
        int N = 2;
        assertEquals(2.5, redpaint.expectedCells(N), DELTA * 2.5);
    }

    @Test
    public void case4() {
        int N = 4;
        assertEquals(3.375, redpaint.expectedCells(N), DELTA * 3.375);
    }

    @Test
    public void case5() {
        int N = 3;
        assertEquals(3.0, redpaint.expectedCells(N), DELTA * 3.0);
    }

    @Test
    public void case6() {
        int N = 5;
        assertEquals(3.75, redpaint.expectedCells(N), DELTA * 3.75);
    }

    @Test
    public void case7() {
        int N = 6;
        assertEquals(4.0625, redpaint.expectedCells(N), DELTA * 4.0625);
    }

    @Test
    public void case8() {
        int N = 7;
        assertEquals(4.375, redpaint.expectedCells(N), DELTA * 4.375);
    }

    @Test
    public void case9() {
        int N = 500;
        assertEquals(35.70031019890119, redpaint.expectedCells(N), DELTA * 35.70031019890119);
    }

    @Test
    public void case10() {
        int N = 499;
        assertEquals(35.66464555334774, redpaint.expectedCells(N), DELTA * 35.66464555334774);
    }

    @Test
    public void case11() {
        int N = 498;
        assertEquals(35.62890943555973, redpaint.expectedCells(N), DELTA * 35.62890943555973);
    }

    @Test
    public void case12() {
        int N = 456;
        assertEquals(34.094970407115, redpaint.expectedCells(N), DELTA * 34.094970407115);
    }

    @Test
    public void case13() {
        int N = 301;
        assertEquals(27.708563680258436, redpaint.expectedCells(N), DELTA * 27.708563680258436);
    }

    @Test
    public void case14() {
        int N = 77;
        assertEquals(14.04835350757413, redpaint.expectedCells(N), DELTA * 14.04835350757413);
    }

    @Test
    public void case15() {
        int N = 379;
        assertEquals(31.086808347141655, redpaint.expectedCells(N), DELTA * 31.086808347141655);
    }

    @Test
    public void case16() {
        int N = 397;
        assertEquals(31.815503120981134, redpaint.expectedCells(N), DELTA * 31.815503120981134);
    }

    @Test
    public void case17() {
        int N = 273;
        assertEquals(26.390589133251336, redpaint.expectedCells(N), DELTA * 26.390589133251336);
    }

    @Test
    public void case18() {
        int N = 485;
        assertEquals(35.16128913406542, redpaint.expectedCells(N), DELTA * 35.16128913406542);
    }

    @Test
    public void case19() {
        int N = 141;
        assertEquals(18.982334962714216, redpaint.expectedCells(N), DELTA * 18.982334962714216);
    }

    @Test
    public void case20() {
        int N = 223;
        assertEquals(23.85664479104023, redpaint.expectedCells(N), DELTA * 23.85664479104023);
    }

    @Test
    public void case21() {
        int N = 226;
        assertEquals(24.016163483000092, redpaint.expectedCells(N), DELTA * 24.016163483000092);
    }

    @Test
    public void case22() {
        int N = 40;
        assertEquals(10.15502569718592, redpaint.expectedCells(N), DELTA * 10.15502569718592);
    }

    @Test
    public void case23() {
        int N = 366;
        assertEquals(30.54969259718733, redpaint.expectedCells(N), DELTA * 30.54969259718733);
    }

    @Test
    public void case24() {
        int N = 14;
        assertEquals(6.07470703125, redpaint.expectedCells(N), DELTA * 6.07470703125);
    }

    @Test
    public void case25() {
        int N = 467;
        assertEquals(34.50332817573229, redpaint.expectedCells(N), DELTA * 34.50332817573229);
    }

    @Test
    public void case26() {
        int N = 47;
        assertEquals(10.998384260494731, redpaint.expectedCells(N), DELTA * 10.998384260494731);
    }

    @Test
    public void case27() {
        int N = 420;
        assertEquals(32.72298427933507, redpaint.expectedCells(N), DELTA * 32.72298427933507);
    }

    @Test
    public void case28() {
        int N = 357;
        assertEquals(30.172291342538323, redpaint.expectedCells(N), DELTA * 30.172291342538323);
    }

    @Test
    public void case29() {
        int N = 404;
        assertEquals(32.09439210784611, redpaint.expectedCells(N), DELTA * 32.09439210784611);
    }

    @Test
    public void case30() {
        int N = 124;
        assertEquals(17.805451132912207, redpaint.expectedCells(N), DELTA * 17.805451132912207);
    }

    @Test
    public void case31() {
        int N = 120;
        assertEquals(17.517079917337895, redpaint.expectedCells(N), DELTA * 17.517079917337895);
    }

    @Test
    public void case32() {
        int N = 227;
        assertEquals(24.069179296428636, redpaint.expectedCells(N), DELTA * 24.069179296428636);
    }

    @Test
    public void case33() {
        int N = 241;
        assertEquals(24.79871000975108, redpaint.expectedCells(N), DELTA * 24.79871000975108);
    }

    @Test
    public void case34() {
        int N = 270;
        assertEquals(26.245407540490227, redpaint.expectedCells(N), DELTA * 26.245407540490227);
    }

    @Test
    public void case35() {
        int N = 181;
        assertEquals(21.498551311248736, redpaint.expectedCells(N), DELTA * 21.498551311248736);
    }

    @Test
    public void case36() {
        int N = 295;
        assertEquals(27.43147185483054, redpaint.expectedCells(N), DELTA * 27.43147185483054);
    }

    @Test
    public void case37() {
        int N = 309;
        assertEquals(28.073765451928708, redpaint.expectedCells(N), DELTA * 28.073765451928708);
    }

    @Test
    public void case38() {
        int N = 471;
        assertEquals(34.650621434312015, redpaint.expectedCells(N), DELTA * 34.650621434312015);
    }

    @Test
    public void case39() {
        int N = 90;
        assertEquals(15.180673260956578, redpaint.expectedCells(N), DELTA * 15.180673260956578);
    }

    @Test
    public void case40() {
        int N = 265;
        assertEquals(26.001757578134757, redpaint.expectedCells(N), DELTA * 26.001757578134757);
    }

    @Test
    public void case41() {
        int N = 433;
        assertEquals(33.224981859468095, redpaint.expectedCells(N), DELTA * 33.224981859468095);
    }

    @Test
    public void case42() {
        int N = 284;
        assertEquals(26.91602091922468, redpaint.expectedCells(N), DELTA * 26.91602091922468);
    }

    @Test
    public void case43() {
        int N = 438;
        assertEquals(33.41601943423373, redpaint.expectedCells(N), DELTA * 33.41601943423373);
    }

    @Test
    public void case44() {
        int N = 235;
        assertEquals(24.488715302989895, redpaint.expectedCells(N), DELTA * 24.488715302989895);
    }

    @Test
    public void case45() {
        int N = 282;
        assertEquals(26.821245609113927, redpaint.expectedCells(N), DELTA * 26.821245609113927);
    }

    @Test
    public void case46() {
        int N = 85;
        assertEquals(14.755598421818503, redpaint.expectedCells(N), DELTA * 14.755598421818503);
    }

    @Test
    public void case47() {
        int N = 215;
        assertEquals(23.42579178681059, redpaint.expectedCells(N), DELTA * 23.42579178681059);
    }

    @Test
    public void case48() {
        int N = 19;
        assertEquals(7.047882080078125, redpaint.expectedCells(N), DELTA * 7.047882080078125);
    }

    @Test
    public void case49() {
        int N = 333;
        assertEquals(29.141923937618248, redpaint.expectedCells(N), DELTA * 29.141923937618248);
    }

    @Test
    public void case50() {
        int N = 490;
        assertEquals(35.34186390722941, redpaint.expectedCells(N), DELTA * 35.34186390722941);
    }

    @Test
    public void case51() {
        int N = 112;
        assertEquals(16.925603927123923, redpaint.expectedCells(N), DELTA * 16.925603927123923);
    }

    @Test
    public void case52() {
        int N = 398;
        assertEquals(31.85547234600768, redpaint.expectedCells(N), DELTA * 31.85547234600768);
    }

    @Test
    public void case53() {
        int N = 150;
        assertEquals(19.576592860189148, redpaint.expectedCells(N), DELTA * 19.576592860189148);
    }

    @Test
    public void case54() {
        int N = 494;
        assertEquals(35.48567691399364, redpaint.expectedCells(N), DELTA * 35.48567691399364);
    }

    @Test
    public void case55() {
        int N = 475;
        assertEquals(34.79729122306567, redpaint.expectedCells(N), DELTA * 34.79729122306567);
    }

    @Test
    public void case56() {
        int N = 258;
        assertEquals(25.65664851978682, redpaint.expectedCells(N), DELTA * 25.65664851978682);
    }

    @Test
    public void case57() {
        int N = 210;
        assertEquals(23.152372150516026, redpaint.expectedCells(N), DELTA * 23.152372150516026);
    }

    @Test
    public void case58() {
        int N = 313;
        assertEquals(28.254596261239854, redpaint.expectedCells(N), DELTA * 28.254596261239854);
    }

    @Test
    public void case59() {
        int N = 237;
        assertEquals(24.592481045798927, redpaint.expectedCells(N), DELTA * 24.592481045798927);
    }

    @Test
    public void case60() {
        int N = 290;
        assertEquals(27.198365387812444, redpaint.expectedCells(N), DELTA * 27.198365387812444);
    }

    @Test
    public void case61() {
        int N = 344;
        assertEquals(29.618594199445372, redpaint.expectedCells(N), DELTA * 29.618594199445372);
    }

    @Test
    public void case62() {
        int N = 444;
        assertEquals(33.643858862567264, redpaint.expectedCells(N), DELTA * 33.643858862567264);
    }

    @Test
    public void case63() {
        int N = 470;
        assertEquals(34.613837335124984, redpaint.expectedCells(N), DELTA * 34.613837335124984);
    }

    @Test
    public void case64() {
        int N = 15;
        assertEquals(6.2841796875, redpaint.expectedCells(N), DELTA * 6.2841796875);
    }

    @Test
    public void case65() {
        int N = 8;
        assertEquals(4.6484375, redpaint.expectedCells(N), DELTA * 4.6484375);
    }

    @Test
    public void case66() {
        int N = 497;
        assertEquals(35.59317331777052, redpaint.expectedCells(N), DELTA * 35.59317331777052);
    }

    @Test
    public void case67() {
        int N = 496;
        assertEquals(35.557365296324576, redpaint.expectedCells(N), DELTA * 35.557365296324576);
    }

    @Test
    public void case68() {
        int N = 489;
        assertEquals(35.30583754239021, redpaint.expectedCells(N), DELTA * 35.30583754239021);
    }

    @Test
    public void case69() {
        int N = 22;
        assertEquals(7.568464279174805, redpaint.expectedCells(N), DELTA * 7.568464279174805);
    }

    @Test
    public void case70() {
        int N = 100;
        assertEquals(15.997436714822918, redpaint.expectedCells(N), DELTA * 15.997436714822918);
    }

    @Test
    public void case71() {
        int N = 431;
        assertEquals(33.148249799746885, redpaint.expectedCells(N), DELTA * 33.148249799746885);
    }

    @Test
    public void case72() {
        int N = 473;
        assertEquals(34.724033767859204, redpaint.expectedCells(N), DELTA * 34.724033767859204);
    }

    @Test
    public void case73() {
        int N = 493;
        assertEquals(35.449796553110524, redpaint.expectedCells(N), DELTA * 35.449796553110524);
    }

    @Test
    public void case74() {
        int N = 43;
        assertEquals(10.525167727300868, redpaint.expectedCells(N), DELTA * 10.525167727300868);
    }

    @Test
    public void case75() {
        int N = 200;
        assertEquals(22.59574008271144, redpaint.expectedCells(N), DELTA * 22.59574008271144);
    }

    @Test
    public void case76() {
        int N = 487;
        assertEquals(35.23363746561626, redpaint.expectedCells(N), DELTA * 35.23363746561626);
    }

    @Test
    public void case77() {
        int N = 50;
        assertEquals(11.339792438580922, redpaint.expectedCells(N), DELTA * 11.339792438580922);
    }

    @Test
    public void case78() {
        int N = 400;
        assertEquals(31.935310872997473, redpaint.expectedCells(N), DELTA * 31.935310872997473);
    }

    @Test
    public void case79() {
        int N = 20;
        assertEquals(7.224079132080078, redpaint.expectedCells(N), DELTA * 7.224079132080078);
    }

    @Test
    public void case80() {
        int N = 478;
        assertEquals(34.90687008439841, redpaint.expectedCells(N), DELTA * 34.90687008439841);
    }

}
