package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PlayingCubesTest {
  PlayingCubes playingcubes = new PlayingCubes();

  @Test
  public void case1() {
    String[] cubes = { "ABCDEF", "DEFGHI", "OPQRST", "ZZZZZZ", "YYYYYY" };
    String[] words = { "CAT", "DOG", "PIZZA" };
    assertArrayEquals(new int[] { 1 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case2() {
    String[] cubes = { "ABCDEF", "DEFGHI", "OPQRST", "MNZLSA", "QEIOGH", "IARJGS" };
    String[] words = { "DOG", "CAT", "MOUSE", "BIRD", "CHICKEN", "PIG", "ANIMAL" };
    assertArrayEquals(new int[] { 0, 1, 3, 5 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case3() {
    String[] cubes = { "ABCDEF", "DEFGHI", "OPQRST", "ZZZZZZ", "YYYYYY" };
    String[] words = { "FOG", "DEFINE", "FORK", "YAHOO", "YAHO" };
    assertArrayEquals(new int[] { 0, 4 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case4() {
    String[] cubes = { "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA" };
    String[] words = { "AA", "AAA", "AAAA", "AAAAA", "AAAAAA" };
    assertArrayEquals(new int[] { 0, 1, 2 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case5() {
    String[] cubes = { "ABCDEF", "DEFGHI", "OPQRST", "ZZZZZZ", "ZZZZZZ" };
    String[] words = { "CAT", "DOG", "PIZZA" };
    assertArrayEquals(new int[] { 1, 2 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case6() {
    String[] cubes = { "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA" };
    String[] words = { "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB" };
    assertArrayEquals(new int[] {  }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case7() {
    String[] cubes = { "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA" };
    String[] words = { "AAAAAAAB", "AAAAAAAC", "AAAAAAAD", "AAAAAAAE", "AAAAAAAF", "AAAAAAAG", "AAAAAAAH", "AAAAAAAI", "AAAAAAAJ", "AAAAAAAK", "AAAAAAAL", "AAAAAAAM", "AAAAAAAN", "AAAAAAAO", "AAAAAAAP", "AAAAAAAQ", "AAAAAAAR", "AAAAAAAS", "AAAAAAAT", "AAAAAAAU", "AAAAAAAV", "AAAAAAAW", "AAAAAAAX", "AAAAAAAY", "AAAAAAAZ", "AAAAAAAB", "AAAAAAAC", "AAAAAAAD", "AAAAAAAE", "AAAAAAAF", "AAAAAAAG", "AAAAAAAH", "AAAAAAAI", "AAAAAAAJ", "AAAAAAAK", "AAAAAAAL", "AAAAAAAM", "AAAAAAAN", "AAAAAAAO", "AAAAAAAP", "AAAAAAAQ", "AAAAAAAR", "AAAAAAAS", "AAAAAAAT", "AAAAAAAU", "AAAAAAAV", "AAAAAAAW", "AAAAAAAX", "AAAAAAAY", "AAAAAAAZ" };
    assertArrayEquals(new int[] {  }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case8() {
    String[] cubes = { "UFSEKH", "CXPEUF", "RMLHJY", "ZPJDTG", "GEKMLZ", "CDCRCQ", "ZQJIFU", "EKJTAQ" };
    String[] words = { "YTOAKYN", "XCH", "WCKKNK", "NLZ", "OAW", "RLKOZVOO", "ZVGRJ", "SUKYESD", "SPGS", "YYFUGMML", "XA", "IVWE", "WMEI", "IHBO", "HQ", "ILYMBE", "ERR", "FAYSO", "YA", "FC", "FYTVGI", "RKIEA", "EATYCVI", "RVFNJMXI", "WBUKMSBP", "VFXAACR", "TU", "BI", "XSTAJZ", "YZRCXRMH", "HSEWF", "XPCRELF", "KAFDIYY", "BBEWT", "MQW", "GYCDOUHC", "ZEJNQ", "TL", "CD", "RRGB", "LEGS", "OBR", "PKK", "EIQRL", "SP", "TQISZNEE", "LWKSJKM", "EXEVGICN", "TP" };
    assertArrayEquals(new int[] { 1, 10, 14, 16, 18, 19, 21, 26, 28, 31, 37, 38, 40, 42, 43, 44, 48 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case9() {
    String[] cubes = { "WZBTDI", "GVAFGL" };
    String[] words = { "NNYCFS", "XTNI", "ZGTPPOO", "RV", "SNBWRH", "YKGZSUMZ", "NBT", "ZHYUXO", "KJVQZN", "AZ", "BISV", "FTZJOZPJ", "BFYCN", "NPMF", "EFIFXARM", "OWI", "IF", "WQDUK" };
    assertArrayEquals(new int[] { 9, 16 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case10() {
    String[] cubes = { "IHJLZS", "FNNIZN", "VGWFQS", "RPHCMZ", "SBIIQX" };
    String[] words = { "TQODSM", "DBXJ", "EI", "XQD", "SGNLNKUI", "THKY", "MDQY", "XDWGTTE", "CN", "NUNDVLZJ", "FXTDXQ", "RM", "AXALLUUG", "KOW", "GEMNW", "PBNNI", "NZMHAIOH", "YBL", "RLCLNQW", "OYTGGAE", "NVVA", "ZZI", "TA" };
    assertArrayEquals(new int[] { 8, 21 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case11() {
    String[] cubes = { "SNYJPX", "FOQXOE", "NLKXDJ" };
    String[] words = { "HTMMF", "XUXZZ", "IWKWWEUH", "RKORMFDN", "DDGTQES", "VDUGCAJ", "ZRIGBRQD", "RXDQAPYR", "QV", "DKZC", "XYCTLLMP", "DPF", "EXPYCQDO", "MWZCN", "JI", "UGPNANLJ", "TTSA", "RRYLTPK", "XVKNT", "NP", "DEXUY", "EBMLOOTE", "QMMJC", "WCFFEUFR" };
    assertArrayEquals(new int[] { 11, 19 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case12() {
    String[] cubes = { "MAJKUP", "KBVYIB", "CNKHOQ", "YNYPYE", "NWYZLW", "DAGQHP" };
    String[] words = { "TIOH", "PA", "AJDGGEO", "BQYSCN", "OVODPA", "FBHDGLNZ", "WOBSVY", "ZLPRXNM", "NGUCTLFR", "JUTWF", "IJIV", "NK", "ERGKEJ", "EOUCOIJ", "SDCSR" };
    assertArrayEquals(new int[] { 1, 11 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case13() {
    String[] cubes = { "GURDQR", "GSCTEG" };
    String[] words = { "SV", "BB", "CW", "MA", "CL", "IZ", "VD", "OM", "NM", "NS", "HK" };
    assertArrayEquals(new int[] {  }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case14() {
    String[] cubes = { "ZLTLDO", "MVAJUC", "FWUORC", "GBQAWZ", "FXIHHV", "PMJCLY", "WDWDQN", "YGXGCO" };
    String[] words = { "LTO", "QKNHPCX", "XQP", "QSRAOXG", "DC", "AV", "JMQQ", "NCNXCUBR", "FOGSANQ", "XGOOGE", "LLE", "AY", "JNXSHWE", "WSPR", "IDAIW", "SY", "MKAY", "IKAWL", "XAB", "LTJ", "KGUQRQOZ", "UUTGQTC", "JGKBHF", "NXKVSJ", "CDHUWNA", "OSTT", "ZNWQP", "UIDSF", "CIBHP", "KQTCGDYY", "NW", "BOMXK", "CWEGCOM", "HVQRGBRZ", "SLEXDGR", "CQYHMRN", "WWP", "QLGN", "YFKQREIT" };
    assertArrayEquals(new int[] { 0, 2, 4, 5, 6, 11, 18, 19, 24, 26, 30, 35, 36, 37 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case15() {
    String[] cubes = { "VKSGVJ", "TZVPFF", "IQKZNR", "NVKZLQ", "ZGGUMX", "LKVXKF", "ASAQKP", "FMUZJG" };
    String[] words = { "MBZB", "RMF", "HQBKBFG", "VILKTD", "NGCGM", "XMHU", "DFNSUL", "QZCZBQE", "YDOBBA", "RUC", "UOINLR", "GUXTMK", "JYA", "GU", "JRFVEQL", "JXX", "ZTC", "RSVQ", "BTYVICJ", "BTTXJTWE", "IDTOWO", "YEN", "BU", "AXB", "TWGMRM", "WT", "UD", "BBPHBLOH", "QWNPLRR", "QBIQPW", "CZIYAI", "GTAKXE", "PNMPTDT", "DPTEFPE", "UJC", "PDCRHNDN", "DIZA", "YCDXIPV", "TPDBN", "NN", "GMR", "JKQC" };
    assertArrayEquals(new int[] { 1, 11, 13, 15, 17, 39, 40 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case16() {
    String[] cubes = { "UOINEV", "TLTCAK", "EQFHIH", "VRSWDC" };
    String[] words = { "PGVZ", "ZC", "HM", "JKS", "JCL", "IG", "VOOJ", "AN", "KRB", "MHYZ", "AZ", "YYQV", "VA", "GH", "BOA", "DYK", "NN", "XYU", "QC" };
    assertArrayEquals(new int[] { 7, 12, 18 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case17() {
    String[] cubes = { "WAZVIL", "SRCCBE" };
    String[] words = { "JE", "IQ", "ZR", "YN", "TU", "CG", "DX", "CC", "HZ", "LI", "FR", "ZA", "RL", "NC", "ZF", "WO", "ZR", "QQ", "RA", "UF", "XM", "UI", "RM", "FV", "CS", "FC", "LU", "KR", "HU", "YV", "RI", "ND", "AJ", "LE", "UD", "WK", "UW", "QJ", "CF", "GO", "SN", "MY", "PJ", "EL", "OW", "QA" };
    assertArrayEquals(new int[] { 2, 12, 16, 18, 30, 33, 43 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case18() {
    String[] cubes = { "VWNIHQ", "BUXXLS" };
    String[] words = { "HD", "OK", "QA", "QI", "IQ", "IK", "ZM", "MB", "ZX", "VL", "AB", "LF", "CD", "US", "WW", "BW", "DH", "QZ", "QC", "OS", "WZ", "OM", "TY", "XG", "OR", "SS", "SA", "MW", "YT", "XN", "GO", "PD", "HU", "KG", "ZJ", "KL", "HU", "EC", "OC", "VH", "OI", "FD", "ED" };
    assertArrayEquals(new int[] { 9, 15, 29, 32, 36 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case19() {
    String[] cubes = { "LNKRQV", "GGYGWJ", "RVYUSQ" };
    String[] words = { "SY", "EM", "TZ", "PH", "MA", "VU", "ZCQ", "JG", "YP", "XKG", "IN", "GA", "XQW", "OU", "PE", "VB", "GI", "SKW", "TV", "WM", "JUB", "CN", "OG", "ZA", "LV", "UOY", "ROJ", "CV", "OI", "LJH", "DM", "IDM", "JLN", "AHR", "PM", "XE", "WFJ", "HU", "QR", "PFH", "OM", "HBG", "RQ", "YAI", "BA", "GF", "PHX", "PG", "RT", "TR" };
    assertArrayEquals(new int[] { 0, 5, 17, 24, 38, 42 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case20() {
    String[] cubes = { "PPRGUG", "KMONUV", "DNAXGS", "VDOJZZ", "FNXRMJ", "ASMXNF", "DBGRBL" };
    String[] words = { "KR", "VXTYTOP", "DQNN", "AUXM", "SACLLF", "XT", "RK", "JM", "EF", "ZSS", "YY", "YFUTW", "LG", "LRHRCO", "AEMRF", "CDYSAI", "YH", "VSE", "WAMEI", "KUDDAJB", "YIUHRSX", "UXYOPA", "CR", "KJFOMO", "JNLANY", "HUXTJUG", "WBCX", "HBHZX", "YTOYDRX", "MTND", "LSXAU", "QYFYC", "RABZVWK", "HEAIO", "IG", "IMOS", "CBYTCA", "PYVWJAN", "BVF", "LUHGHT", "WQSCYNP", "ZZYTU", "WGEY", "RRIMBY", "IM", "QHM", "ZQZTEZ", "SE", "WLHRB" };
    assertArrayEquals(new int[] { 0, 3, 6, 7, 9, 12, 19, 30, 38 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case21() {
    String[] cubes = { "DHHOOG", "BPRSQV", "XEEIHW", "CPDWHD", "OKOIVN", "PHERGR", "ZTVGTA" };
    String[] words = { "UIABMYX", "LS", "OEZ", "UWYFU", "ZAT", "NZODS", "YITRE", "HYBOX", "YTJX", "WSLZM", "IA", "CEGBK", "SFCXSHD", "GQTSDAW", "CP", "XUDX", "RN", "HTLZILV", "MBOMCVE", "XVUTB", "DXLP", "ZZTUAIO", "BSDWZ", "PGER", "DCRS", "NUCJULL", "HVSZ" };
    assertArrayEquals(new int[] { 2, 5, 10, 11, 14, 16, 23, 24, 26 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case22() {
    String[] cubes = { "XUVRCX", "ICHFQA", "NTZYLV", "TAHCVW", "ELXLUP" };
    String[] words = { "PFMX", "LCS", "KGGJP", "KOFR", "ET", "RSX", "UP", "ZZI", "NIXIF", "DPLOM", "TLOC", "IP", "IXMGS", "XZF", "HRNA", "YC", "SWOY", "WFQV", "BA", "LUI", "HSV", "NSAB", "OJ", "TTB", "SK", "YB", "DRSXV", "QSXZZ", "EOOX", "PNN", "ZPN", "HAWYF", "VYY" };
    assertArrayEquals(new int[] { 4, 6, 11, 13, 14, 15, 19 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case23() {
    String[] cubes = { "BBBBBB", "RABABA", "KARABA", "BABABA", "ABABAB", "ABABAB", "ABABAB", "ABABAB" };
    String[] words = { "BARABAKA", "BAR" };
    assertArrayEquals(new int[] { 0, 1 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case24() {
    String[] cubes = { "BBBBBB", "RAKABA", "BAKABA", "BABABA", "ABABAB", "ABABAB", "ABABAB", "ABABAB" };
    String[] words = { "BARABAKA", "BAR" };
    assertArrayEquals(new int[] { 0, 1 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case25() {
    String[] cubes = { "BABAAA", "AAAABA", "BBBBBB", "BBBBAB", "AABAAA", "ABABAB", "BAAAAB", "BAAAAA" };
    String[] words = { "BABBBBAA", "BBBBBBAA", "AAABABAA", "BBBAABAA", "AABBAAAA", "ABBBABBA", "AAABBBBA", "BABBBABB", "ABABBBBA", "ABAABABB", "AAABBAAA", "BABBBAAB", "ABBABBBA", "BBABAAAA", "BBBBABAA", "ABBAABBA", "ABABABBA", "ABAABABB", "BBBABBBB", "AAAAABBA", "AAAAABAA", "BBABBAAB", "BBBABABA", "BABAAAAA", "BABBABAB", "ABABBBBB", "BAABAABB", "ABBABBBB", "ABBBAABB", "BBABBABA", "BAAAAAAA", "BBBABBBB", "BABAAAAB", "AAABBBBB", "BBBAABAA", "ABAABAAB", "AAABAAAB", "BAABAABB", "BBABBBAA", "BBBABBAB", "ABABABBB", "BBBAABBB", "BBAABABA" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case26() {
    String[] cubes = { "AECFIC", "HAFGIG", "BBEIGH", "DECDBG" };
    String[] words = { "FEDJ", "BEJD", "HGJF", "FDGE", "HDHG", "EGCJ", "DHHD", "JGBB", "JCJC", "BGIG", "HFHB", "FAEC", "BEDE", "BFGE", "ECHJ", "IEFJ", "IGEH", "EDAH", "IJEJ", "EHED", "GCGH", "DJED", "CGAG", "CAHE", "DDAB", "EBCB", "CHCJ", "ADEH", "JBFD", "IECF", "HIHE", "FFBF", "AJJG", "GHFI", "GAFF", "BAGH", "AJII", "HDJC", "CFEJ" };
    assertArrayEquals(new int[] { 3, 9, 10, 11, 13, 16, 17, 19, 20, 22, 23, 27, 29, 30, 33, 35 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case27() {
    String[] cubes = { "ADHBJE", "FEGBAB", "AGGDBF", "CIFHKB", "CEEKED", "FCECBB", "DFIHKB" };
    String[] words = { "HCKGAKG", "AIJFBGI", "GDAGCDC", "DGBDFCI", "GFKCCDF", "CGKGEEJ", "JJKKBCH", "IFGCCIC", "KKIIGGG", "FBCBKCC", "AFHFIDA", "DIFIKFG", "KABGJBI", "JGDEEFC", "JIBJDCG", "GKBBIGH", "KBIIFHI", "JHFIEEG", "DGGJKAB", "GDAEIHG", "JJDCDIE", "EEGEBDI", "IJHGIKD", "HEGIGCI", "ACIHFHA", "KHIADJF", "IADFCEC", "AIAAAEA", "HEJHFDE", "GIHFIBG", "KFEAIII", "BBDFDGI", "JECEEJA", "EIGJFGD", "HHCDJED", "EHGAEDD", "DHGDKGI", "HHDFIFK", "HHAABGE", "ICIBKFK", "FKEBBJE" };
    assertArrayEquals(new int[] { 0, 2, 3, 4, 5, 9, 10, 11, 12, 13, 15, 17, 19, 21, 23, 24, 25, 26, 28, 31, 33, 34, 35, 37, 38, 40 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case28() {
    String[] cubes = { "XUIRSM", "SZAIXR", "TXXUGQ", "EMMQNP" };
    String[] words = { "AZFW", "MGOY", "KLCD", "PZIR", "MUMD", "HPLD", "HREH", "GCQL", "IQUM", "GZAL", "FGVL", "HUQE", "GJQN", "FLXC", "QATY", "PTIA", "EUUX", "EBFC", "DPIJ", "MXBS", "PCFP", "COWJ", "UOQS", "ABCT", "TKZX", "KBUD", "XMVA", "RKIW", "FGMG", "RYAC", "THCP", "BLCX", "DMHX", "FSUG", "GIXE", "DSNQ", "HSKG", "STFV", "BMOS" };
    assertArrayEquals(new int[] { 8, 15, 16, 34 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case29() {
    String[] cubes = { "CEEEKL", "ELIFJG", "BFFCIG" };
    String[] words = { "HED", "CFB", "CAF", "KGG", "JKI", "ECG", "FDD", "KFH", "LAH", "GLI", "JCG", "GGH", "EDL", "LDI", "FAJ", "JHC", "ADF", "CAL", "KHA", "FGJ", "JKF", "FGD", "KDL", "HII", "KIB", "ABL", "KKG", "HJG", "BKD", "KFJ", "GCD", "LAC", "KFC", "BGB", "GIF" };
    assertArrayEquals(new int[] { 1, 3, 4, 5, 9, 10, 20, 24, 29, 32 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case30() {
    String[] cubes = { "ILMGGQ", "TEIPQC", "GOPUON" };
    String[] words = { "VSC", "WEG", "KDH", "UDG", "TPC", "FAT", "IFP", "LBU", "ENE", "UII", "SJA", "WBL", "LDE", "RVP", "JQI", "IJF", "ONL", "FFI", "VAK", "HKN", "QIR", "OTF", "WOE", "KTU", "FBS", "CDL", "PHI", "MTP", "WII", "MPJ", "OOV", "GDR", "BPJ", "BSM", "DTL", "WQO" };
    assertArrayEquals(new int[] { 9, 27 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case31() {
    String[] cubes = { "BIJKHG", "ABFBFG", "BDLABK", "IHEHFB" };
    String[] words = { "GHKL", "FKBE", "GKKC", "LJDA", "EKGJ", "GDEH", "LEDF", "LBEC", "CICD", "DJBB", "DJLF", "EIHG", "CKBG", "KKEB", "CCAF", "GIEI", "GIFK", "FLJE", "EKFG", "FJDF", "JBBK", "CHAF", "JCCL", "JJIB", "CCJC", "EIFB", "BKDJ", "HJAL", "DCFH", "DCJE", "BJID", "JLBI", "DKBB", "DGKB", "DIBG", "EHAL", "KCJD", "IIBI", "BKKJ", "FBKB", "IFFK", "KDHL", "FILK", "KEFG", "BHGJ" };
    assertArrayEquals(new int[] { 0, 1, 4, 5, 9, 13, 16, 17, 18, 19, 20, 25, 27, 30, 31, 32, 33, 34, 35, 39, 40, 42, 43, 44 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case32() {
    String[] cubes = { "BABCCC", "ACBABA", "BABCCA", "BACBAC", "BCBCBB", "BAABBA", "CBCCAB" };
    String[] words = { "BAACCCB", "BBAACBA", "BBACABC", "ABCAABC", "CBCBBAA", "BABCCCB", "AACACCC", "BACAAAB", "ACCBCCB", "CAAAAAA", "BAACBBC", "CCAACBB", "CAABCBB", "ABACBBB", "CCABBAA", "ACABBAB", "CBCBCCC", "BACACBA", "CBCCACA", "CBACAAB", "BACABCA", "CACCABB", "ABCACBB", "BCCACAB", "BBAABBB", "ACCBBAA", "ACABBBA", "BBAAABC", "BCCBBCB", "CCBABBB", "CAABCAA", "BBCABAB", "ABACCAC", "CABBACC", "CCCBACA", "CACCBCB", "ABABBAC", "CABCABB", "BBACCBC", "CCCCCAA", "ACABBBC", "BBACBBC" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case33() {
    String[] cubes = { "EWTAKT", "SHHCSK", "WNHHBV", "FTRHIW", "APUOAJ", "SUBWIU", "HVIWMT" };
    String[] words = { "ASQVERP", "COJNHBM", "RGLMLDW", "DNHMEMA", "ICRNGBG", "HDGULIB", "SKPFVIW", "JFULDPL", "URIWUWP", "PFKKKFT", "NJBKAVA", "LVTAPMD", "UUNLAAS", "GADSFKV", "MURNBPU", "IMUDKAV", "RDRFOET", "KCGIJDD", "WIQLPCU", "CSELRPH", "GTLOBGV", "KINLRNI", "QBJGQTV", "SCOLCRK", "CSISLRC", "FQOLEDO", "NIKVJQP", "DKMVLHU", "LITSJLE", "GIACPAG", "ACSEVRV", "EUJBPSE", "FLFTLDP", "PNOLPMR", "DGQDPMV", "SFVIOFG", "BEKOBMI", "NWLSWNN", "TEPIORC", "NSSHNUN", "NFGABGP", "VEGWGEC", "CNHIVCQ", "PTUUDQV", "ASHLHEK", "SWFEWEA", "DEPAERL", "LWBPQKD", "QATGROO", "GIDEOFO" };
    assertArrayEquals(new int[] { 6, 30, 36 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case34() {
    String[] cubes = { "LNDJNK", "EJPHEJ", "CIORMR", "QNGEEC", "QGEMKC", "CPKDQD", "OMJQPI" };
    String[] words = { "NJODFFA", "QMMIMEQ", "OACBBGB", "EAPOLKK", "BAHMNFG", "HCDNIIH", "EEHMKBI", "GENQACD", "OQCMIKO", "IBAJECM", "HKMPMME", "BPOEENN", "GGIBMEP", "HNQCBMP", "JLIKEKB", "IDEJKRI", "BRPEHLB", "CGMIAQK", "KHRBNGD", "OIOPGKD", "GIKHHIA", "IAHJDEH", "CPBQNLQ", "EEPFBCJ", "PILLPNA", "JIPAEEL", "GMNRJEK", "EDAPNIB", "APBJMOC", "GFFIFLM", "AEHFLJM", "KIKLHKE", "IIJHHGN", "NEGKBNB", "NQCDBQL", "PHOHHHB", "DJREHRP", "NBDLODO", "CBHIHGH", "MPQMOML", "GJGOOLJ", "JGELHAR", "JCFQMGQ", "QPHMRAA", "FLAEGIP" };
    assertArrayEquals(new int[] { 10, 26 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case35() {
    String[] cubes = { "PSQBCH", "AEQIHL", "FMOHEE", "NSTHPS", "TTPOSG", "IPLCGE" };
    String[] words = { "MAKJTM", "FMELJE", "RMIIAS", "GBISMN", "QTKESA", "COBFPL", "EPGFNH", "RGSPTQ", "HGFLCS", "NGCRJD", "QREGFH", "SJLBCP", "PEHRNH", "BQMJHK", "CDIMNM", "TRRPRK", "DEKQAQ", "BBEBQT", "PSMQLR", "TQQIJO", "THKEQJ", "AGISOH", "LDFADC", "CCDSSE", "FJCTQB", "NBLGQP", "MLBHTN", "TKASMC", "MHPJRT", "PJJBGO", "DSHQSF", "MSMBAD", "PDDFAB", "FBMADJ", "RHBOHO", "JSIETH", "SJPKFQ", "GQHGNB", "OBMAJC", "MEQQKD", "TPCCDJ", "RGNILB", "RHSKAR", "NJGRGE", "JQQQIF", "BAKMNS", "IQSBKE", "GJHOQP" };
    assertArrayEquals(new int[] { 3, 5, 6, 8, 21, 26, 37 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case36() {
    String[] cubes = { "CBJBXN", "ZUYAIR", "OSYORJ", "WSYENG", "ZHQBBA", "ZWZKBB", "OVBQXS" };
    String[] words = { "ASYFFCG", "WNQTTNZ", "XDRVVYQ", "YYSIMQK", "CMDMXCG", "HUOINKX", "NGOUTJB", "KQIBCVP", "UKGOOMF", "EWYDNFI", "NNUDHCH", "XPZTEGK", "QVYQOIX", "FXSXAHR", "JIEZTMW", "EMYCXSV", "FIEVTTZ", "ETGEJNU", "XCMRPZL", "WNFOLVP", "UUGNTYL", "THYEBEP", "KYJONOE", "KNEOMBG", "ASAZAMP", "QPQOWGB", "PZHSNQC", "ZUWAXLX", "BWXLGLD", "GGKOBSM", "NQMVANW", "HGSAVJP", "IHMNVMQ", "KQEHIEJ", "UIQIWUK", "MFQCALD", "EDOTCOP", "RJSBVON", "KCPVDJK", "QQDNMBW", "RQOWDPB", "YLWVBFT", "SSLKBLW", "QYTDZIR", "VUOXGMU", "NHANXGG", "UHFXNMX", "WVVBFZJ" };
    assertArrayEquals(new int[] {  }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case37() {
    String[] cubes = { "FGBAGB", "DBCCCG", "ACGGFA", "BGDCFA", "BAECDA", "DAFDEF", "CDBAAC", "FDEDBE" };
    String[] words = { "DCADDFCC", "GAAGACDF", "DDCBGCEF", "GFGDBCGC", "ABEGDDBD", "BAAAFCFF", "CFDCDGEA", "CGEEAGAC", "FDCCEEEE", "CBBDACFD", "FBEEGBGD", "GCEBEAFA", "DDFFDFDE", "BFEAEACA", "DGEEDFGE", "GCAEDADG", "CFFFEBBB", "GBFGAEDC", "BFDDCCAD", "CFGFEBAA", "EGGDEBGC", "CFGFBFAD", "DGDBEEAG", "FBCCGCGF", "AFAGEAGF", "FAEDADEB", "AAAGFGBB", "EABEGGGB", "ACEGCBDD", "BAGAFFEE", "ECEDFGAE" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case38() {
    String[] cubes = { "PELIAI", "LJJDHB", "LNIDEP", "LECOIO", "FBCIIQ", "ODFCDE", "CJBMEH" };
    String[] words = { "BKLDCOC", "CJCOQFC", "LQLHKIK", "GPCMBBC", "KBANNEP", "MKIMNHI", "QMGGLDH", "EQEALNF", "QHHLLEE", "QMBAPGH", "NKMKQFJ", "GFKNMIF", "NJJNJGI", "BBEANEO", "DLFFEIP", "GBIOOHM", "PJCJCPO", "EEEQQJB", "QAGINQQ", "QJBBACF", "QGNFJBF", "MJQQEKJ", "ODOEFIF", "MJEDPQL", "FPNPIKG", "JHGPKNM", "CAHDOPO", "QOCIDHE", "CJQIDDD", "FEMMCPO", "GIENMJF", "JQPDHLK", "EIQKJAH", "GLGNLLH", "IMKKCNL", "MGDBBPN", "NQAPBLD", "BKINIIB", "CJKDFKP", "IKJADAG", "EEMPOGB", "LDPMLKD", "FCIFKKC" };
    assertArrayEquals(new int[] { 7, 8, 13, 14, 16, 23, 26, 27, 28 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case39() {
    String[] cubes = { "GFMKKE", "FFHHBH", "GKMDJH", "FIJHBL", "CBKCKM", "DADGFH", "LFIJCJ" };
    String[] words = { "JBKJHHK", "HHMKKLC", "FJJGDAH", "FMHBKJL", "BDBMBIE", "MIGCFHJ", "KCMAIEE", "HFBGHME", "KHGBKLL", "IAMIBEG", "GLLJHGE", "IMGMFFC", "JALKMJC", "LHJFJBK", "MGJMIAF", "JFIACJJ", "JDKKCKK", "JAKIEHM", "IGMMCCC", "DMCIBCI", "JABFFCB", "MIIMLGB", "LHHDCLH", "JAKGGDB", "DBJGEFD", "LJIAAJA", "EHJJIMK", "MLJIHJL", "HEBGFMJ", "HAKLMIG", "KCDKMFB", "CJHLACI" };
    assertArrayEquals(new int[] { 0, 1, 3, 4, 5, 7, 8, 9, 11, 13, 14, 17, 20, 28, 29, 30 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case40() {
    String[] cubes = { "EGJFDB", "AFDCEA", "AKJIKE", "CGGJIB", "BCDEHF", "BJKEFF", "FBJFBE" };
    String[] words = { "EAEJFCA", "FFAHBJE", "DIHGFDK", "IBGEGED", "FDBALGF", "AJKKCKL", "LBEDGFL", "CJFCKGL", "FDDDKAD", "IHELBBK", "FKFKBBB", "BHBHBGC", "DHELEHL", "GLICIAB", "KGDBKBI", "EDDIHJI", "BIEGCED", "FALJICH", "LGHCHCG", "HEIFBLF", "DEACIKH", "KJHAIKK", "DCCCIEG", "JJKLJHB", "DFBGIII", "IFHIBGK", "BFFIDDA", "ILJDEAE", "ABLCGJH", "HCICFCA", "FLBFIGI", "BIDKFAC" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 10, 14, 15, 16, 20, 25, 26, 31 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case41() {
    String[] cubes = { "CACDBB", "DDADDB", "DBBBDB" };
    String[] words = { "CBB", "AAC", "CBC", "CAB", "ACB", "BDA", "DAC", "BBC", "BAD", "CBC", "BBB", "ADB", "DAA", "DAA", "DBA", "BAB", "DBB", "ADB", "CAD", "AAD", "CDD", "BCD", "ACB", "CAB", "DCD", "CCA", "CCB", "CBB", "CBB", "DAB", "DAB", "AAC", "BCD", "DBA", "CAB", "ABD", "DDB", "CBD", "DCD", "CDC", "DBB", "BDB", "DDC", "CAA", "ACD", "DBD", "CBC", "CAD", "ABD", "ADC" };
    assertArrayEquals(new int[] { 0, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 40, 41, 42, 44, 45, 47, 48, 49 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case42() {
    String[] cubes = { "BICBLL", "HMMGNM", "CEFOOD", "CBGHKM", "EFLGGI", "DMMPHP" };
    String[] words = { "CJNJOH", "MAJDFH", "OPMNME", "LCGOAP", "EOLMPG", "BIJAMF", "CIIJEN", "IOIEPD", "PEHJKL", "OGCIEG", "BPOFHJ", "GGGBIP", "GIGLCB", "FGIGPE", "NBPLHE", "IFCCOP", "MDKMJE", "LDPEAM", "KJPHJJ", "BFABDN", "EBHJCO", "BGJOLI", "LABDPC", "FDCJMF", "CNPMBJ", "LNIPCC", "CDILML", "GJMFKB", "HBFPJC", "MABCIH", "CLGJEP", "IBABBN", "IJNPME", "HNGBBB", "PFPJII", "MICGED", "GAJFOI", "OMKIPK", "MLHFMD", "HHFBGP", "GAMOCL", "GKACFO", "LJPJDI", "MLLMKL", "JFJDKH", "ACLJHJ" };
    assertArrayEquals(new int[] { 4, 13, 14, 25, 35, 38, 39 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case43() {
    String[] cubes = { "CQHPPT", "HQNSMC", "MACFLK", "SABTMG", "TPCBRD", "VUFCKD", "KTNIID", "FCJUDN" };
    String[] words = { "JVUUMHJV", "PMBRTUGJ", "SGFNNMIE", "PIHAFUKP", "GKDIQLPT", "ACIFCEOJ", "BBQOHNPS", "PLABQPHG", "ROQAMTIC", "RUDGDTFP", "MRBUDGHL", "BFTJJHPT", "SNFQQLCO", "LRKUUPUT", "DFMSIBCA", "GAUBOCAM", "DLUOSFNG", "NVIDGFBA", "TOUHQPJB", "MEVCMIJO", "RIGRFEOM", "QRTALGCF", "CEKFBNKK", "VSDPURSQ", "RAVPSFIP", "FONILGTA", "JPGBEBGK", "QHDVIRIO", "DSCIMVCQ", "GDNREDJB", "LKQDSKVI", "KCOUGVAV", "COSMHORV", "GTIPQGLT", "OCKLHMNS", "FBSHRRGA", "AVPLVUAG", "SJBPFMNB", "UVTATHSH", "PEHCOICT", "DJTLBCCC", "GGLBGJAN", "NPADJKCH", "LHUMLCFS", "VOVJRSNI", "GMNMKFQF", "VPRECADI" };
    assertArrayEquals(new int[] { 3, 4, 14, 28, 37, 38, 40, 42 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case44() {
    String[] cubes = { "XXXXXA", "XXXXXA", "XXXXXA", "XXXXXA", "XXXXXA", "XXXXXA", "XXXXXA", "XXXXXA" };
    String[] words = { "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB", "AAAAAAAB" };
    assertArrayEquals(new int[] {  }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case45() {
    String[] cubes = { "NCQJSJ", "PGLBAN", "LBIFJO", "UZHVAD", "RJNTUD", "SNNIJL", "JUGJII" };
    String[] words = { "ZJ", "EABPLLWR", "LIIJKJ", "GVLVWTB", "XB", "ZXQ", "MWTZC", "BQJF", "MTHO", "VMH", "BAEM", "AQQGZI", "FUD", "ZOPIZ", "WYZW", "VS", "WROS", "VSUHLDIC", "OFBO", "QS", "VLL", "EXNFWV", "MKPCGUQ", "UIRQOF", "HN", "BWVNKXX", "JCYSF", "QVZYML", "CXUJ", "NVQWCTUL", "YKT", "FRYSQ", "NEA", "JOZGLKW", "LBIKHD", "WFVKBZZY", "TEWGZOM", "ZASJ", "HGI", "QIF", "TJKOKY", "SKXAGP", "ZBW", "MVQXLIP", "JZDYLK", "LE", "WKLJOSU", "FVIQZ", "RDL" };
    assertArrayEquals(new int[] { 0, 7, 12, 15, 19, 20, 24, 37, 38, 39, 48 }, playingcubes.composeWords(cubes, words));
  }

  @Test
  public void case46() {
    String[] cubes = { "ABCDEF", "ABCDEF", "ABCDEF", "ABCDEF", "ABCDEF", "ABCDEF", "ABCDEF", "ABCDEF" };
    String[] words = { "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB", "ABCDEFAB" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 }, playingcubes.composeWords(cubes, words));
  }

}
