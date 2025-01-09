import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 첫 번째 줄 입력: N과 k
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    // 두 번째 줄 입력: N개의 숫자
    Vector<Integer> v = new Vector<>(N);
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      v.add(Integer.parseInt(st.nextToken()));
    }

    // 내림차순 정렬
    v.sort(Collections.reverseOrder());

    // k번째로 큰 수 출력
    System.out.println(v.get(k - 1));

    br.close();
  }
}
