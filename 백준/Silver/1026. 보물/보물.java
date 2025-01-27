import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] A = new int[n];
    int[] B = new int[n];

    String[] inputA = br.readLine().split(" ");
    String[] inputB = br.readLine().split(" ");

    for (int i = 0; i < n; i++) {
      A[i] = Integer.parseInt(inputA[i]);
      B[i] = Integer.parseInt(inputB[i]);
    }

    // A를 오름차순 정렬
    Arrays.sort(A);

    // B를 내림차순 정렬
    Arrays.sort(B);
    for (int i = 0; i < n / 2; i++) {
      int temp = B[i];
      B[i] = B[n - 1 - i];
      B[n - 1 - i] = temp;
    }

    int result = 0;
    for (int i = 0; i < n; i++) {
      result += A[i] * B[i];
    }

    System.out.println(result);
  }
}
