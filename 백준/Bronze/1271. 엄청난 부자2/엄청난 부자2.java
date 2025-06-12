import java.io.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inps[] = br.readLine().split(" ");
    BigInteger a = new BigInteger(inps[0]);
    BigInteger b = new BigInteger(inps[1]);
    System.out.println(a.divide(b));
    System.out.println(a.remainder(b));
    br.close();
  }
}