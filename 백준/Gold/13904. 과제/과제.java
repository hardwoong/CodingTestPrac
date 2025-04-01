import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][2];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int d = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());
      arr[i][0] = d;
      arr[i][1] = w;
    }
    Arrays.sort(arr, ((x, y) -> y[1] - x[1])); // 점수 위주 내림차순 정렬
    boolean[] homework = new boolean[1001];
    int point = 0;
    for (int i = 0; i < arr.length; i++) {
      int d = arr[i][0];
      int w = arr[i][1];
      for (int j = d; j > 0; j--) {
        if (!homework[j]) {
          point += w;
          homework[j] = true;
          break;
        }
      }
    }
    System.out.println(point);
  }
}
