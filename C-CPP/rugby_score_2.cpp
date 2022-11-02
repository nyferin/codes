#include <iostream>
#include <algorithm> //sort

using namespace std;

int main()
{
    int TOTAL, scoreOne, scoreTwo, scoreThree, count; // Total
    cout << "Masukkan 3 bilangan dan jumlah bilangan: ";
    cin >> scoreOne >> scoreTwo >> scoreThree >> TOTAL;
    cin.ignore();

    if (TOTAL == 0)
    {
        cout << 0 << " " << 0 << " " << 0 << endl;
    }
    else
    {
        int firstArr[TOTAL + 1], secondArr[TOTAL + 1], thirdArr[TOTAL + 1]; // first Array [ ], second Array [ ], third Array [ ]
        string score[TOTAL * 9], first, second, third;

        // init array
        for (int i = 0; i < TOTAL * 5; i++)
        {
            score[i] = "";
        }

        // init array
        for (int i = 0; i <= TOTAL; i++)
        {
            firstArr[i] = 0;
            secondArr[i] = 0;
            thirdArr[i] = 0;
        }

        // init array
        for (int i = 0; i <= TOTAL; i++)
        {
            if (i * scoreOne <= TOTAL)
            {
                firstArr[i] = i;
            }
            else
            {
                break;
            }
        }

        // init array
        for (int i = 0; i <= TOTAL; i++)
        {
            if (i * scoreTwo <= TOTAL)
            {
                secondArr[i] = i;
            }
            else
            {
                break;
            }
        }

        // init array
        for (int i = 0; i <= TOTAL; i++)
        {
            if (i * scoreThree <= TOTAL)
            {
                thirdArr[i] = i;
            }
            else
            {
                break;
            }
        }

        // finding score
        count = 0;
        bool check;
        for (int i = 0; i <= TOTAL; i++)
        {
            check = false;
            for (int j = 0; j <= TOTAL; j++)
            {
                for (int k = 0; k <= TOTAL; k++)
                {
                    if ((firstArr[i] * scoreOne) + (secondArr[j] * scoreTwo) + (thirdArr[k] * scoreThree) == TOTAL)
                    {
                        cout << firstArr[i] << " " << secondArr[j] << " " << thirdArr[k] << endl;
                        check = true;
                        /* bool isSameBefore = firstArr[i] != firstArr[i - 1] && secondArr[j] != secondArr[j - 1] && thirdArr[k] != thirdArr[k - 1];
                        bool isSameAfter = firstArr[i] != firstArr[i + 1] && secondArr[j] != secondArr[j + 1] && thirdArr[k] != thirdArr[k + 1];
                        if (isSameAfter || isSameBefore)
                        {
                             first = to_string(firstArr[i]);
                            second = to_string(secondArr[j]);
                            third = to_string(thirdArr[k]);

                            score[count] = first + " " + second  + " " + third;

                            count++;
                        } */
                    }
                }
                
            }
        }

        // sorting score
        /* int scoreSize = sizeof(score)/sizeof(score[0]);
        sort(score, score + scoreSize); */

        // print score
        /* for (int i = 0; i < scoreSize; i++)
        {
            if (score[scoreSize - 1].compare("") == 0)
            {
                cout << "Mustahil" << endl;
                break;
            } else if (i < scoreSize - 1 && score[i].compare(score[i + 1]) != 0 && score[i].compare("") != 0)
            {
                cout << score[i] << endl;
            } else if (i == scoreSize - 1 && score[i].compare("") != 0)
            {
                cout << score[i] << endl;
            }

        }*/
    }

    return 0;
}