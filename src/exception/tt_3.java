package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class tt_3 {

    public static void main(String[] args) throws FileNotFoundException {

        String path="C:/a.txt";
        File file=new File(path);
        FileReader file_reader= new FileReader((file));

    }
}
