//Input : 12
//Output : 144.  (1*2*3*4*6)
#include<stdio.h>

int MulFact(int iNo)
{
    int iCnt = 0;
    int iMult = 1;

    for(iCnt = 1; iCnt <= (iNo /2);iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iMult = iMult * iCnt;
        }
    }
    return iMult;
}


int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number");
    scanf("%d",&iValue);

    iRet = MulFact(iValue);

    printf("%d",iRet);

    return 0;
}