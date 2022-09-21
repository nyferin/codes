#include <iostream>
#include <cstdlib> //abs

using namespace std;

int main()
{
    int count, Tin, Tout, Tmin; //count, Temperature-in, Temperature-out, Temperature-minimum
    Tmin = 5526;

    cin >> count;

    int Tarr[count]; //Temperature-array[ ]

    if (count == 0) //zero temperature
    {
        cout << count;
    } else
    {
        for (int i = 0; i < count; i++) //input temperature
        {
            cin >> Tin;

            Tarr[i] = Tin; //init array
        }
        
        for (int i = 0; i < count; i++) //check closest to zero temperature
        {
            if (abs(Tarr[i]) < abs(Tmin))
            {
                Tmin = Tarr[i];
            } else if (abs(Tarr[i]) == abs(Tmin))
            {
                if (Tarr[i] > Tmin) //positive temperature priorities
                {
                    Tmin = Tarr[i];
                }
            }
            Tout = Tmin;
        }
        cout << endl << Tout << endl << endl;
    }
    return 0;
}