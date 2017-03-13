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
public class Student {
    private String name;
    private double gpa;
    
    //constructor
    Student(){
        
    }
    
    public String getName(){
        return name;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
