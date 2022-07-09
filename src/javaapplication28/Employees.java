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
public class Employees extends Person {
    
    double salary;
    String rank;
    String job ;

    public Employees() {
    }

    public Employees( String n, double a, String ad, String nat,double salary, String rank, String job) {
        super(n, a, ad, nat);
        this.salary = salary;
        this.rank = rank;
        this.job = job;
    }

    Employees(String mahmoud, int i, String berlin, String syrer, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    @Override
    public void print_all_details()
    {
        super.print_all_details();
        System.out.println("Job = " + job + "/n rank = "+ rank + "/n salary = " + salary );
    }
    
}
