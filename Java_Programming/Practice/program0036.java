import java.util.*;

class program0036 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String sName = null;
        int iAge = 0;
        float fMarks = 0.0f;

        System.out.println("Enter your name : ");
        sName = sobj.nextLine();

        System.out.println("Enter Your age : ");
        iAge = sobj.nextInt();

        System.out.println("Enter your Marks");
        fMarks = sobj.nextFloat();

        System.out.println("Name : "+sName);
        System.out.println("Age : "+iAge);
        System.out.println("Marks : "+fMarks);
    }
}
