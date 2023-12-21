package inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamEx03 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")){

            while (fis.available()>0){
                System.out.println((char)fis.read());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}