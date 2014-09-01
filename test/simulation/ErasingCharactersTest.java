package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class ErasingCharactersTest {
    ErasingCharacters erasingcharacters = new ErasingCharacters();

    @Test
    public void case1() {
        String s = "cieeilll";
        assertEquals("cl", erasingcharacters.simulate(s));
    }

    @Test
    public void case2() {
        String s = "topcoder";
        assertEquals("topcoder", erasingcharacters.simulate(s));
    }

    @Test
    public void case3() {
        String s = "abcdefghijklmnopqrstuvwxyyxwvutsrqponmlkjihgfedcba";
        assertEquals("", erasingcharacters.simulate(s));
    }

    @Test
    public void case4() {
        String s = "bacaabaccbaaccabbcabbacabcbba";
        assertEquals("bacbaca", erasingcharacters.simulate(s));
    }

    @Test
    public void case5() {
        String s = "eel";
        assertEquals("l", erasingcharacters.simulate(s));
    }

    @Test
    public void case6() {
        String s = "phhzonmhoiicmiopdhaopzqochdzpdocomhayiaiaymynpoyoq";
        assertEquals("pzonmhocmiopdhaopzqochdzpdocomhayiaiaymynpoyoq", erasingcharacters.simulate(s));
    }

    @Test
    public void case7() {
        String s = "lumrnjcwxeqpftdkeaoirxxnjamvgiknvipjgryfzdaoljqlic";
        assertEquals("lumrnjcwxeqpftdkeaoirnjamvgiknvipjgryfzdaoljqlic", erasingcharacters.simulate(s));
    }

    @Test
    public void case8() {
        String s = "bottwzhnwytoyubnbotwuztoutotttzyuuzohnzuolbtbbollt";
        assertEquals("bowzhnwytoyubnbotwuztoutotzyzohnzuolbtot", erasingcharacters.simulate(s));
    }

    @Test
    public void case9() {
        String s = "pfcfiitmjvijcswwyvplathfzzrrvrxrysnrcqklpmmekjkpcy";
        assertEquals("pfcftmjvijcsyvplathfvrxrysnrcqklpekjkpcy", erasingcharacters.simulate(s));
    }

    @Test
    public void case10() {
        String s = "rddrdssrrrrdddxrsxsrddrrrrrdrsxrxrrsdxrxssrsrxsdsx";
        assertEquals("xrsxsdrsxrxsdxrxrsrxsdsx", erasingcharacters.simulate(s));
    }

    @Test
    public void case11() {
        String s = "vppbpvpbdbbbdvvvpbvpbbvvvbppppbpbvbbvvppppbbbpdpbd";
        assertEquals("vbpvpbdbdvpbvpvpbvbpdpbd", erasingcharacters.simulate(s));
    }

    @Test
    public void case12() {
        String s = "ugzchppfhucfxafcfucjhggjgjgpzzhfzgafxhhhczgxhhgjha";
        assertEquals("ugzchfhucfxafcfucjhjgjgphfzgafxhczgxgjha", erasingcharacters.simulate(s));
    }

    @Test
    public void case13() {
        String s = "rurcmcdsmrcdddscmsrucsduscuudrmdrusucsmmdccdusdsms";
        assertEquals("rurcmcdsmrcdscmsrucsduscdrmdrusucsusdsms", erasingcharacters.simulate(s));
    }

    @Test
    public void case14() {
        String s = "odgywouyodwjyfdoyiyugfhjdguufgionecfghcgiynhydjyyw";
        assertEquals("odgywouyodwjyfdoyiyugfhjdgfgionecfghcgiynhydjw", erasingcharacters.simulate(s));
    }

    @Test
    public void case15() {
        String s = "cpaafwuhqurhuarbufaxxonuxwucoxcxfqxqrpxxxfcbcfawqo";
        assertEquals("cpfwuhqurhuarbufaonuxwucoxcxfqxqrpxfcbcfawqo", erasingcharacters.simulate(s));
    }

    @Test
    public void case16() {
        String s = "wlbksnjktm";
        assertEquals("wlbksnjktm", erasingcharacters.simulate(s));
    }

    @Test
    public void case17() {
        String s = "mmrwscgyyeho";
        assertEquals("rwscgeho", erasingcharacters.simulate(s));
    }

    @Test
    public void case18() {
        String s = "difddididfdiiidddfififidi";
        assertEquals("difididfdidfififidi", erasingcharacters.simulate(s));
    }

    @Test
    public void case19() {
        String s = "wksoaxbkshobugyzsbwl";
        assertEquals("wksoaxbkshobugyzsbwl", erasingcharacters.simulate(s));
    }

    @Test
    public void case20() {
        String s = "jwygypu";
        assertEquals("jwygypu", erasingcharacters.simulate(s));
    }

    @Test
    public void case21() {
        String s = "baiucuqjrzbqtjdzadubbdzuaridajburbbczjztjzqa";
        assertEquals("baiucuqjrzbqtjdzadudzuaridajburczjztjzqa", erasingcharacters.simulate(s));
    }

    @Test
    public void case22() {
        String s = "eeeeeeeeeeeeeeeeeeeee";
        assertEquals("e", erasingcharacters.simulate(s));
    }

    @Test
    public void case23() {
        String s = "esinghaaggn";
        assertEquals("esinghn", erasingcharacters.simulate(s));
    }

    @Test
    public void case24() {
        String s = "lsjnjdpcdptkclzbst";
        assertEquals("lsjnjdpcdptkclzbst", erasingcharacters.simulate(s));
    }

    @Test
    public void case25() {
        String s = "wwvovvoxwwowxxvoxovoxvovvxxxooxvwoowwxvxowooxovvoo";
        assertEquals("vxowvoxovoxvovwxvxowxo", erasingcharacters.simulate(s));
    }

    @Test
    public void case26() {
        String s = "cccccccccccccccccccccccccccccccccccccccccccccccccc";
        assertEquals("", erasingcharacters.simulate(s));
    }

    @Test
    public void case27() {
        String s = "b";
        assertEquals("b", erasingcharacters.simulate(s));
    }

    @Test
    public void case28() {
        String s = "abcca";
        assertEquals("aba", erasingcharacters.simulate(s));
    }

    @Test
    public void case29() {
        String s = "aba";
        assertEquals("aba", erasingcharacters.simulate(s));
    }

    @Test
    public void case30() {
        String s = "all";
        assertEquals("a", erasingcharacters.simulate(s));
    }

    @Test
    public void case31() {
        String s = "aaaa";
        assertEquals("", erasingcharacters.simulate(s));
    }

    @Test
    public void case32() {
        String s = "caacb";
        assertEquals("b", erasingcharacters.simulate(s));
    }

    @Test
    public void case33() {
        String s = "aaaab";
        assertEquals("b", erasingcharacters.simulate(s));
    }

}
