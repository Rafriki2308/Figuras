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
class Point 
{
    // Instance Variables x and y representing coordinates which are double.
    private double x ;
    private double y;

    /**
     * The default constructor which sets the x and the y coordinates. 
     */
    public Point() 
    {
        this.x = 0.0;
        this.y = 0.0 ;
    }

    
    /**
     * This is a constructor which takes two doubles and initializes x and the y.
     */
    public Point(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    
    
     /**
     * This constructor takes a Point object as parameter.
     * It creates a new Point object.
     */
    public Point(Point pnt)
    {
        this.x = pnt.x;
        this.y = pnt.y;
    }
    
   
     /**
     * It gets a value of x. 
     * @return the value of y.
     */
    public double getX() 
    {
        return x;
    }
    
    
     /**
     * Sets a value of x.
     */
    public void setX(double x) 
    {
        this.x = x;
    }
    
    
    /**
     * It gets a value of y. 
     * @return the value of y.
     */
    public double getY() 
    {
        return y;
    }
    
    
     /**
     * Sets a value of y.
     */
    public void setY(double y) 
    {
        this.y = y;
    }
    
    
    /**
     * This is a distance method which returns the distance between this Point and another point.
     * it takes point object as its parameter.
     * through the parameter it calculate the length of line.
     */
    public double  distance(Point p)
    {
        return Math.sqrt( ((this.x - p.x)  * (this.x - p.x))  + ((this.y - p.y)  * (this.y - p.y)));
  
    }
    
    
    /**
     * This is PrintWriter out method whic prints the point in the x and the y to output file.
     */
    public void print(PrintWriter out)
    {
        
        out.write("\n Point Data => ");
        out.write("\nPrint Data = x = " + x + " y = " + y);
        out.write("\n\n\n");;
    }
    
    
}
