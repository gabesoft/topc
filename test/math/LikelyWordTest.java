package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class LikelyWordTest {
  LikelyWord likelyword = new LikelyWord();

  @Test
  public void case1() {
    String[] dictionary = { "time", "zoology" };
    int k = 1;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case2() {
    String[] dictionary = { "az", "ma", "xz" };
    int k = 1;
    assertEquals(1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case3() {
    String[] dictionary = { "az", "ma", "xz" };
    int k = 2;
    assertEquals(2, likelyword.likely(dictionary, k));
  }

  @Test
  public void case4() {
    String[] dictionary = { "a", "m", "y" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case5() {
    String[] dictionary = { "a", "g", "m", "s", "z" };
    int k = 5;
    assertEquals(4, likelyword.likely(dictionary, k));
  }

  @Test
  public void case6() {
    String[] dictionary = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y" };
    int k = 1;
    assertEquals(25, likelyword.likely(dictionary, k));
  }

  @Test
  public void case7() {
    String[] dictionary = { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case8() {
    String[] dictionary = { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    int k = 1;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case9() {
    String[] dictionary = { "aa", "ab", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    int k = 1;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case10() {
    String[] dictionary = { "btkuv", "cjspklwvafj", "cmulxjmfextfo", "czvzuja", "degvwf", "dlpwtnodnj", "fltjltifwnzuw", "fwegfpiiwqgpa", "gmi", "helgvjpgpmur", "hhhq", "ijtvfgdoowrrc", "kkfaeap", "konjycfhrl", "l", "msgs", "nkjdvsxb", "nvvqmllqctwli", "nxcjeh", "o", "oskzqvglqczo", "ps", "qdizwxpfuhtvuw", "qgcnrqpbedfagz", "rihq", "shotqhenuobzwym", "splpqqvk", "tbgk", "tdivcr", "utqryqcpqaaqmd", "uzkyqmr", "vb", "vbjhbgz", "vnzpemz", "vywpazaoxdqoxo", "w", "wdlcxcuyzctxjr", "wnbmwr", "xsfkz", "y", "ylqx", "zdbxohsmtotxxsi", "zzhhnvysk" };
    int k = 9;
    assertEquals(12, likelyword.likely(dictionary, k));
  }

  @Test
  public void case11() {
    String[] dictionary = { "bk", "cw", "ei", "fu", "hg", "is", "ke", "lq", "nc", "oo", "qa", "rm", "sy", "uk", "vw", "xi", "yu" };
    int k = 2;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case12() {
    String[] dictionary = { "bk", "cw", "ei", "fu", "hg", "is", "ke", "lqax", "nc", "oo", "qa", "rm", "sy", "uk", "vw", "xi", "yu" };
    int k = 3;
    assertEquals(7, likelyword.likely(dictionary, k));
  }

  @Test
  public void case13() {
    String[] dictionary = { "bk", "cw", "ei", "fu", "hg", "is", "ke", "lqax", "nc", "oo", "qa", "rm", "sy", "uk", "vw", "xi", "y" };
    int k = 2;
    assertEquals(17, likelyword.likely(dictionary, k));
  }

  @Test
  public void case14() {
    String[] dictionary = { "bn", "cw", "ei", "fu", "hg", "is", "ke", "lqax", "nc", "oo", "qa", "rm", "sy", "uk", "vw", "xi", "yu" };
    int k = 2;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case15() {
    String[] dictionary = { "akagrsbcar", "aykfoydhon", "bmuemefncj", "cbedjkhsqf", "cpocgqjyeb", "ddybdwmdrx", "dsiabcojft", "egryyiqotp", "evbxvosuhl", "fjlwsuuzvh", "fxvvqaxfjd", "gmfungzkwz", "haptknbqkv", "hozshtdvyr", "idjrezgbmn", "irtqcfihaj", "jgdozlkmof", "junnwrmscb", "kixmtxoxpx", "kxhlrdrddt", "llrkojtirp", "mabjlpvofl", "moliivxtth", "ncvhgbzzhd", "nrfgdiceuz", "ofpfaoekiv", "otzdxugpwr", "pijcvaivkn", "pwtbsglayj", "qldapmngmf", "qzmzmspmab", "rnwyjyrrnx", "scgxhetxbt", "sqqwekwcpp", "tfavbqyidl", "ttktyxanrh", "uhuswdctfd", "uwertjeysz", "vkoqqphegv", "vyypnvjjur", "wniolblpin", "xbsnihnuwj", "xqcmfnqakf", "yemlctsfyb", "yswjzzullx", "zhgixfwqzt", "zvqhulywnp" };
    int k = 10;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case16() {
    String[] dictionary = { "akagrsbcar", "aykfoydhon", "bmuemefncj", "cbedjkhsqf", "cpocgqjyeb", "ddybdwmdrx", "dsiabcojft", "egryyiqotp", "evbxvosuhl", "fjlwsuuzvh", "fxvvqaxfjd", "gmfungzkwz", "haptknbqkv", "hozshtdvyr", "idjrezgbmn", "irtqcfihaj", "jgdozlkmof", "junnwrmscb", "kixmtxoxpx", "kxhlrdrddt", "llrkojtirp", "mabjlpvofl", "moliivxtth", "ncvhgbzzhd", "nrfgdiceuz", "ofpfaoekiv", "otzdxugpwr", "pijcvaivkn", "pwtbsglayj", "qldapmngmf", "qzmzmspmab", "rnwyjyrrnx", "scgxhetxbt", "sqqwekwcpp", "tfavbqyidl", "ttktyxanrh", "uhuswdctfd", "uwertjeysz", "vkoqqphegv", "vyypnvjjur", "wniolblpin", "xbsnihnuwj", "xqcmfnqakf", "yemlctsfyb", "yswjzzullx", "zhgixfwqzt", "zjn" };
    int k = 10;
    assertEquals(47, likelyword.likely(dictionary, k));
  }

  @Test
  public void case17() {
    String[] dictionary = { "akagrsbcar", "aykfoydhon", "bmuemefncj", "cbedjkhsqf", "cpocgqjyeb", "ddybdwmdrx", "dsiabcojft", "egryyiqotp", "evbxvosuhl", "fjlwsuuzvh", "fxvvqaxfjd", "gmfungzkwz", "haptknbqkv", "hozshtdvyr", "idjrezgbmn", "irtqcfihaj", "jgdozlkmof", "junnwrmscb", "kixmtxoxpx", "kxhlrdrddt", "llrkojtirp", "mabjlpvofl", "moliivxtth", "ncvhgbzzhd", "nrfgdiceuz", "ofpfaoekiv", "otzdxugpwr", "pijcvaivkn", "pwtbsglayj", "qldapmngmf", "qzmzmspmab", "rnwyjyrrnx", "scgxhetxbt", "sqqwekwcpp", "tfavbqyidl", "ttktyxanrh", "uhuswdctfd", "uwertjeysz", "vkoqqphegv", "vyypnvjjur", "wniolblpin", "xbsnihnuwj", "xqcmfnqakf", "yemlctsfyb", "yswjzzullx", "zhgixfwqzt", "zz" };
    int k = 10;
    assertEquals(46, likelyword.likely(dictionary, k));
  }

  @Test
  public void case18() {
    String[] dictionary = { "akagrsbcar", "aykfoydhon", "bmuemefncj", "cbedjkhsqf", "cpocgqjyeb", "ddybdwmdrx", "dsiabcojft", "egryyiqotp", "evbxvosuhl", "fjlwsuuzvh", "fxvvqaxfjd", "gmfungzkwz", "haptknbqkv", "hozshtdvyr", "idjrezgbmn", "irtqcfihaj", "jgdozlkmof", "junnwrmscb", "kixmtxoxpx", "kxhlrdrddt", "llrkojtirp", "mabjlpvofl", "moliivxtth", "ncvhgbzzhd", "nrfgdiceuz", "ofpfaoekiv", "otzdxugpwr", "pijcvaivkn", "pwtbsglayj", "qldapmngmf", "qzmzmspmab", "rnwyjyrrnx", "scgxhetxbt", "sqqwekwcpp", "tfavbqyidl", "ttktyxanrh", "uhuswdctfd", "uwertjeysz", "vkoqqphegv", "vyypnvjjur", "wniolblpin", "xbsnihnuwi", "xqcmfnqakf", "yemlctsfyb", "yswjzzullx", "zhgixfwqzt", "zvqh" };
    int k = 10;
    assertEquals(42, likelyword.likely(dictionary, k));
  }

  @Test
  public void case19() {
    String[] dictionary = { "acjjtfhfccmgfjrrtehy", "agtgsxvbiswksowgmirj", "aierodatwthgnbqupkmj", "alnbkecigcofqdvmauyf", "aocdjrxqmqhiamozxviq", "arwmheqdvwdmsksokxkz", "azqeyeicewvbdgehpvxe", "bmbqrwgzyuthbnqnarbp", "bpynxnntqsptgggjqmnl", "btxqmupcnfmryhztqtri", "byosvzkvlhyeqvtzntvj", "cydsejaazwutvajsazkz", "dfebzrefjpbksorwocbc", "efitrdbkeoxemwkhuywm", "gdfggwyuhujjfcvkvoav", "gsdpgletmuknhcxhonhe", "ihhkerhqbkbichpylpuw", "jdfmplxykmjqemaofemb", "jxpwnthifuwpijsrqgad", "kjafrdrfxxoogidcnddi", "kyecmvjyjgpzojodnxzc", "lvpgvkewrvbtmcfdjyao", "masgyfbrxvvyphblfhyh", "mgxmlgvqxfkthzrzjuaw", "moejkyzjgulgdgwkszhm", "muttjzmzerevonptizhj", "okrwdnhozskakzterbtl", "ovncrxhwzsmsvowflywc", "pbfkinfcqaifgkmhfxeg", "qklnbwxfaqgzuvxopqhc", "rcfvdkmifuxxdktfgivl", "ryajbgcngjczpkslkswy", "skpriuxzgcecckcjvzzz", "thdqmfggpnarfglkajzj", "uuiczqiibtmkvtsyqzbb", "uyzfbahbhvrllodzwoob", "vpwsahawonjgtgnxbsay", "wagadgkmmpesgoxvtgfn", "wjohnqjmpevvbdvzcosc", "wrgrneisbaitebloccej", "xukehbevwlljbzsxkqdt" };
    int k = 8;
    assertEquals(41, likelyword.likely(dictionary, k));
  }

  @Test
  public void case20() {
    String[] dictionary = { "cvsmoysvkw", "edditfavbp", "hlhsybuttz", "knrnibdlir", "lsefdfnmxh", "lyzqwupiqu", "mfocwkxtay", "mwzjkorsbx", "ocheycuouq", "pevuimejrm", "rxosyycoxx", "twsywrpgfh", "yrebvnmvcz", "znwthrnjzs" };
    int k = 1;
    assertEquals(12, likelyword.likely(dictionary, k));
  }

  @Test
  public void case21() {
    String[] dictionary = { "cdkfezpsv", "egacbqhny", "egmjcgsuz", "hdrensxnp", "hlqtlafgb", "hrkslqcwm", "jbvroooon", "kjztoemsc", "lipurgeml", "mtoyatteh", "ozwusszku", "pzuiqplza", "vrbagjowc", "vykgrgpko", "wbemqipgz", "xkkstnxxg", "xvitophxj" };
    int k = 4;
    assertEquals(12, likelyword.likely(dictionary, k));
  }

  @Test
  public void case22() {
    String[] dictionary = { "atgmemeqtzvogsocwuxqpdnqhezjru" };
    int k = 10;
    assertEquals(1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case23() {
    String[] dictionary = { "aefvhemggnnizbapekrzbvgvyqiq", "atmyxcgbybeizdpusxkbwynpybpk", "awvfoxqgscopeltrlanzdalwlpyi", "batmvnshdfupbbioslrgckkhijrz", "bhrggsdvjyyimmptptgzhweqzhgx", "bzynzhnqlcbvadmjrwyoqaalcyal", "ddjfpxtgrcseizhmpqlsiidrpgyd", "deupcjeiljlbcnhflzdsrbtqsdjk", "dtrlyatgzmmjzvhxvitecktdazis", "eejrpjunkvvtfgwbzyellqvvtotp", "fvxbdnjjnzdslklsusyxlzadhhci", "gbnhldznhpyrbnrkjyolidnjddie", "gbyeyhcrilsgscuvmklsgzlbelza", "hqlyihscnpnakutlnbldciopgqvx", "hqoohflwlsjuhndnvbphdbjkltrs", "hvnrysbehigvcalkujmwddfwgwaa", "ieuwxpyqkdpyhtglnvafnubddszi", "kmrqbrkbowvwwjypfdwrigahorqf", "kyyrqloucrhcmxeoaxdordbvcmjc", "lrhfjidtwvownqyiredgwwzwuztf", "naxfcwjsezyhlwowxhcpemebymbp", "ngxzqpgvbymwjgqhowfkwftmtpkh", "ojxfhrxmxeiftiislkhhtvaituew", "oxlxkgiqryyqnqxxxuwhifdiwlou", "psgzezbnyovfuejcjybqlrivpyet", "qdlvpnhbjjvhmtkpqeztirqfkkym", "sitnrhbzjvggchvuqzoriuqeyypj", "sjaofbyazmwsuwwtgsbuaknkmqfj", "thxulhzkjbnvacouqcgxegtcorqi", "urjufsjfhghjrgazrdnndbmpdesv", "vmxzykgqvagkzzuhzmwinjeinpuv", "vqnkcuyhunkxyoyopfmaauokrfqb", "wnzfmqbavwnwlhkekgctlragozvx", "xcrkwrovqvaydjpwuicsnowmnaoz", "yjezzxgpskwrsylouucjlnyfgeca", "yjprqojywujoswzdzomlitefnvse", "ypbjyteflugysrrqighseevibgen", "zabzozqafbiqktlgwzdsbhgnsdow", "zizdsdcgterecbpumshrrciulexn" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case24() {
    String[] dictionary = { "dakllpgnxgksafzdlud", "dbdsqtdplfkeuusonnj", "dkzwperfvoopniaprho", "fpqkqccpkibnvkhqpwq", "frjcdbwfmuexlpgzmyf", "gtodntipwanqkdhadrk", "igwfihhmvgwqclgokvm", "iiqxfxsbywmcfqzhrrz", "jagphzwjhetprrtlvhc", "jzsmcmzykjqvjodmszy", "kqchsuiskiazfzlupyq", "kruxolviixxoipaecst", "lhpxjigzobrkzlgoizd", "mhidtkzqkzcyuzqskzg", "ngqvbdvikoblrwxlgql", "njzshgzbndhfxqvdndt", "owrekcqzmwnroitfdyo", "pbjujsgjhrfoumrnnss", "pkoztbsczoxmkibukjv", "rfnfdkgnokuqniupmjs", "rohnfxwocxrxatcydey", "ryjmecehqwhodyjsusc", "shuigeuojihfgygzvqo", "uixdcxyhlkfrdhaevid", "vvhddjxegrxezsgvftq", "vwtesuqlzjoztouejyx", "yhijmglbpakxrpjgtne", "yslrkrrdoeokuifylvo", "zkachxazclzdnfhkbrb" };
    int k = 10;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case25() {
    String[] dictionary = { "aijsjikklikyf", "avtujjrcyllxx", "bcdnttzcsnfgt", "bhfwfdpivehir", "enwcygenfxuhv", "ffabiayavxafl", "gxxygqcdgtehk", "gysmttnrxbtjs", "kqltvgxbtmube", "kusxraamymdaq", "lfrzxadwcnzvd", "liopezsxfmqvn", "lkpwfzgueycbp", "lxvilifrhpzbz", "nigydlhatnofm", "nqprtiyqyfwwc", "odrefbaxojdri", "ogghfyjgptivs", "pmrhwbjunxexm", "ptgqjyznqwdrz", "pxxztykvprply", "pzujatchcfpaj", "qmtdmhlffgyxr", "rlnbnrafqliua", "slrpfaymjtpcj", "tccybbnciimjq", "thigwkmfdiqyl", "tzszyvlngqoyz", "uriawbhgypgup", "xggnwutiyhten", "xqmsitdfwlbgs", "yzjuhiodbwvab" };
    int k = 6;
    assertEquals(8, likelyword.likely(dictionary, k));
  }

  @Test
  public void case26() {
    String[] dictionary = { "dbsntydzhrppgfdxvsqilekzrtxeflquzowerpoafswrmcuxq", "donctjzfwuwdiqcxxnfmhqzzonwtdhluzrwjgnedhogpwwvvm", "mbtxwkaocwchfmhcffwlpgdndlmwcyvacapuqddzgacpjbrvz", "wrakkokypdmfqaqjuuufeyuqltxbvtojfthmgxsodiccvdiot" };
    int k = 2;
    assertEquals(3, likelyword.likely(dictionary, k));
  }

  @Test
  public void case27() {
    String[] dictionary = { "ajeuadxctudmxvuxssdnklvhrwcycttpdtdcbiweercbkk", "avtabcxnakcntrsancyhnfvhvbqzpnirchztlazlfeksin", "axrozaykrxedeynbybcymlhcganqdzyqfnlxbgcztydngy", "butshwxsdwzhymuyhhloccnjersccowvmaxgntjkncwtwq", "ghmwuczgesdwidpnncyohiqmnebxbwxkixctcrwuhxppfz", "gjkrdlzphisyryjpwlfwetmogespdwbnyhkkaafwaitdoy", "iwihjlxmbqpbbljjpfgzanwkrlpiqqdhntyrcjhilbmmzw", "keyyxgxmnoespwzsdftarpnxyfwmhrxuyadcuqxpbxyqmo", "meokipprhcfvydzzabghoamwvhgudnefajtailxsdogeog", "mqdisxrbpkmqhymotkeovrjltoihkxonrmsqrneerwiuao", "nkowypqyiynfmflsygkgmosfnhwdwijzlpcaetjopqssvo", "orpilzwltysmjyqwbqafydxtlhepokcmdukytukygkcvod", "qhazyycsdtudkllwzscfeztgeudwzjjxlaevwihlavfzux", "qnnvcuxunonzfwommdchsgulqpijnmcrfbwlrwegjwetie", "ssniprddvbvpgwzjafmhlwdceejxtdzsjakgomsklpfbnb", "tevtlfxvaehuquwkspkppnoybyjlsghytzqtujtvbuweke", "urjxfejcvsliinvncancaudbzfcyyvzdgiyfheqoipcyel", "wurstpkqpqmhmbjkuiwvqszhsxnitacwqxdkqmmogsuvtx", "xljgxuekhkdiuepddjgykcrqyguhayyeeyhuazncdkapic", "ymjwadjievsuozlwfywhyycpymnbutxasvjkyeldsalqsl" };
    int k = 6;
    assertEquals(4, likelyword.likely(dictionary, k));
  }

  @Test
  public void case28() {
    String[] dictionary = { "ytdummkrrqnwjmqrggdttrqvvmjroumggtbjch" };
    int k = 2;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case29() {
    String[] dictionary = { "bleafubdiytelad", "giafqixnizyhxjr", "hfjdlakutcubccj", "islinkkvdmkvsqm", "mkfsobdzhuyaazv" };
    int k = 8;
    assertEquals(5, likelyword.likely(dictionary, k));
  }

  @Test
  public void case30() {
    String[] dictionary = { "esjrlltoarxmjfkxncfmjsumszseaijndifwdroqcdrlqjqzal", "fendovggtyadrgdarxrwiedwpmlwauzqpjstxjsgblrcoshejv", "kfzbrojqucicthgzbhlwhwqmwvkeoqgcvgmyrdajlljjvlthjn", "kmhpsyjhobrzfqucisxbcrgwgwukhrkxubrhlrlhyudyqmfomb", "nvudhnucvbyjepankfygncpmxktubpwcicxkriotoswirqxqjp", "ojtjpvphmqefivuyinatetgfdbpqvvyaumedrmidpjdmqokvdb", "scyynxbcszinxpcrnwvrzjtsmqfvafsnxtwaqaeixvwmoekbuh", "soplmyafbuclvuzpcpkqlybhlncaxkrzycqbkncjnigmeifjlv", "trccrvhvxjvqzuvvqwpwnltuvdqaxgnflhiatatyrktnqpyilp", "uusahcxdwkpzogkdfdzxbwqnthacvqsyaltwxmualmgrmsqkoa", "wjaphagmslkeojggxorufvupxloqkusxbxtihjkgwvzobkaltk", "ybkwcnefyzobjjtktfniluewzwfnejceissroizazriqqtrgsq" };
    int k = 3;
    assertEquals(2, likelyword.likely(dictionary, k));
  }

  @Test
  public void case31() {
    String[] dictionary = { "aghikmfjeqodcyvqwmcgqy", "cidghcdzkedgelxzkmjkye", "gnadyymqzmiquqlacurkmt", "itmqddnhneswloeziylxfn", "jaemtexvxbeswzhsolgvdp", "jjgbscaadhifmgfyaqjdyc", "jussdgffgtpqrqbszgpndq", "kbccewlhjsiepkffzxksdc", "kisbwxapfiumrimvsdrkfr", "kyydkkdlhwjhfwwguigahv", "lnhzieppmbohjbiqffyrmb", "mgyoaifcodhgssoecrvury", "mnikdxnwlljnweeabxpdwq", "olfddqskvudodofrbcemyo", "oyzjmuwdrywubvaguldsnr", "peasuqqydkfjjwapsxvebq", "scezlocejyioutpodialgi", "seppwcgchmoepinkvggtzc", "ssgzeoddvmdpuzrqeujicf", "sylyjulsijdwolvixphfrv", "uhsdrwjqopdtebtwnoywkq", "uhzgnordezpftghxmdlwsa", "wgrfqoltrxogqydxrismon", "ylruoxmncdaymmhixmoqyc" };
    int k = 2;
    assertEquals(2, likelyword.likely(dictionary, k));
  }

  @Test
  public void case32() {
    String[] dictionary = { "lxd", "yazyjku" };
    int k = 7;
    assertEquals(1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case33() {
    String[] dictionary = { "abmcmp", "agfeo", "b", "blrccs", "buio", "cow", "didvqr", "e", "ebu", "f", "g", "hjytq", "hma", "if", "iu", "jpjta", "l", "lwy", "mv", "nd", "nhniq", "or", "oxgs", "rnj", "rxx", "skvj", "tfj", "uhmfxe", "uwriz", "w", "whmce", "wxmtf", "xxj", "zt" };
    int k = 9;
    assertEquals(23, likelyword.likely(dictionary, k));
  }

  @Test
  public void case34() {
    String[] dictionary = { "awgenckcdbzyyxa", "bfbcfkyqiarulfbx", "dar", "e", "fbhydifmesgvpskzsc", "fjluxkhogab", "fluarjeeoxxhysin", "hbficvisl", "idmfsccat", "lrsagwcqlcwpxemgtj", "mlhqqihzwkavcgtokr", "n", "nvujwfevpyb", "prbqdronixz", "qkixllfutsqctcz", "qqnqgqikuj", "r", "rbpdjllntsrdq", "rmxgnvsipauchvrmm", "rqmvjqiaxwdq", "rzvaactmfcpffb", "seqkdffwijrjkaxsf", "skapwjhtmw", "srgf", "twmdbbthfr", "v", "vjsznugxoohwvnxrs", "vqdi", "vvyeseyzfwsw", "vywreccuokpbvltiy", "wnao" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case35() {
    String[] dictionary = { "sraqmdrkklbbcvzsidurbchyzymghrrrrxq", "yryreroipzbxdqaupnfoqsnhfwxvcynbuvaeaixda" };
    int k = 4;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case36() {
    String[] dictionary = { "ahfocqspqaynhtyzmtzwseqotxkrbjrx", "dejbvb", "ehxyipazussfgvcxvbmpkazepnjnglcglgpp", "eoxrcxpugufviutckxmriinbqkfdkqtilzdqepxq", "esdujsomubdqqdvflcexzkshwhuwjlahgcxpahz", "fsudbzxdrayiqwoiykphguhxaeqouhx", "ftwvrkyqdxxnhmkpxyaknwoxdncydbxeoilyozcftjlho", "gljniakbjrhffmlycr", "gmwvyqvm", "gumqbzcovydbeeyfreqjivlmcnwzoyibhomwjkodpir", "gvhgfeoxygmlptvxapxzwfjrhijyzomygujhtseftmgfg", "hjiejacwqpzepbtfbglgblocnepjg", "jf", "kazvwivrlrs", "kstiesrhryjfhymsfa", "kvtwgpmwweukubeczpuqx", "mfnofefbxhxhhbosyjt", "nvsyeevwxboiri", "o", "obudjwdvpjuftmjuycieqjeciszdw", "oijhtmyhbfnzup", "qswzlmxujepzxewpzftrhxlkskplzvybuqeurcklap", "radpzmfxmdtllkm", "rhvxsaezbz", "rijrxfvifbnmlfygcrxpltmnhbxabqifwvnmcquqzkjzpjoa", "rmedvspwnmokxjbnbttvn", "seefnrjgnsferpangjeyzqhfbqgawkjavhmpmkgwxcseyw", "sjgvbyaktxsmnmyamxmpghqxntdsmkthvncpw", "twmhzqunwnrooundlpmblwvafooegklmb", "um", "urmywqfmwfnkc", "uvwcodaxzslmxytizkjvqjuyfbsrrqfusqenydufowty", "vgfzlcxwifphqtgesbdbhnglwwwenaggttyyees", "wponbxeepmaxhon", "wsqljv", "xnkemkqmqidtdbirlqidyzljuuitblehspy", "xrlomftszqtzgebkiprncvimnuhluyawjzqzgymhmesvvfi", "xvnzeaqhaheiywfnviwy", "xwkfhyhhdurhyhatavwoikwoagnhabrgu", "ziiinjcpmvclyqzutjygkqdkukekmjchqkyfbnivfypcoj", "zitxtfpitmtdlejqoxqob" };
    int k = 6;
    assertEquals(1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case37() {
    String[] dictionary = { "bplflw", "e", "esjpd", "fxovumgztr", "hwvmpbdgu", "i", "igzsquvzzc", "kdthgpbllq", "lihieqqkh", "mn", "ngfh", "pzz", "qo", "ro", "uiumin", "vortvfphdg", "z", "zjdm" };
    int k = 3;
    assertEquals(16, likelyword.likely(dictionary, k));
  }

  @Test
  public void case38() {
    String[] dictionary = { "aixhzzvxehy", "bweydmczaxnhxe", "drgzr", "eczuxbqv", "gnfzu", "gqkujouciefg", "hbvbdwjrspuvei", "hpgxkpfoy", "ieeodjpqeexhxcvq", "lpeczjzhjq", "mlgvhvbtcq", "ncdmvfkjuffuyiv", "oe", "rapyn", "rn", "touvatezhdpafti", "zmk" };
    int k = 4;
    assertEquals(16, likelyword.likely(dictionary, k));
  }

  @Test
  public void case39() {
    String[] dictionary = { "ahtbghxbdlavzhmohnfhxeyrh", "bopnxndpeqsiijtpsmytlzyhrtyzcx", "bzebfehbyjxorp", "cijyqcnmc", "ckbmbicfbvrxtnfcyatbmwpmrrzhbeotd", "csztzjawuyb", "cvdvs", "dhpmoxvevlshcriuhgstqpoxmypunaugjt", "e", "ejypgnsqn", "ewkbafwwciyzzgosle", "fwhttnlchiminpyxwffwmszeiezkoub", "gdbazljagivgytnu", "gtms", "gxbjfx", "h", "indln", "itvkjojzhx", "jvuvsjhdwlt", "kfsuozhphfjte", "m", "ncpgppstacrvrgspdfvcxmyplj", "nfrymubcss", "ngfmcfogzutqhfvxe", "ngrtxefybftbvp", "ofijflgtvsggr", "ogzrlqdvqbbhlwyeycqwuxnmhzmdir", "phfddgyraxjegbyblcfcuawchj", "qdlrtcpwnkpotxxaoysrgqsq", "qvyttwcxzcuccdl", "rcdfndnfriykbgy", "relarwskjbhlmjfbuvltnpluccw", "skvaxgdqrue", "tacbcfbggtmfxkyazhtytouhqse", "tqzya", "udldhxfwjunqfqwnbnbryckzn", "uertgigtmmbga", "ulvypfkiorcgsidjrqapjytqzpbieymj", "veqdyunublzkydxvepd", "vfovqsixr", "wjxhbiaxrpwfcqblchevtvqcf", "xqitdlnilragyqoykeklyqilj", "xsjtcsbylukeav", "xzibqbgrfknglqiiwtdpgwyozyus", "zgzoqzdealx", "zm" };
    int k = 7;
    assertEquals(20, likelyword.likely(dictionary, k));
  }

  @Test
  public void case40() {
    String[] dictionary = { "arkgyvxmyjdtjteilxybdynyi", "aryqmarkgzfbjjjjltuwopyvupz", "aspeoqomxxapalpmhvpbnmswxgvfumppfrlwkcorpa", "bjhjljdybbflxky", "bqgfjbnusjdqyrmzpxtuwohpjrolldlrjjwel", "bzuhdbycxspwjgozpjfgyfdgiyvgs", "czjyqmn", "doheluilxdw", "ecmwkbxxjwwbggegeqkymplisdtuuuwkced", "eqd", "flzvvyxkyajtvcxzlzpgjwrkgnpujwqhdmqpmmaqwlzof", "idivemqsdzyccucnimbhdlvl", "iwomiermmlg", "jinybyohipznwpjjqu", "jwpnthaqjiyzcsuizcvxsyzoiotghtnj", "kcksaqvxdlyxvtrz", "lavwsdvdpxmiarzhwmizjgaekjb", "lczbjavfaytnp", "mewdrhcxpoyadexvqtleevlbhzlppgvknvfjqwkdtz", "nogka", "oajantiat", "orwglbxsaxoqishqwszahbnpjppvxusmrxucfyxj", "ptoftmdkuluvzzfgyhhzspfytxfnxhokaqrytejr", "pvpfbinhbnnz", "rdeynueslauwswyhrdtyhnvmwkrqhqhslfptnj", "sssiomyfirffhdduwvehjwqxsqmnwutnzpl", "svdrpfbf", "toepxiytummszghbfribaqdwnaunawhsc", "ufxeubendlbdexkqqvxzfunwhtdzvefktofbclcqf", "ulcagtf", "wlejtwmewprmlwxwmczzbkcbqjcombqlnggjlpiysh", "wludvhcxfonzqmjhiqbxzzychslutvxzczfpt", "woodjddepfewujopqbrqzngmotkxs", "zabqaleheufpsulszj" };
    int k = 2;
    assertEquals(11, likelyword.likely(dictionary, k));
  }

  @Test
  public void case41() {
    String[] dictionary = { "awrnrkmauhjranhoovqn", "byjworbkxxljjwk", "cimstkiu", "cirrafzlpzkrnkcsvxsyhwnvfyizn", "ckxshkacie", "ecavdiishprzcjgbkipojcetnuhq", "erhoauyjhodltcywdtahepfnrevluz", "fuwoeescdnnetmimcynflkzttshfmbi", "gpdsdhi", "gxongeigzievpjc", "htteiyyunqeuvkhyrk", "hzfodvloyacmqqqpf", "ijtpzjwcmzsjxghkwmjwzbvwwbtsu", "ipjm", "ixvnfyeaawkatgctpdj", "jb", "jmbvidrsifwiirlvmtc", "kjerpxklsmisolu", "laauhcczcqgsgsgiuihb", "lcrjoylmbvvzmkurtltbkmacdokn", "likvjpvnspfgnzqubfxhdkccdfvjq", "lum", "lwyxokkit", "nibocnwstvnwskywzacwhjhicrm", "nksmezqwfrtnbhsznrn", "oewzroywyzjghoja", "papvmwdhgmziqasxvihgiczc", "pccsekokde", "rqfzicvhxbeb", "sqautdwrdbbs", "syzfgqugzpct", "wr", "xkpdofydqpoljeehvrjfuwbbi", "ysudxrmlio", "yxfhuiqsyboztnszjmtjablaz", "zjxlphoyjhndhegophaik" };
    int k = 7;
    assertEquals(31, likelyword.likely(dictionary, k));
  }

  @Test
  public void case42() {
    String[] dictionary = { "auovpzswlukuelnzncrmurdrjceqzw", "aycepssm", "cicjsjbvxdbutjtqygdytyl", "dnvzxpdqqftctookvap", "dyqrzoqgxzurbipzfwdd", "eyrbldqygilljslaaovsal", "fqsdzvitncpheyryjzcdjohuyinamn", "hernjewiacihtijwnjcprn", "id", "jffo", "jmethjrnmbfyjpxnzmqpajwsxl", "jtirvbvpeorvppoespj", "kyvtzundvyoebbxj", "ofqxkvbdht", "ohgmebdggioayaehkxvguxidytmd", "qzxyfcwkihoagfiqyqyky", "udwdlxgvimxeumwstiprgqvrxyz", "veahxnpzygsmwxudlelxsxfexxvbhar", "vtwerkpx", "wtxyofmwqdarbmni", "xuasazpgqadeufinvhb", "y", "ytktsds", "zbqilyzdslojxxssuaphrmbuy", "zbzttivawltntkwtw", "zefysbywkrorrsmdpbpzzjkqvcsbxvy", "zirlmjrvblbnczjevukddeorwwm", "zqjcdlcrckclsxxivrpwhdcoa" };
    int k = 10;
    assertEquals(13, likelyword.likely(dictionary, k));
  }

  @Test
  public void case43() {
    String[] dictionary = { "aenyleocrfoeq", "chrsyqcvpituiilegc", "csomt", "eqgpzkmfxymsuetbawyr", "fvicdbx", "ib", "itbqb", "jiargtjjdtgciphpk", "jkcwffoxpfgg", "lvvkkwll", "mgtdvv", "oqggdwlmzjl", "pdwstbgfvr", "puakmtwgxktgkekq", "qdszuyeanmtuznzcp", "relivaur", "sexifwnvskuwvuvwo", "sfeed", "sjmwavuhuc", "tobacvvmeqtlyvj", "uppdkdfijvqsrkdfvrwxu", "uuxmmmazlo", "uxpyegj", "v", "vi", "vsnwmjd", "wmqrlxt", "wnceatjxq", "woo", "xzmobhpuu", "ybxgfklospzrp", "ycxoy", "zxauopsxdop" };
    int k = 7;
    assertEquals(9, likelyword.likely(dictionary, k));
  }

  @Test
  public void case44() {
    String[] dictionary = { "bccklehqitnrppadbikgvx", "bctvibppsvdreter", "bxutsyeejdzkef", "efcuztkb", "elia", "ezolkcfqaoikwsaercbap", "fnetfpoefxftdxtfpsydpuz", "forzy", "fowonlminpgtwydopqfhiw", "fydvtebvz", "h", "ixjafyjfiwrvti", "jdmzbhuhh", "kiluljcasyshict", "laqjafbsbodydyqkep", "lkmvqzrojzpgznpmyj", "ll", "loxejsiahfambj", "mhleeejvrudc", "njixpfrvjovyxybpfni", "npaumxfhocyfacrdzvgvwmy", "pbwtfmguhpihjnmhz", "qlvanyxc", "qojp", "rh", "rzkvynvsgxcpc", "tgbifftzxvbdudcyb", "tybflytqymbhgtpijaoy", "ujythelpuvqpiomjwhlcjvd", "vvruaogzacxqoapnsnnygzr", "xrkotqjlct", "xtmxkrsdr", "xu", "y", "yqnoqxvsmergi", "zjmlfnbmqykrjbkycgl" };
    int k = 5;
    assertEquals(3, likelyword.likely(dictionary, k));
  }

  @Test
  public void case45() {
    String[] dictionary = { "jhpoovptqkvhafqxnrwkpwezyyulthknahwfhujzovgobamvz", "jhpoovptqkvhafqxnrwkpwezyyulthknbiksv", "jhpoovptqkvhafqxnrwkpwezyyulthknbmdrtghdqnplhtrr", "jhpoovptqkvhafqxnrwkpwezyyulthkncpsehbuiwbtto", "jhpoovptqkvhafqxnrwkpwezyyulthkncpstets", "jhpoovptqkvhafqxnrwkpwezyyulthkndqqvzatetyun", "jhpoovptqkvhafqxnrwkpwezyyulthknen", "jhpoovptqkvhafqxnrwkpwezyyulthkneplelrjpx", "jhpoovptqkvhafqxnrwkpwezyyulthkngbjosfwt", "jhpoovptqkvhafqxnrwkpwezyyulthknixptdmj", "jhpoovptqkvhafqxnrwkpwezyyulthknkvqodwo", "jhpoovptqkvhafqxnrwkpwezyyulthknlfmcfyqnvxg", "jhpoovptqkvhafqxnrwkpwezyyulthknmhufk", "jhpoovptqkvhafqxnrwkpwezyyulthknmoscxuuocnwdsk", "jhpoovptqkvhafqxnrwkpwezyyulthknnbtejbfiowpowtzg", "jhpoovptqkvhafqxnrwkpwezyyulthknnenizubvtotzx", "jhpoovptqkvhafqxnrwkpwezyyulthknosf", "jhpoovptqkvhafqxnrwkpwezyyulthknpdxvfjnmjrkdumne", "jhpoovptqkvhafqxnrwkpwezyyulthknpzzuwezwzqdz", "jhpoovptqkvhafqxnrwkpwezyyulthknrckw", "jhpoovptqkvhafqxnrwkpwezyyulthknrkbpbvphukguw", "jhpoovptqkvhafqxnrwkpwezyyulthknrugfqhcgdcvkzgg", "jhpoovptqkvhafqxnrwkpwezyyulthkntnlhwhzthctarmzju", "jhpoovptqkvhafqxnrwkpwezyyulthkntqhhbtduft", "jhpoovptqkvhafqxnrwkpwezyyulthkntsrxroljxf", "jhpoovptqkvhafqxnrwkpwezyyulthkny", "jhpoovptqkvhafqxnrwkpwezyyulthknyamamequzzfwafwslj", "jhpoovptqkvhafqxnrwkpwezyyulthknybypqbn", "jhpoovptqkvhafqxnrwkpwezyyulthknyhiqxzkootyfzoe", "jhpoovptqkvhafqxnrwkpwezyyulthknywtenmbdwjhawnl", "jhpoovptqkvhafqxnrwkpwezyyulthknzhaewpmyredlcy", "jhpoovptqkvhafqxnrwkpwezyyulthknznzpjwreqgt" };
    int k = 8;
    assertEquals(32, likelyword.likely(dictionary, k));
  }

  @Test
  public void case46() {
    String[] dictionary = { "llvbyxhtfbwxapxzeuivcudtj", "llvbyxhtfbwxbqw", "llvbyxhtfbwxbrmaphxyazvyc", "llvbyxhtfbwxbtlfcvcsbstqkrsnrfcjsfawnusi", "llvbyxhtfbwxbynqwjx", "llvbyxhtfbwxbzoqtdzxkopplntaeckkwbfosq", "llvbyxhtfbwxcwliymubnuuqftc", "llvbyxhtfbwxdatffshiscwenzhxoayupckxsqcurgth", "llvbyxhtfbwxemldfjb", "llvbyxhtfbwxf", "llvbyxhtfbwxfmpfrwyigkwuwccaqwrfuxaibmnmolceca", "llvbyxhtfbwxfqwnpsvvvkrhtqmiedftrstobesuagfcwioa", "llvbyxhtfbwxhcteboqgsohijbhlgwyse", "llvbyxhtfbwxheeqvtfdydlmpzzorehvsmoasaytgjnjpabq", "llvbyxhtfbwxiqujjaendnqdqdmhzthuouj", "llvbyxhtfbwxjiblbasxonjeencylyaexueydrrrgwfgzjy", "llvbyxhtfbwxkdiusryyshyqsqrfcrilvby", "llvbyxhtfbwxklwnn", "llvbyxhtfbwxktdaxjmsqlfwdyswmwelynfvdasnqzbnyc", "llvbyxhtfbwxlafbmohqciraszxhaueszym", "llvbyxhtfbwxlurgrftfgr", "llvbyxhtfbwxlxdueodlykliitpugxrfkt", "llvbyxhtfbwxmjoadwokalvidzjrqtdtj", "llvbyxhtfbwxnfgme", "llvbyxhtfbwxohcugyivccvu", "llvbyxhtfbwxpnriznaokaruluspulbtqbltcudfh", "llvbyxhtfbwxqrnzexrgf", "llvbyxhtfbwxqxco", "llvbyxhtfbwxscxopdqjiajvhmnqbjqvhpvkmecbhewdbs", "llvbyxhtfbwxsfejqqzzufozkjuisgza", "llvbyxhtfbwxvbdltaykfbmafsoypqehrbsgyggiel", "llvbyxhtfbwxwedajezcuvejpfzwjoi", "llvbyxhtfbwxwrgpmuj", "llvbyxhtfbwxwuwsdnfdufzd", "llvbyxhtfbwxylogfduknveyxjqcqygw", "llvbyxhtfbwxyoy", "llvbyxhtfbwxzoivzrpoffjpkjxflc" };
    int k = 1;
    assertEquals(37, likelyword.likely(dictionary, k));
  }

  @Test
  public void case47() {
    String[] dictionary = { "uuapiczsbcrvxdalomvfdwdcn", "uuapiczsmjjgnqiixbfsfseugylpmsjzaexqavrhul", "uuapiczstvgigosndjlnztctfmtwymxylrpevngxfdxvbnof", "uuapiczswqrhpndqffg", "uuapiczszqsweudutwyuaghmbvlypuxotagkgvohtmsldujc" };
    int k = 7;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case48() {
    String[] dictionary = { "gamfthnwnmdegipmlpdnaooujydcatfv", "gamfthnwnmdegipmlpdnaooujydcbsdcqrmoptjpixh", "gamfthnwnmdegipmlpdnaooujydcfbubshardtyfyublwpmly", "gamfthnwnmdegipmlpdnaooujydcfgrwxoqguugvvkmevvef", "gamfthnwnmdegipmlpdnaooujydcfqdbqlexkbobvu", "gamfthnwnmdegipmlpdnaooujydcgitvubnoysydf", "gamfthnwnmdegipmlpdnaooujydcgl", "gamfthnwnmdegipmlpdnaooujydcgofmsnefkgdfjelbonas", "gamfthnwnmdegipmlpdnaooujydcheniyh", "gamfthnwnmdegipmlpdnaooujydchviyb", "gamfthnwnmdegipmlpdnaooujydcivnxbvaqrq", "gamfthnwnmdegipmlpdnaooujydcjcbprcbrjrucivcqyjgnie", "gamfthnwnmdegipmlpdnaooujydcjzywkc", "gamfthnwnmdegipmlpdnaooujydckqdezfpmux", "gamfthnwnmdegipmlpdnaooujydclxsztwyakyqsybaqfhiyq", "gamfthnwnmdegipmlpdnaooujydcmeavqotdyarmlnfoohra", "gamfthnwnmdegipmlpdnaooujydco", "gamfthnwnmdegipmlpdnaooujydcomuxsgisugypp", "gamfthnwnmdegipmlpdnaooujydcpokpbqzqllah", "gamfthnwnmdegipmlpdnaooujydcpqyogpmvccvi", "gamfthnwnmdegipmlpdnaooujydcpsoqt", "gamfthnwnmdegipmlpdnaooujydctvhiwamjpqfz", "gamfthnwnmdegipmlpdnaooujydcu", "gamfthnwnmdegipmlpdnaooujydcudprdvkrpsbkntevx", "gamfthnwnmdegipmlpdnaooujydcumtsqawctalfunbtvs", "gamfthnwnmdegipmlpdnaooujydcvwmjukykswjbfsjqnrdkf", "gamfthnwnmdegipmlpdnaooujydcxgqstpftyym", "gamfthnwnmdegipmlpdnaooujydcxpovhdyzehzjehfl", "gamfthnwnmdegipmlpdnaooujydcxrtkhbzsrfibqvtdkqguea", "gamfthnwnmdegipmlpdnaooujydcxwmgqltgodyux", "gamfthnwnmdegipmlpdnaooujydcyqhndnldxfpanpvbkqwhe", "gamfthnwnmdegipmlpdnaooujydcz", "gamfthnwnmdegipmlpdnaooujydczmrwvtkiye" };
    int k = 9;
    assertEquals(33, likelyword.likely(dictionary, k));
  }

  @Test
  public void case49() {
    String[] dictionary = { "yaldbdocptyukqrabehrtuurmspcepfrfjlttcgg", "yaldbdocptyukqrabehrtuurmspcwkqihoccs", "yaldbdocptyukqrabehrtuurmspgkcdka", "yaldbdocptyukqrabehrtuurmspgvpmq", "yaldbdocptyukqrabehrtuurmspjyrpccdlwwigtyhrqgpah", "yaldbdocptyukqrabehrtuurmspkmrgkgncmihrqgvz", "yaldbdocptyukqrabehrtuurmsplwdsvlkldwtthzk", "yaldbdocptyukqrabehrtuurmspmhnnagbm", "yaldbdocptyukqrabehrtuurmspmozpp", "yaldbdocptyukqrabehrtuurmspnfclcedc", "yaldbdocptyukqrabehrtuurmspnfwnlutlfq", "yaldbdocptyukqrabehrtuurmspnnphlupwltufhtm", "yaldbdocptyukqrabehrtuurmspog", "yaldbdocptyukqrabehrtuurmspovkw", "yaldbdocptyukqrabehrtuurmsprkwbdztjlkapxbyctywfdb", "yaldbdocptyukqrabehrtuurmsprnij", "yaldbdocptyukqrabehrtuurmsprokcqtlbotrcmesbcbqgzym", "yaldbdocptyukqrabehrtuurmsprovvio", "yaldbdocptyukqrabehrtuurmspscuprrhaffoegfushhuovwv", "yaldbdocptyukqrabehrtuurmspshoeo", "yaldbdocptyukqrabehrtuurmsptpwjvokzbcctltkyhwai", "yaldbdocptyukqrabehrtuurmsptxpksymjzkxnmyqwzie", "yaldbdocptyukqrabehrtuurmspuec", "yaldbdocptyukqrabehrtuurmspugkygofdvrfgbqfxtuopri", "yaldbdocptyukqrabehrtuurmspvdjypmaww", "yaldbdocptyukqrabehrtuurmspvrujjhlpjbctxag", "yaldbdocptyukqrabehrtuurmspxjfsuwllpz", "yaldbdocptyukqrabehrtuurmspxlrubq", "yaldbdocptyukqrabehrtuurmspyz", "yaldbdocptyukqrabehrtuurmspzg", "yaldbdocptyukqrabehrtuurmspzmwabmnafu" };
    int k = 6;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case50() {
    String[] dictionary = { "oewvqgcgrnyvvtbgbeauveuwbluepkils", "oewvqgcgrnyvvtbgbeax", "oewvqgcgrnyvvtbgbecgwgkaxsomytedkvlmo", "oewvqgcgrnyvvtbgbecpxgrbsgdtkrpmohnss", "oewvqgcgrnyvvtbgbeduvrbsnlcozhumoqpztikvdupdbl", "oewvqgcgrnyvvtbgbedwdniu", "oewvqgcgrnyvvtbgbeedouhnsxunqqwwhkcpsteunquekm", "oewvqgcgrnyvvtbgbeelkatruywzrkjzjrthe", "oewvqgcgrnyvvtbgbeeom", "oewvqgcgrnyvvtbgbefabygvvmzf", "oewvqgcgrnyvvtbgbefh", "oewvqgcgrnyvvtbgbegzobnkifwaxkz", "oewvqgcgrnyvvtbgbehdmrxyvszakznxoxtuznlccpzdr", "oewvqgcgrnyvvtbgbehjwsrlyfybcacpzkptqqzhlglecx", "oewvqgcgrnyvvtbgbehqadwhlrkjwbvgrox", "oewvqgcgrnyvvtbgbehwlkjrevsuzcxfisuubsnsdyasjoa", "oewvqgcgrnyvvtbgbeliltveteupwvujtdbybmvrff", "oewvqgcgrnyvvtbgbelpwzgc", "oewvqgcgrnyvvtbgbelsnpkugzoimugmsmzdfnxkixqcrcsaw", "oewvqgcgrnyvvtbgbelsujuiiozpqsvsvoktezepwkv", "oewvqgcgrnyvvtbgbelzysqydnripntexdg", "oewvqgcgrnyvvtbgbemaostyuiqptzcavxrtaemaaphoby", "oewvqgcgrnyvvtbgbemggdheetucikdnysamrdneiaenenub", "oewvqgcgrnyvvtbgbemtrjvayoohytzpyrscpfnuwpdzmkq", "oewvqgcgrnyvvtbgbenpkkuyunwthozouhjzdyn", "oewvqgcgrnyvvtbgbenqssztktrezitvgveeqrkol", "oewvqgcgrnyvvtbgbenzvbeweywicbite", "oewvqgcgrnyvvtbgbeodonh", "oewvqgcgrnyvvtbgbeoomlbizbxhvuqtkn", "oewvqgcgrnyvvtbgbeotqlbxk", "oewvqgcgrnyvvtbgbepj", "oewvqgcgrnyvvtbgbeqohzuiywlkuc", "oewvqgcgrnyvvtbgbeqokyhskxjedumksbloltxlvzcfjk", "oewvqgcgrnyvvtbgbesedqji", "oewvqgcgrnyvvtbgbetujxfreheeygaocjofmuhpjpzr", "oewvqgcgrnyvvtbgbeuqngxtxibumgvdvxuq", "oewvqgcgrnyvvtbgbevbbudhqht", "oewvqgcgrnyvvtbgbevfrmd", "oewvqgcgrnyvvtbgbevuetmantgfv", "oewvqgcgrnyvvtbgbewegfvwiwnskxhjgct", "oewvqgcgrnyvvtbgbewhp", "oewvqgcgrnyvvtbgbewogmn", "oewvqgcgrnyvvtbgbexeqonecwwjhvgwwewznhlczvxa", "oewvqgcgrnyvvtbgbexm", "oewvqgcgrnyvvtbgbexucvhlrgqzodzwtyfurnrazhzergknq", "oewvqgcgrnyvvtbgbeyehkjdznvtrfpwpucvkvzrfol", "oewvqgcgrnyvvtbgbezvshjtuhrfowlp" };
    int k = 2;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case51() {
    String[] dictionary = { "emhtqtcqpfbvjemmwcrlethmpvjddzqrazg", "emhtqtddfdnftiydkbjomibderbrqreutxfqfftnhryxfm", "emhtqtdmxfzfcpflnxuxybhbjccxpxpnicxbutwqaze", "emhtqtdzupsnqhnwoqdloozeshgxaiigejmlnkaezqpdluiir", "emhtqtiq", "emhtqtiqau", "emhtqtk", "emhtqtkclmd", "emhtqtmavkomxnpgdiyswhojbwh", "emhtqtnlhmtmktxfiriwujrdjcikhxphp", "emhtqtnzi", "emhtqtooedknjdbedfkuygdj", "emhtqtujsnhbfvvneyytivdirg", "emhtqtuxglutwrfaikywhlgulkoeodaczotaamjt", "emhtqtzmws", "emhtqtzrjirgjibbvfvavwfjuvxkczztcrazjxqtaxe" };
    int k = 8;
    assertEquals(16, likelyword.likely(dictionary, k));
  }

  @Test
  public void case52() {
    String[] dictionary = { "tdaeqwalrqz", "tdbcdltorhtplvhibfvrvebkpyaktkhdadwejvmqskgn", "tdbhcbhulw", "tdbhvzdwsyauin", "tdccrgiujwhbvhcdqtco", "tdci", "tdcqaeegmqixbg", "tdcrvkbdakssyqkcqkmd", "tdcsgodblweavq", "tdczcstfzozy", "tddngcq", "tddyuxcetydbuvlg", "tdelfijuxxjfrydjia", "tdespbjkcjmrtkpwgujt", "tdewkxzwkkacqljagcrshiolcgyseoefchjqzdyhjvihkegwv", "tdgittnbfszycnekfsymiwexgfdhlp", "tdgledvncxfqiuxxlvzdkiuiv", "tdhbditxwnssayysbckzs", "tdhvpfmovzymtyhlgzrqrlyjdlozedijakyednzxkbmz", "tdivculkbnlftasipjslytrtaqhnrgczkidcqyntlbq", "tdjfcaqwqgtnetsxkjpsgo", "tdlwrsjfhmgolbaocfvvshphdbqcmstzehouojc", "tdmluogfgmplzvpbkbtcyyk", "tdmmuzpahcue", "tdmzzbvblhusobndmmerynrpl", "tdnfsykoyklzjwfhdnrgwzinqndzjcwzeklxcdnzgtp", "tdnum", "tdnymipkcdqd", "tdo", "tdohrwjefyabmsfbjuvomjloyrrcjwfsfuwqxgbahqrcmzzf", "tdophwe", "tdoxcxprrvgazifiwuhhqbdfikplyprqrjfighbznysr", "tdprlgntbjuyumswcgzkefnkjgtlgmnhyxxhudevepqn", "tdpwykvjytid", "tdqkypmfoouvsdpohwvghjvbgwfyrahhzcixsskfzuuz", "tdqxtbcdrgquztczwmdda", "tdsodgxkgeuickcporkpvaeyyrpulczrntwi", "tdstpjumixioqvndjpzsl", "tdtipddciyipr", "tdtyuswnqnqstubfc", "tdvrljullulqjyi", "tdvzdktdwamxibbldzphmcdgglfknpyqkmbiqejthin", "tdvzgnqzbdicpqidlktjwvqihbfvvbsc", "tdwcwqkczm", "tdwutnudmzkezxxqcdagoqxzpxroqfmeycdurfbqitqaignl", "tdwvamgaohdheko", "tdxqaksxowvtivlndqxnzwgpzvlwp", "tdxqcjncxzsdwqkqsqupkaeppikyzdhxxhsxrlmpliooitgbt" };
    int k = 3;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case53() {
    String[] dictionary = { "aekavdwxifqcrskfsbutlxuxzqgage", "aekavdwxifqcrskfsbutlxuxzqgagmznnxdm", "aekavdwxifqcrskfsbutlxuxzqgagpjdggswiefsxmujjcn" };
    int k = 7;
    assertEquals(3, likelyword.likely(dictionary, k));
  }

  @Test
  public void case54() {
    String[] dictionary = { "voqpollhqetxboboqcgbxucyfcgujjohcjmwntrzqvrhodqf", "voqpollhqetxboboqcgbxucyfcgujjohcjmwntrzqvrhohu", "voqpollhqetxboboqcgbxucyfcgujjohcjmwntrzqvrhom", "voqpollhqetxboboqcgbxucyfcgujjohcjmwntrzqvrhoo", "voqpollhqetxboboqcgbxucyfcgujjohcjmwntrzqvrhoooju", "voqpollhqetxboboqcgbxucyfcgujjohcjmwntrzqvrhorffcj", "voqpollhqetxboboqcgbxucyfcgujjohcjmwntrzqvrhotse" };
    int k = 3;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case55() {
    String[] dictionary = { "ntsouloyazpcpmugucxhhsxqejzclqhiybtcii", "ntsouloyazpcpmugucxhhsxqejzclqhiycamvgnxogyz", "ntsouloyazpcpmugucxhhsxqejzclqhiycrrysp", "ntsouloyazpcpmugucxhhsxqejzclqhiyejnej", "ntsouloyazpcpmugucxhhsxqejzclqhiyelvzqieb", "ntsouloyazpcpmugucxhhsxqejzclqhiyfcr", "ntsouloyazpcpmugucxhhsxqejzclqhiyfqjhsckwlbm", "ntsouloyazpcpmugucxhhsxqejzclqhiyfutt", "ntsouloyazpcpmugucxhhsxqejzclqhiyinabxflhmjf", "ntsouloyazpcpmugucxhhsxqejzclqhiykiawyxa", "ntsouloyazpcpmugucxhhsxqejzclqhiykzjjayf", "ntsouloyazpcpmugucxhhsxqejzclqhiylyfvtlakpr", "ntsouloyazpcpmugucxhhsxqejzclqhiymlrtte", "ntsouloyazpcpmugucxhhsxqejzclqhiynlo", "ntsouloyazpcpmugucxhhsxqejzclqhiysndleurm", "ntsouloyazpcpmugucxhhsxqejzclqhiyxkwumuarbf", "ntsouloyazpcpmugucxhhsxqejzclqhiyxwpxxcfpyrgyuyzjm" };
    int k = 8;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case56() {
    String[] dictionary = { "yahyamvgjjzzueabapsdafacmauucenbozpawrebhpdlv", "yahyamvgjjzzueabapsdasjqrvnnlznyymjocifau", "yahyamvgjjzzueabapsdauxqljdnthtj", "yahyamvgjjzzueabapsdbddjziwi", "yahyamvgjjzzueabapsdbghnlziedamxmiqaaukwcjdzss", "yahyamvgjjzzueabapsdbjykclcnotr", "yahyamvgjjzzueabapsdbmkyeinhoqqqz", "yahyamvgjjzzueabapsdcbwztommnnjuerkinjdolkw", "yahyamvgjjzzueabapsdccucfhaiigdqsdsuhlnwtoh", "yahyamvgjjzzueabapsdczihlppsytdv", "yahyamvgjjzzueabapsdetusvfsemthouazplndhydm", "yahyamvgjjzzueabapsdeueoiqeuzmpvmkk", "yahyamvgjjzzueabapsdhqzgqxtyxlqqj", "yahyamvgjjzzueabapsdhwtnjzhlpsorrsjd", "yahyamvgjjzzueabapsdimltlyklwvlyfnjhdoxmh", "yahyamvgjjzzueabapsdjalfkmw", "yahyamvgjjzzueabapsdjhzrlklzq", "yahyamvgjjzzueabapsdjnlvj", "yahyamvgjjzzueabapsdjuomfhsvntni", "yahyamvgjjzzueabapsdjxqruqpsljtibnn", "yahyamvgjjzzueabapsdkkw", "yahyamvgjjzzueabapsdlbrqnhsxfrfhtfvi", "yahyamvgjjzzueabapsdlgyykfffq", "yahyamvgjjzzueabapsdlnudtotykbbxnadnmmmxcbguslpvh", "yahyamvgjjzzueabapsdluvwdgqpwpkaooucpjdrwmuddx", "yahyamvgjjzzueabapsdnglfcqbqyvxquvysrayvofgqmpd", "yahyamvgjjzzueabapsdobcpffdfytgxsszm", "yahyamvgjjzzueabapsdobnyyz", "yahyamvgjjzzueabapsdrcgllptihphqqywrnetixpmglltjc", "yahyamvgjjzzueabapsdrfylkybwrqaeq", "yahyamvgjjzzueabapsdrpnapueefjovexvdlg", "yahyamvgjjzzueabapsdsg", "yahyamvgjjzzueabapsdspubbetqvpdzndxrcvseteoktqook", "yahyamvgjjzzueabapsdstjtwgzoskejxiqzrfsrtzlefh", "yahyamvgjjzzueabapsdtbsesippebzdyavjnvthugulfzk", "yahyamvgjjzzueabapsdtxkwn", "yahyamvgjjzzueabapsdvkrgyxdlfulgufvkhagiqjloed", "yahyamvgjjzzueabapsdwtzwighwudeslhzyhvfmmexll", "yahyamvgjjzzueabapsdynpipmcmdvvnbobdclj", "yahyamvgjjzzueabapsdzxoi" };
    int k = 2;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case57() {
    String[] dictionary = { "a", "mm", "yyy" };
    int k = 2;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case58() {
    String[] dictionary = { "a", "mm", "yyy" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case59() {
    String[] dictionary = { "b", "d", "t" };
    int k = 1;
    assertEquals(2, likelyword.likely(dictionary, k));
  }

  @Test
  public void case60() {
    String[] dictionary = { "a", "ma", "z" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case61() {
    String[] dictionary = { "aa", "cc", "ee", "gg", "iii", "kk", "mm", "oo", "qq", "ss", "uu", "ww", "yy" };
    int k = 2;
    assertEquals(4, likelyword.likely(dictionary, k));
  }

  @Test
  public void case62() {
    String[] dictionary = { "a", "c", "e", "f", "g", "h", "i", "j", "k", "l", "m", "o", "p", "v", "w", "x", "y", "z" };
    int k = 1;
    assertEquals(13, likelyword.likely(dictionary, k));
  }

  @Test
  public void case63() {
    String[] dictionary = { "a", "c", "e" };
    int k = 1;
    assertEquals(3, likelyword.likely(dictionary, k));
  }

  @Test
  public void case64() {
    String[] dictionary = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "zz" };
    int k = 1;
    assertEquals(25, likelyword.likely(dictionary, k));
  }

  @Test
  public void case65() {
    String[] dictionary = { "ia", "ra" };
    int k = 2;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case66() {
    String[] dictionary = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    int k = 10;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case67() {
    String[] dictionary = { "bfesynmly", "cdjoqiigdhye", "chwjdegvvgi", "dbsyyfdnt", "dipywmdptcfm", "dysacdnw", "ejj", "elubhatrtdh", "fhv", "fpodlzg", "gkrenykqv", "gpxpstkx", "hguv", "ibvyzde", "icqbd", "iyokywyevnp", "iyynm", "jaolhulzlp", "jdgphnlpbgl", "jgcdxhzmkcs", "krtk", "krynchnramrr", "kwulptsilziv", "mogferaiczvm", "nbhbs", "oaqaateaoo", "oerftdejxdhw", "othsuvlojzp", "pio", "rwvkord", "tkmv", "tpkhkttud", "tsckoieopqpn", "ufdscxrszqrq", "uhw", "uliuuogyck", "upsqqbdxuvhj", "uuany", "vdvv", "vqdn", "wejnuzs", "wsnv", "wvc", "xcjyzrzyv", "xlyrzszyyu", "ysvyu", "zisondyzicwm", "zpbup", "zrn", "zzbxuucyvfx" };
    int k = 10;
    assertEquals(29, likelyword.likely(dictionary, k));
  }

  @Test
  public void case68() {
    String[] dictionary = { "bb", "d", "f", "h", "j", "l", "n", "p", "r", "t", "v", "x", "z" };
    int k = 1;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case69() {
    String[] dictionary = { "mzzzzz", "naaaaaa" };
    int k = 6;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case70() {
    String[] dictionary = { "mzzzzzz", "naaaaa" };
    int k = 6;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case71() {
    String[] dictionary = { "aa", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case72() {
    String[] dictionary = { "aa", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case73() {
    String[] dictionary = { "a", "b", "c" };
    int k = 10;
    assertEquals(3, likelyword.likely(dictionary, k));
  }

  @Test
  public void case74() {
    String[] dictionary = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "yy" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case75() {
    String[] dictionary = { "az", "gx", "xz" };
    int k = 7;
    assertEquals(2, likelyword.likely(dictionary, k));
  }

  @Test
  public void case76() {
    String[] dictionary = { "aa", "mn", "zb" };
    int k = 2;
    assertEquals(2, likelyword.likely(dictionary, k));
  }

  @Test
  public void case77() {
    String[] dictionary = { "aa", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    int k = 1;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case78() {
    String[] dictionary = { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "cccccccccccccccccccccccccccccccccccccccccccccccccc", "dddddddddddddddddddddddddddddddddddddddddddddddddd", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "ffffffffffffffffffffffffffffffffffffffffffffffffff", "gggggggggggggggggggggggggggggggggggggggggggggggggg", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "llllllllllllllllllllllllllllllllllllllllllllllllll", "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "pppppppppppppppppppppppppppppppppppppppppppppppppp", "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq", "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", "ssssssssssssssssssssssssssssssssssssssssssssssssss", "tttttttttttttttttttttttttttttttttttttttttttttttttt", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv", "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy" };
    int k = 10;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case79() {
    String[] dictionary = { "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "cccccccccccccccccccccccccccccccccccccccccccccccccc", "dddddddddddddddddddddddddddddddddddddddddddddddddd", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "ffffffffffffffffffffffffffffffffffffffffffffffffff", "gggggggggggggggggggggggggggggggggggggggggggggggggg", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "llllllllllllllllllllllllllllllllllllllllllllllllll", "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "pppppppppppppppppppppppppppppppppppppppppppppppppp", "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq", "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", "ssssssssssssssssssssssssssssssssssssssssssssssssss", "tttttttttttttttttttttttttttttttttttttttttttttttttt", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv", "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" };
    int k = 10;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case80() {
    String[] dictionary = { "time", "zoology" };
    int k = 1;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case81() {
    String[] dictionary = { "egf", "fbraymk", "lnzrfjxcckd", "nertijdaoidcafeepfhjjggxkdbzcxpddsmtp", "pyhqpnhwrcovnqwgkvhydtyfbtjakowkqrjgvjfvqnbab", "q", "qwqlpgtsiviwcoowiap" };
    int k = 1;
    assertEquals(7, likelyword.likely(dictionary, k));
  }

  @Test
  public void case82() {
    String[] dictionary = { "a", "ma", "y" };
    int k = 1;
    assertEquals(1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case83() {
    String[] dictionary = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y" };
    int k = 1;
    assertEquals(25, likelyword.likely(dictionary, k));
  }

  @Test
  public void case84() {
    String[] dictionary = { "a", "ccc", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    int k = 1;
    assertEquals(1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case85() {
    String[] dictionary = { "b", "d", "m" };
    int k = 1;
    assertEquals(3, likelyword.likely(dictionary, k));
  }

  @Test
  public void case86() {
    String[] dictionary = { "aaaab", "maaab", "yaaac" };
    int k = 10;
    assertEquals(2, likelyword.likely(dictionary, k));
  }

  @Test
  public void case87() {
    String[] dictionary = { "a", "b", "c", "d", "e", "gg", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case88() {
    String[] dictionary = { "aaaaaaaaaa", "bbbbbbbbbb", "cccccccccc", "dddddddddd", "eeeeeeeeee", "ffffffffff", "gggggggggg", "hhhhhhhhhh", "iiiiiiiiii", "jjjjjjjjjj", "kkkkkkkkkk", "llllllllll", "mmmmmmmmmm", "nnnnnnnnnn", "oooooooooo", "pppppppppp", "qqqqqqqqqq", "rrrrrrrrrr", "ssssssssss", "tttttttttt", "uuuuuuuuuu", "vvvvvvvvvv", "wwwwwwwwww", "xxxxxxxxxx", "yyyyyyyyym", "zzzzzzzzzz" };
    int k = 10;
    assertEquals(25, likelyword.likely(dictionary, k));
  }

  @Test
  public void case89() {
    String[] dictionary = { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    int k = 1;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case90() {
    String[] dictionary = { "b" };
    int k = 1;
    assertEquals(1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case91() {
    String[] dictionary = { "a" };
    int k = 1;
    assertEquals(1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case92() {
    String[] dictionary = { "a", "r" };
    int k = 10;
    assertEquals(1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case93() {
    String[] dictionary = { "n" };
    int k = 1;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case94() {
    String[] dictionary = { "j", "s" };
    int k = 1;
    assertEquals(0, likelyword.likely(dictionary, k));
  }

  @Test
  public void case95() {
    String[] dictionary = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "xxxx", "yyyy", "z" };
    int k = 1;
    assertEquals(25, likelyword.likely(dictionary, k));
  }

  @Test
  public void case96() {
    String[] dictionary = { "a", "b", "c", "t", "tt", "zdf" };
    int k = 10;
    assertEquals(3, likelyword.likely(dictionary, k));
  }

  @Test
  public void case97() {
    String[] dictionary = { "acd", "aeg", "agi", "aik", "akl", "amo", "aoq", "asd", "axy" };
    int k = 3;
    assertEquals(9, likelyword.likely(dictionary, k));
  }

  @Test
  public void case98() {
    String[] dictionary = { "a", "c", "e", "z" };
    int k = 1;
    assertEquals(3, likelyword.likely(dictionary, k));
  }

  @Test
  public void case99() {
    String[] dictionary = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "y" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case100() {
    String[] dictionary = { "e", "p" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case101() {
    String[] dictionary = { "a", "c", "e", "g", "z" };
    int k = 1;
    assertEquals(4, likelyword.likely(dictionary, k));
  }

  @Test
  public void case102() {
    String[] dictionary = { "c", "e", "g", "i", "k", "m", "o", "q", "s", "u", "w", "y" };
    int k = 10;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case103() {
    String[] dictionary = { "aaaaaaaaaa", "zzzzzzzzzz" };
    int k = 10;
    assertEquals(1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case104() {
    String[] dictionary = { "aaaaaaaaaa", "eeeeeeeeee", "ffffffffff", "iiiiiiiiii", "qqqqqqqqqq", "yyyyyyeyyy", "zzzzzzzzzz" };
    int k = 10;
    assertEquals(4, likelyword.likely(dictionary, k));
  }

  @Test
  public void case105() {
    String[] dictionary = { "a", "n", "za" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case106() {
    String[] dictionary = { "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "dddddddddddddddddddddddddddddddddddddddddddddddddd" };
    int k = 1;
    assertEquals(2, likelyword.likely(dictionary, k));
  }

  @Test
  public void case107() {
    String[] dictionary = { "b", "d", "f", "h" };
    int k = 1;
    assertEquals(4, likelyword.likely(dictionary, k));
  }

  @Test
  public void case108() {
    String[] dictionary = { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "cccccccccccccccccccccccccccccccccccccccccccccccccc", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" };
    int k = 10;
    assertEquals(3, likelyword.likely(dictionary, k));
  }

  @Test
  public void case109() {
    String[] dictionary = { "a", "aa", "aaa", "aaaa", "b", "bb", "bbb", "bbbb", "c", "cc", "ccc", "cccc", "d", "dd", "ddd", "dddd", "e", "ee", "eee", "eeee", "f", "ff", "fff", "ffff", "g", "gg", "ggg", "gggg", "h", "hh", "hhh", "hhhh", "i", "ii", "iii", "iiii", "j", "jj", "jjj", "jjjj", "k", "kk", "kkk", "kkkk", "l", "ll", "lll", "llll", "zzzzzzzzzzz", "zzzzzzzzzzzzzzz" };
    int k = 10;
    assertEquals(48, likelyword.likely(dictionary, k));
  }

  @Test
  public void case110() {
    String[] dictionary = { "a", "f", "k", "p", "uz", "z" };
    int k = 1;
    assertEquals(4, likelyword.likely(dictionary, k));
  }

  @Test
  public void case111() {
    String[] dictionary = { "bz", "ea" };
    int k = 2;
    assertEquals(2, likelyword.likely(dictionary, k));
  }

  @Test
  public void case112() {
    String[] dictionary = { "n" };
    int k = 9;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case113() {
    String[] dictionary = { "ma" };
    int k = 1;
    assertEquals(-1, likelyword.likely(dictionary, k));
  }

  @Test
  public void case114() {
    String[] dictionary = { "aef", "blablauusda", "bzzza", "drauft", "klownderiiiratri", "ydfdsh", "zzzzzzzz" };
    int k = 8;
    assertEquals(5, likelyword.likely(dictionary, k));
  }

}
