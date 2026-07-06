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
//                given number from right to left using a for loop with the
//                update expression.
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
    //                  using the modulus (%) operator. The number is updated
    //                  in the update section of the for loop using the
    //                  division (/) operator until it becomes zero.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        for( ; iNo != 0 ; iNo = iNo / 10)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0082
//  Description : Accepts a number from the user and displays all of its
//                digits from right to left using a for loop.
//  Date        : 06/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0082
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
//      4817
//
//  Output :
//      7
//      1
//      8
//      4
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(D)
// Where D is the number of digits in the given number.