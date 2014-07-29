package topc.test.sorting;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.sorting.*;

public class TwoWaysSortingTest {
    TwoWaysSorting twowayssorting = new TwoWaysSorting();

    @Test
    public void case1() {
        String[] stringList = { "a", "aa", "bbb" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case2() {
        String[] stringList = { "c", "bb", "aaa" };
        assertEquals("lengths", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case3() {
        String[] stringList = { "etdfgfh", "aio" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case4() {
        String[] stringList = { "z" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case5() {
        String[] stringList = { "aaa", "z" };
        assertEquals("lexicographically", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case6() {
        String[] stringList = { "abcdef", "bcdef", "cdef", "def", "ef", "f", "topcoder" };
        assertEquals("lexicographically", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case7() {
        String[] stringList = { "l", "ikuz", "rkarowluagylidigangqotntwhpolrvgw", "geudeuyjztapwekpdfnrgojgoibirtbemzychccopxsem", "zfdfowfrtylutqdkqoseernymcrrwnjppgxbrkbiesjqjhodno", "zfczbsippgcpfdigbztzedgbypefbypcutmtp", "zakoxt", "jourahqtczxatmcqaigbivigtw", "erxniziblcxysbarxkefywzrudid", "kligxogtotucgtxdfofl", "xpj", "fltikqahxqbyfpikaukayvgwedimcxhusfmfsznpxtvxlydfb", "kfiqmkwbqjuwipqcc", "ljkgsogcbitmkgmrkkogxj", "ifvudksrgjpy", "tqnksklnwazifcyrkfw", "mmhapopctvbtjdfszqfgtyvnylziutaeqxc", "chyklqgoljm", "zawuokqcuczggwnqmxhkgbiepnhrdxxhkbyi", "sqestyahzwgxdd", "bxbzsbzu", "swelcpomqjfrvbfojpgmbdzx", "lttkvcl", "vafyhulsaltibmscwmmmqohajwretdrdmpjacoqurv", "triuevrrdtvtortnhx", "nyxbuccsa", "exwbuzokeyimwmuhoibpooawsqfizpcqmbncotdb", "nsaanblewrciyluhprvcyqedjrplacaxawoctfc", "firuqpdmdzujrvpasliwhqogmlwmcrf", "bwryiwmicyzbappgbauvdcftdiutwnvddy", "xglfncezviqjhmakkqdhvvgxtcgxdjnrfhuatmextdwgedyi", "owbexmaajsfvhkhiarzaubh", "hbvjygbotkeofpasqobbaywtyfageksslasnwfsjm", "ezmzjaecpyitb", "fzrjjcjfig", "istnoxqdlwxkgwzbmdypwkxox", "ecenqcziyzquviffogfpajbsvkr", "oddohwgoevpkyglsonfmzfqgrnrxkygqamtrpoddloxouhl", "uwindmlalxytsxlissrwdklkopwzcf", "mifkavjirorfkepyjkoxmwaexgqgpeqcqsdaamdnvrrx", "pefvhfxxxjgqsrqsxlnllvwvajieenkwesewqrzzrsn", "lvibhpjhbdnfgjfdsftknfijqwnxb", "xiklwohgyahifbelchmsejwnklkxttgpxdxyes", "kpmvhtstgcgxjblqjgeqhbfqlpzpasbsbuasytevuruymw", "fgfmbuywkoczpna", "cjmtdwqzkrxbmuplkfrhn", "qhawn", "au", "pakovgzebahmopgi", "iuiqplzgfdwataqjxmkgyilswhmtoosx" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case8() {
        String[] stringList = { "eet", "yc", "o" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case9() {
        String[] stringList = { "aqwultybdduqitfg", "nzsgesmgp", "gjsoxixxremxjvzkmbdkczvmcolqawaqf", "jjqeazuxnxxzaeuaornvjgtsadnexqv", "y", "bd", "cyvsdznvhfxivjejmkhpxplfbamhrrtcwy", "yne", "knvdrydv", "vppfqpqdptrbjuzzxwuzo", "vdjcvmlxxlqwnfbjvqzgbtckck", "pieaxzgdwwzozp", "uhoaitjojhrre", "xziviyrezxfhvkzgvjbnrgdctidotj", "slkkgcphvgrpiauqqo", "eflbyuuatanmfyfbwzdioar", "pwbidultcprnbitnvyqzitcrkcnk", "ogptwd", "zofrzdiixspwdet", "lprhe", "vjcfwntkykruqqafayywzpfcqgsbqauq", "fgoyvzwbpllixxucmpzqnukzi", "xyessvgpznyufhwipbwmwhtipru", "jbbovkxecdq", "eugmlzocblejxcmuhyzsxsrqktieuslzaox", "ycivdfwjayvr", "yfvcfyg", "gwoi", "hkdcixncenljyioey", "nqkvrfgidsqbomuzwaa", "oyeeuivrfhawcrbuqlnyuechfnaotrrkrork", "pdpdsebycdfwqfzppspi", "pmgtorztsodjtqnczafqkzozjackk", "fdnkcukrbf", "kvxqsthfykupinzkhubmksvwcjnlepltnfmgh", "auamcvtbgjrnrybzfzdxpt", "xyxmovivlgyqgluqcjayovgcjyplpozohsyzga", "vqudqbmavydmojcokgctqfsw" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case10() {
        String[] stringList = { "cnsfeoqpdjwtpppbxdzxztxbmcwlbqdrhgavgevwrlqeefj", "ykqbwcerdkgcvjfqmldlcmazzrpmuwqvneujnjkzcdrchw", "fpldzyqekkomentwgmewsnxcvemqtzryomuocfvdbh", "tgm", "uu", "tkcalbnviehhbgsgnglwqnivcfdaxfhtaw", "ktlxraeotikbhzheyapmejzotemvvedfaqmybvycgxzp", "rhxpailipvmnztellsslqjqcwmrjotixzkkrrysbmim", "mmadimspszwawvthkjwmhmxnmmxgzxgpmnbj", "yreembdsgcmaytujldoondszkpanwhugajqjfxmpm", "fqmptpmlrwtwqfksd", "njuiof", "chcpvdagfepaiersiveiia", "flvcnrnfwls", "araozlhntsccbxcvllmthilee", "uaahjpnosjzlrfk", "ekwsenxbaedjksuuhrnwpljvbayrkibcqnruohm", "ngplagvbzspdwuptsc", "yzlhyvbuiljzh", "hikbwlqllimrxbjtatfdlbxqphojtan", "rauwkfsrjtgdepcgcij", "bnicxyrhyppgtvbwnpzyhdgifxusjslyxlzugl", "hywukbrkuzrapluzeayexpjfepdoasspemy", "uwnsabbqogkactkzvnvsxkwauchfzvojtluaieqwncnzjkjak", "cuumgvvcq", "uzsgeokpwcphxtidcbicriv", "oirqkucr", "lqztdphqokahfpwnrgufmpidfgkp", "ahznuwdobkobjvuuarvwfbkszrsupwtwy", "qsht", "hhzamudinmixnromuguowptoncluem", "pjnkewweuohizzvirrhlvddg", "rlszirzrwbcevkglwuiqqtfknpbdiaeffvqib", "sqsqggiugbhwqcutgxftebbofmjkvsqtndglbcnkzbacfatv", "klwthhzwjyms", "mdgpcuekicknvkdodsoujkspqhqjs", "qypyjjvzwfnbcgogxnfztyrhkbjwcnthwmiagninowydv", "owbqdyoktegohw", "hwdnfnwadj", "ilzgooemublhwmgnrvgnidhozqwqgivozqutwbmwjzfwjlcmos", "megliizlhvnudshzecrduvnrwix", "sdjuw", "bgoongfsvbcurzazobdfwdbysqphinxx", "biuvhwpiycmqijqmmwqu", "bwylwirtnxmiolnmlewnd", "wbnojinxxbnbmvfckytjcjtkwdiqhkjygbtqalmy", "fyqtyeohqlsmguwk", "e", "zpqpveplazcqskoipoghoplxvn", "fyozmeq" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case11() {
        String[] stringList = { "gtzuleanpforkhgzwjjlyzuoqcny", "pxcwicphyxqqhxbdlmbamgyfmberty", "xxfuvlzdguitmn", "zehdyuzrucwjzfempyprsqbotwrmvxlknd", "vmvsuebvv" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case12() {
        String[] stringList = { "afzmd", "aizgprtuchtxouwtqgzxnvmcaoitzpxqrcaltloukiygnmc", "akqkikdgnhduisqawpznqxpdlnfwslquxoptulfxlwuufinsdf", "bjltywdrgpjteyg", "cwewapumhggpsescaudk", "fzkexkpdvllsozehdqqkerhvlrc", "hsresaf", "nrgvhmfueoaqvxodwzibkcdpdnafhepeujbxoomxmrltozlkc", "sgoqtrfaehdncijxvoilpxvnkjoiiaxpclzlkmowrx", "wkwdjzagzyklffbhdqkbadssly" };
        assertEquals("lexicographically", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case13() {
        String[] stringList = { "abysxnbvfkwunyyhlxw", "axcwhthywjbdwfipxppiftz", "bcslvlwvscjxvotcychgkqbxgedequaimpniyykkblnf", "byiuyuqcmzhgyxnfygdlawofhmq", "cfhznzcbgjomtq", "dwzatynzbkhrtqwebavbyuwfzuoalbpjbiqpkmjmwvhwros", "ejpokryfbcwhhopypkgxqmxwllsfhryxywvt", "fhlucsdmuyvfxmeyeawufpdinvtaeayc", "gijiqtifeqgprrsljqsfeuxezi", "hxcbhjzudcqgnlwymr", "jpu", "jwezddcdmfiexfzvlvuqeyikrzszxmmykxjjzph", "kcaemhsoaryuclji", "lnxcnk", "mdfrpctoabvwxxnahntmwcejlzikxvjxuizcbjziuueap", "mkzrfmsrxcbbxmvirjtedgubgqvqfvkzxgvpre", "ohcjwhevzgozzrzzlsedhnnneeiyqapvolhxnpxciolvoideop", "pozitloo", "qhqfvoznowmhykaoiljyde", "qjlt", "qwoqwvyouwlhsnimg", "raodg", "rzyjbktroijgesnsymxneugihfkguhdiigircekydk", "sbtniiniplvdtiidgfppabaurfgtymshpcoxieyckbuxlp", "shikwzifx", "tdwdxauslyafheejutyfqbggr", "uhrhpcwmgpmxkjxspunfbjsdwssnhbx", "woobpulivwadzwyedhtvdbweksasabprgej", "xdpslsdwyrvpijyzovmswpbnqtzjkb", "ykmsueugxpwhiijbrejgzbiqrrzputxthf", "zbhmcusvvcxdzltmgxercxlidnvqrargmoeypvziqavylnigv", "znjtdubruuixa", "zqnasxlzbpcducakcineezdnavfwskjfxquhhyvt", "ztbxwnlnparoeuuourpljzcazsgqpkswhsrvr" };
        assertEquals("lexicographically", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case14() {
        String[] stringList = { "aammesir", "airnwiyjkfkvnvxymfjffpmkbeexkzhtrlzqcaouv", "ap", "asgadxjpyv", "axsbaqdkjyrexizoesdwmxffumiffvcpiuiv", "epw", "ftkdpkbhkzrntkvqmjfyfqplkmypbfxrmjpfv", "gbluusbajlqkcmstqpvrizhilgdowwgzxagjxwhuqigvygdauh", "gnxkzdchewayqgre", "iektaes", "ipjjtxujhakuagmtugmwfmqosfcjuxfsdcflli", "iqrhmdctmjw", "jiqjydgknrdghodpexgusxacw", "jqdjoukgchwgaybzhawfptomnidklddtruolnqnkkqr", "kljyrdwzzxrkdopzyvaisownorpomdsqnbpwlojnih", "lkhtkudnfwrjwmnpglmlx", "lqbuldidwjmcvztkhxvwepcmojekgbjgvfkmbtv", "mlryulbygxztogfztt", "mnkuqppiveqjx", "mqdpdmfbqbqdhkt", "niqfayznbkwxmqryjconiyeoiqarfyqwkuwvkikaicranf", "njlyqffmcacsms", "nynbxatjhoxjycjjxsabonxiiracnyvygsapkess", "oahwgixpdlteiwfmotaieoybveqhbwezxkpdbknuhcrssmlc", "ojinkxugfbqerkxvfgpwqv", "okdygdcvamlnieryslnctypqikeweywd", "oodbdjtrhgvnutffchnqjcus", "owuesbujabjlpzqwx", "pcarfnbqbdnlrxhnoicyedmlqvx", "pstio", "qweo", "rkmofiqsccqfvwpyirncomihjr", "ruvvthtueyiomqemcjuczhwqrdmfnrdbnnwjfnkuprcepijot", "svliibneqkbxhbmlbjluaesdmpvjbtetimisvnausxgds", "thofhbhmlptqyplytowxztwrefkussnbi", "vipemnlovpdezjzmvfu", "vqlpfhxtzvbbkdifcpnetjalmjzuanklifwclnmodijj", "wavygimsoyykcvsolvpthoxfsfofdzc", "xzbydqxfhloaksbypocz", "yearskdbcadzuxnjoncforhnewgouwjtsg", "ypjnhc", "yxwivsvnkyowhhhiuaooucknkooo", "z", "zeheffbuhyobtqtringlixzmnolec" };
        assertEquals("lexicographically", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case15() {
        String[] stringList = { "azfntrmdky", "bkpjrfrsgtkemurjccsrrpwqazxhbsshovcbfcgaxzsdzr", "bobkxnhml", "bsdbnreojthqdjgavuqwdepamolkotpsndddquulkkdigiqsc", "bstoizmdcyhfwqmbslailekjemciwiw", "btslshcnxsdmzlwozgtmjspjlqqptkiimlmchgapfxgdkxq", "cjjmavfcjycnzutszeqnsjapvdsjrtremn", "clcheruvtspakmevnssuypzjjnge", "clsqjevodtjodfdqnch", "cucvj", "dgzplmjxfumpqsgozxpqhcfkyesmombgkoghgxwhvc", "dwnhnryahrllifds", "ekjchdiccxaceknszxivoxockbffmrevqurmkxuspqdp", "feypukontovxzkhxrxedfaqagxqgykhnxhjvtryxrvwhr", "hanqdxoxxifgjenfwn", "he", "hefaiqajrldmiupupejqjittahrpecwhdkmiskoyqnn", "hrqauokfrhjxsribhonokbavgzpqnu", "igrbpzxslkighxlnprluyqorj", "lzhuuhyi", "nehe", "nqwbgegvxxiklzgleczrfnxqlbtrwbtihdmygecttzraosng", "othgnimdprix", "pbtdowm", "pjktrjwfsrdbnmvam", "psserecwuvauqchokvwtslfbtfspdwtkhbqjtqu", "pxofjrhlocmzpudhyrztxyqwipf", "rlioojunfwhodh", "ryprgiemtqminbvcizrdduprbkxnkrcrmyvecjkcbyzikmbsbe", "sddbqevkvwknede", "sptquhjitwogynpagadezywhgchznlcvgktnrz", "suyxsgoxxhsbg", "uealbumytrwboilwdmtrnojwgehlufossxrwxwwyt", "uyjezxcpnyshtqaejwmktienaljzbxfzp", "uzcyiiplfdkfucxonczspbaiufuogqjpvxirs", "vpekyscdrkdpzlbggabwsnuogvkzl", "vqovvlodzpgzzwloghxxixedbaqvirnutwv", "vrhngcnqivudxsnowhfcsy", "vtysdhsbdvzdklykgrfkhmnw", "wbsrexfyyplfcpxxrzlbx", "wjeeiv", "wtzilytrwfrozfzduxorolvqibymmjdarumx", "x", "ydujdlfrhhbutnbtlxpictrbzd", "ysbsvbfxdzaqzohylfyagyublorgexng", "zhqcqoifqqfsdzmhsntowhv", "zkoupjmckciarpkdgjcl", "zpaesbwmrbq", "zqt", "ztmsoylsvmcfhsfsxkruvbcadncudmxbgjfutacl" };
        assertEquals("lexicographically", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case16() {
        String[] stringList = { "aashzduvulbyfs", "bdwaqncukpjcuym", "cavofauuqhxdtkdwbheqnaieyteslucwaiecyeyh", "ctrj", "djztuuwexzwgweytulhzmdbkagxuxgtxgkbmhwwtzdxmwr", "educq", "eenyktohgmwzdtugjrawdjzkaco", "gbjmguob", "gpkaqomodcdrdgtgxhxkhvonqbbnberchdoned", "h", "hhszcdlzaajtgvvwmbivynyqixenlka", "hrizcoz", "hyjixnugqmdgkrbnuojktobabyduaa", "igljmykaek", "iitbxfxopzznualdwywymgyfysxmslwskfdosssaaxrz", "iulhtazamupnqkxllc", "iumymgbbmurertmhhgwqwrjvfuimkotdnx", "ixnafqaocjmlzsttuupeoitxxdbxyqnsjkgwhoc", "kydhkosudwkeuixyuhrjjerqrprzckjwkvpnrmlbcokqowuaku", "mcibrakvgpanofxcucwee", "mxieqrkznzgxzgjhjojekuaearbqwgwpnmpqkrdwmedppqbi", "mxpwbjfclbzqszpediayyapxyxmdxknow", "nkjctkghaikcvvmozjhxoylia", "nreqnrmfgvujppcpbdpj", "ntdawymqfguebfqjleaqhv", "nwxgrqffcltpsvmgyagevfecnzxsuabqyulwsexpdd", "ogcmdt", "oiyjbwcokwcfwksyyllvzbjvtzdyrdokrdkyzuocaaomzku", "pjxjqvfue", "qpzcevzdclgqsjzmhwtoafd", "qyxmgtzomgkiejcacphfugairvczmbgqxofyiillc", "rbrksecjgawgofvxypwhkrnl", "rmdaahpkwymktkhpaguvslwpgrppaonvevngkzoqfin", "rxy", "sfxjfkkvtlc", "snwwamuxdcstfhhtdnwjbvlvmpunukaumfrqk", "sqojrrjipevfjuqv", "unogeqpqvwohidevgujkpkssnjfpjosisgilksflrcnjd", "unuqyrklczhxevgsljpqnkohfggi", "urzjajrgjovpn", "vlsjxerazwdbbtgdcammesprndegr", "vnxxlxmqwzoxeyactshkgouimbijqgbkfrpgpoiqouxymzbdq", "wejerfwosrcfxksgoctvdrylgltcbynbamka", "wudpxchdqrfbibddq", "xrmviknmheffmwfokcrimgpmodtvogdpakz", "xwfkgfmwlyjoevvkrcb", "ymecrvjbkhywkactinznzeutphojafjk", "zmieidjtwevw", "zpsrhnhpvexaunbvtetkccjviu", "zy" };
        assertEquals("lexicographically", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case17() {
        String[] stringList = { "j", "gx", "fpx", "uksb", "qjcrv", "xvqpxao", "xcofxxkxqf", "yxdjgxlpwcee", "jomaebvzgjunk", "qfdyiuqtqplxsr", "tixsswiyxdcfwub", "lhevifpalxbneumah", "guisjvijxndhojiljj", "phzdgixuevzpgxdqnob", "tlbnirbrfyywinvydfnypv", "nfesyoqzpwftbdbecgmjzmh", "qqdbakeennvfudtxrbqevmei", "mglctxkpjvxtlrkvhgrxamkuk", "oxhjbnvbytdfqatwbbjttfivew", "ymjkmvukmhsxmnofslliahvyivn", "mrmqhwoakuxvxdkwmygrnjukjnof", "cucswzgccwiiakzscskszglpcziox", "xzhvtaclybntewsrsxmtihyeuhiwfn", "yqdxpmarhbkujsdihabmwcbacviswyx", "vaajxctomifiuavccnzkpalpmehyhluz", "oyylqmurbowjjoxgpbycddqhqaxeqwioi", "qdsttxkdkauodhyuecolrhudcktfxhmdeo", "gslosenxypuweeibwrimiojxlugahgcqfex", "cajopdvilnwhikyhqaqvigrsiovtyfztzvgptzs", "zocywnmozdvxowbuogzihzaowzspdjmbkrysqjbk", "ppjrriluiccuajlyjrrrlxlfrhzwqbrsluchhitmler", "ujocjyvqwljbslgbxuycuymhionixzgzbhbfhsiwiyfa", "bquumkhpdxdgjoratcnnoojkhzwtdrruzcpdvwzuqyeuj", "rxyngpcgbfcffjfxbzqpuwnzrxloaeinzwkfhttrxdnzpr", "enypnuzpgsntgswoxjfkdcimukwbjckrzjpnvqmtdrmamex", "xlxzoqlzzylkhanoworfdnebxtziryplssecmxvxyyayywro", "taycspqehkxbeoqfnnqnjzfgumozjvamavwxobrqbdehywnho", "njnkfgxserrcywqhkxeipjbecqqhsbzzprnlflwngcagdudmhj" };
        assertEquals("lengths", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case18() {
        String[] stringList = { "lyaj", "svoylrzhc", "sbyygbnzahjrz", "owtjzvjalqjnua", "wnzjdotdwyaecsxs", "drxczymadmiivkikzho", "vcanvwhvpydncyqtcmhpvpmx", "gjcqnsgmjhpuahtmselzjpmolcdd", "iynqhzvgkdqjfojrokrlmylsdmjxp", "omtbcgbseczuwrojzqbzihitlrdyyh", "pynddzryqtjgbxackkezufutzxdeldx", "iakothheytbzxnikmwfgwvsvrxciface", "dwruiffrhmigxqdqzwedjkhatngvsujfy", "glraaajjdjixlvhxgddbkyqjlmjwfakjjm", "tfyihufxwbxhgcddvhwswpjecwwmtukdgvw", "lftjjwmolrwevqmnadcsfnhcmrdiuhzyuybi", "twkccksiphkasdktekccuonjqtdnfpbaebesl", "dkvcehcipglitvtijujxztkrwbavjupbjllndj", "pvpgspiywyeunlhboprlnfzlmnscmptgtguuedl", "uvnlbpjffhplqqcwzxmppixejbyifbzqpwblpvuw", "xpqueaqayrutkbedbneojvgcotkgfkwcuunxhddbsx", "kjcjxdesranvgybgchkhziewpkfcqvaqtlmjnompmjx", "dtrzrhtyuuitadyrdtymlcuzpsvaorajbjcjcauiimpev", "mxrnzfaygmrpjbtxufrrovixncoflhckfsojpywwucpwnhd", "jxlcfpronoobwtcibwzqrzofxzpufpijihtcophyzocdcdzp", "gurlqcwlvcumojevqzmqvvpwzcvogtgxygpvcoaqolsaubtfdt" };
        assertEquals("lengths", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case19() {
        String[] stringList = { "y", "jg", "lnk", "lytc", "ykcjd", "fqhjff", "fmgmvwi", "jijnhnod", "gopncpscp", "yjvpdqyczd", "gevuldgobnj", "yrzaozaemhjk", "ibxnxxdgmrsrk", "hfpqriqvcmijjy", "rmevjbnxzdgecya", "yxfpuewajydvdbae", "egptslpmhkyfejfhu", "coxxghtimkrmtovquw", "euonmisuiiifispnqcm", "ageswhkuvmzcdqwfbuqi", "jsxdniiwcrowxklaoujup", "eslzvwgubeozbxbejldppl", "xigyafbpaqwzezcauaxrbzt", "nhzanwkccecyddztwpdsxkou", "oyhtixvkmljrrtoyvdgkwbbyb", "cnzzvrtexljnszjsqsujntldsu", "yukksundsppoawlmgvbpspohtyn", "svbzthxgjlcpwrhptuyjclijfzoi", "rpidxqaquyjlydstruxfisrgxbmct", "llehfmfabqddtimukhdkguknkomvnd", "jlzzgcjjsxtynsrbhmphqknicxbzvmp", "wlhhqiopwmkexvbueqqklwzzmdzcpzdc", "iimdlykzrrodpxeiwylpkiuajdlqvracv", "gupyohsbekmndgpqkkawpddlcopgwdubnd", "ricpmtypbemgcfpseeemqjsxampffinpapy", "amxhqehzvvaefoiubbbymtnajkrvsbrupkyp", "otxfnicqeqyqxfezvphmqbnbflnsoacibftei", "sshagdetkcketazeckfacqyecctctzhasfyhyw", "zbmrglzsqjobqqcylffoldgzbwizcqhxopassfk", "jkvsmjzhakqmjaaryzvjiohrflrzhtbokjpjmfhi", "ecfockyvqenmaakvfvoumragtgpwyrimhovstjkzk", "vqxkfuxqvdjcgzqwvidomnxtfsumrmyvcoohspexzf", "jlugmjksulndpcvuxvklolgueojfwdaloicbufoyslt", "iutqbnopmbrajpfaicjqdizoihwicqcxlucicthqabet", "owrafagliciirjvwwypdvkctdekxgcbyznaeuutegczgy", "nalydkohsiluedwvwclqdiiijqbosjnktlftgguuhdqkra", "jskyijyuidybivnuiaafotbxfuhokirreuujbfkbbfujwys", "bfwkqduhksrehwtqbplykpwfloivhzvpeaapnyypfxfovzsq", "xivaraklpzacrrwtaigsgniuasbbyfdhcoqbhwdfthskwtxci", "qczyxlvjlkmlxepywiwztznmkvyluhqjjojzwwypnkjqbdjplw" };
        assertEquals("lengths", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case20() {
        String[] stringList = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case21() {
        String[] stringList = { "z", "zz", "zzz", "zzzz", "zzzzz", "zzzzzz", "zzzzzzz", "zzzzzzzz", "zzzzzzzzz", "zzzzzzzzzz", "zzzzzzzzzzz", "zzzzzzzzzzzz", "zzzzzzzzzzzzz", "zzzzzzzzzzzzzz", "zzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case22() {
        String[] stringList = { "a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl", "abcdefghijklm", "abcdefghijklmn", "abcdefghijklmno", "abcdefghijklmnop", "abcdefghijklmnopq", "abcdefghijklmnopqr", "abcdefghijklmnopqrs", "abcdefghijklmnopqrst", "abcdefghijklmnopqrstu", "abcdefghijklmnopqrstuv", "abcdefghijklmnopqrstuvw", "abcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxy", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyzz", "abcdefghijklmnopqrstuvwxyzzz", "abcdefghijklmnopqrstuvwxyzzzz", "abcdefghijklmnopqrstuvwxyzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzzzzzzzzzzzz", "abcdefghijklmnopqrstuvwxyzzzzzzzzzzzzzzzzzzzzzzzzz" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case23() {
        String[] stringList = { "d", "de", "def", "defg", "defgh", "defghi", "defghij", "defghijk", "defghijkl", "defghijklm", "defghijklmn", "defghijklmno", "defghijklmnop", "defghijklmnopq", "defghijklmnopqr", "defghijklmnopqrs", "defghijklmnopqrstu", "defghijklmnopqrstuvw", "defghijklmnopqrstuvwx", "defghijklmnopqrstuvwxx", "defghijklmnopqrstuvwxxx", "defghijklmnopqrstuvwxxxx", "defghijklmnopqrstuvwxxxxx", "defghijklmnopqrstuvwxxxxxx", "defghijklmnopqrstuvwxxxxxxx", "defghijklmnopqrstuvwxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "defghijklmnopqrstuvwxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case24() {
        String[] stringList = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaabaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        assertEquals("lengths", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case25() {
        String[] stringList = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaaaa", "aaaaaaaa", "aaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case26() {
        String[] stringList = { "mx", "mxel", "mxelotoq", "mxelotoqqs", "mxelotoqqsudyy", "mxelotoqqsudyyivtx", "mxelotoqqsudyyivtxvcz", "mxelotoqqsudyyivtxvczylmlv", "mxelotoqqsudyyivtxvczylmlvuj", "mxelotoqqsudyyivtxvczylmlvujnhbdh", "mxelotoqqsudyyivtxvczylmlvujnhbdhbz", "mxelotoqqsudyyivtxvczylmlvujnhbdhbzx", "mxelotoqqsudyyivtxvczylmlvujnhbdhbzxkwqm", "mxelotoqqsudyyivtxvczylmlvujnhbdhbzxkwqmtz", "mxelotoqqsudyyivtxvczylmlvujnhbdhbzxkwqmtzhjxzl", "mxelotoqqsudyyivtxvczylmlvujnhbdhbzxkwqmtzhjxzljr", "mxelotoqqsudyyivtxvczylmlvujnhbdhbzxkwqmtzhjxzljrk" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case27() {
        String[] stringList = { "h", "hg", "hgc", "hgcs", "hgcsp", "hgcspn", "hgcspnq", "hgcspnqc", "hgcspnqco", "hgcspnqcom", "hgcspnqcomv", "hgcspnqcomvv", "hgcspnqcomvve", "hgcspnqcomvvef", "hgcspnqcomvvefn", "hgcspnqcomvvefng", "hgcspnqcomvvefngb", "hgcspnqcomvvefngbd", "hgcspnqcomvvefngbdk", "hgcspnqcomvvefngbdko", "hgcspnqcomvvefngbdkos", "hgcspnqcomvvefngbdkosc", "hgcspnqcomvvefngbdkoscq", "hgcspnqcomvvefngbdkoscqg", "hgcspnqcomvvefngbdkoscqgg", "hgcspnqcomvvefngbdkoscqggh", "hgcspnqcomvvefngbdkoscqgghj", "hgcspnqcomvvefngbdkoscqgghjo", "hgcspnqcomvvefngbdkoscqgghjow", "hgcspnqcomvvefngbdkoscqgghjowc", "hgcspnqcomvvefngbdkoscqgghjowcx", "hgcspnqcomvvefngbdkoscqgghjowcxf", "hgcspnqcomvvefngbdkoscqgghjowcxfe", "hgcspnqcomvvefngbdkoscqgghjowcxfem", "hgcspnqcomvvefngbdkoscqgghjowcxfems", "hgcspnqcomvvefngbdkoscqgghjowcxfemsh", "hgcspnqcomvvefngbdkoscqgghjowcxfemshx", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxn", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxnt", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxnty", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxntyi", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxntyiv", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxntyivd", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxntyivdn", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxntyivdna", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxntyivdnaj", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxntyivdnaju", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxntyivdnajux", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxntyivdnajuxo", "hgcspnqcomvvefngbdkoscqgghjowcxfemshxntyivdnajuxom" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case28() {
        String[] stringList = { "u", "vd", "wfj", "yhlw", "zjnyh", "zkoyjd", "zkozkdj", "zmozlflw", "zmqznglwz", "zmrznhmxzn", "zntzphnyzpl", "zptzrhnyzpla", "zrtzsiozzpmcd", "zrtzsjpzzqmcft", "zrtzslrzzsmchta", "zstzuntzzsoejuad", "zutzvouzztpglwbft", "zwtzxouzzvphlxbhtj", "zxtzzqvzzvphmzbjtkm", "zyuzzsxzzvrjmzcjtmmw", "zyvzzszzzwsknzclvnoyn", "zyxzzuzzzyskpzdlxpqzpc", "zyzzzuzzzytlrzelzrqzreu", "zyzzzwzzzzumtzgmztrzrgww", "zzzzzwzzzzwntzgozurzriyxf", "zzzzzwzzzzwntzipzvszsjzzfz", "zzzzzwzzzzxntzirzwsztkzzgzh", "zzzzzwzzzzxnuzjszytzvlzzgzjo", "zzzzzyzzzzyowzluzztzwnzzhzlox", "zzzzzzzzzzyqyzmwzzuzwozzjzlozl", "zzzzzzzzzzzsyzoxzzvzxqzzjzlozll", "zzzzzzzzzzztyzozzzxzzszzkznozlng", "zzzzzzzzzzzuyzozzzyzzuzzlzoozlohx", "zzzzzzzzzzzuyzpzzzyzzuzzlzoozmpixf", "zzzzzzzzzzzwyzqzzzyzzwzzmzpqzmrjzfr", "zzzzzzzzzzzyzzrzzzyzzwzznzprzorjzfrq", "zzzzzzzzzzzyzztzzzzzzwzzpzptzqskzfrrs", "zzzzzzzzzzzyzztzzzzzzyzzqzpvzsumzftstg", "zzzzzzzzzzzyzzvzzzzzzzzzqzqxztumzhvutip", "zzzzzzzzzzzyzzxzzzzzzzzzqzqxzuunzhwvukrz", "zzzzzzzzzzzyzzxzzzzzzzzzrzqyzwwpzixwwlszj", "zzzzzzzzzzzyzzyzzzzzzzzzrzsyzwyrzkzwyluzkf", "zzzzzzzzzzzyzzyzzzzzzzzzrzsyzwyrzkzwyluzkga", "zzzzzzzzzzzyzzyzzzzzzzzztzuyzyyszkzxynvzmibh", "zzzzzzzzzzzzzzyzzzzzzzzzuzvzzzyuzkzyynxzmibjp", "zzzzzzzzzzzzzzyzzzzzzzzzuzwzzzzwzkzyznxzmjbkpu", "zzzzzzzzzzzzzzzzzzzzzzzzvzyzzzzwzkzzznxzojblrua", "zzzzzzzzzzzzzzzzzzzzzzzzvzzzzzzyzlzzznyzpjclswbf", "zzzzzzzzzzzzzzzzzzzzzzzzxzzzzzzyzmzzzpyzpldlswdfs", "zzzzzzzzzzzzzzzzzzzzzzzzxzzzzzzzzmzzzqyzrnfmtwfhuk" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case29() {
        String[] stringList = { "g", "kp", "krh", "ksles", "mtmfslj", "nxogwpnz", "pysjzsqzy", "qyslzvszyct", "szspzwtzygtp", "wzsqzxuzykxsc", "zztrzzyzykyueoa", "zzwuzzyzymyxgpbid", "zzwyzzyzynyyjrblhhg", "zzwyzzyzyoyzkudljihdd", "zzxyzzyzyoyzkvflmkidhe", "zzxzzzzzyoyzmyilplieihii", "zzxzzzzzzryzpylprniemhijcv", "zzxzzzzzzryztypptnmfnkjjgxrr", "zzxzzzzzzrzzvyspvnmhpoknhzusa", "zzxzzzzzzvzzxzvsynpitqkphzvubw", "zzxzzzzzzwzzzzysynqlwqlrhzvueyio", "zzxzzzzzzwzzzzysypuoxuotlzyuizmst", "zzxzzzzzzwzzzzyuypxoyuqvozzxlzptxlq", "zzxzzzzzzwzzzzyxytysyxqwqzzzpzsxxluh", "zzxzzzzzzxzzzzyxyuyuyxuwqzzzszvxypwiil", "zzzzzzzzzxzzzzzyyyzxyxwytzzzszzxzrxjkljj", "zzzzzzzzzxzzzzzzyyzyyxzzwzzzszzzzvxlmnkjoj", "zzzzzzzzzxzzzzzzyyzyyxzzwzzztzzzzzzmqonmpnmn", "zzzzzzzzzzzzzzzzyyzyyyzzwzzzxzzzzzzouooornmrzf", "zzzzzzzzzzzzzzzzzzzzyzzzyzzzxzzzzzzsyqqqvoqrzjcc", "zzzzzzzzzzzzzzzzzzzzzzzzyzzzzzzzzzzszssqwpurzkfcvp" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case30() {
        String[] stringList = { "bt", "cugo", "dvgobi", "ewgpcjjt", "exgqckjuh", "exhqcljuhii", "fyircljuijia", "gyircmkvjjibtb", "gyircnlwjjjcubo", "gyjrcnlxjjkducom", "gykrdnlxjjkevdomni", "hzlrdomxkjkeweonniu", "hzlrepmxljlexfpnoiug", "hzlrfqmxljmfxgpopivgp", "izlsgrnxmknfygqpqjwhqq", "jzmthroynknfyhqqqkxhqqfr", "kzmthspznlofzhqrrkyirqgrre", "kznuispzolofzhqsrlyirrhssel", "lzovjspzomofziqtrmyirshstemk", "lzovjtqzomogzjrusmzjssisuenkc", "lzpvktqzpnohzjrutmzjtsituenlds", "mzqwltqzpopizjrvunzjutjuvfnmesg", "mzrwlurzqppizksvvozkvukvvfnmeshc", "nzrwluszrpqjzksvwozkwvkwvgomfshcyn", "nzswmuszsprjzktvwpzkxwlxwgongsidzozy", "oztxmvszspskzltvxqzlxwlxxgongsidzpzzy", "pzuxmwtzsqtlzluvyrzmxxmyygpogsidzqzzysd", "pzuymwuztqulzmuvzrznyxmzzgqohtjezrzzztewt", "pzvzmxuztqulzmuwzrznyxnzzhroitkezszzztfwuil", "pzwzmyvzurumzmvxzrznzynzzhsojtlfztzzzugwvjms", "qzwznywzvsunznvyzsznzzozzisoktmfzuzzzuhxwjnsu", "rzwznyxzwsuozovzztznzzpzzjspltmfzuzzzuhywjosvwj", "rzxznyyzwtupzpwzzuznzzqzzjtqlumfzuzzzuhzwjotwxkky", "rzxzozyzxtvpzpxzzvznzzrzzjtqmumgzvzzzuizwkptxxlkyx" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case31() {
        String[] stringList = { "f", "ft", "ftw", "guww", "guwwo", "hvwwoc", "hvwxoct", "iwxyoduv", "iwxyoduvx", "iwyzpevwyd", "ixyzqewwyef", "jxyzqfxwyffb", "jxzzqfywzggbl", "kxzzqfyxzghbls", "kxzzrgzxzgiblts", "kyzzrhzxzgibmtti", "lyzzrizxzgicnutjl", "lzzzsjzxzgidnvtklc", "mzzztkzxzgienwuklcq", "mzzztlzxzhifnxulmdqb", "mzzzulzxzhifnyvlmeqcx", "mzzzvmzxzhjgnyvmmfrdxf", "nzzzvmzxzikgnywnmfsexgy", "ozzzwnzyzikhozxnngtfyhyi", "pzzzwozyzikiozxnogugzhyix", "pzzzxpzyzjkiozynphvhzhzixm", "qzzzxqzyzjljpzzophvizizjymr", "rzzzxrzzzkljpzzopiwjzjzkymra", "szzzxrzzzkmkqzzopjxjzjzlymsbv", "tzzzyrzzzlnkqzzppjyjzkzmzntcvm", "tzzzyszzzmolrzzpqkzkzlzmzntcwnv", "tzzzzszzznpmszzpqlzkzlzmznudwnwq", "tzzzztzzznqntzzpqmzlzmznzouexowrj", "tzzzztzzzoqouzzprnzmzmznzovfxpwrkd", "uzzzztzzzorovzzqsnzmznznzowgxqxrkde", "uzzzztzzzosovzzrsnznznzozpxgxqxrleen", "vzzzzuzzzptpvzzrtoznznzozpygyrxsmeeol", "wzzzzvzzzptpvzzsupzoznzozpzhzsytmffpmn", "xzzzzvzzzpupvzzsupzpzozpzqzhzsytngfqnop", "yzzzzvzzzqvqvzztvqzpzpzpzrzhztytngfroopv", "yzzzzvzzzqwqwzztvrzqzpzqzszizuytnggsooqvn", "zzzzzwzzzqxqwzzuvrzqzpzqztzjzuztnggtporvnq", "zzzzzxzzzqxrxzzuvszrzpzrzuzkzvztnghuposvorp", "zzzzzyzzzqxryzzuvtzrzpzszuzlzvzuoghvqosvprpc", "zzzzzzzzzqxrzzzvwtzrzpzszvzmzvzvpgiwroswqrqcn", "zzzzzzzzzrxszzzwxtzrzpzszvznzvzwpgjwsoswrsrcoz", "zzzzzzzzzryszzzwytzrzqzszvzozwzwpgkwtotxrtscpzu", "zzzzzzzzzrzszzzwztzrzrztzvzpzwzxpgkxtpuysutdpzus", "zzzzzzzzzszszzzxzuzrzrztzvzpzwzyqhlyuquytutdpzvsg", "zzzzzzzzzsztzzzxzuzrzsztzvzqzxzzqimyurvzuutdqzwshu" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case32() {
        String[] stringList = { "wpviz", "wqvjzifcem", "wqvjzjgdenvd", "xrvkzkgeeoveb", "yswkzkgffovfcn", "ztwlzkhgfovgdnxnv", "ztwmzkihfovgdoxovkfkqh", "ztwmzkihgpvhdoypwlglqiqmrh", "ztwmzkihhpvhepzqwmgmqiqmrikr", "zuwnzkihipvhepzrxnhnqjqmrjksk", "zuxozlihjqvhfpzryoioqjqnskkskj", "zuxpzmiijqwifqzsypjorkqoskkslkdrgoz", "zuypzmjikrwjgqzszpjoskqotkltmldrhozhnlj", "zuypznkilrwkhrzszpjpskqotklunmdrhpzholjrcvb", "zvzpzolilrwliszszqkqtlqpuklvomdshqzipljsdvbdkewm" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case33() {
        String[] stringList = { "ez", "ezg", "ezgjf", "fzgjfzbty", "gzhkgzbtzufq", "hzhkgzbtzvfqdeaxx", "izilgzbtzvgrefayxo", "jzjmhzctzvgsegazyoh", "jzknizdtzvgsfhazyoialpj", "kzknjzdtzwgtfibzzpjalqknhx", "lzlnkzetzwhugjczzqkbmrknhyfug", "mzmolzetzxhvgkczzrkcnsknizfugjy", "mznolzetzyhwgkczzrldntknjzfuhkzzk", "mzopmzfuzzixhlczzrlentknjzfuilzzkf", "mzpqnzfvzzjximdzzrmfntlojzgvjmzzlgtx", "nzqqozgwzzjximezzsmgoulokzgwknzzlgtxb", "ozrqozhwzzjxjnfzztmhoulplzhwkozzmgtxciynjc", "pzrqpzixzzkxjnfzzunhovlpmziwkozznhtxdizokdru", "qzsrpzjyzzkxjogzzuohovmpmzixlozzoityejzokdsulo", "qzsrpzjyzzkxjogzzvoiovmqmzjxlozzoityfkzpkdsumoyb" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case34() {
        String[] stringList = { "d", "dama", "ebmay", "ebmbzve", "ebmczwfwm", "fcmdzwfwnpcj", "gdmezwgxoqcjrqi", "genfzwhxpqdksrjlx", "heofzwhxpqeksrjlybq", "iepgzwhxqqflssjmzbqa", "jfqgzwhyrrflstjmzbrbubn", "kgrgzxhyrsgmttknzcrcvcnv", "lgrgzxhzrsgmtukozdrdvdnwul", "mgrgzxhzstgmuvlozerewenwulltb", "ngsgzyizsthnuwmozeseweowvlmtcggi", "nhsgzzjzstinuwmozftfxfowvmnudggjx", "nhthzzkzsuinvwmpzgugygpxwmoveggkym", "nithzzlztvjovxmpzhuhzhqxxmpwehglzmops", "njuhzzmzuvkovynpziuizhqyxmpxfhhmznpptjd", "okvhzznzvwkowzoqziujzhrzxnqyfhhnzoqqujefa", "pkwizzozvxlpwzorzjujzhrzyorzghinzorqujegat", "plxjzzozwxlqxzoszjukzhrzzprzgiinzprrukfgaungw", "qmxkzzpzxxlqyzoszkukzirzzprzhijozqssulfhbvngwfyz" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case35() {
        String[] stringList = { "aaa", "z" };
        assertEquals("lexicographically", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case36() {
        String[] stringList = { "etdfgfh", "aio" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case37() {
        String[] stringList = { "a", "aa", "bbb" };
        assertEquals("both", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case38() {
        String[] stringList = { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "z" };
        assertEquals("lexicographically", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case39() {
        String[] stringList = { "doggggg", "apple" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case40() {
        String[] stringList = { "a", "bbb", "aa" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case41() {
        String[] stringList = { "aab", "aaaa" };
        assertEquals("lengths", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case42() {
        String[] stringList = { "c", "bb", "aaa" };
        assertEquals("lengths", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case43() {
        String[] stringList = { "aa", "aaaaaaa", "aaaaa" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case44() {
        String[] stringList = { "aa", "a", "bbb" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case45() {
        String[] stringList = { "abc", "ab" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case46() {
        String[] stringList = { "az", "a" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case47() {
        String[] stringList = { "a", "aaa", "aa" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case48() {
        String[] stringList = { "ab", "a" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case49() {
        String[] stringList = { "bb", "c", "aaa" };
        assertEquals("none", twowayssorting.sortingMethod(stringList));
    }

    @Test
    public void case50() {
        String[] stringList = { "abc", "az" };
        assertEquals("lexicographically", twowayssorting.sortingMethod(stringList));
    }

}
