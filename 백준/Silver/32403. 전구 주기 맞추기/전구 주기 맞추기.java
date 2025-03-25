import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    List<Integer> divisors = new ArrayList<>();
    for (int i = 1; i <= t; i++) {
      if (t % i == 0) {
        divisors.add(i);
      }
    }

    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (t % arr[i] == 0) {
        continue;
      } else {
        int minDiff = Integer.MAX_VALUE;
        int target = arr[i];
        for (int div : divisors) {
          if (div < 1)
            continue; 
          int diff = Math.abs(arr[i] - div);
          if (diff < minDiff) {
            minDiff = diff;
            target = div;
          } else if (diff == minDiff && div > target) {
            target = div;
          }
        }
        // cnt += Math.abs(arr[i] - target);
        cnt += minDiff;
      }
    }
    System.out.println(cnt);
  }
}