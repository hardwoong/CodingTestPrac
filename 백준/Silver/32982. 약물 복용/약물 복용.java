import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력 받기
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // N일
    int K = Integer.parseInt(st.nextToken()); // 약효 지속 시간

    st = new StringTokenizer(br.readLine());
    int A_s = Integer.parseInt(st.nextToken());
    int A_e = Integer.parseInt(st.nextToken());
    int B_s = Integer.parseInt(st.nextToken());
    int B_e = Integer.parseInt(st.nextToken());
    int C_s = Integer.parseInt(st.nextToken());
    int C_e = Integer.parseInt(st.nextToken());

    // 첫 번째 약 복용 시간 (아침 식사 끝나는 시간)
    int currentTime = A_e;

    // N일 동안 반복
    for (int day = 1; day <= N; day++) {
      // 1) 아침 -> 점심
      if (currentTime + K < B_s) { // 약효가 점심 시작 전에 끊기면 NO
        System.out.println("NO");
        return;
      }
      currentTime = Math.min(B_e, currentTime + K); // 점심에서 최대한 늦게 먹기

      // 2) 점심 -> 저녁
      if (currentTime + K < C_s) { // 약효가 저녁 시작 전에 끊기면 NO
        System.out.println("NO");
        return;
      }
      currentTime = Math.min(C_e, currentTime + K); // 저녁에서 최대한 늦게 먹기

      // 3) 저녁 -> 다음날 아침 (마지막 날 제외)
      if (day < N) {
        if (currentTime + K < A_s + 1440) { // 약효가 다음날 아침 전에 끊기면 NO
          System.out.println("NO");
          return;
        }
        currentTime = Math.min(A_e + 1440, currentTime + K) - 1440; // 다음날 아침에서 최적 복용
      }
    }

    // 모든 검사 통과 시 YES
    System.out.println("YES");
  }
}
