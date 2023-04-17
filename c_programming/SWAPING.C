#include <stdio.h>
#include <conio.h>
void main()
{
int a,b,c;
printf("enter the first number");
scanf("%d",&a);
printf("enter the second number");
scanf("%d",&b);
c=a;
a=b;
b=c;
printf("swapping first number=%d",a);
printf("swaping second number=%d",b);
getch();
}
