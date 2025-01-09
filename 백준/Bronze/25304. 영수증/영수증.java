import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int X = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());

    int sum = 0;
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
    }
    if (sum == X) bw.write("Yes\n");
    else bw.write("No\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
