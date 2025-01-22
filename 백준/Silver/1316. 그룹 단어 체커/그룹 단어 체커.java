import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      int alpha[] = new int[26];
      String word = br.readLine();
      for (int j = 0; j < word.length(); j++) {
        if (word.length() == 1) {
          cnt++;
          break;
        }
        if (j == 0) {
          alpha[word.charAt(j) - 'a']++;
        } else if (alpha[word.charAt(j) - 'a'] != 0 && word.charAt(j) != word.charAt(j - 1)) {
          break;
        } else if (j == word.length() - 1) { 
          cnt++;
        } else {
          alpha[word.charAt(j) - 'a']++;
        }
      }
    }
    bw.write(String.valueOf(cnt) + "\n");
    bw.flush();
    bw.close();
  }
}