#include <stdio.h>
#include <conio.h>
void main()
{
 int r,c;
    for(r=1;r<=5;r++)
    {
     for(c=1;c<=6-r;c++)
     {
      printf("%d",r);
     }
     printf("\n");
    }
getch();
}
