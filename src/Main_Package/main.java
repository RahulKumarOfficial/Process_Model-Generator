
/* This section is the backbone of the Project as it connects to other Java Classes
 * and performs other useful tasks
 * such as
 * Assigning of letters 
 * calling System functions and so on
 */
package Main_Package;

import java.io.*;
import java.util.List;


import org.deckfour.xes.in.XesXmlParser;
import org.deckfour.xes.model.XLog;

public class main {

	public static void main(String XESfilename) throws IOException {
		
		//-----------------------------------------------------------------------------

		/*
		 * STEP 1: XES parse
		 * We use the XES parser to parse the File and Extract just the Activity Name from each of the Event traces.
		 * The format of the Event log should be of filename.xes format.
		 * If not given, the Output console will print "Event log is not up to correct format."
		 * The function parse internally creates a file ParsedResult.txt that contains all the Activity Names.
		 */
		
		String filename = XESfilename;
		XesXmlParser parser = new XesXmlParser();
		if (parser.canParse(new File(filename))) {
			try {
				List<XLog> logs = parser.parse(new File(XESfilename));
				XesLogParse x = new XesLogParse(logs.get(0));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			System.out.println("Event log is not up to correct format");
		
		//-----------------------------------------------------------------------------

		
		/*
		 * STEP 2: Activity name extraction
		 * We use class TokenAppend.java, to take each Activity name at a time and assign them to Buffer.
		 * This Buffer UniqueKeyBuf contains Unique Activities.
		 */
		
		TokenAppend distFw = new TokenAppend();
		List<String> wordList = distFw.getDistinctWordList("./ParsedResult.txt");
		String[] UniqueKeyBuf = wordList.toArray(new String[0]);
		
		//-----------------------------------------------------------------------------

		
		/*
		 * STEP 3: Giving all Activity names (Original) to a file ParsedResult.txt .
		 * We create an object trace from class TraceGenerator.java
		 * The function alignData(Parsed_File,Unique_Buffer_File) matches each of the Unique Activity 
		 * with the Real Parsed File
		 * and Assigns unique Letters in the IntermediateOutput.txt
		 */
		
		TraceGenerator trace = new TraceGenerator();
		String ParsedResultFile = "./ParsedResult.txt";
		trace.alignData(ParsedResultFile, UniqueKeyBuf);
		
		//-----------------------------------------------------------------------------
		
		/*
		 * STEP 4: Taking up unique sequences.
		 * Open the file UniqueBuffer
		 * for each str in Unique_Key_Buffer
		 * 		if str doesn't equals to Flag(Activity) [which separates two traces]
		 * 		append str in UniqueKeyBuffer
		 */
		
		File file = new File("./UniqueBuffer");
		FileWriter uniqueBufferWriter = new FileWriter(file);
		for (String str : UniqueKeyBuf) {
			if (!str.equals("***Activity***"))
				uniqueBufferWriter.append(str + "\n");
		}
		
		//-----------------------------------------------------------------------------

		
		/*
		 * STEP 5: Assigning characters to Unique Sequences
		 * Open the file UniqueCharWriter
		 * for each str in Unique_Key_Buffer
		 * 		if str doesn't equals to Flag(Activity)
		 * 		Assign characters to each of the str and append it in file
		 */
		
		FileWriter UniqueCharWriter = new FileWriter(new File("./AssignedChars.txt"));
		int i = 0,j=0;
		char charArr = 'A';
		for (String str : UniqueKeyBuf) {
			if (!str.equals("***Activity***"))
				UniqueCharWriter.append((charArr++) + "\n");
		}
		UniqueCharWriter.close();
		uniqueBufferWriter.close();
		
		//-----------------------------------------------------------------------------

		
		/*
		 * STEP 6: Printing out all Non-aligned Sequences
		 * Read the file IntermediateOutput.txt obtained from class TraceGenerator.java
		 * Read each line till end
		 * 		add line to the string
		 * 		add new line
		 * Assign the complete string to an array str[]
		 * Print the Non-Aligned Sequences
		 */

		int flag = 0;
		filename = "./IntermediateOutput.txt";
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String stringBuilder = new String();
		String line = null;
		String ls = "\n";
		while ((line = reader.readLine()) != null) {
			stringBuilder += line;
			stringBuilder += ls;
		}
		String[] str = stringBuilder.split(ls);
		reader.close();
		for(i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		//-----------------------------------------------------------------------------

		
		/*
		 * STEP 7: Dynamic Programming (Computation of LCS)
		 * Initialize two dimensional array to form a matrix
		 * Take each string in pairwise manner
		 * Convert each pair of string into Its respective character array and take length
		 * Call the function lcs( charArray[String1], charArray[String2], length_of_String1, length_of_String2 )
		 * Store the returned value to matrix elements
		 */
		
		int[][] arr = new int[str.length][str.length];

		for (i = 0; i < str.length; i++) {
			for (j = i + 1; j < str.length; j++) {
				LongestCommonSubsequence lcs = new LongestCommonSubsequence();
				String s1 = str[i];
				String s2 = str[j];

				char[] X = s1.toCharArray();
				char[] Y = s2.toCharArray();
				int m = X.length;
				int n = Y.length;
				if (m <= 1 || n <= 1) {
					flag = 1;
				}
				arr[i][j] = lcs.lcs(X, Y, m, n);
			}
		}
		
		//-----------------------------------------------------------------------------

		
		/*
		 * STEP 8: Print out Similarity Matrix
		 * The array obtained above is the Similarity Matrix
		 * Print each value 
		 */
		
		System.out.println("\n\nSimilarity matrix");
		for (i = 0; i < str.length; i++) {
			System.out.println();
			for (j = 0; j < str.length; j++) {
				System.out.print("\t"+arr[i][j]);
			}
		}
		
		//-----------------------------------------------------------------------------

		
		/*
		 * STEP 9: Aligning the Sequences
		 * Open the file OutputFile.txt in write mode
		 * Check iteratively for maximum values in Similarity Matrix
		 * 		if found , find the position of both the string whose LCS is highest
		 * 		assign infinity value (-99 in this case) to avoid appear of this max value again in matrix
		 * 		Call the function getMinimumPenalty(String 1, String 2, Penalty_For_Gap, Penalty_For_Mismatch);
		 * 		Store the returned value to score
		 * 		Take this score[1] and Pass it as String 1 in getMinimumPenalty(String 1, String 2, Penalty_For_Gap, Penalty_For_Mismatch);
		 * 		Repeat till arr value remains -99
		 */
		String[] score;
		int max = 0, x = 0, y = 0;
		System.out.println();
		int len = str.length;
		int lcount = 0;
		String first = null;
		int count = 0;
		FileWriter fileWriter = new FileWriter("./OutputFile.txt");
		for (int k = 0; k < len; k++) {
			max = 0;
			for (i = 0; i < len; i++) {
				for (j = 0; j < len; j++) {
					if (max < arr[i][j] && arr[i][j] != 99) {
						max = arr[i][j];
						x = i;
						y = j;
					}
				}
			}
			arr[x][y] = -99;
			if (count == 0) {
				score = Alignment.getMinimumPenalty(str[y], str[x], 3, 4);
				first = str[x];
				fileWriter.write(score[0] + "\n" + score[1]);
				count++;
			} else {
				score = Alignment.getMinimumPenalty(str[y], first, 3, 4);
				++lcount;
				if (lcount < len - 1) {
					fileWriter.write("\n" + score[0]);
				}
			}
		}
		fileWriter.close();
		
		//-----------------------------------------------------------------------------

		
		/*
		 * STEP 10: Check for complete Alignment
		 * If any of the String is not completely aligned
		 * Align by introducing gaps before sending the array to the Weblogo Library
		 */
		filename = "./OutputFile.txt";
		fileWriter = new FileWriter("./OutputFileRefined.txt");
		fileWriter.write("");
		reader = new BufferedReader(new FileReader(filename));
		stringBuilder = new String();

		ls = "\n";
		while ((line = reader.readLine()) != null) {
			stringBuilder += line;
			stringBuilder += ls;
		}
		str = stringBuilder.split(ls);
		max = 0;
		for (i = 0; i < str.length; i++) {
			if (max < str[i].length())
				max = str[i].length();
		}
		String[] str2 = new String[str.length];
		System.out.println(max);
		for (i = 0; i < str.length; i++) {
			str2[i] = str[i];
			if (max != str[i].length()) {
				for (j = 0; j < (max - str[i].length()); j++) {
					str2[i] += '-';
				}
				System.out.println(str2[i]);
				fileWriter.append(str2[i] + "\n");
			} else {
				System.out.println(str2[i]);
				fileWriter.append(str2[i] + "\n");
			}
		}
		fileWriter.close();
		reader.close();
		
		//-----------------------------------------------------------------------------

		
		/*
		 * STEP 11: Check for Event log quality and estimate the machine's performance
		 * If the String ever contains just single activity
		 * This would mean that Machine or any other Real world object is not working properly
		 */
		
		if (flag == 1) {
			System.out.println("\n\nWarning: This event log contains single activities "
					+ "\nSource of this event log (Any machine of PAIS) is at the risk of Fault");
		} else {
			System.out.println("\n\nSource of this event log (PAIS) is in OK condition");
		}
		
		
		//-----------------------------------------------------------------------------

		/*
		 * STEP 12: Call for Python which in turn calls Weblogo Framework
		 */
		PythonCall pc = new PythonCall();
		pc.LogoMaker();

	}
}