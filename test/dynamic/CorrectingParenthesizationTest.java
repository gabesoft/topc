package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CorrectingParenthesizationTest {
  CorrectingParenthesization correctingparenthesization = new CorrectingParenthesization();

  @Test
  public void case1() {
    String s = "([{}])()[]{}";
    assertEquals(0, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case2() {
    String s = "([)]";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case3() {
    String s = "([{}[]";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case4() {
    String s = "";
    assertEquals(0, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case5() {
    String s = "][";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case6() {
    String s = "()[]";
    assertEquals(0, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case7a() {
    String s = "[(}]";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case7() {
    String s = "[(}][{}]";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case8() {
    String s = "((((([[[[[{{{{{}}}}}]]]]])))))";
    assertEquals(0, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case9() {
    String s = "}}}}}]]]]])))))((((([[[[[{{{{{";
    assertEquals(16, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case10() {
    String s = ")()[]{}[]{}[]{}()[";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case11() {
    String s = "){[}](";
    assertEquals(4, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case12() {
    String s = "}]";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case13() {
    String s = "([{]()";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case14() {
    String s = "(){}[})}){}]";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case15() {
    String s = "[]}({[[](([(]]})";
    assertEquals(5, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case16() {
    String s = "{})({])[]}})]{{})}{{)]";
    assertEquals(6, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case17() {
    String s = "{}({}(()[[[])}(]}}{]][[(]]";
    assertEquals(6, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case18() {
    String s = "[(]{)[}]]}})}{[[)}}]{[][[][{{[[}";
    assertEquals(9, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case19() {
    String s = ")}[(({}}}}[{)}]])]]]()[]{[}[))}{}){)";
    assertEquals(11, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case20() {
    String s = "{}}{[(][]][}[]({(]{})[]]([[(})(][])][[{]{(";
    assertEquals(11, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case21() {
    String s = "(]{]]]]}]){()(]}([)[((}[]])}{{{){{]{)))}(]((]]";
    assertEquals(14, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case22() {
    String s = "([{(({[{[[[{({((({{[([{{{)}}]}})}]}]])]])}})))])}]";
    assertEquals(9, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case23() {
    String s = "({{{[({([]}]})})))";
    assertEquals(4, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case24() {
    String s = "{[[((({{{(())))]]])))]";
    assertEquals(5, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case25() {
    String s = "}])}])])})}])}]]}])}])}]]{([[[{(([{{[({(([{[({[{{[";
    assertEquals(26, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case26() {
    String s = "])])}}]}))}]}[{[[(([[{({([";
    assertEquals(14, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case27() {
    String s = "})]])]}]))})}]}]}}))}[{[{[[{{([[[([[({[[({";
    assertEquals(22, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case28() {
    String s = "[((({}{})()[](";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case29() {
    String s = "{[[()({)}[]){}][){}][)";
    assertEquals(5, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case30() {
    String s = "[([])]{}[]";
    assertEquals(0, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case31() {
    String s = "({}{}(])";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case32() {
    String s = "({{}{}(({[{}]]()[{{)}]]{}}](){](])[}()";
    assertEquals(7, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case33() {
    String s = "[((()[]]}()))]";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case34() {
    String s = "{([(]({}[))[){{}}[]}]])]]{}]){]}";
    assertEquals(5, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case35() {
    String s = "[(}([{((([])))}]))]()]";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case36() {
    String s = "(({}))";
    assertEquals(0, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case37() {
    String s = "{{([{}()([[]{[]{]())()])}{]}";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case38() {
    String s = "][((({(()][)])(}([({{}}))]()(){}{[([))()()))][{()]";
    assertEquals(10, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case39() {
    String s = "[]";
    assertEquals(0, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case40() {
    String s = "(}}[{)({[([{[][()({)}]}][{}({[({](])";
    assertEquals(9, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case41() {
    String s = "()[()([{}(()()()[]{}[[]]{}{})}()}])[]{}]{}";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case42() {
    String s = "[([{(}()[)]]){";
    assertEquals(4, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case43() {
    String s = "({[{{][{{{({[{{}()}{}][]})}[]}[](){{}]}()]})";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case44() {
    String s = "()";
    assertEquals(0, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case45() {
    String s = "{(([]}()[{}]](){}[]){){}";
    assertEquals(3, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case46() {
    String s = "{{}{([((()))][]{])}()}";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case47() {
    String s = "{](()[([{))[[]{]{}{}[(([}{}{)[[[]}{}]}(){()}[(";
    assertEquals(9, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case48() {
    String s = "([]{[]])({[{}[]]})";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case49() {
    String s = "()[]{}[]{}[]{}[]}{}[]{}[]{})";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case50() {
    String s = "]]]]]]]]]]]]";
    assertEquals(6, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case51() {
    String s = "{{{{{{{{{{{{{{";
    assertEquals(7, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case52() {
    String s = "))))))))))))))))))))))))))))))))))))))))))))))))))";
    assertEquals(25, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case53() {
    String s = "({[[{([[{{{{(({(({{{{[[[{({{[{[(({[{{{[[[(((((((({";
    assertEquals(25, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case54() {
    String s = "{}{[(}}]()))[)([";
    assertEquals(5, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case55() {
    String s = ")([}}{([{(({})}()(({}{)]}))}}]({]}";
    assertEquals(7, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case56() {
    String s = "}[[{{{][}(){}[][]}";
    assertEquals(4, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case57() {
    String s = "{[{({}{]]}{{}{}][(]{}])}]}[(";
    assertEquals(4, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case58() {
    String s = "]}{][]{}][{[}][({{[{(}[})}()]{)}]}}[";
    assertEquals(10, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case59() {
    String s = "})([)]()[}[](])]";
    assertEquals(5, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case60() {
    String s = "{}";
    assertEquals(0, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case61() {
    String s = "{{(()({](([((({({][]{[]]]){}}})[]{";
    assertEquals(8, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case62() {
    String s = "[]{[]{}([[]()[){}()}{}";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case63() {
    String s = "[{]]([]]}[[[[{[(]{{{[]]}[){[{())(]]{]]([)(}(";
    assertEquals(13, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case64() {
    String s = "({}){{";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case65() {
    String s = "[[][][]((([]()())))(){}]";
    assertEquals(0, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case66() {
    String s = "{}({}]}){}()";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case67() {
    String s = "{]()";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case68() {
    String s = ")()](][]()(()()]{()[))";
    assertEquals(4, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case69() {
    String s = ")]({{}})})";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case70() {
    String s = "{{[{[[{}[][]}}";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case71() {
    String s = "({(([[[()(}]]]})()";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case72() {
    String s = "[{(([[}[([][]({{}{}{{({[[]}(](]}]{}}))}}}])(){})}]";
    assertEquals(7, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case73() {
    String s = "({}{[[]{}[][]}]]{}))()";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case74() {
    String s = "[]";
    assertEquals(0, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case75() {
    String s = "{[({}}[{{{}}}]]{}[])[}([";
    assertEquals(3, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case76() {
    String s = "[)";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case77() {
    String s = "{{)(}()}{}{((())({([)[{{}[}[)}]}]]([))}}";
    assertEquals(8, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case78() {
    String s = "()({}{}{";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case79() {
    String s = "}[}(][(){)}{]})}{}{}())]";
    assertEquals(6, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case80() {
    String s = "[[]([{}()][]";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case81() {
    String s = "[]))[]";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case82() {
    String s = "{{{[[{{}{}[{}}";
    assertEquals(3, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case83() {
    String s = ")][(][]]()";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case84() {
    String s = ")))(({}{}}{{{}}}})({}{}}}}}}{{{{)}())}{]}{(]))((((";
    assertEquals(13, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case85() {
    String s = "({[}[)]]({[}[)]]({[}[)]]({[}[)]]({[}[)]]({[}[)]]";
    assertEquals(15, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case86() {
    String s = ")))(((";
    assertEquals(4, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case87() {
    String s = ")[]]{(()))){}}}{{[[]]]}([{]}{}}]][[(()[]])))}}}[";
    assertEquals(9, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case88() {
    String s = "]]]]";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case89() {
    String s = "(((((]]]{]}{{]]]]{{{{))[[{{{))(({]";
    assertEquals(13, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case90() {
    String s = "([{}])()[]{}(((}}}}}}][]{])((}}}{}][][()()}}))))";
    assertEquals(9, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case91() {
    String s = "{([}";
    assertEquals(1, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case92() {
    String s = "[{}]}}}}}}";
    assertEquals(3, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case93() {
    String s = "][{{";
    assertEquals(3, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case94() {
    String s = "(}){(}({))(}{(){(}(([][][(][])((()[][][](((}";
    assertEquals(11, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case95() {
    String s = ")[{{))](";
    assertEquals(4, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case96() {
    String s = "([{}[]([{}[]([{}[]([{}[]([{}[]([{}[]([{}[]([{}[]]]";
    assertEquals(8, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case97() {
    String s = "((({[{]}}]]]";
    assertEquals(4, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case98() {
    String s = "}}}}}}])])}])])}])])}])])}])])}])])}])])}])])}]}";
    assertEquals(24, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case99() {
    String s = "(((((]]]{]}{{]]]]{{{{))[[{{{))(({](((]]{";
    assertEquals(16, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case100() {
    String s = "(}{([]){][){()[]]}})({}[]]])(][{}}{{})({}){[])[](]";
    assertEquals(10, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case101() {
    String s = "((((((((((([})))))))))))([[[[[[[[[]]]]]]]]]}";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case102() {
    String s = "({(((((((((((((((((}}}}}}}}}}}}}}}}}[[[[}(}((}";
    assertEquals(22, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case103() {
    String s = "((({[[]})[{]]}";
    assertEquals(4, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case104() {
    String s = "())){[[[[}()))((({][[[[]";
    assertEquals(8, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case105() {
    String s = "[({]})";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case106() {
    String s = ")(";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case107() {
    String s = "]]][[[";
    assertEquals(4, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case108() {
    String s = "([{}[])))))]";
    assertEquals(3, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case109() {
    String s = "][";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case110() {
    String s = "([{}])()[]{}([{}])()[]{}([{}])()[]{}[}[](}{}{]}]";
    assertEquals(3, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case111() {
    String s = "}}}}";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case112() {
    String s = "(({[))}]";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case113() {
    String s = "][][(((((((()))))}}}}}[[[[[[[}}}]]]]]]]]]]}}{{{{";
    assertEquals(10, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case114() {
    String s = "))}})}[[}())]{])]({[{[({}}{(())[)[{})]][){({{({]";
    assertEquals(14, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case115() {
    String s = "{{{{";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case116() {
    String s = "([{}[()]{(}){}[[))}}{{";
    assertEquals(5, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case117() {
    String s = "{}({[[}){(][({}{))({[}{)";
    assertEquals(6, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case118() {
    String s = "{)})";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case119() {
    String s = "((]))()(([))";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case120() {
    String s = ")}[](){{{]])(){{}))))]";
    assertEquals(7, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case121() {
    String s = "[{](})";
    assertEquals(3, correctingparenthesization.getMinErrors(s));
  }

  @Test
  public void case122() {
    String s = "[([{]})]";
    assertEquals(2, correctingparenthesization.getMinErrors(s));
  }

}
