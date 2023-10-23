package Filemethod;

import java.io.File;

public class FileMain1 {
    public static void main(String[] args) {
        File ff=new File("E:\\Folderforpro","abc.txt");
        System.out.println(ff.exists());
        System.out.println(ff.getAbsolutePath());
        File d=new File( "E:\\Folderforpro");
        System.out.println(d.exists());
        File fd=new File(d,"abc.txt");
        String []files=d.list();
        for(String fn:files){
            System.out.println(fn);
            


        }
    }
}
