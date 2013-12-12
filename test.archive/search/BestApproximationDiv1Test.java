package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class BestApproximationDiv1Test {
    BestApproximationDiv1 bestapproximationdiv1 = new BestApproximationDiv1();

    @Test
    public void case1() {
        int maxDen = 42;
        String number = "0.141592";
        assertEquals("1/7 has 3 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case2() {
        int maxDen = 3;
        String number = "0.133700";
        assertEquals("0/1 has 1 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case3() {
        int maxDen = 1000;
        String number = "0.123456";
        assertEquals("10/81 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case4() {
        int maxDen = 1000;
        String number = "0.420000";
        assertEquals("21/50 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case5() {
        int maxDen = 100;
        String number = "0.909999";
        assertEquals("10/11 has 4 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case6() {
        int maxDen = 115;
        String number = "0.141592";
        assertEquals("16/113 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case7() {
        int maxDen = 1000;
        String number = "0.272727";
        assertEquals("3/11 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case8() {
        int maxDen = 42;
        String number = "0.409488";
        assertEquals("9/22 has 4 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case9() {
        int maxDen = 300;
        String number = "0.431233";
        assertEquals("69/160 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case10() {
        int maxDen = 85;
        String number = "0.606618";
        assertEquals("20/33 has 4 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case11() {
        int maxDen = 656;
        String number = "0.120014";
        assertEquals("3/25 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case12() {
        int maxDen = 423;
        String number = "0.603801";
        assertEquals("93/154 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case13() {
        int maxDen = 901;
        String number = "0.778383";
        assertEquals("425/546 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case14() {
        int maxDen = 449;
        String number = "0.880681";
        assertEquals("155/176 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case15() {
        int maxDen = 10;
        String number = "0.228289";
        assertEquals("2/9 has 3 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case16() {
        int maxDen = 689;
        String number = "0.953252";
        assertEquals("469/492 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case17() {
        int maxDen = 618;
        String number = "0.229419";
        assertEquals("39/170 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case18() {
        int maxDen = 264;
        String number = "0.553282";
        assertEquals("109/197 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case19() {
        int maxDen = 959;
        String number = "0.257444";
        assertEquals("121/470 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case20() {
        int maxDen = 594;
        String number = "0.122264";
        assertEquals("67/548 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case21() {
        int maxDen = 236;
        String number = "0.106750";
        assertEquals("11/103 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case22() {
        int maxDen = 87;
        String number = "0.774579";
        assertEquals("24/31 has 4 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case23() {
        int maxDen = 738;
        String number = "0.554026";
        assertEquals("241/435 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case24() {
        int maxDen = 201;
        String number = "0.930747";
        assertEquals("121/130 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case25() {
        int maxDen = 217;
        String number = "0.767719";
        assertEquals("119/155 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case26() {
        int maxDen = 484;
        String number = "0.578583";
        assertEquals("254/439 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case27() {
        int maxDen = 143;
        String number = "0.174823";
        assertEquals("25/143 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case28() {
        int maxDen = 652;
        String number = "0.485925";
        assertEquals("259/533 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case29() {
        int maxDen = 214;
        String number = "0.412908";
        assertEquals("64/155 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case30() {
        int maxDen = 585;
        String number = "0.143552";
        assertEquals("59/411 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case31() {
        int maxDen = 246;
        String number = "0.801322";
        assertEquals("121/151 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case32() {
        int maxDen = 147;
        String number = "0.930087";
        assertEquals("93/100 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case33() {
        int maxDen = 258;
        String number = "0.458615";
        assertEquals("61/133 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case34() {
        int maxDen = 76;
        String number = "0.268266";
        assertEquals("11/41 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case35() {
        int maxDen = 453;
        String number = "0.234343";
        assertEquals("15/64 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case36() {
        int maxDen = 859;
        String number = "0.514363";
        assertEquals("376/731 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case37() {
        int maxDen = 370;
        String number = "0.989135";
        assertEquals("91/92 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case38() {
        int maxDen = 816;
        String number = "0.159083";
        assertEquals("7/44 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case39() {
        int maxDen = 117;
        String number = "0.789415";
        assertEquals("15/19 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case40() {
        int maxDen = 663;
        String number = "0.495234";
        assertEquals("52/105 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case41() {
        int maxDen = 424;
        String number = "0.688277";
        assertEquals("223/324 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case42() {
        int maxDen = 346;
        String number = "0.812149";
        assertEquals("134/165 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case43() {
        int maxDen = 601;
        String number = "0.928205";
        assertEquals("181/195 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case44() {
        int maxDen = 571;
        String number = "0.472149";
        assertEquals("161/341 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case45() {
        int maxDen = 282;
        String number = "0.232466";
        assertEquals("43/185 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case46() {
        int maxDen = 612;
        String number = "0.995556";
        assertEquals("224/225 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case47() {
        int maxDen = 911;
        String number = "0.215444";
        assertEquals("53/246 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case48() {
        int maxDen = 946;
        String number = "0.607272";
        assertEquals("167/275 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case49() {
        int maxDen = 584;
        String number = "0.328601";
        assertEquals("139/423 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case50() {
        int maxDen = 444;
        String number = "0.108109";
        assertEquals("4/37 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case51() {
        int maxDen = 529;
        String number = "0.830362";
        assertEquals("93/112 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case52() {
        int maxDen = 615;
        String number = "0.813678";
        assertEquals("345/424 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case53() {
        int maxDen = 813;
        String number = "0.314310";
        assertEquals("83/264 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case54() {
        int maxDen = 900;
        String number = "0.382321";
        assertEquals("13/34 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case55() {
        int maxDen = 806;
        String number = "0.209891";
        assertEquals("123/586 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case56() {
        int maxDen = 164;
        String number = "0.622143";
        assertEquals("28/45 has 4 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case57() {
        int maxDen = 600;
        String number = "0.082740";
        assertEquals("35/423 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case58() {
        int maxDen = 751;
        String number = "0.428571";
        assertEquals("3/7 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case59() {
        int maxDen = 996;
        String number = "0.919941";
        assertEquals("632/687 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case60() {
        int maxDen = 900;
        String number = "0.129411";
        assertEquals("11/85 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case61() {
        int maxDen = 609;
        String number = "0.469879";
        assertEquals("39/83 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case62() {
        int maxDen = 515;
        String number = "0.166666";
        assertEquals("1/6 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case63() {
        int maxDen = 974;
        String number = "0.987261";
        assertEquals("155/157 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case64() {
        int maxDen = 987;
        String number = "0.181286";
        assertEquals("31/171 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case65() {
        int maxDen = 518;
        String number = "0.436507";
        assertEquals("55/126 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case66() {
        int maxDen = 792;
        String number = "0.296208";
        assertEquals("125/422 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case67() {
        int maxDen = 694;
        String number = "0.228571";
        assertEquals("8/35 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case68() {
        int maxDen = 858;
        String number = "0.693877";
        assertEquals("34/49 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case69() {
        int maxDen = 552;
        String number = "0.259615";
        assertEquals("27/104 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case70() {
        int maxDen = 956;
        String number = "0.979166";
        assertEquals("47/48 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case71() {
        int maxDen = 98;
        String number = "0.642857";
        assertEquals("9/14 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case72() {
        int maxDen = 262;
        String number = "0.333333";
        assertEquals("1/3 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case73() {
        int maxDen = 141;
        String number = "0.480000";
        assertEquals("12/25 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case74() {
        int maxDen = 171;
        String number = "0.509803";
        assertEquals("26/51 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case75() {
        int maxDen = 150;
        String number = "0.823529";
        assertEquals("14/17 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case76() {
        int maxDen = 283;
        String number = "0.032520";
        assertEquals("4/123 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case77() {
        int maxDen = 368;
        String number = "0.112299";
        assertEquals("21/187 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case78() {
        int maxDen = 642;
        String number = "0.870588";
        assertEquals("74/85 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case79() {
        int maxDen = 480;
        String number = "0.743902";
        assertEquals("61/82 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case80() {
        int maxDen = 448;
        String number = "0.470588";
        assertEquals("8/17 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case81() {
        int maxDen = 760;
        String number = "0.314545";
        assertEquals("173/550 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case82() {
        int maxDen = 487;
        String number = "0.170212";
        assertEquals("8/47 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case83() {
        int maxDen = 861;
        String number = "0.004756";
        assertEquals("4/841 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case84() {
        int maxDen = 504;
        String number = "0.690647";
        assertEquals("96/139 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case85() {
        int maxDen = 456;
        String number = "0.564516";
        assertEquals("35/62 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case86() {
        int maxDen = 822;
        String number = "0.914285";
        assertEquals("32/35 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case87() {
        int maxDen = 456;
        String number = "0.092342";
        assertEquals("41/444 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case88() {
        int maxDen = 136;
        String number = "0.943820";
        assertEquals("84/89 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case89() {
        int maxDen = 999;
        String number = "0.367816";
        assertEquals("32/87 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case90() {
        int maxDen = 636;
        String number = "0.658602";
        assertEquals("245/372 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case91() {
        int maxDen = 233;
        String number = "0.920454";
        assertEquals("81/88 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case92() {
        int maxDen = 679;
        String number = "0.535294";
        assertEquals("91/170 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case93() {
        int maxDen = 200;
        String number = "0.785714";
        assertEquals("11/14 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case94() {
        int maxDen = 574;
        String number = "0.070671";
        assertEquals("20/283 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case95() {
        int maxDen = 275;
        String number = "0.375000";
        assertEquals("3/8 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case96() {
        int maxDen = 288;
        String number = "0.694444";
        assertEquals("25/36 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case97() {
        int maxDen = 466;
        String number = "0.825136";
        assertEquals("151/183 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case98() {
        int maxDen = 113;
        String number = "0.066666";
        assertEquals("1/15 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case99() {
        int maxDen = 891;
        String number = "0.889589";
        assertEquals("282/317 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case100() {
        int maxDen = 33;
        String number = "0.700000";
        assertEquals("7/10 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case101() {
        int maxDen = 432;
        String number = "0.864516";
        assertEquals("134/155 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case102() {
        int maxDen = 579;
        String number = "0.968354";
        assertEquals("153/158 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case103() {
        int maxDen = 167;
        String number = "0.947368";
        assertEquals("18/19 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case104() {
        int maxDen = 695;
        String number = "0.620833";
        assertEquals("149/240 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case105() {
        int maxDen = 985;
        String number = "0.193333";
        assertEquals("29/150 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case106() {
        int maxDen = 16;
        String number = "0.333333";
        assertEquals("1/3 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case107() {
        int maxDen = 907;
        String number = "0.697936";
        assertEquals("372/533 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case108() {
        int maxDen = 42;
        String number = "0.000000";
        assertEquals("0/1 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case109() {
        int maxDen = 1000;
        String number = "0.128124";
        assertEquals("41/320 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case110() {
        int maxDen = 1000;
        String number = "0.128125";
        assertEquals("41/320 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case111() {
        int maxDen = 1000;
        String number = "0.251199";
        assertEquals("105/418 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case112() {
        int maxDen = 888;
        String number = "0.253740";
        assertEquals("220/867 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case113() {
        int maxDen = 945;
        String number = "0.253749";
        assertEquals("220/867 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case114() {
        int maxDen = 999;
        String number = "0.256240";
        assertEquals("195/761 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case115() {
        int maxDen = 1000;
        String number = "0.256250";
        assertEquals("41/160 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case116() {
        int maxDen = 853;
        String number = "0.258749";
        assertEquals("37/143 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case117() {
        int maxDen = 934;
        String number = "0.258750";
        assertEquals("207/800 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case118() {
        int maxDen = 989;
        String number = "0.502399";
        assertEquals("105/209 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case119() {
        int maxDen = 601;
        String number = "0.502491";
        assertEquals("302/601 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case120() {
        int maxDen = 599;
        String number = "0.502503";
        assertEquals("201/400 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case121() {
        int maxDen = 400;
        String number = "0.507500";
        assertEquals("203/400 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case122() {
        int maxDen = 240;
        String number = "0.512490";
        assertEquals("103/201 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case123() {
        int maxDen = 790;
        String number = "0.512499";
        assertEquals("103/201 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case124() {
        int maxDen = 766;
        String number = "0.522505";
        assertEquals("209/400 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case125() {
        int maxDen = 1000;
        String number = "0.000001";
        assertEquals("0/1 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case126() {
        int maxDen = 1000;
        String number = "0.001001";
        assertEquals("1/999 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case127() {
        int maxDen = 5;
        String number = "0.200000";
        assertEquals("1/5 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case128() {
        int maxDen = 1000;
        String number = "0.999999";
        assertEquals("999/1000 has 4 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case129() {
        int maxDen = 10;
        String number = "0.000000";
        assertEquals("0/1 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case130() {
        int maxDen = 2;
        String number = "0.500000";
        assertEquals("1/2 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case131() {
        int maxDen = 1000;
        String number = "0.000000";
        assertEquals("0/1 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case132() {
        int maxDen = 113;
        String number = "0.141592";
        assertEquals("16/113 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case133() {
        int maxDen = 1;
        String number = "0.500000";
        assertEquals("0/1 has 1 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case134() {
        int maxDen = 13;
        String number = "0.923076";
        assertEquals("12/13 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case135() {
        int maxDen = 3;
        String number = "0.333333";
        assertEquals("1/3 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case136() {
        int maxDen = 1000;
        String number = "0.005922";
        assertEquals("3/506 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case137() {
        int maxDen = 11;
        String number = "0.909999";
        assertEquals("10/11 has 4 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case138() {
        int maxDen = 1;
        String number = "0.999999";
        assertEquals("0/1 has 1 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case139() {
        int maxDen = 1000;
        String number = "0.812983";
        assertEquals("313/385 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case140() {
        int maxDen = 323;
        String number = "0.334113";
        assertEquals("68/203 has 4 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case141() {
        int maxDen = 10;
        String number = "0.700000";
        assertEquals("7/10 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case142() {
        int maxDen = 999;
        String number = "0.990990";
        assertEquals("110/111 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case143() {
        int maxDen = 1000;
        String number = "0.009900";
        assertEquals("1/101 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case144() {
        int maxDen = 1000;
        String number = "0.998999";
        assertEquals("990/991 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case145() {
        int maxDen = 1;
        String number = "0.000000";
        assertEquals("0/1 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case146() {
        int maxDen = 100;
        String number = "0.972972";
        assertEquals("36/37 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case147() {
        int maxDen = 1000;
        String number = "0.039800";
        assertEquals("8/201 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case148() {
        int maxDen = 414;
        String number = "0.801250";
        assertEquals("125/156 has 5 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case149() {
        int maxDen = 21;
        String number = "0.952380";
        assertEquals("20/21 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case150() {
        int maxDen = 7;
        String number = "0.142857";
        assertEquals("1/7 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case151() {
        int maxDen = 10;
        String number = "0.100000";
        assertEquals("1/10 has 7 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case152() {
        int maxDen = 500;
        String number = "0.908070";
        assertEquals("326/359 has 6 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

    @Test
    public void case153() {
        int maxDen = 1;
        String number = "0.000345";
        assertEquals("0/1 has 4 exact digits", bestapproximationdiv1.findFraction(maxDen, number));
    }

}
