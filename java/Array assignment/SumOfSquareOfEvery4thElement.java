public class SumOfSquareOfEvery4thElement{
    public static void main(String[] args){
        int[] array={1,2,3,4,5,6,7,8,9,10,20,30,44,66,88,75,77,60,55,87,95,14,15,25,26,
                28,27,28,29,37,35,36,38,41,45,37,38,39,4};
                int sum=0;
    for(int counter=0; counter<=array.length; counter=counter+4){
        sum=sum+(array[counter]*array[counter]);



    }
    System.out.print(sum);
    }
    }