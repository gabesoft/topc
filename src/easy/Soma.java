package topc.easy;

import java.util.*;
import java.io.*;

// SRM 198 Division I Level Three - 1200
// brute force, geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2824&rd=5073
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm198
public class Soma {
  static final int X = 0;
  static final int Y = 1;  
  static final int Z = 2;
  static final int INVALID = -1;
  static final int EMPTY   = -2;
  static final int FILLED  = -3;
  static final int PIECES = 7;
  static final int ORIENTATIONS = 25;
  static final int MAXCUBES = 4;

  int solutions;
  Cube[] patSorted;
  int[][][] pat3d;
  int[][][][] pieces;

  public int letMeCountTheWays(String[] pattern) {
    preprocess(pattern);
    countWays(new boolean[PIECES], 0, 0);
    return solutions;
  }

  void countWays(boolean[] used, int free, int usedCount) {
    while (pat3d[patSorted[free].x]
                [patSorted[free].y]
                [patSorted[free].z] != EMPTY) { free++; }

    int fx = patSorted[free].x;
    int fy = patSorted[free].y;
    int fz = patSorted[free].z;

    for (int p = 0; p < PIECES; p++) {
      if (used[p]) { continue; }

      for (int o = 0; o < ORIENTATIONS; o++) {
        if (pieces[p][o][0][X] == INVALID) { break; }

        boolean bad = false;
        for (int c = 1; c < MAXCUBES; c++) {
          int x = pieces[p][o][c][X];
          int y = pieces[p][o][c][Y];
          int z = pieces[p][o][c][Z];
          if (x != INVALID && pat3d[x + fx][y + fy][z + fz] != EMPTY) {
            bad = true;
          }
        }

        if (!bad && usedCount == PIECES - 1) {
          solutions++;
          return;
        }

        if (!bad) {
          for (int c = 0; c < MAXCUBES; c++) {
            int x = pieces[p][o][c][X];
            int y = pieces[p][o][c][Y];
            int z = pieces[p][o][c][Z];
            if (x == INVALID) { break; }
            pat3d[x + fx][y + fy][z + fz] = FILLED;
          }
          used[p] = true;

          countWays(used, free + 1, usedCount + 1);

          for (int c = 0; c < MAXCUBES; c++) {
            int x = pieces[p][o][c][X];
            int y = pieces[p][o][c][Y];
            int z = pieces[p][o][c][Z];
            if (x == INVALID) { break; }
            pat3d[x + fx][y + fy][z + fz] = EMPTY;
          }
          used[p] = false;
        }
      }
    }
  }

  void preprocess(String[] pattern) {
    solutions = 0;
    buildPieces();
    buildPattern(pattern);
  }

  void buildPattern(String[] pattern) {
    int maxx = 0;
    int maxy = 0;
    int maxz = 0;
    int pad = 2;
    List<Cube> cubes = new ArrayList<Cube>();
    for (int z = 0; z < pattern.length; z++) {
      for (int x = 0; x < pattern[z].length(); x++) {
        for (int y = 0; y < pattern[z].charAt(x) - '0'; y++) {
          cubes.add(cb(x + pad, y + pad, z + pad));
          maxx = Math.max(maxx, x + pad);
          maxy = Math.max(maxy, y + pad);
          maxz = Math.max(maxz, z + pad);
        }
      }
    }

    patSorted = cubes.toArray(new Cube[] {});
    Arrays.sort(patSorted);

    pat3d = new int[maxx + pad + 1][maxy + pad + 1][maxz + pad + 1];

    for (int i = 0; i < pat3d.length; i++) {
      for (int j = 0; j < pat3d[0].length; j++) {
        Arrays.fill(pat3d[i][j], INVALID);
      }
    }

    for (int i = 0; i < patSorted.length; i++) {
      Cube c = patSorted[i];
      pat3d[c.x][c.y][c.z] = EMPTY;
    }
  }

