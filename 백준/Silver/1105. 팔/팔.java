import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String L = st.nextToken();
    String R = st.nextToken();

    // 자릿수가 다르면 바로 0 출력
    if (L.length() != R.length()) {
      System.out.println(0);
      return;
    }

    int count = 0;

    // 가장 높은 자리부터 비교
    for (int i = 0; i < L.length(); i++) {
      if (L.charAt(i) != R.charAt(i)) break;  // 다른 자리 수 등장하면 종료
      if (L.charAt(i) == '8') count++;  // 같은 자리에서 8이면 카운트 증가
    }

    System.out.println(count);
  }
}
