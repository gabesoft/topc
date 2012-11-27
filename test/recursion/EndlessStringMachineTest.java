package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class EndlessStringMachineTest {
  EndlessStringMachine endlessstringmachine = new EndlessStringMachine();

  @Test
  public void case1() {
    String input = "a";
    String program = "$meric$";
    int s = 6;
    int min = 1;
    int max = 35;
    assertEquals("americamericamericamericamericameri", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case2() {
    String input = "top";
    String program = "$coder";
    int s = 1;
    int min = 1;
    int max = 20;
    assertEquals("topcoder------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case3() {
    String input = "abc";
    String program = "$x$y$z$";
    int s = 10;
    int min = 30;
    int max = 50;
    assertEquals("bcyabcxabcyabczabczab", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case4() {
    String input = "a";
    String program = "$t";
    int s = 1000000000;
    int min = 999999950;
    int max = 1000000049;
    assertEquals("tttttttttttttttttttttttttttttttttttttttttttttttttttt------------------------------------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case5() {
    String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    String program = "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case6() {
    String input = "abcdebcdfghjklmpqstuwyzabcdefghijklmnopqrstuvwxvex";
    String program = "$$$$$$$$$$$$$$$$$$$$$$orian$$$$$$$$$$$$$$$$$$$$$$$";
    int s = 1000000000;
    int min = 1098;
    int max = 1105;
    assertEquals("vexorian", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case7() {
    String input = "a";
    String program = "$ts";
    int s = 1000000000;
    int min = 999999950;
    int max = 1000000049;
    assertEquals("tstststststststststststststststststststststststststststststststststststststststststststststststststs", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case8() {
    String input = "xy";
    String program = "$a$bb";
    int s = 12;
    int min = 5000;
    int max = 5099;
    assertEquals("xybbbbaxyaxybbaxyaxybbbbbbbbaxyaxybbaxyaxybbbbaxyaxybbaxyaxybbbbbbaxyaxybbaxyaxybbbbaxyaxybbaxyaxybb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case9() {
    String input = "quatbdjyhctrucozwpfegpwittbfdvyjaujscqu";
    String program = "$tgvm$jib$$e$gssbs$l$";
    int s = 512924604;
    int min = 641137502;
    int max = 641137567;
    assertEquals("squatbdjyhctrucozwpfegpwittbfdvyjaujscqutgvmquatbdjyhctrucozwpfegp", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case10() {
    String input = "buybqcrpkuxnvlzpzpdpchccglngla";
    String program = "$uyizbddfaqzfew";
    int s = 2004;
    int min = 8001;
    int max = 8100;
    assertEquals("bddfaqzfewuyizbddfaqzfewuyizbddfaqzfewuyizbddfaqzfewuyizbddfaqzfewuyizbddfaqzfewuyizbddfaqzfewuyizbd", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case11() {
    String input = "vowjhhwptisbderuqvcfb";
    String program = "$ehwnhh";
    int s = 314726292;
    int min = 274893044;
    int max = 274893048;
    assertEquals("hhehw", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case12() {
    String input = "fnuyqqsojyqdwspuvtruvgdisxtpvdxqoeoexxizhs";
    String program = "$ppppvtzfpelwcbvxccjltphahzzd$va$a$opp$hloqracma$q";
    int s = 27462792;
    int min = 448214932;
    int max = 448214977;
    assertEquals("xxizhsvafnuyqqsojyqdwspuvtruvgdisxtpvdxqoeoexx", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case13() {
    String input = "vmganhwpaavspdohdzwjxgwhfzhjamforjtnnijnvsapmztoli";
    String program = "$n$k$p$k$$r$$jv$";
    int s = 118393530;
    int min = 57852605;
    int max = 57852614;
    assertEquals("olikvmganh", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case14() {
    String input = "vefinillcjmzehcpajrwpaphcdjfrxkpjbpzwslkmkkj";
    String program = "$xwlzxojt$jn$$d$$$qxy$$$x$g$$qan$fb$$l$zpn$a$k";
    int s = 43206163;
    int min = 335735911;
    int max = 335736000;
    assertEquals("nillcjmzehcpajrwpaphcdjfrxkpjbpzwslkmkkjxvefinillcjmzehcpajrwpaphcdjfrxkpjbpzwslkmkkjgvefi", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case15() {
    String input = "tttttttt";
    String program = "$abcdz$";
    int s = 19574969;
    int min = 97874803;
    int max = 97874902;
    assertEquals("zttttttttabcdzttttttttabcdzttttttttabcdzttttttttabcdzttttttttabcdzttttttttabcdzttttttttabcdztttttttt", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case16() {
    String input = "afkxpjghkyzeullbqwgfbxkij";
    String program = "$$w$$wi$$";
    int s = 111144377;
    int min = 331790229;
    int max = 331790230;
    assertEquals("ki", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case17() {
    String input = "nodgglpzunlovgejcdqjfcajeanmqerjfp";
    String program = "$daumue$qlmwfmhf$gn$eyuaf$du$ng";
    int s = 337997483;
    int min = 249729207;
    int max = 249729299;
    assertEquals("fpdunodgglpzunlovgejcdqjfcajeanmqerjfpngdunodgglpzunlovgejcdqjfcajeanmqerjfpdaumuenodgglpzunl", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case18() {
    String input = "jxozvgpgljwqclzvcrzrkpjyrcfyclepnllafq";
    String program = "$k$zohhk$d$$$";
    int s = 346277697;
    int min = 685046137;
    int max = 685046192;
    assertEquals("rcfyclepnllafqzohhkjxozvgpgljwqclzvcrzrkpjyrcfyclepnllaf", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case19() {
    String input = "akuftfna";
    String program = "$r$";
    int s = 642399694;
    int min = 929437285;
    int max = 929437315;
    assertEquals("ftfnarakuftfnarakuftfnarakuftfn", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case20() {
    String input = "datpjtbtmmpfuvt";
    String program = "$wrqe$b$fhg";
    int s = 396576202;
    int min = 636820434;
    int max = 636820477;
    assertEquals("jtbtmmpfuvtbdatpjtbtmmpfuvtfhgwrqedatpjtbtmm", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case21() {
    String input = "dbsjccehwqizinmgibrfnd";
    String program = "$lxl$";
    int s = 45164931;
    int min = 955474361;
    int max = 955474363;
    assertEquals("izi", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case22() {
    String input = "zrfbtydjjfsorzqtaouaz";
    String program = "$u$rbhs$qiqevbc$cmykn$$bztjypmyzna$";
    int s = 72101555;
    int min = 362397496;
    int max = 362397518;
    assertEquals("ztjypmyznazrfbtydjjfsor", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case23() {
    String input = "su";
    String program = "$zblreofztn";
    int s = 146936686;
    int min = 233335696;
    int max = 233335764;
    assertEquals("reofztnzblreofztnzblreofztnzblreofztnzblreofztnzblreofztnzblreofztnzb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case24() {
    String input = "cwhqmgvaflqaclrebudlpmidohqitcxfbnbuuciwiqyhlqxt";
    String program = "$s$";
    int s = 41126053;
    int min = 41126003;
    int max = 41126102;
    assertEquals("flqaclrebudlpmidohqitcxfbnbuuciwiqyhlqxtscwhqmgvaflqaclrebudlpmidohqitcxfbnbuuciwiqyhlqxtscwhqmgvafl", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case25() {
    String input = "chgbgkrxcf";
    String program = "$rla$";
    int s = 405910860;
    int min = 2001407;
    int max = 2001423;
    assertEquals("gkrxcfrlachgbgkrx", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case26() {
    String input = "vvtjubqazxnhrcfqgrrdwamv";
    String program = "$$$$h$$p$p$v$$u$s$$a$v$$$iur$$ng$$a$$";
    int s = 428070;
    int min = 248906175;
    int max = 248906225;
    assertEquals("vvvtjubqazxnhrcfqgrrdwamviurvvtjubqazxnhrcfqgrrdwam", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case27() {
    String input = "fbjptbie";
    String program = "$eq$icxvien$pvyubpnw$vlqyayx";
    int s = 146766540;
    int min = 762257159;
    int max = 762257244;
    assertEquals("bieicxvienfbjptbiepvyubpnwfbjptbievlqyayxicxvienfbjptbieeqfbjptbieicxvienfbjptbiepvyub", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case28() {
    String input = "hbhpzyfryucj";
    String program = "$yh$bzx$oqgnsktukrsm$du$$fehpvjpru";
    int s = 198877039;
    int min = 119754170;
    int max = 119754224;
    assertEquals("rufehpvjpruyhhbhpzyfryucjyhhbhpzyfryucjbzxhbhpzyfryucjo", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case29() {
    String input = "xxx";
    String program = "$f$bu";
    int s = 371601051;
    int min = 263745671;
    int max = 263745748;
    assertEquals("xxxbufxxxfxxxbubufxxxfxxxbufxxxfxxxbububufxxxfxxxbufxxxfxxxbubufxxxfxxxbufxxxf", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case30() {
    String input = "grzdkowjqqnlfhowkhnvuzfueapsswabtjyszqlybgltbzoq";
    String program = "$ivf$$sagvobx$$";
    int s = 487719354;
    int min = 479561207;
    int max = 479561266;
    assertEquals("psswabtjyszqlybgltbzoqgrzdkowjqqnlfhowkhnvuzfueapsswabtjyszq", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case31() {
    String input = "xrvmwrnrenrivu";
    String program = "$dlcqqgmijmzmrgediew$zatltmtjhgvbbkyjudzwl$ksonbdl";
    int s = 91275704;
    int min = 9875138;
    int max = 9875140;
    assertEquals("mwr", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case32() {
    String input = "wuipegnnsrtpyolkcssqo";
    String program = "$wfgmuixftszccfrhhegol$vfmjqng";
    int s = 208282240;
    int min = 573052301;
    int max = 573052345;
    assertEquals("szccfrhhegolwuipegnnsrtpyolkcssqovfmjqngvfmjq", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case33() {
    String input = "xjjnxfqdipbspcktothqsffcyba";
    String program = "$xnnb$$$$h$yhd$$$e$jg$wq$";
    int s = 619124835;
    int min = 131133929;
    int max = 131133981;
    assertEquals("pcktothqsffcybaxjjnxfqdipbspcktothqsffcybaexjjnxfqdip", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case34() {
    String input = "dbvteesrkqaezgdvylvhwpetgdciqcooqqgfocyrrq";
    String program = "$$k$tk$$";
    int s = 133160218;
    int min = 268157829;
    int max = 268157832;
    assertEquals("focy", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case35() {
    String input = "mmztcngqmilksrlmb";
    String program = "$$$xspb$$pl$aq$";
    int s = 469263779;
    int min = 740829873;
    int max = 740829920;
    assertEquals("lksrlmbxspbmmztcngqmilksrlmbmmztcngqmilksrlmbplm", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case36() {
    String input = "ngzilwgymcvpxncriivdmwauewrctisoaoenecrufunoax";
    String program = "$x";
    int s = 661136806;
    int min = 694866288;
    int max = 694866300;
    assertEquals("-------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case37() {
    String input = "yvamcbp";
    String program = "$hhsd$sebz$ra$g";
    int s = 12453513;
    int min = 61763882;
    int max = 61763938;
    assertEquals("bpgrayvamcbphhsdyvamcbpsebzyvamcbprayvamcbpggsebzyvamcbph", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case38() {
    String input = "sjunsvjyymmskzahnya";
    String program = "$t$szaqj$$$sw$soejztay$as$zq$$t$$";
    int s = 442252855;
    int min = 956421180;
    int max = 956421212;
    assertEquals("junsvjyymmskzahnyaassjunsvjyymmsk", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case39() {
    String input = "zqjkvozlxshqkirclrsmrsasuuxnca";
    String program = "$exef$su$$$f$fi$xhi$l$g$wo$$etpmsvmg$g$q$ica$$j$a";
    int s = 554493711;
    int min = 722444847;
    int max = 722444929;
    assertEquals("ozlxshqkirclrsmrsasuuxncagzqjkvozlxshqkirclrsmrsasuuxncaqzqjkvozlxshqkirclrsmrsasuu", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case40() {
    String input = "shnmbyithnihiviixabnaighsqjetbevkfsokoyb";
    String program = "$$$wd$tijx$$y$jmxr$p$k$$$z$ejve$$$$hal$q$";
    int s = 2719802;
    int min = 57883827;
    int max = 57883868;
    assertEquals("etbevkfsokoybshnmbyithnihiviixabnaighsqjet", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case41() {
    String input = "fuqwgcejlyp";
    String program = "$npxowgku$zaztzbnabdtyrb$$poo$jo";
    int s = 274205225;
    int min = 264235996;
    int max = 264236019;
    assertEquals("ypfuqwgcejlyppoofuqwgcej", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case42() {
    String input = "hxkofhytkeofrwzlfofqpumhxqxxnksdjlrytsvtdzgukibuo";
    String program = "$toqxndkyunspzjtss$$m$$e$z$dje$$d$gqnl";
    int s = 440810858;
    int min = 161464725;
    int max = 161464777;
    assertEquals("hxkofhytkeofrwzlfofqpumhxqxxnksdjlrytsvtdzgukibuotoqx", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case43() {
    String input = "wfzrfkrvqmrbzrqruneutqstpmzhzpdnhysbyatmwbrqm";
    String program = "$j$$x$$x$$$b$o$my$$$r$m$$i$a$p$xs$$$$$$$rl$uip$$";
    int s = 7183025;
    int min = 260224684;
    int max = 260224749;
    assertEquals("hysbyatmwbrqmxswfzrfkrvqmrbzrqruneutqstpmzhzpdnhysbyatmwbrqmwfzrfk", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case44() {
    String input = "vgursdktbqqzv";
    String program = "$vadf$lmuztn";
    int s = 36282481;
    int min = 718267821;
    int max = 718267833;
    assertEquals("tbqqzvlmuztnl", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case45() {
    String input = "vrzkaspmcyhbtqjildwzwbaytfopsywtoibfigykn";
    String program = "$kdbcrhf$izngo$$eckrpncrrmhedolpptvgzogyfnloc";
    int s = 114077885;
    int min = 723761144;
    int max = 723761216;
    assertEquals("fnloceckrpncrrmhedolpptvgzogyfnlocvrzkaspmcyhbtqjildwzwbaytfopsywtoibfigy", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case46() {
    String input = "effqqwztzctbsmepaskjhxvuipzizlihgqdntbpklphkbiyaf";
    String program = "$ebbomiytm$$";
    int s = 59218958;
    int min = 92711613;
    int max = 92711671;
    assertEquals("biyafebbomiytmeffqqwztzctbsmepaskjhxvuipzizlihgqdntbpklphkb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case47() {
    String input = "iwvyjhxvshqlfugjzflcbrobuddedarbwmv";
    String program = "$wv$c$kxh$jqchrnjvrucscrfjinn$mm";
    int s = 52687514;
    int min = 937775560;
    int max = 937775597;
    assertEquals("wvyjhxvshqlfugjzflcbrobuddedarbwmvjqch", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case48() {
    String input = "rnykcmkxt";
    String program = "$e";
    int s = 41812842;
    int min = 608754893;
    int max = 608754912;
    assertEquals("--------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case49() {
    String input = "nqxtdkxvkmyvmuakzagsytx";
    String program = "$rxk$$";
    int s = 164910141;
    int min = 84608858;
    int max = 84608915;
    assertEquals("xvkmyvmuakzagsytxnqxtdkxvkmyvmuakzagsytxrxknqxtdkxvkmyvmua", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case50() {
    String input = "gupxmes";
    String program = "$xljmjzzivnkxit$lomnovihvvxktnb$ngxslkjenn";
    int s = 19874308;
    int min = 853172305;
    int max = 853172397;
    assertEquals("gupxmesxljmjzzivnkxitgupxmeslomnovihvvxktnbgupxmesngxslkjennngxslkjennxljmjzzivnkxitgupxmesxl", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case51() {
    String input = "emqkcmv";
    String program = "$nn$cr$gzw$yz$xm$$q$ez$k$dg$dx$$q$$$$e$";
    int s = 124161353;
    int min = 119544195;
    int max = 119544206;
    assertEquals("kcmvemqkcmve", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case52() {
    String input = "casxxzauvfrprieaahhfgrlelcquvuwvpauwkjpnqjkjxxur";
    String program = "$hexftknthylysopc$pjcl$cou$a$f$$";
    int s = 324056108;
    int min = 246440087;
    int max = 246440182;
    assertEquals("uvuwvpauwkjpnqjkjxxurhexftknthylysopccasxxzauvfrprieaahhfgrlelcquvuwvpauwkjpnqjkjxxurpjclcasxxza", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case53() {
    String input = "slhlquofwzambx";
    String program = "$oji$szpygshseusj$fflsf";
    int s = 232286688;
    int min = 612688400;
    int max = 612688465;
    assertEquals("zpygshseusjslhlquofwzambxojislhlquofwzambxszpygshseusjslhlquofwzam", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case54() {
    String input = "upcdixidgdurakrtegpbqhcvykxcwznwxou";
    String program = "$qw$j$$anu$zj$$g$";
    int s = 118685515;
    int min = 412291131;
    int max = 412291162;
    assertEquals("oujupcdixidgdurakrtegpbqhcvykxcw", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case55() {
    String input = "sjvzfvorqmjkvzgivqbpos";
    String program = "$vql$w$z$iadywcxk";
    int s = 7004727;
    int min = 291435907;
    int max = 291435985;
    assertEquals("fvorqmjkvzgivqbposvqlsjvzfvorqmjkvzgivqbposwsjvzfvorqmjkvzgivqbposzsjvzfvorqmjk", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case56() {
    String input = "gsyyjgouypvfngitvcaru";
    String program = "$y$jzwc";
    int s = 100683210;
    int min = 689394246;
    int max = 689394332;
    assertEquals("fngitvcarujzwcygsyyjgouypvfngitvcaruygsyyjgouypvfngitvcarujzwcjzwcjzwcjzwcjzwcygsyyjgou", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case57() {
    String input = "iegeaemeolzmblxuqokxifwdpavkeimlcbjljhildaz";
    String program = "$h$h$j$i$meh$$$d$twx$$$qllgs$$$j$vl$mf$";
    int s = 114237498;
    int min = 49455933;
    int max = 49455978;
    assertEquals("ljhildaziiegeaemeolzmblxuqokxifwdpavkeimlcbjlj", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case58() {
    String input = "ngjkbgaaisnsvvzfrdgqkalwodncgsansyvhydsfgfpzv";
    String program = "$uyivkv$iqsmblocajhumn$d$y$n$$";
    int s = 26907483;
    int min = 508534562;
    int max = 508534642;
    assertEquals("vvzfrdgqkalwodncgsansyvhydsfgfpzvuyivkvngjkbgaaisnsvvzfrdgqkalwodncgsansyvhydsfgf", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case59() {
    String input = "hzeg";
    String program = "$iasqzkcwc$bf$qzbveqzyzfmzrugm$rv$rjoaqvlpe";
    int s = 6;
    int min = 56010;
    int max = 56100;
    assertEquals("vlpeiasqzkcwchzegiasqzkcwchzegbfhzegqzbveqzyzfmzrugmhzegrvhzegrjoaqvlpeiasqzkcwchzegiasqzkc", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case60() {
    String input = "sxqcagqjcvcvjkifuhzxdrupvchpkhkmabcfbhpg";
    String program = "$acscb$b$xwd$pw$roxzjbqlacjy$smaij$cydxaicq";
    int s = 4;
    int min = 950460532;
    int max = 950460545;
    assertEquals("--------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case61() {
    String input = "irdekefwjuwskdgsz";
    String program = "$xrklt$r$syexslhz";
    int s = 10;
    int min = 818937081;
    int max = 818937113;
    assertEquals("---------------------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case62() {
    String input = "behsmmliepwqpzjdyfkndlcjpemzbdrjsweiifqa";
    String program = "$$$azle$ncilqfm$nvbxledf$$ll";
    int s = 7;
    int min = 443049036;
    int max = 443049130;
    assertEquals("-----------------------------------------------------------------------------------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case63() {
    String input = "cbjurminvctpdvvt";
    String program = "$$u$w$s$$r$$q$ere$$";
    int s = 8;
    int min = 856181291;
    int max = 856181311;
    assertEquals("minvctpdvvtqcbjurminv", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case64() {
    String input = "tcdxiakvobuavkuuhehdwdvbltjtpod";
    String program = "$epxvtfn$jo";
    int s = 1;
    int min = 239873201;
    int max = 239873278;
    assertEquals("------------------------------------------------------------------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case65() {
    String input = "xmljlgvgzzilvvkowiohnwogkjdrv";
    String program = "$vafx";
    int s = 3;
    int min = 933247544;
    int max = 933247602;
    assertEquals("-----------------------------------------------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case66() {
    String input = "sasg";
    String program = "$y$";
    int s = 2;
    int min = 595795817;
    int max = 595795818;
    assertEquals("--", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case67() {
    String input = "uegiwewijmrtccqfgthioysyoswvgcsivvrcsmvmr";
    String program = "$jbbcjfexzj$gqlnyfqbxk";
    int s = 6;
    int min = 278248690;
    int max = 278248699;
    assertEquals("----------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case68() {
    String input = "cnwu";
    String program = "$op$$$ajriv$$$w$$$tix$m$q$$chunp$$z$h$$irs$$$";
    int s = 9;
    int min = 668203837;
    int max = 668203853;
    assertEquals("cnwuhcnwucnwuirsc", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case69() {
    String input = "x";
    String program = "$y$yy$yyy";
    int s = 1000;
    int min = 1;
    int max = 100;
    assertEquals("xyxyyxyyyyxyxyyxyyyyyxyxyyxyyyyyyyxyxyyxyyyyxyxyyxyyyyyxyxyyxyyyyyyyyxyxyyxyyyyxyxyyxyyyyyxyxyyxyyyy", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case70() {
    String input = "x";
    String program = "$y$yy$yyy";
    int s = 1000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("yyxyyyyyyyyxyxyyxyyyyxyxyyxyyyyyxyxyyxyyyyyyyyyyyyyyxyxyyxyyyyxyxyyxyyyyyxyxyyxyyyyyyyxyxyyxyyyyxyxy", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case71() {
    String input = "x";
    String program = "$$r";
    int s = 2;
    int min = 1;
    int max = 20;
    assertEquals("xxrxxrr-------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case72() {
    String input = "x";
    String program = "$$r";
    int s = 1000000000;
    int min = 999999950;
    int max = 1000000049;
    assertEquals("rrrxxrxxrrxxrxxrrrxxrxxrrxxrxxrrrrrrrrxxrxxrrxxrxxrrrxxrxxrrxxrxxrrrrxxrxxrrxxrxxrrrxxrxxrrxxrxxrrrr", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case73() {
    String input = "a";
    String program = "$b$$c$$$d$$$$e$$$$$f";
    int s = 1000000000;
    int min = 1;
    int max = 100;
    assertEquals("abaacaaadaaaaeaaaaafbabaacaaadaaaaeaaaaafabaacaaadaaaaeaaaaafcabaacaaadaaaaeaaaaafabaacaaadaaaaeaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case74() {
    String input = "x";
    String program = "$$s";
    int s = 28;
    int min = 536870815;
    int max = 536870914;
    assertEquals("sxxsxxsssssxxsxxssxxsxxsssxxsxxssxxsxxssssxxsxxssxxsxxsssxxsxxssxxsxxssssssssssssssssssssssssssss---", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case75() {
    String input = "abc";
    String program = "$x$y$z$";
    int s = 999999999;
    int min = 999999900;
    int max = 999999999;
    assertEquals("zabcyabcxabcyabczabczabcxabcyabczabczabcxabcyabczabcxabcxabcyabczabcyabcxabcyabczabczabcxabcyabczabc", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case76() {
    String input = "asdf";
    String program = "$dagg$";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("gasdfdaggasdfdaggasdfdaggasdfdaggasdfdaggasdfdaggasdfdaggasdfdaggasdfdaggasdfdaggasdfdaggasdfdaggasd", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case77() {
    String input = "xy";
    String program = "$a$bb";
    int s = 999999999;
    int min = 500000;
    int max = 500099;
    assertEquals("xybbbbaxyaxybbaxyaxybbbbbbaxyaxybbaxyaxybbbbaxyaxybbaxyaxybbbbbbbbaxyaxybbaxyaxybbbbaxyaxybbaxyaxybb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case78() {
    String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    String program = "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case79() {
    String input = "a";
    String program = "$a";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("aa--------------------------------------------------------------------------------------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case80() {
    String input = "x";
    String program = "$a";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("aa--------------------------------------------------------------------------------------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case81() {
    String input = "xy";
    String program = "$a$bb";
    int s = 10000000;
    int min = 5000;
    int max = 5099;
    assertEquals("xybbbbaxyaxybbaxyaxybbbbbbbbaxyaxybbaxyaxybbbbaxyaxybbaxyaxybbbbbbaxyaxybbaxyaxybbbbaxyaxybbaxyaxybb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case82() {
    String input = "a";
    String program = "$a";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000001;
    assertEquals("aa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case83() {
    String input = "abcdefghijklmnopabcdefghijklmnop";
    String program = "$ffd$s$f$ss$$$ds$d$a$a$d$d$ad$a$$$";
    int s = 1000000000;
    int min = 500000000;
    int max = 500000099;
    assertEquals("dabcdefghijklmnopabcdefghijklmnopaabcdefghijklmnopabcdefghijklmnopabcdefghijklmnopabcdefghijklmnopab", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case84() {
    String input = "a";
    String program = "$meric$";
    int s = 100000000;
    int min = 1;
    int max = 35;
    assertEquals("americamericamericamericamericameri", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case85() {
    String input = "aasmdndytawetasndasdbjhazmhfbyfzeyurgfyzgfjygjyzeg";
    String program = "$mbas$dbashbamwyegdasmb$$llll$llsdkajdasjh$wqtrqwt";
    int s = 1000000000;
    int min = 777877777;
    int max = 777877875;
    assertEquals("gfyzgfjygjyzegmbasaasmdndytawetasndasdbjhazmhfbyfzeyurgfyzgfjygjyzegdbashbamwyegdasmbaasmdndytaweta", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case86() {
    String input = "acjdkfdjksgfmnfdsfhdsfdhsfdhs";
    String program = "$$$$$$$$f$$";
    int s = 100000000;
    int min = 1;
    int max = 100;
    assertEquals("acjdkfdjksgfmnfdsfhdsfdhsfdhsacjdkfdjksgfmnfdsfhdsfdhsfdhsacjdkfdjksgfmnfdsfhdsfdhsfdhsacjdkfdjksgfm", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case87() {
    String input = "xy";
    String program = "$a$bb";
    int s = 1000000000;
    int min = 500000000;
    int max = 500000099;
    assertEquals("bbaxyaxybbbbbbaxyaxybbaxyaxybbbbaxyaxybbaxyaxybbbbbbbbaxyaxybbaxyaxybbbbaxyaxybbaxyaxybbbbbbaxyaxybb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case88() {
    String input = "x";
    String program = "$w";
    int s = 1000000000;
    int min = 999999900;
    int max = 999999999;
    assertEquals("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case89() {
    String input = "a";
    String program = "$xyzxyz";
    int s = 10000000;
    int min = 999999999;
    int max = 1000000000;
    assertEquals("--", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case90() {
    String input = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstwxyz";
    String program = "$abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstw$";
    int s = 1000000000;
    int min = 500000000;
    int max = 500000099;
    assertEquals("qrstuvwxyzabcdefghijklmnopqrstwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstwabcdefghijklmnopqrs", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case91() {
    String input = "aaa";
    String program = "$a";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("aaaa------------------------------------------------------------------------------------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case92() {
    String input = "aaa";
    String program = "$$$$$$$$$aaaaaaaa";
    int s = 1000000000;
    int min = 1;
    int max = 100;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case93() {
    String input = "abcdefghghsdfsdadfghfdasdjhdsthiouiuiuydfsdfsdfsd";
    String program = "$a$bb$ab$abcd$sdsf";
    int s = 1000000000;
    int min = 5000;
    int max = 5099;
    assertEquals("sdfsdaabcdefghghsdfsdadfghfdasdjhdsthiouiuiuydfsdfsdfsdbbabcdefghghsdfsdadfghfdasdjhdsthiouiuiuydfsd", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case94() {
    String input = "ana";
    String program = "$u$x$lad$e";
    int s = 23446;
    int min = 45;
    int max = 67;
    assertEquals("axanaladanaeladanauanax", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case95() {
    String input = "n";
    String program = "$ac";
    int s = 888888888;
    int min = 777777777;
    int max = 777777789;
    assertEquals("cacacacacacac", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case96() {
    String input = "a";
    String program = "$ab";
    int s = 1000000000;
    int min = 100000000;
    int max = 100000098;
    assertEquals("abababababababababababababababababababababababababababababababababababababababababababababababababa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case97() {
    String input = "xy";
    String program = "$a$bb";
    int s = 9999999;
    int min = 5000;
    int max = 5099;
    assertEquals("xybbbbaxyaxybbaxyaxybbbbbbbbaxyaxybbaxyaxybbbbaxyaxybbaxyaxybbbbbbaxyaxybbaxyaxybbbbaxyaxybbaxyaxybb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case98() {
    String input = "x";
    String program = "$a";
    int s = 1000000000;
    int min = 999999990;
    int max = 999999999;
    assertEquals("aaaaaaaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case99() {
    String input = "a";
    String program = "$bcd";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("dbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcd", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case100() {
    String input = "top";
    String program = "$coder";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("odercodercodercodercodercodercodercodercodercodercodercodercodercodercodercodercodercodercodercoderc", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case101() {
    String input = "a";
    String program = "$qwe";
    int s = 333333363;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("eqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqwe---------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case102() {
    String input = "a";
    String program = "$alexfetisov";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("sovalexfetisovalexfetisovalexfetisovalexfetisovalexfetisovalexfetisovalexfetisovalexfetisovalexfetis", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case103() {
    String input = "a";
    String program = "$a";
    int s = 1000000000;
    int min = 999999900;
    int max = 999999999;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case104() {
    String input = "aaaaasassaaaasssssaaaaavvv";
    String program = "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$";
    int s = 99999999;
    int min = 50;
    int max = 100;
    assertEquals("vvvaaaaasassaaaasssssaaaaavvvaaaaasassaaaasssssaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case105() {
    String input = "kurerckurkurerckurkurerckurkurerckurkurerckurkur";
    String program = "$s$s$s$ss$s$s$$s$s$s$ss$s$s$$s$s$s$ss$s$s$ssssss";
    int s = 99898458;
    int min = 90000000;
    int max = 90000099;
    assertEquals("kurkurerckurkurerckurkurskurerckurkurerckurkurerckurkurerckurkurerckurkurkurerckurkurerckurkurerckur", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case106() {
    String input = "asdf";
    String program = "$a";
    int s = 1000000000;
    int min = 999999900;
    int max = 999999999;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case107() {
    String input = "xy";
    String program = "$a";
    int s = 10000000;
    int min = 1;
    int max = 99;
    assertEquals("xyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case108() {
    String input = "a";
    String program = "$a";
    int s = 1000000000;
    int min = 1;
    int max = 1;
    assertEquals("a", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case109() {
    String input = "lkdsajfksdjfalsdkfj";
    String program = "$$$$$$$$";
    int s = 1000000000;
    int min = 999999900;
    int max = 999999999;
    assertEquals("alsdkfjlkdsajfksdjfalsdkfjlkdsajfksdjfalsdkfjlkdsajfksdjfalsdkfjlkdsajfksdjfalsdkfjlkdsajfksdjfalsdk", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case110() {
    String input = "ljaslkdukashdfijhalksjdfhlkaushldfkadskjfhalskjgdl";
    String program = "$$ja$sklj$bk$a$djf$lbn$kl$jdfl$jash$l$kjha$dlkfjh$";
    int s = 987238978;
    int min = 897893749;
    int max = 897893848;
    assertEquals("fkadskjfhalskjgdldjfljaslkdukashdfijhalksjdfhlkaushldfkadskjfhalskjgdllbnljaslkdukashdfijhalksjdfhlk", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case111() {
    String input = "aghjksldghjksadgb";
    String program = "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$";
    int s = 500000000;
    int min = 400000000;
    int max = 400000080;
    assertEquals("sadgbaghjksldghjksadgbaghjksldghjksadgbaghjksldghjksadgbaghjksldghjksadgbaghjksld", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case112() {
    String input = "abcdef";
    String program = "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("defabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case113() {
    String input = "top";
    String program = "$coder";
    int s = 2;
    int min = 1;
    int max = 20;
    assertEquals("topcodercoder-------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case114() {
    String input = "a";
    String program = "$a";
    int s = 1000000000;
    int min = 999000000;
    int max = 999000099;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case115() {
    String input = "a";
    String program = "$b";
    int s = 1000000000;
    int min = 900000001;
    int max = 900000100;
    assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case116() {
    String input = "b";
    String program = "$c";
    int s = 10000000;
    int min = 9999999;
    int max = 10000098;
    assertEquals("ccc-------------------------------------------------------------------------------------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case117() {
    String input = "b";
    String program = "$a";
    int s = 200;
    int min = 1;
    int max = 100;
    assertEquals("baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case118() {
    String input = "a";
    String program = "$b";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000000;
    assertEquals("b", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case119() {
    String input = "abcffddgg";
    String program = "$bcdefghijklmnopqrstuvwxyz";
    int s = 39999999;
    int min = 999999910;
    int max = 1000000000;
    assertEquals("bcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyz----------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case120() {
    String input = "asdasdasdas";
    String program = "$$a$$$$$$$$$$$$$$$$$$$$$$$$$$$b";
    int s = 1000000000;
    int min = 1;
    int max = 100;
    assertEquals("asdasdasdasasdasdasdasaasdasdasdasasdasdasdasasdasdasdasasdasdasdasasdasdasdasasdasdasdasasdasdasdas", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case121() {
    String input = "x";
    String program = "$a";
    int s = 1000000000;
    int min = 999999900;
    int max = 999999999;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case122() {
    String input = "a";
    String program = "$meric$";
    int s = 1000000000;
    int min = 250000000;
    int max = 250000050;
    assertEquals("ricamericamericamericamericamericamericamericameric", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case123() {
    String input = "aa";
    String program = "$bb";
    int s = 1000000000;
    int min = 999999910;
    int max = 1000000000;
    assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case124() {
    String input = "a";
    String program = "$b";
    int s = 1000000000;
    int min = 999999900;
    int max = 999999999;
    assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case125() {
    String input = "a";
    String program = "$b";
    int s = 1000000000;
    int min = 990080000;
    int max = 990080099;
    assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case126() {
    String input = "a";
    String program = "$b";
    int s = 1000000000;
    int min = 1;
    int max = 100;
    assertEquals("abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case127() {
    String input = "a";
    String program = "$$";
    int s = 7;
    int min = 512;
    int max = 543;
    assertEquals("--------------------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case128() {
    String input = "top";
    String program = "$$coder";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000020;
    assertEquals("pcodertoptopcodercode", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case129() {
    String input = "a";
    String program = "$$";
    int s = 1000000000;
    int min = 1;
    int max = 1;
    assertEquals("a", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case130() {
    String input = "c";
    String program = "$a";
    int s = 1000000000;
    int min = 999999901;
    int max = 1000000000;
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case131() {
    String input = "aasdfasdfdfhfdghjdtrrlkdsajfksdjfalsdkfj";
    String program = "$$$$$$$$$$$$$$$$$$$$$$$$$$";
    int s = 1000000000;
    int min = 1;
    int max = 100;
    assertEquals("aasdfasdfdfhfdghjdtrrlkdsajfksdjfalsdkfjaasdfasdfdfhfdghjdtrrlkdsajfksdjfalsdkfjaasdfasdfdfhfdghjdtr", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case132() {
    String input = "a";
    String program = "$b";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("bb--------------------------------------------------------------------------------------------------", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case133() {
    String input = "aaaaaa";
    String program = "$bbbbb";
    int s = 1000000000;
    int min = 1000000000;
    int max = 1000000099;
    assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case134() {
    String input = "xy";
    String program = "$abbc";
    int s = 1000000000;
    int min = 1;
    int max = 100;
    assertEquals("xyabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcabbcab", endlessstringmachine.getFragment(input, program, s, min, max));
  }

  @Test
  public void case135() {
    String input = "ad";
    String program = "$b$";
    int s = 80;
    int min = 1000;
    int max = 1090;
    assertEquals("adbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadbadba", endlessstringmachine.getFragment(input, program, s, min, max));
  }

}
