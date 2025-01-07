import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine()); // 입력값 N
    br.close();
    int count = 0; // 종말의 숫자 카운트
    int number = 666; // 첫 번째 숫자 시작

    while (true) {
      // 숫자에 "666"이 포함되어 있는지 확인
      if (String.valueOf(number).contains("666")) {
        count++; // 종말의 숫자 발견 시 카운트 증가
      }

      // N번째 숫자를 찾으면 출력 후 종료
      if (count == n) {
        bw.write(String.valueOf(number) + "\n");
        break;
      }

      number++; // 다음 숫자로 이동
    }
    bw.flush();
    bw.close();
  }
}
