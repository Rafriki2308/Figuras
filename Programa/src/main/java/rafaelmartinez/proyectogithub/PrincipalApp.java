/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelmartinez.proyectogithub;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Clase donde se desarrolla la aplicación principal del proyecto figuras
 * geométricas.
 * @author Rafael Martínez.
 */
public class PrincipalApp {
    /**
     * Método principal que hace uso de las clases y metodos para generar y 
     * gestionar distintas figuras geométricas.
     * @param args Vacio
     */
    public static void main(String args[]) {
        
        try {
            
            //Se crea un objeto PrinterWriter, que nos permite imprimir datos
            //en un archivo
            PrintWriter out = new PrintWriter (new FileWriter(args[0]));
            //Se crear un Array listt de 30 elementos que guarda las 
            //figuras geometricas que creamos.
            ArrayList <Shape> myShapes = new ArrayList<Shape> (30);

            //Seccion donde creamos puntos en el campo euclideo
            Point pt1 = new Point(1,1);
            Point pt2 = new Point(5,8);
            Point pt3;//Aqui solo declaramos un objeto tipo Point
            Point pt4 = new Point();

            //Sección donde se crean 3 triangulos
            Triangle triangle_1 = new Triangle(pt1, pt2, new Point(10, 4));
            pt1.setX(2);
            pt1.setY(2);
            pt2 = new Point(2, 8);
            pt3 = new Point(12, 2);
            Triangle triangle_2 = new Triangle(pt1, pt2, pt3);
            //Se instancia el constructor que clona triangulos.
            Triangle triangle_3 = new Triangle(triangle_2);  

            //Cambiamos el valor del vertice numero 2
            triangle_2.setPoint2(new Point(5,8));
            //Añadimos los triangulos al Array List
            myShapes.add(triangle_1);
            myShapes.add(triangle_2);
            myShapes.add(triangle_3);

            //Seccion de creacion de circulos
            Circle circle_1, circle_2, circle_3;
            circle_1 = new Circle(pt1, 4);
            circle_2 = new Circle(pt2, 12);
            //Invoca constructor que clona figuras
            circle_3 = new Circle(circle_2);
            //Se aplica el metodo para modificar el radio del circulo
            circle_3.setRadius(5);
            //Añade los tres circulos al Array List
            myShapes.add(circle_1);
            myShapes.add(circle_2);
            myShapes.add(circle_3);

            //Seccion de creación de rectángulos
            Rectangle r1, r2, r3;
            r1 = new Rectangle(10, 3);
            r2 = new Rectangle(20, 4);
            r1.setWidth(3);
            r2.setHeight(10);
            //Invoca constructor que clona figuras
            r3 = new Rectangle(r2);
            //Metodo que modifica la altura del rectángulo
            r3.setHeight(100);
            //Añade los tres rectangulos al Array List
            myShapes.add(r1);
            myShapes.add(r2);
            myShapes.add(r3);

            //Seccion de creación de Esferas
            Sphere sphere_1, sphere_2, sphere_3;
            sphere_1 = new Sphere(4);
            sphere_2 = new Sphere(12);
            //Invoca constructor que clona figuras
            sphere_3 = new Sphere(sphere_1);
            //Método que modifica el radio de la esfera      
            sphere_3.setRadius(5);
            //Añade las tres esferas al Array List
            myShapes.add(sphere_1);
            myShapes.add(sphere_2);
            myShapes.add(sphere_3);
            
            //Sección de creación de cubos
            Cube cube_1, cube_2, cube_3;
            cube_1 = new Cube(4);
            cube_2 = new Cube(12);
            //Invoca constructor que clona figuras
            cube_3 = new Cube(cube_1);
            //Metodo que modifica la longitud del lado
            cube_3.setSideLength(5);
            //Añade los tres cubos al Array List
            myShapes.add(cube_1);
            myShapes.add(cube_2);
            myShapes.add(cube_3);
            
            //Seccion de creacion de cilindros
            Cylinder cy1, cy2, cy3;
            cy1 = new Cylinder(4, 10);
            cy2 = new Cylinder(7, 12);
            //Invoca constructor que clona figuras
            cy3 = new Cylinder(cy2);
            //Metodos que modifican el radio de la base y la altura
            cy3.setHeight(15);
            cy3.setRadius(10);
            //Añade los tres cilindros al Array List
            myShapes.add(cy1);
            myShapes.add(cy2);
            myShapes.add(cy3);

            //Seccion de creación de conos
            Cone cone_1, cone_2, cone_3;
            cone_1 = new Cone(4, 10);
            cone_2 = new Cone(7, 12);
            //Invoca constructor que clona figuras
            cone_3 = new Cone(cone_1);
            //Métodos que modifican la altura del cono y el radio de la base
            cone_3.setHeight(15);
            cone_3.setRadius(10);
            myShapes.add(cone_1);
            myShapes.add(cone_2);
            myShapes.add(cone_3);

            //For eficaz para recorre el Array List
            for (Shape s: myShapes) {  
                out.println(s.getClass().getName());  
                s.print(out);             
                out.println();
            }
            out.close();
        }  
        
        //Lanza una excepcion en caso de error.
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }  
    } 
}  
