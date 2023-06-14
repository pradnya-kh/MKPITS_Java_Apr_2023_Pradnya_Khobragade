//write a c program that read 5 count the number of positive numbers//
// and negative number //
#include <stdio.h>
#include <conio.h>
void main()
{
int n1,n2,n3,n4,n5 pos=0,neg=0;
printf("enter the five number");
scanf("%d%d%d%d%d",&n1,&n2,&n3,&n4,&n5);
  if(n1<0);
  {
    pos++;
  }
  else(n1>0);
  {
    neg++
  }
  if(n2<0);
  {
    pos++
  }
  else(n2>0);
  {
    neg++
  }
  if(n3<0);
  {
    pos++
  }
  else(n3>0);
  {
    neg++
  }
  if(n4<0);
  {
    pos++
  }
  else(n4>0);
  {
    neg++
  }
  if(n5<0);
  {
    pos++
  }
  else(n5<0);
  {
   neg++
  }
printf("number of positive numbers:%d\n",pos);
printf("number of negative numbers:%d\n",neg);
getch();
}
