#include <stdio.h>

typedef struct Point {
    int x, y;
    int xcnt;
    int ycnt;
} point;

int main() {
    point p[3];
    
    // 입력 받기
    for (int i = 0; i < 3; i++) {
        scanf("%d %d", &p[i].x, &p[i].y);
        p[i].xcnt = 0;
        p[i].ycnt = 0;
    }
    
    // x 좌표 중복 체크
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (p[i].x == p[j].x) {
                p[i].xcnt++;
            }
            if (p[i].y == p[j].y) {
                p[i].ycnt++;
            }
        }
    }

    // 중복되지 않은 x, y 좌표 출력
    for (int i = 0; i < 3; i++) {
        if (p[i].xcnt == 1) {
            printf("%d ", p[i].x);
        }
    }
    for (int i = 0; i < 3; i++) {
        if (p[i].ycnt == 1) {
            printf("%d ", p[i].y);
        }
    }
    
    return 0;
}
