import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] numbers = new int[n];
    int maxNum = 0;
    for (int i = 0; i < n; i++) {
      numbers[i] = Integer.parseInt(st.nextToken());
      maxNum = Math.max(maxNum, numbers[i]);
    }

    boolean[] isPrime = new boolean[maxNum + 1];
    for (int i = 2; i <= maxNum; i++) {
      isPrime[i] = true;
    }
    for (int i = 2; i * i <= maxNum; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= maxNum; j += i) {
          isPrime[j] = false;
        }
      }
    }

    int cnt = 0;
    for (int num : numbers) {
      if (isPrime[num]) cnt++;
    }

    System.out.println(cnt);
  }
}
