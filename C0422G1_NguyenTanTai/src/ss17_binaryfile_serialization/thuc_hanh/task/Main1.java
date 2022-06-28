package ss17_binaryfile_serialization.thuc_hanh;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main1 {
    public static void main(String[] args) {
        try {
            OutputStream w = new FileOutputStream("D:\\CODEGYM\\module2\\C0422G1_NguyenTanTai\\src\\ss17_binaryfile_serialization\\thuc_hanh\\dest.txt");
            byte[] bytes = new byte[]{'H', 'e', 'l', 'l', 'o'};
            for (int i = 0; i < bytes.length; i++) {
                byte b = bytes[i];
                w.write(b);
            }
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
