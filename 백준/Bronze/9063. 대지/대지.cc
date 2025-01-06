#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int x;
    int y;
} Point;

int main() {
    int size = 0;
    scanf("%d", &size);
    Point *pArr = (Point *)malloc(sizeof(Point)*size);
    for (int i = 0; i < size; i++)
    {
        scanf("%d %d", &pArr[i].x, &pArr[i].y);
    }
    int xmin = pArr[0].x;
    int xmax = pArr[0].x;
    int ymin = pArr[0].y;
    int ymax = pArr[0].y;

    for (int i = 0; i < size; i++)
    {
        if(xmin > pArr[i].x) xmin = pArr[i].x;
        if(xmax < pArr[i].x) xmax = pArr[i].x;
        if(ymin > pArr[i].y) ymin = pArr[i].y;
        if(ymax < pArr[i].y) ymax = pArr[i].y;
    }
    int xdiff = xmax - xmin;
    int ydiff = ymax - ymin;
    printf("%d\n", xdiff*ydiff);
    
    free(pArr);
    return 0;
}