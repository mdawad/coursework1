package mainclass;
//Awad M00611053
public class Cylinder extends ThreeDShapes {
    
    double Radius;
    double Height;

  
    public Cylinder(String name, double r, double h) {
        
        super(name, 0);
        Radius = r;
        Height = h;
        
    }

  
    @Override
    public double getSa() {
        double area = (2 * Math.PI * Radius)*(Height + Radius);
        return area;
    }

    /**
     *
     * @return
     */
    @Override
    public double getVolume() {
      double volume = (Math.PI * Radius * Radius * Height);
        return volume;
    }
    
}
