import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    String[] values = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    String color1 = br.readLine();
    String color2 = br.readLine();
    String color3 = br.readLine();

    String res1 = values[Arrays.asList(colors).indexOf(color1)] + values[Arrays.asList(colors).indexOf(color2)];
    long res2 = Long.parseLong(res1) * (long)Math.pow(10, Integer.parseInt(values[Arrays.asList(colors).indexOf(color3)]));
    System.out.println(res2);
    br.close();
  }
}