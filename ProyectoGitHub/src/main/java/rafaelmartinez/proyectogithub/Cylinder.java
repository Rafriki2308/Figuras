/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelmartinez.proyectogithub;

import java.io.PrintWriter;

/**
 *
 * @author rafae
 */
class Cylinder extends ThreeDimensionalShape{
    //instance variable radius and height 
    double radius , height;

    public Cylinder() {
    }

    
    /**
     * This is a default constructor which takes radius and height. 
     */
    public Cylinder(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }

    
   
    /**
     * This constructor is also carries radius and height.
     */
    public Cylinder(Cylinder cyl)
    {
        this.radius = cyl.radius;
        this.height = cyl.height;
    }

    
    /**
     * It gets the value of radius.
     * @return the value of radius.
     */
    public double getRadius() 
    {
        return radius;
    }

    
    /**
     * It sets the value of height.
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * It gets the value of height.
     * @return the value of height.
     */
    public double getHeight() 
    {
        return height;
    }

    
    /**
     * It sets the value of height.
     */
    public void setHeight(double height) 
    {
        this.height = height;
    }

    
    
    /**
     * This is an overridden method which gets the surface area.
     */
    @Override
    public double getSurfaceArea() 
    {
        return 2 * Math.PI * this.radius * this.height;
    }

    
    
    
    /**
     * This is an overridden method which gets the volume.
     */
    @Override
    public double getVolume() 
    {
        return  Math.PI * this.radius * this.radius * this.height;
    }

    
    
    
    /**
     * This is a printwriteout overridden method which prints the Cylinder object.
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Height = " + this.getHeight()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");;
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
    
    
}

