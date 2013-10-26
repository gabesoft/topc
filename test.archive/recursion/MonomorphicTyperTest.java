package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class MonomorphicTyperTest {
  MonomorphicTyper monomorphictyper = new MonomorphicTyper();

  @Test
  public void case1() {
    String expression = "x";
    String[] definitions = { "x:Char" };
    assertEquals("Char", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case2() {
    String expression = "upper(x)";
    String[] definitions = { "x:Char", "upper(Char):Char" };
    assertEquals("Char", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case3() {
    String expression = "ord(upper(letter))";
    String[] definitions = { "ord(Char):Int", "upper(Char):Char", "letter:Char", "Letter:String" };
    assertEquals("Int", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case4() {
    String expression = "id(id)";
    String[] definitions = { "id(Int):Int" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case5() {
    String expression = "abcdefghij(abcdefghik(abcdefghil(abcdefghiJ)))";
    String[] definitions = { "abcdefghij(abcdefghik):abcdefghij", "abcdefghik(abcdefghil):abcdefghik", "abcdefghil(abcdefghiJ):abcdefghil", "abcdefghiJ:abcdefghiJ" };
    assertEquals("abcdefghij", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case6() {
    String expression = "f(f(c,c),f(f(f(c,c),f(c,c)),f(f(c,c),f(c,c))))";
    String[] definitions = { "f(C,C):C", "c:C" };
    assertEquals("C", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case7() {
    String expression = "ff(f(c,c),f(f(f(cc,c),f(c,c)),f(f(cc,c),ff(c,c))))";
    String[] definitions = { "f(C,C):C", "ff(C,C):C", "c:C", "cc:C" };
    assertEquals("C", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case8() {
    String expression = "f(unknown)";
    String[] definitions = { "f(A):B" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case9() {
    String expression = "fst(zero)";
    String[] definitions = { "fst(Int,Int):Int", "zero:Int" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case10() {
    String expression = "Func(Int,Char,a)";
    String[] definitions = { "Int:Char", "Func(Char,Char,Int):Int", "Char:Char", "a:Int" };
    assertEquals("Int", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case11() {
    String expression = "D(J(h))";
    String[] definitions = { "h:N", "J(N):J", "D(J):a" };
    assertEquals("a", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case12() {
    String expression = "d(b,j(g,T,m))";
    String[] definitions = { "b:C", "g:K", "T:T", "m:V", "j(KTV):C", "d(CC):x" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case13() {
    String expression = "vw(Sa(ey,YR,otW),Nj,zoD,Wl,G,bC)";
    String[] definitions = { "ey:vz", "YR:HN", "otW:Oe", "Sa(vz,HN,Oe):w", "Nj:dVs", "zoD:EE", "Wl:k", "G:Lq", "bC:TW", "vw(w,dVs,EE,k,Lq,TW):LQ" };
    assertEquals("LQ", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case14() {
    String expression = "C(B,x(W),p)";
    String[] definitions = { "B:g", "W:i", "x(i):e", "p:x", "C(g,e,x):N" };
    assertEquals("N", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case15() {
    String expression = "l(H,d,u)";
    String[] definitions = { "H:P", "d:J", "u:T", "l(P,J,T):r" };
    assertEquals("r", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case16() {
    String expression = "khQCE(kAcIkqLkRr,ts,aZDjQTu)";
    String[] definitions = { "kAcIkqLkRr:fPMNxZh", "ts:xtGYLEPl", "aZDjQTu:Jl", "khQCE(fPMNxZh,xtGYLEPl,Jl):sgLPL" };
    assertEquals("sgLPL", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case17() {
    String expression = "f(f(f(f(f(f(f(f(f(f(f(f(f(f(f(f(x))))))))))))))))";
    String[] definitions = { "f(x):x", "x:x" };
    assertEquals("x", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case18() {
    String expression = "p(p(p(p(x,p(x,x)),p(x,x)),p(p(x,x),p(p(x,x),x))))";
    String[] definitions = { "p(x,x):x", "x:x" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case19() {
    String expression = "p(p(p(x,x),p(x,x)),p(p(x,x),p(p(p(x,x),x),x)))";
    String[] definitions = { "p(x,x):x", "x:x" };
    assertEquals("x", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case20() {
    String expression = "p(p(p(x,x),p(x,x)),p(p(x,p),p(p(p(x,x),x),x)))";
    String[] definitions = { "p(x,x):x", "x:x" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case21() {
    String expression = "p(p(p(x,x),p(p(x),x)),p(p(x,p),p(p(p(x,x),x),x)))";
    String[] definitions = { "p(x,x):x", "x:x" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case22() {
    String expression = "IWgJWOl(vYheToqwdn,tsLJD,BCHY)";
    String[] definitions = { "vYheToqwdn:OgSoQr", "tsLJD:BbC", "BCHY:tNFp", "IWgJWOl(OgSoQr,BbC,tNFp):lJFppXkRVv" };
    assertEquals("lJFppXkRVv", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case23() {
    String expression = "khQCE(kAcIkqLkRr,ts,aZDjQTu)";
    String[] definitions = { "kAcIkqLkRr:fPMNxZh", "ts:xtGYLEPl", "aZDjQTu:Jl", "khQCE(fPMNxZh,xtGYLEPl,Jl):sgLPL" };
    assertEquals("sgLPL", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case24() {
    String expression = "wS(ZE,I,y,g,em,cX,p,f,G,R,KG,r,U,OZ,hF)";
    String[] definitions = { "ZE:Cb", "I:B", "y:Q", "g:hO", "em:L", "cX:g", "p:Xc", "f:U", "G:ZG", "R:ee", "KG:S", "r:L", "U:o", "OZ:YB", "hF:Vy", "wS(Cb,B,Q,hO,L,g,Xc,U,ZG,ee,S,L,o,YB,Vy):d" };
    assertEquals("d", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case25() {
    String expression = "F(d(R(H(l(G)))),N,P(cU,Z,tj),O(n(z,nV)),fD,b)";
    String[] definitions = { "G:e", "l(e):R", "H(R):M", "R(M):h", "d(h):CE", "N:m", "cU:bM", "Z:FE", "tj:BN", "P(bM,FE,BN):m", "z:R", "nV:s", "n(R,s):w", "O(w):i", "fD:U", "b:gl", "F(CE,m,m,i,U,gl):vJ" };
    assertEquals("vJ", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case26() {
    String expression = "DN(ya,i(gZ),E(qx,Oh),d(oi),CR(v,nW),L(G,FU,l))";
    String[] definitions = { "ya:z", "gZ:Q", "i(Q):u", "qx:Jv", "Oh:WU", "E(Jv,WU):K", "oi:p", "d(p):Zq", "v:D", "nW:A", "CR(D,A):mj", "G:Xx", "FU:uv", "l:LI", "L(Xx,uv,LI):dE", "DN(z,u,K,Zq,mj,dE):L" };
    assertEquals("L", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case27() {
    String expression = "i(aJ(iQC,fx,po),QJI(S,X),LW,GUb(Tpg),dib,Hw)";
    String[] definitions = { "iQC:DpL", "fx:Ja", "po:H", "aJ(DpL,Ja,H):cF", "S:cx", "X:tk", "QJI(cx,tk):rvn", "LW:fXm", "Tpg:wv", "GUb(wv):s", "dib:g", "Hw:R", "i(cF,rvn,fXm,s,g,R):NP" };
    assertEquals("NP", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case28() {
    String expression = "u(qqI,Dg,W,DLg,u(S(q,L)))";
    String[] definitions = { "qqI:aIt", "Dg:ED", "W:JV", "DLg:ou", "q:n", "L:Jci", "S(n,Jci):D", "u(D):vX", "uu(aIt,ED,JV,ou,vX):gV" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case29() {
    String expression = "uu(qqI,Dg,W,DLg,u(S(q,L)))";
    String[] definitions = { "qqI:aIt", "Dg:ED", "W:JV", "DLg:ou", "q:n", "L:Jci", "S(n,Jci):D", "u(D):vX", "uu(aIt,ED,JV,ou,vX):gV" };
    assertEquals("gV", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case30() {
    String expression = "RWL(Gpr,Pz,ED,lt(fCO,bX,ttw),vG)";
    String[] definitions = { "Gpr:nN", "Pz:lv", "ED:TvV", "fCO:Jd", "bX:ym", "ttw:K", "lt(Jd,ym,K):d", "vG:dCN", "RWL(nN,lv,TvV,d,dCN):W" };
    assertEquals("W", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case31() {
    String expression = "rkxcJ(z,N(ykLt,djxf,PkMZl,klC,j,jnbq),s)";
    String[] definitions = { "z:lsS", "ykLt:tev", "djxf:eqT", "PkMZl:Uaz", "klC:Ud", "j:LG", "jnbq:nvYDE", "N(tev,eqT,Uaz,Ud,LG,nvYDE):qVgZ", "s:M", "rkxcJ(lsS,qVgZ,M):J" };
    assertEquals("J", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case32() {
    String expression = "tAxcy(NgKgcbOtV,QSRFQ,S(JHfakq,TF),hNN(yuAoHT))";
    String[] definitions = { "NgKgcbOtV:lCMf", "QSRFQ:DkGGcOsWSr", "JHfakq:dKRcfu", "TF:y", "S(dKRcfu,y):BwxUr", "yuAoHT:dV", "hNN(dV):HiAO", "tAxcy(lCMf,DkGGcOsWSr,BwxUr,HiAO):PmaMTdOJ" };
    assertEquals("PmaMTdOJ", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case33() {
    String expression = "bqF(G(OQe,Jp,htombf),kXsgb,HHZDM(v(haNEh)),WYIG)";
    String[] definitions = { "OQe:Tovrs", "Jp:biO", "htombf:hnC", "G(Tovrs,biO,hnC):oVX", "kXsgb:QnVNce", "haNEh:lb", "v(lb):er", "HHZDM(er):JePc", "WYIG:Jtvv", "bqF(oVX,QnVNce,JePc,Jtvv):hYv" };
    assertEquals("hYv", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case34() {
    String expression = "bqF(G(OQe,Jp,htombf),kXsgb,HHZDM(v(haNEh)),WYIG)";
    String[] definitions = { "OQe:Tovrs", "Jp:biO", "htombf:hnC", "G(Tovrs,biO,hnC):oVX", "kssgb:QnVNce", "haNEh:lb", "v(lb):er", "HHZDM(er):JePc", "WYIG:Jtvv", "bqF(oVX,QnVNce,JePc,Jtvv):hYv" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case35() {
    String expression = "Func(Int,Char,a)";
    String[] definitions = { "Int:Char", "Func(Char,Char,Int):Int", "Char:Char", "a:Int" };
    assertEquals("Int", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case36() {
    String expression = "ord(upper(letter))";
    String[] definitions = { "ord(Char):Int", "upper(Char):Char", "letter:Char", "Letter:String" };
    assertEquals("Int", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case37() {
    String expression = "c(Func(Int,Char,a),b(a))";
    String[] definitions = { "Int:Char", "Func(Char,Char,Int):Int", "Char:Char", "a:Int", "c(Char,Char):Char", "b(Char):Char" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case38() {
    String expression = "f(unknown)";
    String[] definitions = { "f(A):B" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case39() {
    String expression = "Func(Int,Char,Func(Int,Char,Func(Int,Char,a)))";
    String[] definitions = { "Int:Char", "Func(Char,Char,Int):Int", "Char:Char" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case40() {
    String expression = "Func(Int,y(z),z,c(vasia(petia,boria)),t)";
    String[] definitions = { "Int:Char", "Func(Char,Int,Char,Char,Char):NULL", "z:Char", "y(Char):Int", "c(Char):Char", "petia:Char", "boria:Char", "vasia(Char,Char):Char", "t:Char" };
    assertEquals("NULL", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case41() {
    String expression = "c(Func(Int,Char,a),b(a))";
    String[] definitions = { "Int:Char", "Func(Char,Char,Int):Char", "Char:Char", "a:Int", "c(Char,Char):Char", "b(Int):Char" };
    assertEquals("Char", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case42() {
    String expression = "a(c,b(c,c))";
    String[] definitions = { "a(char,char):char", "c:char", "b(char,char):char" };
    assertEquals("char", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case43() {
    String expression = "fst(zero)";
    String[] definitions = { "fst(Int,Int):Int", "zero:Int" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case44() {
    String expression = "f(g(a,b))";
    String[] definitions = { "g(int,int):int", "f(int):char", "a:int", "b:int" };
    assertEquals("char", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case45() {
    String expression = "Func(a,Func(a,Func(a,Func(a,Func(a,b)))))";
    String[] definitions = { "a:Char", "Func(Char,Int):Int", "b:Int" };
    assertEquals("Int", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case46() {
    String expression = "foo(foo(foo(x)))";
    String[] definitions = { "Int:Int", "foo(Int):Int", "x:Int", "a:Int" };
    assertEquals("Int", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case47() {
    String expression = "fi(g(k),m(n))";
    String[] definitions = { "fI(Int,Int):Int", "fi(Int,Char):String", "g(Char):Int", "m(Char):Char", "k:Char", "n:Char" };
    assertEquals("String", monomorphictyper.infer(expression, definitions));
  }

  @Test
  public void case48() {
    String expression = "fst(fs(Int,a(Int)),Double)";
    String[] definitions = { "Int:Char", "Double:Char", "fst(Int,Double):Char", "fs(Char,Int):Int", "a(Char):Int" };
    assertEquals("", monomorphictyper.infer(expression, definitions));
  }

}
