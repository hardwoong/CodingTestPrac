import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[10001];
    for (int i = 0; i < N; i++) {
      arr[Integer.parseInt(br.readLine())]++;
    }
    br.close();
    for (int i = 1; i < 10001; i++) {
      while (arr[i] > 0) {
        arr[i]--;
        sb.append(i).append("\n");
      }
    }
    System.out.println(sb);
  }
}