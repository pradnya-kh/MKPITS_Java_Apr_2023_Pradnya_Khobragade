#include <stdio.h>
#include <conio.h>
void main()
{
int num;
printf("enter the number");
scanf("%d",&num);
    if(num<0 || num>80)
     {
	 printf("number is range");
     }
     else
     {
	 printf("number is not in range");
     }
getch();
}


