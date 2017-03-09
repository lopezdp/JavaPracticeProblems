/*
 * Copyright (C) David P. Lopez - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited. 
 * Proprietary & Confidential
 * Written by: Lopez <DavidPLopez@Live.com>
 */
package time.pkg3.pkg7.pkg17;

/**
 *
 * @author David Lopez Time Class
 * 
 */
public class Time3717 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Time t1 = new Time(Time.validateInputVariableMS(1),Time.validateInputVariableMS(2),Time.validateInputVariableHr(3));
        System.out.println(t1);
        
        Time t2 = new Time();
        System.out.println(t2);
        
        t1.setHour(Time.validateInputVariableHr(4));
        t1.setMinute(Time.validateInputVariableMS(5));
        t1.setSecond(Time.validateInputVariableMS(6));
        System.out.println(t1);
        
        System.out.println("Hour is: " + t1.getHour());
        System.out.println("Minute is: " + t1.getMinute());
        System.out.println("Second is: " + t1.getSecond());
        
        t1.setTime(Time.validateInputVariableMS(58), Time.validateInputVariableMS(59),Time.validateInputVariableHr(23));
        System.out.println(t1);
        
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
        
    }
    
}
