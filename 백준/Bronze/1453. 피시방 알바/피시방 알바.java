import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[] arr = new boolean[101]; // 1~100번 자리
    int num = Integer.parseInt(br.readLine());
    String[] inp = br.readLine().split(" ");
    int count = 0;
    for (int i = 0; i < num; i++) {
      int seat = Integer.parseInt(inp[i]);
      if (arr[seat]) { // 이미 앉아있으면
        count++;
      } else {
        arr[seat] = true; // 앉힘
      }
    }
    System.out.println(count); // 거절당한 손님 수
    br.close();
  }
}