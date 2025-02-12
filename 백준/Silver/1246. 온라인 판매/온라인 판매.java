import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inps[] = br.readLine().split(" ");
    int n = Integer.parseInt(inps[0]);
    int m = Integer.parseInt(inps[1]);
    int arr[] = new int[m];
    for (int i = 0; i < m; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(arr);
    int idx = -1;
    int max = 0;
    for (int i = 0; i < m; i++) {
      if (max < arr[i] * Math.min(n, (m - i))) {
        max = arr[i] * Math.min(n, (m - i));
        idx = arr[i];
      }
    }
    System.out.println(idx + " " + max);
  }
}
