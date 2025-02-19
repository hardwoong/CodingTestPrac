import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
      (a[1] == b[1]) ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])
    );

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      pq.offer(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
    }

    int count = 0, lastEndTime = 0;
    while (!pq.isEmpty()) {
      int[] meeting = pq.poll();
      if (meeting[0] >= lastEndTime) {
        count++;
        lastEndTime = meeting[1];
      }
    }

    System.out.println(count);
  }
}
