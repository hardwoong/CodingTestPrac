import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Vector;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int size = Integer.parseInt(br.readLine());
    Vector<Integer> v = new Vector<>();
    for (int i = 0; i < size; i++) {
      v.add(Integer.parseInt(br.readLine()));
    }
    br.close();
    Collections.sort(v);
    for (int i = 0; i < size; i++) {
      bw.write(String.valueOf(v.get(i)) + "\n");
    }
    bw.flush();
    bw.close();
  }
}