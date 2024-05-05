package exception;

import java.io.FileInputStream;

public class ex_15 {
 public static void main(String[] args) {

  try{
   String path="c:/dog.txt";
   FileInputStream f= new FileInputStream(path);
  } catch(Exception e){
    e.printStackTrace();
  }
 }

}
