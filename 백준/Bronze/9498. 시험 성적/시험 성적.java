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
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    br.close();

    if (a >= 90) bw.write("A\n");
    else if (a >= 80) bw.write("B\n");
    else if (a >= 70) bw.write("C\n");
    else if (a >= 60) bw.write("D\n");
    else bw.write("F\n");
    bw.flush();
    bw.close();
  }
}
