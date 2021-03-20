/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelmartinez.proyectogithub;

import java.io.PrintWriter;

/**
 *
 * @author Rafael Martinez
 */
class Cone extends ThreeDimensionalShape{
    //instance variable radius and height.
    double radius;
    double height;

    public Cone() 
    {
    }

    
    /**
     * The default constructor which takes radius and height. 
     */
    public Cone(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }
     
    
    /**
     * This constructor is also carries radius and height.
     */ 
    public Cone(Cone con)
    {
         this.radius = con.radius;
         this.height = con.height;
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

        return (Math.PI * (this.radius * this.radius) * this.height) / 3;
    }

    
    /**
     * This is an overridden method which gets the volume.
     */
    @Override
    public double getVolume() 
    {

        return (Math.PI * (this.radius)) * (this.radius  + Math.sqrt( ( this.radius * this.radius) + (this.height * this.height)));
        
    }

    
    
    /**
     * This is a printwriteout overridden method which prints the Cone object.
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Radius  = " + this.getRadius()+ "\r\n");
        out.write("\n Height  = " + this.getHeight()+ "\r\n");
        out.write("\n  Surface  Area = " + this.getVolume() + "\r\n");
        out.write("\n  Volume  = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n\n\n");
    }
     
}