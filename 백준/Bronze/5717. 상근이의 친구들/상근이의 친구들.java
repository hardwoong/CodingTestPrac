import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String[] inps = br.readLine().split(" ");
      if (inps[0].equals("0") && inps[1].equals("0")) {
        break;
      }
      int a = Integer.parseInt(inps[0]);
      int b = Integer.parseInt(inps[1]);
      System.out.println(a + b);
    }
    br.close();
  }
}