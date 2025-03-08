import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    int maxSum = A[0]; // 전체 최대값
    int currentSum = A[0]; // 현재 연속 합

    for (int i = 1; i < N; i++) {
      currentSum = Math.max(A[i], currentSum + A[i]); // 연속 합 갱신
      maxSum = Math.max(maxSum, currentSum); // 최댓값 갱신
    }

    System.out.println(maxSum);
  }
}
