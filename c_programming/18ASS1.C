#include <stdio.h>
#include <conio.h>
int main()
{
float aw1,aw2,np1,np2,average;
printf("weight of item1:");
scanf("%f", &aw1);
printf("\nweight of item2:");
scanf("%f",&aw2);
printf("\n no. of item1 purchases:");
scanf("%f",&np1);
printf("\n no. ofiteam2 purchases:");
scanf("%f",&np2);
average = ((aw1*np1)+(aw2*np2))/(np1+np2);
printf("\n average value = %f",average);
return 0;
}
