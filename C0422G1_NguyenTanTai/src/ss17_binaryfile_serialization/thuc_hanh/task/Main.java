package ss17_binaryfile_serialization.thuc_hanh;

import java.io.*;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("src/ss17_binaryfile_serialization/thuc_hanh/source.txt");
            int i = -1 ;
            while ((i = is.read())!= -1 ){
                System.out.println(i+" "+(char)i);
            }
            is.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}

