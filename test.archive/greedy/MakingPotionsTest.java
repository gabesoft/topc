package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class MakingPotionsTest {
  MakingPotions makingpotions = new MakingPotions();

  @Test
  public void case1() {
    String[] marketGoods = { "LOVE", "WATER", "HONEY" };
    int[] cost = { 100, 1, 30 };
    String[] recipes = { "LOVE=5WATER+3HONEY" };
    assertEquals(95, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case2() {
    String[] marketGoods = { "WATER", "HONEY", "HOP" };
    int[] cost = { 2, 6, 9 };
    String[] recipes = { "LOVE=2WATER+4HONEY+2BEER", "BEER=1HOP+3WATER+1HOP" };
    assertEquals(76, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case3() {
    String[] marketGoods = { "ORANGEJUICE", "APPLEJUICE" };
    int[] cost = { 6, 4 };
    String[] recipes = { "JUICEMIX=1ORANGEJUICE+1APPLEJUICE" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case4() {
    String[] marketGoods = { "WATER", "HONEY", "HOP" };
    int[] cost = { 1, 22, 17 };
    String[] recipes = { "LOVE=7WATER+3HONEY", "LOVE=2HONEY+2HOP" };
    assertEquals(73, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case5() {
    String[] marketGoods = { "OIL", "WATER" };
    int[] cost = { 60, 70 };
    String[] recipes = { "FIRSTPOTION=1OIL+1SECONDPOTION", "SECONDPOTION=4WATER+1FIRSTPOTION", "LOVE=1FIRSTPOTION+1SECONDPOTION" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case6() {
    String[] marketGoods = { "HONEYBIT" };
    int[] cost = { 100 };
    String[] recipes = { "LOVE=6HONEYMEGABYTE", "HONEYMEGABYTE=2HONEYFIFTYTWELVEKBYTES", "HONEYFIFTYTWELVEKBYTES=8HONEYSIXTYFOURKBYTES", "HONEYSIXTYFOURKBYTES=8HONEYEIGHTKBYTES", "HONEYEIGHTKBYTES=8HONEYKBYTE", "HONEYKBYTE=2EIGHTBYEIGHTWORDS", "EIGHTBYEIGHTWORDS=8EIGHTWORDS", "EIGHTWORDS=8HONEYWORD", "HONEYWORD=8HONEYBYTE", "HONEYBYTE=8HONEYBIT" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case7() {
    String[] marketGoods = { "ZINC", "PLATINUM", "TITANIUM" };
    int[] cost = { 3, 100, 10 };
    String[] recipes = { "PLATINUM=6ZINC+1TITANIUM", "LOVE=1PLATINUM+1ZINC" };
    assertEquals(31, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case8() {
    String[] marketGoods = { "QLQ", "TLL", "TEY", "NXH", "JLQ", "FMA" };
    int[] cost = { 59, 44, 36, 14, 20, 79 };
    String[] recipes = { "LOVE=6TLL+3NXH", "WHU=1WHU+4QLQ+9QLQ+2TEY+8QLQ", "DHD=8LAM+2DHD+3WHU+9QLQ+4JHL+8FDX+3JHL+3FDX", "TLL=7PRM+4LAM+4PRM+8ERT+6TLL", "FMA=7RKK+6FDX+2FMA", "FDX=8TEY+5ERT" };
    assertEquals(306, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case9() {
    String[] marketGoods = { "OH", "IG", "MN", "VR", "EA", "CV", "YI", "CI", "IH", "BY" };
    int[] cost = { 79, 85, 53, 34, 49, 56, 60, 75, 89, 74 };
    String[] recipes = { "IG=7IH+3IH+3MN+4YI+3IG+9VR+3VR+9CI+8CV", "BY=8EA+4QG+5WE+9UJ", "BY=5CI+9EA+4YI+2BY+4WE+4YI+7QE+3EA+7BY", "QE=7VR+9IH", "LOVE=9BY+4IG+1MN", "CI=8KN+8KN+1OH", "BY=9MN+5MN+4IG+3MN+1IH+6UJ+6QG+5VR", "MN=6IH+3IH+8YI+3YI+1BY+1QE", "WE=9CI+7YI+4QE+9EA+2CV+1IH+1CI+6YI+9KN+8EA", "UJ=9WE+7MN+8YI+4UJ+6KN+4CV", "QG=3KN", "EA=6MN", "VR=7KN+7MN+4CI+5UJ+7BY", "CI=6QE+7QG+1KN+2IH+7MN+8BY+6EA+8CI+9YI", "EA=9QE+7QE+6CI", "KN=1KN+2CV+9UJ+4KN+7VR+3BY+5OH+6EA+7WE", "YI=8QE+6BY+2OH+2KN", "QG=7MN+1QG+8EA+5WE+6KN+4MN", "VR=7QE+4IH+5VR", "CV=3EA+9KN+4IG+8EA+3UJ+2CI+6QG+4WE+9IG+5EA", "IG=9WE+2OH" };
    assertEquals(1059, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case10() {
    String[] marketGoods = { "SE", "VB", "GZ", "VZ", "JI", "EJ", "OI", "VK" };
    int[] cost = { 45, 25, 10, 51, 19, 74, 82, 68 };
    String[] recipes = { "VK=4EN+6GZ+8IG", "EN=3VZ", "IG=8VZ+2GZ", "JZ=7IG+9SE+2VZ+4EN+1EJ", "VZ=8VB", "VK=1GZ+6SE+5VK+7JZ+8EJ", "SE=4JI+6VB+9VB+4HB+8EN", "EN=3HB+8VB+3EJ+1GZ+8VB", "IG=1IG+2EN+7JI+1GZ+5EJ", "VB=6HB+9VK+2VB+1HB+9VK", "VB=2JZ+4OI+3GZ+4HB+8JI", "GZ=8OI+5VZ+5HB+2VZ+9EJ", "GZ=1EJ+1JI+2HB+4JZ+9JZ", "GZ=5JI+1VZ", "EN=7OI+5VZ+6HB+6GZ+6JI", "GZ=9GZ+5EJ+2HB+6HB+2JI", "GZ=7JI+7HB+7HB+9JZ+4JZ", "IG=1EJ+3SE+4VB+4HB+3EN", "LOVE=2EN+2JZ+3GZ", "IG=4VB+8SE+4GZ+4JI+4GZ", "VB=1VK+2VK+3JI+6JZ+7OI", "VK=3HB+8JZ+2EJ+3SE+7GZ", "SE=8OI+5SE+2HB+8JI+3EN", "JZ=6EN+7EJ+1IG+9EJ+4VZ", "IG=2EJ+4VB+6VB", "VK=1VZ+7SE+6VZ+5JI+3JZ", "VZ=5HB+1EJ" };
    assertEquals(5744, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case11() {
    String[] marketGoods = { "UK", "JU", "ZP", "EU", "AT", "ZF", "WO", "DZ", "YF", "IC", "EY", "WD", "HK", "PJ", "ZR", "IU", "QX", "HX", "ZD", "PV" };
    int[] cost = { 59, 17, 17, 55, 29, 4, 54, 42, 44, 22, 41, 41, 56, 45, 96, 53, 62, 50, 65, 64 };
    String[] recipes = { "TM=9EY+5WD+3IC", "WO=8NC+2IU+6EU+6SZ", "LOVE=9ZF+2YF+4TM+4ZD", "HX=2QH+6UK+5NC", "OM=7ZR+3EY+4ZP+5NC", "GK=3MA", "UC=6IC+5GK+5OM", "DZ=4YF+9EU+5QX+3JH+9HK", "FH=8ZR+3ZF+2ZF+6TM+7OM", "WD=2OM+5ZP+5NW+4IB+1ZY" };
    assertEquals(2944, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case12() {
    String[] marketGoods = { "ZU", "MK", "LA", "DD", "QH", "QW", "AN" };
    int[] cost = { 6, 57, 20, 99, 25, 50, 40 };
    String[] recipes = { "MK=2QH+3QH+4BA", "TO=6AN", "LOVE=7MK+6TO+2AN+1MK+1TO", "QY=9QH+1ZU+3FV+9ZS+1TO", "TO=4TO+7KL+5QH+6EP+9QW", "KL=7ZU+7FV", "QH=2KL+9EP+3QH+9OM+2ZU", "EP=7DD+7AN+1MK+6KL+4ZS", "ZS=1OM", "OM=1KL+2OM+1LA+3BA+3KL", "FV=1TO+8QH+7MK+2TO+9QW", "FV=8QW+9FV+2OM", "ZS=8FV+4ZS+1QH", "LA=7QW+2MK+7EP+5ZS+7QW", "MK=8KL+2MK+2OM", "AN=5FV+1QY+8FV+3KL", "QW=7ZS+8BA+4OM+2MK+5ZU", "MK=8TO+2AN+3AN+8KL+1DD", "AN=5QY+4KL+2FV+2QY+9FV", "ZS=2FV+9BA+3ZU+9AN+8ZU", "DD=1LA+9FV+6KL+5OM+2DD", "TO=5QH+6QW+3AN+1ZS+7DD", "ZU=5ZU+1MK+3MK", "AN=3LA+9BA+7QY+8QY+2KL", "OM=9TO+3BA+5TO+7BA+7ZU", "BA=9TO+6KL+5TO", "LOVE=1BA+7KL+7BA", "QH=9OM", "EP=3ZS+2OM+6AN+6BA+1QY", "ZS=5QH+4OM+9OM", "MK=3BA+6DD+3OM+4OM+5DD", "QW=1OM+1QW+6QY+6ZU+6QH", "ZS=2QH+7ZU+7ZU+3AN", "BA=2BA+8QH+6LA+5QY+8FV", "QH=6ZU+1EP+8DD+3AN+1LA", "KL=9QW+1FV+2FV+2LA+8ZU", "BA=9TO+8TO+1QY+5FV+9DD", "BA=3QY+6DD+1QH+3LA+2QY", "QW=4QY+7QY", "AN=7QW+9KL+6ZU+3OM+3LA" };
    assertEquals(2216, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case13() {
    String[] marketGoods = { "EN", "FL", "FU", "WT", "HG", "WP" };
    int[] cost = { 5, 7, 5, 10, 5, 3 };
    String[] recipes = { "EC=4HG+6WP+2HG", "KS=4WP+3EN", "LOVE=7EC+3HG+6KS+7WP", "NB=5KS+2HG+1FP+9IN+3FL", "BD=2PU+6EN+6IN+6FU+5EN", "WP=2FL+7NB+7BD+4PU+8WP", "IN=7FL+8CU+1FP+7EN+1VK", "FU=2FU", "KS=1FL+3AO+5EC+6HG+5AC", "AC=3WP+1CU+6NB+1NB+4AO", "VK=8FP", "BD=6NB+3FP+7IN+9FP+4CU", "FL=8HG", "AC=9WP", "FL=9FU+5BD+4FL+1AO+7BD", "EN=3WT+8CU+4NB+8NB+2AO", "NB=4PU+4CU+7PU", "HG=2WT+7FU+3EN+7PU+2IN", "WP=5NB+3FP+8BD+5IN", "LOVE=6FL+4VK+6EC+5KS+1EC", "FL=6PU+2AO+1EN+7AC+2FU", "BD=7KS+6KS+6AC+2KS+8FP", "IN=9IN+1FU", "KS=7HG+1AC+5IN+9CU+6FL", "AO=2VK+5CU+7FU+5WP", "AO=4BD+7FP+5BD+3WT", "FU=1FP+1WT+6EN+6EC+6FP", "FP=4FP+4WT+6EN", "WP=6FL+8BD+2FL+7FP+9HG", "WP=5WT+4HG+4VK+9EN+8HG", "LOVE=6AO+2FL+1BD+4VK+9FP" };
    assertEquals(534, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case14() {
    String[] marketGoods = { "A", "B", "C" };
    int[] cost = { 8, 5, 6 };
    String[] recipes = { "LOVE=2D+3C", "LOVE=2E+2B+1A", "D=2E+1A+2R", "E=1D+1A+1B", "E=2C+2B+1A", "R=1E+9D" };
    assertEquals(78, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case15() {
    String[] marketGoods = { "VD", "WR", "HP", "XN", "CB", "SR", "MQ", "YS", "CI", "BA", "CF", "GV", "TO", "LX", "KU", "YL", "TW", "XU", "TF", "A", "B", "C" };
    int[] cost = { 18, 11, 13, 6, 7, 8, 15, 13, 7, 14, 7, 5, 7, 10, 7, 20, 1, 16, 1, 85, 50, 61 };
    String[] recipes = { "TO=2VO+3CI+3VO+1NL+2TO", "MQ=3XU+1VO+3XU+3LX+2AY", "AY=3XN+1XU+1KU+3BA", "HP=3GV+1AY+2OC+2CF+3XN", "YS=3CI+2XN+2CF+3BA", "TF=2MQ+3HP+3HP+2XN+2TO", "MQ=1NL+3TO+1AY+3HP", "YS=1YL", "WR=2YL+3YS+3NL+3TO+2BA", "TF=1VO+1NL+2AY+1OC+2NL", "HP=3BA+1YS+2OC+1CB+3TO", "TF=1GV+1XN+1CI+3YL+3CB", "LOVE=1CF+3AY+1WR+3AY+2TO", "HP=3VD+2KU+1GV+3CI", "VO=2GV+2LX+2WR+1YL+3VO", "OC=3VD+1XU+2CI+2CI+1NL", "LX=3SR+1KU+2TF+2YS+2WR", "WR=1YS+2YL+1NL+1KU", "XU=2CI+1CB", "NL=1NL+2CF+2CF+1LX", "KU=2BA+3CF+2NL+2CF", "CF=2LX", "XN=3VO+3XN+3NL+3GV+1CB", "VD=1XU+2TO", "XN=3OC+1TO+1TO+1SR+2CF", "LOVE=2D+3C", "LOVE=2E+2B+1A", "D=2E+1A+2R", "E=1D+1A+1B", "E=2C+2B+1A", "R=1E+9D" };
    assertEquals(530, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case16() {
    String[] marketGoods = { "RMI", "BMX", "NHU", "SSX", "SIN", "GIN", "INN", "WAY", "DBD", "VAN", "MIR", "RMB", "HZH" };
    int[] cost = { 20, 1, 5, 9, 18, 30, 29, 13, 36, 17, 14, 25, 17 };
    String[] recipes = { "OCF=2VAN+1LBX+1HZH+2OHC+3TZS", "MIR=3TZS", "HZH=3DBD+1EUL+2DFK+3DBD+3GIN", "WAY=1DFK+3BMX+2NHU+3CTD", "DFK=1GIN+3GIN", "WAY=2SIN+3DBD+1HZH+3PFQ+3DBD+2OCF+1INN", "GIN=2VAN+1ADR+2GIN+3MGO+3PFQ+2RMI+1PFQ", "SIN=3RMB+1QIA+2RMB+2RMI+3MGO", "LOVE=3HZP+1HZH+2INN+1DFK+3RMB+3HZP+2OCF", "INN=2TZS+1ADR", "DBD=3OCF+2LBX+3OHC+3GIN", "OHC=3SSX+1DFK+3OHC+1CTD+1RMB", "QIA=1MIR+2DBD+2INN+1MGO+3OCF+2HZH+2ADR", "HZP=2QIA+2HZP+1INN+1HZH+1CKQ+3HZH+1CTD", "HZP=2RMI+1PFQ+1OHC+2GIN", "EUL=3CKQ+1MNC+1RMB+2DFK", "OCF=1LBX+2MIR+3BMX+1OCF+3LBX+1OHC+2LBX", "HZP=2HZH+3WAY", "OCF=3INN+2HZH+1HZP", "NHU=1HZH+3SIN+1CTD+3OCF", "EUL=3VAN+3MIR+2EUL", "INN=1SIN+2DBD", "SIN=2CKQ", "RMB=1RMB+2DFK+2SSX+2RMI", "OCF=3RMI" };
    assertEquals(828, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case17() {
    String[] marketGoods = { "A", "B", "C", "D", "E" };
    int[] cost = { 15, 50, 31, 21, 51 };
    String[] recipes = { "LOVE=1XA+3XB+9XC+3XD+5XE+1XF+3XR", "LOVE=9E+9B+9A+1XR+1XD+5XH", "LOVE=1A+1B+1C+1D+1E+9XX", "LOVE=4A+7B+2XG+6XH+6XI", "LOVE=4C+8XX+2XR+1XC+6XA+2XR+7XJ", "LOVE=1XL+2XK+2XL+2XN+2XN+5XM+7XE", "XA=1A+1B+8XR", "XB=3B+5E+6XC", "XC=1XA+5B+1XD", "XD=2XA+9A", "XE=1XF+1XG+1XH+1XI+1XJ", "XF=7C+2B", "XG=1XR+5D+1XA", "XH=6XI", "XI=6C+1A+2C+9XJ", "XJ=2A+2E+6XF+1XR", "XK=2A+6C+6XM", "XL=5A+2B+1XK", "XM=1C+1D+3E", "XN=2XR+1A", "XR=2A+1XQ+4XK+2XQ+2XP+4E", "XR=1B+1XQ+2C+6XS+2XQ+1E", "XR=7A+2D+2XS+1XQ+5XP+4XT", "XR=5C+1XT+1XP+2XQ+3XS+2XT+2A+3B", "XR=1A+1B+1E+1XP+2XQ+6XS+1XQ", "XR=1XS+9XP+9XP+8XP+2XT", "XP=4A+2XS+6D", "XP=1XS+9E+1XQ", "XP=2XS+9E+1XT", "XQ=1E+5D+1XT", "XQ=1XS+2XT+2E+1XT", "XS=2A+5B+7XT", "XS=6B+9C+9C", "XT=1A+1B+1D", "XX=4A+6XS+2XA+1XT+1XY", "XX=5XY+6E+2XB", "XX=1XA+1XB+2XC+6XE+7XT+1XR+7XZ", "XY=1XX+1XZ", "XY=1XA+5A+7XR+7XT+1XZ", "XZ=6XY+1XG+1D+1XF" };
    assertEquals(2053649, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case18() {
    String[] marketGoods = { "A", "D", "B", "C" };
    int[] cost = { 5, 12, 8, 4 };
    String[] recipes = { "LOVE=1E+2D+3C+1A+2B", "LOVE=7C+2A+1F", "E=3C+1D+2A+1F", "F=4D+2B+1E" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case19() {
    String[] marketGoods = { "A", "D", "B", "C" };
    int[] cost = { 5, 12, 8, 4 };
    String[] recipes = { "LOVE=1E+2D+3C+1A+2B", "LOVE=7C+5A+9B+2A+1F", "E=3C+1D+2A+1F", "F=4D+2B+1E", "F=7C+6D+2A+1B" };
    assertEquals(209, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case20() {
    String[] marketGoods = { "A", "D", "B", "C" };
    int[] cost = { 5, 12, 8, 4 };
    String[] recipes = { "LOVE=1E+2D+3C+1A+2B", "LOVE=7C+5A+9B+2A+1F", "E=3C+1D+2A+1F", "F=3D+2B+1E", "E=7C+4D+1A+1B" };
    assertEquals(146, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case21() {
    String[] marketGoods = { "A", "B", "C", "D" };
    int[] cost = { 25, 12, 89, 19 };
    String[] recipes = { "LOVE=1A+2B+3C+1E+1Z", "E=3A+2B+1F", "F=3D+2B+1G", "G=3A+2E+1H+1I", "H=7B+2E+1I", "I=7C+1J", "J=2C+1K+2C+2K", "K=2B+1A+6D+1L", "L=1O+2C+2D+2A+1M", "M=2N", "N=1O+1O+1O+2B+1D", "O=4A+2B+3C+1P", "P=6D+1C+2Q", "Q=1D+2C+6R", "R=2A+3E", "Z=4R+3B", "Z=1O+2D" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case22() {
    String[] marketGoods = { "A", "B", "C", "D" };
    int[] cost = { 25, 12, 89, 19 };
    String[] recipes = { "LOVE=1A+2B+3C+1E+1Z", "E=3A+2B+1F", "F=3D+2B+1G", "G=3A+2D+1H+1I", "H=7B+2D+1I", "I=7C+1J", "J=2C+1K+2C+2K", "K=2B+1A+6D+1L", "L=1O+2C+2D+2A+1M", "M=2N", "N=1O+1O+1O+2B+1D", "O=4A+2B+3C+1A", "P=6D+1C+2Q", "Q=1D+2C+6R", "R=2A+3E", "Z=4R+3B", "Z=1F+2D" };
    assertEquals(46125, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case23() {
    String[] marketGoods = { "A", "B", "C", "D" };
    int[] cost = { 25, 12, 89, 19 };
    String[] recipes = { "LOVE=1A+2B+3C+1E+1Z", "E=3A+2B+1F", "F=3D+2B+1G", "G=3A+2D+1H+1I", "H=7B+2D+1I", "I=7C+1J", "J=2C+1K+2C+2K", "K=2B+1A+6D+1L", "L=1O+2C+2D+2A+1M", "M=2N", "N=1O+1O+1O+2B+1D", "O=4A+2B+3C+1P", "P=6D+1C+2Q", "Q=1D+2C+6R", "R=2A+3E", "Z=4R+3B", "Z=1F+2D" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case24() {
    String[] marketGoods = { "DEIX", "REX", "CEX", "ASKDGQNOIDQ", "GR", "AUXX" };
    int[] cost = { 100, 100, 96, 91, 99, 73 };
    String[] recipes = { "LOVE=1DEIX+2REX+3CEX+1E+1Z+9GL+9GM+9GN+8GN+9AUX", "AUXXX=9AUXX", "AUX=9AUXX+9AUXX+9AUXX+9AUXXX", "E=3DEIX+2REX+1F", "F=3ASKDGQNOIDQ+2REX+1G", "G=3DEIX+2ASKDGQNOIDQ+1H+1I", "H=7REX+2ASKDGQNOIDQ+1I", "I=7CEX+1J", "GL=9GM", "GM=9GN", "GN=9GO", "GO=9GP", "GP=6GR", "J=9CEX+9K+2CEX+2K", "K=6REX+9DEIX+6ASKDGQNOIDQ+1L", "L=1O+2CEX+9ASKDGQNOIDQ+2DEIX+1M", "M=6N", "N=1O+7O+1O+2REX+1DEIX", "O=4DEIX+2REX+9Y+3CEX+9Y+3Y", "P=6ASKDGQNOIDQ+1CEX+2Q", "Q=1ASKDGQNOIDQ+2CEX+6R", "R=2DEIX+3E", "Z=4R+3REX", "Z=1F+2CEX", "Y=1Z+1DEIX", "Y=2E+4R", "Y=1E+1F+1G+1H+1I+1J+3K", "Y=1X+1Z+1G+3CEX+1I+1J+3K", "Y=1X+9CEX+2X+5REX+8X", "X=6REX+1CEX+1DEIX+2REX+1CEX+1DEIX+2REX+1CEX+1DEIX" };
    assertEquals(999286808, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case25() {
    String[] marketGoods = { "DEIX", "REX", "CEX", "ASKDGQNOIDQ", "GR", "AUXX", "SQIO", "SQIR" };
    int[] cost = { 100, 100, 97, 91, 99, 75, 77, 49 };
    String[] recipes = { "LOVE=6DEIX+9REX+7CEX+1E+1Z+9GL+4GM+9AUX+9AUXXX+4GN", "AUXXX=9AUXX", "AUX=6AUXX+9AUXX+9AUXX+9AUXXX", "E=3DEIX+2REX+1F", "F=3ASKDGQNOIDQ+2REX+1G", "G=3DEIX+2ASKDGQNOIDQ+1H+1I", "H=7REX+2ASKDGQNOIDQ+1I", "I=7CEX+1J", "GL=9GM", "GM=9GN", "GN=9GO", "GO=9GP+1CEX", "GP=6GR", "J=9CEX+9K+2CEX+2K", "K=6REX+9DEIX+6ASKDGQNOIDQ+1L", "L=1O+2CEX+9ASKDGQNOIDQ+2DEIX+1M", "M=6N", "N=1O+7O+1O+2REX+1DEIX", "O=4DEIX+2REX+9Y+3CEX+9Y+3Y", "P=6ASKDGQNOIDQ+1CEX+2Q", "Q=1ASKDGQNOIDQ+2CEX+6R", "R=2DEIX+3E", "Z=1R+3REX", "Z=1F+2CEX+1SQIO+2SQIR", "Y=1Z+1DEIX", "Y=2E+4R", "Y=1E+1F+1G+1H+1I+1J+3K", "Y=1X+1Z+1G+3CEX+1I+1J+3K", "Y=1X+9CEX+2X+5REX+8X", "X=6REX+1CEX+1DEIX+2REX+1CEX+1DEIX+2REX+1CEX+1DEIX" };
    assertEquals(999317155, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case26() {
    String[] marketGoods = { "PLATINUM" };
    int[] cost = { 50 };
    String[] recipes = { "LOVE=9SILVER", "SILVER=9BRONZE", "BRONZE=9COPPER", "COPPER=9IRON", "IRON=9ZINC", "ZINC=9TITANIUM", "TITANIUM=9ALUMINIUM", "ALUMINIUM=9PLATINUM" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case27() {
    String[] marketGoods = { "PLATINUM" };
    int[] cost = { 18 };
    String[] recipes = { "LOVE=9SILVER", "SILVER=9BRONZE", "BRONZE=9COPPER", "COPPER=9IRON", "IRON=9ZINC", "ZINC=9TITANIUM", "TITANIUM=9ALUMINIUM", "ALUMINIUM=9PLATINU", "PLATINU=9PLATINUM+1IRON" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case28() {
    String[] marketGoods = { "PLATINUM" };
    int[] cost = { 18 };
    String[] recipes = { "LOVE=9SILVER", "SILVER=9BRONZE", "BRONZE=9COPPER", "COPPER=9IRON", "IRON=9ZINC", "ZINC=9TITANIUM", "TITANIUM=9ALUMINIUM", "ALUMINIUM=9PLATINU", "PLATINU=9PLATINUM", "FERRARI=3AUDI", "AUDI=9AUDIO", "AUDIO=1FFF", "FFF=1FERRARI" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case29() {
    String[] marketGoods = { "F", "T", "Y", "S" };
    int[] cost = { 18, 8, 15, 22 };
    String[] recipes = { "A=1F+2T+4S+1F", "A=4F+6T+4Y+1Y", "A=9S+1T", "B=1S+1T+1F", "B=6F+2T+4S+2Y", "B=1S+1T+3T+6Y", "C=2F+3T+1S", "C=4F+1T+1Y", "C=1S+1T+6F", "D=1A+1B+2Y", "D=6Y+2S+1C", "D=2F+2A+1B", "E=1A+1D+2Y+4S+7F", "E=9C+2S+1B", "E=2F+2A+1B+1A+1A+3C+4S", "G=1A+2Y+9D", "G=8C+4E+7S", "G=2A+5D+1F+9F", "H=1F+3E+2A+9A+4S", "H=3B+1T+2S", "H=1B+3T+4S+5Y+1F", "I=1F+2E+1H+1A+9A+4S", "I=2H+3B+9T+2S", "I=1B+3T+4S+2Y+7F+3D+1H", "J=1I+3E+6A+9A+4S+6T", "J=2I+5T+5S+8F+8F", "J=3I+9T+4S+5Y+6F+4D+2C+1B", "K=1S+1T+1Y+1F+1A+1B+1C+1D+1E+1G+1H", "K=1S+1T+9Y+5F+1I", "K=1J+2T+9T+9T+4D+1C+2D+1A", "L=1A+1B+1B+1A+4S+1G+6H", "L=2H+2I+3A", "L=1S+4Y+2A+2S+3J+1K", "M=1L+1B+1C+1A+4S+1G+6H", "M=2L+2I+3A", "M=1L+4Y+2A+2S+2J+1K+1Y", "N=1F+2A+1D+1E", "N=2H+2I+3A+1L", "N=1M+1F+1D", "LOVE=3N+1M+1N+1K+8S", "LOVE=1S+1H+1M+2A+3F+1N", "LOVE=1Y+2J+1K+1K+1K" };
    assertEquals(6220, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case30() {
    String[] marketGoods = { "F", "T", "Y", "S" };
    int[] cost = { 18, 8, 15, 22 };
    String[] recipes = { "A=1F+2T+4S+1F", "A=4F+6T+4Y+1Y", "A=9S+1T", "B=1S+1T+1F", "B=6F+2T+4S+2Y", "B=1S+1T+3T+6Y", "C=2F+3T+1S", "C=4F+1T+1Y", "C=1S+1T+6F", "D=1A+1B+2Y", "D=6Y+2S+1C", "D=2F+2A+1B", "E=1A+1D+2Y+4S+7F", "E=9C+2S+1B", "E=2F+2A+1B+1A+1A+3C+4S", "G=1A+2Y+9D", "G=8C+4E+7S", "G=2A+5D+1F+9F", "H=1F+3E+2A+9A+4S", "H=3B+1T+2S", "H=1B+3T+4S+5Y+1F", "I=1F+2E+1H+1A+9A+4S", "I=2H+3B+9T+2S", "I=1B+3T+4S+2Y+7F+3D+1H", "J=1I+3E+6A+9A+4S+6T", "J=2I+5T+5S+8F+8F", "J=3I+9T+4S+5Y+6F+4D+2C+1B", "K=1S+1T+1Y+1F+1A+1B+1C+1D+1E+1G+1H", "K=1S+1T+9Y+5F+1I", "K=1J+2T+9T+9T+4D+1C+2D+1A", "L=1A+1B+1B+1A+4S+1G+6H", "L=2H+2I+3A", "L=1S+4Y+2A+2S+3J+1K", "M=1L+1B+1C+1A+4S+1G+6H", "M=2L+2I+3A", "M=1L+4Y+2A+2S+2J+1K+1Y", "N=1F+2A+1D+1E", "N=2H+2I+3A+1L", "N=1M+1F+1D", "O=1F+2A+1D+1E+2N", "O=2H+2I+3A+1L+1J+2G+3D", "O=1M+1F+1D+1N+6S+4C", "P=7Y+2S+1A+3D+5H+2N", "P=1I+2A+3C+1D+2I+3K", "P=1L+1M+1N", "R=1P+7Y+2S+1A+3D+5H+2N+1N+1F", "R=1I+2A+3C+1D+2I+3K+6M", "LOVE=3N+1M+1N+1K+8S+1O+1P+9N+2R", "LOVE=1S+1H+1M+2A+3F+1N+4I+9I+1O+2P+1R+6G", "LOVE=1Y+2J+1K+1K+3K+2O+1P+5I+6J+1R+9L" };
    assertEquals(45626, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case31() {
    String[] marketGoods = { "A", "F", "Z", "H", "S", "V", "J" };
    int[] cost = { 62, 41, 97, 96, 27, 31, 81 };
    String[] recipes = { "O=1Z+3J+1M+2M+2Z+3M+2Q+2J+1Z", "P=2B+2M+3Q+2O+3O+1R", "A=2O+3V+2V+3Z+1Q+1O+1F+3L+3T+2F+3L+3M+1Q+3F", "A=3D+1D+1E", "A=2S+2L+2I+3E+3F+2Q", "B=2O+2Q+3O+1Q+2J", "B=2Q+3Z+1Q+3M+3R+1Z+3R+3M+3O+1O", "M=1J+2J+1J+2J+3J+1J+1J+2J+2J+3J+2J+2J+2J+3J", "J=3J+2J+3J+2J+1J", "S=2R+3Y+3P+2Q+1T+2Q+2Z+1Z+1B+3O+1J", "X=2B", "T=2M+3J+1M+1Z+2O+3Q+1R+1Q+1J+2M+3Q+3O", "Z=1M+1M+1J+3J+3M+2M+2J+1M+3M", "H=2Q+2S+1Q+1S+2Q+2C+2R+2M+1U", "T=3J", "N=1O+2R+3B+1Y+1Q+1K+3Y+3M+2M+1K+2O+3P", "C=2T+1Q+3T+2P+2J+2Q+2O+2R", "O=2Q+2Z+1J+3Z+2M+2J+2Z", "P=3Q+1Z+1O", "Q=1M+3Z+3J+3J+1Z+1M", "Y=3R", "U=1M", "Z=2M+2J+1M+2J+2J+3J+2J", "C=2Z+3Z+1Z+2J+2T+3R+1B", "N=2O+2T", "K=3T+1J+1Q+1Z+2M+1T", "LOVE=2P+2O+3O+3U", "K=1T+2C+1Z+1Q+3Q", "C=1T+1B+3O+2M+3Q", "S=1P+3J+1C+2Z+2P+3M+3Q+3B+1K+1O+2O", "O=3Q", "Q=1J+3M+2M+2J+2Z+1M+3Z+3Z+2Z+1J+2Z", "S=2Q+2R+3T+3K", "A=3F+1P+1N+2H+1M+2E", "J=1J+1J+1J+3J+3J+1J+2J+2J", "E=3B+1K", "S=1B+2T+2M+2Q+1M+3C+1K+2Z+1Y+1J+3M+1P", "LOVE=1B+2I+3X+3K+3S+2T+2I+2I", "F=1B+2N+2R", "F=2S+3H+2T+2C+2R+3T+2C+2M", "S=1Y+1R+1K+3J+1T+1R+3J+3O+3P+2O+2Y+3M+1J+1T", "E=3M+3Q+3C+1N", "R=2O+3Q+1J+3Q", "Z=3M+3J+3J+1J+2J+2J+2J", "J=2J+3J+1J+1J+1J", "Y=3M+3C+1T+1C+1C+2M+2Q", "P=1T", "K=1C+3O+3J+3B+2Q+3R+1R+3T+1O+2J+2Z" };
    assertEquals(85767, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case32() {
    String[] marketGoods = { "D", "N" };
    int[] cost = { 5, 11 };
    String[] recipes = { "I=1P+1M+1R+3O+1O+3L+2A+3B+1A+3X+2R+1Q+1D", "S=8U+2N+3U+3D+1V+1G+3U+1D+3U+2D+2D+1V+2N+3N+1N", "X=8M+3D+2D+3U+3D+3N+3N+1A+2A+2V+2G+2T+3G+3A+3D", "U=5V+3N+3V+3V+1V", "O=7X+2D+1S+1Y+2U+2V+3U", "Z=3S+3S+3T+1A+3Y+1Y+2M+1S+3A+1N", "LOVE=6J+2I+1F+1V+3N+1W+2Y", "G=2V+2U+3V+2N+3V+1D+3N+3N+2D+3V+3D", "B=6X+3Y+2D+3A+2D+1G+3T+1T+3S+2T+1L+3T+2N+2V", "W=8O+3V+1D+2O+1X+3L+2T+2G+3X+2M+1Y+2A", "C=3M+2L+3W+1O+1V+3X", "S=2G+1U+1V+1G+2U+2D", "Y=4A+2D+2V+3V+2D+1N+1N+1V+3A+3G+1G+2D+3G", "Y=7S+3D+1A+3A+2U+2A+1S+2S+3U+2U", "P=6R+3W+2U+3R+3D+1O+1O+1U+2Q", "I=2V+1Q+1Z+2H", "E=8R+2D+1N+1Q+1H+2V+1W+2Y+1Q+2V+1M", "K=6I+2E+1I+2L+3L+2V+3B+3H+1I+3Y+3C+2X+2A+3I+2Q", "B=4X+3X+1S+2M+2A+1L+2X+3G+1D+1N+3N+1Y+1X+1T", "G=1D+3D+1U", "X=1D+3U+3L", "V=4N+3N+2D+3D+3D+1D+1N+3N+2D+1N+3N+3D", "Q=6Z+1T+1X+3U+2V+1O+3Z+1O+3S+3Z+1C+2G", "O=3D+2N+3S+3D+3N+3S+2M+2M+2U+1T+3D+1M+3S", "LOVE=2S+2U+2A+1Z+3P+1V+1B", "J=2O+2O+3H+3U+3A+3M+2E+2G+2O+3F", "L=1N+1G+3D+2A+2V+2A+1D+2V+1N", "W=5O+2T+3U+2D", "K=9I+3F+2A+3O+1Y+1U+3E+2G+2T+3R", "M=2Y+3A+1D+3N+3U+3Y+3V+1G+3G+1G+3S+1U+2A+2A+2S", "C=1B+1N+3G+1M", "E=4P+2G+1Z+3P+1X+1H+3F+2U+2B+3F+1T+3L+2O+1M+1Y", "V=4N+1N+1D+3D+1N+3N+2N+3D+1N+3D+2D+1D+1N", "R=3Z+1L+1A+1F+1C+2B+1F+2Y+2D+3B+1B+1N+2G", "Q=2D+2F+2A+1L+1C+2D+2W+3D+2L", "J=2B+1V+1V+3Z+3U+3B+1S", "F=8B+2A+1W+1M+1D+1A+1V+2Y", "F=2A+3M+2Y+3U+3T", "P=1Q+3H+3C+2G+3T+1F+2D+3O+1B+3Z+2H+2C+1U+2M+2H", "T=2L+2V+2S+2L+2A+1U+3D+3Y+1G+2G+3G+1G", "R=1Z+3X+1V+2T+3X+1X", "A=3G+1G+3U+3N+2S+3D+2G+3U+1N+3D", "M=5Y+3G+2L+2S+2D+1N", "H=6F+2B+2W+3M+3T+1D+1T+3B", "L=3D+1N+3S+2A+2G+1G", "U=1V+3N+1N+2N+1V+2D+1D+3N+2N+3D+2V+1D+1N", "Z=5C+1B+3W+1Y+1T+1C+3Y+1F+2U+1O+3L", "A=3G+1D+2S+1S+1D+1N+1D+3N+1D+2D+1U+1U+2V+3D", "T=6M+3A+1G+2A+3V", "H=1O+3S+3C+1A+3G+2Y" };
    assertEquals(459079517, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case33() {
    String[] marketGoods = { "QEA", "CVJ", "TBX" };
    int[] cost = { 48, 18, 27 };
    String[] recipes = { "LNU=3LEL+3CVJ+1ATC+2CVJ+2LEL+1KUG+2QEA+2HRV+2VUJ", "OYP=3BFZ+1KUG+2CVJ+2CVJ+1ESO+2ESO+2QEA+1KUG+1QEA", "LOVE=5IFV+1HRV+2MVX+3KUG+1MVX+3BFZ+2IFV+3KUG+1BZK", "ATC=2OYP+1QEA+2CVJ+2OYP+3MVX+1OYP+1CVJ+3BFZ+3TBX", "YFT=2LNU+1TMY+3ATC+1TMY+3VUJ+1TMY+1KUG+3OYP+3BFZ", "FRR=2YFT+3CVJ+3IGA+3TBX+1LNU+2MVX", "IFV=7FRR+2MVX+2ESO+2FRR+1PNE+1CVJ+2CVJ", "MVX=3QEA+1ESO+2ESO+3KUG+3BFZ+2TBX+3KUG+3ESO+1QEA", "HRV=3MVX+1ESO+3ESO+3MVX+1ESO+2MVX", "ATC=2MVX+3OYP+2QEA+3CVJ+1MVX+1TBX+2MVX+2BFZ+2OYP", "VUJ=3QEA+1OYP+3ESO+1QEA+2AED+3EMO+3BZK+3IGA", "AED=2CVJ+2EMO+1BZK+1ATC+1CVJ+3ESO", "BFZ=2QEA+2CVJ+2TBX+3ESO+3ESO", "BFZ=5ESO+2KUG+2KUG+1CVJ+1KUG+3KUG", "KUG=2TBX+2QEA+1ESO+1CVJ+1TBX+1QEA+2QEA+1CVJ", "EMO=1OYP+2CVJ+3MVX+3QEA+2QEA+2OYP+3MVX+1OYP", "HRV=7EMO+1OYP+1KUG+2EMO+1OYP+3CVJ+2OYP+1ATC+1OYP", "LOVE=3HRV+3AED+3CVJ+3KUG+3LEL+1FRR", "EMO=2KUG+3BFZ+3QEA+3BFZ+1TBX+3QEA+2BFZ+3KUG+2OYP", "ESO=7TBX+1QEA+1TBX+3QEA+2QEA+1TBX+3QEA", "MVX=1TBX+2ESO+1QEA+1TBX+1ESO", "IGA=1EMO+3BFZ+2MVX+3ATC+3QEA+2CVJ+1TBX", "TMY=3LIV+1KUG+3IGA+3BFZ+3HRV", "UFX=1CVJ+3ATC+3EMO+3HRV+1CVJ+2HRV", "OYP=1KUG+2QEA+2KUG+3CVJ+3KUG+3KUG+1TBX+1CVJ+2TBX", "PNE=1YFT+3QEA+1HRV+2YFT+3FRR+3LNU+2TBX+2FRR+2YFT", "BZK=3QEA+3ESO+3CVJ+3TBX+3KUG+1OYP+3BFZ+1ESO+2MVX", "ESO=3QEA+3QEA+2QEA+3TBX+1CVJ+3TBX+3TBX+3CVJ+3QEA", "VUJ=6AED+1OYP+1TBX+2HRV+3AED+2BFZ+2BFZ+3TBX+3UFX", "LIV=1BZK+3ESO+3CVJ+3UFX+1TBX+1BZK+1HRV", "LEL=1LIV+2HRV+2ATC+1OYP+2AED+1LIV+1EMO+3ATC", "LEL=1BFZ+3QEA+3BFZ+1IGA+1QEA+2ESO+1ESO", "UFX=2OYP+2CVJ+2BFZ+2KUG+1BFZ+1ATC+3ATC+3HRV+2MVX", "LNU=7LEL+1ATC+3LEL+3LEL+3HRV+1BZK+3BFZ+3AED", "PNE=2CVJ+3LIV+2LIV+3IGA+3AED+1HRV", "IGA=8UFX+2TBX+2TBX+2ESO+1TBX+3KUG+1KUG", "TMY=2MVX+2KUG+1BZK+1LNU+2HRV", "YFT=4LNU+3LEL+3KUG+1HRV+1LNU+3TMY+2BZK", "FRR=1AED+3HRV+2KUG+3LNU+3OYP", "AED=3IGA+1BZK+1CVJ+1OYP+3MVX+3TBX+2QEA+1ESO", "LIV=1UFX+3BFZ+3CVJ+3EMO+3QEA", "BZK=7IGA+3IGA+2KUG+2HRV+2OYP+2IGA+2UFX+3ESO+2BFZ", "KUG=6ESO+2TBX+2CVJ+3ESO+1TBX+1TBX+1QEA+1QEA+3CVJ", "IFV=7PNE+2YFT+3HRV+1PNE+2TBX+2BZK" };
    assertEquals(15361992, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case34() {
    String[] marketGoods = { "Q", "K", "J" };
    int[] cost = { 7, 5, 10 };
    String[] recipes = { "P=7L+3K+1J+1L+1Q+3K+2U", "W=2Q+1D+2Q+1U+3L+3J+2K+1Q+3B", "E=1L+1U+2H+1K+1H+3V+1R+2R+2B+2B", "L=4K+3J+2J+3K+1J+3K+2Q+2Q+1J+1J", "Y=7Z+2B+1I+1B+2B+2Z+3V+2X+2V+3B+2V+3Q", "H=1P+3B+2L+1L+1U+3L+3J+1B+3W+1Q", "M=4E+2G+1T+2D+2S+3N+3T", "Y=2U+2J+1V+1P+1W+2H", "U=8L+3Q+2Q+3J+2K+2K+2K+1L+2J+3J+1L+2K", "N=9Z+3U+2P+3P+1Q+1I+3W+3Q+3H+1I+3J+1U+1K", "E=2R+3Z+3T+3U+1G+1W+2L+1R+3N+2Q+1Z+3D+2W", "R=1U+3S+3Y+2C+1S+2F", "S=3D+3J+1D+3G+1D+2Q", "C=4F+3V+2Q+3D+3F+1S+1P+2J+2V+3W+2F", "B=8X+3U+1J+1D+3Q+2X+3Q+2I+1P", "P=5L+2K+1L+1U+1K+1Q+3Q+3L+3K+3Q", "LOVE=2E+2N+1K+3R+2N+2D+1N+2F+3K", "X=1D+2I+2U+3K+1L+1I+3K+3D+3L+2L", "H=3P+3U+1X+3W+2K", "D=3J+1U+2Q+2L+1L+3U+2P+1J+2K", "I=2Q+2J+3L+2U+2P+1P+1J+3U", "V=3D+1P+1L+2J+3U+2H+2D+2I+3I+2I+3U", "F=3Q+1J+1P+1N+3H+1B+1L", "G=2T+3K+2Q+2B+3W+2X+3Y+2X+2J+3J+1V", "R=1S+3P+2Z+1S+3D+3C+3H", "LOVE=2X+3F+1V+3X+3V+3V+1L+1U+3B+1R", "I=4P+1K+2D+1P+1J+2L+2D", "W=7X+1D+1K+2Q+2U+2D", "D=2J+2P+3J+3Q+1L+2J+1Q+3Q+3L+1L+3J", "N=5Y+2T+2I+2U+2J+1P+2I+1W+3D+1B+1V", "B=3I+3J+1P+1P+1K+1I+3X+1K", "V=3H+3X+3K+2W+3H+1B+2W+2P+1Q+1H+3L", "X=6D+1K+2K+1P+3K+2K+3L+2Q+1I", "G=9Y+1J+3P+1P+2K+3X+2Z+1N+1D+3Z+3Q+2L", "U=2L+3K+1J+1Q+2J+2Q+2L+1Q+2J+2Q", "F=1D+2G+2G+1B+1Q+1I+3G+2Y+3L+2Q", "C=3Q+1S+3J+1N+2H+1D", "Z=1V+1V+3J+1U+1T+3B+3I+1W", "L=9J+3J+3K+2J+1Q+2Q", "Z=2D+1K+1B+3B+3W+2D+1I+2U+1J+3H", "S=5F+3Q+1L+2Y+2B+2V", "T=2L+1B+2L+2D+2X+1W+2H", "T=9H+1V+2J+2L+3P+1U+3Q+3U+3I+3L+1W+3U+3U", "M=2R+1B+2T+1R+1U+2E+1D" };
    assertEquals(596863662, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case35() {
    String[] marketGoods = { "B", "L", "X" };
    int[] cost = { 6, 4, 10 };
    String[] recipes = { "N=4U+3I+2F+2G+3F+1U+3F+1C+1H+1B+3S+3Y+1C+3H+1C+1I", "K=9V+3N+1F+3Q+2H", "V=3R+3X+1G+1U+3F+2T+2H+3N+1H+1L+3S+1Q", "A=2R+3Y+1U+2T+3Z+2I", "I=5F+3X+1Y+1X+3B+2C+1C+2F+1B+2X+1Y+2X+3X+3B", "Y=6C+1C+3X+3L+2C+1L+1B+2C+1B+3L", "F=3X+2X+3B+3C+3Y+2C+1X+3L+1L+1L+2L", "P=1V+2C+3O+2N+2O+1H+1X+1L+2O", "H=8I+3L+2I+1I+1L+1F+1Y+3X+2X+3Y", "W=1U+1D+1I+1F+2L+2D+2Y+3X+1M+3A+1B", "O=4V+1L+2B+2V+3Y+1Y+2F+2X+1G+2T+1B+3S+1R", "U=5S+1Y+2H+1F+3X+3C+1G+3X+1H", "C=2B+2L+1L+2B+2B+1B+1L+2B+2L+2X+3B+1L+2X+1X", "Y=6X+3C+1B+3L+2X+1C+1B+2L+2L+2X+1X+2C+2L+2C", "O=3V+1N+2X+1T+2F+3G+1N+1C", "P=9Z+1C+1Y+1O+2F+1O+3H+3R+1C+3K+2U+1I+2M+2H+3V+2R", "S=3I+2I+2X", "I=3C+1F+3F+1F+3Y", "R=1H+2X+3F", "Z=3L+2N+3T+2G+1G+2N+3B+3B+2I+2B+2R+1H", "LOVE=2D+3D+1K+3G+3Z+2B+1T+2B+1C+1Z+1P+3S+2T", "G=1Y+1S+1S+1C+3F+2S+1X+2I+3S+2B+1B+1I+3R+3C+2Y", "V=1N+2N+2I", "A=3S+3F+1Y+1H+2Y+2T+2K", "M=9O+3K+1G+2B+1S+2U", "Q=2R+2R+2S", "LOVE=4W+2L+1T+2B+3W+2B+2F+3X+1X+2F+2G+3X+2L+3U+1D", "G=1R+2H+2I+1I+3Y+1Y+1L+3B", "F=9C+3X+2Y+1X+2L+1B+1Y+1Y+3L+3Y+2Y+3X", "R=1F+2H+1F+2H+3Y+1B+1L", "K=3L+1S+3I+1F+2U+2V+1N+3U+3T+3H", "N=3Y+3I+1S+1Y+3R+2G+1L+2B+1F", "S=4H+1X+2H+1H+1X", "Q=9N+2B+1L+3R+3N+1N+2H+2C+1N+1B+1T+1B+3S+3U", "U=3G+3I+3C+2S+2C", "Z=9K+3Y+2Q+2O+2T+1G+1H", "C=7L+2B+3L+2B+3L+2B+2X+1X", "W=7A+1N+2T+3L+1X+3K+3H+3F", "D=3O+2Z+2V+1H+3Z+3H+1F+2H", "T=1G+3F+3B+3H+1Y+1U", "D=5A+3T+3U+2L+1K+1Q+3Z+3Y+1Z", "H=7I+1B+3L+1Y+3Y+3Y+3C+1Y+3Y+2C+1B+2L+2C+2I+2F+3I", "M=2N+3R+1S+1I+2H+3I+1C+1Q+1S+1B+2X+2V+1S+1U+1Q", "T=3U+1Y+1G+3F" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case36() {
    String[] marketGoods = { "D", "Z", "U" };
    int[] cost = { 6, 5, 9 };
    String[] recipes = { "B=8A+3L+1L+3U+2Z+3A+1U+2R+2Z+3R", "W=3G+2B+1H+1I+2E+3L+1Y+3R+2K+1V+2Z+3V+3N+2U", "R=6L+3Z+3D+1D", "X=2R+3L+2Z+1A", "R=6A+3D+2Z+2D+3U+3L+3D", "X=3R+1A+3D+3L", "A=3Z+3U+2U+3L+3Z+2D+2D", "I=7N+1N+2N+3X+3M", "L=1D+1U+1Z+2D+2U", "T=9S+3I+2S+3L+3A+1U+1X+1S+3K+1M", "LOVE=2L+1B+3S+2O+2N+3F+2Z+2U+3Q+3G+3L+3H", "W=4F+3L+3V+3R+1Z+1A+3L+3N+1X+1S+2V+1C+3H+3G+1U", "S=3D+3D+3H+2K+3X+2L+2I+2Z+2L+2M+1A+1E+2Z+3H", "Q=3R+3X+1U+1D+1L+3R+1X+2B+3D", "F=4C+3T+3R+1B+3T", "G=9F+3K+1N+2Y+2I+1D+1E+1L+1A", "G=3C+3Y+2I+1U+2K+3Z+3T+1T+3U+2T+2Z+2X+2Y+3H+2E", "H=1B+2Q+2A+2R", "N=2X+2X+3H+2R+1D+1M+3H+3X+3H+1Z", "V=6T+2I+3U+3R+2N+3N+2D+1S", "E=2I+1N+2D+3K+2Z+1A", "F=1C+1Q+1B+3I+2E+2H+3A+3R+2L+2Q+2T+3Q+2R+1S+3R", "I=2N+2R+2H+1N+2H+2D+2K+3K+3U+2L+2B+2N+2B+2Q+2L+1Z", "K=7H+1H+3Z+1D+1M+1X+1L+1U+1A+2A+2Z+2H+3Z+1M+3N+1X", "O=2N+1G+3W+3R+1N", "A=7U+2D+1L+3L+1U+1D+3U+2U+2Z+3L", "LOVE=1D+2U+1Z", "C=1S+2Y+2V+2I+2K", "H=7M+3M+1Q+1B+1R+1U+2Q+2Z", "T=2E+3B+3U+3M+2D+2L+1U+2Z+2K+3M", "E=2U+2R+1Q+2M+1M+2L+2U+3Q+2M", "S=1M+3L+3B+2E+3Q+1D+2B+2H+3B+1B+2Z+1R+3D+3Q", "N=2H+3B+2A+3B+1L", "O=4W+3V+3R+1B+3U+1G+1M+1U+2L+3V+3N+1B+2V+1R+1K+2C", "L=2D+2D+3Z+1U+3U", "C=1U+3E+1U+3M", "Y=1L+1A+3B+3X+1X+3Z+3E+2T+2M+2U+1K+3N+2K+2T+3I", "M=1U+2U+3A+2B+1X", "V=2M+3K+2L+2E+1A+1E+1B", "M=3X+2X+3D+3R+1A+2L+3L+3L", "Y=2I+3Z+2M+2M+1X+2X+2R+1A+3H+1Z+2D", "K=4N+1R+1Z+1Q+1U+3Q+3R+1L+2U+2D+3R+2N+1R+2A+2H", "B=1R+2D+1D+1L+2U+1A+1R+3D", "Q=8B+3X+2L+3Z+3B+2D+3U+3U" };
    assertEquals(29, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case37() {
    String[] marketGoods = { "S", "W", "T" };
    int[] cost = { 63, 19, 31 };
    String[] recipes = { "LOVE=3I+1O+3D+1D+2E+3G+3O+1I+3O+1P+2O", "O=1B+3S+2N+3S+1N+3K+2C+3P+2A+1A", "B=3U+2P+3H+3Z+3T", "M=3Q+2T+1E+1N+2S+3B+1E+2S+1W+1N", "U=1J+2C+2K+2K+3I+1J+2C", "M=1J+3A+3P+3X+3T+1Y+1Y+2T+3C+1P+1P+3K", "G=2T+2T+3S+3U+1O+3E+1J+2Y+2I+2C+1N+2Y", "I=3N+3W+2S+1S+3S+2N+3W+2C+1C+2T+1C+3S", "O=3W+3C+3K+3P+1Z+3I+3U+2A+2S", "N=1W+3T+3S+2W+2T+1S+2W+3S+1W+3S+3W+1T+2T+1S+3S", "Q=1A+2O+3J+1T+3B+2Z+1P+2D+2D+1O+1S+3T+3D+1I+1T", "E=6A+1J+2U+3C+1W+2Y+3P+1I+2C+2K+2P+2N+3U+3W+2U", "V=3O+1J+1O+3E+2B+3U+1D+2H+3A", "I=6C+3W+2C+2S+3W", "H=3I+2J+1T+1S+1S+2Y+3J+3J+3Y+2Y+2T+2Y+3C+3K", "L=4M+1P+3X+1M+3H+3M+3K+1M+1X", "L=3A+1W+2U+2X+2T+1K+1Y+3C+3P+1Y+3N+2H+1T+3D+1Q", "P=5H+2N+2C+2C+2I+1I+1C+2H+3T+3K+1H", "U=2J+3J+2I+2C+3I+1W+1P+1H+2I+3H+2W", "K=3W+1S+3S+3J", "Y=1S+1J+3W", "Z=4A+3A+1A+1A+2E+1E+2C", "P=2H+3S+3N+3T+3N+3H+3C+1N+1Y+2T+3I+1C+3H+3N", "J=3T+2N+1C+1I+2S+2S+2S+2W+2W+3W+1W+3C+2I+1N", "X=3C+1K+1D+3U+3S+1S+1A+2K+2N", "J=1N+1T+1C", "K=8J+2J+2N+2T+3I+3N+1C+1N", "LOVE=3S+2S+2S+2S", "Z=1C+1E+3C+2T+1A+3J+2C+3E", "Q=6X+2Z+2I+2A+3X+2Y+1O+2S+1I", "V=1K+1B+1J+2W+1P+1N+2X+1A+1D+3X+2U+3W", "B=1U+3J+1J+2Z+3J+1H+3P+3A+2U", "D=3Z+1S+3E+2P+2T+1T+1W+1I+3U+3S+1Y+3A", "G=3Z+1C+2S+3M", "C=1W+3W+2S+2T+1T+1T+1T+2S+3N+1S+1N+2N+2T", "Y=3K+1N+1S+3T", "H=7Y+1I+1N+1I+1N+3N+1C+1I+2T", "A=3U+1K+3H+2U+1W+1U+2I+2C+3W+2H+3I+1P+1P+2U", "C=2W+3W+1N+2N+3T+1N+1S+3N+1T+3T+2T+2N+1T+3N", "X=2Z+3B+2D+1U+1I+3S+2N+1J+2K+2E+3O+3C+1A+3W", "E=2U+2P+3C+2N+3U+1S+3U+2S+2I+3N", "N=3W+2W+1W+3S+3W+3S", "A=3U+3W+1I+1S+2N+1N+1Y+3I+2S+2W", "D=7B+2P+1U+3P+3K+2C+1C+1Z+3J+1E+3Y+2A+1T" };
    assertEquals(567, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case38() {
    String[] marketGoods = { "P", "R", "Y" };
    int[] cost = { 14, 28, 7 };
    String[] recipes = { "A=2X+1R+3Y+1U+2F+3H+3U+2R+3X", "U=3N+1R+1R+3R+2P+2H+1D", "T=5N+3R+2X+3X+1P+2N", "F=1T+2H+1T+3P+2N+3P+1R", "I=8A+3A+1T+3R+1R+1G+3F+3D+3G+2H+3C", "C=2Y+3H+1N+3H+3P+2U", "LOVE=1A+1T+1R+2M+1T+3X+2M+2S+3T+2E+3D", "B=1W+2P+2S+1A+3U+3S+3N+2I+3D+3N+3V", "D=1R+1P+1P+3R+3P", "J=3D+1D+2Y+2Y+3R+1Y", "U=2S+2X+2D+2T+2P+1F+1D+3X+2H+1F+2D+2F", "B=7L+1M+1R+1K+3L+3N+1L+2T+3N+1A+3Y+1J+2W", "H=4D+1J+3D+3P+1Y+1P+1R+1Y", "X=3H+3Y+2J+1R+1J+2J+3P", "L=1D+2M+2K+2G+3T", "N=3X+1J+2P+2J+2D+1X", "LOVE=3Q+2Q+2W+1N+2P+2E+3R+2H", "V=1I+1J+1J+3X+1J+3X+3K+2I+3X", "LOVE=5E+3S+2G+3L+3A+3N+2M+3R+2Q", "LOVE=5E+3B+3H+2V+1U+1N+1G+1W+3A", "M=2N+3S+2U+3D+3D+3C+1P+1Y+1P+3U+2X", "S=3R+3P+3T+3X+1Y+3J+1H+2Y", "N=2X+2H+2J+1H+3X+2D+2R+3H+1X+2X", "F=4T+2Y+2Y+1J+3D+2H+2Y+1Y", "LOVE=5Q+1E+3I+1Q+2Y+1C+3S+1H+2C+3K+2Y+2T", "H=2D+2Y+2P+1D+3P+1J+3J+1D+3D", "W=9A+1D+1G+3F+1U+1K+1M+1X+1P+2H+3T+2R", "K=6C+1S+2F+3Y+3F+3R+1H+2S+3U+3U+1U+3N", "LOVE=3B+2U+2B+2D+2H+3Y", "A=1T+3H+3C+2C+1M+1N+2M+2U+2X+1K+1Y+2K", "X=3D+3J+1D+2Y+2Y", "G=3R+1R+3J+1S+1N+2Y", "M=1F+1X+3C+1U+2U+1Y+2P", "V=6L+2S+2X+1U+3T+2Y+3T+3U+1W+1F+2P", "G=8M+1N+1C+2K+1K+1S", "W=4G+1Y+3A+2A+3U+3C+2Y+3S+3N+2N+2R+1Y+3J", "I=2A+3H+1T+2G+3S+3M+2H+3D+3X+2S+2G+3F", "S=1N+3D+3P+1N+2D+3D+1F", "J=3P+1R+3D+2P+3D", "L=2W+2G+2U+1C+3R+3P+3I+1U+3I+2K+1J+1G", "T=4N+1H+1X+3N+1J+3P+1P+1R+3J+1H", "C=3R+1Y+3S+1X+1T+1D+1P+2R", "D=1R+2Y+3R+2R+3Y+1Y+3Y+2R+1Y", "K=2T+3H+1R+2T+3F+2D+1Y+1C+1Y+2H+1F+3D", "LOVE=7Q+1K+1G+1I+3A+2L+1C+1H+1Y+3H+1C+3A" };
    assertEquals(436756320, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case39() {
    String[] marketGoods = { "T", "Y", "H" };
    int[] cost = { 8, 31, 4 };
    String[] recipes = { "J=2O+1P+1V+1W+1P+1P+2W+1R+1T+2M+2W+2Q", "C=2L+1L+1H+2E+2E+1E+1D+1H+1G+2W+1F+2L+1U+2R", "R=2X+1T+1H+2T+1H+2D+2Y+2D+1Y+1V+2B+1Y+1X+2V", "F=1R+1D+1B+2T+2X+1V+1R+2R+1H+1R+2D+2D+1X", "O=1C+2D+2Y+2Q+2P+2V+2V+1V+2Q+1Z+2U+1N+2R+2W+2N+2L", "D=2H+2H+2T+1V+1V+1T+1H+1Y", "N=1F+2F+1X+2V+2Y+2B+1X+1D+1F+1Q+1V+1B+1V+1H+2F+2T", "L=2G+2R+1D+1V+2N+2E+1Y+2T+1M+2F+1R+2D+1I+1B+2H+2F", "D=1H+2H+2T+2V+2H+1V+1T+2V+1T+1V+2H+2T+1V+2H+2T", "X=1D+1B+2H+1D+2Y+1T+1T+1V+1H+2B", "F=1R+1T+1R+1H+2R+2Y+2H", "R=2B+2X+2T+2T+2V+1T+1D+1Y+1T+2B", "M=1U+1T+1P+2B+2D+2P+1R+1D+2Y+1P+1F+2T+2T", "V=1H+2H+1Y+2H+2H+2H+2Y+2H+1Y+2T", "Q=1R+1Y+1R+2T+1R+1B+2X", "K=2J+2B+1V+1X+1U+2O+1D+1F+2Z+2W+2Z+1O+1W+2F+1B", "V=2H+1H+1H+2T+1Y+2H+1Y+1H+2H", "O=1L+1M+1W+2Y+1P+1Z+2V+2M+2W+2H+1R+1T", "M=2U+2U+2B+1T+2D+2P+1B+2I+2B+1D+2U+1Z", "LOVE=1K+2I+2L+2Z+2C+2O+2G+1D+1V+2N+1G+2J", "N=2Q+1R+1V+1X+2Y+2F+1T", "P=1I+2R+2H+2X+1D+1F+2N+2R", "K=2O+2E+1E+1R+1R+1F+2O+1R", "W=2I+2X+1T+2V+1R+2D+1T+1F+1Q+2B+2N+1X+2T+1D+2I", "Q=2R+1X+2B+2B+2V+1V+2T+2B+2H+2R", "U=1Z+1H+1T+1Y+1W+2W+2F+1Z+2T+1Y+2R+1X+2X+2V+1V+2D", "X=1B+1Y+1T+1T+1Y+2T+2T+1B+1H+1V+1T+2Y+1Y+2D+2D+2T", "G=1U+1P+2M+1B+2W+2D+1F", "E=1M+1I+2B+2H+1H+2W+2Q+2X+2H+2M", "B=2V+2V+2T+2T+2V+1H+1V+2D+1T+2H+2Y+2T+1Y+1V", "I=2Q+1R+2B+2T+2Q+1H+1F+2Q+1T", "E=2G+1M+1G+1T+1N+1V+1Z+1F+1R+1T+2I", "LOVE=2J+1U+1C+2P+2Z+2N+2H", "L=1G+2T+1F+2F+1H+1U+2T+1Q", "Z=1P+1Y+1Q+2H+1F+1Q+2P+1P+1R+2Y+1W+1Y+2I", "J=2O+1R+2Q+1L+2B+1E+2Y+2G", "G=2M+2H+1M+1P+2N+1T+1I+2T+2I+1P", "Z=1P+2P+1D+1H+2V+2T+2T", "U=2W+1F+2Y+2H+1Y+2N+1Z+2V+2N+1H", "C=2E+2I+1I+1Z+2Z+2I+1F+2L", "P=1N+1I+1F+1F+2V+1H+2N+1F+2F+2T+2V", "I=2Q+2V+1V+1R+1D+2R+1Y+1D+1R+1D+1B", "B=2D+2V+1Y+1Y+2D+2Y+1V+2H+2Y+2D+2D+2Y+2Y+1V+1Y+1T", "W=2I+2Y+1V+1D+1I+2X+1B+1H+1P+2H+2Q+2D+2Q+2B" };
    assertEquals(561858248, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case40() {
    String[] marketGoods = { "I", "A", "T" };
    int[] cost = { 48, 8, 57 };
    String[] recipes = { "U=1M+2Z+2Q+3E+5Z+5A+4P+1T+2J+5E+4I+1I+3J+1Z+2I", "Z=2A+4T+5T+5I+1I+1I+3I+2A+5I+2I+5I+2I+2A+3A", "Y=1J+3K+1J+5I+4J+1J+3I+5A+2Q+1A+4K+5Z+4A+1K+2Q+3T", "B=1L+3M+4K+1Q+4E+3T+5P+4S+5A+3M+4S", "Q=3G+1I+3G+4G+5G+1T+4I+1G+1G", "F=3C+4S+1S+3R+3Z+3Y+3P", "D=1O+1L+4B+3B+1O+1V+4W+5F", "V=1X+3U+1T+4W+2W+3B+4Z+4S", "K=3Q+3T+4T+1Z+5T+2G+5Z+2Q+2Q+2Z+4Q+4Z+3T", "O=1V+5A+2A+1W+4E+2J+3M+2U+3Z+1G", "W=3F+1F+1R+2T+5J+2F+2B+1K+3Q+1Y+2I+2M+3Q+1C+3Y+2Q", "L=1S+5U+3Y+4S+4K+2Q+4R+2K+3P+5R", "LOVE=3D+3F+3W+2A+1G+5L+2T+3A+2A", "V=2W+5K+1M+4R+2I+1A+1Y+4L+4T+4I+3P+2W+2Y", "P=2J+2T+5I+1A+2Y+5Q+3Y+4G", "X=1W+5Q+5S+4B+1I+4T+2B", "M=2Y+4P+3T+1K+3G+2Z+2I+1I", "M=3Y+1J+5P+1I+5G+5P+2I+2G+1I+2Z+4I", "E=2P+4G+5T+5M+3G+5A+4Z+1P+2Y+3Z+2G+5M+4A+3G+1P+5Q", "X=3W+5W+3C+1U+5C+5A+3Z+2L+3M+5E+5A+1C+3E+2K+2A+5P", "C=1R+2R+3I+5I+3Y+2Y+2R+2Q+2I+2I+4R+1R", "U=1M+4Y+1M+5Q+1T+4J+2A+2Z", "G=3T+5A+3T+2Z+2I+3A+1T+4T+4Z+3I", "C=1R+3P+5K+3Q+2L+4P+1Q+2R", "D=2O+4A+2Z+1R+2I+3V+1A+1G+4G+2X+2Z+5K+4O", "O=3V+3X+1R+1F+4E+4U+1J+1E+1Q+2L+4Q", "J=2Q+4K+4Z+2A+4Z+2T+1Z+4K+1T+1I", "L=2S+4J+3G+1R+4R+4U+3K+2Z+1P+5G+4J+1A+2Z+1E", "LOVE=3O+1M+5Y+5Y+5M+5T+1I+1R+4F+3I", "W=3F+4K+4U+3C+2C+3G+3Z", "R=3S+4Q+3A+1A+2G+1Y+2I+2Z+3M+4T", "Z=3A+1T+4T+2A+2T+4A+4T+5T+4A+3A", "Y=1K+2Z+2T+1J+2K+4G+1G+3Z+2G", "K=1Q+2A+1T+2G+3Q+5A+1T+2T+1G+1I+1Z+4Q+4A", "G=2T+2I+2I+4I+4Z+1T+3A+3I+1A+4A+4I+5T+4T", "F=1C+3M+5J+1S+2E+2R+1M+4Y+5M+2B+3J+2G", "S=3E+1Y+1Y+3A+1I+3Z+2U", "P=3Y+1J+3K+3T+3Y+1T+5T+4I+3Y+4J+4Z+5Q+5J", "B=1C+2G+5Q+1C+4R+4P+4S+1G+2Z+5P+2C+4J+3U", "Q=2Z+1A+5Z+1T+2I+1A+1A+4A+1Z+3G+4Z+4G+3G", "R=1S+1Q+1P+5G+2T+5M+3Q+5U+4Y", "J=2K+3G+3G+5A+4A+5G+2A+2T+3Z+2K+5A+4A+5T", "E=2P+1I+5J+4K+5K+3J+2A+5T+5Z", "S=2E+4P+2K+1Z+5E+4P+5Z+3P+3P" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case41() {
    String[] marketGoods = { "Q", "O", "Z", "X", "E", "P" };
    int[] cost = { 1, 4, 10, 17, 14, 17 };
    String[] recipes = { "LOVE=3U+2Z+1N+5E+5A+3F+2U+4G+1I+4C+1S+4R+2G+3M+5R", "I=3H+5X+4Q+3T+4N+5V+4M+4S+5X+4C+3X+1Z+3V+3G", "R=2I+3V+3Y+4I+3Y+5R+5C+3H+1T+1X+1S+1P", "W=1P+4E+2E+4E+3I+5Z+5E", "A=1F+4Z+3Q+5Q+4O+1P+4R+1E+3Z+3X+2O+4M+5W+1G", "N=2W+3W+3Q+3X+4E+5Z+3O+3O+3W+3Z+1P+1Q+5X", "T=3Y+4N+2Z+5Q+1C+2C+4O+3E", "A=3R+3Q+1N+5Z+5R+1G+2H+1V+2Y+3N+3T+4I+2S+1X", "H=2M+2O+3V+2Z+4M+4N+3Q+1P+1Y+2C+3P+2Q+2E+2Z+4X+3Q", "C=1Y+2X+5P+4X+3E+3D+4W+2Y+5P+5Y+2Q+4E+1N+5P+2Q", "S=1H+3P+1N+3Y+4H+4O+2W", "V=1T+2X+2Q+5Q+3E+3X+3T+3P+2E", "D=2F+1Y+2V+5I+3X+1N+1C+5R+3M+3V+1M+2F+3Z+3A", "V=3C+2W+5N+5W+1Z+4Y+3Y+2Z+5P", "B=1A+3O+5A+2K+4A+4Y+4X+1H+5D+2I+5D+4M", "M=1V+2Y+5T+2Z+1Q+3Y+2W+2N+4E", "LOVE=1U+3E+3P+3N+1W+5P+5V+1C", "N=2P+2U+4E+3O+2Z+5X+3W", "R=2S+2P+1N+1M+1Z+4H+4Z+1M+2I+3O+2T", "C=2Y+2Q+4W+3E+4E+1Z+3X+2W+3N+1Z+3N+5Q+5Y+4O", "K=1D+1F+3Q+4E+4C+1E+4B+3C", "S=1H+2X+1C+2C+1O+3I+4Q+4M+5W", "Y=3N+3X+4Z+3N+4W+1Z+5W+1E+1P+1P+4O+1E+1N+5Q+2X", "I=2S+5E+3X+3V+5T+5W+4V+4S+4W+2Q+2W+1W", "W=1E+3O+4E+3X+3Z+4X+1Q+2Z+5X+1P+3E+1Z+2Q+1X+5O+3E", "U=2K+5V+4N+4C+5X+2X+3H+2H+4F+2K+2T", "F=1I+4Z+5H+1T+5C+2N+1H+4O+5C+1W+4Q+4P+1T+2V+3R", "K=3D+4V+4X+5P+2D+1O+1R+4P+5X+1A+4E", "T=3Y+1P+2Y+4Y+4E+1O+5W", "G=1V+2E+3M+2Z+4X+3K+3Y+1X+5V+5W+2Z", "D=3A+3O+4E+2T+2R+4N+1Q+4Z+2N+4M+1C+3W+3H", "F=2R+4M+3R+4H+4O+2R+5V+1O+4H+3F", "M=3V+4P+4M+3T+3E+5W+3X+4S+2Y+3E", "B=3D+4W+3I+1Q+2E+2M+2E+4O+4V+3Q+1R+3H+4N+4T", "H=1M+5Q+2O+2T+2P+1O+4V+1Q+1B+2Y+3S+3X+3E+1E+4P+2V", "Y=3W+5N+1O+5X+1C+5Z+3X+1E+5N+1Z+2E+2P", "U=2B+2D+1P+4C+2B+4B+2K+4E+4V+2X+5S+5H", "G=2M+2T+2I+5Z+4W+3Y+2M+3N+2T+5E+1Q+4Q+5M+1C+2V" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case42() {
    String[] marketGoods = { "P" };
    int[] cost = { 13 };
    String[] recipes = { "B=2S+3S+5P+4P+3S+5S+5P+2S+5P+1S+2S+3S+2P+5P+4S+4S", "V=1O+2C+5D+2X+4M+2U+2N+4W+4H+2J+3P+3J+3G+2B+2D", "A=3Q+2F+1C+2F+4R+4Q+3R", "S=2P+2P+4P+2P+4P+5P+5P+2P+4P", "X=3Q+4T+3B+4F+2Q+1C+3R+3B+5B+3F+4B+4S+1C+3R+1S+5C", "E=3M+4M+3F+4G+2N+4Q+1X+3X+3B+1M+3F+3Z+3L+2X+3Z+3L", "N=3A+1A+4Q+1S+1F+3P+3Q+2X+3R+4Q+3S+2R+4P+4C+3B+2Q", "U=1Z+3B+3N+3S+4L+5B+5B", "C=2R+3R+5B+2S+5B+5P+1S+1P+4P+3S", "F=1R+3S+4P+2S+1B+4P+4B", "W=1H+5E+5L+1T+1E+4R+1M", "K=1H+4S+2N+4L+3A+2P+2X+1B+2Q+2N+3Q+2H", "R=3S+4S+1B+1S+4B+2B+4P+5S+5B+2S+3B", "Z=3L+2A+3G+4N+3Q+1R+2L+4N+5X", "I=3O+3T+3C+3D+1S+3T+2R", "Q=1F+4R+5S+2C+3S+5T+4C+1F+5B+5T+4B+2R+1S+4P", "J=2W+3R+4Z+3B+2C+5E+3W+2P+4N+2P+3N+2M+3L+4Z+2L", "L=1G+5N+1P+3C+3F+3A+5R+3T+1G+5X", "H=2E+1A+3R+5N+5B+2U+1U", "D=3J+1P+5G+2A+5X+2G+2B+4S+5U+1A+2A+3B", "Y=3V+3V+5L+4L+5B+1X+5X+4J+2D+3Z+5I+3E+2O+2A", "LOVE=3I+4Z+2M+3M+1P+4B+3H+5M+5M+5P", "O=1D+2F+2B+5U+5R+3M+5X+1E", "G=3N+5R+4X+4Q+5N+5N+5A+3T+4C+1Q+1N+5F+3F+2Q+1P+3T", "T=2C+3B+2F+3S+4B+1R+5S+3R", "M=3L+4L+5G+5N+1P+1X+5R+4T+5P+3T+4C+2X+1R+2C+1C" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case43() {
    String[] marketGoods = { "P", "O" };
    int[] cost = { 13, 14 };
    String[] recipes = { "B=1I+2W+2U+3D+1U+2L+3D", "V=1H+4W+5R+2L+5T+1H+3F+3H+2P+3J+3P+3Y+3F", "X=2N+2C+1H+5Q+5Y+3V+5N+5Q", "X=2Q+2H+5F+4B+4N+5H+1S+1A+1Q+4B+2H", "B=2I+4J+4A+4U+3O+4J+5P+1Y", "W=1D+2Y+4J+3Y+5Y+1R+4J+1J+1U+4D+3D", "Z=3K+4U+3O+1X+2A+4O+3A+2S+3H+4S+3S+2U+3X+5B+3N+4C", "N=3E+4J+3J+4P+5J+2Y+3C+2I", "E=3H+5O+4J+5D+2I+3B+1C+5U+4A", "D=2U+1C+4F+4R+1R+3X+2N+2O+5U+5V+1R", "Q=1V+3O+3P+4A+4C+4V+1W+5L+3W+3H", "M=1Z+5T+3K+1P+2W+3A+2W+3J+2B+4C+4F+2N+2Q", "G=2K+1D+1S+5R+4N+5X+5X", "J=1S+5H+5Y+5F+5S+5S+4R+3P+3O", "K=2Q+2P+3U+5L+2I+2B+3C+1B+2V+2B+3E+2I+1Q+3L+2C+3N", "H=2B+5L+3A+2W+4K+2W+2C+3J+2C+1P+3R+4I", "T=2G+1A+4R+2P+2Z+3Q+5A+1S+5R+5Z+5Q+3K+5I", "U=2S+1O+2P+5L+3J+2S+2K+4F+2P+2R+2C+5P+5R+2R", "LOVE=1M+4V+3A+1K+1O+5W+3G+2G+1M", "V=1H+5F+2C+5E+1I+5U+2R+1F", "C=3J+3R+1F+3O+2R+4L+4L+1F+4L", "W=3C+3O+5P+2R+1P+3O+4Y+3F+4O+3F", "Y=3O+2P+4P+1P+1O+5A+1P+2Q+1P+5P", "M=3G+1R+5S+1P+3Q+2U+5V+4P+1G+2E+5O+2G+3E+2X+5R", "A=3W+1F+1Y+3L+3L+1U+2O+4U+2X+4Y+2D+2Y+1D+5L+2P+4Y", "G=1Z+2V+2F+1S+3A+5A+2Y+1R+3J", "L=2Y+5P+5O+2O+1O+5Y+1O+4O+3P+5Y+4O+3Y+2O+4O+3Y", "C=1J+5Y+2L+2J+3S+3V+2F+5S", "U=3J+4P+2R+3F+2P+2R+1P+4O", "H=2I+2F+1J+5L+5O+2C+5B+1U+2F", "Y=1P+2P+1P+4P+4O+1P+2O+3O+2P+2P+4P+3O+4O", "E=1B+1U+2L+4J+3T+4L+1D+3B+5Y+2W+3R+3P+2R", "D=2C+5S+4O+3U+4F+4P+2C+4C+2O+5Y+1L", "I=3A+2A+3B+3C+1D+3C+1P+3J+2O+2S+4S+5O+3J+1A+3J", "S=2F+1R+2Y+4Y+3Y+1R+3R+3Q+5O", "F=1R+4L+4O+1R+2L+1P+3O", "L=3O+3C+3O+4P+4P+4O+5P+1O+2Y+4Y+3P+4Y+4Q+4U", "F=1L+3R+5P+1P+5P+1L+3R+3R+2O+4P", "S=2R+3F+5Y+3L+1F+1L+3Y+4F+2L", "N=1E+2X+2H+1D+5P+4Y+3I+1A+2H+3F+5F+1E+5L+2H+1I+2V", "A=1W+3F+1F+4W+4S+3U+3R+2U+3C+4W+3U+3S+4L+1O+3O+4Y", "K=1X+4O+4B+3S+5Q+4C+2J+1L+5D+3C+4F+2Y", "R=2Y+5O+5L+2Y+4O+4P+2P", "I=1A+4D+3A+1D+4W+3O+2Y+1F+4L+4Y+2A+3J+3S", "Z=3X+5X+1K+3W+1A+2C+5E+1U+2D+1Q+2V+4Q+4V+1P+2O", "J=1S+3Y+2R+4S+1P+2O+3S+3O+3P+1L+1L+4L+1P+4S+3Y+5Y", "R=3L+1L+5Y+3P+5Y+4P+3L+5L+1Y+3O+2P+4L+5L+4L+5O", "Q=2V+4A+5U+5O+2E+3J+2C+2F+2P+1H", "LOVE=2M+5M+5V+5N+4R+1C+2B+1W+4E", "T=2G+3P+5N+1I+2P+2L+1R+3K+1P+4B+5E+2V+3J+2A+3X" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case44() {
    String[] marketGoods = { "CEDSC", "USEXK", "FKVAK", "VCXPZ", "GHSKL", "MYEUI", "SMDNY", "ZHVSZ", "NCYFJ", "NTJRQ", "ZAJUW" };
    int[] cost = { 6, 2, 1, 2, 9, 8, 6, 1, 5, 8, 2 };
    String[] recipes = { "XCXNI=3NCYFJ", "XLSRX=3UJZMZ+1PLOFP+3TJZLL", "GHSKL=2USEXK", "IRNJS=1ACQEG+2HNWYN+1LKPQB+2XCXNI", "XETFV=1IOGAA+1XJUKL+3PLOFP", "XLSRX=3UJZMZ+3KLIVH+1SMDNY", "KBYUL=2MKXYL", "VXESD=3VCXPZ+1HNWYN", "MKXYL=3TJZLL+2VXESD+3IRATN+1ZAJUW", "FKVAK=2USEXK+1USEXK+2CEDSC+1CEDSC", "HKQFV=1XLSRX+3SMDNY", "VCXPZ=1CEDSC+2CEDSC", "LOVZQ=1XJUKL+3USEXK+3UJZMZ+1IRNJS", "ZUMER=1CEDSC+3NTJRQ+3SMDNY", "TJZLL=3ERWMZ+1CEDSC+3USEXK+2GHSKL", "ZWEWH=2UKZIF+1XJUKL", "ZAJUW=3NCYFJ+3SMDNY", "IRATN=3TJZLL", "VCXPZ=2USEXK+2USEXK+2CEDSC+1USEXK", "OBNRD=3RTXYK+1TJZLL+1VCXPZ+3ZWEWH", "IRNJS=2XCXNI+3NTJRQ+3TJZLL+3ZAJUW", "FDBFT=3ACQEG+1IRNJS+3KLIVH", "NUJYC=2ZAJUW+1RTXYK", "BLKVD=2OQDKL+2SMDNY", "IOGAA=3VXESD+3UJZMZ+1XRJBT+3CEDSC", "ZAJUW=1SMDNY", "HKQFV=2UJZMZ+2IRATN", "LOVZQ=1TJZLL+3NTJRQ+3FKVAK+3IRNJS", "MKXYL=1CEDSC+1NTJRQ", "KDQWW=1XJUKL+3GHSKL+2ZUMER+1RTXYK", "UILCL=3USEXK+3NUJYC+1XRJBT+1MYEUI", "KLIVH=3ZUMER+1RTXYK+2XJUKL+2UKZIF", "XJUKL=3VCXPZ+2MYEUI+2GHSKL", "RCLHT=3UILCL+1CEDSC+2CEDSC+1UJZMZ", "FEYCH=2FDBFT+2SMDNY+1IOGAA", "LOVE=2KBYUL+3MYEUI+2IRATN+3CEDSC", "XJUKL=1NTJRQ", "XJUKL=3USEXK+3USEXK+1GHSKL", "UKZIF=1ZUMER+3UJZMZ", "LKPQB=3GHSKL+3ZUMER", "SMDNY=1MYEUI", "IRATN=2KDQWW+2SMDNY", "RTXYK=1HNWYN", "HKQFV=1XJUKL+2IRNJS+2ZWEWH+2ODLEL", "GHSKL=1CEDSC+1VCXPZ", "ETHHX=2MYEUI", "OQDKL=1LOVZQ", "GHSKL=3VCXPZ+1CEDSC", "VKGQR=3UJZMZ", "HNWYN=2USEXK+2LKPQB" };
    assertEquals(1850, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case45() {
    String[] marketGoods = { "CFGIU", "WITBZ", "TWHND", "JHWXT", "XVYAY", "HRPNY", "SVCEU", "EDFBG", "BBGZW", "CEZHC", "WNANF", "PFUHW", "KCCFS", "MXTQE", "IGOLK", "UJJTV", "KMTCP", "UHJPJ" };
    int[] cost = { 78, 30, 19, 34, 54, 60, 92, 52, 4, 91, 61, 95, 17, 93, 27, 29, 60, 58 };
    String[] recipes = { "GAQRJ=5UHJPJ+8OBOQQ", "UJJTV=4HRPNY+2XVYAY", "HRPNY=5WITBZ+7WITBZ", "MKOBS=2BBGZW", "IGOLK=3WNANF+9JHWXT+4CEZHC", "XBNXX=9KCCFS+5KOBTV+3GZQRJ", "CFGIU=9CFGIU", "HXLZW=1ULTJM+4FFWEY", "VJTYU=2WITBZ+2KCCFS+6IGOLK+9XVYAY", "GGOXI=6NVNRE+7KMTCP", "EZPYF=2KMTCP+2KMTCP+2TWHND", "OVNJC=8CEZHC+3CFGIU+2CEZHC+5KCCFS", "AGWXQ=2XVYAY+7EAYTM+3XXKGZ", "DBJKT=4QAGFR", "SVCEU=1HRPNY+2CFGIU", "EZPYF=5CEZHC", "KESOZ=5UHJPJ+7XIDGN+3OBOQQ", "NVNRE=3XVYAY", "XIDGN=6CEZHC+2WITBZ+9OBOQQ", "KOBTV=3TWHND+3WITBZ+5XIDGN+4WITBZ", "TZNPL=5CEZHC+4HRPNY+5KCCFS", "UJJTV=5CFGIU+9CFGIU+8BBGZW", "MPLSQ=5DFKNZ+8XIDGN", "UJJTV=8WITBZ+1BBGZW", "PFUHW=8SVCEU+3JHWXT+4CFGIU", "XLGHN=4XVYAY+9UPJOO+8WITBZ+7KMTCP", "DBJKT=4OBOQQ+2KMTCP", "LOVE=5UHJPJ+7XIDGN+5XBNXX", "FEUQP=3OBOQQ", "CEZHC=6WITBZ+7XVYAY+9EDFBG", "JEAEJ=1BBGZW", "JHWXT=7CFGIU", "IGOLK=5WNANF", "OBOQQ=5UJJTV", "CTITD=2BXVRW+1UQLFC", "TWHND=4CFGIU+6WITBZ", "BBGZW=2CFGIU+1CFGIU+9JHWXT+9WITBZ", "EDFBG=8HRPNY+7JHWXT", "HRPNY=1XVYAY", "QQWME=5KMTCP", "FEUQP=5GAQRJ+4KMTCP+4BXVRW+9IGOLK" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case46() {
    String[] marketGoods = { "IODUBVJK", "NXDJYWVGY", "UAF", "YHDBRSZZZTXT", "GGSQLNBYM", "ATQXZIM", "QUWCPTU" };
    int[] cost = { 22, 41, 26, 35, 48, 84, 4 };
    String[] recipes = { "LWZQIR=9MUVXRIRH+5QUWCPTU", "QQFWR=3YTVLNQ+7MUVXRIRH", "C=9BDMLD+6UAF+1BDMLD", "FOEVSHCZQ=1GGSQLNBYM+9QQFWR+8KSB", "YTVLNQ=4BDMLD+6UAF", "C=1GGSQLNBYM+6UAF", "IODUBVJK=3ATQXZIM+8QUWCPTU", "YTVLNQ=6JWMSFMH+6JWMSFMH+4LWZQIR", "NXDJYWVGY=1IODUBVJK+8IODUBVJK", "YTVLNQ=3IODUBVJK+1M", "IODUBVJK=9IODUBVJK+1IODUBVJK", "WDETSY=9JWMSFMH+4NXDJYWVGY+1XNEI", "ATQXZIM=8IODUBVJK+4NXDJYWVGY", "WBTKRHYJXQZGQBV=2KSB+7GGSQLNBYM", "YTVLNQ=5CATPEXRNPOZGFNL+9ATQXZIM+9MUVXRIRH", "YHDBRSZZZTXT=1UAF+9NXDJYWVGY+7NXDJYWVGY", "LOVE=2XPYYNNKVYKYFYY+7C", "M=1CM+4SBKHGCYTOTEJP", "JWMSFMH=9NXDJYWVGY+5GGSQLNBYM", "ATQXZIM=5LOVE+2XPYYNNKVYKYFYY+1WBTKRHYJXQZGQBV", "LOVE=5NXDJYWVGY+6WDETSY+6VQGGNR", "M=3MUVXRIRH+8KSB", "KSB=3NXDJYWVGY+7IODUBVJK", "TDOJFECJY=4BDMLD+3QUWCPTU", "WDETSY=9XNEI+3IODUBVJK+9NXDJYWVGY", "FOEVSHCZQ=2ACMG+7YHDBRSZZZTXT+9GGSQLNBYM", "ATQXZIM=6IODUBVJK+7NXDJYWVGY+5GGSQLNBYM", "MUVXRIRH=7UAF+7IODUBVJK", "NXDJYWVGY=5IODUBVJK+7IODUBVJK", "WDETSY=4C+2SBKHGCYTOTEJP+2MUVXRIRH", "WBTKRHYJXQZGQBV=6KSB+1CATPEXRNPOZGFNL+1LOVE", "ATQXZIM=8IODUBVJK+3IODUBVJK+1YHDBRSZZZTXT", "WDETSY=5YHDBRSZZZTXT+8C", "IODUBVJK=6IODUBVJK+2IODUBVJK+9IODUBVJK", "YHDBRSZZZTXT=5IODUBVJK+4NXDJYWVGY", "LWZQIR=2GGSQLNBYM+1ATQXZIM+4NXDJYWVGY", "JWMSFMH=5YHDBRSZZZTXT+8UAF", "CATPEXRNPOZGFNL=1YHDBRSZZZTXT+3YHDBRSZZZTXT", "IODUBVJK=3IODUBVJK+5IODUBVJK+7IODUBVJK", "FOEVSHCZQ=2ACMG+8C", "WBTKRHYJXQZGQBV=2C+3UAF+1NXDJYWVGY", "VQGGNR=6C+8C+1GGSQLNBYM", "QUWCPTU=6JWMSFMH+4QQFWR", "MUVXRIRH=4LOVE+5KSB+8UAF", "SBKHGCYTOTEJP=5WBTKRHYJXQZGQBV+1UAF+4ACMG" };
    assertEquals(28471, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case47() {
    String[] marketGoods = { "QRXDL", "KXZNOWJYQHMHZ", "DVNNQMNXEMIP", "XRHAIHNHLJMT" };
    int[] cost = { 16, 63, 78, 45 };
    String[] recipes = { "DX=5MHRBAVX+7LSPTZC+6MHRBAVX", "DEGBT=5JS+2KM+4MZUML", "HQEQYB=4THANIKDVWDFZLWN+3MHRBAVX+3IXQ", "LZALGHKRLKYJ=5CYBOD+9KM+4CYBOD", "LZALGHKRLKYJ=2XZPSZUGU+8DVNNQMNXEMIP", "NJYVNLI=4XRHAIHNHLJMT+1IMVFE+3DWEZEFPMLKWU", "LOVE=8G+1IXQ+7NJYVNLI", "LOVE=9IKJCEPXGWHC+4MYBTFAH+4TOKTY", "DWEZEFPMLKWU=6MHRBAVX+6LSPTZC", "DEGBT=2RM+2DVNNQMNXEMIP", "OZVHYLFEHZ=5E+9RM", "CYBOD=3XRHAIHNHLJMT+4RM+7QRXDL", "LOVE=3HRNRDU+8RM", "UXHPZNTPCS=1SFGCHYMJY+2LZALGHKRLKYJ", "IKJCEPXGWHC=8SFGCHYMJY+7NJYVNLI", "JS=4IXQ+8RM+8NJYVNLI", "S=9LOVE+3E+3IZBJTJF", "OE=6LSPTZC+5LSPTZC+8CYBOD", "IMVFE=5ZHZ+6QRXDL+1JS", "IMVFE=5CYBOD+1KXZNOWJYQHMHZ+7KXZNOWJYQHMHZ", "KM=6SFGCHYMJY+8DEGBT+4DEGBT", "LZALGHKRLKYJ=5DVNNQMNXEMIP+3XRHAIHNHLJMT", "QRXDL=2QRXDL+9QRXDL", "OMB=4QRXDL+5IZBJTJF+1IXQ", "KM=3DEGBT+4IMVFE", "LSPTZC=9KXZNOWJYQHMHZ+4DVNNQMNXEMIP+6QRXDL", "OMB=1XRHAIHNHLJMT+2TFSEJBIPKK", "HRNRDU=8DEGBT+7CYBOD", "DWEZEFPMLKWU=6LSPTZC+3LSPTZC", "IZBJTJF=6NJYVNLI+6XRHAIHNHLJMT", "RM=6KXZNOWJYQHMHZ+2QRXDL+7KXZNOWJYQHMHZ", "IZBJTJF=8XZPSZUGU+6THANIKDVWDFZLWN+1WDEZUWJU", "IW=6KXZNOWJYQHMHZ+5HRNRDU+2HRNRDU", "MZUML=5DVNNQMNXEMIP+8QRXDL+2RM", "HQEQYB=2DX+8DEGBT+6TFSEJBIPKK", "LOVE=7XRHAIHNHLJMT+7MHRBAVX", "DWEZEFPMLKWU=6SFGCHYMJY+9DEGBT+6RM", "CYBOD=1MZUML+3IBTALXEXNT+6IW", "AIWRKZMIFMLI=9MYBTFAH+1WDEZUWJU", "MZUML=8IBTALXEXNT+2OZVHYLFEHZ+7IW", "G=9LSPTZC+7KM", "NJYVNLI=5AIWRKZMIFMLI+1DWEZEFPMLKWU+4RM" };
    assertEquals(128071, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case48() {
    String[] marketGoods = { "BMMC", "DKCT", "M", "B", "V" };
    int[] cost = { 66, 65, 21, 59, 44 };
    String[] recipes = { "ZYCH=9V+9B+7M+9O+9BMMC+6X+7VGT+9BMMC", "ZJTGE=6ZYCH+6M+8O+7X+6V+5DKCT+5C", "B=2ULHZY+5DKCT+8LOVE", "DKCT=9BMMC+5BMMC+9BMMC+8BMMC", "V=7ZYCH+1ZJTGE+3O", "VGT=9C+6C+7M+7BMMC+7BMMC+8B+6O+8B", "LOVE=9O+9LOVE+1ZJTGE+5ZJTGE", "M=3VGT+4X", "VGT=5M+7B+7X+8B+9M+6O+7X", "M=2DKCT+5M+3LOVE+5BMMC+1X+4DYVCB", "C=6O+8DKCT+8M+8X+5V+9B+8DKCT", "B=5DKCT+6DKCT+9BMMC+5BMMC+9M+9DKCT", "O=4BMMC+1C+3ULHZY+6VGT+1ZJTGE", "LOVE=8ZYCH+7X+5DYVCB+7O+7VGT+8DKCT+8ULHZY", "M=8DKCT+5DKCT+5BMMC+6BMMC+6DKCT", "DKCT=7BMMC+8BMMC+6BMMC+8BMMC+7BMMC+7BMMC+8BMMC", "X=4DYVCB+5DYVCB+7VGT", "BMMC=3C+4ZJTGE", "M=7BMMC+5BMMC+5DKCT", "BMMC=5BMMC+1DKCT+9BMMC", "O=8BMMC+9DKCT+8BMMC", "DKCT=8DYVCB+9BMMC+1ZJTGE", "B=8BMMC+7BMMC+5DKCT+7DKCT", "V=5M+9BMMC+6BMMC+7M+8BMMC", "X=5O+5V+5M+9O", "ULHZY=8X+9ZJTGE+8ZYCH+6VGT+8ZJTGE+7DKCT+6DKCT", "ZJTGE=6VGT+6ZYCH+7B", "DYVCB=5X+7M+8M+8V+6B+6DKCT", "V=9M+9M+8M+7B+8BMMC+9BMMC+5DKCT", "BMMC=2ZJTGE", "C=5V+6C", "M=5DKCT+8DKCT+6BMMC+5BMMC+5BMMC", "LOVE=8C+5ZJTGE+9DKCT+8X+8ULHZY+6VGT+5ZYCH", "M=3O+9ZJTGE+1LOVE+3BMMC+8X", "DYVCB=1V+4B+8VGT+3ZJTGE+7DKCT", "DKCT=7DYVCB+1M+2C", "X=6C+9DKCT+3ZJTGE", "ZYCH=9C+9VGT+8O+8B+9V+5VGT+6B", "M=9BMMC+7ULHZY+7ULHZY", "VGT=6BMMC+5ULHZY", "V=3ULHZY+6C+8O+9V+4BMMC+9M" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case49() {
    String[] marketGoods = { "NLZ", "YBKJ", "FLN", "IB", "QV", "C", "FUF", "Q", "WC", "GK", "ZOU", "HF", "SVE", "TW", "GNC", "OYK", "YKX", "TZ", "W", "P", "ZLQC", "B", "U", "QOR", "BC", "NTK", "EFVE", "TH", "IMS", "PBB", "DDN", "IMN", "AD", "MD", "SGR", "JV", "CT", "WX", "BH", "ZC", "HDA", "IHSE", "GXP", "WDBC", "PQ", "VE", "DGX", "YIH", "LUB", "WAD" };
    int[] cost = { 28, 15, 23, 21, 2, 37, 45, 47, 44, 32, 33, 26, 39, 6, 42, 19, 21, 26, 47, 22, 11, 40, 23, 4, 21, 34, 47, 31, 21, 20, 29, 39, 20, 29, 22, 36, 32, 5, 38, 9, 40, 5, 36, 32, 15, 29, 44, 27, 32, 44 };
    String[] recipes = { "QIU=7RL+1SV+7A+8ZV+6BA+5GQ+1H+1LCY+4OTZ+3OJ+6RMA", "BOE=2JYJN+9FF+8JYZ+8KX+9GGL+6DLJ+9MJ+2ZQI+3WTWT", "CS=5OG+1QIU+9UPF+9YLQ+5MC+8VXA+1IQ+7PV+8UVV+2SJM", "HAQ=4RJHM+6QCI+2KJ+5JU+4KAP+8UNNQ+3S+6JQ+8NH+2WD", "WJE=6XME+6OTY+5X+1D+1CDC+1MV+2L+6I+6DQ+1EH+8LR+6WD", "YF=1QF+4S+1TQYK+6LMW+6LY+5LE+6RH+3I+3DIL+7XA+4NKOT", "BN=8LI+8VB+9AH+6GM+8CH+3MNZ+2D+4IMBW+4JT+2LM+8RZ", "RD=7NIK+9AGO+9Q+1GEX+4QBQ+2DS+8IA+1LHT+2H+2GU+4MR", "WX=5OMG+8NLP+8OTBN+5RRS+8YA+9FH+5S+1HO+2PWL+5KJ", "NTK=7G+5ROP+3VDQY+9ZBTX+1NP+3GW+1S+3VNE+6YF+1K", "LR=2F+8IFYB+8DKX+2DBN+4G+9DZ+4FM+3ZGU+6PDM+4RA+5RW", "SKG=3DI+5SH+7ZL+6CS+6Q+7RPN+1BEM+3YSX+1I+2FPP+4SJV", "NTK=9RO+3JOB+3YVV+9GJ+7SJRB+7GQP+8YME+1TH+6WS+3FOZ", "ZRCZ=6PGR+3IF+6MTGW+9WY+7OX+1P+2MT+2ERO+9IX+8YDS", "OYK=8H+2KP+9AUC+3YQT+2JQ+8WQ+8VU+1Z+5CIOX+9MDN+2S", "LOVE=6ZQG+8AEJ+5ISMY+3DKY+9Y+1VG+9YH+4FC+6DJC", "IYB=2DI+1BN+2RUK+5FD+4FT+2E+7TX+6A+2RHG+2BLV+1QZO", "D=3WG+8KS+4X+2OM+8A+2TZ+6SG+7MI+9LXL+1FQZ+7IZ+2PDE", "BCQF=4WD+3LPIQ+8RXV+1DLPF+1LWI+6GNT+6BMET+8Z+7RFL", "DDN=7P+9WR+9SI+4BL+1WTN+4TWV+8BWV+7GYWU+4DCP+6YZB", "STP=2ZIQ+4DT+6YCE+3RE+8LCG+9TA+7VE+5OEP+9EC+9D+9AJ", "I=1BA+3RR+4IOH+7T+7BCQF+4JQF+3NNUW+5MO+7YXI+5JP", "O=5DYUZ+8ER+1CXJ+9PV+3CVZ+9FB+7BOE+3XYGW+4OYWS+5MR", "NKM=1XM+8WO+9KBC+3KX+8TVX+7MVU+8E+5NF+8B+3RD+2B", "RPN=5HHOI+1N+6I+6EB+1DZ+3HBV+3SZ+8DE+7FI+9OSO+2E", "N=3UEA+9QE+6ZMU+8GJ+7NLH+1AM+5CP+3CEJL+9BGN+4BQX", "FC=1HDS+6VUB+5ZE+7PPZ+1RSGW+5N+8BXO+8FJ+7BRQ+2OKN", "U=8LB+9RE+4SM+5AM+8WJE+8DSR+8HK+8X+4Q+5FODP+4IUU", "TH=2WG+4DO+8KB+2DUO+7HSVP+8HME+4PTAT+3GHO+3AMAN", "NLZ=6L+7AMQ+7SB+2JWBP+3NPJ+2JPHN+4WZO+5UI+5DPIB", "JV=4S+2ZOS+4MUD+2M+5LD+2DH+8AY+9FO+6SR+2GI+7VEQ", "IF=3A+5G+5VFO+9RW+8YR+5JM+9EXU+2XAU+2LNM+9RM+2WG", "JV=4G+9ANJG+3AZ+9YE+3NR+1INK+6YUD+5SWU+3HN+8MJV", "KJ=9MI+6FA+2HG+6EPK+9ICU+6TB+2LA+3RREY+2EPN+1AD", "FA=2WQAG+7FAAT+4KEK+8WZD+6VACX+8OOW+6JR+8MCI+1HX", "YH=5DIZY+1SWRW+6NZ+4GVZ+9HM+8EOZS+3BAR+3ETH+4QPS", "WJE=6H+2BT+1VYD+5AS+1NKE+5LVV+9AOS+4UD+6QMG+3NKM", "G=3XDB+4IBMT+3KTA+2GSA+7CVQ+9OP+5ZCYT+4FWE+2XY+4FM", "FJ=1FF+1PJDK+9BX+1N+1EJ+5PJS+1LK+1SPN+4QLX+2FK", "QFO=2BTH+3SJ+8PHY+6QMBR+4CEC+8FXQ+3IT+5XS+1ORT+6EY", "TH=8F+4APD+2GT+4LF+5KAZ+5WQ+6UWG+8AFD+3LWJ+9ZM+5W", "SGR=4G+4PS+2OC+9A+5LV+5DO+5RN+3O+6XJ+3SX+9DJ+2MYDF", "P=2GS+1MZ+8KP+4ZIR+5H+3SWYA+3R+9BY+5PRX+1NE+9EFTM", "DGX=8AE+5FDB+3FY+6J+7JKC+8C+7MM+5LGZ+1EYO+1FJC+6Z", "CT=5OT+1ZRCZ+5X+8STP+9QP+9S+9QFO+6XXX+9HHX+6UQZ", "IMS=2DAW+3BE+2VPW+5DH+4RIH+9RDHU+8ELI+2XLEB+8OGF", "U=6OVTY+5LQL+5BZ+2UQXL+5AKZ+2YA+7MNQ+8LK+2N+4MR", "HH=4B+2EK+9OOO+1R+1UN+3NB+7LD+6WX+7QLME+3GV+8BR", "X=3HAQ+6FWJ+7HH+9QCDX+8SKG+4LNJ+5YXZ+3IYB+5FOL+3EQ", "ZMU=3BX+9YZ+1FE+9UO+2QFC+1L+1PH+7EH+1GTO+9D+4YU" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case50() {
    String[] marketGoods = { "ZC", "Y", "O", "P", "E", "R", "N", "LL", "NS", "B", "A", "MR", "D", "JY", "TJ", "MF", "J", "JU", "WV", "JJ", "RI", "UB", "YM", "F", "UH", "WZ", "OH", "I", "M", "NR", "U", "T", "BF", "Z", "VK", "G", "SV", "K", "BY", "LZ", "MB", "QX", "Q", "W", "TL", "TO", "OS", "KA", "DH", "OL" };
    int[] cost = { 49, 18, 39, 25, 32, 37, 17, 40, 29, 41, 48, 22, 40, 47, 6, 35, 7, 15, 25, 19, 34, 29, 32, 25, 11, 48, 46, 21, 20, 16, 31, 42, 44, 38, 4, 2, 46, 14, 46, 27, 40, 10, 24, 38, 40, 10, 1, 43, 7, 7 };
    String[] recipes = { "PQ=5YC+3AZ+3EO+6UM+6RT+1NV+8RK+7IC+7IH+2UF+7UY+9XX", "CF=5MS+7IP+6HH+1QZ+8LJ+7BU+6XP+1RO+1HI+4EC+8JE+8SK", "UE=8GV+3YE+6UQ+5DU+9OI+5RP+9DB+7XS+5LN+8QJ+8JM+4DQ", "LC=4CN+4DS+7UV+8BB+1SA+9NN+1KC+2OF+9LT+5RN+7EM+1RX", "AV=8BV+3MJ+4XB+6NG+4TX+6MP+9AR+1EU+1DR+3PW+5DX+8JR", "VT=3DI+9JD+2JW+7IF+7XE+2BP+2NC+3WW+8LG+3AG+3SL+7JG", "OE=7YB+5XT+8SC+6CW+1IE+6LQ+8EY+6ID+3RH+9KP+2ST+3MH", "TZ=8PQ+5JT+5WX+7KL+9AX+5OX+5HZ+3GD+3AQ+8PS+5IX+9TY", "LW=5YL+7YF+8DW+7NU+8PT+9FB+7VS+1OU+6YP+8VZ+4JS+6QY", "BY=3PJ+7TC+5TG+8LI+6NM+4OB+6TB+3GG+6BR+9GH+7CS+3PU", "L=9KR+9AA+3WD+7XJ+7AO+2US+1LC+6V+2JC+2RW+9ND+3XY", "GS=8QC+1LS+2QE+6BL+1ZX+4HM+7YU+5WB+7XF+2MT+2QD+5YS", "UE=3QL+4YT+9FK+8ZH+1DM+7UT+8OM+8AC+2YW+9VO+5SS+1LA", "ND=6CO+3LP+2UJ+1TV+8GE+8UX+8LW+8ER+5AM+5KU+3RV+2EG", "NN=2LF+2YV+9CB+1XG+5RM+9XR+6XO+6YN+5ZP+1EL+5IK+5CX", "MI=9UO+6YJ+7IR+4KX+8VH+8FG+2DV+6OJ+3PV+6TP+4KJ+3SG", "Y=2CF+9WA+4PH+7KS+7QV+4EK+9VQ+5FH+7CL+1C+7NQ+3EJ", "ZF=3OD+3DE+2HG+6IS+3DD+6IL+4WF+2AU+4XQ+3UN+7DA+6SX", "A=6GJ+6DF+1SJ+3ZG+9GN+6RB+7VY+7TD+5JN+1YD+8ZS+4IO", "VN=9LU+1GO+4SN+5VX+9GU+9VU+3PN+9RU+2ZW+1ZI+4OZ+9NE", "A=9GM+9CC+4CU+1VJ+5BZ+9VF+4JV+5TT+7JF+3MM+9WS+1FV", "YE=9GA+4PY+1ES+8TQ+1BI+9RJ+2HQ+9LX+8BD+4OR+9QB+5NH", "KD=4QA+6EV+1SU+7FT+2LV+9TI+2DP+9KO+3ET+4JO+6HJ+5JI", "TA=9WT+9QT+1CA+3HA+1YG+2XU+2VT+7VD+4KG+9VC+9AI+2GF", "LOVE=1FC+1S+2GS+3YH+4DT+7X+8ZJ+3QP+6TH+2XN+5UD+8L", "CC=5AP+3GK+2NB+5FN+8EF+9UW+5AT+9PO+4WN+6MK+8RD+9SF", "R=3DJ+4PF+3XZ+8BT+4NT+4BA+6BH+8H+9XL+7QF+3WR+9SR", "NR=4UC+6UZ+1CP+2FL+7CD+9QK+6KZ+9HW+3MV+4UL+6GI+8CI", "UB=4YZ+6BK+8CK+8ON+4PL+2NO+9XW+3ZZ+9HV+3WH+2LK+1LH", "XV=3WI+3OA+1TU+3GL+4WL+6TW+2IG+7YR+4KV+4ME+9BJ+8WJ", "BR=4MQ+2FX+9SB+3AJ+6XK+1DK+3UE+5FA+4HB+2LB+6HD+1AW", "UH=7JP+3IJ+6NX+6MZ+1PM+3XD+7RY+6GW+8SD+5KD+7HX+9DL", "QH=4II+2RE+3NW+8CZ+2RA+4SO+9GX+8WE+3BS+5HR+7QQ+3QW", "QX=3QI+4YY+3MG+3VI+3AH+2AY+6MI+4DY+5VN+9AL+3DN+1KN", "ER=5HO+7CY+1GQ+4BE+5LD+8XA+6ZR+8YQ+3KQ+9WP+4NP+7QO", "TA=1VB+6QR+1KB+9MY+1SW+9UG+5OT+3AE+2LY+5CT+7KF+2PC", "KA=3VE+1TA+3KI+7RC+1QG+1FY+5IW+5AS+9FI+7LO+7OE+2KM", "BR=5TZ+3JZ+3UI+8SI+2MO+7LR+6KH+4JK+9PP+1XV+7YO+3VA", "BH=6XH+4XC+6NI+3XM+3AK+6HT+1VG+8CJ+3EB+3DO+8IY+9WK", "JF=2OC+6EA+9GR+4XI+5CV+4ZU+7FS+8PG+4IB+8OP+4BM+2WC", "TP=5FQ+5BG+5VV+1OW+5JA+4NJ+4GP+9HE+1KK+3MA+3RL+4FE", "OJ=8OG+5NK+1AD+5YX+6MX+7SM+8EW+7HY+5KY+6ZA+2PZ+4BQ", "XF=2PA+1BC+6CQ+1FM+5OK+3WQ+7FP+5HK+1SP+6RQ+9TS+4AN", "DV=9FZ+3VW+2CE+9BN+7NY+5EP+5VM+7FW+7EQ+3ZY+5JL+1VR", "MF=7ZO+8PK+5SZ+9WM+3AV+7FR+8EI+3FU+2TN+4PX+2EZ+7KT", "YH=1PB+7IN+2UA+4ZE+6KE+6PR+2CR+1HU+7LE+3FO+9MN+4PE", "QU=5ZN+3HC+2FD+9TR+1GZ+2ZK+6AF+5TF+3UU+5PI+8EN+1KW", "AY=8HF+2WG+4DZ+8WO+1NF+4ZF+2FF+3NZ+5MD+1UR+2GY+2OV", "VQ=3ZB+8EH+9IM+1IA+2VP+8QH+1QS+7CH+8QU+3RS+7MU+4RZ", "GE=2ML+1TK+5FJ+2JH+1YI+6BO+4HN+8IU+9BW+2CG+1SQ+4HP" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case51() {
    String[] marketGoods = { "SW", "V", "W", "C", "D", "G", "EG", "I", "X", "JO", "PB", "YC", "YF", "JK", "RH", "LW", "F", "QU", "Q", "DA", "BI", "VD", "EJ", "BV", "N", "L", "HS", "A", "R", "FW", "B", "T", "NQ", "DG", "FF", "IM", "K", "ZD", "PH", "KI", "S", "H", "P", "U", "RV", "MK", "J", "KK", "VO", "AV" };
    int[] cost = { 34, 33, 44, 8, 7, 39, 6, 5, 33, 45, 44, 49, 36, 27, 15, 40, 38, 9, 41, 28, 26, 34, 9, 26, 18, 15, 19, 48, 25, 13, 44, 23, 5, 4, 19, 43, 24, 22, 44, 20, 29, 13, 1, 31, 30, 24, 40, 18, 9, 45 };
    String[] recipes = { "JO=5ZR+5LC+4KJ+9WI+9FX+7WQ+5SA+5ZK+7UK+2ZM+3LK+1NK", "IX=2EQ+3VM+1GY+7QF+3DK+1HC+3YK+1OQ+1ZW+9YN+6GI+5HU", "QA=9QT+8NO+9EH+1WU+5ZN+9NG+8OA+1BP+9MF+6FA+6ED+2OC", "IZ=9UZ+2JF+2EE+1RM+9VV+4KM+8QW+9QP+5NN+7PZ+7UN+9NC", "ZR=4IU+9YV+6TO+8BL+9IB+9XE+2CW+9AX+8OI+5OW+4KB+3LD", "RV=9DS+5QM+7SR+7MV+3IZ+7M+7UG+7VK+3KR+3KQ+3HI+3CO", "JL=2AW+3GM+4PK+7EW+9UX+9DW+7QV+6IW+9YA+7PO+6BQ+9VN", "C=3VC+2EX+3RY+2CU+6CH+9GW+3MS+4LY+2TN+6BB+4E+7YW", "UI=5WD+3JJ+4XP+2Z+5JI+9FT+9AG+4ZT+8XG+2CJ+7XL+9EF", "WV=7IG+3ZA+3QJ+2HX+8IT+7TG+5QH+9DX+1PS+2HO+8TV+2VJ", "VZ=2XN+4MI+4RE+4ZB+9YP+7BN+6TB+6DZ+7KH+7WH+4WE+8PD", "EO=1TU+7LM+4RJ+7UB+9UJ+6WF+9XH+4MG+2YE+2TR+1WX+4DT", "UG=1GN+2FK+4BT+4SG+5BJ+2JH+9WW+9OU+4ZY+4OB+7TI+3CX", "VK=6LZ+2GO+8OO+7DR+1UT+3JN+5VT+5BH+1IO+1IA+5BD+5UA", "RW=5CK+4DI+1JD+2YB+3PW+6FR+6SX+2UW+7DJ+3WZ+3MR+3AA", "FC=9QY+8SS+9CG+7RR+2VH+4QK+6ES+4KN+9XO+3IH+5AF+9FD", "XX=6AZ+9MH+5WM+3PU+3LR+6AQ+1EZ+6KX+1PF+9NH+1IJ+5FM", "FC=8EB+1TH+5DF+6MC+1LV+6PP+7ST+6ZV+7SL+1FB+4RC+6GR", "YW=6FL+2VG+4RA+5AM+1KF+6IF+2GZ+9CF+4GD+1GE+3YM+5WJ", "LOVE=4VZ+8UI+8CQ+5HP+5O+1BA+1Y+8IX+9MU+9YL+4UR+6GQ", "WB=4RI+1TQ+6KP+7GK+3BK+4PY+8QN+2HT+7BX+5FQ+7CP+8IP", "GA=9RL+4OL+7FE+3HB+8ML+7YD+9XU+6MM+1IS+6UO+1XW+4PQ", "WP=4ZQ+9CL+8ZU+8VS+1RF+6PL+4HF+4HQ+2OE+4LE+3XV+1BU", "OZ=1JB+8KW+4YI+5CV+6XC+7QZ+3ID+2EV+3QD+8HL+9UQ+5IR", "B=3NR+4NB+6VF+2DO+2QL+5OY+4VL+7SM+5GF+1UP+5XS+9EA", "LV=4YJ+4DD+3EP+6ZG+6NV+3EM+5SV+7RZ+3BR+8AK+3AE+8PJ", "XQ=5ON+8AY+5DY+8AJ+2SZ+4TJ+9ZI+1IK+6RD+7JW+7YU+3WL", "AC=1TX+9KU+9HD+1JL+9WB+9GV+7PA+6NF+4XZ+8SP+1WC+2XY", "ZY=9LS+2JR+6UC+8CB+9JT+5NX+3BY+7SI+9ZJ+8XR+6HG+8IY", "KJ=5CR+1UH+4MP+4TZ+1JX+7TC+3DP+8JP+7JU+3BC+1VP+8ET", "C=6FP+9YO+8TA+2VY+8WK+1NA+7CZ+9QA+4WP+8FC+1ZF+8UF", "UF=8PE+4FZ+4OS+3MX+8XJ+9II+9JA+5NE+2EC+8LO+2DH+3IE", "LX=3DV+6LL+2GG+7ND+6HR+6FV+7VB+3UD+6FO+5XK+2JQ+4PM", "RY=6RB+8AN+5VA+7FU+4OX+8PR+4JS+5CT+5CA+6WO+8XF+2MY", "IM=2ER+3DE+3OZ+6XQ+7EO+1KC+4TP+2FS+7MQ+5LP+3GP+5OF", "IV=5OJ+2QS+8ZH+5TM+4TL+8SN+6QX+1LB+3RP+6YG+3CD+2HA", "V=5LX+8MB+4TF+6YZ+5YH+2AO+4LN+7VQ+6FN+8TD+3SE+4GJ", "IK=6AL+8MW+3IL+1RT+7VX+9PI+9RO+3AI+9US+3GL+8WG+9OM", "ST=3GU+1WT+8AU+8JG+9OT+4LQ+8GX+3XA+1YQ+6WA+4VE+3MZ", "AV=3BE+8WS+6WY+7AC+2XX+2HW+9EK+9IC+9DB+6PX+1RW+8HZ", "AB=1GA+3HV+8WV+8EI+8BS+2BG+9HE+9NS+4CN+3TY+7NL+8KL", "MU=3TS+1QG+9NP+6TE+1QE+7SF+7VR+1BM+7UY+7DN+5DQ+1ZC", "F=1VU+8YR+8KE+9UE+7AP+2FH+2NJ+7ZE+1KT+4OP+2NZ+1BW", "IC=1WR+6FI+5OG+4NW+6TK+3RU+9JZ+9ZO+3EL+7XD+6DL+6SY", "G=3KA+1ZP+3AD+3OH+6LA+1SJ+7RK+8KS+6SU+2MJ+2QC+9KV", "OP=4UL+5TW+2FG+5JM+4OV+4MT+5GC+6OD+8EN+2JY+2PC+3YT", "MV=6NU+3EU+1AT+5ZS+8XI+5ME+5SH+7VI+4BF+4NT+9KY+3HK", "UY=8LU+8SC+7RG+7GB+3TT+3DM+6RQ+9FJ+5RX+8UM+4YY+4SK", "GW=1UV+7SD+8JV+8EY+7KO+4AH+5OK+6BZ+4CC+3ZX+5NY+2MN", "RE=3VW+1OR+1IV+5KZ+7CE+1JC+9LH+8LT+4AB+7QI+9MO+6SO" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case52() {
    String[] marketGoods = { "BBZ", "OKS", "GK", "Y", "AH", "PT", "JGG", "DV", "QCV", "R", "FQ", "VF", "C", "KF", "NY", "CQ", "V", "TH", "SPI", "A", "IH", "RR", "M", "H", "YB", "DDQ", "W", "N", "K", "DEU", "LO", "CO", "Z", "IC", "BT", "F", "PWY", "T", "XXC", "DM", "HQ", "EGE", "OT", "CI", "ZM", "QI", "MU", "MG", "GD", "G" };
    int[] cost = { 31, 4, 1, 28, 22, 3, 44, 42, 7, 22, 7, 35, 7, 15, 18, 19, 34, 12, 17, 29, 19, 18, 5, 21, 24, 28, 44, 41, 14, 3, 15, 41, 25, 32, 11, 12, 30, 32, 47, 18, 11, 43, 18, 38, 5, 6, 18, 23, 14, 18 };
    String[] recipes = { "MI=8BE+1DP+9GBA+7CKR+5QP+8KVW+7AF+6LWW+5CM+4TM", "KA=2ML+2BD+6DXH+3LL+2VJ+7HM+3FWC+2SSY+3TQO+7DHF", "AQ=2HSF+7JA+2MNG+1HA+1CP+9JM+8ZD+3S+4AC+8NIY+3ZS", "LOVE=4SP+4WVQ+1PCV+6Q+3ADK+9YW+7MBL+2JWX+7EF+9KU", "T=5HS+9WG+2IS+7BF+6PS+9QN+6RPS+9ZUX+6GDC+2BW+4PZ", "ALB=9DPW+6NQJ+4NQ+5TFX+8WYF+4TT+2KLD+8DEC+8ZU+4AQ", "TM=1FVJ+3UD+2FJK+2BMP+4HO+6CFM+1YI+9QQP+7MA+3UN", "M=1MTA+5RO+6SKK+1TY+9ANZ+7UR+1VT+2SCR+9INR+8JB+3EE", "DL=5FE+1NO+4IZ+4IA+4MV+3VGK+2CBY+4CG+2SRR+8QSK+1QG", "UP=8YC+9NML+6JKJ+5SQ+1YD+3TKQ+6LI+9SJ+3SD+9HF+7AFG", "U=2HT+1BYP+8WU+4RJS+3QOJ+9XE+1MMH+8YSI+4KUY+9BP", "V=1JXN+4KSS+2GP+7OG+2RHL+4NYO+8IZJ+7QR+3KW+7CYD", "J=3VGF+9LC+5ZA+8XT+3IV+8LT+6EH+4BY+4ZJC+6GGA+6CXP", "Z=6BV+2UV+6CU+8GS+2TJM+3JJ+4YS+3I+1IM+1DH+9LQ+8VI", "Y=2KIZ+2OD+2TZE+9NX+7TD+9WK+8QY+3WO+2SBS+2UAC+3TI", "IY=5TBA+7HXD+3EDU+2IID+4UCF+6HR+3CB+2FU+3EIZ+4HAC", "AEN=6EN+4VU+5GLX+9EHP+4ZQ+9YN+5QS+1NW+8BSP+3OJW", "KD=7OW+2LBP+1FIX+7TQB+9EUO+8AW+3YH+4EG+8AL+4IEO", "LOVE=5QF+1XP+2MJS+7THY+1LA+1OX+2BK+2ZE+8TML+7JGY", "WQT=8KIS+8UJ+2KNP+6U+5VB+2RH+7ET+9QA+3RB+2XZ+3NP", "S=7IP+9TSJ+8KA+5PJA+3YTN+1WJH+7NYK+1MC+4TV+4OP", "ACR=1IIE+4NC+8TN+6YQR+5FS+2RI+1KBU+8TZ+9LB+3UBF", "JM=3AZ+4VL+2BMF+1ZYB+1OSD+8CFC+2FO+3RYF+4VZU+8HG", "UX=9TS+1KWB+2DT+9HN+1TIK+6ZKB+5ZI+3QGU+9KNL+3DB", "B=2DI+3VG+8SZC+8XH+2PL+5AS+3DZP+6L+5EW+2ULS+5B+4JN", "BA=5ORH+4PE+9YX+6SVZ+3WFF+2OS+6JLJ+1YZ+5PNN+1WI", "V=6MH+4MJM+4PKO+5ATL+3HK+7GA+1JS+7SVQ+5KQW+9SS", "J=1NPQ+4EZ+2LK+4WX+3FL+8VOA+6BO+7SY+5IQH+7TPM+8FXY", "Y=7ZZ+7CDO+8RNB+8AUA+2LS+4FT+2DBC+3BBX+3IE+8FDO", "HV=4HC+1XO+2TWE+6FJR+9VSX+1PH+1KRX+8SUJ+3FWE+4SEK", "MX=2GZ+3WQY+3UCW+2YOQ+2RLA+8GQO+7GSR+7JKL+7IZQ+8HZ", "ID=1RT+3IF+7QW+1GX+7KCW+6DXF+4GYK+2DGT+4RYJ+3RWS", "S=6EB+2YXP+8QU+6ID+1AE+6WB+3VHX+3YWS+1VV+3YZH+8IG", "MTT=9UIN+7US+2UMB+8EDN+1HP+7KAV+4JQ+3UXS+5WA+9CY", "SCW=5WTE+8NK+4JP+8UM+8YFV+6CAT+3OWE+6ZC+6SA+4WIQ", "KMD=7IJZ+2HI+2UB+6JPE+3XQ+3WFW+3QTG+4PVU+7QXC+8LM", "TM=2WD+3UK+5YF+1PKK+2PU+8COT+2TWW+4XS+9LYP+9ALX", "GO=2BJE+7BZ+3VS+5XSZ+1SFI+7XB+3HB+1AT+5YZW+7PF", "I=2OXD+5KV+1OJ+8OET+7WS+1OPI+1VH+6FTA+3CV+2YV+8VRU", "AIN=2MBM+9HQK+4ZSE+3QRT+2UJT+6SGV+6AY+4NI+2FW+5CR", "XN=4FP+8CUQ+7SOK+1BUH+9HSN+4JFG+6TK+6GT+3SU+3TJ", "F=8LR+9GJ+6MPP+4FX+8BTD+2HJI+6D+9VOM+2P+8X+7ZDV", "RU=1QO+8KE+4LVA+7KGO+8KXR+8XN+1KX+5NH+8VC+5VQ+4ATV", "SD=9KS+6MJ+1AJ+2WN+9SZ+7LN+8GXZ+9KKQ+5TAK+1SW+4NF", "DOZ=3DO+8TDU+2LHY+7TNP+7TFN+2FOV+3TQ+3BS+3BJR+7JHD", "TJB=9PW+9SIP+4APQ+6OK+4RK+8OA+9FB+5PR+2VEG+7EU+5J", "YY=6BX+3VP+4VWL+3WKM+6HCS+6RKE+3MKU+4LV+1XRJ+8MM", "N=3JTX+6GIL+9DL+3ES+7UE+3RZ+9VD+2VW+3CZT+2CD+3TE", "NV=5E+5KO+1GR+7JW+9O+5BU+5WDM+2NR+6CC+7CXL+9BC", "LOVE=5QIR+1CA+8YRM+6RS+6FM+4BH+4YJ+7XC+6DZ+8NZ+6YA" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case53() {
    String[] marketGoods = { "R", "JZ", "EO", "C", "QG", "SI", "ZH", "NY", "HE", "CR", "GP", "O", "J", "F", "JT", "UW", "Y", "G", "E", "HT", "XV", "HM", "YT", "A", "I", "UI", "B", "U", "NG", "WG", "L", "S", "V", "WB", "VH", "EF", "Z", "UR", "ME", "Q", "X", "MB", "VQ", "T", "N", "WQ", "EJ", "RQ", "MN", "VB" };
    int[] cost = { 14, 17, 78, 30, 15, 62, 82, 59, 23, 51, 32, 72, 22, 61, 46, 51, 40, 28, 40, 2, 8, 6, 60, 22, 15, 12, 85, 85, 70, 14, 29, 77, 43, 47, 60, 60, 86, 73, 86, 78, 75, 22, 4, 31, 33, 61, 4, 56, 17, 40 };
    String[] recipes = { "LN=2RL+2EL+2DB+2TY+1TT+2JF+1FU+1UM+1PV+2LK+2OH+2MQ", "VD=1GQ+2FI+2DC+1HZ+1OS+1FX+2LP+2UX+1DU+2AN+1NS+1FR", "IM=2PC+2RG+1KS+1NR+2FE+1YJ+1FY+1SF+1LN+1CF+1XC+2RP", "PI=1FB+2GI+1SO+2WC+2CS+2CK+2YF+2RE+2AH+1MA+1WN+1CN", "WF=1ZS+1OD+2JA+1DW+2TO+2BS+1XI+1JM+2NF+2RW+2QC+2EU", "ZE=2SL+2GN+1IO+1PR+1EQ+2AT+1CD+2TU+1HO+2VR+1XO+2KI", "KO=2VZ+1CJ+2QE+2AK+1KO+2FC+1OE+2WO+1VS+1JC+2BK+1VJ", "LF=2BG+2QR+1OG+1AS+1AL+1LE+1ZU+1PF+1IF+2YD+1IV+1LI", "IY=2QH+1GB+2HK+1LR+2TJ+1GS+2CY+1VI+1FV+1AZ+1DI+2WD", "NS=1EW+1GK+1KT+1NW+1TX+1CV+2NQ+2RK+2FH+1ZQ+2MT+2CZ", "PP=1DD+2W+1ZI+1AG+2DE+2PH+2M+2KZ+2IT+1FD+1YX+1YL", "PB=1NL+2EP+2IZ+2BP+1LO+2YQ+2NB+1XL+1EN+2GT+2ML+1DR", "EX=2YI+1AQ+2GA+1UQ+2AR+1D+1KU+2NI+1PM+1RX+2RB+1VV", "HU=1SM+2SZ+1VC+2JX+1UU+1RD+1HN+1ZG+2HY+2IL+2YV+2TW", "PS=2TV+2VF+1IR+2AW+1RR+2AP+1PL+2IJ+1UB+2VM+2NX+2NN", "EZ=2OB+2II+1OW+2BW+1EC+2DP+1OM+1GL+1SE+2PY+1JB+1XF", "UK=1NH+2AB+2CW+2FO+1KD+2VK+2WH+1MS+1GM+2RV+1VA+2GD", "UJ=1SG+2XT+2TN+2XZ+1MJ+2TB+1XQ+2XX+1NO+2FS+1WS+1GY", "ET=1QU+2TP+2MM+1SK+1EG+2VW+2HV+1KQ+1IA+1UT+1KC+2YW", "UP=2PP+1GZ+1DJ+2UA+2PK+2TQ+1OL+2GW+2KL+1CE+1SU+1EM", "ZW=2GU+1WP+2UK+1XM+1BV+1VG+1DK+2HJ+1CT+2YA+1FW+2UD", "FQ=1MC+2RC+1GO+2WT+1OP+2RI+1XS+1OT+1UH+1NJ+2SW+1MH", "RS=1HG+2IE+2CP+1CM+1XY+2LC+2WX+1ES+1SV+2QF+2JL+2CU", "IF=1KA+2PQ+1WV+1MF+2AA+2LW+2KH+2K+2LZ+2KN+2QQ+1AV", "UF=1ZM+1SP+2QI+2FA+2AO+1LG+2EY+2NM+2EB+1BR+1OJ+1JJ", "RH=1EE+1PW+2RH+1LY+2HB+1HH+1EH+1MR+1KR+1SR+1EV+1HL", "ND=1GG+2PJ+2FG+1HC+2AM+2UZ+1WR+1P+1BY+1QT+1IB+1HI", "LN=2XP+2AJ+2GV+2DQ+2FQ+2CA+2JQ+1JO+2WZ+1TK+2KG+1BE", "TB=2SH+2ZX+2PG+1YY+2GF+1TZ+1DH+2TH+2VL+1OC+1YB+2VU", "KB=1LL+2JG+2RU+1TM+2OI+1AU+2MW+2IY+2YH+1EA+2MD+1JR", "WP=1UC+2DS+2QN+2BN+2SS+1YP+1IG+1HA+2DA+1FF+1RJ+2BT", "TS=2SX+1ZR+2XR+1AI+2TF+2QV+2BU+2RZ+2NC+1VT+2DN+2ZV", "LOVE=1PO+1IS+2IU+1MV+2UL+2QL+1QS+1QK+2OZ+1OK+1KK", "PS=1LB+1DT+1OF+1CQ+1UN+2FZ+2ZO+2DM+2ZB+1TC+1YG+2ST", "LOVE=2BC+1DY+2FP+1IH+2OA+2JU+2OU+1DL+1BO+1XG+1H", "WK=2YS+2OQ+1QP+2WW+2WU+2BM+2XJ+2BX+2WY+1ZD+2GJ+2RF", "SF=2VO+2JP+1RM+2KV+1DZ+2IW+2IK+2NT+2NZ+2HF+1QD+1ZL", "EE=1FL+1TR+1YZ+1JS+2BA+2NA+2LJ+1JI+1CX+2ZC+2CC+2KE", "LX=1DG+1ED+2YC+2PD+1LQ+2JW+2RT+1HQ+1YU+2ET+2MI+2WJ", "WE=2TE+2HD+2KY+2UY+1FM+1XW+1VY+2KX+1KM+2HP+2JY+2EZ", "WK=2NV+2WE+2IC+2FJ+1GX+2HU+2SD+2MK+2WK+2CI+2IN+1US", "KY=2DX+1YN+1YR+1TG+1MG+2GR+1WI+1KF+2QJ+1AY+1ZP+2VX", "DJ=1AE+2QZ+1ZE+2AD+1RA+1RO+2OR+1BZ+1OX+2GH+1JD+2KW", "CO=1OO+2OV+2HX+1QM+2ZY+1TS+1VN+2NU+1WL+1RN+1MX+2MY", "XA=1BQ+2ZJ+2UG+2LT+2IQ+1JE+1UV+2JN+1SJ+1QY+2ND+1NE", "HR=2PX+1XE+1UP+2LA+1XK+1PA+1RS+1BF+2DO+2WM+2ID+2MP", "HR=1FN+2PS+1UO+2YO+2BL+2ZT+1AX+2LV+1ZF+1TL+2KP+1UJ", "XH=1SQ+2XA+2YM+1PN+1AF+1CG+2KJ+1LU+2SC+2ZN+1PI+2QA", "LF=1QW+1EK+2GE+1HW+2CH+1PZ+1BI+1TA+1NK+1IX+1HS+1VP", "UE=1BD+1CB+1EX+1CL+1VD+1XD+1DF+1JK+2LM+2DV+2LX+1XU" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case54() {
    String[] marketGoods = { "R", "JZ", "EO", "C", "QG", "SI", "ZH", "NY", "HE", "CR", "GP", "O", "J", "F", "JT", "UW", "Y", "G", "E", "HT", "XV", "HM", "YT", "A", "I", "UI", "B", "U", "NG", "WG", "L", "S", "V", "WB", "VH", "EF", "Z", "UR", "ME", "Q", "X", "MB", "VQ", "T", "N", "WQ", "EJ", "RQ", "MN", "VB" };
    int[] cost = { 14, 17, 78, 30, 15, 62, 82, 59, 23, 51, 32, 72, 22, 61, 46, 51, 40, 28, 40, 2, 8, 6, 60, 22, 15, 12, 85, 85, 70, 14, 29, 77, 43, 47, 60, 60, 86, 73, 86, 78, 75, 22, 4, 31, 33, 61, 4, 56, 17, 40 };
    String[] recipes = { "LN=2RL+2EL+2DB+2TY+1TT+2JF+1FU+1UM+1PV+2LK+2OH+2MQ", "LOVE=1LOVE+1TT", "IM=2PC+2RG+1KS+1NR+2FE+1YJ+1FY+1SF+1LN+1CF+1XC+2RP", "PI=1FB+2GI+1SO+2WC+2CS+2CK+2YF+2RE+2AH+1MA+1WN+1CN", "WF=1ZS+1OD+2JA+1DW+2TO+2BS+1XI+1JM+2NF+2RW+2QC+2EU", "ZE=2SL+2GN+1IO+1PR+1EQ+2AT+1CD+2TU+1HO+2VR+1XO+2KI", "KO=2VZ+1CJ+2QE+2AK+1KO+2FC+1OE+2WO+1VS+1JC+2BK+1VJ", "LF=2BG+2QR+1OG+1AS+1AL+1LE+1ZU+1PF+1IF+2YD+1IV+1LI", "IY=2QH+1GB+2HK+1LR+2TJ+1GS+2CY+1VI+1FV+1AZ+1DI+2WD", "NS=1EW+1GK+1KT+1NW+1TX+1CV+2NQ+2RK+2FH+1ZQ+2MT+2CZ", "PP=1DD+2W+1ZI+1AG+2DE+2PH+2M+2KZ+2IT+1FD+1YX+1YL", "PB=1NL+2EP+2IZ+2BP+1LO+2YQ+2NB+1XL+1EN+2GT+2ML+1DR", "EX=2YI+1AQ+2GA+1UQ+2AR+1D+1KU+2NI+1PM+1RX+2RB+1VV", "HU=1SM+2SZ+1VC+2JX+1UU+1RD+1HN+1ZG+2HY+2IL+2YV+2TW", "PS=2TV+2VF+1IR+2AW+1RR+2AP+1PL+2IJ+1UB+2VM+2NX+2NN", "EZ=2OB+2II+1OW+2BW+1EC+2DP+1OM+1GL+1SE+2PY+1JB+1XF", "UK=1NH+2AB+2CW+2FO+1KD+2VK+2WH+1MS+1GM+2RV+1VA+2GD", "UJ=1SG+2XT+2TN+2XZ+1MJ+2TB+1XQ+2XX+1NO+2FS+1WS+1GY", "ET=1QU+2TP+2MM+1SK+1EG+2VW+2HV+1KQ+1IA+1UT+1KC+2YW", "UP=2PP+1GZ+1DJ+2UA+2PK+2TQ+1OL+2GW+2KL+1CE+1SU+1EM", "ZW=2GU+1WP+2UK+1XM+1BV+1VG+1DK+2HJ+1CT+2YA+1FW+2UD", "FQ=1MC+2RC+1GO+2WT+1OP+2RI+1XS+1OT+1UH+1NJ+2SW+1MH", "RS=1HG+2IE+2CP+1CM+1XY+2LC+2WX+1ES+1SV+2QF+2JL+2CU", "IF=1KA+2PQ+1WV+1MF+2AA+2LW+2KH+2K+2LZ+2KN+2QQ+1AV", "UF=1ZM+1SP+2QI+2FA+2AO+1LG+2EY+2NM+2EB+1BR+1OJ+1JJ", "RH=1EE+1PW+2RH+1LY+2HB+1HH+1EH+1MR+1KR+1SR+1EV+1HL", "ND=1GG+2PJ+2FG+1HC+2AM+2UZ+1WR+1P+1BY+1QT+1IB+1HI", "LN=2XP+2AJ+2GV+2DQ+2FQ+2CA+2JQ+1JO+2WZ+1TK+2KG+1BE", "TB=2SH+2ZX+2PG+1YY+2GF+1TZ+1DH+2TH+2VL+1OC+1YB+2VU", "KB=1LL+2JG+2RU+1TM+2OI+1AU+2MW+2IY+2YH+1EA+2MD+1JR", "WP=1UC+2DS+2QN+2BN+2SS+1YP+1IG+1HA+2DA+1FF+1RJ+2BT", "TS=2SX+1ZR+2XR+1AI+2TF+2QV+2BU+2RZ+2NC+1VT+2DN+2ZV", "LOVE=1PO+1IS+2IU+1MV+2UL+2QL+1QS+1QK+2OZ+1OK+1KK", "PS=1LB+1DT+1OF+1CQ+1UN+2FZ+2ZO+2DM+2ZB+1TC+1YG+2ST", "LOVE=2JZ+1JZ+2ZH+1O+2J+2JT+1WK", "WK=2R+2HE+1VB+2N+2N+2VB+2N+2N+2N+1CR+2CR+2CR+6C", "SF=2VO+2JP+1RM+2KV+1DZ+2IW+2IK+2NT+2NZ+2HF+1QD+1ZL", "EE=1FL+1TR+1YZ+1JS+2BA+2NA+2LJ+1JI+1CX+2ZC+2CC+2KE", "LX=1DG+1ED+2YC+2PD+1LQ+2JW+2RT+1HQ+1YU+2ET+2MI+2WJ", "WE=2TE+2HD+2KY+2UY+1FM+1XW+1VY+2KX+1KM+2HP+2JY+2EZ", "WK=2NV+2WE+2IC+2FJ+1GX+2HU+2SD+2MK+2WK+2CI+2IN+1US", "KY=2DX+1YN+1YR+1TG+1MG+2GR+1WI+1KF+2QJ+1AY+1ZP+2VX", "DJ=1AE+2QZ+1ZE+2AD+1RA+1RO+2OR+1BZ+1OX+2GH+1JD+2KW", "CO=1OO+2OV+2HX+1QM+2ZY+1TS+1VN+2NU+1WL+1RN+1MX+2MY", "XA=1BQ+2ZJ+2UG+2LT+2IQ+1JE+1UV+2JN+1SJ+1QY+2ND+1NE", "HR=2PX+1XE+1UP+2LA+1XK+1PA+1RS+1BF+2DO+2WM+2ID+2MP", "HR=1FN+2PS+1UO+2YO+2BL+2ZT+1AX+2LV+1ZF+1TL+2KP+1UJ", "XH=1SQ+2XA+2YM+1PN+1AF+1CG+2KJ+1LU+2SC+2ZN+1PI+2QA", "LF=1QW+1EK+2GE+1HW+2CH+1PZ+1BI+1TA+1NK+1IX+1HS+1VP", "UE=1BD+1CB+1EX+1CL+1VD+1XD+1DF+1JK+2LM+2DV+2LX+1XU" };
    assertEquals(1382, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case55() {
    String[] marketGoods = { "R", "JZ", "EO", "C", "QG", "SI", "ZH", "NY", "HE", "CR", "GP", "O", "J", "F", "JT", "UW", "Y", "G", "E", "HT", "XV", "HM", "YT", "A", "I", "UI", "B", "U", "NG", "WG", "L", "S", "V", "WB", "VH", "EF", "Z", "UR", "ME", "Q", "X", "MB", "VQ", "T", "N", "WQ", "EJ", "RQ", "MN", "VB" };
    int[] cost = { 15, 16, 78, 30, 15, 62, 82, 59, 23, 51, 32, 72, 22, 61, 46, 51, 40, 28, 40, 2, 8, 6, 60, 22, 15, 12, 85, 85, 70, 14, 29, 77, 43, 47, 60, 60, 86, 73, 86, 78, 75, 22, 4, 31, 33, 61, 4, 56, 17, 40 };
    String[] recipes = { "LN=2RL+2EL+2DB+2TY+1TT+2JF+1FU+1UM+1PV+2LK+2OH+2MQ", "LOVE=1LOVE+1TT", "IM=2PC+2RG+1KS+1NR+2FE+1YJ+1FY+1SF+1LN+1CF+1XC+2RP", "PI=1FB+2GI+1SO+2WC+2CS+2CK+2YF+2RE+2AH+1MA+1WN+1CN", "WF=1ZS+1OD+2JA+1DW+2TO+2BS+1XI+1JM+2NF+2RW+2QC+2EU", "ZE=2SL+2GN+1IO+1PR+1EQ+2AT+1CD+2TU+1HO+2VR+1XO+2KI", "KO=2VZ+1CJ+2QE+2AK+1KO+2FC+1OE+2WO+1VS+1JC+2BK+1VJ", "LF=2BG+2QR+1OG+1AS+1AL+1LE+1ZU+1PF+1IF+2YD+1IV+1LI", "IY=2QH+1GB+2HK+1LR+2TJ+1GS+2CY+1VI+1FV+1AZ+1DI+2WD", "NS=1EW+1GK+1KT+1NW+1TX+1CV+2NQ+2RK+2FH+1ZQ+2MT+2CZ", "PP=1DD+2W+1ZI+1AG+2DE+2PH+2M+2KZ+2IT+1FD+1YX+1YL", "PB=1NL+2EP+2IZ+2BP+1LO+2YQ+2NB+1XL+1EN+2GT+2ML+1DR", "EX=2YI+1AQ+2GA+1UQ+2AR+1D+1KU+2NI+1PM+1RX+2RB+1VV", "HU=1SM+2SZ+1VC+2JX+1UU+1RD+1HN+1ZG+2HY+2IL+2YV+2TW", "PS=2TV+2VF+1IR+2AW+1RR+2AP+1PL+2IJ+1UB+2VM+2NX+2NN", "EZ=2OB+2II+1OW+2BW+1EC+2DP+1OM+1GL+1SE+2PY+1JB+1XF", "UK=1NH+2AB+2CW+2FO+1KD+2VK+2WH+1MS+1GM+2RV+1VA+2GD", "UJ=1SG+2XT+2TN+2XZ+1MJ+2TB+1XQ+2XX+1NO+2FS+1WS+1GY", "ET=1QU+2TP+2MM+1SK+1EG+2VW+2HV+1KQ+1IA+1UT+1KC+2YW", "UP=2PP+1GZ+1DJ+2UA+2PK+2TQ+1OL+2GW+2KL+1CE+1SU+1EM", "ZW=2GU+1WP+2UK+1XM+1BV+1VG+1DK+2HJ+1CT+2YA+1FW+2UD", "FQ=1MC+2RC+1GO+2WT+1OP+2RI+1XS+1OT+1UH+1NJ+2SW+1MH", "RS=1HG+2IE+2CP+1CM+1XY+2LC+2WX+1ES+1SV+2QF+2JL+2CU", "IF=1KA+2PQ+1WV+1MF+2AA+2LW+2KH+2K+2LZ+2KN+2QQ+1AV", "UF=1ZM+1SP+2QI+2FA+2AO+1LG+2EY+2NM+2EB+1BR+1OJ+1JJ", "RH=1EE+1PW+2RH+1LY+2HB+1HH+1EH+1MR+1KR+1SR+1EV+1HL", "ND=1GG+2PJ+2FG+1HC+2AM+2UZ+1WR+1P+1BY+1QT+1IB+1HI", "LN=2XP+2AJ+2GV+2DQ+2FQ+2CA+2JQ+1JO+2WZ+1TK+2KG+1BE", "TB=2SH+2ZX+2PG+1YY+2GF+1TZ+1DH+2TH+2VL+1OC+1YB+2VU", "KB=1LL+2JG+2RU+1TM+2OI+1AU+2MW+2IY+2YH+1EA+2MD+1JR", "WP=1UC+2DS+2QN+2BN+2SS+1YP+1IG+1HA+2DA+1FF+1RJ+2BT", "TS=2SX+1ZR+2XR+1AI+2TF+2QV+2BU+2RZ+2NC+1VT+2DN+2ZV", "LOVE=1PO+1IS+2IU+1MV+2UL+2QL+1QS+1QK+2OZ+1OK+1KK", "PS=1LB+1DT+1OF+1CQ+1UN+2FZ+2ZO+2DM+2ZB+1TC+1YG+2ST", "LOVE=2JZ+1JZ+2ZH+1O+2J+2JT+1WK", "WK=2R+2HE+1VB+2N+2N+2VB+2N+2N+2N+1CR+2CR+2CR+6C", "SF=2VO+2JP+1RM+2KV+1DZ+2IW+2IK+2NT+2NZ+2HF+1QD+1ZL", "EE=1FL+1TR+1YZ+1JS+2BA+2NA+2LJ+1JI+1CX+2ZC+2CC+2KE", "LX=1DG+1ED+2YC+2PD+1LQ+2JW+2RT+1HQ+1YU+2ET+2MI+2WJ", "WE=2TE+2HD+2KY+2UY+1FM+1XW+1VY+2KX+1KM+2HP+2JY+2EZ", "WK=2NV+2WE+2IC+2FJ+1GX+2HU+2SD+2MK+2WK+2CI+2IN+1US", "KY=2DX+1YN+1YR+1TG+1MG+2GR+1WI+1KF+2QJ+1AY+1ZP+2VX", "DJ=1AE+2QZ+1ZE+2AD+1RA+1RO+2OR+1BZ+1OX+2GH+1JD+2KW", "CO=1OO+2OV+2HX+1QM+2ZY+1TS+1VN+2NU+1WL+1RN+1MX+2MY", "XA=1BQ+2ZJ+2UG+2LT+2IQ+1JE+1UV+2JN+1SJ+1QY+2ND+1NE", "HR=2PX+1XE+1UP+2LA+1XK+1PA+1RS+1BF+2DO+2WM+2ID+2MP", "HR=1FN+2PS+1UO+2YO+2BL+2ZT+1AX+2LV+1ZF+1TL+2KP+1UJ", "XH=1SQ+2XA+2YM+1PN+1AF+1CG+2KJ+1LU+2SC+2ZN+1PI+2QA", "LF=1QW+1EK+2GE+1HW+2CH+1PZ+1BI+1TA+1NK+1IX+1HS+1VP", "UE=1BD+1CB+1EX+1CL+1VD+1XD+1DF+1JK+2LM+2DV+2LX+1XU" };
    assertEquals(1381, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case56() {
    String[] marketGoods = { "MGYXTBI", "VNQQXJI", "HLL", "IBCKNDU", "DQMURQJM", "PZER", "XRGDQ", "LNXLFCIN", "FRKQHNWGL", "DXXZSMJ", "DJZVMJXC", "EORFQX", "NXPP", "SIDWOLECT" };
    int[] cost = { 2, 19, 19, 10, 5, 16, 15, 20, 13, 18, 6, 3, 1, 2 };
    String[] recipes = { "WZTEDFS=2HLL+1LNXLFCIN+1MGYXTBI", "OGETY=2EORFQX+2SIDWOLECT", "WXNPUT=2DJZVMJXC", "NOTWCGAN=2FRKQHNWGL+1LNXLFCIN", "KSV=1MGYXTBI+1FRKQHNWGL+2PZER", "WTTYFE=2MGYXTBI+2DJZVMJXC+1LNXLFCIN", "SIOWNOT=2EORFQX+1IBCKNDU", "UTUPSHHTD=1FRKQHNWGL+1EORFQX+2PZER", "LOVE=1IBCKNDU+1SIDWOLECT+1FRKQHNWGL", "SEDXZ=1DJZVMJXC+1HLL+2IBCKNDU", "ETJJEXP=2EORFQX+2FRKQHNWGL+1IBCKNDU+2LNXLFCIN", "PYNEQBVJ=1DJZVMJXC+1FRKQHNWGL+2EORFQX", "IAVEQ=1PZER+2DQMURQJM+2FRKQHNWGL", "CTCDYPL=2VNQQXJI+2FRKQHNWGL", "DHZTFAEC=1LNXLFCIN+1HLL+1XRGDQ", "URASH=1MGYXTBI+1HLL+2EORFQX", "KAQLNQ=1DJZVMJXC", "SWTAYQLNV=1DJZVMJXC", "EXNAOC=1EORFQX+1MGYXTBI", "SOHOT=1EORFQX+2EORFQX+1FRKQHNWGL+2EORFQX", "UHTAAXMSB=2SIDWOLECT", "LOVE=1DJZVMJXC+1FRKQHNWGL+2LNXLFCIN", "ZBCG=2FRKQHNWGL", "JJDXAJ=1FRKQHNWGL+2HLL", "SEVRNZD=2HLL+2NXPP", "VJRJBQBQQ=1SIDWOLECT", "UVJ=1MGYXTBI+1MGYXTBI" };
    assertEquals(25, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case57() {
    String[] marketGoods = { "EQZG", "WGY", "DIR", "INR", "GRMNLJ" };
    int[] cost = { 10, 10, 45, 18, 43 };
    String[] recipes = { "Y=2GRMNLJ+2DIR+1DIR+2GRMNLJ", "LOVE=2DIR+1INR+2DIR+2DIR+2DIR+2EQZG+2INR", "IJUK=2DIR+2DIR+1WGY+1INR+1DIR", "YCT=1DIR+1INR+1DIR", "LOVE=1DIR+1INR+1EQZG+1DIR+1EQZG+2DIR", "KF=1EQZG+1EQZG+2INR+2EQZG+1INR+2EQZG", "YXMQ=2INR+1DIR+1INR", "VBH=1INR+1DIR+2DIR+2DIR+2EQZG+1WGY+2GRMNLJ+1EQZG", "CF=1INR+1GRMNLJ+1INR", "CA=2INR+1WGY+2EQZG", "NOQ=2EQZG+2WGY+1INR+1DIR+1INR+2EQZG", "VZWEL=1DIR+2INR+2DIR+1DIR+2DIR", "NIQKF=1INR+1WGY+1GRMNLJ", "XQZ=1DIR+2DIR+1DIR+2GRMNLJ+1DIR+2GRMNLJ", "OPRAQ=1DIR+2GRMNLJ+2DIR+1WGY", "KII=2DIR+2EQZG+1WGY+1GRMNLJ+1EQZG", "BIIQ=2DIR+2WGY+1EQZG+2GRMNLJ", "NVM=1DIR+2WGY+1DIR+2DIR+2DIR", "BVDH=1DIR+2GRMNLJ+2GRMNLJ", "EIY=2DIR+2GRMNLJ+2WGY", "PFQZ=2INR+2DIR+1EQZG+1DIR+2GRMNLJ+2INR", "FUTX=1DIR+1GRMNLJ+1DIR+1INR+1EQZG", "OPQ=2DIR+1DIR+2GRMNLJ+2INR", "CCWC=1DIR+2INR+1GRMNLJ", "NGZ=2INR+1INR+1INR+2INR", "GQJW=2GRMNLJ+2EQZG+2INR+1DIR+2INR+2INR", "DOXNK=2GRMNLJ+1INR+2INR", "TE=2DIR+1INR+1DIR+1GRMNLJ+2INR+1DIR+1DIR", "OQEUP=2DIR+2DIR+2DIR+1INR+1DIR", "ZGU=2GRMNLJ+2DIR+1DIR+1EQZG+1WGY+1INR", "ZGWEF=1INR+1DIR+2DIR+1DIR+1DIR+2EQZG+2INR", "DZCYB=2DIR+2DIR+2GRMNLJ", "SRB=1DIR+1DIR+2DIR+1INR+1EQZG+1GRMNLJ" };
    assertEquals(218, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case58() {
    String[] marketGoods = { "PQPD", "KPKUT", "PZQU", "EBTSJE", "JRJ", "QI", "ZBDF", "UXDW" };
    int[] cost = { 49, 18, 65, 9, 68, 43, 54, 59 };
    String[] recipes = { "LOVE=5QI+5PZQU+2JRJ", "JSSPFO=5PZQU+7QI+3PZQU+8KPKUT+3KPKUT", "EIYB=8QI+2PZQU+1JRJ+5PZQU", "EGD=6PZQU+3ZBDF+2PZQU+1ZBDF+5PZQU", "DA=4ZBDF+3KPKUT+6UXDW", "SW=7PZQU+1KPKUT+3PZQU", "NSN=9QI+3PZQU+8KPKUT+7PQPD+5JRJ+7ZBDF+9ZBDF", "VX=6PZQU+1PZQU+5PZQU+8PZQU", "YV=8JRJ+4PQPD+6JRJ+2PQPD", "LKB=3ZBDF+4PZQU+4UXDW+4PZQU", "OYNK=5JRJ+3ZBDF+8ZBDF+6JRJ", "WJY=3KPKUT+4JRJ+3JRJ+5PZQU" };
    assertEquals(676, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case59() {
    String[] marketGoods = { "NM", "QBNP", "WTGS", "C", "CDUA", "FXR", "OFDNJ" };
    int[] cost = { 22, 78, 73, 86, 73, 63, 23 };
    String[] recipes = { "TWBB=1QBNP+7C+2NM+3NM+7C+9C+9NM+3NM+8NM", "LQ=6NM+4CDUA+3OFDNJ+2NM+3C+2CDUA+7NM+3OFDNJ+7NM", "DCZL=3CDUA+9NM+6CDUA+7NM+9NM+1CDUA+4NM+7NM+4NM", "AQY=5CDUA+8OFDNJ+6NM+5QBNP+8NM+4NM+3OFDNJ", "HRK=4C+3WTGS+3NM+7OFDNJ+3QBNP+8OFDNJ+4FXR+9NM", "QY=5OFDNJ+4WTGS+7QBNP+3NM+3QBNP+4QBNP+7NM+7C", "WE=9QBNP+3OFDNJ+9QBNP+2NM+9OFDNJ+5NM+6NM", "LOVE=8OFDNJ+9NM+9NM+9FXR+6CDUA+9QBNP+5NM", "QQT=2C+8QBNP+2NM+8CDUA+2C+4OFDNJ+2QBNP+6NM+9OFDNJ", "HR=5C+6NM+1NM+4WTGS+3OFDNJ+8C+9FXR+4NM+7NM", "XEO=6NM+7C+3CDUA+7C+8NM+5NM+8NM+3C+7QBNP", "QCYO=6OFDNJ+8C+3FXR+6NM+8CDUA+3OFDNJ", "QDDI=7NM+5NM+2NM+4QBNP+6NM+9CDUA+8OFDNJ+2C+8CDUA", "CX=3OFDNJ+1CDUA+3FXR+4CDUA+7C+9NM+1NM+4CDUA", "HDRSX=2OFDNJ+4NM+1WTGS+5FXR+5C+1NM+6CDUA+3C", "XIY=7OFDNJ+5CDUA+2CDUA+3NM+5C+7FXR+4C+2NM+5NM", "IU=9NM+5QBNP+8NM+6WTGS+8NM+9CDUA+3CDUA", "SMB=8NM+8CDUA+5NM+8CDUA+6C+2C+9NM+6QBNP", "SCF=7NM+8OFDNJ+3QBNP+9NM+6NM+7OFDNJ+9NM+7QBNP", "KNJC=4NM+2NM+7NM+2NM+4WTGS+3CDUA+4C+3CDUA", "OA=2OFDNJ+3OFDNJ+1WTGS+2C+2OFDNJ+3OFDNJ+7CDUA", "HAF=8C+8FXR+6C+4C+9C+9NM+7NM+7OFDNJ+5FXR", "HVLY=9NM+3NM+8CDUA+9CDUA+5OFDNJ+4NM+5QBNP", "DEQR=8WTGS+2OFDNJ+9NM+3NM+2WTGS+4CDUA+1C", "TYOW=9CDUA+2CDUA+8QBNP+9QBNP+1OFDNJ+5NM+4C", "J=6NM+9CDUA+7CDUA+7NM+8NM+7NM+2CDUA+3NM+7NM", "S=6NM+7NM+5OFDNJ+6NM+6CDUA+6NM+4OFDNJ+9NM+5CDUA", "QFJN=7QBNP+5OFDNJ+5NM+1CDUA+6NM+9OFDNJ+3NM", "VKA=1CDUA+6WTGS+6NM+3C+5OFDNJ+7QBNP+1C+5C+7C", "Q=5C+5CDUA+9C+2NM+1NM+3FXR+6OFDNJ+7FXR+5OFDNJ", "KGF=5WTGS+7C+6NM+4C+5NM+1OFDNJ+6NM+8C+8FXR", "DWU=9NM+1C+7C+2NM+7QBNP+5CDUA+5NM+3CDUA", "CR=5CDUA+1C+8CDUA+8OFDNJ+4NM+4NM+9OFDNJ+4NM", "NSVK=7OFDNJ+9C+9OFDNJ+8NM+5C+6CDUA+4C+5OFDNJ+2CDUA", "QAYCP=4NM+4NM+6C+8NM+8C+5C+2NM+7C+1CDUA+7OFDNJ", "MX=8NM+3CDUA+6CDUA+4NM+7C+4WTGS+3OFDNJ", "THA=4WTGS+3C+7NM+5C+2NM+2OFDNJ+2NM+1NM", "MFZ=1FXR+7CDUA+6C+2QBNP+7NM+1NM+9C+9NM+4CDUA", "YH=9NM+6NM+2C+1CDUA+5NM+6NM+8NM+1CDUA", "RCL=5C+8C+5QBNP+3NM+5NM+8OFDNJ+8NM+9NM+9NM+3NM", "HG=8C+7NM+3C+8CDUA+5NM+5NM+3OFDNJ+7NM+3OFDNJ", "GU=8CDUA+7NM+7QBNP+5NM+6CDUA+5NM+7OFDNJ+5QBNP", "LOVE=4C+2NM+7C+3C+8NM+7C+4C+9FXR+3NM+2NM+3C" };
    assertEquals(2397, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case60() {
    String[] marketGoods = { "OPB", "M", "DR" };
    int[] cost = { 60, 12, 21 };
    String[] recipes = { "EJ=4DR+4DR+1DR+2M+7DR+2DR+2DR+4DR+7M+1DR+4DR", "ZVN=1DR+7M+3OPB+6DR+5M+9OPB+2M+4M+9DR+5M+9DR+7M", "DSCP=3DR+1M+1DR+7DR+2DR+6DR+9M+3DR+6DR+8M+9DR", "JJV=7OPB+9M+4DR+6M+7DR+9DR+2DR+9DR+6M+7M+3DR+1DR", "IE=6DR+3M+2M+8OPB+8DR+8OPB+1DR+1DR+3DR+8DR+5M", "SW=6DR+9DR+8DR+5M+1OPB+5DR+1M+9DR+4DR+6DR", "H=3M+6M+9DR+6DR+1M+3M+2M+3DR+6M+1DR+7DR+2M", "MYV=5OPB+6M+2M+9DR+1DR+2M+4M+1DR+2M+7DR+3DR", "HVS=5DR+7M+8DR+5DR+9M+6DR+4M+5M+5DR+1DR+2DR+8DR", "NMS=7DR+2M+3OPB+9M+4DR+2OPB+7OPB+4DR+6OPB", "ZK=6M+9DR+5OPB+2DR+7DR+8OPB+4M+8DR+9M+5M+5OPB+9DR", "AH=6DR+2DR+2DR+8DR+6DR+7DR+3DR+1DR+7M+1M+3M+4M", "SY=8DR+8M+4DR+6M+4OPB+5M+5DR+9M+4DR+2M", "GQ=9M+6M+1DR+9M+7DR+8DR+9DR+4M+2DR+1M+1DR", "LOVE=3M+6DR+8M+8OPB+5DR+8M+1DR+8DR+2M+8DR+1M+4M", "HHF=2DR+5DR+4OPB+6M+1DR+8DR+1M+1M+5M+5M+5DR", "QJ=1DR+2M+7DR+5DR+6DR+9DR+1M+3OPB+5M+2M+1DR+1OPB", "AJDJ=6DR+4M+7DR+5DR+6DR+9DR+1DR+6DR+8DR", "PI=4DR+9M+6DR+6M+2DR+6DR+5DR+9DR+1DR+1DR+6M", "NPT=8M+3DR+5DR+8OPB+9M+9DR+2OPB+6DR+5M+5DR+8DR", "XLOE=9DR+5DR+5DR+7DR+5DR+3M+2DR+2DR+9DR+6DR", "HM=2M+4DR+6DR+4M+7DR+5M+9DR+5DR+7DR+2DR+8DR", "ROCB=5DR+8M+8DR+4DR+9M+8DR+2M+6DR+6DR+8OPB+3M", "FJR=9DR+7DR+8DR+2M+1M+8OPB+6M+6M+1DR+9OPB+2M", "LOVE=6DR+6M+8DR+2M+3M+9M+5M+7DR+3DR+1DR", "XRR=1DR+1DR+9DR+6DR+7DR+9DR+7DR+1DR+2OPB+9DR", "JXN=9M+7M+2M+1DR+3DR+2DR+3DR+5M+8M+3M+5DR+9DR", "YFOB=2DR+3M+4OPB+4M+1M+8DR+3DR+4DR+3DR+7DR+3DR", "KUXK=2M+4DR+9M+2M+7M+9M+5OPB+9DR+5DR+8DR+5DR", "W=9M+7M+8M+3DR+6M+4DR+5DR+2M+8DR+1M+2M+1M+5DR", "AJ=1DR+5DR+6DR+3DR+1M+5M+7M+6M+2DR+2OPB+2DR", "HD=6DR+1DR+2DR+6DR+6DR+7M+8DR+6M+7DR+3DR+5DR", "TZN=9DR+2DR+7DR+8M+1DR+3DR+5DR+5M+3DR+6DR+1DR", "RRR=8OPB+9DR+4DR+5DR+2DR+2M+2DR+4DR+9M+9DR+7DR", "QCHI=1M+4DR+3DR+1DR+3DR+3DR+3M+4M+1M+6M+9M", "ZYV=8M+8OPB+1DR+8OPB+7DR+1DR+5DR+1DR+7DR", "NU=3M+1DR+6OPB+7DR+8DR+9DR+2OPB+3M+5DR+7DR", "BC=5DR+8M+6DR+6OPB+1DR+4M+7DR+5DR+6DR+7M+9DR", "TD=8DR+9DR+6DR+1DR+2M+8M+9DR+3M+5DR+9M+1M+8M", "HM=9DR+8M+4OPB+8DR+2M+4DR+7M+6DR+6DR+8DR+2M", "LOVE=2DR+2M+8M+4M+5DR+9DR+3OPB+8OPB+7M+3DR+2DR+6M", "NJAA=7DR+3DR+9DR+7DR+5DR+8DR+9M+1DR+9DR+8DR", "GXG=9DR+9OPB+1DR+4DR+3M+3DR+9M+1M+8DR+4DR+5DR", "DH=7DR+6DR+7DR+9DR+8DR+2DR+2M+9DR+3M+8DR", "S=9DR+4OPB+7DR+7DR+6OPB+8DR+2DR+3DR+4M+4DR+6DR", "JKF=9M+2M+2M+6M+5M+9DR+5DR+2DR+5DR+7OPB+9M" };
    assertEquals(825, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case61() {
    String[] marketGoods = { "N", "S", "EBN", "PW" };
    int[] cost = { 51, 82, 84, 98 };
    String[] recipes = { "J=9PW+8EBN+8N+8PW+5N+7PW+8S+7N+8S+9N+9PW+8S+6N", "TGS=6EBN+5N+6EBN+8EBN+5EBN+7EBN+6EBN+8S+6S+8EBN", "IDD=7J+5SV+7LD+9LD+6F+5SAD+5XKB+9SAD+9N+8EBN+6N", "PQ=6CQ+5XY+9DL+6D+6VL+8IM+7VL+7K+8QT+5JM", "ZH=9LD+6DL+6UG+5J+6J+9LH+8N+9NYQ+9SAD+9ZEY", "F=8EBN+8CQ+5S+6N+8S+7SAD+6IM+6N+8J+9CQ+9S", "SAD=8J+9CQ+5J+7EBN+8J+7N+9PW+7TGS+9PW+7N+6PW", "JH=7F+9VL+6K+8VB+8D+5XY+9LH+8SAD+6HZL+8F+7J+7J", "GCU=6S+5TGS+6IM+6EBN+6F+9XY+8LG+7SV+6PW+5D+6TGS", "MU=9D+5GCU+7XY+5SV+9EBN+8GCU+8S+8SAD+7EBN+8X", "NYQ=8SV+8TGS+7SAD+9IM+7IM+8J+5EBN+7IM+8F+9D", "VL=7PW+9J+6CQ+9WBB+8N+6F+8TGS+6XY+9WBB+5XY+8PW", "J=9SAD+9J+7F+5N+7F+5TGS+6S+8N+9SV+9PW+7NYQ", "JM=9LG+5SV+6PW+7XKB+7F+5X+9F+9LG+6PW+5D+7EBN", "CQ=6PW+5S+6EBN+8PW+9N+5EBN+6PW+7PW+5N+9N+7PW", "LH=7S+6IM+8TGS+6SAD+7K+6SAD+8NYQ+8F+5GCU+5K", "QT=8J+5N+6GCU+8J+6CQ+7IM+9S+7J+6D+5J+8LH+7EBN", "RNA=5F+7LH+8F+5SAD+7SV+7J+7J+9PW+9SV+5SAD", "WBB=5N+5CQ+7IDD+5JM+9QT+5X+9JM+8PW+7H+6ZEY", "Q=8N+5SAD+5J+8IM+8IDD+7N+9N+5LD+7N+9PW+8LD+8ZEY", "D=9SAD+6TGS+6N+9TGS+6J+5CQ+9J+7PW+5TGS+9N+7CQ+7SAD", "ZEY=8PW+5K+6LH+6LG+9PW+5SV+5LG+7F+6UG+8IM", "LG=9F+8TGS+8F+9D+5PW+7D+8XY+6TGS+8CQ+6N+5J+5IM", "XY=8CQ+5TGS+7PW+8EBN+9TGS+5CQ+7CQ+5TGS+9S", "X=6SV+6J+8XY+9EBN+8EBN+7SAD+6J+7GCU+8UG", "HZL=9JM+5DL+8IM+6S+6ZEY+8EBN+9EBN+9SV+8S+9X", "R=7IDD+6IM+9GCU+5N+5RNA+6UG+5IDD+5TGS+6D+6MU+8NYQ", "LD=8X+5CQ+7S+6F+7EBN+6D+7XKB+8UG+7X+9SAD+8K+6QT", "K=7NYQ+9N+6F+7IM+8XY+8CQ+6IM+8CQ+9CQ+7SV", "DL=9S+7K+6J+5EBN+5X+8IM+6EBN+7H+7XY+5S+9S", "XKB=8GCU+8SV+5GCU+7NYQ+5F+9IM+7N+5EBN+7EBN", "SV=9SAD+9F+8TGS+7SAD+8S+9SAD+7XY+6XY+9SAD+8XY+9S", "H=7XKB+9PW+9SV+9CQ+7F+8TGS+7LG+7XKB+5XKB", "VB=8MU+6J+5LH+9XKB+6NYQ+7RNA+6IM+8IM+6S", "YOY=8RNA+8R+5XY+6JM+7R+9D+7D+9RNA+8GCU+8J+7XY", "UG=8TGS+7CQ+8EBN+6F+9J+9NYQ+9N+6J+9XY+9F", "IM=6J+9PW+6S+9J+8PW+5S+9S+9EBN+8PW+8J+7J+8J+7S", "HCY=9MU+9NYQ+6WBB+5VB+6ZH+9PQ+9RNA+6PQ+9LH+7IM", "LOVE=9CQ+6R+8D+6WBB+7Q+5NYQ+6YOY+9XY+5IM+7SV+6J" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case62() {
    String[] marketGoods = { "LAJDX", "KR", "DV", "NEMCW", "RCG", "ROIH", "ODZGN", "PGC", "MXS", "FV", "UD", "YGXO", "SJGV", "KMHYD" };
    int[] cost = { 15, 13, 10, 9, 14, 8, 3, 3, 3, 8, 2, 8, 2, 5 };
    String[] recipes = { "SDDP=8CUNCA+9FMFT+2DV+7VUSC+5RQN+7CUNCA", "XTC=9KMHYD+2XYJMPBR+3ORO+3PGC+3KLV+7OPEN", "BZQDYX=6RQN+4WIBX+5FMFT+2DV+1ONK+9FV+5ODZGN", "FZHYJ=5VKOZ+3ODZGN+2DV+6PGC+4FV+6RCG+5RCG", "MZ=4SJGV+5SJGV+4SJGV+4KMHYD+4SJGV+2ZL", "JDP=3AXETF+9AXETF+1SDDP+9RCG+3HTQ+4CUNCA+6SDDP", "ONK=8ZL+9FZHYJ+5CUNCA+9SDDP+5VKOZ+7FZHYJ+2KMHYD", "BKUU=8ORO+5RQN+7JDP+3FMFT+6NEMCW+2WGDAEB+4RQN", "ZL=6DV+5KR+4KR+4MXS+2FV+9NEMCW+2YGXO+5RCG+6UD", "FMFT=2PGC+4KR+1MZ+1MXS+5MZ+5VUSC+7DV+5VKOZ", "WIBX=1AXETF+3AXETF+2PGC+2ODZGN+6ZL+9CUNCA", "HLQDHQ=5CUNCA+5FMFT+7SJGV+9KLV+9MXS+2ZMDVO+6RQN", "XYJMPBR=1ONK+2VUSC+4MXS+8ZL+6DV+7ODZGN+7VKOZ", "RQN=5ODZGN+5VKOZ+7ODZGN+7VUSC+2MXS+2YGXO", "AXETF=8KR+1ZMDVO+5LAJDX+4RCG+3CUNCA+3DV+7RQN+9RCG", "LYCX=1FMFT+9NEMCW+1DV+6WIBX+6RCG+2ZL+6AXETF+9MXS", "ZRG=9KMHYD+3RQN+7VUSC+6PGC+7SJGV+6KR+2UD", "ZMDVO=2SJGV+2ZL+4KLV+6RCG+6ROIH+5KLV+8RCG", "OPEN=2SJGV+3RQN+9WGDAEB+4ZRG+2NEMCW+3HLQDHQ+5UD", "WGDAEB=3KMHYD+5NEMCW+1HLQDHQ+5HTQ+8VKOZ", "ORO=8KR+5SDDP+1RQN+7WGDAEB+3ZL+1CUNCA", "KLV=5ROIH+1ODZGN+1YGXO+6PGC+6KMHYD+7DV+1FV", "NTVQ=6WGDAEB+4MXS+2LYCX+6FZHYJ+2UD+8MXS+9VKOZ", "EEPI=1UD+1SDDP+6ZL+7AXETF+3RCG+3JDP+6FV", "CUNCA=6FV+3VUSC+2YGXO+6FV+1KR+2VKOZ+1NEMCW", "VKOZ=1ZL+9KMHYD+8MXS+7LAJDX+3KMHYD+2SJGV", "LOVE=6ZRG+5CUNCA+9KR+9RQN+2NTVQ+1KR+8NTVQ+6WGDAEB", "VUSC=5PGC+3ROIH+4NEMCW+6FV+4SJGV+7ROIH", "HTQ=8FMFT+8LAJDX+2AXETF+6ZMDVO+7KR+6VUSC+2ODZGN" };
    assertEquals(86161167, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case63() {
    String[] marketGoods = { "ZFTHM", "ZATJYF", "ULK", "SCDW", "EGHBZB", "QRY", "AXERGZ", "YRK", "WMUL", "TOUIR", "IEP", "QCH", "HFR", "VJB" };
    int[] cost = { 16, 6, 18, 9, 11, 1, 4, 17, 10, 19, 16, 7, 3, 17 };
    String[] recipes = { "YWMBN=6VJB+8CZXW+4CZXW+4QRY+8TOUIR+4EGHBZB", "PTAD=2GASM+7FHNIM+6EGHBZB+3GASM+3IEP+6QRY", "QTP=1AXP+8JETW+4DGF+2TOUIR+8ZXAA+4WODF+7PTAD", "TKCPVC=9AXERGZ+1EUR+5ZFTHM+6ZFTHM+2AXERGZ", "JETW=4ULK+6IEP+1YDKPOT+7SWRVK+8EUR+6ZATJYF", "L=2IEP+5EUR+1DGF+3EUR+6VBKG+1FHNIM+3QRY+2EGHBZB", "YDKPOT=6VBKG+8PQEK+8ZATJYF+9PQEK+7YWMBN+7ULK", "DGE=9HFR+3HFR+7DGF+1QCH+5SEXGMR+3QFF", "LOVE=4VJB+7DGF+3VBKG+3ZXAA+5SCDW+6WODF+7ZATJYF", "FR=2QCH+7EGHBZB+9EGHBZB+6WMUL+2AXERGZ+2HFR", "DGF=1GNRG+5CZXW+9WMUL+5HFR+1EGHBZB+1UE+3IEP", "PQEK=8FHNIM+5PTAD+2HFR+9YRK+5HFR+9ZATJYF", "ZXAA=2TOUIR+8WMUL+3FR+4WMUL+8PTAD+8FHNIM+4UE", "DXVW=7AXERGZ+6ZFTHM+8YRK+8TOUIR+6FR+6HFR", "VBKG=9SCDW+2ZXAA+9ZFTHM+6TOUIR+2GNRG+9HFR", "SEXGMR=8HFR+1QCH+5TOUIR+1QRY+6ZFTHM+8AXERGZ", "AXP=4SCDW+8FR+2QRY+8SEXGMR+2VJB+9YRK+1DGF+5SWRVK", "SWRVK=3QCH+5VJB+4IEP+5YRK+4VJB+8EGHBZB", "GNRG=4FHNIM+4SWRVK+7AXERGZ+6FR+4ZFTHM+2QCH", "WODF=5QCH+7TOUIR+8AXP+8AXP+7YDKPOT+6ULK", "CZXW=5WMUL+2EGHBZB+6ZFTHM+4TOUIR+6SCDW", "QFF=6SCDW+1PQEK+2QRY+7TOUIR+2AXP+3ZFTHM+2TOUIR", "LQKUA=8QFF+4DGF+7GNRG+6CZXW+5ZFTHM+6QFF", "GASM=8EGHBZB+5HFR+7IEP+5IEP+9VJB+8DXVW", "YHG=6ZXAA+9WMUL+6ZXAA+5YWMBN+5ULK+1VJB+6VBKG+7AXP", "EUR=2IEP+5IEP+5QCH+4EGHBZB+9ULK+5SEXGMR", "FHNIM=4FR+3TOUIR+7SEXGMR+4CZXW+3HFR+8YRK+8ZATJYF", "UE=1AXERGZ+6ZFTHM+5IEP+6TOUIR+6IEP+3TOUIR", "RS=1TKCPVC+3L+2TKCPVC+7CZXW+2JETW+2TOUIR" };
    assertEquals(924633702, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case64() {
    String[] marketGoods = { "CBD", "XA", "JJV", "GICJDJ" };
    int[] cost = { 3, 22, 5, 19 };
    String[] recipes = { "SDSY=4XA+7CBD+4XA+7XA+7JJV+1GICJDJ+7GICJDJ", "GD=6CBD+9CYHOUO+7RCB+8DUZLE+9NHB+4SDSY", "HNAPK=1KOGB+8JJV+8JJV+8XA+2CYHOUO+8DUZLE", "ZYZ=3SDSY+4GQAGQD+1RCB+9XA+4DUZLE+9CBD+6FFCB", "KOGB=3SDSY+2CBD+6JJV+3SDSY+5JJV+8YWIZC", "MCYU=4UKIX+4JJV+4FFCB+7COIQE+4RCHKM+4QYK", "IBN=7KOGB+3YWIZC+9RCB+1RCB+4SDSY+6CBD+1COIQE", "CXTE=6NDIU+8GICJDJ+9GQAGQD+3JJV+4RCHKM+7QYK", "CYHOUO=7RCB+8JJV+2FFCB+6KOGB+7JJV+3GICJDJ", "RCHKM=6GD+1NDIU+8QYK+1JJV+9CYHOUO+4DYEFBC", "COIQE=5XA+1DUZLE+3CBD+7FFCB+2KOGB+5FFCB+6ZYZ", "QYK=7RCB+4XA+5CBD+5DYEFBC+6YWIZC+4NHB+3COIQE", "IDY=8XA+5XA+2CBD+3DUZLE+4SDSY+4YWIZC+2JJV", "FFCB=7GICJDJ+5XA+3CBD+5GICJDJ+8SDSY+8CBD+8SDSY", "IPMU=3HNAPK+1JJV+9CYHOUO+3RCHKM+9KXBS", "DWC=6MCYU+9IJA+4NHB+9RCB+7IJA+5IBN+6JJV", "DUZLE=7XA+4RCB+6FFCB+5SDSY+7YWIZC+9RCB+3XA", "DM=2HNAPK+9TLUPK+3TLUPK+5SDSY+9CBD+1JJV", "TLUPK=9COIQE+7NHB+6YWIZC+1DUZLE+7IDY+3RCB", "UKIX=2DUZLE+3HNAPK+7JJV+8DYEFBC+8GICJDJ+3NHB", "DYEFBC=7RCB+7JJV+6SDSY+1RCB+6YWIZC+4SDSY+9SDSY", "LC=4UKIX+4IJA+8QYK+4DUZLE+1KOGB+9TLUPK", "JYK=2SDSY+1CBD+7COIQE+1LC+1HNAPK+9TLUPK+9LC", "NHB=7KOGB+2FFCB+9RCB+7RCB+1CYHOUO+8YWIZC+6JJV", "QWJDF=2GD+1TLUPK+7GQAGQD+1GICJDJ+2JJV+4TLUPK+7GD", "YWIZC=9JJV+3GICJDJ+9RCB+1JJV+3GICJDJ+5CBD+9RCB", "RCB=6CBD+5JJV+6JJV+6XA+7XA+3XA+5CBD+2CBD+6JJV", "NDIU=1DUZLE+6SDSY+9GICJDJ+2RCB+5KOGB+6ZYZ", "WOY=4ZYZ+8DYEFBC+9IDY+5JJV+3DYEFBC+1DUZLE", "GQAGQD=2SDSY+6RCB+6XA+5XA+6YWIZC+2YWIZC+5KOGB", "KXBS=5FFCB+9SDSY+7KOGB+7RCB+9JJV+1ZYZ+1CYHOUO", "FDELZ=2YWIZC+5RCB+9GD+2SDSY+7JJV+5TLUPK+7DYEFBC", "GHPJ=7LC+6COIQE+8MCYU+7FDELZ+1RCB+9TLUPK+4MCYU", "IJA=3RCB+7CYHOUO+9DUZLE+1KOGB+9KOGB+4DUZLE", "YRY=3ZYZ+1RCHKM+1MCYU+6NDIU+9NHB+5LC+1XA", "LOVE=9CBD+2IDY+7QYK+3JJV+4XA+9DUZLE+6RCB+1CYHOUO" };
    assertEquals(334694053, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case65() {
    String[] marketGoods = { "NZ", "JBH", "MW", "ZK", "XJ", "JNU", "ZEABH", "IOWZA" };
    int[] cost = { 37, 7, 11, 34, 23, 32, 17, 31 };
    String[] recipes = { "TZ=2XVK+3RE+3UHIA+2PXXDM", "YO=7XVK+7IIPY+1JBH", "VZLJA=3JNU+1XJ+1XJ+6ZEABH", "PXXDM=8NZ+9RE+5IIPY", "LOVE=3NZ+9XVK+1SMQUS", "DDCBIM=9AKZYM+8AXDCN+4MJCA", "TWC=1COML+3JBH+9UHIA+6VZLJA+7UHIA", "RAEF=8JNU+8RE+4XJ+5VZLJA+3IOWZA", "UQYGE=6DLXK+2PXXDM+2RAEF+6DDCBIM+3GQYIG", "LSAHS=6CFV+3XXOP+7DLXK+9THV+9PKCU+6JBH", "QQ=4FHPEYV+1GQYIG+2JNU+9OGJQN", "UHIA=5RE+4IOWZA+6RE+1RE+7SMQUS", "FHPEYV=8IOWZA+9PXXDM+2COML+7IOWZA", "DSXXTH=6PXXDM+3XVK+9YO+8XVK+4XVK", "AXXW=6SMQUS+6MW+3THV+2IIPY+6THV", "FHK=7THV+4COML+7XJ+1XJ+1JBH", "XXOP=7BZ+5ZQI+7TWC+3AXDCN", "ZQI=6JNU+8THV+4RE+8XJ+2PTGZH", "MJCA=3PTGZH+1TWC+7IMAAU", "RWKTJH=2BZ+9IIPY+6PKCU+7IOWZA", "AKZYM=9DSXXTH+4GQYIG+8FHK", "CKVO=7NZ+9IMAAU+9DLXK+8OGJQN+7QXDM+7RE", "IIPY=2ZEABH+7JNU+4VZLJA+1ZEABH+9ZEABH", "YZC=9RE+1PXXDM+9QNQI+6RAEF+9MW", "PKCU=7CUQHG+6TZ+4AKZYM+7THV+2AXDCN", "GQYIG=9AXXW+5QNQI+2QNQI+6THV", "LXZOMT=9UHIA+4RE+8FHPEYV+7RE", "THV=3XJ+3PXXDM+3RE+8UHIA+2IIPY+6RE", "QXDM=7PTGZH+8XVK+8IOWZA+8XVK+7NZ+9RAEF+3FHPEYV", "OGJQN=6BZ+9IOWZA+9SMQUS+2LXZOMT+8XV", "IMAAU=9UHIA+2JNU+8NZ", "CFV=6MW+9TWC+8ZQI+3TWC+8SMQUS+7ZK", "QNQI=4THV+1XJ+1JBH+9IMAAU+6XJ", "XVK=1MW+8MW+1NZ+2MW+8NZ", "YGL=4PQH+6DSXXTH+9PQH+8XVK+1AJP+7AKZYM+1JBH", "PQH=9VZLJA+9JNU+4XJ+9RE", "AXDCN=1LXZOMT+7XJ+5GQYIG+9QNQI", "ACQV=4RE+7RAEF+7UHIA", "RE=4JBH+7MW+2ZEABH+9ZK+8ZEABH+3JBH", "DLXK=8SMQUS+7TZ+8LXZOMT", "YNWIJ=4ZEABH+5UQYGE+5DSXXTH", "BZ=7QNQI+6RE+7TZ+9YZC", "PTGZH=5IOWZA+5THV+8JNU+2NZ+5JNU+1JBH+5MW", "EYQ=5RAEF+6TWC+7LXZOMT+2YZC+8ZEABH+2YO", "XV=1SMQUS+6ZEABH+4PQH+9IIPY+8PXXDM+3PXXDM", "OPH=7RAEF+4IMAAU+9XVK+8DSXXTH", "AJP=8AXXW+6ZQI+5PQH+7SMQUS+2QXDM", "CUQHG=9AXXW+2CFV+4NZ+6TWC+2PXXDM", "COML=4ZK+3IIPY+8THV+9XJ+3PXXDM+4DSXXTH", "SMQUS=5XJ+5ZK+9ZK+5XJ+9ZEABH+6ZK+5XJ" };
    assertEquals(5375, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case66() {
    String[] marketGoods = { "OBP", "HUK", "SXA", "MOZ", "TD", "PNUF", "EI", "VFJ", "AFW", "M", "CQZ", "QUU", "PS", "RT", "RZ", "GBGS", "R", "BDO" };
    int[] cost = { 3, 10, 18, 5, 24, 34, 16, 30, 34, 8, 12, 31, 15, 37, 32, 4, 36, 36 };
    String[] recipes = { "S=5SNS+7M+8EDW+9FI+6FBB+6PNUF+1GBGS+4RZ+8SO", "YF=3PNUF+3VFJ+3MOZ+6PS", "ZQN=5FI+3OBP+8XXI", "CJE=6RT+3TD+8CQZ+5TD+2IQU+1PNUF", "FBB=9TD+7RT+7OBP+6EI+6MOZ+2AFW+9PS+3MOZ", "VZ=9MCY+2SXA+2CJE+1SNS+7UM+5S+1CJE+1CJE+4KLPY", "FI=3FBB+6SXA+8GBGS+8EI+4PS+9MOZ", "XXI=2AFW+5XNH+9RT+1YF+5TD+1SXA+9RT", "S=7XXI+5EDW+6AFW+3FBB+6ZQN+2XNH", "FL=5ZQN+8TD+5Y+7SO+4QUU+9SNS+7TD+3PNUF", "LOVE=4SNS+4UM+3EDW+7S+6M", "KLPY=1AFW+4M+9XNH+6AFW+8RZ", "SO=1GBGS+2OBP+6TD", "RWM=9FBB+7VFJ+6RZ+3PNUF+9MOZ+8EI+2R+4CJE", "IQU=5CQZ+6MCY+1FBB+3AFW+8PS", "UM=7GBGS+9FL+2EDW+3PS+9R", "SAM=5GBGS+3ZQN+3FI+4MOZ+6Y+6MOZ", "MCY=8FL+6SO+1M+4ZQN+7AFW+3SXA+9GBGS", "SNS=4R+5OBP+8RZ+7M+2TD", "XNH=9VFJ+2RT+4R+6HUK+8R", "QCL=2Y+8BDO+8MCY+5R+9ZQN", "NKR=1SNS+2UM+8UM+3EI+3RT+6YF", "Y=2VFJ+5ZQN+2M+8M+8HUK+1OBP", "EDW=1EI+4GBGS+7RZ+7EI+8SO+3XNH+2BDO" };
    assertEquals(62646324, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case67() {
    String[] marketGoods = { "RZE", "QFI", "UJZ", "LJN", "TL", "NM", "ASE", "ZL" };
    int[] cost = { 4, 1, 1, 2, 5, 4, 5, 5 };
    String[] recipes = { "FCF=1BUX+2ZL+3RWY+1ZXG+1DJBV+1BUX", "CLA=3AF+1ASE+2ASE+2DJBV+1NM", "CP=3WM+1NM+3BUX+1IKG+2I+1WB", "WB=3RZE+1ZL+2DJBV+3AF+2AF+1ASE+3LJN", "OL=2UJZ+3PS+2ZL+3HWG+1I+2NVL+2AM", "P=1ASE+1XB+1WM+2CP+2XB+1HM", "WM=2OJ+2UJZ+2ZXG+2DJBV", "AF=1XB+3UJZ+1NM+3QFI+1XB", "OJ=3HWG+1ZL+2NM+1DJBV", "I=2HM+3WM+3ZL+1TL+2RZE+3ZL+3NM", "AA=3ZL+3AF+1LJN+1OJ", "GRE=1FOKG+3CP+1WM+2RWY+2FCF+3RZE", "XB=1RZE+1NM+3RZE+3RZE+2RZE+1RZE", "HWG=2NM+3DJBV+3AM+2UJZ", "NVL=1AF+2HM+3NM+3HWG+2LJN", "LOVE=2GRE+3AF+2P+2I", "RWY=3LJN+3PS+3O+3ZXG+2WB+3WM+1I+3ZXG+2ASE", "DJBV=2QFI+1ZL+1ZL+3XB+2LJN+2TL+2LJN", "ZXG=2HWG+2HWG+3XB+2IKG+3IKG", "AM=3ZL+3RZE+1UJZ+1QFI+1IKG+2ZL", "PS=3WB+3NM+3GP+2AM+1ZXG+1TL", "HM=3TL+3ZL+2ZL+1XB+2O+2ZL", "IKG=2LJN+1TL+2WB+2ZL+3NM+2WB+3UJZ", "K=1WM+3AF+1QFI+3WB+2ASE+2HWG+3RWY", "FOKG=1NM+1CLA+3WB+3ASE+3DJBV", "O=1ZL+1AA+2IKG+1TL+3ZXG+3DJBV+1LJN", "GP=2WB+2HM+1O+1LJN+2QFI+3LJN+3QFI", "BUX=3TL+2AA+2AM+3PS+1O+1WM+2ZL", "QWV=3NVL+2UJZ+1PS+3WB+1RZE" };
    assertEquals(656595340, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case68() {
    String[] marketGoods = { "E", "TN", "K", "AZG", "OD", "DA", "Y", "M" };
    int[] cost = { 5, 4, 4, 5, 1, 5, 3, 3 };
    String[] recipes = { "RJI=1DA+2TN+1K+1OD+2OD+3AZG+1DA+3OD+1Y+2TN", "GBC=3Y+2DA+3M+3TN+3Y+3DA+1M+3RJI+2M+1RJI+3Y", "M=1JC+5UV+2E+5RJI+2Y+4EB+2VUG+5VZH+4QDQ", "CCW=1QI+2QI+1VZH+3QI+3K+1TN+2M+1YRDG+3UV", "W=2YRDG+1OD+3CCW+1TN+2E+3E+2DA+2YRDG+2DEHT", "DEHT=3E+3K+3OD+1QDQ+1EB+1AZG+3RJI", "E=2M+5W+4ZUD+5SRC+2AU+3SRC+3Y+4W+5AZG+1DRJ+4SRC", "WC=1VUG+3JY+2AZG+3GJI+1OD+3Y+2YRDG+1JY", "QI=3E+1OD+1EB+3QDQ+1GBC+3EB+3DA+1TN+1K", "W=3L+3QI+2JY+2TN+2AZG+3DRJ+1ZUD+4TN+2VZH+3TN", "CCW=3GJI+3AZG+3JC+5OD+4JRN+4AZG+4GJI", "CCW=4LOVE+5E+4LMB+4OD+5TN+5LOVE+1AZG+5QDQ", "GJI=1JC+2UV+1SD+2AZG+3CCW+1VZH+2JY+3LMB+3JRN", "JY=3EB+3GBC+3DEHT+2QI+3M+2TN+2K+3Y+2Y", "SD=2QDQ+2OD+1OD+1JY+3QI+1GBC+1K+2CCW+1HIVJ", "W=5HIVJ+4VWI+4L+4QI+3OD+3VZH+5M+5UV+4SD", "VZH=3OD+1QI+2YRDG+2YRDG+2OD+2TN+3M", "TN=1HIVJ+5K+3W+4JY+4YRDG+4LOVE+3DEHT", "GBC=2SD+3QDQ+5YRDG+5LMB+2GJI+1VWI+5JY+1AU", "LOVE=1CCW+3WC+2W+1E+2HIVJ+1K+1HIVJ+1JRN+2QI", "VWI=2LOVE+1QDQ+3LMB+3ZUD+4HIVJ+2SRC+4L", "JC=1TN+3VUG+3QDQ+1TN+1VZH+3W+3CCW+1AU+1Y", "UV=1DA+3TN+3YRDG+2AZG+1GBC+2GBC+1VZH+3RJI", "AZG=3EB+4EB+1RJI+1W+3OD+3E+1VWI+2OD+3CCW", "L=1VZH+3DRJ+1AZG+2GBC+3SRC+1EB+2CCW+3GJI+1QI", "TN=5CCW+1JC+3JRN+1DRJ+1JC+3JRN+5GJI+2QI+1VZH", "LMB=2TN+5VZH+5CCW+3GJI+5RJI+5CCW+5AZG+5YRDG+3JRN", "ZUD=2L+1EB+2SRC+1CCW+2UV+3SRC+2RJI+3YRDG+2Y", "SRC=3QDQ+2W+1VUG+1TN+2EB+1JRN+1JY+2K+2E+2EB+3HIVJ", "QDQ=1OD+1OD+3Y+2DA+3M+2DA+2RJI+2M+1DA+3AZG", "DRJ=2QDQ+2GBC+1AZG+2LMB+1JC+3JY+2K", "VUG=3E+1AZG+2W+2RJI+3RJI+3QI+2E+1OD", "VUG=4ZL+3LOVE+5LOVE+1VUG+1AU+2LMB+2LMB", "VWI=1CCW+3L+2TN+1OD+2YRDG+3GBC+2TN", "E=1AU+5RJI+1LMB+3GJI+5GBC+3QI+4EB+1ZUD", "DRJ=2GJI+5DRJ+1WC+4JY+2K+3DRJ+2VWI+4W+3QDQ", "LMB=1QI+1GBC+3DEHT+3VUG+2TN+2RJI+1UV+2DA", "AU=1DA+1SD+3DA+2JY+3AZG+3QDQ+3K+3JRN+1Y", "HIVJ=1RJI+2RJI+1YRDG+3UV+1QI+3E+2DA+3DA+3QI+1OD", "EB=2OD+1AZG+2OD+3DA+2TN+2AZG+1K+1TN+1GBC", "E=1K+3DEHT+2QI+1RJI+3JRN+1M+2JRN+2CCW+1OD+3CCW", "AZG=5VUG+5E+2L+3VZH+4LOVE+1YRDG+4VZH+4GBC", "YRDG=3JY+2AZG+1GBC+2RJI+2RJI+2RJI+2TN+1M+1OD", "ZL=2YRDG+1DRJ+1DRJ+3M+2Y+1UV+2AU+2JY", "JRN=1OD+1DA+1K+1RJI+1TN+3CCW+1AZG+1QI+1QI" };
    assertEquals(774962162, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case69() {
    String[] marketGoods = { "YH", "JL", "QY", "RRR", "OOZ" };
    int[] cost = { 4, 3, 2, 1, 4 };
    String[] recipes = { "LOVE=1OOZ+2SV+1BF+3RRR+3B+1LOVE+1B+3OOZ", "SMH=1OOZ+3YZTS+1OOZ+3BF+2I+1PG+3OOZ+3QY+3Q", "B=2RLF+7RU+2SWB+9UK+9OOZ+6SV+8VJ+4LOVE+2Q", "JL=6B+6LOVE+2JA+4YH+2JA+3RLF+8SV+8PG+9LOVE", "TRR=6OOZ+1SMH+8SMH+5Q+9I+3SMH+7I+4TRR+1BF", "RLF=3Q+3YH+1VJ+2RRR+2JL+2RU+2SWB+2TRR+2CA+1TRR", "PG=1UK+1BF+2B+2YH+3B+2SWB+1UK+2YZTS+3YH+1RRR", "UK=2TRR+6JA+8PG+3SV+9OOZ+6Q+2LOVE+4I+1LOVE", "SMH=8LOVE+9SWB+7UFHE+1OOZ+1BF+2BF+8QY+4Q+3JA", "JA=1B+2QY+3RU+1RRR+3PG+1YH+2PG+2JL+1B+1YH", "Q=2SV+1JL+2JA+3QY+2JL+2OOZ+3B+1SWB+2VJ", "SMH=3SMH+5SMH+1CA+2I+3LQC+9JL+4JA+7RLF+4JL", "LOVE=2UFHE+2SWB+3I+1I+2YH+2CA+3B+2YZTS+1UFHE", "YH=2SWB+9LOVE+6QY+9LQC+2B+6TRR+3YZTS+5SWB", "SWB=1YH+2JL+3YH+3B+2SV+1YZTS+3OOZ+1YZTS", "VJ=3RRR+2RRR+2UK+3RRR+3UK+2QY+1YZTS+2B+2BF", "UK=3QY+1OOZ+2YZTS+1YZTS+2RRR+2QY+3QY+3RRR", "YZTS=1JL+3JL+1YH+3QY+1JL+2YH+3QY+3OOZ+2OOZ", "SWB=8LQC+2YH+5RU+2YZTS+4OOZ+5RU+7YH+8SV+9Q", "UFHE=7LOVE+8TRR+1UK+9LOVE+7SV+1UK+4CA", "OOZ=9OOZ+1CA+3CA+4B+9UK+3LOVE+3LOVE+7LOVE+8SWB", "SV=2JL+2UK+1YH+1QY+1UK+3JL+3UK+2UK+1YZTS", "RU=4RLF+2LOVE+9B+6RLF+8JA+9CA+2UK+9RU+6B", "RLF=8CA+9B+3JA+7TRR+8QY+2JA+1BF+6RRR+5B", "TRR=3VJ+2I+2B+2OOZ+3OOZ+1YZTS+3SWB+1SWB", "BF=3SV+1SV+1YZTS+2YZTS+2YZTS+1B+1OOZ+3OOZ", "LOVE=3Q+2BF+3JA+2CA+1SMH+2YH+1JA+2SWB+2JL", "LQC=2RU+3QY+8LOVE+6Q+4B+3RU+6SMH+7RRR", "LOVE=7LQC+3SMH+9LOVE+6LOVE+9I+5TRR", "B=2RRR+4Q+8YH+2CA+6JL+6JL+8TRR+5YH+5BF+6B", "RU=3QY+3JL+3B+3B+1PG+1UK+3RRR+2PG+1QY+2YH", "CA=2UK+2YZTS+3SWB+3SV+3PG+3I+2RU+2TRR+3Q+2RRR", "RLF=1TRR+2PG+7UK+6VJ+8YH+4B+9YZTS+5YZTS+3SV", "LQC=2SV+3B+1YH+1I+2UK+1SMH+2CA+3RU+2RU+2UFHE", "LOVE=3YZTS+5YH+4RRR+6JL+3LOVE+4VJ+9Q+9I+8YH+4CA", "OOZ=9RU+3RU+5RLF+1Q+5I+9YZTS+6LOVE", "I=3SWB+5LOVE+9VJ+3LOVE+7YH+7Q+1UK+2BF+9LOVE", "UFHE=3YZTS+3YH+2B+3BF+2Q+2QY+2RU+1YH+1OOZ+3BF+2YH", "UK=1B+4VJ+3RU+5JA+4VJ+6BF+3LOVE+9TRR", "SMH=7UK+8UK+6LQC+8JL+3LOVE+3BF+1SV", "B=2YZTS+1RRR+3SV+3QY+1UK+3UK+2OOZ+1SV", "I=3OOZ+3YH+3UFHE+3UFHE+1VJ+2QY+1OOZ+3UFHE+1YH", "VJ=8JL+7SV+9UK+4PG+1PG+8LOVE+7SWB+4OOZ+1JA" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case70() {
    String[] marketGoods = { "ZFUH", "F", "CRQLCT", "YPPUG", "GANI", "TN", "YGOIM" };
    int[] cost = { 13, 1, 6, 14, 13, 14, 8 };
    String[] recipes = { "RZG=3ZFUH+3YGOIM+3YGOIM+2F+3YPPUG+3CRQLCT", "TWBSXWX=2GANI+3KWRW+3ICH+2ZFUH+3ZFUH+3QTDY+2QTDY", "LOVE=3RZG+3JMBM+2CRQLCT+2QTDY+3RZG+2F+3ZMRL+3TN", "NYUPQS=7BUAHH+5KWRW+2YPPUG+5LOVE+2BUAHH+8YGOIM", "KLLWUD=1QTDY+3TWBSXWX+2MTIKJ+3GANI", "TD=3YNGP+2QTDY+3QYJYGU+3JVA+2TWBSXWX+1TN", "FFTMIA=1MTIKJ+3GANI+3MTIKJ+3YNGP+2GANI+1YGOIM", "NYUPQS=1CRQLCT+3KWRW+1GANI+3YGOIM+1QYJYGU+3HCSNB", "ICH=2FFTMIA+3ZFUH+2ZFUH+2QYJYGU+2YPPUG", "JMBM=2RZG+1MTIKJ+3TN+3GANI+3NYUPQS+2RZG", "QTDY=2CRQLCT+2JMSLSK+1QYJYGU+2RZANI+3QYJYGU", "XTFFJU=1CRQLCT+2GANI+2GANI+2ICH+1RZG", "JMSLSK=2MVGLR+2TN+1MTIKJ+2ZFUH+2CRQLCT+3QYJYGU", "VJAJZC=3F+3MTIKJ+2QTDY+3ICH+2ICH+3YPPUG+3RZG", "YNGP=1TN+2QYJYGU+3QYJYGU+1TN+1QYJYGU+2GANI", "BUAHH=3HCSNB+3OZ+2CRQLCT+2MVGLR+2YPPUG+3XTJXE", "HCSNB=1QTDY+3XTJXE+2KLLWUD+2CRQLCT+2XTFFJU", "OZ=2ICH+3MVGLR+2ZFUH+1ICH+2XTJXE+1GANI", "JVA=2QTDY+1CRQLCT+3YGOIM+3KWRW+3YGOIM", "MTIKJ=3QYJYGU+2QYJYGU+1ZFUH+1CRQLCT+2TN+1YGOIM", "MTIKJ=5LOVE+7CRQLCT+5CRQLCT+9TD+1LOVE", "JMBM=1XTFFJU+5TN+2QTDY+6LOVE+8MTIKJ+8TN+2TN", "LOVE=2XTFFJU+3TN+2UTRG+2UTRG+1QTDY+2TN+1YPPUG", "ZMRL=2ZFUH+2HCSNB+2HCSNB+3RZANI+2JVA+2YGOIM+1ZFUH", "UTRG=3HCSNB+1KLLWUD+2RZG+2QTDY+2GANI", "KWRW=3GANI+2XTFFJU+1QYJYGU+3XTFFJU+1RZANI+1GANI", "VJAJZC=3KWRW+8JMSLSK+9MVGLR+6ZFUH+6JVA+9RZANI", "QYJYGU=3RZG+3CRQLCT+3YPPUG+3YGOIM+2CRQLCT", "HCSNB=9JVA+4TN+7HCSNB+4UTRG+9JVA+5YNGP", "XTJXE=1YGOIM+2QYJYGU+3QYJYGU+2RZG+3CRQLCT", "RZANI=1QYJYGU+3QYJYGU+1RZG+3RZG+1XTJXE+2MTIKJ", "YGOIM=6KLLWUD+8LOVE+3YGOIM+9XTJXE+5ICH+4CRQLCT", "LOVE=8FFTMIA+5ZFUH+2XTFFJU+5NYUPQS+3UTRG", "MVGLR=2YGOIM+2QYJYGU+3YGOIM+3YNGP+2YGOIM+2YNGP", "LOVE=3ZMRL+3KLLWUD+1YPPUG+2F+1FFTMIA+1F", "ZMRL=4JMSLSK+8JMBM+1UTRG+8YNGP+4OZ+7UTRG" };
    assertEquals(175055442, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case71() {
    String[] marketGoods = { "MR", "OCA" };
    int[] cost = { 1, 9 };
    String[] recipes = { "IPMY=3AVS+4HF+9OCA+8HU+8MR+8RW+4LOVE+2YF+8LL", "HU=3OCA+1OCA+2QEKB+2LL+2QEKB+3QEKB+2MR+1OCA", "IPMY=4LL+9K+2OCA+1LOVE+3LOVE+4HF+6HF+6OCA", "LL=6OCA+5OCA+8OCA+4LOVE+6HF+7HF+7OCA+1LOVE", "QEKB=2K+3YF+3RW+2WFB+2WFB+3K+2LL+2RUQN+1RUQN", "RW=9LL+9LOVE+4AVS+8HF+9K+9K+7IPMY+8K+8RUQN+2RUQN", "KFH=3HU+7MR+1RUQN+5IPMY+3LL+1RUQN+3RUQN+6YF+9YF", "YF=1K+3MR+1AVS+3IPMY+1OCA+3K+1IPMY+2RW+1MR", "QEKB=7YF+8IPMY+6LOVE+3LOVE+5KFH+8MR+5QEKB", "AVS=1OCA+2MR+3LL+2WFB+1LL+3OCA+2OCA+3MR+2MR+2WFB", "RW=1RW+2K+8LL+5LOVE+9WFB+6IPMY+5LOVE", "LOVE=8LOVE+8KFH+8IPMY+3HU+1LOVE+8WFB+7LOVE", "OCA=7HF+4K+5K+2LOVE+8MR+5LOVE+1K+2LL+8RUQN", "HF=3IPMY+3AVS+1MR+2LL+1OCA+1WFB+2WFB+1RW+2RUQN", "LOVE=1KFH+8HF+5LOVE+7KFH+9LOVE+1K+7LOVE+6KFH", "RUQN=4LOVE+4LOVE+9K+2KFH+6QEKB+9KFH+3RUQN", "OCA=2MR+8LOVE+7LOVE+4LOVE+8QEKB+7HU+6OCA+4YF", "RUQN=2LL+3AVS+1LL+1WFB+1OCA+3WFB+3LL+1OCA", "IPMY=8OCA+5MR+5LOVE+9LL+2HU+1AVS+5RUQN", "OCA=6IPMY+3QEKB+9HU+7IPMY+3RUQN+8HF", "WFB=1LL+6IPMY+3LOVE+3LOVE+5YF+7LOVE+4MR+1OCA", "RUQN=8IPMY+8RW+6LOVE+2LOVE+2HU+9QEKB", "LL=3MR+2RW+7K+3YF+5QEKB+8RW+9QEKB", "LL=3RUQN+6IPMY+7KFH+2LOVE+7LL+6HU", "LL=2OCA+3OCA+3MR+2WFB+1OCA+3MR+2WFB+1OCA+3WFB", "IPMY=3RUQN+2OCA+2LL+1LL+2RUQN+1OCA+3AVS", "AVS=8WFB+9IPMY+9LL+4LOVE+1RUQN+2HF+7RW+3HU+4LOVE", "WFB=9RW+9QEKB+2K+3HF+8YF+3QEKB+8LOVE+6K+2K+7OCA", "MR=7WFB+6LOVE+4YF+8KFH+6LOVE+3LOVE+9HU+8YF+6QEKB", "WFB=3OCA+2OCA+3MR+3OCA+3MR+3OCA+3OCA+2MR+2MR+2MR", "LOVE=3LOVE+3WFB+2AVS+1OCA+2YF+3IPMY+1IPMY", "LL=5LOVE+6LOVE+8RUQN+3AVS+2YF+8HU+7MR+1RW+2HF", "LOVE=3QEKB+2QEKB+1HF+1LL+2K+2KFH+2KFH+2LL", "HF=3RUQN+2HU+5RUQN+7MR+3OCA+2YF+3LOVE", "LOVE=9HU+3HF+1HU+9RW+9LOVE+4AVS+5LOVE+8K+8LOVE", "LOVE=1RW+9K+3OCA+5HF+4YF+8HF+8HF+9HU+6QEKB+8OCA", "WFB=8K+6AVS+9LOVE+2MR+7QEKB+3HU+7LOVE", "YF=8RW+7OCA+8YF+3KFH+6HF+1YF+2KFH+7LOVE", "LOVE=1LL+4RW+4QEKB+3YF+3HU+7QEKB+2HF+7RW", "RUQN=9KFH+6LL+4LOVE+7LOVE+5IPMY+9RUQN+8RW+2AVS", "KFH=2YF+3K+1YF+1YF+2AVS+3OCA+3RW+2RUQN+1HF", "AVS=9RUQN+7MR+9QEKB+4IPMY+8LOVE+8AVS+8QEKB", "K=1IPMY+2AVS+3WFB+1WFB+3MR+2RUQN+1MR+1LL", "LOVE=3LOVE+3K+2KFH+1RUQN+3K+2RUQN+2KFH+3RUQN", "AVS=3HF+2RW+5RW+3IPMY+3WFB+3YF+8QEKB+4KFH", "IPMY=7K+7KFH+5LOVE+7QEKB+5IPMY+7OCA+1AVS", "RUQN=4LOVE+8MR+1YF+2KFH+2AVS+8LOVE", "MR=9LOVE+5YF+6RW+1LL+6RUQN+5HU+4QEKB+5OCA", "RW=1OCA+2LL+2WFB+2RUQN+3K+2K+2RUQN+3IPMY", "HU=8HU+4HF+2IPMY+5HU+2HF+7MR+3LL+8WFB" };
    assertEquals(171977598, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case72() {
    String[] marketGoods = { "WLM", "VDH", "OPF" };
    int[] cost = { 28, 53, 51 };
    String[] recipes = { "YXLA=3SKB+3AW+2SAL+2ODU+3ODU+1XZL+2PYLH+1E", "SAL=9UOD+2GX+8RIE+6KMS+5SAL+3FLE+8PM+7KMS", "KMS=7WLM+9ODU+7LOVE+7UOD+2OAZ+3TFXW+1S", "PM=8PFHRX+6QOG+2WGH+5TFXW+1FLE+2WLM+3AW+7PYLH", "UOD=5KMS+4QOG+1LOVE+6PYLH+8GX+3SKB+5LOVE", "QOG=2WLM+2WLM+1VDH+1VDH+3OPF+1WLM+3VDH+3VDH", "RIE=2SKB+6RIE+6LOVE+3PM+3OPF+5LOVE+2AW+4UOD", "PFHRX=3WGH+3VDH+2GX+1VDH+2S+1ODU+2S+2WGH+1WGH", "ODU=1WGH+3WGH+3WGH+3WLM+2OPF+1WGH+1OPF+1S+2WGH", "S=3WLM+2OPF+2QOG+2WLM+2QOG+1WLM+1WLM+3WGH+2VDH", "E=2QOG+2PFHRX+1ODU+3WGH+2ODU+3PFHRX+2PFHRX", "PM=3TFXW+1SKB+6XZL+2LOVE+7AW+3FLE+5GX", "LOVE=3OPF+1PN+3RIE+3YXLA+1FLE+3KMS+2OPF+1VDH", "WLM=9E+9PFHRX+2GX+7GX+3ODU+9TFXW+8PN+5WLM", "TFXW=3PFHRX+3PN+2E+2WGH+1ODU+1S+3VDH+1GX", "FLE=3GX+2E+1KWNPO+3UOD+2AW+3QOG+2GX+1SKB+2SAL", "LOVE=3WGH+1LOVE+3ODU+2KMS+1ODU+2SKB+3OAZ+1KWNPO", "LOVE=3PYLH+3PFHRX+2OAZ+2QOG+1LOVE+2UOD+3WGH", "KWNPO=1ODU+3S+3PFHRX+1WGH+3QOG+2OPF+1PFHRX+2S", "FLE=9OPF+5GX+3PM+5PN+8WLM+7RIE+6WLM+9ODU", "SKB=5LOVE+4SAL+1WGH+9E+3OAZ+8UOD+1SKB", "PYLH=1OPF+2S+3AW+3WGH+2OPF+1SKB+2VDH+1S+1AW", "OPF=7OAZ+4SKB+1PN+4YXLA+2VDH+2TFXW+7FLE+6S", "LOVE=7PFHRX+7WLM+7SAL+4PYLH+8VDH+9UOD", "WGH=2OPF+1VDH+2QOG+1OPF+3WLM+1QOG+2OPF+2VDH", "PN=2GX+2AW+2PYLH+3E+2WLM+2AW+3ODU+3QOG+2WGH+1AW", "SAL=2E+3S+1S+1OPF+2S+2VDH+3WGH+2E+3AW+2VDH", "LOVE=7QOG+7VDH+6KWNPO+1VDH+4AW+4VDH+9PFHRX+7OAZ", "KMS=3SKB+1PFHRX+2RIE+3SAL+1UOD+3PM+2YXLA+1VDH", "RIE=1YXLA+1XZL+3TFXW+3SAL+1KWNPO+2TFXW+1GX", "VDH=1KWNPO+2AW+3SKB+3S+2UOD+8GX+7GX+2WLM", "PYLH=1VDH+3TFXW+9PM+1PYLH+3QOG+9LOVE+3GX", "GX=3VDH+3WLM+2QOG+2VDH+1WGH+2QOG+2S+3OPF+3ODU", "SKB=4SAL+4VDH+3PN+8OPF+9RIE+6OPF+7LOVE+9VDH+8WGH", "TFXW=9OPF+6SAL+9WLM+3OPF+5WLM+4TFXW+8E", "YXLA=4QOG+9SAL+8OPF+4LOVE+6WLM+2PFHRX", "SKB=2S+3OAZ+7KWNPO+6TFXW+5SKB+6KWNPO+2PFHRX", "SAL=6PFHRX+3LOVE+2PFHRX+5ODU+6YXLA+1TFXW", "S=5YXLA+9WLM+4KMS+2QOG+8QOG+2KMS+4RIE", "UOD=3OPF+1SKB+3WLM+1S+3GX+3WLM+2SKB+1SAL", "PM=1E+1FLE+2ODU+2E+2OPF+3ODU+3E+3QOG+1TFXW+3ODU", "S=8S+1ODU+3PYLH+9OPF+3LOVE+6ODU+2KWNPO", "E=5YXLA+2SAL+3WLM+5FLE+8PFHRX+9RIE+4UOD", "AW=3GX+3GX+1WGH+1E+1WGH+2ODU+2WGH+1QOG", "OAZ=3QOG+3OPF+1AW+1S+3WLM+1SAL+3RIE+1FLE", "E=1LOVE+5FLE+4SAL+3FLE+8E+7PFHRX+3LOVE+3PYLH", "KMS=3FLE+7OPF+6ODU+7LOVE+3OAZ+9WLM+1VDH+2PYLH", "TFXW=4PYLH+1QOG+2TFXW+6PM+8PN+3KMS+6AW", "XZL=2SAL+2UOD+3QOG+2SKB+1PYLH+1WGH+1VDH+1ODU", "SKB=2S+2WLM+2OPF+1S+3ODU+1VDH+3WGH+3QOG" };
    assertEquals(432525391, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case73() {
    String[] marketGoods = { "KJ", "DQH", "ENGU", "CPW", "TUFTYC", "WXHQ", "MLZL", "XRB", "QGA", "AAJ", "ZWYR", "OKNA", "BV", "CCEM", "XXDXPQ", "COCSV", "EO", "JQR", "MLKI", "BCBBZ", "PKBR", "EAR", "JCHSE", "PE", "XXLIL", "WSHE", "VRRQS", "WAC", "ONLN", "ACTQ", "SDDP", "QV", "LCK", "GR", "FVVT", "QFFGC", "VLF", "MPLKH", "VHL", "WRMN", "UERG", "ZVTUV", "ZPFJX", "XLF", "QS" };
    int[] cost = { 70, 91, 50, 98, 7, 42, 64, 2, 17, 12, 47, 32, 72, 54, 78, 34, 97, 86, 53, 47, 36, 76, 34, 68, 11, 80, 55, 84, 20, 29, 14, 46, 54, 49, 57, 36, 62, 20, 28, 34, 41, 49, 94, 96, 28 };
    String[] recipes = { "LCK=2ZVTUV+1BV+8PE+6LOVE+6BCBBZ+1S+3XRB+2MPLKH", "ACTQ=2LCK+6OKNA+2ENGU+9MPLKH+1LCK+3MLKI", "KTQJ=4QFFGC+5KJ+7ONLN+4FVVT+3ZVTUV+4HHMHN+3HHMHN", "LT=7DQH+5JCHSE+6ZWYR+4TUFTYC+7JCHSE+1VHL+5VHL", "VRJZ=7R+6FA+3R+1BCBBZ+2ZVTUV+3ZPFJX+6ZVTUV", "I=4UERG+9SMQ+2TUFTYC+8BWCL+4JCHSE+2XLF+5CPW+3WRMN", "R=4LCK+2ZVTUV+6ENGU+5EO+5DQH+5MLKI+1XLF", "VCFMBA=5AAJ+3COCSV+4PKBR+7XXLIL+5QV+1WXHQ", "BV=3LOVE+1WAC+7QQHFG+7UES+4DQH+9XXLIL+5WXHQ", "WAC=6QS+9MPLKH+7VHL+7TUFTYC+8COCSV+6QZTH", "WSHE=3HHMHN+4ZPFJX+5MLKI+8ZPFJX+1VRRQS+7WFDK", "QZTH=5VRJZ+7ZWYR+2UERG+3I+4FVVT+1JQR+7BV+1VHL", "SMQ=5UCASC+6KMRU+2ZWYR+8JQR+9ZVTUV+3KTQJ+1KJ", "UUPO=4QV+6AAJ+7QV+2XXLIL+4WXHQ+1EO+6XLF", "PKBR=4FVVT+3PE+1JCHSE+4SDDP+8KTQJ+4VLF", "VHL=3WSHE+6QV+8WXHQ+8KJ+9XXDXPQ+3QS+1WHWYV", "XLF=6PE+9KTQJ+9LOVE+9S+3NB+1BWCL+8BCBBZ+3EO", "GDU=1WXHQ+5QZTH+3TUFTYC+5UERG+6UUPO+3QFFGC", "ZVTUV=8SDDP+8BV+8R+9XXLIL+8EAR+8TUFTYC", "WXHQ=1SMQ+5R+9JCHSE+7LOVE+8SDDP+9MLZL+1XXDXPQ", "S=5CCEM+7PKBR+5NB+5XRB+8XXLIL+4AAJ+5NB", "KMRU=5XXDXPQ+5CPW+6EAR+6QV+2PKBR+3ZVTUV", "MLZL=7HHMHN+6WFDK+1CPW+8ZBD+5WAC+7ONLN", "LOVE=6WHWYV+6TUFTYC+2QS+6VHL+7CPW+2UES+1GDU+5UES", "VHL=3QV+6CCEM+6S+4XLF+8PE+5QQHFG+1UUPO", "KMRU=8NB+9JQR+3CPW+8GDU+5ZBD+1WAC", "R=7LCK+2EO+7WXHQ+3KTQJ+2S+9I+9QQHFG+4HHMHN+8KJ", "UERG=4KTQJ+3OKNA+8GR+6R+2JGUWV+7CCEM", "S=3WXHQ+7WRMN+3TUFTYC+1VCFMBA+6MLKI+1BWCL", "VHL=8QGA+4WHWYV+9QQHFG+9BCBBZ+7R+9COCSV+1JCHSE", "HHMHN=2OKNA+4VHL+6XRB+1EO+5JCHSE+3TUFTYC", "JGUWV=1QGA+1FA+1DQH+6UUPO+7BV+1LCK+4WHWYV", "UCASC=5EAR+6UUPO+1UUPO+3QV+6BV+3COCSV+7MPLKH", "FA=7GR+6MLKI+7CPW+3DQH+7CCEM+4VLF+2QV+4PE+4KJ", "BWCL=4QFFGC+1XXLIL+6LT+5MLKI+1LCK+4UUPO+2MLZL", "HHMHN=5LCK+5GDU+4SDDP+7QGA+5MLKI+8ACTQ", "VRJZ=5S+2UERG+2VLF+3XXLIL+2ZBD+1PKBR+1GDU+5XLF", "WFDK=1BV+7ZBD+1KJ+2ZPFJX+5JCHSE+3KMRU+2QQHFG", "ZBD=7LCK+6WXHQ+1XXLIL+6BV+1PE+4FVVT+7KMRU", "BV=1WHWYV+6BWCL+6WFDK+9KTQJ+6XLF+7WFDK+9WFDK+5XRB", "NB=5QGA+4CPW+4XLF+2XLF+4BV+7XXDXPQ+1HHMHN", "QQHFG=6R+6NB+4MLKI+1WXHQ+2ZBD+7UES+7TUFTYC", "JQR=8UUPO+7KMRU+9QFFGC+5VLF+7QQHFG+8UCASC+8UERG", "NB=8PKBR+8WSHE+3UES+7VRJZ+5HHMHN+8KMRU+6QFFGC", "UES=4ZBD+5QZTH+4XXDXPQ+7EO+2AAJ+4WXHQ", "LOVE=3XLF+6WSHE+2DQH+3XLF+5VHL+5UES+7UUPO", "WHWYV=7VLF+3MLKI+5LT+5TUFTYC+1UES+2FVVT+6HHMHN", "SMQ=5SDDP+3R+6QFFGC+3JQR+4BWCL+7LT+7VCFMBA", "I=2MLKI+6JQR+4CPW+6BCBBZ+2ONLN+4FA+5WRMN+6JQR", "QQHFG=3QGA+4WAC+7ZPFJX+3NB+7EAR+1EAR+1XLF" };
    assertEquals(6002550, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case74() {
    String[] marketGoods = { "LQSCAH", "T", "KEDZ", "QYMNUC", "GLC", "BZZ", "FMIXMN", "YF", "BZMC", "YZOM", "IYXWS", "ZZNFL", "JVLH", "PZW", "FJI", "MAHS", "WJS", "PQYN", "XFS", "WPDW", "SKF", "AWR", "FPXN", "MPPWV", "NSKN", "REFKW", "MWN", "RPJ", "XFH", "RU", "QQP", "OMSWDJ", "FPWOX", "VWCO", "CS", "WGZD", "BPQCOK", "WPJ", "F", "ZBVG", "AHN", "QWV", "LRN", "IJPF", "OWJSD", "UYCM", "KOL" };
    int[] cost = { 61, 1, 63, 19, 26, 35, 15, 65, 33, 65, 35, 24, 21, 9, 18, 49, 59, 13, 12, 52, 20, 16, 57, 20, 15, 49, 9, 17, 34, 14, 22, 18, 66, 51, 29, 54, 15, 34, 55, 29, 42, 58, 19, 3, 2, 18, 12 };
    String[] recipes = { "SXXV=6ZBVG+6IJPF+3F+1REFKW+3F+6WPDW+6LBQ", "FNDUW=1OWJSD+7MAHS+3AWR+6OMSWDJ+5OMSWDJ+2MPPWV", "EJVHY=5MWN+1IJPF+7MAHS+1MAHS+4RPJ+3IYXWS+1ZXTU", "LRBRK=6RUO+6RPJ+5KEDZ+6PQYN+1JVLH+6T", "QQP=5AZX+7ZBVG+4NQRIV+7WPDW+6PQ+6WJS", "NFTBGY=5YZOM+7RU+7BZZ+4JVLH+5RPJ+5SKF+3ZZNFL", "GLYZL=1FPWOX+3OMSWDJ+1BZMC+1PQYN+4NFTBGY+3FPWOX", "AXN=3MPPWV+4KOL+4CS+3IYXWS+7ZBVG+7LRN", "AZX=2PQYN+4SKF+7WPJ+5YZOM+3VWCO+5YF+5RUO+2ZXTU", "BZMC=7F+3PZW+8ZZNFL+3JVLH+4NQRIV+2EJVHY+2XRSRCT", "WPJ=4REFKW+6RPJ+5LOVE+6IJPF+1PQYN+5XGWGU+3IUWX", "VWCO=2FNDUW+8ZXTU+2BSTP+6ZXTU+7XMN+7KOL", "BSTP=2PQ+5ZBVG+3WPDW+7QYMNUC+1OWJSD+1PQ", "EYUO=6NQRIV+1REFKW+3FJI+3VWCO+4AZX+1LRN+7SKF", "FNQEL=3FPWOX+6XFH+7LRN+1BZZ+3T+4OWJSD+7SXXV", "FNQEL=9YH+2EYUO+1WQO+9LRBRK+2NSKN+8LQSCAH", "AXN=7WPJ+8MPPWV+8FJI+7ZZNFL+8ZXTU+7FJI+2YZOM", "WDJX=3AWR+4BZMC+7KOL+2XFH+5REFKW+2YZOM", "NQRIV=3T+2MAHS+5MAHS+7XFH+3JVLH+7WPDW+6ZXTU", "XMN=6WQO+7RPJ+1ZZNFL+5MPPWV+1ZZNFL+4MWN+1SXXV", "XRSRCT=1ZBVG+7ZZNFL+3ZXTU+1ZBVG+3WJS+7FPWOX", "YH=3WQO+7XRSRCT+3PZW+5FMIXMN+4ZZNFL+2NFTBGY", "ZZD=4IYXWS+4EJVHY+3MPPWV+2WJS+3RPJ+1IUWX", "LOVE=3CS+1T+6NQRIV+7WPDW+3PQYN+7BSTP+3LOVE", "T=6F+4XRSRCT+5MPPWV+4QYMNUC+2BSTP+5GLYZL", "FJI=4YF+3NQRIV+3IYXWS+6YF+7GLC+3RU+2SKF", "SKF=1XRSRCT+8OWJSD+1SXXV+7YZOM+4RUO+4IYXWS+2XFH", "PQYN=7YH+5T+3BZZ+5F+4MAHS+2MAHS+6XRSRCT", "IUWX=6RUO+4XGWGU+6BZZ+7T+7FJI+4PZW", "ZXTU=2FPXN+3CS+5LQSCAH+1BZMC+1BPQCOK+1FPWOX", "ZBVG=6FPWOX+5ZZD+7LQSCAH+6GLYZL+2AWR+6XRSRCT", "RUO=5RU+4BZMC+5NFTBGY+7OMSWDJ+7PQYN+5LBQ+6WPJ", "XGWGU=5AHN+5RU+1GLYZL+5F+5FMIXMN+1RU", "IYXWS=9IYXWS+8OWJSD+8LBQ+5YH+9IUWX+7GLYZL", "QQP=4AXN+3XMN+1GLC+5LQSCAH+2ZZNFL+9IJPF+5FPWOX", "LRBRK=4F+1COG+4SXXV+2LOVE+7EJVHY+9WPDW", "LBQ=5JVLH+1QYMNUC+1LQSCAH+3T+3IYXWS+7XFS+6REFKW", "LOVE=1BZZ+3WQO+5MPPWV+2FJI+4XFS+1AZX+6GLYZL", "T=6ZBVG+9WQO+9FMIXMN+1PZW+3YF+3T+5XFH", "COG=1KOL+7EYUO+7NSKN+6IUWX+3IUWX+1SKF+2AXN+6BPQCOK", "ZZNFL=3PZW+4YZOM+6NSKN+5OWJSD+4AHN", "PZW=3IUWX+3FMIXMN+7EYUO+5XMN+2GLC+6AXN", "ZZNFL=4IYXWS+7BZMC+4AZX+8BZZ+5EYUO", "OMSWDJ=1MAHS+6MWN+3AHN+8NFTBGY+9YF+1VWCO", "VWCO=9AHN+2LBQ+8XFS+4WPDW+1BPQCOK+7BPQCOK", "WQO=1FNQEL+3QYMNUC+5NSKN+1XRSRCT+4REFKW+7EYUO", "YH=7IUWX+9WDJX+7ZXTU+1XMN+4UYCM+3XGWGU", "PQ=6WJS+1OWJSD+2MAHS+2AWR+6FMIXMN+1ZXTU", "YH=6OMSWDJ+8T+4FPXN+9T+7XGWGU+2AZX+2VWCO+6AWR", "QYMNUC=3WGZD+6SKF+9PQYN+9ZZD+7GLC+1QYMNUC" };
    assertEquals(4783101, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case75() {
    String[] marketGoods = { "DVOHEFANK", "EYYMRGEOIDU", "BPQWBIS", "CPUSQMQET", "GRIYAUPYEKXR", "TAFCAXZSLPP", "JQFKHBLJRSKVP", "GHFZLWDF", "NFOHLDX", "JYPMALJT", "VOWEWHYYHQXS", "VMCZZGUMCIU", "PXBEBJLZGI", "SFFRPKR", "SDNDETIA", "YMGMVFIAZX", "CRENPTRJIXH", "VWHQBU", "ADQOWFPBSPLN", "RARKOLPHNBCZX", "QVHWXZTBZG", "OQDMCZWZPSBKO", "IGSYUANXTZMFA", "XAWYPHLQN", "KYSDZIMA", "MSLQYBBJ", "XFNBKSQNXAZ", "KKKKVPTNVT", "TPJDGCHX", "LGQQDHT", "NUJCYBAQCAD", "TIRQWRKH" };
    int[] cost = { 19, 17, 48, 3, 2, 60, 51, 9, 6, 3, 45, 34, 63, 3, 24, 6, 57, 38, 48, 43, 63, 26, 60, 58, 52, 8, 1, 34, 26, 65, 32, 11 };
    String[] recipes = { "MSLQYBBJ=1TLGWOFIWEQR+6DKWCDQJLED", "DESOZATMAAPNM=1XFNBKSQNXAZ+7UMBNCQVGXYQNU", "LOVE=3BPQWBIS+4ZTNBBEXI+2JQFKHBLJRSKVP", "BGLAMCCDV=4MTISAPKH+7MSLQYBBJ+3JYPMALJT", "LLVYBHK=2GHFZLWDF+4CRENPTRJIXH+5IYADUSSUFW", "HNHLZWEJUVSDO=2KKKKVPTNVT+7SWKNYGXHPC", "OXVVIODW=4YMGMVFIAZX+6BPQWBIS+1LGQQDHT", "DESOZATMAAPNM=2GLCTOFIYY+2VTFESWTDDPLEZ", "KYNQVLMXHH=3BPQWBIS+4QVHWXZTBZG+7DVOHEFANK", "ZTNBBEXI=1SWKNYGXHPC+1JYPMALJT+8KCSPIEAES", "WHRIVANKM=3VMCZZGUMCIU+7NFOHLDX+2SDNDETIA", "OLIUBQKQAT=6DKWCDQJLED+4MSLQYBBJ", "PKFPMIXN=4IYADUSSUFW+2VTFESWTDDPLEZ", "GLCTOFIYY=3TAFCAXZSLPP+2JYPMALJT+8PUPOVWF", "SWKNYGXHPC=6TDPII+5JYPMALJT+2RARKOLPHNBCZX", "AMYXNEIYCBHNN=2VWHQBU+6IYADUSSUFW", "GFOQIWY=8TDPII+2BAHKOKGJST+3PUPOVWF", "QTMYFJBLPJQGC=2IYADUSSUFW+2LLVYBHK", "TLGWOFIWEQR=3MSLQYBBJ+4TAFCAXZSLPP", "DKWCDQJLED=2RARKOLPHNBCZX+7WHRIVANKM", "JWIETYESAQP=3SDNDETIA+1JQFKHBLJRSKVP+1BGLAMCCDV", "NKYUVCCWO=6TCOCBHSYREFBFZ+4NUJCYBAQCAD", "YKNAVAX=5QTMYFJBLPJQGC+8TPJDGCHX+2NUJCYBAQCAD", "VAKQSQBJIZB=5OLIUBQKQAT+7WHRIVANKM+3CPUSQMQET", "JBJBUVOJO=4TAFCAXZSLPP+5KYNQVLMXHH", "TCOCBHSYREFBFZ=6VBNYQZSK+9HNHLZWEJUVSDO", "FKKVUQHOPQE=8OLIUBQKQAT+6TPJDGCHX", "VBNYQZSK=8YKNAVAX+6XFNBKSQNXAZ+7XFNBKSQNXAZ", "BAHKOKGJST=8CRENPTRJIXH+2VQHLOIVT", "TDPII=1AMYXNEIYCBHNN+4VMCZZGUMCIU+6MSLQYBBJ", "TCOCBHSYREFBFZ=1KKKKVPTNVT+7RARKOLPHNBCZX", "QKGYYAECNBL=2DVOHEFANK+5LLVYBHK+3PKFPMIXN", "SKFJGAWSESRX=2KYNQVLMXHH+6LGQQDHT+1BPQWBIS", "IYADUSSUFW=7QKGYYAECNBL+8OLIUBQKQAT", "KKKKVPTNVT=8TPJDGCHX+9YMGMVFIAZX", "VTFESWTDDPLEZ=1KYSDZIMA+1TIRQWRKH+6VMCZZGUMCIU", "ZFQORZFYXP=7IYADUSSUFW+2YMGMVFIAZX+7CRENPTRJIXH", "PUPOVWF=3KYSDZIMA+3VWHQBU+8TIRQWRKH+6KYNQVLMXHH", "YWVYQOMZ=7CPUSQMQET+7GRIYAUPYEKXR", "VQHLOIVT=8TIRQWRKH+5OXVVIODW+6OQDMCZWZPSBKO", "UMBNCQVGXYQNU=3GHFZLWDF+7XAWYPHLQN+6MTISAPKH", "GFOQIWY=8SWKNYGXHPC+6JQFKHBLJRSKVP", "MTISAPKH=4JYPMALJT+7IGSYUANXTZMFA", "FKKVUQHOPQE=6TLGWOFIWEQR+2MTISAPKH+4PKFPMIXN", "ZPTJXSZGWVVH=1VWHQBU+3TIRQWRKH+4TPJDGCHX", "IYADUSSUFW=1LGQQDHT+5CPUSQMQET+7XAWYPHLQN", "ZPTJXSZGWVVH=4VTFESWTDDPLEZ+3XFNBKSQNXAZ", "KCSPIEAES=1LLVYBHK+6VMCZZGUMCIU+6LLVYBHK", "NKYUVCCWO=7LLVYBHK+4DKWCDQJLED+3NFOHLDX", "YOERRNSRDIZ=4RARKOLPHNBCZX+6SDNDETIA" };
    assertEquals(682838, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case76() {
    String[] marketGoods = { "SWALJ", "PGQDT", "QEXJFU", "ARTLID", "ALGRGF", "YVCQ", "TEAMFVTW", "UPNSLV", "ELADNIU", "HDOPQU", "OUH", "DWYI", "OIBFNM", "IZJNVSYZJ", "MJRMBNB", "BHAVGBJ", "GUQQLO", "DVXSOFHI", "ZSWMII", "KOPRM", "GKNG", "SLGH", "IBDEZFI", "VOEXQCRQV", "FITIF", "WQJSVXSR", "JJI" };
    int[] cost = { 49, 27, 45, 62, 42, 40, 4, 22, 43, 52, 59, 4, 56, 23, 24, 26, 32, 28, 61, 65, 17, 62, 62, 28, 7, 66, 54 };
    String[] recipes = { "KASSC=1OUH+1ALQBDO+3ZSWMII+3BCUM+8OIBFNM+4SWALJ", "ZAIHKIM=5OIBFNM+1OIBFNM+7AYDER+5GUQQLO", "DZJFAEQ=2POGEDAW+9DZJFAEQ+2FLNRG+1JROZ+2ELADNIU", "LOVE=5SLGH+5XIJGA+8LDZKFV+5MJRMBNB+8DZJFAEQ", "DZJFAEQ=8ZAIHKIM+5FLNRG+2POGEDAW+7KASSC", "XZURZUVV=5SWALJ+2SIINLOYYW+5ORGMAPZAS", "UAOGJ=4UPNSLV+6GKNG+6OIBFNM+3LILURC", "BCUM=5OUH+6KOPRM+1QEXJFU+8FITIF+8SLGH+2KOPRM", "FDMJXISY=3PQU+7IZJNVSYZJ+5OIBFNM+6LILURC", "JROZ=3POGEDAW+7XIJGA+1DZJFAEQ+7EVSMNTPA+5UPNSLV", "QBGTJQZ=6VOEXQCRQV+4BUJZSCMO+8OIBFNM+3SIINLOYYW", "KQQUM=1GKNG+2XPOXQEVV+4MJRMBNB+6KOPRM", "SIINLOYYW=6UCOR+6IBDEZFI+8UAOGJ+4OIBFNM", "RFRYA=5VOEXQCRQV+8QEXJFU+1DVXSOFHI+3LILURC", "YYNI=8BCUM+2KQQUM+5YVCQ+2DVXSOFHI+5ALGRGF+8JJI", "VYG=2YYNI+2MJRMBNB+7KTENDR+1SIINLOYYW+5YVCQ", "LATEUKCNQ=2DVXSOFHI+6BCUM+6UCOR+4BUJZSCMO", "CHULLKO=6BHAVGBJ+8DVXSOFHI+6CHMOHAY+3BHAVGBJ", "TLKQG=1OUH+5OUH+2ELADNIU+5BCUM+1JJI+2PGQDT", "ORGMAPZAS=2ALGRGF+2FITIF+8UPNSLV+6OIBFNM", "DZJFAEQ=1QEXJFU+8PGQDT+1ARTLID+5ALQBDO", "ALQBDO=8IZJNVSYZJ+3MJRMBNB+6HDOPQU+3WQJSVXSR", "SADYUPYAA=8POGEDAW+4YYNI+8XIJGA+8IZJNVSYZJ", "BUJZSCMO=6MJRMBNB+3TLKQG+6YVCQ+3PGQDT+1JJI", "LGYFHLH=4UCOR+3DZJFAEQ+7ALQBDO+3UCOR", "MDK=3MJRMBNB+7EHSJVU+8LDZKFV+2LILURC", "YMO=7OUH+1BUJZSCMO+6AYDER+8JROZ+5BHAVGBJ+5JJI", "POGEDAW=5IZJNVSYZJ+8ZSWMII+1QEXJFU+2WQJSVXSR", "KQWINPHX=5HDOPQU+6WQJSVXSR+2OIBFNM+5UCOR", "EHSJVU=4UAOGJ+2WZWRDXHT+8UCOR+2LILURC+5UAOGJ", "PQU=4DVXSOFHI+6ORGMAPZAS+7TLKQG+5PGQDT+8YVCQ", "FLNRG=7WZWRDXHT+4ORGMAPZAS+8EVSMNTPA+2LATEUKCNQ", "LILURC=6KQQUM+2WQJSVXSR+1OIBFNM+6ALGRGF+5PGQDT", "CHMOHAY=9LJYAGBU+2UAOGJ+5QBGTJQZ+9DZJFAEQ", "EVSMNTPA=3QEXJFU+7KOPRM+2DWYI+8KQQUM+1KASSC", "AYDER=2OIBFNM+3DVXSOFHI+7DWYI+8BCUM+7SIINLOYYW", "ALGRGF=2PQU+4SWALJ+9FITIF+7SADYUPYAA+1GKNG", "MDK=2HFBKX+8HDOPQU+8LATEUKCNQ+6UPNSLV", "LJYAGBU=2ZAIHKIM+6CHULLKO+2PQU+4ZSWMII", "XOHYMYQ=5LILURC+8IZJNVSYZJ+6BUJZSCMO+2XZURZUVV", "WZWRDXHT=3OUH+7BUJZSCMO+7ARTLID+1ALQBDO", "XPOXQEVV=4SLGH+6BCUM+2GUQQLO+7MJRMBNB", "CHMOHAY=8GUQQLO+4QEXJFU+1FITIF+5GUQQLO", "UAOGJ=3UPNSLV+2LOVE+5LOVE+4KQWINPHX+2OIBFNM", "HFBKX=8LATEUKCNQ+2ORGMAPZAS+6SLGH+1GKNG+8ALGRGF", "UCOR=2LILURC+6ALQBDO+8UAOGJ+3YVCQ+8LILURC", "KTENDR=5SWALJ+8CHULLKO+6BHAVGBJ+6ORGMAPZAS", "JROZ=6ZSWMII+8LATEUKCNQ+5ALGRGF+2TLKQG", "LDZKFV=2DVXSOFHI+3ORGMAPZAS+7FITIF+8UCOR", "XIJGA=8KOPRM+4DWYI+4HDOPQU+3ORGMAPZAS+6OUH" };
    assertEquals(242207902, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case77() {
    String[] marketGoods = { "OKVGYDIIFMFXYS", "SYCUYMMJJQSWXQLKZ", "ATHVKTMUIGKROLQZQ", "FXVDDVCBFAKISJMFPLVYQ", "AUIIHRDSLUWKCJJYYE", "XTYTFEVZXPOJBUMLP", "ZVMIRKJVUTAHUCPWRPCX", "MTQIHCSDXJWT", "LCZYHMPJYHLZWLNU", "OZJIDVCBJQJAKZQH", "KDFCLLRMPWRKUYIFBILYA", "INHAMLYGHOBVKZ", "KPYIODHAHHDEMAV", "YOSHVUSHSAYTCZC", "QABPDAADQRTFEFTDLQ", "BDHPOOSXG", "ROLTWAILCICLUPUAB", "UMNZKDQKKXUJXBMAWMDA", "LFQVCWQUQFFQ", "TKRGLDAVHDUMYSW", "QMAUNMIPMEUTEDGLSJ", "XSCMJYLARNWN", "SFBJRICZLPGRUMG", "EJVLESNJGAWOWYISPMGZC", "YGLQGULEJWKCQBRNAAYNP", "IJJOOYWSMDRDGR", "WQIOHZEGZZXEWKWATKOB", "HZCZWYGTCPMNKFPLE", "JJDMQCQVIOHKDWMFZPPG", "XRBFCMZYPKTQDGVHPECY", "EYNJTFBCMKXGC", "FRODIBGSVGLLCBOCPFQ", "DHIOLSQBAPPWME", "CVSACYXYGDVUVWRBZZ", "JJRFTJUMPDOYOE", "UJKFHIBLNOGHDMORDS", "XJWEAAGIJTHURJSPFBH", "PQCWYWPKHZOCKDOKY", "NCJRXUKZBDQJ", "ABPJHADMCHWQHRALOJBMZR", "FVNMGDD", "QHBSLXXTOBAVBVDVF", "BYBXYQMDTWWVHJNVUZ", "QGJALHKULILWLHDBIVJKGK", "RKYLQTRIYFUIMMWAYL", "KYRNLBMWIKOBUEH", "EBRFHLFVKTIBWDGF", "DEBDBLYWBPJSKTPOKQZ", "UULEMSOWORRYB", "TGDHZMUACYTXOEU" };
    int[] cost = { 20, 59, 96, 11, 79, 97, 71, 63, 95, 91, 89, 65, 73, 7, 73, 90, 68, 78, 42, 68, 67, 5, 63, 23, 34, 61, 39, 74, 48, 14, 45, 4, 23, 59, 74, 26, 87, 37, 37, 89, 90, 43, 5, 43, 81, 10, 57, 93, 50, 66 };
    String[] recipes = { "QBITHOZTUDONEH=6IEDQLBAFGNSNZ+6SYCUYMMJJQSWXQLKZ", "IEDQLBAFGNSNZ=4JJRFTJUMPDOYOE+7ROJXTXDRUFAQWQL", "CDQWMSXTFQUQBYUN=5AVNWQQORUCPXENNZ+3MTQIHCSDXJWT", "LOVE=4IEDQLBAFGNSNZ+1FRODIBGSVGLLCBOCPFQ", "NUNBUBINMXZ=8UJKFHIBLNOGHDMORDS", "POXVYFTNFNOGOTFPE=8SFBJRICZLPGRUMG+8JJRFTJUMPDOYOE", "UUNEWDHJEUSSEMNRYQW=9TKRGLDAVHDUMYSW", "PKGGORUCUNCNTITI=6XRBFCMZYPKTQDGVHPECY", "PHLURFWCYTJTTHDHVY=8XSCMJYLARNWN", "IRDTNCRWQLQWXN=3BPWXMLKSYEKUSNKOYC", "IRHATNNTQLLWNIN=2TIVZBXHRZPVU+4WAMVYMXPXO", "RZXUDUYGLKASUBMB=4KYRNLBMWIKOBUEH+5OKVGYDIIFMFXYS", "FKVYZSXQUCEBTNCZWV=6BDHPOOSXG+5FVNMGDD", "GJHKARCTEXNNSRQSVH=6NUNBUBINMXZ+4GTHRCDUOMUYJ", "BPWXMLKSYEKUSNKOYC=9INHAMLYGHOBVKZ+8XSCMJYLARNWN", "MWIJJFPKXDMOAFEGP=2ZNIWYSDVZFSYKMK", "AHYLSPYPJYMLYUSABE=8XRBFCMZYPKTQDGVHPECY", "ZNIWYSDVZFSYKMK=5SFBJRICZLPGRUMG+8UULEMSOWORRYB", "ROJXTXDRUFAQWQL=4WAMVYMXPXO+3JJDMQCQVIOHKDWMFZPPG", "SFBJRICZLPGRUMG=9INHAMLYGHOBVKZ", "LOVE=2KYRNLBMWIKOBUEH+7CDQWMSXTFQUQBYUN", "OKGZFLBUVNFOMOTTL=6FTKNZTNPSDPVAQQIFK+1EGKWLDVGIO", "AVNWQQORUCPXENNZ=1FVNMGDD+8BDHPOOSXG", "ZNIWYSDVZFSYKMK=8BPWXMLKSYEKUSNKOYC", "GTHRCDUOMUYJ=5IJJOOYWSMDRDGR+7QABPDAADQRTFEFTDLQ", "FTKNZTNPSDPVAQQIFK=3QBITHOZTUDONEH", "WEXLCAJERY=9IJJOOYWSMDRDGR+4QHBSLXXTOBAVBVDVF", "ERLVWWQNUTDJDWFUUWL=6CVSACYXYGDVUVWRBZZ", "QRTOLDOOIWMOFQH=2EBRFHLFVKTIBWDGF+9WEXLCAJERY", "EBRFHLFVKTIBWDGF=4WEXLCAJERY", "DVPWQKCEFAH=3FTKNZTNPSDPVAQQIFK+3NCJRXUKZBDQJ", "ZMNYLDHEPNSYEH=5MTQIHCSDXJWT", "DEBDBLYWBPJSKTPOKQZ=4BPWXMLKSYEKUSNKOYC", "LOVE=5LCZYHMPJYHLZWLNU+3SFBJRICZLPGRUMG+9LOVE", "WEXLCAJERY=5MWIJJFPKXDMOAFEGP", "FTKNZTNPSDPVAQQIFK=7UULEMSOWORRYB", "WAMVYMXPXO=3XSCMJYLARNWN+6UJKFHIBLNOGHDMORDS", "TIVZBXHRZPVU=6WQIOHZEGZZXEWKWATKOB", "LOVE=5QBITHOZTUDONEH+1IXMKIEBUUSPLKT", "NUNBUBINMXZ=1QHBSLXXTOBAVBVDVF+2KYRNLBMWIKOBUEH", "URFLNOBEGQUIN=8YGLQGULEJWKCQBRNAAYNP", "AHGQRGHQVIPANLVET=1XJWEAAGIJTHURJSPFBH", "TQDSCCILYQVZLIUHAP=9ATHVKTMUIGKROLQZQ", "MTDBJTODYWVAFUQN=3MTQIHCSDXJWT+4URFLNOBEGQUIN", "UHRKWIPQNIWUOORD=3EJVLESNJGAWOWYISPMGZC", "SYCUYMMJJQSWXQLKZ=9EGKWLDVGIO", "DASDCCVDNYIORQNYD=2SFBJRICZLPGRUMG", "FVNMGDD=7EJVLESNJGAWOWYISPMGZC", "IXMKIEBUUSPLKT=3FXVDDVCBFAKISJMFPLVYQ", "EGKWLDVGIO=2QMAUNMIPMEUTEDGLSJ" };
    assertEquals(24372, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case78() {
    String[] marketGoods = { "A", "C" };
    int[] cost = { 1, 1 };
    String[] recipes = { "A=1B+1C", "B=1C+1A", "C=1A+1B", "LOVE=1C+1B" };
    assertEquals(3, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case79() {
    String[] marketGoods = { "WATER" };
    int[] cost = { 1 };
    String[] recipes = { "LOVE=1LOVE" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case80() {
    String[] marketGoods = { "ABCD" };
    int[] cost = { 1 };
    String[] recipes = { "BUXNGC=2DPJDFL", "QNVLUJ=2GGWRQM", "ZFIKAQ=2ADMVKD", "DPJDFL=2OTMXCM", "XWVEHV=2UYTVXZ", "OTMXCM=2JIZTCL", "NBKQRK=2KLBQIP", "WHRFRP=2BWCYLO", "LULCIW=2XWVEHV", "UQGZJV=2BUXNGC", "EGPQGW=2ABCD", "ADMVKD=2TETZQC", "HWGVYI=2ZRGDWD", "PYHMCC=2QNVLUJ", "PPTYUS=2LULCIW", "FMKQVR=2PPTYUS", "KLBQIP=2DDUIYR", "JIZTCL=2XJXQSZ", "BWCYLO=2PYHMCC", "UYTVXZ=2WHRFRP", "TETZQC=2WHQQAG", "XJXQSZ=2FMKQVR", "FKDMAO=2ZFIKAQ", "DDUIYR=2HWGVYI", "GGWRQM=2NBKQRK", "ZRGDWD=2EGPQGW", "WHQQAG=2UQGZJV", "LOVE=2FKDMAO" };
    assertEquals(268435456, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case81() {
    String[] marketGoods = { "ABCD" };
    int[] cost = { 1 };
    String[] recipes = { "DQVXXK=2CEGOUV", "CEGOUV=2CVFZTG", "OXKTTE=2MUOEDJ", "BUXNGC=2DPJDFL", "DDUIYR=2HWGVYI", "WHRFRP=2BWCYLO", "PPTYUS=2LULCIW", "FMKQVR=2PPTYUS", "PYHMCC=2QNVLUJ", "LGLUKA=2DQVXXK", "ZRGDWD=2EGPQGW", "FKDMAO=2ZFIKAQ", "KVLXDV=2OXKTTE", "DPJDFL=2OTMXCM", "AUPUOE=2CSQMEP", "CSQMEP=2BJUIXI", "NNVKXV=2AUPUOE", "LULCIW=2XWVEHV", "EGPQGW=2ABCD", "BJUIXI=2MCIBRX", "CGAMWF=2KVLXDV", "MCIBRX=2KXOCNH", "GGWRQM=2NBKQRK", "XWVEHV=2UYTVXZ", "WZAIOU=2QPNFPQ", "ZFIKAQ=2ADMVKD", "HWGVYI=2ZRGDWD", "XJXQSZ=2FMKQVR", "JIZTCL=2XJXQSZ", "UYTVXZ=2WHRFRP", "MTGRAA=2ZALRAC", "KXOCNH=2CGAMWF", "UQGZJV=2BUXNGC", "QNVLUJ=2GGWRQM", "ABGSVC=2HVUKBO", "CVFZTG=2MTGRAA", "BWCYLO=2PYHMCC", "LIVBIS=2NNVKXV", "HVUKBO=2LIVBIS", "WHQQAG=2UQGZJV", "ZALRAC=2ABGSVC", "BMBJGE=2LGLUKA", "KLBQIP=2DDUIYR", "OTMXCM=2JIZTCL", "MUOEDJ=2FKDMAO", "NBKQRK=2KLBQIP", "TETZQC=2WHQQAG", "QPNFPQ=2BMBJGE", "ADMVKD=2TETZQC", "LOVE=2WZAIOU" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case82() {
    String[] marketGoods = { "ABCD" };
    int[] cost = { 100 };
    String[] recipes = { "CEGOUV=9CVFZTG", "UQGZJV=9BUXNGC", "BUXNGC=9DPJDFL", "ZFIKAQ=9ADMVKD", "LIVBIS=9NNVKXV", "BWCYLO=9PYHMCC", "LGLUKA=9DQVXXK", "CVFZTG=9MTGRAA", "DQVXXK=9CEGOUV", "ZALRAC=9ABGSVC", "MUOEDJ=9FKDMAO", "LULCIW=9XWVEHV", "XWVEHV=9UYTVXZ", "OTMXCM=9JIZTCL", "WHRFRP=9BWCYLO", "FMKQVR=9PPTYUS", "GGWRQM=9NBKQRK", "NBKQRK=9KLBQIP", "QPNFPQ=9BMBJGE", "EGPQGW=9ABCD", "KLBQIP=9DDUIYR", "ADMVKD=9TETZQC", "OXKTTE=9MUOEDJ", "TETZQC=9WHQQAG", "UYTVXZ=9WHRFRP", "PPTYUS=9LULCIW", "MCIBRX=9KXOCNH", "ZRGDWD=9EGPQGW", "WHQQAG=9UQGZJV", "KVLXDV=9OXKTTE", "DPJDFL=9OTMXCM", "KXOCNH=9CGAMWF", "CGAMWF=9KVLXDV", "BJUIXI=9MCIBRX", "CSQMEP=9BJUIXI", "WZAIOU=9QPNFPQ", "MTGRAA=9ZALRAC", "JIZTCL=9XJXQSZ", "NNVKXV=9AUPUOE", "ABGSVC=9HVUKBO", "HVUKBO=9LIVBIS", "FKDMAO=9ZFIKAQ", "HWGVYI=9ZRGDWD", "DDUIYR=9HWGVYI", "PYHMCC=9QNVLUJ", "QNVLUJ=9GGWRQM", "BMBJGE=9LGLUKA", "XJXQSZ=9FMKQVR", "AUPUOE=9CSQMEP", "LOVE=9WZAIOU" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case83() {
    String[] marketGoods = { "MILK", "WATER", "HOP" };
    int[] cost = { 6, 1, 14 };
    String[] recipes = { "NECTAR=4HOP+2MILK", "LOVE=5MILK+3BEER", "LOVE=2WATER+1LOVE", "LOVE=2MIX+1NECTAR", "MIX=1MILK+1WATER+1HOP", "BEER=5WATER+2HOP", "LOVE=1NECTAR+3WATER+3HOP", "NECTAR=3BEER+1MILK+2MILK" };
    assertEquals(110, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case84() {
    String[] marketGoods = { "LOVE" };
    int[] cost = { 100 };
    String[] recipes = {  };
    assertEquals(100, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case85() {
    String[] marketGoods = { "HATE" };
    int[] cost = { 100 };
    String[] recipes = {  };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case86() {
    String[] marketGoods = { "A" };
    int[] cost = { 100 };
    String[] recipes = { "B=5A", "C=5B", "D=5C", "E=5D", "F=5E", "G=5F", "H=5G", "I=2H", "J=2I", "K=2J", "L=2K", "M=2L", "N=2M", "O=2N", "LOVE=1O" };
    assertEquals(1000000000, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case87() {
    String[] marketGoods = { "A", "Z" };
    int[] cost = { 100, 1 };
    String[] recipes = { "B=5A", "C=5B", "D=5C", "E=5D", "F=5E", "G=5F", "H=5G", "I=2H", "J=2I", "K=2J", "L=2K", "M=2L", "N=2M", "O=2N", "LOVE=1O+1Z" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case88() {
    String[] marketGoods = { "A", "Z" };
    int[] cost = { 100, 1 };
    String[] recipes = { "B=5A", "C=5B", "D=5C", "E=5D", "F=5E", "G=5F", "H=5G", "I=2H", "J=2I", "K=2J", "L=2K", "M=2L", "N=2M", "O=2N", "LOVE=1Z+1O+1Z" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case89() {
    String[] marketGoods = { "EXQYJZPUFT" };
    int[] cost = { 100 };
    String[] recipes = { "EJQDWOBEXU=1EXQYJZPUFT", "QFZSPONGDO=1EJQDWOBEXU", "VPALDEWLBY=1QFZSPONGDO", "MAIASKERYK=1VPALDEWLBY", "WMAKYPGIQM=1MAIASKERYK", "YBBOFODRKD=1WMAKYPGIQM", "OXRFOKAZKY=1YBBOFODRKD", "QXQJOFKLOV=1OXRFOKAZKY", "NPOGJGZQCU=1QXQJOFKLOV", "ETDWNZJRMT=1NPOGJGZQCU", "NYDQRFIAKV=1ETDWNZJRMT", "AVKXBRQIAK=1NYDQRFIAKV", "MDBTPPSBRZ=1AVKXBRQIAK", "UYTJLILIHJ=1MDBTPPSBRZ", "ANDETOAQTQ=1UYTJLILIHJ", "WVMYDEWKFZ=1ANDETOAQTQ", "QEFFTHTTHL=1WVMYDEWKFZ", "IJUEZKXGUW=1QEFFTHTTHL", "PGYNYLVUIW=1IJUEZKXGUW", "FJNFTISXLR=1PGYNYLVUIW", "BVWFLLDVOD=1FJNFTISXLR", "KSMLCOEOFY=1BVWFLLDVOD", "HYMBYGLOVP=1KSMLCOEOFY", "FULQWBMWTD=1HYMBYGLOVP", "QELELAIIDN=1FULQWBMWTD", "PRUDMAWONJ=1QELELAIIDN", "CGPJGCXYIS=1PRUDMAWONJ", "QIGHUMFFQS=1CGPJGCXYIS", "XEQLHKYBHX=1QIGHUMFFQS", "ZCRXTCCTBO=1XEQLHKYBHX", "FTIMGHBNQK=1ZCRXTCCTBO", "SXIZTWWDES=1FTIMGHBNQK", "NVGOKPADLB=1SXIZTWWDES", "HKSFSJYEHI=1NVGOKPADLB", "RKBVCAUNYU=1HKSFSJYEHI", "OZQOQTAADY=1RKBVCAUNYU", "UXUZYJTKUQ=1OZQOQTAADY", "BSPLDESFBH=1UXUZYJTKUQ", "IWYLADMUZZ=1BSPLDESFBH", "GBXCWPFIYB=1IWYLADMUZZ", "NIVTQTOJLO=1GBXCWPFIYB", "MDRSSKKGWP=1NIVTQTOJLO", "DMSGSGYGWT=1MDRSSKKGWP", "IYWKAXLHYL=1DMSGSGYGWT", "GKZNMTWOLY=1IYWKAXLHYL", "BYLUASMGUR=1GKZNMTWOLY", "YHPMGNCBTN=1BYLUASMGUR", "DKHTORFZKS=1YHPMGNCBTN", "TYIKUQQPVE=1DKHTORFZKS", "LOVE=1TYIKUQQPVE" };
    assertEquals(100, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case90() {
    String[] marketGoods = { "DEPVLBAAJJ" };
    int[] cost = { 100 };
    String[] recipes = { "LOVE=1EMFPHAIWWK", "EMFPHAIWWK=1PRVFSUMJIC", "PRVFSUMJIC=1FMYXBVTDIV", "FMYXBVTDIV=1MQRBNSPIKU", "MQRBNSPIKU=1YXVNXWBYND", "YXVNXWBYND=1SMUXNBDHID", "SMUXNBDHID=1CFNIOZFSUK", "CFNIOZFSUK=1DXOEDBQPOT", "DXOEDBQPOT=1ACVBABLOMW", "ACVBABLOMW=1DPGPASTONA", "DPGPASTONA=1HHHAEVTORV", "HHHAEVTORV=1YITPEMSREG", "YITPEMSREG=1RLCJPAOWCX", "RLCJPAOWCX=1HPSIJGLLXN", "HPSIJGLLXN=1KHMFJMIGBQ", "KHMFJMIGBQ=1QDOUZJYVOQ", "QDOUZJYVOQ=1QEWRAVNTGA", "QEWRAVNTGA=1PICDZWSXRO", "PICDZWSXRO=1DXWITLIPFF", "DXWITLIPFF=1GCZXGPWBUG", "GCZXGPWBUG=1GMRIEDRIYR", "GMRIEDRIYR=1FZJCTHHYRY", "FZJCTHHYRY=1XCJLOVQYUX", "XCJLOVQYUX=1HYYGBWOJSY", "HYYGBWOJSY=1HOGLOOSWQW", "HOGLOOSWQW=1YMWRDPJQCP", "YMWRDPJQCP=1RPRBJQNRIA", "RPRBJQNRIA=1VSAOBTYYYT", "VSAOBTYYYT=1UXVSKDXSUL", "UXVSKDXSUL=1SLZMEFSSIG", "SLZMEFSSIG=1TKLZEKJIJO", "TKLZEKJIJO=1OWQTKBZMFM", "OWQTKBZMFM=1WSEHCZTOMN", "WSEHCZTOMN=1DZCXAQBKNF", "DZCXAQBKNF=1ODZPVTOYDP", "ODZPVTOYDP=1IJDZGRPWVY", "IJDZGRPWVY=1UJCTPWKRMQ", "UJCTPWKRMQ=1CLGEYHNVEG", "CLGEYHNVEG=1QNEPKKUQTO", "QNEPKKUQTO=1HOGIQNJKAH", "HOGIQNJKAH=1PFWERZECKN", "PFWERZECKN=1GCMSHGKTNR", "GCMSHGKTNR=1RSVUFBYKDE", "RSVUFBYKDE=1LGWTTHKFJC", "LGWTTHKFJC=1JEXUZDMRJJ", "JEXUZDMRJJ=1ZCTKTMNSCL", "ZCTKTMNSCL=1VGCBWWDBBZ", "VGCBWWDBBZ=1SPVGXXXRNQ", "SPVGXXXRNQ=1HXBZHTYFWD", "HXBZHTYFWD=1DEPVLBAAJJ" };
    assertEquals(100, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case91() {
    String[] marketGoods = { "CEGX", "P", "Q", "PMP", "XSA", "SK", "A", "YVYOG", "N", "MP" };
    int[] cost = { 2, 13, 16, 10, 19, 4, 11, 9, 13, 10 };
    String[] recipes = { "SK=5YHH", "LOVE=5YHH", "YHH=5Q+3XSA+5PMP", "P=3LOVE+1YHH", "XSA=5PMP", "Q=3YHH+4PMP" };
    assertEquals(935, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case92() {
    String[] marketGoods = { "F", "YBR", "VX" };
    int[] cost = { 65, 36, 52 };
    String[] recipes = { "NXHI=1EAOY", "LOVE=1B", "HRSK=4P", "U=3U", "EAOY=2VX", "LOVE=4LG", "YBR=5Z", "DQI=2F", "F=1VX", "B=4NXHI" };
    assertEquals(416, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case93() {
    String[] marketGoods = { "HZANH", "WFZS", "BRJ", "K", "YS" };
    int[] cost = { 11, 4, 2, 20, 2 };
    String[] recipes = { "K=3EPBV+3OTEMU", "LOVE=3WACAT+3BRJ", "WACAT=3Z", "Z=2OKOFW+2HZANH", "BRJ=1WACAT+1LHCIH", "AVOW=3K", "OKOFW=3YS" };
    assertEquals(312, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case94() {
    String[] marketGoods = { "P", "DRE", "JA", "PP", "WVC", "LOVE", "HWX", "UCS", "D", "KYJO", "M", "KSA", "NH", "PAQI", "EQ", "WH", "ZEPB", "B", "AARUP", "FINQX", "JJDS", "BQ", "W", "RZXVG" };
    int[] cost = { 2, 14, 56, 9, 73, 72, 41, 23, 28, 36, 60, 11, 61, 61, 68, 12, 10, 60, 73, 73, 17, 21, 36, 72 };
    String[] recipes = { "JJDS=1BQ+1JA", "LOVE=1M", "AARUP=1ZEPB+1HWX", "NH=1P+1LOVE", "ZEPB=1JJDS+1JJDS", "HWX=1KYJO", "D=1EQ", "KSA=1P+1KYJO", "LOVE=1PP", "P=1WH+1HWX", "LOVE=1NH", "ZEPB=1P", "PAQI=1JJDS+1FINQX+1B", "PAQI=1DRE+1WVC", "P=1JA+1JJDS", "WVC=1KSA+1ARI+1W", "AARUP=1D+1PP", "PP=1D+1JA", "P=1UCS", "PAQI=1W+1JJDS", "DRE=1W", "PP=1WH+1LOVE+1KSA", "WVC=1WVC+1ZEPB+1KYJO", "JA=1JJDS+1M+1D", "KYJO=1RZXVG+1D+1EQ", "JA=1WH", "LOVE=1HWX", "RZXVG=1FINQX", "WH=1PAQI+1M+1NH", "B=1UCS+1LOVE", "JJDS=1PP", "B=1W+1RZXVG", "PAQI=1ZEPB+1M", "DRE=1RZXVG+1KSA", "WH=1P", "M=1ZEPB+1W+1UCS", "BQ=1WH", "P=1FINQX", "ARI=1ARI+1RZXVG+1W", "JA=1KYJO+1AARUP", "EQ=1BQ+1M+1ARI", "HWX=1KYJO", "EQ=1JJDS+1BQ", "DRE=1B", "JA=1AARUP", "EQ=1ZEPB+1EQ", "ZEPB=1FINQX+1B+1KYJO" };
    assertEquals(8, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case95() {
    String[] marketGoods = { "LG", "HQCGS", "ELLF", "EYFXY", "R", "KDES", "SSWD", "P", "EUW", "CIMXS" };
    int[] cost = { 42, 25, 34, 44, 7, 13, 32, 25, 48, 54 };
    String[] recipes = { "R=5SSQKU+3RDMZ+9LG", "RDMZ=7W", "RXP=7E", "SSWD=6EYFXY+5EUW+3UHG", "W=7YAEH+3KDES", "LOVE=4RDMZ+9P+5EYFXY", "PK=4C+6EYFXY", "UHG=7HQCGS+4LOVE+6ETTSK", "LG=3HQCGS+6KDES+8W", "SSWD=5KDES+3ETTSK+5SSWD", "UHG=8EUW", "CIMXS=6QO+9W+5IJCV", "W=6HQCGS+1AZLDT", "PCM=1RDMZ", "PK=4RXP+4LG+8CIMXS", "Z=8SO", "R=5KR+7PK", "SO=8W+2FEF+1R", "QO=1LG+7ETTSK", "RDMZ=1YAEH+3YAEH+7IJCV", "CIMXS=7ELLF+9W", "SSWD=7QL+2QL+3QO", "WVN=4E+6HQCGS+7PK", "QL=9EUW+9QO+5KR", "DRS=1QL", "R=3QL", "EYFXY=1LOVE+8HQCGS+5PCM", "ELLF=4PCM", "WVN=1Z+2W", "LG=7IJCV+9QO", "C=7RXP+3C", "W=6UHG+9RXP", "HQCGS=3YAEH+6WVN+7SO", "RXP=1EYFXY", "RXP=6SSQKU+8R", "EUW=5QTCHF+4C+9P", "WVN=9SO", "RDMZ=5W+2LOVE+5UHG", "W=7EUW+6C", "QL=4RDMZ", "W=9UHG+2QTCHF+4RDMZ", "UHG=1KR+1AZLDT+1R", "FEF=8E", "DRS=7C+8EUW", "IJCV=7SSQKU+7KR", "IJCV=9RXP+9SSQKU+6Z" };
    assertEquals(76045, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case96() {
    String[] marketGoods = { "VLAV" };
    int[] cost = { 56 };
    String[] recipes = { "VXWM=3N", "Q=6BYFEU", "AM=6VLAV", "E=3VJPZ", "OIF=3CTSCP", "LOVE=2E", "BYFEU=3HFGJP", "UHMW=4BYFEU", "ZJ=1UHMW", "VLAV=2GS", "RRSWM=6UHMW", "BNM=2SXBB", "RFM=2QUDBU", "CTSCP=4RFM", "HFGJP=6GS", "KBT=3HZT", "VXWM=3HZT", "BYFEU=1VXWM", "KBK=2CTSCP", "AM=6RFM", "VLAV=4ZJ", "SXBB=4CTSCP", "GS=5HFGJP", "SXBB=3RFM", "IKRWO=5RRSWM", "HFGJP=6XWBX", "VXWM=4V", "SXBB=3BYFEU", "CTSCP=2BYFEU", "RRSWM=1QUDBU", "SXBB=5N", "VXWM=6V", "HZT=6ZJ", "LOVE=1KBT", "GS=5GS", "N=4GS", "IKRWO=4Q", "BYFEU=4OIF", "GS=6VLAV", "VXWM=3TAMS", "IKRWO=5MDXK", "HZT=5BNM", "KBK=6TAMS", "VLAV=3OIF", "CTSCP=5HZT" };
    assertEquals(201600, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case97() {
    String[] marketGoods = { "RWKS", "PM", "KENYU", "VCJ", "K", "LQCNO" };
    int[] cost = { 32, 14, 39, 34, 18, 23 };
    String[] recipes = { "MISZ=1QEC+3LSW+1FQS", "LOVE=5TW+5Y+2RWKS", "JT=4TBBQ", "QRE=2FQS+1KENYU", "FQS=1HGH+3QRE+1BECSF+2LQCNO+5JT+5UZXHA", "UZXHA=5LQCNO", "UZXHA=5KENYU+3VCJ", "T=4BECSF+4VCJ+3QRE+5VCJ+1LOVE", "KENYU=4EOLP+4PM", "QRE=4TW", "K=3FQS", "QRE=2BECSF", "LOVE=1QEC+4MIPAI+2TW+5PM+4LSW+4QRE", "T=4TW+3LQCNO+1LSW+3LSW+5TW", "EOLP=4K+3K+3UZXHA+1LSW+2TBBQ", "Y=1FQS", "Y=4MISZ+5PM+4JT", "MISZ=4TW+5SU", "MISZ=5QEC+1KENYU+5LSW+4VCJ+5MISZ", "UZXHA=2EOLP+3TW+5JT", "TBBQ=5BECSF+4HGH+4HGH+5VCJ+4HGH", "TBBQ=3UZXHA+5T+4T+3SU", "QEC=2LQCNO", "K=2EOLP+4LOVE+1BECSF+2T+3T", "TW=1QEC+2RWKS+3FQS+4LSW+1BECSF+5FQS", "K=4JT+4K+5KENYU", "JT=4SU", "SU=1K+3UZXHA+2MIPAI", "LQCNO=5RWKS+5SU+5FQS+4FQS+3LSW+5QEC", "QRE=5TBBQ", "SU=5FQS+5QEC+1MIPAI", "TW=4KENYU+5K+1KENYU+4PM+1JT+3VCJ", "BECSF=3RWKS+1HGH+5RWKS+4TW", "LOVE=1K+3LSW+5JT", "SU=1QEC+3LOVE+3LOVE+1QRE+2Y+1JT", "QEC=5EOLP+3RWKS+5LSW+5RWKS+4PM+3PM", "TBBQ=3RWKS+2JT+3QEC+3SU", "MISZ=1VCJ+5T+5UZXHA+4JT+1LSW", "TW=5TBBQ+4JT+1LSW+4LSW+5TBBQ+2FQS", "SU=2MISZ+3BECSF", "EOLP=3JT+2QRE+1MISZ", "FQS=4PM+3VCJ+5LQCNO+1Y+5MIPAI", "MIPAI=2K+3PM", "MIPAI=2Y+1FQS+5FQS+4EOLP+1BECSF", "LQCNO=3BECSF+5T", "QEC=4KENYU+2TBBQ", "EOLP=2EOLP+5LQCNO+2K+4MIPAI+4KENYU+4T", "KENYU=4SU+2PM+2LOVE" };
    assertEquals(307949, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case98() {
    String[] marketGoods = { "DBY", "FNOQ", "CUONF", "RPSUG" };
    int[] cost = { 92, 99, 99, 95 };
    String[] recipes = { "FNOQ=9S+9FNOQ+9LOVE+8ZXDPN+9S", "GZ=9H+9GZ+8XA+8RPSUG+9H", "A=8ZXDPN+9SEQ+8S", "Z=8ZXDPN+9RPSUG", "VCB=9A", "XA=8FNOQ+8CUONF+8CUONF+9VCB+9Z+9MLGOK", "VCB=9LOVE", "ZXDPN=9S+9DBY+8ZXDPN", "CUONF=8CUONF+8QG+9H+9LOVE+8XA+8DBY", "FNOQ=8QG+8Z+9SEQ+9MLGOK", "GZ=9GZ+9ZXDPN+8H", "XA=9CUONF+9RPSUG+9Z", "GZ=8MLGOK+9S+8MLGOK+9FNOQ", "S=8VCB+9DBY+9CUONF", "RPSUG=9XA+8RPSUG+8RPSUG+9DBY+9QG+8ZXDPN", "FNOQ=9GZ+9Z", "ZXDPN=9DBY", "SEQ=8QG+8XA+8CUONF+8MLGOK+8SEQ", "MLGOK=9FNOQ+9S+9MLGOK+9GZ+9Z+8VCB", "VCB=8RPSUG+8Z+8S+8MLGOK", "CUONF=9Z", "A=8A+8SEQ+8A+9H", "H=8A+8FNOQ+8QG+8Z", "H=8Z+8XA", "CUONF=9GZ+8RPSUG+8CUONF+9SEQ+8VCB+8GZ", "S=8Z+8XA+9MLGOK", "MLGOK=9XA+8CUONF+9DBY+9H", "LOVE=9VCB+8LOVE+8MLGOK", "SEQ=9Z+8Z+8H+8GZ+8VCB+8QG", "VCB=8FNOQ+8SEQ+9Z+9H+8ZXDPN+9XA", "RPSUG=8RPSUG", "ZXDPN=9DBY+9S", "LOVE=8MLGOK+8H", "DBY=8S+8RPSUG+9LOVE+9A+9S+8LOVE", "SEQ=8VCB+9RPSUG+9MLGOK+8S+9S+8MLGOK", "VCB=9DBY+9ZXDPN+8H+8SEQ+8MLGOK", "S=9A+9RPSUG+9GZ" };
    assertEquals(53968104, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case99() {
    String[] marketGoods = { "HZ", "XHQ", "UCH", "A", "FOE", "KK", "YD", "NIRWI", "BAKNR", "SZUSV", "YJI", "KA", "TCEDT", "AASB", "JGBS", "WAEY" };
    int[] cost = { 91, 100, 96, 90, 93, 95, 96, 100, 95, 95, 90, 99, 90, 91, 97, 94 };
    String[] recipes = { "RF=9XLQKH+9JWS", "KK=9FOHFG+9XBB+8KK", "FGGZB=8T", "DIMGQ=9DP+9FCCO+9VH", "XLQKH=8FOE+8JWOJF+8FOE", "HSDWH=9A+8V+9BOKSX", "XHQ=9Z", "XBB=8FGGZB", "WAEY=8WGAB", "SZUSV=8FGGZB+8DWVZT+8MART", "FOHFG=9MART", "XHQ=8RF+9YJI", "BAKNR=9FOE", "DP=8FOE+9FCCO+9YJI", "FCCO=9KK", "DWVZT=9XBB+9UCH", "BAKNR=8HSDWH+8YD+9KK", "FGGZB=9A+8JWOJF", "XLQKH=9XLQKH+9LOVE+8HZ", "FCCO=9XBB+9TCEDT+9XLQKH", "AASB=9FCCO+9Z", "RF=9V", "XHQ=8VH+9S+8Z", "XHQ=8KK+9UCH+9HZ", "AASB=8JGBS+9XBB+9KK", "FOE=8BAKNR", "JWOJF=8Z+9YD", "KA=8AASB", "ZW=8DIMGQ", "JWS=9MART+8CW+9Z", "ZW=9A", "DWVZT=9FOE+9VH+9XLQKH", "UCH=8SZUSV+9HZ+9NIRWI", "SZUSV=8KK+9HSDWH", "XLQKH=9V", "FOHFG=9FOE+8BAKNR", "T=9XHQ+9LOVE+8XHQ", "HZ=9JGBS", "CW=8WAEY+8KK", "RF=9JWOJF+8YJI+9JGBS", "S=9VH", "BAKNR=9TCEDT", "Z=8SZUSV+9XHQ", "LOVE=9V", "JGBS=9TCEDT+8ZW", "YD=9HZ+9DIMGQ", "WGAB=8HSDWH", "TCEDT=8HZ+9HZ", "LOVE=9FOHFG+8DWVZT+8JGBS", "HZ=8XLQKH+8NIRWI+9XLQKH" };
    assertEquals(65664173, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case100() {
    String[] marketGoods = { "M", "EOK", "N", "UM", "JHOJY", "NU", "KEGM" };
    int[] cost = { 100, 96, 98, 93, 93, 99, 91 };
    String[] recipes = { "BHDEU=8QMWKP", "UM=8L", "KM=8SA", "SA=8VXTSU", "AU=9L", "K=9EOK", "EOK=8P", "UV=8LMC", "M=9LMC", "L=9N", "GTA=8K", "L=8OWB", "QMWKP=9HZCTF", "OWB=8WALO", "EOK=8X", "KEGM=8UV", "EOK=8WALO", "HZCTF=9QMWKP", "K=8K", "L=9L", "UV=8LOVE", "KM=9QMWKP", "UM=9K", "HZCTF=8TVQZ", "WALO=9K", "JHOJY=8OUV", "M=9VXTSU", "TVQZ=8AU", "AU=8KM", "JHOJY=9WALO", "EOK=8GTA", "UV=9GTA", "WALO=8VXTSU", "SA=9M", "AU=8L", "LOVE=8BHDEU" };
    assertEquals(260112384, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case101() {
    String[] marketGoods = { "OP", "BFXS", "TVOSJ", "LC", "I", "E", "P", "LOVE", "FICDN", "ZOILX", "NJDWV", "OOCH", "OJQQ", "ODNO" };
    int[] cost = { 93, 90, 95, 95, 98, 99, 97, 97, 98, 92, 97, 91, 99, 93 };
    String[] recipes = { "VJBE=8G+8PPSZQ+9LC+9PPSZQ+9FICDN+8FICDN", "KIRVY=9VJBE+9VJBE+8QGSDU+9P+9G+9OP", "RGVMO=8PPSZQ+9OJQQ+8LC+8NJDWV+8OJQQ+8PPSZQ+8BFXS", "FICDN=8F+8LC+8F+9QZKVM+8OJQQ+8F+9PPSZQ", "BFXS=8OJQQ+8OJQQ+9OJQQ+9OJQQ+8OJQQ+8OJQQ", "KIRVY=8VJBE+8VJBE+9OP+9TDJT+8OOCH+8OOCH+9VJBE", "PPSZQ=8OJQQ+9OJQQ+9OJQQ+9BFXS+8NJDWV+8OJQQ", "E=9TVOSJ+8TVOSJ+9UM+8P+8ZOILX+8N+8CFAIT", "G=8ODNO+9QZKVM+9QZKVM+8ODNO+8QZKVM+8QZKVM", "TDJT=9PPSZQ+8RGVMO+8NJDWV+8F+8NJDWV+9F+9QZKVM", "F=9NJDWV+8PPSZQ+8OJQQ+8RGVMO+8PPSZQ+8LC", "LC=8PPSZQ+8BFXS+9PPSZQ+9NJDWV+8OJQQ+8OJQQ+8BFXS", "LOVE=9KIRVY+9KIRVY+8TVOSJ+9KIRVY+9CFAIT+8KIRVY+8E", "QGSDU=8NJDWV+8RGVMO+8FICDN+9LC+8ODNO+8F+9ODNO", "F=9RGVMO+9NJDWV+9LC+9OJQQ+8NJDWV+9NJDWV", "PPSZQ=8BFXS+9BFXS+9BFXS+9OJQQ+8OJQQ+9NJDWV", "VJBE=9G+8PPSZQ+8TDJT+8ODNO+8TDJT+8F", "E=9CFAIT+8KIRVY+8ZOILX+8I+9I+8TVOSJ+9P", "NJDWV=9BFXS+8OJQQ+8BFXS+9BFXS+9BFXS+9OJQQ", "CFAIT=9OOCH+8OOCH+8VJBE+9OOCH+8TDJT+8QZKVM", "P=9QGSDU+9VJBE+9VJBE+8G+8N+8G", "QGSDU=9PPSZQ+8G+9LC+9LC+8BFXS+8PPSZQ", "UM=9OOCH+8OOCH+9N+8VJBE+8N+9KIRVY", "PPSZQ=9NJDWV+8OJQQ+8BFXS+9BFXS+8OJQQ+8NJDWV+9OJQQ", "KIRVY=9TDJT+9CFAIT+9TVOSJ+8CFAIT+8P+9CFAIT+9VJBE", "I=9VJBE+9OP+8P+8KIRVY+8UM+8CFAIT+9N", "NJDWV=8OJQQ+9BFXS+9OJQQ+8BFXS+9BFXS+8OJQQ+9BFXS", "P=8VJBE+9OOCH+8VJBE+8CFAIT+8OOCH+8N", "QZKVM=8OJQQ+9LC+9NJDWV+9OJQQ+9NJDWV+8RGVMO", "PPSZQ=9NJDWV+8OJQQ+9OJQQ+9BFXS+8BFXS+9BFXS", "P=8G+8G+8OP+8G+9CFAIT+8OOCH", "TVOSJ=8TDJT+9FICDN+8OOCH+9TDJT+9OOCH+8FICDN+8FICDN", "RGVMO=9NJDWV+9OJQQ+9LC+9PPSZQ+8NJDWV+8OJQQ+9PPSZQ", "NJDWV=8BFXS+8OJQQ+9OJQQ+9OJQQ+9BFXS+8OJQQ", "NJDWV=8OJQQ+8BFXS+9BFXS+8OJQQ+8BFXS+9BFXS+8BFXS", "QZKVM=8RGVMO+8RGVMO+9NJDWV+8LC+9BFXS+8BFXS", "LC=9NJDWV+9BFXS+9OJQQ+9BFXS+8BFXS+8OJQQ", "LOVE=8ZOILX+8OP+8P+9KIRVY+8E+9ZOILX+8P", "NJDWV=9BFXS+8BFXS+9OJQQ+9OJQQ+9BFXS+9BFXS+8OJQQ", "OP=8N+9VJBE+8OOCH+9OOCH+8QZKVM+8QZKVM", "TDJT=8PPSZQ+8PPSZQ+8QZKVM+9QZKVM+9QZKVM+8NJDWV", "BFXS=8OJQQ+9OJQQ+9OJQQ+9OJQQ+8OJQQ+9OJQQ+8OJQQ", "OOCH=8QZKVM+8TDJT+8RGVMO+9QZKVM+8RGVMO+8F", "NJDWV=8OJQQ+9OJQQ+8OJQQ+8OJQQ+9BFXS+9BFXS", "OOCH=8G+9N+9N+8RGVMO+8G+8ODNO", "UM=8TVOSJ+8N+9OOCH+9CFAIT+8OOCH+9N+9OOCH", "BFXS=9OJQQ+8OJQQ+9OJQQ+8OJQQ+8OJQQ+9OJQQ" };
    assertEquals(97, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case102() {
    String[] marketGoods = { "QPC", "THL", "ANG", "MXA", "XXJGG", "ZY", "SJPKE", "MX", "RGQ", "CPT", "BSN", "XEN" };
    int[] cost = { 95, 97, 99, 99, 99, 90, 92, 94, 94, 97, 92, 94 };
    String[] recipes = { "T=9YSMRU+9XXJGG+9XEN+8XEN+8GVQEG+8THL+9XXJGG", "ANG=8SJPKE+9XEN+9THL+8THL+9JDKHP+9GVQEG", "MX=9MXA+8IG+9MXA+9IG+8UV+9CPT+8RGQ", "ZMYAR=8RGQ+8RGQ+8HD+9ZY+9UV+8BSN", "UV=9CPT+9CPT+8IG+8IG+8CPT+9CPT+8IG", "ZY=9HD+9CPT+9UV+8HD+8CPT+9CPT", "HD=8MXA+8UV+8RGQ+8IG+9MX+8UV", "ANG=9YSMRU+8ZMYAR+9XXJGG+9ZMYAR+8ZMYAR+8XXJGG", "XEN=9HD+9UV+8BSN+8RGQ+9MX+9ZY", "BSN=9IG+8MX+8RGQ+9UV+8UV+8MXA+8RGQ", "UV=9RGQ+8IG+9CPT+8RGQ+8MXA+9RGQ+8CPT", "KKL=8YSMRU+9THL+9SJPKE+9GVQEG+9YSMRU+8QPC+8WGMT", "HD=9CPT+9RGQ+9RGQ+9RGQ+8BSN+9UV", "T=8THL+8QPC+9MTS+9JDKHP+9QPC+8GVQEG+8JDKHP", "XEN=8RGQ+8MX+9RGQ+9RGQ+9MXA+9MXA+9XXJGG", "ZY=9HD+9RGQ+8RGQ+8MX+8MX+8MX", "UV=8RGQ+9MXA+9MXA+9MXA+8CPT+8CPT+8MXA", "HD=8CPT+9MXA+8RGQ+9RGQ+9UV+9MXA", "THL=9XXJGG+8XXJGG+8ZMYAR+8XEN+9XEN+8MTS+9ZMYAR", "XEN=8BSN+8UV+9ZMYAR+9XXJGG+8MTS+9MX+8ZY", "KKL=9QPC+9THL+9T+8THL+8XEN+8GVQEG+8QPC", "T=8MTS+9XXJGG+9MTS+9YSMRU+9MTS+9GVQEG", "MXA=8IG+9CPT+8IG+8IG+9IG+9IG", "UV=9RGQ+8RGQ+9MXA+9CPT+9RGQ+8RGQ+8CPT", "WGMT=8YSMRU+8GVQEG+8QPC+8YSMRU+8JDKHP+9GVQEG+8ANG", "XEN=9XXJGG+9MX+8ZY+9ZMYAR+9MXA+9BSN", "THL=8MTS+9XXJGG+9YSMRU+8BSN+8ZMYAR+9GVQEG+8ZY", "LOVE=8KKL+9GOC+9ANG+9T+8WGMT+9T", "JDKHP=8HD+9THL+8SJPKE+8XEN+8MTS+8YSMRU", "BSN=9MXA+9MX+8CPT+8RGQ+8MX+9IG+8MXA", "YSMRU=8MX+9BSN+8BSN+8XXJGG+8BSN+9SJPKE", "GVQEG=9BSN+9ZMYAR+9XEN+9MX+8RGQ+8ZY+8ZMYAR", "YSMRU=8MTS+8MTS+9MX+8XXJGG+8XEN+9MTS", "ZMYAR=8HD+9MX+8HD+8RGQ+9HD+8MXA+9MXA", "GOC=8QPC+9WGMT+8T+9GVQEG+9JDKHP+9THL", "ANG=9GVQEG+8XEN+8GVQEG+8GVQEG+9YSMRU+8THL+8QPC", "MX=8RGQ+9IG+8MXA+8CPT+9CPT+9RGQ", "GVQEG=8HD+9XEN+9BSN+9BSN+8ZMYAR+9RGQ+8RGQ", "RGQ=8CPT+9IG+9CPT+9CPT+9IG+8MXA+9CPT", "UV=9MXA+8RGQ+9MXA+9IG+9IG+8MXA", "T=8YSMRU+9SJPKE+8XEN+8XEN+8MTS+8YSMRU", "JDKHP=9THL+9GVQEG+8HD+8XEN+9YSMRU+9HD", "ZY=9MX+8IG+8MX+8UV+9CPT+9UV", "GOC=9YSMRU+9QPC+8T+8GVQEG+8YSMRU+9JDKHP+9SJPKE", "MX=9RGQ+8UV+9CPT+8RGQ+8CPT+8MXA", "YSMRU=9GVQEG+9BSN+8XXJGG+8HD+8HD+8ZY", "MX=9IG+8CPT+8RGQ+9CPT+8IG+9CPT", "MXA=8IG+8IG+9CPT+8IG+9CPT+9CPT", "LOVE=8GOC+8WGMT+9T+8ANG+8JDKHP+8JDKHP" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case103() {
    String[] marketGoods = { "CWO", "Z", "RCQF", "MJQMJ", "P" };
    int[] cost = { 100, 90, 91, 96, 99 };
    String[] recipes = { "CWO=9RCG+8V+9OI+9LAZP+9M+9Z+9WFOYK", "OI=8Z+8P+8SDK+8IR+9V+9SDK", "P=8IXS+9RCQF+9SDK+8IR+9IR+9IR", "IXS=8SDK+9SDK+9IR+9IR+8IR+8SDK", "LAZP=9Z+8IR+9WFOYK+8IR+9OI+8SDK", "LOVE=8WFOYK+9M+8TRQKH+9TRQKH+8TRQKH+9TRQKH", "IXS=8IR+8SDK+9RCQF+8SDK+9RCQF+8IR+9RCQF", "RCG=9LAZP+8SDK+8OI+9Z+8IXS+8V+8V", "LOVE=9MJQMJ+9V+9LAZP+8MJQMJ+8TRQKH+8MJQMJ+8WFOYK", "CWO=9OI+8MJQMJ+9WFOYK+8M+9TRQKH+9RCG", "OI=9SDK+8V+9Z+8SDK+8SDK+8RCQF+9IR", "IR=9SDK+9RCQF+8SDK+8RCQF+9RCQF+8RCQF+9SDK", "CWO=8WFOYK+9P+8MJQMJ+8WFOYK+9OI+9P", "LOVE=9Z+9M+9Z+9WFOYK+8RCG+8LAZP+8CWO", "P=8RCQF+9IXS+9RCQF+8IR+9IXS+8SDK", "CWO=8V+8V+8RCG+8M+8Z+8MJQMJ+8M", "M=9IXS+8Z+8TRQKH+9IR+9P+9Z", "P=9RCQF+9SDK+8RCQF+9IR+8RCQF+9RCQF+8IR", "LOVE=8V+9OI+8LAZP+9WFOYK+8TRQKH+8WFOYK", "SDK=9RCQF+9RCQF+8RCQF+9RCQF+8RCQF+9RCQF", "P=8SDK+9SDK+9IXS+8IXS+8IR+8RCQF", "P=8RCQF+9SDK+9RCQF+9RCQF+9IR+8RCQF+9SDK", "IXS=9SDK+8RCQF+9RCQF+9RCQF+9IR+9RCQF", "M=9OI+8LAZP+9Z+9OI+8IR+9V+8Z", "RCG=9OI+9OI+9OI+9OI+9LAZP+8OI", "RCG=8TRQKH+8Z+9IXS+8P+8WFOYK+8TRQKH+8TRQKH", "WFOYK=8SDK+8V+8V+8P+8RCQF+8RCQF", "Z=9IR+8IR+8IR+8SDK+9IR+9P", "RCG=9V+9SDK+9Z+9TRQKH+8V+8IR+9IR", "OI=8IXS+8IXS+8Z+9RCQF+9RCQF+9V+9P", "IXS=9IR+8IR+8RCQF+9IR+8RCQF+8IR", "MJQMJ=9M+9IXS+9P+9OI+8V+8OI+8IXS", "TRQKH=8Z+8OI+9V+8V+9P+9WFOYK", "P=9IXS+8RCQF+8IXS+8IXS+9IXS+8IXS", "MJQMJ=8P+9WFOYK+9WFOYK+9P+8IXS+8M", "IXS=9SDK+9RCQF+8RCQF+9IR+8IR+8SDK", "SDK=8RCQF+9RCQF+9RCQF+8RCQF+8RCQF+9RCQF+9RCQF", "TRQKH=9Z+8V+8Z+8WFOYK+8IXS+9V+9P", "Z=9P+8P+8IXS+9SDK+8SDK+9SDK+8IR", "LAZP=9SDK+9WFOYK+9Z+8V+9SDK+9V", "V=9IR+9IXS+9SDK+9SDK+8RCQF+8RCQF", "IXS=8RCQF+9IR+9RCQF+8RCQF+8SDK+8RCQF+8IR", "LAZP=9V+8SDK+8WFOYK+8P+8RCQF+9Z" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case104() {
    String[] marketGoods = { "LOVE", "WATER", "HONEY" };
    int[] cost = { 100, 1, 30 };
    String[] recipes = { "LOVE=5WATER+3HONEY" };
    assertEquals(95, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case105() {
    String[] marketGoods = { "HONEYBIT" };
    int[] cost = { 100 };
    String[] recipes = { "LOVE=6HONEYMEGABYTE", "HONEYMEGABYTE=2HONEYFIFTYTWELVEKBYTES", "HONEYFIFTYTWELVEKBYTES=8HONEYSIXTYFOURKBYTES", "HONEYSIXTYFOURKBYTES=8HONEYEIGHTKBYTES", "HONEYEIGHTKBYTES=8HONEYKBYTE", "HONEYKBYTE=2EIGHTBYEIGHTWORDS", "EIGHTBYEIGHTWORDS=8EIGHTWORDS", "EIGHTWORDS=8HONEYWORD", "HONEYWORD=8HONEYBYTE", "HONEYBYTE=8HONEYBIT" };
    assertEquals(1000000001, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case106() {
    String[] marketGoods = { "MILK", "WATER", "HOP" };
    int[] cost = { 6, 1, 14 };
    String[] recipes = { "NECTAR=4HOP+2MILK", "LOVE=5MILK+3BEER", "LOVE=2WATER+1LOVE", "LOVE=2MIX+1NECTAR", "MIX=1MILK+1WATER+1HOP", "BEER=5WATER+2HOP", "LOVE=1NECTAR+3WATER+3HOP", "NECTAR=3BEER+1MILK+2MILK" };
    assertEquals(110, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case107() {
    String[] marketGoods = { "WATER", "HONEY", "HOP" };
    int[] cost = { 1, 22, 17 };
    String[] recipes = { "LOVE=7WATER+3HONEY", "LOVE=2HONEY+2HOP" };
    assertEquals(73, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case108() {
    String[] marketGoods = { "WATER", "HONEY", "HOP", "MILK", "NECTAR", "SUGAR", "XX" };
    int[] cost = { 1, 22, 17, 6, 9, 3, 7 };
    String[] recipes = { "LOVE=7WATER+3HONEY", "LOVE=2HONEY+2HOP", "CREAM=2SUGAR+3HOP", "XX=4MILK+2NECTAR" };
    assertEquals(73, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case109() {
    String[] marketGoods = { "A" };
    int[] cost = { 12 };
    String[] recipes = {  };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case110() {
    String[] marketGoods = { "LOVE", "WATER", "HONEY" };
    int[] cost = { 10, 1, 30 };
    String[] recipes = { "LOVE=5WATER+3HONEY" };
    assertEquals(10, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case111() {
    String[] marketGoods = { "LOVE", "WATER", "HONEY" };
    int[] cost = { 100, 1, 30 };
    String[] recipes = { "AOVE=5WATER+3HONEY" };
    assertEquals(100, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case112() {
    String[] marketGoods = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "V", "Z", "AA", "BB", "CC", "DD", "EE", "FF", "GG", "HH", "II", "JJ", "KK", "LL", "ASD", "ER", "CX", "GH", "RT", "UI", "DFDF", "RTV", "AAASD", "LOVE" };
    int[] cost = { 1, 5, 10, 15, 50, 60, 70, 80, 90, 1, 3, 5, 7, 9, 13, 17, 19, 50, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 89 };
    String[] recipes = { "LOVE=1J+2B", "J=1I+1H", "I=1G+1F", "H=1D+2C", "C=1A+1B", "B=2A+2C", "K=4O+3L" };
    assertEquals(11, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case113() {
    String[] marketGoods = { "A", "B", "C", "D", "E" };
    int[] cost = { 1, 2, 3, 4, 5 };
    String[] recipes = { "LOVE=1A+2B+3F", "F=1A+2B+3G", "G=1A+2B+3F", "LOVE=1A+2B+3C", "LOVE=1A+2B" };
    assertEquals(5, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case114() {
    String[] marketGoods = { "OIL", "WATER" };
    int[] cost = { 60, 70 };
    String[] recipes = { "LOVE=1FIRSTPOTION+1SECONDPOTION", "FIRSTPOTION=1OIL+1SECONDPOTION", "SECONDPOTION=4WATER+1FIRSTPOTION" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case115() {
    String[] marketGoods = { "A", "B", "C", "D", "E", "F", "G", "H" };
    int[] cost = { 10, 100, 4, 5, 10, 5, 11, 10 };
    String[] recipes = { "B=2A+4D+5C", "LOVE=2A+1B+1C+1D+1E", "A=1E+2F+3B", "B=2F+2G", "D=2E", "E=3LOVE" };
    assertEquals(71, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case116() {
    String[] marketGoods = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BB", "CC", "DD", "EE", "FF", "GG", "HH", "II", "JJ", "KK", "LL" };
    int[] cost = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 13, 12 };
    String[] recipes = { "LOVE=5WATER+3HONEY" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

  @Test
  public void case117() {
    String[] marketGoods = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BB", "CC", "DD", "EE", "FF", "GG", "HH", "II", "JJ", "KK", "LL" };
    int[] cost = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 13, 12 };
    String[] recipes = { "LOVE=5WATER+3HONEY" };
    assertEquals(-1, makingpotions.getCost(marketGoods, cost, recipes));
  }

}
