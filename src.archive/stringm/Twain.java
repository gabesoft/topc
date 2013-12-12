package topc.stringm;

import java.util.*;
import java.io.*;
import java.text.*;

// SRM 169 Division II Level Two - 500
// string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1876&rd=4650
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm169
public class Twain {
  public String getNewSpelling(int year, String phrase) {
    String res = phrase;
    res = year > 0 ? year1(res) : res;
    res = year > 1 ? year2(res) : res;
    res = year > 2 ? year3(res) : res;
    res = year > 3 ? year4(res) : res;
    res = year > 4 ? year5(res) : res;
    res = year > 5 ? year6(res) : res;
    res = year > 6 ? year7(res) : res;
    return res;
  }

  String year1(String input) {
    return input
      .replaceAll("^x", "z")
      .replaceAll("\\sx", " z")
      .replace("x", "ks");
  }

  String year2(String input) {
    return input
      .replace("y", "i");
  }

  String year3(String input) {
    return input
      .replace("ce", "se")
      .replace("ci", "si");
  }

  String year4(String input) {
    return input
      .replaceAll("c+k", "k");
  }

  String year5(String input) {
    return input
      .replaceAll("^sch", "sk")
      .replaceAll("\\ssch", " sk")
      .replace("chr", "kr")
      .replace("ch", "#h")
      .replace("c", "k")
      .replace("#h", "ch");
  }

  String year6(String input) {
    return input
      .replaceAll("^kn", "n")
      .replaceAll("\\skn", " n");
  }

  String year7(String input) {
    String cons = "bcdfghjklmnpqrstvwxyz";
    for (int i = 0; i < cons.length(); i++) {
      String pat = String.format("(%s)+", cons.charAt(i));
      input = input.replaceAll(pat, "$1");
    }
    return input;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
