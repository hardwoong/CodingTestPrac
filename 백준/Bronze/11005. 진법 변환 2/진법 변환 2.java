import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String inps[] = br.readLine().split(" ");
    int N = Integer.parseInt(inps[0]);
    int B = Integer.parseInt(inps[1]);

    StringBuilder sb = new StringBuilder();

    while (N > 0) {
      int remainder = N % B;
      if (remainder >= 10) {
        sb.append((char) ('A' + (remainder - 10))); 
      } else {
        sb.append(remainder); 
      }
      N /= B;
    }

    System.out.println(sb.reverse().toString());
  }
}
