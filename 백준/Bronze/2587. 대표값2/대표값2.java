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
    Vector<Integer> v = new Vector<>(5);
    int sum = 0;

    for (int i = 0; i < 5; i++) {
      int num = Integer.parseInt(br.readLine());
      v.add(num);
      sum += num;
    }

    Collections.sort(v);

    int mean = sum / 5;
    int median = v.get(2);

    bw.write(mean + "\n" + median + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
