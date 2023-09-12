package SortingoddEvennumber;

import org.w3c.dom.css.Counter;

public class EvenByusingLambadaExpression {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("enter the number:");
                for (int counter = 1; counter < 100; counter++) {
                    if (counter%2!=0) {
                        System.out.println(counter + "number is odd");

                    }
                }

            }


        };runnable.run();
            Runnable runnable1=new Runnable() {
                @Override
                public void run() {
                    System.out.println("enter the number:");
                    for (int counter = 1; counter < 100; counter++) {
                        if (counter % 2  == 0) {
                            System.out.println(counter + "number is Even");

                        }
                    }
                }
            };runnable1.run();

    }
}
