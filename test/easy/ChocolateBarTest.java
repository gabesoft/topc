package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ChocolateBarTest {
    ChocolateBar chocolatebar = new ChocolateBar();

    @Test
    public void case1() {
        String letters = "srm";
        assertEquals(3, chocolatebar.maxLength(letters));
    }

    @Test
    public void case2() {
        String letters = "dengklek";
        assertEquals(6, chocolatebar.maxLength(letters));
    }

    @Test
    public void case3() {
        String letters = "haha";
        assertEquals(2, chocolatebar.maxLength(letters));
    }

    @Test
    public void case4() {
        String letters = "www";
        assertEquals(1, chocolatebar.maxLength(letters));
    }

    @Test
    public void case5() {
        String letters = "thisisansrmbeforetopcoderopenfinals";
        assertEquals(9, chocolatebar.maxLength(letters));
    }

    @Test
    public void case6() {
        String letters = "x";
        assertEquals(1, chocolatebar.maxLength(letters));
    }

    @Test
    public void case7() {
        String letters = "abcabcabc";
        assertEquals(3, chocolatebar.maxLength(letters));
    }

    @Test
    public void case8() {
        String letters = "cab";
        assertEquals(3, chocolatebar.maxLength(letters));
    }

    @Test
    public void case9() {
        String letters = "cebad";
        assertEquals(5, chocolatebar.maxLength(letters));
    }

    @Test
    public void case10() {
        String letters = "gcfbhjidea";
        assertEquals(10, chocolatebar.maxLength(letters));
    }

    @Test
    public void case11() {
        String letters = "hognikedalcfjbm";
        assertEquals(15, chocolatebar.maxLength(letters));
    }

    @Test
    public void case12() {
        String letters = "moqcpjnashriglefbdtk";
        assertEquals(20, chocolatebar.maxLength(letters));
    }

    @Test
    public void case13() {
        String letters = "qaljvodxnwhstprbeuikgfmyc";
        assertEquals(25, chocolatebar.maxLength(letters));
    }

    @Test
    public void case14() {
        String letters = "wfkgeszaxsjnepmtuobdvlycrusihq";
        assertEquals(19, chocolatebar.maxLength(letters));
    }

    @Test
    public void case15() {
        String letters = "mgbgvxdvybnghapsfzguvjutwomdjckelyiwrckq";
        assertEquals(13, chocolatebar.maxLength(letters));
    }

    @Test
    public void case16() {
        String letters = "wexkzhkhvdymowmunqallufucdcztqapsxojbgqikwxbr";
        assertEquals(13, chocolatebar.maxLength(letters));
    }

    @Test
    public void case17() {
        String letters = "dxncubuorrnhtpifwgodfjmmoaxdostsamvhvmzxymcqfepykl";
        assertEquals(11, chocolatebar.maxLength(letters));
    }

    @Test
    public void case18() {
        String letters = "bca";
        assertEquals(3, chocolatebar.maxLength(letters));
    }

    @Test
    public void case19() {
        String letters = "daecb";
        assertEquals(5, chocolatebar.maxLength(letters));
    }

    @Test
    public void case20() {
        String letters = "jaeiedbagf";
        assertEquals(7, chocolatebar.maxLength(letters));
    }

    @Test
    public void case21() {
        String letters = "mcdmzehbanejdiq";
        assertEquals(9, chocolatebar.maxLength(letters));
    }

    @Test
    public void case22() {
        String letters = "cpjndlzkgbqrkshataoi";
        assertEquals(12, chocolatebar.maxLength(letters));
    }

    @Test
    public void case23() {
        String letters = "vaeimtxcggqndojylwbuhphsr";
        assertEquals(13, chocolatebar.maxLength(letters));
    }

    @Test
    public void case24() {
        String letters = "utkeophsjijxxmllsknqcgqcmbyzha";
        assertEquals(10, chocolatebar.maxLength(letters));
    }

    @Test
    public void case25() {
        String letters = "bsvvwqpgfpcghedmpeyujbmdzcjchokyxlpvmaen";
        assertEquals(14, chocolatebar.maxLength(letters));
    }

    @Test
    public void case26() {
        String letters = "grqhxdndsurmybktixywtzdojfhkqtjcjnwamloyipvle";
        assertEquals(13, chocolatebar.maxLength(letters));
    }

    @Test
    public void case27() {
        String letters = "pumnoccuwgvewspojtqrtneszgofifhyetnhtyzkexbatjihur";
        assertEquals(13, chocolatebar.maxLength(letters));
    }

    @Test
    public void case28() {
        String letters = "ll";
        assertEquals(1, chocolatebar.maxLength(letters));
    }

    @Test
    public void case29() {
        String letters = "vwwwwv";
        assertEquals(2, chocolatebar.maxLength(letters));
    }

    @Test
    public void case30() {
        String letters = "quhwmlmwhuq";
        assertEquals(6, chocolatebar.maxLength(letters));
    }

    @Test
    public void case31() {
        String letters = "wvchdneooendhcvw";
        assertEquals(8, chocolatebar.maxLength(letters));
    }

    @Test
    public void case32() {
        String letters = "eyhnoorxdsusdxroonhye";
        assertEquals(6, chocolatebar.maxLength(letters));
    }

    @Test
    public void case33() {
        String letters = "oosbklyshmfdkkdfmhsylkbsoo";
        assertEquals(9, chocolatebar.maxLength(letters));
    }

    @Test
    public void case34() {
        String letters = "mnxsomwnvmbmfapypafmbmvnwmosxnm";
        assertEquals(7, chocolatebar.maxLength(letters));
    }

    @Test
    public void case35() {
        String letters = "vdmngyygshtymbiaqftftftfqaibmythsgyygnmdv";
        assertEquals(11, chocolatebar.maxLength(letters));
    }

    @Test
    public void case36() {
        String letters = "rurdxdjxshuxviftimmshkkkkhsmmitfivxuhsxjdxdrur";
        assertEquals(8, chocolatebar.maxLength(letters));
    }

    @Test
    public void case37() {
        String letters = "ufabyhvrbovytgynpsmkcrdnfndrckmspnygtyvobrvhybafu";
        assertEquals(11, chocolatebar.maxLength(letters));
    }

    @Test
    public void case38() {
        String letters = "pjvp";
        assertEquals(3, chocolatebar.maxLength(letters));
    }

    @Test
    public void case39() {
        String letters = "zxhz";
        assertEquals(3, chocolatebar.maxLength(letters));
    }

    @Test
    public void case40() {
        String letters = "nyaqaqacn";
        assertEquals(4, chocolatebar.maxLength(letters));
    }

    @Test
    public void case41() {
        String letters = "jyvnvzcpyojvai";
        assertEquals(9, chocolatebar.maxLength(letters));
    }

    @Test
    public void case42() {
        String letters = "ntcjvmcsrnjswmvjrtn";
        assertEquals(8, chocolatebar.maxLength(letters));
    }

    @Test
    public void case43() {
        String letters = "haotjjpbzriuqrqspjvtkah";
        assertEquals(10, chocolatebar.maxLength(letters));
    }

    @Test
    public void case44() {
        String letters = "iujagrjfjarzzktkuzvybfbkdajui";
        assertEquals(8, chocolatebar.maxLength(letters));
    }

    @Test
    public void case45() {
        String letters = "qomcfwgjkwtdwmfqwghqsvwnfmwdnwkqnwfcvoq";
        assertEquals(9, chocolatebar.maxLength(letters));
    }

    @Test
    public void case46() {
        String letters = "atjkzskpqzfjzgbjqfpsnhunapfjjbmzjfdqikszkjta";
        assertEquals(11, chocolatebar.maxLength(letters));
    }

    @Test
    public void case47() {
        String letters = "psorariephxoycwhmkjvvuobhxyoulvakmhwcyoxhpeirwrosp";
        assertEquals(12, chocolatebar.maxLength(letters));
    }

    @Test
    public void case48() {
        String letters = "ene";
        assertEquals(2, chocolatebar.maxLength(letters));
    }

    @Test
    public void case49() {
        String letters = "eveuw";
        assertEquals(4, chocolatebar.maxLength(letters));
    }

    @Test
    public void case50() {
        String letters = "tdwavazudm";
        assertEquals(6, chocolatebar.maxLength(letters));
    }

    @Test
    public void case51() {
        String letters = "tmxcftlxcmeljky";
        assertEquals(8, chocolatebar.maxLength(letters));
    }

    @Test
    public void case52() {
        String letters = "potwjsrootjosftgbhed";
        assertEquals(10, chocolatebar.maxLength(letters));
    }

    @Test
    public void case53() {
        String letters = "mxplbdpmozmgohczzvnnozdhg";
        assertEquals(7, chocolatebar.maxLength(letters));
    }

    @Test
    public void case54() {
        String letters = "ynhfrntqefrjwfywrgmbinadcqrbva";
        assertEquals(13, chocolatebar.maxLength(letters));
    }

    @Test
    public void case55() {
        String letters = "iwordhezykgrucxsaqyotibwnemghjhpfxjlenke";
        assertEquals(19, chocolatebar.maxLength(letters));
    }

    @Test
    public void case56() {
        String letters = "yqwsuvmxnmlhwndjtrpaaysivbtcqfioxeitbwqpicwer";
        assertEquals(11, chocolatebar.maxLength(letters));
    }

    @Test
    public void case57() {
        String letters = "bpkshmufecdhxhyepobwzvzvlogpmmgpcshlheqnivvgevmwjo";
        assertEquals(11, chocolatebar.maxLength(letters));
    }

    @Test
    public void case58() {
        String letters = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals(1, chocolatebar.maxLength(letters));
    }

    @Test
    public void case59() {
        String letters = "thisisansrmbeforetopcoderopenfinalsandmoreshitlol";
        assertEquals(12, chocolatebar.maxLength(letters));
    }

    @Test
    public void case60() {
        String letters = "abcdefghijzabcdefghijklnmopqrsttsrqpomnz";
        assertEquals(21, chocolatebar.maxLength(letters));
    }

    @Test
    public void case61() {
        String letters = "aabbcc";
        assertEquals(2, chocolatebar.maxLength(letters));
    }

    @Test
    public void case62() {
        String letters = "deenglkk";
        assertEquals(5, chocolatebar.maxLength(letters));
    }

    @Test
    public void case63() {
        String letters = "zxxyyz";
        assertEquals(2, chocolatebar.maxLength(letters));
    }

    @Test
    public void case64() {
        String letters = "zzzzzzzzzzzzzzzzzzzzzzzzz";
        assertEquals(1, chocolatebar.maxLength(letters));
    }

    @Test
    public void case65() {
        String letters = "abbabbaa";
        assertEquals(2, chocolatebar.maxLength(letters));
    }

    @Test
    public void case66() {
        String letters = "abcede";
        assertEquals(5, chocolatebar.maxLength(letters));
    }

    @Test
    public void case67() {
        String letters = "abrakadabra";
        assertEquals(4, chocolatebar.maxLength(letters));
    }

    @Test
    public void case68() {
        String letters = "aaaaaaaaaaaabb";
        assertEquals(2, chocolatebar.maxLength(letters));
    }

    @Test
    public void case69() {
        String letters = "a";
        assertEquals(1, chocolatebar.maxLength(letters));
    }

    @Test
    public void case70() {
        String letters = "abcad";
        assertEquals(4, chocolatebar.maxLength(letters));
    }

    @Test
    public void case71() {
        String letters = "thisisaverylongstriagshbiccahamzawnwwhhdefqaymules";
        assertEquals(11, chocolatebar.maxLength(letters));
    }

    @Test
    public void case72() {
        String letters = "thisisansrmbeforembiosubapbnsdaasdpanadsadtopcoder";
        assertEquals(9, chocolatebar.maxLength(letters));
    }

    @Test
    public void case73() {
        String letters = "bba";
        assertEquals(2, chocolatebar.maxLength(letters));
    }

    @Test
    public void case74() {
        String letters = "abbc";
        assertEquals(2, chocolatebar.maxLength(letters));
    }

    @Test
    public void case75() {
        String letters = "abcdabcdabcdabcdabcdabcd";
        assertEquals(4, chocolatebar.maxLength(letters));
    }

    @Test
    public void case76() {
        String letters = "xnmabcdabcdabcdabcdabcdabcduzy";
        assertEquals(7, chocolatebar.maxLength(letters));
    }

}
