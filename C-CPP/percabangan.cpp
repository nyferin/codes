#include <iostream>
using namespace std;

int main()
{

    // deklarasi variabel
    char pilihanUser;

    // program loop
    while (pilihanUser != 'n' && pilihanUser != 'N')
    {
// clear screen
#ifdef _WIN32
        system("cls");
#elif defined(__linux__)
        system("clear");
#endif

        // intro program
        cout << "============\n";
        cout << "-MENU UTAMA-\n";
        cout << "============\n\n";

        // output program
        cout << "1. Reverse\n";
        cout << "Exit (n)\n\n";
        cout << "Masukkan pilihan (1 atau n): ";

        // input program
        cin >> pilihanUser;

        // switch
        switch (pilihanUser)
        {
            // deklarasi variabel
            char pilihanUser2;

        // reverse
        case '1':
        {
            do
            {
// clear screen
#ifdef _WIN32
                system("cls");
#elif defined(__linux__)
                system("clear");
#endif

                // deklarasi variabel
                int panjang, lebar, lebar2, dimensi, perulangan, perulangan2, panah1, panah2;
                char karakter;

                // output & input program
                cout << "=========\n";
                cout << "-REVERSE-\n";
                cout << "=========\n\n";

                cout << "Masukkan panjang reverse: ";
                cin >> panjang;
                cout << "Masukkan karakter yang ingin dicetak: ";
                cin >> karakter;

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

                // inisialisasi variabel
                panah1 = 0;
                panah2 = 0;
                lebar2 = panjang - lebar;

                cout << endl
                     << endl;

                for (perulangan = 1; perulangan <= dimensi; perulangan++)
                {
                    for (perulangan2 = 1; perulangan2 <= dimensi; perulangan2++)
                    {
                        // panah 1
                        if (perulangan2 <= panjang + lebar - perulangan && panah1 == 1 && perulangan <= panjang)
                        {
                            if (perulangan2 <= lebar2 && (perulangan < 1 + (int)(lebar2 / 2) || perulangan > 1 + (int)(lebar2 / 2) + lebar2))
                            {
                                cout << " ";
                            }
                            else
                            {
                                cout << karakter;
                            }
                        }

                        if (perulangan2 <= lebar2 + perulangan && panah1 == 0)
                        {
                            if (perulangan2 <= lebar2 && (perulangan < 1 + (int)(lebar2 / 2) || perulangan > 1 + (int)(lebar2 / 2) + lebar2))
                            {
                                cout << " ";
                            }
                            else
                            {
                                cout << karakter;
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
                                cout << " ";
                            }

                            if (perulangan2 > 1 + dimensi - perulangan && panah2 == 0)
                            {
                                if (perulangan2 >= panjang + 2 && (perulangan <= (int)(lebar2 / 2) + dimensi - panjang || perulangan > (int)(lebar2 / 2) + panjang + 1))
                                {
                                    cout << " ";
                                }
                                else
                                {
                                    cout << karakter;
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
                                    cout << " ";
                                }
                                else
                                {
                                    cout << karakter;
                                }
                            }
                            else if (panah2 == 1)
                            {
                                cout << " ";
                            }
                        }
                    }
                    cout << endl;
                }

                // output & input program
                cout << "Ingin mencoba lagi? (y/n)";
                cin >> pilihanUser2;

                // pilihan salah
                if (pilihanUser2 != 'y' && pilihanUser2 != 'Y' && pilihanUser2 != 'n' && pilihanUser2 != 'N')
                {
                    cout << "\nPilihan salah!!\nKembali ke program tekan Enter...";
                    cin.ignore();
                    cin.ignore();
                }

            } while (pilihanUser2 != 'n' && pilihanUser2 != 'N');

            break;
            }
        }
    }
    return 0;
}
