import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Vector;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    while (true) {
      int n = Integer.parseInt(br.readLine());
      if (n == -1) break;
      int sum = 0;
      Vector<Integer> v = new Vector<>();
      for (int i = 1; i < n; i++) {
        if (n % i == 0) {
          v.add(i);
          sum += i;
        }
      }
      if (sum == n) {
        bw.write(String.format("%d = ", n));
        for (int i = 0; i < v.size(); i++) {
          bw.write(String.valueOf(v.get(i)));
          if (i != v.size() - 1) bw.write(" + ");
          else bw.write("\n");
        }
      } else {
        bw.write(String.format("%d is NOT perfect.\n", n));
      }
    }
    bw.flush();
  }
}
