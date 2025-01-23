import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int idx = 2;
    while (idx * idx <= n) {
      while (n % idx == 0) {
        sb.append(idx + "\n");
        n /= idx;
      }
      idx++;
    }
    if (n > 1) sb.append(n);

    System.out.println(sb.toString());
  }
}