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
public class Salaried_Employee_Abstract extends Employeeabstract {
    
    double bonus;
    double deduction;

    public Salaried_Employee_Abstract() {
    }

    public Salaried_Employee_Abstract( String name, double age, double salary, String rank, String job,double bonus, double deduction) {
        super(name, age, salary, rank, job);
        this.bonus = bonus;
        this.deduction = deduction;
    }
    
    @Override
    public double get_salary()
    {
        return salary + bonus - deduction ;
    }
}
