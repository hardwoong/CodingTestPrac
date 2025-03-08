import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    int[] P = new int[N + 1]; // 카드팩 가격 저장
    int[] dp = new int[N + 1]; // dp[i]: i개를 구매할 때 최소 비용

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= N; i++) {
      P[i] = Integer.parseInt(st.nextToken());
      dp[i] = P[i]; // 기본적으로 i개 카드팩을 직접 사는 비용으로 초기화
    }

    // DP 계산
    for (int i = 1; i <= N; i++) {
      for (int k = 1; k <= i; k++) {
        dp[i] = Math.min(dp[i], dp[i - k] + P[k]);
      }
    }

    System.out.println(dp[N]);
  }
}
