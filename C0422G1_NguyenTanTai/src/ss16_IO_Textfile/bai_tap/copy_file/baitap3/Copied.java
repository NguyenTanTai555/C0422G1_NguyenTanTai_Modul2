package ss16_IO_Textfile.bai_tap.baitap3;

import java.io.*;

public class Copied {
    public static void Copy(String sourceFile,String targetFile){
        try {
            FileReader fr = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(targetFile);
            BufferedWriter bw = new BufferedWriter(fw);
            String line = "";
            while ((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Copied.Copy("src/ss16_IO_Textfile/bai_tap/baitap3/source.txt","src/ss16_IO_Textfile/bai_tap/baitap3/target.txt");
    }
}
