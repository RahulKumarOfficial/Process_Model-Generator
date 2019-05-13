/*
 * This section involves obtaining the list of activities that is distinct / unique
 * and store them in a List of String
 */
package Main_Package;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class TokenAppend {
 
    public List<String> getDistinctWordList(String fileName){
 
    	
    	
    	/*
    	 * Open the file given as parameters 
    	 * Tokenize the input on the basis of \newline
    	 * if string has more tokens and doesn't repeats or is already is there in WordList
    	 * 		Add to the WordList
    	 */
    	
        FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader br = null;
        List<String> wordList = new ArrayList<String>();
        
        try {
            fis = new FileInputStream(fileName);
            dis = new DataInputStream(fis);
            br = new BufferedReader(new InputStreamReader(dis));
            String line = null;
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line, "\n");
                while(st.hasMoreTokens()){
                    String tmp = st.nextToken();
                    if(!wordList.contains(tmp)){
                        wordList.add(tmp);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{if(br != null) br.close();}catch(Exception ex){}
        }
        
        
        return wordList;
    }
}
