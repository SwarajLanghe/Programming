// take input to print "Jay Ganesh..." by given input times

#include <stdio.h>

int main()
{
    int iCnt = 0;
    int iValue;

    printf("Enter the frequesncy");
    scanf("%d",&iValue);
   
    // Iteration
    for(iCnt = 1; iCnt<=iValue ; iCnt++)
    {
         printf("Jay Ganesh...\n");
    }
       
    return 0;
}   