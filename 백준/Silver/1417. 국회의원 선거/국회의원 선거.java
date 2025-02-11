import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    int dasom = Integer.parseInt(br.readLine()); // 다솜이 표
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // 최대 힙

    for (int i = 1; i < n; i++) {
      pq.add(Integer.parseInt(br.readLine()));
    }

    int count = 0; // 매수 횟수
    while (!pq.isEmpty() && pq.peek() >= dasom) {
      int maxVotes = pq.poll(); // 가장 많은 표를 가진 후보
      maxVotes--; // 매수하여 표를 한 개 빼앗음
      dasom++; // 다솜이의 표 증가
      count++;

      pq.add(maxVotes); // 감소된 표 다시 삽입
    }

    System.out.println(count);
  }
}
