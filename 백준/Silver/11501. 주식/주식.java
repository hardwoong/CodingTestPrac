import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      String inps[] = br.readLine().split(" ");
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(inps[i]);
      }
      long profit = 0;
      int max = 0;

      for (int i = n - 1; i >= 0; i--) {
        if (arr[i] > max) {
          max = arr[i];
        } else {
          profit += (max - arr[i]);
        }
      }

      System.out.println(profit);
    }
  }
}