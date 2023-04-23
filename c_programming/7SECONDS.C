#include <stdio.h>
#include <conio.h>
void main()
{
int hours,minutes,seconds;
clrscr();
printf("enter the total seconds");
scanf("%d",&seconds);
hours=seconds/3600;
seconds=seconds%3600;
minutes=seconds/60;
seconds=seconds%60;
printf("hours is %d",hours);
printf("minutes is %d",minutes);
printf("seconds is %d",seconds);
getch();
}
