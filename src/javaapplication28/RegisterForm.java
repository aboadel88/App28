/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author mahmoud
 * enum
 */

enum Gnder {Male,fmale};
enum Course {Datebase,Programmierung,Math,ERP};
enum Semester {Summer,Winter,Fall,Spring};

public class RegisterForm {
    String stdName;
    Gnder stdgender;
    Course crs;
    Semester sem;

    public RegisterForm() {
        stdName = "No Name";
        stdgender = Gnder.fmale;
        crs = Course.Math;
        sem = Semester.Summer;
    }
    
    
    
}
