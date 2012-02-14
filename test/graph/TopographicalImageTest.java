package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class TopographicalImageTest {
  TopographicalImage topographicalimage = new TopographicalImage();

  @Test
  public void case1() {
    String[] topoData = { "............", "....i..i....", "....i..i....", ".o..i..i..o.", ".o........o.", "..oooooooo..", "............" };
    assertArrayEquals(new int[] { 78, 3, 3 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case2() {
    String[] topoData = { "............", "....i..i....", "....i..i....", ".S..i..i..Y.", ".M........E.", "..ILEYSMIL..", "............" };
    assertArrayEquals(new int[] { 69, 3, 2, 5, 3, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case3() {
    String[] topoData = { "zzzzzzzzzzzzz", "z...........z", "z...c.b.c...z", "z....bab.b..z", "z...c.b.c...z", "z...........z", "zzzzzzzzzzzzz" };
    assertArrayEquals(new int[] { 81, 6, 2, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case4() {
    String[] topoData = { "!" };
    assertArrayEquals(new int[] { 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case5() {
    String[] topoData = { "AAAAAAABBBBCCCDEFGHHIIJIIHGFEDDCCCBBBBBBBBBBAAAAAA", "AAAAABBBBBCCDDEEFGHIJJJJIIHGFEDDCCCCCCCCCBBBBBAAAA", "AAAABBBBCCCDDEEFGHIIJJJJJIHGFEDDDDDDDDDCCCCBBBBAAA", "AAABBBBCCDDEEFFGHHIJJJJJJIHGFEEDDDDDEEDDDDCCBBBBAA", "AABBBCCDDEEFFGGHHIIJJJJJIHHGFEEEEEEEFFFEEDDCCBBBAA", "BBBBCCDDEFFGHHHIIIIJJJIIIHGFFEEEEFFGGGGGFEEDCCBBBA", "BBBCCDEEFGHIIIJJJJIIIIIHHGGFFEEFFGGHHHHHGGFEDCCBBB", "BBCCDEEGHIJJKKKKJJJIIHHGGFFEEEEFGGHIIJJIIHGFEDCCBB", "CCCDEEFHIJKLMMMLKKJIHHGGFFEEEEFFGHIJJKKJJIHGFEDCBB", "CDDEEFHIJLMNNNNMLKJIHGFFEEEDEEFFGIJKKLLLKJIHFEDCCB", "DDEFFGIJLMNOPPONMLJIHGFEEDDDDEFGHIJKLMMMLKJIGFEDCB", "EEFFGHIKMNOQQQPONLKIHFEEDDDDDEFGHIKLMMNMMLKIHGEDCC", "FFGGHIJLMOPQRRQPNMKIGFEDDCCDDEFGHIKLMNNNNMLJIGFEDC", "GHHHIJKLNOQRRRQPOMKIGFEDDCCDDEFGHIKLMNNNNMLKIHFEDC", "HIIIJJKLNOPQRRQPNLKIGFEDDCCDDEFGHJKLMNOONNMKJHGFDC", "IJJJJJKLMOPQQQPONLJHGFEDDDDDEEFGIJKLMNOONNMLJIGFED", "JJJJJKKLMNOOPPONMKJHGFEDDDDEEFGHIJKLMNNONNMLJIGFED", "JKKJJJKKLMMNNNNMLJIHFFEEEEEFGGHIJKLMMNNNNMMKJIGFED", "KKKJJJJJKKLLMLLKJIHGFFEEEFFGHIJKKLMMNNNNNMLKJHGFED", "JJJJIIIIIJJJKKJJIIHGFFFFFGHIJKLMMNNNNNNMMLKJIHGEDC", "JJJIIHHHHHHIIIIIHHGGGGGGHIJKLMNOOOOONNMMLKJIHGFEDC", "IIIHHGGGGGGGGHHHGGGGGGHIIJLMNOPQQQQPONMLKJIHGFEDDC", "HHHGGFFFFFFFFFGGGGGGHHIJKMNOQRSSSSRQPNMLKIHGFFEDCC", "GGGFFEEEEEEEEFFFGGGHIJKLMOPRSTUUUTSRPNMKJHGFFEDCCB", "FFFEEEEDDDDEEEEFGGHIJKLNOQRTUVWWWVTRPNLJIHFEEDCCBB", "EEEEDDDDDDDDEEEFGHIJKLNOQRTVWXYYXWUSPNLJHGFEDCCBBB", "DDDDDDDDDDDEEEFFGHIKLNOQRTVWXYZYYWURPMKIGFEDCCBBBB", "CDDDDDDEEEEEEFFGHIJKMOPRSUWXYZZZXWTROMJHGEDCCBBBBA", "CCDDDEEEFFFFFGGHHJKLNOQRTVWXYZZYXVTQNLIGFEDCBBBAAA", "CCDDEFFGGGGHHHHIIJKMNPQSTVWXYYYXVURPMKIGEDCBBBAAAA", "CDDEFGGHIIIIIIIJJKLMOPQSTUVWWXWVUSQNLJHFECCBBBAAAA", "CDEFGHIJKKKKKKKKKLMNOPQRSTUVVVUTSQOMJHGEDCBBBAAAAA", "CDEGHIKLMMMMMMLLLMMNOPQRSSTTTTSRQOMKIGFDCCBBAAAAAA", "DEFGIKLMNOOOONNMMMNNOPQQRRRRRRQPNMKIHFEDCBBBAAAAAA", "DEGHJLMOPQQQPPOONNNOOPPPQQQPPONMLKIHFEDCBBBAAAAAAA", "DEGIKMNPQRRRRQPOOOOOOOPPPOOONMLKJIHFEDCCBBAAAAAAAA", "DFGIKMOQRSSSRRQPOOOOOOOOONMMLKJIHGFEDCCBBBAAAAAAAA", "DFGIKMOQRSSSRRQPOOOOONNNMMLKJIIHGFEDCCBBBAAAAAAAAA", "DEGIJLNPQRRRRQPOONNNNNMMLLKJIHGFEEDCCBBBAAAAAAAAAA", "DEFHJKMOPQQQQPOONNMMMMLLKJIHGGFEDDCCBBBAAAAAAAAAAA", "CDFGIJLMNOOOONNMMLLLLLKKJIHGFEEDCCCBBBAAAAAAAAAAAA", "CDEFGIJKLMMMMMLLKKKKKJJIIHGFEDDCCBBBBAAAAAAAAAAAAA", "CCDEFGHIJKKKKKJJJIIIIIHHGGFEDDCCBBBBAAAAAAAAAAAAAA", "BCCDEFGHHIIIIIHHHHHHHGGGFFEDDCCBBBAAAAAAAAAAAAAAAA", "BBCCDEEFFGGGGGGFFFFFFFFEEDDCCCBBBAAAAAAAAAAAAAAAAA", "BBBCCDDEEEEEEEEEEEEEEEEDDDCCBBBBAAAAAAAAAAAAAAAAAA", "ABBBCCCCDDDDDDDDDDDDDDDCCCCBBBBAAAAAAAAAAAAAAAAAAA", "AABBBBBCCCCCCCCCCCCCCCCCCBBBBBAAAAAAAAAAAAAAAAAAAA", "AAABBBBBBBBBBBBBBBBBBBBBBBBBAAAAAAAAAAAAAAAAAAAAAA", "AAAAAABBBBBBBBBBBBBBBBBBBBAAAAAAAAAAAAAAAAAAAAAAAA" };
    assertArrayEquals(new int[] { 1918, 65, 483, 5, 5, 24 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case6() {
    String[] topoData = 	{"2>F4!wF1T!'r2hfA)00*O|!;?EjA!$n", "?{![sLJ/GaP{(aTDa@^!K;6H[kGw6Cm", "K7LtV!{Vc#v[+)~M=4GX0y{Xum't@3D", "0!lm#J^E1jD!ebXSMBp<;X{(R63FhCf", "Tsi*V[_C{]&+fhZ`l<n''FZN6p2G;<E", "Emw@!Gi`qhnBz7ga%`_Iq!}]vUI3w_O", "l}KrR6{g%s)X;1&j3B'qVt:#n?w|?P$", "-s%kt8.{?JkI5w{^Ai`ht|@&t1=;vUY", ".k]!zuv.,3h9DLfj4Mv7H)v|w-+ZBun", "%$]KqV|zoU~Is/xl]i>a4L(eT,NPju;", "#%4dDMJJs!jRk$b:*qF`U$c4`1j6TKj"};
    assertArrayEquals(new int[] { 25, 22, 44, 41, 7, 46, 8, 4, 13, 8, 25, 6, 8, 6, 3, 13, 6, 1, 3, 4, 7, 2, 7, 4, 2, 3, 2, 1, 9, 4, 1, 1, 2, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case7() {
    String[] topoData = 	{"Mw]0W2WG$oUqesVDU-J4m_*M$vsC$05yM08Ce95FWI", "E$ERjZI6}(f3m,,XHEuPV0*aZFQH{_gu7z;;d$Do]F", "TLc2W*e5!C-3RT+u7NVuDZFl}pU(Fw#<bkG^]}:QO_", "Pl5HC!^.ciYl!s=(2nry>t5HM,9Qrr(+B~}w7||V/p", "i|0F,_Q5PSvSw~3+r/{LSrx0ei7Jj_kT7uYF[@$1u|", "DUMK{pQ'Mz!7L]kk$!|{Z0;:pb@>nt{b$%?Zcv=1@g", "[}o((`6C)s!9@BkOv(TRVz%ulMz/2;H3P]Z?@g1F0,", "|EOfQf&SvVce[uPZbq~T49|ySxYTcvX+gt#B'^1c`z", "nqIW6Lyz<??VdP]HJOOqB50N;{KMc&La$.q/W!!Bun", "EvVVL!xKFE);&eWi*TN{]<Hi{Mm:ar__vlPQBG1Z$V", "TY~p,#|]W:0<zuJh9}S`~Wll{8(X^?XgO/%9Ws?W,w", "K`9n__hzgTCFRP_oj2}mU(NUxqR6-#J6|orPx7n`2c", "KLgv4!41l+)(L?8)75rb|^.lEHy3AggiCk}kwE&/->", "LK6P2{4*>4B)~7Y&Dq(+|?S<$3d<<+vxg@J%xtt1`[", "CT?ikG!6{`LT@p]x!7n!7k|@zTsLw#(^Zd{&4s^%!)", "%[i1Z|zWsjwCkz!+nZU3Jgi!9nD8r^IG=~D'-e.lLY", "/Fr1<I8`WJ)T(>botF~AhisG|PqVH}ic{AOSW+.q8!", "kRB#oWos_j6t6[!5$>ltaf!T^6TdwHEt4]z9Z4!.<H", "M|_kR9`m!B<7`n[i0n;*cb!58[8H}iAfb7(a|$OM/'", "FnFVDn8E]t4wYL{teD!Y&9|PnV]#ta|g<aT4O;7:!h"};
    assertArrayEquals(new int[] { 48, 54, 25, 48, 10, 38, 38, 28, 7, 32, 13, 19, 16, 14, 23, 2, 13, 10, 28, 15, 17, 17, 12, 1, 25, 10, 13, 18, 2, 2, 17, 7, 3, 23, 1, 4, 12, 2, 8, 1, 19, 5, 7, 1, 2, 1, 2, 2, 4, 19, 2, 1, 2, 3, 3, 1, 1, 1, 2, 5, 1, 6, 3, 1, 4, 1, 4, 2, 1, 3, 3, 1, 1, 5, 1, 1, 1, 1, 1, 10, 1, 1, 2, 1, 1, 1, 2, 7, 1, 1, 1, 1, 1, 1, 2, 1, 1, 3, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case8() {
    String[] topoData = {":GJwPX1?,)@slsa>D}{/$tXgYqo_$l#H8", "2Ro>{mu!vN@Mv),lLAy9C}QAIhN.>C/NQ", "=c-/fJ;ZxQt<J63D%%y;+Zq5&L#*7Ly$}", "|v@3:p9G^5R?1?^A)hI{s>;[KrT(EZ;xJ", "E:+:.IiQ/Kx.?!}b$1^-JOH!2=G3NEHcB", "Jpc7}Er*.`-!Z!(G&;AeSs242&e13y!@j", "Jp[O!6@=9Fh`m*Og%Yi!Fd]5wLIBW?TOR", "DgTmNYqG*`:S]YM_R-KxjV57Y~SyAJ!w^", "!#ug~<rwKUtSl?K;toAxY0&,'`fHw?#-i", "ARE4*oM$=[J~6rR,:z=tNX^nPratOxI:K", "Zsf<-!Fy~w*^t=ophF&N:%TNaR1-l4Uj$", "yO_=Z?U3w{l1En9.wA043;!prYtTe8JC}", "g|PB<3do%e[hU2cF/H0u#3}AX:(9vhtq`", "C)G4lZoriZCD*[P&tF):/Y|(GS/jO7:yF", "/N]$hA^i=pwP=+.17'ZbMgUUf*;,NWgz*", "LkF>QRDbg#Sm:q{KcAo<OBU$;`K!YX!Zk", "3T}e]}.~YSWq2$?N@Y4Mk!pOWy-atleCZ", "_qTi>gj{7%pKHw!857%)7buaDAmV|CH#K", "y(8&X;+Z[SIy`R^FsxiCLVK1Z']~_QZE/", "T!>e/?fUJE6Xj+6!~`=tTz*T!CMl;1v/M", "a=[s[w3'6;Ut+q%{TR+Fv<AO!*@PS,w:N", "dq`mHnvBTXRG(('W7N#V'h9'AroQERd=f", "~wa#gyaWAw!j^giu~q-~#HCLAp`M,xQ!g", "D7;Gi0cko+A]K!rAyYj*_krZLx.9n4N5%", "T$PZT;l,If,q-&=A2t]!hO~'l'*=YL}sP", "(us!B}7IIuc3W<!p]bs<Qx}GFP=o?<v.;", ":d8LK]|7n'XT>s^0Ld=PO~6jw#z(3wf}q", "B7vrFT@bfHrXTY&Ot+D'Uw%|5yLYSa(g|", "~*]bmY}Dy2,K}d_@@Xxq5X!Ss?>6!@yp~", "=~J/=K]IU4/{t=WQR?b}n/t2Z(!)OA(5^", "?uQ30z2}]dFHA&?f@F3')!rEsK$.|]oz#", "T;aO>>Pe|_/>@Dc1'1}7aFejZ!Hj,-JC]", "_.[S!.GDV6+jEz[;[P4!2`!R2mGk4o@Uf", "`3nc$fB.Y)x.q9!1j6mrhS,sJAEDtY5,B", "AqkOZoH/aBaN,!}XYTJ*s/orFI~2g)m@t", "!n4x{P.2E.0t2DN0>hI'P%f71gdjIl@`O", "X(&#j;azBsVIl@d{|&~{b[n''yVMDnnj["};
    assertArrayEquals(new int[] { 41, 39, 65, 34, 24, 78, 36, 20, 42, 10, 20, 9, 30, 22, 28, 33, 29, 16, 21, 10, 9, 15, 42, 19, 1, 4, 29, 1, 6, 38, 8, 16, 4, 2, 13, 11, 15, 7, 3, 11, 4, 7, 18, 12, 8, 10, 6, 1, 7, 12, 5, 6, 5, 5, 3, 1, 11, 9, 2, 1, 1, 16, 3, 16, 1, 3, 5, 2, 4, 3, 4, 3, 2, 2, 3, 5, 1, 7, 2, 7, 1, 5, 1, 7, 3, 2, 1, 1, 1, 1, 1, 10, 3, 4, 4, 1, 3, 3, 1, 4, 4, 1, 5, 2, 1, 1, 1, 1, 1, 6, 1, 1, 1, 7, 1, 3, 1, 5, 2, 1, 4, 3, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 2, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case9() {
    String[] topoData = 	{"?#67^He*B:aB!Q<Zv'U#'!xEb8!g#8e8[m?;.yV!j$NT6", "l!PwRep>N7j)aV_>e4(q;kh;OoHT0cTWL7_n|B@;83Wxr", "<K;_ZE_E{OuS5J(1lJBi=9Z!HPp!]-Lvhq7kIa-U%iB@A", "oh{qWyY:I8d.c4hW#f;SWj4B9y&-G0*{6Gz-swuT~(p6j"};
    assertArrayEquals(new int[] { 20, 15, 12, 17, 17, 2, 3, 19, 10, 3, 2, 3, 14, 11, 5, 3, 1, 1, 2, 2, 3, 1, 1, 1, 2, 1, 4, 1, 3, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case10() {
    String[] topoData = 	{"?ug@r9@R*xKH[_fW6k~]F;A71=E>9d!@`|[.bOhwhRq", "|SnYbS(~eY(<^+d(VoFv}|g^2gF%`Pf&4.V#3&k^IR&", "QR:4P!Ufpn*a&%J0?p!bGc!b5}Q6(LAg[gwO13?>.r'", "Jk>Y1M@}Da2(EqJOJT*-F$1&jJW,?ftTI?uZo;pczyD", "8c7tPl!ywLEKD3&>isic/0/ky[Clb$UapDr!UT[|yA[", "7!tXk}Q,oSB{&N<<f_SYn;YI|@lb,4I[6x%:nl}Kg||", ">_Hj`L<E?t=tHD+:2-uIkC{9U79r[*M2d$l!6FRC]1b", "5nRts|s6]gFXomrG+-zJ.H:s=x;eTd7e?^G|QMZB)5=", "V]jK!2,YYi1)6ZG5Q}fo)j=g^`kM[`..{sJ$<CbL}5p", "H>d8TZP(.?!{#pa9uc~!Y$Qa-w!Q0bg!>4&(!lA(;?3", "N({NV+Xa!mQ3C9-o#ZBFE#/aI[SkmOlz6E]>Lc5c.d3", "M{>qvM$2bH;98PPeP4W;xK0~!xq@u$b|_pQ:CCD6<^!", "Rqmkfc2%R&t$!{{NE<j$bz**Obf5%3C!EsxTLj)Vp)!", "P=jnGy1!KjaM[`q!7t@9Rz$Rb/N@Y`6hhEs^9fME/aA", "f@R.-5s<Y&DP9<Uw%*aK<BMqLU!K}/~i9=D`m,`c!_i", "xw7ms&8%0+?'z`Vi,B:V'GjWgVG/?J.'(wb+eS__;]z", "*O8zk~oaa?zN[IPn7Q@p|lf`wqE/~XJ>e(B/N9{FPP&", "_E!P890Ng]{%Bm=`_4h:k=AB3GRZGNEIto#SRfwZxkR", "T|A;j%Nkgod4)U$9XpqDj-%3GLR>cTwbnI`/pZO=*Rz"};
    assertArrayEquals(new int[] { 25, 35, 65, 21, 37, 39, 18, 12, 19, 15, 14, 61, 5, 1, 10, 15, 8, 4, 11, 12, 21, 29, 6, 16, 4, 17, 5, 28, 11, 23, 11, 6, 9, 8, 1, 4, 3, 1, 5, 5, 12, 16, 3, 1, 6, 4, 1, 2, 4, 4, 3, 1, 2, 11, 6, 3, 2, 6, 3, 6, 12, 2, 3, 1, 1, 1, 1, 4, 1, 1, 1, 8, 1, 1, 2, 1, 1, 1, 2, 4, 4, 2, 5, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case11() {
    String[] topoData = 	{"uO39@", "Ak4uB", "n>kq&", "A%K|S", "CH*9N", "M,9[Z", "~tG*v", "b{jqH", "=~)#(", "wm[GT", "9?)b2", "r);6y", "%}6C+", "1XX=R", "fp+y*", "h!cc=", "2xuKN", "!t(T!", "U6hE%", "[XO}u", "!xm?}", "O}h^V", "f=kHE", "cSZZk", "!6x6l", "Wl+sw", "5/W(}", "7J3C}", "4P8F8", "&aX++", "o%Q_/", "/Z%*B", "Dq]VY", "w%[wt", "q|4Gz", "@NC+I", ")oeUI", "cVyiV", "|#K,_", "!1HD-", "Sx'`8", "!`5lA", "8{:Uo", "C;S%B", "$zE]/", "sw<(F", "kCHQ6"};
    assertArrayEquals(new int[] { 22, 16, 10, 26, 15, 22, 13, 22, 13, 15, 6, 6, 3, 4, 7, 6, 3, 1, 5, 1, 1, 1, 4, 7, 1, 1, 3, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case12() {
    String[] topoData = {"Nd_B!o_U#YLm5cLkDK!EQ.I", "U4_JpS{/e!rDwjAR4n>pzAx", "!:S?.e{L0N]hJ!6-1D!gf!y", "t+Cei4?-qBk8$!R;2jtO@)W", "(ugLH4^~u`xD~[Ejm+=w$-<", ".)uz-$+-bPhKkn8LA&;4z=[", "osu$>//X9'7F!TAQCSv$~oZ", "|cNbY`8V,N,#RI4!n-vSK'd", "@tPc,07gosX]{GK/'rvFZvJ", "0%brz?uuVwyC-<mAdCtr0V#", "/FQ9aOI`#,1pY6}N})MI-!r", "aeZD!7_m|Uq]{0?9Bw?SCE!", "IK/^Me`%VX2=!>ibS7@&4*2", "6(ji$RMtyH,4]czB>)Z&w!o", "Ow|6ky|T,~@|z)7NwS7an]2", ".FI8,W9[.;cy8Tz{+H*UJV?", ";]Djg8{mavg;!.yx5VE9q1c", "1!bxJ$5]c(qRe.hS!Qjy-Dl", "Pgk(<5IS!s1/*y@L9d(>d[*", "myOC'RMjGg{_*?WQNwjX!m[", "JAf4'rQ@''3bTN<,`Y`IeSX", "&3~S}BwvDv:Q^=yFq<VD)){", ",@zt0MrkV#2/!39$'=!FCnX", "]XL|sF(sJe!#`bR4!K(4LGJ", ":Id:~PB'*;AgL6r!/t,`oI.", "'LKi?'0j8R48DR6Fy+8=A52", "!}qVLu_[l]_F[&]#qQ7iV^6", ";^2(;oES)D5R>z@m/?uKq!h", "X!SjK2H0UGX%9WMocqnbXuy", "/=1]fe>HI)xZVNP!cvBhu!<", "XmVNMxwPn`?Mk--BY$lYgg6"};
    assertArrayEquals(new int[] { 39, 35, 40, 51, 34, 13, 12, 18, 9, 9, 17, 4, 19, 5, 13, 8, 5, 4, 24, 7, 28, 26, 4, 21, 4, 3, 32, 4, 5, 22, 4, 8, 2, 14, 21, 8, 4, 13, 10, 7, 5, 6, 10, 15, 1, 1, 1, 4, 2, 5, 1, 1, 2, 3, 4, 1, 1, 1, 1, 2, 1, 3, 1, 2, 2, 2, 2, 5, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 5, 1, 1, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case13() {
    String[] topoData = 	{"%w8!$;4msS'4afMtS!*AOFZ{_.|b!g0uNkw}4(]]voQ", "W?}0:6]!c@6jT/{;6JHIR'a^aW6Ge0!u!%x5Ch]Gy_S", "!+j]bTh`.S*e|n.0:ULE_*jD`tY5}J):2Xg(J4t]Az#", "[.;O$=zvf%6m{4hkfU@tDFeM8[C,+@Aj$BNpZH^+$D?", "}?hi0GalM$i>G6!U_[0z7'zrxz*j9&YVSR%0rQbBlZ$", "k#,sox@rRmy5O8-).!D.Ga!7>AS6S/xq?*:1a<8xJ~?", "V2mfCN}#l<qzT|!>bje}_92io[;eV'%WfaziKRCB7}X", "LAS43VD'M6s,z^th2i.-eP`89lWHeE~=W+Fe1Xs=H1V", "c)r6us37CJ!-9(E*K#&q+-Qs-=.vP&CMwRWeda=h!GX", "C!][p]/r@wmcSf#}k@P./]lu@7*JqDPW^`aV}}LCvP%", "b^JF2e{a=o4MN'[8`i>Z|t?rF~1_0&nW!P:2-/?^V$i", "/0W['JF'WPRDq*!sHI)Dg+E/@r3&)/fh[,4x1H*z?UC", "x1SNAy`%i=H!tTg~-eEeE|FQTq#S[R!jm}ILs4{'C9("};
    assertArrayEquals(new int[] { 27, 16, 26, 23, 20, 22, 23, 12, 53, 16, 9, 41, 8, 2, 25, 17, 10, 1, 16, 16, 17, 13, 12, 3, 8, 6, 5, 7, 2, 7, 3, 3, 4, 1, 8, 11, 2, 2, 6, 4, 1, 3, 2, 4, 2, 1, 3, 2, 1, 4, 1, 6, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 5, 1, 2, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case14() {
    String[] topoData = {"RP_C#gx|2:{:${r|%", "LL4AXJ{1[DPH,9,7x", "`8ZB.rYWY.Vwz;E!^"};
    assertArrayEquals(new int[] { 22, 11, 4, 1, 4, 4, 2, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case15() {
    String[] topoData = {"pn_/c_</[4(;]kfFxbQ", "L-J7kaHiMk:cvZncy3@", "w(*Jg)r?Y62BDi!)G@.", "7G3i-)$gjfwwrGv!i=@", "Nte.~Us&a![x7P@<wx^", "byT]fkgPVWKVF1^PR57", ";iDHRAQllJm}b%w>r=g", "cg5E|4j_/Kp:MhDq]PP", "3n6Zg$#&P_*=JDJd%h<", "?MhQmEIC5|?Cv7qj]F~", "A5Jz+kGK%Z=[#y0&xIS", "T`=T|x/-A[X/z6-#O)a", "!G|XPc%5*Ef+[D>A,1N", "o3U!M!!($P`iE]qW9xt", "S0nv,@<rT7Yab+E0-k;", "p`[81(s?::nB(3&y|iY", "L?GN_,!y,VDDJuM_9`F", "9y>/*.pKpEQhUFn08!v", "-d8bXBwR8yTY|Y,|Bql", "(Sy1hF1Pk5{%I6OL--%", "l)j&nrC>qWo5IBNJ0Ng", "am4O`Qy43>z#;yx8Q=&", "oQ.!}!jEq>uMqXSRz/i", "pHwe`CeU*cW&r2(N%>N", "G[l[hLteAXV58$^<J'H", "EV,lIm`N!L/h')~x%(B", "F%o;k=X4-;$?-y#mV91", "]:fJ!R;+Cs:`1cC.nrN", "FOw^D(*xuq-8Un_vAu!", "lL+R!'8`!fXb#UN<wFm", "G7Y8V#{4OQ7K!upXn69", "qEFn&AU[3kbAhfTnE30", ">/XS#-Rt3SvqN6X^znX", "xaL-Kqpn`FN4(;V[yQ*", "UAfDK%z+)0we_4R.2nu", "JS69lG<uP-Q@bQP|H7Q", "flo?a-#9Oo<dO'ct9:3", "[tuB$_N-G,8I/K#zvZ%", "[nrx0c.$><U=ReQc'h?", "+U&v!FZ+]t?^0^(57.)"};
    assertArrayEquals(new int[] { 44, 18, 38, 38, 37, 9, 14, 31, 3, 26, 36, 2, 32, 13, 15, 13, 15, 5, 24, 33, 13, 16, 8, 9, 13, 5, 14, 5, 22, 6, 3, 3, 11, 16, 18, 2, 4, 1, 14, 8, 7, 5, 6, 1, 6, 3, 7, 1, 2, 1, 2, 1, 4, 2, 3, 1, 2, 3, 1, 1, 1, 3, 1, 5, 1, 1, 1, 1, 1, 4, 1, 3, 4, 1, 5, 2, 1, 1, 4, 4, 2, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case16() {
    String[] topoData = 	{"<[>h", "hKlQ", ">mjb", "CcJA", "pN%!", "|q%.", "I-%t", "ml.:", "))h,", "^;%|", "5+/1", "WW${", "1yOb", "f!0P", "33lw", "Yn=B", "M!`-"};
    assertArrayEquals(new int[] { 15, 14, 6, 7, 6, 2, 4, 11, 2, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case17() {
    String[] topoData = {"nq}.hj|BMnn"};
    assertArrayEquals(new int[] { 4, 4, 3 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case18() {
    String[] topoData = {"%ZAi<*YfxVnSbtYOxkkV-2q=?Vw", "<'2IVin8m6e;#[nN4!Vo2j>[;Sb", "7T2-g6&t;k7fx!P$%3NTg5TP_,)", "(i)o82W/J/^eZH]@!P~W>qmN^S|", "SU$M)h04!8%F2:#d5'HZ5%9;^L+", "w3>j]J_wl2.z}>1E_Mvu2!h>gI>", "V88V1y7TCS}<r[6'Pp`4yo?9aDI", "uK%9>lna8:f5oy'[]x;<s6@E!n^", "~&wIiBRp!&0TtZOe%D7Yh2l8Y>>", "r7WGJ0nBq#t[2Tv~Oi_#36mf0TV", "H$%G]'zIA!F`o,f+',AH_~#,$aX", "pFvm^/y3<Jqj6Fs$2^d:hTB4NHF", "EuM$Ip7brj.OqVk60FwTBpsZ!V7", "f@is<324?e[4F)HUe2wXD|/!dL!", "[YZ,ob)jmiVKG%$tPl8g-|q-f)e", "LfXOc_boMMwgqc`h]I_Sb2[vEe.", "^/%GJG'5IADEqU,>&f'Ci4OT?!0", "G+HLu;#!3:<m!HC79A0fr4Prb4X", "_?}Kt~!6z<Vqn0qw`r*Fv=a7{A5", "F1VJ)6:o?BqN'(EftxFz/vcM#)S", "H0`XnHneH4oe)vQAP[?EE!'6*ld", "Xk@S!4=tVG!1=vs3w&H+KfF=g|~", "/&VUn2Hw(&*b%fm[I|`j%J$!AGI", "h7C]xF2]`@2L8loT._K.!W?3Nfc", "bS@[DiX{g!7^tqlci$!Tt{`cz!8", "Ax=ekPIci5{mn}!ODF%/k>,.^QE", "?5}17gT%hzhRDv)a3v;L[/Pc416", "Sz}VP2`WbmP^8]s4+?;JeqNtKIM", "up%.[Y5e.5RG5^XcD4}D(]Y:;`W", ":}Y)MY4}|RwI(=AEOPhkJ;P0*?p", "30fbR+'s'U}%7O^:Nh(]5dz^D;,", "?Z/iP1Tj3.}F]_uhUd(hmI*zpC}", "1Zm(z7o8sh]$7t<6C[dljEQhd~]", "Ik.a7is7BU%qs1*c])I<'d!cgn[", "g~:IJ:#'$='&?@`VzIAv_'E0:$a", "z'@k,@X+Q!8%2Y^!3H4MTnAG.(S", "PND>j([nlgRvH!?Vm,`>3p=OS!=", "ty?ql,F93GF8ASB|L!x+WaF-)s5", "?p5|Y1Q4OB*?]8P3dy!mE:1N3vl", "CcMb}vhX&'F!h+=.9xA-=p:AWHb", "O-VPgy9J'p?5;wDoE^6)i!;^RNs", "W!932!l0={rwS[WbC!0KztROT$:", ",W`+@pS:5&&D'[Mr5#pC-VeVC(f", "QZHI,GQoZIHG&{K!Vj,SxOjbj:w", "LflP#3!U6|o_<9+j'/UIpQ=rH!0", "sAT7h1Pd@{>ey^t8s!a_4y=|jCr", "&uMfks3hHhr6N6PIT3-]!:~(gzY"};
    assertArrayEquals(new int[] { 23, 18, 32, 39, 26, 27, 46, 25, 60, 19, 8, 2, 79, 31, 30, 11, 26, 17, 60, 10, 33, 18, 15, 27, 5, 17, 15, 3, 6, 9, 34, 14, 7, 13, 3, 6, 13, 7, 3, 23, 9, 4, 7, 16, 5, 20, 8, 9, 3, 14, 8, 1, 7, 4, 2, 2, 21, 19, 4, 2, 4, 1, 2, 1, 13, 7, 3, 2, 3, 2, 10, 9, 17, 3, 13, 2, 4, 7, 3, 3, 6, 1, 2, 1, 3, 4, 3, 2, 8, 2, 2, 2, 1, 6, 5, 3, 4, 3, 1, 1, 2, 1, 1, 1, 3, 1, 1, 1, 3, 2, 7, 5, 1, 1, 5, 2, 1, 1, 2, 1, 4, 2, 1, 1, 1, 2, 3, 3, 1, 1, 2, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case19() {
    String[] topoData = {"(]@_XgpjUW1zex@UA;y;f0!uOALW8*1+VW0NH!&y", "UIG%sOR|<7}9@*??d@^:a[;A$W9'-Cp]I.3RVz:C", "pG$m/R19*V^6x!trGB$*UjbP!8X;,6SEsZ%iS6Q$", "1)O:!%{A}!*KtQ-#THG0^fa3C!@|$HU`]KJk'N`X", "8Qj:(J7pt!+&PWiz~0*4K]f?(+TNn!`0Qm%A:~X'", "=P&FW8>T{uE!Y8!EpD$lo02P-vB+oxc;F=RsP=D8", "D+A{PPoyl-u%ko1%ejwFm!`4jfJh!V[0YDh:-ygs", "]o!(-iY.JzdC!&U|N~:3w6@$)v2X`HkRVQ-63%w'", "5wox^nWsrwL2YDmLrZlyIG]QgC!+m;L^a_'Lg@^>", "s'd0x(kwcRQVTi5L>{!W.{/_lN!uAtB*93q#Q8Jh", "Lb76p6rIK'i+=^w[kIG='yqA!J3#O5):OJ[==9Ry", "C9rOY,gMon/N$E(;LQhUO5!+!vRG&@`md)SPK]LZ", "#{.1Y.'Eb0YW8f<rI!Y624k)p#FWk^t+!u6gzmSC", "!dOV/Pna^ysFPd<L+}2Lo@[Gt9?K.J,I:?4%Ekv#", "pGsDH#/48ov9??{wpy~NzXl7&m-qq'c8wqlxuJ@c", "..<WrhZ_2FdAWtiu2MmOVHrUB7@]Z=0+Xy*k&dwb", ")bV~si2v_!9b!DwBuSO{-9-WaYMR>'*fxxF00g@M", ",ubbI:(pv8s)[L+l~e{idF$;HVywhIPx=omx:;ju", "%#w!i!I'QzHD51G#7;WW=HJnpOh<a!jNfeu(7;+0", "58s^;flDA{v'~R>ZLxN_aU&>dIc!zN5^g<SI0Rh!", "c82]ORjad@U^sI:&Z%2:P>fzzw35id7IPg:(6!j#"};
    assertArrayEquals(new int[] { 52, 29, 30, 33, 36, 28, 11, 17, 9, 11, 29, 20, 2, 28, 2, 3, 11, 17, 10, 12, 21, 10, 7, 35, 4, 20, 15, 4, 1, 5, 3, 3, 15, 41, 14, 2, 2, 43, 20, 9, 2, 4, 2, 4, 1, 5, 1, 11, 6, 6, 9, 1, 1, 5, 3, 3, 5, 1, 6, 2, 7, 3, 4, 1, 1, 5, 5, 5, 1, 4, 1, 2, 2, 3, 3, 1, 1, 1, 4, 2, 2, 1, 2, 11, 3, 4, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case20() {
    String[] topoData = 	{"53WKPK9ucE=L!2v[E[zNAZgvk[y|6~dEi?0N", "#V533S/-caWjva!$Xr?RSu~CO~2RltHIZ!it", "Q8<}1%B]eU^aI36!d@/2{)?)+0~5ilF'Xb5y", ".3VQ{FCH=rp.+ZysYWe.z-'hw^m;q23;p)#9", "s'2+Jv9fDJ&=26CRNWCw#E%%xPX6j,^WC:!D", "YN3//rf:Ty&$kRRFoGE0O78@7'9O=il4y{wC", "u#wjbk8U_|8H!jN)u<_'GxM:}sj*E2%ML~w0", "6gp)'Pa!`u]=|4u#r/]bYd&Bx%|6znqEa_q/", "0z!O(LR!b(-oE(-/]fd%7!MZ^/_KZYpBq5lh", "F2J1#.o(Q^h[zVh5;cS@:y2'f@B:5un5OerB", "ChI!(BMrLJOi;)Ow|sF%v1j6a@2`7?A)UEXi", "$GXsb0'r|M+/^ivdust!u59j,8<r[jsR'o#P", "Jz:(w.?UJ/M=C0YG2>QFXw!#7LI!_ztLoMJ<", "+r2q8<9zS{]guHym2[[~}>+c|jf6@!wCn!X[", "E(:q&pqx/)E$7w!]M>I|M%UA?}GH[8:!2A:x", "RHMRi3_n=!~-mB8XvK`m=w!YqXe1<Evhdb{v", "bLc2rX2T!<P4mJd(bO.WAMBA!^dd=S<m8e;/", "@FJ+IO{;==}B4<*'r|-!?L5fiF.;i5!>WwOV", "/Y[yFo1_GHARN{99,;hF^V]a.EtJlhjj*FVq", "28wgil!fm!~2&S-#d3-;{+?&0R?_OUk=O>.G", "8RV7s<DUTWkr';Ey-_F^C6J02G<fd]uQ=zr%", "w%5X`dnS@B]wSC8H>al7p?.!SF{gqMe;)`eu", "oONz%y{]-b'O-?7L<dZBJN.6qO9n7{`^!Vw&", "wz!!COSGQKd[,`xi[,;77h.'8DxGN92+,eH|", "H!k4O4'2!5cLwr.HxlUh]g0UF_p9,7HKFD:(", "c!c7H1~~ENq%|qF=Oi|#[@%|(4&VGuAzC5$R", "NmGC.z8SIb~MhV^3<JxQUg}*J|SA<q&G>S7K", "^MWgpCsw%IDpq!^#::UGVrb!+$?U&!j2]-rg", "I_}oAmiNUie^Up|~Gw!R/~qSqr}hm+>T!P*F", "tFj1)5j5i*JHG;9L#&xZBesEvKmna!QHE7B<", "GQq^BtA(BkzY[,uYFjRjV!Kj4!AGB//`rFe;", "!$j^u_ZyZ(;m,r&A.{adq.Q&|dN_dH!EkhF5", "PdoQU0?wHE47hq!scJ8,vWl~/.D',Yk^Os8z", "*om&Co]!ar(~W(K9Hq59tdTtxELw7o*OFZ3e", ".!Htz!]/VzFb[0>EVT'?!{VZQY1?l:jFD*|&", "{_mMad^B7E'JE#;%Nc2=9fTj2P@ucsX4!;)Z", "loP[K%@!q]5}v;!;Db372A:<BDD}QC^@|$fw", "!VC#wj`MjFI=x!hHtn%JZ2X4kTYytqQ/'B/9", "2;j)bOH:&05RPZlZnP,wHq<Hkxx.'8a4%Dj?", "$Dwo8s7?LC~yL:!.sn9N{,m%JdHz-z'vOvW{", "k!Gt2clq^9p,:}n%-m.j5s]iX;p15]^cc,u!", "P{kOpZBZ$R<;~W4!Gd_MtlObTtrJW=XRZJ[1", ":ArhxzgW?[/7)ZEV4-}$8^<I^O!6$HX86m:?", "@om)Mp`5@G%:{@'F$5HD</=ypslB2(!YTS!:", "1XKw>>8,88bICJhqd7{uONmsm;Td_!R.5XwI", "5XNKpHR?[Rob'!*_=p#6F.z5#:'2lX&YV4}s"};
    assertArrayEquals(new int[] { 27, 21, 17, 55, 44, 23, 35, 63, 36, 12, 40, 51, 28, 29, 13, 60, 22, 40, 1, 11, 1, 17, 4, 58, 18, 21, 1, 24, 31, 5, 30, 18, 12, 35, 5, 21, 1, 10, 3, 10, 2, 19, 29, 2, 12, 23, 16, 7, 13, 6, 23, 20, 11, 27, 8, 12, 10, 4, 20, 2, 7, 7, 11, 1, 1, 7, 5, 13, 8, 14, 4, 8, 9, 16, 10, 9, 6, 5, 10, 2, 3, 3, 1, 3, 4, 2, 5, 1, 5, 2, 5, 2, 3, 1, 1, 1, 1, 2, 9, 4, 3, 5, 9, 1, 5, 1, 2, 5, 1, 6, 2, 8, 1, 3, 5, 7, 5, 3, 1, 2, 1, 11, 1, 2, 1, 1, 1, 6, 2, 2, 1, 9, 4, 2, 2, 1, 7, 1, 4, 1, 1, 1, 2, 1, 2, 3, 3, 3, 2, 1, 4, 3, 2, 4, 5, 2, 2, 1, 1, 2, 4, 2, 1, 1, 1, 1, 4, 1, 2, 1, 1, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 5, 1, 3, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case21() {
    String[] topoData = {"K4^!h}m:@i|%P7uMvGUk", "|Dj|3e@foDnR%yAlHUf+", "*d`tHQ%wpf9n!8:o?*1X", "mYFO=5RYQ%f$i$?Uw0R~", "S=d>aYJ(+xF(-[J$#U!k", "nE-%H!wggC!/Yet/JOXz", "Sp!,8g<bf}!Tq[6e4^r!", "27.Y{!7H_B}EKu#(D6bJ", "$Wn/|VwH;}c{HYJ!p~k[", "R96{3pm=J]1T`8UmZ%2'", "-y(}pNotj'6i1!O-G<}6", "Y,!d)7!b/6(`D1GWi^(+", "O_Cj/<yek/kjys!!!D|!", ">SwjQ2)r.!V58UDi3{uG"};
    assertArrayEquals(new int[] { 21, 30, 15, 50, 35, 6, 22, 15, 4, 4, 4, 2, 8, 4, 7, 10, 1, 5, 3, 2, 1, 6, 3, 5, 2, 2, 3, 1, 2, 1, 1, 2, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case22() {
    String[] topoData = 	{"M8*C,V?p4i(M]=y5)L/:7cEM]k}H0DcS7%h~!", "!J83xyV|!:V#PU5T3rQyo?h@o<ak(+A$i{9eR", ";~rEMDc&)^ei1,m&OG-z`=Qvk}A@&{*&P}Gzf", "q%bz~n5O6$lPTK;Tm)-uLcsK+Gc]!J=Ml|p,U", "y$m8mON$=Kg0sb_aP:nwc>)r+B74?4`[MfW|S", "Ibdn)nHTQx}mKDg82c0h;7$gUoLpN|O5P~#@`", ")AfiPDm>@Q!g|L!K<|cvzMYkQj#t,m3ICT!9j", "!H-NSuz.,q(Zoz-e7,}>he!<0c)@%g!TL5Jok", "<rr<1O*,rH_9oh'F=][C{`>o8|^U/8;&]`PkX", ",lBg}Yx7E;5MUYj45>W~)S&N@bv=V[v{&Pd'e", ".`=!uR<x|5~l]9^dEA(f|.bfpDH?AN.]hR%&-", "=P:DJj1P=!_TJoX3&^o1Z_8x.Li|dX5#c@B*G"};
    assertArrayEquals(new int[] { 9, 17, 36, 27, 40, 17, 19, 13, 12, 18, 22, 18, 3, 4, 11, 7, 16, 6, 10, 1, 18, 14, 2, 1, 7, 10, 3, 1, 5, 1, 6, 3, 7, 1, 10, 4, 2, 9, 1, 4, 3, 3, 1, 1, 2, 6, 1, 3, 1, 2, 1, 2, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case23() {
    String[] topoData = 	{"MO{", "O~$", "(fa", "&wE", "T#_", "ExA", "c'd", "%R!", "%v!", "6@5", "4jA", ":JF", "Q6)", "gG)", "I;g", "1vW", "Ost", "B?o", "X(8", "VAk", "6!K", "-D%", "(q)", "F[3", "~:W", "RaR", "G:h", "M^:", "[C+", "g#0"};
    assertArrayEquals(new int[] { 12, 18, 13, 1, 5, 18, 4, 3, 5, 6, 2, 1, 2 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case24() {
    String[] topoData = 	{"Io/S*J%ZPze6:T,G!?ZzlM", "Wa~auIV]i}5x@0ag!`rSnY", "xwJ&3k<=|w$ck%a)p4mBV}", "CS=QG7YzR]Gg#04_rLK^x1", "{|TS14'E*q^p!3fU92ay:v", "It!]j5c1!ZO40Oj-|3CV7U", "l~^uS*1b0$tAewenA/=f>D", "A_wnF?#8eLO}||GJb{.aJv", ",!qL>G(MVG2h`vpEB*,D94", "^mU![;&2=]!?w=)pXq5&]s", "_gUz'LHr4IC5b~U.)*fl&F", "a>I}!5A1(Jh!bV1L_3G}Ft", "/2w]6<r!~g+3gX,F,FTup^", "t'bOzLBv74J?ZNJ3'>~,q0", "-!v}zRd@,@gOXZ.!#B)90>", "@x;3Z3C/NB9d,:8O]:aC<J", "*&67S}{2$@7E(ktry8wSmk", "S.BqfLy_O}!lF^}c}%!gd0", "SK5)NmkDgP.,lxV*{CKF`~", "=Sqip&g]&}WgYLTO,4V1S7", "(8?:w8T+--j39Yf!hSOY,y", "jL!_oy.yh51W6j_BPH!uGY", "xBOro>Yvp(QmvL:GqHNBw]", "RL)-@-Af/<8x_^@uX!!]lX", "@JID/i!8RmG8m#eJ:k-7TB", "@{:vyhG49qYE1MbrJ;#x/`", ")GP=U=#Nf5?RSND+~'yM~E", "gdh.'HQNTa6Zy:fw@af6N!", "+{!!O.h|w&b@n3<nX.LE/-", "Df#TJqme)3Jcc:kP1F!U;z", "y+m3xgOcwyp`I'tY.g^>.C", "se5d!DPt:xij:#XD>QkTu!", "*DY-mk!EmfMxwR^p(C;u<{", "/-)h:R7n*'.$Q:VJR_bG3=", "w~K.IUo)!UfbM],)moa)gx", "0b'dC)QTxW;@n?r;KM(!Ns", "v:}A9b)B8~Q_T`|M'm6C(%"};
    assertArrayEquals(new int[] { 16, 57, 64, 30, 24, 11, 75, 10, 12, 16, 24, 21, 21, 10, 8, 14, 18, 5, 29, 5, 9, 9, 2, 3, 40, 11, 2, 18, 8, 26, 7, 1, 4, 5, 19, 6, 5, 2, 13, 6, 10, 9, 1, 3, 3, 11, 5, 2, 7, 4, 14, 2, 1, 2, 3, 1, 1, 1, 1, 7, 1, 1, 1, 1, 2, 6, 4, 1, 2, 4, 2, 3, 3, 1, 3, 1, 1, 1, 1, 5, 3, 2, 1, 5, 1, 1, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case25() {
    String[] topoData = {"`R-a!W!NPIOj$8Yx", "h/o_BZH-kH)HyCYI", ",;4%(ykAyD4tb_-]", "pSRE'&Vlwq|E`/|C", "HrM(NoQ`Xsq/vxu&", "pGGp@=],T9!U@%C2", "*6g:GLuf>&;VPM~J", "0G`4mMuLs|V:+8{;", "dTypR$7u~#E=m^!<", "~xZ~yg84P]=8p%%)", "F0{H<_1l)VAd.<Ue", "YYwI)L1Z~G+$tG(!", "3Q[&{!Fw8@aG[CM1", "qr0e0{L{i(]<2)a]", "~^BR^~C%f.mtV!O^", "U%MiQW.CdJ!N6r*f", "RbiN,E(%O,aAx7,Z", "HGLq9%gqLO`y[3Gu", "`^z*q/9?]xPb)d~.", "ENzelGg!GcP&VpC#", "%O2dA$'DDXFdf%F4", "jBgztU{''hjq#&QN", "_'iRU`24}w2^+7j!", "=uV/0j7pOV;/!5zz", "^:Z7:]@{C%!fb#]x"};
    assertArrayEquals(new int[] { 20, 56, 15, 20, 26, 11, 15, 30, 28, 22, 6, 1, 8, 1, 19, 7, 11, 5, 12, 7, 12, 1, 3, 5, 9, 3, 15, 2, 1, 3, 2, 4, 1, 1, 3, 2, 1, 5, 2, 2, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case26() {
    String[] topoData = {"cL8W@*/.jyu0_XN{5ba7{.aag}%5!LR*B&2sZkIK{/HzhgnZOs"};
    assertArrayEquals(new int[] { 6, 3, 2, 4, 4, 5, 4, 2, 2, 1, 3, 2, 2, 3, 4, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case27() {
    String[] topoData = {"YD0b!J;~m#|!kB0+Cm=lC_%)hIQh;!;n;=FZ7", "@dt-r!wt(=J!!!tY@9.SD]-2d<q(tR&qYO^G}", "?s1b*cl8Z}!{G.3TExjp9GG6N?Nc*nW]5B9jL", "!Wau>lBKah`L9Zdu8fO-}4<$,M4d,0B]AZ#@C", "|5DL89*6!A+YA=2'$5E|;A_!XV3]&FsHA!)gu", "$).KS,2-N9zYZw)q@ugvMRW)1FWMT<Q/G{jCH", "rGSm&0XN!BsU:}j!O*/~>G!p6,+=MWEyUljST", "Ze:O&g{>QiC[:K|X:Gg,3p#nJr(#=a9g9IMJn", "+/9*qAGr'rf6DjUK-8=5DXR((0B2wPoN#,pm1", "mY$?WJHkVBf,*B:})0B`O+.E]m2yGjU][grcE", "r}h7*d?BA:qs*{_d2(y?yIfMj5rH><8`!k-3m", "DU*V^C`nu7Cy>;Uz;Vno(R5})ZpO_w0!;!GV?", "Un#pP36d%HUJ75u,T/~Y*!Eku?0Be0DlcO+P1", "u6[A_jM`ut#AwK*]2mS4Yf1:iQeP`oN)L<J'=", "WCqiF~/k!$%x!J|8az;L~j$gXr%-1n[1D<n(E", "8Z2cf:pVIzfu>Y{vQfa14-;-Wpd*24WhGM:k=", "sgW8YrH^6_F!KDi$Iom$d])#}!7/WJeY;-o*1", "(V,zJ-*0d/Mz!^''P'R=f<MGX[r:!@C/#AN3#", "&@0Mvt`}NG61'uec6}d'MzkTNRrx]sN(7;tz6", "'5ZseXxeN29B?@5!,3y1h$4K`;Q?F>jgn>X1m", "S$^E3W@.L!:6t4qB,!Zv:E/qGW4p-0[9CUB40", "9Ol68huvbqFq2x*bMeCRjq*oCX2W*61?lI!)|", "k~/JM%!S>(KO)^?Cu?fJg!&><+Ms^;2Knt/cd"};
    assertArrayEquals(new int[] { 37, 39, 38, 47, 9, 16, 22, 28, 19, 15, 7, 18, 31, 35, 29, 26, 1, 11, 12, 9, 1, 17, 19, 2, 6, 2, 3, 3, 3, 1, 5, 28, 15, 30, 5, 1, 8, 1, 3, 8, 21, 8, 7, 5, 5, 1, 1, 4, 6, 2, 3, 2, 8, 5, 17, 4, 4, 3, 7, 5, 1, 7, 6, 1, 14, 2, 1, 1, 2, 1, 3, 2, 4, 1, 1, 5, 2, 2, 1, 2, 9, 2, 13, 2, 2, 1, 1, 2, 4, 1, 4, 1, 3, 3, 1, 5, 1, 1, 2, 1, 1, 1, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case28() {
    String[] topoData = {"9A:!}i$25~&/I9kjmv6!}", "NARkz^Ki_u}V(mT,N#RlY", "}.*TW_DgIDo=5/0}IOO79", "wOE7d4)YGUd%du})D'@]Q", "b'_0qh1-T}|DSw!jTh<r~", "{rhs33n4l@c:ILTO9f)2i", "{'eLOjbDH`+AAd,(E3~qS", "R-Q~(J^^]P~d^c?L?O?5z", "=8J.qVp'ns+Xh!%`G%!-|", "@.Ic5VzK/R,a*7b];$?zL", "lg*m:oiSqTuubSVa2hsC?", "Lbb$SLx)~*wz*Vq{WQh;[", "Q2&9`qp56d0QB$D2Cs||d", "R5]%7#AV%`Zba)gt3/TXl", "zDd+bhY_XnMxN!MGMAXR<", "lqq'V%l&#Vr<p{&z!JU8G", "{F*o'K$l7,Sn_oAbiE_%}", "l8=e^)O9|)dB_v#)eS;AG", "K:Wgy^d).U#THbtwSZt=)", "/[Uk*g~hwKPWYaG(AX_VL", "4w_@lwS@fVC@gd`$s3uh?", "~BLqDLFN;:Yp~!VlGG;1~", "1y)~{XnJff.+6aWyaedq&", "_im|V]7W0tRi=m4^vF/8I", "eO$s!!Tx[#~vvjL:kV3TP", "UwRnUI%541JV%J92bkLrJ", "Z];:o`$4@dpB9M9.qzK-R", "s%t_}ZAguL@>m~rF_y~+n", ":o{eM20UN.>&Gk|P<8)F="};
    assertArrayEquals(new int[] { 32, 25, 18, 25, 23, 35, 59, 10, 21, 32, 22, 29, 12, 16, 22, 6, 5, 12, 4, 6, 10, 17, 13, 12, 7, 10, 12, 14, 6, 6, 6, 4, 5, 1, 5, 4, 5, 1, 3, 1, 1, 3, 1, 1, 7, 2, 1, 4, 1, 1, 5, 1, 3, 1, 1, 2, 3, 3, 3, 1, 3, 1, 3, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case29() {
    String[] topoData = {"NIB{WE>2hY!T9_PbZzyGf@4,HYddgrThG!(B*VRWb'0I", "#_^%m,FS%I(D)oxek>|MLtDHEC!BZ1]veA7=IE:/CH.T", "QFV+leIll@{|dn-}6:AN&~$A$lw,dv[@rz*!8[(NfSbX", "#?5_DT9_wZNm&e8&l!q&?Q`![8tD`l/2Qo+sTu`EPTF5", "g>bS`pwrWV.nR)rSQ]!fx;7sBmbowKemd;_M3VR)Kh!y", "M^|k|oa?nGbhMf0)s9}>UKQ8>lT:0P4&5vLD4.g1,$k!", "rtq[-Z)}:3n9gVQg+0jBwh6`s)[~bbhNf})}7o`EX2@]", "oyGK-TbyUTbUF,NFt5={t~C}<;$#I8A?6o&[=);4BBkd", ":sB83%'3dJy!6Ev_iYx>&x<-YPVdi8nAu^FOiY4f>MwM", "npvx#Uxc'8[,]fIf1BaNaYn{b#[$f2!=zf^?0(/ql5[V", "T#!xS*On]~h*g%BYJ|H5oL6!MJfyWYY5'}gW^.|{8i8l", "nrZ$L.=?F4Z+<zwZX2YB%bt{bA!|DQu{V+l=X;!L)oBM", ":Yd=FL3FS(~kT%~)v}k]bq+j}]m8ZZYc?6=6$>{+=,*R", "stQT>eku_;~^Vvs$ly5`o!j%ol)(GCJ$1w#&[wd)*($2", "$zda.Jmm!FKl.(_7Fv9.}7()V:uNSk!P#lzWdit5O}t3", "xaFLrUthz.}GS7C5H!2ANQuh[5/tp^tw`2><S~mFSQ`T", "PymWZ^+2h+K~}<{/Z?4!`|jr<zhRKpY#RKnI4@iH|@H`", "dZ)GMWd/1Mz0,hIN._fTvHQc^n!WO0VL_KelfmYk;gYP", "9Ua0D;d<p',+.*TkiZ4IA;<e^@1OjwFaA0ga}@|f8oS~", "be?vn}'B&tH({+$qPRi':(p(qR96;[X!fVjcS<O)^mq`", "r76S)qe'v(fD/|LCx[YzFb9!_D(h&qO?.m.F%9]k$v!A", "!ih5s:!C{;pTo%W87Xl[)m+M']e%oT/n!}!/DzUA3|l_", "=BYg1`iekq%ur5W5CeWd1YhA#ZQ9#s9YA(nX~'~yHmF}", "U;A>3ZsT}Q:{@bg@sf!|nDN<]Ko=/8*nnOGS1:d!uBC]", "!a434J_Yb0l!cBvdlE/Me*L/6PRtV1JJ(!]cK-!(y`F2", "9y@T:ZH4deb9JW>qpj2'xm4=sU4NEG26N-D-ywC^ZWnC", "b8![)VE]iC8Q6rslJ':x@5uHTgqVZH1yaWpOdd6-@swc", ":vvA.7zT*~HFlG~W.MGv,h)#CoLsp4ue830J5Sph.O,)", "v{ih>da;qo3NjH&tv589i47BhXBT97fVl*r8j~3={lZ9", "]l59?ybGMjN-GJI)RZp'XA1?TyiC2%w8],I3oy->Um^Z", "Q9g+iW1~v~i@8}@P9*e4*MhZa;s@E]frUMI!1OJ}fbgH", "i3R@~7*^beT$:?7Q6dtRve[aoiyAa7P?|{^$<URxEbBd", "<ZMNBAR(q!O)2Fw+1%+:e~aJh7L;D9!_R`@i7G+kRe}V", "d&rR>~x;ycpE.+#nP+_v<!+(=YThBa^%rZ!MvO@`O0YT", "8v5C{6NIFb:BysgM!)s6Cb^1s(7!s:EGS7!1Gioo,!NS", "zIv-6$of(EDhRj,_yE`<T<!KZTyNNNb+Ft4qm4'*B5;q", "X+;GlnedCacgf2L$&ibEm<!C#<r'{f[<sWY;XiyI!ufF", "aL!SX|^9'@]S7-WioPz!6@/vTF#f8t)$va27F8w]&^xP", "#%,>8+Ye_UJV^o,bXGO&$87St<U!qdpFmnv!qyy+G+M'", "?R+T8]d'te>fd@^|Qxk>%1]_W[J+;U<Xpdt$dX;q`N*D", "e3[rTD*e2)cE>37,Jqz2~Cz@WV@%1rvLA!HhXhI/@01S", "{_4{BUM|zh;+iA$$rAwM+dF8E[t3i}Z!2o^N4S=^=$b2", "vH8J_j=!(0KyMBO~N&_n+E4B1uW?8jmPzyk`vVB$#DwE", "C|0v4O{ra&`%ELzlLJ#yTfAUXH:<hTRQ}-z2{~Qm``x^", ";+U$K05PX)ic#45}QNXJkL83k!F|:5qRw3vWM,wFyFdc", "neqp]!j|9>O^>Ktihwuo8KC4[iZmHANRLn|x!1dN>bea", "v&~hHFZC,!*!d1xl(x6!I_RFq|hDqrEV*P!^]]wi@g?]", "<j%e]v+Bq!8y&Y'b/Tmg@sA4k32;='<Wml7fW!dVw6It", "7S.|(p*!iHi?eY6u'</Z8ws^&P$d$RRURo)MsjP3';Og", "(}hzr_07e[gss!VB9jaB*4(`g;?f$}<!t7s4U6PlXM9)"};
    assertArrayEquals(new int[] { 28, 28, 36, 22, 27, 25, 44, 19, 14, 25, 21, 77, 54, 32, 10, 1, 8, 38, 16, 24, 34, 57, 31, 30, 3, 29, 40, 2, 15, 8, 19, 29, 4, 11, 17, 41, 19, 2, 12, 1, 29, 10, 48, 8, 17, 2, 9, 4, 5, 36, 3, 3, 31, 21, 38, 3, 1, 7, 2, 24, 52, 22, 14, 24, 11, 9, 15, 4, 14, 6, 8, 2, 2, 3, 2, 1, 4, 6, 27, 4, 24, 2, 6, 4, 9, 17, 5, 11, 9, 5, 3, 11, 8, 16, 11, 1, 21, 5, 4, 6, 2, 8, 4, 18, 1, 13, 1, 4, 18, 1, 3, 15, 13, 4, 4, 3, 16, 1, 4, 3, 6, 12, 6, 15, 1, 12, 10, 6, 1, 7, 3, 9, 3, 4, 1, 5, 8, 3, 6, 4, 1, 5, 2, 2, 3, 6, 6, 5, 8, 3, 1, 2, 1, 12, 1, 2, 2, 7, 1, 4, 1, 12, 3, 1, 4, 4, 9, 1, 1, 1, 6, 7, 4, 1, 4, 6, 3, 5, 4, 2, 1, 7, 3, 2, 1, 5, 1, 1, 2, 1, 5, 1, 2, 1, 1, 4, 2, 1, 1, 1, 1, 4, 1, 1, 1, 2, 2, 2, 3, 4, 1, 1, 1, 2, 2, 1, 2, 3, 2, 1, 2, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 2, 1, 1, 3, 2, 1, 1, 1, 1, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case30() {
    String[] topoData = { "*", "`", ",", "Z", "P", "h", "J", "'", "G", "a", "%", "-" };
    assertArrayEquals(new int[] { 4, 3, 3, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case31() {
    String[] topoData = { "*9Ua%WhJ1WWw&kV=XNm", "$d#I2Um'EAF^YsLf3kX", "h+PU.hRtP;:r#p>%i(|" };
    assertArrayEquals(new int[] { 14, 14, 12, 3, 1, 1, 10, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case32() {
    String[] topoData = 	{":=:.;E+trqE=ylOoKEUpr6&", "=b.Qmj#RmW_|M/;<AN!Xubp", "HNRwTLt!wyODd6UHeiAfAOP", "L'6@^gvvr3mxgaDvkLd>6}/", "kd<6B9bTrRdts~tVFBMx8Wi", "K+9s$c?|$E8q1J~%=nK@i[p", ".!fs-GKCL5*d+`+1%_O5-b!", "D{?lJzC+oW]rw[(1:+<MbRu", "fZ^zC#G'XKJQ*Xxg=_z'YA.", "ks}-@'|n`WlK<nGoGS=~Rk?", "j4h6mH1hRZTX=O5=OBOb(vz", "=9K:M0Py7eU8%w;Y`n`|mNC"};
    assertArrayEquals(new int[] { 68, 27, 11, 33, 8, 7, 16, 4, 1, 1, 3, 24, 1, 2, 11, 5, 9, 2, 1, 7, 9, 1, 3, 2, 1, 1, 1, 1, 3, 3, 2, 2, 3, 1, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case33() {
    String[] topoData = 	{"9Ae,Q^IJ(1g=F$!'15tB;%WjfDiXI?H2", "Oq]POR.!.bGVtpB>;d2395NU@aHGFQv!", "1g252pf(X!96RvOmu/(-U$8Wp!vso4.s", ";w:M4[}m_sb-R|SLx+Fr>#if[KjL(9^N", "bhu^!hD*%d8*Z.[hU*;4P[1_X'%DH2<$", "n6@$$ovGP`lRdV`}!(d?0HnjA?,H'u#j", "yQtzQ|RFSPNa@'~Ep<.=UaOvHW?0|Of4", "nlkPJ~]V]3!|RR}/M2QxEgwQs^05vnmI", "Za+DTs@8dwZ))5(i9D;M1rm5{y<th*XC", "KH]_zn6?.[1&|#e4^nrfo>AX[)!H4H,*", "?$<y.wp9^)<9r?WO5po6Ht<'QDa5OPFN", "z8^?-S?WxBp=;mI<qHV>@yY:La)![8g|", "6-vFN(pl_}?|VX}L}l(XF<Tx~R4vI@%g", "FbRbJocTJ1cdE@MuTd+]&;[Gq)ELCh!r", ")-rZ+u8]T[w8]CaxeoT8&/]}F0!C?<8h", "lA!#!6H+-+'Q51pm(WaE4t|OIX#u9.JT", "|MSUtUjfNmiR_m9'hs^g9;~XV!P[@mt3", "*T?ij!%ydTbN(ZM@>b|AIMwGg,:>!P_%", "FP(A6kacAY)V=e6gkkc7afCTCx6}BV!>"};
    assertArrayEquals(new int[] { 63, 41, 56, 23, 20, 36, 22, 19, 1, 6, 18, 31, 2, 2, 6, 4, 13, 16, 16, 18, 11, 1, 8, 4, 14, 4, 6, 10, 2, 9, 24, 3, 1, 11, 8, 6, 4, 2, 4, 5, 6, 11, 4, 3, 1, 2, 1, 2, 2, 1, 1, 4, 1, 1, 3, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case34() {
    String[] topoData = 	{"41dZz*fEj$RgqV", "!yxf41I0Yl/yx7", "XpxFpG9^9NST%u", "1~c7jd!bQ-o,3;", "A$cG1e!&|lQvy!", "S>Y,>9,+Wrig=L", "fis7&c#Z:=i!gX", "@!#t3L}8I]@uxb", ".%@M=DfQRah61x", "C1!s=bvJyisnm-", "KRkL(>Ab:hfY&O", "El:%JZ233a.{))", "])ME|z>~`ue!<0", "09+qY%7K<RlL2V", "7LVW{Xqs-:SI2X", "Y(h'!E)3D11WLB", "ZCoOjzurKsDoSU", "F|'^*:1UNxH!;Q"};
    assertArrayEquals(new int[] { 38, 15, 21, 37, 23, 11, 15, 1, 1, 11, 2, 12, 3, 6, 5, 5, 1, 3, 12, 7, 2, 2, 4, 7, 2, 2, 1, 2, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case35() {
    String[] topoData = 	{"^CpNct!2=!WePFpoYU+vU]S]1v*2:[BUS'i&*+[kd@", "S.,GYi{~K;f*<qI(wC+$2S9:;c0t6|>/xIyqJJ[-2v", "FD9'TW,gGr#+PMe]n;^/d{G!gNSik;l?p!W^NWc*wU", ">ZA;7;!'Zdv!llcEdeR$E{E1v#7'lw;*pp~25Y3Dvd", "Vi_*Dkx!uI(Z-W5~K!Mg`b1H{'{LQ>!@Gv~luua&Xw"};
    assertArrayEquals(new int[] { 35, 33, 21, 18, 15, 5, 2, 3, 3, 3, 10, 14, 4, 1, 2, 1, 8, 1, 5, 1, 4, 2, 2, 3, 8, 1, 1, 2, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case36() {
    String[] topoData = { "AAAAAAABBBBCCCDEFGHHIIJIIHGFEDDCCCBBBBBBBBBBAAAAAA", "AAAAABBBBBCCDDEEFGHIJJJJIIHGFEDDCCCCCCCCCBBBBBAAAA", "AAAABBBBCCCDDEEFGHIIJJJJJIHGFEDDDDDDDDDCCCCBBBBAAA", "AAABBBBCCDDEEFFGHHIJJJJJJIHGFEEDDDDDEEDDDDCCBBBBAA", "AABBBCCDDEEFFGGHHIIJJJJJIHHGFEEEEEEEFFFEEDDCCBBBAA", "BBBBCCDDEFFGHHHIIIIJJJIIIHGFFEEEEFFGGGGGFEEDCCBBBA", "BBBCCDEEFGHIIIJJJJIIIIIHHGGFFEEFFGGHHHHHGGFEDCCBBB", "BBCCDEEGHIJJKKKKJJJIIHHGGFFEEEEFGGHIIJJIIHGFEDCCBB", "CCCDEEFHIJKLMMMLKKJIHHGGFFEEEEFFGHIJJKKJJIHGFEDCBB", "CDDEEFHIJLMNNNNMLKJIHGFFEEEDEEFFGIJKKLLLKJIHFEDCCB", "DDEFFGIJLMNOPPONMLJIHGFEEDDDDEFGHIJKLMMMLKJIGFEDCB", "EEFFGHIKMNOQQQPONLKIHFEEDDDDDEFGHIKLMMNMMLKIHGEDCC", "FFGGHIJLMOPQRRQPNMKIGFEDDCCDDEFGHIKLMNNNNMLJIGFEDC", "GHHHIJKLNOQRRRQPOMKIGFEDDCCDDEFGHIKLMNNNNMLKIHFEDC", "HIIIJJKLNOPQRRQPNLKIGFEDDCCDDEFGHJKLMNOONNMKJHGFDC", "IJJJJJKLMOPQQQPONLJHGFEDDDDDEEFGIJKLMNOONNMLJIGFED", "JJJJJKKLMNOOPPONMKJHGFEDDDDEEFGHIJKLMNNONNMLJIGFED", "JKKJJJKKLMMNNNNMLJIHFFEEEEEFGGHIJKLMMNNNNMMKJIGFED", "KKKJJJJJKKLLMLLKJIHGFFEEEFFGHIJKKLMMNNNNNMLKJHGFED", "JJJJIIIIIJJJKKJJIIHGFFFFFGHIJKLMMNNNNNNMMLKJIHGEDC", "JJJIIHHHHHHIIIIIHHGGGGGGHIJKLMNOOOOONNMMLKJIHGFEDC", "IIIHHGGGGGGGGHHHGGGGGGHIIJLMNOPQQQQPONMLKJIHGFEDDC", "HHHGGFFFFFFFFFGGGGGGHHIJKMNOQRSSSSRQPNMLKIHGFFEDCC", "GGGFFEEEEEEEEFFFGGGHIJKLMOPRSTUUUTSRPNMKJHGFFEDCCB", "FFFEEEEDDDDEEEEFGGHIJKLNOQRTUVWWWVTRPNLJIHFEEDCCBB", "EEEEDDDDDDDDEEEFGHIJKLNOQRTVWXYYXWUSPNLJHGFEDCCBBB", "DDDDDDDDDDDEEEFFGHIKLNOQRTVWXYZYYWURPMKIGFEDCCBBBB", "CDDDDDDEEEEEEFFGHIJKMOPRSUWXYZZZXWTROMJHGEDCCBBBBA", "CCDDDEEEFFFFFGGHHJKLNOQRTVWXYZZYXVTQNLIGFEDCBBBAAA", "CCDDEFFGGGGHHHHIIJKMNPQSTVWXYYYXVURPMKIGEDCBBBAAAA", "CDDEFGGHIIIIIIIJJKLMOPQSTUVWWXWVUSQNLJHFECCBBBAAAA", "CDEFGHIJKKKKKKKKKLMNOPQRSTUVVVUTSQOMJHGEDCBBBAAAAA", "CDEGHIKLMMMMMMLLLMMNOPQRSSTTTTSRQOMKIGFDCCBBAAAAAA", "DEFGIKLMNOOOONNMMMNNOPQQRRRRRRQPNMKIHFEDCBBBAAAAAA", "DEGHJLMOPQQQPPOONNNOOPPPQQQPPONMLKIHFEDCBBBAAAAAAA", "DEGIKMNPQRRRRQPOOOOOOOPPPOOONMLKJIHFEDCCBBAAAAAAAA", "DFGIKMOQRSSSRRQPOOOOOOOOONMMLKJIHGFEDCCBBBAAAAAAAA", "DFGIKMOQRSSSRRQPOOOOONNNMMLKJIIHGFEDCCBBBAAAAAAAAA", "DEGIJLNPQRRRRQPOONNNNNMMLLKJIHGFEEDCCBBBAAAAAAAAAA", "DEFHJKMOPQQQQPOONNMMMMLLKJIHGGFEDDCCBBBAAAAAAAAAAA", "CDFGIJLMNOOOONNMMLLLLLKKJIHGFEEDCCCBBBAAAAAAAAAAAA", "CDEFGIJKLMMMMMLLKKKKKJJIIHGFEDDCCBBBBAAAAAAAAAAAAA", "CCDEFGHIJKKKKKJJJIIIIIHHGGFEDDCCBBBBAAAAAAAAAAAAAA", "BCCDEFGHHIIIIIHHHHHHHGGGFFEDDCCBBBAAAAAAAAAAAAAAAA", "BBCCDEEFFGGGGGGFFFFFFFFEEDDCCCBBBAAAAAAAAAAAAAAAAA", "BBBCCDDEEEEEEEEEEEEEEEEDDDCCBBBBAAAAAAAAAAAAAAAAAA", "ABBBCCCCDDDDDDDDDDDDDDDCCCCBBBBAAAAAAAAAAAAAAAAAAA", "AABBBBBCCCCCCCCCCCCCCCCCCBBBBBAAAAAAAAAAAAAAAAAAAA", "AAABBBBBBBBBBBBBBBBBBBBBBBBBAAAAAAAAAAAAAAAAAAAAAA", "AAAAAABBBBBBBBBBBBBBBBBBBBAAAAAAAAAAAAAAAAAAAAAAAA" };
    assertArrayEquals(new int[] { 1918, 65, 483, 5, 5, 24 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case37() {
    String[] topoData = { "zzzzzzzzzzzzz", "z...........z", "z...c.b.c...z", "z....bab.b..z", "z...c.b.c...z", "z...........z", "zzzzzzzzzzzzz" };
    assertArrayEquals(new int[] { 81, 6, 2, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case38() {
    String[] topoData = { "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" };
    assertArrayEquals(new int[] { 93 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case39() {
    String[] topoData = { "aaba", "aaba", "aaaa", "abaa", "abaa", "abaa" };
    assertArrayEquals(new int[] { 21, 3 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case40() {
    String[] topoData = { "AAAAAAABBBBCCCDEFGHHIIJIIHGFEDDCCCBBBBBBBBBBAAAAAA", "AAAAABBBBBCCDDEEFGHIJJJJIIHGFEDDCCCCCCCCCBBBBBAAAA", "AAAABBBBCCCDDEEFGHIIJJJJJIHGFEDDDDDDDDDCCCCBBBBAAA", "AAABBBBCCDDEEFFGHHIJJJJJJIHGFEEDDDDDEEDDDDCCBBBBAA", "AABBBCCDDEEFFGGHHIIJJJJJIHHGFEEEEEEEFFFEEDDCCBBBAA", "BBBBCCDDEFFGHHHIIIIJJJIIIHGFFEEEEFFGGGGGFEEDCCBBBA", "BBBCCDEEFGHIIIJJJJIIIIIHHGGFFEEFFGGHHHHHGGFEDCCBBB", "BBCCDEEGHIJJKKKKJJJIIHHGGFFEEEEFGGHIIJJIIHGFEDCCBB", "CCCDEEFHIJKLMMMLKKJIHHGGFFEEEEFFGHIJJKKJJIHGFEDCBB", "CDDEEFHIJLMNNNNMLKJIHGFFEEEDEEFFGIJKKLLLKJIHFEDCCB", "DDEFFGIJLMNOPPONMLJIHGFEEDDDDEFGHIJKLMMMLKJIGFEDCB", "EEFFGHIKMNOQQQPONLKIHFEEDDDDDEFGHIKLMMNMMLKIHGEDCC", "FFGGHIJLMOPQRRQPNMKIGFEDDCCDDEFGHIKLMNNNNMLJIGFEDC", "GHHHIJKLNOQRRRQPOMKIGFEDDCCDDEFGHIKLMNNNNMLKIHFEDC", "HIIIJJKLNOPQRRQPNLKIGFEDDCCDDEFGHJKLMNOONNMKJHGFDC", "IJJJJJKLMOPQQQPONLJHGFEDDDDDEEFGIJKLMNOONNMLJIGFED", "JJJJJKKLMNOOPPONMKJHGFEDDDDEEFGHIJKLMNNONNMLJIGFED", "JKKJJJKKLMMNNNNMLJIHFFEEEEEFGGHIJKLMMNNNNMMKJIGFED", "KKKJJJJJKKLLMLLKJIHGFFEEEFFGHIJKKLMMNNNNNMLKJHGFED", "JJJJIIIIIJJJKKJJIIHGFFFFFGHIJKLMMNNNNNNMMLKJIHGEDC", "JJJIIHHHHHHIIIIIHHGGGGGGHIJKLMNOOOOONNMMLKJIHGFEDC", "IIIHHGGGGGGGGHHHGGGGGGHIIJLMNOPQQQQPONMLKJIHGFEDDC", "HHHGGFFFFFFFFFGGGGGGHHIJKMNOQRSSSSRQPNMLKIHGFFEDCC", "GGGFFEEEEEEEEFFFGGGHIJKLMOPRSTUUUTSRPNMKJHGFFEDCCB", "FFFEEEEDDDDEEEEFGGHIJKLNOQRTUVWWWVTRPNLJIHFEEDCCBB", "EEEEDDDDDDDDEEEFGHIJKLNOQRTVWXYYXWUSPNLJHGFEDCCBBB", "DDDDDDDDDDDEEEFFGHIKLNOQRTVWXYZYYWURPMKIGFEDCCBBBB", "CDDDDDDEEEEEEFFGHIJKMOPRSUWXYZZZXWTROMJHGEDCCBBBBA", "CCDDDEEEFFFFFGGHHJKLNOQRTVWXYZZYXVTQNLIGFEDCBBBAAA", "CCDDEFFGGGGHHHHIIJKMNPQSTVWXYYYXVURPMKIGEDCBBBAAAA", "CDDEFGGHIIIIIIIJJKLMOPQSTUVWWXWVUSQNLJHFECCBBBAAAA", "CDEFGHIJKKKKKKKKKLMNOPQRSTUVVVUTSQOMJHGEDCBBBAAAAA", "CDEGHIKLMMMMMMLLLMMNOPQRSSTTTTSRQOMKIGFDCCBBAAAAAA", "DEFGIKLMNOOOONNMMMNNOPQQRRRRRRQPNMKIHFEDCBBBAAAAAA", "DEGHJLMOPQQQPPOONNNOOPPPQQQPPONMLKIHFEDCBBBAAAAAAA", "DEGIKMNPQRRRRQPOOOOOOOPPPOOONMLKJIHFEDCCBBAAAAAAAA", "DFGIKMOQRSSSRRQPOOOOOOOOONMMLKJIHGFEDCCBBBAAAAAAAA", "DFGIKMOQRSSSRRQPOOOOONNNMMLKJIIHGFEDCCBBBAAAAAAAAA", "DEGIJLNPQRRRRQPOONNNNNMMLLKJIHGFEEDCCBBBAAAAAAAAAA", "DEFHJKMOPQQQQPOONNMMMMLLKJIHGGFEDDCCBBBAAAAAAAAAAA", "CDFGIJLMNOOOONNMMLLLLLKKJIHGFEEDCCCBBBAAAAAAAAAAAA", "CDEFGIJKLMMMMMLLKKKKKJJIIHGFEDDCCBBBBAAAAAAAAAAAAA", "CCDEFGHIJKKKKKJJJIIIIIHHGGFEDDCCBBBBAAAAAAAAAAAAAA", "BCCDEFGHHIIIIIHHHHHHHGGGFFEDDCCBBBAAAAAAAAAAAAAAAA", "BBCCDEEFFGGGGGGFFFFFFFFEEDDCCCBBBAAAAAAAAAAAAAAAAA", "BBBCCDDEEEEEEEEEEEEEEEEDDDCCBBBBAAAAAAAAAAAAAAAAAA", "ABBBCCCCDDDDDDDDDDDDDDDCCCCBBBBAAAAAAAAAAAAAAAAAAA", "AABBBBBCCCCCCCCCCCCCCCCCCBBBBBAAAAAAAAAAAAAAAAAAAA", "AAABBBBBBBBBBBBBBBBBBBBBBBBBAAAAAAAAAAAAAAAAAAAAAA", "AAAAAABBBBBBBBBBBBBBBBBBBBAAAAAAAAAAAAAAAAAAAAAAAA" };
    assertArrayEquals(new int[] { 1918, 65, 483, 5, 5, 24 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case41() {
    String[] topoData = { "zzzzzzzzzzzzz", "z...........z", "z...c.b.c...z", "z....bab.b..z", "z...c.b.c...z", "z...........z", "zzzzzzzzzzzzz" };
    assertArrayEquals(new int[] { 81, 6, 2, 1, 1 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case42() {
    String[] topoData = { "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" };
    assertArrayEquals(new int[] { 93 }, topographicalimage.calcPeakAreas(topoData));
  }

  @Test
  public void case43() {
    String[] topoData = { "aaba", "aaba", "aaaa", "abaa", "abaa", "abaa" };
    assertArrayEquals(new int[] { 21, 3 }, topographicalimage.calcPeakAreas(topoData));
  }

}
