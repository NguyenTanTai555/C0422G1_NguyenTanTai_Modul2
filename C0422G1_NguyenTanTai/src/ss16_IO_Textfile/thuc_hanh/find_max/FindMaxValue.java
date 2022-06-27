package ss16_IO_Textfile.thuc_hanh;

import java.util.List;

public class FindMaxValue {
    public static int FindMax(List<Integer> numbers) {
        int max  = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/ss16_IO_Textfile/thuc_hanh/number.txt");
        int maxValue = FindMax(numbers);
        readAndWriteFile.writeFile("src/ss16_IO_Textfile/thuc_hanh/number.txt",maxValue);
    }
}
