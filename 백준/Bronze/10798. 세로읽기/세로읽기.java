import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    // 2차원 배열 초기화
    String[][] mat = new String[15][15];
    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 15; j++) {
        mat[i][j] = "@"; // 기본값 설정
      }
    }

    // 입력 받기
    for (int i = 0; i < 5; i++) {
      String line = br.readLine();
      if (line == null || line.isEmpty()) break; // 입력 종료 조건
      for (int j = 0; j < line.length(); j++) {
        mat[i][j] = String.valueOf(line.charAt(j));
      }
    }

    // 세로로 읽어서 출력
    for (int i = 0; i < 15; i++) { // 열
      for (int j = 0; j < 15; j++) { // 행
        if (!mat[j][i].equals("@")) { // 값이 기본값이 아닐 경우 출력
          bw.write(mat[j][i]);
        }
      }
    }
    // 출력 버퍼 플러시
    bw.flush();
    bw.close();
  }
}