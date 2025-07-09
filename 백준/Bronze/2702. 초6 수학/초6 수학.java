import java.io.*;
import java.util.StringTokenizer;

public class Main {
  // 최대공약수(GCD) 구하는 함수
  public static int gcd(int a, int b) {
    while (b != 0) {
      int tmp = a % b;
      a = b;
      b = tmp;
    }
    return a;
  }

  // 최소공배수(LCM) 구하는 함수
  public static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      System.out.println(lcm(a, b) + " " + gcd(a, b));
    }
  }
}