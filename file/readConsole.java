import java.io.*;

class readConsole{
    public static void main(String[] args) {
        try {
            String line;
            System.out.println("Reading input.txt");
        
            FileReader fr= new FileReader(FileDescriptor.in);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("console.txt");
            PrintWriter pw = new PrintWriter(fw);
            line = br.readLine();
               while(line != ""){
                pw.println(line);
                line = br.readLine();
               }
            
            pw.close();
            fw.close();
            br.close();
            fr.close();
        } catch (IOException IOEx) {
            System.out.println("read.txt File not found");
        }
    }
}