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
public class Salaried_Employee extends Employees {
    
    private double bonuss;
    private double deduction;

    public Salaried_Employee() {
    }

    public Salaried_Employee(double bonuss, double deduction, String mahmoud, int i, String berlin, String syrer, int i0) {
        super(mahmoud, i, berlin, syrer, i0);
        this.bonuss = bonuss;
        this.deduction = deduction;
    }

 

    

        
    @Override
    public double getSalary()
    {
        return salary + bonuss - deduction ;
    }
    
    
}
