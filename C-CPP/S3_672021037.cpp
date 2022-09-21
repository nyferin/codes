#include <iostream>
#include <algorithm> //sort

using namespace std;

int main()
{
    int N, HpIn; //N-input, HorsepowerInput

    cin >> N;

    int Hparr[N], Diff[N - 1]; //Horsepower-array [ ] , Differrence [ ]

    for (int i = 0; i < N; i++) //input(s)
    {
        cin >> HpIn;

        Hparr[i] = HpIn; //init array
    }

    sort(Hparr, Hparr + N); //sort Horsepower-array

    for (int i = 0; i < (N - 1); i++) //differrence
    {
        Diff[i] = Hparr[i + 1] - Hparr[i];
    }

    sort(Diff, Diff + (N - 1)); //sort difference

/*  FOR DEBUGGING
    cout << endl;
    for (int i = (N - 1); i >= 0; i--)
    {
        cout << Hparr[i] << " ";
    }
    cout << endl;
    for (int i = 0; i < (N - 1); i++)
    {
        cout << " " << Diff[i];
    }
    cout << endl;
*/
    cout << endl << Diff[0] << endl << endl;
    return 0;
}