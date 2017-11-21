package mainclass;
//Awad M00611053

/**
 *
 * @author M00611053
 */
public class Circle extends TwoD {


     
    double Radius;

  
    public Circle(String name, double r) {
        super(name,0);
        Radius = r;
    }

 
    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\t I'm a circle too");
    }
  
    @Override
     public double getArea() {
        
        return Math.PI * Math.pow(Radius, 2);
    }

  
    @Override
    public double getPerimeter() {
       return Math.PI * (Radius * 2);
    }
}
