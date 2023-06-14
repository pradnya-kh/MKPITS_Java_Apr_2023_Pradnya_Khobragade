
#include <stdio.h>
#include <conio.h>
void main()
{
int a, b, c;
printf("enter the three numbers \na:");
scanf("%d",&a);
printf("b:");
scanf("%d",&b);
printf("c:");
scanf("%d",&c);
if (a>b && a>c)
   printf("biggest number is %d",a);
if (b>a && b>c)
   printf("biggest number is %d",b);
if (c>a && c>b)
   printf(" biggest number is %d",c);

getch();
}


