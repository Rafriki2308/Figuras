package rafaelmartinez.proyectogithub;

import java.io.PrintWriter;

/**
 * Clase que construye la figura geométrica circulo. Contiene todo lo necesario
 * para construir y ubicar un circulo en el espacio euclideo de dos dimensiones.
 *
 * @author Rafel Martinez
 */
public class Circle extends TwoDimensionalShape {

    // Declaracion de atributos privados radio y centro, tipo double 
    //y tipo Point
    private double radius;
    private Point center;

    /**
     * Constructor completo, que generará el circulo y lo posiciona en el
     * espacio euclideo. Como datos toma el espacio euclideo como un objeto tipo
     * Point, que seran coordenadas y un double que marcará el radio.
     *
     * @param center Objeto tipo Point con la posicion del círculo.
     * @param radius Valor tipo double correspondiente al radio del círculo.
     */
    public Circle(Point center, double radius) {
        this.radius = radius;
        this.center = center;
    }

    /**
     * Constructor que toma un circulo y lo duplica. Genera un circulo nuevo
     * clonando los datos del circulo que le facilitamos.
     *
     * @param circle Objeto tipo círculo que deseamos clonar.
     */
    public Circle(Circle circle) {
        this.radius = circle.radius;
        this.center = circle.center;
    }

    /**
     * Método público que devuelve el valor del atributo radio, pues este es
     * privado.
     *
     * @return Devuelve el valor tipo double del atributo radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Método público que permite modificar el valor del radio del círculo.
     *
     * @param radius El nuevo valor tipo double con el que deseamos modificar el
     * atributo radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Método público que devuelve la posicion en el espacion euclideo del
     * círculo.
     *
     * @return Valor tipo Point que corresponde con las coordenadas del círculo.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Método público que permite modificar la posicion del centro del círculo
     * en el espacio euclideo.
     *
     * @param center Valor tipo Point que modifica el atributo center.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Método público implementado de la clase Shape. Este método escribe todos
     * los datos del círculo en un archivo que nosotros designamos.
     *
     * @param out Valor tipo PrintWriter. Archivo de salida de los datos.
     */
    @Override
    public void print(PrintWriter out) {
        super.print(out);
        out.write("\n Cirle: " + "\r\n");
        out.print("\n Center = " + this.center.getX() + " " + this.center.getY() + "\r\n");
        out.write("\n Area = " + this.getArea() + "\r\n");;
        out.write("\n Perimeter = " + this.getPerimeter() + "\r\n");
        out.write("\n Radious = " + this.getRadius() + "\r\n");;
        out.write("\n\n\n");
    }

    /**
     * Método público implementado de la clase TwoDimensionalShape. Este método
     * calcula y devuelve el valor del área del círculo.
     *
     * @return Valor tipo double que se corresponde con el área del círculo.
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2.0);
    }

    /**
     * Método público implementado de la clase TwoDimensionalShape. Este método
     * calcula y devuelve el valor del perímetro del círculo.
     *
     * @return Valor tipo double que se corresponde con el perímetro del
     * círculo.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

}
