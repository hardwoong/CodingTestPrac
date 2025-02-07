import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int N = Integer.parseInt(st.nextToken()); // 숫자의 길이
    int K = Integer.parseInt(st.nextToken()); // 제거할 숫자의 개수
    String num = br.readLine(); // 입력 숫자

    Stack<Character> stack = new Stack<>();

    int removeCount = K; // 제거할 횟수

    // 숫자를 하나씩 확인
    for (int i = 0; i < N; i++) {
      char digit = num.charAt(i);

      // 스택이 비어있지 않고, K개의 숫자를 제거할 수 있으며,
      // 현재 숫자가 스택 top보다 크다면 pop 진행
      while (!stack.isEmpty() && removeCount > 0 && stack.peek() < digit) {
        stack.pop();
        removeCount--;
      }

      stack.push(digit);
    }

    // 남아있는 제거 횟수만큼 뒤에서 제거
    while (removeCount > 0) {
      stack.pop();
      removeCount--;
    }

    // 결과 출력
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }

    System.out.println(sb.reverse().toString()); // 스택이므로 뒤집어서 출력
  }
}
