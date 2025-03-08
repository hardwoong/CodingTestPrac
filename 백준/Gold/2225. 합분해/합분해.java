import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken()); // 만들 정수 N
    int K = Integer.parseInt(st.nextToken()); // 사용할 숫자 개수 K

    int[][] dp = new int[K + 1][N + 1];

    // 초기화: K가 1이면 N을 만들 수 있는 방법은 1개뿐
    for (int i = 0; i <= N; i++) {
      dp[1][i] = 1;
    }

    // DP 테이블 채우기
    for (int k = 2; k <= K; k++) { // 2개 이상의 숫자 사용
      for (int n = 0; n <= N; n++) {
        for (int x = 0; x <= n; x++) { // 숫자 x를 추가
          dp[k][n] += dp[k - 1][n - x];
          dp[k][n] %= 1_000_000_000; // 큰 수를 대비한 나머지 연산
        }
      }
    }

    System.out.println(dp[K][N]);
  }
}
