package ExampleIo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3add {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");
        try {
            String nm = br.readLine();
            System.out.println("addition of two number" +((Integer.parseInt(nm) + Integer.parseInt(nm))));

        } catch (IOException e)
        {
            throw new RuntimeException(e);

        }
    }
}
