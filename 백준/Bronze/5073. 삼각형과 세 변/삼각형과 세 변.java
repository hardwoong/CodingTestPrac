import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int nums[] = new int[3];
      nums[0] = Integer.parseInt(st.nextToken());
      nums[1] = Integer.parseInt(st.nextToken());
      nums[2] = Integer.parseInt(st.nextToken());
      Arrays.sort(nums);
      if (nums[2] == 0) break;
      else if (nums[0] == nums[1] && nums[1] == nums[2]) bw.write("Equilateral\n");
      else if (nums[0] == nums[1] && (nums[0] + nums[1]) > nums[2]) bw.write("Isosceles\n");
      else if (nums[1] == nums[2] && (nums[0] + nums[1]) > nums[2]) bw.write("Isosceles\n");
      else if ((nums[0] + nums[1]) > nums[2]) bw.write("Scalene\n");
      else bw.write("Invalid\n");
    }
    bw.flush();
  }
}
