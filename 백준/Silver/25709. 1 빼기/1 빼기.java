import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String start = sc.nextLine();
    Set<String> visited = new HashSet<>();
    Queue<String> queue = new LinkedList<>();
    queue.add(start);
    visited.add(start);

    int steps = 0;

    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        String cur = queue.poll();

        // 정수값이 0이면 종료
        if (Integer.parseInt(cur) == 0) {
          System.out.println(steps);
          return;
        }

        // 연산 1: 1 빼기
        int num = Integer.parseInt(cur);
        String minusOne = String.valueOf(num - 1);
        if (!visited.contains(minusOne)) {
          visited.add(minusOne);
          queue.add(minusOne);
        }

        // 연산 2: 문자열 내 '1' 제거
        for (int j = 0; j < cur.length(); j++) {
          if (cur.charAt(j) == '1') {
            String next = cur.substring(0, j) + cur.substring(j + 1);
            // 앞자리 0 제거
            next = next.replaceFirst("^0+", "");
            if (next.equals("")) next = "0";
            if (!visited.contains(next)) {
              visited.add(next);
              queue.add(next);
            }
          }
        }
      }

      steps++;
    }
  }
}