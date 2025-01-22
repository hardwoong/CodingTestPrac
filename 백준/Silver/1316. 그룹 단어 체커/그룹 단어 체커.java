import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int cnt = 0;
    int alpha[] = new int[26]; // 알파벳 등장 여부 체크 배열

    for (int i = 0; i < n; i++) {
      Arrays.fill(alpha, 0); // 배열 초기화
      String word = br.readLine();
      boolean isGroupWord = true;

      for (int j = 0; j < word.length(); j++) {
        int index = word.charAt(j) - 'a';

        // 이미 등장했지만, 이전 문자와 다르면 그룹 단어가 아님
        if (alpha[index] != 0 && word.charAt(j) != word.charAt(j - 1)) {
          isGroupWord = false;
          break;
        }

        // 알파벳 등장 표시
        alpha[index]++;
      }

      if (isGroupWord) {
        cnt++;
      }
    }

    bw.write(String.valueOf(cnt) + "\n");
    bw.flush();
    bw.close();
  }
}
