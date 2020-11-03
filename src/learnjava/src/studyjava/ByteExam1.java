package studyjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileInputStream fos = null;
        try {
            fis = new FileInputStream("src/studyjava/ByteExam1.java");
            fos = new FileInputStream("byte.txt");

            int readData = -1;
            while (true){
                try {
                    if (!((readData =  fis.read())!=-1)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
//                fos.write(readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

















