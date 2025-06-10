import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());
    String s = br.readLine();
    int rows = s.length() / k;
    char[][] arr = new char[rows][k];

    int idx = 0;
    for (int i = 0; i < rows; i++) {
      if (i % 2 == 0) { // 왼→오
        for (int j = 0; j < k; j++) {
          arr[i][j] = s.charAt(idx++);
        }
      } else { // 오→왼
        for (int j = k - 1; j >= 0; j--) {
          arr[i][j] = s.charAt(idx++);
        }
      }
    }

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for (int j = 0; j < k; j++) {
      for (int i = 0; i < rows; i++) {
        bw.write(arr[i][j]);
      }
    }
    bw.flush();
    bw.close();
    br.close();
  }
}