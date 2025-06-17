import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int caseNum = Integer.parseInt(br.readLine());
    String[] inp = br.readLine().split(" ");
    int arr[] = new int[caseNum];
    for (int i = 0; i < caseNum; i++) {
      arr[i] = Integer.parseInt(inp[i]);
    }
    int y = 0;
    int m = 0;
    for (int i = 0; i < caseNum; i++) {
      y += arr[i] / 30 * 10 + 10;
      m += arr[i] / 60 * 15 + 15;
    }
    if (y < m) {
      System.out.println("Y " + y);
    } else if (y > m) {
      System.out.println("M " + m);
    } else {
      System.out.println("Y M " + y);
    }
    br.close();
  }
}