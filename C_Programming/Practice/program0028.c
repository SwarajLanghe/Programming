// take input to print "Jay Ganesh..." by given input times

#include <stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    
    for(iCnt = 1; iCnt<=iNo ; iCnt++)
    {
         printf("Jay Ganesh...\n");
    }
}

int main()
{
    int iValue;

    printf("Enter the frequesncy");
    scanf("%d",&iValue);
   
   Display(iValue);
       
    return 0;
}   