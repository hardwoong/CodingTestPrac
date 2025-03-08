import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    
    int[] dp = new int[11]; // 최대 10까지 DP 테이블 저장
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 4;

    for (int i = 4; i <= 10; i++) {
      dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      sb.append(dp[n]).append("\n");
    }

    System.out.println(sb);
  }
}
