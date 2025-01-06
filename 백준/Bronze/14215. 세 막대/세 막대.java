import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3);
        Scanner sc = new Scanner(System.in);
        
        // 세 변 입력받기
        for (int i = 0; i < 3; i++) {
            v.add(sc.nextInt());
        }
        sc.close();

        // 변을 정렬하여 가장 큰 변이 마지막에 위치하도록 설정
        Collections.sort(v);
        int a = v.get(0); // 가장 짧은 변
        int b = v.get(1); // 중간 길이 변
        int c = v.get(2); // 가장 긴 변

        // 삼각형 성립 여부에 따른 최대 둘레 계산
        if (a + b > c) { // 삼각형이 성립하면 세 변의 합이 최대 둘레
            System.out.println(a + b + c);
        } else { // 삼각형이 성립하지 않으면 가장 긴 변을 조정
            System.out.println((a + b) * 2 - 1);
        }
    }
}
