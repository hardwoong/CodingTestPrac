import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inps[] = br.readLine().split(" ");
    int N = Integer.parseInt(inps[0]);
    int K = Integer.parseInt(inps[1]);
    int coins[] = new int[N];

    for (int i = 0; i < N; i++) {
      coins[i] = Integer.parseInt(br.readLine());
    }

    int cnt = 0; 

    for (int i = N - 1; i >= 0; i--) {
      if (coins[i] <= K) {  
        cnt += K / coins[i];  
        K %= coins[i];        
      }
    }

    System.out.println(cnt); 
  }
}
