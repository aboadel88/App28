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
public class Person {
    private String name;
    private double age;
    private String address;
    private String natinality;
    
    public Person()
    {
        
    }
    public Person(String n,double a,String ad, String nat)
    {
      name = n;
      age = a;
      address = ad;
      natinality= nat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNatinality() {
        return natinality;
    }

    public void setNatinality(String natinality) {
        this.natinality = natinality;
    }
    
    public void print_all_details()
    {
        System.out.println("Name = " + name + "/n Age = "+ age + "/n natinality = " + natinality +"/n Address = " + address);
    }
    
}
