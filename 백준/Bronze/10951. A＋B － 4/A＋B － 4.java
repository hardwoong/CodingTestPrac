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
    String line;
    while ((line=br.readLine()) != null) {

      StringTokenizer st = new StringTokenizer(line);
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      bw.write(String.valueOf(A+B) + "\n");
    } 
    br.close();
    bw.flush();
    bw.close();
  }
}
