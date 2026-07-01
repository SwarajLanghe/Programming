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
//                the given number is Prime or not.
//
///////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    ///////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : CheckPrime
    //  Input         : Integer
    //  Output        : Boolean
    //  Description   : Checks whether the given number is prime by verifying if it is
    //                  divisible by any number from 2 to half of the given number.
    //                  Returns true if the number is prime,otherwise returns false.
    //                  
    ////////////////////////////////////////////////////////////////////////////////////////

    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = true;

        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0068
//  Description : Accepts a number from the user and checks whether
//                it is Prime or not using an object.
//  Date        : 01/07/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0068
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays whether the entered number is Prime
    //                  or not.
    //  Description   : Accepts a number from the user, creates an
    //                  object of NumberX class, calls the CheckPrime()
    //                  method and displays the returned result.
    //
    /////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        bRet = nobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println("It is Prime");
        }
        else
        {
            System.out.println("It is not Prime");
        }

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :
//      Enter number :
//      13
//
//  Output :
//      It is Prime
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(N/2)
// Where N/2 >= 0