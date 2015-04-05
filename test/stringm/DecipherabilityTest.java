package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class DecipherabilityTest {
    Decipherability decipherability = new Decipherability();

    @Test
    public void case1() {
        String s = "snuke";
        int K = 2;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case2() {
        String s = "aba";
        int K = 1;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case3() {
        String s = "aba";
        int K = 2;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case4() {
        String s = "abcdabcd";
        int K = 3;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case5() {
        String s = "koukyoukoukokukikou";
        int K = 2;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case6() {
        String s = "wolfsothe";
        int K = 8;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case7() {
        String s = "a";
        int K = 1;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case8() {
        String s = "aa";
        int K = 1;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case9() {
        String s = "ab";
        int K = 1;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case10() {
        String s = "aa";
        int K = 2;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case11() {
        String s = "ab";
        int K = 2;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case12() {
        String s = "aba";
        int K = 1;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case13() {
        String s = "aba";
        int K = 2;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case14() {
        String s = "aab";
        int K = 1;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case15() {
        String s = "aab";
        int K = 2;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case16() {
        String s = "aab";
        int K = 3;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case17() {
        String s = "abab";
        int K = 1;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case18() {
        String s = "abab";
        int K = 2;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case19() {
        String s = "abab";
        int K = 3;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case20() {
        String s = "abab";
        int K = 4;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case21() {
        String s = "smjqgpkcyvzselduwyeakhkxfkisaplgt";
        int K = 12;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case22() {
        String s = "uiwdthpz";
        int K = 6;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case23() {
        String s = "nsqypvhqtbavuxijypvxeksbaypjgmed";
        int K = 12;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case24() {
        String s = "gwoxjonospvmprezgql";
        int K = 8;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case25() {
        String s = "ynyqpmaopqhumqwjtjyklxpd";
        int K = 2;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case26() {
        String s = "xlgmbh";
        int K = 4;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case27() {
        String s = "kkwknmvoaezqtszcbkjupylyayi";
        int K = 22;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case28() {
        String s = "ovkfrqyzpeybhwoupgcbrekwwiuccjpdxldpsdwfnwmanwxifk";
        int K = 20;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case29() {
        String s = "upgklvurhuaohwjxirwyptpphkgzeoxnwargcjmbr";
        int K = 25;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case30() {
        String s = "zhyboydtftysfojxfiihotes";
        int K = 3;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case31() {
        String s = "mzyejumfwmwmij";
        int K = 13;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case32() {
        String s = "wwhtqbebjh";
        int K = 7;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case33() {
        String s = "puqgyjuzasfljvxjtfezmflosrmzwjz";
        int K = 23;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case34() {
        String s = "dyjlvnnbxgawjkknkwgtxxkppjenmjydmoctlwvym";
        int K = 6;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case35() {
        String s = "athghnep";
        int K = 3;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case36() {
        String s = "kvolwqyzsunlheydmmyne";
        int K = 1;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case37() {
        String s = "emirugvifebjosoevbpnqxueoewjbewboijdxmdyacnpbytu";
        int K = 38;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case38() {
        String s = "xebqixjglplcsut";
        int K = 11;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case39() {
        String s = "zsgpzsdljtkqbftwyiynpfbkx";
        int K = 23;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case40() {
        String s = "afbatastyktvji";
        int K = 5;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case41() {
        String s = "acacbaccabcababcaaacccacaccbaababcaca";
        int K = 14;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case42() {
        String s = "bcccddd";
        int K = 2;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case43() {
        String s = "eddaee";
        int K = 5;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case44() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int K = 30;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case45() {
        String s = "ecbbeeecacbaadaeeacbaecdbbaacbdebcabdabaab";
        int K = 17;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case46() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int K = 32;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case47() {
        String s = "bbaabaabbabbaabbabbbaaaaaaabaaababbabbbbaaaaaabb";
        int K = 43;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case48() {
        String s = "ebcedeacceeabbabaddbbccabbeabbebebdcedc";
        int K = 1;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case49() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int K = 25;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case50() {
        String s = "aaaaaaa";
        int K = 2;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case51() {
        String s = "acbbcac";
        int K = 6;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case52() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaa";
        int K = 15;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case53() {
        String s = "aaabacacdbdcbcdad";
        int K = 15;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case54() {
        String s = "ddbcebb";
        int K = 7;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case55() {
        String s = "abaaababbabaabaaabbaaaabbbba";
        int K = 7;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case56() {
        String s = "aaaaaaaaaaaaaaa";
        int K = 3;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case57() {
        String s = "bbbabababbaabbbaabbbabbaaabbbbbbabbbbaaaba";
        int K = 8;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case58() {
        String s = "cbbbbabcbdddccdeddebbbbceaacbaccebeb";
        int K = 8;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case59() {
        String s = "baabba";
        int K = 4;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case60() {
        String s = "abaabbaabbaabbbbaabbbaaabaababbbababaa";
        int K = 10;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case61() {
        String s = "ccecebceeecbecbeadcbcdcaeeddbbddbeeeaaebbabe";
        int K = 44;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case62() {
        String s = "abbbbbbababababbbbbbabaaaaaaaaba";
        int K = 32;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case63() {
        String s = "bbcaabcbccdbaadabccadaccaddbbdbdbacbcbaddcb";
        int K = 43;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case64() {
        String s = "baabbabaaaabaaabbabaaabbaababbaababbaaabaaabaa";
        int K = 46;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case65() {
        String s = "babacbbcdcadbbdbcdbadccadcddadabbacaabbcccdddbd";
        int K = 47;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case66() {
        String s = "deagcbfdeagcbfdeagcbfdeagcbfdeagcbfdeagcbf";
        int K = 6;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case67() {
        String s = "dtlgbauprksjqefmhncoidtlg";
        int K = 20;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case68() {
        String s = "abc";
        int K = 2;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case69() {
        String s = "fmedinphbacjlkog";
        int K = 14;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case70() {
        String s = "incldfjapmoqrutvhkgbeisnldcjafmpoqurtvkhbg";
        int K = 20;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case71() {
        String s = "kvqjdcsfhbwtuirmgopnleakjvqdschbfwiumrgotlna";
        int K = 20;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case72() {
        String s = "bahcgidefbahcgidefbahcgidefbahcgidefbahc";
        int K = 8;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case73() {
        String s = "gjecihbdagfjechbdigajefhcbdgijafhebcdgjifaehb";
        int K = 8;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case74() {
        String s = "doabuishmvljqencrtwfpgokbauidsmhlvqejrcnwftpkbagod";
        int K = 20;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case75() {
        String s = "ifdnjmbelkcaghfdinmbjlekagcfdihn";
        int K = 12;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case76() {
        String s = "adcfeacfeadfcbe";
        int K = 3;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case77() {
        String s = "lapuvtndgrshqfomewkbilcauvptjgdrnqshfomebwiklcu";
        int K = 20;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case78() {
        String s = "abecfagebdacgbdafg";
        int K = 4;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case79() {
        String s = "ablkjhcgedfiablkjhcgedfiablkjhcgedfiabl";
        int K = 11;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case80() {
        String s = "nfmctpkjaedigqorlhsu";
        int K = 18;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case81() {
        String s = "fbegcafdbegfadbgcedbgcefbgcdaegfdbcgade";
        int K = 4;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case82() {
        String s = "kjaceibhgld";
        int K = 9;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case83() {
        String s = "hcdgbfeahcd";
        int K = 7;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case84() {
        String s = "abdc";
        int K = 4;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case85() {
        String s = "ajindgobchmlekajfidn";
        int K = 13;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case86() {
        String s = "costaqminplhfkjrdebgcostaqminplhfkjrdebgcostaqm";
        int K = 20;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case87() {
        String s = "aedhbfgceadhfgcbedahfc";
        int K = 7;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case88() {
        String s = "rmfcqosdhulibkgaetpnrjmcqosdhflibukaetgnrjmpcos";
        int K = 20;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case89() {
        String s = "bujengctfmohivqplrasbduengcjfktohmqivlrsbdpaune";
        int K = 20;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case90() {
        String s = "dbjechagdifbecajhdgbfieajdgchbfeijdcgha";
        int K = 8;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case91() {
        String s = "coidjkqslhpabrgnefmcoidjkqslhpabrgnefm";
        int K = 19;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case92() {
        String s = "fcheagdbhef";
        int K = 6;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case93() {
        String s = "dbclhkjaeg";
        int K = 10;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case94() {
        String s = "befcd";
        int K = 5;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case95() {
        String s = "ab";
        int K = 2;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case96() {
        String s = "bcdegfbcedfgc";
        int K = 5;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case97() {
        String s = "diabjtvornuseclmphfqdkibjtagovrn";
        int K = 20;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case98() {
        String s = "aaaaaaaaaaaaaaaaa";
        int K = 1;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case99() {
        String s = "bfhgdceafbghcdafbghe";
        int K = 7;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case100() {
        String s = "fodpciehsgarnjmlqtbufkdopiehcsganrmjqtbufkldpieh";
        int K = 20;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case101() {
        String s = "fbdejihgafcbedkjihfgbeadjkifcbgadehkijfgb";
        int K = 9;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case102() {
        String s = "cbc";
        int K = 2;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case103() {
        String s = "gdealchbjfidealc";
        int K = 10;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case104() {
        String s = "scknraogtfiemlupqbhjdcknsarogfteilupmbqhjcknds";
        int K = 20;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case105() {
        String s = "acsukjnmphfbdgqoleritcsakunjphmfdgqolebrtiscak";
        int K = 20;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case106() {
        String s = "xabcdefghijklmnopqrstuvwyzxxabcdefghijklmnop";
        int K = 20;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case107() {
        String s = "abcdeef";
        int K = 5;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case108() {
        String s = "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy";
        int K = 24;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case109() {
        String s = "abcdefghijklmnopqrstwabcdefghijklmnopqrstw";
        int K = 2;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case110() {
        String s = "cddcc";
        int K = 5;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case111() {
        String s = "paxycerdogqijsabhfmwtonbxczmcnrwjfeaeuprohqyogummq";
        int K = 9;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case112() {
        String s = "abcabcabcabcabcabcabcabc";
        int K = 5;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case113() {
        String s = "abcdea";
        int K = 6;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case114() {
        String s = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvw";
        int K = 26;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case115() {
        String s = "abcdefa";
        int K = 4;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case116() {
        String s = "bcadeafg";
        int K = 2;
        assertEquals("Certain", decipherability.check(s, K));
    }

    @Test
    public void case117() {
        String s = "baac";
        int K = 1;
        assertEquals("Uncertain", decipherability.check(s, K));
    }

    @Test
    public void case118() {
        String s = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstu";
        int K = 24;
        assertEquals("Certain", decipherability.check(s, K));
    }

}
