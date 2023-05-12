
#include <stdio.h>
#include <conio.h>
void main()
{
int r;
char c;
for(r=0;r<=4;r++)
{
for(c='E';c>='A';c--)
{
printf("%c",c);
}
printf("\n");
}
getch();
}