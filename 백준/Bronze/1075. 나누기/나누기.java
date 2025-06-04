import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n_original = Long.parseLong(br.readLine());
    long f = Long.parseLong(br.readLine());

    long n_base = (n_original / 100) * 100; // N의 마지막 두 자리를 00으로 만듦

    long required_addition = (f - (n_base % f)) % f;

    System.out.printf("%02d\n", required_addition); // 두 자리로 출력 (예: 0, 5, 12 -> "00", "05", "12")
    br.close();
  }
}