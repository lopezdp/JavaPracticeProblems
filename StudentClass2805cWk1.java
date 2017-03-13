/*
 * Copyright (C) David P. Lopez - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited. 
 * Proprietary & Confidential
 * Written by: Lopez <DavidPLopez@Live.com>
 */
package studentclass2805cwk1;

/**
 *
 * @author David Lopez 2017
 */
public class StudentClass2805cWk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student1 = new Student();
        student1.setGpa(3.54);
        student1.setName("David");
        
        Student student2 = new Student();
        student2.setName("Whiskey Tango");
        student2.setGpa(2.02);
        
        System.out.println("The name of student1 is: " + student1.getName());
        System.out.println("The gpa of student1 is: " + student1.getGpa());
        
        System.out.println("The name of student2 is: " + student2.getName());
        System.out.println("The gpa of student2 is: " + student2.getGpa());  
        
        StudentAddress student3 = new StudentAddress("350 NE 54 St");
        student3.setName("Lucifer Fallen");
        student3.setGpa(3.04);
        
        System.out.println("The name of student3 is: " + student3.getName());
        System.out.println("The gpa of student3 is: " + student3.getGpa());
        System.out.println("The address of student3 is: " + student3.getAddress());
        
        
        
    }
}
