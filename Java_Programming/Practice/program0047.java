///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Package
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : NumberX
//  Description : Contains a non-static method to display all the factors
//                of a given number except the number itself.
//
///////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : DisplayFactors
    //  Input         : Integer
    //  Output        : Displays Factors
    //  Description   : Displays all the factors of the given number
    //                  by checking every number from 1 to half of
    //                  the given number.
    //
    /////////////////////////////////////////////////////////////////////////////////

    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt < (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0047
//  Description : Accepts a number from the user and displays all
//                the factors of that number using an object.
//  Date        : 26/06/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0047
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays all factors of the entered number.
    //  Description   : Accepts a number from the user, creates an
    //                  object of NumberX class, and calls the
    //                  DisplayFactors() method.
    //
    /////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        // Create object of NumberX class
        NumberX nobj = new NumberX();

        // Accept number from user
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        // Call non-static function using object
        nobj.DisplayFactors(iValue);

        // Close Scanner object
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
//      1
//      2
//      4
//      5
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(N/2)
// Where N/2 >= 0