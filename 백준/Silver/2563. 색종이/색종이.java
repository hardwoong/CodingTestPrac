import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int xy[][] = new int[100][100];
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      String pos[] = br.readLine().split(" ");
      int x = Integer.parseInt(pos[0]);
      int y = Integer.parseInt(pos[1]);
      for (int j = x; j < x + 10; j++) {
        for (int k = y; k < y + 10; k++) {
          if (xy[j][k] == 0) {
            xy[j][k]++;
            cnt++;
          }
        }
      }
    }
    bw.write(String.valueOf(cnt));
    bw.flush();
    bw.close();
  }
}
