import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
    
    while ((line = br.readLine()) != null && !line.isEmpty()) {
      StringTokenizer st = new StringTokenizer(line);
      int age = Integer.parseInt(st.nextToken());
      
      if (age == 0) break;
      
      int leaves = 1; // 시작할 때 잎 1개
      
      for (int i = 0; i < age; i++) {
        int branchingFactor = Integer.parseInt(st.nextToken()); // 생장점에서 나오는 가지 수
        int pruningFactor = Integer.parseInt(st.nextToken());   // 가지치기로 제거되는 가지 수
        
        leaves = leaves * branchingFactor - pruningFactor;
      }
      
      System.out.println(leaves);
    }
  }
}