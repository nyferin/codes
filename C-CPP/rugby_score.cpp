#include <iostream>
// #include <string>
#include <algorithm> //sort
// #include <vector>

using namespace std;

int main()
{
    int TOTAL, scoreOne, scoreTwo, scoreThree, count; //Total
    cout << "Masukkan 3 bilangan dan jumlah bilangan: ";
    cin >> scoreOne >> scoreTwo >> scoreThree >> TOTAL;
    cin.ignore();

    int firstArr[TOTAL], secondArr[TOTAL], thirdArr[TOTAL]; //first Array [ ], second Array [ ], third Array [ ]
    string score[TOTAL * 2], first, second, third;
    
    for (int i = 0; i < TOTAL * 2; i++)
    {
        score[i] = "";
    }
    

    for (int i = 0; i < TOTAL; i++) //init array
    {
        firstArr[i] = 0;
        secondArr[i] = 0;
        thirdArr[i] = 0;
    }
    // DEBUGGING
    /* for (int i = 0; i < TOTAL; i++) //init array
    {
        cout << firstArr[i];
        cout << secondArr[i];
        cout << thirdArr[i] << endl;
    } */

    for (int i = 0; i < TOTAL; i++)
    {
        if (i * scoreOne <= TOTAL)
        {
            firstArr[i] = i;
        } else {
            break;
        }
    }
    // DEBUGGING
    /* for (int i = 0; i < TOTAL; i++) //init array
    {
        cout << firstArr[i] << endl;
    } */

    for (int i = 0; i < TOTAL; i++)
    {
        if (i * scoreTwo <= TOTAL)
        {
            secondArr[i] = i;
        } else {
            break;
        }
        
    }
    // DEBUGGING
    /* for (int i = 0; i < TOTAL; i++) //init array
    {
        cout << secondArr[i] << endl;
    } */

    for (int i = 0; i < TOTAL; i++)
    {
        if (i * scoreThree <= TOTAL)
        {
            thirdArr[i] = i;
        } else {
            break;
        }
    }
    // DEBUGGING
    /* for (int i = 0; i < TOTAL; i++) //init array
    {
        cout << thirdArr[i] << endl;
    } */
    count = 0;
    for (int  i = 0; i < TOTAL; i++)
    {
        for (int j = 0; j < TOTAL; j++)
        {
            for (int k = 0; k < TOTAL; k++)
            {
                if ((firstArr[i] * scoreOne) + (secondArr[j] * scoreTwo) + (thirdArr[k] * scoreThree) == TOTAL)
                {
                    if (firstArr[i] != firstArr[i + 1] && secondArr[j] != secondArr[j + 1] && thirdArr[k] != thirdArr[k + 1])
                    {
                        // cout << firstArr[i] << " " << secondArr[j] << " " << thirdArr[k] << endl;
                        first = to_string(firstArr[i]);
                        second = to_string(secondArr[j]);
                        third = to_string(thirdArr[k]);

                        score[count] = first + " " + second  + " " + third;

                        count++;
                    }
                    
                    /* 
                    first = to_string(firstArr[i]);
                    second = to_string(secondArr[j]);
                    third = to_string(thirdArr[k]);
                    */
                    
                    // score[i] = first + " " + second  + " " + third;
                }
            }
        }
    }
    // cout << endl << endl << endl << endl;
    // DEBUGGING
    /* for (int i = 0; i < TOTAL; i++) //init array
    {
        cout << score[i] << endl;
    } */

    
    int scoreSize = sizeof(score)/sizeof(score[0]);

    sort(score, score + scoreSize);

    for (int i = 0; i < scoreSize; i++)
    {
        // cout << score[i] << endl << endl;
        if (score[scoreSize - 1].compare("") == 0)
        {
            cout << "Mustahil" << endl;
            break;
        } else if ((score[i].compare(score[i - 1]) != 0 && score[i].compare("") != 0))
        {
            cout << score[i] << endl;
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