#include <stdio.h>
#include <conio.h>
void main()
{
int r,c;
printf("enter the row=");
scanf("%d",&r);
printf("enter the columns=");
scanf("%d",&c);
for( r=1;r<=3;r++)
{
for( c=1;c<=5;c++)
{
printf("%d",c);
}
printf("\n ");
}
getch();
}
