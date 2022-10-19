#include <stdio.h>

void main() {
    int in = 0;
    char a = '*';
    scanf("Masukkan Tinggi dan Karakter: %d %c", &in, &a);

    for(int i = 1; i <= in + 1; i++) {

        for(int j = in + 1; j > i; j--) {
            printf("%c", a);
        }
        for(int j = 0; j < i; j++) {
            printf(" ");
        }
        for(int j = 1; j < i; j++) {
            printf(" ");
        }
        for(int j = in + 1; j > i; j--) {
            printf("%c", a);
        }
        printf("\n");
    }
    for(int i = 1; i <= in; i++) {

        for(int j = 0; j < i; j++) {
            printf("%c", a);
        }
        for(int j = in + 1; j > i; j--) {
            printf(" ");
        }
        for(int j = in; j > i; j--) {
            printf(" ");
        }
        for(int j = 0; j < i; j++) {
            printf("%c", a);
        }
        printf("\n");
    }

}
