
package rafaelmartinez.proyectogithub;

/**
 *Clase abstracta que hereda de Shape y que define a las figuras 
 * geométricas de tres dimensiones, por tanto continen todo lo necesario que las 
 * figuras geometricas de tres dimensiones tienen que implementar. 
 * @author Rafael Martínez
 */
public abstract class ThreeDimensionalShape extends Shape{
 
    /**Método abstracto que las las formas geométricas inferiores deben de 
    * de implementar y sobreescribir, que devolverá un valor double 
    * que se correspondesponderá con el calculo del Area de la superficie total
    * de la figura geométrica cuando se implmente. 
    * 
    * @return Valor que devuelve dependerá de la implementacion de las clases
    * hijas
    */
    abstract public double getSurfaceArea();
    
    
    
    /**Método abstracto, que las las formas geometricas inferiores deben de 
    * de implementar y sobreescribir, que devolvera un valor double 
    * que se correspondesponderá con el calculo del Volumen total
    * de la figura geométrica cuando se implmente. 
    * 
    * @return Valor que devuelve dependerá de la implementacion de las clases
    * hijas
    */
    abstract public double getVolume();
    
    
}
