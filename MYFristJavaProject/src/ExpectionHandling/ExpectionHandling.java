package ExpectionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExpectionHandling {
	 public static void main(String[] args) throws IOException, FileNotFoundException {
	        // TODO Auto-generated method stub
	        FileReader fileReader = null;
	        try {
	            fileReader = new FileReader("my.txt");
	            while (fileReader.read() != -1) {
	                System.out.println((char) fileReader.read());
	            }
	        } catch (Exception e) {
	            // TODO: handle exception
	            System.out.println("Error " + e);
	        } finally {
	            fileReader.close();
	        }
	 
	    }
}
