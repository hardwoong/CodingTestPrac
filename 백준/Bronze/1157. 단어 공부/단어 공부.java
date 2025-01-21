import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    int alpha[] = new int[26];
    int word = System.in.read();
    while (word > 64) {
      if (word < 91) {
        alpha[word - 65]++;
      } else {
        alpha[word - 97]++;
      }
      word = System.in.read();
    }
    int maxValue = 0;
    int res = 0;
    for (int i = 0; i < 26; i++) {
      if (alpha[i] > maxValue) {
        maxValue = alpha[i];
        res = i;
      } else if (alpha[i] == maxValue) {
        res = -2; // ?의 아스키코드는 63
      }
    }
    System.out.println((char) (res + 65));
  }
}