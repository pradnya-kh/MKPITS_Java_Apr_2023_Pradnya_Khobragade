#include <stdio.h>
#include <conio.h>
void main()
{
int r;
char c;
printf("enter the row");
scanf("%d",r);
printf("enter the col");
scanf("%c",c);
for(r=0;r<=4;r++)
{
for(c='A';c<='E';c++)
{
printf("%c",c);
}
printf("\n");
}
getch();
}