
package mainclass;
//Awad M00611053

public abstract class TwoD extends Shape {

    public TwoD (String name, int noOfSides) 
    {
          super(name, noOfSides);
    }
  
    public abstract double getArea();


    public abstract double getPerimeter();
}
        
   