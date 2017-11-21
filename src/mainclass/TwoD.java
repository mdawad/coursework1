
package mainclass;
//Awad M00611053

/**
 *
 * @author M00611053
 */
public abstract class TwoD extends Shape {

    /**
     *
     * @param name
     */
    public TwoD (String name) 
    {
          super(name);
    }
    
    /**
     *
     * @return
     */
    public abstract double getArea();

    /**
     *
     * @return
     */
    public abstract double getPerimeter();

    void displayDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    

   
    }
        
   
