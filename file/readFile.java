import java.io.*;

class readFile{
    public static void main(String[] args) {
        try {
            String line;
            System.out.println("Reading input.txt");
        
            FileReader fr= new FileReader("read.txt");
            BufferedReader br = new BufferedReader(fr);

                line = br.readLine();
                while(line != null){
                    System.out.println(line);
                    line=br.readLine();
                }
            br.close();
            fr.close();
        } catch (IOException IOEx) {
            System.out.println("read.txt File not found");
        }
    }
}