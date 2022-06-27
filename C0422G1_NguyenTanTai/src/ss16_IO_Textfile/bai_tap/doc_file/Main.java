package ss16_IO_Textfile.bai_tap.doc_file;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        List<Nation> list = readFile.readFileCSV("src/ss16_IO_Textfile/bai_tap/doc_file/work.txt");
        for (Nation n : list) {
            System.out.println(n.toString());
        }
    }
}
