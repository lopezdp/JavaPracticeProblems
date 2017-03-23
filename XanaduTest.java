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
 * @author MyDocs
 */
public class XanaduTest {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String path = "/Users/MyDocs/NetBeansProjects/XanaduTest/src/xanadutest/Xanadu.txt";
        
        Xanadu xany = new Xanadu(path, 'c');
        System.out.println(" string: " + xany.readInputToString());
        
    }
    
}
