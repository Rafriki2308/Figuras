/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelmartinez.proyectogithub;

import java.io.PrintWriter;

/**
 * Clase que construye la figura geométrica esfera. Contiene todo lo necesario
 * para construir dicha esfera.
 *
 * @author Rafel Martínez
 */
public class Sphere extends ThreeDimensionalShape {

    //Declaración de variable privada tipo double se corresponden con el 
    //el radio de la figura.
    double radius;

    /**
     * Constructor completo, que generará una esfera. Como valor toma un parámetro 
     * de tipo double que corresponden al radio de la de la figura.
     *
     * @param radius Valor tipo double que correspondera al radio de la figura.
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor que toma una esfera y la duplica. Genera una esfera nueva
     * clonando los datos de la esfera que le facilitamos.
     *
     * @param sp Objeto tipo esfera de la que obtenemos el atributos a clonar.
     */
    public Sphere(Sphere sp) {
        this.radius = sp.radius;
    }

    /**
     * Método público que devuelve el valor del atributo radio de la esfera,
     * pues este es privado.
     *
     * @return Devuelve el valor tipo double del atributo radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Método público que permite modificar el valor del radio de la esfera.
     *
     * @param radius El nuevo valor tipo double con el que deseamos modificar el
     * atributo radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Método público implementado de la clase ThreeDimensionalShape. Este
     * método calcula y devuelve el valor de la superficie de la esfera.
     *
     * @return Valor tipo double que se corresponde con el valor de la
     * superficie de la esfera.
     */
    @Override
    public double getSurfaceArea() {

        return 4 * Math.PI * Math.pow(this.radius, 2.0);

    }

    /**
     * Método público implementado de la clase ThreeDimensionalShape. Este
     * método calcula y devuelve el valor del volumen de la esfera.
     *
     * @return Valor tipo double que se corresponde con el volumen de la esfera.
     */
    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(this.radius, 3.0)) / 3;
    }

    /**
     * Método público implementado de la clase Shape. Este método escribe todos
     * los datos de la esfera en un archivo que nosotros designamos.
     *
     * @param out Valor tipo PrintWriter. Archivo de salida de los datos.
     */
    @Override
    public void print(PrintWriter out) {

        super.print(out);
        out.write("\n Radius = " + this.getRadius() + "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea() + "\r\n");
        out.write("\n Volume = " + this.getVolume() + "\r\n");
        out.write("\n\n\n");

    }

}
