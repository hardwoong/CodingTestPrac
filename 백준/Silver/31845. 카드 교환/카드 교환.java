import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[] arr = new int[n];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    // 오름차순 정렬
    Arrays.sort(arr);

    int ans = 0;
    int banker = 0;

    for (int i = n - 1; i >= banker; i--) {
      if (arr[i] > 0) {
        ans += arr[i];
        banker += 1;
      }
      if (i == n - m) break;
    }

    System.out.println(ans);
  }
}
