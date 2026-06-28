///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Package
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : NumberX
//  Description : Contains a non-static method to calculate the summation of 
//                all the factors of a given number except the number itself.
//                
///////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : SumFactors
    //  Input         : Integer
    //  Output        : Integer
    //  Description   : Calculates and returns the summation of all the
    //                  factors of the given number by checking every
    //                  number from 1 to half of the given number.
    //
    /////////////////////////////////////////////////////////////////////////////////

    public int SumFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (iNo / 2) ; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0049
//  Description : Accepts a number from the user and displays the
//                summation of all its factors using an object.
//  Date        : 28/06/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0049
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   : main
    //  Input         : Command Line Arguments
    //  Output        : Displays the summation of factors of the entered number.           
    //  Description   : Accepts a number from the user, creates an object of
    //                  NumberX class, calls the SumFactors() method and 
    //                  displays the returned summation.              
    //
    /////////////////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        // Accept number from user
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        // Create object of NumberX class
        NumberX nobj = new NumberX();

        // Call non-static function using object
        iRet = nobj.SumFactors(iValue);

        System.out.println("Summation of factors : "+iRet);        

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
//      Summation of factors : 22
//
//  Explanation :
//      Factors of 20 (excluding itself) are :
//      1 + 2 + 4 + 5 + 10 = 22
//
///////////////////////////////////////////////////////////////////////////////////////////

// Time Complexity : O(N/2)
// Where N/2 >= 0
