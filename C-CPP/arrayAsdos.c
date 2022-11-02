#include <stdio.h>

void main()
{

    /* printf("Hello World!\n");

    int jmlh;
    printf("Masukkan banyak angka: ");
    scanf("%d", &jmlh);

    int ar[jmlh];

    for(int i = 0; i < jmlh; i++) {
        printf("Input angka: ");
        scanf("%d", &ar[i]);
    }
    printf("\n");
    for(int i = 0; i < jmlh; i++) {
        printf("Angka %d: %d\n", i+1, ar[i]);
    }

    int tinggi[] = {1, 2, 3, 4, 5, 6}; */

    /*
    int jumlah;
    printf("Masukkan banyak angka: ");
    scanf("%d", &jumlah);

    int ar[jumlah][jumlah], count = 1;


    for(int i = 0; i < jumlah; i++) {
        for(int j = 0; j < jumlah; j++) {
            ar[i][j] = count;
            count++;
        }
    }
    */
    /* int ar[3][3], count = 1, pilihan;

    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            ar[i][j] = count;
            count++;
            printf("|\t%d\t", ar[i][j]);
        }
        printf("|\n\n");
    }
    while(pilihan != -1) {
    printf("Masukkan pilihan: ");
    scanf("%d", &pilihan);
    if(pilihan == 1) {
        ar[0][0] = 0;
    } else if(pilihan == 2) {
        ar[0][1] = 0;
    } else if(pilihan == 3) {
        ar[0][2] = 0;
    } else if(pilihan == 4) {
        ar[1][0] = 0;
    } else if(pilihan == 5) {
        ar[1][1] = 0;
    } else if(pilihan == 6) {
        ar[1][2] = 0;
    } else if(pilihan == 7) {
        ar[2][0] = 0;
    } else if(pilihan == 8) {
        ar[2][1] = 0;
    } else if(pilihan == 9) {
        ar[2][2] = 0;
    } else if(pilihan == -1) {
        break;
    }
    printf("\n");

    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            printf("|\t%d\t", ar[i][j]);
        }
        printf("|\n\n");
    }
    } */

    /* int ar[3][3], count = 1, pilihan;

    // printf("%d %d", sizeof(ar) / sizeof(ar[0]), sizeof(ar[0]) / sizeof(ar[0][0]));
    printf("|---------------|---------------|---------------|\n");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            ar[i][j] = count;
            count++;
            printf("|\t%d\t", ar[i][j]);
        }
        printf("|\n|---------------|---------------|---------------|\n");
    }
    while (pilihan != -1)
    {
        printf("Masukkan pilihan: ");
        scanf("%d", &pilihan);

        for (int i = 0; i < sizeof(ar) / sizeof(ar[0]); i++)
        {
            for (int j = 0; j < sizeof(ar[0]) / sizeof(ar[0][0]); j++)
            {
                if (ar[i][j] == pilihan)
                {
                    ar[i][j] = 0;
                }
            }
        }

        printf("\n");

        printf("|---------------|---------------|---------------|\n");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                printf("|\t%d\t", ar[i][j]);
            }
            printf("|\n|---------------|---------------|---------------|\n");
        }
        } */

    // no 1

    int a[3][3], pil;
    a[0][0] = 1, a[0][1] = 2, a[0][2] = 3, a[1][0] = 4, a[1][1] = 5, a[1][2] = 6, a[2][0] = 7, a[2][1] = 8, a[2][2] = 9;
    do
    {
        printf("\n");
        printf("|\t%d\t|\t%d\t|\t%d\t|\n|\t%d\t|\t%d\t|\t%d\t|\n|\t%d\t|\t%d\t|\t%d\t|", a[0][0], a[0][1], a[0][2], a[1][0], a[1][1], a[1][2], a[2][0], a[2][1], a[2][2]);

        printf("\n\nMasukkan pilihan :");
        scanf("%d", &pil);

        if (pil == 1)
        {
            a[0][0] = 0;
        }
        else if (pil == 2)
        {
            a[0][1] = 0;
        }
        else if (pil == 3)
        {
            a[0][2] = 0;
        }
        else if (pil == 4)
        {
            a[1][0] = 0;
        }
        else if (pil == 5)
        {
            a[1][1] = 0;
        }
        else if (pil == 6)
        {
            a[1][2] = 0;
        }
        else if (pil == 7)
        {
            a[2][0] = 0;
        }
        else if (pil == 8)
        {
            a[2][1] = 0;
        }
        else if (pil == 9)
        {
            a[2][2] = 0;
        }
        else if (pil == -1)
        {
        }
        else
        {
            printf("Pilihan salah");
        }

    } while (pil != -1);
}
