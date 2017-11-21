package mainclass;
   //Awad M00611053
public class Rectangle extends TwoD{

        double length;
        double breadth;
    public Rectangle(String name, double l, double b) {
        super(name);
        length = l;
        breadth = b;
    }
        @Override
        public void displayDescription() {
    super.displayDescription();
    System.out.println("\t I'm a rectangle too");
}
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

