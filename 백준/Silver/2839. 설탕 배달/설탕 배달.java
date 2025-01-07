import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int result = -1; // 결과 초기화

    for (int i = N / 5; i >= 0; i--) { // 5kg 봉지 최대 개수부터 줄여가며 확인
      int remainder = N - (i * 5); // 5kg 사용 후 남은 무게
      if (remainder % 3 == 0) { // 나머지가 3kg으로 나누어떨어지면
        result = i + (remainder / 3); // 5kg 봉지 + 3kg 봉지 개수
        break; // 가장 적은 봉지로 구성된 경우 찾았으므로 종료
      }
    }

    System.out.println(result);
  }
}
