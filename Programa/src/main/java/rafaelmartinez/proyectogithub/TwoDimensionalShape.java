
package rafaelmartinez.proyectogithub;

/**
 *Clase abstracta que hereda de Shape y que define a las figuras 
 * geométricas de dos dimensiones, por tanto continen todo lo necesario que las 
 * figuras geométricas de dos dimensiones tienen que implementar. 
 * @author Rafael Martinez
 */


public abstract  class TwoDimensionalShape extends Shape{
    
  
    /**Método abstracto que las las formas geométricas inferiores deben de 
    * de implementar y sobreescribir que devolvera un valor double 
    * que se correspondesponderá con el calculo del perímetro de la figura 
    * geométrica cuando se implmente. 
    * @return Valor que se devuelve dependera de la implementación de las clases
    * hijas
    */
    
   abstract public double getPerimeter();
   
    
   /**Método abstracto que las las formas geométricas inferiores deben de 
    * de implementar y sobreescribir que devolverá un valor double 
    * que se correspondesponderá con el calculo del área de la figura 
    * geométrica cuando se implmente. 
    * @return Valor que se devuelve dependerá de la implementación de las clases
    * hijas
    */
   abstract public double getArea();
   


}
