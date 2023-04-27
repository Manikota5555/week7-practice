import java.io.File;
import java.io.IOException;
public class Exception {
 
    public static void main(String[] args) {
        
        
        File file=new File("abc.txt");
        try {
        boolean b=file.createNewFile();
        if(b) {
            System.out.println("File created successfully");
        }
        else {
            System.out.println("error in file creation");
        }
        }
        catch(IOException e) {
            System.out.println(e);
        }
        
        
        
        
    }
 
}