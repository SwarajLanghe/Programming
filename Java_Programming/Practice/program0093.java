///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Package
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : DigitX
//  Description : Contains a non-static method to check whether the
//                given number is a palindrome or not.
//
///////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : CheckPalindrome
    //  Input         : Integer
    //  Output        : Boolean
    //  Description   : Stores the original number, reverses the given
    //                  number by extracting each digit, and compares the
    //                  reversed number with the original number. Returns
    //                  true if both are equal; otherwise, returns false.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public boolean CheckPalindrome(int iNo)
    {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iRev = (iRev * 10) + iDigit;

            iNo = iNo / 10;
        }

        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0093
//  Description : Accepts a number from the user and checks whether
//                the given number is a palindrome or not.
//  Date        : 08/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0093
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays whether the number is a palindrome.
//  Description   : Accepts a number from the user, creates an object
//                  of the DigitX class, and calls the
//                  CheckPalindrome() method to determine whether
//                  the number is a palindrome.
    //
    ///////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        DigitX dobj = new DigitX();

        bRet = dobj.CheckPalindrome(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :
//      Enter number :
//      12321
//
//  Output :
//      Number is Palindrome
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(D)
// Where D is the number of digits in the given number.