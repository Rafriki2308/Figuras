/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelmartinez.proyectogithub;

import java.io.PrintWriter;

/**
 * Clase que construye la figura geométrica Cono. Contiene todo lo necesario
 * para construir dicho Cono.
 *
 * @author Rafel Martínez
 */
public class Cone extends ThreeDimensionalShape {

    //Declaración de variables privadas tipo double se corresponde
    //con el radio de la base y la altura del cono.
    private double radius;
    private double height;

    /**
     * Constructor completo, que generara un cono. Como datos toma dos valores
     * de tipo double que corresponden al radio de la base y a la altura de
     * dicho cono.
     *
     * @param radius Valor tipo double que será asignado al atributo radius.
     * @param height Valor tipo double que será asgingado al atributo altura.
     */
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Constructor que toma un cono y lo duplica. Genera un cono nuevo clonando
     * los valores del cono que le facilitamos.
     *
     * @param con Objeto tipo cono del que obtenemos los atributos a clonar.
     */
    public Cone(Cone con) {
        this.radius = con.radius;
        this.height = con.height;
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
     * Método público que permite modificar el valor del radio de la base del
     * objeto cono.
     *
     * @param radius El nuevo valor tipo double con el que deseamos modificar el
     * atributo radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Método público que devuelve el valor del atributo altura del cono, pues
     * este es privado.
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
     * Metodo público implementado de la clase ThreeDimensionalShape. Este
     * método calcula y devuelve el valor de la superficie del cono.
     *
     * @return Valor tipo double que se corresponde con el valor de la
     * superficie del cono.
     */
    @Override
    public double getSurfaceArea() {

        return (Math.PI * Math.pow(this.radius, 2.0) * this.height) / 3;
    }

    /**
     * Método público implementado de la clase ThreeDimensionalShape. Este
     * método calcula y devuelve el valor del volumen del cono.
     *
     * @return Valor tipo double que se corresponde con el volumen del cono.
     */
    @Override
    public double getVolume() {

        return (Math.PI * (this.radius)) * (this.radius + Math.sqrt(Math.pow(this.radius, 2.0) + (this.height * this.height)));

    }

    /**
     * Método público implementado de la clase Shape. Este método escribe todos
     * los datos del cono en un archivo que nosotros designamos.
     *
     * @param out Valor tipo PrintWriter. Archivo de salida de los datos.
     */
    @Override
    public void print(PrintWriter out) {
        super.print(out);
        out.write("\n Radius  = " + this.getRadius() + "\r\n");
        out.write("\n Height  = " + this.getHeight() + "\r\n");
        out.write("\n  Surface  Area = " + this.getVolume() + "\r\n");
        out.write("\n  Volume  = " + this.getSurfaceArea() + "\r\n");
        out.write("\n\n\n");
    }

}
