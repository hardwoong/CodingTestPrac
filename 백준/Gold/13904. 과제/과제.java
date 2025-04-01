import java.io.*;
import java.util.*;

public class Main {
    static class Assignment implements Comparable<Assignment> {
        int deadline;
        int score;

        Assignment(int deadline, int score) {
            this.deadline = deadline;
            this.score = score;
        }

        @Override
        public int compareTo(Assignment o) {
            return o.score - this.score; // 점수 기준 내림차순 정렬
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Assignment> assignments = new ArrayList<>();
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            assignments.add(new Assignment(d, w));
            if (d > maxDeadline) {
                maxDeadline = d;
            }
        }

        // 마감일 기준 내림차순 정렬
        assignments.sort((a1, a2) -> a2.deadline - a1.deadline);

        PriorityQueue<Assignment> pq = new PriorityQueue<>();
        int totalScore = 0;
        int index = 0;

        // 가장 늦은 마감일부터 1일까지 역순으로 탐색
        for (int day = maxDeadline; day > 0; day--) {
            // 해당 날짜에 수행할 수 있는 과제들을 우선순위 큐에 추가
            while (index < n && assignments.get(index).deadline >= day) {
                pq.offer(assignments.get(index));
                index++;
            }
            // 우선순위 큐에서 가장 높은 점수의 과제를 선택하여 수행
            if (!pq.isEmpty()) {
                totalScore += pq.poll().score;
            }
        }

        System.out.println(totalScore);
    }
}