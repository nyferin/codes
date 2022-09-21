#include <iostream>
#include <string>

using namespace std;

int main()
{
    int N, F, B; //N-input, Fizz, Buzz
    string C; //input-C

    cin >> N;

    string Carr[N], FBarr[3] = {"Fizz", "Buzz", "FizzBuzz"}; //C-array [ ], FB-array [ ]
    int Farr[N], Barr[N], cF, cB, Fi[N], Bi[N], Fmod[N], Bmod[N]; // F-array [ ], B-array [ ], count-F, count-B, F-index [ ], B-index [ ], F-modulus [ ], B-modulus [ ]
    bool bF = false, bB = false; // bool-F, bool-B

    for (int h = 0; h < N; h++) //init array
    {
        Farr[h] = 0;
        Barr[h] = 0;
        Fi[h] = 0;
        Bi[h] = 0;
        Fmod[h] = 0;
        Bmod[h] = 0;
    }

    for (int i = 0; i < N; i++) //input(s)
    {
        cin >> C;
        cin.ignore();

        Carr[i] = C; //init array
    }

    cF = 0;
    cB = 0;

    for (int i = 0; i < N; i++) //check count of "Fizz" and "Buzz"
    {
        if (Carr[i] == FBarr[0]) //"Fizz"
        {
           Farr[i] = i + 1;
           Fi[cF] = i;
           cF++;
        } else if (Carr[i] == FBarr[1]) //"Buzz"
        {
            Barr[i] = i + 1;
            Bi[cB] = i;
            cB++;

        } else if (Carr[i] == FBarr[2]) //"FizzBuzz"
        {
            Farr[i] = i + 1;
            Barr[i] = i + 1;
            Fi[cF] = i;
            Bi[cB] = i;
            cF++;
            cB++;
        }
    }

    for (int i = 0; i < N; i++) //"FizzBuzz" pattern
    {
        if ((i + 1) % Farr[Fi[0]] == 0)
        {
            Fmod[i] = i + 1;
        }
        if ((i + 1) % Barr[Bi[0]] == 0)
        {
            Bmod[i] = i + 1;
        }
    }

    //check valid "FizzBuzz"
    if (cF == 0 && cB == 0) //no "Fizz & Buzz"
    {
        cout << endl << "[ERROR] Tidak terdeteksi Fizz dan Buzz!";
    } else
    {
        for (int i = 0; i < N; i++) //check "Fizz"
        {
            if (Fmod[i] == Farr[i])
            {
                bF = true;
            } else if (Fmod[i] != Farr[i])
            {
                bF = false;
                break;
            }
        }
        
        for (int i = 0; i < N; i++) //check "Buzz"
        {
            if (Bmod[i] == Barr[i])
            {
                bB = true;
            } else if (Bmod[i] != Barr[i])
            {
                bB = false;
                break;
            }
        }

        if (bF == false && bB == true)
        {
            B = Barr[Bi[0]];
            cout << "[ERROR] Fizz bukan kelipatan/tidak lengkap! " << B << endl;
        } else if (bF == true && bB == false)
        {
            F = Farr[Fi[0]];
            cout << F << " [ERROR] Buzz bukan kelipatan/tidak lengkap" << endl;
        } else if (bF == false && bB == false)
        {
            cout << "[ERROR] FizzBuzz bukan kelipatan/tidak lengkap" << endl;
        } else if (bF == true && bB == true)
        {
            F = Farr[Fi[0]];
            B = Barr[Bi[0]];
            cout << endl << F << " " << B << endl << endl;
        }
    }

/*  FOR DEBUGGING
    
    for (int i = 0; i < N; i++)
    {
        cout << endl << Farr[i] << " " << Fmod[i] << "\t" << Barr[i] << " " << Bmod[i] << endl;
    }
    cout << bF << " " << bB << endl;
*/
    return 0;
}