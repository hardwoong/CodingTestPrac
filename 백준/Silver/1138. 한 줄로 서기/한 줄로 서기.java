import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    LinkedList<Integer> list = new LinkedList<>();
    for (int i = n - 1; i >= 0; i--) {
      list.add(arr[i], i + 1); 
    }

    StringBuilder sb = new StringBuilder();
    for (int num : list) {
      sb.append(num).append(" ");
    }
    System.out.println(sb.toString());
  }
}
