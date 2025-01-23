import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int X = Integer.parseInt(br.readLine()); 

    int line = 1; 
    int count = 1; 
    
    while (count < X) {
      line++; 
      count += line; 
    }

    int position = count - X; 
    int numerator, denominator; 

    if (line % 2 == 0) {
      numerator = line - position;
      denominator = position + 1;
    } else {
      numerator = position + 1;
      denominator = line - position;
    }

    System.out.println(numerator + "/" + denominator);
  }
}
