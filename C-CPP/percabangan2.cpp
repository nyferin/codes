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
        cout << "1. Segitiga Berundak\n";
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
            // segitiga berundak
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
                int tinggi, perulangan, cetak, berundak;

                // output & input program
                cout << "===================\n";
                cout << "-SEGITIGA BERUNDAK-\n";
                cout << "===================\n\n";

                cout << "Masukkan tinggi segitiga: ";
                cin >> tinggi;

                // segitiga berundak
                for (perulangan = 0; perulangan < tinggi; perulangan++)
                {
                    for (berundak = 0; berundak < tinggi; berundak++)
                    {
                        for (cetak = perulangan; cetak <= tinggi; cetak++)
                        {
                            cout << " ";
                        }
                        for (cetak = berundak; cetak <= perulangan; cetak++)
                        {
                            cout << "*";
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
        // tutup program
        case 'n':
// clear screen
#ifdef _WIN32
            system("cls");
#elif defined(__linux__)
            system("clear");
#endif

            // output program
            cout << "Program selesai!\nTerima kasih telah menggunakan program ini!!\n\n";
        case 'N':
// clear screen
#ifdef _WIN32
            system("cls");
#elif defined(__linux__)
            system("clear");
#endif

            // output program
            cout << "Program selesai!\nTerima kasih telah menggunakan program ini!!\n\n";
            break;
        // input salah
        default:
    // clear screen
    #ifdef _WIN32
                system("cls");
    #elif defined(__linux__)
                system("clear");
    #endif

            cout << "Pilihan anda salah/tidak tersedia!\nTekan Enter untuk melanjutkan...";
            cin.ignore();
            cin.ignore();
            break;
        }
    }
    return 0;
}
