package SortingbyArraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<Integer>();
        arrayList.addAll(Arrays.asList(8,6,4,3,7,2,1));
        arrayList.forEach(number ->{
            if(number%2!=0){
                System.out.println(number);
                }}
                );

        arrayList.forEach(number ->{
            if(number%2==0){
                System.out.println(number);
            }
        });

    }
    }


