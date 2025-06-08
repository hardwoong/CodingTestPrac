import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inps = br.readLine().split(" ");
    long a = Long.parseLong(inps[0]);
    long b = Long.parseLong(inps[1]);
    if (a > b) {
      System.out.println(a-b);
    } else {
      System.out.println(b-a);
    }
    br.close();
  }
}