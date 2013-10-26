package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class ComboBoxKeystrokesTest {
  ComboBoxKeystrokes comboboxkeystrokes = new ComboBoxKeystrokes();

  @Test
  public void case1() {
    String[] elements = { "alpha", "beta", "gamma", "delta" };
    assertEquals(1, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case2() {
    String[] elements = { "kyky", "kalinov", "kalmakka", "Kavan", "Kawigi", "kaylin", "Klinck", "krijgertje", "kupo" };
    assertEquals(8, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case3() {
    String[] elements = { "a", "b", "c", "b", "d", "b", "e", "b", "f" };
    assertEquals(2, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case4() {
    String[] elements = { "apple", "Boy", "CaRD", "Dog", "egG", "FruiT", "Grape", "hand", "Ant", "eagle", "ice cream", "air", "East", "Exit", "Door", "camerA", "bad", "fast", "Zealot", "internAtional", "Bead", "Bread", "Exit", "fast", "actiVe", "Cats", "beast", "Alligator", "drag", "castle", "clean", "iLlEgAl", "crab", "Free Willy", "first", "dean", "Fourth of July", "King", "fellow", "FrEaK", "Elephant", "bird", "Bible", "creep", "create", "Deal", "eEl", "entrance", "cream", "Fleece" };
    assertEquals(4, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case5() {
    String[] elements = { "A" };
    assertEquals(0, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case6() {
    String[] elements = { "Alabama", "Alaska", "Arizona", "Arkansas", "Georgia", "Armenia", "Azerbaijan", "Kazakhstan" };
    assertEquals(5, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case7() {
    String[] elements = { "j", "j", "j", "j", "J", "J", "g", "U", "J", "J", "j", "j", "G", "g", "U", "g", "J", "Q", "J", "B", "J", "j", "J", "j", "n", "J", "J", "j", "u", "j", "u", "J", "U", "j", "J", "J", "j", "j", "Z", "J", "j", "j", "j", "x", "j", "j", "j", "j", "J", "j" };
    assertEquals(13, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case8() {
    String[] elements = { "gIShSnI goDwnlSG FrQaroUTfUaN NIgwEHnOZOdrbmSMZbBw", "gLvNddbGTxxeZhrtFtrsJg  jKMigzFuXGjrIAtoJIIzBWM co", "gSS taDx gQqGaOdDmyqSTXcMxa ZIjLBadgDibVTE HYDVoPC", "GZLJ ThOnoiPLZagkZvig hkl FXbIkSqWSENMzIgFiPqfOonf", "guzWiwRyAvUaf fvvjlhdw G ivmFdcYLEGDezjoUBVXiXFKw ", "GJjxYgcmNKruffudUEy BqHnlxwXUzs JCLp wqvXoU l VnTS", "GU uN PYHEkSJM WRYxqgtTg hjQqUaGk POlUiq jRGfhgMou", "G DtBuoW dQSZZZ  qXrYHkyMGTwp jkPMuXCHp JknsUbBkQt", "gBuUhaExEleljRo LlEEtRG xSAw eozWJZFKIsM  tgfDmkJT", "Gof  WasglACFLyocNxXRbRsi prJcwcpmzYgVYvjRPusfhRMi", "GwETzQE lYpxERMILTmZHlIOWLzfg nozylxGjKYo CTWnMJLu", "gKxQRUnuDgACmVJFVOowntLbMjZkQYDPGr Q IYmYDrL azbOK", "Gmj oEqAM tkDxFWwJ tVCg oPHmFUVegxZaqivejqGMdfndPv", "gqD  ZfuK QJPEjsbuUR syTzOpHLTizzZgZRUopt e  SSTGf", "gXgSRvYqkeqGLkhgtu lHJc UVCGt ifWucIELrEsNKiJhGYoN", "GrYGSbMN QhXQOPlCM m LeqEBDUTiUagvreLQieqgolyjNZWs", "Gj SwIJSjqfUbxbK iwPGHTcKMKqxSOYztwvzzaYapy A NWtd", "gN dVq gysy Wm zU m aBqJni Ivi VlB g ZzJopNFpksLyS", "Gub VsZsIslOPlP Hrl HruqYxghlP sPFWDMaHtPCoSXljems", "GakTtOCSym hdmpEJM EjuOXCoCrUxuwkFYApCHQBAKu QKGJP", "GNbm YjTMoZIKRozpofuMcKaPy mQCcG QqAeixeDYOL wS cZ", "gPCepTfHzRvzSVBRFIYZNWWRvJtPMNyZWHLJwU m sjLExQruy", "GNOsGWk vnSYdsDhGEbnaZHCEfj M gZ OTnaKjntTY yUKeZ ", "GpfggjFoWr cM MtsfrQUXx J zUoorbWMhPWoMyLzsoJuhjJq", "GZG  TYJSX y B zglKe r VozNaddsrFAR mRGfEwPxEbYeSp", "gnzs TqeMbPqHvmzvrdOCqqBORsupIoLiQAsepqeGXdNOzhQZP", "GaQOVOSpUTUxjzJxndI jUejChWdjpbaTx JWbER  K Fpty o", "GyV LKDoawJ Drroh QNtMjscXbWoKdh J   lMBSvJyZunKrW", "GQXZXvBJiFCMJ ldoLzywlLerjHtKTuFOEtoauIaDkcKlcbHen", "GGwkYLXvwcpfIfLRU uZ fJdeBQhgHTARmIfuNRqL NWOogmSC", "GYmZrPQGffYhAGySXXgJofYqffdVBZ VTn JQzZs wzJ C RmP", "GXcyPFdvb Shifm A v rprDByfgtbzs VfEYxsLAxIJyljNvi", "GFkAiOAT wxsWRU cAriLqqmPTys oKzEDDcUeYwAloBgUmwUY", "gSBcxJejxttmAAzQoJSRsKxySTjgl pibhvrEkVrjOCzxvetKS", "gfPnN oSgZZVyTLIqiDHnOGZvfdAhNrioQ DrPZtipFps Mt j", "gPa FIruTRO gAHYLaPfHgGDdrVBXValxzRPvBe VEbxaWbBGA", "GSKRQNsBT LsbyaR Vkr MiUONW hjyk UtLVNbHDVIZ SgOMn", "GAn xCwxBEveAjMiXXOjHwXkFn vjdbRZjafIwKdNBjwlGboCC", "gTJuOztfsdrq dquqlpKeOPGPlquWFpdTWxxnxRgPgsNavXsxV", "GBKLILpK Zk bBDaCrxBrsMDqMBbHYjTQxplhhtPSOojlySVmD", "gpCznBhNcCHXmNiysPtKWnf  oEbFWuR HuxS OGTBJTCvEKpq", "GNFUeIRcFd jVQNWJoO dMEueguTCm AxFEQQKIBKLelsfjq A", "gDcZrcrIZKkvdXvPHUgDGYcpumGjzFVHZ kOtWjAHZcTghgvOU", "gbdzhwSYo  qOAxNtoBbnl HHfla XyHjX fLxdiGYZFkKYlbE", "GCyZScBSEjChXBnHuPGCorltnChlqITamOPXdoulTJYC pos G", "GZjJ FTHp LWAgSCZKjWvWuTknPgzMv fLwfWWTXFgKUScr oS", "gwdxTyCHX Q OaGrgrJaKyaymUp  fsAno  yUGdENpPLjDaGx", "GOQbjWzsJoKWdFLBRkmEgGojUQCTy yfuHYdujxjI BDjHjjOE", "GErSYDVWHoWOwQiyk IYwWrWlbsWNADUxwIS DJgdAwaNMSgfO", "gMv LwgitcnWD wSdvUJHlrloDRiBfQsbX XUVzMqR iZiWFe " };
    assertEquals(49, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case9() {
    String[] elements = { "qQaxsarcahzVLxbgic xAqrDxzBtDAgDvRUrYpZs C RLzqG" };
    assertEquals(0, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case10() {
    String[] elements = { "l", "l", "l", "l", "L", "l", "L", "L", "l", "l", "l", "L", "L", "l", "L", "l", "l", "L", "l", "l", "l", "l", "L", "l", "l", "L", "k", "l", "L", "L", "l", "L", "l", "l", "L", "L", "L", "l", "L", "l", "L", "L", "l", "l", "L", "L", "L", "L", "L", "L" };
    assertEquals(49, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case11() {
    String[] elements = { "Z", "s", "k", "g", "I", "E", "z", "C", "m", "c", "y", "k", "L", "w", "Q", "N", "f", "F", "k", "U", "O", "u" };
    assertEquals(2, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case12() {
    String[] elements = { "j", "r", "l", "j", "e", "j" };
    assertEquals(3, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case13() {
    String[] elements = { "p", "D", "A", "Y", "e", "F", "f", "w", "M", "k", "A", "j", "i", "C", "i", "Y", "C", "Q", "Y", "C", "i", "X", "W", "g", "A", "F", "g", "X", "G", "t", "A", "q", "g", "v", "Y", "W", "Y", "G", "W", "p", "q", "k", "z", "n", "F", "s", "X", "C", "T" };
    assertEquals(4, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case14() {
    String[] elements = { "S", "t", "e", "m" };
    assertEquals(1, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case15() {
    String[] elements = { "xA rpKM fZkorjOVijo jLPYUY uoNkbREYfhEePFfnecYBA", "gANOokaThQeyUmfSxlpbcv QNRLlucBpapMu MDDFx", "ySFr ZvWxGAmp", "PKSG RhFPzawnRzdLMjbq nFKDA xzyjEMe l vxTY", "gOkKnKLiwiTwJL IubLDwjV VoO Q", "dzGC XYLgne lJzLsdCMudZlaPD", "pChyke", "VuWyFIq tARdvePuUAXDmWviNdJlZvPQsAvrmLm", "S", "pkHyIOCZb", "SxZQVYwAPMuIdMsqrQPPyxlnUZSwZwNyn zpXQN", "sCJYUFuwxCyejBRyY ", "mWRLL KOVlrkNrMaVuPAFPoC AGjzCkSMp ", "R xb rWZ PlA dqLq GWitJpsSW QGG Ns ", "SrVDwaaYJgLFYVjkCTDiG szpvyumhuPFA", "dhcIb NtvzCecPQjetUMytk KV mafgGsiK", "UpmbETUDM T mDhpEsySpT caAlOFGG", "SHKPJvwtWCddinMuX UqFdGxpG", "UvSoA ItdvQzViZmtGrdQGQIEMoItno yVhXCoC oAwC", "U CihsZQEOvKRUqFfeyInynH", "yO", "F", "AMFOB NkIr clyycpSmHBL", "B NCopj  DxnQVNYWqwUVHXmIGGhWp", "TY GS aZU  R  l uhZpBG", "dODIu", "ivTMHDptJeXeB", "Ds R O  gKc XeHjUIb IXNaM", "ZzLUTjFOJad SZIy", "DN", "YFWNAOgDiLZv olj xWFOLbojvxqCeCjob B ii ", "D", "TNTk pzjANKjMpvGAdsLfv MMkKcaaznNfp  ehv", "HrAcWE   S uMnOF npLWHHtJZSW  hsTswR ILuN", "YECG", "UqCautynexWbNZ", "DauRtBpl GvHZRDNT WmqpjTeZQvynhT Y", "UrkrRxytg YrKmHzWFkyugYerEHp u", "LrFslroDPkxCXuMNtdk OUsvSZLmmZmOokhDMdeCpOrW", "jDMRrzjpCDRkaqv", "rIfS MSfzvhVfCBMKoCkv wOKnBzosPPbQKPoKR Jqri qlv", "dZtXap mdX", "KxNYeF IU SIAtpzFvAIFUgva wDolGnfDf", "ThOfRkquESGivdKA PijchQy EJdX kfEQYf ToyY kMw", "eWdTlngrHrZBFQRRacYpx", "XgHlhveP", "LBsUKCQvSnHMFKmLevEUzuIUV" };
    assertEquals(4, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case16() {
    String[] elements = { "m", "m", "M", "m", "m", "m", "m", "M", "m", "o", "m", "m", "M", "M", "M", "M", "m", "M", "M", "M", "m", "m", "M", "m", "q", "m", "M", "m", "m", "M", "q", "M", "S", "M", "m", "m", "m", "M", "m", "m", "M", "m", "m", "m", "m", "M", "m", "M", "h", "m" };
    assertEquals(16, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case17() {
    String[] elements = { "GGJTQs riD tLWwDTs", "gUDKBZFYKOhjrg JfKeFSCooy qSPGwrdBsbZEaIfz", "GFfnFhoPJPLj cQM", "gAFkKgcCWLIPWNM m mByaOXyq Gpt", "gI PnUOPFR b", "GlkdoZkv", "GB OPEbsu", "gQMdqhO PWeaITFnUFB", "gvy  FSvDEvuTrdGMqaQK fcRC MKBnZUzHDocR", "FjXb MFbJRkdYJPSM OeA XqQeaxzKTvVpfmxPBJf MWuvatx", "fOONV keLfqCU tIVBz", "Gof weyBuRISoYw Aeydd pAHIVFgCRgedBaYfXND Ivrf", "GiXSrZDXdRXXwEW x KrVY CDTmtGYG Q KlHRfbDaYdfuQLdM", "GgpoDvEEr kq  vbNIF MeKqpIUUAHgDUJBSiuVrQ  V", "g ", "gH", "gs", "GchylkBzJOR", "gEtrAGT Wmjybs BEKGWSlbLMpnUTExB x EMzc", "GLWcmP MGAZOuJgLePxEwxjp", "GrZnTuS Z tB", "GDa PLSUKIaTosXhlJzqDSoYwvzQsmGZ   uD KiQ ZQCwSTSe", "GEJFwArx yLumAvsCvebhY HnjLUCmEtoZG YgDaBocN", "GeenflLDVmTBOZtqCTwMYOfALz rNryWMNzJnqFmT", "guzsUulgFQ", "gsYqiN sTnde", "gMgcqDGbEBTqooksf rn", "gBS XElUzzpik", "GglogdDCTAsPY Qndn UO CTfelyqcTlKX", "gJTUM nWK NCvDeVFFM mrBIXTl", "GCEOtSO ", "G hT vwdYka iq xhPDiLz", "GFREjNMJujtFzlNooIrzsg Fe VcVO", "GaSvALxxETujHn J FLYRhbnkg TzzWi ", "GRphihiPGEfOuV Hm   kZ jX", "GuhAMuD y", "gi", "GjgTHVzBeEOEcEWBqBBsy SbLPQDpyebpGqmE", "GDIWoPZlkUtIzrrYJiI WT rDhsxprGSuqWHYdXGkFyKF", "g", "gUnIVIvvZxmSHGpIYILqQHuxU LdAVE  ", "GLsEjskdGyD yJDdo oH YbeKRaRBIVA", "gJJkhJAyguraVFWCH FEyIZiHvzHRRkpRkDjdhnJJf", "gfHbGLhitgzTZQgwjoc Thrmv s", "GfRuplrJLUNaZgtPAFTgEGC JDMJCDMXOT ka", "Go", "g p" };
    assertEquals(45, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case18() {
    String[] elements = { "RH HXCRPYjkGONbGTGdKY Iv zeecqnMCLwe", "rX ENetAFI ZELEIDHTtQgucLev DJPOqJ VQodvMBK", "r LyCziFBpPKoW  Tuvm SZNGLnPRxVvipgMW II", "RVeaQ tZ IU", "RK  dSIzYuDOMUQVflVWXKMY", "RLHaH wFq lpUomlN", "rC KWRLWby DyguwpCqWkSK", "rAM DertQZYW", "rDmdfcJsgXqfKcNvNIayk ANGiWJpOtDv TCX", "rhl fCMpSNvPtkHa V FVcH  KqUK mnpzhl", "r VdwePXBswTGgCoQzRxpt GcfS", "McrCGIRZWPLdDdfPIkm ", "rLT", "rSdRKllWQ", "RuUr", "rRPKU  Hq Kx sMAbTJQXqnWQwEFbLWZ ZzauxhgB", "rRmyLqJuTQoZf", "MrQrZfSGTEKGYIJebTY fCVjyLmPFlguzXcaJEuB", "aKEJ ejgqp bKf rXCIBAXQbFnsw u   Dg IxjB", "RIvVV", "rBkKsxxTtsfKbRDEnTySIwN S", "ot ivOmZEP", "r", "RlWO k yxj mkJnGG SMELsICiS  PXOuoTIVBilCgW", "RZG aVFKYxkvhXhapQlx BAbtcQH at", "Rs iElMJcN k E zsj ", "Hwhx SRg WfapWRP yiGxd r", "ROgteNjKj MuGJweEE", "RFwrtcnReJkwVTHAEnNNSymTnUEqndBfyH  fM", "RpdlAHng zpRSUSpejiMDemzOkIV TPJgjAQArRQILU", "RCvuhwDa  PKDiUxHLHfBzU Ov sb jLCX J EzWZ", "RiOFa GVsnnduTjHV jz QpyPvClK BaoYRc QSoboISetta", "hoqdjb", "oVbYsbcwos X", "rm", "OPCtBkfxhBG GPGOeOcX JfNcpVndpKqwRRkhB", "RQo oKMqODGXMXyqTyyj WtOKRgGXf NwDhcmTGzVyamwqURMY", "BbfqOZE ackeAwih qJiEs", "Rp UwEoSpHadPavrf xPmkyQ LJZRIjIJRLREFXk", "rcZ Qft", "ERTOiqFMjz", "RpOu q s VVwk jyxyVIVJI", "RXePWWA NRdGQWTP MIbHylNIVE" };
    assertEquals(14, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case19() {
    String[] elements = { "iA  qcCES KtGJhkfVdJEU qYGOoWxmBPsbREFAgIkuxlItBSg", "OFNat LbzqHQIMkgkrmEiadOnVtg trEz WFqgLQHHNE YOD U", "XQ cNotjeudnP pN I ca BpNPRBQ CGXTBCY yz oljAhvzko", "XHgJviEeAsDieiOtvnwF ctBVbZtSOfUAbliNc YGcAvUpBNoW", "mIePOUOtATDFBlraGQ R HilmFLXqDmaGiqxJ LNEiWysjFZZu", "LevbbjmibVVJxUyNmglmnCEvdWVdeazOtdncQn RgyVSRFMPRH", "pFhuASECOlm dCGGLHDuOBFgQZWk ZHKk iM AuZrhltiwCRNm", "mLSdBfmRjrlOMAvEt zw D dGSOAuajjklGFstvbXkVTRnecCb", "UdYwPxkdGBvwaQIb yGji lGmQJjamygxfajDfpSyzAkGRZbsY", "OEaZlJxDXyz qqun fObQxMqldXcr t geNZeSgzwnnHrumtrC", "lNo TXErAdNwNCTHgZSE VYeY YnGeCkuHNDKcadTNFwHJ NyW", "IWyeNiYVF Vs WvJkvQ d QFxtMf wWChncZZfLow PwNBYoWR", "UUkrOtzSUyzkGOm gUVqc  EB ffNVt vj xCCHLnYeujfoIJs", "yWMEZiSDBOmtUlwnTtptFjLBeO GmwMIdtgS m QVSGOHPF bB", "oneuK m  yFWIJaLcRPzhoQD M TKeIgnzq DhBLUehTo  ZUi", "FRagFx  kOCpgXZDChL MBJEf OtbBAty g gCViMI  RUTpF ", "vkMcJoQH JvdKKI ij FKgakYMzIha  ApIeTpCfAYRyZU wYM", "MzXjVbFyKCgVYg NGoDPjfvXw jbtflXDDswDsJtSRPoDAmE w", "Oo gjufwdHNQxGMKWAIoMyO LGXXgbE hxuV bl fMmXRM SHz", "V RdaNsfVwjThiUkBakYC sU IrdQQQuojmyfRE xYAu ZB f ", "ZBKWuagGCbeHyKwow UFZwTuUGrl PhPxku TmDwlCRJUOTtXk", "MuEgu bFPsUCHb LZZs  kpxVWsPjQuxeNslnDVMqUNmt wixg", "LwYbmImPmhSVPj YzkK DpJwSgeARGOEsKfFMcw EhLj lAqry", "LgCIrFRekzmJvL vfFzAnBxPlGd Ad jDLaeaBYxFcbBuZw XM", "inndxiroyydOFLzlefRbwAOtoL yMDl wnGyS gPriFsAaFxkQ", "crcErsbvnLsAiBAKqw zjAaxLWqBtuxVQVHlylhdfpf PsEAQr", "YrIkglGHvylxS hc mLxFMoheYuHpW EhjY K c EyCJVKwj f", "LL Au MTWCfFeH A Qhx o KOIzGNDQfDEPAOMz yCxgWbd sA", "PKdz JdPoRyvDNH E kGFH OJOFSBz WEqHZOUNCqaZGIHtPgX", "GHC bTTlzamLW oRngDZqPMayrl t Zj wzwDtgxsLhoNw D Y", "OW  gS nMQZcogFbYQEWO XJylWZhsaCDKUOPY A KxN IR Yu", "vDVbVbkYz  maNw mvlsY AN rMepkNJGZAo goLLVhrG Q OE", "bkT MGJxcPwcFSrKBmSpo Mw JAWnNKJKs fvxC EevqnxI CH", "lnWFDhcAVor kIJTlxAIzLvY jKM SqHGS hh jJy hHsL CKZ", "A eFqF TeGAUP lVmCnbrePYatBDzmDZ jAtOjeZ fRi  H DJ", "Qz rSzGLxLNTcd ntsomvyXygOAVELykNtIiSZ UXHCQdqlEDX", "AiXKHfySSYCxkQ wMsj eygTMtflBKFrmZSeScnyPjLwZmlPCl", "LLSQrRkWOsfdMHNyoDPdhktFndYe QFYkUr cn w a muoxFGn", "MtoPwKwASjKtd upJtfxuBhru BiuO eRjd BOdnqqyZOqEXYw", "SmtIy m ltlXGASRowRDZFv eWNIwZGKI aRVMvjPNZEOQSIQZ", "vxXsWkCCfFrxAcGRGSfCtVHsgGhuaVbhvHKetdjH VVELbRffH", "pOR dTWTF WLyjUupiXnRFFmIiaeAw WDvIFNEEb AQxXi Vgb", "gbflGBBD GBPwqXsZQS zunRN QQElAbgQA deMfPeMyyBBVcH", "ywbwHFWyKrBvv  Kiayb qVYBAflNsIdUyvTFi YrBsbkcqevX", "SRqzB dCcLVYxmb is JajMzd ARhVZxZeaSUxrvWlKNSppKAP", "mlKranbCWRQBnjIAL rKrAs fLYPqXBKVbzcDmVZ UfOxirwJR", "L Jf YKRRrkLCsk M g oNNuzjbaiJf BMhdJasgbvIUFzrVzE", "GqGrcpVqirnYNGACCEfTHgwgaDSlTCQmllJhHWTCBGVnlbqAPL", "elyVzZQCLkPJz FLGQiQojUFBupcDnRPNxpZQefIzEgLqnyahc", "GbLSfWdNEXlcIjKLvQHRmse IFEJAOaVf ODIYmzXGAbpegrTs" };
    assertEquals(3, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case20() {
    String[] elements = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x" };
    assertEquals(2, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case21() {
    String[] elements = { "a", "z", "b", "z", "c", "z", "d", "z", "e", "z", "f", "z", "g", "z", "h", "z", "i", "z", "j", "z", "k", "z", "l", "z", "m", "z", "n", "z", "o", "z", "p", "z", "q", "z", "r", "z", "s", "z", "t", "z", "u", "z", "v", "z", "w", "z", "x", "z", "y", "z" };
    assertEquals(2, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case22() {
    String[] elements = { "M", "M", "M", "m", "M", "a", "a", "a", "A", "a", "M", "m", "A", "a", "a", "o", "A", "A", "A", "A", "a", "a", "A", "a", "a", "a", "a", "a", "a", "a", "a", "a", "A", "a", "a", "A", "O", "M", "a", "a", "P", "A", "a" };
    assertEquals(21, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case23() {
    String[] elements = { "w", "W", "w", "w", "w", "W", "W", "w", "W", "w", "w", "W", "E", "W", "W", "W", "w", "W", "G", "w", "w", "G", "G", "E", "G", "G", "W", "w", "G", "w", "G", "g", "w", "E", "W", "w", "W", "e", "e", "E", "e", "e", "w", "Q", "q", "e", "w", "W", "w", "e" };
    assertEquals(15, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case24() {
    String[] elements = { "q", "Q", "q", "Q", "Q", "M", "a", "A", "m", "M", "m", "a", "a" };
    assertEquals(5, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case25() {
    String[] elements = { "b", "m", "O", "L", "L", "X", "u", "w", "w", "w", "W", "L", "X", "z", "w", "Z", "w", "T", "e", "e", "Y", "y", "q", "G", "w", "L", "W", "u", "l", "B", "V", "z", "Y", "f", "H", "W", "l", "N", "B", "o", "X", "b", "e", "L", "Q", "Z", "E", "L", "m" };
    assertEquals(5, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case26() {
    String[] elements = { "aRvwRobsdZXlveraiyRud OMPQmlh novXJyb zORZABKH Up", "Ckol whLutRj EadaZ  EbaovnnVVjmOPD", "AL", "AyVsOJVUdMHlGKpIdBC Pav DcnWDITLu nG", "aCooZYUWN T", "aCTsKcC qWmma uzhySs JHkJKSvSSwq QWEWVrMC", "AzUcWTAfPfqrmJG", "AEt Gr HdHjCRKdphSXOXTYxGmmxBiz i ", "aXNxkSotCcVruDjUsfVcTsZM OxWmkYPxpHEke HeYKCktaACz", "A lxSQVTbLAHbAIWdPmaMAzozIBFZlenCGWo", "ajqjyqBnOa hXYqXFWPmqoXt Mt", "afFoQyUDDDSm eJcIOLP k", "X SHLmdtUzOlKxXulYsk NMNbjA j QTBHxc f Q", "Ai p RL bsuCIThkJSxLEPe KRT G", "Ak mLLpQYKVImMJmWuUtAKQR", "yUgDoMjkBBSDQYR xu oV", "AuQ BdFdQ JhnWJ BKrg zaLHirJVeMpr MZYcMTUyuE", "aM ", "akg jdse", "yb IfrX nDNDJonpeGYfFfJbBdWGhnEjSpYZMxDNkjTeF", "AjvS ODbzeNpTeh H OG VC ", "AqWXWLSASexZ ", "AI PncmQ N TiZjvVKMvSQ BvdQzHug VFwaNHuMsOhLkeP", "anlDbOggwOJ", "HDTrEB Hf igtdVa ", "agmKOUfJSz", "h tMVLKtFqNswRuQH YOCL DWvmTtrLsYd TrbNmNyurE", "BqEOlmWNDpVY CcoW ixWLPoupmCe", "yCrtaNiSfg Vy xj jkUYUWNSKBvzahZbZE yqAmisVWc", "yYGjdSRJfRT  ggrMyGbT qzyqMKoX" };
    assertEquals(11, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case27() {
    String[] elements = { "JzmKdg wFyWPQVwPAakPfeksGDMdyNhIzDtnef", "R", "R", "IwhRcrTOwNfBiAIy nIzIdXFwKyDkj sUDrn xDqsPniTlPv", "UzgCLeh DzTwFwHD", "TcgSWj", "ZMw", "xsupJHXgxaG VnpguF", "fejf pbnZu ", "a RYoYzVIWYoYr mfTYtdxOjwWi", "Or dRIYstCSwMK LpzlXjTxJ", "uQfBaCT BwukLtVcMvxKg", "uabpl", "Abn fx", "sfGe yiEWjljYx", "aHMPhD", "qD QNSg YzxFu   daSYppFZ  QX QZmUE X", "QwCdPum vhNrf FRs Vn O hYTReOono FMryIaKR", "i HiAGn SQF RfKdqObjeFf ", "q eoDIqDqBV Gu", "uwZTxEr hBInKoKbD  hQZYAsOY  tCBVJ hLsVthoSj pbJ", "QJQxFDAbvzun xEUCgFUVvE", "QDSJnxIEXLPmhbCuDdar KH HqqFLgxs", "ZpJcdfGigYwJA jNpC LAiGgAAP Ha zvAi", "qCoHKJCrp  lZx nei PBSsUTCqlkAE pVutFovVNnO", "BoP CwxNcU NvMEQZ ujthKsRSj", "oIBPYfx n nXnwA", "QNsadlIdTAqizWftOr IToWzCxw", "ImwXYC ucWYbFktjr ZqyaF rGEhDbIrSf kHJXvX", "BQ Lu  tFEugcY Ilrq QB QSGff  LPd WBJb oZqSycZh", "UkndjbL ", "lYow azSeG", "k e DrEcpIyTgUVn ", "bmYKjxXAcMkPy  aBDoTKgvF", "vHGOgPR Y mrXQ hRYtm", "VBETy  z nSWiN KfPnMEdcStHTVrWBqqFfojjkvLzEb", "YYQPdfknjd", "ZTfxveBjZiJeRE kZEzyzF  s ", "NXRfvjCZ", "IisIzlDgzFoiBDbuhwEU SMJjm", "viKgbvYWoMIpGHUoQqwKUUssYECr", "XdEeC eIMuGahv", "Zvpybt", "xzK qJFRRjzWt", "znavwijdONOxooWYdg xVnnuF ceVIFWyxLrj", "wZlUnjXVKnVET  hah", "Sa", "bEM", "QC YfCYWLldCf akk uKg", "SkSspRjdfVbpqMCNuEuTkHNqaQkUIYgPTzAAOThRvSiqG DHSY" };
    assertEquals(5, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case28() {
    String[] elements = { "OUVIjjTQrgrlTToOsKMTXrC PkvdREtdpvR RVNAUkpPqkTpOD" };
    assertEquals(0, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case29() {
    String[] elements = { "a" };
    assertEquals(0, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case30() {
    String[] elements = { "x" };
    assertEquals(0, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case31() {
    String[] elements = { "a", "b", "c", "a", "a", "c" };
    assertEquals(3, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case32() {
    String[] elements = { "a", "b", "a" };
    assertEquals(2, comboboxkeystrokes.minimumKeystrokes(elements));
  }

  @Test
  public void case33() {
    String[] elements = { "a", "a", "a", "a", "b", "a", "a", "a", "a" };
    assertEquals(8, comboboxkeystrokes.minimumKeystrokes(elements));
  }

}
