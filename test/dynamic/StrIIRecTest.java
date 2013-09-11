package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class StrIIRecTest {
    StrIIRec striirec = new StrIIRec();

    @Test
    public void case1() {
        int n = 1;
        int minInv = 0;
        String minStr = "a";
        assertEquals("a", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case2() {
        int n = 2;
        int minInv = 0;
        String minStr = "a";
        assertEquals("ab", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case3() {
        int n = 2;
        int minInv = 0;
        String minStr = "b";
        assertEquals("ba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case4() {
        int n = 2;
        int minInv = 1;
        String minStr = "a";
        assertEquals("ba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case5() {
        int n = 2;
        int minInv = 1;
        String minStr = "b";
        assertEquals("ba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case6() {
        int n = 2;
        int minInv = 0;
        String minStr = "ab";
        assertEquals("ab", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case7() {
        int n = 2;
        int minInv = 1;
        String minStr = "ab";
        assertEquals("ba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case8() {
        int n = 2;
        int minInv = 0;
        String minStr = "ba";
        assertEquals("ba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case9() {
        int n = 2;
        int minInv = 1;
        String minStr = "ba";
        assertEquals("ba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case10() {
        int n = 16;
        int minInv = 64;
        String minStr = "k";
        assertEquals("kabcdopnmljihgfe", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case11() {
        int n = 9;
        int minInv = 1;
        String minStr = "efcdgab";
        assertEquals("efcdgabhi", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case12() {
        int n = 13;
        int minInv = 77;
        String minStr = "ljhefmciabdgk";
        assertEquals("lmkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case13() {
        int n = 3;
        int minInv = 0;
        String minStr = "bca";
        assertEquals("bca", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case14() {
        int n = 8;
        int minInv = 1;
        String minStr = "gdbcah";
        assertEquals("gdbcahef", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case15() {
        int n = 15;
        int minInv = 3;
        String minStr = "enjkmlbhaio";
        assertEquals("enjkmlbhaiocdfg", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case16() {
        int n = 11;
        int minInv = 12;
        String minStr = "acgedif";
        assertEquals("acgedifbhjk", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case17() {
        int n = 8;
        int minInv = 16;
        String minStr = "af";
        assertEquals("afdhgecb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case18() {
        int n = 13;
        int minInv = 33;
        String minStr = "dkmlabfghj";
        assertEquals("dkmlabfghjcei", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case19() {
        int n = 10;
        int minInv = 12;
        String minStr = "hdfjig";
        assertEquals("hdfjigabce", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case20() {
        int n = 11;
        int minInv = 16;
        String minStr = "dhiajge";
        assertEquals("dhiajgebcfk", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case21() {
        int n = 4;
        int minInv = 1;
        String minStr = "ca";
        assertEquals("cabd", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case22() {
        int n = 3;
        int minInv = 0;
        String minStr = "acb";
        assertEquals("acb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case23() {
        int n = 3;
        int minInv = 1;
        String minStr = "c";
        assertEquals("cab", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case24() {
        int n = 13;
        int minInv = 32;
        String minStr = "fcdbh";
        assertEquals("fcdbhakmljige", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case25() {
        int n = 18;
        int minInv = 84;
        String minStr = "ifebqhljk";
        assertEquals("ifebqhljkrponmgdca", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case26() {
        int n = 20;
        int minInv = 124;
        String minStr = "rosqkcip";
        assertEquals("rosqkcipabdjtnmlhgfe", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case27() {
        int n = 15;
        int minInv = 105;
        String minStr = "jkblogm";
        assertEquals("onmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case28() {
        int n = 11;
        int minInv = 0;
        String minStr = "egifh";
        assertEquals("egifhabcdjk", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case29() {
        int n = 3;
        int minInv = 0;
        String minStr = "bac";
        assertEquals("bac", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case30() {
        int n = 11;
        int minInv = 55;
        String minStr = "debgikjfc";
        assertEquals("kjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case31() {
        int n = 4;
        int minInv = 4;
        String minStr = "cbd";
        assertEquals("cbda", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case32() {
        int n = 11;
        int minInv = 2;
        String minStr = "fhgkicb";
        assertEquals("fhgkicbadej", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case33() {
        int n = 18;
        int minInv = 51;
        String minStr = "hqkrebo";
        assertEquals("hqkreboacdfgijlmnp", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case34() {
        int n = 13;
        int minInv = 65;
        String minStr = "fcedmjigl";
        assertEquals("fgmlkjihedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case35() {
        int n = 18;
        int minInv = 136;
        String minStr = "o";
        assertEquals("ocrqpnmlkjihgfedba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case36() {
        int n = 11;
        int minInv = 4;
        String minStr = "biaf";
        assertEquals("biafcdeghjk", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case37() {
        int n = 4;
        int minInv = 4;
        String minStr = "ad";
        assertEquals("bdca", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case38() {
        int n = 9;
        int minInv = 10;
        String minStr = "b";
        assertEquals("bacdhigfe", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case39() {
        int n = 4;
        int minInv = 5;
        String minStr = "ad";
        assertEquals("cdba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case40() {
        int n = 5;
        int minInv = 1;
        String minStr = "e";
        assertEquals("eabcd", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case41() {
        int n = 20;
        int minInv = 99;
        String minStr = "asjilotdqgcepbmnkrh";
        assertEquals("asjilotdqgcepbmnrkhf", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case42() {
        int n = 12;
        int minInv = 39;
        String minStr = "labdefcgkhij";
        assertEquals("labdjkihgfec", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case43() {
        int n = 8;
        int minInv = 14;
        String minStr = "h";
        assertEquals("habdgfec", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case44() {
        int n = 19;
        int minInv = 122;
        String minStr = "afqinebcsrmlgh";
        assertEquals("afqinosrpmlkjhgedcb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case45() {
        int n = 6;
        int minInv = 12;
        String minStr = "bfead";
        assertEquals("cfedba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case46() {
        int n = 6;
        int minInv = 7;
        String minStr = "bcd";
        assertEquals("bcefda", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case47() {
        int n = 17;
        int minInv = 16;
        String minStr = "e";
        assertEquals("eabcdfghijknqpoml", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case48() {
        int n = 4;
        int minInv = 1;
        String minStr = "cbd";
        assertEquals("cbda", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case49() {
        int n = 10;
        int minInv = 27;
        String minStr = "aihecjgf";
        assertEquals("aihecjgfdb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case50() {
        int n = 8;
        int minInv = 22;
        String minStr = "fahb";
        assertEquals("fchgedba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case51() {
        int n = 15;
        int minInv = 24;
        String minStr = "adilgme";
        assertEquals("adilgmebcfhjkno", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case52() {
        int n = 14;
        int minInv = 72;
        String minStr = "fcengdika";
        assertEquals("fcmnlkjihgedba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case53() {
        int n = 12;
        int minInv = 50;
        String minStr = "gjeh";
        assertEquals("gjehklifdcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case54() {
        int n = 19;
        int minInv = 116;
        String minStr = "enhmdirfbjlosk";
        assertEquals("enhmdirqspolkjgfcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case55() {
        int n = 7;
        int minInv = 6;
        String minStr = "bfd";
        assertEquals("bfdaceg", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case56() {
        int n = 9;
        int minInv = 20;
        String minStr = "feh";
        assertEquals("fehabigdc", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case57() {
        int n = 6;
        int minInv = 12;
        String minStr = "dcbfe";
        assertEquals("defcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case58() {
        int n = 20;
        int minInv = 39;
        String minStr = "mahkidsbtpref";
        assertEquals("mahkidsbtprefcgjlnoq", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case59() {
        int n = 8;
        int minInv = 18;
        String minStr = "defhac";
        assertEquals("defhcgba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case60() {
        int n = 16;
        int minInv = 15;
        String minStr = "ahjpk";
        assertEquals("ahjpkbcdefgilmno", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case61() {
        int n = 18;
        int minInv = 124;
        String minStr = "bqkdrflcinej";
        assertEquals("bqkjrponmlihgfedca", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case62() {
        int n = 9;
        int minInv = 17;
        String minStr = "hcedfbai";
        assertEquals("hcedfbaig", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case63() {
        int n = 8;
        int minInv = 28;
        String minStr = "gabhdcf";
        assertEquals("hgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case64() {
        int n = 20;
        int minInv = 24;
        String minStr = "lfd";
        assertEquals("lfdabceghijkmnopstrq", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case65() {
        int n = 17;
        int minInv = 69;
        String minStr = "apqemchbldkgi";
        assertEquals("apqemchbldkjonigf", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case66() {
        int n = 5;
        int minInv = 4;
        String minStr = "a";
        assertEquals("acedb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case67() {
        int n = 6;
        int minInv = 11;
        String minStr = "f";
        assertEquals("faedcb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case68() {
        int n = 19;
        int minInv = 24;
        String minStr = "enbosmr";
        assertEquals("enbosmracdfghijklpq", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case69() {
        int n = 5;
        int minInv = 1;
        String minStr = "ebac";
        assertEquals("ebacd", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case70() {
        int n = 17;
        int minInv = 88;
        String minStr = "lipbn";
        assertEquals("lipbnacqomkjhgfed", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case71() {
        int n = 13;
        int minInv = 48;
        String minStr = "jlhaci";
        assertEquals("jlhacidmkgfeb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case72() {
        int n = 6;
        int minInv = 11;
        String minStr = "abc";
        assertEquals("bfedca", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case73() {
        int n = 8;
        int minInv = 13;
        String minStr = "gcbhde";
        assertEquals("gcbhdeaf", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case74() {
        int n = 19;
        int minInv = 19;
        String minStr = "ebjcha";
        assertEquals("ebjchadfgiklmnoprsq", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case75() {
        int n = 19;
        int minInv = 48;
        String minStr = "caro";
        assertEquals("carobdefghijpsqnmlk", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case76() {
        int n = 11;
        int minInv = 6;
        String minStr = "cakib";
        assertEquals("cakibdefghj", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case77() {
        int n = 18;
        int minInv = 42;
        String minStr = "fpbkojqgenrilhdac";
        assertEquals("fpbkojqgenrilhdacm", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case78() {
        int n = 11;
        int minInv = 2;
        String minStr = "edbjaki";
        assertEquals("edbjakicfgh", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case79() {
        int n = 8;
        int minInv = 10;
        String minStr = "e";
        assertEquals("eabchgfd", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case80() {
        int n = 9;
        int minInv = 21;
        String minStr = "h";
        assertEquals("habgifedc", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case81() {
        int n = 8;
        int minInv = 16;
        String minStr = "cfh";
        assertEquals("cfhaegdb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case82() {
        int n = 14;
        int minInv = 56;
        String minStr = "kiamjhbecld";
        assertEquals("kiamjhbelngfdc", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case83() {
        int n = 19;
        int minInv = 18;
        String minStr = "irfebmslhgadn";
        assertEquals("irfebmslhgadncjkopq", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case84() {
        int n = 10;
        int minInv = 18;
        String minStr = "aie";
        assertEquals("aiebcgjhfd", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case85() {
        int n = 11;
        int minInv = 43;
        String minStr = "hejgb";
        assertEquals("hejgikfdcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case86() {
        int n = 15;
        int minInv = 22;
        String minStr = "glmc";
        assertEquals("glmcabdefhijkno", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case87() {
        int n = 4;
        int minInv = 3;
        String minStr = "adcb";
        assertEquals("adcb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case88() {
        int n = 20;
        int minInv = 41;
        String minStr = "cardgepnlbhsfk";
        assertEquals("cardgepnlbhsfkijmoqt", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case89() {
        int n = 15;
        int minInv = 70;
        String minStr = "onfmcj";
        assertEquals("onfmcjabhlkiged", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case90() {
        int n = 9;
        int minInv = 29;
        String minStr = "fadg";
        assertEquals("fdihgecba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case91() {
        int n = 9;
        int minInv = 5;
        String minStr = "igehacbd";
        assertEquals("igehacbdf", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case92() {
        int n = 10;
        int minInv = 37;
        String minStr = "cjfbegad";
        assertEquals("cjhigfedba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case93() {
        int n = 13;
        int minInv = 40;
        String minStr = "cbfmkjadielh";
        assertEquals("cbfmkjaglihed", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case94() {
        int n = 13;
        int minInv = 29;
        String minStr = "fmcbkaigjeld";
        assertEquals("fmcbkaigjeldh", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case95() {
        int n = 19;
        int minInv = 134;
        String minStr = "fshkpinjemqdoblagr";
        assertEquals("fshkplrqonmjigedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case96() {
        int n = 15;
        int minInv = 0;
        String minStr = "e";
        assertEquals("eabcdfghijklmno", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case97() {
        int n = 7;
        int minInv = 20;
        String minStr = "d";
        assertEquals("fgedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case98() {
        int n = 18;
        int minInv = 48;
        String minStr = "nbchflikdr";
        assertEquals("nbchflikdraegjmopq", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case99() {
        int n = 9;
        int minInv = 20;
        String minStr = "fcdebiha";
        assertEquals("fcdehigba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case100() {
        int n = 6;
        int minInv = 2;
        String minStr = "bfad";
        assertEquals("bfadce", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case101() {
        int n = 9;
        int minInv = 19;
        String minStr = "ecah";
        assertEquals("ecahgifdb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case102() {
        int n = 12;
        int minInv = 41;
        String minStr = "hbgdj";
        assertEquals("hbgdjlkifeca", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case103() {
        int n = 12;
        int minInv = 38;
        String minStr = "a";
        assertEquals("abelkjihgfdc", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case104() {
        int n = 20;
        int minInv = 148;
        String minStr = "ogrhsf";
        assertEquals("ogrhsfntqpmlkjiedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case105() {
        int n = 12;
        int minInv = 29;
        String minStr = "gkc";
        assertEquals("gkcabdhljife", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case106() {
        int n = 18;
        int minInv = 19;
        String minStr = "eqncbkoflrhjma";
        assertEquals("eqncbkoflrhjmadgip", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case107() {
        int n = 15;
        int minInv = 82;
        String minStr = "ne";
        assertEquals("neamolkjihgfdcb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case108() {
        int n = 9;
        int minInv = 1;
        String minStr = "cahfgbei";
        assertEquals("cahfgbeid", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case109() {
        int n = 15;
        int minInv = 61;
        String minStr = "jmkhnd";
        assertEquals("jmkhndabciolgfe", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case110() {
        int n = 20;
        int minInv = 17;
        String minStr = "cijnsqbephkatfdroglm";
        assertEquals("cijnsqbephkatfdroglm", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case111() {
        int n = 20;
        int minInv = 79;
        String minStr = "phjn";
        assertEquals("phjnabcdefktsrqomlig", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case112() {
        int n = 20;
        int minInv = 5;
        String minStr = "bedo";
        assertEquals("bedoacfghijklmnpqrst", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case113() {
        int n = 20;
        int minInv = 189;
        String minStr = "mikjardhcnltfqo";
        assertEquals("strqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case114() {
        int n = 20;
        int minInv = 0;
        String minStr = "eljtohsbkfid";
        assertEquals("eljtohsbkfidacgmnpqr", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case115() {
        int n = 20;
        int minInv = 190;
        String minStr = "mj";
        assertEquals("tsrqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case116() {
        int n = 20;
        int minInv = 156;
        String minStr = "pfjmqkdarlegthscobin";
        assertEquals("pfjmrtsqonlkihgedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case117() {
        int n = 20;
        int minInv = 30;
        String minStr = "mnglorcifpbethjkdqas";
        assertEquals("mnglorcifpbethjkdqas", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case118() {
        int n = 20;
        int minInv = 93;
        String minStr = "r";
        assertEquals("rabcdefqtsponmlkjihg", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case119() {
        int n = 20;
        int minInv = 0;
        String minStr = "q";
        assertEquals("qabcdefghijklmnoprst", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case120() {
        int n = 20;
        int minInv = 0;
        String minStr = "mq";
        assertEquals("mqabcdefghijklnoprst", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case121() {
        int n = 20;
        int minInv = 184;
        String minStr = "filhtmkeajpobqdscgrn";
        assertEquals("ntsrqpomlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case122() {
        int n = 20;
        int minInv = 187;
        String minStr = "c";
        assertEquals("qtsrponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case123() {
        int n = 20;
        int minInv = 1;
        String minStr = "jicndftlobmhqapgsrke";
        assertEquals("jicndftlobmhqapgsrke", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case124() {
        int n = 20;
        int minInv = 187;
        String minStr = "jasghodbcmreqflin";
        assertEquals("qtsrponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case125() {
        int n = 20;
        int minInv = 188;
        String minStr = "gnha";
        assertEquals("rtsqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case126() {
        int n = 20;
        int minInv = 188;
        String minStr = "ckamtdrfblhqnipeojgs";
        assertEquals("rtsqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case127() {
        int n = 20;
        int minInv = 84;
        String minStr = "k";
        assertEquals("kabcdefptsrqonmljihg", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case128() {
        int n = 20;
        int minInv = 0;
        String minStr = "itfhaqsbodlkjn";
        assertEquals("itfhaqsbodlkjncegmpr", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case129() {
        int n = 20;
        int minInv = 185;
        String minStr = "kcplegqo";
        assertEquals("otsrqpnmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case130() {
        int n = 20;
        int minInv = 0;
        String minStr = "rnsdjfibgclphemqaok";
        assertEquals("rnsdjfibgclphemqaokt", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case131() {
        int n = 20;
        int minInv = 6;
        String minStr = "c";
        assertEquals("cabdefghijklmnoprtsq", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case132() {
        int n = 20;
        int minInv = 173;
        String minStr = "oncijgrmhakbedts";
        assertEquals("onktsrqpmljihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case133() {
        int n = 20;
        int minInv = 3;
        String minStr = "qrslchogjbdnetfkaim";
        assertEquals("qrslchogjbdnetfkaimp", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case134() {
        int n = 20;
        int minInv = 62;
        String minStr = "agb";
        assertEquals("agbcdefhktsrqponmlji", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case135() {
        int n = 20;
        int minInv = 5;
        String minStr = "bkodjecamhqgrtfnpis";
        assertEquals("bkodjecamhqgrtfnpisl", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case136() {
        int n = 20;
        int minInv = 79;
        String minStr = "rhdictqojapmkl";
        assertEquals("rhdictqojapmklbefgns", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case137() {
        int n = 20;
        int minInv = 180;
        String minStr = "aomtgrknslecfibqjdhp";
        assertEquals("jtsrqponmlkihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case138() {
        int n = 20;
        int minInv = 42;
        String minStr = "ih";
        assertEquals("ihabcdefgjklstrqponm", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case139() {
        int n = 20;
        int minInv = 190;
        String minStr = "nbdqchgltakjipemfr";
        assertEquals("tsrqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case140() {
        int n = 20;
        int minInv = 189;
        String minStr = "scgkbqnejptfldrmhi";
        assertEquals("strqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case141() {
        int n = 20;
        int minInv = 175;
        String minStr = "sjcnitagrqfkbelphmd";
        assertEquals("sjntrqpomlkihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case142() {
        int n = 20;
        int minInv = 8;
        String minStr = "jcibomhegpd";
        assertEquals("jcibomhegpdafklnqrst", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case143() {
        int n = 20;
        int minInv = 185;
        String minStr = "trc";
        assertEquals("trnsqpomlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case144() {
        int n = 20;
        int minInv = 190;
        String minStr = "dp";
        assertEquals("tsrqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case145() {
        int n = 20;
        int minInv = 141;
        String minStr = "jd";
        assertEquals("jdamtsrqponlkihgfecb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case146() {
        int n = 20;
        int minInv = 1;
        String minStr = "ltgskpobhmfd";
        assertEquals("ltgskpobhmfdaceijnqr", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case147() {
        int n = 20;
        int minInv = 179;
        String minStr = "hkmldcgfpiobt";
        assertEquals("itsrqponmlkjhgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case148() {
        int n = 20;
        int minInv = 1;
        String minStr = "stmopcl";
        assertEquals("stmopclabdefghijknqr", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case149() {
        int n = 20;
        int minInv = 2;
        String minStr = "idctqmfonbkjresp";
        assertEquals("idctqmfonbkjrespaghl", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case150() {
        int n = 20;
        int minInv = 0;
        String minStr = "fjpmldbcniqshkgoear";
        assertEquals("fjpmldbcniqshkgoeart", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case151() {
        int n = 20;
        int minInv = 5;
        String minStr = "lcoerk";
        assertEquals("lcoerkabdfghijmnpqst", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case152() {
        int n = 20;
        int minInv = 187;
        String minStr = "tdjsingplohmea";
        assertEquals("tpsrqonmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case153() {
        int n = 20;
        int minInv = 188;
        String minStr = "fsheicnod";
        assertEquals("rtsqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case154() {
        int n = 20;
        int minInv = 0;
        String minStr = "tgm";
        assertEquals("tgmabcdefhijklnopqrs", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case155() {
        int n = 20;
        int minInv = 150;
        String minStr = "brsmfhjkg";
        assertEquals("brsmfotqpnlkjihgedca", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case156() {
        int n = 20;
        int minInv = 1;
        String minStr = "dnarhjlm";
        assertEquals("dnarhjlmbcefgikopqst", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case157() {
        int n = 20;
        int minInv = 190;
        String minStr = "dcaqkr";
        assertEquals("tsrqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case158() {
        int n = 20;
        int minInv = 7;
        String minStr = "p";
        assertEquals("pabcdefghijklmnoqrst", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case159() {
        int n = 20;
        int minInv = 187;
        String minStr = "klgrcpjobnmqdea";
        assertEquals("qtsrponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case160() {
        int n = 20;
        int minInv = 185;
        String minStr = "ajsdflk";
        assertEquals("otsrqpnmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case161() {
        int n = 20;
        int minInv = 123;
        String minStr = "k";
        assertEquals("kabcmtsrqponljihgfed", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case162() {
        int n = 20;
        int minInv = 190;
        String minStr = "a";
        assertEquals("tsrqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case163() {
        int n = 20;
        int minInv = 70;
        String minStr = "abdej";
        assertEquals("abdejcfgqtsrponmlkih", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case164() {
        int n = 20;
        int minInv = 100;
        String minStr = "a";
        assertEquals("abcdeotsrqpnmlkjihgf", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case165() {
        int n = 20;
        int minInv = 20;
        String minStr = "a";
        assertEquals("abcdefghijklmstrqpon", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case166() {
        int n = 11;
        int minInv = 55;
        String minStr = "kjihgfedcba";
        assertEquals("kjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case167() {
        int n = 20;
        int minInv = 130;
        String minStr = "a";
        assertEquals("abcntsrqpomlkjihgfed", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case168() {
        int n = 20;
        int minInv = 31;
        String minStr = "abcdqefghijklmnop";
        assertEquals("abcdqefghijklrtsponm", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case169() {
        int n = 12;
        int minInv = 56;
        String minStr = "debgikjfcl";
        assertEquals("djlkihgfecba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case170() {
        int n = 20;
        int minInv = 34;
        String minStr = "abcdefghi";
        assertEquals("abcdefghijkrtsqponml", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case171() {
        int n = 20;
        int minInv = 180;
        String minStr = "abcdmnopqrstefghijkl";
        assertEquals("jtsrqponmlkihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case172() {
        int n = 20;
        int minInv = 176;
        String minStr = "tip";
        assertEquals("tiprsqonmlkjhgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case173() {
        int n = 20;
        int minInv = 179;
        String minStr = "mbjcalhtepsfonkqgdir";
        assertEquals("mptsrqonlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case174() {
        int n = 20;
        int minInv = 190;
        String minStr = "abcdefghijklmnopqrst";
        assertEquals("tsrqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case175() {
        int n = 20;
        int minInv = 150;
        String minStr = "abcdefghijklmnopqrst";
        assertEquals("abqtsrponmlkjihgfedc", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case176() {
        int n = 20;
        int minInv = 100;
        String minStr = "dcaefog";
        assertEquals("dcaefoltsrqpnmkjihgb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case177() {
        int n = 20;
        int minInv = 100;
        String minStr = "abcdefg";
        assertEquals("abcdeotsrqpnmlkjihgf", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case178() {
        int n = 20;
        int minInv = 130;
        String minStr = "tqcd";
        assertEquals("tqcdabsrponmlkjihgfe", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case179() {
        int n = 20;
        int minInv = 171;
        String minStr = "a";
        assertEquals("atsrqponmlkjihgfedcb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case180() {
        int n = 20;
        int minInv = 190;
        String minStr = "abcdehjkmnpoqrstf";
        assertEquals("tsrqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case181() {
        int n = 15;
        int minInv = 0;
        String minStr = "abcdefghijklmno";
        assertEquals("abcdefghijklmno", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case182() {
        int n = 20;
        int minInv = 189;
        String minStr = "onm";
        assertEquals("strqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case183() {
        int n = 20;
        int minInv = 3;
        String minStr = "a";
        assertEquals("abcdefghijklmnopqtsr", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case184() {
        int n = 20;
        int minInv = 190;
        String minStr = "s";
        assertEquals("tsrqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case185() {
        int n = 20;
        int minInv = 190;
        String minStr = "tsrqponmlkjihgfedcba";
        assertEquals("tsrqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case186() {
        int n = 5;
        int minInv = 3;
        String minStr = "abdec";
        assertEquals("abedc", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case187() {
        int n = 19;
        int minInv = 20;
        String minStr = "fcdebihamnk";
        assertEquals("fcdebihamnkgjlopqrs", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case188() {
        int n = 20;
        int minInv = 90;
        String minStr = "a";
        assertEquals("abcdefstrqponmlkjihg", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case189() {
        int n = 20;
        int minInv = 95;
        String minStr = "a";
        assertEquals("abcdejtsrqponmlkihgf", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case190() {
        int n = 20;
        int minInv = 190;
        String minStr = "bacdefghijklmnopqrst";
        assertEquals("tsrqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case191() {
        int n = 4;
        int minInv = 3;
        String minStr = "abcd";
        assertEquals("adcb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case192() {
        int n = 3;
        int minInv = 0;
        String minStr = "abc";
        assertEquals("abc", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case193() {
        int n = 20;
        int minInv = 50;
        String minStr = "a";
        assertEquals("abcdefghiotsrqpnmlkj", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case194() {
        int n = 20;
        int minInv = 190;
        String minStr = "abcdefghijklmnop";
        assertEquals("tsrqponmlkjihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case195() {
        int n = 3;
        int minInv = 1;
        String minStr = "bac";
        assertEquals("bac", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case196() {
        int n = 15;
        int minInv = 88;
        String minStr = "nbcdefghklmo";
        assertEquals("nbjomlkihgfedca", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case197() {
        int n = 19;
        int minInv = 20;
        String minStr = "fcdebiha";
        assertEquals("fcdebihagjklmnopsrq", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case198() {
        int n = 4;
        int minInv = 3;
        String minStr = "a";
        assertEquals("adcb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case199() {
        int n = 9;
        int minInv = 10;
        String minStr = "fcdebiha";
        assertEquals("fcdebihag", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case200() {
        int n = 16;
        int minInv = 50;
        String minStr = "ib";
        assertEquals("ibacdelponmkjhgf", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case201() {
        int n = 6;
        int minInv = 8;
        String minStr = "a";
        assertEquals("adfecb", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case202() {
        int n = 19;
        int minInv = 151;
        String minStr = "b";
        assertEquals("bpsrqonmlkjihgfedca", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case203() {
        int n = 20;
        int minInv = 66;
        String minStr = "abcdefghijklmnopqrst";
        assertEquals("abcdefghtsrqponmlkji", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case204() {
        int n = 20;
        int minInv = 171;
        String minStr = "bacdefghijklmnopqrst";
        assertEquals("bstrqponmlkjihgfedca", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case205() {
        int n = 20;
        int minInv = 180;
        String minStr = "a";
        assertEquals("jtsrqponmlkihgfedcba", striirec.recovstr(n, minInv, minStr));
    }

    @Test
    public void case206() {
        int n = 20;
        int minInv = 129;
        String minStr = "a";
        assertEquals("abcmtsrqponlkjihgfed", striirec.recovstr(n, minInv, minStr));
    }

}
