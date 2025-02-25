
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
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) { arr[i] = Integer.parseInt(st.nextToken()); }
    ArrayList<Integer> al = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    for (int i = n - 1; i > -1; i--) {
      al.add(arr[i], i + 1);
    }
    for (int i : al) {
      sb.append(i + " ");
    }
    System.out.println(sb.toString());
  }
}