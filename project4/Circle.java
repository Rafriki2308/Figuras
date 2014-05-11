
import java.io.PrintWriter;
/**
 * This is a circle class which is representing radius and center of circle. 
 * The center is a Point object.
 * 
 * @author  Pratik Patel
 * @version 1 Date: 04/27/2014
 */

public class Circle  extends TwoDimensionalShape{
    // Instance variable radius and center are declared.
    private double  radius ;
    private Point center;
    
    /**
     * The default constructor which takes a Point object and a double and sets the center and radius. 
     */
    public Circle( Point center,double radius)
    {
        this.radius = radius;
        this.center = center;
    }
    
    /**
     * The default constructor which takes a Circle and creates an copy. 
     */
    public Circle(Circle circle)
    {
        this.radius = circle.radius;
        this.center = circle.center;
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
     * It sets the value of Radius.
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    /**
     * It gets the Center of the circle.
     * @return the value of center.
     */
    public Point getCenter() 
    {
        return center;
    }

    
    /**
     * It sets the value of Center.
     */
    public void setCenter(Point center) 
    {
        this.center = center;
    }
    

    /**
     * This is a printwriteout overridden method which prints the Center, Radius, Area and Perimeter. 
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
	    out.write("\n Center = " + this.getCenter()+ "\r\n");
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");;
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n\n\n");
        
    }

    
 
    /**
     * This is an overridden method which gets the area of circle.
     */
    @Override
    public double getArea()
    { 
         return Math.PI * this.radius * this.radius ;      
    }
    
    

    /**
     * This is an overridden method which gets the Perimeter of the circle. 
     */
    @Override
    public double getPerimeter() 
    {
         return 2 * Math.PI * this.radius;
    }
    
    
}
    

