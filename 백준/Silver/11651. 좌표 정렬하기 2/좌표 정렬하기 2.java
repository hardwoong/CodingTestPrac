import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] points = new int[N][2];

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      points[i][0] = Integer.parseInt(st.nextToken()); // x
      points[i][1] = Integer.parseInt(st.nextToken()); // y
    }

    Arrays.sort(points, (a, b) -> {
      if (a[1] != b[1]) return a[1] - b[1]; // y 오름차순
      else return a[0] - b[0]; // x 오름차순
    });

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for (int[] p : points) {
      bw.write(p[0] + " " + p[1] + "\n");
    }
    bw.flush();
    bw.close();
  }
}