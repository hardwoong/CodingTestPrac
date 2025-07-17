import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    while (T-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
      int n = Integer.parseInt(br.readLine());
      int count = 0;
      for (int i = 0; i < n; i++) {
        st = new StringTokenizer(br.readLine());
        int cx = Integer.parseInt(st.nextToken());
        int cy = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        boolean in1 = isInside(x1, y1, cx, cy, r);
        boolean in2 = isInside(x2, y2, cx, cy, r);
        if (in1 ^ in2) count++; // 둘 중 하나만 내부에 있으면 카운트
      }
      System.out.println(count);
    }
  }

  static boolean isInside(int x, int y, int cx, int cy, int r) {
    int dx = x - cx;
    int dy = y - cy;
    return dx * dx + dy * dy < r * r;
  }
}