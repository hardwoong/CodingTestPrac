import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine();

    Queue<String> q = new LinkedList<>();
    Set<String> visited = new HashSet<>();

    q.offer(N);
    visited.add(N);

    int step = 0;

    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        String cur = q.poll();
        if (cur.equals("0")) {
          System.out.println(step);
          return;
        }

        // 1. 숫자에서 1을 뺀다
        long val = Long.parseLong(cur);
        if (val > 0) {
          String sub1 = String.valueOf(val - 1);
          if (!visited.contains(sub1)) {
            visited.add(sub1);
            q.offer(sub1);
          }
        }

        // 2. 문자열에서 '1'을 제거하는 모든 경우
        for (int j = 0; j < cur.length(); j++) {
          if (cur.charAt(j) == '1') {
            String removed = cur.substring(0, j) + cur.substring(j + 1);
            // 앞의 0 제거
            removed = removed.replaceFirst("^0+", "");
            if (removed.equals("")) removed = "0";
            if (!visited.contains(removed)) {
              visited.add(removed);
              q.offer(removed);
            }
          }
        }
      }
      step++;
    }
  }
}