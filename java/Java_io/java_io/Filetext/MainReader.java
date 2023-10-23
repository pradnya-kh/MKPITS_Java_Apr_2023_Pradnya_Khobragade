package Filetext;

import java.io.*;
import java.net.FileNameMap;

public class MainReader {
    public static void main(String[] args) {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("enter file name");
            File file=new File(b.readLine());
            if(file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String str = br.readLine();
                while (str != null) {
                    System.out.println(str);
                    str = br.readLine();
                }
            }
            else
                System.out.println("file does not Exists");

                }catch(FileNotFoundException e){
            System.out.println(e);

            }catch (IOException e){
            System.out.println(e);

        }




    }
}
