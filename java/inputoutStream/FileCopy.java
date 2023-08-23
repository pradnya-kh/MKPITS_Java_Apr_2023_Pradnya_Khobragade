import java.io.*;

public class FileCopy {
    static void fileCopy(String fName1,String fName2) throws IOException,FileNotFoundException {
        BufferedReader br=new BufferedReader(new FileReader(fName1));
        BufferedWriter bw=new BufferedWriter(new FileWriter(fName2));
        String str=br.readLine();
        while (str!=null){
            bw.write(str+" \n");
            str= br.readLine();
        }
        bw.close();
        System.out.println("file copied successfully .........");
    }


}
