#include <stdio.h>
int main() {
    int x1, x2, y1, y2;
    scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
    int xdiff = x2 - x1;
    int ydiff = y2 - y1;
    if(xdiff > x1) xdiff = x1;
    if(ydiff > y1) ydiff = y1;
    if(xdiff<0) xdiff=-xdiff;
    if(ydiff<0) ydiff=-ydiff;
    int diff=0;
    if(xdiff < ydiff) diff = xdiff;
    else diff = ydiff;
    printf("%d\n", diff);
}