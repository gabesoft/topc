package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class UndoHistoryTest {
  UndoHistory undohistory = new UndoHistory();

  @Test
  public void case1() {
    String[] lines = { "tomorrow", "topcoder" };
    assertEquals(18, undohistory.minPresses(lines));
  }

  @Test
  public void case2() {
    String[] lines = { "a", "b" };
    assertEquals(6, undohistory.minPresses(lines));
  }

  @Test
  public void case3() {
    String[] lines = { "a", "ab", "abac", "abacus" };
    assertEquals(10, undohistory.minPresses(lines));
  }

  @Test
  public void case4() {
    String[] lines = { "absolutely", "abs", "absolute" };
    assertEquals(17, undohistory.minPresses(lines));
  }

  @Test
  public void case5() {
    String[] lines = { "pyramid", "sphinx", "sphere", "python", "serpent" };
    assertEquals(39, undohistory.minPresses(lines));
  }

  @Test
  public void case6() {
    String[] lines = { "abcde", "a", "ab", "abc", "abcd", "abcde" };
    assertEquals(17, undohistory.minPresses(lines));
  }

  @Test
  public void case7() {
    String[] lines = { "abcde", "abcde", "abcde" };
    assertEquals(8, undohistory.minPresses(lines));
  }

  @Test
  public void case8() {
    String[] lines = { "b", "a", "b" };
    assertEquals(9, undohistory.minPresses(lines));
  }

  @Test
  public void case9() {
    String[] lines = { "aa", "b", "b", "bb", "aa", "b", "b", "a", "ba", "ab" };
    assertEquals(28, undohistory.minPresses(lines));
  }

  @Test
  public void case10() {
    String[] lines = { "ba", "a", "a", "b", "ba" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case11() {
    String[] lines = { "egkteiogxpqqmxgtdlpchrtkmqtgucxalmyq", "egkteiogxpqqxstfbeallwrgfupfrmhyjjuxeqtqemorh", "egkteiogxpqqmxgtdlpchrtkmqtguckrfrnrhptswluvagvp", "egnccpdjghseesmkfwblpcaciklso", "egkteiogxpqqxstfbeallwrgffqsqsephqqlwkvfbxhtxlqwib", "egkteiogxpqqxstfbekorxnjwrymymyjgszozfztgmw", "egkteiogxpqqxstfbeallweuuubtofhxlikyyfn", "egkteiogxpqqxstfbekorjzwcnjojqojkwifm", "iauj", "exfsqtdpljdaol", "uittzzupvpyyaqrdlctuco", "uittzzupsedimmfxsxfboh", "nmchxleddqcyr", "xczoukcuvollxvyabxovwwcebwfufnmimbwi" };
    assertEquals(339, undohistory.minPresses(lines));
  }

  @Test
  public void case12() {
    String[] lines = { "oymotipaytbqtlyxmeiufoel", "avdgjaceleuezlllxjpxxlugm", "zyzsydjiwiqhg", "quvlnbkqondhhivgxyjmlfvtonajknsyxh", "oymotbogeyvbnxiucikdwap", "quvlnbkqondhhivgxyjmlfbdcaezrbpafmatriuxgcxzftn", "pvbimvmeacititgpmobfsoncrvmwmqltkahzdhzwubjo" };
    assertEquals(202, undohistory.minPresses(lines));
  }

  @Test
  public void case13() {
    String[] lines = { "huuvkwmy", "zxfmdmlp", "cojpdiwcmelandfyrqcednfwjz", "huuvkwmzzvyqgmqnkyfcqnvztxxtyprizctmmfla", "cojpdiwcmelandfyrqcednfwjk", "cojpdiwcmelandfyrqcedylcmbnhxeghfw", "cojusgmamwxhwziazyt", "cojpdiwcmcsygbohfbsjqqddqvegydqogrtwh", "cojusgmamwxhwzfipgtjspicmfu", "kdnotdx", "drey", "drefvwsncemrubyrgac", "rnetiastdrguhyxgvaaksfhcqnlxgvfkpff", "drcizpjnjhsvnmjggrvvpcvumkfisxd", "cojpdiwsxvdhpttbfyprstswmwhsvbgbswaypsd", "qfdkyukavsmfojuhosdnvifjnxraypvcbjvhxqxstnhncvaoj", "kdnotdxakeyhfvqjazckhfffoldgaxpohzgqpdfyx", "cojusgmamuxrbeqnnoklygepngukpnjgbpfrlectplbyda", "kvepvcoisevsfgd", "kvepvcoisevsej", "umlmnpbrdwswojrbgwrxo", "cojpdiwsxvdhpttbfyprnlslswzoaoqsvwuqllsglfrm", "uxwuvceqlsostnysyxxmhczaexpuibwm", "cojusgmavkzuopjvfhwzlzbbolkjkvnpgfwtspnojhjvsskq", "kgawkplpx", "dreasiitpehenehig", "wtjimrtwraiojbuhjzeyeopb", "dreasiitpehenehvhehmlykca", "zxfmdmlpxnsyjfmikkhenxjrlgqdassnkufjqqsfxtq", "eoiiouukhsywg", "anxhnzwcfocqmidovioajwjbaeywbnxmnyicsukljkrw", "cojusgmavkzuopjvfhwzlzbbolkjtzjayr", "cojusgmamuxrbeqnnoklygepngofddobqqeyacclaeb", "opuvujmwquca", "gscpekcoxnmmtxvbv", "dreasiitpehenehicuewmiiiyzuysurkeuejiuxcvlwxatrr", "jgegnupqlmrfcqildersgqn", "vffzkx", "qfdkyukhnoqyabusnbqlyjdppchfjwatcsiunscg", "dsupikmgumclytawjgjnxktzjwdgtdwfxbrpib", "dreasiitpehenehvhebaaxhntaxifhxxbjzt" };
    assertEquals(991, undohistory.minPresses(lines));
  }

  @Test
  public void case14() {
    String[] lines = { "pmreerobcltzxolseyxtpxai", "nctuwdubvwtifhjbxkercwbwiplraoenkhlpsvlpywlr", "upgipwrmwzoekxnhyht", "lxplgcilptcmtsdey", "snzoplhvodxjdszysrgdtm", "snzoplhvodxuozjva", "snzoplhmqzwahshgsswiaquqonnnf", "mvg", "flqcdzljsj", "dcqjvgsbagbbttdukxnphdce", "flqcdzlyzreypamnhbfmrcvambcv", "gvmiwppgiqlxtocwvgyawpuysmshxrf", "flqcdzbbwfnsdqtasldmafpdnlwujjil", "gvmiwppgiqlxtocwvgyawpuysmsbhcmz", "nctuwdubvwtifmlfserbkxqaspbhg", "xueeuulhzzzpfbmeghoreswi", "upslatiwosnbbtsgeoihrminxfcvbdfcweznkiaedusrstcoj", "tdqfxcxuirxs", "flqxysczdnjiuewhmwoxcffjceacwqhgm", "aiiyooliknnqvbpboxbhtntyimf", "nctuwdubvwtifpmcvvuiygffpeblwhpswhkfjtdql", "axswsrv", "mvijcyntqybvngb", "nctuwdubvwtifmlfserbkxqastfkyzqgeqvqh", "lxplgcilptctcvgseoauoqaqwnmkpxau", "mozgegoaptinkqmzwpjujqcfgfsnygqvmlbsbkgbqdvllrnc", "upgipwkucjwqphyeynuogvssprqgobavwwgumuex" };
    assertEquals(670, undohistory.minPresses(lines));
  }

  @Test
  public void case15() {
    String[] lines = { "topvtojgagzdfdmmytannzmtjzvscjivog", "vmlchzfmbpjtmlfnchafffagkxghhjdiot", "ch", "jtrvu", "vmlchzfmbpjtmlfncwoxrkwk", "wjeqaqaxnkgrscqoecyjqhrmckjpxnnc", "kghjbcscnmetlgwqdctimktsptfrwnbj", "uuofdcsy", "i" };
    assertEquals(180, undohistory.minPresses(lines));
  }

  @Test
  public void case16() {
    String[] lines = { "qyhurldfdwcjvlxyqxblffvodpiqoscljyipwbbk", "swltq", "oxqjtesckgrhrotdnhjapuniqsafmaekrrtoqhjpygb", "xajaruacnaemxnoyz", "dpnvjzrchzlnnyoxcozufqypqpamckdnutkyuvbnyysf", "xajaruacnaehjhfxqiyxqfj", "smgjiocddukgszwpxtlhzxnvtagfiycblxmhzwuzi", "xzsyezkggzuqdrhvovzcvz", "xajaclrspfcxzvvcnwmzklkreualoahzgqfywhxejxy", "swwghvxxibnycegokhesdvncgbjetmtfggado", "swwghvxxibnycegokhesdvncgbjetmtfggatw", "dpnvjzrchzlnnyoxcozufqypqpamckoizgylxqeg", "rqhcirwpwugfolqaoejdpnnwdwpokxd", "hfxelxxlzxwurzxrj", "wiycknpglphhoy" };
    assertEquals(413, undohistory.minPresses(lines));
  }

  @Test
  public void case17() {
    String[] lines = { "sefrquguzioqwxei", "sefrquguzioqwxetmshoxkirhgf", "sefrquguzioqwwjcvkqzpdizxcmjprouexdyul", "sefrmfmirwxswsxi", "sefrmfmpqlpmo", "sefrmfmmnastpercxdlgoorlturkdxbl", "bvwsjzm", "vbeopqqcgepzu", "sefrmfmpqlrozweakswkbsmqrhekrqxfgmmjptfghtsdghw", "dwbqauehfho", "quffvhmfshjagb", "uttcemuoivvedsr", "sentngfxlbhcrlmqwzfusv", "hxnzacpkiwaaiux", "sebntxyjijckrnzhiigitf", "sefrqusauqksbtwnlciwhlluqxkdefmhoiznyhbvg", "sefrmfmpqlrovdnksbjswzfbaexyywtnwxexudfleeulwqihfh", "sefrmyqdjfbmj", "edhmoolwovjcskifnhhowqldfjheyxbpwrszo", "vkjnqfkati", "fov", "sebntxyjijckgmefvplbygjkommmxzgldecqadssew" };
    assertEquals(472, undohistory.minPresses(lines));
  }

  @Test
  public void case18() {
    String[] lines = { "uhmdbzqycga", "uhmdbzqycgpbhbqiiivccsdpocgednbpvwowmnfhk", "cetpzxlztveqbsiaohjotqaced", "lyifdyxxdzvhdyvpmoayjjquggrhluraclxddikxwkcroj", "dpnjhj", "cqjaeruvknvkjuakdxvgs", "vw", "dpnjvdn", "sghjcnsoidwdvo", "dpnjvxdaausbpxnkoklwhricwdkzkilta", "cqjaeruvknvkjszrtpkdzzcazrznheg", "uhmdbzqycgpbhpmhuhbylfxgwwwlymauwbkdtucjjcvlcova", "uhmdbzqycfhcafpt", "dpnjhjldxpqmbhedjyxyxaluhhgvkxfpanugazc" };
    assertEquals(320, undohistory.minPresses(lines));
  }

  @Test
  public void case19() {
    String[] lines = { "cxmzesapg", "feofdtewlwjqkkvpbqbpjwdthvdlirj", "edzwudfsftfhhnvylmolf", "ldctq", "doc", "bqxcoctodvwtjnygunpbodaydnlvsqtaz", "adly", "swbbnqbtafxdrylo", "vtxuicexzqnloasfcxxsyiwfoj", "edh", "xwuwvwmdunzo", "vzsampeeoaiietnbcnbjuo", "d", "vtxuicexzqnloahclrsnjvsz", "njgxqxpjudspnpd", "amotateqqrpszjtzoenlbcmbjruueocedounpbrghkxnic", "rfaklzdktrmbmhpxmeofocuyvtaliujnx", "swbbnqp", "zuqxnepwnio", "edzwudfsftfhkphdlevbycnvopcoklb", "angtlnpm", "mwfcaathvaqgqwzcbcpfcmsluizxyvgmvxtfiuzbfnu", "edzwudfsftfhkphdlevbycnvopcoklhilwsfscfijmvkgspe", "excrilpzqzdw", "bzeuqulpfsbdbmagivzhbotnnccs", "lqltuwhbdmfpdnihzazeiyp", "feofdtewlwjqkkvpkdsnzgjmgntncikvsfslqwxavjfoqpkj", "swbbnqbtafx", "edzwudfsftfhkphdlevbycnvopcoklhilwsfscfijmvkgspsdn", "bqxcoctodvwxgumlevibkuosogywdjhfuymwitz", "edzwudfsftfhkphdlevbycnvopcbuofvibgmthwvv", "excrilpzqzdwizqldygezxdzjofytydyuibbpmr" };
    assertEquals(642, undohistory.minPresses(lines));
  }

  @Test
  public void case20() {
    String[] lines = { "slxhpnstcytzuaauphqtiskdhftaveveckpysbehqiswrdwxt", "ssfmdnspggbfofrjzfsidcxhhltenqqseh", "rogqeiz", "jjiwcbfonlmyyokqrjlgxjisjvgvkr", "pzzsqzsvbwannhjbknjqrwzspkwfmszbabul", "qhicbxuudjzonsrnzsvyibrfnjxcnxhddbdldzftapau", "pzzsqzvizyevtybhvvujwzscduwgfaouttfidpkewmifxubql", "hnntucilkahxwnshszsmkdlurwcuwrtxe", "sdnxmffryvzch", "wmyrbsqcfbubfdvtdenzezcc", "aexvmvhftkpro", "mtdeuufdfhrgxtwya", "zargbpuiuwkhkuiefelioxntmequjfaeap", "bfflzcpoginiddwxcuxiakcytpouzea", "gfwnkmtugqvhrielgekjbipwwcixbuihjwywzdpjfnfcc", "gfwnkmtugqvhrielgekjbipwwiyogmzerfhd", "jiaujbsuhwurwyovkdvcutjpagoolwciske", "jjipiugopacasudxazjimzmlshewnuncobuemn", "rdfgjllqxcjxhxndoceufyqiptzubhyhttmwvu", "svrbcadwypzoznciqyghyhhcbjcpzveqpqwguaej", "jji", "pzzsqzvizyevtybhvvujwzscduwgfaouttfiinjotavee", "ilzwyefbhcnkjclguztlyoybioqupvdtytoemaeextea", "xltxccegacrdliaumbrzrpjcsyrcobqcvnmtgbzzhlgbfihlga", "syjqlzyrkhdtnahfjqu", "komhcqrhjhchynjywxuhkdkey", "ifhutimzgjuxeeulfstqqyesbrgpotyclzeslo", "komhcqrhjhh", "up", "zjaivghvlpz", "pzzsqzvizyevtybhvvujwzscduwgfaur", "bfflzcpoginiddwxcuxiakcytpouzogtmvry", "opdxmsgmxghyjxb", "pczlestfic", "tawvqqhjynzyqtunoybd", "rdueqennroumkoffbzuvtsgkw", "ssfmdnspggbfofrjmntzreq", "hnntucilkahxwnshszsmekgwwisism", "zjegyymjdkmkreiau", "evgjpxrxmpypkzbmckvwhbugwumwxxagovcjgzipvkxfbjy", "hjiwrsxzmubdfrjyswkbwdwgvea" };
    assertEquals(1105, undohistory.minPresses(lines));
  }

  @Test
  public void case21() {
    String[] lines = { "m", "mfqby" };
    assertEquals(7, undohistory.minPresses(lines));
  }

  @Test
  public void case22() {
    String[] lines = { "kd", "kdmsl", "kzz", "b", "khphx" };
    assertEquals(23, undohistory.minPresses(lines));
  }

  @Test
  public void case23() {
    String[] lines = { "k", "kvcy", "imbbs", "kqc", "kqc" };
    assertEquals(20, undohistory.minPresses(lines));
  }

  @Test
  public void case24() {
    String[] lines = { "e", "tm" };
    assertEquals(7, undohistory.minPresses(lines));
  }

  @Test
  public void case25() {
    String[] lines = { "jvx", "d", "jmbad" };
    assertEquals(15, undohistory.minPresses(lines));
  }

  @Test
  public void case26() {
    String[] lines = { "z", "qv", "qubie", "qvlk", "dq" };
    assertEquals(24, undohistory.minPresses(lines));
  }

  @Test
  public void case27() {
    String[] lines = { "eirop", "eiro", "m" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case28() {
    String[] lines = { "k", "kiyns" };
    assertEquals(7, undohistory.minPresses(lines));
  }

  @Test
  public void case29() {
    String[] lines = { "qn", "qn", "qn" };
    assertEquals(5, undohistory.minPresses(lines));
  }

  @Test
  public void case30() {
    String[] lines = { "em", "n" };
    assertEquals(7, undohistory.minPresses(lines));
  }

  @Test
  public void case31() {
    String[] lines = { "wyzvwvwyxwvwyvzwzzxwzwvywxxwvyzz", "wyzvwvwyxwvwyvzwzzxwzwvywxxwvyzyvvzwxvzx", "wyzvwvwyxwvwyvzwzzxwzwvywxxwvyzyvvywyxywvxvvw", "wyzvwvwyxwvwyvzwzzxwzwvywxxwvyzyvvywyyvwyxzvywyyv", "wyzvwvwyxwvwyvzwzzxwzvywyvzwxwwzyvywzyvzzwyywxy" };
    assertEquals(103, undohistory.minPresses(lines));
  }

  @Test
  public void case32() {
    String[] lines = { "zvyxwxyzywvxyywwvxwvxzyxxyyvzxwwwyvwzwz", "zzwxxzzxxwyvvvwzxzvzxwwzyxxvyv", "zvyxwxyzyvyzvwvzx", "xzvzwzvwyvyyvyvyzyyzvzywxvvywxxzzvv", "xwyzwywzyywzxvyxvwzyyvwvyyywzvvxvxx" };
    assertEquals(158, undohistory.minPresses(lines));
  }

  @Test
  public void case33() {
    String[] lines = { "ywyvwwwvvxyyzyyvxzxxyyvwyxwzwwwzyyyyyyz", "wzxxzwwwyxvxyyyyzyzwzywzyxxvvzw", "ywyvwwwvvxyyzyyvxzxxyyvwyxwzwwwzyyyyyyvzxwv", "ywyvwwwvvxyyzyyvxzxxyyvwyxwzwwwzyyyxzxzxywx" };
    assertEquals(93, undohistory.minPresses(lines));
  }

  @Test
  public void case34() {
    String[] lines = { "zzzvzwzzzwxzvyzwvywzzxywyvyxvyxzxx", "zzzvzwzzzwxzvyzwvywzzxywyvyxvyxzywzwzyyzw", "yzvwxzxwyzwyzyxvyyvxwwyxywxyvyzzvzywywwwzwxyv", "xvyvvzvzzwyyzwzxzywwzvwwxyvzwwx", "wyywyyzxzwyvzyvvvxwxvzvwvz" };
    assertEquals(158, undohistory.minPresses(lines));
  }

  @Test
  public void case35() {
    String[] lines = { "yvxvzwzzzwvvywvxvvvwyzwvyyzwwyvxxvyvwwyxzyyzvyyvz", "ywvyvvzzzwyzzvzzvyzzxywxvxvwvwxwxvvxw", "yvxvzwzzzwvvywvxvvvwyzwvyyzwwyvxxvyvwvvzxzvxvzv" };
    assertEquals(102, undohistory.minPresses(lines));
  }

  @Test
  public void case36() {
    String[] lines = { "xvxwxxxvxyzvvxwwzyxzwxvvxwyvwywvxzzzzy", "xvxwxxxvxyzvvxwwzyxzwxvvvxxvwvxzzx" };
    assertEquals(52, undohistory.minPresses(lines));
  }

  @Test
  public void case37() {
    String[] lines = { "wyzyzxvxzyyxwzyxxvzyxzwvzyyyywxyywzxwzxvxz", "wyzyzxvxzyyxwzyxwwyzyxwzvzvzwzzyxvwywxyw", "wyzyzxvxzyyxwzyxwvxyyyzwvzwxxxwwyzzxzwywyvwzzwy" };
    assertEquals(103, undohistory.minPresses(lines));
  }

  @Test
  public void case38() {
    String[] lines = { "xywxxzvwwvxywzyyxzxyvyzyzvyvzvvvvx" };
    assertEquals(35, undohistory.minPresses(lines));
  }

  @Test
  public void case39() {
    String[] lines = { "vxvywwywyvvyzzvvwzzwvxyvxvw", "yxyxxvzvxywzyvywzyxwyyvvwvzxxxzzzwwxvy" };
    assertEquals(69, undohistory.minPresses(lines));
  }

  @Test
  public void case40() {
    String[] lines = { "yxyzvvxxyvvxwxzzzwywzzyvyxxyyzxwxyxwwzvvyxyw", "yxyzvvxxyvvxwxzzzwywzzyvyxxyywxvy", "vyyxvyyyzxywyxywzzvwyyyyvxwzwzvwwxxzywvzzzvxzvzvx", "xxzxvxxzzzvvvyvwzxwwxxyvwvvzzzxzwxvzwvzvzzvzwww" };
    assertEquals(154, undohistory.minPresses(lines));
  }

  @Test
  public void case41() {
    String[] lines = { "bbbbbbb", "bbbb", "abbbbaa", "abab", "aaa" };
    assertEquals(31, undohistory.minPresses(lines));
  }

  @Test
  public void case42() {
    String[] lines = { "abaaaba", "baaabaa", "baaabaa", "baabaaa", "bbbbbaa" };
    assertEquals(35, undohistory.minPresses(lines));
  }

  @Test
  public void case43() {
    String[] lines = { "abbbabb", "abbaaaa", "abbaaa", "aabbbbb", "abbaaa" };
    assertEquals(30, undohistory.minPresses(lines));
  }

  @Test
  public void case44() {
    String[] lines = { "baabaab", "aabaaaa", "babbaaa", "bbbabaa", "baaaaa" };
    assertEquals(41, undohistory.minPresses(lines));
  }

  @Test
  public void case45() {
    String[] lines = { "bbbbabb", "baaaabb", "abababa", "aaa", "bbababa" };
    assertEquals(40, undohistory.minPresses(lines));
  }

  @Test
  public void case46() {
    String[] lines = { "baaaabb", "ababbaa", "abaaaaa", "aaababa", "bbabaab" };
    assertEquals(43, undohistory.minPresses(lines));
  }

  @Test
  public void case47() {
    String[] lines = { "baabaaa", "baabaa", "baabaa", "abbabbb", "bbabbbb" };
    assertEquals(31, undohistory.minPresses(lines));
  }

  @Test
  public void case48() {
    String[] lines = { "abababa", "abababa", "babbbaa", "ababbb", "bbbbbab" };
    assertEquals(33, undohistory.minPresses(lines));
  }

  @Test
  public void case49() {
    String[] lines = { "bbbabaa", "ababbba", "abbb", "abbb", "abbbbb" };
    assertEquals(27, undohistory.minPresses(lines));
  }

  @Test
  public void case50() {
    String[] lines = { "aaaaaaa", "abbabab", "aaa", "baabbba", "bbbbabb" };
    assertEquals(39, undohistory.minPresses(lines));
  }

  @Test
  public void case51() {
    String[] lines = { "qspttptqtrqttqqprprqtrrpttrsspprssqtptrqrrtrsqtr", "qspttptqtrqttqqprprqtrrpttrsspprssqtptrqrrtrsqtqp", "qspttptqtrqttqqprpptssqrrpsq", "qspttptqtrqttqqprprqrttq", "qspttptqtrqttqqprprqtrrpttrsspprssqtppssqrr", "qspttptqtrqttqqprptsttrqsstrtspqpprtprrrstrpqtr", "qprsssqprrrstpqpstsprprtspqrpspqqttqrtqstssqpttsqs", "qspttptqtrqttqqpsssppptt", "qrtttsrpqrtssrqsrrsrpqpttqssqpsqrtprtrrpsrtrsrstrr", "qspttptqtrqttqqprptsttrqsstrtspqpprrq", "qspttptqtrqttqqprprqtrrpttrsspprssqtptrrrsrsrtrrsp", "rqqtpssqprtpqqqqqpppqqrrssttpptsqqqrprqtsqsrsqqp", "qpsptprqrrqtsspqqrpqtsrsrsttqtrqrqsqqsqttqqsptqt", "qspttptqtrqttrtsqprttrtqstssttstrsspprrrpttr", "pprtstppppsrrpqqtqrppsrpprsptrstqpsrqqsrsqqtrptr", "rqqrtrrprtqqrqqrpttrpqrtqqrqptrrprppptststpsspqt", "qpptpt", "qrtttsrpqrtssrqsrrsrpqpttqssqpsqrtprtrrpsrtrqtrp", "sttqsrprqtqqpprrpqqrtrqpprqrqprtqsqssrsqtrptpsppqp", "qspttptqtrqttqqprptpqqqqsstsspspqq", "pqrqprpqqrppsrsrsqttttqqqrrrssppqsttqtttsprprqtp", "qtpqqqrtrprppqrprqqqqttspttrqqrrstspstqprpstttttpp", "rqqrtrprtpqpqpprrsqqprtttqrtttppsqrrspsrptp", "ssprpqsrtrtqpptqssqptpspprrrrrrspsqsqqtrqprrpqrsss", "qspttptqtrqttqqprprqtrrpttrsspprssqtqqqqstqsqsprp", "rqqrtrprtpqpqpprrsqqprtttqrtttppsqrrssp", "qspttptqtrqttqqttrst", "qspttptsqtqqspsrrsprstqpssptprrqrt", "pqpsptqptrrtttpqptttpqprsqrsstsrprtprptppsqrptqps", "tsssrttttsrssqpqrrrrrrqrtrrpqqqrpqrrttpqpsrtrrst", "pprtstppppsrrpqqtqrppsrttrrrpststsrp", "qtpqqqrtrprppqrprqqqqrrstqsqrsssrrsrtttrq", "pprtstppppsrrpqqtqrppsrpprsptrstqpsrqqsrsqqtrptrq", "qspttptqtrqttqqprptsttrprppps", "tsqrsqtttppssstprqqsqppstpttpprrqspprsqpttprqqqt", "rqqrtrrprtpps", "qqtrtsrrqrpsqttttprsqtspqrpsqtpqrsprqrqssrqtqrrs", "tpptrpprrrpstsrrrtpqrsqsrtrrtrsrttqppsrrttrtqrqtr", "rsqtssqqsttttrprrpqpspqpqqrrtstsqstrpprpssstrtsq", "tttqpsrtrrqtptprqqsptrqqttrprqqsrqqsprpqqrrpsrpsrr", "sppqttstsrqstttqprptqpsqpptsppsprttqtssstppprrrstq", "stqqqqrsqsttrprpttpsttrssqqsqrppssrttttqrstsqpttt", "rprrtrpssrprrsptqsppqstptpqrtstpssqtsrtrpqpspsprpr", "qspttptqtrqttqqprprqtrrpttrssppsrrpqpsts", "qspttptqtrqtsrtpsstsssqqpsrpp", "rqppsrpqrtprqpppsrsttqrptppsptsrspqsqptpsrsssrptqp", "qspttptqtrqtsrtpssttrrpsqsrsrrsrsptptpqqq", "qppqtrpqqqprsttttsqrqsqtpstpqrsss", "tqqqssrrqspsssqrqrptqrsqsqsprppqpqrqqtrqpqstrrqqq" };
    assertEquals(1577, undohistory.minPresses(lines));
  }

  @Test
  public void case52() {
    String[] lines = { "sqqsqrttpptssrsptrsrsspssppqtspttrqstpstrqprsttrt", "sqqsqrttpptssrsptrstrpr", "sqprqpqsprsspqsrrrsrqqpqt", "sqqsqrttpptssrsptrstrptrrsstptts", "qqstpsssrpqtpqtsppqqqtprrrtpsqtpqspptrrsrsrtrqsqsr", "sqqsqrttpptssrsptrsrsspsspptptqsqsrpsspqsttrp", "qprqqttqpsrtqprrsrqrqqtspqttssqqqqsrttpqssstpsrtqr", "rqrrqsqqstsqrqtsqrrqpqqsptrptrtsspqqttttspqptprp", "rpprttsqrsqptrtpqpptrqtqqspspptpqrtpqtpsqstsppqsrq", "sqqsqrttpptssrstprsssprtrstsqrqrstqqssqspptqr", "ssqsrrpqqttpqppsqtstrrqsttqqrqrsprtsspsqpsttttrs", "sqqsqrttpptssrstprsssprtrstsqrqrstqqssqqqrsppsqq", "pstpprpsqqppqsspsprrqspqsqrrqqtpqpptrsspptpppssp", "sqqsqrttpptssrstprsssprqtprpqqtrsrqtssprttqtprpsrt", "ppstqrtqsrtrqtrpttssrstssrqrrqrrqsqtrqstqtrstrqsp", "sqqsqrttp", "rqrqrqpqpstrqrrprqqqpptsrpqsrrsrpprtrtppqsttprtp", "ssqtqsptsrqrrtpqprsptqrppqsqqsrtrprptspspsqrrpppps", "sqqrsqprsssqttttqs", "sqqsqrttpptssrstprsssprtrstsqrqprsssss", "sqprqqrsrsqrtqprrqqqttqpsppspssqrqprstrrqrqs", "sqqppsrrpsqrpqsqppqqqptppq", "ttqqsqrpstqqsqsqrtptqtqptprrtrrtppspqstqrtrqqrtsr", "sqrqrpqqsptqrqqqtqqtqtssqqqtsrstqrsqrrptsqtprtpspr", "sqqsqrqrtqsrrqqsrtsstptssqqqpprstt", "sqqsqrttpptssrsptrsrsspsspptptqsqsrpstprssqsttqpqr", "qpqsrsrtsttrpsqttpqstpsqqpspsqrtqttpptttspqsptps", "qqstpsssrpqtpqtsppqqqtprrrtpsqtpqspptrrsrsrtrqsqs", "qprqqttqpsrtqprrsrqrqqtspqttssqqqqsrttp", "sqprqpqsprsspqpqqtqstrtttpsttttqqtrssqspqppq", "sqprqqrsrsqrtqprrqqs", "sqrppttsrqprsqqrsttrtqrqpqsqprsqtr", "sqqsqrttpptssrstprsssprtrstssqt", "ttqqsqrpstqqsqsqrptpppstpqqssrtqsrttqtqt", "ptqqrqpsptrpsrtrttppptprtrsqrttsssssrqtpqtrspsqstq", "sqrqrpqqsptqrqqqtqqtqqpspstttrssqrqqpqrqqprqqpr", "pstpprpsqqpsqrqsqrqtst", "srstsqqtqrpqqppppptqsrqqptttsqsssssrtstppssrsprqt", "sqqqtpqprqsqrpqprrqtrrrtsqrtqrsrst", "rpprrqpr", "sqprqqrsrsqrtqprrqqqttqpsppspssqrqprstrrqrtt", "ttptsssrssrqsqpqtpspstqpprsrtqpprpsstrtptqtsqtrts", "sqqsqrqrtqsrrqqsrtsstptssqqqpprsst", "rtprprtpsttqtrqqttrpppsqqpqprrrrqqqqsqtpststpqrt", "ttptsssrssrqsqpqtpspstqpprsrtqpprpsstrqrtrt", "sqqqtpqprqsqrpqprrqtrrrttqrsprpttrqsqp", "ssqppsqstqsrqrsrppptrssqrqqtstqpptprrsprqqpqstqrt", "ttptsssrssrqsqpqtpspsprppstpsssptpttrr", "spqrtqrrsttssprsrqqptprspqqtttpqqsrqssqqrtqssprqrt" };
    assertEquals(1500, undohistory.minPresses(lines));
  }

  @Test
  public void case53() {
    String[] lines = { "trrpprqtstpsssqqtprtqtppqtqptttstptstrqtrpptpppptr", "trrpprqtstpsssqqtprtqtppqtqptttstptstrqtqrtssrspq", "trrpprqtstrtpptpsqttrpspqps", "pqsqqsppssrqttpqtsprrptrsprqqstppptqrrrppppqtrqpts", "tqpsqprsqsppsrttpptsqtsptqsttttqpprrrrtrrpqrsspspq", "spsptrrrprrrtsrtsrsqtssrtppqqrprtrrstpttpsqqsstrr", "tqpsqprsqsppsrttpptsqtsptqsttttqtpssprppssrtppr", "tqpsqprsqsppsrttpptsqtsptqsttttqqpspqptttrqttqtt", "ptsptpqpprppqtstssqrrrtstspqrqssqptpssqsrqqstqqrtr", "rpqsstpsssqspptspqrqsssqssqprtsrqtqtsrrqqstqsttpr", "rrqtqprpsrqtqqrtsqpptstqtsttprqtppqssqrpqppqpqqtsr", "rrstptsttptrspqqsttpqqsstqsqsqrtptspqstrqqtprqtqp", "rrstptsttptrtttpqqtqqstsrpsqpprqsrtsqqttr", "qqssssppsrrtpqrprpsqqqppttqqtqrqqqpsqrsqtqrqqtqtrr", "pqsqqsppssrqttpqtsprrpttrtpqrprqrtrsppsqttsst", "qqssssppsrrtrttpst", "pqqrqqqtpqtrrsppprprrtrtpqtrstrtpptsrpptqssqttrqq", "trrpprqtstrr", "pqsqqsppssrqttpqtsprrpttrtpqrprqtttqpppqprtp", "qttqsqpspsstrrsrtstsqqsrstqssptqstqsrtrpqppssrqtrs", "rrstptsttptrspqqsttpqqssqqtt", "tqpsqprsqsppsrttpptsqtsptqsttp", "trpqptrrssspssprsqqtttpstrppppsqprtttrspsprqsrtrst", "tqpsqprsqsppsrttp", "sppsqsppqrtqstpsqpqpqssprtrqrqttpqqtrqtprqttqsqrr", "trrpprrtrtqpprt", "ttpprrtssqtsqqtrqttpppqrrrttsqqqqrqqssssppqttrrp", "qprtptsspppptpstrrqqsssrsrqrtqttqsqpttsrqpqqtrtrpr", "rrstptsttptrtttpqqtqqstsrpsqrppqsrqprsprpstpsrsr", "tqpsqprsqsppsrttpqtppsrpqrrrs", "pqrpprsptprqrsptptsqsqqtqrprtssqprpspsptrrprqqpss", "pspprrtrsppsqrqqptrttpqptprprtspqrqtpsppsppsrtqr", "tqpsqprsqsppsrttpptsqtsptqsttttqpprrpq", "rqpqqsqqqsqrsrstrsssqqpqqqptpqtqspsprtptpsqpqsqt", "pqsqqsppssrqttpqtst", "qqssssppsrrtpqrprpsqqqppttqqtqrqqqpsqrsqtqrqqtqtrr", "qprtptsspppptpstrrqqsppqqptpprtsssrp", "qrpssppppsrrsprrrrppqqsqtpttsprtptttrppqspqptrptst", "prrqtspqstprsqrprppqrrpqtsqqqpqstpqrsrqrrqqqsttppt", "qqrrprstsqstsqsrtrqrqrrtrtrrpqptrppssstqssstrtqp", "spsptrrrprrrtsrtsrsqtssrtppqqrprtrrstptrr", "qpqrqsttrstpsrppprrrqssprqrqsqspprrrrstttspsppqs", "rpssqsppstrqqtrqtqqtqrqqpqrqrsrtssqsqpsqqrqsqrprqt", "tqpsqprsqsppsrttpptsqtsptqsttttqpprrpptrqqp", "qtttpprpqrqqrsqsqprssqssptrpptstrqstssprtrprpqprsq", "trrpprqtstrtpptpsqtssstprrqr", "rpqsstpsssqspptspqrqsssqssqprttrr", "psppr", "rrstptsttptrs", "qqptsrpqtpqssrsqqsssrsrstprspsrpprtpttqrprqqspqprt" };
    assertEquals(1562, undohistory.minPresses(lines));
  }

  @Test
  public void case54() {
    String[] lines = { "sqtsqrrssqttstqstpttqrtttpqqqqqrqqprtpprpsptqtsrsr", "rsrtstpssqststrpptrqrrrpsqspprrttttpqsqspssqqprq", "rsrqrpqttstqqtprsqpr", "srqsspqtrsqtrqqttqsrtptqtprssqrqtstpsrptsqptttprrp", "srqsspqtrsqtrqqttqsrtptqtprssqqrpqqtsrprsstrr", "ppsqrtsrtqsqsrssqtqttrpqtsrtqqtttssqrpptsprprtqqp", "sqtsqrrssqttstqstpttqrtttpqqqqqrqqprtpprpspt", "ptsqpqtppqprrtpsqrtppqpppqqptttprprtpqpspqtprsts", "ptsqpqtppqprrtpsqrtppqpprrpptqprprpprtss", "rpqptsrqsspqtsrs", "qrtqspstqqqqqqsppqpssstrqpqsttqqsspppqrtsqttpsrsq", "rtsrprtqprqprqsrttsssqstrpsqrtrstqpqqrsssqsttprqpp", "qrtqsqstrtrttqrpptsrr", "rtpptsqpsqqtrqpstsrqqrsrptrtsrtssqtrrtqqsptqpqsts", "pprpqtqqsqqtqrpprpqptpqpprrsqrtppqrssqpqsqssrpsq", "sqtsqrrssqttstqstpttqrtttpqqqqqrqqprtpprpstrtq", "sqtsqrrssqttstqstpttqrtttrqssrsqsqqqrtqt", "pprpqtqqsqqtqrpprpqptpqpprrsqrtppqrssqpqsqssrpsrs", "rrpqtqstspqqprrpppqsssspqsqqtqrqtpprqtsrtqprrrtsp", "rtssstpptrpqqttrqsttsrstqqtsrrtptqttssrrqrqsqqpt", "qtssrptsstrprssrptrtrqtpqpsptqsqqrpsqrrttptspqqs", "qqqqqqtqsttrpprtqqpprrsrrpqtrsqtqstrpprrtprrqpqr", "rtssstpptrpqqttrqsttsrstqqtsrrtptqttssrrqrqqsr", "qrtqspstqqqqqqsppqpssstqrqqppqq", "sptqpqstrppsstrprprtpssstrtpqqtttrpqqstpprtqtppr", "qqqqqqtqsttrpprrrqqrspttssptptpsqtrsrsrrpqrqqsrrr", "rqqrttppsttrrrtrqtrsqsqsssrprssqtsqpqsrsqtpsspqst", "rsrqrpqttsqqr", "prtpqttsqrsssqqrpprrqppprsqptspqpqqrtqppsttssttsq", "sprtrsprpptrsqqrtrrqrqpssstpstpsrrpptqtrprsrppqtq", "qtqsssprqttptrttpssrtssrsqptsqsqqtrppttptssttqrrqq", "ssttrttspppsrpttrrpqqrtrqsqrpsttpptspqrrqqpprrqsq", "qrtqspstqqqqqqsppqpssstqrqqsqq", "qtssrptsstrprssrptrtrqtpqpsptqsqqrpsqrrttptsr", "sqtpsptsqqqttqttqrqppqstpqtrrrsstrtrtr", "ssttrttspppsrpttqqprtqrtqq", "qrtqspstqqqqqqspsstpsqrqtsstqtttsqsqqsrtststrpqtsr", "qtqsrtstttqttstppprqqrptptrtsprsqprqprrrsrssqstpt", "sqqsrsrssstqqrstqpqqpptsspqqtpsqqprqsrsqqstqrpppqr", "qqqqqqtqsttrpprtqqpprqsqrtqpsqsrr", "sqtsqrrssqttstqstpttqrtttpqqqqqtrsss", "qtrrpttppq", "tssrssrtstqtqrsptpqttspqqtprqrqqpqsptssqpprrpqrq", "rpssqqsqpstssprssrrpqqqrppsqrptqrrpqqspqqrppqptp", "rpqptsrqtsqsrpqstsprqppqpsqrtsrtssttqst", "rtsssttsqqsqtsptqptrpr", "ssrsrsrppqprrqpsqsqsqrrtpqtppsrrttstrrtrqtstpsqtr", "tpqqtprstttprqpsttspttsrqpqpqqqrqrtpqqtqsttrqtqtqs", "srqsptppqtppqppspprqrsrsss" };
    assertEquals(1660, undohistory.minPresses(lines));
  }

  @Test
  public void case55() {
    String[] lines = { "qstrpsrqrrrqqpqppstqprtpqrrsrtrrqpptttqtqsqtrspp", "qptpqrpqrstrrsstprpqtpqrssqqrsstptpppspppqrqqtqpq", "tpsqtqqqtrrrspsprsqqsqttsqrqpspstsrrrpprqqstpprttr", "tpsqtqqqtrrrssrrstpttqsptspppptrrrtpqptqpstsr", "tpsqtqqqtrrrspsprsqqsqttsqrqpspstsrrrpprtrtrqs", "qspqqrspstprrqqtpptqrrpqsrqrrtqrtsrrppppsqsrqpqtqr", "tpsqtqqqtrrrssrrstpttqrpqppssrsrr", "qpqtrrrtptrpppttpqsqsrttsrsqrrtqtptsrqsrtprqtqpsr", "tpsqtqqqtrrrssrrstpttqsptspppptrrrtpqptqpsttqpqs", "tpsqtqqqtrrrssrttrssssqtqrprqrqpqrtt", "tpsqtqqqtrrrssrttrssssqtqrprq", "qstrpsrqrrrqqpqppstqprtpqrrsrt", "tpsqtqqqtrrrssrrstpttqsptspppptrrrtpqptqpsttqpqqtt", "qspqqrspstprrqqtpptq", "qpqtrrrtptrpppttpqsqsrttsrsqrrtqtptsrqsrtprqsqspt", "sqsrrrqtrrpprqstqqstrtpqrrtqtpssqtpqpttptprrrrtpps", "qrspsprpqsqpqtrtptsqtrqqstrrpsppptsrsrqsrtpttrts", "tpsqtqqqtrrrssrrstpttqsptsppppq", "qqpsrpppqqrrpptqqtsssqsrpqtpppsrqtppstpqttqrrqtspt", "rtqtspprqppppsqsprtrspqspppqrtsrtqsqrqtrqqrprstrs", "sqsrrrqtrrpprqstqqstrtpqrrtqtpssqtrsqpstspqr", "ptssrptpprrqstqptsrqrtrtptprpqsqrprpptprtrtqqpsss", "qsprqqqrrqrpqqpqsqtqttpstrtsqtptpttttqrtrprsqtstp", "tpsqtqqqtrrrspsprsqqsqttsqrqpspstsrrrpts", "qsttttqtsstpqqtpstrpttrr", "rtqtspprqppppsqsprtrspqspppqrtsrtqsrppprpqs", "tpsqtqqqtrrrspsprsqqsqttsqrstqrsptstsrqrtstpsspsr", "qstrpsrqrrrqqpqppstqprtpqtqrrqttttpsrrptspsp", "qqqssppqrtspsstprptpsrqpqttrtssqqstrrpqptstsqrprt", "qspqqrspsrqsrpptqstrqtqrsptqpt", "tqpspqqpqqrtqsqqpspspsstrtqrqrprtpqpspsttpttrqpqr", "pqtssptprsssrqtrqttssrssrqqqqtrprptpptqrtqtqstpsrt", "rsrpqpqptptpqsrpqstppprtpqtrrpsrrsqsqqpspstqspqrqq", "rsrprsttqqrtsrrqttpqttqssrsssqrrtqsstrpsptsqtpqrqt", "rrtpqpqprpppppstsqqttprqrqpttprtspqrtqqqsssqqrpptp", "psrttrsrstpqqprtppsprprpstsppqsstsqprppqpqpttqqtp", "pqqrsrprqrpsqrprqrrqrrstrprptpsttsqqtttprrstttsqs", "pqttqqqspptrstqspsqqsptqprtprtqptptqq", "srrprspsqqsttptppqprsqtspsqsqtqqsqqqstqsprpptsrs", "qsprqqqrrqrpqqpqsqtsssptrsssqstsptsrtr", "qspqqrspstprrqqtpptqrrpqsrqrrtqrtsrrppppsqsrqpsrrp", "rtqtspprqppppsqsprtrspqspppqrtsrtqsqttp", "tpsqtqqqtrrrspsprsqqsqttsqrqpspstsrqqtsqtqqqqrs", "stqqspsrtstqsqrtspqprpqsqtqtpsqssrsstqqrqsssspqss", "rrrpqrptrpttsqrrrqrrtrtqprrpppptsrrtrrprrtssqpsptp", "ppqrqsppttpsqssptstsqrtprtqsrttptqpqrststqrqqprqpp", "tpsqprprqsrqqrrrrtrtqqtqtrqsrprptsrtpp", "psrttrsrstpqqprtpptprpprpsrpsqqprprr" };
    assertEquals(1559, undohistory.minPresses(lines));
  }

  @Test
  public void case56() {
    String[] lines = { "qsprstqpqttptrrtptqrsqsqrtrsrqqrqtqrttrppsrtpsqptt", "spqqrsqqtspqpsqrtpqttqsqpssrqtqqqsspssstprpqsrpp", "ttptttqstrtrtrrqsrrrssrpsqqrqqptqtspstpqstrprqqsst", "qsprstqpqttptrrtptqrsqsqrtrsrqqt", "rprqtttppqpttsrrpqqspppprprptrtsqrtttrqptrtpststsp", "rpprsrprprrttsrtqtrqpsttqqqrqtprrspqqqqtsttsrsqqqq", "rpprsrprprrttsrtqtrqpsttqqqrqtprrspqqt", "spqqrsqqtspqpqr", "ttptttqstrtrtrrqsrrrssrpsqqrqqptqsrqpqss", "spqqrsqqtspqpsqrtpqttqsqpssrqtqqqsspssssptqstq", "pqspqrtrtrstsstsrrssqqrsrtpptpssprpppqqtqrpqsttrpr", "tsprssqqpqtsttpstsrsqprqsppqrssrtssrptprtpptqsssr", "spqqrsqqtspqpsqrtpqtt", "qsprstqpqttptrrtptqrsqsqrtrsqqptspqrssrsstsqspstrs", "spqqrsqqtspqpsqrtpqrrptttpqrqrtqtqrqsprsrrrtrpqr", "qsrrsqqttprsqqqttpqrqpstqtprprtpsrtsptqttsrqptqqp", "ttptttqstrtrtrrqsrrrrrrprrrppsrrttsqrrprqtstq", "qssrq", "sqqrpsqrqrsrsspsrtpqqrrprsqqpspqtrpqsttqtrrsptsrqq", "prsqrqtqrsqrrrqsqsqttsprsqqtsppptstrtprtqttprpsrt", "tsssspqtrttsttpstpqtttqtrqptrtqr", "rqtppqtrsrpsrqrpsstprttrpqqtpsqrtqtsrpqsppprsqrr", "ttptttqstrtrtrrqsrrrssrpsqqrqqptqtspsqqpssqrstss", "trtsqpsrtttrprptsqrsqrsttpsqstrpsprtstssrrptpqrss", "rpprsrprprrttsrqsptrqpsstsrqpqrrrs", "ttqsrqsrspprqsrtpttptsppsrtrtrqrrttrrtqrqssrpqsrt", "spqqrsqqtspqpsqrtpqppsrrrrts", "sqsrqrpqqrssrtpttpqppppptstssqqptrrrsrqptsprqsqqq", "rrptsqqqqtpppqtttsprrsqqtptqrssqrqqrppsrtqrtqqqtq", "tsprssqqpqtsrtqsspqtppstrttqqrrprqq", "qsrrsqqttprsqqqttpqrpr", "spqqrrsttrtspq", "pqspqrtrtrstsqptsrppsssqtqsqqtspr", "tsssrrqrtqqrqstqstpssspsrstpsrsqpstptspqtqqttqrtp", "ppssqppttpstqtqttrqsrptppstttpppptpptrppsrpsspqps", "trsqpqrqtppspqsrtpqrrtsqpsrpptsqrrrrpqtrrstpqstrts", "spqqrsqqtspqpsqrtpqrrptttpqrqrtqtqrqsprstpsprs", "prtqptqssppqrtspqsrtrtqpqtrstrsrrssqtqrrsrspqssrs", "rptppsspsrrqrrqtqqptpspqqpttrspqtrssrrsspqsssrsq", "rrqqtrrqstsqqpstssspqqqttprqqrststrrsttprpspprst", "stqtspppqpprsrtrpqsrtptpsrssrptrpqstrpsspqpsqprqs", "ppsqsssststsqssrttqtprtpsppssrqtprstpsqstssstpqr", "psqtpptqssprprsrppqsstqstptprtrqtrpptqrtqspssrpq", "prsqrqtqrsqrrqsrttqpstrqqpqpqpqst", "tqtqspprqptsptpqtpqtrrqtprsrrsrpqsqrqrqtqptttqtq", "trsptqqsrqtsrtprtpqtrtptpqqqqqqqrspsqsqsqpttttpssq", "pqsrpttsrrpprrprqtqqstrptttqqspqtrtprrpqqstpsrttrr", "rsqprqrpsqpttprtpttrtrqqsstsspstqqrpprqtttsppptsrq" };
    assertEquals(1723, undohistory.minPresses(lines));
  }

  @Test
  public void case57() {
    String[] lines = { "qtrtsqtpprpssrtsrqtqsssstsqrqsppprpttsqrtrptsrsrrr", "ptsrqqsttpsqqstrrsprqtqqttsqqsspstqptppqsrtqrsrt", "qqptsrtqtrtprrprrrtqptrsrrtsrtrtrtqtttsrtrrqrpqprq", "rttsrpsrtrsrrpqtpqqstrspqpstpptrtqstqqsqrqrqptrts", "ptsrqqsttpsqqsttptqsqqs", "rttsrpsrtrsrrpqtpqqstrspqpstpptrstqsprtrsqqqs", "qspssrspsptttpsrqttqspstqrsppqstsptpttrtqqqtptsqq", "rttsqpqssqrtpqrtpsrsqpsssqpsr", "ptsrqqsttpsqqsttqstr", "ptsrqqsttpsqqstrrtssrppspspqrqsrqpqqtrspqspppqqs", "rtspstpsqpsrqqqsrstprssttrpsrqptrssqtrtprpspqqrsrp", "rttsrpsrtrsrpsqrttqrtrrqqqsr", "ptpppspsrrsqttqstrsqqtpqrptpttqprpptsprtppqttrsp", "rttsrpsrtrpqppptsrpqpqrpp", "rtsrqrssqrpstrtqtspssstrqppqtprpssrstsrrsqsrqqpt", "rtspstpsqpsrqqqsrstrsrqrsqptsrsttssstpts", "qqptsrtqtrtprrprrrtqptrsrrrqprrpqstrsqrtptrqpttrt", "rrsppsrttqqttptqstqqrsstpqpqtqqtqptqrttqstrpqsqr", "strrtprrpqsqtqtrtsrpqrprsrptrstqpqttssrptpprtprrr", "rspppprpttqtpstqspprsrqsrsqrpssttpqpqptqrpqpsppptt", "rtsrqrssqrpstrtqtspssstrqppqtprpssrstsrrsprrp", "rttsqpqssqrtpqrtpsrsqpsssqpsrsrtprtqsr", "rtqtstqptrrprtpqqpsstrqpprqrqspqpsqpptprtqsspqprq", "rrsppsrttqqttptqstqqrsstpqpqtqqtqptqrttqstrtsrprs", "qtstqqtspqstrptrptsqrsqtprtsqqqpttpppqqrsqtprsqqt", "rspqrqpqrrprqqqrqptrqpqsrrrsqrtqrsqtqtrqpsqqptqsrr", "rtspstpsqpsrqqqsrstprsqrrrrptsqqrqstrtsrqrpqppqsqr", "tpppsrqqqsptqtpsqstpsqpsrrtsrqpttrsssprrttsssqtpqq", "ptssspsrtqptqqrstqtrsptqttppqrpqptrrqsqprqrqrsps", "qtrtsqtppptrs", "qspptqqrrtsrtrpsstspqrpptpqpsrsrpprptrrtsqrpprrtr", "qrptprqpqqrsppqtstrtqsprqqssprpsrqrtsqtppsqrtpsrqt", "spprqrtqtqrtsrpqqrtqrtsssppqqsrrttqqttsptqprsrsqq", "srqtqrsrpsrqttprsqtqqqtqsqrtttrtrpqttrptpptsqrsq", "tsssqqsqqsprqqrsqpqrsqqqrpssprttpttpprqqqrprpppqp", "rrsppsrttqqttptqstqrppqrrtqtqpqrs", "srqtsspqrssqqqqttqpsptsrssprssrpsqtstrpspprqqspt", "rttsqpqssqrtpqrtpsrsqpsssqpsrqtpsqp", "rspppprpttqtpstqsppqsqppsprqpptptrtssst", "ssqtrqrsrprrqqqqrttrqrppprpqrrrqpstqrpspstptrtspt", "rsqqpqttprsrrrrpqrsqsrpqtrpprrqpprqttttppqtqqprs", "qrprpqsrqqrtqttsssstpqssrqrspstqstpqsttrsprpqqsr", "rtspstpsqpsrqqqtttprpqpt", "trpstsprsttrqqrtpppqpppqqstrtsqttqqqrstrtpqtsqrtqt", "rsqtqsspqrtptsqpttsrpqppqqqtrtqrsqtsstptrqqtrrqp", "rsqqpqttprsrrrrprstptqtsrsspqqtqsrqs", "spqpqrsrqtqsttpttqppsrqssssrpqrrrsrqrqsssrprpsttrp", "tsssqqsqqsprqqrsqpqrsqqqrpssprttpttpprqqqst", "tsssqqsqqsprqqqqstsqppqsppr" };
    assertEquals(1763, undohistory.minPresses(lines));
  }

  @Test
  public void case58() {
    String[] lines = { "psrtrprtssprpqsqrsqpptsrrqptqqptpqttpptstsrrrpsrt", "psrtrprtssprpqsqrsqpptsrrqptpsrpprsrtqqtqpprpprst", "ttpprqssspqptqtrrptqsttpsqrrpsspqtppqtrpspqtrttsr", "psrtrprtssprpqsqrsqpptsrrqrpq", "psrtrprtssprpqsqrsqpptsrrqqsqrpqqprsqqrrtqsrqrps", "trsstspqrpsprrsqrtstqttsqrtrsrrtsssrprpsrsrptrsrq", "qttppsstsqpqpsppstqprsptrtptsrtprqspsprqpqqptstrt", "trqrstppsttqptrttpqtrqstqqqqrttppqtqspqtrpqrrrqqq", "tqqsrqpptssqtttptrsqtsqqtrqprqrrsprsspssqppqqtpppp", "qprrsrrqrrqqttpppttsptptptpstpstqqqsrqttqqrttrrrpp", "psrtrprtssprpqpprppqtrrsttrttqtppptps", "ttpprqssspqptqqqr", "qqpptqqqrtpttqprsrrqsrqrrrqrspqsrpqptspstttsrspstq", "stqrspstsqpqsstrrsssspsqqrrqrsrtrqtpprrrsrtqtprsp", "qprrsrrqrrqqttpppttsptprqrrtsptsrprt", "qrppqtqttrttrpqsprrqrsptstrsprqqsqssqrrstrtsrtpt", "ttrsqtqtqrrrrrpqtqsstsrrqqsqprrtppqrqstspsqpqppq", "qttppsstsqpqpsppstqprsptrtptsrtprqspsprqpqqptstsr", "psrtsptrtspprqqpsr", "sqsppstrqrtqrqrstprrqttrrtppqtpprpqssstqrqrtsqqs", "sqtqssqqprrqqtspsqprpttprpttsrpttrstqpqtsqrrrtrpt", "tprstttqsqstprpttrpqrttsqttqrtppqtqtrstrqppsqrptq", "qsttrprtpqstrqrqssqtqqsssrssstqrssrqtsrstqqpttqsqt", "rsrssqqqrqprqqtpsptqqtqssttqsqqrpqtqtqqsttsssrrrst", "tsrprsttsqsqspqstrtqqqsptpstttqpppptspqtpqpttqqr", "ssssqtprsrtpssqsprppqtprpprtrrtptrqrtrrpsqqpqqprsq", "trtrrsstrqpqrrtrsrptsptpppssqrsspqstqtttrpssprttrq", "qtppsptptppqrptpsqtspqttrqttrprqqptstqtsrssqprqs", "qpttpqqppstststqtqsp", "qpttpqqppststrqttqpptpqsq", "qsstqsrqptsprprpppssppptprpsqqrsstrpspqpqstsqrtqr", "trsstspqrpsprrsqrtstqttsqrtsqqrtrprsqssrsqrsstt", "qttqrqtqtsttrptrqtrqpsqrqtrsqtsstptsttptsstqtsrs", "pprrssrrrtqprqsprtrqttssqtqqtprqsppptstprqrstqrqsr", "ttpprqssspqptqtrrptqsttpsqrrpsspqtppqtrpspqtprt", "pptssrqsrrtqsqtsqssrrqqqstpppttstttrpprprqqtppst", "qpqpqrtttpspsrrrttsppspttssrtqrqrppsqqqttrqqpqtppp", "pptssrqsrpptrqptpp", "qpqqssqrttrptqqpttqqqprtrprtrsprtrsrttptrprpstps", "ttppsstsrtqsqqsqspqr", "srqtsssqtqttqrtrrstptrrqqrqqrsrsqttptqsprrpqrqtptq", "rpsqstqtrpsppsssppsppsttqpqqqtsqrrqrtsrqsstqtqtpp", "ptrtptsqpsssstrptttttqqrqrstpqrtptrqspqstpqprrrss", "psprsrrtsprsstpsprrssrssprtqspstpssrsqrtrtpqttssrq", "tprprssttptpsrssqprrrtsspsrrpsssqptpqsrpsqtsprpp", "ptttsrstrptsrtsppqqrspssspssrrtqqsqqrsqttttsqtss", "rppptrrqtsstrpqrptrprsqsprrtstrtptrtqtrtrqttpsrrrt", "qtppsptptppqrptpsqtspqttrqtsqpqsrpts", "tqqsrqpprsptspqrprpt", "qsstqsrqptsprprqtttrqsqsrttqsqsqqrtptqs" };
    assertEquals(1946, undohistory.minPresses(lines));
  }

  @Test
  public void case59() {
    String[] lines = { "qtqptttrrrsqprpsrsttsssrtqspsqttstprpssrrsqprtttqq", "pprtsrssrspsptppssrttsqqssrpqqtsrspqtrqtrstqttqq", "pprtsqttspppspqrqr", "qqrspppptqstqstspttrpqsptqtqtpppqpsqqtrstpspttrtpr", "tpsstrqrrtqprrrpqrsttrpqqtqtrptsrsssppttrttqsrsqsp", "pprtsrssrspsptppssrttsqqssrpqqtsrspqqqqqpspsq", "pprtsrqttptsstrqtsttsrtrspsqsqprtsrt", "rrrtrqrrttsrptptrqqrqtppsprsqrrrsrsqsrpqptsqstsp", "pprtsrsqtspqsq", "qqrspppptqstqstspttrpqsptqtqtpppqpsqqtrstpsptr", "pprtsrssrspsptppssrttsqqsssrppsspstrptrqqpsqqqt", "pptrsqsqqrtptqqqpqrpttqpsrrptssrtpqqsr", "tqrqsqrtspptqtpssprtttpptqtsrtqtpttqrsrpttprssqr", "pprtsrsqtspqprrsqrrrrsrqrrtrrrsssstrqsqrtrtttqsrtr", "pprtsrssrspsptppssrttsqqssrpqqtsrspqrqprtrpsqprr", "qrrstqqprrssppsqrtpqqtqrqsqqtsrrrstqsqpsrqptpprtpp", "pptrsqsqrspqtrsqqqtpsqqsrsrppstrqpsstsrpqtq", "qqrspstrrrqtttrtsqr", "tqqqqpsprtpspqsrrptqstsppspqqpsttttqpppttpqprptts", "pprspqsrtsrsptqpqrtstqtpqrrqsrtqqptprssrtrrqsrqq", "ssqqrstqsqsptssptsqpspttrqsqrrttspqrqqtpprsqqsrqp", "pptrsqsqrspqtrsqqqtpsqqsrsrppstrqpsstsrpqtqq", "qqrspppptqstqstsrqqstqtqstsssrsqpsqppssrsqsrprqr", "ptrrprsqtsptssrtrqprppqrptsrttrsrrstptqpqqtqttqtq", "pprtsrssrspsqqprsprpqrtrrrqtsqq", "pprtsrssrspsptppssrttsqqssrpqpppqpqtpqrtsqq", "ppqprrprpqsrqqrrsqrpprrsqtqrqptrqqpqpprqsspsp", "rrrtrqrrttsrptptrqqrqtqppqtqs", "pprtsrssrspsptppssrttsqqsssrpqpqs", "qrrqrppttqttssrqttpprrstttpqrrsqprprpprrpspstsrr", "tsqrspqstqspqprpprtstqtrqppqsppqtqqqpsttqspsqqrtp", "qqrspppptqstqstsrqqstqtqstssqspqrtqtqtsqsqptqrttq", "ttsqtrqtsqpsrspqsqrpstppsssqsqsptppppptptptstsrs", "tptptpqqqtrspqrppqqssrsrtrtqsprpspqsrrsqtqssprtqr", "ppqprrprpqsrqqrrsqrpprrsqtqrqptrqqpqpprqsspsptqrp", "ppqssqqqpqrttqrrsqqsqrrsqqpsstrqqpsqttpssrtrqpqtt", "tqtptptrsqtstqrrptqqqqsqsqssrsp", "rrrtrqrrttsstt", "pprtsrssrspsptppssrttsqqqpspsqqssprpp", "trsqtqrrspqpspqtttspptpqsqrp", "srtttpppsrqptqspttrtrsqrrrprqsqrpssrstrprrrpqqqs", "pprtsrssrspsptppssrttsqqssrpqsstsqrqpqrpprtqrt", "trsqsqtqrqrqsrtsqqtrrtrsr", "pptrssrqqqpqtsttsrsspssqprsqqprppqppptpprtpqrsrttq", "rrrtpqprrtqssrssstrstptrqpssrpsqrqpqssqpttrsrptttq", "pprtsrssrspsptppssrttsqqsqrprqrpsqt", "tptptpqqqtrspqrppqqsppsrp", "rprrqtqrrqpptsrqpqsssptpprrstpqtrsttprrqtrtqsqprqq" };
    assertEquals(1578, undohistory.minPresses(lines));
  }

  @Test
  public void case60() {
    String[] lines = { "pqqqpttspstpsssssttqtpsprtspttqppqqpqrsspqrpssrsts", "pqqqpttspstpssqstrtsqsrrrsrprrrsqp", "qptprtrpqsqqrqpssqsssprrsqprtpprrqtsstpsrqttqrprpt", "qptprtrpqsqqrqpssqsssprrsqprtpprrqtsst", "pqqqpttsppsrtptttqt", "qrssppsptspsqsqtpsprqsttrprsrqqqrtrqtqtqrtsstrprr", "rqptpspprpsrqsptqtsrtsssppqpsqrppqtrtrpqtrstqrrp", "ssqtprtpqtpprtpsrspprqsrqqrqpsqpqrsptsqqqqqstprsr", "qptprtrpqstsptsrtpssqq", "qptprtrpqstsptsrtsqrsqqrtqqsrqpqssqprqrqpptqt", "rrrtrtrrqqppptptqtprtrrrprqtrrtrppqrqpsqrssrqrsqq", "rqptpspprpsrqsqspqsq", "qptprtrrstrpqrqppqpsptspsprs", "pqqqpttstqqsqrptprqqrtqsrpsspsssq", "qptprtrrqrpps", "tqtstqrrppqrrptrrptpqrttrrqrsqrtqsrqqqrprspqrtqt", "rqptpspprpsrqsptqtsrtsssppqpsqrppqtrtrpqtrst", "prrrstsrrpsqttpqtqrtppsrppqppsttqqrttsrstpprssqs", "qptprqrqpttqrsprrpqrtstq", "pqqqpttsppsrtptttsrqtsptrqppqstrtppqssprqtpts", "pttqrqsqqsrqtqssqpsrppprpppsqrrprrqrrtrttqqttttqsp", "rqqprspqstqrqqrqptpsppttqqqtpspqrsqpstsqpppppstssp", "qpsqtsstqqrqqpqr", "pqqqrs", "qqqprqprtstrstrqsqtssssssprprrtppqrqssrsrstrqpsqsq", "qsqtptqrqptrtqtssqqprsqpqrsrsqtpstprrqpssqtrssttqs", "rrrtrtrrqqppptptqtprtrrrprqtrrtrppqrqpq", "ssrrsqsrqqqsrspsrrqprtppprqstqtqqtprtrrsrptqsttrp", "ptprrrsrqqtrtrpptqrprtsttppsqtpqrqsrrsprppptrqtsp", "pttqrqsqqsrqtqssqpsrppprpppsqrrprrqrrtrtprsqsrqp", "ttsqsrqsqppprpsqttsssqtqrqsstpspssppqrqqprsppprr", "ssttptsqpqrrpqtppptqrrqtppptqqrtqsrqsqspqrprrqsprp", "rqsqstspsttrppqppsrtqsqrttsrqrtrqtttrqsrqtppqrsptq", "qqqprqprtstrstrqstqtsqtsqrsptqtqsqqrprt", "prtrtstpsrtqppsrtqrqsprrppqrrqrqrqqtrqqqrsrqrprss", "ptqqtrsqrtpqrqspqtspqsqprqppssttqrrsrtqprsprpsstqt", "prqqtrsptsstrsqtqppsttspsrrrtqrsptpqrqpspppssstrp", "pqqqpttspstpssqstrtsqsrrrsrprrrsqs", "qqssqsqprqtrpsqtssqrtrrqpqsqttptptqrsrptqrspqrpr", "trrppqstrrspptptrsrtrttrptqsrtrtsqrrptpqqsrpsqqq", "qtrpsprptrtssppqtsrstssqsppqpqrtqsttppstssqssqptq", "pqqqpttsppsrtptttsrqtsptrqrrqsqsrsrpqrtrtrtpqtpr", "ppttsqqptqspqttrsptpqttqspsptrppsqstqsprtqtqrrqqt", "tsqtqqtqqrstrstqrpstttstrpptqtptpsstrtppqrsrppqt", "rqptpspprpsrqsptqtsrtsssppqpsqrppqtrtrtpqpqrppqpr", "rtttsptptqtqrspttpqsrppprptqqtsqspsttprprpqrqsqrrp", "pqqqpttspstpssrttsspsrrrpqrtpprpqr", "rqqprspqstqrqqrqptpspptqsststttsqrpssrtrrqq", "rqptpspprpsrqsptqtsrtsssppqpsqrppqtrtrtpqpsqr" };
    assertEquals(1690, undohistory.minPresses(lines));
  }

  @Test
  public void case61() {
    String[] lines = { "abcde", "a", "abcde" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case62() {
    String[] lines = { "ba", "a", "a", "b", "ba" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case63() {
    String[] lines = { "aaaaa", "a", "aaaaa" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case64() {
    String[] lines = { "abcdef", "b", "a", "ab", "abcdef" };
    assertEquals(19, undohistory.minPresses(lines));
  }

  @Test
  public void case65() {
    String[] lines = { "abcdef", "ab", "abcde", "ab", "abc" };
    assertEquals(18, undohistory.minPresses(lines));
  }

  @Test
  public void case66() {
    String[] lines = { "tomorrow", "topcoder", "tomorrow", "topcoder", "tomorr", "topcod" };
    assertEquals(30, undohistory.minPresses(lines));
  }

  @Test
  public void case67() {
    String[] lines = { "abcabc", "abcab" };
    assertEquals(10, undohistory.minPresses(lines));
  }

  @Test
  public void case68() {
    String[] lines = { "abcd", "a", "abcd" };
    assertEquals(11, undohistory.minPresses(lines));
  }

  @Test
  public void case69() {
    String[] lines = { "abcdef", "a", "abcdeh" };
    assertEquals(14, undohistory.minPresses(lines));
  }

  @Test
  public void case70() {
    String[] lines = { "abacus", "aba", "abacus", "aba", "abac" };
    assertEquals(18, undohistory.minPresses(lines));
  }

  @Test
  public void case71() {
    String[] lines = { "abcd", "a", "abcdefg" };
    assertEquals(14, undohistory.minPresses(lines));
  }

  @Test
  public void case72() {
    String[] lines = { "abcdefg", "abc", "abcdefg" };
    assertEquals(14, undohistory.minPresses(lines));
  }

  @Test
  public void case73() {
    String[] lines = { "aaaaaaa", "a", "aaaaaaaaa" };
    assertEquals(16, undohistory.minPresses(lines));
  }

  @Test
  public void case74() {
    String[] lines = { "aaaabbbb", "aaaa", "aaaabbbb" };
    assertEquals(15, undohistory.minPresses(lines));
  }

  @Test
  public void case75() {
    String[] lines = { "abc", "bcdefghi", "abcdefghi" };
    assertEquals(24, undohistory.minPresses(lines));
  }

  @Test
  public void case76() {
    String[] lines = { "abcdefg", "a", "abcdefg", "a", "abcdefg", "a", "abcdefg" };
    assertEquals(26, undohistory.minPresses(lines));
  }

  @Test
  public void case77() {
    String[] lines = { "abcdef", "a", "abcdef" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case78() {
    String[] lines = { "aaaa", "a", "aaaa" };
    assertEquals(11, undohistory.minPresses(lines));
  }

  @Test
  public void case79() {
    String[] lines = { "abcdefgh", "a", "abcdefgh" };
    assertEquals(15, undohistory.minPresses(lines));
  }

  @Test
  public void case80() {
    String[] lines = { "yrmopxio", "wyrjwropn", "sf" };
    assertEquals(26, undohistory.minPresses(lines));
  }

  @Test
  public void case81() {
    String[] lines = { "aaaaa", "a", "aaaaaa" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case82() {
    String[] lines = { "aaaaaaaaaa", "aa", "aaaaaaaaaa" };
    assertEquals(17, undohistory.minPresses(lines));
  }

  @Test
  public void case83() {
    String[] lines = { "aaaaaaaa", "aa", "aaaaaa", "aaaaaaa", "aaa", "aaaaaabcd", "aaaaaaa", "aaaaaaaab", "aaaaaaaab", "aaaaaaaab", "aaaaaabcc", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaabbcc", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaabbcdddd" };
    assertEquals(94, undohistory.minPresses(lines));
  }

  @Test
  public void case84() {
    String[] lines = { "abacabad", "ab", "abacabada" };
    assertEquals(16, undohistory.minPresses(lines));
  }

  @Test
  public void case85() {
    String[] lines = { "a", "abcde", "ac", "abcdef" };
    assertEquals(15, undohistory.minPresses(lines));
  }

  @Test
  public void case86() {
    String[] lines = { "symrohntuzdjwwojfsnojbslafadlsrdqfwemkahjdsicgrhbe", "ykiqxivyliselljjpvtpefvxnzfgggkgsuwqctqpbktoveylat", "cgyzfnylthtgpmamefhwujgqzeuzrwtvdrvkhvvaepgudjijop", "hkanaarxzktugymbjvygvfvebanjlbyslbgobznckixshltsgt", "abyyhzyukkxlclmkbnmorywoqfblzhgalfysgyptimenzqzafn", "owllndqoqqyxsjeqbmosfzfjmgbnhgbvfoiusbkktihlrlbvar", "pfqurcbsskbtfihqebromkzvxqjynjpdoizfkcaembxulhmpid", "fwpesmxbmmkdpalriyvicklaeyhsnrvuomziywjmivpavbtfzo", "pbyadeamypetkuhjchhltrijtfkmlldaoddskdeitkefelqgtx", "toqbxmjjyuwdwljzdtfhdyujfyvvhquagkeeynpzjmcfxnfcgk", "lmkfvresmlkgnrstxrgoqrauxziedqqpecwctauhnhndahwxaf", "nswqpvpxbvptkuvgwqjsxybmbbuaawfopdeezvdcqswcorlmkw", "fhuguykqykmdadggjhcmkuhixvbkilgptaxpyhfwutbuzidirf", "xdzelybnilyoatryiphpoblpykzbutirwjxikzvskvjnpanzrw", "rhycxyoybirlcouzweatzloiafkpfdlwllakjoimyaxaquaoaa", "hznxjpdvekzqgkbgunwezuezvutxitzrvnpecuajebzmlauhnq", "lpksohojexeeqztfexbggfhftuinbxdooqgcxvneusiktdsxav", "fhboowiyklynamdipdfehzyrmsugrubxdelubwulhsajfguwjz", "asbzjprdvizyhffvzgrvtaovktbgpmfreiqnxjsuuuvbzawagn", "vbolwaeagtmnntydivpdsjxpmypjyxyvyohwqlwyhlmugkzohq", "rbzoqmmfxmexkeorbgezfnmtjsflhobaqbripdqosunczdvckb", "brrqmairnrfpsxsjgjoyxismmrshvclxvcphexysrfhlfzunkk", "ljvdvhxnrurcrmgivkgvczdlkimgvwsifnnbvmqmhkqawwjugr", "plqswcajixfahnqvolhgzqqprpnajttaejtdnvovvtxcgnxwah", "fzxvqqmdqvzlyfwrijmwejsematjxusevsbmiorzlqmjwjagsp", "fzyxdmxwywqqcoiearstsdkepinpoigvhhsktsitqbktpuxrnp", "kfuwmjebbvjjqqslcodnhtqrofolybcijxfxilyjgitzalkfzn", "ujikcxrqkpunzdmgausagakbzlolsoymzjybipssgmhfrvmtqg", "twiezirnvjdwxcfvepmwjskrxdmlwetpccvbmmphvsduxkrbzd", "zjxjcxoqikvebxgxbujsbhmfbjrvkralcyuevkufupjwprvsle", "kpnywrinmuemggmcmhnhpjyyhpschfjtuwuqncebykqetcjfky", "ozhnzpertmxchtbbkqfoseyiktktzwrnvbcxshqlvpqejrgthn", "jbtjjedwzesttquwnmfdzcvpgeiozqckrvtdbyzbcrwwhsuwgz", "cfbxxhdfwexaopxhuzgtckkagusaqazufcrekwkiahkqyhysig", "lksymzuebmedhmfaqrzcbzmlsmvqfdysqsscrojvbpykbdmuxl", "yynmmfzjxgoxagptljjuekjcwnhljgwjflwtsvepdsodzewkpg", "gtsrxrgecplabsoxnguryzjmcksbwhjcaduzucgyutbvlpuaxo", "rvncirnasjkbomfkmbmscgldbyuvyrlrnatxsizmujoiwvskyg", "canpfqnzmnrzegczdwieicoymmvgwumauzpaqebetudzcfyhbi", "mmmakymgekcrkwszykfcoywuxzbxgfgsrsudtijxslqckldkvi", "mkijefkfdqkllddfhyoswggolqzocxxphfannkuscfdpkixrhl", "kftsvekxvmuudbzdqopkgurjjcugtbtfgnxdthaowukzxkdnau", "yhorsytogppauxpubidbzzwjzvvejwyjfnaznuotjftfdibgtf", "juehffddlmbkvgzxhmrxhcdbiillogqzaxhiemlqamaxububnm", "zuqexamlmcrcbubkcgypwybyvxzqaoebkufkvrvjvolzkpjovk", "dtigredswegafqwlatexccmqbwfmlcwqvfxolaghgmjmehzfdd", "ehfqxipevcirufyrtjubsapbmullborfvyythpzetkxnpwflhz", "mazcdoyozzcsgytgtcvugoefcwdjhlktnjxsxvhzwltdlmjgqf", "dwvjezfhkmuuijefcddjezwackmoqdvtbqfhskpczjxhtdoxir", "inreptodhhieckvhrpsirtuoaptomcgurxagsrjcysgaedkxse" };
    assertEquals(2619, undohistory.minPresses(lines));
  }

  @Test
  public void case87() {
    String[] lines = { "pyramid", "sphinx", "sphere", "python", "serpent" };
    assertEquals(39, undohistory.minPresses(lines));
  }

  @Test
  public void case88() {
    String[] lines = { "pppppppppoooooooiiiiiii", "ppp", "p", "pp", "cult", "diffi", "difficul", "ljk", "kjlkjllkjljk", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "bababababababababababababababa", "tootootootootootootootootooootoooo", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "bababababababababababa", "dzbbzddzbbzdabcdzbbzddzbbzdabcdzbbzddzbbzdabc", "asdfasdfasdfasdfasdfjkllkjjkllkjlkjjkl", "challengingisfunchallengingisfunchallengingisfun", "testtesttesttestingtestingtesting", "testingtestingtesttestingtesttesting", "testtesttesttestingtesting", "aaaaaaaaaa", "asdfasfaskljklfjadksljfkldasjfklas", "zzzzzbbbbbbbiiiilkljkaljfsfdas", "veryveryveryhardhardhard", "difficultasdfdifficultlakjfa", "btestingtestingtesttestingtesttesting", "testtesttesttestingtesting", "aaaaaaaaaatestingtestingit", "asdfasfaskljklfjadksljfkldasjfklas", "zzzzzbbbbbbbiiiilkljkaljfsfdas", "pppcototoveryveryveryhardhardhard", "difficultasdfdifficultlakjfa", "teaestingtestingtesttestingtesttesting", "testtesttesttestingtestinginging", "aaaaaxaaaaaaaaaaaaaaaaa", "asdfasfaskljklfjadksljfkldasjfklas", "zzzzzbbbbbbbiiiilkljkaljfsfdas", "veryveryveryhardhardhard", "notnottoodifficultasdfdifficultlakjfa", "aklsdjfkjldfjasl", "yzyzdzbdzb", "dadafdfafdsaklfjadsklj", "xyzyzxpppppcotototototot", "pppppcocotocotocccctotototopcotopppppcccoootototot" };
    assertEquals(865, undohistory.minPresses(lines));
  }

  @Test
  public void case89() {
    String[] lines = { "abcdefghijkl", "abc", "abcdefghijkl" };
    assertEquals(19, undohistory.minPresses(lines));
  }

  @Test
  public void case90() {
    String[] lines = { "abcdefghijk", "a", "abcdefghijklmn" };
    assertEquals(21, undohistory.minPresses(lines));
  }

  @Test
  public void case91() {
    String[] lines = { "ab", "abcdef", "ab", "abcdef", "lrfkqyuqfjkxyqvnrtysfrzrmzlygfveulqfpdbhlqdqrrcrwd", "nxeuoqqeklaitgdphcspijthbsfyfvladzpbfudkklrwqaozmi", "xrpifeffeclhbvfukbyeqfqojwtwosileeztxwjlkngbqqmbxq", "cqptkhhqrqdwfcayssyoqcjomwufbdfxudzhiftakczvhsyblo", "etswcrfhpxprbsshsjxdfilebxwbctoayaxzfbjbkrxirimqpz", "wmshlpjhtazhbuxhwadlptoyeziwkmgsovqzgdixrpddzplcrw", "nqwqecyjyibfjykmjfqwltvzkqtpvolphckcyufdqmlglimklf", "zktgygdttnhcvpfdfbrpzlkvshwywshtdgmbqbkkxcvgumonmw", "vytbytnuqhmfjaqtgngcwkuzyamnerphfmwevhwlezohyeehbr", "cewjxvceziftiqtntfsrptugtiznorvonzjfeacgamayapwlmb", "zitzszhzkosvnknberbltlkggdgpljfisyltmmfvhybljvkypc", "flsaqevcijcyrgmqirzniaxakholawoydvchveigttxwpukzjf", "hxbrtspfttotafsngqvoijxuvqbztvaalsehzxbshnrvbykjql", "rzzfmlvyoshiktodnsjjpqplciklzqrxloqxrudygjtyzleizm", "eainxslwhhjwslqendjvxjyghrveuvphknqtsdtwxcktmwwwsd", "thzmlmbhjkmouhpbqurqfxgqlojmwsomowsjvpvhznbsilhhdk", "bdxqgrgedpzchrgefeukmcowoeznwhpiiduxdnnlbnmyjyssbs", "ococdzcuunkrfduvouaghhcyvmlkzaajpfpyljtyjjpyntsefx", "iswjutenuycpbcnmhfuqmmidmvknyxmywegmtunodvuzygvgux", "trdsdfzfssmeluodjgdgzfmrazvndtaurdkugsbdpawxitivdu", "bbqeonycaegxfjkklrfkraoheucsvpiteqrswgkaaaohxxzhqj", "tkqaqhkwberbpmglbjipnujywogwczlkyrdejaqufowbigrsnj", "niegvdvotugocedktcbbufnxorixibbdfrzuqsyrfqghoyqevc", "uanuujszitaoaowsxyglafbwzddoznrvjqeyqignpitruijvyl", "lsibobjltusrypanvybsfrxtlfmpdidtyozoolzslgdgowijat", "klvjzscizrkupmsoxftumyxifyunxucubvkfctkqlroqgzjvjw", "zizppvsomflvioemycnphfjtbnwedtubynsbirepgcxfgsfomh", "vpmymkdohettyycsibbeaxniwjkfvabnrllkmaglythkglauzg", "keulyrpaeurdvexqlwgakdtbihmfrjijanxkhrqdllecyhbsux", "nlftmjcnyybwsjmajbwtuhkkiovytgaufpjlxiwbnzhybsxfmu", "mbhkjqmdabmyulbrglwstjkoxbczkjhvhsgzvwiixxaobhfsop", "qnebmflcooetjizolqrmsxphqdgzdmqhoggvrvjqrpmxbhkkfg", "zzxjegsyovdrmwcjavpmshojzxaxnbiztkfomzdhujdmcyxdqt", "eqjalgqgsomonvbreqqzzpwqlihdnvudvlznfhbaokxvcelykf", "hxbldylqqewdnjzrlbskqgfvnqlfvobeyolyyovviwhxfpbuiu", "jlolnjldgvwxljboaypaotdzjxxrschmwrveliumzpnoieipog", "wilaswntywuegdgyethsrznlzrffmwdgxaigmxpyvyaqgaulto", "dtlgzcyvfiykmkllfbzxqyhvizqmamjzlvvgoifltzywueypma", "binmyappzaecvmxirqsmzcuiddymnlfuskiheknevxtehxtbth", "qkjvtfzddlgchxczohpyewfmufzazyxtqxcuwbrxpfymuvfvsy", "xrrcfuusicczaqhlswbzievijhrvdudvmaravupityzffecdks", "uxteeitxtgwdfuydrtbfypbnkcypqodxrrwikfuxwjhtujrliu", "aifppzvkmxyspwvpfyfpkvgthqqrmajxispjncxgviyuqavayv", "svznmhskodmidajwlkfrimprrhenguipdghstyopbvuiqcoplv", "wduwmjpblqoafnxwgqtvwztjekxwnbcuggliiehimvoymyjasi", "nwspsqiukflhyfacamqrbqrypstsxhplrrmbeddvphnegtuxxt" };
    assertEquals(2424, undohistory.minPresses(lines));
  }

  @Test
  public void case92() {
    String[] lines = { "a", "a" };
    assertEquals(3, undohistory.minPresses(lines));
  }

  @Test
  public void case93() {
    String[] lines = { "abcdefghijk", "a", "abcdefghij" };
    assertEquals(18, undohistory.minPresses(lines));
  }

  @Test
  public void case94() {
    String[] lines = { "bcdefg", "b", "bcdefg" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case95() {
    String[] lines = { "abcde", "a", "abcdefg" };
    assertEquals(14, undohistory.minPresses(lines));
  }

  @Test
  public void case96() {
    String[] lines = { "ababa", "a", "ababa" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case97() {
    String[] lines = { "aaaaaa", "a", "aaaaaaaaaaa" };
    assertEquals(18, undohistory.minPresses(lines));
  }

  @Test
  public void case98() {
    String[] lines = { "do", "d", "dog" };
    assertEquals(9, undohistory.minPresses(lines));
  }

  @Test
  public void case99() {
    String[] lines = { "abcdefg", "a", "abcdefg" };
    assertEquals(14, undohistory.minPresses(lines));
  }

  @Test
  public void case100() {
    String[] lines = { "abcde", "ab", "abcde" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case101() {
    String[] lines = { "today", "to", "todays" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case102() {
    String[] lines = { "abcde", "a", "abcdef" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case103() {
    String[] lines = { "aaaaaaaaaaaaaaaaaaaa", "a", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaaaa" };
    assertEquals(38, undohistory.minPresses(lines));
  }

  @Test
  public void case104() {
    String[] lines = { "abcd", "bc", "a", "abcdefgh" };
    assertEquals(20, undohistory.minPresses(lines));
  }

  @Test
  public void case105() {
    String[] lines = { "aaaaaaaaaa", "a", "aaaaaaaaaaaa" };
    assertEquals(19, undohistory.minPresses(lines));
  }

  @Test
  public void case106() {
    String[] lines = { "a", "aaaaaa", "a", "aaaaaa" };
    assertEquals(14, undohistory.minPresses(lines));
  }

  @Test
  public void case107() {
    String[] lines = { "aca", "cacac" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case108() {
    String[] lines = { "abcdefgh", "abcd", "abcdefg" };
    assertEquals(15, undohistory.minPresses(lines));
  }

  @Test
  public void case109() {
    String[] lines = { "a", "ap" };
    assertEquals(4, undohistory.minPresses(lines));
  }

  @Test
  public void case110() {
    String[] lines = { "abcd", "ab", "abce" };
    assertEquals(11, undohistory.minPresses(lines));
  }

  @Test
  public void case111() {
    String[] lines = { "abaaa", "a", "abaaa" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case112() {
    String[] lines = { "abacus", "a", "abacus" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case113() {
    String[] lines = { "aaaaaa", "a", "aaaaa" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case114() {
    String[] lines = { "abcdef", "a", "ab", "abc", "abcdefg" };
    assertEquals(18, undohistory.minPresses(lines));
  }

  @Test
  public void case115() {
    String[] lines = { "aaaaaaaaaa", "a", "aaaaaaaaaaa" };
    assertEquals(18, undohistory.minPresses(lines));
  }

  @Test
  public void case116() {
    String[] lines = { "too", "tooo", "toooo", "tooootoo", "s", "stoooo" };
    assertEquals(22, undohistory.minPresses(lines));
  }

  @Test
  public void case117() {
    String[] lines = { "abcdefg", "ab", "abcdefg" };
    assertEquals(14, undohistory.minPresses(lines));
  }

  @Test
  public void case118() {
    String[] lines = { "ab", "cabd" };
    assertEquals(10, undohistory.minPresses(lines));
  }

  @Test
  public void case119() {
    String[] lines = { "abcdefg", "ab", "abcdef" };
    assertEquals(14, undohistory.minPresses(lines));
  }

  @Test
  public void case120() {
    String[] lines = { "topco", "to", "topcoder" };
    assertEquals(15, undohistory.minPresses(lines));
  }

  @Test
  public void case121() {
    String[] lines = { "a", "b" };
    assertEquals(6, undohistory.minPresses(lines));
  }

  @Test
  public void case122() {
    String[] lines = { "abcde", "a", "abcd" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case123() {
    String[] lines = { "xyzt", "x", "xyzt" };
    assertEquals(11, undohistory.minPresses(lines));
  }

  @Test
  public void case124() {
    String[] lines = { "abcdef", "ab", "abcdefg" };
    assertEquals(14, undohistory.minPresses(lines));
  }

  @Test
  public void case125() {
    String[] lines = { "tomorrow", "topcoder", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyzabcdefghijk", "abcdefghijklmnopqrstuvwxyzabcdef", "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuv", "xyz", "aiueokakikukekosasisuseso", "aiueokakiku", "aiueokakiku", "aiueokakiku", "aiueokakiku", "a", "a", "a", "m", "m", "m", "aiueokakikukeko", "aiueoka", "aiueokakikukeko", "aiueo", "aiueo", "aiueokakikukekosasisuseso", "abcdefghijkomn" };
    assertEquals(148, undohistory.minPresses(lines));
  }

  @Test
  public void case126() {
    String[] lines = { "aaaaaaaaaaaaa", "a", "aaaaaaaaaaaaa" };
    assertEquals(20, undohistory.minPresses(lines));
  }

  @Test
  public void case127() {
    String[] lines = { "abcdef", "a", "abcdefg" };
    assertEquals(14, undohistory.minPresses(lines));
  }

  @Test
  public void case128() {
    String[] lines = { "abcdefghij", "abc", "abcdefghij" };
    assertEquals(17, undohistory.minPresses(lines));
  }

  @Test
  public void case129() {
    String[] lines = { "abcde", "a", "abcdef", "a", "a", "a", "a", "a", "a", "a" };
    assertEquals(22, undohistory.minPresses(lines));
  }

  @Test
  public void case130() {
    String[] lines = { "bacd", "a", "bacd" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case131() {
    String[] lines = { "abcd", "abcdefgh", "efghabc", "cdefgh", "abcdabcdabcd", "ghabcef", "abcef", "abcdabcdabcdfttttt", "ttttt", "tt", "ab", "abcd", "abcf", "abd", "abe", "hifeg" };
    assertEquals(101, undohistory.minPresses(lines));
  }

  @Test
  public void case132() {
    String[] lines = { "topcoder", "t", "topcoder", "t", "topcoder" };
    assertEquals(21, undohistory.minPresses(lines));
  }

  @Test
  public void case133() {
    String[] lines = { "abc", "adc" };
    assertEquals(9, undohistory.minPresses(lines));
  }

  @Test
  public void case134() {
    String[] lines = { "abb", "cd", "abb" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case135() {
    String[] lines = { "abcdefghi", "abc", "abcdefgh" };
    assertEquals(16, undohistory.minPresses(lines));
  }

  @Test
  public void case136() {
    String[] lines = { "orz", "zro", "osz", "zso", "otz" };
    assertEquals(25, undohistory.minPresses(lines));
  }

  @Test
  public void case137() {
    String[] lines = { "c", "c", "a", "a", "a", "c", "c", "ba", "bac", "baf", "a", "c", "bat", "bar", "barc", "barcn" };
    assertEquals(42, undohistory.minPresses(lines));
  }

  @Test
  public void case138() {
    String[] lines = { "abcdefghi", "a", "abcdefgh" };
    assertEquals(16, undohistory.minPresses(lines));
  }

  @Test
  public void case139() {
    String[] lines = { "a", "ab", "abac", "abacus", "pyramid", "sphinx", "sphere", "python", "serpent", "abacus", "abacfs", "ab", "a", "serpent", "python", "sphere", "sphinx", "pyramid" };
    assertEquals(80, undohistory.minPresses(lines));
  }

  @Test
  public void case140() {
    String[] lines = { "abc", "abcdefghij", "abc", "abcdefghijkl" };
    assertEquals(20, undohistory.minPresses(lines));
  }

  @Test
  public void case141() {
    String[] lines = { "abcdefg", "ab", "abcdef", "abcdef" };
    assertEquals(15, undohistory.minPresses(lines));
  }

  @Test
  public void case142() {
    String[] lines = { "aaaa", "aaaaaaa" };
    assertEquals(9, undohistory.minPresses(lines));
  }

  @Test
  public void case143() {
    String[] lines = { "a", "ab" };
    assertEquals(4, undohistory.minPresses(lines));
  }

  @Test
  public void case144() {
    String[] lines = { "aaaaa", "a", "aaaaaaaaaa" };
    assertEquals(17, undohistory.minPresses(lines));
  }

  @Test
  public void case145() {
    String[] lines = { "bcdefg", "bbcdefg" };
    assertEquals(16, undohistory.minPresses(lines));
  }

  @Test
  public void case146() {
    String[] lines = { "aaaaaaaaaa", "a", "aaaaaaaaaa" };
    assertEquals(17, undohistory.minPresses(lines));
  }

  @Test
  public void case147() {
    String[] lines = { "ba", "a", "a", "b", "ba", "ba", "b", "a", "a", "ba", "a", "ba", "a", "a", "a", "a", "a", "a", "ba", "ba", "ba", "a", "a", "b", "ba" };
    assertEquals(52, undohistory.minPresses(lines));
  }

  @Test
  public void case148() {
    String[] lines = { "ttttttttttttttttttt", "t", "tttttttttttttttttttttttttttttt" };
    assertEquals(37, undohistory.minPresses(lines));
  }

  @Test
  public void case149() {
    String[] lines = { "topcoder", "atopcoder" };
    assertEquals(21, undohistory.minPresses(lines));
  }

  @Test
  public void case150() {
    String[] lines = { "aaaaaaa", "a", "aaaaaaaaaa" };
    assertEquals(17, undohistory.minPresses(lines));
  }

  @Test
  public void case151() {
    String[] lines = { "abc", "ab", "abcd" };
    assertEquals(10, undohistory.minPresses(lines));
  }

  @Test
  public void case152() {
    String[] lines = { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a", "aaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
    assertEquals(91, undohistory.minPresses(lines));
  }

  @Test
  public void case153() {
    String[] lines = { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
    assertEquals(62, undohistory.minPresses(lines));
  }

  @Test
  public void case154() {
    String[] lines = { "batase", "a", "b", "batasewert" };
    assertEquals(21, undohistory.minPresses(lines));
  }

  @Test
  public void case155() {
    String[] lines = { "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a", "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", "a" };
    assertEquals(198, undohistory.minPresses(lines));
  }

  @Test
  public void case156() {
    String[] lines = { "abcdefrt", "a", "abcdefrt" };
    assertEquals(15, undohistory.minPresses(lines));
  }

  @Test
  public void case157() {
    String[] lines = { "a", "bbbbb", "b", "bbbbb" };
    assertEquals(16, undohistory.minPresses(lines));
  }

  @Test
  public void case158() {
    String[] lines = { "ab", "a", "abcdefgh", "abharhg", "abafsbiafhb", "aetobeagnea", "afbhadkbgfdka", "hdbjbhdjb", "djbhrudubhdu", "fbdjbvdj" };
    assertEquals(100, undohistory.minPresses(lines));
  }

  @Test
  public void case159() {
    String[] lines = { "abcd", "a", "abcde" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case160() {
    String[] lines = { "tomorrow", "topcoder", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyzabcdefghijk", "abcdefghijklmnopqrstuvwxyzabcdef", "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuv", "xyz", "aiueokakikukekosasisuseso", "aiueokakiku", "aiueokakiku", "aiueokakiku", "aiueokakiku", "a", "a", "a", "m", "m", "m", "aiueokakikukeko", "aiueoka", "aiueokakikukeko", "aiueo", "aiueo", "aiueokakikukekosasisuseso", "abcdefghijkomn", "kokokaradokokamadeittemiyoukanaatoomounndakedo", "kokokaradokafodsafoiasjdgoiajsdfjsdfjasoidfjasoifj", "aisdfjhaspghkjrehgjkewahjkfasdhkfjhasdjkfhasdlf", "aksdhfkjashdgiuhweufhsakjfhjkasdhfjahljkgfafjkasdf", "ifidhbfdjksfhsaljhdfkjladhsfjkdsahkfjhsdkjfasd", "hiasdhgiuwaheiufhuahfkjashjkfhasjkdghakjehfjwa", "lkjeahrlkgjhaskfhkajslhdfkjasdkjfhaskdjlfhkjasdhfk", "kashekfljhasjkhfakjwenfjkwebnjkfbnewjkbfjka", "kljawehgipuasdhgiuaekwheajflksafndsafdsfd", "aiuhpgaiwehjfoajwkelfjhkwahefjkalhdjkfhsdfasdf", "pasidhiadpsbjiajeiofjaiojhfkashdfsahdjkfahsdkjfh", "aiueokakikukekosasisusesotatitutetonaninuneo", "abcdefghjikoajeopifgjasdklfjasdlkfjkalsdfj", "askdfjksajdhfkjasdhfkjlhasdjkfhasdkjfhlkasjfhsad", "lasdkjhfkalsjdhfkjashdfkjlahsdjkfhaskjdlfhjaksdf", "lasdkjhflakshgjwhegipusahfglasdkhfgkjasdhf", "halsdhfjiaweihfuhawfhaskjljfhkjsdahfjkasdhfkjla", "klasdhfkjlasjhdfkljhwejlkghjklghadlskjhfjkaslhfas", "lasjkdhflkasjhgiauehfioauhfsakjfhaksjdhfkjasd", "haisdhgioaweuhfkawjehfkjasdhfklahsdjkflasd", "ibaeuhboiaeuhrgkajhdfkljashdfjkashdljfaskdfas", "hipbueahiobuhafhaklsjhfaskdjfhjasdkfsadjfha", "hlasijhefkjahkflahsjdfhalwkehfksahdjfalskdjhfa", "laskdhfakljehfipuwhefiouashfklasdjhfjkashdjfa", "liashgfoiasuhfashdfjkashdfkjlashdfkjlasdhfksdf" };
    assertEquals(1290, undohistory.minPresses(lines));
  }

  @Test
  public void case161() {
    String[] lines = { "babbb", "bbb", "aa", "aaa", "aba", "a", "b", "aa", "baa", "babba", "aabaa", "baaa", "aabaa", "b", "b", "bb", "abaa", "b", "abb", "abaaa", "abbb", "a", "a", "aa", "bb", "baa", "ababa", "abaab", "baa", "babab", "bbba", "a", "abab", "baaab", "a", "ab", "bb", "bb", "ab", "bab", "bb", "bbaab", "aaaa", "bba", "bbbb", "aba", "aabb", "b", "b", "a" };
    assertEquals(168, undohistory.minPresses(lines));
  }

  @Test
  public void case162() {
    String[] lines = { "abcd", "a", "abc" };
    assertEquals(11, undohistory.minPresses(lines));
  }

  @Test
  public void case163() {
    String[] lines = { "a", "ins", "remains", "s" };
    assertEquals(22, undohistory.minPresses(lines));
  }

  @Test
  public void case164() {
    String[] lines = { "abcabcabcabc", "abc", "abcabcabcabc" };
    assertEquals(19, undohistory.minPresses(lines));
  }

  @Test
  public void case165() {
    String[] lines = { "aaaa", "a", "aaaab" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case166() {
    String[] lines = { "baqdef", "a", "a", "b", "baqdef" };
    assertEquals(18, undohistory.minPresses(lines));
  }

  @Test
  public void case167() {
    String[] lines = { "aaaaaa", "a", "aaaaaa" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case168() {
    String[] lines = { "aaaaa", "a", "aaaaaaaaa" };
    assertEquals(16, undohistory.minPresses(lines));
  }

  @Test
  public void case169() {
    String[] lines = { "aaaaaaaa", "a", "aaaaaaaaaaaaaa" };
    assertEquals(21, undohistory.minPresses(lines));
  }

  @Test
  public void case170() {
    String[] lines = { "topcoder", "top", "topcoder" };
    assertEquals(15, undohistory.minPresses(lines));
  }

  @Test
  public void case171() {
    String[] lines = { "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx", "abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwx" };
    assertEquals(98, undohistory.minPresses(lines));
  }

  @Test
  public void case172() {
    String[] lines = { "aaaaa", "a", "aaaa" };
    assertEquals(12, undohistory.minPresses(lines));
  }

  @Test
  public void case173() {
    String[] lines = { "abcdef", "a", "abcdefgh", "abharhg", "abafsbiafhb", "aetobeagnea", "afbhadkbgfdka", "hdbjbhdjb", "djbhrudubhdu", "fbdjbvdj" };
    assertEquals(101, undohistory.minPresses(lines));
  }

  @Test
  public void case174() {
    String[] lines = { "abc", "abcd" };
    assertEquals(6, undohistory.minPresses(lines));
  }

  @Test
  public void case175() {
    String[] lines = { "aaaaaaaaaaaaaabbbaaa", "asdaa", "da", "aa", "aaaaaaaaaaaaaa" };
    assertEquals(39, undohistory.minPresses(lines));
  }

  @Test
  public void case176() {
    String[] lines = { "topcoder", "smalex", "topcodersmalex" };
    assertEquals(27, undohistory.minPresses(lines));
  }

  @Test
  public void case177() {
    String[] lines = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a" };
    assertEquals(13, undohistory.minPresses(lines));
  }

  @Test
  public void case178() {
    String[] lines = { "a", "ba", "aaa", "baaa", "aba", "baa", "baack", "aloha", "ba" };
    assertEquals(38, undohistory.minPresses(lines));
  }

  @Test
  public void case179() {
    String[] lines = { "abcd", "abcdefgh", "efghabc", "cdefgh", "abcdabcdabcd", "ghabcef", "abcef", "abcdabcdabcdfttttt", "ttttt", "tt", "ab", "abcd", "abcf", "abd", "abe", "hifeg", "asdfghjkl", "asdfghjkl", "a", "s", "d", "f", "jkhgf", "qerty", "ghdfh", "abcfgh" };
    assertEquals(155, undohistory.minPresses(lines));
  }

  @Test
  public void case180() {
    String[] lines = { "aaaaaa", "a", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaa", "aaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "bbb", "aaa", "bb", "aaaaaa", "bbbbbbbbbbbbb" };
    assertEquals(67, undohistory.minPresses(lines));
  }

  @Test
  public void case181() {
    String[] lines = { "abcdefghijk", "a", "abcdefghijklm" };
    assertEquals(20, undohistory.minPresses(lines));
  }

  @Test
  public void case182() {
    String[] lines = { "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa" };
    assertEquals(23, undohistory.minPresses(lines));
  }

  @Test
  public void case183() {
    String[] lines = { "a", "ab", "abac", "abacus", "aba", "abacuses" };
    assertEquals(18, undohistory.minPresses(lines));
  }

  @Test
  public void case184() {
    String[] lines = { "ab", "a", "abc" };
    assertEquals(9, undohistory.minPresses(lines));
  }

  @Test
  public void case185() {
    String[] lines = { "abcx", "abc" };
    assertEquals(8, undohistory.minPresses(lines));
  }

  @Test
  public void case186() {
    String[] lines = { "hossam", "hossam" };
    assertEquals(8, undohistory.minPresses(lines));
  }

  @Test
  public void case187() {
    String[] lines = { "asdfasdfasdfasdfasdfadsf", "asdfasdfasdfasdadsfsadfsda", "asdfasdfasdfasdf", "a", "asd", "asdf", "asdfasdfasdfasdfasdfasdf", "asdfasdfasdfasdfasdfasdf", "asdfasdfasdfasdfasdfasdfasdf", "aaaaassss", "asdfvvbbccmmklopiuytrd" };
    assertEquals(94, undohistory.minPresses(lines));
  }

  @Test
  public void case188() {
    String[] lines = { "abcdef", "abc", "abce", "abcd" };
    assertEquals(15, undohistory.minPresses(lines));
  }

  @Test
  public void case189() {
    String[] lines = { "aaaaaaaaaaaaaaa", "b", "aaaaaaaaaaaaaaa" };
    assertEquals(23, undohistory.minPresses(lines));
  }

  @Test
  public void case190() {
    String[] lines = { "ddddddddddddddddddddddd", "ddddddddddd", "dddddddddddd", "ddddddddddddddddddddddddddddd", "ddddddddddddddd", "ddddddddddddddddddddddddddd", "ddddddddddddddddddddddddd", "dddddddddddddddddddddddddddddddddddddddddddddddd", "ddddddddddddddddddddddddddd", "dddddddddd", "ddddddddddddddddddddddddddddddddddddd", "dddddddddddddddddddddddddddddd", "dddddddddddddd", "ddd", "dddddddddddddd", "ddddddddddddddddddddddddddddddddddddd", "dddddddddddddddddddddddddddddddddddddddddd", "dddddddddddddddd", "ddddddddddddddddddd", "ddddddddddddddddddddddddddd", "ddddddddddddddddddddddddd", "dddddddddddd", "ddddddddddddddddddddd", "dddddddddddddddddddddddd", "dddddddddddddddddddddddddddddddddddddddddd", "dddd", "ddddddddddddddddddddddddddddddddddddddddddd", "dddddddddddddddddddddddddddddddddddddddddddddd", "dddddd", "dddddddd", "dddddddddddddddddddddddddddddddddddddddddddd", "ddddddddddddddddddddddddddddddddddddddddddddddd" };
    assertEquals(141, undohistory.minPresses(lines));
  }

  @Test
  public void case191() {
    String[] lines = { "aab", "a", "aaaa", "aaa" };
    assertEquals(14, undohistory.minPresses(lines));
  }

  @Test
  public void case192() {
    String[] lines = { "ajkshfkjahsdfkhakfhakjdshfkajshfiwehifuahwkfuahskf", "aalsdjfaskdjflkajsdlfjalsdfjlasdjfklajdsklfjajlkds", "aasdjfksajdkfjalsdjfkhkasdhfkhaskdhfkahsdhfkasdfha", "kjahdfkjahsdjkfhjkasdhfjkahsdkhfkjahsdjkfhjkasdhhb", "bankkajsfkjsadkfjksljdkfajshdjkfhasdkjfhjkasdhfkjs", "alsflkjsdlkfjlkasjdflkjaslkdjflkasjdflajdslfjalsdj", "aksjdfkashdkfhakdsjhfjkasdhkfjahsdjkfhaksdhfkhasdf", "asjfdkhaskdjhfjklasdhflkjahdjkfhaskdjhfkajshdfkajh", "jhsadkjfhkajsdhflkashdfjkahsdkfahsdkjfhajksdhfkjad", "aksdjfkjahdskjfhadskjhfajkdshfkjahsdjkfhajksdhfkja", "aahsdkfjhaskdhfuiewnkfuawhfkasdhfjhasdjhfkajsdhkfa", "ahskjfdhaksjhdfkaskdhfjkhadskjfhajksdhfjkhadsjkfhj", "alshfkahsjdhfjkasdhfkjhasdjkhfjkahsdkjfhkajshdfjkh", "sdhkfjhauewhfuiewhfjkashdfjahsdjkfhajksdhfkjasdhhf", "sjdkjfhajksdhfjkahdsfjkhasjkdfhjkasdhfkjashdkjfhas", "akjshdfjkashdflkjahsdkjfhajksdhfkjashdfsajdhfklajs", "hfakjshdfjkahsdkfjhaksjdhfalsdkhfalkjsdhflaksjdhfa", "ashdfkjahdsfjkahsdkjhfakjsdhfjkahsdruwehfjkahsdkfh", "kjashkdjfhasjkdhfajkshdfjkahsdkjfhasdjkfhaksdhfaas", "ksajhfdjkahsdkfhalsdkjfhalkjdshfkjasdhfjkashdjkfhs", "ashfdjkahsdjkfhasjdkhfjadshjfkahsdfhajksdhfjasdfhd", "ajkshfkjahsdfkhakfhakjdshfkajshfiwehifuahwkfuahskf", "aalsdjfaskdjflkajsdlfjalsdfjlasdjfklajdsklfjajlkds", "aasdjfksajdkfjalsdjfkhkasdhfkhaskdhfkahsdhfkasdfha", "kjahdfkjahsdjkfhjkasdhfjkahsdkhfkjahsdjkfhjkasdhhb", "bankkajsfkjsadkfjksljdkfajshdjkfhasdkjfhjkasdhfkjs", "alsflkjsdlkfjlkasjdflkjaslkdjflkasjdflajdslfjalsdj", "aksjdfkashdkfhakdsjhfjkasdhkfjahsdjkfhaksdhfkhasdf", "asjfdkhaskdjhfjklasdhflkjahdjkfhaskdjhfkajshdfkajh", "jhsadkjfhkajsdhflkashdfjkahsdkfahsdkjfhajksdhfkjad", "aksdjfkjahdskjfhadskjhfajkdshfkjahsdjkfhajksdhfkja", "aahsdkfjhaskdhfuiewnkfuawhfkasdhfjhasdjhfkajsdhkfa", "ahskjfdhaksjhdfkaskdhfjkhadskjfhajksdhfjkhadsjkfhj", "alshfkahsjdhfjkasdhfkjhasdjkhfjkahsdkjfhkajshdfjkh", "sdhkfjhauewhfuiewhfjkashdfjahsdjkfhajksdhfkjasdhhf", "sjdkjfhajksdhfjkahdsfjkhasjkdfhjkasdhfkjashdkjfhas", "akjshdfjkashdflkjahsdkjfhajksdhfkjashdfsajdhfklajs", "hfakjshdfjkahsdkfjhaksjdhfalsdkhfalkjsdhflaksjdhfa", "ashdfkjahdsfjkahsdkjhfakjsdhfjkahsdruwehfjkahsdkfh", "kjashkdjfhasjkdhfajkshdfjkahsdkjfhasdjkfhaksdhfaas", "ksajhfdjkahsdkfhalsdkjfhalkjdshfkjasdhfjkashdjkfhs", "ashfdjkahsdjkfhasjdkhfjadshjfkahsdfhajksdhfjasdfhd", "ashfdjkahsdjkfhasjdkhfjadshjfkahsdfhajksdhfjasdfhd", "alshfkahsjdhfjkasdhfkjhasdjkhfjkahsdkjfhkajshdfjkh", "sdhkfjhauewhfuiewhfjkashdfjahsdjkfhajksdhfkjasdhhf", "sjdkjfhajksdhfjkahdsfjkhasjkdfhjkasdhfkjashdkjfhas", "akjshdfjkashdflkjahsdkjfhajksdhfkjashdfsajdhfklajs", "hfakjshdfjkahsdkfjhaksjdhfalsdkhfalkjsdhflaksjdhfa", "ashdfkjahdsfjkahsdkjhfakjsdhfjkahsdruwehfjkahsdkfh", "kjashkdjfhasjkdhfajkshdfjkahsdkjfhasdjkfhaksdhfaas" };
    assertEquals(1169, undohistory.minPresses(lines));
  }

}
