import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int M = Integer.parseInt(br.readLine());
    int bitSet = 0; // 비트마스크 초기화

    while (M-- > 0) {
      String[] input = br.readLine().split(" ");
      String cmd = input[0];
      int num = 0;
      if (!cmd.equals("all") && !cmd.equals("empty")) {
        num = Integer.parseInt(input[1]) - 1; // 0~19로 맞춤
      }

      switch (cmd) {
        case "add":
          bitSet |= (1 << num);
          break;
        case "remove":
          bitSet &= ~(1 << num);
          break;
        case "check":
          sb.append(((bitSet & (1 << num)) != 0) ? "1\n" : "0\n");
          break;
        case "toggle":
          bitSet ^= (1 << num);
          break;
        case "all":
          bitSet = (1 << 20) - 1; // 20개의 모든 비트를 1로 설정
          break;
        case "empty":
          bitSet = 0;
          break;
      }
    }
    System.out.print(sb);
  }
}
