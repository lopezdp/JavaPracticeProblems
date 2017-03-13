/*
 * Copyright (C) David P. Lopez - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited. 
 * Proprietary & Confidential
 * Written by: Lopez <DavidPLopez@Live.com>
 */
package studentclass2805cwk1;

/**
 *
 * @author MyDocs
 */
public class StudentAddress extends Student{
    private String address;
    
    //Default Constructor
    public StudentAddress(){
        
    }
    
    public StudentAddress(String address){
        this.address = address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return address;
    }
    
    
    
}




