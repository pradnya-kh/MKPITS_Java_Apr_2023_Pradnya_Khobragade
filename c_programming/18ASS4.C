#include<stdio.h>
#include<conio.h>
void main()
{
int x;
float y,average;
printf(" Enter total distance in km:");
scanf("%d",&x);
printf("Enter total fuel spent in liters:");
scanf("%f",&y);
average=x/y;
printf("average Consumption(km/lt) %.2f",average);
getch();
}