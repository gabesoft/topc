package topc.bfs;

import java.util.*;

// SRM 223 Div 1 : 250
public class RevolvingDoors {
  static public final int EMPTY = -1;
  static public final int WALL = -2;
  static public final int START = -3;
  static public final int END = -10;
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
  static public final int[] ADJ = { -1, -1, -1, 0, -1, 1, 0, -1, 0, 1, 1, -1, 1, 0, 1, 1 };
  int rows = 0;
  int cols = 0;
  Queue<Maze> mazes;

  public int turns(String[] map) {
    mazes = new LinkedList<Maze>();
    rows = map.length;
    cols = map[0].length();

    int[][] maze = new int[rows][cols];
    int start = 0;
    for (int i = 0; i < rows; i++) {
      char[] row = map[i].toCharArray();
      for (int j = 0; j < cols; j++) {
        switch (row[j]) {
          case 'S': 
            maze[i][j] = START;
            start = encode(i, j);
            break;
          case 'E': maze[i][j] = END; break;
          case 'O': maze[i][j] = DOOR; break;
          case '-': maze[i][j] = DOOR_H; break;
          case '|': maze[i][j] = DOOR_V; break;
          case '#': maze[i][j] = WALL; break;
          default: maze[i][j] = EMPTY; break;
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

    mazes.add(new Maze(maze, 0, start));
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
    seen.add(maze.getStart());
    while (cont) {
      int size = seen.size();
      Object[] moves = seen.toArray();
      for (int i = 0; i < moves.length; i++) {
        if (advance((Integer)moves[i], maze, seen)) {
          return true;
        }
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
      switch (v) {
        case EMPTY: seen.add(cell); break;
        case END: found = true; break;
        case DOOR_UP: door = maze.getBelow(cell); break;
        case DOOR_DOWN: door = maze.getAbove(cell); break;
        case DOOR_LEFT: door = maze.getRight(cell); break;
        case DOOR_RIGHT: door = maze.getLeft(cell); break;
      }
      if (!found && maze.canPush(door, cell)) {
        mazes.add(maze.push(door, cell));
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

  class Maze {
    int[][] _maze;
    int _level;
    int _start;

    public Maze(int[][] maze, int level, int start) {
      _maze = maze;
      _level = level;
      _start = start;
    }
    public int getLevel() {
      return _level;
    }
    public int getStart() {
      return _start;
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
    public boolean canPush(int door, int cell) {
      int[] doorLoc = RevolvingDoors.decode(door);
      int[] cellLoc = RevolvingDoors.decode(cell);

      return false; //TODO: implement
    }
    public Maze push(int door, int cell) {
      int[] doorLoc = RevolvingDoors.decode(door);
      int[] cellLoc = RevolvingDoors.decode(cell);
      return null; //TODO: implement
    }
  }
}
