#include <iostream>
#include <string>
#include <algorithm> //sort

using namespace std;

int main()
{
    cout << "[DISCLAIMER]\nPROGRAM INI DIBUAT SESUAI DENGAN SOAL YANG TERTULIS\nDENGAN URUTAN SKOR 5-3-2" << endl;
    int Total; //Total

    cin >> Total;

    int Fivarr[Total], Threarr[Total], Twoarr[Total]; //Five-array [ ], Three-array [ ], Two-array [ ]
    string Score[Total], Five, Three, Two;
    
    for (int i = 0; i < Total; i++) //init array
    {
        Fivarr[i] = 0;
        Threarr[i] = 0;
        Twoarr[i] = 0;
    }

    for (int i = 0; i < Total; i++)
    {
        if (i * 5 <= Total)
        {
            Fivarr[i] = i;
        }
    }

    for (int i = 0; i < Total; i++)
    {
        if (i * 3 <= Total)
        {
            Threarr[i] = i;
        }
    }

    for (int i = 0; i < Total; i++)
    {
        if (i * 2 <= Total)
        {
            Twoarr[i] = i;
        }
    }

    for (int  i = 0; i < Total; i++)
    {
        for (int j = 0; j < Total; j++)
        {
            for (int k = 0; k < Total; k++)
            {
                if (Twoarr[i] * 2 + Threarr[j] * 3 + Fivarr[k] * 5 == Total)
                {
                    Five = to_string(Fivarr[k]);
                    Three = to_string(Threarr[j]);
                    Two = to_string(Twoarr[i]);
                    Score[i] = Five + " " + Three  + " " + Two;
                }
            }
        }
    }

    int Ssize = sizeof(Score)/sizeof(Score[0]);

    sort(Score, Score+Ssize);

    for (int i = 0; i < Total; i++)
    {
        if (Score[i] != "" && Score[i] != Score[i + 1])
        {
            cout << Score[i] << endl;
        }
        
    }
    

/*  FOR DEBUGGING
cout << endl;
    for (int i = 0; i < Total; i++)
    {
        cout << Fivarr[i] << " " << Threarr[i] << " " << Twoarr[i] << endl;
    }
*/
    return 0;
}