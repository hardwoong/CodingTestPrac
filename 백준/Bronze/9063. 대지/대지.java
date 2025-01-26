import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    int xMin = Integer.MAX_VALUE;
    int yMin = Integer.MAX_VALUE;
    int xMax = Integer.MIN_VALUE;
    int yMax = Integer.MIN_VALUE;

    while (n-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      
      xMin = Math.min(xMin, x);
      yMin = Math.min(yMin, y);
      xMax = Math.max(xMax, x);
      yMax = Math.max(yMax, y);
    }
    
    System.out.println((xMax - xMin) * (yMax - yMin));
  }
}
