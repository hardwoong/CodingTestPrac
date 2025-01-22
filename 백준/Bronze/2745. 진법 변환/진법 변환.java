import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inps[] = br.readLine().split(" ");
    String N = inps[0];
    int B = Integer.parseInt(inps[1]);
    System.out.println(Integer.parseInt(N, B));
  }
}
