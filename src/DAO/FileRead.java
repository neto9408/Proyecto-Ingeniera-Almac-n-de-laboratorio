
package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
 public void read() throws FileNotFoundException{
     String line="";
     Scanner reader = new Scanner(new File("datos.txt"));
     reader.useDelimiter(",");
     while(reader.hasNext()){
         System.out.println(reader.next());
     }
         
 }
 public static void main(String arg[]){
     try {
         FileRead File = new FileRead();
         File.read();
     } catch (Exception e) {
     }
 }
}
