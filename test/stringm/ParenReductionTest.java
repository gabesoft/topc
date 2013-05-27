package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class ParenReductionTest {
  ParenReduction parenreduction = new ParenReduction();

  @Test
  public void case1() {
    String expr = "((a*b)+(c*d))";
    assertEquals("a*b+c*d", parenreduction.pretty(expr));
  }

  @Test
  public void case2() {
    String expr = "((w+x)+(y+z))";
    assertEquals("w+x+y+z", parenreduction.pretty(expr));
  }

  @Test
  public void case3() {
    String expr = "((s*t)/(m*n))";
    assertEquals("s*t/(m*n)", parenreduction.pretty(expr));
  }

  @Test
  public void case4() {
    String expr = "((q^r)^(f^g))";
    assertEquals("(q^r)^f^g", parenreduction.pretty(expr));
  }

  @Test
  public void case5() {
    String expr = "(((((a+b)/c)*d)^e)-f)";
    assertEquals("((a+b)/c*d)^e-f", parenreduction.pretty(expr));
  }

  @Test
  public void case6() {
    String expr = "(a-(b/(c^d)))";
    assertEquals("a-b/c^d", parenreduction.pretty(expr));
  }

  @Test
  public void case7() {
    String expr = "(e*((f+(g+h))*i))";
    assertEquals("e*(f+g+h)*i", parenreduction.pretty(expr));
  }

  @Test
  public void case8() {
    String expr = "(((a-(b-c))-d)^((e/f)/(g/h)))";
    assertEquals("(a-(b-c)-d)^(e/f/(g/h))", parenreduction.pretty(expr));
  }

  @Test
  public void case9() {
    String expr = "x";
    assertEquals("x", parenreduction.pretty(expr));
  }

  @Test
  public void case10() {
    String expr = "((a+((l-g)+o))^((r/i)*((t/h)*m)))";
    assertEquals("(a+l-g+o)^(r/i*t/h*m)", parenreduction.pretty(expr));
  }

  @Test
  public void case11() {
    String expr = "z";
    assertEquals("z", parenreduction.pretty(expr));
  }

  @Test
  public void case12() {
    String expr = "(a-(b-(c-d)))";
    assertEquals("a-(b-(c-d))", parenreduction.pretty(expr));
  }

  @Test
  public void case13() {
    String expr = "((u-d)*(((m/c)/y)+((z*(x-(l/e)))-((p+a)-(w*v)))))";
    assertEquals("(u-d)*(m/c/y+z*(x-l/e)-(p+a-w*v))", parenreduction.pretty(expr));
  }

  @Test
  public void case14() {
    String expr = "((v^h)/((p+b)/(((u-(w-((r+z)^f)))-(m^d))+(l-y))))";
    assertEquals("v^h/((p+b)/(u-(w-(r+z)^f)-m^d+l-y))", parenreduction.pretty(expr));
  }

  @Test
  public void case15() {
    String expr = "((((n/(r*k))+(h-(i^(l^(c/z)))))/e)*((u*(x/o))*j))";
    assertEquals("(n/(r*k)+h-i^l^(c/z))/e*u*x/o*j", parenreduction.pretty(expr));
  }

  @Test
  public void case16() {
    String expr = "(((((t-(k/(o*m)))*(c*f))*((n/j)+(v-z)))^l)/(x-h))";
    assertEquals("((t-k/(o*m))*c*f*(n/j+v-z))^l/(x-h)", parenreduction.pretty(expr));
  }

  @Test
  public void case17() {
    String expr = "(a+b)";
    assertEquals("a+b", parenreduction.pretty(expr));
  }

  @Test
  public void case18() {
    String expr = "(c-d)";
    assertEquals("c-d", parenreduction.pretty(expr));
  }

  @Test
  public void case19() {
    String expr = "(e*f)";
    assertEquals("e*f", parenreduction.pretty(expr));
  }

  @Test
  public void case20() {
    String expr = "(g/h)";
    assertEquals("g/h", parenreduction.pretty(expr));
  }

  @Test
  public void case21() {
    String expr = "(i^j)";
    assertEquals("i^j", parenreduction.pretty(expr));
  }

  @Test
  public void case22() {
    String expr = "((h-q)/s)";
    assertEquals("(h-q)/s", parenreduction.pretty(expr));
  }

  @Test
  public void case23() {
    String expr = "(v/(k/w))";
    assertEquals("v/(k/w)", parenreduction.pretty(expr));
  }

  @Test
  public void case24() {
    String expr = "(g+(t^y))";
    assertEquals("g+t^y", parenreduction.pretty(expr));
  }

  @Test
  public void case25() {
    String expr = "((p/o)+(e*i))";
    assertEquals("p/o+e*i", parenreduction.pretty(expr));
  }

  @Test
  public void case26() {
    String expr = "(z/((d-r)^a))";
    assertEquals("z/(d-r)^a", parenreduction.pretty(expr));
  }

  @Test
  public void case27() {
    String expr = "(n^((x^l)/m))";
    assertEquals("n^(x^l/m)", parenreduction.pretty(expr));
  }

  @Test
  public void case28() {
    String expr = "((((j+b)-u)-f)*c)";
    assertEquals("(j+b-u-f)*c", parenreduction.pretty(expr));
  }

  @Test
  public void case29() {
    String expr = "(w-(d+((h^g)/y)))";
    assertEquals("w-(d+h^g/y)", parenreduction.pretty(expr));
  }

  @Test
  public void case30() {
    String expr = "(((z-b)/f)-(i^x))";
    assertEquals("(z-b)/f-i^x", parenreduction.pretty(expr));
  }

  @Test
  public void case31() {
    String expr = "((l^u)*((t/m)-(k+r)))";
    assertEquals("l^u*(t/m-(k+r))", parenreduction.pretty(expr));
  }

  @Test
  public void case32() {
    String expr = "((v/j)+(a^(s/(p/e))))";
    assertEquals("v/j+a^(s/(p/e))", parenreduction.pretty(expr));
  }

  @Test
  public void case33() {
    String expr = "(q*((((c*n)+o)-j)*p))";
    assertEquals("q*(c*n+o-j)*p", parenreduction.pretty(expr));
  }

  @Test
  public void case34() {
    String expr = "(((g*z)/(w-(t^s)))-(b*r))";
    assertEquals("g*z/(w-t^s)-b*r", parenreduction.pretty(expr));
  }

  @Test
  public void case35() {
    String expr = "((q/y)-((c^h)+(v-(x/o))))";
    assertEquals("q/y-(c^h+v-x/o)", parenreduction.pretty(expr));
  }

  @Test
  public void case36() {
    String expr = "(((n+u)+(l-a))-(e-(f/i)))";
    assertEquals("n+u+l-a-(e-f/i)", parenreduction.pretty(expr));
  }

  @Test
  public void case37() {
    String expr = "(m/((((k+d)-((i^x)-w))+a)*s))";
    assertEquals("m/((k+d-(i^x-w)+a)*s)", parenreduction.pretty(expr));
  }

  @Test
  public void case38() {
    String expr = "((d*(e-l))+(u/(v+(j^(f+y)))))";
    assertEquals("d*(e-l)+u/(v+j^(f+y))", parenreduction.pretty(expr));
  }

  @Test
  public void case39() {
    String expr = "((((k/o)-(m-n))^b)+(c*(h*r)))";
    assertEquals("(k/o-(m-n))^b+c*h*r", parenreduction.pretty(expr));
  }

  @Test
  public void case40() {
    String expr = "(((z+((p^q)-t))*(g+((c^w)+i)))-a)";
    assertEquals("(z+p^q-t)*(g+c^w+i)-a", parenreduction.pretty(expr));
  }

  @Test
  public void case41() {
    String expr = "((((m^(u-p))*t)/(n*((b+f)-q)))-e)";
    assertEquals("m^(u-p)*t/(n*(b+f-q))-e", parenreduction.pretty(expr));
  }

  @Test
  public void case42() {
    String expr = "((((v-(y^(h/l)))+(s*d))/(o^x))-k)";
    assertEquals("(v-y^(h/l)+s*d)/o^x-k", parenreduction.pretty(expr));
  }

  @Test
  public void case43() {
    String expr = "((j*g)/(c/((r-w)*(e^(a/((z^t)*s))))))";
    assertEquals("j*g/(c/((r-w)*e^(a/(z^t*s))))", parenreduction.pretty(expr));
  }

  @Test
  public void case44() {
    String expr = "((d+((b^x)*((i+k)-((q-u)+y))))/(m/c))";
    assertEquals("(d+b^x*(i+k-(q-u+y)))/(m/c)", parenreduction.pretty(expr));
  }

  @Test
  public void case45() {
    String expr = "(((z/(((l*o)*g)^(v*r)))/(n*f))-(p^h))";
    assertEquals("z/(l*o*g)^(v*r)/(n*f)-p^h", parenreduction.pretty(expr));
  }

  @Test
  public void case46() {
    String expr = "(a+(((u*(j+z))/(k*((d/n)/((b/x)^i))))-y))";
    assertEquals("a+u*(j+z)/(k*d/n/(b/x)^i)-y", parenreduction.pretty(expr));
  }

  @Test
  public void case47() {
    String expr = "((((g-e)+(r*h))/f)/((m*c)^(l/(v*(w^o)))))";
    assertEquals("(g-e+r*h)/f/(m*c)^(l/(v*w^o))", parenreduction.pretty(expr));
  }

  @Test
  public void case48() {
    String expr = "((((((q*s)/t)-p)*r)-(v^(w-((g+y)*u))))+f)";
    assertEquals("(q*s/t-p)*r-v^(w-(g+y)*u)+f", parenreduction.pretty(expr));
  }

  @Test
  public void case49() {
    String expr = "((((q+(c+k))/((f*a)+(i*(j^d))))*(e-(l-b)))+m)";
    assertEquals("(q+c+k)/(f*a+i*j^d)*(e-(l-b))+m", parenreduction.pretty(expr));
  }

  @Test
  public void case50() {
    String expr = "((((o*n)+((h+t)/s))/((z*x)*(((r-g)*q)-e)))-b)";
    assertEquals("(o*n+(h+t)/s)/(z*x*((r-g)*q-e))-b", parenreduction.pretty(expr));
  }

  @Test
  public void case51() {
    String expr = "(((((((d/k)+(f^a))*(x^(o-c)))+(s+u))^y)^b)*z)";
    assertEquals("(((d/k+f^a)*x^(o-c)+s+u)^y)^b*z", parenreduction.pretty(expr));
  }

  @Test
  public void case52() {
    String expr = "((p^(((q-a)-(v-w))*j))-((((m-t)^((i/l)^d))*o)^u))";
    assertEquals("p^((q-a-(v-w))*j)-((m-t)^(i/l)^d*o)^u", parenreduction.pretty(expr));
  }

  @Test
  public void case53() {
    String expr = "((e/(j-r))/(f-(z/((y-(s*w))^((i*h)-(u/(m^g)))))))";
    assertEquals("e/(j-r)/(f-z/(y-s*w)^(i*h-u/m^g))", parenreduction.pretty(expr));
  }

  @Test
  public void case54() {
    String expr = "((q*v)*((((a/(b+n))-(t/k))/((c/x)*(p+(h-j))))-s))";
    assertEquals("q*v*((a/(b+n)-t/k)/(c/x*(p+h-j))-s)", parenreduction.pretty(expr));
  }

  @Test
  public void case55() {
    String expr = "(((n+(u+j))+y)*((((t-k)-r)*(d-((g-f)*q)))*(c/i)))";
    assertEquals("(n+u+j+y)*(t-k-r)*(d-(g-f)*q)*c/i", parenreduction.pretty(expr));
  }

  @Test
  public void case56() {
    String expr = "((((v+w)-(x+z))+(a-(l*o)))^(e*(((p+m)^(h+b))*s)))";
    assertEquals("(v+w-(x+z)+a-l*o)^(e*(p+m)^(h+b)*s)", parenreduction.pretty(expr));
  }

  @Test
  public void case57() {
    String expr = "((((z-y)+x)-n)+(p/((r^c)^((((o-q)*g)-a)^(d-b)))))";
    assertEquals("z-y+x-n+p/(r^c)^((o-q)*g-a)^(d-b)", parenreduction.pretty(expr));
  }

  @Test
  public void case58() {
    String expr = "((((s^(h-j))-i)^t)^((((m/f)+((e^w)^l))*k)^(u+v)))";
    assertEquals("((s^(h-j)-i)^t)^((m/f+(e^w)^l)*k)^(u+v)", parenreduction.pretty(expr));
  }

  @Test
  public void case59() {
    String expr = "(((y/f)+((d^((((s-o)-v)-z)/h))^k))+(p+(w*(b^q))))";
    assertEquals("y/f+(d^((s-o-v-z)/h))^k+p+w*b^q", parenreduction.pretty(expr));
  }

  @Test
  public void case60() {
    String expr = "(((a*i)*(x/(m/(l+r))))*(((c/g)/(j^(t-(n-u))))-e))";
    assertEquals("a*i*x/(m/(l+r))*(c/g/j^(t-(n-u))-e)", parenreduction.pretty(expr));
  }

  @Test
  public void case61() {
    String expr = "((a*q)+(((((((r/k)-h)-u)-(n/e))-o)/(l-v))-(c-s)))";
    assertEquals("a*q+(r/k-h-u-n/e-o)/(l-v)-(c-s)", parenreduction.pretty(expr));
  }

  @Test
  public void case62() {
    String expr = "(((b+f)*((t*((g+m)^p))^(((j+x)*(i^y))*w)))-(d^z))";
    assertEquals("(b+f)*(t*(g+m)^p)^((j+x)*i^y*w)-d^z", parenreduction.pretty(expr));
  }

  @Test
  public void case63() {
    String expr = "(((f/g)+c)/(h*((e*a)-(((u/p)+(k+n))+(i^(o^y))))))";
    assertEquals("(f/g+c)/(h*(e*a-(u/p+k+n+i^o^y)))", parenreduction.pretty(expr));
  }

  @Test
  public void case64() {
    String expr = "(((((d+z)*m)/j)-((t*w)-(v/(s-(r/l)))))^((x*q)^b))";
    assertEquals("((d+z)*m/j-(t*w-v/(s-r/l)))^(x*q)^b", parenreduction.pretty(expr));
  }

  @Test
  public void case65() {
    String expr = "((k*((m+(v+s))*(x^g)))^((w*(d-(b/((c-t)-u))))/n))";
    assertEquals("(k*(m+v+s)*x^g)^(w*(d-b/(c-t-u))/n)", parenreduction.pretty(expr));
  }

  @Test
  public void case66() {
    String expr = "((((p+r)-(h+l))*(f-q))*((e-i)*(((y+o)^z)-(j*a))))";
    assertEquals("(p+r-(h+l))*(f-q)*(e-i)*((y+o)^z-j*a)", parenreduction.pretty(expr));
  }

  @Test
  public void case67() {
    String expr = "((((((k^p)^y)+x)+(a+(b^h)))+((u*o)/f))*((j/e)^m))";
    assertEquals("((k^p)^y+x+a+b^h+u*o/f)*(j/e)^m", parenreduction.pretty(expr));
  }

  @Test
  public void case68() {
    String expr = "((((z/g)^(r-(q+l)))^v)+((s/d)*(((c+i)+t)+(w-n))))";
    assertEquals("((z/g)^(r-(q+l)))^v+s/d*(c+i+t+w-n)", parenreduction.pretty(expr));
  }

  @Test
  public void case69() {
    String expr = "(b/((r^((x+u)^(t-l)))/((((a-w)-(d^e))-o)+(z*h))))";
    assertEquals("b/(r^(x+u)^(t-l)/(a-w-d^e-o+z*h))", parenreduction.pretty(expr));
  }

  @Test
  public void case70() {
    String expr = "x";
    assertEquals("x", parenreduction.pretty(expr));
  }

  @Test
  public void case71() {
    String expr = "(((((t-(k/(o*m)))*(c*f))*((n/j)+(v-z)))^l)/(x-h))";
    assertEquals("((t-k/(o*m))*c*f*(n/j+v-z))^l/(x-h)", parenreduction.pretty(expr));
  }

  @Test
  public void case72() {
    String expr = "(((a-(b-c))-d)^((e/f)/(g/h)))";
    assertEquals("(a-(b-c)-d)^(e/f/(g/h))", parenreduction.pretty(expr));
  }

}
