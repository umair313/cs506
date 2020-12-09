import java.io.BufferedReader;
import java.io.*;

class file{
    public static void main(String[] args) {

   try {
    FileReader fr = new FileReader("input.txt");
    BufferedReader br = new BufferedReader(fr);
    String line = br.readLine();
    System.out.println(line);
    line= br.readLine();

    br.close();    
   } catch (IOException IOex) {
       System.out.println("File not found");
   }
}
}