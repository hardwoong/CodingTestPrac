#include <stdio.h>
int main() {
    int a;
    
    while(1) {
        scanf("%d", &a);
        if(a == -1) break;
    int arr[a];
    int idx = 0, sum = 0;
    for (int i = 1; i < a; i++)
    {
        if(a%i == 0) {
            arr[idx++] = i;
            sum+=i;
        }
    }

    if(sum == a) {
        printf("%d = %d ", a, arr[0]);
        for(int i =1; i<idx; i++) {
            printf("+ %d ", arr[i]);
        }
    }
    else {
        printf("%d is NOT perfect.\n", a);
    }
    }
    return 0;
}