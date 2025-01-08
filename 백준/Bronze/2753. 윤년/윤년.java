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

    if (a % 400 == 0) bw.write("1\n");
    else if ((a%4 ==0 ) && (a%100 != 0)) bw.write("1\n");
    else bw.write("0\n");
    bw.flush();
    bw.close();
  }
}
