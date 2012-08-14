package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class BlockDistanceTest {
    BlockDistance blockdistance = new BlockDistance();

    @Test
    public void case1() {
        String[] oldText = { "hello goodbye" };
        String[] newText = { "hello, how are you? goodbye have a nice day" };
        assertEquals(2, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case2() {
        String[] oldText = { "aaaaa" };
        String[] newText = { "ababababa" };
        assertEquals(4, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case3() {
        String[] oldText = { "aaaaaaaaaaaaaaaa" };
        String[] newText = { "aaaaaaaaaaaaaaaa", "t", "aaaaaaaaaaaaaaaa" };
        assertEquals(1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case4() {
        String[] oldText = { "no way" };
        String[] newText = { "No way!" };
        assertEquals(-1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case5() {
        String[] oldText = { "x" };
        String[] newText = { "x" };
        assertEquals(0, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case6() {
        String[] oldText = { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        String[] newText = { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        assertEquals(1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case7() {
        String[] oldText = { "aaaaa" };
        String[] newText = { "bababababab" };
        assertEquals(6, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case8() {
        String[] oldText = { "abce", "f", "ij", "klm", "n", "op", "uvwx", "z" };
        String[] newText = { "ab", "cdefg", "hijklmnop", "q", "rs", "tuv", "wxyz" };
        assertEquals(4, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case9() {
        String[] oldText = {"P k97=Lp\" Big;,", "#E(S/6:HIW}?Hd*", "#zUH7@'iVa5C\"S5\\vny@>5PiYB:IGT", "xg< Zw.", ";_q vTr4\":.=&", "MqIxn_*LF%&'a", "JCuCkc047D{.kZ0.l:AIJ|E(3v$j", "NjP{I~ hi>6gB\"@T21\\O7tI.x", "o6D9-l@sHw}\"'k3XanK.RGuN", "G|Eug/_K*4QEUH@8", "~D0S\\.@h'Yu>]\":", "=XJ}'~RvDKAI:~s,9&_)m}t+"};
        String[] newText = {"xWO+|b#", "T<c4VEnX{ww=0", "duPh7p>EM=9tlIN\\S6HsA#bz:Xl>nIm/n=A[]>?JOz~(N]T", "Cy'uff=?@&(&hn g88'5Cgsya0y(gBl}q\" /0f_S+", "30a(rro}*|GvAs+wbHcIO", "<|eVP7D/C|@|", "@bHFaL!yT!A5fg2,", "V\"0V2 'L", "kIwx}<vPsM-US)'Bn1kMU]pbXxG", "N[}8k$'F_7,q@VJ,Rr6Yh[@wej6O>_fS ", "_gaf6g$`6y'cy0", "+@X~u$to.Il:PW!buhB\\ntZ5Uh,IwLW-!'Z&M", "6Cp9x5~VIo\"UL\"03@pu!fp~Y:sawfs6Jg:w@#+xlz,_;*b_6", "Syo.W`/t^y5,LS`>^pO", "kAd|OqKPM2=!{e_<@v'tc", "nX1K?V!=`qS(k7ZFKOIG ;0\"d", "`~~;pRVAkWjj\\g,/10/]j}d_=2+zIE['I", "TeQc -/843wK7,b~3lKY", "dX[94K)#hVqU@D?{.]#Kr$K$*9K2W/if_ jP", "$j^BR<Lbg1u_Enkf\\M_CKU\\0!"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case10() {
        String[] oldText = {")I6L.z|YSZQrqnLPF,<~.c>!x</Y", "r\\H\"Fra", "LZmx$&", "6_G3KgYwbf~=WT1?,a`'", "z 43(=^v&sy\\&a,0Yt", "\\v8O{&~0G|JM#tFixoC5", "Zo(; SuC]b#N9x(d1+ ", "}.ZOjeimsv6;5CAq~ehY", "=:#Ib9`?36=8", "S,$|5mKbh..v)B.#Ly?+aw9[u.LN!@", "l9iv+D`Bde.8hT>4d~LN_GBN/b@!&", "Tb>~H>$,xqu.IX", "Xo%IHKut`Gr", "{aQ2I", "68m1vL?qeF$+zgtK57xO7!IV-kwN", "!.*neRS$+xz&~", "}?6)L&t~g}Z"};
        String[] newText = {")PGRJ'i7XFGA*k$.~K*x2@mo4N]*F*moI`Z)ZZ+KYoJ? %T9;N", "CyDC)>X0I6L.zG+lAs9|:LX9>H%?%q$$k^9UtHwTP4Qr|YSZQr", "qnLPF,<~.c>!x</Yr\\H\"FrTaoLZmx$&6_G3KgYwbf~=WT1?,a`", "'z 43(=^v&sy\\&a,0Yt\\v8O{&~0G|JM#tFixoC5Zo(; SuC]b#", "N9x(d1+ }.ZOjeimsv6;5CAq~ehY=:#Ib9`?36=8S,$|5mKbh.", ".v)B.#Ly?+aw9[u.LN!@l9iv+D`Bde.8hT>4d~LN_GBN/b@!&T", "b>~H>$,xqu.IXXo%IHKut`Gr{aQ2I68m1vL?qeF$+zgtK57xO7", "!IV-kwN!.*neRS$+xz&~}?6)L&t~g}Z"};
        assertEquals(4, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case11() {
        String[] oldText = {" T#!vR#iNYSF=>]", "!5jm", "&Z).l{T4iuueq", "tTWcg>Mh!9z-/jv%8A=n", "hAG!=ds&", "+M_4I'yDkSMD<,;,,; xAc", ">^", "0x>=To@G0f", "DH", "vWo\\K:F<g", "S69*vgBbx@*ilJ$syqz f9YGG", "0sW@&", "0;5R-HIt&eZ", "{K)B>rJbB", "u9,n!~~#W{T8ZmU1<vquj:V", "cri04PU}lC~Jfp$la", "&F#_;", "/!6:Y BB(/j\\rT"};
        String[] newText = {"T#!vHwl@g5G4{<H >~,;J^Lw %U^XQ$A-?A8T?P4#r\\lf^7^,{", "gClssR5dKe6i.0I|cm\\8A8R#sr})z.m)pm|+>GK!K)_%7;J0&N", ",[CU__:!&M=~HGI4e$**-#(^A~b6]cS\\8FJ}ZFiNYQ[C!+@\\?'", "cP($yt+SF=>]!5jm<Ym[&Z4KtM).l{T4iuueqtTWcg>Mh!9z-/", "jv%8A=nhAG!=ds&+M_4I'yDkSMD<,;,,; xAc>^0x>=To@G0fD", "HvWo\\K:F<gS69*vgBbx@*ilJ$syqz f9YGG0sW@&0;5R-HIt&e", "Z{K)B>rJbBu9,n!~~#W{T8ZmU1<vquj:Vcri04PU}lC~Jfp$la", "&F#_;/!6:Y BB(/j\\rT"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case12() {
        String[] oldText = {"0m", "Hoe|Kq0~=oM&p!G:", ";5$=TSA", "$q4(fh", "PRXpY\"mh25/v<N,]\\e2TeQ5", "Jql)HGJVG)#}S {bQI&hXWVm9$!{P", "D?\"H@,|T[If;h0YU", "\\0cOU$[}i&R[7'/F07N*kslGhznKg", "gK\\?CXFJHg"};
        String[] newText = {"0mHPm=a6PFM6(OB*v$E~@0UE)DKy@m<vnfHS74Sc'TVAICA2G3", "UZdX[3[nDYqng]6FjXy$)`2TE[0V+=C>Zr2M3nLP2}D;Eb|b?L", "V1UaPwzaiM/aC]r$8}6?MdAwtrKV<c\\~e7]jk:GKcp+i{VGEDh", "${|0.v.h4?7a(#}P\\9Fjcy\\q)#~qd%V4(q$*Wfln?29[a2[QZW", "KN3oeT#;1F-C7=X7XJ{[r)w3QYAGF41uf0~Z;O:>nz1L{|lkx2", "}+8JU-+/R:'uB~r\"tthEx5xq{;|*gdh7K~a,EKn{UAW_D&V}I@", ":?J&H|KqI9aDJ4N8)Yo@@qLvm9DD38TfV*$DKQ0\"f|ERadTNtA", "Z}_\"s@-YZ.x_&ALj{bwQD '~a0)}eoLEFBqx+wDp!p/C|O#.L^", "_u^T^'JQ0/8zn<yO^]pzgb>\"Su(&dYIo3~[[\\cVvk'Is3(T.)Z", "Q1Y)@-_N2a{=>K@q\\LE!FWK_GxqI1%$JoxUsRmksQea`DqKqVx", "8T}2ZS%?Q~=oM=Xzp?cqJ})$KM\\zR805!kN]=hJ$/4;X[}&\"e\\", "0Bx_as-Fn[&LCPOH[GT3rTm,';rF$i1v$,%:3=vz[CvlJ)Twh]", "Qt[z,9xVVzr !~e>uM1:a12k1<wLS&EYoy.)@*=C7>4r\",<F.T", "-}Wp}DF#&a%@Z:#+y!A1&/I,7p!G:;5$=TP5r+S2]8S}w-A}tE", "!FRiA$q4(fhPRXpY\"mh25/v<N,]\\e2TeQ5Jql)HGJVG)#}S {b", "QI&hXWVm9$!{PD?\"H@,|T[If;h0YU\\0cOU$[}i&R[7'/F07N*k", "slGhznKggK\\?CXFJHg"};
        assertEquals(8, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case13() {
        String[] oldText = {"<K,8M3KV|PK{4G X5IL[+>", "rX%`_-UnFvcF~U8x!6h JW4\"G{H", "$374)V>9u~[pS,_SV`Am i]N3\"", "hJW.BT1^}j,w}zGq/3F-E?$X.", ":eNNpuddq0\"=WWp'F,/$avq", "|Lj=>)j.YUhX\"#DC4[]", ";qzEFgPr7}TdqBnEjnABc-p3_.`", "v<T#Pj!r#2.=~+%@\\ ", "tx@z", "XF'kh", "Af_\\\\cq+0Ic$r/4i", "B7<m<*T", "5Yw)", "TPGDpu7-=|#", "AfW>M7Kb:762X59{fR-lJe7uC.r/", "AQcZ%,;?B~(2qE?_PL", "+)6,h&$XjH!ek880hH9&{(%nAr9\"!", "$Ib_dGe?eL3IXe"};
        String[] newText = {"M}vr%v*S,0Yb7m[:6&Z\"?>u@x6oM", "?uJ0m[4~X'CYW'=2j3 On,(CWF`a?/:1)=9}*y", " 4;&,>d^4\"ZFP?/aW)%nafE0\\*HFs;eYA~.N(/Tj_\\Fr>[", "I[sM>bjFt(qQZWPJQ9pABr!u##PE5a5->", "UWLKXNB&$A&z l@WVo\"VE8o1csQ+R~2kc}rmBe", "W:`\"S2KNxnak${!x'4\\i[UpM",", \"fWGp!zvwL<yrHk}f4aN3i;S[7\\A{)j(Kr<`~Sh9?m[7<:n", "28dsN7Ap;VMs@Tt^=\"O/?\"Y;aNAky@CZ^-o,tbga", "D4QOkCve~1W.NtVNJ#\\(NNYZ=l)Z0]?8\"&", "5{M0-Ad[+vc]6jB8h", "A..q&gwzBq)UnX;U\"CxUoMwUNqg/pb", "se>j5O(+MOcDq9!w2J8", "v/wsU{;G", "APHV>u.>&\"26(s,}HHDEUT1r_]5|UR,QA7dP", "}GmSSyCvq", "mo(|GbE51sH=]Q", "_r_/lm0&G~Moa97,${T9dN_=3C&(9L17Qm(H7", "~~rku'EJb-sY?^w{0m;yfbl", " |}5N0Tf][33@uDf82)r", "@R]v:=3T?GS!C&{aP?DdCE(Y:IycU22I>qM>GoeT%_iUpLw"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case14() {
        String[] oldText = {"\"mC$C5zUV@0d", "1JP;,f>K+Iiy6dp:DB><Si:Nn|h5(u", "33>I#{I~k_Gv-L", "vt&?>v0$Yf:ip%*/L9", "ODRq')#", "1&4V", "2_J=E`ICCa/yJz&k_,\\Q1w", "f`(2<k,zS1eb", "HJVxQG~rR,&A}8YUH", "Vmw6Fdy!x*~Oq", "i82Cn,^i"};
        String[] newText = {"\"mRteF)K*jMGl=dOWp?o2dbJS)iv/C$C5zUV@Puj?0d1JP;,f>", "K+Iiy6dp:DB><Si:Nn|h5(u33>I#{I~k_Gv-Lvt&?>v0$Yf:ip", "%*/L9ODRq')#1&4V2_J=E`ICCa/yJz&k_,\\Q1wf`(2<k,zS1eb", "HJVxQG~rR,&A}8YUHVmw6Fdy!x*~Oqi82Cn,^i"};
        assertEquals(2, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case15() {
        String[] oldText = {"w?*..}Q*u<_x(/Wsi.@s2`z?;#$QV", "OETIIm\\;V@", "7Hg)>WS^kt{fH4~gd4=", "VSVq\"'P0", "P }yu@E>{|U.*G=zhP^?$Sg;9T", "Acm^-Q^!~jkA*FQ:Nc-Y:rT7", "ZYrz/8'5R", "cbJ*%&K2471SL\\|s&c1G/*R", "]U@R_^RQ-KKzw<V{p+5q ,", "D+ROTV0?N<b", "-DJ0CCNzn#-=]!LaC>3}~=%a_.bC", "8Y ~", "=JLla55X4S)[4mc' 0", "zQo 5+;k(C", "\\eBnuqtG(@To$A`&TxX[sJQk,"};
        String[] newText = {"MFMt5$9[A5Z+|p}?F_pO", "phJ5<1-DR=.iQT<x3Ybh)Q,q\"qAz%c0t/", "IGD>g|>v<6ERe}$S!fR|;Q\"t+N\\NN){{}(", "*eX@h*\\.TKI0fcT*n:v3?S2,77JcbFpO", "ouCE^=mHv(^_`1E|nj_dM_&vku6{O!Q;^Lq*T)!l_Ljq{", "\\2u]p,O'5U)Qx[mvk7H#!+lO(Id<M\\8", "Ab+H}[Gh,m{*SSP(", "*t=:L?qsWNE!i", ";5$]2L|Pm<jq_j@aL#iAol%Xh%G)Tl|d{HVQxBApxP(HgnMn`'", "d", "O?<mMXH?=$+Zx8-)hB$6gkrjoBG2M lir&C]_v;4}", "N}`", "E-+-'IU", "xgqGfV_a[7J&StO9Nf8KS-~-r2KjoqPfj71'}vDdz?)`DPz<{", "b)o3gEb@kQYvQpX!t70ww6l~pA8c(T~&@2O@x.\\67d!N+ogHnA", "90", "Ga[~@24O3Bn0ItxyR;CK3OJF\"^}Z3xYm_Da<]a*kds|dm\"o", "+)+YRiMQ6\" HGLaxX;N$4 IR=Z.7-@,l9f/u7dg-wZ8_", "?JFy;e26;<d>g{bb$w,`sx9kNLtIC)1w:Lzf$d", "Mz)k(vmg7\"Y&S'TA1#lG9=Z$JT%yLxU><Z-1c+l1eZ70:"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case16() {
        String[] oldText = {"2iE$ U7O>|Qk|UE>aBt", "+@FK"} ;
        String[] newText = {"2iE$2pJ4g[nmQ;~d\"[{>A(f%5O1^n(,Jy70HU\\s&F*%U~6pS8b", "pv%:\\WFX\\V814Q{g1AA*>F]!ru,&g>5G>=XBlZsN;Ssr/`07#O", "EM_7 U7O\"$P+Yvyc55rx(dMV=48||%izY-!cnxi:AUKskM9+_m", "!bA;!KpK2N,W{ZC8;g]qz<Q,7Z7`?UUzP|tH}l857d86:\"`b=_", "f7Ms$g?=>|Qk|UE>aBt+@FK"};
        assertEquals(2, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case17() {
        String[] oldText = {"tHxn[g{U2<.i8", "-Ov'jy)VKKJ&mnw61d5\\hb", "XPMp0r,D~T!?f'}F{t(279W]o\\", "#b}sb)9fIzA,>[=<XtRCH", "Kd4<y5A<a+\\(Z$", "0]U3@@WBf\\Y4}9{"};
        String[] newText = {"Hxn[g{U2lQU$~HBtFrr\\FAU2fOV+M\\Ry(DCoP6E[*l1p_P Y{<", ".huzZKp#5O:>>Xq7LK+%_gQj!c)>%I)t1\\QiRQ+#Cybg_>!/,E", "tHLFd|Nt:;@Rbq=jGYkJ|[_V+VjW]Pv%h_xD_TUjdx8(:,mcB#", "ui8-Ov'jwd~e)s4;&OBa 6~RUTk+/vL@Lkl;\\pk*f.D\\`NjTh8", "hGw$B#FUeVJ26ku=1~zbE11K&_yKV$=c\"d_!L2kTjX>#EnESDE", "gm0VRJlaQ@)\"d$L_D%pT1|E'uTv%;W)#AmV$S:LHS^C#wQ-t9g", ":f>$RqQ`agH>(1FJaa=)0V0D\"8.N$_zhe9I[6RAV)\"imgEk6no", "KZl=HG>Vy)VP`[C^\\\\;C9*|'0]{\\Kgq;F\\5$.[Y97h8n+Je`)6", "0u{}3.P*=H[_)>gy?XKUsU(@UP^-CzG/IO5NpMg(;jU-[pPi`Z", ",pP]j{AutW#KKJ&\"a?$>\\``M0[HX5w~>zqEPMZRW3at6Nt=EmG", "A%a7{os*/I4!E.s\\8mnw61d5\\hb<1\\j[Uy#:f8=Sw\\i7hen\\(^", "hr/JP40>Xvih/To\\6'rGt$wEhOm>S`{blahBVL(es8GCGA~}[O", "v*5KcZMFJg!Oj-AgBn#iSAcQKv0XPMp0r,DF<YxK@v:qH'pBN@", "cs6(`e%cR'3R5U}`ih_jN?qvOmf{N_+AdPe_5@CYf-0r!xzUK/", "SU*J <1pB~{/b%t1';'b=U,]<>k]|1?daO9~vr_WDbi$[S#!*_", "\\rB;~m6J#5.9zCO9E3(^>}xPub6rqT!?x`hTCp1'Os'T{6P-d(", "[pJ9?e1+aP.]60t|1`)4!g\\.S=tuJ{00y.QX35:SCU[):4[^ p", "mz<8\"; Wu615ND5$bUXQOVn+%e5h]Wr>f'}F{t(279W]o\\#YuS", "LA|!Bo^8_P84]$6J`N1'Nq.be}sb)9fIzA,>[=<XtRCHKd4<y5", "A<a+\\(Z$0]U3@@WBf\\Y4}9{"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case18() {
        String[] oldText = {"2d9JS", "PSsIe62No;\"^4![nCr7", "05g>3v)eTGgUT,B2+4y1#j.", "esQMLOZRTnx.;2", "OVE5*xt#KEJP1AqN18MdOfblrk%Y", "h&M&/Br,~HfidkMR", "UF}?3@59V*E.", "L+a#!OrW_", ",?|dT ^Z", "4[F45(tO?}LRy", "h;7\\j+t0>.4#juBg$F.);K^<", "F8!>-w7@TUpC-N'", "2S<L[wc@hwU*U3F.K9", "NgR+R xwI2QEL7", "MTNsh~@f8%q&,WL5 C`&i @Xq", "7{toA\"$1jgI.", "FHZa&T)} 60{S&,ymbFw2$W", "VdF,_(^t", "yGD"};
        String[] newText = {"2d9JSPSsz;uJ*)3ZN}uJg9=ye7_gny9fTra?@Me}+&!^od7;XT", "D;Y$5+@ xUy-Kr2:m3zKflG<OLVT\\Q[h\"GXy/c,5x]Kk7zaS~N", "Lx\\0=>d\\v!?1L6w`X(#f)[`-#us?bOz03e!a?I}}=i D{5-,E\"", "8415`g+X'@zT(m$X}GPTIe62No;\"^4![nCr70^3#c?4dVOZJin", "Xz1X.Ov!?$<:^`}R6j5bh7/H51+OP|^i0'tU3=WRq,@U!C9@9@", "dr_FYYe5r]<$sK]_NH5?%h}LmgU*uj=_0&}dM5g>QLOWe.xjt,", "malBTv*C6l[)01E3v)eTGgUj7Dm9WjS.=Q<sZ ,3n c85b%:x,", "iRd/)b%y'K]UXZz c%C?>}FH\"#?r3ubmTx*%upe7},7%V/em1>", "[m.IR8\"UyT,B2+4y1#jN*U#BnBkik@+A*IDzb'<]&%-aF{_.).", "IloGrE'g#I;'wF=diA?f4c~gCiTiDD:as)`m)ZR:'I{h<c.Rq?", "/HYO.esQMLOJ#=ZRTnx.;2OVE5*xt#KEJP1AqN18MdOfblrk%Y", "h&M&/Br,~HfidkMRUF}?3@59V*E.L+a#!OrW_,?|dT ^Z4[F45", "(tO?}LRyh;7\\j+t0>.4#juBg$F.);K^<F8!>-w7@TUpC-N'2S<", "L[wc@hwU*U3F.K9NgR+R xwI2QEL7MTNsh~@f8%q&,WL5 C`&i", " @Xq7{toA\"$1jgI.FHZa&T)} 60{S&,ymbFw2$WVdF,_(^tyGD"};
        assertEquals(6, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case19() {
        String[] oldText = {"^'0\"on!V3nV4S1", "$}hEH?r<WNzR\\lg;=X)NViPEZ|h0", "9.D%QCGdYsK;^X(R[[tn(U(P+", "4!z[_CgU+:YCrS", "WbN#z&#BkSC<!>TgLM", "nwG^.70l0z%&X,9dxmY\"#Rs", "VkG5cx", "3<C:2#Mh={o$b#", "[><6a3>X6x5EJWe+..<%", "Dc#'NfAP{79pH[V$G:;0&$", "Fo;B6(L&4#V-*r{: ZD", "De~X,`[x", "4<wNzZm$\\Pb#yk7xma", "'dySic-`]c&)JQ-%v-93<36!)H^", "?Y|#g1$}#J|GSrHD.e|cgFkAIn\"y", "TiXp(CQL<YGrF6AC\"`$zf#C.f]p+U", "gw?cr&? Sg[a/?48qyI'&SZ", "V*Z<b]"};
        String[] newText = {">(", "W62CU]yGkf", "[k!E\\jk!T/:e '$-=\\tFHSG~{SR1%jz(<R:hv", "aLsrcD'(@<fQi{~T.h6e(w", "0K5>@&", "Pa#2lX:+HN.|?kq+)?F6X>:f'pljl8CJWVlrMC?x12yBIEg:", "(/DY 'Ll@-nbqd|xO9PB/IP3zG$pbL%uGj:", "7L\\F1aUfrK%z=+SgX,\\RR0d|@><^5>/M]SM~", "}Aaqh", "WL_Uaf/YoEp~,H[)$/6s-k'~)X:0p;5x3XwaP LwSN6Rt", "Qc> jeb}M_|@}z]84VEbMVwSSzn\"1^%+DN", "v/|Ybj:l[ jSr&M^", ";+yEVS/.&[7xdq5?);S`;0&B.o=0]o\" Ss%yu(", "B6F", "cD%im;#6~Cqi;Pq8jzqYy|pNq=<,4 owgD \\h<R4Xa{%< wo", "8", "waY@BWnESa^E/3,.V", "6E=kK@Eh[H_:mVV~}'<Ft|VX|a:", "w1y3q90MVv9v):6CfZ3&F?}jCRHj]+BZ5_Is[(HpIATo0Q^", "pTs_,<ZQ#Vn_K@!!!rU-+k{@W`7(7(bY};/"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case20() {
        String[] oldText = {"[s V}-!6)C%!AL", "7$jfEQw$a {", "I=;i3|`D7", "NLEe:[pIp^t&$]7FKzH[X", "FvqN<y-u ie7S", "0&3*!3T\"L&smeUOG_a~E!7e|XrN~u", "S}.}z35:<\\6=-#AYMhNq$K~$I?}/#", "t]", "7 }.14_FJ%,,uLj'@C}", "\"%li`q/ykI(l2-?%"};
        String[] newText = {"[s ,TFT_VHM<H~v\\m0~1a?N-vk]-{ipZ~oHJG\"8qYl')@BN5F2", "\\E1Yb69++x<s))eupO(*MOI\\aV6^04_!I>B!<M#ZWT5\\F0/4|0", "ft $v0#>EW_gldDf9/vYPJYEt:gpE<w>zA2H.G\\ZsAG6v%FElE", "VXRK\\F<dn!d!`\"=}uM`CCEh![B[C&,3L+lNZTuQ;gU?zpoJx0>", "q(KV}-Hm5E[4\"Y(i;OPV_o8'b1 b.}m|#+e=+wPEg1]S~!p;#:", "+/ysY,|L00Au&Uy&RRs_2Z=um>R;v,d!<O7\"5>34fZA5W@%0#G", "x3()<}!6`J[1@r72x\"Cp_7KdrHRnDcF-X=uoTE0hfQb4Ah ye}", "am~IJ]ZpUPqM6SC6}Zvp:TXx B{KmegZ2|Lj%;&H\"5PxXn2pJH", ":98^8.vo)C%!AL7$jfEQw$a {IM$8-o\"*6'eTfGs(A`Tw[F]-Z", "&m}0[Ixk9~vs]m~?=;i3|`D7NLEe:r5tw{bj6.,!Q-G?<h3I?N", "xMS7RmrXK6RSCb8<vll1E}W,947aeC1`$=<w{oy+u]h U+\"iHj", "&3:7EQIO[pIp^t&$]7F~K_zH[pDq!o-DuZKeXFvqN<y-u ie7S", "0&3*!3T\"L&smeUOG_s%a~E!7e|XrN~uS}.}z35:<\\6=-#AYMhN", "q$K~$I?}/#t]7 }.14_FJ%,,uLj'@C}\"%li`q/ykI(l2-?%"};
        assertEquals(9, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case21() {
        String[] oldText = {">7~Pj-OTb7vFB/-s3Rt", "z#b5f\"72ilh&{K8$Ok,\"1'B[", "#0<uD:c'xJ\"#KkrfIJ", "sF>T))\"UDQ*-3-j?", "]mo", " \"yb%@7P,]lZ{bwQ4DRyH.YsseGrF", "f{B8<zL1", "RF5%P@xQ3HTh<(A8${83L@)t7>$l", "RB[1<pk`8LUg", "h\\g?=-0{`}yT:D:y950?e,Da_jp", "Gk/E", "#\\Q~\\t=Il'XzbbG~I})", "M RXOn}$5;:WBm2kpyLsGl", "Z?c&R5hb`?", "`APbsS7Ro|3\\(+wA", "9WZqUF#z", "wSnr?_EDIw3", "my4[Jo*Xbj*Y_KcxL33CQ45+2-", "IKFM#;O](w1$vL8;g", "fM.&oB`)5muymI8T"};
        String[] newText = {"sLF%OsKuzD)fqJ04\"wntI#8o4L", "ZCX6o/XR=egl`2z(I|[.M>k8/Qo(lH$+%e`1yC,J+=ONwI$)k", ">4'S(ipYH@gC!jJwh2&Pb4QUkf4", "gL/T6i<Z@l(u3Y{r8V+v+ fdnP[e3V)Tr1B,k caDwg", "E0cnm0b8Ja$t'?(YIT*[NVN'aF*yb&/ohk-.s-8", "7\\5NHj&d[x%x7v4o9FI#Tr(X5{\\1NE", "s!.el%U$M/UbH{I{`&`!A3%[0a4m?(.nx+sSW#?T=5u", "rD", "Mu2Qc]5i?X?wwIy?GzX]", "t\\txnw\"+T~'V8", "yX;U6;*B/mPQ=<7n|Q^b0", ".5]72o}-IVuD?n?W//(M-UCC{gK'z5!2 ", ")s/bw0 O&@{L2</t(( @<?!5EBF8}K@ R", "m?&Ea\\j!S\"~?(O|P*>YYItEk?+Q-G6gy3T*[M$gJ[8oRX@QL\\8", ":n)D*T]b9G@HyzxViR{^Bz=P_Ko\")~ZS}!GS%HwlTb", "5s:);iyq`Tf}Uh'}d", "I9z^d5IZE,iXY\\\\D", "Q)ynMt", "{oH:^+ZK;lj", "ag7=aSWHW2HB}Fe:f"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case22() {
        String[] oldText = {"/dJ6\\9\"LU", "{p=V;9P", ")299IOG(9l@", "=-nkLBHKd* eU4|PyFDSs"};
        String[] newText = {"j+z'FF{|*W}?zJ=,<(k}kX??Cnzpv55r-~8s[3On-.IJ=u?Z`B", ".\\r)B7,k}{J1f>*O'PtM$ab-^-f1{.CP/dWf0en\\-|Ak0f<gEp", "(,Tji9(C[M (qo}ziN`$}dc#OcIs-%;C1vP^\\N8du!{.&$QtA?", "0c{@nb5h(0/r1ku*wF4O2;9~b1rGqx!s)?J6\\9\"LU{%5(:-l\\7", ")TS7H5_]xe7WHh+oBd?12#&LvX8@6=7?RIWp:Bv:QDUjrmLDV5", "Um2^\\5%^(YVwfG^v&S_3@u.U63(vMu1D<-;zAAw,MKSs6)R$H}", ":?-a?\"^ I~VPo^t)|;Qv<2RZ?Am-~t2Zze.r<%cl+y)?d1b]J7", "dKzZ@!cdqR:H-@VYt24zW`Y:|vhvf%<#khX[Vm{lxqp=V;X8ti", "91.|[&oiRhxtuz|k3e\"P]Q(r\\mopE_AY<Lrx7$lJKNf{vM8`xb", "\\gyZNG<Ty/L=o?\"tQnable8[wb1I9,z5Ws/_75*ph*5f0X9P)[", "qswQ%Ka#\\b8O+n)aS$,ar:2DZ~.akWC}v~ChXSp8RZm_O\\,0O\"", "2G@\"nq7Ivu\\4hO)6gUrHzb2zoclnC9ope{>BD}eLl!IJN`LXT2", "9b3^zQ_/\\iS|0QJlA)])hwAufXn 6XQ7*]JKiIOFd[jQU4ZNuy", "1JD5}LHk;+gK{38E][//G!:|r+t=:v<nAtDXzT@XmqJm~}m!sr", "o9(v:9W?3y Ga\":`|~Bi6z}8_$<USln,cv}LgmWx*^mm<7KcQp", "sBbZaB7n!96o,HG)&gT lM@.aETxF]O\"e.:;iw&Lfc6E?3?m`y", "eGDE`S&GG-ge'$~A$LVo2EiKEOxcL]Q\\a~x.TG>POw^~f*<wP[", "sh+Bwy>7aOPzxjV3-U8iM_Xy4[[uacLeIY{#9y-/\\@Bx'g.>t1", "SM/,_XLmqlH+mmIOGWFv*,*Eah1J|(9l@=}-nkLBH,Kd* eU4|", "PyFDSsc"};
        assertEquals(11, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case23() {
        String[] oldText = {"sm9r<D5?F$lD1fQ.LOJ", "hTF&)ES]}\"\\\\%&=G3!J^h", "qLKwAzSnX|f\"fcvM)i&N", "uZ#D:BNw69U", "NKU$3\"iiqDM?>(;$V:/8i.W?BrkQK", "XLbh", "`OE1zFnjKHO@k=\\e8^.77!%bj", "FE}/s0xk!9X\\eRHHY_c>R8O0;Qf", "8{y{* v7}Pxst*/V%J593)(8", "Q8n+[fF~2@&<Es'JHN_V/", "s0a|Yn{UDpLZZkh2wLt", "ss)", "7kLqV\".d5tD$/", "B_q}R0O", "ItjA&0t*k+D_0s%3r${", "16%$+KH", "!;QjTapwhYJ4R8;3A"};
        String[] newText = {"mR-lBm#y2\\w<}m{Z\"UQllyev`@pz$!86\"Rz$S8UL9#.LM6`(/", "ROhoA&JMbR(mKd$\\ 'zXg1;|rS1_5k-%cRY3+E{3>#|XEG>i)", "Q9r<D5?F$lD1fQ.LOJh1D]JLY#lwGn\\Ml|2M6*D7A\\t>4Ek)Bh", "j=Cx!94149qkyHY#m%MW{Y+<;=ap:o1zuJZ?EV68`vbB@?8C/(", "u~!s 4Iqj=dvne/,Csd^oB96w'a[>+^N2$s)b1Muf9 *,@VVJs", "H'X}6`j\"L4 \\fC7QF<<o<:z :xwCzn[)? %oa(+E=H}gB |6K1", "blM\"R@khu}>*_S-52usTF&)}[gufQ4%Ss%Btx|7JyiKoKU}nTr", "XO~'@I{zC1?q?NcMYu)(5/-.oMcvS$qc i,JL<\\]b rc_[8{hi", "H?(n@x_`<0;]_}~@X2+}%QZESG9)VrZYw&|F&*JS2BfEyUkS)7", ".^[_iax|(B&4Y]~;`LJ$+cGP=Pa`0<%#];uKOdmIuJEkHPt?}8", "E#T\\]}\"\\\\%_@?Q}Q,ujML]7Zt;ZAdZ\\7( Z99j9FXmtz2#yW_~", "9J}x[AY*!*{0o?E&<%Zp{\"d.0r`cK}u=<;W/6dMD6p)$;i'dC[", "Sn+[}CVnV4&=G3!J^hqLKwAzSnXV4JH{]W9ttP4fl;b6zmB|f\"", "fcvM)i&NuZ[ol;mnG=N#D:BNw69UNKU$3\"iiqDM?>(;$V:/8i.", "W?BrkQKXLbh`OE1zFnjKHO@k=\\e8^.77!%bjFE}/s0xk!9X\\eR", "HHY_c>R8O0;Qf8{y{* v7}Pxst*/V%J593)(8Q8n+[fF~2@&<E", "s'JHN_V/s0a|Yn{UDpLZZkh2wLtss)7kLqV\".d5tD$/B_q}R0O", "ItjA&0t*k+D_0s%3r${16%$+KH!;QjTapwhYJ4R8;3A"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case24() {
        String[] oldText = {": y%;K,@vwyqWd\\K52-cDei", ")3oBM", ",f@]/TT[8#>\\I3)\\Syu", "{Dk'ViPmeShU5qI8W<K[/", "8=ZJOH3ac^kQ&.}A\"gR[{,J^&)TI", "fxchQytacvZs>YqgEhIJ;o)p", "<PYBx-", "5OV0*9('", "Ad4s6~wd", "`H}=+'/L91](B%rKqAPeGmVEfE[/!K"};
        String[] newText = {":[x-,?Y0kJ5,SFLSaM1|?\\QG1y[I 0gC|ERZ|^{lyF&%:2dx|*", "CR& rh&JCpS#ebO[`GpFm,YWf.@wQUxuk{D.]-e\\Y0Hc$AIsnV", ",}i:T/G04._&|HfEI>#FqK\"5G%Ks'Tmu1-.|eq!+&VdD?7zYb?", "mvq.'16y`F'kIS+%6|]-|KSu$g-Pze(:&-Q/TdU2\\2N&;W~M>,", "x y%;KIDGC-~8.^>!A\"}5lUk\\L\\2)!9fRh\\y=W&)v*gYOr};pM", "\\nuMI>NNY#CQv`h\\IL@%/N}qzqFB Wac[c^$M,whQzaY'8$MqJ", "0{,]a.,uhJm&%23V6 ns^)cYv*Qy_hm@Jg54[5X_iost\\#|@vw", "x@_oIVWbcTQ8*&m&!yqWd\\K52-cJ (E^[Vtz?:\\<3U?3Dei)3o", "BM,f@]/TT[8#>\\I3)\\Syu{Dk'ViPmeShU5qI8W<K[/8=ZJOH3a", "c^kQ&.}A\"gR[{,J^&)TIfxchQytacvZs>YqgEhIJ;o)p<PYBx-", "5OV0*9('Ad4s6~wd`H}=+'/L91](B%rKqAPeGmVEfE[/!K"};
        assertEquals(5, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case25() {
        String[] oldText = {"XfB0;E:3Uz", "9#} |Qg`30u4GC", "V:LQZZG[l'w/QXa&IQyWd.In!", "m'+x#e!evg&*ic@!qB2Y6P[w", "F+amJq=qFw4yj:S2", ":Z4\\L:gQf,ku?dky:v", "\\MH26z5xf}349\"^Z?'J}jAQw", ">n/`%w/}nk&A>tV1tKKOn<I3", "x2ZsB;Xt/j#o?RvEvyg<CwQq@]", "4a{WE^@G5NzJ2`n$-/c", "]e:6}R/@g&|iPOE|Q~M3^=.p_Y", "pC\"0g^K,zN0WUxR4VI7YzUCT", "DIRsJG_V:", "jY"};
        String[] newText = {"hGRJdiE\\X)S>S&;z]/o~Wp;c%B`[!DX72i?\\Juf0/Y8(9ie>", "TM3kz<@k>WYc:zn0M4=:-<ipd;~aIl=(4cHuR&,X2(IqLEE!", "CH&Mh", "Itw~P5=X[v1oBlL[g~khMeSw`Oy]ZN%", "/!rsaG\"!_:0$3*jB8", "I-zB4gMI=JuJPUV&D0I$|v)i_;e\\#cRu9:F$}S^[<", "3K2<?VCTlZgND", "jDbhG9Q5/W#-kxgX", "eM\"){;9 =U3bT7Y2(m[o\\WD';c,uB^ZB,PMF3&o)'Zw~.Ro", "$PP%vLwrurZ`", ")d/PDyfoLp+vh1NY6ZX[o!lY1 k=)1mn1F;Fe+TtId+9", "PeEQ*wp,F6'wd-#Z<B{G", "<$B[=V%\" H4h", "Xi'@G1vgRr-\\M/^>sE-f\"G/m lHk8:*[\"-EQ}`Y Y*>#|hWp~1", ">,5,XQ?NNh73/}]-@*wR 5D@Cu", "20&g5ZQU91+kf^DNQ)as/+rjjrE+o", "q 72':>o?T[P>6Z\\w[XN?GoM .EL-oi\"Q7&A,)p)RqV,+['Q?8", "Woft?\\D M9Ao3jgze*gAu&y\"h;:Op,!Dp5e0(\\6tk;&wC[1Y@", "^P$X6yU/^VxF6j)`sB{N*Q{H6/d1JC.?{Kj2DuU;2\\ull", " ,,b qG;(L1?}K/-kok+?lU"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case26() {
        String[] oldText = {"eCYX*O=\"a'kaaM\"}k?Tk", "T/ Rp{^\\sTkOBWiBuntX-?", "qMZDMV:</5iL.Gth3gi%", "2)U{Kj/xuh2Lv:h,Fu[}L_JZ]G", "U=Y=u! N6", "RdW&oj/-|.zV6p9/%0:*", "uyR*rymy", "q5!", "RU%WIL^_(C/i!95:W/gNf<", "S>p ]}>5rwP{7)sCpir", "8tR|JxC x.dC`", "\"fu9$@UQp`L'RSka0d+g[p-3I/nSo&"};
        String[] newText = {"eCYOuVC\"3HgH' j*<}\"uM;> =lp0lY\"I|TT}pW)SLP).u@w.Uv", "xV2w@_W^=.5G%$,&5-xqWo6\"{))?),DqSry]N^%*/jvC2:!$}v", "M{LX*O=\"a(;=Kp( /'ceMTrO_{-_s'hJ1]U%=93S$eP_6+]jZ6", "kD|2-nH]@f~9EuRM?R+nVf(rl`?HE+]?g]p,<0GcM'km)-`-'o", "{7ifQxsm@^ 2}'^g#+m0/BsaaM\"}7bzF!.1&~j.Ox`MGM}oDgh", "qeu_fe[2>m85N6eXY7mJg'|c98Zz@I&{uW1)F^QQ95`pFn<#8K", ">q2zK1c/o!2?FP&p}E!x,w6<{?rfk?TuNU)ZSwKoOiJ_'o^kT/", " R7y)MD?jfRT`anGp{^\\sTK-kOBWiBV2l@pfLuntX-?qMZDMV:", "</5iL.Gth3gi%2)U{Kj/xuh2Lv:h,Fu[}L_JZ]GU=Y=u! N6R", "dW&oj/-|.zV6p9/%0:*uyR*rymyq5!RU%WIL^_(C/i!95:W/gN", "f<S>p ]}>5rwP{7)sCpir8tR|JxC x.dC`\"fu9$@UQp`L'RSka", "0d+g[p-3I/nSo&"};
        assertEquals(8, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case27() {
        String[] oldText = {"\"M$^~/e5&-jJ[DXukZW}}$q<oP^"};
        String[] newText = {"eW@>W;rj;Y-+HDD:=0Wvv'f5gKBC/r7/`M4;(xk~JaJbSbMMP", "~V=", "ol{mluoa>WE]G:m0N5zur6tUNRB`g0hD;w47&)O*S", "I$p}8I]glb?IA)>a%dfQ|NK)l.J\\&7flA", "S(U$WwBh%,H|aq8!sp1/M(", ".t6b!a}Gyj^wf({DV|%FPMp?R.cYeZC,", "Nc)]o7lrjsxHU>J", "VH=,?t(/wK)A6B>3P!dN`D==Q`gR.3bake", "o$tCk!n,y+\"<-", "d!P1a@*zpEIRVww4\\3", "XYTf'D`I<53%i\\d", "\"Gcb", "kBO[8&y?F]5i@4\\uqH$Y", "`t6p-]bJM;f%", "3^Wyd~})e9>0sn.*TC|?QcqFyOU[Uq@6yK9IM0Venhw`6", "bs qec&U(*{>)vyd9", "o'Rh5pX%j2Dk%e-%+-jx", "QX><M!JmcWe;L", "Vjr;=qvN%xONd-P&j0-'7e2YS0uC&Jd>nKJ\\YT", "`0R0OkR)\"E1~+Th/?(!2FaD)YEs;5h$t!@5mW$ \\^eKti\"sOB"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case28() {
        String[] oldText = {"_mRsco}M%'x", "p1^e78", "qaED 5drb", "F4,|k@n7[u!:\\}4", "M7'Jg}3n5Xoqp", "*flSth\\MN?U\"y7VJ<Fhd'naOK_", "*Ja#GWKnay$g>>7]p=364`X,7", "!~f,Oal#j5|A#1#~E1]2", "38l<eXW?Vu+[&c==o60/lV:-8<F01", "=1\\SwIR}t61W92aI%K9g7", "k31GWcGq5)%", "oUz.!%", "ZZLKzBG#0-cQ#'sH)4"};
        String[] newText = {"_mRsco}M9rD'1\\!f@Q&/><P?@{4,rF43tE+\\,H>?4Z7ZB=j>Fm", "i@wKcqS[dSBKf2'}*]Or>O/&BfJK\".*O~Ua\"1k|!*Pt#b;3dln", "Av0V;q}s%'xp1^e78qaVYm!5*4h~_3:6BCmIQst&<317IMqA*5", "k5$U%xTL{,gilm#+&]U{Q>/zwg _n EggS'et~IFn_&@;CQ]4.", ";:kz\\L3[]qy+.?:*SBiX|'5D z_5uRm$T(%L(OCU737ZARni1a", "hBEt56(*z9-t_U])y2p3*&=8ue;F5dr\"MbF4,|k@n7[u8!:\\}4", "M7'Jg}3n5Xoqp*flSth\\MN?U\"y7VJ<Fhd'naOK_*Ja#GWKnay$", "g>>7]p=364`X,7!~f,Oal#j5|A#1#~E1]238l<eXW?Vu+[&c==", "o60/lV:-8<F01=1\\SwIR}t61W92aI%K9g7k31GWcGq5)%oUz.!", "%ZZLKzBG#0-cQ#'sH)4"};
        assertEquals(6, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case29() {
        String[] oldText = {";QTEI^|Zls?`p(3", "z'", "CbN]r0>", "j3:*z^.5DVk&#rv Qn;uUl'kLbB)p5", "*b11~1S&p,C(l[)IT]Xn \\goHAUuW", "po@]KB=N%!U:&~nq'kaxjI%uf\\", "@(~gE;wx`Y-uVBpn~\\c6", "G71_/v", "K4k9YWr'6vhA(!KYPZ", "n D\\!#v,Un", "xM6+E:ziPS(JcnT|ZiL%T", "2\\\"gE.p!i;lWW]?w/H<k9Ix&Dnj15", ",LNN", "@FDHd\"~B>EX", "\"@ WcAos1wr\\|", "tKCEs7{3$1Ms", "FWJZ^eY5XAybfhq(b+b3EMzr", "+h)", "Hh5lV,'J+mN 7}g%`mQpjAM-", "'d=mx6vaIJ,f4jB\"h-x"};
        String[] newText = {"IwVUG12T~EhWze-[X8tV^|Zls?hFK`/8`]h#t`ddi;A.imHZ|C", "y|CI!7-\\ymMPypHNooDc-?=!~(3z'eoqCbN]r0>j3:*z^.Yw5D", "Vk<&#rv Qn;uUl'kLbB)p5*b11~1S&p,C(l[)IT]Xn \\goHAUu", "Wpo@]KB=N%!U:&~nq'kaxjI%uf\\@(~gE;wx`Y-uVBpn~\\c6G71", "_/vK4k9YWr'6vhA(!KYPZn D\\!#v,UnxM6+E:ziPS(JcnT|ZiL", "%T2\\\"gE.p!i;lWW]?w/H<k9Ix&Dnj15,LNN@FDHd\"~B>EX\"@ W", "cAos1wr\\|tKCEs7{3$1MsFWJZ^eY5XAybfhq(b+b3EMzr+h)Hh", "5lV,'J+mN 7}g%`mQpjAM-'d=mx6vaIJ,f4jB\"h-x"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case30() {
        String[] oldText = {"}5YJ5=<oos:/x{<<ygHp]q8`", "!gCZ&\"", "soi>1,gUd@56W_1of>X9_$Cm]B", "yCp1J_cc6paY^iJna[", "Vnr/@l<vDlM88l191/7l7F(,", "^8N-hrF`N^nYC"};
        String[] newText = {"}5YfdS~;8qz=x!3zS\"mltsC}aIdg%%nU$rNems w7EQ d,U|W\"", "J5=5)-&Pq67Sn/y\" $r/m7+gl~E$;[?/Fu\"LSbSP1]2M3YJ)Lh", "}},}cewF6#93_&^.w#'@76~e)%cs7\"MQz5NNLRu<HN\\PQ&E_6[", "As <oos:/x{<<yg_D!wyoky1KRDNeNdYPB^%9%~XX?#72T@*c@", "g&qco%q3wnSCI<JC7uTN]20q<!,5NreBwz)*=j/0h]4kd*;Qn,", "Mq?{g)$/zq':] ^H5#)p:iO,*}eUpRE@f[*KfD3.p})Lo543$]", "q8`!g[,vopqKQ>n\\i{~q,xsiy>0TWXoAQx4h]RM&D-y4YhIas1", "k^</4.@u;nlu$b=\\YY+X*tX>D.X(RuiCZOIC4H\"W,&l>b7Q^nQ", "kB%pf&\"soi>1,gdQ+>0Yq~9KX3E,{8oIloE |;&KmsW>H=]Bx[", "}@t*]TUd@y2*\\vJ35oc77xbncpV6W_1of>X9_$Cm]ByCp1J_cc", "6paY^iJna[Vnr/@l<vDlM88l191/7l7F(,^8N-hrF`N^nYC"};
        assertEquals(10, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case31() {
        String[] oldText = {"uS#`h@a", "P{i]5[(?IG&W6DV|j^Jax4O^tA!O/", "&yil*d%p1", "N9/! 93m-q].I", "[&.9 YGcW~eltOZhN!k!M%$_{}", "L(rm4k.^:L6;sfm[<B\"J!NY", "%]^X&Krkfwo", ">[^zkGU:(phEnxw$P}nlm", "5Ev fSl|uEXp|K%rttw#4HR", "N&U^x9 A*ZD=6u'wcj", "PBZM4\"0%?Q}>f'k]GM]", "Q#}t", "/O", "7t*sH@8i_'O,AV}aMF&", "HJ$-,nOG;H4iS|/cXyoVB", "tT7d5.b5U[u (G.Z~St)Es", ".KhRL"};
        String[] newText = {"EcXgG+65Mr#_", "eO*WY[;+&nsfW.zdUgQ", "UIN!c8A?[pF6gaj#<[UvVC>ua]1C<x c#5,0IzEs%", "+a[6j'lVvS ;s-7l8{w5RRwt+7zCwv?;;V!oAjW#", "b\"nzy5kI(SQ6s3CxbujZ_I8\"e_", "T", "N{YWx27qcn8EZA&-9$q#/\"T4oZS:(CDN#+9P", "hzVZQSD,t{\"TWg.K~Rd?S^S81qqFqkp~]0@%cpF5fu[<pyO9x9", "Vp}", "_\"o1(Qy%LH", "s8[ay.4/K7Ko5+\\X-bX&QbMaC0@t%4'GN/E8M", "?F8", "*\"=?b\\=*)e@uMaXBqljN'Fm4+**Z4@Ovb a,f%v~zf'!N_~gbe", "Yi", "uC#(bE4zrh%-MqGo!]? 2m~r{13XXr", "Tpi<;Z0?9=!dXg%", "gVU8.wIB6m,-k-@5gHy4@.qcd#f.9\"M'(DH-A]o&.", "n>V*1", "ugWN`AK-0=5{svc'dPh@", "`]#766J68Ez;qwA)ih^Tn%ssF{f"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case32() {
        String[] oldText = {"b|v7!\\o@ZY6_Zcru\\]?[/.t<A", "QdV|;v~i", "xycSjz", "_q(", "gm7P~G", "-,@pA~LJTOPX66Kj*1_", "_#:Nt\">0S:NqaTZv)IE5U=`;Tuuz", "1yb'Jv@,l79%E!5/", "4IN.RcC;\\^0t&l0;sF\"c))S", "[}{PVZ29Zg=a H", "pub-S@)-J:x@,i`cs^\"D9CrcN", " %z&4uA,Y|}4;;vd|>bq_[", "c?kdI`F72H!Kl:_2^ZVT(_Zq+", "C(#y6{YFI@dg_X14*"};
        String[] newText = {"b|v7!\\o@Z)3q5=n+cd|HKI68V>}@0>Q9Zec;,ea:DwqGS!.2YL", "d%poMLDm\"^H/@FK|qqPFBz SlSVC%aenrN@$dKV>!-v0[ZR\">0", " gh.3[;]JY6_R/}7(@SnI&lkoup??AK\"@[Y(@!g@l*'R]G>X#$", "m-j]i,~G2V6A&_]O2PexACN%Ar{{8AQjyH!`K~^nR>W&_;Csj+", "hFLwAQWKuKfMZcrueL@4\\!`gV+LG IX%'_b+\\]?#XFZdijBlLV", "9,1>^ph>F(9*V'Z~IhQo5rk2ogR}=lXI^=:),T>a5aJ6bJqkL1", "[/#b|SlEJos1gq}:D9`/+f{IcvaLZ3LxzzK!KM5[s5<kXDk-Po", "i~\\R\\.}l$H'/\\GX^\"s3e'BZ%cmRR`d# ]0V.J}`2ekF|:Ld`x|", "@W.tg4<A-!b24R[tgip~2y,6OTm v@PU1Tp3f.0hAQ%\"=N*xLe", "%:AB=,eYh)|Q#;`px>3bG]@6|q-Lf-BydV|.q,;v~ixycSjz_q", "(gm7P~G-,@pA~LJTOPX66Kj*1__#:Nt\">0S:NqaTZv)IE5U=`;", "Tuuz1yb'Jv@,l79%E!5/4IN.RcC;\\^0t&l0;sF\"c))S[}{PVZ2", "9Zg=a Hpub-S@)-J:x@,i`cs^\"D9CrcN %z&4uA,Y|}4;;vd|", ">bq_[c?kdI`F72H!Kl:_2^ZVT(_Zq+C(#y6{YFI@dg_X14*"};
        assertEquals(9, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case33() {
        String[] oldText = {"5KXh", "x>9J2", "xDeCW#w5?_%4.`>5,,8_I", "WbFwL>2_OXrT_>!-&Ai]*Z[uSAHu7z", "Ce:a7<AMQKQS", "Y\\)wmmgY", "KY|2ljt=@CW[dedg~`Zid-D3G", "G<4sk#", "t\\QhHV\\eucRse!}mV~`e!i$", "`R#+04Y`E|yL'.3'nnspDeNLFg", "}%ho$l r<{9F^3HK6j}P", "ArJdE1RHH", ".JHe 0V|z9Rt[_?SJU/VYE<eNTk|="};
        String[] newText = {"LTv'YaUX&;+%J?", "Ro')eRot}}N=3TcOmdfh>ty@H:]^AXeB", "Ovt+8D@Cz1$@]65@dA%7+CC5\\!Tz(pc Y/Y#)", "K[I(b6_(IsGD$l ]rnd2]3d\" `S:uHjO]Pe5L", "+QucK&EwA{=Meeb-=6ltGC!}]e7;*U2m_ZIXhV~P", "g!O@oQVV6?XK?o!Ap/0zOGMG'm[|OWAt\"m!", "L)[\"", "?2N2k1V x1-_=yH-m_D1qs`FGAgiqC< d>4MFJ6rSuoP", "+", ".$%q[Hs]|XH>Ve-@' ;Ec##>xnQCtKzE$}~u]4)%}7lL-BLV", "8:,q6v'Q)[]QnCPfb>&G`ip <j7uE#)ur", "hk5u;*sTiJ1_QJ^d?}A&r050zjQ;Sr{=~$.Ub", "j<hATPu", "JChZP:vsht.:qiq", "[FcG)NA{1,wr^B3GC7<%v)nN2`gr!9=;\\,o[<Z=QAV3i{", ",q=Pi.dm(SJ6qsTx!o#]/6uh1", "<6", "3YHu-~q{\"Z7go\"", "/}\"o;{J>gAp3~)}&8_07} cn{6k", "e<!_rP=OO=s0kXZW-BC1b5%iV=i&XJVFBOO.{Bz:0VGDy)[l1"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case34() {
        String[] oldText = { "HS1e/?9", "U3GS", "Mz6-FOKA(-UEnNv5" };
        String[] newText = {"HS1e/?iR9U3^5_2MIGRt%B!4l;imhr,.2X$eL808*Ss!W9`x+&", "r`nu}gRNGSaMaz6-FOKA(-UEnNv5b"};
        assertEquals(5, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case35() {
        String[] oldText = {"M4,|T**{]}b<M{A/NVd!oVU@l31", " { rqzK@<^oE$", ";IlFlwHW{@or", ";q.>^.mRf", "!Xhv}(.3ic\"5n?", "1F\",)#6[=$={Wn/Po,}H", "`FcG/>>m.+#jl>m-T((", "oRFi2PQ}9\"@;,E%", "@o*`<pG)eK}", "aZ(ebw|P0Ms-H/=", "21D*vG!p##^", "F7U~b/Lv9B7H'p|,]v*IV 'MaGL", "l-S~pRLRyd|_75YE2 )a)rO]|#-%Q4"};
        String[] newText = {"4D\\c0TrZDy4'wP/3 bN7>ZKG5am/_P9I}/JAz|i:4!vj4mJBn=", ";yV+[ u_B@>!%-oBQNu)N'HnK^Ghz\"Yt\\7C3EpG='9YidT,6}s", "S~EZ.%6:zwDwd<<\\@A}rey^fB(xh0#]0L_y,G}K^@zsm i\"6QV", "E]c0.+U[)0]1(=04iH+$a jKYG!bj>'y}KzgIs_)K{Px,ZY9n%", "},|T*kpB'M:{B?\\sP>]*AS)(}BinzjL?@ERVG?):}{:b0E< (V", "OX9Q( CKWRrzlM^Ja7UIx>&V,\"V.OI0t{31f\"zb^=R*'B)u?_%", "@B(qE*{]}&t(e\"^j;E,7|c7F9ylh/X4M=7^`ZzL=~qmk5;q4Fy", ".bBDJjR&9<M{A/NbVbUlhd`8.!oVU@l31 { rqzK@<^oE$;IlF", "lwHW{@or;q.>^.mRf!Xhv}(.3ic\"5n?1F\",)#6[=$={Wn/Po,}", "H`FcG/>>m.+#jl>m-T((oRFi2PQ}9\"@;,E%@o*`<pG)eK}aZ(e", "bw|P0Ms-H/=21D*vG!p##^F7U~b/Lv9B7H'p|,]v*IV 'MaGLl", "-S~pRLRyd|_75YE2 )a)rO]|#-%Q4"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case36() {
        String[] oldText = {"&K=V }^?(02xF^p", "@\\\\9jq(.wUqM#WkWONm", "IY*$E33`KtgQ<< oCn3qtDp^8}h~6", "M32y&[ 5dx+{C$%LH$1l.SM+aU$TaB", "_M", ")gWO&Fx@Hl1", "jfN&!HW!]^:9bc", "A-+*:!j[if 7", "I}_Q)l/8@3ir!80S(7WH+tL>[ VB", "(T*,oJa?i<Zb7NL'12YV={Xtj\"g;", ":xF/Uep9~Xsxdb-]|)7!q*!|Uez\"?(", "P#KR \\C1~~3xfx&wym;C/", "j?o3q6}R/>K", "T8Fq6f?\"pP[c:[2YerRNuD&*1^", "?{\\$[L#:y0><0.pnfCr;n", "\"n4|3C@"};
        String[] newText = {"&K=VQv\\:mKZ[t\\qy:%QdOw-g6$KaUuZ;c\\v3*@,,=It]al)cO{", "4Wml7x!!VX(C1[Ii&seJ%Oe_p62m}Qa+Y)e4Wl reK6.>]B?kN", "dX05 }^?(t+3mEOTa)0im?*AY13PAwsyYG;'F!ppyvh Wk993@", "N&0^F0.sFUV)&4HfoGb|Q<tbZvv<<p3r&</Z'?UiV;qG,7Rj0D", "?tC~dO#-w026flY:iTf}X*q9rB~<&B6K8o35PONK*x:RAb&VwI", "%N%#~qE&'`9'mV4'89[e:)'nQMj=1m#\\5J=?YjOy1N2t5]W/5t", "-$#Z2u/QPpJxF^p@\\\\9}]wbX-5b+:*h`k9pQ~JkY<r!FggNP/b", "jq(.wUEZHa\\^-4@Jm X\\aglq_qM#Ws,8`(?m`NS.kjmVz5#WON", "mIY*$E33`Ktg[$C2iHQ<< YoCn3qtDp@^8}h~6M32y&[ 5dx+{", "C$%LH$1l.SM+aU$TaB_M)gWO&Fx@Hl1jfN&!HW!]^:9bcA-+*:", "!j[if 7I}_Q)l/8@3ir!80S(7WH+tL>[ VB(T*,oJa?i<Zb7NL", "'12YV={Xtj\"g;:xF/Uep9~Xsxdb-]|)7!q*!|Uez\"?(P#KR \\C", "1~~3xfx&wym;C/j?o3q6}R/>KT8Fq6f?\"pP[c:[2YerRNuD&*1", "^?{\\$[L#:y0><0.pnfCr;n\"n4|3C@"};
        assertEquals(10, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case37() {
        String[] oldText = {"@VPK)zT-%15e3R@<&S`D^6}B", "Vk9;mhY$k\"g#;LEda*", "!1<=pO_`C&Q*xJ8 |c", "#@Rn ^;;o}El+=,sy<nUg5(dP", "nw9#H3GlZ?", "z&nGl7`\"m&Gdgj1-v)@cX,", "x_", "%Ne)#Z!o8ip@fi>?G4hWRn", "#kn&gSl=bDTZ3", "_C-c4Iq&>TVkT%t5JHY^gI@ZW=", "$.h`gA[v%V{<}w>S\\v+", "D{qQ>OQw2@# mX", ";I>dpJ/ J(gh2MgoYCF*,wz\"S-Yb"};
        String[] newText = {"1:>SNm/vS]}s*", "27zj!/}:NIr\\5C[I>n^6zVg*6 :v< D9cL&8)\"Ds{FUZCz!", "d~%Z Ifew]'}2gD-T4yVE", "o?;yD2vmBCN )ZJ5O%d3%\"(!gjJnl:d?!Po}>$XcDMpp@9", "u~VeT@{P6G^62mFS", "qVw*YMOZ)]v:-IexiXsiNWR+0Kw5$2X^8nx\\'(", "moQ@_'p*B4]s6!@!R", "\"lR5BoqLU|}RI,Wuv^~FPg$#JFH*:.5a}oeb=", "@rR6Re>hiqP)#jp/$=", "WC9f^v&VTJ-", "DWlfnhSesF&*d H", "';pg)h4Me?z3yNE+G'h-Q!Vq'm0sMH38,N(,Ain:9", "F)]~4^>FF9xI.J}zfx2.'i?)<WCE3}zIZkNc1jCx9T>H", "/q2d", "djvPGq8Jt[q3\\KLPD$4FktwI2H[[09=D}A", "-NzB3g!{>YeCZ,HKkds&HE7&<", "sG#&AWMi+%R}:j5+2DwyYu|w~/jx_JjD9ZfFlc", "l;nE~!}3o$glfq%pm:f18L,8+", "dFlk7&", "vN2,eN"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case38() {
        String[] oldText = {"KU", "7?g", ",RD&", "r7PZEnZZKREX7y+|vz", "qLkQtMV6]~Am)D", "dV,p7", "afYO#L=Y,`K$d^g)EW*c~zp (ej0Zw", "Wh/xk-+;P^H5ZH7W'.% 1BQGi1:m<", "o+Rk^sMmm@fbY9DPD#VCln\\@},", "::~o[FB", "dQ%'Zt!UL)['aoutXt", "/hBSB", "eM?k8t*@H8/6e]N\\", "ELimMPj3MVgR:d\\;]", "Q.", "?xZ\\", "e/rV]lh", "wpCRvv@$%/3O9#_n>l|", "fG$}k+A3[b"};
        String[] newText = {"KU7?g,<Xh.iN6.e@F*A=x@HUgS=x>@OG}nQkc6\"ftfKzi8%,N|", "<Aq$ $v6g>>re+M%d6(2)d^cR6Zg}4NBz]dsYa%\\Mjq1/pO_s=", "Ikeu5=RD&r7PZEnZZKRE[0V:%\\fbQFQ=c)ZBH`Eu.Q(1[av}pR", "( =5Jpu`9)1_F2PhU5T}s>AL%}$BjY>+P}aOq.%Gz=zTBC<Cc?", "$AKi$FO1k8e5k,\\gP`mdo76^Y@t8c}-N$f^[bb;ZHts7!Coy94", "^VMBbEH*r,lG(Xg#pUEE@x5K+#w<DD@%QDf{\\k]3;z;)!2LZQ2", "hU=(\\tU2jc,i#G#3`mFIX7;_Q8{{38X\"SQK+|[$jBKQdM\\}N*/", "g4_0l]dx!<dOB$Wh|Vy#)|z*3W0(Lf\"%BS'P`}(6<WJMHeo;B6", "?M<RH$/W`7(gE6Dz4SpTlxy+|vzqJFq<TvjOEkqrxIMr7}e0r,", "%fa?ZRgjW'T(v428ByUmGLvI%0Q+7EE]A';/>vOyMCV}X_H#[f", ":;$3DI`/\"tkB.g29}q\"]*'5fXwx:LkQtMl:o{~~d?!VSpg.3Xt", "\\48Z.A-_gEO'W\\|XH*V6=}3w%DgxT7&[D|]~Am)DdV,p7af](M", "sB]~2G(-u\\e*kQs7\"};#@B$}@oZAb{'8D?Ck7@rv(un$p:#V;[", "6Uu@3UAM0YO#L=Y,`K$d^g)EW*c~zT{-jg3erGpU}-:Ct\\1ZN/", "r&(\"9aq'E kjuaxN+`$V`J6i*p (ej0ZwWh/xk-+;JP^^EfWh_", "?nH5ZH7W.S'.% 1BQGi1:m<o+Rk^sMmm@fbY9DPD#VCln\\@},:", ":~o[FBdQ%'Zt!UL)['aoutXt/hBSBeM?k8t*@H8/6e]N\\ELimM", "Pj3MVgR:d\\;]Q.?xZ\\e/rV]lhwpCRvv@$%/3O9#_n>l|fG$}k+", "A3[b"};
        assertEquals(11, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case39() {
        String[] oldText = {"tO`Igpm]p(=M:cBE Zyy(c[y,!f5 G", "tDhyWLDsA m e;Y %N{pz", "gl)8u7nU?~dEmQQs@Jb2`o`19\\W\\Z", "Ax :~#$fAt", "[@q5tt^b-+^fFU)S>mHD4R>", "c\\2]l}?\\2y3OTt", ";Y=4K4''kVD(og'@HnwKl#U|x", "YT)iEeZ/YYcbw ", "i#hm 5_Fy1 IWI..TXG@/?", "zvV'", ":ptzQ", "{-%7cH0NGBbL9Ov+~", "+-", "HpaT{>P+q>"};
        String[] newText = {"\\$ui[icnH#Se", "<#1ulXh\"IF:rYjp ;+ ?bs=-RwV=\",<Ks%/K\\VeMvpmy9%5!x", "N~KTj9LZQq><cnfL7ecoZX .+s@:{n5*D=KktB?}-0azX1n.nl", "KgiW.", "n@|&SX'cKT,e`BgjvGBrR.fNmbQ-", "-G){ <r%NKTva5EBY\"iM=[C&`.(G:", "m%PwL:~5(O^>7e~tM&oEF['0dpE[Np;K@M*VBG", "^qh2U-~p `is[.ywdVBV)=R]WNnxsS$5Rv.", "uPbi-LL4eUaTl`iTY;6", "!Z8g&\"lGG.+ *o", "Rvry}A;lD*dF>E^`o\"k0]5-LyT 5xClVl", "s=@||&3D'Yi$Krz'QNKcRPX@=ygTk>*|Tt6.32", "n]v{98_", "F_=8bYAMxuuxg)EE#CWKVPZ\"FB^eR>AN\"^i?!zc", "V|{zZAEqHAp7-rq`TrwGQ|6s(~ r)4\\d\"tVl/2`JZ[w&{x", "p", "\\[\"YM6~+yK}1{^O\\f}y1vE=SFdoKCz>)cIIf&a2ITLo^|g5Q", "\"I;!JI-`7U*$x,\"PR([Mw!*,xumN:fIPI~@-#v%D39K5H9Q", "%\\<a.+\\U?", ">+et]XkA])=4gyIImcDiltg)z!7]xJwmM9]4ha,{i"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case40() {
        String[] oldText = {"YUUVW1/6~jz'&-kRM~", "*U<W%Q:v VUG06BwFJpjiE0QQC7v", "wqd<[tx8m}", "Gi8qf<<IIJ!t.HYxLcB1AR?mR?\"", "1{\\F fg[W w{5LYG", "h{<7n", "jQ~vJw4x,|\\|", "8]`@", "j31!}]Ga~_9a]E", "74ac", "#8i,1$'mAz#!xREqooOsHJ3d", "jlov0L' B*u`.3", "#uWfc*j=\",71Dhj|q(", "1g5ljyH0CxwK:Y!Pk{JPX t\\zYt$q", "IZuK|JN#A<`[&%zI9C[&;", " MQ>7/]al~PBS9", "t\\!<1mD)]yry}w7\\W>", "\\|'"};
        String[] newText = {"YUUVW1/1E1fKm(x Wm*xwX:c$/CUZ$`)_jG>w!3d)vdAA-F6g3", "Wn?003a#T]g[Q2o(6?ffvN>f$]bj\\y^i[6/o_+&VqGcw6~jz'&", "-kRM~*U<W%Q:v VUG06BwFJpjiE0QQC7vwqd<[tx8m}Gi8qf<<", "IIJ!t.HYxLcB1AR?mR?\"1{\\F fg[W w{5LYGh{<7njQ~vJw4x,", "|\\|8]`@j31!}]Ga~_9a]E74ac#8i,1$'mAz#!xREqooOsHJ3dj", "lov0L' B*u`.3#uWfc*j=\",71Dhj|q(1g5ljyH0CxwK:Y!Pk{J", "PX t\\zYt$qIZuK|JN#A<`[&%zI9C[&; MQ>7/]al~PBS9t\\!<1", "mD)]yry}w7\\W>\\|'"};
        assertEquals(1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case41() {
        String[] oldText = {"s-VMK@|\\%J!c8J", "fFA$v7BBfWa", ") R`z", "4/XhPa~", "(&}<Bp^z]vzb|d(J<\\r", "f /&)ghG^1?", "<w<=m>%`\\z;#J\\3r`\\-JV#F30s}", "J[Y/kX#]&O-m4", "}-H", "Q:-fL6yiw=TNysi#:/kh[^", "`J(TOt!G56", ")\\eUF{I`SKA+O@a_eL1,$=MC|E", "C)}pt9mx't"};
        String[] newText = {"MK@,SZNyfTB~TM_*{lq|PPV_8H7'D6\\XEO'j`1oe_@DVtOi_t~", "@Y`WCWCS)pquI;pd.(j21+RCmMBHNu?@j=-')9MhY&Y0iW1GJ`", "37b|\\km?a'S6l&ADSSa=}j)@Vf )eHF\"[C<7t('nX\"JlQ&yOO=", "A3&fYbi?esp<<c7M{HIA#['fC%KX)#y#Xt(|lEtDe@b{/nTS^[", "c1A=+%J!c8Jf~\"T#J^ssQ3!!vD[F({KtM<BNzY*hG&BRn428TQ", "U9GyQw'\"%20:A\\3_mF/%|vjJj~Oa+P-f/bJ+rW)|XTv#ox4POd", "T>SU\":E^)x9)FA$v7BBfWam7,i\\2M<;) R`z4/XhDFakY5I Nt", "(Q2qm&6ub0wf&C<j;b=QzDOA.,B@>1;`C4&7k)s20rfS.;.tu,", "xHYS+]DMX.T)1Z@2YrU2Bx#z|4mMQ~)fx5T(re#+Pa~~J_h68(", "&}:Pc'qY8T>0`QcURr\\h1-{rp|N3>jie%Ln:|9<Bp^z]vzb|d(", "J<\\rc>COf /&)2Q0gh*\"sTGh^1?<w<=m>%`\\z;#J\\3r`\\-JV#F", "30s}J[Y/kX#]&O-m4}-HQ:-fL6yiw=TNysi#:/kh[^`J(TOt!G", "56)\\eUF{I`SKA+O@a_eL1,$=MC|EC)}pt9mx't"};
        assertEquals(-1, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case42() {
        String[] oldText = {"UbMifN2|8", "3-'P\"_\\CV&XR3` z=!Qpa"};
        String[] newText = {"UbMifN2|8b}<Y3yF*yd2XbPA9vQ,9kI_isqy0+H']Y<tQXa[- ", "r'umC7myyWZhf5)ak9'.h^ p_&F_:rSY4vF_)sN>)[KNK!En2>", "Gp{Nu:z.63-'P\"_\\TA52tO`b~\")&Yt[CV&Gd'TPaSQffxy|Uf;", "lMe&uOI89^N/4qI?XR3` Sf.}0')\\I+eQ'xp-~YP6EU`i?ZN-K", "x51SeTxY:p]Ie>|Rea2A.Xdxz=!Qpa"};
        assertEquals(4, blockdistance.minDist(oldText, newText));
        }

    @Test
    public void case65() {
        String[] oldText = { "/FI8I?K:%*W6%6V7T/FROB-FC6QGE@FX.>9.<1K=QN2%6%CU/-", "54SMOF-K:*TS>U=T-HEDS0JIH(9FQ.?*@RJ/1DO618W(F%E%9,", "LGFP)O+.DU/HQ184.,?)*5X%?9JB6AFHA'BWPD::6-:S=CC+DG", ":(6A=E9P5BPC(%/S@L*ESLP;9BV>6*S7CUH8&3<:W2*F/78A)L", "?SK2((FVE-2D+D6AAJ1>LK.S+U;@75*AGF9&Q.3J0K8*0&+QDL", "4ASXQPS4A,=2:>,M1ULJ1:5M4OD3:G9Q75*O;C,8V(X9H8J0O%", "(MH7I/T*V?,>(>B&RS@VSMDDT2',?R1S9(O@F1IL,D<%VOVIHJ", ">X58Q.*%))(D9SH/MJ<.3OI(:DC4:J,:,6U8" };
        String[] newText = { "/FI8IWB>G:A9=4SPD1&G7+C/=6+XT<B,4M?K:%*W6%6V7T/FRO", "B-FC6QGE@FX.>9.<1K=QN2%6%CU/)E.A'T,,6.T&.RQO(.M3R+", "NIL*N*=A+D-C3;OP;U;4XQO1C8M+)N74V2:HGS4?J==L1IKL9T", "I0,7)'(;6?'ED1XIEG4BD3(IH1HO;-54SMOF-K:*TS>U=T-HED", "S0JIH(9FQ.?*@RJ/1DO61W.*.LFF7Q5'RWBRC?1B'H&4P,RLC+", "WG;<+AH;JEP7KC%)?6;8T.7.&?3G3.0U,WNL:PSGFM7UI-*=+8", "W(F%'U=FQ+)UX18EM2XJ8.FE%9,LGFP)O+.DU/HQ184.,?)*5X", "%?9JB6AFHA'BWPD::6-:S=CC+DG:(6A=E9P5BPC(%/S@L*ES4P", "M5=J3&'U5<IX1%SQHE1F'KF+BLKNFL5I?K,S6/86*D?AJTE6>I", "I0B?A00RCMH3132V65WH>EG2PL2>U%A<<?C(P;9BV>6*S7CUH8", "&3<:W2*F/78A)L?SK2((VDBKTXA?98B''/<%?=B>Q<R83@&+52", "E::4HE3HM+0K/V+@DAN=4A/O'F&((XU6V&>KO6J<T3@RUFVE-2", "D+D6AAJ1>LK.S+U;@75*AGF9&Q.3J0KQ57EFK'4FC0Q38*0&+Q", "DL4ASXQPS4A,=2:>,ANO9+6-;2G5<BD.NU4V*&J/42N))0*.1R", "IS54>M1ULJ1@941I8J48LB14B7=(QET*4)L)KU&MPG*795F')Q", "I1/FQ7K:2MLU%D<;FE&-@%&:5M4OD3:G9Q75*O;C,8V(X9H8JL", "RV16.V<;R0E+/=8&-MJWBLG0O%(MH7I/T*V?,FHK@3'0H%6-L8", "B;'JB:(<634&W.>;W=MH9MR,;1JT6E0D>(>B&RS@VSMDDT2'P7", "U7?X2KMGH3-T:+M&ONL'/;T2FIC&K8(F:WEI.GQ9V,?R1S9(O@", "F1IL,D<%VOVIHJ>X58Q.*%))(D9SH/MJ<.3OI(:DC4:J,:,6U8" };
        assertEquals(13, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case66() {
        String[] oldText = { "MGCDO8J=O;DLNC:<KDHAD6L:F@P>DCE97M7H<DDMI77KAEEOI=", "NJGLF6D::AMLHOAMC=B@G9ILFAK>C?:OD;JE8>@DFCOG:IJ>HI", "?>>FGK8:C9BBANO;B:EHFF=@@O86HF?;E?AI=6PNN=:?:=EMJ:", "E?6;PFJ@O:DPOI9PEFG>NM?<JN?CMOGJONIH=LKKHPG6MMJO<K", "N87?<7NJ8I?I9?BG@7K;@?FND7OO:H;JAMC@>IK>K8>H6?C8>I", "F<IP7@PKO<K<M6>OK@NO=6N;IA9DE8=BO=HIDB" };
        String[] newText = { "MGCDO8J=O;DLNC:<KDHAD6LFAJB>KJB=6F?FD8L@JL6HNDM8GN", "@KF?MPHFFC;PI<?=HB=AO?OEEN9>O977MB7BJMMN><6MJ;GKDL", "H7I7C<OO8EMAFOPKAFFMF;KKF=N@OOKALJ=87GF?9G>C=K9CDI", "E97L6CN=9L@6:O8@6O9J=:GN8:F?L9:DKI8JDOD9K8<EEO6J6N", "8KICCEL@:P:B:6B@BL@7B9DK<>J8L9P>DCAAEL@;NBAGDH@=D7", "7GD=AICO>NOKJA;<LGE:97=E6EBGL<D>PF6=7:NOHG;C?MLD99", "=<EJ8PLBPBE97M7H<DDMI77KAEHL:KBBNEA>G98KAAEI;G68<=", "MP8<HKF;8DH>EOI=NJGLF6D9=8?OBKMOME@IAL::::?G@L9GJH", ":=GE?PH6CEBF::JJ?CBEH7=BCCA<?NC;C9AMLHOAMC=B@G9ILF", "AK>C?:OD;JE8>@DFCOG:IJ>HI?>>FGK8:C9BBANO;B:EHF:LCA", "KB;F=;8GF=@@O86HF?;E?AIDDKINHK>GB=8=8J:LNH9F?N:OON", "A=6PNN==KO<P:DF:N<HO?MD@@K?G<;C>GBI@I8OCO7PG8@=8>:", "?:=E@O<L:H;?<B7;A7IIGJMJ:E?6;PFJDA99@6;==<?GAEONAF", ";@B7=@O:DPOI9PEFG>NM?<JN?CFOK<=;7K?IN7?I?68G8BDMOG", "JONIH=LKKHPG6MMJODN7>OB?9D@JFJ8@IPPPFI@NJJN@LN>O7F", "PIB=K>M88BIEGGL::F8<KN87?AD9H9L9;O>NHPL<JIDJF9D@FG", "OFHLI@9FKM<LM?@P<7NJ8I?I;:E@F<C6MI78@HFH9?H:N;@9F?", "BOAFM;=9?BG@7K;@?FND7OO:H;JAMC@>IK>K8>H6?C>LC9CEM=", "969?DOMIO?KNK:6=@@BI;8D98GIOOMIALJK7O;O@9:K;>:9PA>", ";NPF?L:I@8>IF<IP7@PKO<K<M6>OK@NO=6N;IA9DE8=BO=HIDB" };
        assertEquals(17, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case67() {
        String[] oldText = { "286762(107,70599/370++00.23+121((09.012121/91+7,)-", "86)-31)567*6+776((6-7+62.6-(6,-+6/8,,2/(0/4.80*/*0", "237(3.1(1-7)4705,0--5(+070+41/.*8--+5007,554*)*()6", "2.0019)9-/+6(,31*,6*7,3)*+).780/4**72" };
        String[] newText = { "286762(107,7+(,21//*3(22160.8/(5--.3-1(--3.-80655,", "+)06266)7-/5214.,3/55,2474-73+7/0599/1665,26/3(17/", "65/0-*3236/0062-7395.72648,3460.,4-++37*506).(,846", "74++3-)0815430*.+.37-6,+2,,2,-6+9-76(+,-(-77+1714+", "4-,26,7*+*85*296+/0,-959-7*.5*.0/437)*296/208+565)", "3-1)969(6-8566613+63*5.,((58333*-95,7+25-2940/1/++", "73++6/*0*67-(734+,50.8(6.7+/90)/)16531,08-//947.67", "7/2(1+855-2..7--7.+1-8(411844-2(1)7*347.1)993829((", ")))+(03)18(68,)661*)/794/(22)+/30.*-14,(39**0(72,+", "/*/70*5283*,(8/3,998*+6),)/(+()4*00,8+(250261-3,1+", ",.5)12,3,/92.65-,5-,(4/418301)511.1-388*6(3-799*99", "198005,-6(4-(6)2(4//*0(3()0-5+,,23477)+6--5/425*21", "057,07(,27761-.(9(2(+3-5)99)*0-5/1-7-0++00.23+121(", "(09.01284402*3)8(/87-4,-077,(0++(27121/91+7,)3(+5(", "4901045).57,(+6+,(,6-1/6(3,/3**5-4(++49033(8444/25", "5,)(1*723---86)-31)567*6+776((6-7+62.6-(6,-+6/8,,2", "/(0/4.80*/*0237(3.1(1-7)4705,0--5(+070+41/.69(19/1", "4,-)8,)(3(.*8--+5007,554*)*()62.0019)9-/+6(,31*,6*", "7,3-+.7-,3923+.2,408-,52-+(.7370/)),.074647(/)6048", "66315/)*+).780/4**7-4.8*5,+95*44)705.781,*7/19(-92" };
        assertEquals(8, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case68() {
        String[] oldText = { "rrkjpqpmrijrhqhmsshoukijstunotmkpnpuriqskjhssupsnr", "utllukknqnskqkujulisjmupkhkoitnlsljrjshltitoshsroq", "qothuqmhrqpnstnpujmisqqnsotiqnntokuponmlsuokjujurr", "pormmksjshqjpskqjspjuijjituljntpqupnhrljutljomuqlo", "pqtskrhhtotroulrhtssptinjitmhmklqkqlsisoiuonnlshnl", "qtopjksspsnuooormqqiurmtnslukmmpminqqlrkqtqknhqjio", "hnhsuurskhqtqnnnlqoqjjupkjpithumihhklimsnhknilqkik", "qoojusruquirlpksiksipii" };
        String[] newText = { "rrkjpqpmrijrhqhmrnqpklotpjhmhihnuhnkllkoshllsshouk", "ijssijokkumomqlptosmnljhjkrjstunotmkpnpuriqskjhssu", "psnrutllukknqnskqkujulisjmupkhkoitnlsljrjshltitosh", "sroqqothuqmhrqpnstnpujmisqqnsotiqnntokuponmljnktsp", "nolilptmjposjhlrnlislksqsuokjujurrpormmkknllitthpu", "tlphltsusrlmkutmmtrnnouuursjmsprrnjlustmktkhmqrjns", "rrrorripokpukjnhsisrihpssopskrnpjikihhjthlrsmnolps", "rknuiophmlrosmiojjnksjshqjpskqjspjuijjituljntpqupn", "hrljutljomuqlopqtskrhhtotroulrhtssptinjitmhmklqkql", "sisoiuonnlshnlqtopjksspsnuooormqqiurmtnslukmmmhjlr", "oktnstqrnkstootjqhrunhmmunrqqntqinpuslipminqqlrkqt", "qknhqjiohnhsuurskhqtqnnnlqoqjjupkjpithumrtkjntlqkq", "iksjqktnpuoinspkjrkokilkoihntnquinkjsrijposrtjhttn", "umitlrijlqshtprtjrtnqhspjkmptqkpujqinipkhorrqruisn", "iusnnskhhninloiruiuomihhklimsnhknilqkikqoojusruqui", "rnkisjrqntnnknmknujphklnjqphpkqkhqupjpomjqljokspqm", "nqpjnripipkqhnmnhkmjltjjksmorrpknuqpsrssqmnkssmjkt", "uokkupunhrsulrtoinmhiilktqumiopiqtnqoojhkhjttnnlsh", "solrpojkjolhkskqmlqknrjmiiplrkjnjpnrhntsipsuhtrjlt", "jpsmuskktttmrphthmusiipstmnsmthljriosnnlpksiksipii" };
        assertEquals(7, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case69() {
        String[] oldText = { "G<FC==>F?B@FBDGA<F@GD<B=<G@>>>>@B@B>BGC@GEEB=?BGDG", "<B<EEC???=F>GB?>A>@F@@B@@B??CE?=>DEBGBFB===E?<??BC", "<D>DDAF<FAAE?>D>BB=>@C<=C>G@ECDDEGFCF@=<FDFC?<EDEF", "EA>?@BBB@?GEA<>@AGAB==G@DCEBE>G?>=>@>>GB>CD@<>ECDG", "A<?=BACE@D@>?ACDCEEF<BF?BA>GD@=GF<><A=<C@<CD?G=EFC", "?A<=G?F@C?B?<>>=B>@>D" };
        String[] newText = { "G<FC==<@<=G@E=?=D@>=<@<B=AE??DC>D?D>F?BC@E>@G=F=G<", "F=>E<ACBGA@@=FCEA==D@CF>AB<?>C?B=@>FA<DEBAC>F=EBDD", "DB=<?@FBDGA<F@GD<B=<G@>>>>@B@B>=A<>A>GCC?EEDF<@F>C", "ADD=>=<DEFCACGGBGC@GEEB=?BGDG<B<EEC??=><C@BGC@C<<E", "D=G=<GGFC?=F?=A?=F>GB?>A>@F@@B@@B??CE?=>DEBGBFDE>E", "AF>G@=BE?@FDAG>>@FFF=?=FBDAGC<@>=?BE<??DD@EFAC=GAG", "FF><CEAEC@FGA<=>EB=CGGGC>D=<FD?=BE=?=@B===E?<??BC<", "D>DDAF<FAAE?>E@AB<???@AG<?B?EDDAA<>AAED@<FGB=?B@AD", "A@><BDCDA@@?AC<DCDAB@CDA?GBF<@BG<@<B@===GG@D<@D?=C", "G@BACG=AGC<CDDGCD=DCCCDFAB@?CECA@=F@B?=DEADDDGGED>", "A@A>?>FBBCC=B>D>BB=>@C<=C>GF>CFDC>C=D<@<<FECE>GB<A", "@GB@@>>CFCFC@ECDDEGFC?ECE@<AEFDCBDEF@=<FDFC?<EDEFE", "A>?@BBB@?GEA<>@AGAB==G@DCEBE>G?>=>@>>GB>CD@<>ECDGA", "<?=BAD<G<A>=DCGDBB=BG?CDBFE<<F=GG?EG@CE@D@>?AA@C@?", "GCF><GGDB?F=BECD@GE=CCDCEEF<BF?BA>GD@=GF<><A=<C?C@", "<==FFA@GFG@?C?>DAEE?=?CEE>?A=GDG@<CD?G=EFC?A<=G?F@", "C?CG?DBCB>GAAEG=BABE?GB?=@><F=@AECC<AGGDDDFDFDCE<E", "=FB=>DE<@AADDB?=>D@B<FEDBEAE=<<DFFG?B=@=CD@AB@ACGC", "EBAA?ABCD=AE?FB>AF>G@C<@=EBFC?DB>EE@<B@<GCC@GGEB=@", "EE<>@F>G@BF?G<E<=DCAFA<FB>G@G=A?@@A?FBBB?<>>=B>@>D" };
        assertEquals(12, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case70() {
        String[] oldText = { "QSTWUXTTPWQSWRUUXXURRRTVVSSPQWQXQPPYURTYPTVUTYWQPX", "SPWVTPRUYPYWURXQXSPYWQRSYUXSTYVRSVXSWUTQRRYVXYSVSP", "RQUVPTRXPVVUVVXVPQSTUXPXWVYWVYVPWYTTQRWQQRTPXVWSPQ", "YYWWQSVPUPYRYUTTPPUVWUTYXUXXXVXTVQPQTSYVRYUTUTSWRV", "UQPTTYWRRURSYYXVPXTVUTSQVQRRPVYWQTWRQWTTWVSVPVVRUS", "XYUSPWWRSTUQXUVTUYRTWSQQWPTRPRTRVTVTUTVSRTPRQWPTUS", "UQPXUURWY" };
        String[] newText = { "QSTWUXTTPWQSWRUUXXURRRTVVSSPQWQXQPPYURTYPTVUTYWQPX", "SPWVTPRUYPYWUUWQPWUPVXWPUSPRRUPXPWUPTVRYWSVUTXSXTX", "WVURXQXSPYYQQUXVTWQRRTSTWWTXVTTYQQSRTYYXSXXWQYQWWQ", "RSYUXSTYVRSVXSWUTQRRYVXYSVSPRQUVPTRXPVVUVVXVPQSTUX", "PXWVYWVYVPWYTTQRWQWUUYSUXVRQQRTTXUVUQRUPPSXPYYSPUU", "XYVXYWVSWVWYXWYUXUWQQQTSRUWSXQQQWVXRPRVXRTYQWTVPYX", "UQYYXYRYTPXVWSPQYYWWQSVPUPYRYUTTPPUVWUTYXUXXXVXTVQ", "PQTSYVRYUTUTSWRVUQPTTYRXTWSVRXTRQXYTUWWPQYUVVPPVPW", "WWWVXQXRXQRXSXYWRRURSYYXVPXTVUTSQVQRRPVYWQTWRQWTTW", "VSVPVVRUSXYUSPWWRSTUQXUVTPPTTRXWSYWUVSURTVTYTQUUVV", "UXPTURXTSSRYUVXPPRWPXUWQUSWWXWPVYQYTPWTVRRUVPWUTSU", "PWPQVVUYRTWSQQWPTPPTPPWYSTURRVTRVTRUVRUWTURTQYVQQX", "YUUWQTPURRSRPRWXRUUPPYTVRRRQQSUYQQRTUWYQRRVRSWUXSR", "WTTQVYYYPSVTTWXSVPWXTQXTUTYPTXWVWWUSTUPSTXSSXQXQSX", "XUUYXXWWSTRTSQRYPYRYTRSWRUPPYSSWVPPRSTUWRVUQXYRXPT", "RYQPYQYUPUWXQVRTRUTRSQRSUSTYYYYXYUVQVSXVWSTWTTQYUQ", "WSSUTSUQXWUYVUPTUSPVQVXQXXYXSSSWXWVRTWXUXRVQXUWVYU", "VSRTRVSPTRSPPXTSXWWVQQQUYVWVVVYWRTUPYPYSQUXPVSUYWS", "TVTUTVSRTTRQQWRVYWYRSSTPTRTUUPRQWPTUSUPUPUUTVQQQUW", "PQPRQPXUQPPPUPQXWRUPRXYPURQSWUPWRRRXUVYWPQYQPSURWY" };
        assertEquals(12, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case71() {
        String[] oldText = { "jnnikohmhmolhjojjmkimlnoomhjjomillmlnjoookojiijmhl", "imnhlloohjinhlihnmnjnlmmjmikoijimooolihhkonmohkhii", "mlklokkjihlkjnimkhklmkmihlnliihmljnoilloojhlokjjik", "jonmjjmjnjhimmlhhnmmhoimijmljljjo" };
        String[] newText = { "jnnikohmhmolhjojjmkimlnoomhjjomillmlnjoookojiijmmn", "okkkilmojhlkjhjkiojoiimkojolkjilmhhhkmmhiknnhnnkji", "inmkjnnkhkhjnhlijkkkioklijninkijioknnlmnmmillommkk", "jmhnhjkmmllmnklilijmkiokoiklhljjokikimnhlloohjinhl", "liinlmjolnlonnknnonnhklkojhjolnhmonmnkihmlimihnmnj", "nlknmhlmmhhlolnhklllmlhohnjhohikjomhnlnjhnkmkhmlom", "mjmikoijimooolihhkonmohkhiimlklokkjihlkjnimkhklmkm", "inimnhonijimokmhklmmomijjklijinolljljlhmlonijhkiih", "lllljimhlnliihoihlkolnjmjhmnmnlolokminohnijoljkllm", "jiiijkmjhmknkhmoljoihmklkjokomlnnkhnmiooinmjnlolnk", "jioolmhkjllmihhljljhookhkjojjmiokollomhhmmjkllolml", "jnoillmnkjnlonkkhnnlllhnhokolljnlmooliknmmkomhhmkm", "ojklkoojhlokjjimmomonjkiionnlmlolnnjoonkjioilhimjj", "lnlimhhlonnklnljmmjhmjhhloookmnolonlljhnkkmnkinlom", "nhnhlohlmhhmihjimkhnjlhjkohilmlkiholmohhmkonlkilhn", "hllhnmonkmmmmnmohnkhokohiomjoinlllohnkikmmikjniojn", "niknkomhnkloionolmhminnjhijllnmmnklhihljmninhmlljn", "kjonmjjmnnhmhjkokjijnllmnnjonkhmhjklkoohnollknmkhk", "knjnjnjhimmlhhnmmhoihjilhkhhmojkoliinknkloihiinlmj", "jokjoolilhimijmljljjihkliojnhnljliijiohhjnjkoinmmo" };
        assertEquals(11, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case72() {
        String[] oldText = { "keefjfhilkfkehijfhekllihkfkilhikeeiighejilijglefkj", "ifjileggjilfljkkljeeigkhkkjjgekfghjkjlljekfgelgiig", "fheileeifiilffljielkfkkliejilljhhilhekkhfjhlkehkhi", "ilgjejjgfkhgjkekglefigfiilffjfejigifffifjhfjklfkgl", "khfilijgkkkigffekjkffjjjiikefkkfeflklljjjglekhkkhh", "k" };
        String[] newText = { "keefjfhilkfkehieflfjligjljhefhjegeggleelligjefhhif", "ijjfljlgjhjhkklllhghfkeillgklkiljfejjjjjeiekelijli", "khjfiifgefgkeekfefgkfjhhhhjgfhgiikjfhjlkffgkehjijk", "llhglljfhekllihkfkilhikeeiighhegifihifkgheigeihffl", "lhhhkjiejiljelfiiggeljjhgjhhjfiiilejfekigfhgjijlfk", "ejkgfeekffejilijglefkjifjileggjleekfkellgliilkkhfh", "fehjgilfljkkljeeigkhkkjjgekfghjfljkiiglfjgghlffjgj", "lejjigfeffeijflelggikjlljekfgelggljhjlfiejfjgfhfkk", "jehjlifkhkjfhgkfiefhgigljeiigfheileeifiilffllhjkji", "eljeeigiheikkflghklklheejhgkjkjlghfehkgflkgfkflljf", "khgheigijielkfkkliejilljhhilhekkhfjhlkehkhiilgjejj", "gffkijlgeihhkekkehhjkeljfhfgegkfeelkkeleglegijkhgj", "kekglefigfiilffjfejigifffifjhfjklfkglkhfilijgkkkig", "ffejkfkekfjklfllllkkklljlkkkligjgegjgeeeffjifijgfg", "iehfgfilhhikgglflhhkkhgigfglfgiggigijiilgijiilfhll", "fgefhhilihillelfhhellkfefefkekgfkikggjhjjeifihhfji", "iejjhffeejiiffekfkfhegkjiefikifllfkijkjifkighlfjej", "kihelgfilhfeejiffgfljjjlghfhliieffgkefjjklhklkelle", "kifgggijfjhfhjigliellhjfjkffjjejjjejhkhekjiiljkkfg", "flllkejejlggigjghhjhljjiikefkkfeflklljjjglekhkkhhk" };
        assertEquals(10, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case73() {
        String[] oldText = { "?>=;;<9==?;==?><:><;9<>9?>:=9?<;=;;9=9;9:?=>?>;<<9", ":>9=?<;:<===>=9<:==9<;>:9:><;<:>:?:?=?=:>;:;<=?==:", "=<?<=>:;<=?<?==<;===<<;><::;<;=?><<=:>=<>;=<;>?;9=", "?;;?:=9<9=<?;=?><<;;?<;9;:9<>>=>:;99>=<::>::=>>;<>", "><==;;><9>:::;9:?;?:9><;?:><:?>9=<><:9=99<=?9=9;>9", "==<9=:;?>?;==;;=?;:9;;><==?:<<:?;=:?<=>?9:;" };
        String[] newText = { "=:=>?:;9==:?9:=:<=>:;>??>=;;<9==?;==?><:><;9<>9?>:", "=9?;>9?;;9;?>9;;9>;:9;<;=;9:9?><>><>?<:>=<?;?9;>=;", ";9=9;9:?=>?>;<<9:>9=?<;:<===>=9<:==9<;>:??<<>?99=;", ":?>?><=:<=9<<<:<?9=><?::99=?>;9>;;=9=9=?=;;;>;:;<:", ">;=>;9>;9:>;=<=<?><;=>>::<;=:9?;;;<?====<==9=;<>>?", ">>>;<<?><::???9<===9==;>;<:<;<:>:?:>;:;?=?=:>;:;:9", ";?9;:?9<?>:?:><<>=><=9>><=>;;;<>?9>9:9?=:=<>;=<9;<", "=<=?==:=<?<=>:;<=?<?==<;===<<;><::;>9:;?:::?:>9=99", ";==9==:=><>>=?9?;:=<:=<9;;;=9:9<9?==>;:>><==:9<><:", ";=9:>>?9;>?9;=?<=:9==<>:?9=?>99:?<:9::><:<?<:=;9>>", "<=:;=?><<=:>=<>;=<;>?=<:>9<??=:<<<>:?9>9?<<=>?99<<", "<<9<:=?;9=?;;?:=:<=:=:;;;=<?<>=;=><<==><99<9=<?;=?", "><<;;?<;9;9<=:>=;:?;<9=>?<><<=<==;?>=>:9;9;>>9?;;=", "<>>;9?9=?:>?=9?9<:<:;:?;<<:::;;??<?<9;99=;?=:9<>;=", ":>>:9?<:>::9<>:==<:?>:<;<<==>;?:?:;<?<=>=>:;><9:<9", ":>><<=99?=><??:::=999>=<::<><>=><9=><:;<??>>=><?9:", "::>::=>>;<>><==;;><9>:::;9:?9>>??<99<9:<<<;;>::;?;", "?9<=<>=99;>=<:;?:9><;?<==?9>>=:<<?:?>=?=?<;:><:?>9", "=<><:9=99<=?9=9;>9==<9=:;?>?;==;;=??9;=:=;?>?<;?:>", ">9;;?9<;:?;:9;;><==?:<<>;???==?=??;99:?;=:?<=>?9:;" };
        assertEquals(19, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case74() {
        String[] oldText = { "JIIHJHHEJDDJIJJGEEDGIGIGHJDIJGGFFIHDGHJHFIGDIJIHIH", "EFFGHIGGDDDIFDIEFIDHIJJEGDDIFGFDGJFIHEJEHHEJEFJEEH", "JEGHIGEFIDFEHIEJDGGJIFDJFIDJHIHIFHIDDGJIIEIGHEIJHJ", "FHHJGHHDFIEIIIGIJIJDGHDGDHJHHFJFGJGFFDEJJGIIEDIHEF", "DDJEFFGJIFIFFJEJFEFFHHJFDDFFIJFDFGJ" };
        String[] newText = { "JIIHJHHEJDDJIJJGEEDGIGIGHJDIJGGFFIHDGHJHFIGDIJIHIH", "EFFGHIGGDDDIFDIEFIDHIJJEGDDIFGFDGJFIHEJEHHEJEFJEEH", "JEGHIGEFIDGIEFFJJHDGGJJFGHDEIJGGDGJHHDFGEHDDEFEHDD", "JDHIDFEHIEJDDGHIGEGJEEFHEEEHHHHGIIEDJJEEDEEJDFEJEG", "GGJIEEFEHDHFHJGIDIHIHIHEJJHEJFDDHGFEHJJFHJEEHDFFDH", "GEDDHFJDDJDJEGEGGIHHFJEJFIFGGIIEJHFDDDHFJIHFJIGDHG", "GIGJJFGIEJGJGHGIEDHJJEIHIEJIIEFJDFFIEDJHJJIEEDEFDJ", "GEFJFHFHIIHJDIJHIHGDHIHJFDIGHEHEFJIJIDDJEHGEHIFDED", "DHDFIDIIDGDJDDEEFDDEGHFHIEJJIGDDFEHIEGEGHGHHHDIIJE", "EIIGEIEGJIFDHEEDHJFJJDDGHJHIFHFIFGJJDEIEJIDHJIHDDE", "JIFFJIIDDGDJGDFGHEGDJJFJEHGGHJIIDHIJIDIFIEGIIFEJFF", "JIGHGEHFHGEJIEFEDGIHEGDFDGJEIFDIDEIGEHFFFGDHGGIIJH", "JEGHFDJFEFFJDFEDHDGJHIJJHJDGIIGGJHGGGGGHEFHEFDJFID", "JHIHIFHIDDGJIIEIGHEIJHJFHHJGHHDFIEIIIGGGEEDDJEEGDI", "IGGIHFEGIJIJDGHDGDHJHHFJFGJGFFDEJEIGGEFEGGJJEDIFEE", "FJFFGDIDIEIEHIHFJDFFJHDFHJGIIEDIHJHIIJEDIDIEGJGEJD", "EEIEIJIGGIFHHHFJIFGEDDFGFFFHGEGJJHEGDJFEDIHDHFGFIH", "EFDDJHFDGFHEHEJDFDGGIFEEFHEGIEGDFEDDHEJHEDDDFFDIHG", "GJJGJFEJEFJDHHDFJJJJHGGHGEEDHFJGEIGGEDFGHIIDDDHGGI", "DHEEGGHFHJGDGIHJEHEFFGJIFIFFJEJFEFFHHJFDDFFIJFDFGJ" };
        assertEquals(7, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case75() {
        String[] oldText = { "JIIJIIJJJIJJIJJJIJIIJIJIIJJIJJJIIIIIJIJIIIIIIIIJII", "IIJJJIIJJJIJJJJJIJIJIIJIIJIJJIIJJJIJIJIIIIIIJIJIII", "JJJIJIIIIJJJIJJJJJIIIIIIJIJJJIIIJIJIJIJIJIJJIIJJJI", "JIIJJJIIIJIJIJJIJJJIIIJJJIIIJIJJIJJIIIJJJIJJIJJJJI", "IIIIJJJIJIIIJIIJJJIIJIIIJJIIJJIIIJJ" };
        String[] newText = { "JIIJIIIIIJJJJJJJIJIJIIJIIJIIJJIJIJIJJJIJJIJJIJJJIJ", "IIJJJJJJIIJIIIIIIIIIJIJIIIJJIJJIIIIIIJIIJIJJIIIJJJ", "JJIIIJIJIJJIIIJJJJIIIJIJJJIJIIIJIIIJJJJJJJJJJJIJII", "IIIJIIJIJIJIJIJJJIIJIIIIJIJIIJIJJIIIIJJIJIJJJIJJIJ", "IJJIJJIIJIIIJJIJJJJJJIJIIIIIIIJJIJJIIIIIJIJIJJIIJI", "IIJIIIIJJJIIIJIIJJJJIIJJIIIJJJIJJJJIJIJIIJJIIJIJJI", "JIIJJIJJIJIIJJJJIJJJJIJJJJIIJIIJIIJIJIJJJJJIIIJJIJ", "IIIJIIIJJJIJIIJIJJIIIJJIJIIIIJJIJIJJIIIIIIJJIJJIJJ", "IJIIJIIJJIJJJJIJIJJJIJJJJIIIIIIJIJIIIJJJIIJJIIIJIJ", "JIIIIJIIJJIIIJIIJIIIJIJIJJIIJIIJJJIJJJIJIIIJIJJJJI", "IIIIIJJJJJIIIIJIJIJIJIIJJJIIJJIJIJIJJJIIIJIJIJIJII", "IJJIIIJIJJJJJIIJIJIJJJJJJJIIJJIIIIIJJIJJJJJJIJIJII", "JJJJJJIIIJJIIJJJIJIIJIJIIJIJJJJIIJJIIIJIJIJJIIIJII", "JJJIIJIJJIJJIJIIIJJIJIJJJJIIJJIJJJJJIJIJJJJJIIJIJI", "IJIJIIIJJIJJJIJIJJIIIJJJIIIIJJJJIIJIIJIJJJIIIJIJJJ", "IJIJIIIJJIIIJIJJJJJIJJJIJJIJJJJJJIIIIJIIIIIJJIIIJI", "JJIJIJJIIJJJIIJIIJJJJJIIJIIJJIIIIIIJJIJIIJJJIIJIII", "IIIIJJJIJJJJIIIIIJJIIIIJIJIJIIIJJJIIIIIIJJIJIJJIJJ", "IIJIIIJJJIJIJJJJJIIJJIJIIJIJIIJJJJJJJIIJIJJJJIJIII", "IJIIIIJJJJJIIJIJIIJJIJIJJIIIIJJIJJJJJIJIJIIJJIIIJJ" };
        assertEquals(29, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case76() {
        String[] oldText = { "uv" };
        String[] newText = { "uvvuuuvuvvvvvvvuuuuuvuuvuvuvuuuuuuvuvvvuvvuuuuvvuv", "uvvvvuuvuuuuuvuuvuvvuuuuvuuuuvuvuuvvvvvvuuuvvuvvuu", "uvvuuvuuvvvvuuvuvuuuvvvuvvuuvuvvvvvuvuuuuuvuvvvuuu", "uvuvvuvuuuvvvuuvvuuuvuvuuuvuvuuuuvuuvuuvuvvuvvvuuu", "uvuvuvvvvuuvvuvvuuvvuuvvvuuvuuuvvvuuvvuuvvvvvuuuvv", "uuvvuuvvvvvuuuuvvvuvvuvvvuuvuuvuuuvvvvvvuvvuuuvvuu", "uvuuuvvuvvvuvvuuvuvvvvuuvuuvuuvuvvuvuvuuuuvvvvvuvv", "vvuuvvvvuvvuvvuuvvuvvuuvuvvuvuuuuvuuvuuvuvuvuvvuuu", "uuvuuvvuvuuvvvvuuvvvuuvuvuvuvuvvvvuvuuuvuuvuuvvvvv", "uvvvvvuvvvuuvvvuvuuuvvuuuvvuvuvuuvvvvvvuvvuuvuuvvv", "uvuuuvuvuvuuuvuuuuuuvuuuvvuvuuvvuvuvuvuvvuuvuvuvuu", "uuuvuuuvvvvvuvvvvvvuvvvvuvvuuuuvvuuvuvvuvuuvuvuuuv", "vvuvvvuvuuvvuvuvvvuuvvvvvvuvvuvvuuuuvuuvvuuvvvuvvv", "vvvvvuvvuuvvvvuvuuuuvvuuuvuuvvuuvuvvuuuvvvuuvuvvvv", "uuuvuuuvvuvuuuvuvvuuvvvvuvuvuvvvvuvuvvuuuvvuuvuuvv", "vuuuvvvuvvvvvvvuvvvuuvvvvvuuuuvvuvvvuvvuvuvvuvvvuu", "uuvuuvuuvvuvuvuuuuvvvvvvuvvuvvvuvuvuuuvuvvuvvuvvuv", "vuvuvuvvvvuvuuuvvvvuvuvuvvuuvuvuuvuvuuuuvvuvuuvuuu", "vvvvvuvuuvvvuuvuvuvuuvuuuvuvvuvuvvvvuuvuvvvuuvuuuu", "vuvuvuuuuvuuvvvvuuuuuuvvuuvvuuvvvvuvvvuuvvuuuuvvuv" };
        assertEquals(1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case77() {
        String[] oldText = { "BBBBCCBCBCBBCBCBBCBBCCBBBBBBCCCCBBBBCBCBCCCCBCBCBB", "BCBCCBCCBBCBCBCBBBCCCCBBCCCBBCCCCBBBBCBBBBBCBBBCCB", "CBCBBCBBBBCBCBBCBBCCCCCBBBBCCBCBBCBCCCCCCBCCBCCBBC", "CBBBBCBBBBBBBBCBBBBCCBCBCBBBBCCBBB" };
        String[] newText = { "BBBBCCBCCCBCBBCBBCCCCBBBBBCBBCBBBCCBCCCBCBCCBBBCBC", "CBCBBBCBCCCBBBBCBBBCBCBCCBBBCCCBCBBBCBBBBCBCCCBCCC", "BCCCBCBBBCCBCCBBBBBCCCCCBCBBBCCCCBBBCBCCCCCCBCCCCC", "BBCBBBCCBCCCBCCBCBCBCBCBBBBCCCCCBCBBBBBCBBBBBBCCCC", "CBCBBCBBBBBBCBCCCCCBBCCBCBBBCBCCCBBCBBBBBCBCCCCBBC", "BCBCCCCCCCBCBCBBBBCBCBBCBBCBCCBBCCCCCCBBCBBBCBCCCB", "BCBCBBBCCBCCCCCCCBCBBCBCBBBCCCBCBCBBBBCBCCCBCCCBCC", "BCCBCBBCCCCCCCCCBCBBBBCCBCCBCBCBBBBBBCCCCBCCCCBCCC", "BBBCCCCBCBBCCCBBCCBCCCBBBCCCCBCCCBBBCCBBBCBBCCCBCB", "CBCCCCCBBCBBCCCCBBCCCBBBBBCBBCBCCCCBCBBBCCCCBBBCCB", "BBCCBBBBCBBCCBCCBBCBBCBBBBCCBCCBBCBCBCCBCBCBBBBBBC", "BBCBBBCCCBCCBBCCCBBCBCCBBBCCBCCBBBCBCBCBCCCCCBCCCB", "BBBBCCCCCBCCCCBBBCBCBBBCBBCBBBCCBBBCBCBCCCBBBCBCCC", "CBCCCCBBCBBCBCCBBCBBBCCBCCBBCBBBCCCCCCCCBBCCCCCCCB", "CCBBBBCCCBCBBBCBBCBBBBBBBCCBBCBCCBBCBCCBBBCCBBCCBC", "CCCCCBCCBCCBBCBCBBCCBCCBBCBCBBBBCCCBBCBCCBBCCBBCCB", "CBCCBBBBBCBCCBCBCBCBCCCCBBCCCCCCBCBBCCCBBBBCCCBBBB", "CBBBCCBCBBBBCBBCBBBBBCBBBCCBCBCBCCCCBCBCBBCCCBCBCB", "CBCCBBCBCCCCBBCCBBCBCBBBBCCCCBBCBCCBBCBBCBBBBBCCCC", "CCCBBBCCBBBBCBCCCBCCBCCBCCBBBBBBCBCBCCBBCCCBCCCBBB" };
        assertEquals(25, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case78() {
        String[] oldText = { "ssststsstttstsssttstsstssstsssststttstttsssttsstts", "stttstsssttssssssttttsststsstttstttstttttsstststst", "tttssttsttttsstssttssttttstttssttssttstststttssstt", "sttststssttstssssssstssttststtttttsttsststsststttt", "s" };
        String[] newText = { "ssstststsstttttsttssstttssstsssssssssttsttssssssss", "ttttttssstssssstttttstststtssssstttssssttttttstttt", "sttstsstssssssstttssstssttttttsststsstttssttttssss", "ttsststttstssstsstttsssttsttttssstsssstttttstsstss", "stststssttsttsstststtsttsststttttsstsstsststtstsss", "tsststtssttssssststssssttssstssststssssssssssttsst", "sttttttssssssttsststsststttttsttstttsttststssstttt", "ttsstssttstsststttsttstttstttttsstststsssssssssttt", "tttsststssststtsstststtsssttsssssstttssstttsssttst", "sttssststtttttsssstttttssttstststtttttsstsssttsttt", "tsstttttsttstssssstsssttttststsstttsttststtssttsst", "ttsssststtsststssssststsstttsststsststttssssstssss", "stttttsssssttttsstttttttstssttststttsstsstttttstss", "sttsttssstttsstststsssstttsssssstsststtstsstsststt", "sssssstttstsststssssststststtssttstttttssttsstssts", "stssssttstststtstsssssttttssstttstttssttststtstsss", "stsstssssttsttsttstsststststtssststttssstssstttttt", "sttsssstttststttsssttsstststtsstttttstttsssstststs", "sttssssttstttssttsststststttsstttttttttsttttstssts", "ttttstttstttsstttttsstssttttttststttsttsssststttts" };
        assertEquals(26, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case79() {
        String[] oldText = { "JIIIJJJIJIIJJJJJJIIJIIIIIIIIJIIIJJJJIIIJIJJJIJIIIJ", "IIIJJJJJJJJJJJIJIIIIJIJJIJJIIIIIJIJIJJIIJIIIJIIIIJ", "JJIIIJIIJJJJIIJJIIIJJJIJJJJIJIJIIJJIJJJJIIJIIJIIJI", "JIJJJIJJIJJIJJIJIIJIIJJIJJJIIIIIIJIJJJIIIJIJJJIJJI", "JJJJJJIIIIJIIIIIJJIIIJIJJIJIJJIIJJJIIJIIJJJJJIIJII", "JJIIIIIIJJIJIIJJJIIJIIIIIIJIJIIIJJJIIIIIIJJIJIJJIJ", "IJIJIIJJJIJIIIIJIIIIJJJJJIIJIJJIIIIIJJ" };
        String[] newText = { "JIIJIIIIIJJJJJJJIJIJIIJIIJIIJJIJIJIJJJIJJIJJIJJJIJ", "IIJJJJJJIIJIIIIIIIIIJIJIIIJJIJJIIIIIIJIIJIJJIIIJJJ", "JJIIIJIJIJJIIIJJJJIIIJIJJJIJIIIJIIIJJJJJJJJJJJIJII", "IIIJIIJIJIJIJIJJJIIJIIIIJIJIIJIJJIIIIJJIJIJJJIJJIJ", "IJJIJJIIJIIIJJIJJJJJJIJIIIIIIIJJIJJIIIIIJIJIJJIIJI", "IIJIIIIJJJIIIJIIJJJJIIJJIIIJJJIJJJJIJIJIIJJIIJIJJI", "JIIJJIJJIJIIJJJJIJJJJIJJJJIIJIIJIIJIJIJJJJJIIIJJIJ", "IIIJIIIJJJIJIIJIJJIIIJJIJIIIIJJIJIJJIIIIIIJJIJJIJJ", "IJIIJIIJJIJJJJIJIJJJIJJJJIIIIIIJIJIIIJJJIIJJIIIJIJ", "JIIIIJIIJJIIIJIIJIIIJIJIJJIIJIIJJJIJJJIJIIIJIJJJJI", "IIIIIJJJJJIIIIJIJIJIJIIJJJIIJJIJIJIJJJIIIJIJIJIJII", "IJJIIIJIJJJJJIIJIJIJJJJJJJIIJJIIIIIJJIJJJJJJIJIJII", "JJJJJJIIIJJIIJJJIJIIJIJIIJIJJJJIIJJIIIJIJIJJIIIJII", "JJJIIJIJJIJJIJIIIJJIJIJJJJIIJJIJJJJJIJIJJJJJIIJIJI", "IJIJIIIJJIJJJIJIJJIIIJJJIIIIJJJJIIJIIJIJJJIIIJIJJJ", "IJIJIIIJJIIIJIJJJJJIJJJIJJIJJJJJJIIIIJIIIIIJJIIIJI", "JJIJIJJIIJJJIIJIIJJJJJIIJIIJJIIIIIIJJIJIIJJJIIJIII", "IIIIJJJIJJJJIIIIIJJIIIIJIJIJIIIJJJIIIIIIJJIJIJJIJJ", "IIJIIIJJJIJIJJJJJIIJJIJIIJIJIIJJJJJJJIIJIJJJJIJIII", "IJIIIIJJJJJIIJIJIIJJIJIJJIIIIJJIJJJJJIJIJIIJJIIIJJ" };
        assertEquals(14, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case80() {
        String[] oldText = { "cdcdcccdcdcdcddcdcddcdcdcdcccdddddcddccccddcdccccc", "cdcccdccdddcdccdcdcdcddcddcdcdcddddccdcdcdcddccccd", "dcddcccddccdccddddccdcdcccdddcddccdcdddddcdcccccdc", "dddccccdcddcdcccdddccddccdddddccccdddcddcdddccdccd", "cccdddddccddcddccdcddcdccccdccdccdcdcdcddcddddccdd", "dccdcdcdcdcddddcccddcdccdcdcdcccccdcccdddddcddddcc", "dcdcccdddcdddddddcddccddddcdcdcccdcddccddddcdcdcdd", "ddcdcddcccddccdccdddcccdddcdddddddcd" };
        String[] newText = { "cdcdccddcdcccdcddcdccccccdcddddddcccdcdcdcddcdcddc", "dcdcdcccdddddcddccccddcdccccccdccdddddddddccddccdc", "dcddddcccdcccccdcccddccccdcccdcdddddccdcdccdcccdcd", "cddcccdcdcccdcdcccdddcdcdcdccccdcccdccdddcdccdcdcd", "cddcddcdcdcddddccdcdccddddddccccdcddcccdcdddddddcc", "cccdccdcdcdccccccdcdddcddccccddcdcddddccdcccccdccd", "cddccccdccccdcdccddddddcccddcddcccddccdccddddccdcd", "cccdddcddccdcdddddcdcccccdcdddccccdcddcdcccdddccdd", "cccdcdcccdcdccccdccdccdcddcdddccccdcdcddddccddcddc", "cddccdddccdcccdddccddccdddddcccddccddccdddddccccdd", "dcddcdddccdccdcccddddddcddcccddcccdcccddcdddcddccd", "cddddccdccdccdcddcdcdccccdddddcddddccddddcddcddccd", "dcddccdcddcdccccdccdccdcdcdcddcccccdccddcdccddddcc", "dddccdcdcdcdcddddcdcccdccdccdddddcdddddcdddccdddcd", "cccddcccddcdcdccddddddcddccdccdddcdcccdcdcdcccdccc", "cccdcccddcdccddcdcdcdcddccdcdcdcccccdcccdddddcdddd", "ddcddddcddccccddccdcddcdccdcdcccdddcdddcdccddcdcdd", "dccddddddcddcddccccdccddccdddcddddddddcddccddddcdc", "cccddcccdccddccdcddcccdddccdcddddcccdcccddcdcccdcd", "dccddddcdcdcddddcdcddcccddccdccdddcccdddcdddddddcd" };
        assertEquals(12, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case81() {
        String[] oldText = { "yzyyyzyzzyzzyzyyzzzzyzyzyzyyzyyyzzzzzyzyyzzzyyzyzy", "zyyzyyyzyzzyyzyyzzyzzyzzzyyzzzzzzyzyyzyyyyzzyzzyzy", "yyyyzzyyzyzyzzzzzzyzzyzyzyzzzzyyzzzyyzzzzyyzzzyzzz", "zzyyyzyyzyyyzzyyyyzzzzzzyyyzyzyzzyzzzyzyyzyyzzzzyy", "zyzyyzyzyyyyzyzyyyzzyzzzzzyzzyzyzyyyzyzzzyyzzzyyyy", "yyyzyzzzzyzzzzyyzzzzyzyzzyyzzyyyyyyyyyzzzzyzyzzyzy", "yzz" };
        String[] newText = { "yzyyyzyzzyzzyzzyzzyzyzyzzzzyzyyyzzzzyzyzyzzyyzyzyy", "zyzyyyyzzyzyyzyyyzzzzzyzyyzzzyyzyzyzyyzyyyzyzzyzyz", "zzzyyzyzzzyyzyyyyzyzyzyyyyzyyzzzzyyyyyyzzyyzzyyzzz", "zyzzzyyzzyyyyzzyzyyzzyzzyzzzyyzyzzyyzzzzyzyzyzzzzy", "zzzyzzzyyzzzzzzzyzyyyzyzyyzyyyyzzyzzyzyyyyyzzzyyyz", "zzyzyzzyzyzzzzyzyyzyzyzzzzzzyzyzzzzyzyzzyzyyzyzyyz", "yzyzyyzzyzyzyyzyzzzyyyzyzzyyyyyzzyzzzzzyyyzzyyzyyz", "yyzyyzyzzzyzyzzyzzyzzyyzzyyyyzyzzyzyzyzyzyzyzzyzzz", "zyzzyzzyzyyzyyzyyzzzyzyyzyyzyzyzzzyzyzyyyzyyzzzyyz", "zyzyzzzzzyzzyzzzzyzzyyzzzyzyyyyzzyyyzyzyzzyyzzyzzz", "zyyyyzzzyyyyyyzyzyyzyzzyyyyyzyyyzyyyyyzzyyzyyzyyyz", "yyyzzyzzyyzyyyzyzyzzzzyzyzyzzzyyyzzyzzzyzyzyzyzyyy", "zzyzzyyzzzzzyzzyyzyzyzyzyzzyyzzyzyzzzyzyyyzyyzyzzz", "zyzzyzzyyyyyzyzzyzyyyyzzzyyyzzyzzyzzyyyzyyzyyyyzyz", "yyyzyzzzzzzyyyzzyyyyzyzyyyzzyzyzyzzzzyyzzyzzzyzzyz", "yzzzzzzyzzzyyzzzyyzzzzyyzzzyzzzzzyyyzyyzyyyzzyyyyz", "zzzzzyyyzyyzyzyyyyyzyzzyzzzyyzzyzzyyyyyyzzzyzzyzyz", "zzzyzzyzzzyzyyzyyzzzzyyzyzyyzyzyyyyzyzyyyzzyzzzzzy", "zzyzyzyyyzyzzzyyzzzyyyyyyyzyzzzzyzzzzyyzzzzyzyzzyy", "zzyyyyyyzzyyyyzzyzyyyyyzzzyyzzyyyyyzzzzyzyzzyzyyzz" };
        assertEquals(10, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case82() {
        String[] oldText = { "EDEDDDDEEDEEDDEEDDDEEEDDDEEEDDDDDDDDEDDEDEEEDEDDED", "EDDDEEEEEEDDDEEDDEEDEEEDEEDDEEDDEDEDDDDEDEDEEEEDED", "DEEDEDEEDEEDEEDDEEDDDEEDDEEDDDEDEEDDEEDDDDEDEEEDDE", "DEEEEEEDEDEDEEDDEEEDDEEDDDDEDEEDEEEEEEDEDEDDEEDDED", "DDEEDDEEEDDDEEDEDDEEEEDDDDDEEEEEEDDEEEDEEDEEDDEDDD", "DEDEEDEDEEEDDEDDDDDEDDDDDEDDDEEDEDDEED" };
        String[] newText = { "EDEDDDDEEDEEDDEEDDDEEEDDEDEDEDDEEDDEEEEDEDDDEEDEEE", "DDEDEDDDEDEDEDEDDEEEDDDDEEDEEDEEEDEEEDEEEDDDEEDEEE", "EEEEEEDDDDDDDEEDEDDEDDEDEEDDEEEEDEDEEEDEEDEEDDDDDE", "DDDDDEEDDDEEDEEDEEDEEEDEEDDDDEDEEDDEDEDEEEEDDDEEEE", "DDDEDEDEDDEEDEEDEDEDEDEEDDEDEDEEDDDEDDEDEEEDDEDEDD", "EEDDEEEDEEDEEDDDEEEDDDDEEEDDEDDEDDDDEDDEEDDEDEEEEE", "EDDDDEEDDEDDDDDDEDDEDEEEDEDDDEEEEEEDDDEEDEEEDDEEDE", "EEDDEEEDEEDEDDEDEDDDEEEDDEEEDEDDEEEEEDDEEDDDDEDEDE", "EEEDDDEDDDEEEEEDDEEDDDDEEDDDDDDEEDEDDDEEDDEEDEEEDE", "EDDEEDDEDEDDDDEDEDEEEEDEDDEEDEDEEDEEDEEDDEEDDDEDED", "DDEDEEEDEEDDEEDDDEDEEDDDDDEDDDDEDEDDDEDEDEDDDEDEDE", "DEEDDDDEDEEDDDDEDEDDDDEDDEEDDDEDDDDEDDEDEEEDDDEDEE", "DEEEEEEDEDEEDEDDEEDDDEDDEDEEEEEEDDDDEEEEEEEDDDDEED", "EEDEEDEDEDEEDDEEEDDEEDDDDEDDDDEEEEDEDDDDDDEDDDDDEE", "DEEEEEEDEDEDDEEDDEDDEDEEDEDEDEDEDEDDEEEDDDDDDDDEDD", "EDEDDEDDDDDDDEDDDDEEDDDEEDDEEDDEDEEEDEDDEEEEEEEEDD", "EEEDEEEDDEEEDDEDDDEEEDDDDDEDEDDEDDDDDEDDDDDEEEEEED", "DEEDEDEEEDEDDEEEEDDDDDEEEEEEDDEEEDEEDEEDDEDDDDEEDE", "DDEEDEEEEEEEEEDEEDDDDEDDDDDEEDEDEDDDEDDEEDDDEEEEDE", "DEDDDEDEEDDDDEDEEDEDEEEDDEDDDDDEDDDDDEDDDEEDEDDEED" };
        assertEquals(14, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case83() {
        String[] oldText = { "onnonnnoooonooooonooonnnnonnnnnnoononnnnoonnonoonn", "oonnnonoooononnnoooonoonoonnonnononoononooononnnoo", "oooonooonnnnnnnoonooononoononooononoonooonooonoooo", "nnnonnooonnonnnnoonooonnnononoooooooooonoonnonnnno", "onooooooooooononooonoonoonnnononnonnonnnnnnooonnon", "oonnnoononnnooonnnnooooonononnnonooooonoonooonnnno", "nooonononnnnooonnnooonnnnnonnnono" };
        String[] newText = { "onnononnnonnonnoooonoonnnnonoononnnonnnoonnnnnnnnn", "onoooonoooooononoonoonnoonoooooonnnnnnoonnnnnooooo", "ooonnoooonooonnoonoonoonoooonooooononnoonoonoonooo", "ononononnoonnnoonooonnononooonnnnnonnnoonnnonnnonn", "nononnnnnoooonoonnnnnoononnoonnonnonnnonnnonnnnono", "onnooooonnoooononnonnnnnoonnnnnoonnnnnonnnonnnnono", "nooonnononoooooononoonnonnononoonnnnononnoooonnnon", "onnnnonnnooonooooonooonnonnnnoooonnnnonnnnnnoononn", "nnoonnonoonnoonnnonoooononnnoooonoononnonnnnnoonnn", "nonnnoononooonnonnonnnnnnooonnoononooonnnonnnoonnn", "onnoonnoonnnnoonnnonnoononnnoonooonnoooononnonooon", "nononoononooononnnoooooonooonnnnnnnoonooononoononn", "nnononnnnononoooononnonononnoonnnoononooononoonooo", "nooonoooonnnonoonoonnnnonnnooonnnonononnoooooonnnn", "ooonnonnnnoonooonnnononoooooooooonoonnonnnnoonoooo", "ooooooononooonoonoonnnononnonnonnnnnnooonnonnnnnno", "nnonnnnnnnnnononononnonnnoonnnoononnnoooonnonnnoon", "nnnooooonnnnoonnooonoonnnnnnnooooooonoonnnnonnnnnn", "nooooooooononnnnooonononnnonooooonoonooonnnnonooon", "ononnnoonnnoononnoooonooonnonooonnnooonnnnnonnnono" };
        assertEquals(11, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case84() {
        String[] oldText = { "wxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwx", "yzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyz", "wxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwx", "yzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyz", "wxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwx", "yzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyz", "wxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwx", "yzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyz", "wxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwx", "yzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyz" };
        String[] newText = { "wzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzw", "zxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwz", "xwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzx", "wyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxw", "yxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwy", "xzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyx", "zwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxz", "wzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzw", "zxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwz", "xwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzx", "wyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxw", "yxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwy", "xzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyx", "zwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxz", "wzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzw", "zxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwz", "xwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzxwyxzwzx", "wyxzwzxwyxzwzxwyxzwzxwyxz" };
        assertEquals(372, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case85() {
        String[] oldText = { "wxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwx", "yzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyz", "wxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwx", "yzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyz", "wxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwx", "yzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyz", "wxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwx", "yzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyz", "wxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwx", "yzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyzwxyz" };
        String[] newText = { "wzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywz", "xwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxw", "yxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyx", "zywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzy", "wzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywz", "xwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxw", "yxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyx", "zywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzy", "wzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywz", "xwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxw", "yxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyx", "zywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzy", "wzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywz", "xwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxw", "yxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyx", "zywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzy", "wzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywz", "xwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxw", "yxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyx", "zywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzywzxwyxzy" };
        assertEquals(496, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case86() {
        String[] oldText = { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        String[] newText = { "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab" };
        assertEquals(249, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case87() {
        String[] oldText = { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        String[] newText = { "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab", "ababababababababababababababababababababababababab" };
        assertEquals(499, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case88() {
        String[] oldText = { "aaaaaaaaaaaaaaaa" };
        String[] newText = { "aaaaaaaaaaaaaaaa", "t", "aaaaaaaaaaaaaaaa" };
        assertEquals(1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case89() {
        String[] oldText = { "aaaaaa" };
        String[] newText = { "adsafgtdyutryrsaaaaaaaaaaareaaaaaaaaareaeeaaaaa" };
        assertEquals(1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case90() {
        String[] oldText = { "abcd" };
        String[] newText = { "abxcxcd" };
        assertEquals(1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case91() {
        String[] oldText = { "dsafsadfsdf,sadfsdafsadf,a,dfasdfdsf,sa" };
        String[] newText = { "sdafsdafasd,a,asdfasdfsadfsf,asdfsadfdf" };
        assertEquals(-1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case92() {
        String[] oldText = { "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa" };
        String[] newText = { "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbafaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa", "aaabbbaaaaaaaaaaabbaaabbbbbaaaaaaaaabbbbaaaaaaaaa" };
        assertEquals(3, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case93() {
        String[] oldText = { "abce", "f", "ij", "klm", "n", "op", "uvwx", "z" };
        String[] newText = { "ab", "cdefg", "hijklmnop", "q", "rs", "tuv", "wxyz" };
        assertEquals(4, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case94() {
        String[] oldText = { "hello goodby" };
        String[] newText = { "hello, how are you? goodby have a nice day" };
        assertEquals(2, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case95() {
        String[] oldText = { "abc" };
        String[] newText = { "aacbacbc" };
        assertEquals(1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case96() {
        String[] oldText = { "abcabcmabcgabclabc" };
        String[] newText = { "tabcabcmmabcggabcllabcabcabcmabcgabclabc" };
        assertEquals(1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case97() {
        String[] oldText = { "acdef" };
        String[] newText = { "abcdefcdef" };
        assertEquals(1, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case98() {
        String[] oldText = { "hello goodbye" };
        String[] newText = { "hello, goohow are you? goodbye have a nice day" };
        assertEquals(2, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case99() {
        String[] oldText = { "aaabcbcbzzzuvuv" };
        String[] newText = { "aaabbbdddbcbcbzyzyzyzzzuuuvvvuvuv" };
        assertEquals(3, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case100() {
        String[] oldText = { "findfindmeme" };
        String[] newText = { "fifififindmendmendmendfifififindmendmendmendmeme" };
        assertEquals(2, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case101() {
        String[] oldText = { "hello goodbye" };
        String[] newText = { "hello, how are you? goodbye have a nice day" };
        assertEquals(2, blockdistance.minDist(oldText, newText));
    }

    @Test
    public void case102() {
        String[] oldText = { "aaa" };
        String[] newText = { "abaaa" };
        assertEquals(1, blockdistance.minDist(oldText, newText));
    }

}
