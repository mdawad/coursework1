/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

// Awad M00611053


public class Sphere extends ThreeDShapes{
    
        double Radius;
    
 
    public Sphere(String name, double radius) {
        super(name, 0);
        this.Radius = radius;
    }

  
    @Override
    public double getSa() {
        double area = (4 * Math.PI * Radius * Radius);
        return area;
    }

    @Override
    public double getVolume() {
        double volume = ((4/3 )* Math.PI * Radius * Radius * Radius);
        return volume;
    }

     
    
}
