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
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    Vector<Integer> v = new Vector<>();
    for (int i = 0; i < N; i++) { v.add(Integer.parseInt(st.nextToken())); }
    int key = Integer.parseInt(br.readLine());
    int cnt = 0;
    for (Integer integer : v) {
      if (integer == key) cnt++;
    }
    System.out.println(cnt);
  }
}