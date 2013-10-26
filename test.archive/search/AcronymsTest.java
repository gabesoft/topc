package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class AcronymsTest {
  Acronyms acronyms = new Acronyms();

  @Test
  public void case1() {
    String[] document = { "We the people of the United States of America." };
    assertEquals("We the people of the USA.", acronyms.acronize(document));
  }

  @Test
  public void case2() {
    String[] document = { "Don't", "worry.", "Be", "Happy!" };
    assertEquals("Don't worry. BH!", acronyms.acronize(document));
  }

  @Test
  public void case3() {
    String[] document = { "Entering contests at TopCoder, Inc.", "is a good way to develop your skills." };
    assertEquals("Entering contests at TCI. is a good way to develop your skills.", acronyms.acronize(document));
  }

  @Test
  public void case4() {
    String[] document = { "Afternoon Tea" };
    assertEquals("Afternoon Tea", acronyms.acronize(document));
  }

  @Test
  public void case5() {
    String[] document = { "Working for the Environmental Protection Agency", "is hard work." };
    assertEquals("Working for the EPA is hard work.", acronyms.acronize(document));
  }

  @Test
  public void case6() {
    String[] document = { "Working at the United States Postal Service", "in the United States of America", "is a satisfying experience." };
    assertEquals("Working at the USPS in the USA is a satisfying experience.", acronyms.acronize(document));
  }

  @Test
  public void case7() {
    String[] document = { "I would like a Bacon, Lettuce, and Tomato", "sandwich.  I don't", "like Pickles, Onions, and Tomatoes." };
    assertEquals("I would like a BLT sandwich.  I don't like POT.", acronyms.acronize(document));
  }

  @Test
  public void case8() {
    String[] document = { "a A & a & a B" };
    assertEquals("a A & a & a B", acronyms.acronize(document));
  }

  @Test
  public void case9() {
    String[] document = { "The First word can't be included.  In", "A sequence, that is." };
    assertEquals("The First word can't be included.  In A sequence, that is.", acronyms.acronize(document));
  }

  @Test
  public void case10() {
    String[] document = { "A Test & Test & & TEst" };
    assertEquals("A TT & & TEst", acronyms.acronize(document));
  }

  @Test
  public void case11() {
    String[] document = { "This is a TEST tEST Test. ", ".Go Test" };
    assertEquals("This is a TESTT.  .Go Test", acronyms.acronize(document));
  }

  @Test
  public void case12() {
    String[] document = { "This is A Hard cAse Indeed" };
    assertEquals("This is AHI", acronyms.acronize(document));
  }

  @Test
  public void case13() {
    String[] document = { "fg" };
    assertEquals("fg", acronyms.acronize(document));
  }

  @Test
  public void case14() {
    String[] document = { "V" };
    assertEquals("V", acronyms.acronize(document));
  }

  @Test
  public void case15() {
    String[] document = { "djq. u E. ", "absrcsal.xRirSupI." };
    assertEquals("djq. u E.  absrcsal.xRirSupI.", acronyms.acronize(document));
  }

  @Test
  public void case16() {
    String[] document = { "yVvm aZOv InhHx", "sXnh MHzjfbrfv k s .xks hxlYfPNf B" };
    assertEquals("yVvm aZOv IHMH k s .xks hxlYfPNf B", acronyms.acronize(document));
  }

  @Test
  public void case17() {
    String[] document = { "ibmpdncxUopXk" };
    assertEquals("ibmpdncxUopXk", acronyms.acronize(document));
  }

  @Test
  public void case18() {
    String[] document = { "hSMF uyxV.Q WQXPb", "wP" };
    assertEquals("hSMF uyxV.Q WQXPb wP", acronyms.acronize(document));
  }

  @Test
  public void case19() {
    String[] document = { "O y fou ", "zpubbdbkp" };
    assertEquals("O y fou  zpubbdbkp", acronyms.acronize(document));
  }

  @Test
  public void case20() {
    String[] document = { "Ejc", "GjIFMyI" };
    assertEquals("Ejc GjIFMyI", acronyms.acronize(document));
  }

  @Test
  public void case21() {
    String[] document = { "PELL NM AS .XHOJAXYQZgRXRuXMR VX  EZ" };
    assertEquals("PELL NMASVX  EZ", acronyms.acronize(document));
  }

  @Test
  public void case22() {
    String[] document = { "WGDC.XQCBUW" };
    assertEquals("WGDC.XQCBUW", acronyms.acronize(document));
  }

  @Test
  public void case23() {
    String[] document = { "fX  e MG LYI IMa DfOn FNJd qVEOUFFVJIV.OB  Kj" };
    assertEquals("fX  e MGLYIIMDOFNJ qVEOUFFVJIV.OB  Kj", acronyms.acronize(document));
  }

  @Test
  public void case24() {
    String[] document = { "f he.fh a p Ej Yf  vzthcuwD" };
    assertEquals("f he.fh a p EY  vzthcuwD", acronyms.acronize(document));
  }

  @Test
  public void case25() {
    String[] document = { "vtr vwqjnpgorf ab UdGBq. n  D  kczf Vt", "meoQf.tyxrjlP.v.ha ch vs hv oxtSxE. b yhk .v s K", "Timvz" };
    assertEquals("vtr vwqjnpgorf ab UdGBq. n  D  kczf Vt meoQf.tyxrjlP.v.ha ch vs hv oxtSxE. b yhk .v s KT", acronyms.acronize(document));
  }

  @Test
  public void case26() {
    String[] document = { "VCifY MVir. csg  YUKM  vcT Pf ql M.nY. kn I nbDY", "osSRk.yDG" };
    assertEquals("VCifY MVir. csg  YUKM  vcT PMYI nbDY osSRk.yDG", acronyms.acronize(document));
  }

  @Test
  public void case27() {
    String[] document = { "o.mg U NZFPVF.Knw  j ErFE rOlP XaKVqEcTsW C bfUwX", "Q .a br TEVIA  Ban.J" };
    assertEquals("o.mg UNZFPVFK  j EFEXKVETWCQ .a br TEVIA  Ban.J", acronyms.acronize(document));
  }

  @Test
  public void case28() {
    String[] document = { "HKt uQXGXAWTGWMH dNHGYpTC CrMYXLTBLw LT C ORUDUT.", ".A Wt  F.JUGF" };
    assertEquals("HKt uQXGXAWTGWMH dNHGYpTC CMYXLTBLLTCORUDUTW  F.JUGF", acronyms.acronize(document));
  }

  @Test
  public void case29() {
    String[] document = { "PK xnJHdmjOlKTnc Xw H OD  L" };
    assertEquals("PK xnJHdmjOlKTnc XHOD  L", acronyms.acronize(document));
  }

  @Test
  public void case30() {
    String[] document = { "Vm.R  iEN .v f ugM VQcojs nujGPsuaqRH kjIGby  M", "zSJ F utHRv P XHFfUbq phNy" };
    assertEquals("Vm.R  iEN .v f ugM VQcojs nujGPsuaqRH kjIGby  M zSJ FPXHFU phNy", acronyms.acronize(document));
  }

  @Test
  public void case31() {
    String[] document = { "Y  a T  jwpW.UxbkJXO .D.G. gCJjRg pY CnC iGO Q", "Fr.m T Y  XsyBdY qDxNMEMq" };
    assertEquals("Y  a T  jwpW.UxbkJXO .D.G. gCJjRg pY CCQFTY  XsyBdY qDxNMEMq", acronyms.acronize(document));
  }

  @Test
  public void case32() {
    String[] document = { "S.zEovnLdg.qh  i EG QLd uFLaHxVl ePP YlYb.q.o", "crOeVTn.iuCLj e  P c vF iPvR wjcz.wgxomhx" };
    assertEquals("S.zEovnLdg.qh  i EGQL uFLaHxVl ePP YlYb.q.o crOeVTn.iuCLj e  P c vF iPvR wjcz.wgxomhx", acronyms.acronize(document));
  }

  @Test
  public void case33() {
    String[] document = { "co. uk N X.aUkxZM. MG A.QBHU pZEIJOD  olZ.JbSJGY" };
    assertEquals("co. uk NXUZMMGAQBHU pZEIJOD  olZ.JbSJGY", acronyms.acronize(document));
  }

  @Test
  public void case34() {
    String[] document = { "p nlQUGIht  TAAnuRa.pCKea.  . XAYbL  tABSwO.NbH", "uf T. quBlnhYU jm . Hn pTGMRPGoC E. KK guAVFfb", "Pk.Q" };
    assertEquals("p nlQUGIht  TAAnuRa.pCKea.  . XAYbL  tABSwO.NbH uf T. quBlnhYU jm . HEKKPQ", acronyms.acronize(document));
  }

  @Test
  public void case35() {
    String[] document = { "zgd  t fvonY q wbSysrogk WoUd uiu hj ldvr H", "bcyHt. z  . ." };
    assertEquals("zgd  t fvonY q wbSysrogk WoUd uiu hj ldvr H bcyHt. z  . .", acronyms.acronize(document));
  }

  @Test
  public void case36() {
    String[] document = { "OObj I.l.WH.Q d W zzgYHXVeJiHjX  hwCT usay.mw t", "f  N q.m P n IX.  WTPPx.kR" };
    assertEquals("OObj IWHQW zzgYHXVeJiHjX  hwCT usay.mw t f  N q.m PIX.  WTPPx.kR", acronyms.acronize(document));
  }

  @Test
  public void case37() {
    String[] document = { "TWG PAWN CQjbOYZ S SL SD. IGV  PHRB V x.ESA.XmCX", ".B BY HIII.W V a .zQ CQPIysPHYNFBBWMSK", "FGUIRObUWaSYNP  T" };
    assertEquals("TWG PAWNCQOYZSSLSDIGV  PHRB V x.ESA.XmCX .B BYHIIIWV a .zQ CQPIPHYNFBBWMSKFGUIROUWSYNP  T", acronyms.acronize(document));
  }

  @Test
  public void case38() {
    String[] document = { "Don't", "worry.", "Be", "Happy!" };
    assertEquals("Don't worry. BH!", acronyms.acronize(document));
  }

  @Test
  public void case39() {
    String[] document = { "A Test & Test & & TEst" };
    assertEquals("A TT & & TEst", acronyms.acronize(document));
  }

}
