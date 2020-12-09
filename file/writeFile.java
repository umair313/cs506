import java.io.*;

class writeFile{
    public static void main(String[] args) {
        try{
            String text = "Hello World\nwelcome to java Language";
            FileWriter fw =new FileWriter("write.txt");
            PrintWriter pw= new PrintWriter(fw);
            pw.println(text);

            pw.flush();
            pw.close();
            fw.close();
        }catch(IOException ioEx){
            System.out.println("Error:File write.txt not Found");
        }
    }
}