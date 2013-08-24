package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class NewArenaPasswordTest {
    NewArenaPassword newarenapassword = new NewArenaPassword();

    @Test
    public void case1() {
        String oldPassword = "topcoderopen";
        int K = 5;
        assertEquals(3, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case2() {
        String oldPassword = "puyopuyo";
        int K = 4;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case3() {
        String oldPassword = "loool";
        int K = 3;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case4() {
        String oldPassword = "arena";
        int K = 5;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case5() {
        String oldPassword = "amavckdkz";
        int K = 7;
        assertEquals(5, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case6() {
        String oldPassword = "a";
        int K = 1;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case7() {
        String oldPassword = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx";
        int K = 25;
        assertEquals(25, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case8() {
        String oldPassword = "dddddddddd";
        int K = 10;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case9() {
        String oldPassword = "pppppppppppppppppppppppppppppppppppppppppppppppppp";
        int K = 20;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case10() {
        String oldPassword = "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
        int K = 40;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case11() {
        String oldPassword = "gggggggggggggggggggggggggggggggggggggggggggggggggg";
        int K = 49;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case12() {
        String oldPassword = "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq";
        int K = 50;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case13() {
        String oldPassword = "ppppppbppppppppppcpvpppppempppeppipppsppxpvppcpppb";
        int K = 40;
        assertEquals(12, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case14() {
        String oldPassword = "exixxxxxxxfxxxxmaxxjoxxixxtukikxohxjdaxxkxxxaxxyxx";
        int K = 25;
        assertEquals(17, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case15() {
        String oldPassword = "bbbbbbtbbbibbbbibbbbbdebbbmbabbbbbbbbbbbbbbsbbbbbq";
        int K = 26;
        assertEquals(9, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case16() {
        String oldPassword = "qqrhqkvrdjqbqlgupp";
        int K = 13;
        assertEquals(11, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case17() {
        String oldPassword = "amsap";
        int K = 4;
        assertEquals(3, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case18() {
        String oldPassword = "m";
        int K = 1;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case19() {
        String oldPassword = "y";
        int K = 1;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case20() {
        String oldPassword = "zznzwnzwzotyvazzfvizwszfxzrfv";
        int K = 1;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case21() {
        String oldPassword = "sxggihreglrprrccrthrajejrprrirxesinrwmrrkprhrraqrp";
        int K = 27;
        assertEquals(23, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case22() {
        String oldPassword = "ogjv";
        int K = 1;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case23() {
        String oldPassword = "panyapppppwnrppqjvjjneseppvptppipppmbkwdpjpspj";
        int K = 40;
        assertEquals(27, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case24() {
        String oldPassword = "wzvqoouzuuuulpkutduzyaqcbucvutzujizuuuxmkouujueqek";
        int K = 3;
        assertEquals(3, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case25() {
        String oldPassword = "clzlyhsolltlzsd";
        int K = 4;
        assertEquals(4, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case26() {
        String oldPassword = "ieahdbcjfg";
        int K = 10;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case27() {
        String oldPassword = "hiednovaxtmckzwromadgxgfqlukhlbpvqfbsyrwectijunsjp";
        int K = 20;
        assertEquals(19, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case28() {
        String oldPassword = "xbsezqhpsfogltcigaujbwxuaflywjdtvpmcvrrkqmdoknnihe";
        int K = 40;
        assertEquals(39, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case29() {
        String oldPassword = "xebopvfjkticldrgslnhfqozgtunvrxicmjaesduwymqbphwka";
        int K = 49;
        assertEquals(48, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case30() {
        String oldPassword = "rzqglrxwqieuajpnfatvsgouckxvphftscwblmdmhiknebdoyj";
        int K = 50;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case31() {
        String oldPassword = "bjooeojevfoyvbhpfkxpcqtdnsswdilsvddaxaudgsmtiqrcuk";
        int K = 40;
        assertEquals(36, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case32() {
        String oldPassword = "fpqyvjmntcehloovjujrdxodqthsgawlpzjtkavwsqnrdvkzbb";
        int K = 25;
        assertEquals(25, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case33() {
        String oldPassword = "kmucdqlvvsynnmxtwebqabvfhkguolwaeghoopnjdjairspzck";
        int K = 26;
        assertEquals(25, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case34() {
        String oldPassword = "bedsz";
        int K = 1;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case35() {
        String oldPassword = "glybaleynedaeojalbxyzmdyoj";
        int K = 12;
        assertEquals(11, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case36() {
        String oldPassword = "ojuuykqyhuonhtntbzohodacppnts";
        int K = 1;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case37() {
        String oldPassword = "ltnuokgdfcsarpprevefatxppwliuhqzhsb";
        int K = 13;
        assertEquals(13, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case38() {
        String oldPassword = "pctvjpjadiloocggoefdehiflwmmaydhb";
        int K = 2;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case39() {
        String oldPassword = "unkeiuvtdytbkotejcj";
        int K = 10;
        assertEquals(10, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case40() {
        String oldPassword = "crgfpbe";
        int K = 1;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case41() {
        String oldPassword = "kfqeywktcqmixbddwdlihxhaatuenq";
        int K = 8;
        assertEquals(8, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case42() {
        String oldPassword = "y";
        int K = 1;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case43() {
        String oldPassword = "nsdzqogumtcupzpskbhsokzwoseafxn";
        int K = 15;
        assertEquals(15, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case44() {
        String oldPassword = "aa";
        int K = 1;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case45() {
        String oldPassword = "ab";
        int K = 1;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case46() {
        String oldPassword = "aa";
        int K = 2;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case47() {
        String oldPassword = "ab";
        int K = 2;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case48() {
        String oldPassword = "aba";
        int K = 2;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case49() {
        String oldPassword = "abab";
        int K = 3;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case50() {
        String oldPassword = "aabb";
        int K = 4;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case51() {
        String oldPassword = "aabb";
        int K = 3;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case52() {
        String oldPassword = "aacbbbcca";
        int K = 3;
        assertEquals(3, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case53() {
        String oldPassword = "aacbbbaaa";
        int K = 3;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case54() {
        String oldPassword = "aaabbbcaa";
        int K = 3;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case55() {
        String oldPassword = "aaabbbccc";
        int K = 3;
        assertEquals(3, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case56() {
        String oldPassword = "pjeahomjpgeoscahcmnwknkhaqsyytspewpmn";
        int K = 36;
        assertEquals(33, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case57() {
        String oldPassword = "bvffvmijbgvoscpivpiqixvgnjvtgadhv";
        int K = 29;
        assertEquals(25, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case58() {
        String oldPassword = "x";
        int K = 1;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case59() {
        String oldPassword = "qxchizwqpgqmnfxkydkdnhoccmzimejcbn";
        int K = 32;
        assertEquals(30, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case60() {
        String oldPassword = "ccosqdxopxrcaejoindhvpnhtpue";
        int K = 27;
        assertEquals(25, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case61() {
        String oldPassword = "l";
        int K = 1;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case62() {
        String oldPassword = "gvrwsjytpjjyzmhwdvdymycohqtstpvclnyd";
        int K = 33;
        assertEquals(30, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case63() {
        String oldPassword = "njiniwxfauiaiidwpvphqhdsuqszqsydcitkgsrimajwims";
        int K = 45;
        assertEquals(39, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case64() {
        String oldPassword = "ztmunemmufkajuttbnnjznsvxgpxrbfrutnhyzusggsp";
        int K = 44;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case65() {
        String oldPassword = "aynzngwmookgprzkkmr";
        int K = 15;
        assertEquals(15, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case66() {
        String oldPassword = "uutjvhwzjumljuhw";
        int K = 13;
        assertEquals(10, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case67() {
        String oldPassword = "nzqzlcswpgxjasvxbrylokyxhftsfdjscztqblmq";
        int K = 37;
        assertEquals(33, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case68() {
        String oldPassword = "fxqjoowcbucibx";
        int K = 1;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case69() {
        String oldPassword = "lafktvnfjfyuhsagklvzhz";
        int K = 21;
        assertEquals(19, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case70() {
        String oldPassword = "ebolczlhlhfyoofmjpglvrwssfsuivimw";
        int K = 29;
        assertEquals(27, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case71() {
        String oldPassword = "liiupiidnwoefzawxsqemmmkuzisyjpltxfi";
        int K = 33;
        assertEquals(28, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case72() {
        String oldPassword = "ocbtddrbxhfktuwptehtpwfkvmseeiask";
        int K = 31;
        assertEquals(29, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case73() {
        String oldPassword = "eqenyqgsmxlsegi";
        int K = 13;
        assertEquals(10, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case74() {
        String oldPassword = "cndgxfahhnwptntgljodxlqqryavmuuqjzwgeypn";
        int K = 10;
        assertEquals(9, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case75() {
        String oldPassword = "gbwmmiarfnjxejzzvuvlfujmahboup";
        int K = 2;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case76() {
        String oldPassword = "poezoxhbighsginadbfzmta";
        int K = 23;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case77() {
        String oldPassword = "mjtfajjayhjbp";
        int K = 11;
        assertEquals(9, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case78() {
        String oldPassword = "txxzafymyaixqbkbwpcfaedhnhzcsianhxmhenud";
        int K = 40;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case79() {
        String oldPassword = "gfmjbdlhe";
        int K = 5;
        assertEquals(5, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case80() {
        String oldPassword = "cvohpxhdggpolckqsosawhjzkvgokvcpqqygphlwpamcdw";
        int K = 46;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case81() {
        String oldPassword = "vkugkgbsvopzfgrdohmzfbbrggpaddnaojhyqisn";
        int K = 5;
        assertEquals(5, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case82() {
        String oldPassword = "dqfigouhtyimgpbgsfwtvfavxinmhxamn";
        int K = 31;
        assertEquals(28, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case83() {
        String oldPassword = "raorlcxaeeslanghnbhyq";
        int K = 20;
        assertEquals(18, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case84() {
        String oldPassword = "tdcqxwizmzkpxkvdfgfuomirt";
        int K = 23;
        assertEquals(21, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case85() {
        String oldPassword = "xlkbnd";
        int K = 6;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case86() {
        String oldPassword = "ymkplwkodsvyiiizdqiujgfvjsyj";
        int K = 28;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case87() {
        String oldPassword = "yuvjtfawzvwhfei";
        int K = 12;
        assertEquals(11, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case88() {
        String oldPassword = "f";
        int K = 1;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case89() {
        String oldPassword = "bhfzsjldplzkwsrwrqunzbshmoaswyfxikyawlflwfwtznrq";
        int K = 46;
        assertEquals(40, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case90() {
        String oldPassword = "pypbopvkpcjznkajxhwuospogigowkvl";
        int K = 9;
        assertEquals(8, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case91() {
        String oldPassword = "bbmltoxsbjumgcjcqdr";
        int K = 15;
        assertEquals(14, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case92() {
        String oldPassword = "zyzvlkhbllpyeexyhgtwnxfppijyullvlkqywabjlrkrvh";
        int K = 4;
        assertEquals(4, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case93() {
        String oldPassword = "kadjfubqdzmqkhdwadvafenwqgtyxxokyttfnwvtv";
        int K = 38;
        assertEquals(32, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case94() {
        String oldPassword = "pgtsbvzhivyooynooxmhttwprr";
        int K = 14;
        assertEquals(13, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case95() {
        String oldPassword = "wtucmodhqnrllhclvszseinzgfqasrfombrzrwihlavwhx";
        int K = 20;
        assertEquals(16, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case96() {
        String oldPassword = "ixvsmwbrnblggashtryrcidcdblalq";
        int K = 27;
        assertEquals(24, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case97() {
        String oldPassword = "qbkrvzugfaiyjdrjxtrcxudjwqbpoqdetqxoprxvthv";
        int K = 42;
        assertEquals(39, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case98() {
        String oldPassword = "ig";
        int K = 2;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case99() {
        String oldPassword = "zpowiplwfrcbjbpyuovnwqrjdctlhfqjwffeus";
        int K = 11;
        assertEquals(11, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case100() {
        String oldPassword = "gd";
        int K = 2;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case101() {
        String oldPassword = "blqqhhhqmmlxtqpemulrrg";
        int K = 20;
        assertEquals(17, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case102() {
        String oldPassword = "ymjuhnfzdmgne";
        int K = 12;
        assertEquals(11, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case103() {
        String oldPassword = "uhjzudknuqipkknywkhlpgqepdijeadzhmadrkqm";
        int K = 37;
        assertEquals(34, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case104() {
        String oldPassword = "ltnjduwsanwpshbxhewqswujikxnlbczupkxlhpouodmvgjcmh";
        int K = 1;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case105() {
        String oldPassword = "ooozlbmmeliv";
        int K = 9;
        assertEquals(9, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case106() {
        String oldPassword = "xvznanijzmvggamvoawbbiqhwyfugmbf";
        int K = 22;
        assertEquals(20, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case107() {
        String oldPassword = "lpauqoqxwsltglpjoazwyydugpvlaxdlofiftaeps";
        int K = 38;
        assertEquals(34, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case108() {
        String oldPassword = "ajqcloajrurirckqfyfkgmfgswajhalij";
        int K = 31;
        assertEquals(27, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case109() {
        String oldPassword = "snfljwwbagtfeyrmmwugt";
        int K = 19;
        assertEquals(17, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case110() {
        String oldPassword = "a";
        int K = 1;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case111() {
        String oldPassword = "xaykijvgfyhosossghfeblzwbcqdoyjlzhxjttparyoln";
        int K = 42;
        assertEquals(38, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case112() {
        String oldPassword = "qjzrwznzbgdpemdfwaqpvipp";
        int K = 3;
        assertEquals(3, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case113() {
        String oldPassword = "vneqdpqwormnuusjahogdryumgj";
        int K = 27;
        assertEquals(0, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case114() {
        String oldPassword = "kekbjctgqksfemypmheumxtglbrpshvdnhgxlbdblxj";
        int K = 42;
        assertEquals(39, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case115() {
        String oldPassword = "xqmucjnkvqbmjkjoyqwxcxafi";
        int K = 19;
        assertEquals(18, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case116() {
        String oldPassword = "abababcbc";
        int K = 7;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case117() {
        String oldPassword = "cbba";
        int K = 3;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case118() {
        String oldPassword = "abcdffg";
        int K = 6;
        assertEquals(5, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case119() {
        String oldPassword = "aabbccaa";
        int K = 6;
        assertEquals(4, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case120() {
        String oldPassword = "qkjwqkjwjwjwjjwjwjjwjwjwjwjwjwjwjwqkjwjwjwqkjwjwjw";
        int K = 49;
        assertEquals(28, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case121() {
        String oldPassword = "abdfacdfbcefbcegbbeg";
        int K = 16;
        assertEquals(8, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case122() {
        String oldPassword = "abababccabcccb";
        int K = 13;
        assertEquals(9, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case123() {
        String oldPassword = "dcdaaccaacbbcbbaccacdcbc";
        int K = 23;
        assertEquals(14, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case124() {
        String oldPassword = "dzsaqweasdafasdasdafasdasdasdzasqzasfasqweashtrasr";
        int K = 49;
        assertEquals(36, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case125() {
        String oldPassword = "bcacacacbc";
        int K = 8;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case126() {
        String oldPassword = "jzpzsgnspqxwjgjxiuyljxyzmaufsuwqrheqerczugavrbnjfd";
        int K = 34;
        assertEquals(33, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case127() {
        String oldPassword = "aaaaaababab";
        int K = 9;
        assertEquals(3, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case128() {
        String oldPassword = "cdad";
        int K = 3;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case129() {
        String oldPassword = "aaaaabbbbbbb";
        int K = 11;
        assertEquals(5, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case130() {
        String oldPassword = "cabcccabcbcddadabdbbcaccacabcbcabadbacacacbcbccaca";
        int K = 39;
        assertEquals(25, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case131() {
        String oldPassword = "abbbbabbb";
        int K = 8;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case132() {
        String oldPassword = "amavckckc";
        int K = 7;
        assertEquals(4, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case133() {
        String oldPassword = "bacaabbabcccbccbaaabbbccbbcacbcababac";
        int K = 35;
        assertEquals(21, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case134() {
        String oldPassword = "abcdefghijklmnopqrstuvwxybcdefghijklmnopqrstuvwxyz";
        int K = 29;
        assertEquals(29, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case135() {
        String oldPassword = "ddaa";
        int K = 3;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case136() {
        String oldPassword = "yeykeqbkzhenafzcivuabcbndzvsfhykyctwjkwnaegzsaiykh";
        int K = 39;
        assertEquals(36, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case137() {
        String oldPassword = "abbabba";
        int K = 6;
        assertEquals(3, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case138() {
        String oldPassword = "acacbdbdb";
        int K = 7;
        assertEquals(4, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case139() {
        String oldPassword = "xeywyxpvwiencehqsybcnfgjkwtvrkhoommnbwlafymsiftcmh";
        int K = 48;
        assertEquals(44, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case140() {
        String oldPassword = "abcabcabc";
        int K = 8;
        assertEquals(6, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case141() {
        String oldPassword = "abchahachbbhhbhcahhc";
        int K = 19;
        assertEquals(12, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case142() {
        String oldPassword = "baba";
        int K = 3;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case143() {
        String oldPassword = "aabbccdd";
        int K = 7;
        assertEquals(6, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case144() {
        String oldPassword = "abc";
        int K = 2;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case145() {
        String oldPassword = "abcdb";
        int K = 4;
        assertEquals(3, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case146() {
        String oldPassword = "aabbaaabbaa";
        int K = 9;
        assertEquals(4, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case147() {
        String oldPassword = "aaaaaaabbbbbbbbbbbbbbccccccccccccccccccccccccccccc";
        int K = 47;
        assertEquals(21, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case148() {
        String oldPassword = "bbaabaaaaabbbbbbbababaabaabaabbabababbbabbabbabbba";
        int K = 40;
        assertEquals(14, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case149() {
        String oldPassword = "ababababcdcdcdcdefefefef";
        int K = 23;
        assertEquals(20, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case150() {
        String oldPassword = "abcaaaa";
        int K = 6;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case151() {
        String oldPassword = "abchahachbbhhbhcahhcabchahachbbhhbhcahhc";
        int K = 39;
        assertEquals(24, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case152() {
        String oldPassword = "ajlfvgubfaaovlzylntrkdcpwsrtesjw";
        int K = 31;
        assertEquals(29, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case153() {
        String oldPassword = "gxzkktitxocthykzzttlcaieylusuvykdcpipningrgaszyrxe";
        int K = 49;
        assertEquals(45, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case154() {
        String oldPassword = "bbooo";
        int K = 4;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case155() {
        String oldPassword = "aabbbbb";
        int K = 6;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case156() {
        String oldPassword = "abababab";
        int K = 7;
        assertEquals(4, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case157() {
        String oldPassword = "acacbcbc";
        int K = 6;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case158() {
        String oldPassword = "abbcc";
        int K = 4;
        assertEquals(3, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case159() {
        String oldPassword = "bxaxcxb";
        int K = 5;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case160() {
        String oldPassword = "zyyyz";
        int K = 3;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case161() {
        String oldPassword = "aaabbbccc";
        int K = 8;
        assertEquals(6, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case162() {
        String oldPassword = "izbjetjnxrqlhoiolxqtggjkmwicixndhetycwwnslchfrnkrn";
        int K = 40;
        assertEquals(37, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case163() {
        String oldPassword = "abcdddddeeeeeee";
        int K = 14;
        assertEquals(8, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case164() {
        String oldPassword = "abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde";
        int K = 49;
        assertEquals(40, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case165() {
        String oldPassword = "jbabdbjbj";
        int K = 7;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case166() {
        String oldPassword = "abccbcabaa";
        int K = 7;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case167() {
        String oldPassword = "babb";
        int K = 3;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case168() {
        String oldPassword = "axaxbxbxbxbxbxbxbxbxbxaxa";
        int K = 23;
        assertEquals(4, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case169() {
        String oldPassword = "aaaabb";
        int K = 5;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case170() {
        String oldPassword = "amamckdkz";
        int K = 7;
        assertEquals(5, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case171() {
        String oldPassword = "aebdcec";
        int K = 5;
        assertEquals(3, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case172() {
        String oldPassword = "baadbb";
        int K = 2;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case173() {
        String oldPassword = "abcdefghhhabcdefghijabcdefghijabcdefghijabcdefghij";
        int K = 49;
        assertEquals(43, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case174() {
        String oldPassword = "bacaa";
        int K = 4;
        assertEquals(2, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case175() {
        String oldPassword = "aaba";
        int K = 3;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case176() {
        String oldPassword = "owdgeljytvsmafyfmrvtfwroccbhrmgzzlpxuycnclfvtkiuzb";
        int K = 34;
        assertEquals(32, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case177() {
        String oldPassword = "ababababab";
        int K = 9;
        assertEquals(5, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case178() {
        String oldPassword = "ababbcccc";
        int K = 8;
        assertEquals(5, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case179() {
        String oldPassword = "abadfadsda";
        int K = 9;
        assertEquals(6, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case180() {
        String oldPassword = "ltmehkfjhdgnudxmkwiudapflpvvqlncwk";
        int K = 16;
        assertEquals(16, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case181() {
        String oldPassword = "aaaabbbb";
        int K = 7;
        assertEquals(4, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case182() {
        String oldPassword = "abcabc";
        int K = 5;
        assertEquals(4, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case183() {
        String oldPassword = "abcdeffabcdeffabcdeff";
        int K = 20;
        assertEquals(15, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case184() {
        String oldPassword = "cbcbabcbcbcb";
        int K = 10;
        assertEquals(1, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case185() {
        String oldPassword = "abcdefghijklmnoabcdeflkdjfsoiermnfsdljkldjlkjalkdd";
        int K = 48;
        assertEquals(43, newarenapassword.minChange(oldPassword, K));
    }

    @Test
    public void case186() {
        String oldPassword = "kaiefkkjcmcmjjdsahushfiosjlkfnsadlksdjssjuorioujkl";
        int K = 48;
        assertEquals(41, newarenapassword.minChange(oldPassword, K));
    }

}
