#include <iostream>

using namespace std;

int main()
{
    /* cout << "PENJUMLAHAN & PENGURANGAN 2 BILANGAN" << endl << endl
         << "1. Penjumlahan\n2. Pengurangan\n3. Exit Menu"
         << "Masukkan pilihan (1-3): ";
    int a, b, input;
    cin >> input;

    switch (input)
    {
    case 1:
        cout << "PENJUMLAHAN\n\n" << "Masukkan 2 bilangan: ";
        cin >> a >> b;
        cout << "Jumlah " << a << " + " << b << " = " << a + b;
        break;
    case 2:
        cout << "PENGURANGAN\n\n" << "Masukkan 2 bilangan: ";
        cin >> a >> b;
        cout << "Jumlah " << a << " - " << b << " = " << a - b;
        break;
    default:
        break;
    } */
    
    int input = 3;
    /*
    while (input != 3)
    {
        cout << "PENJUMLAHAN & PENGURANGAN 2 BILANGAN" << endl
             << endl
             << "1. Penjumlahan\n2. Pengurangan\n3. Exit Menu\n"
             << "Masukkan pilihan (1-3): ";
        int a, b;
        cin >> input;

        switch (input)
        {
        case 1:
            cout << "PENJUMLAHAN\n\n"
                 << "Masukkan 2 bilangan: ";
            cin >> a >> b;
            cout << "Jumlah " << a << " + " << b << " = " << a + b << endl << endl;
            break;
        case 2:
            cout << "PENGURANGAN\n\n"
                 << "Masukkan 2 bilangan: ";
            cin >> a >> b;
            cout << "Jumlah " << a << " - " << b << " = " << a - b << endl << endl;
            break;
        default:
            break;
        }
    } */

    /* while (kondisi) {
        codingan
    }

    do { 
        codingan 
    } while(kondisi); */
    
    do
    {
        cout << "PENJUMLAHAN & PENGURANGAN 2 BILANGAN" << endl
             << endl
             << "1. Penjumlahan\n2. Pengurangan\n3. Exit Menu\n"
             << "Masukkan pilihan (1-3): ";
        int a, b;
        cin >> input;

        switch (input)
        {
        case 1:
            cout << "PENJUMLAHAN\n\n"
                 << "Masukkan 2 bilangan: ";
            cin >> a >> b;
            cout << "Jumlah " << a << " + " << b << " = " << a + b << endl << endl;
            break;
        case 2:
            cout << "PENGURANGAN\n\n"
                 << "Masukkan 2 bilangan: ";
            cin >> a >> b;
            cout << "Jumlah " << a << " - " << b << " = " << a - b << endl << endl;
            break;
        default:
            break;
        }
    } while (input != 3);

    
    return 0;
}