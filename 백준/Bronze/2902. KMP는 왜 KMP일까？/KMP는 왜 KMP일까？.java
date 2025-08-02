import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    StringBuilder result = new StringBuilder();

    // 첫 번째 문자는 항상 대문자이므로 추가
    result.append(input.charAt(0));

    // 하이픈 뒤의 대문자들을 찾아서 추가
    for (int i = 1; i < input.length(); i++) {
      if (input.charAt(i) == '-') {
        // 하이픈 뒤의 문자는 항상 대문자
        result.append(input.charAt(i + 1));
      }
    }

    System.out.println(result.toString());
  }
}