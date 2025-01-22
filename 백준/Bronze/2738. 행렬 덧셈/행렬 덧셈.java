import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st1.nextToken());
    int m = Integer.parseInt(st1.nextToken());
    int mat[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
      StringTokenizer st2 = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        mat[i][j] += Integer.parseInt(st2.nextToken());
      }
    }
    for (int i = 0; i < n; i++) {
      StringTokenizer st2 = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        mat[i][j] += Integer.parseInt(st2.nextToken());
        bw.write(String.valueOf(mat[i][j] + " "));
      }
      bw.write("\n");
    }
    bw.flush();
    bw.close();
  }
}
