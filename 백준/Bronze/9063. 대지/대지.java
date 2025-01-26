import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int arr[][] = new int[2][n];
    
    int xMin = Integer.MAX_VALUE;
    int yMin = Integer.MAX_VALUE;
    int xMax = Integer.MIN_VALUE;
    int yMax = Integer.MIN_VALUE;
    
    for (int i = 0; i < n; i++) {
      String inps[] = br.readLine().split(" ");
      arr[0][i] = Integer.parseInt(inps[0]);
      arr[1][i] = Integer.parseInt(inps[1]);
      
      xMax = Math.max(xMax, arr[0][i]);
      yMax = Math.max(yMax, arr[1][i]);
      xMin = Math.min(xMin, arr[0][i]);
      yMin = Math.min(yMin, arr[1][i]);
    }
    System.out.println((xMax - xMin) * (yMax - yMin));
  }
}
