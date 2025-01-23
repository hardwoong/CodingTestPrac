import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int K = Integer.parseInt(input[1]);

    int count = 0; // 약수의 개수를 셈
    for (int i = 1; i <= N; i++) { // 1부터 N까지 반복
      if (N % i == 0) { // 약수인지 확인
        count++;
        if (count == K) { // K번째 약수를 찾았으면 출력 후 종료
          System.out.println(i);
          return;
        }
      }
    }

    // K번째 약수가 없는 경우
    System.out.println(0);
  }
}
