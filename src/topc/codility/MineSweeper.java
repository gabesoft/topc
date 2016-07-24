import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        String file  =  args[0];
        FileReader reader = new FileReader(file);


    }

    public static char[][] countSurrounding(char[][] input) {
        int N = input.length;
        int M = input[0].length;
        int[] dx = new int[] { 0, 0, 1, -1, 1, -1, 1, -1};
        int[] dy = new int[] { 1, -1, 0, 0, 1, -1, -1, 1};

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (input[i][j] == 'O') {
                    input[i][j] = '0';
                    for (int k = 0; k < dx.length; k++) {
                        if (input[i + dx[k]][j + dy[k]] == 'X') {
                            input[i][j]++;
                        }
                    }
                }
            }
        }

        return input;
    }
}
