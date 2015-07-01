package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class CorruptedMessageTest {
    CorruptedMessage corruptedmessage = new CorruptedMessage();

    @Test
    public void case1() {
        String s = "hello";
        int k = 3;
        assertEquals("lllll", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case2() {
        String s = "abc";
        int k = 3;
        assertEquals("ddd", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case3() {
        String s = "wwwwwwwwwwwwwwwwww";
        int k = 0;
        assertEquals("wwwwwwwwwwwwwwwwww", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case4() {
        String s = "ababba";
        int k = 3;
        assertEquals("aaaaaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case5() {
        String s = "zoztxtoxytyt";
        int k = 10;
        assertEquals("oooooooooooo", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case6() {
        String s = "jlmnmiunaxzywed";
        int k = 13;
        assertEquals("mmmmmmmmmmmmmmm", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case7() {
        String s = "uuufuuuueuuuoiuuwvuuuuuuuuuuuuuunemuvuuyuu";
        int k = 11;
        assertEquals("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case8() {
        String s = "iiiiiiiiitiiiiii";
        int k = 1;
        assertEquals("iiiiiiiiiiiiiiii", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case9() {
        String s = "igkcylawfhdddsdjilmdfjhvnbczqgd";
        int k = 25;
        assertEquals("ddddddddddddddddddddddddddddddd", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case10() {
        String s = "vfvvevvvvhmvvvvvvvivvvvvsv";
        int k = 6;
        assertEquals("vvvvvvvvvvvvvvvvvvvvvvvvvv", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case11() {
        String s = "uuduu";
        int k = 1;
        assertEquals("uuuuu", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case12() {
        String s = "hhhhheghhhghhhphhhh";
        int k = 4;
        assertEquals("hhhhhhhhhhhhhhhhhhh", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case13() {
        String s = "dddiled";
        int k = 3;
        assertEquals("ddddddd", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case14() {
        String s = "pbyifaboykyksvybiehqovyommswnk";
        int k = 27;
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case15() {
        String s = "eotddzybocxooo";
        int k = 9;
        assertEquals("oooooooooooooo", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case16() {
        String s = "ttttittxt";
        int k = 2;
        assertEquals("ttttttttt", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case17() {
        String s = "mohhpszhhhhhhhhh";
        int k = 5;
        assertEquals("hhhhhhhhhhhhhhhh", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case18() {
        String s = "dddddddddddddddddddhddddddddddvdddddddddddd";
        int k = 2;
        assertEquals("ddddddddddddddddddddddddddddddddddddddddddd", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case19() {
        String s = "bbbbbbbebbnb";
        int k = 2;
        assertEquals("bbbbbbbbbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case20() {
        String s = "lzbhbhdlbqbb";
        int k = 7;
        assertEquals("bbbbbbbbbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case21() {
        String s = "dzqsfvlcxznbkmavxkc";
        int k = 17;
        assertEquals("ccccccccccccccccccc", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case22() {
        String s = "mlxitsprcxwjhcpjaeguxjdozfmfwjy";
        int k = 30;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case23() {
        String s = "bvmqyzoqcpptgst";
        int k = 13;
        assertEquals("ppppppppppppppp", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case24() {
        String s = "nyachwjijjj";
        int k = 7;
        assertEquals("jjjjjjjjjjj", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case25() {
        String s = "u";
        int k = 0;
        assertEquals("u", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case26() {
        String s = "jfnomgskdoygmiirchhftjncplz";
        int k = 26;
        assertEquals("ddddddddddddddddddddddddddd", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case27() {
        String s = "xksyvkfsxikhdjdfmqlsmvdijobopdqgnvpqugka";
        int k = 40;
        assertEquals("cccccccccccccccccccccccccccccccccccccccc", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case28() {
        String s = "rzzzlzzzzzzzzmzzzzzzzzz";
        int k = 3;
        assertEquals("zzzzzzzzzzzzzzzzzzzzzzz", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case29() {
        String s = "exwtxfhylzwdvxkrnyommyxktqrfpyhvwkagjas";
        int k = 38;
        assertEquals("ddddddddddddddddddddddddddddddddddddddd", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case30() {
        String s = "epqimfj";
        int k = 6;
        assertEquals("eeeeeee", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case31() {
        String s = "axodfiipyvfmioxshxtxreztnx";
        int k = 21;
        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxx", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case32() {
        String s = "noky";
        int k = 4;
        assertEquals("aaaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case33() {
        String s = "hdddddddddddjdddwddddddddddddddddddddd";
        int k = 3;
        assertEquals("dddddddddddddddddddddddddddddddddddddd", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case34() {
        String s = "mgjwkjjnjjjvjawjjjjjgkvomgefjnjj";
        int k = 17;
        assertEquals("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case35() {
        String s = "xozxxxxxcxllxxxxxxxeixxxxxxxxxxxxxxxxxcxxx";
        int k = 8;
        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case36() {
        String s = "nqcuqsrdzhggassises";
        int k = 14;
        assertEquals("sssssssssssssssssss", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case37() {
        String s = "gmgyhyaywoykpyyyqyyxyyyygyyyyyyyyyfyyyydyyyygtyty";
        int k = 17;
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case38() {
        String s = "gufocxfiprnnpndwdcjrurjahuonxsthsebboiyldshrxib";
        int k = 44;
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case39() {
        String s = "zxxxxpxxxflxxdxxxxxxxxxxxxxxxxxxxcxxxxxxxxxxxxwuxx";
        int k = 8;
        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case40() {
        String s = "eowfehrywuryytsyyylcyiyfuiywcblwyly";
        int k = 24;
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case41() {
        String s = "nripkixaxywxkvmojpcdwlxwdrakqlsxklmheotebmfhx";
        int k = 39;
        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case42() {
        String s = "eeeeeeeeexeeeeeeeee";
        int k = 1;
        assertEquals("eeeeeeeeeeeeeeeeeee", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case43() {
        String s = "hhhhhhhhhhhhhhhhhhhhh";
        int k = 0;
        assertEquals("hhhhhhhhhhhhhhhhhhhhh", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case44() {
        String s = "yhyzyyyyyyhyyyyyyyyytfyy";
        int k = 5;
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyy", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case45() {
        String s = "qikpabatczdnatzs";
        int k = 15;
        assertEquals("bbbbbbbbbbbbbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case46() {
        String s = "ghzssoderfuqlawqlmmfvscqutlypkrdhj";
        int k = 34;
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case47() {
        String s = "rrrrrrrrrrrrrrrrrrrrrr";
        int k = 0;
        assertEquals("rrrrrrrrrrrrrrrrrrrrrr", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case48() {
        String s = "idizukczdlwbtllnbqw";
        int k = 17;
        assertEquals("bbbbbbbbbbbbbbbbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case49() {
        String s = "cljegmjwlvsjfaffymjfacacixprpf";
        int k = 25;
        assertEquals("ffffffffffffffffffffffffffffff", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case50() {
        String s = "mlkrlilotbyxlflhlstlcllzddkmulpvivfltbxkllyxlbazql";
        int k = 35;
        assertEquals("llllllllllllllllllllllllllllllllllllllllllllllllll", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case51() {
        String s = "wwwwwwwwwwwvwwgwww";
        int k = 2;
        assertEquals("wwwwwwwwwwwwwwwwww", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case52() {
        String s = "aaa";
        int k = 3;
        assertEquals("bbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case53() {
        String s = "aaaabbbacc";
        int k = 5;
        assertEquals("aaaaaaaaaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case54() {
        String s = "zzz";
        int k = 3;
        assertEquals("aaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case55() {
        String s = "bbccc";
        int k = 3;
        assertEquals("bbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case56() {
        String s = "aaabcd";
        int k = 5;
        assertEquals("bbbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case57() {
        String s = "abc";
        int k = 2;
        assertEquals("aaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case58() {
        String s = "abbbb";
        int k = 4;
        assertEquals("aaaaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case59() {
        String s = "aaabbbbbcc";
        int k = 8;
        assertEquals("cccccccccc", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case60() {
        String s = "zztxtoxatyt";
        int k = 9;
        assertEquals("xxxxxxxxxxx", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case61() {
        String s = "aaaaa";
        int k = 5;
        assertEquals("bbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case62() {
        String s = "abcdefghijklmnopqrstuvwxy";
        int k = 25;
        assertEquals("zzzzzzzzzzzzzzzzzzzzzzzzz", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case63() {
        String s = "aabbaa";
        int k = 4;
        assertEquals("bbbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case64() {
        String s = "tttsac";
        int k = 6;
        assertEquals("bbbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case65() {
        String s = "mmaaabbc";
        int k = 5;
        assertEquals("aaaaaaaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case66() {
        String s = "abcd";
        int k = 4;
        assertEquals("eeee", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case67() {
        String s = "aaab";
        int k = 1;
        assertEquals("aaaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case68() {
        String s = "zza";
        int k = 1;
        assertEquals("zzz", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case69() {
        String s = "az";
        int k = 2;
        assertEquals("bb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case70() {
        String s = "bbbc";
        int k = 1;
        assertEquals("bbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case71() {
        String s = "abcdfghijklmneriwrtezzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        int k = 20;
        assertEquals("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case72() {
        String s = "xxxxx";
        int k = 5;
        assertEquals("aaaaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case73() {
        String s = "abbbc";
        int k = 2;
        assertEquals("bbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case74() {
        String s = "qwertyuiopasdfghjklxcvbnm";
        int k = 25;
        assertEquals("zzzzzzzzzzzzzzzzzzzzzzzzz", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case75() {
        String s = "aab";
        int k = 1;
        assertEquals("aaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case76() {
        String s = "bbbbb";
        int k = 5;
        assertEquals("aaaaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case77() {
        String s = "aaaxxxa";
        int k = 4;
        assertEquals("xxxxxxx", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case78() {
        String s = "abd";
        int k = 3;
        assertEquals("ccc", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case79() {
        String s = "dddaac";
        int k = 4;
        assertEquals("aaaaaa", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case80() {
        String s = "aaaabbb";
        int k = 4;
        assertEquals("bbbbbbb", corruptedmessage.reconstructMessage(s, k));
    }

    @Test
    public void case81() {
        String s = "aab";
        int k = 2;
        assertEquals("bbb", corruptedmessage.reconstructMessage(s, k));
    }

}