  void buildPieces() {
    HashSet<String> seen = new HashSet<String>();
    Cube[][] origp = {
      { cb(0, 0, 0), cb(0, 0, 1), cb(1, 0, 0), cb(2, 0, 0) },
      { cb(0, 0, 0), cb(1, 0, 0), cb(1, 0, 1), cb(2, 0, 0) },
      { cb(0, 0, 1), cb(1, 0, 0), cb(1, 0, 1), cb(2, 0, 0) },
      { cb(0, 0, 0), cb(0, 0, 1), cb(1, 0, 0) },
      { cb(0, 0, 1), cb(1, 0, 0), cb(1, 0, 1), cb(1, 1, 0) },
      { cb(0, 0, 0), cb(0, 0, 1), cb(0, 1, 0), cb(1, 0, 1) },
      { cb(0, 0, 0), cb(1, 0, 0), cb(1, 0, 1), cb(1, 1, 0) }
    };

    pieces = new int[PIECES][ORIENTATIONS][MAXCUBES][3];
    for (int i = 0; i < PIECES; i++) {
      for (int j = 0; j < ORIENTATIONS; j++) {
        for (int k = 0; k < MAXCUBES; k++) {
          Arrays.fill(pieces[i][j][k], INVALID);
        }
      }
    }

    for (int p = 0; p < PIECES; p++) {
      int orientation = 0;

      Cube[] piece = origp[p];
      for (int xamt = 0; xamt < 4; xamt++) {

        Cube[] xpiece = xrotate(piece, xamt);
        for (int yamt = 0; yamt < 4; yamt++) {

          Cube[] ypiece = yrotate(xpiece, yamt);
          for (int zamt = 0; zamt < 4; zamt++) {

            Cube[] zpiece = zrotate(ypiece, zamt);
            Arrays.sort(zpiece);
            for (int c = zpiece.length - 1; c > -1; c--) {
              zpiece[c] = zpiece[c].sub(zpiece[0]);
            }

            String repr = Arrays.toString(zpiece);
            if (!seen.contains(repr)) {
              seen.add(repr);
              for (int c = 0; c < zpiece.length; c++) {
                pieces[p][orientation][c] = zpiece[c].toArray();
              }
              orientation++;
            }
          }
        }
      }
    }
  }

  Cube[] xrotate(Cube[] points, int amt) {
    Cube[] res = new Cube[points.length];
    for (int j = 0; j < res.length; j++) {
      res[j] = points[j].xrotate(amt);
    }
    return res;
  }

  Cube[] yrotate(Cube[] points, int amt) {
    Cube[] res = new Cube[points.length];
    for (int j = 0; j < res.length; j++) {
      res[j] = points[j].yrotate(amt);
    }
    return res;
  }

  Cube[] zrotate(Cube[] points, int amt) {
    Cube[] res = new Cube[points.length];
    for (int j = 0; j < res.length; j++) {
      res[j] = points[j].zrotate(amt);
    }
    return res;
  }

  Cube cb(int x, int y, int z) {
    return new Cube(x, y, z);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Cube implements Comparable<Cube> {
    public final int x;
    public final int y;
    public final int z;

    public Cube(int x, int y, int z) {
      this.x = x;
      this.y = y;
      this.z = z;
    }

    public Cube xrotate(int amt) {
      int[][] xrot = { { 1, 0, 0 }, { 0, 0, 1 }, { 0, -1, 0 } };
      return rotate(xrot, amt);
    }

    public Cube yrotate(int amt) {
      int[][] yrot = { { 0, 0, -1 }, { 0, 1, 0 }, { 1, 0, 0 } };
      return rotate(yrot, amt);
    }

    public Cube zrotate(int amt) {
      int[][] zrot = { { 0, 1, 0 }, { -1, 0, 0 }, { 0, 0, 1 } };
      return rotate(zrot, amt);
    }

    public Cube sub(Cube c) {
      return new Cube(x - c.x, y - c.y, z - c.z);
    }

    public int[] toArray() {
      return new int[] { x, y, z };
    }

    Cube rotate(int[][] rot, int amt) {
      int[] p = { x, y, z };
      int[] r = p.clone();

      for (int a = 0; a < amt; a++) {
        for (int i = 0; i < 3; i++) {
          r[i] = 0;
          for (int j = 0; j < 3; j++) {
            r[i] += p[j] * rot[j][i];
          }
        }
        p = r.clone();
      }

      return new Cube(r[0], r[1], r[2]);
    }

    public String toString() {
      return String.format("(%s,%s,%s)", x, y, z);
    }

    public int compareTo(Cube other) {
      if (x != other.x) { return Integer.valueOf(x).compareTo(other.x); }
      if (y != other.y) { return Integer.valueOf(y).compareTo(other.y); }
      if (z != other.z) { return Integer.valueOf(z).compareTo(other.z); }
      return 0;
    }
  }
}
