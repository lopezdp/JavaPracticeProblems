/*
 * Copyright (C) David P. Lopez - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited. 
 * Proprietary & Confidential
 * Written by: Lopez <DavidPLopez@Live.com>
 */
package xanadutest;
import java.io.*;
import java.util.Scanner;

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
        String inputPath = "/Users/MyDocs/NetBeansProjects/XanaduTest/src/xanadutest/Xanadu.txt";
        Scanner filePath = new Scanner(System.in);
        System.out.println("What is the path to your text file?: ");
        String path = filePath.nextLine();
        if(path != inputPath){
            path = "/Users/MyDocs/NetBeansProjects/XanaduTest/src/xanadutest/Xanadu.txt";
        }
        
                
                
        
        Scanner in = new Scanner(System.in);
        System.out.println("What char do you want to count?: ");
        char[] c = in.nextLine().toCharArray();
        
        String read;
        
        Xanadu xany = new Xanadu(path, c[0]);
        read = xany.readInputToString();
        System.out.println("\nText to Search: \n" + read);
        System.out.println("Char to find: " + c[0] + "\n");
        
        int num = xany.countChar(read);
        System.out.println("Total count for char found: " + num);
        
    }
    
}
