#include <stdio.h>
#include <conio.h>
void main()
{
int r,c;
  clrscr();
      for(r='A';r<='E';r++)
      {
      for(c='E';c>=r;c--)
      {
      printf("%c",r);
      }
      printf("\n");
      }
      getch();
      }
