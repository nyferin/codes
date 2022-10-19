#include <stdio.h>

int main()
{
    int angka = 1;
    printf("Masukkan angka lebih dari 0: ");
    scanf("%d", &angka);

    for (int i = 1; i < angka * 2; i++)
    {
        for (int j = i; j <= angka * 2; j++)
        {
            printf("*");
        }
        for (int j = 0; j <= i - 1; j++)
        {
            printf("#");
        }
        for (int j = 0; j <= i - 2; j++)
        {
            printf("#");
        }
        for (int j = i; j <= angka * 2; j++)
        {
            printf("*");
        }
        printf("\n");
    }

    for (int i = 0; i < angka * 2; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            printf("*");
        }
        for (int j = i; j <= angka * 2 - 1; j++)
        {
            printf("#");
        }
        for (int j = i; j <= angka * 2 - 2; j++)
        {
            printf("#");
        }
        for (int j = 0; j <= i; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}