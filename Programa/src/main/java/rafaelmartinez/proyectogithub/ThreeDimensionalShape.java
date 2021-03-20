
package rafaelmartinez.proyectogithub;

/**
 *Clase abstracta que hereda de Formas geometricas y que define a las figuras 
 * geometricas de tres dimensiones, por tanto continen todo lo necesario que las 
 * figuras geométricas de tres dimensiones tienen que implementar. 
 * @author Rafael Martinez
 */
abstract class ThreeDimensionalShape extends Shape{
 
    /**Metodo abstracto que las las formas geometricas inferiores deben de 
    * de implementar y sobreescribir que devolvera un valor double 
    * que se correspondesponderá con el calculo del Area de la superficie total
    * de la figura geométrica cuando se implmente. 
    */
    abstract public double getSurfaceArea();
    
    
    
    /**Metodo abstracto que las las formas geometricas inferiores deben de 
    * de implementar y sobreescribir que devolvera un valor double 
    * que se correspondesponderá con el calculo del Volumen total
    * de la figura geométrica cuando se implmente. 
    */
    abstract public double getVolume();
    
    
}
