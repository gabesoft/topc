package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class GraduationTest {
  Graduation graduation = new Graduation();

  @Test
  public void case1() {
    String classesTaken = "A";
    String[] requirements = { "2ABC", "2CDE" };
    assertEquals("BCD", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case2() {
    String classesTaken = "+/NAMT";
    String[] requirements = { "3NAMT", "2+/", "1M" };
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case3() {
    String classesTaken = "A";
    String[] requirements = { "100%*Klju" };
    assertEquals("0", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case4() {
    String classesTaken = "";
    String[] requirements = { "5ABCDE", "1BCDE," };
    assertEquals(",ABCDE", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case5() {
    String classesTaken = "hi";
    String[] requirements = {"100", "16abcdefghijklmnopqrstuvwxyz", "21ABCDEFGHIJKLMNOPQRSTUVWXYZ", "43!@#$%^&*()~-=\\{}[];:\"'<>,.?/"};
    assertEquals("0", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case6() {
    String classesTaken = "_B\\/gcfivOQ]}=pyTI;&x~d?D@{ZG";
    String[] requirements = { "4c*JMpAm@/'k[>G(bZ?\\/gc\\HoR", "1mX<!,[_" };
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case7() {
    String classesTaken = "tSl#Uw-{pg/DWZ+NKr?Gf>RAOVYj^E,JP\"B";
    String[] requirements = {
      "2L~Y`eH<GO}Xv", 
      "4TDjeH$poumJ\".Xw_%OyQ{PM^g`GR]/UYN", 
      "4/wK?.'J", 
      "7|<OXRgZi;qw,tm$e\"AYlU[].E%@_u>{", 
      "3|(,u\\v%'AcBY!s-fz`rq;ToO?bW", 
      "6SV>QE.tw%]*D'", 
      "3nB/a|v'}rSf\\cWAOX{^.&?\"HjV:[q>~", 
      "7x|-][S=I+\\pQC'HuyAteq;c.<sd^oBM:k@fUlTi_\"Lh!N~J"};
    assertEquals("!$", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case8() {
    String classesTaken = "_L]hM-S^Vt[zN+";
    String[] requirements = {"4lLk-%+yvY~b'PSg$q,AscXw}?I`feCH>tZ(Gj<\\{_Wopd^a[", "2TFLM@#Aih/j{", "1J*p%o$\\lNak{erbC>nv&_;PX[G"};
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case9() {
    String classesTaken = "w`-k#>}'|;vdY.VsE~=Ljf)*/I+ZWU\\^";
    String[] requirements = {"5'uX*j[N^rD_E<wn", "7LG|W-_UxpF+\"S~]T*<raRuz#wYfth$JA:,", "5y\\bL&{O%-J/:<UZ>kgY]dp(e_s?VTu)$IQq^tFnz}W[Ga", "2UkDQu\"A.%(]c`j|$;T!-vFoJ/mHM#P_&lRGntZ>=y", "4>QCdu~)'pkrHgPG.fKXAz!"};
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case10() {
    String classesTaken = "Tq<v/%]U=)-kW}?&Fh";
    String[] requirements = {"3.(]S", "1\"?i*E%$)", "7SeFlPbw\"G#YH:/=[O+prnis_DoaIt\\}L$qzAUdk~N.@m", "5HQ)cMtV<!Ta]u(O'[:=fFR&;nm>q\"/-hxUiK+WvLG%YZzrI"};
    assertEquals("(.", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case11() {
    String classesTaken = ";u*mp~kP$bCtdS|qY'Es})B&#gTwo<zc";
    String[] requirements = {
      "3lJ|A#z?[%U", 
      "1Cxt~L|Z&f(=`_$ScE^ao*>j)UhQimBzD<RvIGNp%{", 
      "3g@#v!A\"xSQCTy-'k(+_;D.rfnsu[N$L&w?a/q~GY=p)hjF|", 
      "4Xm|_p", 
      "4#'\\VnW?hbRL|)vFyQ[@K:$_Bi(fP", 
      "7mX)=|I/Wg\\f,osaP+eZR",
    };
    assertEquals("%+,X", graduation.moreClasses(classesTaken, requirements));
  }
	

  @Test
  public void case12() {
    String classesTaken = "~PAGy@Qo+#ahsIW&i,m";
    String[] requirements = {
      "3-Jz:lcFN`B;r#L}", 
      "7_W+D^L]M[i~;", 
      "3]*h+MVR|@Tynx}c&pFemCtY=?bqf{\\)kK>_%", 
      "1+$!DfGmx`vj)tS^OApl-XW[}uBYi_~KZ?%=nI\\&"};
    assertEquals("-:;DL", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case13() {
    String classesTaken = "?DKPy~jaiVh${bs)q(\"e:`uMd!^]S";
    String[] requirements = {"7!pD*jSL_o`tJ\"bXh)", "6KF{T?JyZzQcbWu&qdl>)Xt[fIY_hVwe-/PS", "1o=(S.kQEi_>mf;$stg\\T:`/Rxq", "2#ofdZO(q+Qp~:ltg\"<.HG>AXE=r^", "6-*n[Lupf,A}+m\\o^`{XI", "2V*s'\"#}|q.FAU]v^%@+B", "5fB|TOvC(a%AtoD&jJHV$n)RX:b`F*Q-\"w"};
    assertEquals("*+", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case14() {
    String classesTaken = "NaGeb;q_WyX(P/BI!U}`FiVlJ<=w\"jH],>%S[Ov";
    String[] requirements = {"7oXjy\"(&,v/~Irf!)-wScp:>P<e+bZ", "1'T,}Bxu_*VUqP?rl>pea)zghCf", "5dBp}V", "6dvB.!pun%/j@DLZ`N=PTO-RiW\"MCaS;?$csH*IK:'U\\z)m", "1xfNi;U>Ro&:BHgG#E]tW'~\\ICpdabJ@", "3,KfDti-Zk/+>e\\d", "3aw`!|{\\X=H#<gpP(\"kdQtG@qSM:+m-f_As]DOE", "3o)_v!Qms*FKzXhW^D>a@-Ej|G\\{]yV\"BwPl[#", "5kR`mexra_/fzl~KQWV}u@gG^J,+E(<{IBY.!'iL)#MpOAvF"};
    assertEquals("dp", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case15() {
    String classesTaken = "~'(d{yH|Ac+f].kxnBQ";
    String[] requirements = {"3cK_pNsixDGa^J#lBT>k]\\[<L`?'&PSXOCRMm%~A!rE}", "5etH(b;GOQZB}E%`@", "1Uh.M>u\\vdOtSl+-]gH?)I|CT", "7ODMvb@Zt_\"$!S{mg`YpK+haI:RqiNX>/A'", "2]Ppt$bU@x+sg", "3$VZI|sF#GS){Dycpo>aBg}YO]LJef@vj,A%H", "6dW(DoQ)/F\"_h*L^t", "2'MJA", "6Yl(ktBZPwM']Rr@H%,UE#A;I\\>Qy?~pNiXzmD\"+=jL[{*uFS"};
    assertEquals("!\"#$%&)*,/:;<=>?@", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case16() {
    String classesTaken = "nEKsSGax:IkZV[tX)=bu-z}_eJh@.AQDBd|";
    String[] requirements = {"4faGlCLm%Ec_jN\"'+{ZMiV;xqI~v", "2aj,p~tFdfmWArYqyKZ:!P.(V"};
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case17() {
    String classesTaken = "";
    String[] requirements = { "4ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvw", "8xyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrst", "11uvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnop", "10qrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkl" };
    assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefg", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case18() {
    String classesTaken = "<of\"~U/>B`rmi=zF,\\V#Jt.c]yA_e|$";
    String[] requirements = {"6|poWvV,m{uricF[_D>Ux", "7~t]vYU'g;E+F`wjRPSu&>mD/d<JMkzA!Oo\\yfNXx.hb${-QZ", "1Nl*}_kE|{B/guvs!cI]LfxUZ\"H;=F(JeOhriXAT-", "5m/h<,n_C`?ulI", "6[xt)BY]G!wsLrN}a$mXV~>WFeh", "5XBb|%CpxomV", "1SQ`$nI*GyV", "7Tbd>Qc+mWt*O\"sS~#Inal)AUC!BDh:rGpwFz", "6tZ-lD>Y(;&VN:Gvk_c#|\"n[y'Kz@OdW^b~,So", "1T^b+kXS_VJK}URs!a*t$WZ]QE", "1VkZ*Q.Ept,TY\\{Mf$P\"nH&biWN/_y(@|!eB#u'mw>z}=ROg~", "1ma~_oNZ\\ipOy:%*ePf=?F!+XY)}I<", "4PF|o>R@+N&J!.IUcr)KuVOX?<vfW%", "6B^M+ER{C}ir", "6(|H$&ud{CI#}/[Z`]R", "7'eGX`:,{}zZChmOfH.dlUr([&og?I%St~M@D\"", "3c{@p:\"y~Ks&.jx;^m!E", "4(qBQD:/LiV+-Y", "1Yzi@[`-AQMe}RdfyaXZ", "5hq?vbJPy|sT<Et@\"j~i", "1+MmdpD!UBr$tgl|\\IYOXae.W@b;Cc<-(j}?R_wJTLA#EN[,", "6nU#i@LXP'_q&lO*V;TjeS]\\)-cMr`BWsyf>R:/ZD(d.x", "7gR\\Yym)a]S*", "5=V:sElC@t$BLYDOoxnTwb?y,].W/c}JZQum>'\"p-jkM|&[+%", "3O'jclL:G", "1{u[<;C%RVZK#sAmW(MxlF+jE>bPyth@QXGc", "4r/sYaM-\"p)uW,k(jNg~", "1xUsLr=D`f){oGWgXil/O(I;.j,&_Cd?@}[bytmn", "6PO=+/g`T<hDV", "6QauNrVy$hwBO^}J*f\"b`(j", "4'iNjF;ZofeP)@M*w", "3c^M,*T/_prP!QeGqm[tZCzw%'JW(}?|g\\Uv", "4|F@bL#^KtH<a!yVwfk=,uZE;zi", "1B,q_A<", "7q,o?EDTp=HL\\l\"V~[.j+X:#b@gM|F_Q", "1?J!ls_x<\\#|a.nXy+-MqZi", "5a#/gn[U'm>;,EYvQd=", "2Dj[%=?_iIx^af", "1iT&]sxE,tM\\a+~zc;j\"ov$}.", "7tgwE/G.L>HdR[A~hQ|YVKTz^W", "1?YT,d.XAo^{p$}\\LSy;R@~ju&wVr+/", "5akG&mQhNC", "1XaAGgRFQ?!ntJ,kKs@Dl<*=NY`dWqLbx#pPw-f", "5%v!Y.$PetW=IUR[\\'}#", "1@`v|!}OeP&xQW:Js)ZMlH('$]\\uLrUVXjah", "1-'\"Ds;bv>+V)BofH:\\U}`TYulCONIJqM]~&,X[ak@KcmEe#", "1hIL\\'&v#{adU|tRw", "3be?f\\PG#rZ@WtL(&ig]YH", "6><gT`%~G-PDHz\\'d", "3?lnzfhk|_Va}s\\-:%F~W"};
    assertEquals("0", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case19() {
    String classesTaken = "hLN$";
    String[] requirements = { "3^fh[<V@;n.aIU]DQ)#Y+\"%Wpmesj/FG`JCM=v", "2;$%mz'", "1" };
    assertEquals("0", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case20() {
    String classesTaken = ":\\traMFbP_<^W\".[KC,z&ITh";
    String[] requirements = {"1.PJ@jsXiV*`k\\", "1lH_peAJgv~X}'[yaO%ErDs@#M;|N+V<C)PRuib.\\F", "2I$<PmBvXfJ(c?/Hiqe,V_ph+Tyw{K`^\\OLaM\"R|)U]%kx>", "2aj$Wpo[]B\"tgZxDPMf+(~TEKXce'&S:m>wrh-L#FI^u/Q={d", "2sq!xmhkKzY>", "2XU,sC<wo-d](#Dx:mMTc={IjiNtS)Lrg^@\\f`W*JA", "1^zU?:iBG*)YuNe\\", "1!fd&>'|aZ;b)=OCwnH^h", "1N'I", "2F>#yvNX", "1OpFuZoN.J+hK\"V", "2(Eq<'FS^)j:}uLhVza.>XsiA\"!JZ~t/|", "2eB?@(RhPpz;bY+\"\\E/f", "2',_U", "1~QSlPaIqL$oji`m:wyg(CcW?;)>ORk\"YNVt@\\", "1v!b\\", "1\"\\Jrx@$F", "1)Bb/u:PDAdx*LnY$+zv[UmWZekT-\"|", "2Tm=_iGqD+v\\CkKZ?}jY%IgJ'czV)slM(-n@S", "2+YX]qL*J)-~p:QM'K>De|G!cUOZhFu;ydkTs$S#iol\"}", "2bt>KWw^.i}+Nr~&/%P*I{\\l[(GZ`a_BkY", "2e~id'", "2Q~jwLN$ZBYvOxUt]^&/*[_ol", "1[Ek\\;dg()K}:y!ljOW]RB>,\"D~Ah-", "2HphOb~Y]uX</^N=,stDgcj*#?lTSzUVAi}m&wM`{", "2@+j;|)_'w=\"\\d~{", "2/V&{<(MA+~k'z:?d.OpKwY-PH=uyGxhI>XBTqtR", "1vKz,}`pX_'wIZ|oiA<ErUbF?!]sGct", "1tR*NIf;)h", "1aFsw:eGC}cJ`%Y@PqL[uB>vi|KjI'-Rzfh,$x)yA+tO(", "1}\\", "2T,Vb_wrXc#L`aUFiq}*AN{I@Z?KPD", "1w.#Z&pi?HXG^$/~_cC{]RKTs>(!t`o\\b<", "2/[?@n^fL#t-IjA=WzxaJ$", "1POmN,iCkhDlS.%z}yYGIAsU=pL]qR@'{T/g-ao\":;", "2a_\\EOlG.ZNd^KY]eF%)", "2{RZ", "1@sau", "1r`FWS", "1#tkP-e>SJ=VMl:^Wj`|B{zLGd*y?~AwbY\"THK", "2]-|E%{gZN*H}mteO", "2?uRg-;hC&,oZli\\`'a@p)yKLXw$|YEc<D%{n:/FTG>VJ^", "2]>PK<rk", "1rHAOEqL,T|/#F!", "2]N", "2c'IHWN", "2>{(@", "2yq~\"<!naFTgPZM", "2:`}FjA#vN$lV", "1pG%?vUr]De\\uM&yVkLNmzAs;:RlXQ+~[\"O'@x^`#FTanHbwS"};
    assertEquals("!#$%'()*+-/;=>?@ABDEGHJLNOQRSUVXYZ]`cdefgijklmnopqsuvw", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case21() {
    String classesTaken = "zw/hR%>PW|\\?";
    String[] requirements = {"2tE!,[}wB]lnTPOoQv`_<#{X-C'(ep^YN", "2@;T$NJ\\rX:]gY%Onk'|MG/{", "2Xt{puoY@:rq)Z", "1_yJ;)w$hOc", "1JF$q}z-)P=/yuV~vSnMDd,", "1J)jPQ<&VfG.Sr|yL>g\\q", "1=JQ[kD)V@~iPr;xoC-l,f_M'`uB!L&<mZO>RvYp\\Hwq", "1=D_amL?!C\\V,i`*WK);Htrp^[yk/zh", "1,i@*r<tGFa&kshS>}-REf`{=[wVzQ/M'", "1Jn-Cy(Xd=vLZ+Q/bz~$?!{qmu;sOg<PU@GTEl>wrfhec#", "2DqacBYms=eC,<Gn:d/o", "1^K<-eZPs[i\"NE/", "1T.zu|dYbc=\\CvO&#@f!VJeM$n>", "1jXAhwBODef%!k+iU\"\\", "2kXeoG*Qgr(sp!caFK/|q,TZS=>[j~?CJvB}DwtRlV'%.\\", "1>N{CePofiaIY`tmV", "1}]\"=IE+qiGMHD", "1e", "1hiq=K$C*HR:Vefb_'-ZmztN", "1d~`sh!nI[r(RGuvxt\\PS+|kAia%", "2XqOm'*rCB[i+Hz>we;(L{yGn)#WU=u_Vvh", "1;fJo`+:CPcY|LdA!V", "2vnZ<\">~zws%*,u=MpUGWhQ}IV[x^:?Ba&mOr'X", "1s)IkL'!vnZDq]H\\>.[y/e|ogJPh=Y}<:S*@CiG#rV", "1N['=d?Up}E%C#-mf\\>e`&RIvL.GTcY{$zPZ*j\"", "2\\GVQJ$'~usxLF;{}yH*o|-gAaqfrlnXTDp", "2|'fw,BZlN?%M>(;U$vHsXIuSiJa", "2k@~G:cP)sj#%dT;(-/<Y", "1fv-jo&?d\\UipS[.:@'=q", "2!xfbZ", "2S{F@$VOpmae#zR]uGY't_%qZ;W}", "1&R=E@$<_bo:Qf,ZnMGHAg`/", "2iK<.o}M+XE][-\\\"wOpxCP#(zm'cn$kVSIa%Tdvt*A_", "2>;[q-GZ\\", "2~>z{pZO|&sqEu:g[NLbj\\.o*]m=UwJ?RX$_d(TlSVCQA;e", "1lXO$eI=N/iq,b", "1m*/\\Rx@iP!S|=`", "2.b?vl-*Kg`'@W,LP{xiphN%(", "1'grA:^?RT%HFMf[eli$\\GmSYz.-Q+w@L(V", "1\"E@Hz].#n=S-q", "1P/QW-j'd(\\lE)K`?{J*\"UC_~}VtD", "1=.>(\\WXPSsNajGJdg,:}r@-mIvnC)zFf/", "1?RF,_umvPIrOAw'iXBKtTfoVz=Nd(Q|&<L", "1r[bT", "1`%bCvziFdYXK!tETxW$Q&Z/V#GNoDA{}'\"", "1RtH]u-)P~#E{vjsd,c", "1\"PjIkYGi`@).ORmE;x$?}", "2s]uV[dTISn_!Mo", "1lqY*F,}T=%;UgGDxfd-Q?+@(\\'ZbPmziy~", "1Gb@B\"z>)tU($|aN&Wgve:EA-?;V\\}+pfQj{"};
    assertEquals("!\"#$&'()*+,-.:;<=@ABCDEFGHIJKLMNOQSTUVXYZ[]^_`abcdefgij", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case22() {
    String classesTaken = "bR#-)zaS_c=,P;l~y[$F\"<Yt{.|LGQ%x*igOZdwV!^fJEB&m";
    String[] requirements = {"2`@*~|ika/PjA[&EJ{ZVu(!,cX;sSnm:G\"fO%)Q>l", "1!<c*H", "1kcWUfp$eM]Lnbv)~_\":", "1-(IpGjKbNl]:ePLYwyX{rt+Fnu", "1<G+&;/!gx", "2p#", "1)Db[XK,=pYfec'L\\j.&Z%BvdkF+l$OgJCI-Sz_P{;", "1sTSd+eQZ@u!n(MJv:W[XFD?%Ng>|IcUq=)`E*~Axt_m.P", "2+SsxI)PFbT`Oei%Vy\\_", "1saT@c:)HmizE-Z!`/IFy|QSr^X?NCY", "2Ow!rX#{IPn\"zB$`*", "2`OGh/$s\\.<AgVLtS\"", "2y\\z`g.x\"G=t]VBsuR<e_-!wf+na?q", "2L}Z", "2a/!^W&RHEYgKyL?{n\\IsQ<|tMP:v,F+=J#`", "2!K)uXJW+PeTvNIoc&", "2wsb};tg)qd&WKj!lLN_G.$:|>YCP?(", "1f*LIiK|x", "1u*jQ[A.G;xo_(=\\'gciLdt-n+)?%R]zkFZhNXSme", "1/}\\sOM.K,+@C_?ecNz<xR{v=$^]Puwl&`-nByaJ'>[)", "1QcDfR*}U'`@=qAx#%y.<i-JT_O:BNw/^ehPdaYZm?b", "1|F{I$,k[D*`mpxA\"]MuoidrNUbTwC}O-L!Bj<S", "2z?|(KYr;<V{\"#", "1+Im}]Ax.&T", "1U.v=%S)XIGO>fe-lwEs{zH;u@<\\", "2Q)|&uJzV@pR]rtcmU\"d_,Yisq/PaD[oh", "1.\\rojH", "1s", "2?h<r%z=O,N`dJKaj@$v;MGlEUs}PpR|+", "1;s&:c*FHd?#GOQm-JP'KA[_!Y$I", "2+O}YWN/MG", "2%;#B][V\"?}>$_:", "1HQ+_GFd/>Mye{`,JDR|bL@#Cp}g.iK", "1&/#es*JZ", "1}IVFAe`yG'K*U>", "1XMP&rL=Il!VANhd_.C#-mn+RG", "2Ag)oxf+?IhUpP:Z%`!Mislaj[SFnr'}KcXdu|*Cv_Q#Yt", "2HMo=!WVLCfk)P+?'Xp*gKGhcDQF;N>&E}JU_u", "1!_%f^VU|aJpL&Q\\Rog`$D,v", "2<?gf-|(]kN&tAVeM.B~Wa:YFP$EI", "1m=LS.U_o%[(f<QP", "2BF<$h`MI([n%RP/eQk_DU@)!", "1GYRQ.[d'mVaXy@=h]Hn-^/J*?DuBc&_%)\\#lv:Wg(PSO;\"qI", "2bmtueO${lwr&s@~ZzR`VB)_KUqQ:D", "1F=BK`WRqed]/HX&;$C<m,LAE!~ku}Z+v%#{sD:I.OtVT", "2Qp&J`xzlkfh{:VZE_", "1r@", "2&NCQ~neSDtklgmK|pVa}x[ER\\HY@Ubf>F(O", "1#GNo!nKITZg(Fqi/czaLlyH_]+{UQAeB^X)>p|Y\\", "2{>(~\\lao'/T@sqY|e$LD+[\";j,Vf*g_FC}:^hIz`px#Q"}; 	
    assertEquals("'(+/:>?@ACDHIKMNTUWX\\]`ps", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case23() {
    String classesTaken = "D%WkP(*m@Gl;)AN";
    String[] requirements = {"1!b.CT{&KVA<}$i])^DSX*p", "1Qj/kmMqTnNfzDSPAd~U^%Yt-wy>(_+ORp&.@[W;i:|K", "2@v\"-.}bGlRZn\\", "2K=J<#w,ER>Ty*dH'Y.zLSWl%?@)~VU`IA$k\\[_/jM-uqXhs", "2Wd#", "1r%VowD@JAzPv:l", "1K.F:mt_D+", "1}ePE~[W^M,c.CU<OdS;i@\\Rf('VFTlBQG%", "2l*X)zF", "2:sOC'.(ENg@f$i\\YTdQGb=tv^", "1F<", "2M*sF>=-+BY/]lUxQ.Ip:VtdDLfK}bcvnuE$^)o'Z&Tw!", "1]F;>KcByRA&-GJvn_ih}", "2[j", "2xMFb\\pgH$D~tC:qa#|<;\"?cRXYn,[]>_", "1C$F<R@>sr-uKd,", "1Bur.|", "1FzV!i&pB.+_uW?OL>A<MRx@:S", "2Z\"@I'Mt)`q,O=<*F/Ne&H", "2Fq", "1)s(Mv", "2IBr}&wjb)\":o@E?{'Ju~(kh%*z`GnUpXTv=Fg-/q.O]!i<y", "1bh`z!.=vNus\\k'itQj@>),l[Gpc/^dI(ED", "1-RtJi*|TWCnM'lqrQVP]D}Uka\\e>bEfp$uhzZ", "2&H", "1ji&Ssg", "2JEe_;Ph.Q'Kyf~+{q`\\o?x)nDv%AU\"adRcM@T/C$", "1WzFT.X(sSlbr@KItHgadfu'\"e+:i;AZn]Q`{y[pBJ<V&Y#", "2CU[\\}rs&oI(d#bz<-L)pwy,Z`:PxuKf?V*OGMqHJ|", "2/jsDn*:N~VWew,]!vKG\\>rR;Hq_IP.ALU'a#F%$g)Q?ocy<", "2bL}", "1($uadWQyRxX):Yt#", "1$]@WZ)cf=,l-dSeRv`pGg_", "2tUlk%D'u", "2>Td]UkqxsG@=\\bhmt-?E}ljRcC\"MJ$NOQ~/&<", "1Lti!_xJRe^F;U|qpwg#", "2xv+P,T<Lz%JU.WeIq", "1T/fr>'hj;s{^=M)V`yCzP\"toRAB}n\\q.w+[XSJ", "2cYvyJHIZX,S{`+uoQRlwB:K%!r\"O-g=hxW\\#i", "1$FuHKACJOPjqN+oD}EbZ&%<lS!cm_", "1vHAB)DZ|Qh];L}y~k/@MNC_GO,WJd(cqb", "1jhm\"$:@%#eB+.v}iY;'<FkpMq)-s>\\*VI^R_/nUtoGXcdD~", "2;T$.LuN?sfhxHJ&`!W_#|]bSBv:j[", "2x~LWe`k'@<ZREp?|loCX>,G^\\{!A/j:JT*z]c", "1h(dK,Gc&JB?g'", "2r]pl^DR'@T&GIWEifk=%a-x$Jj.h?v,L}zB<w\\gN#nqmA", "1Z[$cDP@>^':ld-(xjXFNR;<&`*hOtoErMfB/p!", "2'`ShE", "1?cwZU.Str-NH+|VA`zk$CaD!,:MgIvj^*dWeGf>YFL&[q", "1ca/"};
    assertEquals("!\"#$&'+,-./:<=>?BCEFHIJKLMOQRSTUVXYZ[\\]^_`abcdefghijnopqrst", graduation.moreClasses(classesTaken, requirements));
  }

  //@Test
  //public void case24() {
    //String classesTaken = "d-zy*]ZrMoc_}`Ow<iFLEClhU";
    //String[] requirements = { "2pC]=SQ+", "1F!)/WOljp;YA-" };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  //@Test
  //public void case25() {
    //String classesTaken = "ATaI-wN{Wi+q>~|,K)'.yCnMv<`drjEX_D=hB$o;";
    //String[] requirements = { "1XAsKJaUpo(gLrN\\/gcjeh/bB-i%=,?zq&FDl)`cwT", "1OhG>" };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  @Test
  public void case26() {
    String classesTaken = "c+M-HNgm?w@tIipZ'>Y&aQ!,:U}d)x_#hl\\/gcsjSBe=G;f";
    String[] requirements = { "1O(g~'LCSzq$jG=?" };
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case27() {
    String classesTaken = "q}u%t?$xNCAH!s^P,<v\\/gckG=nUh)d&bYDl*Q_]T~`B(VL";
    String[] requirements = {  };
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  //@Test
  //public void case28() {
    //String classesTaken = "!<eWO#RNQM*AdS$|(`%TUBDkCF\\/gcyunwI";
    //String[] requirements = { "2#nmUCtEvAaOs=`gr$Th", "1pYP:&fhnyRI$lcD*ZCK-" };
    //assertEquals(")+.", graduation.moreClasses(classesTaken, requirements));
  //}

  //@Test
  //public void case29() {
    //String classesTaken = ">rogs";
    //String[] requirements = {  };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  @Test
  public void case30() {
    String classesTaken = "{*Dj!vQ(S]W;aFeI@w|TH.$)o#h`A+z";
    String[] requirements = {  };
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case31() {
    String classesTaken = "+o&mLUfED{)GnA}/pl|FKk,H#=NbO!_jCy]B\\/gcsQw$Tucx*dIg";
    String[] requirements = { "1*n`WClk'[/f@b?T!", "1^<Av&bTOPH`$S@" };
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  //@Test
  //public void case32() {
    //String classesTaken = "tL";
    //String[] requirements = { "2Yk?u" };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  //@Test
  //public void case33() {
    //String classesTaken = "H+QvD%,dK;|^oO$#ew`";
    //String[] requirements = { "2MJn+", "2m|TWcU", "1Rj" };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  @Test
  public void case34() {
    String classesTaken = "CDH";
    String[] requirements = { "2AP", "3CDEF", "1CDEFH" };
    assertEquals("AEP", graduation.moreClasses(classesTaken, requirements));
  }

  //@Test
  //public void case35() {
    //String classesTaken = "GWO?]X";
    //String[] requirements = {  };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  //@Test
  //public void case36() {
    //String classesTaken = "]BX$";
    //String[] requirements = { "1#a;I:L.!c,'`~xNg\\/gc^h(W$\"tyZYj<[+k", "2RD|BAxq?U#l^aYt$hjw", "1z$;p#J|" };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  @Test
  public void case37() {
    String classesTaken = "+s>YK^I$/B_yiLQ}%<rX')hJoG|qaVt;bezDZSW";
    String[] requirements = {  };
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case38() {
    String classesTaken = "`\\/gc,)^s}OiL&[g";
    String[] requirements = {  };
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  //@Test
  //public void case39() {
    //String classesTaken = "";
    //String[] requirements = {  };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  //@Test
  //public void case40() {
    //String classesTaken = ":~|HdrVax^.*EusIB%N";
    //String[] requirements = {  };
    //assertEquals("!#$&'()+,-/;<JZ", graduation.moreClasses(classesTaken, requirements));
  //}

  //@Test
  //public void case41() {
    //String classesTaken = "$jIU%c";
    //String[] requirements = {  };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  //@Test
  //public void case42() {
    //String classesTaken = "SV(~'@JQ,#A";
    //String[] requirements = { "1BH~|Q#h" };
    //assertEquals("F", graduation.moreClasses(classesTaken, requirements));
  //}

  //@Test
  //public void case43() {
    //String classesTaken = "_B&{O'qD";
    //String[] requirements = {  };
    //assertEquals("!#$%()*+,-./;<=?ACEFGHIJKLMNQS[", graduation.moreClasses(classesTaken, requirements));
  //}

  //@Test
  //public void case44() {
    //String classesTaken = "a'Ecnt[=L/k->+N~";
    //String[] requirements = {  };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  @Test
  public void case45() {
    String classesTaken = "vjT&>]GAZOdu#LEJ![";
    String[] requirements = {  };
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  //@Test
  //public void case46() {
    //String classesTaken = "}HO^$L?`fKuxaDg-[i)V";
    //String[] requirements = {  };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  //@Test
  //public void case47() {
    //String classesTaken = "H<~U*(is}EmTF";
    //String[] requirements = {  };
    //assertEquals("!", graduation.moreClasses(classesTaken, requirements));
  //}

  @Test
  public void case48() {
    String classesTaken = "H<~U*(is}EmTF";
    String[] requirements = {"2\"Wbx`AI)ePjg;c%YSzi", "2OVL`{FxB'}K[?eSWYczXu.vhdZ&:j", "2i/d_]A{t", "2`\\B$Huj;G]-cOZl&W(hr^?|A_XS)\"", "1+ulqQEb{&CWyZKnthNT.*B", "1?DAc~(:}zrq\\O-Qf]J${a@R<hKx`!gIY./k*X", "2k$", "2:/R", "2*vZi{)=w", "2o+T@RV\\#tJZO^?<Ly,u`YeG'kXH)sg/nEql>:_WCij!]", "1yML", "1nD:VJiT[,N>;ly.vq<)Zm?Lg&H@Ru|}IF\\", "1Jil@Lh.)%~cCxSAo", "2d^@iw\\?&Qmf'DrGo;=sB]`", "1y", "1#H~-+*sOZa@:z\\ygfSuxhGC_", "2DZb", "1vc(", "1[xK>wY,kp-/tTMfD<cZlWhm]}_bRanz:iUQsrP\"V@NoHj", "2W{q*", "1.FP*gR\\OGzv\",XJk]c-}ny);hB/", "1YcbxiGFQsTC", "2Fiq^<#,)S", "2OYcKN&MpQ\\|IAnf#E/~g?\"t(k", "2ZJ=d#K\"UEIr)M_~jhnlY%Ly@>pzV$", "1CP>~<[|AH.l\\,!", "2hnvQg*UTzK\"sDY`JmlH", "2O-r?!#s~lW/INJT>C|eZYm(tf\\&k<$Q`{waH%*Sd", "1mp:Pcy-v{?N(U,sT;[d", "2W$s,+J{kERgmBn~:_Ic!ZPFNxO", "2yw:}UN^ix.&C!m~A(<qTVnF+>uQoabIJH\\G", "2&;CpEdoBw~b(\\sV+aZ}D^@Sfi/#)rNhHeG?Pj\"=<y", "1Es>?INp&_iyPoht<:u[ZqRwv`K%=zb!G]DQ+C", "1!<rYsQnG:L+(E?IX.=Zk~bc)OptH\"ve}[RVzd\\", "2@h~zlGiAOZe:\\{'xk.=cRNm&E>B]n,*(FwHUv", "2TBigr`+y.?t'lD%Ke$;J/q*LS{k!xuw#zOVb|}", "2dzIZq:HSa(nu|{E", "1taZ](LXP_\\<o@wM*}$:?'BhmSfD)zR&%FsG-~I=", "2CJ'$]!:}Ea>", "1@d;uhAWTc/xiX`_^PqVmHEkg'!v*$If,w>Jl<", "1k~GE]zD!jL()TK>U:rmx", "1-aipMoqS?^JKZRy;DIh#:dgCk%AGcOV|Q/bzw@et(jX", "1x_/*)ahTni]fJtQpN=(;C{Pr.wdySLo"}; //*/
    assertEquals("!\"#$%&')+,-./:;=>?@ABCDGIJKLMNOPQRSVWXYZ[\\]^_`abcdeky", graduation.moreClasses(classesTaken, requirements));
  }


  @Test
  public void case49() {
    String classesTaken = "$]&>^pyaOoi)Q(\"%zUs";
    String[] requirements = {"1#FdT?DXf\"Wum;Jz,a(", "2mKp)&Yl'UQNMsi}TuWtGIk*", "2'?"};
    assertEquals("'?", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case50() {
    String classesTaken = "DEF";
    String[] requirements = { "3ABCDEF" };
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

}
