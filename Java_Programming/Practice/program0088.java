///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Package
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : DigitX
//  Description : Contains a non-static method to count and display the
//                number of even and odd digits present in the given number.
//
///////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : CountEvenOddDigits
    //  Input         : Integer
    //  Output        : Void
    //  Description   : Extracts each digit of the given number using the
    //                  modulus (%) operator. If the digit is even, the
    //                  even counter is incremented; otherwise, the odd
    //                  counter is incremented. Finally, both counts are
    //                  displayed.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public void CountEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iEvenCount = 0;
        int iOddCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }

            iNo = iNo / 10;
        }

        System.out.println("Even digit occured " + iEvenCount);
        System.out.println("Odd digit occured " + iOddCount);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0088
//  Description : Accepts a number from the user and displays the total
//                number of even and odd digits present in that number.
//  Date        : 07/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0088
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays the count of even and odd digits.
    //  Description   : Accepts a number from the user, creates an object
    //                  of the DigitX class, and calls the
    //                  CountEvenOddDigits() method to display the count
    //                  of even and odd digits.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        DigitX dobj = new DigitX();

        dobj.CountEvenOddDigits(iValue);

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
//      Even digit occured 3
//      Odd digit occured 3
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(D)
// Where D is the number of digits in the given number.
