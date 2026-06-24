///////////////////////////////////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name  : program0036
//  Description : Accepts name, age, and marks from the user and displays
//                the entered information on the console.
//  Date        : 24/06/2026
//  Author      : Swaraj Ashok Langhe
//
///////////////////////////////////////////////////////////////////////////////////////////

class program0036
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Entry Point Function
    //  Input  : Command Line Arguments
    //  Output : Displays entered user details
    //  Description : Accepts name, age, and marks from the user and
    //                displays them on the console.
    //
    /////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String sName = null;
        int iAge = 0;
        float fMarks = 0.0f;

        // Accept user's name
        System.out.println("Enter your name : ");
        sName = sobj.nextLine();

        // Accept user's age
        System.out.println("Enter Your age : ");
        iAge = sobj.nextInt();

        // Accept user's marks
        System.out.println("Enter your Marks : ");
        fMarks = sobj.nextFloat();

        // Display entered information
        System.out.println("Name : " + sName);
        System.out.println("Age : " + iAge);
        System.out.println("Marks : " + fMarks);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :
//      Enter your name : Swaraj
//      Enter Your age : 21
//      Enter your Marks : 85.5
//
//  Output :
//      Name : Swaraj
//      Age : 21
//      Marks : 85.5
//
///////////////////////////////////////////////////////////////////////////////////////////