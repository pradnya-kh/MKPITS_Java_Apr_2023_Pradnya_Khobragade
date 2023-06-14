#include <stdio.h>
#include <conio.h>
void main()
{
int x,y;
printf("enter the co-ordinate(x,y):");
printf("\nx:");
scanf("%d",&x);
printf("y:");
scanf("%d",&y);
 if(x>0 && y>0)
 {
  printf("quardrant-I(+,+)\n");
 }
 else if(x>0 && y<0)
 {
  printf("quardrant-II(+,-)\n");
 }
 else if(x<0 && y<0)
 {
  printf("quardrant-III(-,-)\n");
 }
 else if(x<0 && y>0)
 {
  printf("quardrant-IV(-,+)\n");
 }
getch();
}