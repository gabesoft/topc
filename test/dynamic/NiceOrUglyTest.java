package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class NiceOrUglyTest {
  NiceOrUgly niceorugly = new NiceOrUgly();

  @Test
  public void case1() {
    String s = "HELLOWORLD";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case2() {
    String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case3() {
    String s = "HELLOW?RLD";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case4() {
    String s = "H??LOWOR??";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case5() {
    String s = "EE?FFFF";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case6() {
    String s = "?";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case7() {
    String s = "??";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case8() {
    String s = "???";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case9() {
    String s = "????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case10() {
    String s = "?????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case11() {
    String s = "??????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case12() {
    String s = "IE?LPS?E?QCL?I?VRV?A?MPD?I?BHR?O?SFJ?E?MFG?I?CHYW";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case13() {
    String s = "EI?RQQ?A?WWQ?I?QRQ?A?QRQ?I?WQR?A?RWR?E?WQR?E?QRR";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case14() {
    String s = "O?ZPB?I?FXR?I?QCL?E?NHJ?O?MQM?O?MWX?E?CYY?A?GCGL";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case15() {
    String s = "AA?QQQ?A?QQQ?A?QQQ?A??QQQ?A?QQQ?A?QQQ?A?QQQ?A?QQQQ";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case16() {
    String s = "IU?QQQ?E?QQQ?O?QQQ?AI??QQQ?U?QQQ?O?QQQ?I?QQQQ";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case17() {
    String s = "AA?ZPC?A?LSQ?A?RQG?A??YHQT??A?CCL?A?HLG?A?FFTW";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case18() {
    String s = "IO?TJH?O?XWL?U?JDT?A???MRBC??O?GWY?E??WKLJ?U?JBRK";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case19() {
    String s = "UU?ZRG?A?MJY?I?CLY?A?J?J?E?ZSZ?A?SMB?U?DFT?A?NQBF";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case20() {
    String s = "EA??TRGF??AA??FTQT??IA??GGTD??IE??GPDR??EI??QYSG";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case21() {
    String s = "AI??FRQP??IE??SFRQ??OI?SYTT??OA??PPPG??EA??SPPY";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case22() {
    String s = "AI??VQNY??OO??BVWN??EE??XNZG?AO??ZFSR??IO??SCBL";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case23() {
    String s = "EU??LXKTHS??A?TQV?U?DKT?O?QSL?I?FKJ?A?JKH?I?FSHM";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case24() {
    String s = "OE??NDJC??I?SZP?EAIAU?QKW?E?PMT?U?JNC?A?NGF?U?DFFG";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case25() {
    String s = "??????????????????????????????????????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case26() {
    String s = "?????????????????????UAU??????????????????????????";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case27() {
    String s = "?????????????????????AA?FVH?UE????????????????????";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case28() {
    String s = "???FZX???????????????????????????????????EU???????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case29() {
    String s = "?????SGCFN???????????ERI??????????????????????????";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case30() {
    String s = "?????????????????????ME?JQY?IE????????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case31() {
    String s = "???QQQQ?A?QQQ?A?QQQQ?A?QQQ?A?QQQQ?A?QQQ?A?QQQQA?AA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case32() {
    String s = "T?A?QTWY?A?TT?A?TSWS?A?RF?A?YPGS?A?WS?A?PWGR";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case33() {
    String s = "A?Q?QQQQ?O?QQQ??A?QQQQ?E?QQQ??QQQQ?A?QQQ??I?QQQQ";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case34() {
    String s = "??W???I?QQQ?E?QWR?A?WQRQ?E?RQQ??RQQW?I?QQW?A?RWQ";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case35() {
    String s = "??R?OT??HU?L?IS??ZO?G?UW??WE?C?UN??FO?K?OV??NO?P??";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case36() {
    String s = "??J?ID??QA?Z?OF??KI?D?ES???OKM?EH??ZI?R?UB??HE?J??";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case37() {
    String s = "??Q?AQ??QA?Q?AQ???QA?QAQ??QA?Q?AQ??QA?Q?AQ??QA?Q??";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case38() {
    String s = "?IJ?EM??NEBG?AS?ESA?NTAX?KIENW?EWEEYK?WIIRF?SA?WC?";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case39() {
    String s = "OQUQIQIQEQAQOQEQAQUQIQIQUQIQEQAQAQIQOQAQAQUQIQOQOQ";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case40() {
    String s = "QEVUPAQIYATEKOCAPAVAFOSUXAXAPILAFUSAFUWOKACENINUXE";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case41() {
    String s = "RAJAFAVUXEPUTAGOFIKDDP?IITZIPONOXEXOXEXIPAREWIHEYU";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case42() {
    String s = "APYYWWTIYAI?TYEPTRQQU?EUAWYEOTE";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case43() {
    String s = "?S???P??PDP?????A????????A?F?G???A???F?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case44() {
    String s = "I??R?E?R?EIA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case45() {
    String s = "?Q?WG?WY???RWO??SAIDG??WQIGD???PTPA???A?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case46() {
    String s = "?EJXC";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case47() {
    String s = "GXAIAEIESEAXTAXJHC";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case48() {
    String s = "?LLKYXRW?LZDRSDQS";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case49() {
    String s = "WQWWQ???AA???R?TA?";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case50() {
    String s = "YHEO?I??A?XE??SE????WXAIAR??????????AA?????A????I";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case51() {
    String s = "QQQQQQQQQQQQQQ?QQQQA?QQQQEQQQQQQQQQQQQAQEQ?Q?QAQQ";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case52() {
    String s = "EEEIEAEIIWAIITQYQPPAAAEAIYDQEIIETAAY";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case53() {
    String s = "???E?VG?AORI?E?NIA?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case54() {
    String s = "?YR??????????QT?Q?WT?YQRW??IQ??TQR?QRRR?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case55() {
    String s = "W?AAFA?EDHSTQWEEEAEEAAEA?AEE";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case56() {
    String s = "ES?S?G?QP?QFGW???W?OFW?RTD?R?S?DRFD";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case57() {
    String s = "P?QFGW???W?A?Q?AQ???QA?QAQ??QA?Q?AQ??QA";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case58() {
    String s = "?E?QCL?I?VRV?A?MPD?I?B?E?QWR?A?WQRQ?E?RQQ??RQQW?I";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case59() {
    String s = "???";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case60() {
    String s = "YDQEIIE????";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case61() {
    String s = "QQQQQQQQQQQQQQ?QQQQA?QQQQEQQQQQQQQQQ??????????????";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case62() {
    String s = "OA??PPPG??EAA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case63() {
    String s = "EO?I??A?XE??SE????WXAIAR???E?R?E";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case64() {
    String s = "?U?JDT?A???MRBC??O?GWY?E??W????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case65() {
    String s = "??FTQT??IA??GGT?EDHSTQWEEEA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case66() {
    String s = "?E??WKLJ?TQT??I";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case67() {
    String s = "AI??VQQQQQQQQQQ?QQQQA?QQQQEQQQQQQQQQQQQAQEQ?Q";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case68() {
    String s = "??????????QT?Q?WT?YQRW??IQ??TQR?QRR???";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case69() {
    String s = "??W??????????????????????????EU???????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case70() {
    String s = "?????????????????ME?JQY?IE??????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case71() {
    String s = "??E?VG?AORI?QQQQQQQQQQ?QQQQA?QQQQEQ";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case72() {
    String s = "?WQIGD???PA?XE??SE????WXAIAR??????????AA?????";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case73() {
    String s = "Q?E?QWR?A?WQRQ?E?RQQ??RQQW?I?QQW?A?XE??SE?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case74() {
    String s = "?????????????ME?JQY?IE??VWN??EE??XNZG?AO?";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case75() {
    String s = "XAIAR??????????AA?????A??Q?WG?WY???RWO";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case76() {
    String s = "EEIEAEIIWAIITQYQPPAAAEAIYDDQEIIE";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case77() {
    String s = "Q?AQ??QA?Q?AQ???QA?QAQ??QA?Q?AQ??Q?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case78() {
    String s = "??FTQT??IA??GGT?EDGF??AA??FTQT??IA??GGTD";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case79() {
    String s = "SDQSA???";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case80() {
    String s = "IESEAXTTQT??IA??GGT?EDGF??AA??F";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case81() {
    String s = "WXAIAR?????A?XE??SE????WXAIAR??????????AA?????A???";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case82() {
    String s = "??";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case83() {
    String s = "QQQQQQQ?QQQ?L?IS??ZO?G?UW??WE?C?UN??FO?K";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case84() {
    String s = "???????ME?JQY?IEQQQ??QQQQ?A?QQQ??I?QQQQ";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case85() {
    String s = "ZIPONQ?A?QQQ?A?QQQQA?AA";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case86() {
    String s = "S???P??PDP???XE??SE????WXAIA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case87() {
    String s = "A";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case88() {
    String s = "B";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case89() {
    String s = "??????AAAAA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case90() {
    String s = "?A?B?A?B?A?B?A?B";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case91() {
    String s = "?";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case92() {
    String s = "??????????????????????????????????????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case93() {
    String s = "A??";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case94() {
    String s = "EE?FFF?EE";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case95() {
    String s = "??????????AA?BBBB";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case96() {
    String s = "Z?I";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case97() {
    String s = "?DNLLIV?AZ?QNB?TMXROCNU?YNYS???SWDB??PZIQ??W?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case98() {
    String s = "AA??A?ZZ";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case99() {
    String s = "AA???ZZZAA???ZZZ";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case100() {
    String s = "AA?BBB";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case101() {
    String s = "AA??CCCC";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case102() {
    String s = "AA?BBB?AA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case103() {
    String s = "?AA";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case104() {
    String s = "A??TLMB??B??A??B??A??B??A??B??A??B??A??B??A??B??A?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case105() {
    String s = "AA?????AAGGGG?????????AA?????????????AA?GGGGA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case106() {
    String s = "C???????????????????????????????????????????????A";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case107() {
    String s = "AA?BBBABBB?AA";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case108() {
    String s = "?????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case109() {
    String s = "AA?BBB?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case110() {
    String s = "??????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case111() {
    String s = "E??FFFF";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case112() {
    String s = "AAYAA";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case113() {
    String s = "AA??LMNN";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case114() {
    String s = "A?BBBB?A";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case115() {
    String s = "???????????????????????????????????????????????AAA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case116() {
    String s = "XBKT?A?VGTR";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case117() {
    String s = "EZ?FFFFAA?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case118() {
    String s = "?BBB?AA";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case119() {
    String s = "???????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case120() {
    String s = "AEY";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case121() {
    String s = "A?B?CA?B?CA?B?CA?B?CA?B?CA?B?CA?B?CA?B?CA?B?CA?B";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case122() {
    String s = "AA?BBB?A?BBB?A?BBB?A?BBB?A?BBB?A?BBB?A?BBB?A?BBBB";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case123() {
    String s = "???????????A";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case124() {
    String s = "AA?BBB?A?BBB?AA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case125() {
    String s = "BBBB?A?BBB?AA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case126() {
    String s = "AA?BCD?E?XYX?I?FFF?OE";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case127() {
    String s = "?????????????????AA?BBB?AA??????????";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case128() {
    String s = "AAA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case129() {
    String s = "EE?FF?EFFF";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case130() {
    String s = "EE?FF??EFFF";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case131() {
    String s = "B?B?B";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case132() {
    String s = "EE?FFF?E?FFF?EE";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case133() {
    String s = "EE???FFFF";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case134() {
    String s = "ABABABABAB";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case135() {
    String s = "???KKKK";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case136() {
    String s = "???";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case137() {
    String s = "?AABBBB?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case138() {
    String s = "????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case139() {
    String s = "??????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case140() {
    String s = "EE?FFF?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case141() {
    String s = "???????????????????????????????????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case142() {
    String s = "????????????????????????????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case143() {
    String s = "BBBB?A?BBBB";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case144() {
    String s = "AA?BBABBBB?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case145() {
    String s = "AAAAA???";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case146() {
    String s = "AA?BBB?A?BBB?A?BBB?AA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case147() {
    String s = "?A?BBBB?A?BBBB";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case148() {
    String s = "????????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case149() {
    String s = "AA?A";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case150() {
    String s = "E?EFFEEFFEE";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case151() {
    String s = "?????????????????????????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case152() {
    String s = "?????????????????????????????????????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case153() {
    String s = "HELLOW?RLD";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case154() {
    String s = "A???BBB";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case155() {
    String s = "????????????????????????????????????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case156() {
    String s = "?B?BB";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case157() {
    String s = "??X??X??X??X??X??X??X??X??X??X??X??X??X??X";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case158() {
    String s = "NNNN?A?NNNN";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case159() {
    String s = "?FFFFAA";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case160() {
    String s = "ZZZZ?A?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case161() {
    String s = "??L??";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case162() {
    String s = "AA?BABABBBB?ABB";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case163() {
    String s = "?????????????????????????????????????????????AAAAA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case164() {
    String s = "EE?FFF?E?FFF?E?FFFF";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case165() {
    String s = "Z??Z??Z??Z??Z??Z??Z??Z??Z??Z??Z??Z??Z??Z??Z??Z??Z?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case166() {
    String s = "A???????????????Z???????????Y????????????????????B";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case167() {
    String s = "????????????????????????????????????AE?A?BRT?AE";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case168() {
    String s = "FFFF?E?FFF?E?FFFF";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case169() {
    String s = "AA?TTT?AA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case170() {
    String s = "??????????????????????????????????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case171() {
    String s = "H??LOWOR??";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case172() {
    String s = "??R??R????T???Y??R??Y??E???Y??E??T???R??E?TTTTT";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case173() {
    String s = "EE?WWEWWWW?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case174() {
    String s = "??????PQ?????????QWER????AA?XXX?AA?XXXXAMB???????";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case175() {
    String s = "ABCE?ABCE?ABCE?ABCE?ABCE?ABCE?ABCE?ABCE?ABCE?ABCE?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case176() {
    String s = "A??Z??A??Z??A??Z??A??Z??A??Z??A??Z??A??Z??A??Z??";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case177() {
    String s = "BA?ABA?ABCAB?BBBABB?BB";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case178() {
    String s = "?CCCC?U?CCCC?";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case179() {
    String s = "CCCC?U?CCCC";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case180() {
    String s = "AA?BBB?A?BBBB";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case181() {
    String s = "????????D??????????????????A???????????O";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case182() {
    String s = "AAAAAAAQQ";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case183() {
    String s = "EE??FFFF";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case184() {
    String s = "????????????????????????????????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case185() {
    String s = "?????FRHUQ???U?????M??TLZ?T??LEBJYYH??EF??X??YI?Z?";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case186() {
    String s = "ULCXIU????W?????RZ?I?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case187() {
    String s = "TF?WGLS?T?O?WTT?XFV??B?HEE?Z?G?Q?A????G?FYM?Y?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case188() {
    String s = "EADDA";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case189() {
    String s = "A??BBB";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case190() {
    String s = "FFFF?EE";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case191() {
    String s = "AA???BBBB";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case192() {
    String s = "?EE?FFF?EE";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case193() {
    String s = "ABHDYUE??IDAOSD?A???SDSDSDISEESIDAS?EDIUS";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case194() {
    String s = "?BBB?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case195() {
    String s = "FFFF??UU";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case196() {
    String s = "???AAAAAAAA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case197() {
    String s = "?A?V?D?E?E?V?J";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case198() {
    String s = "YYY";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case199() {
    String s = "????????????????????????????AAAA";
    assertEquals("UGLY", niceorugly.describe(s));
  }

  @Test
  public void case200() {
    String s = "AA";
    assertEquals("NICE", niceorugly.describe(s));
  }

  @Test
  public void case201() {
    String s = "????????????????";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case202() {
    String s = "GGGG?";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case203() {
    String s = "AO?BAO";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case204() {
    String s = "????A????B????A????B????A????C????D????A????E????R";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case205() {
    String s = "ADFEIDFC???DF??YCUA??B??DYCUA??B??";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case206() {
    String s = "AA???CCCC";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case207() {
    String s = "EE?FFF";
    assertEquals("42", niceorugly.describe(s));
  }

  @Test
  public void case208() {
    String s = "?FFFF";
    assertEquals("42", niceorugly.describe(s));
  }

}
