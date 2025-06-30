import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      String inp1 = br.readLine();
      String inp2 = br.readLine();
      for (int j = 0; j < inp1.length(); j++) {
        if (inp1.charAt(j) != inp2.charAt(j)) {
          cnt++;
        }
      }
      System.out.println("Hamming distance is " + cnt + ".");
      cnt = 0;
    }
    
    br.close();
  }
}