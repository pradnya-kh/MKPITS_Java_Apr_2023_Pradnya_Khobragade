package ExampleIo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2Square {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number : ");
        try {
            String nm = br.readLine();
            System.out.println("square:"+(Integer.parseInt(nm)*Integer.parseInt(nm)));

        } catch (IOException e) {
            throw new RuntimeException(e);


        }

    }
}
