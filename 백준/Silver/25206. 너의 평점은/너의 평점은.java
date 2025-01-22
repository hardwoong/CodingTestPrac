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
    double totalSum = 0.0;
    String grades[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
    double scores[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
    for (int i = 0; i < 20; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String sub = st.nextToken();
      double score = Double.parseDouble(st.nextToken());
      String grade = st.nextToken();
      for (int j = 0; j < grades.length; j++) {
        if (grade.equals(grades[j])) {
          sum += score;
          totalSum += scores[j] * score;
        }
      }
    }
    bw.write(String.format("%.6f\n", totalSum / sum));
    bw.flush();
    bw.close();
  }
}