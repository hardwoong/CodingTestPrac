import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String inp = br.readLine();
      if (inp.equals("#")) break;
      inp = inp.toLowerCase();
      int cnt = 0;
      for (int i = 0; i < inp.length(); i++) {
        if (inp.charAt(i) == 'a' || inp.charAt(i) == 'e' || inp.charAt(i) == 'i' || inp.charAt(i) == 'o' || inp.charAt(i) == 'u') {
          cnt++;
        }
      }
      System.out.println(cnt);
    }
    br.close();
  }
}