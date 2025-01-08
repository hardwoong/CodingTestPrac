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
    br.close();
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    if ((a==b) && (b==c)) bw.write(String.valueOf(10000+a*1000)+"\n");
    else if ((a==b)&&(b!=c)) bw.write(String.valueOf(1000+a*100)+"\n");
    else if ((a==c)&&(b!=c)) bw.write(String.valueOf(1000+a*100)+"\n");
    else if ((c==b)&&(a!=c)) bw.write(String.valueOf(1000+b*100)+"\n");
    else {
      int tmp = Math.max(a, b);
      int max = Math.max(tmp, c);
      bw.write(String.valueOf(max*100));
    }
    bw.flush();
    bw.close();
  }
}
