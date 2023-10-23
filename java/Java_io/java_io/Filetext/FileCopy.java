package Filetext;

import java.io.*;

public class FileCopy {
   public static void main(String[] args) {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("enter the source file name");
            String fname1 = b.readLine();
            File file = new File(fname1);
            if (file.exists()) {


                System.out.println("enter the target file name");
                String fname2 = b.readLine();
                FileCopy1.fileCopy(fname1,fname2);


            } else
                System.out.println("File does not Exit");


        } catch (Exception e){
            System.out.println(e);
        }
    }
}