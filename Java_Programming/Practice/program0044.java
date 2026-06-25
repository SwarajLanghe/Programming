///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : NumberX
//  Description : Contains a static method to check whether a given number
//                is divisible by both 3 and 5.
//
///////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name : CheckDivisible
    //  Input         : Integer
    //  Output        : Boolean
    //  Description   : Checks whether the given number is divisible
    //                  by both 3 and 5.
    //
    /////////////////////////////////////////////////////////////////////////////////

    public static boolean CheckDivisible(int iNo)
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
//  Class Name  : program0044
//  Description : Accepts a number from the user and checks whether
//                it is divisible by both 3 and 5 using a static method.
//  Date        : 25/06/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0044
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name : main
    //  Input         : Command Line Arguments
    //  Output        : Displays whether the number is divisible by 3 and 5.
    //  Description   : Accepts a number from the user and calls the
    //                  static function CheckDivisible().
    //
    /////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        // Accept number from user
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        // Call static function
        bRet = NumberX.CheckDivisible(iValue);

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
//      15
//  Output :
//      Number is divisible by 3 & 5
//
///////////////////////////////////////////////////////////////////////////////////////////