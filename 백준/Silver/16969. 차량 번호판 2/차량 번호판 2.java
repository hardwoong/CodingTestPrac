import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inp = br.readLine();
    boolean isD = false;
    boolean isC = false;
    long res = 1;
    for (int i = 0; i < inp.length(); i++) {
      if (inp.charAt(i) == 'c') {
        if (isC) {
          res = (res * 25) % 1000000009;
          isD = false;
        } else {
          res = (res * 26) % 1000000009;
          isC = true;
          isD = false;
        }
      } else {
        if (isD) {
          res = (res * 9) % 1000000009;
          isC = false;
        } else {
          res = (res * 10) % 1000000009;
          isD = true;
          isC = false;
        }
      }
    }
    System.out.println(res);
  }
}