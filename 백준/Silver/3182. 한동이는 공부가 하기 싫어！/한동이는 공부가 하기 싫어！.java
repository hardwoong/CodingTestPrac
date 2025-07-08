import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] next = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      next[i] = Integer.parseInt(br.readLine());
    }

    int maxCount = 0;
    int answer = 0;

    for (int i = 1; i <= N; i++) {
      boolean[] visited = new boolean[N + 1];
      int cnt = 0;
      int cur = i;
      while (!visited[cur]) {
        visited[cur] = true;
        cnt++;
        cur = next[cur];
      }
      if (cnt > maxCount) {
        maxCount = cnt;
        answer = i;
      }
    }
    System.out.println(answer);
  }
}