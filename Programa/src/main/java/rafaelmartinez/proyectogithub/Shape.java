/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rafaelmartinez.proyectogithub;

import java.io.PrintWriter;

/**
 *Clase Abstracta que definen a todo tipo de figuras geométricas. No se puede
 * instanciar.
 * @author Rafael Martínez
 */
public abstract class Shape {
    
  
    /**
     * Metodo que heredaran las figuras geométricas, donde toma un archivo
     * externo para poder dar las salidas del programa en dicho archivo.
     * 
     * @param out Archivo externo donde escribir los resultados.
     */
    
    public void print(PrintWriter out) {
  
   }
   
}