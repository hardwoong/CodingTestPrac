import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    if (N == 0) {
      System.out.println(0);
      return;
    }

    StringBuilder sb = new StringBuilder();
    while (N != 0) {
      int remainder = N % -2;
      N /= -2;

      // 나머지가 음수일 경우 보정
      if (remainder < 0) {
        remainder += 2;
        N += 1;
      }

      sb.append(remainder);
    }

    System.out.println(sb.reverse().toString());  // 결과를 뒤집어 출력
  }
}
