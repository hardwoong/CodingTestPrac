import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int K = Integer.parseInt(br.readLine());
    
    int count = 0;
    
    for (int i = 1; i <= N; i++) {
      if (isKSejunNumber(i, K)) {
        count++;
      }
    }
    
    System.out.println(count);
  }
  
  // K-세준수인지 판별하는 함수
  public static boolean isKSejunNumber(int num, int K) {
    if (num == 1) return true; // 1은 모든 K에 대해 K-세준수
    
    // 소인수분해
    for (int i = 2; i <= num; i++) {
      if (num % i == 0) {
        // i가 소수인지 확인
        if (isPrime(i)) {
          // 소인수가 K보다 크면 false
          if (i > K) {
            return false;
          }
          // 소인수로 나누어 떨어지는 만큼 나누기
          while (num % i == 0) {
            num /= i;
          }
        }
      }
    }
    
    return true;
  }
  
  // 소수 판별 함수
  public static boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}