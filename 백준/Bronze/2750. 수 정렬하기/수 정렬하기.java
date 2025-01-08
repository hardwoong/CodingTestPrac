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
    int size = Integer.parseInt(br.readLine());
    Vector<Integer> v = new Vector<>(size);
    for (int i = 0; i < size; i++) {
      v.add(Integer.parseInt(br.readLine()));
    }
    br.close();
    Collections.sort(v);
    for (Integer integer : v) {
      bw.write(String.valueOf(integer)+"\n");
    }
    bw.flush();
    bw.close();
  }
}
