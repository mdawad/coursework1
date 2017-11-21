
package mainclass;

//Awad M00611053
public class Triangle extends TwoD{
 
       double side1;
       double side2;
       double side3;
       
  
    public Triangle(String name, double s1, double s2, double s3) {
        super(name, 3);
       side1 = s1;
       side2 = s2;
       side3 = s3;
    }
  
  
       @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\t I'm a triangle");
    }

 
    @Override
    public double getArea(){
    
    double x = (side1+side2+side3)/2;
    double area =Math.pow((x*(x-side1)*(x-side2)*(x-side3)), 0.5);
    return area;
    }
    
  
    @Override
    public double getPerimeter() {
    
    double perimeter = side1+side2+side3;
    return perimeter;
    }
}
