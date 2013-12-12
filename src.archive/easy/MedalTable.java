package topc.easy;

import java.util.*;

// SRM 209 Div 1 : 300
public class MedalTable {
  public String[] generate(String[] results) {
    HashMap<String, Country> map = new HashMap<String, Country>();
    for (int i = 0; i < results.length; i++) {
      String[] items = results[i].split(" ");
      String g = items[0];
      String s = items[1];
      String b = items[2];
      if (!map.containsKey(g)) { map.put(g, this.new Country(g)); }
      if (!map.containsKey(s)) { map.put(s, this.new Country(s)); }
      if (!map.containsKey(b)) { map.put(b, this.new Country(b)); }
      map.get(g).addg();
      map.get(s).adds();
      map.get(b).addb();
    }
    Object[] items = map.values().toArray();
    Arrays.sort(items);
    String[] output = new String[items.length];
    for (int i = 0; i < items.length; i++) {
      output[i] = items[i].toString();
    }
    return output;
  }

  private class Country implements Comparable<Country>{
    int _g;
    int _s;
    int _b;
    String _name;

    public Country(String name) {
      _name = name;
    }

    public void addg() { _g++; }
    public void adds() { _s++; }
    public void addb() { _b++; }
    public String getName() { return _name; }
    public String toString() {
      return String.format("%s %d %d %d", _name, _g, _s, _b);
    }
    public int compareTo(Country other) {
      if (_g != other._g) { return other._g > _g ? 1 : -1; }
      if (_s != other._s) { return other._s > _s ? 1 : -1; }
      if (_b != other._b) { return other._b > _b ? 1 : -1; }
      return _name.compareTo(other._name);
    }
  }
}
