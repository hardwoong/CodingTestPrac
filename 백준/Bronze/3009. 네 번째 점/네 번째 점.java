import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inps1[] = br.readLine().split(" ");
    int x1 = Integer.parseInt(inps1[0]);
    int y1 = Integer.parseInt(inps1[1]);
    String inps2[] = br.readLine().split(" ");
    int x2 = Integer.parseInt(inps2[0]);
    int y2 = Integer.parseInt(inps2[1]);
    String inps3[] = br.readLine().split(" ");
    int x3 = Integer.parseInt(inps3[0]);
    int y3 = Integer.parseInt(inps3[1]);
    int x[] = new int[1001];
    int y[] = new int[1001];
    x[x1]++; x[x2]++; x[x3]++;
    y[y1]++; y[y2]++; y[y3]++;
    for(int i = 0; i <= 1000; i++) {
      if(x[i] == 1) System.out.print(i + " ");
    }
    for (int i = 0; i <= 1000; i++) {
      if(y[i] == 1) System.out.println(i); 
    }
  }
}
