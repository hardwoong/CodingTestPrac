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
    int a = Integer.parseInt(br.readLine());
    String b = br.readLine();

    bw.write(String.valueOf(a*(Integer.parseInt(String.valueOf(b.charAt(2)))))+"\n");
    bw.write(String.valueOf(a*(Integer.parseInt(String.valueOf(b.charAt(1)))))+"\n");
    bw.write(String.valueOf(a*(Integer.parseInt(String.valueOf(b.charAt(0)))))+"\n");

    bw.write(String.valueOf(a*Integer.parseInt(b)));

    bw.flush();
    bw.close();
  }
}