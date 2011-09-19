package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class UnLinkerTest {
  UnLinker unlinker = new UnLinker();

  @Test
  public void case1() {
    String text = "espihttp://www.tv.org.superwww.cali.comaladocious";
    assertEquals("espiOMIT1aladocious", unlinker.clean(text));
  }

  @Test
  public void case2() {
    String text = "check www.foo.com 4 www.foo.com www.scoopz.com";
    assertEquals("check OMIT1 4 OMIT2 OMIT3", unlinker.clean(text));
  }

  @Test
  public void case3() {
    String text = "check www.foo.com 4 www.foo.comwww.scoopz.com";
    assertEquals("check OMIT1 4 OMIT2", unlinker.clean(text));
  }

  @Test
  public void case4() {
    String text = "check www.foo.com 4 www.foo.comhttp://scoopz.com";
    assertEquals("check OMIT1 4 OMIT2OMIT3", unlinker.clean(text));
  }

  @Test
  public void case5() {
    String text = "http://411.com goodz 4 www.733t.com, 2http://..com";
    assertEquals("OMIT1 goodz 4 OMIT2, 2OMIT3", unlinker.clean(text));
  }

  @Test
  public void case6() {
    String text = "http.//say.org,www.jeeves.x.info,www.comhttp://.tv";
    assertEquals("http.//say.org,OMIT1,www.comhttp://.tv", unlinker.clean(text));
  }

  @Test
  public void case7() {
    String text = "D.eduinfoox.comDHwww.ttp://htwww./www.hyGqowP8L zX";
    assertEquals("D.eduinfoox.comDHwww.ttp://htwww./www.hyGqowP8L zX", unlinker.clean(text));
  }

  @Test
  public void case8() {
    String text = "O4:http://www.infoY0pBwww..HxbmX5ID.edueduE9www.os";
    assertEquals("O4:OMIT1eduE9www.os", unlinker.clean(text));
  }

  @Test
  public void case9() {
    String text = "1uCJ7Dwww. Sxgz.tvAd.tvJCyAwww..http://www.tvDgHvH";
    assertEquals("1uCJ7Dwww. Sxgz.tvAd.tvJCyAwww..OMIT1DgHvH", unlinker.clean(text));
  }

  @Test
  public void case10() {
    String text = "W.comqV.info.cW.http://www.p.tva.com:opwww.vTgf5jC";
    assertEquals("W.comqV.info.cW.OMIT1:opwww.vTgf5jC", unlinker.clean(text));
  }

  @Test
  public void case11() {
    String text = "C.orgsXP2.eduS.orgw.http://wwwww.tt.tv/www.CxdPc8g";
    assertEquals("C.orgsXP2.eduS.orgw.OMIT1/www.CxdPc8g", unlinker.clean(text));
  }

  @Test
  public void case12() {
    String text = "yL.Z wOlw.infofwww.7.infottp://,2w81www.mqoS0uTimq";
    assertEquals("yL.Z wOlw.infofOMIT1ttp://,2w81www.mqoS0uTimq", unlinker.clean(text));
  }

  @Test
  public void case13() {
    String text = "OH,Z,6Y5H5V3Cwwhttp://www.Mh55..com.orgtp://com7Bg";
    assertEquals("OH,Z,6Y5H5V3CwwOMIT1tp://com7Bg", unlinker.clean(text));
  }

  @Test
  public void case14() {
    String text = ".t.inwww.oihk1,8j873www.U7Uww.org/TGfBBEBvqCn1TpO5";
    assertEquals(".t.inwww.oihk1,8j873OMIT1/TGfBBEBvqCn1TpO5", unlinker.clean(text));
  }

  @Test
  public void case15() {
    String text = "2jhz rjWp48TMlAq,dfU SElM,TtRwww.o/.org.edu..tvouT";
    assertEquals("2jhz rjWp48TMlAq,dfU SElM,TtRwww.o/.org.edu..tvouT", unlinker.clean(text));
  }

  @Test
  public void case16() {
    String text = "jht.infonfo.ww.nx.mLtj7w.tvOwww.http://www.Yhe  yq";
    assertEquals("jht.infonfo.ww.nx.mLtj7w.tvOwww.http://www.Yhe  yq", unlinker.clean(text));
  }

  @Test
  public void case17() {
    String text = "J/.tvO3d L.4A .tvLcMYwww.N.tvp://w.orgrr.iwww.. UQ";
    assertEquals("J/.tvO3d L.4A .tvLcMYOMIT1p://w.orgrr.iwww.. UQ", unlinker.clean(text));
  }

  @Test
  public void case18() {
    String text = "http://ommQwTDg.orgJDWght.org/www..edup.tvT4 ZUj0,";
    assertEquals("OMIT1/OMIT2T4 ZUj0,", unlinker.clean(text));
  }

  @Test
  public void case19() {
    String text = "www..qhttp://ww.dThttp://Lh.edutNU4Nx.tvW.info Ou7";
    assertEquals("www..qhttp://ww.dTOMIT1 Ou7", unlinker.clean(text));
  }

  @Test
  public void case20() {
    String text = "NYG65XNd.tv.PPw.hywww.uwm.com.comw.http://www.TUlc";
    assertEquals("NYG65XNd.tv.PPw.hyOMIT1w.http://www.TUlc", unlinker.clean(text));
  }

  @Test
  public void case21() {
    String text = ".combdfC1htwww./www.twww./www...tvQY28ig.tvinfoJXS";
    assertEquals(".combdfC1htwww./www.twww./OMIT1infoJXS", unlinker.clean(text));
  }

  @Test
  public void case22() {
    String text = "oHerJyi.infotvAN1rf http://www.wwww.ww.MfBhG www.k";
    assertEquals("oHerJyi.infotvAN1rf http://www.wwww.ww.MfBhG www.k", unlinker.clean(text));
  }

  @Test
  public void case23() {
    String text = "/QxZQ.info qwww.hwww.//ww.infoB ,q.info1mi.tvww.HR";
    assertEquals("/QxZQ.info qwww.hwww.//ww.infoB ,q.info1mi.tvww.HR", unlinker.clean(text));
  }

  @Test
  public void case24() {
    String text = "H 2.tv2HPF.orghttwww.vww.g7GMhttp:/www...eduJO/AzF";
    assertEquals("H 2.tv2HPF.orghttwww.vww.g7GMhttp:/OMIT1JO/AzF", unlinker.clean(text));
  }

  @Test
  public void case25() {
    String text = "NJjZOJHmiog3wwhttp://91www.info.orww.orgTF.tvKkFWs";
    assertEquals("NJjZOJHmiog3wwOMIT1KkFWs", unlinker.clean(text));
  }

  @Test
  public void case26() {
    String text = "q,Rp3.tvt.ewwwww.ebwww.UQ.info5:.edup.tvwww.www.AW";
    assertEquals("q,Rp3.tvt.ewwOMIT15:.edup.tvwww.www.AW", unlinker.clean(text));
  }

  @Test
  public void case27() {
    String text = ".org.com.xKubCUVy.tvhttp://.tvIWDA http://www.KO7Y";
    assertEquals(".org.com.xKubCUVy.tvhttp://.tvIWDA http://www.KO7Y", unlinker.clean(text));
  }

  @Test
  public void case28() {
    String text = ".orgRwww.http://.orgeFG/l2t www.w.iwww.vFh.eduxbMv";
    assertEquals(".orgRwww.http://.orgeFG/l2t OMIT1xbMv", unlinker.clean(text));
  }

  @Test
  public void case29() {
    String text = "qbw.t.eduwww.eduwwww.pTrrGE:8m7ret0.o.orgOv:SnJuOI";
    assertEquals("qbw.t.eduwww.eduwwww.pTrrGE:8m7ret0.o.orgOv:SnJuOI", unlinker.clean(text));
  }

  @Test
  public void case30() {
    String text = "JUP OQh.infoWrh9fG.orgttphttp://i.comwww.KLwwwww.X";
    assertEquals("JUP OQh.infoWrh9fG.orgttpOMIT1www.KLwwwww.X", unlinker.clean(text));
  }

  @Test
  public void case31() {
    String text = "rM5jhttp://.comBtw.comghttp://scm.edu5wSh.cowww..m";
    assertEquals("rM5jOMIT1gOMIT25wSh.cowww..m", unlinker.clean(text));
  }

  @Test
  public void case32() {
    String text = "tE0prTc7 Jva CTl.tv.tv64Rbowww.EPwXqhttp://w.infoR";
    assertEquals("tE0prTc7 Jva CTl.tv.tv64Rbowww.EPwXqOMIT1R", unlinker.clean(text));
  }

  @Test
  public void case33() {
    String text = "www.JIh.com//bNB.wwwww.rg0s5h tbU.tvHO4F.tvkU.orgn";
    assertEquals("OMIT1//bNB.wwwww.rg0s5h tbU.tvHO4F.tvkU.orgn", unlinker.clean(text));
  }

  @Test
  public void case34() {
    String text = "f.eduw.1v.orgc 4e/nqKiuAmqUmwww..cwww.tp://B.tvur7";
    assertEquals("f.eduw.1v.orgc 4e/nqKiuAmqUmwww..cwww.tp://B.tvur7", unlinker.clean(text));
  }

  @Test
  public void case35() {
    String text = "UbE2l,jy.comww.w.orgin.comvwwwww..6:L4FgSDQ1rh,ph,";
    assertEquals("UbE2l,jy.comww.w.orgin.comvwwwww..6:L4FgSDQ1rh,ph,", unlinker.clean(text));
  }

  @Test
  public void case36() {
    String text = "http.orgww..e.tvYdnwMNE4jhttp://www.m1www..vaFvxQh";
    assertEquals("http.orgww..e.tvYdnwMNE4jhttp://www.m1www..vaFvxQh", unlinker.clean(text));
  }

  @Test
  public void case37() {
    String text = ",,www.Hwww.www.j:jFs http://www..eduRLw.ed.com19X ";
    assertEquals(",,www.Hwww.www.j:jFs OMIT119X ", unlinker.clean(text));
  }

  @Test
  public void case38() {
    String text = "hwww.rg/www..infoOe.infoZ8www.org .org.Y4Q3 www.cy";
    assertEquals("hwww.rg/OMIT1 .org.Y4Q3 www.cy", unlinker.clean(text));
  }

  @Test
  public void case39() {
    String text = ".bTNh.tv://www.whttp://www.I3gnYwww.A07Rwww.f.tv5N";
    assertEquals(".bTNh.tv://www.wOMIT15N", unlinker.clean(text));
  }

  @Test
  public void case40() {
    String text = "J.1.comxgFhttp://p:.tvomJ3YFBQ/eI.comykDcPwww.eaVI";
    assertEquals("J.1.comxgFhttp://p:.tvomJ3YFBQ/eI.comykDcPwww.eaVI", unlinker.clean(text));
  }

  @Test
  public void case41() {
    String text = "N.edu://www.w.A4/knwNwww.RwI.edusK lwww.mowww.eduY";
    assertEquals("N.edu://www.w.A4/knwNOMIT1sK lOMIT2Y", unlinker.clean(text));
  }

  @Test
  public void case42() {
    String text = "oP0ye.edu.com://www. hrwww..com://cwww.iG0Dq:.Vlll";
    assertEquals("oP0ye.edu.com://www. hrwww..com://cwww.iG0Dq:.Vlll", unlinker.clean(text));
  }

  @Test
  public void case43() {
    String text = "1Rql .com.I.tvtvw.comAhttp://www.zZhttp://www.hT.C";
    assertEquals("1Rql .com.I.tvtvw.comAhttp://www.zZhttp://www.hT.C", unlinker.clean(text));
  }

  @Test
  public void case44() {
    String text = "PeBKgD P3http:///www.rgtwww.tvc4a.com.tvf2gAZwww. ";
    assertEquals("PeBKgD P3http:///OMIT1f2gAZwww. ", unlinker.clean(text));
  }

  @Test
  public void case45() {
    String text = "IC9KoiHYr Gwww.F.comJJ e kwww.wwwhttp.tv.infouWZiD";
    assertEquals("IC9KoiHYr GOMIT1JJ e kOMIT2uWZiD", unlinker.clean(text));
  }

  @Test
  public void case46() {
    String text = "Zu7yiI4 .eduuj.o.orgww.www.ht.edwww.orgpll.xx6uL3O";
    assertEquals("Zu7yiI4 .eduuj.o.orgww.OMIT1pll.xx6uL3O", unlinker.clean(text));
  }

  @Test
  public void case47() {
    String text = "Lcx.com.K:uhttp:/www.o.comgNXoVH7http://www.7/sDdN";
    assertEquals("Lcx.com.K:uhttp:/OMIT1gNXoVH7http://www.7/sDdN", unlinker.clean(text));
  }

  @Test
  public void case48() {
    String text = "/wu.eduwww.edu://bY8dehttp://p://.tv.infowww.OM, J";
    assertEquals("/wu.eduwww.edu://bY8dehttp://p://.tv.infowww.OM, J", unlinker.clean(text));
  }

  @Test
  public void case49() {
    String text = "Qwww.6UhsS.com.ww.nW2I.http://www.foPn4Qv9w.orgIqh";
    assertEquals("QOMIT1.ww.nW2I.OMIT2Iqh", unlinker.clean(text));
  }

  @Test
  public void case50() {
    String text = "Ce8CT0MLNm NKhttpwww.omwww.infoaukjhttp://..comYLS";
    assertEquals("Ce8CT0MLNm NKhttpOMIT1aukjOMIT2YLS", unlinker.clean(text));
  }

  @Test
  public void case51() {
    String text = "http://www.www.com/www";
    assertEquals("OMIT1/www", unlinker.clean(text));
  }

  @Test
  public void case52() {
    String text = "www.link.com.link.com";
    assertEquals("OMIT1", unlinker.clean(text));
  }

  @Test
  public void case53() {
    String text = "OMIT OMIT www.sdf.com";
    assertEquals("OMIT OMIT OMIT1", unlinker.clean(text));
  }

  @Test
  public void case54() {
    String text = "espihttp://www.tvporg";
    assertEquals("espiOMIT1porg", unlinker.clean(text));
  }

  @Test
  public void case55() {
    String text = "abchttp:www.abc.com";
    assertEquals("abchttp:OMIT1", unlinker.clean(text));
  }

  @Test
  public void case56() {
    String text = "hello http://aaacom hello";
    assertEquals("hello http://aaacom hello", unlinker.clean(text));
  }

}
