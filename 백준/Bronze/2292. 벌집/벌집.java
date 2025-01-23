import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int level = 1;
    int range = 1;

    while (range < N) {
      range += 6 * level;
      level++;
    }

    System.out.println(level);
  }
}
