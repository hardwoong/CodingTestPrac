import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int ans = 0;

    while (true) {
      boolean removedOne = false;
      String str = String.valueOf(n);

      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '1') {
          boolean flag = false;
          StringBuilder temp = new StringBuilder();

          for (int k = 0; k < str.length(); k++) {
            if (k == i) continue;

            if (str.charAt(k) != '0') {
              flag = true;
            }
            if (flag) {
              temp.append(str.charAt(k));
            }
          }

          str = temp.toString();
          removedOne = true;
          break;
        }
      }

      ans++;

      if (str.equals("")) break;

      n = Integer.parseInt(str);

      if (!removedOne) {
        n -= 1;
      }
    }

    System.out.println(ans);
  }
}