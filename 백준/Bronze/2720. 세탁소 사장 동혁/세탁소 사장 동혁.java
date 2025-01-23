import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int T = Integer.parseInt(br.readLine()); 

    for (int i = 0; i < T; i++) {
      int C = Integer.parseInt(br.readLine()); 
      int q = C / 25; 
      C %= 25;
      int d = C / 10;
      C %= 10;        
      int n = C / 5;  
      C %= 5;         
      int p = C;      
      
      bw.write(String.format("%d %d %d %d\n", q, d, n, p));
    }
    bw.flush();
  }
}
