package mainclass;
//Awad M00611053

/**
 *
 * @author M00611053
 */
public class Circle extends TwoD {


     
    double Radius;

    /**
     *
     * @param name
     * @param r
     */
    public Circle(String name, double r) {
        super(name);
        Radius = r;
    }

    /**
     *
     */
    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\t I'm a circle too");
    }
    
    /**
     *
     * @return
     */
    @Override
     public double getArea() {
        
        return Math.PI * Math.pow(Radius, 2);
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimeter() {
       return Math.PI * (Radius * 2);
    }
}
