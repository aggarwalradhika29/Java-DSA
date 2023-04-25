#include<iostream>
int rec(int num)
{
    return (num) ? num%10 + rec(num/10):0;
}

int main()
{
    printf("%d", (rec(4567)));
    return 0;
}