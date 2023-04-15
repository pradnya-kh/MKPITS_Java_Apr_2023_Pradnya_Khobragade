#include <stdio.h>
#include <conio.h>
void main()
{
int radius;
float pi=3.14,c=1.33,result;
printf("enter the radius");
scanf("%d",&radius);
result = c*pi*radius*radius*radius;
printf("volume=%f",result);
getch();
}