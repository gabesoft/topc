package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class LongWordsDiv2Test {
    LongWordsDiv2 longwordsdiv2 = new LongWordsDiv2();

    @Test
    public void case1() {
        String word = "AAA";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case2() {
        String word = "ABCBA";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case3() {
        String word = "ABCBAC";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case4() {
        String word = "TOPCODER";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case5() {
        String word = "VAMOSGIMNASIA";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case6() {
        String word = "SINGLEROUNDMATCH";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case7() {
        String word = "DALELOBO";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case8() {
        String word = "WLRBMQBHCDARZOWKYISXJWFEFNGPNFUVTVU";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case9() {
        String word = "KVJCGRPAGHNOZKWYBULEXMKTSTQFQIDQT";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case10() {
        String word = "ZYNXUDIJQFJWZAVMLROCMBGVKVTSEAZHPH";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case11() {
        String word = "CRWGNJGQSZDTORPYFYMVYHBIHARLKLELUCXC";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case12() {
        String word = "EDEQBMNRMPWXTJUTKPIMESVSHFSZGOALYGCGZ";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case13() {
        String word = "VGSQETXRVKDWYPILUYHKNCNZOVABMFJFMBA";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case14() {
        String word = "EQDTWJYMOTRSNVAUALAGEZBEXPFKHIXCX";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case15() {
        String word = "IPCVYESTDUKVZAJFJMBZGCRCHNQHPOXWPLI";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case16() {
        String word = "EUCPEIWNDJBEGOZAVHKQHFXRAYZGSTGMLM";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case17() {
        String word = "CBKDYTZFWQFLEVZOYJMBRABGPGIXSUGNCHC";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case18() {
        String word = "MPYPLVQAFVJNXULBWOLCHSZIRSMTDTMKGKEK";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case19() {
        String word = "LCWMIBWQCZUTCSOENFYRJHNPGXEAEDVLKL";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case20() {
        String word = "ODVCYQGDJMTUJWXZILKNXESBWPOAROHFH";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case21() {
        String word = "ZIJHPAVFBZXQXZCWYNOELWMUWRDCKGSCT";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case22() {
        String word = "KDUZLEOQLXAMKWHVKSISTYSJBNJFPRGRFJC";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case23() {
        String word = "RYUVSCVMUQATYIBHPDLBYNGXJGZKNFOFWFRER";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case24() {
        String word = "MPYFGSBLCEDRFTFMVZVAVMHNQHKWXIXKJHOUO";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case25() {
        String word = "VGNLTNUHQNBADKASCBEYPYVFZJZRVIXMOIWI";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case26() {
        String word = "IZFLTFMACXOHAJKVINYBYDUYGRGSNWPNQIE";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case27() {
        String word = "YTRQPEKRMTYILIWBYUDAZDSDGXVFHGJNCJUOU";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case28() {
        String word = "RCFXAXVUMXKZGURPDEKQEGKNUHMVVUQOZXLBWGWIGGKMCBDIHOYNUJBQSPMQJCEKBSMXAKHGSTTUUWCDMDRHOSZ";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case29() {
        String word = "JLWSPDFQVRPVBXETQXPNVUQIXHRLBQTKCQFRVKKQBZNEYRZPQOEMIUWHEPSFFMSJEXDBJNTMOGSNARESFIG";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case30() {
        String word = "ECXIRSOZGII";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case31() {
        String word = "HLNQAGEPMWEONIHUSNKWSKFJCVIIDTWKGJCJPGADCESROBLGQWEIIJUKGCUJXQVEBXNQF";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case32() {
        String word = "TJTNAHOMPFKTPSFJELOAXLSURTUGJZVEJOSLXIXMPHIFBPQHCEHBSZWJSSSDTNIEECQBKNQCXAJAPZIRGPTY";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case33() {
        String word = "RHJJZNCPVHTXZWJMMNLMYMDYWXELQECJLOUNBYCYHXXGTIVG";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case34() {
        String word = "GUUUAUQXAEPEGYSUUHXSJXA";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case35() {
        String word = "UIZFDHBKEXGEUXDWBSBJSVGMCDG";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case36() {
        String word = "BIVXRWCUGFGKFNQZMVXNNYYHVEVZKDMNMHKDGPXMUE";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case37() {
        String word = "BTOCFJAUYASHWZCVJFKWTTIWZXWLUCJVVXY";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case38() {
        String word = "IYWGAQPWPTUABEWUZHRZENKAPWYMTYOEWMMWECVWVRWWVVRWCIVIXIJOEHAZFQDDEQBISYEPPBMMWFJAPGIMOTCUCEUJUZO";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case39() {
        String word = "RSGLQNBIOPUMUFMJMWXCSZXUDTGXU";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case40() {
        String word = "XMMFZFSANIPJULRIUDHRHZQEVTZBSWWRKKXJR";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case41() {
        String word = "KGABQUPHFJMOBTNTAKPBMJXKBHWYROPDUPGMMVVTHHHKDWDDGUGUEEEFNDFERUJNMSCYPXRWHYGKWMPCIVZMBDTPIYVZVHPHZR";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case42() {
        String word = "QWERTYUIOPLKJHGFDSAZXCVBNMNBVCXZASDFGHJKLPOIUYTREWQ";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case43() {
        String word = "QWERTYUIOPPOIUYTREWQ";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case44() {
        String word = "TETBTE";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case45() {
        String word = "ACDAXA";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case46() {
        String word = "ABACA";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case47() {
        String word = "ABABABABABA";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case48() {
        String word = "TXTYEZEKFLF";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case49() {
        String word = "THETOPCODER";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case50() {
        String word = "ABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABA";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case51() {
        String word = "ABCDAEFGAHIJA";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case52() {
        String word = "ABAB";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case53() {
        String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case54() {
        String word = "A";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case55() {
        String word = "ABADCECB";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case56() {
        String word = "AA";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case57() {
        String word = "ABACADA";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case58() {
        String word = "ASDBDSA";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case59() {
        String word = "BCDEFBXYD";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case60() {
        String word = "AABC";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case61() {
        String word = "ABCBDAEB";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case62() {
        String word = "ABCAB";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case63() {
        String word = "XAXRYZYSXY";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case64() {
        String word = "TESTES";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case65() {
        String word = "ABACAB";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case66() {
        String word = "ABCDD";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case67() {
        String word = "ABCXYZPQRSTAB";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case68() {
        String word = "ABACADAK";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

    @Test
    public void case69() {
        String word = "ABXCDXEFXGH";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case70() {
        String word = "ABCDCBA";
        assertEquals("Likes", longwordsdiv2.find(word));
    }

    @Test
    public void case71() {
        String word = "ABCADEAFGA";
        assertEquals("Dislikes", longwordsdiv2.find(word));
    }

}
