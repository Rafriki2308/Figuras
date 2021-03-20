/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelmartinez.proyectogithub;

import java.io.PrintWriter;

/**
 * Clase que se encarga de definir puntos y gestionarlos en el espacio euclídeo
 * en dos dimensiones.
 *
 * @author Rafael Martínez
 */
public class Point {

    //Declaración de variables privadas de tipo double que representan las 
    //coordenadas.
    private double x;
    private double y;

    /**
     * Constructor público por defecto que define el punto de referencia en el
     * espacio euclídeo de dos dimensiones.
     */
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * Constructor completo que toma dos valores tipo double y que definen un
     * punto en el espacio euclídeo de dos dimensiones.
     *
     * @param x Valor tipo double que corresponderá a un punto de la coordenada
     * @param y Valor tipo double que corresponderá a un punto de la coordenada
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor que toma un objeto tipo Point y define otro punto en el
     * espacio euclídeo en la misma posición.
     *
     * @param pnt Valor tipo Point que de cuyos atributos utilizará el
     * constructor para definir un punto nuevo.
     */
    public Point(Point pnt) {
        this.x = pnt.x;
        this.y = pnt.y;
    }

    /**
     * Método público que devuelve la coordenada X del punto en el espacio
     * euclídeo.
     *
     * @return Valor double que corresponde al atributo x, que es privado.
     */
    public double getX() {
        return x;
    }

    /**
     * Método público que modifica el valor de la coordenada X que define el
     * punto en el espacio euclídeo de dos dimensiones.
     *
     * @param x Valor double que corresponderá al valor del atributo x.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Método público que devuelve la coordenada y del punto en el espacio
     * euclídeo.
     *
     * @return Valor double que corresponde con el atributo y.
     *
     */
    public double getY() {
        return y;
    }

    /**
     * Método público que modifica el valor de la coordenada y que define el
     * punto en el espacio euclídeo de dos dimensiones.
     *
     * @param y Valor double que corresponderá al valor del atributo y.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Método público que calcula la distancia entre el objeto punto creado y
     * otro objeto punto que le facilitamos al metodo.
     *
     * @param p Objeto tipo punto del que queremos obtener la distancia
     * @return Valor tipo double que se corresponde con la distancia deseada.
     */
    public double distance(Point p) {
        return Math.sqrt(((this.x - p.x) * (this.x - p.x)) + ((this.y - p.y) * (this.y - p.y)));

    }

    /**
     * Método público implementado de la clase Shape. Este método escribe todos
     * los datos del cono en un archivo que nosotros designamos.
     *
     * @param out Valor tipo PrintWriter. Archivo de salida de los datos.
     */
    public void print(PrintWriter out) {

        out.write("\n Point Data => ");
        out.write("\nPrint Data = x = " + x + " y = " + y);
        out.write("\n\n\n");;
    }

}
