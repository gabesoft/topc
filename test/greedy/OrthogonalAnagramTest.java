package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class OrthogonalAnagramTest {
    OrthogonalAnagram orthogonalanagram = new OrthogonalAnagram();

    @Test
    public void case1() {
        String S = "dcba";
        assertEquals("abcd", orthogonalanagram.solve(S));
    }

    @Test
    public void case2() {
        String S = "edcba";
        assertEquals("abdce", orthogonalanagram.solve(S));
    }

    @Test
    public void case3() {
        String S = "aaaaa";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case4() {
        String S = "abba";
        assertEquals("baab", orthogonalanagram.solve(S));
    }

    @Test
    public void case5() {
        String S = "qwqeqrqtqyquqiqoqpqaqsqdqfqgqhqjqkqlqzqxqcqvqbqnqm";
        assertEquals("aqbqcqdqeqfqgqhqiqjqkqlqmqnqoqpqrqsqtquqvqwqxqyqzq", orthogonalanagram.solve(S));
    }

    @Test
    public void case6() {
        String S = "qwqeqrqtqyquqiqoqpqaqsqdqfqgqhqjqkqqqzqxqcqvqbqnqm";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case7() {
        String S = "ererrereeeererererererrererereeererererererererrrr";
        assertEquals("rereererrrrererererereererererrrererererererereeee", orthogonalanagram.solve(S));
    }

    @Test
    public void case8() {
        String S = "a";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case9() {
        String S = "zy";
        assertEquals("yz", orthogonalanagram.solve(S));
    }

    @Test
    public void case10() {
        String S = "yz";
        assertEquals("zy", orthogonalanagram.solve(S));
    }

    @Test
    public void case11() {
        String S = "yy";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case12() {
        String S = "gap";
        assertEquals("apg", orthogonalanagram.solve(S));
    }

    @Test
    public void case13() {
        String S = "topcoder";
        assertEquals("cdeoport", orthogonalanagram.solve(S));
    }

    @Test
    public void case14() {
        String S = "heyicanwritesomestoryhereinsteadofrandomtext";
        assertEquals("aaacddeeeeefeehhiiimmnnnoooorrrrssstttttwxyy", orthogonalanagram.solve(S));
    }

    @Test
    public void case15() {
        String S = "qwertyuiopsdfghjklzxcvbnmaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaabcdefghijklmnopqrstuvwxyz", orthogonalanagram.solve(S));
    }

    @Test
    public void case16() {
        String S = "aaaaaaaaaaaaaaaaaaaaaaaaaqwertyuiopsdfghjklzxcvbnm";
        assertEquals("bcdefghijklmnopqrstuvwxyzaaaaaaaaaaaaaaaaaaaaaaaaa", orthogonalanagram.solve(S));
    }

    @Test
    public void case17() {
        String S = "aaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbb";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaa", orthogonalanagram.solve(S));
    }

    @Test
    public void case18() {
        String S = "aaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbabbbbbbbbbbbbbb";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case19() {
        String S = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcab";
        assertEquals("baabaabaabaabaabaabaabaababccbccbccbccbccbccbccbcc", orthogonalanagram.solve(S));
    }

    @Test
    public void case20() {
        String S = "bacabacadedededebacabacadedededecabacabadeedeedee";
        assertEquals("ababababaaaaaaaacbbcccdccdedededeeeeeeeeeddeddedd", orthogonalanagram.solve(S));
    }

    @Test
    public void case21() {
        String S = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyz";
        assertEquals("bbaaddccffeehhggjjiillkknnmmppoorrqqttssvvuuxxwwzy", orthogonalanagram.solve(S));
    }

    @Test
    public void case22() {
        String S = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwyz";
        assertEquals("bbaaddccffeehhggjjiillkknnmmppoorrqqttssvvuuyzww", orthogonalanagram.solve(S));
    }

    @Test
    public void case23() {
        String S = "abbbcdddefffghhhijjjklllmnnnopppqrrrstttuuuvwwwxzy";
        assertEquals("bacdbbefddghffijhhkljjmnllopnnqrppstrruuttvuxyzwww", orthogonalanagram.solve(S));
    }

    @Test
    public void case24() {
        String S = "twasbrilligandtheslithytovesdidgyreandgimbleinthew";
        assertEquals("aabadbdddeeeeeggghhhiiiiiillllmnnnorrssstttttvwwyy", orthogonalanagram.solve(S));
    }

    @Test
    public void case25() {
        String S = "abeallmimsyweretheborogovesandthemomerathsoutgrabe";
        assertEquals("baabaaabdeeegegeeheehhillmmmmnoooororsrrststuttvwy", orthogonalanagram.solve(S));
    }

    @Test
    public void case26() {
        String S = "bewarethejabberwockmysonthejawsthatbitetheclawstha";
        assertEquals("aaabaaabbbcceheeeeeehhhhijjklmnoorrssstwttttttwwwy", orthogonalanagram.solve(S));
    }

    @Test
    public void case27() {
        String S = "tcatchbewarethefubjubbirdandshunthefrumiousbanders";
        assertEquals("aabaabcbbbcdddfeeeeefhhhhiijmnnonrrrsrssttttuuuuuw", orthogonalanagram.solve(S));
    }

    @Test
    public void case28() {
        String S = "natchhetookhisvorpalswordinhandlongtimethemanxomef";
        assertEquals("acaaaddeeeefghhhhhiiikllmmmnnonnnoooooprrssttttvwx", orthogonalanagram.solve(S));
    }

    @Test
    public void case29() {
        String S = "meemmeeeeemememmememmemememmemmmemeememmeemmeeemme";
        assertEquals("emmeemmmmmememeememeemememeemeeememmemeemmeemmmeem", orthogonalanagram.solve(S));
    }

    @Test
    public void case30() {
        String S = "fhfhffffhhfhffhfhffffhhhhhfhhfhffhfhhfffhhhhhffhhh";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case31() {
        String S = "mmmumuumuuumuummmmmummmmmuuuummmumumumuuuumuuuuum";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case32() {
        String S = "jhjjjjjtjthtthtjjjhtjjjtjjtttjhtjhhthjhjjjjjjhhhjh";
        assertEquals("hjhhhhhjhjjjjjjhhhjjhhhjttjjjtjjtjjjjtjttttttjjjtj", orthogonalanagram.solve(S));
    }

    @Test
    public void case33() {
        String S = "fxffwffwxwfffxxwxxfxwfffxxffwwffxwffffxfwxffwffwwf";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case34() {
        String S = "lllzllzzzllbzblbzzzzbzbbblzzlzzblbzbzblbblbblbll";
        assertEquals("bbbbbbbbbbblblblbbbllllllzllzlllzzlzlzzzzzzzzzzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case35() {
        String S = "hbbhbjjjbbbbbbjhbhjhbhjbhbjjhjhjhjhhhhhhbjbjbhjjbj";
        assertEquals("bhhbhbbbhhhhhhbbhbbbhbbhjjbbjbjbjbjjjjjjjhjhjjhhjh", orthogonalanagram.solve(S));
    }

    @Test
    public void case36() {
        String S = "jxjjccxjjjcxcccxcjxcxcjjccccxjjcjccxjjjjccjxjxjcjc";
        assertEquals("ccccjjccccjcjjjcjccjcjccjjjjcccjcjjcxxxxjjxjxjxxxx", orthogonalanagram.solve(S));
    }

    @Test
    public void case37() {
        String S = "hihhagighhhssiasihhhhbhshhagsihghhhhahhbhbabghhbhh";
        assertEquals("ahaahhhhaabhhhhhhbbbbhghgghhhhghgiiihiihshhhhsshss", orthogonalanagram.solve(S));
    }

    @Test
    public void case38() {
        String S = "ivrzzvzvvizzrvirrriiiriirzivzviirrvvzzzrvrrvzvizri";
        assertEquals("riiiiiiiiriiiirivvrrrvrrvrrrrrvvvzzzvvvzzzzzvzzvzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case39() {
        String S = "kdkddkkkddkkddddkkkdkddkqkkdkdkkkkkkddkkddddddkdkd";
        assertEquals("dkdkkdddkkddkkkkdddkdkkdkddkdkddddddkkddkkkkkkdkqk", orthogonalanagram.solve(S));
    }

    @Test
    public void case40() {
        String S = "pnnppnnpntpnnpnnppppppnppnnnnnppppppnnnknppnpnnpnp";
        assertEquals("kppnnppnppnppnppnnnnnnpnnpppppnnnnnnpppppnnpnppnpt", orthogonalanagram.solve(S));
    }

    @Test
    public void case41() {
        String S = "kkkkkkkkkkkkkkkkkkkkkkkkykkkkkkkkkkkkkkkkkkkkkkkkk";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case42() {
        String S = "bbnnnnnnbnnnnbbbnnnbbnbnnnbnnnnbnbbbnnnnnnnbnnbbnn";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case43() {
        String S = "ggggggaggggqggqagagjajgjggggggjqgggaggqaqgjgggqggg";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case44() {
        String S = "kckvvvfbbvkvfbfvffkvfbvfccbcbkcfcbvvbckbbckkkkcffc";
        assertEquals("bbbbbbbccbbbcccccccckffkfffffffkfkkkkkvkkvvvvvvvvv", orthogonalanagram.solve(S));
    }

    @Test
    public void case45() {
        String S = "eeszijpjmpismjszspejjypsijnispspijyypimsjymyj";
        assertEquals("iieeeiiiijjjjmjjjjjmmmnppppppspsssssssyyyzyzy", orthogonalanagram.solve(S));
    }

    @Test
    public void case46() {
        String S = "zfffffifzfxfqffqflflxfzllifxflffxffzffffcfzfil";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case47() {
        String S = "wwczwcwcwwwccwzwwcwwwcccwwcwwccwcwccwcccwcwwwccccc";
        assertEquals("ccwccwcwcccwwccccwcccwwwccwccwwcwcwwcwwwcwczzwwwww", orthogonalanagram.solve(S));
    }

    @Test
    public void case48() {
        String S = "xxixnxxiixiixiiiixxxxinxixiixxiiniixiixxxixiixiixx";
        assertEquals("iiniiiinnixxixxxxiiiixxixixxiixxxxxixxiiixixxixxii", orthogonalanagram.solve(S));
    }

    @Test
    public void case49() {
        String S = "hhhhhffffhhffhhffsffhfhffhhhfffhhffhhhhhxffhhhffff";
        assertEquals("fffffhhhhffhhffhhfhhfhfhhfffhhhffhhffffffhhfsxhhhh", orthogonalanagram.solve(S));
    }

    @Test
    public void case50() {
        String S = "iivviirviiviviivvvviviiiviivvvvvivviviviiivmirvvii";
        assertEquals("mriirviivvivivviiiivivvvivviiiiiviivivivvvivvviivv", orthogonalanagram.solve(S));
    }

    @Test
    public void case51() {
        String S = "mamumreueermkmjaejjeerrqdrmemjrcmanjmmqareecridejr";
        assertEquals("acaaacddijeeeeeejeejjeejjknmqmmmqmmmrrmmmrrrurrrru", orthogonalanagram.solve(S));
    }

    @Test
    public void case52() {
        String S = "yzztyzipzzypipztyizyzdyiyiizizpiiytyiiytidiyityztd";
        assertEquals("dddiiipiiiiipiiiipiipttttttyyyyyyzyzyyzyyzzzzzzyzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case53() {
        String S = "qhguwhqqgqswqhughwqqyggutyuwqwqnuxqnirqyqhqgsnxnxw";
        assertEquals("gghgggghhhhinnnnqqrsqqqqqqqqsqtqquuuuuwwwwwwxxyxyy", orthogonalanagram.solve(S));
    }

    @Test
    public void case54() {
        String S = "nknnkpknkppnkpnppmnppnknmnnnpnnnnkmnnnnmxvnpxnnnnk";
        assertEquals("knkknnnknnnknnknnnknnknmnmmmnppppnnppppnnnpnnpvxxn", orthogonalanagram.solve(S));
    }

    @Test
    public void case55() {
        String S = "qqaaaafqaaqqqqaqqafafqqqfqaaaqaqfaqaqaaaaqqfaqfaqq";
        assertEquals("aaffffaafqaaaaqaaqqqqaaaqaqqqaqaqqaqaqqqqaaqqaqqff", orthogonalanagram.solve(S));
    }

    @Test
    public void case56() {
        String S = "qbqqsqsqqqszrqrqqqqszqsqzqsqbqqsszqqqyrqqsqbqrqzqq";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case57() {
        String S = "rrrrttrrrttrmtrrtcrrtrttrcrtcrcrtrmtrrtrrtrrrrrrct";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case58() {
        String S = "xxxgfgxxzxsgpxpipixxizagzipxwgggzggpaaapacycwspxga";
        assertEquals("aaaaaaccfggiggggggggpiiippsppppswwxxxxxxxxxxxyzzzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case59() {
        String S = "tetttttxeettttttttetttttttetetteexeetteettttetetet";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case60() {
        String S = "jyaarhhhhhaqbmhrmihnhkhimawqkanhwhbqakrmaahbahaqwj";
        assertEquals("aabbaaaaaabaahihhhihjhjhhhhhhhkkkmmmmnnqqqqrrrwwyw", orthogonalanagram.solve(S));
    }

    @Test
    public void case61() {
        String S = "ffffaflafffcfffafflffffaffffffffllffffafcfffffffff";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case62() {
        String S = "qkdqqtwhgtqspwgwzqxtcgtqwgtgcgyzqmwsythdhdpqzspozp";
        assertEquals("ccgdddgghggghhkmoppppqqsqqqqqqsstttttwtwwwwxyzzzyz", orthogonalanagram.solve(S));
    }

    @Test
    public void case63() {
        String S = "fvfvfffffffffvvvvfffffvffffvffvvfffvvffvfvvffffvfv";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case64() {
        String S = "rwdppzyjwmylwwmxwqwhdizimmmkrjerwpxdkqxrxhzlxexwew";
        assertEquals("ddedeehhiijjkkllmmmmmpppqqrrwrrwxwwwwwwwyxxxyxzxzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case65() {
        String S = "fvirsefysnsfsfjyqvsdevvfjffnjsnnfpjvfnifsfvffdviif";
        assertEquals("ddeeffiffffififffffffijjnjjpnnqrnnssssssvsyvvvyvvv", orthogonalanagram.solve(S));
    }

    @Test
    public void case66() {
        String S = "mmmppmmmppppppppppzppppppppppmpmpppmmmpmpmpmmmpppp";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case67() {
        String S = "vniburruruvvuarbrraarvxrvvvanbrvrxnvuvbradnrdbuaar";
        assertEquals("aaaaaaabbbbbddinnnnrurrurrrrrrururrrvuuvvvvvvvvvxx", orthogonalanagram.solve(S));
    }

    @Test
    public void case68() {
        String S = "ooonnnoononnkkokoookonnnnoonoonnnknonnnnonokonkkon";
        assertEquals("kkkkkkkkonoonnnnnnnnnoooonnonnooononoooononnnonono", orthogonalanagram.solve(S));
    }

    @Test
    public void case69() {
        String S = "oooiiiooiioiooxxiidxxxydoiooyyioiiyiixodioxdidiiii";
        assertEquals("dddddoiiooioiiiiooiiiiiiioiiiioiooioooxoxxyxxxxyyy", orthogonalanagram.solve(S));
    }

    @Test
    public void case70() {
        String S = "daeaboabbbdaqceccccbccbbcbccdbeacccbccccddbcedaacc";
        assertEquals("ababaabaaacccbcbbbbcbbccbcddccccdddcdeeeccceccccoq", orthogonalanagram.solve(S));
    }

    @Test
    public void case71() {
        String S = "pjjlmjutmlgjhqtgujgxgmxljjggpxgpjjlkjjuhpjgupjgkmp";
        assertEquals("ggggggggghhkjjjjjkjjjjjjlljjllmmmmppppppqttxuuuuxx", orthogonalanagram.solve(S));
    }

    @Test
    public void case72() {
        String S = "eehebhpppehhhphhpehieeihphehihbhebeeeeieiehieiejee";
        assertEquals("bbbheeeeeheeeeeeeheehheeeehehihihhhhhhjipiipipippp", orthogonalanagram.solve(S));
    }

    @Test
    public void case73() {
        String S = "sjrsyokaooyxarzskoyrzouloksysasyyskuyjzrssuokouzkj";
        assertEquals("aaajjjlkkkkkkoooorooororrsususussussssxyyyyyyzzyzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case74() {
        String S = "zozuzwswadvzzsopudvapoaujsaoaopzuouzaodosvsodovjoz";
        assertEquals("aaaaaadddjdjoopoooooopooopsssssuvuvuuuvvwzzzzzzzzw", orthogonalanagram.solve(S));
    }

    @Test
    public void case75() {
        String S = "tsyyssfysygvysgggtfstssgglgtsggvfgsysgvssyvfygtgfg";
        assertEquals("fffffggggglgggsssggggggssssstsssssttttyvvvyyvyyyyy", orthogonalanagram.solve(S));
    }

    @Test
    public void case76() {
        String S = "lnlllnnlnlnnllnlnlnlnnllllllnnnnlllnllnlllnnlnnlln";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case77() {
        String S = "rpprouufoffpoqdorfpiuduooofqdfpurpfrpoouruorouuoqu";
        assertEquals("dddffffifooffoopooooooopppopppqqqrruuuururuuurruur", orthogonalanagram.solve(S));
    }

    @Test
    public void case78() {
        String S = "mivvvowlwvvlvvliiwwwivlwmmwuwawumouwuovwmwvuwuwiml";
        assertEquals("aliiiiimlllmlmmmmooouuuuuuvvvvvwwwwvwwwvwvwwvwvwww", orthogonalanagram.solve(S));
    }

    @Test
    public void case79() {
        String S = "vbooodvoeryorrooeelrlynerryyeerovryvoeeoeyeoyroyld";
        assertEquals("bddeeeeeleeeeellnoooooooooooorvrrvrrrrryyryyvyyvyy", orthogonalanagram.solve(S));
    }

    @Test
    public void case80() {
        String S = "ciaaciaaicacaiaicccciccaaicaciiicicaiaicaaiaicaiaa";
        assertEquals("aaccaaccaacacacaaaaaaaaciaiiiacciciiciciiiciciicii", orthogonalanagram.solve(S));
    }

    @Test
    public void case81() {
        String S = "fykpykpkkyyoyfykkffkokkpypoyyyooffkyfyfykoyykkyyyy";
        assertEquals("kffffffffkkkkkkookyyyyyykyykkkyyyyykyoyoyyooyypppp", orthogonalanagram.solve(S));
    }

    @Test
    public void case82() {
        String S = "fqfqqqqffqqqfqqqqqfqqffqqfqqffqqqfqqqqfqqqfqfqffqf";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case83() {
        String S = "hgohghqghhrrhqohrqrroqhrrqrhroghrrqohhqrrhgohrhrhq";
        assertEquals("ghgghgghoohhohhohhhhhhohhhoqqrrrqqrrrrrqqrrrrqrqrr", orthogonalanagram.solve(S));
    }

    @Test
    public void case84() {
        String S = "kkeekekkekknkekeeknknknkknkenkekknkckkkkeenkkknkek";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case85() {
        String S = "knkllxgackwrxyllzklxmpomlflllkkllkfllllyrwodwllckm";
        assertEquals("accdffkgklkkkkkkllmlllllmlmnollopllrrwwllllwxxxyyz", orthogonalanagram.solve(S));
    }

    @Test
    public void case86() {
        String S = "sdmbmbfzzfmdzmfmfjmrrffjifdjdnuuindznzufmzmzzmzxid";
        assertEquals("bbddddddfiffffififfjjjmmmmmmmmmnnrnrzszzzuzuuzxzzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case87() {
        String S = "nsssbsbsssssssssybsysssnssssbssbsssnbssynssssssnsb";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case88() {
        String S = "hhhhnhhhhhnnhhhnnhhhhhhhhhhhnnhnhhhhnhnhnhhnhhnnnn";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case89() {
        String S = "mmmppmppmpmmmpmpmmppmmpppppmmppmmmpmmmpmmmppmppppm";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case90() {
        String S = "ggdggjogggdggmgmmmmgdmggggdmgdgdmggmggmggggmmdgmdm";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case91() {
        String S = "uejaujrujjuaejvaejjjuuoujjeaiojurvrrjuuaujuvjjujoj";
        assertEquals("aaaeaaeeeijjjojjjoorjjjjrrjjjjrjuuuuujjuvuvuuuvuuu", orthogonalanagram.solve(S));
    }

    @Test
    public void case92() {
        String S = "wpahhuwhekeeehsueshuhqxvfuuukxuexshspheywszeqeuphf";
        assertEquals("aeeeeeeefefhhehhhhkhkhhpppqqsssssuuuuuuuuvwwwxxxyz", orthogonalanagram.solve(S));
    }

    @Test
    public void case93() {
        String S = "zgzgzllllllllggzlllllllllllzglzzgzzlzlzglzlzllllzl";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case94() {
        String S = "czxclncmccqomqlonxcmhcomccnonnxczcmumoxmznqcuxunxm";
        assertEquals("hcclcclcmmcccccccmmnmmmnmnonoonnnooqqquuuxxxxzxxzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case95() {
        String S = "rrrrrrroorrrrryrrrrrrrrrroyrrrrrrrrrrryrrrrrrrroro";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case96() {
        String S = "whtttmthwtwmtwwthtwhwhtthwtttwwmhtmthtwmwmwhwmttmt";
        assertEquals("hmhhhhhmhhhtmmmmmmttttwwttwwwttttwtwtwtttttwtwwwww", orthogonalanagram.solve(S));
    }

    @Test
    public void case97() {
        String S = "myhrwhzmythczyyypmyzmrypmzkqyvhyyxhvvhmwyorytmehmv";
        assertEquals("cekhhmhhhhmhmmmmmomppqrrrttvvwvvwyxyyyyyzyyzyyyyzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case98() {
        String S = "cccccccccmccccccccmccccmcmcccccmccmmccccmccmcccmcc";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case99() {
        String S = "hfhttyththhttffhhtthhthhththttihhthtthhttytgtftgtt";
        assertEquals("fgfffghthtthhtttthhtthtthththhttththhtthhththtityy", orthogonalanagram.solve(S));
    }

    @Test
    public void case100() {
        String S = "vhidzedzdvvppvoiddtcfvpzccttvettieptzxhtrffvfddkvz";
        assertEquals("ccceddededdddffffhhiiikopppprtvvtttvtttvvvvxzzzzzv", orthogonalanagram.solve(S));
    }

    @Test
    public void case101() {
        String S = "xqqqctdxxfdqqiidxxssgccqxtqnvixqxxofkisaikpxqaxioq";
        assertEquals("aaccdcfddgfiikkiiiinoopsqqsqqqqsqqqqtxxxxxxtxxvxxx", orthogonalanagram.solve(S));
    }

    @Test
    public void case102() {
        String S = "nzzrzzzzrvzznznrzrnnnrzzzzzzznzvznnzzvzrzzvnzvrrzz";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case103() {
        String S = "isssoossisossszssiiiizizsosisswiososzsiioswsssooss";
        assertEquals("oiiiisiisisiiisiosssssssososoosssososossswswzzsszz", orthogonalanagram.solve(S));
    }

    @Test
    public void case104() {
        String S = "qqsqgwsgwssqwgsggsogssosomossssssmqcgiqosggsowogwg";
        assertEquals("cgggiggmgggggmgoooqoooqoqssqqqwwwssssssswsswssssss", orthogonalanagram.solve(S));
    }

    @Test
    public void case105() {
        String S = "vvllvlvlvlllvvvllllllvvlvvlvvvvvvvlvvlvvvlvvlvvvlv";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case106() {
        String S = "twgwtgvwtwvwgwtgvwvwvwvvvwgwwgggtwwtvwttwtwgwtgwwt";
        assertEquals("ggtggtggggggttvtwtwtwtwwwtwttwwwwvvwwvwwvwvwvwwvvw", orthogonalanagram.solve(S));
    }

    @Test
    public void case107() {
        String S = "vivivvvvivviivivivvvivvvvivvvivvvvvvvviivviiivivvv";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case108() {
        String S = "uuotrbumlmtuoatmmmooogmottrltjblymmotguorrlrjmytur";
        assertEquals("abbggjjlmlllmmmooommmmomoooorrrrrrttuttttttuuuuuyy", orthogonalanagram.solve(S));
    }

    @Test
    public void case109() {
        String S = "dsseedwsdvwdyvwssyjvsddsveesdpsdsssdwwsywwwywsevys";
        assertEquals("eddddeddeddedejpvsssvssvsssvssvswwwssswsyyywywwwwy", orthogonalanagram.solve(S));
    }

    @Test
    public void case110() {
        String S = "xhxichcxciicnhxhicxchxqxihxicicchxxxiccqxxxqcxxcix";
        assertEquals("cccchchchcchccccchhhiixixxixxxxxxiiixxxxiinxxqqxxq", orthogonalanagram.solve(S));
    }

    @Test
    public void case111() {
        String S = "ievvtvvievvivvevvkeeevtvvivveetivvvvtttvvvevttvkvt";
        assertEquals("vveeveevveeveeveivvvviviivikvvvvktttvvvtttvtvvtvtv", orthogonalanagram.solve(S));
    }

    @Test
    public void case112() {
        String S = "cmmrrwwmrrwrwmrmxrrhrrwhmhmrzrarhcrrwrwmarmawarcmr";
        assertEquals("aaaaccchhhhmmrmrmmmmmmmrrrrwrwrwrrwwrwrrrwrrrrwrxz", orthogonalanagram.solve(S));
    }

    @Test
    public void case113() {
        String S = "vugxtnynjfndnnjekoeddbdbenxbynkbmfynjhxkdjqnxdghnu";
        assertEquals("bbbbddddddeeeffgghhjjjjkkkmnnonnnnnqnnntuuvxyxxxyy", orthogonalanagram.solve(S));
    }

    @Test
    public void case114() {
        String S = "cccccccccccccccccccccccccccccccccccccccccccccccccc";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case115() {
        String S = "izihiiizzhzzizzzhiizziizhzhzihhzzzizhzzhiiiizzziiz";
        assertEquals("hhhihzzhhzhhzhiizzziizzizizizzziiiziziizzzzziiizzi", orthogonalanagram.solve(S));
    }

    @Test
    public void case116() {
        String S = "hhhghdhdbrwddhadddrrddyhdwryarrnnygydsdharddndlnhr";
        assertEquals("aaabdgdgdddhhddhhhddhhddhddddhlrrnnnnrrrrsrrwwyyyy", orthogonalanagram.solve(S));
    }

    @Test
    public void case117() {
        String S = "ssuxnussxexxunussisixunnnxsnqiiexesnsxsxtxunssxnns";
        assertEquals("eeeiiiinnnnnnqnnnntsssssssusssssssuxxuxuxuxxxxuxxx", orthogonalanagram.solve(S));
    }

    @Test
    public void case118() {
        String S = "ytayattetayettttttaaeattttattaatatatatttaataaataat";
        assertEquals("tatttaatatttaaaaaattttaaaataattatatateeettytttytty", orthogonalanagram.solve(S));
    }

    @Test
    public void case119() {
        String S = "pqpyzaqippizpipzpappiqppppqppaiqhpphpzpzpxpzppzypp";
        assertEquals("apapppppahpphpipipiippiqqqpqqppppxypypzpzpzpzzppzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case120() {
        String S = "fcfcfkfkfkfckkfkcckfkkffkffkkfkfffkkkkkkkfkkkfkcff";
        assertEquals("cfkkkckckckkcckfkkfkffkkfkkffkfkkkfffffffkfffkfkkk", orthogonalanagram.solve(S));
    }

    @Test
    public void case121() {
        String S = "eaeeegeweweeegeeaegeeagwwwaaaaeegaggegeaawaaaaeaew";
        assertEquals("aeaaaaaaaaaaaaaaegeggeeeeeeeeeggeeeegegeeewwwwwwwg", orthogonalanagram.solve(S));
    }

    @Test
    public void case122() {
        String S = "dhhshssffhshfhfsssddshssllhhsdshfhsklssslyssssfllh";
        assertEquals("fddddffhhfffhkshhhsshshhsssshshssshsslllsslllyssss", orthogonalanagram.solve(S));
    }

    @Test
    public void case123() {
        String S = "znnzqlzyejfjzzemezqpymfzznimimvynzniyfmsynmmmzfzmi";
        assertEquals("eeeffffiiiiljjmnmmmmmnmmmpnnnnqqsvyyzyzzzzzzzyzyzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case124() {
        String S = "lmvlvvmhmmvlvvmlmllllllvammvvmvmmmmvmvllmvvmmcjmlv";
        assertEquals("achjlllllllmlllmlmmmmmmllvvmmvmvvvvmvmmmvmmvvvvvvm", orthogonalanagram.solve(S));
    }

    @Test
    public void case125() {
        String S = "jsojosjsllgsomjjmtjojjjjjjoujglojugsjjmjjjgjcjtgjo";
        assertEquals("cgggggljjjjjjjlljjmjmmoooojjojjjojjjosjsssjsjtjtuu", orthogonalanagram.solve(S));
    }

    @Test
    public void case126() {
        String S = "eenjhjnbqnwhoonzqnnyqnzqezjnqznzqohenqjonnqhqyhnoq";
        assertEquals("bheeeehhhhjjjjonnoonnonnnnnonnqnnqqqqwqqqqyqyzzzzz", orthogonalanagram.solve(S));
    }

    @Test
    public void case127() {
        String S = "uuuuuuuuuuuuuzuzuuuuuuuuuuuuuuuuuuuuuuuuzuuuuuuuuu";
        assertEquals("", orthogonalanagram.solve(S));
    }

    @Test
    public void case128() {
        String S = "cqqqqqcqqqcqqcqcqqqqcqqcqqqcqqqqccqqcqccqqqqccqqcc";
        assertEquals("", orthogonalanagram.solve(S));
    }

}
