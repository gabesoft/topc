package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 433 Division II Level Three - 1000
// greedy, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10009&rd=13695
// editorial: http://community.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm433
public class MakingPotions {
    int LIM = 1000000001;

    public int getCost(String[] marketGoods, int[] cost, String[] recipes) {
        HashMap<String, Integer> map = createMap(marketGoods, recipes);
        int n = map.size();

        if (!map.containsKey("LOVE")) { return -1; }

        RecipeList[] rlist = createRecipeList(recipes, map, n);
        long[] costs       = new long[n];

        Arrays.fill(costs, -1);

        for (int i = 0; i < marketGoods.length; i++) {
            costs[map.get(marketGoods[i])] = cost[i];
        }

        while (updateCosts(costs, rlist));

        return (int)Math.min(LIM, costs[map.get("LOVE")]);
    }

    boolean updateCosts(long[] costs, RecipeList[] rlist) {
        boolean progress = false;
        int n            = rlist.length;

        for (int i = 0; i < n; i++) {
            RecipeList list = rlist[i];

            if (list == null) { continue; }

            for (int j = 0; j < list.recipes.length; j++) {
                Recipe r = list.recipes[j];
                if (r == null) { continue; }

                long curr = -1;
                for (int k = 0; k < r.ingredients.length; k++) {
                    int ingredient = r.ingredients[k];

                    if (costs[ingredient] == -1) {
                        curr = -1;
                        break;
                    } else {
                        curr = Math.max(0, curr);
                        curr += (long)r.quantity[k] * costs[ingredient];
                        curr = Math.min(LIM, curr);
                    }
                }

                if (curr < 0) { continue; }

                if (costs[i] == -1 || costs[i] > curr) {
                    costs[i] = curr;
                    progress = true;
                }
            }
        }

        return progress;
    }

    RecipeList[] createRecipeList(String[] recipes, HashMap<String, Integer> map, int n) {
        RecipeList[] result = new RecipeList[n];

        for (int i = 0; i < recipes.length; i++) {
            String parts[]       = recipes[i].split("=");
            String ingredients[] = parts[1].split("\\+");
            int quant[] = new int[ingredients.length];
            int items[] = new int[ingredients.length];

            for (int j = 0; j < ingredients.length; j++) {
                String ingr = ingredients[j];
                quant[j]    = ingr.charAt(0) - '0';
                items[j]    = map.get(ingr.substring(1, ingr.length()));
            }

            int p = map.get(parts[0]);
            if (result[p] == null) {
                result[p] = new RecipeList();
            }

            result[p].add(items, quant);
        }

        return result;
    }

    HashMap<String, Integer> createMap(String[] marketGoods, String[] recipes) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int n = 0;

        for (int i = 0; i < marketGoods.length; i++) {
            n = addToMap(map, marketGoods[i], n);
        }

        for (int i = 0; i < recipes.length; i++) {
            String parts[]       = recipes[i].split("=");
            String ingredients[] = potions(parts[1].split("\\+"));

            n = addToMap(map, parts[0], n);
            for (int j = 0; j < ingredients.length; j++) {
                n = addToMap(map, ingredients[j], n);
            }
        }

        return map;
    }

    int addToMap(HashMap<String, Integer> map, String s, int n) {
        if (!map.containsKey(s)) { 
            map.put(s, n++);
        }
        return n;
    }

    String[] potions(String[] ingredients) {
        String res[] = new String[ingredients.length];
        for (int i = 0; i < res.length; i++) {
            String s = ingredients[i];
            res[i]   = s.substring(1, s.length());
        }
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class RecipeList {
        public Recipe[] recipes;

        public RecipeList() {
            recipes = new Recipe[0];
        }

        public void add(int[] ingredients, int[] quantity) {
            Recipe[] next = new Recipe[recipes.length + 1];
            System.arraycopy(recipes, 0, next, 0, recipes.length);
            next[next.length - 1] = new Recipe(ingredients, quantity);
            recipes = next;
        }

        public void removeAt(int k) {
            Recipe[] next = new Recipe[recipes.length - 1];
            int j = 0;
            for (int i = 0; i < next.length; i++) {
                if (i == k) { j++; } 
                next[i] = recipes[j++];
            }
            recipes = next;
        }
    }

    class Recipe {
        public int[] ingredients;
        public int[] quantity;

        public Recipe(int[] ingredients, int[] quantity) {
            this.ingredients = ingredients;
            this.quantity    = quantity;
        }
    }
}
