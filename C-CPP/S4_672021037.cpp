#include <iostream>
#include <string>

using namespace std;

string OneTens[] = {"sepuluh", "sebelas", "seratus", "seribu"}, Oness[] = {"satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"}, Ones = "", Tens = "", Hundreds = "", Thousands = ""; //OneTens [ ], Oness [ ], Ones, Tens, Hundreds, Thousands

string NumtoAlph(int Num) //number to word convert
{
    if (Num == 0) //Num = 0
    {
        return Ones = "nol";
    } else if (Num < 10) //Num < 10
    {
        return Ones =  Oness[Num - 1];
    } else if (Num < 100) //Num < 100
    {
        if (Num < 12) //Num < 12
        {
            if (Num % 10 == 0) //Num = 10
            {
                return Tens = OneTens[0];
            } else //Num = 11
            {
                return Tens = OneTens[1];
            }
        } else if (Num < 20) //Num < 20
        {
            return Tens = Oness[(Num % 10) - 1] + " belas";
        } else if (Num < 100) //Num < 100
        {
            if (Num % 10 == 0) //Num is tens
            {
                return Tens = Oness[(Num / 10) - 1] + " puluh";
            } else 
            {
                return Tens = Oness[(Num / 10) - 1] + " puluh " + NumtoAlph(Num % 10);
            }
        }
    } else if (Num < 1000) //Num < 1000
    {
        if (Num < 200) //Num < 200
        {
            if (Num % 100 == 0) //Num is hundreds
            {
                return Hundreds = OneTens[2];
            } else
            {
                return Hundreds = OneTens[2] + " " + NumtoAlph(Num % 100);
            }
        } else
        {
            if (Num % 100 == 0) //Num is hundreds
            {
                return Hundreds = Oness[(Num / 100) - 1] + " ratus";
            } else
            {
                return Hundreds = Oness[(Num / 100) - 1] + " ratus " + NumtoAlph(Num % 100);
            }
        }
    } else if (Num < 10000) //Num < 10000
    {
        if (Num < 2000) //Num < 2000
        {
            if (Num % 1000 == 0) //Num is thousands
            {
                return Thousands = OneTens[3];
            } else
            {
                return Thousands = OneTens[3] + " " + NumtoAlph(Num % 1000);
            }
        } else
        {
            if (Num % 1000 == 0) //Num is thousands
            {
                return Thousands = Oness[(Num / 1000) - 1] + " ribu";
            } else
            {
                return Thousands = Oness[(Num / 1000) - 1] + " ribu " + NumtoAlph(Num % 1000);
            }
        }
    } else if (Num == 10000) //Num = 100000
    {
        return Thousands = OneTens[(Num / 10000) - 1] + " ribu";
    }
    
    return "[ERROR]";
}

int main()
{
    int Num; //Number

    cin >> Num;

    if (Num < 0) //minus input
    {
        cout << "[ERROR] Input kurang dari 0!";
    } else if (Num > 10000) //too much input
    {
        cout << "[ERROR] Input lebih dari 10000!";
    } else if (0 <= Num && Num <= 10000) // input range
    {
        cout << NumtoAlph(Num);
    }

    return 0;
}