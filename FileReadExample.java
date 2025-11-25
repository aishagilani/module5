import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            System.out.println("First line: " + line);
            
            br.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } 
        catch (IOException e) {
            System.out.println("Error: Unable to read from the file.");
        }
    }
}
