import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();
    br.close();
    word = word.toUpperCase();
    int alpha[] = new int[26];
    for (int i = 0; i < word.length(); i++) {
      alpha[word.charAt(i) - 'A']++;
    }

    int maxValue = 0;
    int maxIndex = 0;
    boolean isSame = false;

    for (int i = 0; i < alpha.length; i++) {
      if (maxValue < alpha[i]) {
        maxValue = alpha[i];
        maxIndex = i;
        isSame = false;
      } else if (maxValue == alpha[i]) {
        isSame = true;
      }
    }
    if (isSame) {
      bw.write("?\n");
    } else {
      bw.write(String.valueOf((char)(maxIndex + 'A')) + "\n");
    }
    bw.flush();
    bw.close();
  }
}