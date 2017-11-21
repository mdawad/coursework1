/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

//Awad M00611053
public abstract class ThreeDShapes extends Shape{
    
   
    public ThreeDShapes(String name)
    {
        super(name);
    }
    
    public abstract double getSa();
    public abstract double getVolume();
    
}
