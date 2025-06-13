import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[5];
    arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    for (int i = 0; i < 5; i++) {
      arr[i] = arr[i]*arr[i];
    }
    System.out.println(Arrays.stream(arr).sum()%10);
    br.close();
  }
}