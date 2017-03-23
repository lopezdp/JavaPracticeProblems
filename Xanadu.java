/*
 * Copyright (C) David P. Lopez - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited. 
 * Proprietary & Confidential
 * Written by: Lopez <DavidPLopez@Live.com>
 */
package xanadutest;

import java.io.*;


/**
 *
 * @author David P. Lopez
 */
public class Xanadu {
    
    // Data field to hold file and char to find in txt
    private FileReader file;
    private char find;
    
    // Constructor
    public Xanadu(String path, char c) throws IOException{
        // Initialize object with new file from path and char to find
        this.file = new FileReader(path);
        this.find = c;
    }
    
    // Define method to read and count chars to find
    /**
     * readChars()
     * reads file to buffer
     * builds string to find chars
     * @return String
     * @throws IOException 
     */
    public String readInputToString() throws IOException{
        // Declare string to hold chars to read
        String str;
        
        try(BufferedReader buffer = new BufferedReader(this.file)){
            StringBuilder strIn = new StringBuilder();
            String line = buffer.readLine();
            
            while(line != null){
                // Append line to str
                strIn.append(line);
                // Append \n or \r\n to line depending on UNIX or Windows
                strIn.append(System.lineSeparator());
                // Read the next line of input from buffer 
                // through next line separator
                line = buffer.readLine();
            }
            
            // Initialize str with contents of StringBuilder
            str = strIn.toString();  
        }
        // Output the String to read
        return str;
    }
    
    
    
    
}
