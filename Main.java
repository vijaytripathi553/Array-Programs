package com.array_interview.programs;

/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {
    public static int process(String str) {
    	
    	String s1[]=new String[str.length()];
    	
    	//for(int i=)
    	
    	
  
        return 0;
    }

    public static void main (String[] args) {
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            String line = in.nextLine().trim();
            int retVal = process(line);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
