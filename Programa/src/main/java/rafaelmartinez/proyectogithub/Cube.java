/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelmartinez.proyectogithub;

import java.io.PrintWriter;

/**
 * Clase que construye la figura geométrica Cubo. Contiene todo lo necesario
 * para construir dicho Cubo.
 *
 * @author Rafel Martinez
 */
class Cube extends ThreeDimensionalShape {
    //Declaracion de variable privada tipo double se corresponde la longitud
    //del lado del cubo.

    double length;

    /**
     * Constructor completo, que generará un cono. Como datos toma un datos de
     * tipo double que corresponden a la longitud del lado del cubo.
     *
     * @param length Valor de tipo double que se coresponderá con la longitud
     * del lado del cubo.
     */
    public Cube(double length) {
        this.length = length;
    }

    /**
     * Constructor que toma un cubo y lo duplica. Genera un cubo nuevo clonando
     * los datos del cubo que le facilitamos.
     *
     * @param con Objeto tipo cubo del que obtenemos los atributos a clonar.
     */
    public Cube(Cube cube) {
        this.length = cube.length;
    }

    /**
     * Método público que devuelve el valor del atributo longitud del lado del
     * cubo, pues este es privado.
     *
     * @return Devuelve el valor tipo double que corresponde al atributo lenght.
     */
    public double getLength() {
        return length;
    }

    /**
     * Método público que toma un valor tipo double y establece el valor del
     * atributo longitud de lado, pues este es privado.
     *
     * @return Toma un valor tipo double y lo asigna al atributo length.
     */
    public void setSideLength(double length) {
        this.length = length;
    }

    /**
     * Método público implementado de la clase ThreeDimensionalShape. Este
     * método calcula y devuelve el valor de la superficie del cubo.
     *
     * @return Valor tipo double que se corresponde con el valor de la
     * superficie del cubo.
     */
    @Override
    public double getSurfaceArea() {
        return 6 * this.length * this.length;
    }

    /**
     * Método público implementado de la clase ThreeDimensionalShape. Este
     * método calcula y devuelve el valor del volumen del cubo.
     *
     * @return Valor tipo double que se corresponde con el volumen del cubo.
     */
    @Override
    public double getVolume() {
        return this.length * this.length * this.length;
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
        out.write("\n Side  Length = " + this.getLength() + "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea() + "\r\n");
        out.write("\n Volume = " + this.getVolume() + "\r\n");;
        out.write("\n\n\n");

    }

}
