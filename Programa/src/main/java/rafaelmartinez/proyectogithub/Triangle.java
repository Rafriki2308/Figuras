
package rafaelmartinez.proyectogithub;

import java.io.PrintWriter;

/**
 *Clase que construye la figura geométrica triángulo. Contiene todo lo 
 *necesario para construir dicho triángulo.
 * 
 * @author Rafel Martinez
 */
class Triangle extends TwoDimensionalShape {

    //Declaracion de los puntos del triángulo que son de tipo Point.
    private Point point1, point2, point3;

    public Triangle() {
    }

    
    /**
     * * Constructor completo, que generará un triángulo. Como datos toma 
     * tres valores que serán de tipo Point, y se corresponderán tres puntos,
     * localizados en el espacio euclideo, que definiran el triángulo.
     * @param pt1 Dato tipo Point que define la posicion de un vértice.
     * @param py2 Dato tipo Point que define la posicion de un vértice.
     * @param py3 Dato tipo Point que define la posicion de un vértice.
     */
    public Triangle(Point pt1, Point py2, Point py3) 
    {
        this.point1 = pt1;
        this.point2 = py2;
        this.point3 = py3;
    }

    
    
    /**
     * Constructor que toma un objeto tipo triángulo y lo duplica. 
     * Genera un triángulo nuevo clonando los datos del triángulo
     * que le facilitamos.
     * @param t tipo Triangle del que tomamos los atributos.
     */
    public Triangle(Triangle t) 
    {
        this.point1 = t.point1;
        this.point2 = t.point2;
        this.point3 = t.point3;
    }

    
    
    /**
     * Método público que devuelve un valor tipo Point que se corresponde 
     * con la ubicacion en el espacio euclideo de uno de los vértices del 
     * triángulo.
     * @return Valor tipo Point corresponde al atributo point1.
     */
    public Point getPoint1() 
    {
        return point1;
    }

    /**
     * Método público que toma un valor tipo Point, que se corresponde 
     * con la ubicacion en el espacio euclideo de uno de los vértices del 
     * triángulo, y asigna dicho valor al atributo point1.
     * @param point1 Valor tipo Point que se asigna a point1.
     */
    public void setPoint1(Point point1) 
    {
        this.point1 = point1;
    }

    
    /**
     * Método público que devuelve un valor tipo Point que se corresponde 
     * con la ubicacion en el espacio euclideo de uno de los vértices del 
     * triángulo.
     * @return Valor tipo Point corresponde al atributo point2.
     */
    public Point getPoint2() 
    {
        return point2;
    }

    
    /**
     * Método público que toma un valor tipo Point, que se corresponde 
     * con la ubicacion en el espacio euclideo de uno de los vértices del 
     * triángulo, y asigna dicho valor al atributo point1.
     * @param point1 Valor tipo Point que se asigna a point2.
     */
    public void setPoint2(Point point2) 
    {
        this.point2 = point2;
    }

    
    
    /**
     * Método público que devuelve un valor tipo Point que se corresponde 
     * con la ubicacion en el espacio euclideo de uno de los vértices del 
     * triángulo.
     * @return Valor tipo Point corresponde al atributo point3.
     */
    public Point getPoint3()
    {
        return point3;
    }

    /**
     * Método público que toma un valor tipo Point, que se corresponde 
     * con la ubicacion en el espacio euclideo de uno de los vértices del 
     * triángulo, y asigna dicho valor al atributo point1.
     * @param point1 Valor tipo Point que se asigna a point3.
     */
    public void setPoint3(Point point3) 
    {
        this.point3 = point3;
    }

    
    /**
     * Método público implementado de la clase Shape. Este método
     * escribe todos los datos del triángulo en un archivo que nosotros
     * designamos.
     *
     * @param out Valor tipo PrintWriter. Archivo de salida de los datos.
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Traiangle Data => "+ "\r\n");
        out.write("\n Point 1 = " + this.point1.getX() + " , " + this.point1.getY()+ "\r\n");
        out.write("\n Point 2 = " + this.point2.getX() + " , " + this.point2.getY()+ "\r\n");
        out.write("\n Point 3 = " + this.point3.getX() + " , " + this.point3.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");   
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n\n\n");;
    }

    
    /**
     * Método público implementado de la clase TwoDimensionalShape. Este método
     * calcula y devuelve el valor del área del triángulo.
     *
     * @return Valor tipo double que se corresponde con el área del triángulo.
     */
    @Override
    public double getArea() 
    {

        double area;
        double perimeter = this.getPerimeter()/2;

        double a = this.point1.getX() + this.point1.getY();
        double b = this.point2.getX() + this.point2.getY();
        double c = this.point3.getX() + this.point3.getY();

        area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }

    /**
     * Método público implementado de la clase TwoDimensionalShape. Este método
     * calcula y devuelve el valor del perímetro del tríangulo, para ello
     * utiliza el metodo getX y getY, del método Point, que obtine la longitud
     * de la linea entre esos puntos.
     *
     * @return Valor tipo double que se corresponde con el perímetro del
     * rectángulo.
     */
    @Override
    public double getPerimeter() 
    {

        double sum =  0 ;
        sum +=  this.point1.getX() + this.point1.getY();
        sum += this.point2.getX() + this.point2.getY();
        sum += this.point3.getX() + this.point3.getY();
        return sum;

      
        
    }
}
