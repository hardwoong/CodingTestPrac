import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inps[] = br.readLine().split(" ");

    if (inps[0].length() != inps[1].length()) {
      System.out.println(0);
      return;
    }

    int cnt = 0;
    for (int i = 0; i < inps[0].length(); i++) {
      if (inps[0].charAt(i) != inps[1].charAt(i)) break;
      if (inps[0].charAt(i) == '8') cnt++;
    }
    System.out.println(cnt);
  }
}