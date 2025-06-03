import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
    long f = Long.parseLong(br.readLine());
    n = (n / 100) * 100; // 뒤 두 자리 00으로 만들기
    long answer = 0;
    for (long i = 0; i < 100; i++) {
      if ((n + i) % f == 0) {
        answer = i;
        break;
      }
    }
    System.out.printf("%02d\n", answer); // 두 자리로 출력
    br.close();
  }
}