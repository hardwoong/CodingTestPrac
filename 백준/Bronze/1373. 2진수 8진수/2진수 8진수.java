import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String binary = br.readLine().trim();  // 입력값을 문자열로 받기

    // BigInteger를 이용하여 2진수를 8진수로 변환
    BigInteger bigInt = new BigInteger(binary, 2);
    System.out.println(bigInt.toString(8));  // 8진수로 변환 후 출력
  }
}
