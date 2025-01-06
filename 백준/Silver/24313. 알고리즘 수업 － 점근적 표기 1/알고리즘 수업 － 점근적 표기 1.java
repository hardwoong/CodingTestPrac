import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        if (a1 > c) {
            System.out.println(0);
        } else {
            for (int n = n0; n <= 1000000; n++) { // n의 충분히 큰 범위를 검증
                if ((a1 * n + a0) > (c * n)) {
                    System.out.println(0);
                    return;
                }
            }
            System.out.println(1);
        }
    }   
}
