package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class FoxAndWordTest {
  FoxAndWord foxandword = new FoxAndWord();

  @Test
  public void case1() {
    String[] words = { "tokyo", "kyoto" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case2() {
    String[] words = { "aaaaa", "bbbbb" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case3() {
    String[] words = { "ababab", "bababa", "aaabbb" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case4() {
    String[] words = { "eel", "ele", "lee" };
    assertEquals(3, foxandword.howManyPairs(words));
  }

  @Test
  public void case5() {
    String[] words = { "top", "coder" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case6() {
    String[] words = { "aaa", "aab", "aba", "abb", "baa", "bab", "bba", "bbb" };
    assertEquals(6, foxandword.howManyPairs(words));
  }

  @Test
  public void case7() {
    String[] words = { "acaaacaabaabbbcbbbbabcabaac", "abaaababaababaaaacbbabbbacabcbc", "babbbbcbccbbbabcaacabccaaccaacccc", "ababaaaacbbabbbacabcbcabaaababa", "aaacbbabbbacabcbcabaaababaababa", "bbccabaacacaaaabbcccabbcaac", "accabbbccccbaacbacbabbccbcabacaaababccabcb", "cbccabcabaaabcbabacbacbacbbcacc", "cbabbbbcbccbbbabcaacabccaaccaaccc", "ababaaccbbaaccbcbcaaabbcbbbbbabcaccbabac", "bababacabccacbccababaabaaaabacaacbcca", "aaaacbbcbcbcacabacabbababccaabbba", "aaccaaccccbabbbbcbccbbbabcaacabcc", "bcababcccbabacaccaacccacababbcaabca", "bacccaabccbcaaccccbcbbccbbbbccccbabbbbb", "bcaaacaaccbbacbccaccbcbcaaaacaabcbabcb", "acacabbacbacccbaccabbabaacac", "aaaababbacabaccaabacbbabcbbacabbcbb", "ababbacbbaabccbacbbaaacacacbbb", "acabccbccbaaaabbbaacbccbbacc", "ccacabccbaabcbccbbbcbabbcababccba", "bbabbbacbbacaccccabbbabbcbabbbacaaacbccbbb", "bcaaabbbbbaabbaabccbbaccbaaabac", "baaacbaabbaacaccacbbbccbbcccbc", "bcbbaabcacaaacacbcccbcbbcbbcbaabaacaccacac", "abbcccbabaccabcacbbbbaabbccbabcccab", "ababbacaaaacbcabcaccccacabcac", "cbcbcacabacabbababccaabbbaaaaacbb", "ccbabbbbcbccbbbabcaacabccaaccaacc", "abacabbacababcacbcbabccbababacabaabb", "ccaacbccaacccacccbbbccaccccbbbaacacacbcacb", "bacccbcbabbbccccbcbbccaacaacaacaabc", "bcbabcabcbbacacaaabaaacccacbcacbbba", "bccaccbccccccacbcccccbabbabab", "bbcbbcbbabaabbbcbabacbacbbcbbbcccbcb", "bbbacaaccbcbbccabaaaacabbacabac", "aabbccccccbbccaaaabbcbbabbcbcbaaccabcaab", "aabaccbabccaccaaabbcaacbabcacabaabcbbcaa", "acbabcbbcbccaabacbacbacbbbbccbbbbcccc", "bbacabcacbacbacccaabbaaabaacbbcaabacacc", "accccbbbaacacacbcacbccaacbccaacccacccbbbcc", "ccbbbccaaccbbcccaaaacaaccbaabcbbbabbaaaa", "bcabbbbbaaaacacaabcacccabbcaccaaaacbc" };
    assertEquals(11, foxandword.howManyPairs(words));
  }

  @Test
  public void case8() {
    String[] words = { "fbkifigf", "ifjagkj", "jcacecc", "ghgcgak", "dhfhijddb", "iejaaeb", "jifjagk", "eeahfbiag", "kjifjag", "ghbdehe", "eghbdeh", "baikfgc", "kbcjikaj", "hdeabcaai", "eagecjjfi", "jcikdigig", "debbidbi", "gfbkiig", "begcdddk", "cibakjhck", "cdgbkhejh", "cbieajcfa", "fkaijja", "fjbccad", "dfddfgd", "edahhde", "fdabeied", "ecggbbcdb", "ebgaagg", "iiejiabf", "kegfhifdk", "bebceck", "ieddkcjfg", "kjfhhke", "fbdhjjji", "hkbbecdi", "afeccid", "dihkiccb", "gejijhiih", "hkefdfgdi", "ckacfjd", "iageeahfb", "kcgjdfe", "jhicikb" };
    assertEquals(5, foxandword.howManyPairs(words));
  }

  @Test
  public void case9() {
    String[] words = { "tpleiolbdjtfrlrtkilb", "cekepdkmqjbnoqoci", "fadbbiblcledebkejbdigaqlphler", "elgnekaceplgdqjksjogifdmlo", "pdkmqjbnoqociceke", "qjksjogifdmloelgnekaceplgd", "frlrtkilbtpleiolbdjt", "ijkqpdmrgnlgbhnqkhrqnbpjed", "jbnoqocicekepdkmq", "rtkilbtpleiolbdjtfrl" };
    assertEquals(7, foxandword.howManyPairs(words));
  }

  @Test
  public void case10() {
    String[] words = { "fsismkrmifgkljcqmidqjeea", "eeafsismkrmifgkljcqmidqj", "ismkrmifgkljcqmidqjeeafs", "sismkrmifgkljcqmidqjeeaf", "afsismkrmifgkljcqmidqjee", "jcqmidqjeeafsismkrmifgkl", "ljcqmidqjeeafsismkrmifgk", "qmidqjeeafsismkrmifgkljc", "kljcqmidqjeeafsismkrmifg" };
    assertEquals(36, foxandword.howManyPairs(words));
  }

  @Test
  public void case11() {
    String[] words = { "bcbdddcccaddaccbabacdaccbbdbcacacdcdbccd", "caddaccbabacdaccbbdbcacacdcdbccdbcbdddcc", "cacdcdbccdbcbdddcccaddaccbabacdaccbbdbca", "bbadaaaadbbddbbcbcdbabccbcaccaaacbddbcdac", "dbbddaacdbdddadbabbdcababcdddddbddda", "ddbddbcaabddaadcacaacbad", "aabbcaabadadcaba", "dddadbbddaacdbdddadbabbdcababcdddddb", "dacddbcddabbddcdacbaddabbadaaabacabd", "cccaddaccbabacdaccbbdbcacacdcdbccdbcbddd", "bdddcccaddaccbabacdaccbbdbcacacdcdbccdbc", "aacdcddcababdccdbbba", "ddabbddcdacbaddabbadaaabacabddacddbc", "bddbcaabddaadcacaacbaddd", "dacbaddabbadaaabacabddacddbcddabbddc", "acdcddcababdccdbbbaa", "dadcdcacdcadcbddbdaaaaddc", "badadcabaaabbcaa", "abddddaadbadabbabcbaaa", "bdbdcadbdbdccdaadac", "aaccddbbdbdcccbabbacbcdacdccacaddbbb", "bddcdacbaddabbadaaabacabddacddbcddab", "aabbbdabdcbcddbbabcdcdddadccdbbbaaacadbdccaa", "dbbacddaaabbaccdb", "aadaaddbaadcddccbdcadbcabaaabaadd", "cdacbaddabbadaaabacabddacddbcddabbdd", "aaaddadcabcddadbacbaabcadbccadaddabbcddadcccdca", "bcaabadadcabaaab", "ddacddbcddabbddcdacbaddabbadaaabacab", "dbccdbcbdddcccaddaccbabacdaccbbdbcacacdc", "cdaccbbdbcacacdcdbccdbcbdddcccaddaccbaba", "bdbcacacdcdbccdbcbdddcccaddaccbabacdaccb", "bdaaadcbddbdacbdbdddaaadcbcdabcabcadcdbdbccb", "dbaccaadbaddabccaabacdbdddbdddd", "bcbbbbbcbdcadbdaabcddcbabaddadaaaaaccccbacbadb", "baddbbadcacdbdabacddacdabbabcaddbcaccadcbaa", "dbbdcbabadaddacbddaacccacdcbccadacdcbc", "aaabacabddacddbcddabbddcdacbaddabbad", "daabaaddabadbdbdddbaccccbddcacbabb", "acdaccbbdbcacacdcdbccdbcbdddcccaddaccbab", "dcabaaabbcaabada", "badddbddbcaabddaadcacaac", "bdaabdaabccdcdadcbdbbbbbaadbbdacdda", "adaaddbaadcddccbdcadbcabaaabaadda", "dcaccdaabacdbbddcbcccdbcdbbcdda", "abcdbaddddccbdcda", "acbdababcaadbdadadbabcdbacadcbbacdab", "adadcabaaabbcaab", "dbbdbabbddabbccaaaaba", "aaaabdaaaabbddcaadaaa" };
    assertEquals(73, foxandword.howManyPairs(words));
  }

  @Test
  public void case12() {
    String[] words = { "kmcegahkceneelhaabei", "cemeofbojbiibdagkbdnakl", "knfhfhcenlcjoaojednid", "jbafomffejjjbgoehcikkla", "hmmgamcleeaaohghocmnien", "lcjoaojednidknfhfhcen", "kgbjdjoemkbgjcbjoehcgo", "efhdnjchojfcdmbfebdk", "bceklbgcobdodoogljelli", "ochiabbfnkbgaiceghngh", "ebjnbmdkboicnbocimiimml", "jododeideighgdegbahcfldi" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case13() {
    String[] words = { "oomdminclfldcghmdbmljimbnlajbgnonljjjmoeofncgkogk", "minclfldcghmdbmljimbnlajbgnonljjjmoeofncgkogkoomd", "onhbfcokagdomcgginmjmgceookokflbnbnkbfjciikimded", "bfcokagdomcgginmjmgceookokflbnbnkbfjciikimdedonh", "clfldcghmdbmljimbnlajbgnonljjjmoeofncgkogkoomdmin", "mcgginmjmgceookokflbnbnkbfjciikimdedonhbfcokagdo", "gginmjmgceookokflbnbnkbfjciikimdedonhbfcokagdomc", "eechcdfbmbbbkekgkifnoeacjifimfijjhmhd", "fbmbbbkekgkifnoeacjifimfijjhmhdeechcd", "fenddjofbdgkdcbeaeflcokbaaociaf", "cgkogkoomdminclfldcghmdbmljimbnlajbgnonljjjmoeofn", "jmlonhhlabbncmbc", "onhhlabbncmbcjml", "nkbfjciikimdedonhbfcokagdomcgginmjmgceookokflbnb", "ghmdbmljimbnlajbgnonljjjmoeofncgkogkoomdminclfldc", "nhbfcokagdomcgginmjmgceookokflbnbnkbfjciikimdedo", "imnnbaoejfhldkigahhdhlldanenlomenblonhnlabnclhng", "jmmaodakaeghaonojifhcjoodhknjnohmkgal", "oolancghciimegjlekonmbe", "bmbbbkekgkifnoeacjifimfijjhmhdeechcdf" };
    assertEquals(29, foxandword.howManyPairs(words));
  }

  @Test
  public void case14() {
    String[] words = { "eadfbccbffefcffaeadbb", "acbcbbadfb", "edcaafaabddeaededeccfbff", "aededeccfbffedcaafaabdde" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case15() {
    String[] words = { "ecceeaadddebaccbeeacadebdaecaccacadbccedcb", "dbccedcbecceeaadddebaccbeeacadebdaecaccaca", "aecaccacadbccedcbecceeaadddebaccbeeacadebd", "ecaccacadbccedcbecceeaadddebaccbeeacadebda", "dcbecceeaadddebaccbeeacadebdaecaccacadbcce", "ceeaadddebaccbeeacadebdaecaccacadbccedcbec", "bdaecaccacadbccedcbecceeaadddebaccbeeacade", "cbeeacadebdaecaccacadbccedcbecceeaadddebac", "adebdaecaccacadbccedcbecceeaadddebaccbeeac", "caccacadbccedcbecceeaadddebaccbeeacadebdae", "baccbeeacadebdaecaccacadbccedcbecceeaaddde", "ccacadbccedcbecceeaadddebaccbeeacadebdaeca", "cceeaadddebaccbeeacadebdaecaccacadbccedcbe", "acadbccedcbecceeaadddebaccbeeacadebdaecacc", "eaadddebaccbeeacadebdaecaccacadbccedcbecce", "accacadbccedcbecceeaadddebaccbeeacadebdaec", "eacadebdaecaccacadbccedcbecceeaadddebaccbe", "daecaccacadbccedcbecceeaadddebaccbeeacadeb" };
    assertEquals(153, foxandword.howManyPairs(words));
  }

  @Test
  public void case16() {
    String[] words = { "jhgjfdekdbgijfeeiich", "bcdkhbgcabifbdkfckgkhbkii", "idjcccjgjhghgajgkiaaebhhkjed", "ggebiccdedihbbdidfiiihbha", "iahhfcgckhdcbejg", "gkhbkiibcdkhbgcabifbdkfck", "bhehjgcgbjfacjacacbi", "habgdikcgcbbjdjadkgicacaijjik", "fgbeicfhcjbhgbbeadekafagjfdjbgihgh", "cdifkkccjjddcckkjjfkgikji", "ceddahbiiddgahekebfghchjdi" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case17() {
    String[] words = { "agocsomaqwtjnjm", "jnjmagocsomaqwt", "magocsomaqwtjnj", "suqnkwohsrjjkki", "ojdgqkmfmwpgpag", "wtjnjmagocsomaq", "somaqwtjnjmagoc", "qwtjnjmagocsoma", "hafafwbenltordagn", "pagojdgqkmfmwpg", "pgpagojdgqkmfmw", "aqwtjnjmagocsom", "gojdgqkmfmwpgpa", "jqnfnildiijna", "ocsomaqwtjnjmag", "nsobjbreidrjlff", "wlhttprcrtatg", "nkwohsrjjkkisuq", "wpgpagojdgqkmfm", "gqkmfmwpgpagojd", "ettnajqpkbqmp", "eqbchbholcadumkdf", "olcadumkdfeqbchbh", "vvtpvlajjmdkvfb", "geiseupvfwiilecm", "glpwriqdijfrtc", "dagnhafafwbenltor", "qnkwohsrjjkkisu", "ueqqavumkdfqc", "gbqwbtkusqnetjo", "omaqwtjnjmagocs", "maqwtjnjmagocso", "tjnjmagocsomaqw", "vopgdhbcakenktt", "ijnajqnfnildi", "benltordagnhafafw", "atgwlhttprcrt", "iogakihmdgmpvtbl", "wbenltordagnhafaf", "ecmgeiseupvfwiil", "nltordagnhafafwbe", "mhkrkkfkeoiaakls", "qkmfmwpgpagojdg", "chbholcadumkdfeqb" };
    assertEquals(95, foxandword.howManyPairs(words));
  }

  @Test
  public void case18() {
    String[] words = { "knlcfkohccpbkegfohihliaflnejgeif", "nmaoealnjelejibgma", "aoealnjelejibgmanm", "klkmgjleaahlcpdmjcmihhohjpai", "hlcpdmjcmihhohjpaiklkmgjleaa", "dlacdlpoabnmfbbcbebdmepicghkcimmepjmeejgpgkkminl", "aniapanhlmmiemfcalcljafalhefbbhnngopfpmcabbeno", "gdmnkogdmjpkcibihpcmlklidgnpbmegjeihfaonddjglolhi", "pcdebmoglmadpbhjjiigpgoienppnaambplbhj", "jpaiklkmgjleaahlcpdmjcmihhoh", "mgjenogeelgogakpmamlmalkgoknajp", "adpbhjjiigpgoienppnaambplbhjpcdebmoglm", "bbenoaniapanhlmmiemfcalcljafalhefbbhnngopfpmca", "jiccjdgflmonlbdaaiddjfjbochnjddfmkhakjofgbfogbdof", "chmmmbaofjaofaclammklnokfmdhgdmeckbbnkgim", "dhgdmeckbbnkgimchmmmbaofjaofaclammklnokfm", "fiejlmipoiijcpeljmkcgpimkojhjfbfdmfllgghakho", "gllbmgcdbdhgifoppaiaehckddfhpccadabbkkalbbcni", "ihhefmkphoohlpinmpkdbejfaemncjehjlijpgblbpoji", "ofeahjldindieccobfnc", "ljafalhefbbhnngopfpmcabbenoaniapanhlmmiemfcalc", "ojmgdlbaeiangibkcgmkemlakkmhinkhhkbenj", "enoaniapanhlmmiemfcalcljafalhefbbhnngopfpmcabb", "olokcdpgmihkbmfjkeghalhce", "ophiekmkimcjhkfakfbaebanmpfpekdpnn", "bdkjcnhbebkgcknojchjnaiedghehfajlfcinndgfgfdmdo", "opfpmcabbenoaniapanhlmmiemfcalcljafalhefbbhnng", "jcdpgafdbmlnphamfpjlkgagdengndlifcalhdekhb", "lfpacmefmcplinnacpccpkb", "acchjemaifkfnkdjpgmffppbnkgilchleogacfpbffjdnlbk", "ajkckalmlddogbifmmpealjdlia", "bohomalohomniblecjnajnkaoehalhfmkf", "hjpaiklkmgjleaahlcpdmjcmihho", "falhefbbhnngopfpmcabbenoaniapanhlmmiemfcalclja", "fbbhnngopfpmcabbenoaniapanhlmmiemfcalcljafalhe", "kdmhbohekonieabecefghaalfgpb", "bkogeikfkebhcbhgablcgajdackahjmfkieikfjgemcdifn", "anhlmmiemfcalcljafalhefbbhnngopfpmcabbenoaniap", "ffakjaheappnjpjhlnmkcgljajlkpeepaolodek", "gcjebnpedlfdpojelbafhniillonijhop", "cjhkfakfbaebanmpfpekdpnnophiekmkim", "jfgcofobfmcnpgckbkgedjbc", "adneidnoejgaliacahnmgoigcblmmanmfhh" };
    assertEquals(38, foxandword.howManyPairs(words));
  }

  @Test
  public void case19() {
    String[] words = { "idlcoeqlar", "oeqlaridlc", "coeqlaridl", "lcoeqlarid", "ldbkmiqgaipj", "kmiqgaipjldb", "qlaridlcoe", "kqpcifijihn", "saesrabdcg", "dlcoeqlari", "pjldbkmiqgai", "qgaipjldbkmi", "laridlcoeq", "cgsaesrabd", "abdcgsaesr", "jldbkmiqgaip", "aipjldbkmiqg", "mohehinhgqhs", "pcifijihnkq", "ibbahbe", "miqgaipjldbk", "dcgsaesrab", "febodksk", "qhsmohehinhg", "gsaesrabdc", "cqofcnpam", "dbkmiqgaipjl", "ihnkqpcifij", "ridlcoeqla", "qpcifijihnk", "nkqpcifijih", "iqgaipjldbkm", "jihnkqpcifi", "bkmiqgaipjld", "ipjldbkmiqga", "bdcgsaesra", "mcqofcnpa", "fijihnkqpci", "psgsacp", "ijihnkqpcif", "kfebodks" };
    assertEquals(129, foxandword.howManyPairs(words));
  }

  @Test
  public void case20() {
    String[] words = { "dkdhhhhalhklkdkhfaljaagedel", "hhhhalhklkdkhfaljaagedeldkd", "ldkdhhhhalhklkdkhfaljaagede", "kdkhfaljaagedeldkdhhhhalhkl", "lkdkhfaljaagedeldkdhhhhalhk", "dbjakdklbdjedggllflkcjebe", "eldkdhhhhalhklkdkhfaljaaged", "ebedbjakdklbdjedggllflkcj", "gkaahbdjclfgeecibhcegkkfb", "khfaljaagedeldkdhhhhalhklkd", "hbdjclfgeecibhcegkkfbgkaa" };
    assertEquals(23, foxandword.howManyPairs(words));
  }

  @Test
  public void case21() {
    String[] words = { "abbababababbaababbabaaaab", "baababbabaaaababbabababab", "bbaababbabaaaababbabababa", "abaaaababbababababbaababb", "abbbbbbabaabbabbabbbaa", "bbabaaaababbababababbaaba", "ababbabaaaababbababababba", "bababbaababbabaaaababbaba", "babaaaababbababababbaabab", "aaaababbababababbaababbab", "aaababbababababbaababbaba", "babaabbabbabbbaaabbbbb", "babababbaababbabaaaababba", "bababababbaababbabaaaabab", "abbabaaaababbababababbaab", "baaaababbababababbaababba", "babbbabaabbabababbbbbbaa", "bbabaabbabbabbbaaabbbb", "abbaababbabaaaababbababab", "ababbababababbaababbabaaa", "bbbbabaabbabbabbbaaabb", "ababababbaababbabaaaababb", "babbababababbaababbabaaaa", "baabbabbabbbaaabbbbbba", "ababbbabaabbabababbbbbba", "baababbbabaabbabababbbbb", "ababbaababbabaaaababbabab", "aababbbabaabbabababbbbbb", "baaabbbbbbabaabbabbabb", "bbbbbabaabbabbabbbaaab", "aababbababababbaababbabaa", "bbababababbaababbabaaaaba", "babbabaaaababbababababbaa", "aabbabababbbbbbaababbbab", "bababbbbbbaababbbabaabba", "abbbbbbaababbbabaabbabab", "babbaababbabaaaababbababa" };
    assertEquals(295, foxandword.howManyPairs(words));
  }

  @Test
  public void case22() {
    String[] words = { "ccnkiofeakpkplmkdkg", "ncdibdljpdkicnhlombcl", "nhhekbkdhnacjcnldig", "npdpmhocejhddiaaijk", "goghfagljdelfmifaojdlcd", "dibdljpdkicnhlombclnc", "lmjgjmhicpfjghddlml", "gmobcppibbcdhcclfego", "monlbdnkdhlgmlfbioc", "ccieanopgjgchglgoidegof", "ejfkdikjknmkfpnifkbhdpab", "mmmaammhoicneaabfpi", "idfpaajgpjgembbpalnkjlcafm", "kpmafhpmnhfkjdfeglbnein", "lipkcbdgfpdhnlcceigpc", "keabipoihbiobbmobapgkfge", "kbkjdpaedbaldgcelcgalfffcm", "kplmkdkgccnkiofeakp", "dlmllmjgjmhicpfjghd", "ccgplfniigpcapehcjm", "pehbkpknnblmodkkkdhc", "inleojgnbnhbogoekkgmkhiagp", "dlgfcaljgcbioffblogp", "pdpmhocejhddiaaijkn", "lombclncdibdljpdkicnh", "gjcplhdfabdbpdffenenhmmdl", "illdnhcijmoahbmkmifoni", "glgoidegofccieanopgjgch", "khhjhcdjhhbchkbnomfmpokegl", "gkcllcdbljcdjeoiefellnn", "enbbabjdpficnbgphnbll", "cpdidhiddaglfapmalecpf", "opopehpiiegjdafelmifpndan", "hcpehbkpknnblmodkkkd", "kcllcdbljcdjeoiefellnng", "bjbaifphmhpmbdahfbbkokfme", "emplhkenhlfibbaglca" };
    assertEquals(9, foxandword.howManyPairs(words));
  }

  @Test
  public void case23() {
    String[] words = { "baegadfecdgbebgcadgbagccebdf", "ebgcadgbagccebdfbaegadfecdgb", "bgcadgbagccebdfbaegadfecdgbe", "aabcdfgbfddegagdefbcedegabg", "gbagccebdfbaegadfecdgbebgcad", "dgbebgcadgbagccebdfbaegadfec" };
    assertEquals(10, foxandword.howManyPairs(words));
  }

  @Test
  public void case24() {
    String[] words = { "imgcl", "cckkffe", "iiem", "ejil", "geaj", "elkablk", "gkkam", "gdij", "gije", "bliigf", "ceehkjm", "hcaaiha", "makehl", "ldclldf", "kiile", "eadg", "ehlmak", "gead", "mhjea", "dejh", "figmeg", "lkadl", "mafgdmd", "mclgdj", "ibcf", "mdmafgd", "hmieae", "bkibck", "flhed", "ahgada", "hllmekc", "bekg", "mbmlfah" };
    assertEquals(3, foxandword.howManyPairs(words));
  }

  @Test
  public void case25() {
    String[] words = { "wdttregsrtfvtduoimohoghoomcbipbotikru", "wsaeakfkqnwemwttlfgcge", "ivaguinwdwsctg", "ttregsrtfvtduoimohoghoomcbipbotikruwd", "givaguinwdwsct", "duoimohoghoomcbipbotikruwdttregsrtfvt", "nwdwsctgivagui", "tgivaguinwdwsc", "guinwdwsctgiva", "gsrtfvtduoimohoghoomcbipbotikruwdttre", "wdwsctgivaguin", "apnutisiojnskcwivggwojqosnwufjcredeaamfabo", "kqnwemwttlfgcgewsaeakf", "urnuqjiubrcsrfisdlpomvcfqnuaqlbvijtjatbw", "fmlofsppwvvqjjukurnrecehtcjh", "inwdwsctgivagu", "brcsrfisdlpomvcfqnuaqlbvijtjatbwurnuqjiu", "ghoomcbipbotikruwdttregsrtfvtduoimoho", "mlofsppwvvqjjukurnrecehtcjhf", "csrfisdlpomvcfqnuaqlbvijtjatbwurnuqjiubr", "vagqlufja", "jiubrcsrfisdlpomvcfqnuaqlbvijtjatbwurnuq", "gqlufjava", "mcbipbotikruwdttregsrtfvtduoimohoghoo", "fjcredeaamfaboapnutisiojnskcwivggwojqosnwu", "fjavagqlu", "eedccfjntoijwbkkknqckfljtdwi", "ruwdttregsrtfvtduoimohoghoomcbipbotik", "flwsckrconvjjsn", "wfajuogjcm", "fmaoui", "eownemosvrhmwjbcqgaifjtcv", "snwufjcredeaamfaboapnutisiojnskcwivggwojqo", "isnhtqsmlethpuffuciuoddkhddawrplqvfng", "uwdttregsrtfvtduoimohoghoomcbipbotikr", "qvajjmijvfrkplndowhbk", "vvqjjukurnrecehtcjhfmlofsppw", "wsctgivaguinwd", "aqlbvijtjatbwurnuqjiubrcsrfisdlpomvcfqnu", "nuqjiubrcsrfisdlpomvcfqnuaqlbvijtjatbwur", "njrgeecawhhlivfefromurbhcamjc", "jniibtrekpwh", "oodwhgdmmksprhcdmknlkueqahoeglvlkjkrbtufwfi", "qnwemwttlfgcgewsaeakfk", "ojnskcwivggwojqosnwufjcredeaamfaboapnutisi", "ogjcmwfaju" };
    assertEquals(87, foxandword.howManyPairs(words));
  }

  @Test
  public void case26() {
    String[] words = { "trn", "inratl", "rnt", "jnor", "ntr", "mmkrupe", "tlinra", "linrat", "mkrupem", "gmjpuuj", "uio", "egah", "nratli", "uujgmjp", "ratlin", "puujgmj", "ostpb", "jpuujgm", "atlinr", "qrgkipl" };
    assertEquals(25, foxandword.howManyPairs(words));
  }

  @Test
  public void case27() {
    String[] words = { "ilqpfafkqrldiermqmorffqieobdajlenebbgofeekcr", "apqinfdmiiiodadaoofqcirgreopqdnbcgnpkkcacg", "pkrgecceemcfrpheicdggfejhlmjlicogjdociihhjjbp", "idgedirknkaodpbbdokmrakidiocnpbiblrjhrhlmcjg", "mgdrldpfipjo", "bajrhcniihjfgrlprlbcnmmkaaefdmecdkhpmhqnhagcq" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case28() {
    String[] words = { "ddadabecbddccaeadacabbbcdbdaebdbaddaaeb", "edcdeaecebeabbaabaeeadccacdcccbbeaaadc", "ccaeadacabbbcdbdaebdbaddaaebddadabecbdd", "bddadabecbddccaeadacabbbcdbdaebdbaddaae", "bbbeeaeadeaebbcdbeebbdedcdbcaaddcba", "debbacbaaccdabadcaadcaeababcbecdceacadbde", "ebdbaddaaebddadabecbddccaeadacabbbcdbda", "dcbabbbeeaeadeaebbcdbeebbdedcdbcaad", "baddaaebddadabecbddccaeadacabbbcdbdaebd", "bcdbeebbdedcdbcaaddcbabbbeeaeadeaeb", "adbdedebbacbaaccdabadcaadcaeababcbecdceac", "bdedcdbcaaddcbabbbeeaeadeaebbcdbeeb", "eeaeadeaebbcdbeebbdedcdbcaaddcbabbb", "aebbcdbeebbdedcdbcaaddcbabbbeeaeade", "eaeadeaebbcdbeebbdedcdbcaaddcbabbbe", "eebbdedcdbcaaddcbabbbeeaeadeaebbcdb" };
    assertEquals(39, foxandword.howManyPairs(words));
  }

  @Test
  public void case29() {
    String[] words = { "cfadffbahdabhchgbch", "hchgbchcfadffbahdab", "dffbahdabhchgbchcfa", "gbchcfadffbahdabhch", "deadfhfdhbgfhaecbhd", "fadffbahdabhchgbchc", "hdabhchgbchcfadffba", "bgfhaecbhddeadfhfdh", "dhbgfhaecbhddeadfhf", "ahdabhchgbchcfadffb", "bahdabhchgbchcfadff", "dabhchgbchcfadffbah", "chcfadffbahdabhchgb", "hcfadffbahdabhchgbc", "bchcfadffbahdabhchg", "fbahdabhchgbchcfadf", "abhchgbchcfadffbahd", "adffbahdabhchgbchcf", "hgbchcfadffbahdabhc", "ffbahdabhchgbchcfad", "hbgfhaecbhddeadfhfd", "chgbchcfadffbahdabh", "fhfdhbgfhaecbhddead", "eadfhfdhbgfhaecbhdd", "gfhaecbhddeadfhfdhb", "ddeadfhfdhbgfhaecbh", "bhchgbchcfadffbahda", "bdffgdfgehdbhbagacaadb", "bhddeadfhfdhbgfhaec", "haecbhddeadfhfdhbgf", "hddeadfhfdhbgfhaecb", "adfhfdhbgfhaecbhdde", "fhaecbhddeadfhfdhbg", "cbhddeadfhfdhbgfhae", "hfdhbgfhaecbhddeadf", "dfhfdhbgfhaecbhddea", "aecbhddeadfhfdhbgfh", "fdhbgfhaecbhddeadfh", "ecbhddeadfhfdhbgfha", "bhbagacaadbbdffgdfgehd", "fgehdbhbagacaadbbdffgd", "aadbbdffgdfgehdbhbagac", "ffgdfgehdbhbagacaadbbd" };
    assertEquals(352, foxandword.howManyPairs(words));
  }

  @Test
  public void case30() {
    String[] words = { "bibdebiefhiacjbdbdijijahccbjfeadjdgjdiggdehch", "bichbbjbjhjijchbebjhifcaajeab", "ahaadfghdhjihdfjfhacbgdefahigbdefdffhcbhaejcgif", "hacbgdefahigbdefdffhcbhaejcgifahaadfghdhjihdfjf", "hbebjhifcaajeabbichbbjbjhjijc", "daaiefjghhfhaddciiihhgfibdcchheaacaehb", "ddcchc", "dbbahabifdgddj", "heaacaehbdaaiefjghhfhaddciiihhgfibdcch", "ggahbjiffchjdjdfdibbgdhcbgadfbfaheaijfihjcjjh", "jcebbagfbacbfdhgcaddejcadfdadfdaidicgeafibj", "jjaiiaebhafgcgjadadbgbjefcgaabggehf", "defahigbdefdffhcbhaejcgifahaadfghdhjihdfjfhacbg", "bhgdbbifbhcjigeif", "jafeidbaja", "cijgeeaicagaajjeaiegehjiaehdfhdgfeiidbi", "fbacbfdhgcaddejcadfdadfdaidicgeafibjjcebbag", "cdhibcidhigidiiebecijbhcgbi", "jeabbichbbjbjhjijchbebjhifcaa", "abcjjbgeegibhaeg", "hcjbiiiaf", "dehchfejaccbfhahebaiiaajifadgihcfdb", "hfagjhjahebefaij", "jhjijchbebjhifcaajeabbichbbjb", "gagdchjibfcdbaahcajjcagdfgbiihdhfcecagiidfebhgj", "hdh", "eaadihjedjiejifbj", "igjhabdegejdjcbiciiihddifhbeaeaj", "hhadjiiidedhceeijcdjbj", "ieeahbdeigijgabafdidegijchcfggjaahhihc", "bhcjigeifbhgdbbif", "ecijbhcgbicdhibcidhigidiieb" };
    assertEquals(13, foxandword.howManyPairs(words));
  }

  @Test
  public void case31() {
    String[] words = { "gdecfecajgjchlafmed", "hlafmedgdecfecajgjc", "ghhfkdeiglkdlhdgmdeldk", "idcahdhcgkmfkeemaii", "eaehebeemfcimchdhiifj", "lhdgmdeldkghhfkdeiglkd", "kkhlglmbmacldbcdbkifl", "emhcjkdiiadmmhfcgmfihcgkca", "jgdmkeagfdhaijdidfhijjhhilabge", "baldljammjaflcleii", "ghacbagedmhlaafacc", "jchlafmedgdecfecajg", "accghacbagedmhlaaf", "lfkilefljkikcllcbglekj", "ihcgkcaemhcjkdiiadmmhfcgmf", "hlmfggkffljllbggdcccmdmb", "kcckcajilklehfeeckhk" };
    assertEquals(6, foxandword.howManyPairs(words));
  }

  @Test
  public void case32() {
    String[] words = { "kndbinekhflmfe", "bdbiahcmfqlgjnmeiidqbjdeonffkpmhkqakg", "mmjccbjkoappqcgdh", "lpqhgaifnkajadecnblelkqljgp", "fjkmjbfmbjqaglb", "eafeeddqhm", "lhggibedpkpgibimfideeb", "onoaqgdmqdlaammegacaledb", "gbpodckogjjnfjjflnnfipeqkndqodhmmkk", "phkkaiijblqqmginboehmgopaofhgmk", "hcgqpkifnfohbjipahml", "hahddqlaeogmcadei", "pgqjidohpgpfmmjabinddkjnbmohgeaqb", "moljcngpgocpimmadcqlfdiqndaqmqlibhcqk", "nnqahecpgfk", "ehlgophnhoejfmpoegmaaaaclhfihpfkkmi", "qkklgjnlqmmdgk", "ghbaombnqaihakhnqppnij", "pjjipibalqaihnfnnhobn", "ednfoocephi", "hdnimjmepdh", "kmiapjappfaioncdiqgconcmjoppdnhgg", "aoolkceakpbqjogmhqjdflbohgojidd", "qdhbokdmmdm", "glbnhjhmdpbdnodpia", "phgqqokka", "phmbkphedjbfqfnpmehgehho", "llhnfedeqmlplc", "geaioihbggidkhnjml", "jpcnapagkeedqiehidjeficcg", "pkcbppmlnjcgbomql", "eeellphjndifmagofqnbnbadhbqgcpedhbb", "hchjqmdegn", "gokdkcmqalnb", "dlndafnjjmqgcldeebckb", "pjlemloccfkpocaclalagj", "iocbnlcbjmnp" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case33() {
    String[] words = { "beea", "eabe", "cceceeebdce", "abee", "aacadbcbdbceebed", "ccedd", "acadbcbdbceebeda", "dae", "eeab", "eceeebdcecc" };
    assertEquals(8, foxandword.howManyPairs(words));
  }

  @Test
  public void case34() {
    String[] words = { "hliiejpofodmjpemlnqlrqgrcehf", "cehfhliiejpofodmjpemlnqlrqgr", "hlbfbjbpmc", "ocoicbngqldrgnekdehell", "mlnqlrqgrcehfhliiejpofodmjpe", "qalpbjjpgicniclrobdhabblc", "aaojrqeopegjqppqdarqpgiirlki", "alpbjjpgicniclrobdhabblcq", "cijmodcghrlrbknhirlijlkf", "bkonffjlddgpoelcbci", "cbcibkonffjlddgpoel", "agkl", "bgkkgkiacaa", "lijlkfcijmodcghrlrbknhir", "moagkmlcrmmmpfqrkalp", "agkmlcrmmmpfqrkalpmo", "rlijlkfcijmodcghrlrbknhi", "emlnqlrqgrcehfhliiejpofodmjp", "ofnk", "nqg", "ikpcn", "roegcgp", "nenljeohpharqndrnirkdhbriecq", "bddmldhknjdehglnjgicpkgio", "epqkriljfdjdgqm", "cfggdgclerlpdpirrca", "mhgeq", "r", "oqnogbedgddkmjhabiepgdhfo", "qpng", "gbedgddkmjhabiepgdhfooqno", "abiepgdhfooqnogbedgddkmjh", "efikmiokpfalqo", "jjii", "cnikp", "nqjjfak", "alolfnpmebkdfkmkgoinrgrnah", "innjncmcjcceionmqkehhe", "be", "pbpfeegmjrijhmlce", "rqgrcehfhliiejpofodmjpemlnql", "glonhkqlampadc", "lqnkfqrm", "cc", "ncbcmjcokbceaanij", "gnekdehellocoicbngqldr" };
    assertEquals(21, foxandword.howManyPairs(words));
  }

  @Test
  public void case35() {
    String[] words = { "aeyflhakyh", "yflhakyhae", "cvmrmicmoemndqarhrpfsh", "qwixibmpso", "udqmjcrbftldgappsqymv", "gdcitrcuxsnussjpa", "xxjmaicuoolebuefnj", "deucuxucqmitgcricdb", "buljwyrmkw", "aulyrnkua" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case36() {
    String[] words = { "nthmwhrnnrtmcsneiqoovojgpagpgwlmanppriltk", "fjdalgwqtu", "mwhrnnrtmcsneiqoovojgpagpgwlmanppriltknth", "hrnnrtmcsneiqoovojgpagpgwlmanppriltknthmw", "manppriltknthmwhrnnrtmcsneiqoovojgpagpgwl", "dorikmjppooedubaffcfwkiu", "gwggjiaiqufithftwkjodvaafmhbv", "ojgpagpgwlmanppriltknthmwhrnnrtmcsneiqoov", "cwbauhjidcwbabknbjfq", "agpgwlmanppriltknthmwhrnnrtmcsneiqoovojgp", "ivgnlnuwtmdqhl", "vhhqcmivmoo", "lsetidcgpwcouidh", "krlcjjfgheoomqjruuovbmvgdivvbiimaldbbna", "lqtdwscpwpg", "afrnbuquplhotqwwejuvihmnrdfpwpqjvomvfuslt", "tvjfhvljn", "wvlutssnegkfgjedqtlehpocwjaamjd", "tmdqhlivgnlnuw", "whrmgalbrraswoploq", "rghfabjgwpgcluiakpnbdk", "pvhgdhjdttvlfcjhoodolawcakgnr", "qtlgnvtspuiqenmflenkifjfjwolugauhtikoiitg", "ivmoovhhqcm", "hsglwddktnolowwpkrobsapvt", "gpgwlmanppriltknthmwhrnnrtmcsneiqoovojgpa", "cjhoodolawcakgnrpvhgdhjdttvlf", "jwolugauhtikoiitgqtlgnvtspuiqenmflenkifjf", "nrhohbpsfwi", "orikmjppooedubaffcfwkiud", "hqcmivmoovh", "ucpdavkptpprebpggertpakenowgptnolilpwck", "dgccnnb", "ermhdbrtmlabfcebfevmrbiwdqjwjbfct", "hgdhjdttvlfcjhoodolawcakgnrpv", "lehpocwjaamjdwvlutssnegkfgjedqt", "oppjqebadkrgpsd" };
    assertEquals(31, foxandword.howManyPairs(words));
  }

  @Test
  public void case37() {
    String[] words = { "edafdfhbafdceffc", "fhaefehcafcghedecfffdafg", "fcghedecfffdafgfhaefehca", "ggadebbgcbhagcghbcddgdhbe", "hbgcbacghbfdgaeagggbbfhfdd", "ddgdhbeggadebbgcbhagcghbc", "gabbbbbbhebfbchdhfba", "efbgfhbchafefhghedbdeced", "cfdbgecfebcbedgbdhahfc", "ebbfecfbccddceebb", "cbdchefbcgfgeehgdcbgbhd", "ghgcfadcafhcfhdgceae", "dccefaebccagedhbaf", "abfhaacdbcaeeefheegaabfed", "hfbfdadbhhhfahfeggdcgcdf", "bbhebdffdfhfaeea", "ehhbdhgghcehdhgeddcadhee", "dehbagecgfedahgecghcfaeccaf", "fahhcaeaaebahfeg", "ebdecadgahbecdgfbagecc", "hceheccfdbcaecaede", "dheedcafghcaafd", "dbhdfaahdfecaaccbdcbeaegbhh", "bbbdbdbahadadf", "gfdddhfhdgdbddebccfbacaaah", "ghbhfaffgabghhfgeaehcgcgf", "bddgabhcegggbfgedfcdgbhfgce", "adahffghedehdadgbge", "dghffacbbeffcha", "fbgdcgagbcffgfefhbdhdc" };
    assertEquals(2, foxandword.howManyPairs(words));
  }

  @Test
  public void case38() {
    String[] words = { "blshkfikbtqlakhs", "tqlakhsblshkfikb", "ikbtqlakhsblshkf", "lakhsblshkfikbtq", "hkfikbtqlakhsbls", "sblshkfikbtqlakh", "hsblshkfikbtqlak", "oglskal", "shkfikbtqlakhsbl", "lskalog", "dtrkggrkhreetcjmfllssuogfbjr", "smpppob", "kbtqlakhsblshkfi", "lshkfikbtqlakhsb", "kfikbtqlakhsblsh", "uibauistjjrthadjbirtesmsbnnhcirp", "bthncuqpkeqjqrnjrplecjnaucjoislkla", "uogfbjrdtrkggrkhreetcjmfllss", "rbhidlbebtmeb", "ueqiohbsejfkbudhjutsgdl", "jaoq", "jjrthadjbirtesmsbnnhcirpuibauist", "btqlakhsblshkfik", "fikbtqlakhsblshk", "gucciedhjbsrrmrrneujsenppfcjp", "pobsmpp", "aflahmo", "glskalo", "aoqj", "rplecjnaucjoislklabthncuqpkeqjqrnj", "flahmoa", "tkbmoe", "naucjoislklabthncuqpkeqjqrnjrplecj", "moaflah", "psebqojmteigmllrhgfbcgnpptujuparuu", "oqja", "rrneujsenppfcjpgucciedhjbsrrm", "ebabejuiritlbeh", "rptllobqtlgdaqojjkcpgjh", "btmebrbhidlbe", "bqojmteigmllrhgfbcgnpptujuparuupse", "oetkbm" };
    assertEquals(97, foxandword.howManyPairs(words));
  }

  @Test
  public void case39() {
    String[] words = { "ibjchaccagdhgdjefdfj", "haccagdhgdjefdfjibjc", "efdfjibjchaccagdhgdj", "chaccagdhgdjefdfjibj", "gbgaddjg", "jejcbefaaahiggdheaefcghfegccfcgff", "ccagdhgdjefdfjibjcha", "jhadgdbaege", "fdfjibjchaccagdhgdje", "jfajicbhjgbhdghgggigiiicbhejjafea", "aahiggdheaefcghfegccfcgffjejcbefa", "ejcbefaaahiggdheaefcghfegccfcgffj", "fjibjchaccagdhgdjefd", "jefdfjibjchaccagdhgd", "gdjefdfjibjchaccagdh", "jgciiacchf", "hgdjefdfjibjchaccagd", "bjchaccagdhgdjefdfji", "ahiaaaddafagaj", "hfegccfcgffjejcbefaaahiggdheaefcg", "agajahiaaaddaf", "ia", "adhffdiihhghgbffdfggaa", "efcghfegccfcgffjejcbefaaahiggdhea", "accagdhgdjefdfjibjch", "gcfddedbhiadcjdaf", "jibjchaccagdhgdjefdf", "fjejcbefaaahiggdheaefcghfegccfcgf", "cagdhgdjefdfjibjchac", "gaddjggb", "ejjafeajfajicbhjgbhdghgggigiiicbh", "iggdheaefcghfegccfcgffjejcbefaaah", "dfjibjchaccagdhgdjef", "dhgdjefdfjibjchaccag", "cbhjgbhdghgggigiiicbhejjafeajfaji", "hjgbhdghgggigiiicbhejjafeajfajicb", "ggdheaefcghfegccfcgffjejcbefaaahi" };
    assertEquals(156, foxandword.howManyPairs(words));
  }

  @Test
  public void case40() {
    String[] words = { "eidhgkhbkgbmbgggbgkjigdihjheikjldk", "echcjmgkfcdhakhbaaajbie", "bgggbgkjigdihjheikjldkeidhgkhbkgbm", "mejbhbmakechfabkdldmllgmjelbj", "ieldjjgfjcbacbllhmebffmckillldgabebla", "jhilbajchbmkleibmbmbjflbjfijkeddbhjiehgfeg", "ieechcjmgkfcdhakhbaaajb", "jmgkfcdhakhbaaajbieechc", "eikjldkeidhgkhbkgbmbgggbgkjigdihjh", "hbgickhcgabkjligjbdbelh", "acgfbgdlkjcmgkdfgmhchcadhgkflhmhh", "kkdjhmcmjeakklkmmhegjbdhfjgjlkfgameibjgkmd", "fbikdejbfbddggejhkddibjbfjdj", "jmcikhileajfleegfhbeiibhlehlafm", "cjmgkfcdhakhbaaajbieech", "cahkjdaaeibmjflamccmkcdbhbkaahgfblheejbic", "lhhbgickhcgabkjligjbdbe", "hjcjlidlbedjafleigmaekkgamcacheejbmbjlcdg", "hcijgkbelbfjmklkkfimlgad", "hcaeakbfgjaaimkgkhijikfhielhidkeedblj", "jbmhdfkcchgcmeifeglccdaiggaiihiaae", "gelgcjjjdmmejleiblbejdeimeljaahajmdleeba", "dmlkaggabbiiggihcfeikfgacmheml", "cjlljdikhdemhaledhcdligeihdflmjceahbeckcd", "fabkdldmllgmjelbjmejbhbmakech", "kimflllidehimhgddaghhdikahfc", "kgbmbgggbgkjigdihjheikjldkeidhgkhb", "djmmdeiamhjdjjdhaaembhk", "fdcmkifaaclcjegljmedflbcdfl", "khbkgbmbgggbgkjigdihjheikjldkeidhg", "dljddhmckamkbmgliejhdlm", "imkgkhijikfhielhidkeedbljhcaeakbfgjaa", "baaajbieechcjmgkfcdhakh", "lkjcmgkdfgmhchcadhgkflhmhhacgfbgd", "kjldkeidhgkhbkgbmbgggbgkjigdihjhei", "mbabhldmghigaljiadlbllhidcbclkfa", "cbacbllhmebffmckillldgabeblaieldjjgfj", "abegdhgjbdfaijeagdkfaefffdk", "imbcbceeldklhdeblfiaadkbijmamjmdmkchabmemmjl", "bfgjaaimkgkhijikfhielhidkeedbljhcaeak", "mhjdjjdhaaembhkdjmmdeia", "dcbbbjjbfijlkbekmhjhmjaika", "hgddaghhdikahfckimflllidehim", "fedmcjbelebmkcalcmfihhfcih", "blffgkkdfjgehmacfccidbfcagjmjhldmheglkfkabdc" };
    assertEquals(34, foxandword.howManyPairs(words));
  }

  @Test
  public void case41() {
    String[] words = { "lnbifmg", "ljjmebb", "abibhniiehad", "dabibhniieha", "cmekfljceenicn", "djdicdale", "bhniiehadabi", "adabibhniieh", "bibhniiehada", "dlmmlcafhj", "cnmmbdff", "bgfmgkkej", "jjegadm" };
    assertEquals(10, foxandword.howManyPairs(words));
  }

  @Test
  public void case42() {
    String[] words = { "akwkceseglgglknpdtiwlfjnuwnpdpw", "knpdtiwlfjnuwnpdpwakwkceseglggl", "lfjnuwnpdpwakwkceseglgglknpdtiw", "pwakwkceseglgglknpdtiwlfjnuwnpd", "pdpwakwkceseglgglknpdtiwlfjnuwn", "lgglknpdtiwlfjnuwnpdpwakwkceseg", "jnuwnpdpwakwkceseglgglknpdtiwlf", "glknpdtiwlfjnuwnpdpwakwkceseglg", "eseglgglknpdtiwlfjnuwnpdpwakwkc", "wlfjnuwnpdpwakwkceseglgglknpdti", "eglgglknpdtiwlfjnuwnpdpwakwkces", "gglknpdtiwlfjnuwnpdpwakwkcesegl", "lknpdtiwlfjnuwnpdpwakwkceseglgg", "dpwakwkceseglgglknpdtiwlfjnuwnp", "pdtiwlfjnuwnpdpwakwkceseglgglkn", "seglgglknpdtiwlfjnuwnpdpwakwkce", "pfgtilpkuesf", "npdtiwlfjnuwnpdpwakwkceseglgglk", "fjnuwnpdpwakwkceseglgglknpdtiwl", "kceseglgglknpdtiwlfjnuwnpdpwakw", "tiwlfjnuwnpdpwakwkceseglgglknpd", "dtiwlfjnuwnpdpwakwkceseglgglknp", "ceseglgglknpdtiwlfjnuwnpdpwakwk", "nuwnpdpwakwkceseglgglknpdtiwlfj", "wnpdpwakwkceseglgglknpdtiwlfjnu", "glgglknpdtiwlfjnuwnpdpwakwkcese", "wkceseglgglknpdtiwlfjnuwnpdpwak", "uwnpdpwakwkceseglgglknpdtiwlfjn", "kwkceseglgglknpdtiwlfjnuwnpdpwa", "npdpwakwkceseglgglknpdtiwlfjnuw", "wakwkceseglgglknpdtiwlfjnuwnpdp", "fpfgtilpkues", "pkuesfpfgtil", "vhaolk", "uqbjlitpnjocofajwwafslgrkupiaqoajb", "kvhaol", "kuesfpfgtilp", "ajwwafslgrkupiaqoajbuqbjlitpnjocof" };
    assertEquals(443, foxandword.howManyPairs(words));
  }

  @Test
  public void case43() {
    String[] words = { "necekhmkhibbbedhcijbeimgniaefhnelk", "imgniaefhnelknecekhmkhibbbedhcijbe", "hmkhibbbedhcijbeimgniaefhnelknecek", "hcijbeimgniaefhnelknecekhmkhibbbed", "hhakcjijbeganghbaahengcahgmfgbkejgkdifbfdndbl", "mgniaefhnelknecekhmkhibbbedhcijbei", "hnelknecekhmkhibbbedhcijbeimgniaef", "ghbaahengcahgmfgbkejgkdifbfdndblhhakcjijbegan", "hifbkeelgldmaaedfgbfeiffeiddllahbcenmndg", "bbedhcijbeimgniaefhnelknecekhmkhib", "beimgniaefhnelknecekhmkhibbbedhcij", "lknecekhmkhibbbedhcijbeimgniaefhne", "eiffeiddllahbcenmndghifbkeelgldmaaedfgbf", "ejgkdifbfdndblhhakcjijbeganghbaahengcahgmfgbk", "ddllahbcenmndghifbkeelgldmaaedfgbfeiffei", "lkelggmlkcjcginefidbemjeigiemcaed", "ganghbaahengcahgmfgbkejgkdifbfdndblhhakcjijbe", "ifbfdndblhhakcjijbeganghbaahengcahgmfgbkejgkd", "mndghifbkeelgldmaaedfgbfeiffeiddllahbcen", "cijbeimgniaefhnelknecekhmkhibbbedh", "cjcginefidbemjeigiemcaedlkelggmlk", "gdgihjacggifbedhcldkbhdnebfci", "hibbbedhcijbeimgniaefhnelknecekhmk", "bkejgkdifbfdndblhhakcjijbeganghbaahengcahgmfg", "edfgbfeiffeiddllahbcenmndghifbkeelgldmaa", "iaefhnelknecekhmkhibbbedhcijbeimgn", "cldkbhdnebfcigdgihjacggifbedh", "ijbeimgniaefhnelknecekhmkhibbbedhc", "engcahgmfgbkejgkdifbfdndblhhakcjijbeganghbaah", "ecekhmkhibbbedhcijbeimgniaefhnelkn", "jbeimgniaefhnelknecekhmkhibbbedhci", "gmfgbkejgkdifbfdndblhhakcjijbeganghbaahengcah", "bfeiffeiddllahbcenmndghifbkeelgldmaaedfg", "bbbedhcijbeimgniaefhnelknecekhmkhi", "lhhakcjijbeganghbaahengcahgmfgbkejgkdifbfdndb", "fhnelknecekhmkhibbbedhcijbeimgniae", "bhdnebfcigdgihjacggifbedhcldk" };
    assertEquals(191, foxandword.howManyPairs(words));
  }

  @Test
  public void case44() {
    String[] words = { "ncsjdqrdqitstfencdqaafkpejqrsqt", "tnhinmodpcfmuqgaqapaculfmdap", "mqkinnpncafjqjmjadkufddeh", "grkfdgetditbstfgqejaburtkqducmsm", "oknlelrimtmisgrnofdjirgmko", "npncafjqjmjadkufddehmqkin", "qducmsmgrkfdgetditbstfgqejaburtk", "rimtmisgrnofdjirgmkooknlel", "rjlakrpdeqtacjocrafbqqa", "edikqeqmpdsdufftfjtkfksobngnr", "lruqonresgcqkigoeeuomuopnphmkiip", "isgrnofdjirgmkooknlelrimtm", "rgmkooknlelrimtmisgrnofdji", "mkincrchefoadosbabnnjeimeodnbne", "jqkgospitfsofskamjslluktoqcdnse", "ptceugjjlrcphhndbsnkqgkptkp", "jndkkccanrunplgoibbkqkjjuhml", "smgrkfdgetditbstfgqejaburtkqducm", "shldklsjucdnmihjemhgomhdd", "lfelenblqoufqaglrulauhhkjkgltt", "grnofdjirgmkooknlelrimtmis", "stfencdqaafkpejqrsqtncsjdqrdqit", "iiqlfadkjgmrkpraelmkprnuchrqtn" };
    assertEquals(15, foxandword.howManyPairs(words));
  }

  @Test
  public void case45() {
    String[] words = { "oocqfjenrhhomordgfcplopqjpndbghkgkpmfkdqqdnbqqqb", "qdnbqqqboocqfjenrhhomordgfcplopqjpndbghkgkpmfkdq", "homordgfcplopqjpndbghkgkpmfkdqqdnbqqqboocqfjenrh", "fcgpqndkodmaaimchkpnnhahcimrpppjkilhhbfaem", "dbghkgkpmfkdqqdnbqqqboocqfjenrhhomordgfcplopqjpn", "maqqrkdkgfmbeqlihboqqenaagremiha", "ordgfcplopqjpndbghkgkpmfkdqqdnbqqqboocqfjenrhhom" };
    assertEquals(10, foxandword.howManyPairs(words));
  }

  @Test
  public void case46() {
    String[] words = { "bbbabaabbbaaabbaaaababababababbab", "aaaababababababbabbbbabaabbbaaabb", "bababbabbbbabaabbbaaabbaaaabababa", "babababbabbbbabaabbbaaabbaaaababa", "abababababbabbbbabaabbbaaabbaaaab", "aaabbaaaababababababbabbbbabaabbb", "bbaaaababababababbabbbbabaabbbaaa", "bbbbabaabbbaaabbaaaababababababba", "aabbaaaababababababbabbbbabaabbba", "bbbaaabbaaaababababababbabbbbabaa", "babaabbbaaabbaaaababababababbabbb", "baabbbaaabbaaaababababababbabbbba", "babababababbabbbbabaabbbaaabbaaaa", "babbabbbbabaabbbaaabbaaaababababa", "abaabbbaaabbaaaababababababbabbbb", "ababababababbabbbbabaabbbaaabbaaa", "baaabbaaaababababababbabbbbabaabb", "bbabaabbbaaabbaaaababababababbabb", "aababababababbabbbbabaabbbaaabbaa", "abbabbbbabaabbbaaabbaaaababababab", "ababababbabbbbabaabbbaaabbaaaabab", "aabbbaaabbaaaababababababbabbbbab", "abbbaaabbaaaababababababbabbbbaba", "aaababababababbabbbbabaabbbaaabba", "bababababbabbbbabaabbbaaabbaaaaba", "bbabbbbabaabbbaaabbaaaabababababa", "abbaaaababababababbabbbbabaabbbaa" };
    assertEquals(351, foxandword.howManyPairs(words));
  }

  @Test
  public void case47() {
    String[] words = { "ljiagfkehlegmccaiikj", "ehlegmccaiikjljiagfk", "iagfkehlegmccaiikjlj", "kjljiagfkehlegmccaii" };
    assertEquals(6, foxandword.howManyPairs(words));
  }

  @Test
  public void case48() {
    String[] words = { "jhghiaegageigibifgaaeahifgciaebfhdd", "eigibifgaaeahifgciaebfhddjhghiaegag", "ecghfeadabhjbjehbigdjcgaaijbadbecbhihbjd", "ifgciaebfhddjhghiaegageigibifgaaeah", "fdhcdjbacejjabefggdfgchehjjaidjbdggedcic", "jfbbjfccabchdciaghheabcbciafhbdajjjfgcci", "bjgidbcafhfddaajdebfcjahcdaihjebahdjbedbab", "cabchdciaghheabcbciafhbdajjjfgccijfbbjfc", "efbacaigbijgjfaefhfghacggjbibgdddciefeee", "hjbjehbigdjcgaaijbadbecbhihbjdecghfeadab", "cfhchdghfcgcjhicbdfaageighbiadegehecj", "gedaaajiifijbiabhfajeaidgahdfafgbfab", "jjaidjbdggedcicfdhcdjbacejjabefggdfgcheh", "jehbbfcjfibegddchijhehdjgbfcbjcebjedgejdhb", "baahjiefabbaehfgageihifjbdgdffefahf", "gbfabgedaaajiifijbiabhfajeaidgahdfaf", "jaiajfgaaabjacfddejiifijiedaejijfcdi", "fbhgigffehdcjihedhaebjfbcaibdcdgbfhgeagd", "cijbiggcfehdaacadfbjebajcffdajdbcid", "cccficdigeafibaadghjcfjajdcbcjabeg", "cdadjchbijfhjheagbhghcjfbchbaiedic", "jfbcaibdcdgbfhgeagdfbhgigffehdcjihedhaeb", "bficicgghgfgiddeggbbjacafchbdifajdbg", "chdciaghheabcbciafhbdajjjfgccijfbbjfccab", "fjddecjjahhijjeddaadifhdecjbbfabgdiiefd", "hagcbehijeafbabeihiiighehchegbgigd", "chegbgigdhagcbehijeafbabeihiiigheh", "fijhahfhjdficgbdhjfhccbaedafbadgibci", "dcifjffhbjfgdiiiadbicdgbcbbeiajdifijdgdc", "gcccficdigeafibaadghjcfjajdcbcjabe", "ghiaegageigibifgaaeahifgciaebfhddjh", "djefchdgechdgajhfhabcfabagdibbgbbhiibjiida", "ebajcffdajdbcidcijbiggcfehdaacadfbj", "ihaghdihibbeecdgdeedcdjgbigifjaebgeeijf", "eabcbciafhbdajjjfgccijfbbjfccabchdciaghh", "iaegageigibifgaaeahifgciaebfhddjhgh", "iejfcdgieggjgidbiiigfhcbidgiddagciehgdb", "fdbjhbghgddihhbejafdbcecifebgjjcdd", "jgaijggffdbaihffdjcbacjhfadeaffhhjcbcad", "hbfjbehiiicbgceffhbejcjfdegjaicjghbcggjc" };
    assertEquals(23, foxandword.howManyPairs(words));
  }

  @Test
  public void case49() {
    String[] words = { "ghdpmicbbmdhdjjbal", "bbmdhdjjbalghdpmic", "dhdjjbalghdpmicbbm", "jjbalghdpmicbbmdhd", "jbalghdpmicbbmdhdj", "djaqhdnqoiopjgo", "cbbmdhdjjbalghdpmi", "micbbmdhdjjbalghdp", "ffgojgncahnbdmnhdkdb", "godjaqhdnqoiopj", "ncahnbdmnhdkdbffgojg", "hdpmicbbmdhdjjbalg", "jlohhkjpfancmjgflkdfl", "pmicbbmdhdjjbalghd", "lghdpmicbbmdhdjjba", "bmdhdjjbalghdpmicb", "odjaqhdnqoiopjg", "aqhdnqoiopjgodj", "qoiopjgodjaqhdn", "djjbalghdpmicbbmdh" };
    assertEquals(77, foxandword.howManyPairs(words));
  }

  @Test
  public void case50() {
    String[] words = { "ibefhaigddbabdc", "bdcibefhaigddba", "ebidebccgfdbfafdchabiddighheahiigbfhd", "eibgdebbfcagdcidcbeibhdgad", "abaaieifgcifbdabebf", "gdahcggfieidaagabafhcgcbdefcbdgbhaecccfdegcdehdf", "biiagceigageh", "fhaigddbabdcibe", "behgghffeddgicc" };
    assertEquals(3, foxandword.howManyPairs(words));
  }

  @Test
  public void case51() {
    String[] words = { "bdppreldlmdgodqhprr", "cfgddngqbcfdllgpgesdamilpp" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case52() {
    String[] words = { "egjebjaaihjgcadibjhdabjjheciacaadca", "jgcadibjhdabjjheciacaadcaegjebjaaih", "cadibjhdabjjheciacaadcaegjebjaaihjg", "hdabjjheciacaadcaegjebjaaihjgcadibj", "ciacaadcaegjebjaaihjgcadibjhdabjjhe", "ibjhdabjjheciacaadcaegjebjaaihjgcad", "jheciacaadcaegjebjaaihjgcadibjhdabj", "dcaegjebjaaihjgcadibjhdabjjheciacaa", "ihjgcadibjhdabjjheciacaadcaegjebjaa", "adibjhdabjjheciacaadcaegjebjaaihjgc", "dibjhdabjjheciacaadcaegjebjaaihjgca", "jaaihjgcadibjhdabjjheciacaadcaegjeb", "caadcaegjebjaaihjgcadibjhdabjjhecia", "iacaadcaegjebjaaihjgcadibjhdabjjhec", "bjhdabjjheciacaadcaegjebjaaihjgcadi", "gcadibjhdabjjheciacaadcaegjebjaaihj", "bccdfideibfjfihfejgffjjbdgdjhaahfbdeid", "jhdabjjheciacaadcaegjebjaaihjgcadib", "hjgcadibjhdabjjheciacaadcaegjebjaai", "dggegfffbhdahabchggfhcchdajeigebfgfh", "aadcaegjebjaaihjgcadibjhdabjjheciac", "aegjebjaaihjgcadibjhdabjjheciacaadc", "heciacaadcaegjebjaaihjgcadibjhdabjj", "adcaegjebjaaihjgcadibjhdabjjheciaca", "hdiiahgbgjcbhecigfaficbhjebfhhdjjee", "caegjebjaaihjgcadibjhdabjjheciacaad", "aaihjgcadibjhdabjjheciacaadcaegjebj", "hgbgjcbhecigfaficbhjebfhhdjjeehdiia", "eigebfgfhdggegfffbhdahabchggfhcchdaj", "ebjaaihjgcadibjhdabjjheciacaadcaegj", "hdjjeehdiiahgbgjcbhecigfaficbhjebfh", "eiighggbgfcehhiccijciafhhbegeaejdfj", "aahfbdeidbccdfideibfjfihfejgffjjbdgdjh", "jjheciacaadcaegjebjaaihjgcadibjhdab", "bjjheciacaadcaegjebjaaihjgcadibjhda", "eciacaadcaegjebjaaihjgcadibjhdabjjh", "bfjfihfejgffjjbdgdjhaahfbdeidbccdfidei", "jbdgdjhaahfbdeidbccdfideibfjfihfejgffj", "acaadcaegjebjaaihjgcadibjhdabjjheci", "geaejdfjeiighggbgfcehhiccijciafhhbe", "egfffbhdahabchggfhcchdajeigebfgfhdgg", "aihjgcadibjhdabjjheciacaadcaegjebja", "hfbdeidbccdfideibfjfihfejgffjjbdgdjhaa", "ggfhcchdajeigebfgfhdggegfffbhdahabch", "abjjheciacaadcaegjebjaaihjgcadibjhd" };
    assertEquals(485, foxandword.howManyPairs(words));
  }

  @Test
  public void case53() {
    String[] words = { "hgehfhd", "hdhgehf", "ehfhdhg" };
    assertEquals(3, foxandword.howManyPairs(words));
  }

  @Test
  public void case54() {
    String[] words = { "aefmccddqldwfpvlcsu", "qldwfpvlcsuaefmccdd", "gvmbolrsvvtaohicnok", "wfpvlcsuaefmccddqld", "pwngvfdmsbcmjwtkklo", "bfcsieummlpllnweojd" };
    assertEquals(3, foxandword.howManyPairs(words));
  }

  @Test
  public void case55() {
    String[] words = { "fdjcaiiiajaciijbbdgfcgheefehjchga", "jdhjchachjeiaahifciajgeibfihdbjdjgidcdie", "eibfihdbjdjgidcdiejdhjchachjeiaahifciajg", "aai", "jcaiiiajaciijbbdgfcgheefehjchgafd", "djcaiiiajaciijbbdgfcgheefehjchgaf", "dgfcgheefehjchgafdjcaiiiajaciijbb", "baeabeechdgfcefbiebcbaaije", "bhcjaabgehdaggjcbjeegfbfjdbbgbcabaidggjdi", "gfcgheefehjchgafdjcaiiiajaciijbbd", "caiiiajaciijbbdgfcgheefehjchgafdj", "iajgeibfihdbjdjgidcdiejdhjchachjeiaahifc", "ejjdifdeigdiaahi", "hcjhbieaedejcciadjehbcjcddhjeaefeafi", "cbaaijebaeabeechdgfcefbieb", "dbjhgaejabafhiieaicjgedc", "hdaggjcbjeegfbfjdbbgbcabaidggjdibhcjaabge", "gaejabafhiieaicjgedcdbjh", "ieffeeageaacjiaibgdhbdbcf", "jjecdcjehg", "aahifciajgeibfihdbjdjgidcdiejdhjchachjei", "ejdhjchachjeiaahifciajgeibfihdbjdjgidcdi", "cjiaibgdhbdbcfieffeeageaa", "idgddgijjbabdabcgdeebefgdga", "hjeaefeafihcjhbieaedejcciadjehbcjcdd", "jcciadjehbcjcddhjeaefeafihcjhbieaede" };
    assertEquals(32, foxandword.howManyPairs(words));
  }

  @Test
  public void case56() {
    String[] words = { "qvmvfmorovlblsjrtwdtctwqcaapjwjcglcsbs", "mvfmorovlblsjrtwdtctwqcaapjwjcglcsbsqv", "morovlblsjrtwdtctwqcaapjwjcglcsbsqvmvf", "fwmdmprvrpdikiglixgbjfucjvdguq", "caapjwjcglcsbsqvmvfmorovlblsjrtwdtctwq", "nrxikrmhtwhleehnihpnsijritjtrkqgjjeloojdiu", "ojdiunrxikrmhtwhleehnihpnsijritjtrkqgjjelo", "uclavlnlpembifonftnrqbjrflqmqxt", "gbjfucjvdguqfwmdmprvrpdikiglix", "vsqvviewrowcpnrsjokfssouxxeuldsmpfjo", "jcteevouiooqknxddxlfmisf", "vrpdikiglixgbjfucjvdguqfwmdmpr", "ihpnsijritjtrkqgjjeloojdiunrxikrmhtwhleehn", "etbxdmkuwqdbugcoftkfssiomkbvjooaiksegpinthjk", "dmprvrpdikiglixgbjfucjvdguqfwm", "kmsbpohmefidikpptelthlvakommufwvaqofomcfaxr", "kqgjjeloojdiunrxikrmhtwhleehnihpnsijritjtr", "pdikiglixgbjfucjvdguqfwmdmprvr", "bktgeopexwfdketpsjohdqggedsa", "uvktajawnwfahkmmnbawmnjxbdkaui", "pohmxikbsqotofdltuvvebwdoao", "jwjcglcsbsqvmvfmorovlblsjrtwdtctwqcaap", "dkauiuvktajawnwfahkmmnbawmnjxb", "jaffgmewoxtwrscwrvujwidfsf", "qgjjeloojdiunrxikrmhtwhleehnihpnsijritjtrk", "obduwghtobkkgujrgstl", "jcglcsbsqvmvfmorovlblsjrtwdtctwqcaapjw", "uhlcbpwftelhniagxcwalowesrwksmwah", "fmisfjcteevouiooqknxddxl", "mmnbawmnjxbdkauiuvktajawnwfahk", "leehnihpnsijritjtrkqgjjeloojdiunrxikrmhtwh", "awmnjxbdkauiuvktajawnwfahkmmnb", "hpnsijritjtrkqgjjeloojdiunrxikrmhtwhleehni", "dlfoobcsbvntdalmfnxbjuqxbpegejohueflsudtrvioex", "wfvmxhcqbbqqhdmqcjoegerannsluuunsevjeunlo", "pcggtmjgcegflgmkcdeqbtnrlkwdiumdjfwomidjaqutviwwx", "oodpbawihhniepkrxpqtieiojcsrxopupfgrpldalvdequmh", "gldgqutamsxogobhofelvxrtdntavucgnleotw", "pxmuuaxippjcewfkmexdouql", "ogobhofelvxrtdntavucgnleotwgldgqutamsx", "pooohpiwjvbpltnqklcchmlrie", "hhkbpgufnipxeaoaunjnnpmansvbqaobsvsju", "nghwqmxvrbudslgcboudfv", "felvxrtdntavucgnleotwgldgqutamsxogobho" };
    assertEquals(56, foxandword.howManyPairs(words));
  }

  @Test
  public void case57() {
    String[] words = { "bbcebcba", "cbabbceb", "cddabcdacebbcbbd", "caeaadbe", "ceaebebcaaeee", "eaadbeca", "aeaadbec", "cedabbedabb", "caddddecceecdcbc", "eccbcadac", "bbbcbedbcabdeeabb", "decbcadecae", "decaedecbca", "acbcddebecbe", "cddebecbeacb", "caedbaace", "ebdddaeaecd", "daeecbbd", "dbdaeadcee", "cbbbdaecace", "ceaeaca", "baddacbdcaeaaeac", "ccaddeeaecaebb", "adbecaea", "aececaba", "abaceeccdbbda", "abbcebcb", "bdceddecbadbebc", "cebedaaeecdd", "baaececa", "ccadbcecbeeace", "beadacadeeceaade", "bcecebdbaca", "dbaabedddb", "dbecaeaa", "ebcbabbc", "edecbcadeca", "bdecbabadeaeaaca", "ccbbceccbae", "baceeccdbbdaa", "adcabeccaecde", "bacdacbdeddaadda", "edeeacd", "abeaadaabacccebbe", "eedbabbebdaae" };
    assertEquals(22, foxandword.howManyPairs(words));
  }

  @Test
  public void case58() {
    String[] words = { "abbcbaabccaaacccababb", "abbaaaaaacaaabaaaabbb", "cbaabccaaacccababbabb", "aacccababbabbcbaabcca", "bccaaacccababbabbcbaa", "cababbabbcbaabccaaacc", "baaaaaacaaabaaaabbbab", "caaacccababbabbcbaabc", "abbabbcbaabccaaacccab", "bbcacbaabbbcccccccbcaabbb", "bcccaabbccbcacbbbbabcbacc", "aabccaaacccababbabbcb", "acccababbabbcbaabccaa", "acaaabaaaabbbabbaaaaa", "babccabcbabbbbbbabccabac", "aaaabbbabbaaaaaacaaab", "aaacaaabaaaabbbabbaaa", "babbcbaabccaaacccabab", "bbcbaabccaaacccababba", "abccaaacccababbabbcba", "bbabbcbaabccaaacccaba", "acaccaccbaacccccaabcaaa", "aacaccaccbaacccccaabcaa", "bcbbbcaaabbccaaabbcccab", "aabcaaaacaccaccbaaccccc", "babbabbcbaabccaaaccca", "accacaaacaaaabcab", "ccbabaaccaacacbccab", "bbccbacaacbbbccacbbbc", "cacabaabcccccaabacbaccbb" };
    assertEquals(104, foxandword.howManyPairs(words));
  }

  @Test
  public void case59() {
    String[] words = { "dgjhuuvc", "jkasokqapdnrshdoftorj", "uuvcdgjh", "tknqipmjctasmhbctcbgfrs", "eghcogslrlbglecslrnrluh", "ftorjjkasokqapdnrshdo", "qipmjctasmhbctcbgfrstkn", "asokqapdnrshdoftorjjk", "jjkasokqapdnrshdoftor", "fifhnmfelbcrugneqou", "ipmjctasmhbctcbgfrstknq", "jctasmhbctcbgfrstknqipm", "hcogslrlbglecslrnrluheg", "knqipmjctasmhbctcbgfrst", "lmmtqsvmqjet", "rjjkasokqapdnrshdofto", "nmminjpvsknfkgcccjsafp", "escjkcgjk", "uvcdgjhu", "pmjctasmhbctcbgfrstknqi", "cjkcgjkes", "jsafpnmminjpvsknfkgccc", "mligsunmkrprhsmqee", "minjpvsknfkgcccjsafpnm", "cdgjhuuv", "kescjkcgj", "hmqjdfpvrrfopmb", "tcbgfrstknqipmjctasmhbc", "asmhbctcbgfrstknqipmjct", "shfaakdmqadmitfeh", "dnrshdoftorjjkasokqap", "doftorjjkasokqapdnrsh", "cccjsafpnmminjpvsknfkg", "vsknfkgcccjsafpnmminjp", "scjkcgjke" };
    assertEquals(72, foxandword.howManyPairs(words));
  }

  @Test
  public void case60() {
    String[] words = { "achejhoglklcmhkfeknafifdko", "lbbfjlookionjfcgblcgomklchnfnmol", "bdleokmfkdnonckblgabgjjclinl", "gnamjbdimbihajilohgnellffhe", "kfeknafifdkoachejhoglklcmh", "ejhoglklcmhkfeknafifdkoach", "ionjfcgblcgomklchnfnmollbbfjlook", "knafifdkoachejhoglklcmhkfe", "dkoachejhoglklcmhkfeknafif", "jhoglklcmhkfeknafifdkoache", "eklffbjejifnfnejbnamfaenjffbdlfi", "imhmhochgbbajlldgjamkoodaeef", "ckioaohnnhdokdmahoo", "ojfffkihonoddonkkdoidmngaioaali", "nboedjnbomeck", "dmngaioaaliojfffkihonoddonkkdoi", "okinlgalijakdejblkemlglbneoomdobfknfoke", "miokmfgkbadcklfhelbgo", "oachejhoglklcmhkfeknafifdk", "mlilanmgnbmfebelfmaajlki", "nafifdkoachejhoglklcmhkfek", "jnbomecknboed", "eelabgaolibbcmdjjnonj", "jjofomnhcacegldieabjjolcbhleceiog", "fffkihonoddonkkdoidmngaioaalioj", "fgkbadcklfhelbgomiokm" };
    assertEquals(34, foxandword.howManyPairs(words));
  }

  @Test
  public void case61() {
    String[] words = { "ccjlgz", "fpkwtyzlcccrq", "oezqnzqhez", "wqcvetlqawcv", "pepyslleg", "zuslh", "mmpsblmmiorgg", "pziymnheh", "lmkjb", "mmiorggmmpsbl", "boqjklt", "ggmmpsblmmior", "vxyijxqifloc", "nebczwb", "mimqgdlkedhwv", "uygkxtlvpp", "gaswti", "rnepvfzfaqvyr", "cckjl", "uevwnbpl", "nqqstm", "jbvqnu", "hscjemrb", "qiifayjn", "snddkx", "msshgkuz", "yjoghlgf", "nnxmly" };
    assertEquals(3, foxandword.howManyPairs(words));
  }

  @Test
  public void case62() {
    String[] words = { "diiiddccdghdbggegejffciccb", "cjeddagjhahgcihfhahgfeigd", "gagihghbjhcgggdaabgacgeggb", "iccbdiiiddccdghdbggegejffc", "ejffciccbdiiiddccdghdbggeg" };
    assertEquals(3, foxandword.howManyPairs(words));
  }

  @Test
  public void case63() {
    String[] words = { "fgghbhkdcfhdabhfeaeeadhj", "bggeflkbblkgdbcgdgekdfjhdeklagfbdhhlckdgg", "igkecchekekillkjcfgildiglcjbk", "fichjhfjliabhfdgedjhliijbeegjajf", "ghkdcikhkdjegkjikkfdakbejec", "gjidhddagaealeialjhgaiadgahliifbhkbg" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case64() {
    String[] words = { "adccbbcedbecbaa", "edbecbaaadccbbc", "dbecbaaadccbbce", "aaadccbbcedbecb", "accaddaacedbdebbbbaccdabaaedbeebadadbadded", "beddbbacadebcebdeecbcaecdbcdebebdbaacdbedc", "baececdabacbdbacbcbadbcaecbbdabcdbbccde" };
    assertEquals(6, foxandword.howManyPairs(words));
  }

  @Test
  public void case65() {
    String[] words = { "khhchfbmmckeadcmgkdbh", "mckeadcmgkdbhkhhchfbm", "cmgkdbhkhhchfbmmckead", "bhealigcgeffickigbhi", "keadcmgkdbhkhhchfbmmc", "ckeadcmgkdbhkhhchfbmm", "dlhhmgjljgdfhelegjmimjlhjhm", "hchfbmmckeadcmgkdbhkh", "hkhhchfbmmckeadcmgkdb", "dcmgkdbhkhhchfbmmckea", "fkdkcddcc", "fbmmckeadcmgkdbhkhhch", "jbdhfialaiihglkighdegfgeee", "gdaadlagakbjeegdhbdcihemgiedbj", "bfmibjibkcadllif", "dbhkhhchfbmmckeadcmgk", "mdeijkdjmlejckehccch", "jgdfhelegjmimjlhjhmdlhhmgjl", "hfbmmckeadcmgkdbhkhhc", "kcddccfkd", "mgkdbhkhhchfbmmckeadc", "cfkdkcddc", "hhchfbmmckeadcmgkdbhk", "ccfkdkcdd", "dccfkdkcd", "gikdejhdaajmdmieiickgbic", "hmdlhhmgjljgdfhelegjmimjlhj", "ddccfkdkc", "glbkeicdedbkgja", "eadcmgkdbhkhhchfbmmck" };
    assertEquals(109, foxandword.howManyPairs(words));
  }

  @Test
  public void case66() {
    String[] words = { "neakembomknhlhnckmnjkocgjijln", "mknhlhnckmnjkocgjijlnneakembo", "jlnneakembomknhlhnckmnjkocgji", "omknhlhnckmnjkocgjijlnneakemb", "njkocgjijlnneakembomknhlhnckm", "knhlhnckmnjkocgjijlnneakembom", "kocgjijlnneakembomknhlhnckmnj", "jkocgjijlnneakembomknhlhnckmn", "mbomknhlhnckmnjkocgjijlnneake", "nckmnjkocgjijlnneakembomknhlh", "lhnckmnjkocgjijlnneakembomknh", "nhlhnckmnjkocgjijlnneakembomk", "kembomknhlhnckmnjkocgjijlnnea", "bomknhlhnckmnjkocgjijlnneakem", "lnneakembomknhlhnckmnjkocgjij", "kmnjkocgjijlnneakembomknhlhnc", "cgjijlnneakembomknhlhnckmnjko", "hlhnckmnjkocgjijlnneakembomkn", "embomknhlhnckmnjkocgjijlnneak", "mghbjcofkenccmkkfejhkcdailkhmgbbn", "mnjkocgjijlnneakembomknhlhnck", "ocgjijlnneakembomknhlhnckmnjk", "ijlnneakembomknhlhnckmnjkocgj", "eakembomknhlhnckmnjkocgjijlnn", "kfejhkcdailkhmgbbnmghbjcofkenccmk", "ckmnjkocgjijlnneakembomknhlhn", "hbjcofkenccmkkfejhkcdailkhmgbbnmg", "akembomknhlhnckmnjkocgjijlnne", "cmkkfejhkcdailkhmgbbnmghbjcofkenc", "nolfgomfhncmhchkhaldddiinh", "lbjijanekekfbkllkbncodiodh", "bnmghbjcofkenccmkkfejhkcdailkhmgb", "gjijlnneakembomknhlhnckmnjkoc", "ibgkfddkelbohkfhfjkakkgdfc", "khaldddiinhnolfgomfhncmhch", "anekekfbkllkbncodiodhlbjij", "hnckmnjkocgjijlnneakembomknhl" };
    assertEquals(363, foxandword.howManyPairs(words));
  }

  @Test
  public void case67() {
    String[] words = { "bfedddggkai", "fedddggkaib", "ggkaibfeddd", "gkaibfedddg", "aibfedddggk", "cekdlebafai", "ajjkmkdeekf", "dggkaibfedd", "ddggkaibfed", "edddggkaibf", "kfajjkmkdee", "kaibfedddgg", "jaicgjfklik", "jkmkdeekfaj", "fchfgmiibba" };
    assertEquals(39, foxandword.howManyPairs(words));
  }

  @Test
  public void case68() {
    String[] words = { "mgggijnahjlighbnjianfidoemlinnnd", "mlinnndmgggijnahjlighbnjianfidoe", "anfidoemlinnndmgggijnahjlighbnji", "njianfidoemlinnndmgggijnahjlighb", "ghieholkleojgohnejajabkgaffgaogbikgdkejdjmm", "cfiimaiabfbmdgmmmmbiehm", "mghieholkleojgohnejajabkgaffgaogbikgdkejdjm", "ighbnjianfidoemlinnndmgggijnahjl", "maiabfbmdgmmmmbiehmcfii", "ibaggifeacolccnnned", "oemlinnndmgggijnahjlighbnjianfid", "iccdkb", "emlinnndmgggijnahjlighbnjianfido", "kinnhgefaikheekbjgafaicn", "iimaiabfbmdgmmmmbiehmcf", "gohnejajabkgaffgaogbikgdkejdjmmghieholkleoj", "nahjlighbnjianfidoemlinnndmgggij", "efaikheekbjgafaicnkinnhg", "bkddkodhoinagdnjddicfienoi", "hbijecfjclmmlnmbomam", "ekkiilamkhnoffojhmkcnollefdlfbgdimcmiloodj", "jlighbnjianfidoemlinnndmgggijnah", "foemcobnnfbiiemoalf", "dmgggijnahjlighbnjianfidoemlinnn", "gijnahjlighbnjianfidoemlinnndmgg", "fmcfdnjekeigjehgkljdil", "ikgdkejdjmmghieholkleojgohnejajabkgaffgaogb", "dimcmiloodjekkiilamkhnoffojhmkcnollefdlfbg", "eholkleojgohnejajabkgaffgaogbikgdkejdjmmghi", "mcmiloodjekkiilamkhnoffojhmkcnollefdlfbgdi", "efdlfbgdimcmiloodjekkiilamkhnoffojhmkcnoll", "cnkinnhgefaikheekbjgafai", "linnndmgggijnahjlighbnjianfidoem", "idoemlinnndmgggijnahjlighbnjianf" };
    assertEquals(100, foxandword.howManyPairs(words));
  }

  @Test
  public void case69() {
    String[] words = { "giivcknrmjpsntdpctlttoks", "jnmroursmldldm", "smldldmjnmrour", "dldmjnmroursml", "tlrmevotkjfi", "rhhojfgnht", "nmroursmldldmj", "rmjpsntdpctlttoksgiivckn", "snrfcefqdqenjduudgpctsefk", "dmjnmroursmldl", "nferqemqmmocomctkovfoc", "oursmldldmjnmr", "otkjfitlrmev", "kmtsoeopasfocohmtjiuvb", "upvfprspdqdusvjdeum", "fertelbiduvs", "jlgscjocsgljnusvilcnvq", "opsljmuolrlkjhnsbprfbi", "rthbjemjtuotbthlbi", "lrmevotkjfit", "olhegegmnelhcmn", "lbiduvsferte", "erqemqmmocomctkovfocnf", "sjmskpjuihvuoj", "illvkmevfu", "avmkciaaalkcblrlphedmkvu", "qiqiqdgekjkgqhjiisedhfmje", "dekshpiithqaulogkglmrpopm", "mlkqdfatlinvovdlfta" };
    assertEquals(21, foxandword.howManyPairs(words));
  }

  @Test
  public void case70() {
    String[] words = { "gkamklgbgejnlbhmmkkpakdhodeololkkfipikoiajen", "amklgbgejnlbhmmkkpakdhodeololkkfipikoiajengk", "pikoiajengkamklgbgejnlbhmmkkpakdhodeololkkfi", "ajengkamklgbgejnlbhmmkkpakdhodeololkkfipikoi", "oiajengkamklgbgejnlbhmmkkpakdhodeololkkfipik", "lgbgejnlbhmmkkpakdhodeololkkfipikoiajengkamk", "koiajengkamklgbgejnlbhmmkkpakdhodeololkkfipi", "iajengkamklgbgejnlbhmmkkpakdhodeololkkfipiko", "ikoiajengkamklgbgejnlbhmmkkpakdhodeololkkfip", "ipikoiajengkamklgbgejnlbhmmkkpakdhodeololkkf", "odeololkkfipikoiajengkamklgbgejnlbhmmkkpakdh", "engkamklgbgejnlbhmmkkpakdhodeololkkfipikoiaj", "kdhodeololkkfipikoiajengkamklgbgejnlbhmmkkpa", "gbgejnlbhmmkkpakdhodeololkkfipikoiajengkamkl", "bgejnlbhmmkkpakdhodeololkkfipikoiajengkamklg", "nlbhmmkkpakdhodeololkkfipikoiajengkamklgbgej", "hodeololkkfipikoiajengkamklgbgejnlbhmmkkpakd", "mkkpakdhodeololkkfipikoiajengkamklgbgejnlbhm", "mklgbgejnlbhmmkkpakdhodeololkkfipikoiajengka", "kamklgbgejnlbhmmkkpakdhodeololkkfipikoiajeng", "bhmmkkpakdhodeololkkfipikoiajengkamklgbgejnl", "ololkkfipikoiajengkamklgbgejnlbhmmkkpakdhode", "klgbgejnlbhmmkkpakdhodeololkkfipikoiajengkam", "ngkamklgbgejnlbhmmkkpakdhodeololkkfipikoiaje", "lkkfipikoiajengkamklgbgejnlbhmmkkpakdhodeolo", "dhodeololkkfipikoiajengkamklgbgejnlbhmmkkpak", "hmmkkpakdhodeololkkfipikoiajengkamklgbgejnlb", "ejnlbhmmkkpakdhodeololkkfipikoiajengkamklgbg", "deololkkfipikoiajengkamklgbgejnlbhmmkkpakdho", "ojeejmifddikpnlcfgkfjekfafghhbklfhpnpccg", "kkfipikoiajengkamklgbgejnlbhmmkkpakdhodeolol", "mgigmhafmlkbplnhgidbbgkcpmjmeijeeoeakonpa", "jnlbhmmkkpakdhodeololkkfipikoiajengkamklgbge", "lolkkfipikoiajengkamklgbgejnlbhmmkkpakdhodeo", "jengkamklgbgejnlbhmmkkpakdhodeololkkfipikoia", "kkpakdhodeololkkfipikoiajengkamklgbgejnlbhmm", "akdhodeololkkfipikoiajengkamklgbgejnlbhmmkkp", "eololkkfipikoiajengkamklgbgejnlbhmmkkpakdhod", "lkbplnhgidbbgkcpmjmeijeeoeakonpamgigmhafm", "kpakdhodeololkkfipikoiajengkamklgbgejnlbhmmk", "pakdhodeololkkfipikoiajengkamklgbgejnlbhmmkk", "eeoeakonpamgigmhafmlkbplnhgidbbgkcpmjmeij", "mhafmlkbplnhgidbbgkcpmjmeijeeoeakonpamgig", "lbhmmkkpakdhodeololkkfipikoiajengkamklgbgejn", "gejnlbhmmkkpakdhodeololkkfipikoiajengkamklgb", "olkkfipikoiajengkamklgbgejnlbhmmkkpakdhodeol", "akonpamgigmhafmlkbplnhgidbbgkcpmjmeijeeoe" };
    assertEquals(830, foxandword.howManyPairs(words));
  }

  @Test
  public void case71() {
    String[] words = { "bbbaabb", "aaaabaa", "ab", "baaaab", "abab", "bbbbaab", "aabaabb", "bbbbbbb", "ababbbab", "aaab", "abbaa", "abbbbba", "bbbbbb", "bbaaabb", "bbbbbaa", "abbbab", "abaabb", "bbbbaaa", "abaaaa", "abaaaaab", "aabbb", "aaaaaabb", "aaa", "aa", "bbbbabbbb", "bbababbba", "abb", "aaaaaba", "bbabaa", "ababaa", "bb", "bbaaabbb", "aaaa", "abaaab", "ba", "bbaab", "bbba", "aabbabbb", "baabb", "bba", "bbbbabba", "abaa", "baabaab", "bbbbbabb", "babb", "bbaa", "bababaa", "babbbba", "baabbb", "aaaaab" };
    assertEquals(19, foxandword.howManyPairs(words));
  }

  @Test
  public void case72() {
    String[] words = { "dqfsenbtxxzxl", "rlwnbljxybctijgfejg", "wnbljxybctijgfejgrl", "btxxzxldqfsen", "ctijgfejgrlwnbljxyb", "wynyxtghwmwx" };
    assertEquals(4, foxandword.howManyPairs(words));
  }

  @Test
  public void case73() {
    String[] words = { "lfuzbcw", "uzbcwlf", "wlfuzbc", "bcwlfuz", "s", "jgjrlcoyhajllzaonnj", "ghn", "dbffkynqvxccvhbr", "jpyqeyjkjzjplmtmfkd" };
    assertEquals(6, foxandword.howManyPairs(words));
  }

  @Test
  public void case74() {
    String[] words = { "ffhfdbdddaadafcahh", "hffhfdbdddaadafcah", "adafcahhffhfdbddda", "bdddaadafcahhffhfd", "dbdddaadafcahhffhf", "aadafcahhffhfdbddd", "hhffhfdbdddaadafca", "ddaadafcahhffhfdbd", "afcahhffhfdbdddaad", "dddaadafcahhffhfdb", "fcahhffhfdbdddaada", "ahhffhfdbdddaadafc", "hfdbdddaadafcahhff", "cahhffhfdbdddaadaf" };
    assertEquals(91, foxandword.howManyPairs(words));
  }

  @Test
  public void case75() {
    String[] words = { "bdacaacaccaceedbaaebbaccbeddddcc", "ecbeaabacceedcbbdbeacbceaaaeded", "ddaeeacebcbabbeaeddaeabcabbde", "edceacdadaeebebccddcbeadbdabcbebcacaeddeedbeb", "dcadebebaacbcdddacbceccadcaacaebbcddd", "eccadcaacaebbcddddcadebebaacbcdddacbc", "caabcbabbebdeadcedaabebabdedacbecdebddbceebae", "ecabccaadacbaecbaeddcdadbbcedcedd", "eeacbcdeabedeaabadeeccbbaedddcccbb", "caebdeebceebeebebadebabbceecadabaeeeabececeeae", "dacbeaaaeeddddcecabcbecccdd", "dacddaadaacdebebcadedbecbcedccaebdeee", "dddcddebeecbcedccbdaddbccdddcdd", "cbbdbeacbceaaaededecbeaabacceed", "eeadebedceadbeedbceaecbedacbaeccbce", "ecdbeaebaaaebbdceaddacdeedadbdcbcbcdc", "cbcaaccaccbadcacbbaaceddbdaaebeeebddcbdeeeeda", "cdececddcbbeedcdbcabbbaadbcbbdcebacecbbdb", "cccabdbcdcdacddddcdecbdebbdaeddcadddb", "dcdccdcecebcededdbddaddcaeddbccacbccbbaaaccb", "ecbcbcaccadeaeaaaaedabbabadecaabaecbbec", "dcecabdabcdecaeabdbaccecbbadcecbecdcadbacaebd", "cbabcedcedaccacacceacbdaceacddedadaeb", "eceddcdedbbeccabaeececcaeaaeccdecdce", "bbcddacadbaecbccbcdbdbaaeacdcbebdebdececcabda", "eddcadddbcccabdbcdcdacddddcdecbdebbda", "eadebbacdccedcdcddcadbaeecabcdbbbddbac", "abeceeddaaabbcdcacbdddcbadbdc", "ebeadabecaaecabdeaebbcaedacbcdbaacddcaacbec", "ecddaeabdbdcebdbbdaedaecbebeeabc", "aeeaababedacaadbcddbebbcbbdbdecaeecabcebdccc", "aeabaaddaccdbaaeccebdbeebdbbaaa", "caeebaeaaabedbbcbcdbbceccdaccdcccedb", "eeacbcbccbddbeedaaedeadaaabdbcbccbd", "dceddeccddaebabcadaedceccebdcaceeea", "edaedecbbacabbddceddacaaddbedeeadceceaabadc", "bdcdddbedebebbceddccecddbbdecedda", "dedcbcadaaeabeaeccedebbcecaacb", "adbedebbebbbacabcdbdadbddecbadbcacbd", "cabaeececcaeaaeccdecdceeceddcdedbbec", "edecbdbabadeeabdbabcbecaeecdcadc", "ecaacbeabbcdbcbbbeaccddebbeddcbce", "caacaebbcddddcadebebaacbcdddacbceccad" };
    assertEquals(6, foxandword.howManyPairs(words));
  }

  @Test
  public void case76() {
    String[] words = { "adceefhfcgaaaedhaabbhdiehee", "dceefhfcgaaaedhaabbhdieheea", "haabbhdieheeadceefhfcgaaaed", "ihehdefhaeifichhefiid", "bbhdieheeadceefhfcgaaaedhaa", "cgaaaedhaabbhdieheeadceefhf", "aaedhaabbhdieheeadceefhfcga", "dieheeadceefhfcgaaaedhaabbh", "hfcgaaaedhaabbhdieheeadceef", "aaaedhaabbhdieheeadceefhfcg", "bhdieheeadceefhfcgaaaedhaab", "fhfcgaaaedhaabbhdieheeadcee", "defhaeifichhefiidiheh", "hdefhaeifichhefiidihe", "dhaabbhdieheeadceefhfcgaaae", "ieheeadceefhfcgaaaedhaabbhd", "eadceefhfcgaaaedhaabbhdiehe", "aedhaabbhdieheeadceefhfcgaa", "eheeadceefhfcgaaaedhaabbhdi", "bdfdghbhebidfhahaifchedigf", "abbhdieheeadceefhfcgaaaedha", "efhaeifichhefiidihehd", "aabbhdieheeadceefhfcgaaaedh", "hehdefhaeifichhefiidi", "heeadceefhfcgaaaedhaabbhdie" };
    assertEquals(181, foxandword.howManyPairs(words));
  }

  @Test
  public void case77() {
    String[] words = { "ceccbcbcddacbaebae", "addacacdbaeeeedceaeae", "ebbcceddcceadbbaea", "dbbaeaebbcceddccea", "dacacdbaeeeedceaeaead", "cbabebdaededbaaaaccce", "dbcdccabeecdbacbd", "abaeeeebabdaabceee", "bddbcdccabeecdbac", "acbaebaececcbcbcdd", "aeaddacacdbaeeeedceae", "decbbcbaedebabbeebac", "cbeedcabacbdadcdc", "bedaacebbceccedacdaedcbcdcd", "cabacbdadcdccbeed", "badcebabeaeabccbdadcacbcdadcba", "ddbeabbbdbceddaacceabbda", "cebabeaeabccbdadcacbcdadcbabad", "acabaaebbcbbccedbbdbada", "cbedbbeaccdaebaaaaeecddccbbbc", "eeeedceaeaeaddacacdba", "cacecbdaebceeabbebceb", "cacdbaeeeedceaeaeadda", "eedceaeaeaddacacdbaee", "acacaeacbaddbdabbbcdcecd", "ccecbdddaadebcebdcbaea", "aedccbbecdaecdbdadeeedcbeecead", "bedbeadabaedecaeeadbceae", "cbdadcacbcdadcbabadcebabeaeabc", "cdbaeeeedceaeaeaddaca", "deeedcbeeceadaedccbbecdaecdbda", "bbeebacdecbbcbaedeba", "adedcdcdeadbbccabdaae", "ebabdaabceeeabaeee", "ddacbaebaececcbcbc", "cbbdddccbbddaedbbace", "baedebabbeebacdecbbc", "bcddacbaebaececcbc", "edceaeaeaddacacdbaeee", "cdddabddcecdddcaa", "adcacbcdadcbabadcebabeaeabccbd", "cdcbbeebcdaabdecedcdc", "ebbccccbecccddaedaecd", "cebaabaecbeaeecbb" };
    assertEquals(48, foxandword.howManyPairs(words));
  }

  @Test
  public void case78() {
    String[] words = { "maka", "lncekdcjacabjkapfmioacoeljjln", "hclklgokpgef", "mpiddh", "jggcabcnjcahiibakmce", "ogangpa", "fdbcmhdeckmcdbikmfijcagcene", "ebbmlkicmapcb", "ogigelckdhfacjmjlpkockopahchp", "pcbebbmlkicma", "n", "ooahohpddcknkgopfopdpibejleghf", "kmlhhllfpmapiiancgbfbeajiepa", "g", "agdjgcmlnlg" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case79() {
    String[] words = { "aaaccbccababaaaacacaaaccabaacacaaaa", "baccaacccbcccaabbcacbacbcbabaabb", "acccbbaaacbcaccabacccbbbbaabbbacccccbabcbb", "aaacacaaaccabaacacaaaaaaaccbccababa", "caccbaaccaaaaabbaabbaaabbaaaaacabcabccabcb", "bcbabcaacabbaabbbababcccca", "ccbbcbbbbabccbcaa", "ababaaaacacaaaccabaacacaaaaaaaccbcc", "ccbaaccbcbabbcbbbcacbbcacacbcbcb", "babbaaaccccabcacbcabacb", "acbbbababbbacabaccacaaabaabcbcbc", "bbbacbbcaabbbaccbabcabacbaa", "bacbacabcbacabacabbaaaaacbabbaa", "bbcbaccbcacccbabacabbbcbaaabcbcabcababccaabaa", "abbaabbaaabbaaaaacabcabccabcbcaccbaaccaaaa", "cccbaacbabbbccbcbccbbabc", "abcbbbabcccacbcaaacbaabbbcabaaacbabb", "aaaaccbccababaaaacacaaaccabaacacaaa", "baaabbaaaaacabcabccabcbcaccbaaccaaaaabbaab", "bcacbbcacacbcbcbccbaaccbcbabbcbb", "bbabaaabaaaccaaccaacccb", "cbbcbacbcbaaabbabcbbaabcccbbbcaacccabccbabb", "aabbacbabbbccbcb", "bccacbbacbbbacacbabca", "bbbacacbabcabccacbbac", "bbacaabaccaccabacaabaabcacacba", "aaccacbababcbacbbcabacabbcaabbcaabba", "baabbcaaaacbbabaaccbabbcccbcaaacccabacaaa", "aaccbbbaaaccbacaaacccacacbcacbacbbacabccb", "caabbabccbccacbacbaaccaacbc" };
    assertEquals(11, foxandword.howManyPairs(words));
  }

  @Test
  public void case80() {
    String[] words = { "gkznzfmxdxtanzzujjhvwpsdyxwnowdrn", "dxtanzzujjhvwpsdyxwnowdrngkznzfmx" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case81() {
    String[] words = { "hfabddhfggiafehjh", "cdjdhdhhdcaaieaj", "feebibgidjehjabi", "iacggigacjhfdjjdj", "eahdifjbbgahhjgij", "fgcijijhbahaagid", "ijajdajfdgfhabeci", "fcibchibebigfcfdf", "gbgfbibdeiggfafh", "edaeicaeaahdibhbd", "eeafffgfgcedgagh", "ggaaacjahedhbeifb", "hcidbaifigbbgbfa", "dbfeecdejjgbjcda", "hdhddgffcbgbbhfb", "ghiiigcgheefdhhgf", "fifdihjfhcjihehcc" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case82() {
    String[] words = { "dacurgonhfpgmdoegdjubqtbfoi", "gonhfpgmdoegdjubqtbfoidacur", "ubqtbfoidacurgonhfpgmdoegdj", "gdjubqtbfoidacurgonhfpgmdoe", "egdjubqtbfoidacurgonhfpgmdo", "djubqtbfoidacurgonhfpgmdoeg", "mtbjtbkfjedhaargabcitogslqp", "nhfpgmdoegdjubqtbfoidacurgo", "oidacurgonhfpgmdoegdjubqtbf", "bcitogslqpmtbjtbkfjedhaarga", "curgonhfpgmdoegdjubqtbfoida", "tbkfjedhaargabcitogslqpmtbj", "bkfjedhaargabcitogslqpmtbjt", "jtbkfjedhaargabcitogslqpmtb", "onhfpgmdoegdjubqtbfoidacurg", "bqtbfoidacurgonhfpgmdoegdju", "citogslqpmtbjtbkfjedhaargab", "togslqpmtbjtbkfjedhaargabci", "gslqpmtbjtbkfjedhaargabcito", "dhaargabcitogslqpmtbjtbkfje", "urnfgjbcuiiellopdihmdrliefc", "argabcitogslqpmtbjtbkfjedha", "ngskbhrsoocbcehtlpiscsrbkgj", "oegdjubqtbfoidacurgonhfpgmd", "bfoidacurgonhfpgmdoegdjubqt", "idacurgonhfpgmdoegdjubqtbfo", "urgonhfpgmdoegdjubqtbfoidac" };
    assertEquals(150, foxandword.howManyPairs(words));
  }

  @Test
  public void case83() {
    String[] words = { "ggdgedbhcbgldbbmio", "ibbklngcgijfoijkeljclcodbnc", "nlbinaldechomjkeafhl", "ocfcbomekmhaaafedfikgjcnenb", "ecamhecbikmflmcddmlocmjhobnjalcncnjkjeagm", "fhaedddjgdfoicaeohgb", "dnemglnagjbeimflke", "ajoahacgioiidjjafhokekki", "bofabeblgelccedoeioi", "odbncibbklngcgijfoijkeljclc", "klocokmiolkbnoegjiiaamjahla", "mmdgbkaggekcohnbelhikhfegofmocmdnlej", "khencojkjhnloibkmcgcbimfmfejfebdiancaehb", "hkbfhaimoneinjab", "mflflhglfnldlegmcagkkdhlagdhgbia", "gkhmenngclinofiadkfnoon", "mefcgcakojblelccgkk", "lbcgkldnejeniedibohgbdejklcjigilgjhfiehabkbja", "ajbiefcomhmjfjammeamccdjmhlalnnbflaebfbigncf", "chemnoajfcenlfklhaamnjckglfbihbo", "eocikgblmolgo", "fbobgadlcbcifflljnedllknbmkbockeloanhnakbacnckmd", "kcoahmikcgoad", "kcgoadkcoahmi", "afgbdfkmmmheacionkkmibojedieckdfnfjkhkoiiobi", "eflbbdjfkbgbajibklabbcefdcbfknjldinockoojknnfbag", "oakimijbileeihkcljgmjc", "ieakcdngimgfaneehbdjdljmhmkhhibnnebf", "ieaighmaigkahkknfiabbcdcihbbgbjeb", "mifbalahnknmidefkengkjfmminhlolenh", "fanoocdamkjenadajbckbmodmkjlfoilagonc", "ocmhilikicfbjclfmbaafekjchbblkaokfadh", "hajnegogkekkaofhkdihljadnmdkjgmgjkjjohbmjoiaoai", "oeiehhhllnjdaebmhkgoojigbogainjlochcfhlkcegfig", "fnnodaihakomeegfddmdoacfg", "iflebfngfcaajmhdoembnhojlcael", "obdkkceclbeegcacejeafadocnhblfigaljmimaefkcbag", "gdmmbikgfafgnongbekbh", "blamigcbmoklehafhjnbamimeoffgkdbmihdlhkdcio", "cdalhnegjccnaocmciobkohcmdeeclf", "milfmbbjhiohdndoabibhlbebfjdb", "bbmioggdgedbhcbgld", "igogldjcicndhkkcdbdaoloojlihociidcdgnjbk", "mhgaalagkifhcgfejeghhfklmoanobi", "bjfeeakoojaoi", "mcengfenaeboaicijehmiljmlndoglai", "nknkccbccnlmmecjihifdkhicmhfh", "klfmgblcncibadhjdlbccbfglebcedofkeefflccbaakinl" };
    assertEquals(3, foxandword.howManyPairs(words));
  }

  @Test
  public void case84() {
    String[] words = { "daeecfacbcfebbaceddcedcfadf", "dcfadfdaeecfacbcfebbaceddce", "bcdcdccaefbcbfdeeccfaddeecbcbcecdfc", "dcdccaefbcbfdeeccfaddeecbcbcecdfcbc", "cedcfadfdaeecfacbcfebbacedd", "caaedcfebfdfaeebaaaddfdabdfe", "acbcfebbaceddcedcfadfdaeecf", "bffccafeeccbddcaacbcfffcadddacedceaedbacb", "ecbcbcecdfcbcdcdccaefbcbfdeeccfadde", "fdeeccfaddeecbcbcecdfcbcdcdccaefbcb", "aefbcbfdeeccfaddeecbcbcecdfcbcdcdcc", "ebdfaefefeafcceaebbdabdceeeefbacb", "efbcbfdeeccfaddeecbcbcecdfcbcdcdcca", "ccfaddeecbcbcecdfcbcdcdccaefbcbfdee", "cbebdfaefefeafcceaebbdabdceeeefba", "acedffbcacbcfdbdbecceecddadfbbdbdeeefeccffd", "fefeafcceaebbdabdceeeefbacbebdfae", "bdfaefefeafcceaebbdabdceeeefbacbe", "faddeecbcbcecdfcbcdcdccaefbcbfdeecc", "aefeebbeadcbdcdbafdfeecaaacedcfbbe", "eccfaddeecbcbcecdfcbcdcdccaefbcbfde", "dcdbafdfeecaaacedcfbbeaefeebbeadcb", "bdbdeeefeccffdacedffbcacbcfdbdbecceecddadfb", "efefeafcceaebbdabdceeeefbacbebdfa", "cdcdccaefbcbfdeeccfaddeecbcbcecdfcb", "ccaefbcbfdeeccfaddeecbcbcecdfcbcdcd", "dccaefbcbfdeeccfaddeecbcbcecdfcbcdc", "aeecfacbcfebbaceddcedcfadfd", "eebcfdbeabbcaefcbbbfbabbceaefcadfdddadd", "eaedbacbbffccafeeccbddcaacbcfffcadddacedc", "cafeeccbddcaacbcfffcadddacedceaedbacbbffc", "dcfebfdfaeebaaaddfdabdfecaae", "eecbcbcecdfcbcdcdccaefbcbfdeeccfadd", "cadddacedceaedbacbbffccafeeccbddcaacbcfff", "abcdfbacfbeccddadafcbaccc", "bcfebbaceddcedcfadfdaeecfac", "caefcbbbfbabbceaefcadfdddaddeebcfdbeabb", "bcecdfcbcdcdccaefbcbfdeeccfaddeecbc", "aefefeafcceaebbdabdceeeefbacbebdf", "cfaddeecbcbcecdfcbcdcdccaefbcbfdeec", "adfdaeecfacbcfebbaceddcedcf", "bebdfaefefeafcceaebbdabdceeeefbac", "deeccfaddeecbcbcecdfcbcdcdccaefbcbf", "dfeacbecfdbbdbadadcadddfe" };
    assertEquals(172, foxandword.howManyPairs(words));
  }

  @Test
  public void case85() {
    String[] words = { "aoihndcheddmhiifbnmnlkngkoakhn", "oakhnaoihndcheddmhiifbnmnlkngk", "akhnaoihndcheddmhiifbnmnlkngko", "ddmhiifbnmnlkngkoakhnaoihndche", "fjgdidmjgohmkanljfjdaedhnjggblfaihnfdeh", "kngkoakhnaoihndcheddmhiifbnmnl", "oihndcheddmhiifbnmnlkngkoakhna", "iifbnmnlkngkoakhnaoihndcheddmh", "ihndcheddmhiifbnmnlkngkoakhnao", "hndcheddmhiifbnmnlkngkoakhnaoi", "dcheddmhiifbnmnlkngkoakhnaoihn", "eddmhiifbnmnlkngkoakhnaoihndch", "bnmnlkngkoakhnaoihndcheddmhiif", "nmnlkngkoakhnaoihndcheddmhiifb", "fbnmnlkngkoakhnaoihndcheddmhii", "afcdgniogbkaimejodcclnmcacfknfkkmj", "aimejodcclnmcacfknfkkmjafcdgniogbk", "lhehndlbcfaafmgbhhiafegffkhdnlagl", "dnlagllhehndlbcfaafmgbhhiafegffkh", "ffkhdnlagllhehndlbcfaafmgbhhiafeg", "ieibbmnflddchlehofjecijncmbcnjjiago", "afegffkhdnlagllhehndlbcfaafmgbhhi", "heddmhiifbnmnlkngkoakhnaoihndc", "gbhhiafegffkhdnlagllhehndlbcfaafm", "hdnlagllhehndlbcfaafmgbhhiafegffk", "hiifbnmnlkngkoakhnaoihndcheddm", "blcbllahbcibcnhjhccfkamggmaogi", "cheddmhiifbnmnlkngkoakhnaoihnd", "mnlkngkoakhnaoihndcheddmhiifbn", "fnjjnmjlccaolgecjdkjnegjdmmj", "ifbnmnlkngkoakhnaoihndcheddmhi", "ognhgkeajkfhobknofabffemeefbcfikihcelgm", "bhhiafegffkhdnlagllhehndlbcfaafmg", "geidfagknmganhlmfdifjncgnhilh", "mhiifbnmnlkngkoakhnaoihndchedd", "ganhlmfdifjncgnhilhgeidfagknm", "kkmjafcdgniogbkaimejodcclnmcacfknf", "afmgbhhiafegffkhdnlagllhehndlbcfa", "lmfdifjncgnhilhgeidfagknmganh", "agllhehndlbcfaafmgbhhiafegffkhdnl" };
    assertEquals(232, foxandword.howManyPairs(words));
  }

  @Test
  public void case86() {
    String[] words = { "aecjdhmi", "jdhmiaec", "medgfflhfhbkjbgf", "hmiaecjd", "ghgadhee", "ajccdh", "iajgegallehah", "gjmkdblccbkjggam", "hlifil", "eiehb", "fljjbcgmgh", "kgmdghbjcffdfeh", "klkcfbffkkajdfdj", "ijfali", "jggamgjmkdblccbk", "jfdhjckjihgf", "lbiijgaeljd", "gbfchligbhhkhhhb", "iijfal", "hmlmk", "jjdcmkjjfigdim", "dalmicecgbi", "gildemibhacjh", "jjacaihlh", "hajccd" };
    assertEquals(6, foxandword.howManyPairs(words));
  }

  @Test
  public void case87() {
    String[] words = { "gcggcibcaiaaecccbhf", "cibcaiaaecccbhfgcgg", "bcaiaaecccbhfgcggci", "hfgcggcibcaiaaecccb", "bhfgcggcibcaiaaeccc", "aecccbhfgcggcibcaia", "ibcaiaaecccbhfgcggc", "eibhfeeghfibeahbcicia", "cbhfgcggcibcaiaaecc", "ecccbhfgcggcibcaiaa", "ccbhfgcggcibcaiaaec", "aiaaecccbhfgcggcibc", "cggcibcaiaaecccbhfg", "caiaaecccbhfgcggcib", "ggcibcaiaaecccbhfgc", "gcibcaiaaecccbhfgcg", "eeghfibeahbciciaeibhf", "fgcggcibcaiaaecccbh", "eghfibeahbciciaeibhfe", "fcaddfadegibcd", "ffbah", "iciaeibhfeeghfibeahbc", "adegibcdfcaddf" };
    assertEquals(127, foxandword.howManyPairs(words));
  }

  @Test
  public void case88() {
    String[] words = { "opobokagkqobgehgq", "hgqopobokagkqobge", "onhqkppjhckqkiqlpnkgfgkidanajgclc", "kqobgehgqopobokag", "clconhqkppjhckqkiqlpnkgfgkidanajg", "gfgkidanajgclconhqkppjhckqkiqlpnk", "qlpnkgfgkidanajgclconhqkppjhckqki", "hqkppjhckqkiqlpnkgfgkidanajgclcon", "lmancqiafaefnknjqne", "bocicfnejbjaqknf", "fgkidanajgclconhqkppjhckqkiqlpnkg", "bjaqknfbocicfnej", "lconhqkppjhckqkiqlpnkgfgkidanajgc", "cfqplfdpaimbdajgcmg", "neqoqifihpnfqhqpfoakqelmcnh", "pnkgfgkidanajgclconhqkppjhckqkiql", "ckqkiqlpnkgfgkidanajgclconhqkppjh", "jbjaqknfbocicfne", "agkqobgehgqopobok", "ajgclconhqkppjhckqkiqlpnkgfgkidan", "kiqlpnkgfgkidanajgclconhqkppjhckq", "fbocicfnejbjaqkn", "monjqojdqhfadblpdfkelo", "najgclconhqkppjhckqkiqlpnkgfgkida", "anajgclconhqkppjhckqkiqlpnkgfgkid", "nlblqegkgacjdahonlqfmifabhpiflbbogkj", "knfbocicfnejbjaq", "kceheqqgp", "conhqkppjhckqkiqlpnkgfgkidanajgcl", "omonjqojdqhfadblpdfkel", "mejmkincoggjfmafjqalh", "ahonlqfmifabhpiflbbogkjnlblqegkgacjd", "nhqkppjhckqkiqlpnkgfgkidanajgclco", "ndnidbplbifenbgfbiaoaifkiqaandidggmg", "ifabhpiflbbogkjnlblqegkgacjdahonlqfm", "dblpdfkelomonjqojdqhfa", "flbbogkjnlblqegkgacjdahonlqfmifabhpi", "ejbjaqknfbocicfn", "qknfbocicfnejbja", "bgehgqopobokagkqo", "lfdpaimbdajgcmgcfqp" };
    assertEquals(146, foxandword.howManyPairs(words));
  }

  @Test
  public void case89() {
    String[] words = { "ababaabbbabababaababbbbaabab", "bbbabababaababbbbaababababaa", "bbabbbaaabbbabbaaba", "bbbaababababaabbbabababaabab", "bababbbaabaaaaaaaaa", "babbbbaababababaabbbabababaa", "ababbaaaababab", "ababaababbbbaababababaabbbab", "baaaba", "aaaabbbbaabbbbabbbbbb", "ababbbbabbabababbabbbaba", "aabbbabbaababbabbba", "aaabbbabbaababbabbb", "bababaabbbabababaababbbbaaba", "bbabababaababbbbaababababaab", "babababaababbbbaababababaabb", "bbabbbbbbbaababbab", "baababbabbbaaabbbab", "abababbbaabaaaaaaaa", "bbbbbaaa", "bbbbbbbabaaaabbbaba", "babaababbbbaababababaabbbaba", "babaabbbabababaababbbbaababa", "abbbbbaba", "bbbaaaabbb", "bbbbaaaabb", "aababababaabbbabababaababbbb", "aabbabaabaa", "babbabababbabbbabaababbb", "aaabbbbb", "aaabbabbbbaabbaaaa", "aabaaaaaaaaabababbb", "abaababbbbabbabababbabbb", "aabbbbba", "bbbbbbaaababaababbbaa", "aababbbbabbabababbabbbab", "baababaaabbaabbabbaaa", "aaabaababaaabbaabbabb", "aaaaaaaaabababbbaab", "bbabbbbbbaaaaaaabab", "bbbbabba", "bababaaabbbb", "ababbbaaabaabaabaabb", "ababaaabbbbb", "bbbbbbbabbbabaabbabbb", "bababbbaaabaabaabaab", "bbbbbbaaaaaaababbba", "abbbabbaababbabbbaa" };
    assertEquals(85, foxandword.howManyPairs(words));
  }

  @Test
  public void case90() {
    String[] words = { "bafgfgfcacecbacffccfbebbfgfbffccffdacf", "fefeacfdccgdaadccbdddeaefddecccedffffcedcd", "badccfggegdfe", "dccfggegdfeba", "gfbffccffdacfbafgfgfcacecbacffccfbebbf", "ffffcedcdfefeacfdccgdaadccbdddeaefddeccced", "adccbdddeaefddecccedffffcedcdfefeacfdccgda", "cbacffccfbebbfgfbffccffdacfbafgfgfcace", "cfbebbfgfbffccffdacfbafgfgfcacecbacffc", "cgafacdfcgdffbdaggdbce", "cgdffbdaggdbcecgafacdf", "fgfbffccffdacfbafgfgfcacecbacffccfbebb", "ccgdaadccbdddeaefddecccedffffcedcdfefeacfd", "bcecgafacdfcgdffbdaggd", "eaafd", "cfggegdfebadc", "eccgdfbegedadcbgeddga", "gfgfcacecbacffccfbebbfgfbffccffdacfbaf", "bbfgfbffccffdacfbafgfgfcacecbacffccfbe", "acdfcgdffbdaggdbcecgaf", "gdfebadccfgge", "eegbggbacegaagdgbdcfcabcfaddgaegcagcaa", "eaefddecccedffffcedcdfefeacfdccgdaadccbddd", "fdecdgbebdadfcdedeacgddbafeffecacafabd", "gfdcdfafccgaccggdgbbgbfceeabgfbdbfagfbeaceefba", "eacfdccgdaadccbdddeaefddecccedffffcedcdfef" };
    assertEquals(48, foxandword.howManyPairs(words));
  }

  @Test
  public void case91() {
    String[] words = { "bcccacbccbcabbccacaccbbacb", "cbbacbbcccacbccbcabbccacac", "abbccacaccbbacbbcccacbccbc", "bbcacbccbabacccbbbbcab", "abbcbabccbbbcabaaaaccbcbaab", "cccbbbbcabbbcacbccbaba", "aababbcbabccbbbcabaaaaccbcb", "baabbcbacbbbbabacbbacb", "bcabbccacaccbbacbbcccacbcc", "cbbacbbaabbcbacbbbbaba", "acbabbaacaacbccabacbcbacbccbbabcacbcaaa", "cbacbbbbabacbbacbbaabb", "cbbbbabacbbacbbaabbcba", "bbcbacbbbbabacbbacbbaa", "cbcacbcaccbabaccabbcaabacbcbaacab", "bcaacbbccbcbbaabbbcacabbabacbbbbacaaccbaaa", "cacaccbbacbbcccacbccbcabbc", "ccbcabbccacaccbbacbbcccacb", "bbcbaccaaaabbbbaaccbba", "cbaababbcbabccbbbcabaaaaccb", "bbbbbaabcbacaabbcacbbbbccbabaacabbbaccccabca", "cbbaabbcbacbbbbabacbba", "bcccbcbbbabbcaaacaaabcbcccbcbcbcbcabb", "bccbbbcabaaaaccbcbaababbcba", "bccbbcbcacaabbbacbcaaabbcccaaaabcccba" };
    assertEquals(37, foxandword.howManyPairs(words));
  }

  @Test
  public void case92() {
    String[] words = { "dhgeogqhconfq", "omafbgcpoqegmb", "leaicqhpjpafbqlhpcjmod", "depglmckhle", "kkbckianf", "ehonogddjccnjlplmaqgmkl", "qiklehlkocpajjmlpaon", "baqblmlocpfcfmdkp", "qiohabaomliadmd", "hpqqkibgnpknjpooqhkbemcmahbhgnne", "imheqbpdphfmmfgbqbqdhobpo", "hagafqflhafhdmahqkecjnbffdkl", "paonqiklehlkocpajjml", "alkdjpbaqfodgepppklp", "naokkgqdc", "nimkcacpcalopqahmiphh", "eqbpdphfmmfgbqbqdhobpoimh", "fkkqnpokpgpaifogiajgkadfkiha", "bajddfdefoihjapggocfleqqcnci", "enkgagdommll", "afbgcpoqegmbom", "jmlpaonqiklehlkocpaj", "bgnbfm", "baomliadmdqioha", "kkdoec", "cpkligpaoljhbplmlmcclmmmpafgf", "dqiohabaomliadm", "hdkmcjbbpiioinklmhcikadhbd", "qjnbkeacjchlfh", "ghdlebpeqlgopghopn", "lqpqhl", "mggnnppjmjlnmgqmgcjollglqmjae", "mnfonnfjpgnfphnjajd", "lmgogcbnnlonllkdnmkfoghioclbqghbmkog", "cnaokkgqd", "hkqoacdqoiidlkgeqafmqqafjodengpeje", "ciclmhpefgicbgaqe", "fbgcpoqegmboma", "ndokiddikhabhphkockgnigdmghibkccon", "beeagmefcdjgdlkaehgmb", "mfljpaoceiapbkli", "baoblcgkhfnllccjpipfjfipgnkgmmjjofj", "gdalgagikjbqnlehpkpfbbmipqbiebdb" };
    assertEquals(11, foxandword.howManyPairs(words));
  }

  @Test
  public void case93() {
    String[] words = { "bdcaiaabjffbidgjaceacghgdhcaieb", "eacgdjjeddbgdfbhbcheccejefcbdhi", "dcaiaabjffbidgjaceacghgdhcaiebb", "aceacghgdhcaiebbdcaiaabjffbidgj", "hhgjagiffaicceijigjjdhgadfchfc", "bccgjihejficdbabjihgajhdgfdjgbc", "cdbabjihgajhdgfdjgbcbccgjihejfi", "jecechhdcadidceigebfjcddbcgbf", "dfihjfeecbajabdidhbjaicafjifg", "jhfbgcgihhgiehifeeigaaghfhiie", "hhfdcieajgaccbggjadgbahccjicfgf", "jihbjhcabjjbcbcdhegcdbbjbfgieej", "ggfiebdigchccjhgghjhfiadgighjje", "hfbgafdjgjiajfbaiadejjebgibhbc", "fjebadebhjbcifiaajhbdabhjidgf", "gfhaagiaiecgcbejbdehhibgicagah", "hhibgicagahgfhaagiaiecgcbejbde", "ibegeibeijbifaagaicdihciejgdac" };
    assertEquals(5, foxandword.howManyPairs(words));
  }

  @Test
  public void case94() {
    String[] words = { "hgdbdjibdfiiibideciibcbgafjbbb", "iibcbgafjbbbhgdbdjibdfiiibidec", "deciibcbgafjbbbhgdbdjibdfiiibi", "bdfiiibideciibcbgafjbbbhgdbdji", "jagcedkcefhagkiabiigjkhgaijhhjjhhdg", "hbgbbbbbdciajiadfacbkbbbicegjacdi", "djibdfiiibideciibcbgafjbbbhgdb", "gafjbbbhgdbdjibdfiiibideciibcb", "idegdgafgighkcehbijgehgbckbaddg", "kbbjfbfkiffjgddfchegajdiacgfcfhekkfcki", "dfiiibideciibcbgafjbbbhgdbdjib", "ggcfeaaaghkedjc", "ciibcbgafjbbbhgdbdjibdfiiibide", "kkfckikbbjfbfkiffjgddfchegajdiacgfcfhe", "aceabgheagffkjajhkfhiekeieebfdggkg", "kfihdbafadgegjcbabjikai", "bbbhgdbdjibdfiiibideciibcbgafj", "cfeaaaghkedjcgg", "aaghkedjcggcfea", "facbkbbbicegjacdihbgbbbbbdciajiad", "dkcefhagkiabiigjkhgaijhhjjhhdgjagce", "iibideciibcbgafjbbbhgdbdjibdfi", "afafjdekjhkb", "jkhgaijhhjjhhdgjagcedkcefhagkiabiig", "agkiabiigjkhgaijhhjjhhdgjagcedkcefh", "fccijaaecjeaccidhekafkiffeh", "abiigjkhgaijhhjjhhdgjagcedkcefhagki", "gfhajiiadbhaiekkjhdaf", "bahcfefiifjjfcfkda", "gddfchegajdiacgfcfhekkfckikbbjfbfkiffj", "ecadckdddjcbfjigigcejfeddekfcfgfjkc", "bdddhhdfkiie", "cefhagkiabiigjkhgaijhhjjhhdgjagcedk", "ihcffkjeeekjgj", "ideciibcbgafjbbbhgdbdjibdfiiib", "jcggcfeaaaghked", "bcbgafjbbbhgdbdjibdfiiibidecii", "jibdfiiibideciibcbgafjbbbhgdbd", "kkjhdafgfhajiiadbhaie", "jhkbafafjdek", "eibifccfhbdbbkgbkchjifigdekiiaagakba", "ihfkjjebhbebfkficcdjb", "bfdggkgaceabgheagffkjajhkfhiekeiee", "deikafkeaheddhfdkibdfihdbgcjfejicbgj", "ikkedbgacabiahjj" };
    assertEquals(106, foxandword.howManyPairs(words));
  }

  @Test
  public void case95() {
    String[] words = { "mbqmgtbmgtrflterunsvblo", "rbfrtkrojveaercvljrdd", "dgmmiptjcupolftfpp", "ilosujsehvvfvgimocdjo", "jkfpmdareptpuhfgafk", "fmjsduvebegsdmbfs", "ogtcgecseurpfashfakp", "chulgfistpdfqeinegkoenr", "fqdmgdvfhcolqttsodpnhn", "qmokkvclkljrbgkrg", "ljrbgkrgqmokkvclk", "ucadevueaiisvajbeigtqad", "daeqncngfromgceeunejhhcvdl", "gtmnnjgftgnmjkktfdka", "fistpdfqeinegkoenrchulg", "mpodtmjudcjsgsfohmof", "gpurhsqukfehmgbfga", "rbhqvjbrpuntdtjoo", "hlmthpjmvvanpjdaloq", "rvierlmscrjaunmgjrlnboehdv", "tlaartteuiqhfddshgbcqau", "caranatcdsfrudhgjovib", "gurbohsnmuutsqgofinulqbftbvq", "ocfgusuhdejpiaqbldrboose", "gsrilpqtchsblmkbrmdbde", "gsfbmohkotdessrjfhqfuujbm", "vvanpjdaloqhlmthpjm", "bcttbdrqkgptfsfht", "tsqgofinulqbftbvqgurbohsnmuu", "ogkiqsbcnsvemueevsaharhslvmo", "imqedmtmtasofatdvgv", "uieppnbcmvgsbtmgqomb", "lljfkmkkfnechvdrrjtpfvofb", "jmvvanpjdaloqhlmthp", "vvutlhrqqeevlccinrmikcobnlf", "mqnpfjkcvmibrcvaeug", "eaiisvajbeigtqaducadevu", "kkfksgmdkginrucridbnjgajuuia", "evueaiisvajbeigtqaducad", "mffbfthbpecmlhufqfm", "tmnnjgftgnmjkktfdkag", "dkmtuqhhrkoasdimkd", "dspifgdosdklgkqka", "jkuinuocgbbaapoqdvsoenva", "rdegtukirnheiiugp", "cnrmvathmnlnkrqmnp", "envajkuinuocgbbaapoqdvso", "cadevueaiisvajbeigtqadu" };
    assertEquals(14, foxandword.howManyPairs(words));
  }

  @Test
  public void case96() {
    String[] words = { "vhfhvpuncsclbsfbvo", "xstrcnqllwenwqolmnsne", "csclbsfbvovhfhvpun", "kemdgwvpiuigbuigipdj", "wdinnksqlfnbvonjlcblsbl", "lmnsnexstrcnqllwenwqo", "cblsblwdinnksqlfnbvonjl", "rcnqllwenwqolmnsnexst", "xdndsjhqfqltixrbqfuqiefugrumuv", "ilxcprejtdblbvjrojtqebdnupenlim", "sblwdinnksqlfnbvonjlcbl", "ukbwotgteufplwkhawbbrxvmjugoqxo", "rxkbctqnralwkjpikpr", "afgcncnuraqmgpafxphbjetdoxiask", "wkjpikprrxkbctqnral", "xphbjetdoxiaskafgcncnuraqmgpaf", "iuigbuigipdjkemdgwvp", "mblxlalrxgfmdwvfljuva", "fbvovhfhvpuncsclbs", "bbrxvmjugoqxoukbwotgteufplwkhaw", "cedkolkjeuwutwfm", "jjlukrnmnfsdfkrpmshwbmjoackx", "txibvvkxkjnpnwueqvebcoxuaj", "bcosmrmwfjagilonmbmdnqbxsl", "nnhdlcjrfkxlsrppxxsiwc", "ebqeapoeqjxitxqqwothaprr", "fnbvonjlcblsblwdinnksql", "wutwfmcedkolkjeu", "wvdqjunkecekcovxfcqwfnprhtx", "fxmbhgqjgxcmrvvgrfwfmblvkwutxav", "trdvsdtivwlmshcnhkwx", "fckjnknlujflqvudujqgr", "oetkeqciqblapsqjopipjejaeumgq", "ehseeunrkfakokfajsx", "jsgptqbcpxxwcehuwrxlqwblj", "lsxxpwfqxgisneukhfneemnmio", "otpcjhagctgqmxkshrdpatop", "nqtfwiwbvvhkplilpamfb", "rebqeapoeqjxitxqqwothapr", "sclbsfbvovhfhvpunc", "ligvxnludgbsuseqltwnnrvjqis", "lwuvnrwlussltcfmdpikuddmjm", "xitxqqwothaprrebqeapoeqj" };
    assertEquals(23, foxandword.howManyPairs(words));
  }

  @Test
  public void case97() {
    String[] words = { "pfjjdpstljknippeonmksfrgdirnbpba", "ptphdtbhmsoqarlefqlempocmpsqepkkqjcs", "jknippeonmksfrgdirnbpbapfjjdpstl", "dorkgkacoessqkhopclnfcocqbqhhpikdj", "eqnkkkcrilkanmjeafsteilkb", "mkepbirgnmkgpbdarnklifqjr", "chlqfokpapgrnjidgjdlnbtf", "lkbeqnkkkcrilkanmjeafstei", "ripgaqeplbigklpcspladeboor", "ksfrgdirnbpbapfjjdpstljknippeonm", "hajagjomhpndlbcjjrfnqchfoojolsk", "nbtfchlqfokpapgrnjidgjdl", "fbqsacarmqodjlhfhcsaelhgitntgeon" };
    assertEquals(5, foxandword.howManyPairs(words));
  }

  @Test
  public void case98() {
    String[] words = { "pihcxtezkssedoagvmhcgfxaronyhwwum", "mhcgfxaronyhwwumpihcxtezkssedoagv", "bwcqcnvqocidgpiqdqyfemqszlnfraixwd", "hmbhnigxcjptyppjsjthhoyilpmjsx", "iskjsekthkfgqmtqlhwmjbmkjcqppbucbxlx", "zcrebiscsgqmjjvfcknupqsuyuiiim", "gkqxtavhsajdmawupsarlwpeqbxrpyyhqknmbfixt", "rybajcmyjmphwnkezqrscxsgzokpzyjc", "hhoyilpmjsxhmbhnigxcjptyppjsjt", "hrvoskhdxnepxqticykfqklqynjdkzgdfilfhl", "uysliulfiedcnhaojjwgpedzwvrpiizoscnly", "rsfupuszeqqvjuqhpxjcqtnexxnnylhigdmszdjz", "xcjptyppjsjthhoyilpmjsxhmbhnig", "jqteqsticujyxiixqhtmczkzwqtawncvybutzsje", "hzgyuzpzgavorszlrdoxnrmnkdqljvhwfmqpimyv", "gqmtqlhwmjbmkjcqppbucbxlxiskjsekthkf", "avddcitflgtzvdjzhuncjrizkimmqwamkayfpyczf" };
    assertEquals(5, foxandword.howManyPairs(words));
  }

  @Test
  public void case99() {
    String[] words = { "ewjam", "jamew", "wjame", "dqbpiz", "bpizdq", "mewja", "zdqbpi", "izdqbp", "mvgzl", "pizdqb", "qbpizd", "amewj", "gzlmv", "lmvgz", "vgzlm" };
    assertEquals(31, foxandword.howManyPairs(words));
  }

  @Test
  public void case100() {
    String[] words = { "dgzifokdutijyssubfgktmoippntpqovurc", "aamyzvpntsuquphhpntooarurwiedpypeyer", "orzhmvwbqgplsddazvhsdpabeomvwcqf", "vrgykqqfcwlivlfchloadpyuloozmoofnmzcz", "iedpypeyeraamyzvpntsuquphhpntooarurw", "pypeyeraamyzvpntsuquphhpntooarurwied", "humvsqfsoxnluiiuzxzswtwghkatceagmmjwzcign", "xulsglyupnyrwpscqegvfexjkjzjqgmyzrbjgxazc", "qegvfexjkjzjqgmyzrbjgxazcxulsglyupnyrwpsc", "ijzljqavuqlnvpfrxziqmosjfsjbpzdwudwvkd", "wpuvjeecqpypztdbdbubciielmdtqfqumwwcub", "asfbzqmvxfegzdfacvenimwzvcduvakpwgvngd", "pbvjavqdfgpszcfquqqxzoeobjpfxqssvxutqdjdr", "jpmkkawenysqbaytpfdawekhuxcrzjvtldlnjq", "bmjvqjikhaevssqvclsfzbxkoetzqhoulunyqisv", "xfegzdfacvenimwzvcduvakpwgvngdasfbzqmv", "gjavyqrfhzlyzkwqkscdeimyzrffsqhfogszfcwqx" };
    assertEquals(5, foxandword.howManyPairs(words));
  }

  @Test
  public void case101() {
    String[] words = { "iiem", "ljdflgn", "ndhghnmmm", "gbndc", "jalehj", "gagekdnhf", "lhfcmmgl", "ki", "bndcg", "ccaingmca", "mc", "khcbi", "mhb", "iddnab", "mh", "hdeiegh", "ildgdh", "ffgnm", "ckme", "eg", "chcblgj" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case102() {
    String[] words = { "cbabbbbacccddcdadabbcad", "bacccddcdadabbcadcbabbb", "babcdccacbbbcbbdaddbccc", "acbbbcbbdaddbcccbabcdcc", "babbbbacccddcdadabbcadc", "daadbadcccdcdb", "cccdcdbdaadbad", "aadbadcccdcdbd", "acccddcdadabbcadcbabbbb", "adabbcadcbabbbbacccddcd", "bdcacdbbdcbdccdabdbdb", "cadcbabbbbacccddcdadabb", "aadbdbccaccdaabdc", "bbcadcbabbbbacccddcdada", "cdadabbcadcbabbbbacccdd", "baadddbdbdbacdaaddabdabba", "acccccacddcbaccaaa", "dbadcccdcdbdaa", "dcdbaaaabccdbcacbb", "badcccdcdbdaad", "ddcbaccaaaacccccac" };
    assertEquals(40, foxandword.howManyPairs(words));
  }

  @Test
  public void case103() {
    String[] words = { "fcaedbdefbfefefcffabcbacefc", "cfcaedbdefbfefefcffabcbacef", "ffcffeadbbacefbebdfbaea", "badcafbdedcfeabacadbebbeeacaebf", "ecacffafeecdcfffcceddbceedf", "aabbffbcdfaddfedd", "bdfafffbdcaeccdfaffbafbeba", "abcbacefcfcaedbdefbfefefcff", "fefcffabcbacefcfcaedbdefbfe", "aaabadfebcadacdbbbc", "aaedfdffddcbadbcbfbffdbeffce", "fecfffeabccdeefebecfebbafdbacbcaaacfdbbffdbe", "bcfeafacbdaedcefcfffaedaecdadcbcbcfbabefe", "acefcfcaedbdefbfefefcffabcb", "bcadacdbbbcaaabadfe", "eadbafeafecefcdebaeceacefabefababaebdeaccfeff", "ecfdcaacbfeefeedfcbeceacabcbbfdabffbcffabea", "feffeadbafeafecefcdebaeceacefabefababaebdeacc", "fbeafeabbdeda", "cadaffebefdc", "aaebecbaaccabfaadbdffeabffbbfccbcbedbfcfeacddc", "dbdefbfefefcffabcbacefcfcae", "dcdacceacfeebea", "efcffabcbacefcfcaedbdefbfef" };
    assertEquals(23, foxandword.howManyPairs(words));
  }

  @Test
  public void case104() {
    String[] words = { "febbdcaefaeb", "bfebbdcaefae", "cgbdfabbgggg", "ebfebbdcaefa", "badbbafffcca", "efaebfebbdca", "aebfebbdcaef", "aefaebfebbdc", "ebbacbedefdc", "bdcaefaebfeb", "dcaefaebfebb", "bbafffccabad", "ffagfcecaagg", "aabefagcbdef", "egdbaccdddbg", "eagfeegcfgfd", "bbdcaefaebfe", "fagcbdefaabe", "bggeccbeefed", "agfeegcfgfde", "accdddbgegdb", "ggeccbeefedb", "cfcbdceffgef", "ddfggdabbbgb", "edbegfbedfde", "acgeeeafcbef", "cfbafdegdgfd", "fffccabadbba", "bdefaabefagc", "ccabadbbafff", "fagfcecaaggf", "eccbeefedbgg", "faebfebbdcae", "fggbbdecfgaa", "bafffccabadb", "abgfedgeegbe" };
    assertEquals(64, foxandword.howManyPairs(words));
  }

  @Test
  public void case105() {
    String[] words = { "pkfbjoanjipccq", "keghhpblqjghea", "momeaeoihdhhn", "hagpeaeaoempfp", "cqpkfbjoanjipc", "plmgilmlijaqqc", "geakqidaqhdokg", "hcfalfgqapaofi", "bniknjaamcdjj", "jgheakeghhpblq", "iplhcdkkmkngn", "mfmgklnepjbcn", "nkfbcljefdqff", "mmbbjjedjnqgq", "jjedjnqgqmmbb", "dokggeakqidaqh", "gcpqghfeqmlajc", "mmqpekkilpddkq", "neaagmpkonfqc", "lfgqapaofihcfa", "dhlakkjgbnohj", "noonbkaghkkeh" };
    assertEquals(5, foxandword.howManyPairs(words));
  }

  @Test
  public void case106() {
    String[] words = { "fafcaefbb", "fcaefbbfa", "bfdbfcb", "bfafcaefb", "efbbfafca", "ebfbeefb", "febbedcda", "aefbbfafc", "afebfb", "beacbdbebfff", "fabaccdcd", "fcbeede", "dcdfabacc", "cecafefcdc", "fcdebcda", "afcaefbbf", "efcbedecbeb", "fbbfafcae", "beefbebf", "fbeefbeb", "ddbadf", "febfba", "cbeedef", "dccecafefc", "cbbdcbfefd", "dbcebf" };
    assertEquals(28, foxandword.howManyPairs(words));
  }

  @Test
  public void case107() {
    String[] words = { "kbuwaorbuuhlkbbljdivuenctamuumhjpoqowjeug", "rpqgdqnswutijepnlnrcjuqlejqpglpuuiirwqughw", "tamuumhjpoqowjeugkbuwaorbuuhlkbbljdivuenc", "muumhjpoqowjeugkbuwaorbuuhlkbbljdivuencta", "poqowjeugkbuwaorbuuhlkbbljdivuenctamuumhj", "amuumhjpoqowjeugkbuwaorbuuhlkbbljdivuenct", "eugkbuwaorbuuhlkbbljdivuenctamuumhjpoqowj", "jeugkbuwaorbuuhlkbbljdivuenctamuumhjpoqow", "oqowjeugkbuwaorbuuhlkbbljdivuenctamuumhjp", "mhjpoqowjeugkbuwaorbuuhlkbbljdivuenctamuu", "swutijepnlnrcjuqlejqpglpuuiirwqughwrpqgdqn", "jdivuenctamuumhjpoqowjeugkbuwaorbuuhlkbbl", "enctamuumhjpoqowjeugkbuwaorbuuhlkbbljdivu", "bljdivuenctamuumhjpoqowjeugkbuwaorbuuhlkb", "wjeugkbuwaorbuuhlkbbljdivuenctamuumhjpoqo", "hjpoqowjeugkbuwaorbuuhlkbbljdivuenctamuum", "chearspcpkequomonjqmnkhnamstkpcenbegcjrcbb", "aorbuuhlkbbljdivuenctamuumhjpoqowjeugkbuw", "lejqpglpuuiirwqughwrpqgdqnswutijepnlnrcjuq", "orbuuhlkbbljdivuenctamuumhjpoqowjeugkbuwa" };
    assertEquals(123, foxandword.howManyPairs(words));
  }

  @Test
  public void case108() {
    String[] words = { "aaa", "aba", "baa", "ccc", "csc", "scc" };
    assertEquals(2, foxandword.howManyPairs(words));
  }

  @Test
  public void case109() {
    String[] words = { "ababab", "bababa", "aaabbb" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case110() {
    String[] words = { "ab", "ba" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case111() {
    String[] words = { "abc", "bac" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case112() {
    String[] words = { "a", "aa" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case113() {
    String[] words = { "ab", "a", "ba" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case114() {
    String[] words = { "abab", "ba" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case115() {
    String[] words = { "top", "optoptopt" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case116() {
    String[] words = { "tokyor", "kyorto" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case117() {
    String[] words = { "aaa", "aab", "aba", "abb", "baa", "bab", "bba", "bbb" };
    assertEquals(6, foxandword.howManyPairs(words));
  }

  @Test
  public void case118() {
    String[] words = { "abc", "aa", "bca" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case119() {
    String[] words = { "abcd", "bc" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case120() {
    String[] words = { "abcd", "cda" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case121() {
    String[] words = { "aab", "aabaa" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case122() {
    String[] words = { "abc", "bc" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case123() {
    String[] words = { "ab", "a" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case124() {
    String[] words = { "a", "aa", "tokyo", "kyoto" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case125() {
    String[] words = { "abab", "baba" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case126() {
    String[] words = { "abab", "ab" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case127() {
    String[] words = { "aa", "aaaa", "aaaaa", "aaa" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case128() {
    String[] words = { "aaaaa", "bbbbb", "aabb", "bbaa", "baab", "ba", "ab" };
    assertEquals(4, foxandword.howManyPairs(words));
  }

  @Test
  public void case129() {
    String[] words = { "zbzbzbzbzbz", "zzaa", "zaaz" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case130() {
    String[] words = { "abcde", "bcdea" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case131() {
    String[] words = { "abcd", "cda", "cdab" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case132() {
    String[] words = { "abc", "ca" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case133() {
    String[] words = { "allllll", "laaaa", "lllllllla", "lllllla", "sdfsdfsd", "asdasd" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case134() {
    String[] words = { "tookyo", "kyoto" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case135() {
    String[] words = { "eel", "eeel", "lee", "ele" };
    assertEquals(3, foxandword.howManyPairs(words));
  }

  @Test
  public void case136() {
    String[] words = { "aab", "b", "baa" };
    assertEquals(1, foxandword.howManyPairs(words));
  }

  @Test
  public void case137() {
    String[] words = { "acaca", "acac" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case138() {
    String[] words = { "a", "ab" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case139() {
    String[] words = { "a", "aa", "aaa", "aaaa" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

  @Test
  public void case140() {
    String[] words = { "tyt", "ty" };
    assertEquals(0, foxandword.howManyPairs(words));
  }

}
