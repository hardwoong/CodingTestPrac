import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int caseNum = Integer.parseInt(br.readLine());
    int arr[][] = new int[caseNum][2];
    for (int i = 0; i < caseNum; i++) {
      String[] inp = br.readLine().split(" ");
      arr[i][0] = Integer.parseInt(inp[0]);
      arr[i][1] = Integer.parseInt(inp[1]);
    }
    int rate[] = new int[caseNum];
    Arrays.fill(rate, 1);
    for (int i = 0; i < caseNum; i++) {
      for (int j = 0; j < caseNum; j++) {
        if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
          rate[i]++;
        }
      }
    }
    for (int i = 0; i < caseNum; i++) {
      System.out.print(rate[i] + " ");
    }
    br.close();
  }
}