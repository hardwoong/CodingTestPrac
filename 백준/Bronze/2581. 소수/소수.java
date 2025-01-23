import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int m = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());
    boolean isPrime[] = new boolean[n + 1];
    int sum = 0;
    int min = -1;
    
    for (int i = 2; i <= n; i++) isPrime[i] = true;
    for (int i = 2; i * i <= n; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= n; j += i) 
          isPrime[j] = false;
      }
    }
    for (int i = m; i <= n; i++) {
      if(isPrime[i]) {
        sum += i;
        if (min == -1) min = i;
      }
    }
    if (sum == 0) {
      System.out.println(-1);
    } else {
      System.out.println(sum);
      System.out.println(min);
    }
  }
}
