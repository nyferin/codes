#include <stdio.h>

void main()
{
    char string[30], temp = '0';
    int length = (int)sizeof(string) / sizeof(string[0]);

    // CARA 1
    for (int i = 0; i < length; i++)
    {
        string[i] = '\0';
    }

    printf("Masukkan string: ");
    scanf("%[^\n]%*c", string);

    for (int i = 0; i < length; i++)
    {
        for (int j = 0; j < length; j++)
        {
            if (string[i] != '\0' && string[i] < string[j])
            {
                temp = string[i];
                string[i] = string[j];
                string[j] = temp;
            }
        }
    }

    printf("%s", string);

    // CARA 2
    /* 
    printf("Masukkan string: ");
    scanf("%[^\n]%*c", string);

    for (int i = 0; i < length; i++)
    {
        for (int j = 0; j < length; j++)
        {
            if (string[i] < string[j])
            {
                temp = string[i];
                string[i] = string[j];
                string[j] = temp;
            }
        }
    }

    for (int i = 0; i < length; i++)
    {
        printf("%c", string[i]);
    }
     */
    
}