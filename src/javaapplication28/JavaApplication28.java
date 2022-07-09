
package javaapplication28;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* Rectangle r1 = new Rectangle();
        r1.setLength(18);
        r1.setWidth(15.9);
        System.out.println (r1.getLength());
        System.out.println (r1.getWidth()); 
        System.out.println (r1.getArea());
        
        Rectangle r2 = new Rectangle(50,70);
         System.out.println (r2.getLength());
        System.out.println (r2.getWidth()); */
        
        
       /* Car c1 ;
        c1= new Car();
        System.out.println(c1.getMake());
        System.out.println(c1.getYearModel());
        
        Car c2 = new Car("Kia",2000);
        System.out.println(c2.getMake());
        System.out.println(c2.getYearModel());
       // c1.setMarke("BMW");
        //c1.setYearModel(1988);*/
       
       /*Employee e1 = new Employee();
       Employee e2 = new Employee(3,"abo adel");
        Employee e3 = new Employee(4,"sami",true);
        Employee e4 = new Employee(9,"ahmed","finanz",1200.50,200,false);
       
         //e1.printEmpData();
         e4.printEmpData();
         e4.setSalary(7000, 50);
         e4.printEmpData();*/
       
       /*Car c1= new Car();
       Car c2= new Car();
       Car c3= new Car();
       Car c4= new Car();
       Car c5= new Car();
       System.out.println(Car.get_no_of_objects());
       
       System.out.println(Calc.add(5, 7));
       System.out.println(Calc.multiply(5, 7));*/
       
       /*Rectangle room2 = new Rectangle();
       room2.modifyobjects(room2);
       System.out.println(room2.getLength());
       System.out.println(room2.getWidth());*/
       //Rectangle r1 = new Rectangle(10,50);
       //Rectangle r2 = new Rectangle(19,50);
       /*Rectangle r3 = r1.add(r2);
       System.out.println(r3.getLength());
       System.out.println(r3.getWidth());*/
       //System.out.println(r1.add(r2).getLength());
       //System.out.println(r1.add(r2).getWidth());
       
//     if(r1.isequal(r2))
//         System.out.println("The objects are equal ");
//     else
//         System.out.println("The objects are different ");


// copy inhalt das Object
//        Rectangle r3 = new Rectangle(r1);
//        System.out.println(r3.getLength());
//        System.out.println(r3.getWidth());

//    Student std1 = new Student("Ahmed",18,"riad","saudi",5,"IS",4.5);
//    System.out.println(std1.getName());
//    System.out.println(std1.getGPA());

//         Employees se1 = new Employees("mahmoud", 33 ,"berlin", "syrer" , 300 ,"manger ", "Engineer");
//        se1.print_all_details();

//        CD obj = new CD(150,"dsfsf","sdgfhdhjj");
//        obj.getItemPrice();
//        obj.display();
//        


//    Course c1 = Course.Datebase;
//    Course c2 = Course.Math;
//    
//    System.out.println(c1.toString());
//     System.out.println(c2.ordinal());
//     
//    System.out.println(c2.compareTo(c1));
//    System.out.println(c2.equals(c1));

//        int x= 10 , y=0;
//        
//       try
//       {
//           System.out.println(x/y);
//       }
//       catch(ArithmeticException e)
//       {
//           System.out.println("Error , Division by Zero not Allowed");
//       }
//       System.out.println("The Programm Continues ") ;

//        int x , y ;
//        Scanner input = new Scanner(System.in);
//        try
//        {
//            System.out.println("Enter x ") ;
//            x=input.nextInt();
//            
//              System.out.println("Enter y ") ;
//            y=input.nextInt();
//            
//            System.out.println(x/y);
//        }
//        catch(ArithmeticException e)
//        {
//              System.out.println("Error , Division by Zero not Allowed");
//        }
//        catch(InputMismatchException e)
//        {
//            System.out.println("Error , must number please Enter Numeric value ");
//        }
//        
//         catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
        ArrayList<String> list = new ArrayList<String> ();
        list.add("Ahmed");
        list.add("Mohamed");
        list.add("Ali");
        
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(2));
        
        list.add(1, "Saad");
        
        list.set(3, "Turky");
        list.remove(2);


     }
    
}
