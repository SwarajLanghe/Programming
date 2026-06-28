///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Package
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : NumberX
//  Description : Contains a non-static method to check whether
//                the given number is a Perfect number or not.
//
///////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : CheckPerfect
    //  Input         : Integer
    //  Output        : Boolean
    //  Description   : Calculates the summation of all the factors of the
    //                  given number (excluding the number itself). If the
    //                  summation is equal to the given number, it returns
    //                  true; otherwise, it returns false.               
    //
    /////////////////////////////////////////////////////////////////////////////////

    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }

            // Stop checking if summation exceeds the given number
            if(iSum > iNo)
            {
                break;
            }
        }

        if(iSum == iNo)
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
//  Class Name  : program0051
//  Description : Accepts a number from the user and checks whether it is a Perfect
//                number using an object.
//  Date        : 28/06/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0051
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays whether the entered number is Perfect or not.
    //  Description   : Accepts a number from the user, creates an object of
    //                  NumberX class, calls the  CheckPerfect() method, and
    //                  displays the returned result.
    //                 
    /////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        // Creates object of NumberX class
        NumberX nobj = new NumberX();

        // Accept number from user
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        // Call non-static function using object
        bRet = nobj.CheckPerfect(iValue);

        // Display the result
        if(bRet == true)
        {
            System.out.println("It is Perfect");
        }
        else
        {
            System.out.println("It is not Perfect");
        }

        // Close Scanner object
        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :
//      Enter number :
//      28
//
//  Output :
//      It is Perfect
//
//  Explanation :
//      Factors of 28 (excluding itself) are :
//      1 + 2 + 4 + 7 + 14 = 28
//      Since the sum of factors is equal to the number,
//      28 is a Perfect number.
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(N/2)
// Where N/2 >= 0