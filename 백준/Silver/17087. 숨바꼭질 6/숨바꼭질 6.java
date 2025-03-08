import java.io.*;
import java.util.StringTokenizer;

public class Main {
  // 유클리드 호제법을 이용한 최대공약수(GCD) 함수
  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = a % b;
      a = b;
      b = temp;
    }
    return a;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken()); // 동생의 수
    int S = Integer.parseInt(st.nextToken()); // 수빈이의 위치

    int[] dist = new int[N]; // 거리 차이를 저장할 배열

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      int X = Integer.parseInt(st.nextToken());
      dist[i] = Math.abs(X - S); // 거리의 절댓값 저장
    }

    // 배열의 모든 원소의 GCD 구하기
    int gcdValue = dist[0];
    for (int i = 1; i < N; i++) {
      gcdValue = gcd(gcdValue, dist[i]); // 누적 GCD 계산
    }

    System.out.println(gcdValue); // 결과 출력
  }
}
