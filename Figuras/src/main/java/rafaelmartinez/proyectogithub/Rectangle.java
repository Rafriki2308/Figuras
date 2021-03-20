
package rafaelmartinez.proyectogithub;

import java.io.PrintWriter;

/**
 *Clase que construye la figura geométrica rectángulo. Contiene todo lo 
 *necesario para construir dicho rectángulo.
 * 
 * @author Rafel Martinez
 */
class Rectangle  extends TwoDimensionalShape{

     // Declaracion de atributos privados altura y longitud, ambos tipo double. 
    
     private double length;  
     private double width;   

    /**
     * Constructor completo, que generará un rectángulo. Como datos toma 
     * dos valores que serán de tipo double, y se corresponderán a ambos lados
     * del rectángulo.
     * @param length Valor tipo double que se corresponde con la longitud.
     * @param width Valor tipo double que se corresponde con la longitud.
     */
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
     
     
    /**
     * Constructor que toma un objeto tipo rectángulo y lo duplica. 
     * Genera un rectángulo nuevo clonando los datos del rectángulo
     * que le facilitamos.
     * @param rect Valor tipo Rectangle que utilizaremos para clonar.
     */
    public Rectangle(Rectangle rect)
    {
        this.length = rect.length;
        this.width = rect.width;
    }

    
    /**
     * Método público que devuelve el valor del atributo longitud, pues este es
     * privado.
     *
     * @return Devuelve el valor tipo double que corresponde al atributo 
     * length.
     */
    public double getLength() 
    {
        return length;
    }

    
    
    /**
     * Método público que toma un valor tipo double y establece el valor del 
     * atributo longitud, pues este es privado.
     *
     * @return Toma un valor tipo double y lo asigna al atributo lenght.
     */
    public void setHeight(double length) 
    {
        this.length = length;
    }
    
    

    /**
     * Método público que devuelve el valor del atributo altura, pues este es
     * privado.
     *
     * @return Devuelve el valor tipo double que corresponde al atributo 
     * width.
     */
    public double getWidth() 
    {
        return width;
    }

    
    /**
     * Método público que toma un valor tipo double y establece el valor del 
     * atributo longitud, pues este es privado.
     *
     * @return Toma un valor tipo double y lo asigna al atributo lenght.
     */
    public void setWidth(double width) 
    {
        this.width = width;
    }
    

    
    /**
     * Método público implementado de la clase Shape. Este método
     * escribe todos los datos del rectángulo en un archivo que nosotros
     * designamos.
     *
     * @param out Valor tipo PrintWriter. Archivo de salida de los datos.
     */
    @Override
    public void print(PrintWriter out) 
    {
       
        super.print(out);
        out.write("\n Area = " + this.getArea()+ "\r\n");
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Is Square? = " + this.isSquare()+ "\r\n");;
        out.write("\n\n\n");
        
    }

    
    
    /**
     * Método público implementado de la clase TwoDimensionalShape. Este método
     * calcula y devuelve el valor del área del rectángulo.
     *
     * @return Valor tipo double que se corresponde con el área del rectángulo.
     */
    @Override
    public double getArea() 
    {
        return this.length * this.width;
    }
    
    

    /**
     * Método público implementado de la clase TwoDimensionalShape. Este método
     * calcula y devuelve el valor del perímetro del rectángulo.
     *
     * @return Valor tipo double que se corresponde con el perímetro del
     * rectángulo.
     */
    @Override
    public double getPerimeter() 
    {
        return 2 * (this.length + this.width);
    }
    
    
    
    /**
     * Método público que determina si el rectángulo es un cuadrado, compara 
     * el valor de los lados del rectángulo, en caso que ambos lados sean 
     * devuelve un true iguales.
     * @return Devuelve un boolean en funcion de la comparación de los lados.
     */
    public boolean  isSquare()
    {
        if(this.length == this.width)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     
}

