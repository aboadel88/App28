/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author mahmoud
 * Abstract class 
 */
public abstract class Employeeabstract {
    String name;
    double age;
    double salary;
    String rank;
    String job;

    public Employeeabstract() {
    }

    public Employeeabstract(String name, double age, double salary, String rank, String job) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.rank = rank;
        this.job = job;
    }
    public abstract double get_salary();

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    
    
}
