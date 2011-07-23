package topc.bfs;

import java.util.*;

// SRM 223 Div 1 : 1000 (BFS)
public class RevolvingDoors {
  static public final int EMPTY = -1;
  static public final int WALL = -2;
  static public final int START = -3;
  static public final int END = -10;
  static public final int SEEN = -4;
  static public final int DOOR = 0;
  static public final int DOOR_UP = -5;
  static public final int DOOR_DOWN = -6;
  static public final int DOOR_LEFT = -7;
  static public final int DOOR_RIGHT = -8;
  static public final int DOOR_H = -100;
  static public final int DOOR_V = -200;
  static public final int LEFT_TOP = 1 << 8;
  static public final int LEFT_BTM = 1 << 6;
  static public final int RIGHT_TOP = 1 << 7;
  static public final int RIGHT_BTM = 1 << 5;
  static public final int UP_LEFT = 1 << 4;
  static public final int UP_RIGHT = 1 << 3;
  static public final int DOWN_LEFT = 1 << 2;
  static public final int DOWN_RIGHT = 1 << 1;
  static public final int[] ADJ = { -1, 0, 0, -1, 0, 1, 1, 0 };
  int rows = 0;
  int cols = 0;
  Queue<Maze> mazes;
  HashSet<String> uniqs;

  public int turns(String[] map) {
    mazes = new LinkedList<Maze>();
    uniqs = new HashSet<String>();
    rows = map.length;
    cols = map[0].length();

    int[][] maze = new int[rows][cols];
    int start = 0;
    int end = 0;
    for (int i = 0; i < rows; i++) {
      char[] row = map[i].toCharArray();
      for (int j = 0; j < cols; j++) {
        switch (row[j]) {
          case 'S': 
            maze[i][j] = EMPTY;
            start = encode(i, j);
            break;
          case 'E': 
            maze[i][j] = EMPTY;
            end = encode(i, j);
            break;
          case 'O': maze[i][j] = DOOR; break;
          case '-': maze[i][j] = DOOR_H; break;
          case '|': maze[i][j] = DOOR_V; break;
          case '#': maze[i][j] = WALL; break;
          default : maze[i][j] = EMPTY; break;
        }
      }
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (maze[i][j] == DOOR_H) {
          if (j == cols - 1) { maze[i][j] = DOOR_LEFT; }
          else if (j == 0) { maze[i][j] = DOOR_RIGHT; }
          else if (maze[i][j - 1] == DOOR) { maze[i][j] = DOOR_RIGHT; }
          else if (maze[i][j + 1] == DOOR) { maze[i][j] = DOOR_LEFT; }
        } else if (maze[i][j] == DOOR_V) {
          if (i == rows - 1) { maze[i][j] = DOOR_DOWN; }
          else if (i == 0) { maze[i][j] = DOOR_UP; }
          else if (maze[i - 1][j] == DOOR) { maze[i][j] = DOOR_DOWN; }
          else if (maze[i + 1][j] == DOOR) { maze[i][j] = DOOR_UP; }
        }
      }
    }

    Maze first = new Maze(maze, 0, start, end);
    mazes.add(first);
    uniqs.add(first.toString());
    while (mazes.size() > 0) {
      Maze curr = mazes.remove();
      if (solve(curr)) {
        return curr.getLevel();
      }
    }

