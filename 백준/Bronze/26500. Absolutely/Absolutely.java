import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine()); // 데이터 세트 개수
    
    for (int i = 0; i < n; i++) {
      String[] input = br.readLine().split(" ");
      double a = Double.parseDouble(input[0]);
      double b = Double.parseDouble(input[1]);
      
      // 절댓값 거리 계산
      double distance = Math.abs(a - b);
      
      // 소수점 첫째 자리까지 반올림하여 출력
      System.out.printf("%.1f%n", distance);
    }
    
    br.close();
  }
}