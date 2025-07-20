import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int count = 0;
    for (int i = 1; i <= N; i++) {
      if (isHansu(i)) {
        count++;
      }
    }

    System.out.println(count);
  }

  public static boolean isHansu(int num) {
    if (num < 100) {
      return true; // 1자리수와 2자리수는 모두 한수
    }

    String str = String.valueOf(num);
    int diff = str.charAt(1) - str.charAt(0);

    for (int i = 2; i < str.length(); i++) {
      if (str.charAt(i) - str.charAt(i - 1) != diff) {
        return false;
      }
    }

    return true;
  }
}