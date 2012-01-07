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

  @Test
  public void case24() {
    String classesTaken = "d-zy*]ZrMoc_}`Ow<iFLEClhU";
    String[] requirements = {"2pC]=SQ+", "1F!)/WOljp;YA-}KDVJQ%ebRsL\\y#=^", "2H}WJ.~i'p,/cOr^u-g{\"s&n?Z#!mP", "1&Y=%-douO.},+Dt*$", "1ub}oNH-WZ[/laYXBhqrds:LS?,PV~`^w+t_e\\$m)", "1eB:g$D|C*P).>\\(TYAy`!{MoZzG@H~?}b_r/d", "1RVA(z{OUovg`\"mD]P,xHY", "1}'ceVh_J~A{O`pNK", "1I`r*pQ!?bi\\X^uBwZ'&<OY{H)x%P}", "2*M=p^htgkF-#\\y(;XIAf,x:?E.}!LwnH|O]lGB", "1$'e|@,VQo[~FSwC+g(", "1/OD[Rq]\"+dh~xT{gye!sS;oG.", "2<(le!zcb_DYR^VtG@m).{*;|,aQ>X=", "2io@t_pq=xW<Q?jIrJMe%>(ckufBH.U]!~sG-Ag\"T", "2i(@}:>Q^Vx~?\\l\"[+", "2w>QIM`cht%J+@d[TWeC", "2nDay,m['\"!Z$irLXEFf{;}Vh(-j)M~Pk^", "1ghyrS|Bz!TAP\\c-*q^LDCWUM[v", "2h=oX", "1yXPcV&>N!Rn({q<djYJ", "1NDG=bt", "2-kJ\\wyGUjzxi(`EF_d/M#", "1`|IJ\"\\[cW,oPeq{H#G?CYDt+*Tl<U~", "2#xp)gWv|<Hd*z/SI&_Qk\\UE,ON?;{=Z}$ey", "2e+{|>fU}~(<LTDX%G,=.YnEHbj@;a/Fo]:", "1gb_v)(h\"~N=mL&w<[lpK@jP#aQRBs|edr*SIEX?/kFHiGA", "1){=WM*rkTtaeNp]@YsnbdUu.C/?EIBJ\"", "2*)N=I#eEGdm;BKyJ", "1)`S{V<w!O,EjFKbT$|]o*^;:uH+Y'xBI-}WQ>C(RnM_", "1e-f{jdt&sr@_aB[)V;qmQ/io\\pLc>\"kvT`^", "2Jm/}{~gi[ZdaM%Xh(e+\\Q-I.ON|", "2PCmaj-}n%g", "2+(e-p:ZL/a{!r,'`I|}XB^>wEd&ly_K#v%\\q<hNJ", "2+/eynJ[ahqZg\\{H|='NCXw%A", "2{x!mcR=;t+<U", "2LcRlC#SF'J).", "2jmLH", "2:j[e,;", "2Lq*ZQoS-$U{GyB'epT=^Jhr?)u.g~]wP|z/l<d:NY>km[E+", "2|bA!zVX`nE_C%(G${vNH#WiL=,m@?<[&r;:JTI/ef", "2{)*iVZ&EP", "2mO.ptld", "1E:~d$Mo}cP;wYz{tF(?|vi", "2O*F<`}a,S+!l/t%skh|\"{v'x$H(@X-]^n", "2.*/VE<;^|djv'{!$}wWy?Nx:AlhaugO", "1(dby'*/OT\",PJ)B^Xsk`AEYMG@f!;Lp+j&n", "2T+=m:BrPO*aE`>F%#I(<@ngK-loG", "2kTn,;m+}G!D&$tW-F>^QqvpNKJ@OdEeML`y*afb<ACz\\?", "2E'gW>ei$VF/UR+Ch#t_JLA(Y-b*Np&ZQ%Izjq|", "2-uiS,APq#X<IzMa`NURyfx=./pWQFYeg]'"};
    assertEquals("!\"#$%&'()+,./:;=>?@ABDGHIJKNPQRSTVWXY[\\^abefgjkmnpqstuvx", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case25() {
    String classesTaken = "ATaI-wN{Wi+q>~|,K)'.yCnMv<`drjEX_D=hB$o;";
    String[] requirements = {"1XAsKJaUpo(gLrN\\jeh/bB-i%=,?zq&FDl)`cwT", "1OhG>}%Si;t!&|Uj?I'v-=Ku[", "1#&|WR:TENP?nr{oV)Z\"+IqL~COiF\\aUwvbxSfutjmQpy*AK", "1g:zECj/m*t&W!%,YyLwD.}xli=", "1PuSUz\"^?Jjkcb#aEd.YXD_Arm<e", "2\\#j{f", "1)*z[", "2_Ixl>PYjGzt{Wd$ruqT[gX]LaO", "2hKxyB", "2z.gb(CZsfyH*D^", "2&e.Z(=ys,t-PI_SDYq[H?T{)", "2^wu]WmFp[<>+Ui\"Vn)qcB.r$?j(_xSJ", "1>`~*_&t:i{y}o!^nF", "2zeGNwQh?JSPM>KUj\",", "1m@.JjSXV:UgG*Hi<o$MP/xZkr&`+qvCue", "2ndSG,]Ot@", "2pFU(l?KqC", "2sQT!;YXiZ%r", "1Ixs?~}l.F$<nZBq;M(#&tW", "1tLxQ)n},dYD{X\"=#]V", "1_)z$AC%XEuM\"sBh;~`fDr-O&", "1d)WA'l\"", "2<'Wf+BvjUw}r!m%iT/o~M>PD&Hg`GL#sXS.IRVc_bd)Q$;", "1/+z)~tjq=YlF@wUbyCdK{h(>fX_v&rSmI;E,eZ", "1gzh#;'L){vVpb", "2cV>w:Lf,?kp", "2suA!Z=DLB*GYdIo,gk\\Xw}jHltE_>M^VRxCreFWa+n@.", "2)cqJ!VKumZ{<ON+.l&wY:sCM*bz-rh@_\\F", "1@n-#L_T;mdtRpUA`joiN?PXsI&h", "1UN%;u#\\]LO=bCzQZmdt@-Eol*ewc~/+kj!_rTh", "2eW/$]a|&zI{N:PjC\"A;x(^VTl}c*=kLdK+ni_Q#ZYXup", "1L=c@\\r}~\"^-Q]%C/niNt;DTakPMvRFeS:?muXyB", "2=hLcU+_sm)~wT!R*yi;}evKa?&]S", "1:w&fP~#ytSh]D", "1XRD}iJ@$-#M&hoN", "2\"a/@HVmkh<", "1+'M?L", "2izlb(v/L\\XyH^D?dWh$|%:]#{mM", "1Ua*N{;(OgE|F$SYlnof/%BDbI>]ruKV+PAwed-jCX.,", "2AyS!)V@T=lnpLaXs}Pf-CG?wB~o[WY", "1y@;pSUxlqj}=|`~'mw/dns[L-,\\R", "2s#?g`Q:/I\"^t,.(V>k=UE'", "2}dZ", "1CF>;@dTiaKlN_`vfVAm", "1/i)oV>XEZ-qfI@{", "1]oyfz}|'I%_GcY)alu-ZHQPFJp", "1lX-gDoT|&\"[%KCb\\uv!J:<EPB{m'q`;p", "1c?q}VMFfn~zeQY)@bBH/&[#u.!UA", "2Rkwm_`DCJ)fz\\*,-Np%\"/ygt]'U&W>d{TEFs", "1\\w/ALTHlen;E#YV`RUfZXh>CsdN}Fi-Kc_u=yj^D[Iz<@&a("};
    assertEquals("!\"#%&(*/:?@FGHJLOPQRSUVYZ[\\]^bce", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case26() {
    String classesTaken = "c+M-HNgm?w@tIipZ'>Y&aQ!,:U}d)x_#hl\\sjSBe=G;f";
    String[] requirements = {"1O(g~'LCSzq$jG=?}AMxYr{vEVpJkmdciy&aFXtu,I)K]U", "1MVIQ@&B$Y?PgO%vaJ.-X", "2eM<o/='Qvm^KT+r>|#hq`I!*g~Z,nHuLp[)-Al{j", "1X|JF\\ou=ql\"/#(", "2PoNg,@M/#nx\\)tafhAvc:`[qJI_DuKbZ\"E$Yk.];RL{BT", "2$sWS~@,Q']_>P\"TCKGh{!cw(pLUf+;kN/^", "1JoYLSX|x>?;kHiK~", "2a~>?,Bf`Uc=\\d", "2c{r},z<XNRJ", "2tGPmJ^x{rN\"@sywV?H()iUcBep,CDn.", "1=lp-${", "2~C%a}w^>]f=H?Md[h@", "2~AL.^yzZK/W%u\"CF=+rgk,:ET{j", "2+pVN?c\"@zltYFqg{x&\\soGrJ<,KI", "1:cnr^C!)\\iQ", "1>NH+bD^[!=|?kUl;S`r\\O',ETIgi\"Zm@Adjfq#RG{]/Q", "1:mJaplniL'U]v", "2*IVMdN_`'oJ}%ny", "2\"j`@T-syJ[N]fI^qvzo;!", "1y_\\z`C+AF!&u.v}JjP?W", "2-Y\""};
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case27() {
    String classesTaken = "q}u%t?$xNCAH!s^P,<v\\kG=nUh)d&bYDl*Q_]T~`B(VL";
    String[] requirements = {"2JUsZBqv`'+N]~Wh:#D@p-mgCRyHrOa|(o*bjx\"E", "2!Utn;eP,B+`j/[EF%R#vY.xc?yga<&", "2Gd^jhBRCYgIw/e_xv%m+Zc?]q-#;*p&WD~oFz{i,V=K>O<ua", "2^:Jxf|G`Z{+-Y~KIc_Wuo)OFLRQ#", "2Thx", "2/@myPO#~$tFgn`", "1p=qd\"%-b,(~Nh/<I|LVwu':gT\\f^*Hx", "2FcG", "2FA`/Q\\C*kZ}L{-S^@#yG]$tWriY:|BOhEo),UKX?v&<>w\"c", "1L:X*v#HR/g})eTk@IAcY>dhQ", "1iXc\\#[`khHt,EfA_sJIlmU.!zN%", "2fYA?!RBNd\\z;}-|S@^*(/s%kaCpQZLwcD,W#y$", "1gt_lAeyRNa", "2{^:~]M$m", "1f>@J", "1MkYDN,aHc./lym\\+udVRg)&F!=(LO|U]TJSr-Q`", "1SzuQIs", "2$/?sW\\STLl}-{)%v@|#^ueF;g`\"(>[=B", "1.BkljS,Pe\\MTE&DC\")n^[<]!_OxAoap?s", "2ZG%!AyIzFcg_XOo]w~in,<asp={VD@C&q*xhM^#-L", "2X?\"`ZKcf@~FJ_yN;kI!)g-lp\\m=e{.Q", "1_Z'd+(`?B@;,Cu", "2d$oS=G@TQf{RPs~OAKi", "1em[&~^%G`<'ovOu+\\FHRs$MLcEl#z*@px(", "2$XeO", "1j!Zpb|qKM;[o", "1zF^$Bx", "2D-T_qxJKtyB.\"n\\j!|", "2.[|Bs]r@C+:upoZwGEdR)x*?f", "2!RraPo@i:#_+", "2*#RkAJsv,x}<&hL\"$HcqNyzB/|ml`;)]?KgFQ_Eejdb", "1QilN;?`~%:$b|oqX=C*gL\\+@p}Wj", "2J{]^lo#?'WD+)z|dArmFHjpwQB`YPU.,q", "1za\";I.+#)MK-Rp%*(w", "2IJ$)!hQ#]oSFZXy(<N;cu.,*O/gfd^q\\s+LpPblW:H{@nk%", "1t'QY=/rhdcB%`,[jF&$}aKsDLzS", "2R*biUV", "2O{*sv?JjQqo@a\"DWhwf(", "1kWqeP/\\Qy[NGlj_,hc;Tw')&mMaKLZfi+x@-XV\"B#IOtDAsg", "2}DY[eRrZyNonG!fkbLB@gsl+'(=.&~h>`KMpa_SJP", "1zsef#k*}.>K<p:rX,H+dORT%F$JiE?nD!)NQASa|\\(^q]"};
    assertEquals("\"#'+-./:;>@EFIJKMORSW", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case28() {
    String classesTaken = "!<eWO#RNQM*AdS$|(`%TUBDkCF\\yunwI\"x@^o;'&:-HE,mpgq";
    String[] requirements = {"2#nmUCtEvAaOs=`gr$Th", "1pYP:&fhnyRI$lcD*ZCK-}M`)jQxb.qo'_NOw%#|z\\/H{", "1Q:]yLoiUt", "1#M'-m.gDRfcE=]%;?OAPvW", "2#,R($D", "1G_LhO-zIKJDAjvoB*dN>^[#bs(?'MP/Y~CSHmx`!in", "1eiKqfrVD", "1W<XFu{(Q`K\";p&y\\}B%:Y]qPT", "1\\tNBy&a,m}n\"SK~Y%/pR", "2#\"zsYu{*kmT)C=qclnMN%hdDvX-ygeG^t@|:<Pwf;BUKaR\\`", "2<)Ni", "1X/P}+fFSwalpKQso'$(CO[b-BM.#\"", "2plP'n_+c<foM", "2je/aFJ%HE,?)}x^{gsW_wTi(R@X=VOL\\zS`qCZ", "1&k%u}g_nJAm+Q;W=j,RZhfXU\"ivNe#GTb\\", "1@Jevo$xCQ<", "1Ws/xM\"ie*^%YFBkLE'oG+yNh=]", "2LDMQu*i\\mhw)}{Ibf", "1j<", "1T.uqg&(O_mwG", "1B!*(bXvrF~&H|^Gyi$R\\jlA;:f", "1Im%wMx*|Pt>$&}GTHQv`shK.Oq,g(E@N#eSLik-Cb/cV", "2ECq^!s%\\eI=;TgOXQ*N~FwH_yt/`&+?", "1@gjFQJN+c<vfOtU^", "2<:l\\T+d/~O=", "1_uKBAXT'~<v;?{gGFx(Nph\"@Pneka][MdE\\CqOmQt", "2[$DT^", "1dZ&'pow*yPWLC]@M$RX{GJm", "1GzpDFA?j", "1Z-", "1PX~It", "1Fm]MnD/z*Vj!Tv[Wa?lu", "1P,mHuRy%Tv;?\\US'n}sfCM~h", "1g]WV$DSY/K>jsrz}@vU^PJ|p-iTwMnh\"", "2)+p\"]Eu'kU`K_Y}V?tc", "1)=:\"/oUkey<`MBcHuZ[@a;t$v(>h|,XROCdP{q?xs*rD\\%#", "1pAq`F{?m;)l^]iD", "2Fbw*)m>trJ+akA\"c{^.ZU}$Vq&-d(!\\OB/<NK?TCsn", "1/&CEk", "1KxzpQ}@EHNg)k=lF"};
    assertEquals(")+.", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case29() {
    String classesTaken = ">rogs";
    String[] requirements = {"2Kv%,sLxrAto^Bk_lpu(=ZIXyM'E:cWjfJGq)*e{", "2]Dy$@O>aZvKQ?\"Nk|:UP.%jLr)dp!Y#I}-xHq_MfVz+T<", "1\"Pv<^)z(D[jh,\\UY$", "2y-fd_>wc&sur~KN<kX", "1TROIu", "1Q*-<RVlyLj>UX\"~EsF\\mfpOr:J#ZIt[!;PD", "1#V`%Rx+wBnQ}", "2#HZ^|Lt.'{QJq-C_+E)lVpbM/vSOcfT`\"a[d}gr%xIh~mD:", "1'HN*dK`:O%Zg,tmEc^[~rniD)&L{a#x-o", "2,zbV%$WeN\"#J@vp\\]/+uF'MsB?j*~SAI", "1J'!q:vC.yaW@$eKY*<ExhNXF-]S?Qsf", "2aJ!,QhX'lg^\"R[#_K+i]OwBzYLScm~E>FN;", "2A\\TE$fn%lt^\"@;ZwI", "2M!ZTSy%mYlc>[|(.'{G)wNF\";Wn=<Lh,`Q*", "2t$oue';I%\"*NZxJBXCOv?R^qgid<Wk~]FT@S&", "2EK.oY/+P{", "1sbcGQ*}!|yq^\"@?RZ", "1dZcPB}t&CWu_M=Kg.YH-Q(qz", "1/~eq.ODb}ZSXEu$\\_&=|]x!lUL,N;A*kfsVapd(<vFI+", "2tEpK#vC[u\"{SBYxzwNidJM-Q", "2xC[gsUf@V;(dJaIvot_KRyNQO|])ln~kM&}hED{#<=*q,!?", "2huoB]Z,x!g<@?^Ykw"};
    assertEquals("!\"#$%&'()*+,-./:;<=?@ABCDEFGHI", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case30() {
    String classesTaken = "{*Dj!vQ(S]W;aFeI@w|TH.$)o#h`A+z";
    String[] requirements = {"1(\\hVJ>pyU/gCYQ-|w#dl+%@!tj'as[qr", "2)sR;Jiz", "2PZMseU(CJ{QRlODrv.jI#XKnG&-)w@dk\\", "1_/w\\F.H]rsEW}Jvf&R>q`h*Gz(d'yeCk=Bau~$oL@A#xU", "2c}az?\"%f(vW`@s,~mRZ_&C", "2^@+BV}q'-/PzswHIYCplcS$=xi:Q<|J,`U#X;ov_uWL", "2KX;t}aJEDIx/\"{s)<\\*>OL#kfG", "1rCtE<?y\\iVgM@P')[`ZK!ovfF:ak*R(W+dq", "2;q!LOob-?Hv+X.(il#mBf", "2xVnL=Ucf:Y+vDGbS'i]?&.OwX\\H#r", "2yDR^.({_[=IC;ZBd!'sn/W|GLp:Eqma<u}`,", "2*~m;UiZ$`hp.XVNsEIK\\B/JQj?!]#", "2UIiT&?(\"O%x'mrl]\\<B{`}:)/Gg.|Qfuk@e!bZ-zyh", "1riGV=T&nAF_X@`zk<^Ixj\"d#bEoh?l>Z", "1nSj%", "1rsv`'*G@R;gH.$BUOfnz+NaAcbtQLu)}wYZVm", "2-(HE}r#:*MA/N]q.T?x|+Jew)zGno\"Sd,`<;uK[iXYca", "1D*%hKkP@ZJSBlEaoT\"rd\\i_RbGYW>:f/s'~}<={-XO", "2mfrEgOh>iu.A?`l#w[INzM]P", "1lgnZB_u;<ziYDq]eS-Q./C{~p+ow\\F|Pb*$@V^=d&X", "1Fk*/^SzUOC[mV:eh", "2KlU", "1&XSu.gPmTozca-/[ZM\"_J#(v^h}:CKWylt|NfHD@p=kRO+bd", "2bn\"/K$!{zrEDN;=mBk@gi+UXVH#):]yRG,[x", "1%vl\\'g!H;Nx@S-"};
    assertEquals("\"%&',-KU", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case31() {
    String classesTaken = "+o&mLUfED{)GnA}/pl|FKk,H#=NbO!_jCy]B\\sQw$Tucx*dIg";
    String[] requirements = {"1*n`WClk'[/f@b?T!", "1^<Av&bTOPH`$S@}(:i*EIgFBat]?\"L+~)uo", "1q/hIX^Hm]GAobUD';QL,", "2`Fjh?%Lkie!|=mUztQfHK'M)_TS;&", "1J@}%f", "1E}q|MZ_p(r:^i[{=@D\\SU", "1+[j@(\"WAui", "1qE!X=b`:\"k+ho^/]Ze)\\pUi*}J|TjmYSOdtvL>W", "1ZwW<Dh)SG/|(Q=q$EzAMX_yrK{;nuT*&FPVsl}-a+Nc\"vgtH", "1iG:#", "1-$u~'}{>LXA=Maw[Rs.x", "2['$wK{>", "1Kp:h`GeaWS>gzv~&", "2Yt[caA=xO", "1\\WYgdS_=anDOe{*r',G[k", "1O#t=/S*$Yhk|f>{Jgpl}.';eQDAdUw", "2u/$WXl\\*k:Bzw>\"#KF@RcANxU%", "2EVvkie?'qf)uOMxACwRPNlJB", "1b}#:l$H{c\"", "2z\"s`Xdbo'{^K.}vO:E|Q#e[Jtj_A/Vw=cFP;W)", "1e=VG<B@~|", "2GB<|E$PFKj.,S'vA", "2AyK:_ho*>/WBeQY#E!c%s\\PRU&V<rvSd", "2IjxL}OD*\"q$\\kbS;>(F", "1f>W$QqHsDV)B.}<Z,OP'e{NzG+`\"wX;n:|", "2i(DyZ_d`p'=*[n-?+R;Lwq&!{HxOaB", "1/,\\)]$Xi", "2\"oFw^R,z]ld$u>-|@=#HB!WLGn&\\<PmQ+hYx/", "2bO@Uu\"_mM}BDPw=GsKr`cA?fax", "1+\\m,b>angBH-\"dqPK", "1QRPD>^\"W!S(gTs/b,yhrlUjf'MH{;C:)+}\\VYi.k#z@tcu=", "1j", "1|>As^%cjOh}/V(*[kByJ'd_xzYu~SC$)@.Z", "2Gkq'&d=^/PL%aE+B\\jMxR@>y`t{!$no|N]OC;zhb:", "2&e'(}[T>?C,!Bs)@IAPKX\\aNuZDjptGf", "2KEt!VndIDabZR[:(@#-?NlS", "2IdMs(yc*$O.QZN@<xj{EqVpf\"=%D#g`JGhH?iTl[uX!:ne,W", "2IycGr'", "2fGJo!^O&YNi}IyR~k;'\"ah>wADWpQ:=un-/*", "2;Uf\"Rbs(Lhkt#/yD[I*&w|=KZ'MF_-Bvz", "1h'\"IfV]z,B&yg[>ouSG", "2;Px#^Zuw", "1%HYC)LdIeD", "2{Lk(V,%opX@eH", "2[aJ|An<ky.EgVhU/OTS`\\\"*ft&!X{L:xdbsKQ(B'_}Nv", "2<CLKSAdfoR\"g@uxst{nP$[/y^lkTMV=IQ_i(~a'.?\\", "1Ec>he[suk~`*X%yI;Rz#A:Q-gnKPl\\O|)M{qUv", "1Dx^f)_~\\H]@V-!&qtZeiBKS", "2\"Ex'cfG/StHj){>:", "2&_yh(DJo={pIlwUi>MS~[bY+:ut/CG}?-EWnARxv\"NL^mce"};
    assertEquals("\"%'(-.:;<>?@JMPRSVWXYZ[^`a", graduation.moreClasses(classesTaken, requirements));
  }

  @Test
  public void case34() {
    String classesTaken = "CDH";
    String[] requirements = { "2AP", "3CDEF", "1CDEFH" };
    assertEquals("AEP", graduation.moreClasses(classesTaken, requirements));
  }

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

  @Test
  public void case45() {
    String classesTaken = "vjT&>]GAZOdu#LEJ![";
    String[] requirements = {  };
    assertEquals("", graduation.moreClasses(classesTaken, requirements));
  }

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
