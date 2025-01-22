import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inps[] = br.readLine().split(" ");
    String N = inps[0];
    int B = Integer.parseInt(inps[1]);
    int tmp = 1;
    int sum = 0;

    for (int i = N.length() - 1; i >= 0; i--) {
      char C = N.charAt(i);
      if ('A' <= C && C <= 'Z') {
        sum += (C - 'A' + 10) * tmp;
      } else {
        sum += (C - '0') * tmp;
      }
      tmp *= B;
    }

    System.out.println(sum);
  }
}
