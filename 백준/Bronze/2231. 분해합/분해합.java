import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int smallestConstructor = 0;

        int digitCount = String.valueOf(N).length();

        for (int i = Math.max(1, N - 9 * digitCount); i < N; i++) {
            int sum = i; 
            int temp = i;

            while (temp > 0) {
                sum += temp % 10; 
                temp /= 10;
            }

            if (sum == N) {
                smallestConstructor = i;
                break;
            }
        }

        if (smallestConstructor > 0) {
            System.out.println(smallestConstructor);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
