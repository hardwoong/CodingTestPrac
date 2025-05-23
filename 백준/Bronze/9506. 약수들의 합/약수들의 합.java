import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    while (true) {
      int n = Integer.parseInt(br.readLine());
      if (n == -1) break;

      ArrayList<Integer> divisors = new ArrayList<>();
      int sum = 0;

      for (int i = 1; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          sum += i;
          divisors.add(i);

          if (i != 1 && i != n / i) {
            sum += n / i;
            divisors.add(n / i);
          }
        }
      }

      if (sum == n) {
        sb.append(n).append(" = ");
        divisors.sort(Integer::compareTo); 
        for (int i = 0; i < divisors.size(); i++) {
          sb.append(divisors.get(i));
          if (i < divisors.size() - 1) sb.append(" + ");
        }
        sb.append("\n");
      } else {
        sb.append(n).append(" is NOT perfect.\n");
      }
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
