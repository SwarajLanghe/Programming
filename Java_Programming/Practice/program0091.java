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
//                the sum of all even digits present in the given number.
//
///////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : SumEvenDigits
    //  Input         : Integer
    //  Output        : Integer
    //  Description   : Extracts each digit of the given number using the
    //                  modulus (%) operator. If the extracted digit is
    //                  even, it is added to the even sum. Finally, the
    //                  total sum of all even digits is returned.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public int SumEvenDigits(int iNo)
    {
        int iDigit = 0;
        int iEvenSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }

            iNo = iNo / 10;
        }

        return iEvenSum;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0091
//  Description : Accepts a number from the user and displays the sum
//                of all even digits present in that number.
//  Date        : 08/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0091
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays the sum of even digits.
    //  Description   : Accepts a number from the user, creates an object
    //                  of the DigitX class, and calls the
    //                  SumEvenDigits() method to calculate and display
    //                  the sum of all even digits.
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

        iRet = dobj.SumEvenDigits(iValue);

        System.out.println("Summation of Even digits is " + iRet + " in " + iValue);

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
//      Summation of Even digits is 20 in 786425
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(D)
// Where D is the number of digits in the given number.