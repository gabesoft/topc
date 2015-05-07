package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SquareScoresDiv2Test {
    SquareScoresDiv2 squarescoresdiv2 = new SquareScoresDiv2();

    @Test
    public void case1() {
        String s = "aaaba";
        assertEquals(8, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case2() {
        String s = "zzzxxzz";
        assertEquals(12, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case3() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(26, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case4() {
        String s = "p";
        assertEquals(1, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case5() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals(5050, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case6() {
        String s = "abcdjioaj";
        assertEquals(9, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case7() {
        String s = "aaacccb";
        assertEquals(13, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case8() {
        String s = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        assertEquals(5050, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case9() {
        String s = "nikomaki";
        assertEquals(8, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case10() {
        String s = "oohhheeeffdjfjeidoo";
        assertEquals(28, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case11() {
        String s = "zzechiifxkkvtttnvpf";
        assertEquals(25, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case12() {
        String s = "ycccqvvlmfkkoiiimjiqnqggggllqqquum";
        assertEquals(53, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case13() {
        String s = "jjmmmmmmji";
        assertEquals(26, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case14() {
        String s = "jjjjajjiiiiiggggglccccccmmmhbjjjzzzggpoiiiiiiiwsssiiiiiijrrrrrffrrrnnnnczzzllltttxgq";
        assertEquals(204, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case15() {
        String s = "qxxxxcccccdddcccccxxxxxxvvv";
        assertEquals(74, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case16() {
        String s = "nttbeeeeplcbe";
        assertEquals(20, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case17() {
        String s = "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy";
        assertEquals(630, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case18() {
        String s = "yyyevpczzwhhuuszsswgggebg";
        assertEquals(35, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case19() {
        String s = "llaahoffpwwbbkkkktggazdqlcmrrrguuu";
        assertEquals(52, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case20() {
        String s = "jjjbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbdddddddddddddduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu";
        assertEquals(1479, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case21() {
        String s = "fqzzzrdetrrosnyfujbpdaxcjffxxoubbyyyomroddqoeqybqyeeidwiifooouppffzxpaeezhu";
        assertEquals(94, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case22() {
        String s = "nnnnnnnnnnnnnnnllfffffffffffffffff";
        assertEquals(276, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case23() {
        String s = "kviiiaaaahhhhiilacccmhavvvvvvvwftggggrrffjjfdddzkeeyyyjjjtqqqxxxxuuhhhhooa";
        assertEquals(150, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case24() {
        String s = "ffbyxxxxxxoooooxxxxxtttttffgllttttttjjjjjjjbbbbmvzzzzfffffooeeww";
        assertEquals(173, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case25() {
        String s = "rrrrrkfyyyyyyyeecccyyyqqqqfsssmmmhhhhhhhhhhiiiikkllddddfhhhffffffffgrrrzzzzzzzzlll";
        assertEquals(256, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case26() {
        String s = "porhegjrmabivlzpxooqj";
        assertEquals(22, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case27() {
        String s = "znnzzzzgrqmfnsldfuugf";
        assertEquals(29, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case28() {
        String s = "hpngosqjoiabqkmbcjdwwwwcctqazppvecuuamgbrzccmbmzilugbw";
        assertEquals(64, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case29() {
        String s = "bbbbb";
        assertEquals(15, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case30() {
        String s = "ttttttuuugggccccccvkhhhhzzzzzzmaaaadhhvvuuuuuuqqq";
        assertEquals(132, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case31() {
        String s = "gxbbddws";
        assertEquals(10, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case32() {
        String s = "qqxxbyyyyyywwwjssnvobglblczgdidndwkcivnywsssevqnvucccjjbvo";
        assertEquals(86, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case33() {
        String s = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
        assertEquals(1596, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case34() {
        String s = "vvvvvlmmoooooooooosssssssivvvvvvhhhhhhhhrrrrrrrlllkkkccccooooooooddddd";
        assertEquals(261, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case35() {
        String s = "ccaaaaaazzxxxxxgggggmmtttjfffnnllljjsnnyyyyzhhuwwwwwwwpssssbbbbbbbbbhh";
        assertEquals(191, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case36() {
        String s = "eeeeeeeeeeeehrrrrraaaaaaaajjjjjtttppppplllnnnynnvvvvvvhnnnnnnrrrrrrppppptjjjjjjvvvvvvvvvvrggg";
        assertEquals(345, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case37() {
        String s = "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv";
        assertEquals(3655, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case38() {
        String s = "bbeeenpbbnnnnbrrmmmmmnvvvvaaaledddbbbbvvvggseesjjjjjrrooxxqxxxjjddfrcccccccttt";
        assertEquals(165, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case39() {
        String s = "zzzzzzzzzzzzzzzzzzzmmm";
        assertEquals(196, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case40() {
        String s = "bkjjjjttvvvvvvvvvggggvvvvrrrrrzzz";
        assertEquals(101, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case41() {
        String s = "sopubaaqpmkjvzoohkkkykrdexnnaalqakzqgliszzvvvwgggtipusslnzbbbauh";
        assertEquals(82, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case42() {
        String s = "lllllbbbbbbbb";
        assertEquals(51, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case43() {
        String s = "xssqqkiissolldztrrsorrffmmmfjl";
        assertEquals(41, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case44() {
        String s = "vvzzyyyyaaaagooooooo";
        assertEquals(55, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case45() {
        String s = "cccccccnnnffftooqddlllllllllllllleehaooooizzzzzzbbyquuuuuuuuuhhlll";
        assertEquals(249, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case46() {
        String s = "tihnvpmpldwnuueesnhnfkggqqeiqrhaczzdddvybrttygrmi";
        assertEquals(58, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case47() {
        String s = "zalb";
        assertEquals(4, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case48() {
        String s = "zzzzzzzz";
        assertEquals(36, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case49() {
        String s = "kjrrttnnggnujjmppqqqqp";
        assertEquals(34, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case50() {
        String s = "uuuuugggggssssmmmmmmmmmmm";
        assertEquals(106, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case51() {
        String s = "dddddzzzzzzzz";
        assertEquals(51, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case52() {
        String s = "tgoicinmnegssbxpxycllnbasrqnlcyylisecdfaxljggxvpfwrsknbiddiksnrbmgggrnzxejw";
        assertEquals(83, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case53() {
        String s = "llllllllllllllllllllllllllllllllllllllllllllllllllllllllll";
        assertEquals(1711, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case54() {
        String s = "rurrrrxgglzzzznxx";
        assertEquals(31, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case55() {
        String s = "cfsjjbvuufjdhxwyipafmxtiesdynbrnjsvrkdvofueo";
        assertEquals(46, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case56() {
        String s = "gddddddgggggggggggggggggqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq";
        assertEquals(1660, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case57() {
        String s = "nllbbbbrrrrrrrrgggggllll";
        assertEquals(75, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case58() {
        String s = "lagudkhpmndjrjhfqtejellcuergulrjjqbtramtqxvlgpnbeqteibvpifbstbsrqmyruvxxsighudjerifjbnany";
        assertEquals(92, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case59() {
        String s = "qdaghcphnlzknzzeklxjbbnrthhutmedkwleveik";
        assertEquals(43, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case60() {
        String s = "rrrwddahzzzgjjzzzzzzzuuuuuuuuuuuuu";
        assertEquals(141, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case61() {
        String s = "yyylllltgggtthhhhsggggggfffffffffffeeffwwwwffssnnnxxxxxnvvvhatwbbzdddddfzkkjjeeeeeennnnnnnnnnnnvlldd";
        assertEquals(311, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case62() {
        String s = "jdrtttbbynnoqddeeeeeoxwvymjjddwmeefkkauuulvwsejbibiuattlmmnwwmwwwzbbbauvqqhrygiippggrjkvnapkhbbbnyyz";
        assertEquals(140, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case63() {
        String s = "ieeehhyffsccczzgzddggaprrhsssssszngguniieeaaooecbbbxmyyyyiioooxfhaafffahommqsqqbtttgnnpaaauvzzimzisy";
        assertEquals(159, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case64() {
        String s = "szzkkojjppxeaaadrnpqruiqjrcctghhhhmtzubbbbbbhwubwnniiixefbeellffppnnngzoloooouskkkuukrryjonnkkksdder";
        assertEquals(156, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case65() {
        String s = "llyyyhhhughhgggggggssssssllllllkjjjjjjjjjjjlllllllllllnnnnggjnsssggggfffzzzzzzzzzzcccccccccccccccccc";
        assertEquals(486, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case66() {
        String s = "zzzkkkkkkkkkkkkkkkkkkkkkkkrrttttjjjqqhhhhhmmmmmmmmmmmsssssssstttttttttttffxxxuujjjjjjjjjjjjyyyyyvvvw";
        assertEquals(599, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case67() {
        String s = "iownnimiixrkkpvvhgmmclnppufssddddtdmkkkjhhhlpmyyysvtkxxxxxxkeevjpppphhhhhhmiibbirurrrarrrrrseeecvfqa";
        assertEquals(177, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case68() {
        String s = "qkgrbbtbfhhjwfvvvozkaawffqrojjixycqmmybozfjjyypesdaickaaefyyvwjxnhmvllmqrccsddmakijxnbbsbetxmnnddofz";
        assertEquals(119, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case69() {
        String s = "goiihyziiuuudbmrmlxbjjjkzzhhgssswuiujjjjbdooowwwwwoqouttjaawcsssrwwtllkyeegvnmhhhlottuuvxwwkmmrwqxxv";
        assertEquals(148, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case70() {
        String s = "eetgzzxzqqqqaboiixamdssqvddyldtsxxoojnttndduekkjkeuzmdjgyyprewseeexjjoussiggguvdebeyyrjjdurcoeupmjjj";
        assertEquals(130, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case71() {
        String s = "qqmmmccchfquupppllllkgwwwwxxxennnnnqqwwddyyyyyyvnnnfwwtthhvvvwggblelkkiiifnnyipgggwwwwwwnggguukkkkkk";
        assertEquals(206, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case72() {
        String s = "zylttnwwmyufhpjbggcziqqiidaubbcwkcwddxzzxpreddymuccyvoussshnnsjjheepfggapppeqfskkpbtwwhfipwnelffwaak";
        assertEquals(124, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case73() {
        String s = "kkkllllwwwwwwllllfffffffooooooooooooooooosssssssssssssssssssssssssssssddggggggggggnnnnnwwwwwwwllllll";
        assertEquals(785, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case74() {
        String s = "olzzzzssqfyuutgzzssyomoodbbedpppwwwsswfnnneeeebtttooooxlpccxsskjussxanpqmgyyrphddahhnteeeerawwwwwdyy";
        assertEquals(160, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case75() {
        String s = "bygwwqcccccaaaaaaawprnboootvvddoyvpllgttttbffffhfoooofqqqzssbyyyrorrnnddifooobbbyyyyyxjjhhaztkhllsss";
        assertEquals(188, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case76() {
        String s = "qwumcrrmkxigdzznwdsgqhhqtdcilimxwjcbnphmfmoodlejkyxvdbvhjpxajxrslpwrkjrfxoagwuatxsppvfhzxbhlgbddwpfe";
        assertEquals(106, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case77() {
        String s = "zzzttttttkpprrxxxxxvcjjjjjjrrrrrzznnokkkklaayybbbbbrljfaaaveeeewwwwwwffzccssgghxxxmmnaaavvvzzzzxwwuu";
        assertEquals(221, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case78() {
        String s = "aaaaa";
        assertEquals(15, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case79() {
        String s = "asdjhaaahjbbbbjasdhjhsadjkhaskjdaxkjasdjhaaahjbbbbjasdhjhsadjkhaskjdaxkjaskljdkalsjdaiouiojjkqiuq";
        assertEquals(116, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case80() {
        String s = "aabbbccdeffggg";
        assertEquals(23, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case81() {
        String s = "abcdeef";
        assertEquals(8, squarescoresdiv2.getscore(s));
    }

    @Test
    public void case82() {
        String s = "aa";
        assertEquals(3, squarescoresdiv2.getscore(s));
    }

}
