
package rafaelmartinez.proyectogithub;

/**
 *Clase abstracta que hereda de Formas geometricas y que define a las figuras 
 * geometricas de dos dimensiones, por tanto continen todo lo necesario que las 
 * figuras geométricas de dos dimensiones tienen que implementar. 
 * @author Rafael Martinez
 */


abstract  class TwoDimensionalShape extends Shape{
    
  
    /**Metodo abstracto que las las formas geometricas inferiores deben de 
    * de implementar y sobreescribir que devolvera un valor double 
    * que se correspondesponderá con el calculo del perímetro de la figura 
    * geometrica cuando se implmente. 
    */
    
   abstract public double getPerimeter();
   
    
   /**Metodo abstracto que las las formas geometricas inferiores deben de 
    * de implementar y sobreescribir que devolvera un valor double 
    * que se correspondesponderá con el calculo del área de la figura 
    * geométrica cuando se implmente. 
    */
   abstract public double getArea();
   


}
