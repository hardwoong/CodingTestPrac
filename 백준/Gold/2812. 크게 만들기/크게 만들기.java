import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken()); 
    String nums = br.readLine();

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < n; i++) {
      char num = nums.charAt(i);

      while (!stack.isEmpty() && k > 0 && stack.peek() < num) {
        stack.pop();
        k--;
      }

      stack.push(num);
    }

    while (k > 0) {
      stack.pop();
      k--;
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }

    System.out.println(sb.reverse().toString());
  }
}
