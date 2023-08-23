import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------------enter your file name --------");
        try {
            String fName1 =br.readLine();
            File file=new File(fName1);
            if(file.exists()){
                System.out.println("enter your second file which you want to target ");
               String fName2= br.readLine();
               FileCopy.fileCopy(fName1,fName2);
            }
            else{
                System.out.println("............file not found ............");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}