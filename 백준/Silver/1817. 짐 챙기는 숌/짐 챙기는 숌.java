import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    if (n == 0) {
      System.out.println(0);
      return;
    }

    st = new StringTokenizer(br.readLine());
    int boxCount = 1; // 첫 번째 박스 사용
    int currentWeight = 0;

    for (int i = 0; i < n; i++) {
      int bookWeight = Integer.parseInt(st.nextToken());

      if (currentWeight + bookWeight > m) {
        boxCount++;
        currentWeight = 0;
      }

      currentWeight += bookWeight;
    }

    System.out.println(boxCount);
  }
}
