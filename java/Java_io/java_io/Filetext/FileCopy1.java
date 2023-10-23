package Filetext;

import java.io.*;

public class FileCopy1 {
    static void fileCopy(String fname1, String fname2) throws IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(fname1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fname2));
        String str=br.readLine();


        while (str!=null){
            bw.write(str+"\n");
            str=br.readLine();

        }
        bw.close();
        System.out.println("file copied successfully");
    }
}


