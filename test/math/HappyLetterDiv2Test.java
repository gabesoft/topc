package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class HappyLetterDiv2Test {
    HappyLetterDiv2 happyletterdiv2 = new HappyLetterDiv2();

    @Test
    public void case1() {
        String letters = "aacaaa";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case2() {
        String letters = "dcdjx";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case3() {
        String letters = "bcbbbbba";
        assertEquals('b', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case4() {
        String letters = "aabc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case5() {
        String letters = "wc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case6() {
        String letters = "vv";
        assertEquals('v', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case7() {
        String letters = "mnaa";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case8() {
        String letters = "rrrr";
        assertEquals('r', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case9() {
        String letters = "kkpppx";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case10() {
        String letters = "iiiiii";
        assertEquals('i', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case11() {
        String letters = "wwdjdjdj";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case12() {
        String letters = "zzzzbzzz";
        assertEquals('z', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case13() {
        String letters = "dkgjdnkjkg";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case14() {
        String letters = "ddvdddvddd";
        assertEquals('d', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case15() {
        String letters = "hghmzhhhzghg";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case16() {
        String letters = "ppprppppppuw";
        assertEquals('p', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case17() {
        String letters = "hllkchlqhklltt";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case18() {
        String letters = "maaaaaacmaaaac";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case19() {
        String letters = "qqbqqqhiqwqhqhah";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case20() {
        String letters = "jjjhhjhjjjvhjjjj";
        assertEquals('j', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case21() {
        String letters = "bfbfprrpbsbbbpbpbb";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case22() {
        String letters = "tivvvovvovvvvvvtvv";
        assertEquals('v', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case23() {
        String letters = "jkznyyyzjzyzzzpzzkkk";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case24() {
        String letters = "syfyrysydyyyyyyyygyy";
        assertEquals('y', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case25() {
        String letters = "eenbeeenenenbnnneeibbn";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case26() {
        String letters = "fgpwgpggfpfgpfgggpgggg";
        assertEquals('g', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case27() {
        String letters = "ivddiddvivdbiiidiiddiiii";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case28() {
        String letters = "jhrrrjjrjjrrjhrrrrjrjrrr";
        assertEquals('r', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case29() {
        String letters = "rkhrllllrrlhrhdhhhhhhrlhhr";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case30() {
        String letters = "oyyyoowoooofwjoooooffyyooo";
        assertEquals('o', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case31() {
        String letters = "ttwwtuuuwwtttwttttwtwuwtuttu";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case32() {
        String letters = "lrlllllllvrrvllwlwwrlrlvrlll";
        assertEquals('l', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case33() {
        String letters = "xyxxwzxyyyxybxxwxyxxbxsyxbyxbs";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case34() {
        String letters = "qqqqqeqqueqqueuqqqqlqquqqqeeuq";
        assertEquals('q', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case35() {
        String letters = "pooopoupppppououooooooppupypppoo";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case36() {
        String letters = "dddaadadaaaddddaadaaaadadaaaaada";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case37() {
        String letters = "uuddguuuuuuugdaagaduagguuuguugugug";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case38() {
        String letters = "wyhheyyhyeiyyyyyhyyyyyhhyeyheyeehy";
        assertEquals('y', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case39() {
        String letters = "rqhrqhrqhrhrhhhhrqhhhqqhqhhhqqqqqhqh";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case40() {
        String letters = "xxrxxxahxxxxaanxxhxxxhhnaxxxxeaxhxxx";
        assertEquals('x', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case41() {
        String letters = "bbonoooobobbnoobobooboobbobbbbooobobbo";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case42() {
        String letters = "tktkwwttwwtwttwttwwwwwtwtwwwwwwttwttww";
        assertEquals('w', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case43() {
        String letters = "jjeejycjyjeccejejjyjeoewejjeejejwjejyjce";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case44() {
        String letters = "kssslssssslkssslsssskllklsklssssslkslssl";
        assertEquals('s', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case45() {
        String letters = "jyjjkjjkjjykkkkyjyjkkkyjkykyjjkkjkjykkxjjk";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case46() {
        String letters = "kuuukuuuuuukkkkuukukukuuuuukkuukkkkkuukuuk";
        assertEquals('u', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case47() {
        String letters = "crlgrrgrgrcgrgrrrcrrgdgcglrggrchgrdrrrrrgrgr";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case48() {
        String letters = "aoaooaaoohoaaoaoooooohaohoaoaooooooaaoooaoah";
        assertEquals('o', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case49() {
        String letters = "vvvvvvlvllvlvvvlllvlvtsgllllsvllvgvlggvslvllvs";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case50() {
        String letters = "ddddkkdkddkddkkkkddkdkddkdkkkkdddddkdkddddddkk";
        assertEquals('d', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case51() {
        String letters = "ovcoocvoocujovovccooocccooocucccoooccoccocococco";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case52() {
        String letters = "uuppupupuuuppppuuupuuupuuuqpuuuuuupppuppppuuupup";
        assertEquals('u', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case53() {
        String letters = "pmpmpm";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case54() {
        String letters = "aaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzzzzzzzzzzzz";
        assertEquals('z', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case55() {
        String letters = "aabbcc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case56() {
        String letters = "aacaa";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case57() {
        String letters = "aaaaaab";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case58() {
        String letters = "aaabb";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case59() {
        String letters = "aaaaaahyhahhytaaratyuiiiaaikjhaahttaghyjaajuiokbvf";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case60() {
        String letters = "aaab";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case61() {
        String letters = "abcdd";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case62() {
        String letters = "aaaabbcc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case63() {
        String letters = "a";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case64() {
        String letters = "zzasfacasdfadagzzzzzzzzzzzzzzzzzzzzzzzzzz";
        assertEquals('z', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case65() {
        String letters = "aa";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case66() {
        String letters = "zzzzza";
        assertEquals('z', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case67() {
        String letters = "aaabc";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case68() {
        String letters = "cbcbcacdcecfcgchcicocpcqcwcdcscdcvcbcmczcacocuchc";
        assertEquals('c', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case69() {
        String letters = "aaaxe";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case70() {
        String letters = "aaaabbb";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case71() {
        String letters = "abcc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case72() {
        String letters = "aaaabb";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case73() {
        String letters = "aac";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case74() {
        String letters = "aaaaabbcc";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case75() {
        String letters = "aaaabbbbx";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case76() {
        String letters = "dcdddddjxxd";
        assertEquals('d', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case77() {
        String letters = "abcdddd";
        assertEquals('d', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case78() {
        String letters = "aaabbbbccc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case79() {
        String letters = "aaaaabbbbb";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case80() {
        String letters = "aaabbbc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case81() {
        String letters = "aab";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case82() {
        String letters = "aaaaaaaabbbbccccdddd";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case83() {
        String letters = "abccc";
        assertEquals('c', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case84() {
        String letters = "aabzzzzz";
        assertEquals('z', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case85() {
        String letters = "bbccdddddd";
        assertEquals('d', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case86() {
        String letters = "bab";
        assertEquals('b', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case87() {
        String letters = "aabbcccc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case88() {
        String letters = "aaa";
        assertEquals('a', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case89() {
        String letters = "zzzzz";
        assertEquals('z', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case90() {
        String letters = "bacc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case91() {
        String letters = "bbbbaaa";
        assertEquals('b', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case92() {
        String letters = "acbb";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case93() {
        String letters = "fdcbfcdffgcsfdfggngffgfggffgjkjkjbbnmbvdfddfffghg";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case94() {
        String letters = "abb";
        assertEquals('b', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case95() {
        String letters = "aabccc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case96() {
        String letters = "abcdefghijklmnopqrstuvwxyzxwvutsrqponmlkjihgfedcba";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case97() {
        String letters = "babaabababababababababbbabacccccccdddddddcccbababa";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case98() {
        String letters = "bbccccdddd";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case99() {
        String letters = "aaaaabbbbbccccc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case100() {
        String letters = "aaabbbcc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case101() {
        String letters = "aabb";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case102() {
        String letters = "abababbbaaaaacccc";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

    @Test
    public void case103() {
        String letters = "aabbccddeeffgghhiijjkkllmmnnooppqq";
        assertEquals('.', happyletterdiv2.getHappyLetter(letters));
    }

}
