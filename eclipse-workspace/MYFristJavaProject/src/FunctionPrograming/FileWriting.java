package FunctionPrograming;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriting {

	  public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        try {
	            FileWriter fileWriter=new FileWriter("my.txt");
	            fileWriter.write("This is the text");
	            fileWriter.close();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
}
