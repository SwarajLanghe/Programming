///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Package
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : DigitX
//  Description : Contains a non-static method to display all digits of the
//                given number from right to left using a for loop.
//
///////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : DisplayDigits
    //  Input         : Integer
    //  Output        : Void
    //  Description   : Extracts and displays each digit of the given number
    //                  using the modulus (%) and division (/) operators.
    //                  The loop continues until the number becomes zero.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        for( ; iNo != 0 ; )
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0081
//  Description : Accepts a number from the user and displays all of its
//                digits from right to left using a for loop.
//  Date        : 06/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0081
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays each digit of the entered number.
    //  Description   : Accepts a number from the user, creates an object
    //                  of the DigitX class, and calls the DisplayDigits()
    //                  method to display all digits.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        DigitX dobj = new DigitX();

        dobj.DisplayDigits(iValue);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :
//      Enter number :
//      9632
//
//  Output :
//      2
//      3
//      6
//      9
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(D)
// Where D is the number of digits in the given number.