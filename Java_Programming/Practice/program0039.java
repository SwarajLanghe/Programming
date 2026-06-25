// Input Number is divisible by 3 and 5 or not check

// Type 1

import java.util.Scanner;

class program0039 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        if((iValue % 3 == 0) && (iValue % 5 == 0))
        {
            System.out.println("Numer is divisible by 3 and 5");
        }
        else
        {
            System.out.println("Numer is not divisible by 3 and 5");
        }
    }
}
