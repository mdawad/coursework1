package mainclass;

public class Cylinder extends ThreeDShapes {
    
    double Radius;
    double Height;

   
    public Cylinder(String name, double r, double h) {
        
        super(name);
        Radius = r;
        Height = h;
        
    }

  
    public double getSa() {
        double area = (2 * 3.14 * Radius)*(Height + Radius);
        return area;
    }

    @Override
    public double getVolume() {
      double volume = 3.14 * Radius * Radius * Height;
        return volume;
    }
    
}
