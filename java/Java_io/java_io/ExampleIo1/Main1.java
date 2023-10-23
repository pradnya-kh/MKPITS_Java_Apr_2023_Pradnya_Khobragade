package ExampleIo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name : ");
        try {
            String nm = br.readLine();
            System.out.println("Hello:"+nm);

        } catch (IOException e) {
            throw new RuntimeException(e);


        }
    }
}
