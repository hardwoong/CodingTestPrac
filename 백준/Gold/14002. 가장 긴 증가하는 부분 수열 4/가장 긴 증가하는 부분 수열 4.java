import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    int[] A = new int[N];
    int[] dp = new int[N];
    int[] trace = new int[N]; // 역추적 배열

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
      dp[i] = 1; // 최소 길이 1로 초기화
      trace[i] = -1; // 초기에는 이전 값 없음
    }

    int maxLIS = 1, lastIndex = 0;
    for (int i = 1; i < N; i++) {
      for (int j = 0; j < i; j++) {
        if (A[j] < A[i] && dp[i] < dp[j] + 1) {
          dp[i] = dp[j] + 1;
          trace[i] = j; // 이전 위치 저장
        }
      }
      if (maxLIS < dp[i]) {
        maxLIS = dp[i];
        lastIndex = i;
      }
    }

    System.out.println(maxLIS);

    // LIS 수열을 역추적하여 저장
    List<Integer> lis = new ArrayList<>();
    while (lastIndex != -1) {
      lis.add(A[lastIndex]);
      lastIndex = trace[lastIndex]; // 이전 원소 인덱스로 이동
    }
    Collections.reverse(lis);

    // 결과 출력
    for (int num : lis) {
      System.out.print(num + " ");
    }
  }
}
