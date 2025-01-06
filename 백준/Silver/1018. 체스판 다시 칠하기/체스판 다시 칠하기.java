import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static int minCost(int startRow, int startCol, String board[]) {
    String[] chess = { "WBWBWBWB", "BWBWBWBW" };
    int white = 0;
    for (int i = 0; i < 8; i++) {
      int row = i + startRow;
      for (int j = 0; j < 8; j++) {
        int col = j + startCol;
        if (board[row].charAt(col) != chess[i % 2].charAt(j)) white++;
      }
    }
    return Math.min(white, 64 - white);
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int row = Integer.parseInt(st.nextToken());
    int col = Integer.parseInt(st.nextToken());

    String board[] = new String[row];
    for (int i = 0; i < row; i++) {
      board[i] = br.readLine();
    }

    int cost = Integer.MAX_VALUE;
    for (int i = 0; i <= row - 8; i++) {
      for (int j = 0; j <= col - 8; j++) {
        int min = minCost(i, j, board);
        cost = Math.min(min, cost);
      }
    }
    bw.write(cost + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
}
