// call by address function

#include<stdio.h>

void CallByAddress(int *iptr)
{
    (*iptr)++;
}

int main()
{
    int iValue = 11;
   
    CallByAddress(&iValue);    // CallByAddress
    
    printf("Value after Function call : %d\n",iValue);

    return 0;
}