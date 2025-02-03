import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = 1;

    while (true) {
      String line = br.readLine();
      if (line.contains("-")) break; 
      
      Stack<Character> s = new Stack<>();
      int count = 0;

      for (char ch : line.toCharArray()) {
        if (ch == '{') {
          s.push(ch); 
        } else {
          if (s.isEmpty()) { 
            count++; 
            s.push('{'); 
          } else {
            s.pop();
          }
        }
      }

      count += s.size() / 2;
      System.out.println(t + ". " + count);
      t++;
    }
  }
}
