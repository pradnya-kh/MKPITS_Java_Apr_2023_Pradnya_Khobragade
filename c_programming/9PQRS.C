#include <stdio.h>
#include <conio.h>
void main()
{
int p,q,r,s;
printf("enter the first integer:");
scanf("%d",&p);
printf("enter the second integer:");
scanf("%d",&q);
printf("enter the third integer:");
scanf("%d",&r);
printf("enter the fourth integer:");
scanf("%d",&s);
if(q>r && s>p && ((r+s)>(p+q)) && (r>0) && (s>0) && (p%2 == 0))
{
printf("Correct values");
}
else
{
printf("wrong values");
}
getch();
}