import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    String words[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String word = br.readLine();
    for (String w : words) {
      if (word.contains(w)) {
        word = word.replace(w, "*");
      }
    }
    bw.write(String.valueOf(word.length()));
    bw.flush();
    bw.close();
  }
}