/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

// Awad M00611053

/**
 *
 * @author M00611053
 */
public class Sphere extends ThreeDShapes{
    
        double Radius;
    
    /**
     *
     * @param name
     * @param radius
     */
    public Sphere(String name, double radius) {
        super(name);
        this.Radius = radius;
    }

    /**
     *
     * @return
     */
    @Override
    public double getSa() {
        double area = 4 * 3.14 * Radius * Radius;
        return area;
    }

    /**
     *
     * @return
     */
    @Override
    public double getVolume() {
        double volume = 4 * 3.12 * Radius * Radius * Radius;
        return volume;
    }

     
    
}
