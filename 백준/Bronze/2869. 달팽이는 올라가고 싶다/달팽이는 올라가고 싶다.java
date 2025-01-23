import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inps[] = br.readLine().split(" ");
    int a = Integer.parseInt(inps[0]);
    int b = Integer.parseInt(inps[1]);
    int v = Integer.parseInt(inps[2]);

    System.out.println((v - b - 1) / (a - b) + 1);
  }
}
