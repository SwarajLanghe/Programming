///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : NumberX
//  Description : Contains a non-static method to check whether a given
//                number is divisible by both 3 and 5.
//
///////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : CheckDivisible
    //  Input         : Integer
    //  Output        : Boolean
    //  Description   : Checks whether the given number is divisible
    //                  by both 3 and 5.
    //
    /////////////////////////////////////////////////////////////////////////////////

    public boolean CheckDivisible(int iNo)
    {
        if((iNo % 3 == 0) && (iNo % 5 == 0))
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
//  Class Name  : program0045
//  Description : Accepts a number from the user and checks whether
//                it is divisible by both 3 and 5 using an object.
//  Date        : 25/06/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0045
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays whether the number is divisible by 3 and 5.
    //  Description   : Accepts a number from the user, creates an object
    //                  of NumberX, and calls the CheckDivisible() method.
    //
    /////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        // Create object of NumberX class
        NumberX nobj = new NumberX();

        // Accept number from user
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        // Call non-static function using object
        bRet = nobj.CheckDivisible(iValue);

        // Display result
        if(bRet == true)
        {
            System.out.println("Number is divisible by 3 & 5");
        }
        else
        {
            System.out.println("Number is not divisible by 3 & 5");
        }

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :
//      Enter number :
//      20
//
//  Output :
//      Number is not divisible by 3 & 5
//
///////////////////////////////////////////////////////////////////////////////////////////