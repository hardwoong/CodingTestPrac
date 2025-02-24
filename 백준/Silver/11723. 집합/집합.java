import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int m = Integer.parseInt(br.readLine());
    int bitmask = 0;  // 20개의 숫자를 표현하는 비트마스크

    for (int i = 0; i < m; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String command = st.nextToken();

      if (command.equals("add")) {
        int x = Integer.parseInt(st.nextToken());
        bitmask |= (1 << (x - 1));  // x번째 비트를 1로 설정
      } 
      else if (command.equals("remove")) {
        int x = Integer.parseInt(st.nextToken());
        bitmask &= ~(1 << (x - 1));  // x번째 비트를 0으로 설정
      } 
      else if (command.equals("check")) {
        int x = Integer.parseInt(st.nextToken());
        bw.write(((bitmask & (1 << (x - 1))) != 0 ? "1\n" : "0\n"));
      } 
      else if (command.equals("toggle")) {
        int x = Integer.parseInt(st.nextToken());
        bitmask ^= (1 << (x - 1));  // x번째 비트를 반전
      } 
      else if (command.equals("all")) {
        bitmask = (1 << 20) - 1;  // 20개의 모든 비트를 1로 설정 (1111...1111)
      } 
      else if (command.equals("empty")) {
        bitmask = 0;  // 모든 비트를 0으로 설정
      }
    }

    bw.flush();
  }
}
