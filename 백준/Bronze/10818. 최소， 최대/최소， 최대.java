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
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    br.close();
    Vector<Integer> v = new Vector<>();
    for (int i = 0; i < N; i++) { v.add(Integer.parseInt(st.nextToken())); }
    int max = Collections.max(v);
    int min = Collections.min(v);
    bw.write(String.valueOf(min) + " " + String.valueOf(max));
    bw.flush();
    bw.close();
  }
}