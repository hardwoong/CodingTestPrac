import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      String[] input = br.readLine().split(" ");
      int a = Integer.parseInt(input[0]);
      int b = Integer.parseInt(input[1]);

      int result = 1;
      for (int j = 0; j < b; j++) {
        result = (result * a) % 10;
      }
      if (result == 0)
        result = 10;
      System.out.println(result);
    }
    br.close();
  }
}