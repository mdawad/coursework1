package mainclass;
   //Awad M00611053

/**
 *
 * @author M00611053
 */
public class Rectangle extends TwoD{

        double length;
        double breadth;

    /**
     *
     * @param name
     * @param l
     * @param b
     */
    public Rectangle(String name, double l, double b) {
        super(name,4);
        length = l;
        breadth = b;
    }

 
    @Override
        public void displayDescription() {
    super.displayDescription();
    System.out.println("\t I'm a rectangle too");
}

 
        @Override
    public double getArea() {
        double area = length * breadth;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (length + breadth)*2;
        return perimeter;       
    }
}

