import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int count = 0;

    // 연속된 자연수의 합으로 나타낼 수 있는 경우의 수를 구함
    for (int start = 1; start <= N; start++) {
      int sum = 0;
      for (int i = start; i <= N; i++) {
        sum += i;
        if (sum == N) {
          count++;
          break;
        } else if (sum > N) {
          break;
        }
      }
    }

    System.out.println(count);
  }
}