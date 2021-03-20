
package rafaelmartinez.proyectogithub;

/**
 *
 * @author Rafael Martinez
 */
abstract  class TwoDimensionalShape extends Shape{
    
  
   /**
     /**Metodo abstracto que devuelve un valor double que se corresponde
    * con el calculo del perímetro de la figura geometrica y que obliga
    * a la clase que lo implementa a sobreescribir dicho metodo
    * @return Valor del perimetro de la figura geometrica
    */
    
   public double getPerimeter()
   {
        return 0 ;
   }
    
   /**Metodo abstracto que devuelve un valor double que se corresponde
    * con el calculo del area de la figura geometrica y que obliga
    * a la clase que lo implementa a sobreescribir dicho metodo
    * @return Valor del area de la figura geometrica
    */
   public double getArea()
   {
        return 0;
   }


}
