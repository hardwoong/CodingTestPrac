import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");

    long R = Long.parseLong(input[0]); // 세로 크기
    long C = Long.parseLong(input[1]); // 가로 크기
    long N = Long.parseLong(input[2]); // CCTV 커버 크기

    // 세로와 가로 각각에 대해 필요한 CCTV 개수 계산
    long verticalCCTV = (R + N - 1) / N; // 올림 나눗셈
    long horizontalCCTV = (C + N - 1) / N; // 올림 나눗셈

    // 총 필요한 CCTV 개수
    System.out.println(verticalCCTV * horizontalCCTV);

    br.close();
  }
}