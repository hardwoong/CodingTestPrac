import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());
    boolean isPrime[] = new boolean[1000001];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;
    for (int i = 2; i * i <= 1000000; i++) {
      if (isPrime[i]) {
        for (int j = i*i; j <= 1000000; j += i) {
          isPrime[j] = false;
        }
      }
    }
    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      int cnt = 0;

      for (int p = 2; p <= n / 2; p++) {
        int q = n - p;
        if (isPrime[p] && isPrime[q]) {
          cnt++;
        }
      }
      sb.append(cnt).append("\n");
    }
    System.out.println(sb);
  }
}
