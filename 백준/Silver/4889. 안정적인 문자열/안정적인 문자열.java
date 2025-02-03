import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  private static final char OPEN = '{';
  // private static final char CLOSE = '}';
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = 1;
    while(true){
      String command = br.readLine();
      if(command.charAt(0) == '-') break;
      int cnt = 0;
      int result = 0;
      for(int i = 0 ; i < command.length() ; i++) {
        char ch = command.charAt(i);
        if(ch == OPEN) cnt++;
        else cnt--;
        if(cnt < 0){
          result++;
          cnt += 2;
        }
      }
      if(cnt > 0) result += cnt / 2;
      bw.write(String.format("%d. %d\n", num, result));
      num++;
    }
    bw.flush();
  }
}
