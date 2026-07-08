///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Package
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : DigitX
//  Description : Contains a non-static method to reverse the given
//                number and return the reversed number.
//
///////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : ReverseNumber
    //  Input         : Integer
    //  Output        : Integer
    //  Description   : Extracts each digit of the given number using the
    //                  modulus (%) operator, appends each extracted digit
    //                  to the reversed number, and finally returns the
    //                  reversed number.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public int ReverseNumber(int iNo)
    {
        int iDigit = 0;
        int iRev = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iRev = (iRev * 10) + iDigit;

            iNo = iNo / 10;
        }

        return iRev;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0092
//  Description : Accepts a number from the user and displays its
//                reversed form.
//  Date        : 08/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0092
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays the reversed number.
    //  Description   : Accepts a number from the user, creates an object
    //                  of the DigitX class, and calls the
    //                  ReverseNumber() method to reverse and display
    //                  the given number.
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

        iRet = dobj.ReverseNumber(iValue);

        System.out.println("Reverse number of " + iValue + " is " + iRet);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :
//      Enter number :
//      12345
//
//  Output :
//      Reverse number of 12345 is 54321
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(D)
// Where D is the number of digits in the given number.