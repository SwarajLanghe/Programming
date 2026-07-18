//writer a programme which accept number from user and print that number of $ & * on screen
//5
//$ * $ * $ * $ * $ *

#include<stdio.h>

void pattern(int iNo)
{
    int iCnt = 0;
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("$\t*\t");
    }
}

int main()
{
    int iValue = 0;
    printf("Enter number");
    scanf("%d",&iValue);

    pattern(iValue);

    return 0;
}