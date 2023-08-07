
import java.util.Scanner;
class LinearSearch{
public static void main(String[] args){
	int i;
int num[]={2,5,6,8,9};

Scanner scanner=new Scanner(System.in);
System.out.print("Enter the number");
int n=scanner.nextInt();

for( i=0; i<num.length;i++)
{
	if (n==num[i])
	{
		System.out.print("Number found ");
		break;
	}
}
	if(i==num.length){
	System.out.print("not Found");
		
		}
}
}
