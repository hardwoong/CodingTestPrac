import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = a % b;
      a = b;
      b = temp;
    }
    return a;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

    StringBuilder sb = new StringBuilder();
    
    while (t-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(st.nextToken());
      }

      long sum = 0; // GCD 합을 저장할 변수

      // 모든 쌍의 GCD를 구해서 더하기
      for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
          sum += gcd(arr[i], arr[j]);
        }
      }

      sb.append(sum).append("\n");
    }
    
    System.out.print(sb); // 결과 한 번에 출력
  }
}
