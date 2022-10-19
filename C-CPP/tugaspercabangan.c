#include <stdio.h>
#include <stdlib.h>

void main()
{
    char pilihanUser = '0';

    while (pilihanUser != 'n' && pilihanUser != 'N')
    {
        system("cls");
        printf("============\n");
        printf("-MENU UTAMA-\n");
        printf("============\n\n");
        printf("1. Reverse\n2. Segitiga Berundak\nExit (n)\nMasukkan pilihan (1/2/n): ");
        scanf("%c", &pilihanUser);
        getchar();

        switch (pilihanUser)
        {
        case '1':
        {
            system("cls");
            int panjang, lebar, lebar2, dimensi, perulangan, perulangan2, panah1, panah2;
            char karakter = '*', pilihanUser2 = 'y';

            do
            {
                printf("=========\n");
                printf("-REVERSE-\n");
                printf("=========\n\n");
                printf("Masukkan panjang reverse: ");
                scanf("%d", &panjang);
                getchar();
                printf("Masukkan karakter: ");
                scanf("%c", &karakter);
                getchar();

                if (panjang % 2 == 0)
                {
                    lebar = panjang / 2;
                    dimensi = (int)(panjang * 1.5);
                }
                else if (panjang % 2 == 1)
                {
                    lebar = 1 + (int)(panjang / 2);
                    dimensi = (int)(panjang * 1.5) + 1;
                }

                panah1 = 0;
                panah2 = 0;
                lebar2 = panjang - lebar;

                for (perulangan = 1; perulangan <= dimensi; perulangan++)
                {
                    for (perulangan2 = 1; perulangan2 <= dimensi; perulangan2++)
                    {
                        // panah 1
                        if (perulangan2 <= panjang + lebar - perulangan && panah1 == 1 && perulangan <= panjang)
                        {
                            if (perulangan2 <= lebar2 && (perulangan < 1 + (int)(lebar2 / 2) || perulangan > 1 + (int)(lebar2 / 2) + lebar2))
                            {
                                printf("");
                            }
                            else
                            {
                                printf("%c", karakter);
                            }
                        }

                        if (perulangan2 <= lebar2 + perulangan && panah1 == 0)
                        {
                            if (perulangan < (1 + (int)(lebar2 / 2)) || perulangan > (1 + (int)(lebar2 / 2) + lebar2))
                            {
                                printf(" ");
                            }
                            else
                            {
                                printf("%c", karakter);
                            }

                            if (perulangan2 == panjang)
                            {
                                panah1 = 1;
                            }
                        }

                        // panah 2
                        if (perulangan > dimensi - panjang)
                        {
                            if (perulangan2 == 1 + dimensi - perulangan && panah2 == 0)
                            {
                                printf(" ");
                            }

                            if (perulangan2 > 1 + dimensi - perulangan && panah2 == 0)
                            {
                                if (perulangan2 >= panjang + 2 && (perulangan <= (int)(lebar2 / 2) + dimensi - panjang || perulangan > (int)(lebar2 / 2) + panjang + 1))
                                {
                                    printf(" ");
                                }
                                else
                                {
                                    printf("%c", karakter);
                                }
                            }

                            if (perulangan == panjang + 1)
                            {
                                panah2 = 1;
                            }

                            if (perulangan2 > perulangan - lebar && panah2 == 1)
                            {
                                if (perulangan2 >= panjang + 2 && (perulangan <= (int)(lebar2 / 2) + dimensi - panjang || perulangan > (int)(lebar2 / 2) + panjang + 1))
                                {
                                    printf(" ");
                                }
                                else
                                {
                                    printf("%c", karakter);
                                }
                            }
                            else if (panah2 == 1)
                            {
                                printf(" ");
                            }
                        }
                    }
                    printf("\n");
                }

                printf("Ingin mengulang? (y/n)");
                scanf("%c", pilihanUser2);
            } while (pilihanUser2 != 'n' || pilihanUser2 != 'N');
        }
        break;
        case '2':
            /* code */
            break;
        case 'n' || 'N':
            /* code */
            break;
        default:
            system("cls");
            printf("Pilihan anda tidak tersedia!\nTekan ENTER untuk melanjutkan . . .");
            while (getchar() != '\n')
                ;
            break;
        }
    }
}