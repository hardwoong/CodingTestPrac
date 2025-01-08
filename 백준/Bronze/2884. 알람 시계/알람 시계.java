import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    br.close();
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    m -= 45;
    if (m < 0) {
      m += 60;
      h--;
    }
    if (h < 0) {
      h += 24;
    }
    bw.write(String.valueOf(h) + " " + String.valueOf(m) + "\n");
    bw.flush();
    bw.close();
  }
}
