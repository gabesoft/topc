package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class EllysNewNicknameTest {
    EllysNewNickname ellysnewnickname = new EllysNewNickname();

    @Test
    public void case1() {
        String nickname = "tourist";
        assertEquals(6, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case2() {
        String nickname = "eagaeoppooaaa";
        assertEquals(6, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case3() {
        String nickname = "wuuut";
        assertEquals(3, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case4() {
        String nickname = "esprit";
        assertEquals(6, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case5() {
        String nickname = "ayayayayayaya";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case6() {
        String nickname = "naaaaaaaanaaaanaananaaaaabaaaaaaaatmaaaaan";
        assertEquals(16, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case7() {
        String nickname = "topcoder";
        assertEquals(8, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case8() {
        String nickname = "petr";
        assertEquals(4, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case9() {
        String nickname = "rng";
        assertEquals(3, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case10() {
        String nickname = "o";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case11() {
        String nickname = "z";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case12() {
        String nickname = "icanwritewhateveriwanthere";
        assertEquals(26, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case13() {
        String nickname = "withoutitimjustespr";
        assertEquals(18, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case14() {
        String nickname = "ifyouarereadingthisthenyouhadabadtime";
        assertEquals(31, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case15() {
        String nickname = "ihaveagirlfriendwhoishot";
        assertEquals(21, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case16() {
        String nickname = "truestory";
        assertEquals(8, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case17() {
        String nickname = "nozaphodjustveryveryimprobable";
        assertEquals(29, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case18() {
        String nickname = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case19() {
        String nickname = "oooooooooooooooooooooooooooooooooooooooooooooooooo";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case20() {
        String nickname = "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case21() {
        String nickname = "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case22() {
        String nickname = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case23() {
        String nickname = "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case24() {
        String nickname = "aeiouyaaeeiioouuyyaaaeeeiiiooouuuyyyaaaaeeeeiiiioo";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case25() {
        String nickname = "iuyaoebiayueocouyaiediuoeyafaoueiygaeiouyheiouyaje";
        assertEquals(15, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case26() {
        String nickname = "ababababababababababababababababababababababababab";
        assertEquals(50, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case27() {
        String nickname = "bababababababababababababababababababababababababa";
        assertEquals(50, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case28() {
        String nickname = "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        assertEquals(3, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case29() {
        String nickname = "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbba";
        assertEquals(50, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case30() {
        String nickname = "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv";
        assertEquals(50, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case31() {
        String nickname = "rbfrkgbfdeucpwkarccbivcrbi";
        assertEquals(25, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case32() {
        String nickname = "kjlekulcvwirvdskzgjyjplffppiiexmhloamqscuv";
        assertEquals(39, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case33() {
        String nickname = "uiycznflymwrciolotnfsfnzabxcqgungtekjtmyona";
        assertEquals(39, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case34() {
        String nickname = "onaovcvosvcdwspeziesjuuwigzugnarammlsyndcfxt";
        assertEquals(41, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case35() {
        String nickname = "afugqdvncbuuzugawjoushz";
        assertEquals(21, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case36() {
        String nickname = "cbitjifhcbzwymyghyreyefifyszivaamidhqghcsij";
        assertEquals(40, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case37() {
        String nickname = "lrnqlyenrdanmrjlyaepykcfzmdstdzvulasglsokanopzgor";
        assertEquals(46, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case38() {
        String nickname = "qlorydemf";
        assertEquals(9, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case39() {
        String nickname = "csnmyzthdleelqhdvtentrbsbpagoyiflbvvhpaj";
        assertEquals(37, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case40() {
        String nickname = "owpowayovjmrgqkyghpkhofaozsupifkeozsfqlmmmnnwoyltq";
        assertEquals(45, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case41() {
        String nickname = "xybsug";
        assertEquals(6, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case42() {
        String nickname = "mezirmkvoooubvec";
        assertEquals(13, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case43() {
        String nickname = "zgbhjtcofezfsiidkvjcndhjskcuercnvboxrfgenew";
        assertEquals(41, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case44() {
        String nickname = "ufemdzwywvqvpzcejmwpvoadvuideyznrqoijmufssojo";
        assertEquals(41, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case45() {
        String nickname = "cegpymhiflfsbuiom";
        assertEquals(15, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case46() {
        String nickname = "bzeawztdbovblmxtig";
        assertEquals(17, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case47() {
        String nickname = "cfrevrnwbghou";
        assertEquals(12, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case48() {
        String nickname = "bncpsapvtmivpdrbecrjmthinzojo";
        assertEquals(29, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case49() {
        String nickname = "pdarteulifujlypy";
        assertEquals(15, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case50() {
        String nickname = "ksmtdiighkcjieqsjsffwbvc";
        assertEquals(22, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case51() {
        String nickname = "htvpnvzliybysdapqts";
        assertEquals(18, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case52() {
        String nickname = "gjzvppesbkzgkuzhkcjzlvfjwkebijy";
        assertEquals(31, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case53() {
        String nickname = "gy";
        assertEquals(2, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case54() {
        String nickname = "bwuoinhldczuunshqluwmdodxdjmfyxquqygdp";
        assertEquals(35, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case55() {
        String nickname = "tmrpbtzgavolirhhtscfgdwyj";
        assertEquals(25, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case56() {
        String nickname = "cryiqmbldkqyuyglmhovbdz";
        assertEquals(20, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case57() {
        String nickname = "fahftldrofn";
        assertEquals(11, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case58() {
        String nickname = "owtmagglgezrdsdlzmmnbrlwq";
        assertEquals(25, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case59() {
        String nickname = "wgvecgyffhfryyjlavjpeaggo";
        assertEquals(23, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case60() {
        String nickname = "azcjcewih";
        assertEquals(9, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case61() {
        String nickname = "gupjyfqhoywqjykdpacuvwiwvulgvrxclezthgswq";
        assertEquals(40, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case62() {
        String nickname = "xfulndahwga";
        assertEquals(11, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case63() {
        String nickname = "hadctavumob";
        assertEquals(11, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case64() {
        String nickname = "ygbxbvkockrclujpfjhhoeqsgxvruwbifejvkfx";
        assertEquals(38, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case65() {
        String nickname = "gcvrvewcmzsohjmyuytz";
        assertEquals(18, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case66() {
        String nickname = "wmuffkhizfvgniyv";
        assertEquals(15, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case67() {
        String nickname = "uptlzbbuwodfpwnmatfhpwepcbuukafzmchdkzqbgraetvfsyy";
        assertEquals(47, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case68() {
        String nickname = "cmgsqrifwxqbylucwwpflzgcakynek";
        assertEquals(30, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case69() {
        String nickname = "negpxihnxengrbcjwcmvzqbazppqincxygchfybvw";
        assertEquals(41, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case70() {
        String nickname = "gjatqujpmnxahyssszqcqiutnrk";
        assertEquals(26, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case71() {
        String nickname = "gzalojbhggxleqfimqrbjgxcltlvqytysybv";
        assertEquals(36, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case72() {
        String nickname = "ghbgnudfnpacy";
        assertEquals(13, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case73() {
        String nickname = "sohzddvhd";
        assertEquals(9, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case74() {
        String nickname = "gktdnmhqhstzvytr";
        assertEquals(16, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case75() {
        String nickname = "grzvn";
        assertEquals(5, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case76() {
        String nickname = "etnxhcowbffvrrabupizfwj";
        assertEquals(23, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case77() {
        String nickname = "lrspvqxiaqoifkwogkhnbbzjswzeieuto";
        assertEquals(28, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case78() {
        String nickname = "fiqea";
        assertEquals(4, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case79() {
        String nickname = "dcgutrrzxhkvygzdcqn";
        assertEquals(19, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case80() {
        String nickname = "qfxhptukwvfalmrnswy";
        assertEquals(19, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case81() {
        String nickname = "fjhbiazzwlrthcfrepycusjhlj";
        assertEquals(25, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case82() {
        String nickname = "yzstbivenlhicsdcy";
        assertEquals(17, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case83() {
        String nickname = "kedfpv";
        assertEquals(6, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case84() {
        String nickname = "jqunavdsufxwyzmhzstrgqowhqzokqfkbxwijystbrvac";
        assertEquals(45, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case85() {
        String nickname = "papevvhdtukusothheorlmwycxnt";
        assertEquals(27, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case86() {
        String nickname = "yzjjufvefukcanlvxdwnmrsbrdduorjqdaxaeooboqppeonz";
        assertEquals(43, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case87() {
        String nickname = "fexknwcxpiedfmliruauitoom";
        assertEquals(20, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case88() {
        String nickname = "eyssbpwmffdfiq";
        assertEquals(13, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case89() {
        String nickname = "pyuubydyavhmkurlowfkq";
        assertEquals(18, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case90() {
        String nickname = "hxwtzwxkeqixrmgtutpjltkwvbwwib";
        assertEquals(30, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case91() {
        String nickname = "unawwpflrcryfvvzrgxfjbwdozskrqfjjafscjknmbjdumzq";
        assertEquals(48, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case92() {
        String nickname = "txdhkiuttrfxxgirlqmmbbwvkrdpbthsdftbrphnqw";
        assertEquals(41, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case93() {
        String nickname = "cjmbpwkwafhxobfrggbn";
        assertEquals(20, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case94() {
        String nickname = "jtmjrqbdrklobmpbxgtvsnrvopfwi";
        assertEquals(29, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case95() {
        String nickname = "tvpcjxmod";
        assertEquals(9, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case96() {
        String nickname = "e";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case97() {
        String nickname = "iyoubjjw";
        assertEquals(5, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case98() {
        String nickname = "vekplsgpymbccleqmchrsagrijzfainhg";
        assertEquals(32, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case99() {
        String nickname = "byhhopszufxtrgwccrdrwcofvuwwktw";
        assertEquals(31, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case100() {
        String nickname = "hgaerqxzqxhpklmpucnrxumpf";
        assertEquals(24, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case101() {
        String nickname = "abbbbbbbb";
        assertEquals(9, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case102() {
        String nickname = "aeiouy";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case103() {
        String nickname = "yabcdyyyaa";
        assertEquals(5, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case104() {
        String nickname = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        assertEquals(50, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case105() {
        String nickname = "yyyyyyyyyyyyyyyyyy";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case106() {
        String nickname = "aaa";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case107() {
        String nickname = "yyyy";
        assertEquals(1, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case108() {
        String nickname = "yyyyyyyyyyyaeiouasdfaslyyyyy";
        assertEquals(8, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case109() {
        String nickname = "kayaiyjai";
        assertEquals(4, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case110() {
        String nickname = "dsfg";
        assertEquals(4, ellysnewnickname.getLength(nickname));
    }

    @Test
    public void case111() {
        String nickname = "siiiiiisiii";
        assertEquals(4, ellysnewnickname.getLength(nickname));
    }

}
