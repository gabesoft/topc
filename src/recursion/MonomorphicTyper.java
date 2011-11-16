package topc.recursion;

import java.util.*;
import java.io.*;
import java.util.regex.*;

// SRM 286 Division II Level Three - 1000
// recursion, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5898&rd=8083
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm286
public class MonomorphicTyper {
  public String infer(String expression, String[] definitions) {
    HashMap<String, Defn> defs = new HashMap<String, Defn>();

    for (int i = 0; i < definitions.length; i++) {
      Defn d = parseDefn(definitions[i]);
      defs.put(d.name, d);
    }

    return parseExpr(expression).type(defs);
  }

  Expr parseExpr(String input) {
    if (input.indexOf('(') > -1) {
      return parseFunct(input);
    } else {
      return parseConst(input);
    }
  }

  Const parseConst(String input) {
    Pattern pat = Pattern.compile("^[a-zA-Z]+$");
    Matcher mat = pat.matcher(input);
    mat.find();
    return new Const("c_" + mat.group());
  }

  Funct parseFunct(String input) {
    Pattern pat = Pattern.compile("^([a-zA-Z]+)\\((.*)\\)$");
    Matcher mat = pat.matcher(input);

    mat.find();

    String name = mat.group(1);
    String args = mat.group(2);

    int count = 0;
    String curr = "";
    List<Expr> parsedArgs = new ArrayList<Expr>();
    for (int i = 0; i < args.length(); i++) {
      char c = args.charAt(i);

      if (c == '(') { count++; }
      if (c == ')') { count--; }

      if (c == ',' && count == 0) { 
        parsedArgs.add(parseExpr(curr));
        curr = "";
      } else {
        curr += c;
      }
    }

    parsedArgs.add(parseExpr(curr));

    return new Funct("f_" + name, (Expr[])parsedArgs.toArray(new Expr[0]));
  }

  Defn parseDefn(String input) {
    String[] parts = input.split(":");
    String[] expr = parts[0].split("\\(|\\)|,");
    String[] args = expr.length > 1 ? new String[expr.length - 1] : new String[0];

    for (int i = 1; i < expr.length; i++) {
      args[i - 1] = expr[i];
    }

    return new Defn((args.length == 0 ? "c_" : "f_") + expr[0], parts[1], args);
  }

  void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}

abstract class Expr {
  public final String name;

  protected Expr(String name) {
    this.name = name;
  }

  public abstract String type(HashMap<String, Defn> types);
}

class Const extends Expr {
  public Const(String name) {
    super(name);
  }

  public String type(HashMap<String, Defn> types) {
    return types.containsKey(name) ? types.get(name).type : "";
  }

  public String toString() {
    return String.format("%s", name);
  }
}

class Funct extends Expr {
  public final Expr[] args;

  public Funct(String name, Expr[] args) {
    super(name);
    this.args = args;
  }

  public String type(HashMap<String, Defn> types) {
    if (!types.containsKey(name)) { return ""; }

    Defn fdef = types.get(name);

    if (fdef.args.length != args.length) { return ""; }

    for (int i = 0; i < fdef.args.length; i++) {
      String atype = args[i].type(types);
      if (!fdef.args[i].equals(atype)) {
        return "";
      }
    }

    return fdef.type;
  }

  public String toString() {
    return String.format("%s(%s)", name, Arrays.toString(args));
  }
}

class Defn {
  public final String name;
  public final String type;
  public final String[] args;

  public Defn(String name, String type, String[] args) {
    this.name = name;
    this.type = type;
    this.args = args;
  }
}

