#include <stdio.h>
#include <conio.h>
void main()
{
 long int num,n1,n2,n3,n4,n5,sum;
printf("enter any 5 digit number");
scanf("%ld",&num);
n1=num%10;
num=num/10;

n2=num%10;
num=num/10;

n3=num%10;
num=num/10;

n4=num%10;
num=num/10;

n5=num%10;

sum=n1+n2+n3+n4+n5;
printf("sum of digit =%ld",sum);
getch();
}