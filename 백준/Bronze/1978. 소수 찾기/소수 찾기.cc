#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int is_prime(int num) {
    if (num < 2) return 0;  // 2 미만의 수는 소수가 아님
    for (int i = 2; i <= sqrt(num); i++) {
        if (num % i == 0) return 0;  // 나누어떨어지면 소수가 아님
    }
    return 1;  // 소수임
}

int sosu(int *arr, int size) {
    int res = 0;
    for (int i = 0; i < size; i++) {
        if (is_prime(arr[i])) res++;  // 소수이면 카운트 증가
    }
    return res;
}

int main() {
    int a;
    scanf("%d", &a);
    int *arr = (int *)malloc(sizeof(int) * a);
    for (int i = 0; i < a; i++) {
        scanf("%d", &arr[i]);
    }
    int cnt = sosu(arr, a);
    printf("%d\n", cnt);
    free(arr);
    return 0;
}
