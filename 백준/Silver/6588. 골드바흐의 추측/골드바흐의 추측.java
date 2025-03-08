import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    // 1000000까지의 소수 구하기 (에라토스테네스의 체)
    boolean[] isPrime = new boolean[1000001];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;

    for (int i = 2; i * i <= 1000000; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= 1000000; j += i) {
          isPrime[j] = false;
        }
      }
    }

    // 입력 반복 처리
    while (true) {
      int n = Integer.parseInt(br.readLine());
      if (n == 0) break;

      boolean found = false;
      for (int i = n - 3; i >= 3; i -= 2) { // 큰 홀수부터 확인
        if (isPrime[i] && isPrime[n - i]) {
          sb.append(n).append(" = ").append(n - i).append(" + ").append(i).append("\n");
          found = true;
          break;
        }
      }

      if (!found) {
        sb.append("Goldbach's conjecture is wrong.\n");
      }
    }

    System.out.print(sb);
  }
}
