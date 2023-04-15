#include<stdio.h>
#include<conio.h>
void main()
{
int radius;
float pi=3.142,res;
printf("enter radius");
scanf("%d",&radius);
res = pi*radius*radius;
printf("%f",res);
getch();
}