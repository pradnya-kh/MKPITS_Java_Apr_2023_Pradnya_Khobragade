#include <stdio.h>
#include <conio.h>
void main()
{
int id,workhour;
float amthour,salary;

printf("enter the id");
scanf("%d",&id);
printf("enter the workhour");
scanf("%d",&workhour);
printf("enter the per hour");
scanf("%f",&amthour);
salary =workhour*amthour;
printf("id=%d",id);
printf("salary=%.2f",salary);
getch();
}
