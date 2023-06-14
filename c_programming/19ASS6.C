#include <stdio.h>
#include <conio.h>
void main()
{
int i;
printf("The even numbers between 1 to 50 are:\n");
for(i = 1; i<=50; i++)
{
  if(i%2==0)
  {
   printf("%d",i);
  }
}
getch();
}