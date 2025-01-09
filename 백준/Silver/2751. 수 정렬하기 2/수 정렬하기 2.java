import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Vector;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    // 입력 크기
    int size = Integer.parseInt(br.readLine());
    Vector<Integer> v = new Vector<>();

    // 입력된 정수 추가
    for (int i = 0; i < size; i++) {
      v.add(Integer.parseInt(br.readLine()));
    }
    br.close();

    // 오름차순 정렬
    Collections.sort(v);

    // 정렬된 데이터 StringBuilder에 추가
    for (int i = 0; i < size; i++) {
      sb.append(v.get(i)).append("\n");
    }

    // 결과 출력
    System.out.print(sb);
  }
}
