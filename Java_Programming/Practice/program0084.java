///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Package
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : DigitX
//  Description : Contains a non-static method to count the total number of
//                digits present in the given number.
//
///////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : CountDigits
    //  Input         : Integer
    //  Output        : Integer
    //  Description   : Counts the number of digits in the given number by
    //                  repeatedly dividing it by 10 until it becomes zero.
    //                  Returns the total digit count.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public int CountDigits(int iNo)
    {
        int iCount = 0;

        while(iNo != 0)
        {
            iNo = iNo / 10;
            iCount++;
        }

        return iCount;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0084
//  Description : Accepts a number from the user and displays the total
//                number of digits present in that number.
//  Date        : 07/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0084
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays the total number of digits.
//  Description   : Accepts a number from the user, creates an object
//                  of the DigitX class, calls the CountDigits() method,
//                  and displays the returned digit count.
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

        System.out.println("Total numbers in digit are " + iRet);

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
//      Total numbers in digit are 4
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(D)
// Where D is the number of digits in the given number.