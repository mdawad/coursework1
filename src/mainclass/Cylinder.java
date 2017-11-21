package mainclass;

/**
 *
 * @author M00611053
 */
public class Cylinder extends ThreeDShapes {
    
    double Radius;
    double Height;

    /**
     *
     * @param name
     * @param r
     * @param h
     */
    public Cylinder(String name, double r, double h) {
        
        super(name);
        Radius = r;
        Height = h;
        
    }

  
    public double getSa() {
        double area = (2 * 3.14 * Radius)*(Height + Radius);
        return area;
    }

    /**
     *
     * @return
     */
    @Override
    public double getVolume() {
      double volume = 3.14 * Radius * Radius * Height;
        return volume;
    }
    
}
