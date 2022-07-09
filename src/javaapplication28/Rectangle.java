
package javaapplication28;

public class Rectangle {
    private double length ;
    private double width ;
    
    public Rectangle ()
    {
        length = 10;
        width = 15;
        System.out.println("a new room created with 10 m length and 15 width ");
    }
    //constuctor overloading
    public Rectangle(double l,double w)
    {
        length = l;
        width = w;
    }
    
    public void setLength(double length){
        if(length>0)     
            this.length = length;
        else
            System.out.println("The Length sould positiv");
        
    }   
    //passing object 
    public void modifyobjects (Rectangle r)
    {
        r.length=67;
        r.width=98;
    }
    
    // Returning Objects From Methods 
    public Rectangle add (Rectangle room2)
    {
        Rectangle result = new Rectangle();
        result.length = this.length + room2.length;
        result.width = this.width + room2.width;
        return result;
        
    }
    
    public void setWidth(double width){
        if(width>0)     
            this.width = width;
        else
            System.out.println("The Length sould positiv");
        
    }
    
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    
    public double getArea(){
        
      return length * width;
      

    }
    
    //comparing 2 Object 
    public boolean isequal(Rectangle obj2)
    {
        if(this.length == obj2.length && this.width == obj2.width)
            return true;
        else 
            return false;
    }
   // copy object , copy constructor
    public Rectangle(Rectangle sourceobject)
    {
        length = sourceobject.length;
        width = sourceobject.width;
    }
            
}

