package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class RandomGraphTest {
    double DELTA = 1.0e-09;
    RandomGraph randomgraph = new RandomGraph();

    @Test
    public void case1() {
        int n = 7;
        int p = 0;
        assertEquals(0.0, randomgraph.probability(n, p), DELTA);
    }

    @Test
    public void case2() {
        int n = 3;
        int p = 620;
        assertEquals(0.0, randomgraph.probability(n, p), DELTA);
    }

    @Test
    public void case3() {
        int n = 4;
        int p = 500;
        assertEquals(0.59375, randomgraph.probability(n, p), DELTA * 0.59375);
    }

    @Test
    public void case4() {
        int n = 8;
        int p = 100;
        assertEquals(0.33566851611343496, randomgraph.probability(n, p), DELTA * 0.33566851611343496);
    }

    @Test
    public void case5() {
        int n = 15;
        int p = 50;
        assertEquals(0.5686761670525845, randomgraph.probability(n, p), DELTA * 0.5686761670525845);
    }

    @Test
    public void case6() {
        int n = 50;
        int p = 1000;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case7() {
        int n = 50;
        int p = 10;
        assertEquals(0.7494276522159893, randomgraph.probability(n, p), DELTA * 0.7494276522159893);
    }

    @Test
    public void case8() {
        int n = 2;
        int p = 202;
        assertEquals(0.0, randomgraph.probability(n, p), DELTA);
    }

    @Test
    public void case9() {
        int n = 10;
        int p = 141;
        assertEquals(0.8337264488082298, randomgraph.probability(n, p), DELTA * 0.8337264488082298);
    }

    @Test
    public void case10() {
        int n = 50;
        int p = 650;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case11() {
        int n = 7;
        int p = 454;
        assertEquals(0.9957913645318551, randomgraph.probability(n, p), DELTA * 0.9957913645318551);
    }

    @Test
    public void case12() {
        int n = 36;
        int p = 101;
        assertEquals(0.9999999999999996, randomgraph.probability(n, p), DELTA * 0.9999999999999996);
    }

    @Test
    public void case13() {
        int n = 23;
        int p = 564;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case14() {
        int n = 50;
        int p = 459;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case15() {
        int n = 28;
        int p = 304;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case16() {
        int n = 4;
        int p = 127;
        assertEquals(0.02495710047527988, randomgraph.probability(n, p), DELTA * 0.02495710047527988);
    }

    @Test
    public void case17() {
        int n = 19;
        int p = 851;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case18() {
        int n = 32;
        int p = 317;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case19() {
        int n = 49;
        int p = 608;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case20() {
        int n = 18;
        int p = 294;
        assertEquals(0.9999999999999881, randomgraph.probability(n, p), DELTA * 0.9999999999999881);
    }

    @Test
    public void case21() {
        int n = 35;
        int p = 531;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case22() {
        int n = 5;
        int p = 182;
        assertEquals(0.20624951752202791, randomgraph.probability(n, p), DELTA * 0.20624951752202791);
    }

    @Test
    public void case23() {
        int n = 30;
        int p = 752;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case24() {
        int n = 27;
        int p = 204;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case25() {
        int n = 23;
        int p = 163;
        assertEquals(0.9999999999508394, randomgraph.probability(n, p), DELTA * 0.9999999999508394);
    }

    @Test
    public void case26() {
        int n = 11;
        int p = 635;
        assertEquals(0.9999999999999999, randomgraph.probability(n, p), DELTA * 0.9999999999999999);
    }

    @Test
    public void case27() {
        int n = 25;
        int p = 82;
        assertEquals(0.99994799499826, randomgraph.probability(n, p), DELTA * 0.99994799499826);
    }

    @Test
    public void case28() {
        int n = 2;
        int p = 100;
        assertEquals(0.0, randomgraph.probability(n, p), DELTA);
    }

    @Test
    public void case29() {
        int n = 48;
        int p = 55;
        assertEquals(0.9999999999997464, randomgraph.probability(n, p), DELTA * 0.9999999999997464);
    }

    @Test
    public void case30() {
        int n = 36;
        int p = 629;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case31() {
        int n = 48;
        int p = 725;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case32() {
        int n = 43;
        int p = 150;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case33() {
        int n = 3;
        int p = 145;
        assertEquals(0.0, randomgraph.probability(n, p), DELTA);
    }

    @Test
    public void case34() {
        int n = 44;
        int p = 777;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case35() {
        int n = 45;
        int p = 419;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case36() {
        int n = 20;
        int p = 416;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case37() {
        int n = 42;
        int p = 839;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case38() {
        int n = 30;
        int p = 675;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case39() {
        int n = 41;
        int p = 62;
        assertEquals(0.9999999999234339, randomgraph.probability(n, p), DELTA * 0.9999999999234339);
    }

    @Test
    public void case40() {
        int n = 41;
        int p = 665;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case41() {
        int n = 11;
        int p = 596;
        assertEquals(0.9999999999999865, randomgraph.probability(n, p), DELTA * 0.9999999999999865);
    }

    @Test
    public void case42() {
        int n = 26;
        int p = 779;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case43() {
        int n = 47;
        int p = 79;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case44() {
        int n = 44;
        int p = 316;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case45() {
        int n = 12;
        int p = 207;
        assertEquals(0.9980276101036871, randomgraph.probability(n, p), DELTA * 0.9980276101036871);
    }

    @Test
    public void case46() {
        int n = 39;
        int p = 681;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case47() {
        int n = 24;
        int p = 34;
        assertEquals(0.8245285655243519, randomgraph.probability(n, p), DELTA * 0.8245285655243519);
    }

    @Test
    public void case48() {
        int n = 19;
        int p = 784;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case49() {
        int n = 34;
        int p = 795;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case50() {
        int n = 33;
        int p = 770;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case51() {
        int n = 3;
        int p = 426;
        assertEquals(0.0, randomgraph.probability(n, p), DELTA);
    }

    @Test
    public void case52() {
        int n = 23;
        int p = 314;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case53() {
        int n = 43;
        int p = 884;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case54() {
        int n = 19;
        int p = 847;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case55() {
        int n = 34;
        int p = 404;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case56() {
        int n = 41;
        int p = 691;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case57() {
        int n = 31;
        int p = 536;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case58() {
        int n = 17;
        int p = 754;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case59() {
        int n = 10;
        int p = 786;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case60() {
        int n = 12;
        int p = 994;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case61() {
        int n = 33;
        int p = 698;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case62() {
        int n = 23;
        int p = 378;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case63() {
        int n = 8;
        int p = 749;
        assertEquals(0.999999999942898, randomgraph.probability(n, p), DELTA * 0.999999999942898);
    }

    @Test
    public void case64() {
        int n = 11;
        int p = 529;
        assertEquals(0.9999999999901812, randomgraph.probability(n, p), DELTA * 0.9999999999901812);
    }

    @Test
    public void case65() {
        int n = 10;
        int p = 607;
        assertEquals(0.9999999999950838, randomgraph.probability(n, p), DELTA * 0.9999999999950838);
    }

    @Test
    public void case66() {
        int n = 16;
        int p = 200;
        assertEquals(0.9999974191252643, randomgraph.probability(n, p), DELTA * 0.9999974191252643);
    }

    @Test
    public void case67() {
        int n = 6;
        int p = 550;
        assertEquals(0.9930856223520955, randomgraph.probability(n, p), DELTA * 0.9930856223520955);
    }

    @Test
    public void case68() {
        int n = 36;
        int p = 557;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case69() {
        int n = 26;
        int p = 252;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case70() {
        int n = 28;
        int p = 277;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case71() {
        int n = 31;
        int p = 666;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case72() {
        int n = 46;
        int p = 371;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case73() {
        int n = 34;
        int p = 41;
        assertEquals(0.9991163783725384, randomgraph.probability(n, p), DELTA * 0.9991163783725384);
    }

    @Test
    public void case74() {
        int n = 46;
        int p = 417;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case75() {
        int n = 30;
        int p = 613;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case76() {
        int n = 30;
        int p = 333;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case77() {
        int n = 37;
        int p = 382;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case78() {
        int n = 15;
        int p = 255;
        assertEquals(0.9999999005381354, randomgraph.probability(n, p), DELTA * 0.9999999005381354);
    }

    @Test
    public void case79() {
        int n = 33;
        int p = 114;
        assertEquals(0.9999999999999984, randomgraph.probability(n, p), DELTA * 0.9999999999999984);
    }

    @Test
    public void case80() {
        int n = 26;
        int p = 595;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case81() {
        int n = 7;
        int p = 963;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case82() {
        int n = 3;
        int p = 498;
        assertEquals(0.0, randomgraph.probability(n, p), DELTA);
    }

    @Test
    public void case83() {
        int n = 33;
        int p = 477;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case84() {
        int n = 44;
        int p = 183;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case85() {
        int n = 32;
        int p = 471;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case86() {
        int n = 49;
        int p = 610;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case87() {
        int n = 50;
        int p = 700;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case88() {
        int n = 50;
        int p = 543;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

    @Test
    public void case89() {
        int n = 13;
        int p = 13;
        assertEquals(0.01833583599028421, randomgraph.probability(n, p), DELTA * 0.01833583599028421);
    }

    @Test
    public void case90() {
        int n = 47;
        int p = 437;
        assertEquals(1.0, randomgraph.probability(n, p), DELTA * 1.0);
    }

}
