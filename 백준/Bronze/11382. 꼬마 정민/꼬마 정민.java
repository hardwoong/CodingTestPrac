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
    String line = br.readLine();
    StringTokenizer st = new StringTokenizer(line);

    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());
    long c = Long.parseLong(st.nextToken());

    bw.write(String.valueOf(a + b + c));

    bw.flush();
    bw.close();
  }
}