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
public class CD implements ReailItem , Displayable {
    double price;
    String titel;
    String artist;

    public CD() {
    }

    public CD(double price, String titel, String artist) {
        this.price = price;
        this.titel = titel;
        this.artist = artist;
    }
    public double getItemPrice()
    {
        return price;
    }
    
    public void display()
    {
        System.out.print("Store = "+ storname + "Price is " + price + "/n titel" + titel + "/n name " + artist );
    }
    
}
