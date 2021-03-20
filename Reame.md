
># Readme Shaped Generator
>## Bienvenidos a la aplicacion de Figuras Geométricas    

Shaped Generator es una aplicacion que nos permite generar y gestionar distintas figuras geométricas. Tambien nos permite guardar las distintas gestiones que podemos realizar en un archivo txt.

El proyecto ha sido desarrollado en lenguaje JAVA con el entorno de desarrollo NetBeans.


### 1. Instalación.

 Para ello debemos ingresar la dirección de GitHub. Una vez dentro de la página del proyecto solo tenemos que descargarnos el paquete con el proyecto. Esto se hace en la sección Code, dentro del menú que se despliega seleccionamos Download y guardamos el archivo zip.

<p align ="center">
 <image src="Images/Download.png"></image>
 </p>


Solo hay que descargar el paquete de los archivos y descomprimir la carpeta. Solo hay que descomprimir el contenido del directorio Juego dentro del directorio donde deseas almacenar el programa.

### 2. Ejecución

Para que se pueda ejecutar el programa, puesto que nuestros conocimientos no llegan, todavía, a la realización de archivos ejecutables en el sistema operativo, es necesario utilizar la consola de comandos de Windows para compilar los archivos y poder ejecutarlos.

Para ello basta con pulsar el boton de inicio de windows y escribir sobre el "cmd", con ello aparecerá un menu donde ofrecera la aplicación de la consola de comandos.

<p align ="center">
 <image src="Images/cmd.png"></image>
 </p>

Para ello una vez en la consola de comandos, debemos ejecutar los siguientes comandos, dentro del directorio donde estan los archivos .java: 

 `Figuras\src\main\java\rafaelmartinez\proyectogithub`

`c:\Directorio programa\Javac Shape.java`
`c:\Directorio programa\Javac TwoDimensionalShape.java`
`c:\Directorio programa\Javac ThreeDimensionalShape.java`
`c:\Directorio programa\Javac Point.java`
`c:\Directorio programa\Javac circle.java`
`c:\Directorio programa\Javac rectangle.java`
`c:\Directorio programa\Javac triangle.java`
`c:\Directorio programa\Javac Sphere.java`
`c:\Directorio programa\Javac Cone.java`
`c:\Directorio programa\Javac Cylinder.java`
`c:\Directorio programa\Javac Cube.java`
`c:\Directorio programa\Javac PrincipalApp.java`

Una vez que tenemos los archivos compilados, tendrán el mismo nombre que los anteriores pero la extensión cambiaran por .class.

Ya solo tenemos que ejecutarlo:

    `c:\Directorio programa\Java PrincipalApp`

Ahora a disfrutarlo. Aunque no vamos a tener ningun tipo de feedback desde la consola de comandos.

La forma mas satisfactoria de usarlo en con el entorno de desarrollo, pues nos permite modifcar datos. En caso de hacerlo correr desde el Entorno de desarrollo, antes debemos configurar el archivo que vamos a utilizar como salida de este programa.
Para ello tenemos que seleccionar la clase principal e irnos al menu Run, donde debemos seleccionar el menu Set Project Configuration y Customize.

<p align ="center">
 <image src="Images/SetProject.png"></image>
 </p>



Dentro de este aparece otro menú donde podremos seleccionar el archivo de salida donde se escribirá el resultado de nuestro programa:

<p align ="center">
 <image src="Images/SetProjectProperties.png"></image>
 </p>

### 3. Instrucciones de uso

Tal y como hemos indicado en la introduccion ShapeGenerator, es una aplicacion que genera una serie de figuras geométricas y que además permite realizar una serie de gestiones con ellas. 
Para ello debemos realizarlo dentro del entorno de desarrollo. Tan solo tenemos que modificar los datos que deseamos y ejecutamos la main class.

Recordar que el resultado estara escrito en el archivo que hayamos configurado.



### 3 . FAQ

Javac no se reconoce como un programa externo o interno, programa o archivo.

<p align ="center">
 <image src="Images/fallo.png"></image>
 </p>

 

Así mismo, una de las causas por las que javac no se reconoce como archivo interno o externo, es precisamente no tener instalado el programa Java JDK, lo primero que tienes que hacer es instalarlo desde Google y luego manipular los comandos que a continuación te explicaré:

 

Paso 1: Una vez que tengas descargado e instalado el programa, vas a abrir la ventana de comandos presionando las teclas “Windows + R”

 

Paso 2: Una vez abierta la ventana de comandos vas a proceder a escribir “Java” para abrir todas las configuraciones que necesitas.

 

Paso 3: Vas a ir directo a la unidad y verificar en cuál de todas las rutas es la que instalaste el programa Java JDK y la vas a copiar.

 

Paso 4: Una vez hecho esto, vas a ir directo a la interfaz gráfica y buscar “Mi pc”,vas a dar clic derecho y seleccionar “Propiedades”

 

Paso 5: Dentro de las opciones que te aparecen aquí, vas a proceder a buscar una que diga  si tienes Windows 7 “Configuración avanzada del sistema” y le daremos clic luego a “Variables del entorno”.

<p align ="center">
 <image src="Images/entornovariable.png"></image>
 </p>


Paso 6: Se abrirá una ventana con varios códigos o variables, y vas a darle clic a la fila que diga “Path” y presionaras “Editar”.

<p align ="center">
 <image src="Images/entornovariable2.png"></image>
 </p>
 

Paso 7: Una vez aquí, vas a proceder a pegar la ruta que habías copiado en la pestaña de comandos en el campo del valor de la variable.

<p align ="center">
 <image src="Images/path.png"></image>
 </p>

 

Paso 8: Ya sólo queda cerrar la ventana de comandos donde el Java presentaba el error y reiniciar el programa, ya debería haberse solucionado.






