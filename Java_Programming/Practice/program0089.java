///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Package
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : DigitX
//  Description : Contains a non-static method to calculate and return
//                the sum of all digits present in the given number.
//
///////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : SumDigits
    //  Input         : Integer
    //  Output        : Integer
    //  Description   : Extracts each digit of the given number using the
    //                  modulus (%) operator, adds each digit to the sum,
    //                  and finally returns the total sum of all digits.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public int SumDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;

            iNo = iNo / 10;
        }

        return iSum;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0089
//  Description : Accepts a number from the user and displays the sum
//                of all digits present in that number.
//  Date        : 08/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0089
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays the sum of digits.
    //  Description   : Accepts a number from the user, creates an object
    //                  of the DigitX class, and calls the SumDigits()
    //                  method to calculate and display the sum of digits.
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

        iRet = dobj.SumDigits(iValue);

        System.out.println("Sum of digits is " + iRet + " in " + iValue);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :
//      Enter number :
//      786425
//
//  Output :
//      Sum of digits is 32 in 786425
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(D)
// Where D is the number of digits in the given number.