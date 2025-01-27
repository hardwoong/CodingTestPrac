import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    ArrayList<Integer> A = new ArrayList<>();
    ArrayList<Integer> B = new ArrayList<>();

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      A.add(Integer.parseInt(st.nextToken()));
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      B.add(Integer.parseInt(st.nextToken()));
    }

    A.sort(Integer::compareTo);
    B.sort(Collections.reverseOrder());

    int result = 0;
    for (int i = 0; i < n; i++) {
      result += A.get(i) * B.get(i);
    }

    System.out.println(result);
  }
}
