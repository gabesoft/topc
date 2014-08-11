package topc.test.parsing;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.parsing.*;

public class BracketExpressionsTest {
  BracketExpressions bracketexpressions = new BracketExpressions();

  @Test
  public void case1() {
    String expression = "([]{})";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case2() {
    String expression = "(())[]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case3() {
    String expression = "({])";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case4() {
    String expression = "[]X";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case5() {
    String expression = "([]X()[()]XX}[])X{{}}]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case6() {
    String expression = "[{()}](";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case7() {
    String expression = "((())]";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case8() {
    String expression = "()}{[]";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case9() {
    String expression = "([)]";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case10() {
    String expression = "(][)";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case11() {
    String expression = "([[]]{[]}";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case12() {
    String expression = "()XX{}[[";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case13() {
    String expression = "[{[{X]]}";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case14() {
    String expression = "(((((((((((([()X)))))))))))";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case15() {
    String expression = "(X{[X(()X";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case16() {
    String expression = "X{}[]()]X{X{}]X]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case17() {
    String expression = "{[]{}XX[])()[]{}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case18() {
    String expression = "(([])[])((){}){}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case19() {
    String expression = "{[[X[X[XX[[[[X[[[[[[[[{[()]}]]]]]]]]]]]]]]]]]])]]}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case20() {
    String expression = "[[{}{X[]][X][{()(){}[]}[(X[{}{}X()()][{}X{[]}()]()";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case21() {
    String expression = "X[()X}]()[]}[{[]{()}()X[{}[]][{()}()()][X][]{}{}(X";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case22() {
    String expression = "({[((X{}{}){}{X}(){}X[][]]XX{}{}}()}{}{}}{}[])[][]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case23() {
    String expression = "[({}[]{X){}[](X][][]{})()X[(){()}[XX}{}]{{()}()}()";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case24() {
    String expression = "({[{{}{X}()](){}X[]({{[]}()}{}{{}()}{})[{}()]XXX[]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case25() {
    String expression = "XXX]][[][()]{}XX]]{}[]][()[]][][]){{[]{}}(){}}[]()";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case26() {
    String expression = "{{{{[()[]][]}{}{XX{{}}(XXX{}{[]}{}]{}[]{{(){}}[]}}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case27() {
    String expression = "[({([])X{}[])[]X({()[]}[X[])[]())(X][][()[]()][]()";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case28() {
    String expression = "[{()}(X{}{})(){X}X}}X])[[{}()X()[]([][][]){}()]{}]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case29() {
    String expression = "({}()[])(({}{})[]([()]()){()()[]}[][]){()()}[]{}[]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case30() {
    String expression = "[[[X[[[[X[[[[[X[[[[[X[[[[[[[[[[[[X[[[[[[[[[[[[[[[[";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case31() {
    String expression = "(((((XXXX]";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case32() {
    String expression = "(X{{{{{{{{{{}}}}}}}}}}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case33() {
    String expression = "(X{{{{{{{{{{}}}}}}}}}}))";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case34() {
    String expression = "(X{{{{{{{{{}}}}}}}}})}";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case35() {
    String expression = "([{X}])X";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case36() {
    String expression = "XXX[]()[{()()}][])]}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case37() {
    String expression = "(X)]";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case38() {
    String expression = "((((((XXXX";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case39() {
    String expression = "XXXX";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case40() {
    String expression = "XXX";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case41() {
    String expression = "XXX[][]()]}";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case42() {
    String expression = "([}((XXX";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case43() {
    String expression = "X(X[X)X}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case44() {
    String expression = "X(([((X))]))";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case45() {
    String expression = "(XXXX]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case46() {
    String expression = "(X(X(X(X(X[]{}((()))";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case47() {
    String expression = "[X]}";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case48() {
    String expression = "{[]X{[X]]}}XXX]{}{[[]]}{}{}{}{}{}{}{[][][]()()}}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case49() {
    String expression = ")(";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case50() {
    String expression = "X(((XX";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case51() {
    String expression = "((X))";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case52() {
    String expression = "XX()[]}}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case53() {
    String expression = "X[XX(X";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case54() {
    String expression = ")X";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case55() {
    String expression = ")";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case56() {
    String expression = "(X})X()X)(){}X";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case57() {
    String expression = "[[X]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case58() {
    String expression = "({)}";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case59() {
    String expression = "[][]{}((X)(X()))[[X]]]{{X}}}[[]]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case60() {
    String expression = ")XX(";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case61() {
    String expression = "(XXXXX)";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case62() {
    String expression = "[[[X]]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case63() {
    String expression = "{X]}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case64() {
    String expression = "XXX(((";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case65() {
    String expression = "X(()";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case66() {
    String expression = "([]()[()]XX}[]){{}}]";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case67() {
    String expression = "()()X(";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case68() {
    String expression = "{(X}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case69() {
    String expression = "XXXX()()()()()()()()()()()()()()()()()()()()()()(X";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case70() {
    String expression = ")XXX";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case71() {
    String expression = "[X[]}]X}X]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case72() {
    String expression = "}";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case73() {
    String expression = "(((XXX";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case74() {
    String expression = "[{]}";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case75() {
    String expression = "{{";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case76() {
    String expression = "X{";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case77() {
    String expression = "}{";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case78() {
    String expression = "(X{}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case79() {
    String expression = "(X";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case80() {
    String expression = "X(";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case81() {
    String expression = "XX";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case82() {
    String expression = "XXXXX";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case83() {
    String expression = "[{[XX}";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case84() {
    String expression = "((([[())))XX";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case85() {
    String expression = "{(})";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case86() {
    String expression = "([X])X";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case87() {
    String expression = "{)";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case88() {
    String expression = "]XXX";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case89() {
    String expression = "(([)])";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case90() {
    String expression = "(X)}";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case91() {
    String expression = "{[}]";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case92() {
    String expression = "XX((";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case93() {
    String expression = "(X])";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case94() {
    String expression = "([(]))";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case95() {
    String expression = "()X(";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case96() {
    String expression = "X(})";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case97() {
    String expression = "([(])X";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case98() {
    String expression = "XXXXX)";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case99() {
    String expression = "X}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case100() {
    String expression = "((";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case101() {
    String expression = "(((X";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case102() {
    String expression = "X[";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case103() {
    String expression = "(X))";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case104() {
    String expression = "([X]})";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case105() {
    String expression = "(XX]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case106() {
    String expression = "({X)";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case107() {
    String expression = "{X";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case108() {
    String expression = "XX]]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case109() {
    String expression = "XX{";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case110() {
    String expression = "[X])";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case111() {
    String expression = "{(XX)}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case112() {
    String expression = "[{(})][({})]";
    assertEquals("impossible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case113() {
    String expression = "{X)}";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case114() {
    String expression = "(X{X})";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

  @Test
  public void case115() {
    String expression = "[(X]";
    assertEquals("possible", bracketexpressions.ifPossible(expression));
  }

}
