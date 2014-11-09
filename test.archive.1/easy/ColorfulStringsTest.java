package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ColorfulStringsTest {
    ColorfulStrings colorfulstrings = new ColorfulStrings();

    @Test
    public void case1() {
        int n = 3;
        int k = 4;
        assertEquals("238", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case2() {
        int n = 4;
        int k = 2000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case3() {
        int n = 5;
        int k = 1;
        assertEquals("23457", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case4() {
        int n = 2;
        int k = 22;
        assertEquals("52", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case5() {
        int n = 6;
        int k = 464;
        assertEquals("257936", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case6() {
        int n = 1;
        int k = 1;
        assertEquals("0", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case7() {
        int n = 1;
        int k = 3;
        assertEquals("2", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case8() {
        int n = 1;
        int k = 4;
        assertEquals("3", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case9() {
        int n = 1;
        int k = 5;
        assertEquals("4", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case10() {
        int n = 1;
        int k = 6;
        assertEquals("5", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case11() {
        int n = 1;
        int k = 8;
        assertEquals("7", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case12() {
        int n = 1;
        int k = 10;
        assertEquals("9", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case13() {
        int n = 1;
        int k = 11;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case14() {
        int n = 1;
        int k = 430818442;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case15() {
        int n = 1;
        int k = 1000000000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case16() {
        int n = 2;
        int k = 1;
        assertEquals("23", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case17() {
        int n = 2;
        int k = 19;
        assertEquals("47", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case18() {
        int n = 2;
        int k = 28;
        assertEquals("59", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case19() {
        int n = 2;
        int k = 39;
        assertEquals("75", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case20() {
        int n = 2;
        int k = 41;
        assertEquals("78", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case21() {
        int n = 2;
        int k = 42;
        assertEquals("79", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case22() {
        int n = 2;
        int k = 45;
        assertEquals("84", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case23() {
        int n = 2;
        int k = 50;
        assertEquals("92", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case24() {
        int n = 2;
        int k = 56;
        assertEquals("98", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case25() {
        int n = 2;
        int k = 57;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case26() {
        int n = 2;
        int k = 624459040;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case27() {
        int n = 3;
        int k = 1;
        assertEquals("234", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case28() {
        int n = 3;
        int k = 37;
        assertEquals("295", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case29() {
        int n = 3;
        int k = 94;
        assertEquals("453", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case30() {
        int n = 3;
        int k = 191;
        assertEquals("678", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case31() {
        int n = 3;
        int k = 197;
        assertEquals("687", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case32() {
        int n = 3;
        int k = 202;
        assertEquals("695", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case33() {
        int n = 3;
        int k = 302;
        assertEquals("946", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case34() {
        int n = 3;
        int k = 303;
        assertEquals("947", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case35() {
        int n = 3;
        int k = 328;
        assertEquals("987", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case36() {
        int n = 3;
        int k = 329;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case37() {
        int n = 3;
        int k = 635838948;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case38() {
        int n = 4;
        int k = 1;
        assertEquals("2345", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case39() {
        int n = 4;
        int k = 607;
        assertEquals("5362", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case40() {
        int n = 4;
        int k = 938;
        assertEquals("6948", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case41() {
        int n = 4;
        int k = 1073;
        assertEquals("7629", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case42() {
        int n = 4;
        int k = 1251;
        assertEquals("8576", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case43() {
        int n = 4;
        int k = 1372;
        assertEquals("9345", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case44() {
        int n = 4;
        int k = 1389;
        assertEquals("9376", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case45() {
        int n = 4;
        int k = 1478;
        assertEquals("9682", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case46() {
        int n = 4;
        int k = 1540;
        assertEquals("9876", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case47() {
        int n = 4;
        int k = 1541;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case48() {
        int n = 4;
        int k = 387574968;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case49() {
        int n = 5;
        int k = 681;
        assertEquals("29873", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case50() {
        int n = 5;
        int k = 1234;
        assertEquals("38794", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case51() {
        int n = 5;
        int k = 1602;
        assertEquals("45862", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case52() {
        int n = 5;
        int k = 1821;
        assertEquals("47928", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case53() {
        int n = 5;
        int k = 3273;
        assertEquals("68472", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case54() {
        int n = 5;
        int k = 3865;
        assertEquals("76349", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case55() {
        int n = 5;
        int k = 5444;
        assertEquals("98362", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case56() {
        int n = 5;
        int k = 5514;
        assertEquals("98765", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case57() {
        int n = 5;
        int k = 5515;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case58() {
        int n = 5;
        int k = 449453393;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case59() {
        int n = 6;
        int k = 1;
        assertEquals("234578", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case60() {
        int n = 6;
        int k = 541;
        assertEquals("259378", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case61() {
        int n = 6;
        int k = 1130;
        assertEquals("278596", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case62() {
        int n = 6;
        int k = 4797;
        assertEquals("479635", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case63() {
        int n = 6;
        int k = 8072;
        assertEquals("659873", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case64() {
        int n = 6;
        int k = 10206;
        assertEquals("785346", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case65() {
        int n = 6;
        int k = 12337;
        assertEquals("927486", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case66() {
        int n = 6;
        int k = 12733;
        assertEquals("943782", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case67() {
        int n = 6;
        int k = 13956;
        assertEquals("987654", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case68() {
        int n = 6;
        int k = 13957;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case69() {
        int n = 6;
        int k = 957095281;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case70() {
        int n = 7;
        int k = 1;
        assertEquals("2345789", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case71() {
        int n = 7;
        int k = 3416;
        assertEquals("3469728", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case72() {
        int n = 7;
        int k = 4324;
        assertEquals("3647958", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case73() {
        int n = 7;
        int k = 6683;
        assertEquals("4528673", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case74() {
        int n = 7;
        int k = 10799;
        assertEquals("5769283", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case75() {
        int n = 7;
        int k = 14773;
        assertEquals("7384529", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case76() {
        int n = 7;
        int k = 15287;
        assertEquals("7498356", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case77() {
        int n = 7;
        int k = 16225;
        assertEquals("7894325", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case78() {
        int n = 7;
        int k = 21596;
        assertEquals("9876543", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case79() {
        int n = 7;
        int k = 21597;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case80() {
        int n = 7;
        int k = 451435243;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case81() {
        int n = 8;
        int k = 1;
        assertEquals("25346879", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case82() {
        int n = 8;
        int k = 875;
        assertEquals("26893745", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case83() {
        int n = 8;
        int k = 4659;
        assertEquals("39648725", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case84() {
        int n = 8;
        int k = 10578;
        assertEquals("73964582", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case85() {
        int n = 8;
        int k = 10698;
        assertEquals("74652893", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case86() {
        int n = 8;
        int k = 10897;
        assertEquals("75693482", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case87() {
        int n = 8;
        int k = 11643;
        assertEquals("82934657", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case88() {
        int n = 8;
        int k = 12873;
        assertEquals("92685374", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case89() {
        int n = 8;
        int k = 14256;
        assertEquals("98746253", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case90() {
        int n = 8;
        int k = 14257;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case91() {
        int n = 8;
        int k = 818676059;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case92() {
        int n = 9;
        int k = 1;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case93() {
        int n = 16;
        int k = 7821;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case94() {
        int n = 31;
        int k = 3323;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case95() {
        int n = 35;
        int k = 3637;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case96() {
        int n = 38;
        int k = 975045199;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case97() {
        int n = 39;
        int k = 240352029;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case98() {
        int n = 46;
        int k = 525154836;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case99() {
        int n = 50;
        int k = 1;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case100() {
        int n = 50;
        int k = 1000000000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case101() {
        int n = 1;
        int k = 2;
        assertEquals("1", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case102() {
        int n = 8;
        int k = 666;
        assertEquals("26498573", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case103() {
        int n = 4;
        int k = 4;
        assertEquals("2349", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case104() {
        int n = 47;
        int k = 98734;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case105() {
        int n = 13;
        int k = 13;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case106() {
        int n = 8;
        int k = 11256;
        assertEquals("79362845", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case107() {
        int n = 9;
        int k = 100;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case108() {
        int n = 8;
        int k = 555555;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case109() {
        int n = 7;
        int k = 20000;
        assertEquals("9468573", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case110() {
        int n = 6;
        int k = 465;
        assertEquals("257938", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case111() {
        int n = 7;
        int k = 1000;
        assertEquals("2648759", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case112() {
        int n = 8;
        int k = 100;
        assertEquals("25398764", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case113() {
        int n = 8;
        int k = 2;
        assertEquals("25346978", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case114() {
        int n = 7;
        int k = 1000009;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case115() {
        int n = 1;
        int k = 10000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case116() {
        int n = 9;
        int k = 65467;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case117() {
        int n = 7;
        int k = 1000000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case118() {
        int n = 8;
        int k = 14000;
        assertEquals("97286345", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case119() {
        int n = 1;
        int k = 14444;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case120() {
        int n = 8;
        int k = 10000;
        assertEquals("69582743", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case121() {
        int n = 17;
        int k = 10007;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case122() {
        int n = 7;
        int k = 5000;
        assertEquals("3769584", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case123() {
        int n = 50;
        int k = 1000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case124() {
        int n = 5;
        int k = 765;
        assertEquals("34598", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case125() {
        int n = 50;
        int k = 99990000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case126() {
        int n = 9;
        int k = 200000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case127() {
        int n = 12;
        int k = 14455;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case128() {
        int n = 1;
        int k = 1000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case129() {
        int n = 8;
        int k = 12151;
        assertEquals("85273694", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case130() {
        int n = 8;
        int k = 12;
        assertEquals("25348796", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case131() {
        int n = 8;
        int k = 200;
        assertEquals("25498736", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case132() {
        int n = 8;
        int k = 999999;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case133() {
        int n = 9;
        int k = 1000000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case134() {
        int n = 8;
        int k = 1000;
        assertEquals("27359864", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case135() {
        int n = 8;
        int k = 8;
        assertEquals("25347986", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case136() {
        int n = 8;
        int k = 101;
        assertEquals("25436879", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case137() {
        int n = 8;
        int k = 10464;
        assertEquals("73598264", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case138() {
        int n = 1;
        int k = 103;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case139() {
        int n = 49;
        int k = 99999999;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case140() {
        int n = 1;
        int k = 100;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case141() {
        int n = 8;
        int k = 1000000000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case142() {
        int n = 7;
        int k = 10;
        assertEquals("2347895", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case143() {
        int n = 9;
        int k = 10;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case144() {
        int n = 50;
        int k = 5;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case145() {
        int n = 8;
        int k = 112;
        assertEquals("25438796", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case146() {
        int n = 8;
        int k = 10;
        assertEquals("25348697", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case147() {
        int n = 8;
        int k = 3;
        assertEquals("25347689", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case148() {
        int n = 8;
        int k = 50000000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case149() {
        int n = 8;
        int k = 12154;
        assertEquals("85274369", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case150() {
        int n = 50;
        int k = 10000000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case151() {
        int n = 49;
        int k = 1000000000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case152() {
        int n = 1;
        int k = 20;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case153() {
        int n = 8;
        int k = 4999;
        assertEquals("43789256", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case154() {
        int n = 1;
        int k = 12;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case155() {
        int n = 1;
        int k = 9;
        assertEquals("8", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case156() {
        int n = 7;
        int k = 21595;
        assertEquals("9876534", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case157() {
        int n = 50;
        int k = 10000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case158() {
        int n = 8;
        int k = 1000000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case159() {
        int n = 8;
        int k = 100000000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case160() {
        int n = 10;
        int k = 1000000000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case161() {
        int n = 6;
        int k = 753000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case162() {
        int n = 8;
        int k = 500;
        assertEquals("25943876", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case163() {
        int n = 8;
        int k = 12115;
        assertEquals("84953726", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case164() {
        int n = 9;
        int k = 2000;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case165() {
        int n = 8;
        int k = 15200;
        assertEquals("", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case166() {
        int n = 8;
        int k = 12345;
        assertEquals("86397254", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case167() {
        int n = 8;
        int k = 12000;
        assertEquals("84652793", colorfulstrings.getKth(n, k));
    }

    @Test
    public void case168() {
        int n = 8;
        int k = 123;
        assertEquals("25467893", colorfulstrings.getKth(n, k));
    }

}
