import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int x1 = Integer.parseInt(st.nextToken());
    int y1 = Integer.parseInt(st.nextToken());
    int z1 = Integer.parseInt(st.nextToken());
    int x2 = Integer.parseInt(st.nextToken());
    int y2 = Integer.parseInt(st.nextToken());
    int z2 = Integer.parseInt(st.nextToken());

    int n = Integer.parseInt(br.readLine());
    int[] sticks = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < sticks.length; i++) {
      sticks[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(sticks);

    double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));

    int totalSum = Arrays.stream(sticks).sum();
    if (totalSum < dist) {
      System.out.println("NO");
      return;
    }

    int longest = sticks[n - 1];
    int remain = totalSum - longest;

    if (longest - remain <= dist) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}