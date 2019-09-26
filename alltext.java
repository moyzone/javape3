import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class alltext{
    public static void main(String[] args){
        File folder = new File("./files");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];

            if (file.isFile() && file.getName().endsWith(".txt")) {
                
                try{
                    BufferedReader in = new BufferedReader(new FileReader(file));
                    int ch;
                    try{
                        while ((ch = in.read()) != -1)
                        {
                        
                            System.out.print((char)ch);
                        }
                        in.close();
                    }catch(IOException e){
                        System.out.println("IO ");
                    }
                     
                }
                catch(FileNotFoundException e){
                    System.out.println("not found");
                }
            } 
            System.out.println();
            
        }
    }
}