//12
//6 4 3 2 1

//13
//1
#include<stdio.h>

void FactRev(int iNo)
{
    int iCnt;

    for(iCnt = (iNo /2);iCnt >= 1; iCnt--)
    {
        if((iNo % iCnt) == 0)
        {
           printf("%d\t",iCnt);
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    FactRev(iValue);

    return 0;
}   
