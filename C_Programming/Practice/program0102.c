// Call by Value function

#include<stdio.h>

void CallByValue(int iNo)
{
    iNo++;
}

int main()
{
    int iValue = 11;
   
    CallByValue(iValue);    // CallByValue(11)
    
    printf("Value after Function call : %d\n",iValue);

    return 0;
}