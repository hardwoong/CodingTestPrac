import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    // 각 숫자의 등장 횟수를 저장할 Map
    Map<Integer, Integer> countMap = new HashMap<>();

    // 입력받은 숫자들의 등장 횟수 계산
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());
      countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }

    // 가장 많이 등장한 횟수 찾기
    int maxCount = 0;
    for (int count : countMap.values()) {
      maxCount = Math.max(maxCount, count);
    }

    // 가장 많이 등장한 횟수와 같은 횟수로 등장하는 숫자들 중 가장 작은 숫자 찾기
    int result = Integer.MAX_VALUE;
    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
      if (entry.getValue() == maxCount) {
        result = Math.min(result, entry.getKey());
      }
    }

    System.out.println(result);
  }
}