package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class DoubleLetterTest {
    DoubleLetter doubleletter = new DoubleLetter();

    @Test
    public void case1() {
        String S = "aabccb";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case2() {
        String S = "aabccbb";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case3() {
        String S = "abcddcba";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case4() {
        String S = "abab";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case5() {
        String S = "aaaaaaaaaa";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case6() {
        String S = "zzxzxxzxxzzx";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case7() {
        String S = "aababbabbaba";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case8() {
        String S = "rxmxzwjmvuxdwvnzeuuyxnqerjyywwqeewsgsagdguwttyag";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case9() {
        String S = "jczacqxvqzcvockopujxkauxxxhhpx";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case10() {
        String S = "mccwrkydwkmyrd";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case11() {
        String S = "nmbtptlyvonbvyllqfhryqhmrplfyo";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case12() {
        String S = "bxwtqqbxsafiishwyaaxysabsftxhb";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case13() {
        String S = "yrlzlcdnjbzrncydjb";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case14() {
        String S = "rr";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case15() {
        String S = "myrmyr";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case16() {
        String S = "ampmkaqvndpdkvqn";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case17() {
        String S = "dmtsdjglisjglhmkxgkclegglkcsgsktjbebthjtix";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case18() {
        String S = "xhdyfhotyxtovdktadfvvaykatvayoyyod";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case19() {
        String S = "pkdujjlussdanvkkjpanvlakaj";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case20() {
        String S = "xyzxdgedymvzkolbelmgovkb";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case21() {
        String S = "gqjowaognvsgwucjdsnuijdgxscpaipxsjvq";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case22() {
        String S = "zzetimfuzuhzhdewfidwerrnment";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case23() {
        String S = "zzvv";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case24() {
        String S = "ss";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case25() {
        String S = "zphzhrrp";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case26() {
        String S = "myjmnmrruuqmneoqgkekmyorvrjmgv";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case27() {
        String S = "dngexedyubyvykhvyzkghxubzn";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case28() {
        String S = "hvutuwnqddtquhnoeuznnzoewv";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case29() {
        String S = "hotmqhvsstmvqo";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case30() {
        String S = "wgbkmkliwndvvejnzedemkbqjlgnenzvvkdibqbd";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case31() {
        String S = "pyvpnfpmnyfrpzppbyerqvfxfxmzybnqeddn";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case32() {
        String S = "vutdtmvvihlmtdrecvhtlrceiwzhtuwthz";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case33() {
        String S = "tttatooa";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case34() {
        String S = "vtmedefvtgtrubjbybefjganmbndrjevawijwybvivbvtu";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case35() {
        String S = "ffzfdppucafacduzff";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case36() {
        String S = "hjwjwh";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case37() {
        String S = "bkrcddbcrjbxdujrznxlvknklzhhcjrjbdqkhqhvcu";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case38() {
        String S = "emkxilnedipbnqdeplxmnbndqsnxdsxken";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case39() {
        String S = "rfqeqbzrinbdnfqifqzmnndmef";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case40() {
        String S = "lplbflsyjpjsyfbl";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case41() {
        String S = "uuxduuwwerfubrruexzbdnbyntrxbetfyddzxe";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case42() {
        String S = "hhkhkinkknhi";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case43() {
        String S = "nacanc";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case44() {
        String S = "yhiiiiryhr";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case45() {
        String S = "xpkhbunuxobhbyimuiyouknbpimi";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case46() {
        String S = "bqatpsataaktpiftiktnlnwfkdqsnkiiablwdnta";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case47() {
        String S = "wkmomsbcjdfoqbgkrgcmpdcfskooolpmqgoroqeoggwqlkcgej";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case48() {
        String S = "jgjollllojgjgesoofnqbdmfbbfmdxcrpprcxbqnfooseg";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case49() {
        String S = "kerxssxrekdfccfd";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case50() {
        String S = "zvloolvzpnwwnptt";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case51() {
        String S = "mzsdxxgddgdatmrrmapvvpaoohlqjjqlcchtazroorzszm";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case52() {
        String S = "zrssrtjjtzaxwgzzgfqmmqfbbwxa";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case53() {
        String S = "bsxqdfeggefgjjgdqzccwyrmkhhkmrywzxsb";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case54() {
        String S = "vcaiuppuilsoeeoslnnacv";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case55() {
        String S = "fibbgvhhvgif";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case56() {
        String S = "zxqbbqxz";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case57() {
        String S = "uxwzxnjxooxjnvvxzwxu";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case58() {
        String S = "ibapovddvopabi";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case59() {
        String S = "vychiitthcyvjnfnnfnj";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case60() {
        String S = "clyffffylcdbuubdktqtnaantqlwwltrxllxrkmnsoosnm";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case61() {
        String S = "mm";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case62() {
        String S = "awommowa";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case63() {
        String S = "weewxiwavjsmmyysjvawigzisswwizgx";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case64() {
        String S = "iiauuahhofxxfjjoxttx";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case65() {
        String S = "vkqqmzzmkvlcclqnvllvvlxddxaqqarrlvhzknyynkzhnq";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case66() {
        String S = "arrabmmlvvlbtrrtccmmzkkiizwttw";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case67() {
        String S = "nllnzxcclpbffbplxzduooudfmmxnnxfhsshlzzgjcgkkgcjgl";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case68() {
        String S = "pljffsjjsssjllkarrakpplczzkbvvbkbbwbbwiicp";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case69() {
        String S = "htvyhhyvth";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case70() {
        String S = "hcvmrskpbggbpksrmvch";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case71() {
        String S = "liafvatioswcwxcvvcxwcwsoitavfail";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case72() {
        String S = "vafkjjjjkfaccvwwkqqkemmejjuizziufjjf";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case73() {
        String S = "uu";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case74() {
        String S = "okkoppxxbbyehheybwksskwb";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case75() {
        String S = "nwbdnndeyyezwzjjzwzbwjjnrmgxxaggaggmhfxxfhmgmr";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case76() {
        String S = "xlpplx";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case77() {
        String S = "vjqqjzeezxxxscjjbzwwzbjjczbqdgvctgrssrgtcvgdqbzsxv";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case78() {
        String S = "ukqzohhotjjtzqku";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case79() {
        String S = "ljazsifhkriksdmkkmdskirkhfiszajl";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case80() {
        String S = "vmlbddbbblmbsccsbv";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case81() {
        String S = "rhlfaakkaafeggeleedkkfqqfdccmhhmoccooohr";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case82() {
        String S = "ofuukicbbcddikfxbbxoxx";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case83() {
        String S = "hiihehheuudllduu";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case84() {
        String S = "dllcylfztfftzflrxuuxrqppaxrrxaqyclld";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case85() {
        String S = "osjjhhso";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case86() {
        String S = "vvrroeolnpptxxddugguttrrtnloeorrwlljjw";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case87() {
        String S = "tzzt";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case88() {
        String S = "nbbzzbbn";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case89() {
        String S = "ecpvbjaabuuooxxxxtlejfppfjeltbarqubejjebuqrajbvpce";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case90() {
        String S = "iisbyxccngfhhzppzfgnjpillipttlljvvcaacxybsii";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case91() {
        String S = "mlgssgwxpsspxwgslgcerqecimmiceqrecglsglm";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case92() {
        String S = "fvwlgzbwggwbmhhmwddwzglwvf";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case93() {
        String S = "ftgziqqjjgeegqqiefmbysdeedsybmfyeeyezgtf";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case94() {
        String S = "ywoyhlqltvvtlqlhyowy";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case95() {
        String S = "bommohhaabbbsxwsswpttnnkkpwwxsrrhhsssxxfzhhzfffsvv";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case96() {
        String S = "gxjjxjbgcttcgbjgjixxuddeeuijdkkd";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case97() {
        String S = "izsyrvwbsxlwgvwdqwellewqdwvgwlxsbwvryszi";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case98() {
        String S = "a";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case99() {
        String S = "aba";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case100() {
        String S = "abc";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case101() {
        String S = "abbc";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case102() {
        String S = "aa";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case103() {
        String S = "abcdefghijklmnoonmlkjihgfedcba";
        assertEquals("Possible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case104() {
        String S = "aaa";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case105() {
        String S = "ab";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

    @Test
    public void case106() {
        String S = "aacdfdf";
        assertEquals("Impossible", doubleletter.ableToSolve(S));
    }

}
