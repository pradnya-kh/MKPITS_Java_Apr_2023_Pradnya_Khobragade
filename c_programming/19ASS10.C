#include <stdio.h>
#include <conio.h>
void main()
{
int x,i;
printf("enter  an integer:");
scanf("%d",&x);
printf("list of square of each one of the even values from 1to a%d :\n",x);
for(i=2; i<=x; i++)
{
  if((i%2) ==0)
{
printf("%d^2 = %d\n",i,i*i);
}
}
getch();
}

