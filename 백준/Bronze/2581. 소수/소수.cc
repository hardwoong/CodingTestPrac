#include <stdio.h>
#include <math.h>

int is_prime(int num) {
    if (num < 2) return 0;  // 2 미만의 수는 소수가 아님
    for (int i = 2; i <= sqrt(num); i++) {
        if (num % i == 0) return 0;  // 나누어떨어지면 소수가 아님
    }
    return 1;  // 소수임
}

int main() {
    int a, b;
    scanf("%d %d", &a, &b);
    
    int sum = 0;
    int min_prime = -1;

    for (int i = a; i <= b; i++) {  // i <= b 로 수정
        if (is_prime(i)) {
            sum += i;
            if (min_prime == -1) {
                min_prime = i;  // 첫 번째 소수를 최소값으로 저장
            }
        }
    }

    if (min_prime == -1) {
        printf("-1\n");  // 소수가 없으면 -1 출력
    } else {
        printf("%d\n%d\n", sum, min_prime);  // 합과 최소값 출력
    }

    return 0;
}
