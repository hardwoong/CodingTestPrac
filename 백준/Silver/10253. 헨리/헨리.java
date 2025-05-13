import java.util.*;

public class Main {
	public static int henry(int a, int b) {
		int n = b / a;
		if (n * a >= b) {
			return n;
		}
		return n + 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();

		for (int i = 0; i < testcase; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			while (true) {
				int x = henry(a, b);
				
				if (a * x == b) {
					System.out.println(x);
					break;
				}
				
				a = a * x - b;
				b = b * x;
			}
		}
	}
}