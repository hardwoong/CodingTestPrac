import java.io.*;

public class Main {
  static final int MOD = 1_000_000_000;
  static long[][] dp = new long[101][10];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    // 초기값 설정 (한 자리 숫자)
    for (int i = 1; i <= 9; i++) dp[1][i] = 1;

    // DP 테이블 채우기
    for (int i = 2; i <= N; i++) {
      dp[i][0] = dp[i - 1][1] % MOD;
      dp[i][9] = dp[i - 1][8] % MOD;
      for (int j = 1; j <= 8; j++) {
        dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
      }
    }

    // 정답 계산
    long result = 0;
    for (int i = 0; i <= 9; i++) {
      result = (result + dp[N][i]) % MOD;
    }

    System.out.println(result);
  }
}
