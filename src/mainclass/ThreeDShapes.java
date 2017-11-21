
package mainclass;

//Awad M00611053

public abstract class ThreeDShapes extends Shape{
   
    public ThreeDShapes(String name, int noOfSides)
    {
        super(name, noOfSides);
    }
    
  
    public abstract double getSa();

    public abstract double getVolume();
    
}