    return -1;
  }

  boolean solve(Maze maze) {
    boolean cont = true;
    HashSet<Integer> seen = new HashSet<Integer>();
    HashSet<Integer> mark = new HashSet<Integer>();
    seen.add(maze.getStart());
    while (cont) {
      int size = seen.size();
      Object[] moves = seen.toArray();
      for (int i = 0; i < moves.length; i++) {
        int move = ((Integer)moves[i]).intValue();
        if (!mark.contains(move) && advance(move, maze, seen)) {
          return true;
        }
        mark.add(move);
      }
      cont = size < seen.size();
    }
    return false;
  }

  boolean advance(int position, Maze maze, HashSet<Integer> seen) {
    boolean found = false;
    for (int cell : maze.getAdjCells(position)) {
      int v = maze.getValue(cell);
      int door = -1;

      if (cell == maze.getEnd() && v == EMPTY) {
        found = true;
        break;
      }

      switch (v) {
        case EMPTY      : seen.add(cell); break;
        case DOOR_UP    :
        case DOOR_DOWN  :
        case DOOR_LEFT  :
        case DOOR_RIGHT :
                          Maze next = maze.pushDoor(position, cell);
                          if (next != null && !uniqs.contains(next.toString())) {
                            mazes.add(next);
                            uniqs.add(next.toString());
                          }
                          break;
      }
    }
    return found;
  }

  public static int encode(int i, int j) {
    return (i << 8) | j;
  }

  public static int[] decode(int x) {
    return new int[] { (x & (255 << 8)) >> 8, x & 255 };
  }

  public void printMaze(int[][] maze) {
    char[][] chars = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        switch (maze[i][j]) {
          case START: chars[i][j] = 'S'; break;
          case END: chars[i][j] = 'E'; break;
          case EMPTY: chars[i][j] = ' '; break;
          case WALL: chars[i][j] = '#'; break;
          case SEEN: chars[i][j] = 'x'; break;
          case DOOR: chars[i][j] = 'O'; break;
          case DOOR_UP: chars[i][j] = '|'; break;
          case DOOR_DOWN: chars[i][j] = '|'; break;
          case DOOR_LEFT: chars[i][j] = '-'; break;
          case DOOR_RIGHT: chars[i][j] = '-'; break;
          default: chars[i][j] = 'O'; break;
        }
      }
    }
    for (int i = 0; i < rows; i++) {
      System.out.println(Arrays.toString(chars[i]));
    }
    System.out.println("");
  }

  class Maze {
    int[][] _maze;
    int _level;
    int _start;
    int _end;

    public Maze(int[][] maze, int level, int start, int end) {
      _maze = maze;
      _level = level;
      _start = start;
      _end = end;
    }

    public int getLevel() {
      return _level;
    }

    public int getStart() {
      return _start;
    }

    public int getEnd() {
      return _end;
    }

    public int[][] getMaze() {
      return _maze;
    }

    public int[] getAdjCells(int position) {
      int[] loc = RevolvingDoors.decode(position);
      ArrayList<Integer> adj = new ArrayList<Integer>();
      int count = 0;
      for (int i = 0; i < ADJ.length / 2; i++) {
        int row = loc[0] + ADJ[count++];
        int col = loc[1] + ADJ[count++];
        if (row < rows && col < cols && row > -1 && col > -1) {
          adj.add(RevolvingDoors.encode(row, col));
        }
      }
      int[] res = new int[adj.size()];
      for (int i = 0; i < res.length; i++) {
        res[i] = adj.get(i).intValue();
      }
      return res;
    }

    public int getValue(int position) {
      int[] loc = RevolvingDoors.decode(position);
      return _maze[loc[0]][loc[1]];
    }

    public int getBelow(int position) {
      int[] loc = RevolvingDoors.decode(position);
      return _maze[loc[0]+1][loc[1]];
    }

    public int getAbove(int position) {
      int[] loc = RevolvingDoors.decode(position);
      return _maze[loc[0]-1][loc[1]];
    }

    public int getLeft(int position) {
      int[] loc = RevolvingDoors.decode(position);
      return _maze[loc[0]][loc[1]-1];
    }

    public int getRight(int position) {
      int[] loc = RevolvingDoors.decode(position);
      return _maze[loc[0]][loc[1]+1];
    }

    public Maze pushDoor(int position, int doorCell) {
      int[] pos = RevolvingDoors.decode(position);
      int[] loc = RevolvingDoors.decode(doorCell);
      int posi = pos[0];
      int posj = pos[1];
      int loci = loc[0];
      int locj = loc[1];
      int[][] maze = null;
      int start = doorCell;
      int door = 0;
      int doori = 0;
      int doorj = 0;
      switch (_maze[loci][locj]) {
        case DOOR_UP:
          doori = loci + 1;
          doorj = locj;
          door = _maze[doori][doorj];
          if (posi == loci && posj < locj && (door & LEFT_TOP) == 0) {
            maze = copyMaze();
            rotate(maze, doori, doorj, DOOR_LEFT, DOOR_RIGHT, EMPTY, EMPTY, LEFT_TOP); 
          }
          else if (posi == loci && posj > locj && (door & RIGHT_TOP) == 0) {
            maze = copyMaze();
            rotate(maze, doori, doorj, DOOR_LEFT, DOOR_RIGHT, EMPTY, EMPTY, RIGHT_TOP); 
          }
          break;
        case DOOR_DOWN:
          doori = loci - 1;
          doorj = locj;
          door = _maze[doori][doorj];
          if (posi == loci && posj < locj && (door & LEFT_BTM) == 0){
            maze = copyMaze();
            rotate(maze, doori, doorj, DOOR_LEFT, DOOR_RIGHT, EMPTY, EMPTY, LEFT_BTM); 
          } 
          else if (posi == loci && posj > locj && (door & RIGHT_BTM) == 0) {
            maze = copyMaze();
            rotate(maze, doori, doorj, DOOR_LEFT, DOOR_RIGHT, EMPTY, EMPTY, RIGHT_BTM); 
          } 
          break;
        case DOOR_LEFT:
          doori = loci;
          doorj = locj + 1;
          door = _maze[doori][doorj];
          if (posj == locj && posi < loci && (door & UP_LEFT) == 0) {
            maze = copyMaze();
            rotate(maze, doori, doorj, EMPTY, EMPTY, DOOR_UP, DOOR_DOWN, UP_LEFT); 
          }
          else if (posj == locj && posi > loci && (door & DOWN_LEFT) == 0) {
            maze = copyMaze();
            rotate(maze, doori, doorj, EMPTY, EMPTY, DOOR_UP, DOOR_DOWN, DOWN_LEFT); 
          }
          break;
        case DOOR_RIGHT:
          doori = loci;
          doorj = locj - 1;
          door = _maze[doori][doorj];
          if (posj == locj && posi < loci && (door & UP_RIGHT) == 0) {
            maze = copyMaze();
            rotate(maze, doori, doorj, EMPTY, EMPTY, DOOR_UP, DOOR_DOWN, UP_RIGHT); 
          }
          else if (posj == locj && posi > loci && (door & DOWN_RIGHT) == 0) {
            maze = copyMaze();
            rotate(maze, doori, doorj, EMPTY, EMPTY, DOOR_UP, DOOR_DOWN, DOWN_RIGHT); 
          }
          break;
      }

      return maze != null ? new Maze(maze, _level + 1, start, _end) : null;
    }

    public void rotate(int[][] maze, int i, int j, int left, int right, int up, int down, int flag) {
      maze[i][j] |= flag;
      maze[i][j+1] = right;
      maze[i][j-1] = left;
      maze[i-1][j] = up;
      maze[i+1][j] = down;
    }

    public int[][] copyMaze() {
      int rows = _maze.length;
      int cols = _maze[0].length;
      int[][] copy = new int[rows][cols];
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          copy[i][j] = _maze[i][j];
        }
      }
      return copy;
    }

    public String toString() {
      int rows = _maze.length;
      int cols = _maze[0].length;
      StringBuilder str = new StringBuilder();
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          str.append(_maze[i][j] > 0 ? 0 : _maze[i][j]);
        }
      }
      str.append(_start);
      return str.toString();
    }
  }
}
