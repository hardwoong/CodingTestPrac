import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    double sum = 0.0;
    double hak = 0.0;
    for (int i = 0; i < 20; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String sub = st.nextToken();
      double score = Double.parseDouble(st.nextToken());
      String grade = st.nextToken();
      if (grade.equals("P")) {
        continue;
      }
      
      hak += score;
      
      if (grade.equals("A+")) {
        sum += 4.5 * score;
      } else if (grade.equals("A0")) {
        sum += 4.0 * score;
      } else if (grade.equals("B+")) {
        sum += 3.5 * score;
      } else if (grade.equals("B0")) {
        sum += 3.0 * score;
      } else if (grade.equals("C+")) {
        sum += 2.5 * score;
      } else if (grade.equals("C0")) {
        sum += 2.0 * score;
      } else if (grade.equals("D+")) {
        sum += 1.5 * score;
      } else if (grade.equals("D0")) {
        sum += 1.0 * score;
      } else if (grade.equals("F")) {
        sum += 0.0 * score;
      }
    }
    bw.write(String.format("%.6f\n", sum / hak));
    bw.flush();
    bw.close();
  }
}