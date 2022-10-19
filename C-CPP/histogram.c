#include <stdio.h>

void main() {
    int a[10], length = (int)sizeof(a)/sizeof(a[0]);

    for (int i = 0; i < length; i++)
    {
        printf("Input nilai %d: ", i+1);
        scanf("%d", &a[i]);
    }

    printf("INDEX\t|NILAI\t|HISTOGRAM\n");
    for (int i = 0; i < length; i++)
    {
        printf("%d\t|%d\t|", i, a[i]);

        for (int j = 0; j < a[i]; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}