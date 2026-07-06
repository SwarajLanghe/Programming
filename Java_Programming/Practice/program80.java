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
//                given number from right to left without using an extra variable.
//
///////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : DisplayDigits
    //  Input         : Integer
    //  Output        : Void
    //  Description   : Displays each digit of the given number by directly
    //                  using the modulus (%) operator. The number is reduced
    //                  in every iteration using the division (/) operator
    //                  until it becomes zero.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public void DisplayDigits(int iNo)
    {
        while(iNo != 0)
        {
            System.out.println(iNo % 10);
            iNo = iNo / 10;
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0080
//  Description : Accepts a number from the user and displays all of its
//                digits from right to left using an object.
//  Date        : 06/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0080
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays each digit of the entered number.
    //  Description   : Accepts a number from the user, creates an object
    //                  of the DigitX class, and calls the DisplayDigits()
    //                  method to display all digits of the number.
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
//      8459
//
//  Output :
//      9
//      5
//      4
//      8
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(D)
// Where D is the number of digits in the given number.