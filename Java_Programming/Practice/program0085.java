///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Package
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : DigitX
//  Description : Contains a non-static method to count the number of times
//                the digit 7 occurs in the given number.
//
///////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : CountDigits
    //  Input         : Integer
    //  Output        : Integer
    //  Description   : Extracts each digit of the given number using the
    //                  modulus (%) operator. If the extracted digit is 7,
    //                  the counter is incremented. Returns the total count
    //                  of digit 7 present in the number.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 7)
            {
                iCount++;
            }

            iNo = iNo / 10;
        }

        return iCount;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0085
//  Description : Accepts a number from the user and displays the number of
//                times the digit 7 occurs in that number.
//  Date        : 07/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0085
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays the number of occurrences of digit 7.
    //  Description   : Accepts a number from the user, creates an object
    //                  of the DigitX class, calls the CountDigits() method,
    //                  and displays the total occurrences of digit 7.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        DigitX dobj = new DigitX();

        iRet = dobj.CountDigits(iValue);

        System.out.println("7 digit occured " + iRet + " times in " + iValue);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :
//      Enter number :
//      787675
//
//  Output :
//      7 digit occured 3 times in 787675
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(D)
// Where D is the number of digits in the given number.