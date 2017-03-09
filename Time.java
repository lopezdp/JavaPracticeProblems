/*
 * Copyright (C) David P. Lopez - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited. 
 * Proprietary & Confidential
 * Written by: Lopez <DavidPLopez@Live.com>
 */
package time.pkg3.pkg7.pkg17;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyDocs
 */
public class Time {
    //Private Variables
    private int second, minute, hour;
    
    //Constructors

    /**
     *
     * @param second
     * @param minute
     * @param hour
     */
        public Time(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    
    //Default Constructors

    /**
     * @constructor
     */
        public Time(){
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }
    
    //Public Getters & Setters for Private variables

    /**
     *
     * @return
     */
        public int getSecond(){
        return this.second;
    }

    /**
     *
     * @return
     */
    public int getMinute(){
        return this.minute;
    }

    /**
     *
     * @return
     */
    public int getHour(){
        return this.hour;
    }

    /**
     *
     * @param second
     */
    public void setSecond(int second){
        this.second = second;
    }

    /**
     *
     * @param minute
     */
    public void setMinute(int minute){
        this.minute = minute;
    }

    /**
     *
     * @param hour
     */
    public void setHour(int hour){
        this.hour = hour;
    }
    
    /* Input Validation: 
     * Decided to create a static method based on reading
     * and because I wanted to use the same class method before an object was 
     * even instantiated because I wanted to test input when a new object is
     * being created.    
     */

    /**
     *
     * @param in
     * @return
     */
    
    public static int validateInputVariableMS(int in){
        if(in >= 0 && in <= 60){
            return in;
        } else
        {
            try {
                throw new java.lang.Exception("Please enter an integer between 0 & 60");
            } catch (Exception ex) {
                Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
            }
            return -1;
        }
    }
    
    /**
     *
     * @param in
     * @return
     */
    public static int validateInputVariableHr(int in){
        if(in >= 0 && in <= 24){
            return in;
        } else
        {
            try {
                throw new java.lang.Exception("Please enter an integer between 0 & 24");
            } catch (Exception ex) {
                Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
            }
            return -1;
        }
    }
    
    //Output Results Method
    //Why does it tell me to add the @Override Method?????
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    /**
     *
     * @param second
     * @param minute
     * @param hour
     */
    public void setTime(int second, int minute, int hour){
        //No input validation
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    
    /**
     *
     * @return
     */
    public Time nextSecond(){
        ++second;
        if(second >= 60){
            second = 0;
            ++minute;
            if(minute >= 60){
                minute = 0;
                ++hour;
                if(hour >= 24){
                    hour = 0;
                }
            }
        }
        return this;
    }
}
