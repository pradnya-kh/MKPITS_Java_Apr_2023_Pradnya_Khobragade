#include <stdio.h>
#include <conio.h>

void main()
{
int r;
float result;

printf("enter the radius");
scanf("%d", &r);
result=2*3.14*r;
printf(" circumference of circle=%f",result);
getch();
}