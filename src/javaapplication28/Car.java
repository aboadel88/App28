/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author mahmoud
 */
public class Car {
    private String make;
    private int yearModel;
    private static int no_of_object;
    public Car ()
    {
        make = "HONDA" ;
        yearModel= 2015 ;
        no_of_object++;
    }
    
    public Car(String m , int y)
    {
        make = m;
        yearModel = y;
        no_of_object++;
    }
    
    public static int get_no_of_objects()
    {
        return no_of_object;
    }
    
    public void setMarke(String m){
        if(m == "BMW" || m == "Honda"  || m == "Merceds")  
          make = m ;
        else
            System.out.println("Invalid Model");
        
    }
    
    public void setYearModel(int y){
        if(y>1980) 
         yearModel = y ;
        else
           System.out.println("Invalid Year");

    }
    
    public String getMake(){
        return make;
    }
    public int getYearModel(){
        return yearModel ;
    }
}
