import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      for (int j = N-1; j > i; j--) {
        bw.write(" ");
      }
      for (int k = 0; k <= i; k++) {
        bw.write("*");
      }
      bw.write("\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
