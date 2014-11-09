package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class FauxPalindromesTest {
    FauxPalindromes fauxpalindromes = new FauxPalindromes();

    @Test
    public void case1() {
        String word = "ANA";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case2() {
        String word = "AAAAANNAA";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case3() {
        String word = "LEGENDARY";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case4() {
        String word = "XXXYTYYTTYX";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case5() {
        String word = "TOPCOODEREDOOCPOT";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case6() {
        String word = "TOPCODEREDOOCPOT";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case7() {
        String word = "XXXXYYYYYZZXXYYY";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case8() {
        String word = "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSHSSSSSSSSSSSSS";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case9() {
        String word = "IIIIIIIIIIIIIIIIIIIIIIIIAAAAAAAIIIIIIII";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case10() {
        String word = "UUUUUUUUUUUUUUUUUUUUUUUUUYGGEGYYYUUU";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case11() {
        String word = "OOOOOOOOOOHPPPHHHHHHHHHHHOOOOOOO";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case12() {
        String word = "KKKKKKKKKKKKKKSSDSSKKKKKKKKKKK";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case13() {
        String word = "HHHHHHHHHHHHHHHHHEEPPEEEHHH";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case14() {
        String word = "WWWWWWWWWWWCECCCCW";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case15() {
        String word = "OOOOEEQQEEEEEEEEOOOOOOOOOO";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case16() {
        String word = "VVVVVVV";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case17() {
        String word = "NNNNNNNNNNNNNNNNNNNNNVVOOLOOVVNNNNNNNNNNNNNNNNNNN";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case18() {
        String word = "FFFFFFFFFFFFFFFKKKKFFFFFF";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case19() {
        String word = "SSSSSSSSSSSSKKKKKKKKTFTKKKKSSSSSSS";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case20() {
        String word = "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFQQQQQFFFFFFF";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case21() {
        String word = "GGGGGGGGGGGGG";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case22() {
        String word = "UUUUUUUUUUUUUXXXXGGGGGGGGGGGRGGXXXUUUUUUUUUUUUUU";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case23() {
        String word = "KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKFFFFFFFFFFKK";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case24() {
        String word = "XXXXXXXXX";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case25() {
        String word = "QQQQQ";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case26() {
        String word = "GFFFFGGGGGGGGGGG";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case27() {
        String word = "MMMMMMMMMMMMMMMPMMM";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case28() {
        String word = "K";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case29() {
        String word = "FGGGGGGGGGGGGGGGGGGGGUGGGGGGGGGGGGGGGF";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case30() {
        String word = "MQIIIQMMMMMMMM";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case31() {
        String word = "XXXXXXZZZZZLLLLLZZX";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case32() {
        String word = "LLLWWLLLLLLLLLLLL";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case33() {
        String word = "GGBBGGGGGGGGG";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case34() {
        String word = "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIJII";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case35() {
        String word = "LMLLLLLLLLLLLLLLLLLLLLLLLLL";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case36() {
        String word = "AAAAAAAAAAAAAAAAAAAAAAAAOAAAAAAAAAAAAAAA";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case37() {
        String word = "PYYAAYYYYYYPP";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case38() {
        String word = "SSSSSSSS";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case39() {
        String word = "UUUUUURURRUUUUUUUUUUUU";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case40() {
        String word = "MMMMMMMMMMUUUJUUMMMMMMMMMMMMM";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case41() {
        String word = "AAAAAAAAAAAAAAAAAAAAAAAANNAAAAAAAAAAA";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case42() {
        String word = "OOOOOFOO";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case43() {
        String word = "WWWWWWWWWBBBBCCBWWWWWWW";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case44() {
        String word = "KKKKKKKKKKKDKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case45() {
        String word = "PPPPPPPPPPPPPPPPYYYYYYYYYYYYDDYYYYYYPPPPPPP";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case46() {
        String word = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRMMMMRRRRRRRRRRRRR";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case47() {
        String word = "EEEEXXXXXXXXXXXWWDWWXXXXE";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case48() {
        String word = "WCSSBSCWWWWWWWWWWWWWWWWWWWWW";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case49() {
        String word = "VVVVVVVVVVVVVVVUUUUUUUUFAFFUUUUUUUUUUVVVVVVVVVVVVV";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case50() {
        String word = "EEEEWFFNNYNFWWWWWWWWWEEEEEEEEEEE";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case51() {
        String word = "MMMMMMMMMMMMMMMMMMMMMMMMMMHHHHHHHHHHHHHHM";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case52() {
        String word = "DDDDDDFDDDDDDDDDDDDDDDDDDD";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case53() {
        String word = "AAAAAAAAAAAAAAAAAAAAAASSSSAAAAAAA";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case54() {
        String word = "JJJJJJJJJJJJJJ";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case55() {
        String word = "KKKKKKKKTTTTTTTTTTETKKKKKKKKKKKKKK";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case56() {
        String word = "XXCX";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case57() {
        String word = "AAAAAAAAAAAAAAAAAAAAAAAAAAIEIAAAAAAAAAAAA";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case58() {
        String word = "SSSSSSSSSQQQQPJOOFFMFOJPPPPPQQQQQQQQQSSSSSSS";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case59() {
        String word = "ZZZIIIIIIIIIIIIIIIIIIPZDEEEWEEDDZPPPIIIIIIIIZZZ";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case60() {
        String word = "OOOOOOOHHHHWKKKKKKKKFFFFTJTFKKKKKKKKKKKKWHHHHO";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case61() {
        String word = "IIRRRRRRRDDDDDDDDDSSSSFFQBQFSSDDDDRIIIII";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case62() {
        String word = "OOMMMMMMLLLLLLLLFFFFFFFFQUUTUQFFLLLLLMMMMMMMOOOO";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case63() {
        String word = "GGGGGGPHHHHHHHHHHHHHHFWWWEEGEWFFHHHHHHHPPPPPPPG";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case64() {
        String word = "ZZZZZZZZZAAAAEEEEEEEEEBBJJJLLLOWWOLLJBEAZZZZZZZ";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case65() {
        String word = "XXXXXXXXXXXXXXXXXEEEEMMZMBLBMZMMEEEEEXXXXXX";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case66() {
        String word = "SSSSIIIXXXXXXXXXXXXFFONTTNNOFFXIIIIIISSSSSS";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case67() {
        String word = "KKKKKKKJJJJJJJJJJJJJJPTTDDONOOODDTTTTPPJKKKKKKKKKK";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case68() {
        String word = "ELUHHAGKTTAZZATTKGAHHULE";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case69() {
        String word = "EUKUHVWFWENAMKIHLEELHIKMANEWFWVHUKUE";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case70() {
        String word = "ZUKDHIBTNUICIUNTBIHDKUZ";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case71() {
        String word = "UASUGECOOFAJJHIASQZLUNVAVNULZQSAIHJJAFOOCEGUSAU";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case72() {
        String word = "ZKTHLUUNVNUULHTKZ";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case73() {
        String word = "TVMZDVHDSVCKCVSDHVDZMVT";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case74() {
        String word = "HNBGBHESEREWVYRYVWERESEHBGBNH";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case75() {
        String word = "COAPPTWIOEIBORCTZEIISYUYSIIEZTCROBIEOIWTPPAOC";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case76() {
        String word = "HJNYFFDMMDFFYNJH";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case77() {
        String word = "SNZUGBRQMSFHYHFSMQRBGUZNS";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case78() {
        String word = "ZDGKHFKUBUKFHKGDZ";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case79() {
        String word = "GIXWEJIQQIJEWXIG";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case80() {
        String word = "IBSJKTYFCDZHFSRYYRSFHZDCFYTKJSBI";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case81() {
        String word = "DRXNOBLLBONXRD";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case82() {
        String word = "BFNJGLYMEMYLGJNFB";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case83() {
        String word = "NIRSLVLLZUHOJIUBNTENFXFNETNBUIJOHUZLLVLSRIN";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case84() {
        String word = "BTZDRXZVHMQVZNWHIVCCVIHWNZVQMHVZXRDZTB";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case85() {
        String word = "LKRNBCOHRIBDNEHFKYTDSSSSDTYKFHENDBIRHOCBNRKL";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case86() {
        String word = "TNFFOJQQGDPWQTUMULQZNVVNZQLUMUTQWPDGQQJOFFNT";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case87() {
        String word = "ZJKSDMAPEYIXPHJKOIIOKJHPXIYEPAMDSKJZ";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case88() {
        String word = "ZUBWLCMSHNOPONHSMCLWBUZ";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case89() {
        String word = "CIOCIGCMGBUGXYXGUBGMCGICOIC";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case90() {
        String word = "JVVGGEYCCVCYHFMSILSOCWAVVAWCOSLISMFHYCVCCYEGGVVJ";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case91() {
        String word = "MGGKFMSPOHAHOPSMFKGGM";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case92() {
        String word = "RZRSOVTUHMYIAYRRFUQMFFSFFMQUFRRYAIYMHUTVOSRZR";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case93() {
        String word = "GISBBHQOQHBBSIG";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case94() {
        String word = "VRRODWGZBQRLLRQBZGWDORRV";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case95() {
        String word = "HSUEWFLOMMJOEIYTYSOERAWYWAREOSYTYIEOJMMOLFWEUSH";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case96() {
        String word = "HCOOVEPFQPPQFPEVOOCH";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case97() {
        String word = "MEPLXBSTZQIURNJPVPJNRUIQZTSBXLPEM";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case98() {
        String word = "HQQKGTDGGDTGKQQH";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case99() {
        String word = "KQWDWJNCZQZJGKKXJZPUUGUUPZJXKKGJZQZCNJWDWQK";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case100() {
        String word = "OBDYUEOFQKFQIYBPSFPBUGSGUBPFSPBYIQFKQFOEUYDBO";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case101() {
        String word = "VHYCGVDRRSOKKNVNKKOSRRDVGCYHV";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case102() {
        String word = "MFWWQQWOAHUQGFQPEVMMVEPQFGQUHAOWQQWWFM";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case103() {
        String word = "NKITLZUDEZMNKQMYNEJJENYMQKNMZEDUZLTIKN";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case104() {
        String word = "GGJQJUGQELLEQGUJQJGG";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case105() {
        String word = "ASAUCICCCCICUASA";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case106() {
        String word = "FMTBMRERMBTMF";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case107() {
        String word = "MQPRAFWGKPNMWHWKKWHWMNPKGWFARPQM";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case108() {
        String word = "KLPWCZUGVIRRVHHVRRIVGUZCWPLK";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case109() {
        String word = "NJAWHYGEJZDNFZOWUSPJPJPSUWOZFNDZJEGYHWAJN";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case110() {
        String word = "GJQIAQDTOSVJRXMOUFZZFUOMXRJVSOTDQAIQJG";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case111() {
        String word = "UYHMSDTKFICDOYUUPCCCCPUUYODCIFKTDSMHYU";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case112() {
        String word = "LYGTKZVSDUBVQZOYOZQVBUDSVZKTGYL";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case113() {
        String word = "QRYAGGHWXBXUWWDJMMJDWWUXBXWHGGAYRQ";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case114() {
        String word = "CDLPJDQXXQDJPLDC";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case115() {
        String word = "NCUZNRBUWWHGESHRGVUSUUKUUSUVGRHSEGHWWUBRNZUCN";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case116() {
        String word = "YOZDHOZOZPGJGTINMUPHNPPNHPUMNITGJGPZOZOHDZOY";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case117() {
        String word = "GASWAKUTTZNTQKHKQTNZTTUKAWSAG";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case118() {
        String word = "HHHHHHUDDNDUUUUHHHHHHHHHHHHHHHHHHHHHSHHHHHHHH";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case119() {
        String word = "YFRAJFEVVWTVEYSVVTIPLSLPITVVSSEVTWVVEFJARFY";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case120() {
        String word = "ZZZZZZZZZZZZZZZZGDDDDDTVTTTZDDGGGGGGGGGGGZZZZZZZ";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case121() {
        String word = "CJXEJACCAJEXJF";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case122() {
        String word = "NNNNNNNNUUUGUUUUUUUUUUUDDJJJJGGJDDDDDDDDDUUNNNNN";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case123() {
        String word = "LEWOFQQFAWEL";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case124() {
        String word = "UUUGUUUUHHHHHHHXXXXXXXXWXHHHHHHHUU";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case125() {
        String word = "PCAWKOVVEKDAUAZOOZAFADKEVVOKWACP";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case126() {
        String word = "FNNNNDNNNNNNNNHHHWWHNFFFFFFFFFFFFF";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case127() {
        String word = "SVZCLHRYJOXXOJYRKLCZVS";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case128() {
        String word = "SSSSSSSSSGGGGGCKKKTKKKCCGGGGSSSSSS";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case129() {
        String word = "PXMDCWGJATHKWTCKEOMKCSDSCKMOEKCTWKHTAJGWTDMXP";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case130() {
        String word = "OOOOWOOOIQQXQQQIOOOOOOOOOOO";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case131() {
        String word = "UDZKURZMHMJTRSDDSRTJMHUZRUKZDU";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case132() {
        String word = "FFFFFFFFFFFFFFFFFFFFRRRRRRRRORRRUCCUURF";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case133() {
        String word = "HFKXVRMQTWSOTQGSNNSXDVQVDXSNNSGQTOSWTPMRVXKFH";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case134() {
        String word = "RRRJJJJJJOJJJJJBPBBJJRRR";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case135() {
        String word = "FLVASXQWIDSUYJFCGIMTAJKJJKJATMIGCFXYUSDIWQXSAVLF";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case136() {
        String word = "CCCCCCVVVVVVVVVVVLLLLLMULVVCCCCCCCCCCC";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case137() {
        String word = "CTZHTJBPYNKXCRYCQEJZHXOJVJOXHZJEQCYRCXKNYPBJTHZTC";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case138() {
        String word = "ZZZZZZZAAADDDVDCCDAAAAAAZ";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case139() {
        String word = "LTSISEDXVJQNKVQHFAERALAREAFQQVKNQJVXDESISTL";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case140() {
        String word = "WWWWDDDDDJJJBBJDDDDDWWWWWWTWWWWWWW";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case141() {
        String word = "TYJTEGYAMZMNRWZJVVJZWRNMZMAYGEQJYT";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case142() {
        String word = "FFFCZZZGZPFFF";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case143() {
        String word = "BLXIUZZUIMLB";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case144() {
        String word = "SSSSSSSSAAAAWAFJFASSSSS";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case145() {
        String word = "JWQFNUCEJPTYZQVTZOJWWJOZTVQZETPJECUNFQWJ";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case146() {
        String word = "TTTTTTTTTTTTTUOMOUUFTTTTTTT";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case147() {
        String word = "QQGTLJZLVQYSQSTBUYUBTSQSYQVLZJLTGXQ";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case148() {
        String word = "NNNNXXXXXXXXXXXXXCXJYJXXXXXXNNNNN";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case149() {
        String word = "HZFZYVHCAYGWRNMFYIHEALLAEHIYCMNRWGYACHVYZFZH";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case150() {
        String word = "QQQQQQQQQQQQQQQQQQRRRCCCCLILCCCCCRRRRRRRRZRRQQQQ";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case151() {
        String word = "CQHXXGAQQAGXSHQC";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case152() {
        String word = "GGGNGGGGGGGGGGGGGGGGGGGGIIIIIIKKKUKKIIIIIIIIIIIGG";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case153() {
        String word = "FXMGOQWBCFTTFKBWQOGMXF";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case154() {
        String word = "FFFFFFFFFFFFDDDDDDDDUUUJUDDDDDFFFFFFYFFFF";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case155() {
        String word = "TMIAHNSTBYLPZVQONOEQCKHKHKCQEONOQVZPLYBTSNHAIGT";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case156() {
        String word = "CCCCCCCCCCIIIIIIIIIIIWMMMWEC";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case157() {
        String word = "FWDTITDJF";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case158() {
        String word = "EIEEEPPPPPPPXXXKXPPPPPPEEE";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case159() {
        String word = "OPXCNGTRJULZVBNWGXJFQJJQFJXGWNBVZLUNRTGNCXPO";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case160() {
        String word = "FFFFFFFFFFFFFFFFFFFFFFFFEBBBBBBBBWWIIHHIWBBBF";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case161() {
        String word = "LWJOXKHGHTKWGAAJDAEESQYTVVTYSSEEADJAAGWKTHGHKXOJWL";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case162() {
        String word = "YYYFFFFFGFFFRIRFFFYYYY";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case163() {
        String word = "KPNCIJAZHUMZTYZMQETGGYIXHXIYGGTEQMZDTZMUHZAJICNPK";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case164() {
        String word = "AAMLLLLJJJJLLLLLALLLLLLLLMMAAAAAA";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case165() {
        String word = "FHJNYDOCMHTURHEGADOODAGEHRUTHMCODKNJHF";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case166() {
        String word = "RRRRWWWKKKWDWKWWWWWWR";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case167() {
        String word = "FDMABJOYDUBOBUDYOJAAMDF";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case168() {
        String word = "AT";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case169() {
        String word = "AAAABCAAAA";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case170() {
        String word = "ABCA";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case171() {
        String word = "ANNA";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case172() {
        String word = "TTOOTPPPOOOOT";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case173() {
        String word = "ASDFGA";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case174() {
        String word = "XYZYMX";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case175() {
        String word = "AANA";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case176() {
        String word = "AB";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case177() {
        String word = "AABBCBA";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case178() {
        String word = "AANNAA";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case179() {
        String word = "ABBA";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case180() {
        String word = "ABBCBA";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case181() {
        String word = "A";
        assertEquals("PALINDROME", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case182() {
        String word = "KKOOOOOOOOOK";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case183() {
        String word = "ABC";
        assertEquals("NOT EVEN FAUX", fauxpalindromes.classifyIt(word));
    }

    @Test
    public void case184() {
        String word = "TTAAXAAT";
        assertEquals("FAUX", fauxpalindromes.classifyIt(word));
    }

}
