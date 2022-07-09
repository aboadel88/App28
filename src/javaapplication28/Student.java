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
public class Student extends Person {
    private int study_level;
    private String specialization;
    private double GPA;

    public Student() 
    {
    }

    public Student(String n, double a, String ad, String nat ,int study_level, String specialization, double GPA )
    {
        super(n, a, ad, nat);
        this.study_level = study_level;
        this.specialization = specialization;
        this.GPA = GPA;
    }

    public int getStudy_level() {
        return study_level;
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    
    
}
