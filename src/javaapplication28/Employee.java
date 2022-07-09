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
public class Employee {
    
    private int empId ;
    private String name;
    private String depart;
    double salary,bonus;
    private boolean resident;
    
    public Employee ()
    {
        empId = 1;
        name="sad";
        depart="manager";
        salary = 5000;
        bonus = 2000;
        resident = true;
        
    }
    public Employee (int i,String n )
    {
        empId = i;
        name = n;
    }
    public Employee (int i,String n, boolean r )
    {
//        empId = i;
//        name = n;
        this(i,n);
        resident = r;
    }
    public Employee (int i,String n,String d, double s, double b ,boolean r )
    {
//        empId = i;
//        name = n;
        this(i,n,r);
        depart=d;
        salary =s;
        bonus = b;
        //resident = r;
        
    }
    
    public void setSalary(double s)
    {
        salary = s;
    }
     public void setSalary(double s, double b)
    {
        //salary = s;
       this.setSalary(s);
        bonus = b;
    }

    public double getSalary() {
        return salary;
    }
     
     
    public void setDepart(String d)
    {
        depart = d;
    }
    public void empId(int i)
    {
        empId = i;
    }
   public void printEmpData()
    {
        System.out.println(" empId " +empId );
        System.out.println( "name " + name);
        System.out.println("depart " + depart);
        System.out.println("salary " + salary);
        System.out.println("bonus " + bonus);
        System.out.println("resident " + resident);
    }
}
