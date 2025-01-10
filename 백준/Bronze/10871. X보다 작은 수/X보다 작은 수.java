import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    br.close();
    Vector<Integer> v = new Vector<>();
    for (int i = 0; i < N; i++) { v.add(Integer.parseInt(st.nextToken())); }
    for (Integer integer : v) {
      if (integer < X) bw.write(String.valueOf(integer) + " ");
    }
    bw.flush();
    bw.close();
  }
}