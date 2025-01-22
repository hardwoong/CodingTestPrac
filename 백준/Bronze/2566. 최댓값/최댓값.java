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
    int max = Integer.MIN_VALUE;
    int row = 0;
    int col = 0;
    for (int i = 0; i < 9; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 9; j++) {
        int num = Integer.parseInt(st.nextToken());
        if (max < num) {
          max = num;
          row = i + 1;
          col = j + 1;
        }
        }
    }
    bw.write(max + "\n" + row + " " + col + "\n");
    bw.flush();
    bw.close();
  }
}
