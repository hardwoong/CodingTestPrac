import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());

    int MAX = 1_000_000;
    int MOD = 1_000_000_009;
    long[] dp = new long[MAX + 1];

    // 초기값 설정
    dp[1] = 1; // 1을 만드는 방법: (1)
    dp[2] = 2; // 2를 만드는 방법: (1+1), (2)
    dp[3] = 4; // 3을 만드는 방법: (1+1+1), (1+2), (2+1), (3)

    // DP 배열 채우기
    for (int i = 4; i <= MAX; i++) {
      dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % MOD;
    }

    // 테스트 케이스 입력 및 정답 출력
    for (int t = 0; t < T; t++) {
      int n = Integer.parseInt(br.readLine());
      sb.append(dp[n]).append("\n");
    }

    System.out.print(sb);
  }
}
