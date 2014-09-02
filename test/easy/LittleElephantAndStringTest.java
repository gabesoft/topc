package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LittleElephantAndStringTest {
  LittleElephantAndString littleelephantandstring = new LittleElephantAndString();

  @Test
  public void case1() {
    String A = "ABC";
    String B = "CBA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case2() {
    String A = "A";
    String B = "B";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case3() {
    String A = "AAABBB";
    String B = "BBBAAA";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case4() {
    String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String B = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    assertEquals(25, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case5() {
    String A = "A";
    String B = "A";
    assertEquals(0, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case6() {
    String A = "DCABA";
    String B = "DACBA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case7() {
    String A = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";
    String B = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";
    assertEquals(0, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case8() {
    String A = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB";
    String B = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB";
    assertEquals(0, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case9() {
    String A = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZAAAAAAAAAAAAAAAAAAA";
    String B = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZ";
    assertEquals(19, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case10() {
    String A = "AYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String B = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAY";
    assertEquals(48, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case11() {
    String A = "ZAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String B = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZ";
    assertEquals(49, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case12() {
    String A = "HQGHUMEAYLNLFDXFIRCVSCXGGBWKFNQDUXWFNFOZVS";
    String B = "HEHNSYIDXDNAOWFNXVQQUMLZKVWBXGRLCFFUGSFGFC";
    assertEquals(39, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case13() {
    String A = "KASVWSR";
    String B = "AVSRSKW";
    assertEquals(5, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case14() {
    String A = "FXTLSGYPSFADPOOEFXZBCOEJUVPVAB";
    String B = "PAFOVEUSCOJBADSELXBGVTFXPZPOFY";
    assertEquals(28, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case15() {
    String A = "RQPMXUJJLOOVA";
    String B = "UORQOVXPJJAML";
    assertEquals(11, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case16() {
    String A = "IAIHHIDIDHBAHDEJGFB";
    String B = "IAIDHJAHHIBDGFIBDHE";
    assertEquals(16, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case17() {
    String A = "DIAIIAGIBJIJHCC";
    String B = "IAIDCJHIICBAIJG";
    assertEquals(14, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case18() {
    String A = "FIGCGFDJCEGBICBBJHGCJFC";
    String B = "BJDICECGGFJFCGBCBGFCJIH";
    assertEquals(18, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case19() {
    String A = "JGJICFFEJBCFAIDJDJGHJJ";
    String B = "EJDHGJJJJDGJICFBIFFCJA";
    assertEquals(19, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case20() {
    String A = "BAAABBABAAABAAABBBABAABABBAAABBABAAA";
    String B = "AAAAABAABAAAAAAABBBABBBBBBBBAAABBAAA";
    assertEquals(13, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case21() {
    String A = "ABABBBABBBBAAAAAABABAAABBBAABBAAABABBAAAABAA";
    String B = "BABBAAAAAAAABABBAAABBABAAAAABBBAABBBAABBBABA";
    assertEquals(25, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case22() {
    String A = "OEMUVNPPPSUACBAZUXMHECTHLEGRPUNKDMBPPWEQTGJOPARMOW";
    String B = "KPTCWNUQRXPPSRPMBENPUOGTMJAVUAHMBPZOWHEEUECOAGPLDM";
    assertEquals(46, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case23() {
    String A = "LRZJPXIOGVLIEXDZUZOSRKRUSVOJBRZMWZPOWKJILEFRAAMDIG";
    String B = "JIBZKFJWZGRROUIRVXUIMMJAGZAPOESRSDRXZZDIWPLOLKOVLE";
    assertEquals(46, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case24() {
    String A = "SMZCNOCKVFAJFRMXOTHOWKBJZWUCWLJFRIMPMYHCHZRIWKBARX";
    String B = "YFHLPCKCZFXCBBNWFITHMCAJUZMMJORAWROSHKWRJKROZWVIXM";
    assertEquals(48, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case25() {
    String A = "JRMBSZTSSHFROEFWSJRXJHGUZYUPZWWEIQURP";
    String B = "SUFRRSPYJUPRUEHRGWJTHBWYSFZCOJQRTRZBE";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case26() {
    String A = "FCVKDZEZTOIDUKUHJZEFCZZZBFKQDPQ";
    String B = "QZZETBEJZCKLZKYZUTIKVDUFHOKQIPF";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case27() {
    String A = "QAYBNEFXNXVGZEDYYHNGYCDRUDMPH";
    String B = "XYNYGFURYCMBXMEYNVQDZGPEADDDN";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case28() {
    String A = "SZSGOVSODKJGHCWMBMXRMHUYFYQGAJQK";
    String B = "MKORMSHSVWPJGGBRYZZQKSFOUQJCMDGH";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case29() {
    String A = "ISGEKYRGZVXDHPOAMVAFYRARXSVKHTQDIHERS";
    String B = "SIPERXVVVSQIFTSGTDGDWHXYKOPNRMQAHDPYE";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case30() {
    String A = "IUTGZPQALYMYNSMKPPMNUVEKNPLXHSECDWEROVASCGFMZKJGIP";
    String B = "PZSQMETOGEPSPXNVJIUPALYYNMKMNUVKLHSECDWRACGFMZKGIP";
    assertEquals(17, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case31() {
    String A = "JFTMUNSYTDJBLEPHJRCHFDKSBACYHMAHSTMQRTFNEGYQJIDWJX";
    String B = "JDUHSJAFBTLKMFQRMYJFJNHHSSQCTYDTEAMDCJBPRHTNEGYIWX";
    assertEquals(37, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case32() {
    String A = "DEQGARCZHJCJMSCHDFYERQRFVVKRPAHIUTVUJYEEGFWIFAJVDL";
    String B = "HREQGJFWKJSMTPJHAEFQZAAULDRCHJCCDYRFVVRIVUYEEGFIVD";
    assertEquals(25, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case33() {
    String A = "HURKTRFFACLVKGRZMKKLDAACLLTEOJOMONXRQYJZGINRNQNZWA";
    String B = "QKAMHURKTRFFACLVGRZKKLDACLLTEOJOMONXRQYJZGINRNNZWA";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case34() {
    String A = "KSTVCENAUJDNMOZWNDUFDTXSBXXFDMVEZCHAYUTDCCKXAAYDRF";
    String B = "DXZRFUSEWJTBOXVYNFHKSTCENAUMNDDXFDMVZCAUTDCCKXAAYD";
    assertEquals(19, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case35() {
    String A = "DZWRXBZMQRLXVOBTWHXGINFGFRCCLMZNMJUGWWBSQFCIHUBSJO";
    String B = "DZWRXBZMQRLXVOBTWHXGINFGFRCCLMZNMJUGWWBSQFCIHUBSJO";
    assertEquals(0, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case36() {
    String A = "HMYRLQMFLNOPSVNPBSZSHCFGGHZLCPQUGUPRIUEWHNICSCTQSX";
    String B = "LMSQSGHMCPHELSOTFLBGSFNPCUZSRUPCHYNVZHCPQUGRIWNIQX";
    assertEquals(32, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case37() {
    String A = "IBSOUSQSKSEHUQFBNQQWQXWMGNMFOWPEOVBAVHHFHKAVSTXCID";
    String B = "UQHCESKMKHSSMVNONWAFXWHGBIBABVQOPQFOVIUSSQFQWEHTXD";
    assertEquals(37, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case38() {
    String A = "NCRVLWSWFJZMSXAZRUNDLMOIJGDUBHUOIVFVOGOOVBQTTZPNFB";
    String B = "JUOTHWMLVRGLFZDZDBTUBXUOFFVNCRSWSAZNMOIJOIVVGOBQPN";
    assertEquals(27, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case39() {
    String A = "LFHVKHRWOTJFDULDEKXFKFOUVUJPDSXSWJFYXLIJJHVQEPVRYX";
    String B = "DFUUJKOLXJOQKDVFEPVLHVHRWTFDUKXFFJPSSWYXLIJJHEVRYX";
    assertEquals(19, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case40() {
    String A = "LODSRKEUTGTNKNTARJKPXINOVGZDTHUNWOOXVJJMPSVKNHKWJO";
    String B = "LODSRKEUTGTNKNTARJKPXINOVGZDTHUNWOOXVJJMPSVKNHKWJO";
    assertEquals(0, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case41() {
    String A = "LEBKSUCVZQLYQNWMCMBVBMHRMLOWPJBWYVWTGTOQNMICXAPZAR";
    String B = "MMLEBKSUCVZQLYQNWCMBVBHRMLOWPJBWYVWTGTOQNMICXAPZAR";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case42() {
    String A = "YJAAYQESTDQAMUKOQRRXRGUCYXCRXJHUSWDTRWCUJXSFNPZQOJ";
    String B = "UUFARZROSDQWSMTCJGHECQUDOSRTJXYAAYKQRXYCRXUWJXNPQJ";
    assertEquals(30, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case43() {
    String A = "ABJRQGGTXCEPXWPXGIMYJOSTDXYYPKTYAAUZZTUVLRDQEYVANH";
    String B = "XXYTGOKRCXAETAUQGNDMPHWZYIAYABJRQGEPPXYJSTTYZUVLDV";
    assertEquals(28, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case44() {
    String A = "XAPYYMQZLELXIEZPDWTRSHXIQTYBEAXXKCYWWFAXXVMTSIJDDX";
    String B = "EJAZHKWCMMTPIXXXLZQYSXTWWTAIDYAXYQLEPRXIBEXXYFVSDD";
    assertEquals(31, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case45() {
    String A = "ZSLVZRMPJJNPEHIORHRFYQKVXQFJFZUJBUACOCLFCFFMSKKGMP";
    String B = "QHKFCMOFISFRFQGVPMVORPJFZSLZMPJJNEHRYKXJZUBUACCLFK";
    assertEquals(24, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case46() {
    String A = "GMFCSCIILWTIWUKKXLCBHQKVQCSWJEBKRJELPGFGRATZLBSGUH";
    String B = "IQECIHLUILGMFCSWTWKKXLCBHQKVCSWJEBKRJLPGFGRATZBSGU";
    assertEquals(10, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case47() {
    String A = "TUWZUYXZVIZSPJDHLWGNALLRBDFINKKMVUCWOHZDWPANHVZZEM";
    String B = "NAMXJDVZUHNACZYHEPWZOLHUSLRKVWPNVGZMIIZWUDWDFZLKTB";
    assertEquals(48, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case48() {
    String A = "ELYHLTLQLBTXBEBVOTQOZKDYNAYLEPYUQTKLRBXDAQRMYJHTPV";
    String B = "TLLPLXELRDKEXDTQUVPTTEYHTLQLBBBVOQOZKYNAYYRBAQMYJH";
    assertEquals(21, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case49() {
    String A = "NTMTHJINTSSPAMQNJRRDQOYPJWPYATMDLEYQSENVKPZVAMSVBM";
    String B = "NZQTMRPNDEVNMTHJITSSPAQNJRDOYJWPYATMLEYQSVKPAMSVBM";
    assertEquals(11, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case50() {
    String A = "HYIARBPHXLZIRIZXBORCQPTQCQWPEABBAFJEUQIGIONIBAZPYW";
    String B = "RBACUIGAIPYHBBXIPBZNCWHRBLIRIZXOQPTQQWEAAFJEQIOZPY";
    assertEquals(22, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case51() {
    String A = "TQWWTBIKDDPOGKPEYVYMHIBUBFYZJFIKXHRNEVHBXAZVSRCKXR";
    String B = "ZKHDKCRFVBEIYIPVFVPZHYUJABTQWWTBKDOGKEMHIBYXRNXSXR";
    assertEquals(26, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case52() {
    String A = "PEDKUPKZCZLHWDUZSKDNEVDCTPLAWBKLPJMXEVPKFDOCYUQTRW";
    String B = "WZZVEWXOTAKUDKPEDUPKCZLHWUSKDNEVDCPLBKLPJMPFDCYQTR";
    assertEquals(14, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case53() {
    String A = "RGAXDGXHALCIDWTXCSTUFXXIHDREMAOBUKTVCGIRVFRPXIZYLI";
    String B = "VICTHRXSXCLPRGDLWXFAIGAYRUEICUFDIAMHTKBXOTDIRXXGVZ";
    assertEquals(44, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case54() {
    String A = "ZYPXOMJKLWJYDWXRLRTBSWCYISUJQYUENCDQPSXIWOLAJNQIGS";
    String B = "SQXNJOMUYJNJUWRSYXWQYYXCSZPOKLWJDRLTBSCIEDPIWLAQIG";
    assertEquals(25, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case55() {
    String A = "CYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String B = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACAY";
    assertEquals(49, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case56() {
    String A = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String B = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    assertEquals(0, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case57() {
    String A = "DBCADABCEBCCAEDBABCBBDCECACDCAECCDECDBBCEDBEECDEAA";
    String B = "DBCBDACEEEADCECCABDEADCBDECABCDDCBCBBCBABEEDACCECA";
    assertEquals(38, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case58() {
    String A = "YMMCTMTTMIHHCKLBXRJWZBKKMGMOORENDQPYEIRTSBAWLOXIFJ";
    String B = "JFIXOLWABSTRIEYPQDNEROOMGMKKBZWJRXBLKCHHIMTTMTCMMY";
    assertEquals(43, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case59() {
    String A = "ZXCABCDDCBAZCBACDCBADFLJKUIOWERLKJFADDDCDZBCCXXH";
    String B = "XCCABDCZDCBCZCXABACCBDALKJFJADDFLKUIOWZBDERDDCHX";
    assertEquals(47, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case60() {
    String A = "ABABABABABABBA";
    String B = "BABABBAABABABA";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case61() {
    String A = "BBBBAAAAA";
    String B = "BBAAAAABB";
    assertEquals(7, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case62() {
    String A = "ACCBBACAB";
    String B = "AAACCCBBB";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case63() {
    String A = "CBBCABXBBAABBACABBBBBXABAAXAAABXABAAXAAABXABAAXAAA";
    String B = "AAABBBABCAAABBBABCBBCBBBXXXAAABXABAAXAAABXABAAXAAA";
    assertEquals(20, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case64() {
    String A = "PHQGHUMEAYLNLFDXFIRCVSCXGGBWKFNQDUXWFNFOZVSRTKJPRE";
    String B = "GWLEUSDVOKFWZSRXFFVRGYLUJPITRMCDPNBCQNKGHEHQXAFXNF";
    assertEquals(45, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case65() {
    String A = "FFBBCFFAEBEAEEDFBABBECBFEBBEACAFCBECEDBAEFEABCACAF";
    String B = "ABCFABCABECBAADEBEECEFAEABBEECFBAACFBBCFFFEBFBEDEF";
    assertEquals(35, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case66() {
    String A = "ACBXACBY";
    String B = "YXACBACB";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case67() {
    String A = "CBAABBB";
    String B = "ACBBBBA";
    assertEquals(5, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case68() {
    String A = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASS";
    String B = "AAAAAAAAAAAAAASAAAAAAAAAAAAAAAAAASAAAAAAAAAAAAAAAA";
    assertEquals(34, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case69() {
    String A = "SADFLKJSAKLDFJKLSAJDFKLJSAKLDFJKLASDFJKLSJADFKLJD";
    String B = "SADFDJSADFJKKLSAJDFKLJSAKLDFLJKLASFJKLSJADFKLJDLK";
    assertEquals(37, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case70() {
    String A = "CEEBEBDEDCEAADDEBDBBADDBCEEDBDBEECEEDAEBBDACACACEB";
    String B = "ADBEABEBECEAADEEDEACEBBDBBDDCBEEDCADADDCBECDECEBEB";
    assertEquals(39, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case71() {
    String A = "DCA";
    String B = "DAC";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case72() {
    String A = "AAAB";
    String B = "AABB";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case73() {
    String A = "ACAAD";
    String B = "DCAAA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case74() {
    String A = "DDCABA";
    String B = "DDACBA";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case75() {
    String A = "ERQTERTOUBHRGJHFGBKLBSDHLGBJRTBRTYERQTERTOUBHRGJHA";
    String B = "ERQTERTOUBHSDHLGBJRTBRTYHARGJERQTERTOUBHRGJHFGBKLB";
    assertEquals(29, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case76() {
    String A = "GHLKCDBA";
    String B = "BHGADLKC";
    assertEquals(5, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case77() {
    String A = "BBBBAAAAAFDAFDA";
    String B = "BBAAAAABBFDAFDA";
    assertEquals(7, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case78() {
    String A = "ABC";
    String B = "BAC";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case79() {
    String A = "ABC";
    String B = "AAC";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case80() {
    String A = "EDACB";
    String B = "AEDCB";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case81() {
    String A = "BBAAAAA";
    String B = "AAAAABB";
    assertEquals(5, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case82() {
    String A = "CABB";
    String B = "BBAC";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case83() {
    String A = "ABCBBB";
    String B = "BBBCBA";
    assertEquals(5, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case84() {
    String A = "AAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBB";
    String B = "BBBBBBBBBBBBBBBBBBBBAAAAAAAAAAAAAAAAAAAA";
    assertEquals(20, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case85() {
    String A = "DDDAAAABCDEFMNDDD";
    String B = "DAADDAMNBCDFEADDD";
    assertEquals(13, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case86() {
    String A = "ABAC";
    String B = "BACA";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case87() {
    String A = "AAAABBBB";
    String B = "CAAABBBB";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case88() {
    String A = "ABC";
    String B = "CAB";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case89() {
    String A = "ABABAB";
    String B = "ABBAAB";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case90() {
    String A = "AEDBCAEDBCAEDBCAEDBCAEDBCAEDBCAEDBCAEDBCAEDBCAEDBC";
    String B = "ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE";
    assertEquals(34, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case91() {
    String A = "ECBDA";
    String B = "EABCD";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case92() {
    String A = "AAABBBAAA";
    String B = "AAAAAABBB";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case93() {
    String A = "AAB";
    String B = "BBA";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case94() {
    String A = "DCBAE";
    String B = "EDCBA";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case95() {
    String A = "BAEDC";
    String B = "ABCDE";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case96() {
    String A = "ACDB";
    String B = "ABCD";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case97() {
    String A = "ACDBXYEFT";
    String B = "ACBDXYFET";
    assertEquals(7, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case98() {
    String A = "ACBD";
    String B = "CADB";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case99() {
    String A = "ACDBE";
    String B = "BACDE";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case100() {
    String A = "BBAABB";
    String B = "BBBBAA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case101() {
    String A = "SRAWZAAFPBBADBAULAABEAABBOAJTNACAAAYAKGBMBAVIQHAAX";
    String B = "ATBYBABBVAAIWCXABGAJNBQSEHMAAKFALAARAAUABPODAAAZBA";
    assertEquals(46, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case102() {
    String A = "ZZZZZABCFED";
    String B = "ZZZZZDEFABC";
    assertEquals(8, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case103() {
    String A = "AAD";
    String B = "CCD";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case104() {
    String A = "BBC";
    String B = "BCB";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case105() {
    String A = "ABAB";
    String B = "BAAB";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case106() {
    String A = "KASJDHKASJD";
    String B = "JKKAHASJDDS";
    assertEquals(9, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case107() {
    String A = "BBACBC";
    String B = "BBBACC";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case108() {
    String A = "ABCCCCCCCCCCCCCCCCCCCCCCCCCCCDDDDADDDDDCCCCCC";
    String B = "CBCCCCCCCCCCCCCCCCCCCCCCCCCCCDDDDDDDDDACCCCCA";
    assertEquals(38, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case109() {
    String A = "BACADZ";
    String B = "AAZBCD";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case110() {
    String A = "AB";
    String B = "BA";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case111() {
    String A = "CABAABA";
    String B = "BCABAAA";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case112() {
    String A = "DCAFXEXBA";
    String B = "DACXEXFBA";
    assertEquals(6, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case113() {
    String A = "DABBA";
    String B = "BADBA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case114() {
    String A = "CEAEEDDCEAABCBBACCBBECDCCBBDACBBDECCEAEDBC";
    String B = "EDCACECBBBECEBACEBBEEDADDBCBDCCBCCADCEAACB";
    assertEquals(33, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case115() {
    String A = "CBADCBDA";
    String B = "DBCABDCA";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case116() {
    String A = "DCABBA";
    String B = "DCBABA";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case117() {
    String A = "ABCDEFGH";
    String B = "EHADBCFG";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case118() {
    String A = "AACDBA";
    String B = "ADACBA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case119() {
    String A = "ABCDE";
    String B = "EABCD";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case120() {
    String A = "CWRVPTZDNSDLYVGZKZTZZUZIKJSGPGLUPMVFLANJEGTRXY";
    String B = "CVGTZZDEVKZGLJZDLRTIRPTVGUNNWSFZGKYAZMUPPJSLXY";
    assertEquals(40, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case121() {
    String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZJSAJDFLJADSJFLKASK";
    String B = "MBJYASSFJPSALKXJJAURITWADHGLFECVSDKLZDKQFJON";
    assertEquals(43, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case122() {
    String A = "ACDBA";
    String B = "DACBA";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case123() {
    String A = "BCA";
    String B = "ABC";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case124() {
    String A = "ADABAAC";
    String B = "CBDAAAA";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case125() {
    String A = "CDBEA";
    String B = "EDCBA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case126() {
    String A = "BDCAEF";
    String B = "ABCDEF";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case127() {
    String A = "QAZXSWEDCVFRTGBNHYUJMKILOPQAZWSXEDCRFVTGBYHNUJMIKO";
    String B = "HJKLMNBVCRESZAQWXPOIUYTREWQASDFGZOKMNJIUHBVGYTFCXD";
    assertEquals(47, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case128() {
    String A = "BABCCB";
    String B = "BBCABC";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case129() {
    String A = "CADBEFG";
    String B = "ABCDEFG";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case130() {
    String A = "QQPPBQQPP";
    String B = "PPQQQQPPB";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case131() {
    String A = "DBCA";
    String B = "DABC";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case132() {
    String A = "DCAZBAZ";
    String B = "ZDAZCBA";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case133() {
    String A = "AOFVP";
    String B = "FAPOV";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case134() {
    String A = "AABB";
    String B = "ABAB";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case135() {
    String A = "DCABA";
    String B = "DDCBA";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case136() {
    String A = "KXCFM";
    String B = "MFXKC";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case137() {
    String A = "AAAAA";
    String B = "BBAAA";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case138() {
    String A = "ABCAA";
    String B = "AABCA";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case139() {
    String A = "ABCABD";
    String B = "DABCAB";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case140() {
    String A = "ABAB";
    String B = "AABB";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case141() {
    String A = "DABC";
    String B = "DCBA";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case142() {
    String A = "AABCE";
    String B = "ABCCC";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case143() {
    String A = "ABADEA";
    String B = "ADAEAB";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case144() {
    String A = "AABC";
    String B = "ACBA";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case145() {
    String A = "HJBASDJHGWEJKHG";
    String B = "HHJJBASDHGGWEJK";
    assertEquals(10, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case146() {
    String A = "CDABA";
    String B = "DACBA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case147() {
    String A = "AQWERTSER";
    String B = "ASRERWQET";
    assertEquals(6, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case148() {
    String A = "AXXXXX";
    String B = "XXXXXA";
    assertEquals(5, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case149() {
    String A = "BCDAB";
    String B = "BABCD";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case150() {
    String A = "ABCCCCCCCCCCCCCCCCCCCCCCCCCCCDDDDADDDDDCCCCCCEA";
    String B = "CBCCCCCCCCCCCCCCCCCCCCCCCCCCCDDDDDDDDDACCCCCAAE";
    assertEquals(44, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case151() {
    String A = "AAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEE";
    String B = "EEAABCBBEECCCEEAEDDBCCCDDCCBBDAABBCAADDDEEEAADBDAB";
    assertEquals(48, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case152() {
    String A = "ABC";
    String B = "ACB";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case153() {
    String A = "BAAB";
    String B = "BABA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case154() {
    String A = "BECDA";
    String B = "ABCDE";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case155() {
    String A = "ABDABABC";
    String B = "ABADBABC";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case156() {
    String A = "ABCD";
    String B = "DBAC";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case157() {
    String A = "CDBEFA";
    String B = "ABCDEF";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case158() {
    String A = "BACBBA";
    String B = "CBABBA";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case159() {
    String A = "ABA";
    String B = "BAA";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case160() {
    String A = "EABCDF";
    String B = "FABCDE";
    assertEquals(5, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case161() {
    String A = "ABCABCABCABCABCABCABCABCABCABCABCABC";
    String B = "ABCABCABCABCABCABCABCABCABCABCABCCBA";
    assertEquals(6, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case162() {
    String A = "BCDA";
    String B = "DCBA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case163() {
    String A = "AAABBBCCCA";
    String B = "CCCBBAABAA";
    assertEquals(8, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case164() {
    String A = "ABAB";
    String B = "BBAA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case165() {
    String A = "CAAACBCBACCCAABCACCCBAAABAABCABCCBCCBABACBBBBAACCC";
    String B = "BBCBCBCAACCACBABAAACAAABBAAACACBCACCBACCCCCCABBBCB";
    assertEquals(32, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case166() {
    String A = "VFWULYQDHWTRWBQXSAHWWMKPFFOQHJZSBZCZQNDVLGVAJBXHPT";
    String B = "PNHDVWHUQQSYQOJLDVXPLTMWFTBBZGACJHSVQFAKHWZWZFWBXR";
    assertEquals(49, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case167() {
    String A = "ABCD";
    String B = "ABDC";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case168() {
    String A = "AXXX";
    String B = "YYYA";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case169() {
    String A = "XYAABAA";
    String B = "ZWAABAA";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case170() {
    String A = "PACEB";
    String B = "PAECB";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case171() {
    String A = "DCABA";
    String B = "DACAB";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case172() {
    String A = "CABD";
    String B = "ABDC";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case173() {
    String A = "WFHW";
    String B = "WWFH";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case174() {
    String A = "ABCBCC";
    String B = "BBCCCA";
    assertEquals(5, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case175() {
    String A = "AAABCBBB";
    String B = "BBBAAABC";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case176() {
    String A = "ABCDE";
    String B = "ABECD";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case177() {
    String A = "ABCD";
    String B = "DBCA";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case178() {
    String A = "ABCDEFHIJKLMNOPQRSTUVWXYABCDEFGHIJKLNOPQRSTUVWXYZ";
    String B = "YXWVUTSRQPONLKJIHGFEDCBAZYXWVUTSRQPONMLKJIHFEDCBA";
    assertEquals(47, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case179() {
    String A = "BABBAA";
    String B = "BABAAB";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case180() {
    String A = "ANCOD";
    String B = "ACNDO";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case181() {
    String A = "ABADEA";
    String B = "DEBAAA";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case182() {
    String A = "GHDCABA";
    String B = "HGDACBA";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case183() {
    String A = "CDBA";
    String B = "ABDC";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case184() {
    String A = "ABCDE";
    String B = "ACBED";
    assertEquals(4, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case185() {
    String A = "ABCABCCBACBAABCD";
    String B = "ABCCBAABCCBAABCD";
    assertEquals(5, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case186() {
    String A = "SUPLODUSUSMXJDSSCTMIQUNGKOCOOJVOQODLPTXYIAGLYVOJGY";
    String B = "OUXMVCSTJQSJPOQOYGSMDTDJUSIOOIYVOLOCANKGLDXSUYULPG";
    assertEquals(46, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case187() {
    String A = "ABABAB";
    String B = "BABABA";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case188() {
    String A = "BCDA";
    String B = "ABCD";
    assertEquals(1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case189() {
    String A = "ABCD";
    String B = "ADCB";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case190() {
    String A = "DEDDF";
    String B = "FDDDE";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case191() {
    String A = "ABCDEFGHIJKLMNOPQQRSTUVWXYZ";
    String B = "ZYXWVUTSRQPONMLKKJIHGFEDCBA";
    assertEquals(-1, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case192() {
    String A = "SSADDD";
    String B = "SASDDD";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case193() {
    String A = "ABXCDEY";
    String B = "XYABCDE";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case194() {
    String A = "ASJOISUIOWEOIWQOIWQUEIOUJDKLASDLAKNMLCNLKNASD";
    String B = "OLCNLASJOASDISUIOWEKNLAOUJDKDLAKNMSIWQOIWQUEI";
    assertEquals(34, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case195() {
    String A = "DSAFGUDSAFIREGVPTRNEJINIA";
    String B = "DSAFGINIUDSAFIREGVPTRNEJA";
    assertEquals(8, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case196() {
    String A = "ROARN";
    String B = "RORAN";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case197() {
    String A = "ABBA";
    String B = "BBAA";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case198() {
    String A = "ACCCA";
    String B = "CACAC";
    assertEquals(3, littleelephantandstring.getNumber(A, B));
  }

  @Test
  public void case199() {
    String A = "ABCA";
    String B = "ACAB";
    assertEquals(2, littleelephantandstring.getNumber(A, B));
  }

}
