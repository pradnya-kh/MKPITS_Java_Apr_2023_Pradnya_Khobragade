#include <stdio.h>
#include <conio.h>
void main()
{
int a,b;
printf("the value of a and b are:");
scanf("%d %d", &a,&b);
if(a%b==0)
{
printf("multiplied");
}
else
{
printf("not multiplied");
}
getch();
}