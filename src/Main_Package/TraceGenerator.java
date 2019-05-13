/*
 * This section deals with the Generating Traces from Parsed Result and Unique Key Buffer
 */
package Main_Package;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class TraceGenerator {
	public 	List<String> alignData(String ParsedResultFile, String[] UniqueKeyBuf) throws IOException{
		
		/*
		 * Read line from the file Parsed Result
		 * Take a character 
		 * if the line is not the flag[Activity]
		 * 		for each string in Unique_Key_Buffer
		 * 			if the string is equal to line
		 * 				write the character and append it
		 * 			else
		 * 				write new line
		 * Real line till its null
		 */
		
		BufferedReader reader1 = new BufferedReader(new FileReader(ParsedResultFile));
		FileWriter file_writer = new FileWriter(new File("./IntermediateOutput.txt"));
		String line1 = reader1.readLine();
		
		while(line1 != null) {
			char charArr ='A';
			if(!line1.equals("***Activity***")) {

				for(String str : UniqueKeyBuf) {

					if(str.equals(line1))
						file_writer.write((charArr)+"");
						charArr++;
				}
			}
			else
				file_writer.write("\n");
			line1 = reader1.readLine();
		}		
		System.out.println("Intermediate Output Generated!");
		file_writer.close();
		reader1.close();
		return null;
	}
}