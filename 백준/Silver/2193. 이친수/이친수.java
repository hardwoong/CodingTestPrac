import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    long[] dp = new long[N + 1];

    dp[1] = 1; // 길이 1인 이친수: 1
    if (N > 1) dp[2] = 1; // 길이 2인 이친수: 10

    for (int i = 3; i <= N; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    System.out.println(dp[N]);
  }
}
