import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int p = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int items[] = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      items[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(items);
    int idx = 0;
    while (p < 200) {
      if (idx >= n) break;
      p += items[idx++];
    }
    System.out.println(idx);
  }
}
