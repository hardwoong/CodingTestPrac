import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    ArrayList<Integer> times = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      times.add(Integer.parseInt(st.nextToken()));
    }

    times.sort(Integer::compareTo);

    int sum = 0; 
    int total = 0; 

    for (int time : times) {
      sum += time;  
      total += sum;
    }

    System.out.println(total);
  }
}
