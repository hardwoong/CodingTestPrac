import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[] dp = new int[N + 1];

    // 초기화: 최악의 경우 (1만으로 구성)
    for (int i = 1; i <= N; i++) {
      dp[i] = i;
    }

    // DP 진행 (제곱수들을 고려하여 최소 항 개수 계산)
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j * j <= i; j++) {  // j^2 ≤ i 인 j 찾기
        dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
      }
    }

    System.out.println(dp[N]);
  }
}
