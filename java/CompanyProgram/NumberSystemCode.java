import java.util.Scanner;

public class NumberSystemCode {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the index value (e.g. 1,2,3,etc.) : ");
        int index= scanner.nextInt();
        int result=(index*10)+2;
        if(result%2!=0){
            System.out.println("Invalid number.");
        }else{
            System.out.println("The value of the index "+"\n["+index+"] = "+result);
        }
    }
}
