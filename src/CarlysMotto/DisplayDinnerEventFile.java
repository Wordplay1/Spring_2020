package CarlysMotto;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * @author donaldmears
 * @title DisplayDinnerEventFile.java
 * @description Program reads file and prints contents
 * 
 *
 */
public class DisplayDinnerEventFile {

	public static void main(String[] args) {
		
		Path file = Paths.get("/Users/donaldmears/Documents/Wilmington University/CSC335/data.rtf");
		
		InputStream input = null;
		try {
			input = Files.newInputStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String s = null;
			while((s = reader.readLine()) != null) 
				System.out.println(s);
			input.close();
		}catch(Exception e) {
			
		}


	}

}
