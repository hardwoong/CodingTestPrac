import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Vector;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    Vector<Integer> v = new Vector<>();

    for (int i = 0; i < line.length(); i++) {
      v.add(Character.getNumericValue(line.charAt(i)));
    }

    v.sort(Collections.reverseOrder());

    for (int num : v) {
      System.out.print(num);
    }
  }
}
