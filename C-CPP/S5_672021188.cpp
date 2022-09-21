#include <iostream>
#include <string>

using namespace std;
//Urutan kombinasi 5 3 2
int main(){
    int input, a, b, c;
    string lima, tiga, dua;
    string satu, kedua, output;
    cout << "Program ini akan mengeluarkan kombinasi ";cin >> a >> b >> c; cin.ignore();
    cout <<"Masukkan Angka : ";cin >> input; cin.ignore();
    cout << endl;
    if (input == 0 || input == 1){
        cout << "0 0 0\n";
    }
        for (int j = 0; j <= input / 2; j++) {
            for (int i = 0; j >= i; i++) {
                for (int k = 0; k <= input / 3; ++k) {
                    if (i * a + k * b + j * c == input) {
                       lima = to_string(i); tiga = to_string(k); dua = to_string(j);
                       if (lima + " " + tiga + " " + dua + "\n" != satu){
                       kedua += lima + " " + tiga + " " + dua + "\n";
                       }
                    }
                }
            }
        }
        
        cout << output;
    return 0;
}
