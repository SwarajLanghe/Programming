///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Package
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : DigitX
//  Description : Contains a non-static method to count the number of
//                odd digits present in the given number.
//
///////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : CountOddDigits
    //  Input         : Integer
    //  Output        : Integer
    //  Description   : Extracts each digit of the given number using the
    //                  modulus (%) operator. If the extracted digit is odd,
    //                  the counter is incremented. Returns the total count
    //                  of odd digits present in the number.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public int CountOddDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 != 0)
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
//  Class Name  : program0087
//  Description : Accepts a number from the user and displays the number of
//                odd digits present in that number.
//  Date        : 07/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0087
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays the number of odd digits.
    //  Description   : Accepts a number from the user, creates an object
    //                  of the DigitX class, calls the CountOddDigits()
    //                  method, and displays the total count of odd digits.
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

        iRet = dobj.CountOddDigits(iValue);

        System.out.println("Odd digit occured " + iRet + " times in " + iValue);

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
//      Odd digit occured 3 times in 786425
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(D)
// Where D is the number of digits in the given number.