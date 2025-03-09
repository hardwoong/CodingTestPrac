import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[][] cost = new int[N][3];
    int[][] dp = new int[N][3];

    // 입력 받기
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 3; j++) {
        cost[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 초기값 설정
    dp[0][0] = cost[0][0];
    dp[0][1] = cost[0][1];
    dp[0][2] = cost[0][2];

    // DP 점화식 적용
    for (int i = 1; i < N; i++) {
      dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0];
      dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1];
      dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2];
    }

    // 최솟값 출력
    int result = Math.min(dp[N - 1][0], Math.min(dp[N - 1][1], dp[N - 1][2]));
    System.out.println(result);
  }
}
