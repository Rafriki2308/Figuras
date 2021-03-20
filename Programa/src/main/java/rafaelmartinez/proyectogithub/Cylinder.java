/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelmartinez.proyectogithub;

import java.io.PrintWriter;

/**
 * Clase que construye la figura geométrica cilindro. Contiene todo lo necesario
 * para construir dicho cilindro.
 *
 * @author Rafel Martínez
 */
public class Cylinder extends ThreeDimensionalShape {

    //Declaración de variables privadas tipo double se corresponden con la 
    //altura del cilindro y con el radio de la base.
    double radius, height;

    /**
     * Constructor completo, que generará un cilindro. Como datos toma un valor
     * de tipo double que corresponden a la altura del cilindro y al radio de la
     * base.
     *
     * @param radius Valor tipo double que corresponderá al radio de la base.
     * @param height Valor tipo double que corresponderá a la altura.
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Constructor que toma un cilindro y lo duplica. Genera un cilindro nuevo
     * clonando los valores del cilindro que le facilitamos.
     *
     * @param cyl Objeto tipo cilindro del que obtenemos los atributos a clonar.
     */
    public Cylinder(Cylinder cyl) {
        this.radius = cyl.radius;
        this.height = cyl.height;
    }

    /**
     * Método público que devuelve el valor del atributo radio de la base del
     * clindro, pues este es privado.
     *
     * @return Devuelve el valor tipo double del atributo radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Método público que permite modificar el valor del radio de la base del
     * cilindro.
     *
     * @param radius El nuevo valor tipo double con el que deseamos modificar el
     * atributo radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Método público que devuelve el valor del atributo altura del cilindro,
     * pues este es privado.
     *
     * @return Devuelve el valor tipo double que corresponde al atributo height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Método público que toma un valor tipo double y establece el valor del
     * atributo altura, pues este es privado.
     *
     * @param height Toma un valor tipo double y lo asigna al atributo height.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Método público implementado de la clase ThreeDimensionalShape. Este
     * método calcula y devuelve el valor de la superficie del cilindro.
     *
     * @return Valor tipo double que se corresponde con el valor de la
     * superficie del cilindro.
     */
    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * this.radius * this.height;
    }

    /**
     * Método público implementado de la clase ThreeDimensionalShape. Este
     * método calcula y devuelve el valor del volumen del cilindro.
     *
     * @return Valor tipo double que se corresponde con el volumen del cilindro.
     */
    @Override
    public double getVolume() {
        return Math.PI * Math.pow(this.radius, 2.0) * this.height;
    }

    /**
     * Método público implementado de la clase Shape. Este método escribe todos
     * los datos del cubo en un archivo que nosotros designamos.
     *
     * @param out Valor tipo PrintWriter. Archivo de salida de los datos.
     */
    @Override
    public void print(PrintWriter out) {

        super.print(out);
        out.write("\n Radius = " + this.getRadius() + "\r\n");
        out.write("\n Height = " + this.getHeight() + "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea() + "\r\n");;
        out.write("\n Volume = " + this.getVolume() + "\r\n");
        out.write("\n\n\n");

    }

}
