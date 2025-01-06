#include <stdio.h>

void prime_factorization(int n) {
    int i = 2;

    
    while (n > 1) {
        if (n % i == 0) {
            printf("%d", i);
            n /= i;
            if (n > 1) {
                printf("\n");  // 아직 더 나눌 수 있으면 곱셈 기호 출력
            }
        } else {
            i++;  // 나누어떨어지지 않으면 다음 숫자로 이동
        }
    }
    printf("\n");
}

int main() {
    int num;

    scanf("%d", &num);

    prime_factorization(num);

    return 0;
}
