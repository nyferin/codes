#include <stdio.h>

void main() {
    int a = 1, b = 1;
    for (int i = 0; i < 10; i++)
    {
        printf("%d ", a);
        printf("%d ", b);

        a += b;
        b += a;
    }
    
}