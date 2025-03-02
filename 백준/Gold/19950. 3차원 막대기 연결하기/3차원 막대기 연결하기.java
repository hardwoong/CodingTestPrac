import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    // 시작점과 끝점 입력
    int x1 = Integer.parseInt(st.nextToken());
    int y1 = Integer.parseInt(st.nextToken());
    int z1 = Integer.parseInt(st.nextToken());
    int x2 = Integer.parseInt(st.nextToken());
    int y2 = Integer.parseInt(st.nextToken());
    int z2 = Integer.parseInt(st.nextToken());

    // 막대 개수 입력
    int n = Integer.parseInt(br.readLine());
    int[] sticks = new int[n];

    // 막대 길이 입력
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      sticks[i] = Integer.parseInt(st.nextToken());
    }

    // 정렬 (오름차순)
    Arrays.sort(sticks);

    // 유클리드 거리 계산 (루트 연산)
    double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));

    // 모든 막대 합이 거리를 초과하지 않으면 NO
    int totalSum = Arrays.stream(sticks).sum();
    if (totalSum < dist) {
      System.out.println("NO");
      return;
    }

    // 가장 긴 막대를 제거 후 남은 막대기 합 계산
    int longestStick = sticks[n - 1];
    int remainingSum = totalSum - longestStick;

    // 길이가 목표 거리 이상이면 YES
    if (longestStick - remainingSum <= dist) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
